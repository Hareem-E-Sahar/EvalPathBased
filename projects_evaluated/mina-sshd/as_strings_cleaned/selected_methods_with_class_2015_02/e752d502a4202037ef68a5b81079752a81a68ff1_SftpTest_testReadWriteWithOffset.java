file SimpleName SimpleType ClassInstanceCreation StringLiteral targetsftp
root SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName file
root SimpleName VariableDeclarationFragment ClassInstanceCreation StringLiteral targetsftp
file SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName root
utils SimpleName MethodInvocation SimpleName delete recursive
utils SimpleName MethodInvocation SimpleName root
delete recursive SimpleName MethodInvocation SimpleName root
assert hierarchy target folder exists SimpleName MethodInvocation SimpleName root
unix path SimpleName VariableDeclarationFragment StringLiteral targetsftpouttxt
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName unix path
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment StringLiteral targetsftpouttxt
file SimpleName SimpleType ClassInstanceCreation SimpleName unix path
target SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName file
target SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName unix path
file SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName target
session SimpleName MethodInvocation SimpleName open channel
session SimpleName MethodInvocation StringLiteral sftp
open channel SimpleName MethodInvocation StringLiteral sftp
channel sftp SimpleName SimpleType CastExpression MethodInvocation SimpleName session
channel sftp SimpleName SimpleType CastExpression MethodInvocation SimpleName open channel
channel sftp SimpleName SimpleType CastExpression MethodInvocation StringLiteral sftp
c SimpleName VariableDeclarationFragment CastExpression SimpleType SimpleName channel sftp
c SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName session
c SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName open channel
c SimpleName VariableDeclarationFragment CastExpression MethodInvocation StringLiteral sftp
channel sftp SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName c
c SimpleName MethodInvocation SimpleName connect
empty StringLiteral MethodInvocation SimpleName get bytes
byte array input stream SimpleName SimpleType ClassInstanceCreation MethodInvocation StringLiteral empty
byte array input stream SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get bytes
c SimpleName MethodInvocation SimpleName put
c SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName byte array input stream
c SimpleName MethodInvocation ClassInstanceCreation MethodInvocation StringLiteral empty
c SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get bytes
c SimpleName MethodInvocation SimpleName unix path
put SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName byte array input stream
put SimpleName MethodInvocation ClassInstanceCreation MethodInvocation StringLiteral empty
put SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get bytes
put SimpleName MethodInvocation SimpleName unix path
byte array input stream SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName unix path
empty StringLiteral MethodInvocation ClassInstanceCreation MethodInvocation SimpleName unix path
get bytes SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName unix path
target SimpleName MethodInvocation SimpleName get absolute path
target not created after initial write StringLiteral InfixExpression MethodInvocation SimpleName target
target not created after initial write StringLiteral InfixExpression MethodInvocation SimpleName get absolute path
target SimpleName MethodInvocation SimpleName exists
assert true SimpleName MethodInvocation InfixExpression StringLiteral target not created after initial write
assert true SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName target
assert true SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get absolute path
assert true SimpleName MethodInvocation MethodInvocation SimpleName target
assert true SimpleName MethodInvocation MethodInvocation SimpleName exists
target not created after initial write StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName target
target not created after initial write StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName exists
read file SimpleName MethodInvocation SimpleName unix path
assert equals SimpleName MethodInvocation StringLiteral empty
assert equals SimpleName MethodInvocation MethodInvocation SimpleName read file
assert equals SimpleName MethodInvocation MethodInvocation SimpleName unix path
empty StringLiteral MethodInvocation MethodInvocation SimpleName read file
empty StringLiteral MethodInvocation MethodInvocation SimpleName unix path
c SimpleName MethodInvocation SimpleName put
c SimpleName MethodInvocation SimpleName unix path
c SimpleName MethodInvocation QualifiedName channel sftpappend
c SimpleName MethodInvocation PrefixExpression NumberLiteral empty
put SimpleName MethodInvocation SimpleName unix path
put SimpleName MethodInvocation QualifiedName channel sftpappend
put SimpleName MethodInvocation PrefixExpression NumberLiteral empty
unix path SimpleName MethodInvocation QualifiedName channel sftpappend
unix path SimpleName MethodInvocation PrefixExpression NumberLiteral empty
channel sftpappend QualifiedName MethodInvocation PrefixExpression NumberLiteral empty
os SimpleName VariableDeclarationFragment MethodInvocation SimpleName c
os SimpleName VariableDeclarationFragment MethodInvocation SimpleName put
os SimpleName VariableDeclarationFragment MethodInvocation SimpleName unix path
os SimpleName VariableDeclarationFragment MethodInvocation QualifiedName channel sftpappend
os SimpleName VariableDeclarationFragment MethodInvocation PrefixExpression NumberLiteral empty
output stream SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName os
a StringLiteral MethodInvocation SimpleName get bytes
os SimpleName MethodInvocation SimpleName write
os SimpleName MethodInvocation MethodInvocation StringLiteral a
os SimpleName MethodInvocation MethodInvocation SimpleName get bytes
write SimpleName MethodInvocation MethodInvocation StringLiteral a
write SimpleName MethodInvocation MethodInvocation SimpleName get bytes
c SimpleName MethodInvocation SimpleName disconnect
target SimpleName MethodInvocation SimpleName get absolute path
target not created after data update StringLiteral InfixExpression MethodInvocation SimpleName target
target not created after data update StringLiteral InfixExpression MethodInvocation SimpleName get absolute path
target SimpleName MethodInvocation SimpleName exists
assert true SimpleName MethodInvocation InfixExpression StringLiteral target not created after data update
assert true SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName target
assert true SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get absolute path
assert true SimpleName MethodInvocation MethodInvocation SimpleName target
assert true SimpleName MethodInvocation MethodInvocation SimpleName exists
target not created after data update StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName target
target not created after data update StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName exists
read file SimpleName MethodInvocation SimpleName unix path
assert equals SimpleName MethodInvocation StringLiteral mismatched file data
assert equals SimpleName MethodInvocation StringLiteral a
assert equals SimpleName MethodInvocation MethodInvocation SimpleName read file
assert equals SimpleName MethodInvocation MethodInvocation SimpleName unix path
mismatched file data StringLiteral MethodInvocation StringLiteral a
mismatched file data StringLiteral MethodInvocation MethodInvocation SimpleName read file
mismatched file data StringLiteral MethodInvocation MethodInvocation SimpleName unix path
a StringLiteral MethodInvocation MethodInvocation SimpleName read file
a StringLiteral MethodInvocation MethodInvocation SimpleName unix path
target SimpleName MethodInvocation SimpleName get absolute path
failed to delete StringLiteral InfixExpression MethodInvocation SimpleName target
failed to delete StringLiteral InfixExpression MethodInvocation SimpleName get absolute path
target SimpleName MethodInvocation SimpleName delete
assert true SimpleName MethodInvocation InfixExpression StringLiteral failed to delete
assert true SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName target
assert true SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get absolute path
assert true SimpleName MethodInvocation MethodInvocation SimpleName target
assert true SimpleName MethodInvocation MethodInvocation SimpleName delete
failed to delete StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName target
failed to delete StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName delete
target SimpleName MethodInvocation SimpleName get absolute path
target not deleted StringLiteral InfixExpression MethodInvocation SimpleName target
target not deleted StringLiteral InfixExpression MethodInvocation SimpleName get absolute path
target SimpleName MethodInvocation SimpleName exists
assert false SimpleName MethodInvocation InfixExpression StringLiteral target not deleted
assert false SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName target
assert false SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get absolute path
assert false SimpleName MethodInvocation MethodInvocation SimpleName target
assert false SimpleName MethodInvocation MethodInvocation SimpleName exists
target not deleted StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName target
target not deleted StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName exists
root SimpleName MethodInvocation SimpleName delete
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test read write with offset
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test read write with offset
public Modifier MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration SimpleName test read write with offset
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
test read write with offset SimpleName MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test read write with offset
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test read write with offset
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
