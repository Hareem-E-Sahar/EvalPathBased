hive meta store bridge SimpleName SimpleType SingleVariableDeclaration SimpleName dgi bridge
hive event SimpleName SimpleType SingleVariableDeclaration SimpleName event
set SimpleName SimpleType ParameterizedType SimpleType SimpleName read entity
inputs SimpleName VariableDeclarationFragment QualifiedName eventinputs
set SimpleName SimpleType ParameterizedType SimpleType SimpleName write entity
outputs SimpleName VariableDeclarationFragment QualifiedName eventoutputs
inputs SimpleName MethodInvocation SimpleName is empty
outputs SimpleName MethodInvocation SimpleName is empty
inputs SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName outputs
inputs SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName is empty
is empty SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName outputs
is empty SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName is empty
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation StringLiteral explain statement skipping
info SimpleName MethodInvocation StringLiteral explain statement skipping
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation StringLiteral query plan is missing skipping
info SimpleName MethodInvocation StringLiteral query plan is missing skipping
eventquery plan QualifiedName MethodInvocation SimpleName get query id
query id SimpleName VariableDeclarationFragment MethodInvocation QualifiedName eventquery plan
query id SimpleName VariableDeclarationFragment MethodInvocation SimpleName get query id
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName query id
eventquery plan QualifiedName MethodInvocation SimpleName get query str
normalize SimpleName MethodInvocation MethodInvocation QualifiedName eventquery plan
normalize SimpleName MethodInvocation MethodInvocation SimpleName get query str
query str SimpleName VariableDeclarationFragment MethodInvocation SimpleName normalize
query str SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation QualifiedName eventquery plan
query str SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get query str
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName query str
eventquery plan QualifiedName MethodInvocation SimpleName get query start time
query start time SimpleName VariableDeclarationFragment MethodInvocation QualifiedName eventquery plan
query start time SimpleName VariableDeclarationFragment MethodInvocation SimpleName get query start time
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName query start time
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation QualifiedName eventquery plan
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get query start time
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral registering query {}
log SimpleName MethodInvocation SimpleName query str
debug SimpleName MethodInvocation StringLiteral registering query {}
debug SimpleName MethodInvocation SimpleName query str
registering query {} StringLiteral MethodInvocation SimpleName query str
list SimpleName SimpleType ParameterizedType SimpleType SimpleName referenceable
hive data typeshive process QualifiedName MethodInvocation SimpleName get name
referenceable SimpleName SimpleType ClassInstanceCreation MethodInvocation QualifiedName hive data typeshive process
referenceable SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get name
process referenceable SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName referenceable
process referenceable SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation QualifiedName hive data typeshive process
process referenceable SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName get name
referenceable SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName process referenceable
process referenceable SimpleName MethodInvocation SimpleName set
process referenceable SimpleName MethodInvocation StringLiteral name
process referenceable SimpleName MethodInvocation SimpleName query str
set SimpleName MethodInvocation StringLiteral name
set SimpleName MethodInvocation SimpleName query str
name StringLiteral MethodInvocation SimpleName query str
eventoperation QualifiedName MethodInvocation SimpleName get operation name
process referenceable SimpleName MethodInvocation SimpleName set
process referenceable SimpleName MethodInvocation StringLiteral operation type
process referenceable SimpleName MethodInvocation MethodInvocation QualifiedName eventoperation
process referenceable SimpleName MethodInvocation MethodInvocation SimpleName get operation name
set SimpleName MethodInvocation StringLiteral operation type
set SimpleName MethodInvocation MethodInvocation QualifiedName eventoperation
set SimpleName MethodInvocation MethodInvocation SimpleName get operation name
operation type StringLiteral MethodInvocation MethodInvocation QualifiedName eventoperation
operation type StringLiteral MethodInvocation MethodInvocation SimpleName get operation name
process referenceable SimpleName MethodInvocation SimpleName set
process referenceable SimpleName MethodInvocation StringLiteral start time
process referenceable SimpleName MethodInvocation SimpleName query start time
set SimpleName MethodInvocation StringLiteral start time
set SimpleName MethodInvocation SimpleName query start time
start time StringLiteral MethodInvocation SimpleName query start time
process referenceable SimpleName MethodInvocation SimpleName set
process referenceable SimpleName MethodInvocation StringLiteral user name
process referenceable SimpleName MethodInvocation QualifiedName eventuser
set SimpleName MethodInvocation StringLiteral user name
set SimpleName MethodInvocation QualifiedName eventuser
user name StringLiteral MethodInvocation QualifiedName eventuser
list SimpleName SimpleType ParameterizedType SimpleType SimpleName referenceable
read entity SimpleName SimpleType SingleVariableDeclaration SimpleName read entity
read entity SimpleName MethodInvocation SimpleName get type
read entity SimpleName MethodInvocation InfixExpression QualifiedName typetable
get type SimpleName MethodInvocation InfixExpression QualifiedName typetable
read entity SimpleName MethodInvocation SimpleName get type
read entity SimpleName MethodInvocation InfixExpression QualifiedName typepartition
get type SimpleName MethodInvocation InfixExpression QualifiedName typepartition
typetable QualifiedName InfixExpression InfixExpression InfixExpression QualifiedName typepartition
map SimpleName SimpleType ParameterizedType SimpleType SimpleName type
map SimpleName SimpleType ParameterizedType SimpleType SimpleName referenceable
type SimpleName SimpleType ParameterizedType SimpleType SimpleName referenceable
create entities SimpleName MethodInvocation SimpleName dgi bridge
create entities SimpleName MethodInvocation SimpleName read entity
dgi bridge SimpleName MethodInvocation SimpleName read entity
local entities SimpleName VariableDeclarationFragment MethodInvocation SimpleName create entities
local entities SimpleName VariableDeclarationFragment MethodInvocation SimpleName dgi bridge
local entities SimpleName VariableDeclarationFragment MethodInvocation SimpleName read entity
local entities SimpleName MethodInvocation SimpleName get
local entities SimpleName MethodInvocation QualifiedName typetable
get SimpleName MethodInvocation QualifiedName typetable
source SimpleName MethodInvocation SimpleName add
source SimpleName MethodInvocation MethodInvocation SimpleName local entities
source SimpleName MethodInvocation MethodInvocation SimpleName get
source SimpleName MethodInvocation MethodInvocation QualifiedName typetable
add SimpleName MethodInvocation MethodInvocation SimpleName local entities
add SimpleName MethodInvocation MethodInvocation SimpleName get
add SimpleName MethodInvocation MethodInvocation QualifiedName typetable
local entities SimpleName MethodInvocation SimpleName values
entities SimpleName MethodInvocation SimpleName add all
entities SimpleName MethodInvocation MethodInvocation SimpleName local entities
entities SimpleName MethodInvocation MethodInvocation SimpleName values
add all SimpleName MethodInvocation MethodInvocation SimpleName local entities
add all SimpleName MethodInvocation MethodInvocation SimpleName values
read entity SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName inputs
read entity SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName inputs
process referenceable SimpleName MethodInvocation SimpleName set
process referenceable SimpleName MethodInvocation StringLiteral inputs
process referenceable SimpleName MethodInvocation SimpleName source
set SimpleName MethodInvocation StringLiteral inputs
set SimpleName MethodInvocation SimpleName source
inputs StringLiteral MethodInvocation SimpleName source
list SimpleName SimpleType ParameterizedType SimpleType SimpleName referenceable
write entity SimpleName SimpleType SingleVariableDeclaration SimpleName write entity
write entity SimpleName MethodInvocation SimpleName get type
write entity SimpleName MethodInvocation InfixExpression QualifiedName typetable
get type SimpleName MethodInvocation InfixExpression QualifiedName typetable
write entity SimpleName MethodInvocation SimpleName get type
write entity SimpleName MethodInvocation InfixExpression QualifiedName typepartition
get type SimpleName MethodInvocation InfixExpression QualifiedName typepartition
typetable QualifiedName InfixExpression InfixExpression InfixExpression QualifiedName typepartition
map SimpleName SimpleType ParameterizedType SimpleType SimpleName type
map SimpleName SimpleType ParameterizedType SimpleType SimpleName referenceable
type SimpleName SimpleType ParameterizedType SimpleType SimpleName referenceable
create entities SimpleName MethodInvocation SimpleName dgi bridge
create entities SimpleName MethodInvocation SimpleName write entity
dgi bridge SimpleName MethodInvocation SimpleName write entity
local entities SimpleName VariableDeclarationFragment MethodInvocation SimpleName create entities
local entities SimpleName VariableDeclarationFragment MethodInvocation SimpleName dgi bridge
local entities SimpleName VariableDeclarationFragment MethodInvocation SimpleName write entity
local entities SimpleName MethodInvocation SimpleName get
local entities SimpleName MethodInvocation QualifiedName typetable
get SimpleName MethodInvocation QualifiedName typetable
target SimpleName MethodInvocation SimpleName add
target SimpleName MethodInvocation MethodInvocation SimpleName local entities
target SimpleName MethodInvocation MethodInvocation SimpleName get
target SimpleName MethodInvocation MethodInvocation QualifiedName typetable
add SimpleName MethodInvocation MethodInvocation SimpleName local entities
add SimpleName MethodInvocation MethodInvocation SimpleName get
add SimpleName MethodInvocation MethodInvocation QualifiedName typetable
local entities SimpleName MethodInvocation SimpleName values
entities SimpleName MethodInvocation SimpleName add all
entities SimpleName MethodInvocation MethodInvocation SimpleName local entities
entities SimpleName MethodInvocation MethodInvocation SimpleName values
add all SimpleName MethodInvocation MethodInvocation SimpleName local entities
add all SimpleName MethodInvocation MethodInvocation SimpleName values
write entity SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName outputs
write entity SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName outputs
process referenceable SimpleName MethodInvocation SimpleName set
process referenceable SimpleName MethodInvocation StringLiteral outputs
process referenceable SimpleName MethodInvocation SimpleName target
set SimpleName MethodInvocation StringLiteral outputs
set SimpleName MethodInvocation SimpleName target
outputs StringLiteral MethodInvocation SimpleName target
process referenceable SimpleName MethodInvocation SimpleName set
process referenceable SimpleName MethodInvocation StringLiteral query text
process referenceable SimpleName MethodInvocation SimpleName query str
set SimpleName MethodInvocation StringLiteral query text
set SimpleName MethodInvocation SimpleName query str
query text StringLiteral MethodInvocation SimpleName query str
process referenceable SimpleName MethodInvocation SimpleName set
process referenceable SimpleName MethodInvocation StringLiteral query id
process referenceable SimpleName MethodInvocation SimpleName query id
set SimpleName MethodInvocation StringLiteral query id
set SimpleName MethodInvocation SimpleName query id
query id StringLiteral MethodInvocation SimpleName query id
eventjson plan QualifiedName MethodInvocation SimpleName to string
process referenceable SimpleName MethodInvocation SimpleName set
process referenceable SimpleName MethodInvocation StringLiteral query plan
process referenceable SimpleName MethodInvocation MethodInvocation QualifiedName eventjson plan
process referenceable SimpleName MethodInvocation MethodInvocation SimpleName to string
set SimpleName MethodInvocation StringLiteral query plan
set SimpleName MethodInvocation MethodInvocation QualifiedName eventjson plan
set SimpleName MethodInvocation MethodInvocation SimpleName to string
query plan StringLiteral MethodInvocation MethodInvocation QualifiedName eventjson plan
query plan StringLiteral MethodInvocation MethodInvocation SimpleName to string
system SimpleName MethodInvocation SimpleName current time millis
process referenceable SimpleName MethodInvocation SimpleName set
process referenceable SimpleName MethodInvocation StringLiteral end time
process referenceable SimpleName MethodInvocation MethodInvocation SimpleName system
process referenceable SimpleName MethodInvocation MethodInvocation SimpleName current time millis
set SimpleName MethodInvocation StringLiteral end time
set SimpleName MethodInvocation MethodInvocation SimpleName system
set SimpleName MethodInvocation MethodInvocation SimpleName current time millis
end time StringLiteral MethodInvocation MethodInvocation SimpleName system
end time StringLiteral MethodInvocation MethodInvocation SimpleName current time millis
process referenceable SimpleName MethodInvocation SimpleName set
process referenceable SimpleName MethodInvocation StringLiteral query graph
process referenceable SimpleName MethodInvocation StringLiteral query graph
set SimpleName MethodInvocation StringLiteral query graph
set SimpleName MethodInvocation StringLiteral query graph
query graph StringLiteral MethodInvocation StringLiteral query graph
entities SimpleName MethodInvocation SimpleName add
entities SimpleName MethodInvocation SimpleName process referenceable
add SimpleName MethodInvocation SimpleName process referenceable
notify entity SimpleName MethodInvocation SimpleName entities
inputs SimpleName EnhancedForStatement Block EnhancedForStatement SimpleName outputs
private Modifier MethodDeclaration PrimitiveType void
private Modifier MethodDeclaration SimpleName register process
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName hive meta store bridge
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName dgi bridge
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName hive event
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName event
private Modifier MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration SimpleName register process
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName hive meta store bridge
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName dgi bridge
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName hive event
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName event
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType long
void PrimitiveType MethodDeclaration Block EnhancedForStatement SimpleName inputs
void PrimitiveType MethodDeclaration Block EnhancedForStatement SimpleName outputs
register process SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName hive meta store bridge
register process SimpleName MethodDeclaration SingleVariableDeclaration SimpleName dgi bridge
register process SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName hive event
register process SimpleName MethodDeclaration SingleVariableDeclaration SimpleName event
register process SimpleName MethodDeclaration SimpleType SimpleName exception
register process SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType long
register process SimpleName MethodDeclaration Block EnhancedForStatement SimpleName inputs
register process SimpleName MethodDeclaration Block EnhancedForStatement SimpleName outputs
dgi bridge SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName event
dgi bridge SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
event SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName register process
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName dgi bridge
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName event
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName register process
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName dgi bridge
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName event
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
