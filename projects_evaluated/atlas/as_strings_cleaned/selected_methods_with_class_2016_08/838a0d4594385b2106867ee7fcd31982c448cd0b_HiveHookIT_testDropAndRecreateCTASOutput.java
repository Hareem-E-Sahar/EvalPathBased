table name SimpleName VariableDeclarationFragment MethodInvocation SimpleName create table
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table name
table StringLiteral InfixExpression MethodInvocation SimpleName random
ctas table name SimpleName VariableDeclarationFragment InfixExpression StringLiteral table
ctas table name SimpleName VariableDeclarationFragment InfixExpression MethodInvocation SimpleName random
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName ctas table name
create table StringLiteral InfixExpression SimpleName ctas table name
create table StringLiteral InfixExpression StringLiteral as select * from
create table StringLiteral InfixExpression SimpleName table name
ctas table name SimpleName InfixExpression StringLiteral as select * from
ctas table name SimpleName InfixExpression SimpleName table name
as select * from StringLiteral InfixExpression SimpleName table name
query SimpleName VariableDeclarationFragment InfixExpression StringLiteral create table
query SimpleName VariableDeclarationFragment InfixExpression SimpleName ctas table name
query SimpleName VariableDeclarationFragment InfixExpression StringLiteral as select * from
query SimpleName VariableDeclarationFragment InfixExpression SimpleName table name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName query
run command SimpleName MethodInvocation SimpleName query
assert table is registered SimpleName MethodInvocation SimpleName default db
assert table is registered SimpleName MethodInvocation SimpleName ctas table name
default db SimpleName MethodInvocation SimpleName ctas table name
set SimpleName SimpleType ParameterizedType SimpleType SimpleName read entity
get inputs SimpleName MethodInvocation SimpleName table name
get inputs SimpleName MethodInvocation QualifiedName entitytypetable
table name SimpleName MethodInvocation QualifiedName entitytypetable
inputs SimpleName VariableDeclarationFragment MethodInvocation SimpleName get inputs
inputs SimpleName VariableDeclarationFragment MethodInvocation SimpleName table name
inputs SimpleName VariableDeclarationFragment MethodInvocation QualifiedName entitytypetable
set SimpleName SimpleType ParameterizedType SimpleType SimpleName write entity
get outputs SimpleName MethodInvocation SimpleName ctas table name
get outputs SimpleName MethodInvocation QualifiedName entitytypetable
ctas table name SimpleName MethodInvocation QualifiedName entitytypetable
outputs SimpleName VariableDeclarationFragment MethodInvocation SimpleName get outputs
outputs SimpleName VariableDeclarationFragment MethodInvocation SimpleName ctas table name
outputs SimpleName VariableDeclarationFragment MethodInvocation QualifiedName entitytypetable
construct event SimpleName MethodInvocation SimpleName query
construct event SimpleName MethodInvocation QualifiedName hive operationcreatetable as select
construct event SimpleName MethodInvocation SimpleName inputs
construct event SimpleName MethodInvocation SimpleName outputs
query SimpleName MethodInvocation QualifiedName hive operationcreatetable as select
query SimpleName MethodInvocation SimpleName inputs
query SimpleName MethodInvocation SimpleName outputs
hive operationcreatetable as select QualifiedName MethodInvocation SimpleName inputs
hive operationcreatetable as select QualifiedName MethodInvocation SimpleName outputs
inputs SimpleName MethodInvocation SimpleName outputs
hive event context SimpleName VariableDeclarationFragment MethodInvocation SimpleName construct event
hive event context SimpleName VariableDeclarationFragment MethodInvocation SimpleName query
hive event context SimpleName VariableDeclarationFragment MethodInvocation QualifiedName hive operationcreatetable as select
hive event context SimpleName VariableDeclarationFragment MethodInvocation SimpleName inputs
hive event context SimpleName VariableDeclarationFragment MethodInvocation SimpleName outputs
final Modifier VariableDeclarationStatement SimpleType QualifiedName hive hookhive event context
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName hive event context
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName construct event
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName query
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation QualifiedName hive operationcreatetable as select
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName inputs
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName outputs
hive hookhive event context QualifiedName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName hive event context
assert process is registered SimpleName MethodInvocation SimpleName hive event context
process id SimpleName VariableDeclarationFragment MethodInvocation SimpleName assert process is registered
process id SimpleName VariableDeclarationFragment MethodInvocation SimpleName hive event context
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName process id
string SimpleName MethodInvocation SimpleName format
string SimpleName MethodInvocation StringLiteral drop table s
string SimpleName MethodInvocation SimpleName ctas table name
format SimpleName MethodInvocation StringLiteral drop table s
format SimpleName MethodInvocation SimpleName ctas table name
drop table s StringLiteral MethodInvocation SimpleName ctas table name
drpquery SimpleName VariableDeclarationFragment MethodInvocation SimpleName string
drpquery SimpleName VariableDeclarationFragment MethodInvocation SimpleName format
drpquery SimpleName VariableDeclarationFragment MethodInvocation StringLiteral drop table s
drpquery SimpleName VariableDeclarationFragment MethodInvocation SimpleName ctas table name
final Modifier VariableDeclarationStatement SimpleType SimpleName string
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName drpquery
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName string
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName format
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation StringLiteral drop table s
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName ctas table name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName drpquery
run command with delay SimpleName MethodInvocation SimpleName drpquery
run command with delay SimpleName MethodInvocation NumberLiteral empty
drpquery SimpleName MethodInvocation NumberLiteral empty
assert table is not registered SimpleName MethodInvocation SimpleName default db
assert table is not registered SimpleName MethodInvocation SimpleName ctas table name
default db SimpleName MethodInvocation SimpleName ctas table name
run command SimpleName MethodInvocation SimpleName query
assert table is registered SimpleName MethodInvocation SimpleName default db
assert table is registered SimpleName MethodInvocation SimpleName ctas table name
default db SimpleName MethodInvocation SimpleName ctas table name
get outputs SimpleName MethodInvocation SimpleName ctas table name
get outputs SimpleName MethodInvocation QualifiedName entitytypetable
ctas table name SimpleName MethodInvocation QualifiedName entitytypetable
outputs SimpleName Assignment MethodInvocation SimpleName get outputs
outputs SimpleName Assignment MethodInvocation SimpleName ctas table name
outputs SimpleName Assignment MethodInvocation QualifiedName entitytypetable
assert process is registered SimpleName MethodInvocation SimpleName hive event context
assert process is registered SimpleName MethodInvocation SimpleName inputs
assert process is registered SimpleName MethodInvocation SimpleName outputs
hive event context SimpleName MethodInvocation SimpleName inputs
hive event context SimpleName MethodInvocation SimpleName outputs
inputs SimpleName MethodInvocation SimpleName outputs
process id SimpleName VariableDeclarationFragment MethodInvocation SimpleName assert process is registered
process id SimpleName VariableDeclarationFragment MethodInvocation SimpleName hive event context
process id SimpleName VariableDeclarationFragment MethodInvocation SimpleName inputs
process id SimpleName VariableDeclarationFragment MethodInvocation SimpleName outputs
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName process id
assert not equals SimpleName MethodInvocation SimpleName process id
assert not equals SimpleName MethodInvocation SimpleName process id
process id SimpleName MethodInvocation SimpleName process id
atlas client SimpleName MethodInvocation SimpleName get entity
atlas client SimpleName MethodInvocation SimpleName process id
get entity SimpleName MethodInvocation SimpleName process id
process ref SimpleName VariableDeclarationFragment MethodInvocation SimpleName atlas client
process ref SimpleName VariableDeclarationFragment MethodInvocation SimpleName get entity
process ref SimpleName VariableDeclarationFragment MethodInvocation SimpleName process id
referenceable SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName process ref
validate output tables SimpleName MethodInvocation SimpleName process ref
validate output tables SimpleName MethodInvocation SimpleName outputs
process ref SimpleName MethodInvocation SimpleName outputs
final Modifier VariableDeclarationStatement Block VariableDeclarationStatement Modifier final
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test drop and recreate ctas output
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test drop and recreate ctas output
public Modifier MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration Block VariableDeclarationStatement Modifier final
public Modifier MethodDeclaration Block VariableDeclarationStatement Modifier final
void PrimitiveType MethodDeclaration SimpleName test drop and recreate ctas output
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement Modifier final
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement Modifier final
test drop and recreate ctas output SimpleName MethodDeclaration SimpleType SimpleName exception
test drop and recreate ctas output SimpleName MethodDeclaration Block VariableDeclarationStatement Modifier final
test drop and recreate ctas output SimpleName MethodDeclaration Block VariableDeclarationStatement Modifier final
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test drop and recreate ctas output
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test drop and recreate ctas output
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
