replication target SimpleName SimpleType SingleVariableDeclaration SimpleName target
data input stream SimpleName SimpleType SingleVariableDeclaration SimpleName wal
path SimpleName SimpleType SingleVariableDeclaration SimpleName p
status SimpleName SimpleType SingleVariableDeclaration SimpleName status
long PrimitiveType SingleVariableDeclaration SimpleName size limit
key SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName log file key
log file key SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName key
value SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName log file value
log file value SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName value
set SimpleName SimpleType ParameterizedType SimpleType SimpleName integer
i SimpleName VariableDeclarationFragment NumberLiteral empty
long PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
long PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
status SimpleName MethodInvocation SimpleName get begin
i SimpleName InfixExpression MethodInvocation SimpleName status
i SimpleName InfixExpression MethodInvocation SimpleName get begin
key SimpleName MethodInvocation SimpleName read fields
key SimpleName MethodInvocation SimpleName wal
read fields SimpleName MethodInvocation SimpleName wal
value SimpleName MethodInvocation SimpleName read fields
value SimpleName MethodInvocation SimpleName wal
read fields SimpleName MethodInvocation SimpleName wal
eof exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
log SimpleName MethodInvocation SimpleName warn
log SimpleName MethodInvocation StringLiteral unexpectedly reached the end of file
warn SimpleName MethodInvocation StringLiteral unexpectedly reached the end of file
wal replication SimpleName SimpleType ClassInstanceCreation NumberLiteral empty
wal replication SimpleName SimpleType ClassInstanceCreation NumberLiteral empty
wal replication SimpleName SimpleType ClassInstanceCreation NumberLiteral empty
wal edits SimpleName SimpleType ClassInstanceCreation ClassInstanceCreation NumberLiteral empty
wal edits SimpleName SimpleType ClassInstanceCreation ClassInstanceCreation NumberLiteral empty
wal edits SimpleName SimpleType ClassInstanceCreation ClassInstanceCreation NumberLiteral empty
empty NumberLiteral ClassInstanceCreation NumberLiteral empty
empty NumberLiteral ClassInstanceCreation NumberLiteral empty
empty NumberLiteral ClassInstanceCreation NumberLiteral empty
target SimpleName MethodInvocation SimpleName get source table id
keytablet QualifiedName MethodInvocation SimpleName get table id
keytablet QualifiedName MethodInvocation MethodInvocation SimpleName to string
get table id SimpleName MethodInvocation MethodInvocation SimpleName to string
target SimpleName MethodInvocation MethodInvocation SimpleName equals
get source table id SimpleName MethodInvocation MethodInvocation SimpleName equals
target SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to string
get source table id SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to string
equals SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName keytablet
equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get table id
equals SimpleName MethodInvocation MethodInvocation SimpleName to string
desired tids SimpleName MethodInvocation SimpleName add
desired tids SimpleName MethodInvocation QualifiedName keytid
add SimpleName MethodInvocation QualifiedName keytid
keyevent QualifiedName SwitchStatement SwitchCase SimpleName define tablet
keyevent QualifiedName SwitchStatement IfStatement MethodInvocation SimpleName equals
long PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
long PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
get edits SimpleName MethodInvocation SimpleName wal
get edits SimpleName MethodInvocation SimpleName size limit
get edits SimpleName MethodInvocation SimpleName target
get edits SimpleName MethodInvocation SimpleName status
get edits SimpleName MethodInvocation SimpleName p
wal SimpleName MethodInvocation SimpleName size limit
wal SimpleName MethodInvocation SimpleName target
wal SimpleName MethodInvocation SimpleName status
wal SimpleName MethodInvocation SimpleName p
wal SimpleName MethodInvocation SimpleName desired tids
size limit SimpleName MethodInvocation SimpleName target
size limit SimpleName MethodInvocation SimpleName status
size limit SimpleName MethodInvocation SimpleName p
size limit SimpleName MethodInvocation SimpleName desired tids
target SimpleName MethodInvocation SimpleName status
target SimpleName MethodInvocation SimpleName p
target SimpleName MethodInvocation SimpleName desired tids
status SimpleName MethodInvocation SimpleName p
status SimpleName MethodInvocation SimpleName desired tids
p SimpleName MethodInvocation SimpleName desired tids
repl SimpleName VariableDeclarationFragment MethodInvocation SimpleName get edits
repl SimpleName VariableDeclarationFragment MethodInvocation SimpleName wal
repl SimpleName VariableDeclarationFragment MethodInvocation SimpleName size limit
repl SimpleName VariableDeclarationFragment MethodInvocation SimpleName target
repl SimpleName VariableDeclarationFragment MethodInvocation SimpleName status
repl SimpleName VariableDeclarationFragment MethodInvocation SimpleName p
repl SimpleName VariableDeclarationFragment MethodInvocation SimpleName desired tids
wal replication SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName repl
longmax value QualifiedName InfixExpression QualifiedName replentries consumed
longmax value QualifiedName InfixExpression ParenthesizedExpression ConditionalExpression StringLiteral all
replentries consumed QualifiedName InfixExpression ParenthesizedExpression ConditionalExpression StringLiteral all
longmax value QualifiedName InfixExpression ParenthesizedExpression ConditionalExpression QualifiedName replentries consumed
replentries consumed QualifiedName InfixExpression ParenthesizedExpression ConditionalExpression QualifiedName replentries consumed
all StringLiteral ConditionalExpression QualifiedName replentries consumed
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral read {} wal entries and retained {} bytes of wal entries for replication to peer {}
log SimpleName MethodInvocation ConditionalExpression StringLiteral all
log SimpleName MethodInvocation ConditionalExpression QualifiedName replentries consumed
log SimpleName MethodInvocation QualifiedName replsize in bytes
log SimpleName MethodInvocation SimpleName p
debug SimpleName MethodInvocation StringLiteral read {} wal entries and retained {} bytes of wal entries for replication to peer {}
debug SimpleName MethodInvocation ConditionalExpression StringLiteral all
debug SimpleName MethodInvocation ConditionalExpression QualifiedName replentries consumed
debug SimpleName MethodInvocation QualifiedName replsize in bytes
debug SimpleName MethodInvocation SimpleName p
read {} wal entries and retained {} bytes of wal entries for replication to peer {} StringLiteral MethodInvocation ConditionalExpression StringLiteral all
read {} wal entries and retained {} bytes of wal entries for replication to peer {} StringLiteral MethodInvocation ConditionalExpression QualifiedName replentries consumed
read {} wal entries and retained {} bytes of wal entries for replication to peer {} StringLiteral MethodInvocation QualifiedName replsize in bytes
read {} wal entries and retained {} bytes of wal entries for replication to peer {} StringLiteral MethodInvocation SimpleName p
all StringLiteral ConditionalExpression MethodInvocation QualifiedName replsize in bytes
replentries consumed QualifiedName ConditionalExpression MethodInvocation QualifiedName replsize in bytes
all StringLiteral ConditionalExpression MethodInvocation SimpleName p
replentries consumed QualifiedName ConditionalExpression MethodInvocation SimpleName p
replsize in bytes QualifiedName MethodInvocation SimpleName p
protected Modifier MethodDeclaration SimpleType SimpleName wal replication
protected Modifier MethodDeclaration SimpleName get wal edits
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName replication target
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleName target
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName data input stream
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleName wal
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName path
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleName p
wal replication SimpleName SimpleType MethodDeclaration SimpleName get wal edits
wal replication SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName target
wal replication SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName wal
wal replication SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName p
wal replication SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName status
get wal edits SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName replication target
get wal edits SimpleName MethodDeclaration SingleVariableDeclaration SimpleName target
get wal edits SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName data input stream
get wal edits SimpleName MethodDeclaration SingleVariableDeclaration SimpleName wal
get wal edits SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName path
get wal edits SimpleName MethodDeclaration SingleVariableDeclaration SimpleName p
get wal edits SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName status
get wal edits SimpleName MethodDeclaration SingleVariableDeclaration SimpleName status
get wal edits SimpleName MethodDeclaration SingleVariableDeclaration PrimitiveType long
get wal edits SimpleName MethodDeclaration SingleVariableDeclaration SimpleName size limit
target SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName wal
target SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName p
target SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName status
target SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType long
target SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName size limit
target SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
wal SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName p
wal SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName status
wal SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType long
wal SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName size limit
wal SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
p SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName status
p SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType long
p SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName size limit
p SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
status SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType long
status SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName size limit
status SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
long PrimitiveType SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
size limit SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier protected
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName wal replication
public Modifier TypeDeclaration MethodDeclaration SimpleName get wal edits
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName target
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName wal
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName p
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName status
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType long
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName size limit
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
test SimpleName TypeDeclaration MethodDeclaration Modifier protected
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName wal replication
test SimpleName TypeDeclaration MethodDeclaration SimpleName get wal edits
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName target
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName wal
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName p
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName status
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType long
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName size limit
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
