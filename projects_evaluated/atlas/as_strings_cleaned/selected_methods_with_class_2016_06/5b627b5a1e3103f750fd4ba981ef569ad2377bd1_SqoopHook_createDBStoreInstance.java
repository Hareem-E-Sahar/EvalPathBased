sqoop job data publisherdata QualifiedName SimpleType SingleVariableDeclaration SimpleName data
sqoop data typessqoop dbdatastore QualifiedName MethodInvocation SimpleName get name
referenceable SimpleName SimpleType ClassInstanceCreation MethodInvocation QualifiedName sqoop data typessqoop dbdatastore
referenceable SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get name
store ref SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName referenceable
store ref SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation QualifiedName sqoop data typessqoop dbdatastore
store ref SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName get name
referenceable SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName store ref
data SimpleName MethodInvocation SimpleName get store table
table SimpleName VariableDeclarationFragment MethodInvocation SimpleName data
table SimpleName VariableDeclarationFragment MethodInvocation SimpleName get store table
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table
data SimpleName MethodInvocation SimpleName get store query
query SimpleName VariableDeclarationFragment MethodInvocation SimpleName data
query SimpleName VariableDeclarationFragment MethodInvocation SimpleName get store query
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName query
string utils SimpleName MethodInvocation SimpleName is blank
string utils SimpleName MethodInvocation SimpleName table
is blank SimpleName MethodInvocation SimpleName table
string utils SimpleName MethodInvocation SimpleName is blank
string utils SimpleName MethodInvocation SimpleName query
is blank SimpleName MethodInvocation SimpleName query
string utils SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName string utils
string utils SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName is blank
string utils SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName query
is blank SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName string utils
is blank SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName is blank
is blank SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName query
table SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName string utils
table SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName is blank
table SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName query
import exception SimpleName SimpleType ClassInstanceCreation StringLiteral both table and query cannot be empty for db store instance
table SimpleName InfixExpression ConditionalExpression StringLiteral table
table SimpleName InfixExpression ConditionalExpression StringLiteral query
table StringLiteral ConditionalExpression StringLiteral query
usage SimpleName VariableDeclarationFragment ConditionalExpression InfixExpression SimpleName table
usage SimpleName VariableDeclarationFragment ConditionalExpression StringLiteral table
usage SimpleName VariableDeclarationFragment ConditionalExpression StringLiteral query
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName usage
table SimpleName InfixExpression ConditionalExpression SimpleName table
table SimpleName InfixExpression ConditionalExpression SimpleName query
table SimpleName ConditionalExpression SimpleName query
source SimpleName VariableDeclarationFragment ConditionalExpression InfixExpression SimpleName table
source SimpleName VariableDeclarationFragment ConditionalExpression SimpleName table
source SimpleName VariableDeclarationFragment ConditionalExpression SimpleName query
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName source
get sqoop db store name SimpleName MethodInvocation SimpleName data
name SimpleName VariableDeclarationFragment MethodInvocation SimpleName get sqoop db store name
name SimpleName VariableDeclarationFragment MethodInvocation SimpleName data
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName name
store ref SimpleName MethodInvocation SimpleName set
store ref SimpleName MethodInvocation QualifiedName sqoop data model generatorname
store ref SimpleName MethodInvocation SimpleName name
set SimpleName MethodInvocation QualifiedName sqoop data model generatorname
set SimpleName MethodInvocation SimpleName name
sqoop data model generatorname QualifiedName MethodInvocation SimpleName name
data SimpleName MethodInvocation SimpleName get store type
store ref SimpleName MethodInvocation SimpleName set
store ref SimpleName MethodInvocation QualifiedName sqoop data model generatordb store type
store ref SimpleName MethodInvocation MethodInvocation SimpleName data
store ref SimpleName MethodInvocation MethodInvocation SimpleName get store type
set SimpleName MethodInvocation QualifiedName sqoop data model generatordb store type
set SimpleName MethodInvocation MethodInvocation SimpleName data
set SimpleName MethodInvocation MethodInvocation SimpleName get store type
sqoop data model generatordb store type QualifiedName MethodInvocation MethodInvocation SimpleName data
sqoop data model generatordb store type QualifiedName MethodInvocation MethodInvocation SimpleName get store type
store ref SimpleName MethodInvocation SimpleName set
store ref SimpleName MethodInvocation QualifiedName sqoop data model generatordb store usage
store ref SimpleName MethodInvocation SimpleName usage
set SimpleName MethodInvocation QualifiedName sqoop data model generatordb store usage
set SimpleName MethodInvocation SimpleName usage
sqoop data model generatordb store usage QualifiedName MethodInvocation SimpleName usage
data SimpleName MethodInvocation SimpleName get url
store ref SimpleName MethodInvocation SimpleName set
store ref SimpleName MethodInvocation QualifiedName sqoop data model generatorstore uri
store ref SimpleName MethodInvocation MethodInvocation SimpleName data
store ref SimpleName MethodInvocation MethodInvocation SimpleName get url
set SimpleName MethodInvocation QualifiedName sqoop data model generatorstore uri
set SimpleName MethodInvocation MethodInvocation SimpleName data
set SimpleName MethodInvocation MethodInvocation SimpleName get url
sqoop data model generatorstore uri QualifiedName MethodInvocation MethodInvocation SimpleName data
sqoop data model generatorstore uri QualifiedName MethodInvocation MethodInvocation SimpleName get url
store ref SimpleName MethodInvocation SimpleName set
store ref SimpleName MethodInvocation QualifiedName sqoop data model generatorsource
store ref SimpleName MethodInvocation SimpleName source
set SimpleName MethodInvocation QualifiedName sqoop data model generatorsource
set SimpleName MethodInvocation SimpleName source
sqoop data model generatorsource QualifiedName MethodInvocation SimpleName source
store ref SimpleName MethodInvocation SimpleName set
store ref SimpleName MethodInvocation QualifiedName sqoop data model generatordescription
store ref SimpleName MethodInvocation StringLiteral empty
set SimpleName MethodInvocation QualifiedName sqoop data model generatordescription
set SimpleName MethodInvocation StringLiteral empty
sqoop data model generatordescription QualifiedName MethodInvocation StringLiteral empty
data SimpleName MethodInvocation SimpleName get user
store ref SimpleName MethodInvocation SimpleName set
store ref SimpleName MethodInvocation QualifiedName sqoop data model generatorowner
store ref SimpleName MethodInvocation MethodInvocation SimpleName data
store ref SimpleName MethodInvocation MethodInvocation SimpleName get user
set SimpleName MethodInvocation QualifiedName sqoop data model generatorowner
set SimpleName MethodInvocation MethodInvocation SimpleName data
set SimpleName MethodInvocation MethodInvocation SimpleName get user
sqoop data model generatorowner QualifiedName MethodInvocation MethodInvocation SimpleName data
sqoop data model generatorowner QualifiedName MethodInvocation MethodInvocation SimpleName get user
private Modifier MethodDeclaration SimpleType SimpleName referenceable
private Modifier MethodDeclaration SimpleName create db store instance
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType QualifiedName sqoop job data publisherdata
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName data
private Modifier MethodDeclaration SimpleType SimpleName import exception
private Modifier MethodDeclaration Block ReturnStatement SimpleName store ref
referenceable SimpleName SimpleType MethodDeclaration SimpleName create db store instance
referenceable SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName data
referenceable SimpleName SimpleType MethodDeclaration SimpleType SimpleName import exception
create db store instance SimpleName MethodDeclaration SingleVariableDeclaration SimpleType QualifiedName sqoop job data publisherdata
create db store instance SimpleName MethodDeclaration SingleVariableDeclaration SimpleName data
create db store instance SimpleName MethodDeclaration SimpleType SimpleName import exception
create db store instance SimpleName MethodDeclaration Block ReturnStatement SimpleName store ref
data SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName import exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName referenceable
public Modifier TypeDeclaration MethodDeclaration SimpleName create db store instance
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName data
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName import exception
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName referenceable
test SimpleName TypeDeclaration MethodDeclaration SimpleName create db store instance
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName data
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName import exception
