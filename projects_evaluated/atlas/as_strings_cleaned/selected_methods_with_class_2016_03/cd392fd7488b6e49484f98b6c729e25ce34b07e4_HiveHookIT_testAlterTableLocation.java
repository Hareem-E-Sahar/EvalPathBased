table name SimpleName VariableDeclarationFragment MethodInvocation SimpleName create table
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table name
system SimpleName MethodInvocation SimpleName get property
system SimpleName MethodInvocation StringLiteral javaiotmpdir
system SimpleName MethodInvocation StringLiteral tmp
get property SimpleName MethodInvocation StringLiteral javaiotmpdir
get property SimpleName MethodInvocation StringLiteral tmp
javaiotmpdir StringLiteral MethodInvocation StringLiteral tmp
file StringLiteral InfixExpression MethodInvocation SimpleName system
file StringLiteral InfixExpression MethodInvocation SimpleName get property
file StringLiteral InfixExpression MethodInvocation StringLiteral javaiotmpdir
file StringLiteral InfixExpression MethodInvocation StringLiteral tmp
file StringLiteral InfixExpression QualifiedName filepath separator
file StringLiteral InfixExpression StringLiteral test path
system SimpleName MethodInvocation InfixExpression QualifiedName filepath separator
get property SimpleName MethodInvocation InfixExpression QualifiedName filepath separator
javaiotmpdir StringLiteral MethodInvocation InfixExpression QualifiedName filepath separator
tmp StringLiteral MethodInvocation InfixExpression QualifiedName filepath separator
system SimpleName MethodInvocation InfixExpression StringLiteral test path
get property SimpleName MethodInvocation InfixExpression StringLiteral test path
javaiotmpdir StringLiteral MethodInvocation InfixExpression StringLiteral test path
tmp StringLiteral MethodInvocation InfixExpression StringLiteral test path
filepath separator QualifiedName InfixExpression StringLiteral test path
test path SimpleName VariableDeclarationFragment InfixExpression StringLiteral file
test path SimpleName VariableDeclarationFragment InfixExpression MethodInvocation SimpleName system
test path SimpleName VariableDeclarationFragment InfixExpression MethodInvocation SimpleName get property
test path SimpleName VariableDeclarationFragment InfixExpression MethodInvocation StringLiteral javaiotmpdir
test path SimpleName VariableDeclarationFragment InfixExpression MethodInvocation StringLiteral tmp
test path SimpleName VariableDeclarationFragment InfixExpression QualifiedName filepath separator
test path SimpleName VariableDeclarationFragment InfixExpression StringLiteral test path
final Modifier VariableDeclarationStatement SimpleType SimpleName string
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName test path
final Modifier VariableDeclarationStatement VariableDeclarationFragment InfixExpression StringLiteral file
final Modifier VariableDeclarationStatement VariableDeclarationFragment InfixExpression QualifiedName filepath separator
final Modifier VariableDeclarationStatement VariableDeclarationFragment InfixExpression StringLiteral test path
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName test path
alter table StringLiteral InfixExpression SimpleName table name
alter table StringLiteral InfixExpression StringLiteral set location
alter table StringLiteral InfixExpression SimpleName test path
alter table StringLiteral InfixExpression StringLiteral empty
table name SimpleName InfixExpression StringLiteral set location
table name SimpleName InfixExpression SimpleName test path
table name SimpleName InfixExpression StringLiteral empty
set location StringLiteral InfixExpression SimpleName test path
set location StringLiteral InfixExpression StringLiteral empty
test path SimpleName InfixExpression StringLiteral empty
query SimpleName VariableDeclarationFragment InfixExpression StringLiteral alter table
query SimpleName VariableDeclarationFragment InfixExpression SimpleName table name
query SimpleName VariableDeclarationFragment InfixExpression StringLiteral set location
query SimpleName VariableDeclarationFragment InfixExpression SimpleName test path
query SimpleName VariableDeclarationFragment InfixExpression StringLiteral empty
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
sd ref SimpleName MethodInvocation StringLiteral location
get SimpleName MethodInvocation StringLiteral location
assert SimpleName MethodInvocation SimpleName assert equals
assert SimpleName MethodInvocation MethodInvocation SimpleName sd ref
assert SimpleName MethodInvocation MethodInvocation SimpleName get
assert SimpleName MethodInvocation MethodInvocation StringLiteral location
assert SimpleName MethodInvocation SimpleName test path
assert equals SimpleName MethodInvocation MethodInvocation SimpleName sd ref
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get
assert equals SimpleName MethodInvocation MethodInvocation StringLiteral location
assert equals SimpleName MethodInvocation SimpleName test path
sd ref SimpleName MethodInvocation MethodInvocation SimpleName test path
get SimpleName MethodInvocation MethodInvocation SimpleName test path
location StringLiteral MethodInvocation MethodInvocation SimpleName test path
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test alter table location
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test alter table location
public Modifier MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration Block VariableDeclarationStatement Modifier final
void PrimitiveType MethodDeclaration SimpleName test alter table location
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement Modifier final
test alter table location SimpleName MethodDeclaration SimpleType SimpleName exception
test alter table location SimpleName MethodDeclaration Block VariableDeclarationStatement Modifier final
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test alter table location
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test alter table location
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception