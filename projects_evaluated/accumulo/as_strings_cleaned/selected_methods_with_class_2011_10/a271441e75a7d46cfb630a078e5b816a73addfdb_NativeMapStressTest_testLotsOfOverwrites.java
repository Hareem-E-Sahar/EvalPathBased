map SimpleName SimpleType ParameterizedType SimpleType SimpleName integer
map SimpleName SimpleType ParameterizedType SimpleType SimpleName native map
integer SimpleName SimpleType ParameterizedType SimpleType SimpleName native map
hash map SimpleName SimpleType ParameterizedType SimpleType SimpleName integer
hash map SimpleName SimpleType ParameterizedType SimpleType SimpleName native map
integer SimpleName SimpleType ParameterizedType SimpleType SimpleName native map
final Modifier VariableDeclarationStatement ParameterizedType SimpleType SimpleName map
final Modifier VariableDeclarationStatement ParameterizedType SimpleType SimpleName integer
final Modifier VariableDeclarationStatement ParameterizedType SimpleType SimpleName native map
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName native maps
num threads SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName num threads
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment NumberLiteral empty
double PrimitiveType CastExpression SimpleName num threads
empty NumberLiteral InfixExpression CastExpression PrimitiveType double
empty NumberLiteral InfixExpression CastExpression SimpleName num threads
int PrimitiveType CastExpression ParenthesizedExpression InfixExpression NumberLiteral empty
inserts per thread SimpleName VariableDeclarationFragment CastExpression PrimitiveType int
final Modifier VariableDeclarationStatement PrimitiveType int
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName inserts per thread
final Modifier VariableDeclarationStatement VariableDeclarationFragment CastExpression PrimitiveType int
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName inserts per thread
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment CastExpression PrimitiveType int
row range SimpleName VariableDeclarationFragment NumberLiteral empty
final Modifier VariableDeclarationStatement PrimitiveType int
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName row range
final Modifier VariableDeclarationStatement VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName row range
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment NumberLiteral empty
num maps SimpleName VariableDeclarationFragment NumberLiteral empty
final Modifier VariableDeclarationStatement PrimitiveType int
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName num maps
final Modifier VariableDeclarationStatement VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName num maps
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment NumberLiteral empty
array list SimpleName SimpleType ParameterizedType SimpleType SimpleName thread
array list SimpleName SimpleType ParameterizedType SimpleType SimpleName thread
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression SimpleName num threads
r SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName random
random SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName r
inserts SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName inserts
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment NumberLiteral empty
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
inserts per thread SimpleName InfixExpression NumberLiteral .
i SimpleName InfixExpression InfixExpression SimpleName inserts per thread
i SimpleName InfixExpression InfixExpression NumberLiteral .
r SimpleName MethodInvocation SimpleName next int
r SimpleName MethodInvocation SimpleName num maps
next int SimpleName MethodInvocation SimpleName num maps
map SimpleName VariableDeclarationFragment MethodInvocation SimpleName r
map SimpleName VariableDeclarationFragment MethodInvocation SimpleName next int
map SimpleName VariableDeclarationFragment MethodInvocation SimpleName num maps
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName map
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName r
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName next int
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName num maps
native map SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName nm
native maps SimpleName MethodInvocation SimpleName get
native maps SimpleName MethodInvocation SimpleName map
get SimpleName MethodInvocation SimpleName map
nm SimpleName Assignment MethodInvocation SimpleName native maps
nm SimpleName Assignment MethodInvocation SimpleName get
nm SimpleName Assignment MethodInvocation SimpleName map
nm SimpleName Assignment ClassInstanceCreation SimpleType SimpleName native map
native maps SimpleName MethodInvocation SimpleName put
native maps SimpleName MethodInvocation SimpleName map
native maps SimpleName MethodInvocation SimpleName nm
put SimpleName MethodInvocation SimpleName map
put SimpleName MethodInvocation SimpleName nm
map SimpleName MethodInvocation SimpleName nm
j SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName j
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
j SimpleName InfixExpression NumberLiteral empty
r SimpleName MethodInvocation SimpleName next int
r SimpleName MethodInvocation SimpleName row range
next int SimpleName MethodInvocation SimpleName row range
string SimpleName MethodInvocation SimpleName format
string SimpleName MethodInvocation StringLiteral r d
string SimpleName MethodInvocation MethodInvocation SimpleName r
string SimpleName MethodInvocation MethodInvocation SimpleName next int
string SimpleName MethodInvocation MethodInvocation SimpleName row range
format SimpleName MethodInvocation StringLiteral r d
format SimpleName MethodInvocation MethodInvocation SimpleName r
format SimpleName MethodInvocation MethodInvocation SimpleName next int
format SimpleName MethodInvocation MethodInvocation SimpleName row range
r d StringLiteral MethodInvocation MethodInvocation SimpleName r
r d StringLiteral MethodInvocation MethodInvocation SimpleName next int
r d StringLiteral MethodInvocation MethodInvocation SimpleName row range
row SimpleName VariableDeclarationFragment MethodInvocation SimpleName string
row SimpleName VariableDeclarationFragment MethodInvocation SimpleName format
row SimpleName VariableDeclarationFragment MethodInvocation StringLiteral r d
row SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName r
row SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName next int
row SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName row range
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName row
row SimpleName InfixExpression StringLiteral v
val SimpleName VariableDeclarationFragment InfixExpression SimpleName row
val SimpleName VariableDeclarationFragment InfixExpression StringLiteral v
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName val
put SimpleName MethodInvocation SimpleName nm
put SimpleName MethodInvocation SimpleName row
put SimpleName MethodInvocation SimpleName val
put SimpleName MethodInvocation SimpleName j
nm SimpleName MethodInvocation SimpleName row
nm SimpleName MethodInvocation SimpleName val
nm SimpleName MethodInvocation SimpleName j
row SimpleName MethodInvocation SimpleName val
row SimpleName MethodInvocation SimpleName j
val SimpleName MethodInvocation SimpleName j
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName j
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression NumberLiteral empty
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName j
j SimpleName InfixExpression ForStatement PostfixExpression SimpleName j
empty NumberLiteral InfixExpression ForStatement PostfixExpression SimpleName j
int PrimitiveType VariableDeclarationStatement Block SynchronizedStatement SimpleName native maps
int PrimitiveType VariableDeclarationStatement Block SynchronizedStatement SimpleName nm
native maps SimpleName SynchronizedStatement Block SynchronizedStatement SimpleName nm
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
thread SimpleName MethodInvocation SimpleName current thread
thread SimpleName MethodInvocation MethodInvocation SimpleName get name
current thread SimpleName MethodInvocation MethodInvocation SimpleName get name
inserts StringLiteral InfixExpression SimpleName inserts
inserts StringLiteral InfixExpression StringLiteral empty
inserts StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName thread
inserts StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName current thread
inserts StringLiteral InfixExpression MethodInvocation SimpleName get name
inserts SimpleName InfixExpression StringLiteral empty
inserts SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName thread
inserts SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName current thread
inserts SimpleName InfixExpression MethodInvocation SimpleName get name
empty StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName thread
empty StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName current thread
empty StringLiteral InfixExpression MethodInvocation SimpleName get name
systemout QualifiedName MethodInvocation SimpleName println
systemout QualifiedName MethodInvocation InfixExpression StringLiteral inserts
systemout QualifiedName MethodInvocation InfixExpression SimpleName inserts
systemout QualifiedName MethodInvocation InfixExpression StringLiteral empty
systemout QualifiedName MethodInvocation InfixExpression MethodInvocation SimpleName get name
println SimpleName MethodInvocation InfixExpression StringLiteral inserts
println SimpleName MethodInvocation InfixExpression SimpleName inserts
println SimpleName MethodInvocation InfixExpression StringLiteral empty
println SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get name
override SimpleName MarkerAnnotation MethodDeclaration Modifier public
override SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
override SimpleName MarkerAnnotation MethodDeclaration SimpleName run
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName run
public Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
void PrimitiveType MethodDeclaration SimpleName run
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
run SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
r SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName runnable
runnable SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName r
thread SimpleName SimpleType ClassInstanceCreation SimpleName r
t SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName thread
t SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName r
thread SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName t
t SimpleName MethodInvocation SimpleName start
threads SimpleName MethodInvocation SimpleName add
threads SimpleName MethodInvocation SimpleName t
add SimpleName MethodInvocation SimpleName t
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName num threads
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
num threads SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
thread SimpleName SimpleType SingleVariableDeclaration SimpleName thread
thread SimpleName MethodInvocation SimpleName join
interrupted exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
e SimpleName MethodInvocation SimpleName print stack trace
runtime exception SimpleName SimpleType ClassInstanceCreation SimpleName e
thread SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName threads
thread SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName threads
entry SimpleName SimpleType ParameterizedType SimpleType SimpleName integer
entry SimpleName SimpleType ParameterizedType SimpleType SimpleName native map
integer SimpleName SimpleType ParameterizedType SimpleType SimpleName native map
native maps SimpleName MethodInvocation SimpleName entry set
es SimpleName VariableDeclarationFragment MethodInvocation SimpleName native maps
es SimpleName VariableDeclarationFragment MethodInvocation SimpleName entry set
entry SimpleName SimpleType ParameterizedType SimpleType SimpleName integer
entry SimpleName SimpleType ParameterizedType SimpleType SimpleName native map
integer SimpleName SimpleType ParameterizedType SimpleType SimpleName native map
entry SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName entry
integer SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName entry
native map SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName entry
entry SimpleName MethodInvocation SimpleName get value
entry SimpleName MethodInvocation MethodInvocation SimpleName delete
get value SimpleName MethodInvocation MethodInvocation SimpleName delete
entry SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName es
final Modifier VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
final Modifier VariableDeclarationStatement Block VariableDeclarationStatement Modifier final
final Modifier VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
final Modifier VariableDeclarationStatement Block VariableDeclarationStatement Modifier final
final Modifier VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
final Modifier VariableDeclarationStatement Block VariableDeclarationStatement Modifier final
final Modifier VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement Modifier final
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement Modifier final
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement Modifier final
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
final Modifier VariableDeclarationStatement Block VariableDeclarationStatement Modifier final
final Modifier VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement Modifier final
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
final Modifier VariableDeclarationStatement Block VariableDeclarationStatement Modifier final
final Modifier VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement Modifier final
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
final Modifier VariableDeclarationStatement Block EnhancedForStatement SimpleName threads
int PrimitiveType VariableDeclarationStatement Block EnhancedForStatement SimpleName threads
final Modifier VariableDeclarationStatement Block VariableDeclarationStatement Modifier final
final Modifier VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement Modifier final
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
final Modifier VariableDeclarationStatement Block EnhancedForStatement SimpleName threads
int PrimitiveType VariableDeclarationStatement Block EnhancedForStatement SimpleName threads
final Modifier VariableDeclarationStatement Block EnhancedForStatement SimpleName threads
int PrimitiveType VariableDeclarationStatement Block EnhancedForStatement SimpleName threads
final Modifier VariableDeclarationStatement Block EnhancedForStatement SimpleName es
int PrimitiveType VariableDeclarationStatement Block EnhancedForStatement SimpleName es
threads SimpleName EnhancedForStatement Block EnhancedForStatement SimpleName es
private Modifier MethodDeclaration Modifier static
private Modifier MethodDeclaration PrimitiveType void
private Modifier MethodDeclaration SimpleName test lots of overwrites
private Modifier MethodDeclaration Block VariableDeclarationStatement Modifier final
private Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
private Modifier MethodDeclaration Block VariableDeclarationStatement Modifier final
private Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
private Modifier MethodDeclaration Block VariableDeclarationStatement Modifier final
private Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
private Modifier MethodDeclaration Block VariableDeclarationStatement Modifier final
private Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
private Modifier MethodDeclaration Block EnhancedForStatement SimpleName threads
private Modifier MethodDeclaration Block EnhancedForStatement SimpleName es
static Modifier MethodDeclaration PrimitiveType void
static Modifier MethodDeclaration SimpleName test lots of overwrites
static Modifier MethodDeclaration Block VariableDeclarationStatement Modifier final
static Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
static Modifier MethodDeclaration Block VariableDeclarationStatement Modifier final
static Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
static Modifier MethodDeclaration Block VariableDeclarationStatement Modifier final
static Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
static Modifier MethodDeclaration Block VariableDeclarationStatement Modifier final
static Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
static Modifier MethodDeclaration Block EnhancedForStatement SimpleName threads
static Modifier MethodDeclaration Block EnhancedForStatement SimpleName es
void PrimitiveType MethodDeclaration SimpleName test lots of overwrites
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement Modifier final
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement Modifier final
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement Modifier final
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement Modifier final
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
void PrimitiveType MethodDeclaration Block EnhancedForStatement SimpleName threads
void PrimitiveType MethodDeclaration Block EnhancedForStatement SimpleName es
test lots of overwrites SimpleName MethodDeclaration Block VariableDeclarationStatement Modifier final
test lots of overwrites SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
test lots of overwrites SimpleName MethodDeclaration Block VariableDeclarationStatement Modifier final
test lots of overwrites SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
test lots of overwrites SimpleName MethodDeclaration Block VariableDeclarationStatement Modifier final
test lots of overwrites SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
test lots of overwrites SimpleName MethodDeclaration Block VariableDeclarationStatement Modifier final
test lots of overwrites SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
test lots of overwrites SimpleName MethodDeclaration Block EnhancedForStatement SimpleName threads
test lots of overwrites SimpleName MethodDeclaration Block EnhancedForStatement SimpleName es
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration Modifier static
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test lots of overwrites
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration Modifier static
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test lots of overwrites
