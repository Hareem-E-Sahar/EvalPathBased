bridge context SimpleName SimpleType SingleVariableDeclaration SimpleName ctx
element SimpleName SimpleType SingleVariableDeclaration SimpleName e
parsed url SimpleName SimpleType SingleVariableDeclaration SimpleName purl
get image bounds SimpleName MethodInvocation SimpleName ctx
get image bounds SimpleName MethodInvocation SimpleName e
ctx SimpleName MethodInvocation SimpleName e
bounds SimpleName VariableDeclarationFragment MethodInvocation SimpleName get image bounds
bounds SimpleName VariableDeclarationFragment MethodInvocation SimpleName ctx
bounds SimpleName VariableDeclarationFragment MethodInvocation SimpleName e
rectangle d SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName bounds
bounds SimpleName MethodInvocation SimpleName get width
bounds SimpleName MethodInvocation InfixExpression NumberLiteral empty
get width SimpleName MethodInvocation InfixExpression NumberLiteral empty
bounds SimpleName MethodInvocation SimpleName get height
bounds SimpleName MethodInvocation InfixExpression NumberLiteral empty
get height SimpleName MethodInvocation InfixExpression NumberLiteral empty
sn SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName shape node
shape node SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName sn
sn SimpleName MethodInvocation SimpleName set shape
sn SimpleName MethodInvocation SimpleName bounds
set shape SimpleName MethodInvocation SimpleName bounds
e SimpleName MethodInvocation SimpleName get owner document
svg document SimpleName SimpleType CastExpression MethodInvocation SimpleName e
svg document SimpleName SimpleType CastExpression MethodInvocation SimpleName get owner document
svg doc SimpleName VariableDeclarationFragment CastExpression SimpleType SimpleName svg document
svg doc SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName e
svg doc SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName get owner document
svg document SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName svg doc
svg doc SimpleName MethodInvocation SimpleName get url
doc url SimpleName VariableDeclarationFragment MethodInvocation SimpleName svg doc
doc url SimpleName VariableDeclarationFragment MethodInvocation SimpleName get url
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName doc url
parsed url SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName p doc url
parsed url SimpleName SimpleType ClassInstanceCreation SimpleName doc url
p doc url SimpleName Assignment ClassInstanceCreation SimpleType SimpleName parsed url
p doc url SimpleName Assignment ClassInstanceCreation SimpleName doc url
ctx SimpleName MethodInvocation SimpleName get user agent
user agent SimpleName VariableDeclarationFragment MethodInvocation SimpleName ctx
user agent SimpleName VariableDeclarationFragment MethodInvocation SimpleName get user agent
user agent SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName user agent
user agent SimpleName MethodInvocation SimpleName check load external resource
user agent SimpleName MethodInvocation SimpleName purl
user agent SimpleName MethodInvocation SimpleName p doc url
check load external resource SimpleName MethodInvocation SimpleName purl
check load external resource SimpleName MethodInvocation SimpleName p doc url
purl SimpleName MethodInvocation SimpleName p doc url
security exception SimpleName SimpleType SingleVariableDeclaration SimpleName ex
bridge exception SimpleName SimpleType ClassInstanceCreation SimpleName ctx
bridge exception SimpleName SimpleType ClassInstanceCreation SimpleName e
bridge exception SimpleName SimpleType ClassInstanceCreation SimpleName err uri unsecure
ctx SimpleName ClassInstanceCreation SimpleName e
ctx SimpleName ClassInstanceCreation SimpleName err uri unsecure
ctx SimpleName ClassInstanceCreation ArrayCreation ArrayInitializer SimpleName purl
e SimpleName ClassInstanceCreation SimpleName err uri unsecure
e SimpleName ClassInstanceCreation ArrayCreation ArrayInitializer SimpleName purl
err uri unsecure SimpleName ClassInstanceCreation ArrayCreation ArrayInitializer SimpleName purl
ctx SimpleName MethodInvocation SimpleName get document loader
loader SimpleName VariableDeclarationFragment MethodInvocation SimpleName ctx
loader SimpleName VariableDeclarationFragment MethodInvocation SimpleName get document loader
document loader SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName loader
image tag registry SimpleName MethodInvocation SimpleName get registry
reg SimpleName VariableDeclarationFragment MethodInvocation SimpleName image tag registry
reg SimpleName VariableDeclarationFragment MethodInvocation SimpleName get registry
image tag registry SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName reg
extract color space SimpleName MethodInvocation SimpleName e
extract color space SimpleName MethodInvocation SimpleName ctx
e SimpleName MethodInvocation SimpleName ctx
colorspace SimpleName VariableDeclarationFragment MethodInvocation SimpleName extract color space
colorspace SimpleName VariableDeclarationFragment MethodInvocation SimpleName e
colorspace SimpleName VariableDeclarationFragment MethodInvocation SimpleName ctx
icc color space ext SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName colorspace
purl SimpleName MethodInvocation SimpleName to string
loader SimpleName MethodInvocation SimpleName check cache
loader SimpleName MethodInvocation MethodInvocation SimpleName purl
loader SimpleName MethodInvocation MethodInvocation SimpleName to string
check cache SimpleName MethodInvocation MethodInvocation SimpleName purl
check cache SimpleName MethodInvocation MethodInvocation SimpleName to string
doc SimpleName VariableDeclarationFragment MethodInvocation SimpleName loader
doc SimpleName VariableDeclarationFragment MethodInvocation SimpleName check cache
doc SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName purl
doc SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName to string
document SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName doc
svg document SimpleName SimpleType CastExpression SimpleName doc
img document SimpleName Assignment CastExpression SimpleType SimpleName svg document
img document SimpleName Assignment CastExpression SimpleName doc
create svg image node SimpleName MethodInvocation SimpleName ctx
create svg image node SimpleName MethodInvocation SimpleName e
create svg image node SimpleName MethodInvocation SimpleName img document
ctx SimpleName MethodInvocation SimpleName e
ctx SimpleName MethodInvocation SimpleName img document
e SimpleName MethodInvocation SimpleName img document
bridge exception SimpleName SimpleType SingleVariableDeclaration SimpleName ex
exception SimpleName SimpleType SingleVariableDeclaration SimpleName ex
reg SimpleName MethodInvocation SimpleName check cache
reg SimpleName MethodInvocation SimpleName purl
reg SimpleName MethodInvocation SimpleName colorspace
check cache SimpleName MethodInvocation SimpleName purl
check cache SimpleName MethodInvocation SimpleName colorspace
purl SimpleName MethodInvocation SimpleName colorspace
img SimpleName VariableDeclarationFragment MethodInvocation SimpleName reg
img SimpleName VariableDeclarationFragment MethodInvocation SimpleName check cache
img SimpleName VariableDeclarationFragment MethodInvocation SimpleName purl
img SimpleName VariableDeclarationFragment MethodInvocation SimpleName colorspace
filter SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName img
create raster image node SimpleName MethodInvocation SimpleName ctx
create raster image node SimpleName MethodInvocation SimpleName e
create raster image node SimpleName MethodInvocation SimpleName img
create raster image node SimpleName MethodInvocation SimpleName purl
ctx SimpleName MethodInvocation SimpleName e
ctx SimpleName MethodInvocation SimpleName img
ctx SimpleName MethodInvocation SimpleName purl
e SimpleName MethodInvocation SimpleName img
e SimpleName MethodInvocation SimpleName purl
img SimpleName MethodInvocation SimpleName purl
protected stream SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName reference
open stream SimpleName MethodInvocation SimpleName e
open stream SimpleName MethodInvocation SimpleName purl
e SimpleName MethodInvocation SimpleName purl
reference SimpleName Assignment MethodInvocation SimpleName open stream
reference SimpleName Assignment MethodInvocation SimpleName e
reference SimpleName Assignment MethodInvocation SimpleName purl
security exception SimpleName SimpleType SingleVariableDeclaration SimpleName ex
bridge exception SimpleName SimpleType ClassInstanceCreation SimpleName ctx
bridge exception SimpleName SimpleType ClassInstanceCreation SimpleName e
bridge exception SimpleName SimpleType ClassInstanceCreation SimpleName err uri unsecure
ctx SimpleName ClassInstanceCreation SimpleName e
ctx SimpleName ClassInstanceCreation SimpleName err uri unsecure
ctx SimpleName ClassInstanceCreation ArrayCreation ArrayInitializer SimpleName purl
e SimpleName ClassInstanceCreation SimpleName err uri unsecure
e SimpleName ClassInstanceCreation ArrayCreation ArrayInitializer SimpleName purl
err uri unsecure SimpleName ClassInstanceCreation ArrayCreation ArrayInitializer SimpleName purl
io exception SimpleName SimpleType SingleVariableDeclaration SimpleName ioe
purl SimpleName MethodInvocation SimpleName to string
ioe SimpleName MethodInvocation SimpleName get localized message
create broken image node SimpleName MethodInvocation SimpleName ctx
create broken image node SimpleName MethodInvocation SimpleName e
create broken image node SimpleName MethodInvocation MethodInvocation SimpleName purl
create broken image node SimpleName MethodInvocation MethodInvocation SimpleName to string
create broken image node SimpleName MethodInvocation MethodInvocation SimpleName ioe
create broken image node SimpleName MethodInvocation MethodInvocation SimpleName get localized message
ctx SimpleName MethodInvocation SimpleName e
ctx SimpleName MethodInvocation MethodInvocation SimpleName purl
ctx SimpleName MethodInvocation MethodInvocation SimpleName to string
ctx SimpleName MethodInvocation MethodInvocation SimpleName ioe
ctx SimpleName MethodInvocation MethodInvocation SimpleName get localized message
e SimpleName MethodInvocation MethodInvocation SimpleName purl
e SimpleName MethodInvocation MethodInvocation SimpleName to string
e SimpleName MethodInvocation MethodInvocation SimpleName ioe
e SimpleName MethodInvocation MethodInvocation SimpleName get localized message
purl SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName ioe
purl SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get localized message
to string SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName ioe
to string SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get localized message
reg SimpleName MethodInvocation SimpleName read url
reg SimpleName MethodInvocation SimpleName reference
reg SimpleName MethodInvocation SimpleName purl
reg SimpleName MethodInvocation SimpleName colorspace
reg SimpleName MethodInvocation BooleanLiteral false
read url SimpleName MethodInvocation SimpleName reference
read url SimpleName MethodInvocation SimpleName purl
read url SimpleName MethodInvocation SimpleName colorspace
read url SimpleName MethodInvocation BooleanLiteral false
read url SimpleName MethodInvocation BooleanLiteral false
reference SimpleName MethodInvocation SimpleName purl
reference SimpleName MethodInvocation SimpleName colorspace
reference SimpleName MethodInvocation BooleanLiteral false
reference SimpleName MethodInvocation BooleanLiteral false
purl SimpleName MethodInvocation SimpleName colorspace
purl SimpleName MethodInvocation BooleanLiteral false
purl SimpleName MethodInvocation BooleanLiteral false
colorspace SimpleName MethodInvocation BooleanLiteral false
colorspace SimpleName MethodInvocation BooleanLiteral false
false BooleanLiteral MethodInvocation BooleanLiteral false
img SimpleName VariableDeclarationFragment MethodInvocation SimpleName reg
img SimpleName VariableDeclarationFragment MethodInvocation SimpleName read url
img SimpleName VariableDeclarationFragment MethodInvocation SimpleName reference
img SimpleName VariableDeclarationFragment MethodInvocation SimpleName purl
img SimpleName VariableDeclarationFragment MethodInvocation SimpleName colorspace
img SimpleName VariableDeclarationFragment MethodInvocation BooleanLiteral false
img SimpleName VariableDeclarationFragment MethodInvocation BooleanLiteral false
filter SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName img
create raster image node SimpleName MethodInvocation SimpleName ctx
create raster image node SimpleName MethodInvocation SimpleName e
create raster image node SimpleName MethodInvocation SimpleName img
create raster image node SimpleName MethodInvocation SimpleName purl
ctx SimpleName MethodInvocation SimpleName e
ctx SimpleName MethodInvocation SimpleName img
ctx SimpleName MethodInvocation SimpleName purl
e SimpleName MethodInvocation SimpleName img
e SimpleName MethodInvocation SimpleName purl
img SimpleName MethodInvocation SimpleName purl
reference SimpleName MethodInvocation SimpleName retry
io exception SimpleName SimpleType SingleVariableDeclaration SimpleName ioe
open stream SimpleName MethodInvocation SimpleName e
open stream SimpleName MethodInvocation SimpleName purl
e SimpleName MethodInvocation SimpleName purl
reference SimpleName Assignment MethodInvocation SimpleName open stream
reference SimpleName Assignment MethodInvocation SimpleName e
reference SimpleName Assignment MethodInvocation SimpleName purl
io exception SimpleName SimpleType SingleVariableDeclaration SimpleName ioe
purl SimpleName MethodInvocation SimpleName to string
ioe SimpleName MethodInvocation SimpleName get localized message
create broken image node SimpleName MethodInvocation SimpleName ctx
create broken image node SimpleName MethodInvocation SimpleName e
create broken image node SimpleName MethodInvocation MethodInvocation SimpleName purl
create broken image node SimpleName MethodInvocation MethodInvocation SimpleName to string
create broken image node SimpleName MethodInvocation MethodInvocation SimpleName ioe
create broken image node SimpleName MethodInvocation MethodInvocation SimpleName get localized message
ctx SimpleName MethodInvocation SimpleName e
ctx SimpleName MethodInvocation MethodInvocation SimpleName purl
ctx SimpleName MethodInvocation MethodInvocation SimpleName to string
ctx SimpleName MethodInvocation MethodInvocation SimpleName ioe
ctx SimpleName MethodInvocation MethodInvocation SimpleName get localized message
e SimpleName MethodInvocation MethodInvocation SimpleName purl
e SimpleName MethodInvocation MethodInvocation SimpleName to string
e SimpleName MethodInvocation MethodInvocation SimpleName ioe
e SimpleName MethodInvocation MethodInvocation SimpleName get localized message
purl SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName ioe
purl SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get localized message
to string SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName ioe
to string SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get localized message
purl SimpleName MethodInvocation SimpleName to string
loader SimpleName MethodInvocation SimpleName load document
loader SimpleName MethodInvocation MethodInvocation SimpleName purl
loader SimpleName MethodInvocation MethodInvocation SimpleName to string
loader SimpleName MethodInvocation SimpleName reference
load document SimpleName MethodInvocation MethodInvocation SimpleName purl
load document SimpleName MethodInvocation MethodInvocation SimpleName to string
load document SimpleName MethodInvocation SimpleName reference
purl SimpleName MethodInvocation MethodInvocation SimpleName reference
to string SimpleName MethodInvocation MethodInvocation SimpleName reference
doc SimpleName VariableDeclarationFragment MethodInvocation SimpleName loader
doc SimpleName VariableDeclarationFragment MethodInvocation SimpleName load document
doc SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName purl
doc SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName to string
doc SimpleName VariableDeclarationFragment MethodInvocation SimpleName reference
document SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName doc
svg document SimpleName SimpleType CastExpression SimpleName doc
img document SimpleName Assignment CastExpression SimpleType SimpleName svg document
img document SimpleName Assignment CastExpression SimpleName doc
create svg image node SimpleName MethodInvocation SimpleName ctx
create svg image node SimpleName MethodInvocation SimpleName e
create svg image node SimpleName MethodInvocation SimpleName img document
ctx SimpleName MethodInvocation SimpleName e
ctx SimpleName MethodInvocation SimpleName img document
e SimpleName MethodInvocation SimpleName img document
bridge exception SimpleName SimpleType SingleVariableDeclaration SimpleName ex
security exception SimpleName SimpleType SingleVariableDeclaration SimpleName ex
bridge exception SimpleName SimpleType ClassInstanceCreation SimpleName ctx
bridge exception SimpleName SimpleType ClassInstanceCreation SimpleName e
bridge exception SimpleName SimpleType ClassInstanceCreation SimpleName err uri unsecure
ctx SimpleName ClassInstanceCreation SimpleName e
ctx SimpleName ClassInstanceCreation SimpleName err uri unsecure
ctx SimpleName ClassInstanceCreation ArrayCreation ArrayInitializer SimpleName purl
e SimpleName ClassInstanceCreation SimpleName err uri unsecure
e SimpleName ClassInstanceCreation ArrayCreation ArrayInitializer SimpleName purl
err uri unsecure SimpleName ClassInstanceCreation ArrayCreation ArrayInitializer SimpleName purl
exception SimpleName SimpleType SingleVariableDeclaration SimpleName ex
reference SimpleName MethodInvocation SimpleName retry
io exception SimpleName SimpleType SingleVariableDeclaration SimpleName ioe
open stream SimpleName MethodInvocation SimpleName e
open stream SimpleName MethodInvocation SimpleName purl
e SimpleName MethodInvocation SimpleName purl
reference SimpleName Assignment MethodInvocation SimpleName open stream
reference SimpleName Assignment MethodInvocation SimpleName e
reference SimpleName Assignment MethodInvocation SimpleName purl
io exception SimpleName SimpleType SingleVariableDeclaration SimpleName ioe
purl SimpleName MethodInvocation SimpleName to string
ioe SimpleName MethodInvocation SimpleName get localized message
create broken image node SimpleName MethodInvocation SimpleName ctx
create broken image node SimpleName MethodInvocation SimpleName e
create broken image node SimpleName MethodInvocation MethodInvocation SimpleName purl
create broken image node SimpleName MethodInvocation MethodInvocation SimpleName to string
create broken image node SimpleName MethodInvocation MethodInvocation SimpleName ioe
create broken image node SimpleName MethodInvocation MethodInvocation SimpleName get localized message
ctx SimpleName MethodInvocation SimpleName e
ctx SimpleName MethodInvocation MethodInvocation SimpleName purl
ctx SimpleName MethodInvocation MethodInvocation SimpleName to string
ctx SimpleName MethodInvocation MethodInvocation SimpleName ioe
ctx SimpleName MethodInvocation MethodInvocation SimpleName get localized message
e SimpleName MethodInvocation MethodInvocation SimpleName purl
e SimpleName MethodInvocation MethodInvocation SimpleName to string
e SimpleName MethodInvocation MethodInvocation SimpleName ioe
e SimpleName MethodInvocation MethodInvocation SimpleName get localized message
purl SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName ioe
purl SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get localized message
to string SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName ioe
to string SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get localized message
reg SimpleName MethodInvocation SimpleName read url
reg SimpleName MethodInvocation SimpleName reference
reg SimpleName MethodInvocation SimpleName purl
reg SimpleName MethodInvocation SimpleName colorspace
reg SimpleName MethodInvocation BooleanLiteral true
read url SimpleName MethodInvocation SimpleName reference
read url SimpleName MethodInvocation SimpleName purl
read url SimpleName MethodInvocation SimpleName colorspace
read url SimpleName MethodInvocation BooleanLiteral true
read url SimpleName MethodInvocation BooleanLiteral true
reference SimpleName MethodInvocation SimpleName purl
reference SimpleName MethodInvocation SimpleName colorspace
reference SimpleName MethodInvocation BooleanLiteral true
reference SimpleName MethodInvocation BooleanLiteral true
purl SimpleName MethodInvocation SimpleName colorspace
purl SimpleName MethodInvocation BooleanLiteral true
purl SimpleName MethodInvocation BooleanLiteral true
colorspace SimpleName MethodInvocation BooleanLiteral true
colorspace SimpleName MethodInvocation BooleanLiteral true
true BooleanLiteral MethodInvocation BooleanLiteral true
img SimpleName VariableDeclarationFragment MethodInvocation SimpleName reg
img SimpleName VariableDeclarationFragment MethodInvocation SimpleName read url
img SimpleName VariableDeclarationFragment MethodInvocation SimpleName reference
img SimpleName VariableDeclarationFragment MethodInvocation SimpleName purl
img SimpleName VariableDeclarationFragment MethodInvocation SimpleName colorspace
img SimpleName VariableDeclarationFragment MethodInvocation BooleanLiteral true
img SimpleName VariableDeclarationFragment MethodInvocation BooleanLiteral true
filter SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName img
create raster image node SimpleName MethodInvocation SimpleName ctx
create raster image node SimpleName MethodInvocation SimpleName e
create raster image node SimpleName MethodInvocation SimpleName img
create raster image node SimpleName MethodInvocation SimpleName purl
ctx SimpleName MethodInvocation SimpleName e
ctx SimpleName MethodInvocation SimpleName img
ctx SimpleName MethodInvocation SimpleName purl
e SimpleName MethodInvocation SimpleName img
e SimpleName MethodInvocation SimpleName purl
img SimpleName MethodInvocation SimpleName purl
reference SimpleName MethodInvocation SimpleName release
protected Modifier MethodDeclaration SimpleType SimpleName graphics node
protected Modifier MethodDeclaration SimpleName create image graphics node
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName bridge context
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleName ctx
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName element
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleName e
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName parsed url
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleName purl
graphics node SimpleName SimpleType MethodDeclaration SimpleName create image graphics node
graphics node SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName ctx
graphics node SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName e
graphics node SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName purl
create image graphics node SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName bridge context
create image graphics node SimpleName MethodDeclaration SingleVariableDeclaration SimpleName ctx
create image graphics node SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName element
create image graphics node SimpleName MethodDeclaration SingleVariableDeclaration SimpleName e
create image graphics node SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName parsed url
create image graphics node SimpleName MethodDeclaration SingleVariableDeclaration SimpleName purl
ctx SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName e
ctx SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName purl
e SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName purl
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier protected
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName graphics node
public Modifier TypeDeclaration MethodDeclaration SimpleName create image graphics node
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName ctx
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName e
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName purl
test SimpleName TypeDeclaration MethodDeclaration Modifier protected
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName graphics node
test SimpleName TypeDeclaration MethodDeclaration SimpleName create image graphics node
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName ctx
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName e
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName purl
