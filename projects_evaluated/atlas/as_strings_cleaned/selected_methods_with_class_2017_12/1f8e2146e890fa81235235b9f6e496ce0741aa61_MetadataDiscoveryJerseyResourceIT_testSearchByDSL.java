enabled SimpleName MemberValuePair BooleanLiteral false
test SimpleName NormalAnnotation MemberValuePair SimpleName enabled
test SimpleName NormalAnnotation MemberValuePair BooleanLiteral false
from StringLiteral InfixExpression SimpleName database type
from StringLiteral InfixExpression StringLiteral name
from StringLiteral InfixExpression SimpleName db name
from StringLiteral InfixExpression StringLiteral \
database type SimpleName InfixExpression StringLiteral name
database type SimpleName InfixExpression SimpleName db name
database type SimpleName InfixExpression StringLiteral \
name StringLiteral InfixExpression SimpleName db name
name StringLiteral InfixExpression StringLiteral \
db name SimpleName InfixExpression StringLiteral \
dsl query SimpleName VariableDeclarationFragment InfixExpression StringLiteral from
dsl query SimpleName VariableDeclarationFragment InfixExpression SimpleName database type
dsl query SimpleName VariableDeclarationFragment InfixExpression StringLiteral name
dsl query SimpleName VariableDeclarationFragment InfixExpression SimpleName db name
dsl query SimpleName VariableDeclarationFragment InfixExpression StringLiteral \
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName dsl query
multivalued map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
multivalued map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
string SimpleName SimpleType ParameterizedType SimpleType SimpleName string
query params SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName multivalued map impl
query params SimpleName MethodInvocation SimpleName add
query params SimpleName MethodInvocation StringLiteral query
query params SimpleName MethodInvocation SimpleName dsl query
add SimpleName MethodInvocation StringLiteral query
add SimpleName MethodInvocation SimpleName dsl query
query StringLiteral MethodInvocation SimpleName dsl query
atlas client v SimpleName MethodInvocation SimpleName call api with query params
atlas client v SimpleName MethodInvocation QualifiedName atlas clientapi v search dsl
atlas client v SimpleName MethodInvocation SimpleName query params
call api with query params SimpleName MethodInvocation QualifiedName atlas clientapi v search dsl
call api with query params SimpleName MethodInvocation SimpleName query params
atlas clientapi v search dsl QualifiedName MethodInvocation SimpleName query params
response SimpleName VariableDeclarationFragment MethodInvocation SimpleName atlas client v
response SimpleName VariableDeclarationFragment MethodInvocation SimpleName call api with query params
response SimpleName VariableDeclarationFragment MethodInvocation QualifiedName atlas clientapi v search dsl
response SimpleName VariableDeclarationFragment MethodInvocation SimpleName query params
object node SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName response
assert SimpleName MethodInvocation SimpleName assert not null
assert SimpleName MethodInvocation SimpleName response
assert not null SimpleName MethodInvocation SimpleName response
response SimpleName MethodInvocation SimpleName get
response SimpleName MethodInvocation QualifiedName atlas clientrequest id
get SimpleName MethodInvocation QualifiedName atlas clientrequest id
assert SimpleName MethodInvocation SimpleName assert not null
assert SimpleName MethodInvocation MethodInvocation SimpleName response
assert SimpleName MethodInvocation MethodInvocation SimpleName get
assert SimpleName MethodInvocation MethodInvocation QualifiedName atlas clientrequest id
assert not null SimpleName MethodInvocation MethodInvocation SimpleName response
assert not null SimpleName MethodInvocation MethodInvocation SimpleName get
assert not null SimpleName MethodInvocation MethodInvocation QualifiedName atlas clientrequest id
response SimpleName MethodInvocation SimpleName get
response SimpleName MethodInvocation StringLiteral query
get SimpleName MethodInvocation StringLiteral query
response SimpleName MethodInvocation MethodInvocation SimpleName as text
get SimpleName MethodInvocation MethodInvocation SimpleName as text
query StringLiteral MethodInvocation MethodInvocation SimpleName as text
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName response
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation StringLiteral query
assert equals SimpleName MethodInvocation MethodInvocation SimpleName as text
assert equals SimpleName MethodInvocation SimpleName dsl query
response SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName dsl query
get SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName dsl query
query StringLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName dsl query
as text SimpleName MethodInvocation MethodInvocation SimpleName dsl query
response SimpleName MethodInvocation SimpleName get
response SimpleName MethodInvocation StringLiteral query type
get SimpleName MethodInvocation StringLiteral query type
response SimpleName MethodInvocation MethodInvocation SimpleName as text
get SimpleName MethodInvocation MethodInvocation SimpleName as text
query type StringLiteral MethodInvocation MethodInvocation SimpleName as text
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName response
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation StringLiteral query type
assert equals SimpleName MethodInvocation MethodInvocation SimpleName as text
assert equals SimpleName MethodInvocation StringLiteral dsl
response SimpleName MethodInvocation MethodInvocation MethodInvocation StringLiteral dsl
get SimpleName MethodInvocation MethodInvocation MethodInvocation StringLiteral dsl
query type StringLiteral MethodInvocation MethodInvocation MethodInvocation StringLiteral dsl
as text SimpleName MethodInvocation MethodInvocation StringLiteral dsl
response SimpleName MethodInvocation SimpleName get
response SimpleName MethodInvocation QualifiedName atlas clientresults
get SimpleName MethodInvocation QualifiedName atlas clientresults
array node SimpleName SimpleType CastExpression MethodInvocation SimpleName response
array node SimpleName SimpleType CastExpression MethodInvocation SimpleName get
array node SimpleName SimpleType CastExpression MethodInvocation QualifiedName atlas clientresults
results SimpleName VariableDeclarationFragment CastExpression SimpleType SimpleName array node
results SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName response
results SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName get
results SimpleName VariableDeclarationFragment CastExpression MethodInvocation QualifiedName atlas clientresults
array node SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName results
assert not null SimpleName MethodInvocation SimpleName results
results SimpleName MethodInvocation SimpleName size
assert equals SimpleName MethodInvocation MethodInvocation SimpleName results
assert equals SimpleName MethodInvocation MethodInvocation SimpleName size
assert equals SimpleName MethodInvocation NumberLiteral empty
results SimpleName MethodInvocation MethodInvocation NumberLiteral empty
size SimpleName MethodInvocation MethodInvocation NumberLiteral empty
response SimpleName MethodInvocation SimpleName get
response SimpleName MethodInvocation QualifiedName atlas clientcount
get SimpleName MethodInvocation QualifiedName atlas clientcount
response SimpleName MethodInvocation MethodInvocation SimpleName as int
get SimpleName MethodInvocation MethodInvocation SimpleName as int
atlas clientcount QualifiedName MethodInvocation MethodInvocation SimpleName as int
num rows SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName response
num rows SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get
num rows SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation QualifiedName atlas clientcount
num rows SimpleName VariableDeclarationFragment MethodInvocation SimpleName as int
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName num rows
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName as int
assert equals SimpleName MethodInvocation SimpleName num rows
assert equals SimpleName MethodInvocation NumberLiteral empty
num rows SimpleName MethodInvocation NumberLiteral empty
test SimpleName NormalAnnotation MethodDeclaration Modifier public
enabled SimpleName MemberValuePair NormalAnnotation MethodDeclaration Modifier public
false BooleanLiteral MemberValuePair NormalAnnotation MethodDeclaration Modifier public
test SimpleName NormalAnnotation MethodDeclaration PrimitiveType void
enabled SimpleName MemberValuePair NormalAnnotation MethodDeclaration PrimitiveType void
false BooleanLiteral MemberValuePair NormalAnnotation MethodDeclaration PrimitiveType void
test SimpleName NormalAnnotation MethodDeclaration SimpleName test search by dsl
enabled SimpleName MemberValuePair NormalAnnotation MethodDeclaration SimpleName test search by dsl
false BooleanLiteral MemberValuePair NormalAnnotation MethodDeclaration SimpleName test search by dsl
test SimpleName NormalAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test search by dsl
public Modifier MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
void PrimitiveType MethodDeclaration SimpleName test search by dsl
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
test search by dsl SimpleName MethodDeclaration SimpleType SimpleName exception
test search by dsl SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration NormalAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test search by dsl
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration NormalAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test search by dsl
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
