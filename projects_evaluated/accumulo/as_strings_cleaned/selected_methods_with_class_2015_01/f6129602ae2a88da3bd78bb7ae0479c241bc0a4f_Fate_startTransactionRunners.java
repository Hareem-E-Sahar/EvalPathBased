int PrimitiveType SingleVariableDeclaration SimpleName num threads
atomic integer SimpleName SimpleType ClassInstanceCreation NumberLiteral empty
runner count SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName atomic integer
runner count SimpleName VariableDeclarationFragment ClassInstanceCreation NumberLiteral empty
final Modifier VariableDeclarationStatement SimpleType SimpleName atomic integer
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName runner count
final Modifier VariableDeclarationStatement VariableDeclarationFragment ClassInstanceCreation NumberLiteral empty
atomic integer SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName runner count
runnable SimpleName SimpleType SingleVariableDeclaration SimpleName r
logging runnable SimpleName SimpleType ClassInstanceCreation SimpleName log
logging runnable SimpleName SimpleType ClassInstanceCreation SimpleName r
log SimpleName ClassInstanceCreation SimpleName r
runner count SimpleName MethodInvocation SimpleName get and increment
repo runner StringLiteral InfixExpression MethodInvocation SimpleName runner count
repo runner StringLiteral InfixExpression MethodInvocation SimpleName get and increment
thread SimpleName SimpleType ClassInstanceCreation ClassInstanceCreation SimpleName log
thread SimpleName SimpleType ClassInstanceCreation ClassInstanceCreation SimpleName r
thread SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral repo runner
log SimpleName ClassInstanceCreation ClassInstanceCreation InfixExpression StringLiteral repo runner
r SimpleName ClassInstanceCreation ClassInstanceCreation InfixExpression StringLiteral repo runner
t SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName thread
t SimpleName VariableDeclarationFragment ClassInstanceCreation ClassInstanceCreation SimpleName log
t SimpleName VariableDeclarationFragment ClassInstanceCreation ClassInstanceCreation SimpleName r
t SimpleName VariableDeclarationFragment ClassInstanceCreation InfixExpression StringLiteral repo runner
thread SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName t
t SimpleName MethodInvocation SimpleName set daemon
t SimpleName MethodInvocation BooleanLiteral true
set daemon SimpleName MethodInvocation BooleanLiteral true
override SimpleName MarkerAnnotation MethodDeclaration Modifier public
override SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName thread
override SimpleName MarkerAnnotation MethodDeclaration SimpleName new thread
override SimpleName MarkerAnnotation MethodDeclaration SingleVariableDeclaration SimpleName r
public Modifier MethodDeclaration SimpleType SimpleName thread
public Modifier MethodDeclaration SimpleName new thread
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName runnable
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName r
public Modifier MethodDeclaration Block ReturnStatement SimpleName t
thread SimpleName SimpleType MethodDeclaration SimpleName new thread
thread SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName r
new thread SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName runnable
new thread SimpleName MethodDeclaration SingleVariableDeclaration SimpleName r
new thread SimpleName MethodDeclaration Block ReturnStatement SimpleName t
executors SimpleName MethodInvocation SimpleName new fixed thread pool
executors SimpleName MethodInvocation SimpleName num threads
executors SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName thread factory
new fixed thread pool SimpleName MethodInvocation SimpleName num threads
new fixed thread pool SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName thread factory
num threads SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName thread factory
executor SimpleName Assignment MethodInvocation SimpleName executors
executor SimpleName Assignment MethodInvocation SimpleName new fixed thread pool
executor SimpleName Assignment MethodInvocation SimpleName num threads
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression SimpleName num threads
executor SimpleName MethodInvocation SimpleName execute
executor SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName transaction runner
execute SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName transaction runner
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName num threads
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
num threads SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName start transaction runners
public Modifier MethodDeclaration SingleVariableDeclaration PrimitiveType int
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName num threads
public Modifier MethodDeclaration Block VariableDeclarationStatement Modifier final
void PrimitiveType MethodDeclaration SimpleName start transaction runners
void PrimitiveType MethodDeclaration SingleVariableDeclaration PrimitiveType int
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName num threads
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement Modifier final
start transaction runners SimpleName MethodDeclaration SingleVariableDeclaration PrimitiveType int
start transaction runners SimpleName MethodDeclaration SingleVariableDeclaration SimpleName num threads
start transaction runners SimpleName MethodDeclaration Block VariableDeclarationStatement Modifier final
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName start transaction runners
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName num threads
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName start transaction runners
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName num threads
