string SimpleName SimpleType SingleVariableDeclaration SimpleName key
comparision operator SimpleName SimpleType SingleVariableDeclaration SimpleName op
object SimpleName SimpleType SingleVariableDeclaration SimpleName value
int PrimitiveType SingleVariableDeclaration SimpleName expected results
test utils SimpleName MethodInvocation SimpleName get graph
graph SimpleName VariableDeclarationFragment MethodInvocation SimpleName test utils
graph SimpleName VariableDeclarationFragment MethodInvocation SimpleName get graph
atlas graph SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName graph
system SimpleName MethodInvocation SimpleName current time millis
start SimpleName VariableDeclarationFragment MethodInvocation SimpleName system
start SimpleName VariableDeclarationFragment MethodInvocation SimpleName current time millis
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName start
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName system
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName current time millis
count SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName count
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment NumberLiteral empty
graph SimpleName MethodInvocation SimpleName query
graph SimpleName MethodInvocation MethodInvocation SimpleName has
query SimpleName MethodInvocation MethodInvocation SimpleName has
graph SimpleName MethodInvocation MethodInvocation SimpleName key
query SimpleName MethodInvocation MethodInvocation SimpleName key
graph SimpleName MethodInvocation MethodInvocation SimpleName op
query SimpleName MethodInvocation MethodInvocation SimpleName op
graph SimpleName MethodInvocation MethodInvocation SimpleName value
query SimpleName MethodInvocation MethodInvocation SimpleName value
has SimpleName MethodInvocation SimpleName key
has SimpleName MethodInvocation SimpleName op
has SimpleName MethodInvocation SimpleName value
key SimpleName MethodInvocation SimpleName op
key SimpleName MethodInvocation SimpleName value
op SimpleName MethodInvocation SimpleName value
query SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName graph
query SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName query
query SimpleName VariableDeclarationFragment MethodInvocation SimpleName has
query SimpleName VariableDeclarationFragment MethodInvocation SimpleName key
query SimpleName VariableDeclarationFragment MethodInvocation SimpleName op
query SimpleName VariableDeclarationFragment MethodInvocation SimpleName value
atlas graph query SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName query
iterable SimpleName SimpleType ParameterizedType SimpleType SimpleName atlas vertex
query SimpleName MethodInvocation SimpleName vertices
itrble SimpleName VariableDeclarationFragment MethodInvocation SimpleName query
itrble SimpleName VariableDeclarationFragment MethodInvocation SimpleName vertices
atlas vertex SimpleName SimpleType SingleVariableDeclaration SimpleName ignored
atlas vertex SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName itrble
ignored SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName itrble
system SimpleName MethodInvocation SimpleName current time millis
system SimpleName MethodInvocation InfixExpression SimpleName start
current time millis SimpleName MethodInvocation InfixExpression SimpleName start
search on [ StringLiteral InfixExpression SimpleName key
search on [ StringLiteral InfixExpression StringLiteral =
search on [ StringLiteral InfixExpression SimpleName value
search on [ StringLiteral InfixExpression StringLiteral ] returned results
search on [ StringLiteral InfixExpression SimpleName count
key SimpleName InfixExpression StringLiteral =
key SimpleName InfixExpression SimpleName value
key SimpleName InfixExpression StringLiteral ] returned results
key SimpleName InfixExpression SimpleName count
key SimpleName InfixExpression StringLiteral took
= StringLiteral InfixExpression SimpleName value
= StringLiteral InfixExpression StringLiteral ] returned results
= StringLiteral InfixExpression SimpleName count
= StringLiteral InfixExpression StringLiteral took
= StringLiteral InfixExpression ParenthesizedExpression InfixExpression SimpleName start
value SimpleName InfixExpression StringLiteral ] returned results
value SimpleName InfixExpression SimpleName count
value SimpleName InfixExpression StringLiteral took
value SimpleName InfixExpression ParenthesizedExpression InfixExpression SimpleName start
value SimpleName InfixExpression StringLiteral ms
] returned results StringLiteral InfixExpression SimpleName count
] returned results StringLiteral InfixExpression StringLiteral took
] returned results StringLiteral InfixExpression ParenthesizedExpression InfixExpression SimpleName start
] returned results StringLiteral InfixExpression StringLiteral ms
count SimpleName InfixExpression StringLiteral took
count SimpleName InfixExpression ParenthesizedExpression InfixExpression SimpleName start
count SimpleName InfixExpression StringLiteral ms
took StringLiteral InfixExpression ParenthesizedExpression InfixExpression SimpleName start
took StringLiteral InfixExpression StringLiteral ms
start SimpleName InfixExpression ParenthesizedExpression InfixExpression StringLiteral ms
systemout QualifiedName MethodInvocation SimpleName println
systemout QualifiedName MethodInvocation InfixExpression StringLiteral search on [
systemout QualifiedName MethodInvocation InfixExpression SimpleName key
systemout QualifiedName MethodInvocation InfixExpression StringLiteral =
systemout QualifiedName MethodInvocation InfixExpression SimpleName value
systemout QualifiedName MethodInvocation InfixExpression StringLiteral ] returned results
systemout QualifiedName MethodInvocation InfixExpression SimpleName count
systemout QualifiedName MethodInvocation InfixExpression StringLiteral took
systemout QualifiedName MethodInvocation InfixExpression StringLiteral ms
println SimpleName MethodInvocation InfixExpression StringLiteral search on [
println SimpleName MethodInvocation InfixExpression SimpleName key
println SimpleName MethodInvocation InfixExpression StringLiteral =
println SimpleName MethodInvocation InfixExpression SimpleName value
println SimpleName MethodInvocation InfixExpression StringLiteral ] returned results
println SimpleName MethodInvocation InfixExpression SimpleName count
println SimpleName MethodInvocation InfixExpression StringLiteral took
println SimpleName MethodInvocation InfixExpression StringLiteral ms
assert SimpleName MethodInvocation SimpleName assert equals
assert SimpleName MethodInvocation SimpleName count
assert SimpleName MethodInvocation SimpleName expected results
assert equals SimpleName MethodInvocation SimpleName count
assert equals SimpleName MethodInvocation SimpleName expected results
count SimpleName MethodInvocation SimpleName expected results
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
private Modifier MethodDeclaration PrimitiveType void
private Modifier MethodDeclaration SimpleName search with index
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName key
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName comparision operator
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName op
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName object
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName value
void PrimitiveType MethodDeclaration SimpleName search with index
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName key
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName comparision operator
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName op
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName object
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName value
void PrimitiveType MethodDeclaration SingleVariableDeclaration PrimitiveType int
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName expected results
search with index SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
search with index SimpleName MethodDeclaration SingleVariableDeclaration SimpleName key
search with index SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName comparision operator
search with index SimpleName MethodDeclaration SingleVariableDeclaration SimpleName op
search with index SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName object
search with index SimpleName MethodDeclaration SingleVariableDeclaration SimpleName value
search with index SimpleName MethodDeclaration SingleVariableDeclaration PrimitiveType int
search with index SimpleName MethodDeclaration SingleVariableDeclaration SimpleName expected results
search with index SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType long
search with index SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
key SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName op
key SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName value
key SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
key SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName expected results
op SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName value
op SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
op SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName expected results
value SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
value SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName expected results
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName search with index
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName key
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName op
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName value
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName expected results
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName search with index
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName key
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName op
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName value
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName expected results
