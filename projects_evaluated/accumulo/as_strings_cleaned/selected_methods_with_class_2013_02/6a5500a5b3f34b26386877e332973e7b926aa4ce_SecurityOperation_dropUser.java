credential SimpleName SimpleType SingleVariableDeclaration SimpleName credentials
string SimpleName SimpleType SingleVariableDeclaration SimpleName user
can drop user SimpleName MethodInvocation SimpleName credentials
can drop user SimpleName MethodInvocation SimpleName user
credentials SimpleName MethodInvocation SimpleName user
credentials SimpleName MethodInvocation SimpleName get principal
thrift security exception SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName credentials
thrift security exception SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get principal
thrift security exception SimpleName SimpleType ClassInstanceCreation QualifiedName security error codepermission denied
credentials SimpleName MethodInvocation ClassInstanceCreation QualifiedName security error codepermission denied
get principal SimpleName MethodInvocation ClassInstanceCreation QualifiedName security error codepermission denied
authorizor SimpleName MethodInvocation SimpleName drop user
authorizor SimpleName MethodInvocation SimpleName user
drop user SimpleName MethodInvocation SimpleName user
authenticator SimpleName MethodInvocation SimpleName drop user
authenticator SimpleName MethodInvocation SimpleName user
drop user SimpleName MethodInvocation SimpleName user
perm handle SimpleName MethodInvocation SimpleName clean user
perm handle SimpleName MethodInvocation SimpleName user
clean user SimpleName MethodInvocation SimpleName user
credentials SimpleName MethodInvocation SimpleName get principal
deleted user StringLiteral InfixExpression SimpleName user
deleted user StringLiteral InfixExpression StringLiteral at the request of user
deleted user StringLiteral InfixExpression MethodInvocation SimpleName credentials
deleted user StringLiteral InfixExpression MethodInvocation SimpleName get principal
user SimpleName InfixExpression StringLiteral at the request of user
user SimpleName InfixExpression MethodInvocation SimpleName credentials
user SimpleName InfixExpression MethodInvocation SimpleName get principal
at the request of user StringLiteral InfixExpression MethodInvocation SimpleName credentials
at the request of user StringLiteral InfixExpression MethodInvocation SimpleName get principal
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation InfixExpression StringLiteral deleted user
log SimpleName MethodInvocation InfixExpression SimpleName user
log SimpleName MethodInvocation InfixExpression StringLiteral at the request of user
log SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName credentials
log SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get principal
info SimpleName MethodInvocation InfixExpression StringLiteral deleted user
info SimpleName MethodInvocation InfixExpression SimpleName user
info SimpleName MethodInvocation InfixExpression StringLiteral at the request of user
info SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName credentials
info SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get principal
accumulo security exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
e SimpleName MethodInvocation SimpleName as thrift exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName drop user
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName credential
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName credentials
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName user
public Modifier MethodDeclaration SimpleType SimpleName thrift security exception
void PrimitiveType MethodDeclaration SimpleName drop user
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName credential
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName credentials
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName user
void PrimitiveType MethodDeclaration SimpleType SimpleName thrift security exception
drop user SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName credential
drop user SimpleName MethodDeclaration SingleVariableDeclaration SimpleName credentials
drop user SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
drop user SimpleName MethodDeclaration SingleVariableDeclaration SimpleName user
drop user SimpleName MethodDeclaration SimpleType SimpleName thrift security exception
credentials SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName user
credentials SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName thrift security exception
user SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName thrift security exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName drop user
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName credentials
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName user
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName thrift security exception
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName drop user
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName credentials
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName user
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName thrift security exception
