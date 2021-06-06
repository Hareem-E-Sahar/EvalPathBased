set SimpleName SimpleType ParameterizedType SimpleType SimpleName string
set SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName values
string SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName values
list SimpleName SimpleType ParameterizedType SimpleType SimpleName string
list SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName patterns
string SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName patterns
ret SimpleName VariableDeclarationFragment BooleanLiteral false
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName ret
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment BooleanLiteral false
collection utils SimpleName MethodInvocation SimpleName is empty
collection utils SimpleName MethodInvocation SimpleName values
is empty SimpleName MethodInvocation SimpleName values
ret SimpleName Assignment BooleanLiteral true
collection utils SimpleName MethodInvocation SimpleName is not empty
collection utils SimpleName MethodInvocation SimpleName patterns
is not empty SimpleName MethodInvocation SimpleName patterns
string SimpleName SimpleType SingleVariableDeclaration SimpleName value
is match SimpleName MethodInvocation SimpleName value
is match SimpleName MethodInvocation SimpleName patterns
value SimpleName MethodInvocation SimpleName patterns
ret SimpleName Assignment BooleanLiteral true
string SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName values
value SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName values
log SimpleName MethodInvocation SimpleName is debug enabled
ret SimpleName PrefixExpression InfixExpression MethodInvocation SimpleName log
ret SimpleName PrefixExpression InfixExpression MethodInvocation SimpleName is debug enabled
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral <== is match any {}): {}
log SimpleName MethodInvocation SimpleName values
log SimpleName MethodInvocation SimpleName patterns
log SimpleName MethodInvocation SimpleName ret
debug SimpleName MethodInvocation StringLiteral <== is match any {}): {}
debug SimpleName MethodInvocation SimpleName values
debug SimpleName MethodInvocation SimpleName patterns
debug SimpleName MethodInvocation SimpleName ret
<== is match any {}): {} StringLiteral MethodInvocation SimpleName values
<== is match any {}): {} StringLiteral MethodInvocation SimpleName patterns
<== is match any {}): {} StringLiteral MethodInvocation SimpleName ret
values SimpleName MethodInvocation SimpleName patterns
values SimpleName MethodInvocation SimpleName ret
patterns SimpleName MethodInvocation SimpleName ret
boolean PrimitiveType VariableDeclarationStatement Block ReturnStatement SimpleName ret
private Modifier MethodDeclaration PrimitiveType boolean
private Modifier MethodDeclaration SimpleName is match any
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName values
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName patterns
private Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType boolean
private Modifier MethodDeclaration Block ReturnStatement SimpleName ret
boolean PrimitiveType MethodDeclaration SimpleName is match any
boolean PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName values
boolean PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName patterns
boolean PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType boolean
boolean PrimitiveType MethodDeclaration Block ReturnStatement SimpleName ret
is match any SimpleName MethodDeclaration SingleVariableDeclaration SimpleName values
is match any SimpleName MethodDeclaration SingleVariableDeclaration SimpleName patterns
is match any SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType boolean
is match any SimpleName MethodDeclaration Block ReturnStatement SimpleName ret
values SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName patterns
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration PrimitiveType boolean
public Modifier TypeDeclaration MethodDeclaration SimpleName is match any
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName values
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName patterns
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType boolean
test SimpleName TypeDeclaration MethodDeclaration SimpleName is match any
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName values
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName patterns
