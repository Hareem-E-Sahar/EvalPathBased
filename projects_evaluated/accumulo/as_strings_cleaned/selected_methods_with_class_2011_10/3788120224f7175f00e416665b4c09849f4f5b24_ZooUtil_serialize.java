string SimpleName SimpleType SingleVariableDeclaration SimpleName root
root SimpleName MethodInvocation SimpleName length
path SimpleName MethodInvocation SimpleName substring
path SimpleName MethodInvocation MethodInvocation SimpleName root
path SimpleName MethodInvocation MethodInvocation SimpleName length
substring SimpleName MethodInvocation MethodInvocation SimpleName root
substring SimpleName MethodInvocation MethodInvocation SimpleName length
long SimpleName MethodInvocation SimpleName to hex string
long SimpleName MethodInvocation SimpleName eid
to hex string SimpleName MethodInvocation SimpleName eid
path SimpleName MethodInvocation InfixExpression StringLiteral /
substring SimpleName MethodInvocation InfixExpression StringLiteral /
root SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral /
length SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral /
path SimpleName MethodInvocation InfixExpression SimpleName node
substring SimpleName MethodInvocation InfixExpression SimpleName node
root SimpleName MethodInvocation MethodInvocation InfixExpression SimpleName node
length SimpleName MethodInvocation MethodInvocation InfixExpression SimpleName node
path SimpleName MethodInvocation InfixExpression StringLiteral $
substring SimpleName MethodInvocation InfixExpression StringLiteral $
root SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral $
length SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral $
path SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName long
path SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName to hex string
path SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName eid
substring SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName long
substring SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName to hex string
substring SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName eid
/ StringLiteral InfixExpression SimpleName node
/ StringLiteral InfixExpression StringLiteral $
/ StringLiteral InfixExpression MethodInvocation SimpleName long
/ StringLiteral InfixExpression MethodInvocation SimpleName to hex string
/ StringLiteral InfixExpression MethodInvocation SimpleName eid
node SimpleName InfixExpression StringLiteral $
node SimpleName InfixExpression MethodInvocation SimpleName long
node SimpleName InfixExpression MethodInvocation SimpleName to hex string
node SimpleName InfixExpression MethodInvocation SimpleName eid
$ StringLiteral InfixExpression MethodInvocation SimpleName long
$ StringLiteral InfixExpression MethodInvocation SimpleName to hex string
$ StringLiteral InfixExpression MethodInvocation SimpleName eid
public Modifier MethodDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SimpleName serialize
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName root
string SimpleName SimpleType MethodDeclaration SimpleName serialize
string SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName root
serialize SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
serialize SimpleName MethodDeclaration SingleVariableDeclaration SimpleName root
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName string
public Modifier TypeDeclaration MethodDeclaration SimpleName serialize
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName root
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName string
test SimpleName TypeDeclaration MethodDeclaration SimpleName serialize
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName root