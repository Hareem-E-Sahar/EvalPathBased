apr library SimpleName MethodInvocation SimpleName create local socket address
auth socket SimpleName Assignment MethodInvocation SimpleName apr library
auth socket SimpleName Assignment MethodInvocation SimpleName create local socket address
apr library SimpleName MethodInvocation SimpleName get instance
apr library SimpleName MethodInvocation MethodInvocation SimpleName get root pool
get instance SimpleName MethodInvocation MethodInvocation SimpleName get root pool
pool SimpleName MethodInvocation SimpleName create
pool SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName apr library
pool SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get instance
pool SimpleName MethodInvocation MethodInvocation SimpleName get root pool
create SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName apr library
create SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get instance
create SimpleName MethodInvocation MethodInvocation SimpleName get root pool
pool SimpleName Assignment MethodInvocation SimpleName pool
pool SimpleName Assignment MethodInvocation SimpleName create
pool SimpleName Assignment MethodInvocation MethodInvocation SimpleName get root pool
local SimpleName MethodInvocation SimpleName create
local SimpleName MethodInvocation SimpleName auth socket
local SimpleName MethodInvocation SimpleName pool
create SimpleName MethodInvocation SimpleName auth socket
create SimpleName MethodInvocation SimpleName pool
auth socket SimpleName MethodInvocation SimpleName pool
handle SimpleName Assignment MethodInvocation SimpleName local
handle SimpleName Assignment MethodInvocation SimpleName create
handle SimpleName Assignment MethodInvocation SimpleName auth socket
handle SimpleName Assignment MethodInvocation SimpleName pool
local SimpleName MethodInvocation SimpleName bind
local SimpleName MethodInvocation SimpleName handle
local SimpleName MethodInvocation NumberLiteral empty
bind SimpleName MethodInvocation SimpleName handle
bind SimpleName MethodInvocation NumberLiteral empty
handle SimpleName MethodInvocation NumberLiteral empty
result SimpleName VariableDeclarationFragment MethodInvocation SimpleName local
result SimpleName VariableDeclarationFragment MethodInvocation SimpleName bind
result SimpleName VariableDeclarationFragment MethodInvocation SimpleName handle
result SimpleName VariableDeclarationFragment MethodInvocation NumberLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName result
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName local
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName bind
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName handle
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation NumberLiteral empty
result SimpleName InfixExpression QualifiedName statusapr success
throw exception SimpleName MethodInvocation SimpleName result
apr library SimpleName MethodInvocation SimpleName secure local socket
apr library SimpleName MethodInvocation SimpleName auth socket
apr library SimpleName MethodInvocation SimpleName handle
secure local socket SimpleName MethodInvocation SimpleName auth socket
secure local socket SimpleName MethodInvocation SimpleName handle
auth socket SimpleName MethodInvocation SimpleName handle
local SimpleName MethodInvocation SimpleName listen
local SimpleName MethodInvocation SimpleName handle
local SimpleName MethodInvocation NumberLiteral empty
listen SimpleName MethodInvocation SimpleName handle
listen SimpleName MethodInvocation NumberLiteral empty
handle SimpleName MethodInvocation NumberLiteral empty
result SimpleName Assignment MethodInvocation SimpleName local
result SimpleName Assignment MethodInvocation SimpleName listen
result SimpleName Assignment MethodInvocation SimpleName handle
result SimpleName Assignment MethodInvocation NumberLiteral empty
result SimpleName InfixExpression QualifiedName statusapr success
throw exception SimpleName MethodInvocation SimpleName result
executor SimpleName VariableDeclarationFragment MethodInvocation SimpleName get executor service
closeable executor service SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName executor
local SimpleName MethodInvocation SimpleName accept
local SimpleName MethodInvocation SimpleName handle
accept SimpleName MethodInvocation SimpleName handle
client sock SimpleName VariableDeclarationFragment MethodInvocation SimpleName local
client sock SimpleName VariableDeclarationFragment MethodInvocation SimpleName accept
client sock SimpleName VariableDeclarationFragment MethodInvocation SimpleName handle
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName client sock
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName local
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName accept
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName handle
socket SimpleName MethodInvocation SimpleName timeout set
socket SimpleName MethodInvocation SimpleName client sock
socket SimpleName MethodInvocation NumberLiteral empty
timeout set SimpleName MethodInvocation SimpleName client sock
timeout set SimpleName MethodInvocation NumberLiteral empty
client sock SimpleName MethodInvocation NumberLiteral empty
ssh agent session SimpleName SimpleType ClassInstanceCreation SimpleName client sock
ssh agent session SimpleName SimpleType ClassInstanceCreation SimpleName agent
client sock SimpleName ClassInstanceCreation SimpleName agent
ssh agent session SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName run
client sock SimpleName ClassInstanceCreation MethodInvocation SimpleName run
agent SimpleName ClassInstanceCreation MethodInvocation SimpleName run
true BooleanLiteral WhileStatement Block VariableDeclarationStatement PrimitiveType long
exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
log SimpleName MethodInvocation SimpleName error
log SimpleName MethodInvocation StringLiteral failed to run session
log SimpleName MethodInvocation SimpleName e
error SimpleName MethodInvocation StringLiteral failed to run session
error SimpleName MethodInvocation SimpleName e
failed to run session StringLiteral MethodInvocation SimpleName e
executor SimpleName MethodInvocation SimpleName submit
agent thread SimpleName Assignment MethodInvocation SimpleName executor
agent thread SimpleName Assignment MethodInvocation SimpleName submit
public Modifier MethodDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SimpleName start
public Modifier MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
public Modifier MethodDeclaration Block ReturnStatement SimpleName auth socket
string SimpleName SimpleType MethodDeclaration SimpleName start
string SimpleName SimpleType MethodDeclaration SimpleType SimpleName exception
start SimpleName MethodDeclaration SimpleType SimpleName exception
start SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
start SimpleName MethodDeclaration Block ReturnStatement SimpleName auth socket
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName string
public Modifier TypeDeclaration MethodDeclaration SimpleName start
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName string
test SimpleName TypeDeclaration MethodDeclaration SimpleName start
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
