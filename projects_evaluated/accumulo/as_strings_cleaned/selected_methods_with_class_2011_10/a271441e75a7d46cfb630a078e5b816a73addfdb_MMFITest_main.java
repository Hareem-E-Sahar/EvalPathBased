string SimpleName SimpleType ArrayType SingleVariableDeclaration SimpleName args
argslength QualifiedName InfixExpression NumberLiteral empty
mapfiles SimpleName Assignment ArrayCreation InfixExpression QualifiedName argslength
mapfiles SimpleName Assignment ArrayCreation InfixExpression NumberLiteral empty
cached configuration SimpleName MethodInvocation SimpleName get instance
conf SimpleName VariableDeclarationFragment MethodInvocation SimpleName cached configuration
conf SimpleName VariableDeclarationFragment MethodInvocation SimpleName get instance
configuration SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName conf
file system SimpleName MethodInvocation SimpleName get
file system SimpleName MethodInvocation SimpleName conf
get SimpleName MethodInvocation SimpleName conf
fs SimpleName VariableDeclarationFragment MethodInvocation SimpleName file system
fs SimpleName VariableDeclarationFragment MethodInvocation SimpleName get
fs SimpleName VariableDeclarationFragment MethodInvocation SimpleName conf
file system SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName fs
args SimpleName ArrayAccess NumberLiteral empty
integer SimpleName MethodInvocation SimpleName parse int
integer SimpleName MethodInvocation ArrayAccess SimpleName args
integer SimpleName MethodInvocation ArrayAccess NumberLiteral empty
parse int SimpleName MethodInvocation ArrayAccess SimpleName args
parse int SimpleName MethodInvocation ArrayAccess NumberLiteral empty
string SimpleName MethodInvocation SimpleName format
string SimpleName MethodInvocation StringLiteral row % d
string SimpleName MethodInvocation MethodInvocation SimpleName integer
string SimpleName MethodInvocation MethodInvocation SimpleName parse int
string SimpleName MethodInvocation MethodInvocation ArrayAccess SimpleName args
string SimpleName MethodInvocation MethodInvocation ArrayAccess NumberLiteral empty
format SimpleName MethodInvocation StringLiteral row % d
format SimpleName MethodInvocation MethodInvocation SimpleName integer
format SimpleName MethodInvocation MethodInvocation SimpleName parse int
format SimpleName MethodInvocation MethodInvocation ArrayAccess SimpleName args
format SimpleName MethodInvocation MethodInvocation ArrayAccess NumberLiteral empty
row % d StringLiteral MethodInvocation MethodInvocation SimpleName integer
row % d StringLiteral MethodInvocation MethodInvocation SimpleName parse int
row % d StringLiteral MethodInvocation MethodInvocation ArrayAccess SimpleName args
row % d StringLiteral MethodInvocation MethodInvocation ArrayAccess NumberLiteral empty
text SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName string
text SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName format
text SimpleName SimpleType ClassInstanceCreation MethodInvocation StringLiteral row % d
start row SimpleName Assignment ClassInstanceCreation SimpleType SimpleName text
start row SimpleName Assignment ClassInstanceCreation MethodInvocation SimpleName string
start row SimpleName Assignment ClassInstanceCreation MethodInvocation SimpleName format
start row SimpleName Assignment ClassInstanceCreation MethodInvocation StringLiteral row % d
args SimpleName ArrayAccess NumberLiteral empty
integer SimpleName MethodInvocation SimpleName parse int
integer SimpleName MethodInvocation ArrayAccess SimpleName args
integer SimpleName MethodInvocation ArrayAccess NumberLiteral empty
parse int SimpleName MethodInvocation ArrayAccess SimpleName args
parse int SimpleName MethodInvocation ArrayAccess NumberLiteral empty
string SimpleName MethodInvocation SimpleName format
string SimpleName MethodInvocation StringLiteral row % d
string SimpleName MethodInvocation MethodInvocation SimpleName integer
string SimpleName MethodInvocation MethodInvocation SimpleName parse int
string SimpleName MethodInvocation MethodInvocation ArrayAccess SimpleName args
string SimpleName MethodInvocation MethodInvocation ArrayAccess NumberLiteral empty
format SimpleName MethodInvocation StringLiteral row % d
format SimpleName MethodInvocation MethodInvocation SimpleName integer
format SimpleName MethodInvocation MethodInvocation SimpleName parse int
format SimpleName MethodInvocation MethodInvocation ArrayAccess SimpleName args
format SimpleName MethodInvocation MethodInvocation ArrayAccess NumberLiteral empty
row % d StringLiteral MethodInvocation MethodInvocation SimpleName integer
row % d StringLiteral MethodInvocation MethodInvocation SimpleName parse int
row % d StringLiteral MethodInvocation MethodInvocation ArrayAccess SimpleName args
row % d StringLiteral MethodInvocation MethodInvocation ArrayAccess NumberLiteral empty
text SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName string
text SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName format
text SimpleName SimpleType ClassInstanceCreation MethodInvocation StringLiteral row % d
prev end row SimpleName Assignment ClassInstanceCreation SimpleType SimpleName text
prev end row SimpleName Assignment ClassInstanceCreation MethodInvocation SimpleName string
prev end row SimpleName Assignment ClassInstanceCreation MethodInvocation SimpleName format
prev end row SimpleName Assignment ClassInstanceCreation MethodInvocation StringLiteral row % d
args SimpleName ArrayAccess NumberLiteral empty
integer SimpleName MethodInvocation SimpleName parse int
integer SimpleName MethodInvocation ArrayAccess SimpleName args
integer SimpleName MethodInvocation ArrayAccess NumberLiteral empty
parse int SimpleName MethodInvocation ArrayAccess SimpleName args
parse int SimpleName MethodInvocation ArrayAccess NumberLiteral empty
string SimpleName MethodInvocation SimpleName format
string SimpleName MethodInvocation StringLiteral row % d
string SimpleName MethodInvocation MethodInvocation SimpleName integer
string SimpleName MethodInvocation MethodInvocation SimpleName parse int
string SimpleName MethodInvocation MethodInvocation ArrayAccess SimpleName args
string SimpleName MethodInvocation MethodInvocation ArrayAccess NumberLiteral empty
format SimpleName MethodInvocation StringLiteral row % d
format SimpleName MethodInvocation MethodInvocation SimpleName integer
format SimpleName MethodInvocation MethodInvocation SimpleName parse int
format SimpleName MethodInvocation MethodInvocation ArrayAccess SimpleName args
format SimpleName MethodInvocation MethodInvocation ArrayAccess NumberLiteral empty
row % d StringLiteral MethodInvocation MethodInvocation SimpleName integer
row % d StringLiteral MethodInvocation MethodInvocation SimpleName parse int
row % d StringLiteral MethodInvocation MethodInvocation ArrayAccess SimpleName args
row % d StringLiteral MethodInvocation MethodInvocation ArrayAccess NumberLiteral empty
text SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName string
text SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName format
text SimpleName SimpleType ClassInstanceCreation MethodInvocation StringLiteral row % d
end row SimpleName Assignment ClassInstanceCreation SimpleType SimpleName text
end row SimpleName Assignment ClassInstanceCreation MethodInvocation SimpleName string
end row SimpleName Assignment ClassInstanceCreation MethodInvocation SimpleName format
end row SimpleName Assignment ClassInstanceCreation MethodInvocation StringLiteral row % d
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression QualifiedName argslength
i SimpleName InfixExpression NumberLiteral empty
mapfiles SimpleName ArrayAccess InfixExpression SimpleName i
mapfiles SimpleName ArrayAccess InfixExpression NumberLiteral empty
args SimpleName ArrayAccess SimpleName i
map file util SimpleName MethodInvocation SimpleName open map file
map file util SimpleName MethodInvocation CastExpression SimpleType SimpleName accumulo configuration
map file util SimpleName MethodInvocation SimpleName fs
map file util SimpleName MethodInvocation ArrayAccess SimpleName args
map file util SimpleName MethodInvocation ArrayAccess SimpleName i
map file util SimpleName MethodInvocation SimpleName conf
open map file SimpleName MethodInvocation CastExpression SimpleType SimpleName accumulo configuration
open map file SimpleName MethodInvocation SimpleName fs
open map file SimpleName MethodInvocation ArrayAccess SimpleName args
open map file SimpleName MethodInvocation ArrayAccess SimpleName i
open map file SimpleName MethodInvocation SimpleName conf
accumulo configuration SimpleName SimpleType CastExpression MethodInvocation SimpleName fs
accumulo configuration SimpleName SimpleType CastExpression MethodInvocation SimpleName conf
fs SimpleName MethodInvocation ArrayAccess SimpleName args
fs SimpleName MethodInvocation ArrayAccess SimpleName i
fs SimpleName MethodInvocation SimpleName conf
args SimpleName ArrayAccess MethodInvocation SimpleName conf
i SimpleName ArrayAccess MethodInvocation SimpleName conf
mapfiles SimpleName ArrayAccess Assignment MethodInvocation SimpleName map file util
mapfiles SimpleName ArrayAccess Assignment MethodInvocation SimpleName open map file
mapfiles SimpleName ArrayAccess Assignment MethodInvocation SimpleName fs
mapfiles SimpleName ArrayAccess Assignment MethodInvocation SimpleName conf
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression QualifiedName argslength
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
argslength QualifiedName InfixExpression ForStatement PostfixExpression SimpleName i
io exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
my map filereader QualifiedName SimpleType SingleVariableDeclaration SimpleName r
r SimpleName MethodInvocation SimpleName close
io exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
my map filereader QualifiedName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName mapfiles
r SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName mapfiles
runtime exception SimpleName SimpleType ClassInstanceCreation SimpleName e
sorted key value iterator SimpleName SimpleType ParameterizedType SimpleType SimpleName key
sorted key value iterator SimpleName SimpleType ParameterizedType SimpleType SimpleName value
key SimpleName SimpleType ParameterizedType SimpleType SimpleName value
sorted key value iterator SimpleName SimpleType ParameterizedType SimpleType SimpleName key
sorted key value iterator SimpleName SimpleType ParameterizedType SimpleType SimpleName value
key SimpleName SimpleType ParameterizedType SimpleType SimpleName value
array list SimpleName SimpleType ParameterizedType ClassInstanceCreation QualifiedName mapfileslength
iters SimpleName VariableDeclarationFragment ClassInstanceCreation QualifiedName mapfileslength
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression QualifiedName mapfileslength
mapfiles SimpleName ArrayAccess SimpleName i
iters SimpleName MethodInvocation SimpleName add
iters SimpleName MethodInvocation ArrayAccess SimpleName mapfiles
iters SimpleName MethodInvocation ArrayAccess SimpleName i
add SimpleName MethodInvocation ArrayAccess SimpleName mapfiles
add SimpleName MethodInvocation ArrayAccess SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression QualifiedName mapfileslength
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
mapfileslength QualifiedName InfixExpression ForStatement PostfixExpression SimpleName i
text SimpleName SimpleType ClassInstanceCreation StringLiteral empty
key extent SimpleName SimpleType ClassInstanceCreation ClassInstanceCreation StringLiteral empty
key extent SimpleName SimpleType ClassInstanceCreation SimpleName end row
key extent SimpleName SimpleType ClassInstanceCreation SimpleName prev end row
text SimpleName SimpleType ClassInstanceCreation ClassInstanceCreation SimpleName end row
empty StringLiteral ClassInstanceCreation ClassInstanceCreation SimpleName end row
text SimpleName SimpleType ClassInstanceCreation ClassInstanceCreation SimpleName prev end row
empty StringLiteral ClassInstanceCreation ClassInstanceCreation SimpleName prev end row
end row SimpleName ClassInstanceCreation SimpleName prev end row
multi iterator SimpleName SimpleType ClassInstanceCreation SimpleName iters
multi iterator SimpleName SimpleType ClassInstanceCreation ClassInstanceCreation SimpleName end row
multi iterator SimpleName SimpleType ClassInstanceCreation ClassInstanceCreation SimpleName prev end row
iters SimpleName ClassInstanceCreation ClassInstanceCreation SimpleType SimpleName key extent
iters SimpleName ClassInstanceCreation ClassInstanceCreation ClassInstanceCreation StringLiteral empty
iters SimpleName ClassInstanceCreation ClassInstanceCreation SimpleName end row
iters SimpleName ClassInstanceCreation ClassInstanceCreation SimpleName prev end row
mmfi SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName multi iterator
mmfi SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName iters
mmfi SimpleName VariableDeclarationFragment ClassInstanceCreation ClassInstanceCreation SimpleName end row
mmfi SimpleName VariableDeclarationFragment ClassInstanceCreation ClassInstanceCreation SimpleName prev end row
multi iterator SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName mmfi
key SimpleName SimpleType ClassInstanceCreation SimpleName start row
range SimpleName SimpleType ClassInstanceCreation ClassInstanceCreation SimpleName start row
mmfi SimpleName MethodInvocation SimpleName seek
mmfi SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName range
mmfi SimpleName MethodInvocation ClassInstanceCreation ClassInstanceCreation SimpleName start row
mmfi SimpleName MethodInvocation QualifiedName locality group utilempty cf set
mmfi SimpleName MethodInvocation BooleanLiteral false
seek SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName range
seek SimpleName MethodInvocation ClassInstanceCreation ClassInstanceCreation SimpleName start row
seek SimpleName MethodInvocation QualifiedName locality group utilempty cf set
seek SimpleName MethodInvocation BooleanLiteral false
range SimpleName SimpleType ClassInstanceCreation MethodInvocation QualifiedName locality group utilempty cf set
start row SimpleName ClassInstanceCreation ClassInstanceCreation MethodInvocation QualifiedName locality group utilempty cf set
range SimpleName SimpleType ClassInstanceCreation MethodInvocation BooleanLiteral false
start row SimpleName ClassInstanceCreation ClassInstanceCreation MethodInvocation BooleanLiteral false
locality group utilempty cf set QualifiedName MethodInvocation BooleanLiteral false
count SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName count
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment NumberLiteral empty
system SimpleName MethodInvocation SimpleName current time millis
t SimpleName VariableDeclarationFragment MethodInvocation SimpleName system
t SimpleName VariableDeclarationFragment MethodInvocation SimpleName current time millis
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName t
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName system
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName current time millis
last key SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName key
key SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName last key
mmfi SimpleName MethodInvocation SimpleName has top
mmfi SimpleName MethodInvocation SimpleName get top key
key SimpleName VariableDeclarationFragment MethodInvocation SimpleName mmfi
key SimpleName VariableDeclarationFragment MethodInvocation SimpleName get top key
key SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName key
last key SimpleName MethodInvocation SimpleName compare to
last key SimpleName MethodInvocation SimpleName key
compare to SimpleName MethodInvocation SimpleName key
last key SimpleName MethodInvocation InfixExpression NumberLiteral empty
compare to SimpleName MethodInvocation InfixExpression NumberLiteral empty
key SimpleName MethodInvocation InfixExpression NumberLiteral empty
not sorted : StringLiteral InfixExpression SimpleName last key
not sorted : StringLiteral InfixExpression StringLiteral empty
not sorted : StringLiteral InfixExpression SimpleName key
last key SimpleName InfixExpression StringLiteral empty
last key SimpleName InfixExpression SimpleName key
empty StringLiteral InfixExpression SimpleName key
msg SimpleName VariableDeclarationFragment InfixExpression StringLiteral not sorted :
msg SimpleName VariableDeclarationFragment InfixExpression SimpleName last key
msg SimpleName VariableDeclarationFragment InfixExpression StringLiteral empty
msg SimpleName VariableDeclarationFragment InfixExpression SimpleName key
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName msg
systemerr QualifiedName MethodInvocation SimpleName println
systemerr QualifiedName MethodInvocation SimpleName msg
println SimpleName MethodInvocation SimpleName msg
runtime exception SimpleName SimpleType ClassInstanceCreation SimpleName msg
last key SimpleName MethodInvocation SimpleName set
last key SimpleName MethodInvocation SimpleName key
set SimpleName MethodInvocation SimpleName key
empty StringLiteral InfixExpression SimpleName key
systemout QualifiedName MethodInvocation SimpleName println
systemout QualifiedName MethodInvocation InfixExpression StringLiteral empty
systemout QualifiedName MethodInvocation InfixExpression SimpleName key
println SimpleName MethodInvocation InfixExpression StringLiteral empty
println SimpleName MethodInvocation InfixExpression SimpleName key
mmfi SimpleName MethodInvocation SimpleName next
system SimpleName MethodInvocation SimpleName current time millis
t SimpleName VariableDeclarationFragment MethodInvocation SimpleName system
t SimpleName VariableDeclarationFragment MethodInvocation SimpleName current time millis
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName t
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName system
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName current time millis
t SimpleName InfixExpression SimpleName t
t SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral .
t SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral .
time SimpleName VariableDeclarationFragment InfixExpression NumberLiteral .
double PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName time
double PrimitiveType VariableDeclarationStatement VariableDeclarationFragment InfixExpression NumberLiteral .
count SimpleName InfixExpression SimpleName time
systemout QualifiedName MethodInvocation SimpleName printf
systemout QualifiedName MethodInvocation StringLiteral count : d time : % . f rate : % . f
systemout QualifiedName MethodInvocation SimpleName count
systemout QualifiedName MethodInvocation SimpleName time
systemout QualifiedName MethodInvocation InfixExpression SimpleName count
systemout QualifiedName MethodInvocation InfixExpression SimpleName time
printf SimpleName MethodInvocation StringLiteral count : d time : % . f rate : % . f
printf SimpleName MethodInvocation SimpleName count
printf SimpleName MethodInvocation SimpleName time
printf SimpleName MethodInvocation InfixExpression SimpleName count
printf SimpleName MethodInvocation InfixExpression SimpleName time
count : d time : % . f rate : % . f StringLiteral MethodInvocation SimpleName count
count : d time : % . f rate : % . f StringLiteral MethodInvocation SimpleName time
count : d time : % . f rate : % . f StringLiteral MethodInvocation InfixExpression SimpleName count
count : d time : % . f rate : % . f StringLiteral MethodInvocation InfixExpression SimpleName time
count SimpleName MethodInvocation SimpleName time
count SimpleName MethodInvocation InfixExpression SimpleName count
count SimpleName MethodInvocation InfixExpression SimpleName time
time SimpleName MethodInvocation InfixExpression SimpleName count
time SimpleName MethodInvocation InfixExpression SimpleName time
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType long
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType long
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType double
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType long
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType double
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType double
io exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
runtime exception SimpleName SimpleType ClassInstanceCreation SimpleName e
my map filereader QualifiedName SimpleType SingleVariableDeclaration SimpleName r
r SimpleName MethodInvocation SimpleName close
io exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
my map filereader QualifiedName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName mapfiles
r SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName mapfiles
public Modifier MethodDeclaration Modifier static
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName main
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName args
static Modifier MethodDeclaration PrimitiveType void
static Modifier MethodDeclaration SimpleName main
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName args
void PrimitiveType MethodDeclaration SimpleName main
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName args
main SimpleName MethodDeclaration SingleVariableDeclaration SimpleName args
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration Modifier static
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName main
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName args
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration Modifier static
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName main
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName args
