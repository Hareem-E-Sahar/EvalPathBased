string SimpleName SimpleType SingleVariableDeclaration SimpleName entity id
int PrimitiveType SingleVariableDeclaration SimpleName num events
list SimpleName SimpleType ParameterizedType SimpleType SimpleName entity audit event
short PrimitiveType CastExpression SimpleName num events
repository SimpleName MethodInvocation SimpleName list events
repository SimpleName MethodInvocation SimpleName entity id
repository SimpleName MethodInvocation CastExpression PrimitiveType short
repository SimpleName MethodInvocation CastExpression SimpleName num events
list events SimpleName MethodInvocation SimpleName entity id
list events SimpleName MethodInvocation CastExpression PrimitiveType short
list events SimpleName MethodInvocation CastExpression SimpleName num events
entity id SimpleName MethodInvocation CastExpression PrimitiveType short
entity id SimpleName MethodInvocation CastExpression SimpleName num events
events SimpleName VariableDeclarationFragment MethodInvocation SimpleName repository
events SimpleName VariableDeclarationFragment MethodInvocation SimpleName list events
events SimpleName VariableDeclarationFragment MethodInvocation SimpleName entity id
events SimpleName VariableDeclarationFragment MethodInvocation CastExpression PrimitiveType short
events SimpleName VariableDeclarationFragment MethodInvocation CastExpression SimpleName num events
assert not null SimpleName MethodInvocation SimpleName events
events SimpleName MethodInvocation SimpleName size
assert equals SimpleName MethodInvocation MethodInvocation SimpleName events
assert equals SimpleName MethodInvocation MethodInvocation SimpleName size
assert equals SimpleName MethodInvocation SimpleName num events
events SimpleName MethodInvocation MethodInvocation SimpleName num events
size SimpleName MethodInvocation MethodInvocation SimpleName num events
private Modifier MethodDeclaration PrimitiveType void
private Modifier MethodDeclaration SimpleName assert audit events
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName entity id
private Modifier MethodDeclaration SingleVariableDeclaration PrimitiveType int
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName num events
private Modifier MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration SimpleName assert audit events
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName entity id
void PrimitiveType MethodDeclaration SingleVariableDeclaration PrimitiveType int
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName num events
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
assert audit events SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
assert audit events SimpleName MethodDeclaration SingleVariableDeclaration SimpleName entity id
assert audit events SimpleName MethodDeclaration SingleVariableDeclaration PrimitiveType int
assert audit events SimpleName MethodDeclaration SingleVariableDeclaration SimpleName num events
assert audit events SimpleName MethodDeclaration SimpleType SimpleName exception
entity id SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
entity id SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName num events
entity id SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
int PrimitiveType SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
num events SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName assert audit events
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName entity id
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName num events
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName assert audit events
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName entity id
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName num events
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
