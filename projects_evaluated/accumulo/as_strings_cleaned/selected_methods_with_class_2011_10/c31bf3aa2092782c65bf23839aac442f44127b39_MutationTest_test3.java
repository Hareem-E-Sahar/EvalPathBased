text SimpleName SimpleType ClassInstanceCreation StringLiteral r
mutation SimpleName SimpleType ClassInstanceCreation ClassInstanceCreation StringLiteral r
m SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName mutation
m SimpleName VariableDeclarationFragment ClassInstanceCreation ClassInstanceCreation StringLiteral r
mutation SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName m
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression NumberLiteral empty
mutationvalue size copy cutoff QualifiedName InfixExpression NumberLiteral empty
mutationvalue size copy cutoff QualifiedName InfixExpression InfixExpression SimpleName i
empty NumberLiteral InfixExpression InfixExpression SimpleName i
len SimpleName VariableDeclarationFragment InfixExpression InfixExpression QualifiedName mutationvalue size copy cutoff
len SimpleName VariableDeclarationFragment InfixExpression InfixExpression NumberLiteral empty
len SimpleName VariableDeclarationFragment InfixExpression SimpleName i
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName len
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment InfixExpression SimpleName i
byte PrimitiveType ArrayType ArrayCreation SimpleName len
val SimpleName VariableDeclarationFragment ArrayCreation ArrayType PrimitiveType byte
val SimpleName VariableDeclarationFragment ArrayCreation SimpleName len
byte PrimitiveType ArrayType VariableDeclarationStatement VariableDeclarationFragment SimpleName val
j SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName j
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
j SimpleName InfixExpression SimpleName len
val SimpleName ArrayAccess SimpleName j
byte PrimitiveType CastExpression SimpleName i
val SimpleName ArrayAccess Assignment CastExpression PrimitiveType byte
val SimpleName ArrayAccess Assignment CastExpression SimpleName i
j SimpleName ArrayAccess Assignment CastExpression PrimitiveType byte
j SimpleName ArrayAccess Assignment CastExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName j
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName len
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName j
j SimpleName InfixExpression ForStatement PostfixExpression SimpleName j
len SimpleName InfixExpression ForStatement PostfixExpression SimpleName j
cf StringLiteral InfixExpression SimpleName i
text SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral cf
text SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName i
cq StringLiteral InfixExpression SimpleName i
text SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral cq
text SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName i
value SimpleName SimpleType ClassInstanceCreation SimpleName val
m SimpleName MethodInvocation SimpleName put
m SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName text
m SimpleName MethodInvocation ClassInstanceCreation InfixExpression StringLiteral cf
m SimpleName MethodInvocation ClassInstanceCreation InfixExpression SimpleName i
m SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName text
m SimpleName MethodInvocation ClassInstanceCreation InfixExpression StringLiteral cq
m SimpleName MethodInvocation ClassInstanceCreation InfixExpression SimpleName i
m SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName value
m SimpleName MethodInvocation ClassInstanceCreation SimpleName val
put SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName text
put SimpleName MethodInvocation ClassInstanceCreation InfixExpression StringLiteral cf
put SimpleName MethodInvocation ClassInstanceCreation InfixExpression SimpleName i
put SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName text
put SimpleName MethodInvocation ClassInstanceCreation InfixExpression StringLiteral cq
put SimpleName MethodInvocation ClassInstanceCreation InfixExpression SimpleName i
put SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName value
put SimpleName MethodInvocation ClassInstanceCreation SimpleName val
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression NumberLiteral empty
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
empty NumberLiteral InfixExpression ForStatement PostfixExpression SimpleName i
r SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName r
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
r SimpleName InfixExpression NumberLiteral empty
m SimpleName MethodInvocation SimpleName get row
string SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName m
string SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get row
assert equals SimpleName MethodInvocation StringLiteral r
assert equals SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName string
assert equals SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName m
assert equals SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get row
r StringLiteral MethodInvocation ClassInstanceCreation SimpleType SimpleName string
r StringLiteral MethodInvocation ClassInstanceCreation MethodInvocation SimpleName m
r StringLiteral MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get row
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
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression NumberLiteral empty
updates SimpleName MethodInvocation SimpleName get
updates SimpleName MethodInvocation SimpleName i
get SimpleName MethodInvocation SimpleName i
cu SimpleName VariableDeclarationFragment MethodInvocation SimpleName updates
cu SimpleName VariableDeclarationFragment MethodInvocation SimpleName get
cu SimpleName VariableDeclarationFragment MethodInvocation SimpleName i
column update SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName cu
cf StringLiteral InfixExpression SimpleName i
cu SimpleName MethodInvocation SimpleName get column family
string SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName cu
string SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get column family
assert equals SimpleName MethodInvocation InfixExpression StringLiteral cf
assert equals SimpleName MethodInvocation InfixExpression SimpleName i
assert equals SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName string
assert equals SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName cu
assert equals SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get column family
cq StringLiteral InfixExpression SimpleName i
cu SimpleName MethodInvocation SimpleName get column qualifier
string SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName cu
string SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get column qualifier
assert equals SimpleName MethodInvocation InfixExpression StringLiteral cq
assert equals SimpleName MethodInvocation InfixExpression SimpleName i
assert equals SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName string
assert equals SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName cu
assert equals SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get column qualifier
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
cu SimpleName MethodInvocation SimpleName get value
val SimpleName VariableDeclarationFragment MethodInvocation SimpleName cu
val SimpleName VariableDeclarationFragment MethodInvocation SimpleName get value
byte PrimitiveType ArrayType VariableDeclarationStatement VariableDeclarationFragment SimpleName val
mutationvalue size copy cutoff QualifiedName InfixExpression NumberLiteral empty
mutationvalue size copy cutoff QualifiedName InfixExpression InfixExpression SimpleName i
empty NumberLiteral InfixExpression InfixExpression SimpleName i
len SimpleName VariableDeclarationFragment InfixExpression InfixExpression QualifiedName mutationvalue size copy cutoff
len SimpleName VariableDeclarationFragment InfixExpression InfixExpression NumberLiteral empty
len SimpleName VariableDeclarationFragment InfixExpression SimpleName i
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName len
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment InfixExpression SimpleName i
assert equals SimpleName MethodInvocation SimpleName len
assert equals SimpleName MethodInvocation QualifiedName vallength
len SimpleName MethodInvocation QualifiedName vallength
j SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName j
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
j SimpleName InfixExpression SimpleName len
val SimpleName ArrayAccess SimpleName j
assert equals SimpleName MethodInvocation SimpleName i
assert equals SimpleName MethodInvocation ArrayAccess SimpleName val
assert equals SimpleName MethodInvocation ArrayAccess SimpleName j
i SimpleName MethodInvocation ArrayAccess SimpleName val
i SimpleName MethodInvocation ArrayAccess SimpleName j
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName j
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName len
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName j
j SimpleName InfixExpression ForStatement PostfixExpression SimpleName j
len SimpleName InfixExpression ForStatement PostfixExpression SimpleName j
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression NumberLiteral empty
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
empty NumberLiteral InfixExpression ForStatement PostfixExpression SimpleName i
clone mutation SimpleName MethodInvocation SimpleName m
m SimpleName Assignment MethodInvocation SimpleName clone mutation
m SimpleName Assignment MethodInvocation SimpleName m
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName r
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression NumberLiteral empty
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName r
r SimpleName InfixExpression ForStatement PostfixExpression SimpleName r
empty NumberLiteral InfixExpression ForStatement PostfixExpression SimpleName r
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test
public Modifier MethodDeclaration SimpleType SimpleName io exception
void PrimitiveType MethodDeclaration SimpleName test
void PrimitiveType MethodDeclaration SimpleType SimpleName io exception
test SimpleName MethodDeclaration SimpleType SimpleName io exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
