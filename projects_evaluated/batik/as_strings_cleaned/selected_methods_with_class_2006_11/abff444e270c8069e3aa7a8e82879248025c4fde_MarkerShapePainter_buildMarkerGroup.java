start marker SimpleName InfixExpression InfixExpression InfixExpression SimpleName start marker proxy
start marker proxy SimpleName Assignment MethodInvocation SimpleName build start marker proxy
middle marker SimpleName InfixExpression InfixExpression InfixExpression SimpleName middle marker proxies
middle marker proxies SimpleName Assignment MethodInvocation SimpleName build middle marker proxies
end marker SimpleName InfixExpression InfixExpression InfixExpression SimpleName end marker proxy
end marker proxy SimpleName Assignment MethodInvocation SimpleName build end marker proxy
group SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName composite graphics node
composite graphics node SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName group
group SimpleName MethodInvocation SimpleName get children
children SimpleName VariableDeclarationFragment MethodInvocation SimpleName group
children SimpleName VariableDeclarationFragment MethodInvocation SimpleName get children
list SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName children
children SimpleName MethodInvocation SimpleName add
children SimpleName MethodInvocation SimpleName start marker proxy
add SimpleName MethodInvocation SimpleName start marker proxy
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression QualifiedName middle marker proxieslength
middle marker proxies SimpleName ArrayAccess SimpleName i
children SimpleName MethodInvocation SimpleName add
children SimpleName MethodInvocation ArrayAccess SimpleName middle marker proxies
children SimpleName MethodInvocation ArrayAccess SimpleName i
add SimpleName MethodInvocation ArrayAccess SimpleName middle marker proxies
add SimpleName MethodInvocation ArrayAccess SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression QualifiedName middle marker proxieslength
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
middle marker proxieslength QualifiedName InfixExpression ForStatement PostfixExpression SimpleName i
children SimpleName MethodInvocation SimpleName add
children SimpleName MethodInvocation SimpleName end marker proxy
add SimpleName MethodInvocation SimpleName end marker proxy
marker group SimpleName Assignment SimpleName group
protected Modifier MethodDeclaration PrimitiveType void
protected Modifier MethodDeclaration SimpleName build marker group
void PrimitiveType MethodDeclaration SimpleName build marker group
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier protected
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName build marker group
test SimpleName TypeDeclaration MethodDeclaration Modifier protected
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName build marker group
