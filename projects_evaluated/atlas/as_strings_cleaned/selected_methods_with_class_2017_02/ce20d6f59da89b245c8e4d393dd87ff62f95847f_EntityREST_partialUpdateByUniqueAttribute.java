consumes SimpleName SingleMemberAnnotation QualifiedName servletsjson media type
produces SimpleName SingleMemberAnnotation QualifiedName servletsjson media type
path SimpleName SingleMemberAnnotation StringLiteral unique attributetypetype name
path param SimpleName SingleMemberAnnotation StringLiteral type name
path param SimpleName SingleMemberAnnotation SingleVariableDeclaration SimpleType SimpleName string
type name StringLiteral SingleMemberAnnotation SingleVariableDeclaration SimpleType SimpleName string
path param SimpleName SingleMemberAnnotation SingleVariableDeclaration SimpleName type name
type name StringLiteral SingleMemberAnnotation SingleVariableDeclaration SimpleName type name
string SimpleName SimpleType SingleVariableDeclaration SimpleName type name
context SimpleName MarkerAnnotation SingleVariableDeclaration SimpleType SimpleName http servlet request
context SimpleName MarkerAnnotation SingleVariableDeclaration SimpleName servlet request
http servlet request SimpleName SimpleType SingleVariableDeclaration SimpleName servlet request
atlas entity SimpleName SimpleType SingleVariableDeclaration SimpleName entity
ensure entity type SimpleName MethodInvocation SimpleName type name
entity type SimpleName VariableDeclarationFragment MethodInvocation SimpleName ensure entity type
entity type SimpleName VariableDeclarationFragment MethodInvocation SimpleName type name
atlas entity type SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName entity type
map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
map SimpleName SimpleType ParameterizedType SimpleType SimpleName object
string SimpleName SimpleType ParameterizedType SimpleType SimpleName object
get attributes SimpleName MethodInvocation SimpleName servlet request
attributes SimpleName VariableDeclarationFragment MethodInvocation SimpleName get attributes
attributes SimpleName VariableDeclarationFragment MethodInvocation SimpleName servlet request
validate unique attribute SimpleName MethodInvocation SimpleName entity type
validate unique attribute SimpleName MethodInvocation SimpleName attributes
entity type SimpleName MethodInvocation SimpleName attributes
attributes SimpleName MethodInvocation SimpleName key set
string SimpleName SimpleType ArrayType ArrayCreation NumberLiteral empty
attributes SimpleName MethodInvocation MethodInvocation SimpleName to array
key set SimpleName MethodInvocation MethodInvocation SimpleName to array
attributes SimpleName MethodInvocation MethodInvocation ArrayCreation NumberLiteral empty
key set SimpleName MethodInvocation MethodInvocation ArrayCreation NumberLiteral empty
to array SimpleName MethodInvocation ArrayCreation NumberLiteral empty
attributes SimpleName MethodInvocation MethodInvocation ArrayAccess NumberLiteral empty
key set SimpleName MethodInvocation MethodInvocation ArrayAccess NumberLiteral empty
to array SimpleName MethodInvocation ArrayAccess NumberLiteral empty
empty NumberLiteral ArrayCreation MethodInvocation ArrayAccess NumberLiteral empty
attribute SimpleName VariableDeclarationFragment ArrayAccess MethodInvocation SimpleName to array
attribute SimpleName VariableDeclarationFragment ArrayAccess NumberLiteral empty
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName attribute
attributes SimpleName MethodInvocation SimpleName get
attributes SimpleName MethodInvocation SimpleName attribute
get SimpleName MethodInvocation SimpleName attribute
string SimpleName SimpleType CastExpression MethodInvocation SimpleName attributes
string SimpleName SimpleType CastExpression MethodInvocation SimpleName get
string SimpleName SimpleType CastExpression MethodInvocation SimpleName attribute
value SimpleName VariableDeclarationFragment CastExpression SimpleType SimpleName string
value SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName attributes
value SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName get
value SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName attribute
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName value
ctx SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType QualifiedName atlas format converterconverter context
atlas format converterconverter context QualifiedName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName ctx
ctx SimpleName MethodInvocation SimpleName add entity
ctx SimpleName MethodInvocation SimpleName entity
add entity SimpleName MethodInvocation SimpleName entity
rest adapters SimpleName MethodInvocation SimpleName get referenceable
rest adapters SimpleName MethodInvocation SimpleName entity
rest adapters SimpleName MethodInvocation SimpleName ctx
get referenceable SimpleName MethodInvocation SimpleName entity
get referenceable SimpleName MethodInvocation SimpleName ctx
entity SimpleName MethodInvocation SimpleName ctx
ref SimpleName VariableDeclarationFragment MethodInvocation SimpleName rest adapters
ref SimpleName VariableDeclarationFragment MethodInvocation SimpleName get referenceable
ref SimpleName VariableDeclarationFragment MethodInvocation SimpleName entity
ref SimpleName VariableDeclarationFragment MethodInvocation SimpleName ctx
referenceable SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName ref
metadata service SimpleName MethodInvocation SimpleName update entity by unique attribute
metadata service SimpleName MethodInvocation SimpleName type name
metadata service SimpleName MethodInvocation SimpleName attribute
metadata service SimpleName MethodInvocation SimpleName value
metadata service SimpleName MethodInvocation SimpleName ref
update entity by unique attribute SimpleName MethodInvocation SimpleName type name
update entity by unique attribute SimpleName MethodInvocation SimpleName attribute
update entity by unique attribute SimpleName MethodInvocation SimpleName value
update entity by unique attribute SimpleName MethodInvocation SimpleName ref
type name SimpleName MethodInvocation SimpleName attribute
type name SimpleName MethodInvocation SimpleName value
type name SimpleName MethodInvocation SimpleName ref
attribute SimpleName MethodInvocation SimpleName value
attribute SimpleName MethodInvocation SimpleName ref
value SimpleName MethodInvocation SimpleName ref
result SimpleName VariableDeclarationFragment MethodInvocation SimpleName metadata service
result SimpleName VariableDeclarationFragment MethodInvocation SimpleName update entity by unique attribute
result SimpleName VariableDeclarationFragment MethodInvocation SimpleName type name
result SimpleName VariableDeclarationFragment MethodInvocation SimpleName attribute
result SimpleName VariableDeclarationFragment MethodInvocation SimpleName value
result SimpleName VariableDeclarationFragment MethodInvocation SimpleName ref
create update entities result SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName result
to entity mutation response SimpleName MethodInvocation SimpleName result
deprecated SimpleName MarkerAnnotation MethodDeclaration MarkerAnnotation SimpleName put
deprecated SimpleName MarkerAnnotation MethodDeclaration SingleMemberAnnotation SimpleName consumes
deprecated SimpleName MarkerAnnotation MethodDeclaration SingleMemberAnnotation QualifiedName servletsjson media type
deprecated SimpleName MarkerAnnotation MethodDeclaration SingleMemberAnnotation SimpleName produces
deprecated SimpleName MarkerAnnotation MethodDeclaration SingleMemberAnnotation QualifiedName servletsjson media type
deprecated SimpleName MarkerAnnotation MethodDeclaration SingleMemberAnnotation SimpleName path
deprecated SimpleName MarkerAnnotation MethodDeclaration SingleMemberAnnotation StringLiteral unique attributetypetype name
deprecated SimpleName MarkerAnnotation MethodDeclaration Modifier public
put SimpleName MarkerAnnotation MethodDeclaration SingleMemberAnnotation SimpleName consumes
put SimpleName MarkerAnnotation MethodDeclaration SingleMemberAnnotation QualifiedName servletsjson media type
put SimpleName MarkerAnnotation MethodDeclaration SingleMemberAnnotation SimpleName produces
put SimpleName MarkerAnnotation MethodDeclaration SingleMemberAnnotation QualifiedName servletsjson media type
put SimpleName MarkerAnnotation MethodDeclaration SingleMemberAnnotation SimpleName path
put SimpleName MarkerAnnotation MethodDeclaration SingleMemberAnnotation StringLiteral unique attributetypetype name
put SimpleName MarkerAnnotation MethodDeclaration Modifier public
put SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName entity mutation response
consumes SimpleName SingleMemberAnnotation MethodDeclaration SingleMemberAnnotation SimpleName produces
consumes SimpleName SingleMemberAnnotation MethodDeclaration SingleMemberAnnotation QualifiedName servletsjson media type
servletsjson media type QualifiedName SingleMemberAnnotation MethodDeclaration SingleMemberAnnotation SimpleName produces
servletsjson media type QualifiedName SingleMemberAnnotation MethodDeclaration SingleMemberAnnotation QualifiedName servletsjson media type
consumes SimpleName SingleMemberAnnotation MethodDeclaration SingleMemberAnnotation SimpleName path
consumes SimpleName SingleMemberAnnotation MethodDeclaration SingleMemberAnnotation StringLiteral unique attributetypetype name
servletsjson media type QualifiedName SingleMemberAnnotation MethodDeclaration SingleMemberAnnotation SimpleName path
servletsjson media type QualifiedName SingleMemberAnnotation MethodDeclaration SingleMemberAnnotation StringLiteral unique attributetypetype name
consumes SimpleName SingleMemberAnnotation MethodDeclaration Modifier public
servletsjson media type QualifiedName SingleMemberAnnotation MethodDeclaration Modifier public
consumes SimpleName SingleMemberAnnotation MethodDeclaration SimpleType SimpleName entity mutation response
servletsjson media type QualifiedName SingleMemberAnnotation MethodDeclaration SimpleType SimpleName entity mutation response
consumes SimpleName SingleMemberAnnotation MethodDeclaration SimpleName partial update by unique attribute
servletsjson media type QualifiedName SingleMemberAnnotation MethodDeclaration SimpleName partial update by unique attribute
produces SimpleName SingleMemberAnnotation MethodDeclaration SingleMemberAnnotation SimpleName path
produces SimpleName SingleMemberAnnotation MethodDeclaration SingleMemberAnnotation StringLiteral unique attributetypetype name
servletsjson media type QualifiedName SingleMemberAnnotation MethodDeclaration SingleMemberAnnotation SimpleName path
servletsjson media type QualifiedName SingleMemberAnnotation MethodDeclaration SingleMemberAnnotation StringLiteral unique attributetypetype name
produces SimpleName SingleMemberAnnotation MethodDeclaration Modifier public
servletsjson media type QualifiedName SingleMemberAnnotation MethodDeclaration Modifier public
produces SimpleName SingleMemberAnnotation MethodDeclaration SimpleType SimpleName entity mutation response
servletsjson media type QualifiedName SingleMemberAnnotation MethodDeclaration SimpleType SimpleName entity mutation response
produces SimpleName SingleMemberAnnotation MethodDeclaration SimpleName partial update by unique attribute
servletsjson media type QualifiedName SingleMemberAnnotation MethodDeclaration SimpleName partial update by unique attribute
produces SimpleName SingleMemberAnnotation MethodDeclaration SingleVariableDeclaration SimpleName type name
servletsjson media type QualifiedName SingleMemberAnnotation MethodDeclaration SingleVariableDeclaration SimpleName type name
path SimpleName SingleMemberAnnotation MethodDeclaration Modifier public
unique attributetypetype name StringLiteral SingleMemberAnnotation MethodDeclaration Modifier public
path SimpleName SingleMemberAnnotation MethodDeclaration SimpleType SimpleName entity mutation response
unique attributetypetype name StringLiteral SingleMemberAnnotation MethodDeclaration SimpleType SimpleName entity mutation response
path SimpleName SingleMemberAnnotation MethodDeclaration SimpleName partial update by unique attribute
unique attributetypetype name StringLiteral SingleMemberAnnotation MethodDeclaration SimpleName partial update by unique attribute
path SimpleName SingleMemberAnnotation MethodDeclaration SingleVariableDeclaration SimpleName type name
unique attributetypetype name StringLiteral SingleMemberAnnotation MethodDeclaration SingleVariableDeclaration SimpleName type name
path SimpleName SingleMemberAnnotation MethodDeclaration SingleVariableDeclaration SimpleName servlet request
unique attributetypetype name StringLiteral SingleMemberAnnotation MethodDeclaration SingleVariableDeclaration SimpleName servlet request
public Modifier MethodDeclaration SimpleType SimpleName entity mutation response
public Modifier MethodDeclaration SimpleName partial update by unique attribute
public Modifier MethodDeclaration SingleVariableDeclaration SingleMemberAnnotation SimpleName path param
public Modifier MethodDeclaration SingleVariableDeclaration SingleMemberAnnotation StringLiteral type name
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName type name
public Modifier MethodDeclaration SingleVariableDeclaration MarkerAnnotation SimpleName context
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName http servlet request
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName servlet request
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName atlas entity
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName entity
entity mutation response SimpleName SimpleType MethodDeclaration SimpleName partial update by unique attribute
entity mutation response SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName type name
entity mutation response SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName servlet request
entity mutation response SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName entity
entity mutation response SimpleName SimpleType MethodDeclaration SimpleType SimpleName exception
partial update by unique attribute SimpleName MethodDeclaration SingleVariableDeclaration SingleMemberAnnotation SimpleName path param
partial update by unique attribute SimpleName MethodDeclaration SingleVariableDeclaration SingleMemberAnnotation StringLiteral type name
partial update by unique attribute SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
partial update by unique attribute SimpleName MethodDeclaration SingleVariableDeclaration SimpleName type name
partial update by unique attribute SimpleName MethodDeclaration SingleVariableDeclaration MarkerAnnotation SimpleName context
partial update by unique attribute SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName http servlet request
partial update by unique attribute SimpleName MethodDeclaration SingleVariableDeclaration SimpleName servlet request
partial update by unique attribute SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName atlas entity
partial update by unique attribute SimpleName MethodDeclaration SingleVariableDeclaration SimpleName entity
partial update by unique attribute SimpleName MethodDeclaration SimpleType SimpleName exception
type name SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName servlet request
type name SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName entity
type name SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
servlet request SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName entity
servlet request SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
entity SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName deprecated
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName put
public Modifier TypeDeclaration MethodDeclaration SingleMemberAnnotation SimpleName consumes
public Modifier TypeDeclaration MethodDeclaration SingleMemberAnnotation QualifiedName servletsjson media type
public Modifier TypeDeclaration MethodDeclaration SingleMemberAnnotation SimpleName produces
public Modifier TypeDeclaration MethodDeclaration SingleMemberAnnotation QualifiedName servletsjson media type
public Modifier TypeDeclaration MethodDeclaration SingleMemberAnnotation SimpleName path
public Modifier TypeDeclaration MethodDeclaration SingleMemberAnnotation StringLiteral unique attributetypetype name
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName entity mutation response
public Modifier TypeDeclaration MethodDeclaration SimpleName partial update by unique attribute
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName type name
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName servlet request
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName entity
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName deprecated
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName put
test SimpleName TypeDeclaration MethodDeclaration SingleMemberAnnotation SimpleName consumes
test SimpleName TypeDeclaration MethodDeclaration SingleMemberAnnotation QualifiedName servletsjson media type
test SimpleName TypeDeclaration MethodDeclaration SingleMemberAnnotation SimpleName produces
test SimpleName TypeDeclaration MethodDeclaration SingleMemberAnnotation QualifiedName servletsjson media type
test SimpleName TypeDeclaration MethodDeclaration SingleMemberAnnotation SimpleName path
test SimpleName TypeDeclaration MethodDeclaration SingleMemberAnnotation StringLiteral unique attributetypetype name
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName entity mutation response
test SimpleName TypeDeclaration MethodDeclaration SimpleName partial update by unique attribute
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName type name
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName servlet request
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName entity
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
