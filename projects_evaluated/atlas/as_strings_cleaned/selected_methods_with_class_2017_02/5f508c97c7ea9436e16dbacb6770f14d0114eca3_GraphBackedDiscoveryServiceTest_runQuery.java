string SimpleName SimpleType SingleVariableDeclaration SimpleName dsl query
integer SimpleName SimpleType SingleVariableDeclaration SimpleName expected num rows
int PrimitiveType SingleVariableDeclaration SimpleName limit param
int PrimitiveType SingleVariableDeclaration SimpleName offset param
executing dsl query = StringLiteral InfixExpression SimpleName dsl query
systemout QualifiedName MethodInvocation SimpleName println
systemout QualifiedName MethodInvocation InfixExpression StringLiteral executing dsl query =
systemout QualifiedName MethodInvocation InfixExpression SimpleName dsl query
println SimpleName MethodInvocation InfixExpression StringLiteral executing dsl query =
println SimpleName MethodInvocation InfixExpression SimpleName dsl query
query params SimpleName SimpleType ClassInstanceCreation SimpleName limit param
query params SimpleName SimpleType ClassInstanceCreation SimpleName offset param
limit param SimpleName ClassInstanceCreation SimpleName offset param
discovery service SimpleName MethodInvocation SimpleName search by dsl
discovery service SimpleName MethodInvocation SimpleName dsl query
discovery service SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName query params
discovery service SimpleName MethodInvocation ClassInstanceCreation SimpleName limit param
discovery service SimpleName MethodInvocation ClassInstanceCreation SimpleName offset param
search by dsl SimpleName MethodInvocation SimpleName dsl query
search by dsl SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName query params
search by dsl SimpleName MethodInvocation ClassInstanceCreation SimpleName limit param
search by dsl SimpleName MethodInvocation ClassInstanceCreation SimpleName offset param
dsl query SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName query params
dsl query SimpleName MethodInvocation ClassInstanceCreation SimpleName limit param
dsl query SimpleName MethodInvocation ClassInstanceCreation SimpleName offset param
json results SimpleName VariableDeclarationFragment MethodInvocation SimpleName discovery service
json results SimpleName VariableDeclarationFragment MethodInvocation SimpleName search by dsl
json results SimpleName VariableDeclarationFragment MethodInvocation SimpleName dsl query
json results SimpleName VariableDeclarationFragment MethodInvocation ClassInstanceCreation SimpleName limit param
json results SimpleName VariableDeclarationFragment MethodInvocation ClassInstanceCreation SimpleName offset param
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName json results
assert not null SimpleName MethodInvocation SimpleName json results
json object SimpleName SimpleType ClassInstanceCreation SimpleName json results
results SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName json object
results SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName json results
json object SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName results
results SimpleName MethodInvocation SimpleName length
assert equals SimpleName MethodInvocation MethodInvocation SimpleName results
assert equals SimpleName MethodInvocation MethodInvocation SimpleName length
assert equals SimpleName MethodInvocation NumberLiteral empty
results SimpleName MethodInvocation MethodInvocation NumberLiteral empty
length SimpleName MethodInvocation MethodInvocation NumberLiteral empty
results = StringLiteral InfixExpression SimpleName results
systemout QualifiedName MethodInvocation SimpleName println
systemout QualifiedName MethodInvocation InfixExpression StringLiteral results =
systemout QualifiedName MethodInvocation InfixExpression SimpleName results
println SimpleName MethodInvocation InfixExpression StringLiteral results =
println SimpleName MethodInvocation InfixExpression SimpleName results
results SimpleName MethodInvocation SimpleName get
results SimpleName MethodInvocation StringLiteral query
get SimpleName MethodInvocation StringLiteral query
query SimpleName VariableDeclarationFragment MethodInvocation SimpleName results
query SimpleName VariableDeclarationFragment MethodInvocation SimpleName get
query SimpleName VariableDeclarationFragment MethodInvocation StringLiteral query
object SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName query
assert not null SimpleName MethodInvocation SimpleName query
results SimpleName MethodInvocation SimpleName get json object
results SimpleName MethodInvocation StringLiteral data type
get json object SimpleName MethodInvocation StringLiteral data type
data type SimpleName VariableDeclarationFragment MethodInvocation SimpleName results
data type SimpleName VariableDeclarationFragment MethodInvocation SimpleName get json object
data type SimpleName VariableDeclarationFragment MethodInvocation StringLiteral data type
json object SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName data type
assert not null SimpleName MethodInvocation SimpleName data type
data type SimpleName MethodInvocation SimpleName get string
data type SimpleName MethodInvocation StringLiteral type name
get string SimpleName MethodInvocation StringLiteral type name
type name SimpleName VariableDeclarationFragment MethodInvocation SimpleName data type
type name SimpleName VariableDeclarationFragment MethodInvocation SimpleName get string
type name SimpleName VariableDeclarationFragment MethodInvocation StringLiteral type name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName type name
assert not null SimpleName MethodInvocation SimpleName type name
results SimpleName MethodInvocation SimpleName get json array
results SimpleName MethodInvocation StringLiteral rows
get json array SimpleName MethodInvocation StringLiteral rows
rows SimpleName VariableDeclarationFragment MethodInvocation SimpleName results
rows SimpleName VariableDeclarationFragment MethodInvocation SimpleName get json array
rows SimpleName VariableDeclarationFragment MethodInvocation StringLiteral rows
json array SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName rows
assert not null SimpleName MethodInvocation SimpleName rows
rows SimpleName MethodInvocation SimpleName length
expected num rows SimpleName MethodInvocation SimpleName int value
rows SimpleName MethodInvocation SimpleName length
query [ StringLiteral InfixExpression SimpleName dsl query
query [ StringLiteral InfixExpression StringLiteral ] returned [
query [ StringLiteral InfixExpression MethodInvocation SimpleName rows
query [ StringLiteral InfixExpression MethodInvocation SimpleName length
query [ StringLiteral InfixExpression StringLiteral ] rows expected
query [ StringLiteral InfixExpression SimpleName expected num rows
dsl query SimpleName InfixExpression StringLiteral ] returned [
dsl query SimpleName InfixExpression MethodInvocation SimpleName rows
dsl query SimpleName InfixExpression MethodInvocation SimpleName length
dsl query SimpleName InfixExpression StringLiteral ] rows expected
dsl query SimpleName InfixExpression SimpleName expected num rows
dsl query SimpleName InfixExpression StringLiteral rows
] returned [ StringLiteral InfixExpression MethodInvocation SimpleName rows
] returned [ StringLiteral InfixExpression MethodInvocation SimpleName length
] returned [ StringLiteral InfixExpression StringLiteral ] rows expected
] returned [ StringLiteral InfixExpression SimpleName expected num rows
] returned [ StringLiteral InfixExpression StringLiteral rows
rows SimpleName MethodInvocation InfixExpression StringLiteral ] rows expected
length SimpleName MethodInvocation InfixExpression StringLiteral ] rows expected
rows SimpleName MethodInvocation InfixExpression SimpleName expected num rows
length SimpleName MethodInvocation InfixExpression SimpleName expected num rows
rows SimpleName MethodInvocation InfixExpression StringLiteral rows
length SimpleName MethodInvocation InfixExpression StringLiteral rows
] rows expected StringLiteral InfixExpression SimpleName expected num rows
] rows expected StringLiteral InfixExpression StringLiteral rows
expected num rows SimpleName InfixExpression StringLiteral rows
assert equals SimpleName MethodInvocation MethodInvocation SimpleName rows
assert equals SimpleName MethodInvocation MethodInvocation SimpleName length
assert equals SimpleName MethodInvocation MethodInvocation SimpleName expected num rows
assert equals SimpleName MethodInvocation MethodInvocation SimpleName int value
assert equals SimpleName MethodInvocation InfixExpression StringLiteral query [
assert equals SimpleName MethodInvocation InfixExpression SimpleName dsl query
assert equals SimpleName MethodInvocation InfixExpression StringLiteral ] returned [
assert equals SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName rows
assert equals SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName length
assert equals SimpleName MethodInvocation InfixExpression StringLiteral ] rows expected
assert equals SimpleName MethodInvocation InfixExpression SimpleName expected num rows
assert equals SimpleName MethodInvocation InfixExpression StringLiteral rows
rows SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName expected num rows
rows SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName int value
length SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName expected num rows
length SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName int value
rows SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral query [
rows SimpleName MethodInvocation MethodInvocation InfixExpression SimpleName dsl query
rows SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral ] returned [
rows SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral ] rows expected
rows SimpleName MethodInvocation MethodInvocation InfixExpression SimpleName expected num rows
rows SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral rows
length SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral query [
length SimpleName MethodInvocation MethodInvocation InfixExpression SimpleName dsl query
length SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral ] returned [
length SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral ] rows expected
length SimpleName MethodInvocation MethodInvocation InfixExpression SimpleName expected num rows
length SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral rows
expected num rows SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral query [
expected num rows SimpleName MethodInvocation MethodInvocation InfixExpression SimpleName dsl query
expected num rows SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral ] returned [
expected num rows SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral ] rows expected
expected num rows SimpleName MethodInvocation MethodInvocation InfixExpression SimpleName expected num rows
expected num rows SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral rows
int value SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral query [
int value SimpleName MethodInvocation MethodInvocation InfixExpression SimpleName dsl query
int value SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral ] returned [
int value SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral ] rows expected
int value SimpleName MethodInvocation MethodInvocation InfixExpression SimpleName expected num rows
int value SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral rows
rows SimpleName MethodInvocation SimpleName length
query [ StringLiteral InfixExpression SimpleName dsl query
query [ StringLiteral InfixExpression StringLiteral ] returned [
query [ StringLiteral InfixExpression MethodInvocation SimpleName rows
query [ StringLiteral InfixExpression MethodInvocation SimpleName length
query [ StringLiteral InfixExpression StringLiteral ] rows
dsl query SimpleName InfixExpression StringLiteral ] returned [
dsl query SimpleName InfixExpression MethodInvocation SimpleName rows
dsl query SimpleName InfixExpression MethodInvocation SimpleName length
dsl query SimpleName InfixExpression StringLiteral ] rows
] returned [ StringLiteral InfixExpression MethodInvocation SimpleName rows
] returned [ StringLiteral InfixExpression MethodInvocation SimpleName length
] returned [ StringLiteral InfixExpression StringLiteral ] rows
rows SimpleName MethodInvocation InfixExpression StringLiteral ] rows
length SimpleName MethodInvocation InfixExpression StringLiteral ] rows
systemout QualifiedName MethodInvocation SimpleName println
systemout QualifiedName MethodInvocation InfixExpression StringLiteral query [
systemout QualifiedName MethodInvocation InfixExpression SimpleName dsl query
systemout QualifiedName MethodInvocation InfixExpression StringLiteral ] returned [
systemout QualifiedName MethodInvocation InfixExpression MethodInvocation SimpleName rows
systemout QualifiedName MethodInvocation InfixExpression MethodInvocation SimpleName length
systemout QualifiedName MethodInvocation InfixExpression StringLiteral ] rows
println SimpleName MethodInvocation InfixExpression StringLiteral query [
println SimpleName MethodInvocation InfixExpression SimpleName dsl query
println SimpleName MethodInvocation InfixExpression StringLiteral ] returned [
println SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName rows
println SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName length
println SimpleName MethodInvocation InfixExpression StringLiteral ] rows
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName run query
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName dsl query
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName integer
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName expected num rows
public Modifier MethodDeclaration SingleVariableDeclaration PrimitiveType int
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName limit param
void PrimitiveType MethodDeclaration SimpleName run query
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName dsl query
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName integer
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName expected num rows
void PrimitiveType MethodDeclaration SingleVariableDeclaration PrimitiveType int
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName limit param
void PrimitiveType MethodDeclaration SingleVariableDeclaration PrimitiveType int
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName offset param
run query SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
run query SimpleName MethodDeclaration SingleVariableDeclaration SimpleName dsl query
run query SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName integer
run query SimpleName MethodDeclaration SingleVariableDeclaration SimpleName expected num rows
run query SimpleName MethodDeclaration SingleVariableDeclaration PrimitiveType int
run query SimpleName MethodDeclaration SingleVariableDeclaration SimpleName limit param
run query SimpleName MethodDeclaration SingleVariableDeclaration PrimitiveType int
run query SimpleName MethodDeclaration SingleVariableDeclaration SimpleName offset param
run query SimpleName MethodDeclaration SimpleType SimpleName exception
dsl query SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName expected num rows
dsl query SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
dsl query SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName limit param
dsl query SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
dsl query SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName offset param
dsl query SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
expected num rows SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
expected num rows SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName limit param
expected num rows SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
expected num rows SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName offset param
expected num rows SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
int PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
int PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName offset param
limit param SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
limit param SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName offset param
int PrimitiveType SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
limit param SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
int PrimitiveType SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
offset param SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName run query
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName dsl query
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName expected num rows
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName limit param
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName offset param
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName run query
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName dsl query
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName expected num rows
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName limit param
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName offset param
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
