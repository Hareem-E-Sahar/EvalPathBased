import os, json
import gensim
from nltk import ngrams
from gensim.parsing.preprocessing import remove_stopwords
from gensim import similarities #,corpora, models,
from gensim.utils import simple_preprocess
from gensim.parsing.porter import PorterStemmer

import collections

class Corpus():
    def init(self):
        self.documents = list()
        self.corpus = list()

    def stem_it(self,src):
        tokens=[]
        porterStemmer = PorterStemmer()
        for word in src:
            tokens.append(porterStemmer.stem(word))
        return tokens

    def retrieve_ngrams(self,src,n):
        #src = remove_stopwords(src)
        tokens = []
        src_ngrams = ngrams((simple_preprocess(src)), n)
        for grams in src_ngrams:
            tokens.append(" ".join(grams)) #space join
        return tokens

    def process_document(self, document):
        lines_added = document.get_lines_added()
        lines_added = "".join(lines_added)
        tokens = self.retrieve_ngrams(lines_added,3)
        return tokens

    def build_corpus(self,documents):
        self.documents = documents
        self.corpus = [self.process_document(document) for document in documents]
        return self.corpus

    def get_corpus(self):
        return self.corpus

    def get_documents(self):
        return self.documents

    def get_words(self):
        out = set()
        for words in self.corpus:
            out.update( words )
        return out

    def list_full_paths(self,directory):
        return [os.path.join(directory, file) for file in os.listdir(directory)]

    def read_files(self,path,bins,pairs):
        doclist = []
        filenames = []
        for bin in bins:
            dirfiles = self.list_full_paths(path+bin)
            filenames = filenames + dirfiles
        for file_name in filenames:
            with open(file_name) as content_file:
                src = content_file.read()  #complete json
                for pair in pairs:
                    if pair.get_fileName() == os.path.basename(file_name):
                        doclist.append(Document(src,file_name,pair.get_status()))
                        break
        return(doclist)

class Document():
    def __init__(self,added=None,file=None,buggy=None):
        self.lines_added = added,
        self.javafile = file
        self.buggy = buggy

    #def list_full_paths(self,directory):
    #def read_files(self,path,bins,pairs):

    def get_document(self):
        return Document(self.lines_added)

    def get_lines_added(self):
        return self.lines_added

    def get_filename(self):
        return self.javafile

    def get_status(self):
        return self.buggy
