object SimpleName SimpleType SingleVariableDeclaration SimpleName o
label SimpleName VariableDeclarationFragment StringLiteral unknown return type
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName label
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment StringLiteral unknown return type
o SimpleName InstanceofExpression SimpleType SimpleName character iterator
character iterator SimpleName SimpleType CastExpression SimpleName o
iter SimpleName VariableDeclarationFragment CastExpression SimpleType SimpleName character iterator
iter SimpleName VariableDeclarationFragment CastExpression SimpleName o
character iterator SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName iter
iter SimpleName MethodInvocation SimpleName get end index
iter SimpleName MethodInvocation SimpleName get begin index
iter SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName iter
iter SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get begin index
get end index SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName iter
get end index SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get begin index
cbuff SimpleName VariableDeclarationFragment ArrayCreation ArrayType PrimitiveType char
char PrimitiveType ArrayType VariableDeclarationStatement VariableDeclarationFragment SimpleName cbuff
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
system SimpleName MethodInvocation SimpleName get security manager
security manager SimpleName VariableDeclarationFragment MethodInvocation SimpleName system
security manager SimpleName VariableDeclarationFragment MethodInvocation SimpleName get security manager
security manager SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName security manager
can access clipboard SimpleName VariableDeclarationFragment BooleanLiteral true
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName can access clipboard
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment BooleanLiteral true
security manager SimpleName MethodInvocation SimpleName check system clipboard access
security exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
can access clipboard SimpleName Assignment BooleanLiteral false
toolkit SimpleName MethodInvocation SimpleName get default toolkit
toolkit SimpleName MethodInvocation MethodInvocation SimpleName get system clipboard
get default toolkit SimpleName MethodInvocation MethodInvocation SimpleName get system clipboard
clipboard SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName toolkit
clipboard SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get default toolkit
clipboard SimpleName VariableDeclarationFragment MethodInvocation SimpleName get system clipboard
clipboard SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName clipboard
string selection SimpleName SimpleType ClassInstanceCreation SimpleName label
selection SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName string selection
selection SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName label
string selection SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName selection
clipboard SimpleName MethodInvocation SimpleName set contents
clipboard SimpleName MethodInvocation SimpleName selection
clipboard SimpleName MethodInvocation SimpleName selection
set contents SimpleName MethodInvocation SimpleName selection
set contents SimpleName MethodInvocation SimpleName selection
selection SimpleName MethodInvocation SimpleName selection
boolean PrimitiveType VariableDeclarationStatement Block IfStatement SimpleName can access clipboard
squawk like a parrot SimpleName MethodInvocation SimpleName label
private Modifier MethodDeclaration PrimitiveType void
private Modifier MethodDeclaration SimpleName copy to clipboard
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName object
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName o
void PrimitiveType MethodDeclaration SimpleName copy to clipboard
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName object
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName o
copy to clipboard SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName object
copy to clipboard SimpleName MethodDeclaration SingleVariableDeclaration SimpleName o
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName copy to clipboard
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName o
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName copy to clipboard
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName o
