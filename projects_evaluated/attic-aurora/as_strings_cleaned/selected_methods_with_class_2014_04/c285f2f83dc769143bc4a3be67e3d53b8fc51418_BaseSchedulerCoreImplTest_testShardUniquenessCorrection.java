control SimpleName MethodInvocation SimpleName replay
storage SimpleName Assignment MethodInvocation SimpleName create storage
task id SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName atomic integer
final Modifier VariableDeclarationStatement SimpleType SimpleName atomic integer
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName task id
atomic integer SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName task id
make job SimpleName MethodInvocation SimpleName key a
make job SimpleName MethodInvocation NumberLiteral empty
key a SimpleName MethodInvocation NumberLiteral empty
job SimpleName VariableDeclarationFragment MethodInvocation SimpleName make job
job SimpleName VariableDeclarationFragment MethodInvocation SimpleName key a
job SimpleName VariableDeclarationFragment MethodInvocation NumberLiteral empty
sanitized configuration SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName job
set SimpleName SimpleType ParameterizedType SimpleType SimpleName i scheduled task
job SimpleName MethodInvocation SimpleName get task configs
job SimpleName MethodInvocation MethodInvocation SimpleName values
get task configs SimpleName MethodInvocation MethodInvocation SimpleName values
function SimpleName SimpleType ParameterizedType SimpleType SimpleName i task config
function SimpleName SimpleType ParameterizedType SimpleType SimpleName i scheduled task
i task config SimpleName SimpleType ParameterizedType SimpleType SimpleName i scheduled task
i task config SimpleName SimpleType SingleVariableDeclaration SimpleName task
scheduled task SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName set status
scheduled task SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName running
set status SimpleName MethodInvocation SimpleName running
assigned task SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName set instance id
assigned task SimpleName SimpleType ClassInstanceCreation MethodInvocation NumberLiteral empty
set instance id SimpleName MethodInvocation NumberLiteral empty
task id SimpleName MethodInvocation SimpleName increment and get
task StringLiteral InfixExpression MethodInvocation SimpleName task id
task StringLiteral InfixExpression MethodInvocation SimpleName increment and get
set instance id SimpleName MethodInvocation MethodInvocation SimpleName set task id
empty NumberLiteral MethodInvocation MethodInvocation SimpleName set task id
set instance id SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral task
empty NumberLiteral MethodInvocation MethodInvocation InfixExpression StringLiteral task
set task id SimpleName MethodInvocation InfixExpression StringLiteral task
set task id SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName task id
set task id SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName increment and get
task SimpleName MethodInvocation SimpleName new builder
set instance id SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName set task
empty NumberLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName set task
set task id SimpleName MethodInvocation MethodInvocation SimpleName set task
task StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName set task
set task id SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName task
set task id SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName new builder
set task SimpleName MethodInvocation MethodInvocation SimpleName task
set task SimpleName MethodInvocation MethodInvocation SimpleName new builder
set status SimpleName MethodInvocation MethodInvocation SimpleName set assigned task
running SimpleName MethodInvocation MethodInvocation SimpleName set assigned task
set status SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName set task
running SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName set task
set assigned task SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName set task id
set assigned task SimpleName MethodInvocation MethodInvocation SimpleName set task
set assigned task SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName task
set assigned task SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName new builder
i scheduled task SimpleName MethodInvocation SimpleName build
i scheduled task SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName set status
i scheduled task SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName running
i scheduled task SimpleName MethodInvocation MethodInvocation SimpleName set assigned task
i scheduled task SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName set task
build SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName set status
build SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName running
build SimpleName MethodInvocation MethodInvocation SimpleName set assigned task
build SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName set task
override SimpleName MarkerAnnotation MethodDeclaration Modifier public
override SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName i scheduled task
override SimpleName MarkerAnnotation MethodDeclaration SimpleName apply
override SimpleName MarkerAnnotation MethodDeclaration SingleVariableDeclaration SimpleName task
public Modifier MethodDeclaration SimpleType SimpleName i scheduled task
public Modifier MethodDeclaration SimpleName apply
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName i task config
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName task
i scheduled task SimpleName SimpleType MethodDeclaration SimpleName apply
i scheduled task SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName task
apply SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName i task config
apply SimpleName MethodDeclaration SingleVariableDeclaration SimpleName task
iterables SimpleName MethodInvocation SimpleName transform
iterables SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName job
iterables SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get task configs
iterables SimpleName MethodInvocation MethodInvocation SimpleName values
transform SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName job
transform SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get task configs
transform SimpleName MethodInvocation MethodInvocation SimpleName values
immutable set SimpleName MethodInvocation SimpleName copy of
immutable set SimpleName MethodInvocation MethodInvocation SimpleName iterables
immutable set SimpleName MethodInvocation MethodInvocation SimpleName transform
immutable set SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName values
copy of SimpleName MethodInvocation MethodInvocation SimpleName iterables
copy of SimpleName MethodInvocation MethodInvocation SimpleName transform
copy of SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName values
bad tasks SimpleName VariableDeclarationFragment MethodInvocation SimpleName immutable set
bad tasks SimpleName VariableDeclarationFragment MethodInvocation SimpleName copy of
bad tasks SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName iterables
bad tasks SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName transform
final Modifier VariableDeclarationStatement ParameterizedType SimpleType SimpleName set
final Modifier VariableDeclarationStatement ParameterizedType SimpleType SimpleName i scheduled task
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName bad tasks
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName immutable set
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName copy of
mutable store provider SimpleName SimpleType SingleVariableDeclaration SimpleName store provider
store provider SimpleName MethodInvocation SimpleName get unsafe task store
store provider SimpleName MethodInvocation MethodInvocation SimpleName save tasks
get unsafe task store SimpleName MethodInvocation MethodInvocation SimpleName save tasks
store provider SimpleName MethodInvocation MethodInvocation SimpleName bad tasks
get unsafe task store SimpleName MethodInvocation MethodInvocation SimpleName bad tasks
save tasks SimpleName MethodInvocation SimpleName bad tasks
override SimpleName MarkerAnnotation MethodDeclaration Modifier protected
override SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
override SimpleName MarkerAnnotation MethodDeclaration SimpleName execute
override SimpleName MarkerAnnotation MethodDeclaration SingleVariableDeclaration SimpleName store provider
protected Modifier MethodDeclaration PrimitiveType void
protected Modifier MethodDeclaration SimpleName execute
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName mutable store provider
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleName store provider
void PrimitiveType MethodDeclaration SimpleName execute
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName mutable store provider
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName store provider
execute SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName mutable store provider
execute SimpleName MethodDeclaration SingleVariableDeclaration SimpleName store provider
storage SimpleName MethodInvocation SimpleName write
storage SimpleName MethodInvocation ClassInstanceCreation SimpleType QualifiedName mutate workno resultquiet
write SimpleName MethodInvocation ClassInstanceCreation SimpleType QualifiedName mutate workno resultquiet
build scheduler SimpleName MethodInvocation SimpleName storage
get tasks by status SimpleName MethodInvocation SimpleName running
get tasks by status SimpleName MethodInvocation MethodInvocation SimpleName size
running SimpleName MethodInvocation MethodInvocation SimpleName size
assert equals SimpleName MethodInvocation NumberLiteral empty
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get tasks by status
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName running
assert equals SimpleName MethodInvocation MethodInvocation SimpleName size
empty NumberLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName get tasks by status
empty NumberLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName running
empty NumberLiteral MethodInvocation MethodInvocation SimpleName size
get tasks by status SimpleName MethodInvocation SimpleName killed
get tasks by status SimpleName MethodInvocation MethodInvocation SimpleName size
killed SimpleName MethodInvocation MethodInvocation SimpleName size
assert equals SimpleName MethodInvocation NumberLiteral empty
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get tasks by status
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName killed
assert equals SimpleName MethodInvocation MethodInvocation SimpleName size
empty NumberLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName get tasks by status
empty NumberLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName killed
empty NumberLiteral MethodInvocation MethodInvocation SimpleName size
final Modifier VariableDeclarationStatement Block VariableDeclarationStatement Modifier final
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test shard uniqueness correction
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test shard uniqueness correction
public Modifier MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration Block VariableDeclarationStatement Modifier final
public Modifier MethodDeclaration Block VariableDeclarationStatement Modifier final
void PrimitiveType MethodDeclaration SimpleName test shard uniqueness correction
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement Modifier final
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement Modifier final
test shard uniqueness correction SimpleName MethodDeclaration SimpleType SimpleName exception
test shard uniqueness correction SimpleName MethodDeclaration Block VariableDeclarationStatement Modifier final
test shard uniqueness correction SimpleName MethodDeclaration Block VariableDeclarationStatement Modifier final
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test shard uniqueness correction
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test shard uniqueness correction
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
