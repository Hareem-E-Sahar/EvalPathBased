tablet type SimpleName SimpleType SingleVariableDeclaration SimpleName ttype
operation counter SimpleName MethodInvocation SimpleName get and increment
operation id SimpleName VariableDeclarationFragment MethodInvocation SimpleName operation counter
operation id SimpleName VariableDeclarationFragment MethodInvocation SimpleName get and increment
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName operation id
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName operation counter
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get and increment
in progress writes SimpleName MethodInvocation SimpleName get
in progress writes SimpleName MethodInvocation SimpleName ttype
get SimpleName MethodInvocation SimpleName ttype
in progress writes SimpleName MethodInvocation MethodInvocation SimpleName floor
get SimpleName MethodInvocation MethodInvocation SimpleName floor
ttype SimpleName MethodInvocation MethodInvocation SimpleName floor
in progress writes SimpleName MethodInvocation MethodInvocation SimpleName operation id
get SimpleName MethodInvocation MethodInvocation SimpleName operation id
ttype SimpleName MethodInvocation MethodInvocation SimpleName operation id
floor SimpleName MethodInvocation SimpleName operation id
interrupted exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
log SimpleName MethodInvocation SimpleName error
log SimpleName MethodInvocation SimpleName e
log SimpleName MethodInvocation SimpleName e
error SimpleName MethodInvocation SimpleName e
error SimpleName MethodInvocation SimpleName e
e SimpleName MethodInvocation SimpleName e
synchronized Modifier MethodDeclaration PrimitiveType void
synchronized Modifier MethodDeclaration SimpleName wait for writes
synchronized Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName tablet type
synchronized Modifier MethodDeclaration SingleVariableDeclaration SimpleName ttype
synchronized Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType long
void PrimitiveType MethodDeclaration SimpleName wait for writes
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName tablet type
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName ttype
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType long
wait for writes SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName tablet type
wait for writes SimpleName MethodDeclaration SingleVariableDeclaration SimpleName ttype
wait for writes SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType long
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier synchronized
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName wait for writes
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName ttype
test SimpleName TypeDeclaration MethodDeclaration Modifier synchronized
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName wait for writes
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName ttype
