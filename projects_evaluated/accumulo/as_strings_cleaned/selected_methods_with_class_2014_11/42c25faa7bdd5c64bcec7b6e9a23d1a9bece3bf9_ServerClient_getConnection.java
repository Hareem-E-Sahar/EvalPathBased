pair SimpleName SimpleType ParameterizedType SimpleType SimpleName string
pair SimpleName SimpleType ParameterizedType SimpleType QualifiedName client serviceclient
string SimpleName SimpleType ParameterizedType SimpleType QualifiedName client serviceclient
client context SimpleName SimpleType SingleVariableDeclaration SimpleName context
boolean PrimitiveType SingleVariableDeclaration SimpleName prefer cached connections
long PrimitiveType SingleVariableDeclaration SimpleName rpc timeout
check argument SimpleName MethodInvocation InfixExpression SimpleName context
check argument SimpleName MethodInvocation StringLiteral context is null
context SimpleName InfixExpression MethodInvocation StringLiteral context is null
array list SimpleName SimpleType ParameterizedType SimpleType SimpleName thrift transport key
array list SimpleName SimpleType ParameterizedType SimpleType SimpleName thrift transport key
context SimpleName MethodInvocation SimpleName get instance
instance SimpleName VariableDeclarationFragment MethodInvocation SimpleName context
instance SimpleName VariableDeclarationFragment MethodInvocation SimpleName get instance
instance SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName instance
instance SimpleName MethodInvocation SimpleName get zoo keepers
instance SimpleName MethodInvocation SimpleName get zoo keepers session time out
zoo cache factory SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get zoo cache
get zoo cache SimpleName MethodInvocation MethodInvocation SimpleName instance
get zoo cache SimpleName MethodInvocation MethodInvocation SimpleName get zoo keepers
get zoo cache SimpleName MethodInvocation MethodInvocation SimpleName instance
get zoo cache SimpleName MethodInvocation MethodInvocation SimpleName get zoo keepers session time out
instance SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName instance
instance SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get zoo keepers session time out
get zoo keepers SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName instance
get zoo keepers SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get zoo keepers session time out
zc SimpleName VariableDeclarationFragment MethodInvocation SimpleName get zoo cache
zc SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName instance
zc SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get zoo keepers
zc SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName instance
zc SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get zoo keepers session time out
zoo cache SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName zc
string SimpleName SimpleType SingleVariableDeclaration SimpleName tserver
zoo util SimpleName MethodInvocation SimpleName get root
zoo util SimpleName MethodInvocation SimpleName instance
get root SimpleName MethodInvocation SimpleName instance
zoo util SimpleName MethodInvocation InfixExpression QualifiedName constantsztservers
get root SimpleName MethodInvocation InfixExpression QualifiedName constantsztservers
instance SimpleName MethodInvocation InfixExpression QualifiedName constantsztservers
zc SimpleName MethodInvocation SimpleName get children
zc SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName zoo util
zc SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get root
zc SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName instance
zc SimpleName MethodInvocation InfixExpression QualifiedName constantsztservers
get children SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName zoo util
get children SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get root
get children SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName instance
get children SimpleName MethodInvocation InfixExpression QualifiedName constantsztservers
zoo util SimpleName MethodInvocation SimpleName get root
zoo util SimpleName MethodInvocation SimpleName instance
get root SimpleName MethodInvocation SimpleName instance
zoo util SimpleName MethodInvocation InfixExpression QualifiedName constantsztservers
get root SimpleName MethodInvocation InfixExpression QualifiedName constantsztservers
instance SimpleName MethodInvocation InfixExpression QualifiedName constantsztservers
zoo util SimpleName MethodInvocation InfixExpression StringLiteral /
get root SimpleName MethodInvocation InfixExpression StringLiteral /
instance SimpleName MethodInvocation InfixExpression StringLiteral /
zoo util SimpleName MethodInvocation InfixExpression SimpleName tserver
get root SimpleName MethodInvocation InfixExpression SimpleName tserver
instance SimpleName MethodInvocation InfixExpression SimpleName tserver
constantsztservers QualifiedName InfixExpression StringLiteral /
constantsztservers QualifiedName InfixExpression SimpleName tserver
/ StringLiteral InfixExpression SimpleName tserver
path SimpleName VariableDeclarationFragment InfixExpression MethodInvocation SimpleName zoo util
path SimpleName VariableDeclarationFragment InfixExpression MethodInvocation SimpleName get root
path SimpleName VariableDeclarationFragment InfixExpression MethodInvocation SimpleName instance
path SimpleName VariableDeclarationFragment InfixExpression QualifiedName constantsztservers
path SimpleName VariableDeclarationFragment InfixExpression StringLiteral /
path SimpleName VariableDeclarationFragment InfixExpression SimpleName tserver
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName path
zoo util SimpleName MethodInvocation SimpleName get lock data
zoo util SimpleName MethodInvocation SimpleName zc
zoo util SimpleName MethodInvocation SimpleName path
get lock data SimpleName MethodInvocation SimpleName zc
get lock data SimpleName MethodInvocation SimpleName path
zc SimpleName MethodInvocation SimpleName path
data SimpleName VariableDeclarationFragment MethodInvocation SimpleName zoo util
data SimpleName VariableDeclarationFragment MethodInvocation SimpleName get lock data
data SimpleName VariableDeclarationFragment MethodInvocation SimpleName zc
data SimpleName VariableDeclarationFragment MethodInvocation SimpleName path
byte PrimitiveType ArrayType VariableDeclarationStatement VariableDeclarationFragment SimpleName data
string SimpleName SimpleType ClassInstanceCreation SimpleName data
string SimpleName SimpleType ClassInstanceCreation SimpleName utf
data SimpleName ClassInstanceCreation SimpleName utf
string SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName equals
data SimpleName ClassInstanceCreation MethodInvocation SimpleName equals
utf SimpleName ClassInstanceCreation MethodInvocation SimpleName equals
string SimpleName SimpleType ClassInstanceCreation MethodInvocation StringLiteral master
data SimpleName ClassInstanceCreation MethodInvocation StringLiteral master
utf SimpleName ClassInstanceCreation MethodInvocation StringLiteral master
equals SimpleName MethodInvocation StringLiteral master
string SimpleName SimpleType ClassInstanceCreation SimpleName data
server services SimpleName SimpleType ClassInstanceCreation ClassInstanceCreation SimpleName data
server services SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get address string
data SimpleName ClassInstanceCreation ClassInstanceCreation MethodInvocation SimpleName get address string
server services SimpleName SimpleType ClassInstanceCreation MethodInvocation QualifiedName servicetserv client
data SimpleName ClassInstanceCreation ClassInstanceCreation MethodInvocation QualifiedName servicetserv client
get address string SimpleName MethodInvocation QualifiedName servicetserv client
thrift transport key SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get address string
thrift transport key SimpleName SimpleType ClassInstanceCreation MethodInvocation QualifiedName servicetserv client
thrift transport key SimpleName SimpleType ClassInstanceCreation SimpleName rpc timeout
thrift transport key SimpleName SimpleType ClassInstanceCreation SimpleName context
get address string SimpleName MethodInvocation ClassInstanceCreation SimpleName rpc timeout
servicetserv client QualifiedName MethodInvocation ClassInstanceCreation SimpleName rpc timeout
get address string SimpleName MethodInvocation ClassInstanceCreation SimpleName context
servicetserv client QualifiedName MethodInvocation ClassInstanceCreation SimpleName context
rpc timeout SimpleName ClassInstanceCreation SimpleName context
servers SimpleName MethodInvocation SimpleName add
servers SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName thrift transport key
servers SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get address string
servers SimpleName MethodInvocation ClassInstanceCreation MethodInvocation QualifiedName servicetserv client
servers SimpleName MethodInvocation ClassInstanceCreation SimpleName rpc timeout
servers SimpleName MethodInvocation ClassInstanceCreation SimpleName context
add SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName thrift transport key
add SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get address string
add SimpleName MethodInvocation ClassInstanceCreation MethodInvocation QualifiedName servicetserv client
add SimpleName MethodInvocation ClassInstanceCreation SimpleName rpc timeout
add SimpleName MethodInvocation ClassInstanceCreation SimpleName context
tserver SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName zc
tserver SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName get children
opened SimpleName VariableDeclarationFragment BooleanLiteral false
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName opened
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment BooleanLiteral false
pair SimpleName SimpleType ParameterizedType SimpleType SimpleName string
pair SimpleName SimpleType ParameterizedType SimpleType SimpleName t transport
string SimpleName SimpleType ParameterizedType SimpleType SimpleName t transport
thrift transport pool SimpleName MethodInvocation SimpleName get instance
thrift transport pool SimpleName MethodInvocation MethodInvocation SimpleName get any transport
get instance SimpleName MethodInvocation MethodInvocation SimpleName get any transport
thrift transport pool SimpleName MethodInvocation MethodInvocation SimpleName servers
get instance SimpleName MethodInvocation MethodInvocation SimpleName servers
thrift transport pool SimpleName MethodInvocation MethodInvocation SimpleName prefer cached connections
get instance SimpleName MethodInvocation MethodInvocation SimpleName prefer cached connections
get any transport SimpleName MethodInvocation SimpleName servers
get any transport SimpleName MethodInvocation SimpleName prefer cached connections
servers SimpleName MethodInvocation SimpleName prefer cached connections
pair SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName thrift transport pool
pair SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get instance
pair SimpleName VariableDeclarationFragment MethodInvocation SimpleName get any transport
pair SimpleName VariableDeclarationFragment MethodInvocation SimpleName servers
pair SimpleName VariableDeclarationFragment MethodInvocation SimpleName prefer cached connections
pair SimpleName MethodInvocation SimpleName get second
thrift util SimpleName MethodInvocation SimpleName create client
thrift util SimpleName MethodInvocation ClassInstanceCreation SimpleType QualifiedName client serviceclientfactory
thrift util SimpleName MethodInvocation MethodInvocation SimpleName pair
thrift util SimpleName MethodInvocation MethodInvocation SimpleName get second
create client SimpleName MethodInvocation ClassInstanceCreation SimpleType QualifiedName client serviceclientfactory
create client SimpleName MethodInvocation MethodInvocation SimpleName pair
create client SimpleName MethodInvocation MethodInvocation SimpleName get second
client SimpleName VariableDeclarationFragment MethodInvocation SimpleName thrift util
client SimpleName VariableDeclarationFragment MethodInvocation SimpleName create client
client SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName pair
client SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get second
client serviceclient QualifiedName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName client
opened SimpleName Assignment BooleanLiteral true
warned about t servers being down SimpleName Assignment BooleanLiteral false
pair SimpleName SimpleType ParameterizedType SimpleType SimpleName string
pair SimpleName SimpleType ParameterizedType SimpleType QualifiedName client serviceclient
string SimpleName SimpleType ParameterizedType SimpleType QualifiedName client serviceclient
pair SimpleName MethodInvocation SimpleName get first
pair SimpleName SimpleType ParameterizedType ClassInstanceCreation SimpleName client
string SimpleName SimpleType ParameterizedType ClassInstanceCreation SimpleName client
client serviceclient QualifiedName SimpleType ParameterizedType ClassInstanceCreation SimpleName client
pair SimpleName MethodInvocation ClassInstanceCreation SimpleName client
get first SimpleName MethodInvocation ClassInstanceCreation SimpleName client
servers SimpleName MethodInvocation SimpleName is empty
log SimpleName MethodInvocation SimpleName warn
log SimpleName MethodInvocation StringLiteral there are no tablet servers check that zookeeper and accumulo are running
warn SimpleName MethodInvocation StringLiteral there are no tablet servers check that zookeeper and accumulo are running
failed to find an available server in the list of servers StringLiteral InfixExpression SimpleName servers
log SimpleName MethodInvocation SimpleName warn
log SimpleName MethodInvocation InfixExpression StringLiteral failed to find an available server in the list of servers
log SimpleName MethodInvocation InfixExpression SimpleName servers
warn SimpleName MethodInvocation InfixExpression StringLiteral failed to find an available server in the list of servers
warn SimpleName MethodInvocation InfixExpression SimpleName servers
warned about t servers being down SimpleName Assignment BooleanLiteral true
public Modifier MethodDeclaration Modifier static
public Modifier MethodDeclaration ParameterizedType SimpleType SimpleName pair
public Modifier MethodDeclaration ParameterizedType SimpleType SimpleName string
public Modifier MethodDeclaration ParameterizedType SimpleType QualifiedName client serviceclient
public Modifier MethodDeclaration SimpleName get connection
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName client context
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName context
public Modifier MethodDeclaration SingleVariableDeclaration PrimitiveType boolean
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName prefer cached connections
static Modifier MethodDeclaration ParameterizedType SimpleType SimpleName pair
static Modifier MethodDeclaration ParameterizedType SimpleType SimpleName string
static Modifier MethodDeclaration ParameterizedType SimpleType QualifiedName client serviceclient
static Modifier MethodDeclaration SimpleName get connection
static Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName client context
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName context
static Modifier MethodDeclaration SingleVariableDeclaration PrimitiveType boolean
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName prefer cached connections
static Modifier MethodDeclaration SingleVariableDeclaration PrimitiveType long
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName rpc timeout
pair SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName get connection
string SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName get connection
client serviceclient QualifiedName SimpleType ParameterizedType MethodDeclaration SimpleName get connection
get connection SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName client context
get connection SimpleName MethodDeclaration SingleVariableDeclaration SimpleName context
get connection SimpleName MethodDeclaration SingleVariableDeclaration PrimitiveType boolean
get connection SimpleName MethodDeclaration SingleVariableDeclaration SimpleName prefer cached connections
get connection SimpleName MethodDeclaration SingleVariableDeclaration PrimitiveType long
get connection SimpleName MethodDeclaration SingleVariableDeclaration SimpleName rpc timeout
get connection SimpleName MethodDeclaration SimpleType SimpleName t transport exception
get connection SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType boolean
context SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType boolean
context SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName prefer cached connections
context SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType long
context SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName rpc timeout
context SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName t transport exception
boolean PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType long
boolean PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName rpc timeout
prefer cached connections SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType long
prefer cached connections SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName rpc timeout
boolean PrimitiveType SingleVariableDeclaration MethodDeclaration SimpleType SimpleName t transport exception
prefer cached connections SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName t transport exception
long PrimitiveType SingleVariableDeclaration MethodDeclaration SimpleType SimpleName t transport exception
rpc timeout SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName t transport exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration Modifier static
public Modifier TypeDeclaration MethodDeclaration SimpleName get connection
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName context
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType boolean
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName prefer cached connections
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType long
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName rpc timeout
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName t transport exception
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration Modifier static
test SimpleName TypeDeclaration MethodDeclaration SimpleName get connection
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName context
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType boolean
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName prefer cached connections
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType long
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName rpc timeout
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName t transport exception
