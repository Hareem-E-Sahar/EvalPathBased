rand SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName random
random SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName rand
conn SimpleName MethodInvocation SimpleName create scanner
conn SimpleName MethodInvocation SimpleName table
conn SimpleName MethodInvocation QualifiedName authorizationsempty
create scanner SimpleName MethodInvocation SimpleName table
create scanner SimpleName MethodInvocation QualifiedName authorizationsempty
table SimpleName MethodInvocation QualifiedName authorizationsempty
isolated scanner SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName conn
isolated scanner SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName create scanner
isolated scanner SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName table
isolated scanner SimpleName SimpleType ClassInstanceCreation MethodInvocation QualifiedName authorizationsempty
scanner SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName isolated scanner
scanner SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName conn
scanner SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName create scanner
scanner SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName table
scanner SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation QualifiedName authorizationsempty
scanner SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName scanner
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression NumberLiteral empty
rand SimpleName MethodInvocation SimpleName next int
rand SimpleName MethodInvocation NumberLiteral empty
next int SimpleName MethodInvocation NumberLiteral empty
rand SimpleName MethodInvocation InfixExpression NumberLiteral empty
next int SimpleName MethodInvocation InfixExpression NumberLiteral empty
empty NumberLiteral MethodInvocation InfixExpression NumberLiteral empty
num rows SimpleName VariableDeclarationFragment InfixExpression MethodInvocation SimpleName rand
num rows SimpleName VariableDeclarationFragment InfixExpression MethodInvocation SimpleName next int
num rows SimpleName VariableDeclarationFragment InfixExpression MethodInvocation NumberLiteral empty
num rows SimpleName VariableDeclarationFragment InfixExpression NumberLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName num rows
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment InfixExpression NumberLiteral empty
array list SimpleName SimpleType ParameterizedType SimpleType SimpleName byte sequence
array list SimpleName SimpleType ParameterizedType SimpleType SimpleName byte sequence
array list SimpleName SimpleType ParameterizedType ClassInstanceCreation SimpleName num rows
byte sequence SimpleName SimpleType ParameterizedType ClassInstanceCreation SimpleName num rows
changes SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName num rows
array list SimpleName SimpleType ParameterizedType SimpleType SimpleName conditional mutation
array list SimpleName SimpleType ParameterizedType SimpleType SimpleName conditional mutation
j SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName j
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
j SimpleName InfixExpression SimpleName num rows
rows SimpleName MethodInvocation SimpleName size
rand SimpleName MethodInvocation SimpleName next int
rand SimpleName MethodInvocation MethodInvocation SimpleName rows
rand SimpleName MethodInvocation MethodInvocation SimpleName size
next int SimpleName MethodInvocation MethodInvocation SimpleName rows
next int SimpleName MethodInvocation MethodInvocation SimpleName size
rows SimpleName MethodInvocation SimpleName get
rows SimpleName MethodInvocation MethodInvocation SimpleName rand
rows SimpleName MethodInvocation MethodInvocation SimpleName next int
rows SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName rows
rows SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName size
get SimpleName MethodInvocation MethodInvocation SimpleName rand
get SimpleName MethodInvocation MethodInvocation SimpleName next int
get SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName rows
get SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName size
changes SimpleName MethodInvocation SimpleName add
changes SimpleName MethodInvocation MethodInvocation SimpleName rows
changes SimpleName MethodInvocation MethodInvocation SimpleName get
changes SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName rand
changes SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName next int
add SimpleName MethodInvocation MethodInvocation SimpleName rows
add SimpleName MethodInvocation MethodInvocation SimpleName get
add SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName rand
add SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName next int
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName j
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName num rows
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName j
j SimpleName InfixExpression ForStatement PostfixExpression SimpleName j
num rows SimpleName InfixExpression ForStatement PostfixExpression SimpleName j
byte sequence SimpleName SimpleType SingleVariableDeclaration SimpleName row
row SimpleName MethodInvocation SimpleName to string
range SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName row
range SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName to string
scanner SimpleName MethodInvocation SimpleName set range
scanner SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName range
scanner SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName row
scanner SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName to string
set range SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName range
set range SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName row
set range SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName to string
scanner SimpleName MethodInvocation SimpleName iterator
stats SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName scanner
stats SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName iterator
stats SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName stats
stats SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName scanner
stats SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName iterator
stats SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName stats
rand SimpleName MethodInvocation SimpleName next int
rand SimpleName MethodInvocation NumberLiteral empty
next int SimpleName MethodInvocation NumberLiteral empty
rand SimpleName MethodInvocation SimpleName next int
rand SimpleName MethodInvocation QualifiedName integermax value
next int SimpleName MethodInvocation QualifiedName integermax value
stats SimpleName MethodInvocation SimpleName set
stats SimpleName MethodInvocation MethodInvocation SimpleName rand
stats SimpleName MethodInvocation MethodInvocation SimpleName next int
stats SimpleName MethodInvocation MethodInvocation NumberLiteral empty
stats SimpleName MethodInvocation MethodInvocation SimpleName rand
stats SimpleName MethodInvocation MethodInvocation SimpleName next int
stats SimpleName MethodInvocation MethodInvocation QualifiedName integermax value
set SimpleName MethodInvocation MethodInvocation SimpleName rand
set SimpleName MethodInvocation MethodInvocation SimpleName next int
set SimpleName MethodInvocation MethodInvocation NumberLiteral empty
set SimpleName MethodInvocation MethodInvocation SimpleName rand
set SimpleName MethodInvocation MethodInvocation SimpleName next int
set SimpleName MethodInvocation MethodInvocation QualifiedName integermax value
rand SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName rand
rand SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName next int
rand SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName integermax value
next int SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName rand
next int SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName next int
next int SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName integermax value
empty NumberLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName rand
empty NumberLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName next int
empty NumberLiteral MethodInvocation MethodInvocation MethodInvocation QualifiedName integermax value
stats SimpleName MethodInvocation SimpleName to mutation
mutations SimpleName MethodInvocation SimpleName add
mutations SimpleName MethodInvocation MethodInvocation SimpleName stats
mutations SimpleName MethodInvocation MethodInvocation SimpleName to mutation
add SimpleName MethodInvocation MethodInvocation SimpleName stats
add SimpleName MethodInvocation MethodInvocation SimpleName to mutation
byte sequence SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName changes
row SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName changes
array list SimpleName SimpleType ParameterizedType SimpleType SimpleName byte sequence
array list SimpleName SimpleType ParameterizedType SimpleType SimpleName byte sequence
array list SimpleName SimpleType ParameterizedType ClassInstanceCreation SimpleName num rows
byte sequence SimpleName SimpleType ParameterizedType ClassInstanceCreation SimpleName num rows
changed SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName num rows
iterator SimpleName SimpleType ParameterizedType SimpleType SimpleName result
mutations SimpleName MethodInvocation SimpleName iterator
cw SimpleName MethodInvocation SimpleName write
cw SimpleName MethodInvocation MethodInvocation SimpleName mutations
cw SimpleName MethodInvocation MethodInvocation SimpleName iterator
write SimpleName MethodInvocation MethodInvocation SimpleName mutations
write SimpleName MethodInvocation MethodInvocation SimpleName iterator
results SimpleName VariableDeclarationFragment MethodInvocation SimpleName cw
results SimpleName VariableDeclarationFragment MethodInvocation SimpleName write
results SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName mutations
results SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName iterator
results SimpleName MethodInvocation SimpleName has next
results SimpleName MethodInvocation SimpleName next
result SimpleName VariableDeclarationFragment MethodInvocation SimpleName results
result SimpleName VariableDeclarationFragment MethodInvocation SimpleName next
result SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName result
result SimpleName MethodInvocation SimpleName get mutation
result SimpleName MethodInvocation MethodInvocation SimpleName get row
get mutation SimpleName MethodInvocation MethodInvocation SimpleName get row
array byte sequence SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get row
changed SimpleName MethodInvocation SimpleName add
changed SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName array byte sequence
changed SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get row
add SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName array byte sequence
add SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get row
collections SimpleName MethodInvocation SimpleName sort
collections SimpleName MethodInvocation SimpleName changes
sort SimpleName MethodInvocation SimpleName changes
collections SimpleName MethodInvocation SimpleName sort
collections SimpleName MethodInvocation SimpleName changed
sort SimpleName MethodInvocation SimpleName changed
assert SimpleName MethodInvocation SimpleName assert equals
assert SimpleName MethodInvocation SimpleName changes
assert SimpleName MethodInvocation SimpleName changed
assert equals SimpleName MethodInvocation SimpleName changes
assert equals SimpleName MethodInvocation SimpleName changed
changes SimpleName MethodInvocation SimpleName changed
int PrimitiveType VariableDeclarationStatement Block EnhancedForStatement SimpleName changes
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression NumberLiteral empty
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
empty NumberLiteral InfixExpression ForStatement PostfixExpression SimpleName i
exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
e SimpleName MethodInvocation SimpleName print stack trace
failed SimpleName MethodInvocation SimpleName set
failed SimpleName MethodInvocation BooleanLiteral true
set SimpleName MethodInvocation BooleanLiteral true
override SimpleName MarkerAnnotation MethodDeclaration Modifier public
override SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
override SimpleName MarkerAnnotation MethodDeclaration SimpleName run
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName run
void PrimitiveType MethodDeclaration SimpleName run
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName override
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName run
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName override
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName run