string SimpleName SimpleType SingleVariableDeclaration SimpleName edge id
i data type SimpleName SimpleType ParameterizedType WildcardType ?
i data type SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName referred type
? WildcardType ParameterizedType SingleVariableDeclaration SimpleName referred type
titan graph SimpleName MethodInvocation SimpleName get edge
titan graph SimpleName MethodInvocation SimpleName edge id
get edge SimpleName MethodInvocation SimpleName edge id
edge SimpleName VariableDeclarationFragment MethodInvocation SimpleName titan graph
edge SimpleName VariableDeclarationFragment MethodInvocation SimpleName get edge
edge SimpleName VariableDeclarationFragment MethodInvocation SimpleName edge id
final Modifier VariableDeclarationStatement SimpleType SimpleName edge
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName edge
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName titan graph
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get edge
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName edge id
edge SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName edge
edge SimpleName MethodInvocation SimpleName get vertex
edge SimpleName MethodInvocation QualifiedName directionin
get vertex SimpleName MethodInvocation QualifiedName directionin
referred vertex SimpleName VariableDeclarationFragment MethodInvocation SimpleName edge
referred vertex SimpleName VariableDeclarationFragment MethodInvocation SimpleName get vertex
referred vertex SimpleName VariableDeclarationFragment MethodInvocation QualifiedName directionin
final Modifier VariableDeclarationStatement SimpleType SimpleName vertex
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName referred vertex
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName edge
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get vertex
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation QualifiedName directionin
vertex SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName referred vertex
referred type SimpleName MethodInvocation SimpleName get type category
referred type SimpleName MethodInvocation SimpleName get name
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral found struct instance vertex {} mapping to instance {}
log SimpleName MethodInvocation SimpleName referred vertex
log SimpleName MethodInvocation MethodInvocation SimpleName referred type
log SimpleName MethodInvocation MethodInvocation SimpleName get name
debug SimpleName MethodInvocation StringLiteral found struct instance vertex {} mapping to instance {}
debug SimpleName MethodInvocation SimpleName referred vertex
debug SimpleName MethodInvocation MethodInvocation SimpleName referred type
debug SimpleName MethodInvocation MethodInvocation SimpleName get name
found struct instance vertex {} mapping to instance {} StringLiteral MethodInvocation SimpleName referred vertex
found struct instance vertex {} mapping to instance {} StringLiteral MethodInvocation MethodInvocation SimpleName referred type
found struct instance vertex {} mapping to instance {} StringLiteral MethodInvocation MethodInvocation SimpleName get name
referred vertex SimpleName MethodInvocation MethodInvocation SimpleName referred type
referred vertex SimpleName MethodInvocation MethodInvocation SimpleName get name
struct type SimpleName SimpleType CastExpression SimpleName referred type
struct type SimpleName VariableDeclarationFragment CastExpression SimpleType SimpleName struct type
struct type SimpleName VariableDeclarationFragment CastExpression SimpleName referred type
struct type SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName struct type
struct type SimpleName MethodInvocation SimpleName create instance
instance SimpleName VariableDeclarationFragment MethodInvocation SimpleName struct type
instance SimpleName VariableDeclarationFragment MethodInvocation SimpleName create instance
i typed struct SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName instance
map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
map SimpleName SimpleType ParameterizedType SimpleType SimpleName attribute info
string SimpleName SimpleType ParameterizedType SimpleType SimpleName attribute info
struct type SimpleName MethodInvocation SimpleName field mapping
struct type SimpleName MethodInvocation FieldAccess SimpleName fields
field mapping SimpleName MethodInvocation FieldAccess SimpleName fields
fields SimpleName VariableDeclarationFragment FieldAccess MethodInvocation SimpleName struct type
fields SimpleName VariableDeclarationFragment FieldAccess MethodInvocation SimpleName field mapping
fields SimpleName VariableDeclarationFragment FieldAccess SimpleName fields
map vertex to instance SimpleName MethodInvocation SimpleName referred vertex
map vertex to instance SimpleName MethodInvocation SimpleName instance
map vertex to instance SimpleName MethodInvocation SimpleName fields
referred vertex SimpleName MethodInvocation SimpleName instance
referred vertex SimpleName MethodInvocation SimpleName fields
instance SimpleName MethodInvocation SimpleName fields
referred vertex SimpleName MethodInvocation SimpleName get property
referred vertex SimpleName MethodInvocation QualifiedName constantsguid property key
get property SimpleName MethodInvocation QualifiedName constantsguid property key
guid SimpleName VariableDeclarationFragment MethodInvocation SimpleName referred vertex
guid SimpleName VariableDeclarationFragment MethodInvocation SimpleName get property
guid SimpleName VariableDeclarationFragment MethodInvocation QualifiedName constantsguid property key
final Modifier VariableDeclarationStatement SimpleType SimpleName string
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName guid
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName referred vertex
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get property
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation QualifiedName constantsguid property key
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName guid
referred vertex SimpleName MethodInvocation SimpleType SimpleName integer
referred vertex SimpleName MethodInvocation SimpleName get property
referred vertex SimpleName MethodInvocation QualifiedName constantsversion property key
integer SimpleName SimpleType MethodInvocation SimpleName get property
integer SimpleName SimpleType MethodInvocation QualifiedName constantsversion property key
get property SimpleName MethodInvocation QualifiedName constantsversion property key
referred type SimpleName MethodInvocation SimpleName get name
id SimpleName SimpleType ClassInstanceCreation SimpleName guid
id SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName referred vertex
id SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get property
id SimpleName SimpleType ClassInstanceCreation MethodInvocation QualifiedName constantsversion property key
id SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName referred type
id SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get name
guid SimpleName ClassInstanceCreation MethodInvocation SimpleName referred vertex
guid SimpleName ClassInstanceCreation MethodInvocation SimpleType SimpleName integer
guid SimpleName ClassInstanceCreation MethodInvocation SimpleName get property
guid SimpleName ClassInstanceCreation MethodInvocation QualifiedName constantsversion property key
guid SimpleName ClassInstanceCreation MethodInvocation SimpleName referred type
guid SimpleName ClassInstanceCreation MethodInvocation SimpleName get name
referred vertex SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName referred type
referred vertex SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get name
get property SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName referred type
get property SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get name
constantsversion property key QualifiedName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName referred type
constantsversion property key QualifiedName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get name
reference id SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName id
reference id SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName guid
reference id SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName referred vertex
reference id SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName get property
reference id SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation QualifiedName constantsversion property key
reference id SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName referred type
reference id SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName get name
id SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName reference id
referred type SimpleName MethodInvocation SimpleName get type category
loading StringLiteral InfixExpression MethodInvocation SimpleName referred type
loading StringLiteral InfixExpression MethodInvocation SimpleName get type category
loading StringLiteral InfixExpression StringLiteral is not supported
referred type SimpleName MethodInvocation InfixExpression StringLiteral is not supported
get type category SimpleName MethodInvocation InfixExpression StringLiteral is not supported
unsupported operation exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral loading
unsupported operation exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral is not supported
referred type SimpleName MethodInvocation SwitchStatement SwitchCase SimpleName struct
get type category SimpleName MethodInvocation SwitchStatement SwitchCase SimpleName struct
instance SimpleName ReturnStatement SwitchStatement SwitchCase SimpleName class
instance SimpleName ReturnStatement SwitchStatement VariableDeclarationStatement Modifier final
instance SimpleName ReturnStatement SwitchStatement ReturnStatement SimpleName reference id
class SimpleName SwitchCase SwitchStatement VariableDeclarationStatement Modifier final
class SimpleName SwitchCase SwitchStatement ReturnStatement SimpleName reference id
final Modifier VariableDeclarationStatement SwitchStatement ReturnStatement SimpleName reference id
public Modifier MethodDeclaration SimpleType SimpleName i typed instance
public Modifier MethodDeclaration SimpleName get referred entity
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName edge id
public Modifier MethodDeclaration SingleVariableDeclaration ParameterizedType WildcardType ?
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName referred type
public Modifier MethodDeclaration SimpleType SimpleName atlas exception
i typed instance SimpleName SimpleType MethodDeclaration SimpleName get referred entity
i typed instance SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName edge id
i typed instance SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName referred type
i typed instance SimpleName SimpleType MethodDeclaration SimpleType SimpleName atlas exception
get referred entity SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
get referred entity SimpleName MethodDeclaration SingleVariableDeclaration SimpleName edge id
get referred entity SimpleName MethodDeclaration SingleVariableDeclaration ParameterizedType WildcardType ?
get referred entity SimpleName MethodDeclaration SingleVariableDeclaration SimpleName referred type
get referred entity SimpleName MethodDeclaration SimpleType SimpleName atlas exception
get referred entity SimpleName MethodDeclaration Block VariableDeclarationStatement Modifier final
edge id SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName referred type
edge id SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName atlas exception
referred type SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName atlas exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName i typed instance
public Modifier TypeDeclaration MethodDeclaration SimpleName get referred entity
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName edge id
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName referred type
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName atlas exception
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName i typed instance
test SimpleName TypeDeclaration MethodDeclaration SimpleName get referred entity
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName edge id
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName referred type
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName atlas exception