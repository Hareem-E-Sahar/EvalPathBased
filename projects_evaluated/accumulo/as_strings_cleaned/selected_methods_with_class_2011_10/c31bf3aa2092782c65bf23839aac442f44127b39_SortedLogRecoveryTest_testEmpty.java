create key value SimpleName MethodInvocation SimpleName open
create key value SimpleName MethodInvocation NumberLiteral empty
create key value SimpleName MethodInvocation PrefixExpression NumberLiteral empty
create key value SimpleName MethodInvocation StringLiteral empty
open SimpleName MethodInvocation NumberLiteral empty
open SimpleName MethodInvocation PrefixExpression NumberLiteral empty
open SimpleName MethodInvocation StringLiteral empty
empty NumberLiteral MethodInvocation PrefixExpression NumberLiteral empty
empty NumberLiteral MethodInvocation StringLiteral empty
empty NumberLiteral PrefixExpression MethodInvocation StringLiteral empty
create key value SimpleName MethodInvocation SimpleName define tablet
create key value SimpleName MethodInvocation NumberLiteral empty
create key value SimpleName MethodInvocation NumberLiteral empty
create key value SimpleName MethodInvocation SimpleName extent
define tablet SimpleName MethodInvocation NumberLiteral empty
define tablet SimpleName MethodInvocation NumberLiteral empty
define tablet SimpleName MethodInvocation SimpleName extent
empty NumberLiteral MethodInvocation NumberLiteral empty
empty NumberLiteral MethodInvocation SimpleName extent
empty NumberLiteral MethodInvocation SimpleName extent
create key value SimpleName MethodInvocation ArrayInitializer MethodInvocation SimpleName create key value
create key value SimpleName MethodInvocation ArrayInitializer MethodInvocation SimpleName define tablet
create key value SimpleName MethodInvocation ArrayInitializer MethodInvocation NumberLiteral empty
create key value SimpleName MethodInvocation ArrayInitializer MethodInvocation NumberLiteral empty
create key value SimpleName MethodInvocation ArrayInitializer MethodInvocation SimpleName extent
open SimpleName MethodInvocation ArrayInitializer MethodInvocation SimpleName create key value
open SimpleName MethodInvocation ArrayInitializer MethodInvocation SimpleName define tablet
open SimpleName MethodInvocation ArrayInitializer MethodInvocation NumberLiteral empty
open SimpleName MethodInvocation ArrayInitializer MethodInvocation NumberLiteral empty
open SimpleName MethodInvocation ArrayInitializer MethodInvocation SimpleName extent
empty NumberLiteral MethodInvocation ArrayInitializer MethodInvocation SimpleName create key value
empty NumberLiteral MethodInvocation ArrayInitializer MethodInvocation SimpleName define tablet
empty NumberLiteral MethodInvocation ArrayInitializer MethodInvocation NumberLiteral empty
empty NumberLiteral MethodInvocation ArrayInitializer MethodInvocation NumberLiteral empty
empty NumberLiteral MethodInvocation ArrayInitializer MethodInvocation SimpleName extent
empty StringLiteral MethodInvocation ArrayInitializer MethodInvocation SimpleName create key value
empty StringLiteral MethodInvocation ArrayInitializer MethodInvocation SimpleName define tablet
empty StringLiteral MethodInvocation ArrayInitializer MethodInvocation NumberLiteral empty
empty StringLiteral MethodInvocation ArrayInitializer MethodInvocation NumberLiteral empty
empty StringLiteral MethodInvocation ArrayInitializer MethodInvocation SimpleName extent
map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
tree map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
logs SimpleName MethodInvocation SimpleName put
logs SimpleName MethodInvocation StringLiteral testlog
logs SimpleName MethodInvocation SimpleName entries
put SimpleName MethodInvocation StringLiteral testlog
put SimpleName MethodInvocation SimpleName entries
testlog StringLiteral MethodInvocation SimpleName entries
list SimpleName SimpleType ParameterizedType SimpleType SimpleName mutation
recover SimpleName MethodInvocation SimpleName logs
recover SimpleName MethodInvocation SimpleName extent
logs SimpleName MethodInvocation SimpleName extent
mutations SimpleName VariableDeclarationFragment MethodInvocation SimpleName recover
mutations SimpleName VariableDeclarationFragment MethodInvocation SimpleName logs
mutations SimpleName VariableDeclarationFragment MethodInvocation SimpleName extent
mutations SimpleName MethodInvocation SimpleName size
assert SimpleName MethodInvocation SimpleName assert equals
assert SimpleName MethodInvocation NumberLiteral empty
assert SimpleName MethodInvocation MethodInvocation SimpleName mutations
assert SimpleName MethodInvocation MethodInvocation SimpleName size
assert equals SimpleName MethodInvocation NumberLiteral empty
assert equals SimpleName MethodInvocation MethodInvocation SimpleName mutations
assert equals SimpleName MethodInvocation MethodInvocation SimpleName size
empty NumberLiteral MethodInvocation MethodInvocation SimpleName mutations
empty NumberLiteral MethodInvocation MethodInvocation SimpleName size
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test empty
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName io exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test empty
public Modifier MethodDeclaration SimpleType SimpleName io exception
void PrimitiveType MethodDeclaration SimpleName test empty
void PrimitiveType MethodDeclaration SimpleType SimpleName io exception
test empty SimpleName MethodDeclaration SimpleType SimpleName io exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test empty
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test empty
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName io exception