client SimpleName MethodInvocation SimpleName start
session SimpleName VariableDeclarationFragment MethodInvocation SimpleName create test client session
client session SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName session
session SimpleName MethodInvocation SimpleName create exec channel
session SimpleName MethodInvocation MethodInvocation SimpleName get current test name
create exec channel SimpleName MethodInvocation MethodInvocation SimpleName get current test name
channel SimpleName VariableDeclarationFragment MethodInvocation SimpleName session
channel SimpleName VariableDeclarationFragment MethodInvocation SimpleName create exec channel
channel SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get current test name
channel exec SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName channel
no close output stream SimpleName SimpleType ClassInstanceCreation QualifiedName systemout
stdout SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName no close output stream
stdout SimpleName VariableDeclarationFragment ClassInstanceCreation QualifiedName systemout
output stream SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName stdout
no close output stream SimpleName SimpleType ClassInstanceCreation QualifiedName systemerr
stderr SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName no close output stream
stderr SimpleName VariableDeclarationFragment ClassInstanceCreation QualifiedName systemerr
output stream SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName stderr
channel SimpleName MethodInvocation SimpleName set out
channel SimpleName MethodInvocation SimpleName stdout
set out SimpleName MethodInvocation SimpleName stdout
channel SimpleName MethodInvocation SimpleName set err
channel SimpleName MethodInvocation SimpleName stderr
set err SimpleName MethodInvocation SimpleName stderr
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
thread SimpleName MethodInvocation SimpleName sleep
thread SimpleName MethodInvocation NumberLiteral l
sleep SimpleName MethodInvocation NumberLiteral l
a StringLiteral MethodInvocation SimpleName get bytes
a StringLiteral MethodInvocation QualifiedName standard charsetsutf
get bytes SimpleName MethodInvocation QualifiedName standard charsetsutf
data SimpleName VariableDeclarationFragment MethodInvocation StringLiteral a
data SimpleName VariableDeclarationFragment MethodInvocation SimpleName get bytes
data SimpleName VariableDeclarationFragment MethodInvocation QualifiedName standard charsetsutf
byte PrimitiveType ArrayType VariableDeclarationStatement VariableDeclarationFragment SimpleName data
channel SimpleName MethodInvocation SimpleName get inverted in
inverted stream SimpleName VariableDeclarationFragment MethodInvocation SimpleName channel
inverted stream SimpleName VariableDeclarationFragment MethodInvocation SimpleName get inverted in
output stream SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName inverted stream
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression NumberLiteral empty
inverted stream SimpleName MethodInvocation SimpleName write
inverted stream SimpleName MethodInvocation SimpleName data
write SimpleName MethodInvocation SimpleName data
inverted stream SimpleName MethodInvocation SimpleName flush
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression NumberLiteral empty
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
empty NumberLiteral InfixExpression ForStatement PostfixExpression SimpleName i
ssh exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
channel SimpleName MethodInvocation SimpleName wait for
channel SimpleName MethodInvocation QualifiedName client channelclosed
channel SimpleName MethodInvocation NumberLiteral empty
wait for SimpleName MethodInvocation QualifiedName client channelclosed
wait for SimpleName MethodInvocation NumberLiteral empty
client channelclosed QualifiedName MethodInvocation NumberLiteral empty
channel SimpleName MethodInvocation InfixExpression QualifiedName client channelclosed
wait for SimpleName MethodInvocation InfixExpression QualifiedName client channelclosed
client channelclosed QualifiedName MethodInvocation InfixExpression QualifiedName client channelclosed
empty NumberLiteral MethodInvocation InfixExpression QualifiedName client channelclosed
assert equals SimpleName MethodInvocation QualifiedName client channelclosed
assert equals SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName channel
assert equals SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName wait for
assert equals SimpleName MethodInvocation InfixExpression MethodInvocation QualifiedName client channelclosed
assert equals SimpleName MethodInvocation InfixExpression MethodInvocation NumberLiteral empty
assert equals SimpleName MethodInvocation InfixExpression QualifiedName client channelclosed
client channelclosed QualifiedName MethodInvocation InfixExpression MethodInvocation SimpleName channel
client channelclosed QualifiedName MethodInvocation InfixExpression MethodInvocation SimpleName wait for
client channelclosed QualifiedName MethodInvocation InfixExpression MethodInvocation QualifiedName client channelclosed
client channelclosed QualifiedName MethodInvocation InfixExpression MethodInvocation NumberLiteral empty
client channelclosed QualifiedName MethodInvocation InfixExpression QualifiedName client channelclosed
session SimpleName MethodInvocation SimpleName close
session SimpleName MethodInvocation BooleanLiteral false
close SimpleName MethodInvocation BooleanLiteral false
session SimpleName MethodInvocation MethodInvocation SimpleName await
close SimpleName MethodInvocation MethodInvocation SimpleName await
false BooleanLiteral MethodInvocation MethodInvocation SimpleName await
session SimpleName MethodInvocation MethodInvocation NumberLiteral l
close SimpleName MethodInvocation MethodInvocation NumberLiteral l
false BooleanLiteral MethodInvocation MethodInvocation NumberLiteral l
session SimpleName MethodInvocation MethodInvocation QualifiedName time unitseconds
close SimpleName MethodInvocation MethodInvocation QualifiedName time unitseconds
false BooleanLiteral MethodInvocation MethodInvocation QualifiedName time unitseconds
await SimpleName MethodInvocation NumberLiteral l
await SimpleName MethodInvocation QualifiedName time unitseconds
l NumberLiteral MethodInvocation QualifiedName time unitseconds
assert true SimpleName MethodInvocation StringLiteral failed to close session on time
assert true SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName session
assert true SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName close
assert true SimpleName MethodInvocation MethodInvocation MethodInvocation BooleanLiteral false
assert true SimpleName MethodInvocation MethodInvocation SimpleName await
assert true SimpleName MethodInvocation MethodInvocation NumberLiteral l
assert true SimpleName MethodInvocation MethodInvocation QualifiedName time unitseconds
failed to close session on time StringLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName session
failed to close session on time StringLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName close
failed to close session on time StringLiteral MethodInvocation MethodInvocation MethodInvocation BooleanLiteral false
failed to close session on time StringLiteral MethodInvocation MethodInvocation SimpleName await
failed to close session on time StringLiteral MethodInvocation MethodInvocation NumberLiteral l
failed to close session on time StringLiteral MethodInvocation MethodInvocation QualifiedName time unitseconds
client SimpleName MethodInvocation SimpleName stop
client session holder SimpleName MethodInvocation SimpleName get
assert null SimpleName MethodInvocation StringLiteral session closure not signalled
assert null SimpleName MethodInvocation MethodInvocation SimpleName client session holder
assert null SimpleName MethodInvocation MethodInvocation SimpleName get
session closure not signalled StringLiteral MethodInvocation MethodInvocation SimpleName client session holder
session closure not signalled StringLiteral MethodInvocation MethodInvocation SimpleName get
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test command deadlock
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test command deadlock
public Modifier MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration SimpleName test command deadlock
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
test command deadlock SimpleName MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test command deadlock
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test command deadlock
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
