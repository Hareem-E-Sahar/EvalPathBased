string SimpleName SimpleType SingleVariableDeclaration SimpleName path
buffer SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName buffer
buffer SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName buffer
buffer SimpleName MethodInvocation SimpleName put string
buffer SimpleName MethodInvocation SimpleName path
put string SimpleName MethodInvocation SimpleName path
send SimpleName MethodInvocation SimpleName ssh fxp opendir
send SimpleName MethodInvocation SimpleName buffer
ssh fxp opendir SimpleName MethodInvocation SimpleName buffer
receive SimpleName MethodInvocation MethodInvocation SimpleName send
receive SimpleName MethodInvocation MethodInvocation SimpleName ssh fxp opendir
receive SimpleName MethodInvocation MethodInvocation SimpleName buffer
check handle SimpleName MethodInvocation MethodInvocation SimpleName receive
check handle SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName send
check handle SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName ssh fxp opendir
check handle SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName buffer
public Modifier MethodDeclaration SimpleType SimpleName handle
public Modifier MethodDeclaration SimpleName open dir
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName path
public Modifier MethodDeclaration SimpleType SimpleName io exception
handle SimpleName SimpleType MethodDeclaration SimpleName open dir
handle SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName path
handle SimpleName SimpleType MethodDeclaration SimpleType SimpleName io exception
open dir SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
open dir SimpleName MethodDeclaration SingleVariableDeclaration SimpleName path
open dir SimpleName MethodDeclaration SimpleType SimpleName io exception
path SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName handle
public Modifier TypeDeclaration MethodDeclaration SimpleName open dir
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName path
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName handle
test SimpleName TypeDeclaration MethodDeclaration SimpleName open dir
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName path
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName io exception