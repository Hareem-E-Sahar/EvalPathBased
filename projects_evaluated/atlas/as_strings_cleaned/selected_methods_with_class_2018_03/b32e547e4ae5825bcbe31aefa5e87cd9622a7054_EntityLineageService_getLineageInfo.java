string SimpleName SimpleType SingleVariableDeclaration SimpleName guid
lineage direction SimpleName SimpleType SingleVariableDeclaration SimpleName direction
int PrimitiveType SingleVariableDeclaration SimpleName depth
map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
map SimpleName SimpleType ParameterizedType SimpleType SimpleName atlas entity header
string SimpleName SimpleType ParameterizedType SimpleType SimpleName atlas entity header
set SimpleName SimpleType ParameterizedType SimpleType SimpleName lineage relation
get lineage query SimpleName MethodInvocation SimpleName guid
get lineage query SimpleName MethodInvocation SimpleName direction
get lineage query SimpleName MethodInvocation SimpleName depth
guid SimpleName MethodInvocation SimpleName direction
guid SimpleName MethodInvocation SimpleName depth
direction SimpleName MethodInvocation SimpleName depth
lineage query SimpleName VariableDeclarationFragment MethodInvocation SimpleName get lineage query
lineage query SimpleName VariableDeclarationFragment MethodInvocation SimpleName guid
lineage query SimpleName VariableDeclarationFragment MethodInvocation SimpleName direction
lineage query SimpleName VariableDeclarationFragment MethodInvocation SimpleName depth
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName lineage query
graph SimpleName MethodInvocation SimpleName execute gremlin script
graph SimpleName MethodInvocation SimpleName lineage query
graph SimpleName MethodInvocation BooleanLiteral false
execute gremlin script SimpleName MethodInvocation SimpleName lineage query
execute gremlin script SimpleName MethodInvocation BooleanLiteral false
lineage query SimpleName MethodInvocation BooleanLiteral false
list SimpleName SimpleType CastExpression MethodInvocation SimpleName graph
list SimpleName SimpleType CastExpression MethodInvocation SimpleName execute gremlin script
list SimpleName SimpleType CastExpression MethodInvocation SimpleName lineage query
list SimpleName SimpleType CastExpression MethodInvocation BooleanLiteral false
edge map list SimpleName VariableDeclarationFragment CastExpression SimpleType SimpleName list
edge map list SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName graph
edge map list SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName execute gremlin script
edge map list SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName lineage query
edge map list SimpleName VariableDeclarationFragment CastExpression MethodInvocation BooleanLiteral false
list SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName edge map list
collection utils SimpleName MethodInvocation SimpleName is not empty
collection utils SimpleName MethodInvocation SimpleName edge map list
is not empty SimpleName MethodInvocation SimpleName edge map list
object SimpleName SimpleType SingleVariableDeclaration SimpleName edge map
edge map SimpleName InstanceofExpression SimpleType SimpleName map
final Modifier SingleVariableDeclaration SimpleType SimpleName object
final Modifier SingleVariableDeclaration SimpleName o
object SimpleName SimpleType SingleVariableDeclaration SimpleName o
map SimpleName SimpleType CastExpression SimpleName edge map
edge map SimpleName CastExpression ParenthesizedExpression MethodInvocation SimpleName entry set
mapentry QualifiedName SimpleType CastExpression SimpleName o
entry SimpleName VariableDeclarationFragment CastExpression SimpleType QualifiedName mapentry
entry SimpleName VariableDeclarationFragment CastExpression SimpleName o
final Modifier VariableDeclarationStatement SimpleType QualifiedName mapentry
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName entry
final Modifier VariableDeclarationStatement VariableDeclarationFragment CastExpression SimpleName o
mapentry QualifiedName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName entry
entry SimpleName MethodInvocation SimpleName get value
value SimpleName VariableDeclarationFragment MethodInvocation SimpleName entry
value SimpleName VariableDeclarationFragment MethodInvocation SimpleName get value
object SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName value
value SimpleName InstanceofExpression SimpleType SimpleName list
object SimpleName SimpleType SingleVariableDeclaration SimpleName elem
list SimpleName SimpleType CastExpression SimpleName value
elem SimpleName InstanceofExpression SimpleType SimpleName atlas edge
atlas edge SimpleName SimpleType CastExpression SimpleName elem
process edge SimpleName MethodInvocation CastExpression SimpleType SimpleName atlas edge
process edge SimpleName MethodInvocation CastExpression SimpleName elem
process edge SimpleName MethodInvocation SimpleName entities
process edge SimpleName MethodInvocation SimpleName relations
atlas edge SimpleName SimpleType CastExpression MethodInvocation SimpleName entities
elem SimpleName CastExpression MethodInvocation SimpleName entities
atlas edge SimpleName SimpleType CastExpression MethodInvocation SimpleName relations
elem SimpleName CastExpression MethodInvocation SimpleName relations
entities SimpleName MethodInvocation SimpleName relations
elem SimpleName MethodInvocation SimpleName get class
elem SimpleName MethodInvocation MethodInvocation SimpleName get simple name
get class SimpleName MethodInvocation MethodInvocation SimpleName get simple name
elem SimpleName InfixExpression ConditionalExpression MethodInvocation SimpleName get simple name
elem SimpleName InfixExpression ConditionalExpression StringLiteral null
elem SimpleName MethodInvocation MethodInvocation ConditionalExpression StringLiteral null
get class SimpleName MethodInvocation MethodInvocation ConditionalExpression StringLiteral null
get simple name SimpleName MethodInvocation ConditionalExpression StringLiteral null
log SimpleName MethodInvocation SimpleName warn
log SimpleName MethodInvocation StringLiteral invalid value of type {} found ignoring
log SimpleName MethodInvocation ParenthesizedExpression ConditionalExpression StringLiteral null
warn SimpleName MethodInvocation StringLiteral invalid value of type {} found ignoring
warn SimpleName MethodInvocation ParenthesizedExpression ConditionalExpression StringLiteral null
invalid value of type {} found ignoring StringLiteral MethodInvocation ParenthesizedExpression ConditionalExpression StringLiteral null
elem SimpleName SingleVariableDeclaration EnhancedForStatement CastExpression SimpleName value
value SimpleName InstanceofExpression SimpleType SimpleName atlas edge
atlas edge SimpleName SimpleType CastExpression SimpleName value
process edge SimpleName MethodInvocation CastExpression SimpleType SimpleName atlas edge
process edge SimpleName MethodInvocation CastExpression SimpleName value
process edge SimpleName MethodInvocation SimpleName entities
process edge SimpleName MethodInvocation SimpleName relations
atlas edge SimpleName SimpleType CastExpression MethodInvocation SimpleName entities
value SimpleName CastExpression MethodInvocation SimpleName entities
atlas edge SimpleName SimpleType CastExpression MethodInvocation SimpleName relations
value SimpleName CastExpression MethodInvocation SimpleName relations
entities SimpleName MethodInvocation SimpleName relations
value SimpleName MethodInvocation SimpleName get class
value SimpleName MethodInvocation MethodInvocation SimpleName get simple name
get class SimpleName MethodInvocation MethodInvocation SimpleName get simple name
value SimpleName InfixExpression ConditionalExpression MethodInvocation SimpleName get simple name
value SimpleName InfixExpression ConditionalExpression StringLiteral null
value SimpleName MethodInvocation MethodInvocation ConditionalExpression StringLiteral null
get class SimpleName MethodInvocation MethodInvocation ConditionalExpression StringLiteral null
get simple name SimpleName MethodInvocation ConditionalExpression StringLiteral null
log SimpleName MethodInvocation SimpleName warn
log SimpleName MethodInvocation StringLiteral invalid value of type {} found ignoring
log SimpleName MethodInvocation ParenthesizedExpression ConditionalExpression StringLiteral null
warn SimpleName MethodInvocation StringLiteral invalid value of type {} found ignoring
warn SimpleName MethodInvocation ParenthesizedExpression ConditionalExpression StringLiteral null
invalid value of type {} found ignoring StringLiteral MethodInvocation ParenthesizedExpression ConditionalExpression StringLiteral null
final Modifier SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName entry set
o SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName entry set
object SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName edge map list
edge map SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName edge map list
atlas lineage info SimpleName SimpleType ClassInstanceCreation SimpleName guid
atlas lineage info SimpleName SimpleType ClassInstanceCreation SimpleName entities
atlas lineage info SimpleName SimpleType ClassInstanceCreation SimpleName relations
atlas lineage info SimpleName SimpleType ClassInstanceCreation SimpleName direction
atlas lineage info SimpleName SimpleType ClassInstanceCreation SimpleName depth
guid SimpleName ClassInstanceCreation SimpleName entities
guid SimpleName ClassInstanceCreation SimpleName relations
guid SimpleName ClassInstanceCreation SimpleName direction
guid SimpleName ClassInstanceCreation SimpleName depth
entities SimpleName ClassInstanceCreation SimpleName relations
entities SimpleName ClassInstanceCreation SimpleName direction
entities SimpleName ClassInstanceCreation SimpleName depth
relations SimpleName ClassInstanceCreation SimpleName direction
relations SimpleName ClassInstanceCreation SimpleName depth
direction SimpleName ClassInstanceCreation SimpleName depth
private Modifier MethodDeclaration SimpleType SimpleName atlas lineage info
private Modifier MethodDeclaration SimpleName get lineage info
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName guid
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName lineage direction
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName direction
private Modifier MethodDeclaration SingleVariableDeclaration PrimitiveType int
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName depth
atlas lineage info SimpleName SimpleType MethodDeclaration SimpleName get lineage info
atlas lineage info SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName guid
atlas lineage info SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName direction
atlas lineage info SimpleName SimpleType MethodDeclaration SingleVariableDeclaration PrimitiveType int
atlas lineage info SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName depth
atlas lineage info SimpleName SimpleType MethodDeclaration SimpleType SimpleName atlas base exception
get lineage info SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
get lineage info SimpleName MethodDeclaration SingleVariableDeclaration SimpleName guid
get lineage info SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName lineage direction
get lineage info SimpleName MethodDeclaration SingleVariableDeclaration SimpleName direction
get lineage info SimpleName MethodDeclaration SingleVariableDeclaration PrimitiveType int
get lineage info SimpleName MethodDeclaration SingleVariableDeclaration SimpleName depth
get lineage info SimpleName MethodDeclaration SimpleType SimpleName atlas base exception
guid SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName direction
guid SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
guid SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName depth
guid SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName atlas base exception
direction SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
direction SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName depth
direction SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName atlas base exception
int PrimitiveType SingleVariableDeclaration MethodDeclaration SimpleType SimpleName atlas base exception
depth SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName atlas base exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName atlas lineage info
public Modifier TypeDeclaration MethodDeclaration SimpleName get lineage info
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName guid
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName direction
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName depth
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName atlas base exception
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName atlas lineage info
test SimpleName TypeDeclaration MethodDeclaration SimpleName get lineage info
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName guid
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName direction
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName depth
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName atlas base exception
