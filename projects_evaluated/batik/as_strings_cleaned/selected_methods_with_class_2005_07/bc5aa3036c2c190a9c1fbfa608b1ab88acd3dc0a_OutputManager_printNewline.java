pretty printer SimpleName MethodInvocation SimpleName get newline
nl SimpleName VariableDeclarationFragment MethodInvocation SimpleName pretty printer
nl SimpleName VariableDeclarationFragment MethodInvocation SimpleName get newline
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName nl
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
nl SimpleName MethodInvocation SimpleName length
i SimpleName InfixExpression MethodInvocation SimpleName nl
i SimpleName InfixExpression MethodInvocation SimpleName length
nl SimpleName MethodInvocation SimpleName char at
nl SimpleName MethodInvocation SimpleName i
char at SimpleName MethodInvocation SimpleName i
writer SimpleName MethodInvocation SimpleName write
writer SimpleName MethodInvocation MethodInvocation SimpleName nl
writer SimpleName MethodInvocation MethodInvocation SimpleName char at
writer SimpleName MethodInvocation MethodInvocation SimpleName i
write SimpleName MethodInvocation MethodInvocation SimpleName nl
write SimpleName MethodInvocation MethodInvocation SimpleName char at
write SimpleName MethodInvocation MethodInvocation SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
column SimpleName Assignment NumberLiteral empty
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName print newline
public Modifier MethodDeclaration SimpleType SimpleName io exception
void PrimitiveType MethodDeclaration SimpleName print newline
void PrimitiveType MethodDeclaration SimpleType SimpleName io exception
print newline SimpleName MethodDeclaration SimpleType SimpleName io exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName print newline
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName print newline
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
