limit SimpleName VariableDeclarationFragment NumberLiteral empty
final Modifier VariableDeclarationStatement PrimitiveType long
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName limit
final Modifier VariableDeclarationStatement VariableDeclarationFragment NumberLiteral empty
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName limit
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment NumberLiteral empty
set up SimpleName MethodInvocation SimpleName limit
set up SimpleName MethodInvocation NumberLiteral empty
limit SimpleName MethodInvocation NumberLiteral empty
client SimpleName VariableDeclarationFragment MethodInvocation SimpleName setup test client
ssh client SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName client
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
session SimpleName MethodInvocation SimpleName create shell channel
channel SimpleName VariableDeclarationFragment MethodInvocation SimpleName session
channel SimpleName VariableDeclarationFragment MethodInvocation SimpleName create shell channel
channel shell SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName channel
sent SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName byte array output stream
byte array output stream SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName sent
piped in SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName piped output stream
piped output stream SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName piped in
tee output stream SimpleName SimpleType ClassInstanceCreation SimpleName sent
tee output stream SimpleName SimpleType ClassInstanceCreation SimpleName piped in
sent SimpleName ClassInstanceCreation SimpleName piped in
tee out SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName tee output stream
tee out SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName sent
tee out SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName piped in
output stream SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName tee out
out SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName byte array output stream
byte array output stream SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName out
err SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName byte array output stream
byte array output stream SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName err
piped input stream SimpleName SimpleType ClassInstanceCreation SimpleName piped in
in pipe SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName piped input stream
in pipe SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName piped in
input stream SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName in pipe
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
this is my command StringLiteral MethodInvocation SimpleName get bytes
this is my command StringLiteral MethodInvocation QualifiedName standard charsetsutf
get bytes SimpleName MethodInvocation QualifiedName standard charsetsutf
tee out SimpleName MethodInvocation SimpleName write
tee out SimpleName MethodInvocation MethodInvocation StringLiteral this is my command
tee out SimpleName MethodInvocation MethodInvocation SimpleName get bytes
tee out SimpleName MethodInvocation MethodInvocation QualifiedName standard charsetsutf
write SimpleName MethodInvocation MethodInvocation StringLiteral this is my command
write SimpleName MethodInvocation MethodInvocation SimpleName get bytes
write SimpleName MethodInvocation MethodInvocation QualifiedName standard charsetsutf
tee out SimpleName MethodInvocation SimpleName flush
sb SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName string builder
string builder SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName sb
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression NumberLiteral empty
sb SimpleName MethodInvocation SimpleName append
sb SimpleName MethodInvocation StringLiteral empty
append SimpleName MethodInvocation StringLiteral empty
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression NumberLiteral empty
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
empty NumberLiteral InfixExpression ForStatement PostfixExpression SimpleName i
sb SimpleName MethodInvocation SimpleName append
sb SimpleName MethodInvocation CharacterLiteral empty
append SimpleName MethodInvocation CharacterLiteral empty
exchanges SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName atomic integer
final Modifier VariableDeclarationStatement SimpleType SimpleName atomic integer
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName exchanges
atomic integer SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName exchanges
session SimpleName SimpleType SingleVariableDeclaration SimpleName session
override SimpleName MarkerAnnotation MethodDeclaration Modifier public
override SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
override SimpleName MarkerAnnotation MethodDeclaration SimpleName session created
override SimpleName MarkerAnnotation MethodDeclaration SingleVariableDeclaration SimpleName session
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName session created
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName session
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName session
void PrimitiveType MethodDeclaration SimpleName session created
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName session
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName session
session created SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName session
session created SimpleName MethodDeclaration SingleVariableDeclaration SimpleName session
session SimpleName SimpleType SingleVariableDeclaration SimpleName session
event SimpleName SimpleType SingleVariableDeclaration SimpleName event
event SimpleName InfixExpression QualifiedName eventkey established
exchanges SimpleName MethodInvocation SimpleName increment and get
override SimpleName MarkerAnnotation MethodDeclaration Modifier public
override SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
override SimpleName MarkerAnnotation MethodDeclaration SimpleName session event
override SimpleName MarkerAnnotation MethodDeclaration SingleVariableDeclaration SimpleName session
override SimpleName MarkerAnnotation MethodDeclaration SingleVariableDeclaration SimpleName event
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName session event
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName session
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName session
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName event
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName event
void PrimitiveType MethodDeclaration SimpleName session event
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName session
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName session
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName event
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName event
session event SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName session
session event SimpleName MethodDeclaration SingleVariableDeclaration SimpleName session
session event SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName event
session event SimpleName MethodDeclaration SingleVariableDeclaration SimpleName event
session SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName event
session SimpleName SimpleType SingleVariableDeclaration SimpleName session
override SimpleName MarkerAnnotation MethodDeclaration Modifier public
override SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
override SimpleName MarkerAnnotation MethodDeclaration SimpleName session closed
override SimpleName MarkerAnnotation MethodDeclaration SingleVariableDeclaration SimpleName session
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName session closed
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName session
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName session
void PrimitiveType MethodDeclaration SimpleName session closed
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName session
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName session
session closed SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName session
session closed SimpleName MethodDeclaration SingleVariableDeclaration SimpleName session
public Modifier MethodDeclaration AnonymousClassDeclaration MethodDeclaration Modifier public
public Modifier MethodDeclaration AnonymousClassDeclaration MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration AnonymousClassDeclaration MethodDeclaration SimpleName session event
void PrimitiveType MethodDeclaration AnonymousClassDeclaration MethodDeclaration Modifier public
void PrimitiveType MethodDeclaration AnonymousClassDeclaration MethodDeclaration PrimitiveType void
void PrimitiveType MethodDeclaration AnonymousClassDeclaration MethodDeclaration SimpleName session event
session created SimpleName MethodDeclaration AnonymousClassDeclaration MethodDeclaration Modifier public
session created SimpleName MethodDeclaration AnonymousClassDeclaration MethodDeclaration PrimitiveType void
session created SimpleName MethodDeclaration AnonymousClassDeclaration MethodDeclaration SimpleName session event
public Modifier MethodDeclaration AnonymousClassDeclaration MethodDeclaration Modifier public
public Modifier MethodDeclaration AnonymousClassDeclaration MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration AnonymousClassDeclaration MethodDeclaration SimpleName session closed
void PrimitiveType MethodDeclaration AnonymousClassDeclaration MethodDeclaration Modifier public
void PrimitiveType MethodDeclaration AnonymousClassDeclaration MethodDeclaration PrimitiveType void
void PrimitiveType MethodDeclaration AnonymousClassDeclaration MethodDeclaration SimpleName session closed
session created SimpleName MethodDeclaration AnonymousClassDeclaration MethodDeclaration Modifier public
session created SimpleName MethodDeclaration AnonymousClassDeclaration MethodDeclaration PrimitiveType void
session created SimpleName MethodDeclaration AnonymousClassDeclaration MethodDeclaration SimpleName session closed
public Modifier MethodDeclaration AnonymousClassDeclaration MethodDeclaration Modifier public
public Modifier MethodDeclaration AnonymousClassDeclaration MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration AnonymousClassDeclaration MethodDeclaration SimpleName session closed
void PrimitiveType MethodDeclaration AnonymousClassDeclaration MethodDeclaration Modifier public
void PrimitiveType MethodDeclaration AnonymousClassDeclaration MethodDeclaration PrimitiveType void
void PrimitiveType MethodDeclaration AnonymousClassDeclaration MethodDeclaration SimpleName session closed
session event SimpleName MethodDeclaration AnonymousClassDeclaration MethodDeclaration Modifier public
session event SimpleName MethodDeclaration AnonymousClassDeclaration MethodDeclaration PrimitiveType void
session event SimpleName MethodDeclaration AnonymousClassDeclaration MethodDeclaration SimpleName session closed
session SimpleName MethodInvocation SimpleName add session listener
session SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName session listener
add session listener SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName session listener
sb SimpleName MethodInvocation SimpleName to string
sb SimpleName MethodInvocation MethodInvocation SimpleName get bytes
to string SimpleName MethodInvocation MethodInvocation SimpleName get bytes
sb SimpleName MethodInvocation MethodInvocation QualifiedName standard charsetsutf
to string SimpleName MethodInvocation MethodInvocation QualifiedName standard charsetsutf
get bytes SimpleName MethodInvocation QualifiedName standard charsetsutf
data SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName sb
data SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName to string
data SimpleName VariableDeclarationFragment MethodInvocation SimpleName get bytes
data SimpleName VariableDeclarationFragment MethodInvocation QualifiedName standard charsetsutf
byte PrimitiveType ArrayType VariableDeclarationStatement VariableDeclarationFragment SimpleName data
sent size SimpleName VariableDeclarationFragment NumberLiteral l
long PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName sent size
long PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral l
limit SimpleName InfixExpression QualifiedName bytemax value
limit SimpleName InfixExpression QualifiedName datalength
bytemax value QualifiedName InfixExpression QualifiedName datalength
sent size SimpleName InfixExpression ParenthesizedExpression InfixExpression SimpleName limit
sent size SimpleName InfixExpression ParenthesizedExpression InfixExpression QualifiedName bytemax value
sent size SimpleName InfixExpression ParenthesizedExpression InfixExpression QualifiedName datalength
sent size SimpleName Assignment QualifiedName datalength
tee out SimpleName MethodInvocation SimpleName write
tee out SimpleName MethodInvocation SimpleName data
write SimpleName MethodInvocation SimpleName data
tee out SimpleName MethodInvocation SimpleName flush
exchanges SimpleName MethodInvocation SimpleName get
exchanges SimpleName MethodInvocation InfixExpression NumberLiteral empty
get SimpleName MethodInvocation InfixExpression NumberLiteral empty
long PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName sent size
long PrimitiveType VariableDeclarationExpression ForStatement Assignment SimpleName sent size
long PrimitiveType VariableDeclarationExpression ForStatement Assignment QualifiedName datalength
sent size SimpleName InfixExpression ForStatement Assignment SimpleName sent size
sent size SimpleName InfixExpression ForStatement Assignment QualifiedName datalength
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
channel SimpleName MethodInvocation SimpleName wait for
channel SimpleName MethodInvocation QualifiedName client channelclosed
channel SimpleName MethodInvocation NumberLiteral empty
wait for SimpleName MethodInvocation QualifiedName client channelclosed
wait for SimpleName MethodInvocation NumberLiteral empty
client channelclosed QualifiedName MethodInvocation NumberLiteral empty
channel SimpleName MethodInvocation SimpleName close
channel SimpleName MethodInvocation BooleanLiteral false
close SimpleName MethodInvocation BooleanLiteral false
exchanges SimpleName MethodInvocation SimpleName get
exchanges SimpleName MethodInvocation InfixExpression NumberLiteral empty
get SimpleName MethodInvocation InfixExpression NumberLiteral empty
assert true SimpleName MethodInvocation StringLiteral expected rekeying
assert true SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName exchanges
assert true SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get
assert true SimpleName MethodInvocation InfixExpression NumberLiteral empty
expected rekeying StringLiteral MethodInvocation InfixExpression MethodInvocation SimpleName exchanges
expected rekeying StringLiteral MethodInvocation InfixExpression MethodInvocation SimpleName get
expected rekeying StringLiteral MethodInvocation InfixExpression NumberLiteral empty
sent SimpleName MethodInvocation SimpleName to byte array
sent SimpleName MethodInvocation FieldAccess SimpleName length
to byte array SimpleName MethodInvocation FieldAccess SimpleName length
out SimpleName MethodInvocation SimpleName to byte array
out SimpleName MethodInvocation FieldAccess SimpleName length
to byte array SimpleName MethodInvocation FieldAccess SimpleName length
assert equals SimpleName MethodInvocation StringLiteral mismatched sent data length
assert equals SimpleName MethodInvocation FieldAccess MethodInvocation SimpleName sent
assert equals SimpleName MethodInvocation FieldAccess MethodInvocation SimpleName to byte array
assert equals SimpleName MethodInvocation FieldAccess SimpleName length
assert equals SimpleName MethodInvocation FieldAccess MethodInvocation SimpleName out
assert equals SimpleName MethodInvocation FieldAccess MethodInvocation SimpleName to byte array
assert equals SimpleName MethodInvocation FieldAccess SimpleName length
mismatched sent data length StringLiteral MethodInvocation FieldAccess MethodInvocation SimpleName sent
mismatched sent data length StringLiteral MethodInvocation FieldAccess MethodInvocation SimpleName to byte array
mismatched sent data length StringLiteral MethodInvocation FieldAccess SimpleName length
mismatched sent data length StringLiteral MethodInvocation FieldAccess MethodInvocation SimpleName out
mismatched sent data length StringLiteral MethodInvocation FieldAccess MethodInvocation SimpleName to byte array
mismatched sent data length StringLiteral MethodInvocation FieldAccess SimpleName length
length SimpleName FieldAccess MethodInvocation FieldAccess SimpleName length
sent SimpleName MethodInvocation SimpleName to byte array
out SimpleName MethodInvocation SimpleName to byte array
assert array equals SimpleName MethodInvocation StringLiteral mismatched sent data content
assert array equals SimpleName MethodInvocation MethodInvocation SimpleName sent
assert array equals SimpleName MethodInvocation MethodInvocation SimpleName to byte array
assert array equals SimpleName MethodInvocation MethodInvocation SimpleName out
assert array equals SimpleName MethodInvocation MethodInvocation SimpleName to byte array
mismatched sent data content StringLiteral MethodInvocation MethodInvocation SimpleName sent
mismatched sent data content StringLiteral MethodInvocation MethodInvocation SimpleName to byte array
mismatched sent data content StringLiteral MethodInvocation MethodInvocation SimpleName out
mismatched sent data content StringLiteral MethodInvocation MethodInvocation SimpleName to byte array
sent SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName out
sent SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to byte array
to byte array SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName out
to byte array SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to byte array
client SimpleName MethodInvocation SimpleName stop
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test re exchange from server by size
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test re exchange from server by size
public Modifier MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration Block VariableDeclarationStatement Modifier final
public Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType long
void PrimitiveType MethodDeclaration SimpleName test re exchange from server by size
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement Modifier final
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType long
test re exchange from server by size SimpleName MethodDeclaration SimpleType SimpleName exception
test re exchange from server by size SimpleName MethodDeclaration Block VariableDeclarationStatement Modifier final
test re exchange from server by size SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType long
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test re exchange from server by size
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test re exchange from server by size
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception