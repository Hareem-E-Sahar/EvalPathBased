database name SimpleName InfixExpression MethodInvocation SimpleName random
create hive db SimpleName MethodInvocation InfixExpression SimpleName database name
create hive db SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName random
hive db SimpleName VariableDeclarationFragment MethodInvocation SimpleName create hive db
hive db SimpleName VariableDeclarationFragment MethodInvocation InfixExpression SimpleName database name
atlas entity SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName hive db
hive db SimpleName MethodInvocation SimpleName get attribute
hive db SimpleName MethodInvocation SimpleName name
get attribute SimpleName MethodInvocation SimpleName name
string SimpleName SimpleType CastExpression MethodInvocation SimpleName hive db
string SimpleName SimpleType CastExpression MethodInvocation SimpleName get attribute
string SimpleName SimpleType CastExpression MethodInvocation SimpleName name
qualified name SimpleName VariableDeclarationFragment CastExpression SimpleType SimpleName string
qualified name SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName hive db
qualified name SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName get attribute
qualified name SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName qualified name
entities client v SimpleName MethodInvocation SimpleName delete entity by attribute
entities client v SimpleName MethodInvocation SimpleName database type v
entities client v SimpleName MethodInvocation SimpleName name
entities client v SimpleName MethodInvocation SimpleName qualified name
delete entity by attribute SimpleName MethodInvocation SimpleName database type v
delete entity by attribute SimpleName MethodInvocation SimpleName name
delete entity by attribute SimpleName MethodInvocation SimpleName qualified name
database type v SimpleName MethodInvocation SimpleName name
database type v SimpleName MethodInvocation SimpleName qualified name
name SimpleName MethodInvocation SimpleName qualified name
delete response SimpleName VariableDeclarationFragment MethodInvocation SimpleName entities client v
delete response SimpleName VariableDeclarationFragment MethodInvocation SimpleName delete entity by attribute
delete response SimpleName VariableDeclarationFragment MethodInvocation SimpleName database type v
delete response SimpleName VariableDeclarationFragment MethodInvocation SimpleName name
delete response SimpleName VariableDeclarationFragment MethodInvocation SimpleName qualified name
entity mutation response SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName delete response
assert not null SimpleName MethodInvocation SimpleName delete response
delete response SimpleName MethodInvocation SimpleName get entities by operation
delete response SimpleName MethodInvocation QualifiedName entity mutationsentity operationdelete
get entities by operation SimpleName MethodInvocation QualifiedName entity mutationsentity operationdelete
assert not null SimpleName MethodInvocation MethodInvocation SimpleName delete response
assert not null SimpleName MethodInvocation MethodInvocation SimpleName get entities by operation
assert not null SimpleName MethodInvocation MethodInvocation QualifiedName entity mutationsentity operationdelete
delete response SimpleName MethodInvocation SimpleName get entities by operation
delete response SimpleName MethodInvocation QualifiedName entity mutationsentity operationdelete
get entities by operation SimpleName MethodInvocation QualifiedName entity mutationsentity operationdelete
delete response SimpleName MethodInvocation MethodInvocation SimpleName size
get entities by operation SimpleName MethodInvocation MethodInvocation SimpleName size
entity mutationsentity operationdelete QualifiedName MethodInvocation MethodInvocation SimpleName size
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName delete response
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get entities by operation
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName entity mutationsentity operationdelete
assert equals SimpleName MethodInvocation MethodInvocation SimpleName size
assert equals SimpleName MethodInvocation NumberLiteral empty
delete response SimpleName MethodInvocation MethodInvocation MethodInvocation NumberLiteral empty
get entities by operation SimpleName MethodInvocation MethodInvocation MethodInvocation NumberLiteral empty
entity mutationsentity operationdelete QualifiedName MethodInvocation MethodInvocation MethodInvocation NumberLiteral empty
size SimpleName MethodInvocation MethodInvocation NumberLiteral empty
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test delete entity by uniq attribute
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test delete entity by uniq attribute
public Modifier MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration SimpleName test delete entity by uniq attribute
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
test delete entity by uniq attribute SimpleName MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test delete entity by uniq attribute
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test delete entity by uniq attribute
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
