list SimpleName SimpleType ParameterizedType SimpleType SimpleName integer
system SimpleName MethodInvocation SimpleName nano time
random SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName system
random SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName nano time
rnd SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName random
rnd SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName system
rnd SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName nano time
random SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName rnd
mockito SimpleName MethodInvocation SimpleName mock
mockito SimpleName MethodInvocation TypeLiteral SimpleType SimpleName client session
mock SimpleName MethodInvocation TypeLiteral SimpleType SimpleName client session
session SimpleName VariableDeclarationFragment MethodInvocation SimpleName mockito
session SimpleName VariableDeclarationFragment MethodInvocation SimpleName mock
client session SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName session
expected SimpleName VariableDeclarationFragment QualifiedName sftp subsystemlower sftp impl
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName expected
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment QualifiedName sftp subsystemlower sftp impl
expected SimpleName InfixExpression QualifiedName sftp subsystemhigher sftp impl
mismatched directly selected for available StringLiteral InfixExpression SimpleName available
sftp version selectorcurrent QualifiedName MethodInvocation SimpleName select version
sftp version selectorcurrent QualifiedName MethodInvocation SimpleName session
sftp version selectorcurrent QualifiedName MethodInvocation SimpleName expected
sftp version selectorcurrent QualifiedName MethodInvocation SimpleName available
select version SimpleName MethodInvocation SimpleName session
select version SimpleName MethodInvocation SimpleName expected
select version SimpleName MethodInvocation SimpleName available
session SimpleName MethodInvocation SimpleName expected
session SimpleName MethodInvocation SimpleName available
expected SimpleName MethodInvocation SimpleName available
assert equals SimpleName MethodInvocation InfixExpression StringLiteral mismatched directly selected for available
assert equals SimpleName MethodInvocation InfixExpression SimpleName available
assert equals SimpleName MethodInvocation SimpleName expected
assert equals SimpleName MethodInvocation MethodInvocation QualifiedName sftp version selectorcurrent
assert equals SimpleName MethodInvocation MethodInvocation SimpleName select version
assert equals SimpleName MethodInvocation MethodInvocation SimpleName session
assert equals SimpleName MethodInvocation MethodInvocation SimpleName expected
assert equals SimpleName MethodInvocation MethodInvocation SimpleName available
mismatched directly selected for available StringLiteral InfixExpression MethodInvocation SimpleName expected
available SimpleName InfixExpression MethodInvocation SimpleName expected
mismatched directly selected for available StringLiteral InfixExpression MethodInvocation MethodInvocation QualifiedName sftp version selectorcurrent
mismatched directly selected for available StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName select version
mismatched directly selected for available StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName session
mismatched directly selected for available StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName expected
mismatched directly selected for available StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName available
available SimpleName InfixExpression MethodInvocation MethodInvocation QualifiedName sftp version selectorcurrent
available SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName select version
available SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName session
available SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName expected
available SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName available
expected SimpleName MethodInvocation MethodInvocation QualifiedName sftp version selectorcurrent
expected SimpleName MethodInvocation MethodInvocation SimpleName select version
expected SimpleName MethodInvocation MethodInvocation SimpleName session
expected SimpleName MethodInvocation MethodInvocation SimpleName expected
expected SimpleName MethodInvocation MethodInvocation SimpleName available
available SimpleName MethodInvocation SimpleName add
available SimpleName MethodInvocation SimpleName expected
add SimpleName MethodInvocation SimpleName expected
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName expected
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression QualifiedName sftp subsystemhigher sftp impl
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName expected
expected SimpleName InfixExpression ForStatement PostfixExpression SimpleName expected
sftp subsystemhigher sftp impl QualifiedName InfixExpression ForStatement PostfixExpression SimpleName expected
expected SimpleName VariableDeclarationFragment QualifiedName sftp subsystemlower sftp impl
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName expected
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment QualifiedName sftp subsystemlower sftp impl
expected SimpleName InfixExpression QualifiedName sftp subsystemhigher sftp impl
index SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName index
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
available SimpleName MethodInvocation SimpleName size
index SimpleName InfixExpression MethodInvocation SimpleName available
index SimpleName InfixExpression MethodInvocation SimpleName size
collections SimpleName MethodInvocation SimpleName shuffle
collections SimpleName MethodInvocation SimpleName available
collections SimpleName MethodInvocation SimpleName rnd
shuffle SimpleName MethodInvocation SimpleName available
shuffle SimpleName MethodInvocation SimpleName rnd
available SimpleName MethodInvocation SimpleName rnd
mismatched suffling selected for current StringLiteral InfixExpression SimpleName expected
mismatched suffling selected for current StringLiteral InfixExpression StringLiteral available
mismatched suffling selected for current StringLiteral InfixExpression SimpleName available
expected SimpleName InfixExpression StringLiteral available
expected SimpleName InfixExpression SimpleName available
available StringLiteral InfixExpression SimpleName available
sftp version selectorcurrent QualifiedName MethodInvocation SimpleName select version
sftp version selectorcurrent QualifiedName MethodInvocation SimpleName session
sftp version selectorcurrent QualifiedName MethodInvocation SimpleName expected
sftp version selectorcurrent QualifiedName MethodInvocation SimpleName available
select version SimpleName MethodInvocation SimpleName session
select version SimpleName MethodInvocation SimpleName expected
select version SimpleName MethodInvocation SimpleName available
session SimpleName MethodInvocation SimpleName expected
session SimpleName MethodInvocation SimpleName available
expected SimpleName MethodInvocation SimpleName available
assert equals SimpleName MethodInvocation InfixExpression StringLiteral mismatched suffling selected for current
assert equals SimpleName MethodInvocation InfixExpression SimpleName expected
assert equals SimpleName MethodInvocation InfixExpression StringLiteral available
assert equals SimpleName MethodInvocation InfixExpression SimpleName available
assert equals SimpleName MethodInvocation SimpleName expected
assert equals SimpleName MethodInvocation MethodInvocation QualifiedName sftp version selectorcurrent
assert equals SimpleName MethodInvocation MethodInvocation SimpleName select version
assert equals SimpleName MethodInvocation MethodInvocation SimpleName session
assert equals SimpleName MethodInvocation MethodInvocation SimpleName expected
assert equals SimpleName MethodInvocation MethodInvocation SimpleName available
mismatched suffling selected for current StringLiteral InfixExpression MethodInvocation SimpleName expected
expected SimpleName InfixExpression MethodInvocation SimpleName expected
available StringLiteral InfixExpression MethodInvocation SimpleName expected
available SimpleName InfixExpression MethodInvocation SimpleName expected
mismatched suffling selected for current StringLiteral InfixExpression MethodInvocation MethodInvocation QualifiedName sftp version selectorcurrent
mismatched suffling selected for current StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName select version
mismatched suffling selected for current StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName session
mismatched suffling selected for current StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName expected
mismatched suffling selected for current StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName available
expected SimpleName InfixExpression MethodInvocation MethodInvocation QualifiedName sftp version selectorcurrent
expected SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName select version
expected SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName session
expected SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName expected
expected SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName available
available StringLiteral InfixExpression MethodInvocation MethodInvocation QualifiedName sftp version selectorcurrent
available StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName select version
available StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName session
available StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName expected
available StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName available
available SimpleName InfixExpression MethodInvocation MethodInvocation QualifiedName sftp version selectorcurrent
available SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName select version
available SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName session
available SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName expected
available SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName available
expected SimpleName MethodInvocation MethodInvocation QualifiedName sftp version selectorcurrent
expected SimpleName MethodInvocation MethodInvocation SimpleName select version
expected SimpleName MethodInvocation MethodInvocation SimpleName session
expected SimpleName MethodInvocation MethodInvocation SimpleName expected
expected SimpleName MethodInvocation MethodInvocation SimpleName available
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName index
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName index
index SimpleName InfixExpression ForStatement PostfixExpression SimpleName index
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName expected
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression QualifiedName sftp subsystemhigher sftp impl
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName expected
expected SimpleName InfixExpression ForStatement PostfixExpression SimpleName expected
sftp subsystemhigher sftp impl QualifiedName InfixExpression ForStatement PostfixExpression SimpleName expected
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test current version selector
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test current version selector
void PrimitiveType MethodDeclaration SimpleName test current version selector
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test current version selector
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test current version selector
