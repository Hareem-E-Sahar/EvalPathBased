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
pii trait StringLiteral InfixExpression MethodInvocation SimpleName random string
trait name SimpleName VariableDeclarationFragment InfixExpression StringLiteral pii trait
trait name SimpleName VariableDeclarationFragment InfixExpression MethodInvocation SimpleName random string
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName trait name
collections SimpleName MethodInvocation SimpleType SimpleName string
collections SimpleName MethodInvocation SimpleName empty set
string SimpleName SimpleType MethodInvocation SimpleName empty set
types util SimpleName MethodInvocation SimpleName create trait type def
types util SimpleName MethodInvocation SimpleName trait name
types util SimpleName MethodInvocation MethodInvocation SimpleName collections
types util SimpleName MethodInvocation MethodInvocation SimpleType SimpleName string
types util SimpleName MethodInvocation MethodInvocation SimpleName empty set
create trait type def SimpleName MethodInvocation SimpleName trait name
create trait type def SimpleName MethodInvocation MethodInvocation SimpleName collections
create trait type def SimpleName MethodInvocation MethodInvocation SimpleType SimpleName string
create trait type def SimpleName MethodInvocation MethodInvocation SimpleName empty set
trait name SimpleName MethodInvocation MethodInvocation SimpleName collections
trait name SimpleName MethodInvocation MethodInvocation SimpleType SimpleName string
trait name SimpleName MethodInvocation MethodInvocation SimpleName empty set
pii trait SimpleName VariableDeclarationFragment MethodInvocation SimpleName types util
pii trait SimpleName VariableDeclarationFragment MethodInvocation SimpleName create trait type def
pii trait SimpleName VariableDeclarationFragment MethodInvocation SimpleName trait name
pii trait SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName collections
pii trait SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName empty set
trait type definition SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName pii trait
atlas type SimpleName MethodInvocation SimpleName to v json
atlas type SimpleName MethodInvocation SimpleName pii trait
to v json SimpleName MethodInvocation SimpleName pii trait
trait definition as json SimpleName VariableDeclarationFragment MethodInvocation SimpleName atlas type
trait definition as json SimpleName VariableDeclarationFragment MethodInvocation SimpleName to v json
trait definition as json SimpleName VariableDeclarationFragment MethodInvocation SimpleName pii trait
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName trait definition as json
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral trait definition as json = {}
log SimpleName MethodInvocation SimpleName trait definition as json
debug SimpleName MethodInvocation StringLiteral trait definition as json = {}
debug SimpleName MethodInvocation SimpleName trait definition as json
trait definition as json = {} StringLiteral MethodInvocation SimpleName trait definition as json
collections SimpleName MethodInvocation SimpleName empty list
collections SimpleName MethodInvocation SimpleName empty list
collections SimpleName MethodInvocation SimpleName singleton list
collections SimpleName MethodInvocation SimpleName pii trait
singleton list SimpleName MethodInvocation SimpleName pii trait
collections SimpleName MethodInvocation SimpleName empty list
types def SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName collections
types def SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName empty list
types def SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName collections
types def SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName empty list
types def SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName collections
types def SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName singleton list
types def SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName pii trait
types def SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName collections
types def SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName empty list
collections SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName collections
collections SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName empty list
empty list SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName collections
empty list SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName empty list
collections SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName collections
collections SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName singleton list
collections SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName pii trait
empty list SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName collections
empty list SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName singleton list
empty list SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName pii trait
collections SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName collections
collections SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName empty list
empty list SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName collections
empty list SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName empty list
collections SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName collections
collections SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName singleton list
collections SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName pii trait
empty list SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName collections
empty list SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName singleton list
empty list SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName pii trait
collections SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName collections
collections SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName empty list
empty list SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName collections
empty list SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName empty list
collections SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName collections
collections SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName empty list
singleton list SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName collections
singleton list SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName empty list
pii trait SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName collections
pii trait SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName empty list
types def SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName types def
types def SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName collections
types def SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName empty list
types def SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName collections
types def SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName empty list
types def SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName collections
types def SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName singleton list
types def SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName pii trait
types def SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName collections
types def SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName empty list
types def SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName types def
create type SimpleName MethodInvocation SimpleName types def
struct SimpleName SimpleType ClassInstanceCreation SimpleName trait name
trait instance SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName struct
trait instance SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName trait name
struct SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName trait instance
atlas client v SimpleName MethodInvocation SimpleName add trait
atlas client v SimpleName MethodInvocation SimpleName guid
atlas client v SimpleName MethodInvocation SimpleName trait instance
add trait SimpleName MethodInvocation SimpleName guid
add trait SimpleName MethodInvocation SimpleName trait instance
guid SimpleName MethodInvocation SimpleName trait instance
assert entity audit SimpleName MethodInvocation SimpleName guid
assert entity audit SimpleName MethodInvocation QualifiedName entity audit evententity audit actiontag add
guid SimpleName MethodInvocation QualifiedName entity audit evententity audit actiontag add
atlas client v SimpleName MethodInvocation SimpleName delete trait
atlas client v SimpleName MethodInvocation SimpleName guid
atlas client v SimpleName MethodInvocation SimpleName trait name
delete trait SimpleName MethodInvocation SimpleName guid
delete trait SimpleName MethodInvocation SimpleName trait name
guid SimpleName MethodInvocation SimpleName trait name
atlas client v SimpleName MethodInvocation SimpleName get trait definition
atlas client v SimpleName MethodInvocation SimpleName guid
atlas client v SimpleName MethodInvocation SimpleName trait name
get trait definition SimpleName MethodInvocation SimpleName guid
get trait definition SimpleName MethodInvocation SimpleName trait name
guid SimpleName MethodInvocation SimpleName trait name
fail SimpleName MethodInvocation StringLiteral deleted trait definition shouldnt exist
atlas service exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
e SimpleName MethodInvocation SimpleName get status
assert equals SimpleName MethodInvocation MethodInvocation SimpleName e
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get status
assert equals SimpleName MethodInvocation QualifiedName client responsestatusnot found
e SimpleName MethodInvocation MethodInvocation QualifiedName client responsestatusnot found
get status SimpleName MethodInvocation MethodInvocation QualifiedName client responsestatusnot found
assert entity audit SimpleName MethodInvocation SimpleName guid
assert entity audit SimpleName MethodInvocation QualifiedName entity audit evententity audit actiontag delete
guid SimpleName MethodInvocation QualifiedName entity audit evententity audit actiontag delete
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test delete trait
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test delete trait
public Modifier MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration Block VariableDeclarationStatement Modifier final
void PrimitiveType MethodDeclaration SimpleName test delete trait
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement Modifier final
test delete trait SimpleName MethodDeclaration SimpleType SimpleName exception
test delete trait SimpleName MethodDeclaration Block VariableDeclarationStatement Modifier final
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test delete trait
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test delete trait
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
