buffer SimpleName SimpleType SingleVariableDeclaration SimpleName buffer
long PrimitiveType SingleVariableDeclaration SimpleName timeout
time unit SimpleName SimpleType SingleVariableDeclaration SimpleName unit
timeout SimpleName InfixExpression NumberLiteral l
validate utils SimpleName MethodInvocation SimpleName check true
validate utils SimpleName MethodInvocation InfixExpression SimpleName timeout
validate utils SimpleName MethodInvocation InfixExpression NumberLiteral l
validate utils SimpleName MethodInvocation StringLiteral nonpositive timeout requested d
validate utils SimpleName MethodInvocation SimpleName timeout
check true SimpleName MethodInvocation InfixExpression SimpleName timeout
check true SimpleName MethodInvocation InfixExpression NumberLiteral l
check true SimpleName MethodInvocation StringLiteral nonpositive timeout requested d
check true SimpleName MethodInvocation SimpleName timeout
timeout SimpleName InfixExpression MethodInvocation StringLiteral nonpositive timeout requested d
l NumberLiteral InfixExpression MethodInvocation StringLiteral nonpositive timeout requested d
timeout SimpleName InfixExpression MethodInvocation SimpleName timeout
l NumberLiteral InfixExpression MethodInvocation SimpleName timeout
nonpositive timeout requested d StringLiteral MethodInvocation SimpleName timeout
time unitmilliseconds QualifiedName MethodInvocation SimpleName convert
time unitmilliseconds QualifiedName MethodInvocation SimpleName timeout
time unitmilliseconds QualifiedName MethodInvocation SimpleName unit
convert SimpleName MethodInvocation SimpleName timeout
convert SimpleName MethodInvocation SimpleName unit
timeout SimpleName MethodInvocation SimpleName unit
max wait millis SimpleName VariableDeclarationFragment MethodInvocation QualifiedName time unitmilliseconds
max wait millis SimpleName VariableDeclarationFragment MethodInvocation SimpleName convert
max wait millis SimpleName VariableDeclarationFragment MethodInvocation SimpleName timeout
max wait millis SimpleName VariableDeclarationFragment MethodInvocation SimpleName unit
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName max wait millis
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation QualifiedName time unitmilliseconds
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName convert
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName timeout
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName unit
max wait millis SimpleName InfixExpression NumberLiteral l
requested timeout below msec StringLiteral InfixExpression SimpleName timeout
requested timeout below msec StringLiteral InfixExpression StringLiteral empty
requested timeout below msec StringLiteral InfixExpression SimpleName unit
timeout SimpleName InfixExpression StringLiteral empty
timeout SimpleName InfixExpression SimpleName unit
empty StringLiteral InfixExpression SimpleName unit
illegal argument exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral requested timeout below msec
illegal argument exception SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName timeout
illegal argument exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral empty
illegal argument exception SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName unit
object SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName result
write packet SimpleName MethodInvocation SimpleName buffer
max wait millis SimpleName InfixExpression NumberLiteral l
request result SimpleName MethodInvocation SimpleName get
system SimpleName MethodInvocation SimpleName nano time
wait start SimpleName VariableDeclarationFragment MethodInvocation SimpleName system
wait start SimpleName VariableDeclarationFragment MethodInvocation SimpleName nano time
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName wait start
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName system
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName nano time
request result SimpleName MethodInvocation SimpleName wait
request result SimpleName MethodInvocation SimpleName max wait millis
wait SimpleName MethodInvocation SimpleName max wait millis
system SimpleName MethodInvocation SimpleName nano time
wait end SimpleName VariableDeclarationFragment MethodInvocation SimpleName system
wait end SimpleName VariableDeclarationFragment MethodInvocation SimpleName nano time
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName wait end
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName system
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName nano time
wait end SimpleName InfixExpression SimpleName wait start
wait duration SimpleName VariableDeclarationFragment InfixExpression SimpleName wait end
wait duration SimpleName VariableDeclarationFragment InfixExpression SimpleName wait start
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName wait duration
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment InfixExpression SimpleName wait end
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment InfixExpression SimpleName wait start
time unitnanoseconds QualifiedName MethodInvocation SimpleName to millis
time unitnanoseconds QualifiedName MethodInvocation SimpleName wait duration
to millis SimpleName MethodInvocation SimpleName wait duration
wait millis SimpleName VariableDeclarationFragment MethodInvocation QualifiedName time unitnanoseconds
wait millis SimpleName VariableDeclarationFragment MethodInvocation SimpleName to millis
wait millis SimpleName VariableDeclarationFragment MethodInvocation SimpleName wait duration
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName wait millis
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation QualifiedName time unitnanoseconds
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName to millis
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName wait duration
wait millis SimpleName InfixExpression NumberLiteral l
max wait millis SimpleName Assignment SimpleName wait millis
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType long
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType long
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType long
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType long
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType long
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType long
request result SimpleName MethodInvocation SimpleName get and set
result SimpleName Assignment MethodInvocation SimpleName request result
result SimpleName Assignment MethodInvocation SimpleName get and set
interrupted exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
interrupted io exception SimpleName SimpleType ClassInstanceCreation StringLiteral interrupted while waiting for request result
interrupted io exception SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName init cause
interrupted while waiting for request result StringLiteral ClassInstanceCreation MethodInvocation SimpleName init cause
interrupted io exception SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName e
interrupted while waiting for request result StringLiteral ClassInstanceCreation MethodInvocation SimpleName e
init cause SimpleName MethodInvocation SimpleName e
interrupted io exception SimpleName SimpleType CastExpression MethodInvocation SimpleName init cause
interrupted io exception SimpleName SimpleType CastExpression MethodInvocation SimpleName e
io exception SimpleName SimpleType ClassInstanceCreation StringLiteral session is closed or closing
no response received after StringLiteral InfixExpression SimpleName timeout
no response received after StringLiteral InfixExpression StringLiteral empty
no response received after StringLiteral InfixExpression SimpleName unit
timeout SimpleName InfixExpression StringLiteral empty
timeout SimpleName InfixExpression SimpleName unit
empty StringLiteral InfixExpression SimpleName unit
socket timeout exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral no response received after
socket timeout exception SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName timeout
socket timeout exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral empty
socket timeout exception SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName unit
result SimpleName InstanceofExpression SimpleType SimpleName buffer
buffer SimpleName SimpleType CastExpression SimpleName result
long PrimitiveType VariableDeclarationStatement Block SynchronizedStatement SimpleName request lock
override SimpleName MarkerAnnotation MethodDeclaration Modifier public
override SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName buffer
override SimpleName MarkerAnnotation MethodDeclaration SimpleName request
override SimpleName MarkerAnnotation MethodDeclaration SingleVariableDeclaration SimpleName buffer
override SimpleName MarkerAnnotation MethodDeclaration SingleVariableDeclaration PrimitiveType long
override SimpleName MarkerAnnotation MethodDeclaration SingleVariableDeclaration SimpleName timeout
public Modifier MethodDeclaration SimpleType SimpleName buffer
public Modifier MethodDeclaration SimpleName request
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName buffer
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName buffer
public Modifier MethodDeclaration SingleVariableDeclaration PrimitiveType long
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName timeout
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName time unit
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName unit
buffer SimpleName SimpleType MethodDeclaration SimpleName request
buffer SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName buffer
buffer SimpleName SimpleType MethodDeclaration SingleVariableDeclaration PrimitiveType long
buffer SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName timeout
buffer SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName unit
buffer SimpleName SimpleType MethodDeclaration SimpleType SimpleName io exception
request SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName buffer
request SimpleName MethodDeclaration SingleVariableDeclaration SimpleName buffer
request SimpleName MethodDeclaration SingleVariableDeclaration PrimitiveType long
request SimpleName MethodDeclaration SingleVariableDeclaration SimpleName timeout
request SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName time unit
request SimpleName MethodDeclaration SingleVariableDeclaration SimpleName unit
request SimpleName MethodDeclaration SimpleType SimpleName io exception
request SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType long
request SimpleName MethodDeclaration Block SynchronizedStatement SimpleName request lock
buffer SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType long
buffer SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName timeout
buffer SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName unit
buffer SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
long PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName unit
timeout SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName unit
long PrimitiveType SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
timeout SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
unit SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName override
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName buffer
public Modifier TypeDeclaration MethodDeclaration SimpleName request
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName buffer
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType long
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName timeout
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName unit
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName override
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName buffer
test SimpleName TypeDeclaration MethodDeclaration SimpleName request
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName buffer
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType long
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName timeout
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName unit
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
