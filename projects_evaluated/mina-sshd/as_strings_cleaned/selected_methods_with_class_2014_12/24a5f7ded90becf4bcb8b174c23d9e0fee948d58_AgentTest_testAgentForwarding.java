security utils SimpleName MethodInvocation SimpleName is bouncy castle registered
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName port
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName port
shell factory SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName test echo shell factory
test echo shell factory SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName shell factory
agent factory SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName proxy agent factory
proxy agent factory SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName agent factory
local agent factory SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName local agent factory
local agent factory SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName local agent factory
create test key pair provider SimpleName MethodInvocation StringLiteral dsaprivkeypem
create test key pair provider SimpleName MethodInvocation MethodInvocation SimpleName load key
dsaprivkeypem StringLiteral MethodInvocation MethodInvocation SimpleName load key
create test key pair provider SimpleName MethodInvocation MethodInvocation QualifiedName key pair providerssh dss
dsaprivkeypem StringLiteral MethodInvocation MethodInvocation QualifiedName key pair providerssh dss
load key SimpleName MethodInvocation QualifiedName key pair providerssh dss
pair SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName create test key pair provider
pair SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation StringLiteral dsaprivkeypem
pair SimpleName VariableDeclarationFragment MethodInvocation SimpleName load key
pair SimpleName VariableDeclarationFragment MethodInvocation QualifiedName key pair providerssh dss
key pair SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName pair
local agent factory SimpleName MethodInvocation SimpleName get agent
local agent factory SimpleName MethodInvocation MethodInvocation SimpleName add identity
get agent SimpleName MethodInvocation MethodInvocation SimpleName add identity
local agent factory SimpleName MethodInvocation MethodInvocation SimpleName pair
get agent SimpleName MethodInvocation MethodInvocation SimpleName pair
local agent factory SimpleName MethodInvocation MethodInvocation StringLiteral smx
get agent SimpleName MethodInvocation MethodInvocation StringLiteral smx
add identity SimpleName MethodInvocation SimpleName pair
add identity SimpleName MethodInvocation StringLiteral smx
pair SimpleName MethodInvocation StringLiteral smx
ssh server SimpleName MethodInvocation SimpleName set up default server
sshd SimpleName VariableDeclarationFragment MethodInvocation SimpleName ssh server
sshd SimpleName VariableDeclarationFragment MethodInvocation SimpleName set up default server
ssh server SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName sshd
utils SimpleName MethodInvocation SimpleName create test host key provider
sshd SimpleName MethodInvocation SimpleName set key pair provider
sshd SimpleName MethodInvocation MethodInvocation SimpleName utils
sshd SimpleName MethodInvocation MethodInvocation SimpleName create test host key provider
set key pair provider SimpleName MethodInvocation MethodInvocation SimpleName utils
set key pair provider SimpleName MethodInvocation MethodInvocation SimpleName create test host key provider
sshd SimpleName MethodInvocation SimpleName set shell factory
sshd SimpleName MethodInvocation SimpleName shell factory
set shell factory SimpleName MethodInvocation SimpleName shell factory
sshd SimpleName MethodInvocation SimpleName set password authenticator
sshd SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName bogus password authenticator
set password authenticator SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName bogus password authenticator
sshd SimpleName MethodInvocation SimpleName set publickey authenticator
sshd SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName bogus publickey authenticator
set publickey authenticator SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName bogus publickey authenticator
sshd SimpleName MethodInvocation SimpleName set agent factory
sshd SimpleName MethodInvocation SimpleName agent factory
set agent factory SimpleName MethodInvocation SimpleName agent factory
sshd SimpleName MethodInvocation SimpleName start
sshd SimpleName MethodInvocation SimpleName get port
port SimpleName Assignment MethodInvocation SimpleName sshd
port SimpleName Assignment MethodInvocation SimpleName get port
ssh server SimpleName MethodInvocation SimpleName set up default server
sshd SimpleName VariableDeclarationFragment MethodInvocation SimpleName ssh server
sshd SimpleName VariableDeclarationFragment MethodInvocation SimpleName set up default server
ssh server SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName sshd
utils SimpleName MethodInvocation SimpleName create test host key provider
sshd SimpleName MethodInvocation SimpleName set key pair provider
sshd SimpleName MethodInvocation MethodInvocation SimpleName utils
sshd SimpleName MethodInvocation MethodInvocation SimpleName create test host key provider
set key pair provider SimpleName MethodInvocation MethodInvocation SimpleName utils
set key pair provider SimpleName MethodInvocation MethodInvocation SimpleName create test host key provider
sshd SimpleName MethodInvocation SimpleName set shell factory
sshd SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName test echo shell factory
set shell factory SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName test echo shell factory
sshd SimpleName MethodInvocation SimpleName set password authenticator
sshd SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName bogus password authenticator
set password authenticator SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName bogus password authenticator
sshd SimpleName MethodInvocation SimpleName set publickey authenticator
sshd SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName bogus publickey authenticator
set publickey authenticator SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName bogus publickey authenticator
sshd SimpleName MethodInvocation SimpleName set agent factory
sshd SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName proxy agent factory
set agent factory SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName proxy agent factory
sshd SimpleName MethodInvocation SimpleName start
sshd SimpleName MethodInvocation SimpleName get port
port SimpleName Assignment MethodInvocation SimpleName sshd
port SimpleName Assignment MethodInvocation SimpleName get port
ssh client SimpleName MethodInvocation SimpleName set up default client
client SimpleName VariableDeclarationFragment MethodInvocation SimpleName ssh client
client SimpleName VariableDeclarationFragment MethodInvocation SimpleName set up default client
ssh client SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName client
client SimpleName MethodInvocation SimpleName set agent factory
client SimpleName MethodInvocation SimpleName local agent factory
set agent factory SimpleName MethodInvocation SimpleName local agent factory
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
session SimpleName MethodInvocation SimpleName auth
session SimpleName MethodInvocation MethodInvocation SimpleName verify
auth SimpleName MethodInvocation MethodInvocation SimpleName verify
session SimpleName MethodInvocation SimpleName create shell channel
channel SimpleName VariableDeclarationFragment MethodInvocation SimpleName session
channel SimpleName VariableDeclarationFragment MethodInvocation SimpleName create shell channel
channel shell SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName channel
out SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName byte array output stream
byte array output stream SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName out
err SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName byte array output stream
byte array output stream SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName err
channel SimpleName MethodInvocation SimpleName set out
channel SimpleName MethodInvocation SimpleName out
set out SimpleName MethodInvocation SimpleName out
channel SimpleName MethodInvocation SimpleName set err
channel SimpleName MethodInvocation SimpleName err
set err SimpleName MethodInvocation SimpleName err
channel SimpleName MethodInvocation SimpleName set agent forwarding
channel SimpleName MethodInvocation BooleanLiteral true
set agent forwarding SimpleName MethodInvocation BooleanLiteral true
channel SimpleName MethodInvocation SimpleName open
channel SimpleName MethodInvocation MethodInvocation SimpleName await
open SimpleName MethodInvocation MethodInvocation SimpleName await
channel SimpleName MethodInvocation SimpleName get inverted in
piped in SimpleName VariableDeclarationFragment MethodInvocation SimpleName channel
piped in SimpleName VariableDeclarationFragment MethodInvocation SimpleName get inverted in
output stream SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName piped in
systemout QualifiedName MethodInvocation SimpleName println
systemout QualifiedName MethodInvocation StringLiteral possibly waiting for remote shell to start
println SimpleName MethodInvocation StringLiteral possibly waiting for remote shell to start
shell factoryshell QualifiedName MethodInvocation SimpleName wait
ssh client SimpleName MethodInvocation SimpleName set up default client
client SimpleName VariableDeclarationFragment MethodInvocation SimpleName ssh client
client SimpleName VariableDeclarationFragment MethodInvocation SimpleName set up default client
ssh client SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName client
client SimpleName MethodInvocation SimpleName set agent factory
client SimpleName MethodInvocation SimpleName agent factory
set agent factory SimpleName MethodInvocation SimpleName agent factory
client SimpleName MethodInvocation SimpleName get properties
shell factoryshell QualifiedName MethodInvocation SimpleName get environment
shell factoryshell QualifiedName MethodInvocation MethodInvocation SimpleName get env
get environment SimpleName MethodInvocation MethodInvocation SimpleName get env
client SimpleName MethodInvocation MethodInvocation SimpleName put all
get properties SimpleName MethodInvocation MethodInvocation SimpleName put all
client SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get env
get properties SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get env
put all SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName shell factoryshell
put all SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get environment
put all SimpleName MethodInvocation MethodInvocation SimpleName get env
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
session SimpleName MethodInvocation SimpleName auth
session SimpleName MethodInvocation MethodInvocation SimpleName verify
auth SimpleName MethodInvocation MethodInvocation SimpleName verify
session SimpleName MethodInvocation SimpleName create shell channel
channel SimpleName VariableDeclarationFragment MethodInvocation SimpleName session
channel SimpleName VariableDeclarationFragment MethodInvocation SimpleName create shell channel
channel shell SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName channel
shell factoryshell QualifiedName MethodInvocation SimpleName get in
channel SimpleName MethodInvocation SimpleName set in
channel SimpleName MethodInvocation MethodInvocation QualifiedName shell factoryshell
channel SimpleName MethodInvocation MethodInvocation SimpleName get in
set in SimpleName MethodInvocation MethodInvocation QualifiedName shell factoryshell
set in SimpleName MethodInvocation MethodInvocation SimpleName get in
shell factoryshell QualifiedName MethodInvocation SimpleName get out
channel SimpleName MethodInvocation SimpleName set out
channel SimpleName MethodInvocation MethodInvocation QualifiedName shell factoryshell
channel SimpleName MethodInvocation MethodInvocation SimpleName get out
set out SimpleName MethodInvocation MethodInvocation QualifiedName shell factoryshell
set out SimpleName MethodInvocation MethodInvocation SimpleName get out
shell factoryshell QualifiedName MethodInvocation SimpleName get err
channel SimpleName MethodInvocation SimpleName set err
channel SimpleName MethodInvocation MethodInvocation QualifiedName shell factoryshell
channel SimpleName MethodInvocation MethodInvocation SimpleName get err
set err SimpleName MethodInvocation MethodInvocation QualifiedName shell factoryshell
set err SimpleName MethodInvocation MethodInvocation SimpleName get err
channel SimpleName MethodInvocation SimpleName set agent forwarding
channel SimpleName MethodInvocation BooleanLiteral true
set agent forwarding SimpleName MethodInvocation BooleanLiteral true
channel SimpleName MethodInvocation SimpleName open
channel SimpleName MethodInvocation MethodInvocation SimpleName await
open SimpleName MethodInvocation MethodInvocation SimpleName await
foo StringLiteral MethodInvocation SimpleName get bytes
piped in SimpleName MethodInvocation SimpleName write
piped in SimpleName MethodInvocation MethodInvocation StringLiteral foo
piped in SimpleName MethodInvocation MethodInvocation SimpleName get bytes
write SimpleName MethodInvocation MethodInvocation StringLiteral foo
write SimpleName MethodInvocation MethodInvocation SimpleName get bytes
piped in SimpleName MethodInvocation SimpleName flush
thread SimpleName MethodInvocation SimpleName sleep
thread SimpleName MethodInvocation NumberLiteral empty
sleep SimpleName MethodInvocation NumberLiteral empty
out SimpleName MethodInvocation SimpleName to string
systemout QualifiedName MethodInvocation SimpleName println
systemout QualifiedName MethodInvocation MethodInvocation SimpleName out
systemout QualifiedName MethodInvocation MethodInvocation SimpleName to string
println SimpleName MethodInvocation MethodInvocation SimpleName out
println SimpleName MethodInvocation MethodInvocation SimpleName to string
err SimpleName MethodInvocation SimpleName to string
systemerr QualifiedName MethodInvocation SimpleName println
systemerr QualifiedName MethodInvocation MethodInvocation SimpleName err
systemerr QualifiedName MethodInvocation MethodInvocation SimpleName to string
println SimpleName MethodInvocation MethodInvocation SimpleName err
println SimpleName MethodInvocation MethodInvocation SimpleName to string
sshd SimpleName MethodInvocation SimpleName stop
sshd SimpleName MethodInvocation BooleanLiteral true
stop SimpleName MethodInvocation BooleanLiteral true
sshd SimpleName MethodInvocation SimpleName stop
sshd SimpleName MethodInvocation BooleanLiteral true
stop SimpleName MethodInvocation BooleanLiteral true
client SimpleName MethodInvocation SimpleName stop
client SimpleName MethodInvocation SimpleName stop
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test agent forwarding
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test agent forwarding
public Modifier MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
public Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
public Modifier MethodDeclaration Block SynchronizedStatement QualifiedName shell factoryshell
void PrimitiveType MethodDeclaration SimpleName test agent forwarding
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
void PrimitiveType MethodDeclaration Block SynchronizedStatement QualifiedName shell factoryshell
test agent forwarding SimpleName MethodDeclaration SimpleType SimpleName exception
test agent forwarding SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
test agent forwarding SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
test agent forwarding SimpleName MethodDeclaration Block SynchronizedStatement QualifiedName shell factoryshell
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test agent forwarding
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test agent forwarding
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
