ssh client SimpleName MethodInvocation SimpleName set up default client
client SimpleName VariableDeclarationFragment MethodInvocation SimpleName ssh client
client SimpleName VariableDeclarationFragment MethodInvocation SimpleName set up default client
ssh client SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName client
client SimpleName MethodInvocation SimpleName start
client SimpleName MethodInvocation SimpleName connect
client SimpleName MethodInvocation StringLiteral smx
client SimpleName MethodInvocation StringLiteral localhost
client SimpleName MethodInvocation SimpleName port
connect SimpleName MethodInvocation StringLiteral smx
connect SimpleName MethodInvocation StringLiteral localhost
connect SimpleName MethodInvocation SimpleName port
smx StringLiteral MethodInvocation StringLiteral localhost
smx StringLiteral MethodInvocation SimpleName port
localhost StringLiteral MethodInvocation SimpleName port
client SimpleName MethodInvocation MethodInvocation SimpleName await
connect SimpleName MethodInvocation MethodInvocation SimpleName await
smx StringLiteral MethodInvocation MethodInvocation SimpleName await
localhost StringLiteral MethodInvocation MethodInvocation SimpleName await
port SimpleName MethodInvocation MethodInvocation SimpleName await
client SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get session
connect SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get session
smx StringLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName get session
localhost StringLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName get session
port SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get session
await SimpleName MethodInvocation MethodInvocation SimpleName get session
session SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName await
session SimpleName VariableDeclarationFragment MethodInvocation SimpleName get session
client session SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName session
session SimpleName MethodInvocation SimpleName add password identity
session SimpleName MethodInvocation StringLiteral smx
add password identity SimpleName MethodInvocation StringLiteral smx
session SimpleName MethodInvocation SimpleName auth
session SimpleName MethodInvocation MethodInvocation SimpleName verify
auth SimpleName MethodInvocation MethodInvocation SimpleName verify
session SimpleName MethodInvocation MethodInvocation NumberLiteral l
auth SimpleName MethodInvocation MethodInvocation NumberLiteral l
session SimpleName MethodInvocation MethodInvocation QualifiedName time unitseconds
auth SimpleName MethodInvocation MethodInvocation QualifiedName time unitseconds
verify SimpleName MethodInvocation NumberLiteral l
verify SimpleName MethodInvocation QualifiedName time unitseconds
l NumberLiteral MethodInvocation QualifiedName time unitseconds
session SimpleName MethodInvocation SimpleName create channel
session SimpleName MethodInvocation QualifiedName client channelchannel shell
create channel SimpleName MethodInvocation QualifiedName client channelchannel shell
channel SimpleName VariableDeclarationFragment MethodInvocation SimpleName session
channel SimpleName VariableDeclarationFragment MethodInvocation SimpleName create channel
channel SimpleName VariableDeclarationFragment MethodInvocation QualifiedName client channelchannel shell
client channel SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName channel
channel SimpleName MethodInvocation SimpleName wait for
channel SimpleName MethodInvocation QualifiedName client channelclosed
channel SimpleName MethodInvocation SimpleName wait
wait for SimpleName MethodInvocation QualifiedName client channelclosed
wait for SimpleName MethodInvocation SimpleName wait
client channelclosed QualifiedName MethodInvocation SimpleName wait
state SimpleName VariableDeclarationFragment MethodInvocation SimpleName channel
state SimpleName VariableDeclarationFragment MethodInvocation SimpleName wait for
state SimpleName VariableDeclarationFragment MethodInvocation QualifiedName client channelclosed
state SimpleName VariableDeclarationFragment MethodInvocation SimpleName wait
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName state
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName channel
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName wait for
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation QualifiedName client channelclosed
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName wait
client channelclosed QualifiedName InfixExpression QualifiedName client channeleof
assert equals SimpleName MethodInvocation StringLiteral wrong channel state
assert equals SimpleName MethodInvocation InfixExpression QualifiedName client channelclosed
assert equals SimpleName MethodInvocation InfixExpression QualifiedName client channeleof
assert equals SimpleName MethodInvocation SimpleName state
wrong channel state StringLiteral MethodInvocation InfixExpression QualifiedName client channelclosed
wrong channel state StringLiteral MethodInvocation InfixExpression QualifiedName client channeleof
wrong channel state StringLiteral MethodInvocation SimpleName state
client channelclosed QualifiedName InfixExpression MethodInvocation SimpleName state
client channeleof QualifiedName InfixExpression MethodInvocation SimpleName state
channel SimpleName MethodInvocation SimpleName close
channel SimpleName MethodInvocation BooleanLiteral false
close SimpleName MethodInvocation BooleanLiteral false
client SimpleName MethodInvocation SimpleName stop
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test client new
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test client new
public Modifier MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration SimpleName test client new
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
test client new SimpleName MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test client new
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test client new
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
