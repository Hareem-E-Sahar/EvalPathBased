table name SimpleName VariableDeclarationFragment MethodInvocation SimpleName create table
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table name
create test dfs path SimpleName MethodInvocation StringLiteral somedfspath
p file SimpleName VariableDeclarationFragment MethodInvocation SimpleName create test dfs path
p file SimpleName VariableDeclarationFragment MethodInvocation StringLiteral somedfspath
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName p file
insert overwrite directory StringLiteral InfixExpression SimpleName p file
insert overwrite directory StringLiteral InfixExpression StringLiteral select id name from
insert overwrite directory StringLiteral InfixExpression SimpleName table name
p file SimpleName InfixExpression StringLiteral select id name from
p file SimpleName InfixExpression SimpleName table name
select id name from StringLiteral InfixExpression SimpleName table name
query SimpleName VariableDeclarationFragment InfixExpression StringLiteral insert overwrite directory
query SimpleName VariableDeclarationFragment InfixExpression SimpleName p file
query SimpleName VariableDeclarationFragment InfixExpression StringLiteral select id name from
query SimpleName VariableDeclarationFragment InfixExpression SimpleName table name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName query
run command SimpleName MethodInvocation SimpleName query
list SimpleName SimpleType ParameterizedType SimpleType SimpleName entity
get inputs SimpleName MethodInvocation SimpleName table name
get inputs SimpleName MethodInvocation QualifiedName entitytypetable
table name SimpleName MethodInvocation QualifiedName entitytypetable
inputs SimpleName VariableDeclarationFragment MethodInvocation SimpleName get inputs
inputs SimpleName VariableDeclarationFragment MethodInvocation SimpleName table name
inputs SimpleName VariableDeclarationFragment MethodInvocation QualifiedName entitytypetable
list SimpleName SimpleType ParameterizedType SimpleType SimpleName entity
get outputs SimpleName MethodInvocation SimpleName p file
get outputs SimpleName MethodInvocation QualifiedName entitytypedfs dir
p file SimpleName MethodInvocation QualifiedName entitytypedfs dir
outputs SimpleName VariableDeclarationFragment MethodInvocation SimpleName get outputs
outputs SimpleName VariableDeclarationFragment MethodInvocation SimpleName p file
outputs SimpleName VariableDeclarationFragment MethodInvocation QualifiedName entitytypedfs dir
final Modifier VariableDeclarationStatement ParameterizedType SimpleType SimpleName list
final Modifier VariableDeclarationStatement ParameterizedType SimpleType SimpleName entity
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName outputs
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get outputs
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName p file
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation QualifiedName entitytypedfs dir
outputs SimpleName MethodInvocation SimpleName get
outputs SimpleName MethodInvocation NumberLiteral empty
get SimpleName MethodInvocation NumberLiteral empty
write entity SimpleName SimpleType CastExpression MethodInvocation SimpleName outputs
write entity SimpleName SimpleType CastExpression MethodInvocation SimpleName get
write entity SimpleName SimpleType CastExpression MethodInvocation NumberLiteral empty
set write type SimpleName MethodInvocation QualifiedName write entitywrite typepath write
validate process SimpleName MethodInvocation SimpleName query
validate process SimpleName MethodInvocation QualifiedName hive operationquery
validate process SimpleName MethodInvocation SimpleName inputs
validate process SimpleName MethodInvocation SimpleName outputs
query SimpleName MethodInvocation QualifiedName hive operationquery
query SimpleName MethodInvocation SimpleName inputs
query SimpleName MethodInvocation SimpleName outputs
hive operationquery QualifiedName MethodInvocation SimpleName inputs
hive operationquery QualifiedName MethodInvocation SimpleName outputs
inputs SimpleName MethodInvocation SimpleName outputs
process reference SimpleName VariableDeclarationFragment MethodInvocation SimpleName validate process
process reference SimpleName VariableDeclarationFragment MethodInvocation SimpleName query
process reference SimpleName VariableDeclarationFragment MethodInvocation QualifiedName hive operationquery
process reference SimpleName VariableDeclarationFragment MethodInvocation SimpleName inputs
process reference SimpleName VariableDeclarationFragment MethodInvocation SimpleName outputs
referenceable SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName process reference
validate hdfs paths SimpleName MethodInvocation SimpleName process reference
validate hdfs paths SimpleName MethodInvocation SimpleName outputs
validate hdfs paths SimpleName MethodInvocation SimpleName p file
process reference SimpleName MethodInvocation SimpleName outputs
process reference SimpleName MethodInvocation SimpleName p file
outputs SimpleName MethodInvocation SimpleName p file
assert table is registered SimpleName MethodInvocation SimpleName default db
assert table is registered SimpleName MethodInvocation SimpleName table name
default db SimpleName MethodInvocation SimpleName table name
table id SimpleName VariableDeclarationFragment MethodInvocation SimpleName assert table is registered
table id SimpleName VariableDeclarationFragment MethodInvocation SimpleName default db
table id SimpleName VariableDeclarationFragment MethodInvocation SimpleName table name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table id
validate input tables SimpleName MethodInvocation SimpleName process reference
validate input tables SimpleName MethodInvocation SimpleName inputs
process reference SimpleName MethodInvocation SimpleName inputs
run command SimpleName MethodInvocation SimpleName query
validate process SimpleName MethodInvocation SimpleName query
validate process SimpleName MethodInvocation QualifiedName hive operationquery
validate process SimpleName MethodInvocation SimpleName inputs
validate process SimpleName MethodInvocation SimpleName outputs
query SimpleName MethodInvocation QualifiedName hive operationquery
query SimpleName MethodInvocation SimpleName inputs
query SimpleName MethodInvocation SimpleName outputs
hive operationquery QualifiedName MethodInvocation SimpleName inputs
hive operationquery QualifiedName MethodInvocation SimpleName outputs
inputs SimpleName MethodInvocation SimpleName outputs
process reference SimpleName VariableDeclarationFragment MethodInvocation SimpleName validate process
process reference SimpleName VariableDeclarationFragment MethodInvocation SimpleName query
process reference SimpleName VariableDeclarationFragment MethodInvocation QualifiedName hive operationquery
process reference SimpleName VariableDeclarationFragment MethodInvocation SimpleName inputs
process reference SimpleName VariableDeclarationFragment MethodInvocation SimpleName outputs
referenceable SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName process reference
validate hdfs paths SimpleName MethodInvocation SimpleName process reference
validate hdfs paths SimpleName MethodInvocation SimpleName outputs
validate hdfs paths SimpleName MethodInvocation SimpleName p file
process reference SimpleName MethodInvocation SimpleName outputs
process reference SimpleName MethodInvocation SimpleName p file
outputs SimpleName MethodInvocation SimpleName p file
process reference SimpleName MethodInvocation SimpleName get id
process reference SimpleName MethodInvocation MethodInvocation SimpleName get id
get id SimpleName MethodInvocation MethodInvocation SimpleName get id
process reference SimpleName MethodInvocation SimpleName get id
process reference SimpleName MethodInvocation MethodInvocation SimpleName get id
get id SimpleName MethodInvocation MethodInvocation SimpleName get id
assert SimpleName MethodInvocation SimpleName assert equals
assert SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName process reference
assert SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get id
assert SimpleName MethodInvocation MethodInvocation SimpleName get id
assert SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName process reference
assert SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get id
assert SimpleName MethodInvocation MethodInvocation SimpleName get id
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName process reference
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get id
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get id
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName process reference
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get id
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get id
get id SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get id
create test dfs path SimpleName MethodInvocation StringLiteral somedfspath
p file SimpleName VariableDeclarationFragment MethodInvocation SimpleName create test dfs path
p file SimpleName VariableDeclarationFragment MethodInvocation StringLiteral somedfspath
final Modifier VariableDeclarationStatement SimpleType SimpleName string
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName p file
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName create test dfs path
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation StringLiteral somedfspath
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName p file
insert overwrite directory StringLiteral InfixExpression SimpleName p file
insert overwrite directory StringLiteral InfixExpression StringLiteral select id name from
insert overwrite directory StringLiteral InfixExpression SimpleName table name
p file SimpleName InfixExpression StringLiteral select id name from
p file SimpleName InfixExpression SimpleName table name
select id name from StringLiteral InfixExpression SimpleName table name
query SimpleName Assignment InfixExpression StringLiteral insert overwrite directory
query SimpleName Assignment InfixExpression SimpleName p file
query SimpleName Assignment InfixExpression StringLiteral select id name from
query SimpleName Assignment InfixExpression SimpleName table name
run command SimpleName MethodInvocation SimpleName query
list SimpleName SimpleType ParameterizedType SimpleType SimpleName entity
array list SimpleName SimpleType ParameterizedType SimpleType SimpleName entity
get outputs SimpleName MethodInvocation SimpleName p file
get outputs SimpleName MethodInvocation QualifiedName entitytypedfs dir
p file SimpleName MethodInvocation QualifiedName entitytypedfs dir
add all SimpleName MethodInvocation MethodInvocation SimpleName get outputs
add all SimpleName MethodInvocation MethodInvocation SimpleName p file
add all SimpleName MethodInvocation MethodInvocation QualifiedName entitytypedfs dir
add all SimpleName MethodInvocation SimpleName outputs
validate process SimpleName MethodInvocation SimpleName query
validate process SimpleName MethodInvocation QualifiedName hive operationquery
validate process SimpleName MethodInvocation SimpleName inputs
validate process SimpleName MethodInvocation SimpleName p outputs
query SimpleName MethodInvocation QualifiedName hive operationquery
query SimpleName MethodInvocation SimpleName inputs
query SimpleName MethodInvocation SimpleName p outputs
hive operationquery QualifiedName MethodInvocation SimpleName inputs
hive operationquery QualifiedName MethodInvocation SimpleName p outputs
inputs SimpleName MethodInvocation SimpleName p outputs
process reference SimpleName VariableDeclarationFragment MethodInvocation SimpleName validate process
process reference SimpleName VariableDeclarationFragment MethodInvocation SimpleName query
process reference SimpleName VariableDeclarationFragment MethodInvocation QualifiedName hive operationquery
process reference SimpleName VariableDeclarationFragment MethodInvocation SimpleName inputs
process reference SimpleName VariableDeclarationFragment MethodInvocation SimpleName p outputs
referenceable SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName process reference
validate hdfs paths SimpleName MethodInvocation SimpleName process reference
validate hdfs paths SimpleName MethodInvocation SimpleName outputs
validate hdfs paths SimpleName MethodInvocation SimpleName p file
process reference SimpleName MethodInvocation SimpleName outputs
process reference SimpleName MethodInvocation SimpleName p file
outputs SimpleName MethodInvocation SimpleName p file
process reference SimpleName MethodInvocation SimpleName get id
process reference SimpleName MethodInvocation MethodInvocation SimpleName get id
get id SimpleName MethodInvocation MethodInvocation SimpleName get id
process reference SimpleName MethodInvocation SimpleName get id
process reference SimpleName MethodInvocation MethodInvocation SimpleName get id
get id SimpleName MethodInvocation MethodInvocation SimpleName get id
assert SimpleName MethodInvocation SimpleName assert equals
assert SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName process reference
assert SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get id
assert SimpleName MethodInvocation MethodInvocation SimpleName get id
assert SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName process reference
assert SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get id
assert SimpleName MethodInvocation MethodInvocation SimpleName get id
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName process reference
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get id
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get id
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName process reference
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get id
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get id
get id SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get id
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test update process
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test update process
public Modifier MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration Block VariableDeclarationStatement Modifier final
public Modifier MethodDeclaration Block VariableDeclarationStatement Modifier final
void PrimitiveType MethodDeclaration SimpleName test update process
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement Modifier final
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement Modifier final
test update process SimpleName MethodDeclaration SimpleType SimpleName exception
test update process SimpleName MethodDeclaration Block VariableDeclarationStatement Modifier final
test update process SimpleName MethodDeclaration Block VariableDeclarationStatement Modifier final
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test update process
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test update process
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception