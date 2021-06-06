table name SimpleName VariableDeclarationFragment MethodInvocation SimpleName create table
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table name
view name SimpleName VariableDeclarationFragment MethodInvocation SimpleName table name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName view name
new name SimpleName VariableDeclarationFragment MethodInvocation SimpleName table name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName new name
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
alter view StringLiteral InfixExpression SimpleName view name
alter view StringLiteral InfixExpression StringLiteral rename to
alter view StringLiteral InfixExpression SimpleName new name
view name SimpleName InfixExpression StringLiteral rename to
view name SimpleName InfixExpression SimpleName new name
rename to StringLiteral InfixExpression SimpleName new name
query SimpleName Assignment InfixExpression StringLiteral alter view
query SimpleName Assignment InfixExpression SimpleName view name
query SimpleName Assignment InfixExpression StringLiteral rename to
query SimpleName Assignment InfixExpression SimpleName new name
run command SimpleName MethodInvocation SimpleName query
assert table is registered SimpleName MethodInvocation SimpleName default db
assert table is registered SimpleName MethodInvocation SimpleName new name
default db SimpleName MethodInvocation SimpleName new name
assert table is not registered SimpleName MethodInvocation SimpleName default db
assert table is not registered SimpleName MethodInvocation SimpleName view name
default db SimpleName MethodInvocation SimpleName view name
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test alter view rename
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test alter view rename
public Modifier MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration SimpleName test alter view rename
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
test alter view rename SimpleName MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test alter view rename
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test alter view rename
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
