delegate SimpleName VariableDeclarationFragment MethodInvocation SimpleName dummy factory
command factory SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName delegate
service SimpleName VariableDeclarationFragment MethodInvocation SimpleName dummy executor
executor service SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName service
receive size SimpleName VariableDeclarationFragment QualifiedName shortmax value
receive size SimpleName InfixExpression QualifiedName longsize
send size SimpleName VariableDeclarationFragment InfixExpression SimpleName receive size
send size SimpleName VariableDeclarationFragment InfixExpression QualifiedName longsize
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName receive size
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment QualifiedName shortmax value
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName send size
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment InfixExpression SimpleName receive size
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment InfixExpression QualifiedName longsize
receive size SimpleName VariableDeclarationFragment VariableDeclarationStatement VariableDeclarationFragment SimpleName send size
shortmax value QualifiedName VariableDeclarationFragment VariableDeclarationStatement VariableDeclarationFragment SimpleName send size
scp command factorybuilder QualifiedName SimpleType ClassInstanceCreation MethodInvocation SimpleName with delegate
scp command factorybuilder QualifiedName SimpleType ClassInstanceCreation MethodInvocation SimpleName delegate
with delegate SimpleName MethodInvocation SimpleName delegate
with delegate SimpleName MethodInvocation MethodInvocation SimpleName with executor service
delegate SimpleName MethodInvocation MethodInvocation SimpleName with executor service
with delegate SimpleName MethodInvocation MethodInvocation SimpleName service
delegate SimpleName MethodInvocation MethodInvocation SimpleName service
with executor service SimpleName MethodInvocation SimpleName service
with delegate SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName with send buffer size
delegate SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName with send buffer size
with executor service SimpleName MethodInvocation MethodInvocation SimpleName with send buffer size
service SimpleName MethodInvocation MethodInvocation SimpleName with send buffer size
with delegate SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName send size
delegate SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName send size
with executor service SimpleName MethodInvocation MethodInvocation SimpleName send size
service SimpleName MethodInvocation MethodInvocation SimpleName send size
with send buffer size SimpleName MethodInvocation SimpleName send size
with executor service SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName with receive buffer size
service SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName with receive buffer size
with send buffer size SimpleName MethodInvocation MethodInvocation SimpleName with receive buffer size
send size SimpleName MethodInvocation MethodInvocation SimpleName with receive buffer size
with executor service SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName receive size
service SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName receive size
with send buffer size SimpleName MethodInvocation MethodInvocation SimpleName receive size
send size SimpleName MethodInvocation MethodInvocation SimpleName receive size
with receive buffer size SimpleName MethodInvocation SimpleName receive size
with send buffer size SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName with shutdown on exit
send size SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName with shutdown on exit
with receive buffer size SimpleName MethodInvocation MethodInvocation SimpleName with shutdown on exit
receive size SimpleName MethodInvocation MethodInvocation SimpleName with shutdown on exit
with send buffer size SimpleName MethodInvocation MethodInvocation MethodInvocation BooleanLiteral true
send size SimpleName MethodInvocation MethodInvocation MethodInvocation BooleanLiteral true
with receive buffer size SimpleName MethodInvocation MethodInvocation BooleanLiteral true
receive size SimpleName MethodInvocation MethodInvocation BooleanLiteral true
with shutdown on exit SimpleName MethodInvocation BooleanLiteral true
with receive buffer size SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName build
receive size SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName build
with shutdown on exit SimpleName MethodInvocation MethodInvocation SimpleName build
true BooleanLiteral MethodInvocation MethodInvocation SimpleName build
factory SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName with shutdown on exit
factory SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation BooleanLiteral true
factory SimpleName VariableDeclarationFragment MethodInvocation SimpleName build
scp command factory SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName factory
factory SimpleName MethodInvocation SimpleName get delegate command factory
assert same SimpleName MethodInvocation StringLiteral mismatched delegate
assert same SimpleName MethodInvocation SimpleName delegate
assert same SimpleName MethodInvocation MethodInvocation SimpleName factory
assert same SimpleName MethodInvocation MethodInvocation SimpleName get delegate command factory
mismatched delegate StringLiteral MethodInvocation SimpleName delegate
mismatched delegate StringLiteral MethodInvocation MethodInvocation SimpleName factory
mismatched delegate StringLiteral MethodInvocation MethodInvocation SimpleName get delegate command factory
delegate SimpleName MethodInvocation MethodInvocation SimpleName factory
delegate SimpleName MethodInvocation MethodInvocation SimpleName get delegate command factory
factory SimpleName MethodInvocation SimpleName get executor service
assert same SimpleName MethodInvocation StringLiteral mismatched executor
assert same SimpleName MethodInvocation SimpleName service
assert same SimpleName MethodInvocation MethodInvocation SimpleName factory
assert same SimpleName MethodInvocation MethodInvocation SimpleName get executor service
mismatched executor StringLiteral MethodInvocation SimpleName service
mismatched executor StringLiteral MethodInvocation MethodInvocation SimpleName factory
mismatched executor StringLiteral MethodInvocation MethodInvocation SimpleName get executor service
service SimpleName MethodInvocation MethodInvocation SimpleName factory
service SimpleName MethodInvocation MethodInvocation SimpleName get executor service
factory SimpleName MethodInvocation SimpleName get send buffer size
assert equals SimpleName MethodInvocation StringLiteral mismatched send size
assert equals SimpleName MethodInvocation SimpleName send size
assert equals SimpleName MethodInvocation MethodInvocation SimpleName factory
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get send buffer size
mismatched send size StringLiteral MethodInvocation SimpleName send size
mismatched send size StringLiteral MethodInvocation MethodInvocation SimpleName factory
mismatched send size StringLiteral MethodInvocation MethodInvocation SimpleName get send buffer size
send size SimpleName MethodInvocation MethodInvocation SimpleName factory
send size SimpleName MethodInvocation MethodInvocation SimpleName get send buffer size
factory SimpleName MethodInvocation SimpleName get receive buffer size
assert equals SimpleName MethodInvocation StringLiteral mismatched receive size
assert equals SimpleName MethodInvocation SimpleName receive size
assert equals SimpleName MethodInvocation MethodInvocation SimpleName factory
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get receive buffer size
mismatched receive size StringLiteral MethodInvocation SimpleName receive size
mismatched receive size StringLiteral MethodInvocation MethodInvocation SimpleName factory
mismatched receive size StringLiteral MethodInvocation MethodInvocation SimpleName get receive buffer size
receive size SimpleName MethodInvocation MethodInvocation SimpleName factory
receive size SimpleName MethodInvocation MethodInvocation SimpleName get receive buffer size
factory SimpleName MethodInvocation SimpleName is shutdown on exit
assert true SimpleName MethodInvocation StringLiteral mismatched shutdown state
assert true SimpleName MethodInvocation MethodInvocation SimpleName factory
assert true SimpleName MethodInvocation MethodInvocation SimpleName is shutdown on exit
mismatched shutdown state StringLiteral MethodInvocation MethodInvocation SimpleName factory
mismatched shutdown state StringLiteral MethodInvocation MethodInvocation SimpleName is shutdown on exit
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test builder correctly initializes factory
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test builder correctly initializes factory
public Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
void PrimitiveType MethodDeclaration SimpleName test builder correctly initializes factory
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
test builder correctly initializes factory SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test builder correctly initializes factory
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test builder correctly initializes factory
