tinker graph SimpleName MethodInvocation SimpleName open
tg SimpleName VariableDeclarationFragment MethodInvocation SimpleName tinker graph
tg SimpleName VariableDeclarationFragment MethodInvocation SimpleName open
tinker graph SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName tg
graph son utility SimpleName SimpleType ClassInstanceCreation SimpleName empty relationship cache
gu SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName graph son utility
gu SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName empty relationship cache
graph son utility SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName gu
map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
map SimpleName SimpleType ParameterizedType SimpleType SimpleName object
string SimpleName SimpleType ParameterizedType SimpleType SimpleName object
add vertex to graph SimpleName MethodInvocation SimpleName tg
add vertex to graph SimpleName MethodInvocation SimpleName gu
add vertex to graph SimpleName MethodInvocation MethodInvocation SimpleName get dbv
add vertex to graph SimpleName MethodInvocation MethodInvocation SimpleName get table v
tg SimpleName MethodInvocation SimpleName gu
tg SimpleName MethodInvocation MethodInvocation SimpleName get dbv
tg SimpleName MethodInvocation MethodInvocation SimpleName get table v
gu SimpleName MethodInvocation MethodInvocation SimpleName get dbv
gu SimpleName MethodInvocation MethodInvocation SimpleName get table v
get dbv SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get table v
add edge to graph SimpleName MethodInvocation SimpleName tg
add edge to graph SimpleName MethodInvocation SimpleName gu
add edge to graph SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName mapped element cache
add edge to graph SimpleName MethodInvocation MethodInvocation SimpleName get edge
tg SimpleName MethodInvocation SimpleName gu
tg SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName mapped element cache
tg SimpleName MethodInvocation MethodInvocation SimpleName get edge
gu SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName mapped element cache
gu SimpleName MethodInvocation MethodInvocation SimpleName get edge
tg SimpleName MethodInvocation SimpleName traversal
tg SimpleName MethodInvocation MethodInvocation SimpleName v
traversal SimpleName MethodInvocation MethodInvocation SimpleName v
tg SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName count
traversal SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName count
v SimpleName MethodInvocation MethodInvocation SimpleName count
v SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName next
count SimpleName MethodInvocation MethodInvocation SimpleName next
long PrimitiveType CastExpression MethodInvocation MethodInvocation SimpleName count
long PrimitiveType CastExpression MethodInvocation SimpleName next
assert SimpleName MethodInvocation SimpleName assert equals
assert SimpleName MethodInvocation CastExpression PrimitiveType long
assert SimpleName MethodInvocation CastExpression MethodInvocation SimpleName next
assert SimpleName MethodInvocation NumberLiteral l
assert equals SimpleName MethodInvocation CastExpression PrimitiveType long
assert equals SimpleName MethodInvocation CastExpression MethodInvocation SimpleName next
assert equals SimpleName MethodInvocation NumberLiteral l
long PrimitiveType CastExpression MethodInvocation NumberLiteral l
next SimpleName MethodInvocation CastExpression MethodInvocation NumberLiteral l
tg SimpleName MethodInvocation SimpleName traversal
tg SimpleName MethodInvocation MethodInvocation SimpleName e
traversal SimpleName MethodInvocation MethodInvocation SimpleName e
tg SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName count
traversal SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName count
e SimpleName MethodInvocation MethodInvocation SimpleName count
e SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName next
count SimpleName MethodInvocation MethodInvocation SimpleName next
long PrimitiveType CastExpression MethodInvocation MethodInvocation SimpleName count
long PrimitiveType CastExpression MethodInvocation SimpleName next
assert SimpleName MethodInvocation SimpleName assert equals
assert SimpleName MethodInvocation CastExpression PrimitiveType long
assert SimpleName MethodInvocation CastExpression MethodInvocation SimpleName next
assert SimpleName MethodInvocation NumberLiteral l
assert equals SimpleName MethodInvocation CastExpression PrimitiveType long
assert equals SimpleName MethodInvocation CastExpression MethodInvocation SimpleName next
assert equals SimpleName MethodInvocation NumberLiteral l
long PrimitiveType CastExpression MethodInvocation NumberLiteral l
next SimpleName MethodInvocation CastExpression MethodInvocation NumberLiteral l
tg SimpleName MethodInvocation SimpleName edges
tg SimpleName MethodInvocation MethodInvocation SimpleName next
edges SimpleName MethodInvocation MethodInvocation SimpleName next
e SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName tg
e SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName edges
e SimpleName VariableDeclarationFragment MethodInvocation SimpleName next
edge SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName e
e SimpleName MethodInvocation SimpleName property
e SimpleName MethodInvocation SimpleName edge id in import key
property SimpleName MethodInvocation SimpleName edge id in import key
e SimpleName MethodInvocation MethodInvocation SimpleName is present
property SimpleName MethodInvocation MethodInvocation SimpleName is present
edge id in import key SimpleName MethodInvocation MethodInvocation SimpleName is present
assert true SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName e
assert true SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName property
assert true SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName edge id in import key
assert true SimpleName MethodInvocation MethodInvocation SimpleName is present
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName edge read and added to graph
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName edge read and added to graph
void PrimitiveType MethodDeclaration SimpleName edge read and added to graph
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName edge read and added to graph
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName edge read and added to graph