map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
map SimpleName SimpleType ParameterizedType SimpleType SimpleName integer
string SimpleName SimpleType ParameterizedType SimpleType SimpleName integer
logger user SimpleName SimpleType ArrayType SingleVariableDeclaration SimpleName tservers
list SimpleName SimpleType ParameterizedType SimpleType SimpleName string
map SimpleName SimpleType ParameterizedType SimpleType SimpleName logger user
map SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName uses
logger user SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName uses
int PrimitiveType SingleVariableDeclaration SimpleName number of loggers
logger user SimpleName SimpleType SingleVariableDeclaration SimpleName lu
mock server SimpleName SimpleType CastExpression SimpleName lu
user SimpleName VariableDeclarationFragment CastExpression SimpleType SimpleName mock server
user SimpleName VariableDeclarationFragment CastExpression SimpleName lu
mock server SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName user
list SimpleName SimpleType ParameterizedType SimpleType SimpleName string
uses SimpleName MethodInvocation SimpleName get
uses SimpleName MethodInvocation SimpleName user
get SimpleName MethodInvocation SimpleName user
adjustments SimpleName VariableDeclarationFragment MethodInvocation SimpleName uses
adjustments SimpleName VariableDeclarationFragment MethodInvocation SimpleName get
adjustments SimpleName VariableDeclarationFragment MethodInvocation SimpleName user
set SimpleName SimpleType ParameterizedType SimpleType SimpleName string
hash set SimpleName SimpleType ParameterizedType SimpleType SimpleName string
hash set SimpleName SimpleType ParameterizedType ClassInstanceCreation SimpleName adjustments
string SimpleName SimpleType ParameterizedType ClassInstanceCreation SimpleName adjustments
new loggers SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName adjustments
string SimpleName SimpleType SingleVariableDeclaration SimpleName logger
new loggers SimpleName MethodInvocation SimpleName size
new loggers SimpleName MethodInvocation InfixExpression SimpleName number of loggers
size SimpleName MethodInvocation InfixExpression SimpleName number of loggers
new loggers SimpleName MethodInvocation SimpleName add
new loggers SimpleName MethodInvocation SimpleName logger
add SimpleName MethodInvocation SimpleName logger
string SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement QualifiedName userloggers
logger SimpleName SingleVariableDeclaration EnhancedForStatement QualifiedName userloggers
userloggers QualifiedName Assignment SimpleName new loggers
logger user SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName tservers
lu SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName tservers
map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
map SimpleName SimpleType ParameterizedType SimpleType SimpleName integer
string SimpleName SimpleType ParameterizedType SimpleType SimpleName integer
hash map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
hash map SimpleName SimpleType ParameterizedType SimpleType SimpleName integer
string SimpleName SimpleType ParameterizedType SimpleType SimpleName integer
logger user SimpleName SimpleType SingleVariableDeclaration SimpleName server
string SimpleName SimpleType SingleVariableDeclaration SimpleName logger
server SimpleName MethodInvocation SimpleName get loggers
result SimpleName MethodInvocation SimpleName contains key
result SimpleName MethodInvocation SimpleName logger
contains key SimpleName MethodInvocation SimpleName logger
result SimpleName MethodInvocation SimpleName put
result SimpleName MethodInvocation SimpleName logger
result SimpleName MethodInvocation NumberLiteral empty
put SimpleName MethodInvocation SimpleName logger
put SimpleName MethodInvocation NumberLiteral empty
logger SimpleName MethodInvocation NumberLiteral empty
result SimpleName MethodInvocation SimpleName get
result SimpleName MethodInvocation SimpleName logger
get SimpleName MethodInvocation SimpleName logger
result SimpleName MethodInvocation InfixExpression NumberLiteral empty
get SimpleName MethodInvocation InfixExpression NumberLiteral empty
logger SimpleName MethodInvocation InfixExpression NumberLiteral empty
result SimpleName MethodInvocation SimpleName put
result SimpleName MethodInvocation SimpleName logger
result SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName result
result SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get
result SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName logger
result SimpleName MethodInvocation InfixExpression NumberLiteral empty
put SimpleName MethodInvocation SimpleName logger
put SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName result
put SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get
put SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName logger
put SimpleName MethodInvocation InfixExpression NumberLiteral empty
logger SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName result
logger SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get
logger SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName logger
logger SimpleName MethodInvocation InfixExpression NumberLiteral empty
logger SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName server
logger SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName get loggers
logger user SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName tservers
server SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName tservers
tservers SimpleName EnhancedForStatement Block EnhancedForStatement SimpleName tservers
tservers SimpleName EnhancedForStatement Block ReturnStatement SimpleName result
tservers SimpleName EnhancedForStatement Block ReturnStatement SimpleName result
map SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName compute uses
string SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName compute uses
integer SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName compute uses
compute uses SimpleName MethodDeclaration SingleVariableDeclaration SimpleName tservers
compute uses SimpleName MethodDeclaration SingleVariableDeclaration SimpleName uses
compute uses SimpleName MethodDeclaration SingleVariableDeclaration PrimitiveType int
compute uses SimpleName MethodDeclaration SingleVariableDeclaration SimpleName number of loggers
compute uses SimpleName MethodDeclaration Block EnhancedForStatement SimpleName tservers
compute uses SimpleName MethodDeclaration Block EnhancedForStatement SimpleName tservers
compute uses SimpleName MethodDeclaration Block ReturnStatement SimpleName result
tservers SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName uses
tservers SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
tservers SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName number of loggers
uses SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
uses SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName number of loggers
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration SimpleName compute uses
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName tservers
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName uses
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName number of loggers
test SimpleName TypeDeclaration MethodDeclaration SimpleName compute uses
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName tservers
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName uses
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName number of loggers