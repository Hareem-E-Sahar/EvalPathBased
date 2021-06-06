wc SimpleName VariableDeclarationFragment SuperMethodInvocation SimpleName get top key
key SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName wc
prefix SimpleName InfixExpression StringLiteral get top key -->
prefix SimpleName InfixExpression SimpleName wc
get top key --> StringLiteral InfixExpression SimpleName wc
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation InfixExpression SimpleName prefix
log SimpleName MethodInvocation InfixExpression StringLiteral get top key -->
log SimpleName MethodInvocation InfixExpression SimpleName wc
debug SimpleName MethodInvocation InfixExpression SimpleName prefix
debug SimpleName MethodInvocation InfixExpression StringLiteral get top key -->
debug SimpleName MethodInvocation InfixExpression SimpleName wc
override SimpleName MarkerAnnotation MethodDeclaration Modifier public
override SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName key
override SimpleName MarkerAnnotation MethodDeclaration SimpleName get top key
public Modifier MethodDeclaration SimpleType SimpleName key
public Modifier MethodDeclaration SimpleName get top key
public Modifier MethodDeclaration Block ReturnStatement SimpleName wc
key SimpleName SimpleType MethodDeclaration SimpleName get top key
get top key SimpleName MethodDeclaration Block ReturnStatement SimpleName wc
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName override
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName key
public Modifier TypeDeclaration MethodDeclaration SimpleName get top key
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName override
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName key
test SimpleName TypeDeclaration MethodDeclaration SimpleName get top key
