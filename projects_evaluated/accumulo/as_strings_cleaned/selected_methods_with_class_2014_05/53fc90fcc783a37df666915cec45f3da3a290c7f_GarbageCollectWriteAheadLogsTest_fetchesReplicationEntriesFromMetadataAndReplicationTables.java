test name SimpleName MethodInvocation SimpleName get method name
mock instance SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName test name
mock instance SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get method name
inst SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName mock instance
inst SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName test name
inst SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName get method name
instance SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName inst
password token SimpleName SimpleType ClassInstanceCreation StringLiteral empty
inst SimpleName MethodInvocation SimpleName get connector
inst SimpleName MethodInvocation StringLiteral root
inst SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName password token
inst SimpleName MethodInvocation ClassInstanceCreation StringLiteral empty
get connector SimpleName MethodInvocation StringLiteral root
get connector SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName password token
get connector SimpleName MethodInvocation ClassInstanceCreation StringLiteral empty
root StringLiteral MethodInvocation ClassInstanceCreation SimpleType SimpleName password token
root StringLiteral MethodInvocation ClassInstanceCreation StringLiteral empty
conn SimpleName VariableDeclarationFragment MethodInvocation SimpleName inst
conn SimpleName VariableDeclarationFragment MethodInvocation SimpleName get connector
conn SimpleName VariableDeclarationFragment MethodInvocation StringLiteral root
conn SimpleName VariableDeclarationFragment MethodInvocation ClassInstanceCreation StringLiteral empty
connector SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName conn
replication table SimpleName MethodInvocation SimpleName create
replication table SimpleName MethodInvocation SimpleName conn
create SimpleName MethodInvocation SimpleName conn
wal SimpleName VariableDeclarationFragment StringLiteral hdfslocalhost accumulowaltserverport - - -
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName wal
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment StringLiteral hdfslocalhost accumulowaltserverport - - -
conn SimpleName MethodInvocation SimpleName create batch writer
conn SimpleName MethodInvocation QualifiedName metadata tablename
conn SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName batch writer config
create batch writer SimpleName MethodInvocation QualifiedName metadata tablename
create batch writer SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName batch writer config
metadata tablename QualifiedName MethodInvocation ClassInstanceCreation SimpleType SimpleName batch writer config
bw SimpleName VariableDeclarationFragment MethodInvocation SimpleName conn
bw SimpleName VariableDeclarationFragment MethodInvocation SimpleName create batch writer
bw SimpleName VariableDeclarationFragment MethodInvocation QualifiedName metadata tablename
batch writer SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName bw
replication section SimpleName MethodInvocation SimpleName get row prefix
replication section SimpleName MethodInvocation InfixExpression SimpleName wal
get row prefix SimpleName MethodInvocation InfixExpression SimpleName wal
mutation SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName wal
m SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName mutation
m SimpleName VariableDeclarationFragment ClassInstanceCreation InfixExpression SimpleName wal
mutation SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName m
text SimpleName SimpleType ClassInstanceCreation StringLiteral empty
status util SimpleName MethodInvocation SimpleName new file value
m SimpleName MethodInvocation SimpleName put
m SimpleName MethodInvocation QualifiedName replication sectioncolf
m SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName text
m SimpleName MethodInvocation ClassInstanceCreation StringLiteral empty
m SimpleName MethodInvocation MethodInvocation SimpleName status util
m SimpleName MethodInvocation MethodInvocation SimpleName new file value
put SimpleName MethodInvocation QualifiedName replication sectioncolf
put SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName text
put SimpleName MethodInvocation ClassInstanceCreation StringLiteral empty
put SimpleName MethodInvocation MethodInvocation SimpleName status util
put SimpleName MethodInvocation MethodInvocation SimpleName new file value
replication sectioncolf QualifiedName MethodInvocation ClassInstanceCreation SimpleType SimpleName text
replication sectioncolf QualifiedName MethodInvocation ClassInstanceCreation StringLiteral empty
replication sectioncolf QualifiedName MethodInvocation MethodInvocation SimpleName status util
replication sectioncolf QualifiedName MethodInvocation MethodInvocation SimpleName new file value
empty StringLiteral ClassInstanceCreation MethodInvocation MethodInvocation SimpleName status util
empty StringLiteral ClassInstanceCreation MethodInvocation MethodInvocation SimpleName new file value
bw SimpleName MethodInvocation SimpleName add mutation
bw SimpleName MethodInvocation SimpleName m
add mutation SimpleName MethodInvocation SimpleName m
bw SimpleName MethodInvocation SimpleName close
replication table SimpleName MethodInvocation SimpleName get batch writer
replication table SimpleName MethodInvocation SimpleName conn
get batch writer SimpleName MethodInvocation SimpleName conn
bw SimpleName Assignment MethodInvocation SimpleName replication table
bw SimpleName Assignment MethodInvocation SimpleName get batch writer
bw SimpleName Assignment MethodInvocation SimpleName conn
mutation SimpleName SimpleType ClassInstanceCreation SimpleName wal
m SimpleName Assignment ClassInstanceCreation SimpleType SimpleName mutation
m SimpleName Assignment ClassInstanceCreation SimpleName wal
text SimpleName SimpleType ClassInstanceCreation StringLiteral empty
status util SimpleName MethodInvocation SimpleName new file value
status section SimpleName MethodInvocation SimpleName add
status section SimpleName MethodInvocation SimpleName m
status section SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName text
status section SimpleName MethodInvocation ClassInstanceCreation StringLiteral empty
status section SimpleName MethodInvocation MethodInvocation SimpleName status util
status section SimpleName MethodInvocation MethodInvocation SimpleName new file value
add SimpleName MethodInvocation SimpleName m
add SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName text
add SimpleName MethodInvocation ClassInstanceCreation StringLiteral empty
add SimpleName MethodInvocation MethodInvocation SimpleName status util
add SimpleName MethodInvocation MethodInvocation SimpleName new file value
m SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName text
m SimpleName MethodInvocation ClassInstanceCreation StringLiteral empty
m SimpleName MethodInvocation MethodInvocation SimpleName status util
m SimpleName MethodInvocation MethodInvocation SimpleName new file value
empty StringLiteral ClassInstanceCreation MethodInvocation MethodInvocation SimpleName status util
empty StringLiteral ClassInstanceCreation MethodInvocation MethodInvocation SimpleName new file value
bw SimpleName MethodInvocation SimpleName add mutation
bw SimpleName MethodInvocation SimpleName m
add mutation SimpleName MethodInvocation SimpleName m
bw SimpleName MethodInvocation SimpleName close
garbage collect write ahead logs SimpleName SimpleType ClassInstanceCreation SimpleName inst
garbage collect write ahead logs SimpleName SimpleType ClassInstanceCreation SimpleName vol mgr
garbage collect write ahead logs SimpleName SimpleType ClassInstanceCreation BooleanLiteral false
inst SimpleName ClassInstanceCreation SimpleName vol mgr
inst SimpleName ClassInstanceCreation BooleanLiteral false
vol mgr SimpleName ClassInstanceCreation BooleanLiteral false
gc wa ls SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName garbage collect write ahead logs
gc wa ls SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName inst
gc wa ls SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName vol mgr
gc wa ls SimpleName VariableDeclarationFragment ClassInstanceCreation BooleanLiteral false
garbage collect write ahead logs SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName gc wa ls
entry SimpleName SimpleType ParameterizedType SimpleType SimpleName key
entry SimpleName SimpleType ParameterizedType SimpleType SimpleName value
key SimpleName SimpleType ParameterizedType SimpleType SimpleName value
gc wa ls SimpleName MethodInvocation SimpleName get replication status for file
gc wa ls SimpleName MethodInvocation SimpleName conn
gc wa ls SimpleName MethodInvocation SimpleName wal
get replication status for file SimpleName MethodInvocation SimpleName conn
get replication status for file SimpleName MethodInvocation SimpleName wal
conn SimpleName MethodInvocation SimpleName wal
iter SimpleName VariableDeclarationFragment MethodInvocation SimpleName gc wa ls
iter SimpleName VariableDeclarationFragment MethodInvocation SimpleName get replication status for file
iter SimpleName VariableDeclarationFragment MethodInvocation SimpleName conn
iter SimpleName VariableDeclarationFragment MethodInvocation SimpleName wal
map SimpleName SimpleType ParameterizedType SimpleType SimpleName key
map SimpleName SimpleType ParameterizedType SimpleType SimpleName value
key SimpleName SimpleType ParameterizedType SimpleType SimpleName value
entry SimpleName SimpleType ParameterizedType SimpleType SimpleName key
entry SimpleName SimpleType ParameterizedType SimpleType SimpleName value
key SimpleName SimpleType ParameterizedType SimpleType SimpleName value
entry SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName e
key SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName e
value SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName e
e SimpleName MethodInvocation SimpleName get key
e SimpleName MethodInvocation SimpleName get value
data SimpleName MethodInvocation SimpleName put
data SimpleName MethodInvocation MethodInvocation SimpleName e
data SimpleName MethodInvocation MethodInvocation SimpleName get key
data SimpleName MethodInvocation MethodInvocation SimpleName e
data SimpleName MethodInvocation MethodInvocation SimpleName get value
put SimpleName MethodInvocation MethodInvocation SimpleName e
put SimpleName MethodInvocation MethodInvocation SimpleName get key
put SimpleName MethodInvocation MethodInvocation SimpleName e
put SimpleName MethodInvocation MethodInvocation SimpleName get value
e SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName e
e SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get value
get key SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName e
get key SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get value
e SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName iter
data SimpleName MethodInvocation SimpleName size
assert SimpleName MethodInvocation SimpleName assert equals
assert SimpleName MethodInvocation NumberLiteral empty
assert SimpleName MethodInvocation MethodInvocation SimpleName data
assert SimpleName MethodInvocation MethodInvocation SimpleName size
assert equals SimpleName MethodInvocation NumberLiteral empty
assert equals SimpleName MethodInvocation MethodInvocation SimpleName data
assert equals SimpleName MethodInvocation MethodInvocation SimpleName size
empty NumberLiteral MethodInvocation MethodInvocation SimpleName data
empty NumberLiteral MethodInvocation MethodInvocation SimpleName size
key SimpleName SimpleType SingleVariableDeclaration SimpleName k
data SimpleName MethodInvocation SimpleName key set
k SimpleName MethodInvocation SimpleName get row
k SimpleName MethodInvocation MethodInvocation SimpleName to string
get row SimpleName MethodInvocation MethodInvocation SimpleName to string
row SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName k
row SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get row
row SimpleName VariableDeclarationFragment MethodInvocation SimpleName to string
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName row
replication section SimpleName MethodInvocation SimpleName get row prefix
row SimpleName MethodInvocation SimpleName starts with
row SimpleName MethodInvocation MethodInvocation SimpleName replication section
row SimpleName MethodInvocation MethodInvocation SimpleName get row prefix
starts with SimpleName MethodInvocation MethodInvocation SimpleName replication section
starts with SimpleName MethodInvocation MethodInvocation SimpleName get row prefix
row SimpleName MethodInvocation SimpleName ends with
row SimpleName MethodInvocation SimpleName wal
ends with SimpleName MethodInvocation SimpleName wal
assert SimpleName MethodInvocation SimpleName assert true
assert SimpleName MethodInvocation MethodInvocation SimpleName row
assert SimpleName MethodInvocation MethodInvocation SimpleName ends with
assert SimpleName MethodInvocation MethodInvocation SimpleName wal
assert true SimpleName MethodInvocation MethodInvocation SimpleName row
assert true SimpleName MethodInvocation MethodInvocation SimpleName ends with
assert true SimpleName MethodInvocation MethodInvocation SimpleName wal
assert SimpleName MethodInvocation SimpleName assert equals
assert SimpleName MethodInvocation SimpleName wal
assert SimpleName MethodInvocation SimpleName row
assert equals SimpleName MethodInvocation SimpleName wal
assert equals SimpleName MethodInvocation SimpleName row
wal SimpleName MethodInvocation SimpleName row
k SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName data
k SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName key set
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName fetches replication entries from metadata and replication tables
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName fetches replication entries from metadata and replication tables
public Modifier MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration Block EnhancedForStatement SimpleName iter
void PrimitiveType MethodDeclaration SimpleName fetches replication entries from metadata and replication tables
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration Block EnhancedForStatement SimpleName iter
fetches replication entries from metadata and replication tables SimpleName MethodDeclaration SimpleType SimpleName exception
fetches replication entries from metadata and replication tables SimpleName MethodDeclaration Block EnhancedForStatement SimpleName iter
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName fetches replication entries from metadata and replication tables
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName fetches replication entries from metadata and replication tables
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception