string SimpleName SimpleType ArrayType SingleVariableDeclaration SimpleName args
inet address SimpleName MethodInvocation SimpleName get local host
result SimpleName VariableDeclarationFragment MethodInvocation SimpleName inet address
result SimpleName VariableDeclarationFragment MethodInvocation SimpleName get local host
inet address SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName result
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
argslength QualifiedName InfixExpression NumberLiteral empty
i SimpleName InfixExpression InfixExpression QualifiedName argslength
i SimpleName InfixExpression InfixExpression NumberLiteral empty
args SimpleName ArrayAccess SimpleName i
args SimpleName ArrayAccess MethodInvocation SimpleName equals
i SimpleName ArrayAccess MethodInvocation SimpleName equals
args SimpleName ArrayAccess MethodInvocation StringLiteral a
i SimpleName ArrayAccess MethodInvocation StringLiteral a
equals SimpleName MethodInvocation StringLiteral a
args SimpleName ArrayAccess SimpleName i
args SimpleName ArrayAccess MethodInvocation SimpleName equals
i SimpleName ArrayAccess MethodInvocation SimpleName equals
args SimpleName ArrayAccess MethodInvocation StringLiteral address
i SimpleName ArrayAccess MethodInvocation StringLiteral address
equals SimpleName MethodInvocation StringLiteral address
equals SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName equals
equals SimpleName MethodInvocation InfixExpression MethodInvocation StringLiteral address
a StringLiteral MethodInvocation InfixExpression MethodInvocation SimpleName equals
a StringLiteral MethodInvocation InfixExpression MethodInvocation StringLiteral address
i SimpleName InfixExpression NumberLiteral empty
args SimpleName ArrayAccess InfixExpression SimpleName i
args SimpleName ArrayAccess InfixExpression NumberLiteral empty
inet address SimpleName MethodInvocation SimpleName get by name
inet address SimpleName MethodInvocation ArrayAccess SimpleName args
inet address SimpleName MethodInvocation ArrayAccess InfixExpression SimpleName i
inet address SimpleName MethodInvocation ArrayAccess InfixExpression NumberLiteral empty
get by name SimpleName MethodInvocation ArrayAccess SimpleName args
get by name SimpleName MethodInvocation ArrayAccess InfixExpression SimpleName i
get by name SimpleName MethodInvocation ArrayAccess InfixExpression NumberLiteral empty
result SimpleName Assignment MethodInvocation SimpleName inet address
result SimpleName Assignment MethodInvocation SimpleName get by name
result SimpleName Assignment MethodInvocation ArrayAccess SimpleName args
i SimpleName InfixExpression NumberLiteral empty
args SimpleName ArrayAccess InfixExpression SimpleName i
args SimpleName ArrayAccess InfixExpression NumberLiteral empty
result SimpleName MethodInvocation SimpleName to string
local address is StringLiteral InfixExpression ArrayAccess SimpleName args
local address is StringLiteral InfixExpression ArrayAccess InfixExpression SimpleName i
local address is StringLiteral InfixExpression ArrayAccess InfixExpression NumberLiteral empty
local address is StringLiteral InfixExpression StringLiteral (
local address is StringLiteral InfixExpression MethodInvocation SimpleName result
local address is StringLiteral InfixExpression MethodInvocation SimpleName to string
local address is StringLiteral InfixExpression StringLiteral )
args SimpleName ArrayAccess InfixExpression StringLiteral (
i SimpleName InfixExpression ArrayAccess InfixExpression StringLiteral (
empty NumberLiteral InfixExpression ArrayAccess InfixExpression StringLiteral (
args SimpleName ArrayAccess InfixExpression MethodInvocation SimpleName result
args SimpleName ArrayAccess InfixExpression MethodInvocation SimpleName to string
args SimpleName ArrayAccess InfixExpression StringLiteral )
i SimpleName InfixExpression ArrayAccess InfixExpression StringLiteral )
empty NumberLiteral InfixExpression ArrayAccess InfixExpression StringLiteral )
( StringLiteral InfixExpression MethodInvocation SimpleName result
( StringLiteral InfixExpression MethodInvocation SimpleName to string
( StringLiteral InfixExpression StringLiteral )
result SimpleName MethodInvocation InfixExpression StringLiteral )
to string SimpleName MethodInvocation InfixExpression StringLiteral )
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation InfixExpression StringLiteral local address is
log SimpleName MethodInvocation InfixExpression ArrayAccess SimpleName args
log SimpleName MethodInvocation InfixExpression StringLiteral (
log SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName result
log SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName to string
log SimpleName MethodInvocation InfixExpression StringLiteral )
debug SimpleName MethodInvocation InfixExpression StringLiteral local address is
debug SimpleName MethodInvocation InfixExpression ArrayAccess SimpleName args
debug SimpleName MethodInvocation InfixExpression StringLiteral (
debug SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName result
debug SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName to string
debug SimpleName MethodInvocation InfixExpression StringLiteral )
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
public Modifier MethodDeclaration Modifier static
public Modifier MethodDeclaration SimpleType SimpleName inet address
public Modifier MethodDeclaration SimpleName get local address
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName args
public Modifier MethodDeclaration SimpleType SimpleName unknown host exception
static Modifier MethodDeclaration SimpleType SimpleName inet address
static Modifier MethodDeclaration SimpleName get local address
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName args
static Modifier MethodDeclaration SimpleType SimpleName unknown host exception
static Modifier MethodDeclaration Block ReturnStatement SimpleName result
inet address SimpleName SimpleType MethodDeclaration SimpleName get local address
inet address SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName args
inet address SimpleName SimpleType MethodDeclaration SimpleType SimpleName unknown host exception
get local address SimpleName MethodDeclaration SingleVariableDeclaration SimpleName args
get local address SimpleName MethodDeclaration SimpleType SimpleName unknown host exception
get local address SimpleName MethodDeclaration Block ReturnStatement SimpleName result
args SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName unknown host exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration Modifier static
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName inet address
public Modifier TypeDeclaration MethodDeclaration SimpleName get local address
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName args
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName unknown host exception
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration Modifier static
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName inet address
test SimpleName TypeDeclaration MethodDeclaration SimpleName get local address
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName args
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName unknown host exception
