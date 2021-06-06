atlas edge SimpleName SimpleType SingleVariableDeclaration SimpleName edge
log SimpleName MethodInvocation SimpleName is debug enabled
string SimpleName MethodInvocation SimpleName edge
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral ==> remove edge
log SimpleName MethodInvocation MethodInvocation SimpleName string
log SimpleName MethodInvocation MethodInvocation SimpleName edge
debug SimpleName MethodInvocation StringLiteral ==> remove edge
debug SimpleName MethodInvocation MethodInvocation SimpleName string
debug SimpleName MethodInvocation MethodInvocation SimpleName edge
==> remove edge StringLiteral MethodInvocation MethodInvocation SimpleName string
==> remove edge StringLiteral MethodInvocation MethodInvocation SimpleName edge
graph SimpleName MethodInvocation SimpleName remove edge
graph SimpleName MethodInvocation SimpleName edge
remove edge SimpleName MethodInvocation SimpleName edge
log SimpleName MethodInvocation SimpleName is debug enabled
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation StringLiteral <== remove edge
info SimpleName MethodInvocation StringLiteral <== remove edge
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName remove edge
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName atlas edge
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName edge
void PrimitiveType MethodDeclaration SimpleName remove edge
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName atlas edge
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName edge
remove edge SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName atlas edge
remove edge SimpleName MethodDeclaration SingleVariableDeclaration SimpleName edge
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName remove edge
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName edge
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName remove edge
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName edge
