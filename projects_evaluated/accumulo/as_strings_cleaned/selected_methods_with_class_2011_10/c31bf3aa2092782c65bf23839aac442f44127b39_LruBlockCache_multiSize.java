max size SimpleName FieldAccess InfixExpression FieldAccess SimpleName multi factor
max size SimpleName FieldAccess InfixExpression FieldAccess SimpleName min factor
multi factor SimpleName FieldAccess InfixExpression FieldAccess SimpleName min factor
math SimpleName MethodInvocation SimpleName floor
math SimpleName MethodInvocation InfixExpression FieldAccess SimpleName max size
math SimpleName MethodInvocation InfixExpression FieldAccess SimpleName multi factor
math SimpleName MethodInvocation InfixExpression FieldAccess SimpleName min factor
floor SimpleName MethodInvocation InfixExpression FieldAccess SimpleName max size
floor SimpleName MethodInvocation InfixExpression FieldAccess SimpleName multi factor
floor SimpleName MethodInvocation InfixExpression FieldAccess SimpleName min factor
long PrimitiveType CastExpression MethodInvocation SimpleName math
long PrimitiveType CastExpression MethodInvocation SimpleName floor
private Modifier MethodDeclaration PrimitiveType long
private Modifier MethodDeclaration SimpleName multi size
long PrimitiveType MethodDeclaration SimpleName multi size
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration PrimitiveType long
public Modifier TypeDeclaration MethodDeclaration SimpleName multi size
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType long
test SimpleName TypeDeclaration MethodDeclaration SimpleName multi size
