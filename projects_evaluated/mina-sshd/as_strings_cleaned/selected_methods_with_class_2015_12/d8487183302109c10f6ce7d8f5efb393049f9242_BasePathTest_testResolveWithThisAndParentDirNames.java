parse path SimpleName MethodInvocation StringLiteral foo
path SimpleName VariableDeclarationFragment MethodInvocation SimpleName parse path
path SimpleName VariableDeclarationFragment MethodInvocation StringLiteral foo
path SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName path
assert resolved path equals SimpleName MethodInvocation StringLiteral foobarbaz
assert resolved path equals SimpleName MethodInvocation SimpleName path
assert resolved path equals SimpleName MethodInvocation StringLiteral barbaz
foobarbaz StringLiteral MethodInvocation SimpleName path
foobarbaz StringLiteral MethodInvocation StringLiteral barbaz
path SimpleName MethodInvocation StringLiteral barbaz
assert resolved path equals SimpleName MethodInvocation StringLiteral foobarbaz
assert resolved path equals SimpleName MethodInvocation SimpleName path
assert resolved path equals SimpleName MethodInvocation StringLiteral bar
assert resolved path equals SimpleName MethodInvocation StringLiteral ..
assert resolved path equals SimpleName MethodInvocation StringLiteral baz
foobarbaz StringLiteral MethodInvocation SimpleName path
foobarbaz StringLiteral MethodInvocation StringLiteral bar
foobarbaz StringLiteral MethodInvocation StringLiteral ..
foobarbaz StringLiteral MethodInvocation StringLiteral baz
path SimpleName MethodInvocation StringLiteral bar
path SimpleName MethodInvocation StringLiteral ..
path SimpleName MethodInvocation StringLiteral baz
bar StringLiteral MethodInvocation StringLiteral ..
bar StringLiteral MethodInvocation StringLiteral baz
.. StringLiteral MethodInvocation StringLiteral baz
assert resolved path equals SimpleName MethodInvocation StringLiteral foobarbaz
assert resolved path equals SimpleName MethodInvocation SimpleName path
assert resolved path equals SimpleName MethodInvocation StringLiteral barbaz
foobarbaz StringLiteral MethodInvocation SimpleName path
foobarbaz StringLiteral MethodInvocation StringLiteral barbaz
path SimpleName MethodInvocation StringLiteral barbaz
assert resolved path equals SimpleName MethodInvocation StringLiteral foobarbaz
assert resolved path equals SimpleName MethodInvocation SimpleName path
assert resolved path equals SimpleName MethodInvocation StringLiteral .
assert resolved path equals SimpleName MethodInvocation StringLiteral barbaz
foobarbaz StringLiteral MethodInvocation SimpleName path
foobarbaz StringLiteral MethodInvocation StringLiteral .
foobarbaz StringLiteral MethodInvocation StringLiteral barbaz
path SimpleName MethodInvocation StringLiteral .
path SimpleName MethodInvocation StringLiteral barbaz
. StringLiteral MethodInvocation StringLiteral barbaz
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test resolve with this and parent dir names
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test resolve with this and parent dir names
void PrimitiveType MethodDeclaration SimpleName test resolve with this and parent dir names
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test resolve with this and parent dir names
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test resolve with this and parent dir names
