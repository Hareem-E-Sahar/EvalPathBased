sshd SimpleName MethodInvocation SimpleName set shell factory
sshd SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName async echo shell factory
set shell factory SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName async echo shell factory
sshd SimpleName MethodInvocation SimpleName get properties
sshd SimpleName MethodInvocation MethodInvocation SimpleName put
get properties SimpleName MethodInvocation MethodInvocation SimpleName put
sshd SimpleName MethodInvocation MethodInvocation QualifiedName factory managerwindow size
get properties SimpleName MethodInvocation MethodInvocation QualifiedName factory managerwindow size
sshd SimpleName MethodInvocation MethodInvocation StringLiteral empty
get properties SimpleName MethodInvocation MethodInvocation StringLiteral empty
put SimpleName MethodInvocation QualifiedName factory managerwindow size
put SimpleName MethodInvocation StringLiteral empty
factory managerwindow size QualifiedName MethodInvocation StringLiteral empty
client SimpleName MethodInvocation SimpleName get properties
client SimpleName MethodInvocation MethodInvocation SimpleName put
get properties SimpleName MethodInvocation MethodInvocation SimpleName put
client SimpleName MethodInvocation MethodInvocation QualifiedName factory managerwindow size
get properties SimpleName MethodInvocation MethodInvocation QualifiedName factory managerwindow size
client SimpleName MethodInvocation MethodInvocation StringLiteral empty
get properties SimpleName MethodInvocation MethodInvocation StringLiteral empty
put SimpleName MethodInvocation QualifiedName factory managerwindow size
put SimpleName MethodInvocation StringLiteral empty
factory managerwindow size QualifiedName MethodInvocation StringLiteral empty
client SimpleName MethodInvocation SimpleName start
client SimpleName MethodInvocation SimpleName connect
client SimpleName MethodInvocation StringLiteral smx
client SimpleName MethodInvocation StringLiteral localhost
client SimpleName MethodInvocation SimpleName port
connect SimpleName MethodInvocation StringLiteral smx
connect SimpleName MethodInvocation StringLiteral localhost
connect SimpleName MethodInvocation SimpleName port
smx StringLiteral MethodInvocation StringLiteral localhost
smx StringLiteral MethodInvocation SimpleName port
localhost StringLiteral MethodInvocation SimpleName port
client SimpleName MethodInvocation MethodInvocation SimpleName await
connect SimpleName MethodInvocation MethodInvocation SimpleName await
smx StringLiteral MethodInvocation MethodInvocation SimpleName await
localhost StringLiteral MethodInvocation MethodInvocation SimpleName await
port SimpleName MethodInvocation MethodInvocation SimpleName await
client SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get session
connect SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get session
smx StringLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName get session
localhost StringLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName get session
port SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get session
await SimpleName MethodInvocation MethodInvocation SimpleName get session
session SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName await
session SimpleName VariableDeclarationFragment MethodInvocation SimpleName get session
client session SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName session
session SimpleName MethodInvocation SimpleName add password identity
session SimpleName MethodInvocation StringLiteral smx
add password identity SimpleName MethodInvocation StringLiteral smx
session SimpleName MethodInvocation SimpleName auth
session SimpleName MethodInvocation MethodInvocation SimpleName verify
auth SimpleName MethodInvocation MethodInvocation SimpleName verify
session SimpleName MethodInvocation SimpleName create shell channel
channel SimpleName VariableDeclarationFragment MethodInvocation SimpleName session
channel SimpleName VariableDeclarationFragment MethodInvocation SimpleName create shell channel
final Modifier VariableDeclarationStatement SimpleType SimpleName channel shell
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName channel
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName session
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName create shell channel
channel shell SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName channel
channel SimpleName MethodInvocation SimpleName open
channel SimpleName MethodInvocation MethodInvocation SimpleName verify
open SimpleName MethodInvocation MethodInvocation SimpleName verify
sshd SimpleName MethodInvocation SimpleName get active sessions
sshd SimpleName MethodInvocation MethodInvocation SimpleName iterator
get active sessions SimpleName MethodInvocation MethodInvocation SimpleName iterator
sshd SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName next
get active sessions SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName next
iterator SimpleName MethodInvocation MethodInvocation SimpleName next
iterator SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get service
next SimpleName MethodInvocation MethodInvocation SimpleName get service
get service SimpleName MethodInvocation TypeLiteral SimpleType SimpleName server connection service
next SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get channels
get service SimpleName MethodInvocation MethodInvocation SimpleName get channels
get service SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName iterator
get channels SimpleName MethodInvocation MethodInvocation SimpleName iterator
get channels SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName next
iterator SimpleName MethodInvocation MethodInvocation SimpleName next
server channel SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName iterator
server channel SimpleName VariableDeclarationFragment MethodInvocation SimpleName next
final Modifier VariableDeclarationStatement SimpleType SimpleName channel
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName server channel
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName next
channel SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName server channel
channel SimpleName MethodInvocation SimpleName get local window
client local SimpleName VariableDeclarationFragment MethodInvocation SimpleName channel
client local SimpleName VariableDeclarationFragment MethodInvocation SimpleName get local window
window SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName client local
channel SimpleName MethodInvocation SimpleName get remote window
client remote SimpleName VariableDeclarationFragment MethodInvocation SimpleName channel
client remote SimpleName VariableDeclarationFragment MethodInvocation SimpleName get remote window
window SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName client remote
server channel SimpleName MethodInvocation SimpleName get local window
server local SimpleName VariableDeclarationFragment MethodInvocation SimpleName server channel
server local SimpleName VariableDeclarationFragment MethodInvocation SimpleName get local window
window SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName server local
server channel SimpleName MethodInvocation SimpleName get remote window
server remote SimpleName VariableDeclarationFragment MethodInvocation SimpleName server channel
server remote SimpleName VariableDeclarationFragment MethodInvocation SimpleName get remote window
window SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName server remote
message SimpleName VariableDeclarationFragment StringLiteral empty
final Modifier VariableDeclarationStatement SimpleType SimpleName string
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName message
final Modifier VariableDeclarationStatement VariableDeclarationFragment StringLiteral empty
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName message
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment StringLiteral empty
nb messages SimpleName VariableDeclarationFragment NumberLiteral empty
final Modifier VariableDeclarationStatement PrimitiveType int
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName nb messages
final Modifier VariableDeclarationStatement VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName nb messages
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment NumberLiteral empty
channel SimpleName MethodInvocation SimpleName get inverted in
output stream writer SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName channel
output stream writer SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get inverted in
writer SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName buffered writer
buffered writer SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName writer
channel SimpleName MethodInvocation SimpleName get inverted out
input stream reader SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName channel
input stream reader SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get inverted out
reader SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName buffered reader
buffered reader SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName reader
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression SimpleName nb messages
writer SimpleName MethodInvocation SimpleName write
writer SimpleName MethodInvocation SimpleName message
write SimpleName MethodInvocation SimpleName message
writer SimpleName MethodInvocation SimpleName write
writer SimpleName MethodInvocation StringLiteral empty
write SimpleName MethodInvocation StringLiteral empty
writer SimpleName MethodInvocation SimpleName flush
wait for window not equals SimpleName MethodInvocation SimpleName client local
wait for window not equals SimpleName MethodInvocation SimpleName server remote
wait for window not equals SimpleName MethodInvocation StringLiteral client local
wait for window not equals SimpleName MethodInvocation StringLiteral server remote
client local SimpleName MethodInvocation SimpleName server remote
client local SimpleName MethodInvocation StringLiteral client local
client local SimpleName MethodInvocation StringLiteral server remote
server remote SimpleName MethodInvocation StringLiteral client local
server remote SimpleName MethodInvocation StringLiteral server remote
client local StringLiteral MethodInvocation StringLiteral server remote
reader SimpleName MethodInvocation SimpleName read line
line SimpleName VariableDeclarationFragment MethodInvocation SimpleName reader
line SimpleName VariableDeclarationFragment MethodInvocation SimpleName read line
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName line
assert equals SimpleName MethodInvocation SimpleName message
assert equals SimpleName MethodInvocation SimpleName line
message SimpleName MethodInvocation SimpleName line
wait for window equals SimpleName MethodInvocation SimpleName client local
wait for window equals SimpleName MethodInvocation SimpleName server remote
wait for window equals SimpleName MethodInvocation StringLiteral client local
wait for window equals SimpleName MethodInvocation StringLiteral server remote
client local SimpleName MethodInvocation SimpleName server remote
client local SimpleName MethodInvocation StringLiteral client local
client local SimpleName MethodInvocation StringLiteral server remote
server remote SimpleName MethodInvocation StringLiteral client local
server remote SimpleName MethodInvocation StringLiteral server remote
client local StringLiteral MethodInvocation StringLiteral server remote
wait for window equals SimpleName MethodInvocation SimpleName client remote
wait for window equals SimpleName MethodInvocation SimpleName server local
wait for window equals SimpleName MethodInvocation StringLiteral client remote
wait for window equals SimpleName MethodInvocation StringLiteral server local
client remote SimpleName MethodInvocation SimpleName server local
client remote SimpleName MethodInvocation StringLiteral client remote
client remote SimpleName MethodInvocation StringLiteral server local
server local SimpleName MethodInvocation StringLiteral client remote
server local SimpleName MethodInvocation StringLiteral server local
client remote StringLiteral MethodInvocation StringLiteral server local
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName nb messages
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
nb messages SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
final Modifier VariableDeclarationStatement Block VariableDeclarationStatement Modifier final
final Modifier VariableDeclarationStatement Block VariableDeclarationStatement Modifier final
final Modifier VariableDeclarationStatement Block VariableDeclarationStatement Modifier final
final Modifier VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test window consumption with inverted streams
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test window consumption with inverted streams
public Modifier MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration Block VariableDeclarationStatement Modifier final
public Modifier MethodDeclaration Block VariableDeclarationStatement Modifier final
public Modifier MethodDeclaration Block VariableDeclarationStatement Modifier final
public Modifier MethodDeclaration Block VariableDeclarationStatement Modifier final
public Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
void PrimitiveType MethodDeclaration SimpleName test window consumption with inverted streams
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement Modifier final
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement Modifier final
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement Modifier final
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement Modifier final
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
test window consumption with inverted streams SimpleName MethodDeclaration SimpleType SimpleName exception
test window consumption with inverted streams SimpleName MethodDeclaration Block VariableDeclarationStatement Modifier final
test window consumption with inverted streams SimpleName MethodDeclaration Block VariableDeclarationStatement Modifier final
test window consumption with inverted streams SimpleName MethodDeclaration Block VariableDeclarationStatement Modifier final
test window consumption with inverted streams SimpleName MethodDeclaration Block VariableDeclarationStatement Modifier final
test window consumption with inverted streams SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test window consumption with inverted streams
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test window consumption with inverted streams
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
