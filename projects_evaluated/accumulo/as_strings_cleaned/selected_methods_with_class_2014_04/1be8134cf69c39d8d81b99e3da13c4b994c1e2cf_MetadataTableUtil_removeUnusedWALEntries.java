key extent SimpleName SimpleType SingleVariableDeclaration SimpleName extent
list SimpleName SimpleType ParameterizedType SimpleType SimpleName log entry
list SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName log entries
log entry SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName log entries
zoo lock SimpleName SimpleType SingleVariableDeclaration SimpleName zoo lock
extent SimpleName MethodInvocation SimpleName is root tablet
log entry SimpleName SimpleType SingleVariableDeclaration SimpleName entry
root SimpleName VariableDeclarationFragment MethodInvocation SimpleName get zookeeper log location
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName root
zoo reader writer SimpleName MethodInvocation SimpleName get instance
zoo SimpleName VariableDeclarationFragment MethodInvocation SimpleName zoo reader writer
zoo SimpleName VariableDeclarationFragment MethodInvocation SimpleName get instance
i zoo reader writer SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName zoo
zoo lock SimpleName MethodInvocation SimpleName get lock id
zoo SimpleName MethodInvocation SimpleName is lock held
zoo SimpleName MethodInvocation MethodInvocation SimpleName zoo lock
zoo SimpleName MethodInvocation MethodInvocation SimpleName get lock id
is lock held SimpleName MethodInvocation MethodInvocation SimpleName zoo lock
is lock held SimpleName MethodInvocation MethodInvocation SimpleName get lock id
entryfilename QualifiedName MethodInvocation SimpleName split
entryfilename QualifiedName MethodInvocation StringLiteral /
split SimpleName MethodInvocation StringLiteral /
parts SimpleName VariableDeclarationFragment MethodInvocation QualifiedName entryfilename
parts SimpleName VariableDeclarationFragment MethodInvocation SimpleName split
parts SimpleName VariableDeclarationFragment MethodInvocation StringLiteral /
partslength QualifiedName InfixExpression NumberLiteral empty
parts SimpleName ArrayAccess InfixExpression QualifiedName partslength
parts SimpleName ArrayAccess InfixExpression NumberLiteral empty
root SimpleName InfixExpression StringLiteral /
root SimpleName InfixExpression ArrayAccess SimpleName parts
root SimpleName InfixExpression ArrayAccess InfixExpression QualifiedName partslength
root SimpleName InfixExpression ArrayAccess InfixExpression NumberLiteral empty
/ StringLiteral InfixExpression ArrayAccess SimpleName parts
/ StringLiteral InfixExpression ArrayAccess InfixExpression QualifiedName partslength
/ StringLiteral InfixExpression ArrayAccess InfixExpression NumberLiteral empty
zoo SimpleName MethodInvocation SimpleName recursive delete
zoo SimpleName MethodInvocation InfixExpression SimpleName root
zoo SimpleName MethodInvocation InfixExpression StringLiteral /
zoo SimpleName MethodInvocation InfixExpression ArrayAccess SimpleName parts
zoo SimpleName MethodInvocation QualifiedName node missing policyskip
recursive delete SimpleName MethodInvocation InfixExpression SimpleName root
recursive delete SimpleName MethodInvocation InfixExpression StringLiteral /
recursive delete SimpleName MethodInvocation InfixExpression ArrayAccess SimpleName parts
recursive delete SimpleName MethodInvocation QualifiedName node missing policyskip
root SimpleName InfixExpression MethodInvocation QualifiedName node missing policyskip
/ StringLiteral InfixExpression MethodInvocation QualifiedName node missing policyskip
parts SimpleName ArrayAccess InfixExpression MethodInvocation QualifiedName node missing policyskip
exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
log SimpleName MethodInvocation SimpleName error
log SimpleName MethodInvocation SimpleName e
log SimpleName MethodInvocation SimpleName e
error SimpleName MethodInvocation SimpleName e
error SimpleName MethodInvocation SimpleName e
e SimpleName MethodInvocation SimpleName e
util wait thread SimpleName MethodInvocation SimpleName sleep
util wait thread SimpleName MethodInvocation NumberLiteral empty
sleep SimpleName MethodInvocation NumberLiteral empty
log entry SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName log entries
entry SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName log entries
log entries SimpleName EnhancedForStatement Block WhileStatement BooleanLiteral true
extent SimpleName MethodInvocation SimpleName get metadata entry
mutation SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName extent
mutation SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get metadata entry
m SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName mutation
m SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName extent
m SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName get metadata entry
mutation SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName m
log entry SimpleName SimpleType SingleVariableDeclaration SimpleName entry
entry SimpleName MethodInvocation SimpleName get name
text SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName entry
text SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get name
m SimpleName MethodInvocation SimpleName put delete
m SimpleName MethodInvocation QualifiedName log column familyname
m SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName text
m SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName entry
m SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get name
put delete SimpleName MethodInvocation QualifiedName log column familyname
put delete SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName text
put delete SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName entry
put delete SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get name
log column familyname QualifiedName MethodInvocation ClassInstanceCreation SimpleType SimpleName text
log column familyname QualifiedName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName entry
log column familyname QualifiedName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get name
log entry SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName log entries
entry SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName log entries
system credentials SimpleName MethodInvocation SimpleName get
update SimpleName MethodInvocation MethodInvocation SimpleName system credentials
update SimpleName MethodInvocation MethodInvocation SimpleName get
update SimpleName MethodInvocation SimpleName zoo lock
update SimpleName MethodInvocation SimpleName m
update SimpleName MethodInvocation SimpleName extent
system credentials SimpleName MethodInvocation MethodInvocation SimpleName zoo lock
get SimpleName MethodInvocation MethodInvocation SimpleName zoo lock
system credentials SimpleName MethodInvocation MethodInvocation SimpleName m
get SimpleName MethodInvocation MethodInvocation SimpleName m
system credentials SimpleName MethodInvocation MethodInvocation SimpleName extent
get SimpleName MethodInvocation MethodInvocation SimpleName extent
zoo lock SimpleName MethodInvocation SimpleName m
zoo lock SimpleName MethodInvocation SimpleName extent
m SimpleName MethodInvocation SimpleName extent
public Modifier MethodDeclaration Modifier static
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName remove unused wal entries
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName key extent
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName extent
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName log entries
static Modifier MethodDeclaration PrimitiveType void
static Modifier MethodDeclaration SimpleName remove unused wal entries
static Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName key extent
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName extent
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName log entries
static Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName zoo lock
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName zoo lock
void PrimitiveType MethodDeclaration SimpleName remove unused wal entries
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName key extent
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName extent
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName log entries
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName zoo lock
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName zoo lock
remove unused wal entries SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName key extent
remove unused wal entries SimpleName MethodDeclaration SingleVariableDeclaration SimpleName extent
remove unused wal entries SimpleName MethodDeclaration SingleVariableDeclaration SimpleName log entries
remove unused wal entries SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName zoo lock
remove unused wal entries SimpleName MethodDeclaration SingleVariableDeclaration SimpleName zoo lock
extent SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName log entries
extent SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName zoo lock
log entries SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName zoo lock
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration Modifier static
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName remove unused wal entries
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName extent
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName log entries
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName zoo lock
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration Modifier static
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName remove unused wal entries
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName extent
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName log entries
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName zoo lock
