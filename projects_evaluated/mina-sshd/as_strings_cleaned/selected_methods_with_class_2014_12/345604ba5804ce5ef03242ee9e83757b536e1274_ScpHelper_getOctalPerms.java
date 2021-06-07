path SimpleName SimpleType SingleVariableDeclaration SimpleName path
pf SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName pf
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment NumberLiteral empty
path SimpleName MethodInvocation SimpleName get file system
path SimpleName MethodInvocation MethodInvocation SimpleName supported file attribute views
get file system SimpleName MethodInvocation MethodInvocation SimpleName supported file attribute views
path SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName contains
get file system SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName contains
supported file attribute views SimpleName MethodInvocation MethodInvocation SimpleName contains
path SimpleName MethodInvocation MethodInvocation MethodInvocation StringLiteral posix
get file system SimpleName MethodInvocation MethodInvocation MethodInvocation StringLiteral posix
supported file attribute views SimpleName MethodInvocation MethodInvocation StringLiteral posix
contains SimpleName MethodInvocation StringLiteral posix
set SimpleName SimpleType ParameterizedType SimpleType SimpleName posix file permission
files SimpleName MethodInvocation SimpleName get posix file permissions
files SimpleName MethodInvocation SimpleName path
get posix file permissions SimpleName MethodInvocation SimpleName path
perms SimpleName VariableDeclarationFragment MethodInvocation SimpleName files
perms SimpleName VariableDeclarationFragment MethodInvocation SimpleName get posix file permissions
perms SimpleName VariableDeclarationFragment MethodInvocation SimpleName path
posix file permission SimpleName SimpleType SingleVariableDeclaration SimpleName p
pf SimpleName Assignment SimpleName s irusr
pf SimpleName Assignment SimpleName s iwusr
pf SimpleName Assignment SimpleName s ixusr
pf SimpleName Assignment SimpleName s irgrp
pf SimpleName Assignment SimpleName s iwgrp
pf SimpleName Assignment SimpleName s ixgrp
pf SimpleName Assignment SimpleName s iroth
pf SimpleName Assignment SimpleName s iwoth
pf SimpleName Assignment SimpleName s ixoth
p SimpleName SwitchStatement SwitchCase SimpleName owner read
p SimpleName SwitchStatement ExpressionStatement Assignment SimpleName pf
p SimpleName SwitchStatement ExpressionStatement Assignment SimpleName s irusr
p SimpleName SwitchStatement SwitchCase SimpleName owner write
p SimpleName SwitchStatement ExpressionStatement Assignment SimpleName pf
p SimpleName SwitchStatement ExpressionStatement Assignment SimpleName s iwusr
owner read SimpleName SwitchCase SwitchStatement SwitchCase SimpleName owner write
owner write SimpleName SwitchCase SwitchStatement SwitchCase SimpleName owner execute
owner execute SimpleName SwitchCase SwitchStatement SwitchCase SimpleName group read
group read SimpleName SwitchCase SwitchStatement SwitchCase SimpleName group write
group write SimpleName SwitchCase SwitchStatement SwitchCase SimpleName group execute
group execute SimpleName SwitchCase SwitchStatement SwitchCase SimpleName others read
others read SimpleName SwitchCase SwitchStatement SwitchCase SimpleName others write
others write SimpleName SwitchCase SwitchStatement SwitchCase SimpleName others execute
posix file permission SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName perms
p SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName perms
perms SimpleName EnhancedForStatement Block SwitchStatement SimpleName p
files SimpleName MethodInvocation SimpleName is readable
files SimpleName MethodInvocation SimpleName path
is readable SimpleName MethodInvocation SimpleName path
s irusr SimpleName InfixExpression SimpleName s irgrp
s irusr SimpleName InfixExpression SimpleName s iroth
s irgrp SimpleName InfixExpression SimpleName s iroth
pf SimpleName Assignment InfixExpression SimpleName s irusr
pf SimpleName Assignment InfixExpression SimpleName s irgrp
pf SimpleName Assignment InfixExpression SimpleName s iroth
files SimpleName MethodInvocation SimpleName is writable
files SimpleName MethodInvocation SimpleName path
is writable SimpleName MethodInvocation SimpleName path
s iwusr SimpleName InfixExpression SimpleName s iwgrp
s iwusr SimpleName InfixExpression SimpleName s iwoth
s iwgrp SimpleName InfixExpression SimpleName s iwoth
pf SimpleName Assignment InfixExpression SimpleName s iwusr
pf SimpleName Assignment InfixExpression SimpleName s iwgrp
pf SimpleName Assignment InfixExpression SimpleName s iwoth
files SimpleName MethodInvocation SimpleName is executable
files SimpleName MethodInvocation SimpleName path
is executable SimpleName MethodInvocation SimpleName path
s ixusr SimpleName InfixExpression SimpleName s ixgrp
s ixusr SimpleName InfixExpression SimpleName s ixoth
s ixgrp SimpleName InfixExpression SimpleName s ixoth
pf SimpleName Assignment InfixExpression SimpleName s ixusr
pf SimpleName Assignment InfixExpression SimpleName s ixgrp
pf SimpleName Assignment InfixExpression SimpleName s ixoth
string SimpleName MethodInvocation SimpleName format
string SimpleName MethodInvocation StringLiteral % o
string SimpleName MethodInvocation SimpleName pf
format SimpleName MethodInvocation StringLiteral % o
format SimpleName MethodInvocation SimpleName pf
% o StringLiteral MethodInvocation SimpleName pf
public Modifier MethodDeclaration Modifier static
public Modifier MethodDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SimpleName get octal perms
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName path
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName path
public Modifier MethodDeclaration SimpleType SimpleName io exception
static Modifier MethodDeclaration SimpleType SimpleName string
static Modifier MethodDeclaration SimpleName get octal perms
static Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName path
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName path
static Modifier MethodDeclaration SimpleType SimpleName io exception
static Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
string SimpleName SimpleType MethodDeclaration SimpleName get octal perms
string SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName path
string SimpleName SimpleType MethodDeclaration SimpleType SimpleName io exception
get octal perms SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName path
get octal perms SimpleName MethodDeclaration SingleVariableDeclaration SimpleName path
get octal perms SimpleName MethodDeclaration SimpleType SimpleName io exception
get octal perms SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
path SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration Modifier static
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName string
public Modifier TypeDeclaration MethodDeclaration SimpleName get octal perms
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName path
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration Modifier static
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName string
test SimpleName TypeDeclaration MethodDeclaration SimpleName get octal perms
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName path
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
