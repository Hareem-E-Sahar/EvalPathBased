table name SimpleName VariableDeclarationFragment MethodInvocation SimpleName create table
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table name
col dropped SimpleName VariableDeclarationFragment StringLiteral id
final Modifier VariableDeclarationStatement SimpleType SimpleName string
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName col dropped
final Modifier VariableDeclarationStatement VariableDeclarationFragment StringLiteral id
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName col dropped
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment StringLiteral id
alter table StringLiteral InfixExpression SimpleName table name
alter table StringLiteral InfixExpression StringLiteral replace columns name string
table name SimpleName InfixExpression StringLiteral replace columns name string
query SimpleName VariableDeclarationFragment InfixExpression StringLiteral alter table
query SimpleName VariableDeclarationFragment InfixExpression SimpleName table name
query SimpleName VariableDeclarationFragment InfixExpression StringLiteral replace columns name string
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName query
run command SimpleName MethodInvocation SimpleName query
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
hive meta store bridge SimpleName MethodInvocation SimpleName get column qualified name
hive meta store bridge SimpleName MethodInvocation MethodInvocation SimpleName hive meta store bridge
hive meta store bridge SimpleName MethodInvocation MethodInvocation SimpleName get table qualified name
hive meta store bridge SimpleName MethodInvocation MethodInvocation SimpleName cluster name
hive meta store bridge SimpleName MethodInvocation MethodInvocation SimpleName default db
hive meta store bridge SimpleName MethodInvocation MethodInvocation SimpleName table name
hive meta store bridge SimpleName MethodInvocation SimpleName col dropped
get column qualified name SimpleName MethodInvocation MethodInvocation SimpleName hive meta store bridge
get column qualified name SimpleName MethodInvocation MethodInvocation SimpleName get table qualified name
get column qualified name SimpleName MethodInvocation MethodInvocation SimpleName cluster name
get column qualified name SimpleName MethodInvocation MethodInvocation SimpleName default db
get column qualified name SimpleName MethodInvocation MethodInvocation SimpleName table name
get column qualified name SimpleName MethodInvocation SimpleName col dropped
hive meta store bridge SimpleName MethodInvocation MethodInvocation SimpleName col dropped
get table qualified name SimpleName MethodInvocation MethodInvocation SimpleName col dropped
cluster name SimpleName MethodInvocation MethodInvocation SimpleName col dropped
default db SimpleName MethodInvocation MethodInvocation SimpleName col dropped
table name SimpleName MethodInvocation MethodInvocation SimpleName col dropped
assert column is not registered SimpleName MethodInvocation MethodInvocation SimpleName hive meta store bridge
assert column is not registered SimpleName MethodInvocation MethodInvocation SimpleName get column qualified name
assert column is not registered SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName hive meta store bridge
assert column is not registered SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get table qualified name
assert column is not registered SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName cluster name
assert column is not registered SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName default db
assert column is not registered SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName table name
assert column is not registered SimpleName MethodInvocation MethodInvocation SimpleName col dropped
list SimpleName SimpleType ParameterizedType SimpleType SimpleName referenceable
get columns SimpleName MethodInvocation SimpleName default db
get columns SimpleName MethodInvocation SimpleName table name
default db SimpleName MethodInvocation SimpleName table name
columns SimpleName VariableDeclarationFragment MethodInvocation SimpleName get columns
columns SimpleName VariableDeclarationFragment MethodInvocation SimpleName default db
columns SimpleName VariableDeclarationFragment MethodInvocation SimpleName table name
columns SimpleName MethodInvocation SimpleName size
assert equals SimpleName MethodInvocation MethodInvocation SimpleName columns
assert equals SimpleName MethodInvocation MethodInvocation SimpleName size
assert equals SimpleName MethodInvocation NumberLiteral empty
columns SimpleName MethodInvocation MethodInvocation NumberLiteral empty
size SimpleName MethodInvocation MethodInvocation NumberLiteral empty
columns SimpleName MethodInvocation SimpleName get
columns SimpleName MethodInvocation NumberLiteral empty
get SimpleName MethodInvocation NumberLiteral empty
columns SimpleName MethodInvocation MethodInvocation SimpleName get
get SimpleName MethodInvocation MethodInvocation SimpleName get
empty NumberLiteral MethodInvocation MethodInvocation SimpleName get
columns SimpleName MethodInvocation MethodInvocation SimpleName name
get SimpleName MethodInvocation MethodInvocation SimpleName name
empty NumberLiteral MethodInvocation MethodInvocation SimpleName name
get SimpleName MethodInvocation SimpleName name
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName columns
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation NumberLiteral empty
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get
assert equals SimpleName MethodInvocation MethodInvocation SimpleName name
assert equals SimpleName MethodInvocation StringLiteral name
columns SimpleName MethodInvocation MethodInvocation MethodInvocation StringLiteral name
get SimpleName MethodInvocation MethodInvocation MethodInvocation StringLiteral name
empty NumberLiteral MethodInvocation MethodInvocation MethodInvocation StringLiteral name
get SimpleName MethodInvocation MethodInvocation StringLiteral name
name SimpleName MethodInvocation MethodInvocation StringLiteral name
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test alter table drop column
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test alter table drop column
public Modifier MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration Block VariableDeclarationStatement Modifier final
void PrimitiveType MethodDeclaration SimpleName test alter table drop column
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement Modifier final
test alter table drop column SimpleName MethodDeclaration SimpleType SimpleName exception
test alter table drop column SimpleName MethodDeclaration Block VariableDeclarationStatement Modifier final
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test alter table drop column
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test alter table drop column
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
