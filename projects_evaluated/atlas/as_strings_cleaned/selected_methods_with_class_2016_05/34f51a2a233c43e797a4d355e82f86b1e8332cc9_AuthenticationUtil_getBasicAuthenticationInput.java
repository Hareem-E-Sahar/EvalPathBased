string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName username
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName password
input stream reader SimpleName SimpleType ClassInstanceCreation QualifiedName systemin
buffered reader SimpleName SimpleType ClassInstanceCreation ClassInstanceCreation QualifiedName systemin
buffer read SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName buffered reader
buffer read SimpleName VariableDeclarationFragment ClassInstanceCreation ClassInstanceCreation QualifiedName systemin
buffered reader SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName buffer read
systemout QualifiedName MethodInvocation SimpleName println
systemout QualifiedName MethodInvocation StringLiteral enter username for atlas :-
println SimpleName MethodInvocation StringLiteral enter username for atlas :-
buffer read SimpleName MethodInvocation SimpleName read line
username SimpleName Assignment MethodInvocation SimpleName buffer read
username SimpleName Assignment MethodInvocation SimpleName read line
systemout QualifiedName MethodInvocation SimpleName println
systemout QualifiedName MethodInvocation StringLiteral enter password for atlas :-
println SimpleName MethodInvocation StringLiteral enter password for atlas :-
buffer read SimpleName MethodInvocation SimpleName read line
password SimpleName Assignment MethodInvocation SimpleName buffer read
password SimpleName Assignment MethodInvocation SimpleName read line
exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
systemout QualifiedName MethodInvocation SimpleName print
systemout QualifiedName MethodInvocation StringLiteral error while reading
print SimpleName MethodInvocation StringLiteral error while reading
system SimpleName MethodInvocation SimpleName exit
system SimpleName MethodInvocation NumberLiteral empty
exit SimpleName MethodInvocation NumberLiteral empty
username SimpleName ArrayInitializer SimpleName password
public Modifier MethodDeclaration Modifier static
public Modifier MethodDeclaration ArrayType SimpleType SimpleName string
public Modifier MethodDeclaration SimpleName get basic authentication input
static Modifier MethodDeclaration ArrayType SimpleType SimpleName string
static Modifier MethodDeclaration SimpleName get basic authentication input
string SimpleName SimpleType ArrayType MethodDeclaration SimpleName get basic authentication input
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration Modifier static
public Modifier TypeDeclaration MethodDeclaration SimpleName get basic authentication input
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration Modifier static
test SimpleName TypeDeclaration MethodDeclaration SimpleName get basic authentication input
