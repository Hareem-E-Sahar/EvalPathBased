sshd SimpleName VariableDeclarationFragment MethodInvocation SimpleName create test server
ssh server SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName sshd
sshd SimpleName MethodInvocation SimpleName set host
sshd SimpleName MethodInvocation StringLiteral localhost
set host SimpleName MethodInvocation StringLiteral localhost
sshd SimpleName MethodInvocation SimpleName start
sshd SimpleName MethodInvocation SimpleName get port
assert not equals SimpleName MethodInvocation NumberLiteral empty
assert not equals SimpleName MethodInvocation MethodInvocation SimpleName sshd
assert not equals SimpleName MethodInvocation MethodInvocation SimpleName get port
empty NumberLiteral MethodInvocation MethodInvocation SimpleName sshd
empty NumberLiteral MethodInvocation MethodInvocation SimpleName get port
sshd SimpleName MethodInvocation SimpleName stop
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test dynamic port
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test dynamic port
public Modifier MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration SimpleName test dynamic port
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
test dynamic port SimpleName MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test dynamic port
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test dynamic port
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
