mock instance SimpleName SimpleType ClassInstanceCreation StringLiteral testmapinstance
mock instance SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName mock instance
mock instance SimpleName VariableDeclarationFragment ClassInstanceCreation StringLiteral testmapinstance
mock instance SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName mock instance
mock instance SimpleName MethodInvocation SimpleName get connector
mock instance SimpleName MethodInvocation StringLiteral root
mock instance SimpleName MethodInvocation ArrayCreation ArrayType PrimitiveType byte
get connector SimpleName MethodInvocation StringLiteral root
get connector SimpleName MethodInvocation ArrayCreation ArrayType PrimitiveType byte
root StringLiteral MethodInvocation ArrayCreation ArrayType PrimitiveType byte
c SimpleName VariableDeclarationFragment MethodInvocation SimpleName mock instance
c SimpleName VariableDeclarationFragment MethodInvocation SimpleName get connector
c SimpleName VariableDeclarationFragment MethodInvocation StringLiteral root
connector SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName c
c SimpleName MethodInvocation SimpleName table operations
c SimpleName MethodInvocation MethodInvocation SimpleName create
table operations SimpleName MethodInvocation MethodInvocation SimpleName create
c SimpleName MethodInvocation MethodInvocation StringLiteral testtable
table operations SimpleName MethodInvocation MethodInvocation StringLiteral testtable
create SimpleName MethodInvocation StringLiteral testtable
c SimpleName MethodInvocation SimpleName create batch writer
c SimpleName MethodInvocation StringLiteral testtable
c SimpleName MethodInvocation NumberLiteral l
c SimpleName MethodInvocation NumberLiteral l
c SimpleName MethodInvocation NumberLiteral empty
create batch writer SimpleName MethodInvocation StringLiteral testtable
create batch writer SimpleName MethodInvocation NumberLiteral l
create batch writer SimpleName MethodInvocation NumberLiteral l
create batch writer SimpleName MethodInvocation NumberLiteral empty
testtable StringLiteral MethodInvocation NumberLiteral l
testtable StringLiteral MethodInvocation NumberLiteral l
testtable StringLiteral MethodInvocation NumberLiteral empty
l NumberLiteral MethodInvocation NumberLiteral l
l NumberLiteral MethodInvocation NumberLiteral empty
l NumberLiteral MethodInvocation NumberLiteral empty
bw SimpleName VariableDeclarationFragment MethodInvocation SimpleName c
bw SimpleName VariableDeclarationFragment MethodInvocation SimpleName create batch writer
bw SimpleName VariableDeclarationFragment MethodInvocation StringLiteral testtable
bw SimpleName VariableDeclarationFragment MethodInvocation NumberLiteral l
bw SimpleName VariableDeclarationFragment MethodInvocation NumberLiteral l
bw SimpleName VariableDeclarationFragment MethodInvocation NumberLiteral empty
batch writer SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName bw
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression NumberLiteral empty
i SimpleName InfixExpression NumberLiteral empty
string SimpleName MethodInvocation SimpleName format
string SimpleName MethodInvocation StringLiteral % x
string SimpleName MethodInvocation InfixExpression SimpleName i
string SimpleName MethodInvocation InfixExpression NumberLiteral empty
format SimpleName MethodInvocation StringLiteral % x
format SimpleName MethodInvocation InfixExpression SimpleName i
format SimpleName MethodInvocation InfixExpression NumberLiteral empty
% x StringLiteral MethodInvocation InfixExpression SimpleName i
% x StringLiteral MethodInvocation InfixExpression NumberLiteral empty
text SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName string
text SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName format
text SimpleName SimpleType ClassInstanceCreation MethodInvocation StringLiteral % x
m SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName mutation
mutation SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName m
string SimpleName MethodInvocation SimpleName format
string SimpleName MethodInvocation StringLiteral % x
string SimpleName MethodInvocation SimpleName i
format SimpleName MethodInvocation StringLiteral % x
format SimpleName MethodInvocation SimpleName i
% x StringLiteral MethodInvocation SimpleName i
string SimpleName MethodInvocation MethodInvocation SimpleName get bytes
format SimpleName MethodInvocation MethodInvocation SimpleName get bytes
% x StringLiteral MethodInvocation MethodInvocation SimpleName get bytes
i SimpleName MethodInvocation MethodInvocation SimpleName get bytes
value SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get bytes
m SimpleName MethodInvocation SimpleName put
m SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName text
m SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName text
m SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName value
m SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get bytes
put SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName text
put SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName text
put SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName value
put SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get bytes
bw SimpleName MethodInvocation SimpleName add mutation
bw SimpleName MethodInvocation SimpleName m
add mutation SimpleName MethodInvocation SimpleName m
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression NumberLiteral empty
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
empty NumberLiteral InfixExpression ForStatement PostfixExpression SimpleName i
bw SimpleName MethodInvocation SimpleName close
job SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName job
job SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName job
job SimpleName MethodInvocation SimpleName set input format class
job SimpleName MethodInvocation TypeLiteral SimpleType SimpleName accumulo input format
set input format class SimpleName MethodInvocation TypeLiteral SimpleType SimpleName accumulo input format
job SimpleName MethodInvocation SimpleName set mapper class
job SimpleName MethodInvocation TypeLiteral SimpleType SimpleName test mapper
set mapper class SimpleName MethodInvocation TypeLiteral SimpleType SimpleName test mapper
job SimpleName MethodInvocation SimpleName set num reduce tasks
job SimpleName MethodInvocation NumberLiteral empty
set num reduce tasks SimpleName MethodInvocation NumberLiteral empty
job SimpleName MethodInvocation SimpleName get configuration
empty StringLiteral MethodInvocation SimpleName get bytes
accumulo input format SimpleName MethodInvocation SimpleName set input info
accumulo input format SimpleName MethodInvocation MethodInvocation SimpleName job
accumulo input format SimpleName MethodInvocation MethodInvocation SimpleName get configuration
accumulo input format SimpleName MethodInvocation StringLiteral root
accumulo input format SimpleName MethodInvocation MethodInvocation StringLiteral empty
accumulo input format SimpleName MethodInvocation MethodInvocation SimpleName get bytes
accumulo input format SimpleName MethodInvocation StringLiteral testtable
set input info SimpleName MethodInvocation MethodInvocation SimpleName job
set input info SimpleName MethodInvocation MethodInvocation SimpleName get configuration
set input info SimpleName MethodInvocation StringLiteral root
set input info SimpleName MethodInvocation MethodInvocation StringLiteral empty
set input info SimpleName MethodInvocation MethodInvocation SimpleName get bytes
set input info SimpleName MethodInvocation StringLiteral testtable
set input info SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName authorizations
job SimpleName MethodInvocation MethodInvocation StringLiteral root
get configuration SimpleName MethodInvocation MethodInvocation StringLiteral root
job SimpleName MethodInvocation MethodInvocation MethodInvocation StringLiteral empty
job SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get bytes
get configuration SimpleName MethodInvocation MethodInvocation MethodInvocation StringLiteral empty
get configuration SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get bytes
job SimpleName MethodInvocation MethodInvocation StringLiteral testtable
get configuration SimpleName MethodInvocation MethodInvocation StringLiteral testtable
root StringLiteral MethodInvocation MethodInvocation StringLiteral empty
root StringLiteral MethodInvocation MethodInvocation SimpleName get bytes
root StringLiteral MethodInvocation StringLiteral testtable
root StringLiteral MethodInvocation ClassInstanceCreation SimpleType SimpleName authorizations
empty StringLiteral MethodInvocation MethodInvocation StringLiteral testtable
get bytes SimpleName MethodInvocation MethodInvocation StringLiteral testtable
testtable StringLiteral MethodInvocation ClassInstanceCreation SimpleType SimpleName authorizations
job SimpleName MethodInvocation SimpleName get configuration
accumulo input format SimpleName MethodInvocation SimpleName set mock instance
accumulo input format SimpleName MethodInvocation MethodInvocation SimpleName job
accumulo input format SimpleName MethodInvocation MethodInvocation SimpleName get configuration
accumulo input format SimpleName MethodInvocation StringLiteral testmapinstance
set mock instance SimpleName MethodInvocation MethodInvocation SimpleName job
set mock instance SimpleName MethodInvocation MethodInvocation SimpleName get configuration
set mock instance SimpleName MethodInvocation StringLiteral testmapinstance
job SimpleName MethodInvocation MethodInvocation StringLiteral testmapinstance
get configuration SimpleName MethodInvocation MethodInvocation StringLiteral testmapinstance
input SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName accumulo input format
accumulo input format SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName input
list SimpleName SimpleType ParameterizedType SimpleType SimpleName input split
input SimpleName MethodInvocation SimpleName get splits
input SimpleName MethodInvocation SimpleName job
get splits SimpleName MethodInvocation SimpleName job
splits SimpleName VariableDeclarationFragment MethodInvocation SimpleName input
splits SimpleName VariableDeclarationFragment MethodInvocation SimpleName get splits
splits SimpleName VariableDeclarationFragment MethodInvocation SimpleName job
splits SimpleName MethodInvocation SimpleName size
assert equals SimpleName MethodInvocation MethodInvocation SimpleName splits
assert equals SimpleName MethodInvocation MethodInvocation SimpleName size
assert equals SimpleName MethodInvocation NumberLiteral empty
splits SimpleName MethodInvocation MethodInvocation NumberLiteral empty
size SimpleName MethodInvocation MethodInvocation NumberLiteral empty
job SimpleName MethodInvocation SimpleName get mapper class
job SimpleName MethodInvocation MethodInvocation SimpleName new instance
get mapper class SimpleName MethodInvocation MethodInvocation SimpleName new instance
test mapper SimpleName SimpleType CastExpression MethodInvocation SimpleName new instance
mapper SimpleName VariableDeclarationFragment CastExpression SimpleType SimpleName test mapper
mapper SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName new instance
test mapper SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName mapper
input split SimpleName SimpleType SingleVariableDeclaration SimpleName split
id SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName task attempt id
task attempt id SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName id
job SimpleName MethodInvocation SimpleName get configuration
task attempt context SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName job
task attempt context SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get configuration
task attempt context SimpleName SimpleType ClassInstanceCreation SimpleName id
job SimpleName MethodInvocation ClassInstanceCreation SimpleName id
get configuration SimpleName MethodInvocation ClassInstanceCreation SimpleName id
attempt SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName task attempt context
attempt SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName job
attempt SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName get configuration
attempt SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName id
task attempt context SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName attempt
record reader SimpleName SimpleType ParameterizedType SimpleType SimpleName key
record reader SimpleName SimpleType ParameterizedType SimpleType SimpleName value
key SimpleName SimpleType ParameterizedType SimpleType SimpleName value
input SimpleName MethodInvocation SimpleName create record reader
input SimpleName MethodInvocation SimpleName split
input SimpleName MethodInvocation SimpleName attempt
create record reader SimpleName MethodInvocation SimpleName split
create record reader SimpleName MethodInvocation SimpleName attempt
split SimpleName MethodInvocation SimpleName attempt
reader SimpleName VariableDeclarationFragment MethodInvocation SimpleName input
reader SimpleName VariableDeclarationFragment MethodInvocation SimpleName create record reader
reader SimpleName VariableDeclarationFragment MethodInvocation SimpleName split
reader SimpleName VariableDeclarationFragment MethodInvocation SimpleName attempt
mapper SimpleName SimpleType ParameterizedType SimpleType SimpleName key
mapper SimpleName SimpleType ParameterizedType SimpleType SimpleName value
mapper SimpleName SimpleType ParameterizedType SimpleType SimpleName key
mapper SimpleName SimpleType ParameterizedType SimpleType SimpleName value
key SimpleName SimpleType ParameterizedType SimpleType SimpleName value
key SimpleName SimpleType ParameterizedType SimpleType SimpleName key
key SimpleName SimpleType ParameterizedType SimpleType SimpleName value
value SimpleName SimpleType ParameterizedType SimpleType SimpleName key
value SimpleName SimpleType ParameterizedType SimpleType SimpleName value
key SimpleName SimpleType ParameterizedType SimpleType SimpleName value
mapper SimpleName SimpleType ParameterizedType QualifiedType SimpleName context
key SimpleName SimpleType ParameterizedType QualifiedType SimpleName context
value SimpleName SimpleType ParameterizedType QualifiedType SimpleName context
key SimpleName SimpleType ParameterizedType QualifiedType SimpleName context
value SimpleName SimpleType ParameterizedType QualifiedType SimpleName context
job SimpleName MethodInvocation SimpleName get configuration
mapper SimpleName ClassInstanceCreation SimpleType SimpleName context
mapper SimpleName ClassInstanceCreation MethodInvocation SimpleName job
mapper SimpleName ClassInstanceCreation MethodInvocation SimpleName get configuration
mapper SimpleName ClassInstanceCreation SimpleName id
mapper SimpleName ClassInstanceCreation SimpleName reader
context SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName job
context SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get configuration
context SimpleName SimpleType ClassInstanceCreation SimpleName id
context SimpleName SimpleType ClassInstanceCreation SimpleName reader
job SimpleName MethodInvocation ClassInstanceCreation SimpleName id
get configuration SimpleName MethodInvocation ClassInstanceCreation SimpleName id
job SimpleName MethodInvocation ClassInstanceCreation SimpleName reader
get configuration SimpleName MethodInvocation ClassInstanceCreation SimpleName reader
id SimpleName ClassInstanceCreation SimpleName reader
id SimpleName ClassInstanceCreation SimpleName split
reader SimpleName ClassInstanceCreation SimpleName split
context SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName mapper
context SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName context
context SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName job
context SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName get configuration
context SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName id
context SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName reader
context SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName split
context SimpleName QualifiedType VariableDeclarationStatement VariableDeclarationFragment SimpleName context
reader SimpleName MethodInvocation SimpleName initialize
reader SimpleName MethodInvocation SimpleName split
reader SimpleName MethodInvocation SimpleName context
initialize SimpleName MethodInvocation SimpleName split
initialize SimpleName MethodInvocation SimpleName context
split SimpleName MethodInvocation SimpleName context
mapper SimpleName MethodInvocation SimpleName run
mapper SimpleName MethodInvocation SimpleName context
run SimpleName MethodInvocation SimpleName context
input split SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName splits
split SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName splits
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test map
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test map
public Modifier MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration Block EnhancedForStatement SimpleName splits
void PrimitiveType MethodDeclaration SimpleName test map
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration Block EnhancedForStatement SimpleName splits
test map SimpleName MethodDeclaration SimpleType SimpleName exception
test map SimpleName MethodDeclaration Block EnhancedForStatement SimpleName splits
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test map
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test map
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception