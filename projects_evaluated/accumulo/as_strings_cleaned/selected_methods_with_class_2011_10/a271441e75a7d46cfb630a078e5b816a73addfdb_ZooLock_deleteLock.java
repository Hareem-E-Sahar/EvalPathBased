string SimpleName SimpleType SingleVariableDeclaration SimpleName path
string SimpleName SimpleType SingleVariableDeclaration SimpleName lock data
list SimpleName SimpleType ParameterizedType SimpleType SimpleName string
zoo reader writer SimpleName MethodInvocation SimpleName get instance
zk SimpleName VariableDeclarationFragment MethodInvocation SimpleName zoo reader writer
zk SimpleName VariableDeclarationFragment MethodInvocation SimpleName get instance
zoo reader writer SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName zk
zk SimpleName MethodInvocation SimpleName get children
zk SimpleName MethodInvocation SimpleName path
get children SimpleName MethodInvocation SimpleName path
children SimpleName Assignment MethodInvocation SimpleName zk
children SimpleName Assignment MethodInvocation SimpleName get children
children SimpleName Assignment MethodInvocation SimpleName path
children SimpleName MethodInvocation SimpleName size
children SimpleName MethodInvocation InfixExpression NumberLiteral empty
size SimpleName MethodInvocation InfixExpression NumberLiteral empty
no lock is held at StringLiteral InfixExpression SimpleName path
illegal state exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral no lock is held at
illegal state exception SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName path
collections SimpleName MethodInvocation SimpleName sort
collections SimpleName MethodInvocation SimpleName children
sort SimpleName MethodInvocation SimpleName children
children SimpleName MethodInvocation SimpleName get
children SimpleName MethodInvocation NumberLiteral empty
get SimpleName MethodInvocation NumberLiteral empty
lock node SimpleName VariableDeclarationFragment MethodInvocation SimpleName children
lock node SimpleName VariableDeclarationFragment MethodInvocation SimpleName get
lock node SimpleName VariableDeclarationFragment MethodInvocation NumberLiteral empty
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName lock node
lock node SimpleName MethodInvocation SimpleName starts with
lock node SimpleName MethodInvocation SimpleName lock prefix
starts with SimpleName MethodInvocation SimpleName lock prefix
node StringLiteral InfixExpression SimpleName lock node
node StringLiteral InfixExpression StringLiteral at
node StringLiteral InfixExpression SimpleName path
node StringLiteral InfixExpression StringLiteral is not a lock node
lock node SimpleName InfixExpression StringLiteral at
lock node SimpleName InfixExpression SimpleName path
lock node SimpleName InfixExpression StringLiteral is not a lock node
at StringLiteral InfixExpression SimpleName path
at StringLiteral InfixExpression StringLiteral is not a lock node
path SimpleName InfixExpression StringLiteral is not a lock node
runtime exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral node
runtime exception SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName lock node
runtime exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral at
runtime exception SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName path
runtime exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral is not a lock node
stat SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName stat
stat SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName stat
path SimpleName InfixExpression StringLiteral /
path SimpleName InfixExpression SimpleName lock node
/ StringLiteral InfixExpression SimpleName lock node
zk SimpleName MethodInvocation SimpleName get data
zk SimpleName MethodInvocation InfixExpression SimpleName path
zk SimpleName MethodInvocation InfixExpression StringLiteral /
zk SimpleName MethodInvocation InfixExpression SimpleName lock node
zk SimpleName MethodInvocation SimpleName stat
get data SimpleName MethodInvocation InfixExpression SimpleName path
get data SimpleName MethodInvocation InfixExpression StringLiteral /
get data SimpleName MethodInvocation InfixExpression SimpleName lock node
get data SimpleName MethodInvocation SimpleName stat
path SimpleName InfixExpression MethodInvocation SimpleName stat
/ StringLiteral InfixExpression MethodInvocation SimpleName stat
lock node SimpleName InfixExpression MethodInvocation SimpleName stat
data SimpleName VariableDeclarationFragment MethodInvocation SimpleName zk
data SimpleName VariableDeclarationFragment MethodInvocation SimpleName get data
data SimpleName VariableDeclarationFragment MethodInvocation InfixExpression SimpleName path
data SimpleName VariableDeclarationFragment MethodInvocation InfixExpression StringLiteral /
data SimpleName VariableDeclarationFragment MethodInvocation InfixExpression SimpleName lock node
data SimpleName VariableDeclarationFragment MethodInvocation SimpleName stat
byte PrimitiveType ArrayType VariableDeclarationStatement VariableDeclarationFragment SimpleName data
string SimpleName SimpleType ClassInstanceCreation SimpleName data
lock data SimpleName MethodInvocation SimpleName equals
lock data SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName string
lock data SimpleName MethodInvocation ClassInstanceCreation SimpleName data
equals SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName string
equals SimpleName MethodInvocation ClassInstanceCreation SimpleName data
path SimpleName InfixExpression StringLiteral /
path SimpleName InfixExpression SimpleName lock node
/ StringLiteral InfixExpression SimpleName lock node
stat SimpleName MethodInvocation SimpleName get version
zk SimpleName MethodInvocation SimpleName recursive delete
zk SimpleName MethodInvocation InfixExpression SimpleName path
zk SimpleName MethodInvocation InfixExpression StringLiteral /
zk SimpleName MethodInvocation InfixExpression SimpleName lock node
zk SimpleName MethodInvocation MethodInvocation SimpleName stat
zk SimpleName MethodInvocation MethodInvocation SimpleName get version
zk SimpleName MethodInvocation QualifiedName node missing policyfail
recursive delete SimpleName MethodInvocation InfixExpression SimpleName path
recursive delete SimpleName MethodInvocation InfixExpression StringLiteral /
recursive delete SimpleName MethodInvocation InfixExpression SimpleName lock node
recursive delete SimpleName MethodInvocation MethodInvocation SimpleName stat
recursive delete SimpleName MethodInvocation MethodInvocation SimpleName get version
recursive delete SimpleName MethodInvocation QualifiedName node missing policyfail
path SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName stat
path SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName get version
/ StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName stat
/ StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName get version
lock node SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName stat
lock node SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName get version
path SimpleName InfixExpression MethodInvocation QualifiedName node missing policyfail
/ StringLiteral InfixExpression MethodInvocation QualifiedName node missing policyfail
lock node SimpleName InfixExpression MethodInvocation QualifiedName node missing policyfail
stat SimpleName MethodInvocation MethodInvocation QualifiedName node missing policyfail
get version SimpleName MethodInvocation MethodInvocation QualifiedName node missing policyfail
public Modifier MethodDeclaration Modifier static
public Modifier MethodDeclaration PrimitiveType boolean
public Modifier MethodDeclaration SimpleName delete lock
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName path
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName lock data
static Modifier MethodDeclaration PrimitiveType boolean
static Modifier MethodDeclaration SimpleName delete lock
static Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName path
static Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName lock data
static Modifier MethodDeclaration SimpleType SimpleName interrupted exception
boolean PrimitiveType MethodDeclaration SimpleName delete lock
boolean PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
boolean PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName path
boolean PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
boolean PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName lock data
boolean PrimitiveType MethodDeclaration SimpleType SimpleName interrupted exception
boolean PrimitiveType MethodDeclaration SimpleType SimpleName keeper exception
delete lock SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
delete lock SimpleName MethodDeclaration SingleVariableDeclaration SimpleName path
delete lock SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
delete lock SimpleName MethodDeclaration SingleVariableDeclaration SimpleName lock data
delete lock SimpleName MethodDeclaration SimpleType SimpleName interrupted exception
delete lock SimpleName MethodDeclaration SimpleType SimpleName keeper exception
delete lock SimpleName MethodDeclaration Block ReturnStatement BooleanLiteral false
path SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName lock data
path SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName interrupted exception
path SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName keeper exception
lock data SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName interrupted exception
lock data SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName keeper exception
interrupted exception SimpleName SimpleType MethodDeclaration SimpleType SimpleName keeper exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration Modifier static
public Modifier TypeDeclaration MethodDeclaration PrimitiveType boolean
public Modifier TypeDeclaration MethodDeclaration SimpleName delete lock
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName path
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName lock data
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName interrupted exception
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName keeper exception
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration Modifier static
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType boolean
test SimpleName TypeDeclaration MethodDeclaration SimpleName delete lock
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName path
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName lock data
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName interrupted exception
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName keeper exception
