map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
string SimpleName SimpleType ParameterizedType SimpleType SimpleName string
propertytable replication QualifiedName MethodInvocation SimpleName get key
map SimpleName MethodInvocation SimpleName put
map SimpleName MethodInvocation MethodInvocation QualifiedName propertytable replication
map SimpleName MethodInvocation MethodInvocation SimpleName get key
map SimpleName MethodInvocation StringLiteral true
put SimpleName MethodInvocation MethodInvocation QualifiedName propertytable replication
put SimpleName MethodInvocation MethodInvocation SimpleName get key
put SimpleName MethodInvocation StringLiteral true
propertytable replication QualifiedName MethodInvocation MethodInvocation StringLiteral true
get key SimpleName MethodInvocation MethodInvocation StringLiteral true
configuration copy SimpleName SimpleType ClassInstanceCreation SimpleName map
conf SimpleName Assignment ClassInstanceCreation SimpleType SimpleName configuration copy
conf SimpleName Assignment ClassInstanceCreation SimpleName map
before SimpleName MarkerAnnotation MethodDeclaration Modifier public
before SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
before SimpleName MarkerAnnotation MethodDeclaration SimpleName setup configuration
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName setup configuration
void PrimitiveType MethodDeclaration SimpleName setup configuration
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName before
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName setup configuration
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName before
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName setup configuration
