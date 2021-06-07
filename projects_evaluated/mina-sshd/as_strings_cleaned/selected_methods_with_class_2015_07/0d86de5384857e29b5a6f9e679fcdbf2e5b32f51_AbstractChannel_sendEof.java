log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral send ssh msg channel eof on channel {}
debug SimpleName MethodInvocation StringLiteral send ssh msg channel eof on channel {}
session SimpleName MethodInvocation SimpleName create buffer
session SimpleName MethodInvocation QualifiedName ssh constantsssh msg channel eof
create buffer SimpleName MethodInvocation QualifiedName ssh constantsssh msg channel eof
buffer SimpleName VariableDeclarationFragment MethodInvocation SimpleName session
buffer SimpleName VariableDeclarationFragment MethodInvocation SimpleName create buffer
buffer SimpleName VariableDeclarationFragment MethodInvocation QualifiedName ssh constantsssh msg channel eof
buffer SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName buffer
buffer SimpleName MethodInvocation SimpleName put int
buffer SimpleName MethodInvocation SimpleName recipient
put int SimpleName MethodInvocation SimpleName recipient
write packet SimpleName MethodInvocation SimpleName buffer
protected Modifier MethodDeclaration PrimitiveType void
protected Modifier MethodDeclaration SimpleName send eof
protected Modifier MethodDeclaration SimpleType SimpleName io exception
void PrimitiveType MethodDeclaration SimpleName send eof
void PrimitiveType MethodDeclaration SimpleType SimpleName io exception
send eof SimpleName MethodDeclaration SimpleType SimpleName io exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier protected
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName send eof
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
test SimpleName TypeDeclaration MethodDeclaration Modifier protected
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName send eof
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
