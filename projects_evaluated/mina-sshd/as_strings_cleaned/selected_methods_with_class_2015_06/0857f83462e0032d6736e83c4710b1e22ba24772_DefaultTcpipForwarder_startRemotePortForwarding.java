sshd socket address SimpleName SimpleType SingleVariableDeclaration SimpleName remote
sshd socket address SimpleName SimpleType SingleVariableDeclaration SimpleName local
session SimpleName MethodInvocation SimpleName create buffer
session SimpleName MethodInvocation QualifiedName ssh constantsssh msg global request
create buffer SimpleName MethodInvocation QualifiedName ssh constantsssh msg global request
buffer SimpleName VariableDeclarationFragment MethodInvocation SimpleName session
buffer SimpleName VariableDeclarationFragment MethodInvocation SimpleName create buffer
buffer SimpleName VariableDeclarationFragment MethodInvocation QualifiedName ssh constantsssh msg global request
buffer SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName buffer
buffer SimpleName MethodInvocation SimpleName put string
buffer SimpleName MethodInvocation StringLiteral tcpipforward
put string SimpleName MethodInvocation StringLiteral tcpipforward
buffer SimpleName MethodInvocation SimpleName put boolean
buffer SimpleName MethodInvocation BooleanLiteral true
put boolean SimpleName MethodInvocation BooleanLiteral true
remote SimpleName MethodInvocation SimpleName get host name
buffer SimpleName MethodInvocation SimpleName put string
buffer SimpleName MethodInvocation MethodInvocation SimpleName remote
buffer SimpleName MethodInvocation MethodInvocation SimpleName get host name
put string SimpleName MethodInvocation MethodInvocation SimpleName remote
put string SimpleName MethodInvocation MethodInvocation SimpleName get host name
remote SimpleName MethodInvocation SimpleName get port
buffer SimpleName MethodInvocation SimpleName put int
buffer SimpleName MethodInvocation MethodInvocation SimpleName remote
buffer SimpleName MethodInvocation MethodInvocation SimpleName get port
put int SimpleName MethodInvocation MethodInvocation SimpleName remote
put int SimpleName MethodInvocation MethodInvocation SimpleName get port
session SimpleName MethodInvocation SimpleName request
session SimpleName MethodInvocation SimpleName buffer
request SimpleName MethodInvocation SimpleName buffer
result SimpleName VariableDeclarationFragment MethodInvocation SimpleName session
result SimpleName VariableDeclarationFragment MethodInvocation SimpleName request
result SimpleName VariableDeclarationFragment MethodInvocation SimpleName buffer
buffer SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName result
ssh exception SimpleName SimpleType ClassInstanceCreation StringLiteral tcpip forwarding request denied by server
remote SimpleName MethodInvocation SimpleName get port
remote SimpleName MethodInvocation InfixExpression NumberLiteral empty
get port SimpleName MethodInvocation InfixExpression NumberLiteral empty
result SimpleName MethodInvocation SimpleName get int
remote SimpleName MethodInvocation SimpleName get port
empty NumberLiteral InfixExpression ConditionalExpression MethodInvocation SimpleName result
empty NumberLiteral InfixExpression ConditionalExpression MethodInvocation SimpleName get int
empty NumberLiteral InfixExpression ConditionalExpression MethodInvocation SimpleName remote
empty NumberLiteral InfixExpression ConditionalExpression MethodInvocation SimpleName get port
result SimpleName MethodInvocation ConditionalExpression MethodInvocation SimpleName remote
result SimpleName MethodInvocation ConditionalExpression MethodInvocation SimpleName get port
get int SimpleName MethodInvocation ConditionalExpression MethodInvocation SimpleName remote
get int SimpleName MethodInvocation ConditionalExpression MethodInvocation SimpleName get port
port SimpleName VariableDeclarationFragment ConditionalExpression InfixExpression NumberLiteral empty
port SimpleName VariableDeclarationFragment ConditionalExpression MethodInvocation SimpleName result
port SimpleName VariableDeclarationFragment ConditionalExpression MethodInvocation SimpleName get int
port SimpleName VariableDeclarationFragment ConditionalExpression MethodInvocation SimpleName remote
port SimpleName VariableDeclarationFragment ConditionalExpression MethodInvocation SimpleName get port
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName port
integer SimpleName MethodInvocation SimpleName value of
integer SimpleName MethodInvocation SimpleName port
value of SimpleName MethodInvocation SimpleName port
remote to local SimpleName MethodInvocation SimpleName put
remote to local SimpleName MethodInvocation MethodInvocation SimpleName integer
remote to local SimpleName MethodInvocation MethodInvocation SimpleName value of
remote to local SimpleName MethodInvocation MethodInvocation SimpleName port
remote to local SimpleName MethodInvocation SimpleName local
put SimpleName MethodInvocation MethodInvocation SimpleName integer
put SimpleName MethodInvocation MethodInvocation SimpleName value of
put SimpleName MethodInvocation MethodInvocation SimpleName port
put SimpleName MethodInvocation SimpleName local
integer SimpleName MethodInvocation MethodInvocation SimpleName local
value of SimpleName MethodInvocation MethodInvocation SimpleName local
port SimpleName MethodInvocation MethodInvocation SimpleName local
remote SimpleName MethodInvocation SimpleName get host name
sshd socket address SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName remote
sshd socket address SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get host name
sshd socket address SimpleName SimpleType ClassInstanceCreation SimpleName port
remote SimpleName MethodInvocation ClassInstanceCreation SimpleName port
get host name SimpleName MethodInvocation ClassInstanceCreation SimpleName port
override SimpleName MarkerAnnotation MethodDeclaration Modifier public
override SimpleName MarkerAnnotation MethodDeclaration Modifier synchronized
override SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName sshd socket address
override SimpleName MarkerAnnotation MethodDeclaration SimpleName start remote port forwarding
override SimpleName MarkerAnnotation MethodDeclaration SingleVariableDeclaration SimpleName remote
public Modifier MethodDeclaration Modifier synchronized
public Modifier MethodDeclaration SimpleType SimpleName sshd socket address
public Modifier MethodDeclaration SimpleName start remote port forwarding
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName sshd socket address
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName remote
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName sshd socket address
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName local
synchronized Modifier MethodDeclaration SimpleType SimpleName sshd socket address
synchronized Modifier MethodDeclaration SimpleName start remote port forwarding
synchronized Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName sshd socket address
synchronized Modifier MethodDeclaration SingleVariableDeclaration SimpleName remote
synchronized Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName sshd socket address
synchronized Modifier MethodDeclaration SingleVariableDeclaration SimpleName local
synchronized Modifier MethodDeclaration SimpleType SimpleName io exception
sshd socket address SimpleName SimpleType MethodDeclaration SimpleName start remote port forwarding
sshd socket address SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName remote
sshd socket address SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName local
sshd socket address SimpleName SimpleType MethodDeclaration SimpleType SimpleName io exception
start remote port forwarding SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName sshd socket address
start remote port forwarding SimpleName MethodDeclaration SingleVariableDeclaration SimpleName remote
start remote port forwarding SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName sshd socket address
start remote port forwarding SimpleName MethodDeclaration SingleVariableDeclaration SimpleName local
start remote port forwarding SimpleName MethodDeclaration SimpleType SimpleName io exception
start remote port forwarding SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
remote SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName local
remote SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
local SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName override
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration Modifier synchronized
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName sshd socket address
public Modifier TypeDeclaration MethodDeclaration SimpleName start remote port forwarding
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName remote
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName local
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName override
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration Modifier synchronized
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName sshd socket address
test SimpleName TypeDeclaration MethodDeclaration SimpleName start remote port forwarding
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName remote
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName local
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
