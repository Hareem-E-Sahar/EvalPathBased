list SimpleName SimpleType ParameterizedType SimpleType SimpleName referenceable
orgapachefalconentityv clustercluster QualifiedName SimpleType SingleVariableDeclaration SimpleName cluster
feed SimpleName SimpleType SingleVariableDeclaration SimpleName feed
cluster SimpleName MethodInvocation SimpleName get name
feed helper SimpleName MethodInvocation SimpleName get cluster
feed helper SimpleName MethodInvocation SimpleName feed
feed helper SimpleName MethodInvocation MethodInvocation SimpleName cluster
feed helper SimpleName MethodInvocation MethodInvocation SimpleName get name
get cluster SimpleName MethodInvocation SimpleName feed
get cluster SimpleName MethodInvocation MethodInvocation SimpleName cluster
get cluster SimpleName MethodInvocation MethodInvocation SimpleName get name
feed SimpleName MethodInvocation MethodInvocation SimpleName cluster
feed SimpleName MethodInvocation MethodInvocation SimpleName get name
feed cluster SimpleName VariableDeclarationFragment MethodInvocation SimpleName feed helper
feed cluster SimpleName VariableDeclarationFragment MethodInvocation SimpleName get cluster
feed cluster SimpleName VariableDeclarationFragment MethodInvocation SimpleName feed
feed cluster SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName cluster
feed cluster SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get name
orgapachefalconentityv feedcluster QualifiedName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName feed cluster
get table SimpleName MethodInvocation SimpleName feed cluster
get table SimpleName MethodInvocation SimpleName feed
feed cluster SimpleName MethodInvocation SimpleName feed
table SimpleName VariableDeclarationFragment MethodInvocation SimpleName get table
table SimpleName VariableDeclarationFragment MethodInvocation SimpleName feed cluster
table SimpleName VariableDeclarationFragment MethodInvocation SimpleName feed
final Modifier VariableDeclarationStatement SimpleType SimpleName catalog table
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName table
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get table
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName feed cluster
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName feed
catalog table SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table
catalog storage SimpleName SimpleType ClassInstanceCreation SimpleName cluster
catalog storage SimpleName SimpleType ClassInstanceCreation SimpleName table
cluster SimpleName ClassInstanceCreation SimpleName table
storage SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName catalog storage
storage SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName cluster
storage SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName table
catalog storage SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName storage
cluster SimpleName MethodInvocation SimpleName get name
storage SimpleName MethodInvocation SimpleName get database
storage SimpleName MethodInvocation MethodInvocation SimpleName to lower case
get database SimpleName MethodInvocation MethodInvocation SimpleName to lower case
storage SimpleName MethodInvocation SimpleName get table
storage SimpleName MethodInvocation MethodInvocation SimpleName to lower case
get table SimpleName MethodInvocation MethodInvocation SimpleName to lower case
create hive table instance SimpleName MethodInvocation MethodInvocation SimpleName cluster
create hive table instance SimpleName MethodInvocation MethodInvocation SimpleName get name
create hive table instance SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName storage
create hive table instance SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get database
create hive table instance SimpleName MethodInvocation MethodInvocation SimpleName to lower case
create hive table instance SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName storage
create hive table instance SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get table
create hive table instance SimpleName MethodInvocation MethodInvocation SimpleName to lower case
cluster SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to lower case
get name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to lower case
cluster SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to lower case
get name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to lower case
to lower case SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to lower case
list SimpleName SimpleType ParameterizedType SimpleType SimpleName location
feed helper SimpleName MethodInvocation SimpleName get locations
feed helper SimpleName MethodInvocation SimpleName feed cluster
feed helper SimpleName MethodInvocation SimpleName feed
get locations SimpleName MethodInvocation SimpleName feed cluster
get locations SimpleName MethodInvocation SimpleName feed
feed cluster SimpleName MethodInvocation SimpleName feed
locations SimpleName VariableDeclarationFragment MethodInvocation SimpleName feed helper
locations SimpleName VariableDeclarationFragment MethodInvocation SimpleName get locations
locations SimpleName VariableDeclarationFragment MethodInvocation SimpleName feed cluster
locations SimpleName VariableDeclarationFragment MethodInvocation SimpleName feed
file system storage SimpleName MethodInvocation SimpleName get location
file system storage SimpleName MethodInvocation SimpleName locations
file system storage SimpleName MethodInvocation QualifiedName location typedata
get location SimpleName MethodInvocation SimpleName locations
get location SimpleName MethodInvocation QualifiedName location typedata
locations SimpleName MethodInvocation QualifiedName location typedata
data location SimpleName VariableDeclarationFragment MethodInvocation SimpleName file system storage
data location SimpleName VariableDeclarationFragment MethodInvocation SimpleName get location
data location SimpleName VariableDeclarationFragment MethodInvocation SimpleName locations
data location SimpleName VariableDeclarationFragment MethodInvocation QualifiedName location typedata
location SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName data location
data location SimpleName MethodInvocation SimpleName get path
normalize SimpleName MethodInvocation MethodInvocation SimpleName data location
normalize SimpleName MethodInvocation MethodInvocation SimpleName get path
path uri SimpleName VariableDeclarationFragment MethodInvocation SimpleName normalize
path uri SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName data location
path uri SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get path
final Modifier VariableDeclarationStatement SimpleType SimpleName string
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName path uri
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName normalize
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName path uri
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation StringLiteral registering dfs path {}
log SimpleName MethodInvocation SimpleName path uri
info SimpleName MethodInvocation StringLiteral registering dfs path {}
info SimpleName MethodInvocation SimpleName path uri
registering dfs path {} StringLiteral MethodInvocation SimpleName path uri
cluster SimpleName MethodInvocation SimpleName get name
fill hdfs data set SimpleName MethodInvocation SimpleName path uri
fill hdfs data set SimpleName MethodInvocation MethodInvocation SimpleName cluster
fill hdfs data set SimpleName MethodInvocation MethodInvocation SimpleName get name
path uri SimpleName MethodInvocation MethodInvocation SimpleName cluster
path uri SimpleName MethodInvocation MethodInvocation SimpleName get name
private Modifier MethodDeclaration Modifier static
private Modifier MethodDeclaration ParameterizedType SimpleType SimpleName list
private Modifier MethodDeclaration ParameterizedType SimpleType SimpleName referenceable
private Modifier MethodDeclaration SimpleName get input entities
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType QualifiedName orgapachefalconentityv clustercluster
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName cluster
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName feed
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName feed
static Modifier MethodDeclaration ParameterizedType SimpleType SimpleName list
static Modifier MethodDeclaration ParameterizedType SimpleType SimpleName referenceable
static Modifier MethodDeclaration SimpleName get input entities
static Modifier MethodDeclaration SingleVariableDeclaration SimpleType QualifiedName orgapachefalconentityv clustercluster
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName cluster
static Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName feed
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName feed
static Modifier MethodDeclaration SimpleType SimpleName exception
list SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName get input entities
referenceable SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName get input entities
get input entities SimpleName MethodDeclaration SingleVariableDeclaration SimpleType QualifiedName orgapachefalconentityv clustercluster
get input entities SimpleName MethodDeclaration SingleVariableDeclaration SimpleName cluster
get input entities SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName feed
get input entities SimpleName MethodDeclaration SingleVariableDeclaration SimpleName feed
get input entities SimpleName MethodDeclaration SimpleType SimpleName exception
get input entities SimpleName MethodDeclaration Block VariableDeclarationStatement Modifier final
cluster SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName feed
cluster SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
feed SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration Modifier static
public Modifier TypeDeclaration MethodDeclaration SimpleName get input entities
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName cluster
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName feed
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration Modifier static
test SimpleName TypeDeclaration MethodDeclaration SimpleName get input entities
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName cluster
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName feed
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
