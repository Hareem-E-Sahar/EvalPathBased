list SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName list
t SimpleName SimpleType SingleVariableDeclaration SimpleName key
low SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName low
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment NumberLiteral empty
list SimpleName MethodInvocation SimpleName size
high SimpleName VariableDeclarationFragment MethodInvocation SimpleName list
high SimpleName VariableDeclarationFragment MethodInvocation SimpleName size
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName high
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName list
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName size
low SimpleName InfixExpression SimpleName high
low SimpleName InfixExpression SimpleName high
low SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
high SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
mid SimpleName VariableDeclarationFragment InfixExpression NumberLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName mid
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment InfixExpression NumberLiteral empty
list SimpleName MethodInvocation SimpleName get
list SimpleName MethodInvocation SimpleName mid
get SimpleName MethodInvocation SimpleName mid
mid val SimpleName VariableDeclarationFragment MethodInvocation SimpleName list
mid val SimpleName VariableDeclarationFragment MethodInvocation SimpleName get
mid val SimpleName VariableDeclarationFragment MethodInvocation SimpleName mid
mid val SimpleName MethodInvocation SimpleName compare to
mid val SimpleName MethodInvocation SimpleName key
compare to SimpleName MethodInvocation SimpleName key
ret SimpleName VariableDeclarationFragment MethodInvocation SimpleName mid val
ret SimpleName VariableDeclarationFragment MethodInvocation SimpleName compare to
ret SimpleName VariableDeclarationFragment MethodInvocation SimpleName key
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName ret
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName mid val
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName compare to
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName key
ret SimpleName InfixExpression NumberLiteral empty
mid SimpleName InfixExpression NumberLiteral empty
low SimpleName Assignment InfixExpression SimpleName mid
low SimpleName Assignment InfixExpression NumberLiteral empty
high SimpleName Assignment SimpleName mid
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
int PrimitiveType VariableDeclarationStatement Block ReturnStatement SimpleName low
int PrimitiveType VariableDeclarationStatement Block ReturnStatement SimpleName low
public Modifier MethodDeclaration Modifier static
public Modifier MethodDeclaration TypeParameter SimpleName t
public Modifier MethodDeclaration PrimitiveType int
public Modifier MethodDeclaration SimpleName upper bound
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName list
static Modifier MethodDeclaration TypeParameter SimpleName t
static Modifier MethodDeclaration PrimitiveType int
static Modifier MethodDeclaration SimpleName upper bound
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName list
static Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName t
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName key
t SimpleName TypeParameter MethodDeclaration PrimitiveType int
t SimpleName TypeParameter MethodDeclaration SimpleName upper bound
t SimpleName TypeParameter MethodDeclaration SingleVariableDeclaration SimpleName list
t SimpleName TypeParameter MethodDeclaration SingleVariableDeclaration SimpleName key
int PrimitiveType MethodDeclaration SimpleName upper bound
int PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName list
int PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName t
int PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName key
int PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
int PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
int PrimitiveType MethodDeclaration Block ReturnStatement SimpleName low
upper bound SimpleName MethodDeclaration SingleVariableDeclaration SimpleName list
upper bound SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName t
upper bound SimpleName MethodDeclaration SingleVariableDeclaration SimpleName key
upper bound SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
upper bound SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
upper bound SimpleName MethodDeclaration Block ReturnStatement SimpleName low
list SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName key
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration Modifier static
public Modifier TypeDeclaration MethodDeclaration TypeParameter SimpleName t
public Modifier TypeDeclaration MethodDeclaration PrimitiveType int
public Modifier TypeDeclaration MethodDeclaration SimpleName upper bound
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName list
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName key
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration Modifier static
test SimpleName TypeDeclaration MethodDeclaration TypeParameter SimpleName t
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType int
test SimpleName TypeDeclaration MethodDeclaration SimpleName upper bound
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName list
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName key
