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
normalize SimpleName MethodInvocation QualifiedName eventquery str
query str SimpleName VariableDeclarationFragment MethodInvocation SimpleName normalize
query str SimpleName VariableDeclarationFragment MethodInvocation QualifiedName eventquery str
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName query str
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral registering query {}
log SimpleName MethodInvocation SimpleName query str
debug SimpleName MethodInvocation StringLiteral registering query {}
debug SimpleName MethodInvocation SimpleName query str
registering query {} StringLiteral MethodInvocation SimpleName query str
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
process referenceable SimpleName MethodInvocation QualifiedName eventquery start time
set SimpleName MethodInvocation StringLiteral start time
set SimpleName MethodInvocation QualifiedName eventquery start time
start time StringLiteral MethodInvocation QualifiedName eventquery start time
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
create or update entities SimpleName MethodInvocation SimpleName dgi bridge
create or update entities SimpleName MethodInvocation SimpleName read entity
dgi bridge SimpleName MethodInvocation SimpleName read entity
in table SimpleName VariableDeclarationFragment MethodInvocation SimpleName create or update entities
in table SimpleName VariableDeclarationFragment MethodInvocation SimpleName dgi bridge
in table SimpleName VariableDeclarationFragment MethodInvocation SimpleName read entity
referenceable SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName in table
source SimpleName MethodInvocation SimpleName add
source SimpleName MethodInvocation SimpleName in table
add SimpleName MethodInvocation SimpleName in table
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
create or update entities SimpleName MethodInvocation SimpleName dgi bridge
create or update entities SimpleName MethodInvocation SimpleName write entity
dgi bridge SimpleName MethodInvocation SimpleName write entity
out table SimpleName VariableDeclarationFragment MethodInvocation SimpleName create or update entities
out table SimpleName VariableDeclarationFragment MethodInvocation SimpleName dgi bridge
out table SimpleName VariableDeclarationFragment MethodInvocation SimpleName write entity
referenceable SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName out table
target SimpleName MethodInvocation SimpleName add
target SimpleName MethodInvocation SimpleName out table
add SimpleName MethodInvocation SimpleName out table
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
process referenceable SimpleName MethodInvocation QualifiedName eventquery id
set SimpleName MethodInvocation StringLiteral query id
set SimpleName MethodInvocation QualifiedName eventquery id
query id StringLiteral MethodInvocation QualifiedName eventquery id
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
hook notificationentity create request QualifiedName SimpleType ClassInstanceCreation SimpleName process referenceable
messages SimpleName MethodInvocation SimpleName add
messages SimpleName MethodInvocation ClassInstanceCreation SimpleType QualifiedName hook notificationentity create request
messages SimpleName MethodInvocation ClassInstanceCreation SimpleName process referenceable
add SimpleName MethodInvocation ClassInstanceCreation SimpleType QualifiedName hook notificationentity create request
add SimpleName MethodInvocation ClassInstanceCreation SimpleName process referenceable
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
void PrimitiveType MethodDeclaration Block EnhancedForStatement SimpleName inputs
void PrimitiveType MethodDeclaration Block EnhancedForStatement SimpleName outputs
register process SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName hive meta store bridge
register process SimpleName MethodDeclaration SingleVariableDeclaration SimpleName dgi bridge
register process SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName hive event
register process SimpleName MethodDeclaration SingleVariableDeclaration SimpleName event
register process SimpleName MethodDeclaration SimpleType SimpleName exception
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
