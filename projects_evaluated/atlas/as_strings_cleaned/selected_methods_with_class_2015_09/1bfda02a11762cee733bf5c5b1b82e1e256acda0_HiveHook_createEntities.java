map SimpleName SimpleType ParameterizedType SimpleType SimpleName type
map SimpleName SimpleType ParameterizedType SimpleType SimpleName referenceable
type SimpleName SimpleType ParameterizedType SimpleType SimpleName referenceable
hive meta store bridge SimpleName SimpleType SingleVariableDeclaration SimpleName dgi bridge
entity SimpleName SimpleType SingleVariableDeclaration SimpleName entity
map SimpleName SimpleType ParameterizedType SimpleType SimpleName type
map SimpleName SimpleType ParameterizedType SimpleType SimpleName referenceable
type SimpleName SimpleType ParameterizedType SimpleType SimpleName referenceable
database SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName db
table SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table
partition SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName partition
entity SimpleName MethodInvocation SimpleName get type
entity SimpleName MethodInvocation SimpleName get database
db SimpleName Assignment MethodInvocation SimpleName entity
db SimpleName Assignment MethodInvocation SimpleName get database
entity SimpleName MethodInvocation SimpleName get table
table SimpleName Assignment MethodInvocation SimpleName entity
table SimpleName Assignment MethodInvocation SimpleName get table
table SimpleName MethodInvocation SimpleName get db name
dgi bridgehive client QualifiedName MethodInvocation SimpleName get database
dgi bridgehive client QualifiedName MethodInvocation MethodInvocation SimpleName table
dgi bridgehive client QualifiedName MethodInvocation MethodInvocation SimpleName get db name
get database SimpleName MethodInvocation MethodInvocation SimpleName table
get database SimpleName MethodInvocation MethodInvocation SimpleName get db name
db SimpleName Assignment MethodInvocation QualifiedName dgi bridgehive client
db SimpleName Assignment MethodInvocation SimpleName get database
db SimpleName Assignment MethodInvocation MethodInvocation SimpleName table
db SimpleName Assignment MethodInvocation MethodInvocation SimpleName get db name
entity SimpleName MethodInvocation SimpleName get partition
partition SimpleName Assignment MethodInvocation SimpleName entity
partition SimpleName Assignment MethodInvocation SimpleName get partition
partition SimpleName MethodInvocation SimpleName get table
table SimpleName Assignment MethodInvocation SimpleName partition
table SimpleName Assignment MethodInvocation SimpleName get table
table SimpleName MethodInvocation SimpleName get db name
dgi bridgehive client QualifiedName MethodInvocation SimpleName get database
dgi bridgehive client QualifiedName MethodInvocation MethodInvocation SimpleName table
dgi bridgehive client QualifiedName MethodInvocation MethodInvocation SimpleName get db name
get database SimpleName MethodInvocation MethodInvocation SimpleName table
get database SimpleName MethodInvocation MethodInvocation SimpleName get db name
db SimpleName Assignment MethodInvocation QualifiedName dgi bridgehive client
db SimpleName Assignment MethodInvocation SimpleName get database
db SimpleName Assignment MethodInvocation MethodInvocation SimpleName table
db SimpleName Assignment MethodInvocation MethodInvocation SimpleName get db name
entity SimpleName MethodInvocation SwitchStatement SwitchCase SimpleName database
get type SimpleName MethodInvocation SwitchStatement SwitchCase SimpleName database
entity SimpleName MethodInvocation SwitchStatement SwitchCase SimpleName table
get type SimpleName MethodInvocation SwitchStatement SwitchCase SimpleName table
database SimpleName SwitchCase SwitchStatement SwitchCase SimpleName table
table SimpleName SwitchCase SwitchStatement SwitchCase SimpleName partition
db SimpleName MethodInvocation SimpleName get name
dgi bridgehive client QualifiedName MethodInvocation SimpleName get database
dgi bridgehive client QualifiedName MethodInvocation MethodInvocation SimpleName db
dgi bridgehive client QualifiedName MethodInvocation MethodInvocation SimpleName get name
get database SimpleName MethodInvocation MethodInvocation SimpleName db
get database SimpleName MethodInvocation MethodInvocation SimpleName get name
db SimpleName Assignment MethodInvocation QualifiedName dgi bridgehive client
db SimpleName Assignment MethodInvocation SimpleName get database
db SimpleName Assignment MethodInvocation MethodInvocation SimpleName db
db SimpleName Assignment MethodInvocation MethodInvocation SimpleName get name
dgi bridge SimpleName MethodInvocation SimpleName create db instance
dgi bridge SimpleName MethodInvocation SimpleName db
create db instance SimpleName MethodInvocation SimpleName db
db referenceable SimpleName VariableDeclarationFragment MethodInvocation SimpleName dgi bridge
db referenceable SimpleName VariableDeclarationFragment MethodInvocation SimpleName create db instance
db referenceable SimpleName VariableDeclarationFragment MethodInvocation SimpleName db
referenceable SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName db referenceable
entities SimpleName MethodInvocation SimpleName put
entities SimpleName MethodInvocation QualifiedName typedatabase
entities SimpleName MethodInvocation SimpleName db referenceable
put SimpleName MethodInvocation QualifiedName typedatabase
put SimpleName MethodInvocation SimpleName db referenceable
typedatabase QualifiedName MethodInvocation SimpleName db referenceable
referenceable SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table referenceable
table SimpleName MethodInvocation SimpleName get db name
table SimpleName MethodInvocation SimpleName get table name
dgi bridgehive client QualifiedName MethodInvocation SimpleName get table
dgi bridgehive client QualifiedName MethodInvocation MethodInvocation SimpleName table
dgi bridgehive client QualifiedName MethodInvocation MethodInvocation SimpleName get db name
dgi bridgehive client QualifiedName MethodInvocation MethodInvocation SimpleName table
dgi bridgehive client QualifiedName MethodInvocation MethodInvocation SimpleName get table name
get table SimpleName MethodInvocation MethodInvocation SimpleName table
get table SimpleName MethodInvocation MethodInvocation SimpleName get db name
get table SimpleName MethodInvocation MethodInvocation SimpleName table
get table SimpleName MethodInvocation MethodInvocation SimpleName get table name
table SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName table
table SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get table name
get db name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName table
get db name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get table name
table SimpleName Assignment MethodInvocation QualifiedName dgi bridgehive client
table SimpleName Assignment MethodInvocation SimpleName get table
table SimpleName Assignment MethodInvocation MethodInvocation SimpleName table
table SimpleName Assignment MethodInvocation MethodInvocation SimpleName get db name
table SimpleName Assignment MethodInvocation MethodInvocation SimpleName table
table SimpleName Assignment MethodInvocation MethodInvocation SimpleName get table name
dgi bridge SimpleName MethodInvocation SimpleName create table instance
dgi bridge SimpleName MethodInvocation SimpleName db referenceable
dgi bridge SimpleName MethodInvocation SimpleName table
create table instance SimpleName MethodInvocation SimpleName db referenceable
create table instance SimpleName MethodInvocation SimpleName table
db referenceable SimpleName MethodInvocation SimpleName table
table referenceable SimpleName Assignment MethodInvocation SimpleName dgi bridge
table referenceable SimpleName Assignment MethodInvocation SimpleName create table instance
table referenceable SimpleName Assignment MethodInvocation SimpleName db referenceable
table referenceable SimpleName Assignment MethodInvocation SimpleName table
entities SimpleName MethodInvocation SimpleName put
entities SimpleName MethodInvocation QualifiedName typetable
entities SimpleName MethodInvocation SimpleName table referenceable
put SimpleName MethodInvocation QualifiedName typetable
put SimpleName MethodInvocation SimpleName table referenceable
typetable QualifiedName MethodInvocation SimpleName table referenceable
table referenceable SimpleName MethodInvocation SimpleName get
table referenceable SimpleName MethodInvocation StringLiteral sd
get SimpleName MethodInvocation StringLiteral sd
referenceable SimpleName SimpleType CastExpression MethodInvocation SimpleName table referenceable
referenceable SimpleName SimpleType CastExpression MethodInvocation SimpleName get
referenceable SimpleName SimpleType CastExpression MethodInvocation StringLiteral sd
dgi bridge SimpleName MethodInvocation SimpleName create partition referenceable
dgi bridge SimpleName MethodInvocation SimpleName table referenceable
dgi bridge SimpleName MethodInvocation CastExpression SimpleType SimpleName referenceable
dgi bridge SimpleName MethodInvocation CastExpression MethodInvocation SimpleName table referenceable
dgi bridge SimpleName MethodInvocation CastExpression MethodInvocation SimpleName get
dgi bridge SimpleName MethodInvocation CastExpression MethodInvocation StringLiteral sd
dgi bridge SimpleName MethodInvocation SimpleName partition
create partition referenceable SimpleName MethodInvocation SimpleName table referenceable
create partition referenceable SimpleName MethodInvocation CastExpression SimpleType SimpleName referenceable
create partition referenceable SimpleName MethodInvocation CastExpression MethodInvocation SimpleName table referenceable
create partition referenceable SimpleName MethodInvocation CastExpression MethodInvocation SimpleName get
create partition referenceable SimpleName MethodInvocation CastExpression MethodInvocation StringLiteral sd
create partition referenceable SimpleName MethodInvocation SimpleName partition
table referenceable SimpleName MethodInvocation CastExpression SimpleType SimpleName referenceable
table referenceable SimpleName MethodInvocation CastExpression MethodInvocation SimpleName table referenceable
table referenceable SimpleName MethodInvocation CastExpression MethodInvocation SimpleName get
table referenceable SimpleName MethodInvocation CastExpression MethodInvocation StringLiteral sd
table referenceable SimpleName MethodInvocation SimpleName partition
referenceable SimpleName SimpleType CastExpression MethodInvocation SimpleName partition
table referenceable SimpleName MethodInvocation CastExpression MethodInvocation SimpleName partition
get SimpleName MethodInvocation CastExpression MethodInvocation SimpleName partition
sd StringLiteral MethodInvocation CastExpression MethodInvocation SimpleName partition
partition referenceable SimpleName VariableDeclarationFragment MethodInvocation SimpleName dgi bridge
partition referenceable SimpleName VariableDeclarationFragment MethodInvocation SimpleName create partition referenceable
partition referenceable SimpleName VariableDeclarationFragment MethodInvocation SimpleName table referenceable
partition referenceable SimpleName VariableDeclarationFragment MethodInvocation SimpleName partition
referenceable SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName partition referenceable
entities SimpleName MethodInvocation SimpleName put
entities SimpleName MethodInvocation QualifiedName typepartition
entities SimpleName MethodInvocation SimpleName partition referenceable
put SimpleName MethodInvocation QualifiedName typepartition
put SimpleName MethodInvocation SimpleName partition referenceable
typepartition QualifiedName MethodInvocation SimpleName partition referenceable
private Modifier MethodDeclaration ParameterizedType SimpleType SimpleName map
private Modifier MethodDeclaration ParameterizedType SimpleType SimpleName type
private Modifier MethodDeclaration ParameterizedType SimpleType SimpleName referenceable
private Modifier MethodDeclaration SimpleName create entities
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName hive meta store bridge
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName dgi bridge
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName entity
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName entity
private Modifier MethodDeclaration SimpleType SimpleName exception
map SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName create entities
type SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName create entities
referenceable SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName create entities
create entities SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName hive meta store bridge
create entities SimpleName MethodDeclaration SingleVariableDeclaration SimpleName dgi bridge
create entities SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName entity
create entities SimpleName MethodDeclaration SingleVariableDeclaration SimpleName entity
create entities SimpleName MethodDeclaration SimpleType SimpleName exception
create entities SimpleName MethodDeclaration Block ReturnStatement SimpleName entities
dgi bridge SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName entity
dgi bridge SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
entity SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration SimpleName create entities
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName dgi bridge
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName entity
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration SimpleName create entities
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName dgi bridge
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName entity
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
