empty NumberLiteral InfixExpression NumberLiteral empty
timeout SimpleName MemberValuePair InfixExpression NumberLiteral empty
timeout SimpleName MemberValuePair InfixExpression NumberLiteral empty
test SimpleName NormalAnnotation MemberValuePair SimpleName timeout
test SimpleName NormalAnnotation MemberValuePair InfixExpression NumberLiteral empty
test SimpleName NormalAnnotation MemberValuePair InfixExpression NumberLiteral empty
conn SimpleName VariableDeclarationFragment MethodInvocation SimpleName get connector
final Modifier VariableDeclarationStatement SimpleType SimpleName connector
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName conn
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get connector
connector SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName conn
conn SimpleName MethodInvocation SimpleName table operations
conn SimpleName MethodInvocation MethodInvocation SimpleName exists
table operations SimpleName MethodInvocation MethodInvocation SimpleName exists
conn SimpleName MethodInvocation MethodInvocation QualifiedName replication tablename
table operations SimpleName MethodInvocation MethodInvocation QualifiedName replication tablename
exists SimpleName MethodInvocation QualifiedName replication tablename
conn SimpleName MethodInvocation SimpleName table operations
conn SimpleName MethodInvocation MethodInvocation SimpleName delete
table operations SimpleName MethodInvocation MethodInvocation SimpleName delete
conn SimpleName MethodInvocation MethodInvocation QualifiedName replication tablename
table operations SimpleName MethodInvocation MethodInvocation QualifiedName replication tablename
delete SimpleName MethodInvocation QualifiedName replication tablename
replication table SimpleName MethodInvocation SimpleName create
replication table SimpleName MethodInvocation SimpleName conn
create SimpleName MethodInvocation SimpleName conn
conn SimpleName MethodInvocation SimpleName security operations
conn SimpleName MethodInvocation MethodInvocation SimpleName grant table permission
security operations SimpleName MethodInvocation MethodInvocation SimpleName grant table permission
conn SimpleName MethodInvocation MethodInvocation StringLiteral root
security operations SimpleName MethodInvocation MethodInvocation StringLiteral root
conn SimpleName MethodInvocation MethodInvocation QualifiedName replication tablename
security operations SimpleName MethodInvocation MethodInvocation QualifiedName replication tablename
conn SimpleName MethodInvocation MethodInvocation QualifiedName table permissionwrite
security operations SimpleName MethodInvocation MethodInvocation QualifiedName table permissionwrite
grant table permission SimpleName MethodInvocation StringLiteral root
grant table permission SimpleName MethodInvocation QualifiedName replication tablename
grant table permission SimpleName MethodInvocation QualifiedName table permissionwrite
root StringLiteral MethodInvocation QualifiedName replication tablename
root StringLiteral MethodInvocation QualifiedName table permissionwrite
replication tablename QualifiedName MethodInvocation QualifiedName table permissionwrite
atomic boolean SimpleName SimpleType ClassInstanceCreation BooleanLiteral true
keep running SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName atomic boolean
keep running SimpleName VariableDeclarationFragment ClassInstanceCreation BooleanLiteral true
final Modifier VariableDeclarationStatement SimpleType SimpleName atomic boolean
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName keep running
final Modifier VariableDeclarationStatement VariableDeclarationFragment ClassInstanceCreation BooleanLiteral true
atomic boolean SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName keep running
set SimpleName SimpleType ParameterizedType SimpleType SimpleName string
final Modifier VariableDeclarationStatement ParameterizedType SimpleType SimpleName set
final Modifier VariableDeclarationStatement ParameterizedType SimpleType SimpleName string
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName metadata wals
keep running SimpleName MethodInvocation SimpleName get
get logs SimpleName MethodInvocation SimpleName conn
get logs SimpleName MethodInvocation MethodInvocation SimpleName key set
conn SimpleName MethodInvocation MethodInvocation SimpleName key set
metadata wals SimpleName MethodInvocation SimpleName add all
metadata wals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get logs
metadata wals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName conn
metadata wals SimpleName MethodInvocation MethodInvocation SimpleName key set
add all SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get logs
add all SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName conn
add all SimpleName MethodInvocation MethodInvocation SimpleName key set
exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
log SimpleName MethodInvocation SimpleName error
log SimpleName MethodInvocation StringLiteral metadata table doesnt exist
error SimpleName MethodInvocation StringLiteral metadata table doesnt exist
override SimpleName MarkerAnnotation MethodDeclaration Modifier public
override SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
override SimpleName MarkerAnnotation MethodDeclaration SimpleName run
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName run
void PrimitiveType MethodDeclaration SimpleName run
t SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName thread
thread SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName t
t SimpleName MethodInvocation SimpleName start
table SimpleName VariableDeclarationFragment StringLiteral table
table SimpleName VariableDeclarationFragment StringLiteral table
table SimpleName VariableDeclarationFragment StringLiteral table
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment StringLiteral table
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment StringLiteral table
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment StringLiteral table
table SimpleName VariableDeclarationFragment VariableDeclarationStatement VariableDeclarationFragment SimpleName table
table SimpleName VariableDeclarationFragment VariableDeclarationStatement VariableDeclarationFragment StringLiteral table
table StringLiteral VariableDeclarationFragment VariableDeclarationStatement VariableDeclarationFragment SimpleName table
table StringLiteral VariableDeclarationFragment VariableDeclarationStatement VariableDeclarationFragment StringLiteral table
table SimpleName VariableDeclarationFragment VariableDeclarationStatement VariableDeclarationFragment SimpleName table
table SimpleName VariableDeclarationFragment VariableDeclarationStatement VariableDeclarationFragment StringLiteral table
table StringLiteral VariableDeclarationFragment VariableDeclarationStatement VariableDeclarationFragment SimpleName table
table StringLiteral VariableDeclarationFragment VariableDeclarationStatement VariableDeclarationFragment StringLiteral table
table SimpleName VariableDeclarationFragment VariableDeclarationStatement VariableDeclarationFragment SimpleName table
table SimpleName VariableDeclarationFragment VariableDeclarationStatement VariableDeclarationFragment StringLiteral table
table StringLiteral VariableDeclarationFragment VariableDeclarationStatement VariableDeclarationFragment SimpleName table
table StringLiteral VariableDeclarationFragment VariableDeclarationStatement VariableDeclarationFragment StringLiteral table
conn SimpleName MethodInvocation SimpleName table operations
conn SimpleName MethodInvocation MethodInvocation SimpleName create
table operations SimpleName MethodInvocation MethodInvocation SimpleName create
conn SimpleName MethodInvocation MethodInvocation SimpleName table
table operations SimpleName MethodInvocation MethodInvocation SimpleName table
create SimpleName MethodInvocation SimpleName table
conn SimpleName MethodInvocation SimpleName table operations
propertytable replication QualifiedName MethodInvocation SimpleName get key
conn SimpleName MethodInvocation MethodInvocation SimpleName set property
table operations SimpleName MethodInvocation MethodInvocation SimpleName set property
conn SimpleName MethodInvocation MethodInvocation SimpleName table
table operations SimpleName MethodInvocation MethodInvocation SimpleName table
conn SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName propertytable replication
conn SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get key
table operations SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName propertytable replication
table operations SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get key
conn SimpleName MethodInvocation MethodInvocation StringLiteral true
table operations SimpleName MethodInvocation MethodInvocation StringLiteral true
set property SimpleName MethodInvocation SimpleName table
set property SimpleName MethodInvocation MethodInvocation QualifiedName propertytable replication
set property SimpleName MethodInvocation MethodInvocation SimpleName get key
set property SimpleName MethodInvocation StringLiteral true
table SimpleName MethodInvocation MethodInvocation QualifiedName propertytable replication
table SimpleName MethodInvocation MethodInvocation SimpleName get key
table SimpleName MethodInvocation StringLiteral true
propertytable replication QualifiedName MethodInvocation MethodInvocation StringLiteral true
get key SimpleName MethodInvocation MethodInvocation StringLiteral true
conn SimpleName MethodInvocation SimpleName table operations
propertytable replication target QualifiedName MethodInvocation SimpleName get key
propertytable replication target QualifiedName MethodInvocation InfixExpression StringLiteral cluster
get key SimpleName MethodInvocation InfixExpression StringLiteral cluster
conn SimpleName MethodInvocation MethodInvocation SimpleName set property
table operations SimpleName MethodInvocation MethodInvocation SimpleName set property
conn SimpleName MethodInvocation MethodInvocation SimpleName table
table operations SimpleName MethodInvocation MethodInvocation SimpleName table
conn SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral cluster
table operations SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral cluster
conn SimpleName MethodInvocation MethodInvocation StringLiteral empty
table operations SimpleName MethodInvocation MethodInvocation StringLiteral empty
set property SimpleName MethodInvocation SimpleName table
set property SimpleName MethodInvocation InfixExpression MethodInvocation QualifiedName propertytable replication target
set property SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get key
set property SimpleName MethodInvocation InfixExpression StringLiteral cluster
set property SimpleName MethodInvocation StringLiteral empty
table SimpleName MethodInvocation InfixExpression MethodInvocation QualifiedName propertytable replication target
table SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get key
table SimpleName MethodInvocation InfixExpression StringLiteral cluster
table SimpleName MethodInvocation StringLiteral empty
propertytable replication target QualifiedName MethodInvocation InfixExpression MethodInvocation StringLiteral empty
get key SimpleName MethodInvocation InfixExpression MethodInvocation StringLiteral empty
cluster StringLiteral InfixExpression MethodInvocation StringLiteral empty
conn SimpleName MethodInvocation SimpleName table operations
conn SimpleName MethodInvocation MethodInvocation SimpleName create
table operations SimpleName MethodInvocation MethodInvocation SimpleName create
conn SimpleName MethodInvocation MethodInvocation SimpleName table
table operations SimpleName MethodInvocation MethodInvocation SimpleName table
create SimpleName MethodInvocation SimpleName table
conn SimpleName MethodInvocation SimpleName table operations
propertytable replication QualifiedName MethodInvocation SimpleName get key
conn SimpleName MethodInvocation MethodInvocation SimpleName set property
table operations SimpleName MethodInvocation MethodInvocation SimpleName set property
conn SimpleName MethodInvocation MethodInvocation SimpleName table
table operations SimpleName MethodInvocation MethodInvocation SimpleName table
conn SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName propertytable replication
conn SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get key
table operations SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName propertytable replication
table operations SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get key
conn SimpleName MethodInvocation MethodInvocation StringLiteral true
table operations SimpleName MethodInvocation MethodInvocation StringLiteral true
set property SimpleName MethodInvocation SimpleName table
set property SimpleName MethodInvocation MethodInvocation QualifiedName propertytable replication
set property SimpleName MethodInvocation MethodInvocation SimpleName get key
set property SimpleName MethodInvocation StringLiteral true
table SimpleName MethodInvocation MethodInvocation QualifiedName propertytable replication
table SimpleName MethodInvocation MethodInvocation SimpleName get key
table SimpleName MethodInvocation StringLiteral true
propertytable replication QualifiedName MethodInvocation MethodInvocation StringLiteral true
get key SimpleName MethodInvocation MethodInvocation StringLiteral true
conn SimpleName MethodInvocation SimpleName table operations
propertytable replication target QualifiedName MethodInvocation SimpleName get key
propertytable replication target QualifiedName MethodInvocation InfixExpression StringLiteral cluster
get key SimpleName MethodInvocation InfixExpression StringLiteral cluster
conn SimpleName MethodInvocation MethodInvocation SimpleName set property
table operations SimpleName MethodInvocation MethodInvocation SimpleName set property
conn SimpleName MethodInvocation MethodInvocation SimpleName table
table operations SimpleName MethodInvocation MethodInvocation SimpleName table
conn SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral cluster
table operations SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral cluster
conn SimpleName MethodInvocation MethodInvocation StringLiteral empty
table operations SimpleName MethodInvocation MethodInvocation StringLiteral empty
set property SimpleName MethodInvocation SimpleName table
set property SimpleName MethodInvocation InfixExpression MethodInvocation QualifiedName propertytable replication target
set property SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get key
set property SimpleName MethodInvocation InfixExpression StringLiteral cluster
set property SimpleName MethodInvocation StringLiteral empty
table SimpleName MethodInvocation InfixExpression MethodInvocation QualifiedName propertytable replication target
table SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get key
table SimpleName MethodInvocation InfixExpression StringLiteral cluster
table SimpleName MethodInvocation StringLiteral empty
propertytable replication target QualifiedName MethodInvocation InfixExpression MethodInvocation StringLiteral empty
get key SimpleName MethodInvocation InfixExpression MethodInvocation StringLiteral empty
cluster StringLiteral InfixExpression MethodInvocation StringLiteral empty
conn SimpleName MethodInvocation SimpleName table operations
conn SimpleName MethodInvocation MethodInvocation SimpleName create
table operations SimpleName MethodInvocation MethodInvocation SimpleName create
conn SimpleName MethodInvocation MethodInvocation SimpleName table
table operations SimpleName MethodInvocation MethodInvocation SimpleName table
create SimpleName MethodInvocation SimpleName table
conn SimpleName MethodInvocation SimpleName table operations
propertytable replication QualifiedName MethodInvocation SimpleName get key
conn SimpleName MethodInvocation MethodInvocation SimpleName set property
table operations SimpleName MethodInvocation MethodInvocation SimpleName set property
conn SimpleName MethodInvocation MethodInvocation SimpleName table
table operations SimpleName MethodInvocation MethodInvocation SimpleName table
conn SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName propertytable replication
conn SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get key
table operations SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName propertytable replication
table operations SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get key
conn SimpleName MethodInvocation MethodInvocation StringLiteral true
table operations SimpleName MethodInvocation MethodInvocation StringLiteral true
set property SimpleName MethodInvocation SimpleName table
set property SimpleName MethodInvocation MethodInvocation QualifiedName propertytable replication
set property SimpleName MethodInvocation MethodInvocation SimpleName get key
set property SimpleName MethodInvocation StringLiteral true
table SimpleName MethodInvocation MethodInvocation QualifiedName propertytable replication
table SimpleName MethodInvocation MethodInvocation SimpleName get key
table SimpleName MethodInvocation StringLiteral true
propertytable replication QualifiedName MethodInvocation MethodInvocation StringLiteral true
get key SimpleName MethodInvocation MethodInvocation StringLiteral true
conn SimpleName MethodInvocation SimpleName table operations
propertytable replication target QualifiedName MethodInvocation SimpleName get key
propertytable replication target QualifiedName MethodInvocation InfixExpression StringLiteral cluster
get key SimpleName MethodInvocation InfixExpression StringLiteral cluster
conn SimpleName MethodInvocation MethodInvocation SimpleName set property
table operations SimpleName MethodInvocation MethodInvocation SimpleName set property
conn SimpleName MethodInvocation MethodInvocation SimpleName table
table operations SimpleName MethodInvocation MethodInvocation SimpleName table
conn SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral cluster
table operations SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral cluster
conn SimpleName MethodInvocation MethodInvocation StringLiteral empty
table operations SimpleName MethodInvocation MethodInvocation StringLiteral empty
set property SimpleName MethodInvocation SimpleName table
set property SimpleName MethodInvocation InfixExpression MethodInvocation QualifiedName propertytable replication target
set property SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get key
set property SimpleName MethodInvocation InfixExpression StringLiteral cluster
set property SimpleName MethodInvocation StringLiteral empty
table SimpleName MethodInvocation InfixExpression MethodInvocation QualifiedName propertytable replication target
table SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get key
table SimpleName MethodInvocation InfixExpression StringLiteral cluster
table SimpleName MethodInvocation StringLiteral empty
propertytable replication target QualifiedName MethodInvocation InfixExpression MethodInvocation StringLiteral empty
get key SimpleName MethodInvocation InfixExpression MethodInvocation StringLiteral empty
cluster StringLiteral InfixExpression MethodInvocation StringLiteral empty
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
rows SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName rows
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
rows SimpleName InfixExpression NumberLiteral empty
integer SimpleName MethodInvocation SimpleName to string
integer SimpleName MethodInvocation SimpleName rows
to string SimpleName MethodInvocation SimpleName rows
mutation SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName integer
mutation SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName to string
mutation SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName rows
m SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName mutation
m SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName integer
m SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName to string
m SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName rows
mutation SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName m
cols SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName cols
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
cols SimpleName InfixExpression NumberLiteral empty
integer SimpleName MethodInvocation SimpleName to string
integer SimpleName MethodInvocation SimpleName cols
to string SimpleName MethodInvocation SimpleName cols
value SimpleName VariableDeclarationFragment MethodInvocation SimpleName integer
value SimpleName VariableDeclarationFragment MethodInvocation SimpleName to string
value SimpleName VariableDeclarationFragment MethodInvocation SimpleName cols
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName value
m SimpleName MethodInvocation SimpleName put
m SimpleName MethodInvocation SimpleName value
m SimpleName MethodInvocation StringLiteral empty
m SimpleName MethodInvocation SimpleName value
put SimpleName MethodInvocation SimpleName value
put SimpleName MethodInvocation StringLiteral empty
put SimpleName MethodInvocation SimpleName value
value SimpleName MethodInvocation StringLiteral empty
value SimpleName MethodInvocation SimpleName value
empty StringLiteral MethodInvocation SimpleName value
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName cols
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression NumberLiteral empty
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName cols
cols SimpleName InfixExpression ForStatement PostfixExpression SimpleName cols
empty NumberLiteral InfixExpression ForStatement PostfixExpression SimpleName cols
bw SimpleName MethodInvocation SimpleName add mutation
bw SimpleName MethodInvocation SimpleName m
add mutation SimpleName MethodInvocation SimpleName m
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName rows
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression NumberLiteral empty
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName rows
rows SimpleName InfixExpression ForStatement PostfixExpression SimpleName rows
empty NumberLiteral InfixExpression ForStatement PostfixExpression SimpleName rows
bw SimpleName MethodInvocation SimpleName close
conn SimpleName MethodInvocation SimpleName create batch writer
conn SimpleName MethodInvocation SimpleName table
conn SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName batch writer config
create batch writer SimpleName MethodInvocation SimpleName table
create batch writer SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName batch writer config
table SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName batch writer config
bw SimpleName Assignment MethodInvocation SimpleName conn
bw SimpleName Assignment MethodInvocation SimpleName create batch writer
bw SimpleName Assignment MethodInvocation SimpleName table
rows SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName rows
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
rows SimpleName InfixExpression NumberLiteral empty
integer SimpleName MethodInvocation SimpleName to string
integer SimpleName MethodInvocation SimpleName rows
to string SimpleName MethodInvocation SimpleName rows
mutation SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName integer
mutation SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName to string
mutation SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName rows
m SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName mutation
m SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName integer
m SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName to string
m SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName rows
mutation SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName m
cols SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName cols
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
cols SimpleName InfixExpression NumberLiteral empty
integer SimpleName MethodInvocation SimpleName to string
integer SimpleName MethodInvocation SimpleName cols
to string SimpleName MethodInvocation SimpleName cols
value SimpleName VariableDeclarationFragment MethodInvocation SimpleName integer
value SimpleName VariableDeclarationFragment MethodInvocation SimpleName to string
value SimpleName VariableDeclarationFragment MethodInvocation SimpleName cols
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName value
m SimpleName MethodInvocation SimpleName put
m SimpleName MethodInvocation SimpleName value
m SimpleName MethodInvocation StringLiteral empty
m SimpleName MethodInvocation SimpleName value
put SimpleName MethodInvocation SimpleName value
put SimpleName MethodInvocation StringLiteral empty
put SimpleName MethodInvocation SimpleName value
value SimpleName MethodInvocation StringLiteral empty
value SimpleName MethodInvocation SimpleName value
empty StringLiteral MethodInvocation SimpleName value
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName cols
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression NumberLiteral empty
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName cols
cols SimpleName InfixExpression ForStatement PostfixExpression SimpleName cols
empty NumberLiteral InfixExpression ForStatement PostfixExpression SimpleName cols
bw SimpleName MethodInvocation SimpleName add mutation
bw SimpleName MethodInvocation SimpleName m
add mutation SimpleName MethodInvocation SimpleName m
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName rows
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression NumberLiteral empty
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName rows
rows SimpleName InfixExpression ForStatement PostfixExpression SimpleName rows
empty NumberLiteral InfixExpression ForStatement PostfixExpression SimpleName rows
bw SimpleName MethodInvocation SimpleName close
conn SimpleName MethodInvocation SimpleName create batch writer
conn SimpleName MethodInvocation SimpleName table
conn SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName batch writer config
create batch writer SimpleName MethodInvocation SimpleName table
create batch writer SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName batch writer config
table SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName batch writer config
bw SimpleName Assignment MethodInvocation SimpleName conn
bw SimpleName Assignment MethodInvocation SimpleName create batch writer
bw SimpleName Assignment MethodInvocation SimpleName table
rows SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName rows
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
rows SimpleName InfixExpression NumberLiteral empty
integer SimpleName MethodInvocation SimpleName to string
integer SimpleName MethodInvocation SimpleName rows
to string SimpleName MethodInvocation SimpleName rows
mutation SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName integer
mutation SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName to string
mutation SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName rows
m SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName mutation
m SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName integer
m SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName to string
m SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName rows
mutation SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName m
cols SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName cols
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
cols SimpleName InfixExpression NumberLiteral empty
integer SimpleName MethodInvocation SimpleName to string
integer SimpleName MethodInvocation SimpleName cols
to string SimpleName MethodInvocation SimpleName cols
value SimpleName VariableDeclarationFragment MethodInvocation SimpleName integer
value SimpleName VariableDeclarationFragment MethodInvocation SimpleName to string
value SimpleName VariableDeclarationFragment MethodInvocation SimpleName cols
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName value
m SimpleName MethodInvocation SimpleName put
m SimpleName MethodInvocation SimpleName value
m SimpleName MethodInvocation StringLiteral empty
m SimpleName MethodInvocation SimpleName value
put SimpleName MethodInvocation SimpleName value
put SimpleName MethodInvocation StringLiteral empty
put SimpleName MethodInvocation SimpleName value
value SimpleName MethodInvocation StringLiteral empty
value SimpleName MethodInvocation SimpleName value
empty StringLiteral MethodInvocation SimpleName value
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName cols
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression NumberLiteral empty
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName cols
cols SimpleName InfixExpression ForStatement PostfixExpression SimpleName cols
empty NumberLiteral InfixExpression ForStatement PostfixExpression SimpleName cols
bw SimpleName MethodInvocation SimpleName add mutation
bw SimpleName MethodInvocation SimpleName m
add mutation SimpleName MethodInvocation SimpleName m
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName rows
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression NumberLiteral empty
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName rows
rows SimpleName InfixExpression ForStatement PostfixExpression SimpleName rows
empty NumberLiteral InfixExpression ForStatement PostfixExpression SimpleName rows
bw SimpleName MethodInvocation SimpleName close
string SimpleName SimpleType SingleVariableDeclaration SimpleName table
arrays SimpleName MethodInvocation SimpleName as list
arrays SimpleName MethodInvocation SimpleName table
arrays SimpleName MethodInvocation SimpleName table
arrays SimpleName MethodInvocation SimpleName table
as list SimpleName MethodInvocation SimpleName table
as list SimpleName MethodInvocation SimpleName table
as list SimpleName MethodInvocation SimpleName table
table SimpleName MethodInvocation SimpleName table
table SimpleName MethodInvocation SimpleName table
table SimpleName MethodInvocation SimpleName table
conn SimpleName MethodInvocation SimpleName table operations
conn SimpleName MethodInvocation MethodInvocation SimpleName flush
table operations SimpleName MethodInvocation MethodInvocation SimpleName flush
conn SimpleName MethodInvocation MethodInvocation SimpleName table
table operations SimpleName MethodInvocation MethodInvocation SimpleName table
conn SimpleName MethodInvocation MethodInvocation BooleanLiteral true
table operations SimpleName MethodInvocation MethodInvocation BooleanLiteral true
flush SimpleName MethodInvocation SimpleName table
flush SimpleName MethodInvocation BooleanLiteral true
table SimpleName MethodInvocation BooleanLiteral true
table SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName arrays
table SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName as list
table SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName table
table SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName table
table SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName table
keep running SimpleName MethodInvocation SimpleName set
keep running SimpleName MethodInvocation BooleanLiteral false
set SimpleName MethodInvocation BooleanLiteral false
t SimpleName MethodInvocation SimpleName join
t SimpleName MethodInvocation NumberLiteral empty
join SimpleName MethodInvocation NumberLiteral empty
string SimpleName SimpleType SingleVariableDeclaration SimpleName table
arrays SimpleName MethodInvocation SimpleName as list
arrays SimpleName MethodInvocation QualifiedName metadata tablename
arrays SimpleName MethodInvocation SimpleName table
arrays SimpleName MethodInvocation SimpleName table
arrays SimpleName MethodInvocation SimpleName table
as list SimpleName MethodInvocation QualifiedName metadata tablename
as list SimpleName MethodInvocation SimpleName table
as list SimpleName MethodInvocation SimpleName table
as list SimpleName MethodInvocation SimpleName table
metadata tablename QualifiedName MethodInvocation SimpleName table
metadata tablename QualifiedName MethodInvocation SimpleName table
metadata tablename QualifiedName MethodInvocation SimpleName table
table SimpleName MethodInvocation SimpleName table
table SimpleName MethodInvocation SimpleName table
table SimpleName MethodInvocation SimpleName table
conn SimpleName MethodInvocation SimpleName create scanner
conn SimpleName MethodInvocation SimpleName table
conn SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName authorizations
create scanner SimpleName MethodInvocation SimpleName table
create scanner SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName authorizations
table SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName authorizations
s SimpleName VariableDeclarationFragment MethodInvocation SimpleName conn
s SimpleName VariableDeclarationFragment MethodInvocation SimpleName create scanner
s SimpleName VariableDeclarationFragment MethodInvocation SimpleName table
scanner SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName s
suppress warnings SimpleName SingleMemberAnnotation StringLiteral unused
entry SimpleName SimpleType ParameterizedType SimpleType SimpleName key
entry SimpleName SimpleType ParameterizedType SimpleType SimpleName value
key SimpleName SimpleType ParameterizedType SimpleType SimpleName value
suppress warnings SimpleName SingleMemberAnnotation SingleVariableDeclaration SimpleName entry
unused StringLiteral SingleMemberAnnotation SingleVariableDeclaration SimpleName entry
entry SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName entry
key SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName entry
value SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName entry
suppress warnings SimpleName SingleMemberAnnotation SingleVariableDeclaration EnhancedForStatement SimpleName s
unused StringLiteral SingleMemberAnnotation SingleVariableDeclaration EnhancedForStatement SimpleName s
entry SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName s
table SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName arrays
table SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName as list
