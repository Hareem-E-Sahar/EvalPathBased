buffer SimpleName SimpleType SingleVariableDeclaration SimpleName buffer
buffer SimpleName MethodInvocation SimpleName get string
req SimpleName VariableDeclarationFragment MethodInvocation SimpleName buffer
req SimpleName VariableDeclarationFragment MethodInvocation SimpleName get string
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName req
buffer SimpleName MethodInvocation SimpleName get boolean
want reply SimpleName VariableDeclarationFragment MethodInvocation SimpleName buffer
want reply SimpleName VariableDeclarationFragment MethodInvocation SimpleName get boolean
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName want reply
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName buffer
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get boolean
req SimpleName ArrayInitializer SimpleName want reply
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral received ssh msg channel request {} on channel {} want reply {})
log SimpleName MethodInvocation ArrayCreation ArrayInitializer SimpleName req
log SimpleName MethodInvocation ArrayCreation ArrayInitializer SimpleName want reply
debug SimpleName MethodInvocation StringLiteral received ssh msg channel request {} on channel {} want reply {})
debug SimpleName MethodInvocation ArrayCreation ArrayInitializer SimpleName req
debug SimpleName MethodInvocation ArrayCreation ArrayInitializer SimpleName want reply
received ssh msg channel request {} on channel {} want reply {}) StringLiteral MethodInvocation ArrayCreation ArrayInitializer SimpleName req
received ssh msg channel request {} on channel {} want reply {}) StringLiteral MethodInvocation ArrayCreation ArrayInitializer SimpleName want reply
request handler SimpleName SimpleType ParameterizedType SimpleType SimpleName channel
request handler SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName handler
channel SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName handler
request handlerresult QualifiedName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName result
handler SimpleName MethodInvocation SimpleName process
handler SimpleName MethodInvocation SimpleName req
handler SimpleName MethodInvocation SimpleName want reply
handler SimpleName MethodInvocation SimpleName buffer
process SimpleName MethodInvocation SimpleName req
process SimpleName MethodInvocation SimpleName want reply
process SimpleName MethodInvocation SimpleName buffer
req SimpleName MethodInvocation SimpleName want reply
req SimpleName MethodInvocation SimpleName buffer
want reply SimpleName MethodInvocation SimpleName buffer
result SimpleName Assignment MethodInvocation SimpleName handler
result SimpleName Assignment MethodInvocation SimpleName process
result SimpleName Assignment MethodInvocation SimpleName req
result SimpleName Assignment MethodInvocation SimpleName want reply
result SimpleName Assignment MethodInvocation SimpleName buffer
exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
error processing channel request StringLiteral InfixExpression SimpleName req
log SimpleName MethodInvocation SimpleName warn
log SimpleName MethodInvocation InfixExpression StringLiteral error processing channel request
log SimpleName MethodInvocation InfixExpression SimpleName req
log SimpleName MethodInvocation SimpleName e
warn SimpleName MethodInvocation InfixExpression StringLiteral error processing channel request
warn SimpleName MethodInvocation InfixExpression SimpleName req
warn SimpleName MethodInvocation SimpleName e
error processing channel request StringLiteral InfixExpression MethodInvocation SimpleName e
req SimpleName InfixExpression MethodInvocation SimpleName e
result SimpleName Assignment QualifiedName request handlerresultreply failure
session SimpleName MethodInvocation SimpleName create buffer
session SimpleName MethodInvocation QualifiedName ssh constantsssh msg channel success
create buffer SimpleName MethodInvocation QualifiedName ssh constantsssh msg channel success
buffer SimpleName Assignment MethodInvocation SimpleName session
buffer SimpleName Assignment MethodInvocation SimpleName create buffer
buffer SimpleName Assignment MethodInvocation QualifiedName ssh constantsssh msg channel success
buffer SimpleName MethodInvocation SimpleName put int
buffer SimpleName MethodInvocation SimpleName recipient
put int SimpleName MethodInvocation SimpleName recipient
session SimpleName MethodInvocation SimpleName write packet
session SimpleName MethodInvocation SimpleName buffer
write packet SimpleName MethodInvocation SimpleName buffer
session SimpleName MethodInvocation SimpleName create buffer
session SimpleName MethodInvocation QualifiedName ssh constantsssh msg channel failure
create buffer SimpleName MethodInvocation QualifiedName ssh constantsssh msg channel failure
buffer SimpleName Assignment MethodInvocation SimpleName session
buffer SimpleName Assignment MethodInvocation SimpleName create buffer
buffer SimpleName Assignment MethodInvocation QualifiedName ssh constantsssh msg channel failure
buffer SimpleName MethodInvocation SimpleName put int
buffer SimpleName MethodInvocation SimpleName recipient
put int SimpleName MethodInvocation SimpleName recipient
session SimpleName MethodInvocation SimpleName write packet
session SimpleName MethodInvocation SimpleName buffer
write packet SimpleName MethodInvocation SimpleName buffer
result SimpleName SwitchStatement SwitchCase SimpleName replied
result SimpleName SwitchStatement SwitchCase SimpleName reply success
result SimpleName SwitchStatement IfStatement SimpleName want reply
replied SimpleName SwitchCase SwitchStatement SwitchCase SimpleName reply success
replied SimpleName SwitchCase SwitchStatement IfStatement SimpleName want reply
replied SimpleName SwitchCase SwitchStatement SwitchCase SimpleName reply failure
reply success SimpleName SwitchCase SwitchStatement IfStatement SimpleName want reply
reply success SimpleName SwitchCase SwitchStatement SwitchCase SimpleName reply failure
reply success SimpleName SwitchCase SwitchStatement IfStatement SimpleName want reply
want reply SimpleName IfStatement SwitchStatement SwitchCase SimpleName reply failure
want reply SimpleName IfStatement SwitchStatement IfStatement SimpleName want reply
reply failure SimpleName SwitchCase SwitchStatement IfStatement SimpleName want reply
handler SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName handlers
handlers SimpleName EnhancedForStatement Block SwitchStatement SimpleName result
log SimpleName MethodInvocation SimpleName warn
log SimpleName MethodInvocation StringLiteral unknown channel request {}
log SimpleName MethodInvocation SimpleName req
warn SimpleName MethodInvocation StringLiteral unknown channel request {}
warn SimpleName MethodInvocation SimpleName req
unknown channel request {} StringLiteral MethodInvocation SimpleName req
session SimpleName MethodInvocation SimpleName create buffer
session SimpleName MethodInvocation QualifiedName ssh constantsssh msg channel failure
create buffer SimpleName MethodInvocation QualifiedName ssh constantsssh msg channel failure
buffer SimpleName Assignment MethodInvocation SimpleName session
buffer SimpleName Assignment MethodInvocation SimpleName create buffer
buffer SimpleName Assignment MethodInvocation QualifiedName ssh constantsssh msg channel failure
buffer SimpleName MethodInvocation SimpleName put int
buffer SimpleName MethodInvocation SimpleName recipient
put int SimpleName MethodInvocation SimpleName recipient
session SimpleName MethodInvocation SimpleName write packet
session SimpleName MethodInvocation SimpleName buffer
write packet SimpleName MethodInvocation SimpleName buffer
boolean PrimitiveType VariableDeclarationStatement Block EnhancedForStatement SimpleName handlers
boolean PrimitiveType VariableDeclarationStatement Block IfStatement SimpleName want reply
handlers SimpleName EnhancedForStatement Block IfStatement SimpleName want reply
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName handle request
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName buffer
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName buffer
public Modifier MethodDeclaration SimpleType SimpleName io exception
public Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType boolean
public Modifier MethodDeclaration Block EnhancedForStatement SimpleName handlers
public Modifier MethodDeclaration Block IfStatement SimpleName want reply
void PrimitiveType MethodDeclaration SimpleName handle request
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName buffer
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName buffer
void PrimitiveType MethodDeclaration SimpleType SimpleName io exception
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType boolean
void PrimitiveType MethodDeclaration Block EnhancedForStatement SimpleName handlers
void PrimitiveType MethodDeclaration Block IfStatement SimpleName want reply
handle request SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName buffer
handle request SimpleName MethodDeclaration SingleVariableDeclaration SimpleName buffer
handle request SimpleName MethodDeclaration SimpleType SimpleName io exception
handle request SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType boolean
handle request SimpleName MethodDeclaration Block EnhancedForStatement SimpleName handlers
handle request SimpleName MethodDeclaration Block IfStatement SimpleName want reply
buffer SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName handle request
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName buffer
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName handle request
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName buffer
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
