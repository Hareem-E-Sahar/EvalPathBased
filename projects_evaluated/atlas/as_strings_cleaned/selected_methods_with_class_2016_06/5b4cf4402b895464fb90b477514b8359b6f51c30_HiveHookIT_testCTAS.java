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
entity SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName read entity
final Modifier VariableDeclarationStatement SimpleType SimpleName read entity
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName entity
read entity SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName entity
get qualified tbl name SimpleName MethodInvocation SimpleName table name
entity SimpleName MethodInvocation SimpleName set name
entity SimpleName MethodInvocation MethodInvocation SimpleName get qualified tbl name
entity SimpleName MethodInvocation MethodInvocation SimpleName table name
set name SimpleName MethodInvocation MethodInvocation SimpleName get qualified tbl name
set name SimpleName MethodInvocation MethodInvocation SimpleName table name
entity SimpleName MethodInvocation SimpleName set typ
entity SimpleName MethodInvocation QualifiedName entitytypetable
set typ SimpleName MethodInvocation QualifiedName entitytypetable
write entity SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName write entity
final Modifier VariableDeclarationStatement SimpleType SimpleName write entity
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName write entity
write entity SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName write entity
write entity SimpleName MethodInvocation SimpleName set typ
write entity SimpleName MethodInvocation QualifiedName entitytypetable
set typ SimpleName MethodInvocation QualifiedName entitytypetable
get qualified tbl name SimpleName MethodInvocation SimpleName ctas table name
write entity SimpleName MethodInvocation SimpleName set name
write entity SimpleName MethodInvocation MethodInvocation SimpleName get qualified tbl name
write entity SimpleName MethodInvocation MethodInvocation SimpleName ctas table name
set name SimpleName MethodInvocation MethodInvocation SimpleName get qualified tbl name
set name SimpleName MethodInvocation MethodInvocation SimpleName ctas table name
array list SimpleName SimpleType ParameterizedType SimpleType SimpleName entity
add SimpleName MethodInvocation SimpleName entity
array list SimpleName SimpleType ParameterizedType SimpleType SimpleName entity
add SimpleName MethodInvocation SimpleName write entity
assert process is registered SimpleName MethodInvocation SimpleName query
assert process is registered SimpleName MethodInvocation QualifiedName hive operationcreatetable as select
query SimpleName MethodInvocation QualifiedName hive operationcreatetable as select
assert table is registered SimpleName MethodInvocation SimpleName default db
assert table is registered SimpleName MethodInvocation SimpleName ctas table name
default db SimpleName MethodInvocation SimpleName ctas table name
final Modifier VariableDeclarationStatement Block VariableDeclarationStatement Modifier final
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test ctas
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test ctas
public Modifier MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration Block VariableDeclarationStatement Modifier final
public Modifier MethodDeclaration Block VariableDeclarationStatement Modifier final
void PrimitiveType MethodDeclaration SimpleName test ctas
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement Modifier final
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement Modifier final
test ctas SimpleName MethodDeclaration SimpleType SimpleName exception
test ctas SimpleName MethodDeclaration Block VariableDeclarationStatement Modifier final
test ctas SimpleName MethodDeclaration Block VariableDeclarationStatement Modifier final
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test ctas
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test ctas
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception