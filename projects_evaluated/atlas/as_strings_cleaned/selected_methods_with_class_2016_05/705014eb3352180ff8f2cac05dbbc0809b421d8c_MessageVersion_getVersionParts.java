version SimpleName MethodInvocation SimpleName split
version SimpleName MethodInvocation StringLiteral \\.
split SimpleName MethodInvocation StringLiteral \\.
s parts SimpleName VariableDeclarationFragment MethodInvocation SimpleName version
s parts SimpleName VariableDeclarationFragment MethodInvocation SimpleName split
s parts SimpleName VariableDeclarationFragment MethodInvocation StringLiteral \\.
array list SimpleName SimpleType ParameterizedType SimpleType SimpleName integer
trailing zeros SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName trailing zeros
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment NumberLiteral empty
string SimpleName SimpleType SingleVariableDeclaration SimpleName s part
integer SimpleName SimpleType ClassInstanceCreation SimpleName s part
i part SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName integer
i part SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName s part
integer SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName i part
i part SimpleName InfixExpression NumberLiteral empty
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression SimpleName trailing zeros
i parts SimpleName MethodInvocation SimpleName add
i parts SimpleName MethodInvocation NumberLiteral empty
add SimpleName MethodInvocation NumberLiteral empty
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName trailing zeros
int PrimitiveType VariableDeclarationExpression ForStatement PrefixExpression SimpleName i
i SimpleName InfixExpression ForStatement PrefixExpression SimpleName i
trailing zeros SimpleName InfixExpression ForStatement PrefixExpression SimpleName i
trailing zeros SimpleName Assignment NumberLiteral empty
i parts SimpleName MethodInvocation SimpleName add
i parts SimpleName MethodInvocation SimpleName i part
add SimpleName MethodInvocation SimpleName i part
string SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName s parts
s part SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName s parts
i parts SimpleName MethodInvocation SimpleName size
i parts SimpleName MethodInvocation SimpleName to array
i parts SimpleName MethodInvocation ArrayCreation MethodInvocation SimpleName i parts
i parts SimpleName MethodInvocation ArrayCreation MethodInvocation SimpleName size
to array SimpleName MethodInvocation ArrayCreation MethodInvocation SimpleName i parts
to array SimpleName MethodInvocation ArrayCreation MethodInvocation SimpleName size
int PrimitiveType VariableDeclarationStatement Block EnhancedForStatement SimpleName s parts
protected Modifier MethodDeclaration ArrayType SimpleType SimpleName integer
protected Modifier MethodDeclaration SimpleName get version parts
protected Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
protected Modifier MethodDeclaration Block EnhancedForStatement SimpleName s parts
integer SimpleName SimpleType ArrayType MethodDeclaration SimpleName get version parts
get version parts SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
get version parts SimpleName MethodDeclaration Block EnhancedForStatement SimpleName s parts
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier protected
public Modifier TypeDeclaration MethodDeclaration SimpleName get version parts
test SimpleName TypeDeclaration MethodDeclaration Modifier protected
test SimpleName TypeDeclaration MethodDeclaration SimpleName get version parts