render context SimpleName SimpleType SingleVariableDeclaration SimpleName render context
render context SimpleName MethodInvocation SimpleName get transform
usr dev SimpleName VariableDeclarationFragment MethodInvocation SimpleName render context
usr dev SimpleName VariableDeclarationFragment MethodInvocation SimpleName get transform
affine transform SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName usr dev
usr dev SimpleName Assignment ClassInstanceCreation SimpleType SimpleName affine transform
image rect SimpleName VariableDeclarationFragment MethodInvocation SimpleName get bounds d
rectangle d SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName image rect
usr dev SimpleName MethodInvocation SimpleName create transformed shape
usr dev SimpleName MethodInvocation SimpleName image rect
create transformed shape SimpleName MethodInvocation SimpleName image rect
usr dev SimpleName MethodInvocation MethodInvocation SimpleName get bounds
create transformed shape SimpleName MethodInvocation MethodInvocation SimpleName get bounds
image rect SimpleName MethodInvocation MethodInvocation SimpleName get bounds
renderable area SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName usr dev
renderable area SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName create transformed shape
renderable area SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName image rect
renderable area SimpleName VariableDeclarationFragment MethodInvocation SimpleName get bounds
rectangle SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName renderable area
render context SimpleName MethodInvocation SimpleName get area of interest
usr aoi SimpleName VariableDeclarationFragment MethodInvocation SimpleName render context
usr aoi SimpleName VariableDeclarationFragment MethodInvocation SimpleName get area of interest
shape SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName usr aoi
usr aoi SimpleName Assignment SimpleName image rect
usr dev SimpleName MethodInvocation SimpleName create transformed shape
usr dev SimpleName MethodInvocation SimpleName usr aoi
create transformed shape SimpleName MethodInvocation SimpleName usr aoi
usr dev SimpleName MethodInvocation MethodInvocation SimpleName get bounds
create transformed shape SimpleName MethodInvocation MethodInvocation SimpleName get bounds
usr aoi SimpleName MethodInvocation MethodInvocation SimpleName get bounds
dev aoi SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName usr dev
dev aoi SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName create transformed shape
dev aoi SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName usr aoi
dev aoi SimpleName VariableDeclarationFragment MethodInvocation SimpleName get bounds
rectangle SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName dev aoi
renderable area SimpleName MethodInvocation SimpleName create intersection
renderable area SimpleName MethodInvocation SimpleName dev aoi
create intersection SimpleName MethodInvocation SimpleName dev aoi
renderable area SimpleName MethodInvocation MethodInvocation SimpleName get bounds
create intersection SimpleName MethodInvocation MethodInvocation SimpleName get bounds
dev aoi SimpleName MethodInvocation MethodInvocation SimpleName get bounds
rendered area SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName renderable area
rendered area SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName create intersection
rendered area SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName dev aoi
rendered area SimpleName VariableDeclarationFragment MethodInvocation SimpleName get bounds
final Modifier VariableDeclarationStatement SimpleType SimpleName rectangle
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName rendered area
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get bounds
rectangle SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName rendered area
filter resolution x SimpleName VariableDeclarationFragment FieldAccess SimpleName filter resolution x
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName filter resolution x
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment FieldAccess SimpleName filter resolution x
filter resolution y SimpleName VariableDeclarationFragment FieldAccess SimpleName filter resolution y
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName filter resolution y
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment FieldAccess SimpleName filter resolution y
filter resolution x SimpleName InfixExpression NumberLiteral empty
scale x SimpleName VariableDeclarationFragment NumberLiteral empty
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName scale x
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment NumberLiteral empty
scale y SimpleName VariableDeclarationFragment NumberLiteral empty
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName scale y
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment NumberLiteral empty
filter resolution x SimpleName InfixExpression QualifiedName rendered areawidth
float PrimitiveType CastExpression QualifiedName rendered areawidth
filter resolution x SimpleName InfixExpression CastExpression PrimitiveType float
filter resolution x SimpleName InfixExpression CastExpression QualifiedName rendered areawidth
scale x SimpleName Assignment InfixExpression SimpleName filter resolution x
scale x SimpleName Assignment InfixExpression CastExpression PrimitiveType float
scale x SimpleName Assignment InfixExpression CastExpression QualifiedName rendered areawidth
filter resolution y SimpleName InfixExpression NumberLiteral empty
filter resolution y SimpleName InfixExpression NumberLiteral empty
scale x SimpleName InfixExpression QualifiedName rendered areaheight
filter resolution y SimpleName Assignment InfixExpression SimpleName scale x
filter resolution y SimpleName Assignment InfixExpression QualifiedName rendered areaheight
filter resolution y SimpleName InfixExpression QualifiedName rendered areaheight
float PrimitiveType CastExpression QualifiedName rendered areaheight
filter resolution y SimpleName InfixExpression CastExpression PrimitiveType float
filter resolution y SimpleName InfixExpression CastExpression QualifiedName rendered areaheight
scale y SimpleName Assignment InfixExpression SimpleName filter resolution y
scale y SimpleName Assignment InfixExpression CastExpression PrimitiveType float
scale y SimpleName Assignment InfixExpression CastExpression QualifiedName rendered areaheight
local source SimpleName VariableDeclarationFragment MethodInvocation SimpleName get source
renderable image SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName local source
local render context SimpleName VariableDeclarationFragment SimpleName render context
render context SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName local render context
render context SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName render context
scale x SimpleName InfixExpression NumberLiteral empty
scale y SimpleName InfixExpression NumberLiteral empty
affine transform SimpleName MethodInvocation SimpleName get scale instance
affine transform SimpleName MethodInvocation SimpleName scale x
affine transform SimpleName MethodInvocation SimpleName scale y
get scale instance SimpleName MethodInvocation SimpleName scale x
get scale instance SimpleName MethodInvocation SimpleName scale y
scale x SimpleName MethodInvocation SimpleName scale y
new usr dev SimpleName VariableDeclarationFragment MethodInvocation SimpleName affine transform
new usr dev SimpleName VariableDeclarationFragment MethodInvocation SimpleName get scale instance
new usr dev SimpleName VariableDeclarationFragment MethodInvocation SimpleName scale x
new usr dev SimpleName VariableDeclarationFragment MethodInvocation SimpleName scale y
affine transform SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName new usr dev
new usr dev SimpleName MethodInvocation SimpleName concatenate
new usr dev SimpleName MethodInvocation SimpleName usr dev
concatenate SimpleName MethodInvocation SimpleName usr dev
render context SimpleName MethodInvocation SimpleName clone
render context SimpleName SimpleType CastExpression MethodInvocation SimpleName render context
render context SimpleName SimpleType CastExpression MethodInvocation SimpleName clone
new render context SimpleName VariableDeclarationFragment CastExpression SimpleType SimpleName render context
new render context SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName render context
new render context SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName clone
render context SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName new render context
new render context SimpleName MethodInvocation SimpleName set transform
new render context SimpleName MethodInvocation SimpleName new usr dev
set transform SimpleName MethodInvocation SimpleName new usr dev
empty NumberLiteral InfixExpression SimpleName scale x
empty NumberLiteral InfixExpression SimpleName scale y
affine transform SimpleName MethodInvocation SimpleName get scale instance
affine transform SimpleName MethodInvocation InfixExpression NumberLiteral empty
affine transform SimpleName MethodInvocation InfixExpression SimpleName scale x
affine transform SimpleName MethodInvocation InfixExpression NumberLiteral empty
affine transform SimpleName MethodInvocation InfixExpression SimpleName scale y
get scale instance SimpleName MethodInvocation InfixExpression NumberLiteral empty
get scale instance SimpleName MethodInvocation InfixExpression SimpleName scale x
get scale instance SimpleName MethodInvocation InfixExpression NumberLiteral empty
get scale instance SimpleName MethodInvocation InfixExpression SimpleName scale y
empty NumberLiteral InfixExpression MethodInvocation InfixExpression NumberLiteral empty
empty NumberLiteral InfixExpression MethodInvocation InfixExpression SimpleName scale y
scale x SimpleName InfixExpression MethodInvocation InfixExpression NumberLiteral empty
scale x SimpleName InfixExpression MethodInvocation InfixExpression SimpleName scale y
resample txf SimpleName VariableDeclarationFragment MethodInvocation SimpleName affine transform
resample txf SimpleName VariableDeclarationFragment MethodInvocation SimpleName get scale instance
resample txf SimpleName VariableDeclarationFragment MethodInvocation InfixExpression NumberLiteral empty
resample txf SimpleName VariableDeclarationFragment MethodInvocation InfixExpression SimpleName scale x
resample txf SimpleName VariableDeclarationFragment MethodInvocation InfixExpression NumberLiteral empty
resample txf SimpleName VariableDeclarationFragment MethodInvocation InfixExpression SimpleName scale y
affine transform SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName resample txf
rendered image SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName result
local source SimpleName MethodInvocation SimpleName create rendering
local source SimpleName MethodInvocation SimpleName new render context
create rendering SimpleName MethodInvocation SimpleName new render context
result SimpleName Assignment MethodInvocation SimpleName local source
result SimpleName Assignment MethodInvocation SimpleName create rendering
result SimpleName Assignment MethodInvocation SimpleName new render context
concrete rendered image cachable red SimpleName MethodInvocation SimpleName wrap
concrete rendered image cachable red SimpleName MethodInvocation SimpleName result
wrap SimpleName MethodInvocation SimpleName result
render context SimpleName MethodInvocation SimpleName get rendering hints
affine red SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName concrete rendered image cachable red
affine red SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName wrap
affine red SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName result
affine red SimpleName SimpleType ClassInstanceCreation SimpleName resample txf
affine red SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName render context
affine red SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get rendering hints
concrete rendered image cachable red SimpleName MethodInvocation ClassInstanceCreation SimpleName resample txf
wrap SimpleName MethodInvocation ClassInstanceCreation SimpleName resample txf
result SimpleName MethodInvocation ClassInstanceCreation SimpleName resample txf
concrete rendered image cachable red SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName render context
concrete rendered image cachable red SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get rendering hints
wrap SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName render context
wrap SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get rendering hints
result SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName render context
result SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get rendering hints
resample txf SimpleName ClassInstanceCreation MethodInvocation SimpleName render context
resample txf SimpleName ClassInstanceCreation MethodInvocation SimpleName get rendering hints
result SimpleName Assignment ClassInstanceCreation SimpleType SimpleName affine red
result SimpleName Assignment ClassInstanceCreation MethodInvocation SimpleName concrete rendered image cachable red
result SimpleName Assignment ClassInstanceCreation MethodInvocation SimpleName wrap
result SimpleName Assignment ClassInstanceCreation MethodInvocation SimpleName result
result SimpleName Assignment ClassInstanceCreation SimpleName resample txf
result SimpleName Assignment ClassInstanceCreation MethodInvocation SimpleName render context
result SimpleName Assignment ClassInstanceCreation MethodInvocation SimpleName get rendering hints
local source SimpleName MethodInvocation SimpleName create rendering
local source SimpleName MethodInvocation SimpleName local render context
create rendering SimpleName MethodInvocation SimpleName local render context
float PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType float
final Modifier VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType float
final Modifier VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType float
float PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType float
public Modifier MethodDeclaration SimpleType SimpleName rendered image
public Modifier MethodDeclaration SimpleName create rendering
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName render context
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName render context
public Modifier MethodDeclaration Block VariableDeclarationStatement Modifier final
public Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType float
public Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType float
rendered image SimpleName SimpleType MethodDeclaration SimpleName create rendering
rendered image SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName render context
create rendering SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName render context
create rendering SimpleName MethodDeclaration SingleVariableDeclaration SimpleName render context
create rendering SimpleName MethodDeclaration Block VariableDeclarationStatement Modifier final
create rendering SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType float
create rendering SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType float
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName rendered image
public Modifier TypeDeclaration MethodDeclaration SimpleName create rendering
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName render context
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName rendered image
test SimpleName TypeDeclaration MethodDeclaration SimpleName create rendering
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName render context
