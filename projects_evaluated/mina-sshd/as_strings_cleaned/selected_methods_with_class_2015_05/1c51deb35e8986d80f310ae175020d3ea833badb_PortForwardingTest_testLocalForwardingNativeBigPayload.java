session SimpleName VariableDeclarationFragment MethodInvocation SimpleName create native session
client session SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName session
sshd socket address SimpleName SimpleType ClassInstanceCreation StringLiteral empty
sshd socket address SimpleName SimpleType ClassInstanceCreation NumberLiteral empty
empty StringLiteral ClassInstanceCreation NumberLiteral empty
local SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName sshd socket address
local SimpleName VariableDeclarationFragment ClassInstanceCreation StringLiteral empty
local SimpleName VariableDeclarationFragment ClassInstanceCreation NumberLiteral empty
sshd socket address SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName local
sshd socket address SimpleName SimpleType ClassInstanceCreation StringLiteral localhost
sshd socket address SimpleName SimpleType ClassInstanceCreation SimpleName echo port
localhost StringLiteral ClassInstanceCreation SimpleName echo port
remote SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName sshd socket address
remote SimpleName VariableDeclarationFragment ClassInstanceCreation StringLiteral localhost
remote SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName echo port
sshd socket address SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName remote
session SimpleName MethodInvocation SimpleName start local port forwarding
session SimpleName MethodInvocation SimpleName local
session SimpleName MethodInvocation SimpleName remote
start local port forwarding SimpleName MethodInvocation SimpleName local
start local port forwarding SimpleName MethodInvocation SimpleName remote
local SimpleName MethodInvocation SimpleName remote
bound SimpleName VariableDeclarationFragment MethodInvocation SimpleName session
bound SimpleName VariableDeclarationFragment MethodInvocation SimpleName start local port forwarding
bound SimpleName VariableDeclarationFragment MethodInvocation SimpleName local
bound SimpleName VariableDeclarationFragment MethodInvocation SimpleName remote
sshd socket address SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName bound
expected SimpleName VariableDeclarationFragment MethodInvocation SimpleName get current test name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName expected
expected SimpleName MethodInvocation SimpleName get bytes
bytes SimpleName VariableDeclarationFragment MethodInvocation SimpleName expected
bytes SimpleName VariableDeclarationFragment MethodInvocation SimpleName get bytes
byte PrimitiveType ArrayType VariableDeclarationStatement VariableDeclarationFragment SimpleName bytes
byteslength QualifiedName InfixExpression QualifiedName longsize
byte PrimitiveType ArrayType ArrayCreation InfixExpression QualifiedName byteslength
byte PrimitiveType ArrayType ArrayCreation InfixExpression QualifiedName longsize
buf SimpleName VariableDeclarationFragment ArrayCreation ArrayType PrimitiveType byte
buf SimpleName VariableDeclarationFragment ArrayCreation InfixExpression QualifiedName byteslength
buf SimpleName VariableDeclarationFragment ArrayCreation InfixExpression QualifiedName longsize
byte PrimitiveType ArrayType VariableDeclarationStatement VariableDeclarationFragment SimpleName buf
bound SimpleName MethodInvocation SimpleName get host name
bound SimpleName MethodInvocation SimpleName get port
socket SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName bound
socket SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get host name
socket SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName bound
socket SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get port
bound SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName bound
bound SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get port
get host name SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName bound
get host name SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get port
s SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName socket
s SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName bound
s SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName get host name
s SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName bound
s SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName get port
socket SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName s
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
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression NumberLiteral empty
s SimpleName MethodInvocation SimpleName get output stream
s SimpleName MethodInvocation MethodInvocation SimpleName write
get output stream SimpleName MethodInvocation MethodInvocation SimpleName write
s SimpleName MethodInvocation MethodInvocation SimpleName bytes
get output stream SimpleName MethodInvocation MethodInvocation SimpleName bytes
write SimpleName MethodInvocation SimpleName bytes
s SimpleName MethodInvocation SimpleName get output stream
s SimpleName MethodInvocation MethodInvocation SimpleName flush
get output stream SimpleName MethodInvocation MethodInvocation SimpleName flush
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
mismatched data at iteration # StringLiteral InfixExpression SimpleName i
assert equals SimpleName MethodInvocation InfixExpression StringLiteral mismatched data at iteration #
assert equals SimpleName MethodInvocation InfixExpression SimpleName i
assert equals SimpleName MethodInvocation SimpleName expected
assert equals SimpleName MethodInvocation SimpleName res
mismatched data at iteration # StringLiteral InfixExpression MethodInvocation SimpleName expected
i SimpleName InfixExpression MethodInvocation SimpleName expected
mismatched data at iteration # StringLiteral InfixExpression MethodInvocation SimpleName res
i SimpleName InfixExpression MethodInvocation SimpleName res
expected SimpleName MethodInvocation SimpleName res
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression NumberLiteral empty
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
empty NumberLiteral InfixExpression ForStatement PostfixExpression SimpleName i
session SimpleName MethodInvocation SimpleName stop local port forwarding
session SimpleName MethodInvocation SimpleName bound
stop local port forwarding SimpleName MethodInvocation SimpleName bound
session SimpleName MethodInvocation SimpleName close
session SimpleName MethodInvocation BooleanLiteral false
close SimpleName MethodInvocation BooleanLiteral false
session SimpleName MethodInvocation MethodInvocation SimpleName await
close SimpleName MethodInvocation MethodInvocation SimpleName await
false BooleanLiteral MethodInvocation MethodInvocation SimpleName await
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test local forwarding native big payload
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test local forwarding native big payload
public Modifier MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration SimpleName test local forwarding native big payload
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
test local forwarding native big payload SimpleName MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test local forwarding native big payload
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test local forwarding native big payload
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
