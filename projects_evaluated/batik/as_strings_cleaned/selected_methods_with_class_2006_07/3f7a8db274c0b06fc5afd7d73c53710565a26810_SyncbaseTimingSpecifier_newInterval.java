interval SimpleName SimpleType SingleVariableDeclaration SimpleName interval
trace SimpleName MethodInvocation SimpleName enter
trace SimpleName MethodInvocation StringLiteral new interval
trace SimpleName MethodInvocation ArrayCreation ArrayInitializer SimpleName interval
enter SimpleName MethodInvocation StringLiteral new interval
enter SimpleName MethodInvocation ArrayCreation ArrayInitializer SimpleName interval
new interval StringLiteral MethodInvocation ArrayCreation ArrayInitializer SimpleName interval
interval SimpleName MethodInvocation SimpleName get begin
interval SimpleName MethodInvocation SimpleName get end
sync begin SimpleName ConditionalExpression MethodInvocation SimpleName interval
sync begin SimpleName ConditionalExpression MethodInvocation SimpleName get begin
sync begin SimpleName ConditionalExpression MethodInvocation SimpleName interval
sync begin SimpleName ConditionalExpression MethodInvocation SimpleName get end
interval SimpleName MethodInvocation ConditionalExpression MethodInvocation SimpleName interval
interval SimpleName MethodInvocation ConditionalExpression MethodInvocation SimpleName get end
get begin SimpleName MethodInvocation ConditionalExpression MethodInvocation SimpleName interval
get begin SimpleName MethodInvocation ConditionalExpression MethodInvocation SimpleName get end
sync begin SimpleName ConditionalExpression ParenthesizedExpression InfixExpression SimpleName offset
instance time SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName offset
instance time SimpleName SimpleType ClassInstanceCreation SimpleName interval
instance time SimpleName SimpleType ClassInstanceCreation BooleanLiteral true
offset SimpleName InfixExpression ClassInstanceCreation SimpleName interval
offset SimpleName InfixExpression ClassInstanceCreation BooleanLiteral true
interval SimpleName ClassInstanceCreation BooleanLiteral true
instance SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName instance time
instance SimpleName VariableDeclarationFragment ClassInstanceCreation InfixExpression SimpleName offset
instance SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName interval
instance SimpleName VariableDeclarationFragment ClassInstanceCreation BooleanLiteral true
instance time SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName instance
instances SimpleName MethodInvocation SimpleName put
instances SimpleName MethodInvocation SimpleName interval
instances SimpleName MethodInvocation SimpleName instance
put SimpleName MethodInvocation SimpleName interval
put SimpleName MethodInvocation SimpleName instance
interval SimpleName MethodInvocation SimpleName instance
interval SimpleName MethodInvocation SimpleName add dependent
interval SimpleName MethodInvocation SimpleName instance
interval SimpleName MethodInvocation SimpleName sync begin
add dependent SimpleName MethodInvocation SimpleName instance
add dependent SimpleName MethodInvocation SimpleName sync begin
instance SimpleName MethodInvocation SimpleName sync begin
owner SimpleName MethodInvocation SimpleName add instance time
owner SimpleName MethodInvocation SimpleName instance
owner SimpleName MethodInvocation SimpleName is begin
add instance time SimpleName MethodInvocation SimpleName instance
add instance time SimpleName MethodInvocation SimpleName is begin
instance SimpleName MethodInvocation SimpleName is begin
trace SimpleName MethodInvocation SimpleName exit
void PrimitiveType MethodDeclaration SimpleName new interval
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName interval
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName interval
new interval SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName interval
new interval SimpleName MethodDeclaration SingleVariableDeclaration SimpleName interval
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName new interval
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName interval
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName new interval
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName interval