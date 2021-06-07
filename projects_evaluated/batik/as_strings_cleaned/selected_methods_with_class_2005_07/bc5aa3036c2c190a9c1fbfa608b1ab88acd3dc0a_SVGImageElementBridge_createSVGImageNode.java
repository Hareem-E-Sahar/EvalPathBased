bridge context SimpleName SimpleType SingleVariableDeclaration SimpleName ctx
element SimpleName SimpleType SingleVariableDeclaration SimpleName e
svg document SimpleName SimpleType SingleVariableDeclaration SimpleName img document
svgom document SimpleName SimpleType CastExpression SimpleName img document
img document SimpleName CastExpression ParenthesizedExpression MethodInvocation SimpleName get css engine
eng SimpleName VariableDeclarationFragment MethodInvocation SimpleName get css engine
css engine SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName eng
svgom document SimpleName SimpleType CastExpression SimpleName img document
ctx SimpleName MethodInvocation SimpleName create sub bridge context
ctx SimpleName MethodInvocation CastExpression SimpleType SimpleName svgom document
ctx SimpleName MethodInvocation CastExpression SimpleName img document
create sub bridge context SimpleName MethodInvocation CastExpression SimpleType SimpleName svgom document
create sub bridge context SimpleName MethodInvocation CastExpression SimpleName img document
sub ctx SimpleName Assignment MethodInvocation SimpleName ctx
sub ctx SimpleName Assignment MethodInvocation SimpleName create sub bridge context
sub ctx SimpleName Assignment MethodInvocation CastExpression SimpleName img document
result SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName composite graphics node
composite graphics node SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName result
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
result SimpleName MethodInvocation SimpleName get children
result SimpleName MethodInvocation MethodInvocation SimpleName add
get children SimpleName MethodInvocation MethodInvocation SimpleName add
result SimpleName MethodInvocation MethodInvocation SimpleName sn
get children SimpleName MethodInvocation MethodInvocation SimpleName sn
add SimpleName MethodInvocation SimpleName sn
css utilities SimpleName MethodInvocation SimpleName convert enable background
css utilities SimpleName MethodInvocation SimpleName e
convert enable background SimpleName MethodInvocation SimpleName e
r SimpleName VariableDeclarationFragment MethodInvocation SimpleName css utilities
r SimpleName VariableDeclarationFragment MethodInvocation SimpleName convert enable background
r SimpleName VariableDeclarationFragment MethodInvocation SimpleName e
rectangle d SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName r
result SimpleName MethodInvocation SimpleName set background enable
result SimpleName MethodInvocation SimpleName r
set background enable SimpleName MethodInvocation SimpleName r
img document SimpleName MethodInvocation SimpleName get root element
svg element SimpleName VariableDeclarationFragment MethodInvocation SimpleName img document
svg element SimpleName VariableDeclarationFragment MethodInvocation SimpleName get root element
svgsvg element SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName svg element
canvas graphics node SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName node
sub ctx SimpleName MethodInvocation SimpleName get gvt builder
sub ctx SimpleName MethodInvocation MethodInvocation SimpleName build
get gvt builder SimpleName MethodInvocation MethodInvocation SimpleName build
sub ctx SimpleName MethodInvocation MethodInvocation SimpleName sub ctx
get gvt builder SimpleName MethodInvocation MethodInvocation SimpleName sub ctx
sub ctx SimpleName MethodInvocation MethodInvocation SimpleName svg element
get gvt builder SimpleName MethodInvocation MethodInvocation SimpleName svg element
build SimpleName MethodInvocation SimpleName sub ctx
build SimpleName MethodInvocation SimpleName svg element
sub ctx SimpleName MethodInvocation SimpleName svg element
canvas graphics node SimpleName SimpleType CastExpression MethodInvocation SimpleName build
canvas graphics node SimpleName SimpleType CastExpression MethodInvocation SimpleName sub ctx
canvas graphics node SimpleName SimpleType CastExpression MethodInvocation SimpleName svg element
node SimpleName Assignment CastExpression SimpleType SimpleName canvas graphics node
node SimpleName Assignment CastExpression MethodInvocation SimpleName build
node SimpleName Assignment CastExpression MethodInvocation SimpleName sub ctx
node SimpleName Assignment CastExpression MethodInvocation SimpleName svg element
ctx SimpleName MethodInvocation SimpleName is interactive
sub ctx SimpleName MethodInvocation SimpleName add ui event listeners
sub ctx SimpleName MethodInvocation SimpleName img document
add ui event listeners SimpleName MethodInvocation SimpleName img document
node SimpleName MethodInvocation SimpleName set clip
node SimpleName MethodInvocation SimpleName set viewing transform
node SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName affine transform
set viewing transform SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName affine transform
result SimpleName MethodInvocation SimpleName get children
result SimpleName MethodInvocation MethodInvocation SimpleName add
get children SimpleName MethodInvocation MethodInvocation SimpleName add
result SimpleName MethodInvocation MethodInvocation SimpleName node
get children SimpleName MethodInvocation MethodInvocation SimpleName node
add SimpleName MethodInvocation SimpleName node
svg element SimpleName MethodInvocation SimpleName get attribute ns
svg element SimpleName MethodInvocation SimpleName svg view box attribute
get attribute ns SimpleName MethodInvocation SimpleName svg view box attribute
view box SimpleName VariableDeclarationFragment MethodInvocation SimpleName svg element
view box SimpleName VariableDeclarationFragment MethodInvocation SimpleName get attribute ns
view box SimpleName VariableDeclarationFragment MethodInvocation SimpleName svg view box attribute
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName view box
view box SimpleName MethodInvocation SimpleName parse view box attribute
view box SimpleName MethodInvocation SimpleName e
view box SimpleName MethodInvocation SimpleName view box
parse view box attribute SimpleName MethodInvocation SimpleName e
parse view box attribute SimpleName MethodInvocation SimpleName view box
e SimpleName MethodInvocation SimpleName view box
vb SimpleName VariableDeclarationFragment MethodInvocation SimpleName view box
vb SimpleName VariableDeclarationFragment MethodInvocation SimpleName parse view box attribute
vb SimpleName VariableDeclarationFragment MethodInvocation SimpleName e
vb SimpleName VariableDeclarationFragment MethodInvocation SimpleName view box
float PrimitiveType ArrayType VariableDeclarationStatement VariableDeclarationFragment SimpleName vb
initialize viewport SimpleName MethodInvocation SimpleName ctx
initialize viewport SimpleName MethodInvocation SimpleName e
initialize viewport SimpleName MethodInvocation SimpleName result
initialize viewport SimpleName MethodInvocation SimpleName vb
initialize viewport SimpleName MethodInvocation SimpleName bounds
ctx SimpleName MethodInvocation SimpleName e
ctx SimpleName MethodInvocation SimpleName result
ctx SimpleName MethodInvocation SimpleName vb
ctx SimpleName MethodInvocation SimpleName bounds
e SimpleName MethodInvocation SimpleName result
e SimpleName MethodInvocation SimpleName vb
e SimpleName MethodInvocation SimpleName bounds
result SimpleName MethodInvocation SimpleName vb
result SimpleName MethodInvocation SimpleName bounds
vb SimpleName MethodInvocation SimpleName bounds
ctx SimpleName MethodInvocation SimpleName is interactive
forward event listener SimpleName SimpleType ClassInstanceCreation SimpleName svg element
forward event listener SimpleName SimpleType ClassInstanceCreation SimpleName e
svg element SimpleName ClassInstanceCreation SimpleName e
listener SimpleName Assignment ClassInstanceCreation SimpleType SimpleName forward event listener
listener SimpleName Assignment ClassInstanceCreation SimpleName svg element
listener SimpleName Assignment ClassInstanceCreation SimpleName e
event target SimpleName SimpleType CastExpression SimpleName svg element
tgt SimpleName VariableDeclarationFragment CastExpression SimpleType SimpleName event target
tgt SimpleName VariableDeclarationFragment CastExpression SimpleName svg element
event target SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName tgt
tgt SimpleName MethodInvocation SimpleName add event listener
tgt SimpleName MethodInvocation SimpleName svg event click
tgt SimpleName MethodInvocation SimpleName listener
tgt SimpleName MethodInvocation BooleanLiteral false
add event listener SimpleName MethodInvocation SimpleName svg event click
add event listener SimpleName MethodInvocation SimpleName listener
add event listener SimpleName MethodInvocation BooleanLiteral false
svg event click SimpleName MethodInvocation SimpleName listener
svg event click SimpleName MethodInvocation BooleanLiteral false
listener SimpleName MethodInvocation BooleanLiteral false
sub ctx SimpleName MethodInvocation SimpleName store event listener
sub ctx SimpleName MethodInvocation SimpleName tgt
sub ctx SimpleName MethodInvocation SimpleName svg event click
sub ctx SimpleName MethodInvocation SimpleName listener
sub ctx SimpleName MethodInvocation BooleanLiteral false
store event listener SimpleName MethodInvocation SimpleName tgt
store event listener SimpleName MethodInvocation SimpleName svg event click
store event listener SimpleName MethodInvocation SimpleName listener
store event listener SimpleName MethodInvocation BooleanLiteral false
tgt SimpleName MethodInvocation SimpleName svg event click
tgt SimpleName MethodInvocation SimpleName listener
tgt SimpleName MethodInvocation BooleanLiteral false
svg event click SimpleName MethodInvocation SimpleName listener
svg event click SimpleName MethodInvocation BooleanLiteral false
listener SimpleName MethodInvocation BooleanLiteral false
tgt SimpleName MethodInvocation SimpleName add event listener
tgt SimpleName MethodInvocation SimpleName svg event keydown
tgt SimpleName MethodInvocation SimpleName listener
tgt SimpleName MethodInvocation BooleanLiteral false
add event listener SimpleName MethodInvocation SimpleName svg event keydown
add event listener SimpleName MethodInvocation SimpleName listener
add event listener SimpleName MethodInvocation BooleanLiteral false
svg event keydown SimpleName MethodInvocation SimpleName listener
svg event keydown SimpleName MethodInvocation BooleanLiteral false
listener SimpleName MethodInvocation BooleanLiteral false
sub ctx SimpleName MethodInvocation SimpleName store event listener
sub ctx SimpleName MethodInvocation SimpleName tgt
sub ctx SimpleName MethodInvocation SimpleName svg event keydown
sub ctx SimpleName MethodInvocation SimpleName listener
sub ctx SimpleName MethodInvocation BooleanLiteral false
store event listener SimpleName MethodInvocation SimpleName tgt
store event listener SimpleName MethodInvocation SimpleName svg event keydown
store event listener SimpleName MethodInvocation SimpleName listener
store event listener SimpleName MethodInvocation BooleanLiteral false
tgt SimpleName MethodInvocation SimpleName svg event keydown
tgt SimpleName MethodInvocation SimpleName listener
tgt SimpleName MethodInvocation BooleanLiteral false
svg event keydown SimpleName MethodInvocation SimpleName listener
svg event keydown SimpleName MethodInvocation BooleanLiteral false
listener SimpleName MethodInvocation BooleanLiteral false
tgt SimpleName MethodInvocation SimpleName add event listener
tgt SimpleName MethodInvocation SimpleName svg event keypress
tgt SimpleName MethodInvocation SimpleName listener
tgt SimpleName MethodInvocation BooleanLiteral false
add event listener SimpleName MethodInvocation SimpleName svg event keypress
add event listener SimpleName MethodInvocation SimpleName listener
add event listener SimpleName MethodInvocation BooleanLiteral false
svg event keypress SimpleName MethodInvocation SimpleName listener
svg event keypress SimpleName MethodInvocation BooleanLiteral false
listener SimpleName MethodInvocation BooleanLiteral false
sub ctx SimpleName MethodInvocation SimpleName store event listener
sub ctx SimpleName MethodInvocation SimpleName tgt
sub ctx SimpleName MethodInvocation SimpleName svg event keypress
sub ctx SimpleName MethodInvocation SimpleName listener
sub ctx SimpleName MethodInvocation BooleanLiteral false
store event listener SimpleName MethodInvocation SimpleName tgt
store event listener SimpleName MethodInvocation SimpleName svg event keypress
store event listener SimpleName MethodInvocation SimpleName listener
store event listener SimpleName MethodInvocation BooleanLiteral false
tgt SimpleName MethodInvocation SimpleName svg event keypress
tgt SimpleName MethodInvocation SimpleName listener
tgt SimpleName MethodInvocation BooleanLiteral false
svg event keypress SimpleName MethodInvocation SimpleName listener
svg event keypress SimpleName MethodInvocation BooleanLiteral false
listener SimpleName MethodInvocation BooleanLiteral false
tgt SimpleName MethodInvocation SimpleName add event listener
tgt SimpleName MethodInvocation SimpleName svg event keyup
tgt SimpleName MethodInvocation SimpleName listener
tgt SimpleName MethodInvocation BooleanLiteral false
add event listener SimpleName MethodInvocation SimpleName svg event keyup
add event listener SimpleName MethodInvocation SimpleName listener
add event listener SimpleName MethodInvocation BooleanLiteral false
svg event keyup SimpleName MethodInvocation SimpleName listener
svg event keyup SimpleName MethodInvocation BooleanLiteral false
listener SimpleName MethodInvocation BooleanLiteral false
sub ctx SimpleName MethodInvocation SimpleName store event listener
sub ctx SimpleName MethodInvocation SimpleName tgt
sub ctx SimpleName MethodInvocation SimpleName svg event keyup
sub ctx SimpleName MethodInvocation SimpleName listener
sub ctx SimpleName MethodInvocation BooleanLiteral false
store event listener SimpleName MethodInvocation SimpleName tgt
store event listener SimpleName MethodInvocation SimpleName svg event keyup
store event listener SimpleName MethodInvocation SimpleName listener
store event listener SimpleName MethodInvocation BooleanLiteral false
tgt SimpleName MethodInvocation SimpleName svg event keyup
tgt SimpleName MethodInvocation SimpleName listener
tgt SimpleName MethodInvocation BooleanLiteral false
svg event keyup SimpleName MethodInvocation SimpleName listener
svg event keyup SimpleName MethodInvocation BooleanLiteral false
listener SimpleName MethodInvocation BooleanLiteral false
tgt SimpleName MethodInvocation SimpleName add event listener
tgt SimpleName MethodInvocation SimpleName svg event mousedown
tgt SimpleName MethodInvocation SimpleName listener
tgt SimpleName MethodInvocation BooleanLiteral false
add event listener SimpleName MethodInvocation SimpleName svg event mousedown
add event listener SimpleName MethodInvocation SimpleName listener
add event listener SimpleName MethodInvocation BooleanLiteral false
svg event mousedown SimpleName MethodInvocation SimpleName listener
svg event mousedown SimpleName MethodInvocation BooleanLiteral false
listener SimpleName MethodInvocation BooleanLiteral false
sub ctx SimpleName MethodInvocation SimpleName store event listener
sub ctx SimpleName MethodInvocation SimpleName tgt
sub ctx SimpleName MethodInvocation SimpleName svg event mousedown
sub ctx SimpleName MethodInvocation SimpleName listener
sub ctx SimpleName MethodInvocation BooleanLiteral false
store event listener SimpleName MethodInvocation SimpleName tgt
store event listener SimpleName MethodInvocation SimpleName svg event mousedown
store event listener SimpleName MethodInvocation SimpleName listener
store event listener SimpleName MethodInvocation BooleanLiteral false
tgt SimpleName MethodInvocation SimpleName svg event mousedown
tgt SimpleName MethodInvocation SimpleName listener
tgt SimpleName MethodInvocation BooleanLiteral false
svg event mousedown SimpleName MethodInvocation SimpleName listener
svg event mousedown SimpleName MethodInvocation BooleanLiteral false
listener SimpleName MethodInvocation BooleanLiteral false
tgt SimpleName MethodInvocation SimpleName add event listener
tgt SimpleName MethodInvocation SimpleName svg event mousemove
tgt SimpleName MethodInvocation SimpleName listener
tgt SimpleName MethodInvocation BooleanLiteral false
add event listener SimpleName MethodInvocation SimpleName svg event mousemove
add event listener SimpleName MethodInvocation SimpleName listener
add event listener SimpleName MethodInvocation BooleanLiteral false
svg event mousemove SimpleName MethodInvocation SimpleName listener
svg event mousemove SimpleName MethodInvocation BooleanLiteral false
listener SimpleName MethodInvocation BooleanLiteral false
sub ctx SimpleName MethodInvocation SimpleName store event listener
sub ctx SimpleName MethodInvocation SimpleName tgt
sub ctx SimpleName MethodInvocation SimpleName svg event mousemove
sub ctx SimpleName MethodInvocation SimpleName listener
sub ctx SimpleName MethodInvocation BooleanLiteral false
store event listener SimpleName MethodInvocation SimpleName tgt
store event listener SimpleName MethodInvocation SimpleName svg event mousemove
store event listener SimpleName MethodInvocation SimpleName listener
store event listener SimpleName MethodInvocation BooleanLiteral false
tgt SimpleName MethodInvocation SimpleName svg event mousemove
tgt SimpleName MethodInvocation SimpleName listener
tgt SimpleName MethodInvocation BooleanLiteral false
svg event mousemove SimpleName MethodInvocation SimpleName listener
svg event mousemove SimpleName MethodInvocation BooleanLiteral false
listener SimpleName MethodInvocation BooleanLiteral false
tgt SimpleName MethodInvocation SimpleName add event listener
tgt SimpleName MethodInvocation SimpleName svg event mouseout
tgt SimpleName MethodInvocation SimpleName listener
tgt SimpleName MethodInvocation BooleanLiteral false
add event listener SimpleName MethodInvocation SimpleName svg event mouseout
add event listener SimpleName MethodInvocation SimpleName listener
add event listener SimpleName MethodInvocation BooleanLiteral false
svg event mouseout SimpleName MethodInvocation SimpleName listener
svg event mouseout SimpleName MethodInvocation BooleanLiteral false
listener SimpleName MethodInvocation BooleanLiteral false
sub ctx SimpleName MethodInvocation SimpleName store event listener
sub ctx SimpleName MethodInvocation SimpleName tgt
sub ctx SimpleName MethodInvocation SimpleName svg event mouseout
sub ctx SimpleName MethodInvocation SimpleName listener
sub ctx SimpleName MethodInvocation BooleanLiteral false
store event listener SimpleName MethodInvocation SimpleName tgt
store event listener SimpleName MethodInvocation SimpleName svg event mouseout
store event listener SimpleName MethodInvocation SimpleName listener
store event listener SimpleName MethodInvocation BooleanLiteral false
tgt SimpleName MethodInvocation SimpleName svg event mouseout
tgt SimpleName MethodInvocation SimpleName listener
tgt SimpleName MethodInvocation BooleanLiteral false
svg event mouseout SimpleName MethodInvocation SimpleName listener
svg event mouseout SimpleName MethodInvocation BooleanLiteral false
listener SimpleName MethodInvocation BooleanLiteral false
tgt SimpleName MethodInvocation SimpleName add event listener
tgt SimpleName MethodInvocation SimpleName svg event mouseover
tgt SimpleName MethodInvocation SimpleName listener
tgt SimpleName MethodInvocation BooleanLiteral false
add event listener SimpleName MethodInvocation SimpleName svg event mouseover
add event listener SimpleName MethodInvocation SimpleName listener
add event listener SimpleName MethodInvocation BooleanLiteral false
svg event mouseover SimpleName MethodInvocation SimpleName listener
svg event mouseover SimpleName MethodInvocation BooleanLiteral false
listener SimpleName MethodInvocation BooleanLiteral false
sub ctx SimpleName MethodInvocation SimpleName store event listener
sub ctx SimpleName MethodInvocation SimpleName tgt
sub ctx SimpleName MethodInvocation SimpleName svg event mouseover
sub ctx SimpleName MethodInvocation SimpleName listener
sub ctx SimpleName MethodInvocation BooleanLiteral false
store event listener SimpleName MethodInvocation SimpleName tgt
store event listener SimpleName MethodInvocation SimpleName svg event mouseover
store event listener SimpleName MethodInvocation SimpleName listener
store event listener SimpleName MethodInvocation BooleanLiteral false
tgt SimpleName MethodInvocation SimpleName svg event mouseover
tgt SimpleName MethodInvocation SimpleName listener
tgt SimpleName MethodInvocation BooleanLiteral false
svg event mouseover SimpleName MethodInvocation SimpleName listener
svg event mouseover SimpleName MethodInvocation BooleanLiteral false
listener SimpleName MethodInvocation BooleanLiteral false
tgt SimpleName MethodInvocation SimpleName add event listener
tgt SimpleName MethodInvocation SimpleName svg event mouseup
tgt SimpleName MethodInvocation SimpleName listener
tgt SimpleName MethodInvocation BooleanLiteral false
add event listener SimpleName MethodInvocation SimpleName svg event mouseup
add event listener SimpleName MethodInvocation SimpleName listener
add event listener SimpleName MethodInvocation BooleanLiteral false
svg event mouseup SimpleName MethodInvocation SimpleName listener
svg event mouseup SimpleName MethodInvocation BooleanLiteral false
listener SimpleName MethodInvocation BooleanLiteral false
sub ctx SimpleName MethodInvocation SimpleName store event listener
sub ctx SimpleName MethodInvocation SimpleName tgt
sub ctx SimpleName MethodInvocation SimpleName svg event mouseup
sub ctx SimpleName MethodInvocation SimpleName listener
sub ctx SimpleName MethodInvocation BooleanLiteral false
store event listener SimpleName MethodInvocation SimpleName tgt
store event listener SimpleName MethodInvocation SimpleName svg event mouseup
store event listener SimpleName MethodInvocation SimpleName listener
store event listener SimpleName MethodInvocation BooleanLiteral false
tgt SimpleName MethodInvocation SimpleName svg event mouseup
tgt SimpleName MethodInvocation SimpleName listener
tgt SimpleName MethodInvocation BooleanLiteral false
svg event mouseup SimpleName MethodInvocation SimpleName listener
svg event mouseup SimpleName MethodInvocation BooleanLiteral false
listener SimpleName MethodInvocation BooleanLiteral false
protected Modifier MethodDeclaration SimpleType SimpleName graphics node
protected Modifier MethodDeclaration SimpleName create svg image node
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName bridge context
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleName ctx
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName element
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleName e
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName svg document
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleName img document
graphics node SimpleName SimpleType MethodDeclaration SimpleName create svg image node
graphics node SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName ctx
graphics node SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName e
graphics node SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName img document
create svg image node SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName bridge context
create svg image node SimpleName MethodDeclaration SingleVariableDeclaration SimpleName ctx
create svg image node SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName element
create svg image node SimpleName MethodDeclaration SingleVariableDeclaration SimpleName e
create svg image node SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName svg document
create svg image node SimpleName MethodDeclaration SingleVariableDeclaration SimpleName img document
create svg image node SimpleName MethodDeclaration Block ReturnStatement SimpleName result
ctx SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName e
ctx SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName img document
e SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName img document
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier protected
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName graphics node
public Modifier TypeDeclaration MethodDeclaration SimpleName create svg image node
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName ctx
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName e
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName img document
test SimpleName TypeDeclaration MethodDeclaration Modifier protected
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName graphics node
test SimpleName TypeDeclaration MethodDeclaration SimpleName create svg image node
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName ctx
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName e
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName img document
