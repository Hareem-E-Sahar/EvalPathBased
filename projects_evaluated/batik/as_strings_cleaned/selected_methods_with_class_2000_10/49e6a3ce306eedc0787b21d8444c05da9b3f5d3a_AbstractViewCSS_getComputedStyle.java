element SimpleName SimpleType SingleVariableDeclaration SimpleName elt
string SimpleName SimpleType SingleVariableDeclaration SimpleName pseudo elt
styles SimpleName MethodInvocation SimpleName get
styles SimpleName MethodInvocation SimpleName elt
get SimpleName MethodInvocation SimpleName elt
map SimpleName SimpleType CastExpression MethodInvocation SimpleName styles
map SimpleName SimpleType CastExpression MethodInvocation SimpleName get
map SimpleName SimpleType CastExpression MethodInvocation SimpleName elt
m SimpleName VariableDeclarationFragment CastExpression SimpleType SimpleName map
m SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName styles
m SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName get
m SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName elt
map SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName m
hash map SimpleName SimpleType ClassInstanceCreation NumberLiteral empty
m SimpleName Assignment ClassInstanceCreation SimpleType SimpleName hash map
m SimpleName Assignment ClassInstanceCreation NumberLiteral empty
styles SimpleName MethodInvocation SimpleName put
styles SimpleName MethodInvocation SimpleName elt
styles SimpleName MethodInvocation Assignment SimpleName m
styles SimpleName MethodInvocation Assignment ClassInstanceCreation NumberLiteral empty
put SimpleName MethodInvocation SimpleName elt
put SimpleName MethodInvocation Assignment SimpleName m
put SimpleName MethodInvocation Assignment ClassInstanceCreation NumberLiteral empty
elt SimpleName MethodInvocation Assignment SimpleName m
elt SimpleName MethodInvocation Assignment ClassInstanceCreation NumberLiteral empty
pseudo elt SimpleName InfixExpression ParenthesizedExpression ConditionalExpression StringLiteral empty
pseudo elt SimpleName InfixExpression ParenthesizedExpression ConditionalExpression SimpleName pseudo elt
empty StringLiteral ConditionalExpression SimpleName pseudo elt
pseudo elt SimpleName Assignment ConditionalExpression StringLiteral empty
pseudo elt SimpleName Assignment ConditionalExpression SimpleName pseudo elt
css style declaration SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName result
m SimpleName MethodInvocation SimpleName get
m SimpleName MethodInvocation SimpleName pseudo elt
get SimpleName MethodInvocation SimpleName pseudo elt
weak reference SimpleName SimpleType CastExpression MethodInvocation SimpleName m
weak reference SimpleName SimpleType CastExpression MethodInvocation SimpleName get
weak reference SimpleName SimpleType CastExpression MethodInvocation SimpleName pseudo elt
ref SimpleName VariableDeclarationFragment CastExpression SimpleType SimpleName weak reference
ref SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName m
ref SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName get
ref SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName pseudo elt
weak reference SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName ref
ref SimpleName MethodInvocation SimpleName get
css style declaration SimpleName SimpleType CastExpression MethodInvocation SimpleName ref
css style declaration SimpleName SimpleType CastExpression MethodInvocation SimpleName get
result SimpleName Assignment CastExpression SimpleType SimpleName css style declaration
result SimpleName Assignment CastExpression MethodInvocation SimpleName ref
result SimpleName Assignment CastExpression MethodInvocation SimpleName get
compute full style SimpleName MethodInvocation SimpleName elt
compute full style SimpleName MethodInvocation SimpleName pseudo elt
elt SimpleName MethodInvocation SimpleName pseudo elt
result SimpleName Assignment MethodInvocation SimpleName compute full style
result SimpleName Assignment MethodInvocation SimpleName elt
result SimpleName Assignment MethodInvocation SimpleName pseudo elt
weak reference SimpleName SimpleType ClassInstanceCreation SimpleName result
m SimpleName MethodInvocation SimpleName put
m SimpleName MethodInvocation SimpleName pseudo elt
m SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName weak reference
m SimpleName MethodInvocation ClassInstanceCreation SimpleName result
put SimpleName MethodInvocation SimpleName pseudo elt
put SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName weak reference
put SimpleName MethodInvocation ClassInstanceCreation SimpleName result
pseudo elt SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName weak reference
pseudo elt SimpleName MethodInvocation ClassInstanceCreation SimpleName result
public Modifier MethodDeclaration SimpleType SimpleName css style declaration
public Modifier MethodDeclaration SimpleName get computed style
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName element
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName elt
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName pseudo elt
public Modifier MethodDeclaration Block ReturnStatement SimpleName result
css style declaration SimpleName SimpleType MethodDeclaration SimpleName get computed style
css style declaration SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName elt
css style declaration SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName pseudo elt
get computed style SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName element
get computed style SimpleName MethodDeclaration SingleVariableDeclaration SimpleName elt
get computed style SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
get computed style SimpleName MethodDeclaration SingleVariableDeclaration SimpleName pseudo elt
get computed style SimpleName MethodDeclaration Block ReturnStatement SimpleName result
elt SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName pseudo elt
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName css style declaration
public Modifier TypeDeclaration MethodDeclaration SimpleName get computed style
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName elt
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName pseudo elt
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName css style declaration
test SimpleName TypeDeclaration MethodDeclaration SimpleName get computed style
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName elt
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName pseudo elt
