configuration SimpleName SimpleType SingleVariableDeclaration SimpleName conf
file system SimpleName SimpleType SingleVariableDeclaration SimpleName fs
string SimpleName SimpleType SingleVariableDeclaration SimpleName dir name
fixed SimpleName VariableDeclarationFragment BooleanLiteral true
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName fixed
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment BooleanLiteral true
attempting to fix mapfile StringLiteral InfixExpression SimpleName dir name
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation InfixExpression StringLiteral attempting to fix mapfile
log SimpleName MethodInvocation InfixExpression SimpleName dir name
info SimpleName MethodInvocation InfixExpression StringLiteral attempting to fix mapfile
info SimpleName MethodInvocation InfixExpression SimpleName dir name
dir name SimpleName InfixExpression StringLiteral /
dir name SimpleName InfixExpression QualifiedName my map fileindex file name
/ StringLiteral InfixExpression QualifiedName my map fileindex file name
path SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName dir name
path SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral /
path SimpleName SimpleType ClassInstanceCreation InfixExpression QualifiedName my map fileindex file name
index file SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName path
index file SimpleName VariableDeclarationFragment ClassInstanceCreation InfixExpression SimpleName dir name
index file SimpleName VariableDeclarationFragment ClassInstanceCreation InfixExpression StringLiteral /
index file SimpleName VariableDeclarationFragment ClassInstanceCreation InfixExpression QualifiedName my map fileindex file name
path SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName index file
fs SimpleName MethodInvocation SimpleName exists
fs SimpleName MethodInvocation SimpleName index file
exists SimpleName MethodInvocation SimpleName index file
fs SimpleName MethodInvocation SimpleName get file status
fs SimpleName MethodInvocation SimpleName index file
get file status SimpleName MethodInvocation SimpleName index file
fs SimpleName MethodInvocation MethodInvocation SimpleName get len
get file status SimpleName MethodInvocation MethodInvocation SimpleName get len
index file SimpleName MethodInvocation MethodInvocation SimpleName get len
fs SimpleName MethodInvocation MethodInvocation InfixExpression NumberLiteral empty
get file status SimpleName MethodInvocation MethodInvocation InfixExpression NumberLiteral empty
index file SimpleName MethodInvocation MethodInvocation InfixExpression NumberLiteral empty
get len SimpleName MethodInvocation InfixExpression NumberLiteral empty
fs SimpleName MethodInvocation InfixExpression InfixExpression NumberLiteral empty
exists SimpleName MethodInvocation InfixExpression InfixExpression NumberLiteral empty
index file SimpleName MethodInvocation InfixExpression InfixExpression NumberLiteral empty
deleting length index file StringLiteral InfixExpression SimpleName index file
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation InfixExpression StringLiteral deleting length index file
log SimpleName MethodInvocation InfixExpression SimpleName index file
info SimpleName MethodInvocation InfixExpression StringLiteral deleting length index file
info SimpleName MethodInvocation InfixExpression SimpleName index file
fs SimpleName MethodInvocation SimpleName delete
fs SimpleName MethodInvocation SimpleName index file
fs SimpleName MethodInvocation BooleanLiteral false
delete SimpleName MethodInvocation SimpleName index file
delete SimpleName MethodInvocation BooleanLiteral false
index file SimpleName MethodInvocation BooleanLiteral false
path SimpleName SimpleType ClassInstanceCreation SimpleName dir name
my map file SimpleName MethodInvocation SimpleName fix
my map file SimpleName MethodInvocation SimpleName fs
my map file SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName path
my map file SimpleName MethodInvocation ClassInstanceCreation SimpleName dir name
my map file SimpleName MethodInvocation TypeLiteral SimpleType SimpleName key
my map file SimpleName MethodInvocation TypeLiteral SimpleType SimpleName value
fix SimpleName MethodInvocation SimpleName fs
fix SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName path
fix SimpleName MethodInvocation ClassInstanceCreation SimpleName dir name
fix SimpleName MethodInvocation TypeLiteral SimpleType SimpleName key
fix SimpleName MethodInvocation TypeLiteral SimpleType SimpleName value
fix SimpleName MethodInvocation BooleanLiteral false
fs SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName path
fs SimpleName MethodInvocation ClassInstanceCreation SimpleName dir name
fs SimpleName MethodInvocation TypeLiteral SimpleType SimpleName key
fs SimpleName MethodInvocation TypeLiteral SimpleType SimpleName value
fs SimpleName MethodInvocation BooleanLiteral false
fs SimpleName MethodInvocation SimpleName conf
path SimpleName SimpleType ClassInstanceCreation MethodInvocation BooleanLiteral false
dir name SimpleName ClassInstanceCreation MethodInvocation BooleanLiteral false
path SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName conf
dir name SimpleName ClassInstanceCreation MethodInvocation SimpleName conf
key SimpleName SimpleType TypeLiteral MethodInvocation BooleanLiteral false
key SimpleName SimpleType TypeLiteral MethodInvocation SimpleName conf
value SimpleName SimpleType TypeLiteral MethodInvocation BooleanLiteral false
value SimpleName SimpleType TypeLiteral MethodInvocation SimpleName conf
false BooleanLiteral MethodInvocation SimpleName conf
exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
failed to fix mapfile StringLiteral InfixExpression SimpleName dir name
log SimpleName MethodInvocation SimpleName error
log SimpleName MethodInvocation InfixExpression StringLiteral failed to fix mapfile
log SimpleName MethodInvocation InfixExpression SimpleName dir name
log SimpleName MethodInvocation SimpleName e
error SimpleName MethodInvocation InfixExpression StringLiteral failed to fix mapfile
error SimpleName MethodInvocation InfixExpression SimpleName dir name
error SimpleName MethodInvocation SimpleName e
failed to fix mapfile StringLiteral InfixExpression MethodInvocation SimpleName e
dir name SimpleName InfixExpression MethodInvocation SimpleName e
fixed SimpleName Assignment BooleanLiteral false
boolean PrimitiveType VariableDeclarationStatement Block ReturnStatement SimpleName fixed
public Modifier MethodDeclaration Modifier static
public Modifier MethodDeclaration PrimitiveType boolean
public Modifier MethodDeclaration SimpleName attempt to fix map file
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName configuration
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName conf
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName file system
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName fs
static Modifier MethodDeclaration PrimitiveType boolean
static Modifier MethodDeclaration SimpleName attempt to fix map file
static Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName configuration
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName conf
static Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName file system
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName fs
static Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName dir name
boolean PrimitiveType MethodDeclaration SimpleName attempt to fix map file
boolean PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName configuration
boolean PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName conf
boolean PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName file system
boolean PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName fs
boolean PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
boolean PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName dir name
boolean PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType boolean
boolean PrimitiveType MethodDeclaration Block ReturnStatement SimpleName fixed
attempt to fix map file SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName configuration
attempt to fix map file SimpleName MethodDeclaration SingleVariableDeclaration SimpleName conf
attempt to fix map file SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName file system
attempt to fix map file SimpleName MethodDeclaration SingleVariableDeclaration SimpleName fs
attempt to fix map file SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
attempt to fix map file SimpleName MethodDeclaration SingleVariableDeclaration SimpleName dir name
attempt to fix map file SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType boolean
attempt to fix map file SimpleName MethodDeclaration Block ReturnStatement SimpleName fixed
conf SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName fs
conf SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName dir name
fs SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName dir name
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration Modifier static
public Modifier TypeDeclaration MethodDeclaration PrimitiveType boolean
public Modifier TypeDeclaration MethodDeclaration SimpleName attempt to fix map file
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName conf
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName fs
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName dir name
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration Modifier static
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType boolean
test SimpleName TypeDeclaration MethodDeclaration SimpleName attempt to fix map file
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName conf
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName fs
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName dir name