ssh client SimpleName MethodInvocation SimpleName set up default client
client SimpleName VariableDeclarationFragment MethodInvocation SimpleName ssh client
client SimpleName VariableDeclarationFragment MethodInvocation SimpleName set up default client
ssh client SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName client
arrays SimpleName MethodInvocation SimpleName as list
arrays SimpleName MethodInvocation ClassInstanceCreation SimpleType QualifiedName client user auth service oldfactory
arrays SimpleName MethodInvocation ClassInstanceCreation SimpleType QualifiedName client connection servicefactory
as list SimpleName MethodInvocation ClassInstanceCreation SimpleType QualifiedName client user auth service oldfactory
as list SimpleName MethodInvocation ClassInstanceCreation SimpleType QualifiedName client connection servicefactory
client SimpleName MethodInvocation SimpleName set service factories
client SimpleName MethodInvocation MethodInvocation SimpleName arrays
client SimpleName MethodInvocation MethodInvocation SimpleName as list
set service factories SimpleName MethodInvocation MethodInvocation SimpleName arrays
set service factories SimpleName MethodInvocation MethodInvocation SimpleName as list
client SimpleName MethodInvocation SimpleName start
client SimpleName MethodInvocation SimpleName connect
client SimpleName MethodInvocation StringLiteral localhost
client SimpleName MethodInvocation SimpleName port
connect SimpleName MethodInvocation StringLiteral localhost
connect SimpleName MethodInvocation SimpleName port
localhost StringLiteral MethodInvocation SimpleName port
client SimpleName MethodInvocation MethodInvocation SimpleName await
connect SimpleName MethodInvocation MethodInvocation SimpleName await
localhost StringLiteral MethodInvocation MethodInvocation SimpleName await
port SimpleName MethodInvocation MethodInvocation SimpleName await
client SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get session
connect SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get session
localhost StringLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName get session
port SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get session
await SimpleName MethodInvocation MethodInvocation SimpleName get session
s SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName await
s SimpleName VariableDeclarationFragment MethodInvocation SimpleName get session
client session SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName s
client sessionclosed QualifiedName InfixExpression QualifiedName client sessionwait auth
s SimpleName MethodInvocation SimpleName wait for
s SimpleName MethodInvocation InfixExpression QualifiedName client sessionclosed
s SimpleName MethodInvocation InfixExpression QualifiedName client sessionwait auth
s SimpleName MethodInvocation NumberLiteral empty
wait for SimpleName MethodInvocation InfixExpression QualifiedName client sessionclosed
wait for SimpleName MethodInvocation InfixExpression QualifiedName client sessionwait auth
wait for SimpleName MethodInvocation NumberLiteral empty
client sessionclosed QualifiedName InfixExpression MethodInvocation NumberLiteral empty
client sessionwait auth QualifiedName InfixExpression MethodInvocation NumberLiteral empty
auth password SimpleName MethodInvocation SimpleName s
auth password SimpleName MethodInvocation StringLiteral smx
auth password SimpleName MethodInvocation StringLiteral smx
s SimpleName MethodInvocation StringLiteral smx
s SimpleName MethodInvocation StringLiteral smx
smx StringLiteral MethodInvocation StringLiteral smx
auth password SimpleName MethodInvocation MethodInvocation SimpleName await
s SimpleName MethodInvocation MethodInvocation SimpleName await
smx StringLiteral MethodInvocation MethodInvocation SimpleName await
smx StringLiteral MethodInvocation MethodInvocation SimpleName await
auth password SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName is success
s SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName is success
smx StringLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName is success
smx StringLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName is success
await SimpleName MethodInvocation MethodInvocation SimpleName is success
assert false SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName await
assert false SimpleName MethodInvocation MethodInvocation SimpleName is success
s SimpleName MethodInvocation SimpleName close
s SimpleName MethodInvocation BooleanLiteral true
close SimpleName MethodInvocation BooleanLiteral true
client SimpleName MethodInvocation SimpleName stop
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test auth password only
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test auth password only
public Modifier MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration SimpleName test auth password only
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
test auth password only SimpleName MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test auth password only
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test auth password only
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
