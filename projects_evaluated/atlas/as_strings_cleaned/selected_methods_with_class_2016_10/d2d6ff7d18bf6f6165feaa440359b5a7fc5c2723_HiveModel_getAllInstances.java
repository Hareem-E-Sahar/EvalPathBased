list SimpleName SimpleType ParameterizedType SimpleType SimpleName class instance
list SimpleName SimpleType ParameterizedType SimpleType SimpleName class instance
col defs SimpleName MethodInvocation SimpleName size
col defs SimpleName MethodInvocation InfixExpression NumberLiteral empty
size SimpleName MethodInvocation InfixExpression NumberLiteral empty
array list SimpleName SimpleType ClassInstanceCreation InfixExpression NumberLiteral empty
result SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName array list
result SimpleName VariableDeclarationFragment ClassInstanceCreation InfixExpression NumberLiteral empty
result SimpleName MethodInvocation SimpleName add
result SimpleName MethodInvocation SimpleName sd
add SimpleName MethodInvocation SimpleName sd
result SimpleName MethodInvocation SimpleName add all
result SimpleName MethodInvocation SimpleName col defs
add all SimpleName MethodInvocation SimpleName col defs
result SimpleName MethodInvocation SimpleName add
override SimpleName MarkerAnnotation MethodDeclaration Modifier protected
override SimpleName MarkerAnnotation MethodDeclaration SimpleName get all instances
protected Modifier MethodDeclaration ParameterizedType SimpleType SimpleName list
protected Modifier MethodDeclaration ParameterizedType SimpleType SimpleName class instance
protected Modifier MethodDeclaration SimpleName get all instances
protected Modifier MethodDeclaration Block ReturnStatement SimpleName result
list SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName get all instances
class instance SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName get all instances
get all instances SimpleName MethodDeclaration Block ReturnStatement SimpleName result
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName override
public Modifier TypeDeclaration MethodDeclaration Modifier protected
public Modifier TypeDeclaration MethodDeclaration SimpleName get all instances
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName override
test SimpleName TypeDeclaration MethodDeclaration Modifier protected
test SimpleName TypeDeclaration MethodDeclaration SimpleName get all instances
