sftp client SimpleName SimpleType SingleVariableDeclaration SimpleName sftp
path SimpleName SimpleType SingleVariableDeclaration SimpleName client folder
string SimpleName SimpleType SingleVariableDeclaration SimpleName remote dir
int PrimitiveType SingleVariableDeclaration SimpleName size
string SimpleName SimpleType SingleVariableDeclaration SimpleName filename
remote dir SimpleName InfixExpression StringLiteral /
remote dir SimpleName InfixExpression SimpleName filename
/ StringLiteral InfixExpression SimpleName filename
remote path SimpleName VariableDeclarationFragment InfixExpression SimpleName remote dir
remote path SimpleName VariableDeclarationFragment InfixExpression StringLiteral /
remote path SimpleName VariableDeclarationFragment InfixExpression SimpleName filename
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName remote path
random string SimpleName MethodInvocation SimpleName size
random data SimpleName VariableDeclarationFragment MethodInvocation SimpleName random string
random data SimpleName VariableDeclarationFragment MethodInvocation SimpleName size
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName random data
enum set SimpleName MethodInvocation SimpleName of
enum set SimpleName MethodInvocation QualifiedName sftp clientopen modewrite
enum set SimpleName MethodInvocation QualifiedName sftp clientopen modecreate
of SimpleName MethodInvocation QualifiedName sftp clientopen modewrite
of SimpleName MethodInvocation QualifiedName sftp clientopen modecreate
sftp clientopen modewrite QualifiedName MethodInvocation QualifiedName sftp clientopen modecreate
sftp SimpleName MethodInvocation SimpleName open
sftp SimpleName MethodInvocation SimpleName remote path
sftp SimpleName MethodInvocation MethodInvocation SimpleName enum set
sftp SimpleName MethodInvocation MethodInvocation SimpleName of
sftp SimpleName MethodInvocation MethodInvocation QualifiedName sftp clientopen modewrite
sftp SimpleName MethodInvocation MethodInvocation QualifiedName sftp clientopen modecreate
open SimpleName MethodInvocation SimpleName remote path
open SimpleName MethodInvocation MethodInvocation SimpleName enum set
open SimpleName MethodInvocation MethodInvocation SimpleName of
open SimpleName MethodInvocation MethodInvocation QualifiedName sftp clientopen modewrite
open SimpleName MethodInvocation MethodInvocation QualifiedName sftp clientopen modecreate
remote path SimpleName MethodInvocation MethodInvocation SimpleName enum set
remote path SimpleName MethodInvocation MethodInvocation SimpleName of
remote path SimpleName MethodInvocation MethodInvocation QualifiedName sftp clientopen modewrite
remote path SimpleName MethodInvocation MethodInvocation QualifiedName sftp clientopen modecreate
handle SimpleName VariableDeclarationFragment MethodInvocation SimpleName sftp
handle SimpleName VariableDeclarationFragment MethodInvocation SimpleName open
handle SimpleName VariableDeclarationFragment MethodInvocation SimpleName remote path
handle SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName enum set
handle SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName of
handle SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation QualifiedName sftp clientopen modewrite
handle SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation QualifiedName sftp clientopen modecreate
sftp clientcloseable handle QualifiedName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName handle
random data SimpleName MethodInvocation SimpleName get bytes
random data SimpleName MethodInvocation SimpleName length
sftp SimpleName MethodInvocation SimpleName write
sftp SimpleName MethodInvocation SimpleName handle
sftp SimpleName MethodInvocation NumberLiteral empty
sftp SimpleName MethodInvocation MethodInvocation SimpleName random data
sftp SimpleName MethodInvocation MethodInvocation SimpleName get bytes
sftp SimpleName MethodInvocation NumberLiteral empty
write SimpleName MethodInvocation SimpleName handle
write SimpleName MethodInvocation NumberLiteral empty
write SimpleName MethodInvocation MethodInvocation SimpleName random data
write SimpleName MethodInvocation MethodInvocation SimpleName get bytes
write SimpleName MethodInvocation NumberLiteral empty
write SimpleName MethodInvocation MethodInvocation SimpleName random data
write SimpleName MethodInvocation MethodInvocation SimpleName length
handle SimpleName MethodInvocation NumberLiteral empty
handle SimpleName MethodInvocation MethodInvocation SimpleName random data
handle SimpleName MethodInvocation MethodInvocation SimpleName get bytes
handle SimpleName MethodInvocation NumberLiteral empty
handle SimpleName MethodInvocation MethodInvocation SimpleName random data
handle SimpleName MethodInvocation MethodInvocation SimpleName length
empty NumberLiteral MethodInvocation MethodInvocation SimpleName random data
empty NumberLiteral MethodInvocation MethodInvocation SimpleName get bytes
empty NumberLiteral MethodInvocation NumberLiteral empty
empty NumberLiteral MethodInvocation MethodInvocation SimpleName random data
empty NumberLiteral MethodInvocation MethodInvocation SimpleName length
random data SimpleName MethodInvocation MethodInvocation NumberLiteral empty
get bytes SimpleName MethodInvocation MethodInvocation NumberLiteral empty
random data SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName random data
random data SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName length
get bytes SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName random data
get bytes SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName length
empty NumberLiteral MethodInvocation MethodInvocation SimpleName random data
empty NumberLiteral MethodInvocation MethodInvocation SimpleName length
client folder SimpleName MethodInvocation SimpleName resolve
client folder SimpleName MethodInvocation SimpleName filename
resolve SimpleName MethodInvocation SimpleName filename
result path SimpleName VariableDeclarationFragment MethodInvocation SimpleName client folder
result path SimpleName VariableDeclarationFragment MethodInvocation SimpleName resolve
result path SimpleName VariableDeclarationFragment MethodInvocation SimpleName filename
path SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName result path
file should exist on disk StringLiteral InfixExpression SimpleName result path
files SimpleName MethodInvocation SimpleName exists
files SimpleName MethodInvocation SimpleName result path
exists SimpleName MethodInvocation SimpleName result path
assert true SimpleName MethodInvocation InfixExpression StringLiteral file should exist on disk
assert true SimpleName MethodInvocation InfixExpression SimpleName result path
assert true SimpleName MethodInvocation MethodInvocation SimpleName files
assert true SimpleName MethodInvocation MethodInvocation SimpleName exists
assert true SimpleName MethodInvocation MethodInvocation SimpleName result path
file should exist on disk StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName files
file should exist on disk StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName exists
file should exist on disk StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName result path
result path SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName files
result path SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName exists
result path SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName result path
mismatched file contents StringLiteral InfixExpression SimpleName result path
read file SimpleName MethodInvocation SimpleName remote path
random data SimpleName MethodInvocation SimpleName equals
random data SimpleName MethodInvocation MethodInvocation SimpleName read file
random data SimpleName MethodInvocation MethodInvocation SimpleName remote path
equals SimpleName MethodInvocation MethodInvocation SimpleName read file
equals SimpleName MethodInvocation MethodInvocation SimpleName remote path
assert true SimpleName MethodInvocation InfixExpression StringLiteral mismatched file contents
assert true SimpleName MethodInvocation InfixExpression SimpleName result path
assert true SimpleName MethodInvocation MethodInvocation SimpleName random data
assert true SimpleName MethodInvocation MethodInvocation SimpleName equals
assert true SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName read file
assert true SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName remote path
mismatched file contents StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName random data
mismatched file contents StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName equals
result path SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName random data
result path SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName equals
sftp SimpleName MethodInvocation SimpleName remove
sftp SimpleName MethodInvocation SimpleName remote path
remove SimpleName MethodInvocation SimpleName remote path
file should have been removed StringLiteral InfixExpression SimpleName result path
files SimpleName MethodInvocation SimpleName exists
files SimpleName MethodInvocation SimpleName result path
exists SimpleName MethodInvocation SimpleName result path
assert false SimpleName MethodInvocation InfixExpression StringLiteral file should have been removed
assert false SimpleName MethodInvocation InfixExpression SimpleName result path
assert false SimpleName MethodInvocation MethodInvocation SimpleName files
assert false SimpleName MethodInvocation MethodInvocation SimpleName exists
assert false SimpleName MethodInvocation MethodInvocation SimpleName result path
file should have been removed StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName files
file should have been removed StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName exists
file should have been removed StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName result path
result path SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName files
result path SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName exists
result path SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName result path
private Modifier MethodDeclaration PrimitiveType void
private Modifier MethodDeclaration SimpleName upload and verify file
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName sftp client
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName sftp
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName path
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName client folder
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName remote dir
void PrimitiveType MethodDeclaration SimpleName upload and verify file
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName sftp client
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName sftp
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName path
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName client folder
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName remote dir
void PrimitiveType MethodDeclaration SingleVariableDeclaration PrimitiveType int
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName size
upload and verify file SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName sftp client
upload and verify file SimpleName MethodDeclaration SingleVariableDeclaration SimpleName sftp
upload and verify file SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName path
upload and verify file SimpleName MethodDeclaration SingleVariableDeclaration SimpleName client folder
upload and verify file SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
upload and verify file SimpleName MethodDeclaration SingleVariableDeclaration SimpleName remote dir
upload and verify file SimpleName MethodDeclaration SingleVariableDeclaration PrimitiveType int
upload and verify file SimpleName MethodDeclaration SingleVariableDeclaration SimpleName size
upload and verify file SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
upload and verify file SimpleName MethodDeclaration SingleVariableDeclaration SimpleName filename
sftp SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName client folder
sftp SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName remote dir
sftp SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
sftp SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName size
sftp SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName filename
sftp SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
client folder SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName remote dir
client folder SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
client folder SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName size
client folder SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName filename
client folder SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
remote dir SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
remote dir SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName size
remote dir SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName filename
remote dir SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
int PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName filename
size SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName filename
int PrimitiveType SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
size SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
filename SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName upload and verify file
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName sftp
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName client folder
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName remote dir
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName size
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName filename
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName upload and verify file
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName sftp
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName client folder
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName remote dir
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName size
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName filename
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
