client SimpleName MethodInvocation SimpleName start
session SimpleName VariableDeclarationFragment MethodInvocation SimpleName create test client session
client session SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName session
session SimpleName MethodInvocation SimpleName create shell channel
channel SimpleName VariableDeclarationFragment MethodInvocation SimpleName session
channel SimpleName VariableDeclarationFragment MethodInvocation SimpleName create shell channel
client channel SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName channel
sent SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName byte array output stream
byte array output stream SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName sent
out SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName byte array output stream
byte array output stream SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName out
err SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName byte array output stream
byte array output stream SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName err
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
channel SimpleName MethodInvocation SimpleName get inverted in
tee output stream SimpleName SimpleType ClassInstanceCreation SimpleName sent
tee output stream SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName channel
tee output stream SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get inverted in
sent SimpleName ClassInstanceCreation MethodInvocation SimpleName channel
sent SimpleName ClassInstanceCreation MethodInvocation SimpleName get inverted in
piped in SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName tee output stream
piped in SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName sent
piped in SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName channel
piped in SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName get inverted in
output stream SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName piped in
this is my command StringLiteral MethodInvocation SimpleName get bytes
this is my command StringLiteral MethodInvocation QualifiedName standard charsetsutf
get bytes SimpleName MethodInvocation QualifiedName standard charsetsutf
piped in SimpleName MethodInvocation SimpleName write
piped in SimpleName MethodInvocation MethodInvocation StringLiteral this is my command
piped in SimpleName MethodInvocation MethodInvocation SimpleName get bytes
piped in SimpleName MethodInvocation MethodInvocation QualifiedName standard charsetsutf
write SimpleName MethodInvocation MethodInvocation StringLiteral this is my command
write SimpleName MethodInvocation MethodInvocation SimpleName get bytes
write SimpleName MethodInvocation MethodInvocation QualifiedName standard charsetsutf
piped in SimpleName MethodInvocation SimpleName flush
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
sb SimpleName MethodInvocation SimpleName to string
sb SimpleName MethodInvocation MethodInvocation SimpleName get bytes
to string SimpleName MethodInvocation MethodInvocation SimpleName get bytes
sb SimpleName MethodInvocation MethodInvocation QualifiedName standard charsetsutf
to string SimpleName MethodInvocation MethodInvocation QualifiedName standard charsetsutf
get bytes SimpleName MethodInvocation QualifiedName standard charsetsutf
piped in SimpleName MethodInvocation SimpleName write
piped in SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName sb
piped in SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to string
piped in SimpleName MethodInvocation MethodInvocation SimpleName get bytes
piped in SimpleName MethodInvocation MethodInvocation QualifiedName standard charsetsutf
write SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName sb
write SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to string
write SimpleName MethodInvocation MethodInvocation SimpleName get bytes
write SimpleName MethodInvocation MethodInvocation QualifiedName standard charsetsutf
exit StringLiteral MethodInvocation SimpleName get bytes
exit StringLiteral MethodInvocation QualifiedName standard charsetsutf
get bytes SimpleName MethodInvocation QualifiedName standard charsetsutf
piped in SimpleName MethodInvocation SimpleName write
piped in SimpleName MethodInvocation MethodInvocation StringLiteral exit
piped in SimpleName MethodInvocation MethodInvocation SimpleName get bytes
piped in SimpleName MethodInvocation MethodInvocation QualifiedName standard charsetsutf
write SimpleName MethodInvocation MethodInvocation StringLiteral exit
write SimpleName MethodInvocation MethodInvocation SimpleName get bytes
write SimpleName MethodInvocation MethodInvocation QualifiedName standard charsetsutf
piped in SimpleName MethodInvocation SimpleName flush
collection SimpleName SimpleType ParameterizedType SimpleType SimpleName client channel event
enum set SimpleName MethodInvocation SimpleName of
enum set SimpleName MethodInvocation QualifiedName client channel eventclosed
of SimpleName MethodInvocation QualifiedName client channel eventclosed
time unitseconds QualifiedName MethodInvocation SimpleName to millis
time unitseconds QualifiedName MethodInvocation NumberLiteral l
to millis SimpleName MethodInvocation NumberLiteral l
channel SimpleName MethodInvocation SimpleName wait for
channel SimpleName MethodInvocation MethodInvocation SimpleName enum set
channel SimpleName MethodInvocation MethodInvocation SimpleName of
channel SimpleName MethodInvocation MethodInvocation QualifiedName client channel eventclosed
channel SimpleName MethodInvocation MethodInvocation QualifiedName time unitseconds
channel SimpleName MethodInvocation MethodInvocation SimpleName to millis
channel SimpleName MethodInvocation MethodInvocation NumberLiteral l
wait for SimpleName MethodInvocation MethodInvocation SimpleName enum set
wait for SimpleName MethodInvocation MethodInvocation SimpleName of
wait for SimpleName MethodInvocation MethodInvocation QualifiedName client channel eventclosed
wait for SimpleName MethodInvocation MethodInvocation QualifiedName time unitseconds
wait for SimpleName MethodInvocation MethodInvocation SimpleName to millis
wait for SimpleName MethodInvocation MethodInvocation NumberLiteral l
enum set SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName time unitseconds
enum set SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to millis
enum set SimpleName MethodInvocation MethodInvocation MethodInvocation NumberLiteral l
of SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName time unitseconds
of SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to millis
of SimpleName MethodInvocation MethodInvocation MethodInvocation NumberLiteral l
client channel eventclosed QualifiedName MethodInvocation MethodInvocation MethodInvocation QualifiedName time unitseconds
client channel eventclosed QualifiedName MethodInvocation MethodInvocation MethodInvocation SimpleName to millis
client channel eventclosed QualifiedName MethodInvocation MethodInvocation MethodInvocation NumberLiteral l
result SimpleName VariableDeclarationFragment MethodInvocation SimpleName channel
result SimpleName VariableDeclarationFragment MethodInvocation SimpleName wait for
result SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName enum set
result SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName of
result SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation QualifiedName client channel eventclosed
result SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation QualifiedName time unitseconds
result SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName to millis
result SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation NumberLiteral l
result SimpleName MethodInvocation SimpleName contains
result SimpleName MethodInvocation QualifiedName client channel eventtimeout
contains SimpleName MethodInvocation QualifiedName client channel eventtimeout
assert false SimpleName MethodInvocation StringLiteral timeout while waiting on channel close
assert false SimpleName MethodInvocation MethodInvocation SimpleName result
assert false SimpleName MethodInvocation MethodInvocation SimpleName contains
assert false SimpleName MethodInvocation MethodInvocation QualifiedName client channel eventtimeout
timeout while waiting on channel close StringLiteral MethodInvocation MethodInvocation SimpleName result
timeout while waiting on channel close StringLiteral MethodInvocation MethodInvocation SimpleName contains
timeout while waiting on channel close StringLiteral MethodInvocation MethodInvocation QualifiedName client channel eventtimeout
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
client SimpleName MethodInvocation SimpleName stop
client session holder SimpleName MethodInvocation SimpleName get
assert null SimpleName MethodInvocation StringLiteral session closure not signalled
assert null SimpleName MethodInvocation MethodInvocation SimpleName client session holder
assert null SimpleName MethodInvocation MethodInvocation SimpleName get
session closure not signalled StringLiteral MethodInvocation MethodInvocation SimpleName client session holder
session closure not signalled StringLiteral MethodInvocation MethodInvocation SimpleName get
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test client inverted
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test client inverted
public Modifier MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration SimpleName test client inverted
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
test client inverted SimpleName MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test client inverted
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test client inverted
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception