db StringLiteral InfixExpression MethodInvocation SimpleName random string
db name SimpleName VariableDeclarationFragment InfixExpression StringLiteral db
db name SimpleName VariableDeclarationFragment InfixExpression MethodInvocation SimpleName random string
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName db name
table StringLiteral InfixExpression MethodInvocation SimpleName random string
table name SimpleName VariableDeclarationFragment InfixExpression StringLiteral table
table name SimpleName VariableDeclarationFragment InfixExpression MethodInvocation SimpleName random string
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table name
create hive db instance built in SimpleName MethodInvocation SimpleName db name
hive db instance SimpleName VariableDeclarationFragment MethodInvocation SimpleName create hive db instance built in
hive db instance SimpleName VariableDeclarationFragment MethodInvocation SimpleName db name
referenceable SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName hive db instance
create instance SimpleName MethodInvocation SimpleName hive db instance
db id SimpleName VariableDeclarationFragment MethodInvocation SimpleName create instance
db id SimpleName VariableDeclarationFragment MethodInvocation SimpleName hive db instance
id SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName db id
create hive table instance built in SimpleName MethodInvocation SimpleName db name
create hive table instance built in SimpleName MethodInvocation SimpleName table name
create hive table instance built in SimpleName MethodInvocation SimpleName db id
db name SimpleName MethodInvocation SimpleName table name
db name SimpleName MethodInvocation SimpleName db id
table name SimpleName MethodInvocation SimpleName db id
hive table instance SimpleName VariableDeclarationFragment MethodInvocation SimpleName create hive table instance built in
hive table instance SimpleName VariableDeclarationFragment MethodInvocation SimpleName db name
hive table instance SimpleName VariableDeclarationFragment MethodInvocation SimpleName table name
hive table instance SimpleName VariableDeclarationFragment MethodInvocation SimpleName db id
referenceable SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName hive table instance
create instance SimpleName MethodInvocation SimpleName hive table instance
table id SimpleName VariableDeclarationFragment MethodInvocation SimpleName create instance
table id SimpleName VariableDeclarationFragment MethodInvocation SimpleName hive table instance
id SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table id
table id SimpleName MethodInvocation SimpleName get id
guid SimpleName VariableDeclarationFragment MethodInvocation SimpleName table id
guid SimpleName VariableDeclarationFragment MethodInvocation SimpleName get id
final Modifier VariableDeclarationStatement SimpleType SimpleName string
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName guid
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName table id
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get id
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName guid
uuid SimpleName MethodInvocation SimpleName from string
uuid SimpleName MethodInvocation SimpleName guid
from string SimpleName MethodInvocation SimpleName guid
assert SimpleName MethodInvocation SimpleName assert not null
assert SimpleName MethodInvocation MethodInvocation SimpleName uuid
assert SimpleName MethodInvocation MethodInvocation SimpleName from string
assert SimpleName MethodInvocation MethodInvocation SimpleName guid
assert not null SimpleName MethodInvocation MethodInvocation SimpleName uuid
assert not null SimpleName MethodInvocation MethodInvocation SimpleName from string
assert not null SimpleName MethodInvocation MethodInvocation SimpleName guid
illegal argument exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
response is not a guid StringLiteral InfixExpression SimpleName guid
assert SimpleName MethodInvocation SimpleName fail
assert SimpleName MethodInvocation InfixExpression StringLiteral response is not a guid
assert SimpleName MethodInvocation InfixExpression SimpleName guid
fail SimpleName MethodInvocation InfixExpression StringLiteral response is not a guid
fail SimpleName MethodInvocation InfixExpression SimpleName guid
col StringLiteral InfixExpression MethodInvocation SimpleName random string
col name SimpleName VariableDeclarationFragment InfixExpression StringLiteral col
col name SimpleName VariableDeclarationFragment InfixExpression MethodInvocation SimpleName random string
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName col name
list SimpleName SimpleType ParameterizedType SimpleType SimpleName referenceable
final Modifier VariableDeclarationStatement ParameterizedType SimpleType SimpleName list
final Modifier VariableDeclarationStatement ParameterizedType SimpleType SimpleName referenceable
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName columns
map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
map SimpleName SimpleType ParameterizedType SimpleType SimpleName object
string SimpleName SimpleType ParameterizedType SimpleType SimpleName object
values SimpleName MethodInvocation SimpleName put
values SimpleName MethodInvocation SimpleName name
values SimpleName MethodInvocation SimpleName col name
put SimpleName MethodInvocation SimpleName name
put SimpleName MethodInvocation SimpleName col name
name SimpleName MethodInvocation SimpleName col name
values SimpleName MethodInvocation SimpleName put
values SimpleName MethodInvocation StringLiteral comment
values SimpleName MethodInvocation StringLiteral col comment
put SimpleName MethodInvocation StringLiteral comment
put SimpleName MethodInvocation StringLiteral col comment
comment StringLiteral MethodInvocation StringLiteral col comment
defaulttablecol @ StringLiteral InfixExpression SimpleName col name
values SimpleName MethodInvocation SimpleName put
values SimpleName MethodInvocation SimpleName qualified name
values SimpleName MethodInvocation InfixExpression StringLiteral defaulttablecol @
values SimpleName MethodInvocation InfixExpression SimpleName col name
put SimpleName MethodInvocation SimpleName qualified name
put SimpleName MethodInvocation InfixExpression StringLiteral defaulttablecol @
put SimpleName MethodInvocation InfixExpression SimpleName col name
qualified name SimpleName MethodInvocation InfixExpression StringLiteral defaulttablecol @
qualified name SimpleName MethodInvocation InfixExpression SimpleName col name
values SimpleName MethodInvocation SimpleName put
values SimpleName MethodInvocation StringLiteral comment
values SimpleName MethodInvocation StringLiteral col comment
put SimpleName MethodInvocation StringLiteral comment
put SimpleName MethodInvocation StringLiteral col comment
comment StringLiteral MethodInvocation StringLiteral col comment
values SimpleName MethodInvocation SimpleName put
values SimpleName MethodInvocation StringLiteral type
values SimpleName MethodInvocation StringLiteral string
put SimpleName MethodInvocation StringLiteral type
put SimpleName MethodInvocation StringLiteral string
type StringLiteral MethodInvocation StringLiteral string
values SimpleName MethodInvocation SimpleName put
values SimpleName MethodInvocation StringLiteral owner
values SimpleName MethodInvocation StringLiteral user
put SimpleName MethodInvocation StringLiteral owner
put SimpleName MethodInvocation StringLiteral user
owner StringLiteral MethodInvocation StringLiteral user
values SimpleName MethodInvocation SimpleName put
values SimpleName MethodInvocation StringLiteral position
values SimpleName MethodInvocation NumberLiteral empty
put SimpleName MethodInvocation StringLiteral position
put SimpleName MethodInvocation NumberLiteral empty
position StringLiteral MethodInvocation NumberLiteral empty
values SimpleName MethodInvocation SimpleName put
values SimpleName MethodInvocation StringLiteral description
values SimpleName MethodInvocation StringLiteral col
put SimpleName MethodInvocation StringLiteral description
put SimpleName MethodInvocation StringLiteral col
description StringLiteral MethodInvocation StringLiteral col
values SimpleName MethodInvocation SimpleName put
values SimpleName MethodInvocation StringLiteral table
values SimpleName MethodInvocation SimpleName table id
put SimpleName MethodInvocation StringLiteral table
put SimpleName MethodInvocation SimpleName table id
table StringLiteral MethodInvocation SimpleName table id
referenceable SimpleName SimpleType ClassInstanceCreation QualifiedName base resource itcolumn type builtin
referenceable SimpleName SimpleType ClassInstanceCreation SimpleName values
base resource itcolumn type builtin QualifiedName ClassInstanceCreation SimpleName values
ref SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName referenceable
ref SimpleName VariableDeclarationFragment ClassInstanceCreation QualifiedName base resource itcolumn type builtin
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
referenceable SimpleName SimpleType ClassInstanceCreation QualifiedName base resource ithive table type builtin
table updated SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName referenceable
table updated SimpleName VariableDeclarationFragment ClassInstanceCreation QualifiedName base resource ithive table type builtin
referenceable SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table updated
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral updating entity {}
log SimpleName MethodInvocation SimpleName table updated
debug SimpleName MethodInvocation StringLiteral updating entity {}
debug SimpleName MethodInvocation SimpleName table updated
updating entity {} StringLiteral MethodInvocation SimpleName table updated
atlas client v SimpleName MethodInvocation SimpleName update entity
atlas client v SimpleName MethodInvocation SimpleName guid
atlas client v SimpleName MethodInvocation SimpleName table updated
update entity SimpleName MethodInvocation SimpleName guid
update entity SimpleName MethodInvocation SimpleName table updated
guid SimpleName MethodInvocation SimpleName table updated
entity result SimpleName VariableDeclarationFragment MethodInvocation SimpleName atlas client v
entity result SimpleName VariableDeclarationFragment MethodInvocation SimpleName update entity
entity result SimpleName VariableDeclarationFragment MethodInvocation SimpleName guid
entity result SimpleName VariableDeclarationFragment MethodInvocation SimpleName table updated
entity result SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName entity result
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
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName entity result
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get update entities
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get
assert equals SimpleName MethodInvocation MethodInvocation NumberLiteral empty
assert equals SimpleName MethodInvocation SimpleName guid
entity result SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName guid
get update entities SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName guid
get SimpleName MethodInvocation MethodInvocation SimpleName guid
empty NumberLiteral MethodInvocation MethodInvocation SimpleName guid
atlas client v SimpleName MethodInvocation SimpleName get entity
atlas client v SimpleName MethodInvocation SimpleName guid
get entity SimpleName MethodInvocation SimpleName guid
entity SimpleName VariableDeclarationFragment MethodInvocation SimpleName atlas client v
entity SimpleName VariableDeclarationFragment MethodInvocation SimpleName get entity
entity SimpleName VariableDeclarationFragment MethodInvocation SimpleName guid
referenceable SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName entity
list SimpleName SimpleType ParameterizedType SimpleType SimpleName referenceable
list SimpleName SimpleType ParameterizedType SimpleType SimpleName referenceable
entity SimpleName MethodInvocation SimpleName get
entity SimpleName MethodInvocation StringLiteral columns
get SimpleName MethodInvocation StringLiteral columns
refs SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName entity
refs SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName get
refs SimpleName VariableDeclarationFragment CastExpression MethodInvocation StringLiteral columns
refs SimpleName MethodInvocation SimpleName get
refs SimpleName MethodInvocation NumberLiteral empty
get SimpleName MethodInvocation NumberLiteral empty
column SimpleName VariableDeclarationFragment MethodInvocation SimpleName refs
column SimpleName VariableDeclarationFragment MethodInvocation SimpleName get
column SimpleName VariableDeclarationFragment MethodInvocation NumberLiteral empty
referenceable SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName column
columns SimpleName MethodInvocation SimpleName get
columns SimpleName MethodInvocation NumberLiteral empty
get SimpleName MethodInvocation NumberLiteral empty
columns SimpleName MethodInvocation MethodInvocation SimpleName get values
get SimpleName MethodInvocation MethodInvocation SimpleName get values
empty NumberLiteral MethodInvocation MethodInvocation SimpleName get values
column SimpleName MethodInvocation SimpleName get values
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName columns
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation NumberLiteral empty
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get values
assert equals SimpleName MethodInvocation MethodInvocation SimpleName column
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get values
get values SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName column
get values SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get values
columns SimpleName MethodInvocation SimpleName get
columns SimpleName MethodInvocation NumberLiteral empty
get SimpleName MethodInvocation NumberLiteral empty
columns SimpleName MethodInvocation MethodInvocation SimpleName get type name
get SimpleName MethodInvocation MethodInvocation SimpleName get type name
empty NumberLiteral MethodInvocation MethodInvocation SimpleName get type name
column SimpleName MethodInvocation SimpleName get type name
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName columns
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation NumberLiteral empty
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get type name
assert equals SimpleName MethodInvocation MethodInvocation SimpleName column
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get type name
get type name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName column
get type name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get type name
columns SimpleName MethodInvocation SimpleName get
columns SimpleName MethodInvocation NumberLiteral empty
get SimpleName MethodInvocation NumberLiteral empty
columns SimpleName MethodInvocation MethodInvocation SimpleName get traits
get SimpleName MethodInvocation MethodInvocation SimpleName get traits
empty NumberLiteral MethodInvocation MethodInvocation SimpleName get traits
column SimpleName MethodInvocation SimpleName get traits
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName columns
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation NumberLiteral empty
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get traits
assert equals SimpleName MethodInvocation MethodInvocation SimpleName column
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get traits
get traits SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName column
get traits SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get traits
columns SimpleName MethodInvocation SimpleName get
columns SimpleName MethodInvocation NumberLiteral empty
get SimpleName MethodInvocation NumberLiteral empty
columns SimpleName MethodInvocation MethodInvocation SimpleName get trait names
get SimpleName MethodInvocation MethodInvocation SimpleName get trait names
empty NumberLiteral MethodInvocation MethodInvocation SimpleName get trait names
column SimpleName MethodInvocation SimpleName get trait names
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName columns
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation NumberLiteral empty
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get trait names
assert equals SimpleName MethodInvocation MethodInvocation SimpleName column
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get trait names
get trait names SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName column
get trait names SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get trait names
final Modifier VariableDeclarationStatement Block VariableDeclarationStatement Modifier final
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test partial update by guid
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test partial update by guid
public Modifier MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration Block VariableDeclarationStatement Modifier final
public Modifier MethodDeclaration Block VariableDeclarationStatement Modifier final
void PrimitiveType MethodDeclaration SimpleName test partial update by guid
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement Modifier final
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement Modifier final
test partial update by guid SimpleName MethodDeclaration SimpleType SimpleName exception
test partial update by guid SimpleName MethodDeclaration Block VariableDeclarationStatement Modifier final
test partial update by guid SimpleName MethodDeclaration Block VariableDeclarationStatement Modifier final
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test partial update by guid
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test partial update by guid
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
