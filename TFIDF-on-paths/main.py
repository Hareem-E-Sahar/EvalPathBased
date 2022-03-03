from corpus import *
from model import *
import csv

class Revision():
    def __init__(self, commitHash=None,newPath=None,changeType=None,timestamp=None,status=None,fileName=None):
        self.commitHash = commitHash
        self.newPath = newPath
        self.changeType = changeType
        self.timestamp = timestamp
        self.status = status
        self.fileName = fileName

    def get_commitHash(self):
        return self.commitHash

    def get_newPath(self):
        return self.newPath

    def get_changeType(self):
        return self.changeType

    def get_timestamp(self):
        return self.timestamp

    def get_status(self):
        return self.status

    def get_fileName(self):
        return self.fileName

class Pairs():
    def __init__(self, path=None):
        self.path = path
        self.unique_pairs = self.read_data(self.path)

    def read_data(self,path):
        temppairs=[]
        with open(self.path) as csv_file2:
            csv_reader = csv.reader(csv_file2, delimiter=',')
            next(csv_reader, None)    #skip the headers
            for row in csv_reader:
                commitHash = row[0]
                newPath = row[1]
                changeType = row[2]
                timestamp = row[8]
                status = row[9]
                fileName = row[10]
                if(changeType=="ModificationType.ADD" or changeType=="ModificationType.MODIFY"):
                    if newPath.endswith('.java'):
                        #get_file_from_commit(commitHash,newPath)    #timestamp
                        new_rev = Revision (commitHash,newPath,changeType,timestamp,status,fileName)
                        temppairs.append(new_rev)
            return temppairs

    def get_dictionary(self,key):
        return self.build_pair_dict(key,self.read_pair_list(self.path,key))

class Test():
    def __init__(self,path):
        self.path = path
        self.pair = Pairs(self.path)

    def test1(self, datapath, traindir, testdir):
        #tr_doc = Document()
        tr_doc = Corpus()
        traindocs = tr_doc.read_files(datapath,traindir,self.pair.unique_pairs) #list of docs containing all fields
        print("Length of Tr. Corpus ",len(traindocs))
        model = TfidfModel(traindocs)   #build corpus inside TfidfModel function train_on_docs()

        test_doc = Corpus()
        testdocs = test_doc.read_files(datapath,testdir,self.pair.unique_pairs)
        print("Length of Test Corpus ",len(testdocs))
        MRR = model.test_on_query_docs_pairs(testdocs,self.pair.unique_pairs)
        print("MRR = ", MRR)
        return MRR

def uniq(lst):
    last = object()
    for item in lst:
        if item == last:
            continue
        yield item
        last = item

def sort_and_deduplicate(lst):
    return list(uniq(sorted(lst, reverse=True)))

def reverse_list(data):
    print("Reverse List!")
    reverse_data = []
    for pair in data:
        rev_pair = [pair[1],pair[0]]
        reverse_data.append(rev_pair)
    return reverse_data

def calculate_mean_MRR(MRR):
    print(MRR)
    sum=0
    count=0
    for m in MRR:
        sum = sum+m
        count = count+1
    return sum/count

#'commons-dbcp','commons-digester','commons-exec','commons-fileupload','commons-io','commons-jelly','commons-jexl', 'commons-jxpath','commons-net','commons-dbutils','commons-validator','commons-vfs','felix','httpcomponents-client','httpcomponents-core',
def main():
    all_projects=['mina-sshd']#['ambari','attic-aurora','commons-dbcp','commons-digester','commons-exec','commons-fileupload','commons-io','commons-jelly','commons-jexl', 'commons-jxpath','commons-net','commons-dbutils','commons-validator','commons-vfs','felix','httpcomponents-client','httpcomponents-core']
    #,'mina-sshd','accumulo','ambari','atlas','attic-aurora',
    #'beam','cocoon','commons-bcel','commons-cli',
    #'commons-codec','commons-collections','commons-configuration']
    all_projects_MRR = []
    for project in all_projects:
        print(project)
        MRR = []
        #datapath = '/home/hareem/EvaluationTDDNicad/'+project+'/timewise_bins/'
        datapath = '/home/hareem/EvalPathBased/projects_evaluated/'+project+'/as_strings_cleaned/'
        listdir = os.listdir(datapath)
        listdir.sort()

        for i in range(0,len(listdir)-1):
            testdir = []
            traindir = []
            testdir.append(listdir[i+1])
            for j in range(0,i+1):
                traindir.append(listdir[j])
            csvpath='/home/hareem/EvaluationTDDKelp/'+project+'/3-'+project+'_distinct_commits_updated.csv'
            testobj1 = Test(csvpath)
            MRR.append(testobj1.test1(datapath,traindir,testdir))
        meanMRR = calculate_mean_MRR(MRR)
        print("Mean MRR:",project," " ,meanMRR)
    all_projects_MRR.append(meanMRR)

main()
