zoo reader SimpleName SimpleType SingleVariableDeclaration SimpleName zoo
string SimpleName SimpleType SingleVariableDeclaration SimpleName path
inst SimpleName MethodInvocation SimpleName get instance id
path SimpleName MethodInvocation SimpleName replace
path SimpleName MethodInvocation MethodInvocation SimpleName inst
path SimpleName MethodInvocation MethodInvocation SimpleName get instance id
path SimpleName MethodInvocation SimpleName new instance id
replace SimpleName MethodInvocation MethodInvocation SimpleName inst
replace SimpleName MethodInvocation MethodInvocation SimpleName get instance id
replace SimpleName MethodInvocation SimpleName new instance id
inst SimpleName MethodInvocation MethodInvocation SimpleName new instance id
get instance id SimpleName MethodInvocation MethodInvocation SimpleName new instance id
new path SimpleName VariableDeclarationFragment MethodInvocation SimpleName path
new path SimpleName VariableDeclarationFragment MethodInvocation SimpleName replace
new path SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName inst
new path SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get instance id
new path SimpleName VariableDeclarationFragment MethodInvocation SimpleName new instance id
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName new path
zoo SimpleName MethodInvocation SimpleName get data
zoo SimpleName MethodInvocation SimpleName path
get data SimpleName MethodInvocation SimpleName path
data SimpleName VariableDeclarationFragment MethodInvocation SimpleName zoo
data SimpleName VariableDeclarationFragment MethodInvocation SimpleName get data
data SimpleName VariableDeclarationFragment MethodInvocation SimpleName path
byte PrimitiveType ArrayType VariableDeclarationStatement VariableDeclarationFragment SimpleName data
list SimpleName SimpleType ParameterizedType SimpleType SimpleName acl
orig SimpleName MethodInvocation SimpleName get zoo keeper
orig SimpleName MethodInvocation MethodInvocation SimpleName get acl
get zoo keeper SimpleName MethodInvocation MethodInvocation SimpleName get acl
orig SimpleName MethodInvocation MethodInvocation SimpleName path
get zoo keeper SimpleName MethodInvocation MethodInvocation SimpleName path
get acl SimpleName MethodInvocation SimpleName path
get acl SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName stat
path SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName stat
acls SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName orig
acls SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get zoo keeper
acls SimpleName VariableDeclarationFragment MethodInvocation SimpleName get acl
acls SimpleName VariableDeclarationFragment MethodInvocation SimpleName path
acls SimpleName MethodInvocation SimpleName contains all
acls SimpleName MethodInvocation QualifiedName idsread acl unsafe
contains all SimpleName MethodInvocation QualifiedName idsread acl unsafe
new SimpleName MethodInvocation SimpleName put persistent data
new SimpleName MethodInvocation SimpleName new path
new SimpleName MethodInvocation SimpleName data
new SimpleName MethodInvocation QualifiedName node exists policyfail
put persistent data SimpleName MethodInvocation SimpleName new path
put persistent data SimpleName MethodInvocation SimpleName data
put persistent data SimpleName MethodInvocation QualifiedName node exists policyfail
new path SimpleName MethodInvocation SimpleName data
new path SimpleName MethodInvocation QualifiedName node exists policyfail
data SimpleName MethodInvocation QualifiedName node exists policyfail
acls SimpleName MethodInvocation SimpleName contains all
acls SimpleName MethodInvocation QualifiedName idsopen acl unsafe
contains all SimpleName MethodInvocation QualifiedName idsopen acl unsafe
path SimpleName MethodInvocation SimpleName split
path SimpleName MethodInvocation StringLiteral /
split SimpleName MethodInvocation StringLiteral /
parts SimpleName VariableDeclarationFragment MethodInvocation SimpleName path
parts SimpleName VariableDeclarationFragment MethodInvocation SimpleName split
parts SimpleName VariableDeclarationFragment MethodInvocation StringLiteral /
partslength QualifiedName InfixExpression NumberLiteral empty
parts SimpleName ArrayAccess InfixExpression QualifiedName partslength
parts SimpleName ArrayAccess InfixExpression NumberLiteral empty
parts SimpleName ArrayAccess MethodInvocation SimpleName equals
partslength QualifiedName InfixExpression ArrayAccess MethodInvocation SimpleName equals
empty NumberLiteral InfixExpression ArrayAccess MethodInvocation SimpleName equals
parts SimpleName ArrayAccess MethodInvocation StringLiteral users
partslength QualifiedName InfixExpression ArrayAccess MethodInvocation StringLiteral users
empty NumberLiteral InfixExpression ArrayAccess MethodInvocation StringLiteral users
equals SimpleName MethodInvocation StringLiteral users
new SimpleName MethodInvocation SimpleName put private persistent data
new SimpleName MethodInvocation SimpleName new path
new SimpleName MethodInvocation SimpleName data
new SimpleName MethodInvocation QualifiedName node exists policyfail
put private persistent data SimpleName MethodInvocation SimpleName new path
put private persistent data SimpleName MethodInvocation SimpleName data
put private persistent data SimpleName MethodInvocation QualifiedName node exists policyfail
new path SimpleName MethodInvocation SimpleName data
new path SimpleName MethodInvocation QualifiedName node exists policyfail
data SimpleName MethodInvocation QualifiedName node exists policyfail
new SimpleName MethodInvocation SimpleName put persistent data
new SimpleName MethodInvocation SimpleName new path
new SimpleName MethodInvocation SimpleName data
new SimpleName MethodInvocation QualifiedName node exists policyfail
put persistent data SimpleName MethodInvocation SimpleName new path
put persistent data SimpleName MethodInvocation SimpleName data
put persistent data SimpleName MethodInvocation QualifiedName node exists policyfail
new path SimpleName MethodInvocation SimpleName data
new path SimpleName MethodInvocation QualifiedName node exists policyfail
data SimpleName MethodInvocation QualifiedName node exists policyfail
new SimpleName MethodInvocation SimpleName put private persistent data
new SimpleName MethodInvocation SimpleName new path
new SimpleName MethodInvocation SimpleName data
new SimpleName MethodInvocation QualifiedName node exists policyfail
put private persistent data SimpleName MethodInvocation SimpleName new path
put private persistent data SimpleName MethodInvocation SimpleName data
put private persistent data SimpleName MethodInvocation QualifiedName node exists policyfail
new path SimpleName MethodInvocation SimpleName data
new path SimpleName MethodInvocation QualifiedName node exists policyfail
data SimpleName MethodInvocation QualifiedName node exists policyfail
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName visit
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName zoo reader
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName zoo
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName path
public Modifier MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration SimpleName visit
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName zoo reader
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName zoo
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName path
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
visit SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName zoo reader
visit SimpleName MethodDeclaration SingleVariableDeclaration SimpleName zoo
visit SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
visit SimpleName MethodDeclaration SingleVariableDeclaration SimpleName path
visit SimpleName MethodDeclaration SimpleType SimpleName exception
zoo SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName path
zoo SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
path SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName visit
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName zoo
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName path
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName visit
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName zoo
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName path
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
