int PrimitiveType SingleVariableDeclaration SimpleName mask
long PrimitiveType SingleVariableDeclaration SimpleName timeout
t SimpleName VariableDeclarationFragment NumberLiteral l
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName t
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment NumberLiteral l
cond SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName cond
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment NumberLiteral empty
close future SimpleName MethodInvocation SimpleName is closed
cond SimpleName Assignment QualifiedName client sessionclosed
cond SimpleName Assignment SimpleName authed
kex state SimpleName MethodInvocation SimpleName get
kex statedone QualifiedName MethodInvocation SimpleName equals
kex statedone QualifiedName MethodInvocation MethodInvocation SimpleName kex state
kex statedone QualifiedName MethodInvocation MethodInvocation SimpleName get
equals SimpleName MethodInvocation MethodInvocation SimpleName kex state
equals SimpleName MethodInvocation MethodInvocation SimpleName get
auth future SimpleName MethodInvocation SimpleName is failure
kex statedone QualifiedName MethodInvocation InfixExpression MethodInvocation SimpleName auth future
kex statedone QualifiedName MethodInvocation InfixExpression MethodInvocation SimpleName is failure
equals SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName auth future
equals SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName is failure
cond SimpleName Assignment SimpleName wait auth
cond SimpleName InfixExpression SimpleName mask
cond SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
mask SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
log SimpleName MethodInvocation SimpleName is trace enabled
integer SimpleName MethodInvocation SimpleName to hex string
integer SimpleName MethodInvocation SimpleName mask
to hex string SimpleName MethodInvocation SimpleName mask
integer SimpleName MethodInvocation SimpleName to hex string
integer SimpleName MethodInvocation SimpleName cond
to hex string SimpleName MethodInvocation SimpleName cond
log SimpleName MethodInvocation SimpleName trace
log SimpleName MethodInvocation StringLiteral wait for call returning on session {} mask x cond x
log SimpleName MethodInvocation MethodInvocation SimpleName integer
log SimpleName MethodInvocation MethodInvocation SimpleName to hex string
log SimpleName MethodInvocation MethodInvocation SimpleName mask
log SimpleName MethodInvocation MethodInvocation SimpleName integer
log SimpleName MethodInvocation MethodInvocation SimpleName to hex string
log SimpleName MethodInvocation MethodInvocation SimpleName cond
trace SimpleName MethodInvocation StringLiteral wait for call returning on session {} mask x cond x
trace SimpleName MethodInvocation MethodInvocation SimpleName integer
trace SimpleName MethodInvocation MethodInvocation SimpleName to hex string
trace SimpleName MethodInvocation MethodInvocation SimpleName mask
trace SimpleName MethodInvocation MethodInvocation SimpleName integer
trace SimpleName MethodInvocation MethodInvocation SimpleName to hex string
trace SimpleName MethodInvocation MethodInvocation SimpleName cond
wait for call returning on session {} mask x cond x StringLiteral MethodInvocation MethodInvocation SimpleName integer
wait for call returning on session {} mask x cond x StringLiteral MethodInvocation MethodInvocation SimpleName to hex string
wait for call returning on session {} mask x cond x StringLiteral MethodInvocation MethodInvocation SimpleName mask
wait for call returning on session {} mask x cond x StringLiteral MethodInvocation MethodInvocation SimpleName integer
wait for call returning on session {} mask x cond x StringLiteral MethodInvocation MethodInvocation SimpleName to hex string
wait for call returning on session {} mask x cond x StringLiteral MethodInvocation MethodInvocation SimpleName cond
integer SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName integer
integer SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to hex string
integer SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName cond
to hex string SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName integer
to hex string SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to hex string
to hex string SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName cond
mask SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName integer
mask SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to hex string
mask SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName cond
timeout SimpleName InfixExpression NumberLiteral l
t SimpleName InfixExpression NumberLiteral l
system SimpleName MethodInvocation SimpleName current time millis
system SimpleName MethodInvocation InfixExpression SimpleName timeout
current time millis SimpleName MethodInvocation InfixExpression SimpleName timeout
t SimpleName Assignment InfixExpression MethodInvocation SimpleName system
t SimpleName Assignment InfixExpression MethodInvocation SimpleName current time millis
t SimpleName Assignment InfixExpression SimpleName timeout
system SimpleName MethodInvocation SimpleName current time millis
t SimpleName InfixExpression MethodInvocation SimpleName system
t SimpleName InfixExpression MethodInvocation SimpleName current time millis
timeout SimpleName Assignment InfixExpression SimpleName t
timeout SimpleName Assignment InfixExpression MethodInvocation SimpleName system
timeout SimpleName Assignment InfixExpression MethodInvocation SimpleName current time millis
timeout SimpleName InfixExpression NumberLiteral l
log SimpleName MethodInvocation SimpleName is trace enabled
integer SimpleName MethodInvocation SimpleName to hex string
integer SimpleName MethodInvocation SimpleName mask
to hex string SimpleName MethodInvocation SimpleName mask
log SimpleName MethodInvocation SimpleName trace
log SimpleName MethodInvocation StringLiteral wait for call timeout on session {} mask x
log SimpleName MethodInvocation MethodInvocation SimpleName integer
log SimpleName MethodInvocation MethodInvocation SimpleName to hex string
log SimpleName MethodInvocation MethodInvocation SimpleName mask
trace SimpleName MethodInvocation StringLiteral wait for call timeout on session {} mask x
trace SimpleName MethodInvocation MethodInvocation SimpleName integer
trace SimpleName MethodInvocation MethodInvocation SimpleName to hex string
trace SimpleName MethodInvocation MethodInvocation SimpleName mask
wait for call timeout on session {} mask x StringLiteral MethodInvocation MethodInvocation SimpleName integer
wait for call timeout on session {} mask x StringLiteral MethodInvocation MethodInvocation SimpleName to hex string
wait for call timeout on session {} mask x StringLiteral MethodInvocation MethodInvocation SimpleName mask
cond SimpleName Assignment SimpleName timeout
log SimpleName MethodInvocation SimpleName is trace enabled
log SimpleName MethodInvocation SimpleName trace
log SimpleName MethodInvocation StringLiteral waiting {} millis for lock on session {} mask cond
log SimpleName MethodInvocation SimpleName timeout
log SimpleName MethodInvocation SimpleName mask
trace SimpleName MethodInvocation StringLiteral waiting {} millis for lock on session {} mask cond
trace SimpleName MethodInvocation SimpleName timeout
trace SimpleName MethodInvocation SimpleName mask
trace SimpleName MethodInvocation SimpleName cond
waiting {} millis for lock on session {} mask cond StringLiteral MethodInvocation SimpleName timeout
waiting {} millis for lock on session {} mask cond StringLiteral MethodInvocation SimpleName mask
waiting {} millis for lock on session {} mask cond StringLiteral MethodInvocation SimpleName cond
timeout SimpleName MethodInvocation SimpleName mask
timeout SimpleName MethodInvocation SimpleName cond
mask SimpleName MethodInvocation SimpleName cond
system SimpleName MethodInvocation SimpleName nano time
nano start SimpleName VariableDeclarationFragment MethodInvocation SimpleName system
nano start SimpleName VariableDeclarationFragment MethodInvocation SimpleName nano time
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName nano start
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName system
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName nano time
timeout SimpleName InfixExpression NumberLiteral empty
lock SimpleName MethodInvocation SimpleName wait
lock SimpleName MethodInvocation SimpleName timeout
wait SimpleName MethodInvocation SimpleName timeout
lock SimpleName MethodInvocation SimpleName wait
system SimpleName MethodInvocation SimpleName nano time
nano end SimpleName VariableDeclarationFragment MethodInvocation SimpleName system
nano end SimpleName VariableDeclarationFragment MethodInvocation SimpleName nano time
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName nano end
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName system
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName nano time
nano end SimpleName InfixExpression SimpleName nano start
nano duration SimpleName VariableDeclarationFragment InfixExpression SimpleName nano end
nano duration SimpleName VariableDeclarationFragment InfixExpression SimpleName nano start
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName nano duration
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment InfixExpression SimpleName nano end
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment InfixExpression SimpleName nano start
log SimpleName MethodInvocation SimpleName is trace enabled
log SimpleName MethodInvocation SimpleName trace
log SimpleName MethodInvocation StringLiteral lock notified on session {} after {} nanos
log SimpleName MethodInvocation SimpleName nano duration
trace SimpleName MethodInvocation StringLiteral lock notified on session {} after {} nanos
trace SimpleName MethodInvocation SimpleName nano duration
lock notified on session {} after {} nanos StringLiteral MethodInvocation SimpleName nano duration
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType long
interrupted exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
system SimpleName MethodInvocation SimpleName nano time
nano end SimpleName VariableDeclarationFragment MethodInvocation SimpleName system
nano end SimpleName VariableDeclarationFragment MethodInvocation SimpleName nano time
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName nano end
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName system
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName nano time
nano end SimpleName InfixExpression SimpleName nano start
nano duration SimpleName VariableDeclarationFragment InfixExpression SimpleName nano end
nano duration SimpleName VariableDeclarationFragment InfixExpression SimpleName nano start
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName nano duration
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment InfixExpression SimpleName nano end
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment InfixExpression SimpleName nano start
log SimpleName MethodInvocation SimpleName is trace enabled
integer SimpleName MethodInvocation SimpleName to hex string
integer SimpleName MethodInvocation SimpleName mask
to hex string SimpleName MethodInvocation SimpleName mask
log SimpleName MethodInvocation SimpleName trace
log SimpleName MethodInvocation StringLiteral wait for mask - ignoring interrupted exception after {} nanos
log SimpleName MethodInvocation MethodInvocation SimpleName integer
log SimpleName MethodInvocation MethodInvocation SimpleName to hex string
log SimpleName MethodInvocation MethodInvocation SimpleName mask
log SimpleName MethodInvocation SimpleName nano duration
trace SimpleName MethodInvocation StringLiteral wait for mask - ignoring interrupted exception after {} nanos
trace SimpleName MethodInvocation MethodInvocation SimpleName integer
trace SimpleName MethodInvocation MethodInvocation SimpleName to hex string
trace SimpleName MethodInvocation MethodInvocation SimpleName mask
trace SimpleName MethodInvocation SimpleName nano duration
wait for mask - ignoring interrupted exception after {} nanos StringLiteral MethodInvocation MethodInvocation SimpleName integer
wait for mask - ignoring interrupted exception after {} nanos StringLiteral MethodInvocation MethodInvocation SimpleName to hex string
wait for mask - ignoring interrupted exception after {} nanos StringLiteral MethodInvocation MethodInvocation SimpleName mask
wait for mask - ignoring interrupted exception after {} nanos StringLiteral MethodInvocation SimpleName nano duration
integer SimpleName MethodInvocation MethodInvocation SimpleName nano duration
to hex string SimpleName MethodInvocation MethodInvocation SimpleName nano duration
mask SimpleName MethodInvocation MethodInvocation SimpleName nano duration
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType long
int PrimitiveType VariableDeclarationStatement Block IfStatement SimpleName authed
authed SimpleName IfStatement Block VariableDeclarationStatement PrimitiveType long
long PrimitiveType VariableDeclarationStatement Block SynchronizedStatement SimpleName lock
override SimpleName MarkerAnnotation MethodDeclaration Modifier public
override SimpleName MarkerAnnotation MethodDeclaration PrimitiveType int
override SimpleName MarkerAnnotation MethodDeclaration SimpleName wait for
override SimpleName MarkerAnnotation MethodDeclaration SingleVariableDeclaration PrimitiveType int
override SimpleName MarkerAnnotation MethodDeclaration SingleVariableDeclaration SimpleName mask
override SimpleName MarkerAnnotation MethodDeclaration SingleVariableDeclaration PrimitiveType long
override SimpleName MarkerAnnotation MethodDeclaration SingleVariableDeclaration SimpleName timeout
public Modifier MethodDeclaration PrimitiveType int
public Modifier MethodDeclaration SimpleName wait for
public Modifier MethodDeclaration SingleVariableDeclaration PrimitiveType int
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName mask
public Modifier MethodDeclaration SingleVariableDeclaration PrimitiveType long
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName timeout
public Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType long
public Modifier MethodDeclaration Block SynchronizedStatement SimpleName lock
int PrimitiveType MethodDeclaration SimpleName wait for
int PrimitiveType MethodDeclaration SingleVariableDeclaration PrimitiveType int
int PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName mask
int PrimitiveType MethodDeclaration SingleVariableDeclaration PrimitiveType long
int PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName timeout
int PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType long
int PrimitiveType MethodDeclaration Block SynchronizedStatement SimpleName lock
wait for SimpleName MethodDeclaration SingleVariableDeclaration PrimitiveType int
wait for SimpleName MethodDeclaration SingleVariableDeclaration SimpleName mask
wait for SimpleName MethodDeclaration SingleVariableDeclaration PrimitiveType long
wait for SimpleName MethodDeclaration SingleVariableDeclaration SimpleName timeout
wait for SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType long
wait for SimpleName MethodDeclaration Block SynchronizedStatement SimpleName lock
int PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType long
int PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName timeout
mask SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType long
mask SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName timeout
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName override
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType int
public Modifier TypeDeclaration MethodDeclaration SimpleName wait for
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName mask
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType long
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName timeout
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName override
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType int
test SimpleName TypeDeclaration MethodDeclaration SimpleName wait for
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName mask
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType long
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName timeout
