print stream SimpleName SimpleType SingleVariableDeclaration SimpleName stdout
print stream SimpleName SimpleType SingleVariableDeclaration SimpleName stderr
string SimpleName SimpleType ArrayType SingleVariableDeclaration SimpleName args
int PrimitiveType SingleVariableDeclaration SimpleName max index
index SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName index
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
index SimpleName InfixExpression SimpleName max index
args SimpleName ArrayAccess SimpleName index
arg name SimpleName VariableDeclarationFragment ArrayAccess SimpleName args
arg name SimpleName VariableDeclarationFragment ArrayAccess SimpleName index
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName arg name
e StringLiteral MethodInvocation SimpleName equals
e StringLiteral MethodInvocation SimpleName arg name
equals SimpleName MethodInvocation SimpleName arg name
index SimpleName InfixExpression NumberLiteral empty
index SimpleName InfixExpression ParenthesizedExpression InfixExpression SimpleName max index
empty NumberLiteral InfixExpression ParenthesizedExpression InfixExpression SimpleName max index
missing StringLiteral InfixExpression SimpleName arg name
missing StringLiteral InfixExpression StringLiteral option argument
arg name SimpleName InfixExpression StringLiteral option argument
show error SimpleName MethodInvocation SimpleName stderr
show error SimpleName MethodInvocation InfixExpression StringLiteral missing
show error SimpleName MethodInvocation InfixExpression SimpleName arg name
show error SimpleName MethodInvocation InfixExpression StringLiteral option argument
stderr SimpleName MethodInvocation InfixExpression StringLiteral missing
stderr SimpleName MethodInvocation InfixExpression SimpleName arg name
stderr SimpleName MethodInvocation InfixExpression StringLiteral option argument
index SimpleName InfixExpression NumberLiteral empty
args SimpleName ArrayAccess InfixExpression SimpleName index
args SimpleName ArrayAccess InfixExpression NumberLiteral empty
arg val SimpleName VariableDeclarationFragment ArrayAccess SimpleName args
arg val SimpleName VariableDeclarationFragment ArrayAccess InfixExpression SimpleName index
arg val SimpleName VariableDeclarationFragment ArrayAccess InfixExpression NumberLiteral empty
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName arg val
-- StringLiteral MethodInvocation SimpleName equals
-- StringLiteral MethodInvocation SimpleName arg val
equals SimpleName MethodInvocation SimpleName arg val
paths SimpleName MethodInvocation SimpleName get
paths SimpleName MethodInvocation SimpleName arg val
get SimpleName MethodInvocation SimpleName arg val
paths SimpleName MethodInvocation MethodInvocation SimpleName normalize
get SimpleName MethodInvocation MethodInvocation SimpleName normalize
arg val SimpleName MethodInvocation MethodInvocation SimpleName normalize
paths SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to absolute path
get SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to absolute path
arg val SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to absolute path
normalize SimpleName MethodInvocation MethodInvocation SimpleName to absolute path
path SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName normalize
path SimpleName VariableDeclarationFragment MethodInvocation SimpleName to absolute path
path SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName path
files SimpleName MethodInvocation SimpleName new output stream
files SimpleName MethodInvocation SimpleName path
new output stream SimpleName MethodInvocation SimpleName path
io exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
e SimpleName MethodInvocation SimpleName get class
e SimpleName MethodInvocation MethodInvocation SimpleName get simple name
get class SimpleName MethodInvocation MethodInvocation SimpleName get simple name
e SimpleName MethodInvocation SimpleName get message
failed ( StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName e
failed ( StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName get class
failed ( StringLiteral InfixExpression MethodInvocation SimpleName get simple name
failed ( StringLiteral InfixExpression StringLiteral ) to open
failed ( StringLiteral InfixExpression SimpleName arg val
failed ( StringLiteral InfixExpression StringLiteral :
failed ( StringLiteral InfixExpression MethodInvocation SimpleName e
failed ( StringLiteral InfixExpression MethodInvocation SimpleName get message
e SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral ) to open
get class SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral ) to open
get simple name SimpleName MethodInvocation InfixExpression StringLiteral ) to open
e SimpleName MethodInvocation MethodInvocation InfixExpression SimpleName arg val
get class SimpleName MethodInvocation MethodInvocation InfixExpression SimpleName arg val
get simple name SimpleName MethodInvocation InfixExpression SimpleName arg val
e SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral :
get class SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral :
get simple name SimpleName MethodInvocation InfixExpression StringLiteral :
get simple name SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName e
get simple name SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get message
) to open StringLiteral InfixExpression SimpleName arg val
) to open StringLiteral InfixExpression StringLiteral :
) to open StringLiteral InfixExpression MethodInvocation SimpleName e
) to open StringLiteral InfixExpression MethodInvocation SimpleName get message
arg val SimpleName InfixExpression StringLiteral :
arg val SimpleName InfixExpression MethodInvocation SimpleName e
arg val SimpleName InfixExpression MethodInvocation SimpleName get message
: StringLiteral InfixExpression MethodInvocation SimpleName e
: StringLiteral InfixExpression MethodInvocation SimpleName get message
show error SimpleName MethodInvocation SimpleName stderr
show error SimpleName MethodInvocation InfixExpression StringLiteral failed (
show error SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get simple name
show error SimpleName MethodInvocation InfixExpression StringLiteral ) to open
show error SimpleName MethodInvocation InfixExpression SimpleName arg val
show error SimpleName MethodInvocation InfixExpression StringLiteral :
show error SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName e
show error SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get message
stderr SimpleName MethodInvocation InfixExpression StringLiteral failed (
stderr SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get simple name
stderr SimpleName MethodInvocation InfixExpression StringLiteral ) to open
stderr SimpleName MethodInvocation InfixExpression SimpleName arg val
stderr SimpleName MethodInvocation InfixExpression StringLiteral :
stderr SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName e
stderr SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get message
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName index
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName max index
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName index
index SimpleName InfixExpression ForStatement PostfixExpression SimpleName index
max index SimpleName InfixExpression ForStatement PostfixExpression SimpleName index
public Modifier MethodDeclaration Modifier static
public Modifier MethodDeclaration SimpleType SimpleName output stream
public Modifier MethodDeclaration SimpleName resolve logging target stream
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName print stream
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName stdout
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName print stream
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName stderr
static Modifier MethodDeclaration SimpleType SimpleName output stream
static Modifier MethodDeclaration SimpleName resolve logging target stream
static Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName print stream
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName stdout
static Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName print stream
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName stderr
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName args
output stream SimpleName SimpleType MethodDeclaration SimpleName resolve logging target stream
output stream SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName stdout
output stream SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName stderr
output stream SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName args
output stream SimpleName SimpleType MethodDeclaration SingleVariableDeclaration PrimitiveType int
output stream SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName max index
resolve logging target stream SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName print stream
resolve logging target stream SimpleName MethodDeclaration SingleVariableDeclaration SimpleName stdout
resolve logging target stream SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName print stream
resolve logging target stream SimpleName MethodDeclaration SingleVariableDeclaration SimpleName stderr
resolve logging target stream SimpleName MethodDeclaration SingleVariableDeclaration SimpleName args
resolve logging target stream SimpleName MethodDeclaration SingleVariableDeclaration PrimitiveType int
resolve logging target stream SimpleName MethodDeclaration SingleVariableDeclaration SimpleName max index
resolve logging target stream SimpleName MethodDeclaration Block ReturnStatement SimpleName stderr
stdout SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName stderr
stdout SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName args
stdout SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
stdout SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName max index
stderr SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName args
stderr SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
stderr SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName max index
args SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
args SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName max index
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration Modifier static
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName output stream
public Modifier TypeDeclaration MethodDeclaration SimpleName resolve logging target stream
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName stdout
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName stderr
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName args
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName max index
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration Modifier static
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName output stream
test SimpleName TypeDeclaration MethodDeclaration SimpleName resolve logging target stream
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName stdout
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName stderr
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName args
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName max index
