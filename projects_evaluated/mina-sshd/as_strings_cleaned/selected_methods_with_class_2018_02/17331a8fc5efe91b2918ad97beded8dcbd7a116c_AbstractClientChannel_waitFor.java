set SimpleName SimpleType ParameterizedType SimpleType SimpleName client channel event
collection SimpleName SimpleType ParameterizedType SimpleType SimpleName client channel event
collection SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName mask
client channel event SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName mask
long PrimitiveType SingleVariableDeclaration SimpleName timeout
objects SimpleName MethodInvocation SimpleName require non null
objects SimpleName MethodInvocation SimpleName mask
objects SimpleName MethodInvocation StringLiteral no mask specified
require non null SimpleName MethodInvocation SimpleName mask
require non null SimpleName MethodInvocation StringLiteral no mask specified
mask SimpleName MethodInvocation StringLiteral no mask specified
t SimpleName VariableDeclarationFragment NumberLiteral empty
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName t
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment NumberLiteral empty
set SimpleName SimpleType ParameterizedType SimpleType SimpleName client channel event
enum set SimpleName MethodInvocation SimpleName none of
enum set SimpleName MethodInvocation TypeLiteral SimpleType SimpleName client channel event
none of SimpleName MethodInvocation TypeLiteral SimpleType SimpleName client channel event
cond SimpleName VariableDeclarationFragment MethodInvocation SimpleName enum set
cond SimpleName VariableDeclarationFragment MethodInvocation SimpleName none of
cond SimpleName MethodInvocation SimpleName clear
update current channel state SimpleName MethodInvocation SimpleName cond
log SimpleName MethodInvocation SimpleName is debug enabled
cond SimpleName MethodInvocation SimpleName contains
cond SimpleName MethodInvocation QualifiedName client channel eventexit status
contains SimpleName MethodInvocation QualifiedName client channel eventexit status
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral wait for mask - exit status
log SimpleName MethodInvocation SimpleName mask
log SimpleName MethodInvocation SimpleName exit status holder
debug SimpleName MethodInvocation StringLiteral wait for mask - exit status
debug SimpleName MethodInvocation SimpleName mask
debug SimpleName MethodInvocation SimpleName exit status holder
wait for mask - exit status StringLiteral MethodInvocation SimpleName mask
wait for mask - exit status StringLiteral MethodInvocation SimpleName exit status holder
mask SimpleName MethodInvocation SimpleName exit status holder
cond SimpleName MethodInvocation SimpleName contains
cond SimpleName MethodInvocation QualifiedName client channel eventexit signal
contains SimpleName MethodInvocation QualifiedName client channel eventexit signal
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral wait for mask - exit signal
log SimpleName MethodInvocation SimpleName mask
log SimpleName MethodInvocation SimpleName exit signal holder
debug SimpleName MethodInvocation StringLiteral wait for mask - exit signal
debug SimpleName MethodInvocation SimpleName mask
debug SimpleName MethodInvocation SimpleName exit signal holder
wait for mask - exit signal StringLiteral MethodInvocation SimpleName mask
wait for mask - exit signal StringLiteral MethodInvocation SimpleName exit signal holder
mask SimpleName MethodInvocation SimpleName exit signal holder
collections SimpleName MethodInvocation SimpleName disjoint
collections SimpleName MethodInvocation SimpleName mask
collections SimpleName MethodInvocation SimpleName cond
disjoint SimpleName MethodInvocation SimpleName mask
disjoint SimpleName MethodInvocation SimpleName cond
mask SimpleName MethodInvocation SimpleName cond
nothing in common SimpleName VariableDeclarationFragment MethodInvocation SimpleName collections
nothing in common SimpleName VariableDeclarationFragment MethodInvocation SimpleName disjoint
nothing in common SimpleName VariableDeclarationFragment MethodInvocation SimpleName mask
nothing in common SimpleName VariableDeclarationFragment MethodInvocation SimpleName cond
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName nothing in common
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName collections
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName disjoint
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName mask
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName cond
log SimpleName MethodInvocation SimpleName is trace enabled
log SimpleName MethodInvocation SimpleName trace
log SimpleName MethodInvocation StringLiteral wait for call returning on channel {} mask cond
log SimpleName MethodInvocation SimpleName mask
log SimpleName MethodInvocation SimpleName cond
trace SimpleName MethodInvocation StringLiteral wait for call returning on channel {} mask cond
trace SimpleName MethodInvocation SimpleName mask
trace SimpleName MethodInvocation SimpleName cond
wait for call returning on channel {} mask cond StringLiteral MethodInvocation SimpleName mask
wait for call returning on channel {} mask cond StringLiteral MethodInvocation SimpleName cond
mask SimpleName MethodInvocation SimpleName cond
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
log SimpleName MethodInvocation SimpleName trace
log SimpleName MethodInvocation StringLiteral wait for call timeout on channel {} mask
log SimpleName MethodInvocation SimpleName mask
trace SimpleName MethodInvocation StringLiteral wait for call timeout on channel {} mask
trace SimpleName MethodInvocation SimpleName mask
wait for call timeout on channel {} mask StringLiteral MethodInvocation SimpleName mask
cond SimpleName MethodInvocation SimpleName add
cond SimpleName MethodInvocation QualifiedName client channel eventtimeout
add SimpleName MethodInvocation QualifiedName client channel eventtimeout
log SimpleName MethodInvocation SimpleName is trace enabled
log SimpleName MethodInvocation SimpleName trace
log SimpleName MethodInvocation StringLiteral waiting {} millis for lock on channel {} mask cond
log SimpleName MethodInvocation SimpleName timeout
log SimpleName MethodInvocation SimpleName mask
trace SimpleName MethodInvocation StringLiteral waiting {} millis for lock on channel {} mask cond
trace SimpleName MethodInvocation SimpleName timeout
trace SimpleName MethodInvocation SimpleName mask
trace SimpleName MethodInvocation SimpleName cond
waiting {} millis for lock on channel {} mask cond StringLiteral MethodInvocation SimpleName timeout
waiting {} millis for lock on channel {} mask cond StringLiteral MethodInvocation SimpleName mask
waiting {} millis for lock on channel {} mask cond StringLiteral MethodInvocation SimpleName cond
timeout SimpleName MethodInvocation SimpleName mask
timeout SimpleName MethodInvocation SimpleName cond
mask SimpleName MethodInvocation SimpleName cond
system SimpleName MethodInvocation SimpleName nano time
nano start SimpleName VariableDeclarationFragment MethodInvocation SimpleName system
nano start SimpleName VariableDeclarationFragment MethodInvocation SimpleName nano time
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName nano start
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName system
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName nano time
timeout SimpleName InfixExpression NumberLiteral l
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
log SimpleName MethodInvocation StringLiteral lock notified on channel {} after {} nanos
log SimpleName MethodInvocation SimpleName nano duration
trace SimpleName MethodInvocation StringLiteral lock notified on channel {} after {} nanos
trace SimpleName MethodInvocation SimpleName nano duration
lock notified on channel {} after {} nanos StringLiteral MethodInvocation SimpleName nano duration
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
log SimpleName MethodInvocation SimpleName trace
log SimpleName MethodInvocation StringLiteral wait for mask - ignoring interrupted exception after {} nanos
log SimpleName MethodInvocation SimpleName mask
log SimpleName MethodInvocation SimpleName nano duration
trace SimpleName MethodInvocation StringLiteral wait for mask - ignoring interrupted exception after {} nanos
trace SimpleName MethodInvocation SimpleName mask
trace SimpleName MethodInvocation SimpleName nano duration
wait for mask - ignoring interrupted exception after {} nanos StringLiteral MethodInvocation SimpleName mask
wait for mask - ignoring interrupted exception after {} nanos StringLiteral MethodInvocation SimpleName nano duration
mask SimpleName MethodInvocation SimpleName nano duration
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType long
boolean PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType long
long PrimitiveType VariableDeclarationStatement Block SynchronizedStatement SimpleName lock
override SimpleName MarkerAnnotation MethodDeclaration Modifier public
override SimpleName MarkerAnnotation MethodDeclaration SimpleName wait for
override SimpleName MarkerAnnotation MethodDeclaration SingleVariableDeclaration SimpleName mask
override SimpleName MarkerAnnotation MethodDeclaration SingleVariableDeclaration PrimitiveType long
override SimpleName MarkerAnnotation MethodDeclaration SingleVariableDeclaration SimpleName timeout
public Modifier MethodDeclaration ParameterizedType SimpleType SimpleName set
public Modifier MethodDeclaration ParameterizedType SimpleType SimpleName client channel event
public Modifier MethodDeclaration SimpleName wait for
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName mask
public Modifier MethodDeclaration SingleVariableDeclaration PrimitiveType long
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName timeout
public Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType long
public Modifier MethodDeclaration Block SynchronizedStatement SimpleName lock
set SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName wait for
client channel event SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName wait for
wait for SimpleName MethodDeclaration SingleVariableDeclaration SimpleName mask
wait for SimpleName MethodDeclaration SingleVariableDeclaration PrimitiveType long
wait for SimpleName MethodDeclaration SingleVariableDeclaration SimpleName timeout
wait for SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType long
wait for SimpleName MethodDeclaration Block SynchronizedStatement SimpleName lock
mask SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType long
mask SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName timeout
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName override
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration SimpleName wait for
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName mask
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType long
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName timeout
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName override
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration SimpleName wait for
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName mask
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType long
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName timeout
