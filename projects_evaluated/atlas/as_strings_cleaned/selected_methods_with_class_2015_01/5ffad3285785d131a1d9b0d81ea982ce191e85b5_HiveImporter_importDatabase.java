string SimpleName SimpleType SingleVariableDeclaration SimpleName db
importing objects from database : StringLiteral InfixExpression SimpleName db
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation InfixExpression StringLiteral importing objects from database :
log SimpleName MethodInvocation InfixExpression SimpleName db
info SimpleName MethodInvocation InfixExpression StringLiteral importing objects from database :
info SimpleName MethodInvocation InfixExpression SimpleName db
hive metastore client SimpleName MethodInvocation SimpleName get database
hive metastore client SimpleName MethodInvocation SimpleName db
get database SimpleName MethodInvocation SimpleName db
hive db SimpleName VariableDeclarationFragment MethodInvocation SimpleName hive metastore client
hive db SimpleName VariableDeclarationFragment MethodInvocation SimpleName get database
hive db SimpleName VariableDeclarationFragment MethodInvocation SimpleName db
database SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName hive db
hive type systemdefined typeshive db QualifiedName MethodInvocation SimpleName name
referenceable SimpleName SimpleType ClassInstanceCreation MethodInvocation QualifiedName hive type systemdefined typeshive db
referenceable SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName name
db ref SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName referenceable
db ref SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation QualifiedName hive type systemdefined typeshive db
db ref SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName name
referenceable SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName db ref
hive db SimpleName MethodInvocation SimpleName get name
db ref SimpleName MethodInvocation SimpleName set
db ref SimpleName MethodInvocation StringLiteral name
db ref SimpleName MethodInvocation MethodInvocation SimpleName hive db
db ref SimpleName MethodInvocation MethodInvocation SimpleName get name
set SimpleName MethodInvocation StringLiteral name
set SimpleName MethodInvocation MethodInvocation SimpleName hive db
set SimpleName MethodInvocation MethodInvocation SimpleName get name
name StringLiteral MethodInvocation MethodInvocation SimpleName hive db
name StringLiteral MethodInvocation MethodInvocation SimpleName get name
hive db SimpleName MethodInvocation SimpleName get description
db ref SimpleName MethodInvocation SimpleName set
db ref SimpleName MethodInvocation StringLiteral description
db ref SimpleName MethodInvocation MethodInvocation SimpleName hive db
db ref SimpleName MethodInvocation MethodInvocation SimpleName get description
set SimpleName MethodInvocation StringLiteral description
set SimpleName MethodInvocation MethodInvocation SimpleName hive db
set SimpleName MethodInvocation MethodInvocation SimpleName get description
description StringLiteral MethodInvocation MethodInvocation SimpleName hive db
description StringLiteral MethodInvocation MethodInvocation SimpleName get description
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
create instance SimpleName MethodInvocation SimpleName db ref
db ref typed SimpleName VariableDeclarationFragment MethodInvocation SimpleName create instance
db ref typed SimpleName VariableDeclarationFragment MethodInvocation SimpleName db ref
referenceable SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName db ref typed
db ref typed SimpleName MethodInvocation SimpleName get id
db instances SimpleName MethodInvocation SimpleName add
db instances SimpleName MethodInvocation MethodInvocation SimpleName db ref typed
db instances SimpleName MethodInvocation MethodInvocation SimpleName get id
add SimpleName MethodInvocation MethodInvocation SimpleName db ref typed
add SimpleName MethodInvocation MethodInvocation SimpleName get id
import tables SimpleName MethodInvocation SimpleName db
import tables SimpleName MethodInvocation SimpleName db ref typed
db SimpleName MethodInvocation SimpleName db ref typed
exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
metadata exception SimpleName SimpleType ClassInstanceCreation SimpleName e
private Modifier MethodDeclaration PrimitiveType void
private Modifier MethodDeclaration SimpleName import database
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName db
private Modifier MethodDeclaration SimpleType SimpleName metadata exception
void PrimitiveType MethodDeclaration SimpleName import database
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName db
void PrimitiveType MethodDeclaration SimpleType SimpleName metadata exception
import database SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
import database SimpleName MethodDeclaration SingleVariableDeclaration SimpleName db
import database SimpleName MethodDeclaration SimpleType SimpleName metadata exception
db SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName metadata exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName import database
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName db
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName metadata exception
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName import database
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName db
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName metadata exception
