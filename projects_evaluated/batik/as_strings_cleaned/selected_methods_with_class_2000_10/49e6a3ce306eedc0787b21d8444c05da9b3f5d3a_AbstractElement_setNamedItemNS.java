node SimpleName SimpleType SingleVariableDeclaration SimpleName arg
arg SimpleName MethodInvocation SimpleName get namespace uri
ns uri SimpleName VariableDeclarationFragment MethodInvocation SimpleName arg
ns uri SimpleName VariableDeclarationFragment MethodInvocation SimpleName get namespace uri
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName ns uri
set named item SimpleName MethodInvocation SimpleName arg
check node SimpleName MethodInvocation SimpleName arg
table ns SimpleName Assignment ClassInstanceCreation SimpleType SimpleName hash table
table ns SimpleName MethodInvocation SimpleName get
table ns SimpleName MethodInvocation SimpleName ns uri
get SimpleName MethodInvocation SimpleName ns uri
named node hash map SimpleName SimpleType CastExpression MethodInvocation SimpleName table ns
named node hash map SimpleName SimpleType CastExpression MethodInvocation SimpleName get
named node hash map SimpleName SimpleType CastExpression MethodInvocation SimpleName ns uri
attr SimpleName VariableDeclarationFragment CastExpression SimpleType SimpleName named node hash map
attr SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName table ns
attr SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName get
attr SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName ns uri
named node hash map SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName attr
attr SimpleName Assignment ClassInstanceCreation SimpleType SimpleName named node hash map
table ns SimpleName MethodInvocation SimpleName put
table ns SimpleName MethodInvocation SimpleName ns uri
table ns SimpleName MethodInvocation Assignment SimpleName attr
put SimpleName MethodInvocation SimpleName ns uri
put SimpleName MethodInvocation Assignment SimpleName attr
ns uri SimpleName MethodInvocation Assignment SimpleName attr
attrnamespace uri QualifiedName Assignment SimpleName ns uri
arg SimpleName MethodInvocation SimpleName get local name
attr SimpleName MethodInvocation SimpleName set named item
attr SimpleName MethodInvocation MethodInvocation SimpleName arg
attr SimpleName MethodInvocation MethodInvocation SimpleName get local name
attr SimpleName MethodInvocation SimpleName arg
set named item SimpleName MethodInvocation MethodInvocation SimpleName arg
set named item SimpleName MethodInvocation MethodInvocation SimpleName get local name
set named item SimpleName MethodInvocation SimpleName arg
arg SimpleName MethodInvocation MethodInvocation SimpleName arg
get local name SimpleName MethodInvocation MethodInvocation SimpleName arg
public Modifier MethodDeclaration SimpleType SimpleName node
public Modifier MethodDeclaration SimpleName set named item ns
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName node
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName arg
public Modifier MethodDeclaration SimpleType SimpleName dom exception
node SimpleName SimpleType MethodDeclaration SimpleName set named item ns
node SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName arg
node SimpleName SimpleType MethodDeclaration SimpleType SimpleName dom exception
set named item ns SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName node
set named item ns SimpleName MethodDeclaration SingleVariableDeclaration SimpleName arg
set named item ns SimpleName MethodDeclaration SimpleType SimpleName dom exception
arg SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName dom exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName node
public Modifier TypeDeclaration MethodDeclaration SimpleName set named item ns
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName arg
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName dom exception
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName node
test SimpleName TypeDeclaration MethodDeclaration SimpleName set named item ns
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName arg
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName dom exception
