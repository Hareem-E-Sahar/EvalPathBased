list SimpleName SimpleType ParameterizedType SimpleType SimpleName string
list SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName expected
string SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName expected
scanner SimpleName SimpleType SingleVariableDeclaration SimpleName create scanner
list SimpleName SimpleType ParameterizedType SimpleType SimpleName string
array list SimpleName SimpleType ParameterizedType SimpleType SimpleName string
entry SimpleName SimpleType ParameterizedType SimpleType SimpleName key
entry SimpleName SimpleType ParameterizedType SimpleType SimpleName value
key SimpleName SimpleType ParameterizedType SimpleType SimpleName value
entry SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName entry
key SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName entry
value SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName entry
entry SimpleName MethodInvocation SimpleName get key
k SimpleName VariableDeclarationFragment MethodInvocation SimpleName entry
k SimpleName VariableDeclarationFragment MethodInvocation SimpleName get key
key SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName k
k SimpleName MethodInvocation SimpleName get row
k SimpleName MethodInvocation SimpleName get column family
k SimpleName MethodInvocation SimpleName get column qualifier
entry SimpleName MethodInvocation SimpleName get value
k SimpleName MethodInvocation InfixExpression StringLiteral :
get row SimpleName MethodInvocation InfixExpression StringLiteral :
k SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName k
k SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get column family
get row SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName k
get row SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get column family
k SimpleName MethodInvocation InfixExpression StringLiteral :
get row SimpleName MethodInvocation InfixExpression StringLiteral :
k SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName k
k SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get column qualifier
get row SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName k
get row SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get column qualifier
k SimpleName MethodInvocation InfixExpression StringLiteral :
get row SimpleName MethodInvocation InfixExpression StringLiteral :
: StringLiteral InfixExpression MethodInvocation SimpleName k
: StringLiteral InfixExpression MethodInvocation SimpleName get column family
: StringLiteral InfixExpression StringLiteral :
: StringLiteral InfixExpression MethodInvocation SimpleName k
: StringLiteral InfixExpression MethodInvocation SimpleName get column qualifier
: StringLiteral InfixExpression StringLiteral :
: StringLiteral InfixExpression MethodInvocation SimpleName entry
: StringLiteral InfixExpression MethodInvocation SimpleName get value
k SimpleName MethodInvocation InfixExpression StringLiteral :
get column family SimpleName MethodInvocation InfixExpression StringLiteral :
k SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName k
k SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get column qualifier
get column family SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName k
get column family SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get column qualifier
k SimpleName MethodInvocation InfixExpression StringLiteral :
get column family SimpleName MethodInvocation InfixExpression StringLiteral :
k SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName entry
k SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get value
get column family SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName entry
get column family SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get value
: StringLiteral InfixExpression MethodInvocation SimpleName k
: StringLiteral InfixExpression MethodInvocation SimpleName get column qualifier
: StringLiteral InfixExpression StringLiteral :
: StringLiteral InfixExpression MethodInvocation SimpleName entry
: StringLiteral InfixExpression MethodInvocation SimpleName get value
k SimpleName MethodInvocation InfixExpression StringLiteral :
get column qualifier SimpleName MethodInvocation InfixExpression StringLiteral :
k SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName entry
k SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get value
get column qualifier SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName entry
get column qualifier SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get value
: StringLiteral InfixExpression MethodInvocation SimpleName entry
: StringLiteral InfixExpression MethodInvocation SimpleName get value
actual SimpleName MethodInvocation SimpleName add
actual SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName k
actual SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get row
actual SimpleName MethodInvocation InfixExpression StringLiteral :
actual SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName k
actual SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get column family
actual SimpleName MethodInvocation InfixExpression StringLiteral :
actual SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName k
actual SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get column qualifier
actual SimpleName MethodInvocation InfixExpression StringLiteral :
actual SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName entry
actual SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get value
add SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName k
add SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get row
add SimpleName MethodInvocation InfixExpression StringLiteral :
add SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName k
add SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get column family
add SimpleName MethodInvocation InfixExpression StringLiteral :
add SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName k
add SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get column qualifier
add SimpleName MethodInvocation InfixExpression StringLiteral :
add SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName entry
add SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get value
entry SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName create scanner
collections SimpleName MethodInvocation SimpleName sort
collections SimpleName MethodInvocation SimpleName expected
sort SimpleName MethodInvocation SimpleName expected
collections SimpleName MethodInvocation SimpleName sort
collections SimpleName MethodInvocation SimpleName actual
sort SimpleName MethodInvocation SimpleName actual
assert SimpleName MethodInvocation SimpleName assert equals
assert SimpleName MethodInvocation SimpleName expected
assert SimpleName MethodInvocation SimpleName actual
assert equals SimpleName MethodInvocation SimpleName expected
assert equals SimpleName MethodInvocation SimpleName actual
expected SimpleName MethodInvocation SimpleName actual
private Modifier MethodDeclaration PrimitiveType void
private Modifier MethodDeclaration SimpleName verify data
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName expected
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName scanner
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName create scanner
private Modifier MethodDeclaration Block EnhancedForStatement SimpleName create scanner
void PrimitiveType MethodDeclaration SimpleName verify data
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName expected
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName scanner
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName create scanner
void PrimitiveType MethodDeclaration Block EnhancedForStatement SimpleName create scanner
verify data SimpleName MethodDeclaration SingleVariableDeclaration SimpleName expected
verify data SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName scanner
verify data SimpleName MethodDeclaration SingleVariableDeclaration SimpleName create scanner
verify data SimpleName MethodDeclaration Block EnhancedForStatement SimpleName create scanner
expected SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName create scanner
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName verify data
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName expected
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName create scanner
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName verify data
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName expected
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName create scanner
