set SimpleName SimpleType ParameterizedType SimpleType SimpleName string
set SimpleName SimpleType ParameterizedType SimpleType SimpleName string
hash set SimpleName SimpleType ParameterizedType SimpleType SimpleName string
dfs logger SimpleName SimpleType SingleVariableDeclaration SimpleName log
log SimpleName MethodInvocation SimpleName to string
result SimpleName MethodInvocation SimpleName add
result SimpleName MethodInvocation MethodInvocation SimpleName log
result SimpleName MethodInvocation MethodInvocation SimpleName to string
add SimpleName MethodInvocation MethodInvocation SimpleName log
add SimpleName MethodInvocation MethodInvocation SimpleName to string
dfs logger SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName current logs
log SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName current logs
current logs SimpleName SynchronizedStatement Block EnhancedForStatement SimpleName current logs
current logs SimpleName SynchronizedStatement Block ReturnStatement SimpleName result
public Modifier MethodDeclaration ParameterizedType SimpleType SimpleName set
public Modifier MethodDeclaration ParameterizedType SimpleType SimpleName string
public Modifier MethodDeclaration SimpleName get current logs
public Modifier MethodDeclaration Block SynchronizedStatement SimpleName current logs
public Modifier MethodDeclaration Block ReturnStatement SimpleName result
set SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName get current logs
string SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName get current logs
get current logs SimpleName MethodDeclaration Block SynchronizedStatement SimpleName current logs
get current logs SimpleName MethodDeclaration Block ReturnStatement SimpleName result
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration SimpleName get current logs
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration SimpleName get current logs
