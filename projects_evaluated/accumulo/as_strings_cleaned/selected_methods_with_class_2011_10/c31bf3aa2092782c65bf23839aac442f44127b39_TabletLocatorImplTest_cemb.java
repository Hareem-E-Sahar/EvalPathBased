list SimpleName SimpleType ParameterizedType SimpleType SimpleName string
map SimpleName SimpleType ParameterizedType SimpleType SimpleName key extent
map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
object SimpleName SimpleType ArrayType SingleVariableDeclaration SimpleName ols
list SimpleName SimpleType ParameterizedType SimpleType SimpleName string
map SimpleName SimpleType ParameterizedType SimpleType SimpleName key extent
map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
list SimpleName SimpleType ParameterizedType SimpleType SimpleName string
map SimpleName SimpleType ParameterizedType SimpleType SimpleName key extent
hash map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
object SimpleName SimpleType ArrayType SingleVariableDeclaration SimpleName ol
ol SimpleName ArrayAccess NumberLiteral empty
string SimpleName SimpleType CastExpression ArrayAccess SimpleName ol
string SimpleName SimpleType CastExpression ArrayAccess NumberLiteral empty
row SimpleName VariableDeclarationFragment CastExpression SimpleType SimpleName string
row SimpleName VariableDeclarationFragment CastExpression ArrayAccess SimpleName ol
row SimpleName VariableDeclarationFragment CastExpression ArrayAccess NumberLiteral empty
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName row
ol SimpleName ArrayAccess NumberLiteral empty
string SimpleName SimpleType CastExpression ArrayAccess SimpleName ol
string SimpleName SimpleType CastExpression ArrayAccess NumberLiteral empty
server SimpleName VariableDeclarationFragment CastExpression SimpleType SimpleName string
server SimpleName VariableDeclarationFragment CastExpression ArrayAccess SimpleName ol
server SimpleName VariableDeclarationFragment CastExpression ArrayAccess NumberLiteral empty
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName server
ol SimpleName ArrayAccess NumberLiteral empty
key extent SimpleName SimpleType CastExpression ArrayAccess SimpleName ol
key extent SimpleName SimpleType CastExpression ArrayAccess NumberLiteral empty
ke SimpleName VariableDeclarationFragment CastExpression SimpleType SimpleName key extent
ke SimpleName VariableDeclarationFragment CastExpression ArrayAccess SimpleName ol
ke SimpleName VariableDeclarationFragment CastExpression ArrayAccess NumberLiteral empty
key extent SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName ke
list SimpleName SimpleType ParameterizedType SimpleType SimpleName string
map SimpleName SimpleType ParameterizedType SimpleType SimpleName key extent
emb SimpleName MethodInvocation SimpleName get
emb SimpleName MethodInvocation SimpleName server
get SimpleName MethodInvocation SimpleName server
tb SimpleName VariableDeclarationFragment MethodInvocation SimpleName emb
tb SimpleName VariableDeclarationFragment MethodInvocation SimpleName get
tb SimpleName VariableDeclarationFragment MethodInvocation SimpleName server
list SimpleName SimpleType ParameterizedType SimpleType SimpleName string
hash map SimpleName SimpleType ParameterizedType SimpleType SimpleName key extent
emb SimpleName MethodInvocation SimpleName put
emb SimpleName MethodInvocation SimpleName server
emb SimpleName MethodInvocation SimpleName tb
put SimpleName MethodInvocation SimpleName server
put SimpleName MethodInvocation SimpleName tb
server SimpleName MethodInvocation SimpleName tb
list SimpleName SimpleType ParameterizedType SimpleType SimpleName string
tb SimpleName MethodInvocation SimpleName get
tb SimpleName MethodInvocation SimpleName ke
get SimpleName MethodInvocation SimpleName ke
rl SimpleName VariableDeclarationFragment MethodInvocation SimpleName tb
rl SimpleName VariableDeclarationFragment MethodInvocation SimpleName get
rl SimpleName VariableDeclarationFragment MethodInvocation SimpleName ke
array list SimpleName SimpleType ParameterizedType SimpleType SimpleName string
tb SimpleName MethodInvocation SimpleName put
tb SimpleName MethodInvocation SimpleName ke
tb SimpleName MethodInvocation SimpleName rl
put SimpleName MethodInvocation SimpleName ke
put SimpleName MethodInvocation SimpleName rl
ke SimpleName MethodInvocation SimpleName rl
rl SimpleName MethodInvocation SimpleName add
rl SimpleName MethodInvocation SimpleName row
add SimpleName MethodInvocation SimpleName row
ol SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName ols
ols SimpleName EnhancedForStatement Block ReturnStatement SimpleName emb
static Modifier MethodDeclaration ParameterizedType SimpleType SimpleName map
static Modifier MethodDeclaration ParameterizedType SimpleType SimpleName string
static Modifier MethodDeclaration SimpleName cemb
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName ols
static Modifier MethodDeclaration Block EnhancedForStatement SimpleName ols
static Modifier MethodDeclaration Block ReturnStatement SimpleName emb
map SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName cemb
string SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName cemb
cemb SimpleName MethodDeclaration SingleVariableDeclaration SimpleName ols
cemb SimpleName MethodDeclaration Block EnhancedForStatement SimpleName ols
cemb SimpleName MethodDeclaration Block ReturnStatement SimpleName emb
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier static
public Modifier TypeDeclaration MethodDeclaration SimpleName cemb
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName ols
test SimpleName TypeDeclaration MethodDeclaration Modifier static
test SimpleName TypeDeclaration MethodDeclaration SimpleName cemb
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName ols
