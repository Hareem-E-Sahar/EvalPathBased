string SimpleName SimpleType SingleVariableDeclaration SimpleName type
list SimpleName SimpleType ParameterizedType SimpleType SimpleName string
list SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName list
string SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName list
list SimpleName MethodInvocation SimpleName size
list SimpleName MethodInvocation InfixExpression NumberLiteral empty
size SimpleName MethodInvocation InfixExpression NumberLiteral empty
list SimpleName InfixExpression InfixExpression InfixExpression NumberLiteral empty
entities SimpleName MethodInvocation SimpleName put
entities SimpleName MethodInvocation SimpleName type
entities SimpleName MethodInvocation SimpleName list
put SimpleName MethodInvocation SimpleName type
put SimpleName MethodInvocation SimpleName list
type SimpleName MethodInvocation SimpleName list
private Modifier MethodDeclaration PrimitiveType void
private Modifier MethodDeclaration SimpleName add
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName type
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName list
void PrimitiveType MethodDeclaration SimpleName add
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName type
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName list
add SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
add SimpleName MethodDeclaration SingleVariableDeclaration SimpleName type
add SimpleName MethodDeclaration SingleVariableDeclaration SimpleName list
type SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName list
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName add
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName type
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName list
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName add
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName type
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName list