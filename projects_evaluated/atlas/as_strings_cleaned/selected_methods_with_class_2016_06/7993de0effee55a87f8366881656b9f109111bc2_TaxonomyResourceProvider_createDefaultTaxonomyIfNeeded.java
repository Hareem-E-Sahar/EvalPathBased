log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation StringLiteral checking if default taxonomy needs to be created
info SimpleName MethodInvocation StringLiteral checking if default taxonomy needs to be created
do get resources SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName collection request
do get resources SimpleName MethodInvocation MethodInvocation SimpleName get property maps
do get resources SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName is empty
get property maps SimpleName MethodInvocation MethodInvocation SimpleName is empty
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation StringLiteral no taxonomies found - going to create default taxonomy
info SimpleName MethodInvocation StringLiteral no taxonomies found - going to create default taxonomy
map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
map SimpleName SimpleType ParameterizedType SimpleType SimpleName object
string SimpleName SimpleType ParameterizedType SimpleType SimpleName object
default taxonomy name SimpleName VariableDeclarationFragment SimpleName default taxonomy name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName default taxonomy name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName default taxonomy name
application properties SimpleName MethodInvocation SimpleName get
configuration SimpleName VariableDeclarationFragment MethodInvocation SimpleName application properties
configuration SimpleName VariableDeclarationFragment MethodInvocation SimpleName get
configuration SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName configuration
configuration SimpleName MethodInvocation SimpleName get string
configuration SimpleName MethodInvocation StringLiteral atlastaxonomydefaultname
configuration SimpleName MethodInvocation SimpleName default taxonomy name
get string SimpleName MethodInvocation StringLiteral atlastaxonomydefaultname
get string SimpleName MethodInvocation SimpleName default taxonomy name
atlastaxonomydefaultname StringLiteral MethodInvocation SimpleName default taxonomy name
default taxonomy name SimpleName Assignment MethodInvocation SimpleName configuration
default taxonomy name SimpleName Assignment MethodInvocation SimpleName get string
default taxonomy name SimpleName Assignment MethodInvocation StringLiteral atlastaxonomydefaultname
default taxonomy name SimpleName Assignment MethodInvocation SimpleName default taxonomy name
atlas exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
log SimpleName MethodInvocation SimpleName warn
log SimpleName MethodInvocation StringLiteral unable to read atlas configuration will use {} as default taxonomy name
log SimpleName MethodInvocation SimpleName default taxonomy name
log SimpleName MethodInvocation SimpleName e
warn SimpleName MethodInvocation StringLiteral unable to read atlas configuration will use {} as default taxonomy name
warn SimpleName MethodInvocation SimpleName default taxonomy name
warn SimpleName MethodInvocation SimpleName e
unable to read atlas configuration will use {} as default taxonomy name StringLiteral MethodInvocation SimpleName default taxonomy name
unable to read atlas configuration will use {} as default taxonomy name StringLiteral MethodInvocation SimpleName e
default taxonomy name SimpleName MethodInvocation SimpleName e
request properties SimpleName MethodInvocation SimpleName put
request properties SimpleName MethodInvocation StringLiteral name
request properties SimpleName MethodInvocation SimpleName default taxonomy name
put SimpleName MethodInvocation StringLiteral name
put SimpleName MethodInvocation SimpleName default taxonomy name
name StringLiteral MethodInvocation SimpleName default taxonomy name
request properties SimpleName MethodInvocation SimpleName put
request properties SimpleName MethodInvocation StringLiteral description
request properties SimpleName MethodInvocation SimpleName default taxonomy description
put SimpleName MethodInvocation StringLiteral description
put SimpleName MethodInvocation SimpleName default taxonomy description
description StringLiteral MethodInvocation SimpleName default taxonomy description
instance request SimpleName SimpleType ClassInstanceCreation SimpleName request properties
do create resource SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName instance request
do create resource SimpleName MethodInvocation ClassInstanceCreation SimpleName request properties
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation StringLiteral successfully created default taxonomy {}.
log SimpleName MethodInvocation SimpleName default taxonomy name
info SimpleName MethodInvocation StringLiteral successfully created default taxonomy {}.
info SimpleName MethodInvocation SimpleName default taxonomy name
successfully created default taxonomy {}. StringLiteral MethodInvocation SimpleName default taxonomy name
taxonomy auto initialization checked SimpleName Assignment BooleanLiteral true
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation StringLiteral some taxonomy exists not creating default taxonomy
info SimpleName MethodInvocation StringLiteral some taxonomy exists not creating default taxonomy
invalid query exception SimpleName SimpleType UnionType SimpleType SimpleName resource not found exception
invalid query exception SimpleName SimpleType UnionType SingleVariableDeclaration SimpleName e
resource not found exception SimpleName SimpleType UnionType SingleVariableDeclaration SimpleName e
log SimpleName MethodInvocation SimpleName error
log SimpleName MethodInvocation StringLiteral unable to query for existing taxonomies due to internal error
log SimpleName MethodInvocation SimpleName e
error SimpleName MethodInvocation StringLiteral unable to query for existing taxonomies due to internal error
error SimpleName MethodInvocation SimpleName e
unable to query for existing taxonomies due to internal error StringLiteral MethodInvocation SimpleName e
resource already exists exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation StringLiteral attempted to create default taxonomy and it already exists
info SimpleName MethodInvocation StringLiteral attempted to create default taxonomy and it already exists
private Modifier MethodDeclaration PrimitiveType void
private Modifier MethodDeclaration SimpleName create default taxonomy if needed
void PrimitiveType MethodDeclaration SimpleName create default taxonomy if needed
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName create default taxonomy if needed
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName create default taxonomy if needed
