result SimpleName VariableDeclarationFragment StringLiteral empty
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName result
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment StringLiteral empty
properties SimpleName MethodInvocation SimpleName size
properties SimpleName MethodInvocation InfixExpression NumberLiteral empty
size SimpleName MethodInvocation InfixExpression NumberLiteral empty
i SimpleName VariableDeclarationFragment InfixExpression MethodInvocation SimpleName properties
i SimpleName VariableDeclarationFragment InfixExpression MethodInvocation SimpleName size
i SimpleName VariableDeclarationFragment InfixExpression NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment InfixExpression NumberLiteral empty
i SimpleName InfixExpression NumberLiteral empty
properties SimpleName MethodInvocation SimpleName key
properties SimpleName MethodInvocation SimpleName i
key SimpleName MethodInvocation SimpleName i
empty StringLiteral InfixExpression MethodInvocation SimpleName properties
empty StringLiteral InfixExpression MethodInvocation SimpleName key
empty StringLiteral InfixExpression MethodInvocation SimpleName i
empty StringLiteral InfixExpression StringLiteral :
properties SimpleName MethodInvocation InfixExpression StringLiteral :
key SimpleName MethodInvocation InfixExpression StringLiteral :
i SimpleName MethodInvocation InfixExpression StringLiteral :
result SimpleName Assignment InfixExpression StringLiteral empty
result SimpleName Assignment InfixExpression MethodInvocation SimpleName properties
result SimpleName Assignment InfixExpression MethodInvocation SimpleName key
result SimpleName Assignment InfixExpression MethodInvocation SimpleName i
result SimpleName Assignment InfixExpression StringLiteral :
properties SimpleName MethodInvocation SimpleName item
properties SimpleName MethodInvocation SimpleName i
item SimpleName MethodInvocation SimpleName i
value entry SimpleName SimpleType CastExpression MethodInvocation SimpleName properties
value entry SimpleName SimpleType CastExpression MethodInvocation SimpleName item
value entry SimpleName SimpleType CastExpression MethodInvocation SimpleName i
ve SimpleName VariableDeclarationFragment CastExpression SimpleType SimpleName value entry
ve SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName properties
ve SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName item
ve SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName i
value entry SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName ve
css value SimpleName SimpleType CastExpression QualifiedName vevalue
vevalue QualifiedName CastExpression ParenthesizedExpression MethodInvocation SimpleName get css text
result SimpleName Assignment MethodInvocation SimpleName get css text
vepriority QualifiedName InfixExpression StringLiteral 
result SimpleName Assignment InfixExpression QualifiedName vepriority
result SimpleName Assignment InfixExpression StringLiteral 
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression NumberLiteral empty
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
empty NumberLiteral InfixExpression ForStatement PostfixExpression SimpleName i
public Modifier MethodDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SimpleName get css text
public Modifier MethodDeclaration Block ReturnStatement SimpleName result
string SimpleName SimpleType MethodDeclaration SimpleName get css text
get css text SimpleName MethodDeclaration Block ReturnStatement SimpleName result
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName string
public Modifier TypeDeclaration MethodDeclaration SimpleName get css text
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName string
test SimpleName TypeDeclaration MethodDeclaration SimpleName get css text
