int PrimitiveType SingleVariableDeclaration SimpleName server port
output debug message SimpleName MethodInvocation StringLiteral read in one bufferportd
output debug message SimpleName MethodInvocation SimpleName server port
read in one bufferportd StringLiteral MethodInvocation SimpleName server port
s SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName socket
socket SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName s
s SimpleName MethodInvocation SimpleName set so timeout
s SimpleName MethodInvocation NumberLiteral empty
set so timeout SimpleName MethodInvocation NumberLiteral empty
s SimpleName MethodInvocation SimpleName set receive buffer size
s SimpleName MethodInvocation NumberLiteral empty
set receive buffer size SimpleName MethodInvocation NumberLiteral empty
inet socket address SimpleName SimpleType ClassInstanceCreation SimpleName test localhost
inet socket address SimpleName SimpleType ClassInstanceCreation SimpleName server port
test localhost SimpleName ClassInstanceCreation SimpleName server port
s SimpleName MethodInvocation SimpleName connect
s SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName inet socket address
s SimpleName MethodInvocation ClassInstanceCreation SimpleName test localhost
s SimpleName MethodInvocation ClassInstanceCreation SimpleName server port
connect SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName inet socket address
connect SimpleName MethodInvocation ClassInstanceCreation SimpleName test localhost
connect SimpleName MethodInvocation ClassInstanceCreation SimpleName server port
thread SimpleName MethodInvocation SimpleName sleep
thread SimpleName MethodInvocation NumberLiteral l
sleep SimpleName MethodInvocation NumberLiteral l
payload SimpleName MethodInvocation SimpleName length
byte PrimitiveType ArrayType ArrayCreation MethodInvocation SimpleName payload
byte PrimitiveType ArrayType ArrayCreation MethodInvocation SimpleName length
buf SimpleName VariableDeclarationFragment ArrayCreation ArrayType PrimitiveType byte
buf SimpleName VariableDeclarationFragment ArrayCreation MethodInvocation SimpleName payload
buf SimpleName VariableDeclarationFragment ArrayCreation MethodInvocation SimpleName length
byte PrimitiveType ArrayType VariableDeclarationStatement VariableDeclarationFragment SimpleName buf
s SimpleName MethodInvocation SimpleName get input stream
input stream SimpleName VariableDeclarationFragment MethodInvocation SimpleName s
input stream SimpleName VariableDeclarationFragment MethodInvocation SimpleName get input stream
input stream SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName input stream
input stream SimpleName MethodInvocation SimpleName read
input stream SimpleName MethodInvocation SimpleName buf
read SimpleName MethodInvocation SimpleName buf
read count SimpleName VariableDeclarationFragment MethodInvocation SimpleName input stream
read count SimpleName VariableDeclarationFragment MethodInvocation SimpleName read
read count SimpleName VariableDeclarationFragment MethodInvocation SimpleName buf
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName read count
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName input stream
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName read
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName buf
output debug message SimpleName MethodInvocation StringLiteral read in one bufferportd - got d bytes from the server
output debug message SimpleName MethodInvocation SimpleName server port
output debug message SimpleName MethodInvocation SimpleName read count
read in one bufferportd - got d bytes from the server StringLiteral MethodInvocation SimpleName server port
read in one bufferportd - got d bytes from the server StringLiteral MethodInvocation SimpleName read count
server port SimpleName MethodInvocation SimpleName read count
string SimpleName SimpleType ClassInstanceCreation SimpleName buf
string SimpleName SimpleType ClassInstanceCreation NumberLiteral empty
string SimpleName SimpleType ClassInstanceCreation SimpleName read count
string SimpleName SimpleType ClassInstanceCreation QualifiedName standard charsetsutf
buf SimpleName ClassInstanceCreation NumberLiteral empty
buf SimpleName ClassInstanceCreation SimpleName read count
buf SimpleName ClassInstanceCreation QualifiedName standard charsetsutf
empty NumberLiteral ClassInstanceCreation SimpleName read count
empty NumberLiteral ClassInstanceCreation QualifiedName standard charsetsutf
read count SimpleName ClassInstanceCreation QualifiedName standard charsetsutf
actual SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName string
actual SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName buf
actual SimpleName VariableDeclarationFragment ClassInstanceCreation NumberLiteral empty
actual SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName read count
actual SimpleName VariableDeclarationFragment ClassInstanceCreation QualifiedName standard charsetsutf
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName actual
assert equals SimpleName MethodInvocation StringLiteral mismatched read data
assert equals SimpleName MethodInvocation SimpleName payload
assert equals SimpleName MethodInvocation SimpleName actual
mismatched read data StringLiteral MethodInvocation SimpleName payload
mismatched read data StringLiteral MethodInvocation SimpleName actual
payload SimpleName MethodInvocation SimpleName actual
private Modifier MethodDeclaration PrimitiveType void
private Modifier MethodDeclaration SimpleName read in one buffer
private Modifier MethodDeclaration SingleVariableDeclaration PrimitiveType int
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName server port
private Modifier MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration SimpleName read in one buffer
void PrimitiveType MethodDeclaration SingleVariableDeclaration PrimitiveType int
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName server port
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
read in one buffer SimpleName MethodDeclaration SingleVariableDeclaration PrimitiveType int
read in one buffer SimpleName MethodDeclaration SingleVariableDeclaration SimpleName server port
read in one buffer SimpleName MethodDeclaration SimpleType SimpleName exception
int PrimitiveType SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
server port SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName read in one buffer
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName server port
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName read in one buffer
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName server port
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception