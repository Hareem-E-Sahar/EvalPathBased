log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation StringLiteral restoring split on metadata table
info SimpleName MethodInvocation StringLiteral restoring split on metadata table
conn SimpleName VariableDeclarationFragment MethodInvocation SimpleName get connector
connector SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName conn
conn SimpleName MethodInvocation SimpleName table operations
conn SimpleName MethodInvocation MethodInvocation SimpleName merge
table operations SimpleName MethodInvocation MethodInvocation SimpleName merge
conn SimpleName MethodInvocation MethodInvocation QualifiedName metadata tablename
table operations SimpleName MethodInvocation MethodInvocation QualifiedName metadata tablename
merge SimpleName MethodInvocation QualifiedName metadata tablename
conn SimpleName MethodInvocation SimpleName table operations
tree set SimpleName SimpleType ParameterizedType SimpleType SimpleName text
tree set SimpleName SimpleType ParameterizedType ClassInstanceCreation SimpleName metadata splits
text SimpleName SimpleType ParameterizedType ClassInstanceCreation SimpleName metadata splits
conn SimpleName MethodInvocation MethodInvocation SimpleName add splits
table operations SimpleName MethodInvocation MethodInvocation SimpleName add splits
conn SimpleName MethodInvocation MethodInvocation QualifiedName metadata tablename
table operations SimpleName MethodInvocation MethodInvocation QualifiedName metadata tablename
conn SimpleName MethodInvocation MethodInvocation ClassInstanceCreation SimpleName metadata splits
table operations SimpleName MethodInvocation MethodInvocation ClassInstanceCreation SimpleName metadata splits
add splits SimpleName MethodInvocation QualifiedName metadata tablename
add splits SimpleName MethodInvocation ClassInstanceCreation SimpleName metadata splits
metadata tablename QualifiedName MethodInvocation ClassInstanceCreation SimpleName metadata splits
after SimpleName MarkerAnnotation MethodDeclaration Modifier public
after SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
after SimpleName MarkerAnnotation MethodDeclaration SimpleName restore metadata splits
after SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName restore metadata splits
public Modifier MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration SimpleName restore metadata splits
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
restore metadata splits SimpleName MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName after
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName restore metadata splits
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName after
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName restore metadata splits
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception