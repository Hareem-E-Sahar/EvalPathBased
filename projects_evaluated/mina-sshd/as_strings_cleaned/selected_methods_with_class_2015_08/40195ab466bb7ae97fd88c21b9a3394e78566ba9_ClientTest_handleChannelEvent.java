string SimpleName SimpleType SingleVariableDeclaration SimpleName name
channel SimpleName SimpleType SingleVariableDeclaration SimpleName channel
channel SimpleName MethodInvocation SimpleName get id
id SimpleName VariableDeclarationFragment MethodInvocation SimpleName channel
id SimpleName VariableDeclarationFragment MethodInvocation SimpleName get id
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName id
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName channel
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get id
events map SimpleName MethodInvocation SimpleName put
events map SimpleName MethodInvocation SimpleName name
events map SimpleName MethodInvocation SimpleName id
put SimpleName MethodInvocation SimpleName name
put SimpleName MethodInvocation SimpleName id
name SimpleName MethodInvocation SimpleName id
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation StringLiteral handle channel event
log SimpleName MethodInvocation SimpleName name
log SimpleName MethodInvocation SimpleName id
info SimpleName MethodInvocation StringLiteral handle channel event
info SimpleName MethodInvocation SimpleName name
info SimpleName MethodInvocation SimpleName id
handle channel event StringLiteral MethodInvocation SimpleName name
handle channel event StringLiteral MethodInvocation SimpleName id
name SimpleName MethodInvocation SimpleName id
channel failure exception SimpleName SimpleType ClassInstanceCreation SimpleName name
int PrimitiveType VariableDeclarationStatement Block SynchronizedStatement SimpleName events map
private Modifier MethodDeclaration PrimitiveType void
private Modifier MethodDeclaration SimpleName handle channel event
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName name
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName channel
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName channel
private Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
private Modifier MethodDeclaration Block SynchronizedStatement SimpleName events map
void PrimitiveType MethodDeclaration SimpleName handle channel event
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName name
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName channel
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName channel
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
void PrimitiveType MethodDeclaration Block SynchronizedStatement SimpleName events map
handle channel event SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
handle channel event SimpleName MethodDeclaration SingleVariableDeclaration SimpleName name
handle channel event SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName channel
handle channel event SimpleName MethodDeclaration SingleVariableDeclaration SimpleName channel
handle channel event SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
handle channel event SimpleName MethodDeclaration Block SynchronizedStatement SimpleName events map
name SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName channel
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName handle channel event
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName name
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName channel
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName handle channel event
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName name
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName channel
