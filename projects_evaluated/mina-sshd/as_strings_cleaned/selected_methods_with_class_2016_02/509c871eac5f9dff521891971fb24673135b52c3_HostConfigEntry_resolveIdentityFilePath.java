string SimpleName SimpleType SingleVariableDeclaration SimpleName id
string SimpleName SimpleType SingleVariableDeclaration SimpleName host
int PrimitiveType SingleVariableDeclaration SimpleName port
string SimpleName SimpleType SingleVariableDeclaration SimpleName username
generic utils SimpleName MethodInvocation SimpleName is empty
generic utils SimpleName MethodInvocation SimpleName id
is empty SimpleName MethodInvocation SimpleName id
id SimpleName MethodInvocation SimpleName replace
id SimpleName MethodInvocation CharacterLiteral /
id SimpleName MethodInvocation QualifiedName fileseparator char
replace SimpleName MethodInvocation CharacterLiteral /
replace SimpleName MethodInvocation QualifiedName fileseparator char
/ CharacterLiteral MethodInvocation QualifiedName fileseparator char
path SimpleName VariableDeclarationFragment MethodInvocation SimpleName id
path SimpleName VariableDeclarationFragment MethodInvocation SimpleName replace
path SimpleName VariableDeclarationFragment MethodInvocation CharacterLiteral /
path SimpleName VariableDeclarationFragment MethodInvocation QualifiedName fileseparator char
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName path
generic utils SimpleName MethodInvocation SimpleName split
generic utils SimpleName MethodInvocation SimpleName path
generic utils SimpleName MethodInvocation QualifiedName fileseparator char
split SimpleName MethodInvocation SimpleName path
split SimpleName MethodInvocation QualifiedName fileseparator char
path SimpleName MethodInvocation QualifiedName fileseparator char
elements SimpleName VariableDeclarationFragment MethodInvocation SimpleName generic utils
elements SimpleName VariableDeclarationFragment MethodInvocation SimpleName split
elements SimpleName VariableDeclarationFragment MethodInvocation SimpleName path
elements SimpleName VariableDeclarationFragment MethodInvocation QualifiedName fileseparator char
path SimpleName MethodInvocation SimpleName length
path SimpleName MethodInvocation InfixExpression QualifiedName longsize
length SimpleName MethodInvocation InfixExpression QualifiedName longsize
string builder SimpleName SimpleType ClassInstanceCreation InfixExpression QualifiedName longsize
sb SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName string builder
sb SimpleName VariableDeclarationFragment ClassInstanceCreation InfixExpression QualifiedName longsize
string builder SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName sb
index SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName index
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
index SimpleName InfixExpression QualifiedName elementslength
elements SimpleName ArrayAccess SimpleName index
elem SimpleName VariableDeclarationFragment ArrayAccess SimpleName elements
elem SimpleName VariableDeclarationFragment ArrayAccess SimpleName index
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName elem
index SimpleName InfixExpression NumberLiteral empty
sb SimpleName MethodInvocation SimpleName append
sb SimpleName MethodInvocation QualifiedName fileseparator char
append SimpleName MethodInvocation QualifiedName fileseparator char
cur pos SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName cur pos
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
elem SimpleName MethodInvocation SimpleName length
cur pos SimpleName InfixExpression MethodInvocation SimpleName elem
cur pos SimpleName InfixExpression MethodInvocation SimpleName length
elem SimpleName MethodInvocation SimpleName char at
elem SimpleName MethodInvocation SimpleName cur pos
char at SimpleName MethodInvocation SimpleName cur pos
ch SimpleName VariableDeclarationFragment MethodInvocation SimpleName elem
ch SimpleName VariableDeclarationFragment MethodInvocation SimpleName char at
ch SimpleName VariableDeclarationFragment MethodInvocation SimpleName cur pos
char PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName ch
char PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName elem
char PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName char at
char PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName cur pos
ch SimpleName InfixExpression SimpleName home tilde char
cur pos SimpleName InfixExpression NumberLiteral empty
index SimpleName InfixExpression NumberLiteral empty
validate utils SimpleName MethodInvocation SimpleName check true
validate utils SimpleName MethodInvocation StringLiteral home tilde must be first s
validate utils SimpleName MethodInvocation SimpleName id
check true SimpleName MethodInvocation StringLiteral home tilde must be first s
check true SimpleName MethodInvocation SimpleName id
home tilde must be first s StringLiteral MethodInvocation SimpleName id
append user home SimpleName MethodInvocation SimpleName sb
ch SimpleName InfixExpression SimpleName path macro char
elem SimpleName MethodInvocation SimpleName length
cur pos SimpleName InfixExpression MethodInvocation SimpleName elem
cur pos SimpleName InfixExpression MethodInvocation SimpleName length
validate utils SimpleName MethodInvocation SimpleName check true
validate utils SimpleName MethodInvocation InfixExpression SimpleName cur pos
validate utils SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName elem
validate utils SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName length
validate utils SimpleName MethodInvocation StringLiteral missing macro modifier in s
validate utils SimpleName MethodInvocation SimpleName id
check true SimpleName MethodInvocation InfixExpression SimpleName cur pos
check true SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName elem
check true SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName length
check true SimpleName MethodInvocation StringLiteral missing macro modifier in s
check true SimpleName MethodInvocation SimpleName id
cur pos SimpleName InfixExpression MethodInvocation StringLiteral missing macro modifier in s
elem SimpleName MethodInvocation InfixExpression MethodInvocation StringLiteral missing macro modifier in s
length SimpleName MethodInvocation InfixExpression MethodInvocation StringLiteral missing macro modifier in s
cur pos SimpleName InfixExpression MethodInvocation SimpleName id
elem SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName id
length SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName id
missing macro modifier in s StringLiteral MethodInvocation SimpleName id
elem SimpleName MethodInvocation SimpleName char at
elem SimpleName MethodInvocation SimpleName cur pos
char at SimpleName MethodInvocation SimpleName cur pos
ch SimpleName Assignment MethodInvocation SimpleName elem
ch SimpleName Assignment MethodInvocation SimpleName char at
ch SimpleName Assignment MethodInvocation SimpleName cur pos
sb SimpleName MethodInvocation SimpleName append
sb SimpleName MethodInvocation SimpleName ch
append SimpleName MethodInvocation SimpleName ch
cur pos SimpleName InfixExpression NumberLiteral empty
index SimpleName InfixExpression NumberLiteral empty
validate utils SimpleName MethodInvocation SimpleName check true
validate utils SimpleName MethodInvocation StringLiteral home macro must be first s
validate utils SimpleName MethodInvocation SimpleName id
check true SimpleName MethodInvocation StringLiteral home macro must be first s
check true SimpleName MethodInvocation SimpleName id
home macro must be first s StringLiteral MethodInvocation SimpleName id
append user home SimpleName MethodInvocation SimpleName sb
os utils SimpleName MethodInvocation SimpleName get current user
validate utils SimpleName MethodInvocation SimpleName check not null and not empty
validate utils SimpleName MethodInvocation MethodInvocation SimpleName os utils
validate utils SimpleName MethodInvocation MethodInvocation SimpleName get current user
validate utils SimpleName MethodInvocation StringLiteral no local user name value
check not null and not empty SimpleName MethodInvocation MethodInvocation SimpleName os utils
check not null and not empty SimpleName MethodInvocation MethodInvocation SimpleName get current user
check not null and not empty SimpleName MethodInvocation StringLiteral no local user name value
os utils SimpleName MethodInvocation MethodInvocation StringLiteral no local user name value
get current user SimpleName MethodInvocation MethodInvocation StringLiteral no local user name value
sb SimpleName MethodInvocation SimpleName append
sb SimpleName MethodInvocation MethodInvocation SimpleName validate utils
sb SimpleName MethodInvocation MethodInvocation SimpleName check not null and not empty
sb SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName os utils
sb SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get current user
sb SimpleName MethodInvocation MethodInvocation StringLiteral no local user name value
append SimpleName MethodInvocation MethodInvocation SimpleName validate utils
append SimpleName MethodInvocation MethodInvocation SimpleName check not null and not empty
append SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName os utils
append SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get current user
append SimpleName MethodInvocation MethodInvocation StringLiteral no local user name value
inet address SimpleName MethodInvocation SimpleName get local host
validate utils SimpleName MethodInvocation SimpleName check not null
validate utils SimpleName MethodInvocation MethodInvocation SimpleName inet address
validate utils SimpleName MethodInvocation MethodInvocation SimpleName get local host
validate utils SimpleName MethodInvocation StringLiteral no local address
check not null SimpleName MethodInvocation MethodInvocation SimpleName inet address
check not null SimpleName MethodInvocation MethodInvocation SimpleName get local host
check not null SimpleName MethodInvocation StringLiteral no local address
inet address SimpleName MethodInvocation MethodInvocation StringLiteral no local address
get local host SimpleName MethodInvocation MethodInvocation StringLiteral no local address
address SimpleName VariableDeclarationFragment MethodInvocation SimpleName validate utils
address SimpleName VariableDeclarationFragment MethodInvocation SimpleName check not null
address SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName inet address
address SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get local host
address SimpleName VariableDeclarationFragment MethodInvocation StringLiteral no local address
inet address SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName address
address SimpleName MethodInvocation SimpleName get host name
validate utils SimpleName MethodInvocation SimpleName check not null and not empty
validate utils SimpleName MethodInvocation MethodInvocation SimpleName address
validate utils SimpleName MethodInvocation MethodInvocation SimpleName get host name
validate utils SimpleName MethodInvocation StringLiteral no local name
check not null and not empty SimpleName MethodInvocation MethodInvocation SimpleName address
check not null and not empty SimpleName MethodInvocation MethodInvocation SimpleName get host name
check not null and not empty SimpleName MethodInvocation StringLiteral no local name
address SimpleName MethodInvocation MethodInvocation StringLiteral no local name
get host name SimpleName MethodInvocation MethodInvocation StringLiteral no local name
sb SimpleName MethodInvocation SimpleName append
sb SimpleName MethodInvocation MethodInvocation SimpleName validate utils
sb SimpleName MethodInvocation MethodInvocation SimpleName check not null and not empty
sb SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName address
sb SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get host name
sb SimpleName MethodInvocation MethodInvocation StringLiteral no local name
append SimpleName MethodInvocation MethodInvocation SimpleName validate utils
append SimpleName MethodInvocation MethodInvocation SimpleName check not null and not empty
append SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName address
append SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get host name
append SimpleName MethodInvocation MethodInvocation StringLiteral no local name
validate utils SimpleName MethodInvocation SimpleName check not null and not empty
validate utils SimpleName MethodInvocation SimpleName host
validate utils SimpleName MethodInvocation StringLiteral no remote host provided
check not null and not empty SimpleName MethodInvocation SimpleName host
check not null and not empty SimpleName MethodInvocation StringLiteral no remote host provided
host SimpleName MethodInvocation StringLiteral no remote host provided
sb SimpleName MethodInvocation SimpleName append
sb SimpleName MethodInvocation MethodInvocation SimpleName validate utils
sb SimpleName MethodInvocation MethodInvocation SimpleName check not null and not empty
sb SimpleName MethodInvocation MethodInvocation SimpleName host
sb SimpleName MethodInvocation MethodInvocation StringLiteral no remote host provided
append SimpleName MethodInvocation MethodInvocation SimpleName validate utils
append SimpleName MethodInvocation MethodInvocation SimpleName check not null and not empty
append SimpleName MethodInvocation MethodInvocation SimpleName host
append SimpleName MethodInvocation MethodInvocation StringLiteral no remote host provided
validate utils SimpleName MethodInvocation SimpleName check not null and not empty
validate utils SimpleName MethodInvocation SimpleName username
validate utils SimpleName MethodInvocation StringLiteral no remote user provided
check not null and not empty SimpleName MethodInvocation SimpleName username
check not null and not empty SimpleName MethodInvocation StringLiteral no remote user provided
username SimpleName MethodInvocation StringLiteral no remote user provided
sb SimpleName MethodInvocation SimpleName append
sb SimpleName MethodInvocation MethodInvocation SimpleName validate utils
sb SimpleName MethodInvocation MethodInvocation SimpleName check not null and not empty
sb SimpleName MethodInvocation MethodInvocation SimpleName username
sb SimpleName MethodInvocation MethodInvocation StringLiteral no remote user provided
append SimpleName MethodInvocation MethodInvocation SimpleName validate utils
append SimpleName MethodInvocation MethodInvocation SimpleName check not null and not empty
append SimpleName MethodInvocation MethodInvocation SimpleName username
append SimpleName MethodInvocation MethodInvocation StringLiteral no remote user provided
port SimpleName InfixExpression NumberLiteral empty
validate utils SimpleName MethodInvocation SimpleName check true
validate utils SimpleName MethodInvocation InfixExpression SimpleName port
validate utils SimpleName MethodInvocation InfixExpression NumberLiteral empty
validate utils SimpleName MethodInvocation StringLiteral bad remote port value d
validate utils SimpleName MethodInvocation SimpleName port
check true SimpleName MethodInvocation InfixExpression SimpleName port
check true SimpleName MethodInvocation InfixExpression NumberLiteral empty
check true SimpleName MethodInvocation StringLiteral bad remote port value d
check true SimpleName MethodInvocation SimpleName port
port SimpleName InfixExpression MethodInvocation StringLiteral bad remote port value d
empty NumberLiteral InfixExpression MethodInvocation StringLiteral bad remote port value d
port SimpleName InfixExpression MethodInvocation SimpleName port
empty NumberLiteral InfixExpression MethodInvocation SimpleName port
bad remote port value d StringLiteral MethodInvocation SimpleName port
sb SimpleName MethodInvocation SimpleName append
sb SimpleName MethodInvocation SimpleName port
append SimpleName MethodInvocation SimpleName port
string SimpleName MethodInvocation SimpleName value of
string SimpleName MethodInvocation SimpleName ch
value of SimpleName MethodInvocation SimpleName ch
validate utils SimpleName MethodInvocation SimpleName throw illegal argument exception
validate utils SimpleName MethodInvocation StringLiteral bad modifier s in s
validate utils SimpleName MethodInvocation MethodInvocation SimpleName string
validate utils SimpleName MethodInvocation MethodInvocation SimpleName value of
validate utils SimpleName MethodInvocation MethodInvocation SimpleName ch
validate utils SimpleName MethodInvocation SimpleName id
throw illegal argument exception SimpleName MethodInvocation StringLiteral bad modifier s in s
throw illegal argument exception SimpleName MethodInvocation MethodInvocation SimpleName string
throw illegal argument exception SimpleName MethodInvocation MethodInvocation SimpleName value of
throw illegal argument exception SimpleName MethodInvocation MethodInvocation SimpleName ch
throw illegal argument exception SimpleName MethodInvocation SimpleName id
bad modifier s in s StringLiteral MethodInvocation MethodInvocation SimpleName string
bad modifier s in s StringLiteral MethodInvocation MethodInvocation SimpleName value of
bad modifier s in s StringLiteral MethodInvocation MethodInvocation SimpleName ch
bad modifier s in s StringLiteral MethodInvocation SimpleName id
string SimpleName MethodInvocation MethodInvocation SimpleName id
value of SimpleName MethodInvocation MethodInvocation SimpleName id
ch SimpleName MethodInvocation MethodInvocation SimpleName id
ch SimpleName SwitchStatement SwitchCase SimpleName path macro char
ch SimpleName SwitchStatement ExpressionStatement MethodInvocation SimpleName sb
ch SimpleName SwitchStatement ExpressionStatement MethodInvocation SimpleName append
ch SimpleName SwitchStatement ExpressionStatement MethodInvocation SimpleName ch
ch SimpleName SwitchStatement SwitchCase SimpleName local home macro
ch SimpleName SwitchStatement ExpressionStatement MethodInvocation SimpleName validate utils
ch SimpleName SwitchStatement ExpressionStatement MethodInvocation SimpleName check true
ch SimpleName SwitchStatement ExpressionStatement MethodInvocation StringLiteral home macro must be first s
ch SimpleName SwitchStatement ExpressionStatement MethodInvocation SimpleName id
path macro char SimpleName SwitchCase SwitchStatement SwitchCase SimpleName local home macro
local home macro SimpleName SwitchCase SwitchStatement SwitchCase SimpleName local user macro
local user macro SimpleName SwitchCase SwitchStatement SwitchCase SimpleName local host macro
local user macro SimpleName SwitchCase SwitchStatement SwitchCase SimpleName remote host macro
local host macro SimpleName SwitchCase SwitchStatement SwitchCase SimpleName remote host macro
local host macro SimpleName SwitchCase SwitchStatement SwitchCase SimpleName remote user macro
remote host macro SimpleName SwitchCase SwitchStatement SwitchCase SimpleName remote user macro
remote user macro SimpleName SwitchCase SwitchStatement SwitchCase SimpleName remote port macro
sb SimpleName MethodInvocation SimpleName append
sb SimpleName MethodInvocation SimpleName ch
append SimpleName MethodInvocation SimpleName ch
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName cur pos
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName cur pos
cur pos SimpleName InfixExpression ForStatement PostfixExpression SimpleName cur pos
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName index
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression QualifiedName elementslength
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName index
index SimpleName InfixExpression ForStatement PostfixExpression SimpleName index
elementslength QualifiedName InfixExpression ForStatement PostfixExpression SimpleName index
sb SimpleName MethodInvocation SimpleName to string
public Modifier MethodDeclaration Modifier static
public Modifier MethodDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SimpleName resolve identity file path
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName id
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName host
static Modifier MethodDeclaration SimpleType SimpleName string
static Modifier MethodDeclaration SimpleName resolve identity file path
static Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName id
static Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName host
static Modifier MethodDeclaration SingleVariableDeclaration PrimitiveType int
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName port
string SimpleName SimpleType MethodDeclaration SimpleName resolve identity file path
string SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName id
string SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName host
string SimpleName SimpleType MethodDeclaration SingleVariableDeclaration PrimitiveType int
string SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName port
string SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName username
resolve identity file path SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
resolve identity file path SimpleName MethodDeclaration SingleVariableDeclaration SimpleName id
resolve identity file path SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
resolve identity file path SimpleName MethodDeclaration SingleVariableDeclaration SimpleName host
resolve identity file path SimpleName MethodDeclaration SingleVariableDeclaration PrimitiveType int
resolve identity file path SimpleName MethodDeclaration SingleVariableDeclaration SimpleName port
resolve identity file path SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
resolve identity file path SimpleName MethodDeclaration SingleVariableDeclaration SimpleName username
resolve identity file path SimpleName MethodDeclaration SimpleType SimpleName io exception
id SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName host
id SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
id SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName port
id SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName username
id SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
host SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
host SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName port
host SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName username
host SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
int PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName username
port SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName username
int PrimitiveType SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
port SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
username SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration Modifier static
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName string
public Modifier TypeDeclaration MethodDeclaration SimpleName resolve identity file path
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName id
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName host
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName port
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName username
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration Modifier static
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName string
test SimpleName TypeDeclaration MethodDeclaration SimpleName resolve identity file path
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName id
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName host
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName port
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName username
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
