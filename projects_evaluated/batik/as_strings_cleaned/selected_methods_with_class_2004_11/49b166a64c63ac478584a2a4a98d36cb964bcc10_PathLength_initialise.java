path length SimpleName Assignment NumberLiteral f
path SimpleName MethodInvocation SimpleName get path iterator
path SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName affine transform
get path iterator SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName affine transform
flattening path iterator SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName path
flattening path iterator SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get path iterator
flattening path iterator SimpleName SimpleType ClassInstanceCreation NumberLiteral . f
path SimpleName MethodInvocation ClassInstanceCreation NumberLiteral . f
get path iterator SimpleName MethodInvocation ClassInstanceCreation NumberLiteral . f
fpi SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName flattening path iterator
fpi SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName path
fpi SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName get path iterator
fpi SimpleName VariableDeclarationFragment ClassInstanceCreation NumberLiteral . f
flattening path iterator SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName fpi
vector SimpleName SimpleType ClassInstanceCreation NumberLiteral empty
segments SimpleName Assignment ClassInstanceCreation SimpleType SimpleName vector
segments SimpleName Assignment ClassInstanceCreation NumberLiteral empty
last move x SimpleName VariableDeclarationFragment NumberLiteral f
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName last move x
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment NumberLiteral f
last move y SimpleName VariableDeclarationFragment NumberLiteral f
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName last move y
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment NumberLiteral f
current x SimpleName VariableDeclarationFragment NumberLiteral f
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName current x
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment NumberLiteral f
current y SimpleName VariableDeclarationFragment NumberLiteral f
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName current y
float PrimitiveType VariableDeclarationStatement VariableDeclarationFragment NumberLiteral f
float PrimitiveType ArrayType ArrayCreation NumberLiteral empty
seg SimpleName VariableDeclarationFragment ArrayCreation ArrayType PrimitiveType float
seg SimpleName VariableDeclarationFragment ArrayCreation NumberLiteral empty
float PrimitiveType ArrayType VariableDeclarationStatement VariableDeclarationFragment SimpleName seg
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName seg type
path segment SimpleName SimpleType ClassInstanceCreation QualifiedName path iteratorseg moveto
path segment SimpleName SimpleType ClassInstanceCreation NumberLiteral f
path segment SimpleName SimpleType ClassInstanceCreation NumberLiteral f
path segment SimpleName SimpleType ClassInstanceCreation NumberLiteral f
path iteratorseg moveto QualifiedName ClassInstanceCreation NumberLiteral f
path iteratorseg moveto QualifiedName ClassInstanceCreation NumberLiteral f
path iteratorseg moveto QualifiedName ClassInstanceCreation NumberLiteral f
f NumberLiteral ClassInstanceCreation NumberLiteral f
f NumberLiteral ClassInstanceCreation NumberLiteral f
f NumberLiteral ClassInstanceCreation NumberLiteral f
segments SimpleName MethodInvocation SimpleName add
segments SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName path segment
segments SimpleName MethodInvocation ClassInstanceCreation QualifiedName path iteratorseg moveto
segments SimpleName MethodInvocation ClassInstanceCreation NumberLiteral f
segments SimpleName MethodInvocation ClassInstanceCreation NumberLiteral f
segments SimpleName MethodInvocation ClassInstanceCreation NumberLiteral f
add SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName path segment
add SimpleName MethodInvocation ClassInstanceCreation QualifiedName path iteratorseg moveto
add SimpleName MethodInvocation ClassInstanceCreation NumberLiteral f
add SimpleName MethodInvocation ClassInstanceCreation NumberLiteral f
add SimpleName MethodInvocation ClassInstanceCreation NumberLiteral f
fpi SimpleName MethodInvocation SimpleName is done
fpi SimpleName MethodInvocation SimpleName current segment
fpi SimpleName MethodInvocation SimpleName seg
current segment SimpleName MethodInvocation SimpleName seg
seg type SimpleName Assignment MethodInvocation SimpleName fpi
seg type SimpleName Assignment MethodInvocation SimpleName current segment
seg type SimpleName Assignment MethodInvocation SimpleName seg
seg SimpleName ArrayAccess NumberLiteral empty
seg SimpleName ArrayAccess NumberLiteral empty
path segment SimpleName SimpleType ClassInstanceCreation SimpleName seg type
path segment SimpleName SimpleType ClassInstanceCreation ArrayAccess SimpleName seg
path segment SimpleName SimpleType ClassInstanceCreation ArrayAccess NumberLiteral empty
path segment SimpleName SimpleType ClassInstanceCreation ArrayAccess SimpleName seg
path segment SimpleName SimpleType ClassInstanceCreation ArrayAccess NumberLiteral empty
path segment SimpleName SimpleType ClassInstanceCreation SimpleName path length
seg type SimpleName ClassInstanceCreation ArrayAccess SimpleName seg
seg type SimpleName ClassInstanceCreation ArrayAccess NumberLiteral empty
seg type SimpleName ClassInstanceCreation ArrayAccess SimpleName seg
seg type SimpleName ClassInstanceCreation ArrayAccess NumberLiteral empty
seg type SimpleName ClassInstanceCreation SimpleName path length
seg SimpleName ArrayAccess ClassInstanceCreation ArrayAccess SimpleName seg
seg SimpleName ArrayAccess ClassInstanceCreation ArrayAccess NumberLiteral empty
empty NumberLiteral ArrayAccess ClassInstanceCreation ArrayAccess SimpleName seg
empty NumberLiteral ArrayAccess ClassInstanceCreation ArrayAccess NumberLiteral empty
seg SimpleName ArrayAccess ClassInstanceCreation SimpleName path length
empty NumberLiteral ArrayAccess ClassInstanceCreation SimpleName path length
seg SimpleName ArrayAccess ClassInstanceCreation SimpleName path length
empty NumberLiteral ArrayAccess ClassInstanceCreation SimpleName path length
segments SimpleName MethodInvocation SimpleName add
segments SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName path segment
segments SimpleName MethodInvocation ClassInstanceCreation SimpleName seg type
segments SimpleName MethodInvocation ClassInstanceCreation ArrayAccess SimpleName seg
segments SimpleName MethodInvocation ClassInstanceCreation ArrayAccess NumberLiteral empty
segments SimpleName MethodInvocation ClassInstanceCreation ArrayAccess SimpleName seg
segments SimpleName MethodInvocation ClassInstanceCreation ArrayAccess NumberLiteral empty
segments SimpleName MethodInvocation ClassInstanceCreation SimpleName path length
add SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName path segment
add SimpleName MethodInvocation ClassInstanceCreation SimpleName seg type
add SimpleName MethodInvocation ClassInstanceCreation ArrayAccess SimpleName seg
add SimpleName MethodInvocation ClassInstanceCreation ArrayAccess NumberLiteral empty
add SimpleName MethodInvocation ClassInstanceCreation ArrayAccess SimpleName seg
add SimpleName MethodInvocation ClassInstanceCreation ArrayAccess NumberLiteral empty
add SimpleName MethodInvocation ClassInstanceCreation SimpleName path length
seg SimpleName ArrayAccess NumberLiteral empty
current x SimpleName Assignment ArrayAccess SimpleName seg
current x SimpleName Assignment ArrayAccess NumberLiteral empty
seg SimpleName ArrayAccess NumberLiteral empty
current y SimpleName Assignment ArrayAccess SimpleName seg
current y SimpleName Assignment ArrayAccess NumberLiteral empty
last move x SimpleName Assignment SimpleName current x
last move y SimpleName Assignment SimpleName current y
seg SimpleName ArrayAccess NumberLiteral empty
seg SimpleName ArrayAccess NumberLiteral empty
point d SimpleName MethodInvocation SimpleName distance
point d SimpleName MethodInvocation SimpleName current x
point d SimpleName MethodInvocation SimpleName current y
point d SimpleName MethodInvocation ArrayAccess SimpleName seg
point d SimpleName MethodInvocation ArrayAccess NumberLiteral empty
point d SimpleName MethodInvocation ArrayAccess SimpleName seg
point d SimpleName MethodInvocation ArrayAccess NumberLiteral empty
distance SimpleName MethodInvocation SimpleName current x
distance SimpleName MethodInvocation SimpleName current y
distance SimpleName MethodInvocation ArrayAccess SimpleName seg
distance SimpleName MethodInvocation ArrayAccess NumberLiteral empty
distance SimpleName MethodInvocation ArrayAccess SimpleName seg
distance SimpleName MethodInvocation ArrayAccess NumberLiteral empty
current x SimpleName MethodInvocation SimpleName current y
current x SimpleName MethodInvocation ArrayAccess SimpleName seg
current x SimpleName MethodInvocation ArrayAccess NumberLiteral empty
current x SimpleName MethodInvocation ArrayAccess SimpleName seg
current x SimpleName MethodInvocation ArrayAccess NumberLiteral empty
current y SimpleName MethodInvocation ArrayAccess SimpleName seg
current y SimpleName MethodInvocation ArrayAccess NumberLiteral empty
current y SimpleName MethodInvocation ArrayAccess SimpleName seg
current y SimpleName MethodInvocation ArrayAccess NumberLiteral empty
seg SimpleName ArrayAccess MethodInvocation ArrayAccess SimpleName seg
seg SimpleName ArrayAccess MethodInvocation ArrayAccess NumberLiteral empty
empty NumberLiteral ArrayAccess MethodInvocation ArrayAccess SimpleName seg
empty NumberLiteral ArrayAccess MethodInvocation ArrayAccess NumberLiteral empty
path length SimpleName Assignment MethodInvocation SimpleName point d
path length SimpleName Assignment MethodInvocation SimpleName distance
path length SimpleName Assignment MethodInvocation SimpleName current x
path length SimpleName Assignment MethodInvocation SimpleName current y
path length SimpleName Assignment MethodInvocation ArrayAccess SimpleName seg
path length SimpleName Assignment MethodInvocation ArrayAccess NumberLiteral empty
path length SimpleName Assignment MethodInvocation ArrayAccess SimpleName seg
path length SimpleName Assignment MethodInvocation ArrayAccess NumberLiteral empty
seg SimpleName ArrayAccess NumberLiteral empty
seg SimpleName ArrayAccess NumberLiteral empty
path segment SimpleName SimpleType ClassInstanceCreation SimpleName seg type
path segment SimpleName SimpleType ClassInstanceCreation ArrayAccess SimpleName seg
path segment SimpleName SimpleType ClassInstanceCreation ArrayAccess NumberLiteral empty
path segment SimpleName SimpleType ClassInstanceCreation ArrayAccess SimpleName seg
path segment SimpleName SimpleType ClassInstanceCreation ArrayAccess NumberLiteral empty
path segment SimpleName SimpleType ClassInstanceCreation SimpleName path length
seg type SimpleName ClassInstanceCreation ArrayAccess SimpleName seg
seg type SimpleName ClassInstanceCreation ArrayAccess NumberLiteral empty
seg type SimpleName ClassInstanceCreation ArrayAccess SimpleName seg
seg type SimpleName ClassInstanceCreation ArrayAccess NumberLiteral empty
seg type SimpleName ClassInstanceCreation SimpleName path length
seg SimpleName ArrayAccess ClassInstanceCreation ArrayAccess SimpleName seg
seg SimpleName ArrayAccess ClassInstanceCreation ArrayAccess NumberLiteral empty
empty NumberLiteral ArrayAccess ClassInstanceCreation ArrayAccess SimpleName seg
empty NumberLiteral ArrayAccess ClassInstanceCreation ArrayAccess NumberLiteral empty
seg SimpleName ArrayAccess ClassInstanceCreation SimpleName path length
empty NumberLiteral ArrayAccess ClassInstanceCreation SimpleName path length
seg SimpleName ArrayAccess ClassInstanceCreation SimpleName path length
empty NumberLiteral ArrayAccess ClassInstanceCreation SimpleName path length
segments SimpleName MethodInvocation SimpleName add
segments SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName path segment
segments SimpleName MethodInvocation ClassInstanceCreation SimpleName seg type
segments SimpleName MethodInvocation ClassInstanceCreation ArrayAccess SimpleName seg
segments SimpleName MethodInvocation ClassInstanceCreation ArrayAccess NumberLiteral empty
segments SimpleName MethodInvocation ClassInstanceCreation ArrayAccess SimpleName seg
segments SimpleName MethodInvocation ClassInstanceCreation ArrayAccess NumberLiteral empty
segments SimpleName MethodInvocation ClassInstanceCreation SimpleName path length
add SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName path segment
add SimpleName MethodInvocation ClassInstanceCreation SimpleName seg type
add SimpleName MethodInvocation ClassInstanceCreation ArrayAccess SimpleName seg
add SimpleName MethodInvocation ClassInstanceCreation ArrayAccess NumberLiteral empty
add SimpleName MethodInvocation ClassInstanceCreation ArrayAccess SimpleName seg
add SimpleName MethodInvocation ClassInstanceCreation ArrayAccess NumberLiteral empty
add SimpleName MethodInvocation ClassInstanceCreation SimpleName path length
seg SimpleName ArrayAccess NumberLiteral empty
current x SimpleName Assignment ArrayAccess SimpleName seg
current x SimpleName Assignment ArrayAccess NumberLiteral empty
seg SimpleName ArrayAccess NumberLiteral empty
current y SimpleName Assignment ArrayAccess SimpleName seg
current y SimpleName Assignment ArrayAccess NumberLiteral empty
point d SimpleName MethodInvocation SimpleName distance
point d SimpleName MethodInvocation SimpleName current x
point d SimpleName MethodInvocation SimpleName current y
point d SimpleName MethodInvocation SimpleName last move x
point d SimpleName MethodInvocation SimpleName last move y
distance SimpleName MethodInvocation SimpleName current x
distance SimpleName MethodInvocation SimpleName current y
distance SimpleName MethodInvocation SimpleName last move x
distance SimpleName MethodInvocation SimpleName last move y
current x SimpleName MethodInvocation SimpleName current y
current x SimpleName MethodInvocation SimpleName last move x
current x SimpleName MethodInvocation SimpleName last move y
current y SimpleName MethodInvocation SimpleName last move x
current y SimpleName MethodInvocation SimpleName last move y
last move x SimpleName MethodInvocation SimpleName last move y
path length SimpleName Assignment MethodInvocation SimpleName point d
path length SimpleName Assignment MethodInvocation SimpleName distance
path length SimpleName Assignment MethodInvocation SimpleName current x
path length SimpleName Assignment MethodInvocation SimpleName current y
path length SimpleName Assignment MethodInvocation SimpleName last move x
path length SimpleName Assignment MethodInvocation SimpleName last move y
path segment SimpleName SimpleType ClassInstanceCreation QualifiedName path iteratorseg lineto
path segment SimpleName SimpleType ClassInstanceCreation SimpleName last move x
path segment SimpleName SimpleType ClassInstanceCreation SimpleName last move y
path segment SimpleName SimpleType ClassInstanceCreation SimpleName path length
path iteratorseg lineto QualifiedName ClassInstanceCreation SimpleName last move x
path iteratorseg lineto QualifiedName ClassInstanceCreation SimpleName last move y
path iteratorseg lineto QualifiedName ClassInstanceCreation SimpleName path length
last move x SimpleName ClassInstanceCreation SimpleName last move y
last move x SimpleName ClassInstanceCreation SimpleName path length
last move y SimpleName ClassInstanceCreation SimpleName path length
segments SimpleName MethodInvocation SimpleName add
segments SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName path segment
segments SimpleName MethodInvocation ClassInstanceCreation QualifiedName path iteratorseg lineto
segments SimpleName MethodInvocation ClassInstanceCreation SimpleName last move x
segments SimpleName MethodInvocation ClassInstanceCreation SimpleName last move y
segments SimpleName MethodInvocation ClassInstanceCreation SimpleName path length
add SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName path segment
add SimpleName MethodInvocation ClassInstanceCreation QualifiedName path iteratorseg lineto
add SimpleName MethodInvocation ClassInstanceCreation SimpleName last move x
add SimpleName MethodInvocation ClassInstanceCreation SimpleName last move y
add SimpleName MethodInvocation ClassInstanceCreation SimpleName path length
current x SimpleName Assignment SimpleName last move x
current y SimpleName Assignment SimpleName last move y
systemout QualifiedName MethodInvocation SimpleName println
systemout QualifiedName MethodInvocation StringLiteral bad path segment types
println SimpleName MethodInvocation StringLiteral bad path segment types
seg type SimpleName SwitchStatement SwitchCase QualifiedName path iteratorseg moveto
seg type SimpleName SwitchStatement ExpressionStatement MethodInvocation SimpleName segments
seg type SimpleName SwitchStatement ExpressionStatement MethodInvocation SimpleName add
seg type SimpleName SwitchStatement ExpressionStatement Assignment SimpleName current x
seg type SimpleName SwitchStatement ExpressionStatement Assignment SimpleName current y
seg type SimpleName SwitchStatement ExpressionStatement Assignment SimpleName last move x
seg type SimpleName SwitchStatement ExpressionStatement Assignment SimpleName current x
fpi SimpleName MethodInvocation SimpleName next
initialised SimpleName Assignment BooleanLiteral true
float PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType float
float PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType float
float PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType float
float PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
float PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType float
float PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType float
float PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
float PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType float
float PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
float PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
protected Modifier MethodDeclaration PrimitiveType void
protected Modifier MethodDeclaration SimpleName initialise
protected Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType float
protected Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType float
protected Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType float
protected Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType float
protected Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
void PrimitiveType MethodDeclaration SimpleName initialise
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType float
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType float
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType float
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType float
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
initialise SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType float
initialise SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType float
initialise SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType float
initialise SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType float
initialise SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier protected
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName initialise
test SimpleName TypeDeclaration MethodDeclaration Modifier protected
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName initialise