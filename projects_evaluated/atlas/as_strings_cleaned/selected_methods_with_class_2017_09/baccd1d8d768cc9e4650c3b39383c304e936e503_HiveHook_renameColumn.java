hive meta store bridge SimpleName SimpleType SingleVariableDeclaration SimpleName dgi bridge
hive event context SimpleName SimpleType SingleVariableDeclaration SimpleName event
event SimpleName MethodInvocation SimpleName get inputs
event SimpleName MethodInvocation SimpleName get inputs
event SimpleName MethodInvocation MethodInvocation SimpleName size
get inputs SimpleName MethodInvocation MethodInvocation SimpleName size
event SimpleName MethodInvocation MethodInvocation InfixExpression NumberLiteral empty
get inputs SimpleName MethodInvocation MethodInvocation InfixExpression NumberLiteral empty
size SimpleName MethodInvocation InfixExpression NumberLiteral empty
event SimpleName MethodInvocation SimpleName get outputs
event SimpleName MethodInvocation SimpleName get outputs
event SimpleName MethodInvocation MethodInvocation SimpleName size
get outputs SimpleName MethodInvocation MethodInvocation SimpleName size
event SimpleName MethodInvocation MethodInvocation InfixExpression NumberLiteral empty
get outputs SimpleName MethodInvocation MethodInvocation InfixExpression NumberLiteral empty
size SimpleName MethodInvocation InfixExpression NumberLiteral empty
event SimpleName MethodInvocation SimpleName get inputs
event SimpleName MethodInvocation MethodInvocation SimpleName iterator
get inputs SimpleName MethodInvocation MethodInvocation SimpleName iterator
event SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName next
get inputs SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName next
iterator SimpleName MethodInvocation MethodInvocation SimpleName next
iterator SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get table
next SimpleName MethodInvocation MethodInvocation SimpleName get table
old table SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName next
old table SimpleName VariableDeclarationFragment MethodInvocation SimpleName get table
table SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName old table
list SimpleName SimpleType ParameterizedType SimpleType SimpleName field schema
old table SimpleName MethodInvocation SimpleName get all cols
old col list SimpleName VariableDeclarationFragment MethodInvocation SimpleName old table
old col list SimpleName VariableDeclarationFragment MethodInvocation SimpleName get all cols
event SimpleName MethodInvocation SimpleName get outputs
event SimpleName MethodInvocation MethodInvocation SimpleName iterator
get outputs SimpleName MethodInvocation MethodInvocation SimpleName iterator
event SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName next
get outputs SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName next
iterator SimpleName MethodInvocation MethodInvocation SimpleName next
iterator SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get table
next SimpleName MethodInvocation MethodInvocation SimpleName get table
output tbl SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName next
output tbl SimpleName VariableDeclarationFragment MethodInvocation SimpleName get table
table SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName output tbl
output tbl SimpleName MethodInvocation SimpleName get db name
output tbl SimpleName MethodInvocation SimpleName get table name
dgi bridgehive client QualifiedName MethodInvocation SimpleName get table
dgi bridgehive client QualifiedName MethodInvocation MethodInvocation SimpleName output tbl
dgi bridgehive client QualifiedName MethodInvocation MethodInvocation SimpleName get db name
dgi bridgehive client QualifiedName MethodInvocation MethodInvocation SimpleName output tbl
dgi bridgehive client QualifiedName MethodInvocation MethodInvocation SimpleName get table name
get table SimpleName MethodInvocation MethodInvocation SimpleName output tbl
get table SimpleName MethodInvocation MethodInvocation SimpleName get db name
get table SimpleName MethodInvocation MethodInvocation SimpleName output tbl
get table SimpleName MethodInvocation MethodInvocation SimpleName get table name
output tbl SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName output tbl
output tbl SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get table name
get db name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName output tbl
get db name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get table name
output tbl SimpleName Assignment MethodInvocation QualifiedName dgi bridgehive client
output tbl SimpleName Assignment MethodInvocation SimpleName get table
output tbl SimpleName Assignment MethodInvocation MethodInvocation SimpleName output tbl
output tbl SimpleName Assignment MethodInvocation MethodInvocation SimpleName get db name
output tbl SimpleName Assignment MethodInvocation MethodInvocation SimpleName output tbl
output tbl SimpleName Assignment MethodInvocation MethodInvocation SimpleName get table name
list SimpleName SimpleType ParameterizedType SimpleType SimpleName field schema
output tbl SimpleName MethodInvocation SimpleName get all cols
new col list SimpleName VariableDeclarationFragment MethodInvocation SimpleName output tbl
new col list SimpleName VariableDeclarationFragment MethodInvocation SimpleName get all cols
old col list SimpleName MethodInvocation SimpleName size
new col list SimpleName MethodInvocation SimpleName size
old col list SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName new col list
old col list SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName size
size SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName new col list
size SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName size
pair SimpleName SimpleType ParameterizedType SimpleType SimpleName string
pair SimpleName SimpleType ParameterizedType SimpleType SimpleName string
string SimpleName SimpleType ParameterizedType SimpleType SimpleName string
find changed col names SimpleName MethodInvocation SimpleName old col list
find changed col names SimpleName MethodInvocation SimpleName new col list
old col list SimpleName MethodInvocation SimpleName new col list
changed col name pair SimpleName VariableDeclarationFragment MethodInvocation SimpleName find changed col names
changed col name pair SimpleName VariableDeclarationFragment MethodInvocation SimpleName old col list
changed col name pair SimpleName VariableDeclarationFragment MethodInvocation SimpleName new col list
changed col name pair SimpleName MethodInvocation SimpleName get left
old col name SimpleName VariableDeclarationFragment MethodInvocation SimpleName changed col name pair
old col name SimpleName VariableDeclarationFragment MethodInvocation SimpleName get left
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName old col name
changed col name pair SimpleName MethodInvocation SimpleName get right
new col name SimpleName VariableDeclarationFragment MethodInvocation SimpleName changed col name pair
new col name SimpleName VariableDeclarationFragment MethodInvocation SimpleName get right
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName new col name
write entity SimpleName SimpleType SingleVariableDeclaration SimpleName write entity
event SimpleName MethodInvocation SimpleName get outputs
write entity SimpleName MethodInvocation SimpleName get type
write entity SimpleName MethodInvocation InfixExpression QualifiedName typetable
get type SimpleName MethodInvocation InfixExpression QualifiedName typetable
write entity SimpleName MethodInvocation SimpleName get table
new table SimpleName VariableDeclarationFragment MethodInvocation SimpleName write entity
new table SimpleName VariableDeclarationFragment MethodInvocation SimpleName get table
table SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName new table
create or update entities SimpleName MethodInvocation SimpleName dgi bridge
create or update entities SimpleName MethodInvocation SimpleName event
create or update entities SimpleName MethodInvocation SimpleName write entity
create or update entities SimpleName MethodInvocation BooleanLiteral true
create or update entities SimpleName MethodInvocation SimpleName old table
dgi bridge SimpleName MethodInvocation SimpleName event
dgi bridge SimpleName MethodInvocation SimpleName write entity
dgi bridge SimpleName MethodInvocation BooleanLiteral true
dgi bridge SimpleName MethodInvocation SimpleName old table
event SimpleName MethodInvocation SimpleName write entity
event SimpleName MethodInvocation BooleanLiteral true
event SimpleName MethodInvocation SimpleName old table
write entity SimpleName MethodInvocation BooleanLiteral true
write entity SimpleName MethodInvocation SimpleName old table
true BooleanLiteral MethodInvocation SimpleName old table
dgi bridge SimpleName MethodInvocation SimpleName get cluster name
hive meta store bridge SimpleName MethodInvocation SimpleName get table qualified name
hive meta store bridge SimpleName MethodInvocation MethodInvocation SimpleName dgi bridge
hive meta store bridge SimpleName MethodInvocation MethodInvocation SimpleName get cluster name
hive meta store bridge SimpleName MethodInvocation SimpleName new table
get table qualified name SimpleName MethodInvocation MethodInvocation SimpleName dgi bridge
get table qualified name SimpleName MethodInvocation MethodInvocation SimpleName get cluster name
get table qualified name SimpleName MethodInvocation SimpleName new table
dgi bridge SimpleName MethodInvocation MethodInvocation SimpleName new table
get cluster name SimpleName MethodInvocation MethodInvocation SimpleName new table
new qualified table name SimpleName VariableDeclarationFragment MethodInvocation SimpleName hive meta store bridge
new qualified table name SimpleName VariableDeclarationFragment MethodInvocation SimpleName get table qualified name
new qualified table name SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName dgi bridge
new qualified table name SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get cluster name
new qualified table name SimpleName VariableDeclarationFragment MethodInvocation SimpleName new table
final Modifier VariableDeclarationStatement SimpleType SimpleName string
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName new qualified table name
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName hive meta store bridge
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get table qualified name
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName new table
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName new qualified table name
hive meta store bridge SimpleName MethodInvocation SimpleName get column qualified name
hive meta store bridge SimpleName MethodInvocation SimpleName new qualified table name
hive meta store bridge SimpleName MethodInvocation SimpleName old col name
get column qualified name SimpleName MethodInvocation SimpleName new qualified table name
get column qualified name SimpleName MethodInvocation SimpleName old col name
new qualified table name SimpleName MethodInvocation SimpleName old col name
old column qf name SimpleName VariableDeclarationFragment MethodInvocation SimpleName hive meta store bridge
old column qf name SimpleName VariableDeclarationFragment MethodInvocation SimpleName get column qualified name
old column qf name SimpleName VariableDeclarationFragment MethodInvocation SimpleName new qualified table name
old column qf name SimpleName VariableDeclarationFragment MethodInvocation SimpleName old col name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName old column qf name
hive meta store bridge SimpleName MethodInvocation SimpleName get column qualified name
hive meta store bridge SimpleName MethodInvocation SimpleName new qualified table name
hive meta store bridge SimpleName MethodInvocation SimpleName new col name
get column qualified name SimpleName MethodInvocation SimpleName new qualified table name
get column qualified name SimpleName MethodInvocation SimpleName new col name
new qualified table name SimpleName MethodInvocation SimpleName new col name
new column qf name SimpleName VariableDeclarationFragment MethodInvocation SimpleName hive meta store bridge
new column qf name SimpleName VariableDeclarationFragment MethodInvocation SimpleName get column qualified name
new column qf name SimpleName VariableDeclarationFragment MethodInvocation SimpleName new qualified table name
new column qf name SimpleName VariableDeclarationFragment MethodInvocation SimpleName new col name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName new column qf name
hive data typeshive column QualifiedName MethodInvocation SimpleName get name
referenceable SimpleName SimpleType ClassInstanceCreation MethodInvocation QualifiedName hive data typeshive column
referenceable SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get name
new col entity SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName referenceable
new col entity SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation QualifiedName hive data typeshive column
new col entity SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName get name
referenceable SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName new col entity
new col entity SimpleName MethodInvocation SimpleName set
new col entity SimpleName MethodInvocation QualifiedName atlas clientreferenceable attribute name
new col entity SimpleName MethodInvocation SimpleName new column qf name
set SimpleName MethodInvocation QualifiedName atlas clientreferenceable attribute name
set SimpleName MethodInvocation SimpleName new column qf name
atlas clientreferenceable attribute name QualifiedName MethodInvocation SimpleName new column qf name
event SimpleName MethodInvocation SimpleName get user
hive data typeshive column QualifiedName MethodInvocation SimpleName get name
hook notificationentity partial update request QualifiedName SimpleType ClassInstanceCreation MethodInvocation SimpleName event
hook notificationentity partial update request QualifiedName SimpleType ClassInstanceCreation MethodInvocation SimpleName get user
hook notificationentity partial update request QualifiedName SimpleType ClassInstanceCreation MethodInvocation QualifiedName hive data typeshive column
hook notificationentity partial update request QualifiedName SimpleType ClassInstanceCreation MethodInvocation SimpleName get name
hook notificationentity partial update request QualifiedName SimpleType ClassInstanceCreation QualifiedName atlas clientreferenceable attribute name
hook notificationentity partial update request QualifiedName SimpleType ClassInstanceCreation SimpleName old column qf name
hook notificationentity partial update request QualifiedName SimpleType ClassInstanceCreation SimpleName new col entity
event SimpleName MethodInvocation ClassInstanceCreation MethodInvocation QualifiedName hive data typeshive column
event SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get name
get user SimpleName MethodInvocation ClassInstanceCreation MethodInvocation QualifiedName hive data typeshive column
get user SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get name
event SimpleName MethodInvocation ClassInstanceCreation QualifiedName atlas clientreferenceable attribute name
get user SimpleName MethodInvocation ClassInstanceCreation QualifiedName atlas clientreferenceable attribute name
event SimpleName MethodInvocation ClassInstanceCreation SimpleName old column qf name
get user SimpleName MethodInvocation ClassInstanceCreation SimpleName old column qf name
event SimpleName MethodInvocation ClassInstanceCreation SimpleName new col entity
get user SimpleName MethodInvocation ClassInstanceCreation SimpleName new col entity
hive data typeshive column QualifiedName MethodInvocation ClassInstanceCreation QualifiedName atlas clientreferenceable attribute name
get name SimpleName MethodInvocation ClassInstanceCreation QualifiedName atlas clientreferenceable attribute name
hive data typeshive column QualifiedName MethodInvocation ClassInstanceCreation SimpleName old column qf name
get name SimpleName MethodInvocation ClassInstanceCreation SimpleName old column qf name
hive data typeshive column QualifiedName MethodInvocation ClassInstanceCreation SimpleName new col entity
get name SimpleName MethodInvocation ClassInstanceCreation SimpleName new col entity
atlas clientreferenceable attribute name QualifiedName ClassInstanceCreation SimpleName old column qf name
atlas clientreferenceable attribute name QualifiedName ClassInstanceCreation SimpleName new col entity
old column qf name SimpleName ClassInstanceCreation SimpleName new col entity
event SimpleName MethodInvocation SimpleName add message
event SimpleName MethodInvocation ClassInstanceCreation SimpleType QualifiedName hook notificationentity partial update request
event SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName event
event SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get user
event SimpleName MethodInvocation ClassInstanceCreation MethodInvocation QualifiedName hive data typeshive column
event SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get name
event SimpleName MethodInvocation ClassInstanceCreation QualifiedName atlas clientreferenceable attribute name
event SimpleName MethodInvocation ClassInstanceCreation SimpleName old column qf name
event SimpleName MethodInvocation ClassInstanceCreation SimpleName new col entity
add message SimpleName MethodInvocation ClassInstanceCreation SimpleType QualifiedName hook notificationentity partial update request
add message SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName event
add message SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get user
add message SimpleName MethodInvocation ClassInstanceCreation MethodInvocation QualifiedName hive data typeshive column
add message SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get name
add message SimpleName MethodInvocation ClassInstanceCreation QualifiedName atlas clientreferenceable attribute name
add message SimpleName MethodInvocation ClassInstanceCreation SimpleName old column qf name
add message SimpleName MethodInvocation ClassInstanceCreation SimpleName new col entity
write entity SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName event
write entity SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName get outputs
handle event outputs SimpleName MethodInvocation SimpleName dgi bridge
handle event outputs SimpleName MethodInvocation SimpleName event
handle event outputs SimpleName MethodInvocation QualifiedName typetable
dgi bridge SimpleName MethodInvocation SimpleName event
dgi bridge SimpleName MethodInvocation QualifiedName typetable
event SimpleName MethodInvocation QualifiedName typetable
exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
atlas hook exception SimpleName SimpleType ClassInstanceCreation StringLiteral hive hookrename column failed
atlas hook exception SimpleName SimpleType ClassInstanceCreation SimpleName e
hive hookrename column failed StringLiteral ClassInstanceCreation SimpleName e
private Modifier MethodDeclaration PrimitiveType void
private Modifier MethodDeclaration SimpleName rename column
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName hive meta store bridge
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName dgi bridge
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName hive event context
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName event
private Modifier MethodDeclaration SimpleType SimpleName atlas hook exception
void PrimitiveType MethodDeclaration SimpleName rename column
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName hive meta store bridge
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName dgi bridge
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName hive event context
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName event
void PrimitiveType MethodDeclaration SimpleType SimpleName atlas hook exception
rename column SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName hive meta store bridge
rename column SimpleName MethodDeclaration SingleVariableDeclaration SimpleName dgi bridge
rename column SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName hive event context
rename column SimpleName MethodDeclaration SingleVariableDeclaration SimpleName event
rename column SimpleName MethodDeclaration SimpleType SimpleName atlas hook exception
dgi bridge SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName event
dgi bridge SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName atlas hook exception
event SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName atlas hook exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName rename column
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName dgi bridge
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName event
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName atlas hook exception
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName rename column
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName dgi bridge
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName event
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName atlas hook exception
