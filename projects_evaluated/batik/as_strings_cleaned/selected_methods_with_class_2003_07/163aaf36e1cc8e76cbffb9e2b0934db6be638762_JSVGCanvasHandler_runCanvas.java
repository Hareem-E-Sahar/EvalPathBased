string SimpleName SimpleType SingleVariableDeclaration SimpleName desc
desc SimpleName FieldAccess Assignment SimpleName desc
delegate SimpleName MethodInvocation SimpleName get name
j frame SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName delegate
j frame SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get name
frame SimpleName Assignment ClassInstanceCreation SimpleType SimpleName j frame
frame SimpleName Assignment ClassInstanceCreation MethodInvocation SimpleName delegate
frame SimpleName Assignment ClassInstanceCreation MethodInvocation SimpleName get name
canvas SimpleName Assignment ClassInstanceCreation SimpleType SimpleName jsvg canvas
frame SimpleName MethodInvocation SimpleName get content pane
frame SimpleName MethodInvocation MethodInvocation SimpleName add
get content pane SimpleName MethodInvocation MethodInvocation SimpleName add
frame SimpleName MethodInvocation MethodInvocation SimpleName canvas
get content pane SimpleName MethodInvocation MethodInvocation SimpleName canvas
add SimpleName MethodInvocation SimpleName canvas
dimension SimpleName SimpleType ClassInstanceCreation NumberLiteral empty
dimension SimpleName SimpleType ClassInstanceCreation NumberLiteral empty
empty NumberLiteral ClassInstanceCreation NumberLiteral empty
frame SimpleName MethodInvocation SimpleName set size
frame SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName dimension
frame SimpleName MethodInvocation ClassInstanceCreation NumberLiteral empty
frame SimpleName MethodInvocation ClassInstanceCreation NumberLiteral empty
set size SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName dimension
set size SimpleName MethodInvocation ClassInstanceCreation NumberLiteral empty
set size SimpleName MethodInvocation ClassInstanceCreation NumberLiteral empty
window event SimpleName SimpleType SingleVariableDeclaration SimpleName e
abort SimpleName Assignment BooleanLiteral true
load monitor SimpleName MethodInvocation SimpleName notify all
abort SimpleName Assignment BooleanLiteral true
render monitor SimpleName MethodInvocation SimpleName notify all
load monitor SimpleName SynchronizedStatement Block SynchronizedStatement SimpleName render monitor
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName window closing
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName window event
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName e
public Modifier MethodDeclaration Block SynchronizedStatement SimpleName load monitor
public Modifier MethodDeclaration Block SynchronizedStatement SimpleName render monitor
void PrimitiveType MethodDeclaration SimpleName window closing
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName window event
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName e
void PrimitiveType MethodDeclaration Block SynchronizedStatement SimpleName load monitor
void PrimitiveType MethodDeclaration Block SynchronizedStatement SimpleName render monitor
window closing SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName window event
window closing SimpleName MethodDeclaration SingleVariableDeclaration SimpleName e
window closing SimpleName MethodDeclaration Block SynchronizedStatement SimpleName load monitor
window closing SimpleName MethodDeclaration Block SynchronizedStatement SimpleName render monitor
wl SimpleName Assignment ClassInstanceCreation SimpleType SimpleName window adapter
frame SimpleName MethodInvocation SimpleName add window listener
frame SimpleName MethodInvocation SimpleName wl
add window listener SimpleName MethodInvocation SimpleName wl
frame SimpleName MethodInvocation SimpleName set visible
frame SimpleName MethodInvocation BooleanLiteral true
set visible SimpleName MethodInvocation BooleanLiteral true
irl SimpleName Assignment ClassInstanceCreation SimpleType SimpleName initial render listener
canvas SimpleName MethodInvocation SimpleName add gvt tree renderer listener
canvas SimpleName MethodInvocation SimpleName irl
add gvt tree renderer listener SimpleName MethodInvocation SimpleName irl
ll SimpleName Assignment ClassInstanceCreation SimpleType SimpleName load listener
canvas SimpleName MethodInvocation SimpleName add svg document loader listener
canvas SimpleName MethodInvocation SimpleName ll
add svg document loader listener SimpleName MethodInvocation SimpleName ll
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName run
void PrimitiveType MethodDeclaration SimpleName run
event queue SimpleName MethodInvocation SimpleName invoke and wait
event queue SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName runnable
invoke and wait SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName runnable
throwable SimpleName SimpleType SingleVariableDeclaration SimpleName t
delegate SimpleName MethodInvocation SimpleName canvas init
delegate SimpleName MethodInvocation SimpleName canvas
canvas init SimpleName MethodInvocation SimpleName canvas
canvas SimpleName MethodInvocation SimpleName get update manager
update manager SimpleName Assignment MethodInvocation SimpleName canvas
update manager SimpleName Assignment MethodInvocation SimpleName get update manager
url SimpleName Assignment ClassInstanceCreation SimpleType SimpleName update render listener
update manager SimpleName MethodInvocation SimpleName add update manager listener
update manager SimpleName MethodInvocation SimpleName url
add update manager listener SimpleName MethodInvocation SimpleName url
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName run
void PrimitiveType MethodDeclaration SimpleName run
event queue SimpleName MethodInvocation SimpleName invoke and wait
event queue SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName runnable
invoke and wait SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName runnable
throwable SimpleName SimpleType SingleVariableDeclaration SimpleName t
t SimpleName MethodInvocation SimpleName print stack trace
load monitor SimpleName SynchronizedStatement Block IfStatement SimpleName abort
load monitor SimpleName SynchronizedStatement Block IfStatement SimpleName abort
load monitor SimpleName SynchronizedStatement Block IfStatement SimpleName abort
abort SimpleName IfStatement Block IfStatement SimpleName abort
abort SimpleName IfStatement Block IfStatement SimpleName abort
abort SimpleName IfStatement Block IfStatement SimpleName abort
abort SimpleName IfStatement Block IfStatement SimpleName abort
abort SimpleName IfStatement Block IfStatement SimpleName abort
render monitor SimpleName SynchronizedStatement Block SynchronizedStatement SimpleName load monitor
render monitor SimpleName SynchronizedStatement Block IfStatement SimpleName abort
render monitor SimpleName SynchronizedStatement Block IfStatement SimpleName abort
render monitor SimpleName SynchronizedStatement Block IfStatement SimpleName abort
render monitor SimpleName SynchronizedStatement Block IfStatement SimpleName abort
throwable SimpleName SimpleType SingleVariableDeclaration SimpleName t
t SimpleName MethodInvocation SimpleName print stack trace
delegate SimpleName MethodInvocation SimpleName canvas done
delegate SimpleName MethodInvocation SimpleName canvas
canvas done SimpleName MethodInvocation SimpleName canvas
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName run canvas
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName desc
public Modifier MethodDeclaration Block IfStatement SimpleName abort
void PrimitiveType MethodDeclaration SimpleName run canvas
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName desc
void PrimitiveType MethodDeclaration Block IfStatement SimpleName abort
run canvas SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
run canvas SimpleName MethodDeclaration SingleVariableDeclaration SimpleName desc
run canvas SimpleName MethodDeclaration Block IfStatement SimpleName abort
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName run canvas
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName desc
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName run canvas
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName desc
