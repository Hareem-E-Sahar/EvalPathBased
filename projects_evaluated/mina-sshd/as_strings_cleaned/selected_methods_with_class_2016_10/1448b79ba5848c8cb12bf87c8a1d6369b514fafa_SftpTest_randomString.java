int PrimitiveType SingleVariableDeclaration SimpleName size
string builder SimpleName SimpleType ClassInstanceCreation SimpleName size
sb SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName string builder
sb SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName size
string builder SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName sb
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression SimpleName size
i SimpleName InfixExpression NumberLiteral empty
i SimpleName InfixExpression ParenthesizedExpression InfixExpression CharacterLiteral empty
empty NumberLiteral InfixExpression ParenthesizedExpression InfixExpression CharacterLiteral empty
char PrimitiveType CastExpression ParenthesizedExpression InfixExpression CharacterLiteral empty
sb SimpleName MethodInvocation SimpleName append
sb SimpleName MethodInvocation CastExpression PrimitiveType char
append SimpleName MethodInvocation CastExpression PrimitiveType char
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName size
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
size SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
sb SimpleName MethodInvocation SimpleName to string
private Modifier MethodDeclaration SimpleType SimpleName string
private Modifier MethodDeclaration SimpleName random string
private Modifier MethodDeclaration SingleVariableDeclaration PrimitiveType int
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName size
string SimpleName SimpleType MethodDeclaration SimpleName random string
string SimpleName SimpleType MethodDeclaration SingleVariableDeclaration PrimitiveType int
string SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName size
random string SimpleName MethodDeclaration SingleVariableDeclaration PrimitiveType int
random string SimpleName MethodDeclaration SingleVariableDeclaration SimpleName size
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName string
public Modifier TypeDeclaration MethodDeclaration SimpleName random string
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName size
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName string
test SimpleName TypeDeclaration MethodDeclaration SimpleName random string
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName size
