session SimpleName VariableDeclarationFragment MethodInvocation SimpleName create session
session SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName session
forwarded port SimpleName VariableDeclarationFragment MethodInvocation SimpleName get free port
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName forwarded port
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get free port
session SimpleName MethodInvocation SimpleName set port forwarding l
session SimpleName MethodInvocation SimpleName forwarded port
session SimpleName MethodInvocation StringLiteral localhost
session SimpleName MethodInvocation SimpleName echo port
set port forwarding l SimpleName MethodInvocation SimpleName forwarded port
set port forwarding l SimpleName MethodInvocation StringLiteral localhost
set port forwarding l SimpleName MethodInvocation SimpleName echo port
forwarded port SimpleName MethodInvocation StringLiteral localhost
forwarded port SimpleName MethodInvocation SimpleName echo port
localhost StringLiteral MethodInvocation SimpleName echo port
socket SimpleName SimpleType ClassInstanceCreation StringLiteral localhost
socket SimpleName SimpleType ClassInstanceCreation SimpleName forwarded port
localhost StringLiteral ClassInstanceCreation SimpleName forwarded port
s SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName socket
s SimpleName VariableDeclarationFragment ClassInstanceCreation StringLiteral localhost
s SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName forwarded port
socket SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName s
s SimpleName MethodInvocation SimpleName get output stream
hello StringLiteral MethodInvocation SimpleName get bytes
s SimpleName MethodInvocation MethodInvocation SimpleName write
get output stream SimpleName MethodInvocation MethodInvocation SimpleName write
s SimpleName MethodInvocation MethodInvocation MethodInvocation StringLiteral hello
s SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get bytes
get output stream SimpleName MethodInvocation MethodInvocation MethodInvocation StringLiteral hello
get output stream SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get bytes
write SimpleName MethodInvocation MethodInvocation StringLiteral hello
write SimpleName MethodInvocation MethodInvocation SimpleName get bytes
s SimpleName MethodInvocation SimpleName get output stream
s SimpleName MethodInvocation MethodInvocation SimpleName flush
get output stream SimpleName MethodInvocation MethodInvocation SimpleName flush
byte PrimitiveType ArrayType ArrayCreation NumberLiteral empty
buf SimpleName VariableDeclarationFragment ArrayCreation ArrayType PrimitiveType byte
buf SimpleName VariableDeclarationFragment ArrayCreation NumberLiteral empty
byte PrimitiveType ArrayType VariableDeclarationStatement VariableDeclarationFragment SimpleName buf
s SimpleName MethodInvocation SimpleName get input stream
s SimpleName MethodInvocation MethodInvocation SimpleName read
get input stream SimpleName MethodInvocation MethodInvocation SimpleName read
s SimpleName MethodInvocation MethodInvocation SimpleName buf
get input stream SimpleName MethodInvocation MethodInvocation SimpleName buf
read SimpleName MethodInvocation SimpleName buf
n SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName s
n SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get input stream
n SimpleName VariableDeclarationFragment MethodInvocation SimpleName read
n SimpleName VariableDeclarationFragment MethodInvocation SimpleName buf
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName n
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName read
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName buf
string SimpleName SimpleType ClassInstanceCreation SimpleName buf
string SimpleName SimpleType ClassInstanceCreation NumberLiteral empty
string SimpleName SimpleType ClassInstanceCreation SimpleName n
buf SimpleName ClassInstanceCreation NumberLiteral empty
buf SimpleName ClassInstanceCreation SimpleName n
empty NumberLiteral ClassInstanceCreation SimpleName n
res SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName string
res SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName buf
res SimpleName VariableDeclarationFragment ClassInstanceCreation NumberLiteral empty
res SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName n
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName res
assert equals SimpleName MethodInvocation StringLiteral hello
assert equals SimpleName MethodInvocation SimpleName res
hello StringLiteral MethodInvocation SimpleName res
session SimpleName MethodInvocation SimpleName del port forwarding l
session SimpleName MethodInvocation SimpleName forwarded port
del port forwarding l SimpleName MethodInvocation SimpleName forwarded port
session SimpleName MethodInvocation SimpleName disconnect
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test local forwarding
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test local forwarding
public Modifier MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
void PrimitiveType MethodDeclaration SimpleName test local forwarding
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
test local forwarding SimpleName MethodDeclaration SimpleType SimpleName exception
test local forwarding SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test local forwarding
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test local forwarding
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
