int PrimitiveType SingleVariableDeclaration SimpleName cmd
buffer SimpleName SimpleType SingleVariableDeclaration SimpleName buffer
objects SimpleName MethodInvocation SimpleName require non null
objects SimpleName MethodInvocation SimpleName current auth
objects SimpleName MethodInvocation StringLiteral no current auth
require non null SimpleName MethodInvocation SimpleName current auth
require non null SimpleName MethodInvocation StringLiteral no current auth
current auth SimpleName MethodInvocation StringLiteral no current auth
objects SimpleName MethodInvocation MethodInvocation SimpleName get username
require non null SimpleName MethodInvocation MethodInvocation SimpleName get username
current auth SimpleName MethodInvocation MethodInvocation SimpleName get username
no current auth StringLiteral MethodInvocation MethodInvocation SimpleName get username
username SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName objects
username SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName require non null
username SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName current auth
username SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation StringLiteral no current auth
username SimpleName VariableDeclarationFragment MethodInvocation SimpleName get username
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName username
session SimpleName VariableDeclarationFragment MethodInvocation SimpleName get server session
server session SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName session
log SimpleName MethodInvocation SimpleName is debug enabled
ssh constants SimpleName MethodInvocation SimpleName get command message name
ssh constants SimpleName MethodInvocation SimpleName cmd
get command message name SimpleName MethodInvocation SimpleName cmd
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral handle authentication success {}
log SimpleName MethodInvocation SimpleName username
log SimpleName MethodInvocation SimpleName session
log SimpleName MethodInvocation MethodInvocation SimpleName ssh constants
log SimpleName MethodInvocation MethodInvocation SimpleName get command message name
log SimpleName MethodInvocation MethodInvocation SimpleName cmd
debug SimpleName MethodInvocation StringLiteral handle authentication success {}
debug SimpleName MethodInvocation SimpleName username
debug SimpleName MethodInvocation SimpleName session
debug SimpleName MethodInvocation MethodInvocation SimpleName ssh constants
debug SimpleName MethodInvocation MethodInvocation SimpleName get command message name
debug SimpleName MethodInvocation MethodInvocation SimpleName cmd
handle authentication success {} StringLiteral MethodInvocation SimpleName username
handle authentication success {} StringLiteral MethodInvocation SimpleName session
handle authentication success {} StringLiteral MethodInvocation MethodInvocation SimpleName ssh constants
handle authentication success {} StringLiteral MethodInvocation MethodInvocation SimpleName get command message name
handle authentication success {} StringLiteral MethodInvocation MethodInvocation SimpleName cmd
username SimpleName MethodInvocation SimpleName session
username SimpleName MethodInvocation MethodInvocation SimpleName ssh constants
username SimpleName MethodInvocation MethodInvocation SimpleName get command message name
username SimpleName MethodInvocation MethodInvocation SimpleName cmd
session SimpleName MethodInvocation MethodInvocation SimpleName ssh constants
session SimpleName MethodInvocation MethodInvocation SimpleName get command message name
session SimpleName MethodInvocation MethodInvocation SimpleName cmd
success SimpleName VariableDeclarationFragment BooleanLiteral false
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName success
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment BooleanLiteral false
list SimpleName SimpleType ParameterizedType SimpleType SimpleName string
list SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName l
string SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName l
generic utils SimpleName MethodInvocation SimpleName size
generic utils SimpleName MethodInvocation SimpleName l
size SimpleName MethodInvocation SimpleName l
generic utils SimpleName MethodInvocation InfixExpression NumberLiteral empty
size SimpleName MethodInvocation InfixExpression NumberLiteral empty
l SimpleName MethodInvocation InfixExpression NumberLiteral empty
l SimpleName MethodInvocation SimpleName get
l SimpleName MethodInvocation NumberLiteral empty
get SimpleName MethodInvocation NumberLiteral empty
l SimpleName MethodInvocation MethodInvocation SimpleName equals
get SimpleName MethodInvocation MethodInvocation SimpleName equals
empty NumberLiteral MethodInvocation MethodInvocation SimpleName equals
l SimpleName MethodInvocation MethodInvocation SimpleName auth method
get SimpleName MethodInvocation MethodInvocation SimpleName auth method
empty NumberLiteral MethodInvocation MethodInvocation SimpleName auth method
equals SimpleName MethodInvocation SimpleName auth method
l SimpleName MethodInvocation SimpleName remove
l SimpleName MethodInvocation NumberLiteral empty
remove SimpleName MethodInvocation NumberLiteral empty
l SimpleName MethodInvocation SimpleName is empty
success SimpleName Assignment MethodInvocation SimpleName l
success SimpleName Assignment MethodInvocation SimpleName is empty
l SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName auth methods
session SimpleName MethodInvocation SimpleName get integer
session SimpleName MethodInvocation QualifiedName server factory managermax concurrent sessions
get integer SimpleName MethodInvocation QualifiedName server factory managermax concurrent sessions
max session count SimpleName VariableDeclarationFragment MethodInvocation SimpleName session
max session count SimpleName VariableDeclarationFragment MethodInvocation SimpleName get integer
max session count SimpleName VariableDeclarationFragment MethodInvocation QualifiedName server factory managermax concurrent sessions
integer SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName max session count
session SimpleName MethodInvocation SimpleName get active session count for user
session SimpleName MethodInvocation SimpleName username
get active session count for user SimpleName MethodInvocation SimpleName username
current session count SimpleName VariableDeclarationFragment MethodInvocation SimpleName session
current session count SimpleName VariableDeclarationFragment MethodInvocation SimpleName get active session count for user
current session count SimpleName VariableDeclarationFragment MethodInvocation SimpleName username
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName current session count
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName session
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get active session count for user
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName username
current session count SimpleName InfixExpression SimpleName max session count
too many concurrent connections ( StringLiteral InfixExpression SimpleName current session count
too many concurrent connections ( StringLiteral InfixExpression StringLiteral ) - max allowed
too many concurrent connections ( StringLiteral InfixExpression SimpleName max session count
current session count SimpleName InfixExpression StringLiteral ) - max allowed
current session count SimpleName InfixExpression SimpleName max session count
) - max allowed StringLiteral InfixExpression SimpleName max session count
session SimpleName MethodInvocation SimpleName disconnect
session SimpleName MethodInvocation QualifiedName ssh constantsssh disconnect too many connections
session SimpleName MethodInvocation InfixExpression StringLiteral too many concurrent connections (
session SimpleName MethodInvocation InfixExpression SimpleName current session count
session SimpleName MethodInvocation InfixExpression StringLiteral ) - max allowed
session SimpleName MethodInvocation InfixExpression SimpleName max session count
disconnect SimpleName MethodInvocation QualifiedName ssh constantsssh disconnect too many connections
disconnect SimpleName MethodInvocation InfixExpression StringLiteral too many concurrent connections (
disconnect SimpleName MethodInvocation InfixExpression SimpleName current session count
disconnect SimpleName MethodInvocation InfixExpression StringLiteral ) - max allowed
disconnect SimpleName MethodInvocation InfixExpression SimpleName max session count
ssh constantsssh disconnect too many connections QualifiedName MethodInvocation InfixExpression StringLiteral too many concurrent connections (
ssh constantsssh disconnect too many connections QualifiedName MethodInvocation InfixExpression SimpleName current session count
ssh constantsssh disconnect too many connections QualifiedName MethodInvocation InfixExpression StringLiteral ) - max allowed
ssh constantsssh disconnect too many connections QualifiedName MethodInvocation InfixExpression SimpleName max session count
welcome banner phasepost success QualifiedName MethodInvocation SimpleName equals
welcome banner phasepost success QualifiedName MethodInvocation MethodInvocation SimpleName get welcome phase
equals SimpleName MethodInvocation MethodInvocation SimpleName get welcome phase
send welcome banner SimpleName MethodInvocation SimpleName session
session SimpleName MethodInvocation SimpleName create buffer
session SimpleName MethodInvocation QualifiedName ssh constantsssh msg userauth success
session SimpleName MethodInvocation QualifiedName bytesize
create buffer SimpleName MethodInvocation QualifiedName ssh constantsssh msg userauth success
create buffer SimpleName MethodInvocation QualifiedName bytesize
ssh constantsssh msg userauth success QualifiedName MethodInvocation QualifiedName bytesize
buffer SimpleName Assignment MethodInvocation SimpleName session
buffer SimpleName Assignment MethodInvocation SimpleName create buffer
buffer SimpleName Assignment MethodInvocation QualifiedName ssh constantsssh msg userauth success
buffer SimpleName Assignment MethodInvocation QualifiedName bytesize
session SimpleName MethodInvocation SimpleName write packet
session SimpleName MethodInvocation SimpleName buffer
write packet SimpleName MethodInvocation SimpleName buffer
session SimpleName MethodInvocation SimpleName set username
session SimpleName MethodInvocation SimpleName username
set username SimpleName MethodInvocation SimpleName username
session SimpleName MethodInvocation SimpleName set authenticated
session SimpleName MethodInvocation SimpleName start service
session SimpleName MethodInvocation SimpleName auth service
start service SimpleName MethodInvocation SimpleName auth service
session SimpleName MethodInvocation SimpleName reset idle timeout
session SimpleName MethodInvocation SimpleName get io session
session SimpleName MethodInvocation MethodInvocation SimpleName get remote address
get io session SimpleName MethodInvocation MethodInvocation SimpleName get remote address
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation StringLiteral session {}@{} authenticated
log SimpleName MethodInvocation SimpleName username
log SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName session
log SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get io session
log SimpleName MethodInvocation MethodInvocation SimpleName get remote address
info SimpleName MethodInvocation StringLiteral session {}@{} authenticated
info SimpleName MethodInvocation SimpleName username
info SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName session
info SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get io session
info SimpleName MethodInvocation MethodInvocation SimpleName get remote address
session {}@{} authenticated StringLiteral MethodInvocation SimpleName username
session {}@{} authenticated StringLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName session
session {}@{} authenticated StringLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName get io session
session {}@{} authenticated StringLiteral MethodInvocation MethodInvocation SimpleName get remote address
username SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName session
username SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get io session
username SimpleName MethodInvocation MethodInvocation SimpleName get remote address
auth methods SimpleName MethodInvocation SimpleName stream
generic utils SimpleName ExpressionMethodReference SimpleName is not empty
auth methods SimpleName MethodInvocation MethodInvocation SimpleName filter
stream SimpleName MethodInvocation MethodInvocation SimpleName filter
auth methods SimpleName MethodInvocation MethodInvocation ExpressionMethodReference SimpleName generic utils
auth methods SimpleName MethodInvocation MethodInvocation ExpressionMethodReference SimpleName is not empty
stream SimpleName MethodInvocation MethodInvocation ExpressionMethodReference SimpleName generic utils
stream SimpleName MethodInvocation MethodInvocation ExpressionMethodReference SimpleName is not empty
filter SimpleName MethodInvocation ExpressionMethodReference SimpleName generic utils
filter SimpleName MethodInvocation ExpressionMethodReference SimpleName is not empty
l SimpleName MethodInvocation SimpleName get
l SimpleName MethodInvocation NumberLiteral empty
get SimpleName MethodInvocation NumberLiteral empty
l SimpleName VariableDeclarationFragment LambdaExpression MethodInvocation SimpleName l
l SimpleName VariableDeclarationFragment LambdaExpression MethodInvocation SimpleName get
l SimpleName VariableDeclarationFragment LambdaExpression MethodInvocation NumberLiteral empty
auth methods SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName map
stream SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName map
filter SimpleName MethodInvocation MethodInvocation SimpleName map
generic utils SimpleName ExpressionMethodReference MethodInvocation MethodInvocation SimpleName map
is not empty SimpleName ExpressionMethodReference MethodInvocation MethodInvocation SimpleName map
map SimpleName MethodInvocation LambdaExpression VariableDeclarationFragment SimpleName l
map SimpleName MethodInvocation LambdaExpression MethodInvocation SimpleName l
map SimpleName MethodInvocation LambdaExpression MethodInvocation SimpleName get
map SimpleName MethodInvocation LambdaExpression MethodInvocation NumberLiteral empty
collectors SimpleName MethodInvocation SimpleName joining
collectors SimpleName MethodInvocation StringLiteral empty
joining SimpleName MethodInvocation StringLiteral empty
filter SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName collect
map SimpleName MethodInvocation MethodInvocation SimpleName collect
map SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName collectors
map SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName joining
map SimpleName MethodInvocation MethodInvocation MethodInvocation StringLiteral empty
collect SimpleName MethodInvocation MethodInvocation SimpleName collectors
collect SimpleName MethodInvocation MethodInvocation SimpleName joining
collect SimpleName MethodInvocation MethodInvocation StringLiteral empty
remaining SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName map
remaining SimpleName VariableDeclarationFragment MethodInvocation SimpleName collect
remaining SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName collectors
remaining SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName joining
remaining SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation StringLiteral empty
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName remaining
log SimpleName MethodInvocation SimpleName is debug enabled
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral handle authentication success remaining methods
log SimpleName MethodInvocation SimpleName username
log SimpleName MethodInvocation SimpleName session
log SimpleName MethodInvocation SimpleName remaining
debug SimpleName MethodInvocation StringLiteral handle authentication success remaining methods
debug SimpleName MethodInvocation SimpleName username
debug SimpleName MethodInvocation SimpleName session
debug SimpleName MethodInvocation SimpleName remaining
handle authentication success remaining methods StringLiteral MethodInvocation SimpleName username
handle authentication success remaining methods StringLiteral MethodInvocation SimpleName session
handle authentication success remaining methods StringLiteral MethodInvocation SimpleName remaining
username SimpleName MethodInvocation SimpleName session
username SimpleName MethodInvocation SimpleName remaining
session SimpleName MethodInvocation SimpleName remaining
remaining SimpleName MethodInvocation SimpleName length
remaining SimpleName MethodInvocation InfixExpression QualifiedName bytesize
length SimpleName MethodInvocation InfixExpression QualifiedName bytesize
session SimpleName MethodInvocation SimpleName create buffer
session SimpleName MethodInvocation QualifiedName ssh constantsssh msg userauth failure
session SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName remaining
session SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName length
session SimpleName MethodInvocation InfixExpression QualifiedName bytesize
create buffer SimpleName MethodInvocation QualifiedName ssh constantsssh msg userauth failure
create buffer SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName remaining
create buffer SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName length
create buffer SimpleName MethodInvocation InfixExpression QualifiedName bytesize
ssh constantsssh msg userauth failure QualifiedName MethodInvocation InfixExpression MethodInvocation SimpleName remaining
ssh constantsssh msg userauth failure QualifiedName MethodInvocation InfixExpression MethodInvocation SimpleName length
ssh constantsssh msg userauth failure QualifiedName MethodInvocation InfixExpression QualifiedName bytesize
buffer SimpleName Assignment MethodInvocation SimpleName session
buffer SimpleName Assignment MethodInvocation SimpleName create buffer
buffer SimpleName Assignment MethodInvocation QualifiedName ssh constantsssh msg userauth failure
buffer SimpleName Assignment MethodInvocation InfixExpression QualifiedName bytesize
buffer SimpleName MethodInvocation SimpleName put string
buffer SimpleName MethodInvocation SimpleName remaining
put string SimpleName MethodInvocation SimpleName remaining
buffer SimpleName MethodInvocation SimpleName put boolean
buffer SimpleName MethodInvocation BooleanLiteral true
put boolean SimpleName MethodInvocation BooleanLiteral true
session SimpleName MethodInvocation SimpleName write packet
session SimpleName MethodInvocation SimpleName buffer
write packet SimpleName MethodInvocation SimpleName buffer
current auth SimpleName MethodInvocation SimpleName destroy
boolean PrimitiveType VariableDeclarationStatement Block EnhancedForStatement SimpleName auth methods
boolean PrimitiveType VariableDeclarationStatement Block IfStatement SimpleName success
auth methods SimpleName EnhancedForStatement Block IfStatement SimpleName success
protected Modifier MethodDeclaration PrimitiveType void
protected Modifier MethodDeclaration SimpleName handle authentication success
protected Modifier MethodDeclaration SingleVariableDeclaration PrimitiveType int
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleName cmd
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName buffer
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleName buffer
protected Modifier MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration SimpleName handle authentication success
void PrimitiveType MethodDeclaration SingleVariableDeclaration PrimitiveType int
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName cmd
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName buffer
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName buffer
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType boolean
void PrimitiveType MethodDeclaration Block EnhancedForStatement SimpleName auth methods
void PrimitiveType MethodDeclaration Block IfStatement SimpleName success
handle authentication success SimpleName MethodDeclaration SingleVariableDeclaration PrimitiveType int
handle authentication success SimpleName MethodDeclaration SingleVariableDeclaration SimpleName cmd
handle authentication success SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName buffer
handle authentication success SimpleName MethodDeclaration SingleVariableDeclaration SimpleName buffer
handle authentication success SimpleName MethodDeclaration SimpleType SimpleName exception
handle authentication success SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType boolean
handle authentication success SimpleName MethodDeclaration Block EnhancedForStatement SimpleName auth methods
handle authentication success SimpleName MethodDeclaration Block IfStatement SimpleName success
int PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName buffer
cmd SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName buffer
int PrimitiveType SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
cmd SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
buffer SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier protected
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName handle authentication success
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName cmd
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName buffer
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration Modifier protected
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName handle authentication success
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName cmd
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName buffer
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
