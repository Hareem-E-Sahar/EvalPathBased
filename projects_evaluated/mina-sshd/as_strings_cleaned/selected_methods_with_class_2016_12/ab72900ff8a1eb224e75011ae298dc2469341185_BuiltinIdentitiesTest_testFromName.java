expected SimpleName MethodInvocation SimpleName get name
name SimpleName VariableDeclarationFragment MethodInvocation SimpleName expected
name SimpleName VariableDeclarationFragment MethodInvocation SimpleName get name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName name
index SimpleName VariableDeclarationFragment NumberLiteral empty
name SimpleName MethodInvocation SimpleName length
count SimpleName VariableDeclarationFragment MethodInvocation SimpleName name
count SimpleName VariableDeclarationFragment MethodInvocation SimpleName length
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName index
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName count
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment MethodInvocation SimpleName name
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment MethodInvocation SimpleName length
index SimpleName VariableDeclarationFragment VariableDeclarationExpression VariableDeclarationFragment SimpleName count
empty NumberLiteral VariableDeclarationFragment VariableDeclarationExpression VariableDeclarationFragment SimpleName count
index SimpleName InfixExpression SimpleName count
builtin identities SimpleName MethodInvocation SimpleName from name
builtin identities SimpleName MethodInvocation SimpleName name
from name SimpleName MethodInvocation SimpleName name
assert same SimpleName MethodInvocation SimpleName name
assert same SimpleName MethodInvocation SimpleName expected
assert same SimpleName MethodInvocation MethodInvocation SimpleName builtin identities
assert same SimpleName MethodInvocation MethodInvocation SimpleName from name
assert same SimpleName MethodInvocation MethodInvocation SimpleName name
name SimpleName MethodInvocation SimpleName expected
name SimpleName MethodInvocation MethodInvocation SimpleName builtin identities
name SimpleName MethodInvocation MethodInvocation SimpleName from name
name SimpleName MethodInvocation MethodInvocation SimpleName name
expected SimpleName MethodInvocation MethodInvocation SimpleName builtin identities
expected SimpleName MethodInvocation MethodInvocation SimpleName from name
expected SimpleName MethodInvocation MethodInvocation SimpleName name
shuffle case SimpleName MethodInvocation SimpleName name
name SimpleName Assignment MethodInvocation SimpleName shuffle case
name SimpleName Assignment MethodInvocation SimpleName name
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName index
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName count
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName index
index SimpleName InfixExpression ForStatement PostfixExpression SimpleName index
count SimpleName InfixExpression ForStatement PostfixExpression SimpleName index
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test from name
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test from name
void PrimitiveType MethodDeclaration SimpleName test from name
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test from name
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test from name