data provider SimpleName MemberValuePair StringLiteral dsl order by queries provider
test SimpleName NormalAnnotation MemberValuePair SimpleName data provider
test SimpleName NormalAnnotation MemberValuePair StringLiteral dsl order by queries provider
string SimpleName SimpleType SingleVariableDeclaration SimpleName dsl query
integer SimpleName SimpleType SingleVariableDeclaration SimpleName expected num rows
string SimpleName SimpleType SingleVariableDeclaration SimpleName order by
boolean PrimitiveType SingleVariableDeclaration SimpleName ascending
executing dsl query = StringLiteral InfixExpression SimpleName dsl query
systemout QualifiedName MethodInvocation SimpleName println
systemout QualifiedName MethodInvocation InfixExpression StringLiteral executing dsl query =
systemout QualifiedName MethodInvocation InfixExpression SimpleName dsl query
println SimpleName MethodInvocation InfixExpression StringLiteral executing dsl query =
println SimpleName MethodInvocation InfixExpression SimpleName dsl query
search by dsl SimpleName MethodInvocation SimpleName dsl query
json results SimpleName VariableDeclarationFragment MethodInvocation SimpleName search by dsl
json results SimpleName VariableDeclarationFragment MethodInvocation SimpleName dsl query
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
assert equals SimpleName MethodInvocation MethodInvocation SimpleName rows
assert equals SimpleName MethodInvocation MethodInvocation SimpleName length
assert equals SimpleName MethodInvocation MethodInvocation SimpleName expected num rows
assert equals SimpleName MethodInvocation MethodInvocation SimpleName int value
rows SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName expected num rows
rows SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName int value
length SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName expected num rows
length SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName int value
list SimpleName SimpleType ParameterizedType SimpleType SimpleName string
array list SimpleName SimpleType ParameterizedType SimpleType SimpleName string
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
rows SimpleName MethodInvocation SimpleName length
i SimpleName InfixExpression MethodInvocation SimpleName rows
i SimpleName InfixExpression MethodInvocation SimpleName length
rows SimpleName MethodInvocation SimpleName get json object
rows SimpleName MethodInvocation SimpleName i
get json object SimpleName MethodInvocation SimpleName i
row SimpleName VariableDeclarationFragment MethodInvocation SimpleName rows
row SimpleName VariableDeclarationFragment MethodInvocation SimpleName get json object
row SimpleName VariableDeclarationFragment MethodInvocation SimpleName i
json object SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName row
row SimpleName MethodInvocation SimpleName get
row SimpleName MethodInvocation SimpleName order by
get SimpleName MethodInvocation SimpleName order by
row SimpleName MethodInvocation MethodInvocation SimpleName to string
get SimpleName MethodInvocation MethodInvocation SimpleName to string
order by SimpleName MethodInvocation MethodInvocation SimpleName to string
returned list SimpleName MethodInvocation SimpleName add
returned list SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName row
returned list SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get
returned list SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName order by
returned list SimpleName MethodInvocation MethodInvocation SimpleName to string
add SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName row
add SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get
add SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName order by
add SimpleName MethodInvocation MethodInvocation SimpleName to string
exception SimpleName SimpleType SingleVariableDeclaration SimpleName ex
ex SimpleName MethodInvocation SimpleName get message
exception occured StringLiteral InfixExpression MethodInvocation SimpleName ex
exception occured StringLiteral InfixExpression MethodInvocation SimpleName get message
exception occured StringLiteral InfixExpression StringLiteral found row
exception occured StringLiteral InfixExpression SimpleName row
ex SimpleName MethodInvocation InfixExpression StringLiteral found row
get message SimpleName MethodInvocation InfixExpression StringLiteral found row
ex SimpleName MethodInvocation InfixExpression SimpleName row
get message SimpleName MethodInvocation InfixExpression SimpleName row
found row StringLiteral InfixExpression SimpleName row
systemout QualifiedName MethodInvocation SimpleName println
systemout QualifiedName MethodInvocation InfixExpression StringLiteral exception occured
systemout QualifiedName MethodInvocation InfixExpression MethodInvocation SimpleName ex
systemout QualifiedName MethodInvocation InfixExpression MethodInvocation SimpleName get message
systemout QualifiedName MethodInvocation InfixExpression StringLiteral found row
systemout QualifiedName MethodInvocation InfixExpression SimpleName row
println SimpleName MethodInvocation InfixExpression StringLiteral exception occured
println SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName ex
println SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get message
println SimpleName MethodInvocation InfixExpression StringLiteral found row
println SimpleName MethodInvocation InfixExpression SimpleName row
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
iterator SimpleName SimpleType ParameterizedType SimpleType SimpleName string
returned list SimpleName MethodInvocation SimpleName iterator
iter SimpleName VariableDeclarationFragment MethodInvocation SimpleName returned list
iter SimpleName VariableDeclarationFragment MethodInvocation SimpleName iterator
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName current
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName prev
current SimpleName VariableDeclarationFragment VariableDeclarationStatement VariableDeclarationFragment SimpleName prev
iter SimpleName MethodInvocation SimpleName has next
prev SimpleName Assignment SimpleName current
iter SimpleName MethodInvocation SimpleName next
iter SimpleName MethodInvocation MethodInvocation SimpleName to lower case
next SimpleName MethodInvocation MethodInvocation SimpleName to lower case
current SimpleName Assignment MethodInvocation MethodInvocation SimpleName iter
current SimpleName Assignment MethodInvocation MethodInvocation SimpleName next
current SimpleName Assignment MethodInvocation SimpleName to lower case
prev SimpleName MethodInvocation SimpleName compare to
prev SimpleName MethodInvocation SimpleName current
compare to SimpleName MethodInvocation SimpleName current
prev SimpleName MethodInvocation InfixExpression NumberLiteral empty
compare to SimpleName MethodInvocation InfixExpression NumberLiteral empty
current SimpleName MethodInvocation InfixExpression NumberLiteral empty
prev SimpleName InfixExpression InfixExpression InfixExpression NumberLiteral empty
prev SimpleName MethodInvocation SimpleName compare to
prev SimpleName MethodInvocation SimpleName current
compare to SimpleName MethodInvocation SimpleName current
prev SimpleName MethodInvocation InfixExpression NumberLiteral empty
compare to SimpleName MethodInvocation InfixExpression NumberLiteral empty
current SimpleName MethodInvocation InfixExpression NumberLiteral empty
prev SimpleName InfixExpression StringLiteral is greater than
prev SimpleName InfixExpression SimpleName current
is greater than StringLiteral InfixExpression SimpleName current
assert SimpleName MethodInvocation SimpleName assert true
assert SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName prev
assert SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName compare to
assert SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName current
assert SimpleName MethodInvocation InfixExpression NumberLiteral empty
assert SimpleName MethodInvocation InfixExpression SimpleName prev
assert SimpleName MethodInvocation InfixExpression StringLiteral is greater than
assert SimpleName MethodInvocation InfixExpression SimpleName current
assert true SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName prev
assert true SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName compare to
assert true SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName current
assert true SimpleName MethodInvocation InfixExpression NumberLiteral empty
assert true SimpleName MethodInvocation InfixExpression SimpleName prev
assert true SimpleName MethodInvocation InfixExpression StringLiteral is greater than
assert true SimpleName MethodInvocation InfixExpression SimpleName current
empty NumberLiteral InfixExpression MethodInvocation InfixExpression SimpleName prev
empty NumberLiteral InfixExpression MethodInvocation InfixExpression StringLiteral is greater than
empty NumberLiteral InfixExpression MethodInvocation InfixExpression SimpleName current
prev SimpleName MethodInvocation SimpleName compare to
prev SimpleName MethodInvocation SimpleName current
compare to SimpleName MethodInvocation SimpleName current
prev SimpleName MethodInvocation InfixExpression NumberLiteral empty
compare to SimpleName MethodInvocation InfixExpression NumberLiteral empty
current SimpleName MethodInvocation InfixExpression NumberLiteral empty
prev SimpleName InfixExpression StringLiteral is less than
prev SimpleName InfixExpression SimpleName current
is less than StringLiteral InfixExpression SimpleName current
assert SimpleName MethodInvocation SimpleName assert true
assert SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName prev
assert SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName compare to
assert SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName current
assert SimpleName MethodInvocation InfixExpression NumberLiteral empty
assert SimpleName MethodInvocation InfixExpression SimpleName prev
assert SimpleName MethodInvocation InfixExpression StringLiteral is less than
assert SimpleName MethodInvocation InfixExpression SimpleName current
assert true SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName prev
assert true SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName compare to
assert true SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName current
assert true SimpleName MethodInvocation InfixExpression NumberLiteral empty
assert true SimpleName MethodInvocation InfixExpression SimpleName prev
assert true SimpleName MethodInvocation InfixExpression StringLiteral is less than
assert true SimpleName MethodInvocation InfixExpression SimpleName current
empty NumberLiteral InfixExpression MethodInvocation InfixExpression SimpleName prev
empty NumberLiteral InfixExpression MethodInvocation InfixExpression StringLiteral is less than
empty NumberLiteral InfixExpression MethodInvocation InfixExpression SimpleName current
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
test SimpleName NormalAnnotation MethodDeclaration Modifier public
data provider SimpleName MemberValuePair NormalAnnotation MethodDeclaration Modifier public
dsl order by queries provider StringLiteral MemberValuePair NormalAnnotation MethodDeclaration Modifier public
test SimpleName NormalAnnotation MethodDeclaration PrimitiveType void
data provider SimpleName MemberValuePair NormalAnnotation MethodDeclaration PrimitiveType void
dsl order by queries provider StringLiteral MemberValuePair NormalAnnotation MethodDeclaration PrimitiveType void
test SimpleName NormalAnnotation MethodDeclaration SimpleName test search by dsl queries with order by
data provider SimpleName MemberValuePair NormalAnnotation MethodDeclaration SimpleName test search by dsl queries with order by
dsl order by queries provider StringLiteral MemberValuePair NormalAnnotation MethodDeclaration SimpleName test search by dsl queries with order by
test SimpleName NormalAnnotation MethodDeclaration SingleVariableDeclaration SimpleName dsl query
test SimpleName NormalAnnotation MethodDeclaration SingleVariableDeclaration SimpleName expected num rows
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test search by dsl queries with order by
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName dsl query
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName integer
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName expected num rows
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName order by
void PrimitiveType MethodDeclaration SimpleName test search by dsl queries with order by
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName dsl query
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName integer
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName expected num rows
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName order by
void PrimitiveType MethodDeclaration SingleVariableDeclaration PrimitiveType boolean
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName ascending
test search by dsl queries with order by SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
test search by dsl queries with order by SimpleName MethodDeclaration SingleVariableDeclaration SimpleName dsl query
test search by dsl queries with order by SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName integer
test search by dsl queries with order by SimpleName MethodDeclaration SingleVariableDeclaration SimpleName expected num rows
test search by dsl queries with order by SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
test search by dsl queries with order by SimpleName MethodDeclaration SingleVariableDeclaration SimpleName order by
test search by dsl queries with order by SimpleName MethodDeclaration SingleVariableDeclaration PrimitiveType boolean
test search by dsl queries with order by SimpleName MethodDeclaration SingleVariableDeclaration SimpleName ascending
test search by dsl queries with order by SimpleName MethodDeclaration SimpleType SimpleName exception
dsl query SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName expected num rows
dsl query SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName order by
dsl query SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType boolean
dsl query SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName ascending
dsl query SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
expected num rows SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName order by
expected num rows SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType boolean
expected num rows SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName ascending
expected num rows SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
order by SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType boolean
order by SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName ascending
order by SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
boolean PrimitiveType SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
ascending SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration NormalAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test search by dsl queries with order by
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName dsl query
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName expected num rows
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName order by
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType boolean
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName ascending
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration NormalAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test search by dsl queries with order by
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName dsl query
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName expected num rows
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName order by
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType boolean
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName ascending
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
