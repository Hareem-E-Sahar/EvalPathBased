path SimpleName SimpleType SingleVariableDeclaration SimpleName path
string SimpleName SimpleType SingleVariableDeclaration SimpleName attribute
object SimpleName SimpleType SingleVariableDeclaration SimpleName value
link option SimpleName SimpleType SingleVariableDeclaration SimpleName options
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName view
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName attr
attribute SimpleName MethodInvocation SimpleName index of
attribute SimpleName MethodInvocation CharacterLiteral :
index of SimpleName MethodInvocation CharacterLiteral :
i SimpleName VariableDeclarationFragment MethodInvocation SimpleName attribute
i SimpleName VariableDeclarationFragment MethodInvocation SimpleName index of
i SimpleName VariableDeclarationFragment MethodInvocation CharacterLiteral :
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName attribute
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName index of
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation CharacterLiteral :
i SimpleName InfixExpression PrefixExpression NumberLiteral empty
view SimpleName Assignment StringLiteral basic
attr SimpleName Assignment SimpleName attribute
attribute SimpleName MethodInvocation SimpleName substring
attribute SimpleName MethodInvocation NumberLiteral empty
attribute SimpleName MethodInvocation PostfixExpression SimpleName i
substring SimpleName MethodInvocation NumberLiteral empty
substring SimpleName MethodInvocation PostfixExpression SimpleName i
empty NumberLiteral MethodInvocation PostfixExpression SimpleName i
view SimpleName Assignment MethodInvocation SimpleName attribute
view SimpleName Assignment MethodInvocation SimpleName substring
view SimpleName Assignment MethodInvocation NumberLiteral empty
view SimpleName Assignment MethodInvocation PostfixExpression SimpleName i
attribute SimpleName MethodInvocation SimpleName substring
attribute SimpleName MethodInvocation SimpleName i
substring SimpleName MethodInvocation SimpleName i
attr SimpleName Assignment MethodInvocation SimpleName attribute
attr SimpleName Assignment MethodInvocation SimpleName substring
attr SimpleName Assignment MethodInvocation SimpleName i
to sftp path SimpleName MethodInvocation SimpleName path
p SimpleName VariableDeclarationFragment MethodInvocation SimpleName to sftp path
p SimpleName VariableDeclarationFragment MethodInvocation SimpleName path
sftp path SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName p
p SimpleName MethodInvocation SimpleName get file system
p SimpleName MethodInvocation MethodInvocation SimpleName supported file attribute views
get file system SimpleName MethodInvocation MethodInvocation SimpleName supported file attribute views
p SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName contains
get file system SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName contains
supported file attribute views SimpleName MethodInvocation MethodInvocation SimpleName contains
p SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName view
get file system SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName view
supported file attribute views SimpleName MethodInvocation MethodInvocation SimpleName view
contains SimpleName MethodInvocation SimpleName view
attributes SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType QualifiedName sftp clientattributes
sftp clientattributes QualifiedName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName attributes
file time SimpleName SimpleType CastExpression SimpleName value
value SimpleName CastExpression ParenthesizedExpression MethodInvocation SimpleName to
value SimpleName CastExpression ParenthesizedExpression MethodInvocation QualifiedName time unitseconds
to SimpleName MethodInvocation QualifiedName time unitseconds
int PrimitiveType CastExpression MethodInvocation SimpleName to
int PrimitiveType CastExpression MethodInvocation QualifiedName time unitseconds
attributesmtime QualifiedName Assignment CastExpression PrimitiveType int
attributesmtime QualifiedName Assignment CastExpression MethodInvocation SimpleName to
attributesmtime QualifiedName Assignment CastExpression MethodInvocation QualifiedName time unitseconds
file time SimpleName SimpleType CastExpression SimpleName value
value SimpleName CastExpression ParenthesizedExpression MethodInvocation SimpleName to
value SimpleName CastExpression ParenthesizedExpression MethodInvocation QualifiedName time unitseconds
to SimpleName MethodInvocation QualifiedName time unitseconds
int PrimitiveType CastExpression MethodInvocation SimpleName to
int PrimitiveType CastExpression MethodInvocation QualifiedName time unitseconds
attributesatime QualifiedName Assignment CastExpression PrimitiveType int
attributesatime QualifiedName Assignment CastExpression MethodInvocation SimpleName to
attributesatime QualifiedName Assignment CastExpression MethodInvocation QualifiedName time unitseconds
long PrimitiveType CastExpression SimpleName value
attributessize QualifiedName Assignment CastExpression PrimitiveType long
attributessize QualifiedName Assignment CastExpression SimpleName value
illegal argument exception SimpleName SimpleType ClassInstanceCreation SimpleName attr
illegal argument exception SimpleName SimpleType ClassInstanceCreation SimpleName attr
attr SimpleName SwitchStatement SwitchCase StringLiteral last modified time
attr SimpleName SwitchStatement ExpressionStatement Assignment QualifiedName attributesmtime
attr SimpleName SwitchStatement SwitchCase StringLiteral last access time
attr SimpleName SwitchStatement ExpressionStatement Assignment QualifiedName attributesatime
last modified time StringLiteral SwitchCase SwitchStatement SwitchCase StringLiteral last access time
last access time StringLiteral SwitchCase SwitchStatement SwitchCase StringLiteral size
size StringLiteral SwitchCase SwitchStatement SwitchCase StringLiteral owner
size StringLiteral SwitchCase SwitchStatement SwitchCase StringLiteral permissions
size StringLiteral SwitchCase SwitchStatement SwitchCase StringLiteral group
owner StringLiteral SwitchCase SwitchStatement SwitchCase StringLiteral permissions
owner StringLiteral SwitchCase SwitchStatement SwitchCase StringLiteral group
owner StringLiteral SwitchCase SwitchStatement SwitchCase StringLiteral creation time
owner StringLiteral SwitchCase SwitchStatement SwitchCase StringLiteral is regular file
permissions StringLiteral SwitchCase SwitchStatement SwitchCase StringLiteral group
permissions StringLiteral SwitchCase SwitchStatement SwitchCase StringLiteral creation time
permissions StringLiteral SwitchCase SwitchStatement SwitchCase StringLiteral is regular file
permissions StringLiteral SwitchCase SwitchStatement SwitchCase StringLiteral is directory
group StringLiteral SwitchCase SwitchStatement SwitchCase StringLiteral creation time
group StringLiteral SwitchCase SwitchStatement SwitchCase StringLiteral is regular file
group StringLiteral SwitchCase SwitchStatement SwitchCase StringLiteral is directory
group StringLiteral SwitchCase SwitchStatement SwitchCase StringLiteral is symbolic link
creation time StringLiteral SwitchCase SwitchStatement SwitchCase StringLiteral is regular file
creation time StringLiteral SwitchCase SwitchStatement SwitchCase StringLiteral is directory
creation time StringLiteral SwitchCase SwitchStatement SwitchCase StringLiteral is symbolic link
creation time StringLiteral SwitchCase SwitchStatement SwitchCase StringLiteral is other
creation time StringLiteral SwitchCase SwitchStatement SwitchCase StringLiteral file key
is regular file StringLiteral SwitchCase SwitchStatement SwitchCase StringLiteral is directory
is regular file StringLiteral SwitchCase SwitchStatement SwitchCase StringLiteral is symbolic link
is regular file StringLiteral SwitchCase SwitchStatement SwitchCase StringLiteral is other
is regular file StringLiteral SwitchCase SwitchStatement SwitchCase StringLiteral file key
is directory StringLiteral SwitchCase SwitchStatement SwitchCase StringLiteral is symbolic link
is directory StringLiteral SwitchCase SwitchStatement SwitchCase StringLiteral is other
is directory StringLiteral SwitchCase SwitchStatement SwitchCase StringLiteral file key
is symbolic link StringLiteral SwitchCase SwitchStatement SwitchCase StringLiteral is other
is symbolic link StringLiteral SwitchCase SwitchStatement SwitchCase StringLiteral file key
is other StringLiteral SwitchCase SwitchStatement SwitchCase StringLiteral file key
p SimpleName MethodInvocation SimpleName get file system
p SimpleName MethodInvocation MethodInvocation SimpleName get client
get file system SimpleName MethodInvocation MethodInvocation SimpleName get client
client SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName p
client SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get file system
client SimpleName VariableDeclarationFragment MethodInvocation SimpleName get client
sftp client SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName client
p SimpleName MethodInvocation SimpleName to string
client SimpleName MethodInvocation SimpleName set stat
client SimpleName MethodInvocation MethodInvocation SimpleName p
client SimpleName MethodInvocation MethodInvocation SimpleName to string
client SimpleName MethodInvocation SimpleName attributes
set stat SimpleName MethodInvocation MethodInvocation SimpleName p
set stat SimpleName MethodInvocation MethodInvocation SimpleName to string
set stat SimpleName MethodInvocation SimpleName attributes
p SimpleName MethodInvocation MethodInvocation SimpleName attributes
to string SimpleName MethodInvocation MethodInvocation SimpleName attributes
int PrimitiveType VariableDeclarationStatement Block SwitchStatement SimpleName attr
override SimpleName MarkerAnnotation MethodDeclaration Modifier public
override SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
override SimpleName MarkerAnnotation MethodDeclaration SimpleName set attribute
override SimpleName MarkerAnnotation MethodDeclaration SingleVariableDeclaration SimpleName path
override SimpleName MarkerAnnotation MethodDeclaration SingleVariableDeclaration SimpleName attribute
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName set attribute
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName path
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName path
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName attribute
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName object
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName value
void PrimitiveType MethodDeclaration SimpleName set attribute
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName path
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName path
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName attribute
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName object
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName value
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName link option
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName options
set attribute SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName path
set attribute SimpleName MethodDeclaration SingleVariableDeclaration SimpleName path
set attribute SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
set attribute SimpleName MethodDeclaration SingleVariableDeclaration SimpleName attribute
set attribute SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName object
set attribute SimpleName MethodDeclaration SingleVariableDeclaration SimpleName value
set attribute SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName link option
set attribute SimpleName MethodDeclaration SingleVariableDeclaration SimpleName options
set attribute SimpleName MethodDeclaration SimpleType SimpleName io exception
path SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName attribute
path SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName value
path SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName options
path SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
attribute SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName value
attribute SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName options
attribute SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
value SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName options
value SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
options SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName override
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName set attribute
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName path
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName attribute
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName value
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName options
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName override
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName set attribute
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName path
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName attribute
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName value
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName options
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
