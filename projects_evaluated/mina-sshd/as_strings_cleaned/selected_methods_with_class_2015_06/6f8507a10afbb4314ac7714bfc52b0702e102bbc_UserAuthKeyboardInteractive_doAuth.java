buffer SimpleName SimpleType SingleVariableDeclaration SimpleName buffer
boolean PrimitiveType SingleVariableDeclaration SimpleName init
session SimpleName MethodInvocation SimpleName create buffer
session SimpleName MethodInvocation QualifiedName ssh constantsssh msg userauth info request
create buffer SimpleName MethodInvocation QualifiedName ssh constantsssh msg userauth info request
buffer SimpleName Assignment MethodInvocation SimpleName session
buffer SimpleName Assignment MethodInvocation SimpleName create buffer
buffer SimpleName Assignment MethodInvocation QualifiedName ssh constantsssh msg userauth info request
buffer SimpleName MethodInvocation SimpleName put string
buffer SimpleName MethodInvocation StringLiteral password authentication
put string SimpleName MethodInvocation StringLiteral password authentication
buffer SimpleName MethodInvocation SimpleName put string
buffer SimpleName MethodInvocation StringLiteral empty
put string SimpleName MethodInvocation StringLiteral empty
buffer SimpleName MethodInvocation SimpleName put string
buffer SimpleName MethodInvocation StringLiteral enus
put string SimpleName MethodInvocation StringLiteral enus
buffer SimpleName MethodInvocation SimpleName put int
buffer SimpleName MethodInvocation NumberLiteral empty
put int SimpleName MethodInvocation NumberLiteral empty
buffer SimpleName MethodInvocation SimpleName put string
buffer SimpleName MethodInvocation StringLiteral password
put string SimpleName MethodInvocation StringLiteral password
buffer SimpleName MethodInvocation SimpleName put boolean
buffer SimpleName MethodInvocation BooleanLiteral false
put boolean SimpleName MethodInvocation BooleanLiteral false
session SimpleName MethodInvocation SimpleName write packet
session SimpleName MethodInvocation SimpleName buffer
write packet SimpleName MethodInvocation SimpleName buffer
buffer SimpleName MethodInvocation SimpleName get byte
cmd SimpleName VariableDeclarationFragment MethodInvocation SimpleName buffer
cmd SimpleName VariableDeclarationFragment MethodInvocation SimpleName get byte
byte PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName cmd
byte PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName buffer
byte PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get byte
cmd SimpleName InfixExpression QualifiedName ssh constantsssh msg userauth info response
received unexpected message StringLiteral InfixExpression SimpleName cmd
ssh exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral received unexpected message
ssh exception SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName cmd
buffer SimpleName MethodInvocation SimpleName get int
num SimpleName VariableDeclarationFragment MethodInvocation SimpleName buffer
num SimpleName VariableDeclarationFragment MethodInvocation SimpleName get int
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName num
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName buffer
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get int
num SimpleName InfixExpression NumberLiteral empty
expected response from user but received StringLiteral InfixExpression SimpleName num
ssh exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral expected response from user but received
ssh exception SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName num
buffer SimpleName MethodInvocation SimpleName get string
password SimpleName VariableDeclarationFragment MethodInvocation SimpleName buffer
password SimpleName VariableDeclarationFragment MethodInvocation SimpleName get string
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName password
check password SimpleName MethodInvocation SimpleName session
check password SimpleName MethodInvocation SimpleName username
check password SimpleName MethodInvocation SimpleName password
session SimpleName MethodInvocation SimpleName username
session SimpleName MethodInvocation SimpleName password
username SimpleName MethodInvocation SimpleName password
boolean SimpleName MethodInvocation SimpleName value of
boolean SimpleName MethodInvocation MethodInvocation SimpleName check password
boolean SimpleName MethodInvocation MethodInvocation SimpleName session
boolean SimpleName MethodInvocation MethodInvocation SimpleName username
boolean SimpleName MethodInvocation MethodInvocation SimpleName password
value of SimpleName MethodInvocation MethodInvocation SimpleName check password
value of SimpleName MethodInvocation MethodInvocation SimpleName session
value of SimpleName MethodInvocation MethodInvocation SimpleName username
value of SimpleName MethodInvocation MethodInvocation SimpleName password
byte PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
init SimpleName IfStatement Block VariableDeclarationStatement PrimitiveType byte
init SimpleName IfStatement Block VariableDeclarationStatement PrimitiveType int
override SimpleName MarkerAnnotation MethodDeclaration Modifier protected
override SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName boolean
override SimpleName MarkerAnnotation MethodDeclaration SimpleName do auth
override SimpleName MarkerAnnotation MethodDeclaration SingleVariableDeclaration SimpleName buffer
override SimpleName MarkerAnnotation MethodDeclaration SingleVariableDeclaration PrimitiveType boolean
override SimpleName MarkerAnnotation MethodDeclaration SingleVariableDeclaration SimpleName init
protected Modifier MethodDeclaration SimpleType SimpleName boolean
protected Modifier MethodDeclaration SimpleName do auth
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName buffer
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleName buffer
protected Modifier MethodDeclaration SingleVariableDeclaration PrimitiveType boolean
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleName init
protected Modifier MethodDeclaration SimpleType SimpleName exception
boolean SimpleName SimpleType MethodDeclaration SimpleName do auth
boolean SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName buffer
boolean SimpleName SimpleType MethodDeclaration SingleVariableDeclaration PrimitiveType boolean
boolean SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName init
boolean SimpleName SimpleType MethodDeclaration SimpleType SimpleName exception
do auth SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName buffer
do auth SimpleName MethodDeclaration SingleVariableDeclaration SimpleName buffer
do auth SimpleName MethodDeclaration SingleVariableDeclaration PrimitiveType boolean
do auth SimpleName MethodDeclaration SingleVariableDeclaration SimpleName init
do auth SimpleName MethodDeclaration SimpleType SimpleName exception
do auth SimpleName MethodDeclaration Block IfStatement SimpleName init
buffer SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType boolean
buffer SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName init
buffer SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
boolean PrimitiveType SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
init SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName override
public Modifier TypeDeclaration MethodDeclaration Modifier protected
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName boolean
public Modifier TypeDeclaration MethodDeclaration SimpleName do auth
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName buffer
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType boolean
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName init
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName override
test SimpleName TypeDeclaration MethodDeclaration Modifier protected
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName boolean
test SimpleName TypeDeclaration MethodDeclaration SimpleName do auth
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName buffer
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType boolean
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName init
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
