client session SimpleName SimpleType SingleVariableDeclaration SimpleName session
string SimpleName SimpleType SingleVariableDeclaration SimpleName service
collection SimpleName SimpleType ParameterizedType WildcardType ?
collection SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName identities
? WildcardType ParameterizedType SingleVariableDeclaration SimpleName identities
session SimpleName FieldAccess Assignment SimpleName session
service SimpleName FieldAccess Assignment SimpleName service
list SimpleName SimpleType ParameterizedType SimpleType SimpleName public key identity
array list SimpleName SimpleType ParameterizedType SimpleType SimpleName public key identity
object SimpleName SimpleType SingleVariableDeclaration SimpleName o
o SimpleName InstanceofExpression SimpleType SimpleName key pair
session SimpleName MethodInvocation SimpleName get factory manager
key pair SimpleName SimpleType CastExpression SimpleName o
key pair identity SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName session
key pair identity SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get factory manager
key pair identity SimpleName SimpleType ClassInstanceCreation CastExpression SimpleName o
session SimpleName MethodInvocation ClassInstanceCreation CastExpression SimpleName o
get factory manager SimpleName MethodInvocation ClassInstanceCreation CastExpression SimpleName o
ids SimpleName MethodInvocation SimpleName add
ids SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName key pair identity
ids SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName session
ids SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get factory manager
ids SimpleName MethodInvocation ClassInstanceCreation CastExpression SimpleName o
add SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName key pair identity
add SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName session
add SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get factory manager
add SimpleName MethodInvocation ClassInstanceCreation CastExpression SimpleName o
object SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName identities
o SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName identities
session SimpleName MethodInvocation SimpleName get factory manager
manager SimpleName VariableDeclarationFragment MethodInvocation SimpleName session
manager SimpleName VariableDeclarationFragment MethodInvocation SimpleName get factory manager
factory manager SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName manager
manager SimpleName MethodInvocation SimpleName get agent factory
factory SimpleName VariableDeclarationFragment MethodInvocation SimpleName manager
factory SimpleName VariableDeclarationFragment MethodInvocation SimpleName get agent factory
ssh agent factory SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName factory
factory SimpleName MethodInvocation SimpleName create client
factory SimpleName MethodInvocation SimpleName manager
create client SimpleName MethodInvocation SimpleName manager
agent SimpleName FieldAccess Assignment MethodInvocation SimpleName factory
agent SimpleName FieldAccess Assignment MethodInvocation SimpleName create client
agent SimpleName FieldAccess Assignment MethodInvocation SimpleName manager
ssh agentpair QualifiedName SimpleType ParameterizedType SimpleType SimpleName public key
ssh agentpair QualifiedName SimpleType ParameterizedType SimpleType SimpleName string
public key SimpleName SimpleType ParameterizedType SimpleType SimpleName string
ssh agentpair QualifiedName SimpleType ParameterizedType SingleVariableDeclaration SimpleName pair
public key SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName pair
string SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName pair
agent SimpleName MethodInvocation SimpleName get identities
pair SimpleName MethodInvocation SimpleName get first
key agent identity SimpleName SimpleType ClassInstanceCreation SimpleName agent
key agent identity SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName pair
key agent identity SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get first
agent SimpleName ClassInstanceCreation MethodInvocation SimpleName pair
agent SimpleName ClassInstanceCreation MethodInvocation SimpleName get first
ids SimpleName MethodInvocation SimpleName add
ids SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName key agent identity
ids SimpleName MethodInvocation ClassInstanceCreation SimpleName agent
ids SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName pair
ids SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get first
add SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName key agent identity
add SimpleName MethodInvocation ClassInstanceCreation SimpleName agent
add SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName pair
add SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get first
pair SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName agent
pair SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName get identities
manager SimpleName MethodInvocation SimpleName get key pair provider
provider SimpleName VariableDeclarationFragment MethodInvocation SimpleName manager
provider SimpleName VariableDeclarationFragment MethodInvocation SimpleName get key pair provider
key pair provider SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName provider
key pair SimpleName SimpleType SingleVariableDeclaration SimpleName pair
provider SimpleName MethodInvocation SimpleName load keys
key pair identity SimpleName SimpleType ClassInstanceCreation SimpleName manager
key pair identity SimpleName SimpleType ClassInstanceCreation SimpleName pair
manager SimpleName ClassInstanceCreation SimpleName pair
ids SimpleName MethodInvocation SimpleName add
ids SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName key pair identity
ids SimpleName MethodInvocation ClassInstanceCreation SimpleName manager
ids SimpleName MethodInvocation ClassInstanceCreation SimpleName pair
add SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName key pair identity
add SimpleName MethodInvocation ClassInstanceCreation SimpleName manager
add SimpleName MethodInvocation ClassInstanceCreation SimpleName pair
pair SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName provider
pair SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName load keys
ids SimpleName MethodInvocation SimpleName iterator
keys SimpleName FieldAccess Assignment MethodInvocation SimpleName ids
keys SimpleName FieldAccess Assignment MethodInvocation SimpleName iterator
override SimpleName MarkerAnnotation MethodDeclaration Modifier public
override SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
override SimpleName MarkerAnnotation MethodDeclaration SimpleName init
override SimpleName MarkerAnnotation MethodDeclaration SingleVariableDeclaration SimpleName session
override SimpleName MarkerAnnotation MethodDeclaration SingleVariableDeclaration SimpleName service
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName init
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName client session
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName session
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName service
public Modifier MethodDeclaration SingleVariableDeclaration ParameterizedType WildcardType ?
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName identities
void PrimitiveType MethodDeclaration SimpleName init
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName client session
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName session
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName service
void PrimitiveType MethodDeclaration SingleVariableDeclaration ParameterizedType WildcardType ?
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName identities
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
init SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName client session
init SimpleName MethodDeclaration SingleVariableDeclaration SimpleName session
init SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
init SimpleName MethodDeclaration SingleVariableDeclaration SimpleName service
init SimpleName MethodDeclaration SingleVariableDeclaration ParameterizedType WildcardType ?
init SimpleName MethodDeclaration SingleVariableDeclaration SimpleName identities
init SimpleName MethodDeclaration SimpleType SimpleName exception
init SimpleName MethodDeclaration Block EnhancedForStatement SimpleName identities
session SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName service
session SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName identities
session SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
service SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName identities
service SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
identities SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName override
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName init
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName session
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName service
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName identities
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName override
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName init
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName session
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName service
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName identities
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
