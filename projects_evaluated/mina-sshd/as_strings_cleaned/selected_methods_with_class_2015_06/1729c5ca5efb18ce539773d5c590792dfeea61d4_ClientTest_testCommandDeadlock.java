client SimpleName MethodInvocation SimpleName start
client SimpleName MethodInvocation SimpleName connect
client SimpleName MethodInvocation MethodInvocation SimpleName get current test name
client SimpleName MethodInvocation StringLiteral localhost
client SimpleName MethodInvocation SimpleName port
connect SimpleName MethodInvocation MethodInvocation SimpleName get current test name
connect SimpleName MethodInvocation StringLiteral localhost
connect SimpleName MethodInvocation SimpleName port
get current test name SimpleName MethodInvocation MethodInvocation StringLiteral localhost
get current test name SimpleName MethodInvocation MethodInvocation SimpleName port
localhost StringLiteral MethodInvocation SimpleName port
client SimpleName MethodInvocation MethodInvocation SimpleName verify
connect SimpleName MethodInvocation MethodInvocation SimpleName verify
get current test name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName verify
localhost StringLiteral MethodInvocation MethodInvocation SimpleName verify
port SimpleName MethodInvocation MethodInvocation SimpleName verify
client SimpleName MethodInvocation MethodInvocation NumberLiteral l
connect SimpleName MethodInvocation MethodInvocation NumberLiteral l
get current test name SimpleName MethodInvocation MethodInvocation MethodInvocation NumberLiteral l
localhost StringLiteral MethodInvocation MethodInvocation NumberLiteral l
port SimpleName MethodInvocation MethodInvocation NumberLiteral l
client SimpleName MethodInvocation MethodInvocation QualifiedName time unitseconds
connect SimpleName MethodInvocation MethodInvocation QualifiedName time unitseconds
get current test name SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName time unitseconds
localhost StringLiteral MethodInvocation MethodInvocation QualifiedName time unitseconds
port SimpleName MethodInvocation MethodInvocation QualifiedName time unitseconds
verify SimpleName MethodInvocation NumberLiteral l
verify SimpleName MethodInvocation QualifiedName time unitseconds
l NumberLiteral MethodInvocation QualifiedName time unitseconds
client SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get session
connect SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get session
localhost StringLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName get session
port SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get session
verify SimpleName MethodInvocation MethodInvocation SimpleName get session
l NumberLiteral MethodInvocation MethodInvocation SimpleName get session
time unitseconds QualifiedName MethodInvocation MethodInvocation SimpleName get session
session SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName verify
session SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation NumberLiteral l
session SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation QualifiedName time unitseconds
session SimpleName VariableDeclarationFragment MethodInvocation SimpleName get session
client session SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName session
session SimpleName MethodInvocation SimpleName add password identity
session SimpleName MethodInvocation MethodInvocation SimpleName get current test name
add password identity SimpleName MethodInvocation MethodInvocation SimpleName get current test name
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
session SimpleName MethodInvocation SimpleName create exec channel
session SimpleName MethodInvocation StringLiteral test
create exec channel SimpleName MethodInvocation StringLiteral test
channel SimpleName VariableDeclarationFragment MethodInvocation SimpleName session
channel SimpleName VariableDeclarationFragment MethodInvocation SimpleName create exec channel
channel SimpleName VariableDeclarationFragment MethodInvocation StringLiteral test
channel exec SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName channel
no close output stream SimpleName SimpleType ClassInstanceCreation QualifiedName systemout
stdout SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName no close output stream
stdout SimpleName VariableDeclarationFragment ClassInstanceCreation QualifiedName systemout
output stream SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName stdout
no close output stream SimpleName SimpleType ClassInstanceCreation QualifiedName systemerr
stderr SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName no close output stream
stderr SimpleName VariableDeclarationFragment ClassInstanceCreation QualifiedName systemerr
output stream SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName stderr
channel SimpleName MethodInvocation SimpleName set out
channel SimpleName MethodInvocation SimpleName stdout
set out SimpleName MethodInvocation SimpleName stdout
channel SimpleName MethodInvocation SimpleName set err
channel SimpleName MethodInvocation SimpleName stderr
set err SimpleName MethodInvocation SimpleName stderr
channel SimpleName MethodInvocation SimpleName open
channel SimpleName MethodInvocation MethodInvocation SimpleName verify
open SimpleName MethodInvocation MethodInvocation SimpleName verify
channel SimpleName MethodInvocation MethodInvocation NumberLiteral l
open SimpleName MethodInvocation MethodInvocation NumberLiteral l
channel SimpleName MethodInvocation MethodInvocation QualifiedName time unitseconds
open SimpleName MethodInvocation MethodInvocation QualifiedName time unitseconds
verify SimpleName MethodInvocation NumberLiteral l
verify SimpleName MethodInvocation QualifiedName time unitseconds
l NumberLiteral MethodInvocation QualifiedName time unitseconds
thread SimpleName MethodInvocation SimpleName sleep
thread SimpleName MethodInvocation NumberLiteral l
sleep SimpleName MethodInvocation NumberLiteral l
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
