connector SimpleName SimpleType SingleVariableDeclaration SimpleName test user conn
cluster user SimpleName SimpleType SingleVariableDeclaration SimpleName normal user
table permission SimpleName SimpleType SingleVariableDeclaration SimpleName perm
string SimpleName SimpleType SingleVariableDeclaration SimpleName table name
scanner SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName scanner
batch writer SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName writer
mutation SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName m
confirming that the presence of the StringLiteral InfixExpression SimpleName perm
confirming that the presence of the StringLiteral InfixExpression StringLiteral permission properly permits the user
perm SimpleName InfixExpression StringLiteral permission properly permits the user
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation InfixExpression StringLiteral confirming that the presence of the
log SimpleName MethodInvocation InfixExpression SimpleName perm
log SimpleName MethodInvocation InfixExpression StringLiteral permission properly permits the user
debug SimpleName MethodInvocation InfixExpression StringLiteral confirming that the presence of the
debug SimpleName MethodInvocation InfixExpression SimpleName perm
debug SimpleName MethodInvocation InfixExpression StringLiteral permission properly permits the user
test user conn SimpleName MethodInvocation SimpleName create scanner
test user conn SimpleName MethodInvocation SimpleName table name
test user conn SimpleName MethodInvocation QualifiedName authorizationsempty
create scanner SimpleName MethodInvocation SimpleName table name
create scanner SimpleName MethodInvocation QualifiedName authorizationsempty
table name SimpleName MethodInvocation QualifiedName authorizationsempty
scanner SimpleName Assignment MethodInvocation SimpleName test user conn
scanner SimpleName Assignment MethodInvocation SimpleName create scanner
scanner SimpleName Assignment MethodInvocation SimpleName table name
scanner SimpleName Assignment MethodInvocation QualifiedName authorizationsempty
entry SimpleName SimpleType ParameterizedType SimpleType SimpleName key
entry SimpleName SimpleType ParameterizedType SimpleType SimpleName value
key SimpleName SimpleType ParameterizedType SimpleType SimpleName value
scanner SimpleName MethodInvocation SimpleName iterator
iter SimpleName VariableDeclarationFragment MethodInvocation SimpleName scanner
iter SimpleName VariableDeclarationFragment MethodInvocation SimpleName iterator
iter SimpleName MethodInvocation SimpleName has next
iter SimpleName MethodInvocation SimpleName next
test user conn SimpleName MethodInvocation SimpleName create batch writer
test user conn SimpleName MethodInvocation SimpleName table name
test user conn SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName batch writer config
create batch writer SimpleName MethodInvocation SimpleName table name
create batch writer SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName batch writer config
table name SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName batch writer config
writer SimpleName Assignment MethodInvocation SimpleName test user conn
writer SimpleName Assignment MethodInvocation SimpleName create batch writer
writer SimpleName Assignment MethodInvocation SimpleName table name
text SimpleName SimpleType ClassInstanceCreation StringLiteral row
mutation SimpleName SimpleType ClassInstanceCreation ClassInstanceCreation StringLiteral row
m SimpleName Assignment ClassInstanceCreation SimpleType SimpleName mutation
m SimpleName Assignment ClassInstanceCreation ClassInstanceCreation StringLiteral row
text SimpleName SimpleType ClassInstanceCreation StringLiteral a
text SimpleName SimpleType ClassInstanceCreation StringLiteral b
c StringLiteral MethodInvocation SimpleName get bytes
value SimpleName SimpleType ClassInstanceCreation MethodInvocation StringLiteral c
value SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get bytes
m SimpleName MethodInvocation SimpleName put
m SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName text
m SimpleName MethodInvocation ClassInstanceCreation StringLiteral a
m SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName text
m SimpleName MethodInvocation ClassInstanceCreation StringLiteral b
m SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName value
m SimpleName MethodInvocation ClassInstanceCreation MethodInvocation StringLiteral c
m SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get bytes
put SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName text
put SimpleName MethodInvocation ClassInstanceCreation StringLiteral a
put SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName text
put SimpleName MethodInvocation ClassInstanceCreation StringLiteral b
put SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName value
put SimpleName MethodInvocation ClassInstanceCreation MethodInvocation StringLiteral c
put SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get bytes
a StringLiteral ClassInstanceCreation MethodInvocation ClassInstanceCreation StringLiteral b
writer SimpleName MethodInvocation SimpleName add mutation
writer SimpleName MethodInvocation SimpleName m
add mutation SimpleName MethodInvocation SimpleName m
writer SimpleName MethodInvocation SimpleName close
set SimpleName SimpleType ParameterizedType SimpleType SimpleName text
map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
set SimpleName SimpleType ParameterizedType SimpleType SimpleName text
hash map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
hash set SimpleName SimpleType ParameterizedType SimpleType SimpleName text
text SimpleName SimpleType ClassInstanceCreation StringLiteral t
text SimpleName SimpleType ClassInstanceCreation StringLiteral t
arrays SimpleName MethodInvocation SimpleName as list
arrays SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName text
arrays SimpleName MethodInvocation ClassInstanceCreation StringLiteral t
arrays SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName text
arrays SimpleName MethodInvocation ClassInstanceCreation StringLiteral t
as list SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName text
as list SimpleName MethodInvocation ClassInstanceCreation StringLiteral t
as list SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName text
as list SimpleName MethodInvocation ClassInstanceCreation StringLiteral t
t StringLiteral ClassInstanceCreation MethodInvocation ClassInstanceCreation StringLiteral t
groups SimpleName MethodInvocation SimpleName put
groups SimpleName MethodInvocation StringLiteral tgroup
groups SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName arrays
groups SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName as list
put SimpleName MethodInvocation StringLiteral tgroup
put SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName arrays
put SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName as list
tgroup StringLiteral MethodInvocation ClassInstanceCreation MethodInvocation SimpleName arrays
tgroup StringLiteral MethodInvocation ClassInstanceCreation MethodInvocation SimpleName as list
test user conn SimpleName MethodInvocation SimpleName table operations
test user conn SimpleName MethodInvocation MethodInvocation SimpleName delete
table operations SimpleName MethodInvocation MethodInvocation SimpleName delete
test user conn SimpleName MethodInvocation MethodInvocation SimpleName table name
table operations SimpleName MethodInvocation MethodInvocation SimpleName table name
delete SimpleName MethodInvocation SimpleName table name
test user conn SimpleName MethodInvocation SimpleName security operations
test user conn SimpleName MethodInvocation MethodInvocation SimpleName grant table permission
security operations SimpleName MethodInvocation MethodInvocation SimpleName grant table permission
test user conn SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get admin principal
security operations SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get admin principal
test user conn SimpleName MethodInvocation MethodInvocation SimpleName table name
security operations SimpleName MethodInvocation MethodInvocation SimpleName table name
test user conn SimpleName MethodInvocation MethodInvocation QualifiedName table permissiongrant
security operations SimpleName MethodInvocation MethodInvocation QualifiedName table permissiongrant
grant table permission SimpleName MethodInvocation MethodInvocation SimpleName get admin principal
grant table permission SimpleName MethodInvocation SimpleName table name
grant table permission SimpleName MethodInvocation QualifiedName table permissiongrant
get admin principal SimpleName MethodInvocation MethodInvocation SimpleName table name
get admin principal SimpleName MethodInvocation MethodInvocation QualifiedName table permissiongrant
table name SimpleName MethodInvocation QualifiedName table permissiongrant
unrecognized table permission StringLiteral InfixExpression SimpleName perm
illegal argument exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral unrecognized table permission
illegal argument exception SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName perm
perm SimpleName SwitchStatement SwitchCase SimpleName read
perm SimpleName SwitchStatement ExpressionStatement Assignment SimpleName scanner
perm SimpleName SwitchStatement VariableDeclarationStatement VariableDeclarationFragment SimpleName iter
perm SimpleName SwitchStatement WhileStatement MethodInvocation SimpleName iter
perm SimpleName SwitchStatement WhileStatement MethodInvocation SimpleName has next
read SimpleName SwitchCase SwitchStatement SwitchCase SimpleName write
bulk import SimpleName SwitchCase SwitchStatement SwitchCase SimpleName alter table
alter table SimpleName SwitchCase SwitchStatement SwitchCase SimpleName drop table
drop table SimpleName SwitchCase SwitchStatement SwitchCase SimpleName grant
private Modifier MethodDeclaration PrimitiveType void
private Modifier MethodDeclaration SimpleName test granted table permission
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName connector
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName test user conn
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName cluster user
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName normal user
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName table permission
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName perm
void PrimitiveType MethodDeclaration SimpleName test granted table permission
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName connector
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName test user conn
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName cluster user
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName normal user
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName table permission
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName perm
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName table name
test granted table permission SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName connector
test granted table permission SimpleName MethodDeclaration SingleVariableDeclaration SimpleName test user conn
test granted table permission SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName cluster user
test granted table permission SimpleName MethodDeclaration SingleVariableDeclaration SimpleName normal user
test granted table permission SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName table permission
test granted table permission SimpleName MethodDeclaration SingleVariableDeclaration SimpleName perm
test granted table permission SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
test granted table permission SimpleName MethodDeclaration SingleVariableDeclaration SimpleName table name
test granted table permission SimpleName MethodDeclaration SimpleType SimpleName accumulo exception
test user conn SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName normal user
test user conn SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName perm
test user conn SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName table name
test user conn SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName accumulo exception
test user conn SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName table exists exception
normal user SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName perm
normal user SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName table name
normal user SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName accumulo exception
normal user SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName table exists exception
normal user SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName accumulo security exception
perm SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName table name
perm SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName accumulo exception
perm SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName table exists exception
perm SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName accumulo security exception
perm SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName table not found exception
table name SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName accumulo exception
table name SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName table exists exception
table name SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName accumulo security exception
table name SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName table not found exception
table name SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName mutations rejected exception
accumulo exception SimpleName SimpleType MethodDeclaration SimpleType SimpleName table exists exception
accumulo exception SimpleName SimpleType MethodDeclaration SimpleType SimpleName accumulo security exception
accumulo exception SimpleName SimpleType MethodDeclaration SimpleType SimpleName table not found exception
accumulo exception SimpleName SimpleType MethodDeclaration SimpleType SimpleName mutations rejected exception
table exists exception SimpleName SimpleType MethodDeclaration SimpleType SimpleName accumulo security exception
table exists exception SimpleName SimpleType MethodDeclaration SimpleType SimpleName table not found exception
table exists exception SimpleName SimpleType MethodDeclaration SimpleType SimpleName mutations rejected exception
accumulo security exception SimpleName SimpleType MethodDeclaration SimpleType SimpleName table not found exception
accumulo security exception SimpleName SimpleType MethodDeclaration SimpleType SimpleName mutations rejected exception
table not found exception SimpleName SimpleType MethodDeclaration SimpleType SimpleName mutations rejected exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test granted table permission
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName test user conn
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName normal user
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName perm
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName table name
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName accumulo exception
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName table exists exception
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName accumulo security exception
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName table not found exception
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName mutations rejected exception
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test granted table permission
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName test user conn
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName normal user
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName perm
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName table name
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName accumulo exception
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName table exists exception
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName accumulo security exception
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName table not found exception
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName mutations rejected exception
