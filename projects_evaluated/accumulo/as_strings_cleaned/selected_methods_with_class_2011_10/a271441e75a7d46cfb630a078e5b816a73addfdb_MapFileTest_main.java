string SimpleName SimpleType ArrayType SingleVariableDeclaration SimpleName args
cached configuration SimpleName MethodInvocation SimpleName get instance
conf SimpleName VariableDeclarationFragment MethodInvocation SimpleName cached configuration
conf SimpleName VariableDeclarationFragment MethodInvocation SimpleName get instance
configuration SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName conf
file system SimpleName MethodInvocation SimpleName get
file system SimpleName MethodInvocation SimpleName conf
get SimpleName MethodInvocation SimpleName conf
fs SimpleName VariableDeclarationFragment MethodInvocation SimpleName file system
fs SimpleName VariableDeclarationFragment MethodInvocation SimpleName get
fs SimpleName VariableDeclarationFragment MethodInvocation SimpleName conf
file system SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName fs
my map filewriter QualifiedName SimpleType ClassInstanceCreation SimpleName conf
my map filewriter QualifiedName SimpleType ClassInstanceCreation SimpleName fs
my map filewriter QualifiedName SimpleType ClassInstanceCreation StringLiteral tmptest map file indexing map
conf SimpleName ClassInstanceCreation SimpleName fs
conf SimpleName ClassInstanceCreation StringLiteral tmptest map file indexing map
conf SimpleName ClassInstanceCreation TypeLiteral SimpleType SimpleName text
conf SimpleName ClassInstanceCreation TypeLiteral SimpleType SimpleName bytes writable
conf SimpleName ClassInstanceCreation QualifiedName compression typeblock
fs SimpleName ClassInstanceCreation StringLiteral tmptest map file indexing map
fs SimpleName ClassInstanceCreation TypeLiteral SimpleType SimpleName text
fs SimpleName ClassInstanceCreation TypeLiteral SimpleType SimpleName bytes writable
fs SimpleName ClassInstanceCreation QualifiedName compression typeblock
tmptest map file indexing map StringLiteral ClassInstanceCreation TypeLiteral SimpleType SimpleName text
tmptest map file indexing map StringLiteral ClassInstanceCreation TypeLiteral SimpleType SimpleName bytes writable
tmptest map file indexing map StringLiteral ClassInstanceCreation QualifiedName compression typeblock
text SimpleName SimpleType TypeLiteral ClassInstanceCreation QualifiedName compression typeblock
bytes writable SimpleName SimpleType TypeLiteral ClassInstanceCreation QualifiedName compression typeblock
mfw SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType QualifiedName my map filewriter
mfw SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName conf
mfw SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName fs
mfw SimpleName VariableDeclarationFragment ClassInstanceCreation StringLiteral tmptest map file indexing map
mfw SimpleName VariableDeclarationFragment ClassInstanceCreation QualifiedName compression typeblock
my map filewriter QualifiedName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName mfw
key SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName text
text SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName key
bytes writable SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName value
r SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName random
random SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName r
byte PrimitiveType ArrayType ArrayCreation NumberLiteral empty
bytes SimpleName VariableDeclarationFragment ArrayCreation ArrayType PrimitiveType byte
bytes SimpleName VariableDeclarationFragment ArrayCreation NumberLiteral empty
byte PrimitiveType ArrayType VariableDeclarationStatement VariableDeclarationFragment SimpleName bytes
array list SimpleName SimpleType ParameterizedType SimpleType SimpleName string
array list SimpleName SimpleType ParameterizedType SimpleType SimpleName string
array list SimpleName SimpleType ParameterizedType SimpleType SimpleName string
array list SimpleName SimpleType ParameterizedType SimpleType SimpleName string
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression NumberLiteral empty
i SimpleName InfixExpression NumberLiteral empty
integer SimpleName MethodInvocation SimpleName to string
integer SimpleName MethodInvocation InfixExpression SimpleName i
integer SimpleName MethodInvocation InfixExpression NumberLiteral empty
to string SimpleName MethodInvocation InfixExpression SimpleName i
to string SimpleName MethodInvocation InfixExpression NumberLiteral empty
key string SimpleName VariableDeclarationFragment MethodInvocation SimpleName integer
key string SimpleName VariableDeclarationFragment MethodInvocation SimpleName to string
key string SimpleName VariableDeclarationFragment MethodInvocation InfixExpression SimpleName i
key string SimpleName VariableDeclarationFragment MethodInvocation InfixExpression NumberLiteral empty
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName key string
keys SimpleName MethodInvocation SimpleName add
keys SimpleName MethodInvocation SimpleName key string
add SimpleName MethodInvocation SimpleName key string
key string SimpleName InfixExpression StringLiteral empty
bad keys SimpleName MethodInvocation SimpleName add
bad keys SimpleName MethodInvocation InfixExpression SimpleName key string
bad keys SimpleName MethodInvocation InfixExpression StringLiteral empty
add SimpleName MethodInvocation InfixExpression SimpleName key string
add SimpleName MethodInvocation InfixExpression StringLiteral empty
key SimpleName MethodInvocation SimpleName set
key SimpleName MethodInvocation SimpleName key string
set SimpleName MethodInvocation SimpleName key string
r SimpleName MethodInvocation SimpleName next bytes
r SimpleName MethodInvocation SimpleName bytes
next bytes SimpleName MethodInvocation SimpleName bytes
bytes writable SimpleName SimpleType ClassInstanceCreation SimpleName bytes
value SimpleName Assignment ClassInstanceCreation SimpleType SimpleName bytes writable
value SimpleName Assignment ClassInstanceCreation SimpleName bytes
mfw SimpleName MethodInvocation SimpleName append
mfw SimpleName MethodInvocation SimpleName key
mfw SimpleName MethodInvocation SimpleName value
append SimpleName MethodInvocation SimpleName key
append SimpleName MethodInvocation SimpleName value
key SimpleName MethodInvocation SimpleName value
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression NumberLiteral empty
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
empty NumberLiteral InfixExpression ForStatement PostfixExpression SimpleName i
mfw SimpleName MethodInvocation SimpleName close
my map filereader QualifiedName SimpleType ClassInstanceCreation SimpleName fs
my map filereader QualifiedName SimpleType ClassInstanceCreation StringLiteral tmptest map file indexing map
my map filereader QualifiedName SimpleType ClassInstanceCreation SimpleName conf
fs SimpleName ClassInstanceCreation StringLiteral tmptest map file indexing map
fs SimpleName ClassInstanceCreation SimpleName conf
tmptest map file indexing map StringLiteral ClassInstanceCreation SimpleName conf
mfr SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType QualifiedName my map filereader
mfr SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName fs
mfr SimpleName VariableDeclarationFragment ClassInstanceCreation StringLiteral tmptest map file indexing map
mfr SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName conf
my map filereader QualifiedName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName mfr
system SimpleName MethodInvocation SimpleName current time millis
t SimpleName VariableDeclarationFragment MethodInvocation SimpleName system
t SimpleName VariableDeclarationFragment MethodInvocation SimpleName current time millis
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName t
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName system
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName current time millis
value SimpleName Assignment ClassInstanceCreation SimpleType SimpleName bytes writable
keys SimpleName MethodInvocation SimpleName get
keys SimpleName MethodInvocation NumberLiteral empty
get SimpleName MethodInvocation NumberLiteral empty
key SimpleName MethodInvocation SimpleName set
key SimpleName MethodInvocation MethodInvocation SimpleName keys
key SimpleName MethodInvocation MethodInvocation SimpleName get
key SimpleName MethodInvocation MethodInvocation NumberLiteral empty
set SimpleName MethodInvocation MethodInvocation SimpleName keys
set SimpleName MethodInvocation MethodInvocation SimpleName get
set SimpleName MethodInvocation MethodInvocation NumberLiteral empty
mfr SimpleName MethodInvocation SimpleName seek
mfr SimpleName MethodInvocation SimpleName key
seek SimpleName MethodInvocation SimpleName key
mfr SimpleName MethodInvocation SimpleName next
mfr SimpleName MethodInvocation SimpleName key
mfr SimpleName MethodInvocation SimpleName value
next SimpleName MethodInvocation SimpleName key
next SimpleName MethodInvocation SimpleName value
key SimpleName MethodInvocation SimpleName value
system SimpleName MethodInvocation SimpleName current time millis
t SimpleName VariableDeclarationFragment MethodInvocation SimpleName system
t SimpleName VariableDeclarationFragment MethodInvocation SimpleName current time millis
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName t
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName system
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName current time millis
t SimpleName InfixExpression SimpleName t
scan time StringLiteral InfixExpression ParenthesizedExpression InfixExpression SimpleName t
scan time StringLiteral InfixExpression ParenthesizedExpression InfixExpression SimpleName t
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation InfixExpression StringLiteral scan time
info SimpleName MethodInvocation InfixExpression StringLiteral scan time
system SimpleName MethodInvocation SimpleName current time millis
t SimpleName Assignment MethodInvocation SimpleName system
t SimpleName Assignment MethodInvocation SimpleName current time millis
key SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName text
text SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName key
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression NumberLiteral empty
i SimpleName Assignment NumberLiteral empty
keys SimpleName MethodInvocation SimpleName get
keys SimpleName MethodInvocation SimpleName i
get SimpleName MethodInvocation SimpleName i
key SimpleName MethodInvocation SimpleName set
key SimpleName MethodInvocation MethodInvocation SimpleName keys
key SimpleName MethodInvocation MethodInvocation SimpleName get
key SimpleName MethodInvocation MethodInvocation SimpleName i
set SimpleName MethodInvocation MethodInvocation SimpleName keys
set SimpleName MethodInvocation MethodInvocation SimpleName get
set SimpleName MethodInvocation MethodInvocation SimpleName i
mfr SimpleName MethodInvocation SimpleName get closest
mfr SimpleName MethodInvocation SimpleName key
mfr SimpleName MethodInvocation SimpleName value
mfr SimpleName MethodInvocation BooleanLiteral false
mfr SimpleName MethodInvocation SimpleName key
get closest SimpleName MethodInvocation SimpleName key
get closest SimpleName MethodInvocation SimpleName value
get closest SimpleName MethodInvocation BooleanLiteral false
get closest SimpleName MethodInvocation SimpleName key
key SimpleName MethodInvocation SimpleName value
key SimpleName MethodInvocation BooleanLiteral false
key SimpleName MethodInvocation SimpleName key
value SimpleName MethodInvocation BooleanLiteral false
value SimpleName MethodInvocation SimpleName key
false BooleanLiteral MethodInvocation SimpleName key
text SimpleName SimpleType CastExpression MethodInvocation SimpleName mfr
text SimpleName SimpleType CastExpression MethodInvocation SimpleName get closest
text SimpleName SimpleType CastExpression MethodInvocation SimpleName key
text SimpleName SimpleType CastExpression MethodInvocation SimpleName value
text SimpleName SimpleType CastExpression MethodInvocation BooleanLiteral false
text SimpleName SimpleType CastExpression MethodInvocation SimpleName key
key SimpleName Assignment CastExpression SimpleType SimpleName text
key SimpleName Assignment CastExpression MethodInvocation SimpleName mfr
key SimpleName Assignment CastExpression MethodInvocation SimpleName get closest
key SimpleName Assignment CastExpression MethodInvocation SimpleName key
key SimpleName Assignment CastExpression MethodInvocation SimpleName value
key SimpleName Assignment CastExpression MethodInvocation BooleanLiteral false
key SimpleName Assignment CastExpression MethodInvocation SimpleName key
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression NumberLiteral empty
int PrimitiveType VariableDeclarationExpression ForStatement Assignment SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement Assignment NumberLiteral empty
i SimpleName InfixExpression ForStatement Assignment SimpleName i
i SimpleName InfixExpression ForStatement Assignment NumberLiteral empty
empty NumberLiteral InfixExpression ForStatement Assignment SimpleName i
empty NumberLiteral InfixExpression ForStatement Assignment NumberLiteral empty
system SimpleName MethodInvocation SimpleName current time millis
t SimpleName Assignment MethodInvocation SimpleName system
t SimpleName Assignment MethodInvocation SimpleName current time millis
t SimpleName InfixExpression SimpleName t
seek time StringLiteral InfixExpression ParenthesizedExpression InfixExpression SimpleName t
seek time StringLiteral InfixExpression ParenthesizedExpression InfixExpression SimpleName t
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation InfixExpression StringLiteral seek time
info SimpleName MethodInvocation InfixExpression StringLiteral seek time
system SimpleName MethodInvocation SimpleName current time millis
t SimpleName Assignment MethodInvocation SimpleName system
t SimpleName Assignment MethodInvocation SimpleName current time millis
value SimpleName Assignment ClassInstanceCreation SimpleType SimpleName bytes writable
keys SimpleName MethodInvocation SimpleName get
keys SimpleName MethodInvocation NumberLiteral empty
get SimpleName MethodInvocation NumberLiteral empty
key SimpleName MethodInvocation SimpleName set
key SimpleName MethodInvocation MethodInvocation SimpleName keys
key SimpleName MethodInvocation MethodInvocation SimpleName get
key SimpleName MethodInvocation MethodInvocation NumberLiteral empty
set SimpleName MethodInvocation MethodInvocation SimpleName keys
set SimpleName MethodInvocation MethodInvocation SimpleName get
set SimpleName MethodInvocation MethodInvocation NumberLiteral empty
mfr SimpleName MethodInvocation SimpleName seek
mfr SimpleName MethodInvocation SimpleName key
seek SimpleName MethodInvocation SimpleName key
mfr SimpleName MethodInvocation SimpleName next
mfr SimpleName MethodInvocation SimpleName key
mfr SimpleName MethodInvocation SimpleName value
next SimpleName MethodInvocation SimpleName key
next SimpleName MethodInvocation SimpleName value
key SimpleName MethodInvocation SimpleName value
system SimpleName MethodInvocation SimpleName current time millis
t SimpleName Assignment MethodInvocation SimpleName system
t SimpleName Assignment MethodInvocation SimpleName current time millis
t SimpleName InfixExpression SimpleName t
scan time StringLiteral InfixExpression ParenthesizedExpression InfixExpression SimpleName t
scan time StringLiteral InfixExpression ParenthesizedExpression InfixExpression SimpleName t
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation InfixExpression StringLiteral scan time
info SimpleName MethodInvocation InfixExpression StringLiteral scan time
system SimpleName MethodInvocation SimpleName current time millis
t SimpleName Assignment MethodInvocation SimpleName system
t SimpleName Assignment MethodInvocation SimpleName current time millis
key SimpleName Assignment ClassInstanceCreation SimpleType SimpleName text
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression NumberLiteral empty
i SimpleName Assignment NumberLiteral empty
keys SimpleName MethodInvocation SimpleName get
keys SimpleName MethodInvocation SimpleName i
get SimpleName MethodInvocation SimpleName i
key SimpleName MethodInvocation SimpleName set
key SimpleName MethodInvocation MethodInvocation SimpleName keys
key SimpleName MethodInvocation MethodInvocation SimpleName get
key SimpleName MethodInvocation MethodInvocation SimpleName i
set SimpleName MethodInvocation MethodInvocation SimpleName keys
set SimpleName MethodInvocation MethodInvocation SimpleName get
set SimpleName MethodInvocation MethodInvocation SimpleName i
mfr SimpleName MethodInvocation SimpleName get closest
mfr SimpleName MethodInvocation SimpleName key
mfr SimpleName MethodInvocation SimpleName value
mfr SimpleName MethodInvocation BooleanLiteral false
mfr SimpleName MethodInvocation SimpleName key
get closest SimpleName MethodInvocation SimpleName key
get closest SimpleName MethodInvocation SimpleName value
get closest SimpleName MethodInvocation BooleanLiteral false
get closest SimpleName MethodInvocation SimpleName key
key SimpleName MethodInvocation SimpleName value
key SimpleName MethodInvocation BooleanLiteral false
key SimpleName MethodInvocation SimpleName key
value SimpleName MethodInvocation BooleanLiteral false
value SimpleName MethodInvocation SimpleName key
false BooleanLiteral MethodInvocation SimpleName key
text SimpleName SimpleType CastExpression MethodInvocation SimpleName mfr
text SimpleName SimpleType CastExpression MethodInvocation SimpleName get closest
text SimpleName SimpleType CastExpression MethodInvocation SimpleName key
text SimpleName SimpleType CastExpression MethodInvocation SimpleName value
text SimpleName SimpleType CastExpression MethodInvocation BooleanLiteral false
text SimpleName SimpleType CastExpression MethodInvocation SimpleName key
key SimpleName Assignment CastExpression SimpleType SimpleName text
key SimpleName Assignment CastExpression MethodInvocation SimpleName mfr
key SimpleName Assignment CastExpression MethodInvocation SimpleName get closest
key SimpleName Assignment CastExpression MethodInvocation SimpleName key
key SimpleName Assignment CastExpression MethodInvocation SimpleName value
key SimpleName Assignment CastExpression MethodInvocation BooleanLiteral false
key SimpleName Assignment CastExpression MethodInvocation SimpleName key
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression NumberLiteral empty
int PrimitiveType VariableDeclarationExpression ForStatement Assignment SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement Assignment NumberLiteral empty
i SimpleName InfixExpression ForStatement Assignment SimpleName i
i SimpleName InfixExpression ForStatement Assignment NumberLiteral empty
empty NumberLiteral InfixExpression ForStatement Assignment SimpleName i
empty NumberLiteral InfixExpression ForStatement Assignment NumberLiteral empty
system SimpleName MethodInvocation SimpleName current time millis
t SimpleName Assignment MethodInvocation SimpleName system
t SimpleName Assignment MethodInvocation SimpleName current time millis
t SimpleName InfixExpression SimpleName t
seek time StringLiteral InfixExpression ParenthesizedExpression InfixExpression SimpleName t
seek time StringLiteral InfixExpression ParenthesizedExpression InfixExpression SimpleName t
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation InfixExpression StringLiteral seek time
info SimpleName MethodInvocation InfixExpression StringLiteral seek time
path SimpleName SimpleType ClassInstanceCreation StringLiteral tmptest map file indexing map
fs SimpleName MethodInvocation SimpleName delete
fs SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName path
fs SimpleName MethodInvocation ClassInstanceCreation StringLiteral tmptest map file indexing map
fs SimpleName MethodInvocation BooleanLiteral true
delete SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName path
delete SimpleName MethodInvocation ClassInstanceCreation StringLiteral tmptest map file indexing map
delete SimpleName MethodInvocation BooleanLiteral true
path SimpleName SimpleType ClassInstanceCreation MethodInvocation BooleanLiteral true
tmptest map file indexing map StringLiteral ClassInstanceCreation MethodInvocation BooleanLiteral true
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType long
io exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
e SimpleName MethodInvocation SimpleName print stack trace
public Modifier MethodDeclaration Modifier static
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName main
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName args
static Modifier MethodDeclaration PrimitiveType void
static Modifier MethodDeclaration SimpleName main
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName args
void PrimitiveType MethodDeclaration SimpleName main
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName args
main SimpleName MethodDeclaration SingleVariableDeclaration SimpleName args
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration Modifier static
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName main
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName args
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration Modifier static
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName main
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName args
