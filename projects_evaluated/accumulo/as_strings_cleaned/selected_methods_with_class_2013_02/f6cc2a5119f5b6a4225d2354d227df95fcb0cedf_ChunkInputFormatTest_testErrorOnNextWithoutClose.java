mock instance SimpleName SimpleType ClassInstanceCreation StringLiteral instance
instance SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName mock instance
instance SimpleName VariableDeclarationFragment ClassInstanceCreation StringLiteral instance
mock instance SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName instance
empty StringLiteral MethodInvocation SimpleName get bytes
instance SimpleName MethodInvocation SimpleName get connector
instance SimpleName MethodInvocation StringLiteral root
instance SimpleName MethodInvocation MethodInvocation StringLiteral empty
instance SimpleName MethodInvocation MethodInvocation SimpleName get bytes
get connector SimpleName MethodInvocation StringLiteral root
get connector SimpleName MethodInvocation MethodInvocation StringLiteral empty
get connector SimpleName MethodInvocation MethodInvocation SimpleName get bytes
root StringLiteral MethodInvocation MethodInvocation StringLiteral empty
root StringLiteral MethodInvocation MethodInvocation SimpleName get bytes
conn SimpleName VariableDeclarationFragment MethodInvocation SimpleName instance
conn SimpleName VariableDeclarationFragment MethodInvocation SimpleName get connector
conn SimpleName VariableDeclarationFragment MethodInvocation StringLiteral root
conn SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation StringLiteral empty
conn SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get bytes
connector SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName conn
conn SimpleName MethodInvocation SimpleName table operations
conn SimpleName MethodInvocation MethodInvocation SimpleName create
table operations SimpleName MethodInvocation MethodInvocation SimpleName create
conn SimpleName MethodInvocation MethodInvocation StringLiteral test
table operations SimpleName MethodInvocation MethodInvocation StringLiteral test
create SimpleName MethodInvocation StringLiteral test
conn SimpleName MethodInvocation SimpleName create batch writer
conn SimpleName MethodInvocation StringLiteral test
conn SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName batch writer config
create batch writer SimpleName MethodInvocation StringLiteral test
create batch writer SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName batch writer config
test StringLiteral MethodInvocation ClassInstanceCreation SimpleType SimpleName batch writer config
bw SimpleName VariableDeclarationFragment MethodInvocation SimpleName conn
bw SimpleName VariableDeclarationFragment MethodInvocation SimpleName create batch writer
bw SimpleName VariableDeclarationFragment MethodInvocation StringLiteral test
batch writer SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName bw
entry SimpleName SimpleType ParameterizedType SimpleType SimpleName key
entry SimpleName SimpleType ParameterizedType SimpleType SimpleName value
key SimpleName SimpleType ParameterizedType SimpleType SimpleName value
entry SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName e
key SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName e
value SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName e
e SimpleName MethodInvocation SimpleName get key
k SimpleName VariableDeclarationFragment MethodInvocation SimpleName e
k SimpleName VariableDeclarationFragment MethodInvocation SimpleName get key
key SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName k
k SimpleName MethodInvocation SimpleName get row
mutation SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName k
mutation SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get row
m SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName mutation
m SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName k
m SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName get row
mutation SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName m
k SimpleName MethodInvocation SimpleName get column family
k SimpleName MethodInvocation SimpleName get column qualifier
k SimpleName MethodInvocation SimpleName get column visibility
column visibility SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName k
column visibility SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get column visibility
k SimpleName MethodInvocation SimpleName get timestamp
e SimpleName MethodInvocation SimpleName get value
m SimpleName MethodInvocation SimpleName put
m SimpleName MethodInvocation MethodInvocation SimpleName k
m SimpleName MethodInvocation MethodInvocation SimpleName get column family
m SimpleName MethodInvocation MethodInvocation SimpleName k
m SimpleName MethodInvocation MethodInvocation SimpleName get column qualifier
m SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName column visibility
m SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName k
m SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get column visibility
m SimpleName MethodInvocation MethodInvocation SimpleName k
m SimpleName MethodInvocation MethodInvocation SimpleName get timestamp
put SimpleName MethodInvocation MethodInvocation SimpleName k
put SimpleName MethodInvocation MethodInvocation SimpleName get column family
put SimpleName MethodInvocation MethodInvocation SimpleName k
put SimpleName MethodInvocation MethodInvocation SimpleName get column qualifier
put SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName column visibility
put SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName k
put SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get column visibility
put SimpleName MethodInvocation MethodInvocation SimpleName k
put SimpleName MethodInvocation MethodInvocation SimpleName get timestamp
put SimpleName MethodInvocation MethodInvocation SimpleName e
put SimpleName MethodInvocation MethodInvocation SimpleName get value
k SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName k
k SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get column qualifier
get column family SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName k
get column family SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get column qualifier
k SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName k
k SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get timestamp
get column family SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName k
get column family SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get timestamp
k SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName e
k SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get value
get column family SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName e
get column family SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get value
k SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName k
k SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get timestamp
get column qualifier SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName k
get column qualifier SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get timestamp
k SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName e
k SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get value
get column qualifier SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName e
get column qualifier SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get value
k SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName e
k SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get value
get timestamp SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName e
get timestamp SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get value
bw SimpleName MethodInvocation SimpleName add mutation
bw SimpleName MethodInvocation SimpleName m
add mutation SimpleName MethodInvocation SimpleName m
e SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName data
bw SimpleName MethodInvocation SimpleName close
cif testertest no close QualifiedName SimpleType TypeLiteral MethodInvocation SimpleName get name
instance StringLiteral ArrayInitializer StringLiteral root
instance StringLiteral ArrayInitializer StringLiteral empty
instance StringLiteral ArrayInitializer StringLiteral test
instance StringLiteral ArrayInitializer MethodInvocation SimpleName get name
root StringLiteral ArrayInitializer StringLiteral empty
root StringLiteral ArrayInitializer StringLiteral test
root StringLiteral ArrayInitializer MethodInvocation SimpleName get name
empty StringLiteral ArrayInitializer StringLiteral test
empty StringLiteral ArrayInitializer MethodInvocation SimpleName get name
test StringLiteral ArrayInitializer MethodInvocation SimpleName get name
cif tester SimpleName MethodInvocation SimpleName main
cif tester SimpleName MethodInvocation ArrayCreation ArrayInitializer StringLiteral instance
cif tester SimpleName MethodInvocation ArrayCreation ArrayInitializer StringLiteral root
cif tester SimpleName MethodInvocation ArrayCreation ArrayInitializer StringLiteral empty
cif tester SimpleName MethodInvocation ArrayCreation ArrayInitializer StringLiteral test
main SimpleName MethodInvocation ArrayCreation ArrayInitializer StringLiteral instance
main SimpleName MethodInvocation ArrayCreation ArrayInitializer StringLiteral root
main SimpleName MethodInvocation ArrayCreation ArrayInitializer StringLiteral empty
main SimpleName MethodInvocation ArrayCreation ArrayInitializer StringLiteral test
assert equals SimpleName MethodInvocation NumberLiteral empty
assert equals SimpleName MethodInvocation MethodInvocation SimpleName cif tester
assert equals SimpleName MethodInvocation MethodInvocation SimpleName main
empty NumberLiteral MethodInvocation MethodInvocation SimpleName cif tester
empty NumberLiteral MethodInvocation MethodInvocation SimpleName main
assert null SimpleName MethodInvocation SimpleName e
assert null SimpleName MethodInvocation SimpleName e
assert not null SimpleName MethodInvocation SimpleName e
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test error on next without close
public Modifier MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration Block EnhancedForStatement SimpleName data
void PrimitiveType MethodDeclaration SimpleName test error on next without close
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration Block EnhancedForStatement SimpleName data
test error on next without close SimpleName MethodDeclaration SimpleType SimpleName exception
test error on next without close SimpleName MethodDeclaration Block EnhancedForStatement SimpleName data
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test error on next without close
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test error on next without close
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
