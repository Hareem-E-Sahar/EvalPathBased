hive meta store bridge SimpleName SimpleType SingleVariableDeclaration SimpleName dgi bridge
string SimpleName SimpleType SingleVariableDeclaration SimpleName user
entity SimpleName SimpleType SingleVariableDeclaration SimpleName entity
database SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName db
table SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table
partition SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName partition
list SimpleName SimpleType ParameterizedType SimpleType SimpleName referenceable
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
db entity SimpleName VariableDeclarationFragment MethodInvocation SimpleName dgi bridge
db entity SimpleName VariableDeclarationFragment MethodInvocation SimpleName create db instance
db entity SimpleName VariableDeclarationFragment MethodInvocation SimpleName db
referenceable SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName db entity
entities SimpleName MethodInvocation SimpleName add
entities SimpleName MethodInvocation SimpleName db entity
add SimpleName MethodInvocation SimpleName db entity
referenceable SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table entity
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
dgi bridge SimpleName MethodInvocation SimpleName db entity
dgi bridge SimpleName MethodInvocation SimpleName table
create table instance SimpleName MethodInvocation SimpleName db entity
create table instance SimpleName MethodInvocation SimpleName table
db entity SimpleName MethodInvocation SimpleName table
table entity SimpleName Assignment MethodInvocation SimpleName dgi bridge
table entity SimpleName Assignment MethodInvocation SimpleName create table instance
table entity SimpleName Assignment MethodInvocation SimpleName db entity
table entity SimpleName Assignment MethodInvocation SimpleName table
entities SimpleName MethodInvocation SimpleName add
entities SimpleName MethodInvocation SimpleName table entity
add SimpleName MethodInvocation SimpleName table entity
hook notificationentity update request QualifiedName SimpleType ClassInstanceCreation SimpleName user
hook notificationentity update request QualifiedName SimpleType ClassInstanceCreation SimpleName entities
user SimpleName ClassInstanceCreation SimpleName entities
messages SimpleName MethodInvocation SimpleName add
messages SimpleName MethodInvocation ClassInstanceCreation SimpleType QualifiedName hook notificationentity update request
messages SimpleName MethodInvocation ClassInstanceCreation SimpleName user
messages SimpleName MethodInvocation ClassInstanceCreation SimpleName entities
add SimpleName MethodInvocation ClassInstanceCreation SimpleType QualifiedName hook notificationentity update request
add SimpleName MethodInvocation ClassInstanceCreation SimpleName user
add SimpleName MethodInvocation ClassInstanceCreation SimpleName entities
private Modifier MethodDeclaration SimpleType SimpleName referenceable
private Modifier MethodDeclaration SimpleName create or update entities
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName hive meta store bridge
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName dgi bridge
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName user
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName entity
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName entity
referenceable SimpleName SimpleType MethodDeclaration SimpleName create or update entities
referenceable SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName dgi bridge
referenceable SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName user
referenceable SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName entity
referenceable SimpleName SimpleType MethodDeclaration SimpleType SimpleName exception
create or update entities SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName hive meta store bridge
create or update entities SimpleName MethodDeclaration SingleVariableDeclaration SimpleName dgi bridge
create or update entities SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
create or update entities SimpleName MethodDeclaration SingleVariableDeclaration SimpleName user
create or update entities SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName entity
create or update entities SimpleName MethodDeclaration SingleVariableDeclaration SimpleName entity
create or update entities SimpleName MethodDeclaration SimpleType SimpleName exception
create or update entities SimpleName MethodDeclaration Block ReturnStatement SimpleName table entity
dgi bridge SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName user
dgi bridge SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName entity
dgi bridge SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
user SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName entity
user SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
entity SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName referenceable
public Modifier TypeDeclaration MethodDeclaration SimpleName create or update entities
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName dgi bridge
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName user
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName entity
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName referenceable
test SimpleName TypeDeclaration MethodDeclaration SimpleName create or update entities
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName dgi bridge
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName user
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName entity
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception