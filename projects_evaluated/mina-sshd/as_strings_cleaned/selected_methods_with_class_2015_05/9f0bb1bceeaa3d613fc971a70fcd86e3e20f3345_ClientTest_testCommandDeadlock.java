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
client session SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName session
session SimpleName MethodInvocation SimpleName add password identity
session SimpleName MethodInvocation StringLiteral smx
add password identity SimpleName MethodInvocation StringLiteral smx
session SimpleName MethodInvocation SimpleName auth
session SimpleName MethodInvocation MethodInvocation SimpleName verify
auth SimpleName MethodInvocation MethodInvocation SimpleName verify
session SimpleName MethodInvocation SimpleName create exec channel
session SimpleName MethodInvocation StringLiteral test
create exec channel SimpleName MethodInvocation StringLiteral test
channel SimpleName VariableDeclarationFragment MethodInvocation SimpleName session
channel SimpleName VariableDeclarationFragment MethodInvocation SimpleName create exec channel
channel SimpleName VariableDeclarationFragment MethodInvocation StringLiteral test
channel exec SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName channel
no close output stream SimpleName SimpleType ClassInstanceCreation QualifiedName systemout
channel SimpleName MethodInvocation SimpleName set out
channel SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName no close output stream
channel SimpleName MethodInvocation ClassInstanceCreation QualifiedName systemout
set out SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName no close output stream
set out SimpleName MethodInvocation ClassInstanceCreation QualifiedName systemout
no close output stream SimpleName SimpleType ClassInstanceCreation QualifiedName systemerr
channel SimpleName MethodInvocation SimpleName set err
channel SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName no close output stream
channel SimpleName MethodInvocation ClassInstanceCreation QualifiedName systemerr
set err SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName no close output stream
set err SimpleName MethodInvocation ClassInstanceCreation QualifiedName systemerr
channel SimpleName MethodInvocation SimpleName open
channel SimpleName MethodInvocation MethodInvocation SimpleName await
open SimpleName MethodInvocation MethodInvocation SimpleName await
thread SimpleName MethodInvocation SimpleName sleep
thread SimpleName MethodInvocation NumberLiteral empty
sleep SimpleName MethodInvocation NumberLiteral empty
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression NumberLiteral empty
channel SimpleName MethodInvocation SimpleName get inverted in
a StringLiteral MethodInvocation SimpleName get bytes
channel SimpleName MethodInvocation MethodInvocation SimpleName write
get inverted in SimpleName MethodInvocation MethodInvocation SimpleName write
channel SimpleName MethodInvocation MethodInvocation MethodInvocation StringLiteral a
channel SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get bytes
get inverted in SimpleName MethodInvocation MethodInvocation MethodInvocation StringLiteral a
get inverted in SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get bytes
write SimpleName MethodInvocation MethodInvocation StringLiteral a
write SimpleName MethodInvocation MethodInvocation SimpleName get bytes
channel SimpleName MethodInvocation SimpleName get inverted in
channel SimpleName MethodInvocation MethodInvocation SimpleName flush
get inverted in SimpleName MethodInvocation MethodInvocation SimpleName flush
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression NumberLiteral empty
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
empty NumberLiteral InfixExpression ForStatement PostfixExpression SimpleName i
ssh exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
channel SimpleName MethodInvocation SimpleName wait for
channel SimpleName MethodInvocation QualifiedName client channelclosed
channel SimpleName MethodInvocation NumberLiteral empty
wait for SimpleName MethodInvocation QualifiedName client channelclosed
wait for SimpleName MethodInvocation NumberLiteral empty
client channelclosed QualifiedName MethodInvocation NumberLiteral empty
channel SimpleName MethodInvocation InfixExpression QualifiedName client channelclosed
wait for SimpleName MethodInvocation InfixExpression QualifiedName client channelclosed
client channelclosed QualifiedName MethodInvocation InfixExpression QualifiedName client channelclosed
empty NumberLiteral MethodInvocation InfixExpression QualifiedName client channelclosed
assert equals SimpleName MethodInvocation QualifiedName client channelclosed
assert equals SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName channel
assert equals SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName wait for
assert equals SimpleName MethodInvocation InfixExpression MethodInvocation QualifiedName client channelclosed
assert equals SimpleName MethodInvocation InfixExpression MethodInvocation NumberLiteral empty
assert equals SimpleName MethodInvocation InfixExpression QualifiedName client channelclosed
client channelclosed QualifiedName MethodInvocation InfixExpression MethodInvocation SimpleName channel
client channelclosed QualifiedName MethodInvocation InfixExpression MethodInvocation SimpleName wait for
client channelclosed QualifiedName MethodInvocation InfixExpression MethodInvocation QualifiedName client channelclosed
client channelclosed QualifiedName MethodInvocation InfixExpression MethodInvocation NumberLiteral empty
client channelclosed QualifiedName MethodInvocation InfixExpression QualifiedName client channelclosed
session SimpleName MethodInvocation SimpleName close
session SimpleName MethodInvocation BooleanLiteral false
close SimpleName MethodInvocation BooleanLiteral false
session SimpleName MethodInvocation MethodInvocation SimpleName await
close SimpleName MethodInvocation MethodInvocation SimpleName await
false BooleanLiteral MethodInvocation MethodInvocation SimpleName await
client SimpleName MethodInvocation SimpleName stop
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test command deadlock
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test command deadlock
public Modifier MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration SimpleName test command deadlock
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
test command deadlock SimpleName MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test command deadlock
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test command deadlock
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
