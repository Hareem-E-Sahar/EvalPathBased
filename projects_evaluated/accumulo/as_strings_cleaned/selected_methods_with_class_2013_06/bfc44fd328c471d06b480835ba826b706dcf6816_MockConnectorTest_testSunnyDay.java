mock connector SimpleName SimpleType ClassInstanceCreation StringLiteral root
root StringLiteral ClassInstanceCreation ClassInstanceCreation SimpleType SimpleName mock instance
c SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName mock connector
c SimpleName VariableDeclarationFragment ClassInstanceCreation StringLiteral root
connector SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName c
c SimpleName MethodInvocation SimpleName table operations
c SimpleName MethodInvocation MethodInvocation SimpleName create
table operations SimpleName MethodInvocation MethodInvocation SimpleName create
c SimpleName MethodInvocation MethodInvocation StringLiteral test
table operations SimpleName MethodInvocation MethodInvocation StringLiteral test
create SimpleName MethodInvocation StringLiteral test
c SimpleName MethodInvocation SimpleName create batch writer
c SimpleName MethodInvocation StringLiteral test
c SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName batch writer config
create batch writer SimpleName MethodInvocation StringLiteral test
create batch writer SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName batch writer config
test StringLiteral MethodInvocation ClassInstanceCreation SimpleType SimpleName batch writer config
bw SimpleName VariableDeclarationFragment MethodInvocation SimpleName c
bw SimpleName VariableDeclarationFragment MethodInvocation SimpleName create batch writer
bw SimpleName VariableDeclarationFragment MethodInvocation StringLiteral test
batch writer SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName bw
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression NumberLiteral empty
random SimpleName MethodInvocation SimpleName next int
r SimpleName VariableDeclarationFragment MethodInvocation SimpleName random
r SimpleName VariableDeclarationFragment MethodInvocation SimpleName next int
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName r
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName random
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName next int
as text SimpleName MethodInvocation SimpleName r
mutation SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName as text
mutation SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName r
m SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName mutation
m SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName as text
m SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName r
mutation SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName m
random SimpleName MethodInvocation SimpleName next int
as text SimpleName MethodInvocation MethodInvocation SimpleName random
as text SimpleName MethodInvocation MethodInvocation SimpleName next int
random SimpleName MethodInvocation SimpleName next int
as text SimpleName MethodInvocation MethodInvocation SimpleName random
as text SimpleName MethodInvocation MethodInvocation SimpleName next int
integer SimpleName MethodInvocation SimpleName to hex string
integer SimpleName MethodInvocation SimpleName r
to hex string SimpleName MethodInvocation SimpleName r
integer SimpleName MethodInvocation MethodInvocation SimpleName get bytes
to hex string SimpleName MethodInvocation MethodInvocation SimpleName get bytes
r SimpleName MethodInvocation MethodInvocation SimpleName get bytes
value SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get bytes
m SimpleName MethodInvocation SimpleName put
m SimpleName MethodInvocation MethodInvocation SimpleName as text
m SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName random
m SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName next int
m SimpleName MethodInvocation MethodInvocation SimpleName as text
m SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName random
m SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName next int
m SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName value
m SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get bytes
put SimpleName MethodInvocation MethodInvocation SimpleName as text
put SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName random
put SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName next int
put SimpleName MethodInvocation MethodInvocation SimpleName as text
put SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName random
put SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName next int
put SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName value
put SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get bytes
as text SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName as text
bw SimpleName MethodInvocation SimpleName add mutation
bw SimpleName MethodInvocation SimpleName m
add mutation SimpleName MethodInvocation SimpleName m
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression NumberLiteral empty
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
empty NumberLiteral InfixExpression ForStatement PostfixExpression SimpleName i
bw SimpleName MethodInvocation SimpleName close
c SimpleName MethodInvocation SimpleName create batch scanner
c SimpleName MethodInvocation StringLiteral test
c SimpleName MethodInvocation QualifiedName authorizationsempty
c SimpleName MethodInvocation NumberLiteral empty
create batch scanner SimpleName MethodInvocation StringLiteral test
create batch scanner SimpleName MethodInvocation QualifiedName authorizationsempty
create batch scanner SimpleName MethodInvocation NumberLiteral empty
test StringLiteral MethodInvocation QualifiedName authorizationsempty
test StringLiteral MethodInvocation NumberLiteral empty
authorizationsempty QualifiedName MethodInvocation NumberLiteral empty
s SimpleName VariableDeclarationFragment MethodInvocation SimpleName c
s SimpleName VariableDeclarationFragment MethodInvocation SimpleName create batch scanner
s SimpleName VariableDeclarationFragment MethodInvocation StringLiteral test
s SimpleName VariableDeclarationFragment MethodInvocation QualifiedName authorizationsempty
s SimpleName VariableDeclarationFragment MethodInvocation NumberLiteral empty
batch scanner SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName s
collections SimpleName MethodInvocation SimpleName singleton list
collections SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName range
singleton list SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName range
s SimpleName MethodInvocation SimpleName set ranges
s SimpleName MethodInvocation MethodInvocation SimpleName collections
s SimpleName MethodInvocation MethodInvocation SimpleName singleton list
set ranges SimpleName MethodInvocation MethodInvocation SimpleName collections
set ranges SimpleName MethodInvocation MethodInvocation SimpleName singleton list
key SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName key
count SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName count
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment NumberLiteral empty
entry SimpleName SimpleType ParameterizedType SimpleType SimpleName key
entry SimpleName SimpleType ParameterizedType SimpleType SimpleName value
key SimpleName SimpleType ParameterizedType SimpleType SimpleName value
entry SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName entry
key SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName entry
value SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName entry
entry SimpleName MethodInvocation SimpleName get key
key SimpleName MethodInvocation SimpleName compare to
key SimpleName MethodInvocation MethodInvocation SimpleName entry
key SimpleName MethodInvocation MethodInvocation SimpleName get key
compare to SimpleName MethodInvocation MethodInvocation SimpleName entry
compare to SimpleName MethodInvocation MethodInvocation SimpleName get key
key SimpleName MethodInvocation InfixExpression NumberLiteral empty
compare to SimpleName MethodInvocation InfixExpression NumberLiteral empty
entry SimpleName MethodInvocation MethodInvocation InfixExpression NumberLiteral empty
get key SimpleName MethodInvocation MethodInvocation InfixExpression NumberLiteral empty
assert true SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName key
assert true SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName compare to
assert true SimpleName MethodInvocation InfixExpression NumberLiteral empty
entry SimpleName MethodInvocation SimpleName get key
entry SimpleName MethodInvocation MethodInvocation SimpleName get row
get key SimpleName MethodInvocation MethodInvocation SimpleName get row
entry SimpleName MethodInvocation SimpleName get value
entry SimpleName MethodInvocation MethodInvocation SimpleName get
get value SimpleName MethodInvocation MethodInvocation SimpleName get
text SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName entry
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get key
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get row
assert equals SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName text
assert equals SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get
entry SimpleName MethodInvocation SimpleName get key
key SimpleName Assignment MethodInvocation SimpleName entry
key SimpleName Assignment MethodInvocation SimpleName get key
entry SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName s
assert equals SimpleName MethodInvocation NumberLiteral empty
assert equals SimpleName MethodInvocation SimpleName count
empty NumberLiteral MethodInvocation SimpleName count
int PrimitiveType VariableDeclarationStatement Block EnhancedForStatement SimpleName s
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test sunny day
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test sunny day
public Modifier MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
public Modifier MethodDeclaration Block EnhancedForStatement SimpleName s
void PrimitiveType MethodDeclaration SimpleName test sunny day
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
void PrimitiveType MethodDeclaration Block EnhancedForStatement SimpleName s
test sunny day SimpleName MethodDeclaration SimpleType SimpleName exception
test sunny day SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
test sunny day SimpleName MethodDeclaration Block EnhancedForStatement SimpleName s
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test sunny day
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test sunny day
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
