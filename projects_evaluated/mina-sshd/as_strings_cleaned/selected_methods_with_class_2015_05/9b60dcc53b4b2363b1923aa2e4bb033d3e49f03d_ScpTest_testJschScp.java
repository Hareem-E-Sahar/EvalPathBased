session SimpleName Assignment MethodInvocation SimpleName get jsch session
get current test name SimpleName MethodInvocation InfixExpression StringLiteral empty
data SimpleName VariableDeclarationFragment InfixExpression MethodInvocation SimpleName get current test name
data SimpleName VariableDeclarationFragment InfixExpression StringLiteral empty
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName data
unix dir SimpleName VariableDeclarationFragment StringLiteral targetscp
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName unix dir
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment StringLiteral targetscp
get current test name SimpleName MethodInvocation InfixExpression StringLiteral txt
file name SimpleName VariableDeclarationFragment InfixExpression MethodInvocation SimpleName get current test name
file name SimpleName VariableDeclarationFragment InfixExpression StringLiteral txt
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName file name
unix dir SimpleName InfixExpression StringLiteral /
unix dir SimpleName InfixExpression SimpleName file name
/ StringLiteral InfixExpression SimpleName file name
unix path SimpleName VariableDeclarationFragment InfixExpression SimpleName unix dir
unix path SimpleName VariableDeclarationFragment InfixExpression StringLiteral /
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
send file SimpleName MethodInvocation SimpleName file name
send file SimpleName MethodInvocation SimpleName data
unix path SimpleName MethodInvocation SimpleName file name
unix path SimpleName MethodInvocation SimpleName data
file name SimpleName MethodInvocation SimpleName data
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
send file SimpleName MethodInvocation SimpleName file name
send file SimpleName MethodInvocation SimpleName data
unix dir SimpleName MethodInvocation SimpleName file name
unix dir SimpleName MethodInvocation SimpleName data
file name SimpleName MethodInvocation SimpleName data
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
send file error SimpleName MethodInvocation QualifiedName scp helperscp command prefix
send file error SimpleName MethodInvocation SimpleName data
target StringLiteral MethodInvocation QualifiedName scp helperscp command prefix
target StringLiteral MethodInvocation SimpleName data
scp helperscp command prefix QualifiedName MethodInvocation SimpleName data
read file error SimpleName MethodInvocation SimpleName unix dir
target SimpleName MethodInvocation SimpleName length
read file SimpleName MethodInvocation SimpleName unix path
read file SimpleName MethodInvocation MethodInvocation SimpleName target
read file SimpleName MethodInvocation MethodInvocation SimpleName length
unix path SimpleName MethodInvocation MethodInvocation SimpleName target
unix path SimpleName MethodInvocation MethodInvocation SimpleName length
assert equals SimpleName MethodInvocation StringLiteral mismatched file data
assert equals SimpleName MethodInvocation SimpleName data
assert equals SimpleName MethodInvocation MethodInvocation SimpleName read file
assert equals SimpleName MethodInvocation MethodInvocation SimpleName unix path
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName target
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName length
mismatched file data StringLiteral MethodInvocation SimpleName data
mismatched file data StringLiteral MethodInvocation MethodInvocation SimpleName read file
mismatched file data StringLiteral MethodInvocation MethodInvocation SimpleName unix path
mismatched file data StringLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName target
mismatched file data StringLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName length
data SimpleName MethodInvocation MethodInvocation SimpleName read file
data SimpleName MethodInvocation MethodInvocation SimpleName unix path
data SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName target
data SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName length
target SimpleName MethodInvocation SimpleName length
read dir SimpleName MethodInvocation SimpleName unix dir
read dir SimpleName MethodInvocation SimpleName file name
read dir SimpleName MethodInvocation MethodInvocation SimpleName target
read dir SimpleName MethodInvocation MethodInvocation SimpleName length
unix dir SimpleName MethodInvocation SimpleName file name
unix dir SimpleName MethodInvocation MethodInvocation SimpleName target
unix dir SimpleName MethodInvocation MethodInvocation SimpleName length
file name SimpleName MethodInvocation MethodInvocation SimpleName target
file name SimpleName MethodInvocation MethodInvocation SimpleName length
assert equals SimpleName MethodInvocation StringLiteral mismatched dir data
assert equals SimpleName MethodInvocation SimpleName data
assert equals SimpleName MethodInvocation MethodInvocation SimpleName read dir
assert equals SimpleName MethodInvocation MethodInvocation SimpleName unix dir
assert equals SimpleName MethodInvocation MethodInvocation SimpleName file name
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName target
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName length
mismatched dir data StringLiteral MethodInvocation SimpleName data
mismatched dir data StringLiteral MethodInvocation MethodInvocation SimpleName read dir
mismatched dir data StringLiteral MethodInvocation MethodInvocation SimpleName unix dir
mismatched dir data StringLiteral MethodInvocation MethodInvocation SimpleName file name
mismatched dir data StringLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName target
mismatched dir data StringLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName length
data SimpleName MethodInvocation MethodInvocation SimpleName read dir
data SimpleName MethodInvocation MethodInvocation SimpleName unix dir
data SimpleName MethodInvocation MethodInvocation SimpleName file name
data SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName target
data SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName length
target SimpleName MethodInvocation SimpleName delete
root SimpleName MethodInvocation SimpleName delete
send dir SimpleName MethodInvocation StringLiteral target
send dir SimpleName MethodInvocation QualifiedName scp helperscp command prefix
send dir SimpleName MethodInvocation SimpleName file name
send dir SimpleName MethodInvocation SimpleName data
target StringLiteral MethodInvocation QualifiedName scp helperscp command prefix
target StringLiteral MethodInvocation SimpleName file name
target StringLiteral MethodInvocation SimpleName data
scp helperscp command prefix QualifiedName MethodInvocation SimpleName file name
scp helperscp command prefix QualifiedName MethodInvocation SimpleName data
file name SimpleName MethodInvocation SimpleName data
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
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test jsch scp
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test jsch scp
public Modifier MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration SimpleName test jsch scp
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
test jsch scp SimpleName MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test jsch scp
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test jsch scp
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
