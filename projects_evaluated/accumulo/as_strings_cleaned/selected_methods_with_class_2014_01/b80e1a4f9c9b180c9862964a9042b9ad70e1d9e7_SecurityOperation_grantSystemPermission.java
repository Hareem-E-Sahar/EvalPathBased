t credentials SimpleName SimpleType SingleVariableDeclaration SimpleName credentials
string SimpleName SimpleType SingleVariableDeclaration SimpleName user
system permission SimpleName SimpleType SingleVariableDeclaration SimpleName permission by id
can grant system SimpleName MethodInvocation SimpleName credentials
can grant system SimpleName MethodInvocation SimpleName user
can grant system SimpleName MethodInvocation SimpleName permission by id
credentials SimpleName MethodInvocation SimpleName user
credentials SimpleName MethodInvocation SimpleName permission by id
user SimpleName MethodInvocation SimpleName permission by id
credentials SimpleName MethodInvocation SimpleName get principal
thrift security exception SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName credentials
thrift security exception SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get principal
thrift security exception SimpleName SimpleType ClassInstanceCreation QualifiedName security error codepermission denied
credentials SimpleName MethodInvocation ClassInstanceCreation QualifiedName security error codepermission denied
get principal SimpleName MethodInvocation ClassInstanceCreation QualifiedName security error codepermission denied
target user exists SimpleName MethodInvocation SimpleName user
perm handle SimpleName MethodInvocation SimpleName grant system permission
perm handle SimpleName MethodInvocation SimpleName user
perm handle SimpleName MethodInvocation SimpleName permission by id
grant system permission SimpleName MethodInvocation SimpleName user
grant system permission SimpleName MethodInvocation SimpleName permission by id
user SimpleName MethodInvocation SimpleName permission by id
credentials SimpleName MethodInvocation SimpleName get principal
granted system permission StringLiteral InfixExpression SimpleName permission by id
granted system permission StringLiteral InfixExpression StringLiteral for user
granted system permission StringLiteral InfixExpression SimpleName user
granted system permission StringLiteral InfixExpression StringLiteral at the request of user
granted system permission StringLiteral InfixExpression MethodInvocation SimpleName credentials
granted system permission StringLiteral InfixExpression MethodInvocation SimpleName get principal
permission by id SimpleName InfixExpression StringLiteral for user
permission by id SimpleName InfixExpression SimpleName user
permission by id SimpleName InfixExpression StringLiteral at the request of user
permission by id SimpleName InfixExpression MethodInvocation SimpleName credentials
permission by id SimpleName InfixExpression MethodInvocation SimpleName get principal
for user StringLiteral InfixExpression SimpleName user
for user StringLiteral InfixExpression StringLiteral at the request of user
for user StringLiteral InfixExpression MethodInvocation SimpleName credentials
for user StringLiteral InfixExpression MethodInvocation SimpleName get principal
user SimpleName InfixExpression StringLiteral at the request of user
user SimpleName InfixExpression MethodInvocation SimpleName credentials
user SimpleName InfixExpression MethodInvocation SimpleName get principal
at the request of user StringLiteral InfixExpression MethodInvocation SimpleName credentials
at the request of user StringLiteral InfixExpression MethodInvocation SimpleName get principal
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation InfixExpression StringLiteral granted system permission
log SimpleName MethodInvocation InfixExpression SimpleName permission by id
log SimpleName MethodInvocation InfixExpression StringLiteral for user
log SimpleName MethodInvocation InfixExpression SimpleName user
log SimpleName MethodInvocation InfixExpression StringLiteral at the request of user
log SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName credentials
log SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get principal
info SimpleName MethodInvocation InfixExpression StringLiteral granted system permission
info SimpleName MethodInvocation InfixExpression SimpleName permission by id
info SimpleName MethodInvocation InfixExpression StringLiteral for user
info SimpleName MethodInvocation InfixExpression SimpleName user
info SimpleName MethodInvocation InfixExpression StringLiteral at the request of user
info SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName credentials
info SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get principal
accumulo security exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
e SimpleName MethodInvocation SimpleName as thrift exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName grant system permission
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName t credentials
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName credentials
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName user
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName system permission
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName permission by id
void PrimitiveType MethodDeclaration SimpleName grant system permission
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName t credentials
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName credentials
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName user
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName system permission
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName permission by id
void PrimitiveType MethodDeclaration SimpleType SimpleName thrift security exception
grant system permission SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName t credentials
grant system permission SimpleName MethodDeclaration SingleVariableDeclaration SimpleName credentials
grant system permission SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
grant system permission SimpleName MethodDeclaration SingleVariableDeclaration SimpleName user
grant system permission SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName system permission
grant system permission SimpleName MethodDeclaration SingleVariableDeclaration SimpleName permission by id
grant system permission SimpleName MethodDeclaration SimpleType SimpleName thrift security exception
credentials SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName user
credentials SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName permission by id
credentials SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName thrift security exception
user SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName permission by id
user SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName thrift security exception
permission by id SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName thrift security exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName grant system permission
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName credentials
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName user
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName permission by id
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName thrift security exception
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName grant system permission
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName credentials
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName user
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName permission by id
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName thrift security exception
