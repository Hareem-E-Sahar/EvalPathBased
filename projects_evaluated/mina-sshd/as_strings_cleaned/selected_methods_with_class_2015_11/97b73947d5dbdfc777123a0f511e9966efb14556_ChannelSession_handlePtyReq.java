buffer SimpleName SimpleType SingleVariableDeclaration SimpleName buffer
buffer SimpleName MethodInvocation SimpleName get string
term SimpleName VariableDeclarationFragment MethodInvocation SimpleName buffer
term SimpleName VariableDeclarationFragment MethodInvocation SimpleName get string
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName term
buffer SimpleName MethodInvocation SimpleName get int
t columns SimpleName VariableDeclarationFragment MethodInvocation SimpleName buffer
t columns SimpleName VariableDeclarationFragment MethodInvocation SimpleName get int
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName t columns
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName buffer
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get int
buffer SimpleName MethodInvocation SimpleName get int
t rows SimpleName VariableDeclarationFragment MethodInvocation SimpleName buffer
t rows SimpleName VariableDeclarationFragment MethodInvocation SimpleName get int
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName t rows
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName buffer
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get int
buffer SimpleName MethodInvocation SimpleName get int
t width SimpleName VariableDeclarationFragment MethodInvocation SimpleName buffer
t width SimpleName VariableDeclarationFragment MethodInvocation SimpleName get int
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName t width
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName buffer
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get int
buffer SimpleName MethodInvocation SimpleName get int
t height SimpleName VariableDeclarationFragment MethodInvocation SimpleName buffer
t height SimpleName VariableDeclarationFragment MethodInvocation SimpleName get int
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName t height
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName buffer
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get int
buffer SimpleName MethodInvocation SimpleName get bytes
modes SimpleName VariableDeclarationFragment MethodInvocation SimpleName buffer
modes SimpleName VariableDeclarationFragment MethodInvocation SimpleName get bytes
byte PrimitiveType ArrayType VariableDeclarationStatement VariableDeclarationFragment SimpleName modes
environment SimpleName VariableDeclarationFragment MethodInvocation SimpleName get environment
environment SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName environment
map SimpleName SimpleType ParameterizedType SimpleType SimpleName pty mode
map SimpleName SimpleType ParameterizedType SimpleType SimpleName integer
pty mode SimpleName SimpleType ParameterizedType SimpleType SimpleName integer
environment SimpleName MethodInvocation SimpleName get pty modes
pty modes SimpleName VariableDeclarationFragment MethodInvocation SimpleName environment
pty modes SimpleName VariableDeclarationFragment MethodInvocation SimpleName get pty modes
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression QualifiedName modeslength
modes SimpleName ArrayAccess SimpleName i
modes SimpleName ArrayAccess InfixExpression QualifiedName pty modetty op end
i SimpleName ArrayAccess InfixExpression QualifiedName pty modetty op end
modes SimpleName ArrayAccess PostfixExpression SimpleName i
modes SimpleName ArrayAccess InfixExpression NumberLiteral x ff
i SimpleName PostfixExpression ArrayAccess InfixExpression NumberLiteral x ff
opcode SimpleName VariableDeclarationFragment InfixExpression ArrayAccess SimpleName modes
opcode SimpleName VariableDeclarationFragment InfixExpression NumberLiteral x ff
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName opcode
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment InfixExpression NumberLiteral x ff
pty mode SimpleName MethodInvocation SimpleName from int
pty mode SimpleName MethodInvocation SimpleName opcode
from int SimpleName MethodInvocation SimpleName opcode
mode SimpleName VariableDeclarationFragment MethodInvocation SimpleName pty mode
mode SimpleName VariableDeclarationFragment MethodInvocation SimpleName from int
mode SimpleName VariableDeclarationFragment MethodInvocation SimpleName opcode
pty mode SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName mode
handle pty req StringLiteral InfixExpression StringLiteral ) unknown pty opcode value
handle pty req StringLiteral InfixExpression SimpleName opcode
) unknown pty opcode value StringLiteral InfixExpression SimpleName opcode
log SimpleName MethodInvocation SimpleName warn
log SimpleName MethodInvocation InfixExpression StringLiteral handle pty req
log SimpleName MethodInvocation InfixExpression StringLiteral ) unknown pty opcode value
log SimpleName MethodInvocation InfixExpression SimpleName opcode
warn SimpleName MethodInvocation InfixExpression StringLiteral handle pty req
warn SimpleName MethodInvocation InfixExpression StringLiteral ) unknown pty opcode value
warn SimpleName MethodInvocation InfixExpression SimpleName opcode
modes SimpleName ArrayAccess PostfixExpression SimpleName i
modes SimpleName ArrayAccess InfixExpression NumberLiteral empty
i SimpleName PostfixExpression ArrayAccess InfixExpression NumberLiteral empty
empty NumberLiteral InfixExpression ParenthesizedExpression InfixExpression NumberLiteral xff
modes SimpleName ArrayAccess PostfixExpression SimpleName i
modes SimpleName ArrayAccess InfixExpression NumberLiteral empty
i SimpleName PostfixExpression ArrayAccess InfixExpression NumberLiteral empty
empty NumberLiteral InfixExpression ParenthesizedExpression InfixExpression NumberLiteral x ff
modes SimpleName ArrayAccess PostfixExpression SimpleName i
modes SimpleName ArrayAccess InfixExpression NumberLiteral empty
i SimpleName PostfixExpression ArrayAccess InfixExpression NumberLiteral empty
empty NumberLiteral InfixExpression ParenthesizedExpression InfixExpression NumberLiteral x ff
modes SimpleName ArrayAccess PostfixExpression SimpleName i
modes SimpleName ArrayAccess ParenthesizedExpression InfixExpression NumberLiteral x ff
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName val
pty modes SimpleName MethodInvocation SimpleName put
pty modes SimpleName MethodInvocation SimpleName mode
pty modes SimpleName MethodInvocation SimpleName val
put SimpleName MethodInvocation SimpleName mode
put SimpleName MethodInvocation SimpleName val
mode SimpleName MethodInvocation SimpleName val
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
log SimpleName MethodInvocation SimpleName is debug enabled
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral handle pty req term size - {}) pixels {}) modes
log SimpleName MethodInvocation SimpleName term
log SimpleName MethodInvocation SimpleName t columns
debug SimpleName MethodInvocation StringLiteral handle pty req term size - {}) pixels {}) modes
debug SimpleName MethodInvocation SimpleName term
debug SimpleName MethodInvocation SimpleName t columns
debug SimpleName MethodInvocation SimpleName t rows
handle pty req term size - {}) pixels {}) modes StringLiteral MethodInvocation SimpleName term
handle pty req term size - {}) pixels {}) modes StringLiteral MethodInvocation SimpleName t columns
handle pty req term size - {}) pixels {}) modes StringLiteral MethodInvocation SimpleName t rows
handle pty req term size - {}) pixels {}) modes StringLiteral MethodInvocation SimpleName t width
term SimpleName MethodInvocation SimpleName t columns
term SimpleName MethodInvocation SimpleName t rows
term SimpleName MethodInvocation SimpleName t width
term SimpleName MethodInvocation SimpleName t height
term SimpleName MethodInvocation SimpleName pty modes
t columns SimpleName MethodInvocation SimpleName t rows
t columns SimpleName MethodInvocation SimpleName t width
t columns SimpleName MethodInvocation SimpleName t height
t columns SimpleName MethodInvocation SimpleName pty modes
t rows SimpleName MethodInvocation SimpleName t width
t rows SimpleName MethodInvocation SimpleName t height
t rows SimpleName MethodInvocation SimpleName pty modes
t width SimpleName MethodInvocation SimpleName t height
t width SimpleName MethodInvocation SimpleName pty modes
t height SimpleName MethodInvocation SimpleName pty modes
add env variable SimpleName MethodInvocation QualifiedName environmentenv term
add env variable SimpleName MethodInvocation SimpleName term
environmentenv term QualifiedName MethodInvocation SimpleName term
integer SimpleName MethodInvocation SimpleName to string
integer SimpleName MethodInvocation SimpleName t columns
to string SimpleName MethodInvocation SimpleName t columns
add env variable SimpleName MethodInvocation QualifiedName environmentenv columns
add env variable SimpleName MethodInvocation MethodInvocation SimpleName integer
add env variable SimpleName MethodInvocation MethodInvocation SimpleName to string
add env variable SimpleName MethodInvocation MethodInvocation SimpleName t columns
environmentenv columns QualifiedName MethodInvocation MethodInvocation SimpleName integer
environmentenv columns QualifiedName MethodInvocation MethodInvocation SimpleName to string
environmentenv columns QualifiedName MethodInvocation MethodInvocation SimpleName t columns
integer SimpleName MethodInvocation SimpleName to string
integer SimpleName MethodInvocation SimpleName t rows
to string SimpleName MethodInvocation SimpleName t rows
add env variable SimpleName MethodInvocation QualifiedName environmentenv lines
add env variable SimpleName MethodInvocation MethodInvocation SimpleName integer
add env variable SimpleName MethodInvocation MethodInvocation SimpleName to string
add env variable SimpleName MethodInvocation MethodInvocation SimpleName t rows
environmentenv lines QualifiedName MethodInvocation MethodInvocation SimpleName integer
environmentenv lines QualifiedName MethodInvocation MethodInvocation SimpleName to string
environmentenv lines QualifiedName MethodInvocation MethodInvocation SimpleName t rows
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
protected Modifier MethodDeclaration PrimitiveType boolean
protected Modifier MethodDeclaration SimpleName handle pty req
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName buffer
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleName buffer
protected Modifier MethodDeclaration SimpleType SimpleName io exception
protected Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
protected Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
protected Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
protected Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
protected Modifier MethodDeclaration Block ReturnStatement BooleanLiteral true
boolean PrimitiveType MethodDeclaration SimpleName handle pty req
boolean PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName buffer
boolean PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName buffer
boolean PrimitiveType MethodDeclaration SimpleType SimpleName io exception
boolean PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
boolean PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
boolean PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
boolean PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
boolean PrimitiveType MethodDeclaration Block ReturnStatement BooleanLiteral true
handle pty req SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName buffer
handle pty req SimpleName MethodDeclaration SingleVariableDeclaration SimpleName buffer
handle pty req SimpleName MethodDeclaration SimpleType SimpleName io exception
handle pty req SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
handle pty req SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
handle pty req SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
handle pty req SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
handle pty req SimpleName MethodDeclaration Block ReturnStatement BooleanLiteral true
buffer SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier protected
public Modifier TypeDeclaration MethodDeclaration PrimitiveType boolean
public Modifier TypeDeclaration MethodDeclaration SimpleName handle pty req
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName buffer
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
test SimpleName TypeDeclaration MethodDeclaration Modifier protected
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType boolean
test SimpleName TypeDeclaration MethodDeclaration SimpleName handle pty req
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName buffer
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName io exception