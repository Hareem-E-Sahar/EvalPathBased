render context SimpleName SimpleType SingleVariableDeclaration SimpleName rc
rc SimpleName MethodInvocation SimpleName get rendering hints
rh SimpleName VariableDeclarationFragment MethodInvocation SimpleName rc
rh SimpleName VariableDeclarationFragment MethodInvocation SimpleName get rendering hints
rendering hints SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName rh
rh SimpleName Assignment ClassInstanceCreation SimpleType SimpleName rendering hints
src SimpleName VariableDeclarationFragment MethodInvocation SimpleName get source
filter SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName src
rc SimpleName MethodInvocation SimpleName get area of interest
aoi SimpleName VariableDeclarationFragment MethodInvocation SimpleName rc
aoi SimpleName VariableDeclarationFragment MethodInvocation SimpleName get area of interest
shape SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName aoi
aoi SimpleName Assignment MethodInvocation SimpleName get bounds d
src SimpleName MethodInvocation SimpleName get bounds d
srect SimpleName VariableDeclarationFragment MethodInvocation SimpleName src
srect SimpleName VariableDeclarationFragment MethodInvocation SimpleName get bounds d
rectangle d SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName srect
rect SimpleName VariableDeclarationFragment MethodInvocation SimpleName get bounds d
rectangle d SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName rect
aoi SimpleName MethodInvocation SimpleName get bounds d
arect SimpleName VariableDeclarationFragment MethodInvocation SimpleName aoi
arect SimpleName VariableDeclarationFragment MethodInvocation SimpleName get bounds d
rectangle d SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName arect
rectangle d SimpleName MethodInvocation SimpleName intersect
rectangle d SimpleName MethodInvocation SimpleName arect
rectangle d SimpleName MethodInvocation SimpleName rect
rectangle d SimpleName MethodInvocation SimpleName arect
intersect SimpleName MethodInvocation SimpleName arect
intersect SimpleName MethodInvocation SimpleName rect
intersect SimpleName MethodInvocation SimpleName arect
arect SimpleName MethodInvocation SimpleName rect
arect SimpleName MethodInvocation SimpleName arect
rect SimpleName MethodInvocation SimpleName arect
rectangle d SimpleName MethodInvocation SimpleName intersect
rectangle d SimpleName MethodInvocation SimpleName srect
rectangle d SimpleName MethodInvocation SimpleName arect
rectangle d SimpleName MethodInvocation SimpleName srect
intersect SimpleName MethodInvocation SimpleName srect
intersect SimpleName MethodInvocation SimpleName arect
intersect SimpleName MethodInvocation SimpleName srect
srect SimpleName MethodInvocation SimpleName arect
srect SimpleName MethodInvocation SimpleName srect
arect SimpleName MethodInvocation SimpleName srect
rc SimpleName MethodInvocation SimpleName get transform
at SimpleName VariableDeclarationFragment MethodInvocation SimpleName rc
at SimpleName VariableDeclarationFragment MethodInvocation SimpleName get transform
affine transform SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName at
src pad rect StringLiteral InfixExpression SimpleName srect
systemout QualifiedName MethodInvocation SimpleName println
systemout QualifiedName MethodInvocation InfixExpression StringLiteral src pad rect
systemout QualifiedName MethodInvocation InfixExpression SimpleName srect
println SimpleName MethodInvocation InfixExpression StringLiteral src pad rect
println SimpleName MethodInvocation InfixExpression SimpleName srect
render context SimpleName SimpleType ClassInstanceCreation SimpleName at
render context SimpleName SimpleType ClassInstanceCreation SimpleName srect
render context SimpleName SimpleType ClassInstanceCreation SimpleName rh
at SimpleName ClassInstanceCreation SimpleName srect
at SimpleName ClassInstanceCreation SimpleName rh
srect SimpleName ClassInstanceCreation SimpleName rh
src rc SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName render context
src rc SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName at
src rc SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName srect
src rc SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName rh
render context SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName src rc
src SimpleName MethodInvocation SimpleName create rendering
src SimpleName MethodInvocation SimpleName src rc
create rendering SimpleName MethodInvocation SimpleName src rc
ri SimpleName VariableDeclarationFragment MethodInvocation SimpleName src
ri SimpleName VariableDeclarationFragment MethodInvocation SimpleName create rendering
ri SimpleName VariableDeclarationFragment MethodInvocation SimpleName src rc
rendered image SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName ri
concrete rendered image cachable red SimpleName MethodInvocation SimpleName wrap
concrete rendered image cachable red SimpleName MethodInvocation SimpleName ri
wrap SimpleName MethodInvocation SimpleName ri
cr SimpleName VariableDeclarationFragment MethodInvocation SimpleName concrete rendered image cachable red
cr SimpleName VariableDeclarationFragment MethodInvocation SimpleName wrap
cr SimpleName VariableDeclarationFragment MethodInvocation SimpleName ri
cachable red SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName cr
at SimpleName MethodInvocation SimpleName create transformed shape
at SimpleName MethodInvocation SimpleName arect
create transformed shape SimpleName MethodInvocation SimpleName arect
at SimpleName MethodInvocation MethodInvocation SimpleName get bounds d
create transformed shape SimpleName MethodInvocation MethodInvocation SimpleName get bounds d
arect SimpleName MethodInvocation MethodInvocation SimpleName get bounds d
arect SimpleName Assignment MethodInvocation MethodInvocation SimpleName at
arect SimpleName Assignment MethodInvocation MethodInvocation SimpleName create transformed shape
arect SimpleName Assignment MethodInvocation MethodInvocation SimpleName arect
arect SimpleName Assignment MethodInvocation SimpleName get bounds d
aoi pad rect StringLiteral InfixExpression SimpleName arect
systemout QualifiedName MethodInvocation SimpleName println
systemout QualifiedName MethodInvocation InfixExpression StringLiteral aoi pad rect
systemout QualifiedName MethodInvocation InfixExpression SimpleName arect
println SimpleName MethodInvocation InfixExpression StringLiteral aoi pad rect
println SimpleName MethodInvocation InfixExpression SimpleName arect
arect SimpleName MethodInvocation SimpleName get bounds
pad red SimpleName SimpleType ClassInstanceCreation SimpleName cr
pad red SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName arect
pad red SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get bounds
pad red SimpleName SimpleType ClassInstanceCreation SimpleName pad mode
pad red SimpleName SimpleType ClassInstanceCreation SimpleName rh
cr SimpleName ClassInstanceCreation MethodInvocation SimpleName arect
cr SimpleName ClassInstanceCreation MethodInvocation SimpleName get bounds
cr SimpleName ClassInstanceCreation SimpleName pad mode
cr SimpleName ClassInstanceCreation SimpleName rh
arect SimpleName MethodInvocation ClassInstanceCreation SimpleName pad mode
get bounds SimpleName MethodInvocation ClassInstanceCreation SimpleName pad mode
arect SimpleName MethodInvocation ClassInstanceCreation SimpleName rh
get bounds SimpleName MethodInvocation ClassInstanceCreation SimpleName rh
pad mode SimpleName ClassInstanceCreation SimpleName rh
public Modifier MethodDeclaration SimpleType SimpleName rendered image
public Modifier MethodDeclaration SimpleName create rendering
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName render context
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName rc
rendered image SimpleName SimpleType MethodDeclaration SimpleName create rendering
rendered image SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName rc
create rendering SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName render context
create rendering SimpleName MethodDeclaration SingleVariableDeclaration SimpleName rc
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName rendered image
public Modifier TypeDeclaration MethodDeclaration SimpleName create rendering
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName rc
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName rendered image
test SimpleName TypeDeclaration MethodDeclaration SimpleName create rendering
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName rc