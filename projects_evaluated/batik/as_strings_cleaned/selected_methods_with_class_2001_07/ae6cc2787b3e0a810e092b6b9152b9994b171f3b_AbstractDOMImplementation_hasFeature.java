string SimpleName SimpleType SingleVariableDeclaration SimpleName feature
string SimpleName SimpleType SingleVariableDeclaration SimpleName version
feature SimpleName MethodInvocation SimpleName to lower case
features SimpleName MethodInvocation SimpleName get
features SimpleName MethodInvocation MethodInvocation SimpleName feature
features SimpleName MethodInvocation MethodInvocation SimpleName to lower case
get SimpleName MethodInvocation MethodInvocation SimpleName feature
get SimpleName MethodInvocation MethodInvocation SimpleName to lower case
v SimpleName VariableDeclarationFragment MethodInvocation SimpleName features
v SimpleName VariableDeclarationFragment MethodInvocation SimpleName get
v SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName feature
v SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName to lower case
object SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName v
version SimpleName MethodInvocation SimpleName length
version SimpleName MethodInvocation InfixExpression NumberLiteral empty
length SimpleName MethodInvocation InfixExpression NumberLiteral empty
version SimpleName InfixExpression InfixExpression InfixExpression NumberLiteral empty
v SimpleName InstanceofExpression SimpleType SimpleName string
version SimpleName MethodInvocation SimpleName equals
version SimpleName MethodInvocation SimpleName v
equals SimpleName MethodInvocation SimpleName v
string SimpleName SimpleType ArrayType CastExpression SimpleName v
va SimpleName VariableDeclarationFragment CastExpression SimpleName v
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression QualifiedName valength
va SimpleName ArrayAccess SimpleName i
v SimpleName MethodInvocation SimpleName equals
v SimpleName MethodInvocation ArrayAccess SimpleName va
v SimpleName MethodInvocation ArrayAccess SimpleName i
equals SimpleName MethodInvocation ArrayAccess SimpleName va
equals SimpleName MethodInvocation ArrayAccess SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression QualifiedName valength
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
valength QualifiedName InfixExpression ForStatement PostfixExpression SimpleName i
public Modifier MethodDeclaration PrimitiveType boolean
public Modifier MethodDeclaration SimpleName has feature
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName feature
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName version
boolean PrimitiveType MethodDeclaration SimpleName has feature
boolean PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
boolean PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName feature
boolean PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
boolean PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName version
has feature SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
has feature SimpleName MethodDeclaration SingleVariableDeclaration SimpleName feature
has feature SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
has feature SimpleName MethodDeclaration SingleVariableDeclaration SimpleName version
feature SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName version
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType boolean
public Modifier TypeDeclaration MethodDeclaration SimpleName has feature
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName feature
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName version
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType boolean
test SimpleName TypeDeclaration MethodDeclaration SimpleName has feature
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName feature
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName version