timeout SimpleName MemberValuePair NumberLiteral empty
test SimpleName NormalAnnotation MemberValuePair SimpleName timeout
test SimpleName NormalAnnotation MemberValuePair NumberLiteral empty
string SimpleName SimpleType SingleVariableDeclaration SimpleName cmd
bye quit exit StringLiteral MethodInvocation SimpleName split
bye quit exit StringLiteral MethodInvocation StringLiteral empty
split SimpleName MethodInvocation StringLiteral empty
shell SimpleName MethodInvocation SimpleName get exit
assert false SimpleName MethodInvocation MethodInvocation SimpleName shell
assert false SimpleName MethodInvocation MethodInvocation SimpleName get exit
exec SimpleName MethodInvocation SimpleName cmd
shell SimpleName MethodInvocation SimpleName get exit
assert true SimpleName MethodInvocation MethodInvocation SimpleName shell
assert true SimpleName MethodInvocation MethodInvocation SimpleName get exit
shell SimpleName MethodInvocation SimpleName set exit
shell SimpleName MethodInvocation BooleanLiteral false
set exit SimpleName MethodInvocation BooleanLiteral false
cmd SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation StringLiteral bye quit exit
cmd SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName split
cmd SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation StringLiteral empty
test SimpleName NormalAnnotation MethodDeclaration Modifier public
timeout SimpleName MemberValuePair NormalAnnotation MethodDeclaration Modifier public
empty NumberLiteral MemberValuePair NormalAnnotation MethodDeclaration Modifier public
test SimpleName NormalAnnotation MethodDeclaration PrimitiveType void
timeout SimpleName MemberValuePair NormalAnnotation MethodDeclaration PrimitiveType void
empty NumberLiteral MemberValuePair NormalAnnotation MethodDeclaration PrimitiveType void
test SimpleName NormalAnnotation MethodDeclaration SimpleName bye quit exit
timeout SimpleName MemberValuePair NormalAnnotation MethodDeclaration SimpleName bye quit exit
empty NumberLiteral MemberValuePair NormalAnnotation MethodDeclaration SimpleName bye quit exit
test SimpleName NormalAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName bye quit exit
public Modifier MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration SimpleName bye quit exit
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
bye quit exit SimpleName MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration NormalAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName bye quit exit
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration NormalAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName bye quit exit
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
