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
createtable StringLiteral InfixExpression SimpleName table
createtable StringLiteral InfixExpression StringLiteral evc
table SimpleName InfixExpression StringLiteral evc
exec SimpleName MethodInvocation InfixExpression StringLiteral createtable
exec SimpleName MethodInvocation InfixExpression SimpleName table
exec SimpleName MethodInvocation InfixExpression StringLiteral evc
exec SimpleName MethodInvocation StringLiteral insert a b c d l foo
exec SimpleName MethodInvocation BooleanLiteral false
exec SimpleName MethodInvocation StringLiteral does not have authorization
exec SimpleName MethodInvocation BooleanLiteral true
insert a b c d l foo StringLiteral MethodInvocation BooleanLiteral false
insert a b c d l foo StringLiteral MethodInvocation StringLiteral does not have authorization
insert a b c d l foo StringLiteral MethodInvocation BooleanLiteral true
false BooleanLiteral MethodInvocation StringLiteral does not have authorization
false BooleanLiteral MethodInvocation BooleanLiteral true
does not have authorization StringLiteral MethodInvocation BooleanLiteral true
exec SimpleName MethodInvocation StringLiteral addauths s foobar
exec SimpleName MethodInvocation BooleanLiteral true
addauths s foobar StringLiteral MethodInvocation BooleanLiteral true
exec SimpleName MethodInvocation StringLiteral getauths
exec SimpleName MethodInvocation BooleanLiteral true
exec SimpleName MethodInvocation StringLiteral foo
exec SimpleName MethodInvocation BooleanLiteral true
getauths StringLiteral MethodInvocation BooleanLiteral true
getauths StringLiteral MethodInvocation StringLiteral foo
getauths StringLiteral MethodInvocation BooleanLiteral true
true BooleanLiteral MethodInvocation StringLiteral foo
true BooleanLiteral MethodInvocation BooleanLiteral true
foo StringLiteral MethodInvocation BooleanLiteral true
exec SimpleName MethodInvocation StringLiteral getauths
exec SimpleName MethodInvocation BooleanLiteral true
exec SimpleName MethodInvocation StringLiteral bar
exec SimpleName MethodInvocation BooleanLiteral true
getauths StringLiteral MethodInvocation BooleanLiteral true
getauths StringLiteral MethodInvocation StringLiteral bar
getauths StringLiteral MethodInvocation BooleanLiteral true
true BooleanLiteral MethodInvocation StringLiteral bar
true BooleanLiteral MethodInvocation BooleanLiteral true
bar StringLiteral MethodInvocation BooleanLiteral true
exec SimpleName MethodInvocation StringLiteral insert a b c d l foo
exec SimpleName MethodInvocation StringLiteral scan
exec SimpleName MethodInvocation BooleanLiteral true
exec SimpleName MethodInvocation StringLiteral foo
scan StringLiteral MethodInvocation BooleanLiteral true
scan StringLiteral MethodInvocation StringLiteral foo
true BooleanLiteral MethodInvocation StringLiteral foo
exec SimpleName MethodInvocation StringLiteral scan s bar
exec SimpleName MethodInvocation BooleanLiteral true
exec SimpleName MethodInvocation StringLiteral foo
exec SimpleName MethodInvocation BooleanLiteral false
scan s bar StringLiteral MethodInvocation BooleanLiteral true
scan s bar StringLiteral MethodInvocation StringLiteral foo
scan s bar StringLiteral MethodInvocation BooleanLiteral false
true BooleanLiteral MethodInvocation StringLiteral foo
true BooleanLiteral MethodInvocation BooleanLiteral false
foo StringLiteral MethodInvocation BooleanLiteral false
deletetable f StringLiteral InfixExpression SimpleName table
exec SimpleName MethodInvocation InfixExpression StringLiteral deletetable f
exec SimpleName MethodInvocation InfixExpression SimpleName table
test SimpleName NormalAnnotation MethodDeclaration Modifier public
timeout SimpleName MemberValuePair NormalAnnotation MethodDeclaration Modifier public
empty NumberLiteral MemberValuePair NormalAnnotation MethodDeclaration Modifier public
test SimpleName NormalAnnotation MethodDeclaration PrimitiveType void
timeout SimpleName MemberValuePair NormalAnnotation MethodDeclaration PrimitiveType void
empty NumberLiteral MemberValuePair NormalAnnotation MethodDeclaration PrimitiveType void
test SimpleName NormalAnnotation MethodDeclaration SimpleName addauths
timeout SimpleName MemberValuePair NormalAnnotation MethodDeclaration SimpleName addauths
empty NumberLiteral MemberValuePair NormalAnnotation MethodDeclaration SimpleName addauths
test SimpleName NormalAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName addauths
public Modifier MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration Block VariableDeclarationStatement Modifier final
void PrimitiveType MethodDeclaration SimpleName addauths
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement Modifier final
addauths SimpleName MethodDeclaration SimpleType SimpleName exception
addauths SimpleName MethodDeclaration Block VariableDeclarationStatement Modifier final
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration NormalAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName addauths
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration NormalAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName addauths
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
