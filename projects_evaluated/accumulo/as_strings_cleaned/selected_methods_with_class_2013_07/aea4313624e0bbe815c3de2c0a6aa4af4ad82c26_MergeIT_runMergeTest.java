connector SimpleName SimpleType SingleVariableDeclaration SimpleName conn
string SimpleName SimpleType SingleVariableDeclaration SimpleName table
string SimpleName SimpleType ArrayType SingleVariableDeclaration SimpleName splits
string SimpleName SimpleType ArrayType SingleVariableDeclaration SimpleName expected splits
string SimpleName SimpleType ArrayType SingleVariableDeclaration SimpleName inserts
string SimpleName SimpleType SingleVariableDeclaration SimpleName start
string SimpleName SimpleType SingleVariableDeclaration SimpleName end
arrays SimpleName MethodInvocation SimpleName as list
arrays SimpleName MethodInvocation SimpleName splits
as list SimpleName MethodInvocation SimpleName splits
running merge test StringLiteral InfixExpression SimpleName table
running merge test StringLiteral InfixExpression StringLiteral empty
running merge test StringLiteral InfixExpression MethodInvocation SimpleName arrays
running merge test StringLiteral InfixExpression MethodInvocation SimpleName as list
running merge test StringLiteral InfixExpression MethodInvocation SimpleName splits
running merge test StringLiteral InfixExpression StringLiteral empty
running merge test StringLiteral InfixExpression SimpleName start
table SimpleName InfixExpression StringLiteral empty
table SimpleName InfixExpression MethodInvocation SimpleName arrays
table SimpleName InfixExpression MethodInvocation SimpleName as list
table SimpleName InfixExpression MethodInvocation SimpleName splits
table SimpleName InfixExpression StringLiteral empty
table SimpleName InfixExpression SimpleName start
table SimpleName InfixExpression StringLiteral empty
empty StringLiteral InfixExpression MethodInvocation SimpleName arrays
empty StringLiteral InfixExpression MethodInvocation SimpleName as list
empty StringLiteral InfixExpression MethodInvocation SimpleName splits
empty StringLiteral InfixExpression StringLiteral empty
empty StringLiteral InfixExpression SimpleName start
empty StringLiteral InfixExpression StringLiteral empty
empty StringLiteral InfixExpression SimpleName end
arrays SimpleName MethodInvocation InfixExpression StringLiteral empty
as list SimpleName MethodInvocation InfixExpression StringLiteral empty
splits SimpleName MethodInvocation InfixExpression StringLiteral empty
arrays SimpleName MethodInvocation InfixExpression SimpleName start
as list SimpleName MethodInvocation InfixExpression SimpleName start
splits SimpleName MethodInvocation InfixExpression SimpleName start
arrays SimpleName MethodInvocation InfixExpression StringLiteral empty
as list SimpleName MethodInvocation InfixExpression StringLiteral empty
splits SimpleName MethodInvocation InfixExpression StringLiteral empty
arrays SimpleName MethodInvocation InfixExpression SimpleName end
as list SimpleName MethodInvocation InfixExpression SimpleName end
splits SimpleName MethodInvocation InfixExpression SimpleName end
empty StringLiteral InfixExpression SimpleName start
empty StringLiteral InfixExpression StringLiteral empty
empty StringLiteral InfixExpression SimpleName end
start SimpleName InfixExpression StringLiteral empty
start SimpleName InfixExpression SimpleName end
empty StringLiteral InfixExpression SimpleName end
systemout QualifiedName MethodInvocation SimpleName println
systemout QualifiedName MethodInvocation InfixExpression StringLiteral running merge test
systemout QualifiedName MethodInvocation InfixExpression SimpleName table
systemout QualifiedName MethodInvocation InfixExpression StringLiteral empty
systemout QualifiedName MethodInvocation InfixExpression MethodInvocation SimpleName arrays
systemout QualifiedName MethodInvocation InfixExpression MethodInvocation SimpleName as list
systemout QualifiedName MethodInvocation InfixExpression MethodInvocation SimpleName splits
systemout QualifiedName MethodInvocation InfixExpression StringLiteral empty
systemout QualifiedName MethodInvocation InfixExpression SimpleName start
systemout QualifiedName MethodInvocation InfixExpression StringLiteral empty
systemout QualifiedName MethodInvocation InfixExpression SimpleName end
println SimpleName MethodInvocation InfixExpression StringLiteral running merge test
println SimpleName MethodInvocation InfixExpression SimpleName table
println SimpleName MethodInvocation InfixExpression StringLiteral empty
println SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName arrays
println SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName as list
println SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName splits
println SimpleName MethodInvocation InfixExpression StringLiteral empty
println SimpleName MethodInvocation InfixExpression SimpleName start
println SimpleName MethodInvocation InfixExpression StringLiteral empty
println SimpleName MethodInvocation InfixExpression SimpleName end
conn SimpleName MethodInvocation SimpleName table operations
conn SimpleName MethodInvocation MethodInvocation SimpleName create
table operations SimpleName MethodInvocation MethodInvocation SimpleName create
conn SimpleName MethodInvocation MethodInvocation SimpleName table
table operations SimpleName MethodInvocation MethodInvocation SimpleName table
conn SimpleName MethodInvocation MethodInvocation BooleanLiteral true
table operations SimpleName MethodInvocation MethodInvocation BooleanLiteral true
conn SimpleName MethodInvocation MethodInvocation QualifiedName time typelogical
table operations SimpleName MethodInvocation MethodInvocation QualifiedName time typelogical
create SimpleName MethodInvocation SimpleName table
create SimpleName MethodInvocation BooleanLiteral true
create SimpleName MethodInvocation QualifiedName time typelogical
table SimpleName MethodInvocation BooleanLiteral true
table SimpleName MethodInvocation QualifiedName time typelogical
true BooleanLiteral MethodInvocation QualifiedName time typelogical
tree set SimpleName SimpleType ParameterizedType SimpleType SimpleName text
tree set SimpleName SimpleType ParameterizedType SimpleType SimpleName text
string SimpleName SimpleType SingleVariableDeclaration SimpleName split
text SimpleName SimpleType ClassInstanceCreation SimpleName split
split set SimpleName MethodInvocation SimpleName add
split set SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName text
split set SimpleName MethodInvocation ClassInstanceCreation SimpleName split
add SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName text
add SimpleName MethodInvocation ClassInstanceCreation SimpleName split
string SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName splits
split SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName splits
conn SimpleName MethodInvocation SimpleName table operations
conn SimpleName MethodInvocation MethodInvocation SimpleName add splits
table operations SimpleName MethodInvocation MethodInvocation SimpleName add splits
conn SimpleName MethodInvocation MethodInvocation SimpleName table
table operations SimpleName MethodInvocation MethodInvocation SimpleName table
conn SimpleName MethodInvocation MethodInvocation SimpleName split set
table operations SimpleName MethodInvocation MethodInvocation SimpleName split set
add splits SimpleName MethodInvocation SimpleName table
add splits SimpleName MethodInvocation SimpleName split set
table SimpleName MethodInvocation SimpleName split set
conn SimpleName MethodInvocation SimpleName create batch writer
conn SimpleName MethodInvocation SimpleName table
conn SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName batch writer config
create batch writer SimpleName MethodInvocation SimpleName table
create batch writer SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName batch writer config
table SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName batch writer config
bw SimpleName VariableDeclarationFragment MethodInvocation SimpleName conn
bw SimpleName VariableDeclarationFragment MethodInvocation SimpleName create batch writer
bw SimpleName VariableDeclarationFragment MethodInvocation SimpleName table
batch writer SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName bw
hash set SimpleName SimpleType ParameterizedType SimpleType SimpleName string
hash set SimpleName SimpleType ParameterizedType SimpleType SimpleName string
string SimpleName SimpleType SingleVariableDeclaration SimpleName row
mutation SimpleName SimpleType ClassInstanceCreation SimpleName row
m SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName mutation
m SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName row
mutation SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName m
m SimpleName MethodInvocation SimpleName put
m SimpleName MethodInvocation StringLiteral cf
m SimpleName MethodInvocation StringLiteral cq
m SimpleName MethodInvocation SimpleName row
put SimpleName MethodInvocation StringLiteral cf
put SimpleName MethodInvocation StringLiteral cq
put SimpleName MethodInvocation SimpleName row
cf StringLiteral MethodInvocation StringLiteral cq
cf StringLiteral MethodInvocation SimpleName row
cq StringLiteral MethodInvocation SimpleName row
bw SimpleName MethodInvocation SimpleName add mutation
bw SimpleName MethodInvocation SimpleName m
add mutation SimpleName MethodInvocation SimpleName m
expected SimpleName MethodInvocation SimpleName add
expected SimpleName MethodInvocation SimpleName row
add SimpleName MethodInvocation SimpleName row
string SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName inserts
row SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName inserts
bw SimpleName MethodInvocation SimpleName close
conn SimpleName MethodInvocation SimpleName table operations
text SimpleName SimpleType ClassInstanceCreation SimpleName start
start SimpleName InfixExpression ConditionalExpression ClassInstanceCreation SimpleName start
text SimpleName SimpleType ClassInstanceCreation SimpleName end
end SimpleName InfixExpression ConditionalExpression ClassInstanceCreation SimpleName end
conn SimpleName MethodInvocation MethodInvocation SimpleName merge
table operations SimpleName MethodInvocation MethodInvocation SimpleName merge
conn SimpleName MethodInvocation MethodInvocation SimpleName table
table operations SimpleName MethodInvocation MethodInvocation SimpleName table
merge SimpleName MethodInvocation SimpleName table
merge SimpleName MethodInvocation ConditionalExpression InfixExpression SimpleName start
merge SimpleName MethodInvocation ConditionalExpression ClassInstanceCreation SimpleName start
merge SimpleName MethodInvocation ConditionalExpression InfixExpression SimpleName end
merge SimpleName MethodInvocation ConditionalExpression ClassInstanceCreation SimpleName end
table SimpleName MethodInvocation ConditionalExpression InfixExpression SimpleName start
table SimpleName MethodInvocation ConditionalExpression ClassInstanceCreation SimpleName start
table SimpleName MethodInvocation ConditionalExpression InfixExpression SimpleName end
table SimpleName MethodInvocation ConditionalExpression ClassInstanceCreation SimpleName end
conn SimpleName MethodInvocation SimpleName create scanner
conn SimpleName MethodInvocation SimpleName table
conn SimpleName MethodInvocation QualifiedName authorizationsempty
create scanner SimpleName MethodInvocation SimpleName table
create scanner SimpleName MethodInvocation QualifiedName authorizationsempty
table SimpleName MethodInvocation QualifiedName authorizationsempty
scanner SimpleName VariableDeclarationFragment MethodInvocation SimpleName conn
scanner SimpleName VariableDeclarationFragment MethodInvocation SimpleName create scanner
scanner SimpleName VariableDeclarationFragment MethodInvocation SimpleName table
scanner SimpleName VariableDeclarationFragment MethodInvocation QualifiedName authorizationsempty
scanner SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName scanner
hash set SimpleName SimpleType ParameterizedType SimpleType SimpleName string
hash set SimpleName SimpleType ParameterizedType SimpleType SimpleName string
entry SimpleName SimpleType ParameterizedType SimpleType SimpleName key
entry SimpleName SimpleType ParameterizedType SimpleType SimpleName value
key SimpleName SimpleType ParameterizedType SimpleType SimpleName value
entry SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName entry
key SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName entry
value SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName entry
entry SimpleName MethodInvocation SimpleName get key
entry SimpleName MethodInvocation MethodInvocation SimpleName get row data
get key SimpleName MethodInvocation MethodInvocation SimpleName get row data
entry SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to string
get key SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to string
get row data SimpleName MethodInvocation MethodInvocation SimpleName to string
row SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get row data
row SimpleName VariableDeclarationFragment MethodInvocation SimpleName to string
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName row
observed SimpleName MethodInvocation SimpleName add
observed SimpleName MethodInvocation SimpleName row
add SimpleName MethodInvocation SimpleName row
saw data twice StringLiteral InfixExpression SimpleName table
saw data twice StringLiteral InfixExpression StringLiteral empty
saw data twice StringLiteral InfixExpression SimpleName row
table SimpleName InfixExpression StringLiteral empty
table SimpleName InfixExpression SimpleName row
empty StringLiteral InfixExpression SimpleName row
exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral saw data twice
exception SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName table
exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral empty
exception SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName row
entry SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName scanner
observed SimpleName MethodInvocation SimpleName equals
observed SimpleName MethodInvocation SimpleName expected
equals SimpleName MethodInvocation SimpleName expected
data inconsistency StringLiteral InfixExpression SimpleName table
data inconsistency StringLiteral InfixExpression StringLiteral empty
data inconsistency StringLiteral InfixExpression SimpleName observed
data inconsistency StringLiteral InfixExpression StringLiteral !=
data inconsistency StringLiteral InfixExpression SimpleName expected
table SimpleName InfixExpression StringLiteral empty
table SimpleName InfixExpression SimpleName observed
table SimpleName InfixExpression StringLiteral !=
table SimpleName InfixExpression SimpleName expected
empty StringLiteral InfixExpression SimpleName observed
empty StringLiteral InfixExpression StringLiteral !=
empty StringLiteral InfixExpression SimpleName expected
observed SimpleName InfixExpression StringLiteral !=
observed SimpleName InfixExpression SimpleName expected
!= StringLiteral InfixExpression SimpleName expected
exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral data inconsistency
exception SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName table
exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral empty
exception SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName observed
exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral !=
exception SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName expected
hash set SimpleName SimpleType ParameterizedType SimpleType SimpleName text
hash set SimpleName SimpleType ParameterizedType SimpleType SimpleName text
conn SimpleName MethodInvocation SimpleName table operations
conn SimpleName MethodInvocation MethodInvocation SimpleName list splits
table operations SimpleName MethodInvocation MethodInvocation SimpleName list splits
conn SimpleName MethodInvocation MethodInvocation SimpleName table
table operations SimpleName MethodInvocation MethodInvocation SimpleName table
list splits SimpleName MethodInvocation SimpleName table
current splits SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName list splits
current splits SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName table
hash set SimpleName SimpleType ParameterizedType SimpleType SimpleName text
hash set SimpleName SimpleType ParameterizedType SimpleType SimpleName text
string SimpleName SimpleType SingleVariableDeclaration SimpleName es
text SimpleName SimpleType ClassInstanceCreation SimpleName es
ess SimpleName MethodInvocation SimpleName add
ess SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName text
ess SimpleName MethodInvocation ClassInstanceCreation SimpleName es
add SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName text
add SimpleName MethodInvocation ClassInstanceCreation SimpleName es
string SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName expected splits
es SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName expected splits
current splits SimpleName MethodInvocation SimpleName equals
current splits SimpleName MethodInvocation SimpleName ess
equals SimpleName MethodInvocation SimpleName ess
split inconsistency StringLiteral InfixExpression SimpleName table
split inconsistency StringLiteral InfixExpression StringLiteral empty
split inconsistency StringLiteral InfixExpression SimpleName current splits
split inconsistency StringLiteral InfixExpression StringLiteral !=
split inconsistency StringLiteral InfixExpression SimpleName ess
table SimpleName InfixExpression StringLiteral empty
table SimpleName InfixExpression SimpleName current splits
table SimpleName InfixExpression StringLiteral !=
table SimpleName InfixExpression SimpleName ess
empty StringLiteral InfixExpression SimpleName current splits
empty StringLiteral InfixExpression StringLiteral !=
empty StringLiteral InfixExpression SimpleName ess
current splits SimpleName InfixExpression StringLiteral !=
current splits SimpleName InfixExpression SimpleName ess
!= StringLiteral InfixExpression SimpleName ess
exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral split inconsistency
exception SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName table
exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral empty
exception SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName current splits
exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral !=
exception SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName ess
splits SimpleName EnhancedForStatement Block EnhancedForStatement SimpleName inserts
inserts SimpleName EnhancedForStatement Block EnhancedForStatement SimpleName scanner
scanner SimpleName EnhancedForStatement Block EnhancedForStatement SimpleName expected splits
private Modifier MethodDeclaration PrimitiveType void
private Modifier MethodDeclaration SimpleName run merge test
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName connector
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName conn
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName table
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName splits
void PrimitiveType MethodDeclaration SimpleName run merge test
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName connector
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName conn
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName table
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName splits
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName expected splits
run merge test SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName connector
run merge test SimpleName MethodDeclaration SingleVariableDeclaration SimpleName conn
run merge test SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
run merge test SimpleName MethodDeclaration SingleVariableDeclaration SimpleName table
run merge test SimpleName MethodDeclaration SingleVariableDeclaration SimpleName splits
run merge test SimpleName MethodDeclaration SingleVariableDeclaration SimpleName expected splits
run merge test SimpleName MethodDeclaration SingleVariableDeclaration SimpleName inserts
conn SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName table
conn SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName splits
conn SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName expected splits
conn SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName inserts
conn SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName start
table SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName splits
table SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName expected splits
table SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName inserts
table SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName start
table SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName end
splits SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName expected splits
splits SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName inserts
splits SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName start
splits SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName end
splits SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
expected splits SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName inserts
expected splits SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName start
expected splits SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName end
expected splits SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
inserts SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName start
inserts SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName end
inserts SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
start SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName end
start SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
end SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName run merge test
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName conn
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName table
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName splits
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName expected splits
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName inserts
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName start
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName end
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName run merge test
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName conn
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName table
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName splits
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName expected splits
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName inserts
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName start
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName end
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
