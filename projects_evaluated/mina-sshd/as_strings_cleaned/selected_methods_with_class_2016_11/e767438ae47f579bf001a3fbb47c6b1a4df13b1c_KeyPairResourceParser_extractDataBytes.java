collection SimpleName SimpleType ParameterizedType SimpleType SimpleName string
collection SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName lines
string SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName lines
generic utils SimpleName MethodInvocation SimpleName join
generic utils SimpleName MethodInvocation SimpleName lines
generic utils SimpleName MethodInvocation CharacterLiteral empty
join SimpleName MethodInvocation SimpleName lines
join SimpleName MethodInvocation CharacterLiteral empty
lines SimpleName MethodInvocation CharacterLiteral empty
data SimpleName VariableDeclarationFragment MethodInvocation SimpleName generic utils
data SimpleName VariableDeclarationFragment MethodInvocation SimpleName join
data SimpleName VariableDeclarationFragment MethodInvocation SimpleName lines
data SimpleName VariableDeclarationFragment MethodInvocation CharacterLiteral empty
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName data
data SimpleName MethodInvocation SimpleName replace all
data SimpleName MethodInvocation StringLiteral s
data SimpleName MethodInvocation StringLiteral empty
replace all SimpleName MethodInvocation StringLiteral s
replace all SimpleName MethodInvocation StringLiteral empty
s StringLiteral MethodInvocation StringLiteral empty
data SimpleName Assignment MethodInvocation SimpleName data
data SimpleName Assignment MethodInvocation SimpleName replace all
data SimpleName Assignment MethodInvocation StringLiteral s
data SimpleName Assignment MethodInvocation StringLiteral empty
data SimpleName MethodInvocation SimpleName trim
data SimpleName Assignment MethodInvocation SimpleName data
data SimpleName Assignment MethodInvocation SimpleName trim
base SimpleName MethodInvocation SimpleName get decoder
decoder SimpleName VariableDeclarationFragment MethodInvocation SimpleName base
decoder SimpleName VariableDeclarationFragment MethodInvocation SimpleName get decoder
base decoder QualifiedName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName decoder
decoder SimpleName MethodInvocation SimpleName decode
decoder SimpleName MethodInvocation SimpleName data
decode SimpleName MethodInvocation SimpleName data
static Modifier MethodDeclaration ArrayType PrimitiveType byte
static Modifier MethodDeclaration SimpleName extract data bytes
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName lines
byte PrimitiveType ArrayType MethodDeclaration SimpleName extract data bytes
byte PrimitiveType ArrayType MethodDeclaration SingleVariableDeclaration SimpleName lines
extract data bytes SimpleName MethodDeclaration SingleVariableDeclaration SimpleName lines
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier static
public Modifier TypeDeclaration MethodDeclaration ArrayType PrimitiveType byte
public Modifier TypeDeclaration MethodDeclaration SimpleName extract data bytes
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName lines
test SimpleName TypeDeclaration MethodDeclaration Modifier static
test SimpleName TypeDeclaration MethodDeclaration ArrayType PrimitiveType byte
test SimpleName TypeDeclaration MethodDeclaration SimpleName extract data bytes
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName lines
