db StringLiteral InfixExpression MethodInvocation SimpleName random
db name SimpleName VariableDeclarationFragment InfixExpression StringLiteral db
db name SimpleName VariableDeclarationFragment InfixExpression MethodInvocation SimpleName random
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName db name
create database StringLiteral InfixExpression SimpleName db name
create database StringLiteral InfixExpression StringLiteral with dbproperties p v )
db name SimpleName InfixExpression StringLiteral with dbproperties p v )
run command SimpleName MethodInvocation InfixExpression StringLiteral create database
run command SimpleName MethodInvocation InfixExpression SimpleName db name
run command SimpleName MethodInvocation InfixExpression StringLiteral with dbproperties p v )
num tables SimpleName VariableDeclarationFragment NumberLiteral empty
final Modifier VariableDeclarationStatement PrimitiveType int
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName num tables
final Modifier VariableDeclarationStatement VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName num tables
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment NumberLiteral empty
string SimpleName SimpleType ArrayType ArrayCreation SimpleName num tables
table names SimpleName VariableDeclarationFragment ArrayCreation SimpleName num tables
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression SimpleName num tables
table names SimpleName ArrayAccess SimpleName i
create table SimpleName MethodInvocation BooleanLiteral true
create table SimpleName MethodInvocation BooleanLiteral true
create table SimpleName MethodInvocation BooleanLiteral false
true BooleanLiteral MethodInvocation BooleanLiteral true
true BooleanLiteral MethodInvocation BooleanLiteral false
true BooleanLiteral MethodInvocation BooleanLiteral false
table names SimpleName ArrayAccess Assignment MethodInvocation SimpleName create table
table names SimpleName ArrayAccess Assignment MethodInvocation BooleanLiteral true
table names SimpleName ArrayAccess Assignment MethodInvocation BooleanLiteral true
table names SimpleName ArrayAccess Assignment MethodInvocation BooleanLiteral false
i SimpleName ArrayAccess Assignment MethodInvocation SimpleName create table
i SimpleName ArrayAccess Assignment MethodInvocation BooleanLiteral true
i SimpleName ArrayAccess Assignment MethodInvocation BooleanLiteral true
i SimpleName ArrayAccess Assignment MethodInvocation BooleanLiteral false
table names SimpleName ArrayAccess SimpleName i
string SimpleName MethodInvocation SimpleName format
string SimpleName MethodInvocation StringLiteral drop table s
string SimpleName MethodInvocation ArrayAccess SimpleName table names
string SimpleName MethodInvocation ArrayAccess SimpleName i
format SimpleName MethodInvocation StringLiteral drop table s
format SimpleName MethodInvocation ArrayAccess SimpleName table names
format SimpleName MethodInvocation ArrayAccess SimpleName i
drop table s StringLiteral MethodInvocation ArrayAccess SimpleName table names
drop table s StringLiteral MethodInvocation ArrayAccess SimpleName i
query SimpleName VariableDeclarationFragment MethodInvocation SimpleName string
query SimpleName VariableDeclarationFragment MethodInvocation SimpleName format
query SimpleName VariableDeclarationFragment MethodInvocation StringLiteral drop table s
query SimpleName VariableDeclarationFragment MethodInvocation ArrayAccess SimpleName table names
query SimpleName VariableDeclarationFragment MethodInvocation ArrayAccess SimpleName i
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName query
run command SimpleName MethodInvocation SimpleName query
table names SimpleName ArrayAccess SimpleName i
assert table is not registered SimpleName MethodInvocation SimpleName db name
assert table is not registered SimpleName MethodInvocation ArrayAccess SimpleName table names
assert table is not registered SimpleName MethodInvocation ArrayAccess SimpleName i
db name SimpleName MethodInvocation ArrayAccess SimpleName table names
db name SimpleName MethodInvocation ArrayAccess SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName num tables
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
num tables SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
string SimpleName MethodInvocation SimpleName format
string SimpleName MethodInvocation StringLiteral drop database s
string SimpleName MethodInvocation SimpleName db name
format SimpleName MethodInvocation StringLiteral drop database s
format SimpleName MethodInvocation SimpleName db name
drop database s StringLiteral MethodInvocation SimpleName db name
query SimpleName VariableDeclarationFragment MethodInvocation SimpleName string
query SimpleName VariableDeclarationFragment MethodInvocation SimpleName format
query SimpleName VariableDeclarationFragment MethodInvocation StringLiteral drop database s
query SimpleName VariableDeclarationFragment MethodInvocation SimpleName db name
final Modifier VariableDeclarationStatement SimpleType SimpleName string
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName query
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName string
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName format
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation StringLiteral drop database s
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName db name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName query
run command SimpleName MethodInvocation SimpleName query
hive meta store bridge SimpleName MethodInvocation SimpleName get db qualified name
hive meta store bridge SimpleName MethodInvocation SimpleName cluster name
hive meta store bridge SimpleName MethodInvocation SimpleName db name
get db qualified name SimpleName MethodInvocation SimpleName cluster name
get db qualified name SimpleName MethodInvocation SimpleName db name
cluster name SimpleName MethodInvocation SimpleName db name
db qualified name SimpleName VariableDeclarationFragment MethodInvocation SimpleName hive meta store bridge
db qualified name SimpleName VariableDeclarationFragment MethodInvocation SimpleName get db qualified name
db qualified name SimpleName VariableDeclarationFragment MethodInvocation SimpleName cluster name
db qualified name SimpleName VariableDeclarationFragment MethodInvocation SimpleName db name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName db qualified name
thread SimpleName MethodInvocation SimpleName sleep
thread SimpleName MethodInvocation NumberLiteral empty
sleep SimpleName MethodInvocation NumberLiteral empty
hive data typeshive db QualifiedName MethodInvocation SimpleName get name
atlas client SimpleName MethodInvocation SimpleName get entity
atlas client SimpleName MethodInvocation MethodInvocation QualifiedName hive data typeshive db
atlas client SimpleName MethodInvocation MethodInvocation SimpleName get name
atlas client SimpleName MethodInvocation QualifiedName atlas clientreferenceable attribute name
atlas client SimpleName MethodInvocation SimpleName db qualified name
get entity SimpleName MethodInvocation MethodInvocation QualifiedName hive data typeshive db
get entity SimpleName MethodInvocation MethodInvocation SimpleName get name
get entity SimpleName MethodInvocation QualifiedName atlas clientreferenceable attribute name
get entity SimpleName MethodInvocation SimpleName db qualified name
hive data typeshive db QualifiedName MethodInvocation MethodInvocation QualifiedName atlas clientreferenceable attribute name
get name SimpleName MethodInvocation MethodInvocation QualifiedName atlas clientreferenceable attribute name
hive data typeshive db QualifiedName MethodInvocation MethodInvocation SimpleName db qualified name
get name SimpleName MethodInvocation MethodInvocation SimpleName db qualified name
atlas clientreferenceable attribute name QualifiedName MethodInvocation SimpleName db qualified name
atlas service exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
e SimpleName MethodInvocation SimpleName get status
e SimpleName MethodInvocation InfixExpression QualifiedName client responsestatusnot found
get status SimpleName MethodInvocation InfixExpression QualifiedName client responsestatusnot found
hive data typeshive db QualifiedName MethodInvocation SimpleName get name
string SimpleName MethodInvocation SimpleName format
string SimpleName MethodInvocation StringLiteral entity was not supposed to exist for type name = s attribute name = s attribute value = s
string SimpleName MethodInvocation MethodInvocation QualifiedName hive data typeshive db
string SimpleName MethodInvocation MethodInvocation SimpleName get name
string SimpleName MethodInvocation QualifiedName atlas clientreferenceable attribute name
string SimpleName MethodInvocation SimpleName db qualified name
format SimpleName MethodInvocation StringLiteral entity was not supposed to exist for type name = s attribute name = s attribute value = s
format SimpleName MethodInvocation MethodInvocation QualifiedName hive data typeshive db
format SimpleName MethodInvocation MethodInvocation SimpleName get name
format SimpleName MethodInvocation QualifiedName atlas clientreferenceable attribute name
format SimpleName MethodInvocation SimpleName db qualified name
entity was not supposed to exist for type name = s attribute name = s attribute value = s StringLiteral MethodInvocation MethodInvocation QualifiedName hive data typeshive db
entity was not supposed to exist for type name = s attribute name = s attribute value = s StringLiteral MethodInvocation MethodInvocation SimpleName get name
entity was not supposed to exist for type name = s attribute name = s attribute value = s StringLiteral MethodInvocation QualifiedName atlas clientreferenceable attribute name
entity was not supposed to exist for type name = s attribute name = s attribute value = s StringLiteral MethodInvocation SimpleName db qualified name
hive data typeshive db QualifiedName MethodInvocation MethodInvocation QualifiedName atlas clientreferenceable attribute name
get name SimpleName MethodInvocation MethodInvocation QualifiedName atlas clientreferenceable attribute name
hive data typeshive db QualifiedName MethodInvocation MethodInvocation SimpleName db qualified name
get name SimpleName MethodInvocation MethodInvocation SimpleName db qualified name
atlas clientreferenceable attribute name QualifiedName MethodInvocation SimpleName db qualified name
fail SimpleName MethodInvocation MethodInvocation SimpleName string
fail SimpleName MethodInvocation MethodInvocation SimpleName format
fail SimpleName MethodInvocation MethodInvocation StringLiteral entity was not supposed to exist for type name = s attribute name = s attribute value = s
fail SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName hive data typeshive db
fail SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get name
fail SimpleName MethodInvocation MethodInvocation QualifiedName atlas clientreferenceable attribute name
fail SimpleName MethodInvocation MethodInvocation SimpleName db qualified name
final Modifier VariableDeclarationStatement Block VariableDeclarationStatement Modifier final
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement Modifier final
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test drop database without cascade
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test drop database without cascade
public Modifier MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration Block VariableDeclarationStatement Modifier final
public Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
public Modifier MethodDeclaration Block VariableDeclarationStatement Modifier final
void PrimitiveType MethodDeclaration SimpleName test drop database without cascade
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement Modifier final
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement Modifier final
test drop database without cascade SimpleName MethodDeclaration SimpleType SimpleName exception
test drop database without cascade SimpleName MethodDeclaration Block VariableDeclarationStatement Modifier final
test drop database without cascade SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
test drop database without cascade SimpleName MethodDeclaration Block VariableDeclarationStatement Modifier final
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test drop database without cascade
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test drop database without cascade
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
