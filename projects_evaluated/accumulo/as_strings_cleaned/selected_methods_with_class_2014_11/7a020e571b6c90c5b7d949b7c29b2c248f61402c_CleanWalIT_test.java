conn SimpleName VariableDeclarationFragment MethodInvocation SimpleName get connector
connector SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName conn
get unique names SimpleName MethodInvocation NumberLiteral empty
get unique names SimpleName MethodInvocation ArrayAccess NumberLiteral empty
empty NumberLiteral MethodInvocation ArrayAccess NumberLiteral empty
table name SimpleName VariableDeclarationFragment ArrayAccess MethodInvocation SimpleName get unique names
table name SimpleName VariableDeclarationFragment ArrayAccess MethodInvocation NumberLiteral empty
table name SimpleName VariableDeclarationFragment ArrayAccess NumberLiteral empty
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table name
conn SimpleName MethodInvocation SimpleName table operations
conn SimpleName MethodInvocation MethodInvocation SimpleName create
table operations SimpleName MethodInvocation MethodInvocation SimpleName create
conn SimpleName MethodInvocation MethodInvocation SimpleName table name
table operations SimpleName MethodInvocation MethodInvocation SimpleName table name
create SimpleName MethodInvocation SimpleName table name
conn SimpleName MethodInvocation SimpleName create batch writer
conn SimpleName MethodInvocation SimpleName table name
conn SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName batch writer config
create batch writer SimpleName MethodInvocation SimpleName table name
create batch writer SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName batch writer config
table name SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName batch writer config
bw SimpleName VariableDeclarationFragment MethodInvocation SimpleName conn
bw SimpleName VariableDeclarationFragment MethodInvocation SimpleName create batch writer
bw SimpleName VariableDeclarationFragment MethodInvocation SimpleName table name
batch writer SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName bw
mutation SimpleName SimpleType ClassInstanceCreation StringLiteral row
m SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName mutation
m SimpleName VariableDeclarationFragment ClassInstanceCreation StringLiteral row
mutation SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName m
m SimpleName MethodInvocation SimpleName put
m SimpleName MethodInvocation StringLiteral cf
m SimpleName MethodInvocation StringLiteral cq
m SimpleName MethodInvocation StringLiteral value
put SimpleName MethodInvocation StringLiteral cf
put SimpleName MethodInvocation StringLiteral cq
put SimpleName MethodInvocation StringLiteral value
cf StringLiteral MethodInvocation StringLiteral cq
cf StringLiteral MethodInvocation StringLiteral value
cq StringLiteral MethodInvocation StringLiteral value
bw SimpleName MethodInvocation SimpleName add mutation
bw SimpleName MethodInvocation SimpleName m
add mutation SimpleName MethodInvocation SimpleName m
bw SimpleName MethodInvocation SimpleName close
get cluster SimpleName MethodInvocation MethodInvocation SimpleName get cluster control
get cluster SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName stop all servers
get cluster control SimpleName MethodInvocation MethodInvocation SimpleName stop all servers
get cluster SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName server typetablet server
get cluster control SimpleName MethodInvocation MethodInvocation QualifiedName server typetablet server
stop all servers SimpleName MethodInvocation QualifiedName server typetablet server
get cluster SimpleName MethodInvocation MethodInvocation SimpleName get cluster control
get cluster SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName start all servers
get cluster control SimpleName MethodInvocation MethodInvocation SimpleName start all servers
get cluster SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName server typetablet server
get cluster control SimpleName MethodInvocation MethodInvocation QualifiedName server typetablet server
start all servers SimpleName MethodInvocation QualifiedName server typetablet server
string SimpleName SimpleType SingleVariableDeclaration SimpleName table
metadata tablename QualifiedName ArrayInitializer QualifiedName root tablename
conn SimpleName MethodInvocation SimpleName table operations
conn SimpleName MethodInvocation MethodInvocation SimpleName flush
table operations SimpleName MethodInvocation MethodInvocation SimpleName flush
conn SimpleName MethodInvocation MethodInvocation SimpleName table
table operations SimpleName MethodInvocation MethodInvocation SimpleName table
conn SimpleName MethodInvocation MethodInvocation BooleanLiteral true
table operations SimpleName MethodInvocation MethodInvocation BooleanLiteral true
flush SimpleName MethodInvocation SimpleName table
flush SimpleName MethodInvocation BooleanLiteral true
table SimpleName MethodInvocation BooleanLiteral true
checking entries for StringLiteral InfixExpression SimpleName table name
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation InfixExpression StringLiteral checking entries for
log SimpleName MethodInvocation InfixExpression SimpleName table name
debug SimpleName MethodInvocation InfixExpression StringLiteral checking entries for
debug SimpleName MethodInvocation InfixExpression SimpleName table name
count SimpleName MethodInvocation SimpleName table name
count SimpleName MethodInvocation SimpleName conn
table name SimpleName MethodInvocation SimpleName conn
assert equals SimpleName MethodInvocation NumberLiteral empty
assert equals SimpleName MethodInvocation MethodInvocation SimpleName count
assert equals SimpleName MethodInvocation MethodInvocation SimpleName table name
assert equals SimpleName MethodInvocation MethodInvocation SimpleName conn
empty NumberLiteral MethodInvocation MethodInvocation SimpleName count
empty NumberLiteral MethodInvocation MethodInvocation SimpleName table name
empty NumberLiteral MethodInvocation MethodInvocation SimpleName conn
string SimpleName SimpleType SingleVariableDeclaration SimpleName table
metadata tablename QualifiedName ArrayInitializer QualifiedName root tablename
checking logs for StringLiteral InfixExpression SimpleName table
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation InfixExpression StringLiteral checking logs for
log SimpleName MethodInvocation InfixExpression SimpleName table
debug SimpleName MethodInvocation InfixExpression StringLiteral checking logs for
debug SimpleName MethodInvocation InfixExpression SimpleName table
found logs for StringLiteral InfixExpression SimpleName table
count logs SimpleName MethodInvocation SimpleName table
count logs SimpleName MethodInvocation SimpleName conn
table SimpleName MethodInvocation SimpleName conn
assert equals SimpleName MethodInvocation InfixExpression StringLiteral found logs for
assert equals SimpleName MethodInvocation InfixExpression SimpleName table
assert equals SimpleName MethodInvocation NumberLiteral empty
assert equals SimpleName MethodInvocation MethodInvocation SimpleName count logs
assert equals SimpleName MethodInvocation MethodInvocation SimpleName table
assert equals SimpleName MethodInvocation MethodInvocation SimpleName conn
found logs for StringLiteral InfixExpression MethodInvocation NumberLiteral empty
table SimpleName InfixExpression MethodInvocation NumberLiteral empty
found logs for StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName count logs
found logs for StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName table
found logs for StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName conn
table SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName count logs
table SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName table
table SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName conn
empty NumberLiteral MethodInvocation MethodInvocation SimpleName count logs
empty NumberLiteral MethodInvocation MethodInvocation SimpleName table
empty NumberLiteral MethodInvocation MethodInvocation SimpleName conn
conn SimpleName MethodInvocation SimpleName create batch writer
conn SimpleName MethodInvocation SimpleName table name
conn SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName batch writer config
create batch writer SimpleName MethodInvocation SimpleName table name
create batch writer SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName batch writer config
table name SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName batch writer config
bw SimpleName Assignment MethodInvocation SimpleName conn
bw SimpleName Assignment MethodInvocation SimpleName create batch writer
bw SimpleName Assignment MethodInvocation SimpleName table name
mutation SimpleName SimpleType ClassInstanceCreation StringLiteral row
m SimpleName Assignment ClassInstanceCreation SimpleType SimpleName mutation
m SimpleName Assignment ClassInstanceCreation StringLiteral row
m SimpleName MethodInvocation SimpleName put delete
m SimpleName MethodInvocation StringLiteral cf
m SimpleName MethodInvocation StringLiteral cq
put delete SimpleName MethodInvocation StringLiteral cf
put delete SimpleName MethodInvocation StringLiteral cq
cf StringLiteral MethodInvocation StringLiteral cq
bw SimpleName MethodInvocation SimpleName add mutation
bw SimpleName MethodInvocation SimpleName m
add mutation SimpleName MethodInvocation SimpleName m
bw SimpleName MethodInvocation SimpleName close
count SimpleName MethodInvocation SimpleName table name
count SimpleName MethodInvocation SimpleName conn
table name SimpleName MethodInvocation SimpleName conn
assert equals SimpleName MethodInvocation NumberLiteral empty
assert equals SimpleName MethodInvocation MethodInvocation SimpleName count
assert equals SimpleName MethodInvocation MethodInvocation SimpleName table name
assert equals SimpleName MethodInvocation MethodInvocation SimpleName conn
empty NumberLiteral MethodInvocation MethodInvocation SimpleName count
empty NumberLiteral MethodInvocation MethodInvocation SimpleName table name
empty NumberLiteral MethodInvocation MethodInvocation SimpleName conn
conn SimpleName MethodInvocation SimpleName table operations
conn SimpleName MethodInvocation MethodInvocation SimpleName flush
table operations SimpleName MethodInvocation MethodInvocation SimpleName flush
conn SimpleName MethodInvocation MethodInvocation SimpleName table name
table operations SimpleName MethodInvocation MethodInvocation SimpleName table name
conn SimpleName MethodInvocation MethodInvocation BooleanLiteral true
table operations SimpleName MethodInvocation MethodInvocation BooleanLiteral true
flush SimpleName MethodInvocation SimpleName table name
flush SimpleName MethodInvocation BooleanLiteral true
table name SimpleName MethodInvocation BooleanLiteral true
conn SimpleName MethodInvocation SimpleName table operations
conn SimpleName MethodInvocation MethodInvocation SimpleName flush
table operations SimpleName MethodInvocation MethodInvocation SimpleName flush
conn SimpleName MethodInvocation MethodInvocation QualifiedName metadata tablename
table operations SimpleName MethodInvocation MethodInvocation QualifiedName metadata tablename
conn SimpleName MethodInvocation MethodInvocation BooleanLiteral true
table operations SimpleName MethodInvocation MethodInvocation BooleanLiteral true
flush SimpleName MethodInvocation QualifiedName metadata tablename
flush SimpleName MethodInvocation BooleanLiteral true
metadata tablename QualifiedName MethodInvocation BooleanLiteral true
conn SimpleName MethodInvocation SimpleName table operations
conn SimpleName MethodInvocation MethodInvocation SimpleName flush
table operations SimpleName MethodInvocation MethodInvocation SimpleName flush
conn SimpleName MethodInvocation MethodInvocation QualifiedName root tablename
table operations SimpleName MethodInvocation MethodInvocation QualifiedName root tablename
conn SimpleName MethodInvocation MethodInvocation BooleanLiteral true
table operations SimpleName MethodInvocation MethodInvocation BooleanLiteral true
flush SimpleName MethodInvocation QualifiedName root tablename
flush SimpleName MethodInvocation BooleanLiteral true
root tablename QualifiedName MethodInvocation BooleanLiteral true
get cluster SimpleName MethodInvocation MethodInvocation SimpleName get cluster control
get cluster SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName stop all servers
get cluster control SimpleName MethodInvocation MethodInvocation SimpleName stop all servers
get cluster SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName server typetablet server
get cluster control SimpleName MethodInvocation MethodInvocation QualifiedName server typetablet server
stop all servers SimpleName MethodInvocation QualifiedName server typetablet server
empty NumberLiteral InfixExpression NumberLiteral empty
util wait thread SimpleName MethodInvocation SimpleName sleep
util wait thread SimpleName MethodInvocation InfixExpression NumberLiteral empty
util wait thread SimpleName MethodInvocation InfixExpression NumberLiteral empty
sleep SimpleName MethodInvocation InfixExpression NumberLiteral empty
sleep SimpleName MethodInvocation InfixExpression NumberLiteral empty
get cluster SimpleName MethodInvocation MethodInvocation SimpleName get cluster control
get cluster SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName start all servers
get cluster control SimpleName MethodInvocation MethodInvocation SimpleName start all servers
get cluster SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName server typetablet server
get cluster control SimpleName MethodInvocation MethodInvocation QualifiedName server typetablet server
start all servers SimpleName MethodInvocation QualifiedName server typetablet server
count SimpleName MethodInvocation SimpleName table name
count SimpleName MethodInvocation SimpleName conn
table name SimpleName MethodInvocation SimpleName conn
assert equals SimpleName MethodInvocation NumberLiteral empty
assert equals SimpleName MethodInvocation MethodInvocation SimpleName count
assert equals SimpleName MethodInvocation MethodInvocation SimpleName table name
assert equals SimpleName MethodInvocation MethodInvocation SimpleName conn
empty NumberLiteral MethodInvocation MethodInvocation SimpleName count
empty NumberLiteral MethodInvocation MethodInvocation SimpleName table name
empty NumberLiteral MethodInvocation MethodInvocation SimpleName conn
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test
public Modifier MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration SimpleName test
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
test SimpleName MethodDeclaration SimpleType SimpleName exception
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
