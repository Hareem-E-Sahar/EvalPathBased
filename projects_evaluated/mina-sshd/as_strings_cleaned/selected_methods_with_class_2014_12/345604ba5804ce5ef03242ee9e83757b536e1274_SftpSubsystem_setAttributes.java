path SimpleName SimpleType SingleVariableDeclaration SimpleName file
map SimpleName SimpleType ParameterizedType SimpleType SimpleName attribute
map SimpleName SimpleType ParameterizedType SimpleType SimpleName object
attribute SimpleName SimpleType ParameterizedType SimpleType SimpleName object
map SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName attributes
attribute SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName attributes
object SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName attributes
set SimpleName SimpleType ParameterizedType SimpleType SimpleName attribute
attribute SimpleName SimpleType SingleVariableDeclaration SimpleName attribute
attributes SimpleName MethodInvocation SimpleName key set
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName name
attributes SimpleName MethodInvocation SimpleName get
attributes SimpleName MethodInvocation SimpleName attribute
get SimpleName MethodInvocation SimpleName attribute
value SimpleName VariableDeclarationFragment MethodInvocation SimpleName attributes
value SimpleName VariableDeclarationFragment MethodInvocation SimpleName get
value SimpleName VariableDeclarationFragment MethodInvocation SimpleName attribute
object SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName value
long SimpleName SimpleType CastExpression SimpleName value
new size SimpleName VariableDeclarationFragment CastExpression SimpleType SimpleName long
new size SimpleName VariableDeclarationFragment CastExpression SimpleName value
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName new size
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment CastExpression SimpleName value
file channel SimpleName MethodInvocation SimpleName open
file channel SimpleName MethodInvocation SimpleName file
file channel SimpleName MethodInvocation QualifiedName standard open optionwrite
open SimpleName MethodInvocation SimpleName file
open SimpleName MethodInvocation QualifiedName standard open optionwrite
file SimpleName MethodInvocation QualifiedName standard open optionwrite
channel SimpleName VariableDeclarationFragment MethodInvocation SimpleName file channel
channel SimpleName VariableDeclarationFragment MethodInvocation SimpleName open
channel SimpleName VariableDeclarationFragment MethodInvocation SimpleName file
channel SimpleName VariableDeclarationFragment MethodInvocation QualifiedName standard open optionwrite
file channel SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName channel
channel SimpleName MethodInvocation SimpleName truncate
channel SimpleName MethodInvocation SimpleName new size
truncate SimpleName MethodInvocation SimpleName new size
name SimpleName Assignment StringLiteral unixuid
name SimpleName Assignment StringLiteral unixgid
name SimpleName Assignment StringLiteral posixowner
string SimpleName SimpleType CastExpression SimpleName value
to user SimpleName MethodInvocation SimpleName file
to user SimpleName MethodInvocation CastExpression SimpleType SimpleName string
to user SimpleName MethodInvocation CastExpression SimpleName value
file SimpleName MethodInvocation CastExpression SimpleType SimpleName string
file SimpleName MethodInvocation CastExpression SimpleName value
value SimpleName Assignment MethodInvocation SimpleName to user
value SimpleName Assignment MethodInvocation SimpleName file
value SimpleName Assignment MethodInvocation CastExpression SimpleName value
name SimpleName Assignment StringLiteral posixgroup
string SimpleName SimpleType CastExpression SimpleName value
to group SimpleName MethodInvocation SimpleName file
to group SimpleName MethodInvocation CastExpression SimpleType SimpleName string
to group SimpleName MethodInvocation CastExpression SimpleName value
file SimpleName MethodInvocation CastExpression SimpleType SimpleName string
file SimpleName MethodInvocation CastExpression SimpleName value
value SimpleName Assignment MethodInvocation SimpleName to group
value SimpleName Assignment MethodInvocation SimpleName file
value SimpleName Assignment MethodInvocation CastExpression SimpleName value
name SimpleName Assignment StringLiteral posixpermissions
enum set SimpleName SimpleType ParameterizedType SimpleType SimpleName permission
enum set SimpleName SimpleType ParameterizedType CastExpression SimpleName value
permission SimpleName SimpleType ParameterizedType CastExpression SimpleName value
to perms SimpleName MethodInvocation CastExpression SimpleName value
value SimpleName Assignment MethodInvocation SimpleName to perms
value SimpleName Assignment MethodInvocation CastExpression SimpleName value
name SimpleName Assignment StringLiteral basiccreation time
long SimpleName SimpleType CastExpression SimpleName value
file time SimpleName MethodInvocation SimpleName from millis
file time SimpleName MethodInvocation CastExpression SimpleType SimpleName long
file time SimpleName MethodInvocation CastExpression SimpleName value
from millis SimpleName MethodInvocation CastExpression SimpleType SimpleName long
from millis SimpleName MethodInvocation CastExpression SimpleName value
value SimpleName Assignment MethodInvocation SimpleName file time
value SimpleName Assignment MethodInvocation SimpleName from millis
value SimpleName Assignment MethodInvocation CastExpression SimpleName value
name SimpleName Assignment StringLiteral basiclast modified time
long SimpleName SimpleType CastExpression SimpleName value
file time SimpleName MethodInvocation SimpleName from millis
file time SimpleName MethodInvocation CastExpression SimpleType SimpleName long
file time SimpleName MethodInvocation CastExpression SimpleName value
from millis SimpleName MethodInvocation CastExpression SimpleType SimpleName long
from millis SimpleName MethodInvocation CastExpression SimpleName value
value SimpleName Assignment MethodInvocation SimpleName file time
value SimpleName Assignment MethodInvocation SimpleName from millis
value SimpleName Assignment MethodInvocation CastExpression SimpleName value
name SimpleName Assignment StringLiteral basiclast access time
long SimpleName SimpleType CastExpression SimpleName value
file time SimpleName MethodInvocation SimpleName from millis
file time SimpleName MethodInvocation CastExpression SimpleType SimpleName long
file time SimpleName MethodInvocation CastExpression SimpleName value
from millis SimpleName MethodInvocation CastExpression SimpleType SimpleName long
from millis SimpleName MethodInvocation CastExpression SimpleName value
value SimpleName Assignment MethodInvocation SimpleName file time
value SimpleName Assignment MethodInvocation SimpleName from millis
value SimpleName Assignment MethodInvocation CastExpression SimpleName value
attribute SimpleName SwitchStatement SwitchCase SimpleName size
attribute SimpleName SwitchStatement Block VariableDeclarationStatement PrimitiveType long
attribute SimpleName SwitchStatement SwitchCase SimpleName uid
attribute SimpleName SwitchStatement ExpressionStatement Assignment SimpleName name
attribute SimpleName SwitchStatement ExpressionStatement Assignment StringLiteral unixuid
size SimpleName SwitchCase SwitchStatement SwitchCase SimpleName uid
size SimpleName SwitchCase SwitchStatement SwitchCase SimpleName gid
uid SimpleName SwitchCase SwitchStatement SwitchCase SimpleName gid
gid SimpleName SwitchCase SwitchStatement SwitchCase SimpleName owner
owner SimpleName SwitchCase SwitchStatement SwitchCase SimpleName group
group SimpleName SwitchCase SwitchStatement SwitchCase SimpleName permissions
permissions SimpleName SwitchCase SwitchStatement SwitchCase SimpleName creation time
creation time SimpleName SwitchCase SwitchStatement SwitchCase SimpleName last modified time
last modified time SimpleName SwitchCase SwitchStatement SwitchCase SimpleName last access time
name SimpleName InfixExpression InfixExpression InfixExpression SimpleName value
files SimpleName MethodInvocation SimpleName set attribute
files SimpleName MethodInvocation SimpleName file
files SimpleName MethodInvocation SimpleName name
files SimpleName MethodInvocation SimpleName value
files SimpleName MethodInvocation QualifiedName link optionnofollow links
set attribute SimpleName MethodInvocation SimpleName file
set attribute SimpleName MethodInvocation SimpleName name
set attribute SimpleName MethodInvocation SimpleName value
set attribute SimpleName MethodInvocation QualifiedName link optionnofollow links
file SimpleName MethodInvocation SimpleName name
file SimpleName MethodInvocation SimpleName value
file SimpleName MethodInvocation QualifiedName link optionnofollow links
name SimpleName MethodInvocation SimpleName value
name SimpleName MethodInvocation QualifiedName link optionnofollow links
value SimpleName MethodInvocation QualifiedName link optionnofollow links
unsupported operation exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
unsupported SimpleName MethodInvocation SimpleName add
unsupported SimpleName MethodInvocation SimpleName attribute
add SimpleName MethodInvocation SimpleName attribute
attribute SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName attributes
attribute SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName key set
handle unsupported attributes SimpleName MethodInvocation SimpleName unsupported
protected Modifier MethodDeclaration PrimitiveType void
protected Modifier MethodDeclaration SimpleName set attributes
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName path
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleName file
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleName attributes
protected Modifier MethodDeclaration SimpleType SimpleName io exception
void PrimitiveType MethodDeclaration SimpleName set attributes
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName path
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName file
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName attributes
void PrimitiveType MethodDeclaration SimpleType SimpleName io exception
set attributes SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName path
set attributes SimpleName MethodDeclaration SingleVariableDeclaration SimpleName file
set attributes SimpleName MethodDeclaration SingleVariableDeclaration SimpleName attributes
set attributes SimpleName MethodDeclaration SimpleType SimpleName io exception
file SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName attributes
file SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
attributes SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier protected
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName set attributes
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName file
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName attributes
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
test SimpleName TypeDeclaration MethodDeclaration Modifier protected
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName set attributes
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName file
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName attributes
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName io exception