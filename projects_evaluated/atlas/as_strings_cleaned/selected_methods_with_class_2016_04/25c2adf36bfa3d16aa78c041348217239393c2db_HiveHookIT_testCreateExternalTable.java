table name SimpleName VariableDeclarationFragment MethodInvocation SimpleName table name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table name
db name SimpleName VariableDeclarationFragment MethodInvocation SimpleName create database
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName db name
col name SimpleName VariableDeclarationFragment MethodInvocation SimpleName column name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName col name
create test dfs path SimpleName MethodInvocation StringLiteral parent path
p file SimpleName VariableDeclarationFragment MethodInvocation SimpleName create test dfs path
p file SimpleName VariableDeclarationFragment MethodInvocation StringLiteral parent path
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName p file
col name SimpleName InfixExpression StringLiteral int
string SimpleName MethodInvocation SimpleName format
string SimpleName MethodInvocation StringLiteral create external table ss s s location s
string SimpleName MethodInvocation SimpleName db name
string SimpleName MethodInvocation SimpleName table name
string SimpleName MethodInvocation InfixExpression SimpleName col name
string SimpleName MethodInvocation InfixExpression StringLiteral int
format SimpleName MethodInvocation StringLiteral create external table ss s s location s
format SimpleName MethodInvocation SimpleName db name
format SimpleName MethodInvocation SimpleName table name
format SimpleName MethodInvocation InfixExpression SimpleName col name
format SimpleName MethodInvocation InfixExpression StringLiteral int
format SimpleName MethodInvocation StringLiteral name string
create external table ss s s location s StringLiteral MethodInvocation SimpleName db name
create external table ss s s location s StringLiteral MethodInvocation SimpleName table name
create external table ss s s location s StringLiteral MethodInvocation InfixExpression SimpleName col name
create external table ss s s location s StringLiteral MethodInvocation InfixExpression StringLiteral int
create external table ss s s location s StringLiteral MethodInvocation StringLiteral name string
create external table ss s s location s StringLiteral MethodInvocation SimpleName p file
db name SimpleName MethodInvocation SimpleName table name
db name SimpleName MethodInvocation InfixExpression SimpleName col name
db name SimpleName MethodInvocation InfixExpression StringLiteral int
db name SimpleName MethodInvocation StringLiteral name string
db name SimpleName MethodInvocation SimpleName p file
table name SimpleName MethodInvocation InfixExpression SimpleName col name
table name SimpleName MethodInvocation InfixExpression StringLiteral int
table name SimpleName MethodInvocation StringLiteral name string
table name SimpleName MethodInvocation SimpleName p file
col name SimpleName InfixExpression MethodInvocation StringLiteral name string
int StringLiteral InfixExpression MethodInvocation StringLiteral name string
col name SimpleName InfixExpression MethodInvocation SimpleName p file
int StringLiteral InfixExpression MethodInvocation SimpleName p file
name string StringLiteral MethodInvocation SimpleName p file
query SimpleName VariableDeclarationFragment MethodInvocation SimpleName string
query SimpleName VariableDeclarationFragment MethodInvocation SimpleName format
query SimpleName VariableDeclarationFragment MethodInvocation StringLiteral create external table ss s s location s
query SimpleName VariableDeclarationFragment MethodInvocation SimpleName db name
query SimpleName VariableDeclarationFragment MethodInvocation SimpleName table name
query SimpleName VariableDeclarationFragment MethodInvocation InfixExpression SimpleName col name
query SimpleName VariableDeclarationFragment MethodInvocation InfixExpression StringLiteral int
query SimpleName VariableDeclarationFragment MethodInvocation StringLiteral name string
query SimpleName VariableDeclarationFragment MethodInvocation SimpleName p file
final Modifier VariableDeclarationStatement SimpleType SimpleName string
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName query
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName string
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName format
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation StringLiteral create external table ss s s location s
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName db name
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName table name
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation StringLiteral name string
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName p file
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName query
run command SimpleName MethodInvocation SimpleName query
assert table is registered SimpleName MethodInvocation SimpleName db name
assert table is registered SimpleName MethodInvocation SimpleName table name
db name SimpleName MethodInvocation SimpleName table name
table id SimpleName VariableDeclarationFragment MethodInvocation SimpleName assert table is registered
table id SimpleName VariableDeclarationFragment MethodInvocation SimpleName db name
table id SimpleName VariableDeclarationFragment MethodInvocation SimpleName table name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table id
validate process SimpleName MethodInvocation SimpleName query
validate process SimpleName MethodInvocation NumberLiteral empty
validate process SimpleName MethodInvocation NumberLiteral empty
query SimpleName MethodInvocation NumberLiteral empty
query SimpleName MethodInvocation NumberLiteral empty
empty NumberLiteral MethodInvocation NumberLiteral empty
process reference SimpleName VariableDeclarationFragment MethodInvocation SimpleName validate process
process reference SimpleName VariableDeclarationFragment MethodInvocation SimpleName query
process reference SimpleName VariableDeclarationFragment MethodInvocation NumberLiteral empty
process reference SimpleName VariableDeclarationFragment MethodInvocation NumberLiteral empty
referenceable SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName process reference
verify timestamps SimpleName MethodInvocation SimpleName process reference
verify timestamps SimpleName MethodInvocation StringLiteral start time
process reference SimpleName MethodInvocation StringLiteral start time
verify timestamps SimpleName MethodInvocation SimpleName process reference
verify timestamps SimpleName MethodInvocation StringLiteral end time
process reference SimpleName MethodInvocation StringLiteral end time
validate hdfs paths SimpleName MethodInvocation SimpleName process reference
validate hdfs paths SimpleName MethodInvocation SimpleName p file
validate hdfs paths SimpleName MethodInvocation SimpleName inputs
process reference SimpleName MethodInvocation SimpleName p file
process reference SimpleName MethodInvocation SimpleName inputs
p file SimpleName MethodInvocation SimpleName inputs
validate output tables SimpleName MethodInvocation SimpleName process reference
validate output tables SimpleName MethodInvocation SimpleName table id
process reference SimpleName MethodInvocation SimpleName table id
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test create external table
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test create external table
public Modifier MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration Block VariableDeclarationStatement Modifier final
void PrimitiveType MethodDeclaration SimpleName test create external table
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement Modifier final
test create external table SimpleName MethodDeclaration SimpleType SimpleName exception
test create external table SimpleName MethodDeclaration Block VariableDeclarationStatement Modifier final
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test create external table
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test create external table
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
