float PrimitiveType SingleVariableDeclaration SimpleName unit time
int PrimitiveType SingleVariableDeclaration SimpleName repeat iteration
animatable value SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName value
animatable value SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName accumulation
value SimpleName VariableDeclarationFragment VariableDeclarationStatement VariableDeclarationFragment SimpleName accumulation
interpolation SimpleName VariableDeclarationFragment NumberLiteral empty
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName interpolation
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment NumberLiteral empty
unit time SimpleName InfixExpression NumberLiteral empty
key time index SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName key time index
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment NumberLiteral empty
key timeslength QualifiedName InfixExpression NumberLiteral empty
key time index SimpleName InfixExpression InfixExpression QualifiedName key timeslength
key time index SimpleName InfixExpression InfixExpression NumberLiteral empty
key time index SimpleName InfixExpression NumberLiteral empty
key times SimpleName ArrayAccess InfixExpression SimpleName key time index
key times SimpleName ArrayAccess InfixExpression NumberLiteral empty
unit time SimpleName InfixExpression ArrayAccess SimpleName key times
unit time SimpleName InfixExpression ArrayAccess InfixExpression SimpleName key time index
unit time SimpleName InfixExpression ArrayAccess InfixExpression NumberLiteral empty
key time index SimpleName InfixExpression InfixExpression InfixExpression SimpleName unit time
key timeslength QualifiedName InfixExpression NumberLiteral empty
key time index SimpleName InfixExpression InfixExpression QualifiedName key timeslength
key time index SimpleName InfixExpression InfixExpression NumberLiteral empty
calc mode SimpleName InfixExpression SimpleName calc mode discrete
key time index SimpleName InfixExpression InfixExpression InfixExpression SimpleName calc mode
key time index SimpleName InfixExpression InfixExpression InfixExpression SimpleName calc mode discrete
key timeslength QualifiedName InfixExpression NumberLiteral empty
key time index SimpleName Assignment InfixExpression QualifiedName key timeslength
key time index SimpleName Assignment InfixExpression NumberLiteral empty
interpolation SimpleName Assignment NumberLiteral empty
calc mode SimpleName InfixExpression SimpleName calc mode linear
calc mode SimpleName InfixExpression SimpleName calc mode paced
calc mode SimpleName InfixExpression InfixExpression InfixExpression SimpleName calc mode
calc mode SimpleName InfixExpression InfixExpression InfixExpression SimpleName calc mode paced
calc mode linear SimpleName InfixExpression InfixExpression InfixExpression SimpleName calc mode
calc mode linear SimpleName InfixExpression InfixExpression InfixExpression SimpleName calc mode paced
calc mode SimpleName InfixExpression SimpleName calc mode spline
key times SimpleName ArrayAccess SimpleName key time index
unit time SimpleName InfixExpression ArrayAccess SimpleName key times
unit time SimpleName InfixExpression ArrayAccess SimpleName key time index
key time index SimpleName InfixExpression NumberLiteral empty
key times SimpleName ArrayAccess InfixExpression SimpleName key time index
key times SimpleName ArrayAccess InfixExpression NumberLiteral empty
key times SimpleName ArrayAccess SimpleName key time index
key times SimpleName ArrayAccess InfixExpression ArrayAccess SimpleName key times
key times SimpleName ArrayAccess InfixExpression ArrayAccess SimpleName key time index
calc mode SimpleName InfixExpression SimpleName calc mode spline
unit time SimpleName InfixExpression NumberLiteral empty
calc mode SimpleName InfixExpression InfixExpression InfixExpression SimpleName unit time
calc mode SimpleName InfixExpression InfixExpression InfixExpression NumberLiteral empty
calc mode spline SimpleName InfixExpression InfixExpression InfixExpression SimpleName unit time
calc mode spline SimpleName InfixExpression InfixExpression InfixExpression NumberLiteral empty
key spline cubics SimpleName ArrayAccess SimpleName key time index
c SimpleName VariableDeclarationFragment ArrayAccess SimpleName key spline cubics
c SimpleName VariableDeclarationFragment ArrayAccess SimpleName key time index
cubic SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName c
tolerance SimpleName VariableDeclarationFragment NumberLiteral . f
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName tolerance
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment NumberLiteral . f
min SimpleName VariableDeclarationFragment NumberLiteral empty
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName min
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment NumberLiteral empty
max SimpleName VariableDeclarationFragment NumberLiteral empty
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName max
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment NumberLiteral empty
point ddouble QualifiedName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName p
min SimpleName InfixExpression SimpleName max
min SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
max SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
t SimpleName VariableDeclarationFragment InfixExpression NumberLiteral empty
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName t
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment InfixExpression NumberLiteral empty
c SimpleName MethodInvocation SimpleName eval
c SimpleName MethodInvocation SimpleName t
eval SimpleName MethodInvocation SimpleName t
p SimpleName Assignment MethodInvocation SimpleName c
p SimpleName Assignment MethodInvocation SimpleName eval
p SimpleName Assignment MethodInvocation SimpleName t
p SimpleName MethodInvocation SimpleName get x
x SimpleName VariableDeclarationFragment MethodInvocation SimpleName p
x SimpleName VariableDeclarationFragment MethodInvocation SimpleName get x
double PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName x
double PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName p
double PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get x
x SimpleName InfixExpression SimpleName interpolation
math SimpleName MethodInvocation SimpleName abs
math SimpleName MethodInvocation InfixExpression SimpleName x
math SimpleName MethodInvocation InfixExpression SimpleName interpolation
abs SimpleName MethodInvocation InfixExpression SimpleName x
abs SimpleName MethodInvocation InfixExpression SimpleName interpolation
math SimpleName MethodInvocation InfixExpression SimpleName tolerance
abs SimpleName MethodInvocation InfixExpression SimpleName tolerance
x SimpleName InfixExpression MethodInvocation InfixExpression SimpleName tolerance
interpolation SimpleName InfixExpression MethodInvocation InfixExpression SimpleName tolerance
x SimpleName InfixExpression SimpleName interpolation
min SimpleName Assignment SimpleName t
max SimpleName Assignment SimpleName t
float PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType double
p SimpleName MethodInvocation SimpleName get y
float PrimitiveType CastExpression MethodInvocation SimpleName p
float PrimitiveType CastExpression MethodInvocation SimpleName get y
interpolation SimpleName Assignment CastExpression PrimitiveType float
interpolation SimpleName Assignment CastExpression MethodInvocation SimpleName p
interpolation SimpleName Assignment CastExpression MethodInvocation SimpleName get y
float PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType float
float PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType float
float PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType float
key points SimpleName ArrayAccess SimpleName key time index
point SimpleName VariableDeclarationFragment ArrayAccess SimpleName key points
point SimpleName VariableDeclarationFragment ArrayAccess SimpleName key time index
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName point
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment ArrayAccess SimpleName key points
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment ArrayAccess SimpleName key time index
interpolation SimpleName InfixExpression NumberLiteral empty
key time index SimpleName InfixExpression NumberLiteral empty
key points SimpleName ArrayAccess InfixExpression SimpleName key time index
key points SimpleName ArrayAccess InfixExpression NumberLiteral empty
key points SimpleName ArrayAccess SimpleName key time index
key points SimpleName ArrayAccess InfixExpression ArrayAccess SimpleName key points
key points SimpleName ArrayAccess InfixExpression ArrayAccess SimpleName key time index
point SimpleName Assignment InfixExpression SimpleName interpolation
path length SimpleName MethodInvocation SimpleName point at length
path length SimpleName MethodInvocation SimpleName point
point at length SimpleName MethodInvocation SimpleName point
p SimpleName VariableDeclarationFragment MethodInvocation SimpleName path length
p SimpleName VariableDeclarationFragment MethodInvocation SimpleName point at length
p SimpleName VariableDeclarationFragment MethodInvocation SimpleName point
point d SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName p
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName ang
path length SimpleName MethodInvocation SimpleName angle at length
path length SimpleName MethodInvocation SimpleName point
angle at length SimpleName MethodInvocation SimpleName point
ang SimpleName Assignment MethodInvocation SimpleName path length
ang SimpleName Assignment MethodInvocation SimpleName angle at length
ang SimpleName Assignment MethodInvocation SimpleName point
ang SimpleName Assignment QualifiedName mathpi
ang SimpleName Assignment SimpleName rotate angle
rotate auto SimpleName IfStatement Block IfStatement SimpleName rotate auto reverse
p SimpleName MethodInvocation SimpleName get x
float PrimitiveType CastExpression MethodInvocation SimpleName p
float PrimitiveType CastExpression MethodInvocation SimpleName get x
p SimpleName MethodInvocation SimpleName get y
float PrimitiveType CastExpression MethodInvocation SimpleName p
float PrimitiveType CastExpression MethodInvocation SimpleName get y
animatable motion point value SimpleName SimpleType ClassInstanceCreation CastExpression PrimitiveType float
animatable motion point value SimpleName SimpleType ClassInstanceCreation CastExpression PrimitiveType float
animatable motion point value SimpleName SimpleType ClassInstanceCreation SimpleName ang
float PrimitiveType CastExpression ClassInstanceCreation CastExpression PrimitiveType float
float PrimitiveType CastExpression ClassInstanceCreation SimpleName ang
p SimpleName MethodInvocation CastExpression ClassInstanceCreation SimpleName ang
get x SimpleName MethodInvocation CastExpression ClassInstanceCreation SimpleName ang
float PrimitiveType CastExpression ClassInstanceCreation SimpleName ang
p SimpleName MethodInvocation CastExpression ClassInstanceCreation SimpleName ang
get y SimpleName MethodInvocation CastExpression ClassInstanceCreation SimpleName ang
value SimpleName Assignment ClassInstanceCreation SimpleType SimpleName animatable motion point value
value SimpleName Assignment ClassInstanceCreation CastExpression PrimitiveType float
value SimpleName Assignment ClassInstanceCreation CastExpression PrimitiveType float
value SimpleName Assignment ClassInstanceCreation SimpleName ang
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType float
float PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType float
float PrimitiveType VariableDeclarationStatement Block IfStatement SimpleName rotate auto
float PrimitiveType VariableDeclarationStatement Block IfStatement SimpleName rotate auto
path length SimpleName MethodInvocation SimpleName length of path
path length SimpleName MethodInvocation SimpleName point at length
path length SimpleName MethodInvocation MethodInvocation SimpleName path length
path length SimpleName MethodInvocation MethodInvocation SimpleName length of path
point at length SimpleName MethodInvocation MethodInvocation SimpleName path length
point at length SimpleName MethodInvocation MethodInvocation SimpleName length of path
p SimpleName VariableDeclarationFragment MethodInvocation SimpleName path length
p SimpleName VariableDeclarationFragment MethodInvocation SimpleName point at length
p SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName path length
p SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName length of path
point d SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName p
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName ang
path length SimpleName MethodInvocation SimpleName length of path
path length SimpleName MethodInvocation SimpleName angle at length
path length SimpleName MethodInvocation MethodInvocation SimpleName path length
path length SimpleName MethodInvocation MethodInvocation SimpleName length of path
angle at length SimpleName MethodInvocation MethodInvocation SimpleName path length
angle at length SimpleName MethodInvocation MethodInvocation SimpleName length of path
ang SimpleName Assignment MethodInvocation SimpleName path length
ang SimpleName Assignment MethodInvocation SimpleName angle at length
ang SimpleName Assignment MethodInvocation MethodInvocation SimpleName path length
ang SimpleName Assignment MethodInvocation MethodInvocation SimpleName length of path
ang SimpleName Assignment QualifiedName mathpi
ang SimpleName Assignment SimpleName rotate angle
rotate auto SimpleName IfStatement Block IfStatement SimpleName rotate auto reverse
p SimpleName MethodInvocation SimpleName get x
float PrimitiveType CastExpression MethodInvocation SimpleName p
float PrimitiveType CastExpression MethodInvocation SimpleName get x
p SimpleName MethodInvocation SimpleName get y
float PrimitiveType CastExpression MethodInvocation SimpleName p
float PrimitiveType CastExpression MethodInvocation SimpleName get y
animatable motion point value SimpleName SimpleType ClassInstanceCreation CastExpression PrimitiveType float
animatable motion point value SimpleName SimpleType ClassInstanceCreation CastExpression PrimitiveType float
animatable motion point value SimpleName SimpleType ClassInstanceCreation SimpleName ang
float PrimitiveType CastExpression ClassInstanceCreation CastExpression PrimitiveType float
float PrimitiveType CastExpression ClassInstanceCreation SimpleName ang
p SimpleName MethodInvocation CastExpression ClassInstanceCreation SimpleName ang
get x SimpleName MethodInvocation CastExpression ClassInstanceCreation SimpleName ang
float PrimitiveType CastExpression ClassInstanceCreation SimpleName ang
p SimpleName MethodInvocation CastExpression ClassInstanceCreation SimpleName ang
get y SimpleName MethodInvocation CastExpression ClassInstanceCreation SimpleName ang
value SimpleName Assignment ClassInstanceCreation SimpleType SimpleName animatable motion point value
value SimpleName Assignment ClassInstanceCreation CastExpression PrimitiveType float
value SimpleName Assignment ClassInstanceCreation CastExpression PrimitiveType float
value SimpleName Assignment ClassInstanceCreation SimpleName ang
float PrimitiveType VariableDeclarationStatement Block IfStatement SimpleName rotate auto
path length SimpleName MethodInvocation SimpleName length of path
path length SimpleName MethodInvocation SimpleName point at length
path length SimpleName MethodInvocation MethodInvocation SimpleName path length
path length SimpleName MethodInvocation MethodInvocation SimpleName length of path
point at length SimpleName MethodInvocation MethodInvocation SimpleName path length
point at length SimpleName MethodInvocation MethodInvocation SimpleName length of path
p SimpleName VariableDeclarationFragment MethodInvocation SimpleName path length
p SimpleName VariableDeclarationFragment MethodInvocation SimpleName point at length
p SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName path length
p SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName length of path
point d SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName p
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName ang
path length SimpleName MethodInvocation SimpleName length of path
path length SimpleName MethodInvocation SimpleName angle at length
path length SimpleName MethodInvocation MethodInvocation SimpleName path length
path length SimpleName MethodInvocation MethodInvocation SimpleName length of path
angle at length SimpleName MethodInvocation MethodInvocation SimpleName path length
angle at length SimpleName MethodInvocation MethodInvocation SimpleName length of path
ang SimpleName Assignment MethodInvocation SimpleName path length
ang SimpleName Assignment MethodInvocation SimpleName angle at length
ang SimpleName Assignment MethodInvocation MethodInvocation SimpleName path length
ang SimpleName Assignment MethodInvocation MethodInvocation SimpleName length of path
ang SimpleName Assignment QualifiedName mathpi
ang SimpleName Assignment SimpleName rotate angle
rotate auto SimpleName IfStatement Block IfStatement SimpleName rotate auto reverse
p SimpleName MethodInvocation SimpleName get x
float PrimitiveType CastExpression MethodInvocation SimpleName p
float PrimitiveType CastExpression MethodInvocation SimpleName get x
p SimpleName MethodInvocation SimpleName get y
float PrimitiveType CastExpression MethodInvocation SimpleName p
float PrimitiveType CastExpression MethodInvocation SimpleName get y
animatable motion point value SimpleName SimpleType ClassInstanceCreation CastExpression PrimitiveType float
animatable motion point value SimpleName SimpleType ClassInstanceCreation CastExpression PrimitiveType float
animatable motion point value SimpleName SimpleType ClassInstanceCreation SimpleName ang
float PrimitiveType CastExpression ClassInstanceCreation CastExpression PrimitiveType float
float PrimitiveType CastExpression ClassInstanceCreation SimpleName ang
p SimpleName MethodInvocation CastExpression ClassInstanceCreation SimpleName ang
get x SimpleName MethodInvocation CastExpression ClassInstanceCreation SimpleName ang
float PrimitiveType CastExpression ClassInstanceCreation SimpleName ang
p SimpleName MethodInvocation CastExpression ClassInstanceCreation SimpleName ang
get y SimpleName MethodInvocation CastExpression ClassInstanceCreation SimpleName ang
accumulation SimpleName Assignment ClassInstanceCreation SimpleType SimpleName animatable motion point value
accumulation SimpleName Assignment ClassInstanceCreation CastExpression PrimitiveType float
accumulation SimpleName Assignment ClassInstanceCreation CastExpression PrimitiveType float
accumulation SimpleName Assignment ClassInstanceCreation SimpleName ang
float PrimitiveType VariableDeclarationStatement Block IfStatement SimpleName rotate auto
cumulative SimpleName IfStatement Block VariableDeclarationStatement PrimitiveType float
cumulative SimpleName IfStatement Block IfStatement SimpleName rotate auto
value SimpleName MethodInvocation SimpleName interpolate
value SimpleName MethodInvocation FieldAccess SimpleName value
value SimpleName MethodInvocation SimpleName interpolation
value SimpleName MethodInvocation SimpleName accumulation
interpolate SimpleName MethodInvocation FieldAccess SimpleName value
interpolate SimpleName MethodInvocation SimpleName interpolation
interpolate SimpleName MethodInvocation SimpleName accumulation
interpolate SimpleName MethodInvocation SimpleName repeat iteration
value SimpleName FieldAccess MethodInvocation SimpleName interpolation
value SimpleName FieldAccess MethodInvocation SimpleName accumulation
value SimpleName FieldAccess MethodInvocation SimpleName repeat iteration
interpolation SimpleName MethodInvocation SimpleName accumulation
interpolation SimpleName MethodInvocation SimpleName repeat iteration
accumulation SimpleName MethodInvocation SimpleName repeat iteration
value SimpleName FieldAccess Assignment MethodInvocation SimpleName value
value SimpleName FieldAccess Assignment MethodInvocation SimpleName interpolate
value SimpleName FieldAccess Assignment MethodInvocation SimpleName interpolation
value SimpleName FieldAccess Assignment MethodInvocation SimpleName accumulation
value SimpleName FieldAccess Assignment MethodInvocation SimpleName repeat iteration
value SimpleName FieldAccess MethodInvocation SimpleName has changed
float PrimitiveType VariableDeclarationStatement Block IfStatement SimpleName cumulative
protected Modifier MethodDeclaration PrimitiveType void
protected Modifier MethodDeclaration SimpleName sampled at unit time
protected Modifier MethodDeclaration SingleVariableDeclaration PrimitiveType float
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleName unit time
protected Modifier MethodDeclaration SingleVariableDeclaration PrimitiveType int
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleName repeat iteration
protected Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType float
protected Modifier MethodDeclaration Block IfStatement SimpleName cumulative
void PrimitiveType MethodDeclaration SimpleName sampled at unit time
void PrimitiveType MethodDeclaration SingleVariableDeclaration PrimitiveType float
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName unit time
void PrimitiveType MethodDeclaration SingleVariableDeclaration PrimitiveType int
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName repeat iteration
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType float
void PrimitiveType MethodDeclaration Block IfStatement SimpleName cumulative
sampled at unit time SimpleName MethodDeclaration SingleVariableDeclaration PrimitiveType float
sampled at unit time SimpleName MethodDeclaration SingleVariableDeclaration SimpleName unit time
sampled at unit time SimpleName MethodDeclaration SingleVariableDeclaration PrimitiveType int
sampled at unit time SimpleName MethodDeclaration SingleVariableDeclaration SimpleName repeat iteration
sampled at unit time SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType float
sampled at unit time SimpleName MethodDeclaration Block IfStatement SimpleName cumulative
float PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
float PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName repeat iteration
unit time SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
unit time SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName repeat iteration
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier protected
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName sampled at unit time
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType float
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName unit time
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName repeat iteration
test SimpleName TypeDeclaration MethodDeclaration Modifier protected
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName sampled at unit time
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType float
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName unit time
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName repeat iteration
