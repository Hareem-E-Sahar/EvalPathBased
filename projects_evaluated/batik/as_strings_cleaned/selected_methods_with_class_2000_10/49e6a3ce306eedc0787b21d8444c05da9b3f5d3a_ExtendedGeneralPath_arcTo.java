float PrimitiveType SingleVariableDeclaration SimpleName rx
float PrimitiveType SingleVariableDeclaration SimpleName ry
float PrimitiveType SingleVariableDeclaration SimpleName theta
boolean PrimitiveType SingleVariableDeclaration SimpleName large arc flag
boolean PrimitiveType SingleVariableDeclaration SimpleName sweep flag
float PrimitiveType SingleVariableDeclaration SimpleName x
float PrimitiveType SingleVariableDeclaration SimpleName y
rx SimpleName InfixExpression NumberLiteral empty
ry SimpleName InfixExpression NumberLiteral empty
rx SimpleName InfixExpression InfixExpression InfixExpression SimpleName ry
rx SimpleName InfixExpression InfixExpression InfixExpression NumberLiteral empty
empty NumberLiteral InfixExpression InfixExpression InfixExpression SimpleName ry
empty NumberLiteral InfixExpression InfixExpression InfixExpression NumberLiteral empty
line to SimpleName MethodInvocation SimpleName x
line to SimpleName MethodInvocation SimpleName y
x SimpleName MethodInvocation SimpleName y
path SimpleName MethodInvocation SimpleName get current point
p d SimpleName VariableDeclarationFragment MethodInvocation SimpleName path
p d SimpleName VariableDeclarationFragment MethodInvocation SimpleName get current point
point d SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName p d
p d SimpleName MethodInvocation SimpleName get x
float PrimitiveType CastExpression MethodInvocation SimpleName p d
float PrimitiveType CastExpression MethodInvocation SimpleName get x
x SimpleName VariableDeclarationFragment CastExpression PrimitiveType float
x SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName p d
x SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName get x
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName x
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment CastExpression PrimitiveType float
p d SimpleName MethodInvocation SimpleName get y
float PrimitiveType CastExpression MethodInvocation SimpleName p d
float PrimitiveType CastExpression MethodInvocation SimpleName get y
y SimpleName VariableDeclarationFragment CastExpression PrimitiveType float
y SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName p d
y SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName get y
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName y
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment CastExpression PrimitiveType float
x SimpleName InfixExpression SimpleName x
x SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral . f
x SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral . f
dx SimpleName VariableDeclarationFragment InfixExpression NumberLiteral . f
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName dx
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment InfixExpression NumberLiteral . f
y SimpleName InfixExpression SimpleName y
y SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral . f
y SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral . f
dy SimpleName VariableDeclarationFragment InfixExpression NumberLiteral . f
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName dy
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment InfixExpression NumberLiteral . f
theta SimpleName InfixExpression NumberLiteral f
math SimpleName MethodInvocation SimpleName to radians
math SimpleName MethodInvocation InfixExpression SimpleName theta
math SimpleName MethodInvocation InfixExpression NumberLiteral f
to radians SimpleName MethodInvocation InfixExpression SimpleName theta
to radians SimpleName MethodInvocation InfixExpression NumberLiteral f
float PrimitiveType CastExpression MethodInvocation SimpleName math
float PrimitiveType CastExpression MethodInvocation SimpleName to radians
float PrimitiveType CastExpression MethodInvocation InfixExpression SimpleName theta
float PrimitiveType CastExpression MethodInvocation InfixExpression NumberLiteral f
theta SimpleName Assignment CastExpression PrimitiveType float
theta SimpleName Assignment CastExpression MethodInvocation SimpleName math
theta SimpleName Assignment CastExpression MethodInvocation SimpleName to radians
math SimpleName MethodInvocation SimpleName cos
math SimpleName MethodInvocation SimpleName theta
cos SimpleName MethodInvocation SimpleName theta
double PrimitiveType CastExpression SimpleName dx
math SimpleName MethodInvocation InfixExpression CastExpression PrimitiveType double
math SimpleName MethodInvocation InfixExpression CastExpression SimpleName dx
cos SimpleName MethodInvocation InfixExpression CastExpression PrimitiveType double
cos SimpleName MethodInvocation InfixExpression CastExpression SimpleName dx
theta SimpleName MethodInvocation InfixExpression CastExpression PrimitiveType double
theta SimpleName MethodInvocation InfixExpression CastExpression SimpleName dx
math SimpleName MethodInvocation SimpleName sin
math SimpleName MethodInvocation SimpleName theta
sin SimpleName MethodInvocation SimpleName theta
double PrimitiveType CastExpression SimpleName dy
math SimpleName MethodInvocation InfixExpression CastExpression PrimitiveType double
math SimpleName MethodInvocation InfixExpression CastExpression SimpleName dy
sin SimpleName MethodInvocation InfixExpression CastExpression PrimitiveType double
sin SimpleName MethodInvocation InfixExpression CastExpression SimpleName dy
theta SimpleName MethodInvocation InfixExpression CastExpression PrimitiveType double
theta SimpleName MethodInvocation InfixExpression CastExpression SimpleName dy
x SimpleName VariableDeclarationFragment CastExpression PrimitiveType float
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName x
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment CastExpression PrimitiveType float
math SimpleName MethodInvocation SimpleName sin
math SimpleName MethodInvocation SimpleName theta
sin SimpleName MethodInvocation SimpleName theta
double PrimitiveType CastExpression SimpleName dx
math SimpleName MethodInvocation SimpleName cos
math SimpleName MethodInvocation SimpleName theta
cos SimpleName MethodInvocation SimpleName theta
double PrimitiveType CastExpression SimpleName dy
math SimpleName MethodInvocation InfixExpression CastExpression PrimitiveType double
math SimpleName MethodInvocation InfixExpression CastExpression SimpleName dy
cos SimpleName MethodInvocation InfixExpression CastExpression PrimitiveType double
cos SimpleName MethodInvocation InfixExpression CastExpression SimpleName dy
theta SimpleName MethodInvocation InfixExpression CastExpression PrimitiveType double
theta SimpleName MethodInvocation InfixExpression CastExpression SimpleName dy
y SimpleName VariableDeclarationFragment CastExpression PrimitiveType float
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName y
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment CastExpression PrimitiveType float
math SimpleName MethodInvocation SimpleName abs
math SimpleName MethodInvocation SimpleName rx
abs SimpleName MethodInvocation SimpleName rx
rx SimpleName Assignment MethodInvocation SimpleName math
rx SimpleName Assignment MethodInvocation SimpleName abs
rx SimpleName Assignment MethodInvocation SimpleName rx
math SimpleName MethodInvocation SimpleName abs
math SimpleName MethodInvocation SimpleName ry
abs SimpleName MethodInvocation SimpleName ry
ry SimpleName Assignment MethodInvocation SimpleName math
ry SimpleName Assignment MethodInvocation SimpleName abs
ry SimpleName Assignment MethodInvocation SimpleName ry
rx SimpleName InfixExpression SimpleName rx
prx SimpleName VariableDeclarationFragment InfixExpression SimpleName rx
prx SimpleName VariableDeclarationFragment InfixExpression SimpleName rx
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName prx
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment InfixExpression SimpleName rx
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment InfixExpression SimpleName rx
ry SimpleName InfixExpression SimpleName ry
pry SimpleName VariableDeclarationFragment InfixExpression SimpleName ry
pry SimpleName VariableDeclarationFragment InfixExpression SimpleName ry
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName pry
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment InfixExpression SimpleName ry
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment InfixExpression SimpleName ry
x SimpleName InfixExpression SimpleName x
px SimpleName VariableDeclarationFragment InfixExpression SimpleName x
px SimpleName VariableDeclarationFragment InfixExpression SimpleName x
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName px
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment InfixExpression SimpleName x
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment InfixExpression SimpleName x
y SimpleName InfixExpression SimpleName y
py SimpleName VariableDeclarationFragment InfixExpression SimpleName y
py SimpleName VariableDeclarationFragment InfixExpression SimpleName y
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName py
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment InfixExpression SimpleName y
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment InfixExpression SimpleName y
px SimpleName InfixExpression SimpleName prx
py SimpleName InfixExpression SimpleName pry
px SimpleName InfixExpression InfixExpression InfixExpression SimpleName py
px SimpleName InfixExpression InfixExpression InfixExpression SimpleName pry
prx SimpleName InfixExpression InfixExpression InfixExpression SimpleName py
prx SimpleName InfixExpression InfixExpression InfixExpression SimpleName pry
d SimpleName VariableDeclarationFragment InfixExpression InfixExpression SimpleName px
d SimpleName VariableDeclarationFragment InfixExpression InfixExpression SimpleName prx
d SimpleName VariableDeclarationFragment InfixExpression InfixExpression SimpleName py
d SimpleName VariableDeclarationFragment InfixExpression InfixExpression SimpleName pry
double PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName d
d SimpleName InfixExpression NumberLiteral empty
math SimpleName MethodInvocation SimpleName sqrt
math SimpleName MethodInvocation SimpleName d
sqrt SimpleName MethodInvocation SimpleName d
double PrimitiveType CastExpression SimpleName rx
math SimpleName MethodInvocation InfixExpression CastExpression PrimitiveType double
math SimpleName MethodInvocation InfixExpression CastExpression SimpleName rx
sqrt SimpleName MethodInvocation InfixExpression CastExpression PrimitiveType double
sqrt SimpleName MethodInvocation InfixExpression CastExpression SimpleName rx
d SimpleName MethodInvocation InfixExpression CastExpression PrimitiveType double
d SimpleName MethodInvocation InfixExpression CastExpression SimpleName rx
math SimpleName MethodInvocation SimpleName abs
math SimpleName MethodInvocation CastExpression PrimitiveType float
abs SimpleName MethodInvocation CastExpression PrimitiveType float
rx SimpleName Assignment MethodInvocation SimpleName math
rx SimpleName Assignment MethodInvocation SimpleName abs
rx SimpleName Assignment MethodInvocation CastExpression PrimitiveType float
math SimpleName MethodInvocation SimpleName sqrt
math SimpleName MethodInvocation SimpleName d
sqrt SimpleName MethodInvocation SimpleName d
double PrimitiveType CastExpression SimpleName ry
math SimpleName MethodInvocation InfixExpression CastExpression PrimitiveType double
math SimpleName MethodInvocation InfixExpression CastExpression SimpleName ry
sqrt SimpleName MethodInvocation InfixExpression CastExpression PrimitiveType double
sqrt SimpleName MethodInvocation InfixExpression CastExpression SimpleName ry
d SimpleName MethodInvocation InfixExpression CastExpression PrimitiveType double
d SimpleName MethodInvocation InfixExpression CastExpression SimpleName ry
math SimpleName MethodInvocation SimpleName abs
math SimpleName MethodInvocation CastExpression PrimitiveType float
abs SimpleName MethodInvocation CastExpression PrimitiveType float
ry SimpleName Assignment MethodInvocation SimpleName math
ry SimpleName Assignment MethodInvocation SimpleName abs
ry SimpleName Assignment MethodInvocation CastExpression PrimitiveType float
rx SimpleName InfixExpression SimpleName rx
prx SimpleName Assignment InfixExpression SimpleName rx
prx SimpleName Assignment InfixExpression SimpleName rx
ry SimpleName InfixExpression SimpleName ry
pry SimpleName Assignment InfixExpression SimpleName ry
pry SimpleName Assignment InfixExpression SimpleName ry
large arc flag SimpleName InfixExpression SimpleName sweep flag
large arc flag SimpleName InfixExpression ParenthesizedExpression ConditionalExpression NumberLiteral d
sweep flag SimpleName InfixExpression ParenthesizedExpression ConditionalExpression NumberLiteral d
d NumberLiteral PrefixExpression ConditionalExpression NumberLiteral d
sign SimpleName VariableDeclarationFragment ConditionalExpression PrefixExpression NumberLiteral d
sign SimpleName VariableDeclarationFragment ConditionalExpression NumberLiteral d
double PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName sign
double PrimitiveType VariableDeclarationStatement VariableDeclarationFragment ConditionalExpression NumberLiteral d
prx SimpleName InfixExpression SimpleName pry
prx SimpleName InfixExpression SimpleName py
pry SimpleName InfixExpression SimpleName px
prx SimpleName InfixExpression SimpleName py
pry SimpleName InfixExpression SimpleName px
math SimpleName MethodInvocation SimpleName sqrt
sign SimpleName InfixExpression MethodInvocation SimpleName math
sign SimpleName InfixExpression MethodInvocation SimpleName sqrt
float PrimitiveType CastExpression ParenthesizedExpression InfixExpression SimpleName sign
coef SimpleName VariableDeclarationFragment CastExpression PrimitiveType float
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName coef
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment CastExpression PrimitiveType float
rx SimpleName InfixExpression SimpleName y
rx SimpleName InfixExpression ParenthesizedExpression InfixExpression SimpleName ry
y SimpleName InfixExpression ParenthesizedExpression InfixExpression SimpleName ry
coef SimpleName InfixExpression ParenthesizedExpression InfixExpression SimpleName ry
cx SimpleName VariableDeclarationFragment InfixExpression SimpleName coef
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName cx
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment InfixExpression SimpleName coef
ry SimpleName InfixExpression SimpleName x
ry SimpleName InfixExpression ParenthesizedExpression InfixExpression SimpleName rx
x SimpleName InfixExpression ParenthesizedExpression InfixExpression SimpleName rx
cy SimpleName VariableDeclarationFragment InfixExpression SimpleName coef
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName cy
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment InfixExpression SimpleName coef
x SimpleName InfixExpression SimpleName x
x SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral . f
x SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral . f
sx SimpleName VariableDeclarationFragment InfixExpression NumberLiteral . f
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName sx
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment InfixExpression NumberLiteral . f
y SimpleName InfixExpression SimpleName y
y SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral . f
y SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral . f
sy SimpleName VariableDeclarationFragment InfixExpression NumberLiteral . f
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName sy
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment InfixExpression NumberLiteral . f
math SimpleName MethodInvocation SimpleName cos
math SimpleName MethodInvocation SimpleName theta
cos SimpleName MethodInvocation SimpleName theta
double PrimitiveType CastExpression SimpleName cx
math SimpleName MethodInvocation InfixExpression CastExpression PrimitiveType double
math SimpleName MethodInvocation InfixExpression CastExpression SimpleName cx
cos SimpleName MethodInvocation InfixExpression CastExpression PrimitiveType double
cos SimpleName MethodInvocation InfixExpression CastExpression SimpleName cx
theta SimpleName MethodInvocation InfixExpression CastExpression PrimitiveType double
theta SimpleName MethodInvocation InfixExpression CastExpression SimpleName cx
math SimpleName MethodInvocation SimpleName sin
math SimpleName MethodInvocation SimpleName theta
sin SimpleName MethodInvocation SimpleName theta
double PrimitiveType CastExpression SimpleName cy
math SimpleName MethodInvocation InfixExpression CastExpression PrimitiveType double
math SimpleName MethodInvocation InfixExpression CastExpression SimpleName cy
sin SimpleName MethodInvocation InfixExpression CastExpression PrimitiveType double
sin SimpleName MethodInvocation InfixExpression CastExpression SimpleName cy
theta SimpleName MethodInvocation InfixExpression CastExpression PrimitiveType double
theta SimpleName MethodInvocation InfixExpression CastExpression SimpleName cy
sx SimpleName InfixExpression CastExpression PrimitiveType float
cx SimpleName VariableDeclarationFragment InfixExpression SimpleName sx
cx SimpleName VariableDeclarationFragment InfixExpression CastExpression PrimitiveType float
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName cx
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment InfixExpression SimpleName sx
math SimpleName MethodInvocation SimpleName sin
math SimpleName MethodInvocation SimpleName theta
sin SimpleName MethodInvocation SimpleName theta
double PrimitiveType CastExpression SimpleName cx
math SimpleName MethodInvocation InfixExpression CastExpression PrimitiveType double
math SimpleName MethodInvocation InfixExpression CastExpression SimpleName cx
sin SimpleName MethodInvocation InfixExpression CastExpression PrimitiveType double
sin SimpleName MethodInvocation InfixExpression CastExpression SimpleName cx
theta SimpleName MethodInvocation InfixExpression CastExpression PrimitiveType double
theta SimpleName MethodInvocation InfixExpression CastExpression SimpleName cx
math SimpleName MethodInvocation SimpleName cos
math SimpleName MethodInvocation SimpleName theta
cos SimpleName MethodInvocation SimpleName theta
double PrimitiveType CastExpression SimpleName cy
math SimpleName MethodInvocation InfixExpression CastExpression PrimitiveType double
math SimpleName MethodInvocation InfixExpression CastExpression SimpleName cy
cos SimpleName MethodInvocation InfixExpression CastExpression PrimitiveType double
cos SimpleName MethodInvocation InfixExpression CastExpression SimpleName cy
theta SimpleName MethodInvocation InfixExpression CastExpression PrimitiveType double
theta SimpleName MethodInvocation InfixExpression CastExpression SimpleName cy
sy SimpleName InfixExpression CastExpression PrimitiveType float
cy SimpleName VariableDeclarationFragment InfixExpression SimpleName sy
cy SimpleName VariableDeclarationFragment InfixExpression CastExpression PrimitiveType float
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName cy
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment InfixExpression SimpleName sy
x SimpleName InfixExpression SimpleName cx
x SimpleName InfixExpression ParenthesizedExpression InfixExpression SimpleName rx
cx SimpleName InfixExpression ParenthesizedExpression InfixExpression SimpleName rx
ux SimpleName VariableDeclarationFragment InfixExpression SimpleName rx
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName ux
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment InfixExpression SimpleName rx
y SimpleName InfixExpression SimpleName cy
y SimpleName InfixExpression ParenthesizedExpression InfixExpression SimpleName ry
cy SimpleName InfixExpression ParenthesizedExpression InfixExpression SimpleName ry
uy SimpleName VariableDeclarationFragment InfixExpression SimpleName ry
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName uy
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment InfixExpression SimpleName ry
x SimpleName PrefixExpression InfixExpression SimpleName cx
cx SimpleName InfixExpression ParenthesizedExpression InfixExpression SimpleName rx
vx SimpleName VariableDeclarationFragment InfixExpression SimpleName rx
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName vx
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment InfixExpression SimpleName rx
y SimpleName PrefixExpression InfixExpression SimpleName cy
cy SimpleName InfixExpression ParenthesizedExpression InfixExpression SimpleName ry
vy SimpleName VariableDeclarationFragment InfixExpression SimpleName ry
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName vy
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment InfixExpression SimpleName ry
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName p
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName n
p SimpleName VariableDeclarationFragment VariableDeclarationStatement VariableDeclarationFragment SimpleName n
ux SimpleName InfixExpression SimpleName ux
uy SimpleName InfixExpression SimpleName uy
math SimpleName MethodInvocation SimpleName sqrt
float PrimitiveType CastExpression MethodInvocation SimpleName math
float PrimitiveType CastExpression MethodInvocation SimpleName sqrt
n SimpleName Assignment CastExpression PrimitiveType float
n SimpleName Assignment CastExpression MethodInvocation SimpleName math
n SimpleName Assignment CastExpression MethodInvocation SimpleName sqrt
p SimpleName Assignment SimpleName ux
uy SimpleName InfixExpression NumberLiteral empty
uy SimpleName InfixExpression ParenthesizedExpression ConditionalExpression NumberLiteral d
empty NumberLiteral InfixExpression ParenthesizedExpression ConditionalExpression NumberLiteral d
d NumberLiteral PrefixExpression ConditionalExpression NumberLiteral d
sign SimpleName Assignment ConditionalExpression PrefixExpression NumberLiteral d
sign SimpleName Assignment ConditionalExpression NumberLiteral d
p SimpleName InfixExpression SimpleName n
math SimpleName MethodInvocation SimpleName acos
math SimpleName MethodInvocation InfixExpression SimpleName p
math SimpleName MethodInvocation InfixExpression SimpleName n
acos SimpleName MethodInvocation InfixExpression SimpleName p
acos SimpleName MethodInvocation InfixExpression SimpleName n
sign SimpleName InfixExpression MethodInvocation SimpleName math
sign SimpleName InfixExpression MethodInvocation SimpleName acos
sign SimpleName InfixExpression MethodInvocation InfixExpression SimpleName p
sign SimpleName InfixExpression MethodInvocation InfixExpression SimpleName n
math SimpleName MethodInvocation SimpleName to degrees
math SimpleName MethodInvocation InfixExpression SimpleName sign
math SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName math
math SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName acos
to degrees SimpleName MethodInvocation InfixExpression SimpleName sign
to degrees SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName math
to degrees SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName acos
float PrimitiveType CastExpression MethodInvocation SimpleName math
float PrimitiveType CastExpression MethodInvocation SimpleName to degrees
float PrimitiveType CastExpression MethodInvocation InfixExpression SimpleName sign
angle start SimpleName VariableDeclarationFragment CastExpression PrimitiveType float
angle start SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName math
angle start SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName to degrees
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName angle start
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment CastExpression PrimitiveType float
ux SimpleName InfixExpression SimpleName ux
uy SimpleName InfixExpression SimpleName uy
ux SimpleName InfixExpression InfixExpression InfixExpression SimpleName uy
ux SimpleName InfixExpression InfixExpression InfixExpression SimpleName uy
ux SimpleName InfixExpression InfixExpression InfixExpression SimpleName uy
ux SimpleName InfixExpression InfixExpression InfixExpression SimpleName uy
vx SimpleName InfixExpression SimpleName vx
vy SimpleName InfixExpression SimpleName vy
vx SimpleName InfixExpression InfixExpression InfixExpression SimpleName vy
vx SimpleName InfixExpression InfixExpression InfixExpression SimpleName vy
vx SimpleName InfixExpression InfixExpression InfixExpression SimpleName vy
vx SimpleName InfixExpression InfixExpression InfixExpression SimpleName vy
math SimpleName MethodInvocation SimpleName sqrt
float PrimitiveType CastExpression MethodInvocation SimpleName math
float PrimitiveType CastExpression MethodInvocation SimpleName sqrt
n SimpleName Assignment CastExpression PrimitiveType float
n SimpleName Assignment CastExpression MethodInvocation SimpleName math
n SimpleName Assignment CastExpression MethodInvocation SimpleName sqrt
ux SimpleName InfixExpression SimpleName vx
uy SimpleName InfixExpression SimpleName vy
ux SimpleName InfixExpression InfixExpression InfixExpression SimpleName uy
ux SimpleName InfixExpression InfixExpression InfixExpression SimpleName vy
vx SimpleName InfixExpression InfixExpression InfixExpression SimpleName uy
vx SimpleName InfixExpression InfixExpression InfixExpression SimpleName vy
p SimpleName Assignment InfixExpression InfixExpression SimpleName ux
p SimpleName Assignment InfixExpression InfixExpression SimpleName vx
p SimpleName Assignment InfixExpression InfixExpression SimpleName uy
p SimpleName Assignment InfixExpression InfixExpression SimpleName vy
ux SimpleName InfixExpression SimpleName vy
uy SimpleName InfixExpression SimpleName vx
ux SimpleName InfixExpression InfixExpression InfixExpression SimpleName uy
ux SimpleName InfixExpression InfixExpression InfixExpression SimpleName vx
vy SimpleName InfixExpression InfixExpression InfixExpression SimpleName uy
vy SimpleName InfixExpression InfixExpression InfixExpression SimpleName vx
ux SimpleName InfixExpression InfixExpression InfixExpression NumberLiteral empty
vy SimpleName InfixExpression InfixExpression InfixExpression NumberLiteral empty
uy SimpleName InfixExpression InfixExpression InfixExpression NumberLiteral empty
vx SimpleName InfixExpression InfixExpression InfixExpression NumberLiteral empty
empty NumberLiteral InfixExpression ParenthesizedExpression ConditionalExpression NumberLiteral d
d NumberLiteral PrefixExpression ConditionalExpression NumberLiteral d
sign SimpleName Assignment ConditionalExpression PrefixExpression NumberLiteral d
sign SimpleName Assignment ConditionalExpression NumberLiteral d
p SimpleName InfixExpression SimpleName n
math SimpleName MethodInvocation SimpleName acos
math SimpleName MethodInvocation InfixExpression SimpleName p
math SimpleName MethodInvocation InfixExpression SimpleName n
acos SimpleName MethodInvocation InfixExpression SimpleName p
acos SimpleName MethodInvocation InfixExpression SimpleName n
sign SimpleName InfixExpression MethodInvocation SimpleName math
sign SimpleName InfixExpression MethodInvocation SimpleName acos
sign SimpleName InfixExpression MethodInvocation InfixExpression SimpleName p
sign SimpleName InfixExpression MethodInvocation InfixExpression SimpleName n
math SimpleName MethodInvocation SimpleName to degrees
math SimpleName MethodInvocation InfixExpression SimpleName sign
math SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName math
math SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName acos
to degrees SimpleName MethodInvocation InfixExpression SimpleName sign
to degrees SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName math
to degrees SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName acos
float PrimitiveType CastExpression MethodInvocation SimpleName math
float PrimitiveType CastExpression MethodInvocation SimpleName to degrees
float PrimitiveType CastExpression MethodInvocation InfixExpression SimpleName sign
angle extent SimpleName VariableDeclarationFragment CastExpression PrimitiveType float
angle extent SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName math
angle extent SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName to degrees
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName angle extent
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment CastExpression PrimitiveType float
angle extent SimpleName InfixExpression NumberLiteral empty
sweep flag SimpleName PrefixExpression InfixExpression InfixExpression SimpleName angle extent
sweep flag SimpleName PrefixExpression InfixExpression InfixExpression NumberLiteral empty
angle extent SimpleName Assignment NumberLiteral f
angle extent SimpleName InfixExpression NumberLiteral empty
sweep flag SimpleName InfixExpression InfixExpression SimpleName angle extent
sweep flag SimpleName InfixExpression InfixExpression NumberLiteral empty
angle extent SimpleName Assignment NumberLiteral f
angle extent SimpleName Assignment NumberLiteral f
angle start SimpleName Assignment NumberLiteral f
arc SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType QualifiedName arc dfloat
arc dfloat QualifiedName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName arc
cx SimpleName InfixExpression SimpleName rx
arcx QualifiedName Assignment InfixExpression SimpleName cx
arcx QualifiedName Assignment InfixExpression SimpleName rx
cy SimpleName InfixExpression SimpleName ry
arcy QualifiedName Assignment InfixExpression SimpleName cy
arcy QualifiedName Assignment InfixExpression SimpleName ry
rx SimpleName InfixExpression NumberLiteral . f
arcwidth QualifiedName Assignment InfixExpression SimpleName rx
arcwidth QualifiedName Assignment InfixExpression NumberLiteral . f
ry SimpleName InfixExpression NumberLiteral . f
archeight QualifiedName Assignment InfixExpression SimpleName ry
archeight QualifiedName Assignment InfixExpression NumberLiteral . f
arcstart QualifiedName Assignment PrefixExpression SimpleName angle start
arcextent QualifiedName Assignment PrefixExpression SimpleName angle extent
append SimpleName MethodInvocation SimpleName arc
append SimpleName MethodInvocation BooleanLiteral true
arc SimpleName MethodInvocation BooleanLiteral true
float PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType float
float PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType float
float PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType float
float PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType float
float PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType float
float PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType float
float PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType float
float PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType float
float PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType float
float PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType float
float PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType float
float PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType float
float PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType float
float PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType float
float PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType float
float PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType float
float PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType float
float PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType float
float PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType float
float PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType float
float PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType float
float PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType float
float PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType double
float PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType float
float PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType float
float PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType double
float PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType double
float PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType float
float PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType double
float PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType double
float PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType float
float PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType double
float PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType double
float PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType float
float PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType float
double PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType double
double PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType float
double PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType float
double PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType float
double PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType float
double PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType float
double PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType float
double PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType float
double PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType float
float PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType float
float PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType float
float PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType float
float PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType float
float PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType float
float PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType float
float PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType float
float PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType float
float PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType float
float PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType float
float PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType float
float PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType float
float PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType float
