client SimpleName VariableDeclarationFragment MethodInvocation SimpleName setup test client
ssh client SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName client
client SimpleName MethodInvocation SimpleName start
client SimpleName MethodInvocation SimpleName connect
client SimpleName MethodInvocation MethodInvocation SimpleName get current test name
client SimpleName MethodInvocation SimpleName test localhost
client SimpleName MethodInvocation SimpleName port
connect SimpleName MethodInvocation MethodInvocation SimpleName get current test name
connect SimpleName MethodInvocation SimpleName test localhost
connect SimpleName MethodInvocation SimpleName port
get current test name SimpleName MethodInvocation MethodInvocation SimpleName test localhost
get current test name SimpleName MethodInvocation MethodInvocation SimpleName port
test localhost SimpleName MethodInvocation SimpleName port
client SimpleName MethodInvocation MethodInvocation SimpleName verify
connect SimpleName MethodInvocation MethodInvocation SimpleName verify
get current test name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName verify
test localhost SimpleName MethodInvocation MethodInvocation SimpleName verify
port SimpleName MethodInvocation MethodInvocation SimpleName verify
client SimpleName MethodInvocation MethodInvocation NumberLiteral l
connect SimpleName MethodInvocation MethodInvocation NumberLiteral l
get current test name SimpleName MethodInvocation MethodInvocation MethodInvocation NumberLiteral l
test localhost SimpleName MethodInvocation MethodInvocation NumberLiteral l
port SimpleName MethodInvocation MethodInvocation NumberLiteral l
client SimpleName MethodInvocation MethodInvocation QualifiedName time unitseconds
connect SimpleName MethodInvocation MethodInvocation QualifiedName time unitseconds
get current test name SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName time unitseconds
test localhost SimpleName MethodInvocation MethodInvocation QualifiedName time unitseconds
port SimpleName MethodInvocation MethodInvocation QualifiedName time unitseconds
verify SimpleName MethodInvocation NumberLiteral l
verify SimpleName MethodInvocation QualifiedName time unitseconds
l NumberLiteral MethodInvocation QualifiedName time unitseconds
client SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get session
connect SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get session
test localhost SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get session
port SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get session
verify SimpleName MethodInvocation MethodInvocation SimpleName get session
l NumberLiteral MethodInvocation MethodInvocation SimpleName get session
time unitseconds QualifiedName MethodInvocation MethodInvocation SimpleName get session
session SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName verify
session SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation NumberLiteral l
session SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation QualifiedName time unitseconds
session SimpleName VariableDeclarationFragment MethodInvocation SimpleName get session
client session SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName session
session SimpleName MethodInvocation SimpleName add password identity
session SimpleName MethodInvocation MethodInvocation SimpleName get current test name
add password identity SimpleName MethodInvocation MethodInvocation SimpleName get current test name
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
session SimpleName MethodInvocation SimpleName create sftp client
session SimpleName MethodInvocation MethodInvocation SimpleName get tested version
create sftp client SimpleName MethodInvocation MethodInvocation SimpleName get tested version
sftp SimpleName VariableDeclarationFragment MethodInvocation SimpleName session
sftp SimpleName VariableDeclarationFragment MethodInvocation SimpleName create sftp client
sftp SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get tested version
sftp client SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName sftp
sftp SimpleName MethodInvocation SimpleName get version
assert equals SimpleName MethodInvocation StringLiteral mismatched negotiated version
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get tested version
assert equals SimpleName MethodInvocation MethodInvocation SimpleName sftp
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get version
mismatched negotiated version StringLiteral MethodInvocation MethodInvocation SimpleName get tested version
mismatched negotiated version StringLiteral MethodInvocation MethodInvocation SimpleName sftp
mismatched negotiated version StringLiteral MethodInvocation MethodInvocation SimpleName get version
get tested version SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName sftp
get tested version SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get version
client SimpleName MethodInvocation SimpleName stop
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test sftp version selector
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test sftp version selector
public Modifier MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration SimpleName test sftp version selector
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
test sftp version selector SimpleName MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test sftp version selector
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test sftp version selector
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
