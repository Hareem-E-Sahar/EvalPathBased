count down latch SimpleName SimpleType ClassInstanceCreation NumberLiteral empty
test echo shell factorytest echo shelllatch QualifiedName Assignment ClassInstanceCreation SimpleType SimpleName count down latch
test echo shell factorytest echo shelllatch QualifiedName Assignment ClassInstanceCreation NumberLiteral empty
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
session SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName await
session SimpleName VariableDeclarationFragment MethodInvocation SimpleName get session
client session SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName session
session SimpleName MethodInvocation SimpleName auth password
session SimpleName MethodInvocation StringLiteral smx
session SimpleName MethodInvocation StringLiteral smx
auth password SimpleName MethodInvocation StringLiteral smx
auth password SimpleName MethodInvocation StringLiteral smx
smx StringLiteral MethodInvocation StringLiteral smx
session SimpleName MethodInvocation SimpleName create channel
session SimpleName MethodInvocation QualifiedName client channelchannel shell
create channel SimpleName MethodInvocation QualifiedName client channelchannel shell
channel SimpleName VariableDeclarationFragment MethodInvocation SimpleName session
channel SimpleName VariableDeclarationFragment MethodInvocation SimpleName create channel
channel SimpleName VariableDeclarationFragment MethodInvocation QualifiedName client channelchannel shell
client channel SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName channel
piped in SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName piped output stream
piped output stream SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName piped in
piped input stream SimpleName SimpleType ClassInstanceCreation SimpleName piped in
channel SimpleName MethodInvocation SimpleName set in
channel SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName piped input stream
channel SimpleName MethodInvocation ClassInstanceCreation SimpleName piped in
set in SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName piped input stream
set in SimpleName MethodInvocation ClassInstanceCreation SimpleName piped in
out SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName byte array output stream
byte array output stream SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName out
err SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName byte array output stream
byte array output stream SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName err
channel SimpleName MethodInvocation SimpleName set out
channel SimpleName MethodInvocation SimpleName out
set out SimpleName MethodInvocation SimpleName out
channel SimpleName MethodInvocation SimpleName set err
channel SimpleName MethodInvocation SimpleName err
set err SimpleName MethodInvocation SimpleName err
channel SimpleName MethodInvocation SimpleName open
channel SimpleName MethodInvocation MethodInvocation SimpleName await
open SimpleName MethodInvocation MethodInvocation SimpleName await
abstract session SimpleName SimpleType CastExpression SimpleName session
cs SimpleName VariableDeclarationFragment CastExpression SimpleType SimpleName abstract session
cs SimpleName VariableDeclarationFragment CastExpression SimpleName session
abstract session SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName cs
cs SimpleName MethodInvocation SimpleName create buffer
cs SimpleName MethodInvocation QualifiedName ssh constantsssh msg disconnect
create buffer SimpleName MethodInvocation QualifiedName ssh constantsssh msg disconnect
buffer SimpleName VariableDeclarationFragment MethodInvocation SimpleName cs
buffer SimpleName VariableDeclarationFragment MethodInvocation SimpleName create buffer
buffer SimpleName VariableDeclarationFragment MethodInvocation QualifiedName ssh constantsssh msg disconnect
buffer SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName buffer
buffer SimpleName MethodInvocation SimpleName put int
buffer SimpleName MethodInvocation QualifiedName ssh constantsssh disconnect by application
put int SimpleName MethodInvocation QualifiedName ssh constantsssh disconnect by application
buffer SimpleName MethodInvocation SimpleName put string
buffer SimpleName MethodInvocation StringLiteral cancel
put string SimpleName MethodInvocation StringLiteral cancel
buffer SimpleName MethodInvocation SimpleName put string
buffer SimpleName MethodInvocation StringLiteral empty
put string SimpleName MethodInvocation StringLiteral empty
cs SimpleName MethodInvocation SimpleName write packet
cs SimpleName MethodInvocation SimpleName buffer
write packet SimpleName MethodInvocation SimpleName buffer
f SimpleName VariableDeclarationFragment MethodInvocation SimpleName cs
f SimpleName VariableDeclarationFragment MethodInvocation SimpleName write packet
f SimpleName VariableDeclarationFragment MethodInvocation SimpleName buffer
io write future SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName f
f SimpleName MethodInvocation SimpleName await
cs SimpleName MethodInvocation SimpleName get io session
suspend SimpleName MethodInvocation MethodInvocation SimpleName cs
suspend SimpleName MethodInvocation MethodInvocation SimpleName get io session
test echo shell factorytest echo shelllatch QualifiedName MethodInvocation SimpleName await
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test client disconnect
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test client disconnect
public Modifier MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration SimpleName test client disconnect
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
test client disconnect SimpleName MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test client disconnect
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test client disconnect
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
