string SimpleName SimpleType ArrayType SingleVariableDeclaration SimpleName args
opts SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName opts
opts SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName opts
initialize SimpleName SimpleType TypeLiteral MethodInvocation SimpleName get name
opts SimpleName MethodInvocation SimpleName parse args
opts SimpleName MethodInvocation MethodInvocation SimpleName get name
opts SimpleName MethodInvocation SimpleName args
parse args SimpleName MethodInvocation MethodInvocation SimpleName get name
parse args SimpleName MethodInvocation SimpleName args
get name SimpleName MethodInvocation MethodInvocation SimpleName args
site configuration SimpleName MethodInvocation SimpleName get instance
acu conf SimpleName VariableDeclarationFragment MethodInvocation SimpleName site configuration
acu conf SimpleName VariableDeclarationFragment MethodInvocation SimpleName get instance
accumulo configuration SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName acu conf
security util SimpleName MethodInvocation SimpleName server login
security util SimpleName MethodInvocation SimpleName acu conf
server login SimpleName MethodInvocation SimpleName acu conf
cached configuration SimpleName MethodInvocation SimpleName get instance
conf SimpleName VariableDeclarationFragment MethodInvocation SimpleName cached configuration
conf SimpleName VariableDeclarationFragment MethodInvocation SimpleName get instance
configuration SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName conf
volume manager impl SimpleName MethodInvocation SimpleName get
volume manager impl SimpleName MethodInvocation SimpleName acu conf
get SimpleName MethodInvocation SimpleName acu conf
fs SimpleName VariableDeclarationFragment MethodInvocation SimpleName volume manager impl
fs SimpleName VariableDeclarationFragment MethodInvocation SimpleName get
fs SimpleName VariableDeclarationFragment MethodInvocation SimpleName acu conf
volume manager SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName fs
is initialized SimpleName MethodInvocation SimpleName fs
get root password SimpleName MethodInvocation SimpleName opts
optsrootpass QualifiedName Assignment MethodInvocation SimpleName get root password
optsrootpass QualifiedName Assignment MethodInvocation SimpleName opts
hdfs zoo instance SimpleName MethodInvocation SimpleName get instance
hdfs zoo instance SimpleName MethodInvocation MethodInvocation SimpleName get instance id
get instance SimpleName MethodInvocation MethodInvocation SimpleName get instance id
init security SimpleName MethodInvocation SimpleName opts
init security SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName hdfs zoo instance
init security SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get instance
init security SimpleName MethodInvocation MethodInvocation SimpleName get instance id
opts SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName hdfs zoo instance
opts SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get instance
opts SimpleName MethodInvocation MethodInvocation SimpleName get instance id
log SimpleName MethodInvocation SimpleName fatal
log SimpleName MethodInvocation StringLiteral attempted to reset security on accumulo before it was initialized
fatal SimpleName MethodInvocation StringLiteral attempted to reset security on accumulo before it was initialized
add volumes SimpleName MethodInvocation SimpleName fs
optsreset security QualifiedName PrefixExpression InfixExpression PrefixExpression QualifiedName optsadd volumes
do init SimpleName MethodInvocation SimpleName opts
do init SimpleName MethodInvocation SimpleName conf
do init SimpleName MethodInvocation SimpleName fs
opts SimpleName MethodInvocation SimpleName conf
opts SimpleName MethodInvocation SimpleName fs
conf SimpleName MethodInvocation SimpleName fs
system SimpleName MethodInvocation SimpleName exit
system SimpleName MethodInvocation PrefixExpression NumberLiteral empty
exit SimpleName MethodInvocation PrefixExpression NumberLiteral empty
optsreset security QualifiedName IfStatement Block IfStatement QualifiedName optsadd volumes
exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
log SimpleName MethodInvocation SimpleName fatal
log SimpleName MethodInvocation SimpleName e
log SimpleName MethodInvocation SimpleName e
fatal SimpleName MethodInvocation SimpleName e
fatal SimpleName MethodInvocation SimpleName e
e SimpleName MethodInvocation SimpleName e
runtime exception SimpleName SimpleType ClassInstanceCreation SimpleName e
public Modifier MethodDeclaration Modifier static
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName main
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName args
static Modifier MethodDeclaration PrimitiveType void
static Modifier MethodDeclaration SimpleName main
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName args
void PrimitiveType MethodDeclaration SimpleName main
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName args
main SimpleName MethodDeclaration SingleVariableDeclaration SimpleName args
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration Modifier static
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName main
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName args
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration Modifier static
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName main
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName args
