buffer SimpleName SimpleType SingleVariableDeclaration SimpleName buffer
buffer SimpleName MethodInvocation SimpleName get u byte
cmd SimpleName VariableDeclarationFragment MethodInvocation SimpleName buffer
cmd SimpleName VariableDeclarationFragment MethodInvocation SimpleName get u byte
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName cmd
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName buffer
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get u byte
handle disconnect SimpleName MethodInvocation SimpleName buffer
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral received ssh msg ignore
debug SimpleName MethodInvocation StringLiteral received ssh msg ignore
buffer SimpleName MethodInvocation SimpleName get int
code SimpleName VariableDeclarationFragment MethodInvocation SimpleName buffer
code SimpleName VariableDeclarationFragment MethodInvocation SimpleName get int
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName code
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName buffer
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get int
log SimpleName MethodInvocation SimpleName is debug enabled
integer SimpleName MethodInvocation SimpleName value of
integer SimpleName MethodInvocation SimpleName code
value of SimpleName MethodInvocation SimpleName code
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral received ssh msg unimplemented #{}
log SimpleName MethodInvocation MethodInvocation SimpleName integer
log SimpleName MethodInvocation MethodInvocation SimpleName value of
log SimpleName MethodInvocation MethodInvocation SimpleName code
debug SimpleName MethodInvocation StringLiteral received ssh msg unimplemented #{}
debug SimpleName MethodInvocation MethodInvocation SimpleName integer
debug SimpleName MethodInvocation MethodInvocation SimpleName value of
debug SimpleName MethodInvocation MethodInvocation SimpleName code
received ssh msg unimplemented #{} StringLiteral MethodInvocation MethodInvocation SimpleName integer
received ssh msg unimplemented #{} StringLiteral MethodInvocation MethodInvocation SimpleName value of
received ssh msg unimplemented #{} StringLiteral MethodInvocation MethodInvocation SimpleName code
buffer SimpleName MethodInvocation SimpleName get boolean
display SimpleName VariableDeclarationFragment MethodInvocation SimpleName buffer
display SimpleName VariableDeclarationFragment MethodInvocation SimpleName get boolean
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName display
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName buffer
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get boolean
buffer SimpleName MethodInvocation SimpleName get string
msg SimpleName VariableDeclarationFragment MethodInvocation SimpleName buffer
msg SimpleName VariableDeclarationFragment MethodInvocation SimpleName get string
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName msg
log SimpleName MethodInvocation SimpleName is debug enabled
boolean SimpleName MethodInvocation SimpleName value of
boolean SimpleName MethodInvocation SimpleName display
value of SimpleName MethodInvocation SimpleName display
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral received ssh msg debug display {}
log SimpleName MethodInvocation MethodInvocation SimpleName boolean
log SimpleName MethodInvocation MethodInvocation SimpleName value of
log SimpleName MethodInvocation MethodInvocation SimpleName display
log SimpleName MethodInvocation SimpleName msg
debug SimpleName MethodInvocation StringLiteral received ssh msg debug display {}
debug SimpleName MethodInvocation MethodInvocation SimpleName boolean
debug SimpleName MethodInvocation MethodInvocation SimpleName value of
debug SimpleName MethodInvocation MethodInvocation SimpleName display
debug SimpleName MethodInvocation SimpleName msg
received ssh msg debug display {} StringLiteral MethodInvocation MethodInvocation SimpleName boolean
received ssh msg debug display {} StringLiteral MethodInvocation MethodInvocation SimpleName value of
received ssh msg debug display {} StringLiteral MethodInvocation MethodInvocation SimpleName display
received ssh msg debug display {} StringLiteral MethodInvocation SimpleName msg
boolean SimpleName MethodInvocation MethodInvocation SimpleName msg
value of SimpleName MethodInvocation MethodInvocation SimpleName msg
display SimpleName MethodInvocation MethodInvocation SimpleName msg
handle service request SimpleName MethodInvocation SimpleName buffer
handle kex init SimpleName MethodInvocation SimpleName buffer
handle new keys SimpleName MethodInvocation SimpleName cmd
cmd SimpleName InfixExpression QualifiedName ssh constantsssh msg kex first
cmd SimpleName InfixExpression QualifiedName ssh constantsssh msg kex last
validate kex state SimpleName MethodInvocation SimpleName cmd
validate kex state SimpleName MethodInvocation QualifiedName kex staterun
cmd SimpleName MethodInvocation QualifiedName kex staterun
buffer SimpleName MethodInvocation SimpleName rpos
buffer SimpleName MethodInvocation InfixExpression NumberLiteral empty
rpos SimpleName MethodInvocation InfixExpression NumberLiteral empty
buffer SimpleName MethodInvocation SimpleName rpos
buffer SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName buffer
buffer SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName rpos
buffer SimpleName MethodInvocation InfixExpression NumberLiteral empty
rpos SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName buffer
rpos SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName rpos
rpos SimpleName MethodInvocation InfixExpression NumberLiteral empty
kex SimpleName MethodInvocation SimpleName next
kex SimpleName MethodInvocation SimpleName buffer
next SimpleName MethodInvocation SimpleName buffer
kex state SimpleName MethodInvocation SimpleName set
kex state SimpleName MethodInvocation QualifiedName kex statekeys
set SimpleName MethodInvocation QualifiedName kex statekeys
current service SimpleName MethodInvocation SimpleName process
current service SimpleName MethodInvocation SimpleName cmd
current service SimpleName MethodInvocation SimpleName buffer
process SimpleName MethodInvocation SimpleName cmd
process SimpleName MethodInvocation SimpleName buffer
cmd SimpleName MethodInvocation SimpleName buffer
unsupported command StringLiteral InfixExpression SimpleName cmd
illegal state exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral unsupported command
illegal state exception SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName cmd
cmd SimpleName SwitchStatement SwitchCase QualifiedName ssh constantsssh msg disconnect
cmd SimpleName SwitchStatement SwitchCase QualifiedName ssh constantsssh msg ignore
cmd SimpleName SwitchStatement SwitchCase QualifiedName ssh constantsssh msg unimplemented
ssh constantsssh msg disconnect QualifiedName SwitchCase SwitchStatement SwitchCase QualifiedName ssh constantsssh msg ignore
ssh constantsssh msg disconnect QualifiedName SwitchCase SwitchStatement SwitchCase QualifiedName ssh constantsssh msg unimplemented
ssh constantsssh msg ignore QualifiedName SwitchCase SwitchStatement SwitchCase QualifiedName ssh constantsssh msg unimplemented
ssh constantsssh msg ignore QualifiedName SwitchCase SwitchStatement SwitchCase QualifiedName ssh constantsssh msg debug
ssh constantsssh msg unimplemented QualifiedName SwitchCase SwitchStatement SwitchCase QualifiedName ssh constantsssh msg debug
ssh constantsssh msg unimplemented QualifiedName SwitchCase SwitchStatement SwitchCase QualifiedName ssh constantsssh msg service request
ssh constantsssh msg debug QualifiedName SwitchCase SwitchStatement SwitchCase QualifiedName ssh constantsssh msg service request
ssh constantsssh msg debug QualifiedName SwitchCase SwitchStatement SwitchCase QualifiedName ssh constantsssh msg service accept
ssh constantsssh msg service request QualifiedName SwitchCase SwitchStatement SwitchCase QualifiedName ssh constantsssh msg service accept
ssh constantsssh msg service accept QualifiedName SwitchCase SwitchStatement SwitchCase QualifiedName ssh constantsssh msg kexinit
ssh constantsssh msg kexinit QualifiedName SwitchCase SwitchStatement SwitchCase QualifiedName ssh constantsssh msg newkeys
int PrimitiveType VariableDeclarationStatement Block SwitchStatement SimpleName cmd
protected Modifier MethodDeclaration PrimitiveType void
protected Modifier MethodDeclaration SimpleName do handle message
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName buffer
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleName buffer
protected Modifier MethodDeclaration SimpleType SimpleName exception
protected Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
protected Modifier MethodDeclaration Block SwitchStatement SimpleName cmd
void PrimitiveType MethodDeclaration SimpleName do handle message
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName buffer
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName buffer
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
void PrimitiveType MethodDeclaration Block SwitchStatement SimpleName cmd
do handle message SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName buffer
do handle message SimpleName MethodDeclaration SingleVariableDeclaration SimpleName buffer
do handle message SimpleName MethodDeclaration SimpleType SimpleName exception
do handle message SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
do handle message SimpleName MethodDeclaration Block SwitchStatement SimpleName cmd
buffer SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier protected
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName do handle message
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName buffer
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration Modifier protected
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName do handle message
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName buffer
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
