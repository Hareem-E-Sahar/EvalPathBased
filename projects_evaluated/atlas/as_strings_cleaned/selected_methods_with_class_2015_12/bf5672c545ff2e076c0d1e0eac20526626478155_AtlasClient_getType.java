string SimpleName SimpleType SingleVariableDeclaration SimpleName type name
get resource SimpleName MethodInvocation QualifiedName apiget type
get resource SimpleName MethodInvocation SimpleName type name
apiget type QualifiedName MethodInvocation SimpleName type name
resource SimpleName VariableDeclarationFragment MethodInvocation SimpleName get resource
resource SimpleName VariableDeclarationFragment MethodInvocation QualifiedName apiget type
resource SimpleName VariableDeclarationFragment MethodInvocation SimpleName type name
web resource SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName resource
call api with resource SimpleName MethodInvocation QualifiedName apiget type
call api with resource SimpleName MethodInvocation SimpleName resource
apiget type QualifiedName MethodInvocation SimpleName resource
response SimpleName VariableDeclarationFragment MethodInvocation SimpleName call api with resource
response SimpleName VariableDeclarationFragment MethodInvocation QualifiedName apiget type
response SimpleName VariableDeclarationFragment MethodInvocation SimpleName resource
json object SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName response
response SimpleName MethodInvocation SimpleName get string
response SimpleName MethodInvocation SimpleName definition
get string SimpleName MethodInvocation SimpleName definition
atlas service exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
e SimpleName MethodInvocation SimpleName get status
e SimpleName MethodInvocation InfixExpression QualifiedName client responsestatusnot found
get status SimpleName MethodInvocation InfixExpression QualifiedName client responsestatusnot found
json exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
atlas service exception SimpleName SimpleType ClassInstanceCreation SimpleName e
public Modifier MethodDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SimpleName get type
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName type name
public Modifier MethodDeclaration SimpleType SimpleName atlas service exception
string SimpleName SimpleType MethodDeclaration SimpleName get type
string SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName type name
string SimpleName SimpleType MethodDeclaration SimpleType SimpleName atlas service exception
get type SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
get type SimpleName MethodDeclaration SingleVariableDeclaration SimpleName type name
get type SimpleName MethodDeclaration SimpleType SimpleName atlas service exception
type name SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName atlas service exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName string
public Modifier TypeDeclaration MethodDeclaration SimpleName get type
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName type name
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName atlas service exception
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName string
test SimpleName TypeDeclaration MethodDeclaration SimpleName get type
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName type name
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName atlas service exception
