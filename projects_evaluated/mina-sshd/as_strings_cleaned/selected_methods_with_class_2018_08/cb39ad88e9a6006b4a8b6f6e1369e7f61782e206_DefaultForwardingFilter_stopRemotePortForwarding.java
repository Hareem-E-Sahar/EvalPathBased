sshd socket address SimpleName SimpleType SingleVariableDeclaration SimpleName remote
sshd socket address SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName bound
remote SimpleName MethodInvocation SimpleName get port
port SimpleName VariableDeclarationFragment MethodInvocation SimpleName remote
port SimpleName VariableDeclarationFragment MethodInvocation SimpleName get port
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName port
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName remote
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get port
remote to local SimpleName MethodInvocation SimpleName remove
remote to local SimpleName MethodInvocation SimpleName port
remove SimpleName MethodInvocation SimpleName port
bound SimpleName Assignment MethodInvocation SimpleName remote to local
bound SimpleName Assignment MethodInvocation SimpleName remove
bound SimpleName Assignment MethodInvocation SimpleName port
log SimpleName MethodInvocation SimpleName is debug enabled
stop remote port forwarding StringLiteral InfixExpression SimpleName remote
stop remote port forwarding StringLiteral InfixExpression StringLiteral ) cancel forwarding to
stop remote port forwarding StringLiteral InfixExpression SimpleName bound
remote SimpleName InfixExpression StringLiteral ) cancel forwarding to
remote SimpleName InfixExpression SimpleName bound
) cancel forwarding to StringLiteral InfixExpression SimpleName bound
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation InfixExpression StringLiteral stop remote port forwarding
log SimpleName MethodInvocation InfixExpression SimpleName remote
log SimpleName MethodInvocation InfixExpression StringLiteral ) cancel forwarding to
log SimpleName MethodInvocation InfixExpression SimpleName bound
debug SimpleName MethodInvocation InfixExpression StringLiteral stop remote port forwarding
debug SimpleName MethodInvocation InfixExpression SimpleName remote
debug SimpleName MethodInvocation InfixExpression StringLiteral ) cancel forwarding to
debug SimpleName MethodInvocation InfixExpression SimpleName bound
remote SimpleName MethodInvocation SimpleName get host name
remote host SimpleName VariableDeclarationFragment MethodInvocation SimpleName remote
remote host SimpleName VariableDeclarationFragment MethodInvocation SimpleName get host name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName remote host
session SimpleName VariableDeclarationFragment MethodInvocation SimpleName get session
session SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName session
remote host SimpleName MethodInvocation SimpleName length
remote host SimpleName MethodInvocation InfixExpression QualifiedName longsize
length SimpleName MethodInvocation InfixExpression QualifiedName longsize
session SimpleName MethodInvocation SimpleName create buffer
session SimpleName MethodInvocation QualifiedName ssh constantsssh msg global request
session SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName remote host
session SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName length
session SimpleName MethodInvocation InfixExpression QualifiedName longsize
create buffer SimpleName MethodInvocation QualifiedName ssh constantsssh msg global request
create buffer SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName remote host
create buffer SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName length
create buffer SimpleName MethodInvocation InfixExpression QualifiedName longsize
ssh constantsssh msg global request QualifiedName MethodInvocation InfixExpression MethodInvocation SimpleName remote host
ssh constantsssh msg global request QualifiedName MethodInvocation InfixExpression MethodInvocation SimpleName length
ssh constantsssh msg global request QualifiedName MethodInvocation InfixExpression QualifiedName longsize
buffer SimpleName VariableDeclarationFragment MethodInvocation SimpleName session
buffer SimpleName VariableDeclarationFragment MethodInvocation SimpleName create buffer
buffer SimpleName VariableDeclarationFragment MethodInvocation QualifiedName ssh constantsssh msg global request
buffer SimpleName VariableDeclarationFragment MethodInvocation InfixExpression QualifiedName longsize
buffer SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName buffer
buffer SimpleName MethodInvocation SimpleName put string
buffer SimpleName MethodInvocation StringLiteral canceltcpipforward
put string SimpleName MethodInvocation StringLiteral canceltcpipforward
buffer SimpleName MethodInvocation SimpleName put boolean
buffer SimpleName MethodInvocation BooleanLiteral false
put boolean SimpleName MethodInvocation BooleanLiteral false
buffer SimpleName MethodInvocation SimpleName put string
buffer SimpleName MethodInvocation SimpleName remote host
put string SimpleName MethodInvocation SimpleName remote host
buffer SimpleName MethodInvocation SimpleName put int
buffer SimpleName MethodInvocation SimpleName port
put int SimpleName MethodInvocation SimpleName port
signal tearing down explicit tunnel SimpleName MethodInvocation SimpleName bound
signal tearing down explicit tunnel SimpleName MethodInvocation BooleanLiteral false
signal tearing down explicit tunnel SimpleName MethodInvocation SimpleName remote
bound SimpleName MethodInvocation BooleanLiteral false
bound SimpleName MethodInvocation SimpleName remote
false BooleanLiteral MethodInvocation SimpleName remote
session SimpleName MethodInvocation SimpleName write packet
session SimpleName MethodInvocation SimpleName buffer
write packet SimpleName MethodInvocation SimpleName buffer
io exception SimpleName SimpleType UnionType SimpleType SimpleName runtime exception
io exception SimpleName SimpleType UnionType SingleVariableDeclaration SimpleName e
runtime exception SimpleName SimpleType UnionType SingleVariableDeclaration SimpleName e
signal torn down explicit tunnel SimpleName MethodInvocation SimpleName bound
signal torn down explicit tunnel SimpleName MethodInvocation BooleanLiteral false
signal torn down explicit tunnel SimpleName MethodInvocation SimpleName remote
signal torn down explicit tunnel SimpleName MethodInvocation SimpleName e
bound SimpleName MethodInvocation BooleanLiteral false
bound SimpleName MethodInvocation SimpleName remote
bound SimpleName MethodInvocation SimpleName e
false BooleanLiteral MethodInvocation SimpleName remote
false BooleanLiteral MethodInvocation SimpleName e
remote SimpleName MethodInvocation SimpleName e
signal torn down explicit tunnel SimpleName MethodInvocation SimpleName bound
signal torn down explicit tunnel SimpleName MethodInvocation BooleanLiteral false
signal torn down explicit tunnel SimpleName MethodInvocation SimpleName remote
bound SimpleName MethodInvocation BooleanLiteral false
bound SimpleName MethodInvocation SimpleName remote
false BooleanLiteral MethodInvocation SimpleName remote
log SimpleName MethodInvocation SimpleName is debug enabled
stop remote port forwarding StringLiteral InfixExpression SimpleName remote
stop remote port forwarding StringLiteral InfixExpression StringLiteral ) no binding found
remote SimpleName InfixExpression StringLiteral ) no binding found
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation InfixExpression StringLiteral stop remote port forwarding
log SimpleName MethodInvocation InfixExpression SimpleName remote
log SimpleName MethodInvocation InfixExpression StringLiteral ) no binding found
debug SimpleName MethodInvocation InfixExpression StringLiteral stop remote port forwarding
debug SimpleName MethodInvocation InfixExpression SimpleName remote
debug SimpleName MethodInvocation InfixExpression StringLiteral ) no binding found
int PrimitiveType VariableDeclarationStatement Block SynchronizedStatement SimpleName remote to local
override SimpleName MarkerAnnotation MethodDeclaration Modifier public
override SimpleName MarkerAnnotation MethodDeclaration Modifier synchronized
override SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
override SimpleName MarkerAnnotation MethodDeclaration SimpleName stop remote port forwarding
override SimpleName MarkerAnnotation MethodDeclaration SingleVariableDeclaration SimpleName remote
public Modifier MethodDeclaration Modifier synchronized
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName stop remote port forwarding
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName sshd socket address
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName remote
public Modifier MethodDeclaration SimpleType SimpleName io exception
synchronized Modifier MethodDeclaration PrimitiveType void
synchronized Modifier MethodDeclaration SimpleName stop remote port forwarding
synchronized Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName sshd socket address
synchronized Modifier MethodDeclaration SingleVariableDeclaration SimpleName remote
synchronized Modifier MethodDeclaration SimpleType SimpleName io exception
synchronized Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
synchronized Modifier MethodDeclaration Block SynchronizedStatement SimpleName remote to local
void PrimitiveType MethodDeclaration SimpleName stop remote port forwarding
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName sshd socket address
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName remote
void PrimitiveType MethodDeclaration SimpleType SimpleName io exception
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
void PrimitiveType MethodDeclaration Block SynchronizedStatement SimpleName remote to local
stop remote port forwarding SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName sshd socket address
stop remote port forwarding SimpleName MethodDeclaration SingleVariableDeclaration SimpleName remote
stop remote port forwarding SimpleName MethodDeclaration SimpleType SimpleName io exception
stop remote port forwarding SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
stop remote port forwarding SimpleName MethodDeclaration Block SynchronizedStatement SimpleName remote to local
remote SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName override
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration Modifier synchronized
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName stop remote port forwarding
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName remote
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName override
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration Modifier synchronized
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName stop remote port forwarding
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName remote
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
