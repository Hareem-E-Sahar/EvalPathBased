string SimpleName SimpleType SingleVariableDeclaration SimpleName request
boolean PrimitiveType SingleVariableDeclaration SimpleName want reply
system SimpleName MethodInvocation SimpleName current time millis
date SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName system
date SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName current time millis
pending SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName date
pending SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName system
pending SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName current time millis
date SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName pending
pending requests SimpleName MethodInvocation SimpleName put
pending requests SimpleName MethodInvocation SimpleName request
pending requests SimpleName MethodInvocation SimpleName pending
put SimpleName MethodInvocation SimpleName request
put SimpleName MethodInvocation SimpleName pending
request SimpleName MethodInvocation SimpleName pending
prev SimpleName VariableDeclarationFragment MethodInvocation SimpleName pending requests
prev SimpleName VariableDeclarationFragment MethodInvocation SimpleName put
prev SimpleName VariableDeclarationFragment MethodInvocation SimpleName request
prev SimpleName VariableDeclarationFragment MethodInvocation SimpleName pending
date SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName prev
validate utils SimpleName MethodInvocation SimpleName check true
validate utils SimpleName MethodInvocation InfixExpression SimpleName prev
validate utils SimpleName MethodInvocation StringLiteral multiple pending requests of types
validate utils SimpleName MethodInvocation SimpleName request
check true SimpleName MethodInvocation InfixExpression SimpleName prev
check true SimpleName MethodInvocation StringLiteral multiple pending requests of types
check true SimpleName MethodInvocation SimpleName request
prev SimpleName InfixExpression MethodInvocation StringLiteral multiple pending requests of types
prev SimpleName InfixExpression MethodInvocation SimpleName request
multiple pending requests of types StringLiteral MethodInvocation SimpleName request
log SimpleName MethodInvocation SimpleName is debug enabled
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral add pending request request pending
log SimpleName MethodInvocation SimpleName request
log SimpleName MethodInvocation SimpleName pending
debug SimpleName MethodInvocation StringLiteral add pending request request pending
debug SimpleName MethodInvocation SimpleName request
debug SimpleName MethodInvocation SimpleName pending
add pending request request pending StringLiteral MethodInvocation SimpleName request
add pending request request pending StringLiteral MethodInvocation SimpleName pending
request SimpleName MethodInvocation SimpleName pending
protected Modifier MethodDeclaration SimpleType SimpleName date
protected Modifier MethodDeclaration SimpleName add pending request
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleName request
protected Modifier MethodDeclaration SingleVariableDeclaration PrimitiveType boolean
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleName want reply
protected Modifier MethodDeclaration Block ReturnStatement SimpleName pending
date SimpleName SimpleType MethodDeclaration SimpleName add pending request
date SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName request
date SimpleName SimpleType MethodDeclaration SingleVariableDeclaration PrimitiveType boolean
date SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName want reply
add pending request SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
add pending request SimpleName MethodDeclaration SingleVariableDeclaration SimpleName request
add pending request SimpleName MethodDeclaration SingleVariableDeclaration PrimitiveType boolean
add pending request SimpleName MethodDeclaration SingleVariableDeclaration SimpleName want reply
add pending request SimpleName MethodDeclaration Block ReturnStatement SimpleName pending
request SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType boolean
request SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName want reply
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier protected
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName date
public Modifier TypeDeclaration MethodDeclaration SimpleName add pending request
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName request
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType boolean
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName want reply
test SimpleName TypeDeclaration MethodDeclaration Modifier protected
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName date
test SimpleName TypeDeclaration MethodDeclaration SimpleName add pending request
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName request
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType boolean
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName want reply
