text SimpleName SimpleType SingleVariableDeclaration SimpleName val
val SimpleName MethodInvocation SimpleName to string
s SimpleName VariableDeclarationFragment MethodInvocation SimpleName val
s SimpleName VariableDeclarationFragment MethodInvocation SimpleName to string
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName s
s SimpleName MethodInvocation SimpleName length
s SimpleName MethodInvocation InfixExpression NumberLiteral empty
length SimpleName MethodInvocation InfixExpression NumberLiteral empty
s SimpleName MethodInvocation SimpleName substring
s SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName s
s SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName length
s SimpleName MethodInvocation InfixExpression NumberLiteral empty
substring SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName s
substring SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName length
substring SimpleName MethodInvocation InfixExpression NumberLiteral empty
integer SimpleName MethodInvocation SimpleName parse int
integer SimpleName MethodInvocation MethodInvocation SimpleName s
integer SimpleName MethodInvocation MethodInvocation SimpleName substring
integer SimpleName MethodInvocation MethodInvocation InfixExpression NumberLiteral empty
parse int SimpleName MethodInvocation MethodInvocation SimpleName s
parse int SimpleName MethodInvocation MethodInvocation SimpleName substring
parse int SimpleName MethodInvocation MethodInvocation InfixExpression NumberLiteral empty
empty NumberLiteral InfixExpression MethodInvocation SimpleName integer
empty NumberLiteral InfixExpression MethodInvocation SimpleName parse int
empty NumberLiteral InfixExpression MethodInvocation MethodInvocation SimpleName s
empty NumberLiteral InfixExpression MethodInvocation MethodInvocation SimpleName substring
i SimpleName VariableDeclarationFragment InfixExpression NumberLiteral empty
i SimpleName VariableDeclarationFragment InfixExpression MethodInvocation SimpleName integer
i SimpleName VariableDeclarationFragment InfixExpression MethodInvocation SimpleName parse int
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment InfixExpression NumberLiteral empty
sb SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName string builder
string builder SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName sb
s SimpleName MethodInvocation SimpleName length
s SimpleName MethodInvocation InfixExpression NumberLiteral empty
length SimpleName MethodInvocation InfixExpression NumberLiteral empty
s SimpleName MethodInvocation SimpleName substring
s SimpleName MethodInvocation NumberLiteral empty
s SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName s
s SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName length
s SimpleName MethodInvocation InfixExpression NumberLiteral empty
substring SimpleName MethodInvocation NumberLiteral empty
substring SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName s
substring SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName length
substring SimpleName MethodInvocation InfixExpression NumberLiteral empty
empty NumberLiteral MethodInvocation InfixExpression MethodInvocation SimpleName s
empty NumberLiteral MethodInvocation InfixExpression MethodInvocation SimpleName length
empty NumberLiteral MethodInvocation InfixExpression NumberLiteral empty
sb SimpleName MethodInvocation SimpleName append
sb SimpleName MethodInvocation MethodInvocation SimpleName s
sb SimpleName MethodInvocation MethodInvocation SimpleName substring
sb SimpleName MethodInvocation MethodInvocation NumberLiteral empty
sb SimpleName MethodInvocation MethodInvocation InfixExpression NumberLiteral empty
append SimpleName MethodInvocation MethodInvocation SimpleName s
append SimpleName MethodInvocation MethodInvocation SimpleName substring
append SimpleName MethodInvocation MethodInvocation NumberLiteral empty
append SimpleName MethodInvocation MethodInvocation InfixExpression NumberLiteral empty
sb SimpleName MethodInvocation SimpleName append
sb SimpleName MethodInvocation SimpleName i
append SimpleName MethodInvocation SimpleName i
sb SimpleName MethodInvocation SimpleName to string
text SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName sb
text SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName to string
private Modifier MethodDeclaration Modifier static
private Modifier MethodDeclaration SimpleType SimpleName text
private Modifier MethodDeclaration SimpleName transform
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName text
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName val
private Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
static Modifier MethodDeclaration SimpleType SimpleName text
static Modifier MethodDeclaration SimpleName transform
static Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName text
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName val
static Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
text SimpleName SimpleType MethodDeclaration SimpleName transform
text SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName val
transform SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName text
transform SimpleName MethodDeclaration SingleVariableDeclaration SimpleName val
transform SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration Modifier static
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName text
public Modifier TypeDeclaration MethodDeclaration SimpleName transform
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName val
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration Modifier static
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName text
test SimpleName TypeDeclaration MethodDeclaration SimpleName transform
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName val
