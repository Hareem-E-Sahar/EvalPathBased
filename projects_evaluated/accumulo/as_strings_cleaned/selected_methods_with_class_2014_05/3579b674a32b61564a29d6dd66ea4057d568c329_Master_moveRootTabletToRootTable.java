i zoo reader writer SimpleName SimpleType SingleVariableDeclaration SimpleName zoo
zoo util SimpleName MethodInvocation SimpleName get root
zoo util SimpleName MethodInvocation SimpleName instance
get root SimpleName MethodInvocation SimpleName instance
zoo util SimpleName MethodInvocation InfixExpression QualifiedName root tablezroot tablet path
get root SimpleName MethodInvocation InfixExpression QualifiedName root tablezroot tablet path
instance SimpleName MethodInvocation InfixExpression QualifiedName root tablezroot tablet path
dir z path SimpleName VariableDeclarationFragment InfixExpression MethodInvocation SimpleName zoo util
dir z path SimpleName VariableDeclarationFragment InfixExpression MethodInvocation SimpleName get root
dir z path SimpleName VariableDeclarationFragment InfixExpression MethodInvocation SimpleName instance
dir z path SimpleName VariableDeclarationFragment InfixExpression QualifiedName root tablezroot tablet path
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName dir z path
zoo SimpleName MethodInvocation SimpleName exists
zoo SimpleName MethodInvocation SimpleName dir z path
exists SimpleName MethodInvocation SimpleName dir z path
/ StringLiteral InfixExpression QualifiedName metadata tableid
/ StringLiteral InfixExpression StringLiteral root tablet
metadata tableid QualifiedName InfixExpression StringLiteral root tablet
fs SimpleName MethodInvocation SimpleName get full path
fs SimpleName MethodInvocation QualifiedName file typetable
fs SimpleName MethodInvocation InfixExpression StringLiteral /
fs SimpleName MethodInvocation InfixExpression QualifiedName metadata tableid
fs SimpleName MethodInvocation InfixExpression StringLiteral root tablet
get full path SimpleName MethodInvocation QualifiedName file typetable
get full path SimpleName MethodInvocation InfixExpression StringLiteral /
get full path SimpleName MethodInvocation InfixExpression QualifiedName metadata tableid
get full path SimpleName MethodInvocation InfixExpression StringLiteral root tablet
file typetable QualifiedName MethodInvocation InfixExpression StringLiteral /
file typetable QualifiedName MethodInvocation InfixExpression QualifiedName metadata tableid
file typetable QualifiedName MethodInvocation InfixExpression StringLiteral root tablet
old path SimpleName VariableDeclarationFragment MethodInvocation SimpleName fs
old path SimpleName VariableDeclarationFragment MethodInvocation SimpleName get full path
old path SimpleName VariableDeclarationFragment MethodInvocation QualifiedName file typetable
old path SimpleName VariableDeclarationFragment MethodInvocation InfixExpression StringLiteral /
old path SimpleName VariableDeclarationFragment MethodInvocation InfixExpression QualifiedName metadata tableid
old path SimpleName VariableDeclarationFragment MethodInvocation InfixExpression StringLiteral root tablet
path SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName old path
fs SimpleName MethodInvocation SimpleName exists
fs SimpleName MethodInvocation SimpleName old path
exists SimpleName MethodInvocation SimpleName old path
server constants SimpleName MethodInvocation SimpleName get tables dirs
fs SimpleName MethodInvocation SimpleName choose
fs SimpleName MethodInvocation MethodInvocation SimpleName server constants
fs SimpleName MethodInvocation MethodInvocation SimpleName get tables dirs
choose SimpleName MethodInvocation MethodInvocation SimpleName server constants
choose SimpleName MethodInvocation MethodInvocation SimpleName get tables dirs
fs SimpleName MethodInvocation InfixExpression StringLiteral /
choose SimpleName MethodInvocation InfixExpression StringLiteral /
server constants SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral /
get tables dirs SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral /
fs SimpleName MethodInvocation InfixExpression QualifiedName root tableid
choose SimpleName MethodInvocation InfixExpression QualifiedName root tableid
server constants SimpleName MethodInvocation MethodInvocation InfixExpression QualifiedName root tableid
get tables dirs SimpleName MethodInvocation MethodInvocation InfixExpression QualifiedName root tableid
/ StringLiteral InfixExpression QualifiedName root tableid
new path SimpleName VariableDeclarationFragment InfixExpression MethodInvocation SimpleName fs
new path SimpleName VariableDeclarationFragment InfixExpression MethodInvocation SimpleName choose
new path SimpleName VariableDeclarationFragment InfixExpression StringLiteral /
new path SimpleName VariableDeclarationFragment InfixExpression QualifiedName root tableid
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName new path
path SimpleName SimpleType ClassInstanceCreation SimpleName new path
fs SimpleName MethodInvocation SimpleName mkdirs
fs SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName path
fs SimpleName MethodInvocation ClassInstanceCreation SimpleName new path
mkdirs SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName path
mkdirs SimpleName MethodInvocation ClassInstanceCreation SimpleName new path
path SimpleName SimpleType ClassInstanceCreation SimpleName new path
fs SimpleName MethodInvocation SimpleName rename
fs SimpleName MethodInvocation SimpleName old path
fs SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName path
fs SimpleName MethodInvocation ClassInstanceCreation SimpleName new path
rename SimpleName MethodInvocation SimpleName old path
rename SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName path
rename SimpleName MethodInvocation ClassInstanceCreation SimpleName new path
old path SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName path
old path SimpleName MethodInvocation ClassInstanceCreation SimpleName new path
failed to move root tablet from StringLiteral InfixExpression SimpleName old path
failed to move root tablet from StringLiteral InfixExpression StringLiteral to
failed to move root tablet from StringLiteral InfixExpression SimpleName new path
old path SimpleName InfixExpression StringLiteral to
old path SimpleName InfixExpression SimpleName new path
to StringLiteral InfixExpression SimpleName new path
io exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral failed to move root tablet from
io exception SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName old path
io exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral to
io exception SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName new path
upgrade renamed StringLiteral InfixExpression SimpleName old path
upgrade renamed StringLiteral InfixExpression StringLiteral to
upgrade renamed StringLiteral InfixExpression SimpleName new path
old path SimpleName InfixExpression StringLiteral to
old path SimpleName InfixExpression SimpleName new path
to StringLiteral InfixExpression SimpleName new path
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation InfixExpression StringLiteral upgrade renamed
log SimpleName MethodInvocation InfixExpression SimpleName old path
log SimpleName MethodInvocation InfixExpression StringLiteral to
log SimpleName MethodInvocation InfixExpression SimpleName new path
info SimpleName MethodInvocation InfixExpression StringLiteral upgrade renamed
info SimpleName MethodInvocation InfixExpression SimpleName old path
info SimpleName MethodInvocation InfixExpression StringLiteral to
info SimpleName MethodInvocation InfixExpression SimpleName new path
path SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName location
string SimpleName SimpleType SingleVariableDeclaration SimpleName base path
server constants SimpleName MethodInvocation SimpleName get tables dirs
base path SimpleName InfixExpression StringLiteral /
base path SimpleName InfixExpression QualifiedName root tableid
base path SimpleName InfixExpression QualifiedName root tableroot tablet location
/ StringLiteral InfixExpression QualifiedName root tableid
/ StringLiteral InfixExpression QualifiedName root tableroot tablet location
root tableid QualifiedName InfixExpression QualifiedName root tableroot tablet location
path SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName base path
path SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral /
path SimpleName SimpleType ClassInstanceCreation InfixExpression QualifiedName root tableid
path SimpleName SimpleType ClassInstanceCreation InfixExpression QualifiedName root tableroot tablet location
path SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName path
path SimpleName VariableDeclarationFragment ClassInstanceCreation InfixExpression SimpleName base path
path SimpleName VariableDeclarationFragment ClassInstanceCreation InfixExpression StringLiteral /
path SimpleName VariableDeclarationFragment ClassInstanceCreation InfixExpression QualifiedName root tableid
path SimpleName VariableDeclarationFragment ClassInstanceCreation InfixExpression QualifiedName root tableroot tablet location
path SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName path
fs SimpleName MethodInvocation SimpleName exists
fs SimpleName MethodInvocation SimpleName path
exists SimpleName MethodInvocation SimpleName path
root table at multiple locations StringLiteral InfixExpression SimpleName location
root table at multiple locations StringLiteral InfixExpression StringLiteral empty
root table at multiple locations StringLiteral InfixExpression SimpleName path
location SimpleName InfixExpression StringLiteral empty
location SimpleName InfixExpression SimpleName path
empty StringLiteral InfixExpression SimpleName path
illegal state exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral root table at multiple locations
illegal state exception SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName location
illegal state exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral empty
illegal state exception SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName path
location SimpleName Assignment SimpleName path
base path SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName server constants
base path SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName get tables dirs
illegal state exception SimpleName SimpleType ClassInstanceCreation StringLiteral failed to find root tablet
upgrade setting root table location in zookeeper StringLiteral InfixExpression SimpleName location
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation InfixExpression StringLiteral upgrade setting root table location in zookeeper
log SimpleName MethodInvocation InfixExpression SimpleName location
info SimpleName MethodInvocation InfixExpression StringLiteral upgrade setting root table location in zookeeper
info SimpleName MethodInvocation InfixExpression SimpleName location
location SimpleName MethodInvocation SimpleName to string
location SimpleName MethodInvocation MethodInvocation SimpleName get bytes
to string SimpleName MethodInvocation MethodInvocation SimpleName get bytes
zoo SimpleName MethodInvocation SimpleName put persistent data
zoo SimpleName MethodInvocation SimpleName dir z path
zoo SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName location
zoo SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to string
zoo SimpleName MethodInvocation MethodInvocation SimpleName get bytes
zoo SimpleName MethodInvocation QualifiedName node exists policyfail
put persistent data SimpleName MethodInvocation SimpleName dir z path
put persistent data SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName location
put persistent data SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to string
put persistent data SimpleName MethodInvocation MethodInvocation SimpleName get bytes
put persistent data SimpleName MethodInvocation QualifiedName node exists policyfail
dir z path SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName location
dir z path SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to string
dir z path SimpleName MethodInvocation MethodInvocation SimpleName get bytes
dir z path SimpleName MethodInvocation QualifiedName node exists policyfail
location SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName node exists policyfail
to string SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName node exists policyfail
get bytes SimpleName MethodInvocation MethodInvocation QualifiedName node exists policyfail
private Modifier MethodDeclaration PrimitiveType void
private Modifier MethodDeclaration SimpleName move root tablet to root table
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName i zoo reader writer
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName zoo
private Modifier MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration SimpleName move root tablet to root table
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName i zoo reader writer
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName zoo
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
move root tablet to root table SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName i zoo reader writer
move root tablet to root table SimpleName MethodDeclaration SingleVariableDeclaration SimpleName zoo
move root tablet to root table SimpleName MethodDeclaration SimpleType SimpleName exception
zoo SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName move root tablet to root table
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName zoo
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName move root tablet to root table
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName zoo
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
