map SimpleName SimpleType ParameterizedType SimpleType SimpleName integer
map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
integer SimpleName SimpleType ParameterizedType SimpleType SimpleName string
class SimpleName SimpleType ParameterizedType WildcardType ?
class SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName clazz
? WildcardType ParameterizedType SingleVariableDeclaration SimpleName clazz
predicate SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName acceptor
collection SimpleName SimpleType ParameterizedType SimpleType SimpleName field
get mnemonic fields SimpleName MethodInvocation SimpleName clazz
get mnemonic fields SimpleName MethodInvocation SimpleName acceptor
clazz SimpleName MethodInvocation SimpleName acceptor
fields SimpleName VariableDeclarationFragment MethodInvocation SimpleName get mnemonic fields
fields SimpleName VariableDeclarationFragment MethodInvocation SimpleName clazz
fields SimpleName VariableDeclarationFragment MethodInvocation SimpleName acceptor
generic utils SimpleName MethodInvocation SimpleName is empty
generic utils SimpleName MethodInvocation SimpleName fields
is empty SimpleName MethodInvocation SimpleName fields
collections SimpleName MethodInvocation SimpleName empty map
map SimpleName SimpleType ParameterizedType SimpleType SimpleName integer
map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
integer SimpleName SimpleType ParameterizedType SimpleType SimpleName string
fields SimpleName MethodInvocation SimpleName size
result SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName fields
result SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName size
field SimpleName SimpleType SingleVariableDeclaration SimpleName f
f SimpleName MethodInvocation SimpleName get name
name SimpleName VariableDeclarationFragment MethodInvocation SimpleName f
name SimpleName VariableDeclarationFragment MethodInvocation SimpleName get name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName name
f SimpleName MethodInvocation SimpleName get
number SimpleName SimpleType CastExpression MethodInvocation SimpleName f
number SimpleName SimpleType CastExpression MethodInvocation SimpleName get
value SimpleName VariableDeclarationFragment CastExpression SimpleType SimpleName number
value SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName f
value SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName get
number SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName value
number utils SimpleName MethodInvocation SimpleName to integer
number utils SimpleName MethodInvocation SimpleName value
to integer SimpleName MethodInvocation SimpleName value
result SimpleName MethodInvocation SimpleName put
result SimpleName MethodInvocation MethodInvocation SimpleName number utils
result SimpleName MethodInvocation MethodInvocation SimpleName to integer
result SimpleName MethodInvocation MethodInvocation SimpleName value
result SimpleName MethodInvocation SimpleName name
put SimpleName MethodInvocation MethodInvocation SimpleName number utils
put SimpleName MethodInvocation MethodInvocation SimpleName to integer
put SimpleName MethodInvocation MethodInvocation SimpleName value
put SimpleName MethodInvocation SimpleName name
number utils SimpleName MethodInvocation MethodInvocation SimpleName name
to integer SimpleName MethodInvocation MethodInvocation SimpleName name
value SimpleName MethodInvocation MethodInvocation SimpleName name
prev SimpleName VariableDeclarationFragment MethodInvocation SimpleName result
prev SimpleName VariableDeclarationFragment MethodInvocation SimpleName put
prev SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName number utils
prev SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName to integer
prev SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName value
prev SimpleName VariableDeclarationFragment MethodInvocation SimpleName name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName prev
exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
field SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName fields
f SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName fields
fields SimpleName EnhancedForStatement Block ReturnStatement SimpleName result
public Modifier MethodDeclaration Modifier static
public Modifier MethodDeclaration ParameterizedType SimpleType SimpleName map
public Modifier MethodDeclaration ParameterizedType SimpleType SimpleName integer
public Modifier MethodDeclaration ParameterizedType SimpleType SimpleName string
public Modifier MethodDeclaration SimpleName generate mnemonic map
public Modifier MethodDeclaration SingleVariableDeclaration ParameterizedType WildcardType ?
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName clazz
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName acceptor
static Modifier MethodDeclaration ParameterizedType SimpleType SimpleName map
static Modifier MethodDeclaration ParameterizedType SimpleType SimpleName integer
static Modifier MethodDeclaration ParameterizedType SimpleType SimpleName string
static Modifier MethodDeclaration SimpleName generate mnemonic map
static Modifier MethodDeclaration SingleVariableDeclaration ParameterizedType WildcardType ?
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName clazz
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName acceptor
static Modifier MethodDeclaration Block EnhancedForStatement SimpleName fields
static Modifier MethodDeclaration Block ReturnStatement SimpleName result
map SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName generate mnemonic map
integer SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName generate mnemonic map
string SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName generate mnemonic map
generate mnemonic map SimpleName MethodDeclaration SingleVariableDeclaration ParameterizedType WildcardType ?
generate mnemonic map SimpleName MethodDeclaration SingleVariableDeclaration SimpleName clazz
generate mnemonic map SimpleName MethodDeclaration SingleVariableDeclaration SimpleName acceptor
generate mnemonic map SimpleName MethodDeclaration Block EnhancedForStatement SimpleName fields
generate mnemonic map SimpleName MethodDeclaration Block ReturnStatement SimpleName result
clazz SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName acceptor
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration Modifier static
public Modifier TypeDeclaration MethodDeclaration SimpleName generate mnemonic map
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName clazz
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName acceptor
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration Modifier static
test SimpleName TypeDeclaration MethodDeclaration SimpleName generate mnemonic map
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName clazz
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName acceptor