string SimpleName SimpleType SingleVariableDeclaration SimpleName database name
get database reference SimpleName MethodInvocation SimpleName cluster name
get database reference SimpleName MethodInvocation SimpleName database name
cluster name SimpleName MethodInvocation SimpleName database name
db ref SimpleName VariableDeclarationFragment MethodInvocation SimpleName get database reference
db ref SimpleName VariableDeclarationFragment MethodInvocation SimpleName cluster name
db ref SimpleName VariableDeclarationFragment MethodInvocation SimpleName database name
referenceable SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName db ref
hive client SimpleName MethodInvocation SimpleName get database
hive client SimpleName MethodInvocation SimpleName database name
get database SimpleName MethodInvocation SimpleName database name
db SimpleName VariableDeclarationFragment MethodInvocation SimpleName hive client
db SimpleName VariableDeclarationFragment MethodInvocation SimpleName get database
db SimpleName VariableDeclarationFragment MethodInvocation SimpleName database name
database SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName db
create db instance SimpleName MethodInvocation SimpleName db
db ref SimpleName Assignment MethodInvocation SimpleName create db instance
db ref SimpleName Assignment MethodInvocation SimpleName db
register instance SimpleName MethodInvocation SimpleName db ref
db ref SimpleName Assignment MethodInvocation SimpleName register instance
db ref SimpleName Assignment MethodInvocation SimpleName db ref
db ref SimpleName MethodInvocation SimpleName get id
db ref SimpleName MethodInvocation FieldAccess SimpleName id
get id SimpleName MethodInvocation FieldAccess SimpleName id
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation StringLiteral database {} is already registered with id {}
log SimpleName MethodInvocation SimpleName database name
log SimpleName MethodInvocation FieldAccess MethodInvocation SimpleName db ref
log SimpleName MethodInvocation FieldAccess MethodInvocation SimpleName get id
log SimpleName MethodInvocation FieldAccess SimpleName id
info SimpleName MethodInvocation StringLiteral database {} is already registered with id {}
info SimpleName MethodInvocation SimpleName database name
info SimpleName MethodInvocation FieldAccess MethodInvocation SimpleName db ref
info SimpleName MethodInvocation FieldAccess MethodInvocation SimpleName get id
info SimpleName MethodInvocation FieldAccess SimpleName id
database {} is already registered with id {} StringLiteral MethodInvocation SimpleName database name
database {} is already registered with id {} StringLiteral MethodInvocation FieldAccess MethodInvocation SimpleName db ref
database {} is already registered with id {} StringLiteral MethodInvocation FieldAccess MethodInvocation SimpleName get id
database {} is already registered with id {} StringLiteral MethodInvocation FieldAccess SimpleName id
database name SimpleName MethodInvocation FieldAccess MethodInvocation SimpleName db ref
database name SimpleName MethodInvocation FieldAccess MethodInvocation SimpleName get id
database name SimpleName MethodInvocation FieldAccess SimpleName id
private Modifier MethodDeclaration SimpleType SimpleName referenceable
private Modifier MethodDeclaration SimpleName register database
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName database name
private Modifier MethodDeclaration SimpleType SimpleName exception
private Modifier MethodDeclaration Block ReturnStatement SimpleName db ref
referenceable SimpleName SimpleType MethodDeclaration SimpleName register database
referenceable SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName database name
referenceable SimpleName SimpleType MethodDeclaration SimpleType SimpleName exception
register database SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
register database SimpleName MethodDeclaration SingleVariableDeclaration SimpleName database name
register database SimpleName MethodDeclaration SimpleType SimpleName exception
register database SimpleName MethodDeclaration Block ReturnStatement SimpleName db ref
database name SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName referenceable
public Modifier TypeDeclaration MethodDeclaration SimpleName register database
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName database name
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName referenceable
test SimpleName TypeDeclaration MethodDeclaration SimpleName register database
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName database name
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
