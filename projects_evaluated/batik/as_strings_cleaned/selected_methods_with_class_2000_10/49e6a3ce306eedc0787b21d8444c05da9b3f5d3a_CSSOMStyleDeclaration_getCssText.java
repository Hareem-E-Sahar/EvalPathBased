result SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName string buffer
string buffer SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName result
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
string SimpleName SimpleType CastExpression MethodInvocation SimpleName properties
string SimpleName SimpleType CastExpression MethodInvocation SimpleName key
string SimpleName SimpleType CastExpression MethodInvocation SimpleName i
key SimpleName VariableDeclarationFragment CastExpression SimpleType SimpleName string
key SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName properties
key SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName key
key SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName i
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName key
result SimpleName MethodInvocation SimpleName append
result SimpleName MethodInvocation StringLiteral empty
append SimpleName MethodInvocation StringLiteral empty
result SimpleName MethodInvocation MethodInvocation SimpleName append
append SimpleName MethodInvocation MethodInvocation SimpleName append
empty StringLiteral MethodInvocation MethodInvocation SimpleName append
result SimpleName MethodInvocation MethodInvocation SimpleName key
append SimpleName MethodInvocation MethodInvocation SimpleName key
empty StringLiteral MethodInvocation MethodInvocation SimpleName key
append SimpleName MethodInvocation SimpleName key
result SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName append
append SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName append
empty StringLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName append
append SimpleName MethodInvocation MethodInvocation SimpleName append
key SimpleName MethodInvocation MethodInvocation SimpleName append
result SimpleName MethodInvocation MethodInvocation MethodInvocation StringLiteral :
append SimpleName MethodInvocation MethodInvocation MethodInvocation StringLiteral :
empty StringLiteral MethodInvocation MethodInvocation MethodInvocation StringLiteral :
append SimpleName MethodInvocation MethodInvocation StringLiteral :
key SimpleName MethodInvocation MethodInvocation StringLiteral :
append SimpleName MethodInvocation StringLiteral :
properties SimpleName MethodInvocation SimpleName get
properties SimpleName MethodInvocation SimpleName key
get SimpleName MethodInvocation SimpleName key
value entry SimpleName SimpleType CastExpression MethodInvocation SimpleName properties
value entry SimpleName SimpleType CastExpression MethodInvocation SimpleName get
value entry SimpleName SimpleType CastExpression MethodInvocation SimpleName key
ve SimpleName VariableDeclarationFragment CastExpression SimpleType SimpleName value entry
ve SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName properties
ve SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName get
ve SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName key
value entry SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName ve
css value SimpleName SimpleType CastExpression QualifiedName vevalue
vevalue QualifiedName CastExpression ParenthesizedExpression MethodInvocation SimpleName get css text
result SimpleName MethodInvocation SimpleName append
result SimpleName MethodInvocation MethodInvocation SimpleName get css text
append SimpleName MethodInvocation MethodInvocation SimpleName get css text
result SimpleName MethodInvocation SimpleName append
result SimpleName MethodInvocation QualifiedName vepriority
append SimpleName MethodInvocation QualifiedName vepriority
result SimpleName MethodInvocation MethodInvocation SimpleName append
append SimpleName MethodInvocation MethodInvocation SimpleName append
vepriority QualifiedName MethodInvocation MethodInvocation SimpleName append
result SimpleName MethodInvocation MethodInvocation StringLiteral 
append SimpleName MethodInvocation MethodInvocation StringLiteral 
vepriority QualifiedName MethodInvocation MethodInvocation StringLiteral 
append SimpleName MethodInvocation StringLiteral 
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression NumberLiteral empty
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
empty NumberLiteral InfixExpression ForStatement PostfixExpression SimpleName i
result SimpleName MethodInvocation SimpleName to string
public Modifier MethodDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SimpleName get css text
string SimpleName SimpleType MethodDeclaration SimpleName get css text
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName string
public Modifier TypeDeclaration MethodDeclaration SimpleName get css text
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName string
test SimpleName TypeDeclaration MethodDeclaration SimpleName get css text
