list SimpleName SimpleType ParameterizedType SimpleType SimpleName string
string SimpleName SimpleType SingleVariableDeclaration SimpleName path
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral ==> file reader util read file
log SimpleName MethodInvocation SimpleName path
debug SimpleName MethodInvocation StringLiteral ==> file reader util read file
debug SimpleName MethodInvocation SimpleName path
==> file reader util read file StringLiteral MethodInvocation SimpleName path
list SimpleName SimpleType ParameterizedType SimpleType SimpleName string
list SimpleName SimpleType ParameterizedType SimpleType SimpleName string
paths SimpleName MethodInvocation SimpleName get
paths SimpleName MethodInvocation SimpleName path
get SimpleName MethodInvocation SimpleName path
charset SimpleName MethodInvocation SimpleName for name
charset SimpleName MethodInvocation StringLiteral utf
for name SimpleName MethodInvocation StringLiteral utf
files SimpleName MethodInvocation SimpleName read all lines
files SimpleName MethodInvocation MethodInvocation SimpleName paths
files SimpleName MethodInvocation MethodInvocation SimpleName get
files SimpleName MethodInvocation MethodInvocation SimpleName path
files SimpleName MethodInvocation MethodInvocation SimpleName charset
files SimpleName MethodInvocation MethodInvocation SimpleName for name
files SimpleName MethodInvocation MethodInvocation StringLiteral utf
read all lines SimpleName MethodInvocation MethodInvocation SimpleName paths
read all lines SimpleName MethodInvocation MethodInvocation SimpleName get
read all lines SimpleName MethodInvocation MethodInvocation SimpleName path
read all lines SimpleName MethodInvocation MethodInvocation SimpleName charset
read all lines SimpleName MethodInvocation MethodInvocation SimpleName for name
read all lines SimpleName MethodInvocation MethodInvocation StringLiteral utf
paths SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName charset
paths SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName for name
paths SimpleName MethodInvocation MethodInvocation MethodInvocation StringLiteral utf
get SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName charset
get SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName for name
get SimpleName MethodInvocation MethodInvocation MethodInvocation StringLiteral utf
path SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName charset
path SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName for name
path SimpleName MethodInvocation MethodInvocation MethodInvocation StringLiteral utf
file lines SimpleName VariableDeclarationFragment MethodInvocation SimpleName files
file lines SimpleName VariableDeclarationFragment MethodInvocation SimpleName read all lines
file lines SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName paths
file lines SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get
file lines SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName path
file lines SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName charset
file lines SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName for name
file lines SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation StringLiteral utf
string SimpleName SimpleType SingleVariableDeclaration SimpleName line
line SimpleName MethodInvocation SimpleName starts with
line SimpleName MethodInvocation StringLiteral #
starts with SimpleName MethodInvocation StringLiteral #
pattern SimpleName MethodInvocation SimpleName matches
pattern SimpleName MethodInvocation StringLiteral .+ .* .* .+
pattern SimpleName MethodInvocation SimpleName line
matches SimpleName MethodInvocation StringLiteral .+ .* .* .+
matches SimpleName MethodInvocation SimpleName line
.+ .* .* .+ StringLiteral MethodInvocation SimpleName line
list SimpleName MethodInvocation SimpleName add
list SimpleName MethodInvocation SimpleName line
add SimpleName MethodInvocation SimpleName line
string SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName file lines
line SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName file lines
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral <== file reader util read file
log SimpleName MethodInvocation SimpleName path
debug SimpleName MethodInvocation StringLiteral <== file reader util read file
debug SimpleName MethodInvocation SimpleName path
<== file reader util read file StringLiteral MethodInvocation SimpleName path
policies read :: StringLiteral InfixExpression SimpleName list
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation InfixExpression StringLiteral policies read ::
log SimpleName MethodInvocation InfixExpression SimpleName list
debug SimpleName MethodInvocation InfixExpression StringLiteral policies read ::
debug SimpleName MethodInvocation InfixExpression SimpleName list
is debug enabled SimpleName IfStatement Block IfStatement SimpleName is debug enabled
is debug enabled SimpleName IfStatement Block ReturnStatement SimpleName list
is debug enabled SimpleName IfStatement Block ReturnStatement SimpleName list
public Modifier MethodDeclaration Modifier static
public Modifier MethodDeclaration ParameterizedType SimpleType SimpleName list
public Modifier MethodDeclaration ParameterizedType SimpleType SimpleName string
public Modifier MethodDeclaration SimpleName read file
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName path
public Modifier MethodDeclaration SimpleType SimpleName io exception
static Modifier MethodDeclaration ParameterizedType SimpleType SimpleName list
static Modifier MethodDeclaration ParameterizedType SimpleType SimpleName string
static Modifier MethodDeclaration SimpleName read file
static Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName path
static Modifier MethodDeclaration SimpleType SimpleName io exception
static Modifier MethodDeclaration Block IfStatement SimpleName is debug enabled
static Modifier MethodDeclaration Block IfStatement SimpleName is debug enabled
static Modifier MethodDeclaration Block ReturnStatement SimpleName list
list SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName read file
string SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName read file
read file SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
read file SimpleName MethodDeclaration SingleVariableDeclaration SimpleName path
read file SimpleName MethodDeclaration SimpleType SimpleName io exception
read file SimpleName MethodDeclaration Block IfStatement SimpleName is debug enabled
read file SimpleName MethodDeclaration Block IfStatement SimpleName is debug enabled
read file SimpleName MethodDeclaration Block ReturnStatement SimpleName list
path SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration Modifier static
public Modifier TypeDeclaration MethodDeclaration SimpleName read file
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName path
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration Modifier static
test SimpleName TypeDeclaration MethodDeclaration SimpleName read file
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName path
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
