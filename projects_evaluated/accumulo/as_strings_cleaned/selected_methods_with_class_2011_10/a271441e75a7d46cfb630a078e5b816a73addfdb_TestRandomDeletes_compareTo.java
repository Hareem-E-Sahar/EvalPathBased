row column SimpleName SimpleType SingleVariableDeclaration SimpleName other
row SimpleName MethodInvocation SimpleName compare to
row SimpleName MethodInvocation QualifiedName otherrow
compare to SimpleName MethodInvocation QualifiedName otherrow
result SimpleName VariableDeclarationFragment MethodInvocation SimpleName row
result SimpleName VariableDeclarationFragment MethodInvocation SimpleName compare to
result SimpleName VariableDeclarationFragment MethodInvocation QualifiedName otherrow
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName result
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName row
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName compare to
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation QualifiedName otherrow
result SimpleName InfixExpression NumberLiteral empty
result SimpleName InfixExpression IfStatement ReturnStatement SimpleName result
empty NumberLiteral InfixExpression IfStatement ReturnStatement SimpleName result
column SimpleName MethodInvocation SimpleName compare to
column SimpleName MethodInvocation QualifiedName othercolumn
compare to SimpleName MethodInvocation QualifiedName othercolumn
public Modifier MethodDeclaration PrimitiveType int
public Modifier MethodDeclaration SimpleName compare to
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName row column
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName other
public Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
int PrimitiveType MethodDeclaration SimpleName compare to
int PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName row column
int PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName other
int PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
compare to SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName row column
compare to SimpleName MethodDeclaration SingleVariableDeclaration SimpleName other
compare to SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType int
public Modifier TypeDeclaration MethodDeclaration SimpleName compare to
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName other
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType int
test SimpleName TypeDeclaration MethodDeclaration SimpleName compare to
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName other