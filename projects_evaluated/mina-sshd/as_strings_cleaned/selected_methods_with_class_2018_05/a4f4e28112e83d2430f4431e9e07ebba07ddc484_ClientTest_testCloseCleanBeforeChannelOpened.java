client SimpleName MethodInvocation SimpleName start
session SimpleName VariableDeclarationFragment MethodInvocation SimpleName create test client session
client session SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName session
session SimpleName MethodInvocation SimpleName create shell channel
channel SimpleName VariableDeclarationFragment MethodInvocation SimpleName session
channel SimpleName VariableDeclarationFragment MethodInvocation SimpleName create shell channel
client channel SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName channel
byte array input stream SimpleName SimpleType ClassInstanceCreation QualifiedName generic utilsempty byte array
inp SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName byte array input stream
inp SimpleName VariableDeclarationFragment ClassInstanceCreation QualifiedName generic utilsempty byte array
input stream SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName inp
out SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName byte array output stream
output stream SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName out
err SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName byte array output stream
output stream SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName err
channel SimpleName MethodInvocation SimpleName set in
channel SimpleName MethodInvocation SimpleName inp
set in SimpleName MethodInvocation SimpleName inp
channel SimpleName MethodInvocation SimpleName set out
channel SimpleName MethodInvocation SimpleName out
set out SimpleName MethodInvocation SimpleName out
channel SimpleName MethodInvocation SimpleName set err
channel SimpleName MethodInvocation SimpleName err
set err SimpleName MethodInvocation SimpleName err
channel SimpleName MethodInvocation SimpleName open
open future SimpleName VariableDeclarationFragment MethodInvocation SimpleName channel
open future SimpleName VariableDeclarationFragment MethodInvocation SimpleName open
open future SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName open future
session SimpleName MethodInvocation SimpleName close
session SimpleName MethodInvocation BooleanLiteral false
close SimpleName MethodInvocation BooleanLiteral false
close future SimpleName VariableDeclarationFragment MethodInvocation SimpleName session
close future SimpleName VariableDeclarationFragment MethodInvocation SimpleName close
close future SimpleName VariableDeclarationFragment MethodInvocation BooleanLiteral false
close future SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName close future
open future SimpleName MethodInvocation SimpleName await
open future SimpleName MethodInvocation NumberLiteral l
open future SimpleName MethodInvocation QualifiedName time unitseconds
await SimpleName MethodInvocation NumberLiteral l
await SimpleName MethodInvocation QualifiedName time unitseconds
l NumberLiteral MethodInvocation QualifiedName time unitseconds
assert true SimpleName MethodInvocation StringLiteral channel not open in time
assert true SimpleName MethodInvocation MethodInvocation SimpleName open future
assert true SimpleName MethodInvocation MethodInvocation SimpleName await
assert true SimpleName MethodInvocation MethodInvocation NumberLiteral l
assert true SimpleName MethodInvocation MethodInvocation QualifiedName time unitseconds
channel not open in time StringLiteral MethodInvocation MethodInvocation SimpleName open future
channel not open in time StringLiteral MethodInvocation MethodInvocation SimpleName await
channel not open in time StringLiteral MethodInvocation MethodInvocation NumberLiteral l
channel not open in time StringLiteral MethodInvocation MethodInvocation QualifiedName time unitseconds
close future SimpleName MethodInvocation SimpleName await
close future SimpleName MethodInvocation NumberLiteral l
close future SimpleName MethodInvocation QualifiedName time unitseconds
await SimpleName MethodInvocation NumberLiteral l
await SimpleName MethodInvocation QualifiedName time unitseconds
l NumberLiteral MethodInvocation QualifiedName time unitseconds
assert true SimpleName MethodInvocation StringLiteral session closing not complete in time
assert true SimpleName MethodInvocation MethodInvocation SimpleName close future
assert true SimpleName MethodInvocation MethodInvocation SimpleName await
assert true SimpleName MethodInvocation MethodInvocation NumberLiteral l
assert true SimpleName MethodInvocation MethodInvocation QualifiedName time unitseconds
session closing not complete in time StringLiteral MethodInvocation MethodInvocation SimpleName close future
session closing not complete in time StringLiteral MethodInvocation MethodInvocation SimpleName await
session closing not complete in time StringLiteral MethodInvocation MethodInvocation NumberLiteral l
session closing not complete in time StringLiteral MethodInvocation MethodInvocation QualifiedName time unitseconds
open future SimpleName MethodInvocation SimpleName is opened
assert true SimpleName MethodInvocation StringLiteral not open
assert true SimpleName MethodInvocation MethodInvocation SimpleName open future
assert true SimpleName MethodInvocation MethodInvocation SimpleName is opened
not open StringLiteral MethodInvocation MethodInvocation SimpleName open future
not open StringLiteral MethodInvocation MethodInvocation SimpleName is opened
close future SimpleName MethodInvocation SimpleName is closed
assert true SimpleName MethodInvocation StringLiteral not closed
assert true SimpleName MethodInvocation MethodInvocation SimpleName close future
assert true SimpleName MethodInvocation MethodInvocation SimpleName is closed
not closed StringLiteral MethodInvocation MethodInvocation SimpleName close future
not closed StringLiteral MethodInvocation MethodInvocation SimpleName is closed
client SimpleName MethodInvocation SimpleName stop
client session holder SimpleName MethodInvocation SimpleName get
assert null SimpleName MethodInvocation StringLiteral session closure not signalled
assert null SimpleName MethodInvocation MethodInvocation SimpleName client session holder
assert null SimpleName MethodInvocation MethodInvocation SimpleName get
session closure not signalled StringLiteral MethodInvocation MethodInvocation SimpleName client session holder
session closure not signalled StringLiteral MethodInvocation MethodInvocation SimpleName get
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test close clean before channel opened
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test close clean before channel opened
public Modifier MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration SimpleName test close clean before channel opened
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
test close clean before channel opened SimpleName MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test close clean before channel opened
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test close clean before channel opened
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
