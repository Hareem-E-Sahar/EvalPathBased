application security enforcer SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get class
application security enforcer SimpleName SimpleType ClassInstanceCreation StringLiteral orgapachebatikappssvgbrowserresourcessvgbrowserpolicy
get class SimpleName MethodInvocation ClassInstanceCreation StringLiteral orgapachebatikappssvgbrowserresourcessvgbrowserpolicy
ase SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName application security enforcer
ase SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName get class
ase SimpleName VariableDeclarationFragment ClassInstanceCreation StringLiteral orgapachebatikappssvgbrowserresourcessvgbrowserpolicy
application security enforcer SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName ase
ase SimpleName MethodInvocation SimpleName enforce security
ase SimpleName MethodInvocation BooleanLiteral true
enforce security SimpleName MethodInvocation BooleanLiteral true
policy SimpleName MethodInvocation SimpleName get policy
policy SimpleName VariableDeclarationFragment MethodInvocation SimpleName policy
policy SimpleName VariableDeclarationFragment MethodInvocation SimpleName get policy
policy SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName policy
file SimpleName SimpleType ClassInstanceCreation StringLiteral classes
classes StringLiteral ClassInstanceCreation ParenthesizedExpression MethodInvocation SimpleName to url
classes url SimpleName VariableDeclarationFragment MethodInvocation SimpleName to url
url SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName classes url
code source SimpleName SimpleType ClassInstanceCreation SimpleName classes url
cs SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName code source
cs SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName classes url
code source SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName cs
policy SimpleName MethodInvocation SimpleName get permissions
policy SimpleName MethodInvocation SimpleName cs
get permissions SimpleName MethodInvocation SimpleName cs
permissions orig SimpleName VariableDeclarationFragment MethodInvocation SimpleName policy
permissions orig SimpleName VariableDeclarationFragment MethodInvocation SimpleName get permissions
permissions orig SimpleName VariableDeclarationFragment MethodInvocation SimpleName cs
permission collection SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName permissions orig
permissions SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName permissions
permissions SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName permissions
permissions orig SimpleName MethodInvocation SimpleName elements
iter SimpleName VariableDeclarationFragment MethodInvocation SimpleName permissions orig
iter SimpleName VariableDeclarationFragment MethodInvocation SimpleName elements
enumeration SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName iter
iter SimpleName MethodInvocation SimpleName has more elements
iter SimpleName MethodInvocation SimpleName next element
permission SimpleName SimpleType CastExpression MethodInvocation SimpleName iter
permission SimpleName SimpleType CastExpression MethodInvocation SimpleName next element
p SimpleName VariableDeclarationFragment CastExpression SimpleType SimpleName permission
p SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName iter
p SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName next element
permission SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName p
p SimpleName InstanceofExpression SimpleType SimpleName runtime permission
p SimpleName InstanceofExpression SimpleType QualifiedName javasecurityall permission
permissions SimpleName MethodInvocation SimpleName add
permissions SimpleName MethodInvocation SimpleName p
add SimpleName MethodInvocation SimpleName p
p SimpleName MethodInvocation SimpleName get name
create class loader StringLiteral MethodInvocation SimpleName equals
create class loader StringLiteral MethodInvocation MethodInvocation SimpleName p
create class loader StringLiteral MethodInvocation MethodInvocation SimpleName get name
equals SimpleName MethodInvocation MethodInvocation SimpleName p
equals SimpleName MethodInvocation MethodInvocation SimpleName get name
permissions SimpleName MethodInvocation SimpleName add
permissions SimpleName MethodInvocation SimpleName p
add SimpleName MethodInvocation SimpleName p
file permission SimpleName SimpleType ClassInstanceCreation SimpleName file name
file permission SimpleName SimpleType ClassInstanceCreation StringLiteral read
file name SimpleName ClassInstanceCreation StringLiteral read
permissions SimpleName MethodInvocation SimpleName add
permissions SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName file permission
permissions SimpleName MethodInvocation ClassInstanceCreation SimpleName file name
permissions SimpleName MethodInvocation ClassInstanceCreation StringLiteral read
add SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName file permission
add SimpleName MethodInvocation ClassInstanceCreation SimpleName file name
add SimpleName MethodInvocation ClassInstanceCreation StringLiteral read
runtime permission SimpleName SimpleType ClassInstanceCreation StringLiteral access declared members
permissions SimpleName MethodInvocation SimpleName add
permissions SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName runtime permission
permissions SimpleName MethodInvocation ClassInstanceCreation StringLiteral access declared members
add SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName runtime permission
add SimpleName MethodInvocation ClassInstanceCreation StringLiteral access declared members
protection domain SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName domain
access control context SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName ctx
protection domain SimpleName SimpleType ClassInstanceCreation SimpleName permissions
domain SimpleName Assignment ClassInstanceCreation SimpleType SimpleName protection domain
domain SimpleName Assignment ClassInstanceCreation SimpleName permissions
ctx SimpleName Assignment ClassInstanceCreation SimpleType SimpleName access control context
public Modifier MethodDeclaration SimpleType SimpleName object
public Modifier MethodDeclaration SimpleName run
public Modifier MethodDeclaration SimpleType SimpleName exception
object SimpleName SimpleType MethodDeclaration SimpleName run
object SimpleName SimpleType MethodDeclaration SimpleType SimpleName exception
run SimpleName MethodDeclaration SimpleType SimpleName exception
access controller SimpleName MethodInvocation SimpleName do privileged
access controller SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName privileged exception action
access controller SimpleName MethodInvocation SimpleName ctx
do privileged SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName privileged exception action
do privileged SimpleName MethodInvocation SimpleName ctx
privileged exception action SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName ctx
test report SimpleName SimpleType CastExpression MethodInvocation SimpleName access controller
test report SimpleName SimpleType CastExpression MethodInvocation SimpleName do privileged
test report SimpleName SimpleType CastExpression MethodInvocation SimpleName ctx
privileged action exception SimpleName SimpleType SingleVariableDeclaration SimpleName pae
pae SimpleName MethodInvocation SimpleName get exception
ase SimpleName MethodInvocation SimpleName enforce security
ase SimpleName MethodInvocation BooleanLiteral false
enforce security SimpleName MethodInvocation BooleanLiteral false
public Modifier MethodDeclaration SimpleType SimpleName test report
public Modifier MethodDeclaration SimpleName run impl
public Modifier MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration Block IfStatement SimpleName secure
test report SimpleName SimpleType MethodDeclaration SimpleName run impl
test report SimpleName SimpleType MethodDeclaration SimpleType SimpleName exception
run impl SimpleName MethodDeclaration SimpleType SimpleName exception
run impl SimpleName MethodDeclaration Block IfStatement SimpleName secure
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName test report
public Modifier TypeDeclaration MethodDeclaration SimpleName run impl
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName test report
test SimpleName TypeDeclaration MethodDeclaration SimpleName run impl
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception