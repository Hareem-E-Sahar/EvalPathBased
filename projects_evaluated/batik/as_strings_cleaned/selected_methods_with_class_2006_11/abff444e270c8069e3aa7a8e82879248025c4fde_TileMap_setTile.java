int PrimitiveType SingleVariableDeclaration SimpleName x
int PrimitiveType SingleVariableDeclaration SimpleName y
raster SimpleName SimpleType SingleVariableDeclaration SimpleName ras
point SimpleName SimpleType ClassInstanceCreation SimpleName x
point SimpleName SimpleType ClassInstanceCreation SimpleName y
x SimpleName ClassInstanceCreation SimpleName y
pt SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName point
pt SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName x
pt SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName y
point SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName pt
rasters SimpleName MethodInvocation SimpleName remove
rasters SimpleName MethodInvocation SimpleName pt
remove SimpleName MethodInvocation SimpleName pt
o SimpleName VariableDeclarationFragment MethodInvocation SimpleName rasters
o SimpleName VariableDeclarationFragment MethodInvocation SimpleName remove
o SimpleName VariableDeclarationFragment MethodInvocation SimpleName pt
object SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName o
tile map lru member SimpleName SimpleType CastExpression SimpleName o
cache SimpleName MethodInvocation SimpleName remove
cache SimpleName MethodInvocation CastExpression SimpleType SimpleName tile map lru member
cache SimpleName MethodInvocation CastExpression SimpleName o
remove SimpleName MethodInvocation CastExpression SimpleType SimpleName tile map lru member
remove SimpleName MethodInvocation CastExpression SimpleName o
rasters SimpleName MethodInvocation SimpleName get
rasters SimpleName MethodInvocation SimpleName pt
get SimpleName MethodInvocation SimpleName pt
o SimpleName VariableDeclarationFragment MethodInvocation SimpleName rasters
o SimpleName VariableDeclarationFragment MethodInvocation SimpleName get
o SimpleName VariableDeclarationFragment MethodInvocation SimpleName pt
object SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName o
tile map lru member SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName item
tile map lru member SimpleName SimpleType ClassInstanceCreation SimpleName pt
tile map lru member SimpleName SimpleType ClassInstanceCreation SimpleName ras
pt SimpleName ClassInstanceCreation SimpleName ras
item SimpleName Assignment ClassInstanceCreation SimpleType SimpleName tile map lru member
item SimpleName Assignment ClassInstanceCreation SimpleName pt
item SimpleName Assignment ClassInstanceCreation SimpleName ras
rasters SimpleName MethodInvocation SimpleName put
rasters SimpleName MethodInvocation SimpleName pt
rasters SimpleName MethodInvocation SimpleName item
put SimpleName MethodInvocation SimpleName pt
put SimpleName MethodInvocation SimpleName item
pt SimpleName MethodInvocation SimpleName item
tile map lru member SimpleName SimpleType CastExpression SimpleName o
item SimpleName Assignment CastExpression SimpleType SimpleName tile map lru member
item SimpleName Assignment CastExpression SimpleName o
item SimpleName MethodInvocation SimpleName set raster
item SimpleName MethodInvocation SimpleName ras
set raster SimpleName MethodInvocation SimpleName ras
cache SimpleName MethodInvocation SimpleName add
cache SimpleName MethodInvocation SimpleName item
add SimpleName MethodInvocation SimpleName item
setting ( StringLiteral InfixExpression SimpleName x
setting ( StringLiteral InfixExpression StringLiteral empty
setting ( StringLiteral InfixExpression SimpleName y
setting ( StringLiteral InfixExpression StringLiteral )
x SimpleName InfixExpression StringLiteral empty
x SimpleName InfixExpression SimpleName y
x SimpleName InfixExpression StringLiteral )
empty StringLiteral InfixExpression SimpleName y
empty StringLiteral InfixExpression StringLiteral )
y SimpleName InfixExpression StringLiteral )
systemout QualifiedName MethodInvocation SimpleName println
systemout QualifiedName MethodInvocation InfixExpression StringLiteral setting (
systemout QualifiedName MethodInvocation InfixExpression SimpleName x
systemout QualifiedName MethodInvocation InfixExpression StringLiteral empty
systemout QualifiedName MethodInvocation InfixExpression SimpleName y
systemout QualifiedName MethodInvocation InfixExpression StringLiteral )
println SimpleName MethodInvocation InfixExpression StringLiteral setting (
println SimpleName MethodInvocation InfixExpression SimpleName x
println SimpleName MethodInvocation InfixExpression StringLiteral empty
println SimpleName MethodInvocation InfixExpression SimpleName y
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