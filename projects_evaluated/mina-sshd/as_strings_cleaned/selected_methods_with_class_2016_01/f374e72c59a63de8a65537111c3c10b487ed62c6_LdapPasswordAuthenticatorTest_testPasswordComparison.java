auth SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName ldap password authenticator
ldap password authenticator SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName auth
auth SimpleName MethodInvocation SimpleName set base dn
auth SimpleName MethodInvocation SimpleName base dn test
set base dn SimpleName MethodInvocation SimpleName base dn test
ldap context holder SimpleName MethodInvocation SimpleName get
get port SimpleName MethodInvocation MethodInvocation SimpleName ldap context holder
get port SimpleName MethodInvocation MethodInvocation SimpleName get
auth SimpleName MethodInvocation SimpleName set port
auth SimpleName MethodInvocation MethodInvocation SimpleName get port
auth SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName ldap context holder
auth SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get
set port SimpleName MethodInvocation MethodInvocation SimpleName get port
set port SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName ldap context holder
set port SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get
mockito SimpleName MethodInvocation SimpleName mock
mockito SimpleName MethodInvocation TypeLiteral SimpleType SimpleName server session
mock SimpleName MethodInvocation TypeLiteral SimpleType SimpleName server session
session SimpleName VariableDeclarationFragment MethodInvocation SimpleName mockito
session SimpleName VariableDeclarationFragment MethodInvocation SimpleName mock
server session SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName session
mapentry QualifiedName SimpleType ParameterizedType SimpleType SimpleName string
mapentry QualifiedName SimpleType ParameterizedType SimpleType SimpleName string
string SimpleName SimpleType ParameterizedType SimpleType SimpleName string
mapentry QualifiedName SimpleType ParameterizedType SingleVariableDeclaration SimpleName ue
string SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName ue
string SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName ue
users map SimpleName MethodInvocation SimpleName entry set
ue SimpleName MethodInvocation SimpleName get key
username SimpleName VariableDeclarationFragment MethodInvocation SimpleName ue
username SimpleName VariableDeclarationFragment MethodInvocation SimpleName get key
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName username
ue SimpleName MethodInvocation SimpleName get value
password SimpleName VariableDeclarationFragment MethodInvocation SimpleName ue
password SimpleName VariableDeclarationFragment MethodInvocation SimpleName get value
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName password
output debug message SimpleName MethodInvocation StringLiteral authenticate users passwords
output debug message SimpleName MethodInvocation SimpleName username
output debug message SimpleName MethodInvocation SimpleName password
authenticate users passwords StringLiteral MethodInvocation SimpleName username
authenticate users passwords StringLiteral MethodInvocation SimpleName password
username SimpleName MethodInvocation SimpleName password
failed to authenticate StringLiteral InfixExpression SimpleName username
auth SimpleName MethodInvocation SimpleName authenticate
auth SimpleName MethodInvocation SimpleName username
auth SimpleName MethodInvocation SimpleName password
auth SimpleName MethodInvocation SimpleName session
authenticate SimpleName MethodInvocation SimpleName username
authenticate SimpleName MethodInvocation SimpleName password
authenticate SimpleName MethodInvocation SimpleName session
username SimpleName MethodInvocation SimpleName password
username SimpleName MethodInvocation SimpleName session
password SimpleName MethodInvocation SimpleName session
assert true SimpleName MethodInvocation InfixExpression StringLiteral failed to authenticate
assert true SimpleName MethodInvocation InfixExpression SimpleName username
assert true SimpleName MethodInvocation MethodInvocation SimpleName auth
assert true SimpleName MethodInvocation MethodInvocation SimpleName authenticate
assert true SimpleName MethodInvocation MethodInvocation SimpleName username
assert true SimpleName MethodInvocation MethodInvocation SimpleName password
assert true SimpleName MethodInvocation MethodInvocation SimpleName session
failed to authenticate StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName auth
failed to authenticate StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName authenticate
failed to authenticate StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName username
failed to authenticate StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName password
failed to authenticate StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName session
username SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName auth
username SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName authenticate
username SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName username
username SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName password
username SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName session
ue SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName users map
ue SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName entry set
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test password comparison
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test password comparison
public Modifier MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration SimpleName test password comparison
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
test password comparison SimpleName MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test password comparison
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test password comparison
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
