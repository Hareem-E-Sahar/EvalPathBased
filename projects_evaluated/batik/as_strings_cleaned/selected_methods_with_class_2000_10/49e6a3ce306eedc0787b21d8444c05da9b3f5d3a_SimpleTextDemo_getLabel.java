graphics node SimpleName SimpleType SingleVariableDeclaration SimpleName node
label SimpleName VariableDeclarationFragment StringLiteral nontext node
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName label
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment StringLiteral nontext node
node SimpleName InstanceofExpression SimpleType SimpleName text node
char PrimitiveType ArrayType VariableDeclarationStatement VariableDeclarationFragment SimpleName cbuff
text node SimpleName SimpleType CastExpression SimpleName node
node SimpleName CastExpression ParenthesizedExpression MethodInvocation SimpleName get attributed character iterator
iter SimpleName VariableDeclarationFragment MethodInvocation SimpleName get attributed character iterator
javatextcharacter iterator QualifiedName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName iter
iter SimpleName MethodInvocation SimpleName get end index
char PrimitiveType ArrayType ArrayCreation MethodInvocation SimpleName iter
char PrimitiveType ArrayType ArrayCreation MethodInvocation SimpleName get end index
cbuff SimpleName Assignment ArrayCreation ArrayType PrimitiveType char
cbuff SimpleName Assignment ArrayCreation MethodInvocation SimpleName iter
cbuff SimpleName Assignment ArrayCreation MethodInvocation SimpleName get end index
cbufflength QualifiedName InfixExpression NumberLiteral empty
cbuff SimpleName ArrayAccess NumberLiteral empty
iter SimpleName MethodInvocation SimpleName first
cbuff SimpleName ArrayAccess Assignment MethodInvocation SimpleName iter
cbuff SimpleName ArrayAccess Assignment MethodInvocation SimpleName first
empty NumberLiteral ArrayAccess Assignment MethodInvocation SimpleName iter
empty NumberLiteral ArrayAccess Assignment MethodInvocation SimpleName first
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression QualifiedName cbufflength
cbuff SimpleName ArrayAccess SimpleName i
iter SimpleName MethodInvocation SimpleName next
cbuff SimpleName ArrayAccess Assignment MethodInvocation SimpleName iter
cbuff SimpleName ArrayAccess Assignment MethodInvocation SimpleName next
i SimpleName ArrayAccess Assignment MethodInvocation SimpleName iter
i SimpleName ArrayAccess Assignment MethodInvocation SimpleName next
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression QualifiedName cbufflength
int PrimitiveType VariableDeclarationExpression ForStatement PrefixExpression SimpleName i
i SimpleName InfixExpression ForStatement PrefixExpression SimpleName i
cbufflength QualifiedName InfixExpression ForStatement PrefixExpression SimpleName i
string SimpleName SimpleType ClassInstanceCreation SimpleName cbuff
label SimpleName Assignment ClassInstanceCreation SimpleType SimpleName string
label SimpleName Assignment ClassInstanceCreation SimpleName cbuff
public Modifier MethodDeclaration Modifier static
public Modifier MethodDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SimpleName get label
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName graphics node
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName node
public Modifier MethodDeclaration Block ReturnStatement SimpleName label
static Modifier MethodDeclaration SimpleType SimpleName string
static Modifier MethodDeclaration SimpleName get label
static Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName graphics node
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName node
static Modifier MethodDeclaration Block ReturnStatement SimpleName label
string SimpleName SimpleType MethodDeclaration SimpleName get label
string SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName node
get label SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName graphics node
get label SimpleName MethodDeclaration SingleVariableDeclaration SimpleName node
get label SimpleName MethodDeclaration Block ReturnStatement SimpleName label
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration Modifier static
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName string
public Modifier TypeDeclaration MethodDeclaration SimpleName get label
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName node
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration Modifier static
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName string
test SimpleName TypeDeclaration MethodDeclaration SimpleName get label
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName node
