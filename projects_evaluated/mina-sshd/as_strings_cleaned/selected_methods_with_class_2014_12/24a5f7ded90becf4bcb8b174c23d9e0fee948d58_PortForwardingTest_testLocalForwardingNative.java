session SimpleName VariableDeclarationFragment MethodInvocation SimpleName create native session
client session SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName session
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
socket SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName s
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
s SimpleName MethodInvocation SimpleName close
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
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test local forwarding native
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test local forwarding native
public Modifier MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
void PrimitiveType MethodDeclaration SimpleName test local forwarding native
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
test local forwarding native SimpleName MethodDeclaration SimpleType SimpleName exception
test local forwarding native SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test local forwarding native
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test local forwarding native
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
