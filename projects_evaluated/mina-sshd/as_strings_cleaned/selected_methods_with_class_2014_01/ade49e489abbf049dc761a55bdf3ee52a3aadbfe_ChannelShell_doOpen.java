buffer SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName buffer
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation StringLiteral send agent forwarding request
info SimpleName MethodInvocation StringLiteral send agent forwarding request
session SimpleName MethodInvocation SimpleName create buffer
session SimpleName MethodInvocation QualifiedName ssh constantsssh msg channel request
session SimpleName MethodInvocation NumberLiteral empty
create buffer SimpleName MethodInvocation QualifiedName ssh constantsssh msg channel request
create buffer SimpleName MethodInvocation NumberLiteral empty
ssh constantsssh msg channel request QualifiedName MethodInvocation NumberLiteral empty
buffer SimpleName Assignment MethodInvocation SimpleName session
buffer SimpleName Assignment MethodInvocation SimpleName create buffer
buffer SimpleName Assignment MethodInvocation QualifiedName ssh constantsssh msg channel request
buffer SimpleName Assignment MethodInvocation NumberLiteral empty
buffer SimpleName MethodInvocation SimpleName put int
buffer SimpleName MethodInvocation SimpleName recipient
put int SimpleName MethodInvocation SimpleName recipient
buffer SimpleName MethodInvocation SimpleName put string
buffer SimpleName MethodInvocation StringLiteral authagentreqopensshcom
put string SimpleName MethodInvocation StringLiteral authagentreqopensshcom
buffer SimpleName MethodInvocation SimpleName put boolean
buffer SimpleName MethodInvocation BooleanLiteral false
put boolean SimpleName MethodInvocation BooleanLiteral false
write packet SimpleName MethodInvocation SimpleName buffer
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation StringLiteral send ssh msg channel request ptyreq
info SimpleName MethodInvocation StringLiteral send ssh msg channel request ptyreq
session SimpleName MethodInvocation SimpleName create buffer
session SimpleName MethodInvocation QualifiedName ssh constantsssh msg channel request
session SimpleName MethodInvocation NumberLiteral empty
create buffer SimpleName MethodInvocation QualifiedName ssh constantsssh msg channel request
create buffer SimpleName MethodInvocation NumberLiteral empty
ssh constantsssh msg channel request QualifiedName MethodInvocation NumberLiteral empty
buffer SimpleName Assignment MethodInvocation SimpleName session
buffer SimpleName Assignment MethodInvocation SimpleName create buffer
buffer SimpleName Assignment MethodInvocation QualifiedName ssh constantsssh msg channel request
buffer SimpleName Assignment MethodInvocation NumberLiteral empty
buffer SimpleName MethodInvocation SimpleName put int
buffer SimpleName MethodInvocation SimpleName recipient
put int SimpleName MethodInvocation SimpleName recipient
buffer SimpleName MethodInvocation SimpleName put string
buffer SimpleName MethodInvocation StringLiteral ptyreq
put string SimpleName MethodInvocation StringLiteral ptyreq
buffer SimpleName MethodInvocation SimpleName put boolean
buffer SimpleName MethodInvocation BooleanLiteral false
put boolean SimpleName MethodInvocation BooleanLiteral false
buffer SimpleName MethodInvocation SimpleName put string
buffer SimpleName MethodInvocation SimpleName pty type
put string SimpleName MethodInvocation SimpleName pty type
buffer SimpleName MethodInvocation SimpleName put int
buffer SimpleName MethodInvocation SimpleName pty columns
put int SimpleName MethodInvocation SimpleName pty columns
buffer SimpleName MethodInvocation SimpleName put int
buffer SimpleName MethodInvocation SimpleName pty lines
put int SimpleName MethodInvocation SimpleName pty lines
buffer SimpleName MethodInvocation SimpleName put int
buffer SimpleName MethodInvocation SimpleName pty height
put int SimpleName MethodInvocation SimpleName pty height
buffer SimpleName MethodInvocation SimpleName put int
buffer SimpleName MethodInvocation SimpleName pty width
put int SimpleName MethodInvocation SimpleName pty width
modes SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName buffer
buffer SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName modes
pty mode SimpleName SimpleType SingleVariableDeclaration SimpleName mode
pty modes SimpleName MethodInvocation SimpleName key set
mode SimpleName MethodInvocation SimpleName to int
byte PrimitiveType CastExpression MethodInvocation SimpleName mode
byte PrimitiveType CastExpression MethodInvocation SimpleName to int
modes SimpleName MethodInvocation SimpleName put byte
modes SimpleName MethodInvocation CastExpression PrimitiveType byte
modes SimpleName MethodInvocation CastExpression MethodInvocation SimpleName mode
modes SimpleName MethodInvocation CastExpression MethodInvocation SimpleName to int
put byte SimpleName MethodInvocation CastExpression PrimitiveType byte
put byte SimpleName MethodInvocation CastExpression MethodInvocation SimpleName mode
put byte SimpleName MethodInvocation CastExpression MethodInvocation SimpleName to int
pty modes SimpleName MethodInvocation SimpleName get
pty modes SimpleName MethodInvocation SimpleName mode
get SimpleName MethodInvocation SimpleName mode
modes SimpleName MethodInvocation SimpleName put int
modes SimpleName MethodInvocation MethodInvocation SimpleName pty modes
modes SimpleName MethodInvocation MethodInvocation SimpleName get
modes SimpleName MethodInvocation MethodInvocation SimpleName mode
put int SimpleName MethodInvocation MethodInvocation SimpleName pty modes
put int SimpleName MethodInvocation MethodInvocation SimpleName get
put int SimpleName MethodInvocation MethodInvocation SimpleName mode
mode SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName pty modes
mode SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName key set
byte PrimitiveType CastExpression NumberLiteral empty
modes SimpleName MethodInvocation SimpleName put byte
modes SimpleName MethodInvocation CastExpression PrimitiveType byte
modes SimpleName MethodInvocation CastExpression NumberLiteral empty
put byte SimpleName MethodInvocation CastExpression PrimitiveType byte
put byte SimpleName MethodInvocation CastExpression NumberLiteral empty
modes SimpleName MethodInvocation SimpleName get compact data
buffer SimpleName MethodInvocation SimpleName put bytes
buffer SimpleName MethodInvocation MethodInvocation SimpleName modes
buffer SimpleName MethodInvocation MethodInvocation SimpleName get compact data
put bytes SimpleName MethodInvocation MethodInvocation SimpleName modes
put bytes SimpleName MethodInvocation MethodInvocation SimpleName get compact data
write packet SimpleName MethodInvocation SimpleName buffer
env SimpleName MethodInvocation SimpleName is empty
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation StringLiteral send ssh msg channel request env
info SimpleName MethodInvocation StringLiteral send ssh msg channel request env
mapentry QualifiedName SimpleType ParameterizedType SimpleType SimpleName string
mapentry QualifiedName SimpleType ParameterizedType SimpleType SimpleName string
string SimpleName SimpleType ParameterizedType SimpleType SimpleName string
mapentry QualifiedName SimpleType ParameterizedType SingleVariableDeclaration SimpleName entry
string SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName entry
string SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName entry
env SimpleName MethodInvocation SimpleName entry set
session SimpleName MethodInvocation SimpleName create buffer
session SimpleName MethodInvocation QualifiedName ssh constantsssh msg channel request
session SimpleName MethodInvocation NumberLiteral empty
create buffer SimpleName MethodInvocation QualifiedName ssh constantsssh msg channel request
create buffer SimpleName MethodInvocation NumberLiteral empty
ssh constantsssh msg channel request QualifiedName MethodInvocation NumberLiteral empty
buffer SimpleName Assignment MethodInvocation SimpleName session
buffer SimpleName Assignment MethodInvocation SimpleName create buffer
buffer SimpleName Assignment MethodInvocation QualifiedName ssh constantsssh msg channel request
buffer SimpleName Assignment MethodInvocation NumberLiteral empty
buffer SimpleName MethodInvocation SimpleName put int
buffer SimpleName MethodInvocation SimpleName recipient
put int SimpleName MethodInvocation SimpleName recipient
buffer SimpleName MethodInvocation SimpleName put string
buffer SimpleName MethodInvocation StringLiteral env
put string SimpleName MethodInvocation StringLiteral env
buffer SimpleName MethodInvocation SimpleName put boolean
buffer SimpleName MethodInvocation BooleanLiteral false
put boolean SimpleName MethodInvocation BooleanLiteral false
entry SimpleName MethodInvocation SimpleName get key
buffer SimpleName MethodInvocation SimpleName put string
buffer SimpleName MethodInvocation MethodInvocation SimpleName entry
buffer SimpleName MethodInvocation MethodInvocation SimpleName get key
put string SimpleName MethodInvocation MethodInvocation SimpleName entry
put string SimpleName MethodInvocation MethodInvocation SimpleName get key
entry SimpleName MethodInvocation SimpleName get value
buffer SimpleName MethodInvocation SimpleName put string
buffer SimpleName MethodInvocation MethodInvocation SimpleName entry
buffer SimpleName MethodInvocation MethodInvocation SimpleName get value
put string SimpleName MethodInvocation MethodInvocation SimpleName entry
put string SimpleName MethodInvocation MethodInvocation SimpleName get value
write packet SimpleName MethodInvocation SimpleName buffer
entry SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName env
entry SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName entry set
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation StringLiteral send ssh msg channel request shell
info SimpleName MethodInvocation StringLiteral send ssh msg channel request shell
session SimpleName MethodInvocation SimpleName create buffer
session SimpleName MethodInvocation QualifiedName ssh constantsssh msg channel request
session SimpleName MethodInvocation NumberLiteral empty
create buffer SimpleName MethodInvocation QualifiedName ssh constantsssh msg channel request
create buffer SimpleName MethodInvocation NumberLiteral empty
ssh constantsssh msg channel request QualifiedName MethodInvocation NumberLiteral empty
buffer SimpleName Assignment MethodInvocation SimpleName session
buffer SimpleName Assignment MethodInvocation SimpleName create buffer
buffer SimpleName Assignment MethodInvocation QualifiedName ssh constantsssh msg channel request
buffer SimpleName Assignment MethodInvocation NumberLiteral empty
buffer SimpleName MethodInvocation SimpleName put int
buffer SimpleName MethodInvocation SimpleName recipient
put int SimpleName MethodInvocation SimpleName recipient
buffer SimpleName MethodInvocation SimpleName put string
buffer SimpleName MethodInvocation StringLiteral shell
put string SimpleName MethodInvocation StringLiteral shell
buffer SimpleName MethodInvocation SimpleName put boolean
buffer SimpleName MethodInvocation BooleanLiteral false
put boolean SimpleName MethodInvocation BooleanLiteral false
write packet SimpleName MethodInvocation SimpleName buffer
agent forwarding SimpleName IfStatement Block IfStatement SimpleName use pty
protected Modifier MethodDeclaration PrimitiveType void
protected Modifier MethodDeclaration SimpleName do open
protected Modifier MethodDeclaration SimpleType SimpleName io exception
protected Modifier MethodDeclaration Block IfStatement SimpleName agent forwarding
protected Modifier MethodDeclaration Block IfStatement SimpleName use pty
void PrimitiveType MethodDeclaration SimpleName do open
void PrimitiveType MethodDeclaration SimpleType SimpleName io exception
void PrimitiveType MethodDeclaration Block IfStatement SimpleName agent forwarding
void PrimitiveType MethodDeclaration Block IfStatement SimpleName use pty
do open SimpleName MethodDeclaration SimpleType SimpleName io exception
do open SimpleName MethodDeclaration Block IfStatement SimpleName agent forwarding
do open SimpleName MethodDeclaration Block IfStatement SimpleName use pty
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier protected
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName do open
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
test SimpleName TypeDeclaration MethodDeclaration Modifier protected
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName do open
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName io exception