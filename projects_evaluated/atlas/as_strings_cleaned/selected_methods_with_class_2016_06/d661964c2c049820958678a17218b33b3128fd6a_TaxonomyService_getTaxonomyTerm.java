path SimpleName SingleMemberAnnotation StringLiteral taxonomy nametermsterm name
produces SimpleName SingleMemberAnnotation QualifiedName servletsjson media type
context SimpleName MarkerAnnotation SingleVariableDeclaration SimpleType SimpleName http headers
context SimpleName MarkerAnnotation SingleVariableDeclaration SimpleName headers
http headers SimpleName SimpleType SingleVariableDeclaration SimpleName headers
context SimpleName MarkerAnnotation SingleVariableDeclaration SimpleType SimpleName uri info
context SimpleName MarkerAnnotation SingleVariableDeclaration SimpleName ui
uri info SimpleName SimpleType SingleVariableDeclaration SimpleName ui
path param SimpleName SingleMemberAnnotation StringLiteral taxonomy name
path param SimpleName SingleMemberAnnotation SingleVariableDeclaration SimpleType SimpleName string
taxonomy name StringLiteral SingleMemberAnnotation SingleVariableDeclaration SimpleType SimpleName string
path param SimpleName SingleMemberAnnotation SingleVariableDeclaration SimpleName taxonomy name
taxonomy name StringLiteral SingleMemberAnnotation SingleVariableDeclaration SimpleName taxonomy name
string SimpleName SimpleType SingleVariableDeclaration SimpleName taxonomy name
path param SimpleName SingleMemberAnnotation StringLiteral term name
path param SimpleName SingleMemberAnnotation SingleVariableDeclaration SimpleType SimpleName string
term name StringLiteral SingleMemberAnnotation SingleVariableDeclaration SimpleType SimpleName string
path param SimpleName SingleMemberAnnotation SingleVariableDeclaration SimpleName term name
term name StringLiteral SingleMemberAnnotation SingleVariableDeclaration SimpleName term name
string SimpleName SimpleType SingleVariableDeclaration SimpleName term name
term path SimpleName SimpleType ClassInstanceCreation SimpleName taxonomy name
term path SimpleName SimpleType ClassInstanceCreation SimpleName term name
taxonomy name SimpleName ClassInstanceCreation SimpleName term name
term path SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName term path
term path SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName taxonomy name
term path SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName term name
term path SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName term path
map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
map SimpleName SimpleType ParameterizedType SimpleType SimpleName object
string SimpleName SimpleType ParameterizedType SimpleType SimpleName object
properties SimpleName MethodInvocation SimpleName put
properties SimpleName MethodInvocation StringLiteral term path
properties SimpleName MethodInvocation SimpleName term path
put SimpleName MethodInvocation StringLiteral term path
put SimpleName MethodInvocation SimpleName term path
term path StringLiteral MethodInvocation SimpleName term path
instance request SimpleName SimpleType ClassInstanceCreation SimpleName properties
get resource SimpleName MethodInvocation SimpleName term resource provider
get resource SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName instance request
get resource SimpleName MethodInvocation ClassInstanceCreation SimpleName properties
term resource provider SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName instance request
term resource provider SimpleName MethodInvocation ClassInstanceCreation SimpleName properties
result SimpleName VariableDeclarationFragment MethodInvocation SimpleName get resource
result SimpleName VariableDeclarationFragment MethodInvocation SimpleName term resource provider
result SimpleName VariableDeclarationFragment MethodInvocation ClassInstanceCreation SimpleName properties
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
get SimpleName MarkerAnnotation MethodDeclaration SingleMemberAnnotation StringLiteral taxonomy nametermsterm name
get SimpleName MarkerAnnotation MethodDeclaration SingleMemberAnnotation SimpleName produces
get SimpleName MarkerAnnotation MethodDeclaration SingleMemberAnnotation QualifiedName servletsjson media type
get SimpleName MarkerAnnotation MethodDeclaration Modifier public
get SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName response
get SimpleName MarkerAnnotation MethodDeclaration SimpleName get taxonomy term
path SimpleName SingleMemberAnnotation MethodDeclaration SingleMemberAnnotation SimpleName produces
path SimpleName SingleMemberAnnotation MethodDeclaration SingleMemberAnnotation QualifiedName servletsjson media type
taxonomy nametermsterm name StringLiteral SingleMemberAnnotation MethodDeclaration SingleMemberAnnotation SimpleName produces
taxonomy nametermsterm name StringLiteral SingleMemberAnnotation MethodDeclaration SingleMemberAnnotation QualifiedName servletsjson media type
path SimpleName SingleMemberAnnotation MethodDeclaration Modifier public
taxonomy nametermsterm name StringLiteral SingleMemberAnnotation MethodDeclaration Modifier public
path SimpleName SingleMemberAnnotation MethodDeclaration SimpleType SimpleName response
taxonomy nametermsterm name StringLiteral SingleMemberAnnotation MethodDeclaration SimpleType SimpleName response
path SimpleName SingleMemberAnnotation MethodDeclaration SimpleName get taxonomy term
taxonomy nametermsterm name StringLiteral SingleMemberAnnotation MethodDeclaration SimpleName get taxonomy term
path SimpleName SingleMemberAnnotation MethodDeclaration SingleVariableDeclaration SimpleName headers
taxonomy nametermsterm name StringLiteral SingleMemberAnnotation MethodDeclaration SingleVariableDeclaration SimpleName headers
produces SimpleName SingleMemberAnnotation MethodDeclaration Modifier public
servletsjson media type QualifiedName SingleMemberAnnotation MethodDeclaration Modifier public
produces SimpleName SingleMemberAnnotation MethodDeclaration SimpleType SimpleName response
servletsjson media type QualifiedName SingleMemberAnnotation MethodDeclaration SimpleType SimpleName response
produces SimpleName SingleMemberAnnotation MethodDeclaration SimpleName get taxonomy term
servletsjson media type QualifiedName SingleMemberAnnotation MethodDeclaration SimpleName get taxonomy term
produces SimpleName SingleMemberAnnotation MethodDeclaration SingleVariableDeclaration SimpleName headers
servletsjson media type QualifiedName SingleMemberAnnotation MethodDeclaration SingleVariableDeclaration SimpleName headers
produces SimpleName SingleMemberAnnotation MethodDeclaration SingleVariableDeclaration SimpleName ui
servletsjson media type QualifiedName SingleMemberAnnotation MethodDeclaration SingleVariableDeclaration SimpleName ui
public Modifier MethodDeclaration SimpleType SimpleName response
public Modifier MethodDeclaration SimpleName get taxonomy term
public Modifier MethodDeclaration SingleVariableDeclaration MarkerAnnotation SimpleName context
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName http headers
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName headers
public Modifier MethodDeclaration SingleVariableDeclaration MarkerAnnotation SimpleName context
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName uri info
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName ui
public Modifier MethodDeclaration SingleVariableDeclaration SingleMemberAnnotation SimpleName path param
public Modifier MethodDeclaration SingleVariableDeclaration SingleMemberAnnotation StringLiteral taxonomy name
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName taxonomy name
response SimpleName SimpleType MethodDeclaration SimpleName get taxonomy term
response SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName headers
response SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName ui
response SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName taxonomy name
response SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName term name
get taxonomy term SimpleName MethodDeclaration SingleVariableDeclaration MarkerAnnotation SimpleName context
get taxonomy term SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName http headers
get taxonomy term SimpleName MethodDeclaration SingleVariableDeclaration SimpleName headers
get taxonomy term SimpleName MethodDeclaration SingleVariableDeclaration MarkerAnnotation SimpleName context
get taxonomy term SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName uri info
get taxonomy term SimpleName MethodDeclaration SingleVariableDeclaration SimpleName ui
get taxonomy term SimpleName MethodDeclaration SingleVariableDeclaration SingleMemberAnnotation SimpleName path param
get taxonomy term SimpleName MethodDeclaration SingleVariableDeclaration SingleMemberAnnotation StringLiteral taxonomy name
get taxonomy term SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
get taxonomy term SimpleName MethodDeclaration SingleVariableDeclaration SimpleName taxonomy name
get taxonomy term SimpleName MethodDeclaration SingleVariableDeclaration SingleMemberAnnotation SimpleName path param
get taxonomy term SimpleName MethodDeclaration SingleVariableDeclaration SingleMemberAnnotation StringLiteral term name
get taxonomy term SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
get taxonomy term SimpleName MethodDeclaration SingleVariableDeclaration SimpleName term name
get taxonomy term SimpleName MethodDeclaration SimpleType SimpleName catalog exception
headers SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName ui
headers SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName taxonomy name
headers SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName term name
headers SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName catalog exception
ui SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName taxonomy name
ui SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName term name
ui SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName catalog exception
taxonomy name SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName term name
taxonomy name SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName catalog exception
term name SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName catalog exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName get
public Modifier TypeDeclaration MethodDeclaration SingleMemberAnnotation SimpleName path
public Modifier TypeDeclaration MethodDeclaration SingleMemberAnnotation StringLiteral taxonomy nametermsterm name
public Modifier TypeDeclaration MethodDeclaration SingleMemberAnnotation SimpleName produces
public Modifier TypeDeclaration MethodDeclaration SingleMemberAnnotation QualifiedName servletsjson media type
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName response
public Modifier TypeDeclaration MethodDeclaration SimpleName get taxonomy term
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName headers
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName ui
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName taxonomy name
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName term name
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName catalog exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName get
test SimpleName TypeDeclaration MethodDeclaration SingleMemberAnnotation SimpleName path
test SimpleName TypeDeclaration MethodDeclaration SingleMemberAnnotation StringLiteral taxonomy nametermsterm name
test SimpleName TypeDeclaration MethodDeclaration SingleMemberAnnotation SimpleName produces
test SimpleName TypeDeclaration MethodDeclaration SingleMemberAnnotation QualifiedName servletsjson media type
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName response
test SimpleName TypeDeclaration MethodDeclaration SimpleName get taxonomy term
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName headers
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName ui
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName taxonomy name
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName term name
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName catalog exception
