matrixlength QualifiedName InfixExpression NumberLiteral empty
tmp SimpleName VariableDeclarationFragment ArrayCreation InfixExpression QualifiedName matrixlength
tmp SimpleName VariableDeclarationFragment ArrayCreation InfixExpression NumberLiteral empty
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression QualifiedName matrixlength
tmp SimpleName ArrayAccess SimpleName i
matrix SimpleName ArrayAccess SimpleName i
tmp SimpleName ArrayAccess Assignment ArrayAccess SimpleName matrix
tmp SimpleName ArrayAccess Assignment ArrayAccess SimpleName i
i SimpleName ArrayAccess Assignment ArrayAccess SimpleName matrix
i SimpleName ArrayAccess Assignment ArrayAccess SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression QualifiedName matrixlength
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
matrixlength QualifiedName InfixExpression ForStatement PostfixExpression SimpleName i
tmplength QualifiedName InfixExpression NumberLiteral empty
tmp SimpleName ArrayAccess InfixExpression QualifiedName tmplength
tmp SimpleName ArrayAccess InfixExpression NumberLiteral empty
bloom filter SimpleName SimpleType ClassInstanceCreation SimpleName vector size
bloom filter SimpleName SimpleType ClassInstanceCreation SimpleName nb hash
bloom filter SimpleName SimpleType ClassInstanceCreation SimpleName hash type
vector size SimpleName ClassInstanceCreation SimpleName nb hash
vector size SimpleName ClassInstanceCreation SimpleName hash type
nb hash SimpleName ClassInstanceCreation SimpleName hash type
tmp SimpleName ArrayAccess Assignment ClassInstanceCreation SimpleName vector size
tmp SimpleName ArrayAccess Assignment ClassInstanceCreation SimpleName nb hash
tmp SimpleName ArrayAccess Assignment ClassInstanceCreation SimpleName hash type
matrix SimpleName Assignment SimpleName tmp
private Modifier MethodDeclaration PrimitiveType void
private Modifier MethodDeclaration SimpleName add row
void PrimitiveType MethodDeclaration SimpleName add row
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName add row
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName add row