char PrimitiveType ArrayType SingleVariableDeclaration SimpleName text
pretty printer SimpleName MethodInvocation SimpleName get format
newlines SimpleName MethodInvocation SimpleName text
nl SimpleName VariableDeclarationFragment MethodInvocation SimpleName newlines
nl SimpleName VariableDeclarationFragment MethodInvocation SimpleName text
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName nl
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName newlines
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName text
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression SimpleName nl
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName nl
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
nl SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
print characters SimpleName MethodInvocation SimpleName text
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName print top spaces
public Modifier MethodDeclaration SingleVariableDeclaration ArrayType PrimitiveType char
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName text
public Modifier MethodDeclaration SimpleType SimpleName io exception
void PrimitiveType MethodDeclaration SimpleName print top spaces
void PrimitiveType MethodDeclaration SingleVariableDeclaration ArrayType PrimitiveType char
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName text
void PrimitiveType MethodDeclaration SimpleType SimpleName io exception
print top spaces SimpleName MethodDeclaration SingleVariableDeclaration ArrayType PrimitiveType char
print top spaces SimpleName MethodDeclaration SingleVariableDeclaration SimpleName text
print top spaces SimpleName MethodDeclaration SimpleType SimpleName io exception
text SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName print top spaces
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName text
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName print top spaces
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName text
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName io exception