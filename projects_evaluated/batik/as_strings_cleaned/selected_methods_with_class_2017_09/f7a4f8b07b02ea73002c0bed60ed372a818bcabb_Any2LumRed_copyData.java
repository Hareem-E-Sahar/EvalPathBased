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
src SimpleName MethodInvocation SimpleName get sample model
sm SimpleName VariableDeclarationFragment MethodInvocation SimpleName src
sm SimpleName VariableDeclarationFragment MethodInvocation SimpleName get sample model
sample model SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName sm
src SimpleName MethodInvocation SimpleName get color model
src cm SimpleName VariableDeclarationFragment MethodInvocation SimpleName src
src cm SimpleName VariableDeclarationFragment MethodInvocation SimpleName get color model
color model SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName src cm
wr SimpleName MethodInvocation SimpleName get bounds
src SimpleName MethodInvocation SimpleName get data
src SimpleName MethodInvocation MethodInvocation SimpleName wr
src SimpleName MethodInvocation MethodInvocation SimpleName get bounds
get data SimpleName MethodInvocation MethodInvocation SimpleName wr
get data SimpleName MethodInvocation MethodInvocation SimpleName get bounds
src ras SimpleName VariableDeclarationFragment MethodInvocation SimpleName src
src ras SimpleName VariableDeclarationFragment MethodInvocation SimpleName get data
src ras SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName wr
src ras SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get bounds
raster SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName src ras
float PrimitiveType ArrayType VariableDeclarationStatement VariableDeclarationFragment SimpleName matrix
sm SimpleName MethodInvocation SimpleName get num bands
sm SimpleName MethodInvocation InfixExpression NumberLiteral empty
get num bands SimpleName MethodInvocation InfixExpression NumberLiteral empty
float PrimitiveType ArrayType ArrayCreation NumberLiteral empty
float PrimitiveType ArrayType ArrayCreation NumberLiteral empty
empty NumberLiteral ArrayCreation NumberLiteral empty
matrix SimpleName Assignment ArrayCreation ArrayType PrimitiveType float
matrix SimpleName Assignment ArrayCreation NumberLiteral empty
matrix SimpleName Assignment ArrayCreation NumberLiteral empty
matrix SimpleName ArrayAccess NumberLiteral empty
matrix SimpleName ArrayAccess ArrayAccess NumberLiteral empty
empty NumberLiteral ArrayAccess ArrayAccess NumberLiteral empty
matrix SimpleName ArrayAccess ArrayAccess Assignment NumberLiteral empty
empty NumberLiteral ArrayAccess ArrayAccess Assignment NumberLiteral empty
empty NumberLiteral ArrayAccess Assignment NumberLiteral empty
matrix SimpleName ArrayAccess NumberLiteral empty
matrix SimpleName ArrayAccess ArrayAccess NumberLiteral empty
empty NumberLiteral ArrayAccess ArrayAccess NumberLiteral empty
matrix SimpleName ArrayAccess ArrayAccess Assignment NumberLiteral empty
empty NumberLiteral ArrayAccess ArrayAccess Assignment NumberLiteral empty
empty NumberLiteral ArrayAccess Assignment NumberLiteral empty
sm SimpleName MethodInvocation SimpleName get num bands
float PrimitiveType ArrayType ArrayCreation MethodInvocation SimpleName sm
float PrimitiveType ArrayType ArrayCreation MethodInvocation SimpleName get num bands
float PrimitiveType ArrayType ArrayCreation NumberLiteral empty
sm SimpleName MethodInvocation ArrayCreation NumberLiteral empty
get num bands SimpleName MethodInvocation ArrayCreation NumberLiteral empty
matrix SimpleName Assignment ArrayCreation ArrayType PrimitiveType float
matrix SimpleName Assignment ArrayCreation MethodInvocation SimpleName sm
matrix SimpleName Assignment ArrayCreation MethodInvocation SimpleName get num bands
matrix SimpleName Assignment ArrayCreation NumberLiteral empty
matrix SimpleName ArrayAccess NumberLiteral empty
matrix SimpleName ArrayAccess ArrayAccess NumberLiteral empty
empty NumberLiteral ArrayAccess ArrayAccess NumberLiteral empty
matrix SimpleName ArrayAccess ArrayAccess Assignment NumberLiteral empty
empty NumberLiteral ArrayAccess ArrayAccess Assignment NumberLiteral empty
empty NumberLiteral ArrayAccess Assignment NumberLiteral empty
band combine op SimpleName SimpleType ClassInstanceCreation SimpleName matrix
op SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName band combine op
op SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName matrix
band combine op SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName op
op SimpleName MethodInvocation SimpleName filter
op SimpleName MethodInvocation SimpleName src ras
op SimpleName MethodInvocation SimpleName wr
filter SimpleName MethodInvocation SimpleName src ras
filter SimpleName MethodInvocation SimpleName wr
src ras SimpleName MethodInvocation SimpleName wr
writable raster SimpleName SimpleType CastExpression SimpleName src ras
src wr SimpleName VariableDeclarationFragment CastExpression SimpleType SimpleName writable raster
src wr SimpleName VariableDeclarationFragment CastExpression SimpleName src ras
writable raster SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName src wr
src cm SimpleName MethodInvocation SimpleName has alpha
graphics util SimpleName MethodInvocation SimpleName coerce data
graphics util SimpleName MethodInvocation SimpleName src wr
graphics util SimpleName MethodInvocation SimpleName src cm
graphics util SimpleName MethodInvocation BooleanLiteral false
coerce data SimpleName MethodInvocation SimpleName src wr
coerce data SimpleName MethodInvocation SimpleName src cm
coerce data SimpleName MethodInvocation BooleanLiteral false
src wr SimpleName MethodInvocation SimpleName src cm
src wr SimpleName MethodInvocation BooleanLiteral false
src cm SimpleName MethodInvocation BooleanLiteral false
buffered image SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName src bi
buffered image SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName dst bi
src bi SimpleName VariableDeclarationFragment VariableDeclarationStatement VariableDeclarationFragment SimpleName dst bi
src wr SimpleName MethodInvocation SimpleName create writable translated child
src wr SimpleName MethodInvocation NumberLiteral empty
src wr SimpleName MethodInvocation NumberLiteral empty
create writable translated child SimpleName MethodInvocation NumberLiteral empty
create writable translated child SimpleName MethodInvocation NumberLiteral empty
empty NumberLiteral MethodInvocation NumberLiteral empty
buffered image SimpleName SimpleType ClassInstanceCreation SimpleName src cm
buffered image SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName src wr
buffered image SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName create writable translated child
buffered image SimpleName SimpleType ClassInstanceCreation MethodInvocation NumberLiteral empty
buffered image SimpleName SimpleType ClassInstanceCreation MethodInvocation NumberLiteral empty
buffered image SimpleName SimpleType ClassInstanceCreation BooleanLiteral false
src cm SimpleName ClassInstanceCreation MethodInvocation SimpleName src wr
src cm SimpleName ClassInstanceCreation MethodInvocation SimpleName create writable translated child
src cm SimpleName ClassInstanceCreation MethodInvocation NumberLiteral empty
src cm SimpleName ClassInstanceCreation MethodInvocation NumberLiteral empty
src cm SimpleName ClassInstanceCreation BooleanLiteral false
src wr SimpleName MethodInvocation ClassInstanceCreation BooleanLiteral false
create writable translated child SimpleName MethodInvocation ClassInstanceCreation BooleanLiteral false
empty NumberLiteral MethodInvocation ClassInstanceCreation BooleanLiteral false
empty NumberLiteral MethodInvocation ClassInstanceCreation BooleanLiteral false
src bi SimpleName Assignment ClassInstanceCreation SimpleType SimpleName buffered image
src bi SimpleName Assignment ClassInstanceCreation SimpleName src cm
src bi SimpleName Assignment ClassInstanceCreation MethodInvocation SimpleName src wr
src bi SimpleName Assignment ClassInstanceCreation MethodInvocation SimpleName create writable translated child
src bi SimpleName Assignment ClassInstanceCreation MethodInvocation NumberLiteral empty
src bi SimpleName Assignment ClassInstanceCreation MethodInvocation NumberLiteral empty
src bi SimpleName Assignment ClassInstanceCreation BooleanLiteral false
dst cm SimpleName VariableDeclarationFragment MethodInvocation SimpleName get color model
color model SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName dst cm
dst cm SimpleName MethodInvocation SimpleName has alpha
dst cm SimpleName MethodInvocation InfixExpression PrefixExpression SimpleName is color convert op aplha supported
has alpha SimpleName MethodInvocation InfixExpression PrefixExpression SimpleName is color convert op aplha supported
pixel interleaved sample model SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName dst sm
wr SimpleName MethodInvocation SimpleName get sample model
pixel interleaved sample model SimpleName SimpleType CastExpression MethodInvocation SimpleName wr
pixel interleaved sample model SimpleName SimpleType CastExpression MethodInvocation SimpleName get sample model
dst sm SimpleName Assignment CastExpression SimpleType SimpleName pixel interleaved sample model
dst sm SimpleName Assignment CastExpression MethodInvocation SimpleName wr
dst sm SimpleName Assignment CastExpression MethodInvocation SimpleName get sample model
dst sm SimpleName MethodInvocation SimpleName get data type
dst sm SimpleName MethodInvocation SimpleName get width
dst sm SimpleName MethodInvocation SimpleName get height
dst sm SimpleName MethodInvocation SimpleName get pixel stride
dst sm SimpleName MethodInvocation SimpleName get scanline stride
int PrimitiveType ArrayType ArrayCreation ArrayInitializer NumberLiteral empty
pixel interleaved sample model SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName dst sm
pixel interleaved sample model SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get data type
pixel interleaved sample model SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName dst sm
pixel interleaved sample model SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get width
pixel interleaved sample model SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName dst sm
pixel interleaved sample model SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get height
pixel interleaved sample model SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName dst sm
pixel interleaved sample model SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get pixel stride
pixel interleaved sample model SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName dst sm
pixel interleaved sample model SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get scanline stride
dst sm SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName dst sm
dst sm SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get width
get data type SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName dst sm
get data type SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get width
dst sm SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName dst sm
dst sm SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get height
get data type SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName dst sm
get data type SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get height
dst sm SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName dst sm
dst sm SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get pixel stride
get data type SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName dst sm
get data type SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get pixel stride
dst sm SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName dst sm
dst sm SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get scanline stride
get data type SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName dst sm
get data type SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get scanline stride
dst sm SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName dst sm
dst sm SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get height
get width SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName dst sm
get width SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get height
dst sm SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName dst sm
dst sm SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get pixel stride
get width SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName dst sm
get width SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get pixel stride
dst sm SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName dst sm
dst sm SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get scanline stride
get width SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName dst sm
get width SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get scanline stride
dst sm SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName dst sm
dst sm SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get pixel stride
get height SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName dst sm
get height SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get pixel stride
dst sm SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName dst sm
dst sm SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get scanline stride
get height SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName dst sm
get height SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get scanline stride
dst sm SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName dst sm
dst sm SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get scanline stride
get pixel stride SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName dst sm
get pixel stride SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get scanline stride
smna SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName pixel interleaved sample model
smna SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName dst sm
smna SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName get data type
smna SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName dst sm
smna SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName get width
smna SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName dst sm
smna SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName get height
smna SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName dst sm
smna SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName get pixel stride
smna SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName dst sm
smna SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName get scanline stride
sample model SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName smna
writable raster SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName dst wr
wr SimpleName MethodInvocation SimpleName get data buffer
point SimpleName SimpleType ClassInstanceCreation NumberLiteral empty
point SimpleName SimpleType ClassInstanceCreation NumberLiteral empty
empty NumberLiteral ClassInstanceCreation NumberLiteral empty
raster SimpleName MethodInvocation SimpleName create writable raster
raster SimpleName MethodInvocation SimpleName smna
raster SimpleName MethodInvocation MethodInvocation SimpleName wr
raster SimpleName MethodInvocation MethodInvocation SimpleName get data buffer
raster SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName point
raster SimpleName MethodInvocation ClassInstanceCreation NumberLiteral empty
raster SimpleName MethodInvocation ClassInstanceCreation NumberLiteral empty
create writable raster SimpleName MethodInvocation SimpleName smna
create writable raster SimpleName MethodInvocation MethodInvocation SimpleName wr
create writable raster SimpleName MethodInvocation MethodInvocation SimpleName get data buffer
create writable raster SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName point
create writable raster SimpleName MethodInvocation ClassInstanceCreation NumberLiteral empty
create writable raster SimpleName MethodInvocation ClassInstanceCreation NumberLiteral empty
smna SimpleName MethodInvocation MethodInvocation SimpleName wr
smna SimpleName MethodInvocation MethodInvocation SimpleName get data buffer
smna SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName point
smna SimpleName MethodInvocation ClassInstanceCreation NumberLiteral empty
smna SimpleName MethodInvocation ClassInstanceCreation NumberLiteral empty
wr SimpleName MethodInvocation MethodInvocation ClassInstanceCreation NumberLiteral empty
wr SimpleName MethodInvocation MethodInvocation ClassInstanceCreation NumberLiteral empty
get data buffer SimpleName MethodInvocation MethodInvocation ClassInstanceCreation NumberLiteral empty
get data buffer SimpleName MethodInvocation MethodInvocation ClassInstanceCreation NumberLiteral empty
dst wr SimpleName Assignment MethodInvocation SimpleName raster
dst wr SimpleName Assignment MethodInvocation SimpleName create writable raster
dst wr SimpleName Assignment MethodInvocation SimpleName smna
dst wr SimpleName Assignment MethodInvocation MethodInvocation SimpleName wr
dst wr SimpleName Assignment MethodInvocation MethodInvocation SimpleName get data buffer
dst wr SimpleName Assignment MethodInvocation ClassInstanceCreation NumberLiteral empty
dst wr SimpleName Assignment MethodInvocation ClassInstanceCreation NumberLiteral empty
wr SimpleName MethodInvocation SimpleName get min x
wr SimpleName MethodInvocation SimpleName get sample model translate x
wr SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName wr
wr SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get sample model translate x
get min x SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName wr
get min x SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get sample model translate x
wr SimpleName MethodInvocation SimpleName get min y
wr SimpleName MethodInvocation SimpleName get sample model translate y
wr SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName wr
wr SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get sample model translate y
get min y SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName wr
get min y SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get sample model translate y
wr SimpleName MethodInvocation SimpleName get width
wr SimpleName MethodInvocation SimpleName get height
dst wr SimpleName MethodInvocation SimpleName create writable child
dst wr SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName wr
dst wr SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get min x
dst wr SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName wr
dst wr SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get sample model translate x
dst wr SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName wr
dst wr SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get min y
dst wr SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName wr
dst wr SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get sample model translate y
dst wr SimpleName MethodInvocation MethodInvocation SimpleName wr
dst wr SimpleName MethodInvocation MethodInvocation SimpleName get width
dst wr SimpleName MethodInvocation MethodInvocation SimpleName wr
dst wr SimpleName MethodInvocation MethodInvocation SimpleName get height
create writable child SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName wr
create writable child SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get min x
create writable child SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName wr
create writable child SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get sample model translate x
create writable child SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName wr
create writable child SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get min y
create writable child SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName wr
create writable child SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get sample model translate y
create writable child SimpleName MethodInvocation MethodInvocation SimpleName wr
create writable child SimpleName MethodInvocation MethodInvocation SimpleName get width
create writable child SimpleName MethodInvocation MethodInvocation SimpleName wr
create writable child SimpleName MethodInvocation MethodInvocation SimpleName get height
create writable child SimpleName MethodInvocation NumberLiteral empty
wr SimpleName MethodInvocation InfixExpression MethodInvocation NumberLiteral empty
get min x SimpleName MethodInvocation InfixExpression MethodInvocation NumberLiteral empty
wr SimpleName MethodInvocation InfixExpression MethodInvocation NumberLiteral empty
get sample model translate x SimpleName MethodInvocation InfixExpression MethodInvocation NumberLiteral empty
wr SimpleName MethodInvocation InfixExpression MethodInvocation NumberLiteral empty
get min x SimpleName MethodInvocation InfixExpression MethodInvocation NumberLiteral empty
wr SimpleName MethodInvocation InfixExpression MethodInvocation NumberLiteral empty
get sample model translate x SimpleName MethodInvocation InfixExpression MethodInvocation NumberLiteral empty
wr SimpleName MethodInvocation InfixExpression MethodInvocation NumberLiteral empty
get min y SimpleName MethodInvocation InfixExpression MethodInvocation NumberLiteral empty
wr SimpleName MethodInvocation InfixExpression MethodInvocation NumberLiteral empty
get sample model translate y SimpleName MethodInvocation InfixExpression MethodInvocation NumberLiteral empty
wr SimpleName MethodInvocation InfixExpression MethodInvocation NumberLiteral empty
get min y SimpleName MethodInvocation InfixExpression MethodInvocation NumberLiteral empty
wr SimpleName MethodInvocation InfixExpression MethodInvocation NumberLiteral empty
get sample model translate y SimpleName MethodInvocation InfixExpression MethodInvocation NumberLiteral empty
wr SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName wr
wr SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get height
get width SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName wr
get width SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get height
wr SimpleName MethodInvocation MethodInvocation NumberLiteral empty
get width SimpleName MethodInvocation MethodInvocation NumberLiteral empty
wr SimpleName MethodInvocation MethodInvocation NumberLiteral empty
get width SimpleName MethodInvocation MethodInvocation NumberLiteral empty
wr SimpleName MethodInvocation MethodInvocation NumberLiteral empty
get height SimpleName MethodInvocation MethodInvocation NumberLiteral empty
wr SimpleName MethodInvocation MethodInvocation NumberLiteral empty
get height SimpleName MethodInvocation MethodInvocation NumberLiteral empty
empty NumberLiteral MethodInvocation NumberLiteral empty
dst wr SimpleName Assignment MethodInvocation SimpleName dst wr
dst wr SimpleName Assignment MethodInvocation SimpleName create writable child
dst wr SimpleName Assignment MethodInvocation MethodInvocation SimpleName wr
dst wr SimpleName Assignment MethodInvocation MethodInvocation SimpleName get width
dst wr SimpleName Assignment MethodInvocation MethodInvocation SimpleName wr
dst wr SimpleName Assignment MethodInvocation MethodInvocation SimpleName get height
dst wr SimpleName Assignment MethodInvocation NumberLiteral empty
dst wr SimpleName Assignment MethodInvocation NumberLiteral empty
color space SimpleName MethodInvocation SimpleName get instance
color space SimpleName MethodInvocation QualifiedName color spacecs gray
get instance SimpleName MethodInvocation QualifiedName color spacecs gray
int PrimitiveType ArrayType ArrayCreation ArrayInitializer NumberLiteral empty
component color model SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName color space
component color model SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get instance
component color model SimpleName SimpleType ClassInstanceCreation MethodInvocation QualifiedName color spacecs gray
component color model SimpleName SimpleType ClassInstanceCreation BooleanLiteral false
component color model SimpleName SimpleType ClassInstanceCreation BooleanLiteral false
component color model SimpleName SimpleType ClassInstanceCreation QualifiedName transparencyopaque
color space SimpleName MethodInvocation ClassInstanceCreation BooleanLiteral false
get instance SimpleName MethodInvocation ClassInstanceCreation BooleanLiteral false
color spacecs gray QualifiedName MethodInvocation ClassInstanceCreation BooleanLiteral false
color space SimpleName MethodInvocation ClassInstanceCreation BooleanLiteral false
get instance SimpleName MethodInvocation ClassInstanceCreation BooleanLiteral false
color spacecs gray QualifiedName MethodInvocation ClassInstanceCreation BooleanLiteral false
color space SimpleName MethodInvocation ClassInstanceCreation QualifiedName transparencyopaque
get instance SimpleName MethodInvocation ClassInstanceCreation QualifiedName transparencyopaque
color spacecs gray QualifiedName MethodInvocation ClassInstanceCreation QualifiedName transparencyopaque
color space SimpleName MethodInvocation ClassInstanceCreation QualifiedName data buffertype byte
get instance SimpleName MethodInvocation ClassInstanceCreation QualifiedName data buffertype byte
color spacecs gray QualifiedName MethodInvocation ClassInstanceCreation QualifiedName data buffertype byte
int PrimitiveType ArrayType ArrayCreation ClassInstanceCreation BooleanLiteral false
empty NumberLiteral ArrayInitializer ArrayCreation ClassInstanceCreation BooleanLiteral false
int PrimitiveType ArrayType ArrayCreation ClassInstanceCreation BooleanLiteral false
empty NumberLiteral ArrayInitializer ArrayCreation ClassInstanceCreation BooleanLiteral false
int PrimitiveType ArrayType ArrayCreation ClassInstanceCreation QualifiedName transparencyopaque
empty NumberLiteral ArrayInitializer ArrayCreation ClassInstanceCreation QualifiedName transparencyopaque
int PrimitiveType ArrayType ArrayCreation ClassInstanceCreation QualifiedName data buffertype byte
empty NumberLiteral ArrayInitializer ArrayCreation ClassInstanceCreation QualifiedName data buffertype byte
false BooleanLiteral ClassInstanceCreation BooleanLiteral false
false BooleanLiteral ClassInstanceCreation QualifiedName transparencyopaque
false BooleanLiteral ClassInstanceCreation QualifiedName data buffertype byte
false BooleanLiteral ClassInstanceCreation QualifiedName transparencyopaque
false BooleanLiteral ClassInstanceCreation QualifiedName data buffertype byte
transparencyopaque QualifiedName ClassInstanceCreation QualifiedName data buffertype byte
cmna SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName component color model
cmna SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName color space
cmna SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName get instance
cmna SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation QualifiedName color spacecs gray
cmna SimpleName VariableDeclarationFragment ClassInstanceCreation BooleanLiteral false
cmna SimpleName VariableDeclarationFragment ClassInstanceCreation BooleanLiteral false
cmna SimpleName VariableDeclarationFragment ClassInstanceCreation QualifiedName transparencyopaque
cmna SimpleName VariableDeclarationFragment ClassInstanceCreation QualifiedName data buffertype byte
color model SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName cmna
buffered image SimpleName SimpleType ClassInstanceCreation SimpleName cmna
buffered image SimpleName SimpleType ClassInstanceCreation SimpleName dst wr
buffered image SimpleName SimpleType ClassInstanceCreation BooleanLiteral false
cmna SimpleName ClassInstanceCreation SimpleName dst wr
cmna SimpleName ClassInstanceCreation BooleanLiteral false
dst wr SimpleName ClassInstanceCreation BooleanLiteral false
dst bi SimpleName Assignment ClassInstanceCreation SimpleType SimpleName buffered image
dst bi SimpleName Assignment ClassInstanceCreation SimpleName cmna
dst bi SimpleName Assignment ClassInstanceCreation SimpleName dst wr
dst bi SimpleName Assignment ClassInstanceCreation BooleanLiteral false
wr SimpleName MethodInvocation SimpleName create writable translated child
wr SimpleName MethodInvocation NumberLiteral empty
wr SimpleName MethodInvocation NumberLiteral empty
create writable translated child SimpleName MethodInvocation NumberLiteral empty
create writable translated child SimpleName MethodInvocation NumberLiteral empty
empty NumberLiteral MethodInvocation NumberLiteral empty
dst cm SimpleName MethodInvocation SimpleName is alpha premultiplied
buffered image SimpleName SimpleType ClassInstanceCreation SimpleName dst cm
buffered image SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName wr
buffered image SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName create writable translated child
buffered image SimpleName SimpleType ClassInstanceCreation MethodInvocation NumberLiteral empty
buffered image SimpleName SimpleType ClassInstanceCreation MethodInvocation NumberLiteral empty
buffered image SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName dst cm
buffered image SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName is alpha premultiplied
dst cm SimpleName ClassInstanceCreation MethodInvocation SimpleName wr
dst cm SimpleName ClassInstanceCreation MethodInvocation SimpleName create writable translated child
dst cm SimpleName ClassInstanceCreation MethodInvocation NumberLiteral empty
dst cm SimpleName ClassInstanceCreation MethodInvocation NumberLiteral empty
dst cm SimpleName ClassInstanceCreation MethodInvocation SimpleName dst cm
dst cm SimpleName ClassInstanceCreation MethodInvocation SimpleName is alpha premultiplied
wr SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName dst cm
wr SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName is alpha premultiplied
create writable translated child SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName dst cm
create writable translated child SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName is alpha premultiplied
empty NumberLiteral MethodInvocation ClassInstanceCreation MethodInvocation SimpleName dst cm
empty NumberLiteral MethodInvocation ClassInstanceCreation MethodInvocation SimpleName is alpha premultiplied
empty NumberLiteral MethodInvocation ClassInstanceCreation MethodInvocation SimpleName dst cm
empty NumberLiteral MethodInvocation ClassInstanceCreation MethodInvocation SimpleName is alpha premultiplied
dst bi SimpleName Assignment ClassInstanceCreation SimpleType SimpleName buffered image
dst bi SimpleName Assignment ClassInstanceCreation SimpleName dst cm
dst bi SimpleName Assignment ClassInstanceCreation MethodInvocation SimpleName wr
dst bi SimpleName Assignment ClassInstanceCreation MethodInvocation SimpleName create writable translated child
dst bi SimpleName Assignment ClassInstanceCreation MethodInvocation NumberLiteral empty
dst bi SimpleName Assignment ClassInstanceCreation MethodInvocation NumberLiteral empty
dst bi SimpleName Assignment ClassInstanceCreation MethodInvocation SimpleName dst cm
dst bi SimpleName Assignment ClassInstanceCreation MethodInvocation SimpleName is alpha premultiplied
op SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName color convert op
color convert op SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName op
op SimpleName MethodInvocation SimpleName filter
op SimpleName MethodInvocation SimpleName src bi
op SimpleName MethodInvocation SimpleName dst bi
filter SimpleName MethodInvocation SimpleName src bi
filter SimpleName MethodInvocation SimpleName dst bi
src bi SimpleName MethodInvocation SimpleName dst bi
dst cm SimpleName MethodInvocation SimpleName has alpha
sm SimpleName MethodInvocation SimpleName get num bands
sm SimpleName MethodInvocation InfixExpression NumberLiteral empty
get num bands SimpleName MethodInvocation InfixExpression NumberLiteral empty
get sample model SimpleName MethodInvocation MethodInvocation SimpleName get num bands
get sample model SimpleName MethodInvocation MethodInvocation InfixExpression NumberLiteral empty
get num bands SimpleName MethodInvocation InfixExpression NumberLiteral empty
copy band SimpleName MethodInvocation SimpleName src wr
copy band SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName sm
copy band SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get num bands
copy band SimpleName MethodInvocation InfixExpression NumberLiteral empty
copy band SimpleName MethodInvocation SimpleName wr
copy band SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get num bands
copy band SimpleName MethodInvocation InfixExpression NumberLiteral empty
src wr SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName sm
src wr SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get num bands
src wr SimpleName MethodInvocation InfixExpression NumberLiteral empty
src wr SimpleName MethodInvocation SimpleName wr
src wr SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get num bands
src wr SimpleName MethodInvocation InfixExpression NumberLiteral empty
sm SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName wr
get num bands SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName wr
empty NumberLiteral InfixExpression MethodInvocation SimpleName wr
empty NumberLiteral InfixExpression MethodInvocation InfixExpression NumberLiteral empty
wr SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get num bands
wr SimpleName MethodInvocation InfixExpression NumberLiteral empty
dst cm SimpleName MethodInvocation SimpleName is alpha premultiplied
graphics util SimpleName MethodInvocation SimpleName multiply alpha
graphics util SimpleName MethodInvocation SimpleName wr
multiply alpha SimpleName MethodInvocation SimpleName wr
public Modifier MethodDeclaration SimpleType SimpleName writable raster
public Modifier MethodDeclaration SimpleName copy data
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName writable raster
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName wr
public Modifier MethodDeclaration Block ReturnStatement SimpleName wr
writable raster SimpleName SimpleType MethodDeclaration SimpleName copy data
writable raster SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName wr
copy data SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName writable raster
copy data SimpleName MethodDeclaration SingleVariableDeclaration SimpleName wr
copy data SimpleName MethodDeclaration Block ReturnStatement SimpleName wr
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName writable raster
public Modifier TypeDeclaration MethodDeclaration SimpleName copy data
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName wr
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName writable raster
test SimpleName TypeDeclaration MethodDeclaration SimpleName copy data
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName wr
