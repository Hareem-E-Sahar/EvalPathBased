auth info SimpleName SimpleType SingleVariableDeclaration SimpleName credentials
string SimpleName SimpleType SingleVariableDeclaration SimpleName user
system permission SimpleName SimpleType SingleVariableDeclaration SimpleName permission
has system permission SimpleName MethodInvocation SimpleName credentials
has system permission SimpleName MethodInvocation QualifiedName credentialsuser
has system permission SimpleName MethodInvocation QualifiedName system permissiongrant
credentials SimpleName MethodInvocation QualifiedName credentialsuser
credentials SimpleName MethodInvocation QualifiedName system permissiongrant
credentialsuser QualifiedName MethodInvocation QualifiedName system permissiongrant
accumulo security exception SimpleName SimpleType ClassInstanceCreation QualifiedName credentialsuser
accumulo security exception SimpleName SimpleType ClassInstanceCreation QualifiedName security error codepermission denied
credentialsuser QualifiedName ClassInstanceCreation QualifiedName security error codepermission denied
user SimpleName MethodInvocation SimpleName equals
user SimpleName MethodInvocation QualifiedName security constantssystem username
equals SimpleName MethodInvocation QualifiedName security constantssystem username
user SimpleName MethodInvocation SimpleName equals
user SimpleName MethodInvocation MethodInvocation SimpleName get root username
equals SimpleName MethodInvocation MethodInvocation SimpleName get root username
user SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName user
user SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName equals
equals SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName user
equals SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName equals
security constantssystem username QualifiedName MethodInvocation InfixExpression MethodInvocation SimpleName user
security constantssystem username QualifiedName MethodInvocation InfixExpression MethodInvocation SimpleName equals
accumulo security exception SimpleName SimpleType ClassInstanceCreation QualifiedName credentialsuser
accumulo security exception SimpleName SimpleType ClassInstanceCreation QualifiedName security error codepermission denied
credentialsuser QualifiedName ClassInstanceCreation QualifiedName security error codepermission denied
permission SimpleName MethodInvocation SimpleName equals
permission SimpleName MethodInvocation QualifiedName system permissiongrant
equals SimpleName MethodInvocation QualifiedName system permissiongrant
accumulo security exception SimpleName SimpleType ClassInstanceCreation QualifiedName credentialsuser
accumulo security exception SimpleName SimpleType ClassInstanceCreation QualifiedName security error codegrant invalid
credentialsuser QualifiedName ClassInstanceCreation QualifiedName security error codegrant invalid
user exists SimpleName MethodInvocation SimpleName user
set SimpleName SimpleType ParameterizedType SimpleType SimpleName system permission
zk user path SimpleName InfixExpression StringLiteral /
zk user path SimpleName InfixExpression SimpleName user
zk user path SimpleName InfixExpression SimpleName zk user sys perms
/ StringLiteral InfixExpression SimpleName user
/ StringLiteral InfixExpression SimpleName zk user sys perms
user SimpleName InfixExpression SimpleName zk user sys perms
zoo cache SimpleName MethodInvocation SimpleName get
zoo cache SimpleName MethodInvocation InfixExpression SimpleName zk user path
zoo cache SimpleName MethodInvocation InfixExpression StringLiteral /
zoo cache SimpleName MethodInvocation InfixExpression SimpleName user
zoo cache SimpleName MethodInvocation InfixExpression SimpleName zk user sys perms
get SimpleName MethodInvocation InfixExpression SimpleName zk user path
get SimpleName MethodInvocation InfixExpression StringLiteral /
get SimpleName MethodInvocation InfixExpression SimpleName user
get SimpleName MethodInvocation InfixExpression SimpleName zk user sys perms
tool SimpleName MethodInvocation SimpleName convert system permissions
tool SimpleName MethodInvocation MethodInvocation SimpleName zoo cache
tool SimpleName MethodInvocation MethodInvocation SimpleName get
tool SimpleName MethodInvocation MethodInvocation InfixExpression SimpleName zk user path
tool SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral /
tool SimpleName MethodInvocation MethodInvocation InfixExpression SimpleName user
tool SimpleName MethodInvocation MethodInvocation InfixExpression SimpleName zk user sys perms
convert system permissions SimpleName MethodInvocation MethodInvocation SimpleName zoo cache
convert system permissions SimpleName MethodInvocation MethodInvocation SimpleName get
convert system permissions SimpleName MethodInvocation MethodInvocation InfixExpression SimpleName zk user path
convert system permissions SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral /
convert system permissions SimpleName MethodInvocation MethodInvocation InfixExpression SimpleName user
convert system permissions SimpleName MethodInvocation MethodInvocation InfixExpression SimpleName zk user sys perms
sys perms SimpleName VariableDeclarationFragment MethodInvocation SimpleName tool
sys perms SimpleName VariableDeclarationFragment MethodInvocation SimpleName convert system permissions
sys perms SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName zoo cache
sys perms SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get
sys perms SimpleName MethodInvocation SimpleName remove
sys perms SimpleName MethodInvocation SimpleName permission
remove SimpleName MethodInvocation SimpleName permission
zoo cache SimpleName MethodInvocation SimpleName clear
zoo reader writer SimpleName MethodInvocation SimpleName get retrying instance
zk user path SimpleName InfixExpression StringLiteral /
zk user path SimpleName InfixExpression SimpleName user
zk user path SimpleName InfixExpression SimpleName zk user sys perms
/ StringLiteral InfixExpression SimpleName user
/ StringLiteral InfixExpression SimpleName zk user sys perms
user SimpleName InfixExpression SimpleName zk user sys perms
tool SimpleName MethodInvocation SimpleName convert system permissions
tool SimpleName MethodInvocation SimpleName sys perms
convert system permissions SimpleName MethodInvocation SimpleName sys perms
zoo reader writer SimpleName MethodInvocation MethodInvocation SimpleName put persistent data
get retrying instance SimpleName MethodInvocation MethodInvocation SimpleName put persistent data
zoo reader writer SimpleName MethodInvocation MethodInvocation InfixExpression SimpleName zk user path
zoo reader writer SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral /
zoo reader writer SimpleName MethodInvocation MethodInvocation InfixExpression SimpleName user
zoo reader writer SimpleName MethodInvocation MethodInvocation InfixExpression SimpleName zk user sys perms
get retrying instance SimpleName MethodInvocation MethodInvocation InfixExpression SimpleName zk user path
get retrying instance SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral /
get retrying instance SimpleName MethodInvocation MethodInvocation InfixExpression SimpleName user
get retrying instance SimpleName MethodInvocation MethodInvocation InfixExpression SimpleName zk user sys perms
zoo reader writer SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName tool
zoo reader writer SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName convert system permissions
zoo reader writer SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName sys perms
get retrying instance SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName tool
get retrying instance SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName convert system permissions
get retrying instance SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName sys perms
zoo reader writer SimpleName MethodInvocation MethodInvocation QualifiedName node exists policyoverwrite
get retrying instance SimpleName MethodInvocation MethodInvocation QualifiedName node exists policyoverwrite
put persistent data SimpleName MethodInvocation InfixExpression SimpleName zk user path
put persistent data SimpleName MethodInvocation InfixExpression StringLiteral /
put persistent data SimpleName MethodInvocation InfixExpression SimpleName user
put persistent data SimpleName MethodInvocation InfixExpression SimpleName zk user sys perms
put persistent data SimpleName MethodInvocation MethodInvocation SimpleName tool
put persistent data SimpleName MethodInvocation MethodInvocation SimpleName convert system permissions
put persistent data SimpleName MethodInvocation MethodInvocation SimpleName sys perms
put persistent data SimpleName MethodInvocation QualifiedName node exists policyoverwrite
zk user path SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName tool
zk user path SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName convert system permissions
zk user path SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName sys perms
/ StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName tool
/ StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName convert system permissions
/ StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName sys perms
user SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName tool
user SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName convert system permissions
user SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName sys perms
zk user sys perms SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName tool
zk user sys perms SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName convert system permissions
zk user sys perms SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName sys perms
zk user path SimpleName InfixExpression MethodInvocation QualifiedName node exists policyoverwrite
/ StringLiteral InfixExpression MethodInvocation QualifiedName node exists policyoverwrite
user SimpleName InfixExpression MethodInvocation QualifiedName node exists policyoverwrite
zk user sys perms SimpleName InfixExpression MethodInvocation QualifiedName node exists policyoverwrite
tool SimpleName MethodInvocation MethodInvocation QualifiedName node exists policyoverwrite
convert system permissions SimpleName MethodInvocation MethodInvocation QualifiedName node exists policyoverwrite
sys perms SimpleName MethodInvocation MethodInvocation QualifiedName node exists policyoverwrite
revoked system permission StringLiteral InfixExpression SimpleName permission
revoked system permission StringLiteral InfixExpression StringLiteral for user
revoked system permission StringLiteral InfixExpression SimpleName user
revoked system permission StringLiteral InfixExpression StringLiteral at the request of user
revoked system permission StringLiteral InfixExpression QualifiedName credentialsuser
permission SimpleName InfixExpression StringLiteral for user
permission SimpleName InfixExpression SimpleName user
permission SimpleName InfixExpression StringLiteral at the request of user
permission SimpleName InfixExpression QualifiedName credentialsuser
for user StringLiteral InfixExpression SimpleName user
for user StringLiteral InfixExpression StringLiteral at the request of user
for user StringLiteral InfixExpression QualifiedName credentialsuser
user SimpleName InfixExpression StringLiteral at the request of user
user SimpleName InfixExpression QualifiedName credentialsuser
at the request of user StringLiteral InfixExpression QualifiedName credentialsuser
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation InfixExpression StringLiteral revoked system permission
log SimpleName MethodInvocation InfixExpression SimpleName permission
log SimpleName MethodInvocation InfixExpression StringLiteral for user
log SimpleName MethodInvocation InfixExpression SimpleName user
log SimpleName MethodInvocation InfixExpression StringLiteral at the request of user
log SimpleName MethodInvocation InfixExpression QualifiedName credentialsuser
info SimpleName MethodInvocation InfixExpression StringLiteral revoked system permission
info SimpleName MethodInvocation InfixExpression SimpleName permission
info SimpleName MethodInvocation InfixExpression StringLiteral for user
info SimpleName MethodInvocation InfixExpression SimpleName user
info SimpleName MethodInvocation InfixExpression StringLiteral at the request of user
info SimpleName MethodInvocation InfixExpression QualifiedName credentialsuser
keeper exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
log SimpleName MethodInvocation SimpleName error
log SimpleName MethodInvocation SimpleName e
log SimpleName MethodInvocation SimpleName e
error SimpleName MethodInvocation SimpleName e
error SimpleName MethodInvocation SimpleName e
e SimpleName MethodInvocation SimpleName e
accumulo security exception SimpleName SimpleType ClassInstanceCreation SimpleName user
accumulo security exception SimpleName SimpleType ClassInstanceCreation QualifiedName security error codeconnection error
accumulo security exception SimpleName SimpleType ClassInstanceCreation SimpleName e
user SimpleName ClassInstanceCreation QualifiedName security error codeconnection error
user SimpleName ClassInstanceCreation SimpleName e
security error codeconnection error QualifiedName ClassInstanceCreation SimpleName e
interrupted exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
log SimpleName MethodInvocation SimpleName error
log SimpleName MethodInvocation SimpleName e
log SimpleName MethodInvocation SimpleName e
error SimpleName MethodInvocation SimpleName e
error SimpleName MethodInvocation SimpleName e
e SimpleName MethodInvocation SimpleName e
runtime exception SimpleName SimpleType ClassInstanceCreation SimpleName e
accumulo security exception SimpleName SimpleType ClassInstanceCreation QualifiedName credentialsuser
accumulo security exception SimpleName SimpleType ClassInstanceCreation QualifiedName security error codeuser doesnt exist
credentialsuser QualifiedName ClassInstanceCreation QualifiedName security error codeuser doesnt exist
override SimpleName MarkerAnnotation MethodDeclaration Modifier public
override SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
override SimpleName MarkerAnnotation MethodDeclaration SimpleName revoke system permission
override SimpleName MarkerAnnotation MethodDeclaration SingleVariableDeclaration SimpleName credentials
override SimpleName MarkerAnnotation MethodDeclaration SingleVariableDeclaration SimpleName user
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName revoke system permission
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName auth info
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName credentials
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName user
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName system permission
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName permission
void PrimitiveType MethodDeclaration SimpleName revoke system permission
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName auth info
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName credentials
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName user
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName system permission
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName permission
void PrimitiveType MethodDeclaration SimpleType SimpleName accumulo security exception
revoke system permission SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName auth info
revoke system permission SimpleName MethodDeclaration SingleVariableDeclaration SimpleName credentials
revoke system permission SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
revoke system permission SimpleName MethodDeclaration SingleVariableDeclaration SimpleName user
revoke system permission SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName system permission
revoke system permission SimpleName MethodDeclaration SingleVariableDeclaration SimpleName permission
revoke system permission SimpleName MethodDeclaration SimpleType SimpleName accumulo security exception
credentials SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName user
credentials SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName permission
credentials SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName accumulo security exception
user SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName permission
user SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName accumulo security exception
permission SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName accumulo security exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName override
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName revoke system permission
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName credentials
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName user
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName permission
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName accumulo security exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName override
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName revoke system permission
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName credentials
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName user
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName permission
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName accumulo security exception
