path SimpleName SingleMemberAnnotation StringLiteral session
produces SimpleName SingleMemberAnnotation QualifiedName servletsjson media type
log SimpleName MethodInvocation SimpleName is debug enabled
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral ==> admin resourceget user profile
debug SimpleName MethodInvocation StringLiteral ==> admin resourceget user profile
response SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName response
properties configuration SimpleName SimpleType ClassInstanceCreation StringLiteral atlasapplicationproperties
config properties SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName properties configuration
config properties SimpleName VariableDeclarationFragment ClassInstanceCreation StringLiteral atlasapplicationproperties
properties configuration SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName config properties
config properties SimpleName MethodInvocation SimpleName get boolean
config properties SimpleName MethodInvocation SimpleName is taxonomy enabled
config properties SimpleName MethodInvocation BooleanLiteral false
get boolean SimpleName MethodInvocation SimpleName is taxonomy enabled
get boolean SimpleName MethodInvocation BooleanLiteral false
is taxonomy enabled SimpleName MethodInvocation BooleanLiteral false
enable taxonomy SimpleName VariableDeclarationFragment MethodInvocation SimpleName config properties
enable taxonomy SimpleName VariableDeclarationFragment MethodInvocation SimpleName get boolean
enable taxonomy SimpleName VariableDeclarationFragment MethodInvocation SimpleName is taxonomy enabled
enable taxonomy SimpleName VariableDeclarationFragment MethodInvocation BooleanLiteral false
boolean SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName enable taxonomy
security context holder SimpleName MethodInvocation SimpleName get context
security context holder SimpleName MethodInvocation MethodInvocation SimpleName get authentication
get context SimpleName MethodInvocation MethodInvocation SimpleName get authentication
auth SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName security context holder
auth SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get context
auth SimpleName VariableDeclarationFragment MethodInvocation SimpleName get authentication
authentication SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName auth
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName user name
set SimpleName SimpleType ParameterizedType SimpleType SimpleName string
auth SimpleName MethodInvocation SimpleName get name
user name SimpleName Assignment MethodInvocation SimpleName auth
user name SimpleName Assignment MethodInvocation SimpleName get name
auth SimpleName MethodInvocation SimpleName get authorities
authorities SimpleName VariableDeclarationFragment MethodInvocation SimpleName auth
authorities SimpleName VariableDeclarationFragment MethodInvocation SimpleName get authorities
granted authority SimpleName SimpleType SingleVariableDeclaration SimpleName c
c SimpleName MethodInvocation SimpleName get authority
groups SimpleName MethodInvocation SimpleName add
groups SimpleName MethodInvocation MethodInvocation SimpleName c
groups SimpleName MethodInvocation MethodInvocation SimpleName get authority
add SimpleName MethodInvocation MethodInvocation SimpleName c
add SimpleName MethodInvocation MethodInvocation SimpleName get authority
granted authority SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName authorities
c SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName authorities
response data SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName json object
json object SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName response data
response data SimpleName MethodInvocation SimpleName put
response data SimpleName MethodInvocation SimpleName is csrf enabled
response data SimpleName MethodInvocation QualifiedName atlas csrf prevention filteris csrf enabled
put SimpleName MethodInvocation SimpleName is csrf enabled
put SimpleName MethodInvocation QualifiedName atlas csrf prevention filteris csrf enabled
is csrf enabled SimpleName MethodInvocation QualifiedName atlas csrf prevention filteris csrf enabled
response data SimpleName MethodInvocation SimpleName put
response data SimpleName MethodInvocation SimpleName browser user agent param
response data SimpleName MethodInvocation QualifiedName atlas csrf prevention filterbrowser user agents default
put SimpleName MethodInvocation SimpleName browser user agent param
put SimpleName MethodInvocation QualifiedName atlas csrf prevention filterbrowser user agents default
browser user agent param SimpleName MethodInvocation QualifiedName atlas csrf prevention filterbrowser user agents default
response data SimpleName MethodInvocation SimpleName put
response data SimpleName MethodInvocation SimpleName custom methods to ignore param
response data SimpleName MethodInvocation QualifiedName atlas csrf prevention filtermethods to ignore default
put SimpleName MethodInvocation SimpleName custom methods to ignore param
put SimpleName MethodInvocation QualifiedName atlas csrf prevention filtermethods to ignore default
custom methods to ignore param SimpleName MethodInvocation QualifiedName atlas csrf prevention filtermethods to ignore default
response data SimpleName MethodInvocation SimpleName put
response data SimpleName MethodInvocation SimpleName custom header param
response data SimpleName MethodInvocation QualifiedName atlas csrf prevention filterheader default
put SimpleName MethodInvocation SimpleName custom header param
put SimpleName MethodInvocation QualifiedName atlas csrf prevention filterheader default
custom header param SimpleName MethodInvocation QualifiedName atlas csrf prevention filterheader default
response data SimpleName MethodInvocation SimpleName put
response data SimpleName MethodInvocation SimpleName is taxonomy enabled
response data SimpleName MethodInvocation SimpleName enable taxonomy
put SimpleName MethodInvocation SimpleName is taxonomy enabled
put SimpleName MethodInvocation SimpleName enable taxonomy
is taxonomy enabled SimpleName MethodInvocation SimpleName enable taxonomy
response data SimpleName MethodInvocation SimpleName put
response data SimpleName MethodInvocation StringLiteral user name
response data SimpleName MethodInvocation SimpleName user name
put SimpleName MethodInvocation StringLiteral user name
put SimpleName MethodInvocation SimpleName user name
user name StringLiteral MethodInvocation SimpleName user name
response data SimpleName MethodInvocation SimpleName put
response data SimpleName MethodInvocation StringLiteral groups
response data SimpleName MethodInvocation SimpleName groups
put SimpleName MethodInvocation StringLiteral groups
put SimpleName MethodInvocation SimpleName groups
groups StringLiteral MethodInvocation SimpleName groups
response SimpleName MethodInvocation SimpleName ok
response SimpleName MethodInvocation SimpleName response data
ok SimpleName MethodInvocation SimpleName response data
response SimpleName MethodInvocation MethodInvocation SimpleName build
ok SimpleName MethodInvocation MethodInvocation SimpleName build
response data SimpleName MethodInvocation MethodInvocation SimpleName build
response SimpleName Assignment MethodInvocation MethodInvocation SimpleName response
response SimpleName Assignment MethodInvocation MethodInvocation SimpleName ok
response SimpleName Assignment MethodInvocation MethodInvocation SimpleName response data
response SimpleName Assignment MethodInvocation SimpleName build
json exception SimpleName SimpleType UnionType SimpleType SimpleName configuration exception
json exception SimpleName SimpleType UnionType SingleVariableDeclaration SimpleName e
configuration exception SimpleName SimpleType UnionType SingleVariableDeclaration SimpleName e
servlets SimpleName MethodInvocation SimpleName get error response
servlets SimpleName MethodInvocation SimpleName e
servlets SimpleName MethodInvocation QualifiedName responsestatusinternal server error
get error response SimpleName MethodInvocation SimpleName e
get error response SimpleName MethodInvocation QualifiedName responsestatusinternal server error
e SimpleName MethodInvocation QualifiedName responsestatusinternal server error
web application exception SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName servlets
web application exception SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get error response
web application exception SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName e
web application exception SimpleName SimpleType ClassInstanceCreation MethodInvocation QualifiedName responsestatusinternal server error
log SimpleName MethodInvocation SimpleName is debug enabled
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral <== admin resourceget user profile
debug SimpleName MethodInvocation StringLiteral <== admin resourceget user profile
get SimpleName MarkerAnnotation MethodDeclaration SingleMemberAnnotation SimpleName path
get SimpleName MarkerAnnotation MethodDeclaration SingleMemberAnnotation StringLiteral session
get SimpleName MarkerAnnotation MethodDeclaration SingleMemberAnnotation SimpleName produces
get SimpleName MarkerAnnotation MethodDeclaration SingleMemberAnnotation QualifiedName servletsjson media type
get SimpleName MarkerAnnotation MethodDeclaration Modifier public
get SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName response
get SimpleName MarkerAnnotation MethodDeclaration SimpleName get user profile
path SimpleName SingleMemberAnnotation MethodDeclaration SingleMemberAnnotation SimpleName produces
path SimpleName SingleMemberAnnotation MethodDeclaration SingleMemberAnnotation QualifiedName servletsjson media type
session StringLiteral SingleMemberAnnotation MethodDeclaration SingleMemberAnnotation SimpleName produces
session StringLiteral SingleMemberAnnotation MethodDeclaration SingleMemberAnnotation QualifiedName servletsjson media type
path SimpleName SingleMemberAnnotation MethodDeclaration Modifier public
session StringLiteral SingleMemberAnnotation MethodDeclaration Modifier public
path SimpleName SingleMemberAnnotation MethodDeclaration SimpleType SimpleName response
session StringLiteral SingleMemberAnnotation MethodDeclaration SimpleType SimpleName response
path SimpleName SingleMemberAnnotation MethodDeclaration SimpleName get user profile
session StringLiteral SingleMemberAnnotation MethodDeclaration SimpleName get user profile
produces SimpleName SingleMemberAnnotation MethodDeclaration Modifier public
servletsjson media type QualifiedName SingleMemberAnnotation MethodDeclaration Modifier public
produces SimpleName SingleMemberAnnotation MethodDeclaration SimpleType SimpleName response
servletsjson media type QualifiedName SingleMemberAnnotation MethodDeclaration SimpleType SimpleName response
produces SimpleName SingleMemberAnnotation MethodDeclaration SimpleName get user profile
servletsjson media type QualifiedName SingleMemberAnnotation MethodDeclaration SimpleName get user profile
public Modifier MethodDeclaration SimpleType SimpleName response
public Modifier MethodDeclaration SimpleName get user profile
public Modifier MethodDeclaration Block ReturnStatement SimpleName response
response SimpleName SimpleType MethodDeclaration SimpleName get user profile
get user profile SimpleName MethodDeclaration Block ReturnStatement SimpleName response
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName get
public Modifier TypeDeclaration MethodDeclaration SingleMemberAnnotation SimpleName path
public Modifier TypeDeclaration MethodDeclaration SingleMemberAnnotation StringLiteral session
public Modifier TypeDeclaration MethodDeclaration SingleMemberAnnotation SimpleName produces
public Modifier TypeDeclaration MethodDeclaration SingleMemberAnnotation QualifiedName servletsjson media type
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName response
public Modifier TypeDeclaration MethodDeclaration SimpleName get user profile
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName get
test SimpleName TypeDeclaration MethodDeclaration SingleMemberAnnotation SimpleName path
test SimpleName TypeDeclaration MethodDeclaration SingleMemberAnnotation StringLiteral session
test SimpleName TypeDeclaration MethodDeclaration SingleMemberAnnotation SimpleName produces
test SimpleName TypeDeclaration MethodDeclaration SingleMemberAnnotation QualifiedName servletsjson media type
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName response
test SimpleName TypeDeclaration MethodDeclaration SimpleName get user profile
