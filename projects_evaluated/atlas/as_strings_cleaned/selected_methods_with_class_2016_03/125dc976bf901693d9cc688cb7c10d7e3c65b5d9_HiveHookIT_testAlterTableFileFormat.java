table name SimpleName VariableDeclarationFragment MethodInvocation SimpleName create table
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table name
test format SimpleName VariableDeclarationFragment StringLiteral orc
final Modifier VariableDeclarationStatement SimpleType SimpleName string
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName test format
final Modifier VariableDeclarationStatement VariableDeclarationFragment StringLiteral orc
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName test format
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment StringLiteral orc
alter table StringLiteral InfixExpression SimpleName table name
alter table StringLiteral InfixExpression StringLiteral set fileformat
alter table StringLiteral InfixExpression SimpleName test format
table name SimpleName InfixExpression StringLiteral set fileformat
table name SimpleName InfixExpression SimpleName test format
set fileformat StringLiteral InfixExpression SimpleName test format
query SimpleName VariableDeclarationFragment InfixExpression StringLiteral alter table
query SimpleName VariableDeclarationFragment InfixExpression SimpleName table name
query SimpleName VariableDeclarationFragment InfixExpression StringLiteral set fileformat
query SimpleName VariableDeclarationFragment InfixExpression SimpleName test format
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName query
run command SimpleName MethodInvocation SimpleName query
assert table is registered SimpleName MethodInvocation SimpleName default db
assert table is registered SimpleName MethodInvocation SimpleName table name
default db SimpleName MethodInvocation SimpleName table name
table id SimpleName VariableDeclarationFragment MethodInvocation SimpleName assert table is registered
table id SimpleName VariableDeclarationFragment MethodInvocation SimpleName default db
table id SimpleName VariableDeclarationFragment MethodInvocation SimpleName table name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table id
dgi c lient SimpleName MethodInvocation SimpleName get entity
dgi c lient SimpleName MethodInvocation SimpleName table id
get entity SimpleName MethodInvocation SimpleName table id
table ref SimpleName VariableDeclarationFragment MethodInvocation SimpleName dgi c lient
table ref SimpleName VariableDeclarationFragment MethodInvocation SimpleName get entity
table ref SimpleName VariableDeclarationFragment MethodInvocation SimpleName table id
referenceable SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table ref
table ref SimpleName MethodInvocation SimpleName get
table ref SimpleName MethodInvocation QualifiedName hive data model generatorstorage desc
get SimpleName MethodInvocation QualifiedName hive data model generatorstorage desc
referenceable SimpleName SimpleType CastExpression MethodInvocation SimpleName table ref
referenceable SimpleName SimpleType CastExpression MethodInvocation SimpleName get
referenceable SimpleName SimpleType CastExpression MethodInvocation QualifiedName hive data model generatorstorage desc
sd ref SimpleName VariableDeclarationFragment CastExpression SimpleType SimpleName referenceable
sd ref SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName table ref
sd ref SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName get
sd ref SimpleName VariableDeclarationFragment CastExpression MethodInvocation QualifiedName hive data model generatorstorage desc
referenceable SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName sd ref
sd ref SimpleName MethodInvocation SimpleName get
sd ref SimpleName MethodInvocation QualifiedName hive data model generatorstorage desc input fmt
get SimpleName MethodInvocation QualifiedName hive data model generatorstorage desc input fmt
assert SimpleName MethodInvocation SimpleName assert equals
assert SimpleName MethodInvocation MethodInvocation SimpleName sd ref
assert SimpleName MethodInvocation MethodInvocation SimpleName get
assert SimpleName MethodInvocation MethodInvocation QualifiedName hive data model generatorstorage desc input fmt
assert SimpleName MethodInvocation StringLiteral orgapachehadoophiveqlioorcorc input format
assert equals SimpleName MethodInvocation MethodInvocation SimpleName sd ref
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get
assert equals SimpleName MethodInvocation MethodInvocation QualifiedName hive data model generatorstorage desc input fmt
assert equals SimpleName MethodInvocation StringLiteral orgapachehadoophiveqlioorcorc input format
sd ref SimpleName MethodInvocation MethodInvocation StringLiteral orgapachehadoophiveqlioorcorc input format
get SimpleName MethodInvocation MethodInvocation StringLiteral orgapachehadoophiveqlioorcorc input format
hive data model generatorstorage desc input fmt QualifiedName MethodInvocation MethodInvocation StringLiteral orgapachehadoophiveqlioorcorc input format
sd ref SimpleName MethodInvocation SimpleName get
sd ref SimpleName MethodInvocation QualifiedName hive data model generatorstorage desc output fmt
get SimpleName MethodInvocation QualifiedName hive data model generatorstorage desc output fmt
assert SimpleName MethodInvocation SimpleName assert equals
assert SimpleName MethodInvocation MethodInvocation SimpleName sd ref
assert SimpleName MethodInvocation MethodInvocation SimpleName get
assert SimpleName MethodInvocation MethodInvocation QualifiedName hive data model generatorstorage desc output fmt
assert SimpleName MethodInvocation StringLiteral orgapachehadoophiveqlioorcorc output format
assert equals SimpleName MethodInvocation MethodInvocation SimpleName sd ref
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get
assert equals SimpleName MethodInvocation MethodInvocation QualifiedName hive data model generatorstorage desc output fmt
assert equals SimpleName MethodInvocation StringLiteral orgapachehadoophiveqlioorcorc output format
sd ref SimpleName MethodInvocation MethodInvocation StringLiteral orgapachehadoophiveqlioorcorc output format
get SimpleName MethodInvocation MethodInvocation StringLiteral orgapachehadoophiveqlioorcorc output format
hive data model generatorstorage desc output fmt QualifiedName MethodInvocation MethodInvocation StringLiteral orgapachehadoophiveqlioorcorc output format
sd ref SimpleName MethodInvocation SimpleName get
sd ref SimpleName MethodInvocation StringLiteral serde info
get SimpleName MethodInvocation StringLiteral serde info
assert SimpleName MethodInvocation SimpleName assert not null
assert SimpleName MethodInvocation MethodInvocation SimpleName sd ref
assert SimpleName MethodInvocation MethodInvocation SimpleName get
assert SimpleName MethodInvocation MethodInvocation StringLiteral serde info
assert not null SimpleName MethodInvocation MethodInvocation SimpleName sd ref
assert not null SimpleName MethodInvocation MethodInvocation SimpleName get
assert not null SimpleName MethodInvocation MethodInvocation StringLiteral serde info
sd ref SimpleName MethodInvocation SimpleName get
sd ref SimpleName MethodInvocation StringLiteral serde info
get SimpleName MethodInvocation StringLiteral serde info
struct SimpleName SimpleType CastExpression MethodInvocation SimpleName sd ref
struct SimpleName SimpleType CastExpression MethodInvocation SimpleName get
struct SimpleName SimpleType CastExpression MethodInvocation StringLiteral serde info
serde info SimpleName VariableDeclarationFragment CastExpression SimpleType SimpleName struct
serde info SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName sd ref
serde info SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName get
serde info SimpleName VariableDeclarationFragment CastExpression MethodInvocation StringLiteral serde info
struct SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName serde info
serde info SimpleName MethodInvocation SimpleName get
serde info SimpleName MethodInvocation StringLiteral serialization lib
get SimpleName MethodInvocation StringLiteral serialization lib
assert SimpleName MethodInvocation SimpleName assert equals
assert SimpleName MethodInvocation MethodInvocation SimpleName serde info
assert SimpleName MethodInvocation MethodInvocation SimpleName get
assert SimpleName MethodInvocation MethodInvocation StringLiteral serialization lib
assert SimpleName MethodInvocation StringLiteral orgapachehadoophiveqlioorcorc serde
assert equals SimpleName MethodInvocation MethodInvocation SimpleName serde info
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get
assert equals SimpleName MethodInvocation MethodInvocation StringLiteral serialization lib
assert equals SimpleName MethodInvocation StringLiteral orgapachehadoophiveqlioorcorc serde
serde info SimpleName MethodInvocation MethodInvocation StringLiteral orgapachehadoophiveqlioorcorc serde
get SimpleName MethodInvocation MethodInvocation StringLiteral orgapachehadoophiveqlioorcorc serde
serialization lib StringLiteral MethodInvocation MethodInvocation StringLiteral orgapachehadoophiveqlioorcorc serde
serde info SimpleName MethodInvocation SimpleName get
serde info SimpleName MethodInvocation QualifiedName hive data model generatorparameters
get SimpleName MethodInvocation QualifiedName hive data model generatorparameters
assert SimpleName MethodInvocation SimpleName assert not null
assert SimpleName MethodInvocation MethodInvocation SimpleName serde info
assert SimpleName MethodInvocation MethodInvocation SimpleName get
assert SimpleName MethodInvocation MethodInvocation QualifiedName hive data model generatorparameters
assert not null SimpleName MethodInvocation MethodInvocation SimpleName serde info
assert not null SimpleName MethodInvocation MethodInvocation SimpleName get
assert not null SimpleName MethodInvocation MethodInvocation QualifiedName hive data model generatorparameters
map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
string SimpleName SimpleType ParameterizedType SimpleType SimpleName string
serde info SimpleName MethodInvocation SimpleName get
serde info SimpleName MethodInvocation QualifiedName hive data model generatorparameters
get SimpleName MethodInvocation QualifiedName hive data model generatorparameters
get SimpleName MethodInvocation StringLiteral serializationformat
assert SimpleName MethodInvocation SimpleName assert equals
assert SimpleName MethodInvocation MethodInvocation SimpleName get
assert SimpleName MethodInvocation MethodInvocation StringLiteral serializationformat
assert SimpleName MethodInvocation StringLiteral empty
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get
assert equals SimpleName MethodInvocation MethodInvocation StringLiteral serializationformat
assert equals SimpleName MethodInvocation StringLiteral empty
get SimpleName MethodInvocation MethodInvocation StringLiteral empty
serializationformat StringLiteral MethodInvocation MethodInvocation StringLiteral empty
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test alter table file format
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test alter table file format
public Modifier MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration Block VariableDeclarationStatement Modifier final
void PrimitiveType MethodDeclaration SimpleName test alter table file format
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement Modifier final
test alter table file format SimpleName MethodDeclaration SimpleType SimpleName exception
test alter table file format SimpleName MethodDeclaration Block VariableDeclarationStatement Modifier final
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test alter table file format
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test alter table file format
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
