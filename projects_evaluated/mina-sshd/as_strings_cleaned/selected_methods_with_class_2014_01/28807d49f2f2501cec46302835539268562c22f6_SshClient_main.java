string SimpleName SimpleType ArrayType SingleVariableDeclaration SimpleName args
port SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName port
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment NumberLiteral empty
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName host
system SimpleName MethodInvocation SimpleName get property
system SimpleName MethodInvocation StringLiteral username
get property SimpleName MethodInvocation StringLiteral username
login SimpleName VariableDeclarationFragment MethodInvocation SimpleName system
login SimpleName VariableDeclarationFragment MethodInvocation SimpleName get property
login SimpleName VariableDeclarationFragment MethodInvocation StringLiteral username
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName login
agent forward SimpleName VariableDeclarationFragment BooleanLiteral false
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName agent forward
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment BooleanLiteral false
list SimpleName SimpleType ParameterizedType SimpleType SimpleName string
log level SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName log level
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment NumberLiteral empty
error SimpleName VariableDeclarationFragment BooleanLiteral false
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName error
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment BooleanLiteral false
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression QualifiedName argslength
args SimpleName ArrayAccess SimpleName i
p StringLiteral MethodInvocation SimpleName equals
p StringLiteral MethodInvocation ArrayAccess SimpleName args
p StringLiteral MethodInvocation ArrayAccess SimpleName i
equals SimpleName MethodInvocation ArrayAccess SimpleName args
equals SimpleName MethodInvocation ArrayAccess SimpleName i
command SimpleName InfixExpression InfixExpression MethodInvocation StringLiteral p
command SimpleName InfixExpression InfixExpression MethodInvocation SimpleName equals
i SimpleName InfixExpression NumberLiteral empty
i SimpleName InfixExpression InfixExpression QualifiedName argslength
empty NumberLiteral InfixExpression InfixExpression QualifiedName argslength
args SimpleName ArrayAccess SimpleName i
option requires an argument StringLiteral InfixExpression ArrayAccess SimpleName args
option requires an argument StringLiteral InfixExpression ArrayAccess SimpleName i
systemerr QualifiedName MethodInvocation SimpleName println
systemerr QualifiedName MethodInvocation InfixExpression StringLiteral option requires an argument
systemerr QualifiedName MethodInvocation InfixExpression ArrayAccess SimpleName args
systemerr QualifiedName MethodInvocation InfixExpression ArrayAccess SimpleName i
println SimpleName MethodInvocation InfixExpression StringLiteral option requires an argument
println SimpleName MethodInvocation InfixExpression ArrayAccess SimpleName args
println SimpleName MethodInvocation InfixExpression ArrayAccess SimpleName i
error SimpleName Assignment BooleanLiteral true
args SimpleName ArrayAccess PrefixExpression SimpleName i
integer SimpleName MethodInvocation SimpleName parse int
integer SimpleName MethodInvocation ArrayAccess SimpleName args
integer SimpleName MethodInvocation ArrayAccess PrefixExpression SimpleName i
parse int SimpleName MethodInvocation ArrayAccess SimpleName args
parse int SimpleName MethodInvocation ArrayAccess PrefixExpression SimpleName i
port SimpleName Assignment MethodInvocation SimpleName integer
port SimpleName Assignment MethodInvocation SimpleName parse int
port SimpleName Assignment MethodInvocation ArrayAccess SimpleName args
args SimpleName ArrayAccess SimpleName i
l StringLiteral MethodInvocation SimpleName equals
l StringLiteral MethodInvocation ArrayAccess SimpleName args
l StringLiteral MethodInvocation ArrayAccess SimpleName i
equals SimpleName MethodInvocation ArrayAccess SimpleName args
equals SimpleName MethodInvocation ArrayAccess SimpleName i
command SimpleName InfixExpression InfixExpression MethodInvocation StringLiteral l
command SimpleName InfixExpression InfixExpression MethodInvocation SimpleName equals
i SimpleName InfixExpression NumberLiteral empty
i SimpleName InfixExpression InfixExpression QualifiedName argslength
empty NumberLiteral InfixExpression InfixExpression QualifiedName argslength
args SimpleName ArrayAccess SimpleName i
option requires an argument StringLiteral InfixExpression ArrayAccess SimpleName args
option requires an argument StringLiteral InfixExpression ArrayAccess SimpleName i
systemerr QualifiedName MethodInvocation SimpleName println
systemerr QualifiedName MethodInvocation InfixExpression StringLiteral option requires an argument
systemerr QualifiedName MethodInvocation InfixExpression ArrayAccess SimpleName args
systemerr QualifiedName MethodInvocation InfixExpression ArrayAccess SimpleName i
println SimpleName MethodInvocation InfixExpression StringLiteral option requires an argument
println SimpleName MethodInvocation InfixExpression ArrayAccess SimpleName args
println SimpleName MethodInvocation InfixExpression ArrayAccess SimpleName i
error SimpleName Assignment BooleanLiteral true
args SimpleName ArrayAccess PrefixExpression SimpleName i
login SimpleName Assignment ArrayAccess SimpleName args
login SimpleName Assignment ArrayAccess PrefixExpression SimpleName i
args SimpleName ArrayAccess SimpleName i
v StringLiteral MethodInvocation SimpleName equals
v StringLiteral MethodInvocation ArrayAccess SimpleName args
v StringLiteral MethodInvocation ArrayAccess SimpleName i
equals SimpleName MethodInvocation ArrayAccess SimpleName args
equals SimpleName MethodInvocation ArrayAccess SimpleName i
command SimpleName InfixExpression InfixExpression MethodInvocation StringLiteral v
command SimpleName InfixExpression InfixExpression MethodInvocation SimpleName equals
log level SimpleName Assignment NumberLiteral empty
args SimpleName ArrayAccess SimpleName i
vv StringLiteral MethodInvocation SimpleName equals
vv StringLiteral MethodInvocation ArrayAccess SimpleName args
vv StringLiteral MethodInvocation ArrayAccess SimpleName i
equals SimpleName MethodInvocation ArrayAccess SimpleName args
equals SimpleName MethodInvocation ArrayAccess SimpleName i
command SimpleName InfixExpression InfixExpression MethodInvocation StringLiteral vv
command SimpleName InfixExpression InfixExpression MethodInvocation SimpleName equals
log level SimpleName Assignment NumberLiteral empty
args SimpleName ArrayAccess SimpleName i
vvv StringLiteral MethodInvocation SimpleName equals
vvv StringLiteral MethodInvocation ArrayAccess SimpleName args
vvv StringLiteral MethodInvocation ArrayAccess SimpleName i
equals SimpleName MethodInvocation ArrayAccess SimpleName args
equals SimpleName MethodInvocation ArrayAccess SimpleName i
command SimpleName InfixExpression InfixExpression MethodInvocation StringLiteral vvv
command SimpleName InfixExpression InfixExpression MethodInvocation SimpleName equals
log level SimpleName Assignment NumberLiteral empty
args SimpleName ArrayAccess SimpleName i
a StringLiteral MethodInvocation SimpleName equals
a StringLiteral MethodInvocation ArrayAccess SimpleName args
a StringLiteral MethodInvocation ArrayAccess SimpleName i
equals SimpleName MethodInvocation ArrayAccess SimpleName args
equals SimpleName MethodInvocation ArrayAccess SimpleName i
agent forward SimpleName Assignment BooleanLiteral true
args SimpleName ArrayAccess SimpleName i
a StringLiteral MethodInvocation SimpleName equals
a StringLiteral MethodInvocation ArrayAccess SimpleName args
a StringLiteral MethodInvocation ArrayAccess SimpleName i
equals SimpleName MethodInvocation ArrayAccess SimpleName args
equals SimpleName MethodInvocation ArrayAccess SimpleName i
agent forward SimpleName Assignment BooleanLiteral false
args SimpleName ArrayAccess SimpleName i
args SimpleName ArrayAccess MethodInvocation SimpleName starts with
i SimpleName ArrayAccess MethodInvocation SimpleName starts with
args SimpleName ArrayAccess MethodInvocation StringLiteral -
i SimpleName ArrayAccess MethodInvocation StringLiteral -
starts with SimpleName MethodInvocation StringLiteral -
command SimpleName InfixExpression InfixExpression MethodInvocation SimpleName starts with
command SimpleName InfixExpression InfixExpression MethodInvocation StringLiteral -
args SimpleName ArrayAccess SimpleName i
illegal option StringLiteral InfixExpression ArrayAccess SimpleName args
illegal option StringLiteral InfixExpression ArrayAccess SimpleName i
systemerr QualifiedName MethodInvocation SimpleName println
systemerr QualifiedName MethodInvocation InfixExpression StringLiteral illegal option
systemerr QualifiedName MethodInvocation InfixExpression ArrayAccess SimpleName args
systemerr QualifiedName MethodInvocation InfixExpression ArrayAccess SimpleName i
println SimpleName MethodInvocation InfixExpression StringLiteral illegal option
println SimpleName MethodInvocation InfixExpression ArrayAccess SimpleName args
println SimpleName MethodInvocation InfixExpression ArrayAccess SimpleName i
error SimpleName Assignment BooleanLiteral true
args SimpleName ArrayAccess SimpleName i
host SimpleName Assignment ArrayAccess SimpleName args
host SimpleName Assignment ArrayAccess SimpleName i
array list SimpleName SimpleType ParameterizedType SimpleType SimpleName string
args SimpleName ArrayAccess SimpleName i
command SimpleName MethodInvocation SimpleName add
command SimpleName MethodInvocation ArrayAccess SimpleName args
command SimpleName MethodInvocation ArrayAccess SimpleName i
add SimpleName MethodInvocation ArrayAccess SimpleName args
add SimpleName MethodInvocation ArrayAccess SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression QualifiedName argslength
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
argslength QualifiedName InfixExpression ForStatement PostfixExpression SimpleName i
systemerr QualifiedName MethodInvocation SimpleName println
systemerr QualifiedName MethodInvocation StringLiteral hostname required
println SimpleName MethodInvocation StringLiteral hostname required
error SimpleName Assignment BooleanLiteral true
systemerr QualifiedName MethodInvocation SimpleName println
systemerr QualifiedName MethodInvocation StringLiteral usage ssh aa vvv l login p port hostname command
println SimpleName MethodInvocation StringLiteral usage ssh aa vvv l login p port hostname command
system SimpleName MethodInvocation SimpleName exit
system SimpleName MethodInvocation PrefixExpression NumberLiteral empty
exit SimpleName MethodInvocation PrefixExpression NumberLiteral empty
ssh client SimpleName MethodInvocation SimpleName set up default client
client SimpleName VariableDeclarationFragment MethodInvocation SimpleName ssh client
client SimpleName VariableDeclarationFragment MethodInvocation SimpleName set up default client
ssh client SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName client
client SimpleName MethodInvocation SimpleName start
has keys SimpleName VariableDeclarationFragment BooleanLiteral false
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName has keys
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment BooleanLiteral false
client SimpleName MethodInvocation SimpleName connect
client SimpleName MethodInvocation SimpleName host
client SimpleName MethodInvocation SimpleName port
connect SimpleName MethodInvocation SimpleName host
connect SimpleName MethodInvocation SimpleName port
host SimpleName MethodInvocation SimpleName port
client SimpleName MethodInvocation MethodInvocation SimpleName await
connect SimpleName MethodInvocation MethodInvocation SimpleName await
host SimpleName MethodInvocation MethodInvocation SimpleName await
port SimpleName MethodInvocation MethodInvocation SimpleName await
client SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get session
connect SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get session
host SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get session
port SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get session
await SimpleName MethodInvocation MethodInvocation SimpleName get session
session SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName await
session SimpleName VariableDeclarationFragment MethodInvocation SimpleName get session
client session SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName session
ret SimpleName VariableDeclarationFragment QualifiedName client sessionwait auth
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName ret
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment QualifiedName client sessionwait auth
auth future SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName auth future
session SimpleName MethodInvocation SimpleName auth agent
session SimpleName MethodInvocation SimpleName login
auth agent SimpleName MethodInvocation SimpleName login
auth future SimpleName Assignment MethodInvocation SimpleName session
auth future SimpleName Assignment MethodInvocation SimpleName auth agent
auth future SimpleName Assignment MethodInvocation SimpleName login
systemout QualifiedName MethodInvocation SimpleName print
systemout QualifiedName MethodInvocation StringLiteral password
print SimpleName MethodInvocation StringLiteral password
input stream reader SimpleName SimpleType ClassInstanceCreation QualifiedName systemin
buffered reader SimpleName SimpleType ClassInstanceCreation ClassInstanceCreation QualifiedName systemin
r SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName buffered reader
r SimpleName VariableDeclarationFragment ClassInstanceCreation ClassInstanceCreation QualifiedName systemin
buffered reader SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName r
r SimpleName MethodInvocation SimpleName read line
password SimpleName VariableDeclarationFragment MethodInvocation SimpleName r
password SimpleName VariableDeclarationFragment MethodInvocation SimpleName read line
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName password
session SimpleName MethodInvocation SimpleName auth password
session SimpleName MethodInvocation SimpleName login
session SimpleName MethodInvocation SimpleName password
auth password SimpleName MethodInvocation SimpleName login
auth password SimpleName MethodInvocation SimpleName password
login SimpleName MethodInvocation SimpleName password
auth future SimpleName Assignment MethodInvocation SimpleName session
auth future SimpleName Assignment MethodInvocation SimpleName auth password
auth future SimpleName Assignment MethodInvocation SimpleName login
auth future SimpleName Assignment MethodInvocation SimpleName password
auth future SimpleName MethodInvocation SimpleName await
auth future SimpleName MethodInvocation SimpleName is failure
auth future SimpleName MethodInvocation SimpleName is success
systemerr QualifiedName MethodInvocation SimpleName println
systemerr QualifiedName MethodInvocation StringLiteral error
println SimpleName MethodInvocation StringLiteral error
system SimpleName MethodInvocation SimpleName exit
system SimpleName MethodInvocation PrefixExpression NumberLiteral empty
exit SimpleName MethodInvocation PrefixExpression NumberLiteral empty
client channel SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName channel
session SimpleName MethodInvocation SimpleName create channel
session SimpleName MethodInvocation QualifiedName client channelchannel shell
create channel SimpleName MethodInvocation QualifiedName client channelchannel shell
channel SimpleName Assignment MethodInvocation SimpleName session
channel SimpleName Assignment MethodInvocation SimpleName create channel
channel SimpleName Assignment MethodInvocation QualifiedName client channelchannel shell
channel shell SimpleName SimpleType CastExpression SimpleName channel
channel SimpleName CastExpression ParenthesizedExpression MethodInvocation SimpleName set agent forwarding
channel SimpleName CastExpression ParenthesizedExpression MethodInvocation SimpleName agent forward
set agent forwarding SimpleName MethodInvocation SimpleName agent forward
no close input stream SimpleName SimpleType ClassInstanceCreation QualifiedName systemin
channel SimpleName MethodInvocation SimpleName set in
channel SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName no close input stream
channel SimpleName MethodInvocation ClassInstanceCreation QualifiedName systemin
set in SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName no close input stream
set in SimpleName MethodInvocation ClassInstanceCreation QualifiedName systemin
session SimpleName MethodInvocation SimpleName create channel
session SimpleName MethodInvocation QualifiedName client channelchannel exec
create channel SimpleName MethodInvocation QualifiedName client channelchannel exec
channel SimpleName Assignment MethodInvocation SimpleName session
channel SimpleName Assignment MethodInvocation SimpleName create channel
channel SimpleName Assignment MethodInvocation QualifiedName client channelchannel exec
baos SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName byte array output stream
byte array output stream SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName baos
output stream writer SimpleName SimpleType ClassInstanceCreation SimpleName baos
w SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName output stream writer
w SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName baos
writer SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName w
string SimpleName SimpleType SingleVariableDeclaration SimpleName cmd
w SimpleName MethodInvocation SimpleName append
w SimpleName MethodInvocation SimpleName cmd
append SimpleName MethodInvocation SimpleName cmd
w SimpleName MethodInvocation MethodInvocation SimpleName append
append SimpleName MethodInvocation MethodInvocation SimpleName append
cmd SimpleName MethodInvocation MethodInvocation SimpleName append
w SimpleName MethodInvocation MethodInvocation StringLiteral empty
append SimpleName MethodInvocation MethodInvocation StringLiteral empty
cmd SimpleName MethodInvocation MethodInvocation StringLiteral empty
append SimpleName MethodInvocation StringLiteral empty
string SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName command
cmd SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName command
w SimpleName MethodInvocation SimpleName append
w SimpleName MethodInvocation StringLiteral empty
append SimpleName MethodInvocation StringLiteral empty
w SimpleName MethodInvocation SimpleName close
baos SimpleName MethodInvocation SimpleName to byte array
byte array input stream SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName baos
byte array input stream SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName to byte array
channel SimpleName MethodInvocation SimpleName set in
channel SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName byte array input stream
channel SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName baos
channel SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName to byte array
set in SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName byte array input stream
set in SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName baos
set in SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName to byte array
no close output stream SimpleName SimpleType ClassInstanceCreation QualifiedName systemout
channel SimpleName MethodInvocation SimpleName set out
channel SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName no close output stream
channel SimpleName MethodInvocation ClassInstanceCreation QualifiedName systemout
set out SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName no close output stream
set out SimpleName MethodInvocation ClassInstanceCreation QualifiedName systemout
no close output stream SimpleName SimpleType ClassInstanceCreation QualifiedName systemerr
channel SimpleName MethodInvocation SimpleName set err
channel SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName no close output stream
channel SimpleName MethodInvocation ClassInstanceCreation QualifiedName systemerr
set err SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName no close output stream
set err SimpleName MethodInvocation ClassInstanceCreation QualifiedName systemerr
channel SimpleName MethodInvocation SimpleName open
channel SimpleName MethodInvocation MethodInvocation SimpleName await
open SimpleName MethodInvocation MethodInvocation SimpleName await
channel SimpleName MethodInvocation SimpleName wait for
channel SimpleName MethodInvocation QualifiedName client channelclosed
channel SimpleName MethodInvocation NumberLiteral empty
wait for SimpleName MethodInvocation QualifiedName client channelclosed
wait for SimpleName MethodInvocation NumberLiteral empty
client channelclosed QualifiedName MethodInvocation NumberLiteral empty
session SimpleName MethodInvocation SimpleName close
session SimpleName MethodInvocation BooleanLiteral false
close SimpleName MethodInvocation BooleanLiteral false
boolean PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
client SimpleName MethodInvocation SimpleName stop
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType boolean
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
boolean PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
boolean PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType boolean
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType boolean
int PrimitiveType VariableDeclarationStatement Block IfStatement SimpleName error
boolean PrimitiveType VariableDeclarationStatement Block IfStatement SimpleName error
public Modifier MethodDeclaration Modifier static
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName main
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName args
public Modifier MethodDeclaration SimpleType SimpleName exception
static Modifier MethodDeclaration PrimitiveType void
static Modifier MethodDeclaration SimpleName main
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName args
static Modifier MethodDeclaration SimpleType SimpleName exception
static Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
static Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType boolean
static Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
static Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType boolean
static Modifier MethodDeclaration Block IfStatement SimpleName error
void PrimitiveType MethodDeclaration SimpleName main
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName args
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType boolean
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType boolean
void PrimitiveType MethodDeclaration Block IfStatement SimpleName error
main SimpleName MethodDeclaration SingleVariableDeclaration SimpleName args
main SimpleName MethodDeclaration SimpleType SimpleName exception
main SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
main SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType boolean
main SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
main SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType boolean
main SimpleName MethodDeclaration Block IfStatement SimpleName error
args SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration Modifier static
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName main
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName args
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration Modifier static
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName main
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName args
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
