test SimpleName MethodInvocation NumberLiteral empty
test SimpleName MethodInvocation BooleanLiteral true
empty NumberLiteral MethodInvocation BooleanLiteral true
results SimpleName VariableDeclarationFragment MethodInvocation SimpleName test
results SimpleName VariableDeclarationFragment MethodInvocation NumberLiteral empty
results SimpleName VariableDeclarationFragment MethodInvocation BooleanLiteral true
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName results
results SimpleName MethodInvocation SimpleName contains
results SimpleName MethodInvocation StringLiteral session expired
contains SimpleName MethodInvocation StringLiteral session expired
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation StringLiteral failed to find session expired in output but t server did die which is expected
info SimpleName MethodInvocation StringLiteral failed to find session expired in output but t server did die which is expected
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test timeout
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test timeout
public Modifier MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration SimpleName test timeout
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
test timeout SimpleName MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test timeout
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test timeout
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
