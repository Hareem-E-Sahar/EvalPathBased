string SimpleName SimpleType SingleVariableDeclaration SimpleName mkey
url SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName last
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment NumberLiteral empty
v SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName array list
array list SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName v
mkey SimpleName InfixExpression SimpleName i
get url SimpleName MethodInvocation InfixExpression SimpleName mkey
get url SimpleName MethodInvocation InfixExpression SimpleName i
last SimpleName Assignment MethodInvocation SimpleName get url
last SimpleName Assignment MethodInvocation InfixExpression SimpleName mkey
last SimpleName Assignment MethodInvocation InfixExpression SimpleName i
v SimpleName MethodInvocation SimpleName add
v SimpleName MethodInvocation SimpleName last
add SimpleName MethodInvocation SimpleName last
v SimpleName MethodInvocation SimpleName size
v SimpleName MethodInvocation InfixExpression NumberLiteral empty
size SimpleName MethodInvocation InfixExpression NumberLiteral empty
v SimpleName MethodInvocation SimpleName size
path SimpleName VariableDeclarationFragment ArrayCreation MethodInvocation SimpleName v
path SimpleName VariableDeclarationFragment ArrayCreation MethodInvocation SimpleName size
v SimpleName MethodInvocation SimpleName to array
v SimpleName MethodInvocation SimpleName path
to array SimpleName MethodInvocation SimpleName path
get default SimpleName MethodInvocation SimpleName mkey
int PrimitiveType VariableDeclarationStatement Block WhileStatement BooleanLiteral true
public Modifier MethodDeclaration ArrayType SimpleType SimpleName url
public Modifier MethodDeclaration SimpleName get ur ls
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName mkey
public Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
public Modifier MethodDeclaration Block WhileStatement BooleanLiteral true
url SimpleName SimpleType ArrayType MethodDeclaration SimpleName get ur ls
get ur ls SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
get ur ls SimpleName MethodDeclaration SingleVariableDeclaration SimpleName mkey
get ur ls SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
get ur ls SimpleName MethodDeclaration Block WhileStatement BooleanLiteral true
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration SimpleName get ur ls
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName mkey
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration SimpleName get ur ls
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName mkey
