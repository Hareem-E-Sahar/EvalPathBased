log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation StringLiteral ==> stop consumer threads
info SimpleName MethodInvocation StringLiteral ==> stop consumer threads
hook consumer SimpleName SimpleType SingleVariableDeclaration SimpleName consumer
consumer SimpleName MethodInvocation SimpleName shutdown
hook consumer SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName consumers
consumer SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName consumers
consumers SimpleName MethodInvocation SimpleName clear
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation StringLiteral <== stop consumer threads
info SimpleName MethodInvocation StringLiteral <== stop consumer threads
private Modifier MethodDeclaration PrimitiveType void
private Modifier MethodDeclaration SimpleName stop consumer threads
void PrimitiveType MethodDeclaration SimpleName stop consumer threads
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName stop consumer threads
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName stop consumer threads
