set SimpleName SimpleType ParameterizedType SimpleType SimpleName path
set SimpleName SimpleType ParameterizedType SimpleType SimpleName path
hash set SimpleName SimpleType ParameterizedType SimpleType SimpleName path
string SimpleName SimpleType SingleVariableDeclaration SimpleName dir
server constants SimpleName MethodInvocation SimpleName get recovery dirs
path SimpleName SimpleType ClassInstanceCreation SimpleName dir
recovery dir SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName path
recovery dir SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName dir
path SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName recovery dir
fs SimpleName MethodInvocation SimpleName exists
fs SimpleName MethodInvocation SimpleName recovery dir
exists SimpleName MethodInvocation SimpleName recovery dir
file status SimpleName SimpleType SingleVariableDeclaration SimpleName status
fs SimpleName MethodInvocation SimpleName list status
fs SimpleName MethodInvocation SimpleName recovery dir
list status SimpleName MethodInvocation SimpleName recovery dir
status SimpleName MethodInvocation SimpleName get path
status SimpleName MethodInvocation MethodInvocation SimpleName get name
get path SimpleName MethodInvocation MethodInvocation SimpleName get name
is uuid SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName status
is uuid SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get path
is uuid SimpleName MethodInvocation MethodInvocation SimpleName get name
status SimpleName MethodInvocation SimpleName get path
result SimpleName MethodInvocation SimpleName add
result SimpleName MethodInvocation MethodInvocation SimpleName status
result SimpleName MethodInvocation MethodInvocation SimpleName get path
add SimpleName MethodInvocation MethodInvocation SimpleName status
add SimpleName MethodInvocation MethodInvocation SimpleName get path
status SimpleName MethodInvocation SimpleName get path
ignoring file StringLiteral InfixExpression MethodInvocation SimpleName status
ignoring file StringLiteral InfixExpression MethodInvocation SimpleName get path
ignoring file StringLiteral InfixExpression StringLiteral because it doesnt look like a uuid
status SimpleName MethodInvocation InfixExpression StringLiteral because it doesnt look like a uuid
get path SimpleName MethodInvocation InfixExpression StringLiteral because it doesnt look like a uuid
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation InfixExpression StringLiteral ignoring file
log SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName status
log SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get path
log SimpleName MethodInvocation InfixExpression StringLiteral because it doesnt look like a uuid
debug SimpleName MethodInvocation InfixExpression StringLiteral ignoring file
debug SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName status
debug SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get path
debug SimpleName MethodInvocation InfixExpression StringLiteral because it doesnt look like a uuid
status SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName fs
status SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName list status
status SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName recovery dir
dir SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName server constants
dir SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName get recovery dirs
private Modifier MethodDeclaration ParameterizedType SimpleType SimpleName set
private Modifier MethodDeclaration ParameterizedType SimpleType SimpleName path
private Modifier MethodDeclaration SimpleName get sorted wa logs
private Modifier MethodDeclaration SimpleType SimpleName io exception
private Modifier MethodDeclaration Block ReturnStatement SimpleName result
set SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName get sorted wa logs
path SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName get sorted wa logs
get sorted wa logs SimpleName MethodDeclaration SimpleType SimpleName io exception
get sorted wa logs SimpleName MethodDeclaration Block ReturnStatement SimpleName result
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration SimpleName get sorted wa logs
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration SimpleName get sorted wa logs
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName io exception