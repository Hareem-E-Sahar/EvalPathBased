int PrimitiveType SingleVariableDeclaration SimpleName x
int PrimitiveType SingleVariableDeclaration SimpleName y
raster SimpleName SimpleType SingleVariableDeclaration SimpleName ras
x SimpleName Assignment SimpleName min tile x
y SimpleName Assignment SimpleName min tile y
x SimpleName InfixExpression NumberLiteral empty
x SimpleName InfixExpression SimpleName x sz
y SimpleName InfixExpression NumberLiteral empty
y SimpleName InfixExpression SimpleName y sz
rasters SimpleName ArrayAccess SimpleName y
row SimpleName VariableDeclarationFragment ArrayAccess SimpleName rasters
row SimpleName VariableDeclarationFragment ArrayAccess SimpleName y
tile lru member SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName item
row SimpleName ArrayAccess SimpleName x
item SimpleName Assignment ArrayAccess SimpleName row
item SimpleName Assignment ArrayAccess SimpleName x
row SimpleName ArrayAccess SimpleName x
cache SimpleName MethodInvocation SimpleName remove
cache SimpleName MethodInvocation SimpleName item
remove SimpleName MethodInvocation SimpleName item
row SimpleName ArrayAccess SimpleName x
item SimpleName Assignment ArrayAccess SimpleName row
item SimpleName Assignment ArrayAccess SimpleName x
item SimpleName Assignment ClassInstanceCreation SimpleType SimpleName tile lru member
row SimpleName ArrayAccess SimpleName x
row SimpleName ArrayAccess Assignment SimpleName item
x SimpleName ArrayAccess Assignment SimpleName item
tile lru member SimpleName SimpleType ArrayType ArrayCreation SimpleName x sz
row SimpleName Assignment ArrayCreation SimpleName x sz
item SimpleName Assignment ClassInstanceCreation SimpleType SimpleName tile lru member
row SimpleName ArrayAccess SimpleName x
row SimpleName ArrayAccess Assignment SimpleName item
x SimpleName ArrayAccess Assignment SimpleName item
rasters SimpleName ArrayAccess SimpleName y
rasters SimpleName ArrayAccess Assignment SimpleName row
y SimpleName ArrayAccess Assignment SimpleName row
item SimpleName MethodInvocation SimpleName set raster
item SimpleName MethodInvocation SimpleName ras
set raster SimpleName MethodInvocation SimpleName ras
cache SimpleName MethodInvocation SimpleName add
cache SimpleName MethodInvocation SimpleName item
add SimpleName MethodInvocation SimpleName item
x SimpleName InfixExpression SimpleName min tile x
y SimpleName InfixExpression SimpleName min tile y
setting ( StringLiteral InfixExpression ParenthesizedExpression InfixExpression SimpleName x
setting ( StringLiteral InfixExpression ParenthesizedExpression InfixExpression SimpleName min tile x
setting ( StringLiteral InfixExpression StringLiteral empty
setting ( StringLiteral InfixExpression ParenthesizedExpression InfixExpression SimpleName y
setting ( StringLiteral InfixExpression ParenthesizedExpression InfixExpression SimpleName min tile y
setting ( StringLiteral InfixExpression StringLiteral )
x SimpleName InfixExpression ParenthesizedExpression InfixExpression StringLiteral empty
min tile x SimpleName InfixExpression ParenthesizedExpression InfixExpression StringLiteral empty
x SimpleName InfixExpression ParenthesizedExpression InfixExpression StringLiteral )
min tile x SimpleName InfixExpression ParenthesizedExpression InfixExpression StringLiteral )
empty StringLiteral InfixExpression ParenthesizedExpression InfixExpression SimpleName y
empty StringLiteral InfixExpression ParenthesizedExpression InfixExpression SimpleName min tile y
empty StringLiteral InfixExpression StringLiteral )
y SimpleName InfixExpression ParenthesizedExpression InfixExpression StringLiteral )
min tile y SimpleName InfixExpression ParenthesizedExpression InfixExpression StringLiteral )
systemout QualifiedName MethodInvocation SimpleName println
systemout QualifiedName MethodInvocation InfixExpression StringLiteral setting (
systemout QualifiedName MethodInvocation InfixExpression StringLiteral empty
systemout QualifiedName MethodInvocation InfixExpression StringLiteral )
println SimpleName MethodInvocation InfixExpression StringLiteral setting (
println SimpleName MethodInvocation InfixExpression StringLiteral empty
println SimpleName MethodInvocation InfixExpression StringLiteral )
debug SimpleName IfStatement ExpressionStatement MethodInvocation QualifiedName systemout
debug SimpleName IfStatement ExpressionStatement MethodInvocation SimpleName println
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName set tile
public Modifier MethodDeclaration SingleVariableDeclaration PrimitiveType int
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName x
public Modifier MethodDeclaration SingleVariableDeclaration PrimitiveType int
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName y
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName raster
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName ras
void PrimitiveType MethodDeclaration SimpleName set tile
void PrimitiveType MethodDeclaration SingleVariableDeclaration PrimitiveType int
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName x
void PrimitiveType MethodDeclaration SingleVariableDeclaration PrimitiveType int
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName y
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName raster
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName ras
void PrimitiveType MethodDeclaration Block IfStatement SimpleName debug
set tile SimpleName MethodDeclaration SingleVariableDeclaration PrimitiveType int
set tile SimpleName MethodDeclaration SingleVariableDeclaration SimpleName x
set tile SimpleName MethodDeclaration SingleVariableDeclaration PrimitiveType int
set tile SimpleName MethodDeclaration SingleVariableDeclaration SimpleName y
set tile SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName raster
set tile SimpleName MethodDeclaration SingleVariableDeclaration SimpleName ras
set tile SimpleName MethodDeclaration Block IfStatement SimpleName debug
int PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
int PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName y
x SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
x SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName y
int PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName ras
x SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName ras
int PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName ras
y SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName ras
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName set tile
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName x
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName y
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName ras
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName set tile
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName x
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName y
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName ras
