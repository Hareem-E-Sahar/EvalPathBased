referenceable SimpleName SimpleType SingleVariableDeclaration SimpleName table referenceable
referenceable SimpleName SimpleType SingleVariableDeclaration SimpleName sd referenceable
partition SimpleName SimpleType SingleVariableDeclaration SimpleName hive part
hive part SimpleName MethodInvocation SimpleName get values
string utils SimpleName MethodInvocation SimpleName join
string utils SimpleName MethodInvocation MethodInvocation SimpleName hive part
string utils SimpleName MethodInvocation MethodInvocation SimpleName get values
string utils SimpleName MethodInvocation StringLiteral empty
join SimpleName MethodInvocation MethodInvocation SimpleName hive part
join SimpleName MethodInvocation MethodInvocation SimpleName get values
join SimpleName MethodInvocation StringLiteral empty
hive part SimpleName MethodInvocation MethodInvocation StringLiteral empty
get values SimpleName MethodInvocation MethodInvocation StringLiteral empty
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation StringLiteral registering partition for {} with values {}
log SimpleName MethodInvocation SimpleName table referenceable
log SimpleName MethodInvocation MethodInvocation SimpleName string utils
log SimpleName MethodInvocation MethodInvocation SimpleName join
log SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName hive part
log SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get values
log SimpleName MethodInvocation MethodInvocation StringLiteral empty
info SimpleName MethodInvocation StringLiteral registering partition for {} with values {}
info SimpleName MethodInvocation SimpleName table referenceable
info SimpleName MethodInvocation MethodInvocation SimpleName string utils
info SimpleName MethodInvocation MethodInvocation SimpleName join
info SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName hive part
info SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get values
info SimpleName MethodInvocation MethodInvocation StringLiteral empty
registering partition for {} with values {} StringLiteral MethodInvocation SimpleName table referenceable
registering partition for {} with values {} StringLiteral MethodInvocation MethodInvocation SimpleName string utils
registering partition for {} with values {} StringLiteral MethodInvocation MethodInvocation SimpleName join
registering partition for {} with values {} StringLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName hive part
registering partition for {} with values {} StringLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName get values
registering partition for {} with values {} StringLiteral MethodInvocation MethodInvocation StringLiteral empty
table referenceable SimpleName MethodInvocation MethodInvocation SimpleName string utils
table referenceable SimpleName MethodInvocation MethodInvocation SimpleName join
table referenceable SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName hive part
table referenceable SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get values
table referenceable SimpleName MethodInvocation MethodInvocation StringLiteral empty
hive part SimpleName MethodInvocation SimpleName get table
hive part SimpleName MethodInvocation MethodInvocation SimpleName get db name
get table SimpleName MethodInvocation MethodInvocation SimpleName get db name
db name SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName hive part
db name SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get table
db name SimpleName VariableDeclarationFragment MethodInvocation SimpleName get db name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName db name
hive part SimpleName MethodInvocation SimpleName get table
hive part SimpleName MethodInvocation MethodInvocation SimpleName get table name
get table SimpleName MethodInvocation MethodInvocation SimpleName get table name
table name SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName hive part
table name SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get table
table name SimpleName VariableDeclarationFragment MethodInvocation SimpleName get table name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table name
hive part SimpleName MethodInvocation SimpleName get values
get partition reference SimpleName MethodInvocation SimpleName db name
get partition reference SimpleName MethodInvocation SimpleName table name
get partition reference SimpleName MethodInvocation MethodInvocation SimpleName hive part
get partition reference SimpleName MethodInvocation MethodInvocation SimpleName get values
db name SimpleName MethodInvocation SimpleName table name
db name SimpleName MethodInvocation MethodInvocation SimpleName hive part
db name SimpleName MethodInvocation MethodInvocation SimpleName get values
table name SimpleName MethodInvocation MethodInvocation SimpleName hive part
table name SimpleName MethodInvocation MethodInvocation SimpleName get values
part ref SimpleName VariableDeclarationFragment MethodInvocation SimpleName get partition reference
part ref SimpleName VariableDeclarationFragment MethodInvocation SimpleName db name
part ref SimpleName VariableDeclarationFragment MethodInvocation SimpleName table name
part ref SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName hive part
part ref SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get values
referenceable SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName part ref
create partition referenceable SimpleName MethodInvocation SimpleName table referenceable
create partition referenceable SimpleName MethodInvocation SimpleName sd referenceable
create partition referenceable SimpleName MethodInvocation SimpleName hive part
table referenceable SimpleName MethodInvocation SimpleName sd referenceable
table referenceable SimpleName MethodInvocation SimpleName hive part
sd referenceable SimpleName MethodInvocation SimpleName hive part
part ref SimpleName Assignment MethodInvocation SimpleName create partition referenceable
part ref SimpleName Assignment MethodInvocation SimpleName table referenceable
part ref SimpleName Assignment MethodInvocation SimpleName sd referenceable
part ref SimpleName Assignment MethodInvocation SimpleName hive part
register instance SimpleName MethodInvocation SimpleName part ref
part ref SimpleName Assignment MethodInvocation SimpleName register instance
part ref SimpleName Assignment MethodInvocation SimpleName part ref
hive part SimpleName MethodInvocation SimpleName get values
string utils SimpleName MethodInvocation SimpleName join
string utils SimpleName MethodInvocation MethodInvocation SimpleName hive part
string utils SimpleName MethodInvocation MethodInvocation SimpleName get values
string utils SimpleName MethodInvocation StringLiteral empty
join SimpleName MethodInvocation MethodInvocation SimpleName hive part
join SimpleName MethodInvocation MethodInvocation SimpleName get values
join SimpleName MethodInvocation StringLiteral empty
hive part SimpleName MethodInvocation MethodInvocation StringLiteral empty
get values SimpleName MethodInvocation MethodInvocation StringLiteral empty
part ref SimpleName MethodInvocation SimpleName get id
part ref SimpleName MethodInvocation FieldAccess SimpleName id
get id SimpleName MethodInvocation FieldAccess SimpleName id
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation StringLiteral partition {}.{} with values {} is already registered with id {}
log SimpleName MethodInvocation SimpleName db name
log SimpleName MethodInvocation SimpleName table name
log SimpleName MethodInvocation MethodInvocation SimpleName string utils
log SimpleName MethodInvocation MethodInvocation SimpleName join
log SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName hive part
log SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get values
log SimpleName MethodInvocation MethodInvocation StringLiteral empty
info SimpleName MethodInvocation StringLiteral partition {}.{} with values {} is already registered with id {}
info SimpleName MethodInvocation SimpleName db name
info SimpleName MethodInvocation SimpleName table name
info SimpleName MethodInvocation MethodInvocation SimpleName string utils
info SimpleName MethodInvocation MethodInvocation SimpleName join
info SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName hive part
info SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get values
info SimpleName MethodInvocation MethodInvocation StringLiteral empty
info SimpleName MethodInvocation FieldAccess MethodInvocation SimpleName part ref
info SimpleName MethodInvocation FieldAccess MethodInvocation SimpleName get id
info SimpleName MethodInvocation FieldAccess SimpleName id
partition {}.{} with values {} is already registered with id {} StringLiteral MethodInvocation SimpleName db name
partition {}.{} with values {} is already registered with id {} StringLiteral MethodInvocation SimpleName table name
partition {}.{} with values {} is already registered with id {} StringLiteral MethodInvocation MethodInvocation SimpleName string utils
partition {}.{} with values {} is already registered with id {} StringLiteral MethodInvocation MethodInvocation SimpleName join
partition {}.{} with values {} is already registered with id {} StringLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName hive part
partition {}.{} with values {} is already registered with id {} StringLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName get values
partition {}.{} with values {} is already registered with id {} StringLiteral MethodInvocation MethodInvocation StringLiteral empty
partition {}.{} with values {} is already registered with id {} StringLiteral MethodInvocation FieldAccess MethodInvocation SimpleName part ref
partition {}.{} with values {} is already registered with id {} StringLiteral MethodInvocation FieldAccess MethodInvocation SimpleName get id
partition {}.{} with values {} is already registered with id {} StringLiteral MethodInvocation FieldAccess SimpleName id
db name SimpleName MethodInvocation SimpleName table name
db name SimpleName MethodInvocation MethodInvocation SimpleName string utils
db name SimpleName MethodInvocation MethodInvocation SimpleName join
db name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName hive part
db name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get values
db name SimpleName MethodInvocation MethodInvocation StringLiteral empty
db name SimpleName MethodInvocation FieldAccess MethodInvocation SimpleName part ref
db name SimpleName MethodInvocation FieldAccess MethodInvocation SimpleName get id
db name SimpleName MethodInvocation FieldAccess SimpleName id
table name SimpleName MethodInvocation MethodInvocation SimpleName string utils
table name SimpleName MethodInvocation MethodInvocation SimpleName join
table name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName hive part
table name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get values
table name SimpleName MethodInvocation MethodInvocation StringLiteral empty
table name SimpleName MethodInvocation FieldAccess MethodInvocation SimpleName part ref
table name SimpleName MethodInvocation FieldAccess MethodInvocation SimpleName get id
table name SimpleName MethodInvocation FieldAccess SimpleName id
string utils SimpleName MethodInvocation MethodInvocation FieldAccess SimpleName id
join SimpleName MethodInvocation MethodInvocation FieldAccess SimpleName id
empty StringLiteral MethodInvocation MethodInvocation FieldAccess SimpleName id
private Modifier MethodDeclaration SimpleType SimpleName referenceable
private Modifier MethodDeclaration SimpleName register partition
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName referenceable
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName table referenceable
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName referenceable
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName sd referenceable
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName partition
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName hive part
referenceable SimpleName SimpleType MethodDeclaration SimpleName register partition
referenceable SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName table referenceable
referenceable SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName sd referenceable
referenceable SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName hive part
referenceable SimpleName SimpleType MethodDeclaration SimpleType SimpleName exception
register partition SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName referenceable
register partition SimpleName MethodDeclaration SingleVariableDeclaration SimpleName table referenceable
register partition SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName referenceable
register partition SimpleName MethodDeclaration SingleVariableDeclaration SimpleName sd referenceable
register partition SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName partition
register partition SimpleName MethodDeclaration SingleVariableDeclaration SimpleName hive part
register partition SimpleName MethodDeclaration SimpleType SimpleName exception
register partition SimpleName MethodDeclaration Block ReturnStatement SimpleName part ref
table referenceable SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName sd referenceable
table referenceable SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName hive part
table referenceable SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
sd referenceable SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName hive part
sd referenceable SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
hive part SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName referenceable
public Modifier TypeDeclaration MethodDeclaration SimpleName register partition
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName table referenceable
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName sd referenceable
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName hive part
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName referenceable
test SimpleName TypeDeclaration MethodDeclaration SimpleName register partition
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName table referenceable
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName sd referenceable
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName hive part
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
