type utilspair QualifiedName SimpleType ParameterizedType SimpleType SimpleName edge
type utilspair QualifiedName SimpleType ParameterizedType SimpleType SimpleName vertex
edge SimpleName SimpleType ParameterizedType SimpleType SimpleName vertex
type utilspair QualifiedName SimpleType ParameterizedType SingleVariableDeclaration SimpleName edge and vertex
edge SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName edge and vertex
vertex SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName edge and vertex
attribute info SimpleName SimpleType SingleVariableDeclaration SimpleName attribute info
edge and vertexleft QualifiedName MethodInvocation SimpleName get vertex
edge and vertexleft QualifiedName MethodInvocation QualifiedName directionout
get vertex SimpleName MethodInvocation QualifiedName directionout
source vertex SimpleName VariableDeclarationFragment MethodInvocation QualifiedName edge and vertexleft
source vertex SimpleName VariableDeclarationFragment MethodInvocation SimpleName get vertex
source vertex SimpleName VariableDeclarationFragment MethodInvocation QualifiedName directionout
vertex SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName source vertex
graph helper SimpleName MethodInvocation SimpleName get type name
graph helper SimpleName MethodInvocation QualifiedName edge and vertexright
get type name SimpleName MethodInvocation QualifiedName edge and vertexright
inverse type name SimpleName VariableDeclarationFragment MethodInvocation SimpleName graph helper
inverse type name SimpleName VariableDeclarationFragment MethodInvocation SimpleName get type name
inverse type name SimpleName VariableDeclarationFragment MethodInvocation QualifiedName edge and vertexright
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName inverse type name
type system SimpleName MethodInvocation SimpleName get data type
type system SimpleName MethodInvocation TypeLiteral SimpleType SimpleName i constructable type
type system SimpleName MethodInvocation SimpleName inverse type name
get data type SimpleName MethodInvocation TypeLiteral SimpleType SimpleName i constructable type
get data type SimpleName MethodInvocation SimpleName inverse type name
i constructable type SimpleName SimpleType TypeLiteral MethodInvocation SimpleName inverse type name
inverse type SimpleName VariableDeclarationFragment MethodInvocation SimpleName type system
inverse type SimpleName VariableDeclarationFragment MethodInvocation SimpleName get data type
inverse type SimpleName VariableDeclarationFragment MethodInvocation SimpleName inverse type name
i constructable type SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName inverse type
inverse type SimpleName MethodInvocation SimpleName field mapping
inverse type SimpleName MethodInvocation FieldAccess SimpleName fields
field mapping SimpleName MethodInvocation FieldAccess SimpleName fields
inverse type SimpleName MethodInvocation FieldAccess MethodInvocation SimpleName get
field mapping SimpleName MethodInvocation FieldAccess MethodInvocation SimpleName get
fields SimpleName FieldAccess MethodInvocation SimpleName get
inverse type SimpleName MethodInvocation FieldAccess MethodInvocation QualifiedName attribute inforeverse attribute name
field mapping SimpleName MethodInvocation FieldAccess MethodInvocation QualifiedName attribute inforeverse attribute name
fields SimpleName FieldAccess MethodInvocation QualifiedName attribute inforeverse attribute name
get SimpleName MethodInvocation QualifiedName attribute inforeverse attribute name
inverse attribute info SimpleName VariableDeclarationFragment MethodInvocation FieldAccess SimpleName fields
inverse attribute info SimpleName VariableDeclarationFragment MethodInvocation SimpleName get
inverse attribute info SimpleName VariableDeclarationFragment MethodInvocation QualifiedName attribute inforeverse attribute name
attribute info SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName inverse attribute info
graph helper SimpleName MethodInvocation SimpleName get edge label
graph helper SimpleName MethodInvocation SimpleName inverse type
graph helper SimpleName MethodInvocation SimpleName inverse attribute info
get edge label SimpleName MethodInvocation SimpleName inverse type
get edge label SimpleName MethodInvocation SimpleName inverse attribute info
inverse type SimpleName MethodInvocation SimpleName inverse attribute info
inverse edge label SimpleName VariableDeclarationFragment MethodInvocation SimpleName graph helper
inverse edge label SimpleName VariableDeclarationFragment MethodInvocation SimpleName get edge label
inverse edge label SimpleName VariableDeclarationFragment MethodInvocation SimpleName inverse type
inverse edge label SimpleName VariableDeclarationFragment MethodInvocation SimpleName inverse attribute info
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName inverse edge label
inverse attribute info SimpleName MethodInvocation SimpleName data type
inverse attribute info SimpleName MethodInvocation MethodInvocation SimpleName get type category
data type SimpleName MethodInvocation MethodInvocation SimpleName get type category
inverse type category SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName inverse attribute info
inverse type category SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName data type
inverse type category SimpleName VariableDeclarationFragment MethodInvocation SimpleName get type category
type category SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName inverse type category
iterable SimpleName SimpleType ParameterizedType SimpleType SimpleName edge
graph helper SimpleName MethodInvocation SimpleName get out going edges by label
graph helper SimpleName MethodInvocation QualifiedName edge and vertexright
graph helper SimpleName MethodInvocation SimpleName inverse edge label
get out going edges by label SimpleName MethodInvocation QualifiedName edge and vertexright
get out going edges by label SimpleName MethodInvocation SimpleName inverse edge label
edge and vertexright QualifiedName MethodInvocation SimpleName inverse edge label
inverse edges SimpleName VariableDeclarationFragment MethodInvocation SimpleName graph helper
inverse edges SimpleName VariableDeclarationFragment MethodInvocation SimpleName get out going edges by label
inverse edges SimpleName VariableDeclarationFragment MethodInvocation QualifiedName edge and vertexright
inverse edges SimpleName VariableDeclarationFragment MethodInvocation SimpleName inverse edge label
edge SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName removed edge
edge SimpleName SimpleType SingleVariableDeclaration SimpleName edge
edge SimpleName MethodInvocation SimpleName get vertex
edge SimpleName MethodInvocation QualifiedName directionin
get vertex SimpleName MethodInvocation QualifiedName directionin
vertex SimpleName VariableDeclarationFragment MethodInvocation SimpleName edge
vertex SimpleName VariableDeclarationFragment MethodInvocation SimpleName get vertex
vertex SimpleName VariableDeclarationFragment MethodInvocation QualifiedName directionin
vertex SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName vertex
vertex SimpleName MethodInvocation SimpleName equals
vertex SimpleName MethodInvocation SimpleName source vertex
equals SimpleName MethodInvocation SimpleName source vertex
edge SimpleName MethodInvocation SimpleName get label
atlas edge label SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName edge
atlas edge label SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get label
remove reference value SimpleName MethodInvocation SimpleName edge
remove reference value SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName atlas edge label
remove reference value SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName edge
remove reference value SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get label
remove reference value SimpleName MethodInvocation QualifiedName edge and vertexright
remove reference value SimpleName MethodInvocation SimpleName inverse type
remove reference value SimpleName MethodInvocation SimpleName inverse type category
edge SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName atlas edge label
edge SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName edge
edge SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get label
edge SimpleName MethodInvocation QualifiedName edge and vertexright
edge SimpleName MethodInvocation SimpleName inverse type
edge SimpleName MethodInvocation SimpleName inverse type category
atlas edge label SimpleName SimpleType ClassInstanceCreation MethodInvocation QualifiedName edge and vertexright
edge SimpleName MethodInvocation ClassInstanceCreation MethodInvocation QualifiedName edge and vertexright
get label SimpleName MethodInvocation ClassInstanceCreation MethodInvocation QualifiedName edge and vertexright
atlas edge label SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName inverse type
edge SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName inverse type
get label SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName inverse type
atlas edge label SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName inverse type category
edge SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName inverse type category
get label SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName inverse type category
edge and vertexright QualifiedName MethodInvocation SimpleName inverse type
edge and vertexright QualifiedName MethodInvocation SimpleName inverse type category
inverse type SimpleName MethodInvocation SimpleName inverse type category
removed edge SimpleName Assignment SimpleName edge
edge SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName inverse edges
edge SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName inverse edges
log SimpleName MethodInvocation SimpleName is debug enabled
graph helper SimpleName MethodInvocation SimpleName get type name
graph helper SimpleName MethodInvocation SimpleName source vertex
get type name SimpleName MethodInvocation SimpleName source vertex
source type name SimpleName VariableDeclarationFragment MethodInvocation SimpleName graph helper
source type name SimpleName VariableDeclarationFragment MethodInvocation SimpleName get type name
source type name SimpleName VariableDeclarationFragment MethodInvocation SimpleName source vertex
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName source type name
graph helper SimpleName MethodInvocation SimpleName get qualified field name
graph helper SimpleName MethodInvocation SimpleName inverse type
graph helper SimpleName MethodInvocation QualifiedName inverse attribute infoname
get qualified field name SimpleName MethodInvocation SimpleName inverse type
get qualified field name SimpleName MethodInvocation QualifiedName inverse attribute infoname
inverse type SimpleName MethodInvocation QualifiedName inverse attribute infoname
graph helper SimpleName MethodInvocation SimpleName get id from vertex
graph helper SimpleName MethodInvocation SimpleName inverse type name
graph helper SimpleName MethodInvocation QualifiedName edge and vertexright
get id from vertex SimpleName MethodInvocation SimpleName inverse type name
get id from vertex SimpleName MethodInvocation QualifiedName edge and vertexright
inverse type name SimpleName MethodInvocation QualifiedName edge and vertexright
graph helper SimpleName MethodInvocation MethodInvocation SimpleName get id
get id from vertex SimpleName MethodInvocation MethodInvocation SimpleName get id
inverse type name SimpleName MethodInvocation MethodInvocation SimpleName get id
edge and vertexright QualifiedName MethodInvocation MethodInvocation SimpleName get id
graph helper SimpleName MethodInvocation SimpleName get id from vertex
graph helper SimpleName MethodInvocation SimpleName source type name
graph helper SimpleName MethodInvocation SimpleName source vertex
get id from vertex SimpleName MethodInvocation SimpleName source type name
get id from vertex SimpleName MethodInvocation SimpleName source vertex
source type name SimpleName MethodInvocation SimpleName source vertex
graph helper SimpleName MethodInvocation MethodInvocation SimpleName get id
get id from vertex SimpleName MethodInvocation MethodInvocation SimpleName get id
source type name SimpleName MethodInvocation MethodInvocation SimpleName get id
source vertex SimpleName MethodInvocation MethodInvocation SimpleName get id
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral removed edge {} for reverse reference {} from {}:{} to {}:{}
log SimpleName MethodInvocation SimpleName removed edge
log SimpleName MethodInvocation MethodInvocation SimpleName graph helper
log SimpleName MethodInvocation MethodInvocation SimpleName get qualified field name
log SimpleName MethodInvocation MethodInvocation SimpleName inverse type
log SimpleName MethodInvocation MethodInvocation QualifiedName inverse attribute infoname
log SimpleName MethodInvocation SimpleName inverse type name
debug SimpleName MethodInvocation StringLiteral removed edge {} for reverse reference {} from {}:{} to {}:{}
debug SimpleName MethodInvocation SimpleName removed edge
debug SimpleName MethodInvocation MethodInvocation SimpleName graph helper
debug SimpleName MethodInvocation MethodInvocation SimpleName get qualified field name
debug SimpleName MethodInvocation MethodInvocation SimpleName inverse type
debug SimpleName MethodInvocation MethodInvocation QualifiedName inverse attribute infoname
debug SimpleName MethodInvocation SimpleName inverse type name
debug SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName graph helper
debug SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get id from vertex
debug SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName inverse type name
debug SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName edge and vertexright
debug SimpleName MethodInvocation MethodInvocation SimpleName get id
removed edge {} for reverse reference {} from {}:{} to {}:{} StringLiteral MethodInvocation SimpleName removed edge
removed edge {} for reverse reference {} from {}:{} to {}:{} StringLiteral MethodInvocation MethodInvocation SimpleName graph helper
removed edge {} for reverse reference {} from {}:{} to {}:{} StringLiteral MethodInvocation MethodInvocation SimpleName get qualified field name
removed edge {} for reverse reference {} from {}:{} to {}:{} StringLiteral MethodInvocation MethodInvocation SimpleName inverse type
removed edge {} for reverse reference {} from {}:{} to {}:{} StringLiteral MethodInvocation MethodInvocation QualifiedName inverse attribute infoname
removed edge {} for reverse reference {} from {}:{} to {}:{} StringLiteral MethodInvocation SimpleName inverse type name
removed edge {} for reverse reference {} from {}:{} to {}:{} StringLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName graph helper
removed edge {} for reverse reference {} from {}:{} to {}:{} StringLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName get id from vertex
removed edge {} for reverse reference {} from {}:{} to {}:{} StringLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName inverse type name
removed edge {} for reverse reference {} from {}:{} to {}:{} StringLiteral MethodInvocation MethodInvocation MethodInvocation QualifiedName edge and vertexright
removed edge {} for reverse reference {} from {}:{} to {}:{} StringLiteral MethodInvocation MethodInvocation SimpleName get id
removed edge {} for reverse reference {} from {}:{} to {}:{} StringLiteral MethodInvocation SimpleName source type name
removed edge SimpleName MethodInvocation MethodInvocation SimpleName graph helper
removed edge SimpleName MethodInvocation MethodInvocation SimpleName get qualified field name
removed edge SimpleName MethodInvocation MethodInvocation SimpleName inverse type
removed edge SimpleName MethodInvocation MethodInvocation QualifiedName inverse attribute infoname
removed edge SimpleName MethodInvocation SimpleName inverse type name
removed edge SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName graph helper
removed edge SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get id from vertex
removed edge SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName inverse type name
removed edge SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName edge and vertexright
removed edge SimpleName MethodInvocation MethodInvocation SimpleName get id
removed edge SimpleName MethodInvocation SimpleName source type name
removed edge SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName graph helper
removed edge SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get id from vertex
removed edge SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName source type name
removed edge SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName source vertex
removed edge SimpleName MethodInvocation MethodInvocation SimpleName get id
graph helper SimpleName MethodInvocation MethodInvocation SimpleName inverse type name
get qualified field name SimpleName MethodInvocation MethodInvocation SimpleName inverse type name
inverse type SimpleName MethodInvocation MethodInvocation SimpleName inverse type name
inverse attribute infoname QualifiedName MethodInvocation MethodInvocation SimpleName inverse type name
graph helper SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get id
get qualified field name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get id
inverse type SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get id
inverse attribute infoname QualifiedName MethodInvocation MethodInvocation MethodInvocation SimpleName get id
graph helper SimpleName MethodInvocation MethodInvocation SimpleName source type name
get qualified field name SimpleName MethodInvocation MethodInvocation SimpleName source type name
inverse type SimpleName MethodInvocation MethodInvocation SimpleName source type name
inverse attribute infoname QualifiedName MethodInvocation MethodInvocation SimpleName source type name
graph helper SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get id
get qualified field name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get id
inverse type SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get id
inverse attribute infoname QualifiedName MethodInvocation MethodInvocation MethodInvocation SimpleName get id
inverse type name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName graph helper
inverse type name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get id from vertex
inverse type name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName inverse type name
inverse type name SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName edge and vertexright
inverse type name SimpleName MethodInvocation MethodInvocation SimpleName get id
inverse type name SimpleName MethodInvocation SimpleName source type name
inverse type name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName graph helper
inverse type name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get id from vertex
inverse type name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName source type name
inverse type name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName source vertex
inverse type name SimpleName MethodInvocation MethodInvocation SimpleName get id
graph helper SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName source type name
get id from vertex SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName source type name
inverse type name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName source type name
edge and vertexright QualifiedName MethodInvocation MethodInvocation MethodInvocation SimpleName source type name
get id SimpleName MethodInvocation MethodInvocation SimpleName source type name
get id SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get id
source type name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName graph helper
source type name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get id from vertex
source type name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName source type name
source type name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName source vertex
source type name SimpleName MethodInvocation MethodInvocation SimpleName get id
graph helper SimpleName MethodInvocation SimpleName get type name
graph helper SimpleName MethodInvocation SimpleName source vertex
get type name SimpleName MethodInvocation SimpleName source vertex
source type name SimpleName VariableDeclarationFragment MethodInvocation SimpleName graph helper
source type name SimpleName VariableDeclarationFragment MethodInvocation SimpleName get type name
source type name SimpleName VariableDeclarationFragment MethodInvocation SimpleName source vertex
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName source type name
graph helper SimpleName MethodInvocation SimpleName get id from vertex
graph helper SimpleName MethodInvocation SimpleName inverse type name
graph helper SimpleName MethodInvocation QualifiedName edge and vertexright
get id from vertex SimpleName MethodInvocation SimpleName inverse type name
get id from vertex SimpleName MethodInvocation QualifiedName edge and vertexright
inverse type name SimpleName MethodInvocation QualifiedName edge and vertexright
graph helper SimpleName MethodInvocation MethodInvocation SimpleName get id
get id from vertex SimpleName MethodInvocation MethodInvocation SimpleName get id
inverse type name SimpleName MethodInvocation MethodInvocation SimpleName get id
edge and vertexright QualifiedName MethodInvocation MethodInvocation SimpleName get id
graph helper SimpleName MethodInvocation SimpleName get id from vertex
graph helper SimpleName MethodInvocation SimpleName source type name
graph helper SimpleName MethodInvocation SimpleName source vertex
get id from vertex SimpleName MethodInvocation SimpleName source type name
get id from vertex SimpleName MethodInvocation SimpleName source vertex
source type name SimpleName MethodInvocation SimpleName source vertex
graph helper SimpleName MethodInvocation MethodInvocation SimpleName get id
get id from vertex SimpleName MethodInvocation MethodInvocation SimpleName get id
source type name SimpleName MethodInvocation MethodInvocation SimpleName get id
source vertex SimpleName MethodInvocation MethodInvocation SimpleName get id
log SimpleName MethodInvocation SimpleName warn
log SimpleName MethodInvocation StringLiteral no edge found for inverse reference {} on vertex {} for entity instance {}:{} which points back to vertex {} for {}:{}
log SimpleName MethodInvocation QualifiedName inverse attribute infoname
log SimpleName MethodInvocation QualifiedName edge and vertexright
log SimpleName MethodInvocation SimpleName inverse type name
warn SimpleName MethodInvocation StringLiteral no edge found for inverse reference {} on vertex {} for entity instance {}:{} which points back to vertex {} for {}:{}
warn SimpleName MethodInvocation QualifiedName inverse attribute infoname
warn SimpleName MethodInvocation QualifiedName edge and vertexright
warn SimpleName MethodInvocation SimpleName inverse type name
warn SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName graph helper
warn SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get id from vertex
warn SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName inverse type name
warn SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName edge and vertexright
warn SimpleName MethodInvocation MethodInvocation SimpleName get id
no edge found for inverse reference {} on vertex {} for entity instance {}:{} which points back to vertex {} for {}:{} StringLiteral MethodInvocation QualifiedName inverse attribute infoname
no edge found for inverse reference {} on vertex {} for entity instance {}:{} which points back to vertex {} for {}:{} StringLiteral MethodInvocation QualifiedName edge and vertexright
no edge found for inverse reference {} on vertex {} for entity instance {}:{} which points back to vertex {} for {}:{} StringLiteral MethodInvocation SimpleName inverse type name
no edge found for inverse reference {} on vertex {} for entity instance {}:{} which points back to vertex {} for {}:{} StringLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName graph helper
no edge found for inverse reference {} on vertex {} for entity instance {}:{} which points back to vertex {} for {}:{} StringLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName get id from vertex
no edge found for inverse reference {} on vertex {} for entity instance {}:{} which points back to vertex {} for {}:{} StringLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName inverse type name
no edge found for inverse reference {} on vertex {} for entity instance {}:{} which points back to vertex {} for {}:{} StringLiteral MethodInvocation MethodInvocation MethodInvocation QualifiedName edge and vertexright
no edge found for inverse reference {} on vertex {} for entity instance {}:{} which points back to vertex {} for {}:{} StringLiteral MethodInvocation MethodInvocation SimpleName get id
no edge found for inverse reference {} on vertex {} for entity instance {}:{} which points back to vertex {} for {}:{} StringLiteral MethodInvocation SimpleName source vertex
inverse attribute infoname QualifiedName MethodInvocation QualifiedName edge and vertexright
inverse attribute infoname QualifiedName MethodInvocation SimpleName inverse type name
inverse attribute infoname QualifiedName MethodInvocation MethodInvocation MethodInvocation SimpleName graph helper
inverse attribute infoname QualifiedName MethodInvocation MethodInvocation MethodInvocation SimpleName get id from vertex
inverse attribute infoname QualifiedName MethodInvocation MethodInvocation MethodInvocation SimpleName inverse type name
inverse attribute infoname QualifiedName MethodInvocation MethodInvocation MethodInvocation QualifiedName edge and vertexright
inverse attribute infoname QualifiedName MethodInvocation MethodInvocation SimpleName get id
inverse attribute infoname QualifiedName MethodInvocation SimpleName source vertex
inverse attribute infoname QualifiedName MethodInvocation SimpleName source type name
edge and vertexright QualifiedName MethodInvocation SimpleName inverse type name
edge and vertexright QualifiedName MethodInvocation MethodInvocation MethodInvocation SimpleName graph helper
edge and vertexright QualifiedName MethodInvocation MethodInvocation MethodInvocation SimpleName get id from vertex
edge and vertexright QualifiedName MethodInvocation MethodInvocation MethodInvocation SimpleName inverse type name
edge and vertexright QualifiedName MethodInvocation MethodInvocation MethodInvocation QualifiedName edge and vertexright
edge and vertexright QualifiedName MethodInvocation MethodInvocation SimpleName get id
edge and vertexright QualifiedName MethodInvocation SimpleName source vertex
edge and vertexright QualifiedName MethodInvocation SimpleName source type name
edge and vertexright QualifiedName MethodInvocation MethodInvocation MethodInvocation SimpleName graph helper
edge and vertexright QualifiedName MethodInvocation MethodInvocation MethodInvocation SimpleName get id from vertex
edge and vertexright QualifiedName MethodInvocation MethodInvocation MethodInvocation SimpleName source type name
edge and vertexright QualifiedName MethodInvocation MethodInvocation MethodInvocation SimpleName source vertex
edge and vertexright QualifiedName MethodInvocation MethodInvocation SimpleName get id
inverse type name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName graph helper
inverse type name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get id from vertex
inverse type name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName inverse type name
inverse type name SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName edge and vertexright
inverse type name SimpleName MethodInvocation MethodInvocation SimpleName get id
inverse type name SimpleName MethodInvocation SimpleName source vertex
inverse type name SimpleName MethodInvocation SimpleName source type name
inverse type name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName graph helper
inverse type name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get id from vertex
inverse type name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName source type name
inverse type name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName source vertex
inverse type name SimpleName MethodInvocation MethodInvocation SimpleName get id
graph helper SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName source vertex
get id from vertex SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName source vertex
inverse type name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName source vertex
edge and vertexright QualifiedName MethodInvocation MethodInvocation MethodInvocation SimpleName source vertex
get id SimpleName MethodInvocation MethodInvocation SimpleName source vertex
graph helper SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName source type name
get id from vertex SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName source type name
inverse type name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName source type name
edge and vertexright QualifiedName MethodInvocation MethodInvocation MethodInvocation SimpleName source type name
get id SimpleName MethodInvocation MethodInvocation SimpleName source type name
get id SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get id
source vertex SimpleName MethodInvocation SimpleName source type name
source vertex SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName graph helper
source vertex SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get id from vertex
source vertex SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName source type name
source vertex SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName source vertex
source vertex SimpleName MethodInvocation MethodInvocation SimpleName get id
source type name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName graph helper
source type name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get id from vertex
source type name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName source type name
source type name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName source vertex
source type name SimpleName MethodInvocation MethodInvocation SimpleName get id
private Modifier MethodDeclaration PrimitiveType void
private Modifier MethodDeclaration SimpleName remove reverse reference
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName edge and vertex
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName attribute info
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName attribute info
private Modifier MethodDeclaration SimpleType SimpleName atlas exception
void PrimitiveType MethodDeclaration SimpleName remove reverse reference
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName edge and vertex
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName attribute info
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName attribute info
void PrimitiveType MethodDeclaration SimpleType SimpleName atlas exception
void PrimitiveType MethodDeclaration Block EnhancedForStatement SimpleName inverse edges
remove reverse reference SimpleName MethodDeclaration SingleVariableDeclaration SimpleName edge and vertex
remove reverse reference SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName attribute info
remove reverse reference SimpleName MethodDeclaration SingleVariableDeclaration SimpleName attribute info
remove reverse reference SimpleName MethodDeclaration SimpleType SimpleName atlas exception
remove reverse reference SimpleName MethodDeclaration Block EnhancedForStatement SimpleName inverse edges
edge and vertex SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName attribute info
edge and vertex SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName atlas exception
attribute info SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName atlas exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName remove reverse reference
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName edge and vertex
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName attribute info
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName atlas exception
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName remove reverse reference
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName edge and vertex
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName attribute info
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName atlas exception
