string SimpleName SimpleType SingleVariableDeclaration SimpleName user id
string SimpleName SimpleType SingleVariableDeclaration SimpleName guid
method name SimpleName VariableDeclarationFragment StringLiteral get connection by guid
final Modifier VariableDeclarationStatement SimpleType SimpleName string
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName method name
final Modifier VariableDeclarationStatement VariableDeclarationFragment StringLiteral get connection by guid
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName method name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment StringLiteral get connection by guid
url template SimpleName VariableDeclarationFragment StringLiteral /{ connection }
final Modifier VariableDeclarationStatement SimpleType SimpleName string
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName url template
final Modifier VariableDeclarationStatement VariableDeclarationFragment StringLiteral /{ connection }
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName url template
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment StringLiteral /{ connection }
validate omas server url SimpleName MethodInvocation SimpleName method name
omas server url SimpleName InfixExpression SimpleName url template
call connection get rest call SimpleName MethodInvocation SimpleName method name
call connection get rest call SimpleName MethodInvocation InfixExpression SimpleName omas server url
call connection get rest call SimpleName MethodInvocation InfixExpression SimpleName url template
call connection get rest call SimpleName MethodInvocation SimpleName user id
call connection get rest call SimpleName MethodInvocation SimpleName guid
method name SimpleName MethodInvocation InfixExpression SimpleName omas server url
method name SimpleName MethodInvocation InfixExpression SimpleName url template
method name SimpleName MethodInvocation SimpleName user id
method name SimpleName MethodInvocation SimpleName guid
omas server url SimpleName InfixExpression MethodInvocation SimpleName user id
url template SimpleName InfixExpression MethodInvocation SimpleName user id
omas server url SimpleName InfixExpression MethodInvocation SimpleName guid
url template SimpleName InfixExpression MethodInvocation SimpleName guid
user id SimpleName MethodInvocation SimpleName guid
rest result SimpleName VariableDeclarationFragment MethodInvocation SimpleName call connection get rest call
rest result SimpleName VariableDeclarationFragment MethodInvocation SimpleName method name
rest result SimpleName VariableDeclarationFragment MethodInvocation InfixExpression SimpleName omas server url
rest result SimpleName VariableDeclarationFragment MethodInvocation InfixExpression SimpleName url template
rest result SimpleName VariableDeclarationFragment MethodInvocation SimpleName user id
rest result SimpleName VariableDeclarationFragment MethodInvocation SimpleName guid
connection response SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName rest result
detect and throw invalid parameter exception SimpleName MethodInvocation SimpleName method name
detect and throw invalid parameter exception SimpleName MethodInvocation SimpleName rest result
method name SimpleName MethodInvocation SimpleName rest result
detect and throw unrecognized connection guid exception SimpleName MethodInvocation SimpleName method name
detect and throw unrecognized connection guid exception SimpleName MethodInvocation SimpleName rest result
method name SimpleName MethodInvocation SimpleName rest result
detect and throw user not authorized exception SimpleName MethodInvocation SimpleName method name
detect and throw user not authorized exception SimpleName MethodInvocation SimpleName rest result
method name SimpleName MethodInvocation SimpleName rest result
detect and throw property server exception SimpleName MethodInvocation SimpleName method name
detect and throw property server exception SimpleName MethodInvocation SimpleName rest result
method name SimpleName MethodInvocation SimpleName rest result
rest result SimpleName MethodInvocation SimpleName get connection
final Modifier VariableDeclarationStatement Block VariableDeclarationStatement Modifier final
private Modifier MethodDeclaration SimpleType SimpleName connection
private Modifier MethodDeclaration SimpleName get connection by guid
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName user id
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName guid
private Modifier MethodDeclaration SimpleType SimpleName invalid parameter exception
connection SimpleName SimpleType MethodDeclaration SimpleName get connection by guid
connection SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName user id
connection SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName guid
connection SimpleName SimpleType MethodDeclaration SimpleType SimpleName invalid parameter exception
connection SimpleName SimpleType MethodDeclaration SimpleType SimpleName unrecognized connection guid exception
get connection by guid SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
get connection by guid SimpleName MethodDeclaration SingleVariableDeclaration SimpleName user id
get connection by guid SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
get connection by guid SimpleName MethodDeclaration SingleVariableDeclaration SimpleName guid
get connection by guid SimpleName MethodDeclaration SimpleType SimpleName invalid parameter exception
get connection by guid SimpleName MethodDeclaration SimpleType SimpleName unrecognized connection guid exception
get connection by guid SimpleName MethodDeclaration SimpleType SimpleName property server exception
user id SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName guid
user id SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName invalid parameter exception
user id SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName unrecognized connection guid exception
user id SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName property server exception
user id SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName user not authorized exception
guid SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName invalid parameter exception
guid SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName unrecognized connection guid exception
guid SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName property server exception
guid SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName user not authorized exception
invalid parameter exception SimpleName SimpleType MethodDeclaration SimpleType SimpleName unrecognized connection guid exception
invalid parameter exception SimpleName SimpleType MethodDeclaration SimpleType SimpleName property server exception
invalid parameter exception SimpleName SimpleType MethodDeclaration SimpleType SimpleName user not authorized exception
unrecognized connection guid exception SimpleName SimpleType MethodDeclaration SimpleType SimpleName property server exception
unrecognized connection guid exception SimpleName SimpleType MethodDeclaration SimpleType SimpleName user not authorized exception
property server exception SimpleName SimpleType MethodDeclaration SimpleType SimpleName user not authorized exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName connection
public Modifier TypeDeclaration MethodDeclaration SimpleName get connection by guid
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName user id
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName guid
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName invalid parameter exception
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName unrecognized connection guid exception
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName property server exception
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName user not authorized exception
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName connection
test SimpleName TypeDeclaration MethodDeclaration SimpleName get connection by guid
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName user id
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName guid
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName invalid parameter exception
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName unrecognized connection guid exception
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName property server exception
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName user not authorized exception
