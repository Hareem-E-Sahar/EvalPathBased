path SimpleName SingleMemberAnnotation StringLiteral guidtrait definitions
produces SimpleName SingleMemberAnnotation QualifiedName servletsjson media type
path param SimpleName SingleMemberAnnotation StringLiteral guid
path param SimpleName SingleMemberAnnotation SingleVariableDeclaration SimpleType SimpleName string
guid StringLiteral SingleMemberAnnotation SingleVariableDeclaration SimpleType SimpleName string
path param SimpleName SingleMemberAnnotation SingleVariableDeclaration SimpleName guid
guid StringLiteral SingleMemberAnnotation SingleVariableDeclaration SimpleName guid
string SimpleName SimpleType SingleVariableDeclaration SimpleName guid
log SimpleName MethodInvocation SimpleName is debug enabled
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral ==> entity resourceget trait definitions for entity
log SimpleName MethodInvocation SimpleName guid
debug SimpleName MethodInvocation StringLiteral ==> entity resourceget trait definitions for entity
debug SimpleName MethodInvocation SimpleName guid
==> entity resourceget trait definitions for entity StringLiteral MethodInvocation SimpleName guid
atlas perf tracer SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName perf
atlas perf tracer SimpleName MethodInvocation SimpleName is perf trace enabled
atlas perf tracer SimpleName MethodInvocation SimpleName perf log
is perf trace enabled SimpleName MethodInvocation SimpleName perf log
entity resourceget trait definitions for entity StringLiteral InfixExpression SimpleName guid
entity resourceget trait definitions for entity StringLiteral InfixExpression StringLiteral )
guid SimpleName InfixExpression StringLiteral )
atlas perf tracer SimpleName MethodInvocation SimpleName get perf tracer
atlas perf tracer SimpleName MethodInvocation SimpleName perf log
atlas perf tracer SimpleName MethodInvocation InfixExpression StringLiteral entity resourceget trait definitions for entity
atlas perf tracer SimpleName MethodInvocation InfixExpression SimpleName guid
atlas perf tracer SimpleName MethodInvocation InfixExpression StringLiteral )
get perf tracer SimpleName MethodInvocation SimpleName perf log
get perf tracer SimpleName MethodInvocation InfixExpression StringLiteral entity resourceget trait definitions for entity
get perf tracer SimpleName MethodInvocation InfixExpression SimpleName guid
get perf tracer SimpleName MethodInvocation InfixExpression StringLiteral )
perf log SimpleName MethodInvocation InfixExpression StringLiteral entity resourceget trait definitions for entity
perf log SimpleName MethodInvocation InfixExpression SimpleName guid
perf log SimpleName MethodInvocation InfixExpression StringLiteral )
perf SimpleName Assignment MethodInvocation SimpleName atlas perf tracer
perf SimpleName Assignment MethodInvocation SimpleName get perf tracer
perf SimpleName Assignment MethodInvocation SimpleName perf log
perf SimpleName Assignment MethodInvocation InfixExpression StringLiteral entity resourceget trait definitions for entity
perf SimpleName Assignment MethodInvocation InfixExpression SimpleName guid
perf SimpleName Assignment MethodInvocation InfixExpression StringLiteral )
log SimpleName MethodInvocation SimpleName is debug enabled
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral fetching all trait definitions for entity
log SimpleName MethodInvocation SimpleName guid
debug SimpleName MethodInvocation StringLiteral fetching all trait definitions for entity
debug SimpleName MethodInvocation SimpleName guid
fetching all trait definitions for entity StringLiteral MethodInvocation SimpleName guid
list SimpleName SimpleType ParameterizedType SimpleType SimpleName atlas classification
entities store SimpleName MethodInvocation SimpleName get classifications
entities store SimpleName MethodInvocation SimpleName guid
get classifications SimpleName MethodInvocation SimpleName guid
classifications SimpleName VariableDeclarationFragment MethodInvocation SimpleName entities store
classifications SimpleName VariableDeclarationFragment MethodInvocation SimpleName get classifications
classifications SimpleName VariableDeclarationFragment MethodInvocation SimpleName guid
final Modifier VariableDeclarationStatement ParameterizedType SimpleType SimpleName list
final Modifier VariableDeclarationStatement ParameterizedType SimpleType SimpleName atlas classification
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName classifications
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName entities store
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get classifications
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName guid
traits SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName json array
json array SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName traits
atlas classification SimpleName SimpleType SingleVariableDeclaration SimpleName classification
rest adapters SimpleName MethodInvocation SimpleName get trait
rest adapters SimpleName MethodInvocation SimpleName classification
get trait SimpleName MethodInvocation SimpleName classification
trait SimpleName VariableDeclarationFragment MethodInvocation SimpleName rest adapters
trait SimpleName VariableDeclarationFragment MethodInvocation SimpleName get trait
trait SimpleName VariableDeclarationFragment MethodInvocation SimpleName classification
i struct SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName trait
instance serialization SimpleName MethodInvocation SimpleName to json
instance serialization SimpleName MethodInvocation SimpleName trait
instance serialization SimpleName MethodInvocation BooleanLiteral true
to json SimpleName MethodInvocation SimpleName trait
to json SimpleName MethodInvocation BooleanLiteral true
trait SimpleName MethodInvocation BooleanLiteral true
json object SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName instance serialization
json object SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName to json
json object SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName trait
json object SimpleName SimpleType ClassInstanceCreation MethodInvocation BooleanLiteral true
traits SimpleName MethodInvocation SimpleName put
traits SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName json object
traits SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName instance serialization
traits SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName to json
traits SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName trait
traits SimpleName MethodInvocation ClassInstanceCreation MethodInvocation BooleanLiteral true
put SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName json object
put SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName instance serialization
put SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName to json
put SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName trait
put SimpleName MethodInvocation ClassInstanceCreation MethodInvocation BooleanLiteral true
atlas classification SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName classifications
classification SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName classifications
response SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName json object
json object SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName response
servlets SimpleName MethodInvocation SimpleName get request id
response SimpleName MethodInvocation SimpleName put
response SimpleName MethodInvocation QualifiedName atlas clientrequest id
response SimpleName MethodInvocation MethodInvocation SimpleName servlets
response SimpleName MethodInvocation MethodInvocation SimpleName get request id
put SimpleName MethodInvocation QualifiedName atlas clientrequest id
put SimpleName MethodInvocation MethodInvocation SimpleName servlets
put SimpleName MethodInvocation MethodInvocation SimpleName get request id
atlas clientrequest id QualifiedName MethodInvocation MethodInvocation SimpleName servlets
atlas clientrequest id QualifiedName MethodInvocation MethodInvocation SimpleName get request id
response SimpleName MethodInvocation SimpleName put
response SimpleName MethodInvocation QualifiedName atlas clientresults
response SimpleName MethodInvocation SimpleName traits
put SimpleName MethodInvocation QualifiedName atlas clientresults
put SimpleName MethodInvocation SimpleName traits
atlas clientresults QualifiedName MethodInvocation SimpleName traits
traits SimpleName MethodInvocation SimpleName length
response SimpleName MethodInvocation SimpleName put
response SimpleName MethodInvocation QualifiedName atlas clientcount
response SimpleName MethodInvocation MethodInvocation SimpleName traits
response SimpleName MethodInvocation MethodInvocation SimpleName length
put SimpleName MethodInvocation QualifiedName atlas clientcount
put SimpleName MethodInvocation MethodInvocation SimpleName traits
put SimpleName MethodInvocation MethodInvocation SimpleName length
atlas clientcount QualifiedName MethodInvocation MethodInvocation SimpleName traits
atlas clientcount QualifiedName MethodInvocation MethodInvocation SimpleName length
response SimpleName MethodInvocation SimpleName ok
response SimpleName MethodInvocation SimpleName response
ok SimpleName MethodInvocation SimpleName response
response SimpleName MethodInvocation MethodInvocation SimpleName build
ok SimpleName MethodInvocation MethodInvocation SimpleName build
response SimpleName MethodInvocation MethodInvocation SimpleName build
final Modifier VariableDeclarationStatement Block EnhancedForStatement SimpleName classifications
atlas base exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
log SimpleName MethodInvocation SimpleName error
log SimpleName MethodInvocation StringLiteral unable to get trait definition for entity {}
log SimpleName MethodInvocation SimpleName guid
log SimpleName MethodInvocation SimpleName e
error SimpleName MethodInvocation StringLiteral unable to get trait definition for entity {}
error SimpleName MethodInvocation SimpleName guid
error SimpleName MethodInvocation SimpleName e
unable to get trait definition for entity {} StringLiteral MethodInvocation SimpleName guid
unable to get trait definition for entity {} StringLiteral MethodInvocation SimpleName e
guid SimpleName MethodInvocation SimpleName e
to web application exception SimpleName MethodInvocation SimpleName e
illegal argument exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
log SimpleName MethodInvocation SimpleName error
log SimpleName MethodInvocation StringLiteral unable to get trait definition for entity {}
log SimpleName MethodInvocation SimpleName guid
log SimpleName MethodInvocation SimpleName e
error SimpleName MethodInvocation StringLiteral unable to get trait definition for entity {}
error SimpleName MethodInvocation SimpleName guid
error SimpleName MethodInvocation SimpleName e
unable to get trait definition for entity {} StringLiteral MethodInvocation SimpleName guid
unable to get trait definition for entity {} StringLiteral MethodInvocation SimpleName e
guid SimpleName MethodInvocation SimpleName e
servlets SimpleName MethodInvocation SimpleName get error response
servlets SimpleName MethodInvocation SimpleName e
servlets SimpleName MethodInvocation QualifiedName responsestatusbad request
get error response SimpleName MethodInvocation SimpleName e
get error response SimpleName MethodInvocation QualifiedName responsestatusbad request
e SimpleName MethodInvocation QualifiedName responsestatusbad request
web application exception SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName servlets
web application exception SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get error response
web application exception SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName e
web application exception SimpleName SimpleType ClassInstanceCreation MethodInvocation QualifiedName responsestatusbad request
web application exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
log SimpleName MethodInvocation SimpleName error
log SimpleName MethodInvocation StringLiteral unable to get trait definitions for entity {}
log SimpleName MethodInvocation SimpleName guid
log SimpleName MethodInvocation SimpleName e
error SimpleName MethodInvocation StringLiteral unable to get trait definitions for entity {}
error SimpleName MethodInvocation SimpleName guid
error SimpleName MethodInvocation SimpleName e
unable to get trait definitions for entity {} StringLiteral MethodInvocation SimpleName guid
unable to get trait definitions for entity {} StringLiteral MethodInvocation SimpleName e
guid SimpleName MethodInvocation SimpleName e
throwable SimpleName SimpleType SingleVariableDeclaration SimpleName e
log SimpleName MethodInvocation SimpleName error
log SimpleName MethodInvocation StringLiteral unable to get trait definitions for entity {}
log SimpleName MethodInvocation SimpleName guid
log SimpleName MethodInvocation SimpleName e
error SimpleName MethodInvocation StringLiteral unable to get trait definitions for entity {}
error SimpleName MethodInvocation SimpleName guid
error SimpleName MethodInvocation SimpleName e
unable to get trait definitions for entity {} StringLiteral MethodInvocation SimpleName guid
unable to get trait definitions for entity {} StringLiteral MethodInvocation SimpleName e
guid SimpleName MethodInvocation SimpleName e
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
atlas perf tracer SimpleName MethodInvocation SimpleName log
atlas perf tracer SimpleName MethodInvocation SimpleName perf
log SimpleName MethodInvocation SimpleName perf
log SimpleName MethodInvocation SimpleName is debug enabled
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral <== entity resourceget trait definitions for entity
log SimpleName MethodInvocation SimpleName guid
debug SimpleName MethodInvocation StringLiteral <== entity resourceget trait definitions for entity
debug SimpleName MethodInvocation SimpleName guid
<== entity resourceget trait definitions for entity StringLiteral MethodInvocation SimpleName guid
get SimpleName MarkerAnnotation MethodDeclaration SingleMemberAnnotation SimpleName path
get SimpleName MarkerAnnotation MethodDeclaration SingleMemberAnnotation StringLiteral guidtrait definitions
get SimpleName MarkerAnnotation MethodDeclaration SingleMemberAnnotation SimpleName produces
get SimpleName MarkerAnnotation MethodDeclaration SingleMemberAnnotation QualifiedName servletsjson media type
get SimpleName MarkerAnnotation MethodDeclaration Modifier public
get SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName response
get SimpleName MarkerAnnotation MethodDeclaration SimpleName get trait definitions for entity
path SimpleName SingleMemberAnnotation MethodDeclaration SingleMemberAnnotation SimpleName produces
path SimpleName SingleMemberAnnotation MethodDeclaration SingleMemberAnnotation QualifiedName servletsjson media type
guidtrait definitions StringLiteral SingleMemberAnnotation MethodDeclaration SingleMemberAnnotation SimpleName produces
guidtrait definitions StringLiteral SingleMemberAnnotation MethodDeclaration SingleMemberAnnotation QualifiedName servletsjson media type
path SimpleName SingleMemberAnnotation MethodDeclaration Modifier public
guidtrait definitions StringLiteral SingleMemberAnnotation MethodDeclaration Modifier public
path SimpleName SingleMemberAnnotation MethodDeclaration SimpleType SimpleName response
guidtrait definitions StringLiteral SingleMemberAnnotation MethodDeclaration SimpleType SimpleName response
path SimpleName SingleMemberAnnotation MethodDeclaration SimpleName get trait definitions for entity
guidtrait definitions StringLiteral SingleMemberAnnotation MethodDeclaration SimpleName get trait definitions for entity
path SimpleName SingleMemberAnnotation MethodDeclaration SingleVariableDeclaration SimpleName guid
guidtrait definitions StringLiteral SingleMemberAnnotation MethodDeclaration SingleVariableDeclaration SimpleName guid
produces SimpleName SingleMemberAnnotation MethodDeclaration Modifier public
servletsjson media type QualifiedName SingleMemberAnnotation MethodDeclaration Modifier public
produces SimpleName SingleMemberAnnotation MethodDeclaration SimpleType SimpleName response
servletsjson media type QualifiedName SingleMemberAnnotation MethodDeclaration SimpleType SimpleName response
produces SimpleName SingleMemberAnnotation MethodDeclaration SimpleName get trait definitions for entity
servletsjson media type QualifiedName SingleMemberAnnotation MethodDeclaration SimpleName get trait definitions for entity
produces SimpleName SingleMemberAnnotation MethodDeclaration SingleVariableDeclaration SimpleName guid
servletsjson media type QualifiedName SingleMemberAnnotation MethodDeclaration SingleVariableDeclaration SimpleName guid
public Modifier MethodDeclaration SimpleType SimpleName response
public Modifier MethodDeclaration SimpleName get trait definitions for entity
public Modifier MethodDeclaration SingleVariableDeclaration SingleMemberAnnotation SimpleName path param
public Modifier MethodDeclaration SingleVariableDeclaration SingleMemberAnnotation StringLiteral guid
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName guid
response SimpleName SimpleType MethodDeclaration SimpleName get trait definitions for entity
response SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName guid
get trait definitions for entity SimpleName MethodDeclaration SingleVariableDeclaration SingleMemberAnnotation SimpleName path param
get trait definitions for entity SimpleName MethodDeclaration SingleVariableDeclaration SingleMemberAnnotation StringLiteral guid
get trait definitions for entity SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
get trait definitions for entity SimpleName MethodDeclaration SingleVariableDeclaration SimpleName guid
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName get
public Modifier TypeDeclaration MethodDeclaration SingleMemberAnnotation SimpleName path
public Modifier TypeDeclaration MethodDeclaration SingleMemberAnnotation StringLiteral guidtrait definitions
public Modifier TypeDeclaration MethodDeclaration SingleMemberAnnotation SimpleName produces
public Modifier TypeDeclaration MethodDeclaration SingleMemberAnnotation QualifiedName servletsjson media type
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName response
public Modifier TypeDeclaration MethodDeclaration SimpleName get trait definitions for entity
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName guid
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName get
test SimpleName TypeDeclaration MethodDeclaration SingleMemberAnnotation SimpleName path
test SimpleName TypeDeclaration MethodDeclaration SingleMemberAnnotation StringLiteral guidtrait definitions
test SimpleName TypeDeclaration MethodDeclaration SingleMemberAnnotation SimpleName produces
test SimpleName TypeDeclaration MethodDeclaration SingleMemberAnnotation QualifiedName servletsjson media type
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName response
test SimpleName TypeDeclaration MethodDeclaration SimpleName get trait definitions for entity
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName guid
