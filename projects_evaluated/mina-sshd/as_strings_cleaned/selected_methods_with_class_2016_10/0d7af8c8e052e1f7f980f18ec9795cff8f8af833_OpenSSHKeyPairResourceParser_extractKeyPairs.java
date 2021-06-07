collection SimpleName SimpleType ParameterizedType SimpleType SimpleName key pair
string SimpleName SimpleType SingleVariableDeclaration SimpleName resource key
string SimpleName SimpleType SingleVariableDeclaration SimpleName begin marker
string SimpleName SimpleType SingleVariableDeclaration SimpleName end marker
file password provider SimpleName SimpleType SingleVariableDeclaration SimpleName password provider
input stream SimpleName SimpleType SingleVariableDeclaration SimpleName stream
validate stream magic marker SimpleName MethodInvocation SimpleName resource key
validate stream magic marker SimpleName MethodInvocation SimpleName stream
resource key SimpleName MethodInvocation SimpleName stream
stream SimpleName Assignment MethodInvocation SimpleName validate stream magic marker
stream SimpleName Assignment MethodInvocation SimpleName resource key
stream SimpleName Assignment MethodInvocation SimpleName stream
key entry resolver SimpleName MethodInvocation SimpleName decode string
key entry resolver SimpleName MethodInvocation SimpleName stream
decode string SimpleName MethodInvocation SimpleName stream
cipher SimpleName VariableDeclarationFragment MethodInvocation SimpleName key entry resolver
cipher SimpleName VariableDeclarationFragment MethodInvocation SimpleName decode string
cipher SimpleName VariableDeclarationFragment MethodInvocation SimpleName stream
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName cipher
open ssh parser contextis none cipher QualifiedName MethodInvocation SimpleName test
open ssh parser contextis none cipher QualifiedName MethodInvocation SimpleName cipher
test SimpleName MethodInvocation SimpleName cipher
unsupported cipher StringLiteral InfixExpression SimpleName cipher
no such algorithm exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral unsupported cipher
no such algorithm exception SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName cipher
log SimpleName MethodInvocation SimpleName is debug enabled
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral extract key pairs cipher
log SimpleName MethodInvocation SimpleName resource key
log SimpleName MethodInvocation SimpleName cipher
debug SimpleName MethodInvocation StringLiteral extract key pairs cipher
debug SimpleName MethodInvocation SimpleName resource key
debug SimpleName MethodInvocation SimpleName cipher
extract key pairs cipher StringLiteral MethodInvocation SimpleName resource key
extract key pairs cipher StringLiteral MethodInvocation SimpleName cipher
resource key SimpleName MethodInvocation SimpleName cipher
key entry resolver SimpleName MethodInvocation SimpleName decode string
key entry resolver SimpleName MethodInvocation SimpleName stream
decode string SimpleName MethodInvocation SimpleName stream
kdf name SimpleName VariableDeclarationFragment MethodInvocation SimpleName key entry resolver
kdf name SimpleName VariableDeclarationFragment MethodInvocation SimpleName decode string
kdf name SimpleName VariableDeclarationFragment MethodInvocation SimpleName stream
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName kdf name
open ssh parser contextis none kdf QualifiedName MethodInvocation SimpleName test
open ssh parser contextis none kdf QualifiedName MethodInvocation SimpleName kdf name
test SimpleName MethodInvocation SimpleName kdf name
unsupported kdf StringLiteral InfixExpression SimpleName kdf name
no such algorithm exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral unsupported kdf
no such algorithm exception SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName kdf name
key entry resolver SimpleName MethodInvocation SimpleName read rle bytes
key entry resolver SimpleName MethodInvocation SimpleName stream
read rle bytes SimpleName MethodInvocation SimpleName stream
kdf options SimpleName VariableDeclarationFragment MethodInvocation SimpleName key entry resolver
kdf options SimpleName VariableDeclarationFragment MethodInvocation SimpleName read rle bytes
kdf options SimpleName VariableDeclarationFragment MethodInvocation SimpleName stream
byte PrimitiveType ArrayType VariableDeclarationStatement VariableDeclarationFragment SimpleName kdf options
log SimpleName MethodInvocation SimpleName is debug enabled
buffer utils SimpleName MethodInvocation SimpleName to hex
buffer utils SimpleName MethodInvocation CharacterLiteral :
buffer utils SimpleName MethodInvocation SimpleName kdf options
to hex SimpleName MethodInvocation CharacterLiteral :
to hex SimpleName MethodInvocation SimpleName kdf options
: CharacterLiteral MethodInvocation SimpleName kdf options
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral extract key pairs kdf options
log SimpleName MethodInvocation SimpleName resource key
log SimpleName MethodInvocation SimpleName kdf name
log SimpleName MethodInvocation MethodInvocation SimpleName buffer utils
log SimpleName MethodInvocation MethodInvocation SimpleName to hex
log SimpleName MethodInvocation MethodInvocation CharacterLiteral :
log SimpleName MethodInvocation MethodInvocation SimpleName kdf options
debug SimpleName MethodInvocation StringLiteral extract key pairs kdf options
debug SimpleName MethodInvocation SimpleName resource key
debug SimpleName MethodInvocation SimpleName kdf name
debug SimpleName MethodInvocation MethodInvocation SimpleName buffer utils
debug SimpleName MethodInvocation MethodInvocation SimpleName to hex
debug SimpleName MethodInvocation MethodInvocation CharacterLiteral :
debug SimpleName MethodInvocation MethodInvocation SimpleName kdf options
extract key pairs kdf options StringLiteral MethodInvocation SimpleName resource key
extract key pairs kdf options StringLiteral MethodInvocation SimpleName kdf name
extract key pairs kdf options StringLiteral MethodInvocation MethodInvocation SimpleName buffer utils
extract key pairs kdf options StringLiteral MethodInvocation MethodInvocation SimpleName to hex
extract key pairs kdf options StringLiteral MethodInvocation MethodInvocation CharacterLiteral :
extract key pairs kdf options StringLiteral MethodInvocation MethodInvocation SimpleName kdf options
resource key SimpleName MethodInvocation SimpleName kdf name
resource key SimpleName MethodInvocation MethodInvocation SimpleName buffer utils
resource key SimpleName MethodInvocation MethodInvocation SimpleName to hex
resource key SimpleName MethodInvocation MethodInvocation CharacterLiteral :
resource key SimpleName MethodInvocation MethodInvocation SimpleName kdf options
kdf name SimpleName MethodInvocation MethodInvocation SimpleName buffer utils
kdf name SimpleName MethodInvocation MethodInvocation SimpleName to hex
kdf name SimpleName MethodInvocation MethodInvocation CharacterLiteral :
kdf name SimpleName MethodInvocation MethodInvocation SimpleName kdf options
key entry resolver SimpleName MethodInvocation SimpleName decode int
key entry resolver SimpleName MethodInvocation SimpleName stream
decode int SimpleName MethodInvocation SimpleName stream
num keys SimpleName VariableDeclarationFragment MethodInvocation SimpleName key entry resolver
num keys SimpleName VariableDeclarationFragment MethodInvocation SimpleName decode int
num keys SimpleName VariableDeclarationFragment MethodInvocation SimpleName stream
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName num keys
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName key entry resolver
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName decode int
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName stream
num keys SimpleName InfixExpression NumberLiteral empty
log SimpleName MethodInvocation SimpleName is debug enabled
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral extract key pairs no encoded keys
log SimpleName MethodInvocation SimpleName resource key
debug SimpleName MethodInvocation StringLiteral extract key pairs no encoded keys
debug SimpleName MethodInvocation SimpleName resource key
extract key pairs no encoded keys StringLiteral MethodInvocation SimpleName resource key
collections SimpleName MethodInvocation SimpleName empty list
list SimpleName SimpleType ParameterizedType SimpleType SimpleName public key
array list SimpleName SimpleType ParameterizedType ClassInstanceCreation SimpleName num keys
public keys SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName num keys
open ssh parser context SimpleName SimpleType ClassInstanceCreation SimpleName cipher
open ssh parser context SimpleName SimpleType ClassInstanceCreation SimpleName kdf name
open ssh parser context SimpleName SimpleType ClassInstanceCreation SimpleName kdf options
cipher SimpleName ClassInstanceCreation SimpleName kdf name
cipher SimpleName ClassInstanceCreation SimpleName kdf options
kdf name SimpleName ClassInstanceCreation SimpleName kdf options
context SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName open ssh parser context
context SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName cipher
context SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName kdf name
context SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName kdf options
open ssh parser context SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName context
log SimpleName MethodInvocation SimpleName is trace enabled
trace enabled SimpleName VariableDeclarationFragment MethodInvocation SimpleName log
trace enabled SimpleName VariableDeclarationFragment MethodInvocation SimpleName is trace enabled
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName trace enabled
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName log
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName is trace enabled
index SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName index
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
index SimpleName InfixExpression SimpleName num keys
read public key SimpleName MethodInvocation SimpleName resource key
read public key SimpleName MethodInvocation SimpleName context
read public key SimpleName MethodInvocation SimpleName stream
resource key SimpleName MethodInvocation SimpleName context
resource key SimpleName MethodInvocation SimpleName stream
context SimpleName MethodInvocation SimpleName stream
pub key SimpleName VariableDeclarationFragment MethodInvocation SimpleName read public key
pub key SimpleName VariableDeclarationFragment MethodInvocation SimpleName resource key
pub key SimpleName VariableDeclarationFragment MethodInvocation SimpleName context
pub key SimpleName VariableDeclarationFragment MethodInvocation SimpleName stream
public key SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName pub key
validate utils SimpleName MethodInvocation SimpleName check not null
validate utils SimpleName MethodInvocation SimpleName pub key
validate utils SimpleName MethodInvocation StringLiteral empty public key d in s
validate utils SimpleName MethodInvocation SimpleName index
validate utils SimpleName MethodInvocation SimpleName resource key
check not null SimpleName MethodInvocation SimpleName pub key
check not null SimpleName MethodInvocation StringLiteral empty public key d in s
check not null SimpleName MethodInvocation SimpleName index
check not null SimpleName MethodInvocation SimpleName resource key
pub key SimpleName MethodInvocation StringLiteral empty public key d in s
pub key SimpleName MethodInvocation SimpleName index
pub key SimpleName MethodInvocation SimpleName resource key
empty public key d in s StringLiteral MethodInvocation SimpleName index
empty public key d in s StringLiteral MethodInvocation SimpleName resource key
index SimpleName MethodInvocation SimpleName resource key
key utils SimpleName MethodInvocation SimpleName get key type
key utils SimpleName MethodInvocation SimpleName pub key
get key type SimpleName MethodInvocation SimpleName pub key
key utils SimpleName MethodInvocation SimpleName get finger print
key utils SimpleName MethodInvocation SimpleName pub key
get finger print SimpleName MethodInvocation SimpleName pub key
log SimpleName MethodInvocation SimpleName trace
log SimpleName MethodInvocation StringLiteral extract key pairs read public key #{}: {} {}
log SimpleName MethodInvocation SimpleName resource key
log SimpleName MethodInvocation SimpleName index
log SimpleName MethodInvocation MethodInvocation SimpleName key utils
log SimpleName MethodInvocation MethodInvocation SimpleName get key type
log SimpleName MethodInvocation MethodInvocation SimpleName pub key
trace SimpleName MethodInvocation StringLiteral extract key pairs read public key #{}: {} {}
trace SimpleName MethodInvocation SimpleName resource key
trace SimpleName MethodInvocation SimpleName index
trace SimpleName MethodInvocation MethodInvocation SimpleName key utils
trace SimpleName MethodInvocation MethodInvocation SimpleName get key type
trace SimpleName MethodInvocation MethodInvocation SimpleName pub key
trace SimpleName MethodInvocation MethodInvocation SimpleName key utils
trace SimpleName MethodInvocation MethodInvocation SimpleName get finger print
trace SimpleName MethodInvocation MethodInvocation SimpleName pub key
extract key pairs read public key #{}: {} {} StringLiteral MethodInvocation SimpleName resource key
extract key pairs read public key #{}: {} {} StringLiteral MethodInvocation SimpleName index
extract key pairs read public key #{}: {} {} StringLiteral MethodInvocation MethodInvocation SimpleName key utils
extract key pairs read public key #{}: {} {} StringLiteral MethodInvocation MethodInvocation SimpleName get key type
extract key pairs read public key #{}: {} {} StringLiteral MethodInvocation MethodInvocation SimpleName pub key
extract key pairs read public key #{}: {} {} StringLiteral MethodInvocation MethodInvocation SimpleName key utils
extract key pairs read public key #{}: {} {} StringLiteral MethodInvocation MethodInvocation SimpleName get finger print
extract key pairs read public key #{}: {} {} StringLiteral MethodInvocation MethodInvocation SimpleName pub key
resource key SimpleName MethodInvocation SimpleName index
resource key SimpleName MethodInvocation MethodInvocation SimpleName key utils
resource key SimpleName MethodInvocation MethodInvocation SimpleName get key type
resource key SimpleName MethodInvocation MethodInvocation SimpleName pub key
resource key SimpleName MethodInvocation MethodInvocation SimpleName key utils
resource key SimpleName MethodInvocation MethodInvocation SimpleName get finger print
resource key SimpleName MethodInvocation MethodInvocation SimpleName pub key
index SimpleName MethodInvocation MethodInvocation SimpleName key utils
index SimpleName MethodInvocation MethodInvocation SimpleName get key type
index SimpleName MethodInvocation MethodInvocation SimpleName pub key
index SimpleName MethodInvocation MethodInvocation SimpleName key utils
index SimpleName MethodInvocation MethodInvocation SimpleName get finger print
index SimpleName MethodInvocation MethodInvocation SimpleName pub key
key utils SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName key utils
key utils SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get finger print
key utils SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName pub key
get key type SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName key utils
get key type SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get finger print
get key type SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName pub key
pub key SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName key utils
pub key SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get finger print
pub key SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName pub key
public keys SimpleName MethodInvocation SimpleName add
public keys SimpleName MethodInvocation SimpleName pub key
add SimpleName MethodInvocation SimpleName pub key
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName index
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName num keys
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName index
index SimpleName InfixExpression ForStatement PostfixExpression SimpleName index
num keys SimpleName InfixExpression ForStatement PostfixExpression SimpleName index
key entry resolver SimpleName MethodInvocation SimpleName read rle bytes
key entry resolver SimpleName MethodInvocation SimpleName stream
read rle bytes SimpleName MethodInvocation SimpleName stream
private data SimpleName VariableDeclarationFragment MethodInvocation SimpleName key entry resolver
private data SimpleName VariableDeclarationFragment MethodInvocation SimpleName read rle bytes
private data SimpleName VariableDeclarationFragment MethodInvocation SimpleName stream
byte PrimitiveType ArrayType VariableDeclarationStatement VariableDeclarationFragment SimpleName private data
byte array input stream SimpleName SimpleType ClassInstanceCreation SimpleName private data
bais SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName byte array input stream
bais SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName private data
input stream SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName bais
read private keys SimpleName MethodInvocation SimpleName resource key
read private keys SimpleName MethodInvocation SimpleName context
read private keys SimpleName MethodInvocation SimpleName public keys
read private keys SimpleName MethodInvocation SimpleName password provider
read private keys SimpleName MethodInvocation SimpleName bais
resource key SimpleName MethodInvocation SimpleName context
resource key SimpleName MethodInvocation SimpleName public keys
resource key SimpleName MethodInvocation SimpleName password provider
resource key SimpleName MethodInvocation SimpleName bais
context SimpleName MethodInvocation SimpleName public keys
context SimpleName MethodInvocation SimpleName password provider
context SimpleName MethodInvocation SimpleName bais
public keys SimpleName MethodInvocation SimpleName password provider
public keys SimpleName MethodInvocation SimpleName bais
password provider SimpleName MethodInvocation SimpleName bais
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType boolean
override SimpleName MarkerAnnotation MethodDeclaration Modifier public
override SimpleName MarkerAnnotation MethodDeclaration SimpleName extract key pairs
override SimpleName MarkerAnnotation MethodDeclaration SingleVariableDeclaration SimpleName resource key
override SimpleName MarkerAnnotation MethodDeclaration SingleVariableDeclaration SimpleName begin marker
public Modifier MethodDeclaration ParameterizedType SimpleType SimpleName collection
public Modifier MethodDeclaration ParameterizedType SimpleType SimpleName key pair
public Modifier MethodDeclaration SimpleName extract key pairs
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName resource key
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName begin marker
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName end marker
collection SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName extract key pairs
key pair SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName extract key pairs
extract key pairs SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
extract key pairs SimpleName MethodDeclaration SingleVariableDeclaration SimpleName resource key
extract key pairs SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
extract key pairs SimpleName MethodDeclaration SingleVariableDeclaration SimpleName begin marker
extract key pairs SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
extract key pairs SimpleName MethodDeclaration SingleVariableDeclaration SimpleName end marker
extract key pairs SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName file password provider
extract key pairs SimpleName MethodDeclaration SingleVariableDeclaration SimpleName password provider
extract key pairs SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName input stream
extract key pairs SimpleName MethodDeclaration SingleVariableDeclaration SimpleName stream
resource key SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName begin marker
resource key SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName end marker
resource key SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName password provider
resource key SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName stream
resource key SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
begin marker SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName end marker
begin marker SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName password provider
begin marker SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName stream
begin marker SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
begin marker SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName general security exception
end marker SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName password provider
end marker SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName stream
end marker SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
end marker SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName general security exception
password provider SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName stream
password provider SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
password provider SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName general security exception
stream SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
stream SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName general security exception
io exception SimpleName SimpleType MethodDeclaration SimpleType SimpleName general security exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName override
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration SimpleName extract key pairs
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName resource key
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName begin marker
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName end marker
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName password provider
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName stream
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName general security exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName override
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration SimpleName extract key pairs
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName resource key
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName begin marker
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName end marker
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName password provider
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName stream
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName general security exception
