map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
map SimpleName SimpleType ParameterizedType SimpleType SimpleName integer
string SimpleName SimpleType ParameterizedType SimpleType SimpleName integer
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
map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
map SimpleName SimpleType ParameterizedType SimpleType SimpleName integer
string SimpleName SimpleType ParameterizedType SimpleType SimpleName integer
tree map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
tree map SimpleName SimpleType ParameterizedType SimpleType SimpleName integer
string SimpleName SimpleType ParameterizedType SimpleType SimpleName integer
tree map SimpleName SimpleType ParameterizedType ClassInstanceCreation QualifiedName stringcase insensitive order
string SimpleName SimpleType ParameterizedType ClassInstanceCreation QualifiedName stringcase insensitive order
integer SimpleName SimpleType ParameterizedType ClassInstanceCreation QualifiedName stringcase insensitive order
result SimpleName VariableDeclarationFragment ClassInstanceCreation QualifiedName stringcase insensitive order
list SimpleName SimpleType ParameterizedType SimpleType SimpleName string
map SimpleName SimpleType ParameterizedType SimpleType SimpleName integer
fields SimpleName MethodInvocation SimpleName size
opcodes map SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName fields
opcodes map SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName size
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
key SimpleName VariableDeclarationFragment MethodInvocation SimpleName number utils
key SimpleName VariableDeclarationFragment MethodInvocation SimpleName to integer
key SimpleName VariableDeclarationFragment MethodInvocation SimpleName value
integer SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName key
list SimpleName SimpleType ParameterizedType SimpleType SimpleName string
opcodes map SimpleName MethodInvocation SimpleName get
opcodes map SimpleName MethodInvocation SimpleName key
get SimpleName MethodInvocation SimpleName key
name list SimpleName VariableDeclarationFragment MethodInvocation SimpleName opcodes map
name list SimpleName VariableDeclarationFragment MethodInvocation SimpleName get
name list SimpleName VariableDeclarationFragment MethodInvocation SimpleName key
array list SimpleName SimpleType ParameterizedType SimpleType SimpleName string
opcodes map SimpleName MethodInvocation SimpleName put
opcodes map SimpleName MethodInvocation SimpleName key
opcodes map SimpleName MethodInvocation SimpleName name list
put SimpleName MethodInvocation SimpleName key
put SimpleName MethodInvocation SimpleName name list
key SimpleName MethodInvocation SimpleName name list
name list SimpleName MethodInvocation SimpleName add
name list SimpleName MethodInvocation SimpleName name
add SimpleName MethodInvocation SimpleName name
name list SimpleName MethodInvocation SimpleName size
num opcodes SimpleName VariableDeclarationFragment MethodInvocation SimpleName name list
num opcodes SimpleName VariableDeclarationFragment MethodInvocation SimpleName size
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName num opcodes
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName name list
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName size
num opcodes SimpleName InfixExpression NumberLiteral empty
result SimpleName MethodInvocation SimpleName put
result SimpleName MethodInvocation SimpleName name
result SimpleName MethodInvocation SimpleName key
put SimpleName MethodInvocation SimpleName name
put SimpleName MethodInvocation SimpleName key
name SimpleName MethodInvocation SimpleName key
num opcodes SimpleName InfixExpression NumberLiteral empty
name list SimpleName MethodInvocation SimpleName get
name list SimpleName MethodInvocation NumberLiteral empty
get SimpleName MethodInvocation NumberLiteral empty
result SimpleName MethodInvocation SimpleName put
result SimpleName MethodInvocation MethodInvocation SimpleName name list
result SimpleName MethodInvocation MethodInvocation SimpleName get
result SimpleName MethodInvocation MethodInvocation NumberLiteral empty
result SimpleName MethodInvocation SimpleName key
put SimpleName MethodInvocation MethodInvocation SimpleName name list
put SimpleName MethodInvocation MethodInvocation SimpleName get
put SimpleName MethodInvocation MethodInvocation NumberLiteral empty
put SimpleName MethodInvocation SimpleName key
name list SimpleName MethodInvocation MethodInvocation SimpleName key
get SimpleName MethodInvocation MethodInvocation SimpleName key
empty NumberLiteral MethodInvocation MethodInvocation SimpleName key
exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
field SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName fields
f SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName fields
fields SimpleName EnhancedForStatement Block ReturnStatement SimpleName result
public Modifier MethodDeclaration Modifier static
public Modifier MethodDeclaration ParameterizedType SimpleType SimpleName map
public Modifier MethodDeclaration ParameterizedType SimpleType SimpleName string
public Modifier MethodDeclaration ParameterizedType SimpleType SimpleName integer
public Modifier MethodDeclaration SimpleName get ambiguous menmonics
public Modifier MethodDeclaration SingleVariableDeclaration ParameterizedType WildcardType ?
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName clazz
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName acceptor
static Modifier MethodDeclaration ParameterizedType SimpleType SimpleName map
static Modifier MethodDeclaration ParameterizedType SimpleType SimpleName string
static Modifier MethodDeclaration ParameterizedType SimpleType SimpleName integer
static Modifier MethodDeclaration SimpleName get ambiguous menmonics
static Modifier MethodDeclaration SingleVariableDeclaration ParameterizedType WildcardType ?
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName clazz
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName acceptor
static Modifier MethodDeclaration Block EnhancedForStatement SimpleName fields
static Modifier MethodDeclaration Block ReturnStatement SimpleName result
map SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName get ambiguous menmonics
string SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName get ambiguous menmonics
integer SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName get ambiguous menmonics
get ambiguous menmonics SimpleName MethodDeclaration SingleVariableDeclaration ParameterizedType WildcardType ?
get ambiguous menmonics SimpleName MethodDeclaration SingleVariableDeclaration SimpleName clazz
get ambiguous menmonics SimpleName MethodDeclaration SingleVariableDeclaration SimpleName acceptor
get ambiguous menmonics SimpleName MethodDeclaration Block EnhancedForStatement SimpleName fields
get ambiguous menmonics SimpleName MethodDeclaration Block ReturnStatement SimpleName result
clazz SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName acceptor
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration Modifier static
public Modifier TypeDeclaration MethodDeclaration SimpleName get ambiguous menmonics
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName clazz
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName acceptor
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration Modifier static
test SimpleName TypeDeclaration MethodDeclaration SimpleName get ambiguous menmonics
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName clazz
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName acceptor
