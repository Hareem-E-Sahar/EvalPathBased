depends on methods SimpleName MemberValuePair StringLiteral test submit
test SimpleName NormalAnnotation MemberValuePair SimpleName depends on methods
test SimpleName NormalAnnotation MemberValuePair StringLiteral test submit
hierarchical type definition SimpleName SimpleType SingleVariableDeclaration SimpleName type definition
type name = StringLiteral InfixExpression QualifiedName type definitiontype name
systemout QualifiedName MethodInvocation SimpleName println
systemout QualifiedName MethodInvocation InfixExpression StringLiteral type name =
systemout QualifiedName MethodInvocation InfixExpression QualifiedName type definitiontype name
println SimpleName MethodInvocation InfixExpression StringLiteral type name =
println SimpleName MethodInvocation InfixExpression QualifiedName type definitiontype name
service SimpleName MethodInvocation SimpleName path
service SimpleName MethodInvocation StringLiteral apiatlastypes
path SimpleName MethodInvocation StringLiteral apiatlastypes
service SimpleName MethodInvocation MethodInvocation SimpleName path
path SimpleName MethodInvocation MethodInvocation SimpleName path
apiatlastypes StringLiteral MethodInvocation MethodInvocation SimpleName path
service SimpleName MethodInvocation MethodInvocation QualifiedName type definitiontype name
path SimpleName MethodInvocation MethodInvocation QualifiedName type definitiontype name
apiatlastypes StringLiteral MethodInvocation MethodInvocation QualifiedName type definitiontype name
path SimpleName MethodInvocation QualifiedName type definitiontype name
resource SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName service
resource SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName path
resource SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation StringLiteral apiatlastypes
resource SimpleName VariableDeclarationFragment MethodInvocation SimpleName path
resource SimpleName VariableDeclarationFragment MethodInvocation QualifiedName type definitiontype name
web resource SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName resource
resource SimpleName MethodInvocation SimpleName accept
resource SimpleName MethodInvocation QualifiedName servletsjson media type
accept SimpleName MethodInvocation QualifiedName servletsjson media type
resource SimpleName MethodInvocation MethodInvocation SimpleName type
accept SimpleName MethodInvocation MethodInvocation SimpleName type
servletsjson media type QualifiedName MethodInvocation MethodInvocation SimpleName type
resource SimpleName MethodInvocation MethodInvocation QualifiedName servletsjson media type
accept SimpleName MethodInvocation MethodInvocation QualifiedName servletsjson media type
servletsjson media type QualifiedName MethodInvocation MethodInvocation QualifiedName servletsjson media type
type SimpleName MethodInvocation QualifiedName servletsjson media type
resource SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName method
accept SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName method
servletsjson media type QualifiedName MethodInvocation MethodInvocation MethodInvocation SimpleName method
type SimpleName MethodInvocation MethodInvocation SimpleName method
servletsjson media type QualifiedName MethodInvocation MethodInvocation SimpleName method
resource SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName http methodget
accept SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName http methodget
servletsjson media type QualifiedName MethodInvocation MethodInvocation MethodInvocation QualifiedName http methodget
type SimpleName MethodInvocation MethodInvocation QualifiedName http methodget
servletsjson media type QualifiedName MethodInvocation MethodInvocation QualifiedName http methodget
method SimpleName MethodInvocation QualifiedName http methodget
method SimpleName MethodInvocation TypeLiteral SimpleType SimpleName client response
http methodget QualifiedName MethodInvocation TypeLiteral SimpleType SimpleName client response
client response SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName type
client response SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation QualifiedName servletsjson media type
client response SimpleName VariableDeclarationFragment MethodInvocation SimpleName method
client response SimpleName VariableDeclarationFragment MethodInvocation QualifiedName http methodget
client response SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName client response
client response SimpleName MethodInvocation SimpleName get status
responsestatusok QualifiedName MethodInvocation SimpleName get status code
assert equals SimpleName MethodInvocation MethodInvocation SimpleName client response
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get status
assert equals SimpleName MethodInvocation MethodInvocation QualifiedName responsestatusok
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get status code
client response SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName responsestatusok
client response SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get status code
get status SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName responsestatusok
get status SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get status code
client response SimpleName MethodInvocation SimpleName get entity
client response SimpleName MethodInvocation TypeLiteral SimpleType SimpleName string
get entity SimpleName MethodInvocation TypeLiteral SimpleType SimpleName string
response as string SimpleName VariableDeclarationFragment MethodInvocation SimpleName client response
response as string SimpleName VariableDeclarationFragment MethodInvocation SimpleName get entity
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName response as string
assert SimpleName MethodInvocation SimpleName assert not null
assert SimpleName MethodInvocation SimpleName response as string
assert not null SimpleName MethodInvocation SimpleName response as string
json object SimpleName SimpleType ClassInstanceCreation SimpleName response as string
response SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName json object
response SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName response as string
json object SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName response
response SimpleName MethodInvocation SimpleName get
response SimpleName MethodInvocation QualifiedName atlas clientdefinition
get SimpleName MethodInvocation QualifiedName atlas clientdefinition
assert SimpleName MethodInvocation SimpleName assert not null
assert SimpleName MethodInvocation MethodInvocation SimpleName response
assert SimpleName MethodInvocation MethodInvocation SimpleName get
assert SimpleName MethodInvocation MethodInvocation QualifiedName atlas clientdefinition
assert not null SimpleName MethodInvocation MethodInvocation SimpleName response
assert not null SimpleName MethodInvocation MethodInvocation SimpleName get
assert not null SimpleName MethodInvocation MethodInvocation QualifiedName atlas clientdefinition
response SimpleName MethodInvocation SimpleName get
response SimpleName MethodInvocation QualifiedName atlas clientrequest id
get SimpleName MethodInvocation QualifiedName atlas clientrequest id
assert SimpleName MethodInvocation SimpleName assert not null
assert SimpleName MethodInvocation MethodInvocation SimpleName response
assert SimpleName MethodInvocation MethodInvocation SimpleName get
assert SimpleName MethodInvocation MethodInvocation QualifiedName atlas clientrequest id
assert not null SimpleName MethodInvocation MethodInvocation SimpleName response
assert not null SimpleName MethodInvocation MethodInvocation SimpleName get
assert not null SimpleName MethodInvocation MethodInvocation QualifiedName atlas clientrequest id
response SimpleName MethodInvocation SimpleName get string
response SimpleName MethodInvocation QualifiedName atlas clientdefinition
get string SimpleName MethodInvocation QualifiedName atlas clientdefinition
types json SimpleName VariableDeclarationFragment MethodInvocation SimpleName response
types json SimpleName VariableDeclarationFragment MethodInvocation SimpleName get string
types json SimpleName VariableDeclarationFragment MethodInvocation QualifiedName atlas clientdefinition
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName types json
types serialization SimpleName MethodInvocation SimpleName from json
types serialization SimpleName MethodInvocation SimpleName types json
from json SimpleName MethodInvocation SimpleName types json
types def SimpleName VariableDeclarationFragment MethodInvocation SimpleName types serialization
types def SimpleName VariableDeclarationFragment MethodInvocation SimpleName from json
types def SimpleName VariableDeclarationFragment MethodInvocation SimpleName types json
final Modifier VariableDeclarationStatement SimpleType SimpleName types def
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName types def
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName types serialization
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName from json
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName types json
types def SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName types def
hierarchical type definition SimpleName SimpleType ParameterizedType SimpleType SimpleName class type
types def SimpleName MethodInvocation SimpleName class types as java list
hierarchical type definitions SimpleName VariableDeclarationFragment MethodInvocation SimpleName types def
hierarchical type definitions SimpleName VariableDeclarationFragment MethodInvocation SimpleName class types as java list
hierarchical type definition SimpleName SimpleType ParameterizedType SimpleType SimpleName class type
hierarchical type definition SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName class type
class type SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName class type
attribute definition SimpleName SimpleType SingleVariableDeclaration SimpleName attr def
name StringLiteral MethodInvocation SimpleName equals
name StringLiteral MethodInvocation QualifiedName attr defname
equals SimpleName MethodInvocation QualifiedName attr defname
assert equals SimpleName MethodInvocation QualifiedName attr defis indexable
assert equals SimpleName MethodInvocation BooleanLiteral true
attr defis indexable QualifiedName MethodInvocation BooleanLiteral true
assert equals SimpleName MethodInvocation QualifiedName attr defis unique
assert equals SimpleName MethodInvocation BooleanLiteral true
attr defis unique QualifiedName MethodInvocation BooleanLiteral true
attribute definition SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement QualifiedName class typeattribute definitions
attr def SimpleName SingleVariableDeclaration EnhancedForStatement QualifiedName class typeattribute definitions
class type SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName hierarchical type definitions
hierarchical type definitions SimpleName EnhancedForStatement Block EnhancedForStatement QualifiedName class typeattribute definitions
final Modifier VariableDeclarationStatement Block EnhancedForStatement SimpleName hierarchical type definitions
hierarchical type definition SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName type definitions
type definition SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName type definitions
type definitions SimpleName EnhancedForStatement Block VariableDeclarationStatement Modifier final
type definitions SimpleName EnhancedForStatement Block EnhancedForStatement SimpleName hierarchical type definitions
test SimpleName NormalAnnotation MethodDeclaration Modifier public
depends on methods SimpleName MemberValuePair NormalAnnotation MethodDeclaration Modifier public
test submit StringLiteral MemberValuePair NormalAnnotation MethodDeclaration Modifier public
test SimpleName NormalAnnotation MethodDeclaration PrimitiveType void
depends on methods SimpleName MemberValuePair NormalAnnotation MethodDeclaration PrimitiveType void
test submit StringLiteral MemberValuePair NormalAnnotation MethodDeclaration PrimitiveType void
test SimpleName NormalAnnotation MethodDeclaration SimpleName test get definition
depends on methods SimpleName MemberValuePair NormalAnnotation MethodDeclaration SimpleName test get definition
test submit StringLiteral MemberValuePair NormalAnnotation MethodDeclaration SimpleName test get definition
test SimpleName NormalAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test get definition
public Modifier MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration Block EnhancedForStatement SimpleName type definitions
void PrimitiveType MethodDeclaration SimpleName test get definition
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration Block EnhancedForStatement SimpleName type definitions
test get definition SimpleName MethodDeclaration SimpleType SimpleName exception
test get definition SimpleName MethodDeclaration Block EnhancedForStatement SimpleName type definitions
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration NormalAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test get definition
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration NormalAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test get definition
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
