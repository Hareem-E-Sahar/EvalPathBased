byte PrimitiveType ArrayType ArrayCreation NumberLiteral empty
buf SimpleName VariableDeclarationFragment ArrayCreation ArrayType PrimitiveType byte
buf SimpleName VariableDeclarationFragment ArrayCreation NumberLiteral empty
byte PrimitiveType ArrayType VariableDeclarationStatement VariableDeclarationFragment SimpleName buf
socket SimpleName MethodInvocation SimpleName recv
socket SimpleName MethodInvocation SimpleName socket
socket SimpleName MethodInvocation SimpleName buf
socket SimpleName MethodInvocation NumberLiteral empty
socket SimpleName MethodInvocation QualifiedName buflength
recv SimpleName MethodInvocation SimpleName socket
recv SimpleName MethodInvocation SimpleName buf
recv SimpleName MethodInvocation NumberLiteral empty
recv SimpleName MethodInvocation QualifiedName buflength
socket SimpleName MethodInvocation SimpleName buf
socket SimpleName MethodInvocation NumberLiteral empty
socket SimpleName MethodInvocation QualifiedName buflength
buf SimpleName MethodInvocation NumberLiteral empty
buf SimpleName MethodInvocation QualifiedName buflength
empty NumberLiteral MethodInvocation QualifiedName buflength
result SimpleName VariableDeclarationFragment MethodInvocation SimpleName socket
result SimpleName VariableDeclarationFragment MethodInvocation SimpleName recv
result SimpleName VariableDeclarationFragment MethodInvocation SimpleName socket
result SimpleName VariableDeclarationFragment MethodInvocation SimpleName buf
result SimpleName VariableDeclarationFragment MethodInvocation NumberLiteral empty
result SimpleName VariableDeclarationFragment MethodInvocation QualifiedName buflength
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName result
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName socket
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName recv
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName socket
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName buf
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation NumberLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation QualifiedName buflength
result SimpleName InfixExpression QualifiedName statusapr eof
result SimpleName InfixExpression QualifiedName statusapr success
agent server proxy SimpleName MethodInvocation SimpleName throw exception
agent server proxy SimpleName MethodInvocation SimpleName result
throw exception SimpleName MethodInvocation SimpleName result
get inverted in SimpleName MethodInvocation MethodInvocation SimpleName write
get inverted in SimpleName MethodInvocation MethodInvocation SimpleName buf
get inverted in SimpleName MethodInvocation MethodInvocation NumberLiteral empty
get inverted in SimpleName MethodInvocation MethodInvocation SimpleName result
write SimpleName MethodInvocation SimpleName buf
write SimpleName MethodInvocation NumberLiteral empty
write SimpleName MethodInvocation SimpleName result
buf SimpleName MethodInvocation NumberLiteral empty
buf SimpleName MethodInvocation SimpleName result
empty NumberLiteral MethodInvocation SimpleName result
get inverted in SimpleName MethodInvocation MethodInvocation SimpleName flush
true BooleanLiteral WhileStatement Block VariableDeclarationStatement PrimitiveType int
exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
e SimpleName MethodInvocation SimpleName print stack trace
close SimpleName MethodInvocation BooleanLiteral false
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName run
void PrimitiveType MethodDeclaration SimpleName run
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName run
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName run