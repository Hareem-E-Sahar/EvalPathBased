string SimpleName SimpleType SingleVariableDeclaration SimpleName user id
entity proxy SimpleName SimpleType SingleVariableDeclaration SimpleName entity proxy
method name SimpleName VariableDeclarationFragment StringLiteral add entity proxy
final Modifier VariableDeclarationStatement SimpleType SimpleName string
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName method name
final Modifier VariableDeclarationStatement VariableDeclarationFragment StringLiteral add entity proxy
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName method name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment StringLiteral add entity proxy
url template SimpleName VariableDeclarationFragment StringLiteral { instancesentityproxyentity proxy }
final Modifier VariableDeclarationStatement SimpleType SimpleName string
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName url template
final Modifier VariableDeclarationStatement VariableDeclarationFragment StringLiteral { instancesentityproxyentity proxy }
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName url template
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment StringLiteral { instancesentityproxyentity proxy }
rest url root SimpleName InfixExpression SimpleName url template
call void post rest call SimpleName MethodInvocation SimpleName method name
call void post rest call SimpleName MethodInvocation InfixExpression SimpleName rest url root
call void post rest call SimpleName MethodInvocation InfixExpression SimpleName url template
call void post rest call SimpleName MethodInvocation SimpleName user id
call void post rest call SimpleName MethodInvocation SimpleName entity proxy
method name SimpleName MethodInvocation InfixExpression SimpleName rest url root
method name SimpleName MethodInvocation InfixExpression SimpleName url template
method name SimpleName MethodInvocation SimpleName user id
method name SimpleName MethodInvocation SimpleName entity proxy
rest url root SimpleName InfixExpression MethodInvocation SimpleName user id
url template SimpleName InfixExpression MethodInvocation SimpleName user id
rest url root SimpleName InfixExpression MethodInvocation SimpleName entity proxy
url template SimpleName InfixExpression MethodInvocation SimpleName entity proxy
user id SimpleName MethodInvocation SimpleName entity proxy
rest result SimpleName VariableDeclarationFragment MethodInvocation SimpleName call void post rest call
rest result SimpleName VariableDeclarationFragment MethodInvocation SimpleName method name
rest result SimpleName VariableDeclarationFragment MethodInvocation InfixExpression SimpleName rest url root
rest result SimpleName VariableDeclarationFragment MethodInvocation InfixExpression SimpleName url template
rest result SimpleName VariableDeclarationFragment MethodInvocation SimpleName user id
rest result SimpleName VariableDeclarationFragment MethodInvocation SimpleName entity proxy
void response SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName rest result
detect and throw function not supported exception SimpleName MethodInvocation SimpleName method name
detect and throw function not supported exception SimpleName MethodInvocation SimpleName rest result
method name SimpleName MethodInvocation SimpleName rest result
detect and throw invalid parameter exception SimpleName MethodInvocation SimpleName method name
detect and throw invalid parameter exception SimpleName MethodInvocation SimpleName rest result
method name SimpleName MethodInvocation SimpleName rest result
detect and throw type error exception SimpleName MethodInvocation SimpleName method name
detect and throw type error exception SimpleName MethodInvocation SimpleName rest result
method name SimpleName MethodInvocation SimpleName rest result
detect and throw property error exception SimpleName MethodInvocation SimpleName method name
detect and throw property error exception SimpleName MethodInvocation SimpleName rest result
method name SimpleName MethodInvocation SimpleName rest result
detect and throw classification error exception SimpleName MethodInvocation SimpleName method name
detect and throw classification error exception SimpleName MethodInvocation SimpleName rest result
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
final Modifier VariableDeclarationStatement Block VariableDeclarationStatement Modifier final
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName add entity proxy
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName user id
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName entity proxy
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName entity proxy
public Modifier MethodDeclaration SimpleType SimpleName invalid parameter exception
void PrimitiveType MethodDeclaration SimpleName add entity proxy
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName user id
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName entity proxy
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName entity proxy
void PrimitiveType MethodDeclaration SimpleType SimpleName invalid parameter exception
void PrimitiveType MethodDeclaration SimpleType SimpleName repository error exception
add entity proxy SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
add entity proxy SimpleName MethodDeclaration SingleVariableDeclaration SimpleName user id
add entity proxy SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName entity proxy
add entity proxy SimpleName MethodDeclaration SingleVariableDeclaration SimpleName entity proxy
add entity proxy SimpleName MethodDeclaration SimpleType SimpleName invalid parameter exception
add entity proxy SimpleName MethodDeclaration SimpleType SimpleName repository error exception
add entity proxy SimpleName MethodDeclaration SimpleType SimpleName type error exception
user id SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName entity proxy
user id SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName invalid parameter exception
user id SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName repository error exception
user id SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName type error exception
user id SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName property error exception
entity proxy SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName invalid parameter exception
entity proxy SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName repository error exception
entity proxy SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName type error exception
entity proxy SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName property error exception
entity proxy SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName classification error exception
invalid parameter exception SimpleName SimpleType MethodDeclaration SimpleType SimpleName repository error exception
invalid parameter exception SimpleName SimpleType MethodDeclaration SimpleType SimpleName type error exception
invalid parameter exception SimpleName SimpleType MethodDeclaration SimpleType SimpleName property error exception
invalid parameter exception SimpleName SimpleType MethodDeclaration SimpleType SimpleName classification error exception
invalid parameter exception SimpleName SimpleType MethodDeclaration SimpleType SimpleName status not supported exception
repository error exception SimpleName SimpleType MethodDeclaration SimpleType SimpleName type error exception
repository error exception SimpleName SimpleType MethodDeclaration SimpleType SimpleName property error exception
repository error exception SimpleName SimpleType MethodDeclaration SimpleType SimpleName classification error exception
repository error exception SimpleName SimpleType MethodDeclaration SimpleType SimpleName status not supported exception
repository error exception SimpleName SimpleType MethodDeclaration SimpleType SimpleName function not supported exception
type error exception SimpleName SimpleType MethodDeclaration SimpleType SimpleName property error exception
type error exception SimpleName SimpleType MethodDeclaration SimpleType SimpleName classification error exception
type error exception SimpleName SimpleType MethodDeclaration SimpleType SimpleName status not supported exception
type error exception SimpleName SimpleType MethodDeclaration SimpleType SimpleName function not supported exception
type error exception SimpleName SimpleType MethodDeclaration SimpleType SimpleName user not authorized exception
property error exception SimpleName SimpleType MethodDeclaration SimpleType SimpleName classification error exception
property error exception SimpleName SimpleType MethodDeclaration SimpleType SimpleName status not supported exception
property error exception SimpleName SimpleType MethodDeclaration SimpleType SimpleName function not supported exception
property error exception SimpleName SimpleType MethodDeclaration SimpleType SimpleName user not authorized exception
classification error exception SimpleName SimpleType MethodDeclaration SimpleType SimpleName status not supported exception
classification error exception SimpleName SimpleType MethodDeclaration SimpleType SimpleName function not supported exception
classification error exception SimpleName SimpleType MethodDeclaration SimpleType SimpleName user not authorized exception
status not supported exception SimpleName SimpleType MethodDeclaration SimpleType SimpleName function not supported exception
status not supported exception SimpleName SimpleType MethodDeclaration SimpleType SimpleName user not authorized exception
function not supported exception SimpleName SimpleType MethodDeclaration SimpleType SimpleName user not authorized exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName add entity proxy
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName user id
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName entity proxy
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName invalid parameter exception
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName repository error exception
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName type error exception
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName property error exception
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName classification error exception
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName status not supported exception
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName function not supported exception
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName user not authorized exception
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName add entity proxy
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName user id
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName entity proxy
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName invalid parameter exception
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName repository error exception
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName type error exception
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName property error exception
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName classification error exception
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName status not supported exception
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName function not supported exception
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName user not authorized exception