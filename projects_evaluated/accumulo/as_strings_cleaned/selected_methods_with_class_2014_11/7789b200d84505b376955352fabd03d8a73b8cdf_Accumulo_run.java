proc file SimpleName VariableDeclarationFragment StringLiteral procsysvmswappiness
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName proc file
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment StringLiteral procsysvmswappiness
file SimpleName SimpleType ClassInstanceCreation SimpleName proc file
swappiness SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName file
swappiness SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName proc file
file SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName swappiness
swappiness SimpleName MethodInvocation SimpleName exists
swappiness SimpleName MethodInvocation SimpleName can read
swappiness SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName swappiness
swappiness SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName can read
exists SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName swappiness
exists SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName can read
file input stream SimpleName SimpleType ClassInstanceCreation SimpleName proc file
is SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName file input stream
is SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName proc file
input stream SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName is
byte PrimitiveType ArrayType ArrayCreation NumberLiteral empty
buffer SimpleName VariableDeclarationFragment ArrayCreation ArrayType PrimitiveType byte
buffer SimpleName VariableDeclarationFragment ArrayCreation NumberLiteral empty
byte PrimitiveType ArrayType VariableDeclarationStatement VariableDeclarationFragment SimpleName buffer
is SimpleName MethodInvocation SimpleName read
is SimpleName MethodInvocation SimpleName buffer
read SimpleName MethodInvocation SimpleName buffer
bytes SimpleName VariableDeclarationFragment MethodInvocation SimpleName is
bytes SimpleName VariableDeclarationFragment MethodInvocation SimpleName read
bytes SimpleName VariableDeclarationFragment MethodInvocation SimpleName buffer
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName bytes
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName is
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName read
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName buffer
string SimpleName SimpleType ClassInstanceCreation SimpleName buffer
string SimpleName SimpleType ClassInstanceCreation NumberLiteral empty
string SimpleName SimpleType ClassInstanceCreation SimpleName bytes
string SimpleName SimpleType ClassInstanceCreation SimpleName utf
buffer SimpleName ClassInstanceCreation NumberLiteral empty
buffer SimpleName ClassInstanceCreation SimpleName bytes
buffer SimpleName ClassInstanceCreation SimpleName utf
empty NumberLiteral ClassInstanceCreation SimpleName bytes
empty NumberLiteral ClassInstanceCreation SimpleName utf
bytes SimpleName ClassInstanceCreation SimpleName utf
setting SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName string
setting SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName buffer
setting SimpleName VariableDeclarationFragment ClassInstanceCreation NumberLiteral empty
setting SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName bytes
setting SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName utf
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName setting
setting SimpleName MethodInvocation SimpleName trim
setting SimpleName Assignment MethodInvocation SimpleName setting
setting SimpleName Assignment MethodInvocation SimpleName trim
bytes SimpleName InfixExpression NumberLiteral empty
integer SimpleName MethodInvocation SimpleName parse int
integer SimpleName MethodInvocation SimpleName setting
parse int SimpleName MethodInvocation SimpleName setting
integer SimpleName MethodInvocation InfixExpression NumberLiteral empty
parse int SimpleName MethodInvocation InfixExpression NumberLiteral empty
setting SimpleName MethodInvocation InfixExpression NumberLiteral empty
bytes SimpleName InfixExpression InfixExpression InfixExpression NumberLiteral empty
empty NumberLiteral InfixExpression InfixExpression InfixExpression NumberLiteral empty
system swappiness setting is greater than ten ( StringLiteral InfixExpression SimpleName setting
system swappiness setting is greater than ten ( StringLiteral InfixExpression StringLiteral ) which can cause timesensitive operations to be delayed
system swappiness setting is greater than ten ( StringLiteral InfixExpression StringLiteral accumulo is time sensitive because it needs to maintain distributed lock agreement
setting SimpleName InfixExpression StringLiteral ) which can cause timesensitive operations to be delayed
setting SimpleName InfixExpression StringLiteral accumulo is time sensitive because it needs to maintain distributed lock agreement
) which can cause timesensitive operations to be delayed StringLiteral InfixExpression StringLiteral accumulo is time sensitive because it needs to maintain distributed lock agreement
log SimpleName MethodInvocation SimpleName warn
log SimpleName MethodInvocation InfixExpression StringLiteral system swappiness setting is greater than ten (
log SimpleName MethodInvocation InfixExpression SimpleName setting
log SimpleName MethodInvocation InfixExpression StringLiteral ) which can cause timesensitive operations to be delayed
log SimpleName MethodInvocation InfixExpression StringLiteral accumulo is time sensitive because it needs to maintain distributed lock agreement
warn SimpleName MethodInvocation InfixExpression StringLiteral system swappiness setting is greater than ten (
warn SimpleName MethodInvocation InfixExpression SimpleName setting
warn SimpleName MethodInvocation InfixExpression StringLiteral ) which can cause timesensitive operations to be delayed
warn SimpleName MethodInvocation InfixExpression StringLiteral accumulo is time sensitive because it needs to maintain distributed lock agreement
is SimpleName MethodInvocation SimpleName close
throwable SimpleName SimpleType SingleVariableDeclaration SimpleName t
log SimpleName MethodInvocation SimpleName error
log SimpleName MethodInvocation SimpleName t
log SimpleName MethodInvocation SimpleName t
error SimpleName MethodInvocation SimpleName t
error SimpleName MethodInvocation SimpleName t
t SimpleName MethodInvocation SimpleName t
override SimpleName MarkerAnnotation MethodDeclaration Modifier public
override SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
override SimpleName MarkerAnnotation MethodDeclaration SimpleName run
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName run
void PrimitiveType MethodDeclaration SimpleName run
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName override
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName run
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName override
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName run
