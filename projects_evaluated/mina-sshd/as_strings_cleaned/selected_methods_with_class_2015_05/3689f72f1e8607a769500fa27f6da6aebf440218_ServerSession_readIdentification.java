buffer SimpleName SimpleType SingleVariableDeclaration SimpleName buffer
do read identification SimpleName MethodInvocation SimpleName buffer
do read identification SimpleName MethodInvocation BooleanLiteral true
buffer SimpleName MethodInvocation BooleanLiteral true
client version SimpleName Assignment MethodInvocation SimpleName do read identification
client version SimpleName Assignment MethodInvocation SimpleName buffer
client version SimpleName Assignment MethodInvocation BooleanLiteral true
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral client version string {}
log SimpleName MethodInvocation SimpleName client version
debug SimpleName MethodInvocation StringLiteral client version string {}
debug SimpleName MethodInvocation SimpleName client version
client version string {} StringLiteral MethodInvocation SimpleName client version
client version SimpleName MethodInvocation SimpleName starts with
client version SimpleName MethodInvocation SimpleName default ssh version prefix
starts with SimpleName MethodInvocation SimpleName default ssh version prefix
unsupported protocol version StringLiteral InfixExpression SimpleName client version
msg SimpleName VariableDeclarationFragment InfixExpression StringLiteral unsupported protocol version
msg SimpleName VariableDeclarationFragment InfixExpression SimpleName client version
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName msg
msg SimpleName InfixExpression StringLiteral empty
msg SimpleName InfixExpression ParenthesizedExpression MethodInvocation SimpleName get bytes
empty StringLiteral InfixExpression ParenthesizedExpression MethodInvocation SimpleName get bytes
byte array buffer SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get bytes
io session SimpleName MethodInvocation SimpleName write
io session SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName byte array buffer
io session SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get bytes
write SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName byte array buffer
write SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get bytes
ssh future listener SimpleName SimpleType ParameterizedType SimpleType SimpleName io write future
io write future SimpleName SimpleType SingleVariableDeclaration SimpleName future
close SimpleName MethodInvocation BooleanLiteral true
override SimpleName MarkerAnnotation MethodDeclaration Modifier public
override SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
override SimpleName MarkerAnnotation MethodDeclaration SimpleName operation complete
override SimpleName MarkerAnnotation MethodDeclaration SingleVariableDeclaration SimpleName future
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName operation complete
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName io write future
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName future
void PrimitiveType MethodDeclaration SimpleName operation complete
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName io write future
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName future
operation complete SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName io write future
operation complete SimpleName MethodDeclaration SingleVariableDeclaration SimpleName future
io session SimpleName MethodInvocation MethodInvocation SimpleName add listener
write SimpleName MethodInvocation MethodInvocation SimpleName add listener
ssh exception SimpleName SimpleType ClassInstanceCreation SimpleName msg
kex state SimpleName MethodInvocation SimpleName set
kex state SimpleName MethodInvocation SimpleName kex state init
set SimpleName MethodInvocation SimpleName kex state init
override SimpleName MarkerAnnotation MethodDeclaration Modifier protected
override SimpleName MarkerAnnotation MethodDeclaration PrimitiveType boolean
override SimpleName MarkerAnnotation MethodDeclaration SimpleName read identification
override SimpleName MarkerAnnotation MethodDeclaration SingleVariableDeclaration SimpleName buffer
override SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName io exception
protected Modifier MethodDeclaration PrimitiveType boolean
protected Modifier MethodDeclaration SimpleName read identification
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName buffer
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleName buffer
protected Modifier MethodDeclaration SimpleType SimpleName io exception
protected Modifier MethodDeclaration Block ReturnStatement BooleanLiteral true
boolean PrimitiveType MethodDeclaration SimpleName read identification
boolean PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName buffer
boolean PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName buffer
boolean PrimitiveType MethodDeclaration SimpleType SimpleName io exception
boolean PrimitiveType MethodDeclaration Block ReturnStatement BooleanLiteral true
read identification SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName buffer
read identification SimpleName MethodDeclaration SingleVariableDeclaration SimpleName buffer
read identification SimpleName MethodDeclaration SimpleType SimpleName io exception
read identification SimpleName MethodDeclaration Block ReturnStatement BooleanLiteral true
buffer SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName override
public Modifier TypeDeclaration MethodDeclaration Modifier protected
public Modifier TypeDeclaration MethodDeclaration PrimitiveType boolean
public Modifier TypeDeclaration MethodDeclaration SimpleName read identification
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName buffer
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName override
test SimpleName TypeDeclaration MethodDeclaration Modifier protected
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType boolean
test SimpleName TypeDeclaration MethodDeclaration SimpleName read identification
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName buffer
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
