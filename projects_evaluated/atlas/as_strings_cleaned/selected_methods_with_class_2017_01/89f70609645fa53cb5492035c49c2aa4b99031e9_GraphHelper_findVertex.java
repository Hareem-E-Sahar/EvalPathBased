object SimpleName SimpleType SingleVariableDeclaration SimpleName args
graph SimpleName MethodInvocation SimpleName query
query SimpleName VariableDeclarationFragment MethodInvocation SimpleName graph
query SimpleName VariableDeclarationFragment MethodInvocation SimpleName query
atlas graph query SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName query
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression QualifiedName argslength
i SimpleName Assignment NumberLiteral empty
args SimpleName ArrayAccess SimpleName i
string SimpleName SimpleType CastExpression ArrayAccess SimpleName args
string SimpleName SimpleType CastExpression ArrayAccess SimpleName i
i SimpleName InfixExpression NumberLiteral empty
args SimpleName ArrayAccess InfixExpression SimpleName i
args SimpleName ArrayAccess InfixExpression NumberLiteral empty
query SimpleName MethodInvocation SimpleName has
query SimpleName MethodInvocation CastExpression SimpleType SimpleName string
query SimpleName MethodInvocation CastExpression ArrayAccess SimpleName args
query SimpleName MethodInvocation CastExpression ArrayAccess SimpleName i
query SimpleName MethodInvocation ArrayAccess SimpleName args
query SimpleName MethodInvocation ArrayAccess InfixExpression SimpleName i
query SimpleName MethodInvocation ArrayAccess InfixExpression NumberLiteral empty
has SimpleName MethodInvocation CastExpression SimpleType SimpleName string
has SimpleName MethodInvocation CastExpression ArrayAccess SimpleName args
has SimpleName MethodInvocation CastExpression ArrayAccess SimpleName i
has SimpleName MethodInvocation ArrayAccess SimpleName args
has SimpleName MethodInvocation ArrayAccess InfixExpression SimpleName i
has SimpleName MethodInvocation ArrayAccess InfixExpression NumberLiteral empty
query SimpleName Assignment MethodInvocation SimpleName query
query SimpleName Assignment MethodInvocation SimpleName has
query SimpleName Assignment MethodInvocation ArrayAccess SimpleName args
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression QualifiedName argslength
int PrimitiveType VariableDeclarationExpression ForStatement Assignment SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement Assignment NumberLiteral empty
i SimpleName InfixExpression ForStatement Assignment SimpleName i
i SimpleName InfixExpression ForStatement Assignment NumberLiteral empty
argslength QualifiedName InfixExpression ForStatement Assignment SimpleName i
argslength QualifiedName InfixExpression ForStatement Assignment NumberLiteral empty
iterator SimpleName SimpleType ParameterizedType SimpleType SimpleName atlas vertex
query SimpleName MethodInvocation SimpleName vertices
query SimpleName MethodInvocation MethodInvocation SimpleName iterator
vertices SimpleName MethodInvocation MethodInvocation SimpleName iterator
results SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName query
results SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName vertices
results SimpleName VariableDeclarationFragment MethodInvocation SimpleName iterator
results SimpleName MethodInvocation SimpleName has next
results SimpleName MethodInvocation SimpleName next
results SimpleName MethodInvocation ConditionalExpression MethodInvocation SimpleName results
results SimpleName MethodInvocation ConditionalExpression MethodInvocation SimpleName next
has next SimpleName MethodInvocation ConditionalExpression MethodInvocation SimpleName results
has next SimpleName MethodInvocation ConditionalExpression MethodInvocation SimpleName next
vertex SimpleName VariableDeclarationFragment ConditionalExpression MethodInvocation SimpleName results
vertex SimpleName VariableDeclarationFragment ConditionalExpression MethodInvocation SimpleName has next
vertex SimpleName VariableDeclarationFragment ConditionalExpression MethodInvocation SimpleName results
vertex SimpleName VariableDeclarationFragment ConditionalExpression MethodInvocation SimpleName next
atlas vertex SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName vertex
get condition string SimpleName MethodInvocation SimpleName args
condition str SimpleName VariableDeclarationFragment MethodInvocation SimpleName get condition string
condition str SimpleName VariableDeclarationFragment MethodInvocation SimpleName args
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName condition str
log SimpleName MethodInvocation SimpleName is debug enabled
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral could not find a vertex with {}
log SimpleName MethodInvocation SimpleName condition str
debug SimpleName MethodInvocation StringLiteral could not find a vertex with {}
debug SimpleName MethodInvocation SimpleName condition str
could not find a vertex with {} StringLiteral MethodInvocation SimpleName condition str
could not find an entity in the repository with StringLiteral InfixExpression SimpleName condition str
entity not found exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral could not find an entity in the repository with
entity not found exception SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName condition str
log SimpleName MethodInvocation SimpleName is debug enabled
string SimpleName MethodInvocation SimpleName vertex
get condition string SimpleName MethodInvocation SimpleName args
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral found a vertex {} with {}
log SimpleName MethodInvocation MethodInvocation SimpleName string
log SimpleName MethodInvocation MethodInvocation SimpleName vertex
log SimpleName MethodInvocation MethodInvocation SimpleName get condition string
log SimpleName MethodInvocation MethodInvocation SimpleName args
debug SimpleName MethodInvocation StringLiteral found a vertex {} with {}
debug SimpleName MethodInvocation MethodInvocation SimpleName string
debug SimpleName MethodInvocation MethodInvocation SimpleName vertex
debug SimpleName MethodInvocation MethodInvocation SimpleName get condition string
debug SimpleName MethodInvocation MethodInvocation SimpleName args
found a vertex {} with {} StringLiteral MethodInvocation MethodInvocation SimpleName string
found a vertex {} with {} StringLiteral MethodInvocation MethodInvocation SimpleName vertex
found a vertex {} with {} StringLiteral MethodInvocation MethodInvocation SimpleName get condition string
found a vertex {} with {} StringLiteral MethodInvocation MethodInvocation SimpleName args
string SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get condition string
string SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName args
vertex SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get condition string
vertex SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName args
public Modifier MethodDeclaration SimpleType SimpleName atlas vertex
public Modifier MethodDeclaration SimpleName find vertex
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName object
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName args
public Modifier MethodDeclaration SimpleType SimpleName entity not found exception
public Modifier MethodDeclaration Block ReturnStatement SimpleName vertex
atlas vertex SimpleName SimpleType MethodDeclaration SimpleName find vertex
atlas vertex SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName args
atlas vertex SimpleName SimpleType MethodDeclaration SimpleType SimpleName entity not found exception
find vertex SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName object
find vertex SimpleName MethodDeclaration SingleVariableDeclaration SimpleName args
find vertex SimpleName MethodDeclaration SimpleType SimpleName entity not found exception
find vertex SimpleName MethodDeclaration Block ReturnStatement SimpleName vertex
args SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName entity not found exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName atlas vertex
public Modifier TypeDeclaration MethodDeclaration SimpleName find vertex
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName args
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName entity not found exception
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName atlas vertex
test SimpleName TypeDeclaration MethodDeclaration SimpleName find vertex
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName args
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName entity not found exception
