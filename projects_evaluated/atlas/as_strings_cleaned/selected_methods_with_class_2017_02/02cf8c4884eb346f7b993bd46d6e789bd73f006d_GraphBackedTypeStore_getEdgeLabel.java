string SimpleName SimpleType SingleVariableDeclaration SimpleName parent
string SimpleName SimpleType SingleVariableDeclaration SimpleName child
property prefix SimpleName InfixExpression StringLiteral edge
property prefix SimpleName InfixExpression SimpleName parent
property prefix SimpleName InfixExpression StringLiteral .
property prefix SimpleName InfixExpression SimpleName child
edge StringLiteral InfixExpression SimpleName parent
edge StringLiteral InfixExpression StringLiteral .
edge StringLiteral InfixExpression SimpleName child
parent SimpleName InfixExpression StringLiteral .
parent SimpleName InfixExpression SimpleName child
. StringLiteral InfixExpression SimpleName child
static Modifier MethodDeclaration SimpleType SimpleName string
static Modifier MethodDeclaration SimpleName get edge label
static Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName parent
static Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName child
string SimpleName SimpleType MethodDeclaration SimpleName get edge label
string SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName parent
string SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName child
get edge label SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
get edge label SimpleName MethodDeclaration SingleVariableDeclaration SimpleName parent
get edge label SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
get edge label SimpleName MethodDeclaration SingleVariableDeclaration SimpleName child
parent SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName child
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier static
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName string
public Modifier TypeDeclaration MethodDeclaration SimpleName get edge label
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName parent
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName child
test SimpleName TypeDeclaration MethodDeclaration Modifier static
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName string
test SimpleName TypeDeclaration MethodDeclaration SimpleName get edge label
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName parent
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName child
