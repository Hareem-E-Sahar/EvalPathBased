string SimpleName SimpleType SingleVariableDeclaration SimpleName path
path SimpleName MethodInvocation SimpleName replace all
path SimpleName MethodInvocation StringLiteral /$
path SimpleName MethodInvocation StringLiteral empty
replace all SimpleName MethodInvocation StringLiteral /$
replace all SimpleName MethodInvocation StringLiteral empty
/$ StringLiteral MethodInvocation StringLiteral empty
path SimpleName Assignment MethodInvocation SimpleName path
path SimpleName Assignment MethodInvocation SimpleName replace all
path SimpleName Assignment MethodInvocation StringLiteral /$
path SimpleName Assignment MethodInvocation StringLiteral empty
path SimpleName MethodInvocation SimpleName split
path SimpleName MethodInvocation StringLiteral /
split SimpleName MethodInvocation StringLiteral /
recurse SimpleName MethodInvocation SimpleName root
recurse SimpleName MethodInvocation MethodInvocation SimpleName path
recurse SimpleName MethodInvocation MethodInvocation SimpleName split
recurse SimpleName MethodInvocation MethodInvocation StringLiteral /
recurse SimpleName MethodInvocation NumberLiteral empty
root SimpleName MethodInvocation MethodInvocation SimpleName path
root SimpleName MethodInvocation MethodInvocation SimpleName split
root SimpleName MethodInvocation MethodInvocation StringLiteral /
root SimpleName MethodInvocation NumberLiteral empty
path SimpleName MethodInvocation MethodInvocation NumberLiteral empty
split SimpleName MethodInvocation MethodInvocation NumberLiteral empty
/ StringLiteral MethodInvocation MethodInvocation NumberLiteral empty
private Modifier MethodDeclaration SimpleType SimpleName node
private Modifier MethodDeclaration SimpleName navigate
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName path
node SimpleName SimpleType MethodDeclaration SimpleName navigate
node SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName path
navigate SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
navigate SimpleName MethodDeclaration SingleVariableDeclaration SimpleName path
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName node
public Modifier TypeDeclaration MethodDeclaration SimpleName navigate
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName path
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName node
test SimpleName TypeDeclaration MethodDeclaration SimpleName navigate
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName path
