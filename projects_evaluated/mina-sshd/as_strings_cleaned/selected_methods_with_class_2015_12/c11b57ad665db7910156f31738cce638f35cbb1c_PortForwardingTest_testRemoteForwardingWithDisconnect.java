timeout SimpleName MemberValuePair NumberLiteral empty
test SimpleName NormalAnnotation MemberValuePair SimpleName timeout
test SimpleName NormalAnnotation MemberValuePair NumberLiteral empty
session SimpleName VariableDeclarationFragment MethodInvocation SimpleName create session
session SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName session
utils SimpleName MethodInvocation SimpleName get free port
forwarded port SimpleName VariableDeclarationFragment MethodInvocation SimpleName utils
forwarded port SimpleName VariableDeclarationFragment MethodInvocation SimpleName get free port
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName forwarded port
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName utils
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get free port
session SimpleName MethodInvocation SimpleName set port forwarding r
session SimpleName MethodInvocation SimpleName forwarded port
session SimpleName MethodInvocation SimpleName test localhost
session SimpleName MethodInvocation SimpleName echo port
set port forwarding r SimpleName MethodInvocation SimpleName forwarded port
set port forwarding r SimpleName MethodInvocation SimpleName test localhost
set port forwarding r SimpleName MethodInvocation SimpleName echo port
forwarded port SimpleName MethodInvocation SimpleName test localhost
forwarded port SimpleName MethodInvocation SimpleName echo port
test localhost SimpleName MethodInvocation SimpleName echo port
time unitseconds QualifiedName MethodInvocation SimpleName to millis
time unitseconds QualifiedName MethodInvocation NumberLiteral l
to millis SimpleName MethodInvocation NumberLiteral l
wait for forwarding request SimpleName MethodInvocation QualifiedName tcpip forward handlerrequest
wait for forwarding request SimpleName MethodInvocation MethodInvocation QualifiedName time unitseconds
wait for forwarding request SimpleName MethodInvocation MethodInvocation SimpleName to millis
wait for forwarding request SimpleName MethodInvocation MethodInvocation NumberLiteral l
tcpip forward handlerrequest QualifiedName MethodInvocation MethodInvocation QualifiedName time unitseconds
tcpip forward handlerrequest QualifiedName MethodInvocation MethodInvocation SimpleName to millis
tcpip forward handlerrequest QualifiedName MethodInvocation MethodInvocation NumberLiteral l
socket SimpleName SimpleType ClassInstanceCreation SimpleName test localhost
socket SimpleName SimpleType ClassInstanceCreation SimpleName forwarded port
test localhost SimpleName ClassInstanceCreation SimpleName forwarded port
s SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName socket
s SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName test localhost
s SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName forwarded port
socket SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName s
time unitseconds QualifiedName MethodInvocation SimpleName to millis
time unitseconds QualifiedName MethodInvocation NumberLiteral l
to millis SimpleName MethodInvocation NumberLiteral l
int PrimitiveType CastExpression MethodInvocation QualifiedName time unitseconds
int PrimitiveType CastExpression MethodInvocation SimpleName to millis
int PrimitiveType CastExpression MethodInvocation NumberLiteral l
s SimpleName MethodInvocation SimpleName set so timeout
s SimpleName MethodInvocation CastExpression PrimitiveType int
s SimpleName MethodInvocation CastExpression MethodInvocation QualifiedName time unitseconds
s SimpleName MethodInvocation CastExpression MethodInvocation SimpleName to millis
s SimpleName MethodInvocation CastExpression MethodInvocation NumberLiteral l
set so timeout SimpleName MethodInvocation CastExpression PrimitiveType int
set so timeout SimpleName MethodInvocation CastExpression MethodInvocation QualifiedName time unitseconds
set so timeout SimpleName MethodInvocation CastExpression MethodInvocation SimpleName to millis
set so timeout SimpleName MethodInvocation CastExpression MethodInvocation NumberLiteral l
rudely disconnect jsch session SimpleName MethodInvocation SimpleName session
time unitseconds QualifiedName MethodInvocation SimpleName to millis
time unitseconds QualifiedName MethodInvocation NumberLiteral l
to millis SimpleName MethodInvocation NumberLiteral l
thread SimpleName MethodInvocation SimpleName sleep
thread SimpleName MethodInvocation MethodInvocation QualifiedName time unitseconds
thread SimpleName MethodInvocation MethodInvocation SimpleName to millis
thread SimpleName MethodInvocation MethodInvocation NumberLiteral l
sleep SimpleName MethodInvocation MethodInvocation QualifiedName time unitseconds
sleep SimpleName MethodInvocation MethodInvocation SimpleName to millis
sleep SimpleName MethodInvocation MethodInvocation NumberLiteral l
thread SimpleName MethodInvocation SimpleName current thread
thread SimpleName MethodInvocation MethodInvocation SimpleName get thread group
current thread SimpleName MethodInvocation MethodInvocation SimpleName get thread group
thread SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get parent
current thread SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get parent
get thread group SimpleName MethodInvocation MethodInvocation SimpleName get parent
root SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get thread group
root SimpleName VariableDeclarationFragment MethodInvocation SimpleName get parent
thread group SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName root
root SimpleName MethodInvocation SimpleName get parent
root SimpleName MethodInvocation SimpleName get parent
root SimpleName Assignment MethodInvocation SimpleName root
root SimpleName Assignment MethodInvocation SimpleName get parent
index SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName index
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
collection SimpleName SimpleType ParameterizedType SimpleType SimpleName thread
find threads SimpleName MethodInvocation SimpleName root
find threads SimpleName MethodInvocation StringLiteral nio processor
root SimpleName MethodInvocation StringLiteral nio processor
pending SimpleName VariableDeclarationFragment MethodInvocation SimpleName find threads
pending SimpleName VariableDeclarationFragment MethodInvocation SimpleName root
pending SimpleName VariableDeclarationFragment MethodInvocation StringLiteral nio processor
generic utils SimpleName MethodInvocation SimpleName size
generic utils SimpleName MethodInvocation SimpleName pending
size SimpleName MethodInvocation SimpleName pending
generic utils SimpleName MethodInvocation InfixExpression NumberLiteral empty
size SimpleName MethodInvocation InfixExpression NumberLiteral empty
pending SimpleName MethodInvocation InfixExpression NumberLiteral empty
finished after StringLiteral InfixExpression SimpleName index
finished after StringLiteral InfixExpression StringLiteral iterations
index SimpleName InfixExpression StringLiteral iterations
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation InfixExpression StringLiteral finished after
log SimpleName MethodInvocation InfixExpression SimpleName index
log SimpleName MethodInvocation InfixExpression StringLiteral iterations
info SimpleName MethodInvocation InfixExpression StringLiteral finished after
info SimpleName MethodInvocation InfixExpression SimpleName index
info SimpleName MethodInvocation InfixExpression StringLiteral iterations
time unitseconds QualifiedName MethodInvocation SimpleName to millis
time unitseconds QualifiedName MethodInvocation NumberLiteral l
to millis SimpleName MethodInvocation NumberLiteral l
thread SimpleName MethodInvocation SimpleName sleep
thread SimpleName MethodInvocation MethodInvocation QualifiedName time unitseconds
thread SimpleName MethodInvocation MethodInvocation SimpleName to millis
thread SimpleName MethodInvocation MethodInvocation NumberLiteral l
sleep SimpleName MethodInvocation MethodInvocation QualifiedName time unitseconds
sleep SimpleName MethodInvocation MethodInvocation SimpleName to millis
sleep SimpleName MethodInvocation MethodInvocation NumberLiteral l
interrupted exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName index
session SimpleName MethodInvocation SimpleName del port forwarding r
session SimpleName MethodInvocation SimpleName forwarded port
del port forwarding r SimpleName MethodInvocation SimpleName forwarded port
session SimpleName MethodInvocation SimpleName disconnect
test SimpleName NormalAnnotation MethodDeclaration Modifier public
timeout SimpleName MemberValuePair NormalAnnotation MethodDeclaration Modifier public
empty NumberLiteral MemberValuePair NormalAnnotation MethodDeclaration Modifier public
test SimpleName NormalAnnotation MethodDeclaration PrimitiveType void
timeout SimpleName MemberValuePair NormalAnnotation MethodDeclaration PrimitiveType void
empty NumberLiteral MemberValuePair NormalAnnotation MethodDeclaration PrimitiveType void
test SimpleName NormalAnnotation MethodDeclaration SimpleName test remote forwarding with disconnect
timeout SimpleName MemberValuePair NormalAnnotation MethodDeclaration SimpleName test remote forwarding with disconnect
empty NumberLiteral MemberValuePair NormalAnnotation MethodDeclaration SimpleName test remote forwarding with disconnect
test SimpleName NormalAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test remote forwarding with disconnect
public Modifier MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration SimpleName test remote forwarding with disconnect
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
test remote forwarding with disconnect SimpleName MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration NormalAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test remote forwarding with disconnect
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration NormalAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test remote forwarding with disconnect
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
