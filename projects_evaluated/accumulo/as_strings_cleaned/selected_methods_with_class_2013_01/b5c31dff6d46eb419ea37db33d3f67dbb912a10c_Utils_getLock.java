string SimpleName SimpleType SingleVariableDeclaration SimpleName table id
long PrimitiveType SingleVariableDeclaration SimpleName tid
boolean PrimitiveType SingleVariableDeclaration SimpleName write lock
string SimpleName MethodInvocation SimpleName format
string SimpleName MethodInvocation StringLiteral % x
string SimpleName MethodInvocation SimpleName tid
format SimpleName MethodInvocation StringLiteral % x
format SimpleName MethodInvocation SimpleName tid
% x StringLiteral MethodInvocation SimpleName tid
string SimpleName MethodInvocation MethodInvocation SimpleName get bytes
format SimpleName MethodInvocation MethodInvocation SimpleName get bytes
% x StringLiteral MethodInvocation MethodInvocation SimpleName get bytes
tid SimpleName MethodInvocation MethodInvocation SimpleName get bytes
lock data SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName string
lock data SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName format
lock data SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation StringLiteral % x
lock data SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName tid
lock data SimpleName VariableDeclarationFragment MethodInvocation SimpleName get bytes
byte PrimitiveType ArrayType VariableDeclarationStatement VariableDeclarationFragment SimpleName lock data
hdfs zoo instance SimpleName MethodInvocation SimpleName get instance
zoo util SimpleName MethodInvocation SimpleName get root
zoo util SimpleName MethodInvocation MethodInvocation SimpleName hdfs zoo instance
zoo util SimpleName MethodInvocation MethodInvocation SimpleName get instance
get root SimpleName MethodInvocation MethodInvocation SimpleName hdfs zoo instance
get root SimpleName MethodInvocation MethodInvocation SimpleName get instance
zoo util SimpleName MethodInvocation InfixExpression QualifiedName constantsztable locks
get root SimpleName MethodInvocation InfixExpression QualifiedName constantsztable locks
hdfs zoo instance SimpleName MethodInvocation MethodInvocation InfixExpression QualifiedName constantsztable locks
get instance SimpleName MethodInvocation MethodInvocation InfixExpression QualifiedName constantsztable locks
zoo util SimpleName MethodInvocation InfixExpression StringLiteral /
get root SimpleName MethodInvocation InfixExpression StringLiteral /
hdfs zoo instance SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral /
get instance SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral /
zoo util SimpleName MethodInvocation InfixExpression SimpleName table id
get root SimpleName MethodInvocation InfixExpression SimpleName table id
hdfs zoo instance SimpleName MethodInvocation MethodInvocation InfixExpression SimpleName table id
get instance SimpleName MethodInvocation MethodInvocation InfixExpression SimpleName table id
constantsztable locks QualifiedName InfixExpression StringLiteral /
constantsztable locks QualifiedName InfixExpression SimpleName table id
/ StringLiteral InfixExpression SimpleName table id
zoo queue lock SimpleName SimpleType ClassInstanceCreation InfixExpression QualifiedName constantsztable locks
zoo queue lock SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral /
zoo queue lock SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName table id
zoo queue lock SimpleName SimpleType ClassInstanceCreation BooleanLiteral false
zoo util SimpleName MethodInvocation InfixExpression ClassInstanceCreation BooleanLiteral false
get root SimpleName MethodInvocation InfixExpression ClassInstanceCreation BooleanLiteral false
constantsztable locks QualifiedName InfixExpression ClassInstanceCreation BooleanLiteral false
/ StringLiteral InfixExpression ClassInstanceCreation BooleanLiteral false
table id SimpleName InfixExpression ClassInstanceCreation BooleanLiteral false
qlock SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName zoo queue lock
qlock SimpleName VariableDeclarationFragment ClassInstanceCreation InfixExpression QualifiedName constantsztable locks
qlock SimpleName VariableDeclarationFragment ClassInstanceCreation InfixExpression StringLiteral /
qlock SimpleName VariableDeclarationFragment ClassInstanceCreation InfixExpression SimpleName table id
qlock SimpleName VariableDeclarationFragment ClassInstanceCreation BooleanLiteral false
zoo queue lock SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName qlock
distributed read write lock SimpleName MethodInvocation SimpleName recover lock
distributed read write lock SimpleName MethodInvocation SimpleName qlock
distributed read write lock SimpleName MethodInvocation SimpleName lock data
recover lock SimpleName MethodInvocation SimpleName qlock
recover lock SimpleName MethodInvocation SimpleName lock data
qlock SimpleName MethodInvocation SimpleName lock data
lock SimpleName VariableDeclarationFragment MethodInvocation SimpleName distributed read write lock
lock SimpleName VariableDeclarationFragment MethodInvocation SimpleName recover lock
lock SimpleName VariableDeclarationFragment MethodInvocation SimpleName qlock
lock SimpleName VariableDeclarationFragment MethodInvocation SimpleName lock data
lock SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName lock
distributed read write lock SimpleName SimpleType ClassInstanceCreation SimpleName qlock
distributed read write lock SimpleName SimpleType ClassInstanceCreation SimpleName lock data
qlock SimpleName ClassInstanceCreation SimpleName lock data
locker SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName distributed read write lock
locker SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName qlock
locker SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName lock data
distributed read write lock SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName locker
locker SimpleName MethodInvocation SimpleName write lock
lock SimpleName Assignment MethodInvocation SimpleName locker
lock SimpleName Assignment MethodInvocation SimpleName write lock
locker SimpleName MethodInvocation SimpleName read lock
lock SimpleName Assignment MethodInvocation SimpleName locker
lock SimpleName Assignment MethodInvocation SimpleName read lock
write lock SimpleName IfStatement ExpressionStatement Assignment SimpleName lock
write lock SimpleName IfStatement ExpressionStatement Assignment SimpleName lock
private Modifier MethodDeclaration Modifier static
private Modifier MethodDeclaration SimpleType SimpleName lock
private Modifier MethodDeclaration SimpleName get lock
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName table id
private Modifier MethodDeclaration SingleVariableDeclaration PrimitiveType long
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName tid
static Modifier MethodDeclaration SimpleType SimpleName lock
static Modifier MethodDeclaration SimpleName get lock
static Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName table id
static Modifier MethodDeclaration SingleVariableDeclaration PrimitiveType long
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName tid
static Modifier MethodDeclaration SingleVariableDeclaration PrimitiveType boolean
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName write lock
lock SimpleName SimpleType MethodDeclaration SimpleName get lock
lock SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName table id
lock SimpleName SimpleType MethodDeclaration SingleVariableDeclaration PrimitiveType long
lock SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName tid
lock SimpleName SimpleType MethodDeclaration SingleVariableDeclaration PrimitiveType boolean
lock SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName write lock
lock SimpleName SimpleType MethodDeclaration SimpleType SimpleName exception
get lock SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
get lock SimpleName MethodDeclaration SingleVariableDeclaration SimpleName table id
get lock SimpleName MethodDeclaration SingleVariableDeclaration PrimitiveType long
get lock SimpleName MethodDeclaration SingleVariableDeclaration SimpleName tid
get lock SimpleName MethodDeclaration SingleVariableDeclaration PrimitiveType boolean
get lock SimpleName MethodDeclaration SingleVariableDeclaration SimpleName write lock
get lock SimpleName MethodDeclaration SimpleType SimpleName exception
get lock SimpleName MethodDeclaration Block ReturnStatement SimpleName lock
table id SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType long
table id SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName tid
table id SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType boolean
table id SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName write lock
table id SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
long PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType boolean
long PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName write lock
tid SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType boolean
tid SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName write lock
long PrimitiveType SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
tid SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
boolean PrimitiveType SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
write lock SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration Modifier static
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName lock
public Modifier TypeDeclaration MethodDeclaration SimpleName get lock
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName table id
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType long
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName tid
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType boolean
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName write lock
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration Modifier static
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName lock
test SimpleName TypeDeclaration MethodDeclaration SimpleName get lock
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName table id
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType long
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName tid
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType boolean
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName write lock
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
