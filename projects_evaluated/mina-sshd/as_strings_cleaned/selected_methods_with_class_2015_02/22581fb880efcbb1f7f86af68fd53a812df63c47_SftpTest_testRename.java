ssh client SimpleName MethodInvocation SimpleName set up default client
client SimpleName VariableDeclarationFragment MethodInvocation SimpleName ssh client
client SimpleName VariableDeclarationFragment MethodInvocation SimpleName set up default client
ssh client SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName client
client SimpleName MethodInvocation SimpleName start
client SimpleName MethodInvocation SimpleName connect
client SimpleName MethodInvocation StringLiteral x
client SimpleName MethodInvocation StringLiteral localhost
client SimpleName MethodInvocation SimpleName port
connect SimpleName MethodInvocation StringLiteral x
connect SimpleName MethodInvocation StringLiteral localhost
connect SimpleName MethodInvocation SimpleName port
x StringLiteral MethodInvocation StringLiteral localhost
x StringLiteral MethodInvocation SimpleName port
localhost StringLiteral MethodInvocation SimpleName port
client SimpleName MethodInvocation MethodInvocation SimpleName await
connect SimpleName MethodInvocation MethodInvocation SimpleName await
x StringLiteral MethodInvocation MethodInvocation SimpleName await
localhost StringLiteral MethodInvocation MethodInvocation SimpleName await
port SimpleName MethodInvocation MethodInvocation SimpleName await
client SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get session
connect SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get session
x StringLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName get session
localhost StringLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName get session
port SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get session
await SimpleName MethodInvocation MethodInvocation SimpleName get session
session SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName await
session SimpleName VariableDeclarationFragment MethodInvocation SimpleName get session
client session SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName session
session SimpleName MethodInvocation SimpleName add password identity
session SimpleName MethodInvocation StringLiteral x
add password identity SimpleName MethodInvocation StringLiteral x
session SimpleName MethodInvocation SimpleName auth
session SimpleName MethodInvocation MethodInvocation SimpleName verify
auth SimpleName MethodInvocation MethodInvocation SimpleName verify
file SimpleName SimpleType ClassInstanceCreation StringLiteral targetsftp
utils SimpleName MethodInvocation SimpleName delete recursive
utils SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName file
utils SimpleName MethodInvocation ClassInstanceCreation StringLiteral targetsftp
delete recursive SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName file
delete recursive SimpleName MethodInvocation ClassInstanceCreation StringLiteral targetsftp
file SimpleName SimpleType ClassInstanceCreation StringLiteral targetsftp
file SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName mkdirs
targetsftp StringLiteral ClassInstanceCreation MethodInvocation SimpleName mkdirs
file SimpleName SimpleType ClassInstanceCreation StringLiteral targetsftpclient
file SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName delete
targetsftpclient StringLiteral ClassInstanceCreation MethodInvocation SimpleName delete
session SimpleName MethodInvocation SimpleName create sftp client
sftp SimpleName VariableDeclarationFragment MethodInvocation SimpleName session
sftp SimpleName VariableDeclarationFragment MethodInvocation SimpleName create sftp client
sftp client SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName sftp
sftp SimpleName MethodInvocation SimpleName write
sftp SimpleName MethodInvocation StringLiteral targetsftptesttxt
write SimpleName MethodInvocation StringLiteral targetsftptesttxt
os SimpleName VariableDeclarationFragment MethodInvocation SimpleName sftp
os SimpleName VariableDeclarationFragment MethodInvocation SimpleName write
os SimpleName VariableDeclarationFragment MethodInvocation StringLiteral targetsftptesttxt
output stream SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName os
hello world StringLiteral MethodInvocation SimpleName get bytes
os SimpleName MethodInvocation SimpleName write
os SimpleName MethodInvocation MethodInvocation StringLiteral hello world
os SimpleName MethodInvocation MethodInvocation SimpleName get bytes
write SimpleName MethodInvocation MethodInvocation StringLiteral hello world
write SimpleName MethodInvocation MethodInvocation SimpleName get bytes
sftp SimpleName MethodInvocation SimpleName rename
sftp SimpleName MethodInvocation StringLiteral targetsftptest txt
sftp SimpleName MethodInvocation StringLiteral targetsftptest txt
rename SimpleName MethodInvocation StringLiteral targetsftptest txt
rename SimpleName MethodInvocation StringLiteral targetsftptest txt
targetsftptest txt StringLiteral MethodInvocation StringLiteral targetsftptest txt
fail SimpleName MethodInvocation StringLiteral expected an sftp exception
orgapachesshdclientsftp exception QualifiedName SimpleType SingleVariableDeclaration SimpleName e
e SimpleName MethodInvocation SimpleName get status
assert equals SimpleName MethodInvocation QualifiedName default sftp clientssh fx no such file
assert equals SimpleName MethodInvocation MethodInvocation SimpleName e
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get status
default sftp clientssh fx no such file QualifiedName MethodInvocation MethodInvocation SimpleName e
default sftp clientssh fx no such file QualifiedName MethodInvocation MethodInvocation SimpleName get status
sftp SimpleName MethodInvocation SimpleName write
sftp SimpleName MethodInvocation StringLiteral targetsftptest txt
write SimpleName MethodInvocation StringLiteral targetsftptest txt
os SimpleName VariableDeclarationFragment MethodInvocation SimpleName sftp
os SimpleName VariableDeclarationFragment MethodInvocation SimpleName write
os SimpleName VariableDeclarationFragment MethodInvocation StringLiteral targetsftptest txt
output stream SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName os
h StringLiteral MethodInvocation SimpleName get bytes
os SimpleName MethodInvocation SimpleName write
os SimpleName MethodInvocation MethodInvocation StringLiteral h
os SimpleName MethodInvocation MethodInvocation SimpleName get bytes
write SimpleName MethodInvocation MethodInvocation StringLiteral h
write SimpleName MethodInvocation MethodInvocation SimpleName get bytes
sftp SimpleName MethodInvocation SimpleName rename
sftp SimpleName MethodInvocation StringLiteral targetsftptesttxt
sftp SimpleName MethodInvocation StringLiteral targetsftptest txt
rename SimpleName MethodInvocation StringLiteral targetsftptesttxt
rename SimpleName MethodInvocation StringLiteral targetsftptest txt
targetsftptesttxt StringLiteral MethodInvocation StringLiteral targetsftptest txt
fail SimpleName MethodInvocation StringLiteral expected an sftp exception
orgapachesshdclientsftp exception QualifiedName SimpleType SingleVariableDeclaration SimpleName e
e SimpleName MethodInvocation SimpleName get status
assert equals SimpleName MethodInvocation QualifiedName default sftp clientssh fx file already exists
assert equals SimpleName MethodInvocation MethodInvocation SimpleName e
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get status
default sftp clientssh fx file already exists QualifiedName MethodInvocation MethodInvocation SimpleName e
default sftp clientssh fx file already exists QualifiedName MethodInvocation MethodInvocation SimpleName get status
sftp SimpleName MethodInvocation SimpleName rename
sftp SimpleName MethodInvocation StringLiteral targetsftptesttxt
sftp SimpleName MethodInvocation StringLiteral targetsftptest txt
sftp SimpleName MethodInvocation QualifiedName sftp clientcopy modeoverwrite
rename SimpleName MethodInvocation StringLiteral targetsftptesttxt
rename SimpleName MethodInvocation StringLiteral targetsftptest txt
rename SimpleName MethodInvocation QualifiedName sftp clientcopy modeoverwrite
targetsftptesttxt StringLiteral MethodInvocation StringLiteral targetsftptest txt
targetsftptesttxt StringLiteral MethodInvocation QualifiedName sftp clientcopy modeoverwrite
targetsftptest txt StringLiteral MethodInvocation QualifiedName sftp clientcopy modeoverwrite
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test rename
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test rename
public Modifier MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration SimpleName test rename
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
test rename SimpleName MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test rename
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test rename
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
