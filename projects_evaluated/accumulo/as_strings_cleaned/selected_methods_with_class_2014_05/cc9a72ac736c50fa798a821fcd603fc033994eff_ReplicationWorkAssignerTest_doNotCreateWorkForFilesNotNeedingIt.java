replication target SimpleName SimpleType ClassInstanceCreation StringLiteral cluster
replication target SimpleName SimpleType ClassInstanceCreation StringLiteral table
cluster StringLiteral ClassInstanceCreation StringLiteral table
target SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName replication target
target SimpleName VariableDeclarationFragment ClassInstanceCreation StringLiteral cluster
target SimpleName VariableDeclarationFragment ClassInstanceCreation StringLiteral table
replication target SimpleName SimpleType ClassInstanceCreation StringLiteral cluster
replication target SimpleName SimpleType ClassInstanceCreation StringLiteral table
cluster StringLiteral ClassInstanceCreation StringLiteral table
target SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName replication target
target SimpleName VariableDeclarationFragment ClassInstanceCreation StringLiteral cluster
target SimpleName VariableDeclarationFragment ClassInstanceCreation StringLiteral table
replication target SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName target
replication target SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName target
target SimpleName VariableDeclarationFragment VariableDeclarationStatement VariableDeclarationFragment SimpleName target
replication target SimpleName MethodInvocation SimpleName to text
replication target SimpleName MethodInvocation SimpleName target
to text SimpleName MethodInvocation SimpleName target
serialized target SimpleName VariableDeclarationFragment MethodInvocation SimpleName replication target
serialized target SimpleName VariableDeclarationFragment MethodInvocation SimpleName to text
serialized target SimpleName VariableDeclarationFragment MethodInvocation SimpleName target
replication target SimpleName MethodInvocation SimpleName to text
replication target SimpleName MethodInvocation SimpleName target
to text SimpleName MethodInvocation SimpleName target
serialized target SimpleName VariableDeclarationFragment MethodInvocation SimpleName replication target
serialized target SimpleName VariableDeclarationFragment MethodInvocation SimpleName to text
serialized target SimpleName VariableDeclarationFragment MethodInvocation SimpleName target
text SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName serialized target
text SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName serialized target
serialized target SimpleName VariableDeclarationFragment VariableDeclarationStatement VariableDeclarationFragment SimpleName serialized target
test SimpleName MethodInvocation SimpleName get method name
mock instance SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName test
mock instance SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get method name
inst SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName mock instance
inst SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName test
inst SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName get method name
mock instance SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName inst
password token SimpleName SimpleType ClassInstanceCreation StringLiteral empty
credentials SimpleName SimpleType ClassInstanceCreation StringLiteral root
credentials SimpleName SimpleType ClassInstanceCreation ClassInstanceCreation StringLiteral empty
root StringLiteral ClassInstanceCreation ClassInstanceCreation SimpleType SimpleName password token
root StringLiteral ClassInstanceCreation ClassInstanceCreation StringLiteral empty
creds SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName credentials
creds SimpleName VariableDeclarationFragment ClassInstanceCreation StringLiteral root
creds SimpleName VariableDeclarationFragment ClassInstanceCreation ClassInstanceCreation StringLiteral empty
credentials SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName creds
creds SimpleName MethodInvocation SimpleName get principal
creds SimpleName MethodInvocation SimpleName get token
inst SimpleName MethodInvocation SimpleName get connector
inst SimpleName MethodInvocation MethodInvocation SimpleName creds
inst SimpleName MethodInvocation MethodInvocation SimpleName get principal
inst SimpleName MethodInvocation MethodInvocation SimpleName creds
inst SimpleName MethodInvocation MethodInvocation SimpleName get token
get connector SimpleName MethodInvocation MethodInvocation SimpleName creds
get connector SimpleName MethodInvocation MethodInvocation SimpleName get principal
get connector SimpleName MethodInvocation MethodInvocation SimpleName creds
get connector SimpleName MethodInvocation MethodInvocation SimpleName get token
creds SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName creds
creds SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get token
get principal SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName creds
get principal SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get token
conn SimpleName VariableDeclarationFragment MethodInvocation SimpleName inst
conn SimpleName VariableDeclarationFragment MethodInvocation SimpleName get connector
conn SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName creds
conn SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get principal
conn SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName creds
conn SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get token
connector SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName conn
assigner SimpleName MethodInvocation SimpleName set connector
assigner SimpleName MethodInvocation SimpleName conn
set connector SimpleName MethodInvocation SimpleName conn
replication table SimpleName MethodInvocation SimpleName create
replication table SimpleName MethodInvocation SimpleName conn
create SimpleName MethodInvocation SimpleName conn
conn SimpleName MethodInvocation SimpleName security operations
conn SimpleName MethodInvocation MethodInvocation SimpleName grant table permission
security operations SimpleName MethodInvocation MethodInvocation SimpleName grant table permission
conn SimpleName MethodInvocation MethodInvocation StringLiteral root
security operations SimpleName MethodInvocation MethodInvocation StringLiteral root
conn SimpleName MethodInvocation MethodInvocation QualifiedName replication tablename
security operations SimpleName MethodInvocation MethodInvocation QualifiedName replication tablename
conn SimpleName MethodInvocation MethodInvocation QualifiedName table permissionwrite
security operations SimpleName MethodInvocation MethodInvocation QualifiedName table permissionwrite
grant table permission SimpleName MethodInvocation StringLiteral root
grant table permission SimpleName MethodInvocation QualifiedName replication tablename
grant table permission SimpleName MethodInvocation QualifiedName table permissionwrite
root StringLiteral MethodInvocation QualifiedName replication tablename
root StringLiteral MethodInvocation QualifiedName table permissionwrite
replication tablename QualifiedName MethodInvocation QualifiedName table permissionwrite
replication table SimpleName MethodInvocation SimpleName get batch writer
replication table SimpleName MethodInvocation SimpleName conn
get batch writer SimpleName MethodInvocation SimpleName conn
bw SimpleName VariableDeclarationFragment MethodInvocation SimpleName replication table
bw SimpleName VariableDeclarationFragment MethodInvocation SimpleName get batch writer
bw SimpleName VariableDeclarationFragment MethodInvocation SimpleName conn
batch writer SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName bw
uuid SimpleName MethodInvocation SimpleName random uuid
uuid SimpleName MethodInvocation MethodInvocation SimpleName to string
random uuid SimpleName MethodInvocation MethodInvocation SimpleName to string
filename SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName uuid
filename SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName random uuid
filename SimpleName VariableDeclarationFragment MethodInvocation SimpleName to string
uuid SimpleName MethodInvocation SimpleName random uuid
uuid SimpleName MethodInvocation MethodInvocation SimpleName to string
random uuid SimpleName MethodInvocation MethodInvocation SimpleName to string
filename SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName uuid
filename SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName random uuid
filename SimpleName VariableDeclarationFragment MethodInvocation SimpleName to string
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName filename
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName filename
filename SimpleName VariableDeclarationFragment VariableDeclarationStatement VariableDeclarationFragment SimpleName filename
accumulowaltserverport StringLiteral InfixExpression SimpleName filename
file SimpleName VariableDeclarationFragment InfixExpression StringLiteral accumulowaltserverport
file SimpleName VariableDeclarationFragment InfixExpression SimpleName filename
accumulowaltserverport StringLiteral InfixExpression SimpleName filename
file SimpleName VariableDeclarationFragment InfixExpression StringLiteral accumulowaltserverport
file SimpleName VariableDeclarationFragment InfixExpression SimpleName filename
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName file
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName file
file SimpleName VariableDeclarationFragment VariableDeclarationStatement VariableDeclarationFragment SimpleName file
mutation SimpleName SimpleType ClassInstanceCreation SimpleName file
m SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName mutation
m SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName file
mutation SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName m
status util SimpleName MethodInvocation SimpleName new file value
work section SimpleName MethodInvocation SimpleName add
work section SimpleName MethodInvocation SimpleName m
work section SimpleName MethodInvocation SimpleName serialized target
work section SimpleName MethodInvocation MethodInvocation SimpleName status util
work section SimpleName MethodInvocation MethodInvocation SimpleName new file value
add SimpleName MethodInvocation SimpleName m
add SimpleName MethodInvocation SimpleName serialized target
add SimpleName MethodInvocation MethodInvocation SimpleName status util
add SimpleName MethodInvocation MethodInvocation SimpleName new file value
m SimpleName MethodInvocation SimpleName serialized target
m SimpleName MethodInvocation MethodInvocation SimpleName status util
m SimpleName MethodInvocation MethodInvocation SimpleName new file value
serialized target SimpleName MethodInvocation MethodInvocation SimpleName status util
serialized target SimpleName MethodInvocation MethodInvocation SimpleName new file value
bw SimpleName MethodInvocation SimpleName add mutation
bw SimpleName MethodInvocation SimpleName m
add mutation SimpleName MethodInvocation SimpleName m
mutation SimpleName SimpleType ClassInstanceCreation SimpleName file
m SimpleName Assignment ClassInstanceCreation SimpleType SimpleName mutation
m SimpleName Assignment ClassInstanceCreation SimpleName file
status util SimpleName MethodInvocation SimpleName new file value
work section SimpleName MethodInvocation SimpleName add
work section SimpleName MethodInvocation SimpleName m
work section SimpleName MethodInvocation SimpleName serialized target
work section SimpleName MethodInvocation MethodInvocation SimpleName status util
work section SimpleName MethodInvocation MethodInvocation SimpleName new file value
add SimpleName MethodInvocation SimpleName m
add SimpleName MethodInvocation SimpleName serialized target
add SimpleName MethodInvocation MethodInvocation SimpleName status util
add SimpleName MethodInvocation MethodInvocation SimpleName new file value
m SimpleName MethodInvocation SimpleName serialized target
m SimpleName MethodInvocation MethodInvocation SimpleName status util
m SimpleName MethodInvocation MethodInvocation SimpleName new file value
serialized target SimpleName MethodInvocation MethodInvocation SimpleName status util
serialized target SimpleName MethodInvocation MethodInvocation SimpleName new file value
bw SimpleName MethodInvocation SimpleName add mutation
bw SimpleName MethodInvocation SimpleName m
add mutation SimpleName MethodInvocation SimpleName m
bw SimpleName MethodInvocation SimpleName close
create mock SimpleName MethodInvocation TypeLiteral SimpleType SimpleName distributed work queue
work queue SimpleName VariableDeclarationFragment MethodInvocation SimpleName create mock
distributed work queue SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName work queue
suppress warnings SimpleName SingleMemberAnnotation StringLiteral unchecked
hash set SimpleName SimpleType ParameterizedType SimpleType SimpleName string
create mock SimpleName MethodInvocation TypeLiteral SimpleType SimpleName hash set
queued work SimpleName VariableDeclarationFragment MethodInvocation SimpleName create mock
suppress warnings SimpleName SingleMemberAnnotation VariableDeclarationStatement VariableDeclarationFragment SimpleName queued work
unchecked StringLiteral SingleMemberAnnotation VariableDeclarationStatement VariableDeclarationFragment SimpleName queued work
assigner SimpleName MethodInvocation SimpleName set queued work
assigner SimpleName MethodInvocation SimpleName queued work
set queued work SimpleName MethodInvocation SimpleName queued work
assigner SimpleName MethodInvocation SimpleName set max queue size
assigner SimpleName MethodInvocation QualifiedName integermax value
set max queue size SimpleName MethodInvocation QualifiedName integermax value
queued work SimpleName MethodInvocation SimpleName size
expect SimpleName MethodInvocation MethodInvocation SimpleName queued work
expect SimpleName MethodInvocation MethodInvocation SimpleName size
expect SimpleName MethodInvocation MethodInvocation SimpleName and return
queued work SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName and return
size SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName and return
expect SimpleName MethodInvocation MethodInvocation NumberLiteral empty
queued work SimpleName MethodInvocation MethodInvocation MethodInvocation NumberLiteral empty
size SimpleName MethodInvocation MethodInvocation MethodInvocation NumberLiteral empty
and return SimpleName MethodInvocation NumberLiteral empty
expect SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName times
and return SimpleName MethodInvocation MethodInvocation SimpleName times
empty NumberLiteral MethodInvocation MethodInvocation SimpleName times
expect SimpleName MethodInvocation MethodInvocation MethodInvocation NumberLiteral empty
and return SimpleName MethodInvocation MethodInvocation NumberLiteral empty
empty NumberLiteral MethodInvocation MethodInvocation NumberLiteral empty
times SimpleName MethodInvocation NumberLiteral empty
replay SimpleName MethodInvocation SimpleName queued work
replay SimpleName MethodInvocation SimpleName work queue
queued work SimpleName MethodInvocation SimpleName work queue
assigner SimpleName MethodInvocation SimpleName create work
verify SimpleName MethodInvocation SimpleName queued work
verify SimpleName MethodInvocation SimpleName work queue
queued work SimpleName MethodInvocation SimpleName work queue
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName do not create work for files not needing it
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName do not create work for files not needing it
public Modifier MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration SimpleName do not create work for files not needing it
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
do not create work for files not needing it SimpleName MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName do not create work for files not needing it
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName do not create work for files not needing it
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
