string SimpleName SimpleType SingleVariableDeclaration SimpleName message
list SimpleName SimpleType ParameterizedType SimpleType SimpleName string
map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
map SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName map
string SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName map
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation SimpleName message
info SimpleName MethodInvocation SimpleName message
list SimpleName SimpleType ParameterizedType SimpleType SimpleName string
map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
mapentry QualifiedName SimpleType ParameterizedType SimpleType SimpleName string
mapentry QualifiedName SimpleType ParameterizedType SingleVariableDeclaration SimpleName e
string SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName e
map SimpleName MethodInvocation SimpleName entry set
e SimpleName MethodInvocation SimpleName get key
e SimpleName MethodInvocation SimpleName get value
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation StringLiteral type {} : {}
log SimpleName MethodInvocation MethodInvocation SimpleName e
log SimpleName MethodInvocation MethodInvocation SimpleName get key
log SimpleName MethodInvocation MethodInvocation SimpleName e
log SimpleName MethodInvocation MethodInvocation SimpleName get value
info SimpleName MethodInvocation StringLiteral type {} : {}
info SimpleName MethodInvocation MethodInvocation SimpleName e
info SimpleName MethodInvocation MethodInvocation SimpleName get key
info SimpleName MethodInvocation MethodInvocation SimpleName e
info SimpleName MethodInvocation MethodInvocation SimpleName get value
type {} : {} StringLiteral MethodInvocation MethodInvocation SimpleName e
type {} : {} StringLiteral MethodInvocation MethodInvocation SimpleName get key
type {} : {} StringLiteral MethodInvocation MethodInvocation SimpleName e
type {} : {} StringLiteral MethodInvocation MethodInvocation SimpleName get value
e SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName e
e SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get value
get key SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName e
get key SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get value
e SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName map
e SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName entry set
static Modifier MethodDeclaration PrimitiveType void
static Modifier MethodDeclaration SimpleName display info
static Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName message
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName map
void PrimitiveType MethodDeclaration SimpleName display info
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName message
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName map
display info SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
display info SimpleName MethodDeclaration SingleVariableDeclaration SimpleName message
display info SimpleName MethodDeclaration SingleVariableDeclaration SimpleName map
message SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName map
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier static
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName display info
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName message
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName map
test SimpleName TypeDeclaration MethodDeclaration Modifier static
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName display info
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName message
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName map