i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
max retries SimpleName InfixExpression NumberLiteral empty
i SimpleName InfixExpression InfixExpression SimpleName max retries
i SimpleName InfixExpression InfixExpression NumberLiteral empty
retry SimpleName MethodInvocation SimpleName can retry
assert SimpleName MethodInvocation SimpleName assert true
assert SimpleName MethodInvocation MethodInvocation SimpleName retry
assert SimpleName MethodInvocation MethodInvocation SimpleName can retry
assert true SimpleName MethodInvocation MethodInvocation SimpleName retry
assert true SimpleName MethodInvocation MethodInvocation SimpleName can retry
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName can retry doesnt alter state
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName can retry doesnt alter state
void PrimitiveType MethodDeclaration SimpleName can retry doesnt alter state
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName can retry doesnt alter state
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName can retry doesnt alter state
