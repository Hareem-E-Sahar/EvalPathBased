buffer SimpleName SimpleType SingleVariableDeclaration SimpleName buffer
string SimpleName SimpleType SingleVariableDeclaration SimpleName req
request handlerresult QualifiedName SimpleType SingleVariableDeclaration SimpleName result
boolean PrimitiveType SingleVariableDeclaration SimpleName want reply
log SimpleName MethodInvocation SimpleName is debug enabled
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral send response request result wantreply
log SimpleName MethodInvocation SimpleName req
log SimpleName MethodInvocation SimpleName result
debug SimpleName MethodInvocation StringLiteral send response request result wantreply
debug SimpleName MethodInvocation SimpleName req
debug SimpleName MethodInvocation SimpleName result
debug SimpleName MethodInvocation SimpleName want reply
send response request result wantreply StringLiteral MethodInvocation SimpleName req
send response request result wantreply StringLiteral MethodInvocation SimpleName result
send response request result wantreply StringLiteral MethodInvocation SimpleName want reply
req SimpleName MethodInvocation SimpleName result
req SimpleName MethodInvocation SimpleName want reply
result SimpleName MethodInvocation SimpleName want reply
request handlerresultreplied QualifiedName MethodInvocation SimpleName equals
request handlerresultreplied QualifiedName MethodInvocation SimpleName result
equals SimpleName MethodInvocation SimpleName result
request handlerresultreply success QualifiedName MethodInvocation SimpleName equals
request handlerresultreply success QualifiedName MethodInvocation SimpleName result
equals SimpleName MethodInvocation SimpleName result
request handlerresultreply success QualifiedName MethodInvocation ConditionalExpression QualifiedName ssh constantsssh msg channel success
equals SimpleName MethodInvocation ConditionalExpression QualifiedName ssh constantsssh msg channel success
result SimpleName MethodInvocation ConditionalExpression QualifiedName ssh constantsssh msg channel success
request handlerresultreply success QualifiedName MethodInvocation ConditionalExpression QualifiedName ssh constantsssh msg channel failure
equals SimpleName MethodInvocation ConditionalExpression QualifiedName ssh constantsssh msg channel failure
result SimpleName MethodInvocation ConditionalExpression QualifiedName ssh constantsssh msg channel failure
ssh constantsssh msg channel success QualifiedName ConditionalExpression QualifiedName ssh constantsssh msg channel failure
cmd SimpleName VariableDeclarationFragment ConditionalExpression MethodInvocation QualifiedName request handlerresultreply success
cmd SimpleName VariableDeclarationFragment ConditionalExpression MethodInvocation SimpleName equals
cmd SimpleName VariableDeclarationFragment ConditionalExpression MethodInvocation SimpleName result
cmd SimpleName VariableDeclarationFragment ConditionalExpression QualifiedName ssh constantsssh msg channel success
cmd SimpleName VariableDeclarationFragment ConditionalExpression QualifiedName ssh constantsssh msg channel failure
byte PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName cmd
byte PrimitiveType VariableDeclarationStatement VariableDeclarationFragment ConditionalExpression QualifiedName ssh constantsssh msg channel success
byte PrimitiveType VariableDeclarationStatement VariableDeclarationFragment ConditionalExpression QualifiedName ssh constantsssh msg channel failure
session SimpleName VariableDeclarationFragment MethodInvocation SimpleName get session
session SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName session
integersize QualifiedName InfixExpression QualifiedName bytesize
session SimpleName MethodInvocation SimpleName create buffer
session SimpleName MethodInvocation SimpleName cmd
session SimpleName MethodInvocation InfixExpression QualifiedName integersize
session SimpleName MethodInvocation InfixExpression QualifiedName bytesize
create buffer SimpleName MethodInvocation SimpleName cmd
create buffer SimpleName MethodInvocation InfixExpression QualifiedName integersize
create buffer SimpleName MethodInvocation InfixExpression QualifiedName bytesize
cmd SimpleName MethodInvocation InfixExpression QualifiedName integersize
cmd SimpleName MethodInvocation InfixExpression QualifiedName bytesize
rsp SimpleName VariableDeclarationFragment MethodInvocation SimpleName session
rsp SimpleName VariableDeclarationFragment MethodInvocation SimpleName create buffer
rsp SimpleName VariableDeclarationFragment MethodInvocation SimpleName cmd
rsp SimpleName VariableDeclarationFragment MethodInvocation InfixExpression QualifiedName integersize
rsp SimpleName VariableDeclarationFragment MethodInvocation InfixExpression QualifiedName bytesize
buffer SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName rsp
rsp SimpleName MethodInvocation SimpleName put int
rsp SimpleName MethodInvocation SimpleName recipient
put int SimpleName MethodInvocation SimpleName recipient
session SimpleName MethodInvocation SimpleName write packet
session SimpleName MethodInvocation SimpleName rsp
write packet SimpleName MethodInvocation SimpleName rsp
protected Modifier MethodDeclaration PrimitiveType void
protected Modifier MethodDeclaration SimpleName send response
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName buffer
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleName buffer
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleName req
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleType QualifiedName request handlerresult
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleName result
void PrimitiveType MethodDeclaration SimpleName send response
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName buffer
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName buffer
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName req
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType QualifiedName request handlerresult
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName result
void PrimitiveType MethodDeclaration SingleVariableDeclaration PrimitiveType boolean
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName want reply
send response SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName buffer
send response SimpleName MethodDeclaration SingleVariableDeclaration SimpleName buffer
send response SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
send response SimpleName MethodDeclaration SingleVariableDeclaration SimpleName req
send response SimpleName MethodDeclaration SingleVariableDeclaration SimpleType QualifiedName request handlerresult
send response SimpleName MethodDeclaration SingleVariableDeclaration SimpleName result
send response SimpleName MethodDeclaration SingleVariableDeclaration PrimitiveType boolean
send response SimpleName MethodDeclaration SingleVariableDeclaration SimpleName want reply
send response SimpleName MethodDeclaration SimpleType SimpleName io exception
buffer SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName req
buffer SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName result
buffer SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType boolean
buffer SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName want reply
buffer SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
req SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName result
req SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType boolean
req SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName want reply
req SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
result SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType boolean
result SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName want reply
result SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
boolean PrimitiveType SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
want reply SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier protected
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName send response
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName buffer
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName req
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName result
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType boolean
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName want reply
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
test SimpleName TypeDeclaration MethodDeclaration Modifier protected
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName send response
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName buffer
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName req
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName result
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType boolean
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName want reply
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
