string SimpleName SimpleType SingleVariableDeclaration SimpleName resource def
policy def SimpleName SimpleType SingleVariableDeclaration SimpleName def
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral ==> policy parser parse resources
debug SimpleName MethodInvocation StringLiteral ==> policy parser parse resources
resource def SimpleName MethodInvocation SimpleName split
resource def SimpleName MethodInvocation StringLiteral empty
split SimpleName MethodInvocation StringLiteral empty
resources SimpleName VariableDeclarationFragment MethodInvocation SimpleName resource def
resources SimpleName VariableDeclarationFragment MethodInvocation SimpleName split
resources SimpleName VariableDeclarationFragment MethodInvocation StringLiteral empty
list SimpleName SimpleType ParameterizedType SimpleType SimpleName string
map SimpleName SimpleType ParameterizedType SimpleType SimpleName atlas resource types
validate entity SimpleName MethodInvocation SimpleName resource def
string SimpleName SimpleType SingleVariableDeclaration SimpleName resource
pattern SimpleName MethodInvocation SimpleName matches
pattern SimpleName MethodInvocation StringLiteral (.+:.+)+
pattern SimpleName MethodInvocation SimpleName resource
matches SimpleName MethodInvocation StringLiteral (.+:.+)+
matches SimpleName MethodInvocation SimpleName resource
(.+:.+)+ StringLiteral MethodInvocation SimpleName resource
resource SimpleName MethodInvocation SimpleName split
resource SimpleName MethodInvocation StringLiteral [:]
split SimpleName MethodInvocation StringLiteral [:]
resource type and name SimpleName Assignment MethodInvocation SimpleName resource
resource type and name SimpleName Assignment MethodInvocation SimpleName split
resource type and name SimpleName Assignment MethodInvocation StringLiteral [:]
def SimpleName MethodInvocation SimpleName get resources
def SimpleName MethodInvocation SimpleName get resources
resources map SimpleName Assignment MethodInvocation SimpleName def
resources map SimpleName Assignment MethodInvocation SimpleName get resources
atlas resource types SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName resource type
resource type and name SimpleName ArrayAccess SimpleName resource type
resource type and name SimpleName ArrayAccess MethodInvocation SimpleName to upper case
resource type SimpleName ArrayAccess MethodInvocation SimpleName to upper case
type SimpleName VariableDeclarationFragment MethodInvocation ArrayAccess SimpleName resource type and name
type SimpleName VariableDeclarationFragment MethodInvocation ArrayAccess SimpleName resource type
type SimpleName VariableDeclarationFragment MethodInvocation SimpleName to upper case
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName type
type SimpleName MethodInvocation SimpleName equals ignore case
type SimpleName MethodInvocation StringLiteral entity
equals ignore case SimpleName MethodInvocation StringLiteral entity
resource type SimpleName Assignment QualifiedName atlas resource typesentity
type SimpleName MethodInvocation SimpleName equals ignore case
type SimpleName MethodInvocation StringLiteral operation
equals ignore case SimpleName MethodInvocation StringLiteral operation
resource type SimpleName Assignment QualifiedName atlas resource typesoperation
type SimpleName MethodInvocation SimpleName equals ignore case
type SimpleName MethodInvocation StringLiteral type
equals ignore case SimpleName MethodInvocation StringLiteral type
resource type SimpleName Assignment QualifiedName atlas resource typestype
type SimpleName MethodInvocation SimpleName equals ignore case
type SimpleName MethodInvocation StringLiteral taxonomy
equals ignore case SimpleName MethodInvocation StringLiteral taxonomy
resource type SimpleName Assignment QualifiedName atlas resource typestaxonomy
type SimpleName MethodInvocation SimpleName equals ignore case
type SimpleName MethodInvocation StringLiteral term
equals ignore case SimpleName MethodInvocation StringLiteral term
resource type SimpleName Assignment QualifiedName atlas resource typesterm
type SimpleName MethodInvocation SimpleName equals ignore case
type SimpleName MethodInvocation StringLiteral relation
equals ignore case SimpleName MethodInvocation StringLiteral relation
resource type SimpleName Assignment QualifiedName atlas resource typesrelation
type SimpleName InfixExpression StringLiteral is invalid resource please check policy store file
log SimpleName MethodInvocation SimpleName warn
log SimpleName MethodInvocation InfixExpression SimpleName type
log SimpleName MethodInvocation InfixExpression StringLiteral is invalid resource please check policy store file
warn SimpleName MethodInvocation InfixExpression SimpleName type
warn SimpleName MethodInvocation InfixExpression StringLiteral is invalid resource please check policy store file
list SimpleName SimpleType ParameterizedType SimpleType SimpleName string
resources map SimpleName MethodInvocation SimpleName get
resources map SimpleName MethodInvocation SimpleName resource type
get SimpleName MethodInvocation SimpleName resource type
resource list SimpleName VariableDeclarationFragment MethodInvocation SimpleName resources map
resource list SimpleName VariableDeclarationFragment MethodInvocation SimpleName get
resource list SimpleName VariableDeclarationFragment MethodInvocation SimpleName resource type
resource type and name SimpleName ArrayAccess SimpleName resource name
resource list SimpleName MethodInvocation SimpleName add
resource list SimpleName MethodInvocation ArrayAccess SimpleName resource type and name
resource list SimpleName MethodInvocation ArrayAccess SimpleName resource name
add SimpleName MethodInvocation ArrayAccess SimpleName resource type and name
add SimpleName MethodInvocation ArrayAccess SimpleName resource name
resources map SimpleName MethodInvocation SimpleName put
resources map SimpleName MethodInvocation SimpleName resource type
resources map SimpleName MethodInvocation SimpleName resource list
put SimpleName MethodInvocation SimpleName resource type
put SimpleName MethodInvocation SimpleName resource list
resource type SimpleName MethodInvocation SimpleName resource list
def SimpleName MethodInvocation SimpleName set resources
def SimpleName MethodInvocation SimpleName resources map
set resources SimpleName MethodInvocation SimpleName resources map
string SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName resources
resource SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName resources
def SimpleName MethodInvocation SimpleName set resources
def SimpleName MethodInvocation SimpleName resources map
set resources SimpleName MethodInvocation SimpleName resources map
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral <== policy parser parse resources
debug SimpleName MethodInvocation StringLiteral <== policy parser parse resources
is debug enabled SimpleName IfStatement Block IfStatement SimpleName is debug enabled
private Modifier MethodDeclaration PrimitiveType void
private Modifier MethodDeclaration SimpleName parse resources
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName resource def
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName policy def
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName def
private Modifier MethodDeclaration Block IfStatement SimpleName is debug enabled
private Modifier MethodDeclaration Block IfStatement SimpleName is debug enabled
void PrimitiveType MethodDeclaration SimpleName parse resources
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName resource def
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName policy def
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName def
void PrimitiveType MethodDeclaration Block IfStatement SimpleName is debug enabled
void PrimitiveType MethodDeclaration Block IfStatement SimpleName is debug enabled
parse resources SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
parse resources SimpleName MethodDeclaration SingleVariableDeclaration SimpleName resource def
parse resources SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName policy def
parse resources SimpleName MethodDeclaration SingleVariableDeclaration SimpleName def
parse resources SimpleName MethodDeclaration Block IfStatement SimpleName is debug enabled
parse resources SimpleName MethodDeclaration Block IfStatement SimpleName is debug enabled
resource def SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName def
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName parse resources
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName resource def
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName def
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName parse resources
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName resource def
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName def
