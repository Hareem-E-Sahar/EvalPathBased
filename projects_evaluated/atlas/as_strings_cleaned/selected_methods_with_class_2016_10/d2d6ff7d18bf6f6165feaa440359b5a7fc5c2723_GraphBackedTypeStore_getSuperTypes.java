immutable set SimpleName SimpleType ParameterizedType SimpleType SimpleName string
atlas vertex SimpleName SimpleType SingleVariableDeclaration SimpleName vertex
set SimpleName SimpleType ParameterizedType SimpleType SimpleName string
iterator SimpleName SimpleType ParameterizedType SimpleType SimpleName atlas edge
vertex SimpleName MethodInvocation SimpleName get edges
vertex SimpleName MethodInvocation QualifiedName atlas edge directionout
vertex SimpleName MethodInvocation SimpleName supertype edge label
get edges SimpleName MethodInvocation QualifiedName atlas edge directionout
get edges SimpleName MethodInvocation SimpleName supertype edge label
atlas edge directionout QualifiedName MethodInvocation SimpleName supertype edge label
vertex SimpleName MethodInvocation MethodInvocation SimpleName iterator
get edges SimpleName MethodInvocation MethodInvocation SimpleName iterator
atlas edge directionout QualifiedName MethodInvocation MethodInvocation SimpleName iterator
supertype edge label SimpleName MethodInvocation MethodInvocation SimpleName iterator
edges SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName vertex
edges SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get edges
edges SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation QualifiedName atlas edge directionout
edges SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName supertype edge label
edges SimpleName VariableDeclarationFragment MethodInvocation SimpleName iterator
edges SimpleName MethodInvocation SimpleName has next
edges SimpleName MethodInvocation SimpleName next
edge SimpleName VariableDeclarationFragment MethodInvocation SimpleName edges
edge SimpleName VariableDeclarationFragment MethodInvocation SimpleName next
atlas edge SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName edge
edge SimpleName MethodInvocation SimpleName get in vertex
edge SimpleName MethodInvocation MethodInvocation SimpleName get property
get in vertex SimpleName MethodInvocation MethodInvocation SimpleName get property
edge SimpleName MethodInvocation MethodInvocation QualifiedName constantstypename property key
get in vertex SimpleName MethodInvocation MethodInvocation QualifiedName constantstypename property key
get property SimpleName MethodInvocation QualifiedName constantstypename property key
get property SimpleName MethodInvocation TypeLiteral SimpleType SimpleName string
constantstypename property key QualifiedName MethodInvocation TypeLiteral SimpleType SimpleName string
super types SimpleName MethodInvocation SimpleName add
super types SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName edge
super types SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get in vertex
super types SimpleName MethodInvocation MethodInvocation SimpleName get property
super types SimpleName MethodInvocation MethodInvocation QualifiedName constantstypename property key
add SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName edge
add SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get in vertex
add SimpleName MethodInvocation MethodInvocation SimpleName get property
add SimpleName MethodInvocation MethodInvocation QualifiedName constantstypename property key
immutable set SimpleName MethodInvocation SimpleName copy of
immutable set SimpleName MethodInvocation SimpleName super types
copy of SimpleName MethodInvocation SimpleName super types
private Modifier MethodDeclaration ParameterizedType SimpleType SimpleName immutable set
private Modifier MethodDeclaration ParameterizedType SimpleType SimpleName string
private Modifier MethodDeclaration SimpleName get super types
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName atlas vertex
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName vertex
immutable set SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName get super types
string SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName get super types
get super types SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName atlas vertex
get super types SimpleName MethodDeclaration SingleVariableDeclaration SimpleName vertex
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration SimpleName get super types
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName vertex
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration SimpleName get super types
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName vertex