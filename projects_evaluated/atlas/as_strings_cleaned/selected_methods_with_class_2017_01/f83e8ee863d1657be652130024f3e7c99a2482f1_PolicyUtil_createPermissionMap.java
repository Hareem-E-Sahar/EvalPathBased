list SimpleName SimpleType ParameterizedType SimpleType SimpleName string
map SimpleName SimpleType ParameterizedType SimpleType SimpleName atlas resource types
map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
list SimpleName SimpleType ParameterizedType SimpleType SimpleName policy def
list SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName policy def list
policy def SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName policy def list
atlas action types SimpleName SimpleType SingleVariableDeclaration SimpleName permission type
simple atlas authorizeratlas accessor types QualifiedName SimpleType SingleVariableDeclaration SimpleName principal type
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral ==> policy util create permission map creating permission map for :: {} & {}
log SimpleName MethodInvocation SimpleName permission type
log SimpleName MethodInvocation SimpleName principal type
debug SimpleName MethodInvocation StringLiteral ==> policy util create permission map creating permission map for :: {} & {}
debug SimpleName MethodInvocation SimpleName permission type
debug SimpleName MethodInvocation SimpleName principal type
==> policy util create permission map creating permission map for :: {} & {} StringLiteral MethodInvocation SimpleName permission type
==> policy util create permission map creating permission map for :: {} & {} StringLiteral MethodInvocation SimpleName principal type
permission type SimpleName MethodInvocation SimpleName principal type
list SimpleName SimpleType ParameterizedType SimpleType SimpleName string
map SimpleName SimpleType ParameterizedType SimpleType SimpleName atlas resource types
map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
policy def SimpleName SimpleType SingleVariableDeclaration SimpleName policy def
log SimpleName MethodInvocation SimpleName is debug enabled
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral processing policy def : {}
log SimpleName MethodInvocation SimpleName policy def
debug SimpleName MethodInvocation StringLiteral processing policy def : {}
debug SimpleName MethodInvocation SimpleName policy def
processing policy def : {} StringLiteral MethodInvocation SimpleName policy def
list SimpleName SimpleType ParameterizedType SimpleType SimpleName atlas action types
map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
principal type SimpleName MethodInvocation SimpleName equals
principal type SimpleName MethodInvocation QualifiedName simple atlas authorizeratlas accessor typesuser
equals SimpleName MethodInvocation QualifiedName simple atlas authorizeratlas accessor typesuser
policy def SimpleName MethodInvocation SimpleName get users
policy def SimpleName MethodInvocation SimpleName get groups
principal type SimpleName MethodInvocation ConditionalExpression MethodInvocation SimpleName policy def
principal type SimpleName MethodInvocation ConditionalExpression MethodInvocation SimpleName get users
equals SimpleName MethodInvocation ConditionalExpression MethodInvocation SimpleName policy def
equals SimpleName MethodInvocation ConditionalExpression MethodInvocation SimpleName get users
simple atlas authorizeratlas accessor typesuser QualifiedName MethodInvocation ConditionalExpression MethodInvocation SimpleName policy def
simple atlas authorizeratlas accessor typesuser QualifiedName MethodInvocation ConditionalExpression MethodInvocation SimpleName get users
principal type SimpleName MethodInvocation ConditionalExpression MethodInvocation SimpleName policy def
principal type SimpleName MethodInvocation ConditionalExpression MethodInvocation SimpleName get groups
equals SimpleName MethodInvocation ConditionalExpression MethodInvocation SimpleName policy def
equals SimpleName MethodInvocation ConditionalExpression MethodInvocation SimpleName get groups
simple atlas authorizeratlas accessor typesuser QualifiedName MethodInvocation ConditionalExpression MethodInvocation SimpleName policy def
simple atlas authorizeratlas accessor typesuser QualifiedName MethodInvocation ConditionalExpression MethodInvocation SimpleName get groups
policy def SimpleName MethodInvocation ConditionalExpression MethodInvocation SimpleName policy def
policy def SimpleName MethodInvocation ConditionalExpression MethodInvocation SimpleName get groups
get users SimpleName MethodInvocation ConditionalExpression MethodInvocation SimpleName policy def
get users SimpleName MethodInvocation ConditionalExpression MethodInvocation SimpleName get groups
principal map SimpleName VariableDeclarationFragment ConditionalExpression MethodInvocation SimpleName principal type
principal map SimpleName VariableDeclarationFragment ConditionalExpression MethodInvocation SimpleName equals
principal map SimpleName VariableDeclarationFragment ConditionalExpression MethodInvocation QualifiedName simple atlas authorizeratlas accessor typesuser
principal map SimpleName VariableDeclarationFragment ConditionalExpression MethodInvocation SimpleName policy def
principal map SimpleName VariableDeclarationFragment ConditionalExpression MethodInvocation SimpleName get users
principal map SimpleName VariableDeclarationFragment ConditionalExpression MethodInvocation SimpleName policy def
principal map SimpleName VariableDeclarationFragment ConditionalExpression MethodInvocation SimpleName get groups
list SimpleName SimpleType ParameterizedType SimpleType SimpleName atlas action types
entry SimpleName SimpleType ParameterizedType SimpleType SimpleName string
entry SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName e
string SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName e
principal map SimpleName MethodInvocation SimpleName entry set
e SimpleName MethodInvocation SimpleName get value
e SimpleName MethodInvocation MethodInvocation SimpleName contains
get value SimpleName MethodInvocation MethodInvocation SimpleName contains
e SimpleName MethodInvocation MethodInvocation SimpleName permission type
get value SimpleName MethodInvocation MethodInvocation SimpleName permission type
contains SimpleName MethodInvocation SimpleName permission type
e SimpleName MethodInvocation SimpleName get key
username SimpleName VariableDeclarationFragment MethodInvocation SimpleName e
username SimpleName VariableDeclarationFragment MethodInvocation SimpleName get key
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName username
list SimpleName SimpleType ParameterizedType SimpleType SimpleName string
map SimpleName SimpleType ParameterizedType SimpleType SimpleName atlas resource types
user read map SimpleName MethodInvocation SimpleName get
user read map SimpleName MethodInvocation SimpleName username
get SimpleName MethodInvocation SimpleName username
user resource list SimpleName VariableDeclarationFragment MethodInvocation SimpleName user read map
user resource list SimpleName VariableDeclarationFragment MethodInvocation SimpleName get
user resource list SimpleName VariableDeclarationFragment MethodInvocation SimpleName username
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral resource list not found for {} creating it
log SimpleName MethodInvocation SimpleName username
debug SimpleName MethodInvocation StringLiteral resource list not found for {} creating it
debug SimpleName MethodInvocation SimpleName username
resource list not found for {} creating it StringLiteral MethodInvocation SimpleName username
list SimpleName SimpleType ParameterizedType SimpleType SimpleName string
entry SimpleName SimpleType ParameterizedType SimpleType SimpleName atlas resource types
entry SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName resource type map
atlas resource types SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName resource type map
policy def SimpleName MethodInvocation SimpleName get resources
policy def SimpleName MethodInvocation MethodInvocation SimpleName entry set
get resources SimpleName MethodInvocation MethodInvocation SimpleName entry set
resource type map SimpleName MethodInvocation SimpleName get key
type SimpleName VariableDeclarationFragment MethodInvocation SimpleName resource type map
type SimpleName VariableDeclarationFragment MethodInvocation SimpleName get key
atlas resource types SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName type
list SimpleName SimpleType ParameterizedType SimpleType SimpleName string
user resource list SimpleName MethodInvocation SimpleName get
user resource list SimpleName MethodInvocation SimpleName type
get SimpleName MethodInvocation SimpleName type
resource list SimpleName VariableDeclarationFragment MethodInvocation SimpleName user resource list
resource list SimpleName VariableDeclarationFragment MethodInvocation SimpleName get
resource list SimpleName VariableDeclarationFragment MethodInvocation SimpleName type
resource type map SimpleName MethodInvocation SimpleName get value
resource list SimpleName MethodInvocation SimpleName add all
resource list SimpleName MethodInvocation MethodInvocation SimpleName resource type map
resource list SimpleName MethodInvocation MethodInvocation SimpleName get value
add all SimpleName MethodInvocation MethodInvocation SimpleName resource type map
add all SimpleName MethodInvocation MethodInvocation SimpleName get value
resource type map SimpleName MethodInvocation SimpleName get value
resource list SimpleName MethodInvocation SimpleName remove all
resource list SimpleName MethodInvocation MethodInvocation SimpleName resource type map
resource list SimpleName MethodInvocation MethodInvocation SimpleName get value
remove all SimpleName MethodInvocation MethodInvocation SimpleName resource type map
remove all SimpleName MethodInvocation MethodInvocation SimpleName get value
resource type map SimpleName MethodInvocation SimpleName get value
resource list SimpleName MethodInvocation SimpleName add all
resource list SimpleName MethodInvocation MethodInvocation SimpleName resource type map
resource list SimpleName MethodInvocation MethodInvocation SimpleName get value
add all SimpleName MethodInvocation MethodInvocation SimpleName resource type map
add all SimpleName MethodInvocation MethodInvocation SimpleName get value
user resource list SimpleName MethodInvocation SimpleName put
user resource list SimpleName MethodInvocation SimpleName type
user resource list SimpleName MethodInvocation SimpleName resource list
put SimpleName MethodInvocation SimpleName type
put SimpleName MethodInvocation SimpleName resource list
type SimpleName MethodInvocation SimpleName resource list
resource type map SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName entry set
user read map SimpleName MethodInvocation SimpleName put
user read map SimpleName MethodInvocation SimpleName username
user read map SimpleName MethodInvocation SimpleName user resource list
put SimpleName MethodInvocation SimpleName username
put SimpleName MethodInvocation SimpleName user resource list
username SimpleName MethodInvocation SimpleName user resource list
log SimpleName MethodInvocation SimpleName is debug enabled
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral user read map {}
log SimpleName MethodInvocation SimpleName user read map
debug SimpleName MethodInvocation StringLiteral user read map {}
debug SimpleName MethodInvocation SimpleName user read map
user read map {} StringLiteral MethodInvocation SimpleName user read map
e SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName principal map
e SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName entry set
policy def SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName policy def list
policy def SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName policy def list
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral returning map for {} :: {}
log SimpleName MethodInvocation SimpleName principal type
log SimpleName MethodInvocation SimpleName user read map
debug SimpleName MethodInvocation StringLiteral returning map for {} :: {}
debug SimpleName MethodInvocation SimpleName principal type
debug SimpleName MethodInvocation SimpleName user read map
returning map for {} :: {} StringLiteral MethodInvocation SimpleName principal type
returning map for {} :: {} StringLiteral MethodInvocation SimpleName user read map
principal type SimpleName MethodInvocation SimpleName user read map
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral <== policy util create permission map
debug SimpleName MethodInvocation StringLiteral <== policy util create permission map
is debug enabled SimpleName IfStatement Block EnhancedForStatement SimpleName policy def list
is debug enabled SimpleName IfStatement Block IfStatement SimpleName is debug enabled
is debug enabled SimpleName IfStatement Block ReturnStatement SimpleName user read map
policy def list SimpleName EnhancedForStatement Block IfStatement SimpleName is debug enabled
policy def list SimpleName EnhancedForStatement Block ReturnStatement SimpleName user read map
is debug enabled SimpleName IfStatement Block ReturnStatement SimpleName user read map
public Modifier MethodDeclaration ParameterizedType SimpleType SimpleName map
public Modifier MethodDeclaration ParameterizedType SimpleType SimpleName string
public Modifier MethodDeclaration SimpleName create permission map
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName policy def list
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName atlas action types
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName permission type
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType QualifiedName simple atlas authorizeratlas accessor types
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName principal type
map SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName create permission map
string SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName create permission map
create permission map SimpleName MethodDeclaration SingleVariableDeclaration SimpleName policy def list
create permission map SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName atlas action types
create permission map SimpleName MethodDeclaration SingleVariableDeclaration SimpleName permission type
create permission map SimpleName MethodDeclaration SingleVariableDeclaration SimpleType QualifiedName simple atlas authorizeratlas accessor types
create permission map SimpleName MethodDeclaration SingleVariableDeclaration SimpleName principal type
create permission map SimpleName MethodDeclaration Block IfStatement SimpleName is debug enabled
create permission map SimpleName MethodDeclaration Block EnhancedForStatement SimpleName policy def list
create permission map SimpleName MethodDeclaration Block IfStatement SimpleName is debug enabled
create permission map SimpleName MethodDeclaration Block ReturnStatement SimpleName user read map
policy def list SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName permission type
policy def list SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName principal type
permission type SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName principal type
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration SimpleName create permission map
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName policy def list
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName permission type
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName principal type
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration SimpleName create permission map
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName policy def list
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName permission type
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName principal type
