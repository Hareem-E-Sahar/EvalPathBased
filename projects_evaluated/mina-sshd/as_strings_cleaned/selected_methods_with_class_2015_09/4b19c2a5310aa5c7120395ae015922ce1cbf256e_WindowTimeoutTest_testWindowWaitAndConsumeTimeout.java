channel SimpleName MethodInvocation SimpleName get local window
window SimpleName VariableDeclarationFragment MethodInvocation SimpleName channel
window SimpleName VariableDeclarationFragment MethodInvocation SimpleName get local window
window SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName window
window SimpleName MethodInvocation SimpleName init
window SimpleName MethodInvocation QualifiedName abstract channeldefault window size
window SimpleName MethodInvocation QualifiedName abstract channeldefault packet size
init SimpleName MethodInvocation QualifiedName abstract channeldefault window size
init SimpleName MethodInvocation QualifiedName abstract channeldefault packet size
abstract channeldefault window size QualifiedName MethodInvocation QualifiedName abstract channeldefault packet size
system SimpleName MethodInvocation SimpleName nano time
wait start SimpleName VariableDeclarationFragment MethodInvocation SimpleName system
wait start SimpleName VariableDeclarationFragment MethodInvocation SimpleName nano time
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName wait start
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName system
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName nano time
window SimpleName MethodInvocation SimpleName get size
empty NumberLiteral InfixExpression MethodInvocation SimpleName window
empty NumberLiteral InfixExpression MethodInvocation SimpleName get size
window SimpleName MethodInvocation SimpleName wait and consume
window SimpleName MethodInvocation InfixExpression NumberLiteral empty
window SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName window
window SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get size
window SimpleName MethodInvocation SimpleName max wait time
wait and consume SimpleName MethodInvocation InfixExpression NumberLiteral empty
wait and consume SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName window
wait and consume SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get size
wait and consume SimpleName MethodInvocation SimpleName max wait time
empty NumberLiteral InfixExpression MethodInvocation SimpleName max wait time
window SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName max wait time
get size SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName max wait time
fail SimpleName MethodInvocation StringLiteral unexpected timed wait success
socket timeout exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
system SimpleName MethodInvocation SimpleName nano time
wait end SimpleName VariableDeclarationFragment MethodInvocation SimpleName system
wait end SimpleName VariableDeclarationFragment MethodInvocation SimpleName nano time
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName wait end
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName system
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName nano time
wait end SimpleName InfixExpression SimpleName wait start
time unitnanoseconds QualifiedName MethodInvocation SimpleName to millis
time unitnanoseconds QualifiedName MethodInvocation InfixExpression SimpleName wait end
time unitnanoseconds QualifiedName MethodInvocation InfixExpression SimpleName wait start
to millis SimpleName MethodInvocation InfixExpression SimpleName wait end
to millis SimpleName MethodInvocation InfixExpression SimpleName wait start
wait duration SimpleName VariableDeclarationFragment MethodInvocation QualifiedName time unitnanoseconds
wait duration SimpleName VariableDeclarationFragment MethodInvocation SimpleName to millis
wait duration SimpleName VariableDeclarationFragment MethodInvocation InfixExpression SimpleName wait end
wait duration SimpleName VariableDeclarationFragment MethodInvocation InfixExpression SimpleName wait start
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName wait duration
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation QualifiedName time unitnanoseconds
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName to millis
timeout too soon StringLiteral InfixExpression SimpleName wait duration
max wait time SimpleName InfixExpression NumberLiteral l
wait duration SimpleName InfixExpression ParenthesizedExpression InfixExpression SimpleName max wait time
wait duration SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral l
assert true SimpleName MethodInvocation InfixExpression StringLiteral timeout too soon
assert true SimpleName MethodInvocation InfixExpression SimpleName wait duration
assert true SimpleName MethodInvocation InfixExpression SimpleName wait duration
timeout too soon StringLiteral InfixExpression MethodInvocation InfixExpression SimpleName wait duration
wait duration SimpleName InfixExpression MethodInvocation InfixExpression SimpleName wait duration
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType long
window SimpleName MethodInvocation SimpleName close
window SimpleName MethodInvocation SimpleName is open
assert false SimpleName MethodInvocation StringLiteral window not closed
assert false SimpleName MethodInvocation MethodInvocation SimpleName window
assert false SimpleName MethodInvocation MethodInvocation SimpleName is open
window not closed StringLiteral MethodInvocation MethodInvocation SimpleName window
window not closed StringLiteral MethodInvocation MethodInvocation SimpleName is open
window SimpleName MethodInvocation SimpleName get size
empty NumberLiteral InfixExpression MethodInvocation SimpleName window
empty NumberLiteral InfixExpression MethodInvocation SimpleName get size
window SimpleName MethodInvocation SimpleName wait and consume
window SimpleName MethodInvocation InfixExpression NumberLiteral empty
window SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName window
window SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get size
window SimpleName MethodInvocation SimpleName max wait time
wait and consume SimpleName MethodInvocation InfixExpression NumberLiteral empty
wait and consume SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName window
wait and consume SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get size
wait and consume SimpleName MethodInvocation SimpleName max wait time
empty NumberLiteral InfixExpression MethodInvocation SimpleName max wait time
window SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName max wait time
get size SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName max wait time
fail SimpleName MethodInvocation StringLiteral unexpected closed wait success
window closed exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test window wait and consume timeout
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test window wait and consume timeout
public Modifier MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration SimpleName test window wait and consume timeout
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
test window wait and consume timeout SimpleName MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test window wait and consume timeout
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test window wait and consume timeout
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
