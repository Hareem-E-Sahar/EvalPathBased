graphics d SimpleName SimpleType SingleVariableDeclaration SimpleName g d
count SimpleName InfixExpression NumberLiteral empty
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression SimpleName count
halting thread SimpleName MethodInvocation SimpleName has been halted
children SimpleName ArrayAccess SimpleName i
node SimpleName VariableDeclarationFragment ArrayAccess SimpleName children
node SimpleName VariableDeclarationFragment ArrayAccess SimpleName i
graphics node SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName node
node SimpleName MethodInvocation SimpleName paint
node SimpleName MethodInvocation SimpleName g d
paint SimpleName MethodInvocation SimpleName g d
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName count
int PrimitiveType VariableDeclarationExpression ForStatement PrefixExpression SimpleName i
i SimpleName InfixExpression ForStatement PrefixExpression SimpleName i
count SimpleName InfixExpression ForStatement PrefixExpression SimpleName i
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName primitive paint
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName graphics d
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName g d
void PrimitiveType MethodDeclaration SimpleName primitive paint
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName graphics d
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName g d
primitive paint SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName graphics d
primitive paint SimpleName MethodDeclaration SingleVariableDeclaration SimpleName g d
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName primitive paint
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName g d
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName primitive paint
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName g d
