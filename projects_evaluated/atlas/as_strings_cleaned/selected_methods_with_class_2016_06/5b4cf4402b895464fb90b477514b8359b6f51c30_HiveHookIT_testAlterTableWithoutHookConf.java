conf SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName hive conf
hive conf SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName conf
conf SimpleName MethodInvocation SimpleName set
conf SimpleName MethodInvocation StringLiteral hiveexecposthooks
conf SimpleName MethodInvocation StringLiteral empty
set SimpleName MethodInvocation StringLiteral hiveexecposthooks
set SimpleName MethodInvocation StringLiteral empty
hiveexecposthooks StringLiteral MethodInvocation StringLiteral empty
session state SimpleName SimpleType ClassInstanceCreation SimpleName conf
ss SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName session state
ss SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName conf
session state SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName ss
session state SimpleName MethodInvocation SimpleName start
session state SimpleName MethodInvocation SimpleName ss
start SimpleName MethodInvocation SimpleName ss
ss SimpleName Assignment MethodInvocation SimpleName session state
ss SimpleName Assignment MethodInvocation SimpleName start
ss SimpleName Assignment MethodInvocation SimpleName ss
session state SimpleName MethodInvocation SimpleName set current session state
session state SimpleName MethodInvocation SimpleName ss
set current session state SimpleName MethodInvocation SimpleName ss
driver SimpleName SimpleType ClassInstanceCreation SimpleName conf
driver SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName driver
driver SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName conf
driver SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName driver
table name SimpleName VariableDeclarationFragment MethodInvocation SimpleName table name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table name
create table StringLiteral InfixExpression SimpleName table name
create table StringLiteral InfixExpression StringLiteral id int name string
table name SimpleName InfixExpression StringLiteral id int name string
create command SimpleName VariableDeclarationFragment InfixExpression StringLiteral create table
create command SimpleName VariableDeclarationFragment InfixExpression SimpleName table name
create command SimpleName VariableDeclarationFragment InfixExpression StringLiteral id int name string
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName create command
driver SimpleName MethodInvocation SimpleName run
driver SimpleName MethodInvocation SimpleName create command
run SimpleName MethodInvocation SimpleName create command
assert table is not registered SimpleName MethodInvocation SimpleName default db
assert table is not registered SimpleName MethodInvocation SimpleName table name
default db SimpleName MethodInvocation SimpleName table name
alter table StringLiteral InfixExpression SimpleName table name
alter table StringLiteral InfixExpression StringLiteral change id id new string
table name SimpleName InfixExpression StringLiteral change id id new string
command SimpleName VariableDeclarationFragment InfixExpression StringLiteral alter table
command SimpleName VariableDeclarationFragment InfixExpression SimpleName table name
command SimpleName VariableDeclarationFragment InfixExpression StringLiteral change id id new string
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName command
run command SimpleName MethodInvocation SimpleName command
assert table is registered SimpleName MethodInvocation SimpleName default db
assert table is registered SimpleName MethodInvocation SimpleName table name
default db SimpleName MethodInvocation SimpleName table name
hive meta store bridge SimpleName MethodInvocation SimpleName get table qualified name
hive meta store bridge SimpleName MethodInvocation SimpleName cluster name
hive meta store bridge SimpleName MethodInvocation SimpleName default db
hive meta store bridge SimpleName MethodInvocation SimpleName table name
get table qualified name SimpleName MethodInvocation SimpleName cluster name
get table qualified name SimpleName MethodInvocation SimpleName default db
get table qualified name SimpleName MethodInvocation SimpleName table name
cluster name SimpleName MethodInvocation SimpleName default db
cluster name SimpleName MethodInvocation SimpleName table name
default db SimpleName MethodInvocation SimpleName table name
tbqn SimpleName VariableDeclarationFragment MethodInvocation SimpleName hive meta store bridge
tbqn SimpleName VariableDeclarationFragment MethodInvocation SimpleName get table qualified name
tbqn SimpleName VariableDeclarationFragment MethodInvocation SimpleName cluster name
tbqn SimpleName VariableDeclarationFragment MethodInvocation SimpleName default db
tbqn SimpleName VariableDeclarationFragment MethodInvocation SimpleName table name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName tbqn
hive meta store bridge SimpleName MethodInvocation SimpleName get column qualified name
hive meta store bridge SimpleName MethodInvocation SimpleName tbqn
hive meta store bridge SimpleName MethodInvocation StringLiteral id new
get column qualified name SimpleName MethodInvocation SimpleName tbqn
get column qualified name SimpleName MethodInvocation StringLiteral id new
tbqn SimpleName MethodInvocation StringLiteral id new
assert column is registered SimpleName MethodInvocation MethodInvocation SimpleName hive meta store bridge
assert column is registered SimpleName MethodInvocation MethodInvocation SimpleName get column qualified name
assert column is registered SimpleName MethodInvocation MethodInvocation SimpleName tbqn
assert column is registered SimpleName MethodInvocation MethodInvocation StringLiteral id new
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test alter table without hook conf
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test alter table without hook conf
public Modifier MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration SimpleName test alter table without hook conf
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
test alter table without hook conf SimpleName MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test alter table without hook conf
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test alter table without hook conf
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
