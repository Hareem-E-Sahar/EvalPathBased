client session SimpleName SimpleType SingleVariableDeclaration SimpleName session
string SimpleName SimpleType SingleVariableDeclaration SimpleName command
session SimpleName MethodInvocation SimpleName create exec channel
session SimpleName MethodInvocation SimpleName command
create exec channel SimpleName MethodInvocation SimpleName command
channel SimpleName VariableDeclarationFragment MethodInvocation SimpleName session
channel SimpleName VariableDeclarationFragment MethodInvocation SimpleName create exec channel
channel SimpleName VariableDeclarationFragment MethodInvocation SimpleName command
channel exec SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName channel
channel SimpleName MethodInvocation SimpleName set out
channel SimpleName MethodInvocation QualifiedName systemout
set out SimpleName MethodInvocation QualifiedName systemout
channel SimpleName MethodInvocation SimpleName set err
channel SimpleName MethodInvocation QualifiedName systemerr
set err SimpleName MethodInvocation QualifiedName systemerr
channel SimpleName MethodInvocation SimpleName open
channel SimpleName MethodInvocation MethodInvocation SimpleName verify
open SimpleName MethodInvocation MethodInvocation SimpleName verify
channel SimpleName MethodInvocation SimpleName wait for
channel SimpleName MethodInvocation QualifiedName client channelclosed
channel SimpleName MethodInvocation NumberLiteral empty
wait for SimpleName MethodInvocation QualifiedName client channelclosed
wait for SimpleName MethodInvocation NumberLiteral empty
client channelclosed QualifiedName MethodInvocation NumberLiteral empty
channel SimpleName MethodInvocation SimpleName get exit status
status SimpleName VariableDeclarationFragment MethodInvocation SimpleName channel
status SimpleName VariableDeclarationFragment MethodInvocation SimpleName get exit status
integer SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName status
status SimpleName MethodInvocation SimpleName int value
status SimpleName MethodInvocation InfixExpression NumberLiteral empty
int value SimpleName MethodInvocation InfixExpression NumberLiteral empty
command failed with status StringLiteral InfixExpression SimpleName status
exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral command failed with status
exception SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName status
private Modifier MethodDeclaration PrimitiveType void
private Modifier MethodDeclaration SimpleName execute
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName client session
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName session
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName command
private Modifier MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration SimpleName execute
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName client session
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName session
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName command
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
execute SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName client session
execute SimpleName MethodDeclaration SingleVariableDeclaration SimpleName session
execute SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
execute SimpleName MethodDeclaration SingleVariableDeclaration SimpleName command
execute SimpleName MethodDeclaration SimpleType SimpleName exception
session SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName command
session SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
command SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName execute
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName session
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName command
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName execute
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName session
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName command
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception