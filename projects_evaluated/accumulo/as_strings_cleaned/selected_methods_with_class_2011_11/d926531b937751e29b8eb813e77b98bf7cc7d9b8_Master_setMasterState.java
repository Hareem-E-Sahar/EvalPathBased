master state SimpleName SimpleType SingleVariableDeclaration SimpleName new state
state SimpleName MethodInvocation SimpleName equals
state SimpleName MethodInvocation SimpleName new state
equals SimpleName MethodInvocation SimpleName new state
state SimpleName MethodInvocation SimpleName ordinal
transition ok SimpleName ArrayAccess MethodInvocation SimpleName state
transition ok SimpleName ArrayAccess MethodInvocation SimpleName ordinal
new state SimpleName MethodInvocation SimpleName ordinal
transition ok SimpleName ArrayAccess ArrayAccess MethodInvocation SimpleName new state
transition ok SimpleName ArrayAccess ArrayAccess MethodInvocation SimpleName ordinal
programmer error master should not transition from StringLiteral InfixExpression SimpleName state
programmer error master should not transition from StringLiteral InfixExpression StringLiteral to
programmer error master should not transition from StringLiteral InfixExpression SimpleName new state
state SimpleName InfixExpression StringLiteral to
state SimpleName InfixExpression SimpleName new state
to StringLiteral InfixExpression SimpleName new state
log SimpleName MethodInvocation SimpleName error
log SimpleName MethodInvocation InfixExpression StringLiteral programmer error master should not transition from
log SimpleName MethodInvocation InfixExpression SimpleName state
log SimpleName MethodInvocation InfixExpression StringLiteral to
log SimpleName MethodInvocation InfixExpression SimpleName new state
error SimpleName MethodInvocation InfixExpression StringLiteral programmer error master should not transition from
error SimpleName MethodInvocation InfixExpression SimpleName state
error SimpleName MethodInvocation InfixExpression StringLiteral to
error SimpleName MethodInvocation InfixExpression SimpleName new state
old state SimpleName VariableDeclarationFragment SimpleName state
master state SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName old state
master state SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName state
state SimpleName Assignment SimpleName new state
next event SimpleName MethodInvocation SimpleName event
next event SimpleName MethodInvocation StringLiteral state changed from s to s
next event SimpleName MethodInvocation SimpleName old state
next event SimpleName MethodInvocation SimpleName new state
event SimpleName MethodInvocation StringLiteral state changed from s to s
event SimpleName MethodInvocation SimpleName old state
event SimpleName MethodInvocation SimpleName new state
state changed from s to s StringLiteral MethodInvocation SimpleName old state
state changed from s to s StringLiteral MethodInvocation SimpleName new state
old state SimpleName MethodInvocation SimpleName new state
new state SimpleName InfixExpression QualifiedName master statestop
simple timer SimpleName MethodInvocation SimpleName get instance
client service SimpleName MethodInvocation SimpleName stop
override SimpleName MarkerAnnotation MethodDeclaration Modifier public
override SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
override SimpleName MarkerAnnotation MethodDeclaration SimpleName run
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName run
void PrimitiveType MethodDeclaration SimpleName run
simple timer SimpleName MethodInvocation MethodInvocation SimpleName schedule
get instance SimpleName MethodInvocation MethodInvocation SimpleName schedule
simple timer SimpleName MethodInvocation MethodInvocation NumberLiteral l
get instance SimpleName MethodInvocation MethodInvocation NumberLiteral l
simple timer SimpleName MethodInvocation MethodInvocation NumberLiteral l
get instance SimpleName MethodInvocation MethodInvocation NumberLiteral l
schedule SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName timer task
schedule SimpleName MethodInvocation NumberLiteral l
schedule SimpleName MethodInvocation NumberLiteral l
timer task SimpleName SimpleType ClassInstanceCreation MethodInvocation NumberLiteral l
timer task SimpleName SimpleType ClassInstanceCreation MethodInvocation NumberLiteral l
l NumberLiteral MethodInvocation NumberLiteral l
old state SimpleName InfixExpression SimpleName new state
new state SimpleName InfixExpression QualifiedName master statehave lock
old state SimpleName InfixExpression SimpleName new state
new state SimpleName InfixExpression QualifiedName master statenormal
synchronized Modifier MethodDeclaration Modifier private
synchronized Modifier MethodDeclaration PrimitiveType void
synchronized Modifier MethodDeclaration SimpleName set master state
synchronized Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName master state
synchronized Modifier MethodDeclaration SingleVariableDeclaration SimpleName new state
private Modifier MethodDeclaration PrimitiveType void
private Modifier MethodDeclaration SimpleName set master state
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName master state
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName new state
void PrimitiveType MethodDeclaration SimpleName set master state
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName master state
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName new state
set master state SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName master state
set master state SimpleName MethodDeclaration SingleVariableDeclaration SimpleName new state
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier synchronized
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName set master state
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName new state
test SimpleName TypeDeclaration MethodDeclaration Modifier synchronized
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName set master state
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName new state