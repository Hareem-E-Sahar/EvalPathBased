http servlet request SimpleName SimpleType SingleVariableDeclaration SimpleName req
http servlet response SimpleName SimpleType SingleVariableDeclaration SimpleName resp
req SimpleName MethodInvocation SimpleName get request uri
path SimpleName VariableDeclarationFragment MethodInvocation SimpleName req
path SimpleName VariableDeclarationFragment MethodInvocation SimpleName get request uri
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName path
path SimpleName MethodInvocation SimpleName ends with
path SimpleName MethodInvocation StringLiteral jpg
ends with SimpleName MethodInvocation StringLiteral jpg
resp SimpleName MethodInvocation SimpleName set content type
resp SimpleName MethodInvocation StringLiteral imagejpeg
set content type SimpleName MethodInvocation StringLiteral imagejpeg
path SimpleName MethodInvocation SimpleName ends with
path SimpleName MethodInvocation StringLiteral html
ends with SimpleName MethodInvocation StringLiteral html
resp SimpleName MethodInvocation SimpleName set content type
resp SimpleName MethodInvocation StringLiteral texthtml
set content type SimpleName MethodInvocation StringLiteral texthtml
path SimpleName MethodInvocation SimpleName substring
path SimpleName MethodInvocation NumberLiteral empty
substring SimpleName MethodInvocation NumberLiteral empty
path SimpleName Assignment MethodInvocation SimpleName path
path SimpleName Assignment MethodInvocation SimpleName substring
path SimpleName Assignment MethodInvocation NumberLiteral empty
basic servlet SimpleName SimpleType TypeLiteral MethodInvocation SimpleName get class loader
get class loader SimpleName MethodInvocation MethodInvocation SimpleName get resource as stream
get class loader SimpleName MethodInvocation MethodInvocation SimpleName path
get resource as stream SimpleName MethodInvocation SimpleName path
data SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get class loader
data SimpleName VariableDeclarationFragment MethodInvocation SimpleName get resource as stream
data SimpleName VariableDeclarationFragment MethodInvocation SimpleName path
input stream SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName data
resp SimpleName MethodInvocation SimpleName get output stream
out SimpleName VariableDeclarationFragment MethodInvocation SimpleName resp
out SimpleName VariableDeclarationFragment MethodInvocation SimpleName get output stream
servlet output stream SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName out
byte PrimitiveType ArrayType ArrayCreation NumberLiteral empty
buffer SimpleName VariableDeclarationFragment ArrayCreation ArrayType PrimitiveType byte
buffer SimpleName VariableDeclarationFragment ArrayCreation NumberLiteral empty
byte PrimitiveType ArrayType VariableDeclarationStatement VariableDeclarationFragment SimpleName buffer
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName n
data SimpleName MethodInvocation SimpleName read
data SimpleName MethodInvocation SimpleName buffer
read SimpleName MethodInvocation SimpleName buffer
n SimpleName Assignment MethodInvocation SimpleName data
n SimpleName Assignment MethodInvocation SimpleName read
n SimpleName Assignment MethodInvocation SimpleName buffer
n SimpleName Assignment ParenthesizedExpression InfixExpression NumberLiteral empty
out SimpleName MethodInvocation SimpleName write
out SimpleName MethodInvocation SimpleName buffer
out SimpleName MethodInvocation NumberLiteral empty
out SimpleName MethodInvocation SimpleName n
write SimpleName MethodInvocation SimpleName buffer
write SimpleName MethodInvocation NumberLiteral empty
write SimpleName MethodInvocation SimpleName n
buffer SimpleName MethodInvocation NumberLiteral empty
buffer SimpleName MethodInvocation SimpleName n
empty NumberLiteral MethodInvocation SimpleName n
could not get resource StringLiteral InfixExpression SimpleName path
could not get resource StringLiteral InfixExpression StringLiteral empty
path SimpleName InfixExpression StringLiteral empty
could not get resource StringLiteral InfixExpression ParenthesizedExpression MethodInvocation SimpleName get bytes
path SimpleName InfixExpression ParenthesizedExpression MethodInvocation SimpleName get bytes
empty StringLiteral InfixExpression ParenthesizedExpression MethodInvocation SimpleName get bytes
out SimpleName MethodInvocation SimpleName write
out SimpleName MethodInvocation MethodInvocation SimpleName get bytes
write SimpleName MethodInvocation MethodInvocation SimpleName get bytes
data SimpleName MethodInvocation SimpleName close
throwable SimpleName SimpleType SingleVariableDeclaration SimpleName t
log SimpleName MethodInvocation SimpleName error
log SimpleName MethodInvocation SimpleName t
log SimpleName MethodInvocation SimpleName t
error SimpleName MethodInvocation SimpleName t
error SimpleName MethodInvocation SimpleName t
t SimpleName MethodInvocation SimpleName t
io exception SimpleName SimpleType ClassInstanceCreation SimpleName t
private Modifier MethodDeclaration PrimitiveType void
private Modifier MethodDeclaration SimpleName get resource
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName http servlet request
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName req
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName http servlet response
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName resp
private Modifier MethodDeclaration SimpleType SimpleName io exception
void PrimitiveType MethodDeclaration SimpleName get resource
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName http servlet request
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName req
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName http servlet response
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName resp
void PrimitiveType MethodDeclaration SimpleType SimpleName io exception
get resource SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName http servlet request
get resource SimpleName MethodDeclaration SingleVariableDeclaration SimpleName req
get resource SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName http servlet response
get resource SimpleName MethodDeclaration SingleVariableDeclaration SimpleName resp
get resource SimpleName MethodDeclaration SimpleType SimpleName io exception
req SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName resp
req SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
resp SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName get resource
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName req
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName resp
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName get resource
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName req
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName resp
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
