object SimpleName SimpleType SingleVariableDeclaration SimpleName obj
string SimpleName SimpleType SingleVariableDeclaration SimpleName obj name
list SimpleName SimpleType ParameterizedType SimpleType SimpleName string
list SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName messages
string SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName messages
ret SimpleName VariableDeclarationFragment BooleanLiteral true
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName ret
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment BooleanLiteral true
obj SimpleName InstanceofExpression SimpleType SimpleName atlas struct
atlas struct SimpleName SimpleType CastExpression SimpleName obj
struct obj SimpleName VariableDeclarationFragment CastExpression SimpleType SimpleName atlas struct
struct obj SimpleName VariableDeclarationFragment CastExpression SimpleName obj
atlas struct SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName struct obj
atlas attribute def SimpleName SimpleType SingleVariableDeclaration SimpleName attribute def
struct def SimpleName MethodInvocation SimpleName get attribute defs
attribute def SimpleName MethodInvocation SimpleName get name
attr name SimpleName VariableDeclarationFragment MethodInvocation SimpleName attribute def
attr name SimpleName VariableDeclarationFragment MethodInvocation SimpleName get name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName attr name
attribute def SimpleName MethodInvocation SimpleName get name
attr types SimpleName MethodInvocation SimpleName get
attr types SimpleName MethodInvocation MethodInvocation SimpleName attribute def
attr types SimpleName MethodInvocation MethodInvocation SimpleName get name
get SimpleName MethodInvocation MethodInvocation SimpleName attribute def
get SimpleName MethodInvocation MethodInvocation SimpleName get name
data type SimpleName VariableDeclarationFragment MethodInvocation SimpleName attr types
data type SimpleName VariableDeclarationFragment MethodInvocation SimpleName get
data type SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName attribute def
data type SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get name
atlas type SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName data type
struct obj SimpleName MethodInvocation SimpleName get attribute
struct obj SimpleName MethodInvocation SimpleName attr name
get attribute SimpleName MethodInvocation SimpleName attr name
value SimpleName VariableDeclarationFragment MethodInvocation SimpleName struct obj
value SimpleName VariableDeclarationFragment MethodInvocation SimpleName get attribute
value SimpleName VariableDeclarationFragment MethodInvocation SimpleName attr name
object SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName value
obj name SimpleName InfixExpression StringLiteral .
obj name SimpleName InfixExpression SimpleName attr name
. StringLiteral InfixExpression SimpleName attr name
field name SimpleName VariableDeclarationFragment InfixExpression SimpleName obj name
field name SimpleName VariableDeclarationFragment InfixExpression StringLiteral .
field name SimpleName VariableDeclarationFragment InfixExpression SimpleName attr name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName field name
data type SimpleName MethodInvocation SimpleName validate value
data type SimpleName MethodInvocation SimpleName value
data type SimpleName MethodInvocation SimpleName field name
data type SimpleName MethodInvocation SimpleName messages
validate value SimpleName MethodInvocation SimpleName value
validate value SimpleName MethodInvocation SimpleName field name
validate value SimpleName MethodInvocation SimpleName messages
value SimpleName MethodInvocation SimpleName field name
value SimpleName MethodInvocation SimpleName messages
field name SimpleName MethodInvocation SimpleName messages
data type SimpleName MethodInvocation InfixExpression SimpleName ret
validate value SimpleName MethodInvocation InfixExpression SimpleName ret
value SimpleName MethodInvocation InfixExpression SimpleName ret
field name SimpleName MethodInvocation InfixExpression SimpleName ret
messages SimpleName MethodInvocation InfixExpression SimpleName ret
ret SimpleName Assignment InfixExpression MethodInvocation SimpleName data type
ret SimpleName Assignment InfixExpression MethodInvocation SimpleName validate value
ret SimpleName Assignment InfixExpression MethodInvocation SimpleName value
ret SimpleName Assignment InfixExpression MethodInvocation SimpleName field name
ret SimpleName Assignment InfixExpression MethodInvocation SimpleName messages
ret SimpleName Assignment InfixExpression SimpleName ret
attribute def SimpleName MethodInvocation SimpleName get is optional
ret SimpleName Assignment BooleanLiteral false
field name SimpleName InfixExpression StringLiteral : mandatory attribute value missing in type
field name SimpleName InfixExpression MethodInvocation SimpleName get type name
: mandatory attribute value missing in type StringLiteral InfixExpression MethodInvocation SimpleName get type name
messages SimpleName MethodInvocation SimpleName add
messages SimpleName MethodInvocation InfixExpression SimpleName field name
messages SimpleName MethodInvocation InfixExpression StringLiteral : mandatory attribute value missing in type
messages SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get type name
add SimpleName MethodInvocation InfixExpression SimpleName field name
add SimpleName MethodInvocation InfixExpression StringLiteral : mandatory attribute value missing in type
add SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get type name
attribute def SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName struct def
attribute def SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName get attribute defs
obj SimpleName InstanceofExpression SimpleType SimpleName map
map SimpleName SimpleType CastExpression SimpleName obj
map SimpleName VariableDeclarationFragment CastExpression SimpleType SimpleName map
map SimpleName VariableDeclarationFragment CastExpression SimpleName obj
map SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName map
atlas attribute def SimpleName SimpleType SingleVariableDeclaration SimpleName attribute def
struct def SimpleName MethodInvocation SimpleName get attribute defs
attribute def SimpleName MethodInvocation SimpleName get name
attr name SimpleName VariableDeclarationFragment MethodInvocation SimpleName attribute def
attr name SimpleName VariableDeclarationFragment MethodInvocation SimpleName get name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName attr name
attribute def SimpleName MethodInvocation SimpleName get name
attr types SimpleName MethodInvocation SimpleName get
attr types SimpleName MethodInvocation MethodInvocation SimpleName attribute def
attr types SimpleName MethodInvocation MethodInvocation SimpleName get name
get SimpleName MethodInvocation MethodInvocation SimpleName attribute def
get SimpleName MethodInvocation MethodInvocation SimpleName get name
data type SimpleName VariableDeclarationFragment MethodInvocation SimpleName attr types
data type SimpleName VariableDeclarationFragment MethodInvocation SimpleName get
data type SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName attribute def
data type SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get name
atlas type SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName data type
map SimpleName MethodInvocation SimpleName get
map SimpleName MethodInvocation SimpleName attr name
get SimpleName MethodInvocation SimpleName attr name
value SimpleName VariableDeclarationFragment MethodInvocation SimpleName map
value SimpleName VariableDeclarationFragment MethodInvocation SimpleName get
value SimpleName VariableDeclarationFragment MethodInvocation SimpleName attr name
object SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName value
obj name SimpleName InfixExpression StringLiteral .
obj name SimpleName InfixExpression SimpleName attr name
. StringLiteral InfixExpression SimpleName attr name
field name SimpleName VariableDeclarationFragment InfixExpression SimpleName obj name
field name SimpleName VariableDeclarationFragment InfixExpression StringLiteral .
field name SimpleName VariableDeclarationFragment InfixExpression SimpleName attr name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName field name
data type SimpleName MethodInvocation SimpleName validate value
data type SimpleName MethodInvocation SimpleName value
data type SimpleName MethodInvocation SimpleName field name
data type SimpleName MethodInvocation SimpleName messages
validate value SimpleName MethodInvocation SimpleName value
validate value SimpleName MethodInvocation SimpleName field name
validate value SimpleName MethodInvocation SimpleName messages
value SimpleName MethodInvocation SimpleName field name
value SimpleName MethodInvocation SimpleName messages
field name SimpleName MethodInvocation SimpleName messages
data type SimpleName MethodInvocation InfixExpression SimpleName ret
validate value SimpleName MethodInvocation InfixExpression SimpleName ret
value SimpleName MethodInvocation InfixExpression SimpleName ret
field name SimpleName MethodInvocation InfixExpression SimpleName ret
messages SimpleName MethodInvocation InfixExpression SimpleName ret
ret SimpleName Assignment InfixExpression MethodInvocation SimpleName data type
ret SimpleName Assignment InfixExpression MethodInvocation SimpleName validate value
ret SimpleName Assignment InfixExpression MethodInvocation SimpleName value
ret SimpleName Assignment InfixExpression MethodInvocation SimpleName field name
ret SimpleName Assignment InfixExpression MethodInvocation SimpleName messages
ret SimpleName Assignment InfixExpression SimpleName ret
attribute def SimpleName MethodInvocation SimpleName get is optional
ret SimpleName Assignment BooleanLiteral false
field name SimpleName InfixExpression StringLiteral : mandatory attribute value missing in type
field name SimpleName InfixExpression MethodInvocation SimpleName get type name
: mandatory attribute value missing in type StringLiteral InfixExpression MethodInvocation SimpleName get type name
messages SimpleName MethodInvocation SimpleName add
messages SimpleName MethodInvocation InfixExpression SimpleName field name
messages SimpleName MethodInvocation InfixExpression StringLiteral : mandatory attribute value missing in type
messages SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get type name
add SimpleName MethodInvocation InfixExpression SimpleName field name
add SimpleName MethodInvocation InfixExpression StringLiteral : mandatory attribute value missing in type
add SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get type name
attribute def SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName struct def
attribute def SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName get attribute defs
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
boolean PrimitiveType VariableDeclarationStatement Block ReturnStatement SimpleName ret
override SimpleName MarkerAnnotation MethodDeclaration Modifier public
override SimpleName MarkerAnnotation MethodDeclaration PrimitiveType boolean
override SimpleName MarkerAnnotation MethodDeclaration SimpleName validate value
override SimpleName MarkerAnnotation MethodDeclaration SingleVariableDeclaration SimpleName obj
override SimpleName MarkerAnnotation MethodDeclaration SingleVariableDeclaration SimpleName obj name
public Modifier MethodDeclaration PrimitiveType boolean
public Modifier MethodDeclaration SimpleName validate value
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName object
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName obj
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName obj name
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName messages
boolean PrimitiveType MethodDeclaration SimpleName validate value
boolean PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName object
boolean PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName obj
boolean PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
boolean PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName obj name
boolean PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName messages
boolean PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType boolean
boolean PrimitiveType MethodDeclaration Block ReturnStatement SimpleName ret
validate value SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName object
validate value SimpleName MethodDeclaration SingleVariableDeclaration SimpleName obj
validate value SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
validate value SimpleName MethodDeclaration SingleVariableDeclaration SimpleName obj name
validate value SimpleName MethodDeclaration SingleVariableDeclaration SimpleName messages
validate value SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType boolean
validate value SimpleName MethodDeclaration Block ReturnStatement SimpleName ret
obj SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName obj name
obj SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName messages
obj name SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName messages
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName override
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType boolean
public Modifier TypeDeclaration MethodDeclaration SimpleName validate value
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName obj
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName obj name
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName messages
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName override
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType boolean
test SimpleName TypeDeclaration MethodDeclaration SimpleName validate value
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName obj
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName obj name
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName messages
