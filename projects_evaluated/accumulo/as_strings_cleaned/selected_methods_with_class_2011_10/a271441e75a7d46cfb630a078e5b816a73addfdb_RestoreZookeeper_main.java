string SimpleName SimpleType ArrayType SingleVariableDeclaration SimpleName args
logger SimpleName MethodInvocation SimpleName get root logger
logger SimpleName MethodInvocation MethodInvocation SimpleName set level
get root logger SimpleName MethodInvocation MethodInvocation SimpleName set level
logger SimpleName MethodInvocation MethodInvocation QualifiedName levelwarn
get root logger SimpleName MethodInvocation MethodInvocation QualifiedName levelwarn
set level SimpleName MethodInvocation QualifiedName levelwarn
args SimpleName ArrayAccess NumberLiteral empty
server SimpleName VariableDeclarationFragment ArrayAccess SimpleName args
server SimpleName VariableDeclarationFragment ArrayAccess NumberLiteral empty
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName server
empty NumberLiteral InfixExpression NumberLiteral empty
timeout SimpleName VariableDeclarationFragment InfixExpression NumberLiteral empty
timeout SimpleName VariableDeclarationFragment InfixExpression NumberLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName timeout
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment InfixExpression NumberLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment InfixExpression NumberLiteral empty
in SimpleName VariableDeclarationFragment QualifiedName systemin
input stream SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName in
input stream SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment QualifiedName systemin
overwrite SimpleName VariableDeclarationFragment BooleanLiteral false
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName overwrite
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment BooleanLiteral false
argslength QualifiedName InfixExpression NumberLiteral empty
args SimpleName ArrayAccess NumberLiteral empty
file input stream SimpleName SimpleType ClassInstanceCreation ArrayAccess SimpleName args
file input stream SimpleName SimpleType ClassInstanceCreation ArrayAccess NumberLiteral empty
in SimpleName Assignment ClassInstanceCreation SimpleType SimpleName file input stream
in SimpleName Assignment ClassInstanceCreation ArrayAccess SimpleName args
in SimpleName Assignment ClassInstanceCreation ArrayAccess NumberLiteral empty
string SimpleName SimpleType SingleVariableDeclaration SimpleName arg
arg SimpleName MethodInvocation SimpleName equals
arg SimpleName MethodInvocation StringLiteral overwrite
equals SimpleName MethodInvocation StringLiteral overwrite
overwrite SimpleName Assignment BooleanLiteral true
string SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName args
arg SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName args
args SimpleName EnhancedForStatement IfStatement MethodInvocation SimpleName arg
args SimpleName EnhancedForStatement IfStatement MethodInvocation SimpleName equals
args SimpleName EnhancedForStatement IfStatement MethodInvocation StringLiteral overwrite
watched event SimpleName SimpleType SingleVariableDeclaration SimpleName event
override SimpleName MarkerAnnotation MethodDeclaration Modifier public
override SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
override SimpleName MarkerAnnotation MethodDeclaration SimpleName process
override SimpleName MarkerAnnotation MethodDeclaration SingleVariableDeclaration SimpleName event
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName process
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName watched event
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName event
void PrimitiveType MethodDeclaration SimpleName process
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName watched event
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName event
process SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName watched event
process SimpleName MethodDeclaration SingleVariableDeclaration SimpleName event
zoo keeper SimpleName SimpleType ClassInstanceCreation SimpleName server
zoo keeper SimpleName SimpleType ClassInstanceCreation SimpleName timeout
server SimpleName ClassInstanceCreation SimpleName timeout
server SimpleName ClassInstanceCreation ClassInstanceCreation SimpleType SimpleName watcher
timeout SimpleName ClassInstanceCreation ClassInstanceCreation SimpleType SimpleName watcher
zk SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName zoo keeper
zk SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName server
zk SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName timeout
zoo keeper SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName zk
sax parser factory SimpleName MethodInvocation SimpleName new instance
factory SimpleName VariableDeclarationFragment MethodInvocation SimpleName sax parser factory
factory SimpleName VariableDeclarationFragment MethodInvocation SimpleName new instance
sax parser factory SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName factory
factory SimpleName MethodInvocation SimpleName new sax parser
parser SimpleName VariableDeclarationFragment MethodInvocation SimpleName factory
parser SimpleName VariableDeclarationFragment MethodInvocation SimpleName new sax parser
sax parser SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName parser
restore SimpleName SimpleType ClassInstanceCreation SimpleName zk
restore SimpleName SimpleType ClassInstanceCreation SimpleName overwrite
zk SimpleName ClassInstanceCreation SimpleName overwrite
parser SimpleName MethodInvocation SimpleName parse
parser SimpleName MethodInvocation SimpleName in
parser SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName restore
parser SimpleName MethodInvocation ClassInstanceCreation SimpleName zk
parser SimpleName MethodInvocation ClassInstanceCreation SimpleName overwrite
parse SimpleName MethodInvocation SimpleName in
parse SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName restore
parse SimpleName MethodInvocation ClassInstanceCreation SimpleName zk
parse SimpleName MethodInvocation ClassInstanceCreation SimpleName overwrite
in SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName restore
in SimpleName MethodInvocation ClassInstanceCreation SimpleName zk
in SimpleName MethodInvocation ClassInstanceCreation SimpleName overwrite
in SimpleName MethodInvocation SimpleName close
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType boolean
int PrimitiveType VariableDeclarationStatement Block EnhancedForStatement SimpleName args
boolean PrimitiveType VariableDeclarationStatement Block EnhancedForStatement SimpleName args
public Modifier MethodDeclaration Modifier static
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName main
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName args
public Modifier MethodDeclaration SimpleType SimpleName exception
static Modifier MethodDeclaration PrimitiveType void
static Modifier MethodDeclaration SimpleName main
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName args
static Modifier MethodDeclaration SimpleType SimpleName exception
static Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
static Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType boolean
static Modifier MethodDeclaration Block EnhancedForStatement SimpleName args
void PrimitiveType MethodDeclaration SimpleName main
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName args
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType boolean
void PrimitiveType MethodDeclaration Block EnhancedForStatement SimpleName args
main SimpleName MethodDeclaration SingleVariableDeclaration SimpleName args
main SimpleName MethodDeclaration SimpleType SimpleName exception
main SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
main SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType boolean
main SimpleName MethodDeclaration Block EnhancedForStatement SimpleName args
args SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration Modifier static
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName main
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName args
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration Modifier static
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName main
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName args
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception