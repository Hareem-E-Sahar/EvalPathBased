string SimpleName SimpleType SingleVariableDeclaration SimpleName message
map SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName expected
map SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName actual
generic utils SimpleName MethodInvocation SimpleName size
generic utils SimpleName MethodInvocation SimpleName expected
size SimpleName MethodInvocation SimpleName expected
num items SimpleName VariableDeclarationFragment MethodInvocation SimpleName generic utils
num items SimpleName VariableDeclarationFragment MethodInvocation SimpleName size
num items SimpleName VariableDeclarationFragment MethodInvocation SimpleName expected
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName num items
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName generic utils
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName size
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName expected
message SimpleName InfixExpression StringLiteral size
generic utils SimpleName MethodInvocation SimpleName size
generic utils SimpleName MethodInvocation SimpleName actual
size SimpleName MethodInvocation SimpleName actual
assert equals SimpleName MethodInvocation InfixExpression SimpleName message
assert equals SimpleName MethodInvocation InfixExpression StringLiteral size
assert equals SimpleName MethodInvocation SimpleName num items
assert equals SimpleName MethodInvocation MethodInvocation SimpleName generic utils
assert equals SimpleName MethodInvocation MethodInvocation SimpleName size
assert equals SimpleName MethodInvocation MethodInvocation SimpleName actual
message SimpleName InfixExpression MethodInvocation SimpleName num items
size StringLiteral InfixExpression MethodInvocation SimpleName num items
message SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName generic utils
message SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName size
message SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName actual
size StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName generic utils
size StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName size
size StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName actual
num items SimpleName MethodInvocation MethodInvocation SimpleName generic utils
num items SimpleName MethodInvocation MethodInvocation SimpleName size
num items SimpleName MethodInvocation MethodInvocation SimpleName actual
num items SimpleName InfixExpression NumberLiteral empty
actual SimpleName MethodInvocation SimpleName get
actual SimpleName MethodInvocation SimpleName key
get SimpleName MethodInvocation SimpleName key
act value SimpleName VariableDeclarationFragment MethodInvocation SimpleName actual
act value SimpleName VariableDeclarationFragment MethodInvocation SimpleName get
act value SimpleName VariableDeclarationFragment MethodInvocation SimpleName key
v SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName act value
message SimpleName InfixExpression StringLiteral [
message SimpleName InfixExpression SimpleName key
message SimpleName InfixExpression StringLiteral ]
[ StringLiteral InfixExpression SimpleName key
[ StringLiteral InfixExpression StringLiteral ]
key SimpleName InfixExpression StringLiteral ]
assert equals SimpleName MethodInvocation InfixExpression SimpleName message
assert equals SimpleName MethodInvocation InfixExpression StringLiteral [
assert equals SimpleName MethodInvocation InfixExpression SimpleName key
assert equals SimpleName MethodInvocation InfixExpression StringLiteral ]
assert equals SimpleName MethodInvocation SimpleName exp value
assert equals SimpleName MethodInvocation SimpleName act value
message SimpleName InfixExpression MethodInvocation SimpleName exp value
[ StringLiteral InfixExpression MethodInvocation SimpleName exp value
key SimpleName InfixExpression MethodInvocation SimpleName exp value
] StringLiteral InfixExpression MethodInvocation SimpleName exp value
message SimpleName InfixExpression MethodInvocation SimpleName act value
[ StringLiteral InfixExpression MethodInvocation SimpleName act value
key SimpleName InfixExpression MethodInvocation SimpleName act value
] StringLiteral InfixExpression MethodInvocation SimpleName act value
exp value SimpleName MethodInvocation SimpleName act value
key SimpleName VariableDeclarationFragment LambdaExpression VariableDeclarationFragment SimpleName exp value
expected SimpleName MethodInvocation SimpleName for each
expected SimpleName MethodInvocation LambdaExpression VariableDeclarationFragment SimpleName key
expected SimpleName MethodInvocation LambdaExpression VariableDeclarationFragment SimpleName exp value
for each SimpleName MethodInvocation LambdaExpression VariableDeclarationFragment SimpleName key
for each SimpleName MethodInvocation LambdaExpression VariableDeclarationFragment SimpleName exp value
public Modifier MethodDeclaration Modifier static
public Modifier MethodDeclaration TypeParameter SimpleName k
public Modifier MethodDeclaration TypeParameter SimpleName v
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName assert map equals
static Modifier MethodDeclaration TypeParameter SimpleName k
static Modifier MethodDeclaration TypeParameter SimpleName v
static Modifier MethodDeclaration PrimitiveType void
static Modifier MethodDeclaration SimpleName assert map equals
static Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName message
k SimpleName TypeParameter MethodDeclaration TypeParameter SimpleName v
k SimpleName TypeParameter MethodDeclaration PrimitiveType void
k SimpleName TypeParameter MethodDeclaration SimpleName assert map equals
k SimpleName TypeParameter MethodDeclaration SingleVariableDeclaration SimpleName message
k SimpleName TypeParameter MethodDeclaration SingleVariableDeclaration SimpleName expected
v SimpleName TypeParameter MethodDeclaration PrimitiveType void
v SimpleName TypeParameter MethodDeclaration SimpleName assert map equals
v SimpleName TypeParameter MethodDeclaration SingleVariableDeclaration SimpleName message
v SimpleName TypeParameter MethodDeclaration SingleVariableDeclaration SimpleName expected
v SimpleName TypeParameter MethodDeclaration SingleVariableDeclaration SimpleName actual
void PrimitiveType MethodDeclaration SimpleName assert map equals
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName message
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName expected
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName actual
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
assert map equals SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
assert map equals SimpleName MethodDeclaration SingleVariableDeclaration SimpleName message
assert map equals SimpleName MethodDeclaration SingleVariableDeclaration SimpleName expected
assert map equals SimpleName MethodDeclaration SingleVariableDeclaration SimpleName actual
assert map equals SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
message SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName expected
message SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName actual
expected SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName actual
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration Modifier static
public Modifier TypeDeclaration MethodDeclaration TypeParameter SimpleName k
public Modifier TypeDeclaration MethodDeclaration TypeParameter SimpleName v
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName assert map equals
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName message
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName expected
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName actual
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration Modifier static
test SimpleName TypeDeclaration MethodDeclaration TypeParameter SimpleName k
test SimpleName TypeDeclaration MethodDeclaration TypeParameter SimpleName v
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName assert map equals
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName message
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName expected
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName actual
