list SimpleName SimpleType ParameterizedType SimpleType SimpleName cookie
http servlet request SimpleName SimpleType SingleVariableDeclaration SimpleName req
logger SimpleName SimpleType SingleVariableDeclaration SimpleName log
req SimpleName MethodInvocation SimpleName get parameter
req SimpleName MethodInvocation StringLiteral server
get parameter SimpleName MethodInvocation StringLiteral server
server SimpleName VariableDeclarationFragment MethodInvocation SimpleName req
server SimpleName VariableDeclarationFragment MethodInvocation SimpleName get parameter
server SimpleName VariableDeclarationFragment MethodInvocation StringLiteral server
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName server
monitor SimpleName MethodInvocation SimpleName get context
monitor SimpleName MethodInvocation MethodInvocation SimpleName get instance
get context SimpleName MethodInvocation MethodInvocation SimpleName get instance
zoo util SimpleName MethodInvocation SimpleName get root
zoo util SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName monitor
zoo util SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get context
zoo util SimpleName MethodInvocation MethodInvocation SimpleName get instance
get root SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName monitor
get root SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get context
get root SimpleName MethodInvocation MethodInvocation SimpleName get instance
zoo util SimpleName MethodInvocation InfixExpression QualifiedName constantszdeadtservers
get root SimpleName MethodInvocation InfixExpression QualifiedName constantszdeadtservers
get instance SimpleName MethodInvocation MethodInvocation InfixExpression QualifiedName constantszdeadtservers
dead server list SimpleName SimpleType ClassInstanceCreation InfixExpression QualifiedName constantszdeadtservers
obit SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName dead server list
obit SimpleName VariableDeclarationFragment ClassInstanceCreation InfixExpression QualifiedName constantszdeadtservers
dead server list SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName obit
obit SimpleName MethodInvocation SimpleName delete
obit SimpleName MethodInvocation SimpleName server
delete SimpleName MethodInvocation SimpleName server
collections SimpleName MethodInvocation SimpleName empty list
override SimpleName MarkerAnnotation MethodDeclaration Modifier public
override SimpleName MarkerAnnotation MethodDeclaration SimpleName execute
override SimpleName MarkerAnnotation MethodDeclaration SingleVariableDeclaration SimpleName req
override SimpleName MarkerAnnotation MethodDeclaration SingleVariableDeclaration SimpleName log
public Modifier MethodDeclaration ParameterizedType SimpleType SimpleName list
public Modifier MethodDeclaration ParameterizedType SimpleType SimpleName cookie
public Modifier MethodDeclaration SimpleName execute
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName http servlet request
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName req
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName logger
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName log
list SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName execute
cookie SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName execute
execute SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName http servlet request
execute SimpleName MethodDeclaration SingleVariableDeclaration SimpleName req
execute SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName logger
execute SimpleName MethodDeclaration SingleVariableDeclaration SimpleName log
req SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName log
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName override
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration SimpleName execute
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName req
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName log
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName override
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration SimpleName execute
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName req
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName log
