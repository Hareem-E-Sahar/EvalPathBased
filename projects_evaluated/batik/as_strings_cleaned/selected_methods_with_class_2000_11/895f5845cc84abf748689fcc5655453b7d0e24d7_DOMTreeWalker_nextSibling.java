node SimpleName SimpleType SingleVariableDeclaration SimpleName n
n SimpleName InfixExpression SimpleName root
n SimpleName MethodInvocation SimpleName get next sibling
result SimpleName VariableDeclarationFragment MethodInvocation SimpleName n
result SimpleName VariableDeclarationFragment MethodInvocation SimpleName get next sibling
node SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName result
n SimpleName MethodInvocation SimpleName get parent node
result SimpleName Assignment MethodInvocation SimpleName n
result SimpleName Assignment MethodInvocation SimpleName get parent node
result SimpleName InfixExpression SimpleName root
result SimpleName InfixExpression InfixExpression InfixExpression SimpleName result
result SimpleName InfixExpression InfixExpression InfixExpression SimpleName root
accept node SimpleName MethodInvocation SimpleName result
accept node SimpleName MethodInvocation InfixExpression QualifiedName node filterfilter skip
result SimpleName MethodInvocation InfixExpression QualifiedName node filterfilter skip
next sibling SimpleName MethodInvocation SimpleName result
accept node SimpleName MethodInvocation SimpleName result
first child SimpleName MethodInvocation SimpleName result
t SimpleName VariableDeclarationFragment MethodInvocation SimpleName first child
t SimpleName VariableDeclarationFragment MethodInvocation SimpleName result
node SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName t
next sibling SimpleName MethodInvocation SimpleName result
accept node SimpleName MethodInvocation SwitchStatement SwitchCase QualifiedName node filterfilter accept
result SimpleName MethodInvocation SwitchStatement SwitchCase QualifiedName node filterfilter accept
accept node SimpleName MethodInvocation SwitchStatement ReturnStatement SimpleName result
result SimpleName MethodInvocation SwitchStatement ReturnStatement SimpleName result
accept node SimpleName MethodInvocation SwitchStatement SwitchCase QualifiedName node filterfilter skip
result SimpleName MethodInvocation SwitchStatement SwitchCase QualifiedName node filterfilter skip
node filterfilter accept QualifiedName SwitchCase SwitchStatement ReturnStatement SimpleName result
node filterfilter accept QualifiedName SwitchCase SwitchStatement SwitchCase QualifiedName node filterfilter skip
result SimpleName ReturnStatement SwitchStatement SwitchCase QualifiedName node filterfilter skip
protected Modifier MethodDeclaration SimpleType SimpleName node
protected Modifier MethodDeclaration SimpleName next sibling
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName node
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleName n
node SimpleName SimpleType MethodDeclaration SimpleName next sibling
node SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName n
next sibling SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName node
next sibling SimpleName MethodDeclaration SingleVariableDeclaration SimpleName n
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier protected
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName node
public Modifier TypeDeclaration MethodDeclaration SimpleName next sibling
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName n
test SimpleName TypeDeclaration MethodDeclaration Modifier protected
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName node
test SimpleName TypeDeclaration MethodDeclaration SimpleName next sibling
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName n
