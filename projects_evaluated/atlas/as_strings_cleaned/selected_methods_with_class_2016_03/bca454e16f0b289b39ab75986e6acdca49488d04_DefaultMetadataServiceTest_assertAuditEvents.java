string SimpleName SimpleType SingleVariableDeclaration SimpleName id
entity audit repositoryentity audit action QualifiedName SimpleType SingleVariableDeclaration SimpleName action
list SimpleName SimpleType ParameterizedType SimpleType QualifiedName entity audit repositoryentity audit event
system SimpleName MethodInvocation SimpleName current time millis
short PrimitiveType CastExpression NumberLiteral empty
repository SimpleName MethodInvocation SimpleName list events
repository SimpleName MethodInvocation SimpleName id
repository SimpleName MethodInvocation MethodInvocation SimpleName system
repository SimpleName MethodInvocation MethodInvocation SimpleName current time millis
repository SimpleName MethodInvocation CastExpression PrimitiveType short
repository SimpleName MethodInvocation CastExpression NumberLiteral empty
list events SimpleName MethodInvocation SimpleName id
list events SimpleName MethodInvocation MethodInvocation SimpleName system
list events SimpleName MethodInvocation MethodInvocation SimpleName current time millis
list events SimpleName MethodInvocation CastExpression PrimitiveType short
list events SimpleName MethodInvocation CastExpression NumberLiteral empty
id SimpleName MethodInvocation MethodInvocation SimpleName system
id SimpleName MethodInvocation MethodInvocation SimpleName current time millis
id SimpleName MethodInvocation CastExpression PrimitiveType short
id SimpleName MethodInvocation CastExpression NumberLiteral empty
system SimpleName MethodInvocation MethodInvocation CastExpression PrimitiveType short
system SimpleName MethodInvocation MethodInvocation CastExpression NumberLiteral empty
current time millis SimpleName MethodInvocation MethodInvocation CastExpression PrimitiveType short
current time millis SimpleName MethodInvocation MethodInvocation CastExpression NumberLiteral empty
events SimpleName VariableDeclarationFragment MethodInvocation SimpleName repository
events SimpleName VariableDeclarationFragment MethodInvocation SimpleName list events
events SimpleName VariableDeclarationFragment MethodInvocation SimpleName id
events SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName system
events SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName current time millis
events SimpleName VariableDeclarationFragment MethodInvocation CastExpression PrimitiveType short
events SimpleName VariableDeclarationFragment MethodInvocation CastExpression NumberLiteral empty
entity audit repositoryentity audit event QualifiedName SimpleType SingleVariableDeclaration SimpleName event
event SimpleName MethodInvocation SimpleName get action
event SimpleName MethodInvocation InfixExpression SimpleName action
get action SimpleName MethodInvocation InfixExpression SimpleName action
entity audit repositoryentity audit event QualifiedName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName events
event SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName events
didnt find StringLiteral InfixExpression SimpleName action
didnt find StringLiteral InfixExpression StringLiteral in audit events
action SimpleName InfixExpression StringLiteral in audit events
fail SimpleName MethodInvocation InfixExpression StringLiteral didnt find
fail SimpleName MethodInvocation InfixExpression SimpleName action
fail SimpleName MethodInvocation InfixExpression StringLiteral in audit events
private Modifier MethodDeclaration PrimitiveType void
private Modifier MethodDeclaration SimpleName assert audit events
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName id
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType QualifiedName entity audit repositoryentity audit action
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName action
private Modifier MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration SimpleName assert audit events
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName id
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType QualifiedName entity audit repositoryentity audit action
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName action
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration Block EnhancedForStatement SimpleName events
assert audit events SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
assert audit events SimpleName MethodDeclaration SingleVariableDeclaration SimpleName id
assert audit events SimpleName MethodDeclaration SingleVariableDeclaration SimpleType QualifiedName entity audit repositoryentity audit action
assert audit events SimpleName MethodDeclaration SingleVariableDeclaration SimpleName action
assert audit events SimpleName MethodDeclaration SimpleType SimpleName exception
assert audit events SimpleName MethodDeclaration Block EnhancedForStatement SimpleName events
id SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName action
id SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
action SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName assert audit events
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName id
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName action
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName assert audit events
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName id
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName action
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
