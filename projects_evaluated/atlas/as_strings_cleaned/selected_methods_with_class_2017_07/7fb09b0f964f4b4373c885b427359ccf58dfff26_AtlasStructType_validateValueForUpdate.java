object SimpleName SimpleType SingleVariableDeclaration SimpleName obj
string SimpleName SimpleType SingleVariableDeclaration SimpleName obj name
list SimpleName SimpleType ParameterizedType SimpleType SimpleName string
list SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName messages
string SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName messages
ret SimpleName VariableDeclarationFragment BooleanLiteral true
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName ret
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment BooleanLiteral true
map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
map SimpleName SimpleType ParameterizedType SimpleType SimpleName object
string SimpleName SimpleType ParameterizedType SimpleType SimpleName object
obj SimpleName InstanceofExpression SimpleType SimpleName atlas struct
atlas struct SimpleName SimpleType CastExpression SimpleName obj
struct obj SimpleName VariableDeclarationFragment CastExpression SimpleType SimpleName atlas struct
struct obj SimpleName VariableDeclarationFragment CastExpression SimpleName obj
atlas struct SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName struct obj
struct obj SimpleName MethodInvocation SimpleName get attributes
attributes SimpleName Assignment MethodInvocation SimpleName struct obj
attributes SimpleName Assignment MethodInvocation SimpleName get attributes
obj SimpleName InstanceofExpression SimpleType SimpleName map
map SimpleName SimpleType CastExpression SimpleName obj
atlas type util SimpleName MethodInvocation SimpleName to struct attributes
atlas type util SimpleName MethodInvocation CastExpression SimpleType SimpleName map
atlas type util SimpleName MethodInvocation CastExpression SimpleName obj
to struct attributes SimpleName MethodInvocation CastExpression SimpleType SimpleName map
to struct attributes SimpleName MethodInvocation CastExpression SimpleName obj
attributes SimpleName Assignment MethodInvocation SimpleName atlas type util
attributes SimpleName Assignment MethodInvocation SimpleName to struct attributes
attributes SimpleName Assignment MethodInvocation CastExpression SimpleName obj
ret SimpleName Assignment BooleanLiteral false
obj name SimpleName InfixExpression StringLiteral =
obj name SimpleName InfixExpression SimpleName obj
obj name SimpleName InfixExpression StringLiteral : invalid value for type
obj name SimpleName InfixExpression MethodInvocation SimpleName get type name
= StringLiteral InfixExpression SimpleName obj
= StringLiteral InfixExpression StringLiteral : invalid value for type
= StringLiteral InfixExpression MethodInvocation SimpleName get type name
obj SimpleName InfixExpression StringLiteral : invalid value for type
obj SimpleName InfixExpression MethodInvocation SimpleName get type name
: invalid value for type StringLiteral InfixExpression MethodInvocation SimpleName get type name
messages SimpleName MethodInvocation SimpleName add
messages SimpleName MethodInvocation InfixExpression SimpleName obj name
messages SimpleName MethodInvocation InfixExpression StringLiteral =
messages SimpleName MethodInvocation InfixExpression SimpleName obj
messages SimpleName MethodInvocation InfixExpression StringLiteral : invalid value for type
messages SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get type name
add SimpleName MethodInvocation InfixExpression SimpleName obj name
add SimpleName MethodInvocation InfixExpression StringLiteral =
add SimpleName MethodInvocation InfixExpression SimpleName obj
add SimpleName MethodInvocation InfixExpression StringLiteral : invalid value for type
add SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get type name
map utils SimpleName MethodInvocation SimpleName is not empty
map utils SimpleName MethodInvocation SimpleName attributes
is not empty SimpleName MethodInvocation SimpleName attributes
mapentry QualifiedName SimpleType ParameterizedType SimpleType SimpleName string
mapentry QualifiedName SimpleType ParameterizedType SimpleType SimpleName object
string SimpleName SimpleType ParameterizedType SimpleType SimpleName object
mapentry QualifiedName SimpleType ParameterizedType SingleVariableDeclaration SimpleName e
string SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName e
object SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName e
attributes SimpleName MethodInvocation SimpleName entry set
e SimpleName MethodInvocation SimpleName get key
attr name SimpleName VariableDeclarationFragment MethodInvocation SimpleName e
attr name SimpleName VariableDeclarationFragment MethodInvocation SimpleName get key
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName attr name
e SimpleName MethodInvocation SimpleName get value
attr value SimpleName VariableDeclarationFragment MethodInvocation SimpleName e
attr value SimpleName VariableDeclarationFragment MethodInvocation SimpleName get value
object SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName attr value
all attributes SimpleName MethodInvocation SimpleName get
all attributes SimpleName MethodInvocation SimpleName attr name
get SimpleName MethodInvocation SimpleName attr name
attribute SimpleName VariableDeclarationFragment MethodInvocation SimpleName all attributes
attribute SimpleName VariableDeclarationFragment MethodInvocation SimpleName get
attribute SimpleName VariableDeclarationFragment MethodInvocation SimpleName attr name
atlas attribute SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName attribute
attribute SimpleName MethodInvocation SimpleName get attribute type
data type SimpleName VariableDeclarationFragment MethodInvocation SimpleName attribute
data type SimpleName VariableDeclarationFragment MethodInvocation SimpleName get attribute type
atlas type SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName data type
obj name SimpleName InfixExpression StringLiteral .
obj name SimpleName InfixExpression SimpleName attr name
. StringLiteral InfixExpression SimpleName attr name
field name SimpleName VariableDeclarationFragment InfixExpression SimpleName obj name
field name SimpleName VariableDeclarationFragment InfixExpression StringLiteral .
field name SimpleName VariableDeclarationFragment InfixExpression SimpleName attr name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName field name
data type SimpleName MethodInvocation SimpleName validate value for update
data type SimpleName MethodInvocation SimpleName attr value
data type SimpleName MethodInvocation SimpleName field name
data type SimpleName MethodInvocation SimpleName messages
validate value for update SimpleName MethodInvocation SimpleName attr value
validate value for update SimpleName MethodInvocation SimpleName field name
validate value for update SimpleName MethodInvocation SimpleName messages
attr value SimpleName MethodInvocation SimpleName field name
attr value SimpleName MethodInvocation SimpleName messages
field name SimpleName MethodInvocation SimpleName messages
data type SimpleName MethodInvocation InfixExpression SimpleName ret
validate value for update SimpleName MethodInvocation InfixExpression SimpleName ret
attr value SimpleName MethodInvocation InfixExpression SimpleName ret
field name SimpleName MethodInvocation InfixExpression SimpleName ret
messages SimpleName MethodInvocation InfixExpression SimpleName ret
ret SimpleName Assignment InfixExpression MethodInvocation SimpleName data type
ret SimpleName Assignment InfixExpression MethodInvocation SimpleName validate value for update
ret SimpleName Assignment InfixExpression MethodInvocation SimpleName attr value
ret SimpleName Assignment InfixExpression MethodInvocation SimpleName field name
ret SimpleName Assignment InfixExpression MethodInvocation SimpleName messages
ret SimpleName Assignment InfixExpression SimpleName ret
e SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName attributes
e SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName entry set
boolean PrimitiveType VariableDeclarationStatement Block ReturnStatement SimpleName ret
override SimpleName MarkerAnnotation MethodDeclaration Modifier public
override SimpleName MarkerAnnotation MethodDeclaration PrimitiveType boolean
override SimpleName MarkerAnnotation MethodDeclaration SimpleName validate value for update
override SimpleName MarkerAnnotation MethodDeclaration SingleVariableDeclaration SimpleName obj
override SimpleName MarkerAnnotation MethodDeclaration SingleVariableDeclaration SimpleName obj name
public Modifier MethodDeclaration PrimitiveType boolean
public Modifier MethodDeclaration SimpleName validate value for update
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName object
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName obj
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName obj name
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName messages
boolean PrimitiveType MethodDeclaration SimpleName validate value for update
boolean PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName object
boolean PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName obj
boolean PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
boolean PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName obj name
boolean PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName messages
boolean PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType boolean
boolean PrimitiveType MethodDeclaration Block ReturnStatement SimpleName ret
validate value for update SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName object
validate value for update SimpleName MethodDeclaration SingleVariableDeclaration SimpleName obj
validate value for update SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
validate value for update SimpleName MethodDeclaration SingleVariableDeclaration SimpleName obj name
validate value for update SimpleName MethodDeclaration SingleVariableDeclaration SimpleName messages
validate value for update SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType boolean
validate value for update SimpleName MethodDeclaration Block ReturnStatement SimpleName ret
obj SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName obj name
obj SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName messages
obj name SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName messages
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName override
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType boolean
public Modifier TypeDeclaration MethodDeclaration SimpleName validate value for update
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName obj
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName obj name
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName messages
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName override
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType boolean
test SimpleName TypeDeclaration MethodDeclaration SimpleName validate value for update
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName obj
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName obj name
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName messages
