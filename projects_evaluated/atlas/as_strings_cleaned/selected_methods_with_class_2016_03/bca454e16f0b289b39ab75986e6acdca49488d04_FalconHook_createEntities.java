list SimpleName SimpleType ParameterizedType SimpleType SimpleName referenceable
falcon event SimpleName SimpleType SingleVariableDeclaration SimpleName event
event SimpleName MethodInvocation SimpleName get operation
event SimpleName MethodInvocation SimpleName get entity
process SimpleName SimpleType CastExpression MethodInvocation SimpleName event
process SimpleName SimpleType CastExpression MethodInvocation SimpleName get entity
event SimpleName MethodInvocation SimpleName get user
event SimpleName MethodInvocation SimpleName get timestamp
create process instance SimpleName MethodInvocation CastExpression SimpleType SimpleName process
create process instance SimpleName MethodInvocation CastExpression MethodInvocation SimpleName event
create process instance SimpleName MethodInvocation CastExpression MethodInvocation SimpleName get entity
create process instance SimpleName MethodInvocation MethodInvocation SimpleName event
create process instance SimpleName MethodInvocation MethodInvocation SimpleName get user
create process instance SimpleName MethodInvocation MethodInvocation SimpleName event
create process instance SimpleName MethodInvocation MethodInvocation SimpleName get timestamp
event SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName event
event SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get timestamp
get user SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName event
get user SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get timestamp
event SimpleName MethodInvocation SwitchStatement SwitchCase SimpleName add process
get operation SimpleName MethodInvocation SwitchStatement SwitchCase SimpleName add process
private Modifier MethodDeclaration ParameterizedType SimpleType SimpleName list
private Modifier MethodDeclaration ParameterizedType SimpleType SimpleName referenceable
private Modifier MethodDeclaration SimpleName create entities
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName falcon event
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName event
private Modifier MethodDeclaration SimpleType SimpleName exception
list SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName create entities
referenceable SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName create entities
create entities SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName falcon event
create entities SimpleName MethodDeclaration SingleVariableDeclaration SimpleName event
create entities SimpleName MethodDeclaration SimpleType SimpleName exception
event SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration SimpleName create entities
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName event
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration SimpleName create entities
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName event
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception