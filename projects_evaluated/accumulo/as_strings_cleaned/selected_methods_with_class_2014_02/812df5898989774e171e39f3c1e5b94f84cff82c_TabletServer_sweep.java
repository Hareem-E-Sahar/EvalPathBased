long PrimitiveType SingleVariableDeclaration SimpleName max idle
array list SimpleName SimpleType ParameterizedType SimpleType SimpleName session
array list SimpleName SimpleType ParameterizedType SimpleType SimpleName session
iterator SimpleName SimpleType ParameterizedType SimpleType SimpleName session
sessions SimpleName MethodInvocation SimpleName values
sessions SimpleName MethodInvocation MethodInvocation SimpleName iterator
values SimpleName MethodInvocation MethodInvocation SimpleName iterator
iter SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName sessions
iter SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName values
iter SimpleName VariableDeclarationFragment MethodInvocation SimpleName iterator
iter SimpleName MethodInvocation SimpleName has next
iter SimpleName MethodInvocation SimpleName next
session SimpleName VariableDeclarationFragment MethodInvocation SimpleName iter
session SimpleName VariableDeclarationFragment MethodInvocation SimpleName next
session SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName session
system SimpleName MethodInvocation SimpleName current time millis
system SimpleName MethodInvocation InfixExpression QualifiedName sessionlast access time
current time millis SimpleName MethodInvocation InfixExpression QualifiedName sessionlast access time
idle time SimpleName VariableDeclarationFragment InfixExpression MethodInvocation SimpleName system
idle time SimpleName VariableDeclarationFragment InfixExpression MethodInvocation SimpleName current time millis
idle time SimpleName VariableDeclarationFragment InfixExpression QualifiedName sessionlast access time
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName idle time
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment InfixExpression QualifiedName sessionlast access time
idle time SimpleName InfixExpression SimpleName max idle
idle time SimpleName InfixExpression InfixExpression PrefixExpression QualifiedName sessionreserved
max idle SimpleName InfixExpression InfixExpression PrefixExpression QualifiedName sessionreserved
iter SimpleName MethodInvocation SimpleName remove
sessions to cleanup SimpleName MethodInvocation SimpleName add
sessions to cleanup SimpleName MethodInvocation SimpleName session
add SimpleName MethodInvocation SimpleName session
session SimpleName SimpleType SingleVariableDeclaration SimpleName session
session SimpleName MethodInvocation SimpleName cleanup
session SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName sessions to cleanup
session SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName sessions to cleanup
private Modifier MethodDeclaration PrimitiveType void
private Modifier MethodDeclaration SimpleName sweep
private Modifier MethodDeclaration SingleVariableDeclaration PrimitiveType long
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName max idle
private Modifier MethodDeclaration Block EnhancedForStatement SimpleName sessions to cleanup
void PrimitiveType MethodDeclaration SimpleName sweep
void PrimitiveType MethodDeclaration SingleVariableDeclaration PrimitiveType long
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName max idle
void PrimitiveType MethodDeclaration Block EnhancedForStatement SimpleName sessions to cleanup
sweep SimpleName MethodDeclaration SingleVariableDeclaration PrimitiveType long
sweep SimpleName MethodDeclaration SingleVariableDeclaration SimpleName max idle
sweep SimpleName MethodDeclaration Block EnhancedForStatement SimpleName sessions to cleanup
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName sweep
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType long
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName max idle
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName sweep
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType long
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName max idle