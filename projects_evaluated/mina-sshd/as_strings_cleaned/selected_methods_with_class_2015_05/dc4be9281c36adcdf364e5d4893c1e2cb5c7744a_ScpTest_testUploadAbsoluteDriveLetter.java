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
file SimpleName SimpleType ClassInstanceCreation SimpleName root
file SimpleName SimpleType ClassInstanceCreation StringLiteral local
root SimpleName ClassInstanceCreation StringLiteral local
assert hierarchy target folder exists SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName file
assert hierarchy target folder exists SimpleName MethodInvocation ClassInstanceCreation SimpleName root
assert hierarchy target folder exists SimpleName MethodInvocation ClassInstanceCreation StringLiteral local
local dir SimpleName VariableDeclarationFragment MethodInvocation SimpleName assert hierarchy target folder exists
local dir SimpleName VariableDeclarationFragment MethodInvocation ClassInstanceCreation SimpleName root
local dir SimpleName VariableDeclarationFragment MethodInvocation ClassInstanceCreation StringLiteral local
file SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName local dir
root SimpleName MethodInvocation SimpleName exists
assert true SimpleName MethodInvocation StringLiteral root folder not created
assert true SimpleName MethodInvocation MethodInvocation SimpleName root
assert true SimpleName MethodInvocation MethodInvocation SimpleName exists
root folder not created StringLiteral MethodInvocation MethodInvocation SimpleName root
root folder not created StringLiteral MethodInvocation MethodInvocation SimpleName exists
file SimpleName SimpleType ClassInstanceCreation SimpleName local dir
file SimpleName SimpleType ClassInstanceCreation StringLiteral outtxt
local dir SimpleName ClassInstanceCreation StringLiteral outtxt
local file SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName file
local file SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName local dir
local file SimpleName VariableDeclarationFragment ClassInstanceCreation StringLiteral outtxt
file SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName local file
write file SimpleName MethodInvocation SimpleName local file
write file SimpleName MethodInvocation SimpleName data
local file SimpleName MethodInvocation SimpleName data
file SimpleName SimpleType ClassInstanceCreation SimpleName root
file SimpleName SimpleType ClassInstanceCreation StringLiteral remote
root SimpleName ClassInstanceCreation StringLiteral remote
assert hierarchy target folder exists SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName file
assert hierarchy target folder exists SimpleName MethodInvocation ClassInstanceCreation SimpleName root
assert hierarchy target folder exists SimpleName MethodInvocation ClassInstanceCreation StringLiteral remote
remote dir SimpleName VariableDeclarationFragment MethodInvocation SimpleName assert hierarchy target folder exists
remote dir SimpleName VariableDeclarationFragment MethodInvocation ClassInstanceCreation SimpleName root
remote dir SimpleName VariableDeclarationFragment MethodInvocation ClassInstanceCreation StringLiteral remote
file SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName remote dir
file SimpleName SimpleType ClassInstanceCreation SimpleName remote dir
file SimpleName SimpleType ClassInstanceCreation StringLiteral outtxt
remote dir SimpleName ClassInstanceCreation StringLiteral outtxt
remote file SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName file
remote file SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName remote dir
remote file SimpleName VariableDeclarationFragment ClassInstanceCreation StringLiteral outtxt
file SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName remote file
local file SimpleName MethodInvocation SimpleName get absolute path
remote file SimpleName MethodInvocation SimpleName get absolute path
remote file SimpleName MethodInvocation MethodInvocation SimpleName replace
get absolute path SimpleName MethodInvocation MethodInvocation SimpleName replace
remote file SimpleName MethodInvocation MethodInvocation QualifiedName fileseparator char
get absolute path SimpleName MethodInvocation MethodInvocation QualifiedName fileseparator char
remote file SimpleName MethodInvocation MethodInvocation CharacterLiteral /
get absolute path SimpleName MethodInvocation MethodInvocation CharacterLiteral /
replace SimpleName MethodInvocation QualifiedName fileseparator char
replace SimpleName MethodInvocation CharacterLiteral /
fileseparator char QualifiedName MethodInvocation CharacterLiteral /
scp SimpleName MethodInvocation SimpleName upload
scp SimpleName MethodInvocation MethodInvocation SimpleName local file
scp SimpleName MethodInvocation MethodInvocation SimpleName get absolute path
scp SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName remote file
scp SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get absolute path
scp SimpleName MethodInvocation MethodInvocation SimpleName replace
scp SimpleName MethodInvocation MethodInvocation QualifiedName fileseparator char
scp SimpleName MethodInvocation MethodInvocation CharacterLiteral /
upload SimpleName MethodInvocation MethodInvocation SimpleName local file
upload SimpleName MethodInvocation MethodInvocation SimpleName get absolute path
upload SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName remote file
upload SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get absolute path
upload SimpleName MethodInvocation MethodInvocation SimpleName replace
upload SimpleName MethodInvocation MethodInvocation QualifiedName fileseparator char
upload SimpleName MethodInvocation MethodInvocation CharacterLiteral /
local file SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName replace
local file SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName fileseparator char
local file SimpleName MethodInvocation MethodInvocation MethodInvocation CharacterLiteral /
get absolute path SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName replace
get absolute path SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName fileseparator char
get absolute path SimpleName MethodInvocation MethodInvocation MethodInvocation CharacterLiteral /
data SimpleName MethodInvocation SimpleName length
assert file length SimpleName MethodInvocation SimpleName remote file
assert file length SimpleName MethodInvocation MethodInvocation SimpleName data
assert file length SimpleName MethodInvocation MethodInvocation SimpleName length
assert file length SimpleName MethodInvocation NumberLiteral empty
remote file SimpleName MethodInvocation MethodInvocation SimpleName data
remote file SimpleName MethodInvocation MethodInvocation SimpleName length
remote file SimpleName MethodInvocation NumberLiteral empty
data SimpleName MethodInvocation MethodInvocation NumberLiteral empty
length SimpleName MethodInvocation MethodInvocation NumberLiteral empty
file SimpleName SimpleType ClassInstanceCreation SimpleName remote dir
file SimpleName SimpleType ClassInstanceCreation StringLiteral out txt
remote dir SimpleName ClassInstanceCreation StringLiteral out txt
second remote SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName file
second remote SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName remote dir
second remote SimpleName VariableDeclarationFragment ClassInstanceCreation StringLiteral out txt
file SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName second remote
local file SimpleName MethodInvocation SimpleName get absolute path
second remote SimpleName MethodInvocation SimpleName get absolute path
second remote SimpleName MethodInvocation MethodInvocation SimpleName replace
get absolute path SimpleName MethodInvocation MethodInvocation SimpleName replace
second remote SimpleName MethodInvocation MethodInvocation QualifiedName fileseparator char
get absolute path SimpleName MethodInvocation MethodInvocation QualifiedName fileseparator char
second remote SimpleName MethodInvocation MethodInvocation CharacterLiteral /
get absolute path SimpleName MethodInvocation MethodInvocation CharacterLiteral /
replace SimpleName MethodInvocation QualifiedName fileseparator char
replace SimpleName MethodInvocation CharacterLiteral /
fileseparator char QualifiedName MethodInvocation CharacterLiteral /
scp SimpleName MethodInvocation SimpleName upload
scp SimpleName MethodInvocation MethodInvocation SimpleName local file
scp SimpleName MethodInvocation MethodInvocation SimpleName get absolute path
scp SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName second remote
scp SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get absolute path
scp SimpleName MethodInvocation MethodInvocation SimpleName replace
scp SimpleName MethodInvocation MethodInvocation QualifiedName fileseparator char
scp SimpleName MethodInvocation MethodInvocation CharacterLiteral /
upload SimpleName MethodInvocation MethodInvocation SimpleName local file
upload SimpleName MethodInvocation MethodInvocation SimpleName get absolute path
upload SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName second remote
upload SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get absolute path
upload SimpleName MethodInvocation MethodInvocation SimpleName replace
upload SimpleName MethodInvocation MethodInvocation QualifiedName fileseparator char
upload SimpleName MethodInvocation MethodInvocation CharacterLiteral /
local file SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName replace
local file SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName fileseparator char
local file SimpleName MethodInvocation MethodInvocation MethodInvocation CharacterLiteral /
get absolute path SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName replace
get absolute path SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName fileseparator char
get absolute path SimpleName MethodInvocation MethodInvocation MethodInvocation CharacterLiteral /
data SimpleName MethodInvocation SimpleName length
assert file length SimpleName MethodInvocation SimpleName second remote
assert file length SimpleName MethodInvocation MethodInvocation SimpleName data
assert file length SimpleName MethodInvocation MethodInvocation SimpleName length
assert file length SimpleName MethodInvocation NumberLiteral empty
second remote SimpleName MethodInvocation MethodInvocation SimpleName data
second remote SimpleName MethodInvocation MethodInvocation SimpleName length
second remote SimpleName MethodInvocation NumberLiteral empty
data SimpleName MethodInvocation MethodInvocation NumberLiteral empty
length SimpleName MethodInvocation MethodInvocation NumberLiteral empty
file SimpleName SimpleType ClassInstanceCreation SimpleName remote dir
file SimpleName SimpleType ClassInstanceCreation StringLiteral pathtxt
remote dir SimpleName ClassInstanceCreation StringLiteral pathtxt
path remote SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName file
path remote SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName remote dir
path remote SimpleName VariableDeclarationFragment ClassInstanceCreation StringLiteral pathtxt
file SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName path remote
local file SimpleName MethodInvocation SimpleName to path
path remote SimpleName MethodInvocation SimpleName get absolute path
path remote SimpleName MethodInvocation MethodInvocation SimpleName replace
get absolute path SimpleName MethodInvocation MethodInvocation SimpleName replace
path remote SimpleName MethodInvocation MethodInvocation QualifiedName fileseparator char
get absolute path SimpleName MethodInvocation MethodInvocation QualifiedName fileseparator char
path remote SimpleName MethodInvocation MethodInvocation CharacterLiteral /
get absolute path SimpleName MethodInvocation MethodInvocation CharacterLiteral /
replace SimpleName MethodInvocation QualifiedName fileseparator char
replace SimpleName MethodInvocation CharacterLiteral /
fileseparator char QualifiedName MethodInvocation CharacterLiteral /
scp SimpleName MethodInvocation SimpleName upload
scp SimpleName MethodInvocation MethodInvocation SimpleName local file
scp SimpleName MethodInvocation MethodInvocation SimpleName to path
scp SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName path remote
scp SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get absolute path
scp SimpleName MethodInvocation MethodInvocation SimpleName replace
scp SimpleName MethodInvocation MethodInvocation QualifiedName fileseparator char
scp SimpleName MethodInvocation MethodInvocation CharacterLiteral /
upload SimpleName MethodInvocation MethodInvocation SimpleName local file
upload SimpleName MethodInvocation MethodInvocation SimpleName to path
upload SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName path remote
upload SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get absolute path
upload SimpleName MethodInvocation MethodInvocation SimpleName replace
upload SimpleName MethodInvocation MethodInvocation QualifiedName fileseparator char
upload SimpleName MethodInvocation MethodInvocation CharacterLiteral /
local file SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName replace
local file SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName fileseparator char
local file SimpleName MethodInvocation MethodInvocation MethodInvocation CharacterLiteral /
to path SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName replace
to path SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName fileseparator char
to path SimpleName MethodInvocation MethodInvocation MethodInvocation CharacterLiteral /
data SimpleName MethodInvocation SimpleName length
assert file length SimpleName MethodInvocation SimpleName path remote
assert file length SimpleName MethodInvocation MethodInvocation SimpleName data
assert file length SimpleName MethodInvocation MethodInvocation SimpleName length
assert file length SimpleName MethodInvocation NumberLiteral empty
path remote SimpleName MethodInvocation MethodInvocation SimpleName data
path remote SimpleName MethodInvocation MethodInvocation SimpleName length
path remote SimpleName MethodInvocation NumberLiteral empty
data SimpleName MethodInvocation MethodInvocation NumberLiteral empty
length SimpleName MethodInvocation MethodInvocation NumberLiteral empty
client SimpleName MethodInvocation SimpleName stop
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test upload absolute drive letter
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test upload absolute drive letter
public Modifier MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration SimpleName test upload absolute drive letter
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
test upload absolute drive letter SimpleName MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test upload absolute drive letter
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test upload absolute drive letter
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
