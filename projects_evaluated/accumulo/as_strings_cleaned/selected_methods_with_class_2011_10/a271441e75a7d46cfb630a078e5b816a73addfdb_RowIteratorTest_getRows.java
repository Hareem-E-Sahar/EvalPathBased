entry SimpleName SimpleType ParameterizedType SimpleType SimpleName key
entry SimpleName SimpleType ParameterizedType SimpleType SimpleName value
key SimpleName SimpleType ParameterizedType SimpleType SimpleName value
entry SimpleName SimpleType ParameterizedType SimpleType SimpleName key
entry SimpleName SimpleType ParameterizedType SimpleType SimpleName value
key SimpleName SimpleType ParameterizedType SimpleType SimpleName value
iterator SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName iter
entry SimpleName SimpleType ParameterizedType SimpleType SimpleName key
entry SimpleName SimpleType ParameterizedType SimpleType SimpleName value
key SimpleName SimpleType ParameterizedType SimpleType SimpleName value
entry SimpleName SimpleType ParameterizedType SimpleType SimpleName key
entry SimpleName SimpleType ParameterizedType SimpleType SimpleName value
key SimpleName SimpleType ParameterizedType SimpleType SimpleName value
row iterator SimpleName SimpleType ClassInstanceCreation SimpleName iter
riter SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName row iterator
riter SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName iter
row iterator SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName riter
riter SimpleName MethodInvocation SimpleName has next
entry SimpleName SimpleType ParameterizedType SimpleType SimpleName key
entry SimpleName SimpleType ParameterizedType SimpleType SimpleName value
key SimpleName SimpleType ParameterizedType SimpleType SimpleName value
riter SimpleName MethodInvocation SimpleName next
row SimpleName VariableDeclarationFragment MethodInvocation SimpleName riter
row SimpleName VariableDeclarationFragment MethodInvocation SimpleName next
entry SimpleName SimpleType ParameterizedType SimpleType SimpleName key
entry SimpleName SimpleType ParameterizedType SimpleType SimpleName value
key SimpleName SimpleType ParameterizedType SimpleType SimpleName value
entry SimpleName SimpleType ParameterizedType SimpleType SimpleName key
entry SimpleName SimpleType ParameterizedType SimpleType SimpleName value
key SimpleName SimpleType ParameterizedType SimpleType SimpleName value
row SimpleName MethodInvocation SimpleName has next
row SimpleName MethodInvocation SimpleName next
rlist SimpleName MethodInvocation SimpleName add
rlist SimpleName MethodInvocation MethodInvocation SimpleName row
rlist SimpleName MethodInvocation MethodInvocation SimpleName next
add SimpleName MethodInvocation MethodInvocation SimpleName row
add SimpleName MethodInvocation MethodInvocation SimpleName next
result SimpleName MethodInvocation SimpleName add
result SimpleName MethodInvocation SimpleName rlist
add SimpleName MethodInvocation SimpleName rlist
list SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName get rows
get rows SimpleName MethodDeclaration SingleVariableDeclaration SimpleName iter
get rows SimpleName MethodDeclaration Block ReturnStatement SimpleName result
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration SimpleName get rows
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName iter
test SimpleName TypeDeclaration MethodDeclaration SimpleName get rows
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName iter
