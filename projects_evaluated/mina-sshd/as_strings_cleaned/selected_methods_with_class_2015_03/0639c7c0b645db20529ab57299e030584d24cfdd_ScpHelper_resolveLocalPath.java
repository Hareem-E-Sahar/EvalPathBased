string SimpleName SimpleType SingleVariableDeclaration SimpleName path
path SimpleName MethodInvocation SimpleName replace
path SimpleName MethodInvocation CharacterLiteral /
path SimpleName MethodInvocation QualifiedName fileseparator char
replace SimpleName MethodInvocation CharacterLiteral /
replace SimpleName MethodInvocation QualifiedName fileseparator char
/ CharacterLiteral MethodInvocation QualifiedName fileseparator char
local path SimpleName VariableDeclarationFragment ConditionalExpression MethodInvocation SimpleName path
local path SimpleName VariableDeclarationFragment ConditionalExpression MethodInvocation SimpleName replace
local path SimpleName VariableDeclarationFragment ConditionalExpression MethodInvocation CharacterLiteral /
local path SimpleName VariableDeclarationFragment ConditionalExpression MethodInvocation QualifiedName fileseparator char
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName local path
file system SimpleName MethodInvocation SimpleName get path
file system SimpleName MethodInvocation SimpleName local path
get path SimpleName MethodInvocation SimpleName local path
public Modifier MethodDeclaration SimpleType SimpleName path
public Modifier MethodDeclaration SimpleName resolve local path
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName path
path SimpleName SimpleType MethodDeclaration SimpleName resolve local path
path SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName path
resolve local path SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
resolve local path SimpleName MethodDeclaration SingleVariableDeclaration SimpleName path
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName path
public Modifier TypeDeclaration MethodDeclaration SimpleName resolve local path
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName path
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName path
test SimpleName TypeDeclaration MethodDeclaration SimpleName resolve local path
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName path
