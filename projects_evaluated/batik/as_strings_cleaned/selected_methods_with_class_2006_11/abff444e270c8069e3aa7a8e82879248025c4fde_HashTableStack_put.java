string SimpleName SimpleType SingleVariableDeclaration SimpleName s
string SimpleName SimpleType SingleVariableDeclaration SimpleName v
currentpush count QualifiedName InfixExpression NumberLiteral empty
link SimpleName SimpleType ClassInstanceCreation SimpleName current
current SimpleName Assignment ClassInstanceCreation SimpleType SimpleName link
current SimpleName Assignment ClassInstanceCreation SimpleName current
s SimpleName MethodInvocation SimpleName length
s SimpleName MethodInvocation InfixExpression NumberLiteral empty
length SimpleName MethodInvocation InfixExpression NumberLiteral empty
currentdefault str QualifiedName Assignment SimpleName v
currenttable QualifiedName MethodInvocation SimpleName put
currenttable QualifiedName MethodInvocation SimpleName s
currenttable QualifiedName MethodInvocation SimpleName v
put SimpleName MethodInvocation SimpleName s
put SimpleName MethodInvocation SimpleName v
s SimpleName MethodInvocation SimpleName v
string SimpleName SimpleType CastExpression MethodInvocation QualifiedName currenttable
string SimpleName SimpleType CastExpression MethodInvocation SimpleName put
string SimpleName SimpleType CastExpression MethodInvocation SimpleName s
string SimpleName SimpleType CastExpression MethodInvocation SimpleName v
public Modifier MethodDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SimpleName put
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName s
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName v
string SimpleName SimpleType MethodDeclaration SimpleName put
string SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName s
string SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName v
put SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
put SimpleName MethodDeclaration SingleVariableDeclaration SimpleName s
put SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
put SimpleName MethodDeclaration SingleVariableDeclaration SimpleName v
s SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName v
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName string
public Modifier TypeDeclaration MethodDeclaration SimpleName put
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName s
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName v
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName string
test SimpleName TypeDeclaration MethodDeclaration SimpleName put
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName s
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName v