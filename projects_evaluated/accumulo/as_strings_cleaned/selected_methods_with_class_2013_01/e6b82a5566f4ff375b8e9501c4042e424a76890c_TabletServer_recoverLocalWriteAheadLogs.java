file system SimpleName SimpleType SingleVariableDeclaration SimpleName fs
server configuration SimpleName SimpleType SingleVariableDeclaration SimpleName server conf
fs SimpleName MethodInvocation SimpleName get conf
file system SimpleName MethodInvocation SimpleName get local
file system SimpleName MethodInvocation MethodInvocation SimpleName fs
file system SimpleName MethodInvocation MethodInvocation SimpleName get conf
get local SimpleName MethodInvocation MethodInvocation SimpleName fs
get local SimpleName MethodInvocation MethodInvocation SimpleName get conf
file system SimpleName MethodInvocation MethodInvocation SimpleName get raw file system
get local SimpleName MethodInvocation MethodInvocation SimpleName get raw file system
fs SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get raw file system
get conf SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get raw file system
localfs SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName file system
localfs SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get local
localfs SimpleName VariableDeclarationFragment MethodInvocation SimpleName get raw file system
file system SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName localfs
server conf SimpleName MethodInvocation SimpleName get configuration
conf SimpleName VariableDeclarationFragment MethodInvocation SimpleName server conf
conf SimpleName VariableDeclarationFragment MethodInvocation SimpleName get configuration
accumulo configuration SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName conf
conf SimpleName MethodInvocation SimpleName get
conf SimpleName MethodInvocation QualifiedName propertylogger dir
get SimpleName MethodInvocation QualifiedName propertylogger dir
local wal directories SimpleName VariableDeclarationFragment MethodInvocation SimpleName conf
local wal directories SimpleName VariableDeclarationFragment MethodInvocation SimpleName get
local wal directories SimpleName VariableDeclarationFragment MethodInvocation QualifiedName propertylogger dir
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName local wal directories
string SimpleName SimpleType SingleVariableDeclaration SimpleName local wal directory
local wal directories SimpleName MethodInvocation SimpleName split
local wal directories SimpleName MethodInvocation StringLiteral empty
split SimpleName MethodInvocation StringLiteral empty
local wal directory SimpleName MethodInvocation SimpleName starts with
local wal directory SimpleName MethodInvocation StringLiteral /
starts with SimpleName MethodInvocation StringLiteral /
system SimpleName MethodInvocation SimpleName getenv
system SimpleName MethodInvocation StringLiteral accumulo home
getenv SimpleName MethodInvocation StringLiteral accumulo home
system SimpleName MethodInvocation InfixExpression StringLiteral /
getenv SimpleName MethodInvocation InfixExpression StringLiteral /
accumulo home StringLiteral MethodInvocation InfixExpression StringLiteral /
system SimpleName MethodInvocation InfixExpression SimpleName local wal directory
getenv SimpleName MethodInvocation InfixExpression SimpleName local wal directory
accumulo home StringLiteral MethodInvocation InfixExpression SimpleName local wal directory
/ StringLiteral InfixExpression SimpleName local wal directory
local wal directory SimpleName Assignment InfixExpression MethodInvocation SimpleName system
local wal directory SimpleName Assignment InfixExpression MethodInvocation SimpleName getenv
local wal directory SimpleName Assignment InfixExpression MethodInvocation StringLiteral accumulo home
local wal directory SimpleName Assignment InfixExpression StringLiteral /
local wal directory SimpleName Assignment InfixExpression SimpleName local wal directory
file status SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName status
path SimpleName SimpleType ClassInstanceCreation SimpleName local wal directory
localfs SimpleName MethodInvocation SimpleName get file status
localfs SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName path
localfs SimpleName MethodInvocation ClassInstanceCreation SimpleName local wal directory
get file status SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName path
get file status SimpleName MethodInvocation ClassInstanceCreation SimpleName local wal directory
status SimpleName Assignment MethodInvocation SimpleName localfs
status SimpleName Assignment MethodInvocation SimpleName get file status
status SimpleName Assignment MethodInvocation ClassInstanceCreation SimpleName local wal directory
file not found exception SimpleName SimpleType SingleVariableDeclaration SimpleName fne
status SimpleName MethodInvocation SimpleName is dir
local walog dir StringLiteral InfixExpression SimpleName local wal directory
local walog dir StringLiteral InfixExpression StringLiteral not found
local wal directory SimpleName InfixExpression StringLiteral not found
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation InfixExpression StringLiteral local walog dir
log SimpleName MethodInvocation InfixExpression SimpleName local wal directory
log SimpleName MethodInvocation InfixExpression StringLiteral not found
debug SimpleName MethodInvocation InfixExpression StringLiteral local walog dir
debug SimpleName MethodInvocation InfixExpression SimpleName local wal directory
debug SimpleName MethodInvocation InfixExpression StringLiteral not found
file status SimpleName SimpleType SingleVariableDeclaration SimpleName file
path SimpleName SimpleType ClassInstanceCreation SimpleName local wal directory
localfs SimpleName MethodInvocation SimpleName list status
localfs SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName path
localfs SimpleName MethodInvocation ClassInstanceCreation SimpleName local wal directory
list status SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName path
list status SimpleName MethodInvocation ClassInstanceCreation SimpleName local wal directory
file SimpleName MethodInvocation SimpleName get path
file SimpleName MethodInvocation MethodInvocation SimpleName get name
get path SimpleName MethodInvocation MethodInvocation SimpleName get name
name SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName file
name SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get path
name SimpleName VariableDeclarationFragment MethodInvocation SimpleName get name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName name
uuid SimpleName MethodInvocation SimpleName from string
uuid SimpleName MethodInvocation SimpleName name
from string SimpleName MethodInvocation SimpleName name
illegal argument exception SimpleName SimpleType SingleVariableDeclaration SimpleName ex
ignoring nonlog file StringLiteral InfixExpression SimpleName name
ignoring nonlog file StringLiteral InfixExpression StringLiteral in
ignoring nonlog file StringLiteral InfixExpression SimpleName local wal directory
name SimpleName InfixExpression StringLiteral in
name SimpleName InfixExpression SimpleName local wal directory
in StringLiteral InfixExpression SimpleName local wal directory
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation InfixExpression StringLiteral ignoring nonlog file
log SimpleName MethodInvocation InfixExpression SimpleName name
log SimpleName MethodInvocation InfixExpression StringLiteral in
log SimpleName MethodInvocation InfixExpression SimpleName local wal directory
info SimpleName MethodInvocation InfixExpression StringLiteral ignoring nonlog file
info SimpleName MethodInvocation InfixExpression SimpleName name
info SimpleName MethodInvocation InfixExpression StringLiteral in
info SimpleName MethodInvocation InfixExpression SimpleName local wal directory
key SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName log file key
log file key SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName key
value SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName log file value
log file value SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName value
file SimpleName MethodInvocation SimpleName get path
openning local log StringLiteral InfixExpression MethodInvocation SimpleName file
openning local log StringLiteral InfixExpression MethodInvocation SimpleName get path
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation InfixExpression StringLiteral openning local log
log SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName file
log SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get path
info SimpleName MethodInvocation InfixExpression StringLiteral openning local log
info SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName file
info SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get path
file SimpleName MethodInvocation SimpleName get path
localfs SimpleName MethodInvocation SimpleName get conf
sequence filereader QualifiedName SimpleType ClassInstanceCreation SimpleName localfs
sequence filereader QualifiedName SimpleType ClassInstanceCreation MethodInvocation SimpleName file
sequence filereader QualifiedName SimpleType ClassInstanceCreation MethodInvocation SimpleName get path
sequence filereader QualifiedName SimpleType ClassInstanceCreation MethodInvocation SimpleName localfs
sequence filereader QualifiedName SimpleType ClassInstanceCreation MethodInvocation SimpleName get conf
localfs SimpleName ClassInstanceCreation MethodInvocation SimpleName file
localfs SimpleName ClassInstanceCreation MethodInvocation SimpleName get path
localfs SimpleName ClassInstanceCreation MethodInvocation SimpleName localfs
localfs SimpleName ClassInstanceCreation MethodInvocation SimpleName get conf
file SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName localfs
file SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get conf
get path SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName localfs
get path SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get conf
reader SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType QualifiedName sequence filereader
reader SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName localfs
reader SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName file
reader SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName get path
reader SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName localfs
reader SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName get conf
reader SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName reader
constants SimpleName MethodInvocation SimpleName get wal directory
constants SimpleName MethodInvocation SimpleName conf
get wal directory SimpleName MethodInvocation SimpleName conf
constants SimpleName MethodInvocation InfixExpression StringLiteral /
get wal directory SimpleName MethodInvocation InfixExpression StringLiteral /
conf SimpleName MethodInvocation InfixExpression StringLiteral /
constants SimpleName MethodInvocation InfixExpression SimpleName name
get wal directory SimpleName MethodInvocation InfixExpression SimpleName name
conf SimpleName MethodInvocation InfixExpression SimpleName name
constants SimpleName MethodInvocation InfixExpression StringLiteral copy
get wal directory SimpleName MethodInvocation InfixExpression StringLiteral copy
conf SimpleName MethodInvocation InfixExpression StringLiteral copy
/ StringLiteral InfixExpression SimpleName name
/ StringLiteral InfixExpression StringLiteral copy
name SimpleName InfixExpression StringLiteral copy
path SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral /
path SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName name
path SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral copy
tmp SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName path
tmp SimpleName VariableDeclarationFragment ClassInstanceCreation InfixExpression StringLiteral /
tmp SimpleName VariableDeclarationFragment ClassInstanceCreation InfixExpression SimpleName name
tmp SimpleName VariableDeclarationFragment ClassInstanceCreation InfixExpression StringLiteral copy
path SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName tmp
fs SimpleName MethodInvocation SimpleName create
fs SimpleName MethodInvocation SimpleName tmp
create SimpleName MethodInvocation SimpleName tmp
writer SimpleName VariableDeclarationFragment MethodInvocation SimpleName fs
writer SimpleName VariableDeclarationFragment MethodInvocation SimpleName create
writer SimpleName VariableDeclarationFragment MethodInvocation SimpleName tmp
fs data output stream SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName writer
reader SimpleName MethodInvocation SimpleName next
reader SimpleName MethodInvocation SimpleName key
reader SimpleName MethodInvocation SimpleName value
next SimpleName MethodInvocation SimpleName key
next SimpleName MethodInvocation SimpleName value
key SimpleName MethodInvocation SimpleName value
key SimpleName MethodInvocation SimpleName write
key SimpleName MethodInvocation SimpleName writer
write SimpleName MethodInvocation SimpleName writer
value SimpleName MethodInvocation SimpleName write
value SimpleName MethodInvocation SimpleName writer
write SimpleName MethodInvocation SimpleName writer
eof exception SimpleName SimpleType SingleVariableDeclaration SimpleName ex
writer SimpleName MethodInvocation SimpleName close
reader SimpleName MethodInvocation SimpleName close
tmp SimpleName MethodInvocation SimpleName get parent
path SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName tmp
path SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get parent
path SimpleName SimpleType ClassInstanceCreation SimpleName name
tmp SimpleName MethodInvocation ClassInstanceCreation SimpleName name
get parent SimpleName MethodInvocation ClassInstanceCreation SimpleName name
fs SimpleName MethodInvocation SimpleName rename
fs SimpleName MethodInvocation SimpleName tmp
fs SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName path
fs SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName tmp
fs SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get parent
fs SimpleName MethodInvocation ClassInstanceCreation SimpleName name
rename SimpleName MethodInvocation SimpleName tmp
rename SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName path
rename SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName tmp
rename SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get parent
rename SimpleName MethodInvocation ClassInstanceCreation SimpleName name
tmp SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName path
tmp SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName tmp
tmp SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get parent
tmp SimpleName MethodInvocation ClassInstanceCreation SimpleName name
copied local log StringLiteral InfixExpression SimpleName name
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation InfixExpression StringLiteral copied local log
log SimpleName MethodInvocation InfixExpression SimpleName name
info SimpleName MethodInvocation InfixExpression StringLiteral copied local log
info SimpleName MethodInvocation InfixExpression SimpleName name
path SimpleName SimpleType ClassInstanceCreation SimpleName local wal directory
path SimpleName SimpleType ClassInstanceCreation SimpleName name
local wal directory SimpleName ClassInstanceCreation SimpleName name
localfs SimpleName MethodInvocation SimpleName delete
localfs SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName path
localfs SimpleName MethodInvocation ClassInstanceCreation SimpleName local wal directory
localfs SimpleName MethodInvocation ClassInstanceCreation SimpleName name
localfs SimpleName MethodInvocation BooleanLiteral true
delete SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName path
delete SimpleName MethodInvocation ClassInstanceCreation SimpleName local wal directory
delete SimpleName MethodInvocation ClassInstanceCreation SimpleName name
delete SimpleName MethodInvocation BooleanLiteral true
path SimpleName SimpleType ClassInstanceCreation MethodInvocation BooleanLiteral true
local wal directory SimpleName ClassInstanceCreation MethodInvocation BooleanLiteral true
name SimpleName ClassInstanceCreation MethodInvocation BooleanLiteral true
file SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName localfs
file SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName list status
local wal directory SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName local wal directories
local wal directory SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName split
local wal directory SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation StringLiteral empty
public Modifier MethodDeclaration Modifier static
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName recover local write ahead logs
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName file system
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName fs
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName server configuration
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName server conf
static Modifier MethodDeclaration PrimitiveType void
static Modifier MethodDeclaration SimpleName recover local write ahead logs
static Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName file system
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName fs
static Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName server configuration
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName server conf
static Modifier MethodDeclaration SimpleType SimpleName io exception
void PrimitiveType MethodDeclaration SimpleName recover local write ahead logs
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName file system
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName fs
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName server configuration
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName server conf
void PrimitiveType MethodDeclaration SimpleType SimpleName io exception
recover local write ahead logs SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName file system
recover local write ahead logs SimpleName MethodDeclaration SingleVariableDeclaration SimpleName fs
recover local write ahead logs SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName server configuration
recover local write ahead logs SimpleName MethodDeclaration SingleVariableDeclaration SimpleName server conf
recover local write ahead logs SimpleName MethodDeclaration SimpleType SimpleName io exception
fs SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName server conf
fs SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
server conf SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration Modifier static
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName recover local write ahead logs
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName fs
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName server conf
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration Modifier static
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName recover local write ahead logs
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName fs
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName server conf
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
