vertex SimpleName SimpleType SingleVariableDeclaration SimpleName target vertex
iterable SimpleName SimpleType ParameterizedType SimpleType SimpleName edge
target vertex SimpleName MethodInvocation SimpleName get edges
target vertex SimpleName MethodInvocation QualifiedName directionin
get edges SimpleName MethodInvocation QualifiedName directionin
incoming edges SimpleName VariableDeclarationFragment MethodInvocation SimpleName target vertex
incoming edges SimpleName VariableDeclarationFragment MethodInvocation SimpleName get edges
incoming edges SimpleName VariableDeclarationFragment MethodInvocation QualifiedName directionin
edge SimpleName SimpleType SingleVariableDeclaration SimpleName edge
edge SimpleName MethodInvocation SimpleName get label
label SimpleName VariableDeclarationFragment MethodInvocation SimpleName edge
label SimpleName VariableDeclarationFragment MethodInvocation SimpleName get label
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName label
atlas edge label SimpleName SimpleType ClassInstanceCreation SimpleName label
atlas edge label SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName atlas edge label
atlas edge label SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName label
atlas edge label SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName atlas edge label
edge SimpleName MethodInvocation SimpleName get vertex
edge SimpleName MethodInvocation QualifiedName directionout
get vertex SimpleName MethodInvocation QualifiedName directionout
referencing vertex SimpleName VariableDeclarationFragment MethodInvocation SimpleName edge
referencing vertex SimpleName VariableDeclarationFragment MethodInvocation SimpleName get vertex
referencing vertex SimpleName VariableDeclarationFragment MethodInvocation QualifiedName directionout
vertex SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName referencing vertex
atlas edge label SimpleName MethodInvocation SimpleName get type name
type name SimpleName VariableDeclarationFragment MethodInvocation SimpleName atlas edge label
type name SimpleName VariableDeclarationFragment MethodInvocation SimpleName get type name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName type name
type system SimpleName MethodInvocation SimpleName get data type
type system SimpleName MethodInvocation TypeLiteral SimpleType SimpleName i constructable type
type system SimpleName MethodInvocation SimpleName type name
get data type SimpleName MethodInvocation TypeLiteral SimpleType SimpleName i constructable type
get data type SimpleName MethodInvocation SimpleName type name
i constructable type SimpleName SimpleType TypeLiteral MethodInvocation SimpleName type name
referencing type SimpleName VariableDeclarationFragment MethodInvocation SimpleName type system
referencing type SimpleName VariableDeclarationFragment MethodInvocation SimpleName get data type
referencing type SimpleName VariableDeclarationFragment MethodInvocation SimpleName type name
i constructable type SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName referencing type
referencing type SimpleName MethodInvocation SimpleName field mapping
referencing type SimpleName MethodInvocation FieldAccess SimpleName fields
field mapping SimpleName MethodInvocation FieldAccess SimpleName fields
atlas edge label SimpleName MethodInvocation SimpleName get attribute name
referencing type SimpleName MethodInvocation FieldAccess MethodInvocation SimpleName get
field mapping SimpleName MethodInvocation FieldAccess MethodInvocation SimpleName get
fields SimpleName FieldAccess MethodInvocation SimpleName get
fields SimpleName FieldAccess MethodInvocation MethodInvocation SimpleName atlas edge label
fields SimpleName FieldAccess MethodInvocation MethodInvocation SimpleName get attribute name
get SimpleName MethodInvocation MethodInvocation SimpleName atlas edge label
get SimpleName MethodInvocation MethodInvocation SimpleName get attribute name
attribute info SimpleName VariableDeclarationFragment MethodInvocation FieldAccess SimpleName fields
attribute info SimpleName VariableDeclarationFragment MethodInvocation SimpleName get
attribute info SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName atlas edge label
attribute info SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get attribute name
attribute info SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName attribute info
get instance name SimpleName MethodInvocation SimpleName referencing vertex
get instance name SimpleName MethodInvocation SimpleName referencing type
referencing vertex SimpleName MethodInvocation SimpleName referencing type
instance id SimpleName VariableDeclarationFragment MethodInvocation SimpleName get instance name
instance id SimpleName VariableDeclarationFragment MethodInvocation SimpleName referencing vertex
instance id SimpleName VariableDeclarationFragment MethodInvocation SimpleName referencing type
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName instance id
edge SimpleName MethodInvocation SimpleName get id
edge SimpleName MethodInvocation MethodInvocation SimpleName to string
get id SimpleName MethodInvocation MethodInvocation SimpleName to string
atlas edge label SimpleName MethodInvocation SimpleName get attribute name
referencing type SimpleName MethodInvocation SimpleName get type category
outgoing edge StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName edge
outgoing edge StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName get id
outgoing edge StringLiteral InfixExpression MethodInvocation SimpleName to string
outgoing edge StringLiteral InfixExpression StringLiteral for
outgoing edge StringLiteral InfixExpression SimpleName instance id
outgoing edge StringLiteral InfixExpression StringLiteral vertex
outgoing edge StringLiteral InfixExpression SimpleName referencing vertex
edge SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral for
get id SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral for
to string SimpleName MethodInvocation InfixExpression StringLiteral for
edge SimpleName MethodInvocation MethodInvocation InfixExpression SimpleName instance id
get id SimpleName MethodInvocation MethodInvocation InfixExpression SimpleName instance id
to string SimpleName MethodInvocation InfixExpression SimpleName instance id
edge SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral vertex
get id SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral vertex
to string SimpleName MethodInvocation InfixExpression StringLiteral vertex
edge SimpleName MethodInvocation MethodInvocation InfixExpression SimpleName referencing vertex
get id SimpleName MethodInvocation MethodInvocation InfixExpression SimpleName referencing vertex
to string SimpleName MethodInvocation InfixExpression SimpleName referencing vertex
edge SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral ): label
get id SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral ): label
to string SimpleName MethodInvocation InfixExpression StringLiteral ): label
for StringLiteral InfixExpression SimpleName instance id
for StringLiteral InfixExpression StringLiteral vertex
for StringLiteral InfixExpression SimpleName referencing vertex
for StringLiteral InfixExpression StringLiteral ): label
for StringLiteral InfixExpression SimpleName label
instance id SimpleName InfixExpression StringLiteral vertex
instance id SimpleName InfixExpression SimpleName referencing vertex
instance id SimpleName InfixExpression StringLiteral ): label
instance id SimpleName InfixExpression SimpleName label
instance id SimpleName InfixExpression StringLiteral has an attribute name
vertex StringLiteral InfixExpression SimpleName referencing vertex
vertex StringLiteral InfixExpression StringLiteral ): label
vertex StringLiteral InfixExpression SimpleName label
vertex StringLiteral InfixExpression StringLiteral has an attribute name
vertex StringLiteral InfixExpression MethodInvocation SimpleName atlas edge label
vertex StringLiteral InfixExpression MethodInvocation SimpleName get attribute name
referencing vertex SimpleName InfixExpression StringLiteral ): label
referencing vertex SimpleName InfixExpression SimpleName label
referencing vertex SimpleName InfixExpression StringLiteral has an attribute name
referencing vertex SimpleName InfixExpression MethodInvocation SimpleName atlas edge label
referencing vertex SimpleName InfixExpression MethodInvocation SimpleName get attribute name
referencing vertex SimpleName InfixExpression StringLiteral that is undefined on
): label StringLiteral InfixExpression SimpleName label
): label StringLiteral InfixExpression StringLiteral has an attribute name
): label StringLiteral InfixExpression MethodInvocation SimpleName atlas edge label
): label StringLiteral InfixExpression MethodInvocation SimpleName get attribute name
): label StringLiteral InfixExpression StringLiteral that is undefined on
): label StringLiteral InfixExpression MethodInvocation SimpleName referencing type
): label StringLiteral InfixExpression MethodInvocation SimpleName get type category
label SimpleName InfixExpression StringLiteral has an attribute name
label SimpleName InfixExpression MethodInvocation SimpleName atlas edge label
label SimpleName InfixExpression MethodInvocation SimpleName get attribute name
label SimpleName InfixExpression StringLiteral that is undefined on
label SimpleName InfixExpression MethodInvocation SimpleName referencing type
label SimpleName InfixExpression MethodInvocation SimpleName get type category
label SimpleName InfixExpression StringLiteral empty
has an attribute name StringLiteral InfixExpression MethodInvocation SimpleName atlas edge label
has an attribute name StringLiteral InfixExpression MethodInvocation SimpleName get attribute name
has an attribute name StringLiteral InfixExpression StringLiteral that is undefined on
has an attribute name StringLiteral InfixExpression MethodInvocation SimpleName referencing type
has an attribute name StringLiteral InfixExpression MethodInvocation SimpleName get type category
has an attribute name StringLiteral InfixExpression StringLiteral empty
has an attribute name StringLiteral InfixExpression SimpleName type name
atlas edge label SimpleName MethodInvocation InfixExpression StringLiteral that is undefined on
get attribute name SimpleName MethodInvocation InfixExpression StringLiteral that is undefined on
atlas edge label SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName referencing type
atlas edge label SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get type category
get attribute name SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName referencing type
get attribute name SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get type category
atlas edge label SimpleName MethodInvocation InfixExpression StringLiteral empty
get attribute name SimpleName MethodInvocation InfixExpression StringLiteral empty
atlas edge label SimpleName MethodInvocation InfixExpression SimpleName type name
get attribute name SimpleName MethodInvocation InfixExpression SimpleName type name
that is undefined on StringLiteral InfixExpression MethodInvocation SimpleName referencing type
that is undefined on StringLiteral InfixExpression MethodInvocation SimpleName get type category
that is undefined on StringLiteral InfixExpression StringLiteral empty
that is undefined on StringLiteral InfixExpression SimpleName type name
referencing type SimpleName MethodInvocation InfixExpression StringLiteral empty
get type category SimpleName MethodInvocation InfixExpression StringLiteral empty
referencing type SimpleName MethodInvocation InfixExpression SimpleName type name
get type category SimpleName MethodInvocation InfixExpression SimpleName type name
empty StringLiteral InfixExpression SimpleName type name
atlas exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral outgoing edge
atlas exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral for
atlas exception SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName instance id
atlas exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral vertex
atlas exception SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName referencing vertex
atlas exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral ): label
atlas exception SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName label
atlas exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral has an attribute name
atlas exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral that is undefined on
atlas exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral empty
atlas exception SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName type name
attribute info SimpleName MethodInvocation SimpleName data type
attribute info SimpleName MethodInvocation MethodInvocation SimpleName get type category
data type SimpleName MethodInvocation MethodInvocation SimpleName get type category
remove reference value SimpleName MethodInvocation SimpleName edge
remove reference value SimpleName MethodInvocation SimpleName atlas edge label
remove reference value SimpleName MethodInvocation SimpleName referencing vertex
remove reference value SimpleName MethodInvocation SimpleName referencing type
remove reference value SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName attribute info
remove reference value SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName data type
remove reference value SimpleName MethodInvocation MethodInvocation SimpleName get type category
edge SimpleName MethodInvocation SimpleName atlas edge label
edge SimpleName MethodInvocation SimpleName referencing vertex
edge SimpleName MethodInvocation SimpleName referencing type
edge SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName attribute info
edge SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName data type
edge SimpleName MethodInvocation MethodInvocation SimpleName get type category
atlas edge label SimpleName MethodInvocation SimpleName referencing vertex
atlas edge label SimpleName MethodInvocation SimpleName referencing type
atlas edge label SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName attribute info
atlas edge label SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName data type
atlas edge label SimpleName MethodInvocation MethodInvocation SimpleName get type category
referencing vertex SimpleName MethodInvocation SimpleName referencing type
referencing vertex SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName attribute info
referencing vertex SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName data type
referencing vertex SimpleName MethodInvocation MethodInvocation SimpleName get type category
referencing type SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName attribute info
referencing type SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName data type
referencing type SimpleName MethodInvocation MethodInvocation SimpleName get type category
edge SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName incoming edges
edge SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName incoming edges
private Modifier MethodDeclaration PrimitiveType void
private Modifier MethodDeclaration SimpleName remove unidirectional references
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName vertex
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName target vertex
private Modifier MethodDeclaration SimpleType SimpleName atlas exception
private Modifier MethodDeclaration Block EnhancedForStatement SimpleName incoming edges
void PrimitiveType MethodDeclaration SimpleName remove unidirectional references
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName vertex
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName target vertex
void PrimitiveType MethodDeclaration SimpleType SimpleName atlas exception
void PrimitiveType MethodDeclaration Block EnhancedForStatement SimpleName incoming edges
remove unidirectional references SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName vertex
remove unidirectional references SimpleName MethodDeclaration SingleVariableDeclaration SimpleName target vertex
remove unidirectional references SimpleName MethodDeclaration SimpleType SimpleName atlas exception
remove unidirectional references SimpleName MethodDeclaration Block EnhancedForStatement SimpleName incoming edges
target vertex SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName atlas exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName remove unidirectional references
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName target vertex
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName atlas exception
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName remove unidirectional references
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName target vertex
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName atlas exception
