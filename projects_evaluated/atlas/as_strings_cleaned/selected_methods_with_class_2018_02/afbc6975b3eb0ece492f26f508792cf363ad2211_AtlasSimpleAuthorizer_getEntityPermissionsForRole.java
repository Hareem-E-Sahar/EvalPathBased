list SimpleName SimpleType ParameterizedType SimpleType SimpleName atlas entity permission
string SimpleName SimpleType SingleVariableDeclaration SimpleName role name
list SimpleName SimpleType ParameterizedType SimpleType SimpleName atlas entity permission
authz policy SimpleName InfixExpression InfixExpression InfixExpression SimpleName role name
authz policy SimpleName MethodInvocation SimpleName get roles
authz policy SimpleName MethodInvocation MethodInvocation SimpleName get
get roles SimpleName MethodInvocation MethodInvocation SimpleName get
authz policy SimpleName MethodInvocation MethodInvocation SimpleName role name
get roles SimpleName MethodInvocation MethodInvocation SimpleName role name
get SimpleName MethodInvocation SimpleName role name
role SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName authz policy
role SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get roles
role SimpleName VariableDeclarationFragment MethodInvocation SimpleName get
role SimpleName VariableDeclarationFragment MethodInvocation SimpleName role name
atlas authz role SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName role
role SimpleName MethodInvocation SimpleName get entity permissions
role SimpleName InfixExpression ConditionalExpression MethodInvocation SimpleName role
role SimpleName InfixExpression ConditionalExpression MethodInvocation SimpleName get entity permissions
ret SimpleName Assignment ConditionalExpression InfixExpression SimpleName role
ret SimpleName Assignment ConditionalExpression MethodInvocation SimpleName role
ret SimpleName Assignment ConditionalExpression MethodInvocation SimpleName get entity permissions
private Modifier MethodDeclaration ParameterizedType SimpleType SimpleName list
private Modifier MethodDeclaration ParameterizedType SimpleType SimpleName atlas entity permission
private Modifier MethodDeclaration SimpleName get entity permissions for role
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName role name
private Modifier MethodDeclaration Block ReturnStatement SimpleName ret
list SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName get entity permissions for role
atlas entity permission SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName get entity permissions for role
get entity permissions for role SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
get entity permissions for role SimpleName MethodDeclaration SingleVariableDeclaration SimpleName role name
get entity permissions for role SimpleName MethodDeclaration Block ReturnStatement SimpleName ret
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration SimpleName get entity permissions for role
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName role name
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration SimpleName get entity permissions for role
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName role name