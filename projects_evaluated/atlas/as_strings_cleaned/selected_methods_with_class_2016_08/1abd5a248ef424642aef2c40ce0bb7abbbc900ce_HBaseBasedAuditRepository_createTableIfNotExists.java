admin SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName admin
connection SimpleName MethodInvocation SimpleName get admin
admin SimpleName Assignment MethodInvocation SimpleName connection
admin SimpleName Assignment MethodInvocation SimpleName get admin
table name SimpleName MethodInvocation SimpleName get name as string
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation StringLiteral checking if table {} exists
log SimpleName MethodInvocation MethodInvocation SimpleName table name
log SimpleName MethodInvocation MethodInvocation SimpleName get name as string
info SimpleName MethodInvocation StringLiteral checking if table {} exists
info SimpleName MethodInvocation MethodInvocation SimpleName table name
info SimpleName MethodInvocation MethodInvocation SimpleName get name as string
checking if table {} exists StringLiteral MethodInvocation MethodInvocation SimpleName table name
checking if table {} exists StringLiteral MethodInvocation MethodInvocation SimpleName get name as string
admin SimpleName MethodInvocation SimpleName table exists
admin SimpleName MethodInvocation SimpleName table name
table exists SimpleName MethodInvocation SimpleName table name
table name SimpleName MethodInvocation SimpleName get name as string
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation StringLiteral creating table {}
log SimpleName MethodInvocation MethodInvocation SimpleName table name
log SimpleName MethodInvocation MethodInvocation SimpleName get name as string
info SimpleName MethodInvocation StringLiteral creating table {}
info SimpleName MethodInvocation MethodInvocation SimpleName table name
info SimpleName MethodInvocation MethodInvocation SimpleName get name as string
creating table {} StringLiteral MethodInvocation MethodInvocation SimpleName table name
creating table {} StringLiteral MethodInvocation MethodInvocation SimpleName get name as string
h table descriptor SimpleName SimpleType ClassInstanceCreation SimpleName table name
table descriptor SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName h table descriptor
table descriptor SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName table name
h table descriptor SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table descriptor
h column descriptor SimpleName SimpleType ClassInstanceCreation SimpleName column family
column family SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName h column descriptor
column family SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName column family
h column descriptor SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName column family
column family SimpleName MethodInvocation SimpleName set max versions
column family SimpleName MethodInvocation NumberLiteral empty
set max versions SimpleName MethodInvocation NumberLiteral empty
table descriptor SimpleName MethodInvocation SimpleName add family
table descriptor SimpleName MethodInvocation SimpleName column family
add family SimpleName MethodInvocation SimpleName column family
admin SimpleName MethodInvocation SimpleName create table
admin SimpleName MethodInvocation SimpleName table descriptor
create table SimpleName MethodInvocation SimpleName table descriptor
table name SimpleName MethodInvocation SimpleName get name as string
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation StringLiteral table {} exists
log SimpleName MethodInvocation MethodInvocation SimpleName table name
log SimpleName MethodInvocation MethodInvocation SimpleName get name as string
info SimpleName MethodInvocation StringLiteral table {} exists
info SimpleName MethodInvocation MethodInvocation SimpleName table name
info SimpleName MethodInvocation MethodInvocation SimpleName get name as string
table {} exists StringLiteral MethodInvocation MethodInvocation SimpleName table name
table {} exists StringLiteral MethodInvocation MethodInvocation SimpleName get name as string
io exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
atlas exception SimpleName SimpleType ClassInstanceCreation SimpleName e
close SimpleName MethodInvocation SimpleName admin
private Modifier MethodDeclaration PrimitiveType void
private Modifier MethodDeclaration SimpleName create table if not exists
private Modifier MethodDeclaration SimpleType SimpleName atlas exception
void PrimitiveType MethodDeclaration SimpleName create table if not exists
void PrimitiveType MethodDeclaration SimpleType SimpleName atlas exception
create table if not exists SimpleName MethodDeclaration SimpleType SimpleName atlas exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName create table if not exists
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName atlas exception
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName create table if not exists
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName atlas exception
