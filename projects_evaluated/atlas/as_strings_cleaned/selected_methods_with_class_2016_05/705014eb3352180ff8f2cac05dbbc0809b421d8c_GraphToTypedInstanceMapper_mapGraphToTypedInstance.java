string SimpleName SimpleType SingleVariableDeclaration SimpleName guid
vertex SimpleName SimpleType SingleVariableDeclaration SimpleName instance vertex
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral mapping graph root vertex {} to typed instance for guid {}
log SimpleName MethodInvocation SimpleName instance vertex
log SimpleName MethodInvocation SimpleName guid
debug SimpleName MethodInvocation StringLiteral mapping graph root vertex {} to typed instance for guid {}
debug SimpleName MethodInvocation SimpleName instance vertex
debug SimpleName MethodInvocation SimpleName guid
mapping graph root vertex {} to typed instance for guid {} StringLiteral MethodInvocation SimpleName instance vertex
mapping graph root vertex {} to typed instance for guid {} StringLiteral MethodInvocation SimpleName guid
instance vertex SimpleName MethodInvocation SimpleName guid
instance vertex SimpleName MethodInvocation SimpleName get property
instance vertex SimpleName MethodInvocation QualifiedName constantsentity type property key
get property SimpleName MethodInvocation QualifiedName constantsentity type property key
type name SimpleName VariableDeclarationFragment MethodInvocation SimpleName instance vertex
type name SimpleName VariableDeclarationFragment MethodInvocation SimpleName get property
type name SimpleName VariableDeclarationFragment MethodInvocation QualifiedName constantsentity type property key
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName type name
list SimpleName SimpleType ParameterizedType SimpleType SimpleName string
graph helper SimpleName MethodInvocation SimpleName get trait names
graph helper SimpleName MethodInvocation SimpleName instance vertex
get trait names SimpleName MethodInvocation SimpleName instance vertex
traits SimpleName VariableDeclarationFragment MethodInvocation SimpleName graph helper
traits SimpleName VariableDeclarationFragment MethodInvocation SimpleName get trait names
traits SimpleName VariableDeclarationFragment MethodInvocation SimpleName instance vertex
graph helper SimpleName MethodInvocation SimpleName get state as string
graph helper SimpleName MethodInvocation SimpleName instance vertex
get state as string SimpleName MethodInvocation SimpleName instance vertex
state SimpleName VariableDeclarationFragment MethodInvocation SimpleName graph helper
state SimpleName VariableDeclarationFragment MethodInvocation SimpleName get state as string
state SimpleName VariableDeclarationFragment MethodInvocation SimpleName instance vertex
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName state
instance vertex SimpleName MethodInvocation SimpleType SimpleName integer
instance vertex SimpleName MethodInvocation SimpleName get property
instance vertex SimpleName MethodInvocation QualifiedName constantsversion property key
integer SimpleName SimpleType MethodInvocation SimpleName get property
integer SimpleName SimpleType MethodInvocation QualifiedName constantsversion property key
get property SimpleName MethodInvocation QualifiedName constantsversion property key
id SimpleName SimpleType ClassInstanceCreation SimpleName guid
id SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName instance vertex
id SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get property
id SimpleName SimpleType ClassInstanceCreation MethodInvocation QualifiedName constantsversion property key
id SimpleName SimpleType ClassInstanceCreation SimpleName type name
id SimpleName SimpleType ClassInstanceCreation SimpleName state
guid SimpleName ClassInstanceCreation MethodInvocation SimpleName instance vertex
guid SimpleName ClassInstanceCreation MethodInvocation SimpleType SimpleName integer
guid SimpleName ClassInstanceCreation MethodInvocation SimpleName get property
guid SimpleName ClassInstanceCreation MethodInvocation QualifiedName constantsversion property key
guid SimpleName ClassInstanceCreation SimpleName type name
guid SimpleName ClassInstanceCreation SimpleName state
instance vertex SimpleName MethodInvocation ClassInstanceCreation SimpleName type name
integer SimpleName SimpleType MethodInvocation ClassInstanceCreation SimpleName type name
get property SimpleName MethodInvocation ClassInstanceCreation SimpleName type name
constantsversion property key QualifiedName MethodInvocation ClassInstanceCreation SimpleName type name
instance vertex SimpleName MethodInvocation ClassInstanceCreation SimpleName state
integer SimpleName SimpleType MethodInvocation ClassInstanceCreation SimpleName state
get property SimpleName MethodInvocation ClassInstanceCreation SimpleName state
constantsversion property key QualifiedName MethodInvocation ClassInstanceCreation SimpleName state
type name SimpleName ClassInstanceCreation SimpleName state
id SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName id
id SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName guid
id SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName instance vertex
id SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName get property
id SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation QualifiedName constantsversion property key
id SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName type name
id SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName state
id SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName id
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral created id {} for instance type {}
log SimpleName MethodInvocation SimpleName id
log SimpleName MethodInvocation SimpleName type name
debug SimpleName MethodInvocation StringLiteral created id {} for instance type {}
debug SimpleName MethodInvocation SimpleName id
debug SimpleName MethodInvocation SimpleName type name
created id {} for instance type {} StringLiteral MethodInvocation SimpleName id
created id {} for instance type {} StringLiteral MethodInvocation SimpleName type name
id SimpleName MethodInvocation SimpleName type name
type system SimpleName MethodInvocation SimpleName get data type
type system SimpleName MethodInvocation TypeLiteral SimpleType SimpleName class type
type system SimpleName MethodInvocation SimpleName type name
get data type SimpleName MethodInvocation TypeLiteral SimpleType SimpleName class type
get data type SimpleName MethodInvocation SimpleName type name
class type SimpleName SimpleType TypeLiteral MethodInvocation SimpleName type name
class type SimpleName VariableDeclarationFragment MethodInvocation SimpleName type system
class type SimpleName VariableDeclarationFragment MethodInvocation SimpleName get data type
class type SimpleName VariableDeclarationFragment MethodInvocation SimpleName type name
class type SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName class type
traits SimpleName MethodInvocation SimpleName size
traits SimpleName MethodInvocation SimpleName to array
traits SimpleName MethodInvocation ArrayCreation MethodInvocation SimpleName traits
traits SimpleName MethodInvocation ArrayCreation MethodInvocation SimpleName size
to array SimpleName MethodInvocation ArrayCreation MethodInvocation SimpleName traits
to array SimpleName MethodInvocation ArrayCreation MethodInvocation SimpleName size
class type SimpleName MethodInvocation SimpleName create instance
class type SimpleName MethodInvocation SimpleName id
class type SimpleName MethodInvocation MethodInvocation SimpleName traits
class type SimpleName MethodInvocation MethodInvocation SimpleName to array
create instance SimpleName MethodInvocation SimpleName id
create instance SimpleName MethodInvocation MethodInvocation SimpleName traits
create instance SimpleName MethodInvocation MethodInvocation SimpleName to array
id SimpleName MethodInvocation MethodInvocation SimpleName traits
id SimpleName MethodInvocation MethodInvocation SimpleName to array
typed instance SimpleName VariableDeclarationFragment MethodInvocation SimpleName class type
typed instance SimpleName VariableDeclarationFragment MethodInvocation SimpleName create instance
typed instance SimpleName VariableDeclarationFragment MethodInvocation SimpleName id
typed instance SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName traits
typed instance SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName to array
i typed referenceable instance SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName typed instance
class type SimpleName MethodInvocation SimpleName field mapping
class type SimpleName MethodInvocation FieldAccess SimpleName fields
field mapping SimpleName MethodInvocation FieldAccess SimpleName fields
map vertex to instance SimpleName MethodInvocation SimpleName instance vertex
map vertex to instance SimpleName MethodInvocation SimpleName typed instance
map vertex to instance SimpleName MethodInvocation FieldAccess MethodInvocation SimpleName class type
map vertex to instance SimpleName MethodInvocation FieldAccess MethodInvocation SimpleName field mapping
map vertex to instance SimpleName MethodInvocation FieldAccess SimpleName fields
instance vertex SimpleName MethodInvocation SimpleName typed instance
instance vertex SimpleName MethodInvocation FieldAccess MethodInvocation SimpleName class type
instance vertex SimpleName MethodInvocation FieldAccess MethodInvocation SimpleName field mapping
instance vertex SimpleName MethodInvocation FieldAccess SimpleName fields
typed instance SimpleName MethodInvocation FieldAccess MethodInvocation SimpleName class type
typed instance SimpleName MethodInvocation FieldAccess MethodInvocation SimpleName field mapping
typed instance SimpleName MethodInvocation FieldAccess SimpleName fields
map vertex to instance traits SimpleName MethodInvocation SimpleName instance vertex
map vertex to instance traits SimpleName MethodInvocation SimpleName typed instance
map vertex to instance traits SimpleName MethodInvocation SimpleName traits
instance vertex SimpleName MethodInvocation SimpleName typed instance
instance vertex SimpleName MethodInvocation SimpleName traits
typed instance SimpleName MethodInvocation SimpleName traits
public Modifier MethodDeclaration SimpleType SimpleName i typed referenceable instance
public Modifier MethodDeclaration SimpleName map graph to typed instance
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName guid
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName vertex
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName instance vertex
public Modifier MethodDeclaration SimpleType SimpleName atlas exception
i typed referenceable instance SimpleName SimpleType MethodDeclaration SimpleName map graph to typed instance
i typed referenceable instance SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName guid
i typed referenceable instance SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName instance vertex
i typed referenceable instance SimpleName SimpleType MethodDeclaration SimpleType SimpleName atlas exception
map graph to typed instance SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
map graph to typed instance SimpleName MethodDeclaration SingleVariableDeclaration SimpleName guid
map graph to typed instance SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName vertex
map graph to typed instance SimpleName MethodDeclaration SingleVariableDeclaration SimpleName instance vertex
map graph to typed instance SimpleName MethodDeclaration SimpleType SimpleName atlas exception
map graph to typed instance SimpleName MethodDeclaration Block ReturnStatement SimpleName typed instance
guid SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName instance vertex
guid SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName atlas exception
instance vertex SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName atlas exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName i typed referenceable instance
public Modifier TypeDeclaration MethodDeclaration SimpleName map graph to typed instance
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName guid
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName instance vertex
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName atlas exception
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName i typed referenceable instance
test SimpleName TypeDeclaration MethodDeclaration SimpleName map graph to typed instance
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName guid
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName instance vertex
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName atlas exception
