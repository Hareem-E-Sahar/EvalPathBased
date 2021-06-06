setup db SimpleName MethodInvocation SimpleName hive client
setup db SimpleName MethodInvocation SimpleName test db name
hive client SimpleName MethodInvocation SimpleName test db name
test table name SimpleName InfixExpression StringLiteral empty
table name SimpleName VariableDeclarationFragment InfixExpression SimpleName test table name
table name SimpleName VariableDeclarationFragment InfixExpression StringLiteral empty
final Modifier VariableDeclarationStatement SimpleType SimpleName string
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName table name
final Modifier VariableDeclarationStatement VariableDeclarationFragment InfixExpression SimpleName test table name
final Modifier VariableDeclarationStatement VariableDeclarationFragment InfixExpression StringLiteral empty
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table name
list SimpleName SimpleType ParameterizedType SimpleType SimpleName table
setup tables SimpleName MethodInvocation SimpleName hive client
setup tables SimpleName MethodInvocation SimpleName test db name
setup tables SimpleName MethodInvocation SimpleName test table name
setup tables SimpleName MethodInvocation SimpleName table name
hive client SimpleName MethodInvocation SimpleName test db name
hive client SimpleName MethodInvocation SimpleName test table name
hive client SimpleName MethodInvocation SimpleName table name
test db name SimpleName MethodInvocation SimpleName test table name
test db name SimpleName MethodInvocation SimpleName table name
test table name SimpleName MethodInvocation SimpleName table name
hive tables SimpleName VariableDeclarationFragment MethodInvocation SimpleName setup tables
hive tables SimpleName VariableDeclarationFragment MethodInvocation SimpleName hive client
hive tables SimpleName VariableDeclarationFragment MethodInvocation SimpleName test db name
hive tables SimpleName VariableDeclarationFragment MethodInvocation SimpleName test table name
hive tables SimpleName VariableDeclarationFragment MethodInvocation SimpleName table name
return existing database SimpleName MethodInvocation SimpleName test db name
return existing database SimpleName MethodInvocation SimpleName atlas client
return existing database SimpleName MethodInvocation SimpleName cluster name
test db name SimpleName MethodInvocation SimpleName atlas client
test db name SimpleName MethodInvocation SimpleName cluster name
atlas client SimpleName MethodInvocation SimpleName cluster name
hive client SimpleName MethodInvocation SimpleName get table
hive client SimpleName MethodInvocation SimpleName test db name
hive client SimpleName MethodInvocation SimpleName test table name
get table SimpleName MethodInvocation SimpleName test db name
get table SimpleName MethodInvocation SimpleName test table name
test db name SimpleName MethodInvocation SimpleName test table name
when SimpleName MethodInvocation MethodInvocation SimpleName hive client
when SimpleName MethodInvocation MethodInvocation SimpleName get table
when SimpleName MethodInvocation MethodInvocation SimpleName test db name
when SimpleName MethodInvocation MethodInvocation SimpleName test table name
runtime exception SimpleName SimpleType ClassInstanceCreation StringLiteral timeout while reading data from hive metastore
when SimpleName MethodInvocation MethodInvocation SimpleName then throw
hive client SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName then throw
get table SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName then throw
test db name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName then throw
test table name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName then throw
when SimpleName MethodInvocation MethodInvocation ClassInstanceCreation StringLiteral timeout while reading data from hive metastore
then throw SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName runtime exception
then throw SimpleName MethodInvocation ClassInstanceCreation StringLiteral timeout while reading data from hive metastore
hive data typeshive table QualifiedName MethodInvocation SimpleName get name
hive meta store bridge SimpleName MethodInvocation SimpleName get table dsl query
hive meta store bridge SimpleName MethodInvocation SimpleName cluster name
hive meta store bridge SimpleName MethodInvocation SimpleName test db name
hive meta store bridge SimpleName MethodInvocation SimpleName table name
hive meta store bridge SimpleName MethodInvocation MethodInvocation QualifiedName hive data typeshive table
hive meta store bridge SimpleName MethodInvocation MethodInvocation SimpleName get name
get table dsl query SimpleName MethodInvocation SimpleName cluster name
get table dsl query SimpleName MethodInvocation SimpleName test db name
get table dsl query SimpleName MethodInvocation SimpleName table name
get table dsl query SimpleName MethodInvocation MethodInvocation QualifiedName hive data typeshive table
get table dsl query SimpleName MethodInvocation MethodInvocation SimpleName get name
get table dsl query SimpleName MethodInvocation BooleanLiteral false
cluster name SimpleName MethodInvocation SimpleName test db name
cluster name SimpleName MethodInvocation SimpleName table name
cluster name SimpleName MethodInvocation MethodInvocation QualifiedName hive data typeshive table
cluster name SimpleName MethodInvocation MethodInvocation SimpleName get name
cluster name SimpleName MethodInvocation BooleanLiteral false
test db name SimpleName MethodInvocation SimpleName table name
test db name SimpleName MethodInvocation MethodInvocation QualifiedName hive data typeshive table
test db name SimpleName MethodInvocation MethodInvocation SimpleName get name
test db name SimpleName MethodInvocation BooleanLiteral false
table name SimpleName MethodInvocation MethodInvocation QualifiedName hive data typeshive table
table name SimpleName MethodInvocation MethodInvocation SimpleName get name
table name SimpleName MethodInvocation BooleanLiteral false
hive data typeshive table QualifiedName MethodInvocation MethodInvocation BooleanLiteral false
get name SimpleName MethodInvocation MethodInvocation BooleanLiteral false
atlas client SimpleName MethodInvocation SimpleName search by dsl
atlas client SimpleName MethodInvocation MethodInvocation SimpleName hive meta store bridge
atlas client SimpleName MethodInvocation MethodInvocation SimpleName get table dsl query
atlas client SimpleName MethodInvocation MethodInvocation SimpleName cluster name
atlas client SimpleName MethodInvocation MethodInvocation SimpleName test db name
atlas client SimpleName MethodInvocation MethodInvocation SimpleName table name
atlas client SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName hive data typeshive table
atlas client SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get name
atlas client SimpleName MethodInvocation MethodInvocation BooleanLiteral false
search by dsl SimpleName MethodInvocation MethodInvocation SimpleName hive meta store bridge
search by dsl SimpleName MethodInvocation MethodInvocation SimpleName get table dsl query
search by dsl SimpleName MethodInvocation MethodInvocation SimpleName cluster name
search by dsl SimpleName MethodInvocation MethodInvocation SimpleName test db name
search by dsl SimpleName MethodInvocation MethodInvocation SimpleName table name
search by dsl SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName hive data typeshive table
search by dsl SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get name
search by dsl SimpleName MethodInvocation MethodInvocation BooleanLiteral false
when SimpleName MethodInvocation MethodInvocation SimpleName atlas client
when SimpleName MethodInvocation MethodInvocation SimpleName search by dsl
when SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName hive meta store bridge
when SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get table dsl query
when SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName cluster name
when SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName test db name
when SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName table name
when SimpleName MethodInvocation MethodInvocation MethodInvocation BooleanLiteral false
get entity reference SimpleName MethodInvocation StringLiteral e b - - aa db a e
when SimpleName MethodInvocation MethodInvocation SimpleName then return
atlas client SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName then return
search by dsl SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName then return
when SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get entity reference
when SimpleName MethodInvocation MethodInvocation MethodInvocation StringLiteral e b - - aa db a e
then return SimpleName MethodInvocation MethodInvocation SimpleName get entity reference
then return SimpleName MethodInvocation MethodInvocation StringLiteral e b - - aa db a e
atlas client SimpleName MethodInvocation SimpleName get entity
atlas client SimpleName MethodInvocation StringLiteral e b - - aa db a e
get entity SimpleName MethodInvocation StringLiteral e b - - aa db a e
when SimpleName MethodInvocation MethodInvocation SimpleName atlas client
when SimpleName MethodInvocation MethodInvocation SimpleName get entity
when SimpleName MethodInvocation MethodInvocation StringLiteral e b - - aa db a e
when SimpleName MethodInvocation MethodInvocation SimpleName then return
atlas client SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName then return
get entity SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName then return
e b - - aa db a e StringLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName then return
when SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName create table reference
then return SimpleName MethodInvocation MethodInvocation SimpleName create table reference
hive tables SimpleName MethodInvocation SimpleName get
hive tables SimpleName MethodInvocation NumberLiteral empty
get SimpleName MethodInvocation NumberLiteral empty
hive meta store bridge SimpleName MethodInvocation SimpleName get table qualified name
hive meta store bridge SimpleName MethodInvocation SimpleName cluster name
hive meta store bridge SimpleName MethodInvocation MethodInvocation SimpleName hive tables
hive meta store bridge SimpleName MethodInvocation MethodInvocation SimpleName get
hive meta store bridge SimpleName MethodInvocation MethodInvocation NumberLiteral empty
get table qualified name SimpleName MethodInvocation SimpleName cluster name
get table qualified name SimpleName MethodInvocation MethodInvocation SimpleName hive tables
get table qualified name SimpleName MethodInvocation MethodInvocation SimpleName get
get table qualified name SimpleName MethodInvocation MethodInvocation NumberLiteral empty
cluster name SimpleName MethodInvocation MethodInvocation SimpleName hive tables
cluster name SimpleName MethodInvocation MethodInvocation SimpleName get
cluster name SimpleName MethodInvocation MethodInvocation NumberLiteral empty
process qualified name SimpleName VariableDeclarationFragment MethodInvocation SimpleName hive meta store bridge
process qualified name SimpleName VariableDeclarationFragment MethodInvocation SimpleName get table qualified name
process qualified name SimpleName VariableDeclarationFragment MethodInvocation SimpleName cluster name
process qualified name SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName hive tables
process qualified name SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get
process qualified name SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation NumberLiteral empty
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName process qualified name
hive data typeshive process QualifiedName MethodInvocation SimpleName get name
hive meta store bridge SimpleName MethodInvocation SimpleName get process dsl query
hive meta store bridge SimpleName MethodInvocation MethodInvocation QualifiedName hive data typeshive process
hive meta store bridge SimpleName MethodInvocation MethodInvocation SimpleName get name
hive meta store bridge SimpleName MethodInvocation SimpleName process qualified name
get process dsl query SimpleName MethodInvocation MethodInvocation QualifiedName hive data typeshive process
get process dsl query SimpleName MethodInvocation MethodInvocation SimpleName get name
get process dsl query SimpleName MethodInvocation SimpleName process qualified name
hive data typeshive process QualifiedName MethodInvocation MethodInvocation SimpleName process qualified name
get name SimpleName MethodInvocation MethodInvocation SimpleName process qualified name
atlas client SimpleName MethodInvocation SimpleName search by dsl
atlas client SimpleName MethodInvocation MethodInvocation SimpleName hive meta store bridge
atlas client SimpleName MethodInvocation MethodInvocation SimpleName get process dsl query
atlas client SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName hive data typeshive process
atlas client SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get name
atlas client SimpleName MethodInvocation MethodInvocation SimpleName process qualified name
search by dsl SimpleName MethodInvocation MethodInvocation SimpleName hive meta store bridge
search by dsl SimpleName MethodInvocation MethodInvocation SimpleName get process dsl query
search by dsl SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName hive data typeshive process
search by dsl SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get name
search by dsl SimpleName MethodInvocation MethodInvocation SimpleName process qualified name
when SimpleName MethodInvocation MethodInvocation SimpleName atlas client
when SimpleName MethodInvocation MethodInvocation SimpleName search by dsl
when SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName hive meta store bridge
when SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get process dsl query
when SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName process qualified name
get entity reference SimpleName MethodInvocation StringLiteral e b - - aa db a e
when SimpleName MethodInvocation MethodInvocation SimpleName then return
atlas client SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName then return
search by dsl SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName then return
when SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get entity reference
when SimpleName MethodInvocation MethodInvocation MethodInvocation StringLiteral e b - - aa db a e
then return SimpleName MethodInvocation MethodInvocation SimpleName get entity reference
then return SimpleName MethodInvocation MethodInvocation StringLiteral e b - - aa db a e
hive meta store bridge SimpleName SimpleType ClassInstanceCreation SimpleName cluster name
hive meta store bridge SimpleName SimpleType ClassInstanceCreation SimpleName hive client
hive meta store bridge SimpleName SimpleType ClassInstanceCreation SimpleName atlas client
cluster name SimpleName ClassInstanceCreation SimpleName hive client
cluster name SimpleName ClassInstanceCreation SimpleName atlas client
hive client SimpleName ClassInstanceCreation SimpleName atlas client
bridge SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName hive meta store bridge
bridge SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName cluster name
bridge SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName hive client
bridge SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName atlas client
hive meta store bridge SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName bridge
bridge SimpleName MethodInvocation SimpleName import hive metadata
bridge SimpleName MethodInvocation BooleanLiteral true
import hive metadata SimpleName MethodInvocation BooleanLiteral true
assert SimpleName MethodInvocation SimpleName fail
assert SimpleName MethodInvocation StringLiteral table registration is supposed to fail
fail SimpleName MethodInvocation StringLiteral table registration is supposed to fail
exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test import fails when table registration fails
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test import fails when table registration fails
public Modifier MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration Block VariableDeclarationStatement Modifier final
void PrimitiveType MethodDeclaration SimpleName test import fails when table registration fails
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement Modifier final
test import fails when table registration fails SimpleName MethodDeclaration SimpleType SimpleName exception
test import fails when table registration fails SimpleName MethodDeclaration Block VariableDeclarationStatement Modifier final
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test import fails when table registration fails
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test import fails when table registration fails
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
