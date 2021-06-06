string SimpleName SimpleType SingleVariableDeclaration SimpleName db name
string SimpleName SimpleType SingleVariableDeclaration SimpleName table name
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral getting reference for table {}.{}
log SimpleName MethodInvocation SimpleName db name
log SimpleName MethodInvocation SimpleName table name
debug SimpleName MethodInvocation StringLiteral getting reference for table {}.{}
debug SimpleName MethodInvocation SimpleName db name
debug SimpleName MethodInvocation SimpleName table name
getting reference for table {}.{} StringLiteral MethodInvocation SimpleName db name
getting reference for table {}.{} StringLiteral MethodInvocation SimpleName table name
db name SimpleName MethodInvocation SimpleName table name
hive data typeshive table QualifiedName MethodInvocation SimpleName get name
type name SimpleName VariableDeclarationFragment MethodInvocation QualifiedName hive data typeshive table
type name SimpleName VariableDeclarationFragment MethodInvocation SimpleName get name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName type name
get table qualified name SimpleName MethodInvocation SimpleName cluster name
get table qualified name SimpleName MethodInvocation SimpleName db name
get table qualified name SimpleName MethodInvocation SimpleName table name
cluster name SimpleName MethodInvocation SimpleName db name
cluster name SimpleName MethodInvocation SimpleName table name
db name SimpleName MethodInvocation SimpleName table name
entity name SimpleName VariableDeclarationFragment MethodInvocation SimpleName get table qualified name
entity name SimpleName VariableDeclarationFragment MethodInvocation SimpleName cluster name
entity name SimpleName VariableDeclarationFragment MethodInvocation SimpleName db name
entity name SimpleName VariableDeclarationFragment MethodInvocation SimpleName table name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName entity name
string SimpleName MethodInvocation SimpleName format
string SimpleName MethodInvocation StringLiteral s as t where name = s
string SimpleName MethodInvocation SimpleName type name
string SimpleName MethodInvocation SimpleName entity name
format SimpleName MethodInvocation StringLiteral s as t where name = s
format SimpleName MethodInvocation SimpleName type name
format SimpleName MethodInvocation SimpleName entity name
s as t where name = s StringLiteral MethodInvocation SimpleName type name
s as t where name = s StringLiteral MethodInvocation SimpleName entity name
type name SimpleName MethodInvocation SimpleName entity name
dsl query SimpleName VariableDeclarationFragment MethodInvocation SimpleName string
dsl query SimpleName VariableDeclarationFragment MethodInvocation SimpleName format
dsl query SimpleName VariableDeclarationFragment MethodInvocation StringLiteral s as t where name = s
dsl query SimpleName VariableDeclarationFragment MethodInvocation SimpleName type name
dsl query SimpleName VariableDeclarationFragment MethodInvocation SimpleName entity name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName dsl query
get entity reference from dsl SimpleName MethodInvocation SimpleName type name
get entity reference from dsl SimpleName MethodInvocation SimpleName dsl query
type name SimpleName MethodInvocation SimpleName dsl query
private Modifier MethodDeclaration SimpleType SimpleName referenceable
private Modifier MethodDeclaration SimpleName get table reference
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName db name
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName table name
private Modifier MethodDeclaration SimpleType SimpleName exception
referenceable SimpleName SimpleType MethodDeclaration SimpleName get table reference
referenceable SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName db name
referenceable SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName table name
referenceable SimpleName SimpleType MethodDeclaration SimpleType SimpleName exception
get table reference SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
get table reference SimpleName MethodDeclaration SingleVariableDeclaration SimpleName db name
get table reference SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
get table reference SimpleName MethodDeclaration SingleVariableDeclaration SimpleName table name
get table reference SimpleName MethodDeclaration SimpleType SimpleName exception
db name SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName table name
db name SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
table name SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName referenceable
public Modifier TypeDeclaration MethodDeclaration SimpleName get table reference
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName db name
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName table name
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName referenceable
test SimpleName TypeDeclaration MethodDeclaration SimpleName get table reference
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName db name
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName table name
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
