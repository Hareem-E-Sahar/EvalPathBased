config error SimpleName IfStatement ReturnStatement NumberLiteral empty
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName input
system SimpleName MethodInvocation SimpleName getenv
system SimpleName MethodInvocation StringLiteral home
getenv SimpleName MethodInvocation StringLiteral home
system SimpleName MethodInvocation InfixExpression StringLiteral accumulo
getenv SimpleName MethodInvocation InfixExpression StringLiteral accumulo
home StringLiteral MethodInvocation InfixExpression StringLiteral accumulo
config dir SimpleName VariableDeclarationFragment InfixExpression MethodInvocation SimpleName system
config dir SimpleName VariableDeclarationFragment InfixExpression MethodInvocation SimpleName getenv
config dir SimpleName VariableDeclarationFragment InfixExpression MethodInvocation StringLiteral home
config dir SimpleName VariableDeclarationFragment InfixExpression StringLiteral accumulo
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName config dir
config dir SimpleName InfixExpression StringLiteral shell historytxt
history path SimpleName VariableDeclarationFragment InfixExpression SimpleName config dir
history path SimpleName VariableDeclarationFragment InfixExpression StringLiteral shell historytxt
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName history path
file SimpleName SimpleType ClassInstanceCreation SimpleName config dir
accumulo dir SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName file
accumulo dir SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName config dir
file SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName accumulo dir
accumulo dir SimpleName MethodInvocation SimpleName exists
accumulo dir SimpleName MethodInvocation SimpleName mkdirs
unable to make directory for history at StringLiteral InfixExpression SimpleName accumulo dir
log SimpleName MethodInvocation SimpleName warn
log SimpleName MethodInvocation InfixExpression StringLiteral unable to make directory for history at
log SimpleName MethodInvocation InfixExpression SimpleName accumulo dir
warn SimpleName MethodInvocation InfixExpression StringLiteral unable to make directory for history at
warn SimpleName MethodInvocation InfixExpression SimpleName accumulo dir
history SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName history
history SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName history
file SimpleName SimpleType ClassInstanceCreation SimpleName history path
history SimpleName MethodInvocation SimpleName set history file
history SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName file
history SimpleName MethodInvocation ClassInstanceCreation SimpleName history path
set history file SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName file
set history file SimpleName MethodInvocation ClassInstanceCreation SimpleName history path
reader SimpleName MethodInvocation SimpleName set history
reader SimpleName MethodInvocation SimpleName history
set history SimpleName MethodInvocation SimpleName history
io exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
unable to load history file at StringLiteral InfixExpression SimpleName history path
log SimpleName MethodInvocation SimpleName warn
log SimpleName MethodInvocation InfixExpression StringLiteral unable to load history file at
log SimpleName MethodInvocation InfixExpression SimpleName history path
warn SimpleName MethodInvocation InfixExpression StringLiteral unable to load history file at
warn SimpleName MethodInvocation InfixExpression SimpleName history path
shell completor SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName user completor
file SimpleName SimpleType ClassInstanceCreation SimpleName exec file
javautilscanner QualifiedName SimpleType ClassInstanceCreation ClassInstanceCreation SimpleName exec file
scanner SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType QualifiedName javautilscanner
scanner SimpleName VariableDeclarationFragment ClassInstanceCreation ClassInstanceCreation SimpleName exec file
javautilscanner QualifiedName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName scanner
scanner SimpleName MethodInvocation SimpleName has next line
scanner SimpleName MethodInvocation SimpleName next line
exec command SimpleName MethodInvocation MethodInvocation SimpleName scanner
exec command SimpleName MethodInvocation MethodInvocation SimpleName next line
exec command SimpleName MethodInvocation BooleanLiteral true
exec command SimpleName MethodInvocation MethodInvocation SimpleName is verbose
scanner SimpleName MethodInvocation MethodInvocation BooleanLiteral true
next line SimpleName MethodInvocation MethodInvocation BooleanLiteral true
scanner SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName is verbose
next line SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName is verbose
true BooleanLiteral MethodInvocation MethodInvocation SimpleName is verbose
string SimpleName SimpleType SingleVariableDeclaration SimpleName command
exec command SimpleName MethodInvocation SimpleName split
exec command SimpleName MethodInvocation StringLiteral empty
split SimpleName MethodInvocation StringLiteral empty
exec command SimpleName MethodInvocation SimpleName command
exec command SimpleName MethodInvocation BooleanLiteral true
exec command SimpleName MethodInvocation MethodInvocation SimpleName is verbose
command SimpleName MethodInvocation BooleanLiteral true
command SimpleName MethodInvocation MethodInvocation SimpleName is verbose
true BooleanLiteral MethodInvocation MethodInvocation SimpleName is verbose
command SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName exec command
command SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName split
command SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation StringLiteral empty
has exited SimpleName MethodInvocation IfStatement ReturnStatement SimpleName exit code
reader SimpleName MethodInvocation SimpleName remove completor
reader SimpleName MethodInvocation SimpleName user completor
remove completor SimpleName MethodInvocation SimpleName user completor
user completor SimpleName Assignment MethodInvocation SimpleName setup completion
reader SimpleName MethodInvocation SimpleName add completor
reader SimpleName MethodInvocation SimpleName user completor
add completor SimpleName MethodInvocation SimpleName user completor
reader SimpleName MethodInvocation SimpleName set default prompt
reader SimpleName MethodInvocation MethodInvocation SimpleName get default prompt
set default prompt SimpleName MethodInvocation MethodInvocation SimpleName get default prompt
reader SimpleName MethodInvocation SimpleName read line
input SimpleName Assignment MethodInvocation SimpleName reader
input SimpleName Assignment MethodInvocation SimpleName read line
reader SimpleName MethodInvocation SimpleName print newline
exec command SimpleName MethodInvocation SimpleName input
exec command SimpleName MethodInvocation SimpleName disable auth timeout
exec command SimpleName MethodInvocation BooleanLiteral false
input SimpleName MethodInvocation SimpleName disable auth timeout
input SimpleName MethodInvocation BooleanLiteral false
disable auth timeout SimpleName MethodInvocation BooleanLiteral false
true BooleanLiteral WhileStatement Block IfStatement SimpleName tab completion
public Modifier MethodDeclaration PrimitiveType int
public Modifier MethodDeclaration SimpleName start
public Modifier MethodDeclaration SimpleType SimpleName io exception
public Modifier MethodDeclaration Block IfStatement SimpleName config error
public Modifier MethodDeclaration Block WhileStatement BooleanLiteral true
int PrimitiveType MethodDeclaration SimpleName start
int PrimitiveType MethodDeclaration SimpleType SimpleName io exception
int PrimitiveType MethodDeclaration Block IfStatement SimpleName config error
int PrimitiveType MethodDeclaration Block WhileStatement BooleanLiteral true
start SimpleName MethodDeclaration SimpleType SimpleName io exception
start SimpleName MethodDeclaration Block IfStatement SimpleName config error
start SimpleName MethodDeclaration Block WhileStatement BooleanLiteral true
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType int
public Modifier TypeDeclaration MethodDeclaration SimpleName start
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType int
test SimpleName TypeDeclaration MethodDeclaration SimpleName start
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
