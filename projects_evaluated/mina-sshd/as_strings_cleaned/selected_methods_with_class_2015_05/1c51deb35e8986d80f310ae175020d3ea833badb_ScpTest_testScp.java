session SimpleName Assignment MethodInvocation SimpleName get jsch session
data SimpleName VariableDeclarationFragment StringLiteral empty
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName data
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment StringLiteral empty
unix dir SimpleName VariableDeclarationFragment StringLiteral targetscp
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName unix dir
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment StringLiteral targetscp
file name SimpleName VariableDeclarationFragment StringLiteral outtxt
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName file name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment StringLiteral outtxt
unix dir SimpleName InfixExpression QualifiedName fileseparator
unix dir SimpleName InfixExpression SimpleName file name
fileseparator QualifiedName InfixExpression SimpleName file name
unix path SimpleName VariableDeclarationFragment InfixExpression SimpleName unix dir
unix path SimpleName VariableDeclarationFragment InfixExpression QualifiedName fileseparator
unix path SimpleName VariableDeclarationFragment InfixExpression SimpleName file name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName unix path
file SimpleName SimpleType ClassInstanceCreation SimpleName unix dir
root SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName file
root SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName unix dir
file SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName root
file SimpleName SimpleType ClassInstanceCreation SimpleName unix path
target SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName file
target SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName unix path
file SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName target
utils SimpleName MethodInvocation SimpleName delete recursive
utils SimpleName MethodInvocation SimpleName root
delete recursive SimpleName MethodInvocation SimpleName root
root SimpleName MethodInvocation SimpleName mkdirs
root SimpleName MethodInvocation SimpleName exists
assert true SimpleName MethodInvocation MethodInvocation SimpleName root
assert true SimpleName MethodInvocation MethodInvocation SimpleName exists
target SimpleName MethodInvocation SimpleName delete
target SimpleName MethodInvocation SimpleName exists
assert false SimpleName MethodInvocation MethodInvocation SimpleName target
assert false SimpleName MethodInvocation MethodInvocation SimpleName exists
send file SimpleName MethodInvocation SimpleName unix path
send file SimpleName MethodInvocation StringLiteral outtxt
send file SimpleName MethodInvocation SimpleName data
unix path SimpleName MethodInvocation StringLiteral outtxt
unix path SimpleName MethodInvocation SimpleName data
outtxt StringLiteral MethodInvocation SimpleName data
data SimpleName MethodInvocation SimpleName length
assert file length SimpleName MethodInvocation SimpleName target
assert file length SimpleName MethodInvocation MethodInvocation SimpleName data
assert file length SimpleName MethodInvocation MethodInvocation SimpleName length
assert file length SimpleName MethodInvocation NumberLiteral empty
target SimpleName MethodInvocation MethodInvocation SimpleName data
target SimpleName MethodInvocation MethodInvocation SimpleName length
target SimpleName MethodInvocation NumberLiteral empty
data SimpleName MethodInvocation MethodInvocation NumberLiteral empty
length SimpleName MethodInvocation MethodInvocation NumberLiteral empty
target SimpleName MethodInvocation SimpleName delete
target SimpleName MethodInvocation SimpleName exists
assert false SimpleName MethodInvocation MethodInvocation SimpleName target
assert false SimpleName MethodInvocation MethodInvocation SimpleName exists
send file SimpleName MethodInvocation SimpleName unix dir
send file SimpleName MethodInvocation StringLiteral outtxt
send file SimpleName MethodInvocation SimpleName data
unix dir SimpleName MethodInvocation StringLiteral outtxt
unix dir SimpleName MethodInvocation SimpleName data
outtxt StringLiteral MethodInvocation SimpleName data
data SimpleName MethodInvocation SimpleName length
assert file length SimpleName MethodInvocation SimpleName target
assert file length SimpleName MethodInvocation MethodInvocation SimpleName data
assert file length SimpleName MethodInvocation MethodInvocation SimpleName length
assert file length SimpleName MethodInvocation NumberLiteral empty
target SimpleName MethodInvocation MethodInvocation SimpleName data
target SimpleName MethodInvocation MethodInvocation SimpleName length
target SimpleName MethodInvocation NumberLiteral empty
data SimpleName MethodInvocation MethodInvocation NumberLiteral empty
length SimpleName MethodInvocation MethodInvocation NumberLiteral empty
send file error SimpleName MethodInvocation StringLiteral target
send file error SimpleName MethodInvocation StringLiteral scp
send file error SimpleName MethodInvocation StringLiteral empty
target StringLiteral MethodInvocation StringLiteral scp
target StringLiteral MethodInvocation StringLiteral empty
scp StringLiteral MethodInvocation StringLiteral empty
read file error SimpleName MethodInvocation SimpleName unix dir
read file SimpleName MethodInvocation SimpleName unix path
assert equals SimpleName MethodInvocation SimpleName data
assert equals SimpleName MethodInvocation MethodInvocation SimpleName read file
assert equals SimpleName MethodInvocation MethodInvocation SimpleName unix path
data SimpleName MethodInvocation MethodInvocation SimpleName read file
data SimpleName MethodInvocation MethodInvocation SimpleName unix path
read dir SimpleName MethodInvocation SimpleName unix dir
assert equals SimpleName MethodInvocation SimpleName data
assert equals SimpleName MethodInvocation MethodInvocation SimpleName read dir
assert equals SimpleName MethodInvocation MethodInvocation SimpleName unix dir
data SimpleName MethodInvocation MethodInvocation SimpleName read dir
data SimpleName MethodInvocation MethodInvocation SimpleName unix dir
target SimpleName MethodInvocation SimpleName delete
root SimpleName MethodInvocation SimpleName delete
send dir SimpleName MethodInvocation StringLiteral target
send dir SimpleName MethodInvocation StringLiteral scp
send dir SimpleName MethodInvocation StringLiteral outtxt
send dir SimpleName MethodInvocation SimpleName data
target StringLiteral MethodInvocation StringLiteral scp
target StringLiteral MethodInvocation StringLiteral outtxt
target StringLiteral MethodInvocation SimpleName data
scp StringLiteral MethodInvocation StringLiteral outtxt
scp StringLiteral MethodInvocation SimpleName data
outtxt StringLiteral MethodInvocation SimpleName data
data SimpleName MethodInvocation SimpleName length
assert file length SimpleName MethodInvocation SimpleName target
assert file length SimpleName MethodInvocation MethodInvocation SimpleName data
assert file length SimpleName MethodInvocation MethodInvocation SimpleName length
assert file length SimpleName MethodInvocation NumberLiteral empty
target SimpleName MethodInvocation MethodInvocation SimpleName data
target SimpleName MethodInvocation MethodInvocation SimpleName length
target SimpleName MethodInvocation NumberLiteral empty
data SimpleName MethodInvocation MethodInvocation NumberLiteral empty
length SimpleName MethodInvocation MethodInvocation NumberLiteral empty
session SimpleName MethodInvocation SimpleName disconnect
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test scp
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test scp
public Modifier MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration SimpleName test scp
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
test scp SimpleName MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test scp
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test scp
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
