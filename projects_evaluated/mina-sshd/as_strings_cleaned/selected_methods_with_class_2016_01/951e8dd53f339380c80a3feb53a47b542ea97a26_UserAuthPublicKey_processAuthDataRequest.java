client session SimpleName SimpleType SingleVariableDeclaration SimpleName session
string SimpleName SimpleType SingleVariableDeclaration SimpleName service
buffer SimpleName SimpleType SingleVariableDeclaration SimpleName buffer
name SimpleName VariableDeclarationFragment MethodInvocation SimpleName get name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName name
buffer SimpleName MethodInvocation SimpleName get u byte
cmd SimpleName VariableDeclarationFragment MethodInvocation SimpleName buffer
cmd SimpleName VariableDeclarationFragment MethodInvocation SimpleName get u byte
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName cmd
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName buffer
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get u byte
cmd SimpleName InfixExpression QualifiedName ssh constantsssh msg userauth pk ok
ssh constants SimpleName MethodInvocation SimpleName get command message name
ssh constants SimpleName MethodInvocation SimpleName cmd
get command message name SimpleName MethodInvocation SimpleName cmd
process auth data request StringLiteral InfixExpression SimpleName session
process auth data request StringLiteral InfixExpression StringLiteral )[
process auth data request StringLiteral InfixExpression SimpleName service
process auth data request StringLiteral InfixExpression StringLiteral ][
process auth data request StringLiteral InfixExpression SimpleName name
session SimpleName InfixExpression StringLiteral )[
session SimpleName InfixExpression SimpleName service
session SimpleName InfixExpression StringLiteral ][
session SimpleName InfixExpression SimpleName name
session SimpleName InfixExpression StringLiteral ]
)[ StringLiteral InfixExpression SimpleName service
)[ StringLiteral InfixExpression StringLiteral ][
)[ StringLiteral InfixExpression SimpleName name
)[ StringLiteral InfixExpression StringLiteral ]
)[ StringLiteral InfixExpression StringLiteral received unknown packet cmd
service SimpleName InfixExpression StringLiteral ][
service SimpleName InfixExpression SimpleName name
service SimpleName InfixExpression StringLiteral ]
service SimpleName InfixExpression StringLiteral received unknown packet cmd
service SimpleName InfixExpression MethodInvocation SimpleName ssh constants
service SimpleName InfixExpression MethodInvocation SimpleName get command message name
service SimpleName InfixExpression MethodInvocation SimpleName cmd
][ StringLiteral InfixExpression SimpleName name
][ StringLiteral InfixExpression StringLiteral ]
][ StringLiteral InfixExpression StringLiteral received unknown packet cmd
][ StringLiteral InfixExpression MethodInvocation SimpleName ssh constants
][ StringLiteral InfixExpression MethodInvocation SimpleName get command message name
][ StringLiteral InfixExpression MethodInvocation SimpleName cmd
name SimpleName InfixExpression StringLiteral ]
name SimpleName InfixExpression StringLiteral received unknown packet cmd
name SimpleName InfixExpression MethodInvocation SimpleName ssh constants
name SimpleName InfixExpression MethodInvocation SimpleName get command message name
name SimpleName InfixExpression MethodInvocation SimpleName cmd
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
illegal state exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral ][
illegal state exception SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName name
illegal state exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral ]
illegal state exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral received unknown packet cmd
current SimpleName MethodInvocation SimpleName get public key
key SimpleName VariableDeclarationFragment MethodInvocation SimpleName current
key SimpleName VariableDeclarationFragment MethodInvocation SimpleName get public key
public key SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName key
key utils SimpleName MethodInvocation SimpleName get key type
key utils SimpleName MethodInvocation SimpleName key
get key type SimpleName MethodInvocation SimpleName key
algo SimpleName VariableDeclarationFragment MethodInvocation SimpleName key utils
algo SimpleName VariableDeclarationFragment MethodInvocation SimpleName get key type
algo SimpleName VariableDeclarationFragment MethodInvocation SimpleName key
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName algo
buffer SimpleName MethodInvocation SimpleName get string
rsp key type SimpleName VariableDeclarationFragment MethodInvocation SimpleName buffer
rsp key type SimpleName VariableDeclarationFragment MethodInvocation SimpleName get string
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName rsp key type
rsp key type SimpleName MethodInvocation SimpleName equals
rsp key type SimpleName MethodInvocation SimpleName algo
equals SimpleName MethodInvocation SimpleName algo
process auth data request StringLiteral InfixExpression SimpleName session
process auth data request StringLiteral InfixExpression StringLiteral )[
process auth data request StringLiteral InfixExpression SimpleName service
process auth data request StringLiteral InfixExpression StringLiteral ][
process auth data request StringLiteral InfixExpression SimpleName name
session SimpleName InfixExpression StringLiteral )[
session SimpleName InfixExpression SimpleName service
session SimpleName InfixExpression StringLiteral ][
session SimpleName InfixExpression SimpleName name
session SimpleName InfixExpression StringLiteral ]
)[ StringLiteral InfixExpression SimpleName service
)[ StringLiteral InfixExpression StringLiteral ][
)[ StringLiteral InfixExpression SimpleName name
)[ StringLiteral InfixExpression StringLiteral ]
)[ StringLiteral InfixExpression StringLiteral mismatched key types expected
service SimpleName InfixExpression StringLiteral ][
service SimpleName InfixExpression SimpleName name
service SimpleName InfixExpression StringLiteral ]
service SimpleName InfixExpression StringLiteral mismatched key types expected
service SimpleName InfixExpression SimpleName algo
][ StringLiteral InfixExpression SimpleName name
][ StringLiteral InfixExpression StringLiteral ]
][ StringLiteral InfixExpression StringLiteral mismatched key types expected
][ StringLiteral InfixExpression SimpleName algo
][ StringLiteral InfixExpression StringLiteral actual
name SimpleName InfixExpression StringLiteral ]
name SimpleName InfixExpression StringLiteral mismatched key types expected
name SimpleName InfixExpression SimpleName algo
name SimpleName InfixExpression StringLiteral actual
name SimpleName InfixExpression SimpleName rsp key type
] StringLiteral InfixExpression StringLiteral mismatched key types expected
] StringLiteral InfixExpression SimpleName algo
] StringLiteral InfixExpression StringLiteral actual
] StringLiteral InfixExpression SimpleName rsp key type
mismatched key types expected StringLiteral InfixExpression SimpleName algo
mismatched key types expected StringLiteral InfixExpression StringLiteral actual
mismatched key types expected StringLiteral InfixExpression SimpleName rsp key type
algo SimpleName InfixExpression StringLiteral actual
algo SimpleName InfixExpression SimpleName rsp key type
actual StringLiteral InfixExpression SimpleName rsp key type
invalid key spec exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral process auth data request
invalid key spec exception SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName session
invalid key spec exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral )[
invalid key spec exception SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName service
invalid key spec exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral ][
invalid key spec exception SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName name
invalid key spec exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral ]
invalid key spec exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral mismatched key types expected
invalid key spec exception SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName algo
invalid key spec exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral actual
invalid key spec exception SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName rsp key type
buffer SimpleName MethodInvocation SimpleName get public key
rsp key SimpleName VariableDeclarationFragment MethodInvocation SimpleName buffer
rsp key SimpleName VariableDeclarationFragment MethodInvocation SimpleName get public key
public key SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName rsp key
key utils SimpleName MethodInvocation SimpleName compare keys
key utils SimpleName MethodInvocation SimpleName rsp key
key utils SimpleName MethodInvocation SimpleName key
compare keys SimpleName MethodInvocation SimpleName rsp key
compare keys SimpleName MethodInvocation SimpleName key
rsp key SimpleName MethodInvocation SimpleName key
key utils SimpleName MethodInvocation SimpleName get finger print
key utils SimpleName MethodInvocation SimpleName key
get finger print SimpleName MethodInvocation SimpleName key
key utils SimpleName MethodInvocation SimpleName get finger print
key utils SimpleName MethodInvocation SimpleName rsp key
get finger print SimpleName MethodInvocation SimpleName rsp key
process auth data request StringLiteral InfixExpression SimpleName session
process auth data request StringLiteral InfixExpression StringLiteral )[
process auth data request StringLiteral InfixExpression SimpleName service
process auth data request StringLiteral InfixExpression StringLiteral ][
process auth data request StringLiteral InfixExpression SimpleName name
session SimpleName InfixExpression StringLiteral )[
session SimpleName InfixExpression SimpleName service
session SimpleName InfixExpression StringLiteral ][
session SimpleName InfixExpression SimpleName name
session SimpleName InfixExpression StringLiteral ]
)[ StringLiteral InfixExpression SimpleName service
)[ StringLiteral InfixExpression StringLiteral ][
)[ StringLiteral InfixExpression SimpleName name
)[ StringLiteral InfixExpression StringLiteral ]
)[ StringLiteral InfixExpression StringLiteral mismatched
service SimpleName InfixExpression StringLiteral ][
service SimpleName InfixExpression SimpleName name
service SimpleName InfixExpression StringLiteral ]
service SimpleName InfixExpression StringLiteral mismatched
service SimpleName InfixExpression SimpleName algo
][ StringLiteral InfixExpression SimpleName name
][ StringLiteral InfixExpression StringLiteral ]
][ StringLiteral InfixExpression StringLiteral mismatched
][ StringLiteral InfixExpression SimpleName algo
][ StringLiteral InfixExpression StringLiteral keys expected
name SimpleName InfixExpression StringLiteral ]
name SimpleName InfixExpression StringLiteral mismatched
name SimpleName InfixExpression SimpleName algo
name SimpleName InfixExpression StringLiteral keys expected
name SimpleName InfixExpression MethodInvocation SimpleName key utils
name SimpleName InfixExpression MethodInvocation SimpleName get finger print
name SimpleName InfixExpression MethodInvocation SimpleName key
] StringLiteral InfixExpression StringLiteral mismatched
] StringLiteral InfixExpression SimpleName algo
] StringLiteral InfixExpression StringLiteral keys expected
] StringLiteral InfixExpression MethodInvocation SimpleName key utils
] StringLiteral InfixExpression MethodInvocation SimpleName get finger print
] StringLiteral InfixExpression MethodInvocation SimpleName key
] StringLiteral InfixExpression StringLiteral actual
mismatched StringLiteral InfixExpression SimpleName algo
mismatched StringLiteral InfixExpression StringLiteral keys expected
mismatched StringLiteral InfixExpression MethodInvocation SimpleName key utils
mismatched StringLiteral InfixExpression MethodInvocation SimpleName get finger print
mismatched StringLiteral InfixExpression MethodInvocation SimpleName key
mismatched StringLiteral InfixExpression StringLiteral actual
mismatched StringLiteral InfixExpression MethodInvocation SimpleName key utils
mismatched StringLiteral InfixExpression MethodInvocation SimpleName get finger print
mismatched StringLiteral InfixExpression MethodInvocation SimpleName rsp key
algo SimpleName InfixExpression StringLiteral keys expected
algo SimpleName InfixExpression MethodInvocation SimpleName key utils
algo SimpleName InfixExpression MethodInvocation SimpleName get finger print
algo SimpleName InfixExpression MethodInvocation SimpleName key
algo SimpleName InfixExpression StringLiteral actual
algo SimpleName InfixExpression MethodInvocation SimpleName key utils
algo SimpleName InfixExpression MethodInvocation SimpleName get finger print
algo SimpleName InfixExpression MethodInvocation SimpleName rsp key
keys expected StringLiteral InfixExpression MethodInvocation SimpleName key utils
keys expected StringLiteral InfixExpression MethodInvocation SimpleName get finger print
keys expected StringLiteral InfixExpression MethodInvocation SimpleName key
keys expected StringLiteral InfixExpression StringLiteral actual
keys expected StringLiteral InfixExpression MethodInvocation SimpleName key utils
keys expected StringLiteral InfixExpression MethodInvocation SimpleName get finger print
keys expected StringLiteral InfixExpression MethodInvocation SimpleName rsp key
key utils SimpleName MethodInvocation InfixExpression StringLiteral actual
get finger print SimpleName MethodInvocation InfixExpression StringLiteral actual
key SimpleName MethodInvocation InfixExpression StringLiteral actual
key utils SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName key utils
key utils SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get finger print
key utils SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName rsp key
get finger print SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName key utils
get finger print SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get finger print
get finger print SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName rsp key
key SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName key utils
key SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get finger print
key SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName rsp key
actual StringLiteral InfixExpression MethodInvocation SimpleName key utils
actual StringLiteral InfixExpression MethodInvocation SimpleName get finger print
actual StringLiteral InfixExpression MethodInvocation SimpleName rsp key
invalid key spec exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral process auth data request
invalid key spec exception SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName session
invalid key spec exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral )[
invalid key spec exception SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName service
invalid key spec exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral ][
invalid key spec exception SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName name
invalid key spec exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral ]
invalid key spec exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral mismatched
invalid key spec exception SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName algo
invalid key spec exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral keys expected
invalid key spec exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral actual
log SimpleName MethodInvocation SimpleName is debug enabled
key utils SimpleName MethodInvocation SimpleName get finger print
key utils SimpleName MethodInvocation SimpleName rsp key
get finger print SimpleName MethodInvocation SimpleName rsp key
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral process auth data request ssh msg userauth pk ok type fingerprint
log SimpleName MethodInvocation SimpleName session
log SimpleName MethodInvocation SimpleName service
log SimpleName MethodInvocation SimpleName name
debug SimpleName MethodInvocation StringLiteral process auth data request ssh msg userauth pk ok type fingerprint
debug SimpleName MethodInvocation SimpleName session
debug SimpleName MethodInvocation SimpleName service
debug SimpleName MethodInvocation SimpleName name
debug SimpleName MethodInvocation SimpleName rsp key type
process auth data request ssh msg userauth pk ok type fingerprint StringLiteral MethodInvocation SimpleName session
process auth data request ssh msg userauth pk ok type fingerprint StringLiteral MethodInvocation SimpleName service
process auth data request ssh msg userauth pk ok type fingerprint StringLiteral MethodInvocation SimpleName name
process auth data request ssh msg userauth pk ok type fingerprint StringLiteral MethodInvocation SimpleName rsp key type
process auth data request ssh msg userauth pk ok type fingerprint StringLiteral MethodInvocation MethodInvocation SimpleName key utils
process auth data request ssh msg userauth pk ok type fingerprint StringLiteral MethodInvocation MethodInvocation SimpleName get finger print
process auth data request ssh msg userauth pk ok type fingerprint StringLiteral MethodInvocation MethodInvocation SimpleName rsp key
session SimpleName MethodInvocation SimpleName service
session SimpleName MethodInvocation SimpleName name
session SimpleName MethodInvocation SimpleName rsp key type
session SimpleName MethodInvocation MethodInvocation SimpleName key utils
session SimpleName MethodInvocation MethodInvocation SimpleName get finger print
session SimpleName MethodInvocation MethodInvocation SimpleName rsp key
service SimpleName MethodInvocation SimpleName name
service SimpleName MethodInvocation SimpleName rsp key type
service SimpleName MethodInvocation MethodInvocation SimpleName key utils
service SimpleName MethodInvocation MethodInvocation SimpleName get finger print
service SimpleName MethodInvocation MethodInvocation SimpleName rsp key
name SimpleName MethodInvocation SimpleName rsp key type
name SimpleName MethodInvocation MethodInvocation SimpleName key utils
name SimpleName MethodInvocation MethodInvocation SimpleName get finger print
name SimpleName MethodInvocation MethodInvocation SimpleName rsp key
rsp key type SimpleName MethodInvocation MethodInvocation SimpleName key utils
rsp key type SimpleName MethodInvocation MethodInvocation SimpleName get finger print
rsp key type SimpleName MethodInvocation MethodInvocation SimpleName rsp key
session SimpleName MethodInvocation SimpleName get username
username SimpleName VariableDeclarationFragment MethodInvocation SimpleName session
username SimpleName VariableDeclarationFragment MethodInvocation SimpleName get username
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName username
buffer utils SimpleName MethodInvocation SimpleName clear
buffer utils SimpleName MethodInvocation SimpleName buffer
clear SimpleName MethodInvocation SimpleName buffer
session SimpleName MethodInvocation SimpleName prepare buffer
session SimpleName MethodInvocation QualifiedName ssh constantsssh msg userauth request
session SimpleName MethodInvocation MethodInvocation SimpleName buffer utils
session SimpleName MethodInvocation MethodInvocation SimpleName clear
session SimpleName MethodInvocation MethodInvocation SimpleName buffer
prepare buffer SimpleName MethodInvocation QualifiedName ssh constantsssh msg userauth request
prepare buffer SimpleName MethodInvocation MethodInvocation SimpleName buffer utils
prepare buffer SimpleName MethodInvocation MethodInvocation SimpleName clear
prepare buffer SimpleName MethodInvocation MethodInvocation SimpleName buffer
ssh constantsssh msg userauth request QualifiedName MethodInvocation MethodInvocation SimpleName buffer utils
ssh constantsssh msg userauth request QualifiedName MethodInvocation MethodInvocation SimpleName clear
ssh constantsssh msg userauth request QualifiedName MethodInvocation MethodInvocation SimpleName buffer
buffer SimpleName Assignment MethodInvocation SimpleName session
buffer SimpleName Assignment MethodInvocation SimpleName prepare buffer
buffer SimpleName Assignment MethodInvocation QualifiedName ssh constantsssh msg userauth request
buffer SimpleName Assignment MethodInvocation MethodInvocation SimpleName buffer utils
buffer SimpleName Assignment MethodInvocation MethodInvocation SimpleName clear
buffer SimpleName Assignment MethodInvocation MethodInvocation SimpleName buffer
buffer SimpleName MethodInvocation SimpleName put string
buffer SimpleName MethodInvocation SimpleName username
put string SimpleName MethodInvocation SimpleName username
buffer SimpleName MethodInvocation SimpleName put string
buffer SimpleName MethodInvocation SimpleName service
put string SimpleName MethodInvocation SimpleName service
buffer SimpleName MethodInvocation SimpleName put string
buffer SimpleName MethodInvocation SimpleName name
put string SimpleName MethodInvocation SimpleName name
buffer SimpleName MethodInvocation SimpleName put boolean
buffer SimpleName MethodInvocation BooleanLiteral true
put boolean SimpleName MethodInvocation BooleanLiteral true
buffer SimpleName MethodInvocation SimpleName put string
buffer SimpleName MethodInvocation SimpleName algo
put string SimpleName MethodInvocation SimpleName algo
buffer SimpleName MethodInvocation SimpleName put public key
buffer SimpleName MethodInvocation SimpleName key
put public key SimpleName MethodInvocation SimpleName key
append signature SimpleName MethodInvocation SimpleName session
append signature SimpleName MethodInvocation SimpleName service
append signature SimpleName MethodInvocation SimpleName name
append signature SimpleName MethodInvocation SimpleName username
append signature SimpleName MethodInvocation SimpleName algo
session SimpleName MethodInvocation SimpleName service
session SimpleName MethodInvocation SimpleName name
session SimpleName MethodInvocation SimpleName username
session SimpleName MethodInvocation SimpleName algo
session SimpleName MethodInvocation SimpleName key
service SimpleName MethodInvocation SimpleName name
service SimpleName MethodInvocation SimpleName username
service SimpleName MethodInvocation SimpleName algo
service SimpleName MethodInvocation SimpleName key
service SimpleName MethodInvocation SimpleName buffer
name SimpleName MethodInvocation SimpleName username
name SimpleName MethodInvocation SimpleName algo
name SimpleName MethodInvocation SimpleName key
name SimpleName MethodInvocation SimpleName buffer
username SimpleName MethodInvocation SimpleName algo
username SimpleName MethodInvocation SimpleName key
username SimpleName MethodInvocation SimpleName buffer
algo SimpleName MethodInvocation SimpleName key
algo SimpleName MethodInvocation SimpleName buffer
key SimpleName MethodInvocation SimpleName buffer
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
