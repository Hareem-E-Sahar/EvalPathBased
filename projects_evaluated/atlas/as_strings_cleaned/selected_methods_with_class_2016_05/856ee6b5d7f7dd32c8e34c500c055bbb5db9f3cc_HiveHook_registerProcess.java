hive meta store bridge SimpleName SimpleType SingleVariableDeclaration SimpleName dgi bridge
hive event context SimpleName SimpleType SingleVariableDeclaration SimpleName event
set SimpleName SimpleType ParameterizedType SimpleType SimpleName read entity
event SimpleName MethodInvocation SimpleName get inputs
inputs SimpleName VariableDeclarationFragment MethodInvocation SimpleName event
inputs SimpleName VariableDeclarationFragment MethodInvocation SimpleName get inputs
set SimpleName SimpleType ParameterizedType SimpleType SimpleName write entity
event SimpleName MethodInvocation SimpleName get outputs
outputs SimpleName VariableDeclarationFragment MethodInvocation SimpleName event
outputs SimpleName VariableDeclarationFragment MethodInvocation SimpleName get outputs
inputs SimpleName MethodInvocation SimpleName is empty
outputs SimpleName MethodInvocation SimpleName is empty
inputs SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName outputs
inputs SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName is empty
is empty SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName outputs
is empty SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName is empty
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation StringLiteral explain statement skipping
info SimpleName MethodInvocation StringLiteral explain statement skipping
event SimpleName MethodInvocation SimpleName get query id
event SimpleName MethodInvocation SimpleName get query str
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation StringLiteral query idplan is missing for {}
log SimpleName MethodInvocation MethodInvocation SimpleName event
log SimpleName MethodInvocation MethodInvocation SimpleName get query str
info SimpleName MethodInvocation StringLiteral query idplan is missing for {}
info SimpleName MethodInvocation MethodInvocation SimpleName event
info SimpleName MethodInvocation MethodInvocation SimpleName get query str
query idplan is missing for {} StringLiteral MethodInvocation MethodInvocation SimpleName event
query idplan is missing for {} StringLiteral MethodInvocation MethodInvocation SimpleName get query str
map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
map SimpleName SimpleType ParameterizedType SimpleType SimpleName referenceable
string SimpleName SimpleType ParameterizedType SimpleType SimpleName referenceable
final Modifier VariableDeclarationStatement ParameterizedType SimpleType SimpleName map
final Modifier VariableDeclarationStatement ParameterizedType SimpleType SimpleName string
final Modifier VariableDeclarationStatement ParameterizedType SimpleType SimpleName referenceable
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName source
map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
map SimpleName SimpleType ParameterizedType SimpleType SimpleName referenceable
string SimpleName SimpleType ParameterizedType SimpleType SimpleName referenceable
final Modifier VariableDeclarationStatement ParameterizedType SimpleType SimpleName map
final Modifier VariableDeclarationStatement ParameterizedType SimpleType SimpleName string
final Modifier VariableDeclarationStatement ParameterizedType SimpleType SimpleName referenceable
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName target
is select query SimpleName MethodInvocation SimpleName event
is select query SimpleName VariableDeclarationFragment MethodInvocation SimpleName is select query
is select query SimpleName VariableDeclarationFragment MethodInvocation SimpleName event
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName is select query
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName is select query
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName event
read entity SimpleName SimpleType SingleVariableDeclaration SimpleName read entity
event SimpleName MethodInvocation SimpleName get inputs
process hive entity SimpleName MethodInvocation SimpleName dgi bridge
process hive entity SimpleName MethodInvocation SimpleName event
process hive entity SimpleName MethodInvocation SimpleName read entity
process hive entity SimpleName MethodInvocation SimpleName source
dgi bridge SimpleName MethodInvocation SimpleName event
dgi bridge SimpleName MethodInvocation SimpleName read entity
dgi bridge SimpleName MethodInvocation SimpleName source
event SimpleName MethodInvocation SimpleName read entity
event SimpleName MethodInvocation SimpleName source
read entity SimpleName MethodInvocation SimpleName source
read entity SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName event
read entity SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName get inputs
write entity SimpleName SimpleType SingleVariableDeclaration SimpleName write entity
event SimpleName MethodInvocation SimpleName get outputs
process hive entity SimpleName MethodInvocation SimpleName dgi bridge
process hive entity SimpleName MethodInvocation SimpleName event
process hive entity SimpleName MethodInvocation SimpleName write entity
process hive entity SimpleName MethodInvocation SimpleName target
dgi bridge SimpleName MethodInvocation SimpleName event
dgi bridge SimpleName MethodInvocation SimpleName write entity
dgi bridge SimpleName MethodInvocation SimpleName target
event SimpleName MethodInvocation SimpleName write entity
event SimpleName MethodInvocation SimpleName target
write entity SimpleName MethodInvocation SimpleName target
write entity SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName event
write entity SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName get outputs
source SimpleName MethodInvocation SimpleName size
source SimpleName MethodInvocation InfixExpression NumberLiteral empty
size SimpleName MethodInvocation InfixExpression NumberLiteral empty
target SimpleName MethodInvocation SimpleName size
target SimpleName MethodInvocation InfixExpression NumberLiteral empty
size SimpleName MethodInvocation InfixExpression NumberLiteral empty
empty NumberLiteral InfixExpression InfixExpression InfixExpression NumberLiteral empty
array list SimpleName SimpleType ParameterizedType SimpleType SimpleName referenceable
source SimpleName MethodInvocation SimpleName values
add all SimpleName MethodInvocation MethodInvocation SimpleName source
add all SimpleName MethodInvocation MethodInvocation SimpleName values
array list SimpleName SimpleType ParameterizedType SimpleType SimpleName referenceable
target SimpleName MethodInvocation SimpleName values
add all SimpleName MethodInvocation MethodInvocation SimpleName target
add all SimpleName MethodInvocation MethodInvocation SimpleName values
get process referenceable SimpleName MethodInvocation SimpleName event
process referenceable SimpleName VariableDeclarationFragment MethodInvocation SimpleName get process referenceable
process referenceable SimpleName VariableDeclarationFragment MethodInvocation SimpleName event
referenceable SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName process referenceable
event SimpleName MethodInvocation SimpleName get user
hook notificationentity create request QualifiedName SimpleType ClassInstanceCreation MethodInvocation SimpleName event
hook notificationentity create request QualifiedName SimpleType ClassInstanceCreation MethodInvocation SimpleName get user
hook notificationentity create request QualifiedName SimpleType ClassInstanceCreation SimpleName process referenceable
event SimpleName MethodInvocation ClassInstanceCreation SimpleName process referenceable
get user SimpleName MethodInvocation ClassInstanceCreation SimpleName process referenceable
messages SimpleName MethodInvocation SimpleName add
messages SimpleName MethodInvocation ClassInstanceCreation SimpleType QualifiedName hook notificationentity create request
messages SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName event
messages SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get user
messages SimpleName MethodInvocation ClassInstanceCreation SimpleName process referenceable
add SimpleName MethodInvocation ClassInstanceCreation SimpleType QualifiedName hook notificationentity create request
add SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName event
add SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get user
add SimpleName MethodInvocation ClassInstanceCreation SimpleName process referenceable
event SimpleName MethodInvocation SimpleName get query str
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation StringLiteral skipped query {} since it has no get inputs or resulting get outputs
log SimpleName MethodInvocation MethodInvocation SimpleName event
log SimpleName MethodInvocation MethodInvocation SimpleName get query str
info SimpleName MethodInvocation StringLiteral skipped query {} since it has no get inputs or resulting get outputs
info SimpleName MethodInvocation MethodInvocation SimpleName event
info SimpleName MethodInvocation MethodInvocation SimpleName get query str
skipped query {} since it has no get inputs or resulting get outputs StringLiteral MethodInvocation MethodInvocation SimpleName event
skipped query {} since it has no get inputs or resulting get outputs StringLiteral MethodInvocation MethodInvocation SimpleName get query str
event SimpleName MethodInvocation SimpleName get query str
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation StringLiteral skipped query {} for processing since it is a select query
log SimpleName MethodInvocation MethodInvocation SimpleName event
log SimpleName MethodInvocation MethodInvocation SimpleName get query str
info SimpleName MethodInvocation StringLiteral skipped query {} for processing since it is a select query
info SimpleName MethodInvocation MethodInvocation SimpleName event
info SimpleName MethodInvocation MethodInvocation SimpleName get query str
skipped query {} for processing since it is a select query StringLiteral MethodInvocation MethodInvocation SimpleName event
skipped query {} for processing since it is a select query StringLiteral MethodInvocation MethodInvocation SimpleName get query str
final Modifier VariableDeclarationStatement Block VariableDeclarationStatement Modifier final
final Modifier VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType boolean
final Modifier VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType boolean
private Modifier MethodDeclaration PrimitiveType void
private Modifier MethodDeclaration SimpleName register process
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName hive meta store bridge
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName dgi bridge
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName hive event context
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName event
private Modifier MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration SimpleName register process
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName hive meta store bridge
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName dgi bridge
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName hive event context
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName event
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement Modifier final
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement Modifier final
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType boolean
register process SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName hive meta store bridge
register process SimpleName MethodDeclaration SingleVariableDeclaration SimpleName dgi bridge
register process SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName hive event context
register process SimpleName MethodDeclaration SingleVariableDeclaration SimpleName event
register process SimpleName MethodDeclaration SimpleType SimpleName exception
register process SimpleName MethodDeclaration Block VariableDeclarationStatement Modifier final
register process SimpleName MethodDeclaration Block VariableDeclarationStatement Modifier final
register process SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType boolean
dgi bridge SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName event
dgi bridge SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
event SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName register process
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName dgi bridge
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName event
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName register process
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName dgi bridge
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName event
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
