'''This version uses list of Pairs, not a map.'''
import tempfile
import gensim
import gensim.models.tfidfmodel
from corpus import *

class TfidfModel():
    def __init__(self,docs):
     if docs is not None:
        self.corp = Corpus()
        self.docs = docs
        self.train_on_docs(self.docs)

    def train_on_docs(self,docs):
        print("Training of docs!",len(docs))
        tokens = self.corp.build_corpus(docs)
        words = self.corp.get_words()
        # pass it tokens instead of words to print sorted dictionary
        dictionary = gensim.corpora.Dictionary([words])
        self.dictionary = dictionary
        # get the corpus from the IR model and convert to bag-of-words
        corpus = [dictionary.doc2bow(doc) for doc in self.corp.get_corpus() if doc is not None]
        self.corpus = corpus
        print("Making a TFIDF Model")
        tfidf = gensim.models.tfidfmodel.TfidfModel(corpus)
        self.tfidf = tfidf
        print("Making a TFIDF Corpus")
        tfidfcorp = [tfidf[doc] for doc in corpus]
        print("Making a similarity index")
        # Compute cosine similarity against a corpus of docs by storing index matrix in memory.
        index = similarities.MatrixSimilarity(tfidf[corpus], num_features = dictionary.num_pos)
        self.index = index

    def print_dict(self,sorted_dict):
        for doc in sorted_dict:
            print(doc.get_filename(), "  " ,sorted_dict[doc])

    def test_on_query_docs_pairs(self,querydocs,pairs):
        print("Testing Model!!")
        ranks = []
        for querydoc in querydocs:
            lines_added = querydoc.get_lines_added()
            tokens = self.corp.process_document(querydoc)
            query_vector = [self.dictionary.doc2bow(tokens)] #for token in tokens]
            sorted_dict = self.calculate_similarity(query_vector)
            #self.print_dict(sorted_dict)
            for pair in pairs:
                #substr = ("_".join(querydoc.get_filename().split("_", 2)[:2]))#temp[0]+"_"+temp[1]
                if (os.path.basename(querydoc.get_filename())==pair.get_fileName()):
                    expected_match = pair.get_status()
                    rank = self.calculate_reciprocal_rank(sorted_dict,expected_match)
                    ranks.append(rank)
                    break
        return self.calculate_MRR(ranks)

    def train_doc_commits(self):
        doc_list = []
        for doc in self.docs:
            doc_list.append(doc.get_filename())
        return doc_list

    def calculate_similarity(self,query_vector):
        sim = self.index[self.tfidf[query_vector]]
        traindocs = self.corp.get_documents()
        simdict = {}     # create dict, numpy obj not iterable
        if len(traindocs) == len(sim[0]):
            for i in range(len(sim[0])):
                match = traindocs[i]         #.get_identifier()
                simdict[match] = sim[0][i]   #simdict[key]=value
            sorted_dict = collections.OrderedDict(sorted(simdict.items(),key=lambda kv: kv[1],reverse=True))
        return sorted_dict

    def calculate_reciprocal_rank(self,sorted_dict,expected_match):
        reciprocal_rank = 0
        # Where is the querydoc located in the map? Get its index
        # Which doc in the sorted_dict matches querydoc
        ### for exp_commit in expected_matches:
        for doc in sorted_dict:
            if expected_match == doc.get_status():
                return 1/(list(sorted_dict.keys()).index(doc)+1)
        return reciprocal_rank

    def calculate_MRR(self,ranks):
        print("Length of rank list ", len(ranks))
        print("Number of times Rank 0: ",ranks.count(0))
        if ranks is not None:
            return sum(ranks)/len(ranks)
