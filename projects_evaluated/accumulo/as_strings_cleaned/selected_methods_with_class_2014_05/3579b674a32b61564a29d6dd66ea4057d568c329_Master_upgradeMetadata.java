upgrade metadata running SimpleName MethodInvocation SimpleName compare and set
upgrade metadata running SimpleName MethodInvocation BooleanLiteral false
upgrade metadata running SimpleName MethodInvocation BooleanLiteral true
compare and set SimpleName MethodInvocation BooleanLiteral false
compare and set SimpleName MethodInvocation BooleanLiteral true
false BooleanLiteral MethodInvocation BooleanLiteral true
accumulo SimpleName MethodInvocation SimpleName get accumulo persistent version
accumulo SimpleName MethodInvocation SimpleName fs
get accumulo persistent version SimpleName MethodInvocation SimpleName fs
accumulo SimpleName MethodInvocation InfixExpression QualifiedName server constantsprev data version
get accumulo persistent version SimpleName MethodInvocation InfixExpression QualifiedName server constantsprev data version
fs SimpleName MethodInvocation InfixExpression QualifiedName server constantsprev data version
illegal state exception SimpleName SimpleType ClassInstanceCreation StringLiteral we should only attempt to upgrade accumulos metadata table if weve already upgraded zoo keeper please save all logs and file a bug
illegal state exception SimpleName SimpleType ClassInstanceCreation StringLiteral access to fate should not have been initialized prior to the master finishing upgrades please save all logs and file a bug
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation StringLiteral starting to upgrade metadata table
info SimpleName MethodInvocation StringLiteral starting to upgrade metadata table
system credentials SimpleName MethodInvocation SimpleName get
metadata table util SimpleName MethodInvocation SimpleName move meta delete markers
metadata table util SimpleName MethodInvocation SimpleName instance
metadata table util SimpleName MethodInvocation MethodInvocation SimpleName system credentials
metadata table util SimpleName MethodInvocation MethodInvocation SimpleName get
move meta delete markers SimpleName MethodInvocation SimpleName instance
move meta delete markers SimpleName MethodInvocation MethodInvocation SimpleName system credentials
move meta delete markers SimpleName MethodInvocation MethodInvocation SimpleName get
instance SimpleName MethodInvocation MethodInvocation SimpleName system credentials
instance SimpleName MethodInvocation MethodInvocation SimpleName get
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation StringLiteral updating persistent data version
info SimpleName MethodInvocation StringLiteral updating persistent data version
accumulo SimpleName MethodInvocation SimpleName update accumulo version
accumulo SimpleName MethodInvocation SimpleName fs
update accumulo version SimpleName MethodInvocation SimpleName fs
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation StringLiteral upgrade complete
info SimpleName MethodInvocation StringLiteral upgrade complete
wait for metadata upgrade SimpleName MethodInvocation SimpleName count down
exception SimpleName SimpleType SingleVariableDeclaration SimpleName ex
log SimpleName MethodInvocation SimpleName fatal
log SimpleName MethodInvocation StringLiteral error performing upgrade
log SimpleName MethodInvocation SimpleName ex
fatal SimpleName MethodInvocation StringLiteral error performing upgrade
fatal SimpleName MethodInvocation SimpleName ex
error performing upgrade StringLiteral MethodInvocation SimpleName ex
system SimpleName MethodInvocation SimpleName exit
system SimpleName MethodInvocation NumberLiteral empty
exit SimpleName MethodInvocation NumberLiteral empty
override SimpleName MarkerAnnotation MethodDeclaration Modifier public
override SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
override SimpleName MarkerAnnotation MethodDeclaration SimpleName run
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName run
void PrimitiveType MethodDeclaration SimpleName run
upgrade task SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName runnable
runnable SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName upgrade task
thread SimpleName SimpleType ClassInstanceCreation SimpleName upgrade task
thread SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName start
upgrade task SimpleName ClassInstanceCreation MethodInvocation SimpleName start
wait for metadata upgrade SimpleName MethodInvocation SimpleName count down
private Modifier MethodDeclaration PrimitiveType void
private Modifier MethodDeclaration SimpleName upgrade metadata
void PrimitiveType MethodDeclaration SimpleName upgrade metadata
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName upgrade metadata
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName upgrade metadata
