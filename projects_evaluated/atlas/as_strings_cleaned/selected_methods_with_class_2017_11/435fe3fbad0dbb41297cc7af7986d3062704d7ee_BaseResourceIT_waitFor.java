int PrimitiveType SingleVariableDeclaration SimpleName timeout
predicate SimpleName SimpleType SingleVariableDeclaration SimpleName predicate
param checker SimpleName MethodInvocation SimpleName not null
param checker SimpleName MethodInvocation SimpleName predicate
param checker SimpleName MethodInvocation StringLiteral predicate
not null SimpleName MethodInvocation SimpleName predicate
not null SimpleName MethodInvocation StringLiteral predicate
predicate SimpleName MethodInvocation StringLiteral predicate
system SimpleName MethodInvocation SimpleName current time millis
system SimpleName MethodInvocation InfixExpression SimpleName timeout
current time millis SimpleName MethodInvocation InfixExpression SimpleName timeout
must end SimpleName VariableDeclarationFragment InfixExpression MethodInvocation SimpleName system
must end SimpleName VariableDeclarationFragment InfixExpression MethodInvocation SimpleName current time millis
must end SimpleName VariableDeclarationFragment InfixExpression SimpleName timeout
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName must end
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment InfixExpression SimpleName timeout
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName eval
predicate SimpleName MethodInvocation SimpleName evaluate
eval SimpleName Assignment MethodInvocation SimpleName predicate
eval SimpleName Assignment MethodInvocation SimpleName evaluate
system SimpleName MethodInvocation SimpleName current time millis
system SimpleName MethodInvocation InfixExpression SimpleName must end
current time millis SimpleName MethodInvocation InfixExpression SimpleName must end
system SimpleName MethodInvocation SimpleName current time millis
must end SimpleName InfixExpression MethodInvocation SimpleName system
must end SimpleName InfixExpression MethodInvocation SimpleName current time millis
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation StringLiteral waiting up to {} msec
log SimpleName MethodInvocation InfixExpression SimpleName must end
log SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName system
log SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName current time millis
info SimpleName MethodInvocation StringLiteral waiting up to {} msec
info SimpleName MethodInvocation InfixExpression SimpleName must end
info SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName system
info SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName current time millis
waiting up to {} msec StringLiteral MethodInvocation InfixExpression SimpleName must end
waiting up to {} msec StringLiteral MethodInvocation InfixExpression MethodInvocation SimpleName system
waiting up to {} msec StringLiteral MethodInvocation InfixExpression MethodInvocation SimpleName current time millis
thread SimpleName MethodInvocation SimpleName sleep
thread SimpleName MethodInvocation NumberLiteral empty
sleep SimpleName MethodInvocation NumberLiteral empty
waiting timed out after StringLiteral InfixExpression SimpleName timeout
waiting timed out after StringLiteral InfixExpression StringLiteral msec
timeout SimpleName InfixExpression StringLiteral msec
exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral waiting timed out after
exception SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName timeout
exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral msec
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType boolean
protected Modifier MethodDeclaration PrimitiveType void
protected Modifier MethodDeclaration SimpleName wait for
protected Modifier MethodDeclaration SingleVariableDeclaration PrimitiveType int
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleName timeout
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName predicate
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleName predicate
protected Modifier MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration SimpleName wait for
void PrimitiveType MethodDeclaration SingleVariableDeclaration PrimitiveType int
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName timeout
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName predicate
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName predicate
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType long
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType boolean
wait for SimpleName MethodDeclaration SingleVariableDeclaration PrimitiveType int
wait for SimpleName MethodDeclaration SingleVariableDeclaration SimpleName timeout
wait for SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName predicate
wait for SimpleName MethodDeclaration SingleVariableDeclaration SimpleName predicate
wait for SimpleName MethodDeclaration SimpleType SimpleName exception
wait for SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType long
wait for SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType boolean
int PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName predicate
timeout SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName predicate
int PrimitiveType SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
timeout SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
predicate SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier protected
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName wait for
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName timeout
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName predicate
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration Modifier protected
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName wait for
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName timeout
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName predicate
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
