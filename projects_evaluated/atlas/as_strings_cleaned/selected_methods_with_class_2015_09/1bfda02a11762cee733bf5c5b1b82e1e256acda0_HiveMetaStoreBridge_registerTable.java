referenceable SimpleName SimpleType SingleVariableDeclaration SimpleName db reference
table SimpleName SimpleType SingleVariableDeclaration SimpleName table
table SimpleName MethodInvocation SimpleName get db name
db name SimpleName VariableDeclarationFragment MethodInvocation SimpleName table
db name SimpleName VariableDeclarationFragment MethodInvocation SimpleName get db name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName db name
table SimpleName MethodInvocation SimpleName get table name
table name SimpleName VariableDeclarationFragment MethodInvocation SimpleName table
table name SimpleName VariableDeclarationFragment MethodInvocation SimpleName get table name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table name
attempting to register table [ StringLiteral InfixExpression SimpleName table name
attempting to register table [ StringLiteral InfixExpression StringLiteral ]
table name SimpleName InfixExpression StringLiteral ]
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation InfixExpression StringLiteral attempting to register table [
log SimpleName MethodInvocation InfixExpression SimpleName table name
log SimpleName MethodInvocation InfixExpression StringLiteral ]
info SimpleName MethodInvocation InfixExpression StringLiteral attempting to register table [
info SimpleName MethodInvocation InfixExpression SimpleName table name
info SimpleName MethodInvocation InfixExpression StringLiteral ]
get table reference SimpleName MethodInvocation SimpleName db name
get table reference SimpleName MethodInvocation SimpleName table name
db name SimpleName MethodInvocation SimpleName table name
table ref SimpleName VariableDeclarationFragment MethodInvocation SimpleName get table reference
table ref SimpleName VariableDeclarationFragment MethodInvocation SimpleName db name
table ref SimpleName VariableDeclarationFragment MethodInvocation SimpleName table name
referenceable SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table ref
create table instance SimpleName MethodInvocation SimpleName db reference
create table instance SimpleName MethodInvocation SimpleName table
db reference SimpleName MethodInvocation SimpleName table
table ref SimpleName Assignment MethodInvocation SimpleName create table instance
table ref SimpleName Assignment MethodInvocation SimpleName db reference
table ref SimpleName Assignment MethodInvocation SimpleName table
register instance SimpleName MethodInvocation SimpleName table ref
table ref SimpleName Assignment MethodInvocation SimpleName register instance
table ref SimpleName Assignment MethodInvocation SimpleName table ref
table ref SimpleName MethodInvocation SimpleName get id
table ref SimpleName MethodInvocation FieldAccess SimpleName id
get id SimpleName MethodInvocation FieldAccess SimpleName id
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation StringLiteral table {}.{} is already registered with id {}
log SimpleName MethodInvocation SimpleName db name
log SimpleName MethodInvocation SimpleName table name
log SimpleName MethodInvocation FieldAccess MethodInvocation SimpleName table ref
log SimpleName MethodInvocation FieldAccess MethodInvocation SimpleName get id
log SimpleName MethodInvocation FieldAccess SimpleName id
info SimpleName MethodInvocation StringLiteral table {}.{} is already registered with id {}
info SimpleName MethodInvocation SimpleName db name
info SimpleName MethodInvocation SimpleName table name
info SimpleName MethodInvocation FieldAccess MethodInvocation SimpleName table ref
info SimpleName MethodInvocation FieldAccess MethodInvocation SimpleName get id
info SimpleName MethodInvocation FieldAccess SimpleName id
table {}.{} is already registered with id {} StringLiteral MethodInvocation SimpleName db name
table {}.{} is already registered with id {} StringLiteral MethodInvocation SimpleName table name
table {}.{} is already registered with id {} StringLiteral MethodInvocation FieldAccess MethodInvocation SimpleName table ref
table {}.{} is already registered with id {} StringLiteral MethodInvocation FieldAccess MethodInvocation SimpleName get id
table {}.{} is already registered with id {} StringLiteral MethodInvocation FieldAccess SimpleName id
db name SimpleName MethodInvocation SimpleName table name
db name SimpleName MethodInvocation FieldAccess MethodInvocation SimpleName table ref
db name SimpleName MethodInvocation FieldAccess MethodInvocation SimpleName get id
db name SimpleName MethodInvocation FieldAccess SimpleName id
table name SimpleName MethodInvocation FieldAccess MethodInvocation SimpleName table ref
table name SimpleName MethodInvocation FieldAccess MethodInvocation SimpleName get id
table name SimpleName MethodInvocation FieldAccess SimpleName id
private Modifier MethodDeclaration SimpleType SimpleName referenceable
private Modifier MethodDeclaration SimpleName register table
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName referenceable
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName db reference
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName table
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName table
private Modifier MethodDeclaration SimpleType SimpleName exception
referenceable SimpleName SimpleType MethodDeclaration SimpleName register table
referenceable SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName db reference
referenceable SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName table
referenceable SimpleName SimpleType MethodDeclaration SimpleType SimpleName exception
register table SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName referenceable
register table SimpleName MethodDeclaration SingleVariableDeclaration SimpleName db reference
register table SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName table
register table SimpleName MethodDeclaration SingleVariableDeclaration SimpleName table
register table SimpleName MethodDeclaration SimpleType SimpleName exception
register table SimpleName MethodDeclaration Block ReturnStatement SimpleName table ref
db reference SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName table
db reference SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
table SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName referenceable
public Modifier TypeDeclaration MethodDeclaration SimpleName register table
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName db reference
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName table
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName referenceable
test SimpleName TypeDeclaration MethodDeclaration SimpleName register table
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName db reference
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName table
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
