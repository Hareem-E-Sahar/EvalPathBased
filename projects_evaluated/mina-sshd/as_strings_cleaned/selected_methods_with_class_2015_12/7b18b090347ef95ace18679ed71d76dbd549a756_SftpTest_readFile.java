string SimpleName SimpleType SingleVariableDeclaration SimpleName path
session SimpleName MethodInvocation SimpleName open channel
session SimpleName MethodInvocation QualifiedName sftp constantssftp subsystem name
open channel SimpleName MethodInvocation QualifiedName sftp constantssftp subsystem name
channel sftp SimpleName SimpleType CastExpression MethodInvocation SimpleName session
channel sftp SimpleName SimpleType CastExpression MethodInvocation SimpleName open channel
channel sftp SimpleName SimpleType CastExpression MethodInvocation QualifiedName sftp constantssftp subsystem name
c SimpleName VariableDeclarationFragment CastExpression SimpleType SimpleName channel sftp
c SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName session
c SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName open channel
c SimpleName VariableDeclarationFragment CastExpression MethodInvocation QualifiedName sftp constantssftp subsystem name
channel sftp SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName c
c SimpleName MethodInvocation SimpleName connect
bos SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName byte array output stream
byte array output stream SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName bos
c SimpleName MethodInvocation SimpleName get
c SimpleName MethodInvocation SimpleName path
get SimpleName MethodInvocation SimpleName path
is SimpleName VariableDeclarationFragment MethodInvocation SimpleName c
is SimpleName VariableDeclarationFragment MethodInvocation SimpleName get
is SimpleName VariableDeclarationFragment MethodInvocation SimpleName path
input stream SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName is
byte PrimitiveType ArrayType ArrayCreation NumberLiteral empty
buffer SimpleName VariableDeclarationFragment ArrayCreation ArrayType PrimitiveType byte
buffer SimpleName VariableDeclarationFragment ArrayCreation NumberLiteral empty
byte PrimitiveType ArrayType VariableDeclarationStatement VariableDeclarationFragment SimpleName buffer
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName count
is SimpleName MethodInvocation SimpleName read
is SimpleName MethodInvocation SimpleName buffer
read SimpleName MethodInvocation SimpleName buffer
count SimpleName Assignment MethodInvocation SimpleName is
count SimpleName Assignment MethodInvocation SimpleName read
count SimpleName Assignment MethodInvocation SimpleName buffer
bos SimpleName MethodInvocation SimpleName write
bos SimpleName MethodInvocation SimpleName buffer
bos SimpleName MethodInvocation NumberLiteral empty
bos SimpleName MethodInvocation SimpleName count
write SimpleName MethodInvocation SimpleName buffer
write SimpleName MethodInvocation NumberLiteral empty
write SimpleName MethodInvocation SimpleName count
buffer SimpleName MethodInvocation NumberLiteral empty
buffer SimpleName MethodInvocation SimpleName count
empty NumberLiteral MethodInvocation SimpleName count
bos SimpleName MethodInvocation SimpleName to string
c SimpleName MethodInvocation SimpleName disconnect
protected Modifier MethodDeclaration SimpleType SimpleName string
protected Modifier MethodDeclaration SimpleName read file
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleName path
protected Modifier MethodDeclaration SimpleType SimpleName exception
string SimpleName SimpleType MethodDeclaration SimpleName read file
string SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName path
string SimpleName SimpleType MethodDeclaration SimpleType SimpleName exception
read file SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
read file SimpleName MethodDeclaration SingleVariableDeclaration SimpleName path
read file SimpleName MethodDeclaration SimpleType SimpleName exception
path SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier protected
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName string
public Modifier TypeDeclaration MethodDeclaration SimpleName read file
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName path
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration Modifier protected
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName string
test SimpleName TypeDeclaration MethodDeclaration SimpleName read file
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName path
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
