string SimpleName SimpleType ArrayType SingleVariableDeclaration SimpleName args
stdout SimpleName VariableDeclarationFragment QualifiedName systemout
print stream SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName stdout
print stream SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment QualifiedName systemout
stderr SimpleName VariableDeclarationFragment QualifiedName systemerr
print stream SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName stderr
print stream SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment QualifiedName systemerr
agent forward SimpleName VariableDeclarationFragment BooleanLiteral false
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName agent forward
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment BooleanLiteral false
list SimpleName SimpleType ParameterizedType SimpleType SimpleName string
socks port SimpleName VariableDeclarationFragment PrefixExpression NumberLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName socks port
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment PrefixExpression NumberLiteral empty
generic utils SimpleName MethodInvocation SimpleName length
generic utils SimpleName MethodInvocation SimpleName args
length SimpleName MethodInvocation SimpleName args
num args SimpleName VariableDeclarationFragment MethodInvocation SimpleName generic utils
num args SimpleName VariableDeclarationFragment MethodInvocation SimpleName length
num args SimpleName VariableDeclarationFragment MethodInvocation SimpleName args
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName num args
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName generic utils
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName length
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName args
error SimpleName VariableDeclarationFragment BooleanLiteral false
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName error
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment BooleanLiteral false
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName target
level SimpleName VariableDeclarationFragment QualifiedName levelwarning
level SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName level
level SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment QualifiedName levelwarning
log stream SimpleName VariableDeclarationFragment SimpleName stderr
output stream SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName log stream
output stream SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName stderr
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression SimpleName num args
args SimpleName ArrayAccess SimpleName i
arg name SimpleName VariableDeclarationFragment ArrayAccess SimpleName args
arg name SimpleName VariableDeclarationFragment ArrayAccess SimpleName i
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName arg name
generic utils SimpleName MethodInvocation SimpleName is empty
generic utils SimpleName MethodInvocation SimpleName command
is empty SimpleName MethodInvocation SimpleName command
is argumented option SimpleName MethodInvocation StringLiteral p
is argumented option SimpleName MethodInvocation SimpleName arg name
p StringLiteral MethodInvocation SimpleName arg name
generic utils SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName is argumented option
generic utils SimpleName MethodInvocation InfixExpression MethodInvocation StringLiteral p
generic utils SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName arg name
is empty SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName is argumented option
is empty SimpleName MethodInvocation InfixExpression MethodInvocation StringLiteral p
is empty SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName arg name
command SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName is argumented option
command SimpleName MethodInvocation InfixExpression MethodInvocation StringLiteral p
command SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName arg name
i SimpleName InfixExpression NumberLiteral empty
i SimpleName InfixExpression ParenthesizedExpression InfixExpression SimpleName num args
empty NumberLiteral InfixExpression ParenthesizedExpression InfixExpression SimpleName num args
option requires an argument StringLiteral InfixExpression SimpleName arg name
show error SimpleName MethodInvocation SimpleName stderr
show error SimpleName MethodInvocation InfixExpression StringLiteral option requires an argument
show error SimpleName MethodInvocation InfixExpression SimpleName arg name
stderr SimpleName MethodInvocation InfixExpression StringLiteral option requires an argument
stderr SimpleName MethodInvocation InfixExpression SimpleName arg name
error SimpleName Assignment MethodInvocation SimpleName show error
error SimpleName Assignment MethodInvocation SimpleName stderr
error SimpleName Assignment MethodInvocation InfixExpression StringLiteral option requires an argument
error SimpleName Assignment MethodInvocation InfixExpression SimpleName arg name
generic utils SimpleName MethodInvocation SimpleName is empty
generic utils SimpleName MethodInvocation SimpleName command
is empty SimpleName MethodInvocation SimpleName command
v StringLiteral MethodInvocation SimpleName equals
v StringLiteral MethodInvocation SimpleName arg name
equals SimpleName MethodInvocation SimpleName arg name
vv StringLiteral MethodInvocation SimpleName equals
vv StringLiteral MethodInvocation SimpleName arg name
equals SimpleName MethodInvocation SimpleName arg name
vvv StringLiteral MethodInvocation SimpleName equals
vvv StringLiteral MethodInvocation SimpleName arg name
equals SimpleName MethodInvocation SimpleName arg name
v StringLiteral MethodInvocation InfixExpression MethodInvocation StringLiteral vv
v StringLiteral MethodInvocation InfixExpression MethodInvocation SimpleName equals
v StringLiteral MethodInvocation InfixExpression MethodInvocation SimpleName arg name
equals SimpleName MethodInvocation InfixExpression MethodInvocation StringLiteral vv
equals SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName equals
equals SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName arg name
arg name SimpleName MethodInvocation InfixExpression MethodInvocation StringLiteral vv
arg name SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName equals
arg name SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName arg name
v StringLiteral MethodInvocation InfixExpression MethodInvocation StringLiteral vvv
v StringLiteral MethodInvocation InfixExpression MethodInvocation SimpleName equals
v StringLiteral MethodInvocation InfixExpression MethodInvocation SimpleName arg name
equals SimpleName MethodInvocation InfixExpression MethodInvocation StringLiteral vvv
equals SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName equals
equals SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName arg name
arg name SimpleName MethodInvocation InfixExpression MethodInvocation StringLiteral vvv
arg name SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName equals
arg name SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName arg name
vv StringLiteral MethodInvocation InfixExpression MethodInvocation StringLiteral vvv
vv StringLiteral MethodInvocation InfixExpression MethodInvocation SimpleName equals
vv StringLiteral MethodInvocation InfixExpression MethodInvocation SimpleName arg name
equals SimpleName MethodInvocation InfixExpression MethodInvocation StringLiteral vvv
equals SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName equals
equals SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName arg name
arg name SimpleName MethodInvocation InfixExpression MethodInvocation StringLiteral vvv
arg name SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName equals
arg name SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName arg name
generic utils SimpleName MethodInvocation SimpleName is empty
generic utils SimpleName MethodInvocation SimpleName command
is empty SimpleName MethodInvocation SimpleName command
d StringLiteral MethodInvocation SimpleName equals
d StringLiteral MethodInvocation SimpleName arg name
equals SimpleName MethodInvocation SimpleName arg name
generic utils SimpleName MethodInvocation InfixExpression MethodInvocation StringLiteral d
generic utils SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName equals
generic utils SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName arg name
is empty SimpleName MethodInvocation InfixExpression MethodInvocation StringLiteral d
is empty SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName equals
is empty SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName arg name
command SimpleName MethodInvocation InfixExpression MethodInvocation StringLiteral d
command SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName equals
command SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName arg name
i SimpleName InfixExpression NumberLiteral empty
i SimpleName InfixExpression ParenthesizedExpression InfixExpression SimpleName num args
empty NumberLiteral InfixExpression ParenthesizedExpression InfixExpression SimpleName num args
option requires an argument StringLiteral InfixExpression SimpleName arg name
show error SimpleName MethodInvocation SimpleName stderr
show error SimpleName MethodInvocation InfixExpression StringLiteral option requires an argument
show error SimpleName MethodInvocation InfixExpression SimpleName arg name
stderr SimpleName MethodInvocation InfixExpression StringLiteral option requires an argument
stderr SimpleName MethodInvocation InfixExpression SimpleName arg name
error SimpleName Assignment MethodInvocation SimpleName show error
error SimpleName Assignment MethodInvocation SimpleName stderr
error SimpleName Assignment MethodInvocation InfixExpression StringLiteral option requires an argument
error SimpleName Assignment MethodInvocation InfixExpression SimpleName arg name
socks port SimpleName InfixExpression NumberLiteral empty
arg name SimpleName InfixExpression StringLiteral option value respecified
arg name SimpleName InfixExpression SimpleName socks port
option value respecified StringLiteral InfixExpression SimpleName socks port
show error SimpleName MethodInvocation SimpleName stderr
show error SimpleName MethodInvocation InfixExpression SimpleName arg name
show error SimpleName MethodInvocation InfixExpression StringLiteral option value respecified
show error SimpleName MethodInvocation InfixExpression SimpleName socks port
stderr SimpleName MethodInvocation InfixExpression SimpleName arg name
stderr SimpleName MethodInvocation InfixExpression StringLiteral option value respecified
stderr SimpleName MethodInvocation InfixExpression SimpleName socks port
error SimpleName Assignment MethodInvocation SimpleName show error
error SimpleName Assignment MethodInvocation SimpleName stderr
error SimpleName Assignment MethodInvocation InfixExpression SimpleName arg name
error SimpleName Assignment MethodInvocation InfixExpression StringLiteral option value respecified
error SimpleName Assignment MethodInvocation InfixExpression SimpleName socks port
args SimpleName ArrayAccess PrefixExpression SimpleName i
integer SimpleName MethodInvocation SimpleName parse int
integer SimpleName MethodInvocation ArrayAccess SimpleName args
integer SimpleName MethodInvocation ArrayAccess PrefixExpression SimpleName i
parse int SimpleName MethodInvocation ArrayAccess SimpleName args
parse int SimpleName MethodInvocation ArrayAccess PrefixExpression SimpleName i
socks port SimpleName Assignment MethodInvocation SimpleName integer
socks port SimpleName Assignment MethodInvocation SimpleName parse int
socks port SimpleName Assignment MethodInvocation ArrayAccess SimpleName args
socks port SimpleName InfixExpression NumberLiteral empty
bad option value for StringLiteral InfixExpression SimpleName arg name
bad option value for StringLiteral InfixExpression StringLiteral :
bad option value for StringLiteral InfixExpression SimpleName socks port
arg name SimpleName InfixExpression StringLiteral :
arg name SimpleName InfixExpression SimpleName socks port
: StringLiteral InfixExpression SimpleName socks port
show error SimpleName MethodInvocation SimpleName stderr
show error SimpleName MethodInvocation InfixExpression StringLiteral bad option value for
show error SimpleName MethodInvocation InfixExpression SimpleName arg name
show error SimpleName MethodInvocation InfixExpression StringLiteral :
show error SimpleName MethodInvocation InfixExpression SimpleName socks port
stderr SimpleName MethodInvocation InfixExpression StringLiteral bad option value for
stderr SimpleName MethodInvocation InfixExpression SimpleName arg name
stderr SimpleName MethodInvocation InfixExpression StringLiteral :
stderr SimpleName MethodInvocation InfixExpression SimpleName socks port
error SimpleName Assignment MethodInvocation SimpleName show error
error SimpleName Assignment MethodInvocation SimpleName stderr
error SimpleName Assignment MethodInvocation InfixExpression StringLiteral bad option value for
error SimpleName Assignment MethodInvocation InfixExpression SimpleName arg name
error SimpleName Assignment MethodInvocation InfixExpression StringLiteral :
error SimpleName Assignment MethodInvocation InfixExpression SimpleName socks port
generic utils SimpleName MethodInvocation SimpleName is empty
generic utils SimpleName MethodInvocation SimpleName command
is empty SimpleName MethodInvocation SimpleName command
a StringLiteral MethodInvocation SimpleName equals
a StringLiteral MethodInvocation SimpleName arg name
equals SimpleName MethodInvocation SimpleName arg name
generic utils SimpleName MethodInvocation InfixExpression MethodInvocation StringLiteral a
generic utils SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName equals
generic utils SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName arg name
is empty SimpleName MethodInvocation InfixExpression MethodInvocation StringLiteral a
is empty SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName equals
is empty SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName arg name
command SimpleName MethodInvocation InfixExpression MethodInvocation StringLiteral a
command SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName equals
command SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName arg name
agent forward SimpleName Assignment BooleanLiteral true
generic utils SimpleName MethodInvocation SimpleName is empty
generic utils SimpleName MethodInvocation SimpleName command
is empty SimpleName MethodInvocation SimpleName command
a StringLiteral MethodInvocation SimpleName equals
a StringLiteral MethodInvocation SimpleName arg name
equals SimpleName MethodInvocation SimpleName arg name
generic utils SimpleName MethodInvocation InfixExpression MethodInvocation StringLiteral a
generic utils SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName equals
generic utils SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName arg name
is empty SimpleName MethodInvocation InfixExpression MethodInvocation StringLiteral a
is empty SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName equals
is empty SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName arg name
command SimpleName MethodInvocation InfixExpression MethodInvocation StringLiteral a
command SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName equals
command SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName arg name
agent forward SimpleName Assignment BooleanLiteral false
resolve logging verbosity SimpleName MethodInvocation SimpleName args
resolve logging verbosity SimpleName MethodInvocation SimpleName i
args SimpleName MethodInvocation SimpleName i
level SimpleName Assignment MethodInvocation SimpleName resolve logging verbosity
level SimpleName Assignment MethodInvocation SimpleName args
level SimpleName Assignment MethodInvocation SimpleName i
resolve logging target stream SimpleName MethodInvocation SimpleName stdout
resolve logging target stream SimpleName MethodInvocation SimpleName stderr
resolve logging target stream SimpleName MethodInvocation SimpleName args
resolve logging target stream SimpleName MethodInvocation SimpleName i
stdout SimpleName MethodInvocation SimpleName stderr
stdout SimpleName MethodInvocation SimpleName args
stdout SimpleName MethodInvocation SimpleName i
stderr SimpleName MethodInvocation SimpleName args
stderr SimpleName MethodInvocation SimpleName i
args SimpleName MethodInvocation SimpleName i
log stream SimpleName Assignment MethodInvocation SimpleName resolve logging target stream
log stream SimpleName Assignment MethodInvocation SimpleName stdout
log stream SimpleName Assignment MethodInvocation SimpleName stderr
log stream SimpleName Assignment MethodInvocation SimpleName args
log stream SimpleName Assignment MethodInvocation SimpleName i
error SimpleName Assignment BooleanLiteral true
generic utils SimpleName MethodInvocation SimpleName is empty
generic utils SimpleName MethodInvocation SimpleName command
is empty SimpleName MethodInvocation SimpleName command
generic utils SimpleName MethodInvocation InfixExpression InfixExpression SimpleName target
is empty SimpleName MethodInvocation InfixExpression InfixExpression SimpleName target
command SimpleName MethodInvocation InfixExpression InfixExpression SimpleName target
target SimpleName Assignment SimpleName arg name
command SimpleName MethodInvocation SimpleName add
command SimpleName MethodInvocation SimpleName arg name
add SimpleName MethodInvocation SimpleName arg name
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName num args
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
num args SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
client session SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName session
no close input stream SimpleName SimpleType ClassInstanceCreation QualifiedName systemin
input stream reader SimpleName SimpleType ClassInstanceCreation ClassInstanceCreation QualifiedName systemin
stdin SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName buffered reader
buffered reader SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName stdin
setup logging SimpleName MethodInvocation SimpleName level
setup logging SimpleName MethodInvocation SimpleName stdout
setup logging SimpleName MethodInvocation SimpleName stderr
setup logging SimpleName MethodInvocation SimpleName log stream
level SimpleName MethodInvocation SimpleName stdout
level SimpleName MethodInvocation SimpleName stderr
level SimpleName MethodInvocation SimpleName log stream
stdout SimpleName MethodInvocation SimpleName stderr
stdout SimpleName MethodInvocation SimpleName log stream
stderr SimpleName MethodInvocation SimpleName log stream
setup client session SimpleName MethodInvocation StringLiteral p
setup client session SimpleName MethodInvocation SimpleName stdin
setup client session SimpleName MethodInvocation SimpleName stdout
setup client session SimpleName MethodInvocation SimpleName stderr
setup client session SimpleName MethodInvocation SimpleName args
p StringLiteral MethodInvocation SimpleName stdin
p StringLiteral MethodInvocation SimpleName stdout
p StringLiteral MethodInvocation SimpleName stderr
p StringLiteral MethodInvocation SimpleName args
stdin SimpleName MethodInvocation SimpleName stdout
stdin SimpleName MethodInvocation SimpleName stderr
stdin SimpleName MethodInvocation SimpleName args
stdout SimpleName MethodInvocation SimpleName stderr
stdout SimpleName MethodInvocation SimpleName args
stderr SimpleName MethodInvocation SimpleName args
session SimpleName Assignment MethodInvocation SimpleName setup client session
session SimpleName Assignment MethodInvocation StringLiteral p
session SimpleName Assignment MethodInvocation SimpleName stdin
session SimpleName Assignment MethodInvocation SimpleName stdout
session SimpleName Assignment MethodInvocation SimpleName stderr
session SimpleName Assignment MethodInvocation SimpleName args
error SimpleName Assignment BooleanLiteral true
systemerr QualifiedName MethodInvocation SimpleName println
systemerr QualifiedName MethodInvocation StringLiteral usage ssh aa vvv e logoutput d socks port l login p port o optionvalue w password hostnameuserhost command
println SimpleName MethodInvocation StringLiteral usage ssh aa vvv e logoutput d socks port l login p port o optionvalue w password hostnameuserhost command
system SimpleName MethodInvocation SimpleName exit
system SimpleName MethodInvocation PrefixExpression NumberLiteral empty
exit SimpleName MethodInvocation PrefixExpression NumberLiteral empty
session SimpleName MethodInvocation SimpleName get factory manager
ssh client SimpleName SimpleType CastExpression MethodInvocation SimpleName session
ssh client SimpleName SimpleType CastExpression MethodInvocation SimpleName get factory manager
client SimpleName VariableDeclarationFragment CastExpression SimpleType SimpleName ssh client
client SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName session
client SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName get factory manager
ssh client SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName client
socks port SimpleName InfixExpression NumberLiteral empty
sshd socket address SimpleName SimpleType ClassInstanceCreation QualifiedName sshd socket addresslocalhost name
sshd socket address SimpleName SimpleType ClassInstanceCreation SimpleName socks port
sshd socket addresslocalhost name QualifiedName ClassInstanceCreation SimpleName socks port
session SimpleName MethodInvocation SimpleName start dynamic port forwarding
session SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName sshd socket address
session SimpleName MethodInvocation ClassInstanceCreation QualifiedName sshd socket addresslocalhost name
session SimpleName MethodInvocation ClassInstanceCreation SimpleName socks port
start dynamic port forwarding SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName sshd socket address
start dynamic port forwarding SimpleName MethodInvocation ClassInstanceCreation QualifiedName sshd socket addresslocalhost name
start dynamic port forwarding SimpleName MethodInvocation ClassInstanceCreation SimpleName socks port
thread SimpleName MethodInvocation SimpleName sleep
thread SimpleName MethodInvocation QualifiedName longmax value
sleep SimpleName MethodInvocation QualifiedName longmax value
client channel SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName channel
generic utils SimpleName MethodInvocation SimpleName is empty
generic utils SimpleName MethodInvocation SimpleName command
is empty SimpleName MethodInvocation SimpleName command
session SimpleName MethodInvocation SimpleName create channel
session SimpleName MethodInvocation QualifiedName channelchannel shell
create channel SimpleName MethodInvocation QualifiedName channelchannel shell
channel SimpleName Assignment MethodInvocation SimpleName session
channel SimpleName Assignment MethodInvocation SimpleName create channel
channel SimpleName Assignment MethodInvocation QualifiedName channelchannel shell
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
w SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName string builder
string builder SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName w
string SimpleName SimpleType SingleVariableDeclaration SimpleName cmd
w SimpleName MethodInvocation SimpleName append
w SimpleName MethodInvocation SimpleName cmd
append SimpleName MethodInvocation SimpleName cmd
w SimpleName MethodInvocation MethodInvocation SimpleName append
append SimpleName MethodInvocation MethodInvocation SimpleName append
cmd SimpleName MethodInvocation MethodInvocation SimpleName append
w SimpleName MethodInvocation MethodInvocation CharacterLiteral empty
append SimpleName MethodInvocation MethodInvocation CharacterLiteral empty
cmd SimpleName MethodInvocation MethodInvocation CharacterLiteral empty
append SimpleName MethodInvocation CharacterLiteral empty
string SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName command
cmd SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName command
w SimpleName MethodInvocation SimpleName to string
w SimpleName MethodInvocation MethodInvocation SimpleName trim
to string SimpleName MethodInvocation MethodInvocation SimpleName trim
session SimpleName MethodInvocation SimpleName create channel
session SimpleName MethodInvocation QualifiedName channelchannel exec
session SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName w
session SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to string
session SimpleName MethodInvocation MethodInvocation SimpleName trim
create channel SimpleName MethodInvocation QualifiedName channelchannel exec
create channel SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName w
create channel SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to string
create channel SimpleName MethodInvocation MethodInvocation SimpleName trim
channelchannel exec QualifiedName MethodInvocation MethodInvocation MethodInvocation SimpleName w
channelchannel exec QualifiedName MethodInvocation MethodInvocation MethodInvocation SimpleName to string
channelchannel exec QualifiedName MethodInvocation MethodInvocation SimpleName trim
channel SimpleName Assignment MethodInvocation SimpleName session
channel SimpleName Assignment MethodInvocation SimpleName create channel
channel SimpleName Assignment MethodInvocation QualifiedName channelchannel exec
channel SimpleName Assignment MethodInvocation MethodInvocation SimpleName trim
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
enum set SimpleName MethodInvocation SimpleName of
enum set SimpleName MethodInvocation QualifiedName client channelclient channel eventclosed
of SimpleName MethodInvocation QualifiedName client channelclient channel eventclosed
channel SimpleName MethodInvocation SimpleName wait for
channel SimpleName MethodInvocation MethodInvocation SimpleName enum set
channel SimpleName MethodInvocation MethodInvocation SimpleName of
channel SimpleName MethodInvocation MethodInvocation QualifiedName client channelclient channel eventclosed
channel SimpleName MethodInvocation NumberLiteral empty
wait for SimpleName MethodInvocation MethodInvocation SimpleName enum set
wait for SimpleName MethodInvocation MethodInvocation SimpleName of
wait for SimpleName MethodInvocation MethodInvocation QualifiedName client channelclient channel eventclosed
wait for SimpleName MethodInvocation NumberLiteral empty
enum set SimpleName MethodInvocation MethodInvocation NumberLiteral empty
of SimpleName MethodInvocation MethodInvocation NumberLiteral empty
client channelclient channel eventclosed QualifiedName MethodInvocation MethodInvocation NumberLiteral empty
channel SimpleName MethodInvocation SimpleName close
session SimpleName MethodInvocation SimpleName close
session SimpleName MethodInvocation BooleanLiteral false
close SimpleName MethodInvocation BooleanLiteral false
client SimpleName MethodInvocation SimpleName stop
session SimpleName MethodInvocation SimpleName close
log stream SimpleName InfixExpression SimpleName stdout
log stream SimpleName InfixExpression SimpleName stderr
log stream SimpleName MethodInvocation SimpleName close
boolean PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
boolean PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
boolean PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType boolean
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType boolean
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType boolean
public Modifier MethodDeclaration Modifier static
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName main
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName args
public Modifier MethodDeclaration SimpleType SimpleName exception
static Modifier MethodDeclaration PrimitiveType void
static Modifier MethodDeclaration SimpleName main
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName args
static Modifier MethodDeclaration SimpleType SimpleName exception
static Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType boolean
static Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
static Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
static Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType boolean
void PrimitiveType MethodDeclaration SimpleName main
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName args
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType boolean
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType boolean
main SimpleName MethodDeclaration SingleVariableDeclaration SimpleName args
main SimpleName MethodDeclaration SimpleType SimpleName exception
main SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType boolean
main SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
main SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
main SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType boolean
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
