buffer SimpleName SimpleType SingleVariableDeclaration SimpleName buffer
buffer SimpleName MethodInvocation SimpleName get string
service SimpleName VariableDeclarationFragment MethodInvocation SimpleName buffer
service SimpleName VariableDeclarationFragment MethodInvocation SimpleName get string
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName service
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral received ssh msg service request {}
log SimpleName MethodInvocation SimpleName service
debug SimpleName MethodInvocation StringLiteral received ssh msg service request {}
debug SimpleName MethodInvocation SimpleName service
received ssh msg service request {} StringLiteral MethodInvocation SimpleName service
validate kex state SimpleName MethodInvocation QualifiedName ssh constantsssh msg service request
validate kex state SimpleName MethodInvocation QualifiedName kex statedone
ssh constantsssh msg service request QualifiedName MethodInvocation QualifiedName kex statedone
start service SimpleName MethodInvocation SimpleName service
exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
service StringLiteral InfixExpression SimpleName service
service StringLiteral InfixExpression StringLiteral rejected
service SimpleName InfixExpression StringLiteral rejected
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation InfixExpression StringLiteral service
log SimpleName MethodInvocation InfixExpression SimpleName service
log SimpleName MethodInvocation InfixExpression StringLiteral rejected
log SimpleName MethodInvocation SimpleName e
debug SimpleName MethodInvocation InfixExpression StringLiteral service
debug SimpleName MethodInvocation InfixExpression SimpleName service
debug SimpleName MethodInvocation InfixExpression StringLiteral rejected
debug SimpleName MethodInvocation SimpleName e
service StringLiteral InfixExpression MethodInvocation SimpleName e
service SimpleName InfixExpression MethodInvocation SimpleName e
rejected StringLiteral InfixExpression MethodInvocation SimpleName e
bad service request StringLiteral InfixExpression SimpleName service
disconnect SimpleName MethodInvocation QualifiedName ssh constantsssh disconnect service not available
disconnect SimpleName MethodInvocation InfixExpression StringLiteral bad service request
disconnect SimpleName MethodInvocation InfixExpression SimpleName service
ssh constantsssh disconnect service not available QualifiedName MethodInvocation InfixExpression StringLiteral bad service request
ssh constantsssh disconnect service not available QualifiedName MethodInvocation InfixExpression SimpleName service
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral accepted service {}
log SimpleName MethodInvocation SimpleName service
debug SimpleName MethodInvocation StringLiteral accepted service {}
debug SimpleName MethodInvocation SimpleName service
accepted service {} StringLiteral MethodInvocation SimpleName service
create buffer SimpleName MethodInvocation QualifiedName ssh constantsssh msg service accept
response SimpleName VariableDeclarationFragment MethodInvocation SimpleName create buffer
response SimpleName VariableDeclarationFragment MethodInvocation QualifiedName ssh constantsssh msg service accept
buffer SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName response
response SimpleName MethodInvocation SimpleName put string
response SimpleName MethodInvocation SimpleName service
put string SimpleName MethodInvocation SimpleName service
write packet SimpleName MethodInvocation SimpleName response
private Modifier MethodDeclaration PrimitiveType void
private Modifier MethodDeclaration SimpleName handle service request
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName buffer
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName buffer
private Modifier MethodDeclaration SimpleType SimpleName io exception
void PrimitiveType MethodDeclaration SimpleName handle service request
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName buffer
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName buffer
void PrimitiveType MethodDeclaration SimpleType SimpleName io exception
handle service request SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName buffer
handle service request SimpleName MethodDeclaration SingleVariableDeclaration SimpleName buffer
handle service request SimpleName MethodDeclaration SimpleType SimpleName io exception
buffer SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName handle service request
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName buffer
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName handle service request
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName buffer
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
