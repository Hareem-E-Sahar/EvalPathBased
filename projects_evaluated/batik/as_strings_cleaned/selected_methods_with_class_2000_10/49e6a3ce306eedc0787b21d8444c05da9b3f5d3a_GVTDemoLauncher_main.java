string SimpleName SimpleType ArrayType SingleVariableDeclaration SimpleName args
argslength QualifiedName InfixExpression NumberLiteral empty
systemerr QualifiedName MethodInvocation SimpleName println
systemerr QualifiedName MethodInvocation StringLiteral gvt demo launcher
println SimpleName MethodInvocation StringLiteral gvt demo launcher
systemerr QualifiedName MethodInvocation SimpleName println
systemerr QualifiedName MethodInvocation StringLiteral usage java gvt demo launcher class
println SimpleName MethodInvocation StringLiteral usage java gvt demo launcher class
system SimpleName MethodInvocation SimpleName exit
system SimpleName MethodInvocation NumberLiteral empty
exit SimpleName MethodInvocation NumberLiteral empty
args SimpleName ArrayAccess NumberLiteral empty
class SimpleName MethodInvocation SimpleName for name
class SimpleName MethodInvocation ArrayAccess SimpleName args
class SimpleName MethodInvocation ArrayAccess NumberLiteral empty
for name SimpleName MethodInvocation ArrayAccess SimpleName args
for name SimpleName MethodInvocation ArrayAccess NumberLiteral empty
class SimpleName MethodInvocation MethodInvocation SimpleName new instance
for name SimpleName MethodInvocation MethodInvocation SimpleName new instance
args SimpleName ArrayAccess MethodInvocation MethodInvocation SimpleName new instance
empty NumberLiteral ArrayAccess MethodInvocation MethodInvocation SimpleName new instance
gvt demo setup SimpleName SimpleType CastExpression MethodInvocation SimpleName new instance
setup SimpleName VariableDeclarationFragment CastExpression SimpleType SimpleName gvt demo setup
setup SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName new instance
gvt demo setup SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName setup
args SimpleName ArrayAccess NumberLiteral empty
gvt demo launcher SimpleName SimpleType ClassInstanceCreation ArrayAccess SimpleName args
gvt demo launcher SimpleName SimpleType ClassInstanceCreation ArrayAccess NumberLiteral empty
gvt demo launcher SimpleName SimpleType ClassInstanceCreation SimpleName setup
args SimpleName ArrayAccess ClassInstanceCreation SimpleName setup
empty NumberLiteral ArrayAccess ClassInstanceCreation SimpleName setup
frame SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName gvt demo launcher
frame SimpleName VariableDeclarationFragment ClassInstanceCreation ArrayAccess SimpleName args
frame SimpleName VariableDeclarationFragment ClassInstanceCreation ArrayAccess NumberLiteral empty
frame SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName setup
j frame SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName frame
frame SimpleName MethodInvocation SimpleName pack
frame SimpleName MethodInvocation SimpleName show
class SimpleName SimpleType ArrayType ArrayCreation NumberLiteral empty
classes SimpleName VariableDeclarationFragment ArrayCreation NumberLiteral empty
classes SimpleName ArrayAccess NumberLiteral empty
setup SimpleName MethodInvocation SimpleName get class
setup SimpleName MethodInvocation MethodInvocation SimpleName get method
get class SimpleName MethodInvocation MethodInvocation SimpleName get method
setup SimpleName MethodInvocation MethodInvocation StringLiteral init graphics d
get class SimpleName MethodInvocation MethodInvocation StringLiteral init graphics d
setup SimpleName MethodInvocation MethodInvocation SimpleName classes
get class SimpleName MethodInvocation MethodInvocation SimpleName classes
get method SimpleName MethodInvocation StringLiteral init graphics d
get method SimpleName MethodInvocation SimpleName classes
init graphics d StringLiteral MethodInvocation SimpleName classes
init graphics d SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName setup
init graphics d SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get class
init graphics d SimpleName VariableDeclarationFragment MethodInvocation SimpleName get method
init graphics d SimpleName VariableDeclarationFragment MethodInvocation StringLiteral init graphics d
init graphics d SimpleName VariableDeclarationFragment MethodInvocation SimpleName classes
method SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName init graphics d
object SimpleName SimpleType ArrayType ArrayCreation NumberLiteral empty
params SimpleName VariableDeclarationFragment ArrayCreation NumberLiteral empty
params SimpleName ArrayAccess NumberLiteral empty
frame SimpleName MethodInvocation SimpleName get graphics
graphics d SimpleName SimpleType CastExpression MethodInvocation SimpleName frame
graphics d SimpleName SimpleType CastExpression MethodInvocation SimpleName get graphics
init graphics d SimpleName MethodInvocation SimpleName invoke
init graphics d SimpleName MethodInvocation SimpleName setup
init graphics d SimpleName MethodInvocation SimpleName params
invoke SimpleName MethodInvocation SimpleName setup
invoke SimpleName MethodInvocation SimpleName params
setup SimpleName MethodInvocation SimpleName params
exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
public Modifier MethodDeclaration Modifier static
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName main
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName args
public Modifier MethodDeclaration SimpleType SimpleName exception
static Modifier MethodDeclaration PrimitiveType void
static Modifier MethodDeclaration SimpleName main
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName args
static Modifier MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration SimpleName main
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName args
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
main SimpleName MethodDeclaration SingleVariableDeclaration SimpleName args
main SimpleName MethodDeclaration SimpleType SimpleName exception
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
