session SimpleName VariableDeclarationFragment MethodInvocation SimpleName create session
session SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName session
forwarded port SimpleName VariableDeclarationFragment MethodInvocation SimpleName get free port
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName forwarded port
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get free port
session SimpleName MethodInvocation SimpleName set port forwarding r
session SimpleName MethodInvocation SimpleName forwarded port
session SimpleName MethodInvocation StringLiteral localhost
session SimpleName MethodInvocation SimpleName echo port
set port forwarding r SimpleName MethodInvocation SimpleName forwarded port
set port forwarding r SimpleName MethodInvocation StringLiteral localhost
set port forwarding r SimpleName MethodInvocation SimpleName echo port
forwarded port SimpleName MethodInvocation StringLiteral localhost
forwarded port SimpleName MethodInvocation SimpleName echo port
localhost StringLiteral MethodInvocation SimpleName echo port
thread SimpleName MethodInvocation SimpleName sleep
thread SimpleName MethodInvocation NumberLiteral l
sleep SimpleName MethodInvocation NumberLiteral l
session SimpleName MethodInvocation SimpleName del port forwarding r
session SimpleName MethodInvocation StringLiteral localhost
session SimpleName MethodInvocation SimpleName forwarded port
del port forwarding r SimpleName MethodInvocation StringLiteral localhost
del port forwarding r SimpleName MethodInvocation SimpleName forwarded port
localhost StringLiteral MethodInvocation SimpleName forwarded port
thread SimpleName MethodInvocation SimpleName sleep
thread SimpleName MethodInvocation NumberLiteral l
sleep SimpleName MethodInvocation NumberLiteral l
session SimpleName MethodInvocation SimpleName set port forwarding r
session SimpleName MethodInvocation SimpleName forwarded port
session SimpleName MethodInvocation StringLiteral localhost
session SimpleName MethodInvocation SimpleName echo port
set port forwarding r SimpleName MethodInvocation SimpleName forwarded port
set port forwarding r SimpleName MethodInvocation StringLiteral localhost
set port forwarding r SimpleName MethodInvocation SimpleName echo port
forwarded port SimpleName MethodInvocation StringLiteral localhost
forwarded port SimpleName MethodInvocation SimpleName echo port
localhost StringLiteral MethodInvocation SimpleName echo port
thread SimpleName MethodInvocation SimpleName sleep
thread SimpleName MethodInvocation NumberLiteral l
sleep SimpleName MethodInvocation NumberLiteral l
socket SimpleName SimpleType ClassInstanceCreation StringLiteral localhost
socket SimpleName SimpleType ClassInstanceCreation SimpleName forwarded port
localhost StringLiteral ClassInstanceCreation SimpleName forwarded port
s SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName socket
s SimpleName VariableDeclarationFragment ClassInstanceCreation StringLiteral localhost
s SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName forwarded port
socket SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName s
s SimpleName MethodInvocation SimpleName get output stream
output SimpleName VariableDeclarationFragment MethodInvocation SimpleName s
output SimpleName VariableDeclarationFragment MethodInvocation SimpleName get output stream
output stream SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName output
s SimpleName MethodInvocation SimpleName get input stream
input SimpleName VariableDeclarationFragment MethodInvocation SimpleName s
input SimpleName VariableDeclarationFragment MethodInvocation SimpleName get input stream
input stream SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName input
time unitseconds QualifiedName MethodInvocation SimpleName to millis
time unitseconds QualifiedName MethodInvocation NumberLiteral l
to millis SimpleName MethodInvocation NumberLiteral l
int PrimitiveType CastExpression MethodInvocation QualifiedName time unitseconds
int PrimitiveType CastExpression MethodInvocation SimpleName to millis
int PrimitiveType CastExpression MethodInvocation NumberLiteral l
s SimpleName MethodInvocation SimpleName set so timeout
s SimpleName MethodInvocation CastExpression PrimitiveType int
s SimpleName MethodInvocation CastExpression MethodInvocation QualifiedName time unitseconds
s SimpleName MethodInvocation CastExpression MethodInvocation SimpleName to millis
s SimpleName MethodInvocation CastExpression MethodInvocation NumberLiteral l
set so timeout SimpleName MethodInvocation CastExpression PrimitiveType int
set so timeout SimpleName MethodInvocation CastExpression MethodInvocation QualifiedName time unitseconds
set so timeout SimpleName MethodInvocation CastExpression MethodInvocation SimpleName to millis
set so timeout SimpleName MethodInvocation CastExpression MethodInvocation NumberLiteral l
expected SimpleName VariableDeclarationFragment MethodInvocation SimpleName get current test name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName expected
expected SimpleName MethodInvocation SimpleName get bytes
expected SimpleName MethodInvocation QualifiedName standard charsetsutf
get bytes SimpleName MethodInvocation QualifiedName standard charsetsutf
bytes SimpleName VariableDeclarationFragment MethodInvocation SimpleName expected
bytes SimpleName VariableDeclarationFragment MethodInvocation SimpleName get bytes
bytes SimpleName VariableDeclarationFragment MethodInvocation QualifiedName standard charsetsutf
byte PrimitiveType ArrayType VariableDeclarationStatement VariableDeclarationFragment SimpleName bytes
output SimpleName MethodInvocation SimpleName write
output SimpleName MethodInvocation SimpleName bytes
write SimpleName MethodInvocation SimpleName bytes
output SimpleName MethodInvocation SimpleName flush
byteslength QualifiedName InfixExpression QualifiedName longsize
byte PrimitiveType ArrayType ArrayCreation InfixExpression QualifiedName byteslength
byte PrimitiveType ArrayType ArrayCreation InfixExpression QualifiedName longsize
buf SimpleName VariableDeclarationFragment ArrayCreation ArrayType PrimitiveType byte
buf SimpleName VariableDeclarationFragment ArrayCreation InfixExpression QualifiedName byteslength
buf SimpleName VariableDeclarationFragment ArrayCreation InfixExpression QualifiedName longsize
byte PrimitiveType ArrayType VariableDeclarationStatement VariableDeclarationFragment SimpleName buf
input SimpleName MethodInvocation SimpleName read
input SimpleName MethodInvocation SimpleName buf
read SimpleName MethodInvocation SimpleName buf
n SimpleName VariableDeclarationFragment MethodInvocation SimpleName input
n SimpleName VariableDeclarationFragment MethodInvocation SimpleName read
n SimpleName VariableDeclarationFragment MethodInvocation SimpleName buf
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName n
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName input
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName read
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName buf
string SimpleName SimpleType ClassInstanceCreation SimpleName buf
string SimpleName SimpleType ClassInstanceCreation NumberLiteral empty
string SimpleName SimpleType ClassInstanceCreation SimpleName n
string SimpleName SimpleType ClassInstanceCreation QualifiedName standard charsetsutf
buf SimpleName ClassInstanceCreation NumberLiteral empty
buf SimpleName ClassInstanceCreation SimpleName n
buf SimpleName ClassInstanceCreation QualifiedName standard charsetsutf
empty NumberLiteral ClassInstanceCreation SimpleName n
empty NumberLiteral ClassInstanceCreation QualifiedName standard charsetsutf
n SimpleName ClassInstanceCreation QualifiedName standard charsetsutf
res SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName string
res SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName buf
res SimpleName VariableDeclarationFragment ClassInstanceCreation NumberLiteral empty
res SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName n
res SimpleName VariableDeclarationFragment ClassInstanceCreation QualifiedName standard charsetsutf
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName res
assert equals SimpleName MethodInvocation StringLiteral mismatched data
assert equals SimpleName MethodInvocation SimpleName expected
assert equals SimpleName MethodInvocation SimpleName res
mismatched data StringLiteral MethodInvocation SimpleName expected
mismatched data StringLiteral MethodInvocation SimpleName res
expected SimpleName MethodInvocation SimpleName res
session SimpleName MethodInvocation SimpleName del port forwarding r
session SimpleName MethodInvocation StringLiteral localhost
session SimpleName MethodInvocation SimpleName forwarded port
del port forwarding r SimpleName MethodInvocation StringLiteral localhost
del port forwarding r SimpleName MethodInvocation SimpleName forwarded port
localhost StringLiteral MethodInvocation SimpleName forwarded port
session SimpleName MethodInvocation SimpleName disconnect
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test remote forwarding second time in same session
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test remote forwarding second time in same session
public Modifier MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration SimpleName test remote forwarding second time in same session
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
test remote forwarding second time in same session SimpleName MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test remote forwarding second time in same session
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test remote forwarding second time in same session
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
