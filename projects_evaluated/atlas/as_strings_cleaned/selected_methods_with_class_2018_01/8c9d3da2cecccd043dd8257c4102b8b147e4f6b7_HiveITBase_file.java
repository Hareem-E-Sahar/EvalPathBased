string SimpleName SimpleType SingleVariableDeclaration SimpleName tag
system SimpleName MethodInvocation SimpleName get property
system SimpleName MethodInvocation StringLiteral userdir
get property SimpleName MethodInvocation StringLiteral userdir
system SimpleName MethodInvocation InfixExpression StringLiteral target
get property SimpleName MethodInvocation InfixExpression StringLiteral target
userdir StringLiteral MethodInvocation InfixExpression StringLiteral target
system SimpleName MethodInvocation InfixExpression SimpleName tag
get property SimpleName MethodInvocation InfixExpression SimpleName tag
userdir StringLiteral MethodInvocation InfixExpression SimpleName tag
system SimpleName MethodInvocation InfixExpression StringLiteral data
get property SimpleName MethodInvocation InfixExpression StringLiteral data
userdir StringLiteral MethodInvocation InfixExpression StringLiteral data
system SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName random
get property SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName random
userdir StringLiteral MethodInvocation InfixExpression MethodInvocation SimpleName random
target StringLiteral InfixExpression SimpleName tag
target StringLiteral InfixExpression StringLiteral data
target StringLiteral InfixExpression MethodInvocation SimpleName random
tag SimpleName InfixExpression StringLiteral data
tag SimpleName InfixExpression MethodInvocation SimpleName random
data StringLiteral InfixExpression MethodInvocation SimpleName random
filename SimpleName VariableDeclarationFragment InfixExpression MethodInvocation SimpleName system
filename SimpleName VariableDeclarationFragment InfixExpression MethodInvocation SimpleName get property
filename SimpleName VariableDeclarationFragment InfixExpression MethodInvocation StringLiteral userdir
filename SimpleName VariableDeclarationFragment InfixExpression StringLiteral target
filename SimpleName VariableDeclarationFragment InfixExpression SimpleName tag
filename SimpleName VariableDeclarationFragment InfixExpression StringLiteral data
filename SimpleName VariableDeclarationFragment InfixExpression MethodInvocation SimpleName random
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName filename
file SimpleName SimpleType ClassInstanceCreation SimpleName filename
file SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName file
file SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName filename
file SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName file
file SimpleName MethodInvocation SimpleName create new file
file SimpleName MethodInvocation SimpleName get absolute path
protected Modifier MethodDeclaration SimpleType SimpleName string
protected Modifier MethodDeclaration SimpleName file
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleName tag
protected Modifier MethodDeclaration SimpleType SimpleName exception
string SimpleName SimpleType MethodDeclaration SimpleName file
string SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName tag
string SimpleName SimpleType MethodDeclaration SimpleType SimpleName exception
file SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
file SimpleName MethodDeclaration SingleVariableDeclaration SimpleName tag
file SimpleName MethodDeclaration SimpleType SimpleName exception
tag SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier protected
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName string
public Modifier TypeDeclaration MethodDeclaration SimpleName file
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName tag
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration Modifier protected
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName string
test SimpleName TypeDeclaration MethodDeclaration SimpleName file
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName tag
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
