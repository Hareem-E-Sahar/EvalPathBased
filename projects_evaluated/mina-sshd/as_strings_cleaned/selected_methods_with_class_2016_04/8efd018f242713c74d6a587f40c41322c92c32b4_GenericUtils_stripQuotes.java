char sequence SimpleName SimpleType SingleVariableDeclaration SimpleName s
is empty SimpleName MethodInvocation SimpleName s
index SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName index
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
quotes SimpleName MethodInvocation SimpleName length
index SimpleName InfixExpression MethodInvocation SimpleName quotes
index SimpleName InfixExpression MethodInvocation SimpleName length
quotes SimpleName MethodInvocation SimpleName char at
quotes SimpleName MethodInvocation SimpleName index
char at SimpleName MethodInvocation SimpleName index
delim SimpleName VariableDeclarationFragment MethodInvocation SimpleName quotes
delim SimpleName VariableDeclarationFragment MethodInvocation SimpleName char at
delim SimpleName VariableDeclarationFragment MethodInvocation SimpleName index
char PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName delim
char PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName quotes
char PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName char at
char PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName index
strip delimiters SimpleName MethodInvocation SimpleName s
strip delimiters SimpleName MethodInvocation SimpleName delim
s SimpleName MethodInvocation SimpleName delim
v SimpleName VariableDeclarationFragment MethodInvocation SimpleName strip delimiters
v SimpleName VariableDeclarationFragment MethodInvocation SimpleName s
v SimpleName VariableDeclarationFragment MethodInvocation SimpleName delim
char sequence SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName v
v SimpleName InfixExpression SimpleName s
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName index
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName index
index SimpleName InfixExpression ForStatement PostfixExpression SimpleName index
public Modifier MethodDeclaration Modifier static
public Modifier MethodDeclaration SimpleType SimpleName char sequence
public Modifier MethodDeclaration SimpleName strip quotes
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName char sequence
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName s
public Modifier MethodDeclaration Block ReturnStatement SimpleName s
static Modifier MethodDeclaration SimpleType SimpleName char sequence
static Modifier MethodDeclaration SimpleName strip quotes
static Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName char sequence
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName s
static Modifier MethodDeclaration Block ReturnStatement SimpleName s
char sequence SimpleName SimpleType MethodDeclaration SimpleName strip quotes
char sequence SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName s
strip quotes SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName char sequence
strip quotes SimpleName MethodDeclaration SingleVariableDeclaration SimpleName s
strip quotes SimpleName MethodDeclaration Block ReturnStatement SimpleName s
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration Modifier static
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName char sequence
public Modifier TypeDeclaration MethodDeclaration SimpleName strip quotes
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName s
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration Modifier static
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName char sequence
test SimpleName TypeDeclaration MethodDeclaration SimpleName strip quotes
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName s
