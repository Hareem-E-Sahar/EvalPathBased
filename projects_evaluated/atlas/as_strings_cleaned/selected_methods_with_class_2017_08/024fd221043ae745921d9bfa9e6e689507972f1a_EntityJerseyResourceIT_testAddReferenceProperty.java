db StringLiteral InfixExpression MethodInvocation SimpleName random string
db name SimpleName VariableDeclarationFragment InfixExpression StringLiteral db
db name SimpleName VariableDeclarationFragment InfixExpression MethodInvocation SimpleName random string
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName db name
table StringLiteral InfixExpression MethodInvocation SimpleName random string
table name SimpleName VariableDeclarationFragment InfixExpression StringLiteral table
table name SimpleName VariableDeclarationFragment InfixExpression MethodInvocation SimpleName random string
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table name
create hive db instance built in SimpleName MethodInvocation SimpleName db name
hive db instance SimpleName VariableDeclarationFragment MethodInvocation SimpleName create hive db instance built in
hive db instance SimpleName VariableDeclarationFragment MethodInvocation SimpleName db name
referenceable SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName hive db instance
create instance SimpleName MethodInvocation SimpleName hive db instance
db id SimpleName VariableDeclarationFragment MethodInvocation SimpleName create instance
db id SimpleName VariableDeclarationFragment MethodInvocation SimpleName hive db instance
id SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName db id
create hive table instance built in SimpleName MethodInvocation SimpleName db name
create hive table instance built in SimpleName MethodInvocation SimpleName table name
create hive table instance built in SimpleName MethodInvocation SimpleName db id
db name SimpleName MethodInvocation SimpleName table name
db name SimpleName MethodInvocation SimpleName db id
table name SimpleName MethodInvocation SimpleName db id
hive table instance SimpleName VariableDeclarationFragment MethodInvocation SimpleName create hive table instance built in
hive table instance SimpleName VariableDeclarationFragment MethodInvocation SimpleName db name
hive table instance SimpleName VariableDeclarationFragment MethodInvocation SimpleName table name
hive table instance SimpleName VariableDeclarationFragment MethodInvocation SimpleName db id
referenceable SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName hive table instance
create instance SimpleName MethodInvocation SimpleName hive table instance
id SimpleName VariableDeclarationFragment MethodInvocation SimpleName create instance
id SimpleName VariableDeclarationFragment MethodInvocation SimpleName hive table instance
id SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName id
id SimpleName MethodInvocation SimpleName get id
guid SimpleName VariableDeclarationFragment MethodInvocation SimpleName id
guid SimpleName VariableDeclarationFragment MethodInvocation SimpleName get id
final Modifier VariableDeclarationStatement SimpleType SimpleName string
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName guid
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName id
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get id
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName guid
uuid SimpleName MethodInvocation SimpleName from string
uuid SimpleName MethodInvocation SimpleName guid
from string SimpleName MethodInvocation SimpleName guid
assert SimpleName MethodInvocation SimpleName assert not null
assert SimpleName MethodInvocation MethodInvocation SimpleName uuid
assert SimpleName MethodInvocation MethodInvocation SimpleName from string
assert SimpleName MethodInvocation MethodInvocation SimpleName guid
assert not null SimpleName MethodInvocation MethodInvocation SimpleName uuid
assert not null SimpleName MethodInvocation MethodInvocation SimpleName from string
assert not null SimpleName MethodInvocation MethodInvocation SimpleName guid
illegal argument exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
response is not a guid StringLiteral InfixExpression SimpleName guid
assert SimpleName MethodInvocation SimpleName fail
assert SimpleName MethodInvocation InfixExpression StringLiteral response is not a guid
assert SimpleName MethodInvocation InfixExpression SimpleName guid
fail SimpleName MethodInvocation InfixExpression StringLiteral response is not a guid
fail SimpleName MethodInvocation InfixExpression SimpleName guid
db StringLiteral InfixExpression MethodInvocation SimpleName random string
db name SimpleName Assignment InfixExpression StringLiteral db
db name SimpleName Assignment InfixExpression MethodInvocation SimpleName random string
referenceable SimpleName SimpleType ClassInstanceCreation SimpleName database type builtin
database instance SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName referenceable
database instance SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName database type builtin
referenceable SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName database instance
database instance SimpleName MethodInvocation SimpleName set
database instance SimpleName MethodInvocation SimpleName name
database instance SimpleName MethodInvocation SimpleName db name
set SimpleName MethodInvocation SimpleName name
set SimpleName MethodInvocation SimpleName db name
name SimpleName MethodInvocation SimpleName db name
database instance SimpleName MethodInvocation SimpleName set
database instance SimpleName MethodInvocation SimpleName qualified name
database instance SimpleName MethodInvocation SimpleName db name
set SimpleName MethodInvocation SimpleName qualified name
set SimpleName MethodInvocation SimpleName db name
qualified name SimpleName MethodInvocation SimpleName db name
database instance SimpleName MethodInvocation SimpleName set
database instance SimpleName MethodInvocation SimpleName cluster name
database instance SimpleName MethodInvocation MethodInvocation SimpleName random string
set SimpleName MethodInvocation SimpleName cluster name
set SimpleName MethodInvocation MethodInvocation SimpleName random string
cluster name SimpleName MethodInvocation MethodInvocation SimpleName random string
database instance SimpleName MethodInvocation SimpleName set
database instance SimpleName MethodInvocation StringLiteral description
database instance SimpleName MethodInvocation StringLiteral new database
set SimpleName MethodInvocation StringLiteral description
set SimpleName MethodInvocation StringLiteral new database
description StringLiteral MethodInvocation StringLiteral new database
database instance SimpleName MethodInvocation SimpleName set
database instance SimpleName MethodInvocation QualifiedName atlas clientreferenceable attribute name
database instance SimpleName MethodInvocation SimpleName db name
set SimpleName MethodInvocation QualifiedName atlas clientreferenceable attribute name
set SimpleName MethodInvocation SimpleName db name
atlas clientreferenceable attribute name QualifiedName MethodInvocation SimpleName db name
database instance SimpleName MethodInvocation SimpleName set
database instance SimpleName MethodInvocation StringLiteral owner
database instance SimpleName MethodInvocation StringLiteral user
set SimpleName MethodInvocation StringLiteral owner
set SimpleName MethodInvocation StringLiteral user
owner StringLiteral MethodInvocation StringLiteral user
database instance SimpleName MethodInvocation SimpleName set
database instance SimpleName MethodInvocation SimpleName cluster name
database instance SimpleName MethodInvocation StringLiteral cl
set SimpleName MethodInvocation SimpleName cluster name
set SimpleName MethodInvocation StringLiteral cl
cluster name SimpleName MethodInvocation StringLiteral cl
database instance SimpleName MethodInvocation SimpleName set
database instance SimpleName MethodInvocation StringLiteral parameters
database instance SimpleName MethodInvocation QualifiedName collectionsempty map
set SimpleName MethodInvocation StringLiteral parameters
set SimpleName MethodInvocation QualifiedName collectionsempty map
parameters StringLiteral MethodInvocation QualifiedName collectionsempty map
database instance SimpleName MethodInvocation SimpleName set
database instance SimpleName MethodInvocation StringLiteral location
database instance SimpleName MethodInvocation StringLiteral tmp
set SimpleName MethodInvocation StringLiteral location
set SimpleName MethodInvocation StringLiteral tmp
location StringLiteral MethodInvocation StringLiteral tmp
create instance SimpleName MethodInvocation SimpleName database instance
db instance SimpleName VariableDeclarationFragment MethodInvocation SimpleName create instance
db instance SimpleName VariableDeclarationFragment MethodInvocation SimpleName database instance
id SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName db instance
db instance SimpleName MethodInvocation SimpleName get id
new db id SimpleName VariableDeclarationFragment MethodInvocation SimpleName db instance
new db id SimpleName VariableDeclarationFragment MethodInvocation SimpleName get id
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName new db id
atlas client v SimpleName MethodInvocation SimpleName update entity attribute
atlas client v SimpleName MethodInvocation SimpleName guid
atlas client v SimpleName MethodInvocation StringLiteral db
atlas client v SimpleName MethodInvocation SimpleName new db id
update entity attribute SimpleName MethodInvocation SimpleName guid
update entity attribute SimpleName MethodInvocation StringLiteral db
update entity attribute SimpleName MethodInvocation SimpleName new db id
guid SimpleName MethodInvocation StringLiteral db
guid SimpleName MethodInvocation SimpleName new db id
db StringLiteral MethodInvocation SimpleName new db id
entity result SimpleName VariableDeclarationFragment MethodInvocation SimpleName atlas client v
entity result SimpleName VariableDeclarationFragment MethodInvocation SimpleName update entity attribute
entity result SimpleName VariableDeclarationFragment MethodInvocation SimpleName guid
entity result SimpleName VariableDeclarationFragment MethodInvocation StringLiteral db
entity result SimpleName VariableDeclarationFragment MethodInvocation SimpleName new db id
entity result SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName entity result
entity result SimpleName MethodInvocation SimpleName get update entities
entity result SimpleName MethodInvocation MethodInvocation SimpleName size
get update entities SimpleName MethodInvocation MethodInvocation SimpleName size
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName entity result
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get update entities
assert equals SimpleName MethodInvocation MethodInvocation SimpleName size
assert equals SimpleName MethodInvocation NumberLiteral empty
entity result SimpleName MethodInvocation MethodInvocation MethodInvocation NumberLiteral empty
get update entities SimpleName MethodInvocation MethodInvocation MethodInvocation NumberLiteral empty
size SimpleName MethodInvocation MethodInvocation NumberLiteral empty
entity result SimpleName MethodInvocation SimpleName get update entities
entity result SimpleName MethodInvocation MethodInvocation SimpleName get
get update entities SimpleName MethodInvocation MethodInvocation SimpleName get
entity result SimpleName MethodInvocation MethodInvocation NumberLiteral empty
get update entities SimpleName MethodInvocation MethodInvocation NumberLiteral empty
get SimpleName MethodInvocation NumberLiteral empty
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName entity result
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get update entities
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get
assert equals SimpleName MethodInvocation MethodInvocation NumberLiteral empty
assert equals SimpleName MethodInvocation SimpleName new db id
entity result SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName new db id
get update entities SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName new db id
get SimpleName MethodInvocation MethodInvocation SimpleName new db id
empty NumberLiteral MethodInvocation MethodInvocation SimpleName new db id
entity result SimpleName MethodInvocation SimpleName get update entities
entity result SimpleName MethodInvocation MethodInvocation SimpleName get
get update entities SimpleName MethodInvocation MethodInvocation SimpleName get
entity result SimpleName MethodInvocation MethodInvocation NumberLiteral empty
get update entities SimpleName MethodInvocation MethodInvocation NumberLiteral empty
get SimpleName MethodInvocation NumberLiteral empty
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName entity result
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get update entities
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get
assert equals SimpleName MethodInvocation MethodInvocation NumberLiteral empty
assert equals SimpleName MethodInvocation SimpleName guid
entity result SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName guid
get update entities SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName guid
get SimpleName MethodInvocation MethodInvocation SimpleName guid
empty NumberLiteral MethodInvocation MethodInvocation SimpleName guid
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test add reference property
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test add reference property
public Modifier MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration Block VariableDeclarationStatement Modifier final
void PrimitiveType MethodDeclaration SimpleName test add reference property
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement Modifier final
test add reference property SimpleName MethodDeclaration SimpleType SimpleName exception
test add reference property SimpleName MethodDeclaration Block VariableDeclarationStatement Modifier final
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test add reference property
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test add reference property
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception