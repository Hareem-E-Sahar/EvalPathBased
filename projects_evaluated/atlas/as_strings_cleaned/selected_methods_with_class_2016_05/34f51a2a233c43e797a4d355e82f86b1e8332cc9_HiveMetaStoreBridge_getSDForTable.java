string SimpleName SimpleType SingleVariableDeclaration SimpleName db name
string SimpleName SimpleType SingleVariableDeclaration SimpleName table name
get table reference SimpleName MethodInvocation SimpleName db name
get table reference SimpleName MethodInvocation SimpleName table name
db name SimpleName MethodInvocation SimpleName table name
table ref SimpleName VariableDeclarationFragment MethodInvocation SimpleName get table reference
table ref SimpleName VariableDeclarationFragment MethodInvocation SimpleName db name
table ref SimpleName VariableDeclarationFragment MethodInvocation SimpleName table name
referenceable SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table ref
table StringLiteral InfixExpression SimpleName db name
table StringLiteral InfixExpression StringLiteral .
table StringLiteral InfixExpression SimpleName table name
table StringLiteral InfixExpression StringLiteral doesnt exist
db name SimpleName InfixExpression StringLiteral .
db name SimpleName InfixExpression SimpleName table name
db name SimpleName InfixExpression StringLiteral doesnt exist
. StringLiteral InfixExpression SimpleName table name
. StringLiteral InfixExpression StringLiteral doesnt exist
table name SimpleName InfixExpression StringLiteral doesnt exist
illegal argument exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral table
illegal argument exception SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName db name
illegal argument exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral .
illegal argument exception SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName table name
illegal argument exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral doesnt exist
dgi client SimpleName VariableDeclarationFragment MethodInvocation SimpleName get atlas client
atlas client SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName dgi client
table ref SimpleName MethodInvocation SimpleName get id
table ref SimpleName MethodInvocation FieldAccess SimpleName id
get id SimpleName MethodInvocation FieldAccess SimpleName id
dgi client SimpleName MethodInvocation SimpleName get entity
dgi client SimpleName MethodInvocation FieldAccess MethodInvocation SimpleName table ref
dgi client SimpleName MethodInvocation FieldAccess MethodInvocation SimpleName get id
dgi client SimpleName MethodInvocation FieldAccess SimpleName id
get entity SimpleName MethodInvocation FieldAccess MethodInvocation SimpleName table ref
get entity SimpleName MethodInvocation FieldAccess MethodInvocation SimpleName get id
get entity SimpleName MethodInvocation FieldAccess SimpleName id
table instance SimpleName VariableDeclarationFragment MethodInvocation SimpleName dgi client
table instance SimpleName VariableDeclarationFragment MethodInvocation SimpleName get entity
table instance SimpleName VariableDeclarationFragment MethodInvocation FieldAccess SimpleName id
referenceable SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table instance
table instance SimpleName MethodInvocation SimpleName get
table instance SimpleName MethodInvocation QualifiedName hive data model generatorstorage desc
get SimpleName MethodInvocation QualifiedName hive data model generatorstorage desc
referenceable SimpleName SimpleType CastExpression MethodInvocation SimpleName table instance
referenceable SimpleName SimpleType CastExpression MethodInvocation SimpleName get
referenceable SimpleName SimpleType CastExpression MethodInvocation QualifiedName hive data model generatorstorage desc
sd SimpleName VariableDeclarationFragment CastExpression SimpleType SimpleName referenceable
sd SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName table instance
sd SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName get
sd SimpleName VariableDeclarationFragment CastExpression MethodInvocation QualifiedName hive data model generatorstorage desc
referenceable SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName sd
sd SimpleName MethodInvocation SimpleName get id
sd SimpleName MethodInvocation FieldAccess SimpleName id
get id SimpleName MethodInvocation FieldAccess SimpleName id
sd SimpleName MethodInvocation SimpleName get type name
referenceable SimpleName SimpleType ClassInstanceCreation FieldAccess SimpleName id
referenceable SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName sd
referenceable SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get type name
id SimpleName FieldAccess ClassInstanceCreation MethodInvocation SimpleName sd
id SimpleName FieldAccess ClassInstanceCreation MethodInvocation SimpleName get type name
private Modifier MethodDeclaration SimpleType SimpleName referenceable
private Modifier MethodDeclaration SimpleName get sd for table
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName db name
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName table name
private Modifier MethodDeclaration SimpleType SimpleName exception
referenceable SimpleName SimpleType MethodDeclaration SimpleName get sd for table
referenceable SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName db name
referenceable SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName table name
referenceable SimpleName SimpleType MethodDeclaration SimpleType SimpleName exception
get sd for table SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
get sd for table SimpleName MethodDeclaration SingleVariableDeclaration SimpleName db name
get sd for table SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
get sd for table SimpleName MethodDeclaration SingleVariableDeclaration SimpleName table name
get sd for table SimpleName MethodDeclaration SimpleType SimpleName exception
db name SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName table name
db name SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
table name SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName referenceable
public Modifier TypeDeclaration MethodDeclaration SimpleName get sd for table
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName db name
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName table name
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName referenceable
test SimpleName TypeDeclaration MethodDeclaration SimpleName get sd for table
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName db name
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName table name
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
