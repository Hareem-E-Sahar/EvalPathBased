depends on methods SimpleName MemberValuePair StringLiteral test submit entity
test SimpleName NormalAnnotation MemberValuePair SimpleName depends on methods
test SimpleName NormalAnnotation MemberValuePair StringLiteral test submit entity
list SimpleName SimpleType ParameterizedType SimpleType SimpleName atlas entity
final Modifier VariableDeclarationStatement ParameterizedType SimpleType SimpleName list
final Modifier VariableDeclarationStatement ParameterizedType SimpleType SimpleName atlas entity
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName columns
map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
map SimpleName SimpleType ParameterizedType SimpleType SimpleName object
string SimpleName SimpleType ParameterizedType SimpleType SimpleName object
values SimpleName MethodInvocation SimpleName put
values SimpleName MethodInvocation StringLiteral name
values SimpleName MethodInvocation StringLiteral col
put SimpleName MethodInvocation StringLiteral name
put SimpleName MethodInvocation StringLiteral col
name StringLiteral MethodInvocation StringLiteral col
values SimpleName MethodInvocation SimpleName put
values SimpleName MethodInvocation SimpleName qualified name
values SimpleName MethodInvocation StringLiteral qualified namecol
put SimpleName MethodInvocation SimpleName qualified name
put SimpleName MethodInvocation StringLiteral qualified namecol
qualified name SimpleName MethodInvocation StringLiteral qualified namecol
values SimpleName MethodInvocation SimpleName put
values SimpleName MethodInvocation StringLiteral type
values SimpleName MethodInvocation StringLiteral string
put SimpleName MethodInvocation StringLiteral type
put SimpleName MethodInvocation StringLiteral string
type StringLiteral MethodInvocation StringLiteral string
values SimpleName MethodInvocation SimpleName put
values SimpleName MethodInvocation StringLiteral comment
values SimpleName MethodInvocation StringLiteral col comment
put SimpleName MethodInvocation StringLiteral comment
put SimpleName MethodInvocation StringLiteral col comment
comment StringLiteral MethodInvocation StringLiteral col comment
map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
map SimpleName SimpleType ParameterizedType SimpleType SimpleName object
string SimpleName SimpleType ParameterizedType SimpleType SimpleName object
values SimpleName MethodInvocation SimpleName put
values SimpleName MethodInvocation StringLiteral name
values SimpleName MethodInvocation StringLiteral col
put SimpleName MethodInvocation StringLiteral name
put SimpleName MethodInvocation StringLiteral col
name StringLiteral MethodInvocation StringLiteral col
values SimpleName MethodInvocation SimpleName put
values SimpleName MethodInvocation SimpleName qualified name
values SimpleName MethodInvocation StringLiteral qualified namecol
put SimpleName MethodInvocation SimpleName qualified name
put SimpleName MethodInvocation StringLiteral qualified namecol
qualified name SimpleName MethodInvocation StringLiteral qualified namecol
values SimpleName MethodInvocation SimpleName put
values SimpleName MethodInvocation StringLiteral type
values SimpleName MethodInvocation StringLiteral string
put SimpleName MethodInvocation StringLiteral type
put SimpleName MethodInvocation StringLiteral string
type StringLiteral MethodInvocation StringLiteral string
values SimpleName MethodInvocation SimpleName put
values SimpleName MethodInvocation StringLiteral comment
values SimpleName MethodInvocation StringLiteral col comment
put SimpleName MethodInvocation StringLiteral comment
put SimpleName MethodInvocation StringLiteral col comment
comment StringLiteral MethodInvocation StringLiteral col comment
atlas entity SimpleName SimpleType ClassInstanceCreation QualifiedName base resource itcolumn type
atlas entity SimpleName SimpleType ClassInstanceCreation SimpleName values
base resource itcolumn type QualifiedName ClassInstanceCreation SimpleName values
ref SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName atlas entity
ref SimpleName VariableDeclarationFragment ClassInstanceCreation QualifiedName base resource itcolumn type
ref SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName values
atlas entity SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName ref
atlas entity SimpleName SimpleType ClassInstanceCreation QualifiedName base resource itcolumn type
atlas entity SimpleName SimpleType ClassInstanceCreation SimpleName values
base resource itcolumn type QualifiedName ClassInstanceCreation SimpleName values
ref SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName atlas entity
ref SimpleName VariableDeclarationFragment ClassInstanceCreation QualifiedName base resource itcolumn type
ref SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName values
atlas entity SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName ref
columns SimpleName MethodInvocation SimpleName add
columns SimpleName MethodInvocation SimpleName ref
add SimpleName MethodInvocation SimpleName ref
columns SimpleName MethodInvocation SimpleName add
columns SimpleName MethodInvocation SimpleName ref
add SimpleName MethodInvocation SimpleName ref
table entity SimpleName MethodInvocation SimpleName set attribute
table entity SimpleName MethodInvocation StringLiteral columns
table entity SimpleName MethodInvocation SimpleName columns
set attribute SimpleName MethodInvocation StringLiteral columns
set attribute SimpleName MethodInvocation SimpleName columns
columns StringLiteral MethodInvocation SimpleName columns
entities client v SimpleName MethodInvocation SimpleName update entity
entities client v SimpleName MethodInvocation SimpleName table entity
update entity SimpleName MethodInvocation SimpleName table entity
update entity result SimpleName VariableDeclarationFragment MethodInvocation SimpleName entities client v
update entity result SimpleName VariableDeclarationFragment MethodInvocation SimpleName update entity
update entity result SimpleName VariableDeclarationFragment MethodInvocation SimpleName table entity
entity mutation response SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName update entity result
assert not null SimpleName MethodInvocation SimpleName update entity result
update entity result SimpleName MethodInvocation SimpleName get entities by operation
update entity result SimpleName MethodInvocation QualifiedName entity mutationsentity operationupdate
get entities by operation SimpleName MethodInvocation QualifiedName entity mutationsentity operationupdate
assert not null SimpleName MethodInvocation MethodInvocation SimpleName update entity result
assert not null SimpleName MethodInvocation MethodInvocation SimpleName get entities by operation
assert not null SimpleName MethodInvocation MethodInvocation QualifiedName entity mutationsentity operationupdate
update entity result SimpleName MethodInvocation SimpleName get entities by operation
update entity result SimpleName MethodInvocation QualifiedName entity mutationsentity operationupdate
get entities by operation SimpleName MethodInvocation QualifiedName entity mutationsentity operationupdate
update entity result SimpleName MethodInvocation MethodInvocation SimpleName size
get entities by operation SimpleName MethodInvocation MethodInvocation SimpleName size
entity mutationsentity operationupdate QualifiedName MethodInvocation MethodInvocation SimpleName size
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName update entity result
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get entities by operation
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName entity mutationsentity operationupdate
assert equals SimpleName MethodInvocation MethodInvocation SimpleName size
assert equals SimpleName MethodInvocation NumberLiteral empty
update entity result SimpleName MethodInvocation MethodInvocation MethodInvocation NumberLiteral empty
get entities by operation SimpleName MethodInvocation MethodInvocation MethodInvocation NumberLiteral empty
entity mutationsentity operationupdate QualifiedName MethodInvocation MethodInvocation MethodInvocation NumberLiteral empty
size SimpleName MethodInvocation MethodInvocation NumberLiteral empty
table entity SimpleName MethodInvocation SimpleName get guid
entities client v SimpleName MethodInvocation SimpleName get entity by guid
entities client v SimpleName MethodInvocation MethodInvocation SimpleName table entity
entities client v SimpleName MethodInvocation MethodInvocation SimpleName get guid
get entity by guid SimpleName MethodInvocation MethodInvocation SimpleName table entity
get entity by guid SimpleName MethodInvocation MethodInvocation SimpleName get guid
entity by guid SimpleName VariableDeclarationFragment MethodInvocation SimpleName entities client v
entity by guid SimpleName VariableDeclarationFragment MethodInvocation SimpleName get entity by guid
entity by guid SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName table entity
entity by guid SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get guid
atlas entity SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName entity by guid
list SimpleName SimpleType ParameterizedType SimpleType SimpleName atlas entity
list SimpleName SimpleType ParameterizedType SimpleType SimpleName atlas entity
entity by guid SimpleName MethodInvocation SimpleName get attribute
entity by guid SimpleName MethodInvocation StringLiteral columns
get attribute SimpleName MethodInvocation StringLiteral columns
refs SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName entity by guid
refs SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName get attribute
refs SimpleName VariableDeclarationFragment CastExpression MethodInvocation StringLiteral columns
refs SimpleName MethodInvocation SimpleName size
assert equals SimpleName MethodInvocation MethodInvocation SimpleName refs
assert equals SimpleName MethodInvocation MethodInvocation SimpleName size
assert equals SimpleName MethodInvocation NumberLiteral empty
refs SimpleName MethodInvocation MethodInvocation NumberLiteral empty
size SimpleName MethodInvocation MethodInvocation NumberLiteral empty
test SimpleName NormalAnnotation MethodDeclaration Modifier public
depends on methods SimpleName MemberValuePair NormalAnnotation MethodDeclaration Modifier public
test submit entity StringLiteral MemberValuePair NormalAnnotation MethodDeclaration Modifier public
test SimpleName NormalAnnotation MethodDeclaration PrimitiveType void
depends on methods SimpleName MemberValuePair NormalAnnotation MethodDeclaration PrimitiveType void
test submit entity StringLiteral MemberValuePair NormalAnnotation MethodDeclaration PrimitiveType void
test SimpleName NormalAnnotation MethodDeclaration SimpleName test complete update
depends on methods SimpleName MemberValuePair NormalAnnotation MethodDeclaration SimpleName test complete update
test submit entity StringLiteral MemberValuePair NormalAnnotation MethodDeclaration SimpleName test complete update
test SimpleName NormalAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test complete update
public Modifier MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration Block VariableDeclarationStatement Modifier final
void PrimitiveType MethodDeclaration SimpleName test complete update
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement Modifier final
test complete update SimpleName MethodDeclaration SimpleType SimpleName exception
test complete update SimpleName MethodDeclaration Block VariableDeclarationStatement Modifier final
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration NormalAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test complete update
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration NormalAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test complete update
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
