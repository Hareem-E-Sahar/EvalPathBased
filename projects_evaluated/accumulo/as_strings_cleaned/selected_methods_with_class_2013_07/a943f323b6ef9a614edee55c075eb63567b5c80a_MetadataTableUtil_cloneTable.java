instance SimpleName SimpleType SingleVariableDeclaration SimpleName instance
string SimpleName SimpleType SingleVariableDeclaration SimpleName src table id
string SimpleName SimpleType SingleVariableDeclaration SimpleName table id
system credentials SimpleName MethodInvocation SimpleName get
system credentials SimpleName MethodInvocation MethodInvocation SimpleName get principal
get SimpleName MethodInvocation MethodInvocation SimpleName get principal
system credentials SimpleName MethodInvocation SimpleName get
system credentials SimpleName MethodInvocation MethodInvocation SimpleName get token
get SimpleName MethodInvocation MethodInvocation SimpleName get token
instance SimpleName MethodInvocation SimpleName get connector
instance SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName system credentials
instance SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get
instance SimpleName MethodInvocation MethodInvocation SimpleName get principal
instance SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName system credentials
instance SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get
instance SimpleName MethodInvocation MethodInvocation SimpleName get token
get connector SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName system credentials
get connector SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get
get connector SimpleName MethodInvocation MethodInvocation SimpleName get principal
get connector SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName system credentials
get connector SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get
get connector SimpleName MethodInvocation MethodInvocation SimpleName get token
get principal SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get token
conn SimpleName VariableDeclarationFragment MethodInvocation SimpleName instance
conn SimpleName VariableDeclarationFragment MethodInvocation SimpleName get connector
conn SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get principal
conn SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get token
connector SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName conn
conn SimpleName MethodInvocation SimpleName create batch writer
conn SimpleName MethodInvocation QualifiedName metadata tablename
conn SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName batch writer config
create batch writer SimpleName MethodInvocation QualifiedName metadata tablename
create batch writer SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName batch writer config
metadata tablename QualifiedName MethodInvocation ClassInstanceCreation SimpleType SimpleName batch writer config
bw SimpleName VariableDeclarationFragment MethodInvocation SimpleName conn
bw SimpleName VariableDeclarationFragment MethodInvocation SimpleName create batch writer
bw SimpleName VariableDeclarationFragment MethodInvocation QualifiedName metadata tablename
batch writer SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName bw
initialize clone SimpleName MethodInvocation SimpleName src table id
initialize clone SimpleName MethodInvocation SimpleName table id
initialize clone SimpleName MethodInvocation SimpleName conn
initialize clone SimpleName MethodInvocation SimpleName bw
src table id SimpleName MethodInvocation SimpleName table id
src table id SimpleName MethodInvocation SimpleName conn
src table id SimpleName MethodInvocation SimpleName bw
table id SimpleName MethodInvocation SimpleName conn
table id SimpleName MethodInvocation SimpleName bw
conn SimpleName MethodInvocation SimpleName bw
check clone SimpleName MethodInvocation SimpleName src table id
check clone SimpleName MethodInvocation SimpleName table id
check clone SimpleName MethodInvocation SimpleName conn
check clone SimpleName MethodInvocation SimpleName bw
src table id SimpleName MethodInvocation SimpleName table id
src table id SimpleName MethodInvocation SimpleName conn
src table id SimpleName MethodInvocation SimpleName bw
table id SimpleName MethodInvocation SimpleName conn
table id SimpleName MethodInvocation SimpleName bw
conn SimpleName MethodInvocation SimpleName bw
rewrites SimpleName VariableDeclarationFragment MethodInvocation SimpleName check clone
rewrites SimpleName VariableDeclarationFragment MethodInvocation SimpleName src table id
rewrites SimpleName VariableDeclarationFragment MethodInvocation SimpleName table id
rewrites SimpleName VariableDeclarationFragment MethodInvocation SimpleName conn
rewrites SimpleName VariableDeclarationFragment MethodInvocation SimpleName bw
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName rewrites
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName check clone
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName src table id
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName table id
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName conn
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName bw
rewrites SimpleName InfixExpression NumberLiteral empty
true BooleanLiteral WhileStatement Block VariableDeclarationStatement PrimitiveType int
bw SimpleName MethodInvocation SimpleName flush
tablet iteratortablet deleted exception QualifiedName SimpleType SingleVariableDeclaration SimpleName tde
bw SimpleName MethodInvocation SimpleName flush
system credentials SimpleName MethodInvocation SimpleName get
system credentials SimpleName MethodInvocation MethodInvocation SimpleName get as thrift
get SimpleName MethodInvocation MethodInvocation SimpleName get as thrift
delete table SimpleName MethodInvocation SimpleName table id
delete table SimpleName MethodInvocation BooleanLiteral false
delete table SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName system credentials
delete table SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get
delete table SimpleName MethodInvocation MethodInvocation SimpleName get as thrift
table id SimpleName MethodInvocation BooleanLiteral false
table id SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName system credentials
table id SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get
table id SimpleName MethodInvocation MethodInvocation SimpleName get as thrift
false BooleanLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName system credentials
false BooleanLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName get
false BooleanLiteral MethodInvocation MethodInvocation SimpleName get as thrift
tablets merged in table StringLiteral InfixExpression SimpleName src table id
tablets merged in table StringLiteral InfixExpression StringLiteral while attempting to clone trying again
src table id SimpleName InfixExpression StringLiteral while attempting to clone trying again
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation InfixExpression StringLiteral tablets merged in table
log SimpleName MethodInvocation InfixExpression SimpleName src table id
log SimpleName MethodInvocation InfixExpression StringLiteral while attempting to clone trying again
debug SimpleName MethodInvocation InfixExpression StringLiteral tablets merged in table
debug SimpleName MethodInvocation InfixExpression SimpleName src table id
debug SimpleName MethodInvocation InfixExpression StringLiteral while attempting to clone trying again
util wait thread SimpleName MethodInvocation SimpleName sleep
util wait thread SimpleName MethodInvocation NumberLiteral empty
sleep SimpleName MethodInvocation NumberLiteral empty
conn SimpleName MethodInvocation SimpleName create scanner
conn SimpleName MethodInvocation QualifiedName metadata tablename
conn SimpleName MethodInvocation QualifiedName authorizationsempty
create scanner SimpleName MethodInvocation QualifiedName metadata tablename
create scanner SimpleName MethodInvocation QualifiedName authorizationsempty
metadata tablename QualifiedName MethodInvocation QualifiedName authorizationsempty
mscanner SimpleName VariableDeclarationFragment MethodInvocation SimpleName conn
mscanner SimpleName VariableDeclarationFragment MethodInvocation SimpleName create scanner
mscanner SimpleName VariableDeclarationFragment MethodInvocation QualifiedName metadata tablename
mscanner SimpleName VariableDeclarationFragment MethodInvocation QualifiedName authorizationsempty
scanner SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName mscanner
text SimpleName SimpleType ClassInstanceCreation SimpleName table id
key extent SimpleName SimpleType ClassInstanceCreation ClassInstanceCreation SimpleName table id
key extent SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName to metadata range
table id SimpleName ClassInstanceCreation ClassInstanceCreation MethodInvocation SimpleName to metadata range
mscanner SimpleName MethodInvocation SimpleName set range
mscanner SimpleName MethodInvocation MethodInvocation SimpleName to metadata range
set range SimpleName MethodInvocation MethodInvocation SimpleName to metadata range
mscanner SimpleName MethodInvocation SimpleName fetch column family
mscanner SimpleName MethodInvocation QualifiedName cloned column familyname
fetch column family SimpleName MethodInvocation QualifiedName cloned column familyname
dir count SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName dir count
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment NumberLiteral empty
entry SimpleName SimpleType ParameterizedType SimpleType SimpleName key
entry SimpleName SimpleType ParameterizedType SimpleType SimpleName value
key SimpleName SimpleType ParameterizedType SimpleType SimpleName value
entry SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName entry
key SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName entry
value SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName entry
entry SimpleName MethodInvocation SimpleName get key
k SimpleName VariableDeclarationFragment MethodInvocation SimpleName entry
k SimpleName VariableDeclarationFragment MethodInvocation SimpleName get key
key SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName k
k SimpleName MethodInvocation SimpleName get row
mutation SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName k
mutation SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get row
m SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName mutation
m SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName k
m SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName get row
mutation SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName m
k SimpleName MethodInvocation SimpleName get column family
k SimpleName MethodInvocation SimpleName get column qualifier
m SimpleName MethodInvocation SimpleName put delete
m SimpleName MethodInvocation MethodInvocation SimpleName k
m SimpleName MethodInvocation MethodInvocation SimpleName get column family
m SimpleName MethodInvocation MethodInvocation SimpleName k
m SimpleName MethodInvocation MethodInvocation SimpleName get column qualifier
put delete SimpleName MethodInvocation MethodInvocation SimpleName k
put delete SimpleName MethodInvocation MethodInvocation SimpleName get column family
put delete SimpleName MethodInvocation MethodInvocation SimpleName k
put delete SimpleName MethodInvocation MethodInvocation SimpleName get column qualifier
k SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName k
k SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get column qualifier
get column family SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName k
get column family SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get column qualifier
c StringLiteral MethodInvocation SimpleName get bytes
fast format SimpleName MethodInvocation SimpleName to zero padded string
fast format SimpleName MethodInvocation PostfixExpression SimpleName dir count
fast format SimpleName MethodInvocation NumberLiteral empty
fast format SimpleName MethodInvocation NumberLiteral empty
fast format SimpleName MethodInvocation MethodInvocation StringLiteral c
fast format SimpleName MethodInvocation MethodInvocation SimpleName get bytes
to zero padded string SimpleName MethodInvocation PostfixExpression SimpleName dir count
to zero padded string SimpleName MethodInvocation NumberLiteral empty
to zero padded string SimpleName MethodInvocation NumberLiteral empty
to zero padded string SimpleName MethodInvocation MethodInvocation StringLiteral c
to zero padded string SimpleName MethodInvocation MethodInvocation SimpleName get bytes
dir count SimpleName PostfixExpression MethodInvocation NumberLiteral empty
dir count SimpleName PostfixExpression MethodInvocation NumberLiteral empty
dir count SimpleName PostfixExpression MethodInvocation MethodInvocation StringLiteral c
dir count SimpleName PostfixExpression MethodInvocation MethodInvocation SimpleName get bytes
empty NumberLiteral MethodInvocation NumberLiteral empty
empty NumberLiteral MethodInvocation MethodInvocation StringLiteral c
empty NumberLiteral MethodInvocation MethodInvocation SimpleName get bytes
empty NumberLiteral MethodInvocation MethodInvocation StringLiteral c
empty NumberLiteral MethodInvocation MethodInvocation SimpleName get bytes
value SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName fast format
value SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName to zero padded string
value SimpleName SimpleType ClassInstanceCreation MethodInvocation NumberLiteral empty
value SimpleName SimpleType ClassInstanceCreation MethodInvocation NumberLiteral empty
tablets sectionserver column familydirectory column QualifiedName MethodInvocation SimpleName put
tablets sectionserver column familydirectory column QualifiedName MethodInvocation SimpleName m
tablets sectionserver column familydirectory column QualifiedName MethodInvocation ClassInstanceCreation SimpleType SimpleName value
tablets sectionserver column familydirectory column QualifiedName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName fast format
tablets sectionserver column familydirectory column QualifiedName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName to zero padded string
tablets sectionserver column familydirectory column QualifiedName MethodInvocation ClassInstanceCreation MethodInvocation NumberLiteral empty
tablets sectionserver column familydirectory column QualifiedName MethodInvocation ClassInstanceCreation MethodInvocation NumberLiteral empty
put SimpleName MethodInvocation SimpleName m
put SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName value
put SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName fast format
put SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName to zero padded string
put SimpleName MethodInvocation ClassInstanceCreation MethodInvocation NumberLiteral empty
put SimpleName MethodInvocation ClassInstanceCreation MethodInvocation NumberLiteral empty
m SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName value
m SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName fast format
m SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName to zero padded string
m SimpleName MethodInvocation ClassInstanceCreation MethodInvocation NumberLiteral empty
m SimpleName MethodInvocation ClassInstanceCreation MethodInvocation NumberLiteral empty
bw SimpleName MethodInvocation SimpleName add mutation
bw SimpleName MethodInvocation SimpleName m
add mutation SimpleName MethodInvocation SimpleName m
entry SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName mscanner
bw SimpleName MethodInvocation SimpleName close
true BooleanLiteral WhileStatement Block VariableDeclarationStatement PrimitiveType int
true BooleanLiteral WhileStatement Block EnhancedForStatement SimpleName mscanner
int PrimitiveType VariableDeclarationStatement Block EnhancedForStatement SimpleName mscanner
public Modifier MethodDeclaration Modifier static
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName clone table
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName instance
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName instance
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName src table id
static Modifier MethodDeclaration PrimitiveType void
static Modifier MethodDeclaration SimpleName clone table
static Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName instance
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName instance
static Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName src table id
static Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName table id
void PrimitiveType MethodDeclaration SimpleName clone table
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName instance
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName instance
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName src table id
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName table id
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
clone table SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName instance
clone table SimpleName MethodDeclaration SingleVariableDeclaration SimpleName instance
clone table SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
clone table SimpleName MethodDeclaration SingleVariableDeclaration SimpleName src table id
clone table SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
clone table SimpleName MethodDeclaration SingleVariableDeclaration SimpleName table id
clone table SimpleName MethodDeclaration SimpleType SimpleName exception
clone table SimpleName MethodDeclaration Block WhileStatement BooleanLiteral true
clone table SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
clone table SimpleName MethodDeclaration Block EnhancedForStatement SimpleName mscanner
instance SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName src table id
instance SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName table id
instance SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
src table id SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName table id
src table id SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
table id SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration Modifier static
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName clone table
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName instance
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName src table id
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName table id
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration Modifier static
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName clone table
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName instance
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName src table id
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName table id
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
