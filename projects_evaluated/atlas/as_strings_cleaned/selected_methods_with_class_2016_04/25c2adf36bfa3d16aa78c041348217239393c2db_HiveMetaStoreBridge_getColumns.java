list SimpleName SimpleType ParameterizedType SimpleType SimpleName referenceable
list SimpleName SimpleType ParameterizedType SimpleType SimpleName field schema
list SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName schema list
field schema SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName schema list
string SimpleName SimpleType SingleVariableDeclaration SimpleName table qualified name
id SimpleName SimpleType SingleVariableDeclaration SimpleName table reference
list SimpleName SimpleType ParameterizedType SimpleType SimpleName referenceable
field schema SimpleName SimpleType SingleVariableDeclaration SimpleName fs
processing field StringLiteral InfixExpression SimpleName fs
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation InfixExpression StringLiteral processing field
log SimpleName MethodInvocation InfixExpression SimpleName fs
debug SimpleName MethodInvocation InfixExpression StringLiteral processing field
debug SimpleName MethodInvocation InfixExpression SimpleName fs
hive data typeshive column QualifiedName MethodInvocation SimpleName get name
referenceable SimpleName SimpleType ClassInstanceCreation MethodInvocation QualifiedName hive data typeshive column
referenceable SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get name
col referenceable SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName referenceable
col referenceable SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation QualifiedName hive data typeshive column
col referenceable SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName get name
referenceable SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName col referenceable
fs SimpleName MethodInvocation SimpleName get name
get column qualified name SimpleName MethodInvocation SimpleName table qualified name
get column qualified name SimpleName MethodInvocation MethodInvocation SimpleName fs
get column qualified name SimpleName MethodInvocation MethodInvocation SimpleName get name
table qualified name SimpleName MethodInvocation MethodInvocation SimpleName fs
table qualified name SimpleName MethodInvocation MethodInvocation SimpleName get name
col referenceable SimpleName MethodInvocation SimpleName set
col referenceable SimpleName MethodInvocation QualifiedName atlas clientreferenceable attribute name
col referenceable SimpleName MethodInvocation MethodInvocation SimpleName get column qualified name
col referenceable SimpleName MethodInvocation MethodInvocation SimpleName table qualified name
col referenceable SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName fs
col referenceable SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get name
set SimpleName MethodInvocation QualifiedName atlas clientreferenceable attribute name
set SimpleName MethodInvocation MethodInvocation SimpleName get column qualified name
set SimpleName MethodInvocation MethodInvocation SimpleName table qualified name
set SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName fs
set SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get name
atlas clientreferenceable attribute name QualifiedName MethodInvocation MethodInvocation SimpleName get column qualified name
atlas clientreferenceable attribute name QualifiedName MethodInvocation MethodInvocation SimpleName table qualified name
atlas clientreferenceable attribute name QualifiedName MethodInvocation MethodInvocation MethodInvocation SimpleName fs
atlas clientreferenceable attribute name QualifiedName MethodInvocation MethodInvocation MethodInvocation SimpleName get name
fs SimpleName MethodInvocation SimpleName get name
col referenceable SimpleName MethodInvocation SimpleName set
col referenceable SimpleName MethodInvocation QualifiedName hive data model generatorname
col referenceable SimpleName MethodInvocation MethodInvocation SimpleName fs
col referenceable SimpleName MethodInvocation MethodInvocation SimpleName get name
set SimpleName MethodInvocation QualifiedName hive data model generatorname
set SimpleName MethodInvocation MethodInvocation SimpleName fs
set SimpleName MethodInvocation MethodInvocation SimpleName get name
hive data model generatorname QualifiedName MethodInvocation MethodInvocation SimpleName fs
hive data model generatorname QualifiedName MethodInvocation MethodInvocation SimpleName get name
fs SimpleName MethodInvocation SimpleName get type
col referenceable SimpleName MethodInvocation SimpleName set
col referenceable SimpleName MethodInvocation StringLiteral type
col referenceable SimpleName MethodInvocation MethodInvocation SimpleName fs
col referenceable SimpleName MethodInvocation MethodInvocation SimpleName get type
set SimpleName MethodInvocation StringLiteral type
set SimpleName MethodInvocation MethodInvocation SimpleName fs
set SimpleName MethodInvocation MethodInvocation SimpleName get type
type StringLiteral MethodInvocation MethodInvocation SimpleName fs
type StringLiteral MethodInvocation MethodInvocation SimpleName get type
fs SimpleName MethodInvocation SimpleName get comment
col referenceable SimpleName MethodInvocation SimpleName set
col referenceable SimpleName MethodInvocation QualifiedName hive data model generatorcomment
col referenceable SimpleName MethodInvocation MethodInvocation SimpleName fs
col referenceable SimpleName MethodInvocation MethodInvocation SimpleName get comment
set SimpleName MethodInvocation QualifiedName hive data model generatorcomment
set SimpleName MethodInvocation MethodInvocation SimpleName fs
set SimpleName MethodInvocation MethodInvocation SimpleName get comment
hive data model generatorcomment QualifiedName MethodInvocation MethodInvocation SimpleName fs
hive data model generatorcomment QualifiedName MethodInvocation MethodInvocation SimpleName get comment
col referenceable SimpleName MethodInvocation SimpleName set
col referenceable SimpleName MethodInvocation QualifiedName hive data model generatortable
col referenceable SimpleName MethodInvocation SimpleName table reference
set SimpleName MethodInvocation QualifiedName hive data model generatortable
set SimpleName MethodInvocation SimpleName table reference
hive data model generatortable QualifiedName MethodInvocation SimpleName table reference
col list SimpleName MethodInvocation SimpleName add
col list SimpleName MethodInvocation SimpleName col referenceable
add SimpleName MethodInvocation SimpleName col referenceable
field schema SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName schema list
fs SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName schema list
schema list SimpleName EnhancedForStatement Block ReturnStatement SimpleName col list
public Modifier MethodDeclaration ParameterizedType SimpleType SimpleName list
public Modifier MethodDeclaration ParameterizedType SimpleType SimpleName referenceable
public Modifier MethodDeclaration SimpleName get columns
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName schema list
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName table qualified name
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName id
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName table reference
list SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName get columns
referenceable SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName get columns
get columns SimpleName MethodDeclaration SingleVariableDeclaration SimpleName schema list
get columns SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
get columns SimpleName MethodDeclaration SingleVariableDeclaration SimpleName table qualified name
get columns SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName id
get columns SimpleName MethodDeclaration SingleVariableDeclaration SimpleName table reference
get columns SimpleName MethodDeclaration SimpleType SimpleName exception
get columns SimpleName MethodDeclaration Block EnhancedForStatement SimpleName schema list
get columns SimpleName MethodDeclaration Block ReturnStatement SimpleName col list
schema list SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName table qualified name
schema list SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName table reference
schema list SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
table qualified name SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName table reference
table qualified name SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
table reference SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration SimpleName get columns
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName schema list
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName table qualified name
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName table reference
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration SimpleName get columns
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName schema list
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName table qualified name
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName table reference
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
