string SimpleName SimpleType SingleVariableDeclaration SimpleName message
list SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName expected
list SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName actual
generic utils SimpleName MethodInvocation SimpleName size
generic utils SimpleName MethodInvocation SimpleName expected
size SimpleName MethodInvocation SimpleName expected
exp size SimpleName VariableDeclarationFragment MethodInvocation SimpleName generic utils
exp size SimpleName VariableDeclarationFragment MethodInvocation SimpleName size
exp size SimpleName VariableDeclarationFragment MethodInvocation SimpleName expected
generic utils SimpleName MethodInvocation SimpleName size
generic utils SimpleName MethodInvocation SimpleName actual
size SimpleName MethodInvocation SimpleName actual
act size SimpleName VariableDeclarationFragment MethodInvocation SimpleName generic utils
act size SimpleName VariableDeclarationFragment MethodInvocation SimpleName size
act size SimpleName VariableDeclarationFragment MethodInvocation SimpleName actual
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName exp size
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName generic utils
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName size
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName expected
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName act size
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName generic utils
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName size
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName actual
exp size SimpleName VariableDeclarationFragment VariableDeclarationStatement VariableDeclarationFragment SimpleName act size
message SimpleName InfixExpression StringLiteral size
assert SimpleName MethodInvocation SimpleName assert equals
assert SimpleName MethodInvocation InfixExpression SimpleName message
assert SimpleName MethodInvocation InfixExpression StringLiteral size
assert SimpleName MethodInvocation SimpleName exp size
assert SimpleName MethodInvocation SimpleName act size
assert equals SimpleName MethodInvocation InfixExpression SimpleName message
assert equals SimpleName MethodInvocation InfixExpression StringLiteral size
assert equals SimpleName MethodInvocation SimpleName exp size
assert equals SimpleName MethodInvocation SimpleName act size
message SimpleName InfixExpression MethodInvocation SimpleName exp size
size StringLiteral InfixExpression MethodInvocation SimpleName exp size
message SimpleName InfixExpression MethodInvocation SimpleName act size
size StringLiteral InfixExpression MethodInvocation SimpleName act size
exp size SimpleName MethodInvocation SimpleName act size
index SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName index
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
index SimpleName InfixExpression SimpleName exp size
expected SimpleName MethodInvocation SimpleName get
expected SimpleName MethodInvocation SimpleName index
get SimpleName MethodInvocation SimpleName index
exp value SimpleName VariableDeclarationFragment MethodInvocation SimpleName expected
exp value SimpleName VariableDeclarationFragment MethodInvocation SimpleName get
exp value SimpleName VariableDeclarationFragment MethodInvocation SimpleName index
actual SimpleName MethodInvocation SimpleName get
actual SimpleName MethodInvocation SimpleName index
get SimpleName MethodInvocation SimpleName index
act value SimpleName VariableDeclarationFragment MethodInvocation SimpleName actual
act value SimpleName VariableDeclarationFragment MethodInvocation SimpleName get
act value SimpleName VariableDeclarationFragment MethodInvocation SimpleName index
e SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName exp value
e SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName act value
exp value SimpleName VariableDeclarationFragment VariableDeclarationStatement VariableDeclarationFragment SimpleName act value
message SimpleName InfixExpression StringLiteral [
message SimpleName InfixExpression SimpleName index
message SimpleName InfixExpression StringLiteral ]
[ StringLiteral InfixExpression SimpleName index
[ StringLiteral InfixExpression StringLiteral ]
index SimpleName InfixExpression StringLiteral ]
assert SimpleName MethodInvocation SimpleName assert equals
assert SimpleName MethodInvocation InfixExpression SimpleName message
assert SimpleName MethodInvocation InfixExpression StringLiteral [
assert SimpleName MethodInvocation InfixExpression SimpleName index
assert SimpleName MethodInvocation InfixExpression StringLiteral ]
assert SimpleName MethodInvocation SimpleName exp value
assert SimpleName MethodInvocation SimpleName act value
assert equals SimpleName MethodInvocation InfixExpression SimpleName message
assert equals SimpleName MethodInvocation InfixExpression StringLiteral [
assert equals SimpleName MethodInvocation InfixExpression SimpleName index
assert equals SimpleName MethodInvocation InfixExpression StringLiteral ]
assert equals SimpleName MethodInvocation SimpleName exp value
assert equals SimpleName MethodInvocation SimpleName act value
message SimpleName InfixExpression MethodInvocation SimpleName exp value
[ StringLiteral InfixExpression MethodInvocation SimpleName exp value
index SimpleName InfixExpression MethodInvocation SimpleName exp value
] StringLiteral InfixExpression MethodInvocation SimpleName exp value
message SimpleName InfixExpression MethodInvocation SimpleName act value
[ StringLiteral InfixExpression MethodInvocation SimpleName act value
index SimpleName InfixExpression MethodInvocation SimpleName act value
] StringLiteral InfixExpression MethodInvocation SimpleName act value
exp value SimpleName MethodInvocation SimpleName act value
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName index
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName exp size
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName index
index SimpleName InfixExpression ForStatement PostfixExpression SimpleName index
exp size SimpleName InfixExpression ForStatement PostfixExpression SimpleName index
public Modifier MethodDeclaration Modifier static
public Modifier MethodDeclaration TypeParameter SimpleName e
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName assert list equals
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName message
static Modifier MethodDeclaration TypeParameter SimpleName e
static Modifier MethodDeclaration PrimitiveType void
static Modifier MethodDeclaration SimpleName assert list equals
static Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName message
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName expected
e SimpleName TypeParameter MethodDeclaration PrimitiveType void
e SimpleName TypeParameter MethodDeclaration SimpleName assert list equals
e SimpleName TypeParameter MethodDeclaration SingleVariableDeclaration SimpleName message
e SimpleName TypeParameter MethodDeclaration SingleVariableDeclaration SimpleName expected
e SimpleName TypeParameter MethodDeclaration SingleVariableDeclaration SimpleName actual
void PrimitiveType MethodDeclaration SimpleName assert list equals
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName message
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName expected
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName actual
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
assert list equals SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
assert list equals SimpleName MethodDeclaration SingleVariableDeclaration SimpleName message
assert list equals SimpleName MethodDeclaration SingleVariableDeclaration SimpleName expected
assert list equals SimpleName MethodDeclaration SingleVariableDeclaration SimpleName actual
assert list equals SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
message SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName expected
message SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName actual
expected SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName actual
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration Modifier static
public Modifier TypeDeclaration MethodDeclaration TypeParameter SimpleName e
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName assert list equals
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName message
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName expected
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName actual
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration Modifier static
test SimpleName TypeDeclaration MethodDeclaration TypeParameter SimpleName e
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName assert list equals
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName message
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName expected
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName actual
