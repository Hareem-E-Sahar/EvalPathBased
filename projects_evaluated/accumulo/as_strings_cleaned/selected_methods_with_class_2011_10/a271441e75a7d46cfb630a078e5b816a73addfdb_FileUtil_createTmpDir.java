accumulo configuration SimpleName SimpleType SingleVariableDeclaration SimpleName acu conf
file system SimpleName SimpleType SingleVariableDeclaration SimpleName fs
acu conf SimpleName MethodInvocation SimpleName get
acu conf SimpleName MethodInvocation QualifiedName propertyinstance dfs dir
get SimpleName MethodInvocation QualifiedName propertyinstance dfs dir
accumulo dir SimpleName VariableDeclarationFragment MethodInvocation SimpleName acu conf
accumulo dir SimpleName VariableDeclarationFragment MethodInvocation SimpleName get
accumulo dir SimpleName VariableDeclarationFragment MethodInvocation QualifiedName propertyinstance dfs dir
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName accumulo dir
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName tmp dir
math SimpleName MethodInvocation SimpleName random
math SimpleName MethodInvocation InfixExpression QualifiedName integermax value
random SimpleName MethodInvocation InfixExpression QualifiedName integermax value
int PrimitiveType CastExpression ParenthesizedExpression InfixExpression QualifiedName integermax value
string SimpleName MethodInvocation SimpleName format
string SimpleName MethodInvocation StringLiteral % d
string SimpleName MethodInvocation CastExpression PrimitiveType int
format SimpleName MethodInvocation StringLiteral % d
format SimpleName MethodInvocation CastExpression PrimitiveType int
% d StringLiteral MethodInvocation CastExpression PrimitiveType int
accumulo dir SimpleName InfixExpression StringLiteral tmpidx reduce
accumulo dir SimpleName InfixExpression MethodInvocation SimpleName string
accumulo dir SimpleName InfixExpression MethodInvocation SimpleName format
accumulo dir SimpleName InfixExpression MethodInvocation StringLiteral % d
accumulo dir SimpleName InfixExpression MethodInvocation CastExpression PrimitiveType int
tmpidx reduce StringLiteral InfixExpression MethodInvocation SimpleName string
tmpidx reduce StringLiteral InfixExpression MethodInvocation SimpleName format
tmpidx reduce StringLiteral InfixExpression MethodInvocation StringLiteral % d
tmpidx reduce StringLiteral InfixExpression MethodInvocation CastExpression PrimitiveType int
tmp dir SimpleName Assignment InfixExpression SimpleName accumulo dir
tmp dir SimpleName Assignment InfixExpression StringLiteral tmpidx reduce
tmp dir SimpleName Assignment InfixExpression MethodInvocation SimpleName string
tmp dir SimpleName Assignment InfixExpression MethodInvocation SimpleName format
tmp dir SimpleName Assignment InfixExpression MethodInvocation StringLiteral % d
path SimpleName SimpleType ClassInstanceCreation SimpleName tmp dir
fs SimpleName MethodInvocation SimpleName get file status
fs SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName path
fs SimpleName MethodInvocation ClassInstanceCreation SimpleName tmp dir
get file status SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName path
get file status SimpleName MethodInvocation ClassInstanceCreation SimpleName tmp dir
file not found exception SimpleName SimpleType SingleVariableDeclaration SimpleName fne
path SimpleName SimpleType ClassInstanceCreation SimpleName tmp dir
fs SimpleName MethodInvocation SimpleName mkdirs
fs SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName path
fs SimpleName MethodInvocation ClassInstanceCreation SimpleName tmp dir
mkdirs SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName path
mkdirs SimpleName MethodInvocation ClassInstanceCreation SimpleName tmp dir
tmp dir SimpleName InfixExpression StringLiteral / reserve
path SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName tmp dir
path SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral / reserve
fs SimpleName MethodInvocation SimpleName create new file
fs SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName path
fs SimpleName MethodInvocation ClassInstanceCreation InfixExpression SimpleName tmp dir
fs SimpleName MethodInvocation ClassInstanceCreation InfixExpression StringLiteral / reserve
create new file SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName path
create new file SimpleName MethodInvocation ClassInstanceCreation InfixExpression SimpleName tmp dir
create new file SimpleName MethodInvocation ClassInstanceCreation InfixExpression StringLiteral / reserve
private Modifier MethodDeclaration Modifier static
private Modifier MethodDeclaration SimpleType SimpleName string
private Modifier MethodDeclaration SimpleName create tmp dir
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName accumulo configuration
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName acu conf
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName file system
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName fs
static Modifier MethodDeclaration SimpleType SimpleName string
static Modifier MethodDeclaration SimpleName create tmp dir
static Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName accumulo configuration
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName acu conf
static Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName file system
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName fs
static Modifier MethodDeclaration SimpleType SimpleName io exception
string SimpleName SimpleType MethodDeclaration SimpleName create tmp dir
string SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName acu conf
string SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName fs
string SimpleName SimpleType MethodDeclaration SimpleType SimpleName io exception
create tmp dir SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName accumulo configuration
create tmp dir SimpleName MethodDeclaration SingleVariableDeclaration SimpleName acu conf
create tmp dir SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName file system
create tmp dir SimpleName MethodDeclaration SingleVariableDeclaration SimpleName fs
create tmp dir SimpleName MethodDeclaration SimpleType SimpleName io exception
create tmp dir SimpleName MethodDeclaration Block ReturnStatement SimpleName tmp dir
acu conf SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName fs
acu conf SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
fs SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration Modifier static
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName string
public Modifier TypeDeclaration MethodDeclaration SimpleName create tmp dir
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName acu conf
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName fs
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration Modifier static
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName string
test SimpleName TypeDeclaration MethodDeclaration SimpleName create tmp dir
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName acu conf
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName fs
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
