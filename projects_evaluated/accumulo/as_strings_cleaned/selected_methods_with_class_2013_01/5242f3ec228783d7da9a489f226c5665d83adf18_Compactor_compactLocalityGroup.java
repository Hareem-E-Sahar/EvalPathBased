string SimpleName SimpleType SingleVariableDeclaration SimpleName lg name
set SimpleName SimpleType ParameterizedType SimpleType SimpleName byte sequence
set SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName column families
byte sequence SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName column families
boolean PrimitiveType SingleVariableDeclaration SimpleName inclusive
file skv writer SimpleName SimpleType SingleVariableDeclaration SimpleName mfw
compaction stats SimpleName SimpleType SingleVariableDeclaration SimpleName maj c stats
array list SimpleName SimpleType ParameterizedType SimpleType SimpleName file skv iterator
array list SimpleName SimpleType ParameterizedType SimpleType SimpleName file skv iterator
files to compact SimpleName MethodInvocation SimpleName size
readers SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName files to compact
readers SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName size
trace SimpleName MethodInvocation SimpleName start
trace SimpleName MethodInvocation StringLiteral compact
start SimpleName MethodInvocation StringLiteral compact
span SimpleName VariableDeclarationFragment MethodInvocation SimpleName trace
span SimpleName VariableDeclarationFragment MethodInvocation SimpleName start
span SimpleName VariableDeclarationFragment MethodInvocation StringLiteral compact
span SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName span
entries compacted SimpleName VariableDeclarationFragment NumberLiteral empty
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName entries compacted
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment NumberLiteral empty
sorted key value iterator SimpleName SimpleType ParameterizedType SimpleType SimpleName key
sorted key value iterator SimpleName SimpleType ParameterizedType SimpleType SimpleName value
key SimpleName SimpleType ParameterizedType SimpleType SimpleName value
open map data files SimpleName MethodInvocation SimpleName lg name
open map data files SimpleName MethodInvocation SimpleName readers
lg name SimpleName MethodInvocation SimpleName readers
iters SimpleName VariableDeclarationFragment MethodInvocation SimpleName open map data files
iters SimpleName VariableDeclarationFragment MethodInvocation SimpleName lg name
iters SimpleName VariableDeclarationFragment MethodInvocation SimpleName readers
imm SimpleName MethodInvocation SimpleName compaction iterator
iters SimpleName MethodInvocation SimpleName add
iters SimpleName MethodInvocation MethodInvocation SimpleName imm
iters SimpleName MethodInvocation MethodInvocation SimpleName compaction iterator
add SimpleName MethodInvocation MethodInvocation SimpleName imm
add SimpleName MethodInvocation MethodInvocation SimpleName compaction iterator
extent SimpleName MethodInvocation SimpleName to data range
multi iterator SimpleName SimpleType ClassInstanceCreation SimpleName iters
multi iterator SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName extent
multi iterator SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName to data range
iters SimpleName ClassInstanceCreation MethodInvocation SimpleName extent
iters SimpleName ClassInstanceCreation MethodInvocation SimpleName to data range
counting iterator SimpleName SimpleType ClassInstanceCreation ClassInstanceCreation SimpleName iters
citr SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName counting iterator
citr SimpleName VariableDeclarationFragment ClassInstanceCreation ClassInstanceCreation SimpleName iters
counting iterator SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName citr
deleting iterator SimpleName SimpleType ClassInstanceCreation SimpleName citr
deleting iterator SimpleName SimpleType ClassInstanceCreation SimpleName propogate deletes
citr SimpleName ClassInstanceCreation SimpleName propogate deletes
del iter SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName deleting iterator
del iter SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName citr
del iter SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName propogate deletes
deleting iterator SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName del iter
column family skipping iterator SimpleName SimpleType ClassInstanceCreation SimpleName del iter
cfsi SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName column family skipping iterator
cfsi SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName del iter
column family skipping iterator SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName cfsi
tablet iterator environment SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName iter env
env SimpleName MethodInvocation SimpleName get iterator scope
env SimpleName MethodInvocation InfixExpression QualifiedName iterator scopemajc
get iterator scope SimpleName MethodInvocation InfixExpression QualifiedName iterator scopemajc
tablet iterator environment SimpleName SimpleType ClassInstanceCreation QualifiedName iterator scopemajc
tablet iterator environment SimpleName SimpleType ClassInstanceCreation PrefixExpression SimpleName propogate deletes
tablet iterator environment SimpleName SimpleType ClassInstanceCreation SimpleName acu table conf
iterator scopemajc QualifiedName ClassInstanceCreation PrefixExpression SimpleName propogate deletes
iterator scopemajc QualifiedName ClassInstanceCreation SimpleName acu table conf
propogate deletes SimpleName PrefixExpression ClassInstanceCreation SimpleName acu table conf
iter env SimpleName Assignment ClassInstanceCreation SimpleType SimpleName tablet iterator environment
iter env SimpleName Assignment ClassInstanceCreation QualifiedName iterator scopemajc
iter env SimpleName Assignment ClassInstanceCreation PrefixExpression SimpleName propogate deletes
iter env SimpleName Assignment ClassInstanceCreation SimpleName acu table conf
env SimpleName MethodInvocation SimpleName get iterator scope
env SimpleName MethodInvocation InfixExpression QualifiedName iterator scopeminc
get iterator scope SimpleName MethodInvocation InfixExpression QualifiedName iterator scopeminc
tablet iterator environment SimpleName SimpleType ClassInstanceCreation QualifiedName iterator scopeminc
tablet iterator environment SimpleName SimpleType ClassInstanceCreation SimpleName acu table conf
iterator scopeminc QualifiedName ClassInstanceCreation SimpleName acu table conf
iter env SimpleName Assignment ClassInstanceCreation SimpleType SimpleName tablet iterator environment
iter env SimpleName Assignment ClassInstanceCreation QualifiedName iterator scopeminc
iter env SimpleName Assignment ClassInstanceCreation SimpleName acu table conf
sorted key value iterator SimpleName SimpleType ParameterizedType SimpleType SimpleName key
sorted key value iterator SimpleName SimpleType ParameterizedType SimpleType SimpleName value
key SimpleName SimpleType ParameterizedType SimpleType SimpleName value
env SimpleName MethodInvocation SimpleName get iterator scope
iterator util SimpleName MethodInvocation SimpleName load iterators
iterator util SimpleName MethodInvocation MethodInvocation SimpleName env
iterator util SimpleName MethodInvocation MethodInvocation SimpleName get iterator scope
iterator util SimpleName MethodInvocation SimpleName cfsi
iterator util SimpleName MethodInvocation SimpleName extent
iterator util SimpleName MethodInvocation SimpleName acu table conf
load iterators SimpleName MethodInvocation MethodInvocation SimpleName env
load iterators SimpleName MethodInvocation MethodInvocation SimpleName get iterator scope
load iterators SimpleName MethodInvocation SimpleName cfsi
load iterators SimpleName MethodInvocation SimpleName extent
load iterators SimpleName MethodInvocation SimpleName acu table conf
load iterators SimpleName MethodInvocation SimpleName iterators
env SimpleName MethodInvocation MethodInvocation SimpleName cfsi
get iterator scope SimpleName MethodInvocation MethodInvocation SimpleName cfsi
env SimpleName MethodInvocation MethodInvocation SimpleName extent
get iterator scope SimpleName MethodInvocation MethodInvocation SimpleName extent
env SimpleName MethodInvocation MethodInvocation SimpleName acu table conf
get iterator scope SimpleName MethodInvocation MethodInvocation SimpleName acu table conf
env SimpleName MethodInvocation MethodInvocation SimpleName iterators
get iterator scope SimpleName MethodInvocation MethodInvocation SimpleName iterators
env SimpleName MethodInvocation MethodInvocation SimpleName iter env
get iterator scope SimpleName MethodInvocation MethodInvocation SimpleName iter env
cfsi SimpleName MethodInvocation SimpleName extent
cfsi SimpleName MethodInvocation SimpleName acu table conf
cfsi SimpleName MethodInvocation SimpleName iterators
cfsi SimpleName MethodInvocation SimpleName iter env
extent SimpleName MethodInvocation SimpleName acu table conf
extent SimpleName MethodInvocation SimpleName iterators
extent SimpleName MethodInvocation SimpleName iter env
acu table conf SimpleName MethodInvocation SimpleName iterators
acu table conf SimpleName MethodInvocation SimpleName iter env
iterators SimpleName MethodInvocation SimpleName iter env
iter env SimpleName MethodInvocation SimpleName get top level iterator
iter env SimpleName MethodInvocation MethodInvocation SimpleName iterator util
iter env SimpleName MethodInvocation MethodInvocation SimpleName load iterators
iter env SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName env
iter env SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get iterator scope
iter env SimpleName MethodInvocation MethodInvocation SimpleName cfsi
iter env SimpleName MethodInvocation MethodInvocation SimpleName extent
iter env SimpleName MethodInvocation MethodInvocation SimpleName acu table conf
iter env SimpleName MethodInvocation MethodInvocation SimpleName iterators
iter env SimpleName MethodInvocation MethodInvocation SimpleName iter env
get top level iterator SimpleName MethodInvocation MethodInvocation SimpleName iterator util
get top level iterator SimpleName MethodInvocation MethodInvocation SimpleName load iterators
get top level iterator SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName env
get top level iterator SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get iterator scope
get top level iterator SimpleName MethodInvocation MethodInvocation SimpleName cfsi
get top level iterator SimpleName MethodInvocation MethodInvocation SimpleName extent
get top level iterator SimpleName MethodInvocation MethodInvocation SimpleName acu table conf
get top level iterator SimpleName MethodInvocation MethodInvocation SimpleName iterators
get top level iterator SimpleName MethodInvocation MethodInvocation SimpleName iter env
itr SimpleName VariableDeclarationFragment MethodInvocation SimpleName iter env
itr SimpleName VariableDeclarationFragment MethodInvocation SimpleName get top level iterator
itr SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName iterator util
itr SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName load iterators
itr SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName cfsi
itr SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName extent
itr SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName acu table conf
itr SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName iterators
itr SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName iter env
extent SimpleName MethodInvocation SimpleName to data range
itr SimpleName MethodInvocation SimpleName seek
itr SimpleName MethodInvocation MethodInvocation SimpleName extent
itr SimpleName MethodInvocation MethodInvocation SimpleName to data range
itr SimpleName MethodInvocation SimpleName column families
itr SimpleName MethodInvocation SimpleName inclusive
seek SimpleName MethodInvocation MethodInvocation SimpleName extent
seek SimpleName MethodInvocation MethodInvocation SimpleName to data range
seek SimpleName MethodInvocation SimpleName column families
seek SimpleName MethodInvocation SimpleName inclusive
extent SimpleName MethodInvocation MethodInvocation SimpleName column families
to data range SimpleName MethodInvocation MethodInvocation SimpleName column families
extent SimpleName MethodInvocation MethodInvocation SimpleName inclusive
to data range SimpleName MethodInvocation MethodInvocation SimpleName inclusive
column families SimpleName MethodInvocation SimpleName inclusive
mfw SimpleName MethodInvocation SimpleName start default locality group
mfw SimpleName MethodInvocation SimpleName start new locality group
mfw SimpleName MethodInvocation SimpleName lg name
mfw SimpleName MethodInvocation SimpleName column families
start new locality group SimpleName MethodInvocation SimpleName lg name
start new locality group SimpleName MethodInvocation SimpleName column families
lg name SimpleName MethodInvocation SimpleName column families
trace SimpleName MethodInvocation SimpleName start
trace SimpleName MethodInvocation StringLiteral write
start SimpleName MethodInvocation StringLiteral write
write SimpleName VariableDeclarationFragment MethodInvocation SimpleName trace
write SimpleName VariableDeclarationFragment MethodInvocation SimpleName start
write SimpleName VariableDeclarationFragment MethodInvocation StringLiteral write
span SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName write
itr SimpleName MethodInvocation SimpleName has top
env SimpleName MethodInvocation SimpleName is compaction enabled
itr SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName env
itr SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName is compaction enabled
has top SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName env
has top SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName is compaction enabled
itr SimpleName MethodInvocation SimpleName get top key
itr SimpleName MethodInvocation SimpleName get top value
mfw SimpleName MethodInvocation SimpleName append
mfw SimpleName MethodInvocation MethodInvocation SimpleName itr
mfw SimpleName MethodInvocation MethodInvocation SimpleName get top key
mfw SimpleName MethodInvocation MethodInvocation SimpleName itr
mfw SimpleName MethodInvocation MethodInvocation SimpleName get top value
append SimpleName MethodInvocation MethodInvocation SimpleName itr
append SimpleName MethodInvocation MethodInvocation SimpleName get top key
append SimpleName MethodInvocation MethodInvocation SimpleName itr
append SimpleName MethodInvocation MethodInvocation SimpleName get top value
itr SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName itr
itr SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get top value
get top key SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName itr
get top key SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get top value
itr SimpleName MethodInvocation SimpleName next
entries compacted SimpleName InfixExpression NumberLiteral empty
entries compacted SimpleName InfixExpression InfixExpression NumberLiteral empty
empty NumberLiteral InfixExpression InfixExpression NumberLiteral empty
entries written SimpleName MethodInvocation SimpleName add and get
entries written SimpleName MethodInvocation NumberLiteral empty
add and get SimpleName MethodInvocation NumberLiteral empty
itr SimpleName MethodInvocation SimpleName has top
env SimpleName MethodInvocation SimpleName is compaction enabled
mfw SimpleName MethodInvocation SimpleName close
io exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
log SimpleName MethodInvocation SimpleName error
log SimpleName MethodInvocation SimpleName e
log SimpleName MethodInvocation SimpleName e
error SimpleName MethodInvocation SimpleName e
error SimpleName MethodInvocation SimpleName e
e SimpleName MethodInvocation SimpleName e
path SimpleName SimpleType ClassInstanceCreation SimpleName output file
fs SimpleName MethodInvocation SimpleName delete
fs SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName path
fs SimpleName MethodInvocation ClassInstanceCreation SimpleName output file
fs SimpleName MethodInvocation BooleanLiteral true
delete SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName path
delete SimpleName MethodInvocation ClassInstanceCreation SimpleName output file
delete SimpleName MethodInvocation BooleanLiteral true
path SimpleName SimpleType ClassInstanceCreation MethodInvocation BooleanLiteral true
output file SimpleName ClassInstanceCreation MethodInvocation BooleanLiteral true
exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
failed to delete canceled compaction output file StringLiteral InfixExpression SimpleName output file
log SimpleName MethodInvocation SimpleName warn
log SimpleName MethodInvocation InfixExpression StringLiteral failed to delete canceled compaction output file
log SimpleName MethodInvocation InfixExpression SimpleName output file
log SimpleName MethodInvocation SimpleName e
warn SimpleName MethodInvocation InfixExpression StringLiteral failed to delete canceled compaction output file
warn SimpleName MethodInvocation InfixExpression SimpleName output file
warn SimpleName MethodInvocation SimpleName e
failed to delete canceled compaction output file StringLiteral InfixExpression MethodInvocation SimpleName e
output file SimpleName InfixExpression MethodInvocation SimpleName e
citr SimpleName MethodInvocation SimpleName get count
compaction stats SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName citr
compaction stats SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get count
compaction stats SimpleName SimpleType ClassInstanceCreation SimpleName entries compacted
citr SimpleName MethodInvocation ClassInstanceCreation SimpleName entries compacted
get count SimpleName MethodInvocation ClassInstanceCreation SimpleName entries compacted
lg majc stats SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName compaction stats
lg majc stats SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName citr
lg majc stats SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName get count
lg majc stats SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName entries compacted
compaction stats SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName lg majc stats
maj c stats SimpleName MethodInvocation SimpleName add
maj c stats SimpleName MethodInvocation SimpleName lg majc stats
add SimpleName MethodInvocation SimpleName lg majc stats
write SimpleName MethodInvocation SimpleName stop
file skv iterator SimpleName SimpleType SingleVariableDeclaration SimpleName reader
reader SimpleName MethodInvocation SimpleName close
throwable SimpleName SimpleType SingleVariableDeclaration SimpleName e
log SimpleName MethodInvocation SimpleName warn
log SimpleName MethodInvocation StringLiteral failed to close map file
log SimpleName MethodInvocation SimpleName e
warn SimpleName MethodInvocation StringLiteral failed to close map file
warn SimpleName MethodInvocation SimpleName e
failed to close map file StringLiteral MethodInvocation SimpleName e
file skv iterator SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName readers
reader SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName readers
span SimpleName MethodInvocation SimpleName stop
private Modifier MethodDeclaration PrimitiveType void
private Modifier MethodDeclaration SimpleName compact locality group
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName lg name
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName column families
private Modifier MethodDeclaration SingleVariableDeclaration PrimitiveType boolean
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName inclusive
void PrimitiveType MethodDeclaration SimpleName compact locality group
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName lg name
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName column families
void PrimitiveType MethodDeclaration SingleVariableDeclaration PrimitiveType boolean
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName inclusive
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName file skv writer
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName mfw
compact locality group SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
compact locality group SimpleName MethodDeclaration SingleVariableDeclaration SimpleName lg name
compact locality group SimpleName MethodDeclaration SingleVariableDeclaration SimpleName column families
compact locality group SimpleName MethodDeclaration SingleVariableDeclaration PrimitiveType boolean
compact locality group SimpleName MethodDeclaration SingleVariableDeclaration SimpleName inclusive
compact locality group SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName file skv writer
compact locality group SimpleName MethodDeclaration SingleVariableDeclaration SimpleName mfw
compact locality group SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName compaction stats
compact locality group SimpleName MethodDeclaration SingleVariableDeclaration SimpleName maj c stats
lg name SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName column families
lg name SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType boolean
lg name SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName inclusive
lg name SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName mfw
lg name SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName maj c stats
lg name SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
column families SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType boolean
column families SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName inclusive
column families SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName mfw
column families SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName maj c stats
column families SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
column families SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName compaction canceled exception
boolean PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName mfw
inclusive SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName mfw
boolean PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName maj c stats
inclusive SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName maj c stats
boolean PrimitiveType SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
inclusive SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
boolean PrimitiveType SingleVariableDeclaration MethodDeclaration SimpleType SimpleName compaction canceled exception
inclusive SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName compaction canceled exception
mfw SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName maj c stats
mfw SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
mfw SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName compaction canceled exception
maj c stats SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
maj c stats SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName compaction canceled exception
io exception SimpleName SimpleType MethodDeclaration SimpleType SimpleName compaction canceled exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName compact locality group
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName lg name
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName column families
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType boolean
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName inclusive
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName mfw
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName maj c stats
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName compaction canceled exception
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName compact locality group
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName lg name
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName column families
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType boolean
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName inclusive
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName mfw
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName maj c stats
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName compaction canceled exception
