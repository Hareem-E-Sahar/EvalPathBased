table name SimpleName VariableDeclarationFragment MethodInvocation SimpleName table name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table name
db name SimpleName VariableDeclarationFragment MethodInvocation SimpleName create database
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName db name
col StringLiteral InfixExpression MethodInvocation SimpleName random
col name SimpleName VariableDeclarationFragment InfixExpression StringLiteral col
col name SimpleName VariableDeclarationFragment InfixExpression MethodInvocation SimpleName random
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName col name
create table StringLiteral InfixExpression SimpleName db name
create table StringLiteral InfixExpression StringLiteral .
create table StringLiteral InfixExpression SimpleName table name
create table StringLiteral InfixExpression StringLiteral (
create table StringLiteral InfixExpression SimpleName col name
db name SimpleName InfixExpression StringLiteral .
db name SimpleName InfixExpression SimpleName table name
db name SimpleName InfixExpression StringLiteral (
db name SimpleName InfixExpression SimpleName col name
db name SimpleName InfixExpression StringLiteral int name string
. StringLiteral InfixExpression SimpleName table name
. StringLiteral InfixExpression StringLiteral (
. StringLiteral InfixExpression SimpleName col name
. StringLiteral InfixExpression StringLiteral int name string
table name SimpleName InfixExpression StringLiteral (
table name SimpleName InfixExpression SimpleName col name
table name SimpleName InfixExpression StringLiteral int name string
( StringLiteral InfixExpression SimpleName col name
( StringLiteral InfixExpression StringLiteral int name string
col name SimpleName InfixExpression StringLiteral int name string
run command SimpleName MethodInvocation InfixExpression StringLiteral create table
run command SimpleName MethodInvocation InfixExpression SimpleName db name
run command SimpleName MethodInvocation InfixExpression StringLiteral .
run command SimpleName MethodInvocation InfixExpression SimpleName table name
run command SimpleName MethodInvocation InfixExpression StringLiteral (
run command SimpleName MethodInvocation InfixExpression SimpleName col name
run command SimpleName MethodInvocation InfixExpression StringLiteral int name string
assert table is registered SimpleName MethodInvocation SimpleName db name
assert table is registered SimpleName MethodInvocation SimpleName table name
db name SimpleName MethodInvocation SimpleName table name
assert column is registered SimpleName MethodInvocation SimpleName col name
table name SimpleName Assignment MethodInvocation SimpleName create table
assert table is registered SimpleName MethodInvocation SimpleName default db
assert table is registered SimpleName MethodInvocation SimpleName table name
default db SimpleName MethodInvocation SimpleName table name
table id SimpleName VariableDeclarationFragment MethodInvocation SimpleName assert table is registered
table id SimpleName VariableDeclarationFragment MethodInvocation SimpleName default db
table id SimpleName VariableDeclarationFragment MethodInvocation SimpleName table name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table id
dgi c lient SimpleName MethodInvocation SimpleName get entity
dgi c lient SimpleName MethodInvocation SimpleName table id
get entity SimpleName MethodInvocation SimpleName table id
table ref SimpleName VariableDeclarationFragment MethodInvocation SimpleName dgi c lient
table ref SimpleName VariableDeclarationFragment MethodInvocation SimpleName get entity
table ref SimpleName VariableDeclarationFragment MethodInvocation SimpleName table id
referenceable SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table ref
table ref SimpleName MethodInvocation SimpleName get
table ref SimpleName MethodInvocation StringLiteral table type
get SimpleName MethodInvocation StringLiteral table type
table typemanaged table QualifiedName MethodInvocation SimpleName name
assert SimpleName MethodInvocation SimpleName assert equals
assert SimpleName MethodInvocation MethodInvocation SimpleName table ref
assert SimpleName MethodInvocation MethodInvocation SimpleName get
assert SimpleName MethodInvocation MethodInvocation StringLiteral table type
assert SimpleName MethodInvocation MethodInvocation QualifiedName table typemanaged table
assert SimpleName MethodInvocation MethodInvocation SimpleName name
assert equals SimpleName MethodInvocation MethodInvocation SimpleName table ref
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get
assert equals SimpleName MethodInvocation MethodInvocation StringLiteral table type
assert equals SimpleName MethodInvocation MethodInvocation QualifiedName table typemanaged table
assert equals SimpleName MethodInvocation MethodInvocation SimpleName name
table ref SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName table typemanaged table
table ref SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName name
get SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName table typemanaged table
get SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName name
table type StringLiteral MethodInvocation MethodInvocation MethodInvocation QualifiedName table typemanaged table
table type StringLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName name
table ref SimpleName MethodInvocation SimpleName get
table ref SimpleName MethodInvocation QualifiedName hive data model generatorcomment
get SimpleName MethodInvocation QualifiedName hive data model generatorcomment
assert SimpleName MethodInvocation SimpleName assert equals
assert SimpleName MethodInvocation MethodInvocation SimpleName table ref
assert SimpleName MethodInvocation MethodInvocation SimpleName get
assert SimpleName MethodInvocation MethodInvocation QualifiedName hive data model generatorcomment
assert SimpleName MethodInvocation StringLiteral table comment
assert equals SimpleName MethodInvocation MethodInvocation SimpleName table ref
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get
assert equals SimpleName MethodInvocation MethodInvocation QualifiedName hive data model generatorcomment
assert equals SimpleName MethodInvocation StringLiteral table comment
table ref SimpleName MethodInvocation MethodInvocation StringLiteral table comment
get SimpleName MethodInvocation MethodInvocation StringLiteral table comment
hive data model generatorcomment QualifiedName MethodInvocation MethodInvocation StringLiteral table comment
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
entity name SimpleName VariableDeclarationFragment MethodInvocation SimpleName hive meta store bridge
entity name SimpleName VariableDeclarationFragment MethodInvocation SimpleName get table qualified name
entity name SimpleName VariableDeclarationFragment MethodInvocation SimpleName cluster name
entity name SimpleName VariableDeclarationFragment MethodInvocation SimpleName default db
entity name SimpleName VariableDeclarationFragment MethodInvocation SimpleName table name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName entity name
table ref SimpleName MethodInvocation SimpleName get
table ref SimpleName MethodInvocation QualifiedName hive data model generatorname
get SimpleName MethodInvocation QualifiedName hive data model generatorname
assert SimpleName MethodInvocation SimpleName assert equals
assert SimpleName MethodInvocation MethodInvocation SimpleName table ref
assert SimpleName MethodInvocation MethodInvocation SimpleName get
assert SimpleName MethodInvocation MethodInvocation QualifiedName hive data model generatorname
assert SimpleName MethodInvocation SimpleName entity name
assert equals SimpleName MethodInvocation MethodInvocation SimpleName table ref
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get
assert equals SimpleName MethodInvocation MethodInvocation QualifiedName hive data model generatorname
assert equals SimpleName MethodInvocation SimpleName entity name
table ref SimpleName MethodInvocation MethodInvocation SimpleName entity name
get SimpleName MethodInvocation MethodInvocation SimpleName entity name
hive data model generatorname QualifiedName MethodInvocation MethodInvocation SimpleName entity name
table ref SimpleName MethodInvocation SimpleName get
table ref SimpleName MethodInvocation StringLiteral sd
get SimpleName MethodInvocation StringLiteral sd
referenceable SimpleName SimpleType CastExpression MethodInvocation SimpleName table ref
referenceable SimpleName SimpleType CastExpression MethodInvocation SimpleName get
referenceable SimpleName SimpleType CastExpression MethodInvocation StringLiteral sd
sd ref SimpleName VariableDeclarationFragment CastExpression SimpleType SimpleName referenceable
sd ref SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName table ref
sd ref SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName get
sd ref SimpleName VariableDeclarationFragment CastExpression MethodInvocation StringLiteral sd
final Modifier VariableDeclarationStatement SimpleType SimpleName referenceable
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName sd ref
referenceable SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName sd ref
sd ref SimpleName MethodInvocation SimpleName get
sd ref SimpleName MethodInvocation QualifiedName hive data model generatorstorage is stored as sub dirs
get SimpleName MethodInvocation QualifiedName hive data model generatorstorage is stored as sub dirs
assert SimpleName MethodInvocation SimpleName assert equals
assert SimpleName MethodInvocation MethodInvocation SimpleName sd ref
assert SimpleName MethodInvocation MethodInvocation SimpleName get
assert SimpleName MethodInvocation MethodInvocation QualifiedName hive data model generatorstorage is stored as sub dirs
assert SimpleName MethodInvocation BooleanLiteral false
assert equals SimpleName MethodInvocation MethodInvocation SimpleName sd ref
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get
assert equals SimpleName MethodInvocation MethodInvocation QualifiedName hive data model generatorstorage is stored as sub dirs
assert equals SimpleName MethodInvocation BooleanLiteral false
sd ref SimpleName MethodInvocation MethodInvocation BooleanLiteral false
get SimpleName MethodInvocation MethodInvocation BooleanLiteral false
hive data model generatorstorage is stored as sub dirs QualifiedName MethodInvocation MethodInvocation BooleanLiteral false
assert database is registered SimpleName MethodInvocation SimpleName default db
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test create table
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test create table
public Modifier MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration Block VariableDeclarationStatement Modifier final
void PrimitiveType MethodDeclaration SimpleName test create table
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement Modifier final
test create table SimpleName MethodDeclaration SimpleType SimpleName exception
test create table SimpleName MethodDeclaration Block VariableDeclarationStatement Modifier final
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test create table
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test create table
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception