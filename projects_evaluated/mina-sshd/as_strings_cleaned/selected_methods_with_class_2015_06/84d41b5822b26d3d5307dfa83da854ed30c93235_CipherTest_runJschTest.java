int PrimitiveType SingleVariableDeclaration SimpleName port
j sch logger SimpleName MethodInvocation SimpleName init
sch SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName j sch
j sch SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName sch
j sch SimpleName MethodInvocation SimpleName set config
j sch SimpleName MethodInvocation StringLiteral ciphers c
j sch SimpleName MethodInvocation SimpleName crypt names
set config SimpleName MethodInvocation StringLiteral ciphers c
set config SimpleName MethodInvocation SimpleName crypt names
ciphers c StringLiteral MethodInvocation SimpleName crypt names
j sch SimpleName MethodInvocation SimpleName set config
j sch SimpleName MethodInvocation StringLiteral cipherc s
j sch SimpleName MethodInvocation SimpleName crypt names
set config SimpleName MethodInvocation StringLiteral cipherc s
set config SimpleName MethodInvocation SimpleName crypt names
cipherc s StringLiteral MethodInvocation SimpleName crypt names
sch SimpleName MethodInvocation SimpleName get session
sch SimpleName MethodInvocation MethodInvocation SimpleName get current test name
sch SimpleName MethodInvocation StringLiteral localhost
sch SimpleName MethodInvocation SimpleName port
get session SimpleName MethodInvocation MethodInvocation SimpleName get current test name
get session SimpleName MethodInvocation StringLiteral localhost
get session SimpleName MethodInvocation SimpleName port
get current test name SimpleName MethodInvocation MethodInvocation StringLiteral localhost
get current test name SimpleName MethodInvocation MethodInvocation SimpleName port
localhost StringLiteral MethodInvocation SimpleName port
s SimpleName VariableDeclarationFragment MethodInvocation SimpleName sch
s SimpleName VariableDeclarationFragment MethodInvocation SimpleName get session
s SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get current test name
s SimpleName VariableDeclarationFragment MethodInvocation StringLiteral localhost
s SimpleName VariableDeclarationFragment MethodInvocation SimpleName port
comjcraftjschsession QualifiedName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName s
simple user info SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get current test name
s SimpleName MethodInvocation SimpleName set user info
s SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName simple user info
s SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get current test name
set user info SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName simple user info
set user info SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get current test name
s SimpleName MethodInvocation SimpleName connect
s SimpleName MethodInvocation SimpleName open channel
s SimpleName MethodInvocation StringLiteral shell
open channel SimpleName MethodInvocation StringLiteral shell
c SimpleName VariableDeclarationFragment MethodInvocation SimpleName s
c SimpleName VariableDeclarationFragment MethodInvocation SimpleName open channel
c SimpleName VariableDeclarationFragment MethodInvocation StringLiteral shell
comjcraftjschchannel QualifiedName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName c
c SimpleName MethodInvocation SimpleName connect
c SimpleName MethodInvocation SimpleName get output stream
os SimpleName VariableDeclarationFragment MethodInvocation SimpleName c
os SimpleName VariableDeclarationFragment MethodInvocation SimpleName get output stream
output stream SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName os
c SimpleName MethodInvocation SimpleName get input stream
is SimpleName VariableDeclarationFragment MethodInvocation SimpleName c
is SimpleName VariableDeclarationFragment MethodInvocation SimpleName get input stream
input stream SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName is
expected SimpleName VariableDeclarationFragment StringLiteral this is my command
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName expected
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment StringLiteral this is my command
expected SimpleName MethodInvocation SimpleName get bytes
expected SimpleName MethodInvocation QualifiedName standard charsetsutf
get bytes SimpleName MethodInvocation QualifiedName standard charsetsutf
exp data SimpleName VariableDeclarationFragment MethodInvocation SimpleName expected
exp data SimpleName VariableDeclarationFragment MethodInvocation SimpleName get bytes
exp data SimpleName VariableDeclarationFragment MethodInvocation QualifiedName standard charsetsutf
byte PrimitiveType ArrayType VariableDeclarationStatement VariableDeclarationFragment SimpleName exp data
exp datalength QualifiedName InfixExpression QualifiedName longsize
byte PrimitiveType ArrayType ArrayCreation InfixExpression QualifiedName exp datalength
byte PrimitiveType ArrayType ArrayCreation InfixExpression QualifiedName longsize
act data SimpleName VariableDeclarationFragment ArrayCreation ArrayType PrimitiveType byte
act data SimpleName VariableDeclarationFragment ArrayCreation InfixExpression QualifiedName exp datalength
act data SimpleName VariableDeclarationFragment ArrayCreation InfixExpression QualifiedName longsize
byte PrimitiveType ArrayType VariableDeclarationStatement VariableDeclarationFragment SimpleName act data
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression NumberLiteral empty
os SimpleName MethodInvocation SimpleName write
os SimpleName MethodInvocation SimpleName exp data
write SimpleName MethodInvocation SimpleName exp data
os SimpleName MethodInvocation SimpleName flush
is SimpleName MethodInvocation SimpleName read
is SimpleName MethodInvocation SimpleName act data
read SimpleName MethodInvocation SimpleName act data
len SimpleName VariableDeclarationFragment MethodInvocation SimpleName is
len SimpleName VariableDeclarationFragment MethodInvocation SimpleName read
len SimpleName VariableDeclarationFragment MethodInvocation SimpleName act data
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName len
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName is
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName read
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName act data
string SimpleName SimpleType ClassInstanceCreation SimpleName act data
string SimpleName SimpleType ClassInstanceCreation NumberLiteral empty
string SimpleName SimpleType ClassInstanceCreation SimpleName len
act data SimpleName ClassInstanceCreation NumberLiteral empty
act data SimpleName ClassInstanceCreation SimpleName len
empty NumberLiteral ClassInstanceCreation SimpleName len
actual SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName string
actual SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName act data
actual SimpleName VariableDeclarationFragment ClassInstanceCreation NumberLiteral empty
actual SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName len
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName actual
mismatched command at iteration StringLiteral InfixExpression SimpleName i
assert equals SimpleName MethodInvocation InfixExpression StringLiteral mismatched command at iteration
assert equals SimpleName MethodInvocation InfixExpression SimpleName i
assert equals SimpleName MethodInvocation SimpleName expected
assert equals SimpleName MethodInvocation SimpleName actual
mismatched command at iteration StringLiteral InfixExpression MethodInvocation SimpleName expected
i SimpleName InfixExpression MethodInvocation SimpleName expected
mismatched command at iteration StringLiteral InfixExpression MethodInvocation SimpleName actual
i SimpleName InfixExpression MethodInvocation SimpleName actual
expected SimpleName MethodInvocation SimpleName actual
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression NumberLiteral empty
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
empty NumberLiteral InfixExpression ForStatement PostfixExpression SimpleName i
c SimpleName MethodInvocation SimpleName disconnect
s SimpleName MethodInvocation SimpleName disconnect
private Modifier MethodDeclaration PrimitiveType void
private Modifier MethodDeclaration SimpleName run jsch test
private Modifier MethodDeclaration SingleVariableDeclaration PrimitiveType int
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName port
private Modifier MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration SimpleName run jsch test
void PrimitiveType MethodDeclaration SingleVariableDeclaration PrimitiveType int
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName port
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
run jsch test SimpleName MethodDeclaration SingleVariableDeclaration PrimitiveType int
run jsch test SimpleName MethodDeclaration SingleVariableDeclaration SimpleName port
run jsch test SimpleName MethodDeclaration SimpleType SimpleName exception
int PrimitiveType SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
port SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName run jsch test
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName port
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName run jsch test
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName port
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception