string SimpleName SimpleType SingleVariableDeclaration SimpleName guid
guid lock map SimpleName MethodInvocation SimpleName get
guid lock map SimpleName MethodInvocation SimpleName guid
get SimpleName MethodInvocation SimpleName guid
lock SimpleName VariableDeclarationFragment MethodInvocation SimpleName guid lock map
lock SimpleName VariableDeclarationFragment MethodInvocation SimpleName get
lock SimpleName VariableDeclarationFragment MethodInvocation SimpleName guid
ref counted reentrant lock SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName lock
lock SimpleName MethodInvocation SimpleName is held by current thread
lock SimpleName InfixExpression InfixExpression MethodInvocation SimpleName lock
lock SimpleName InfixExpression InfixExpression MethodInvocation SimpleName is held by current thread
lock SimpleName MethodInvocation SimpleName decrement
ref count SimpleName VariableDeclarationFragment MethodInvocation SimpleName lock
ref count SimpleName VariableDeclarationFragment MethodInvocation SimpleName decrement
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName ref count
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName lock
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName decrement
ref count SimpleName InfixExpression NumberLiteral empty
guid lock map SimpleName MethodInvocation SimpleName remove
guid lock map SimpleName MethodInvocation SimpleName guid
remove SimpleName MethodInvocation SimpleName guid
lock SimpleName MethodInvocation SimpleName unlock
log SimpleName MethodInvocation SimpleName warn
log SimpleName MethodInvocation StringLiteral release locked objects {} attempting to release a lock not held by current thread
log SimpleName MethodInvocation SimpleName guid
warn SimpleName MethodInvocation StringLiteral release locked objects {} attempting to release a lock not held by current thread
warn SimpleName MethodInvocation SimpleName guid
release locked objects {} attempting to release a lock not held by current thread StringLiteral MethodInvocation SimpleName guid
guid lock map SimpleName SynchronizedStatement Block ReturnStatement SimpleName lock
private Modifier MethodDeclaration SimpleType SimpleName ref counted reentrant lock
private Modifier MethodDeclaration SimpleName release object lock
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName guid
private Modifier MethodDeclaration Block SynchronizedStatement SimpleName guid lock map
ref counted reentrant lock SimpleName SimpleType MethodDeclaration SimpleName release object lock
ref counted reentrant lock SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName guid
release object lock SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
release object lock SimpleName MethodDeclaration SingleVariableDeclaration SimpleName guid
release object lock SimpleName MethodDeclaration Block SynchronizedStatement SimpleName guid lock map
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName ref counted reentrant lock
public Modifier TypeDeclaration MethodDeclaration SimpleName release object lock
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName guid
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName ref counted reentrant lock
test SimpleName TypeDeclaration MethodDeclaration SimpleName release object lock
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName guid