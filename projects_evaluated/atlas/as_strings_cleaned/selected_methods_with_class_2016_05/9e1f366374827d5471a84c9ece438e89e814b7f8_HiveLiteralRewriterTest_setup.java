conf SimpleName Assignment ClassInstanceCreation SimpleType SimpleName hive conf
conf SimpleName MethodInvocation SimpleName add resource
conf SimpleName MethodInvocation StringLiteral hivesitexml
add resource SimpleName MethodInvocation StringLiteral hivesitexml
session state SimpleName SimpleType ClassInstanceCreation SimpleName conf
session state SimpleName SimpleType ClassInstanceCreation StringLiteral testuser
conf SimpleName ClassInstanceCreation StringLiteral testuser
ss SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName session state
ss SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName conf
ss SimpleName VariableDeclarationFragment ClassInstanceCreation StringLiteral testuser
session state SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName ss
session state SimpleName MethodInvocation SimpleName start
session state SimpleName MethodInvocation SimpleName ss
start SimpleName MethodInvocation SimpleName ss
conf SimpleName MethodInvocation SimpleName set
conf SimpleName MethodInvocation StringLiteral hivelockmanager
conf SimpleName MethodInvocation StringLiteral orgapachehadoophiveqllockmgrembedded lock manager
set SimpleName MethodInvocation StringLiteral hivelockmanager
set SimpleName MethodInvocation StringLiteral orgapachehadoophiveqllockmgrembedded lock manager
hivelockmanager StringLiteral MethodInvocation StringLiteral orgapachehadoophiveqllockmgrembedded lock manager
before class SimpleName MarkerAnnotation MethodDeclaration Modifier public
before class SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
before class SimpleName MarkerAnnotation MethodDeclaration SimpleName setup
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName setup
void PrimitiveType MethodDeclaration SimpleName setup
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName before class
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName setup
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName before class
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName setup
