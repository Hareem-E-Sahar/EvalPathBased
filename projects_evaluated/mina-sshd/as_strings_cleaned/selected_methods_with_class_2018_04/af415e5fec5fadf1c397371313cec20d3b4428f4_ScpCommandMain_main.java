string SimpleName SimpleType ArrayType SingleVariableDeclaration SimpleName args
stdout SimpleName VariableDeclarationFragment QualifiedName systemout
print stream SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName stdout
print stream SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment QualifiedName systemout
stderr SimpleName VariableDeclarationFragment QualifiedName systemerr
print stream SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName stderr
print stream SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment QualifiedName systemerr
log stream SimpleName VariableDeclarationFragment SimpleName stdout
output stream SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName log stream
output stream SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName stdout
no close input stream SimpleName SimpleType ClassInstanceCreation QualifiedName systemin
charset SimpleName MethodInvocation SimpleName default charset
input stream reader SimpleName SimpleType ClassInstanceCreation ClassInstanceCreation QualifiedName systemin
input stream reader SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName charset
input stream reader SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName default charset
systemin QualifiedName ClassInstanceCreation ClassInstanceCreation MethodInvocation SimpleName charset
systemin QualifiedName ClassInstanceCreation ClassInstanceCreation MethodInvocation SimpleName default charset
stdin SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName buffered reader
buffered reader SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName stdin
normalize command arguments SimpleName MethodInvocation SimpleName stdout
normalize command arguments SimpleName MethodInvocation SimpleName stderr
normalize command arguments SimpleName MethodInvocation SimpleName args
stdout SimpleName MethodInvocation SimpleName stderr
stdout SimpleName MethodInvocation SimpleName args
stderr SimpleName MethodInvocation SimpleName args
args SimpleName Assignment MethodInvocation SimpleName normalize command arguments
args SimpleName Assignment MethodInvocation SimpleName stdout
args SimpleName Assignment MethodInvocation SimpleName stderr
args SimpleName Assignment MethodInvocation SimpleName args
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
num args SimpleName InfixExpression NumberLiteral empty
num args SimpleName InfixExpression NumberLiteral empty
resolve logging verbosity SimpleName MethodInvocation SimpleName args
resolve logging verbosity SimpleName MethodInvocation InfixExpression SimpleName num args
resolve logging verbosity SimpleName MethodInvocation InfixExpression NumberLiteral empty
args SimpleName MethodInvocation InfixExpression SimpleName num args
args SimpleName MethodInvocation InfixExpression NumberLiteral empty
level SimpleName VariableDeclarationFragment MethodInvocation SimpleName resolve logging verbosity
level SimpleName VariableDeclarationFragment MethodInvocation SimpleName args
level SimpleName VariableDeclarationFragment MethodInvocation InfixExpression SimpleName num args
level SimpleName VariableDeclarationFragment MethodInvocation InfixExpression NumberLiteral empty
level SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName level
num args SimpleName InfixExpression NumberLiteral empty
resolve logging target stream SimpleName MethodInvocation SimpleName stdout
resolve logging target stream SimpleName MethodInvocation SimpleName stderr
resolve logging target stream SimpleName MethodInvocation SimpleName args
resolve logging target stream SimpleName MethodInvocation InfixExpression SimpleName num args
resolve logging target stream SimpleName MethodInvocation InfixExpression NumberLiteral empty
stdout SimpleName MethodInvocation SimpleName stderr
stdout SimpleName MethodInvocation SimpleName args
stdout SimpleName MethodInvocation InfixExpression SimpleName num args
stdout SimpleName MethodInvocation InfixExpression NumberLiteral empty
stderr SimpleName MethodInvocation SimpleName args
stderr SimpleName MethodInvocation InfixExpression SimpleName num args
stderr SimpleName MethodInvocation InfixExpression NumberLiteral empty
args SimpleName MethodInvocation InfixExpression SimpleName num args
args SimpleName MethodInvocation InfixExpression NumberLiteral empty
log stream SimpleName Assignment MethodInvocation SimpleName resolve logging target stream
log stream SimpleName Assignment MethodInvocation SimpleName stdout
log stream SimpleName Assignment MethodInvocation SimpleName stderr
log stream SimpleName Assignment MethodInvocation SimpleName args
log stream SimpleName Assignment MethodInvocation InfixExpression SimpleName num args
log stream SimpleName Assignment MethodInvocation InfixExpression NumberLiteral empty
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
resolve scp client creator SimpleName MethodInvocation SimpleName stderr
resolve scp client creator SimpleName MethodInvocation SimpleName args
stderr SimpleName MethodInvocation SimpleName args
creator SimpleName VariableDeclarationFragment MethodInvocation SimpleName resolve scp client creator
creator SimpleName VariableDeclarationFragment MethodInvocation SimpleName stderr
creator SimpleName VariableDeclarationFragment MethodInvocation SimpleName args
scp client creator SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName creator
generic utils SimpleName MethodInvocation SimpleName is empty
generic utils SimpleName MethodInvocation SimpleName args
is empty SimpleName MethodInvocation SimpleName args
setup client session SimpleName MethodInvocation SimpleName scp port option
setup client session SimpleName MethodInvocation SimpleName stdin
setup client session SimpleName MethodInvocation SimpleName stdout
setup client session SimpleName MethodInvocation SimpleName stderr
setup client session SimpleName MethodInvocation SimpleName args
scp port option SimpleName MethodInvocation SimpleName stdin
scp port option SimpleName MethodInvocation SimpleName stdout
scp port option SimpleName MethodInvocation SimpleName stderr
scp port option SimpleName MethodInvocation SimpleName args
stdin SimpleName MethodInvocation SimpleName stdout
stdin SimpleName MethodInvocation SimpleName stderr
stdin SimpleName MethodInvocation SimpleName args
stdout SimpleName MethodInvocation SimpleName stderr
stdout SimpleName MethodInvocation SimpleName args
stderr SimpleName MethodInvocation SimpleName args
session SimpleName VariableDeclarationFragment ConditionalExpression MethodInvocation SimpleName setup client session
session SimpleName VariableDeclarationFragment ConditionalExpression MethodInvocation SimpleName scp port option
session SimpleName VariableDeclarationFragment ConditionalExpression MethodInvocation SimpleName stdin
session SimpleName VariableDeclarationFragment ConditionalExpression MethodInvocation SimpleName stdout
session SimpleName VariableDeclarationFragment ConditionalExpression MethodInvocation SimpleName stderr
session SimpleName VariableDeclarationFragment ConditionalExpression MethodInvocation SimpleName args
client session SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName session
usage scp [ StringLiteral InfixExpression SimpleName scp port option
usage scp [ StringLiteral InfixExpression StringLiteral port i identity io nio minanetty
usage scp [ StringLiteral InfixExpression StringLiteral vvv e logoutput r p q o optionvalue o creatorclass name
usage scp [ StringLiteral InfixExpression StringLiteral c cipherlist m maclist w password c source target
scp port option SimpleName InfixExpression StringLiteral port i identity io nio minanetty
scp port option SimpleName InfixExpression StringLiteral vvv e logoutput r p q o optionvalue o creatorclass name
scp port option SimpleName InfixExpression StringLiteral c cipherlist m maclist w password c source target
port i identity io nio minanetty StringLiteral InfixExpression StringLiteral vvv e logoutput r p q o optionvalue o creatorclass name
port i identity io nio minanetty StringLiteral InfixExpression StringLiteral c cipherlist m maclist w password c source target
vvv e logoutput r p q o optionvalue o creatorclass name StringLiteral InfixExpression StringLiteral c cipherlist m maclist w password c source target
stderr SimpleName MethodInvocation SimpleName println
stderr SimpleName MethodInvocation InfixExpression StringLiteral usage scp [
stderr SimpleName MethodInvocation InfixExpression SimpleName scp port option
stderr SimpleName MethodInvocation InfixExpression StringLiteral port i identity io nio minanetty
stderr SimpleName MethodInvocation InfixExpression StringLiteral vvv e logoutput r p q o optionvalue o creatorclass name
stderr SimpleName MethodInvocation InfixExpression StringLiteral c cipherlist m maclist w password c source target
println SimpleName MethodInvocation InfixExpression StringLiteral usage scp [
println SimpleName MethodInvocation InfixExpression SimpleName scp port option
println SimpleName MethodInvocation InfixExpression StringLiteral port i identity io nio minanetty
println SimpleName MethodInvocation InfixExpression StringLiteral vvv e logoutput r p q o optionvalue o creatorclass name
println SimpleName MethodInvocation InfixExpression StringLiteral c cipherlist m maclist w password c source target
stderr SimpleName MethodInvocation SimpleName println
stderr SimpleName MethodInvocation SimpleName println
stderr SimpleName MethodInvocation StringLiteral where source or target are either userhostfile or a local file path
println SimpleName MethodInvocation StringLiteral where source or target are either userhostfile or a local file path
stderr SimpleName MethodInvocation SimpleName println
stderr SimpleName MethodInvocation StringLiteral note exactly one of the source or target must be remote and the other one local
println SimpleName MethodInvocation StringLiteral note exactly one of the source or target must be remote and the other one local
system SimpleName MethodInvocation SimpleName exit
system SimpleName MethodInvocation PrefixExpression NumberLiteral empty
exit SimpleName MethodInvocation PrefixExpression NumberLiteral empty
collection SimpleName SimpleType ParameterizedType SimpleType SimpleName option
enum set SimpleName MethodInvocation SimpleName none of
enum set SimpleName MethodInvocation TypeLiteral SimpleType SimpleName option
none of SimpleName MethodInvocation TypeLiteral SimpleType SimpleName option
options SimpleName VariableDeclarationFragment MethodInvocation SimpleName enum set
options SimpleName VariableDeclarationFragment MethodInvocation SimpleName none of
quiet SimpleName VariableDeclarationFragment BooleanLiteral false
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName quiet
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment BooleanLiteral false
index SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName index
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
index SimpleName InfixExpression SimpleName num args
args SimpleName ArrayAccess SimpleName index
arg name SimpleName VariableDeclarationFragment ArrayAccess SimpleName args
arg name SimpleName VariableDeclarationFragment ArrayAccess SimpleName index
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName arg name
r StringLiteral MethodInvocation SimpleName equals
r StringLiteral MethodInvocation SimpleName arg name
equals SimpleName MethodInvocation SimpleName arg name
options SimpleName MethodInvocation SimpleName add
options SimpleName MethodInvocation QualifiedName optionrecursive
add SimpleName MethodInvocation QualifiedName optionrecursive
p StringLiteral MethodInvocation SimpleName equals
p StringLiteral MethodInvocation SimpleName arg name
equals SimpleName MethodInvocation SimpleName arg name
options SimpleName MethodInvocation SimpleName add
options SimpleName MethodInvocation QualifiedName optionpreserve attributes
add SimpleName MethodInvocation QualifiedName optionpreserve attributes
q StringLiteral MethodInvocation SimpleName equals
q StringLiteral MethodInvocation SimpleName arg name
equals SimpleName MethodInvocation SimpleName arg name
quiet SimpleName Assignment BooleanLiteral true
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName index
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName num args
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName index
index SimpleName InfixExpression ForStatement PostfixExpression SimpleName index
num args SimpleName InfixExpression ForStatement PostfixExpression SimpleName index
file operation SimpleName SimpleType SingleVariableDeclaration SimpleName op
path SimpleName SimpleType SingleVariableDeclaration SimpleName file
set SimpleName SimpleType ParameterizedType SimpleType SimpleName posix file permission
set SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName perms
posix file permission SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName perms
log event SimpleName MethodInvocation StringLiteral start folder event
log event SimpleName MethodInvocation SimpleName op
log event SimpleName MethodInvocation SimpleName file
log event SimpleName MethodInvocation PrefixExpression NumberLiteral l
log event SimpleName MethodInvocation SimpleName perms
start folder event StringLiteral MethodInvocation SimpleName op
start folder event StringLiteral MethodInvocation SimpleName file
start folder event StringLiteral MethodInvocation PrefixExpression NumberLiteral l
start folder event StringLiteral MethodInvocation SimpleName perms
op SimpleName MethodInvocation SimpleName file
op SimpleName MethodInvocation PrefixExpression NumberLiteral l
op SimpleName MethodInvocation SimpleName perms
file SimpleName MethodInvocation PrefixExpression NumberLiteral l
file SimpleName MethodInvocation SimpleName perms
l NumberLiteral PrefixExpression MethodInvocation SimpleName perms
override SimpleName MarkerAnnotation MethodDeclaration Modifier public
override SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
override SimpleName MarkerAnnotation MethodDeclaration SimpleName start folder event
override SimpleName MarkerAnnotation MethodDeclaration SingleVariableDeclaration SimpleName op
override SimpleName MarkerAnnotation MethodDeclaration SingleVariableDeclaration SimpleName file
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName start folder event
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName file operation
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName op
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName path
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName file
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName perms
void PrimitiveType MethodDeclaration SimpleName start folder event
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName file operation
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName op
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName path
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName file
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName perms
start folder event SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName file operation
start folder event SimpleName MethodDeclaration SingleVariableDeclaration SimpleName op
start folder event SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName path
start folder event SimpleName MethodDeclaration SingleVariableDeclaration SimpleName file
start folder event SimpleName MethodDeclaration SingleVariableDeclaration SimpleName perms
op SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName file
op SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName perms
file SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName perms
file operation SimpleName SimpleType SingleVariableDeclaration SimpleName op
path SimpleName SimpleType SingleVariableDeclaration SimpleName file
set SimpleName SimpleType ParameterizedType SimpleType SimpleName posix file permission
set SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName perms
posix file permission SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName perms
throwable SimpleName SimpleType SingleVariableDeclaration SimpleName thrown
log event SimpleName MethodInvocation StringLiteral end folder event
log event SimpleName MethodInvocation SimpleName op
log event SimpleName MethodInvocation SimpleName file
log event SimpleName MethodInvocation PrefixExpression NumberLiteral l
log event SimpleName MethodInvocation SimpleName perms
end folder event StringLiteral MethodInvocation SimpleName op
end folder event StringLiteral MethodInvocation SimpleName file
end folder event StringLiteral MethodInvocation PrefixExpression NumberLiteral l
end folder event StringLiteral MethodInvocation SimpleName perms
end folder event StringLiteral MethodInvocation SimpleName thrown
op SimpleName MethodInvocation SimpleName file
op SimpleName MethodInvocation PrefixExpression NumberLiteral l
op SimpleName MethodInvocation SimpleName perms
op SimpleName MethodInvocation SimpleName thrown
file SimpleName MethodInvocation PrefixExpression NumberLiteral l
file SimpleName MethodInvocation SimpleName perms
file SimpleName MethodInvocation SimpleName thrown
l NumberLiteral PrefixExpression MethodInvocation SimpleName perms
l NumberLiteral PrefixExpression MethodInvocation SimpleName thrown
perms SimpleName MethodInvocation SimpleName thrown
override SimpleName MarkerAnnotation MethodDeclaration Modifier public
override SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
override SimpleName MarkerAnnotation MethodDeclaration SimpleName end folder event
override SimpleName MarkerAnnotation MethodDeclaration SingleVariableDeclaration SimpleName op
override SimpleName MarkerAnnotation MethodDeclaration SingleVariableDeclaration SimpleName file
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName end folder event
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName file operation
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName op
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName path
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName file
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName perms
void PrimitiveType MethodDeclaration SimpleName end folder event
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName file operation
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName op
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName path
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName file
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName perms
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName throwable
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName thrown
end folder event SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName file operation
end folder event SimpleName MethodDeclaration SingleVariableDeclaration SimpleName op
end folder event SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName path
end folder event SimpleName MethodDeclaration SingleVariableDeclaration SimpleName file
end folder event SimpleName MethodDeclaration SingleVariableDeclaration SimpleName perms
end folder event SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName throwable
end folder event SimpleName MethodDeclaration SingleVariableDeclaration SimpleName thrown
op SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName file
op SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName perms
op SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName thrown
file SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName perms
file SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName thrown
perms SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName thrown
file operation SimpleName SimpleType SingleVariableDeclaration SimpleName op
path SimpleName SimpleType SingleVariableDeclaration SimpleName file
long PrimitiveType SingleVariableDeclaration SimpleName length
set SimpleName SimpleType ParameterizedType SimpleType SimpleName posix file permission
set SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName perms
posix file permission SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName perms
log event SimpleName MethodInvocation StringLiteral start file event
log event SimpleName MethodInvocation SimpleName op
log event SimpleName MethodInvocation SimpleName file
log event SimpleName MethodInvocation SimpleName length
log event SimpleName MethodInvocation SimpleName perms
start file event StringLiteral MethodInvocation SimpleName op
start file event StringLiteral MethodInvocation SimpleName file
start file event StringLiteral MethodInvocation SimpleName length
start file event StringLiteral MethodInvocation SimpleName perms
op SimpleName MethodInvocation SimpleName file
op SimpleName MethodInvocation SimpleName length
op SimpleName MethodInvocation SimpleName perms
file SimpleName MethodInvocation SimpleName length
file SimpleName MethodInvocation SimpleName perms
length SimpleName MethodInvocation SimpleName perms
override SimpleName MarkerAnnotation MethodDeclaration Modifier public
override SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
override SimpleName MarkerAnnotation MethodDeclaration SimpleName start file event
override SimpleName MarkerAnnotation MethodDeclaration SingleVariableDeclaration SimpleName op
override SimpleName MarkerAnnotation MethodDeclaration SingleVariableDeclaration SimpleName file
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName start file event
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName file operation
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName op
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName path
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName file
public Modifier MethodDeclaration SingleVariableDeclaration PrimitiveType long
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName length
void PrimitiveType MethodDeclaration SimpleName start file event
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName file operation
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName op
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName path
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName file
void PrimitiveType MethodDeclaration SingleVariableDeclaration PrimitiveType long
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName length
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName perms
start file event SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName file operation
start file event SimpleName MethodDeclaration SingleVariableDeclaration SimpleName op
start file event SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName path
start file event SimpleName MethodDeclaration SingleVariableDeclaration SimpleName file
start file event SimpleName MethodDeclaration SingleVariableDeclaration PrimitiveType long
start file event SimpleName MethodDeclaration SingleVariableDeclaration SimpleName length
start file event SimpleName MethodDeclaration SingleVariableDeclaration SimpleName perms
op SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName file
op SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType long
op SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName length
op SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName perms
file SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType long
file SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName length
file SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName perms
long PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName perms
length SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName perms
file operation SimpleName SimpleType SingleVariableDeclaration SimpleName op
path SimpleName SimpleType SingleVariableDeclaration SimpleName file
long PrimitiveType SingleVariableDeclaration SimpleName length
set SimpleName SimpleType ParameterizedType SimpleType SimpleName posix file permission
set SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName perms
posix file permission SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName perms
throwable SimpleName SimpleType SingleVariableDeclaration SimpleName thrown
log event SimpleName MethodInvocation StringLiteral end file event
log event SimpleName MethodInvocation SimpleName op
log event SimpleName MethodInvocation SimpleName file
log event SimpleName MethodInvocation SimpleName length
log event SimpleName MethodInvocation SimpleName perms
end file event StringLiteral MethodInvocation SimpleName op
end file event StringLiteral MethodInvocation SimpleName file
end file event StringLiteral MethodInvocation SimpleName length
end file event StringLiteral MethodInvocation SimpleName perms
end file event StringLiteral MethodInvocation SimpleName thrown
op SimpleName MethodInvocation SimpleName file
op SimpleName MethodInvocation SimpleName length
op SimpleName MethodInvocation SimpleName perms
op SimpleName MethodInvocation SimpleName thrown
file SimpleName MethodInvocation SimpleName length
file SimpleName MethodInvocation SimpleName perms
file SimpleName MethodInvocation SimpleName thrown
length SimpleName MethodInvocation SimpleName perms
length SimpleName MethodInvocation SimpleName thrown
perms SimpleName MethodInvocation SimpleName thrown
override SimpleName MarkerAnnotation MethodDeclaration Modifier public
override SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
override SimpleName MarkerAnnotation MethodDeclaration SimpleName end file event
override SimpleName MarkerAnnotation MethodDeclaration SingleVariableDeclaration SimpleName op
override SimpleName MarkerAnnotation MethodDeclaration SingleVariableDeclaration SimpleName file
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName end file event
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName file operation
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName op
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName path
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName file
public Modifier MethodDeclaration SingleVariableDeclaration PrimitiveType long
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName length
void PrimitiveType MethodDeclaration SimpleName end file event
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName file operation
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName op
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName path
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName file
void PrimitiveType MethodDeclaration SingleVariableDeclaration PrimitiveType long
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName length
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName perms
end file event SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName file operation
end file event SimpleName MethodDeclaration SingleVariableDeclaration SimpleName op
end file event SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName path
end file event SimpleName MethodDeclaration SingleVariableDeclaration SimpleName file
end file event SimpleName MethodDeclaration SingleVariableDeclaration PrimitiveType long
end file event SimpleName MethodDeclaration SingleVariableDeclaration SimpleName length
end file event SimpleName MethodDeclaration SingleVariableDeclaration SimpleName perms
end file event SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName throwable
end file event SimpleName MethodDeclaration SingleVariableDeclaration SimpleName thrown
op SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName file
op SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType long
op SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName length
op SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName perms
op SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName thrown
file SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType long
file SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName length
file SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName perms
file SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName thrown
long PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName perms
length SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName perms
long PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName thrown
length SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName thrown
perms SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName thrown
string SimpleName SimpleType SingleVariableDeclaration SimpleName name
file operation SimpleName SimpleType SingleVariableDeclaration SimpleName op
path SimpleName SimpleType SingleVariableDeclaration SimpleName file
long PrimitiveType SingleVariableDeclaration SimpleName length
collection SimpleName SimpleType ParameterizedType SimpleType SimpleName posix file permission
collection SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName perms
posix file permission SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName perms
throwable SimpleName SimpleType SingleVariableDeclaration SimpleName thrown
thrown SimpleName InfixExpression ParenthesizedExpression ConditionalExpression SimpleName stdout
thrown SimpleName InfixExpression ParenthesizedExpression ConditionalExpression SimpleName stderr
stdout SimpleName ConditionalExpression SimpleName stderr
ps SimpleName VariableDeclarationFragment ConditionalExpression SimpleName stdout
ps SimpleName VariableDeclarationFragment ConditionalExpression SimpleName stderr
print stream SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName ps
ps SimpleName MethodInvocation SimpleName append
ps SimpleName MethodInvocation CharacterLiteral t
append SimpleName MethodInvocation CharacterLiteral t
ps SimpleName MethodInvocation MethodInvocation SimpleName append
append SimpleName MethodInvocation MethodInvocation SimpleName append
t CharacterLiteral MethodInvocation MethodInvocation SimpleName append
ps SimpleName MethodInvocation MethodInvocation SimpleName name
append SimpleName MethodInvocation MethodInvocation SimpleName name
t CharacterLiteral MethodInvocation MethodInvocation SimpleName name
append SimpleName MethodInvocation SimpleName name
ps SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName append
append SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName append
t CharacterLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName append
append SimpleName MethodInvocation MethodInvocation SimpleName append
name SimpleName MethodInvocation MethodInvocation SimpleName append
ps SimpleName MethodInvocation MethodInvocation MethodInvocation CharacterLiteral [
append SimpleName MethodInvocation MethodInvocation MethodInvocation CharacterLiteral [
t CharacterLiteral MethodInvocation MethodInvocation MethodInvocation CharacterLiteral [
append SimpleName MethodInvocation MethodInvocation CharacterLiteral [
name SimpleName MethodInvocation MethodInvocation CharacterLiteral [
append SimpleName MethodInvocation CharacterLiteral [
op SimpleName MethodInvocation SimpleName name
append SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName append
name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName append
append SimpleName MethodInvocation MethodInvocation SimpleName append
[ CharacterLiteral MethodInvocation MethodInvocation SimpleName append
append SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName op
append SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName name
[ CharacterLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName op
[ CharacterLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName name
append SimpleName MethodInvocation MethodInvocation SimpleName op
append SimpleName MethodInvocation MethodInvocation SimpleName name
append SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName append
[ CharacterLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName append
append SimpleName MethodInvocation MethodInvocation SimpleName append
op SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName append
name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName append
append SimpleName MethodInvocation MethodInvocation MethodInvocation CharacterLiteral ]
[ CharacterLiteral MethodInvocation MethodInvocation MethodInvocation CharacterLiteral ]
append SimpleName MethodInvocation MethodInvocation CharacterLiteral ]
op SimpleName MethodInvocation MethodInvocation MethodInvocation CharacterLiteral ]
name SimpleName MethodInvocation MethodInvocation MethodInvocation CharacterLiteral ]
append SimpleName MethodInvocation CharacterLiteral ]
append SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName append
append SimpleName MethodInvocation MethodInvocation SimpleName append
] CharacterLiteral MethodInvocation MethodInvocation SimpleName append
append SimpleName MethodInvocation MethodInvocation MethodInvocation CharacterLiteral empty
append SimpleName MethodInvocation MethodInvocation CharacterLiteral empty
] CharacterLiteral MethodInvocation MethodInvocation CharacterLiteral empty
append SimpleName MethodInvocation CharacterLiteral empty
file SimpleName MethodInvocation SimpleName to string
append SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName append
] CharacterLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName append
append SimpleName MethodInvocation MethodInvocation SimpleName append
empty CharacterLiteral MethodInvocation MethodInvocation SimpleName append
append SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName file
append SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to string
empty CharacterLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName file
empty CharacterLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName to string
append SimpleName MethodInvocation MethodInvocation SimpleName file
append SimpleName MethodInvocation MethodInvocation SimpleName to string
length SimpleName InfixExpression NumberLiteral l
ps SimpleName MethodInvocation SimpleName append
ps SimpleName MethodInvocation CharacterLiteral empty
append SimpleName MethodInvocation CharacterLiteral empty
ps SimpleName MethodInvocation MethodInvocation SimpleName append
append SimpleName MethodInvocation MethodInvocation SimpleName append
empty CharacterLiteral MethodInvocation MethodInvocation SimpleName append
ps SimpleName MethodInvocation MethodInvocation StringLiteral length
