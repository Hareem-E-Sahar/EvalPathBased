path tester SimpleName SimpleType ClassInstanceCreation SimpleName file system
path tester SimpleName SimpleType ClassInstanceCreation StringLiteral foobar
file system SimpleName ClassInstanceCreation StringLiteral foobar
path tester SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName names
file system SimpleName ClassInstanceCreation MethodInvocation SimpleName names
foobar StringLiteral ClassInstanceCreation MethodInvocation SimpleName names
path tester SimpleName SimpleType ClassInstanceCreation MethodInvocation StringLiteral foo
file system SimpleName ClassInstanceCreation MethodInvocation StringLiteral foo
foobar StringLiteral ClassInstanceCreation MethodInvocation StringLiteral foo
path tester SimpleName SimpleType ClassInstanceCreation MethodInvocation StringLiteral bar
file system SimpleName ClassInstanceCreation MethodInvocation StringLiteral bar
foobar StringLiteral ClassInstanceCreation MethodInvocation StringLiteral bar
names SimpleName MethodInvocation StringLiteral foo
names SimpleName MethodInvocation StringLiteral bar
foo StringLiteral MethodInvocation StringLiteral bar
tester SimpleName VariableDeclarationFragment MethodInvocation ClassInstanceCreation SimpleName file system
tester SimpleName VariableDeclarationFragment MethodInvocation ClassInstanceCreation StringLiteral foobar
tester SimpleName VariableDeclarationFragment MethodInvocation SimpleName names
tester SimpleName VariableDeclarationFragment MethodInvocation StringLiteral foo
tester SimpleName VariableDeclarationFragment MethodInvocation StringLiteral bar
path tester SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName tester
tester SimpleName MethodInvocation SimpleName test
tester SimpleName MethodInvocation StringLiteral foobar
test SimpleName MethodInvocation StringLiteral foobar
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test relative path two names
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test relative path two names
void PrimitiveType MethodDeclaration SimpleName test relative path two names
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test relative path two names
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test relative path two names
