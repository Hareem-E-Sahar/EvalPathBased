session SimpleName MethodInvocation SimpleName open channel
session SimpleName MethodInvocation QualifiedName sftp constantssftp subsystem name
open channel SimpleName MethodInvocation QualifiedName sftp constantssftp subsystem name
channel sftp SimpleName SimpleType CastExpression MethodInvocation SimpleName session
channel sftp SimpleName SimpleType CastExpression MethodInvocation SimpleName open channel
channel sftp SimpleName SimpleType CastExpression MethodInvocation QualifiedName sftp constantssftp subsystem name
c SimpleName VariableDeclarationFragment CastExpression SimpleType SimpleName channel sftp
c SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName session
c SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName open channel
c SimpleName VariableDeclarationFragment CastExpression MethodInvocation QualifiedName sftp constantssftp subsystem name
channel sftp SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName c
c SimpleName MethodInvocation SimpleName connect
get class SimpleName MethodInvocation MethodInvocation SimpleName get class loader
ssh client SimpleName SimpleType TypeLiteral MethodInvocation SimpleName get name
get name SimpleName MethodInvocation MethodInvocation SimpleName replace
get name SimpleName MethodInvocation MethodInvocation CharacterLiteral .
get name SimpleName MethodInvocation MethodInvocation CharacterLiteral /
replace SimpleName MethodInvocation CharacterLiteral .
replace SimpleName MethodInvocation CharacterLiteral /
. CharacterLiteral MethodInvocation CharacterLiteral /
get name SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral class
replace SimpleName MethodInvocation InfixExpression StringLiteral class
. CharacterLiteral MethodInvocation InfixExpression StringLiteral class
/ CharacterLiteral MethodInvocation InfixExpression StringLiteral class
get class SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get resource
get class loader SimpleName MethodInvocation MethodInvocation SimpleName get resource
get class loader SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral class
get resource SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName replace
get resource SimpleName MethodInvocation InfixExpression MethodInvocation CharacterLiteral .
get resource SimpleName MethodInvocation InfixExpression MethodInvocation CharacterLiteral /
get resource SimpleName MethodInvocation InfixExpression StringLiteral class
get class loader SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to uri
get resource SimpleName MethodInvocation MethodInvocation SimpleName to uri
class StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName to uri
url SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get resource
url SimpleName VariableDeclarationFragment MethodInvocation SimpleName to uri
uri SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName url
system SimpleName MethodInvocation SimpleName get property
system SimpleName MethodInvocation StringLiteral userdir
get property SimpleName MethodInvocation StringLiteral userdir
file SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName system
file SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get property
file SimpleName SimpleType ClassInstanceCreation MethodInvocation StringLiteral userdir
file SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get absolute file
system SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get absolute file
get property SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get absolute file
userdir StringLiteral MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get absolute file
get absolute file SimpleName MethodInvocation MethodInvocation SimpleName to uri
base SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get absolute file
base SimpleName VariableDeclarationFragment MethodInvocation SimpleName to uri
uri SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName base
base SimpleName MethodInvocation SimpleName relativize
base SimpleName MethodInvocation SimpleName url
relativize SimpleName MethodInvocation SimpleName url
base SimpleName MethodInvocation MethodInvocation SimpleName get path
relativize SimpleName MethodInvocation MethodInvocation SimpleName get path
url SimpleName MethodInvocation MethodInvocation SimpleName get path
file SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get path
file SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get parent
get path SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get parent
get parent SimpleName MethodInvocation InfixExpression StringLiteral /
path SimpleName VariableDeclarationFragment InfixExpression MethodInvocation SimpleName get parent
path SimpleName VariableDeclarationFragment InfixExpression StringLiteral /
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName path
path SimpleName MethodInvocation SimpleName replace
path SimpleName MethodInvocation CharacterLiteral \\
path SimpleName MethodInvocation CharacterLiteral /
replace SimpleName MethodInvocation CharacterLiteral \\
replace SimpleName MethodInvocation CharacterLiteral /
\\ CharacterLiteral MethodInvocation CharacterLiteral /
path SimpleName Assignment MethodInvocation SimpleName path
path SimpleName Assignment MethodInvocation SimpleName replace
path SimpleName Assignment MethodInvocation CharacterLiteral \\
path SimpleName Assignment MethodInvocation CharacterLiteral /
c SimpleName MethodInvocation SimpleName realpath
c SimpleName MethodInvocation SimpleName path
realpath SimpleName MethodInvocation SimpleName path
real SimpleName VariableDeclarationFragment MethodInvocation SimpleName c
real SimpleName VariableDeclarationFragment MethodInvocation SimpleName realpath
real SimpleName VariableDeclarationFragment MethodInvocation SimpleName path
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName real
systemout QualifiedName MethodInvocation SimpleName println
systemout QualifiedName MethodInvocation SimpleName real
println SimpleName MethodInvocation SimpleName real
path SimpleName InfixExpression StringLiteral foobar
c SimpleName MethodInvocation SimpleName realpath
c SimpleName MethodInvocation InfixExpression SimpleName path
c SimpleName MethodInvocation InfixExpression StringLiteral foobar
realpath SimpleName MethodInvocation InfixExpression SimpleName path
realpath SimpleName MethodInvocation InfixExpression StringLiteral foobar
real SimpleName Assignment MethodInvocation SimpleName c
real SimpleName Assignment MethodInvocation SimpleName realpath
real SimpleName Assignment MethodInvocation InfixExpression SimpleName path
real SimpleName Assignment MethodInvocation InfixExpression StringLiteral foobar
systemout QualifiedName MethodInvocation SimpleName println
systemout QualifiedName MethodInvocation SimpleName real
println SimpleName MethodInvocation SimpleName real
fail SimpleName MethodInvocation StringLiteral expected sftp exception
comjcraftjschsftp exception QualifiedName SimpleType SingleVariableDeclaration SimpleName e
c SimpleName MethodInvocation SimpleName disconnect
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test real path
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test real path
public Modifier MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration SimpleName test real path
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
test real path SimpleName MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test real path
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test real path
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
