create table SimpleName MethodInvocation BooleanLiteral false
table name SimpleName VariableDeclarationFragment MethodInvocation SimpleName create table
table name SimpleName VariableDeclarationFragment MethodInvocation BooleanLiteral false
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table name
string SimpleName MethodInvocation SimpleName format
string SimpleName MethodInvocation StringLiteral truncate table s
string SimpleName MethodInvocation SimpleName table name
format SimpleName MethodInvocation StringLiteral truncate table s
format SimpleName MethodInvocation SimpleName table name
truncate table s StringLiteral MethodInvocation SimpleName table name
query SimpleName VariableDeclarationFragment MethodInvocation SimpleName string
query SimpleName VariableDeclarationFragment MethodInvocation SimpleName format
query SimpleName VariableDeclarationFragment MethodInvocation StringLiteral truncate table s
query SimpleName VariableDeclarationFragment MethodInvocation SimpleName table name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName query
run command SimpleName MethodInvocation SimpleName query
list SimpleName SimpleType ParameterizedType SimpleType SimpleName entity
get inputs SimpleName MethodInvocation SimpleName table name
get inputs SimpleName MethodInvocation QualifiedName entitytypetable
table name SimpleName MethodInvocation QualifiedName entitytypetable
outputs SimpleName VariableDeclarationFragment MethodInvocation SimpleName get inputs
outputs SimpleName VariableDeclarationFragment MethodInvocation SimpleName table name
outputs SimpleName VariableDeclarationFragment MethodInvocation QualifiedName entitytypetable
assert table is registered SimpleName MethodInvocation SimpleName default db
assert table is registered SimpleName MethodInvocation SimpleName table name
default db SimpleName MethodInvocation SimpleName table name
table id SimpleName VariableDeclarationFragment MethodInvocation SimpleName assert table is registered
table id SimpleName VariableDeclarationFragment MethodInvocation SimpleName default db
table id SimpleName VariableDeclarationFragment MethodInvocation SimpleName table name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table id
validate process SimpleName MethodInvocation SimpleName query
validate process SimpleName MethodInvocation QualifiedName hive operationtruncatetable
validate process SimpleName MethodInvocation SimpleName outputs
query SimpleName MethodInvocation QualifiedName hive operationtruncatetable
query SimpleName MethodInvocation SimpleName outputs
hive operationtruncatetable QualifiedName MethodInvocation SimpleName outputs
hive meta store bridge SimpleName MethodInvocation SimpleName get table qualified name
hive meta store bridge SimpleName MethodInvocation SimpleName cluster name
hive meta store bridge SimpleName MethodInvocation SimpleName default db
hive meta store bridge SimpleName MethodInvocation SimpleName table name
get table qualified name SimpleName MethodInvocation SimpleName cluster name
get table qualified name SimpleName MethodInvocation SimpleName default db
get table qualified name SimpleName MethodInvocation SimpleName table name
cluster name SimpleName MethodInvocation SimpleName default db
cluster name SimpleName MethodInvocation SimpleName table name
default db SimpleName MethodInvocation SimpleName table name
dataset name SimpleName VariableDeclarationFragment MethodInvocation SimpleName hive meta store bridge
dataset name SimpleName VariableDeclarationFragment MethodInvocation SimpleName get table qualified name
dataset name SimpleName VariableDeclarationFragment MethodInvocation SimpleName cluster name
dataset name SimpleName VariableDeclarationFragment MethodInvocation SimpleName default db
dataset name SimpleName VariableDeclarationFragment MethodInvocation SimpleName table name
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
assert SimpleName MethodInvocation SimpleName assert false
assert SimpleName MethodInvocation MethodInvocation SimpleName vertices
assert SimpleName MethodInvocation MethodInvocation SimpleName has
assert SimpleName MethodInvocation MethodInvocation SimpleName table id
assert false SimpleName MethodInvocation MethodInvocation SimpleName vertices
assert false SimpleName MethodInvocation MethodInvocation SimpleName has
assert false SimpleName MethodInvocation MethodInvocation SimpleName table id
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test truncate table
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test truncate table
public Modifier MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration SimpleName test truncate table
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
test truncate table SimpleName MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test truncate table
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test truncate table
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception