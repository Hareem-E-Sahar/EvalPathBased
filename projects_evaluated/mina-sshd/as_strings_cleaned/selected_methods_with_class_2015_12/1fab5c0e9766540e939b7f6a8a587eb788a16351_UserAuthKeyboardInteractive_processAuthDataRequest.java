client session SimpleName SimpleType SingleVariableDeclaration SimpleName session
string SimpleName SimpleType SingleVariableDeclaration SimpleName service
buffer SimpleName SimpleType SingleVariableDeclaration SimpleName buffer
buffer SimpleName MethodInvocation SimpleName get u byte
cmd SimpleName VariableDeclarationFragment MethodInvocation SimpleName buffer
cmd SimpleName VariableDeclarationFragment MethodInvocation SimpleName get u byte
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName cmd
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName buffer
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get u byte
cmd SimpleName InfixExpression QualifiedName ssh constantsssh msg userauth info request
ssh constants SimpleName MethodInvocation SimpleName get command message name
ssh constants SimpleName MethodInvocation SimpleName cmd
get command message name SimpleName MethodInvocation SimpleName cmd
process auth data request StringLiteral InfixExpression SimpleName session
process auth data request StringLiteral InfixExpression StringLiteral )[
process auth data request StringLiteral InfixExpression SimpleName service
process auth data request StringLiteral InfixExpression StringLiteral ]
process auth data request StringLiteral InfixExpression StringLiteral received unknown packet cmd
session SimpleName InfixExpression StringLiteral )[
session SimpleName InfixExpression SimpleName service
session SimpleName InfixExpression StringLiteral ]
session SimpleName InfixExpression StringLiteral received unknown packet cmd
session SimpleName InfixExpression MethodInvocation SimpleName ssh constants
session SimpleName InfixExpression MethodInvocation SimpleName get command message name
session SimpleName InfixExpression MethodInvocation SimpleName cmd
)[ StringLiteral InfixExpression SimpleName service
)[ StringLiteral InfixExpression StringLiteral ]
)[ StringLiteral InfixExpression StringLiteral received unknown packet cmd
)[ StringLiteral InfixExpression MethodInvocation SimpleName ssh constants
)[ StringLiteral InfixExpression MethodInvocation SimpleName get command message name
)[ StringLiteral InfixExpression MethodInvocation SimpleName cmd
service SimpleName InfixExpression StringLiteral ]
service SimpleName InfixExpression StringLiteral received unknown packet cmd
service SimpleName InfixExpression MethodInvocation SimpleName ssh constants
service SimpleName InfixExpression MethodInvocation SimpleName get command message name
service SimpleName InfixExpression MethodInvocation SimpleName cmd
] StringLiteral InfixExpression StringLiteral received unknown packet cmd
] StringLiteral InfixExpression MethodInvocation SimpleName ssh constants
] StringLiteral InfixExpression MethodInvocation SimpleName get command message name
] StringLiteral InfixExpression MethodInvocation SimpleName cmd
received unknown packet cmd StringLiteral InfixExpression MethodInvocation SimpleName ssh constants
received unknown packet cmd StringLiteral InfixExpression MethodInvocation SimpleName get command message name
received unknown packet cmd StringLiteral InfixExpression MethodInvocation SimpleName cmd
illegal state exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral process auth data request
illegal state exception SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName session
illegal state exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral )[
illegal state exception SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName service
illegal state exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral ]
illegal state exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral received unknown packet cmd
request pending SimpleName MethodInvocation SimpleName set
request pending SimpleName MethodInvocation BooleanLiteral false
set SimpleName MethodInvocation BooleanLiteral false
trials count SimpleName MethodInvocation SimpleName increment and get
verify trials count SimpleName MethodInvocation SimpleName session
verify trials count SimpleName MethodInvocation SimpleName service
verify trials count SimpleName MethodInvocation SimpleName cmd
verify trials count SimpleName MethodInvocation MethodInvocation SimpleName trials count
verify trials count SimpleName MethodInvocation MethodInvocation SimpleName increment and get
verify trials count SimpleName MethodInvocation SimpleName max trials
session SimpleName MethodInvocation SimpleName service
session SimpleName MethodInvocation SimpleName cmd
session SimpleName MethodInvocation MethodInvocation SimpleName trials count
session SimpleName MethodInvocation MethodInvocation SimpleName increment and get
session SimpleName MethodInvocation SimpleName max trials
service SimpleName MethodInvocation SimpleName cmd
service SimpleName MethodInvocation MethodInvocation SimpleName trials count
service SimpleName MethodInvocation MethodInvocation SimpleName increment and get
service SimpleName MethodInvocation SimpleName max trials
cmd SimpleName MethodInvocation MethodInvocation SimpleName trials count
cmd SimpleName MethodInvocation MethodInvocation SimpleName increment and get
cmd SimpleName MethodInvocation SimpleName max trials
trials count SimpleName MethodInvocation MethodInvocation SimpleName max trials
increment and get SimpleName MethodInvocation MethodInvocation SimpleName max trials
buffer SimpleName MethodInvocation SimpleName get string
name SimpleName VariableDeclarationFragment MethodInvocation SimpleName buffer
name SimpleName VariableDeclarationFragment MethodInvocation SimpleName get string
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName name
buffer SimpleName MethodInvocation SimpleName get string
instruction SimpleName VariableDeclarationFragment MethodInvocation SimpleName buffer
instruction SimpleName VariableDeclarationFragment MethodInvocation SimpleName get string
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName instruction
buffer SimpleName MethodInvocation SimpleName get string
lang SimpleName VariableDeclarationFragment MethodInvocation SimpleName buffer
lang SimpleName VariableDeclarationFragment MethodInvocation SimpleName get string
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName lang
buffer SimpleName MethodInvocation SimpleName get int
num SimpleName VariableDeclarationFragment MethodInvocation SimpleName buffer
num SimpleName VariableDeclarationFragment MethodInvocation SimpleName get int
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName num
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName buffer
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get int
log SimpleName MethodInvocation SimpleName is debug enabled
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral process auth data request ssh msg userauth info request name instruction language numprompts
log SimpleName MethodInvocation SimpleName session
log SimpleName MethodInvocation SimpleName service
log SimpleName MethodInvocation SimpleName name
debug SimpleName MethodInvocation StringLiteral process auth data request ssh msg userauth info request name instruction language numprompts
debug SimpleName MethodInvocation SimpleName session
debug SimpleName MethodInvocation SimpleName service
debug SimpleName MethodInvocation SimpleName name
debug SimpleName MethodInvocation SimpleName instruction
process auth data request ssh msg userauth info request name instruction language numprompts StringLiteral MethodInvocation SimpleName session
process auth data request ssh msg userauth info request name instruction language numprompts StringLiteral MethodInvocation SimpleName service
process auth data request ssh msg userauth info request name instruction language numprompts StringLiteral MethodInvocation SimpleName name
process auth data request ssh msg userauth info request name instruction language numprompts StringLiteral MethodInvocation SimpleName instruction
process auth data request ssh msg userauth info request name instruction language numprompts StringLiteral MethodInvocation SimpleName lang
session SimpleName MethodInvocation SimpleName service
session SimpleName MethodInvocation SimpleName name
session SimpleName MethodInvocation SimpleName instruction
session SimpleName MethodInvocation SimpleName lang
session SimpleName MethodInvocation SimpleName num
service SimpleName MethodInvocation SimpleName name
service SimpleName MethodInvocation SimpleName instruction
service SimpleName MethodInvocation SimpleName lang
service SimpleName MethodInvocation SimpleName num
name SimpleName MethodInvocation SimpleName instruction
name SimpleName MethodInvocation SimpleName lang
name SimpleName MethodInvocation SimpleName num
instruction SimpleName MethodInvocation SimpleName lang
instruction SimpleName MethodInvocation SimpleName num
lang SimpleName MethodInvocation SimpleName num
string SimpleName SimpleType ArrayType ArrayCreation SimpleName num
prompt SimpleName VariableDeclarationFragment ArrayCreation SimpleName num
boolean PrimitiveType ArrayType ArrayCreation SimpleName num
echo SimpleName VariableDeclarationFragment ArrayCreation ArrayType PrimitiveType boolean
echo SimpleName VariableDeclarationFragment ArrayCreation SimpleName num
boolean PrimitiveType ArrayType VariableDeclarationStatement VariableDeclarationFragment SimpleName echo
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression SimpleName num
prompt SimpleName ArrayAccess SimpleName i
buffer SimpleName MethodInvocation SimpleName get string
prompt SimpleName ArrayAccess Assignment MethodInvocation SimpleName buffer
prompt SimpleName ArrayAccess Assignment MethodInvocation SimpleName get string
i SimpleName ArrayAccess Assignment MethodInvocation SimpleName buffer
i SimpleName ArrayAccess Assignment MethodInvocation SimpleName get string
echo SimpleName ArrayAccess SimpleName i
buffer SimpleName MethodInvocation SimpleName get boolean
echo SimpleName ArrayAccess Assignment MethodInvocation SimpleName buffer
echo SimpleName ArrayAccess Assignment MethodInvocation SimpleName get boolean
i SimpleName ArrayAccess Assignment MethodInvocation SimpleName buffer
i SimpleName ArrayAccess Assignment MethodInvocation SimpleName get boolean
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName num
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
num SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
log SimpleName MethodInvocation SimpleName is trace enabled
arrays SimpleName MethodInvocation SimpleName to string
arrays SimpleName MethodInvocation SimpleName prompt
to string SimpleName MethodInvocation SimpleName prompt
log SimpleName MethodInvocation SimpleName trace
log SimpleName MethodInvocation StringLiteral process auth data request prompt {}
log SimpleName MethodInvocation SimpleName session
log SimpleName MethodInvocation SimpleName service
log SimpleName MethodInvocation MethodInvocation SimpleName arrays
log SimpleName MethodInvocation MethodInvocation SimpleName to string
log SimpleName MethodInvocation MethodInvocation SimpleName prompt
trace SimpleName MethodInvocation StringLiteral process auth data request prompt {}
trace SimpleName MethodInvocation SimpleName session
trace SimpleName MethodInvocation SimpleName service
trace SimpleName MethodInvocation MethodInvocation SimpleName arrays
trace SimpleName MethodInvocation MethodInvocation SimpleName to string
trace SimpleName MethodInvocation MethodInvocation SimpleName prompt
process auth data request prompt {} StringLiteral MethodInvocation SimpleName session
process auth data request prompt {} StringLiteral MethodInvocation SimpleName service
process auth data request prompt {} StringLiteral MethodInvocation MethodInvocation SimpleName arrays
process auth data request prompt {} StringLiteral MethodInvocation MethodInvocation SimpleName to string
process auth data request prompt {} StringLiteral MethodInvocation MethodInvocation SimpleName prompt
session SimpleName MethodInvocation SimpleName service
session SimpleName MethodInvocation MethodInvocation SimpleName arrays
session SimpleName MethodInvocation MethodInvocation SimpleName to string
session SimpleName MethodInvocation MethodInvocation SimpleName prompt
service SimpleName MethodInvocation MethodInvocation SimpleName arrays
service SimpleName MethodInvocation MethodInvocation SimpleName to string
service SimpleName MethodInvocation MethodInvocation SimpleName prompt
arrays SimpleName MethodInvocation SimpleName to string
arrays SimpleName MethodInvocation SimpleName echo
to string SimpleName MethodInvocation SimpleName echo
log SimpleName MethodInvocation SimpleName trace
log SimpleName MethodInvocation StringLiteral process auth data request echo {}
log SimpleName MethodInvocation SimpleName session
log SimpleName MethodInvocation SimpleName service
log SimpleName MethodInvocation MethodInvocation SimpleName arrays
log SimpleName MethodInvocation MethodInvocation SimpleName to string
log SimpleName MethodInvocation MethodInvocation SimpleName echo
trace SimpleName MethodInvocation StringLiteral process auth data request echo {}
trace SimpleName MethodInvocation SimpleName session
trace SimpleName MethodInvocation SimpleName service
trace SimpleName MethodInvocation MethodInvocation SimpleName arrays
trace SimpleName MethodInvocation MethodInvocation SimpleName to string
trace SimpleName MethodInvocation MethodInvocation SimpleName echo
process auth data request echo {} StringLiteral MethodInvocation SimpleName session
process auth data request echo {} StringLiteral MethodInvocation SimpleName service
process auth data request echo {} StringLiteral MethodInvocation MethodInvocation SimpleName arrays
process auth data request echo {} StringLiteral MethodInvocation MethodInvocation SimpleName to string
process auth data request echo {} StringLiteral MethodInvocation MethodInvocation SimpleName echo
session SimpleName MethodInvocation SimpleName service
session SimpleName MethodInvocation MethodInvocation SimpleName arrays
session SimpleName MethodInvocation MethodInvocation SimpleName to string
session SimpleName MethodInvocation MethodInvocation SimpleName echo
service SimpleName MethodInvocation MethodInvocation SimpleName arrays
service SimpleName MethodInvocation MethodInvocation SimpleName to string
service SimpleName MethodInvocation MethodInvocation SimpleName echo
get user responses SimpleName MethodInvocation SimpleName name
get user responses SimpleName MethodInvocation SimpleName instruction
get user responses SimpleName MethodInvocation SimpleName lang
get user responses SimpleName MethodInvocation SimpleName prompt
get user responses SimpleName MethodInvocation SimpleName echo
name SimpleName MethodInvocation SimpleName instruction
name SimpleName MethodInvocation SimpleName lang
name SimpleName MethodInvocation SimpleName prompt
name SimpleName MethodInvocation SimpleName echo
instruction SimpleName MethodInvocation SimpleName lang
instruction SimpleName MethodInvocation SimpleName prompt
instruction SimpleName MethodInvocation SimpleName echo
lang SimpleName MethodInvocation SimpleName prompt
lang SimpleName MethodInvocation SimpleName echo
prompt SimpleName MethodInvocation SimpleName echo
rep SimpleName VariableDeclarationFragment MethodInvocation SimpleName get user responses
rep SimpleName VariableDeclarationFragment MethodInvocation SimpleName name
rep SimpleName VariableDeclarationFragment MethodInvocation SimpleName instruction
rep SimpleName VariableDeclarationFragment MethodInvocation SimpleName lang
rep SimpleName VariableDeclarationFragment MethodInvocation SimpleName prompt
rep SimpleName VariableDeclarationFragment MethodInvocation SimpleName echo
log SimpleName MethodInvocation SimpleName is debug enabled
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral process auth data request no responses for {}
log SimpleName MethodInvocation SimpleName session
log SimpleName MethodInvocation SimpleName service
log SimpleName MethodInvocation SimpleName name
debug SimpleName MethodInvocation StringLiteral process auth data request no responses for {}
debug SimpleName MethodInvocation SimpleName session
debug SimpleName MethodInvocation SimpleName service
debug SimpleName MethodInvocation SimpleName name
process auth data request no responses for {} StringLiteral MethodInvocation SimpleName session
process auth data request no responses for {} StringLiteral MethodInvocation SimpleName service
process auth data request no responses for {} StringLiteral MethodInvocation SimpleName name
session SimpleName MethodInvocation SimpleName service
session SimpleName MethodInvocation SimpleName name
service SimpleName MethodInvocation SimpleName name
num SimpleName InfixExpression QualifiedName replength
log SimpleName MethodInvocation SimpleName warn
log SimpleName MethodInvocation StringLiteral process auth data request mismatched prompts ({}) vs responses count ({})
log SimpleName MethodInvocation SimpleName session
log SimpleName MethodInvocation SimpleName service
log SimpleName MethodInvocation SimpleName num
warn SimpleName MethodInvocation StringLiteral process auth data request mismatched prompts ({}) vs responses count ({})
warn SimpleName MethodInvocation SimpleName session
warn SimpleName MethodInvocation SimpleName service
warn SimpleName MethodInvocation SimpleName num
warn SimpleName MethodInvocation QualifiedName replength
process auth data request mismatched prompts ({}) vs responses count ({}) StringLiteral MethodInvocation SimpleName session
process auth data request mismatched prompts ({}) vs responses count ({}) StringLiteral MethodInvocation SimpleName service
process auth data request mismatched prompts ({}) vs responses count ({}) StringLiteral MethodInvocation SimpleName num
process auth data request mismatched prompts ({}) vs responses count ({}) StringLiteral MethodInvocation QualifiedName replength
session SimpleName MethodInvocation SimpleName service
session SimpleName MethodInvocation SimpleName num
session SimpleName MethodInvocation QualifiedName replength
service SimpleName MethodInvocation SimpleName num
service SimpleName MethodInvocation QualifiedName replength
num SimpleName MethodInvocation QualifiedName replength
buffer utils SimpleName MethodInvocation SimpleName clear
buffer utils SimpleName MethodInvocation SimpleName buffer
clear SimpleName MethodInvocation SimpleName buffer
session SimpleName MethodInvocation SimpleName prepare buffer
session SimpleName MethodInvocation QualifiedName ssh constantsssh msg userauth info response
session SimpleName MethodInvocation MethodInvocation SimpleName buffer utils
session SimpleName MethodInvocation MethodInvocation SimpleName clear
session SimpleName MethodInvocation MethodInvocation SimpleName buffer
prepare buffer SimpleName MethodInvocation QualifiedName ssh constantsssh msg userauth info response
prepare buffer SimpleName MethodInvocation MethodInvocation SimpleName buffer utils
prepare buffer SimpleName MethodInvocation MethodInvocation SimpleName clear
prepare buffer SimpleName MethodInvocation MethodInvocation SimpleName buffer
ssh constantsssh msg userauth info response QualifiedName MethodInvocation MethodInvocation SimpleName buffer utils
ssh constantsssh msg userauth info response QualifiedName MethodInvocation MethodInvocation SimpleName clear
ssh constantsssh msg userauth info response QualifiedName MethodInvocation MethodInvocation SimpleName buffer
buffer SimpleName Assignment MethodInvocation SimpleName session
buffer SimpleName Assignment MethodInvocation SimpleName prepare buffer
buffer SimpleName Assignment MethodInvocation QualifiedName ssh constantsssh msg userauth info response
buffer SimpleName Assignment MethodInvocation MethodInvocation SimpleName buffer utils
buffer SimpleName Assignment MethodInvocation MethodInvocation SimpleName clear
buffer SimpleName Assignment MethodInvocation MethodInvocation SimpleName buffer
buffer SimpleName MethodInvocation SimpleName put int
buffer SimpleName MethodInvocation QualifiedName replength
put int SimpleName MethodInvocation QualifiedName replength
index SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName index
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
index SimpleName InfixExpression QualifiedName replength
rep SimpleName ArrayAccess SimpleName index
r SimpleName VariableDeclarationFragment ArrayAccess SimpleName rep
r SimpleName VariableDeclarationFragment ArrayAccess SimpleName index
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName r
log SimpleName MethodInvocation SimpleName is trace enabled
index SimpleName InfixExpression NumberLiteral empty
log SimpleName MethodInvocation SimpleName trace
log SimpleName MethodInvocation StringLiteral process auth data request response #{}: {}
log SimpleName MethodInvocation SimpleName session
log SimpleName MethodInvocation SimpleName service
log SimpleName MethodInvocation InfixExpression SimpleName index
log SimpleName MethodInvocation InfixExpression NumberLiteral empty
trace SimpleName MethodInvocation StringLiteral process auth data request response #{}: {}
trace SimpleName MethodInvocation SimpleName session
trace SimpleName MethodInvocation SimpleName service
trace SimpleName MethodInvocation InfixExpression SimpleName index
trace SimpleName MethodInvocation InfixExpression NumberLiteral empty
trace SimpleName MethodInvocation SimpleName r
process auth data request response #{}: {} StringLiteral MethodInvocation SimpleName session
process auth data request response #{}: {} StringLiteral MethodInvocation SimpleName service
process auth data request response #{}: {} StringLiteral MethodInvocation InfixExpression SimpleName index
process auth data request response #{}: {} StringLiteral MethodInvocation InfixExpression NumberLiteral empty
process auth data request response #{}: {} StringLiteral MethodInvocation SimpleName r
session SimpleName MethodInvocation SimpleName service
session SimpleName MethodInvocation InfixExpression SimpleName index
session SimpleName MethodInvocation InfixExpression NumberLiteral empty
session SimpleName MethodInvocation SimpleName r
service SimpleName MethodInvocation InfixExpression SimpleName index
service SimpleName MethodInvocation InfixExpression NumberLiteral empty
service SimpleName MethodInvocation SimpleName r
index SimpleName InfixExpression MethodInvocation SimpleName r
empty NumberLiteral InfixExpression MethodInvocation SimpleName r
buffer SimpleName MethodInvocation SimpleName put string
buffer SimpleName MethodInvocation SimpleName r
put string SimpleName MethodInvocation SimpleName r
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName index
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression QualifiedName replength
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName index
index SimpleName InfixExpression ForStatement PostfixExpression SimpleName index
replength QualifiedName InfixExpression ForStatement PostfixExpression SimpleName index
session SimpleName MethodInvocation SimpleName write packet
session SimpleName MethodInvocation SimpleName buffer
write packet SimpleName MethodInvocation SimpleName buffer
override SimpleName MarkerAnnotation MethodDeclaration Modifier protected
override SimpleName MarkerAnnotation MethodDeclaration PrimitiveType boolean
override SimpleName MarkerAnnotation MethodDeclaration SimpleName process auth data request
override SimpleName MarkerAnnotation MethodDeclaration SingleVariableDeclaration SimpleName session
override SimpleName MarkerAnnotation MethodDeclaration SingleVariableDeclaration SimpleName service
protected Modifier MethodDeclaration PrimitiveType boolean
protected Modifier MethodDeclaration SimpleName process auth data request
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName client session
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleName session
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleName service
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName buffer
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleName buffer
boolean PrimitiveType MethodDeclaration SimpleName process auth data request
boolean PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName client session
boolean PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName session
boolean PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
boolean PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName service
boolean PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName buffer
boolean PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName buffer
boolean PrimitiveType MethodDeclaration SimpleType SimpleName exception
process auth data request SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName client session
process auth data request SimpleName MethodDeclaration SingleVariableDeclaration SimpleName session
process auth data request SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
process auth data request SimpleName MethodDeclaration SingleVariableDeclaration SimpleName service
process auth data request SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName buffer
process auth data request SimpleName MethodDeclaration SingleVariableDeclaration SimpleName buffer
process auth data request SimpleName MethodDeclaration SimpleType SimpleName exception
process auth data request SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
process auth data request SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
process auth data request SimpleName MethodDeclaration Block ReturnStatement BooleanLiteral true
session SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName service
session SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName buffer
session SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
service SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName buffer
service SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
buffer SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName override
public Modifier TypeDeclaration MethodDeclaration Modifier protected
public Modifier TypeDeclaration MethodDeclaration PrimitiveType boolean
public Modifier TypeDeclaration MethodDeclaration SimpleName process auth data request
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName session
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName service
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName buffer
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName override
test SimpleName TypeDeclaration MethodDeclaration Modifier protected
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType boolean
test SimpleName TypeDeclaration MethodDeclaration SimpleName process auth data request
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName session
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName service
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName buffer
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
