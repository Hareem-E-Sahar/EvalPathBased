named factory SimpleName SimpleType ParameterizedType SimpleType SimpleName user auth
arrays SimpleName MethodInvocation ParameterizedType SimpleType SimpleName named factory
arrays SimpleName MethodInvocation ParameterizedType SimpleType SimpleName user auth
arrays SimpleName MethodInvocation SimpleName as list
arrays SimpleName MethodInvocation ClassInstanceCreation SimpleType QualifiedName user auth passworduser auth password factory
named factory SimpleName SimpleType ParameterizedType MethodInvocation SimpleName as list
user auth SimpleName SimpleType ParameterizedType MethodInvocation SimpleName as list
as list SimpleName MethodInvocation ClassInstanceCreation SimpleType QualifiedName user auth passworduser auth password factory
client SimpleName MethodInvocation SimpleName set user auth factories
client SimpleName MethodInvocation MethodInvocation SimpleName arrays
client SimpleName MethodInvocation MethodInvocation SimpleName as list
set user auth factories SimpleName MethodInvocation MethodInvocation SimpleName arrays
set user auth factories SimpleName MethodInvocation MethodInvocation SimpleName as list
client SimpleName MethodInvocation SimpleName start
client SimpleName MethodInvocation SimpleName connect
client SimpleName MethodInvocation StringLiteral smx
client SimpleName MethodInvocation StringLiteral localhost
client SimpleName MethodInvocation SimpleName port
connect SimpleName MethodInvocation StringLiteral smx
connect SimpleName MethodInvocation StringLiteral localhost
connect SimpleName MethodInvocation SimpleName port
smx StringLiteral MethodInvocation StringLiteral localhost
smx StringLiteral MethodInvocation SimpleName port
localhost StringLiteral MethodInvocation SimpleName port
client SimpleName MethodInvocation MethodInvocation SimpleName await
connect SimpleName MethodInvocation MethodInvocation SimpleName await
smx StringLiteral MethodInvocation MethodInvocation SimpleName await
localhost StringLiteral MethodInvocation MethodInvocation SimpleName await
port SimpleName MethodInvocation MethodInvocation SimpleName await
client SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get session
connect SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get session
smx StringLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName get session
localhost StringLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName get session
port SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get session
await SimpleName MethodInvocation MethodInvocation SimpleName get session
session SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName await
session SimpleName VariableDeclarationFragment MethodInvocation SimpleName get session
client session SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName session
session SimpleName MethodInvocation SimpleName add password identity
session SimpleName MethodInvocation StringLiteral smx
add password identity SimpleName MethodInvocation StringLiteral smx
session SimpleName MethodInvocation SimpleName auth
session SimpleName MethodInvocation MethodInvocation SimpleName verify
auth SimpleName MethodInvocation MethodInvocation SimpleName verify
session SimpleName MethodInvocation MethodInvocation NumberLiteral l
auth SimpleName MethodInvocation MethodInvocation NumberLiteral l
session SimpleName MethodInvocation MethodInvocation QualifiedName time unitseconds
auth SimpleName MethodInvocation MethodInvocation QualifiedName time unitseconds
verify SimpleName MethodInvocation NumberLiteral l
verify SimpleName MethodInvocation QualifiedName time unitseconds
l NumberLiteral MethodInvocation QualifiedName time unitseconds
client SimpleName MethodInvocation SimpleName stop
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test password auth new
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test password auth new
public Modifier MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration SimpleName test password auth new
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
test password auth new SimpleName MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test password auth new
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test password auth new
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
