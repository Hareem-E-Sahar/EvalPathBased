test SimpleName MethodInvocation SimpleName get method name
mock instance SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName test
mock instance SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get method name
inst SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName mock instance
inst SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName test
inst SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName get method name
mock instance SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName inst
password token SimpleName SimpleType ClassInstanceCreation StringLiteral empty
credentials SimpleName SimpleType ClassInstanceCreation StringLiteral root
credentials SimpleName SimpleType ClassInstanceCreation ClassInstanceCreation StringLiteral empty
root StringLiteral ClassInstanceCreation ClassInstanceCreation SimpleType SimpleName password token
root StringLiteral ClassInstanceCreation ClassInstanceCreation StringLiteral empty
creds SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName credentials
creds SimpleName VariableDeclarationFragment ClassInstanceCreation StringLiteral root
creds SimpleName VariableDeclarationFragment ClassInstanceCreation ClassInstanceCreation StringLiteral empty
credentials SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName creds
creds SimpleName MethodInvocation SimpleName get principal
creds SimpleName MethodInvocation SimpleName get token
inst SimpleName MethodInvocation SimpleName get connector
inst SimpleName MethodInvocation MethodInvocation SimpleName creds
inst SimpleName MethodInvocation MethodInvocation SimpleName get principal
inst SimpleName MethodInvocation MethodInvocation SimpleName creds
inst SimpleName MethodInvocation MethodInvocation SimpleName get token
get connector SimpleName MethodInvocation MethodInvocation SimpleName creds
get connector SimpleName MethodInvocation MethodInvocation SimpleName get principal
get connector SimpleName MethodInvocation MethodInvocation SimpleName creds
get connector SimpleName MethodInvocation MethodInvocation SimpleName get token
creds SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName creds
creds SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get token
get principal SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName creds
get principal SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get token
conn SimpleName VariableDeclarationFragment MethodInvocation SimpleName inst
conn SimpleName VariableDeclarationFragment MethodInvocation SimpleName get connector
conn SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName creds
conn SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get principal
conn SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName creds
conn SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get token
connector SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName conn
source table SimpleName VariableDeclarationFragment StringLiteral source
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName source table
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment StringLiteral source
conn SimpleName MethodInvocation SimpleName table operations
conn SimpleName MethodInvocation MethodInvocation SimpleName create
table operations SimpleName MethodInvocation MethodInvocation SimpleName create
conn SimpleName MethodInvocation MethodInvocation SimpleName source table
table operations SimpleName MethodInvocation MethodInvocation SimpleName source table
create SimpleName MethodInvocation SimpleName source table
replication table util SimpleName MethodInvocation SimpleName configure metadata table
replication table util SimpleName MethodInvocation SimpleName conn
replication table util SimpleName MethodInvocation SimpleName source table
configure metadata table SimpleName MethodInvocation SimpleName conn
configure metadata table SimpleName MethodInvocation SimpleName source table
conn SimpleName MethodInvocation SimpleName source table
conn SimpleName MethodInvocation SimpleName create batch writer
conn SimpleName MethodInvocation SimpleName source table
conn SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName batch writer config
create batch writer SimpleName MethodInvocation SimpleName source table
create batch writer SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName batch writer config
source table SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName batch writer config
bw SimpleName VariableDeclarationFragment MethodInvocation SimpleName conn
bw SimpleName VariableDeclarationFragment MethodInvocation SimpleName create batch writer
bw SimpleName VariableDeclarationFragment MethodInvocation SimpleName source table
batch writer SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName bw
wal prefix SimpleName VariableDeclarationFragment StringLiteral hdfslocalhost accumulowalstserverport
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName wal prefix
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment StringLiteral hdfslocalhost accumulowalstserverport
set SimpleName SimpleType ParameterizedType SimpleType SimpleName string
uuid SimpleName MethodInvocation SimpleName random uuid
wal prefix SimpleName InfixExpression MethodInvocation SimpleName uuid
wal prefix SimpleName InfixExpression MethodInvocation SimpleName random uuid
uuid SimpleName MethodInvocation SimpleName random uuid
wal prefix SimpleName InfixExpression MethodInvocation SimpleName uuid
wal prefix SimpleName InfixExpression MethodInvocation SimpleName random uuid
uuid SimpleName MethodInvocation SimpleName random uuid
wal prefix SimpleName InfixExpression MethodInvocation SimpleName uuid
wal prefix SimpleName InfixExpression MethodInvocation SimpleName random uuid
uuid SimpleName MethodInvocation SimpleName random uuid
wal prefix SimpleName InfixExpression MethodInvocation SimpleName uuid
wal prefix SimpleName InfixExpression MethodInvocation SimpleName random uuid
sets SimpleName MethodInvocation SimpleName new hash set
sets SimpleName MethodInvocation InfixExpression SimpleName wal prefix
sets SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName uuid
sets SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName random uuid
sets SimpleName MethodInvocation InfixExpression SimpleName wal prefix
sets SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName uuid
sets SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName random uuid
sets SimpleName MethodInvocation InfixExpression SimpleName wal prefix
sets SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName uuid
sets SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName random uuid
sets SimpleName MethodInvocation InfixExpression SimpleName wal prefix
sets SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName uuid
sets SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName random uuid
new hash set SimpleName MethodInvocation InfixExpression SimpleName wal prefix
new hash set SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName uuid
new hash set SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName random uuid
new hash set SimpleName MethodInvocation InfixExpression SimpleName wal prefix
new hash set SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName uuid
new hash set SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName random uuid
new hash set SimpleName MethodInvocation InfixExpression SimpleName wal prefix
new hash set SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName uuid
new hash set SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName random uuid
new hash set SimpleName MethodInvocation InfixExpression SimpleName wal prefix
new hash set SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName uuid
new hash set SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName random uuid
wal prefix SimpleName InfixExpression MethodInvocation InfixExpression SimpleName wal prefix
wal prefix SimpleName InfixExpression MethodInvocation InfixExpression SimpleName wal prefix
wal prefix SimpleName InfixExpression MethodInvocation InfixExpression SimpleName wal prefix
wal prefix SimpleName InfixExpression MethodInvocation InfixExpression SimpleName wal prefix
wal prefix SimpleName InfixExpression MethodInvocation InfixExpression SimpleName wal prefix
wal prefix SimpleName InfixExpression MethodInvocation InfixExpression SimpleName wal prefix
files SimpleName VariableDeclarationFragment MethodInvocation SimpleName sets
files SimpleName VariableDeclarationFragment MethodInvocation SimpleName new hash set
files SimpleName VariableDeclarationFragment MethodInvocation InfixExpression SimpleName wal prefix
files SimpleName VariableDeclarationFragment MethodInvocation InfixExpression SimpleName wal prefix
files SimpleName VariableDeclarationFragment MethodInvocation InfixExpression SimpleName wal prefix
files SimpleName VariableDeclarationFragment MethodInvocation InfixExpression SimpleName wal prefix
map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
map SimpleName SimpleType ParameterizedType SimpleType SimpleName integer
string SimpleName SimpleType ParameterizedType SimpleType SimpleName integer
index SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName index
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment NumberLiteral empty
string SimpleName SimpleType SingleVariableDeclaration SimpleName file
replication section SimpleName MethodInvocation SimpleName get row prefix
replication section SimpleName MethodInvocation InfixExpression SimpleName file
get row prefix SimpleName MethodInvocation InfixExpression SimpleName file
mutation SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName file
m SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName mutation
m SimpleName VariableDeclarationFragment ClassInstanceCreation InfixExpression SimpleName file
mutation SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName m
integer SimpleName MethodInvocation SimpleName to string
integer SimpleName MethodInvocation SimpleName index
to string SimpleName MethodInvocation SimpleName index
text SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName integer
text SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName to string
text SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName index
status util SimpleName MethodInvocation SimpleName new file value
m SimpleName MethodInvocation SimpleName put
m SimpleName MethodInvocation QualifiedName replication sectioncolf
m SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName text
m SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName integer
m SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName to string
m SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName index
m SimpleName MethodInvocation MethodInvocation SimpleName status util
m SimpleName MethodInvocation MethodInvocation SimpleName new file value
put SimpleName MethodInvocation QualifiedName replication sectioncolf
put SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName text
put SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName integer
put SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName to string
put SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName index
put SimpleName MethodInvocation MethodInvocation SimpleName status util
put SimpleName MethodInvocation MethodInvocation SimpleName new file value
replication sectioncolf QualifiedName MethodInvocation ClassInstanceCreation SimpleType SimpleName text
replication sectioncolf QualifiedName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName integer
replication sectioncolf QualifiedName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName to string
replication sectioncolf QualifiedName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName index
replication sectioncolf QualifiedName MethodInvocation MethodInvocation SimpleName status util
replication sectioncolf QualifiedName MethodInvocation MethodInvocation SimpleName new file value
bw SimpleName MethodInvocation SimpleName add mutation
bw SimpleName MethodInvocation SimpleName m
add mutation SimpleName MethodInvocation SimpleName m
file to table id SimpleName MethodInvocation SimpleName put
file to table id SimpleName MethodInvocation SimpleName file
file to table id SimpleName MethodInvocation SimpleName index
put SimpleName MethodInvocation SimpleName file
put SimpleName MethodInvocation SimpleName index
file SimpleName MethodInvocation SimpleName index
string SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName files
file SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName files
bw SimpleName MethodInvocation SimpleName close
status maker SimpleName SimpleType ClassInstanceCreation SimpleName conn
status maker SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName status maker
status maker SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName conn
status maker SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName status maker
status maker SimpleName MethodInvocation SimpleName set source table name
status maker SimpleName MethodInvocation SimpleName source table
set source table name SimpleName MethodInvocation SimpleName source table
status maker SimpleName MethodInvocation SimpleName run
conn SimpleName MethodInvocation SimpleName create scanner
conn SimpleName MethodInvocation SimpleName source table
conn SimpleName MethodInvocation QualifiedName authorizationsempty
create scanner SimpleName MethodInvocation SimpleName source table
create scanner SimpleName MethodInvocation QualifiedName authorizationsempty
source table SimpleName MethodInvocation QualifiedName authorizationsempty
s SimpleName VariableDeclarationFragment MethodInvocation SimpleName conn
s SimpleName VariableDeclarationFragment MethodInvocation SimpleName create scanner
s SimpleName VariableDeclarationFragment MethodInvocation SimpleName source table
s SimpleName VariableDeclarationFragment MethodInvocation QualifiedName authorizationsempty
scanner SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName s
replication section SimpleName MethodInvocation SimpleName get range
s SimpleName MethodInvocation SimpleName set range
s SimpleName MethodInvocation MethodInvocation SimpleName replication section
s SimpleName MethodInvocation MethodInvocation SimpleName get range
set range SimpleName MethodInvocation MethodInvocation SimpleName replication section
set range SimpleName MethodInvocation MethodInvocation SimpleName get range
s SimpleName MethodInvocation SimpleName fetch column family
s SimpleName MethodInvocation QualifiedName replication sectioncolf
fetch column family SimpleName MethodInvocation QualifiedName replication sectioncolf
files SimpleName MethodInvocation SimpleName size
iterables SimpleName MethodInvocation SimpleName size
iterables SimpleName MethodInvocation SimpleName s
size SimpleName MethodInvocation SimpleName s
assert SimpleName MethodInvocation SimpleName assert equals
assert SimpleName MethodInvocation MethodInvocation SimpleName files
assert SimpleName MethodInvocation MethodInvocation SimpleName size
assert SimpleName MethodInvocation MethodInvocation SimpleName iterables
assert SimpleName MethodInvocation MethodInvocation SimpleName size
assert SimpleName MethodInvocation MethodInvocation SimpleName s
assert equals SimpleName MethodInvocation MethodInvocation SimpleName files
assert equals SimpleName MethodInvocation MethodInvocation SimpleName size
assert equals SimpleName MethodInvocation MethodInvocation SimpleName iterables
assert equals SimpleName MethodInvocation MethodInvocation SimpleName size
assert equals SimpleName MethodInvocation MethodInvocation SimpleName s
files SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName iterables
files SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName size
files SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName s
size SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName iterables
size SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName size
size SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName s
int PrimitiveType VariableDeclarationStatement Block EnhancedForStatement SimpleName files
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName open messages are not deleted
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName open messages are not deleted
public Modifier MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
public Modifier MethodDeclaration Block EnhancedForStatement SimpleName files
void PrimitiveType MethodDeclaration SimpleName open messages are not deleted
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
void PrimitiveType MethodDeclaration Block EnhancedForStatement SimpleName files
open messages are not deleted SimpleName MethodDeclaration SimpleType SimpleName exception
open messages are not deleted SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
open messages are not deleted SimpleName MethodDeclaration Block EnhancedForStatement SimpleName files
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName open messages are not deleted
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName open messages are not deleted
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
