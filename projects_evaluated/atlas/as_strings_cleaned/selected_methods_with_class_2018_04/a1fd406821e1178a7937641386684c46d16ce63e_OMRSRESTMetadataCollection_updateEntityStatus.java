string SimpleName SimpleType SingleVariableDeclaration SimpleName user id
string SimpleName SimpleType SingleVariableDeclaration SimpleName entity guid
instance status SimpleName SimpleType SingleVariableDeclaration SimpleName new status
method name SimpleName VariableDeclarationFragment StringLiteral update entity status
final Modifier VariableDeclarationStatement SimpleType SimpleName string
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName method name
final Modifier VariableDeclarationStatement VariableDeclarationFragment StringLiteral update entity status
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName method name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment StringLiteral update entity status
url template SimpleName VariableDeclarationFragment StringLiteral { instancesentity statusnew status }
final Modifier VariableDeclarationStatement SimpleType SimpleName string
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName url template
final Modifier VariableDeclarationStatement VariableDeclarationFragment StringLiteral { instancesentity statusnew status }
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName url template
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment StringLiteral { instancesentity statusnew status }
rest url root SimpleName InfixExpression SimpleName url template
call entity detail patch rest call SimpleName MethodInvocation SimpleName method name
call entity detail patch rest call SimpleName MethodInvocation InfixExpression SimpleName rest url root
call entity detail patch rest call SimpleName MethodInvocation InfixExpression SimpleName url template
call entity detail patch rest call SimpleName MethodInvocation SimpleName user id
call entity detail patch rest call SimpleName MethodInvocation SimpleName entity guid
call entity detail patch rest call SimpleName MethodInvocation SimpleName new status
method name SimpleName MethodInvocation InfixExpression SimpleName rest url root
method name SimpleName MethodInvocation InfixExpression SimpleName url template
method name SimpleName MethodInvocation SimpleName user id
method name SimpleName MethodInvocation SimpleName entity guid
method name SimpleName MethodInvocation SimpleName new status
rest url root SimpleName InfixExpression MethodInvocation SimpleName user id
url template SimpleName InfixExpression MethodInvocation SimpleName user id
rest url root SimpleName InfixExpression MethodInvocation SimpleName entity guid
url template SimpleName InfixExpression MethodInvocation SimpleName entity guid
rest url root SimpleName InfixExpression MethodInvocation SimpleName new status
url template SimpleName InfixExpression MethodInvocation SimpleName new status
user id SimpleName MethodInvocation SimpleName entity guid
user id SimpleName MethodInvocation SimpleName new status
entity guid SimpleName MethodInvocation SimpleName new status
rest result SimpleName VariableDeclarationFragment MethodInvocation SimpleName call entity detail patch rest call
rest result SimpleName VariableDeclarationFragment MethodInvocation SimpleName method name
rest result SimpleName VariableDeclarationFragment MethodInvocation InfixExpression SimpleName rest url root
rest result SimpleName VariableDeclarationFragment MethodInvocation InfixExpression SimpleName url template
rest result SimpleName VariableDeclarationFragment MethodInvocation SimpleName user id
rest result SimpleName VariableDeclarationFragment MethodInvocation SimpleName entity guid
rest result SimpleName VariableDeclarationFragment MethodInvocation SimpleName new status
entity detail response SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName rest result
detect and throw invalid parameter exception SimpleName MethodInvocation SimpleName method name
detect and throw invalid parameter exception SimpleName MethodInvocation SimpleName rest result
method name SimpleName MethodInvocation SimpleName rest result
detect and throw entity not known exception SimpleName MethodInvocation SimpleName method name
detect and throw entity not known exception SimpleName MethodInvocation SimpleName rest result
method name SimpleName MethodInvocation SimpleName rest result
detect and throw status not supported exception SimpleName MethodInvocation SimpleName method name
detect and throw status not supported exception SimpleName MethodInvocation SimpleName rest result
method name SimpleName MethodInvocation SimpleName rest result
detect and throw user not authorized exception SimpleName MethodInvocation SimpleName method name
detect and throw user not authorized exception SimpleName MethodInvocation SimpleName rest result
method name SimpleName MethodInvocation SimpleName rest result
detect and throw repository error exception SimpleName MethodInvocation SimpleName method name
detect and throw repository error exception SimpleName MethodInvocation SimpleName rest result
method name SimpleName MethodInvocation SimpleName rest result
rest result SimpleName MethodInvocation SimpleName get entity
final Modifier VariableDeclarationStatement Block VariableDeclarationStatement Modifier final
public Modifier MethodDeclaration SimpleType SimpleName entity detail
public Modifier MethodDeclaration SimpleName update entity status
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName user id
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName entity guid
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName instance status
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName new status
entity detail SimpleName SimpleType MethodDeclaration SimpleName update entity status
entity detail SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName user id
entity detail SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName entity guid
entity detail SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName new status
entity detail SimpleName SimpleType MethodDeclaration SimpleType SimpleName invalid parameter exception
update entity status SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
update entity status SimpleName MethodDeclaration SingleVariableDeclaration SimpleName user id
update entity status SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
update entity status SimpleName MethodDeclaration SingleVariableDeclaration SimpleName entity guid
update entity status SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName instance status
update entity status SimpleName MethodDeclaration SingleVariableDeclaration SimpleName new status
update entity status SimpleName MethodDeclaration SimpleType SimpleName invalid parameter exception
update entity status SimpleName MethodDeclaration SimpleType SimpleName repository error exception
user id SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName entity guid
user id SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName new status
user id SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName invalid parameter exception
user id SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName repository error exception
user id SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName entity not known exception
entity guid SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName new status
entity guid SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName invalid parameter exception
entity guid SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName repository error exception
entity guid SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName entity not known exception
entity guid SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName status not supported exception
new status SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName invalid parameter exception
new status SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName repository error exception
new status SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName entity not known exception
new status SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName status not supported exception
new status SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName user not authorized exception
invalid parameter exception SimpleName SimpleType MethodDeclaration SimpleType SimpleName repository error exception
invalid parameter exception SimpleName SimpleType MethodDeclaration SimpleType SimpleName entity not known exception
invalid parameter exception SimpleName SimpleType MethodDeclaration SimpleType SimpleName status not supported exception
invalid parameter exception SimpleName SimpleType MethodDeclaration SimpleType SimpleName user not authorized exception
repository error exception SimpleName SimpleType MethodDeclaration SimpleType SimpleName entity not known exception
repository error exception SimpleName SimpleType MethodDeclaration SimpleType SimpleName status not supported exception
repository error exception SimpleName SimpleType MethodDeclaration SimpleType SimpleName user not authorized exception
entity not known exception SimpleName SimpleType MethodDeclaration SimpleType SimpleName status not supported exception
entity not known exception SimpleName SimpleType MethodDeclaration SimpleType SimpleName user not authorized exception
status not supported exception SimpleName SimpleType MethodDeclaration SimpleType SimpleName user not authorized exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName entity detail
public Modifier TypeDeclaration MethodDeclaration SimpleName update entity status
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName user id
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName entity guid
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName new status
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName invalid parameter exception
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName repository error exception
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName entity not known exception
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName status not supported exception
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName user not authorized exception
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName entity detail
test SimpleName TypeDeclaration MethodDeclaration SimpleName update entity status
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName user id
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName entity guid
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName new status
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName invalid parameter exception
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName repository error exception
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName entity not known exception
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName status not supported exception
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName user not authorized exception
