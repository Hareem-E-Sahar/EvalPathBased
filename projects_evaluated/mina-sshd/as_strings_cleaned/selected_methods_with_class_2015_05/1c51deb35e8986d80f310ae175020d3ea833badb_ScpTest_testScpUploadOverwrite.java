ssh client SimpleName MethodInvocation SimpleName set up default client
client SimpleName VariableDeclarationFragment MethodInvocation SimpleName ssh client
client SimpleName VariableDeclarationFragment MethodInvocation SimpleName set up default client
ssh client SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName client
client SimpleName MethodInvocation SimpleName start
client SimpleName MethodInvocation SimpleName connect
client SimpleName MethodInvocation StringLiteral test
client SimpleName MethodInvocation StringLiteral localhost
client SimpleName MethodInvocation SimpleName port
connect SimpleName MethodInvocation StringLiteral test
connect SimpleName MethodInvocation StringLiteral localhost
connect SimpleName MethodInvocation SimpleName port
test StringLiteral MethodInvocation StringLiteral localhost
test StringLiteral MethodInvocation SimpleName port
localhost StringLiteral MethodInvocation SimpleName port
client SimpleName MethodInvocation MethodInvocation SimpleName await
connect SimpleName MethodInvocation MethodInvocation SimpleName await
test StringLiteral MethodInvocation MethodInvocation SimpleName await
localhost StringLiteral MethodInvocation MethodInvocation SimpleName await
port SimpleName MethodInvocation MethodInvocation SimpleName await
client SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get session
connect SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get session
test StringLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName get session
localhost StringLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName get session
port SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get session
await SimpleName MethodInvocation MethodInvocation SimpleName get session
session SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName await
session SimpleName VariableDeclarationFragment MethodInvocation SimpleName get session
client session SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName session
session SimpleName MethodInvocation SimpleName add password identity
session SimpleName MethodInvocation StringLiteral test
add password identity SimpleName MethodInvocation StringLiteral test
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
create scp client SimpleName MethodInvocation SimpleName session
scp SimpleName VariableDeclarationFragment MethodInvocation SimpleName create scp client
scp SimpleName VariableDeclarationFragment MethodInvocation SimpleName session
scp client SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName scp
data SimpleName VariableDeclarationFragment StringLiteral empty
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName data
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment StringLiteral empty
file SimpleName SimpleType ClassInstanceCreation StringLiteral targetscp
root SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName file
root SimpleName VariableDeclarationFragment ClassInstanceCreation StringLiteral targetscp
file SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName root
utils SimpleName MethodInvocation SimpleName delete recursive
utils SimpleName MethodInvocation SimpleName root
delete recursive SimpleName MethodInvocation SimpleName root
root SimpleName MethodInvocation SimpleName mkdirs
file SimpleName SimpleType ClassInstanceCreation SimpleName root
file SimpleName SimpleType ClassInstanceCreation StringLiteral local
root SimpleName ClassInstanceCreation StringLiteral local
file SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName mkdirs
root SimpleName ClassInstanceCreation MethodInvocation SimpleName mkdirs
local StringLiteral ClassInstanceCreation MethodInvocation SimpleName mkdirs
root SimpleName MethodInvocation SimpleName exists
assert true SimpleName MethodInvocation MethodInvocation SimpleName root
assert true SimpleName MethodInvocation MethodInvocation SimpleName exists
file SimpleName SimpleType ClassInstanceCreation SimpleName root
file SimpleName SimpleType ClassInstanceCreation StringLiteral remote
root SimpleName ClassInstanceCreation StringLiteral remote
file SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName mkdirs
root SimpleName ClassInstanceCreation MethodInvocation SimpleName mkdirs
remote StringLiteral ClassInstanceCreation MethodInvocation SimpleName mkdirs
file SimpleName SimpleType ClassInstanceCreation StringLiteral targetscpremoteouttxt
data SimpleName InfixExpression SimpleName data
write file SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName file
write file SimpleName MethodInvocation ClassInstanceCreation StringLiteral targetscpremoteouttxt
write file SimpleName MethodInvocation InfixExpression SimpleName data
write file SimpleName MethodInvocation InfixExpression SimpleName data
targetscpremoteouttxt StringLiteral ClassInstanceCreation MethodInvocation InfixExpression SimpleName data
targetscpremoteouttxt StringLiteral ClassInstanceCreation MethodInvocation InfixExpression SimpleName data
file SimpleName SimpleType ClassInstanceCreation StringLiteral targetscplocalouttxt
write file SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName file
write file SimpleName MethodInvocation ClassInstanceCreation StringLiteral targetscplocalouttxt
write file SimpleName MethodInvocation SimpleName data
file SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName data
targetscplocalouttxt StringLiteral ClassInstanceCreation MethodInvocation SimpleName data
scp SimpleName MethodInvocation SimpleName upload
scp SimpleName MethodInvocation StringLiteral targetscplocalouttxt
scp SimpleName MethodInvocation StringLiteral targetscpremoteouttxt
upload SimpleName MethodInvocation StringLiteral targetscplocalouttxt
upload SimpleName MethodInvocation StringLiteral targetscpremoteouttxt
targetscplocalouttxt StringLiteral MethodInvocation StringLiteral targetscpremoteouttxt
file SimpleName SimpleType ClassInstanceCreation StringLiteral targetscpremoteouttxt
data SimpleName MethodInvocation SimpleName length
assert file length SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName file
assert file length SimpleName MethodInvocation ClassInstanceCreation StringLiteral targetscpremoteouttxt
assert file length SimpleName MethodInvocation MethodInvocation SimpleName data
assert file length SimpleName MethodInvocation MethodInvocation SimpleName length
assert file length SimpleName MethodInvocation NumberLiteral empty
targetscpremoteouttxt StringLiteral ClassInstanceCreation MethodInvocation MethodInvocation SimpleName data
targetscpremoteouttxt StringLiteral ClassInstanceCreation MethodInvocation MethodInvocation SimpleName length
file SimpleName SimpleType ClassInstanceCreation MethodInvocation NumberLiteral empty
targetscpremoteouttxt StringLiteral ClassInstanceCreation MethodInvocation NumberLiteral empty
data SimpleName MethodInvocation MethodInvocation NumberLiteral empty
length SimpleName MethodInvocation MethodInvocation NumberLiteral empty
client SimpleName MethodInvocation SimpleName stop
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test scp upload overwrite
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test scp upload overwrite
public Modifier MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration SimpleName test scp upload overwrite
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
test scp upload overwrite SimpleName MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test scp upload overwrite
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test scp upload overwrite
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
