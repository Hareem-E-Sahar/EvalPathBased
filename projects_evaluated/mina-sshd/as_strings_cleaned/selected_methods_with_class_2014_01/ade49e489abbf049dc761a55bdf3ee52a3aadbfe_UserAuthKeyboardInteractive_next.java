buffer SimpleName SimpleType SingleVariableDeclaration SimpleName buffer
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation StringLiteral send ssh msg userauth request for password
info SimpleName MethodInvocation StringLiteral send ssh msg userauth request for password
session SimpleName MethodInvocation SimpleName create buffer
session SimpleName MethodInvocation QualifiedName ssh constantsssh msg userauth request
session SimpleName MethodInvocation NumberLiteral empty
create buffer SimpleName MethodInvocation QualifiedName ssh constantsssh msg userauth request
create buffer SimpleName MethodInvocation NumberLiteral empty
ssh constantsssh msg userauth request QualifiedName MethodInvocation NumberLiteral empty
buffer SimpleName Assignment MethodInvocation SimpleName session
buffer SimpleName Assignment MethodInvocation SimpleName create buffer
buffer SimpleName Assignment MethodInvocation QualifiedName ssh constantsssh msg userauth request
buffer SimpleName Assignment MethodInvocation NumberLiteral empty
buffer SimpleName MethodInvocation SimpleName put string
buffer SimpleName MethodInvocation SimpleName username
put string SimpleName MethodInvocation SimpleName username
buffer SimpleName MethodInvocation SimpleName put string
buffer SimpleName MethodInvocation SimpleName service
put string SimpleName MethodInvocation SimpleName service
buffer SimpleName MethodInvocation SimpleName put string
buffer SimpleName MethodInvocation StringLiteral keyboardinteractive
put string SimpleName MethodInvocation StringLiteral keyboardinteractive
buffer SimpleName MethodInvocation SimpleName put string
buffer SimpleName MethodInvocation StringLiteral empty
put string SimpleName MethodInvocation StringLiteral empty
buffer SimpleName MethodInvocation SimpleName put string
buffer SimpleName MethodInvocation StringLiteral empty
put string SimpleName MethodInvocation StringLiteral empty
session SimpleName MethodInvocation SimpleName write packet
session SimpleName MethodInvocation SimpleName buffer
write packet SimpleName MethodInvocation SimpleName buffer
buffer SimpleName MethodInvocation SimpleName get byte
cmd SimpleName VariableDeclarationFragment MethodInvocation SimpleName buffer
cmd SimpleName VariableDeclarationFragment MethodInvocation SimpleName get byte
byte PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName cmd
byte PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName buffer
byte PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get byte
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation StringLiteral received ssh msg userauth info request
info SimpleName MethodInvocation StringLiteral received ssh msg userauth info request
buffer SimpleName MethodInvocation SimpleName get string
name SimpleName VariableDeclarationFragment MethodInvocation SimpleName buffer
name SimpleName VariableDeclarationFragment MethodInvocation SimpleName get string
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName name
buffer SimpleName MethodInvocation SimpleName get string
instruction SimpleName VariableDeclarationFragment MethodInvocation SimpleName buffer
instruction SimpleName VariableDeclarationFragment MethodInvocation SimpleName get string
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName instruction
buffer SimpleName MethodInvocation SimpleName get string
language tag SimpleName VariableDeclarationFragment MethodInvocation SimpleName buffer
language tag SimpleName VariableDeclarationFragment MethodInvocation SimpleName get string
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName language tag
name SimpleName ArrayInitializer SimpleName instruction
name SimpleName ArrayInitializer SimpleName language tag
instruction SimpleName ArrayInitializer SimpleName language tag
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation StringLiteral received {} {} {}
log SimpleName MethodInvocation ArrayCreation ArrayInitializer SimpleName name
log SimpleName MethodInvocation ArrayCreation ArrayInitializer SimpleName instruction
log SimpleName MethodInvocation ArrayCreation ArrayInitializer SimpleName language tag
info SimpleName MethodInvocation StringLiteral received {} {} {}
info SimpleName MethodInvocation ArrayCreation ArrayInitializer SimpleName name
info SimpleName MethodInvocation ArrayCreation ArrayInitializer SimpleName instruction
info SimpleName MethodInvocation ArrayCreation ArrayInitializer SimpleName language tag
received {} {} {} StringLiteral MethodInvocation ArrayCreation ArrayInitializer SimpleName name
received {} {} {} StringLiteral MethodInvocation ArrayCreation ArrayInitializer SimpleName instruction
received {} {} {} StringLiteral MethodInvocation ArrayCreation ArrayInitializer SimpleName language tag
buffer SimpleName MethodInvocation SimpleName get int
num SimpleName VariableDeclarationFragment MethodInvocation SimpleName buffer
num SimpleName VariableDeclarationFragment MethodInvocation SimpleName get int
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName num
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName buffer
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get int
string SimpleName SimpleType ArrayType ArrayCreation SimpleName num
prompt SimpleName VariableDeclarationFragment ArrayCreation SimpleName num
boolean PrimitiveType ArrayType ArrayCreation SimpleName num
echo SimpleName VariableDeclarationFragment ArrayCreation ArrayType PrimitiveType boolean
echo SimpleName VariableDeclarationFragment ArrayCreation SimpleName num
boolean PrimitiveType ArrayType VariableDeclarationStatement VariableDeclarationFragment SimpleName echo
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression SimpleName num
prompt SimpleName ArrayAccess SimpleName i
buffer SimpleName MethodInvocation SimpleName get string
prompt SimpleName ArrayAccess Assignment MethodInvocation SimpleName buffer
prompt SimpleName ArrayAccess Assignment MethodInvocation SimpleName get string
i SimpleName ArrayAccess Assignment MethodInvocation SimpleName buffer
i SimpleName ArrayAccess Assignment MethodInvocation SimpleName get string
echo SimpleName ArrayAccess SimpleName i
buffer SimpleName MethodInvocation SimpleName get byte
buffer SimpleName MethodInvocation InfixExpression NumberLiteral empty
get byte SimpleName MethodInvocation InfixExpression NumberLiteral empty
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName num
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
num SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation StringLiteral promt {}
log SimpleName MethodInvocation SimpleName prompt
info SimpleName MethodInvocation StringLiteral promt {}
info SimpleName MethodInvocation SimpleName prompt
promt {} StringLiteral MethodInvocation SimpleName prompt
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation StringLiteral echo {}
log SimpleName MethodInvocation SimpleName echo
info SimpleName MethodInvocation StringLiteral echo {}
info SimpleName MethodInvocation SimpleName echo
echo {} StringLiteral MethodInvocation SimpleName echo
num SimpleName InfixExpression NumberLiteral empty
string SimpleName SimpleType ArrayType ArrayCreation NumberLiteral empty
rep SimpleName Assignment ArrayCreation NumberLiteral empty
num SimpleName InfixExpression NumberLiteral empty
num SimpleName InfixExpression InfixExpression InfixExpression SimpleName password
empty NumberLiteral InfixExpression InfixExpression InfixExpression SimpleName password
echo SimpleName ArrayAccess NumberLiteral empty
prompt SimpleName ArrayAccess NumberLiteral empty
prompt SimpleName ArrayAccess MethodInvocation SimpleName to lower case
empty NumberLiteral ArrayAccess MethodInvocation SimpleName to lower case
prompt SimpleName ArrayAccess MethodInvocation MethodInvocation SimpleName starts with
empty NumberLiteral ArrayAccess MethodInvocation MethodInvocation SimpleName starts with
to lower case SimpleName MethodInvocation MethodInvocation SimpleName starts with
prompt SimpleName ArrayAccess MethodInvocation MethodInvocation StringLiteral password
empty NumberLiteral ArrayAccess MethodInvocation MethodInvocation StringLiteral password
to lower case SimpleName MethodInvocation MethodInvocation StringLiteral password
starts with SimpleName MethodInvocation StringLiteral password
rep SimpleName Assignment ArrayCreation ArrayInitializer SimpleName password
session SimpleName MethodInvocation SimpleName get client factory manager
session SimpleName MethodInvocation MethodInvocation SimpleName get user interaction
get client factory manager SimpleName MethodInvocation MethodInvocation SimpleName get user interaction
ui SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName session
ui SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get client factory manager
ui SimpleName VariableDeclarationFragment MethodInvocation SimpleName get user interaction
user interaction SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName ui
session SimpleName MethodInvocation SimpleName get io session
session SimpleName MethodInvocation MethodInvocation SimpleName get remote address
get io session SimpleName MethodInvocation MethodInvocation SimpleName get remote address
session SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to string
get io session SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to string
get remote address SimpleName MethodInvocation MethodInvocation SimpleName to string
username SimpleName InfixExpression StringLiteral @
username SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName get remote address
username SimpleName InfixExpression MethodInvocation SimpleName to string
@ StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName get remote address
@ StringLiteral InfixExpression MethodInvocation SimpleName to string
dest SimpleName VariableDeclarationFragment InfixExpression SimpleName username
dest SimpleName VariableDeclarationFragment InfixExpression StringLiteral @
dest SimpleName VariableDeclarationFragment InfixExpression MethodInvocation SimpleName to string
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName dest
ui SimpleName MethodInvocation SimpleName interactive
ui SimpleName MethodInvocation SimpleName dest
ui SimpleName MethodInvocation SimpleName name
ui SimpleName MethodInvocation SimpleName instruction
ui SimpleName MethodInvocation SimpleName prompt
interactive SimpleName MethodInvocation SimpleName dest
interactive SimpleName MethodInvocation SimpleName name
interactive SimpleName MethodInvocation SimpleName instruction
interactive SimpleName MethodInvocation SimpleName prompt
interactive SimpleName MethodInvocation SimpleName echo
dest SimpleName MethodInvocation SimpleName name
dest SimpleName MethodInvocation SimpleName instruction
dest SimpleName MethodInvocation SimpleName prompt
dest SimpleName MethodInvocation SimpleName echo
name SimpleName MethodInvocation SimpleName instruction
name SimpleName MethodInvocation SimpleName prompt
name SimpleName MethodInvocation SimpleName echo
instruction SimpleName MethodInvocation SimpleName prompt
instruction SimpleName MethodInvocation SimpleName echo
prompt SimpleName MethodInvocation SimpleName echo
rep SimpleName Assignment MethodInvocation SimpleName ui
rep SimpleName Assignment MethodInvocation SimpleName interactive
rep SimpleName Assignment MethodInvocation SimpleName dest
rep SimpleName Assignment MethodInvocation SimpleName name
rep SimpleName Assignment MethodInvocation SimpleName instruction
rep SimpleName Assignment MethodInvocation SimpleName prompt
rep SimpleName Assignment MethodInvocation SimpleName echo
session SimpleName MethodInvocation SimpleName create buffer
session SimpleName MethodInvocation SimpleName ssh msg userauth info response
session SimpleName MethodInvocation NumberLiteral empty
create buffer SimpleName MethodInvocation SimpleName ssh msg userauth info response
create buffer SimpleName MethodInvocation NumberLiteral empty
ssh msg userauth info response SimpleName MethodInvocation NumberLiteral empty
buffer SimpleName Assignment MethodInvocation SimpleName session
buffer SimpleName Assignment MethodInvocation SimpleName create buffer
buffer SimpleName Assignment MethodInvocation SimpleName ssh msg userauth info response
buffer SimpleName Assignment MethodInvocation NumberLiteral empty
buffer SimpleName MethodInvocation SimpleName put int
buffer SimpleName MethodInvocation QualifiedName replength
put int SimpleName MethodInvocation QualifiedName replength
string SimpleName SimpleType SingleVariableDeclaration SimpleName r
buffer SimpleName MethodInvocation SimpleName put string
buffer SimpleName MethodInvocation SimpleName r
put string SimpleName MethodInvocation SimpleName r
string SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName rep
r SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName rep
session SimpleName MethodInvocation SimpleName write packet
session SimpleName MethodInvocation SimpleName buffer
write packet SimpleName MethodInvocation SimpleName buffer
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation StringLiteral received ssh msg userauth success
info SimpleName MethodInvocation StringLiteral received ssh msg userauth success
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation StringLiteral received ssh msg userauth failure
info SimpleName MethodInvocation StringLiteral received ssh msg userauth failure
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation StringLiteral received unknown packet {}
log SimpleName MethodInvocation SimpleName cmd
info SimpleName MethodInvocation StringLiteral received unknown packet {}
info SimpleName MethodInvocation SimpleName cmd
received unknown packet {} StringLiteral MethodInvocation SimpleName cmd
cmd SimpleName SwitchStatement SwitchCase SimpleName ssh msg userauth info request
cmd SimpleName SwitchStatement ExpressionStatement MethodInvocation SimpleName log
cmd SimpleName SwitchStatement ExpressionStatement MethodInvocation SimpleName info
cmd SimpleName SwitchStatement ExpressionStatement MethodInvocation StringLiteral received ssh msg userauth info request
cmd SimpleName SwitchStatement VariableDeclarationStatement SimpleType SimpleName string
cmd SimpleName SwitchStatement VariableDeclarationStatement VariableDeclarationFragment SimpleName name
cmd SimpleName SwitchStatement VariableDeclarationStatement SimpleType SimpleName string
cmd SimpleName SwitchStatement VariableDeclarationStatement VariableDeclarationFragment SimpleName instruction
cmd SimpleName SwitchStatement VariableDeclarationStatement SimpleType SimpleName string
cmd SimpleName SwitchStatement VariableDeclarationStatement VariableDeclarationFragment SimpleName language tag
rep SimpleName EnhancedForStatement SwitchStatement ReturnStatement QualifiedName resultcontinued
rep SimpleName EnhancedForStatement SwitchStatement SwitchCase SimpleName ssh msg userauth success
rep SimpleName EnhancedForStatement SwitchStatement ReturnStatement QualifiedName resultsuccess
resultcontinued QualifiedName ReturnStatement SwitchStatement SwitchCase SimpleName ssh msg userauth success
resultcontinued QualifiedName ReturnStatement SwitchStatement ReturnStatement QualifiedName resultsuccess
resultcontinued QualifiedName ReturnStatement SwitchStatement SwitchCase SimpleName ssh msg userauth failure
ssh msg userauth success SimpleName SwitchCase SwitchStatement ReturnStatement QualifiedName resultsuccess
ssh msg userauth success SimpleName SwitchCase SwitchStatement SwitchCase SimpleName ssh msg userauth failure
ssh msg userauth success SimpleName SwitchCase SwitchStatement ReturnStatement QualifiedName resultfailure
resultsuccess QualifiedName ReturnStatement SwitchStatement SwitchCase SimpleName ssh msg userauth failure
resultsuccess QualifiedName ReturnStatement SwitchStatement ReturnStatement QualifiedName resultfailure
ssh msg userauth failure SimpleName SwitchCase SwitchStatement ReturnStatement QualifiedName resultfailure
ssh msg userauth failure SimpleName SwitchCase SwitchStatement ReturnStatement QualifiedName resultcontinued
resultfailure QualifiedName ReturnStatement SwitchStatement ReturnStatement QualifiedName resultcontinued
byte PrimitiveType VariableDeclarationStatement Block SwitchStatement SimpleName cmd
public Modifier MethodDeclaration SimpleType SimpleName result
public Modifier MethodDeclaration SimpleName next
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName buffer
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName buffer
public Modifier MethodDeclaration SimpleType SimpleName io exception
result SimpleName SimpleType MethodDeclaration SimpleName next
result SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName buffer
result SimpleName SimpleType MethodDeclaration SimpleType SimpleName io exception
next SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName buffer
next SimpleName MethodDeclaration SingleVariableDeclaration SimpleName buffer
next SimpleName MethodDeclaration SimpleType SimpleName io exception
buffer SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName result
public Modifier TypeDeclaration MethodDeclaration SimpleName next
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName buffer
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName result
test SimpleName TypeDeclaration MethodDeclaration SimpleName next
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName buffer
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName io exception