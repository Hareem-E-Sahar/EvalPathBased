timeout SimpleName MemberValuePair NumberLiteral empty
test SimpleName NormalAnnotation MemberValuePair SimpleName timeout
test SimpleName NormalAnnotation MemberValuePair NumberLiteral empty
name SimpleName MethodInvocation SimpleName get method name
table SimpleName VariableDeclarationFragment MethodInvocation SimpleName name
table SimpleName VariableDeclarationFragment MethodInvocation SimpleName get method name
final Modifier VariableDeclarationStatement SimpleType SimpleName string
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName table
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName name
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get method name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table
exec SimpleName MethodInvocation StringLiteral notable
exec SimpleName MethodInvocation BooleanLiteral true
notable StringLiteral MethodInvocation BooleanLiteral true
output SimpleName MethodInvocation SimpleName clear
exec SimpleName MethodInvocation StringLiteral du
exec SimpleName MethodInvocation BooleanLiteral true
exec SimpleName MethodInvocation StringLiteral empty
exec SimpleName MethodInvocation BooleanLiteral true
du StringLiteral MethodInvocation BooleanLiteral true
du StringLiteral MethodInvocation StringLiteral empty
du StringLiteral MethodInvocation BooleanLiteral true
true BooleanLiteral MethodInvocation StringLiteral empty
true BooleanLiteral MethodInvocation BooleanLiteral true
empty StringLiteral MethodInvocation BooleanLiteral true
output SimpleName MethodInvocation SimpleName clear
createtable StringLiteral InfixExpression SimpleName table
exec SimpleName MethodInvocation InfixExpression StringLiteral createtable
exec SimpleName MethodInvocation InfixExpression SimpleName table
flush t StringLiteral InfixExpression SimpleName table
flush t StringLiteral InfixExpression StringLiteral w
table SimpleName InfixExpression StringLiteral w
exec SimpleName MethodInvocation InfixExpression StringLiteral flush t
exec SimpleName MethodInvocation InfixExpression SimpleName table
exec SimpleName MethodInvocation InfixExpression StringLiteral w
du StringLiteral InfixExpression SimpleName table
[ StringLiteral InfixExpression SimpleName table
[ StringLiteral InfixExpression StringLiteral ]
table SimpleName InfixExpression StringLiteral ]
exec SimpleName MethodInvocation InfixExpression StringLiteral du
exec SimpleName MethodInvocation InfixExpression SimpleName table
exec SimpleName MethodInvocation BooleanLiteral true
exec SimpleName MethodInvocation InfixExpression StringLiteral [
exec SimpleName MethodInvocation InfixExpression SimpleName table
exec SimpleName MethodInvocation InfixExpression StringLiteral ]
exec SimpleName MethodInvocation BooleanLiteral true
du StringLiteral InfixExpression MethodInvocation BooleanLiteral true
table SimpleName InfixExpression MethodInvocation BooleanLiteral true
du StringLiteral InfixExpression MethodInvocation InfixExpression StringLiteral [
du StringLiteral InfixExpression MethodInvocation InfixExpression SimpleName table
du StringLiteral InfixExpression MethodInvocation InfixExpression StringLiteral ]
table SimpleName InfixExpression MethodInvocation InfixExpression StringLiteral [
table SimpleName InfixExpression MethodInvocation InfixExpression SimpleName table
table SimpleName InfixExpression MethodInvocation InfixExpression StringLiteral ]
du StringLiteral InfixExpression MethodInvocation BooleanLiteral true
table SimpleName InfixExpression MethodInvocation BooleanLiteral true
true BooleanLiteral MethodInvocation InfixExpression StringLiteral [
true BooleanLiteral MethodInvocation InfixExpression SimpleName table
true BooleanLiteral MethodInvocation InfixExpression StringLiteral ]
true BooleanLiteral MethodInvocation BooleanLiteral true
[ StringLiteral InfixExpression MethodInvocation BooleanLiteral true
table SimpleName InfixExpression MethodInvocation BooleanLiteral true
] StringLiteral InfixExpression MethodInvocation BooleanLiteral true
output SimpleName MethodInvocation SimpleName clear
shell SimpleName MethodInvocation SimpleName exec command
shell SimpleName MethodInvocation StringLiteral du h
shell SimpleName MethodInvocation BooleanLiteral false
shell SimpleName MethodInvocation BooleanLiteral false
exec command SimpleName MethodInvocation StringLiteral du h
exec command SimpleName MethodInvocation BooleanLiteral false
exec command SimpleName MethodInvocation BooleanLiteral false
du h StringLiteral MethodInvocation BooleanLiteral false
du h StringLiteral MethodInvocation BooleanLiteral false
false BooleanLiteral MethodInvocation BooleanLiteral false
output SimpleName MethodInvocation SimpleName get
o SimpleName VariableDeclarationFragment MethodInvocation SimpleName output
o SimpleName VariableDeclarationFragment MethodInvocation SimpleName get
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName o
output did not match regex StringLiteral InfixExpression SimpleName o
output did not match regex StringLiteral InfixExpression StringLiteral empty
o SimpleName InfixExpression StringLiteral empty
.* [ - ][ - bs StringLiteral InfixExpression SimpleName table
.* [ - ][ - bs StringLiteral InfixExpression StringLiteral \\]\
table SimpleName InfixExpression StringLiteral \\]\
o SimpleName MethodInvocation SimpleName matches
o SimpleName MethodInvocation InfixExpression StringLiteral .* [ - ][ - bs
o SimpleName MethodInvocation InfixExpression SimpleName table
o SimpleName MethodInvocation InfixExpression StringLiteral \\]\
matches SimpleName MethodInvocation InfixExpression StringLiteral .* [ - ][ - bs
matches SimpleName MethodInvocation InfixExpression SimpleName table
matches SimpleName MethodInvocation InfixExpression StringLiteral \\]\
assert true SimpleName MethodInvocation InfixExpression StringLiteral output did not match regex
assert true SimpleName MethodInvocation InfixExpression SimpleName o
assert true SimpleName MethodInvocation InfixExpression StringLiteral empty
assert true SimpleName MethodInvocation MethodInvocation SimpleName o
assert true SimpleName MethodInvocation MethodInvocation SimpleName matches
assert true SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral .* [ - ][ - bs
assert true SimpleName MethodInvocation MethodInvocation InfixExpression SimpleName table
assert true SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral \\]\
output did not match regex StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName o
output did not match regex StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName matches
o SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName o
o SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName matches
empty StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName o
empty StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName matches
deletetable f StringLiteral InfixExpression SimpleName table
exec SimpleName MethodInvocation InfixExpression StringLiteral deletetable f
exec SimpleName MethodInvocation InfixExpression SimpleName table
test SimpleName NormalAnnotation MethodDeclaration Modifier public
timeout SimpleName MemberValuePair NormalAnnotation MethodDeclaration Modifier public
empty NumberLiteral MemberValuePair NormalAnnotation MethodDeclaration Modifier public
test SimpleName NormalAnnotation MethodDeclaration PrimitiveType void
timeout SimpleName MemberValuePair NormalAnnotation MethodDeclaration PrimitiveType void
empty NumberLiteral MemberValuePair NormalAnnotation MethodDeclaration PrimitiveType void
test SimpleName NormalAnnotation MethodDeclaration SimpleName du
timeout SimpleName MemberValuePair NormalAnnotation MethodDeclaration SimpleName du
empty NumberLiteral MemberValuePair NormalAnnotation MethodDeclaration SimpleName du
test SimpleName NormalAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName du
public Modifier MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration Block VariableDeclarationStatement Modifier final
void PrimitiveType MethodDeclaration SimpleName du
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement Modifier final
du SimpleName MethodDeclaration SimpleType SimpleName exception
du SimpleName MethodDeclaration Block VariableDeclarationStatement Modifier final
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration NormalAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName du
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration NormalAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName du
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
