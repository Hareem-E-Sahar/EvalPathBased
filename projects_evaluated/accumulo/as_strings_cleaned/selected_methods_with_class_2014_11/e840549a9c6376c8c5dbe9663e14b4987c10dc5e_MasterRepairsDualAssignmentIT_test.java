c SimpleName VariableDeclarationFragment MethodInvocation SimpleName get connector
connector SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName c
password token SimpleName SimpleType ClassInstanceCreation SimpleName root password
credentials SimpleName SimpleType ClassInstanceCreation StringLiteral root
credentials SimpleName SimpleType ClassInstanceCreation ClassInstanceCreation SimpleName root password
root StringLiteral ClassInstanceCreation ClassInstanceCreation SimpleType SimpleName password token
root StringLiteral ClassInstanceCreation ClassInstanceCreation SimpleName root password
creds SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName credentials
creds SimpleName VariableDeclarationFragment ClassInstanceCreation StringLiteral root
creds SimpleName VariableDeclarationFragment ClassInstanceCreation ClassInstanceCreation SimpleName root password
credentials SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName creds
get unique names SimpleName MethodInvocation NumberLiteral empty
get unique names SimpleName MethodInvocation ArrayAccess NumberLiteral empty
empty NumberLiteral MethodInvocation ArrayAccess NumberLiteral empty
table SimpleName VariableDeclarationFragment ArrayAccess MethodInvocation SimpleName get unique names
table SimpleName VariableDeclarationFragment ArrayAccess MethodInvocation NumberLiteral empty
table SimpleName VariableDeclarationFragment ArrayAccess NumberLiteral empty
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table
c SimpleName MethodInvocation SimpleName security operations
c SimpleName MethodInvocation MethodInvocation SimpleName grant table permission
security operations SimpleName MethodInvocation MethodInvocation SimpleName grant table permission
c SimpleName MethodInvocation MethodInvocation StringLiteral root
security operations SimpleName MethodInvocation MethodInvocation StringLiteral root
c SimpleName MethodInvocation MethodInvocation QualifiedName metadata tablename
security operations SimpleName MethodInvocation MethodInvocation QualifiedName metadata tablename
c SimpleName MethodInvocation MethodInvocation QualifiedName table permissionwrite
security operations SimpleName MethodInvocation MethodInvocation QualifiedName table permissionwrite
grant table permission SimpleName MethodInvocation StringLiteral root
grant table permission SimpleName MethodInvocation QualifiedName metadata tablename
grant table permission SimpleName MethodInvocation QualifiedName table permissionwrite
root StringLiteral MethodInvocation QualifiedName metadata tablename
root StringLiteral MethodInvocation QualifiedName table permissionwrite
metadata tablename QualifiedName MethodInvocation QualifiedName table permissionwrite
c SimpleName MethodInvocation SimpleName security operations
c SimpleName MethodInvocation MethodInvocation SimpleName grant table permission
security operations SimpleName MethodInvocation MethodInvocation SimpleName grant table permission
c SimpleName MethodInvocation MethodInvocation StringLiteral root
security operations SimpleName MethodInvocation MethodInvocation StringLiteral root
c SimpleName MethodInvocation MethodInvocation QualifiedName root tablename
security operations SimpleName MethodInvocation MethodInvocation QualifiedName root tablename
c SimpleName MethodInvocation MethodInvocation QualifiedName table permissionwrite
security operations SimpleName MethodInvocation MethodInvocation QualifiedName table permissionwrite
grant table permission SimpleName MethodInvocation StringLiteral root
grant table permission SimpleName MethodInvocation QualifiedName root tablename
grant table permission SimpleName MethodInvocation QualifiedName table permissionwrite
root StringLiteral MethodInvocation QualifiedName root tablename
root StringLiteral MethodInvocation QualifiedName table permissionwrite
root tablename QualifiedName MethodInvocation QualifiedName table permissionwrite
c SimpleName MethodInvocation SimpleName table operations
c SimpleName MethodInvocation MethodInvocation SimpleName create
table operations SimpleName MethodInvocation MethodInvocation SimpleName create
c SimpleName MethodInvocation MethodInvocation SimpleName table
table operations SimpleName MethodInvocation MethodInvocation SimpleName table
create SimpleName MethodInvocation SimpleName table
sorted set SimpleName SimpleType ParameterizedType SimpleType SimpleName text
tree set SimpleName SimpleType ParameterizedType SimpleType SimpleName text
string SimpleName SimpleType SingleVariableDeclaration SimpleName part
a b c d e f g h i j k l m n o p q r s t u v w x y z StringLiteral MethodInvocation SimpleName split
a b c d e f g h i j k l m n o p q r s t u v w x y z StringLiteral MethodInvocation StringLiteral empty
split SimpleName MethodInvocation StringLiteral empty
text SimpleName SimpleType ClassInstanceCreation SimpleName part
partitions SimpleName MethodInvocation SimpleName add
partitions SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName text
partitions SimpleName MethodInvocation ClassInstanceCreation SimpleName part
add SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName text
add SimpleName MethodInvocation ClassInstanceCreation SimpleName part
part SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation StringLiteral a b c d e f g h i j k l m n o p q r s t u v w x y z
part SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName split
part SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation StringLiteral empty
c SimpleName MethodInvocation SimpleName table operations
c SimpleName MethodInvocation MethodInvocation SimpleName add splits
table operations SimpleName MethodInvocation MethodInvocation SimpleName add splits
c SimpleName MethodInvocation MethodInvocation SimpleName table
table operations SimpleName MethodInvocation MethodInvocation SimpleName table
c SimpleName MethodInvocation MethodInvocation SimpleName partitions
table operations SimpleName MethodInvocation MethodInvocation SimpleName partitions
add splits SimpleName MethodInvocation SimpleName table
add splits SimpleName MethodInvocation SimpleName partitions
table SimpleName MethodInvocation SimpleName partitions
set SimpleName SimpleType ParameterizedType SimpleType SimpleName t server instance
hash set SimpleName SimpleType ParameterizedType SimpleType SimpleName t server instance
set SimpleName SimpleType ParameterizedType SimpleType SimpleName tablet location state
hash set SimpleName SimpleType ParameterizedType SimpleType SimpleName tablet location state
c SimpleName MethodInvocation SimpleName get instance
meta data state store SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName c
meta data state store SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get instance
meta data state store SimpleName SimpleType ClassInstanceCreation SimpleName creds
c SimpleName MethodInvocation ClassInstanceCreation SimpleName creds
get instance SimpleName MethodInvocation ClassInstanceCreation SimpleName creds
store SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName meta data state store
store SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName c
store SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName get instance
store SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName creds
meta data state store SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName store
states SimpleName MethodInvocation SimpleName size
states SimpleName MethodInvocation InfixExpression NumberLiteral empty
size SimpleName MethodInvocation InfixExpression NumberLiteral empty
util wait thread SimpleName MethodInvocation SimpleName sleep
util wait thread SimpleName MethodInvocation NumberLiteral empty
sleep SimpleName MethodInvocation NumberLiteral empty
old locations SimpleName MethodInvocation SimpleName clear
tablet location state SimpleName SimpleType SingleVariableDeclaration SimpleName tls
states SimpleName MethodInvocation SimpleName add
states SimpleName MethodInvocation QualifiedName tlscurrent
add SimpleName MethodInvocation QualifiedName tlscurrent
old locations SimpleName MethodInvocation SimpleName add
old locations SimpleName MethodInvocation SimpleName tls
add SimpleName MethodInvocation SimpleName tls
tablet location state SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName store
tls SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName store
states SimpleName MethodInvocation SimpleName size
assert equals SimpleName MethodInvocation NumberLiteral empty
assert equals SimpleName MethodInvocation MethodInvocation SimpleName states
assert equals SimpleName MethodInvocation MethodInvocation SimpleName size
empty NumberLiteral MethodInvocation MethodInvocation SimpleName states
empty NumberLiteral MethodInvocation MethodInvocation SimpleName size
cluster SimpleName MethodInvocation SimpleName get processes
cluster SimpleName MethodInvocation MethodInvocation SimpleName get
get processes SimpleName MethodInvocation MethodInvocation SimpleName get
cluster SimpleName MethodInvocation MethodInvocation QualifiedName server typetablet server
get processes SimpleName MethodInvocation MethodInvocation QualifiedName server typetablet server
get SimpleName MethodInvocation QualifiedName server typetablet server
cluster SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName iterator
get processes SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName iterator
get SimpleName MethodInvocation MethodInvocation SimpleName iterator
server typetablet server QualifiedName MethodInvocation MethodInvocation SimpleName iterator
get SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName next
server typetablet server QualifiedName MethodInvocation MethodInvocation MethodInvocation SimpleName next
iterator SimpleName MethodInvocation MethodInvocation SimpleName next
cluster SimpleName MethodInvocation SimpleName kill process
cluster SimpleName MethodInvocation QualifiedName server typetablet server
cluster SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName iterator
cluster SimpleName MethodInvocation MethodInvocation SimpleName next
kill process SimpleName MethodInvocation QualifiedName server typetablet server
kill process SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName iterator
kill process SimpleName MethodInvocation MethodInvocation SimpleName next
server typetablet server QualifiedName MethodInvocation MethodInvocation MethodInvocation SimpleName iterator
server typetablet server QualifiedName MethodInvocation MethodInvocation SimpleName next
set SimpleName SimpleType ParameterizedType SimpleType SimpleName t server instance
util wait thread SimpleName MethodInvocation SimpleName sleep
util wait thread SimpleName MethodInvocation NumberLiteral empty
sleep SimpleName MethodInvocation NumberLiteral empty
states SimpleName MethodInvocation SimpleName clear
repl states SimpleName MethodInvocation SimpleName clear
all assigned SimpleName VariableDeclarationFragment BooleanLiteral true
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName all assigned
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment BooleanLiteral true
tablet location state SimpleName SimpleType SingleVariableDeclaration SimpleName tls
tls SimpleName InfixExpression InfixExpression InfixExpression QualifiedName tlscurrent
states SimpleName MethodInvocation SimpleName add
states SimpleName MethodInvocation QualifiedName tlscurrent
add SimpleName MethodInvocation QualifiedName tlscurrent
text SimpleName SimpleType ClassInstanceCreation QualifiedName replication tableid
key extent SimpleName SimpleType ClassInstanceCreation ClassInstanceCreation QualifiedName replication tableid
tlsextent QualifiedName MethodInvocation SimpleName equals
tlsextent QualifiedName MethodInvocation ClassInstanceCreation SimpleType SimpleName key extent
tlsextent QualifiedName MethodInvocation ClassInstanceCreation ClassInstanceCreation QualifiedName replication tableid
equals SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName key extent
equals SimpleName MethodInvocation ClassInstanceCreation ClassInstanceCreation QualifiedName replication tableid
repl states SimpleName MethodInvocation SimpleName add
repl states SimpleName MethodInvocation QualifiedName tlscurrent
add SimpleName MethodInvocation QualifiedName tlscurrent
all assigned SimpleName Assignment BooleanLiteral false
tablet location state SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName store
tls SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName store
states SimpleName MethodInvocation SimpleName size
states SimpleName InfixExpression StringLiteral size
states SimpleName InfixExpression MethodInvocation SimpleName states
states SimpleName InfixExpression MethodInvocation SimpleName size
states SimpleName InfixExpression StringLiteral all assigned
states SimpleName InfixExpression SimpleName all assigned
size StringLiteral InfixExpression MethodInvocation SimpleName states
size StringLiteral InfixExpression MethodInvocation SimpleName size
size StringLiteral InfixExpression StringLiteral all assigned
size StringLiteral InfixExpression SimpleName all assigned
states SimpleName MethodInvocation InfixExpression StringLiteral all assigned
size SimpleName MethodInvocation InfixExpression StringLiteral all assigned
states SimpleName MethodInvocation InfixExpression SimpleName all assigned
size SimpleName MethodInvocation InfixExpression SimpleName all assigned
all assigned StringLiteral InfixExpression SimpleName all assigned
systemout QualifiedName MethodInvocation SimpleName println
systemout QualifiedName MethodInvocation InfixExpression SimpleName states
systemout QualifiedName MethodInvocation InfixExpression StringLiteral size
systemout QualifiedName MethodInvocation InfixExpression MethodInvocation SimpleName states
systemout QualifiedName MethodInvocation InfixExpression MethodInvocation SimpleName size
systemout QualifiedName MethodInvocation InfixExpression StringLiteral all assigned
systemout QualifiedName MethodInvocation InfixExpression SimpleName all assigned
println SimpleName MethodInvocation InfixExpression SimpleName states
println SimpleName MethodInvocation InfixExpression StringLiteral size
println SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName states
println SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName size
println SimpleName MethodInvocation InfixExpression StringLiteral all assigned
println SimpleName MethodInvocation InfixExpression SimpleName all assigned
states SimpleName MethodInvocation SimpleName size
states SimpleName MethodInvocation InfixExpression NumberLiteral empty
size SimpleName MethodInvocation InfixExpression NumberLiteral empty
all assigned SimpleName InfixExpression BooleanLiteral true
empty NumberLiteral InfixExpression InfixExpression InfixExpression SimpleName all assigned
empty NumberLiteral InfixExpression InfixExpression InfixExpression BooleanLiteral true
boolean PrimitiveType VariableDeclarationStatement Block EnhancedForStatement SimpleName store
true BooleanLiteral WhileStatement Block VariableDeclarationStatement PrimitiveType boolean
true BooleanLiteral WhileStatement Block EnhancedForStatement SimpleName store
repl states SimpleName MethodInvocation SimpleName size
assert equals SimpleName MethodInvocation NumberLiteral empty
assert equals SimpleName MethodInvocation MethodInvocation SimpleName repl states
assert equals SimpleName MethodInvocation MethodInvocation SimpleName size
empty NumberLiteral MethodInvocation MethodInvocation SimpleName repl states
empty NumberLiteral MethodInvocation MethodInvocation SimpleName size
states SimpleName MethodInvocation SimpleName size
assert equals SimpleName MethodInvocation NumberLiteral empty
assert equals SimpleName MethodInvocation MethodInvocation SimpleName states
assert equals SimpleName MethodInvocation MethodInvocation SimpleName size
empty NumberLiteral MethodInvocation MethodInvocation SimpleName states
empty NumberLiteral MethodInvocation MethodInvocation SimpleName size
tablet location state SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName moved
tablet location state SimpleName SimpleType SingleVariableDeclaration SimpleName old
states SimpleName MethodInvocation SimpleName contains
states SimpleName MethodInvocation QualifiedName oldcurrent
contains SimpleName MethodInvocation QualifiedName oldcurrent
moved SimpleName Assignment SimpleName old
tablet location state SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName old locations
old SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName old locations
assert not equals SimpleName MethodInvocation SimpleName moved
c SimpleName MethodInvocation SimpleName create batch writer
c SimpleName MethodInvocation QualifiedName metadata tablename
c SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName batch writer config
create batch writer SimpleName MethodInvocation QualifiedName metadata tablename
create batch writer SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName batch writer config
metadata tablename QualifiedName MethodInvocation ClassInstanceCreation SimpleType SimpleName batch writer config
bw SimpleName VariableDeclarationFragment MethodInvocation SimpleName c
bw SimpleName VariableDeclarationFragment MethodInvocation SimpleName create batch writer
bw SimpleName VariableDeclarationFragment MethodInvocation QualifiedName metadata tablename
batch writer SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName bw
movedextent QualifiedName MethodInvocation SimpleName get metadata entry
mutation SimpleName SimpleType ClassInstanceCreation MethodInvocation QualifiedName movedextent
mutation SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get metadata entry
assignment SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName mutation
assignment SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation QualifiedName movedextent
assignment SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName get metadata entry
mutation SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName assignment
movedcurrent QualifiedName MethodInvocation SimpleName put location
movedcurrent QualifiedName MethodInvocation SimpleName assignment
put location SimpleName MethodInvocation SimpleName assignment
bw SimpleName MethodInvocation SimpleName add mutation
bw SimpleName MethodInvocation SimpleName assignment
add mutation SimpleName MethodInvocation SimpleName assignment
bw SimpleName MethodInvocation SimpleName close
wait for clean store SimpleName MethodInvocation SimpleName store
c SimpleName MethodInvocation SimpleName create batch writer
c SimpleName MethodInvocation QualifiedName metadata tablename
c SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName batch writer config
create batch writer SimpleName MethodInvocation QualifiedName metadata tablename
create batch writer SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName batch writer config
metadata tablename QualifiedName MethodInvocation ClassInstanceCreation SimpleType SimpleName batch writer config
bw SimpleName Assignment MethodInvocation SimpleName c
bw SimpleName Assignment MethodInvocation SimpleName create batch writer
bw SimpleName Assignment MethodInvocation QualifiedName metadata tablename
text SimpleName SimpleType ClassInstanceCreation QualifiedName metadata tableid
key extent SimpleName SimpleType ClassInstanceCreation ClassInstanceCreation QualifiedName metadata tableid
key extent SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get metadata entry
metadata tableid QualifiedName ClassInstanceCreation ClassInstanceCreation MethodInvocation SimpleName get metadata entry
mutation SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get metadata entry
assignment SimpleName Assignment ClassInstanceCreation SimpleType SimpleName mutation
assignment SimpleName Assignment ClassInstanceCreation MethodInvocation SimpleName get metadata entry
movedcurrent QualifiedName MethodInvocation SimpleName put location
movedcurrent QualifiedName MethodInvocation SimpleName assignment
put location SimpleName MethodInvocation SimpleName assignment
bw SimpleName MethodInvocation SimpleName add mutation
bw SimpleName MethodInvocation SimpleName assignment
add mutation SimpleName MethodInvocation SimpleName assignment
bw SimpleName MethodInvocation SimpleName close
c SimpleName MethodInvocation SimpleName get instance
root tablet state store SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName c
root tablet state store SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get instance
root tablet state store SimpleName SimpleType ClassInstanceCreation SimpleName creds
c SimpleName MethodInvocation ClassInstanceCreation SimpleName creds
get instance SimpleName MethodInvocation ClassInstanceCreation SimpleName creds
wait for clean store SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName root tablet state store
wait for clean store SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName c
wait for clean store SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get instance
wait for clean store SimpleName MethodInvocation ClassInstanceCreation SimpleName creds
true BooleanLiteral WhileStatement Block EnhancedForStatement SimpleName old locations
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test
public Modifier MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration Block WhileStatement BooleanLiteral true
public Modifier MethodDeclaration Block EnhancedForStatement SimpleName old locations
void PrimitiveType MethodDeclaration SimpleName test
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration Block WhileStatement BooleanLiteral true
void PrimitiveType MethodDeclaration Block EnhancedForStatement SimpleName old locations
test SimpleName MethodDeclaration SimpleType SimpleName exception
test SimpleName MethodDeclaration Block WhileStatement BooleanLiteral true
test SimpleName MethodDeclaration Block EnhancedForStatement SimpleName old locations
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception