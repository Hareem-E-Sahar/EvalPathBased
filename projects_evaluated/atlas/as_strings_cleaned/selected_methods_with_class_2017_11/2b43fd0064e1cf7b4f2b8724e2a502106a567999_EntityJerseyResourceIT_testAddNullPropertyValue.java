enabled SimpleName MemberValuePair BooleanLiteral false
test SimpleName NormalAnnotation MemberValuePair SimpleName enabled
test SimpleName NormalAnnotation MemberValuePair BooleanLiteral false
db StringLiteral InfixExpression MethodInvocation SimpleName random string
db name SimpleName VariableDeclarationFragment InfixExpression StringLiteral db
db name SimpleName VariableDeclarationFragment InfixExpression MethodInvocation SimpleName random string
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName db name
table StringLiteral InfixExpression MethodInvocation SimpleName random string
table name SimpleName VariableDeclarationFragment InfixExpression StringLiteral table
table name SimpleName VariableDeclarationFragment InfixExpression MethodInvocation SimpleName random string
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table name
create hive db instance built in SimpleName MethodInvocation SimpleName db name
hive db instance SimpleName VariableDeclarationFragment MethodInvocation SimpleName create hive db instance built in
hive db instance SimpleName VariableDeclarationFragment MethodInvocation SimpleName db name
referenceable SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName hive db instance
create instance SimpleName MethodInvocation SimpleName hive db instance
db id SimpleName VariableDeclarationFragment MethodInvocation SimpleName create instance
db id SimpleName VariableDeclarationFragment MethodInvocation SimpleName hive db instance
id SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName db id
create hive table instance built in SimpleName MethodInvocation SimpleName db name
create hive table instance built in SimpleName MethodInvocation SimpleName table name
create hive table instance built in SimpleName MethodInvocation SimpleName db id
db name SimpleName MethodInvocation SimpleName table name
db name SimpleName MethodInvocation SimpleName db id
table name SimpleName MethodInvocation SimpleName db id
hive table instance SimpleName VariableDeclarationFragment MethodInvocation SimpleName create hive table instance built in
hive table instance SimpleName VariableDeclarationFragment MethodInvocation SimpleName db name
hive table instance SimpleName VariableDeclarationFragment MethodInvocation SimpleName table name
hive table instance SimpleName VariableDeclarationFragment MethodInvocation SimpleName db id
referenceable SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName hive table instance
create instance SimpleName MethodInvocation SimpleName hive table instance
id SimpleName VariableDeclarationFragment MethodInvocation SimpleName create instance
id SimpleName VariableDeclarationFragment MethodInvocation SimpleName hive table instance
id SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName id
id SimpleName MethodInvocation SimpleName get id
guid SimpleName VariableDeclarationFragment MethodInvocation SimpleName id
guid SimpleName VariableDeclarationFragment MethodInvocation SimpleName get id
final Modifier VariableDeclarationStatement SimpleType SimpleName string
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName guid
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName id
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get id
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName guid
uuid SimpleName MethodInvocation SimpleName from string
uuid SimpleName MethodInvocation SimpleName guid
from string SimpleName MethodInvocation SimpleName guid
assert SimpleName MethodInvocation SimpleName assert not null
assert SimpleName MethodInvocation MethodInvocation SimpleName uuid
assert SimpleName MethodInvocation MethodInvocation SimpleName from string
assert SimpleName MethodInvocation MethodInvocation SimpleName guid
assert not null SimpleName MethodInvocation MethodInvocation SimpleName uuid
assert not null SimpleName MethodInvocation MethodInvocation SimpleName from string
assert not null SimpleName MethodInvocation MethodInvocation SimpleName guid
illegal argument exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
response is not a guid StringLiteral InfixExpression SimpleName guid
assert SimpleName MethodInvocation SimpleName fail
assert SimpleName MethodInvocation InfixExpression StringLiteral response is not a guid
assert SimpleName MethodInvocation InfixExpression SimpleName guid
fail SimpleName MethodInvocation InfixExpression StringLiteral response is not a guid
fail SimpleName MethodInvocation InfixExpression SimpleName guid
add property SimpleName MethodInvocation SimpleName guid
add property SimpleName MethodInvocation StringLiteral description
guid SimpleName MethodInvocation StringLiteral description
assert SimpleName MethodInvocation SimpleName fail
assert SimpleName MethodInvocation StringLiteral expected atlas service exception
fail SimpleName MethodInvocation StringLiteral expected atlas service exception
atlas service exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
e SimpleName MethodInvocation SimpleName get status
e SimpleName MethodInvocation MethodInvocation SimpleName get status code
get status SimpleName MethodInvocation MethodInvocation SimpleName get status code
responsestatusbad request QualifiedName MethodInvocation SimpleName get status code
assert SimpleName MethodInvocation SimpleName assert equals
assert SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName e
assert SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get status
assert SimpleName MethodInvocation MethodInvocation SimpleName get status code
assert SimpleName MethodInvocation MethodInvocation QualifiedName responsestatusbad request
assert SimpleName MethodInvocation MethodInvocation SimpleName get status code
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName e
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get status
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get status code
assert equals SimpleName MethodInvocation MethodInvocation QualifiedName responsestatusbad request
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get status code
get status code SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName responsestatusbad request
get status code SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get status code
test SimpleName NormalAnnotation MethodDeclaration Modifier public
enabled SimpleName MemberValuePair NormalAnnotation MethodDeclaration Modifier public
false BooleanLiteral MemberValuePair NormalAnnotation MethodDeclaration Modifier public
test SimpleName NormalAnnotation MethodDeclaration PrimitiveType void
enabled SimpleName MemberValuePair NormalAnnotation MethodDeclaration PrimitiveType void
false BooleanLiteral MemberValuePair NormalAnnotation MethodDeclaration PrimitiveType void
test SimpleName NormalAnnotation MethodDeclaration SimpleName test add null property value
enabled SimpleName MemberValuePair NormalAnnotation MethodDeclaration SimpleName test add null property value
false BooleanLiteral MemberValuePair NormalAnnotation MethodDeclaration SimpleName test add null property value
test SimpleName NormalAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test add null property value
public Modifier MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration Block VariableDeclarationStatement Modifier final
void PrimitiveType MethodDeclaration SimpleName test add null property value
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement Modifier final
test add null property value SimpleName MethodDeclaration SimpleType SimpleName exception
test add null property value SimpleName MethodDeclaration Block VariableDeclarationStatement Modifier final
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration NormalAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test add null property value
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration NormalAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test add null property value
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
