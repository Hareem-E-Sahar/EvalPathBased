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
map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
tree map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
logs SimpleName MethodInvocation SimpleName put
logs SimpleName MethodInvocation StringLiteral testlog
logs SimpleName MethodInvocation SimpleName entries
put SimpleName MethodInvocation StringLiteral testlog
put SimpleName MethodInvocation SimpleName entries
testlog StringLiteral MethodInvocation SimpleName entries
recover SimpleName MethodInvocation SimpleName logs
recover SimpleName MethodInvocation SimpleName extent
logs SimpleName MethodInvocation SimpleName extent
assert SimpleName MethodInvocation SimpleName fail
assert SimpleName MethodInvocation StringLiteral tablet should not have been found
fail SimpleName MethodInvocation StringLiteral tablet should not have been found
throwable SimpleName SimpleType SingleVariableDeclaration SimpleName t
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test missing definition
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test missing definition
void PrimitiveType MethodDeclaration SimpleName test missing definition
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test missing definition
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test missing definition
