affine transform SimpleName SimpleType SingleVariableDeclaration SimpleName txf
txf SimpleName Assignment ClassInstanceCreation SimpleType SimpleName affine transform
txf SimpleName FieldAccess Assignment SimpleName txf
double PrimitiveType ArrayType ArrayCreation NumberLiteral empty
m SimpleName VariableDeclarationFragment ArrayCreation ArrayType PrimitiveType double
m SimpleName VariableDeclarationFragment ArrayCreation NumberLiteral empty
double PrimitiveType ArrayType VariableDeclarationStatement VariableDeclarationFragment SimpleName m
txf SimpleName MethodInvocation SimpleName get matrix
txf SimpleName MethodInvocation SimpleName m
get matrix SimpleName MethodInvocation SimpleName m
m SimpleName ArrayAccess NumberLiteral empty
tx model SimpleName MethodInvocation SimpleName set value
tx model SimpleName MethodInvocation ArrayAccess SimpleName m
tx model SimpleName MethodInvocation ArrayAccess NumberLiteral empty
set value SimpleName MethodInvocation ArrayAccess SimpleName m
set value SimpleName MethodInvocation ArrayAccess NumberLiteral empty
m SimpleName ArrayAccess NumberLiteral empty
ty model SimpleName MethodInvocation SimpleName set value
ty model SimpleName MethodInvocation ArrayAccess SimpleName m
ty model SimpleName MethodInvocation ArrayAccess NumberLiteral empty
set value SimpleName MethodInvocation ArrayAccess SimpleName m
set value SimpleName MethodInvocation ArrayAccess NumberLiteral empty
m SimpleName ArrayAccess NumberLiteral empty
m SimpleName ArrayAccess NumberLiteral empty
m SimpleName ArrayAccess InfixExpression ArrayAccess SimpleName m
m SimpleName ArrayAccess InfixExpression ArrayAccess NumberLiteral empty
empty NumberLiteral ArrayAccess InfixExpression ArrayAccess SimpleName m
empty NumberLiteral ArrayAccess InfixExpression ArrayAccess NumberLiteral empty
m SimpleName ArrayAccess NumberLiteral empty
m SimpleName ArrayAccess NumberLiteral empty
m SimpleName ArrayAccess InfixExpression ArrayAccess SimpleName m
m SimpleName ArrayAccess InfixExpression ArrayAccess NumberLiteral empty
empty NumberLiteral ArrayAccess InfixExpression ArrayAccess SimpleName m
empty NumberLiteral ArrayAccess InfixExpression ArrayAccess NumberLiteral empty
math SimpleName MethodInvocation SimpleName sqrt
sx SimpleName VariableDeclarationFragment MethodInvocation SimpleName math
sx SimpleName VariableDeclarationFragment MethodInvocation SimpleName sqrt
double PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName sx
double PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName math
double PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName sqrt
m SimpleName ArrayAccess NumberLiteral empty
m SimpleName ArrayAccess NumberLiteral empty
m SimpleName ArrayAccess InfixExpression ArrayAccess SimpleName m
m SimpleName ArrayAccess InfixExpression ArrayAccess NumberLiteral empty
empty NumberLiteral ArrayAccess InfixExpression ArrayAccess SimpleName m
empty NumberLiteral ArrayAccess InfixExpression ArrayAccess NumberLiteral empty
m SimpleName ArrayAccess NumberLiteral empty
m SimpleName ArrayAccess NumberLiteral empty
m SimpleName ArrayAccess InfixExpression ArrayAccess SimpleName m
m SimpleName ArrayAccess InfixExpression ArrayAccess NumberLiteral empty
empty NumberLiteral ArrayAccess InfixExpression ArrayAccess SimpleName m
empty NumberLiteral ArrayAccess InfixExpression ArrayAccess NumberLiteral empty
math SimpleName MethodInvocation SimpleName sqrt
sy SimpleName VariableDeclarationFragment MethodInvocation SimpleName math
sy SimpleName VariableDeclarationFragment MethodInvocation SimpleName sqrt
double PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName sy
double PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName math
double PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName sqrt
empty NumberLiteral InfixExpression SimpleName sx
sx model SimpleName MethodInvocation SimpleName set value
sx model SimpleName MethodInvocation InfixExpression NumberLiteral empty
sx model SimpleName MethodInvocation InfixExpression SimpleName sx
set value SimpleName MethodInvocation InfixExpression NumberLiteral empty
set value SimpleName MethodInvocation InfixExpression SimpleName sx
empty NumberLiteral InfixExpression SimpleName sy
sy model SimpleName MethodInvocation SimpleName set value
sy model SimpleName MethodInvocation InfixExpression NumberLiteral empty
sy model SimpleName MethodInvocation InfixExpression SimpleName sy
set value SimpleName MethodInvocation InfixExpression NumberLiteral empty
set value SimpleName MethodInvocation InfixExpression SimpleName sy
theta SimpleName VariableDeclarationFragment NumberLiteral empty
double PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName theta
double PrimitiveType VariableDeclarationStatement VariableDeclarationFragment NumberLiteral empty
m SimpleName ArrayAccess NumberLiteral empty
m SimpleName ArrayAccess InfixExpression NumberLiteral empty
empty NumberLiteral ArrayAccess InfixExpression NumberLiteral empty
m SimpleName ArrayAccess NumberLiteral empty
m SimpleName ArrayAccess NumberLiteral empty
math SimpleName MethodInvocation SimpleName atan
math SimpleName MethodInvocation ArrayAccess SimpleName m
math SimpleName MethodInvocation ArrayAccess NumberLiteral empty
math SimpleName MethodInvocation ArrayAccess SimpleName m
math SimpleName MethodInvocation ArrayAccess NumberLiteral empty
atan SimpleName MethodInvocation ArrayAccess SimpleName m
atan SimpleName MethodInvocation ArrayAccess NumberLiteral empty
atan SimpleName MethodInvocation ArrayAccess SimpleName m
atan SimpleName MethodInvocation ArrayAccess NumberLiteral empty
m SimpleName ArrayAccess MethodInvocation ArrayAccess SimpleName m
m SimpleName ArrayAccess MethodInvocation ArrayAccess NumberLiteral empty
empty NumberLiteral ArrayAccess MethodInvocation ArrayAccess SimpleName m
empty NumberLiteral ArrayAccess MethodInvocation ArrayAccess NumberLiteral empty
theta SimpleName Assignment MethodInvocation SimpleName math
theta SimpleName Assignment MethodInvocation SimpleName atan
theta SimpleName Assignment MethodInvocation ArrayAccess SimpleName m
theta SimpleName Assignment MethodInvocation ArrayAccess NumberLiteral empty
theta SimpleName Assignment MethodInvocation ArrayAccess SimpleName m
theta SimpleName Assignment MethodInvocation ArrayAccess NumberLiteral empty
rad to deg SimpleName InfixExpression SimpleName theta
rotate model SimpleName MethodInvocation SimpleName set value
rotate model SimpleName MethodInvocation InfixExpression SimpleName rad to deg
rotate model SimpleName MethodInvocation InfixExpression SimpleName theta
set value SimpleName MethodInvocation InfixExpression SimpleName rad to deg
set value SimpleName MethodInvocation InfixExpression SimpleName theta
rx model SimpleName MethodInvocation SimpleName set value
rx model SimpleName MethodInvocation NumberLiteral empty
set value SimpleName MethodInvocation NumberLiteral empty
ry model SimpleName MethodInvocation SimpleName set value
ry model SimpleName MethodInvocation NumberLiteral empty
set value SimpleName MethodInvocation NumberLiteral empty
double PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType double
double PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType double
double PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType double
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName set affine transform
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName affine transform
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName txf
public Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType double
public Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType double
public Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType double
void PrimitiveType MethodDeclaration SimpleName set affine transform
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName affine transform
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName txf
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType double
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType double
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType double
set affine transform SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName affine transform
set affine transform SimpleName MethodDeclaration SingleVariableDeclaration SimpleName txf
set affine transform SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType double
set affine transform SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType double
set affine transform SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType double
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName set affine transform
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName txf
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName set affine transform
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName txf
