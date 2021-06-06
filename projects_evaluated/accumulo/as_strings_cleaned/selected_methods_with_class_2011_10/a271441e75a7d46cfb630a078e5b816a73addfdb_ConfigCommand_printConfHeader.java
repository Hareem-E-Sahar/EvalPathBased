array list SimpleName SimpleType ParameterizedType SimpleType SimpleName string
array list SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName output
string SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName output
print conf footer SimpleName MethodInvocation SimpleName output
%- StringLiteral InfixExpression SimpleName col
%- StringLiteral InfixExpression StringLiteral s %-
%- StringLiteral InfixExpression SimpleName col
%- StringLiteral InfixExpression StringLiteral s s
col SimpleName InfixExpression StringLiteral s %-
col SimpleName InfixExpression SimpleName col
col SimpleName InfixExpression StringLiteral s s
s %- StringLiteral InfixExpression SimpleName col
s %- StringLiteral InfixExpression StringLiteral s s
col SimpleName InfixExpression StringLiteral s s
string SimpleName MethodInvocation SimpleName format
string SimpleName MethodInvocation InfixExpression StringLiteral %-
string SimpleName MethodInvocation InfixExpression SimpleName col
string SimpleName MethodInvocation InfixExpression StringLiteral s %-
string SimpleName MethodInvocation InfixExpression SimpleName col
string SimpleName MethodInvocation InfixExpression StringLiteral s s
string SimpleName MethodInvocation StringLiteral scope
string SimpleName MethodInvocation StringLiteral name
string SimpleName MethodInvocation StringLiteral value
format SimpleName MethodInvocation InfixExpression StringLiteral %-
format SimpleName MethodInvocation InfixExpression SimpleName col
format SimpleName MethodInvocation InfixExpression StringLiteral s %-
format SimpleName MethodInvocation InfixExpression SimpleName col
format SimpleName MethodInvocation InfixExpression StringLiteral s s
format SimpleName MethodInvocation StringLiteral scope
format SimpleName MethodInvocation StringLiteral name
format SimpleName MethodInvocation StringLiteral value
%- StringLiteral InfixExpression MethodInvocation StringLiteral scope
col SimpleName InfixExpression MethodInvocation StringLiteral scope
s %- StringLiteral InfixExpression MethodInvocation StringLiteral scope
col SimpleName InfixExpression MethodInvocation StringLiteral scope
s s StringLiteral InfixExpression MethodInvocation StringLiteral scope
%- StringLiteral InfixExpression MethodInvocation StringLiteral name
col SimpleName InfixExpression MethodInvocation StringLiteral name
s %- StringLiteral InfixExpression MethodInvocation StringLiteral name
col SimpleName InfixExpression MethodInvocation StringLiteral name
s s StringLiteral InfixExpression MethodInvocation StringLiteral name
%- StringLiteral InfixExpression MethodInvocation StringLiteral value
col SimpleName InfixExpression MethodInvocation StringLiteral value
s %- StringLiteral InfixExpression MethodInvocation StringLiteral value
col SimpleName InfixExpression MethodInvocation StringLiteral value
s s StringLiteral InfixExpression MethodInvocation StringLiteral value
scope StringLiteral MethodInvocation StringLiteral name
scope StringLiteral MethodInvocation StringLiteral value
name StringLiteral MethodInvocation StringLiteral value
output SimpleName MethodInvocation SimpleName add
output SimpleName MethodInvocation MethodInvocation SimpleName string
output SimpleName MethodInvocation MethodInvocation SimpleName format
output SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral %-
output SimpleName MethodInvocation MethodInvocation InfixExpression SimpleName col
output SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral s %-
output SimpleName MethodInvocation MethodInvocation InfixExpression SimpleName col
output SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral s s
output SimpleName MethodInvocation MethodInvocation StringLiteral scope
output SimpleName MethodInvocation MethodInvocation StringLiteral name
output SimpleName MethodInvocation MethodInvocation StringLiteral value
add SimpleName MethodInvocation MethodInvocation SimpleName string
add SimpleName MethodInvocation MethodInvocation SimpleName format
add SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral %-
add SimpleName MethodInvocation MethodInvocation InfixExpression SimpleName col
add SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral s %-
add SimpleName MethodInvocation MethodInvocation InfixExpression SimpleName col
add SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral s s
add SimpleName MethodInvocation MethodInvocation StringLiteral scope
add SimpleName MethodInvocation MethodInvocation StringLiteral name
add SimpleName MethodInvocation MethodInvocation StringLiteral value
print conf footer SimpleName MethodInvocation SimpleName output
private Modifier MethodDeclaration PrimitiveType void
private Modifier MethodDeclaration SimpleName print conf header
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName output
void PrimitiveType MethodDeclaration SimpleName print conf header
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName output
print conf header SimpleName MethodDeclaration SingleVariableDeclaration SimpleName output
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName print conf header
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName output
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName print conf header
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName output
