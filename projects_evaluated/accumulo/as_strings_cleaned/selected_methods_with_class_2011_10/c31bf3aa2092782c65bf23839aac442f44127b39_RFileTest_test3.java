trf SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName test r file
test r file SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName trf
trf SimpleName MethodInvocation SimpleName open writer
val SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName val
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment NumberLiteral empty
array list SimpleName SimpleType ParameterizedType SimpleType SimpleName key
array list SimpleName SimpleType ParameterizedType SimpleType SimpleName key
array list SimpleName SimpleType ParameterizedType ClassInstanceCreation NumberLiteral empty
key SimpleName SimpleType ParameterizedType ClassInstanceCreation NumberLiteral empty
expected keys SimpleName VariableDeclarationFragment ClassInstanceCreation NumberLiteral empty
array list SimpleName SimpleType ParameterizedType SimpleType SimpleName value
array list SimpleName SimpleType ParameterizedType SimpleType SimpleName value
array list SimpleName SimpleType ParameterizedType ClassInstanceCreation NumberLiteral empty
value SimpleName SimpleType ParameterizedType ClassInstanceCreation NumberLiteral empty
expected values SimpleName VariableDeclarationFragment ClassInstanceCreation NumberLiteral empty
row SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName row
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
row SimpleName InfixExpression NumberLiteral empty
nf SimpleName MethodInvocation StringLiteral r
nf SimpleName MethodInvocation SimpleName row
r StringLiteral MethodInvocation SimpleName row
row s SimpleName VariableDeclarationFragment MethodInvocation SimpleName nf
row s SimpleName VariableDeclarationFragment MethodInvocation StringLiteral r
row s SimpleName VariableDeclarationFragment MethodInvocation SimpleName row
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName row s
cf SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName cf
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
cf SimpleName InfixExpression NumberLiteral empty
nf SimpleName MethodInvocation StringLiteral cf
nf SimpleName MethodInvocation SimpleName cf
cf StringLiteral MethodInvocation SimpleName cf
cf s SimpleName VariableDeclarationFragment MethodInvocation SimpleName nf
cf s SimpleName VariableDeclarationFragment MethodInvocation StringLiteral cf
cf s SimpleName VariableDeclarationFragment MethodInvocation SimpleName cf
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName cf s
cq SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName cq
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
cq SimpleName InfixExpression NumberLiteral empty
nf SimpleName MethodInvocation StringLiteral cq
nf SimpleName MethodInvocation SimpleName cq
cq StringLiteral MethodInvocation SimpleName cq
cq s SimpleName VariableDeclarationFragment MethodInvocation SimpleName nf
cq s SimpleName VariableDeclarationFragment MethodInvocation StringLiteral cq
cq s SimpleName VariableDeclarationFragment MethodInvocation SimpleName cq
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName cq s
cv SimpleName VariableDeclarationFragment CharacterLiteral a
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName cv
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment CharacterLiteral a
a CharacterLiteral InfixExpression NumberLiteral empty
cv SimpleName InfixExpression InfixExpression CharacterLiteral a
cv SimpleName InfixExpression InfixExpression NumberLiteral empty
char PrimitiveType CastExpression SimpleName cv
empty StringLiteral InfixExpression CastExpression PrimitiveType char
empty StringLiteral InfixExpression CastExpression SimpleName cv
cv s SimpleName VariableDeclarationFragment InfixExpression StringLiteral empty
cv s SimpleName VariableDeclarationFragment InfixExpression CastExpression PrimitiveType char
cv s SimpleName VariableDeclarationFragment InfixExpression CastExpression SimpleName cv
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName cv s
ts SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName ts
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
ts SimpleName InfixExpression NumberLiteral empty
nk SimpleName MethodInvocation SimpleName row s
nk SimpleName MethodInvocation SimpleName cf s
nk SimpleName MethodInvocation SimpleName cq s
nk SimpleName MethodInvocation SimpleName cv s
nk SimpleName MethodInvocation SimpleName ts
row s SimpleName MethodInvocation SimpleName cf s
row s SimpleName MethodInvocation SimpleName cq s
row s SimpleName MethodInvocation SimpleName cv s
row s SimpleName MethodInvocation SimpleName ts
cf s SimpleName MethodInvocation SimpleName cq s
cf s SimpleName MethodInvocation SimpleName cv s
cf s SimpleName MethodInvocation SimpleName ts
cq s SimpleName MethodInvocation SimpleName cv s
cq s SimpleName MethodInvocation SimpleName ts
cv s SimpleName MethodInvocation SimpleName ts
k SimpleName VariableDeclarationFragment MethodInvocation SimpleName nk
k SimpleName VariableDeclarationFragment MethodInvocation SimpleName row s
k SimpleName VariableDeclarationFragment MethodInvocation SimpleName cf s
k SimpleName VariableDeclarationFragment MethodInvocation SimpleName cq s
k SimpleName VariableDeclarationFragment MethodInvocation SimpleName cv s
k SimpleName VariableDeclarationFragment MethodInvocation SimpleName ts
key SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName k
k SimpleName MethodInvocation SimpleName set deleted
k SimpleName MethodInvocation BooleanLiteral true
set deleted SimpleName MethodInvocation BooleanLiteral true
empty StringLiteral InfixExpression SimpleName val
nv SimpleName MethodInvocation InfixExpression StringLiteral empty
nv SimpleName MethodInvocation InfixExpression SimpleName val
v SimpleName VariableDeclarationFragment MethodInvocation SimpleName nv
v SimpleName VariableDeclarationFragment MethodInvocation InfixExpression StringLiteral empty
v SimpleName VariableDeclarationFragment MethodInvocation InfixExpression SimpleName val
value SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName v
trfwriter QualifiedName MethodInvocation SimpleName append
trfwriter QualifiedName MethodInvocation SimpleName k
trfwriter QualifiedName MethodInvocation SimpleName v
append SimpleName MethodInvocation SimpleName k
append SimpleName MethodInvocation SimpleName v
k SimpleName MethodInvocation SimpleName v
expected keys SimpleName MethodInvocation SimpleName add
expected keys SimpleName MethodInvocation SimpleName k
add SimpleName MethodInvocation SimpleName k
expected values SimpleName MethodInvocation SimpleName add
expected values SimpleName MethodInvocation SimpleName v
add SimpleName MethodInvocation SimpleName v
nk SimpleName MethodInvocation SimpleName row s
nk SimpleName MethodInvocation SimpleName cf s
nk SimpleName MethodInvocation SimpleName cq s
nk SimpleName MethodInvocation SimpleName cv s
nk SimpleName MethodInvocation SimpleName ts
row s SimpleName MethodInvocation SimpleName cf s
row s SimpleName MethodInvocation SimpleName cq s
row s SimpleName MethodInvocation SimpleName cv s
row s SimpleName MethodInvocation SimpleName ts
cf s SimpleName MethodInvocation SimpleName cq s
cf s SimpleName MethodInvocation SimpleName cv s
cf s SimpleName MethodInvocation SimpleName ts
cq s SimpleName MethodInvocation SimpleName cv s
cq s SimpleName MethodInvocation SimpleName ts
cv s SimpleName MethodInvocation SimpleName ts
k SimpleName Assignment MethodInvocation SimpleName nk
k SimpleName Assignment MethodInvocation SimpleName row s
k SimpleName Assignment MethodInvocation SimpleName cf s
k SimpleName Assignment MethodInvocation SimpleName cq s
k SimpleName Assignment MethodInvocation SimpleName cv s
k SimpleName Assignment MethodInvocation SimpleName ts
empty StringLiteral InfixExpression SimpleName val
nv SimpleName MethodInvocation InfixExpression StringLiteral empty
nv SimpleName MethodInvocation InfixExpression SimpleName val
v SimpleName Assignment MethodInvocation SimpleName nv
v SimpleName Assignment MethodInvocation InfixExpression StringLiteral empty
v SimpleName Assignment MethodInvocation InfixExpression SimpleName val
trfwriter QualifiedName MethodInvocation SimpleName append
trfwriter QualifiedName MethodInvocation SimpleName k
trfwriter QualifiedName MethodInvocation SimpleName v
append SimpleName MethodInvocation SimpleName k
append SimpleName MethodInvocation SimpleName v
k SimpleName MethodInvocation SimpleName v
expected keys SimpleName MethodInvocation SimpleName add
expected keys SimpleName MethodInvocation SimpleName k
add SimpleName MethodInvocation SimpleName k
expected values SimpleName MethodInvocation SimpleName add
expected values SimpleName MethodInvocation SimpleName v
add SimpleName MethodInvocation SimpleName v
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName ts
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression NumberLiteral empty
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName ts
ts SimpleName InfixExpression ForStatement PostfixExpression SimpleName ts
empty NumberLiteral InfixExpression ForStatement PostfixExpression SimpleName ts
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName cv
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName cv
cv SimpleName InfixExpression ForStatement PostfixExpression SimpleName cv
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName cq
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression NumberLiteral empty
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName cq
cq SimpleName InfixExpression ForStatement PostfixExpression SimpleName cq
empty NumberLiteral InfixExpression ForStatement PostfixExpression SimpleName cq
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName cf
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression NumberLiteral empty
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName cf
cf SimpleName InfixExpression ForStatement PostfixExpression SimpleName cf
empty NumberLiteral InfixExpression ForStatement PostfixExpression SimpleName cf
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName row
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression NumberLiteral empty
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName row
row SimpleName InfixExpression ForStatement PostfixExpression SimpleName row
empty NumberLiteral InfixExpression ForStatement PostfixExpression SimpleName row
trf SimpleName MethodInvocation SimpleName close writer
trf SimpleName MethodInvocation SimpleName open reader
trfreader QualifiedName MethodInvocation SimpleName seek
trfreader QualifiedName MethodInvocation ClassInstanceCreation SimpleType SimpleName range
trfreader QualifiedName MethodInvocation SimpleName empty col fams
trfreader QualifiedName MethodInvocation BooleanLiteral false
seek SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName range
seek SimpleName MethodInvocation SimpleName empty col fams
seek SimpleName MethodInvocation BooleanLiteral false
range SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName empty col fams
range SimpleName SimpleType ClassInstanceCreation MethodInvocation BooleanLiteral false
empty col fams SimpleName MethodInvocation BooleanLiteral false
expected keys SimpleName MethodInvocation SimpleName iterator
expected values SimpleName MethodInvocation SimpleName iterator
verify SimpleName MethodInvocation SimpleName trf
verify SimpleName MethodInvocation MethodInvocation SimpleName expected keys
verify SimpleName MethodInvocation MethodInvocation SimpleName iterator
verify SimpleName MethodInvocation MethodInvocation SimpleName expected values
verify SimpleName MethodInvocation MethodInvocation SimpleName iterator
trf SimpleName MethodInvocation MethodInvocation SimpleName expected keys
trf SimpleName MethodInvocation MethodInvocation SimpleName iterator
trf SimpleName MethodInvocation MethodInvocation SimpleName expected values
trf SimpleName MethodInvocation MethodInvocation SimpleName iterator
expected keys SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName expected values
expected keys SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName iterator
iterator SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName expected values
iterator SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName iterator
expected keys SimpleName MethodInvocation SimpleName size
expected keys SimpleName MethodInvocation InfixExpression NumberLiteral empty
size SimpleName MethodInvocation InfixExpression NumberLiteral empty
index SimpleName VariableDeclarationFragment InfixExpression MethodInvocation SimpleName expected keys
index SimpleName VariableDeclarationFragment InfixExpression MethodInvocation SimpleName size
index SimpleName VariableDeclarationFragment InfixExpression NumberLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName index
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment InfixExpression NumberLiteral empty
expected keys SimpleName MethodInvocation SimpleName get
expected keys SimpleName MethodInvocation SimpleName index
get SimpleName MethodInvocation SimpleName index
trf SimpleName MethodInvocation SimpleName seek
trf SimpleName MethodInvocation MethodInvocation SimpleName expected keys
trf SimpleName MethodInvocation MethodInvocation SimpleName get
trf SimpleName MethodInvocation MethodInvocation SimpleName index
seek SimpleName MethodInvocation MethodInvocation SimpleName expected keys
seek SimpleName MethodInvocation MethodInvocation SimpleName get
seek SimpleName MethodInvocation MethodInvocation SimpleName index
expected keys SimpleName MethodInvocation SimpleName size
expected keys SimpleName MethodInvocation SimpleName sub list
expected keys SimpleName MethodInvocation SimpleName index
expected keys SimpleName MethodInvocation MethodInvocation SimpleName expected keys
expected keys SimpleName MethodInvocation MethodInvocation SimpleName size
sub list SimpleName MethodInvocation SimpleName index
sub list SimpleName MethodInvocation MethodInvocation SimpleName expected keys
sub list SimpleName MethodInvocation MethodInvocation SimpleName size
index SimpleName MethodInvocation MethodInvocation SimpleName expected keys
index SimpleName MethodInvocation MethodInvocation SimpleName size
expected keys SimpleName MethodInvocation MethodInvocation SimpleName iterator
sub list SimpleName MethodInvocation MethodInvocation SimpleName iterator
index SimpleName MethodInvocation MethodInvocation SimpleName iterator
expected keys SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName iterator
size SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName iterator
expected keys SimpleName MethodInvocation SimpleName size
expected values SimpleName MethodInvocation SimpleName sub list
expected values SimpleName MethodInvocation SimpleName index
expected values SimpleName MethodInvocation MethodInvocation SimpleName expected keys
expected values SimpleName MethodInvocation MethodInvocation SimpleName size
sub list SimpleName MethodInvocation SimpleName index
sub list SimpleName MethodInvocation MethodInvocation SimpleName expected keys
sub list SimpleName MethodInvocation MethodInvocation SimpleName size
index SimpleName MethodInvocation MethodInvocation SimpleName expected keys
index SimpleName MethodInvocation MethodInvocation SimpleName size
expected values SimpleName MethodInvocation MethodInvocation SimpleName iterator
sub list SimpleName MethodInvocation MethodInvocation SimpleName iterator
index SimpleName MethodInvocation MethodInvocation SimpleName iterator
expected keys SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName iterator
size SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName iterator
verify SimpleName MethodInvocation SimpleName trf
verify SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName expected keys
verify SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName sub list
verify SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName index
verify SimpleName MethodInvocation MethodInvocation SimpleName iterator
verify SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName expected values
verify SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName sub list
verify SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName index
verify SimpleName MethodInvocation MethodInvocation SimpleName iterator
trf SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName expected keys
trf SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName sub list
trf SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName index
trf SimpleName MethodInvocation MethodInvocation SimpleName iterator
trf SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName expected values
trf SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName sub list
trf SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName index
trf SimpleName MethodInvocation MethodInvocation SimpleName iterator
iterator SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName iterator
index SimpleName Assignment NumberLiteral empty
expected keys SimpleName MethodInvocation SimpleName get
expected keys SimpleName MethodInvocation SimpleName index
get SimpleName MethodInvocation SimpleName index
trf SimpleName MethodInvocation SimpleName seek
trf SimpleName MethodInvocation MethodInvocation SimpleName expected keys
trf SimpleName MethodInvocation MethodInvocation SimpleName get
trf SimpleName MethodInvocation MethodInvocation SimpleName index
seek SimpleName MethodInvocation MethodInvocation SimpleName expected keys
seek SimpleName MethodInvocation MethodInvocation SimpleName get
seek SimpleName MethodInvocation MethodInvocation SimpleName index
expected keys SimpleName MethodInvocation SimpleName size
expected keys SimpleName MethodInvocation SimpleName sub list
expected keys SimpleName MethodInvocation SimpleName index
expected keys SimpleName MethodInvocation MethodInvocation SimpleName expected keys
expected keys SimpleName MethodInvocation MethodInvocation SimpleName size
sub list SimpleName MethodInvocation SimpleName index
sub list SimpleName MethodInvocation MethodInvocation SimpleName expected keys
sub list SimpleName MethodInvocation MethodInvocation SimpleName size
index SimpleName MethodInvocation MethodInvocation SimpleName expected keys
index SimpleName MethodInvocation MethodInvocation SimpleName size
expected keys SimpleName MethodInvocation MethodInvocation SimpleName iterator
sub list SimpleName MethodInvocation MethodInvocation SimpleName iterator
index SimpleName MethodInvocation MethodInvocation SimpleName iterator
expected keys SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName iterator
size SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName iterator
expected keys SimpleName MethodInvocation SimpleName size
expected values SimpleName MethodInvocation SimpleName sub list
expected values SimpleName MethodInvocation SimpleName index
expected values SimpleName MethodInvocation MethodInvocation SimpleName expected keys
expected values SimpleName MethodInvocation MethodInvocation SimpleName size
sub list SimpleName MethodInvocation SimpleName index
sub list SimpleName MethodInvocation MethodInvocation SimpleName expected keys
sub list SimpleName MethodInvocation MethodInvocation SimpleName size
index SimpleName MethodInvocation MethodInvocation SimpleName expected keys
index SimpleName MethodInvocation MethodInvocation SimpleName size
expected values SimpleName MethodInvocation MethodInvocation SimpleName iterator
sub list SimpleName MethodInvocation MethodInvocation SimpleName iterator
index SimpleName MethodInvocation MethodInvocation SimpleName iterator
expected keys SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName iterator
size SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName iterator
verify SimpleName MethodInvocation SimpleName trf
verify SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName expected keys
verify SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName sub list
verify SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName index
verify SimpleName MethodInvocation MethodInvocation SimpleName iterator
verify SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName expected values
verify SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName sub list
verify SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName index
verify SimpleName MethodInvocation MethodInvocation SimpleName iterator
trf SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName expected keys
trf SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName sub list
trf SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName index
trf SimpleName MethodInvocation MethodInvocation SimpleName iterator
trf SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName expected values
trf SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName sub list
trf SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName index
trf SimpleName MethodInvocation MethodInvocation SimpleName iterator
iterator SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName iterator
expected keys SimpleName MethodInvocation SimpleName size
expected keys SimpleName MethodInvocation InfixExpression NumberLiteral empty
size SimpleName MethodInvocation InfixExpression NumberLiteral empty
index SimpleName Assignment InfixExpression MethodInvocation SimpleName expected keys
index SimpleName Assignment InfixExpression MethodInvocation SimpleName size
index SimpleName Assignment InfixExpression NumberLiteral empty
expected keys SimpleName MethodInvocation SimpleName get
expected keys SimpleName MethodInvocation SimpleName index
get SimpleName MethodInvocation SimpleName index
trf SimpleName MethodInvocation SimpleName seek
trf SimpleName MethodInvocation MethodInvocation SimpleName expected keys
trf SimpleName MethodInvocation MethodInvocation SimpleName get
trf SimpleName MethodInvocation MethodInvocation SimpleName index
seek SimpleName MethodInvocation MethodInvocation SimpleName expected keys
seek SimpleName MethodInvocation MethodInvocation SimpleName get
seek SimpleName MethodInvocation MethodInvocation SimpleName index
expected keys SimpleName MethodInvocation SimpleName size
expected keys SimpleName MethodInvocation SimpleName sub list
expected keys SimpleName MethodInvocation SimpleName index
expected keys SimpleName MethodInvocation MethodInvocation SimpleName expected keys
expected keys SimpleName MethodInvocation MethodInvocation SimpleName size
sub list SimpleName MethodInvocation SimpleName index
sub list SimpleName MethodInvocation MethodInvocation SimpleName expected keys
sub list SimpleName MethodInvocation MethodInvocation SimpleName size
index SimpleName MethodInvocation MethodInvocation SimpleName expected keys
index SimpleName MethodInvocation MethodInvocation SimpleName size
expected keys SimpleName MethodInvocation MethodInvocation SimpleName iterator
sub list SimpleName MethodInvocation MethodInvocation SimpleName iterator
index SimpleName MethodInvocation MethodInvocation SimpleName iterator
expected keys SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName iterator
size SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName iterator
expected keys SimpleName MethodInvocation SimpleName size
expected values SimpleName MethodInvocation SimpleName sub list
expected values SimpleName MethodInvocation SimpleName index
expected values SimpleName MethodInvocation MethodInvocation SimpleName expected keys
expected values SimpleName MethodInvocation MethodInvocation SimpleName size
sub list SimpleName MethodInvocation SimpleName index
sub list SimpleName MethodInvocation MethodInvocation SimpleName expected keys
sub list SimpleName MethodInvocation MethodInvocation SimpleName size
index SimpleName MethodInvocation MethodInvocation SimpleName expected keys
index SimpleName MethodInvocation MethodInvocation SimpleName size
expected values SimpleName MethodInvocation MethodInvocation SimpleName iterator
sub list SimpleName MethodInvocation MethodInvocation SimpleName iterator
index SimpleName MethodInvocation MethodInvocation SimpleName iterator
expected keys SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName iterator
size SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName iterator
verify SimpleName MethodInvocation SimpleName trf
verify SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName expected keys
verify SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName sub list
verify SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName index
verify SimpleName MethodInvocation MethodInvocation SimpleName iterator
verify SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName expected values
verify SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName sub list
verify SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName index
verify SimpleName MethodInvocation MethodInvocation SimpleName iterator
trf SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName expected keys
trf SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName sub list
trf SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName index
trf SimpleName MethodInvocation MethodInvocation SimpleName iterator
trf SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName expected values
trf SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName sub list
trf SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName index
trf SimpleName MethodInvocation MethodInvocation SimpleName iterator
iterator SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName iterator
expected keys SimpleName MethodInvocation SimpleName size
index SimpleName Assignment MethodInvocation SimpleName expected keys
index SimpleName Assignment MethodInvocation SimpleName size
text SimpleName SimpleType ClassInstanceCreation StringLiteral z
key SimpleName SimpleType ClassInstanceCreation ClassInstanceCreation StringLiteral z
trf SimpleName MethodInvocation SimpleName seek
trf SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName key
trf SimpleName MethodInvocation ClassInstanceCreation ClassInstanceCreation StringLiteral z
seek SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName key
seek SimpleName MethodInvocation ClassInstanceCreation ClassInstanceCreation StringLiteral z
expected keys SimpleName MethodInvocation SimpleName size
expected keys SimpleName MethodInvocation SimpleName sub list
expected keys SimpleName MethodInvocation SimpleName index
expected keys SimpleName MethodInvocation MethodInvocation SimpleName expected keys
expected keys SimpleName MethodInvocation MethodInvocation SimpleName size
sub list SimpleName MethodInvocation SimpleName index
sub list SimpleName MethodInvocation MethodInvocation SimpleName expected keys
sub list SimpleName MethodInvocation MethodInvocation SimpleName size
index SimpleName MethodInvocation MethodInvocation SimpleName expected keys
index SimpleName MethodInvocation MethodInvocation SimpleName size
expected keys SimpleName MethodInvocation MethodInvocation SimpleName iterator
sub list SimpleName MethodInvocation MethodInvocation SimpleName iterator
index SimpleName MethodInvocation MethodInvocation SimpleName iterator
expected keys SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName iterator
size SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName iterator
expected keys SimpleName MethodInvocation SimpleName size
expected values SimpleName MethodInvocation SimpleName sub list
expected values SimpleName MethodInvocation SimpleName index
expected values SimpleName MethodInvocation MethodInvocation SimpleName expected keys
expected values SimpleName MethodInvocation MethodInvocation SimpleName size
sub list SimpleName MethodInvocation SimpleName index
sub list SimpleName MethodInvocation MethodInvocation SimpleName expected keys
sub list SimpleName MethodInvocation MethodInvocation SimpleName size
index SimpleName MethodInvocation MethodInvocation SimpleName expected keys
index SimpleName MethodInvocation MethodInvocation SimpleName size
expected values SimpleName MethodInvocation MethodInvocation SimpleName iterator
sub list SimpleName MethodInvocation MethodInvocation SimpleName iterator
index SimpleName MethodInvocation MethodInvocation SimpleName iterator
expected keys SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName iterator
size SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName iterator
verify SimpleName MethodInvocation SimpleName trf
verify SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName expected keys
verify SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName sub list
verify SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName index
verify SimpleName MethodInvocation MethodInvocation SimpleName iterator
verify SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName expected values
verify SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName sub list
verify SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName index
verify SimpleName MethodInvocation MethodInvocation SimpleName iterator
trf SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName expected keys
trf SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName sub list
trf SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName index
trf SimpleName MethodInvocation MethodInvocation SimpleName iterator
trf SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName expected values
trf SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName sub list
trf SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName index
trf SimpleName MethodInvocation MethodInvocation SimpleName iterator
iterator SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName iterator
expected keys SimpleName MethodInvocation SimpleName size
expected keys SimpleName MethodInvocation InfixExpression NumberLiteral empty
size SimpleName MethodInvocation InfixExpression NumberLiteral empty
index SimpleName Assignment InfixExpression MethodInvocation SimpleName expected keys
index SimpleName Assignment InfixExpression MethodInvocation SimpleName size
index SimpleName Assignment InfixExpression NumberLiteral empty
expected keys SimpleName MethodInvocation SimpleName get
expected keys SimpleName MethodInvocation SimpleName index
get SimpleName MethodInvocation SimpleName index
trf SimpleName MethodInvocation SimpleName seek
trf SimpleName MethodInvocation MethodInvocation SimpleName expected keys
trf SimpleName MethodInvocation MethodInvocation SimpleName get
trf SimpleName MethodInvocation MethodInvocation SimpleName index
seek SimpleName MethodInvocation MethodInvocation SimpleName expected keys
seek SimpleName MethodInvocation MethodInvocation SimpleName get
seek SimpleName MethodInvocation MethodInvocation SimpleName index
trfreader QualifiedName MethodInvocation SimpleName has top
assert true SimpleName MethodInvocation MethodInvocation QualifiedName trfreader
assert true SimpleName MethodInvocation MethodInvocation SimpleName has top
expected keys SimpleName MethodInvocation SimpleName get
expected keys SimpleName MethodInvocation SimpleName index
get SimpleName MethodInvocation SimpleName index
trfreader QualifiedName MethodInvocation SimpleName get top key
assert equals SimpleName MethodInvocation MethodInvocation SimpleName expected keys
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get
assert equals SimpleName MethodInvocation MethodInvocation SimpleName index
assert equals SimpleName MethodInvocation MethodInvocation QualifiedName trfreader
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get top key
expected keys SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName trfreader
expected keys SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get top key
get SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName trfreader
get SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get top key
index SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName trfreader
index SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get top key
expected values SimpleName MethodInvocation SimpleName get
expected values SimpleName MethodInvocation SimpleName index
get SimpleName MethodInvocation SimpleName index
trfreader QualifiedName MethodInvocation SimpleName get top value
assert equals SimpleName MethodInvocation MethodInvocation SimpleName expected values
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get
assert equals SimpleName MethodInvocation MethodInvocation SimpleName index
assert equals SimpleName MethodInvocation MethodInvocation QualifiedName trfreader
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get top value
expected values SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName trfreader
expected values SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get top value
get SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName trfreader
get SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get top value
index SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName trfreader
index SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get top value
trfreader QualifiedName MethodInvocation SimpleName next
trfreader QualifiedName MethodInvocation SimpleName has top
assert true SimpleName MethodInvocation MethodInvocation QualifiedName trfreader
assert true SimpleName MethodInvocation MethodInvocation SimpleName has top
expected keys SimpleName MethodInvocation SimpleName get
