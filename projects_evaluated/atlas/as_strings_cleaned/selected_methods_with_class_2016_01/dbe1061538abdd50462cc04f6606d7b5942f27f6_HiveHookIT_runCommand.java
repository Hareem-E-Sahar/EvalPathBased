string SimpleName SimpleType SingleVariableDeclaration SimpleName cmd
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral running command {}
log SimpleName MethodInvocation SimpleName cmd
debug SimpleName MethodInvocation StringLiteral running command {}
debug SimpleName MethodInvocation SimpleName cmd
running command {} StringLiteral MethodInvocation SimpleName cmd
ss SimpleName MethodInvocation SimpleName set command type
driver SimpleName MethodInvocation SimpleName run
driver SimpleName MethodInvocation SimpleName cmd
run SimpleName MethodInvocation SimpleName cmd
response SimpleName VariableDeclarationFragment MethodInvocation SimpleName driver
response SimpleName VariableDeclarationFragment MethodInvocation SimpleName run
response SimpleName VariableDeclarationFragment MethodInvocation SimpleName cmd
command processor response SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName response
response SimpleName MethodInvocation SimpleName get response code
assert equals SimpleName MethodInvocation MethodInvocation SimpleName response
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get response code
assert equals SimpleName MethodInvocation NumberLiteral empty
response SimpleName MethodInvocation MethodInvocation NumberLiteral empty
get response code SimpleName MethodInvocation MethodInvocation NumberLiteral empty
private Modifier MethodDeclaration PrimitiveType void
private Modifier MethodDeclaration SimpleName run command
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName cmd
private Modifier MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration SimpleName run command
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName cmd
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
run command SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
run command SimpleName MethodDeclaration SingleVariableDeclaration SimpleName cmd
run command SimpleName MethodDeclaration SimpleType SimpleName exception
cmd SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName run command
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName cmd
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName run command
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName cmd
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
