pair SimpleName SimpleType ParameterizedType SimpleType SimpleName path
pair SimpleName SimpleType ParameterizedType SimpleType SimpleName boolean
path SimpleName SimpleType ParameterizedType SimpleType SimpleName boolean
int PrimitiveType SingleVariableDeclaration SimpleName id
string SimpleName SimpleType SingleVariableDeclaration SimpleName path
collection SimpleName SimpleType ParameterizedType SimpleType SimpleName string
collection SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName extra paths
string SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName extra paths
link option SimpleName SimpleType SingleVariableDeclaration SimpleName options
resolve file SimpleName MethodInvocation SimpleName path
p SimpleName VariableDeclarationFragment MethodInvocation SimpleName resolve file
p SimpleName VariableDeclarationFragment MethodInvocation SimpleName path
path SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName p
generic utils SimpleName MethodInvocation SimpleName size
generic utils SimpleName MethodInvocation SimpleName extra paths
size SimpleName MethodInvocation SimpleName extra paths
num extra SimpleName VariableDeclarationFragment MethodInvocation SimpleName generic utils
num extra SimpleName VariableDeclarationFragment MethodInvocation SimpleName size
num extra SimpleName VariableDeclarationFragment MethodInvocation SimpleName extra paths
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName num extra
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName generic utils
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName size
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName extra paths
num extra SimpleName InfixExpression NumberLiteral empty
generic utils SimpleName MethodInvocation SimpleName length
generic utils SimpleName MethodInvocation SimpleName path
length SimpleName MethodInvocation SimpleName path
num extra SimpleName InfixExpression NumberLiteral empty
generic utils SimpleName MethodInvocation InfixExpression InfixExpression SimpleName num extra
generic utils SimpleName MethodInvocation InfixExpression InfixExpression NumberLiteral empty
length SimpleName MethodInvocation InfixExpression InfixExpression SimpleName num extra
length SimpleName MethodInvocation InfixExpression InfixExpression NumberLiteral empty
path SimpleName MethodInvocation InfixExpression InfixExpression SimpleName num extra
path SimpleName MethodInvocation InfixExpression InfixExpression NumberLiteral empty
sb SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName string builder
string builder SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName sb
sb SimpleName MethodInvocation SimpleName append
sb SimpleName MethodInvocation SimpleName path
append SimpleName MethodInvocation SimpleName path
string SimpleName SimpleType SingleVariableDeclaration SimpleName p
p SimpleName MethodInvocation SimpleName resolve
p SimpleName MethodInvocation SimpleName p
resolve SimpleName MethodInvocation SimpleName p
p SimpleName Assignment MethodInvocation SimpleName p
p SimpleName Assignment MethodInvocation SimpleName resolve
p SimpleName Assignment MethodInvocation SimpleName p
sb SimpleName MethodInvocation SimpleName append
sb SimpleName MethodInvocation CharacterLiteral /
append SimpleName MethodInvocation CharacterLiteral /
sb SimpleName MethodInvocation MethodInvocation SimpleName append
append SimpleName MethodInvocation MethodInvocation SimpleName append
/ CharacterLiteral MethodInvocation MethodInvocation SimpleName append
sb SimpleName MethodInvocation MethodInvocation SimpleName p
append SimpleName MethodInvocation MethodInvocation SimpleName p
/ CharacterLiteral MethodInvocation MethodInvocation SimpleName p
append SimpleName MethodInvocation SimpleName p
string SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName extra paths
p SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName extra paths
sb SimpleName MethodInvocation SimpleName to string
path SimpleName Assignment MethodInvocation SimpleName sb
path SimpleName Assignment MethodInvocation SimpleName to string
validate real path SimpleName MethodInvocation SimpleName id
validate real path SimpleName MethodInvocation SimpleName path
validate real path SimpleName MethodInvocation SimpleName p
validate real path SimpleName MethodInvocation SimpleName options
id SimpleName MethodInvocation SimpleName path
id SimpleName MethodInvocation SimpleName p
id SimpleName MethodInvocation SimpleName options
path SimpleName MethodInvocation SimpleName p
path SimpleName MethodInvocation SimpleName options
p SimpleName MethodInvocation SimpleName options
protected Modifier MethodDeclaration ParameterizedType SimpleType SimpleName pair
protected Modifier MethodDeclaration ParameterizedType SimpleType SimpleName path
protected Modifier MethodDeclaration ParameterizedType SimpleType SimpleName boolean
protected Modifier MethodDeclaration SimpleName do real path v
protected Modifier MethodDeclaration SingleVariableDeclaration PrimitiveType int
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleName id
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleName path
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleName extra paths
pair SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName do real path v
path SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName do real path v
boolean SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName do real path v
do real path v SimpleName MethodDeclaration SingleVariableDeclaration PrimitiveType int
do real path v SimpleName MethodDeclaration SingleVariableDeclaration SimpleName id
do real path v SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
do real path v SimpleName MethodDeclaration SingleVariableDeclaration SimpleName path
do real path v SimpleName MethodDeclaration SingleVariableDeclaration SimpleName extra paths
do real path v SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName link option
do real path v SimpleName MethodDeclaration SingleVariableDeclaration SimpleName options
do real path v SimpleName MethodDeclaration SimpleType SimpleName io exception
int PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName path
id SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName path
int PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName extra paths
id SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName extra paths
int PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName options
id SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName options
int PrimitiveType SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
id SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
path SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName extra paths
path SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName options
path SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
extra paths SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName options
extra paths SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
options SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier protected
public Modifier TypeDeclaration MethodDeclaration SimpleName do real path v
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName id
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName path
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName extra paths
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName options
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
test SimpleName TypeDeclaration MethodDeclaration Modifier protected
test SimpleName TypeDeclaration MethodDeclaration SimpleName do real path v
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName id
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName path
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName extra paths
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName options
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
