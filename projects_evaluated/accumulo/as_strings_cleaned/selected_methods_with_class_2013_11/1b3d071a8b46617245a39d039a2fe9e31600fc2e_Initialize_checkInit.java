configuration SimpleName SimpleType SingleVariableDeclaration SimpleName conf
file system SimpleName SimpleType SingleVariableDeclaration SimpleName fs
site configuration SimpleName SimpleType SingleVariableDeclaration SimpleName sconf
fs SimpleName MethodInvocation SimpleName get uri
fs SimpleName MethodInvocation MethodInvocation SimpleName to string
get uri SimpleName MethodInvocation MethodInvocation SimpleName to string
fs uri SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName fs
fs uri SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get uri
fs uri SimpleName VariableDeclarationFragment MethodInvocation SimpleName to string
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName fs uri
hadoop filesystem is StringLiteral InfixExpression SimpleName fs uri
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation InfixExpression StringLiteral hadoop filesystem is
log SimpleName MethodInvocation InfixExpression SimpleName fs uri
info SimpleName MethodInvocation InfixExpression StringLiteral hadoop filesystem is
info SimpleName MethodInvocation InfixExpression SimpleName fs uri
server constants SimpleName MethodInvocation SimpleName get base dir
accumulo data dir is StringLiteral InfixExpression MethodInvocation SimpleName server constants
accumulo data dir is StringLiteral InfixExpression MethodInvocation SimpleName get base dir
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation InfixExpression StringLiteral accumulo data dir is
log SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName server constants
log SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get base dir
info SimpleName MethodInvocation InfixExpression StringLiteral accumulo data dir is
info SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName server constants
info SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get base dir
sconf SimpleName MethodInvocation SimpleName get
sconf SimpleName MethodInvocation QualifiedName propertyinstance zk host
get SimpleName MethodInvocation QualifiedName propertyinstance zk host
zookeeper server is StringLiteral InfixExpression MethodInvocation SimpleName sconf
zookeeper server is StringLiteral InfixExpression MethodInvocation SimpleName get
zookeeper server is StringLiteral InfixExpression MethodInvocation QualifiedName propertyinstance zk host
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation InfixExpression StringLiteral zookeeper server is
log SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName sconf
log SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get
log SimpleName MethodInvocation InfixExpression MethodInvocation QualifiedName propertyinstance zk host
info SimpleName MethodInvocation InfixExpression StringLiteral zookeeper server is
info SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName sconf
info SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get
info SimpleName MethodInvocation InfixExpression MethodInvocation QualifiedName propertyinstance zk host
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation StringLiteral checking if zookeeper is available if this hangs then you need to make sure zookeeper is running
info SimpleName MethodInvocation StringLiteral checking if zookeeper is available if this hangs then you need to make sure zookeeper is running
log SimpleName MethodInvocation SimpleName fatal
log SimpleName MethodInvocation StringLiteral zookeeper needs to be up and running in order to init exiting ...
fatal SimpleName MethodInvocation StringLiteral zookeeper needs to be up and running in order to init exiting ...
sconf SimpleName MethodInvocation SimpleName get
sconf SimpleName MethodInvocation QualifiedName propertyinstance secret
get SimpleName MethodInvocation QualifiedName propertyinstance secret
propertyinstance secret QualifiedName MethodInvocation SimpleName get default value
sconf SimpleName MethodInvocation MethodInvocation SimpleName equals
get SimpleName MethodInvocation MethodInvocation SimpleName equals
propertyinstance secret QualifiedName MethodInvocation MethodInvocation SimpleName equals
sconf SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName propertyinstance secret
sconf SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get default value
get SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName propertyinstance secret
get SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get default value
propertyinstance secret QualifiedName MethodInvocation MethodInvocation MethodInvocation QualifiedName propertyinstance secret
propertyinstance secret QualifiedName MethodInvocation MethodInvocation MethodInvocation SimpleName get default value
equals SimpleName MethodInvocation MethodInvocation QualifiedName propertyinstance secret
equals SimpleName MethodInvocation MethodInvocation SimpleName get default value
c SimpleName VariableDeclarationFragment MethodInvocation SimpleName get console reader
console reader SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName c
c SimpleName MethodInvocation SimpleName beep
c SimpleName MethodInvocation SimpleName print newline
c SimpleName MethodInvocation SimpleName print newline
c SimpleName MethodInvocation SimpleName print string
c SimpleName MethodInvocation StringLiteral warning your instance secret is still set to the default this is not secure we highly recommend you change it
print string SimpleName MethodInvocation StringLiteral warning your instance secret is still set to the default this is not secure we highly recommend you change it
c SimpleName MethodInvocation SimpleName print newline
c SimpleName MethodInvocation SimpleName print newline
c SimpleName MethodInvocation SimpleName print newline
c SimpleName MethodInvocation SimpleName print string
c SimpleName MethodInvocation StringLiteral you can change the instance secret in accumulo by using
print string SimpleName MethodInvocation StringLiteral you can change the instance secret in accumulo by using
c SimpleName MethodInvocation SimpleName print newline
orgapacheaccumuloserverutilchange secret QualifiedName SimpleType TypeLiteral MethodInvocation SimpleName get name
binaccumulo StringLiteral InfixExpression MethodInvocation SimpleName get name
binaccumulo StringLiteral InfixExpression StringLiteral old password new password
get name SimpleName MethodInvocation InfixExpression StringLiteral old password new password
c SimpleName MethodInvocation SimpleName print string
c SimpleName MethodInvocation InfixExpression StringLiteral binaccumulo
c SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get name
c SimpleName MethodInvocation InfixExpression StringLiteral old password new password
print string SimpleName MethodInvocation InfixExpression StringLiteral binaccumulo
print string SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get name
print string SimpleName MethodInvocation InfixExpression StringLiteral old password new password
c SimpleName MethodInvocation SimpleName print newline
c SimpleName MethodInvocation SimpleName print string
c SimpleName MethodInvocation StringLiteral you will also need to edit your secret in your configuration file by adding the property instancesecret to your confaccumulositexml without this accumulo will not operate correctly
print string SimpleName MethodInvocation StringLiteral you will also need to edit your secret in your configuration file by adding the property instancesecret to your confaccumulositexml without this accumulo will not operate correctly
c SimpleName MethodInvocation SimpleName print newline
is initialized SimpleName MethodInvocation SimpleName fs
sconf SimpleName MethodInvocation SimpleName get
sconf SimpleName MethodInvocation QualifiedName propertyinstance dfs dir
get SimpleName MethodInvocation QualifiedName propertyinstance dfs dir
instance dfs dir SimpleName VariableDeclarationFragment MethodInvocation SimpleName sconf
instance dfs dir SimpleName VariableDeclarationFragment MethodInvocation SimpleName get
instance dfs dir SimpleName VariableDeclarationFragment MethodInvocation QualifiedName propertyinstance dfs dir
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName instance dfs dir
it appears the directory StringLiteral InfixExpression SimpleName fs uri
it appears the directory StringLiteral InfixExpression SimpleName instance dfs dir
it appears the directory StringLiteral InfixExpression StringLiteral was previously initialized
fs uri SimpleName InfixExpression SimpleName instance dfs dir
fs uri SimpleName InfixExpression StringLiteral was previously initialized
instance dfs dir SimpleName InfixExpression StringLiteral was previously initialized
log SimpleName MethodInvocation SimpleName fatal
log SimpleName MethodInvocation InfixExpression StringLiteral it appears the directory
log SimpleName MethodInvocation InfixExpression SimpleName fs uri
log SimpleName MethodInvocation InfixExpression SimpleName instance dfs dir
log SimpleName MethodInvocation InfixExpression StringLiteral was previously initialized
fatal SimpleName MethodInvocation InfixExpression StringLiteral it appears the directory
fatal SimpleName MethodInvocation InfixExpression SimpleName fs uri
fatal SimpleName MethodInvocation InfixExpression SimpleName instance dfs dir
fatal SimpleName MethodInvocation InfixExpression StringLiteral was previously initialized
sconf SimpleName MethodInvocation SimpleName get
sconf SimpleName MethodInvocation QualifiedName propertyinstance dfs uri
get SimpleName MethodInvocation QualifiedName propertyinstance dfs uri
instance dfs uri SimpleName VariableDeclarationFragment MethodInvocation SimpleName sconf
instance dfs uri SimpleName VariableDeclarationFragment MethodInvocation SimpleName get
instance dfs uri SimpleName VariableDeclarationFragment MethodInvocation QualifiedName propertyinstance dfs uri
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName instance dfs uri
empty StringLiteral MethodInvocation SimpleName equals
empty StringLiteral MethodInvocation SimpleName instance dfs uri
equals SimpleName MethodInvocation SimpleName instance dfs uri
you are using the default uri for the filesystem set the property StringLiteral InfixExpression QualifiedName propertyinstance dfs uri
you are using the default uri for the filesystem set the property StringLiteral InfixExpression StringLiteral to use a different filesystem
propertyinstance dfs uri QualifiedName InfixExpression StringLiteral to use a different filesystem
log SimpleName MethodInvocation SimpleName fatal
log SimpleName MethodInvocation InfixExpression StringLiteral you are using the default uri for the filesystem set the property
log SimpleName MethodInvocation InfixExpression QualifiedName propertyinstance dfs uri
log SimpleName MethodInvocation InfixExpression StringLiteral to use a different filesystem
fatal SimpleName MethodInvocation InfixExpression StringLiteral you are using the default uri for the filesystem set the property
fatal SimpleName MethodInvocation InfixExpression QualifiedName propertyinstance dfs uri
fatal SimpleName MethodInvocation InfixExpression StringLiteral to use a different filesystem
change the property StringLiteral InfixExpression QualifiedName propertyinstance dfs uri
change the property StringLiteral InfixExpression StringLiteral to use a different filesystem
propertyinstance dfs uri QualifiedName InfixExpression StringLiteral to use a different filesystem
log SimpleName MethodInvocation SimpleName fatal
log SimpleName MethodInvocation InfixExpression StringLiteral change the property
log SimpleName MethodInvocation InfixExpression QualifiedName propertyinstance dfs uri
log SimpleName MethodInvocation InfixExpression StringLiteral to use a different filesystem
fatal SimpleName MethodInvocation InfixExpression StringLiteral change the property
fatal SimpleName MethodInvocation InfixExpression QualifiedName propertyinstance dfs uri
fatal SimpleName MethodInvocation InfixExpression StringLiteral to use a different filesystem
or change the property StringLiteral InfixExpression QualifiedName propertyinstance dfs dir
or change the property StringLiteral InfixExpression StringLiteral to use a different directory
propertyinstance dfs dir QualifiedName InfixExpression StringLiteral to use a different directory
log SimpleName MethodInvocation SimpleName fatal
log SimpleName MethodInvocation InfixExpression StringLiteral or change the property
log SimpleName MethodInvocation InfixExpression QualifiedName propertyinstance dfs dir
log SimpleName MethodInvocation InfixExpression StringLiteral to use a different directory
fatal SimpleName MethodInvocation InfixExpression StringLiteral or change the property
fatal SimpleName MethodInvocation InfixExpression QualifiedName propertyinstance dfs dir
fatal SimpleName MethodInvocation InfixExpression StringLiteral to use a different directory
the current value of StringLiteral InfixExpression QualifiedName propertyinstance dfs uri
the current value of StringLiteral InfixExpression StringLiteral is 
the current value of StringLiteral InfixExpression SimpleName instance dfs uri
the current value of StringLiteral InfixExpression StringLiteral 
propertyinstance dfs uri QualifiedName InfixExpression StringLiteral is 
propertyinstance dfs uri QualifiedName InfixExpression SimpleName instance dfs uri
propertyinstance dfs uri QualifiedName InfixExpression StringLiteral 
is StringLiteral InfixExpression SimpleName instance dfs uri
is StringLiteral InfixExpression StringLiteral 
instance dfs uri SimpleName InfixExpression StringLiteral 
log SimpleName MethodInvocation SimpleName fatal
log SimpleName MethodInvocation InfixExpression StringLiteral the current value of
log SimpleName MethodInvocation InfixExpression QualifiedName propertyinstance dfs uri
log SimpleName MethodInvocation InfixExpression StringLiteral is 
log SimpleName MethodInvocation InfixExpression SimpleName instance dfs uri
log SimpleName MethodInvocation InfixExpression StringLiteral 
fatal SimpleName MethodInvocation InfixExpression StringLiteral the current value of
fatal SimpleName MethodInvocation InfixExpression QualifiedName propertyinstance dfs uri
fatal SimpleName MethodInvocation InfixExpression StringLiteral is 
fatal SimpleName MethodInvocation InfixExpression SimpleName instance dfs uri
fatal SimpleName MethodInvocation InfixExpression StringLiteral 
the current value of StringLiteral InfixExpression QualifiedName propertyinstance dfs dir
the current value of StringLiteral InfixExpression StringLiteral is 
the current value of StringLiteral InfixExpression SimpleName instance dfs dir
the current value of StringLiteral InfixExpression StringLiteral 
propertyinstance dfs dir QualifiedName InfixExpression StringLiteral is 
propertyinstance dfs dir QualifiedName InfixExpression SimpleName instance dfs dir
propertyinstance dfs dir QualifiedName InfixExpression StringLiteral 
is StringLiteral InfixExpression SimpleName instance dfs dir
is StringLiteral InfixExpression StringLiteral 
instance dfs dir SimpleName InfixExpression StringLiteral 
log SimpleName MethodInvocation SimpleName fatal
log SimpleName MethodInvocation InfixExpression StringLiteral the current value of
log SimpleName MethodInvocation InfixExpression QualifiedName propertyinstance dfs dir
log SimpleName MethodInvocation InfixExpression StringLiteral is 
log SimpleName MethodInvocation InfixExpression SimpleName instance dfs dir
log SimpleName MethodInvocation InfixExpression StringLiteral 
fatal SimpleName MethodInvocation InfixExpression StringLiteral the current value of
fatal SimpleName MethodInvocation InfixExpression QualifiedName propertyinstance dfs dir
fatal SimpleName MethodInvocation InfixExpression StringLiteral is 
fatal SimpleName MethodInvocation InfixExpression SimpleName instance dfs dir
fatal SimpleName MethodInvocation InfixExpression StringLiteral 
io exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
io exception SimpleName SimpleType ClassInstanceCreation StringLiteral failed to check if filesystem already initialized
io exception SimpleName SimpleType ClassInstanceCreation SimpleName e
failed to check if filesystem already initialized StringLiteral ClassInstanceCreation SimpleName e
static Modifier MethodDeclaration PrimitiveType boolean
static Modifier MethodDeclaration SimpleName check init
static Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName configuration
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName conf
static Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName file system
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName fs
static Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName site configuration
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName sconf
boolean PrimitiveType MethodDeclaration SimpleName check init
boolean PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName configuration
boolean PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName conf
boolean PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName file system
boolean PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName fs
boolean PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName site configuration
boolean PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName sconf
boolean PrimitiveType MethodDeclaration SimpleType SimpleName io exception
check init SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName configuration
check init SimpleName MethodDeclaration SingleVariableDeclaration SimpleName conf
check init SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName file system
check init SimpleName MethodDeclaration SingleVariableDeclaration SimpleName fs
check init SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName site configuration
check init SimpleName MethodDeclaration SingleVariableDeclaration SimpleName sconf
check init SimpleName MethodDeclaration SimpleType SimpleName io exception
check init SimpleName MethodDeclaration Block ReturnStatement BooleanLiteral true
conf SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName fs
conf SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName sconf
conf SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
fs SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName sconf
fs SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
sconf SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier static
public Modifier TypeDeclaration MethodDeclaration PrimitiveType boolean
public Modifier TypeDeclaration MethodDeclaration SimpleName check init
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName conf
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName fs
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName sconf
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
test SimpleName TypeDeclaration MethodDeclaration Modifier static
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType boolean
test SimpleName TypeDeclaration MethodDeclaration SimpleName check init
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName conf
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName fs
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName sconf
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
