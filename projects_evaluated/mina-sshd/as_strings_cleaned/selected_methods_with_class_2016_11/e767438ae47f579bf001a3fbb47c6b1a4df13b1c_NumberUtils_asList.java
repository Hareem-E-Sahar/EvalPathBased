list SimpleName SimpleType ParameterizedType SimpleType SimpleName integer
int PrimitiveType SingleVariableDeclaration SimpleName values
length SimpleName MethodInvocation SimpleName values
len SimpleName VariableDeclarationFragment MethodInvocation SimpleName length
len SimpleName VariableDeclarationFragment MethodInvocation SimpleName values
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName len
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName length
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName values
len SimpleName InfixExpression NumberLiteral empty
collections SimpleName MethodInvocation SimpleName empty list
list SimpleName SimpleType ParameterizedType SimpleType SimpleName integer
array list SimpleName SimpleType ParameterizedType ClassInstanceCreation SimpleName len
l SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName len
int PrimitiveType SingleVariableDeclaration SimpleName v
l SimpleName MethodInvocation SimpleName add
l SimpleName MethodInvocation SimpleName v
add SimpleName MethodInvocation SimpleName v
int PrimitiveType SingleVariableDeclaration EnhancedForStatement SimpleName values
v SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName values
int PrimitiveType VariableDeclarationStatement Block EnhancedForStatement SimpleName values
int PrimitiveType VariableDeclarationStatement Block ReturnStatement SimpleName l
values SimpleName EnhancedForStatement Block ReturnStatement SimpleName l
public Modifier MethodDeclaration Modifier static
public Modifier MethodDeclaration ParameterizedType SimpleType SimpleName list
public Modifier MethodDeclaration ParameterizedType SimpleType SimpleName integer
public Modifier MethodDeclaration SimpleName as list
public Modifier MethodDeclaration SingleVariableDeclaration PrimitiveType int
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName values
public Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
public Modifier MethodDeclaration Block EnhancedForStatement SimpleName values
public Modifier MethodDeclaration Block ReturnStatement SimpleName l
static Modifier MethodDeclaration ParameterizedType SimpleType SimpleName list
static Modifier MethodDeclaration ParameterizedType SimpleType SimpleName integer
static Modifier MethodDeclaration SimpleName as list
static Modifier MethodDeclaration SingleVariableDeclaration PrimitiveType int
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName values
static Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
static Modifier MethodDeclaration Block EnhancedForStatement SimpleName values
static Modifier MethodDeclaration Block ReturnStatement SimpleName l
list SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName as list
integer SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName as list
as list SimpleName MethodDeclaration SingleVariableDeclaration PrimitiveType int
as list SimpleName MethodDeclaration SingleVariableDeclaration SimpleName values
as list SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
as list SimpleName MethodDeclaration Block EnhancedForStatement SimpleName values
as list SimpleName MethodDeclaration Block ReturnStatement SimpleName l
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration Modifier static
public Modifier TypeDeclaration MethodDeclaration SimpleName as list
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName values
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration Modifier static
test SimpleName TypeDeclaration MethodDeclaration SimpleName as list
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName values