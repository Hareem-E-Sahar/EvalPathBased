entry SimpleName SimpleType ParameterizedType SimpleType SimpleName key
entry SimpleName SimpleType ParameterizedType SimpleType SimpleName value
key SimpleName SimpleType ParameterizedType SimpleType SimpleName value
state SimpleName SimpleType SingleVariableDeclaration SimpleName state
string SimpleName SimpleType SingleVariableDeclaration SimpleName data table name
random SimpleName SimpleType SingleVariableDeclaration SimpleName rand
state SimpleName MethodInvocation SimpleName get connector
state SimpleName MethodInvocation MethodInvocation SimpleName create scanner
get connector SimpleName MethodInvocation MethodInvocation SimpleName create scanner
state SimpleName MethodInvocation MethodInvocation SimpleName data table name
get connector SimpleName MethodInvocation MethodInvocation SimpleName data table name
state SimpleName MethodInvocation MethodInvocation QualifiedName authorizationsempty
get connector SimpleName MethodInvocation MethodInvocation QualifiedName authorizationsempty
create scanner SimpleName MethodInvocation SimpleName data table name
create scanner SimpleName MethodInvocation QualifiedName authorizationsempty
data table name SimpleName MethodInvocation QualifiedName authorizationsempty
scanner SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName state
scanner SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get connector
scanner SimpleName VariableDeclarationFragment MethodInvocation SimpleName create scanner
scanner SimpleName VariableDeclarationFragment MethodInvocation SimpleName data table name
scanner SimpleName VariableDeclarationFragment MethodInvocation QualifiedName authorizationsempty
scanner SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName scanner
scanner SimpleName MethodInvocation SimpleName set batch size
scanner SimpleName MethodInvocation NumberLiteral empty
set batch size SimpleName MethodInvocation NumberLiteral empty
rand SimpleName MethodInvocation SimpleName next int
rand SimpleName MethodInvocation NumberLiteral xfffffff
next int SimpleName MethodInvocation NumberLiteral xfffffff
integer SimpleName MethodInvocation SimpleName to string
integer SimpleName MethodInvocation MethodInvocation SimpleName rand
integer SimpleName MethodInvocation MethodInvocation SimpleName next int
integer SimpleName MethodInvocation MethodInvocation NumberLiteral xfffffff
integer SimpleName MethodInvocation NumberLiteral empty
to string SimpleName MethodInvocation MethodInvocation SimpleName rand
to string SimpleName MethodInvocation MethodInvocation SimpleName next int
to string SimpleName MethodInvocation MethodInvocation NumberLiteral xfffffff
to string SimpleName MethodInvocation NumberLiteral empty
rand SimpleName MethodInvocation MethodInvocation NumberLiteral empty
next int SimpleName MethodInvocation MethodInvocation NumberLiteral empty
xfffffff NumberLiteral MethodInvocation MethodInvocation NumberLiteral empty
range SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName integer
range SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName to string
range SimpleName SimpleType ClassInstanceCreation MethodInvocation NumberLiteral empty
scanner SimpleName MethodInvocation SimpleName set range
scanner SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName range
scanner SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName integer
scanner SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName to string
scanner SimpleName MethodInvocation ClassInstanceCreation MethodInvocation NumberLiteral empty
set range SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName range
set range SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName integer
set range SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName to string
set range SimpleName MethodInvocation ClassInstanceCreation MethodInvocation NumberLiteral empty
entry SimpleName SimpleType ParameterizedType SimpleType SimpleName key
entry SimpleName SimpleType ParameterizedType SimpleType SimpleName value
key SimpleName SimpleType ParameterizedType SimpleType SimpleName value
scanner SimpleName MethodInvocation SimpleName iterator
iter SimpleName VariableDeclarationFragment MethodInvocation SimpleName scanner
iter SimpleName VariableDeclarationFragment MethodInvocation SimpleName iterator
iter SimpleName MethodInvocation SimpleName has next
iter SimpleName MethodInvocation SimpleName next
static Modifier MethodDeclaration ParameterizedType SimpleType SimpleName entry
static Modifier MethodDeclaration ParameterizedType SimpleType SimpleName key
static Modifier MethodDeclaration ParameterizedType SimpleType SimpleName value
static Modifier MethodDeclaration SimpleName find random document
static Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName state
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName state
static Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName data table name
static Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName random
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName rand
entry SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName find random document
key SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName find random document
value SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName find random document
find random document SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName state
find random document SimpleName MethodDeclaration SingleVariableDeclaration SimpleName state
find random document SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
find random document SimpleName MethodDeclaration SingleVariableDeclaration SimpleName data table name
find random document SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName random
find random document SimpleName MethodDeclaration SingleVariableDeclaration SimpleName rand
find random document SimpleName MethodDeclaration SimpleType SimpleName exception
state SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName data table name
state SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName rand
state SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
data table name SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName rand
data table name SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
rand SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier static
public Modifier TypeDeclaration MethodDeclaration SimpleName find random document
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName state
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName data table name
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName rand
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration Modifier static
test SimpleName TypeDeclaration MethodDeclaration SimpleName find random document
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName state
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName data table name
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName rand
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception