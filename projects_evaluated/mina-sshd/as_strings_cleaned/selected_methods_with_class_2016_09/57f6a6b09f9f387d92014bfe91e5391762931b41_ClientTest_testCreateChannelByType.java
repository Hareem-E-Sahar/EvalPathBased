client SimpleName MethodInvocation SimpleName start
collection SimpleName SimpleType ParameterizedType SimpleType SimpleName client channel
session SimpleName VariableDeclarationFragment MethodInvocation SimpleName create test client session
client session SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName session
property resolver utils SimpleName MethodInvocation SimpleName update property
property resolver utils SimpleName MethodInvocation SimpleName session
property resolver utils SimpleName MethodInvocation QualifiedName channel subsystemrequest subsystem reply
property resolver utils SimpleName MethodInvocation BooleanLiteral false
update property SimpleName MethodInvocation SimpleName session
update property SimpleName MethodInvocation QualifiedName channel subsystemrequest subsystem reply
update property SimpleName MethodInvocation BooleanLiteral false
session SimpleName MethodInvocation QualifiedName channel subsystemrequest subsystem reply
session SimpleName MethodInvocation BooleanLiteral false
channel subsystemrequest subsystem reply QualifiedName MethodInvocation BooleanLiteral false
session SimpleName MethodInvocation SimpleName create channel
session SimpleName MethodInvocation QualifiedName channelchannel subsystem
session SimpleName MethodInvocation QualifiedName sftp constantssftp subsystem name
create channel SimpleName MethodInvocation QualifiedName channelchannel subsystem
create channel SimpleName MethodInvocation QualifiedName sftp constantssftp subsystem name
channelchannel subsystem QualifiedName MethodInvocation QualifiedName sftp constantssftp subsystem name
channels SimpleName MethodInvocation SimpleName add
channels SimpleName MethodInvocation MethodInvocation SimpleName session
channels SimpleName MethodInvocation MethodInvocation SimpleName create channel
channels SimpleName MethodInvocation MethodInvocation QualifiedName channelchannel subsystem
channels SimpleName MethodInvocation MethodInvocation QualifiedName sftp constantssftp subsystem name
add SimpleName MethodInvocation MethodInvocation SimpleName session
add SimpleName MethodInvocation MethodInvocation SimpleName create channel
add SimpleName MethodInvocation MethodInvocation QualifiedName channelchannel subsystem
add SimpleName MethodInvocation MethodInvocation QualifiedName sftp constantssftp subsystem name
session SimpleName MethodInvocation SimpleName create channel
session SimpleName MethodInvocation QualifiedName channelchannel exec
session SimpleName MethodInvocation MethodInvocation SimpleName get current test name
create channel SimpleName MethodInvocation QualifiedName channelchannel exec
create channel SimpleName MethodInvocation MethodInvocation SimpleName get current test name
channelchannel exec QualifiedName MethodInvocation MethodInvocation SimpleName get current test name
channels SimpleName MethodInvocation SimpleName add
channels SimpleName MethodInvocation MethodInvocation SimpleName session
channels SimpleName MethodInvocation MethodInvocation SimpleName create channel
channels SimpleName MethodInvocation MethodInvocation QualifiedName channelchannel exec
channels SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get current test name
add SimpleName MethodInvocation MethodInvocation SimpleName session
add SimpleName MethodInvocation MethodInvocation SimpleName create channel
add SimpleName MethodInvocation MethodInvocation QualifiedName channelchannel exec
add SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get current test name
get class SimpleName MethodInvocation MethodInvocation SimpleName get simple name
session SimpleName MethodInvocation SimpleName create channel
session SimpleName MethodInvocation QualifiedName channelchannel shell
session SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get class
session SimpleName MethodInvocation MethodInvocation SimpleName get simple name
create channel SimpleName MethodInvocation QualifiedName channelchannel shell
create channel SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get class
create channel SimpleName MethodInvocation MethodInvocation SimpleName get simple name
channelchannel shell QualifiedName MethodInvocation MethodInvocation MethodInvocation SimpleName get class
channelchannel shell QualifiedName MethodInvocation MethodInvocation SimpleName get simple name
channels SimpleName MethodInvocation SimpleName add
channels SimpleName MethodInvocation MethodInvocation SimpleName session
channels SimpleName MethodInvocation MethodInvocation SimpleName create channel
channels SimpleName MethodInvocation MethodInvocation QualifiedName channelchannel shell
channels SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get simple name
add SimpleName MethodInvocation MethodInvocation SimpleName session
add SimpleName MethodInvocation MethodInvocation SimpleName create channel
add SimpleName MethodInvocation MethodInvocation QualifiedName channelchannel shell
add SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get simple name
set SimpleName SimpleType ParameterizedType SimpleType SimpleName integer
channels SimpleName MethodInvocation SimpleName size
ids SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName channels
ids SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName size
client channel SimpleName SimpleType SingleVariableDeclaration SimpleName c
c SimpleName MethodInvocation SimpleName get id
id SimpleName VariableDeclarationFragment MethodInvocation SimpleName c
id SimpleName VariableDeclarationFragment MethodInvocation SimpleName get id
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName id
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName c
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get id
channel id repeated StringLiteral InfixExpression SimpleName id
integer SimpleName MethodInvocation SimpleName value of
integer SimpleName MethodInvocation SimpleName id
value of SimpleName MethodInvocation SimpleName id
ids SimpleName MethodInvocation SimpleName add
ids SimpleName MethodInvocation MethodInvocation SimpleName integer
ids SimpleName MethodInvocation MethodInvocation SimpleName value of
ids SimpleName MethodInvocation MethodInvocation SimpleName id
add SimpleName MethodInvocation MethodInvocation SimpleName integer
add SimpleName MethodInvocation MethodInvocation SimpleName value of
add SimpleName MethodInvocation MethodInvocation SimpleName id
assert true SimpleName MethodInvocation InfixExpression StringLiteral channel id repeated
assert true SimpleName MethodInvocation InfixExpression SimpleName id
assert true SimpleName MethodInvocation MethodInvocation SimpleName ids
assert true SimpleName MethodInvocation MethodInvocation SimpleName add
assert true SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName integer
assert true SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName value of
assert true SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName id
channel id repeated StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName ids
channel id repeated StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName add
id SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName ids
id SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName add
client channel SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName channels
c SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName channels
channels SimpleName EnhancedForStatement Block VariableDeclarationStatement PrimitiveType int
closeable SimpleName SimpleType SingleVariableDeclaration SimpleName c
c SimpleName MethodInvocation SimpleName close
io exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
closeable SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName channels
c SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName channels
client SimpleName MethodInvocation SimpleName stop
client session holder SimpleName MethodInvocation SimpleName get
assert null SimpleName MethodInvocation StringLiteral session closure not signalled
assert null SimpleName MethodInvocation MethodInvocation SimpleName client session holder
assert null SimpleName MethodInvocation MethodInvocation SimpleName get
session closure not signalled StringLiteral MethodInvocation MethodInvocation SimpleName client session holder
session closure not signalled StringLiteral MethodInvocation MethodInvocation SimpleName get
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test create channel by type
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test create channel by type
public Modifier MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration SimpleName test create channel by type
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
test create channel by type SimpleName MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test create channel by type
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test create channel by type
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
