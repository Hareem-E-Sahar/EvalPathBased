event SimpleName SimpleType SingleVariableDeclaration SimpleName evt
interpreter SimpleName MethodInvocation SimpleName bind object
interpreter SimpleName MethodInvocation StringLiteral event
interpreter SimpleName MethodInvocation SimpleName evt
bind object SimpleName MethodInvocation StringLiteral event
bind object SimpleName MethodInvocation SimpleName evt
event StringLiteral MethodInvocation SimpleName evt
string reader SimpleName SimpleType ClassInstanceCreation StringLiteral test event
interpreter SimpleName MethodInvocation SimpleName evaluate
interpreter SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName string reader
interpreter SimpleName MethodInvocation ClassInstanceCreation StringLiteral test event
evaluate SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName string reader
evaluate SimpleName MethodInvocation ClassInstanceCreation StringLiteral test event
interpreter exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
e SimpleName MethodInvocation SimpleName get message
*** StringLiteral InfixExpression MethodInvocation SimpleName e
*** StringLiteral InfixExpression MethodInvocation SimpleName get message
*** StringLiteral InfixExpression StringLiteral ***
e SimpleName MethodInvocation InfixExpression StringLiteral ***
get message SimpleName MethodInvocation InfixExpression StringLiteral ***
systemerr QualifiedName MethodInvocation SimpleName println
systemerr QualifiedName MethodInvocation InfixExpression StringLiteral ***
systemerr QualifiedName MethodInvocation InfixExpression MethodInvocation SimpleName e
systemerr QualifiedName MethodInvocation InfixExpression MethodInvocation SimpleName get message
systemerr QualifiedName MethodInvocation InfixExpression StringLiteral ***
println SimpleName MethodInvocation InfixExpression StringLiteral ***
println SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName e
println SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get message
println SimpleName MethodInvocation InfixExpression StringLiteral ***
system SimpleName MethodInvocation SimpleName exit
system SimpleName MethodInvocation NumberLiteral empty
exit SimpleName MethodInvocation NumberLiteral empty
io exception SimpleName SimpleType SingleVariableDeclaration SimpleName io
io SimpleName MethodInvocation SimpleName get message
*** StringLiteral InfixExpression MethodInvocation SimpleName io
*** StringLiteral InfixExpression MethodInvocation SimpleName get message
*** StringLiteral InfixExpression StringLiteral ***
io SimpleName MethodInvocation InfixExpression StringLiteral ***
get message SimpleName MethodInvocation InfixExpression StringLiteral ***
systemerr QualifiedName MethodInvocation SimpleName println
systemerr QualifiedName MethodInvocation InfixExpression StringLiteral ***
systemerr QualifiedName MethodInvocation InfixExpression MethodInvocation SimpleName io
systemerr QualifiedName MethodInvocation InfixExpression MethodInvocation SimpleName get message
systemerr QualifiedName MethodInvocation InfixExpression StringLiteral ***
println SimpleName MethodInvocation InfixExpression StringLiteral ***
println SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName io
println SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get message
println SimpleName MethodInvocation InfixExpression StringLiteral ***
system SimpleName MethodInvocation SimpleName exit
system SimpleName MethodInvocation NumberLiteral empty
exit SimpleName MethodInvocation NumberLiteral empty
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName handle event
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName event
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName evt
void PrimitiveType MethodDeclaration SimpleName handle event
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName event
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName evt
handle event SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName event
handle event SimpleName MethodDeclaration SingleVariableDeclaration SimpleName evt
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName handle event
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName evt
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName handle event
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName evt
