table name SimpleName VariableDeclarationFragment MethodInvocation SimpleName create table
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table name
view name SimpleName VariableDeclarationFragment MethodInvocation SimpleName table name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName view name
create view StringLiteral InfixExpression SimpleName view name
create view StringLiteral InfixExpression StringLiteral as select * from
create view StringLiteral InfixExpression SimpleName table name
view name SimpleName InfixExpression StringLiteral as select * from
view name SimpleName InfixExpression SimpleName table name
as select * from StringLiteral InfixExpression SimpleName table name
query SimpleName VariableDeclarationFragment InfixExpression StringLiteral create view
query SimpleName VariableDeclarationFragment InfixExpression SimpleName view name
query SimpleName VariableDeclarationFragment InfixExpression StringLiteral as select * from
query SimpleName VariableDeclarationFragment InfixExpression SimpleName table name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName query
run command SimpleName MethodInvocation SimpleName query
assert table is registered SimpleName MethodInvocation SimpleName default db
assert table is registered SimpleName MethodInvocation SimpleName table name
default db SimpleName MethodInvocation SimpleName table name
table id SimpleName VariableDeclarationFragment MethodInvocation SimpleName assert table is registered
table id SimpleName VariableDeclarationFragment MethodInvocation SimpleName default db
table id SimpleName VariableDeclarationFragment MethodInvocation SimpleName table name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table id
assert process is registered SimpleName MethodInvocation SimpleName query
assert table is registered SimpleName MethodInvocation SimpleName default db
assert table is registered SimpleName MethodInvocation SimpleName view name
default db SimpleName MethodInvocation SimpleName view name
view id SimpleName VariableDeclarationFragment MethodInvocation SimpleName assert table is registered
view id SimpleName VariableDeclarationFragment MethodInvocation SimpleName default db
view id SimpleName VariableDeclarationFragment MethodInvocation SimpleName view name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName view id
hive meta store bridge SimpleName MethodInvocation SimpleName get table qualified name
hive meta store bridge SimpleName MethodInvocation SimpleName cluster name
hive meta store bridge SimpleName MethodInvocation SimpleName default db
hive meta store bridge SimpleName MethodInvocation SimpleName view name
get table qualified name SimpleName MethodInvocation SimpleName cluster name
get table qualified name SimpleName MethodInvocation SimpleName default db
get table qualified name SimpleName MethodInvocation SimpleName view name
cluster name SimpleName MethodInvocation SimpleName default db
cluster name SimpleName MethodInvocation SimpleName view name
default db SimpleName MethodInvocation SimpleName view name
dataset name SimpleName VariableDeclarationFragment MethodInvocation SimpleName hive meta store bridge
dataset name SimpleName VariableDeclarationFragment MethodInvocation SimpleName get table qualified name
dataset name SimpleName VariableDeclarationFragment MethodInvocation SimpleName cluster name
dataset name SimpleName VariableDeclarationFragment MethodInvocation SimpleName default db
dataset name SimpleName VariableDeclarationFragment MethodInvocation SimpleName view name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName dataset name
dgi c lient SimpleName MethodInvocation SimpleName get input graph
dgi c lient SimpleName MethodInvocation SimpleName dataset name
get input graph SimpleName MethodInvocation SimpleName dataset name
response SimpleName VariableDeclarationFragment MethodInvocation SimpleName dgi c lient
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
vertices SimpleName MethodInvocation SimpleName view id
has SimpleName MethodInvocation SimpleName view id
assert SimpleName MethodInvocation SimpleName assert true
assert SimpleName MethodInvocation MethodInvocation SimpleName vertices
assert SimpleName MethodInvocation MethodInvocation SimpleName has
assert SimpleName MethodInvocation MethodInvocation SimpleName view id
assert true SimpleName MethodInvocation MethodInvocation SimpleName vertices
assert true SimpleName MethodInvocation MethodInvocation SimpleName has
assert true SimpleName MethodInvocation MethodInvocation SimpleName view id
vertices SimpleName MethodInvocation SimpleName has
vertices SimpleName MethodInvocation SimpleName table id
has SimpleName MethodInvocation SimpleName table id
assert SimpleName MethodInvocation SimpleName assert true
assert SimpleName MethodInvocation MethodInvocation SimpleName vertices
assert SimpleName MethodInvocation MethodInvocation SimpleName has
assert SimpleName MethodInvocation MethodInvocation SimpleName table id
assert true SimpleName MethodInvocation MethodInvocation SimpleName vertices
assert true SimpleName MethodInvocation MethodInvocation SimpleName has
assert true SimpleName MethodInvocation MethodInvocation SimpleName table id
table name SimpleName VariableDeclarationFragment MethodInvocation SimpleName create table
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table name
alter view StringLiteral InfixExpression SimpleName view name
alter view StringLiteral InfixExpression StringLiteral as select * from
alter view StringLiteral InfixExpression SimpleName table name
view name SimpleName InfixExpression StringLiteral as select * from
view name SimpleName InfixExpression SimpleName table name
as select * from StringLiteral InfixExpression SimpleName table name
query SimpleName Assignment InfixExpression StringLiteral alter view
query SimpleName Assignment InfixExpression SimpleName view name
query SimpleName Assignment InfixExpression StringLiteral as select * from
query SimpleName Assignment InfixExpression SimpleName table name
run command SimpleName MethodInvocation SimpleName query
assert process is registered SimpleName MethodInvocation SimpleName query
assert table is registered SimpleName MethodInvocation SimpleName default db
assert table is registered SimpleName MethodInvocation SimpleName table name
default db SimpleName MethodInvocation SimpleName table name
table id SimpleName VariableDeclarationFragment MethodInvocation SimpleName assert table is registered
table id SimpleName VariableDeclarationFragment MethodInvocation SimpleName default db
table id SimpleName VariableDeclarationFragment MethodInvocation SimpleName table name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table id
assert table is registered SimpleName MethodInvocation SimpleName default db
assert table is registered SimpleName MethodInvocation SimpleName view name
default db SimpleName MethodInvocation SimpleName view name
assert SimpleName MethodInvocation SimpleName assert equals
assert SimpleName MethodInvocation MethodInvocation SimpleName assert table is registered
assert SimpleName MethodInvocation MethodInvocation SimpleName default db
assert SimpleName MethodInvocation MethodInvocation SimpleName view name
assert SimpleName MethodInvocation SimpleName view id
assert equals SimpleName MethodInvocation MethodInvocation SimpleName assert table is registered
assert equals SimpleName MethodInvocation MethodInvocation SimpleName default db
assert equals SimpleName MethodInvocation MethodInvocation SimpleName view name
assert equals SimpleName MethodInvocation SimpleName view id
assert table is registered SimpleName MethodInvocation MethodInvocation SimpleName view id
default db SimpleName MethodInvocation MethodInvocation SimpleName view id
view name SimpleName MethodInvocation MethodInvocation SimpleName view id
hive meta store bridge SimpleName MethodInvocation SimpleName get table qualified name
hive meta store bridge SimpleName MethodInvocation SimpleName cluster name
hive meta store bridge SimpleName MethodInvocation SimpleName default db
hive meta store bridge SimpleName MethodInvocation SimpleName view name
get table qualified name SimpleName MethodInvocation SimpleName cluster name
get table qualified name SimpleName MethodInvocation SimpleName default db
get table qualified name SimpleName MethodInvocation SimpleName view name
cluster name SimpleName MethodInvocation SimpleName default db
cluster name SimpleName MethodInvocation SimpleName view name
default db SimpleName MethodInvocation SimpleName view name
dataset name SimpleName Assignment MethodInvocation SimpleName hive meta store bridge
dataset name SimpleName Assignment MethodInvocation SimpleName get table qualified name
dataset name SimpleName Assignment MethodInvocation SimpleName cluster name
dataset name SimpleName Assignment MethodInvocation SimpleName default db
dataset name SimpleName Assignment MethodInvocation SimpleName view name
dgi c lient SimpleName MethodInvocation SimpleName get input graph
dgi c lient SimpleName MethodInvocation SimpleName dataset name
get input graph SimpleName MethodInvocation SimpleName dataset name
response SimpleName Assignment MethodInvocation SimpleName dgi c lient
response SimpleName Assignment MethodInvocation SimpleName get input graph
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
vertices SimpleName MethodInvocation SimpleName view id
has SimpleName MethodInvocation SimpleName view id
assert SimpleName MethodInvocation SimpleName assert true
assert SimpleName MethodInvocation MethodInvocation SimpleName vertices
assert SimpleName MethodInvocation MethodInvocation SimpleName has
assert SimpleName MethodInvocation MethodInvocation SimpleName view id
assert true SimpleName MethodInvocation MethodInvocation SimpleName vertices
assert true SimpleName MethodInvocation MethodInvocation SimpleName has
assert true SimpleName MethodInvocation MethodInvocation SimpleName view id
vertices SimpleName MethodInvocation SimpleName has
vertices SimpleName MethodInvocation SimpleName table id
has SimpleName MethodInvocation SimpleName table id
assert SimpleName MethodInvocation SimpleName assert true
assert SimpleName MethodInvocation MethodInvocation SimpleName vertices
assert SimpleName MethodInvocation MethodInvocation SimpleName has
assert SimpleName MethodInvocation MethodInvocation SimpleName table id
assert true SimpleName MethodInvocation MethodInvocation SimpleName vertices
assert true SimpleName MethodInvocation MethodInvocation SimpleName has
assert true SimpleName MethodInvocation MethodInvocation SimpleName table id
vertices SimpleName MethodInvocation SimpleName has
vertices SimpleName MethodInvocation SimpleName table id
has SimpleName MethodInvocation SimpleName table id
assert SimpleName MethodInvocation SimpleName assert true
assert SimpleName MethodInvocation MethodInvocation SimpleName vertices
assert SimpleName MethodInvocation MethodInvocation SimpleName has
assert SimpleName MethodInvocation MethodInvocation SimpleName table id
assert true SimpleName MethodInvocation MethodInvocation SimpleName vertices
assert true SimpleName MethodInvocation MethodInvocation SimpleName has
assert true SimpleName MethodInvocation MethodInvocation SimpleName table id
dgi c lient SimpleName MethodInvocation SimpleName get output graph
dgi c lient SimpleName MethodInvocation SimpleName dataset name
get output graph SimpleName MethodInvocation SimpleName dataset name
response SimpleName Assignment MethodInvocation SimpleName dgi c lient
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
vertices SimpleName MethodInvocation SimpleName length
assert SimpleName MethodInvocation SimpleName assert equals
assert SimpleName MethodInvocation MethodInvocation SimpleName vertices
assert SimpleName MethodInvocation MethodInvocation SimpleName length
assert SimpleName MethodInvocation NumberLiteral empty
assert equals SimpleName MethodInvocation MethodInvocation SimpleName vertices
assert equals SimpleName MethodInvocation MethodInvocation SimpleName length
assert equals SimpleName MethodInvocation NumberLiteral empty
vertices SimpleName MethodInvocation MethodInvocation NumberLiteral empty
length SimpleName MethodInvocation MethodInvocation NumberLiteral empty
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test alter view as select
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test alter view as select
public Modifier MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration SimpleName test alter view as select
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
test alter view as select SimpleName MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test alter view as select
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test alter view as select
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
