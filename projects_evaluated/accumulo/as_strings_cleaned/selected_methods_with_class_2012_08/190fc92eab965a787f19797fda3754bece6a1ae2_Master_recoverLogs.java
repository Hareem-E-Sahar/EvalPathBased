key extent SimpleName SimpleType SingleVariableDeclaration SimpleName extent
collection SimpleName SimpleType ParameterizedType SimpleType SimpleName string
collection SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName walogs
recovery needed SimpleName VariableDeclarationFragment BooleanLiteral false
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName recovery needed
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment BooleanLiteral false
collection SimpleName SimpleType ParameterizedType SimpleType SimpleName string
collection SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName logs
string SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName logs
string SimpleName SimpleType SingleVariableDeclaration SimpleName log
log SimpleName MethodInvocation SimpleName split
log SimpleName MethodInvocation StringLiteral /
split SimpleName MethodInvocation StringLiteral /
parts SimpleName VariableDeclarationFragment MethodInvocation SimpleName log
parts SimpleName VariableDeclarationFragment MethodInvocation SimpleName split
parts SimpleName VariableDeclarationFragment MethodInvocation StringLiteral /
parts SimpleName ArrayAccess NumberLiteral empty
host SimpleName VariableDeclarationFragment ArrayAccess SimpleName parts
host SimpleName VariableDeclarationFragment ArrayAccess NumberLiteral empty
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName host
parts SimpleName ArrayAccess NumberLiteral empty
filename SimpleName VariableDeclarationFragment ArrayAccess SimpleName parts
filename SimpleName VariableDeclarationFragment ArrayAccess NumberLiteral empty
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName filename
constants SimpleName MethodInvocation SimpleName get recovery dir
constants SimpleName MethodInvocation MethodInvocation SimpleName get system configuration
get recovery dir SimpleName MethodInvocation MethodInvocation SimpleName get system configuration
constants SimpleName MethodInvocation InfixExpression StringLiteral /
get recovery dir SimpleName MethodInvocation InfixExpression StringLiteral /
get system configuration SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral /
constants SimpleName MethodInvocation InfixExpression SimpleName filename
get recovery dir SimpleName MethodInvocation InfixExpression SimpleName filename
get system configuration SimpleName MethodInvocation MethodInvocation InfixExpression SimpleName filename
constants SimpleName MethodInvocation InfixExpression StringLiteral finished
get recovery dir SimpleName MethodInvocation InfixExpression StringLiteral finished
get system configuration SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral finished
/ StringLiteral InfixExpression SimpleName filename
/ StringLiteral InfixExpression StringLiteral finished
filename SimpleName InfixExpression StringLiteral finished
path SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral /
path SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName filename
path SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral finished
fs SimpleName MethodInvocation SimpleName exists
fs SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName path
fs SimpleName MethodInvocation ClassInstanceCreation InfixExpression StringLiteral /
fs SimpleName MethodInvocation ClassInstanceCreation InfixExpression SimpleName filename
fs SimpleName MethodInvocation ClassInstanceCreation InfixExpression StringLiteral finished
exists SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName path
exists SimpleName MethodInvocation ClassInstanceCreation InfixExpression StringLiteral /
exists SimpleName MethodInvocation ClassInstanceCreation InfixExpression SimpleName filename
exists SimpleName MethodInvocation ClassInstanceCreation InfixExpression StringLiteral finished
recoveries in progress SimpleName MethodInvocation SimpleName remove
recoveries in progress SimpleName MethodInvocation SimpleName filename
remove SimpleName MethodInvocation SimpleName filename
recovery needed SimpleName Assignment BooleanLiteral true
recoveries in progress SimpleName MethodInvocation SimpleName contains
recoveries in progress SimpleName MethodInvocation SimpleName filename
contains SimpleName MethodInvocation SimpleName filename
starting recovery of StringLiteral InfixExpression SimpleName filename
starting recovery of StringLiteral InfixExpression StringLiteral created for
starting recovery of StringLiteral InfixExpression SimpleName host
starting recovery of StringLiteral InfixExpression StringLiteral tablet
starting recovery of StringLiteral InfixExpression SimpleName extent
filename SimpleName InfixExpression StringLiteral created for
filename SimpleName InfixExpression SimpleName host
filename SimpleName InfixExpression StringLiteral tablet
filename SimpleName InfixExpression SimpleName extent
filename SimpleName InfixExpression StringLiteral holds a reference
created for StringLiteral InfixExpression SimpleName host
created for StringLiteral InfixExpression StringLiteral tablet
created for StringLiteral InfixExpression SimpleName extent
created for StringLiteral InfixExpression StringLiteral holds a reference
host SimpleName InfixExpression StringLiteral tablet
host SimpleName InfixExpression SimpleName extent
host SimpleName InfixExpression StringLiteral holds a reference
tablet StringLiteral InfixExpression SimpleName extent
tablet StringLiteral InfixExpression StringLiteral holds a reference
extent SimpleName InfixExpression StringLiteral holds a reference
masterlog QualifiedName MethodInvocation SimpleName info
masterlog QualifiedName MethodInvocation InfixExpression StringLiteral starting recovery of
masterlog QualifiedName MethodInvocation InfixExpression SimpleName filename
masterlog QualifiedName MethodInvocation InfixExpression StringLiteral created for
masterlog QualifiedName MethodInvocation InfixExpression SimpleName host
masterlog QualifiedName MethodInvocation InfixExpression StringLiteral tablet
masterlog QualifiedName MethodInvocation InfixExpression SimpleName extent
masterlog QualifiedName MethodInvocation InfixExpression StringLiteral holds a reference
info SimpleName MethodInvocation InfixExpression StringLiteral starting recovery of
info SimpleName MethodInvocation InfixExpression SimpleName filename
info SimpleName MethodInvocation InfixExpression StringLiteral created for
info SimpleName MethodInvocation InfixExpression SimpleName host
info SimpleName MethodInvocation InfixExpression StringLiteral tablet
info SimpleName MethodInvocation InfixExpression SimpleName extent
info SimpleName MethodInvocation InfixExpression StringLiteral holds a reference
fate SimpleName MethodInvocation SimpleName start transaction
tid SimpleName VariableDeclarationFragment MethodInvocation SimpleName fate
tid SimpleName VariableDeclarationFragment MethodInvocation SimpleName start transaction
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName tid
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName fate
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName start transaction
recover lease SimpleName SimpleType ClassInstanceCreation SimpleName host
recover lease SimpleName SimpleType ClassInstanceCreation SimpleName filename
host SimpleName ClassInstanceCreation SimpleName filename
fate SimpleName MethodInvocation SimpleName seed transaction
fate SimpleName MethodInvocation SimpleName tid
fate SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName recover lease
fate SimpleName MethodInvocation ClassInstanceCreation SimpleName host
fate SimpleName MethodInvocation ClassInstanceCreation SimpleName filename
fate SimpleName MethodInvocation BooleanLiteral true
seed transaction SimpleName MethodInvocation SimpleName tid
seed transaction SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName recover lease
seed transaction SimpleName MethodInvocation ClassInstanceCreation SimpleName host
seed transaction SimpleName MethodInvocation ClassInstanceCreation SimpleName filename
seed transaction SimpleName MethodInvocation BooleanLiteral true
tid SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName recover lease
tid SimpleName MethodInvocation ClassInstanceCreation SimpleName host
tid SimpleName MethodInvocation ClassInstanceCreation SimpleName filename
tid SimpleName MethodInvocation BooleanLiteral true
recover lease SimpleName SimpleType ClassInstanceCreation MethodInvocation BooleanLiteral true
host SimpleName ClassInstanceCreation MethodInvocation BooleanLiteral true
filename SimpleName ClassInstanceCreation MethodInvocation BooleanLiteral true
recoveries in progress SimpleName MethodInvocation SimpleName add
recoveries in progress SimpleName MethodInvocation SimpleName filename
add SimpleName MethodInvocation SimpleName filename
string SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName logs
log SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName logs
logs SimpleName EnhancedForStatement Block SynchronizedStatement SimpleName recoveries in progress
logs SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName walogs
walogs SimpleName EnhancedForStatement Block EnhancedForStatement SimpleName logs
boolean PrimitiveType VariableDeclarationStatement Block EnhancedForStatement SimpleName walogs
boolean PrimitiveType VariableDeclarationStatement Block ReturnStatement SimpleName recovery needed
walogs SimpleName EnhancedForStatement Block ReturnStatement SimpleName recovery needed
public Modifier MethodDeclaration PrimitiveType boolean
public Modifier MethodDeclaration SimpleName recover logs
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName key extent
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName extent
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName walogs
public Modifier MethodDeclaration SimpleType SimpleName io exception
boolean PrimitiveType MethodDeclaration SimpleName recover logs
boolean PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName key extent
boolean PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName extent
boolean PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName walogs
boolean PrimitiveType MethodDeclaration SimpleType SimpleName io exception
boolean PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType boolean
boolean PrimitiveType MethodDeclaration Block EnhancedForStatement SimpleName walogs
boolean PrimitiveType MethodDeclaration Block ReturnStatement SimpleName recovery needed
recover logs SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName key extent
recover logs SimpleName MethodDeclaration SingleVariableDeclaration SimpleName extent
recover logs SimpleName MethodDeclaration SingleVariableDeclaration SimpleName walogs
recover logs SimpleName MethodDeclaration SimpleType SimpleName io exception
recover logs SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType boolean
recover logs SimpleName MethodDeclaration Block EnhancedForStatement SimpleName walogs
recover logs SimpleName MethodDeclaration Block ReturnStatement SimpleName recovery needed
extent SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName walogs
extent SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
walogs SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType boolean
public Modifier TypeDeclaration MethodDeclaration SimpleName recover logs
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName extent
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName walogs
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType boolean
test SimpleName TypeDeclaration MethodDeclaration SimpleName recover logs
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName extent
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName walogs
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
