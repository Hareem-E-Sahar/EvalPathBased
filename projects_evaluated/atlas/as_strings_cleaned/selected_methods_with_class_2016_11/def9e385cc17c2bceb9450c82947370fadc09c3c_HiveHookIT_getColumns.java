list SimpleName SimpleType ParameterizedType SimpleType SimpleName referenceable
string SimpleName SimpleType SingleVariableDeclaration SimpleName db name
string SimpleName SimpleType SingleVariableDeclaration SimpleName table name
assert table is registered SimpleName MethodInvocation SimpleName db name
assert table is registered SimpleName MethodInvocation SimpleName table name
db name SimpleName MethodInvocation SimpleName table name
table id SimpleName VariableDeclarationFragment MethodInvocation SimpleName assert table is registered
table id SimpleName VariableDeclarationFragment MethodInvocation SimpleName db name
table id SimpleName VariableDeclarationFragment MethodInvocation SimpleName table name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table id
atlas client SimpleName MethodInvocation SimpleName get entity
atlas client SimpleName MethodInvocation SimpleName table id
get entity SimpleName MethodInvocation SimpleName table id
table ref SimpleName VariableDeclarationFragment MethodInvocation SimpleName atlas client
table ref SimpleName VariableDeclarationFragment MethodInvocation SimpleName get entity
table ref SimpleName VariableDeclarationFragment MethodInvocation SimpleName table id
referenceable SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table ref
list SimpleName SimpleType ParameterizedType SimpleType SimpleName referenceable
list SimpleName SimpleType ParameterizedType SimpleType SimpleName referenceable
table ref SimpleName MethodInvocation SimpleName get
table ref SimpleName MethodInvocation QualifiedName hive meta store bridgecolumns
get SimpleName MethodInvocation QualifiedName hive meta store bridgecolumns
list SimpleName SimpleType ParameterizedType SimpleType SimpleName referenceable
referenceable SimpleName SimpleType SingleVariableDeclaration SimpleName col
col SimpleName MethodInvocation SimpleName get id
col SimpleName MethodInvocation MethodInvocation SimpleName get state
get id SimpleName MethodInvocation MethodInvocation SimpleName get state
col SimpleName MethodInvocation MethodInvocation InfixExpression QualifiedName identity stateactive
get id SimpleName MethodInvocation MethodInvocation InfixExpression QualifiedName identity stateactive
get state SimpleName MethodInvocation InfixExpression QualifiedName identity stateactive
active columns SimpleName MethodInvocation SimpleName add
active columns SimpleName MethodInvocation SimpleName col
add SimpleName MethodInvocation SimpleName col
referenceable SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName columns
col SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName columns
columns SimpleName EnhancedForStatement Block ReturnStatement SimpleName active columns
private Modifier MethodDeclaration ParameterizedType SimpleType SimpleName list
private Modifier MethodDeclaration ParameterizedType SimpleType SimpleName referenceable
private Modifier MethodDeclaration SimpleName get columns
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName db name
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName table name
private Modifier MethodDeclaration SimpleType SimpleName exception
list SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName get columns
referenceable SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName get columns
get columns SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
get columns SimpleName MethodDeclaration SingleVariableDeclaration SimpleName db name
get columns SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
get columns SimpleName MethodDeclaration SingleVariableDeclaration SimpleName table name
get columns SimpleName MethodDeclaration SimpleType SimpleName exception
get columns SimpleName MethodDeclaration Block EnhancedForStatement SimpleName columns
get columns SimpleName MethodDeclaration Block ReturnStatement SimpleName active columns
db name SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName table name
db name SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
table name SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration SimpleName get columns
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName db name
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName table name
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration SimpleName get columns
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName db name
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName table name
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
