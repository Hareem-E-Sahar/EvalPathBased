table name SimpleName VariableDeclarationFragment MethodInvocation SimpleName create table
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table name
file SimpleName MethodInvocation SimpleName create temp file
file SimpleName MethodInvocation StringLiteral hiverandom
file SimpleName MethodInvocation StringLiteral tmp
create temp file SimpleName MethodInvocation StringLiteral hiverandom
create temp file SimpleName MethodInvocation StringLiteral tmp
hiverandom StringLiteral MethodInvocation StringLiteral tmp
random local path SimpleName VariableDeclarationFragment MethodInvocation SimpleName file
random local path SimpleName VariableDeclarationFragment MethodInvocation SimpleName create temp file
random local path SimpleName VariableDeclarationFragment MethodInvocation StringLiteral hiverandom
random local path SimpleName VariableDeclarationFragment MethodInvocation StringLiteral tmp
file SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName random local path
random local path SimpleName MethodInvocation SimpleName get absolute path
insert overwrite local directory StringLiteral InfixExpression MethodInvocation SimpleName random local path
insert overwrite local directory StringLiteral InfixExpression MethodInvocation SimpleName get absolute path
insert overwrite local directory StringLiteral InfixExpression StringLiteral select id name from
insert overwrite local directory StringLiteral InfixExpression SimpleName table name
random local path SimpleName MethodInvocation InfixExpression StringLiteral select id name from
get absolute path SimpleName MethodInvocation InfixExpression StringLiteral select id name from
random local path SimpleName MethodInvocation InfixExpression SimpleName table name
get absolute path SimpleName MethodInvocation InfixExpression SimpleName table name
select id name from StringLiteral InfixExpression SimpleName table name
query SimpleName VariableDeclarationFragment InfixExpression StringLiteral insert overwrite local directory
query SimpleName VariableDeclarationFragment InfixExpression MethodInvocation SimpleName random local path
query SimpleName VariableDeclarationFragment InfixExpression MethodInvocation SimpleName get absolute path
query SimpleName VariableDeclarationFragment InfixExpression StringLiteral select id name from
query SimpleName VariableDeclarationFragment InfixExpression SimpleName table name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName query
run command SimpleName MethodInvocation SimpleName query
validate process SimpleName MethodInvocation SimpleName query
validate process SimpleName MethodInvocation NumberLiteral empty
validate process SimpleName MethodInvocation NumberLiteral empty
query SimpleName MethodInvocation NumberLiteral empty
query SimpleName MethodInvocation NumberLiteral empty
empty NumberLiteral MethodInvocation NumberLiteral empty
assert table is registered SimpleName MethodInvocation SimpleName default db
assert table is registered SimpleName MethodInvocation SimpleName table name
default db SimpleName MethodInvocation SimpleName table name
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test insert into local dir
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test insert into local dir
public Modifier MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration SimpleName test insert into local dir
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
test insert into local dir SimpleName MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test insert into local dir
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test insert into local dir
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
