string SimpleName SimpleType SingleVariableDeclaration SimpleName path
buffer SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName buffer
buffer SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName buffer
buffer SimpleName MethodInvocation SimpleName put string
buffer SimpleName MethodInvocation SimpleName path
put string SimpleName MethodInvocation SimpleName path
send SimpleName MethodInvocation SimpleName ssh fxp realpath
send SimpleName MethodInvocation SimpleName buffer
ssh fxp realpath SimpleName MethodInvocation SimpleName buffer
receive SimpleName MethodInvocation MethodInvocation SimpleName send
receive SimpleName MethodInvocation MethodInvocation SimpleName ssh fxp realpath
receive SimpleName MethodInvocation MethodInvocation SimpleName buffer
check one name SimpleName MethodInvocation MethodInvocation SimpleName receive
check one name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName send
check one name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName ssh fxp realpath
check one name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName buffer
public Modifier MethodDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SimpleName canonical path
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName path
public Modifier MethodDeclaration SimpleType SimpleName io exception
string SimpleName SimpleType MethodDeclaration SimpleName canonical path
string SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName path
string SimpleName SimpleType MethodDeclaration SimpleType SimpleName io exception
canonical path SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
canonical path SimpleName MethodDeclaration SingleVariableDeclaration SimpleName path
canonical path SimpleName MethodDeclaration SimpleType SimpleName io exception
path SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName string
public Modifier TypeDeclaration MethodDeclaration SimpleName canonical path
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName path
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName string
test SimpleName TypeDeclaration MethodDeclaration SimpleName canonical path
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName path
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
