set SimpleName SimpleType ParameterizedType SimpleType SimpleName string
atlas vertex SimpleName SimpleType SingleVariableDeclaration SimpleName vertex
set SimpleName SimpleType ParameterizedType SimpleType SimpleName string
iterable SimpleName SimpleType ParameterizedType SimpleType SimpleName atlas edge
vertex SimpleName MethodInvocation SimpleName get edges
vertex SimpleName MethodInvocation QualifiedName atlas edge directionout
vertex SimpleName MethodInvocation QualifiedName atlas graph utils v supertype edge label
get edges SimpleName MethodInvocation QualifiedName atlas edge directionout
get edges SimpleName MethodInvocation QualifiedName atlas graph utils v supertype edge label
atlas edge directionout QualifiedName MethodInvocation QualifiedName atlas graph utils v supertype edge label
edges SimpleName VariableDeclarationFragment MethodInvocation SimpleName vertex
edges SimpleName VariableDeclarationFragment MethodInvocation SimpleName get edges
edges SimpleName VariableDeclarationFragment MethodInvocation QualifiedName atlas edge directionout
edges SimpleName VariableDeclarationFragment MethodInvocation QualifiedName atlas graph utils v supertype edge label
atlas edge SimpleName SimpleType SingleVariableDeclaration SimpleName edge
edge SimpleName MethodInvocation SimpleName get in vertex
edge SimpleName MethodInvocation MethodInvocation SimpleName get property
get in vertex SimpleName MethodInvocation MethodInvocation SimpleName get property
edge SimpleName MethodInvocation MethodInvocation QualifiedName constantstypename property key
get in vertex SimpleName MethodInvocation MethodInvocation QualifiedName constantstypename property key
get property SimpleName MethodInvocation QualifiedName constantstypename property key
get property SimpleName MethodInvocation TypeLiteral SimpleType SimpleName string
constantstypename property key QualifiedName MethodInvocation TypeLiteral SimpleType SimpleName string
ret SimpleName MethodInvocation SimpleName add
ret SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName edge
ret SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get in vertex
ret SimpleName MethodInvocation MethodInvocation SimpleName get property
ret SimpleName MethodInvocation MethodInvocation QualifiedName constantstypename property key
add SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName edge
add SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get in vertex
add SimpleName MethodInvocation MethodInvocation SimpleName get property
add SimpleName MethodInvocation MethodInvocation QualifiedName constantstypename property key
atlas edge SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName edges
edge SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName edges
edges SimpleName EnhancedForStatement Block ReturnStatement SimpleName ret
public Modifier MethodDeclaration ParameterizedType SimpleType SimpleName set
public Modifier MethodDeclaration ParameterizedType SimpleType SimpleName string
public Modifier MethodDeclaration SimpleName get super type names
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName atlas vertex
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName vertex
public Modifier MethodDeclaration Block EnhancedForStatement SimpleName edges
public Modifier MethodDeclaration Block ReturnStatement SimpleName ret
set SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName get super type names
string SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName get super type names
get super type names SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName atlas vertex
get super type names SimpleName MethodDeclaration SingleVariableDeclaration SimpleName vertex
get super type names SimpleName MethodDeclaration Block EnhancedForStatement SimpleName edges
get super type names SimpleName MethodDeclaration Block ReturnStatement SimpleName ret
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration SimpleName get super type names
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName vertex
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration SimpleName get super type names
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName vertex