string SimpleName SimpleType SingleVariableDeclaration SimpleName begin range
string SimpleName SimpleType SingleVariableDeclaration SimpleName end range
create key extent SimpleName MethodInvocation StringLiteral foo
create key extent SimpleName MethodInvocation SimpleName end range
create key extent SimpleName MethodInvocation SimpleName begin range
foo StringLiteral MethodInvocation SimpleName end range
foo StringLiteral MethodInvocation SimpleName begin range
end range SimpleName MethodInvocation SimpleName begin range
ke SimpleName VariableDeclarationFragment MethodInvocation SimpleName create key extent
ke SimpleName VariableDeclarationFragment MethodInvocation StringLiteral foo
ke SimpleName VariableDeclarationFragment MethodInvocation SimpleName end range
ke SimpleName VariableDeclarationFragment MethodInvocation SimpleName begin range
key extent SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName ke
sorted set SimpleName SimpleType ParameterizedType SimpleType SimpleName key extent
foo StringLiteral ArrayInitializer SimpleName end range
foo StringLiteral ArrayInitializer SimpleName begin range
end range SimpleName ArrayInitializer SimpleName begin range
children SimpleName VariableDeclarationFragment MethodInvocation SimpleName create key extents
metadata table SimpleName MethodInvocation SimpleName is contiguous range
metadata table SimpleName MethodInvocation SimpleName ke
metadata table SimpleName MethodInvocation SimpleName children
is contiguous range SimpleName MethodInvocation SimpleName ke
is contiguous range SimpleName MethodInvocation SimpleName children
ke SimpleName MethodInvocation SimpleName children
assert true SimpleName MethodInvocation MethodInvocation SimpleName metadata table
assert true SimpleName MethodInvocation MethodInvocation SimpleName is contiguous range
assert true SimpleName MethodInvocation MethodInvocation SimpleName ke
assert true SimpleName MethodInvocation MethodInvocation SimpleName children
foo StringLiteral ArrayInitializer StringLiteral r
foo StringLiteral ArrayInitializer SimpleName begin range
r StringLiteral ArrayInitializer SimpleName begin range
foo StringLiteral ArrayInitializer SimpleName end range
foo StringLiteral ArrayInitializer StringLiteral r
end range SimpleName ArrayInitializer StringLiteral r
children SimpleName Assignment MethodInvocation SimpleName create key extents
metadata table SimpleName MethodInvocation SimpleName is contiguous range
metadata table SimpleName MethodInvocation SimpleName ke
metadata table SimpleName MethodInvocation SimpleName children
is contiguous range SimpleName MethodInvocation SimpleName ke
is contiguous range SimpleName MethodInvocation SimpleName children
ke SimpleName MethodInvocation SimpleName children
assert true SimpleName MethodInvocation MethodInvocation SimpleName metadata table
assert true SimpleName MethodInvocation MethodInvocation SimpleName is contiguous range
assert true SimpleName MethodInvocation MethodInvocation SimpleName ke
assert true SimpleName MethodInvocation MethodInvocation SimpleName children
foo StringLiteral ArrayInitializer StringLiteral r
foo StringLiteral ArrayInitializer SimpleName begin range
r StringLiteral ArrayInitializer SimpleName begin range
foo StringLiteral ArrayInitializer SimpleName end range
foo StringLiteral ArrayInitializer StringLiteral r
end range SimpleName ArrayInitializer StringLiteral r
children SimpleName Assignment MethodInvocation SimpleName create key extents
metadata table SimpleName MethodInvocation SimpleName is contiguous range
metadata table SimpleName MethodInvocation SimpleName ke
metadata table SimpleName MethodInvocation SimpleName children
is contiguous range SimpleName MethodInvocation SimpleName ke
is contiguous range SimpleName MethodInvocation SimpleName children
ke SimpleName MethodInvocation SimpleName children
assert false SimpleName MethodInvocation MethodInvocation SimpleName metadata table
assert false SimpleName MethodInvocation MethodInvocation SimpleName is contiguous range
assert false SimpleName MethodInvocation MethodInvocation SimpleName ke
assert false SimpleName MethodInvocation MethodInvocation SimpleName children
foo StringLiteral ArrayInitializer StringLiteral r
foo StringLiteral ArrayInitializer SimpleName begin range
r StringLiteral ArrayInitializer SimpleName begin range
end range SimpleName InfixExpression StringLiteral z
end range SimpleName InfixExpression ConditionalExpression StringLiteral r
end range SimpleName InfixExpression ConditionalExpression InfixExpression SimpleName end range
end range SimpleName InfixExpression ConditionalExpression InfixExpression StringLiteral z
r StringLiteral ConditionalExpression InfixExpression SimpleName end range
r StringLiteral ConditionalExpression InfixExpression StringLiteral z
foo StringLiteral ArrayInitializer ParenthesizedExpression ConditionalExpression StringLiteral r
foo StringLiteral ArrayInitializer StringLiteral r
r StringLiteral ConditionalExpression ParenthesizedExpression ArrayInitializer StringLiteral r
children SimpleName Assignment MethodInvocation SimpleName create key extents
metadata table SimpleName MethodInvocation SimpleName is contiguous range
metadata table SimpleName MethodInvocation SimpleName ke
metadata table SimpleName MethodInvocation SimpleName children
is contiguous range SimpleName MethodInvocation SimpleName ke
is contiguous range SimpleName MethodInvocation SimpleName children
ke SimpleName MethodInvocation SimpleName children
assert false SimpleName MethodInvocation MethodInvocation SimpleName metadata table
assert false SimpleName MethodInvocation MethodInvocation SimpleName is contiguous range
assert false SimpleName MethodInvocation MethodInvocation SimpleName ke
assert false SimpleName MethodInvocation MethodInvocation SimpleName children
a StringLiteral InfixExpression SimpleName begin range
begin range SimpleName InfixExpression ConditionalExpression StringLiteral r
begin range SimpleName InfixExpression ConditionalExpression InfixExpression StringLiteral a
begin range SimpleName InfixExpression ConditionalExpression InfixExpression SimpleName begin range
r StringLiteral ConditionalExpression InfixExpression StringLiteral a
r StringLiteral ConditionalExpression InfixExpression SimpleName begin range
foo StringLiteral ArrayInitializer StringLiteral r
foo StringLiteral ArrayInitializer ParenthesizedExpression ConditionalExpression StringLiteral r
r StringLiteral ArrayInitializer ParenthesizedExpression ConditionalExpression StringLiteral r
foo StringLiteral ArrayInitializer SimpleName end range
foo StringLiteral ArrayInitializer StringLiteral r
end range SimpleName ArrayInitializer StringLiteral r
children SimpleName Assignment MethodInvocation SimpleName create key extents
metadata table SimpleName MethodInvocation SimpleName is contiguous range
metadata table SimpleName MethodInvocation SimpleName ke
metadata table SimpleName MethodInvocation SimpleName children
is contiguous range SimpleName MethodInvocation SimpleName ke
is contiguous range SimpleName MethodInvocation SimpleName children
ke SimpleName MethodInvocation SimpleName children
assert false SimpleName MethodInvocation MethodInvocation SimpleName metadata table
assert false SimpleName MethodInvocation MethodInvocation SimpleName is contiguous range
assert false SimpleName MethodInvocation MethodInvocation SimpleName ke
assert false SimpleName MethodInvocation MethodInvocation SimpleName children
foo StringLiteral ArrayInitializer StringLiteral r
foo StringLiteral ArrayInitializer SimpleName begin range
r StringLiteral ArrayInitializer SimpleName begin range
foo StringLiteral ArrayInitializer StringLiteral r
foo StringLiteral ArrayInitializer StringLiteral r
r StringLiteral ArrayInitializer StringLiteral r
foo StringLiteral ArrayInitializer SimpleName end range
foo StringLiteral ArrayInitializer StringLiteral r
end range SimpleName ArrayInitializer StringLiteral r
children SimpleName Assignment MethodInvocation SimpleName create key extents
metadata table SimpleName MethodInvocation SimpleName is contiguous range
metadata table SimpleName MethodInvocation SimpleName ke
metadata table SimpleName MethodInvocation SimpleName children
is contiguous range SimpleName MethodInvocation SimpleName ke
is contiguous range SimpleName MethodInvocation SimpleName children
ke SimpleName MethodInvocation SimpleName children
assert true SimpleName MethodInvocation MethodInvocation SimpleName metadata table
assert true SimpleName MethodInvocation MethodInvocation SimpleName is contiguous range
assert true SimpleName MethodInvocation MethodInvocation SimpleName ke
assert true SimpleName MethodInvocation MethodInvocation SimpleName children
foo StringLiteral ArrayInitializer StringLiteral r
foo StringLiteral ArrayInitializer SimpleName begin range
r StringLiteral ArrayInitializer SimpleName begin range
foo StringLiteral ArrayInitializer StringLiteral r
foo StringLiteral ArrayInitializer StringLiteral r
r StringLiteral ArrayInitializer StringLiteral r
foo StringLiteral ArrayInitializer SimpleName end range
foo StringLiteral ArrayInitializer StringLiteral r
end range SimpleName ArrayInitializer StringLiteral r
children SimpleName Assignment MethodInvocation SimpleName create key extents
metadata table SimpleName MethodInvocation SimpleName is contiguous range
metadata table SimpleName MethodInvocation SimpleName ke
metadata table SimpleName MethodInvocation SimpleName children
is contiguous range SimpleName MethodInvocation SimpleName ke
is contiguous range SimpleName MethodInvocation SimpleName children
ke SimpleName MethodInvocation SimpleName children
assert false SimpleName MethodInvocation MethodInvocation SimpleName metadata table
assert false SimpleName MethodInvocation MethodInvocation SimpleName is contiguous range
assert false SimpleName MethodInvocation MethodInvocation SimpleName ke
assert false SimpleName MethodInvocation MethodInvocation SimpleName children
foo StringLiteral ArrayInitializer StringLiteral r
foo StringLiteral ArrayInitializer SimpleName begin range
r StringLiteral ArrayInitializer SimpleName begin range
foo StringLiteral ArrayInitializer StringLiteral r
foo StringLiteral ArrayInitializer SimpleName end range
foo StringLiteral ArrayInitializer StringLiteral r
end range SimpleName ArrayInitializer StringLiteral r
children SimpleName Assignment MethodInvocation SimpleName create key extents
metadata table SimpleName MethodInvocation SimpleName is contiguous range
metadata table SimpleName MethodInvocation SimpleName ke
metadata table SimpleName MethodInvocation SimpleName children
is contiguous range SimpleName MethodInvocation SimpleName ke
is contiguous range SimpleName MethodInvocation SimpleName children
ke SimpleName MethodInvocation SimpleName children
assert false SimpleName MethodInvocation MethodInvocation SimpleName metadata table
assert false SimpleName MethodInvocation MethodInvocation SimpleName is contiguous range
assert false SimpleName MethodInvocation MethodInvocation SimpleName ke
assert false SimpleName MethodInvocation MethodInvocation SimpleName children
foo StringLiteral ArrayInitializer StringLiteral r
foo StringLiteral ArrayInitializer SimpleName begin range
r StringLiteral ArrayInitializer SimpleName begin range
foo StringLiteral ArrayInitializer StringLiteral r
foo StringLiteral ArrayInitializer SimpleName end range
foo StringLiteral ArrayInitializer StringLiteral r
end range SimpleName ArrayInitializer StringLiteral r
children SimpleName Assignment MethodInvocation SimpleName create key extents
metadata table SimpleName MethodInvocation SimpleName is contiguous range
metadata table SimpleName MethodInvocation SimpleName ke
metadata table SimpleName MethodInvocation SimpleName children
is contiguous range SimpleName MethodInvocation SimpleName ke
is contiguous range SimpleName MethodInvocation SimpleName children
ke SimpleName MethodInvocation SimpleName children
assert false SimpleName MethodInvocation MethodInvocation SimpleName metadata table
assert false SimpleName MethodInvocation MethodInvocation SimpleName is contiguous range
assert false SimpleName MethodInvocation MethodInvocation SimpleName ke
assert false SimpleName MethodInvocation MethodInvocation SimpleName children
foo StringLiteral ArrayInitializer StringLiteral r
foo StringLiteral ArrayInitializer SimpleName begin range
r StringLiteral ArrayInitializer SimpleName begin range
foo StringLiteral ArrayInitializer StringLiteral r
foo StringLiteral ArrayInitializer StringLiteral r
r StringLiteral ArrayInitializer StringLiteral r
foo StringLiteral ArrayInitializer StringLiteral r
foo StringLiteral ArrayInitializer StringLiteral r
r StringLiteral ArrayInitializer StringLiteral r
foo StringLiteral ArrayInitializer SimpleName end range
foo StringLiteral ArrayInitializer StringLiteral r
end range SimpleName ArrayInitializer StringLiteral r
children SimpleName Assignment MethodInvocation SimpleName create key extents
metadata table SimpleName MethodInvocation SimpleName is contiguous range
metadata table SimpleName MethodInvocation SimpleName ke
metadata table SimpleName MethodInvocation SimpleName children
is contiguous range SimpleName MethodInvocation SimpleName ke
is contiguous range SimpleName MethodInvocation SimpleName children
ke SimpleName MethodInvocation SimpleName children
assert true SimpleName MethodInvocation MethodInvocation SimpleName metadata table
assert true SimpleName MethodInvocation MethodInvocation SimpleName is contiguous range
assert true SimpleName MethodInvocation MethodInvocation SimpleName ke
assert true SimpleName MethodInvocation MethodInvocation SimpleName children
private Modifier MethodDeclaration PrimitiveType void
private Modifier MethodDeclaration SimpleName run test
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName begin range
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName end range
void PrimitiveType MethodDeclaration SimpleName run test
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName begin range
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName end range
run test SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
run test SimpleName MethodDeclaration SingleVariableDeclaration SimpleName begin range
run test SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
run test SimpleName MethodDeclaration SingleVariableDeclaration SimpleName end range
begin range SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName end range
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName run test
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName begin range
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName end range
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName run test
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName begin range
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName end range
