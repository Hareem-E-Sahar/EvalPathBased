connection service SimpleName SimpleType SingleVariableDeclaration SimpleName connection service
string SimpleName SimpleType SingleVariableDeclaration SimpleName request
boolean PrimitiveType SingleVariableDeclaration SimpleName want reply
buffer SimpleName SimpleType SingleVariableDeclaration SimpleName buffer
request SimpleName MethodInvocation SimpleName equals
request SimpleName MethodInvocation SimpleName request
equals SimpleName MethodInvocation SimpleName request
buffer SimpleName MethodInvocation SimpleName get string
address SimpleName VariableDeclarationFragment MethodInvocation SimpleName buffer
address SimpleName VariableDeclarationFragment MethodInvocation SimpleName get string
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName address
buffer SimpleName MethodInvocation SimpleName get int
port SimpleName VariableDeclarationFragment MethodInvocation SimpleName buffer
port SimpleName VariableDeclarationFragment MethodInvocation SimpleName get int
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName port
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName buffer
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get int
sshd socket address SimpleName SimpleType ClassInstanceCreation SimpleName address
sshd socket address SimpleName SimpleType ClassInstanceCreation SimpleName port
address SimpleName ClassInstanceCreation SimpleName port
socket address SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName sshd socket address
socket address SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName address
socket address SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName port
sshd socket address SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName socket address
log SimpleName MethodInvocation SimpleName is debug enabled
process StringLiteral InfixExpression SimpleName connection service
process StringLiteral InfixExpression StringLiteral )[
process StringLiteral InfixExpression SimpleName request
process StringLiteral InfixExpression StringLiteral ]
process StringLiteral InfixExpression SimpleName socket address
connection service SimpleName InfixExpression StringLiteral )[
connection service SimpleName InfixExpression SimpleName request
connection service SimpleName InfixExpression StringLiteral ]
connection service SimpleName InfixExpression SimpleName socket address
connection service SimpleName InfixExpression StringLiteral reply
)[ StringLiteral InfixExpression SimpleName request
)[ StringLiteral InfixExpression StringLiteral ]
)[ StringLiteral InfixExpression SimpleName socket address
)[ StringLiteral InfixExpression StringLiteral reply
)[ StringLiteral InfixExpression SimpleName want reply
request SimpleName InfixExpression StringLiteral ]
request SimpleName InfixExpression SimpleName socket address
request SimpleName InfixExpression StringLiteral reply
request SimpleName InfixExpression SimpleName want reply
] StringLiteral InfixExpression SimpleName socket address
] StringLiteral InfixExpression StringLiteral reply
] StringLiteral InfixExpression SimpleName want reply
socket address SimpleName InfixExpression StringLiteral reply
socket address SimpleName InfixExpression SimpleName want reply
reply StringLiteral InfixExpression SimpleName want reply
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation InfixExpression StringLiteral process
log SimpleName MethodInvocation InfixExpression SimpleName connection service
log SimpleName MethodInvocation InfixExpression StringLiteral )[
log SimpleName MethodInvocation InfixExpression SimpleName request
log SimpleName MethodInvocation InfixExpression StringLiteral ]
log SimpleName MethodInvocation InfixExpression SimpleName socket address
log SimpleName MethodInvocation InfixExpression StringLiteral reply
log SimpleName MethodInvocation InfixExpression SimpleName want reply
debug SimpleName MethodInvocation InfixExpression StringLiteral process
debug SimpleName MethodInvocation InfixExpression SimpleName connection service
debug SimpleName MethodInvocation InfixExpression StringLiteral )[
debug SimpleName MethodInvocation InfixExpression SimpleName request
debug SimpleName MethodInvocation InfixExpression StringLiteral ]
debug SimpleName MethodInvocation InfixExpression SimpleName socket address
debug SimpleName MethodInvocation InfixExpression StringLiteral reply
debug SimpleName MethodInvocation InfixExpression SimpleName want reply
connection service SimpleName MethodInvocation SimpleName get tcpip forwarder
forwarder SimpleName VariableDeclarationFragment MethodInvocation SimpleName connection service
forwarder SimpleName VariableDeclarationFragment MethodInvocation SimpleName get tcpip forwarder
tcpip forwarder SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName forwarder
forwarder SimpleName MethodInvocation SimpleName local port forwarding cancelled
forwarder SimpleName MethodInvocation SimpleName socket address
local port forwarding cancelled SimpleName MethodInvocation SimpleName socket address
buffer SimpleName MethodInvocation SimpleName clear
integersize QualifiedName InfixExpression QualifiedName bytesize
empty NumberLiteral InfixExpression NumberLiteral empty
empty NumberLiteral InfixExpression ParenthesizedExpression InfixExpression QualifiedName integersize
empty NumberLiteral InfixExpression ParenthesizedExpression InfixExpression QualifiedName bytesize
empty NumberLiteral InfixExpression ParenthesizedExpression InfixExpression QualifiedName integersize
empty NumberLiteral InfixExpression ParenthesizedExpression InfixExpression QualifiedName bytesize
int int functionutils QualifiedName MethodInvocation SimpleName add
int int functionutils QualifiedName MethodInvocation QualifiedName bytesize
add SimpleName MethodInvocation QualifiedName bytesize
buffer SimpleName MethodInvocation SimpleName ensure capacity
buffer SimpleName MethodInvocation InfixExpression NumberLiteral empty
buffer SimpleName MethodInvocation InfixExpression NumberLiteral empty
buffer SimpleName MethodInvocation MethodInvocation QualifiedName int int functionutils
buffer SimpleName MethodInvocation MethodInvocation SimpleName add
buffer SimpleName MethodInvocation MethodInvocation QualifiedName bytesize
ensure capacity SimpleName MethodInvocation InfixExpression NumberLiteral empty
ensure capacity SimpleName MethodInvocation InfixExpression NumberLiteral empty
ensure capacity SimpleName MethodInvocation MethodInvocation QualifiedName int int functionutils
ensure capacity SimpleName MethodInvocation MethodInvocation SimpleName add
ensure capacity SimpleName MethodInvocation MethodInvocation QualifiedName bytesize
empty NumberLiteral InfixExpression MethodInvocation MethodInvocation QualifiedName int int functionutils
empty NumberLiteral InfixExpression MethodInvocation MethodInvocation SimpleName add
empty NumberLiteral InfixExpression MethodInvocation MethodInvocation QualifiedName bytesize
empty NumberLiteral InfixExpression MethodInvocation MethodInvocation QualifiedName int int functionutils
empty NumberLiteral InfixExpression MethodInvocation MethodInvocation SimpleName add
empty NumberLiteral InfixExpression MethodInvocation MethodInvocation QualifiedName bytesize
buffer SimpleName MethodInvocation SimpleName rpos
buffer SimpleName MethodInvocation NumberLiteral empty
rpos SimpleName MethodInvocation NumberLiteral empty
buffer SimpleName MethodInvocation SimpleName wpos
buffer SimpleName MethodInvocation NumberLiteral empty
wpos SimpleName MethodInvocation NumberLiteral empty
buffer SimpleName MethodInvocation SimpleName put byte
buffer SimpleName MethodInvocation QualifiedName ssh constantsssh msg request success
put byte SimpleName MethodInvocation QualifiedName ssh constantsssh msg request success
buffer SimpleName MethodInvocation SimpleName put int
buffer SimpleName MethodInvocation SimpleName port
put int SimpleName MethodInvocation SimpleName port
connection service SimpleName MethodInvocation SimpleName get session
session SimpleName VariableDeclarationFragment MethodInvocation SimpleName connection service
session SimpleName VariableDeclarationFragment MethodInvocation SimpleName get session
session SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName session
session SimpleName MethodInvocation SimpleName write packet
session SimpleName MethodInvocation SimpleName buffer
write packet SimpleName MethodInvocation SimpleName buffer
int PrimitiveType VariableDeclarationStatement Block IfStatement SimpleName want reply
want reply SimpleName IfStatement Block ReturnStatement QualifiedName resultreplied
override SimpleName MarkerAnnotation MethodDeclaration Modifier public
override SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName result
override SimpleName MarkerAnnotation MethodDeclaration SimpleName process
override SimpleName MarkerAnnotation MethodDeclaration SingleVariableDeclaration SimpleName connection service
override SimpleName MarkerAnnotation MethodDeclaration SingleVariableDeclaration SimpleName request
public Modifier MethodDeclaration SimpleType SimpleName result
public Modifier MethodDeclaration SimpleName process
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName connection service
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName connection service
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName request
public Modifier MethodDeclaration SingleVariableDeclaration PrimitiveType boolean
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName want reply
result SimpleName SimpleType MethodDeclaration SimpleName process
result SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName connection service
result SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName request
result SimpleName SimpleType MethodDeclaration SingleVariableDeclaration PrimitiveType boolean
result SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName want reply
result SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName buffer
process SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName connection service
process SimpleName MethodDeclaration SingleVariableDeclaration SimpleName connection service
process SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
process SimpleName MethodDeclaration SingleVariableDeclaration SimpleName request
process SimpleName MethodDeclaration SingleVariableDeclaration PrimitiveType boolean
process SimpleName MethodDeclaration SingleVariableDeclaration SimpleName want reply
process SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName buffer
process SimpleName MethodDeclaration SingleVariableDeclaration SimpleName buffer
process SimpleName MethodDeclaration SimpleType SimpleName exception
connection service SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName request
connection service SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType boolean
connection service SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName want reply
connection service SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName buffer
connection service SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
request SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType boolean
request SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName want reply
request SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName buffer
request SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
boolean PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName buffer
want reply SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName buffer
boolean PrimitiveType SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
want reply SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
buffer SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName override
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName result
public Modifier TypeDeclaration MethodDeclaration SimpleName process
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName connection service
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName request
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType boolean
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName want reply
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName buffer
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName override
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName result
test SimpleName TypeDeclaration MethodDeclaration SimpleName process
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName connection service
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName request
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType boolean
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName want reply
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName buffer
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
