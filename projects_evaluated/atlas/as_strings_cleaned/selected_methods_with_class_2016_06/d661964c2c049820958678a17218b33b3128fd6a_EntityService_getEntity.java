path SimpleName SingleMemberAnnotation StringLiteral entity id
produces SimpleName SingleMemberAnnotation QualifiedName servletsjson media type
context SimpleName MarkerAnnotation SingleVariableDeclaration SimpleType SimpleName http headers
context SimpleName MarkerAnnotation SingleVariableDeclaration SimpleName headers
http headers SimpleName SimpleType SingleVariableDeclaration SimpleName headers
context SimpleName MarkerAnnotation SingleVariableDeclaration SimpleType SimpleName uri info
context SimpleName MarkerAnnotation SingleVariableDeclaration SimpleName ui
uri info SimpleName SimpleType SingleVariableDeclaration SimpleName ui
path param SimpleName SingleMemberAnnotation StringLiteral entity id
path param SimpleName SingleMemberAnnotation SingleVariableDeclaration SimpleType SimpleName string
entity id StringLiteral SingleMemberAnnotation SingleVariableDeclaration SimpleType SimpleName string
path param SimpleName SingleMemberAnnotation SingleVariableDeclaration SimpleName entity id
entity id StringLiteral SingleMemberAnnotation SingleVariableDeclaration SimpleName entity id
string SimpleName SimpleType SingleVariableDeclaration SimpleName entity id
collections SimpleName MethodInvocation SimpleType SimpleName string
collections SimpleName MethodInvocation SimpleType SimpleName object
collections SimpleName MethodInvocation SimpleName singleton map
collections SimpleName MethodInvocation StringLiteral id
collections SimpleName MethodInvocation SimpleName entity id
string SimpleName SimpleType MethodInvocation SimpleType SimpleName object
string SimpleName SimpleType MethodInvocation SimpleName singleton map
string SimpleName SimpleType MethodInvocation StringLiteral id
string SimpleName SimpleType MethodInvocation SimpleName entity id
object SimpleName SimpleType MethodInvocation SimpleName singleton map
object SimpleName SimpleType MethodInvocation StringLiteral id
object SimpleName SimpleType MethodInvocation SimpleName entity id
singleton map SimpleName MethodInvocation StringLiteral id
singleton map SimpleName MethodInvocation SimpleName entity id
id StringLiteral MethodInvocation SimpleName entity id
instance request SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName collections
instance request SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName singleton map
instance request SimpleName SimpleType ClassInstanceCreation MethodInvocation StringLiteral id
instance request SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName entity id
request SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName instance request
request SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName collections
request SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName singleton map
request SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation StringLiteral id
request SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName entity id
base request SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName request
get resource SimpleName MethodInvocation SimpleName entity resource provider
get resource SimpleName MethodInvocation SimpleName request
entity resource provider SimpleName MethodInvocation SimpleName request
result SimpleName VariableDeclarationFragment MethodInvocation SimpleName get resource
result SimpleName VariableDeclarationFragment MethodInvocation SimpleName entity resource provider
result SimpleName VariableDeclarationFragment MethodInvocation SimpleName request
result SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName result
response SimpleName MethodInvocation SimpleName status
response SimpleName MethodInvocation QualifiedName responsestatusok
status SimpleName MethodInvocation QualifiedName responsestatusok
get serializer SimpleName MethodInvocation MethodInvocation SimpleName serialize
get serializer SimpleName MethodInvocation MethodInvocation SimpleName result
get serializer SimpleName MethodInvocation MethodInvocation SimpleName ui
serialize SimpleName MethodInvocation SimpleName result
serialize SimpleName MethodInvocation SimpleName ui
result SimpleName MethodInvocation SimpleName ui
response SimpleName MethodInvocation MethodInvocation SimpleName entity
status SimpleName MethodInvocation MethodInvocation SimpleName entity
responsestatusok QualifiedName MethodInvocation MethodInvocation SimpleName entity
response SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName serialize
response SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName result
response SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName ui
status SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName serialize
status SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName result
status SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName ui
responsestatusok QualifiedName MethodInvocation MethodInvocation MethodInvocation SimpleName serialize
responsestatusok QualifiedName MethodInvocation MethodInvocation MethodInvocation SimpleName result
responsestatusok QualifiedName MethodInvocation MethodInvocation MethodInvocation SimpleName ui
entity SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get serializer
entity SimpleName MethodInvocation MethodInvocation SimpleName serialize
entity SimpleName MethodInvocation MethodInvocation SimpleName result
entity SimpleName MethodInvocation MethodInvocation SimpleName ui
response SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName build
status SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName build
responsestatusok QualifiedName MethodInvocation MethodInvocation MethodInvocation SimpleName build
entity SimpleName MethodInvocation MethodInvocation SimpleName build
serialize SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName build
result SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName build
ui SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName build
get SimpleName MarkerAnnotation MethodDeclaration SingleMemberAnnotation SimpleName path
get SimpleName MarkerAnnotation MethodDeclaration SingleMemberAnnotation StringLiteral entity id
get SimpleName MarkerAnnotation MethodDeclaration SingleMemberAnnotation SimpleName produces
get SimpleName MarkerAnnotation MethodDeclaration SingleMemberAnnotation QualifiedName servletsjson media type
get SimpleName MarkerAnnotation MethodDeclaration Modifier public
get SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName response
get SimpleName MarkerAnnotation MethodDeclaration SimpleName get entity
path SimpleName SingleMemberAnnotation MethodDeclaration SingleMemberAnnotation SimpleName produces
path SimpleName SingleMemberAnnotation MethodDeclaration SingleMemberAnnotation QualifiedName servletsjson media type
entity id StringLiteral SingleMemberAnnotation MethodDeclaration SingleMemberAnnotation SimpleName produces
entity id StringLiteral SingleMemberAnnotation MethodDeclaration SingleMemberAnnotation QualifiedName servletsjson media type
path SimpleName SingleMemberAnnotation MethodDeclaration Modifier public
entity id StringLiteral SingleMemberAnnotation MethodDeclaration Modifier public
path SimpleName SingleMemberAnnotation MethodDeclaration SimpleType SimpleName response
entity id StringLiteral SingleMemberAnnotation MethodDeclaration SimpleType SimpleName response
path SimpleName SingleMemberAnnotation MethodDeclaration SimpleName get entity
entity id StringLiteral SingleMemberAnnotation MethodDeclaration SimpleName get entity
path SimpleName SingleMemberAnnotation MethodDeclaration SingleVariableDeclaration SimpleName headers
entity id StringLiteral SingleMemberAnnotation MethodDeclaration SingleVariableDeclaration SimpleName headers
produces SimpleName SingleMemberAnnotation MethodDeclaration Modifier public
servletsjson media type QualifiedName SingleMemberAnnotation MethodDeclaration Modifier public
produces SimpleName SingleMemberAnnotation MethodDeclaration SimpleType SimpleName response
servletsjson media type QualifiedName SingleMemberAnnotation MethodDeclaration SimpleType SimpleName response
produces SimpleName SingleMemberAnnotation MethodDeclaration SimpleName get entity
servletsjson media type QualifiedName SingleMemberAnnotation MethodDeclaration SimpleName get entity
produces SimpleName SingleMemberAnnotation MethodDeclaration SingleVariableDeclaration SimpleName headers
servletsjson media type QualifiedName SingleMemberAnnotation MethodDeclaration SingleVariableDeclaration SimpleName headers
produces SimpleName SingleMemberAnnotation MethodDeclaration SingleVariableDeclaration SimpleName ui
servletsjson media type QualifiedName SingleMemberAnnotation MethodDeclaration SingleVariableDeclaration SimpleName ui
public Modifier MethodDeclaration SimpleType SimpleName response
public Modifier MethodDeclaration SimpleName get entity
public Modifier MethodDeclaration SingleVariableDeclaration MarkerAnnotation SimpleName context
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName http headers
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName headers
public Modifier MethodDeclaration SingleVariableDeclaration MarkerAnnotation SimpleName context
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName uri info
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName ui
public Modifier MethodDeclaration SingleVariableDeclaration SingleMemberAnnotation SimpleName path param
public Modifier MethodDeclaration SingleVariableDeclaration SingleMemberAnnotation StringLiteral entity id
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName entity id
response SimpleName SimpleType MethodDeclaration SimpleName get entity
response SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName headers
response SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName ui
response SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName entity id
response SimpleName SimpleType MethodDeclaration SimpleType SimpleName catalog exception
get entity SimpleName MethodDeclaration SingleVariableDeclaration MarkerAnnotation SimpleName context
get entity SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName http headers
get entity SimpleName MethodDeclaration SingleVariableDeclaration SimpleName headers
get entity SimpleName MethodDeclaration SingleVariableDeclaration MarkerAnnotation SimpleName context
get entity SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName uri info
get entity SimpleName MethodDeclaration SingleVariableDeclaration SimpleName ui
get entity SimpleName MethodDeclaration SingleVariableDeclaration SingleMemberAnnotation SimpleName path param
get entity SimpleName MethodDeclaration SingleVariableDeclaration SingleMemberAnnotation StringLiteral entity id
get entity SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
get entity SimpleName MethodDeclaration SingleVariableDeclaration SimpleName entity id
get entity SimpleName MethodDeclaration SimpleType SimpleName catalog exception
headers SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName ui
headers SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName entity id
headers SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName catalog exception
ui SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName entity id
ui SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName catalog exception
entity id SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName catalog exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName get
public Modifier TypeDeclaration MethodDeclaration SingleMemberAnnotation SimpleName path
public Modifier TypeDeclaration MethodDeclaration SingleMemberAnnotation StringLiteral entity id
public Modifier TypeDeclaration MethodDeclaration SingleMemberAnnotation SimpleName produces
public Modifier TypeDeclaration MethodDeclaration SingleMemberAnnotation QualifiedName servletsjson media type
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName response
public Modifier TypeDeclaration MethodDeclaration SimpleName get entity
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName headers
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName ui
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName entity id
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName catalog exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName get
test SimpleName TypeDeclaration MethodDeclaration SingleMemberAnnotation SimpleName path
test SimpleName TypeDeclaration MethodDeclaration SingleMemberAnnotation StringLiteral entity id
test SimpleName TypeDeclaration MethodDeclaration SingleMemberAnnotation SimpleName produces
test SimpleName TypeDeclaration MethodDeclaration SingleMemberAnnotation QualifiedName servletsjson media type
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName response
test SimpleName TypeDeclaration MethodDeclaration SimpleName get entity
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName headers
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName ui
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName entity id
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName catalog exception
