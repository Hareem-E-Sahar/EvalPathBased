gc status SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName result
inet socket address SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName address
zoo reader writer SimpleName MethodInvocation SimpleName get instance
zk SimpleName VariableDeclarationFragment MethodInvocation SimpleName zoo reader writer
zk SimpleName VariableDeclarationFragment MethodInvocation SimpleName get instance
zoo reader writer SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName zk
zoo util SimpleName MethodInvocation SimpleName get root
zoo util SimpleName MethodInvocation SimpleName instance
get root SimpleName MethodInvocation SimpleName instance
zoo util SimpleName MethodInvocation InfixExpression QualifiedName constantszgc lock
get root SimpleName MethodInvocation InfixExpression QualifiedName constantszgc lock
instance SimpleName MethodInvocation InfixExpression QualifiedName constantszgc lock
path SimpleName VariableDeclarationFragment InfixExpression MethodInvocation SimpleName zoo util
path SimpleName VariableDeclarationFragment InfixExpression MethodInvocation SimpleName get root
path SimpleName VariableDeclarationFragment InfixExpression MethodInvocation SimpleName instance
path SimpleName VariableDeclarationFragment InfixExpression QualifiedName constantszgc lock
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName path
list SimpleName SimpleType ParameterizedType SimpleType SimpleName string
zk SimpleName MethodInvocation SimpleName get children
zk SimpleName MethodInvocation SimpleName path
get children SimpleName MethodInvocation SimpleName path
locks SimpleName VariableDeclarationFragment MethodInvocation SimpleName zk
locks SimpleName VariableDeclarationFragment MethodInvocation SimpleName get children
locks SimpleName VariableDeclarationFragment MethodInvocation SimpleName path
locks SimpleName MethodInvocation SimpleName size
locks SimpleName MethodInvocation InfixExpression NumberLiteral empty
size SimpleName MethodInvocation InfixExpression NumberLiteral empty
locks SimpleName InfixExpression InfixExpression InfixExpression NumberLiteral empty
collections SimpleName MethodInvocation SimpleName sort
collections SimpleName MethodInvocation SimpleName locks
sort SimpleName MethodInvocation SimpleName locks
locks SimpleName MethodInvocation SimpleName get
locks SimpleName MethodInvocation NumberLiteral empty
get SimpleName MethodInvocation NumberLiteral empty
path SimpleName InfixExpression StringLiteral /
path SimpleName InfixExpression MethodInvocation SimpleName locks
path SimpleName InfixExpression MethodInvocation SimpleName get
path SimpleName InfixExpression MethodInvocation NumberLiteral empty
/ StringLiteral InfixExpression MethodInvocation SimpleName locks
/ StringLiteral InfixExpression MethodInvocation SimpleName get
/ StringLiteral InfixExpression MethodInvocation NumberLiteral empty
zk SimpleName MethodInvocation SimpleName get data
zk SimpleName MethodInvocation InfixExpression SimpleName path
zk SimpleName MethodInvocation InfixExpression StringLiteral /
zk SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName locks
zk SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get
zk SimpleName MethodInvocation InfixExpression MethodInvocation NumberLiteral empty
get data SimpleName MethodInvocation InfixExpression SimpleName path
get data SimpleName MethodInvocation InfixExpression StringLiteral /
get data SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName locks
get data SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get
get data SimpleName MethodInvocation InfixExpression MethodInvocation NumberLiteral empty
string SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName zk
string SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get data
string SimpleName SimpleType ClassInstanceCreation QualifiedName constantsutf
zk SimpleName MethodInvocation ClassInstanceCreation QualifiedName constantsutf
get data SimpleName MethodInvocation ClassInstanceCreation QualifiedName constantsutf
path SimpleName InfixExpression MethodInvocation ClassInstanceCreation QualifiedName constantsutf
/ StringLiteral InfixExpression MethodInvocation ClassInstanceCreation QualifiedName constantsutf
server services SimpleName SimpleType ClassInstanceCreation ClassInstanceCreation QualifiedName constantsutf
server services SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get address
constantsutf QualifiedName ClassInstanceCreation ClassInstanceCreation MethodInvocation SimpleName get address
server services SimpleName SimpleType ClassInstanceCreation MethodInvocation QualifiedName servicegc client
constantsutf QualifiedName ClassInstanceCreation ClassInstanceCreation MethodInvocation QualifiedName servicegc client
get address SimpleName MethodInvocation QualifiedName servicegc client
address SimpleName Assignment MethodInvocation SimpleName get address
address SimpleName Assignment MethodInvocation QualifiedName servicegc client
config SimpleName MethodInvocation SimpleName get configuration
thrift util SimpleName MethodInvocation SimpleName get client
thrift util SimpleName MethodInvocation ClassInstanceCreation SimpleType QualifiedName gc monitor serviceclientfactory
thrift util SimpleName MethodInvocation SimpleName address
thrift util SimpleName MethodInvocation MethodInvocation SimpleName config
thrift util SimpleName MethodInvocation MethodInvocation SimpleName get configuration
get client SimpleName MethodInvocation ClassInstanceCreation SimpleType QualifiedName gc monitor serviceclientfactory
get client SimpleName MethodInvocation SimpleName address
get client SimpleName MethodInvocation MethodInvocation SimpleName config
get client SimpleName MethodInvocation MethodInvocation SimpleName get configuration
gc monitor serviceclientfactory QualifiedName SimpleType ClassInstanceCreation MethodInvocation SimpleName address
address SimpleName MethodInvocation MethodInvocation SimpleName config
address SimpleName MethodInvocation MethodInvocation SimpleName get configuration
client SimpleName VariableDeclarationFragment MethodInvocation SimpleName thrift util
client SimpleName VariableDeclarationFragment MethodInvocation SimpleName get client
client SimpleName VariableDeclarationFragment MethodInvocation SimpleName address
client SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName config
client SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get configuration
gc monitor serviceclient QualifiedName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName client
tracer SimpleName MethodInvocation SimpleName trace info
security constants SimpleName MethodInvocation SimpleName get system credentials
client SimpleName MethodInvocation SimpleName get status
client SimpleName MethodInvocation MethodInvocation SimpleName tracer
client SimpleName MethodInvocation MethodInvocation SimpleName trace info
client SimpleName MethodInvocation MethodInvocation SimpleName security constants
client SimpleName MethodInvocation MethodInvocation SimpleName get system credentials
get status SimpleName MethodInvocation MethodInvocation SimpleName tracer
get status SimpleName MethodInvocation MethodInvocation SimpleName trace info
get status SimpleName MethodInvocation MethodInvocation SimpleName security constants
get status SimpleName MethodInvocation MethodInvocation SimpleName get system credentials
tracer SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName security constants
tracer SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get system credentials
trace info SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName security constants
trace info SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get system credentials
result SimpleName Assignment MethodInvocation SimpleName client
result SimpleName Assignment MethodInvocation SimpleName get status
result SimpleName Assignment MethodInvocation MethodInvocation SimpleName tracer
result SimpleName Assignment MethodInvocation MethodInvocation SimpleName trace info
result SimpleName Assignment MethodInvocation MethodInvocation SimpleName security constants
result SimpleName Assignment MethodInvocation MethodInvocation SimpleName get system credentials
thrift util SimpleName MethodInvocation SimpleName return client
thrift util SimpleName MethodInvocation SimpleName client
return client SimpleName MethodInvocation SimpleName client
exception SimpleName SimpleType SingleVariableDeclaration SimpleName ex
unable to contact the garbage collector at StringLiteral InfixExpression SimpleName address
log SimpleName MethodInvocation SimpleName warn
log SimpleName MethodInvocation InfixExpression StringLiteral unable to contact the garbage collector at
log SimpleName MethodInvocation InfixExpression SimpleName address
log SimpleName MethodInvocation SimpleName ex
warn SimpleName MethodInvocation InfixExpression StringLiteral unable to contact the garbage collector at
warn SimpleName MethodInvocation InfixExpression SimpleName address
warn SimpleName MethodInvocation SimpleName ex
unable to contact the garbage collector at StringLiteral InfixExpression MethodInvocation SimpleName ex
address SimpleName InfixExpression MethodInvocation SimpleName ex
private Modifier MethodDeclaration Modifier static
private Modifier MethodDeclaration SimpleType SimpleName gc status
private Modifier MethodDeclaration SimpleName fetch gc status
private Modifier MethodDeclaration Block ReturnStatement SimpleName result
static Modifier MethodDeclaration SimpleType SimpleName gc status
static Modifier MethodDeclaration SimpleName fetch gc status
static Modifier MethodDeclaration Block ReturnStatement SimpleName result
gc status SimpleName SimpleType MethodDeclaration SimpleName fetch gc status
fetch gc status SimpleName MethodDeclaration Block ReturnStatement SimpleName result
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration Modifier static
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName gc status
public Modifier TypeDeclaration MethodDeclaration SimpleName fetch gc status
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration Modifier static
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName gc status
test SimpleName TypeDeclaration MethodDeclaration SimpleName fetch gc status
