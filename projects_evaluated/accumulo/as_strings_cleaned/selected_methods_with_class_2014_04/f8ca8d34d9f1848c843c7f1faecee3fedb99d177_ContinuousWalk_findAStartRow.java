long PrimitiveType SingleVariableDeclaration SimpleName min
long PrimitiveType SingleVariableDeclaration SimpleName max
scanner SimpleName SimpleType SingleVariableDeclaration SimpleName scanner
random SimpleName SimpleType SingleVariableDeclaration SimpleName r
continuous ingest SimpleName MethodInvocation SimpleName gen row
continuous ingest SimpleName MethodInvocation SimpleName min
continuous ingest SimpleName MethodInvocation SimpleName max
continuous ingest SimpleName MethodInvocation SimpleName r
gen row SimpleName MethodInvocation SimpleName min
gen row SimpleName MethodInvocation SimpleName max
gen row SimpleName MethodInvocation SimpleName r
min SimpleName MethodInvocation SimpleName max
min SimpleName MethodInvocation SimpleName r
max SimpleName MethodInvocation SimpleName r
scan start SimpleName VariableDeclarationFragment MethodInvocation SimpleName continuous ingest
scan start SimpleName VariableDeclarationFragment MethodInvocation SimpleName gen row
scan start SimpleName VariableDeclarationFragment MethodInvocation SimpleName min
scan start SimpleName VariableDeclarationFragment MethodInvocation SimpleName max
scan start SimpleName VariableDeclarationFragment MethodInvocation SimpleName r
byte PrimitiveType ArrayType VariableDeclarationStatement VariableDeclarationFragment SimpleName scan start
text SimpleName SimpleType ClassInstanceCreation SimpleName scan start
range SimpleName SimpleType ClassInstanceCreation ClassInstanceCreation SimpleName scan start
scanner SimpleName MethodInvocation SimpleName set range
scanner SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName range
scanner SimpleName MethodInvocation ClassInstanceCreation ClassInstanceCreation SimpleName scan start
set range SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName range
set range SimpleName MethodInvocation ClassInstanceCreation ClassInstanceCreation SimpleName scan start
scanner SimpleName MethodInvocation SimpleName set batch size
scanner SimpleName MethodInvocation NumberLiteral empty
set batch size SimpleName MethodInvocation NumberLiteral empty
count SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName count
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment NumberLiteral empty
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName pr
system SimpleName MethodInvocation SimpleName current time millis
t SimpleName VariableDeclarationFragment MethodInvocation SimpleName system
t SimpleName VariableDeclarationFragment MethodInvocation SimpleName current time millis
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName t
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName system
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName current time millis
entry SimpleName SimpleType ParameterizedType SimpleType SimpleName key
entry SimpleName SimpleType ParameterizedType SimpleType SimpleName value
key SimpleName SimpleType ParameterizedType SimpleType SimpleName value
entry SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName entry
key SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName entry
value SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName entry
entry SimpleName MethodInvocation SimpleName get key
entry SimpleName MethodInvocation SimpleName get value
validate SimpleName MethodInvocation MethodInvocation SimpleName entry
validate SimpleName MethodInvocation MethodInvocation SimpleName get key
validate SimpleName MethodInvocation MethodInvocation SimpleName entry
validate SimpleName MethodInvocation MethodInvocation SimpleName get value
entry SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName entry
entry SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get value
get key SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName entry
get key SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get value
entry SimpleName MethodInvocation SimpleName get value
get prev row SimpleName MethodInvocation MethodInvocation SimpleName entry
get prev row SimpleName MethodInvocation MethodInvocation SimpleName get value
pr SimpleName Assignment MethodInvocation SimpleName get prev row
pr SimpleName Assignment MethodInvocation MethodInvocation SimpleName entry
pr SimpleName Assignment MethodInvocation MethodInvocation SimpleName get value
entry SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName scanner
system SimpleName MethodInvocation SimpleName current time millis
t SimpleName VariableDeclarationFragment MethodInvocation SimpleName system
t SimpleName VariableDeclarationFragment MethodInvocation SimpleName current time millis
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName t
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName system
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName current time millis
string SimpleName SimpleType ClassInstanceCreation SimpleName scan start
string SimpleName SimpleType ClassInstanceCreation QualifiedName standard charsetsutf
scan start SimpleName ClassInstanceCreation QualifiedName standard charsetsutf
t SimpleName InfixExpression SimpleName t
systemout QualifiedName MethodInvocation SimpleName printf
systemout QualifiedName MethodInvocation StringLiteral fsr d s d dn
systemout QualifiedName MethodInvocation SimpleName t
systemout QualifiedName MethodInvocation ClassInstanceCreation SimpleType SimpleName string
systemout QualifiedName MethodInvocation ClassInstanceCreation SimpleName scan start
systemout QualifiedName MethodInvocation ClassInstanceCreation QualifiedName standard charsetsutf
systemout QualifiedName MethodInvocation ParenthesizedExpression InfixExpression SimpleName t
systemout QualifiedName MethodInvocation ParenthesizedExpression InfixExpression SimpleName t
printf SimpleName MethodInvocation StringLiteral fsr d s d dn
printf SimpleName MethodInvocation SimpleName t
printf SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName string
printf SimpleName MethodInvocation ClassInstanceCreation SimpleName scan start
printf SimpleName MethodInvocation ClassInstanceCreation QualifiedName standard charsetsutf
printf SimpleName MethodInvocation ParenthesizedExpression InfixExpression SimpleName t
printf SimpleName MethodInvocation ParenthesizedExpression InfixExpression SimpleName t
printf SimpleName MethodInvocation SimpleName count
fsr d s d dn StringLiteral MethodInvocation SimpleName t
fsr d s d dn StringLiteral MethodInvocation ClassInstanceCreation SimpleType SimpleName string
fsr d s d dn StringLiteral MethodInvocation ClassInstanceCreation SimpleName scan start
fsr d s d dn StringLiteral MethodInvocation ClassInstanceCreation QualifiedName standard charsetsutf
fsr d s d dn StringLiteral MethodInvocation ParenthesizedExpression InfixExpression SimpleName t
fsr d s d dn StringLiteral MethodInvocation ParenthesizedExpression InfixExpression SimpleName t
fsr d s d dn StringLiteral MethodInvocation SimpleName count
t SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName string
t SimpleName MethodInvocation ClassInstanceCreation SimpleName scan start
t SimpleName MethodInvocation ClassInstanceCreation QualifiedName standard charsetsutf
t SimpleName MethodInvocation ParenthesizedExpression InfixExpression SimpleName t
t SimpleName MethodInvocation ParenthesizedExpression InfixExpression SimpleName t
t SimpleName MethodInvocation SimpleName count
string SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName count
scan start SimpleName ClassInstanceCreation MethodInvocation SimpleName count
standard charsetsutf QualifiedName ClassInstanceCreation MethodInvocation SimpleName count
t SimpleName InfixExpression ParenthesizedExpression MethodInvocation SimpleName count
t SimpleName InfixExpression ParenthesizedExpression MethodInvocation SimpleName count
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType long
int PrimitiveType VariableDeclarationStatement Block EnhancedForStatement SimpleName scanner
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType long
long PrimitiveType VariableDeclarationStatement Block EnhancedForStatement SimpleName scanner
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType long
long PrimitiveType VariableDeclarationStatement Block ReturnStatement SimpleName pr
scanner SimpleName EnhancedForStatement Block VariableDeclarationStatement PrimitiveType long
scanner SimpleName EnhancedForStatement Block ReturnStatement SimpleName pr
long PrimitiveType VariableDeclarationStatement Block ReturnStatement SimpleName pr
private Modifier MethodDeclaration Modifier static
private Modifier MethodDeclaration SimpleType SimpleName string
private Modifier MethodDeclaration SimpleName find a start row
private Modifier MethodDeclaration SingleVariableDeclaration PrimitiveType long
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName min
private Modifier MethodDeclaration SingleVariableDeclaration PrimitiveType long
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName max
static Modifier MethodDeclaration SimpleType SimpleName string
static Modifier MethodDeclaration SimpleName find a start row
static Modifier MethodDeclaration SingleVariableDeclaration PrimitiveType long
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName min
static Modifier MethodDeclaration SingleVariableDeclaration PrimitiveType long
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName max
static Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName scanner
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName scanner
string SimpleName SimpleType MethodDeclaration SimpleName find a start row
string SimpleName SimpleType MethodDeclaration SingleVariableDeclaration PrimitiveType long
string SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName min
string SimpleName SimpleType MethodDeclaration SingleVariableDeclaration PrimitiveType long
string SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName max
string SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName scanner
string SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName r
find a start row SimpleName MethodDeclaration SingleVariableDeclaration PrimitiveType long
find a start row SimpleName MethodDeclaration SingleVariableDeclaration SimpleName min
find a start row SimpleName MethodDeclaration SingleVariableDeclaration PrimitiveType long
find a start row SimpleName MethodDeclaration SingleVariableDeclaration SimpleName max
find a start row SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName scanner
find a start row SimpleName MethodDeclaration SingleVariableDeclaration SimpleName scanner
find a start row SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName random
find a start row SimpleName MethodDeclaration SingleVariableDeclaration SimpleName r
find a start row SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
find a start row SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType long
find a start row SimpleName MethodDeclaration Block EnhancedForStatement SimpleName scanner
find a start row SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType long
find a start row SimpleName MethodDeclaration Block ReturnStatement SimpleName pr
long PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType long
long PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName max
min SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType long
min SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName max
long PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName scanner
min SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName scanner
long PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName r
min SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName r
long PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName scanner
max SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName scanner
long PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName r
max SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName r
scanner SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName r
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration Modifier static
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName string
public Modifier TypeDeclaration MethodDeclaration SimpleName find a start row
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType long
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName min
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType long
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName max
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName scanner
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName r
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration Modifier static
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName string
test SimpleName TypeDeclaration MethodDeclaration SimpleName find a start row
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType long
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName min
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType long
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName max
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName scanner
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName r
