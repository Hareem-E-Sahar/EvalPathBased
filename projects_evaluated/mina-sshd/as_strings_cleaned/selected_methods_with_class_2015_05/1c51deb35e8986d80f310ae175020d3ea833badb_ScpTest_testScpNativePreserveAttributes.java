os utils SimpleName MethodInvocation SimpleName is win
assume SimpleName MethodInvocation SimpleName assume false
assume SimpleName MethodInvocation StringLiteral skip test for windows
assume SimpleName MethodInvocation MethodInvocation SimpleName os utils
assume SimpleName MethodInvocation MethodInvocation SimpleName is win
assume false SimpleName MethodInvocation StringLiteral skip test for windows
assume false SimpleName MethodInvocation MethodInvocation SimpleName os utils
assume false SimpleName MethodInvocation MethodInvocation SimpleName is win
skip test for windows StringLiteral MethodInvocation MethodInvocation SimpleName os utils
skip test for windows StringLiteral MethodInvocation MethodInvocation SimpleName is win
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
file SimpleName SimpleType ClassInstanceCreation SimpleName root
file SimpleName SimpleType ClassInstanceCreation StringLiteral remote
root SimpleName ClassInstanceCreation StringLiteral remote
file SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName mkdirs
root SimpleName ClassInstanceCreation MethodInvocation SimpleName mkdirs
remote StringLiteral ClassInstanceCreation MethodInvocation SimpleName mkdirs
root SimpleName MethodInvocation SimpleName exists
assert true SimpleName MethodInvocation MethodInvocation SimpleName root
assert true SimpleName MethodInvocation MethodInvocation SimpleName exists
file SimpleName SimpleType ClassInstanceCreation StringLiteral targetscplocaldir
file SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName mkdirs
targetscplocaldir StringLiteral ClassInstanceCreation MethodInvocation SimpleName mkdirs
file SimpleName SimpleType ClassInstanceCreation StringLiteral targetscplocaldir
file SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName last modified
targetscplocaldir StringLiteral ClassInstanceCreation MethodInvocation SimpleName last modified
time unitdays QualifiedName MethodInvocation SimpleName to millis
time unitdays QualifiedName MethodInvocation NumberLiteral empty
to millis SimpleName MethodInvocation NumberLiteral empty
last modified SimpleName MethodInvocation InfixExpression MethodInvocation QualifiedName time unitdays
last modified SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName to millis
last modified SimpleName MethodInvocation InfixExpression MethodInvocation NumberLiteral empty
last mod SimpleName VariableDeclarationFragment InfixExpression MethodInvocation SimpleName last modified
last mod SimpleName VariableDeclarationFragment InfixExpression MethodInvocation QualifiedName time unitdays
last mod SimpleName VariableDeclarationFragment InfixExpression MethodInvocation SimpleName to millis
last mod SimpleName VariableDeclarationFragment InfixExpression MethodInvocation NumberLiteral empty
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName last mod
file SimpleName SimpleType ClassInstanceCreation StringLiteral targetscplocalout txt
write file SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName file
write file SimpleName MethodInvocation ClassInstanceCreation StringLiteral targetscplocalout txt
write file SimpleName MethodInvocation SimpleName data
file SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName data
targetscplocalout txt StringLiteral ClassInstanceCreation MethodInvocation SimpleName data
file SimpleName SimpleType ClassInstanceCreation StringLiteral targetscplocaldirout txt
write file SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName file
write file SimpleName MethodInvocation ClassInstanceCreation StringLiteral targetscplocaldirout txt
write file SimpleName MethodInvocation SimpleName data
file SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName data
targetscplocaldirout txt StringLiteral ClassInstanceCreation MethodInvocation SimpleName data
file SimpleName SimpleType ClassInstanceCreation StringLiteral targetscplocalout txt
file SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName set last modified
targetscplocalout txt StringLiteral ClassInstanceCreation MethodInvocation SimpleName set last modified
file SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName last mod
targetscplocalout txt StringLiteral ClassInstanceCreation MethodInvocation SimpleName last mod
set last modified SimpleName MethodInvocation SimpleName last mod
file SimpleName SimpleType ClassInstanceCreation StringLiteral targetscplocalout txt
file SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName set executable
targetscplocalout txt StringLiteral ClassInstanceCreation MethodInvocation SimpleName set executable
file SimpleName SimpleType ClassInstanceCreation MethodInvocation BooleanLiteral true
targetscplocalout txt StringLiteral ClassInstanceCreation MethodInvocation BooleanLiteral true
file SimpleName SimpleType ClassInstanceCreation MethodInvocation BooleanLiteral true
targetscplocalout txt StringLiteral ClassInstanceCreation MethodInvocation BooleanLiteral true
set executable SimpleName MethodInvocation BooleanLiteral true
set executable SimpleName MethodInvocation BooleanLiteral true
true BooleanLiteral MethodInvocation BooleanLiteral true
file SimpleName SimpleType ClassInstanceCreation StringLiteral targetscplocalout txt
file SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName set writable
targetscplocalout txt StringLiteral ClassInstanceCreation MethodInvocation SimpleName set writable
file SimpleName SimpleType ClassInstanceCreation MethodInvocation BooleanLiteral false
targetscplocalout txt StringLiteral ClassInstanceCreation MethodInvocation BooleanLiteral false
file SimpleName SimpleType ClassInstanceCreation MethodInvocation BooleanLiteral false
targetscplocalout txt StringLiteral ClassInstanceCreation MethodInvocation BooleanLiteral false
set writable SimpleName MethodInvocation BooleanLiteral false
set writable SimpleName MethodInvocation BooleanLiteral false
false BooleanLiteral MethodInvocation BooleanLiteral false
file SimpleName SimpleType ClassInstanceCreation StringLiteral targetscplocaldirout txt
file SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName set last modified
targetscplocaldirout txt StringLiteral ClassInstanceCreation MethodInvocation SimpleName set last modified
file SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName last mod
targetscplocaldirout txt StringLiteral ClassInstanceCreation MethodInvocation SimpleName last mod
set last modified SimpleName MethodInvocation SimpleName last mod
scp SimpleName MethodInvocation SimpleName upload
scp SimpleName MethodInvocation StringLiteral targetscplocal
scp SimpleName MethodInvocation StringLiteral targetscpremote
scp SimpleName MethodInvocation QualifiedName scp clientoptionrecursive
scp SimpleName MethodInvocation QualifiedName scp clientoptionpreserve attributes
upload SimpleName MethodInvocation StringLiteral targetscplocal
upload SimpleName MethodInvocation StringLiteral targetscpremote
upload SimpleName MethodInvocation QualifiedName scp clientoptionrecursive
upload SimpleName MethodInvocation QualifiedName scp clientoptionpreserve attributes
targetscplocal StringLiteral MethodInvocation StringLiteral targetscpremote
targetscplocal StringLiteral MethodInvocation QualifiedName scp clientoptionrecursive
targetscplocal StringLiteral MethodInvocation QualifiedName scp clientoptionpreserve attributes
targetscpremote StringLiteral MethodInvocation QualifiedName scp clientoptionrecursive
targetscpremote StringLiteral MethodInvocation QualifiedName scp clientoptionpreserve attributes
scp clientoptionrecursive QualifiedName MethodInvocation QualifiedName scp clientoptionpreserve attributes
file SimpleName SimpleType ClassInstanceCreation StringLiteral targetscpremoteout txt
data SimpleName MethodInvocation SimpleName length
assert file length SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName file
assert file length SimpleName MethodInvocation ClassInstanceCreation StringLiteral targetscpremoteout txt
assert file length SimpleName MethodInvocation MethodInvocation SimpleName data
assert file length SimpleName MethodInvocation MethodInvocation SimpleName length
assert file length SimpleName MethodInvocation NumberLiteral empty
targetscpremoteout txt StringLiteral ClassInstanceCreation MethodInvocation MethodInvocation SimpleName data
targetscpremoteout txt StringLiteral ClassInstanceCreation MethodInvocation MethodInvocation SimpleName length
file SimpleName SimpleType ClassInstanceCreation MethodInvocation NumberLiteral empty
targetscpremoteout txt StringLiteral ClassInstanceCreation MethodInvocation NumberLiteral empty
data SimpleName MethodInvocation MethodInvocation NumberLiteral empty
length SimpleName MethodInvocation MethodInvocation NumberLiteral empty
file SimpleName SimpleType ClassInstanceCreation StringLiteral targetscpremoteout txt
file SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName last modified
targetscpremoteout txt StringLiteral ClassInstanceCreation MethodInvocation SimpleName last modified
assert equals SimpleName MethodInvocation SimpleName last mod
assert equals SimpleName MethodInvocation MethodInvocation ClassInstanceCreation StringLiteral targetscpremoteout txt
assert equals SimpleName MethodInvocation MethodInvocation SimpleName last modified
last mod SimpleName MethodInvocation MethodInvocation ClassInstanceCreation StringLiteral targetscpremoteout txt
last mod SimpleName MethodInvocation MethodInvocation SimpleName last modified
file SimpleName SimpleType ClassInstanceCreation StringLiteral targetscpremotedirout txt
data SimpleName MethodInvocation SimpleName length
assert file length SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName file
assert file length SimpleName MethodInvocation ClassInstanceCreation StringLiteral targetscpremotedirout txt
assert file length SimpleName MethodInvocation MethodInvocation SimpleName data
assert file length SimpleName MethodInvocation MethodInvocation SimpleName length
assert file length SimpleName MethodInvocation NumberLiteral empty
targetscpremotedirout txt StringLiteral ClassInstanceCreation MethodInvocation MethodInvocation SimpleName data
targetscpremotedirout txt StringLiteral ClassInstanceCreation MethodInvocation MethodInvocation SimpleName length
file SimpleName SimpleType ClassInstanceCreation MethodInvocation NumberLiteral empty
targetscpremotedirout txt StringLiteral ClassInstanceCreation MethodInvocation NumberLiteral empty
data SimpleName MethodInvocation MethodInvocation NumberLiteral empty
length SimpleName MethodInvocation MethodInvocation NumberLiteral empty
file SimpleName SimpleType ClassInstanceCreation StringLiteral targetscpremotedirout txt
file SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName last modified
targetscpremotedirout txt StringLiteral ClassInstanceCreation MethodInvocation SimpleName last modified
assert equals SimpleName MethodInvocation SimpleName last mod
assert equals SimpleName MethodInvocation MethodInvocation ClassInstanceCreation StringLiteral targetscpremotedirout txt
assert equals SimpleName MethodInvocation MethodInvocation SimpleName last modified
last mod SimpleName MethodInvocation MethodInvocation ClassInstanceCreation StringLiteral targetscpremotedirout txt
last mod SimpleName MethodInvocation MethodInvocation SimpleName last modified
file SimpleName SimpleType ClassInstanceCreation StringLiteral targetscplocal
utils SimpleName MethodInvocation SimpleName delete recursive
utils SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName file
utils SimpleName MethodInvocation ClassInstanceCreation StringLiteral targetscplocal
delete recursive SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName file
delete recursive SimpleName MethodInvocation ClassInstanceCreation StringLiteral targetscplocal
file SimpleName SimpleType ClassInstanceCreation StringLiteral targetscplocal
file SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName mkdirs
targetscplocal StringLiteral ClassInstanceCreation MethodInvocation SimpleName mkdirs
scp SimpleName MethodInvocation SimpleName download
scp SimpleName MethodInvocation StringLiteral targetscpremote
scp SimpleName MethodInvocation StringLiteral targetscplocal
scp SimpleName MethodInvocation QualifiedName scp clientoptionrecursive
scp SimpleName MethodInvocation QualifiedName scp clientoptionpreserve attributes
download SimpleName MethodInvocation StringLiteral targetscpremote
download SimpleName MethodInvocation StringLiteral targetscplocal
download SimpleName MethodInvocation QualifiedName scp clientoptionrecursive
download SimpleName MethodInvocation QualifiedName scp clientoptionpreserve attributes
targetscpremote StringLiteral MethodInvocation StringLiteral targetscplocal
targetscpremote StringLiteral MethodInvocation QualifiedName scp clientoptionrecursive
targetscpremote StringLiteral MethodInvocation QualifiedName scp clientoptionpreserve attributes
targetscplocal StringLiteral MethodInvocation QualifiedName scp clientoptionrecursive
targetscplocal StringLiteral MethodInvocation QualifiedName scp clientoptionpreserve attributes
scp clientoptionrecursive QualifiedName MethodInvocation QualifiedName scp clientoptionpreserve attributes
file SimpleName SimpleType ClassInstanceCreation StringLiteral targetscplocalout txt
data SimpleName MethodInvocation SimpleName length
assert file length SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName file
assert file length SimpleName MethodInvocation ClassInstanceCreation StringLiteral targetscplocalout txt
assert file length SimpleName MethodInvocation MethodInvocation SimpleName data
assert file length SimpleName MethodInvocation MethodInvocation SimpleName length
assert file length SimpleName MethodInvocation NumberLiteral empty
targetscplocalout txt StringLiteral ClassInstanceCreation MethodInvocation MethodInvocation SimpleName data
targetscplocalout txt StringLiteral ClassInstanceCreation MethodInvocation MethodInvocation SimpleName length
file SimpleName SimpleType ClassInstanceCreation MethodInvocation NumberLiteral empty
targetscplocalout txt StringLiteral ClassInstanceCreation MethodInvocation NumberLiteral empty
data SimpleName MethodInvocation MethodInvocation NumberLiteral empty
length SimpleName MethodInvocation MethodInvocation NumberLiteral empty
file SimpleName SimpleType ClassInstanceCreation StringLiteral targetscplocalout txt
file SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName last modified
targetscplocalout txt StringLiteral ClassInstanceCreation MethodInvocation SimpleName last modified
assert equals SimpleName MethodInvocation SimpleName last mod
assert equals SimpleName MethodInvocation MethodInvocation ClassInstanceCreation StringLiteral targetscplocalout txt
assert equals SimpleName MethodInvocation MethodInvocation SimpleName last modified
last mod SimpleName MethodInvocation MethodInvocation ClassInstanceCreation StringLiteral targetscplocalout txt
last mod SimpleName MethodInvocation MethodInvocation SimpleName last modified
file SimpleName SimpleType ClassInstanceCreation StringLiteral targetscplocaldirout txt
data SimpleName MethodInvocation SimpleName length
assert file length SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName file
assert file length SimpleName MethodInvocation ClassInstanceCreation StringLiteral targetscplocaldirout txt
assert file length SimpleName MethodInvocation MethodInvocation SimpleName data
assert file length SimpleName MethodInvocation MethodInvocation SimpleName length
assert file length SimpleName MethodInvocation NumberLiteral empty
targetscplocaldirout txt StringLiteral ClassInstanceCreation MethodInvocation MethodInvocation SimpleName data
targetscplocaldirout txt StringLiteral ClassInstanceCreation MethodInvocation MethodInvocation SimpleName length
file SimpleName SimpleType ClassInstanceCreation MethodInvocation NumberLiteral empty
targetscplocaldirout txt StringLiteral ClassInstanceCreation MethodInvocation NumberLiteral empty
data SimpleName MethodInvocation MethodInvocation NumberLiteral empty
length SimpleName MethodInvocation MethodInvocation NumberLiteral empty
file SimpleName SimpleType ClassInstanceCreation StringLiteral targetscplocaldirout txt
file SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName last modified
targetscplocaldirout txt StringLiteral ClassInstanceCreation MethodInvocation SimpleName last modified
assert equals SimpleName MethodInvocation SimpleName last mod
assert equals SimpleName MethodInvocation MethodInvocation ClassInstanceCreation StringLiteral targetscplocaldirout txt
assert equals SimpleName MethodInvocation MethodInvocation SimpleName last modified
last mod SimpleName MethodInvocation MethodInvocation ClassInstanceCreation StringLiteral targetscplocaldirout txt
last mod SimpleName MethodInvocation MethodInvocation SimpleName last modified
client SimpleName MethodInvocation SimpleName stop
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test scp native preserve attributes
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test scp native preserve attributes
public Modifier MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration SimpleName test scp native preserve attributes
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
test scp native preserve attributes SimpleName MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test scp native preserve attributes
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test scp native preserve attributes
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
