scp receive line handler SimpleName SimpleType SingleVariableDeclaration SimpleName handler
scp timestamp SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName time
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName line
is dir SimpleName VariableDeclarationFragment BooleanLiteral false
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName is dir
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment BooleanLiteral false
read ack SimpleName MethodInvocation BooleanLiteral true
c SimpleName VariableDeclarationFragment MethodInvocation SimpleName read ack
c SimpleName VariableDeclarationFragment MethodInvocation BooleanLiteral true
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName c
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName read ack
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation BooleanLiteral true
is dir SimpleName Assignment BooleanLiteral true
char PrimitiveType CastExpression SimpleName c
string SimpleName MethodInvocation SimpleName value of
string SimpleName MethodInvocation CastExpression PrimitiveType char
string SimpleName MethodInvocation CastExpression SimpleName c
value of SimpleName MethodInvocation CastExpression PrimitiveType char
value of SimpleName MethodInvocation CastExpression SimpleName c
string SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName read line
value of SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName read line
line SimpleName Assignment InfixExpression MethodInvocation SimpleName string
line SimpleName Assignment InfixExpression MethodInvocation SimpleName value of
line SimpleName Assignment InfixExpression MethodInvocation SimpleName read line
log SimpleName MethodInvocation SimpleName is debug enabled
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral receive - received d header {}
log SimpleName MethodInvocation SimpleName line
debug SimpleName MethodInvocation StringLiteral receive - received d header {}
debug SimpleName MethodInvocation SimpleName line
receive - received d header {} StringLiteral MethodInvocation SimpleName line
char PrimitiveType CastExpression SimpleName c
string SimpleName MethodInvocation SimpleName value of
string SimpleName MethodInvocation CastExpression PrimitiveType char
string SimpleName MethodInvocation CastExpression SimpleName c
value of SimpleName MethodInvocation CastExpression PrimitiveType char
value of SimpleName MethodInvocation CastExpression SimpleName c
string SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName read line
value of SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName read line
line SimpleName Assignment InfixExpression MethodInvocation SimpleName string
line SimpleName Assignment InfixExpression MethodInvocation SimpleName value of
line SimpleName Assignment InfixExpression MethodInvocation SimpleName read line
log SimpleName MethodInvocation SimpleName is debug enabled
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral receive - received c header {}
log SimpleName MethodInvocation SimpleName line
debug SimpleName MethodInvocation StringLiteral receive - received c header {}
debug SimpleName MethodInvocation SimpleName line
receive - received c header {} StringLiteral MethodInvocation SimpleName line
char PrimitiveType CastExpression SimpleName c
string SimpleName MethodInvocation SimpleName value of
string SimpleName MethodInvocation CastExpression PrimitiveType char
string SimpleName MethodInvocation CastExpression SimpleName c
value of SimpleName MethodInvocation CastExpression PrimitiveType char
value of SimpleName MethodInvocation CastExpression SimpleName c
string SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName read line
value of SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName read line
line SimpleName Assignment InfixExpression MethodInvocation SimpleName string
line SimpleName Assignment InfixExpression MethodInvocation SimpleName value of
line SimpleName Assignment InfixExpression MethodInvocation SimpleName read line
log SimpleName MethodInvocation SimpleName is debug enabled
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral receive - received t header {}
log SimpleName MethodInvocation SimpleName line
debug SimpleName MethodInvocation StringLiteral receive - received t header {}
debug SimpleName MethodInvocation SimpleName line
receive - received t header {} StringLiteral MethodInvocation SimpleName line
scp timestamp SimpleName MethodInvocation SimpleName parse time
scp timestamp SimpleName MethodInvocation SimpleName line
parse time SimpleName MethodInvocation SimpleName line
time SimpleName Assignment MethodInvocation SimpleName scp timestamp
time SimpleName Assignment MethodInvocation SimpleName parse time
time SimpleName Assignment MethodInvocation SimpleName line
char PrimitiveType CastExpression SimpleName c
string SimpleName MethodInvocation SimpleName value of
string SimpleName MethodInvocation CastExpression PrimitiveType char
string SimpleName MethodInvocation CastExpression SimpleName c
value of SimpleName MethodInvocation CastExpression PrimitiveType char
value of SimpleName MethodInvocation CastExpression SimpleName c
string SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName read line
value of SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName read line
line SimpleName Assignment InfixExpression MethodInvocation SimpleName string
line SimpleName Assignment InfixExpression MethodInvocation SimpleName value of
line SimpleName Assignment InfixExpression MethodInvocation SimpleName read line
log SimpleName MethodInvocation SimpleName is debug enabled
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral receive - received e header {}
log SimpleName MethodInvocation SimpleName line
debug SimpleName MethodInvocation StringLiteral receive - received e header {}
debug SimpleName MethodInvocation SimpleName line
receive - received e header {} StringLiteral MethodInvocation SimpleName line
c SimpleName SwitchStatement SwitchCase PrefixExpression NumberLiteral empty
c SimpleName SwitchStatement SwitchCase CharacterLiteral d
c SimpleName SwitchStatement ExpressionStatement Assignment SimpleName is dir
c SimpleName SwitchStatement ExpressionStatement Assignment BooleanLiteral true
c SimpleName SwitchStatement ExpressionStatement Assignment SimpleName line
d CharacterLiteral SwitchCase SwitchStatement SwitchCase CharacterLiteral c
c CharacterLiteral SwitchCase SwitchStatement SwitchCase CharacterLiteral t
handler SimpleName MethodInvocation SimpleName process
handler SimpleName MethodInvocation SimpleName line
handler SimpleName MethodInvocation SimpleName is dir
handler SimpleName MethodInvocation SimpleName time
process SimpleName MethodInvocation SimpleName line
process SimpleName MethodInvocation SimpleName is dir
process SimpleName MethodInvocation SimpleName time
line SimpleName MethodInvocation SimpleName is dir
line SimpleName MethodInvocation SimpleName time
is dir SimpleName MethodInvocation SimpleName time
boolean PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
boolean PrimitiveType VariableDeclarationStatement Block SwitchStatement SimpleName c
int PrimitiveType VariableDeclarationStatement Block SwitchStatement SimpleName c
protected Modifier MethodDeclaration PrimitiveType void
protected Modifier MethodDeclaration SimpleName receive
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName scp receive line handler
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleName handler
protected Modifier MethodDeclaration SimpleType SimpleName io exception
void PrimitiveType MethodDeclaration SimpleName receive
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName scp receive line handler
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName handler
void PrimitiveType MethodDeclaration SimpleType SimpleName io exception
receive SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName scp receive line handler
receive SimpleName MethodDeclaration SingleVariableDeclaration SimpleName handler
receive SimpleName MethodDeclaration SimpleType SimpleName io exception
handler SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier protected
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName receive
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName handler
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
test SimpleName TypeDeclaration MethodDeclaration Modifier protected
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName receive
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName handler
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
