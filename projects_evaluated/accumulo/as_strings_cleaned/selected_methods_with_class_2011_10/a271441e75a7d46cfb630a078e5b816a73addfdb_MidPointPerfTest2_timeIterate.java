string SimpleName SimpleType SingleVariableDeclaration SimpleName dir
int PrimitiveType SingleVariableDeclaration SimpleName max files
string SimpleName SimpleType SingleVariableDeclaration SimpleName tmp dir
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
dir SimpleName InfixExpression StringLiteral index
path SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName dir
path SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral index
fs SimpleName MethodInvocation SimpleName glob status
fs SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName path
fs SimpleName MethodInvocation ClassInstanceCreation InfixExpression SimpleName dir
fs SimpleName MethodInvocation ClassInstanceCreation InfixExpression StringLiteral index
glob status SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName path
glob status SimpleName MethodInvocation ClassInstanceCreation InfixExpression SimpleName dir
glob status SimpleName MethodInvocation ClassInstanceCreation InfixExpression StringLiteral index
files SimpleName VariableDeclarationFragment MethodInvocation SimpleName fs
files SimpleName VariableDeclarationFragment MethodInvocation SimpleName glob status
array list SimpleName SimpleType ParameterizedType SimpleType SimpleName path
array list SimpleName SimpleType ParameterizedType SimpleType SimpleName path
array list SimpleName SimpleType ParameterizedType ClassInstanceCreation QualifiedName fileslength
path SimpleName SimpleType ParameterizedType ClassInstanceCreation QualifiedName fileslength
paths SimpleName VariableDeclarationFragment ClassInstanceCreation QualifiedName fileslength
file status SimpleName SimpleType SingleVariableDeclaration SimpleName file status
file status SimpleName MethodInvocation SimpleName get path
paths SimpleName MethodInvocation SimpleName add
paths SimpleName MethodInvocation MethodInvocation SimpleName file status
paths SimpleName MethodInvocation MethodInvocation SimpleName get path
add SimpleName MethodInvocation MethodInvocation SimpleName file status
add SimpleName MethodInvocation MethodInvocation SimpleName get path
file status SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName files
file status SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName files
system SimpleName MethodInvocation SimpleName current time millis
t SimpleName VariableDeclarationFragment MethodInvocation SimpleName system
t SimpleName VariableDeclarationFragment MethodInvocation SimpleName current time millis
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName t
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName system
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName current time millis
array list SimpleName SimpleType ParameterizedType SimpleType SimpleName path
reduce files SimpleName MethodInvocation SimpleName conf
reduce files SimpleName MethodInvocation SimpleName fs
reduce files SimpleName MethodInvocation SimpleName paths
reduce files SimpleName MethodInvocation SimpleName max files
reduce files SimpleName MethodInvocation SimpleName tmp dir
conf SimpleName MethodInvocation SimpleName fs
conf SimpleName MethodInvocation SimpleName paths
conf SimpleName MethodInvocation SimpleName max files
conf SimpleName MethodInvocation SimpleName tmp dir
conf SimpleName MethodInvocation NumberLiteral empty
fs SimpleName MethodInvocation SimpleName paths
fs SimpleName MethodInvocation SimpleName max files
fs SimpleName MethodInvocation SimpleName tmp dir
fs SimpleName MethodInvocation NumberLiteral empty
paths SimpleName MethodInvocation SimpleName max files
paths SimpleName MethodInvocation SimpleName tmp dir
paths SimpleName MethodInvocation NumberLiteral empty
max files SimpleName MethodInvocation SimpleName tmp dir
max files SimpleName MethodInvocation NumberLiteral empty
tmp dir SimpleName MethodInvocation NumberLiteral empty
rpaths SimpleName VariableDeclarationFragment MethodInvocation SimpleName reduce files
rpaths SimpleName VariableDeclarationFragment MethodInvocation SimpleName conf
rpaths SimpleName VariableDeclarationFragment MethodInvocation SimpleName fs
rpaths SimpleName VariableDeclarationFragment MethodInvocation SimpleName paths
rpaths SimpleName VariableDeclarationFragment MethodInvocation SimpleName max files
rpaths SimpleName VariableDeclarationFragment MethodInvocation SimpleName tmp dir
rpaths SimpleName VariableDeclarationFragment MethodInvocation NumberLiteral empty
system SimpleName MethodInvocation SimpleName current time millis
t SimpleName VariableDeclarationFragment MethodInvocation SimpleName system
t SimpleName VariableDeclarationFragment MethodInvocation SimpleName current time millis
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName t
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName system
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName current time millis
multiple index iterator SimpleName SimpleType ClassInstanceCreation SimpleName conf
multiple index iterator SimpleName SimpleType ClassInstanceCreation SimpleName fs
multiple index iterator SimpleName SimpleType ClassInstanceCreation SimpleName rpaths
conf SimpleName ClassInstanceCreation SimpleName fs
conf SimpleName ClassInstanceCreation SimpleName rpaths
fs SimpleName ClassInstanceCreation SimpleName rpaths
mii SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName multiple index iterator
mii SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName conf
mii SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName fs
mii SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName rpaths
multiple index iterator SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName mii
count SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName count
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment NumberLiteral empty
mii SimpleName MethodInvocation SimpleName has next
mii SimpleName MethodInvocation SimpleName next
system SimpleName MethodInvocation SimpleName current time millis
t SimpleName VariableDeclarationFragment MethodInvocation SimpleName system
t SimpleName VariableDeclarationFragment MethodInvocation SimpleName current time millis
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName t
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName system
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName current time millis
t SimpleName InfixExpression SimpleName t
t SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral .
t SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral .
systemout QualifiedName MethodInvocation SimpleName printf
systemout QualifiedName MethodInvocation StringLiteral reduce time : % . f secs
systemout QualifiedName MethodInvocation InfixExpression NumberLiteral .
printf SimpleName MethodInvocation StringLiteral reduce time : % . f secs
printf SimpleName MethodInvocation InfixExpression NumberLiteral .
reduce time : % . f secs StringLiteral MethodInvocation InfixExpression NumberLiteral .
t SimpleName InfixExpression SimpleName t
t SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral .
t SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral .
systemout QualifiedName MethodInvocation SimpleName printf
systemout QualifiedName MethodInvocation StringLiteral iterate time : % . f secs
systemout QualifiedName MethodInvocation InfixExpression NumberLiteral .
printf SimpleName MethodInvocation StringLiteral iterate time : % . f secs
printf SimpleName MethodInvocation InfixExpression NumberLiteral .
iterate time : % . f secs StringLiteral MethodInvocation InfixExpression NumberLiteral .
t SimpleName InfixExpression SimpleName t
t SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral .
t SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral .
systemout QualifiedName MethodInvocation SimpleName printf
systemout QualifiedName MethodInvocation StringLiteral total time : % . f secs
systemout QualifiedName MethodInvocation InfixExpression NumberLiteral .
printf SimpleName MethodInvocation StringLiteral total time : % . f secs
printf SimpleName MethodInvocation InfixExpression NumberLiteral .
total time : % . f secs StringLiteral MethodInvocation InfixExpression NumberLiteral .
count StringLiteral InfixExpression SimpleName count
systemout QualifiedName MethodInvocation SimpleName println
systemout QualifiedName MethodInvocation InfixExpression StringLiteral count
systemout QualifiedName MethodInvocation InfixExpression SimpleName count
println SimpleName MethodInvocation InfixExpression StringLiteral count
println SimpleName MethodInvocation InfixExpression SimpleName count
files SimpleName EnhancedForStatement Block VariableDeclarationStatement PrimitiveType long
files SimpleName EnhancedForStatement Block VariableDeclarationStatement PrimitiveType long
files SimpleName EnhancedForStatement Block VariableDeclarationStatement PrimitiveType int
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType long
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType long
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType long
private Modifier MethodDeclaration Modifier static
private Modifier MethodDeclaration PrimitiveType void
private Modifier MethodDeclaration SimpleName time iterate
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName dir
private Modifier MethodDeclaration SingleVariableDeclaration PrimitiveType int
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName max files
static Modifier MethodDeclaration PrimitiveType void
static Modifier MethodDeclaration SimpleName time iterate
static Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName dir
static Modifier MethodDeclaration SingleVariableDeclaration PrimitiveType int
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName max files
static Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName tmp dir
void PrimitiveType MethodDeclaration SimpleName time iterate
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName dir
void PrimitiveType MethodDeclaration SingleVariableDeclaration PrimitiveType int
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName max files
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName tmp dir
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
time iterate SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
time iterate SimpleName MethodDeclaration SingleVariableDeclaration SimpleName dir
time iterate SimpleName MethodDeclaration SingleVariableDeclaration PrimitiveType int
time iterate SimpleName MethodDeclaration SingleVariableDeclaration SimpleName max files
time iterate SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
time iterate SimpleName MethodDeclaration SingleVariableDeclaration SimpleName tmp dir
time iterate SimpleName MethodDeclaration SimpleType SimpleName exception
time iterate SimpleName MethodDeclaration Block EnhancedForStatement SimpleName files
time iterate SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType long
time iterate SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType long
time iterate SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
time iterate SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType long
dir SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
dir SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName max files
dir SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName tmp dir
dir SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
int PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName tmp dir
max files SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName tmp dir
int PrimitiveType SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
max files SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
tmp dir SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration Modifier static
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName time iterate
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName dir
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName max files
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName tmp dir
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration Modifier static
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName time iterate
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName dir
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName max files
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName tmp dir
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
