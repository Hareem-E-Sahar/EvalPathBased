client SimpleName MethodInvocation SimpleName start
client SimpleName MethodInvocation SimpleName connect
client SimpleName MethodInvocation MethodInvocation SimpleName get current test name
client SimpleName MethodInvocation StringLiteral localhost
client SimpleName MethodInvocation SimpleName port
connect SimpleName MethodInvocation MethodInvocation SimpleName get current test name
connect SimpleName MethodInvocation StringLiteral localhost
connect SimpleName MethodInvocation SimpleName port
get current test name SimpleName MethodInvocation MethodInvocation StringLiteral localhost
get current test name SimpleName MethodInvocation MethodInvocation SimpleName port
localhost StringLiteral MethodInvocation SimpleName port
client SimpleName MethodInvocation MethodInvocation SimpleName verify
connect SimpleName MethodInvocation MethodInvocation SimpleName verify
get current test name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName verify
localhost StringLiteral MethodInvocation MethodInvocation SimpleName verify
port SimpleName MethodInvocation MethodInvocation SimpleName verify
client SimpleName MethodInvocation MethodInvocation NumberLiteral l
connect SimpleName MethodInvocation MethodInvocation NumberLiteral l
get current test name SimpleName MethodInvocation MethodInvocation MethodInvocation NumberLiteral l
localhost StringLiteral MethodInvocation MethodInvocation NumberLiteral l
port SimpleName MethodInvocation MethodInvocation NumberLiteral l
client SimpleName MethodInvocation MethodInvocation QualifiedName time unitseconds
connect SimpleName MethodInvocation MethodInvocation QualifiedName time unitseconds
get current test name SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName time unitseconds
localhost StringLiteral MethodInvocation MethodInvocation QualifiedName time unitseconds
port SimpleName MethodInvocation MethodInvocation QualifiedName time unitseconds
verify SimpleName MethodInvocation NumberLiteral l
verify SimpleName MethodInvocation QualifiedName time unitseconds
l NumberLiteral MethodInvocation QualifiedName time unitseconds
client SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get session
connect SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get session
localhost StringLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName get session
port SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get session
verify SimpleName MethodInvocation MethodInvocation SimpleName get session
l NumberLiteral MethodInvocation MethodInvocation SimpleName get session
time unitseconds QualifiedName MethodInvocation MethodInvocation SimpleName get session
session SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName verify
session SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation NumberLiteral l
session SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation QualifiedName time unitseconds
session SimpleName VariableDeclarationFragment MethodInvocation SimpleName get session
client session SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName session
session SimpleName MethodInvocation SimpleName add password identity
session SimpleName MethodInvocation MethodInvocation SimpleName get current test name
add password identity SimpleName MethodInvocation MethodInvocation SimpleName get current test name
session SimpleName MethodInvocation SimpleName auth
session SimpleName MethodInvocation MethodInvocation SimpleName verify
auth SimpleName MethodInvocation MethodInvocation SimpleName verify
session SimpleName MethodInvocation MethodInvocation NumberLiteral l
auth SimpleName MethodInvocation MethodInvocation NumberLiteral l
session SimpleName MethodInvocation MethodInvocation QualifiedName time unitseconds
auth SimpleName MethodInvocation MethodInvocation QualifiedName time unitseconds
verify SimpleName MethodInvocation NumberLiteral l
verify SimpleName MethodInvocation QualifiedName time unitseconds
l NumberLiteral MethodInvocation QualifiedName time unitseconds
session SimpleName MethodInvocation SimpleName create channel
session SimpleName MethodInvocation QualifiedName client channelchannel shell
create channel SimpleName MethodInvocation QualifiedName client channelchannel shell
channel SimpleName VariableDeclarationFragment MethodInvocation SimpleName session
channel SimpleName VariableDeclarationFragment MethodInvocation SimpleName create channel
channel SimpleName VariableDeclarationFragment MethodInvocation QualifiedName client channelchannel shell
client channel SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName channel
sent SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName byte array output stream
byte array output stream SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName sent
piped in SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName piped output stream
piped output stream SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName piped in
piped input stream SimpleName SimpleType ClassInstanceCreation SimpleName piped in
in pipe SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName piped input stream
in pipe SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName piped in
input stream SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName in pipe
out SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName byte array output stream
byte array output stream SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName out
err SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName byte array output stream
byte array output stream SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName err
channel SimpleName MethodInvocation SimpleName set in
channel SimpleName MethodInvocation SimpleName in pipe
set in SimpleName MethodInvocation SimpleName in pipe
channel SimpleName MethodInvocation SimpleName set out
channel SimpleName MethodInvocation SimpleName out
set out SimpleName MethodInvocation SimpleName out
channel SimpleName MethodInvocation SimpleName set err
channel SimpleName MethodInvocation SimpleName err
set err SimpleName MethodInvocation SimpleName err
channel SimpleName MethodInvocation SimpleName open
channel SimpleName MethodInvocation MethodInvocation SimpleName verify
open SimpleName MethodInvocation MethodInvocation SimpleName verify
channel SimpleName MethodInvocation MethodInvocation NumberLiteral l
open SimpleName MethodInvocation MethodInvocation NumberLiteral l
channel SimpleName MethodInvocation MethodInvocation QualifiedName time unitseconds
open SimpleName MethodInvocation MethodInvocation QualifiedName time unitseconds
verify SimpleName MethodInvocation NumberLiteral l
verify SimpleName MethodInvocation QualifiedName time unitseconds
l NumberLiteral MethodInvocation QualifiedName time unitseconds
bytes SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName bytes
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment NumberLiteral empty
empty StringLiteral MethodInvocation SimpleName get bytes
data SimpleName VariableDeclarationFragment MethodInvocation StringLiteral empty
data SimpleName VariableDeclarationFragment MethodInvocation SimpleName get bytes
byte PrimitiveType ArrayType VariableDeclarationStatement VariableDeclarationFragment SimpleName data
system SimpleName MethodInvocation SimpleName current time millis
t SimpleName VariableDeclarationFragment MethodInvocation SimpleName system
t SimpleName VariableDeclarationFragment MethodInvocation SimpleName current time millis
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName t
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName system
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName current time millis
tee output stream SimpleName SimpleType ClassInstanceCreation SimpleName sent
tee output stream SimpleName SimpleType ClassInstanceCreation SimpleName piped in
sent SimpleName ClassInstanceCreation SimpleName piped in
tee out SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName tee output stream
tee out SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName sent
tee out SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName piped in
output stream SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName tee out
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression NumberLiteral empty
tee out SimpleName MethodInvocation SimpleName write
tee out SimpleName MethodInvocation SimpleName data
write SimpleName MethodInvocation SimpleName data
tee out SimpleName MethodInvocation SimpleName flush
bytes SimpleName Assignment QualifiedName datalength
bytes SimpleName InfixExpression NumberLiteral x fff
bytes SimpleName InfixExpression QualifiedName datalength
bytes SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral x fff
datalength QualifiedName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral x fff
bytes written StringLiteral InfixExpression SimpleName bytes
systemout QualifiedName MethodInvocation SimpleName println
systemout QualifiedName MethodInvocation InfixExpression StringLiteral bytes written
systemout QualifiedName MethodInvocation InfixExpression SimpleName bytes
println SimpleName MethodInvocation InfixExpression StringLiteral bytes written
println SimpleName MethodInvocation InfixExpression SimpleName bytes
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression NumberLiteral empty
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
empty NumberLiteral InfixExpression ForStatement PostfixExpression SimpleName i
exit StringLiteral MethodInvocation SimpleName get bytes
tee out SimpleName MethodInvocation SimpleName write
tee out SimpleName MethodInvocation MethodInvocation StringLiteral exit
tee out SimpleName MethodInvocation MethodInvocation SimpleName get bytes
write SimpleName MethodInvocation MethodInvocation StringLiteral exit
write SimpleName MethodInvocation MethodInvocation SimpleName get bytes
tee out SimpleName MethodInvocation SimpleName flush
system SimpleName MethodInvocation SimpleName current time millis
t SimpleName VariableDeclarationFragment MethodInvocation SimpleName system
t SimpleName VariableDeclarationFragment MethodInvocation SimpleName current time millis
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName t
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName system
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName current time millis
bytes SimpleName InfixExpression NumberLiteral empty
t SimpleName InfixExpression SimpleName t
sent StringLiteral InfixExpression ParenthesizedExpression InfixExpression SimpleName bytes
sent StringLiteral InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
sent StringLiteral InfixExpression StringLiteral kb in
sent StringLiteral InfixExpression ParenthesizedExpression InfixExpression SimpleName t
sent StringLiteral InfixExpression ParenthesizedExpression InfixExpression SimpleName t
sent StringLiteral InfixExpression StringLiteral ms
bytes SimpleName InfixExpression ParenthesizedExpression InfixExpression StringLiteral kb in
empty NumberLiteral InfixExpression ParenthesizedExpression InfixExpression StringLiteral kb in
bytes SimpleName InfixExpression ParenthesizedExpression InfixExpression StringLiteral ms
empty NumberLiteral InfixExpression ParenthesizedExpression InfixExpression StringLiteral ms
kb in StringLiteral InfixExpression ParenthesizedExpression InfixExpression SimpleName t
kb in StringLiteral InfixExpression ParenthesizedExpression InfixExpression SimpleName t
kb in StringLiteral InfixExpression StringLiteral ms
t SimpleName InfixExpression ParenthesizedExpression InfixExpression StringLiteral ms
t SimpleName InfixExpression ParenthesizedExpression InfixExpression StringLiteral ms
systemout QualifiedName MethodInvocation SimpleName println
systemout QualifiedName MethodInvocation InfixExpression StringLiteral sent
systemout QualifiedName MethodInvocation InfixExpression StringLiteral kb in
systemout QualifiedName MethodInvocation InfixExpression StringLiteral ms
println SimpleName MethodInvocation InfixExpression StringLiteral sent
println SimpleName MethodInvocation InfixExpression StringLiteral kb in
println SimpleName MethodInvocation InfixExpression StringLiteral ms
systemout QualifiedName MethodInvocation SimpleName println
systemout QualifiedName MethodInvocation StringLiteral waiting for channel to be closed
println SimpleName MethodInvocation StringLiteral waiting for channel to be closed
channel SimpleName MethodInvocation SimpleName wait for
channel SimpleName MethodInvocation QualifiedName client channelclosed
channel SimpleName MethodInvocation NumberLiteral empty
wait for SimpleName MethodInvocation QualifiedName client channelclosed
wait for SimpleName MethodInvocation NumberLiteral empty
client channelclosed QualifiedName MethodInvocation NumberLiteral empty
channel SimpleName MethodInvocation SimpleName close
channel SimpleName MethodInvocation BooleanLiteral false
close SimpleName MethodInvocation BooleanLiteral false
client SimpleName MethodInvocation SimpleName stop
sent SimpleName MethodInvocation SimpleName to byte array
out SimpleName MethodInvocation SimpleName to byte array
assert array equals SimpleName MethodInvocation MethodInvocation SimpleName sent
assert array equals SimpleName MethodInvocation MethodInvocation SimpleName to byte array
assert array equals SimpleName MethodInvocation MethodInvocation SimpleName out
assert array equals SimpleName MethodInvocation MethodInvocation SimpleName to byte array
sent SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName out
sent SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to byte array
to byte array SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName out
to byte array SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to byte array
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType long
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType long
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType long
client SimpleName MethodInvocation SimpleName stop
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test client with lengthy dialog
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test client with lengthy dialog
public Modifier MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration SimpleName test client with lengthy dialog
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
test client with lengthy dialog SimpleName MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test client with lengthy dialog
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test client with lengthy dialog
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
