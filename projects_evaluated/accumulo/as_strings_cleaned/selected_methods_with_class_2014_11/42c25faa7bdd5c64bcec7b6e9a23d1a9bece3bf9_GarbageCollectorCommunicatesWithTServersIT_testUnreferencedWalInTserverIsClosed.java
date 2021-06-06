get unique names SimpleName MethodInvocation NumberLiteral empty
names SimpleName VariableDeclarationFragment MethodInvocation SimpleName get unique names
names SimpleName VariableDeclarationFragment MethodInvocation NumberLiteral empty
final Modifier VariableDeclarationStatement ArrayType SimpleType SimpleName string
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName names
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get unique names
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation NumberLiteral empty
names SimpleName ArrayAccess NumberLiteral empty
table SimpleName VariableDeclarationFragment ArrayAccess SimpleName names
table SimpleName VariableDeclarationFragment ArrayAccess NumberLiteral empty
names SimpleName ArrayAccess NumberLiteral empty
other table SimpleName VariableDeclarationFragment ArrayAccess SimpleName names
other table SimpleName VariableDeclarationFragment ArrayAccess NumberLiteral empty
final Modifier VariableDeclarationStatement SimpleType SimpleName string
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName table
final Modifier VariableDeclarationStatement VariableDeclarationFragment ArrayAccess SimpleName names
final Modifier VariableDeclarationStatement VariableDeclarationFragment ArrayAccess NumberLiteral empty
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName other table
final Modifier VariableDeclarationStatement VariableDeclarationFragment ArrayAccess SimpleName names
final Modifier VariableDeclarationStatement VariableDeclarationFragment ArrayAccess NumberLiteral empty
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName other table
table SimpleName VariableDeclarationFragment VariableDeclarationStatement VariableDeclarationFragment SimpleName other table
conn SimpleName VariableDeclarationFragment MethodInvocation SimpleName get connector
final Modifier VariableDeclarationStatement SimpleType SimpleName connector
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName conn
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get connector
connector SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName conn
replication table SimpleName MethodInvocation SimpleName set online
replication table SimpleName MethodInvocation SimpleName conn
set online SimpleName MethodInvocation SimpleName conn
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation StringLiteral creating {}
log SimpleName MethodInvocation SimpleName table
info SimpleName MethodInvocation StringLiteral creating {}
info SimpleName MethodInvocation SimpleName table
creating {} StringLiteral MethodInvocation SimpleName table
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
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation StringLiteral writing a few mutations to the table
info SimpleName MethodInvocation StringLiteral writing a few mutations to the table
conn SimpleName MethodInvocation SimpleName create batch writer
conn SimpleName MethodInvocation SimpleName table
create batch writer SimpleName MethodInvocation SimpleName table
bw SimpleName VariableDeclarationFragment MethodInvocation SimpleName conn
bw SimpleName VariableDeclarationFragment MethodInvocation SimpleName create batch writer
bw SimpleName VariableDeclarationFragment MethodInvocation SimpleName table
batch writer SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName bw
byte PrimitiveType ArrayType ArrayCreation NumberLiteral empty
empty SimpleName VariableDeclarationFragment ArrayCreation ArrayType PrimitiveType byte
empty SimpleName VariableDeclarationFragment ArrayCreation NumberLiteral empty
byte PrimitiveType ArrayType VariableDeclarationStatement VariableDeclarationFragment SimpleName empty
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression NumberLiteral empty
integer SimpleName MethodInvocation SimpleName to string
integer SimpleName MethodInvocation SimpleName i
to string SimpleName MethodInvocation SimpleName i
mutation SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName integer
mutation SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName to string
mutation SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName i
m SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName mutation
m SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName integer
m SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName to string
m SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName i
mutation SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName m
m SimpleName MethodInvocation SimpleName put
m SimpleName MethodInvocation SimpleName empty
m SimpleName MethodInvocation SimpleName empty
m SimpleName MethodInvocation SimpleName empty
put SimpleName MethodInvocation SimpleName empty
put SimpleName MethodInvocation SimpleName empty
put SimpleName MethodInvocation SimpleName empty
empty SimpleName MethodInvocation SimpleName empty
empty SimpleName MethodInvocation SimpleName empty
empty SimpleName MethodInvocation SimpleName empty
bw SimpleName MethodInvocation SimpleName add mutation
bw SimpleName MethodInvocation SimpleName m
add mutation SimpleName MethodInvocation SimpleName m
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression NumberLiteral empty
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
empty NumberLiteral InfixExpression ForStatement PostfixExpression SimpleName i
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation StringLiteral flushing mutations to the server
info SimpleName MethodInvocation StringLiteral flushing mutations to the server
bw SimpleName MethodInvocation SimpleName close
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation StringLiteral checking that metadata only has one wal recorded for this table
info SimpleName MethodInvocation StringLiteral checking that metadata only has one wal recorded for this table
set SimpleName SimpleType ParameterizedType SimpleType SimpleName string
get wals for table SimpleName MethodInvocation SimpleName table
wals SimpleName VariableDeclarationFragment MethodInvocation SimpleName get wals for table
wals SimpleName VariableDeclarationFragment MethodInvocation SimpleName table
wals SimpleName MethodInvocation SimpleName size
assert SimpleName MethodInvocation SimpleName assert equals
assert SimpleName MethodInvocation StringLiteral expected to only find one wal for the table
assert SimpleName MethodInvocation NumberLiteral empty
assert SimpleName MethodInvocation MethodInvocation SimpleName wals
assert SimpleName MethodInvocation MethodInvocation SimpleName size
assert equals SimpleName MethodInvocation StringLiteral expected to only find one wal for the table
assert equals SimpleName MethodInvocation NumberLiteral empty
assert equals SimpleName MethodInvocation MethodInvocation SimpleName wals
assert equals SimpleName MethodInvocation MethodInvocation SimpleName size
expected to only find one wal for the table StringLiteral MethodInvocation NumberLiteral empty
expected to only find one wal for the table StringLiteral MethodInvocation MethodInvocation SimpleName wals
expected to only find one wal for the table StringLiteral MethodInvocation MethodInvocation SimpleName size
empty NumberLiteral MethodInvocation MethodInvocation SimpleName wals
empty NumberLiteral MethodInvocation MethodInvocation SimpleName size
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation StringLiteral compacting the table which will remove all wa ls from the tablets
info SimpleName MethodInvocation StringLiteral compacting the table which will remove all wa ls from the tablets
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
conn SimpleName MethodInvocation SimpleName table operations
conn SimpleName MethodInvocation MethodInvocation SimpleName flush
table operations SimpleName MethodInvocation MethodInvocation SimpleName flush
conn SimpleName MethodInvocation MethodInvocation QualifiedName metadata tablename
table operations SimpleName MethodInvocation MethodInvocation QualifiedName metadata tablename
conn SimpleName MethodInvocation MethodInvocation BooleanLiteral true
table operations SimpleName MethodInvocation MethodInvocation BooleanLiteral true
flush SimpleName MethodInvocation QualifiedName metadata tablename
flush SimpleName MethodInvocation BooleanLiteral true
metadata tablename QualifiedName MethodInvocation BooleanLiteral true
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation StringLiteral fetching replication statuses from metadata table
info SimpleName MethodInvocation StringLiteral fetching replication statuses from metadata table
map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
map SimpleName SimpleType ParameterizedType SimpleType SimpleName status
string SimpleName SimpleType ParameterizedType SimpleType SimpleName status
get metadata status for table SimpleName MethodInvocation SimpleName table
file to status SimpleName VariableDeclarationFragment MethodInvocation SimpleName get metadata status for table
file to status SimpleName VariableDeclarationFragment MethodInvocation SimpleName table
file to status SimpleName MethodInvocation SimpleName size
assert SimpleName MethodInvocation SimpleName assert equals
assert SimpleName MethodInvocation StringLiteral expected to only find one replication status message
assert SimpleName MethodInvocation NumberLiteral empty
assert SimpleName MethodInvocation MethodInvocation SimpleName file to status
assert SimpleName MethodInvocation MethodInvocation SimpleName size
assert equals SimpleName MethodInvocation StringLiteral expected to only find one replication status message
assert equals SimpleName MethodInvocation NumberLiteral empty
assert equals SimpleName MethodInvocation MethodInvocation SimpleName file to status
assert equals SimpleName MethodInvocation MethodInvocation SimpleName size
expected to only find one replication status message StringLiteral MethodInvocation NumberLiteral empty
expected to only find one replication status message StringLiteral MethodInvocation MethodInvocation SimpleName file to status
expected to only find one replication status message StringLiteral MethodInvocation MethodInvocation SimpleName size
empty NumberLiteral MethodInvocation MethodInvocation SimpleName file to status
empty NumberLiteral MethodInvocation MethodInvocation SimpleName size
file to status SimpleName MethodInvocation SimpleName key set
file to status SimpleName MethodInvocation MethodInvocation SimpleName iterator
key set SimpleName MethodInvocation MethodInvocation SimpleName iterator
file to status SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName next
key set SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName next
iterator SimpleName MethodInvocation MethodInvocation SimpleName next
wal name SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName iterator
wal name SimpleName VariableDeclarationFragment MethodInvocation SimpleName next
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName wal name
wals SimpleName MethodInvocation SimpleName iterator
wals SimpleName MethodInvocation MethodInvocation SimpleName next
iterator SimpleName MethodInvocation MethodInvocation SimpleName next
assert SimpleName MethodInvocation SimpleName assert equals
assert SimpleName MethodInvocation StringLiteral expected log file name from tablet to equal replication entry
assert SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName wals
assert SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName iterator
assert SimpleName MethodInvocation MethodInvocation SimpleName next
assert SimpleName MethodInvocation SimpleName wal name
assert equals SimpleName MethodInvocation StringLiteral expected log file name from tablet to equal replication entry
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName wals
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName iterator
assert equals SimpleName MethodInvocation MethodInvocation SimpleName next
assert equals SimpleName MethodInvocation SimpleName wal name
expected log file name from tablet to equal replication entry StringLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName wals
expected log file name from tablet to equal replication entry StringLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName iterator
expected log file name from tablet to equal replication entry StringLiteral MethodInvocation MethodInvocation SimpleName next
expected log file name from tablet to equal replication entry StringLiteral MethodInvocation SimpleName wal name
wals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName wal name
iterator SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName wal name
next SimpleName MethodInvocation MethodInvocation SimpleName wal name
file to status SimpleName MethodInvocation SimpleName get
file to status SimpleName MethodInvocation SimpleName wal name
get SimpleName MethodInvocation SimpleName wal name
status SimpleName VariableDeclarationFragment MethodInvocation SimpleName file to status
status SimpleName VariableDeclarationFragment MethodInvocation SimpleName get
status SimpleName VariableDeclarationFragment MethodInvocation SimpleName wal name
status SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName status
status SimpleName MethodInvocation SimpleName get closed
assert SimpleName MethodInvocation SimpleName assert equals
assert SimpleName MethodInvocation StringLiteral expected status for file to not be closed
assert SimpleName MethodInvocation BooleanLiteral false
assert SimpleName MethodInvocation MethodInvocation SimpleName status
assert SimpleName MethodInvocation MethodInvocation SimpleName get closed
assert equals SimpleName MethodInvocation StringLiteral expected status for file to not be closed
assert equals SimpleName MethodInvocation BooleanLiteral false
assert equals SimpleName MethodInvocation MethodInvocation SimpleName status
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get closed
expected status for file to not be closed StringLiteral MethodInvocation BooleanLiteral false
expected status for file to not be closed StringLiteral MethodInvocation MethodInvocation SimpleName status
expected status for file to not be closed StringLiteral MethodInvocation MethodInvocation SimpleName get closed
false BooleanLiteral MethodInvocation MethodInvocation SimpleName status
false BooleanLiteral MethodInvocation MethodInvocation SimpleName get closed
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation StringLiteral checking to see that log entries are removed from tablet section after min c
info SimpleName MethodInvocation StringLiteral checking to see that log entries are removed from tablet section after min c
set SimpleName SimpleType ParameterizedType SimpleType SimpleName string
get wals for table SimpleName MethodInvocation SimpleName table
wals after minc SimpleName VariableDeclarationFragment MethodInvocation SimpleName get wals for table
wals after minc SimpleName VariableDeclarationFragment MethodInvocation SimpleName table
wals after minc SimpleName MethodInvocation SimpleName size
assert SimpleName MethodInvocation SimpleName assert equals
assert SimpleName MethodInvocation StringLiteral expected to find no wa ls for tablet
assert SimpleName MethodInvocation NumberLiteral empty
assert SimpleName MethodInvocation MethodInvocation SimpleName wals after minc
assert SimpleName MethodInvocation MethodInvocation SimpleName size
assert equals SimpleName MethodInvocation StringLiteral expected to find no wa ls for tablet
assert equals SimpleName MethodInvocation NumberLiteral empty
assert equals SimpleName MethodInvocation MethodInvocation SimpleName wals after minc
assert equals SimpleName MethodInvocation MethodInvocation SimpleName size
expected to find no wa ls for tablet StringLiteral MethodInvocation NumberLiteral empty
expected to find no wa ls for tablet StringLiteral MethodInvocation MethodInvocation SimpleName wals after minc
expected to find no wa ls for tablet StringLiteral MethodInvocation MethodInvocation SimpleName size
empty NumberLiteral MethodInvocation MethodInvocation SimpleName wals after minc
empty NumberLiteral MethodInvocation MethodInvocation SimpleName size
set SimpleName SimpleType ParameterizedType SimpleType SimpleName string
get files for table SimpleName MethodInvocation SimpleName table
files for table SimpleName VariableDeclarationFragment MethodInvocation SimpleName get files for table
files for table SimpleName VariableDeclarationFragment MethodInvocation SimpleName table
files for table SimpleName MethodInvocation SimpleName size
assert SimpleName MethodInvocation SimpleName assert equals
assert SimpleName MethodInvocation StringLiteral expected to only find one rfile for table
assert SimpleName MethodInvocation NumberLiteral empty
assert SimpleName MethodInvocation MethodInvocation SimpleName files for table
assert SimpleName MethodInvocation MethodInvocation SimpleName size
assert equals SimpleName MethodInvocation StringLiteral expected to only find one rfile for table
assert equals SimpleName MethodInvocation NumberLiteral empty
assert equals SimpleName MethodInvocation MethodInvocation SimpleName files for table
assert equals SimpleName MethodInvocation MethodInvocation SimpleName size
expected to only find one rfile for table StringLiteral MethodInvocation NumberLiteral empty
expected to only find one rfile for table StringLiteral MethodInvocation MethodInvocation SimpleName files for table
expected to only find one rfile for table StringLiteral MethodInvocation MethodInvocation SimpleName size
empty NumberLiteral MethodInvocation MethodInvocation SimpleName files for table
empty NumberLiteral MethodInvocation MethodInvocation SimpleName size
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation StringLiteral files for table before maj c {}
log SimpleName MethodInvocation SimpleName files for table
info SimpleName MethodInvocation StringLiteral files for table before maj c {}
info SimpleName MethodInvocation SimpleName files for table
files for table before maj c {} StringLiteral MethodInvocation SimpleName files for table
conn SimpleName MethodInvocation SimpleName table operations
conn SimpleName MethodInvocation MethodInvocation SimpleName compact
table operations SimpleName MethodInvocation MethodInvocation SimpleName compact
conn SimpleName MethodInvocation MethodInvocation SimpleName table
table operations SimpleName MethodInvocation MethodInvocation SimpleName table
conn SimpleName MethodInvocation MethodInvocation BooleanLiteral false
table operations SimpleName MethodInvocation MethodInvocation BooleanLiteral false
compact SimpleName MethodInvocation SimpleName table
compact SimpleName MethodInvocation BooleanLiteral false
compact SimpleName MethodInvocation BooleanLiteral true
table SimpleName MethodInvocation BooleanLiteral false
table SimpleName MethodInvocation BooleanLiteral true
false BooleanLiteral MethodInvocation BooleanLiteral true
set SimpleName SimpleType ParameterizedType SimpleType SimpleName string
get files for table SimpleName MethodInvocation SimpleName table
files for table after compaction SimpleName VariableDeclarationFragment MethodInvocation SimpleName get files for table
files for table after compaction SimpleName VariableDeclarationFragment MethodInvocation SimpleName table
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation StringLiteral files for table after maj c {}
log SimpleName MethodInvocation SimpleName files for table after compaction
info SimpleName MethodInvocation StringLiteral files for table after maj c {}
info SimpleName MethodInvocation SimpleName files for table after compaction
files for table after maj c {} StringLiteral MethodInvocation SimpleName files for table after compaction
files for table after compaction SimpleName MethodInvocation SimpleName size
assert SimpleName MethodInvocation SimpleName assert equals
assert SimpleName MethodInvocation StringLiteral expected to only find one rfile for table
assert SimpleName MethodInvocation NumberLiteral empty
assert SimpleName MethodInvocation MethodInvocation SimpleName files for table after compaction
assert SimpleName MethodInvocation MethodInvocation SimpleName size
assert equals SimpleName MethodInvocation StringLiteral expected to only find one rfile for table
assert equals SimpleName MethodInvocation NumberLiteral empty
assert equals SimpleName MethodInvocation MethodInvocation SimpleName files for table after compaction
assert equals SimpleName MethodInvocation MethodInvocation SimpleName size
expected to only find one rfile for table StringLiteral MethodInvocation NumberLiteral empty
expected to only find one rfile for table StringLiteral MethodInvocation MethodInvocation SimpleName files for table after compaction
expected to only find one rfile for table StringLiteral MethodInvocation MethodInvocation SimpleName size
empty NumberLiteral MethodInvocation MethodInvocation SimpleName files for table after compaction
empty NumberLiteral MethodInvocation MethodInvocation SimpleName size
assert SimpleName MethodInvocation SimpleName assert not equals
assert SimpleName MethodInvocation StringLiteral expected the files before and after compaction to differ
assert SimpleName MethodInvocation SimpleName files for table after compaction
assert SimpleName MethodInvocation SimpleName files for table
assert not equals SimpleName MethodInvocation StringLiteral expected the files before and after compaction to differ
assert not equals SimpleName MethodInvocation SimpleName files for table after compaction
assert not equals SimpleName MethodInvocation SimpleName files for table
expected the files before and after compaction to differ StringLiteral MethodInvocation SimpleName files for table after compaction
expected the files before and after compaction to differ StringLiteral MethodInvocation SimpleName files for table
files for table after compaction SimpleName MethodInvocation SimpleName files for table
files for table SimpleName MethodInvocation SimpleName iterator
files for table SimpleName MethodInvocation MethodInvocation SimpleName next
iterator SimpleName MethodInvocation MethodInvocation SimpleName next
path SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName next
file to be deleted SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName path
file to be deleted SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName next
path SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName file to be deleted
file to be deleted SimpleName MethodInvocation SimpleName get file system
file to be deleted SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName configuration
get file system SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName configuration
fs SimpleName VariableDeclarationFragment MethodInvocation SimpleName file to be deleted
fs SimpleName VariableDeclarationFragment MethodInvocation SimpleName get file system
file system SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName fs
fs SimpleName MethodInvocation SimpleName exists
fs SimpleName MethodInvocation SimpleName file to be deleted
exists SimpleName MethodInvocation SimpleName file to be deleted
file exists SimpleName VariableDeclarationFragment MethodInvocation SimpleName fs
file exists SimpleName VariableDeclarationFragment MethodInvocation SimpleName exists
file exists SimpleName VariableDeclarationFragment MethodInvocation SimpleName file to be deleted
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName file exists
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName fs
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName exists
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName file to be deleted
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation StringLiteral file which should get deleted still exists {}
log SimpleName MethodInvocation SimpleName file to be deleted
info SimpleName MethodInvocation StringLiteral file which should get deleted still exists {}
info SimpleName MethodInvocation SimpleName file to be deleted
file which should get deleted still exists {} StringLiteral MethodInvocation SimpleName file to be deleted
thread SimpleName MethodInvocation SimpleName sleep
thread SimpleName MethodInvocation NumberLiteral empty
sleep SimpleName MethodInvocation NumberLiteral empty
fs SimpleName MethodInvocation SimpleName exists
fs SimpleName MethodInvocation SimpleName file to be deleted
exists SimpleName MethodInvocation SimpleName file to be deleted
file exists SimpleName Assignment MethodInvocation SimpleName fs
file exists SimpleName Assignment MethodInvocation SimpleName exists
file exists SimpleName Assignment MethodInvocation SimpleName file to be deleted
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation StringLiteral rechecking that wa ls are still not referenced for our table
info SimpleName MethodInvocation StringLiteral rechecking that wa ls are still not referenced for our table
set SimpleName SimpleType ParameterizedType SimpleType SimpleName string
get wals for table SimpleName MethodInvocation SimpleName table
wals after majc SimpleName VariableDeclarationFragment MethodInvocation SimpleName get wals for table
wals after majc SimpleName VariableDeclarationFragment MethodInvocation SimpleName table
expected to find no wa ls in tablets section StringLiteral InfixExpression SimpleName wals after majc
wals after majc SimpleName MethodInvocation SimpleName size
assert SimpleName MethodInvocation SimpleName assert equals
assert SimpleName MethodInvocation InfixExpression StringLiteral expected to find no wa ls in tablets section
assert SimpleName MethodInvocation InfixExpression SimpleName wals after majc
assert SimpleName MethodInvocation NumberLiteral empty
assert SimpleName MethodInvocation MethodInvocation SimpleName wals after majc
assert SimpleName MethodInvocation MethodInvocation SimpleName size
assert equals SimpleName MethodInvocation InfixExpression StringLiteral expected to find no wa ls in tablets section
assert equals SimpleName MethodInvocation InfixExpression SimpleName wals after majc
assert equals SimpleName MethodInvocation NumberLiteral empty
assert equals SimpleName MethodInvocation MethodInvocation SimpleName wals after majc
assert equals SimpleName MethodInvocation MethodInvocation SimpleName size
expected to find no wa ls in tablets section StringLiteral InfixExpression MethodInvocation NumberLiteral empty
wals after majc SimpleName InfixExpression MethodInvocation NumberLiteral empty
expected to find no wa ls in tablets section StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName wals after majc
expected to find no wa ls in tablets section StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName size
wals after majc SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName wals after majc
wals after majc SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName size
empty NumberLiteral MethodInvocation MethodInvocation SimpleName wals after majc
empty NumberLiteral MethodInvocation MethodInvocation SimpleName size
map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
map SimpleName SimpleType ParameterizedType SimpleType SimpleName status
string SimpleName SimpleType ParameterizedType SimpleType SimpleName status
get metadata status for table SimpleName MethodInvocation SimpleName table
file to status after minc SimpleName VariableDeclarationFragment MethodInvocation SimpleName get metadata status for table
file to status after minc SimpleName VariableDeclarationFragment MethodInvocation SimpleName table
expected to still find only one replication status message StringLiteral InfixExpression SimpleName file to status after minc
file to status after minc SimpleName MethodInvocation SimpleName size
assert SimpleName MethodInvocation SimpleName assert equals
assert SimpleName MethodInvocation InfixExpression StringLiteral expected to still find only one replication status message
assert SimpleName MethodInvocation InfixExpression SimpleName file to status after minc
assert SimpleName MethodInvocation NumberLiteral empty
assert SimpleName MethodInvocation MethodInvocation SimpleName file to status after minc
assert SimpleName MethodInvocation MethodInvocation SimpleName size
assert equals SimpleName MethodInvocation InfixExpression StringLiteral expected to still find only one replication status message
assert equals SimpleName MethodInvocation InfixExpression SimpleName file to status after minc
assert equals SimpleName MethodInvocation NumberLiteral empty
assert equals SimpleName MethodInvocation MethodInvocation SimpleName file to status after minc
assert equals SimpleName MethodInvocation MethodInvocation SimpleName size
expected to still find only one replication status message StringLiteral InfixExpression MethodInvocation NumberLiteral empty
file to status after minc SimpleName InfixExpression MethodInvocation NumberLiteral empty
expected to still find only one replication status message StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName file to status after minc
expected to still find only one replication status message StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName size
file to status after minc SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName file to status after minc
file to status after minc SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName size
empty NumberLiteral MethodInvocation MethodInvocation SimpleName file to status after minc
empty NumberLiteral MethodInvocation MethodInvocation SimpleName size
assert SimpleName MethodInvocation SimpleName assert equals
assert SimpleName MethodInvocation StringLiteral status before and after min c should be identical
assert SimpleName MethodInvocation SimpleName file to status
assert SimpleName MethodInvocation SimpleName file to status after minc
assert equals SimpleName MethodInvocation StringLiteral status before and after min c should be identical
assert equals SimpleName MethodInvocation SimpleName file to status
assert equals SimpleName MethodInvocation SimpleName file to status after minc
status before and after min c should be identical StringLiteral MethodInvocation SimpleName file to status
status before and after min c should be identical StringLiteral MethodInvocation SimpleName file to status after minc
file to status SimpleName MethodInvocation SimpleName file to status after minc
conn SimpleName MethodInvocation SimpleName table operations
conn SimpleName MethodInvocation MethodInvocation SimpleName create
table operations SimpleName MethodInvocation MethodInvocation SimpleName create
conn SimpleName MethodInvocation MethodInvocation SimpleName other table
table operations SimpleName MethodInvocation MethodInvocation SimpleName other table
create SimpleName MethodInvocation SimpleName other table
conn SimpleName MethodInvocation SimpleName create batch writer
conn SimpleName MethodInvocation SimpleName other table
create batch writer SimpleName MethodInvocation SimpleName other table
bw SimpleName Assignment MethodInvocation SimpleName conn
bw SimpleName Assignment MethodInvocation SimpleName create batch writer
bw SimpleName Assignment MethodInvocation SimpleName other table
empty NumberLiteral InfixExpression NumberLiteral empty
byte PrimitiveType ArrayType ArrayCreation InfixExpression NumberLiteral empty
byte PrimitiveType ArrayType ArrayCreation InfixExpression NumberLiteral empty
big value SimpleName VariableDeclarationFragment ArrayCreation ArrayType PrimitiveType byte
big value SimpleName VariableDeclarationFragment ArrayCreation InfixExpression NumberLiteral empty
big value SimpleName VariableDeclarationFragment ArrayCreation InfixExpression NumberLiteral empty
byte PrimitiveType ArrayType VariableDeclarationStatement VariableDeclarationFragment SimpleName big value
byte PrimitiveType CastExpression NumberLiteral empty
arrays SimpleName MethodInvocation SimpleName fill
arrays SimpleName MethodInvocation SimpleName big value
arrays SimpleName MethodInvocation CastExpression PrimitiveType byte
arrays SimpleName MethodInvocation CastExpression NumberLiteral empty
fill SimpleName MethodInvocation SimpleName big value
fill SimpleName MethodInvocation CastExpression PrimitiveType byte
fill SimpleName MethodInvocation CastExpression NumberLiteral empty
big value SimpleName MethodInvocation CastExpression PrimitiveType byte
big value SimpleName MethodInvocation CastExpression NumberLiteral empty
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression NumberLiteral empty
integer SimpleName MethodInvocation SimpleName to string
integer SimpleName MethodInvocation SimpleName i
to string SimpleName MethodInvocation SimpleName i
mutation SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName integer
mutation SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName to string
mutation SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName i
m SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName mutation
m SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName integer
m SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName to string
m SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName i
mutation SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName m
m SimpleName MethodInvocation SimpleName put
m SimpleName MethodInvocation SimpleName empty
m SimpleName MethodInvocation SimpleName empty
m SimpleName MethodInvocation SimpleName big value
put SimpleName MethodInvocation SimpleName empty
put SimpleName MethodInvocation SimpleName empty
put SimpleName MethodInvocation SimpleName big value
empty SimpleName MethodInvocation SimpleName empty
empty SimpleName MethodInvocation SimpleName big value
empty SimpleName MethodInvocation SimpleName big value
bw SimpleName MethodInvocation SimpleName add mutation
bw SimpleName MethodInvocation SimpleName m
add mutation SimpleName MethodInvocation SimpleName m
i SimpleName InfixExpression NumberLiteral empty
i SimpleName InfixExpression InfixExpression NumberLiteral empty
empty NumberLiteral InfixExpression InfixExpression NumberLiteral empty
bw SimpleName MethodInvocation SimpleName flush
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression NumberLiteral empty
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
empty NumberLiteral InfixExpression ForStatement PostfixExpression SimpleName i
