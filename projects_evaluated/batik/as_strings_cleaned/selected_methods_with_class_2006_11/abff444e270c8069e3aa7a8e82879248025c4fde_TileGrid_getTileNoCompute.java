int PrimitiveType SingleVariableDeclaration SimpleName x
int PrimitiveType SingleVariableDeclaration SimpleName y
x SimpleName Assignment SimpleName min tile x
y SimpleName Assignment SimpleName min tile y
x SimpleName InfixExpression NumberLiteral empty
x SimpleName InfixExpression SimpleName x sz
y SimpleName InfixExpression NumberLiteral empty
y SimpleName InfixExpression SimpleName y sz
rasters SimpleName ArrayAccess SimpleName y
row SimpleName VariableDeclarationFragment ArrayAccess SimpleName rasters
row SimpleName VariableDeclarationFragment ArrayAccess SimpleName y
row SimpleName ArrayAccess SimpleName x
item SimpleName VariableDeclarationFragment ArrayAccess SimpleName row
item SimpleName VariableDeclarationFragment ArrayAccess SimpleName x
tile lru member SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName item
item SimpleName MethodInvocation SimpleName retrieve raster
ret SimpleName VariableDeclarationFragment MethodInvocation SimpleName item
ret SimpleName VariableDeclarationFragment MethodInvocation SimpleName retrieve raster
raster SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName ret
cache SimpleName MethodInvocation SimpleName add
cache SimpleName MethodInvocation SimpleName item
add SimpleName MethodInvocation SimpleName item
public Modifier MethodDeclaration SimpleType SimpleName raster
public Modifier MethodDeclaration SimpleName get tile no compute
public Modifier MethodDeclaration SingleVariableDeclaration PrimitiveType int
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName x
public Modifier MethodDeclaration SingleVariableDeclaration PrimitiveType int
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName y
public Modifier MethodDeclaration Block ReturnStatement SimpleName ret
raster SimpleName SimpleType MethodDeclaration SimpleName get tile no compute
raster SimpleName SimpleType MethodDeclaration SingleVariableDeclaration PrimitiveType int
raster SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName x
raster SimpleName SimpleType MethodDeclaration SingleVariableDeclaration PrimitiveType int
raster SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName y
get tile no compute SimpleName MethodDeclaration SingleVariableDeclaration PrimitiveType int
get tile no compute SimpleName MethodDeclaration SingleVariableDeclaration SimpleName x
get tile no compute SimpleName MethodDeclaration SingleVariableDeclaration PrimitiveType int
get tile no compute SimpleName MethodDeclaration SingleVariableDeclaration SimpleName y
get tile no compute SimpleName MethodDeclaration Block ReturnStatement SimpleName ret
int PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
int PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName y
x SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
x SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName y
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName raster
public Modifier TypeDeclaration MethodDeclaration SimpleName get tile no compute
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName x
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName y
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName raster
test SimpleName TypeDeclaration MethodDeclaration SimpleName get tile no compute
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName x
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName y
