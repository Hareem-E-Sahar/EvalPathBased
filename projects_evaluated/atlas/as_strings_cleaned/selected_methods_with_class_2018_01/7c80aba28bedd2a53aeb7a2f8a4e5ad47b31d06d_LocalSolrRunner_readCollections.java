solr StringLiteral InfixExpression SimpleName collections file
res name SimpleName VariableDeclarationFragment InfixExpression StringLiteral solr
res name SimpleName VariableDeclarationFragment InfixExpression SimpleName collections file
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName res name
local solr runner SimpleName SimpleType TypeLiteral MethodInvocation SimpleName get resource as stream
local solr runner SimpleName SimpleType TypeLiteral MethodInvocation SimpleName res name
get resource as stream SimpleName MethodInvocation SimpleName res name
input stream SimpleName VariableDeclarationFragment MethodInvocation SimpleName get resource as stream
input stream SimpleName VariableDeclarationFragment MethodInvocation SimpleName res name
input stream SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName input stream
input stream reader SimpleName SimpleType ClassInstanceCreation SimpleName input stream
isr SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName input stream reader
isr SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName input stream
input stream reader SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName isr
buffered reader SimpleName SimpleType ClassInstanceCreation SimpleName isr
buffer SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName buffered reader
buffer SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName isr
buffered reader SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName buffer
pattern SimpleName MethodInvocation SimpleName compile
pattern SimpleName MethodInvocation StringLiteral s
compile SimpleName MethodInvocation StringLiteral s
buffer SimpleName MethodInvocation SimpleName lines
collectors SimpleName MethodInvocation SimpleName joining
collectors SimpleName MethodInvocation StringLiteral empty
joining SimpleName MethodInvocation StringLiteral empty
buffer SimpleName MethodInvocation MethodInvocation SimpleName collect
lines SimpleName MethodInvocation MethodInvocation SimpleName collect
buffer SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName collectors
buffer SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName joining
buffer SimpleName MethodInvocation MethodInvocation MethodInvocation StringLiteral empty
lines SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName collectors
lines SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName joining
lines SimpleName MethodInvocation MethodInvocation MethodInvocation StringLiteral empty
collect SimpleName MethodInvocation MethodInvocation SimpleName collectors
collect SimpleName MethodInvocation MethodInvocation SimpleName joining
collect SimpleName MethodInvocation MethodInvocation StringLiteral empty
pattern SimpleName MethodInvocation MethodInvocation SimpleName split
compile SimpleName MethodInvocation MethodInvocation SimpleName split
s StringLiteral MethodInvocation MethodInvocation SimpleName split
pattern SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName collect
compile SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName collect
s StringLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName collect
split SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName buffer
split SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName lines
split SimpleName MethodInvocation MethodInvocation SimpleName collect
split SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName collectors
split SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName joining
split SimpleName MethodInvocation MethodInvocation MethodInvocation StringLiteral empty
exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
runtime exception SimpleName SimpleType ClassInstanceCreation StringLiteral unable to read collections file
runtime exception SimpleName SimpleType ClassInstanceCreation SimpleName e
unable to read collections file StringLiteral ClassInstanceCreation SimpleName e
private Modifier MethodDeclaration Modifier static
private Modifier MethodDeclaration ArrayType SimpleType SimpleName string
private Modifier MethodDeclaration SimpleName read collections
static Modifier MethodDeclaration ArrayType SimpleType SimpleName string
static Modifier MethodDeclaration SimpleName read collections
string SimpleName SimpleType ArrayType MethodDeclaration SimpleName read collections
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration Modifier static
public Modifier TypeDeclaration MethodDeclaration SimpleName read collections
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration Modifier static
test SimpleName TypeDeclaration MethodDeclaration SimpleName read collections
