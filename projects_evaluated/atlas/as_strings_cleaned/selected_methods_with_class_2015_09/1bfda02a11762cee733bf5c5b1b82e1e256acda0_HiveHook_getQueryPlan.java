hive event SimpleName SimpleType SingleVariableDeclaration SimpleName event
explain SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName explain task
explain task SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName explain
explain SimpleName MethodInvocation SimpleName initialize
explain SimpleName MethodInvocation QualifiedName eventconf
explain SimpleName MethodInvocation QualifiedName eventquery plan
initialize SimpleName MethodInvocation QualifiedName eventconf
initialize SimpleName MethodInvocation QualifiedName eventquery plan
eventconf QualifiedName MethodInvocation QualifiedName eventquery plan
task SimpleName SimpleType ParameterizedType WildcardType ?
list SimpleName SimpleType ParameterizedType ParameterizedType WildcardType ?
eventquery plan QualifiedName MethodInvocation SimpleName get root tasks
root tasks SimpleName VariableDeclarationFragment MethodInvocation QualifiedName eventquery plan
root tasks SimpleName VariableDeclarationFragment MethodInvocation SimpleName get root tasks
eventquery plan QualifiedName MethodInvocation SimpleName get fetch task
explain SimpleName MethodInvocation SimpleName get json plan
explain SimpleName MethodInvocation SimpleName root tasks
explain SimpleName MethodInvocation MethodInvocation QualifiedName eventquery plan
explain SimpleName MethodInvocation MethodInvocation SimpleName get fetch task
get json plan SimpleName MethodInvocation SimpleName root tasks
get json plan SimpleName MethodInvocation MethodInvocation QualifiedName eventquery plan
get json plan SimpleName MethodInvocation MethodInvocation SimpleName get fetch task
get json plan SimpleName MethodInvocation BooleanLiteral true
root tasks SimpleName MethodInvocation MethodInvocation QualifiedName eventquery plan
root tasks SimpleName MethodInvocation MethodInvocation SimpleName get fetch task
root tasks SimpleName MethodInvocation BooleanLiteral true
root tasks SimpleName MethodInvocation BooleanLiteral false
root tasks SimpleName MethodInvocation BooleanLiteral false
eventquery plan QualifiedName MethodInvocation MethodInvocation BooleanLiteral true
get fetch task SimpleName MethodInvocation MethodInvocation BooleanLiteral true
eventquery plan QualifiedName MethodInvocation MethodInvocation BooleanLiteral false
get fetch task SimpleName MethodInvocation MethodInvocation BooleanLiteral false
eventquery plan QualifiedName MethodInvocation MethodInvocation BooleanLiteral false
get fetch task SimpleName MethodInvocation MethodInvocation BooleanLiteral false
true BooleanLiteral MethodInvocation BooleanLiteral false
true BooleanLiteral MethodInvocation BooleanLiteral false
false BooleanLiteral MethodInvocation BooleanLiteral false
exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation StringLiteral failed to get queryplan
log SimpleName MethodInvocation SimpleName e
info SimpleName MethodInvocation StringLiteral failed to get queryplan
info SimpleName MethodInvocation SimpleName e
failed to get queryplan StringLiteral MethodInvocation SimpleName e
private Modifier MethodDeclaration SimpleType SimpleName json object
private Modifier MethodDeclaration SimpleName get query plan
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName hive event
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName event
private Modifier MethodDeclaration SimpleType SimpleName exception
json object SimpleName SimpleType MethodDeclaration SimpleName get query plan
json object SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName event
json object SimpleName SimpleType MethodDeclaration SimpleType SimpleName exception
get query plan SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName hive event
get query plan SimpleName MethodDeclaration SingleVariableDeclaration SimpleName event
get query plan SimpleName MethodDeclaration SimpleType SimpleName exception
event SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName json object
public Modifier TypeDeclaration MethodDeclaration SimpleName get query plan
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName event
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName json object
test SimpleName TypeDeclaration MethodDeclaration SimpleName get query plan
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName event
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception