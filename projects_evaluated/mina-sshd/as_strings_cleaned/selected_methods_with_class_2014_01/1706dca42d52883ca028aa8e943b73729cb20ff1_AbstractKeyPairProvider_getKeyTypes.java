list SimpleName SimpleType ParameterizedType SimpleType SimpleName string
array list SimpleName SimpleType ParameterizedType SimpleType SimpleName string
keys SimpleName VariableDeclarationFragment MethodInvocation SimpleName load keys
key pair SimpleName SimpleType SingleVariableDeclaration SimpleName key
get key type SimpleName MethodInvocation SimpleName key
type SimpleName VariableDeclarationFragment MethodInvocation SimpleName get key type
type SimpleName VariableDeclarationFragment MethodInvocation SimpleName key
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName type
types SimpleName MethodInvocation SimpleName contains
types SimpleName MethodInvocation SimpleName type
contains SimpleName MethodInvocation SimpleName type
types SimpleName MethodInvocation SimpleName add
types SimpleName MethodInvocation SimpleName type
add SimpleName MethodInvocation SimpleName type
key pair SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName keys
key SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName keys
sb SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName string builder
string builder SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName sb
string SimpleName SimpleType SingleVariableDeclaration SimpleName type
sb SimpleName MethodInvocation SimpleName length
sb SimpleName MethodInvocation InfixExpression NumberLiteral empty
length SimpleName MethodInvocation InfixExpression NumberLiteral empty
sb SimpleName MethodInvocation SimpleName append
sb SimpleName MethodInvocation StringLiteral empty
append SimpleName MethodInvocation StringLiteral empty
sb SimpleName MethodInvocation SimpleName append
sb SimpleName MethodInvocation SimpleName type
append SimpleName MethodInvocation SimpleName type
string SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName types
type SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName types
sb SimpleName MethodInvocation SimpleName to string
keys SimpleName EnhancedForStatement Block EnhancedForStatement SimpleName types
public Modifier MethodDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SimpleName get key types
public Modifier MethodDeclaration Block EnhancedForStatement SimpleName keys
public Modifier MethodDeclaration Block EnhancedForStatement SimpleName types
string SimpleName SimpleType MethodDeclaration SimpleName get key types
get key types SimpleName MethodDeclaration Block EnhancedForStatement SimpleName keys
get key types SimpleName MethodDeclaration Block EnhancedForStatement SimpleName types
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName string
public Modifier TypeDeclaration MethodDeclaration SimpleName get key types
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName string
test SimpleName TypeDeclaration MethodDeclaration SimpleName get key types
