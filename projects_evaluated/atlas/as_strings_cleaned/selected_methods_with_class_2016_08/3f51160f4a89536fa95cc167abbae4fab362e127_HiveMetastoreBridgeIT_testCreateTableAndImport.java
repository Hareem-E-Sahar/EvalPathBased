table name SimpleName VariableDeclarationFragment MethodInvocation SimpleName table name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table name
create test dfs path SimpleName MethodInvocation StringLiteral parent path
p file SimpleName VariableDeclarationFragment MethodInvocation SimpleName create test dfs path
p file SimpleName VariableDeclarationFragment MethodInvocation StringLiteral parent path
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName p file
string SimpleName MethodInvocation SimpleName format
string SimpleName MethodInvocation StringLiteral create external table sid string cnt int location s
string SimpleName MethodInvocation SimpleName table name
string SimpleName MethodInvocation SimpleName p file
format SimpleName MethodInvocation StringLiteral create external table sid string cnt int location s
format SimpleName MethodInvocation SimpleName table name
format SimpleName MethodInvocation SimpleName p file
create external table sid string cnt int location s StringLiteral MethodInvocation SimpleName table name
create external table sid string cnt int location s StringLiteral MethodInvocation SimpleName p file
table name SimpleName MethodInvocation SimpleName p file
query SimpleName VariableDeclarationFragment MethodInvocation SimpleName string
query SimpleName VariableDeclarationFragment MethodInvocation SimpleName format
query SimpleName VariableDeclarationFragment MethodInvocation StringLiteral create external table sid string cnt int location s
query SimpleName VariableDeclarationFragment MethodInvocation SimpleName table name
query SimpleName VariableDeclarationFragment MethodInvocation SimpleName p file
final Modifier VariableDeclarationStatement SimpleType SimpleName string
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName query
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName string
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName format
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation StringLiteral create external table sid string cnt int location s
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName table name
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName p file
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName query
run command SimpleName MethodInvocation SimpleName query
assert database is registered SimpleName MethodInvocation SimpleName default db
db id SimpleName VariableDeclarationFragment MethodInvocation SimpleName assert database is registered
db id SimpleName VariableDeclarationFragment MethodInvocation SimpleName default db
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName db id
assert table is registered SimpleName MethodInvocation SimpleName default db
assert table is registered SimpleName MethodInvocation SimpleName table name
default db SimpleName MethodInvocation SimpleName table name
table id SimpleName VariableDeclarationFragment MethodInvocation SimpleName assert table is registered
table id SimpleName VariableDeclarationFragment MethodInvocation SimpleName default db
table id SimpleName VariableDeclarationFragment MethodInvocation SimpleName table name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table id
hive data typeshive process QualifiedName MethodInvocation SimpleName get name
get table process qualified name SimpleName MethodInvocation SimpleName default db
get table process qualified name SimpleName MethodInvocation SimpleName table name
default db SimpleName MethodInvocation SimpleName table name
assert entity is registered SimpleName MethodInvocation MethodInvocation QualifiedName hive data typeshive process
assert entity is registered SimpleName MethodInvocation MethodInvocation SimpleName get name
assert entity is registered SimpleName MethodInvocation QualifiedName atlas clientreferenceable attribute name
assert entity is registered SimpleName MethodInvocation MethodInvocation SimpleName get table process qualified name
assert entity is registered SimpleName MethodInvocation MethodInvocation SimpleName default db
assert entity is registered SimpleName MethodInvocation MethodInvocation SimpleName table name
hive data typeshive process QualifiedName MethodInvocation MethodInvocation QualifiedName atlas clientreferenceable attribute name
get name SimpleName MethodInvocation MethodInvocation QualifiedName atlas clientreferenceable attribute name
hive data typeshive process QualifiedName MethodInvocation MethodInvocation MethodInvocation SimpleName get table process qualified name
hive data typeshive process QualifiedName MethodInvocation MethodInvocation MethodInvocation SimpleName default db
hive data typeshive process QualifiedName MethodInvocation MethodInvocation MethodInvocation SimpleName table name
get name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get table process qualified name
get name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName default db
get name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName table name
atlas clientreferenceable attribute name QualifiedName MethodInvocation MethodInvocation SimpleName get table process qualified name
atlas clientreferenceable attribute name QualifiedName MethodInvocation MethodInvocation SimpleName default db
atlas clientreferenceable attribute name QualifiedName MethodInvocation MethodInvocation SimpleName table name
process id SimpleName VariableDeclarationFragment MethodInvocation SimpleName assert entity is registered
process id SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation QualifiedName hive data typeshive process
process id SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get name
process id SimpleName VariableDeclarationFragment MethodInvocation QualifiedName atlas clientreferenceable attribute name
process id SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get table process qualified name
process id SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName default db
process id SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName table name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName process id
atlas client SimpleName MethodInvocation SimpleName get entity
atlas client SimpleName MethodInvocation SimpleName process id
get entity SimpleName MethodInvocation SimpleName process id
process reference SimpleName VariableDeclarationFragment MethodInvocation SimpleName atlas client
process reference SimpleName VariableDeclarationFragment MethodInvocation SimpleName get entity
process reference SimpleName VariableDeclarationFragment MethodInvocation SimpleName process id
referenceable SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName process reference
validate hdfs paths SimpleName MethodInvocation SimpleName process reference
validate hdfs paths SimpleName MethodInvocation SimpleName inputs
validate hdfs paths SimpleName MethodInvocation SimpleName p file
process reference SimpleName MethodInvocation SimpleName inputs
process reference SimpleName MethodInvocation SimpleName p file
inputs SimpleName MethodInvocation SimpleName p file
list SimpleName SimpleType ParameterizedType SimpleType SimpleName id
list SimpleName SimpleType ParameterizedType SimpleType SimpleName id
process reference SimpleName MethodInvocation SimpleName get
process reference SimpleName MethodInvocation SimpleName outputs
get SimpleName MethodInvocation SimpleName outputs
outputs SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName process reference
outputs SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName get
outputs SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName outputs
outputs SimpleName MethodInvocation SimpleName size
assert equals SimpleName MethodInvocation MethodInvocation SimpleName outputs
assert equals SimpleName MethodInvocation MethodInvocation SimpleName size
assert equals SimpleName MethodInvocation NumberLiteral empty
outputs SimpleName MethodInvocation MethodInvocation NumberLiteral empty
size SimpleName MethodInvocation MethodInvocation NumberLiteral empty
outputs SimpleName MethodInvocation SimpleName get
outputs SimpleName MethodInvocation NumberLiteral empty
get SimpleName MethodInvocation NumberLiteral empty
outputs SimpleName MethodInvocation MethodInvocation SimpleName get id
get SimpleName MethodInvocation MethodInvocation SimpleName get id
empty NumberLiteral MethodInvocation MethodInvocation SimpleName get id
outputs SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get id
get SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get id
empty NumberLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName get id
get id SimpleName MethodInvocation MethodInvocation SimpleName get id
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get id
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get id
assert equals SimpleName MethodInvocation SimpleName table id
get id SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName table id
get id SimpleName MethodInvocation MethodInvocation SimpleName table id
hive data typeshive table QualifiedName MethodInvocation SimpleName get name
atlas client SimpleName MethodInvocation SimpleName list entities
atlas client SimpleName MethodInvocation MethodInvocation QualifiedName hive data typeshive table
atlas client SimpleName MethodInvocation MethodInvocation SimpleName get name
list entities SimpleName MethodInvocation MethodInvocation QualifiedName hive data typeshive table
list entities SimpleName MethodInvocation MethodInvocation SimpleName get name
atlas client SimpleName MethodInvocation MethodInvocation SimpleName size
list entities SimpleName MethodInvocation MethodInvocation SimpleName size
hive data typeshive table QualifiedName MethodInvocation MethodInvocation MethodInvocation SimpleName size
get name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName size
table count SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName atlas client
table count SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName list entities
table count SimpleName VariableDeclarationFragment MethodInvocation SimpleName size
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName table count
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName size
atlas client SimpleName MethodInvocation SimpleName get entity
atlas client SimpleName MethodInvocation SimpleName db id
get entity SimpleName MethodInvocation SimpleName db id
hive meta store bridge SimpleName MethodInvocation SimpleName import table
hive meta store bridge SimpleName MethodInvocation MethodInvocation SimpleName atlas client
hive meta store bridge SimpleName MethodInvocation MethodInvocation SimpleName get entity
hive meta store bridge SimpleName MethodInvocation MethodInvocation SimpleName db id
hive meta store bridge SimpleName MethodInvocation SimpleName default db
hive meta store bridge SimpleName MethodInvocation SimpleName table name
hive meta store bridge SimpleName MethodInvocation BooleanLiteral true
import table SimpleName MethodInvocation MethodInvocation SimpleName atlas client
import table SimpleName MethodInvocation MethodInvocation SimpleName get entity
import table SimpleName MethodInvocation MethodInvocation SimpleName db id
import table SimpleName MethodInvocation SimpleName default db
import table SimpleName MethodInvocation SimpleName table name
import table SimpleName MethodInvocation BooleanLiteral true
atlas client SimpleName MethodInvocation MethodInvocation SimpleName default db
get entity SimpleName MethodInvocation MethodInvocation SimpleName default db
db id SimpleName MethodInvocation MethodInvocation SimpleName default db
atlas client SimpleName MethodInvocation MethodInvocation SimpleName table name
get entity SimpleName MethodInvocation MethodInvocation SimpleName table name
db id SimpleName MethodInvocation MethodInvocation SimpleName table name
atlas client SimpleName MethodInvocation MethodInvocation BooleanLiteral true
get entity SimpleName MethodInvocation MethodInvocation BooleanLiteral true
db id SimpleName MethodInvocation MethodInvocation BooleanLiteral true
default db SimpleName MethodInvocation SimpleName table name
default db SimpleName MethodInvocation BooleanLiteral true
table name SimpleName MethodInvocation BooleanLiteral true
assert table is registered SimpleName MethodInvocation SimpleName default db
assert table is registered SimpleName MethodInvocation SimpleName table name
default db SimpleName MethodInvocation SimpleName table name
table id SimpleName VariableDeclarationFragment MethodInvocation SimpleName assert table is registered
table id SimpleName VariableDeclarationFragment MethodInvocation SimpleName default db
table id SimpleName VariableDeclarationFragment MethodInvocation SimpleName table name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table id
assert equals SimpleName MethodInvocation SimpleName table id
assert equals SimpleName MethodInvocation SimpleName table id
table id SimpleName MethodInvocation SimpleName table id
hive data typeshive process QualifiedName MethodInvocation SimpleName get name
get table process qualified name SimpleName MethodInvocation SimpleName default db
get table process qualified name SimpleName MethodInvocation SimpleName table name
default db SimpleName MethodInvocation SimpleName table name
assert entity is registered SimpleName MethodInvocation MethodInvocation QualifiedName hive data typeshive process
assert entity is registered SimpleName MethodInvocation MethodInvocation SimpleName get name
assert entity is registered SimpleName MethodInvocation QualifiedName atlas clientreferenceable attribute name
assert entity is registered SimpleName MethodInvocation MethodInvocation SimpleName get table process qualified name
assert entity is registered SimpleName MethodInvocation MethodInvocation SimpleName default db
assert entity is registered SimpleName MethodInvocation MethodInvocation SimpleName table name
hive data typeshive process QualifiedName MethodInvocation MethodInvocation QualifiedName atlas clientreferenceable attribute name
get name SimpleName MethodInvocation MethodInvocation QualifiedName atlas clientreferenceable attribute name
hive data typeshive process QualifiedName MethodInvocation MethodInvocation MethodInvocation SimpleName get table process qualified name
hive data typeshive process QualifiedName MethodInvocation MethodInvocation MethodInvocation SimpleName default db
hive data typeshive process QualifiedName MethodInvocation MethodInvocation MethodInvocation SimpleName table name
get name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get table process qualified name
get name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName default db
get name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName table name
atlas clientreferenceable attribute name QualifiedName MethodInvocation MethodInvocation SimpleName get table process qualified name
atlas clientreferenceable attribute name QualifiedName MethodInvocation MethodInvocation SimpleName default db
atlas clientreferenceable attribute name QualifiedName MethodInvocation MethodInvocation SimpleName table name
process id SimpleName VariableDeclarationFragment MethodInvocation SimpleName assert entity is registered
process id SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation QualifiedName hive data typeshive process
process id SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get name
process id SimpleName VariableDeclarationFragment MethodInvocation QualifiedName atlas clientreferenceable attribute name
process id SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get table process qualified name
process id SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName default db
process id SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName table name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName process id
assert equals SimpleName MethodInvocation SimpleName process id
assert equals SimpleName MethodInvocation SimpleName process id
process id SimpleName MethodInvocation SimpleName process id
hive data typeshive table QualifiedName MethodInvocation SimpleName get name
atlas client SimpleName MethodInvocation SimpleName list entities
atlas client SimpleName MethodInvocation MethodInvocation QualifiedName hive data typeshive table
atlas client SimpleName MethodInvocation MethodInvocation SimpleName get name
list entities SimpleName MethodInvocation MethodInvocation QualifiedName hive data typeshive table
list entities SimpleName MethodInvocation MethodInvocation SimpleName get name
atlas client SimpleName MethodInvocation MethodInvocation SimpleName size
list entities SimpleName MethodInvocation MethodInvocation SimpleName size
hive data typeshive table QualifiedName MethodInvocation MethodInvocation MethodInvocation SimpleName size
get name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName size
new table count SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName atlas client
new table count SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName list entities
new table count SimpleName VariableDeclarationFragment MethodInvocation SimpleName size
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName new table count
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName size
assert equals SimpleName MethodInvocation SimpleName new table count
assert equals SimpleName MethodInvocation SimpleName table count
new table count SimpleName MethodInvocation SimpleName table count
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test create table and import
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test create table and import
public Modifier MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration Block VariableDeclarationStatement Modifier final
public Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
public Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
void PrimitiveType MethodDeclaration SimpleName test create table and import
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement Modifier final
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
test create table and import SimpleName MethodDeclaration SimpleType SimpleName exception
test create table and import SimpleName MethodDeclaration Block VariableDeclarationStatement Modifier final
test create table and import SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
test create table and import SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test create table and import
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test create table and import
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
