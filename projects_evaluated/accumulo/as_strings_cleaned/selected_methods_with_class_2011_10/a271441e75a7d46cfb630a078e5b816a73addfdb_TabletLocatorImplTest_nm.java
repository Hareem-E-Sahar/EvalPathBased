string SimpleName SimpleType SingleVariableDeclaration SimpleName row
string SimpleName SimpleType SingleVariableDeclaration SimpleName data
text SimpleName SimpleType ClassInstanceCreation SimpleName row
mutation SimpleName SimpleType ClassInstanceCreation ClassInstanceCreation SimpleName row
mut SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName mutation
mut SimpleName VariableDeclarationFragment ClassInstanceCreation ClassInstanceCreation SimpleName row
mutation SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName mut
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression QualifiedName datalength
data SimpleName ArrayAccess SimpleName i
data SimpleName ArrayAccess MethodInvocation SimpleName split
i SimpleName ArrayAccess MethodInvocation SimpleName split
data SimpleName ArrayAccess MethodInvocation StringLiteral =
i SimpleName ArrayAccess MethodInvocation StringLiteral =
split SimpleName MethodInvocation StringLiteral =
cvp SimpleName VariableDeclarationFragment MethodInvocation ArrayAccess SimpleName data
cvp SimpleName VariableDeclarationFragment MethodInvocation ArrayAccess SimpleName i
cvp SimpleName VariableDeclarationFragment MethodInvocation SimpleName split
cvp SimpleName VariableDeclarationFragment MethodInvocation StringLiteral =
cvp SimpleName ArrayAccess NumberLiteral empty
cvp SimpleName ArrayAccess MethodInvocation SimpleName split
empty NumberLiteral ArrayAccess MethodInvocation SimpleName split
cvp SimpleName ArrayAccess MethodInvocation StringLiteral :
empty NumberLiteral ArrayAccess MethodInvocation StringLiteral :
split SimpleName MethodInvocation StringLiteral :
cols SimpleName VariableDeclarationFragment MethodInvocation ArrayAccess SimpleName cvp
cols SimpleName VariableDeclarationFragment MethodInvocation ArrayAccess NumberLiteral empty
cols SimpleName VariableDeclarationFragment MethodInvocation SimpleName split
cols SimpleName VariableDeclarationFragment MethodInvocation StringLiteral :
cols SimpleName ArrayAccess NumberLiteral empty
text SimpleName SimpleType ClassInstanceCreation ArrayAccess SimpleName cols
text SimpleName SimpleType ClassInstanceCreation ArrayAccess NumberLiteral empty
cols SimpleName ArrayAccess NumberLiteral empty
text SimpleName SimpleType ClassInstanceCreation ArrayAccess SimpleName cols
text SimpleName SimpleType ClassInstanceCreation ArrayAccess NumberLiteral empty
cvp SimpleName ArrayAccess NumberLiteral empty
cvp SimpleName ArrayAccess MethodInvocation SimpleName get bytes
empty NumberLiteral ArrayAccess MethodInvocation SimpleName get bytes
value SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get bytes
mut SimpleName MethodInvocation SimpleName put
mut SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName text
mut SimpleName MethodInvocation ClassInstanceCreation ArrayAccess SimpleName cols
mut SimpleName MethodInvocation ClassInstanceCreation ArrayAccess NumberLiteral empty
mut SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName text
mut SimpleName MethodInvocation ClassInstanceCreation ArrayAccess SimpleName cols
mut SimpleName MethodInvocation ClassInstanceCreation ArrayAccess NumberLiteral empty
mut SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName value
mut SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get bytes
put SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName text
put SimpleName MethodInvocation ClassInstanceCreation ArrayAccess SimpleName cols
put SimpleName MethodInvocation ClassInstanceCreation ArrayAccess NumberLiteral empty
put SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName text
put SimpleName MethodInvocation ClassInstanceCreation ArrayAccess SimpleName cols
put SimpleName MethodInvocation ClassInstanceCreation ArrayAccess NumberLiteral empty
put SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName value
put SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get bytes
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression QualifiedName datalength
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
datalength QualifiedName InfixExpression ForStatement PostfixExpression SimpleName i
static Modifier MethodDeclaration SimpleType SimpleName mutation
static Modifier MethodDeclaration SimpleName nm
static Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName row
static Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName data
static Modifier MethodDeclaration Block ReturnStatement SimpleName mut
mutation SimpleName SimpleType MethodDeclaration SimpleName nm
mutation SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName row
mutation SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName data
nm SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
nm SimpleName MethodDeclaration SingleVariableDeclaration SimpleName row
nm SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
nm SimpleName MethodDeclaration SingleVariableDeclaration SimpleName data
nm SimpleName MethodDeclaration Block ReturnStatement SimpleName mut
row SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName data
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier static
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName mutation
public Modifier TypeDeclaration MethodDeclaration SimpleName nm
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName row
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName data
test SimpleName TypeDeclaration MethodDeclaration Modifier static
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName mutation
test SimpleName TypeDeclaration MethodDeclaration SimpleName nm
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName row
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName data