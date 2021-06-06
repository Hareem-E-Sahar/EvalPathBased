database SimpleName SimpleType SingleVariableDeclaration SimpleName hive db
referenceable SimpleName SimpleType SingleVariableDeclaration SimpleName db ref
hive db SimpleName MethodInvocation SimpleName get name
importing objects from database name : StringLiteral InfixExpression MethodInvocation SimpleName hive db
importing objects from database name : StringLiteral InfixExpression MethodInvocation SimpleName get name
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation InfixExpression StringLiteral importing objects from database name :
log SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName hive db
log SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get name
info SimpleName MethodInvocation InfixExpression StringLiteral importing objects from database name :
info SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName hive db
info SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get name
hive data typeshive db QualifiedName MethodInvocation SimpleName get name
referenceable SimpleName SimpleType ClassInstanceCreation MethodInvocation QualifiedName hive data typeshive db
referenceable SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get name
db ref SimpleName Assignment ClassInstanceCreation SimpleType SimpleName referenceable
db ref SimpleName Assignment ClassInstanceCreation MethodInvocation QualifiedName hive data typeshive db
db ref SimpleName Assignment ClassInstanceCreation MethodInvocation SimpleName get name
hive db SimpleName MethodInvocation SimpleName get name
hive db SimpleName MethodInvocation MethodInvocation SimpleName to lower case
get name SimpleName MethodInvocation MethodInvocation SimpleName to lower case
db name SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName hive db
db name SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get name
db name SimpleName VariableDeclarationFragment MethodInvocation SimpleName to lower case
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName db name
get db qualified name SimpleName MethodInvocation SimpleName cluster name
get db qualified name SimpleName MethodInvocation SimpleName db name
cluster name SimpleName MethodInvocation SimpleName db name
db ref SimpleName MethodInvocation SimpleName set
db ref SimpleName MethodInvocation QualifiedName atlas clientreferenceable attribute name
db ref SimpleName MethodInvocation MethodInvocation SimpleName get db qualified name
db ref SimpleName MethodInvocation MethodInvocation SimpleName cluster name
db ref SimpleName MethodInvocation MethodInvocation SimpleName db name
set SimpleName MethodInvocation QualifiedName atlas clientreferenceable attribute name
set SimpleName MethodInvocation MethodInvocation SimpleName get db qualified name
set SimpleName MethodInvocation MethodInvocation SimpleName cluster name
set SimpleName MethodInvocation MethodInvocation SimpleName db name
atlas clientreferenceable attribute name QualifiedName MethodInvocation MethodInvocation SimpleName get db qualified name
atlas clientreferenceable attribute name QualifiedName MethodInvocation MethodInvocation SimpleName cluster name
atlas clientreferenceable attribute name QualifiedName MethodInvocation MethodInvocation SimpleName db name
db ref SimpleName MethodInvocation SimpleName set
db ref SimpleName MethodInvocation QualifiedName hive data model generatorname
db ref SimpleName MethodInvocation SimpleName db name
set SimpleName MethodInvocation QualifiedName hive data model generatorname
set SimpleName MethodInvocation SimpleName db name
hive data model generatorname QualifiedName MethodInvocation SimpleName db name
db ref SimpleName MethodInvocation SimpleName set
db ref SimpleName MethodInvocation QualifiedName hive data model generatorcluster name
db ref SimpleName MethodInvocation SimpleName cluster name
set SimpleName MethodInvocation QualifiedName hive data model generatorcluster name
set SimpleName MethodInvocation SimpleName cluster name
hive data model generatorcluster name QualifiedName MethodInvocation SimpleName cluster name
hive db SimpleName MethodInvocation SimpleName get description
db ref SimpleName MethodInvocation SimpleName set
db ref SimpleName MethodInvocation SimpleName description attr
db ref SimpleName MethodInvocation MethodInvocation SimpleName hive db
db ref SimpleName MethodInvocation MethodInvocation SimpleName get description
set SimpleName MethodInvocation SimpleName description attr
set SimpleName MethodInvocation MethodInvocation SimpleName hive db
set SimpleName MethodInvocation MethodInvocation SimpleName get description
description attr SimpleName MethodInvocation MethodInvocation SimpleName hive db
description attr SimpleName MethodInvocation MethodInvocation SimpleName get description
hive db SimpleName MethodInvocation SimpleName get location uri
db ref SimpleName MethodInvocation SimpleName set
db ref SimpleName MethodInvocation StringLiteral location uri
db ref SimpleName MethodInvocation MethodInvocation SimpleName hive db
db ref SimpleName MethodInvocation MethodInvocation SimpleName get location uri
set SimpleName MethodInvocation StringLiteral location uri
set SimpleName MethodInvocation MethodInvocation SimpleName hive db
set SimpleName MethodInvocation MethodInvocation SimpleName get location uri
location uri StringLiteral MethodInvocation MethodInvocation SimpleName hive db
location uri StringLiteral MethodInvocation MethodInvocation SimpleName get location uri
hive db SimpleName MethodInvocation SimpleName get parameters
db ref SimpleName MethodInvocation SimpleName set
db ref SimpleName MethodInvocation StringLiteral parameters
db ref SimpleName MethodInvocation MethodInvocation SimpleName hive db
db ref SimpleName MethodInvocation MethodInvocation SimpleName get parameters
set SimpleName MethodInvocation StringLiteral parameters
set SimpleName MethodInvocation MethodInvocation SimpleName hive db
set SimpleName MethodInvocation MethodInvocation SimpleName get parameters
parameters StringLiteral MethodInvocation MethodInvocation SimpleName hive db
parameters StringLiteral MethodInvocation MethodInvocation SimpleName get parameters
hive db SimpleName MethodInvocation SimpleName get owner name
db ref SimpleName MethodInvocation SimpleName set
db ref SimpleName MethodInvocation StringLiteral owner name
db ref SimpleName MethodInvocation MethodInvocation SimpleName hive db
db ref SimpleName MethodInvocation MethodInvocation SimpleName get owner name
set SimpleName MethodInvocation StringLiteral owner name
set SimpleName MethodInvocation MethodInvocation SimpleName hive db
set SimpleName MethodInvocation MethodInvocation SimpleName get owner name
owner name StringLiteral MethodInvocation MethodInvocation SimpleName hive db
owner name StringLiteral MethodInvocation MethodInvocation SimpleName get owner name
hive db SimpleName MethodInvocation SimpleName get owner type
hive db SimpleName MethodInvocation SimpleName get owner type
hive db SimpleName MethodInvocation MethodInvocation SimpleName get value
get owner type SimpleName MethodInvocation MethodInvocation SimpleName get value
db ref SimpleName MethodInvocation SimpleName set
db ref SimpleName MethodInvocation StringLiteral owner type
db ref SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName hive db
db ref SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get owner type
db ref SimpleName MethodInvocation MethodInvocation SimpleName get value
set SimpleName MethodInvocation StringLiteral owner type
set SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName hive db
set SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get owner type
set SimpleName MethodInvocation MethodInvocation SimpleName get value
owner type StringLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName hive db
owner type StringLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName get owner type
owner type StringLiteral MethodInvocation MethodInvocation SimpleName get value
private Modifier MethodDeclaration SimpleType SimpleName referenceable
private Modifier MethodDeclaration SimpleName create or update db instance
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName database
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName hive db
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName referenceable
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName db ref
private Modifier MethodDeclaration Block ReturnStatement SimpleName db ref
referenceable SimpleName SimpleType MethodDeclaration SimpleName create or update db instance
referenceable SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName hive db
referenceable SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName db ref
create or update db instance SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName database
create or update db instance SimpleName MethodDeclaration SingleVariableDeclaration SimpleName hive db
create or update db instance SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName referenceable
create or update db instance SimpleName MethodDeclaration SingleVariableDeclaration SimpleName db ref
create or update db instance SimpleName MethodDeclaration Block ReturnStatement SimpleName db ref
hive db SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName db ref
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName referenceable
public Modifier TypeDeclaration MethodDeclaration SimpleName create or update db instance
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName hive db
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName db ref
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName referenceable
test SimpleName TypeDeclaration MethodDeclaration SimpleName create or update db instance
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName hive db
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName db ref
