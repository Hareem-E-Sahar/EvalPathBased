connector SimpleName SimpleType SingleVariableDeclaration SimpleName conn
string SimpleName SimpleType SingleVariableDeclaration SimpleName path
replication target SimpleName SimpleType SingleVariableDeclaration SimpleName target
status SimpleName VariableDeclarationFragment StringLiteral unknown
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName status
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment StringLiteral unknown
scanner SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName s
conn SimpleName MethodInvocation SimpleName create scanner
conn SimpleName MethodInvocation QualifiedName replication tablename
conn SimpleName MethodInvocation QualifiedName authorizationsempty
create scanner SimpleName MethodInvocation QualifiedName replication tablename
create scanner SimpleName MethodInvocation QualifiedName authorizationsempty
replication tablename QualifiedName MethodInvocation QualifiedName authorizationsempty
s SimpleName Assignment MethodInvocation SimpleName conn
s SimpleName Assignment MethodInvocation SimpleName create scanner
s SimpleName Assignment MethodInvocation QualifiedName replication tablename
s SimpleName Assignment MethodInvocation QualifiedName authorizationsempty
table not found exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral replication table no long exists
log SimpleName MethodInvocation SimpleName e
debug SimpleName MethodInvocation StringLiteral replication table no long exists
debug SimpleName MethodInvocation SimpleName e
replication table no long exists StringLiteral MethodInvocation SimpleName e
range SimpleName MethodInvocation SimpleName exact
range SimpleName MethodInvocation SimpleName path
exact SimpleName MethodInvocation SimpleName path
s SimpleName MethodInvocation SimpleName set range
s SimpleName MethodInvocation MethodInvocation SimpleName range
s SimpleName MethodInvocation MethodInvocation SimpleName exact
s SimpleName MethodInvocation MethodInvocation SimpleName path
set range SimpleName MethodInvocation MethodInvocation SimpleName range
set range SimpleName MethodInvocation MethodInvocation SimpleName exact
set range SimpleName MethodInvocation MethodInvocation SimpleName path
target SimpleName MethodInvocation SimpleName to text
s SimpleName MethodInvocation SimpleName fetch column
s SimpleName MethodInvocation QualifiedName work sectionname
s SimpleName MethodInvocation MethodInvocation SimpleName target
s SimpleName MethodInvocation MethodInvocation SimpleName to text
fetch column SimpleName MethodInvocation QualifiedName work sectionname
fetch column SimpleName MethodInvocation MethodInvocation SimpleName target
fetch column SimpleName MethodInvocation MethodInvocation SimpleName to text
work sectionname QualifiedName MethodInvocation MethodInvocation SimpleName target
work sectionname QualifiedName MethodInvocation MethodInvocation SimpleName to text
entry SimpleName SimpleType ParameterizedType SimpleType SimpleName key
entry SimpleName SimpleType ParameterizedType SimpleType SimpleName value
key SimpleName SimpleType ParameterizedType SimpleType SimpleName value
iterables SimpleName MethodInvocation SimpleName get only element
iterables SimpleName MethodInvocation SimpleName s
get only element SimpleName MethodInvocation SimpleName s
kv SimpleName Assignment MethodInvocation SimpleName iterables
kv SimpleName Assignment MethodInvocation SimpleName get only element
kv SimpleName Assignment MethodInvocation SimpleName s
no such element exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
log SimpleName MethodInvocation SimpleName trace
log SimpleName MethodInvocation StringLiteral could not find status of {} replicating to {}
log SimpleName MethodInvocation SimpleName path
log SimpleName MethodInvocation SimpleName target
trace SimpleName MethodInvocation StringLiteral could not find status of {} replicating to {}
trace SimpleName MethodInvocation SimpleName path
trace SimpleName MethodInvocation SimpleName target
could not find status of {} replicating to {} StringLiteral MethodInvocation SimpleName path
could not find status of {} replicating to {} StringLiteral MethodInvocation SimpleName target
path SimpleName MethodInvocation SimpleName target
status SimpleName Assignment StringLiteral unknown
s SimpleName MethodInvocation SimpleName close
kv SimpleName MethodInvocation SimpleName get value
kv SimpleName MethodInvocation MethodInvocation SimpleName get
get value SimpleName MethodInvocation MethodInvocation SimpleName get
status SimpleName MethodInvocation SimpleName parse from
status SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName kv
status SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get value
status SimpleName MethodInvocation MethodInvocation SimpleName get
parse from SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName kv
parse from SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get value
parse from SimpleName MethodInvocation MethodInvocation SimpleName get
stat SimpleName VariableDeclarationFragment MethodInvocation SimpleName status
stat SimpleName VariableDeclarationFragment MethodInvocation SimpleName parse from
stat SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get
status SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName stat
status util SimpleName MethodInvocation SimpleName is fully replicated
status util SimpleName MethodInvocation SimpleName stat
is fully replicated SimpleName MethodInvocation SimpleName stat
status SimpleName Assignment StringLiteral finished
stat SimpleName MethodInvocation SimpleName get infinite end
stat SimpleName MethodInvocation SimpleName get begin
stat SimpleName MethodInvocation InfixExpression StringLiteral infin records
get begin SimpleName MethodInvocation InfixExpression StringLiteral infin records
status SimpleName Assignment InfixExpression MethodInvocation SimpleName stat
status SimpleName Assignment InfixExpression MethodInvocation SimpleName get begin
status SimpleName Assignment InfixExpression StringLiteral infin records
stat SimpleName MethodInvocation SimpleName get begin
stat SimpleName MethodInvocation SimpleName get end
stat SimpleName MethodInvocation InfixExpression StringLiteral /
get begin SimpleName MethodInvocation InfixExpression StringLiteral /
stat SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName stat
stat SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get end
get begin SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName stat
get begin SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get end
stat SimpleName MethodInvocation InfixExpression StringLiteral records
get begin SimpleName MethodInvocation InfixExpression StringLiteral records
/ StringLiteral InfixExpression MethodInvocation SimpleName stat
/ StringLiteral InfixExpression MethodInvocation SimpleName get end
/ StringLiteral InfixExpression StringLiteral records
stat SimpleName MethodInvocation InfixExpression StringLiteral records
get end SimpleName MethodInvocation InfixExpression StringLiteral records
status SimpleName Assignment InfixExpression MethodInvocation SimpleName stat
status SimpleName Assignment InfixExpression MethodInvocation SimpleName get begin
status SimpleName Assignment InfixExpression StringLiteral /
status SimpleName Assignment InfixExpression MethodInvocation SimpleName stat
status SimpleName Assignment InfixExpression MethodInvocation SimpleName get end
status SimpleName Assignment InfixExpression StringLiteral records
invalid protocol buffer exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
kv SimpleName MethodInvocation SimpleName get key
log SimpleName MethodInvocation SimpleName warn
log SimpleName MethodInvocation StringLiteral could not deserialize protobuf for {}
log SimpleName MethodInvocation MethodInvocation SimpleName kv
log SimpleName MethodInvocation MethodInvocation SimpleName get key
log SimpleName MethodInvocation SimpleName e
warn SimpleName MethodInvocation StringLiteral could not deserialize protobuf for {}
warn SimpleName MethodInvocation MethodInvocation SimpleName kv
warn SimpleName MethodInvocation MethodInvocation SimpleName get key
warn SimpleName MethodInvocation SimpleName e
could not deserialize protobuf for {} StringLiteral MethodInvocation MethodInvocation SimpleName kv
could not deserialize protobuf for {} StringLiteral MethodInvocation MethodInvocation SimpleName get key
could not deserialize protobuf for {} StringLiteral MethodInvocation SimpleName e
kv SimpleName MethodInvocation MethodInvocation SimpleName e
get key SimpleName MethodInvocation MethodInvocation SimpleName e
status SimpleName Assignment StringLiteral unknown
public Modifier MethodDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SimpleName get progress
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName connector
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName conn
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName path
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName replication target
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName target
string SimpleName SimpleType MethodDeclaration SimpleName get progress
string SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName conn
string SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName path
string SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName target
get progress SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName connector
get progress SimpleName MethodDeclaration SingleVariableDeclaration SimpleName conn
get progress SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
get progress SimpleName MethodDeclaration SingleVariableDeclaration SimpleName path
get progress SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName replication target
get progress SimpleName MethodDeclaration SingleVariableDeclaration SimpleName target
get progress SimpleName MethodDeclaration Block ReturnStatement SimpleName status
conn SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName path
conn SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName target
path SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName target
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName string
public Modifier TypeDeclaration MethodDeclaration SimpleName get progress
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName conn
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName path
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName target
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName string
test SimpleName TypeDeclaration MethodDeclaration SimpleName get progress
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName conn
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName path
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName target