key SimpleName SimpleType SingleVariableDeclaration SimpleName key
value SimpleName SimpleType SingleVariableDeclaration SimpleName data
context SimpleName SimpleType SingleVariableDeclaration SimpleName context
key SimpleName MethodInvocation SimpleName get row
key SimpleName MethodInvocation MethodInvocation SimpleName to string
get row SimpleName MethodInvocation MethodInvocation SimpleName to string
long SimpleName MethodInvocation SimpleName parse long
long SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName key
long SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get row
long SimpleName MethodInvocation MethodInvocation SimpleName to string
long SimpleName MethodInvocation NumberLiteral empty
parse long SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName key
parse long SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get row
parse long SimpleName MethodInvocation MethodInvocation SimpleName to string
parse long SimpleName MethodInvocation NumberLiteral empty
key SimpleName MethodInvocation MethodInvocation MethodInvocation NumberLiteral empty
get row SimpleName MethodInvocation MethodInvocation MethodInvocation NumberLiteral empty
to string SimpleName MethodInvocation MethodInvocation NumberLiteral empty
r SimpleName VariableDeclarationFragment MethodInvocation SimpleName long
r SimpleName VariableDeclarationFragment MethodInvocation SimpleName parse long
r SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName to string
r SimpleName VariableDeclarationFragment MethodInvocation NumberLiteral empty
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName r
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName long
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName parse long
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation NumberLiteral empty
r SimpleName InfixExpression NumberLiteral empty
continuous walk SimpleName MethodInvocation SimpleName validate
continuous walk SimpleName MethodInvocation SimpleName key
continuous walk SimpleName MethodInvocation SimpleName data
validate SimpleName MethodInvocation SimpleName key
validate SimpleName MethodInvocation SimpleName data
key SimpleName MethodInvocation SimpleName data
bad checksum exception SimpleName SimpleType SingleVariableDeclaration SimpleName bce
context SimpleName MethodInvocation SimpleName get counter
context SimpleName MethodInvocation QualifiedName countscorrupt
get counter SimpleName MethodInvocation QualifiedName countscorrupt
context SimpleName MethodInvocation MethodInvocation SimpleName increment
get counter SimpleName MethodInvocation MethodInvocation SimpleName increment
countscorrupt QualifiedName MethodInvocation MethodInvocation SimpleName increment
context SimpleName MethodInvocation MethodInvocation NumberLiteral empty
get counter SimpleName MethodInvocation MethodInvocation NumberLiteral empty
countscorrupt QualifiedName MethodInvocation MethodInvocation NumberLiteral empty
increment SimpleName MethodInvocation NumberLiteral empty
corrupt SimpleName InfixExpression NumberLiteral empty
error bad checksum : StringLiteral InfixExpression SimpleName key
systemout QualifiedName MethodInvocation SimpleName println
systemout QualifiedName MethodInvocation InfixExpression StringLiteral error bad checksum :
systemout QualifiedName MethodInvocation InfixExpression SimpleName key
println SimpleName MethodInvocation InfixExpression StringLiteral error bad checksum :
println SimpleName MethodInvocation InfixExpression SimpleName key
corrupt SimpleName InfixExpression NumberLiteral empty
systemout QualifiedName MethodInvocation SimpleName println
systemout QualifiedName MethodInvocation StringLiteral too many bad checksums not printing anymore
println SimpleName MethodInvocation StringLiteral too many bad checksums not printing anymore
row SimpleName MethodInvocation SimpleName set
row SimpleName MethodInvocation SimpleName r
set SimpleName MethodInvocation SimpleName r
context SimpleName MethodInvocation SimpleName write
context SimpleName MethodInvocation SimpleName row
context SimpleName MethodInvocation SimpleName def
write SimpleName MethodInvocation SimpleName row
write SimpleName MethodInvocation SimpleName def
row SimpleName MethodInvocation SimpleName def
data SimpleName MethodInvocation SimpleName get
val SimpleName VariableDeclarationFragment MethodInvocation SimpleName data
val SimpleName VariableDeclarationFragment MethodInvocation SimpleName get
byte PrimitiveType ArrayType VariableDeclarationStatement VariableDeclarationFragment SimpleName val
continuous walk SimpleName MethodInvocation SimpleName get prev row offset
continuous walk SimpleName MethodInvocation SimpleName val
get prev row offset SimpleName MethodInvocation SimpleName val
offset SimpleName VariableDeclarationFragment MethodInvocation SimpleName continuous walk
offset SimpleName VariableDeclarationFragment MethodInvocation SimpleName get prev row offset
offset SimpleName VariableDeclarationFragment MethodInvocation SimpleName val
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName offset
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName continuous walk
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get prev row offset
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName val
offset SimpleName InfixExpression NumberLiteral empty
string SimpleName SimpleType ClassInstanceCreation SimpleName val
string SimpleName SimpleType ClassInstanceCreation SimpleName offset
string SimpleName SimpleType ClassInstanceCreation NumberLiteral empty
val SimpleName ClassInstanceCreation SimpleName offset
val SimpleName ClassInstanceCreation NumberLiteral empty
offset SimpleName ClassInstanceCreation NumberLiteral empty
long SimpleName MethodInvocation SimpleName parse long
long SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName string
long SimpleName MethodInvocation ClassInstanceCreation SimpleName val
long SimpleName MethodInvocation ClassInstanceCreation SimpleName offset
long SimpleName MethodInvocation ClassInstanceCreation NumberLiteral empty
long SimpleName MethodInvocation NumberLiteral empty
parse long SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName string
parse long SimpleName MethodInvocation ClassInstanceCreation SimpleName val
parse long SimpleName MethodInvocation ClassInstanceCreation SimpleName offset
parse long SimpleName MethodInvocation ClassInstanceCreation NumberLiteral empty
parse long SimpleName MethodInvocation NumberLiteral empty
string SimpleName SimpleType ClassInstanceCreation MethodInvocation NumberLiteral empty
val SimpleName ClassInstanceCreation MethodInvocation NumberLiteral empty
offset SimpleName ClassInstanceCreation MethodInvocation NumberLiteral empty
empty NumberLiteral ClassInstanceCreation MethodInvocation NumberLiteral empty
ref SimpleName MethodInvocation SimpleName set
ref SimpleName MethodInvocation MethodInvocation SimpleName long
ref SimpleName MethodInvocation MethodInvocation SimpleName parse long
ref SimpleName MethodInvocation MethodInvocation ClassInstanceCreation SimpleName val
ref SimpleName MethodInvocation MethodInvocation ClassInstanceCreation SimpleName offset
ref SimpleName MethodInvocation MethodInvocation ClassInstanceCreation NumberLiteral empty
ref SimpleName MethodInvocation MethodInvocation NumberLiteral empty
set SimpleName MethodInvocation MethodInvocation SimpleName long
set SimpleName MethodInvocation MethodInvocation SimpleName parse long
set SimpleName MethodInvocation MethodInvocation ClassInstanceCreation SimpleName val
set SimpleName MethodInvocation MethodInvocation ClassInstanceCreation SimpleName offset
set SimpleName MethodInvocation MethodInvocation ClassInstanceCreation NumberLiteral empty
set SimpleName MethodInvocation MethodInvocation NumberLiteral empty
vrow SimpleName MethodInvocation SimpleName set
vrow SimpleName MethodInvocation SimpleName r
set SimpleName MethodInvocation SimpleName r
context SimpleName MethodInvocation SimpleName write
context SimpleName MethodInvocation SimpleName ref
context SimpleName MethodInvocation SimpleName vrow
write SimpleName MethodInvocation SimpleName ref
write SimpleName MethodInvocation SimpleName vrow
ref SimpleName MethodInvocation SimpleName vrow
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName map
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName key
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName key
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName value
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName data
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName context
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName context
void PrimitiveType MethodDeclaration SimpleName map
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName key
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName key
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName value
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName data
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName context
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName context
void PrimitiveType MethodDeclaration SimpleType SimpleName io exception
map SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName key
map SimpleName MethodDeclaration SingleVariableDeclaration SimpleName key
map SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName value
map SimpleName MethodDeclaration SingleVariableDeclaration SimpleName data
map SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName context
map SimpleName MethodDeclaration SingleVariableDeclaration SimpleName context
map SimpleName MethodDeclaration SimpleType SimpleName io exception
map SimpleName MethodDeclaration SimpleType SimpleName interrupted exception
key SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName data
key SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName context
key SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
key SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName interrupted exception
data SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName context
data SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
data SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName interrupted exception
context SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
context SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName interrupted exception
io exception SimpleName SimpleType MethodDeclaration SimpleType SimpleName interrupted exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName map
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName key
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName data
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName context
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName interrupted exception
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName map
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName key
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName data
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName context
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName interrupted exception
