node SimpleName SimpleType SingleVariableDeclaration SimpleName root
string SimpleName SimpleType ArrayType SingleVariableDeclaration SimpleName path
int PrimitiveType SingleVariableDeclaration SimpleName depth
depth SimpleName InfixExpression QualifiedName pathlength
depth SimpleName InfixExpression IfStatement ReturnStatement SimpleName root
pathlength QualifiedName InfixExpression IfStatement ReturnStatement SimpleName root
path SimpleName ArrayAccess SimpleName depth
root SimpleName MethodInvocation SimpleName find
root SimpleName MethodInvocation ArrayAccess SimpleName path
root SimpleName MethodInvocation ArrayAccess SimpleName depth
find SimpleName MethodInvocation ArrayAccess SimpleName path
find SimpleName MethodInvocation ArrayAccess SimpleName depth
child SimpleName VariableDeclarationFragment MethodInvocation SimpleName root
child SimpleName VariableDeclarationFragment MethodInvocation SimpleName find
child SimpleName VariableDeclarationFragment MethodInvocation ArrayAccess SimpleName path
child SimpleName VariableDeclarationFragment MethodInvocation ArrayAccess SimpleName depth
node SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName child
depth SimpleName InfixExpression NumberLiteral empty
recurse SimpleName MethodInvocation SimpleName child
recurse SimpleName MethodInvocation SimpleName path
recurse SimpleName MethodInvocation InfixExpression SimpleName depth
recurse SimpleName MethodInvocation InfixExpression NumberLiteral empty
child SimpleName MethodInvocation SimpleName path
child SimpleName MethodInvocation InfixExpression SimpleName depth
child SimpleName MethodInvocation InfixExpression NumberLiteral empty
path SimpleName MethodInvocation InfixExpression SimpleName depth
path SimpleName MethodInvocation InfixExpression NumberLiteral empty
private Modifier MethodDeclaration SimpleType SimpleName node
private Modifier MethodDeclaration SimpleName recurse
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName node
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName root
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName path
private Modifier MethodDeclaration SingleVariableDeclaration PrimitiveType int
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName depth
node SimpleName SimpleType MethodDeclaration SimpleName recurse
node SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName root
node SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName path
node SimpleName SimpleType MethodDeclaration SingleVariableDeclaration PrimitiveType int
node SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName depth
recurse SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName node
recurse SimpleName MethodDeclaration SingleVariableDeclaration SimpleName root
recurse SimpleName MethodDeclaration SingleVariableDeclaration SimpleName path
recurse SimpleName MethodDeclaration SingleVariableDeclaration PrimitiveType int
recurse SimpleName MethodDeclaration SingleVariableDeclaration SimpleName depth
root SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName path
root SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
root SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName depth
path SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
path SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName depth
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName node
public Modifier TypeDeclaration MethodDeclaration SimpleName recurse
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName root
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName path
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName depth
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName node
test SimpleName TypeDeclaration MethodDeclaration SimpleName recurse
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName root
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName path
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName depth
