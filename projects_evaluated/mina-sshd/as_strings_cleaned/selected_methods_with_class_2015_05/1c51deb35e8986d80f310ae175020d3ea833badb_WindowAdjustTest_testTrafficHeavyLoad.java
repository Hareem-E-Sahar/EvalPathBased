empty NumberLiteral InfixExpression NumberLiteral l
timeout SimpleName MemberValuePair InfixExpression NumberLiteral empty
timeout SimpleName MemberValuePair InfixExpression NumberLiteral l
test SimpleName NormalAnnotation MemberValuePair SimpleName timeout
test SimpleName NormalAnnotation MemberValuePair InfixExpression NumberLiteral empty
test SimpleName NormalAnnotation MemberValuePair InfixExpression NumberLiteral l
ssh client SimpleName MethodInvocation SimpleName set up default client
client SimpleName VariableDeclarationFragment MethodInvocation SimpleName ssh client
client SimpleName VariableDeclarationFragment MethodInvocation SimpleName set up default client
ssh client SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName client
client SimpleName MethodInvocation SimpleName start
client SimpleName MethodInvocation SimpleName connect
client SimpleName MethodInvocation StringLiteral admin
client SimpleName MethodInvocation StringLiteral localhost
client SimpleName MethodInvocation SimpleName port
connect SimpleName MethodInvocation StringLiteral admin
connect SimpleName MethodInvocation StringLiteral localhost
connect SimpleName MethodInvocation SimpleName port
admin StringLiteral MethodInvocation StringLiteral localhost
admin StringLiteral MethodInvocation SimpleName port
localhost StringLiteral MethodInvocation SimpleName port
client SimpleName MethodInvocation MethodInvocation SimpleName await
connect SimpleName MethodInvocation MethodInvocation SimpleName await
admin StringLiteral MethodInvocation MethodInvocation SimpleName await
localhost StringLiteral MethodInvocation MethodInvocation SimpleName await
port SimpleName MethodInvocation MethodInvocation SimpleName await
client SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get session
connect SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get session
admin StringLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName get session
localhost StringLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName get session
port SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get session
await SimpleName MethodInvocation MethodInvocation SimpleName get session
session SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName await
session SimpleName VariableDeclarationFragment MethodInvocation SimpleName get session
final Modifier VariableDeclarationExpression SimpleType SimpleName client session
final Modifier VariableDeclarationExpression VariableDeclarationFragment SimpleName session
final Modifier VariableDeclarationExpression VariableDeclarationFragment MethodInvocation SimpleName get session
client session SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName session
session SimpleName MethodInvocation SimpleName add password identity
session SimpleName MethodInvocation StringLiteral admin
add password identity SimpleName MethodInvocation StringLiteral admin
session SimpleName MethodInvocation SimpleName auth
session SimpleName MethodInvocation MethodInvocation SimpleName verify
auth SimpleName MethodInvocation MethodInvocation SimpleName verify
session SimpleName MethodInvocation SimpleName create shell channel
channel SimpleName VariableDeclarationFragment MethodInvocation SimpleName session
channel SimpleName VariableDeclarationFragment MethodInvocation SimpleName create shell channel
final Modifier VariableDeclarationExpression SimpleType SimpleName client channel
final Modifier VariableDeclarationExpression VariableDeclarationFragment SimpleName channel
final Modifier VariableDeclarationExpression VariableDeclarationFragment MethodInvocation SimpleName session
final Modifier VariableDeclarationExpression VariableDeclarationFragment MethodInvocation SimpleName create shell channel
client channel SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName channel
verifying output stream SimpleName SimpleType ClassInstanceCreation SimpleName channel
verifying output stream SimpleName SimpleType ClassInstanceCreation SimpleName end file
channel SimpleName ClassInstanceCreation SimpleName end file
channel SimpleName MethodInvocation SimpleName set out
channel SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName verifying output stream
channel SimpleName MethodInvocation ClassInstanceCreation SimpleName channel
channel SimpleName MethodInvocation ClassInstanceCreation SimpleName end file
set out SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName verifying output stream
set out SimpleName MethodInvocation ClassInstanceCreation SimpleName channel
set out SimpleName MethodInvocation ClassInstanceCreation SimpleName end file
no close output stream SimpleName SimpleType ClassInstanceCreation QualifiedName systemerr
channel SimpleName MethodInvocation SimpleName set err
channel SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName no close output stream
channel SimpleName MethodInvocation ClassInstanceCreation QualifiedName systemerr
set err SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName no close output stream
set err SimpleName MethodInvocation ClassInstanceCreation QualifiedName systemerr
channel SimpleName MethodInvocation SimpleName open
channel SimpleName MethodInvocation SimpleName wait for
channel SimpleName MethodInvocation QualifiedName client channelclosed
channel SimpleName MethodInvocation NumberLiteral empty
wait for SimpleName MethodInvocation QualifiedName client channelclosed
wait for SimpleName MethodInvocation NumberLiteral empty
client channelclosed QualifiedName MethodInvocation NumberLiteral empty
session SimpleName MethodInvocation SimpleName close
session SimpleName MethodInvocation BooleanLiteral true
close SimpleName MethodInvocation BooleanLiteral true
client SimpleName MethodInvocation SimpleName stop
test SimpleName NormalAnnotation MethodDeclaration Modifier public
timeout SimpleName MemberValuePair NormalAnnotation MethodDeclaration Modifier public
test SimpleName NormalAnnotation MethodDeclaration PrimitiveType void
timeout SimpleName MemberValuePair NormalAnnotation MethodDeclaration PrimitiveType void
test SimpleName NormalAnnotation MethodDeclaration SimpleName test traffic heavy load
timeout SimpleName MemberValuePair NormalAnnotation MethodDeclaration SimpleName test traffic heavy load
test SimpleName NormalAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test traffic heavy load
public Modifier MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration SimpleName test traffic heavy load
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
test traffic heavy load SimpleName MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration NormalAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test traffic heavy load
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration NormalAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test traffic heavy load
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
