class SimpleName SimpleType SingleVariableDeclaration SimpleName cls
cls SimpleName MethodInvocation SimpleName get name
metainfservices StringLiteral InfixExpression MethodInvocation SimpleName cls
metainfservices StringLiteral InfixExpression MethodInvocation SimpleName get name
service file SimpleName VariableDeclarationFragment InfixExpression StringLiteral metainfservices
service file SimpleName VariableDeclarationFragment InfixExpression MethodInvocation SimpleName cls
service file SimpleName VariableDeclarationFragment InfixExpression MethodInvocation SimpleName get name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName service file
provider map SimpleName MethodInvocation SimpleName get
provider map SimpleName MethodInvocation SimpleName service file
get SimpleName MethodInvocation SimpleName service file
list SimpleName SimpleType CastExpression MethodInvocation SimpleName provider map
list SimpleName SimpleType CastExpression MethodInvocation SimpleName get
list SimpleName SimpleType CastExpression MethodInvocation SimpleName service file
l SimpleName VariableDeclarationFragment CastExpression SimpleType SimpleName list
l SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName provider map
l SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName get
l SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName service file
list SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName l
l SimpleName MethodInvocation SimpleName iterator
l SimpleName Assignment ClassInstanceCreation SimpleType SimpleName array list
provider map SimpleName MethodInvocation SimpleName put
provider map SimpleName MethodInvocation SimpleName service file
provider map SimpleName MethodInvocation SimpleName l
put SimpleName MethodInvocation SimpleName service file
put SimpleName MethodInvocation SimpleName l
service file SimpleName MethodInvocation SimpleName l
class loader SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName cl
cls SimpleName MethodInvocation SimpleName get class loader
cl SimpleName Assignment MethodInvocation SimpleName cls
cl SimpleName Assignment MethodInvocation SimpleName get class loader
security exception SimpleName SimpleType SingleVariableDeclaration SimpleName se
service SimpleName SimpleType TypeLiteral MethodInvocation SimpleName get class loader
cl SimpleName Assignment MethodInvocation SimpleName get class loader
l SimpleName MethodInvocation SimpleName iterator
enumeration SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName e
cl SimpleName MethodInvocation SimpleName get resources
cl SimpleName MethodInvocation SimpleName service file
get resources SimpleName MethodInvocation SimpleName service file
e SimpleName Assignment MethodInvocation SimpleName cl
e SimpleName Assignment MethodInvocation SimpleName get resources
e SimpleName Assignment MethodInvocation SimpleName service file
io exception SimpleName SimpleType SingleVariableDeclaration SimpleName ioe
l SimpleName MethodInvocation SimpleName iterator
e SimpleName MethodInvocation SimpleName has more elements
input stream SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName is
reader SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName r
buffered reader SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName br
e SimpleName MethodInvocation SimpleName next element
url SimpleName SimpleType CastExpression MethodInvocation SimpleName e
url SimpleName SimpleType CastExpression MethodInvocation SimpleName next element
u SimpleName VariableDeclarationFragment CastExpression SimpleType SimpleName url
u SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName e
u SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName next element
url SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName u
u SimpleName MethodInvocation SimpleName open stream
is SimpleName Assignment MethodInvocation SimpleName u
is SimpleName Assignment MethodInvocation SimpleName open stream
input stream reader SimpleName SimpleType ClassInstanceCreation SimpleName is
input stream reader SimpleName SimpleType ClassInstanceCreation StringLiteral utf
is SimpleName ClassInstanceCreation StringLiteral utf
r SimpleName Assignment ClassInstanceCreation SimpleType SimpleName input stream reader
r SimpleName Assignment ClassInstanceCreation SimpleName is
r SimpleName Assignment ClassInstanceCreation StringLiteral utf
buffered reader SimpleName SimpleType ClassInstanceCreation SimpleName r
br SimpleName Assignment ClassInstanceCreation SimpleType SimpleName buffered reader
br SimpleName Assignment ClassInstanceCreation SimpleName r
br SimpleName MethodInvocation SimpleName read line
line SimpleName VariableDeclarationFragment MethodInvocation SimpleName br
line SimpleName VariableDeclarationFragment MethodInvocation SimpleName read line
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName line
line SimpleName MethodInvocation SimpleName index of
line SimpleName MethodInvocation CharacterLiteral #
index of SimpleName MethodInvocation CharacterLiteral #
idx SimpleName VariableDeclarationFragment MethodInvocation SimpleName line
idx SimpleName VariableDeclarationFragment MethodInvocation SimpleName index of
idx SimpleName VariableDeclarationFragment MethodInvocation CharacterLiteral #
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName idx
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName line
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName index of
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation CharacterLiteral #
idx SimpleName InfixExpression PrefixExpression NumberLiteral empty
line SimpleName MethodInvocation SimpleName substring
line SimpleName MethodInvocation NumberLiteral empty
line SimpleName MethodInvocation SimpleName idx
substring SimpleName MethodInvocation NumberLiteral empty
substring SimpleName MethodInvocation SimpleName idx
empty NumberLiteral MethodInvocation SimpleName idx
line SimpleName Assignment MethodInvocation SimpleName line
line SimpleName Assignment MethodInvocation SimpleName substring
line SimpleName Assignment MethodInvocation NumberLiteral empty
line SimpleName Assignment MethodInvocation SimpleName idx
line SimpleName MethodInvocation SimpleName trim
line SimpleName Assignment MethodInvocation SimpleName line
line SimpleName Assignment MethodInvocation SimpleName trim
line SimpleName MethodInvocation SimpleName length
line SimpleName MethodInvocation InfixExpression NumberLiteral empty
length SimpleName MethodInvocation InfixExpression NumberLiteral empty
br SimpleName MethodInvocation SimpleName read line
line SimpleName Assignment MethodInvocation SimpleName br
line SimpleName Assignment MethodInvocation SimpleName read line
cl SimpleName MethodInvocation SimpleName load class
cl SimpleName MethodInvocation SimpleName line
load class SimpleName MethodInvocation SimpleName line
cl SimpleName MethodInvocation MethodInvocation SimpleName get declared constructor
load class SimpleName MethodInvocation MethodInvocation SimpleName get declared constructor
line SimpleName MethodInvocation MethodInvocation SimpleName get declared constructor
cl SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName new instance
load class SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName new instance
line SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName new instance
get declared constructor SimpleName MethodInvocation MethodInvocation SimpleName new instance
obj SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get declared constructor
obj SimpleName VariableDeclarationFragment MethodInvocation SimpleName new instance
object SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName obj
l SimpleName MethodInvocation SimpleName add
l SimpleName MethodInvocation SimpleName obj
add SimpleName MethodInvocation SimpleName obj
exception SimpleName SimpleType SingleVariableDeclaration SimpleName ex
br SimpleName MethodInvocation SimpleName read line
line SimpleName Assignment MethodInvocation SimpleName br
line SimpleName Assignment MethodInvocation SimpleName read line
exception SimpleName SimpleType SingleVariableDeclaration SimpleName ex
linkage error SimpleName SimpleType SingleVariableDeclaration SimpleName le
is SimpleName MethodInvocation SimpleName close
io exception SimpleName SimpleType SingleVariableDeclaration SimpleName ignored
r SimpleName MethodInvocation SimpleName close
io exception SimpleName SimpleType SingleVariableDeclaration SimpleName ignored
br SimpleName MethodInvocation SimpleName close
io exception SimpleName SimpleType SingleVariableDeclaration SimpleName ignored
l SimpleName MethodInvocation SimpleName iterator
public Modifier MethodDeclaration Modifier static
public Modifier MethodDeclaration Modifier synchronized
public Modifier MethodDeclaration SimpleType SimpleName iterator
public Modifier MethodDeclaration SimpleName providers
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName class
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName cls
static Modifier MethodDeclaration Modifier synchronized
static Modifier MethodDeclaration SimpleType SimpleName iterator
static Modifier MethodDeclaration SimpleName providers
static Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName class
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName cls
synchronized Modifier MethodDeclaration SimpleType SimpleName iterator
synchronized Modifier MethodDeclaration SimpleName providers
synchronized Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName class
synchronized Modifier MethodDeclaration SingleVariableDeclaration SimpleName cls
iterator SimpleName SimpleType MethodDeclaration SimpleName providers
iterator SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName cls
providers SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName class
providers SimpleName MethodDeclaration SingleVariableDeclaration SimpleName cls
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration Modifier static
public Modifier TypeDeclaration MethodDeclaration Modifier synchronized
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName iterator
public Modifier TypeDeclaration MethodDeclaration SimpleName providers
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName cls
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration Modifier static
test SimpleName TypeDeclaration MethodDeclaration Modifier synchronized
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName iterator
test SimpleName TypeDeclaration MethodDeclaration SimpleName providers
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName cls
