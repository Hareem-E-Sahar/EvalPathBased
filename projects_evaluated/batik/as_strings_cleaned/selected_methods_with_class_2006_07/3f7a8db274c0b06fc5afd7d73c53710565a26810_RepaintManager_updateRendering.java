collection SimpleName SimpleType SingleVariableDeclaration SimpleName areas
renderer SimpleName MethodInvocation SimpleName flush
renderer SimpleName MethodInvocation SimpleName areas
flush SimpleName MethodInvocation SimpleName areas
areas SimpleName MethodInvocation SimpleName size
array list SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName areas
array list SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName size
rects SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName array list
rects SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName areas
rects SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName size
list SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName rects
renderer SimpleName MethodInvocation SimpleName get transform
at SimpleName VariableDeclarationFragment MethodInvocation SimpleName renderer
at SimpleName VariableDeclarationFragment MethodInvocation SimpleName get transform
affine transform SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName at
areas SimpleName MethodInvocation SimpleName iterator
i SimpleName VariableDeclarationFragment MethodInvocation SimpleName areas
i SimpleName VariableDeclarationFragment MethodInvocation SimpleName iterator
iterator SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName i
i SimpleName MethodInvocation SimpleName has next
i SimpleName MethodInvocation SimpleName next
shape SimpleName SimpleType CastExpression MethodInvocation SimpleName i
shape SimpleName SimpleType CastExpression MethodInvocation SimpleName next
s SimpleName VariableDeclarationFragment CastExpression SimpleType SimpleName shape
s SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName i
s SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName next
shape SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName s
at SimpleName MethodInvocation SimpleName create transformed shape
at SimpleName MethodInvocation SimpleName s
create transformed shape SimpleName MethodInvocation SimpleName s
s SimpleName Assignment MethodInvocation SimpleName at
s SimpleName Assignment MethodInvocation SimpleName create transformed shape
s SimpleName Assignment MethodInvocation SimpleName s
s SimpleName MethodInvocation SimpleName get bounds d
r d SimpleName VariableDeclarationFragment MethodInvocation SimpleName s
r d SimpleName VariableDeclarationFragment MethodInvocation SimpleName get bounds d
rectangle d SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName r d
r d SimpleName MethodInvocation SimpleName get x
math SimpleName MethodInvocation SimpleName floor
math SimpleName MethodInvocation MethodInvocation SimpleName r d
math SimpleName MethodInvocation MethodInvocation SimpleName get x
floor SimpleName MethodInvocation MethodInvocation SimpleName r d
floor SimpleName MethodInvocation MethodInvocation SimpleName get x
int PrimitiveType CastExpression MethodInvocation SimpleName math
int PrimitiveType CastExpression MethodInvocation SimpleName floor
int PrimitiveType CastExpression MethodInvocation MethodInvocation SimpleName r d
int PrimitiveType CastExpression MethodInvocation MethodInvocation SimpleName get x
x SimpleName VariableDeclarationFragment CastExpression PrimitiveType int
x SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName math
x SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName floor
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName x
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment CastExpression PrimitiveType int
r d SimpleName MethodInvocation SimpleName get y
math SimpleName MethodInvocation SimpleName floor
math SimpleName MethodInvocation MethodInvocation SimpleName r d
math SimpleName MethodInvocation MethodInvocation SimpleName get y
floor SimpleName MethodInvocation MethodInvocation SimpleName r d
floor SimpleName MethodInvocation MethodInvocation SimpleName get y
int PrimitiveType CastExpression MethodInvocation SimpleName math
int PrimitiveType CastExpression MethodInvocation SimpleName floor
int PrimitiveType CastExpression MethodInvocation MethodInvocation SimpleName r d
int PrimitiveType CastExpression MethodInvocation MethodInvocation SimpleName get y
y SimpleName VariableDeclarationFragment CastExpression PrimitiveType int
y SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName math
y SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName floor
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName y
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment CastExpression PrimitiveType int
r d SimpleName MethodInvocation SimpleName get x
r d SimpleName MethodInvocation SimpleName get width
r d SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName r d
r d SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get width
get x SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName r d
get x SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get width
math SimpleName MethodInvocation SimpleName ceil
math SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName r d
math SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get x
math SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName r d
math SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get width
ceil SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName r d
ceil SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get x
ceil SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName r d
ceil SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get width
int PrimitiveType CastExpression MethodInvocation SimpleName math
int PrimitiveType CastExpression MethodInvocation SimpleName ceil
x SimpleName VariableDeclarationFragment CastExpression PrimitiveType int
x SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName math
x SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName ceil
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName x
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment CastExpression PrimitiveType int
r d SimpleName MethodInvocation SimpleName get y
r d SimpleName MethodInvocation SimpleName get height
r d SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName r d
r d SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get height
get y SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName r d
get y SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get height
math SimpleName MethodInvocation SimpleName ceil
math SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName r d
math SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get y
math SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName r d
math SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get height
ceil SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName r d
ceil SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get y
ceil SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName r d
ceil SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get height
int PrimitiveType CastExpression MethodInvocation SimpleName math
int PrimitiveType CastExpression MethodInvocation SimpleName ceil
y SimpleName VariableDeclarationFragment CastExpression PrimitiveType int
y SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName math
y SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName ceil
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName y
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment CastExpression PrimitiveType int
x SimpleName InfixExpression NumberLiteral empty
y SimpleName InfixExpression NumberLiteral empty
x SimpleName InfixExpression SimpleName x
x SimpleName InfixExpression InfixExpression NumberLiteral empty
x SimpleName InfixExpression InfixExpression NumberLiteral empty
y SimpleName InfixExpression SimpleName y
y SimpleName InfixExpression InfixExpression NumberLiteral empty
y SimpleName InfixExpression InfixExpression NumberLiteral empty
rectangle SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName x
rectangle SimpleName SimpleType ClassInstanceCreation InfixExpression NumberLiteral empty
rectangle SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName y
rectangle SimpleName SimpleType ClassInstanceCreation InfixExpression NumberLiteral empty
rectangle SimpleName SimpleType ClassInstanceCreation InfixExpression NumberLiteral empty
rectangle SimpleName SimpleType ClassInstanceCreation InfixExpression NumberLiteral empty
x SimpleName InfixExpression ClassInstanceCreation InfixExpression SimpleName y
x SimpleName InfixExpression ClassInstanceCreation InfixExpression NumberLiteral empty
empty NumberLiteral InfixExpression ClassInstanceCreation InfixExpression SimpleName y
empty NumberLiteral InfixExpression ClassInstanceCreation InfixExpression NumberLiteral empty
x SimpleName InfixExpression ClassInstanceCreation InfixExpression NumberLiteral empty
empty NumberLiteral InfixExpression ClassInstanceCreation InfixExpression NumberLiteral empty
x SimpleName InfixExpression ClassInstanceCreation InfixExpression NumberLiteral empty
empty NumberLiteral InfixExpression ClassInstanceCreation InfixExpression NumberLiteral empty
y SimpleName InfixExpression ClassInstanceCreation InfixExpression NumberLiteral empty
empty NumberLiteral InfixExpression ClassInstanceCreation InfixExpression NumberLiteral empty
y SimpleName InfixExpression ClassInstanceCreation InfixExpression NumberLiteral empty
empty NumberLiteral InfixExpression ClassInstanceCreation InfixExpression NumberLiteral empty
empty NumberLiteral InfixExpression ClassInstanceCreation InfixExpression NumberLiteral empty
r SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName rectangle
r SimpleName VariableDeclarationFragment ClassInstanceCreation InfixExpression SimpleName x
r SimpleName VariableDeclarationFragment ClassInstanceCreation InfixExpression NumberLiteral empty
r SimpleName VariableDeclarationFragment ClassInstanceCreation InfixExpression SimpleName y
r SimpleName VariableDeclarationFragment ClassInstanceCreation InfixExpression NumberLiteral empty
r SimpleName VariableDeclarationFragment ClassInstanceCreation InfixExpression NumberLiteral empty
r SimpleName VariableDeclarationFragment ClassInstanceCreation InfixExpression NumberLiteral empty
rectangle SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName r
rects SimpleName MethodInvocation SimpleName add
rects SimpleName MethodInvocation SimpleName r
add SimpleName MethodInvocation SimpleName r
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
rect list manager SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName dev rlm
rect list manager SimpleName SimpleType ClassInstanceCreation SimpleName rects
dev rlm SimpleName Assignment ClassInstanceCreation SimpleType SimpleName rect list manager
dev rlm SimpleName Assignment ClassInstanceCreation SimpleName rects
dev rlm SimpleName MethodInvocation SimpleName merge rects
dev rlm SimpleName MethodInvocation SimpleName copy overhead
dev rlm SimpleName MethodInvocation SimpleName copy line overhead
merge rects SimpleName MethodInvocation SimpleName copy overhead
merge rects SimpleName MethodInvocation SimpleName copy line overhead
copy overhead SimpleName MethodInvocation SimpleName copy line overhead
exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
e SimpleName MethodInvocation SimpleName print stack trace
renderer SimpleName MethodInvocation SimpleName repaint
renderer SimpleName MethodInvocation SimpleName dev rlm
repaint SimpleName MethodInvocation SimpleName dev rlm
public Modifier MethodDeclaration SimpleType SimpleName collection
public Modifier MethodDeclaration SimpleName update rendering
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName collection
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName areas
public Modifier MethodDeclaration SimpleType SimpleName interrupted exception
public Modifier MethodDeclaration Block ReturnStatement SimpleName dev rlm
collection SimpleName SimpleType MethodDeclaration SimpleName update rendering
collection SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName areas
collection SimpleName SimpleType MethodDeclaration SimpleType SimpleName interrupted exception
update rendering SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName collection
update rendering SimpleName MethodDeclaration SingleVariableDeclaration SimpleName areas
update rendering SimpleName MethodDeclaration SimpleType SimpleName interrupted exception
update rendering SimpleName MethodDeclaration Block ReturnStatement SimpleName dev rlm
areas SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName interrupted exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName collection
public Modifier TypeDeclaration MethodDeclaration SimpleName update rendering
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName areas
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName interrupted exception
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName collection
test SimpleName TypeDeclaration MethodDeclaration SimpleName update rendering
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName areas
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName interrupted exception
