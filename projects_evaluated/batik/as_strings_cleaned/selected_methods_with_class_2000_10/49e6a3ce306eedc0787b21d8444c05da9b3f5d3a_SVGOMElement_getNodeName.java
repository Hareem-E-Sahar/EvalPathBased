prefix SimpleName MethodInvocation SimpleName equals
prefix SimpleName MethodInvocation StringLiteral empty
equals SimpleName MethodInvocation StringLiteral empty
prefix SimpleName InfixExpression InfixExpression MethodInvocation SimpleName prefix
prefix SimpleName InfixExpression InfixExpression MethodInvocation SimpleName equals
prefix SimpleName InfixExpression InfixExpression MethodInvocation StringLiteral empty
prefix SimpleName InfixExpression StringLiteral :
prefix SimpleName InfixExpression MethodInvocation SimpleName get local name
: StringLiteral InfixExpression MethodInvocation SimpleName get local name
get local name SimpleName MethodInvocation ConditionalExpression InfixExpression SimpleName prefix
get local name SimpleName MethodInvocation ConditionalExpression InfixExpression StringLiteral :
public Modifier MethodDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SimpleName get node name
string SimpleName SimpleType MethodDeclaration SimpleName get node name
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName string
public Modifier TypeDeclaration MethodDeclaration SimpleName get node name
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName string
test SimpleName TypeDeclaration MethodDeclaration SimpleName get node name