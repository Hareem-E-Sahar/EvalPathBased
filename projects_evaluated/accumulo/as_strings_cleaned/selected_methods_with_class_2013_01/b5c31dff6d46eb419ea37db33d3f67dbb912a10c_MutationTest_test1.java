text SimpleName SimpleType ClassInstanceCreation StringLiteral r
mutation SimpleName SimpleType ClassInstanceCreation ClassInstanceCreation StringLiteral r
m SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName mutation
m SimpleName VariableDeclarationFragment ClassInstanceCreation ClassInstanceCreation StringLiteral r
mutation SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName m
text SimpleName SimpleType ClassInstanceCreation StringLiteral cf
text SimpleName SimpleType ClassInstanceCreation StringLiteral cq
v StringLiteral MethodInvocation SimpleName get bytes
value SimpleName SimpleType ClassInstanceCreation MethodInvocation StringLiteral v
value SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get bytes
m SimpleName MethodInvocation SimpleName put
m SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName text
m SimpleName MethodInvocation ClassInstanceCreation StringLiteral cf
m SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName text
m SimpleName MethodInvocation ClassInstanceCreation StringLiteral cq
m SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName value
m SimpleName MethodInvocation ClassInstanceCreation MethodInvocation StringLiteral v
m SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get bytes
put SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName text
put SimpleName MethodInvocation ClassInstanceCreation StringLiteral cf
put SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName text
put SimpleName MethodInvocation ClassInstanceCreation StringLiteral cq
put SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName value
put SimpleName MethodInvocation ClassInstanceCreation MethodInvocation StringLiteral v
put SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get bytes
cf StringLiteral ClassInstanceCreation MethodInvocation ClassInstanceCreation StringLiteral cq
list SimpleName SimpleType ParameterizedType SimpleType SimpleName column update
m SimpleName MethodInvocation SimpleName get updates
updates SimpleName VariableDeclarationFragment MethodInvocation SimpleName m
updates SimpleName VariableDeclarationFragment MethodInvocation SimpleName get updates
updates SimpleName MethodInvocation SimpleName size
assert equals SimpleName MethodInvocation NumberLiteral empty
assert equals SimpleName MethodInvocation MethodInvocation SimpleName updates
assert equals SimpleName MethodInvocation MethodInvocation SimpleName size
empty NumberLiteral MethodInvocation MethodInvocation SimpleName updates
empty NumberLiteral MethodInvocation MethodInvocation SimpleName size
updates SimpleName MethodInvocation SimpleName get
updates SimpleName MethodInvocation NumberLiteral empty
get SimpleName MethodInvocation NumberLiteral empty
cu SimpleName VariableDeclarationFragment MethodInvocation SimpleName updates
cu SimpleName VariableDeclarationFragment MethodInvocation SimpleName get
cu SimpleName VariableDeclarationFragment MethodInvocation NumberLiteral empty
column update SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName cu
cu SimpleName MethodInvocation SimpleName get column family
string SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName cu
string SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get column family
assert equals SimpleName MethodInvocation StringLiteral cf
assert equals SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName string
assert equals SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName cu
assert equals SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get column family
cf StringLiteral MethodInvocation ClassInstanceCreation SimpleType SimpleName string
cf StringLiteral MethodInvocation ClassInstanceCreation MethodInvocation SimpleName cu
cf StringLiteral MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get column family
cu SimpleName MethodInvocation SimpleName get column qualifier
string SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName cu
string SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get column qualifier
assert equals SimpleName MethodInvocation StringLiteral cq
assert equals SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName string
assert equals SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName cu
assert equals SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get column qualifier
cq StringLiteral MethodInvocation ClassInstanceCreation SimpleType SimpleName string
cq StringLiteral MethodInvocation ClassInstanceCreation MethodInvocation SimpleName cu
cq StringLiteral MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get column qualifier
cu SimpleName MethodInvocation SimpleName get column visibility
string SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName cu
string SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get column visibility
assert equals SimpleName MethodInvocation StringLiteral empty
assert equals SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName string
assert equals SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName cu
assert equals SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get column visibility
empty StringLiteral MethodInvocation ClassInstanceCreation SimpleType SimpleName string
empty StringLiteral MethodInvocation ClassInstanceCreation MethodInvocation SimpleName cu
empty StringLiteral MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get column visibility
cu SimpleName MethodInvocation SimpleName has timestamp
assert false SimpleName MethodInvocation MethodInvocation SimpleName cu
assert false SimpleName MethodInvocation MethodInvocation SimpleName has timestamp
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test
void PrimitiveType MethodDeclaration SimpleName test
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test