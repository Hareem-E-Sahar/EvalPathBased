depends on methods SimpleName MemberValuePair StringLiteral test submit entity
test SimpleName NormalAnnotation MemberValuePair SimpleName depends on methods
test SimpleName NormalAnnotation MemberValuePair StringLiteral test submit entity
list SimpleName SimpleType ParameterizedType SimpleType SimpleName referenceable
final Modifier VariableDeclarationStatement ParameterizedType SimpleType SimpleName list
final Modifier VariableDeclarationStatement ParameterizedType SimpleType SimpleName referenceable
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
values SimpleName MethodInvocation StringLiteral qualified name
values SimpleName MethodInvocation StringLiteral qualified namecol
put SimpleName MethodInvocation StringLiteral qualified name
put SimpleName MethodInvocation StringLiteral qualified namecol
qualified name StringLiteral MethodInvocation StringLiteral qualified namecol
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
referenceable SimpleName SimpleType ClassInstanceCreation QualifiedName base resource itcolumn type
referenceable SimpleName SimpleType ClassInstanceCreation SimpleName values
base resource itcolumn type QualifiedName ClassInstanceCreation SimpleName values
ref SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName referenceable
ref SimpleName VariableDeclarationFragment ClassInstanceCreation QualifiedName base resource itcolumn type
ref SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName values
referenceable SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName ref
columns SimpleName MethodInvocation SimpleName add
columns SimpleName MethodInvocation SimpleName ref
add SimpleName MethodInvocation SimpleName ref
hash map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
hash map SimpleName SimpleType ParameterizedType SimpleType SimpleName object
string SimpleName SimpleType ParameterizedType SimpleType SimpleName object
put SimpleName MethodInvocation StringLiteral columns
put SimpleName MethodInvocation SimpleName columns
columns StringLiteral MethodInvocation SimpleName columns
referenceable SimpleName SimpleType ClassInstanceCreation QualifiedName base resource ithive table type
table updated SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName referenceable
table updated SimpleName VariableDeclarationFragment ClassInstanceCreation QualifiedName base resource ithive table type
referenceable SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table updated
updating entity StringLiteral InfixExpression SimpleName table updated
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation InfixExpression StringLiteral updating entity
log SimpleName MethodInvocation InfixExpression SimpleName table updated
debug SimpleName MethodInvocation InfixExpression StringLiteral updating entity
debug SimpleName MethodInvocation InfixExpression SimpleName table updated
table id SimpleName MethodInvocation SimpleName get id
service client SimpleName MethodInvocation SimpleName update entity
service client SimpleName MethodInvocation MethodInvocation SimpleName table id
service client SimpleName MethodInvocation MethodInvocation SimpleName get id
service client SimpleName MethodInvocation SimpleName table updated
update entity SimpleName MethodInvocation MethodInvocation SimpleName table id
update entity SimpleName MethodInvocation MethodInvocation SimpleName get id
update entity SimpleName MethodInvocation SimpleName table updated
table id SimpleName MethodInvocation MethodInvocation SimpleName table updated
get id SimpleName MethodInvocation MethodInvocation SimpleName table updated
entity result SimpleName VariableDeclarationFragment MethodInvocation SimpleName service client
entity result SimpleName VariableDeclarationFragment MethodInvocation SimpleName update entity
entity result SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName table id
entity result SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get id
entity result SimpleName VariableDeclarationFragment MethodInvocation SimpleName table updated
atlas cliententity result QualifiedName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName entity result
entity result SimpleName MethodInvocation SimpleName get update entities
entity result SimpleName MethodInvocation MethodInvocation SimpleName size
get update entities SimpleName MethodInvocation MethodInvocation SimpleName size
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName entity result
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get update entities
assert equals SimpleName MethodInvocation MethodInvocation SimpleName size
assert equals SimpleName MethodInvocation NumberLiteral empty
entity result SimpleName MethodInvocation MethodInvocation MethodInvocation NumberLiteral empty
get update entities SimpleName MethodInvocation MethodInvocation MethodInvocation NumberLiteral empty
size SimpleName MethodInvocation MethodInvocation NumberLiteral empty
entity result SimpleName MethodInvocation SimpleName get update entities
entity result SimpleName MethodInvocation MethodInvocation SimpleName get
get update entities SimpleName MethodInvocation MethodInvocation SimpleName get
entity result SimpleName MethodInvocation MethodInvocation NumberLiteral empty
get update entities SimpleName MethodInvocation MethodInvocation NumberLiteral empty
get SimpleName MethodInvocation NumberLiteral empty
table id SimpleName MethodInvocation SimpleName get id
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName entity result
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get update entities
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get
assert equals SimpleName MethodInvocation MethodInvocation NumberLiteral empty
assert equals SimpleName MethodInvocation MethodInvocation SimpleName table id
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get id
get SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName table id
get SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get id
empty NumberLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName table id
empty NumberLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName get id
table id SimpleName MethodInvocation SimpleName get id
get entity definition SimpleName MethodInvocation MethodInvocation SimpleName table id
get entity definition SimpleName MethodInvocation MethodInvocation SimpleName get id
response SimpleName VariableDeclarationFragment MethodInvocation SimpleName get entity definition
response SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName table id
response SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get id
client response SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName response
get entity definition SimpleName MethodInvocation SimpleName response
definition SimpleName VariableDeclarationFragment MethodInvocation SimpleName get entity definition
definition SimpleName VariableDeclarationFragment MethodInvocation SimpleName response
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName definition
instance serialization SimpleName MethodInvocation SimpleName from json referenceable
instance serialization SimpleName MethodInvocation SimpleName definition
instance serialization SimpleName MethodInvocation BooleanLiteral true
from json referenceable SimpleName MethodInvocation SimpleName definition
from json referenceable SimpleName MethodInvocation BooleanLiteral true
definition SimpleName MethodInvocation BooleanLiteral true
get referenceable SimpleName VariableDeclarationFragment MethodInvocation SimpleName instance serialization
get referenceable SimpleName VariableDeclarationFragment MethodInvocation SimpleName from json referenceable
get referenceable SimpleName VariableDeclarationFragment MethodInvocation SimpleName definition
get referenceable SimpleName VariableDeclarationFragment MethodInvocation BooleanLiteral true
referenceable SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName get referenceable
list SimpleName SimpleType ParameterizedType SimpleType SimpleName referenceable
list SimpleName SimpleType ParameterizedType SimpleType SimpleName referenceable
get referenceable SimpleName MethodInvocation SimpleName get
get referenceable SimpleName MethodInvocation StringLiteral columns
get SimpleName MethodInvocation StringLiteral columns
refs SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName get referenceable
refs SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName get
refs SimpleName VariableDeclarationFragment CastExpression MethodInvocation StringLiteral columns
refs SimpleName MethodInvocation SimpleName get
refs SimpleName MethodInvocation NumberLiteral empty
get SimpleName MethodInvocation NumberLiteral empty
columns SimpleName MethodInvocation SimpleName get
columns SimpleName MethodInvocation NumberLiteral empty
get SimpleName MethodInvocation NumberLiteral empty
refs SimpleName MethodInvocation MethodInvocation SimpleName equals contents
get SimpleName MethodInvocation MethodInvocation SimpleName equals contents
empty NumberLiteral MethodInvocation MethodInvocation SimpleName equals contents
refs SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName columns
refs SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get
refs SimpleName MethodInvocation MethodInvocation MethodInvocation NumberLiteral empty
get SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName columns
get SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get
get SimpleName MethodInvocation MethodInvocation MethodInvocation NumberLiteral empty
empty NumberLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName columns
empty NumberLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName get
empty NumberLiteral MethodInvocation MethodInvocation MethodInvocation NumberLiteral empty
equals contents SimpleName MethodInvocation MethodInvocation SimpleName columns
equals contents SimpleName MethodInvocation MethodInvocation SimpleName get
equals contents SimpleName MethodInvocation MethodInvocation NumberLiteral empty
assert SimpleName MethodInvocation SimpleName assert true
assert SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName refs
assert SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get
assert SimpleName MethodInvocation MethodInvocation MethodInvocation NumberLiteral empty
assert SimpleName MethodInvocation MethodInvocation SimpleName equals contents
assert SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName columns
assert SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get
assert SimpleName MethodInvocation MethodInvocation MethodInvocation NumberLiteral empty
assert true SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName refs
assert true SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get
assert true SimpleName MethodInvocation MethodInvocation MethodInvocation NumberLiteral empty
assert true SimpleName MethodInvocation MethodInvocation SimpleName equals contents
assert true SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName columns
assert true SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get
assert true SimpleName MethodInvocation MethodInvocation MethodInvocation NumberLiteral empty
values SimpleName MethodInvocation SimpleName put
values SimpleName MethodInvocation StringLiteral type
values SimpleName MethodInvocation StringLiteral int
put SimpleName MethodInvocation StringLiteral type
put SimpleName MethodInvocation StringLiteral int
type StringLiteral MethodInvocation StringLiteral int
referenceable SimpleName SimpleType ClassInstanceCreation QualifiedName base resource itcolumn type
referenceable SimpleName SimpleType ClassInstanceCreation SimpleName values
base resource itcolumn type QualifiedName ClassInstanceCreation SimpleName values
ref SimpleName Assignment ClassInstanceCreation SimpleType SimpleName referenceable
ref SimpleName Assignment ClassInstanceCreation QualifiedName base resource itcolumn type
ref SimpleName Assignment ClassInstanceCreation SimpleName values
columns SimpleName MethodInvocation SimpleName set
columns SimpleName MethodInvocation NumberLiteral empty
columns SimpleName MethodInvocation SimpleName ref
set SimpleName MethodInvocation NumberLiteral empty
set SimpleName MethodInvocation SimpleName ref
empty NumberLiteral MethodInvocation SimpleName ref
hash map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
hash map SimpleName SimpleType ParameterizedType SimpleType SimpleName object
string SimpleName SimpleType ParameterizedType SimpleType SimpleName object
put SimpleName MethodInvocation StringLiteral columns
put SimpleName MethodInvocation SimpleName columns
columns StringLiteral MethodInvocation SimpleName columns
referenceable SimpleName SimpleType ClassInstanceCreation QualifiedName base resource ithive table type
table updated SimpleName Assignment ClassInstanceCreation SimpleType SimpleName referenceable
table updated SimpleName Assignment ClassInstanceCreation QualifiedName base resource ithive table type
updating entity StringLiteral InfixExpression SimpleName table updated
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation InfixExpression StringLiteral updating entity
log SimpleName MethodInvocation InfixExpression SimpleName table updated
debug SimpleName MethodInvocation InfixExpression StringLiteral updating entity
debug SimpleName MethodInvocation InfixExpression SimpleName table updated
table instance SimpleName MethodInvocation SimpleName get
table instance SimpleName MethodInvocation StringLiteral name
get SimpleName MethodInvocation StringLiteral name
string SimpleName SimpleType CastExpression MethodInvocation SimpleName table instance
string SimpleName SimpleType CastExpression MethodInvocation SimpleName get
string SimpleName SimpleType CastExpression MethodInvocation StringLiteral name
service client SimpleName MethodInvocation SimpleName update entity
service client SimpleName MethodInvocation QualifiedName base resource ithive table type
service client SimpleName MethodInvocation QualifiedName atlas clientreferenceable attribute name
service client SimpleName MethodInvocation CastExpression SimpleType SimpleName string
service client SimpleName MethodInvocation CastExpression MethodInvocation SimpleName table instance
service client SimpleName MethodInvocation CastExpression MethodInvocation SimpleName get
service client SimpleName MethodInvocation CastExpression MethodInvocation StringLiteral name
service client SimpleName MethodInvocation SimpleName table updated
update entity SimpleName MethodInvocation QualifiedName base resource ithive table type
update entity SimpleName MethodInvocation QualifiedName atlas clientreferenceable attribute name
update entity SimpleName MethodInvocation CastExpression SimpleType SimpleName string
update entity SimpleName MethodInvocation CastExpression MethodInvocation SimpleName table instance
update entity SimpleName MethodInvocation CastExpression MethodInvocation SimpleName get
update entity SimpleName MethodInvocation CastExpression MethodInvocation StringLiteral name
update entity SimpleName MethodInvocation SimpleName table updated
base resource ithive table type QualifiedName MethodInvocation QualifiedName atlas clientreferenceable attribute name
base resource ithive table type QualifiedName MethodInvocation CastExpression SimpleType SimpleName string
base resource ithive table type QualifiedName MethodInvocation CastExpression MethodInvocation SimpleName table instance
base resource ithive table type QualifiedName MethodInvocation CastExpression MethodInvocation SimpleName get
base resource ithive table type QualifiedName MethodInvocation CastExpression MethodInvocation StringLiteral name
base resource ithive table type QualifiedName MethodInvocation SimpleName table updated
atlas clientreferenceable attribute name QualifiedName MethodInvocation CastExpression SimpleType SimpleName string
atlas clientreferenceable attribute name QualifiedName MethodInvocation CastExpression MethodInvocation SimpleName table instance
atlas clientreferenceable attribute name QualifiedName MethodInvocation CastExpression MethodInvocation SimpleName get
atlas clientreferenceable attribute name QualifiedName MethodInvocation CastExpression MethodInvocation StringLiteral name
atlas clientreferenceable attribute name QualifiedName MethodInvocation SimpleName table updated
string SimpleName SimpleType CastExpression MethodInvocation SimpleName table updated
table instance SimpleName MethodInvocation CastExpression MethodInvocation SimpleName table updated
get SimpleName MethodInvocation CastExpression MethodInvocation SimpleName table updated
name StringLiteral MethodInvocation CastExpression MethodInvocation SimpleName table updated
entity result SimpleName Assignment MethodInvocation SimpleName service client
entity result SimpleName Assignment MethodInvocation SimpleName update entity
entity result SimpleName Assignment MethodInvocation QualifiedName base resource ithive table type
entity result SimpleName Assignment MethodInvocation QualifiedName atlas clientreferenceable attribute name
entity result SimpleName Assignment MethodInvocation SimpleName table updated
entity result SimpleName MethodInvocation SimpleName get update entities
entity result SimpleName MethodInvocation MethodInvocation SimpleName size
get update entities SimpleName MethodInvocation MethodInvocation SimpleName size
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName entity result
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get update entities
assert equals SimpleName MethodInvocation MethodInvocation SimpleName size
assert equals SimpleName MethodInvocation NumberLiteral empty
entity result SimpleName MethodInvocation MethodInvocation MethodInvocation NumberLiteral empty
get update entities SimpleName MethodInvocation MethodInvocation MethodInvocation NumberLiteral empty
size SimpleName MethodInvocation MethodInvocation NumberLiteral empty
entity result SimpleName MethodInvocation SimpleName get update entities
entity result SimpleName MethodInvocation MethodInvocation SimpleName get
get update entities SimpleName MethodInvocation MethodInvocation SimpleName get
entity result SimpleName MethodInvocation MethodInvocation NumberLiteral empty
get update entities SimpleName MethodInvocation MethodInvocation NumberLiteral empty
get SimpleName MethodInvocation NumberLiteral empty
table id SimpleName MethodInvocation SimpleName get id
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName entity result
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get update entities
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get
assert equals SimpleName MethodInvocation MethodInvocation NumberLiteral empty
assert equals SimpleName MethodInvocation MethodInvocation SimpleName table id
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get id
get SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName table id
get SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get id
empty NumberLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName table id
empty NumberLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName get id
table id SimpleName MethodInvocation SimpleName get id
get entity definition SimpleName MethodInvocation MethodInvocation SimpleName table id
get entity definition SimpleName MethodInvocation MethodInvocation SimpleName get id
response SimpleName Assignment MethodInvocation SimpleName get entity definition
response SimpleName Assignment MethodInvocation MethodInvocation SimpleName table id
response SimpleName Assignment MethodInvocation MethodInvocation SimpleName get id
get entity definition SimpleName MethodInvocation SimpleName response
definition SimpleName Assignment MethodInvocation SimpleName get entity definition
definition SimpleName Assignment MethodInvocation SimpleName response
instance serialization SimpleName MethodInvocation SimpleName from json referenceable
instance serialization SimpleName MethodInvocation SimpleName definition
instance serialization SimpleName MethodInvocation BooleanLiteral true
from json referenceable SimpleName MethodInvocation SimpleName definition
from json referenceable SimpleName MethodInvocation BooleanLiteral true
definition SimpleName MethodInvocation BooleanLiteral true
get referenceable SimpleName Assignment MethodInvocation SimpleName instance serialization
get referenceable SimpleName Assignment MethodInvocation SimpleName from json referenceable
get referenceable SimpleName Assignment MethodInvocation SimpleName definition
get referenceable SimpleName Assignment MethodInvocation BooleanLiteral true
list SimpleName SimpleType ParameterizedType SimpleType SimpleName referenceable
get referenceable SimpleName MethodInvocation SimpleName get
get referenceable SimpleName MethodInvocation StringLiteral columns
get SimpleName MethodInvocation StringLiteral columns
refs SimpleName Assignment CastExpression MethodInvocation SimpleName get referenceable
refs SimpleName Assignment CastExpression MethodInvocation SimpleName get
refs SimpleName Assignment CastExpression MethodInvocation StringLiteral columns
refs SimpleName MethodInvocation SimpleName get
refs SimpleName MethodInvocation NumberLiteral empty
get SimpleName MethodInvocation NumberLiteral empty
columns SimpleName MethodInvocation SimpleName get
columns SimpleName MethodInvocation NumberLiteral empty
get SimpleName MethodInvocation NumberLiteral empty
refs SimpleName MethodInvocation MethodInvocation SimpleName equals contents
get SimpleName MethodInvocation MethodInvocation SimpleName equals contents
empty NumberLiteral MethodInvocation MethodInvocation SimpleName equals contents
refs SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName columns
refs SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get
refs SimpleName MethodInvocation MethodInvocation MethodInvocation NumberLiteral empty
get SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName columns
get SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get
get SimpleName MethodInvocation MethodInvocation MethodInvocation NumberLiteral empty
empty NumberLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName columns
empty NumberLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName get
empty NumberLiteral MethodInvocation MethodInvocation MethodInvocation NumberLiteral empty
equals contents SimpleName MethodInvocation MethodInvocation SimpleName columns
equals contents SimpleName MethodInvocation MethodInvocation SimpleName get
equals contents SimpleName MethodInvocation MethodInvocation NumberLiteral empty
assert SimpleName MethodInvocation SimpleName assert true
assert SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName refs
assert SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get
assert SimpleName MethodInvocation MethodInvocation MethodInvocation NumberLiteral empty
assert SimpleName MethodInvocation MethodInvocation SimpleName equals contents
assert SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName columns
assert SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get
assert SimpleName MethodInvocation MethodInvocation MethodInvocation NumberLiteral empty
assert true SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName refs
assert true SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get
assert true SimpleName MethodInvocation MethodInvocation MethodInvocation NumberLiteral empty
assert true SimpleName MethodInvocation MethodInvocation SimpleName equals contents
assert true SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName columns
assert true SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get
assert true SimpleName MethodInvocation MethodInvocation MethodInvocation NumberLiteral empty
refs SimpleName MethodInvocation SimpleName get
refs SimpleName MethodInvocation NumberLiteral empty
get SimpleName MethodInvocation NumberLiteral empty
refs SimpleName MethodInvocation MethodInvocation SimpleName get
get SimpleName MethodInvocation MethodInvocation SimpleName get
empty NumberLiteral MethodInvocation MethodInvocation SimpleName get
refs SimpleName MethodInvocation MethodInvocation StringLiteral data type
get SimpleName MethodInvocation MethodInvocation StringLiteral data type
empty NumberLiteral MethodInvocation MethodInvocation StringLiteral data type
get SimpleName MethodInvocation StringLiteral data type
assert SimpleName MethodInvocation SimpleName assert equals
assert SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName refs
assert SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get
assert SimpleName MethodInvocation MethodInvocation MethodInvocation NumberLiteral empty
assert SimpleName MethodInvocation MethodInvocation SimpleName get
assert SimpleName MethodInvocation MethodInvocation StringLiteral data type
assert SimpleName MethodInvocation StringLiteral int
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName refs
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation NumberLiteral empty
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get
assert equals SimpleName MethodInvocation MethodInvocation StringLiteral data type
assert equals SimpleName MethodInvocation StringLiteral int
refs SimpleName MethodInvocation MethodInvocation MethodInvocation StringLiteral int
get SimpleName MethodInvocation MethodInvocation MethodInvocation StringLiteral int
empty NumberLiteral MethodInvocation MethodInvocation MethodInvocation StringLiteral int
get SimpleName MethodInvocation MethodInvocation StringLiteral int
data type StringLiteral MethodInvocation MethodInvocation StringLiteral int
test SimpleName NormalAnnotation MethodDeclaration Modifier public
depends on methods SimpleName MemberValuePair NormalAnnotation MethodDeclaration Modifier public
test submit entity StringLiteral MemberValuePair NormalAnnotation MethodDeclaration Modifier public
test SimpleName NormalAnnotation MethodDeclaration PrimitiveType void
depends on methods SimpleName MemberValuePair NormalAnnotation MethodDeclaration PrimitiveType void
test submit entity StringLiteral MemberValuePair NormalAnnotation MethodDeclaration PrimitiveType void
test SimpleName NormalAnnotation MethodDeclaration SimpleName test partial update
depends on methods SimpleName MemberValuePair NormalAnnotation MethodDeclaration SimpleName test partial update
test submit entity StringLiteral MemberValuePair NormalAnnotation MethodDeclaration SimpleName test partial update
test SimpleName NormalAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test partial update
public Modifier MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration Block VariableDeclarationStatement Modifier final
void PrimitiveType MethodDeclaration SimpleName test partial update
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement Modifier final
test partial update SimpleName MethodDeclaration SimpleType SimpleName exception
test partial update SimpleName MethodDeclaration Block VariableDeclarationStatement Modifier final
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration NormalAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test partial update
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration NormalAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test partial update
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
