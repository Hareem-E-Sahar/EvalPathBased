path SimpleName SingleMemberAnnotation StringLiteral search
consumes SimpleName SingleMemberAnnotation QualifiedName servletsjson media type
produces SimpleName SingleMemberAnnotation QualifiedName servletsjson media type
query param SimpleName SingleMemberAnnotation StringLiteral query
query param SimpleName SingleMemberAnnotation SingleVariableDeclaration SimpleType SimpleName string
query StringLiteral SingleMemberAnnotation SingleVariableDeclaration SimpleType SimpleName string
query param SimpleName SingleMemberAnnotation SingleVariableDeclaration SimpleName query
query StringLiteral SingleMemberAnnotation SingleVariableDeclaration SimpleName query
string SimpleName SimpleType SingleVariableDeclaration SimpleName query
default value SimpleName SingleMemberAnnotation SimpleName limit offset default
query param SimpleName SingleMemberAnnotation StringLiteral limit
default value SimpleName SingleMemberAnnotation SingleVariableDeclaration SingleMemberAnnotation SimpleName query param
default value SimpleName SingleMemberAnnotation SingleVariableDeclaration SingleMemberAnnotation StringLiteral limit
limit offset default SimpleName SingleMemberAnnotation SingleVariableDeclaration SingleMemberAnnotation SimpleName query param
limit offset default SimpleName SingleMemberAnnotation SingleVariableDeclaration SingleMemberAnnotation StringLiteral limit
default value SimpleName SingleMemberAnnotation SingleVariableDeclaration PrimitiveType int
limit offset default SimpleName SingleMemberAnnotation SingleVariableDeclaration PrimitiveType int
default value SimpleName SingleMemberAnnotation SingleVariableDeclaration SimpleName limit
limit offset default SimpleName SingleMemberAnnotation SingleVariableDeclaration SimpleName limit
query param SimpleName SingleMemberAnnotation SingleVariableDeclaration PrimitiveType int
limit StringLiteral SingleMemberAnnotation SingleVariableDeclaration PrimitiveType int
query param SimpleName SingleMemberAnnotation SingleVariableDeclaration SimpleName limit
limit StringLiteral SingleMemberAnnotation SingleVariableDeclaration SimpleName limit
int PrimitiveType SingleVariableDeclaration SimpleName limit
default value SimpleName SingleMemberAnnotation SimpleName limit offset default
query param SimpleName SingleMemberAnnotation StringLiteral offset
default value SimpleName SingleMemberAnnotation SingleVariableDeclaration SingleMemberAnnotation SimpleName query param
default value SimpleName SingleMemberAnnotation SingleVariableDeclaration SingleMemberAnnotation StringLiteral offset
limit offset default SimpleName SingleMemberAnnotation SingleVariableDeclaration SingleMemberAnnotation SimpleName query param
limit offset default SimpleName SingleMemberAnnotation SingleVariableDeclaration SingleMemberAnnotation StringLiteral offset
default value SimpleName SingleMemberAnnotation SingleVariableDeclaration PrimitiveType int
limit offset default SimpleName SingleMemberAnnotation SingleVariableDeclaration PrimitiveType int
default value SimpleName SingleMemberAnnotation SingleVariableDeclaration SimpleName offset
limit offset default SimpleName SingleMemberAnnotation SingleVariableDeclaration SimpleName offset
query param SimpleName SingleMemberAnnotation SingleVariableDeclaration PrimitiveType int
offset StringLiteral SingleMemberAnnotation SingleVariableDeclaration PrimitiveType int
query param SimpleName SingleMemberAnnotation SingleVariableDeclaration SimpleName offset
offset StringLiteral SingleMemberAnnotation SingleVariableDeclaration SimpleName offset
int PrimitiveType SingleVariableDeclaration SimpleName offset
atlas perf tracer SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName perf
atlas perf tracer SimpleName MethodInvocation SimpleName is perf trace enabled
atlas perf tracer SimpleName MethodInvocation SimpleName perf log
is perf trace enabled SimpleName MethodInvocation SimpleName perf log
metadata discovery resourcesearch StringLiteral InfixExpression SimpleName query
metadata discovery resourcesearch StringLiteral InfixExpression StringLiteral )
query SimpleName InfixExpression StringLiteral )
atlas perf tracer SimpleName MethodInvocation SimpleName get perf tracer
atlas perf tracer SimpleName MethodInvocation SimpleName perf log
atlas perf tracer SimpleName MethodInvocation InfixExpression StringLiteral metadata discovery resourcesearch
atlas perf tracer SimpleName MethodInvocation InfixExpression SimpleName query
atlas perf tracer SimpleName MethodInvocation InfixExpression StringLiteral )
get perf tracer SimpleName MethodInvocation SimpleName perf log
get perf tracer SimpleName MethodInvocation InfixExpression StringLiteral metadata discovery resourcesearch
get perf tracer SimpleName MethodInvocation InfixExpression SimpleName query
get perf tracer SimpleName MethodInvocation InfixExpression StringLiteral )
perf log SimpleName MethodInvocation InfixExpression StringLiteral metadata discovery resourcesearch
perf log SimpleName MethodInvocation InfixExpression SimpleName query
perf log SimpleName MethodInvocation InfixExpression StringLiteral )
perf SimpleName Assignment MethodInvocation SimpleName atlas perf tracer
perf SimpleName Assignment MethodInvocation SimpleName get perf tracer
perf SimpleName Assignment MethodInvocation SimpleName perf log
perf SimpleName Assignment MethodInvocation InfixExpression StringLiteral metadata discovery resourcesearch
perf SimpleName Assignment MethodInvocation InfixExpression SimpleName query
perf SimpleName Assignment MethodInvocation InfixExpression StringLiteral )
search using query dsl SimpleName MethodInvocation SimpleName query
search using query dsl SimpleName MethodInvocation SimpleName limit
search using query dsl SimpleName MethodInvocation SimpleName offset
query SimpleName MethodInvocation SimpleName limit
query SimpleName MethodInvocation SimpleName offset
limit SimpleName MethodInvocation SimpleName offset
response SimpleName VariableDeclarationFragment MethodInvocation SimpleName search using query dsl
response SimpleName VariableDeclarationFragment MethodInvocation SimpleName query
response SimpleName VariableDeclarationFragment MethodInvocation SimpleName limit
response SimpleName VariableDeclarationFragment MethodInvocation SimpleName offset
response SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName response
response SimpleName MethodInvocation SimpleName get status
responsestatusok QualifiedName MethodInvocation SimpleName get status code
response SimpleName MethodInvocation InfixExpression MethodInvocation QualifiedName responsestatusok
response SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get status code
get status SimpleName MethodInvocation InfixExpression MethodInvocation QualifiedName responsestatusok
get status SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get status code
search using full text SimpleName MethodInvocation SimpleName query
search using full text SimpleName MethodInvocation SimpleName limit
search using full text SimpleName MethodInvocation SimpleName offset
query SimpleName MethodInvocation SimpleName limit
query SimpleName MethodInvocation SimpleName offset
limit SimpleName MethodInvocation SimpleName offset
response SimpleName Assignment MethodInvocation SimpleName search using full text
response SimpleName Assignment MethodInvocation SimpleName query
response SimpleName Assignment MethodInvocation SimpleName limit
response SimpleName Assignment MethodInvocation SimpleName offset
atlas perf tracer SimpleName MethodInvocation SimpleName log
atlas perf tracer SimpleName MethodInvocation SimpleName perf
log SimpleName MethodInvocation SimpleName perf
get SimpleName MarkerAnnotation MethodDeclaration SingleMemberAnnotation SimpleName path
get SimpleName MarkerAnnotation MethodDeclaration SingleMemberAnnotation StringLiteral search
get SimpleName MarkerAnnotation MethodDeclaration SingleMemberAnnotation SimpleName consumes
get SimpleName MarkerAnnotation MethodDeclaration SingleMemberAnnotation QualifiedName servletsjson media type
get SimpleName MarkerAnnotation MethodDeclaration SingleMemberAnnotation SimpleName produces
get SimpleName MarkerAnnotation MethodDeclaration SingleMemberAnnotation QualifiedName servletsjson media type
get SimpleName MarkerAnnotation MethodDeclaration Modifier public
get SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName response
path SimpleName SingleMemberAnnotation MethodDeclaration SingleMemberAnnotation SimpleName consumes
path SimpleName SingleMemberAnnotation MethodDeclaration SingleMemberAnnotation QualifiedName servletsjson media type
search StringLiteral SingleMemberAnnotation MethodDeclaration SingleMemberAnnotation SimpleName consumes
search StringLiteral SingleMemberAnnotation MethodDeclaration SingleMemberAnnotation QualifiedName servletsjson media type
path SimpleName SingleMemberAnnotation MethodDeclaration SingleMemberAnnotation SimpleName produces
path SimpleName SingleMemberAnnotation MethodDeclaration SingleMemberAnnotation QualifiedName servletsjson media type
search StringLiteral SingleMemberAnnotation MethodDeclaration SingleMemberAnnotation SimpleName produces
search StringLiteral SingleMemberAnnotation MethodDeclaration SingleMemberAnnotation QualifiedName servletsjson media type
path SimpleName SingleMemberAnnotation MethodDeclaration Modifier public
search StringLiteral SingleMemberAnnotation MethodDeclaration Modifier public
path SimpleName SingleMemberAnnotation MethodDeclaration SimpleType SimpleName response
search StringLiteral SingleMemberAnnotation MethodDeclaration SimpleType SimpleName response
path SimpleName SingleMemberAnnotation MethodDeclaration SimpleName search
search StringLiteral SingleMemberAnnotation MethodDeclaration SimpleName search
consumes SimpleName SingleMemberAnnotation MethodDeclaration SingleMemberAnnotation SimpleName produces
consumes SimpleName SingleMemberAnnotation MethodDeclaration SingleMemberAnnotation QualifiedName servletsjson media type
servletsjson media type QualifiedName SingleMemberAnnotation MethodDeclaration SingleMemberAnnotation SimpleName produces
servletsjson media type QualifiedName SingleMemberAnnotation MethodDeclaration SingleMemberAnnotation QualifiedName servletsjson media type
consumes SimpleName SingleMemberAnnotation MethodDeclaration Modifier public
servletsjson media type QualifiedName SingleMemberAnnotation MethodDeclaration Modifier public
consumes SimpleName SingleMemberAnnotation MethodDeclaration SimpleType SimpleName response
servletsjson media type QualifiedName SingleMemberAnnotation MethodDeclaration SimpleType SimpleName response
consumes SimpleName SingleMemberAnnotation MethodDeclaration SimpleName search
servletsjson media type QualifiedName SingleMemberAnnotation MethodDeclaration SimpleName search
consumes SimpleName SingleMemberAnnotation MethodDeclaration SingleVariableDeclaration SimpleName query
servletsjson media type QualifiedName SingleMemberAnnotation MethodDeclaration SingleVariableDeclaration SimpleName query
produces SimpleName SingleMemberAnnotation MethodDeclaration Modifier public
servletsjson media type QualifiedName SingleMemberAnnotation MethodDeclaration Modifier public
produces SimpleName SingleMemberAnnotation MethodDeclaration SimpleType SimpleName response
servletsjson media type QualifiedName SingleMemberAnnotation MethodDeclaration SimpleType SimpleName response
produces SimpleName SingleMemberAnnotation MethodDeclaration SimpleName search
servletsjson media type QualifiedName SingleMemberAnnotation MethodDeclaration SimpleName search
produces SimpleName SingleMemberAnnotation MethodDeclaration SingleVariableDeclaration SimpleName query
servletsjson media type QualifiedName SingleMemberAnnotation MethodDeclaration SingleVariableDeclaration SimpleName query
produces SimpleName SingleMemberAnnotation MethodDeclaration SingleVariableDeclaration PrimitiveType int
produces SimpleName SingleMemberAnnotation MethodDeclaration SingleVariableDeclaration SimpleName limit
servletsjson media type QualifiedName SingleMemberAnnotation MethodDeclaration SingleVariableDeclaration PrimitiveType int
servletsjson media type QualifiedName SingleMemberAnnotation MethodDeclaration SingleVariableDeclaration SimpleName limit
public Modifier MethodDeclaration SimpleType SimpleName response
public Modifier MethodDeclaration SimpleName search
public Modifier MethodDeclaration SingleVariableDeclaration SingleMemberAnnotation SimpleName query param
public Modifier MethodDeclaration SingleVariableDeclaration SingleMemberAnnotation StringLiteral query
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName query
public Modifier MethodDeclaration SingleVariableDeclaration SingleMemberAnnotation SimpleName default value
public Modifier MethodDeclaration SingleVariableDeclaration SingleMemberAnnotation SimpleName limit offset default
public Modifier MethodDeclaration SingleVariableDeclaration SingleMemberAnnotation SimpleName query param
public Modifier MethodDeclaration SingleVariableDeclaration SingleMemberAnnotation StringLiteral limit
public Modifier MethodDeclaration SingleVariableDeclaration PrimitiveType int
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName limit
public Modifier MethodDeclaration SingleVariableDeclaration SingleMemberAnnotation SimpleName default value
public Modifier MethodDeclaration SingleVariableDeclaration SingleMemberAnnotation SimpleName limit offset default
public Modifier MethodDeclaration SingleVariableDeclaration SingleMemberAnnotation SimpleName query param
public Modifier MethodDeclaration SingleVariableDeclaration SingleMemberAnnotation StringLiteral offset
public Modifier MethodDeclaration SingleVariableDeclaration PrimitiveType int
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName offset
response SimpleName SimpleType MethodDeclaration SimpleName search
response SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName query
response SimpleName SimpleType MethodDeclaration SingleVariableDeclaration PrimitiveType int
response SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName limit
response SimpleName SimpleType MethodDeclaration SingleVariableDeclaration PrimitiveType int
response SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName offset
search SimpleName MethodDeclaration SingleVariableDeclaration SingleMemberAnnotation SimpleName query param
search SimpleName MethodDeclaration SingleVariableDeclaration SingleMemberAnnotation StringLiteral query
search SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
search SimpleName MethodDeclaration SingleVariableDeclaration SimpleName query
search SimpleName MethodDeclaration SingleVariableDeclaration SingleMemberAnnotation SimpleName default value
search SimpleName MethodDeclaration SingleVariableDeclaration SingleMemberAnnotation SimpleName limit offset default
search SimpleName MethodDeclaration SingleVariableDeclaration SingleMemberAnnotation SimpleName query param
search SimpleName MethodDeclaration SingleVariableDeclaration SingleMemberAnnotation StringLiteral limit
search SimpleName MethodDeclaration SingleVariableDeclaration PrimitiveType int
search SimpleName MethodDeclaration SingleVariableDeclaration SimpleName limit
search SimpleName MethodDeclaration SingleVariableDeclaration SingleMemberAnnotation SimpleName default value
search SimpleName MethodDeclaration SingleVariableDeclaration SingleMemberAnnotation SimpleName limit offset default
search SimpleName MethodDeclaration SingleVariableDeclaration SingleMemberAnnotation SimpleName query param
search SimpleName MethodDeclaration SingleVariableDeclaration SingleMemberAnnotation StringLiteral offset
search SimpleName MethodDeclaration SingleVariableDeclaration PrimitiveType int
search SimpleName MethodDeclaration SingleVariableDeclaration SimpleName offset
search SimpleName MethodDeclaration Block ReturnStatement SimpleName response
query SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
query SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName limit
query SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
query SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName offset
int PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
int PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName offset
limit SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
limit SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName offset
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName get
public Modifier TypeDeclaration MethodDeclaration SingleMemberAnnotation SimpleName path
public Modifier TypeDeclaration MethodDeclaration SingleMemberAnnotation StringLiteral search
public Modifier TypeDeclaration MethodDeclaration SingleMemberAnnotation SimpleName consumes
public Modifier TypeDeclaration MethodDeclaration SingleMemberAnnotation QualifiedName servletsjson media type
public Modifier TypeDeclaration MethodDeclaration SingleMemberAnnotation SimpleName produces
public Modifier TypeDeclaration MethodDeclaration SingleMemberAnnotation QualifiedName servletsjson media type
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName response
public Modifier TypeDeclaration MethodDeclaration SimpleName search
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName query
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName limit
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName offset
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName get
test SimpleName TypeDeclaration MethodDeclaration SingleMemberAnnotation SimpleName path
test SimpleName TypeDeclaration MethodDeclaration SingleMemberAnnotation StringLiteral search
test SimpleName TypeDeclaration MethodDeclaration SingleMemberAnnotation SimpleName consumes
test SimpleName TypeDeclaration MethodDeclaration SingleMemberAnnotation QualifiedName servletsjson media type
test SimpleName TypeDeclaration MethodDeclaration SingleMemberAnnotation SimpleName produces
test SimpleName TypeDeclaration MethodDeclaration SingleMemberAnnotation QualifiedName servletsjson media type
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName response
test SimpleName TypeDeclaration MethodDeclaration SimpleName search
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName query
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName limit
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName offset