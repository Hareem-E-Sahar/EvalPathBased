list SimpleName SimpleType ParameterizedType SimpleType SimpleName string
json object SimpleName SimpleType SingleVariableDeclaration SimpleName json response
json response SimpleName MethodInvocation SimpleName get json array
json response SimpleName MethodInvocation QualifiedName atlas clientresults
get json array SimpleName MethodInvocation QualifiedName atlas clientresults
results SimpleName VariableDeclarationFragment MethodInvocation SimpleName json response
results SimpleName VariableDeclarationFragment MethodInvocation SimpleName get json array
results SimpleName VariableDeclarationFragment MethodInvocation QualifiedName atlas clientresults
json array SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName results
array list SimpleName SimpleType ParameterizedType SimpleType SimpleName string
index SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName index
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
results SimpleName MethodInvocation SimpleName length
index SimpleName InfixExpression MethodInvocation SimpleName results
index SimpleName InfixExpression MethodInvocation SimpleName length
results SimpleName MethodInvocation SimpleName get string
results SimpleName MethodInvocation SimpleName index
get string SimpleName MethodInvocation SimpleName index
results list SimpleName MethodInvocation SimpleName add
results list SimpleName MethodInvocation MethodInvocation SimpleName results
results list SimpleName MethodInvocation MethodInvocation SimpleName get string
results list SimpleName MethodInvocation MethodInvocation SimpleName index
add SimpleName MethodInvocation MethodInvocation SimpleName results
add SimpleName MethodInvocation MethodInvocation SimpleName get string
add SimpleName MethodInvocation MethodInvocation SimpleName index
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName index
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName index
index SimpleName InfixExpression ForStatement PostfixExpression SimpleName index
json exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
atlas service exception SimpleName SimpleType ClassInstanceCreation SimpleName e
private Modifier MethodDeclaration ParameterizedType SimpleType SimpleName list
private Modifier MethodDeclaration ParameterizedType SimpleType SimpleName string
private Modifier MethodDeclaration SimpleName extract results
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName json object
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName json response
private Modifier MethodDeclaration SimpleType SimpleName atlas service exception
list SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName extract results
string SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName extract results
extract results SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName json object
extract results SimpleName MethodDeclaration SingleVariableDeclaration SimpleName json response
extract results SimpleName MethodDeclaration SimpleType SimpleName atlas service exception
json response SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName atlas service exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration SimpleName extract results
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName json response
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName atlas service exception
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration SimpleName extract results
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName json response
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName atlas service exception