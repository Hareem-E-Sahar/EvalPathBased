resource definition SimpleName SimpleType SingleVariableDeclaration SimpleName resource definition
resource definition SimpleName MethodInvocation SimpleName get type
resource type SimpleName VariableDeclarationFragment MethodInvocation SimpleName resource definition
resource type SimpleName VariableDeclarationFragment MethodInvocation SimpleName get type
resourcetype QualifiedName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName resource type
map SimpleName SimpleType ParameterizedType SimpleType QualifiedName resourcetype
map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
resourcetype QualifiedName SimpleType ParameterizedType SimpleType SimpleName string
resource definition SimpleName MethodInvocation SimpleName get resource ids
map resource ids SimpleName VariableDeclarationFragment MethodInvocation SimpleName resource definition
map resource ids SimpleName VariableDeclarationFragment MethodInvocation SimpleName get resource ids
get cluster controller SimpleName MethodInvocation MethodInvocation SimpleName get schema
get cluster controller SimpleName MethodInvocation MethodInvocation SimpleName resource type
get schema SimpleName MethodInvocation SimpleName resource type
schema SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get cluster controller
schema SimpleName VariableDeclarationFragment MethodInvocation SimpleName get schema
schema SimpleName VariableDeclarationFragment MethodInvocation SimpleName resource type
schema SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName schema
set SimpleName SimpleType ParameterizedType SimpleType SimpleName predicate
hash set SimpleName SimpleType ParameterizedType SimpleType SimpleName predicate
mapentry QualifiedName SimpleType ParameterizedType SimpleType QualifiedName resourcetype
mapentry QualifiedName SimpleType ParameterizedType SimpleType SimpleName string
resourcetype QualifiedName SimpleType ParameterizedType SimpleType SimpleName string
mapentry QualifiedName SimpleType ParameterizedType SingleVariableDeclaration SimpleName entry
resourcetype QualifiedName SimpleType ParameterizedType SingleVariableDeclaration SimpleName entry
string SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName entry
map resource ids SimpleName MethodInvocation SimpleName entry set
entry SimpleName MethodInvocation SimpleName get value
entry SimpleName MethodInvocation SimpleName get key
schema SimpleName MethodInvocation SimpleName get key property id
schema SimpleName MethodInvocation MethodInvocation SimpleName entry
schema SimpleName MethodInvocation MethodInvocation SimpleName get key
get key property id SimpleName MethodInvocation MethodInvocation SimpleName entry
get key property id SimpleName MethodInvocation MethodInvocation SimpleName get key
entry SimpleName MethodInvocation SimpleName get value
equals predicate SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName schema
equals predicate SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get key property id
equals predicate SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName entry
equals predicate SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get value
schema SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName entry
schema SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get value
get key property id SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName entry
get key property id SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get value
set predicates SimpleName MethodInvocation SimpleName add
set predicates SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName equals predicate
set predicates SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName schema
set predicates SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get key property id
set predicates SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName entry
set predicates SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get value
add SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName equals predicate
add SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName schema
add SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get key property id
add SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName entry
add SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get value
entry SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName map resource ids
entry SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName entry set
set predicates SimpleName MethodInvocation SimpleName size
set predicates SimpleName MethodInvocation InfixExpression NumberLiteral empty
size SimpleName MethodInvocation InfixExpression NumberLiteral empty
set predicates SimpleName MethodInvocation SimpleName iterator
set predicates SimpleName MethodInvocation MethodInvocation SimpleName next
iterator SimpleName MethodInvocation MethodInvocation SimpleName next
set predicates SimpleName MethodInvocation SimpleName size
set predicates SimpleName MethodInvocation InfixExpression NumberLiteral empty
size SimpleName MethodInvocation InfixExpression NumberLiteral empty
set predicates SimpleName MethodInvocation SimpleName size
set predicates SimpleName MethodInvocation SimpleName to array
set predicates SimpleName MethodInvocation ArrayCreation MethodInvocation SimpleName set predicates
set predicates SimpleName MethodInvocation ArrayCreation MethodInvocation SimpleName size
to array SimpleName MethodInvocation ArrayCreation MethodInvocation SimpleName set predicates
to array SimpleName MethodInvocation ArrayCreation MethodInvocation SimpleName size
and predicate SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName set predicates
and predicate SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName to array
private Modifier MethodDeclaration SimpleType SimpleName predicate
private Modifier MethodDeclaration SimpleName create predicate
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName resource definition
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName resource definition
predicate SimpleName SimpleType MethodDeclaration SimpleName create predicate
predicate SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName resource definition
create predicate SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName resource definition
create predicate SimpleName MethodDeclaration SingleVariableDeclaration SimpleName resource definition
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName predicate
public Modifier TypeDeclaration MethodDeclaration SimpleName create predicate
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName resource definition
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName predicate
test SimpleName TypeDeclaration MethodDeclaration SimpleName create predicate
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName resource definition
