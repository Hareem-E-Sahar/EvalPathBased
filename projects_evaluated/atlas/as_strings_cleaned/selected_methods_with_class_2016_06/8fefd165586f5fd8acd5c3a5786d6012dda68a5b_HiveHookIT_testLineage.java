create table SimpleName MethodInvocation BooleanLiteral false
table SimpleName VariableDeclarationFragment MethodInvocation SimpleName create table
table SimpleName VariableDeclarationFragment MethodInvocation BooleanLiteral false
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table
db SimpleName VariableDeclarationFragment MethodInvocation SimpleName create database
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName db
table SimpleName VariableDeclarationFragment MethodInvocation SimpleName table name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table
string SimpleName MethodInvocation SimpleName format
string SimpleName MethodInvocation StringLiteral create table ss as select * from s
string SimpleName MethodInvocation SimpleName db
string SimpleName MethodInvocation SimpleName table
string SimpleName MethodInvocation SimpleName table
format SimpleName MethodInvocation StringLiteral create table ss as select * from s
format SimpleName MethodInvocation SimpleName db
format SimpleName MethodInvocation SimpleName table
format SimpleName MethodInvocation SimpleName table
create table ss as select * from s StringLiteral MethodInvocation SimpleName db
create table ss as select * from s StringLiteral MethodInvocation SimpleName table
create table ss as select * from s StringLiteral MethodInvocation SimpleName table
db SimpleName MethodInvocation SimpleName table
db SimpleName MethodInvocation SimpleName table
table SimpleName MethodInvocation SimpleName table
query SimpleName VariableDeclarationFragment MethodInvocation SimpleName string
query SimpleName VariableDeclarationFragment MethodInvocation SimpleName format
query SimpleName VariableDeclarationFragment MethodInvocation StringLiteral create table ss as select * from s
query SimpleName VariableDeclarationFragment MethodInvocation SimpleName db
query SimpleName VariableDeclarationFragment MethodInvocation SimpleName table
query SimpleName VariableDeclarationFragment MethodInvocation SimpleName table
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName query
run command SimpleName MethodInvocation SimpleName query
assert table is registered SimpleName MethodInvocation SimpleName default db
assert table is registered SimpleName MethodInvocation SimpleName table
default db SimpleName MethodInvocation SimpleName table
table id SimpleName VariableDeclarationFragment MethodInvocation SimpleName assert table is registered
table id SimpleName VariableDeclarationFragment MethodInvocation SimpleName default db
table id SimpleName VariableDeclarationFragment MethodInvocation SimpleName table
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table id
assert table is registered SimpleName MethodInvocation SimpleName db
assert table is registered SimpleName MethodInvocation SimpleName table
db SimpleName MethodInvocation SimpleName table
table id SimpleName VariableDeclarationFragment MethodInvocation SimpleName assert table is registered
table id SimpleName VariableDeclarationFragment MethodInvocation SimpleName db
table id SimpleName VariableDeclarationFragment MethodInvocation SimpleName table
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table id
hive meta store bridge SimpleName MethodInvocation SimpleName get table qualified name
hive meta store bridge SimpleName MethodInvocation SimpleName cluster name
hive meta store bridge SimpleName MethodInvocation SimpleName db
hive meta store bridge SimpleName MethodInvocation SimpleName table
get table qualified name SimpleName MethodInvocation SimpleName cluster name
get table qualified name SimpleName MethodInvocation SimpleName db
get table qualified name SimpleName MethodInvocation SimpleName table
cluster name SimpleName MethodInvocation SimpleName db
cluster name SimpleName MethodInvocation SimpleName table
db SimpleName MethodInvocation SimpleName table
dataset name SimpleName VariableDeclarationFragment MethodInvocation SimpleName hive meta store bridge
dataset name SimpleName VariableDeclarationFragment MethodInvocation SimpleName get table qualified name
dataset name SimpleName VariableDeclarationFragment MethodInvocation SimpleName cluster name
dataset name SimpleName VariableDeclarationFragment MethodInvocation SimpleName db
dataset name SimpleName VariableDeclarationFragment MethodInvocation SimpleName table
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName dataset name
atlas client SimpleName MethodInvocation SimpleName get input graph
atlas client SimpleName MethodInvocation SimpleName dataset name
get input graph SimpleName MethodInvocation SimpleName dataset name
response SimpleName VariableDeclarationFragment MethodInvocation SimpleName atlas client
response SimpleName VariableDeclarationFragment MethodInvocation SimpleName get input graph
response SimpleName VariableDeclarationFragment MethodInvocation SimpleName dataset name
json object SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName response
response SimpleName MethodInvocation SimpleName get json object
response SimpleName MethodInvocation StringLiteral values
get json object SimpleName MethodInvocation StringLiteral values
response SimpleName MethodInvocation MethodInvocation SimpleName get json object
get json object SimpleName MethodInvocation MethodInvocation SimpleName get json object
values StringLiteral MethodInvocation MethodInvocation SimpleName get json object
response SimpleName MethodInvocation MethodInvocation StringLiteral vertices
get json object SimpleName MethodInvocation MethodInvocation StringLiteral vertices
values StringLiteral MethodInvocation MethodInvocation StringLiteral vertices
get json object SimpleName MethodInvocation StringLiteral vertices
vertices SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName response
vertices SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get json object
vertices SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation StringLiteral values
vertices SimpleName VariableDeclarationFragment MethodInvocation SimpleName get json object
vertices SimpleName VariableDeclarationFragment MethodInvocation StringLiteral vertices
json object SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName vertices
vertices SimpleName MethodInvocation SimpleName has
vertices SimpleName MethodInvocation SimpleName table id
has SimpleName MethodInvocation SimpleName table id
assert true SimpleName MethodInvocation MethodInvocation SimpleName vertices
assert true SimpleName MethodInvocation MethodInvocation SimpleName has
assert true SimpleName MethodInvocation MethodInvocation SimpleName table id
vertices SimpleName MethodInvocation SimpleName has
vertices SimpleName MethodInvocation SimpleName table id
has SimpleName MethodInvocation SimpleName table id
assert true SimpleName MethodInvocation MethodInvocation SimpleName vertices
assert true SimpleName MethodInvocation MethodInvocation SimpleName has
assert true SimpleName MethodInvocation MethodInvocation SimpleName table id
hive meta store bridge SimpleName MethodInvocation SimpleName get table qualified name
hive meta store bridge SimpleName MethodInvocation SimpleName cluster name
hive meta store bridge SimpleName MethodInvocation SimpleName default db
hive meta store bridge SimpleName MethodInvocation SimpleName table
get table qualified name SimpleName MethodInvocation SimpleName cluster name
get table qualified name SimpleName MethodInvocation SimpleName default db
get table qualified name SimpleName MethodInvocation SimpleName table
cluster name SimpleName MethodInvocation SimpleName default db
cluster name SimpleName MethodInvocation SimpleName table
default db SimpleName MethodInvocation SimpleName table
dataset name SimpleName Assignment MethodInvocation SimpleName hive meta store bridge
dataset name SimpleName Assignment MethodInvocation SimpleName get table qualified name
dataset name SimpleName Assignment MethodInvocation SimpleName cluster name
dataset name SimpleName Assignment MethodInvocation SimpleName default db
dataset name SimpleName Assignment MethodInvocation SimpleName table
atlas client SimpleName MethodInvocation SimpleName get output graph
atlas client SimpleName MethodInvocation SimpleName dataset name
get output graph SimpleName MethodInvocation SimpleName dataset name
response SimpleName Assignment MethodInvocation SimpleName atlas client
response SimpleName Assignment MethodInvocation SimpleName get output graph
response SimpleName Assignment MethodInvocation SimpleName dataset name
response SimpleName MethodInvocation SimpleName get json object
response SimpleName MethodInvocation StringLiteral values
get json object SimpleName MethodInvocation StringLiteral values
response SimpleName MethodInvocation MethodInvocation SimpleName get json object
get json object SimpleName MethodInvocation MethodInvocation SimpleName get json object
values StringLiteral MethodInvocation MethodInvocation SimpleName get json object
response SimpleName MethodInvocation MethodInvocation StringLiteral vertices
get json object SimpleName MethodInvocation MethodInvocation StringLiteral vertices
values StringLiteral MethodInvocation MethodInvocation StringLiteral vertices
get json object SimpleName MethodInvocation StringLiteral vertices
vertices SimpleName Assignment MethodInvocation MethodInvocation SimpleName response
vertices SimpleName Assignment MethodInvocation MethodInvocation SimpleName get json object
vertices SimpleName Assignment MethodInvocation MethodInvocation StringLiteral values
vertices SimpleName Assignment MethodInvocation SimpleName get json object
vertices SimpleName Assignment MethodInvocation StringLiteral vertices
vertices SimpleName MethodInvocation SimpleName has
vertices SimpleName MethodInvocation SimpleName table id
has SimpleName MethodInvocation SimpleName table id
assert true SimpleName MethodInvocation MethodInvocation SimpleName vertices
assert true SimpleName MethodInvocation MethodInvocation SimpleName has
assert true SimpleName MethodInvocation MethodInvocation SimpleName table id
vertices SimpleName MethodInvocation SimpleName has
vertices SimpleName MethodInvocation SimpleName table id
has SimpleName MethodInvocation SimpleName table id
assert true SimpleName MethodInvocation MethodInvocation SimpleName vertices
assert true SimpleName MethodInvocation MethodInvocation SimpleName has
assert true SimpleName MethodInvocation MethodInvocation SimpleName table id
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test lineage
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test lineage
public Modifier MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration SimpleName test lineage
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
test lineage SimpleName MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test lineage
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test lineage
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
