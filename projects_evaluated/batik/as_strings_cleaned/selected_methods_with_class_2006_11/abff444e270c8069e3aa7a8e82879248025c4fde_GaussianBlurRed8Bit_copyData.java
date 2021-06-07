writable raster SimpleName SimpleType SingleVariableDeclaration SimpleName wr
get sources SimpleName MethodInvocation MethodInvocation SimpleName get
get sources SimpleName MethodInvocation MethodInvocation NumberLiteral empty
get SimpleName MethodInvocation NumberLiteral empty
cachable red SimpleName SimpleType CastExpression MethodInvocation SimpleName get
cachable red SimpleName SimpleType CastExpression MethodInvocation NumberLiteral empty
src SimpleName VariableDeclarationFragment CastExpression SimpleType SimpleName cachable red
src SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName get
src SimpleName VariableDeclarationFragment CastExpression MethodInvocation NumberLiteral empty
cachable red SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName src
wr SimpleName MethodInvocation SimpleName get bounds
r SimpleName VariableDeclarationFragment MethodInvocation SimpleName wr
r SimpleName VariableDeclarationFragment MethodInvocation SimpleName get bounds
rectangle SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName r
rx QualifiedName Assignment SimpleName xinset
ry QualifiedName Assignment SimpleName yinset
empty NumberLiteral InfixExpression SimpleName xinset
rwidth QualifiedName Assignment InfixExpression NumberLiteral empty
rwidth QualifiedName Assignment InfixExpression SimpleName xinset
empty NumberLiteral InfixExpression SimpleName yinset
rheight QualifiedName Assignment InfixExpression NumberLiteral empty
rheight QualifiedName Assignment InfixExpression SimpleName yinset
src SimpleName MethodInvocation SimpleName get color model
src cm SimpleName VariableDeclarationFragment MethodInvocation SimpleName src
src cm SimpleName VariableDeclarationFragment MethodInvocation SimpleName get color model
color model SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName src cm
writable raster SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName tmp r
writable raster SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName tmp r
tmp r SimpleName VariableDeclarationFragment VariableDeclarationStatement VariableDeclarationFragment SimpleName tmp r
src cm SimpleName MethodInvocation SimpleName create compatible writable raster
src cm SimpleName MethodInvocation QualifiedName rwidth
src cm SimpleName MethodInvocation QualifiedName rheight
create compatible writable raster SimpleName MethodInvocation QualifiedName rwidth
create compatible writable raster SimpleName MethodInvocation QualifiedName rheight
rwidth QualifiedName MethodInvocation QualifiedName rheight
tmp r SimpleName Assignment MethodInvocation SimpleName src cm
tmp r SimpleName Assignment MethodInvocation SimpleName create compatible writable raster
tmp r SimpleName Assignment MethodInvocation QualifiedName rwidth
tmp r SimpleName Assignment MethodInvocation QualifiedName rheight
writable raster SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName fill
tmp r SimpleName MethodInvocation SimpleName create writable translated child
tmp r SimpleName MethodInvocation QualifiedName rx
tmp r SimpleName MethodInvocation QualifiedName ry
create writable translated child SimpleName MethodInvocation QualifiedName rx
create writable translated child SimpleName MethodInvocation QualifiedName ry
rx QualifiedName MethodInvocation QualifiedName ry
fill SimpleName Assignment MethodInvocation SimpleName tmp r
fill SimpleName Assignment MethodInvocation SimpleName create writable translated child
fill SimpleName Assignment MethodInvocation QualifiedName rx
fill SimpleName Assignment MethodInvocation QualifiedName ry
src SimpleName MethodInvocation SimpleName copy data
src SimpleName MethodInvocation SimpleName fill
copy data SimpleName MethodInvocation SimpleName fill
src cm SimpleName MethodInvocation SimpleName has alpha
src cm SimpleName MethodInvocation SimpleName is alpha premultiplied
graphics util SimpleName MethodInvocation SimpleName coerce data
graphics util SimpleName MethodInvocation SimpleName tmp r
graphics util SimpleName MethodInvocation SimpleName src cm
graphics util SimpleName MethodInvocation BooleanLiteral true
coerce data SimpleName MethodInvocation SimpleName tmp r
coerce data SimpleName MethodInvocation SimpleName src cm
coerce data SimpleName MethodInvocation BooleanLiteral true
tmp r SimpleName MethodInvocation SimpleName src cm
tmp r SimpleName MethodInvocation BooleanLiteral true
src cm SimpleName MethodInvocation BooleanLiteral true
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName skip x
xinset SimpleName InfixExpression NumberLiteral empty
skip x SimpleName Assignment NumberLiteral empty
conv op SimpleName ArrayAccess NumberLiteral empty
get color model SimpleName MethodInvocation MethodInvocation SimpleName create compatible writable raster
get color model SimpleName MethodInvocation MethodInvocation QualifiedName rwidth
get color model SimpleName MethodInvocation MethodInvocation QualifiedName rheight
create compatible writable raster SimpleName MethodInvocation QualifiedName rwidth
create compatible writable raster SimpleName MethodInvocation QualifiedName rheight
rwidth QualifiedName MethodInvocation QualifiedName rheight
tmp r SimpleName Assignment MethodInvocation MethodInvocation SimpleName get color model
tmp r SimpleName Assignment MethodInvocation SimpleName create compatible writable raster
tmp r SimpleName Assignment MethodInvocation QualifiedName rwidth
tmp r SimpleName Assignment MethodInvocation QualifiedName rheight
conv op SimpleName ArrayAccess NumberLiteral empty
conv op SimpleName ArrayAccess MethodInvocation SimpleName filter
empty NumberLiteral ArrayAccess MethodInvocation SimpleName filter
conv op SimpleName ArrayAccess MethodInvocation SimpleName tmp r
empty NumberLiteral ArrayAccess MethodInvocation SimpleName tmp r
conv op SimpleName ArrayAccess MethodInvocation SimpleName tmp r
empty NumberLiteral ArrayAccess MethodInvocation SimpleName tmp r
filter SimpleName MethodInvocation SimpleName tmp r
filter SimpleName MethodInvocation SimpleName tmp r
tmp r SimpleName MethodInvocation SimpleName tmp r
tmp r SimpleName Assignment MethodInvocation ArrayAccess SimpleName conv op
tmp r SimpleName Assignment MethodInvocation ArrayAccess NumberLiteral empty
tmp r SimpleName Assignment MethodInvocation SimpleName filter
tmp r SimpleName Assignment MethodInvocation SimpleName tmp r
tmp r SimpleName Assignment MethodInvocation SimpleName tmp r
conv op SimpleName ArrayAccess NumberLiteral empty
conv op SimpleName ArrayAccess MethodInvocation SimpleName get kernel
empty NumberLiteral ArrayAccess MethodInvocation SimpleName get kernel
conv op SimpleName ArrayAccess MethodInvocation MethodInvocation SimpleName get x origin
empty NumberLiteral ArrayAccess MethodInvocation MethodInvocation SimpleName get x origin
get kernel SimpleName MethodInvocation MethodInvocation SimpleName get x origin
skip x SimpleName Assignment MethodInvocation MethodInvocation SimpleName get kernel
skip x SimpleName Assignment MethodInvocation SimpleName get x origin
tmp SimpleName VariableDeclarationFragment SimpleName tmp r
writable raster SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName tmp
writable raster SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName tmp r
tmp r SimpleName Assignment SimpleName tmp r
tmp r SimpleName Assignment SimpleName tmp
d x SimpleName InfixExpression NumberLiteral x
d x SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
x NumberLiteral InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
d x SimpleName InfixExpression NumberLiteral empty
box filter h SimpleName MethodInvocation SimpleName tmp r
box filter h SimpleName MethodInvocation SimpleName tmp r
box filter h SimpleName MethodInvocation NumberLiteral empty
box filter h SimpleName MethodInvocation NumberLiteral empty
box filter h SimpleName MethodInvocation SimpleName d x
tmp r SimpleName MethodInvocation SimpleName tmp r
tmp r SimpleName MethodInvocation NumberLiteral empty
tmp r SimpleName MethodInvocation NumberLiteral empty
tmp r SimpleName MethodInvocation SimpleName d x
tmp r SimpleName MethodInvocation InfixExpression SimpleName d x
tmp r SimpleName MethodInvocation InfixExpression NumberLiteral empty
tmp r SimpleName MethodInvocation NumberLiteral empty
tmp r SimpleName MethodInvocation NumberLiteral empty
tmp r SimpleName MethodInvocation SimpleName d x
tmp r SimpleName MethodInvocation InfixExpression SimpleName d x
tmp r SimpleName MethodInvocation InfixExpression NumberLiteral empty
empty NumberLiteral MethodInvocation NumberLiteral empty
empty NumberLiteral MethodInvocation SimpleName d x
empty NumberLiteral MethodInvocation InfixExpression SimpleName d x
empty NumberLiteral MethodInvocation InfixExpression NumberLiteral empty
empty NumberLiteral MethodInvocation SimpleName d x
empty NumberLiteral MethodInvocation InfixExpression SimpleName d x
empty NumberLiteral MethodInvocation InfixExpression NumberLiteral empty
d x SimpleName MethodInvocation InfixExpression SimpleName d x
d x SimpleName MethodInvocation InfixExpression NumberLiteral empty
tmp r SimpleName Assignment MethodInvocation SimpleName box filter h
tmp r SimpleName Assignment MethodInvocation SimpleName tmp r
tmp r SimpleName Assignment MethodInvocation SimpleName tmp r
tmp r SimpleName Assignment MethodInvocation NumberLiteral empty
tmp r SimpleName Assignment MethodInvocation NumberLiteral empty
tmp r SimpleName Assignment MethodInvocation SimpleName d x
tmp r SimpleName Assignment MethodInvocation InfixExpression SimpleName d x
tmp r SimpleName Assignment MethodInvocation InfixExpression NumberLiteral empty
d x SimpleName InfixExpression NumberLiteral empty
d x SimpleName InfixExpression NumberLiteral empty
d x SimpleName InfixExpression InfixExpression NumberLiteral empty
empty NumberLiteral InfixExpression InfixExpression NumberLiteral empty
box filter h SimpleName MethodInvocation SimpleName tmp r
box filter h SimpleName MethodInvocation SimpleName tmp r
box filter h SimpleName MethodInvocation InfixExpression SimpleName d x
box filter h SimpleName MethodInvocation InfixExpression NumberLiteral empty
box filter h SimpleName MethodInvocation NumberLiteral empty
box filter h SimpleName MethodInvocation SimpleName d x
tmp r SimpleName MethodInvocation SimpleName tmp r
tmp r SimpleName MethodInvocation InfixExpression SimpleName d x
tmp r SimpleName MethodInvocation InfixExpression NumberLiteral empty
tmp r SimpleName MethodInvocation NumberLiteral empty
tmp r SimpleName MethodInvocation SimpleName d x
tmp r SimpleName MethodInvocation InfixExpression InfixExpression SimpleName d x
tmp r SimpleName MethodInvocation InfixExpression InfixExpression NumberLiteral empty
tmp r SimpleName MethodInvocation InfixExpression NumberLiteral empty
tmp r SimpleName MethodInvocation InfixExpression SimpleName d x
tmp r SimpleName MethodInvocation InfixExpression NumberLiteral empty
tmp r SimpleName MethodInvocation NumberLiteral empty
tmp r SimpleName MethodInvocation SimpleName d x
tmp r SimpleName MethodInvocation InfixExpression InfixExpression SimpleName d x
tmp r SimpleName MethodInvocation InfixExpression InfixExpression NumberLiteral empty
tmp r SimpleName MethodInvocation InfixExpression NumberLiteral empty
d x SimpleName InfixExpression MethodInvocation NumberLiteral empty
empty NumberLiteral InfixExpression MethodInvocation NumberLiteral empty
d x SimpleName InfixExpression MethodInvocation SimpleName d x
empty NumberLiteral InfixExpression MethodInvocation SimpleName d x
d x SimpleName InfixExpression MethodInvocation InfixExpression NumberLiteral empty
empty NumberLiteral InfixExpression MethodInvocation InfixExpression NumberLiteral empty
empty NumberLiteral MethodInvocation SimpleName d x
empty NumberLiteral MethodInvocation InfixExpression InfixExpression SimpleName d x
empty NumberLiteral MethodInvocation InfixExpression InfixExpression NumberLiteral empty
empty NumberLiteral MethodInvocation InfixExpression NumberLiteral empty
d x SimpleName MethodInvocation InfixExpression InfixExpression SimpleName d x
d x SimpleName MethodInvocation InfixExpression InfixExpression NumberLiteral empty
d x SimpleName MethodInvocation InfixExpression NumberLiteral empty
tmp r SimpleName Assignment MethodInvocation SimpleName box filter h
tmp r SimpleName Assignment MethodInvocation SimpleName tmp r
tmp r SimpleName Assignment MethodInvocation SimpleName tmp r
tmp r SimpleName Assignment MethodInvocation InfixExpression SimpleName d x
tmp r SimpleName Assignment MethodInvocation InfixExpression NumberLiteral empty
tmp r SimpleName Assignment MethodInvocation NumberLiteral empty
tmp r SimpleName Assignment MethodInvocation SimpleName d x
tmp r SimpleName Assignment MethodInvocation InfixExpression NumberLiteral empty
d x SimpleName InfixExpression NumberLiteral empty
d x SimpleName InfixExpression NumberLiteral empty
d x SimpleName InfixExpression NumberLiteral empty
box filter h SimpleName MethodInvocation SimpleName tmp r
box filter h SimpleName MethodInvocation SimpleName tmp r
box filter h SimpleName MethodInvocation InfixExpression SimpleName d x
box filter h SimpleName MethodInvocation InfixExpression NumberLiteral empty
box filter h SimpleName MethodInvocation NumberLiteral empty
box filter h SimpleName MethodInvocation InfixExpression SimpleName d x
box filter h SimpleName MethodInvocation InfixExpression NumberLiteral empty
tmp r SimpleName MethodInvocation SimpleName tmp r
tmp r SimpleName MethodInvocation InfixExpression SimpleName d x
tmp r SimpleName MethodInvocation InfixExpression NumberLiteral empty
tmp r SimpleName MethodInvocation NumberLiteral empty
tmp r SimpleName MethodInvocation InfixExpression SimpleName d x
tmp r SimpleName MethodInvocation InfixExpression NumberLiteral empty
tmp r SimpleName MethodInvocation InfixExpression SimpleName d x
tmp r SimpleName MethodInvocation InfixExpression NumberLiteral empty
tmp r SimpleName MethodInvocation InfixExpression SimpleName d x
tmp r SimpleName MethodInvocation InfixExpression NumberLiteral empty
tmp r SimpleName MethodInvocation NumberLiteral empty
tmp r SimpleName MethodInvocation InfixExpression SimpleName d x
tmp r SimpleName MethodInvocation InfixExpression NumberLiteral empty
tmp r SimpleName MethodInvocation InfixExpression SimpleName d x
tmp r SimpleName MethodInvocation InfixExpression NumberLiteral empty
d x SimpleName InfixExpression MethodInvocation NumberLiteral empty
empty NumberLiteral InfixExpression MethodInvocation NumberLiteral empty
d x SimpleName InfixExpression MethodInvocation InfixExpression SimpleName d x
d x SimpleName InfixExpression MethodInvocation InfixExpression NumberLiteral empty
empty NumberLiteral InfixExpression MethodInvocation InfixExpression SimpleName d x
empty NumberLiteral InfixExpression MethodInvocation InfixExpression NumberLiteral empty
d x SimpleName InfixExpression MethodInvocation InfixExpression SimpleName d x
d x SimpleName InfixExpression MethodInvocation InfixExpression NumberLiteral empty
empty NumberLiteral InfixExpression MethodInvocation InfixExpression SimpleName d x
empty NumberLiteral InfixExpression MethodInvocation InfixExpression NumberLiteral empty
empty NumberLiteral MethodInvocation InfixExpression SimpleName d x
empty NumberLiteral MethodInvocation InfixExpression NumberLiteral empty
empty NumberLiteral MethodInvocation InfixExpression SimpleName d x
empty NumberLiteral MethodInvocation InfixExpression NumberLiteral empty
d x SimpleName InfixExpression MethodInvocation InfixExpression SimpleName d x
d x SimpleName InfixExpression MethodInvocation InfixExpression NumberLiteral empty
empty NumberLiteral InfixExpression MethodInvocation InfixExpression SimpleName d x
empty NumberLiteral InfixExpression MethodInvocation InfixExpression NumberLiteral empty
tmp r SimpleName Assignment MethodInvocation SimpleName box filter h
tmp r SimpleName Assignment MethodInvocation SimpleName tmp r
tmp r SimpleName Assignment MethodInvocation SimpleName tmp r
tmp r SimpleName Assignment MethodInvocation InfixExpression SimpleName d x
tmp r SimpleName Assignment MethodInvocation InfixExpression NumberLiteral empty
tmp r SimpleName Assignment MethodInvocation NumberLiteral empty
tmp r SimpleName Assignment MethodInvocation InfixExpression SimpleName d x
tmp r SimpleName Assignment MethodInvocation InfixExpression NumberLiteral empty
tmp r SimpleName Assignment MethodInvocation InfixExpression SimpleName d x
tmp r SimpleName Assignment MethodInvocation InfixExpression NumberLiteral empty
d x SimpleName InfixExpression NumberLiteral empty
d x SimpleName InfixExpression NumberLiteral empty
d x SimpleName InfixExpression InfixExpression InfixExpression SimpleName d x
d x SimpleName InfixExpression InfixExpression InfixExpression NumberLiteral empty
empty NumberLiteral InfixExpression InfixExpression InfixExpression SimpleName d x
empty NumberLiteral InfixExpression InfixExpression InfixExpression NumberLiteral empty
skip x SimpleName Assignment InfixExpression InfixExpression SimpleName d x
skip x SimpleName Assignment InfixExpression InfixExpression NumberLiteral empty
skip x SimpleName Assignment InfixExpression InfixExpression SimpleName d x
skip x SimpleName Assignment InfixExpression InfixExpression NumberLiteral empty
d x SimpleName InfixExpression NumberLiteral empty
box filter h SimpleName MethodInvocation SimpleName tmp r
box filter h SimpleName MethodInvocation SimpleName tmp r
box filter h SimpleName MethodInvocation NumberLiteral empty
box filter h SimpleName MethodInvocation NumberLiteral empty
box filter h SimpleName MethodInvocation SimpleName d x
tmp r SimpleName MethodInvocation SimpleName tmp r
tmp r SimpleName MethodInvocation NumberLiteral empty
tmp r SimpleName MethodInvocation NumberLiteral empty
tmp r SimpleName MethodInvocation SimpleName d x
tmp r SimpleName MethodInvocation InfixExpression SimpleName d x
tmp r SimpleName MethodInvocation InfixExpression NumberLiteral empty
tmp r SimpleName MethodInvocation NumberLiteral empty
tmp r SimpleName MethodInvocation NumberLiteral empty
tmp r SimpleName MethodInvocation SimpleName d x
tmp r SimpleName MethodInvocation InfixExpression SimpleName d x
tmp r SimpleName MethodInvocation InfixExpression NumberLiteral empty
empty NumberLiteral MethodInvocation NumberLiteral empty
empty NumberLiteral MethodInvocation SimpleName d x
empty NumberLiteral MethodInvocation InfixExpression SimpleName d x
empty NumberLiteral MethodInvocation InfixExpression NumberLiteral empty
empty NumberLiteral MethodInvocation SimpleName d x
empty NumberLiteral MethodInvocation InfixExpression SimpleName d x
empty NumberLiteral MethodInvocation InfixExpression NumberLiteral empty
d x SimpleName MethodInvocation InfixExpression SimpleName d x
d x SimpleName MethodInvocation InfixExpression NumberLiteral empty
tmp r SimpleName Assignment MethodInvocation SimpleName box filter h
tmp r SimpleName Assignment MethodInvocation SimpleName tmp r
tmp r SimpleName Assignment MethodInvocation SimpleName tmp r
tmp r SimpleName Assignment MethodInvocation NumberLiteral empty
tmp r SimpleName Assignment MethodInvocation NumberLiteral empty
tmp r SimpleName Assignment MethodInvocation SimpleName d x
tmp r SimpleName Assignment MethodInvocation InfixExpression SimpleName d x
tmp r SimpleName Assignment MethodInvocation InfixExpression NumberLiteral empty
d x SimpleName InfixExpression NumberLiteral empty
d x SimpleName InfixExpression NumberLiteral empty
box filter h SimpleName MethodInvocation SimpleName tmp r
box filter h SimpleName MethodInvocation SimpleName tmp r
box filter h SimpleName MethodInvocation InfixExpression SimpleName d x
box filter h SimpleName MethodInvocation InfixExpression NumberLiteral empty
box filter h SimpleName MethodInvocation NumberLiteral empty
box filter h SimpleName MethodInvocation SimpleName d x
tmp r SimpleName MethodInvocation SimpleName tmp r
tmp r SimpleName MethodInvocation InfixExpression SimpleName d x
tmp r SimpleName MethodInvocation InfixExpression NumberLiteral empty
tmp r SimpleName MethodInvocation NumberLiteral empty
tmp r SimpleName MethodInvocation SimpleName d x
tmp r SimpleName MethodInvocation InfixExpression SimpleName d x
tmp r SimpleName MethodInvocation InfixExpression NumberLiteral empty
tmp r SimpleName MethodInvocation InfixExpression SimpleName d x
tmp r SimpleName MethodInvocation InfixExpression NumberLiteral empty
tmp r SimpleName MethodInvocation NumberLiteral empty
tmp r SimpleName MethodInvocation SimpleName d x
tmp r SimpleName MethodInvocation InfixExpression SimpleName d x
tmp r SimpleName MethodInvocation InfixExpression NumberLiteral empty
d x SimpleName InfixExpression MethodInvocation NumberLiteral empty
empty NumberLiteral InfixExpression MethodInvocation NumberLiteral empty
d x SimpleName InfixExpression MethodInvocation SimpleName d x
empty NumberLiteral InfixExpression MethodInvocation SimpleName d x
d x SimpleName InfixExpression MethodInvocation InfixExpression SimpleName d x
d x SimpleName InfixExpression MethodInvocation InfixExpression NumberLiteral empty
empty NumberLiteral InfixExpression MethodInvocation InfixExpression SimpleName d x
empty NumberLiteral InfixExpression MethodInvocation InfixExpression NumberLiteral empty
empty NumberLiteral MethodInvocation SimpleName d x
empty NumberLiteral MethodInvocation InfixExpression SimpleName d x
empty NumberLiteral MethodInvocation InfixExpression NumberLiteral empty
d x SimpleName MethodInvocation InfixExpression SimpleName d x
d x SimpleName MethodInvocation InfixExpression NumberLiteral empty
tmp r SimpleName Assignment MethodInvocation SimpleName box filter h
tmp r SimpleName Assignment MethodInvocation SimpleName tmp r
tmp r SimpleName Assignment MethodInvocation SimpleName tmp r
tmp r SimpleName Assignment MethodInvocation InfixExpression SimpleName d x
tmp r SimpleName Assignment MethodInvocation InfixExpression NumberLiteral empty
tmp r SimpleName Assignment MethodInvocation NumberLiteral empty
tmp r SimpleName Assignment MethodInvocation SimpleName d x
tmp r SimpleName Assignment MethodInvocation InfixExpression SimpleName d x
tmp r SimpleName Assignment MethodInvocation InfixExpression NumberLiteral empty
d x SimpleName InfixExpression NumberLiteral empty
d x SimpleName InfixExpression NumberLiteral empty
box filter h SimpleName MethodInvocation SimpleName tmp r
box filter h SimpleName MethodInvocation SimpleName tmp r
box filter h SimpleName MethodInvocation InfixExpression SimpleName d x
box filter h SimpleName MethodInvocation InfixExpression NumberLiteral empty
box filter h SimpleName MethodInvocation NumberLiteral empty
box filter h SimpleName MethodInvocation SimpleName d x
tmp r SimpleName MethodInvocation SimpleName tmp r
tmp r SimpleName MethodInvocation InfixExpression SimpleName d x
tmp r SimpleName MethodInvocation InfixExpression NumberLiteral empty
tmp r SimpleName MethodInvocation NumberLiteral empty
tmp r SimpleName MethodInvocation SimpleName d x
tmp r SimpleName MethodInvocation InfixExpression SimpleName d x
tmp r SimpleName MethodInvocation InfixExpression NumberLiteral empty
tmp r SimpleName MethodInvocation InfixExpression SimpleName d x
tmp r SimpleName MethodInvocation InfixExpression NumberLiteral empty
tmp r SimpleName MethodInvocation NumberLiteral empty
tmp r SimpleName MethodInvocation SimpleName d x
tmp r SimpleName MethodInvocation InfixExpression SimpleName d x
tmp r SimpleName MethodInvocation InfixExpression NumberLiteral empty
d x SimpleName InfixExpression MethodInvocation NumberLiteral empty
empty NumberLiteral InfixExpression MethodInvocation NumberLiteral empty
d x SimpleName InfixExpression MethodInvocation SimpleName d x
empty NumberLiteral InfixExpression MethodInvocation SimpleName d x
d x SimpleName InfixExpression MethodInvocation InfixExpression SimpleName d x
d x SimpleName InfixExpression MethodInvocation InfixExpression NumberLiteral empty
empty NumberLiteral InfixExpression MethodInvocation InfixExpression SimpleName d x
empty NumberLiteral InfixExpression MethodInvocation InfixExpression NumberLiteral empty
empty NumberLiteral MethodInvocation SimpleName d x
empty NumberLiteral MethodInvocation InfixExpression SimpleName d x
empty NumberLiteral MethodInvocation InfixExpression NumberLiteral empty
d x SimpleName MethodInvocation InfixExpression SimpleName d x
d x SimpleName MethodInvocation InfixExpression NumberLiteral empty
tmp r SimpleName Assignment MethodInvocation SimpleName box filter h
tmp r SimpleName Assignment MethodInvocation SimpleName tmp r
tmp r SimpleName Assignment MethodInvocation SimpleName tmp r
tmp r SimpleName Assignment MethodInvocation InfixExpression SimpleName d x
tmp r SimpleName Assignment MethodInvocation InfixExpression NumberLiteral empty
tmp r SimpleName Assignment MethodInvocation NumberLiteral empty
tmp r SimpleName Assignment MethodInvocation SimpleName d x
tmp r SimpleName Assignment MethodInvocation InfixExpression SimpleName d x
tmp r SimpleName Assignment MethodInvocation InfixExpression NumberLiteral empty
d x SimpleName InfixExpression NumberLiteral empty
d x SimpleName InfixExpression NumberLiteral empty
d x SimpleName InfixExpression InfixExpression InfixExpression SimpleName d x
d x SimpleName InfixExpression InfixExpression InfixExpression NumberLiteral empty
empty NumberLiteral InfixExpression InfixExpression InfixExpression SimpleName d x
empty NumberLiteral InfixExpression InfixExpression InfixExpression NumberLiteral empty
skip x SimpleName Assignment InfixExpression InfixExpression SimpleName d x
skip x SimpleName Assignment InfixExpression InfixExpression NumberLiteral empty
skip x SimpleName Assignment InfixExpression InfixExpression SimpleName d x
skip x SimpleName Assignment InfixExpression InfixExpression NumberLiteral empty
yinset SimpleName InfixExpression NumberLiteral empty
tmp r SimpleName Assignment SimpleName tmp r
conv op SimpleName ArrayAccess NumberLiteral empty
get color model SimpleName MethodInvocation MethodInvocation SimpleName create compatible writable raster
get color model SimpleName MethodInvocation MethodInvocation QualifiedName rwidth
get color model SimpleName MethodInvocation MethodInvocation QualifiedName rheight
create compatible writable raster SimpleName MethodInvocation QualifiedName rwidth
create compatible writable raster SimpleName MethodInvocation QualifiedName rheight
rwidth QualifiedName MethodInvocation QualifiedName rheight
tmp r SimpleName Assignment MethodInvocation MethodInvocation SimpleName get color model
tmp r SimpleName Assignment MethodInvocation SimpleName create compatible writable raster
tmp r SimpleName Assignment MethodInvocation QualifiedName rwidth
tmp r SimpleName Assignment MethodInvocation QualifiedName rheight
conv op SimpleName ArrayAccess NumberLiteral empty
conv op SimpleName ArrayAccess MethodInvocation SimpleName filter
empty NumberLiteral ArrayAccess MethodInvocation SimpleName filter
conv op SimpleName ArrayAccess MethodInvocation SimpleName tmp r
empty NumberLiteral ArrayAccess MethodInvocation SimpleName tmp r
conv op SimpleName ArrayAccess MethodInvocation SimpleName tmp r
empty NumberLiteral ArrayAccess MethodInvocation SimpleName tmp r
filter SimpleName MethodInvocation SimpleName tmp r
filter SimpleName MethodInvocation SimpleName tmp r
tmp r SimpleName MethodInvocation SimpleName tmp r
tmp r SimpleName Assignment MethodInvocation ArrayAccess SimpleName conv op
tmp r SimpleName Assignment MethodInvocation ArrayAccess NumberLiteral empty
tmp r SimpleName Assignment MethodInvocation SimpleName filter
tmp r SimpleName Assignment MethodInvocation SimpleName tmp r
tmp r SimpleName Assignment MethodInvocation SimpleName tmp r
d y SimpleName InfixExpression NumberLiteral x
d y SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
x NumberLiteral InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
d y SimpleName InfixExpression NumberLiteral empty
box filter v SimpleName MethodInvocation SimpleName tmp r
box filter v SimpleName MethodInvocation SimpleName tmp r
box filter v SimpleName MethodInvocation SimpleName skip x
box filter v SimpleName MethodInvocation NumberLiteral empty
box filter v SimpleName MethodInvocation SimpleName d y
tmp r SimpleName MethodInvocation SimpleName tmp r
tmp r SimpleName MethodInvocation SimpleName skip x
tmp r SimpleName MethodInvocation NumberLiteral empty
tmp r SimpleName MethodInvocation SimpleName d y
tmp r SimpleName MethodInvocation InfixExpression SimpleName d y
tmp r SimpleName MethodInvocation InfixExpression NumberLiteral empty
tmp r SimpleName MethodInvocation SimpleName skip x
tmp r SimpleName MethodInvocation NumberLiteral empty
tmp r SimpleName MethodInvocation SimpleName d y
tmp r SimpleName MethodInvocation InfixExpression SimpleName d y
tmp r SimpleName MethodInvocation InfixExpression NumberLiteral empty
skip x SimpleName MethodInvocation NumberLiteral empty
skip x SimpleName MethodInvocation SimpleName d y
skip x SimpleName MethodInvocation InfixExpression SimpleName d y
skip x SimpleName MethodInvocation InfixExpression NumberLiteral empty
empty NumberLiteral MethodInvocation SimpleName d y
empty NumberLiteral MethodInvocation InfixExpression SimpleName d y
empty NumberLiteral MethodInvocation InfixExpression NumberLiteral empty
d y SimpleName MethodInvocation InfixExpression SimpleName d y
d y SimpleName MethodInvocation InfixExpression NumberLiteral empty
tmp r SimpleName Assignment MethodInvocation SimpleName box filter v
tmp r SimpleName Assignment MethodInvocation SimpleName tmp r
tmp r SimpleName Assignment MethodInvocation SimpleName tmp r
tmp r SimpleName Assignment MethodInvocation SimpleName skip x
tmp r SimpleName Assignment MethodInvocation NumberLiteral empty
tmp r SimpleName Assignment MethodInvocation SimpleName d y
tmp r SimpleName Assignment MethodInvocation InfixExpression SimpleName d y
tmp r SimpleName Assignment MethodInvocation InfixExpression NumberLiteral empty
d y SimpleName InfixExpression NumberLiteral empty
d y SimpleName InfixExpression NumberLiteral empty
d y SimpleName InfixExpression InfixExpression NumberLiteral empty
empty NumberLiteral InfixExpression InfixExpression NumberLiteral empty
box filter v SimpleName MethodInvocation SimpleName tmp r
box filter v SimpleName MethodInvocation SimpleName tmp r
box filter v SimpleName MethodInvocation SimpleName skip x
box filter v SimpleName MethodInvocation InfixExpression SimpleName d y
box filter v SimpleName MethodInvocation InfixExpression NumberLiteral empty
box filter v SimpleName MethodInvocation SimpleName d y
tmp r SimpleName MethodInvocation SimpleName tmp r
tmp r SimpleName MethodInvocation SimpleName skip x
tmp r SimpleName MethodInvocation InfixExpression SimpleName d y
tmp r SimpleName MethodInvocation InfixExpression NumberLiteral empty
tmp r SimpleName MethodInvocation SimpleName d y
tmp r SimpleName MethodInvocation InfixExpression InfixExpression SimpleName d y
tmp r SimpleName MethodInvocation InfixExpression InfixExpression NumberLiteral empty
tmp r SimpleName MethodInvocation InfixExpression NumberLiteral empty
tmp r SimpleName MethodInvocation SimpleName skip x
tmp r SimpleName MethodInvocation InfixExpression SimpleName d y
tmp r SimpleName MethodInvocation InfixExpression NumberLiteral empty
tmp r SimpleName MethodInvocation SimpleName d y
tmp r SimpleName MethodInvocation InfixExpression InfixExpression SimpleName d y
tmp r SimpleName MethodInvocation InfixExpression InfixExpression NumberLiteral empty
tmp r SimpleName MethodInvocation InfixExpression NumberLiteral empty
skip x SimpleName MethodInvocation InfixExpression SimpleName d y
skip x SimpleName MethodInvocation InfixExpression NumberLiteral empty
skip x SimpleName MethodInvocation SimpleName d y
skip x SimpleName MethodInvocation InfixExpression InfixExpression SimpleName d y
skip x SimpleName MethodInvocation InfixExpression InfixExpression NumberLiteral empty
skip x SimpleName MethodInvocation InfixExpression NumberLiteral empty
d y SimpleName InfixExpression MethodInvocation SimpleName d y
empty NumberLiteral InfixExpression MethodInvocation SimpleName d y
d y SimpleName InfixExpression MethodInvocation InfixExpression NumberLiteral empty
empty NumberLiteral InfixExpression MethodInvocation InfixExpression NumberLiteral empty
d y SimpleName MethodInvocation InfixExpression InfixExpression SimpleName d y
d y SimpleName MethodInvocation InfixExpression InfixExpression NumberLiteral empty
d y SimpleName MethodInvocation InfixExpression NumberLiteral empty
tmp r SimpleName Assignment MethodInvocation SimpleName box filter v
tmp r SimpleName Assignment MethodInvocation SimpleName tmp r
tmp r SimpleName Assignment MethodInvocation SimpleName tmp r
tmp r SimpleName Assignment MethodInvocation SimpleName skip x
tmp r SimpleName Assignment MethodInvocation InfixExpression SimpleName d y
tmp r SimpleName Assignment MethodInvocation InfixExpression NumberLiteral empty
tmp r SimpleName Assignment MethodInvocation SimpleName d y
tmp r SimpleName Assignment MethodInvocation InfixExpression NumberLiteral empty
d y SimpleName InfixExpression NumberLiteral empty
d y SimpleName InfixExpression NumberLiteral empty
d y SimpleName InfixExpression NumberLiteral empty
box filter v SimpleName MethodInvocation SimpleName tmp r
box filter v SimpleName MethodInvocation SimpleName tmp r
box filter v SimpleName MethodInvocation SimpleName skip x
