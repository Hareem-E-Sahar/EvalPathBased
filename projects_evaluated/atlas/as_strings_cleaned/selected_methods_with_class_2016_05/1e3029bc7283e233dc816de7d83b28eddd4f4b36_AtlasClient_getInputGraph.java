string SimpleName SimpleType SingleVariableDeclaration SimpleName dataset name
call api SimpleName MethodInvocation QualifiedName apilineage inputs graph
call api SimpleName MethodInvocation SimpleName dataset name
call api SimpleName MethodInvocation StringLiteral inputsgraph
apilineage inputs graph QualifiedName MethodInvocation SimpleName dataset name
apilineage inputs graph QualifiedName MethodInvocation StringLiteral inputsgraph
dataset name SimpleName MethodInvocation StringLiteral inputsgraph
response SimpleName VariableDeclarationFragment MethodInvocation SimpleName call api
response SimpleName VariableDeclarationFragment MethodInvocation QualifiedName apilineage inputs graph
response SimpleName VariableDeclarationFragment MethodInvocation SimpleName dataset name
response SimpleName VariableDeclarationFragment MethodInvocation StringLiteral inputsgraph
json object SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName response
response SimpleName MethodInvocation SimpleName get json object
response SimpleName MethodInvocation QualifiedName atlas clientresults
get json object SimpleName MethodInvocation QualifiedName atlas clientresults
json exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
atlas service exception SimpleName SimpleType ClassInstanceCreation SimpleName e
public Modifier MethodDeclaration SimpleType SimpleName json object
public Modifier MethodDeclaration SimpleName get input graph
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName dataset name
public Modifier MethodDeclaration SimpleType SimpleName atlas service exception
json object SimpleName SimpleType MethodDeclaration SimpleName get input graph
json object SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName dataset name
json object SimpleName SimpleType MethodDeclaration SimpleType SimpleName atlas service exception
get input graph SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
get input graph SimpleName MethodDeclaration SingleVariableDeclaration SimpleName dataset name
get input graph SimpleName MethodDeclaration SimpleType SimpleName atlas service exception
dataset name SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName atlas service exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName json object
public Modifier TypeDeclaration MethodDeclaration SimpleName get input graph
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName dataset name
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName atlas service exception
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName json object
test SimpleName TypeDeclaration MethodDeclaration SimpleName get input graph
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName dataset name
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName atlas service exception