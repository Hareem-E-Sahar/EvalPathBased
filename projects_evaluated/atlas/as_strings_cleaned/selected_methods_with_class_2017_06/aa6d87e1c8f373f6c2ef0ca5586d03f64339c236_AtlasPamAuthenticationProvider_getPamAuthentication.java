authentication SimpleName SimpleType SingleVariableDeclaration SimpleName authentication
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral ==> atlas pam authentication provider get pam authentication
debug SimpleName MethodInvocation StringLiteral ==> atlas pam authentication provider get pam authentication
authentication SimpleName MethodInvocation SimpleName get name
user name SimpleName VariableDeclarationFragment MethodInvocation SimpleName authentication
user name SimpleName VariableDeclarationFragment MethodInvocation SimpleName get name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName user name
user password SimpleName VariableDeclarationFragment StringLiteral empty
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName user password
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment StringLiteral empty
authentication SimpleName MethodInvocation SimpleName get credentials
authentication SimpleName MethodInvocation SimpleName get credentials
authentication SimpleName MethodInvocation MethodInvocation SimpleName to string
get credentials SimpleName MethodInvocation MethodInvocation SimpleName to string
user password SimpleName Assignment MethodInvocation MethodInvocation SimpleName authentication
user password SimpleName Assignment MethodInvocation MethodInvocation SimpleName get credentials
user password SimpleName Assignment MethodInvocation SimpleName to string
user name SimpleName InfixExpression InfixExpression InfixExpression SimpleName user password
user name SimpleName MethodInvocation SimpleName trim
user name SimpleName MethodInvocation MethodInvocation SimpleName is empty
trim SimpleName MethodInvocation MethodInvocation SimpleName is empty
user password SimpleName MethodInvocation SimpleName trim
user password SimpleName MethodInvocation MethodInvocation SimpleName is empty
trim SimpleName MethodInvocation MethodInvocation SimpleName is empty
list SimpleName SimpleType ParameterizedType SimpleType SimpleName granted authority
get authorities SimpleName MethodInvocation SimpleName user name
granted auths SimpleName VariableDeclarationFragment MethodInvocation SimpleName get authorities
granted auths SimpleName VariableDeclarationFragment MethodInvocation SimpleName user name
final Modifier VariableDeclarationStatement ParameterizedType SimpleType SimpleName list
final Modifier VariableDeclarationStatement ParameterizedType SimpleType SimpleName granted authority
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName granted auths
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get authorities
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName user name
user SimpleName SimpleType ClassInstanceCreation SimpleName user name
user SimpleName SimpleType ClassInstanceCreation SimpleName user password
user SimpleName SimpleType ClassInstanceCreation SimpleName granted auths
user name SimpleName ClassInstanceCreation SimpleName user password
user name SimpleName ClassInstanceCreation SimpleName granted auths
user password SimpleName ClassInstanceCreation SimpleName granted auths
principal SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName user
principal SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName user name
principal SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName user password
principal SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName granted auths
final Modifier VariableDeclarationStatement SimpleType SimpleName user details
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName principal
final Modifier VariableDeclarationStatement VariableDeclarationFragment ClassInstanceCreation SimpleName user name
final Modifier VariableDeclarationStatement VariableDeclarationFragment ClassInstanceCreation SimpleName user password
final Modifier VariableDeclarationStatement VariableDeclarationFragment ClassInstanceCreation SimpleName granted auths
user details SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName principal
username password authentication token SimpleName SimpleType ClassInstanceCreation SimpleName principal
username password authentication token SimpleName SimpleType ClassInstanceCreation SimpleName user password
username password authentication token SimpleName SimpleType ClassInstanceCreation SimpleName granted auths
principal SimpleName ClassInstanceCreation SimpleName user password
principal SimpleName ClassInstanceCreation SimpleName granted auths
user password SimpleName ClassInstanceCreation SimpleName granted auths
final authentication SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName username password authentication token
final authentication SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName principal
final authentication SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName user password
final authentication SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName granted auths
final Modifier VariableDeclarationStatement SimpleType SimpleName authentication
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName final authentication
final Modifier VariableDeclarationStatement VariableDeclarationFragment ClassInstanceCreation SimpleName principal
final Modifier VariableDeclarationStatement VariableDeclarationFragment ClassInstanceCreation SimpleName user password
final Modifier VariableDeclarationStatement VariableDeclarationFragment ClassInstanceCreation SimpleName granted auths
authentication SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName final authentication
jaas authentication provider SimpleName MethodInvocation SimpleName authenticate
jaas authentication provider SimpleName MethodInvocation SimpleName final authentication
authenticate SimpleName MethodInvocation SimpleName final authentication
authentication SimpleName Assignment MethodInvocation SimpleName jaas authentication provider
authentication SimpleName Assignment MethodInvocation SimpleName authenticate
authentication SimpleName Assignment MethodInvocation SimpleName final authentication
get authentication with granted authority from ugi SimpleName MethodInvocation SimpleName authentication
authentication SimpleName Assignment MethodInvocation SimpleName get authentication with granted authority from ugi
authentication SimpleName Assignment MethodInvocation SimpleName authentication
get authentication with granted authority SimpleName MethodInvocation SimpleName authentication
authentication SimpleName Assignment MethodInvocation SimpleName get authentication with granted authority
authentication SimpleName Assignment MethodInvocation SimpleName authentication
final Modifier VariableDeclarationStatement Block VariableDeclarationStatement Modifier final
final Modifier VariableDeclarationStatement Block VariableDeclarationStatement Modifier final
final Modifier VariableDeclarationStatement Block IfStatement SimpleName groups from ugi
final Modifier VariableDeclarationStatement Block ReturnStatement SimpleName authentication
final Modifier VariableDeclarationStatement Block VariableDeclarationStatement Modifier final
final Modifier VariableDeclarationStatement Block IfStatement SimpleName groups from ugi
final Modifier VariableDeclarationStatement Block ReturnStatement SimpleName authentication
final Modifier VariableDeclarationStatement Block IfStatement SimpleName groups from ugi
final Modifier VariableDeclarationStatement Block ReturnStatement SimpleName authentication
groups from ugi SimpleName IfStatement Block ReturnStatement SimpleName authentication
exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral pam authentication failed
log SimpleName MethodInvocation SimpleName e
debug SimpleName MethodInvocation StringLiteral pam authentication failed
debug SimpleName MethodInvocation SimpleName e
pam authentication failed StringLiteral MethodInvocation SimpleName e
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral <== atlas pam authentication provider get pam authentication
debug SimpleName MethodInvocation StringLiteral <== atlas pam authentication provider get pam authentication
is debug enabled SimpleName IfStatement Block IfStatement SimpleName is debug enabled
is debug enabled SimpleName IfStatement Block ReturnStatement SimpleName authentication
is debug enabled SimpleName IfStatement Block ReturnStatement SimpleName authentication
private Modifier MethodDeclaration SimpleType SimpleName authentication
private Modifier MethodDeclaration SimpleName get pam authentication
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName authentication
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName authentication
private Modifier MethodDeclaration Block IfStatement SimpleName is debug enabled
private Modifier MethodDeclaration Block IfStatement SimpleName is debug enabled
private Modifier MethodDeclaration Block ReturnStatement SimpleName authentication
authentication SimpleName SimpleType MethodDeclaration SimpleName get pam authentication
authentication SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName authentication
get pam authentication SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName authentication
get pam authentication SimpleName MethodDeclaration SingleVariableDeclaration SimpleName authentication
get pam authentication SimpleName MethodDeclaration Block IfStatement SimpleName is debug enabled
get pam authentication SimpleName MethodDeclaration Block IfStatement SimpleName is debug enabled
get pam authentication SimpleName MethodDeclaration Block ReturnStatement SimpleName authentication
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName authentication
public Modifier TypeDeclaration MethodDeclaration SimpleName get pam authentication
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName authentication
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName authentication
test SimpleName TypeDeclaration MethodDeclaration SimpleName get pam authentication
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName authentication
