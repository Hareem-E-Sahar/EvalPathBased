client SimpleName MethodInvocation SimpleName start
session SimpleName VariableDeclarationFragment MethodInvocation SimpleName create test client session
client session SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName session
session SimpleName MethodInvocation SimpleName create shell channel
channel SimpleName VariableDeclarationFragment MethodInvocation SimpleName session
channel SimpleName VariableDeclarationFragment MethodInvocation SimpleName create shell channel
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
empty StringLiteral MethodInvocation QualifiedName standard charsetsutf
get bytes SimpleName MethodInvocation QualifiedName standard charsetsutf
data SimpleName VariableDeclarationFragment MethodInvocation StringLiteral empty
data SimpleName VariableDeclarationFragment MethodInvocation SimpleName get bytes
data SimpleName VariableDeclarationFragment MethodInvocation QualifiedName standard charsetsutf
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
exit StringLiteral MethodInvocation QualifiedName standard charsetsutf
get bytes SimpleName MethodInvocation QualifiedName standard charsetsutf
tee out SimpleName MethodInvocation SimpleName write
tee out SimpleName MethodInvocation MethodInvocation StringLiteral exit
tee out SimpleName MethodInvocation MethodInvocation SimpleName get bytes
tee out SimpleName MethodInvocation MethodInvocation QualifiedName standard charsetsutf
write SimpleName MethodInvocation MethodInvocation StringLiteral exit
write SimpleName MethodInvocation MethodInvocation SimpleName get bytes
write SimpleName MethodInvocation MethodInvocation QualifiedName standard charsetsutf
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
collection SimpleName SimpleType ParameterizedType SimpleType QualifiedName client channelclient channel event
enum set SimpleName MethodInvocation SimpleName of
enum set SimpleName MethodInvocation QualifiedName client channelclient channel eventclosed
of SimpleName MethodInvocation QualifiedName client channelclient channel eventclosed
time unitseconds QualifiedName MethodInvocation SimpleName to millis
time unitseconds QualifiedName MethodInvocation NumberLiteral l
to millis SimpleName MethodInvocation NumberLiteral l
channel SimpleName MethodInvocation SimpleName wait for
channel SimpleName MethodInvocation MethodInvocation SimpleName enum set
channel SimpleName MethodInvocation MethodInvocation SimpleName of
channel SimpleName MethodInvocation MethodInvocation QualifiedName client channelclient channel eventclosed
channel SimpleName MethodInvocation MethodInvocation QualifiedName time unitseconds
channel SimpleName MethodInvocation MethodInvocation SimpleName to millis
channel SimpleName MethodInvocation MethodInvocation NumberLiteral l
wait for SimpleName MethodInvocation MethodInvocation SimpleName enum set
wait for SimpleName MethodInvocation MethodInvocation SimpleName of
wait for SimpleName MethodInvocation MethodInvocation QualifiedName client channelclient channel eventclosed
wait for SimpleName MethodInvocation MethodInvocation QualifiedName time unitseconds
wait for SimpleName MethodInvocation MethodInvocation SimpleName to millis
wait for SimpleName MethodInvocation MethodInvocation NumberLiteral l
enum set SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName time unitseconds
enum set SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to millis
enum set SimpleName MethodInvocation MethodInvocation MethodInvocation NumberLiteral l
of SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName time unitseconds
of SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to millis
of SimpleName MethodInvocation MethodInvocation MethodInvocation NumberLiteral l
client channelclient channel eventclosed QualifiedName MethodInvocation MethodInvocation MethodInvocation QualifiedName time unitseconds
client channelclient channel eventclosed QualifiedName MethodInvocation MethodInvocation MethodInvocation SimpleName to millis
client channelclient channel eventclosed QualifiedName MethodInvocation MethodInvocation MethodInvocation NumberLiteral l
result SimpleName VariableDeclarationFragment MethodInvocation SimpleName channel
result SimpleName VariableDeclarationFragment MethodInvocation SimpleName wait for
result SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName enum set
result SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName of
result SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation QualifiedName client channelclient channel eventclosed
result SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation QualifiedName time unitseconds
result SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName to millis
result SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation NumberLiteral l
result SimpleName MethodInvocation SimpleName contains
result SimpleName MethodInvocation QualifiedName client channelclient channel eventtimeout
contains SimpleName MethodInvocation QualifiedName client channelclient channel eventtimeout
assert false SimpleName MethodInvocation StringLiteral timeout while waiting on channel close
assert false SimpleName MethodInvocation MethodInvocation SimpleName result
assert false SimpleName MethodInvocation MethodInvocation SimpleName contains
assert false SimpleName MethodInvocation MethodInvocation QualifiedName client channelclient channel eventtimeout
timeout while waiting on channel close StringLiteral MethodInvocation MethodInvocation SimpleName result
timeout while waiting on channel close StringLiteral MethodInvocation MethodInvocation SimpleName contains
timeout while waiting on channel close StringLiteral MethodInvocation MethodInvocation QualifiedName client channelclient channel eventtimeout
channel SimpleName MethodInvocation SimpleName close
channel SimpleName MethodInvocation BooleanLiteral false
close SimpleName MethodInvocation BooleanLiteral false
client SimpleName MethodInvocation SimpleName stop
sent SimpleName MethodInvocation SimpleName to byte array
out SimpleName MethodInvocation SimpleName to byte array
assert array equals SimpleName MethodInvocation StringLiteral mismatched sent and received data
assert array equals SimpleName MethodInvocation MethodInvocation SimpleName sent
assert array equals SimpleName MethodInvocation MethodInvocation SimpleName to byte array
assert array equals SimpleName MethodInvocation MethodInvocation SimpleName out
assert array equals SimpleName MethodInvocation MethodInvocation SimpleName to byte array
mismatched sent and received data StringLiteral MethodInvocation MethodInvocation SimpleName sent
mismatched sent and received data StringLiteral MethodInvocation MethodInvocation SimpleName to byte array
mismatched sent and received data StringLiteral MethodInvocation MethodInvocation SimpleName out
mismatched sent and received data StringLiteral MethodInvocation MethodInvocation SimpleName to byte array
sent SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName out
sent SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to byte array
to byte array SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName out
to byte array SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to byte array
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType long
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType long
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType long
client SimpleName MethodInvocation SimpleName stop
client session holder SimpleName MethodInvocation SimpleName get
assert null SimpleName MethodInvocation StringLiteral session closure not signalled
assert null SimpleName MethodInvocation MethodInvocation SimpleName client session holder
assert null SimpleName MethodInvocation MethodInvocation SimpleName get
session closure not signalled StringLiteral MethodInvocation MethodInvocation SimpleName client session holder
session closure not signalled StringLiteral MethodInvocation MethodInvocation SimpleName get
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
