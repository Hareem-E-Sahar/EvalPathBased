http servlet request SimpleName SimpleType SingleVariableDeclaration SimpleName req
http servlet response SimpleName SimpleType SingleVariableDeclaration SimpleName resp
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName redir
list SimpleName SimpleType ParameterizedType SimpleType SimpleName cookie
collections SimpleName MethodInvocation SimpleName empty list
cookies to set SimpleName VariableDeclarationFragment MethodInvocation SimpleName collections
cookies to set SimpleName VariableDeclarationFragment MethodInvocation SimpleName empty list
req SimpleName MethodInvocation SimpleName get parameter
req SimpleName MethodInvocation StringLiteral action
get parameter SimpleName MethodInvocation StringLiteral action
operation SimpleName VariableDeclarationFragment MethodInvocation SimpleName req
operation SimpleName VariableDeclarationFragment MethodInvocation SimpleName get parameter
operation SimpleName VariableDeclarationFragment MethodInvocation StringLiteral action
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName operation
req SimpleName MethodInvocation SimpleName get parameter
req SimpleName MethodInvocation StringLiteral redir
get parameter SimpleName MethodInvocation StringLiteral redir
redir SimpleName Assignment MethodInvocation SimpleName req
redir SimpleName Assignment MethodInvocation SimpleName get parameter
redir SimpleName Assignment MethodInvocation StringLiteral redir
class SimpleName SimpleType ParameterizedType WildcardType ?
class SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName subclass
? WildcardType ParameterizedType SingleVariableDeclaration SimpleName subclass
operation servlet SimpleName SimpleType TypeLiteral MethodInvocation SimpleName get classes
object SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName t
subclass SimpleName MethodInvocation SimpleName new instance
t SimpleName Assignment MethodInvocation SimpleName subclass
t SimpleName Assignment MethodInvocation SimpleName new instance
exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
t SimpleName InstanceofExpression SimpleType SimpleName web operation
web operation SimpleName SimpleType CastExpression SimpleName t
op SimpleName VariableDeclarationFragment CastExpression SimpleType SimpleName web operation
op SimpleName VariableDeclarationFragment CastExpression SimpleName t
web operation SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName op
op SimpleName MethodInvocation SimpleName get class
op SimpleName MethodInvocation MethodInvocation SimpleName get simple name
get class SimpleName MethodInvocation MethodInvocation SimpleName get simple name
operation SimpleName InfixExpression StringLiteral operation
op SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName equals ignore case
get class SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName equals ignore case
get simple name SimpleName MethodInvocation MethodInvocation SimpleName equals ignore case
get simple name SimpleName MethodInvocation MethodInvocation InfixExpression SimpleName operation
get simple name SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral operation
equals ignore case SimpleName MethodInvocation InfixExpression SimpleName operation
equals ignore case SimpleName MethodInvocation InfixExpression StringLiteral operation
op SimpleName MethodInvocation SimpleName execute
op SimpleName MethodInvocation SimpleName req
op SimpleName MethodInvocation SimpleName log
execute SimpleName MethodInvocation SimpleName req
execute SimpleName MethodInvocation SimpleName log
req SimpleName MethodInvocation SimpleName log
cookies to set SimpleName Assignment MethodInvocation SimpleName op
cookies to set SimpleName Assignment MethodInvocation SimpleName execute
cookies to set SimpleName Assignment MethodInvocation SimpleName req
cookies to set SimpleName Assignment MethodInvocation SimpleName log
subclass SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName get classes
throwable SimpleName SimpleType SingleVariableDeclaration SimpleName t
log SimpleName MethodInvocation SimpleName error
log SimpleName MethodInvocation SimpleName t
log SimpleName MethodInvocation SimpleName t
error SimpleName MethodInvocation SimpleName t
error SimpleName MethodInvocation SimpleName t
t SimpleName MethodInvocation SimpleName t
cookie SimpleName SimpleType SingleVariableDeclaration SimpleName c
resp SimpleName MethodInvocation SimpleName add cookie
resp SimpleName MethodInvocation SimpleName c
add cookie SimpleName MethodInvocation SimpleName c
cookie SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName cookies to set
c SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName cookies to set
sanitize redirect SimpleName MethodInvocation SimpleName redir
resp SimpleName MethodInvocation SimpleName send redirect
resp SimpleName MethodInvocation MethodInvocation SimpleName sanitize redirect
resp SimpleName MethodInvocation MethodInvocation SimpleName redir
send redirect SimpleName MethodInvocation MethodInvocation SimpleName sanitize redirect
send redirect SimpleName MethodInvocation MethodInvocation SimpleName redir
resp SimpleName MethodInvocation SimpleName flush buffer
throwable SimpleName SimpleType SingleVariableDeclaration SimpleName t
log SimpleName MethodInvocation SimpleName error
log SimpleName MethodInvocation SimpleName t
log SimpleName MethodInvocation SimpleName t
error SimpleName MethodInvocation SimpleName t
error SimpleName MethodInvocation SimpleName t
t SimpleName MethodInvocation SimpleName t
override SimpleName MarkerAnnotation MethodDeclaration Modifier public
override SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
override SimpleName MarkerAnnotation MethodDeclaration SimpleName do get
override SimpleName MarkerAnnotation MethodDeclaration SingleVariableDeclaration SimpleName req
override SimpleName MarkerAnnotation MethodDeclaration SingleVariableDeclaration SimpleName resp
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName do get
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName http servlet request
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName req
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName http servlet response
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName resp
public Modifier MethodDeclaration SimpleType SimpleName io exception
void PrimitiveType MethodDeclaration SimpleName do get
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName http servlet request
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName req
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName http servlet response
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName resp
void PrimitiveType MethodDeclaration SimpleType SimpleName io exception
do get SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName http servlet request
do get SimpleName MethodDeclaration SingleVariableDeclaration SimpleName req
do get SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName http servlet response
do get SimpleName MethodDeclaration SingleVariableDeclaration SimpleName resp
do get SimpleName MethodDeclaration SimpleType SimpleName io exception
req SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName resp
req SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
resp SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName override
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName do get
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName req
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName resp
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName override
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName do get
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName req
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName resp
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
