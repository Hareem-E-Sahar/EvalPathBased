set SimpleName SimpleType ParameterizedType SimpleType SimpleName posix file permission
string SimpleName SimpleType SingleVariableDeclaration SimpleName str
integer SimpleName MethodInvocation SimpleName parse int
integer SimpleName MethodInvocation SimpleName str
integer SimpleName MethodInvocation NumberLiteral empty
parse int SimpleName MethodInvocation SimpleName str
parse int SimpleName MethodInvocation NumberLiteral empty
str SimpleName MethodInvocation NumberLiteral empty
perms SimpleName VariableDeclarationFragment MethodInvocation SimpleName integer
perms SimpleName VariableDeclarationFragment MethodInvocation SimpleName parse int
perms SimpleName VariableDeclarationFragment MethodInvocation SimpleName str
perms SimpleName VariableDeclarationFragment MethodInvocation NumberLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName perms
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName integer
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName parse int
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName str
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation NumberLiteral empty
set SimpleName SimpleType ParameterizedType SimpleType SimpleName posix file permission
enum set SimpleName MethodInvocation SimpleName none of
enum set SimpleName MethodInvocation TypeLiteral SimpleType SimpleName posix file permission
none of SimpleName MethodInvocation TypeLiteral SimpleType SimpleName posix file permission
p SimpleName VariableDeclarationFragment MethodInvocation SimpleName enum set
p SimpleName VariableDeclarationFragment MethodInvocation SimpleName none of
perms SimpleName InfixExpression SimpleName s irusr
perms SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
s irusr SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
p SimpleName MethodInvocation SimpleName add
p SimpleName MethodInvocation QualifiedName posix file permissionowner read
add SimpleName MethodInvocation QualifiedName posix file permissionowner read
perms SimpleName InfixExpression SimpleName s iwusr
perms SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
s iwusr SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
p SimpleName MethodInvocation SimpleName add
p SimpleName MethodInvocation QualifiedName posix file permissionowner write
add SimpleName MethodInvocation QualifiedName posix file permissionowner write
perms SimpleName InfixExpression SimpleName s ixusr
perms SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
s ixusr SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
p SimpleName MethodInvocation SimpleName add
p SimpleName MethodInvocation QualifiedName posix file permissionowner execute
add SimpleName MethodInvocation QualifiedName posix file permissionowner execute
perms SimpleName InfixExpression SimpleName s irgrp
perms SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
s irgrp SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
p SimpleName MethodInvocation SimpleName add
p SimpleName MethodInvocation QualifiedName posix file permissiongroup read
add SimpleName MethodInvocation QualifiedName posix file permissiongroup read
perms SimpleName InfixExpression SimpleName s iwgrp
perms SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
s iwgrp SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
p SimpleName MethodInvocation SimpleName add
p SimpleName MethodInvocation QualifiedName posix file permissiongroup write
add SimpleName MethodInvocation QualifiedName posix file permissiongroup write
perms SimpleName InfixExpression SimpleName s ixgrp
perms SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
s ixgrp SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
p SimpleName MethodInvocation SimpleName add
p SimpleName MethodInvocation QualifiedName posix file permissiongroup execute
add SimpleName MethodInvocation QualifiedName posix file permissiongroup execute
perms SimpleName InfixExpression SimpleName s iroth
perms SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
s iroth SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
p SimpleName MethodInvocation SimpleName add
p SimpleName MethodInvocation QualifiedName posix file permissionothers read
add SimpleName MethodInvocation QualifiedName posix file permissionothers read
perms SimpleName InfixExpression SimpleName s iwoth
perms SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
s iwoth SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
p SimpleName MethodInvocation SimpleName add
p SimpleName MethodInvocation QualifiedName posix file permissionothers write
add SimpleName MethodInvocation QualifiedName posix file permissionothers write
perms SimpleName InfixExpression SimpleName s ixoth
perms SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
s ixoth SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
p SimpleName MethodInvocation SimpleName add
p SimpleName MethodInvocation QualifiedName posix file permissionothers execute
add SimpleName MethodInvocation QualifiedName posix file permissionothers execute
public Modifier MethodDeclaration Modifier static
public Modifier MethodDeclaration ParameterizedType SimpleType SimpleName set
public Modifier MethodDeclaration ParameterizedType SimpleType SimpleName posix file permission
public Modifier MethodDeclaration SimpleName parse octal permissions
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName str
public Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
public Modifier MethodDeclaration Block ReturnStatement SimpleName p
static Modifier MethodDeclaration ParameterizedType SimpleType SimpleName set
static Modifier MethodDeclaration ParameterizedType SimpleType SimpleName posix file permission
static Modifier MethodDeclaration SimpleName parse octal permissions
static Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName str
static Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
static Modifier MethodDeclaration Block ReturnStatement SimpleName p
set SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName parse octal permissions
posix file permission SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName parse octal permissions
parse octal permissions SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
parse octal permissions SimpleName MethodDeclaration SingleVariableDeclaration SimpleName str
parse octal permissions SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
parse octal permissions SimpleName MethodDeclaration Block ReturnStatement SimpleName p
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration Modifier static
public Modifier TypeDeclaration MethodDeclaration SimpleName parse octal permissions
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName str
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration Modifier static
test SimpleName TypeDeclaration MethodDeclaration SimpleName parse octal permissions
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName str