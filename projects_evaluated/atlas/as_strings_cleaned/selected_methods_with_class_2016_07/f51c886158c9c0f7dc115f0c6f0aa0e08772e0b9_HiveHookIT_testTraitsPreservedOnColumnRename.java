db name SimpleName VariableDeclarationFragment MethodInvocation SimpleName create database
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName db name
table name SimpleName VariableDeclarationFragment MethodInvocation SimpleName table name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table name
string SimpleName MethodInvocation SimpleName format
string SimpleName MethodInvocation StringLiteral create table ss id int name string
string SimpleName MethodInvocation SimpleName db name
string SimpleName MethodInvocation SimpleName table name
format SimpleName MethodInvocation StringLiteral create table ss id int name string
format SimpleName MethodInvocation SimpleName db name
format SimpleName MethodInvocation SimpleName table name
create table ss id int name string StringLiteral MethodInvocation SimpleName db name
create table ss id int name string StringLiteral MethodInvocation SimpleName table name
db name SimpleName MethodInvocation SimpleName table name
create query SimpleName VariableDeclarationFragment MethodInvocation SimpleName string
create query SimpleName VariableDeclarationFragment MethodInvocation SimpleName format
create query SimpleName VariableDeclarationFragment MethodInvocation StringLiteral create table ss id int name string
create query SimpleName VariableDeclarationFragment MethodInvocation SimpleName db name
create query SimpleName VariableDeclarationFragment MethodInvocation SimpleName table name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName create query
run command SimpleName MethodInvocation SimpleName create query
hive meta store bridge SimpleName MethodInvocation SimpleName get table qualified name
hive meta store bridge SimpleName MethodInvocation SimpleName cluster name
hive meta store bridge SimpleName MethodInvocation SimpleName db name
hive meta store bridge SimpleName MethodInvocation SimpleName table name
get table qualified name SimpleName MethodInvocation SimpleName cluster name
get table qualified name SimpleName MethodInvocation SimpleName db name
get table qualified name SimpleName MethodInvocation SimpleName table name
cluster name SimpleName MethodInvocation SimpleName db name
cluster name SimpleName MethodInvocation SimpleName table name
db name SimpleName MethodInvocation SimpleName table name
tbqn SimpleName VariableDeclarationFragment MethodInvocation SimpleName hive meta store bridge
tbqn SimpleName VariableDeclarationFragment MethodInvocation SimpleName get table qualified name
tbqn SimpleName VariableDeclarationFragment MethodInvocation SimpleName cluster name
tbqn SimpleName VariableDeclarationFragment MethodInvocation SimpleName db name
tbqn SimpleName VariableDeclarationFragment MethodInvocation SimpleName table name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName tbqn
hive meta store bridge SimpleName MethodInvocation SimpleName get column qualified name
hive meta store bridge SimpleName MethodInvocation SimpleName tbqn
hive meta store bridge SimpleName MethodInvocation StringLiteral id
get column qualified name SimpleName MethodInvocation SimpleName tbqn
get column qualified name SimpleName MethodInvocation StringLiteral id
tbqn SimpleName MethodInvocation StringLiteral id
assert column is registered SimpleName MethodInvocation MethodInvocation SimpleName hive meta store bridge
assert column is registered SimpleName MethodInvocation MethodInvocation SimpleName get column qualified name
assert column is registered SimpleName MethodInvocation MethodInvocation SimpleName tbqn
assert column is registered SimpleName MethodInvocation MethodInvocation StringLiteral id
guid SimpleName VariableDeclarationFragment MethodInvocation SimpleName assert column is registered
guid SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName hive meta store bridge
guid SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get column qualified name
guid SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName tbqn
guid SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation StringLiteral id
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName guid
create trait SimpleName MethodInvocation SimpleName guid
trait SimpleName VariableDeclarationFragment MethodInvocation SimpleName create trait
trait SimpleName VariableDeclarationFragment MethodInvocation SimpleName guid
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName trait
old col name SimpleName VariableDeclarationFragment StringLiteral id
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName old col name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment StringLiteral id
new col name SimpleName VariableDeclarationFragment StringLiteral id new
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName new col name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment StringLiteral id new
string SimpleName MethodInvocation SimpleName format
string SimpleName MethodInvocation StringLiteral alter table ss change s s string
string SimpleName MethodInvocation SimpleName db name
string SimpleName MethodInvocation SimpleName table name
string SimpleName MethodInvocation SimpleName old col name
format SimpleName MethodInvocation StringLiteral alter table ss change s s string
format SimpleName MethodInvocation SimpleName db name
format SimpleName MethodInvocation SimpleName table name
format SimpleName MethodInvocation SimpleName old col name
format SimpleName MethodInvocation SimpleName new col name
alter table ss change s s string StringLiteral MethodInvocation SimpleName db name
alter table ss change s s string StringLiteral MethodInvocation SimpleName table name
alter table ss change s s string StringLiteral MethodInvocation SimpleName old col name
alter table ss change s s string StringLiteral MethodInvocation SimpleName new col name
db name SimpleName MethodInvocation SimpleName table name
db name SimpleName MethodInvocation SimpleName old col name
db name SimpleName MethodInvocation SimpleName new col name
table name SimpleName MethodInvocation SimpleName old col name
table name SimpleName MethodInvocation SimpleName new col name
old col name SimpleName MethodInvocation SimpleName new col name
query SimpleName VariableDeclarationFragment MethodInvocation SimpleName string
query SimpleName VariableDeclarationFragment MethodInvocation SimpleName format
query SimpleName VariableDeclarationFragment MethodInvocation StringLiteral alter table ss change s s string
query SimpleName VariableDeclarationFragment MethodInvocation SimpleName db name
query SimpleName VariableDeclarationFragment MethodInvocation SimpleName table name
query SimpleName VariableDeclarationFragment MethodInvocation SimpleName old col name
query SimpleName VariableDeclarationFragment MethodInvocation SimpleName new col name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName query
run command SimpleName MethodInvocation SimpleName query
hive meta store bridge SimpleName MethodInvocation SimpleName get column qualified name
hive meta store bridge SimpleName MethodInvocation SimpleName tbqn
hive meta store bridge SimpleName MethodInvocation StringLiteral id new
get column qualified name SimpleName MethodInvocation SimpleName tbqn
get column qualified name SimpleName MethodInvocation StringLiteral id new
tbqn SimpleName MethodInvocation StringLiteral id new
assert column is registered SimpleName MethodInvocation MethodInvocation SimpleName hive meta store bridge
assert column is registered SimpleName MethodInvocation MethodInvocation SimpleName get column qualified name
assert column is registered SimpleName MethodInvocation MethodInvocation SimpleName tbqn
assert column is registered SimpleName MethodInvocation MethodInvocation StringLiteral id new
guid SimpleName VariableDeclarationFragment MethodInvocation SimpleName assert column is registered
guid SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName hive meta store bridge
guid SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get column qualified name
guid SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName tbqn
guid SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation StringLiteral id new
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName guid
assert equals SimpleName MethodInvocation SimpleName guid
assert equals SimpleName MethodInvocation SimpleName guid
guid SimpleName MethodInvocation SimpleName guid
atlas client SimpleName MethodInvocation SimpleName get entity
atlas client SimpleName MethodInvocation SimpleName guid
get entity SimpleName MethodInvocation SimpleName guid
atlas client SimpleName MethodInvocation MethodInvocation SimpleName get traits
get entity SimpleName MethodInvocation MethodInvocation SimpleName get traits
guid SimpleName MethodInvocation MethodInvocation SimpleName get traits
atlas client SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName contains
get entity SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName contains
guid SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName contains
get traits SimpleName MethodInvocation MethodInvocation SimpleName contains
atlas client SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName trait
get entity SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName trait
guid SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName trait
get traits SimpleName MethodInvocation MethodInvocation SimpleName trait
contains SimpleName MethodInvocation SimpleName trait
assert true SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get traits
assert true SimpleName MethodInvocation MethodInvocation SimpleName contains
assert true SimpleName MethodInvocation MethodInvocation SimpleName trait
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test traits preserved on column rename
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test traits preserved on column rename
public Modifier MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration SimpleName test traits preserved on column rename
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
test traits preserved on column rename SimpleName MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test traits preserved on column rename
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test traits preserved on column rename
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
