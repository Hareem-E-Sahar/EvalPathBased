list SimpleName SimpleType ParameterizedType SimpleType SimpleName double
array list SimpleName SimpleType ParameterizedType SimpleType SimpleName double
int PrimitiveType SingleVariableDeclaration SimpleName threads
empty NumberLiteral ArrayInitializer NumberLiteral empty
empty NumberLiteral ArrayInitializer NumberLiteral empty
empty NumberLiteral ArrayInitializer NumberLiteral empty
int PrimitiveType ArrayType ArrayCreation ArrayInitializer NumberLiteral empty
int PrimitiveType ArrayType ArrayCreation ArrayInitializer NumberLiteral empty
int PrimitiveType ArrayType ArrayCreation ArrayInitializer NumberLiteral empty
system SimpleName MethodInvocation SimpleName current time millis
now SimpleName VariableDeclarationFragment MethodInvocation SimpleName system
now SimpleName VariableDeclarationFragment MethodInvocation SimpleName current time millis
final Modifier VariableDeclarationStatement PrimitiveType long
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName now
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName system
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName current time millis
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName now
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName system
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName current time millis
long PrimitiveType ArrayType ArrayCreation SimpleName threads
counts SimpleName VariableDeclarationFragment ArrayCreation ArrayType PrimitiveType long
counts SimpleName VariableDeclarationFragment ArrayCreation SimpleName threads
final Modifier VariableDeclarationStatement ArrayType PrimitiveType long
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName counts
final Modifier VariableDeclarationStatement VariableDeclarationFragment ArrayCreation SimpleName threads
long PrimitiveType ArrayType VariableDeclarationStatement VariableDeclarationFragment SimpleName counts
temp folder SimpleName MethodInvocation SimpleName new folder
temp folder SimpleName MethodInvocation MethodInvocation SimpleName get absolute path
new folder SimpleName MethodInvocation MethodInvocation SimpleName get absolute path
in memory map SimpleName SimpleType ClassInstanceCreation BooleanLiteral false
in memory map SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get absolute path
false BooleanLiteral ClassInstanceCreation MethodInvocation MethodInvocation SimpleName temp folder
false BooleanLiteral ClassInstanceCreation MethodInvocation MethodInvocation SimpleName new folder
false BooleanLiteral ClassInstanceCreation MethodInvocation SimpleName get absolute path
imm SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName in memory map
imm SimpleName VariableDeclarationFragment ClassInstanceCreation BooleanLiteral false
imm SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName get absolute path
final Modifier VariableDeclarationStatement SimpleType SimpleName in memory map
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName imm
final Modifier VariableDeclarationStatement VariableDeclarationFragment ClassInstanceCreation BooleanLiteral false
in memory map SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName imm
executors SimpleName MethodInvocation SimpleName new fixed thread pool
executors SimpleName MethodInvocation SimpleName threads
new fixed thread pool SimpleName MethodInvocation SimpleName threads
e SimpleName VariableDeclarationFragment MethodInvocation SimpleName executors
e SimpleName VariableDeclarationFragment MethodInvocation SimpleName new fixed thread pool
e SimpleName VariableDeclarationFragment MethodInvocation SimpleName threads
executor service SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName e
j SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName j
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
j SimpleName InfixExpression SimpleName threads
thread id SimpleName VariableDeclarationFragment SimpleName j
final Modifier VariableDeclarationStatement PrimitiveType int
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName thread id
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName j
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName thread id
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName j
system SimpleName MethodInvocation SimpleName current time millis
system SimpleName MethodInvocation InfixExpression SimpleName now
current time millis SimpleName MethodInvocation InfixExpression SimpleName now
system SimpleName MethodInvocation InfixExpression InfixExpression NumberLiteral empty
current time millis SimpleName MethodInvocation InfixExpression InfixExpression NumberLiteral empty
now SimpleName InfixExpression InfixExpression NumberLiteral empty
k SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName k
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
k SimpleName InfixExpression NumberLiteral empty
mutation SimpleName SimpleType ClassInstanceCreation StringLiteral row
m SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName mutation
m SimpleName VariableDeclarationFragment ClassInstanceCreation StringLiteral row
mutation SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName m
v StringLiteral MethodInvocation SimpleName get bytes
value SimpleName SimpleType ClassInstanceCreation MethodInvocation StringLiteral v
value SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get bytes
m SimpleName MethodInvocation SimpleName put
m SimpleName MethodInvocation StringLiteral cf
m SimpleName MethodInvocation StringLiteral cq
m SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName value
m SimpleName MethodInvocation ClassInstanceCreation MethodInvocation StringLiteral v
m SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get bytes
put SimpleName MethodInvocation StringLiteral cf
put SimpleName MethodInvocation StringLiteral cq
put SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName value
put SimpleName MethodInvocation ClassInstanceCreation MethodInvocation StringLiteral v
put SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get bytes
cf StringLiteral MethodInvocation StringLiteral cq
cf StringLiteral MethodInvocation ClassInstanceCreation SimpleType SimpleName value
cf StringLiteral MethodInvocation ClassInstanceCreation MethodInvocation StringLiteral v
cf StringLiteral MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get bytes
cq StringLiteral MethodInvocation ClassInstanceCreation SimpleType SimpleName value
cq StringLiteral MethodInvocation ClassInstanceCreation MethodInvocation StringLiteral v
cq StringLiteral MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get bytes
list SimpleName SimpleType ParameterizedType SimpleType SimpleName mutation
collections SimpleName MethodInvocation SimpleName singleton list
collections SimpleName MethodInvocation SimpleName m
singleton list SimpleName MethodInvocation SimpleName m
mutations SimpleName VariableDeclarationFragment MethodInvocation SimpleName collections
mutations SimpleName VariableDeclarationFragment MethodInvocation SimpleName singleton list
mutations SimpleName VariableDeclarationFragment MethodInvocation SimpleName m
imm SimpleName MethodInvocation SimpleName mutate
imm SimpleName MethodInvocation SimpleName mutations
mutate SimpleName MethodInvocation SimpleName mutations
counts SimpleName ArrayAccess SimpleName thread id
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName k
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression NumberLiteral empty
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName k
k SimpleName InfixExpression ForStatement PostfixExpression SimpleName k
empty NumberLiteral InfixExpression ForStatement PostfixExpression SimpleName k
override SimpleName MarkerAnnotation MethodDeclaration Modifier public
override SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
override SimpleName MarkerAnnotation MethodDeclaration SimpleName run
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName run
void PrimitiveType MethodDeclaration SimpleName run
e SimpleName MethodInvocation SimpleName execute
e SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName runnable
execute SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName runnable
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName j
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName threads
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName j
j SimpleName InfixExpression ForStatement PostfixExpression SimpleName j
threads SimpleName InfixExpression ForStatement PostfixExpression SimpleName j
e SimpleName MethodInvocation SimpleName shutdown
e SimpleName MethodInvocation SimpleName await termination
e SimpleName MethodInvocation NumberLiteral empty
e SimpleName MethodInvocation QualifiedName time unitseconds
await termination SimpleName MethodInvocation NumberLiteral empty
await termination SimpleName MethodInvocation QualifiedName time unitseconds
empty NumberLiteral MethodInvocation QualifiedName time unitseconds
imm SimpleName MethodInvocation SimpleName delete
imm SimpleName MethodInvocation NumberLiteral empty
delete SimpleName MethodInvocation NumberLiteral empty
sum SimpleName MethodInvocation SimpleName counts
system SimpleName MethodInvocation SimpleName current time millis
system SimpleName MethodInvocation InfixExpression SimpleName now
current time millis SimpleName MethodInvocation InfixExpression SimpleName now
now SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral .
mutations per second SimpleName VariableDeclarationFragment InfixExpression MethodInvocation SimpleName sum
mutations per second SimpleName VariableDeclarationFragment InfixExpression MethodInvocation SimpleName counts
double PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName mutations per second
timings SimpleName MethodInvocation SimpleName add
timings SimpleName MethodInvocation SimpleName mutations per second
add SimpleName MethodInvocation SimpleName mutations per second
string SimpleName MethodInvocation SimpleName format
string SimpleName MethodInvocation StringLiteral %. f mutations per second with d threads
string SimpleName MethodInvocation SimpleName mutations per second
string SimpleName MethodInvocation SimpleName threads
format SimpleName MethodInvocation StringLiteral %. f mutations per second with d threads
format SimpleName MethodInvocation SimpleName mutations per second
format SimpleName MethodInvocation SimpleName threads
%. f mutations per second with d threads StringLiteral MethodInvocation SimpleName mutations per second
%. f mutations per second with d threads StringLiteral MethodInvocation SimpleName threads
mutations per second SimpleName MethodInvocation SimpleName threads
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation MethodInvocation SimpleName string
log SimpleName MethodInvocation MethodInvocation SimpleName format
log SimpleName MethodInvocation MethodInvocation StringLiteral %. f mutations per second with d threads
log SimpleName MethodInvocation MethodInvocation SimpleName mutations per second
log SimpleName MethodInvocation MethodInvocation SimpleName threads
info SimpleName MethodInvocation MethodInvocation SimpleName string
info SimpleName MethodInvocation MethodInvocation SimpleName format
info SimpleName MethodInvocation MethodInvocation StringLiteral %. f mutations per second with d threads
info SimpleName MethodInvocation MethodInvocation SimpleName mutations per second
info SimpleName MethodInvocation MethodInvocation SimpleName threads
final Modifier VariableDeclarationStatement Block VariableDeclarationStatement Modifier final
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement Modifier final
final Modifier VariableDeclarationStatement Block VariableDeclarationStatement Modifier final
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement Modifier final
final Modifier VariableDeclarationStatement Block VariableDeclarationStatement Modifier final
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
timings SimpleName MethodInvocation SimpleName size
i SimpleName InfixExpression MethodInvocation SimpleName timings
i SimpleName InfixExpression MethodInvocation SimpleName size
timings SimpleName MethodInvocation SimpleName get
timings SimpleName MethodInvocation NumberLiteral empty
get SimpleName MethodInvocation NumberLiteral empty
timings SimpleName MethodInvocation SimpleName get
timings SimpleName MethodInvocation SimpleName i
get SimpleName MethodInvocation SimpleName i
timings SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName timings
timings SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get
timings SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName i
get SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName timings
get SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get
get SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName i
empty NumberLiteral MethodInvocation InfixExpression MethodInvocation SimpleName timings
empty NumberLiteral MethodInvocation InfixExpression MethodInvocation SimpleName get
empty NumberLiteral MethodInvocation InfixExpression MethodInvocation SimpleName i
ratio first SimpleName VariableDeclarationFragment InfixExpression MethodInvocation SimpleName timings
ratio first SimpleName VariableDeclarationFragment InfixExpression MethodInvocation SimpleName get
ratio first SimpleName VariableDeclarationFragment InfixExpression MethodInvocation NumberLiteral empty
ratio first SimpleName VariableDeclarationFragment InfixExpression MethodInvocation SimpleName timings
ratio first SimpleName VariableDeclarationFragment InfixExpression MethodInvocation SimpleName get
ratio first SimpleName VariableDeclarationFragment InfixExpression MethodInvocation SimpleName i
double PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName ratio first
ratio first SimpleName InfixExpression NumberLiteral empty
assert true SimpleName MethodInvocation InfixExpression SimpleName ratio first
assert true SimpleName MethodInvocation InfixExpression NumberLiteral empty
ratio first SimpleName InfixExpression NumberLiteral .
assert true SimpleName MethodInvocation InfixExpression SimpleName ratio first
assert true SimpleName MethodInvocation InfixExpression NumberLiteral .
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
test SimpleName MarkerAnnotation MethodDeclaration MarkerAnnotation SimpleName ignore
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName parallel write speed
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName interrupted exception
ignore SimpleName MarkerAnnotation MethodDeclaration Modifier public
ignore SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
ignore SimpleName MarkerAnnotation MethodDeclaration SimpleName parallel write speed
ignore SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName interrupted exception
ignore SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName io exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName parallel write speed
public Modifier MethodDeclaration SimpleType SimpleName interrupted exception
public Modifier MethodDeclaration SimpleType SimpleName io exception
void PrimitiveType MethodDeclaration SimpleName parallel write speed
void PrimitiveType MethodDeclaration SimpleType SimpleName interrupted exception
void PrimitiveType MethodDeclaration SimpleType SimpleName io exception
parallel write speed SimpleName MethodDeclaration SimpleType SimpleName interrupted exception
parallel write speed SimpleName MethodDeclaration SimpleType SimpleName io exception
interrupted exception SimpleName SimpleType MethodDeclaration SimpleType SimpleName io exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName ignore
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName parallel write speed
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName interrupted exception
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName ignore
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName parallel write speed
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName interrupted exception
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName io exception