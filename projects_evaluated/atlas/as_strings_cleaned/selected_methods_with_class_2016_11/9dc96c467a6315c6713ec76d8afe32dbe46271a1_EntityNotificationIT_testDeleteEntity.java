table StringLiteral InfixExpression MethodInvocation SimpleName random string
table name SimpleName VariableDeclarationFragment InfixExpression StringLiteral table
table name SimpleName VariableDeclarationFragment InfixExpression MethodInvocation SimpleName random string
final Modifier VariableDeclarationStatement SimpleType SimpleName string
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName table name
final Modifier VariableDeclarationStatement VariableDeclarationFragment InfixExpression StringLiteral table
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table name
db StringLiteral InfixExpression MethodInvocation SimpleName random string
db name SimpleName VariableDeclarationFragment InfixExpression StringLiteral db
db name SimpleName VariableDeclarationFragment InfixExpression MethodInvocation SimpleName random string
final Modifier VariableDeclarationStatement SimpleType SimpleName string
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName db name
final Modifier VariableDeclarationStatement VariableDeclarationFragment InfixExpression StringLiteral db
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName db name
create hive db instance SimpleName MethodInvocation SimpleName db name
hive db instance SimpleName VariableDeclarationFragment MethodInvocation SimpleName create hive db instance
hive db instance SimpleName VariableDeclarationFragment MethodInvocation SimpleName db name
referenceable SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName hive db instance
create instance SimpleName MethodInvocation SimpleName hive db instance
db id SimpleName VariableDeclarationFragment MethodInvocation SimpleName create instance
db id SimpleName VariableDeclarationFragment MethodInvocation SimpleName hive db instance
id SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName db id
hive db instance SimpleName MethodInvocation SimpleName replace with new id
hive db instance SimpleName MethodInvocation SimpleName db id
replace with new id SimpleName MethodInvocation SimpleName db id
create hive table instance SimpleName MethodInvocation SimpleName hive db instance
create hive table instance SimpleName MethodInvocation SimpleName table name
hive db instance SimpleName MethodInvocation SimpleName table name
table instance SimpleName VariableDeclarationFragment MethodInvocation SimpleName create hive table instance
table instance SimpleName VariableDeclarationFragment MethodInvocation SimpleName hive db instance
table instance SimpleName VariableDeclarationFragment MethodInvocation SimpleName table name
referenceable SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table instance
create instance SimpleName MethodInvocation SimpleName table instance
table id SimpleName VariableDeclarationFragment MethodInvocation SimpleName create instance
table id SimpleName VariableDeclarationFragment MethodInvocation SimpleName table instance
final Modifier VariableDeclarationStatement SimpleType SimpleName id
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName table id
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName create instance
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName table instance
id SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table id
table id SimpleName MethodInvocation SimpleName get id
guid SimpleName VariableDeclarationFragment MethodInvocation SimpleName table id
guid SimpleName VariableDeclarationFragment MethodInvocation SimpleName get id
final Modifier VariableDeclarationStatement SimpleType SimpleName string
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName guid
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName table id
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get id
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName guid
new notification predicate SimpleName MethodInvocation QualifiedName entity notificationoperation typeentity create
new notification predicate SimpleName MethodInvocation SimpleName hive table type
new notification predicate SimpleName MethodInvocation SimpleName guid
entity notificationoperation typeentity create QualifiedName MethodInvocation SimpleName hive table type
entity notificationoperation typeentity create QualifiedName MethodInvocation SimpleName guid
hive table type SimpleName MethodInvocation SimpleName guid
wait for notification SimpleName MethodInvocation SimpleName notification consumer
wait for notification SimpleName MethodInvocation SimpleName max wait time
wait for notification SimpleName MethodInvocation MethodInvocation SimpleName new notification predicate
wait for notification SimpleName MethodInvocation MethodInvocation QualifiedName entity notificationoperation typeentity create
wait for notification SimpleName MethodInvocation MethodInvocation SimpleName hive table type
wait for notification SimpleName MethodInvocation MethodInvocation SimpleName guid
notification consumer SimpleName MethodInvocation SimpleName max wait time
notification consumer SimpleName MethodInvocation MethodInvocation SimpleName new notification predicate
notification consumer SimpleName MethodInvocation MethodInvocation QualifiedName entity notificationoperation typeentity create
notification consumer SimpleName MethodInvocation MethodInvocation SimpleName hive table type
notification consumer SimpleName MethodInvocation MethodInvocation SimpleName guid
max wait time SimpleName MethodInvocation MethodInvocation SimpleName new notification predicate
max wait time SimpleName MethodInvocation MethodInvocation QualifiedName entity notificationoperation typeentity create
max wait time SimpleName MethodInvocation MethodInvocation SimpleName hive table type
max wait time SimpleName MethodInvocation MethodInvocation SimpleName guid
table instance SimpleName MethodInvocation SimpleName get
table instance SimpleName MethodInvocation QualifiedName atlas clientreferenceable attribute name
get SimpleName MethodInvocation QualifiedName atlas clientreferenceable attribute name
string SimpleName SimpleType CastExpression MethodInvocation SimpleName table instance
string SimpleName SimpleType CastExpression MethodInvocation SimpleName get
string SimpleName SimpleType CastExpression MethodInvocation QualifiedName atlas clientreferenceable attribute name
name SimpleName VariableDeclarationFragment CastExpression SimpleType SimpleName string
name SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName table instance
name SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName get
name SimpleName VariableDeclarationFragment CastExpression MethodInvocation QualifiedName atlas clientreferenceable attribute name
final Modifier VariableDeclarationStatement SimpleType SimpleName string
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName name
service client SimpleName MethodInvocation SimpleName delete entity
service client SimpleName MethodInvocation SimpleName hive table type
service client SimpleName MethodInvocation QualifiedName atlas clientreferenceable attribute name
service client SimpleName MethodInvocation SimpleName name
delete entity SimpleName MethodInvocation SimpleName hive table type
delete entity SimpleName MethodInvocation QualifiedName atlas clientreferenceable attribute name
delete entity SimpleName MethodInvocation SimpleName name
hive table type SimpleName MethodInvocation QualifiedName atlas clientreferenceable attribute name
hive table type SimpleName MethodInvocation SimpleName name
atlas clientreferenceable attribute name QualifiedName MethodInvocation SimpleName name
new notification predicate SimpleName MethodInvocation QualifiedName entity notificationoperation typeentity delete
new notification predicate SimpleName MethodInvocation SimpleName hive table type
new notification predicate SimpleName MethodInvocation SimpleName guid
entity notificationoperation typeentity delete QualifiedName MethodInvocation SimpleName hive table type
entity notificationoperation typeentity delete QualifiedName MethodInvocation SimpleName guid
hive table type SimpleName MethodInvocation SimpleName guid
wait for notification SimpleName MethodInvocation SimpleName notification consumer
wait for notification SimpleName MethodInvocation SimpleName max wait time
wait for notification SimpleName MethodInvocation MethodInvocation SimpleName new notification predicate
wait for notification SimpleName MethodInvocation MethodInvocation QualifiedName entity notificationoperation typeentity delete
wait for notification SimpleName MethodInvocation MethodInvocation SimpleName hive table type
wait for notification SimpleName MethodInvocation MethodInvocation SimpleName guid
notification consumer SimpleName MethodInvocation SimpleName max wait time
notification consumer SimpleName MethodInvocation MethodInvocation SimpleName new notification predicate
notification consumer SimpleName MethodInvocation MethodInvocation QualifiedName entity notificationoperation typeentity delete
notification consumer SimpleName MethodInvocation MethodInvocation SimpleName hive table type
notification consumer SimpleName MethodInvocation MethodInvocation SimpleName guid
max wait time SimpleName MethodInvocation MethodInvocation SimpleName new notification predicate
max wait time SimpleName MethodInvocation MethodInvocation QualifiedName entity notificationoperation typeentity delete
max wait time SimpleName MethodInvocation MethodInvocation SimpleName hive table type
max wait time SimpleName MethodInvocation MethodInvocation SimpleName guid
final Modifier VariableDeclarationStatement Block VariableDeclarationStatement Modifier final
final Modifier VariableDeclarationStatement Block VariableDeclarationStatement Modifier final
final Modifier VariableDeclarationStatement Block VariableDeclarationStatement Modifier final
final Modifier VariableDeclarationStatement Block VariableDeclarationStatement Modifier final
final Modifier VariableDeclarationStatement Block VariableDeclarationStatement Modifier final
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test delete entity
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test delete entity
public Modifier MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration Block VariableDeclarationStatement Modifier final
public Modifier MethodDeclaration Block VariableDeclarationStatement Modifier final
public Modifier MethodDeclaration Block VariableDeclarationStatement Modifier final
public Modifier MethodDeclaration Block VariableDeclarationStatement Modifier final
public Modifier MethodDeclaration Block VariableDeclarationStatement Modifier final
void PrimitiveType MethodDeclaration SimpleName test delete entity
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement Modifier final
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement Modifier final
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement Modifier final
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement Modifier final
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement Modifier final
test delete entity SimpleName MethodDeclaration SimpleType SimpleName exception
test delete entity SimpleName MethodDeclaration Block VariableDeclarationStatement Modifier final
test delete entity SimpleName MethodDeclaration Block VariableDeclarationStatement Modifier final
test delete entity SimpleName MethodDeclaration Block VariableDeclarationStatement Modifier final
test delete entity SimpleName MethodDeclaration Block VariableDeclarationStatement Modifier final
test delete entity SimpleName MethodDeclaration Block VariableDeclarationStatement Modifier final
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test delete entity
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test delete entity
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
