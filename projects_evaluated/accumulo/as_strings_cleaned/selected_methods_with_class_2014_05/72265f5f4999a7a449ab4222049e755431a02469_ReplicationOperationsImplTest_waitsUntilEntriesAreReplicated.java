password token SimpleName SimpleType ClassInstanceCreation StringLiteral empty
inst SimpleName MethodInvocation SimpleName get connector
inst SimpleName MethodInvocation StringLiteral root
inst SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName password token
inst SimpleName MethodInvocation ClassInstanceCreation StringLiteral empty
get connector SimpleName MethodInvocation StringLiteral root
get connector SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName password token
get connector SimpleName MethodInvocation ClassInstanceCreation StringLiteral empty
root StringLiteral MethodInvocation ClassInstanceCreation SimpleType SimpleName password token
root StringLiteral MethodInvocation ClassInstanceCreation StringLiteral empty
conn SimpleName VariableDeclarationFragment MethodInvocation SimpleName inst
conn SimpleName VariableDeclarationFragment MethodInvocation SimpleName get connector
conn SimpleName VariableDeclarationFragment MethodInvocation StringLiteral root
conn SimpleName VariableDeclarationFragment MethodInvocation ClassInstanceCreation StringLiteral empty
connector SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName conn
conn SimpleName MethodInvocation SimpleName table operations
conn SimpleName MethodInvocation MethodInvocation SimpleName create
table operations SimpleName MethodInvocation MethodInvocation SimpleName create
conn SimpleName MethodInvocation MethodInvocation QualifiedName replication tablename
table operations SimpleName MethodInvocation MethodInvocation QualifiedName replication tablename
create SimpleName MethodInvocation QualifiedName replication tablename
conn SimpleName MethodInvocation SimpleName table operations
conn SimpleName MethodInvocation MethodInvocation SimpleName create
table operations SimpleName MethodInvocation MethodInvocation SimpleName create
conn SimpleName MethodInvocation MethodInvocation StringLiteral foo
table operations SimpleName MethodInvocation MethodInvocation StringLiteral foo
create SimpleName MethodInvocation StringLiteral foo
conn SimpleName MethodInvocation SimpleName table operations
conn SimpleName MethodInvocation MethodInvocation SimpleName table id map
table operations SimpleName MethodInvocation MethodInvocation SimpleName table id map
conn SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get
table operations SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get
table id map SimpleName MethodInvocation MethodInvocation SimpleName get
conn SimpleName MethodInvocation MethodInvocation MethodInvocation StringLiteral foo
table operations SimpleName MethodInvocation MethodInvocation MethodInvocation StringLiteral foo
table id map SimpleName MethodInvocation MethodInvocation StringLiteral foo
get SimpleName MethodInvocation StringLiteral foo
text SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get
text SimpleName SimpleType ClassInstanceCreation MethodInvocation StringLiteral foo
table id SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName text
table id SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName get
table id SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation StringLiteral foo
text SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table id
uuid SimpleName MethodInvocation SimpleName random uuid
accumulowalstserverport StringLiteral InfixExpression MethodInvocation SimpleName uuid
accumulowalstserverport StringLiteral InfixExpression MethodInvocation SimpleName random uuid
file SimpleName VariableDeclarationFragment InfixExpression StringLiteral accumulowalstserverport
file SimpleName VariableDeclarationFragment InfixExpression MethodInvocation SimpleName uuid
file SimpleName VariableDeclarationFragment InfixExpression MethodInvocation SimpleName random uuid
uuid SimpleName MethodInvocation SimpleName random uuid
accumulowalstserverport StringLiteral InfixExpression MethodInvocation SimpleName uuid
accumulowalstserverport StringLiteral InfixExpression MethodInvocation SimpleName random uuid
file SimpleName VariableDeclarationFragment InfixExpression StringLiteral accumulowalstserverport
file SimpleName VariableDeclarationFragment InfixExpression MethodInvocation SimpleName uuid
file SimpleName VariableDeclarationFragment InfixExpression MethodInvocation SimpleName random uuid
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName file
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName file
file SimpleName VariableDeclarationFragment VariableDeclarationStatement VariableDeclarationFragment SimpleName file
status SimpleName MethodInvocation SimpleName new builder
status SimpleName MethodInvocation MethodInvocation SimpleName set begin
new builder SimpleName MethodInvocation MethodInvocation SimpleName set begin
status SimpleName MethodInvocation MethodInvocation NumberLiteral empty
new builder SimpleName MethodInvocation MethodInvocation NumberLiteral empty
set begin SimpleName MethodInvocation NumberLiteral empty
status SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName set end
new builder SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName set end
set begin SimpleName MethodInvocation MethodInvocation SimpleName set end
empty NumberLiteral MethodInvocation MethodInvocation SimpleName set end
status SimpleName MethodInvocation MethodInvocation MethodInvocation NumberLiteral empty
new builder SimpleName MethodInvocation MethodInvocation MethodInvocation NumberLiteral empty
set begin SimpleName MethodInvocation MethodInvocation NumberLiteral empty
empty NumberLiteral MethodInvocation MethodInvocation NumberLiteral empty
set end SimpleName MethodInvocation NumberLiteral empty
set begin SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName set infinite end
empty NumberLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName set infinite end
set end SimpleName MethodInvocation MethodInvocation SimpleName set infinite end
empty NumberLiteral MethodInvocation MethodInvocation SimpleName set infinite end
set begin SimpleName MethodInvocation MethodInvocation MethodInvocation BooleanLiteral false
empty NumberLiteral MethodInvocation MethodInvocation MethodInvocation BooleanLiteral false
set end SimpleName MethodInvocation MethodInvocation BooleanLiteral false
empty NumberLiteral MethodInvocation MethodInvocation BooleanLiteral false
set infinite end SimpleName MethodInvocation BooleanLiteral false
set end SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName set closed
empty NumberLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName set closed
set infinite end SimpleName MethodInvocation MethodInvocation SimpleName set closed
false BooleanLiteral MethodInvocation MethodInvocation SimpleName set closed
set end SimpleName MethodInvocation MethodInvocation MethodInvocation BooleanLiteral false
empty NumberLiteral MethodInvocation MethodInvocation MethodInvocation BooleanLiteral false
set infinite end SimpleName MethodInvocation MethodInvocation BooleanLiteral false
false BooleanLiteral MethodInvocation MethodInvocation BooleanLiteral false
set closed SimpleName MethodInvocation BooleanLiteral false
set infinite end SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName build
false BooleanLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName build
set closed SimpleName MethodInvocation MethodInvocation SimpleName build
false BooleanLiteral MethodInvocation MethodInvocation SimpleName build
stat SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName set closed
stat SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation BooleanLiteral false
stat SimpleName VariableDeclarationFragment MethodInvocation SimpleName build
status SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName stat
conn SimpleName MethodInvocation SimpleName create batch writer
conn SimpleName MethodInvocation QualifiedName replication tablename
conn SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName batch writer config
create batch writer SimpleName MethodInvocation QualifiedName replication tablename
create batch writer SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName batch writer config
replication tablename QualifiedName MethodInvocation ClassInstanceCreation SimpleType SimpleName batch writer config
bw SimpleName VariableDeclarationFragment MethodInvocation SimpleName conn
bw SimpleName VariableDeclarationFragment MethodInvocation SimpleName create batch writer
bw SimpleName VariableDeclarationFragment MethodInvocation QualifiedName replication tablename
batch writer SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName bw
mutation SimpleName SimpleType ClassInstanceCreation SimpleName file
m SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName mutation
m SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName file
mutation SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName m
protobuf util SimpleName MethodInvocation SimpleName to value
protobuf util SimpleName MethodInvocation SimpleName stat
to value SimpleName MethodInvocation SimpleName stat
status section SimpleName MethodInvocation SimpleName add
status section SimpleName MethodInvocation SimpleName m
status section SimpleName MethodInvocation SimpleName table id
status section SimpleName MethodInvocation MethodInvocation SimpleName protobuf util
status section SimpleName MethodInvocation MethodInvocation SimpleName to value
status section SimpleName MethodInvocation MethodInvocation SimpleName stat
add SimpleName MethodInvocation SimpleName m
add SimpleName MethodInvocation SimpleName table id
add SimpleName MethodInvocation MethodInvocation SimpleName protobuf util
add SimpleName MethodInvocation MethodInvocation SimpleName to value
add SimpleName MethodInvocation MethodInvocation SimpleName stat
m SimpleName MethodInvocation SimpleName table id
m SimpleName MethodInvocation MethodInvocation SimpleName protobuf util
m SimpleName MethodInvocation MethodInvocation SimpleName to value
m SimpleName MethodInvocation MethodInvocation SimpleName stat
table id SimpleName MethodInvocation MethodInvocation SimpleName protobuf util
table id SimpleName MethodInvocation MethodInvocation SimpleName to value
table id SimpleName MethodInvocation MethodInvocation SimpleName stat
bw SimpleName MethodInvocation SimpleName add mutation
bw SimpleName MethodInvocation SimpleName m
add mutation SimpleName MethodInvocation SimpleName m
mutation SimpleName SimpleType ClassInstanceCreation SimpleName file
m SimpleName Assignment ClassInstanceCreation SimpleType SimpleName mutation
m SimpleName Assignment ClassInstanceCreation SimpleName file
protobuf util SimpleName MethodInvocation SimpleName to value
protobuf util SimpleName MethodInvocation SimpleName stat
to value SimpleName MethodInvocation SimpleName stat
status section SimpleName MethodInvocation SimpleName add
status section SimpleName MethodInvocation SimpleName m
status section SimpleName MethodInvocation SimpleName table id
status section SimpleName MethodInvocation MethodInvocation SimpleName protobuf util
status section SimpleName MethodInvocation MethodInvocation SimpleName to value
status section SimpleName MethodInvocation MethodInvocation SimpleName stat
add SimpleName MethodInvocation SimpleName m
add SimpleName MethodInvocation SimpleName table id
add SimpleName MethodInvocation MethodInvocation SimpleName protobuf util
add SimpleName MethodInvocation MethodInvocation SimpleName to value
add SimpleName MethodInvocation MethodInvocation SimpleName stat
m SimpleName MethodInvocation SimpleName table id
m SimpleName MethodInvocation MethodInvocation SimpleName protobuf util
m SimpleName MethodInvocation MethodInvocation SimpleName to value
m SimpleName MethodInvocation MethodInvocation SimpleName stat
table id SimpleName MethodInvocation MethodInvocation SimpleName protobuf util
table id SimpleName MethodInvocation MethodInvocation SimpleName to value
table id SimpleName MethodInvocation MethodInvocation SimpleName stat
bw SimpleName MethodInvocation SimpleName add mutation
bw SimpleName MethodInvocation SimpleName m
add mutation SimpleName MethodInvocation SimpleName m
bw SimpleName MethodInvocation SimpleName close
conn SimpleName MethodInvocation SimpleName create batch writer
conn SimpleName MethodInvocation QualifiedName metadata tablename
conn SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName batch writer config
create batch writer SimpleName MethodInvocation QualifiedName metadata tablename
create batch writer SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName batch writer config
metadata tablename QualifiedName MethodInvocation ClassInstanceCreation SimpleType SimpleName batch writer config
bw SimpleName Assignment MethodInvocation SimpleName conn
bw SimpleName Assignment MethodInvocation SimpleName create batch writer
bw SimpleName Assignment MethodInvocation QualifiedName metadata tablename
replication section SimpleName MethodInvocation SimpleName get row prefix
replication section SimpleName MethodInvocation InfixExpression SimpleName file
get row prefix SimpleName MethodInvocation InfixExpression SimpleName file
mutation SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName file
m SimpleName Assignment ClassInstanceCreation SimpleType SimpleName mutation
m SimpleName Assignment ClassInstanceCreation InfixExpression SimpleName file
protobuf util SimpleName MethodInvocation SimpleName to value
protobuf util SimpleName MethodInvocation SimpleName stat
to value SimpleName MethodInvocation SimpleName stat
m SimpleName MethodInvocation SimpleName put
m SimpleName MethodInvocation QualifiedName replication sectioncolf
m SimpleName MethodInvocation SimpleName table id
m SimpleName MethodInvocation MethodInvocation SimpleName protobuf util
m SimpleName MethodInvocation MethodInvocation SimpleName to value
m SimpleName MethodInvocation MethodInvocation SimpleName stat
put SimpleName MethodInvocation QualifiedName replication sectioncolf
put SimpleName MethodInvocation SimpleName table id
put SimpleName MethodInvocation MethodInvocation SimpleName protobuf util
put SimpleName MethodInvocation MethodInvocation SimpleName to value
put SimpleName MethodInvocation MethodInvocation SimpleName stat
replication sectioncolf QualifiedName MethodInvocation SimpleName table id
replication sectioncolf QualifiedName MethodInvocation MethodInvocation SimpleName protobuf util
replication sectioncolf QualifiedName MethodInvocation MethodInvocation SimpleName to value
replication sectioncolf QualifiedName MethodInvocation MethodInvocation SimpleName stat
table id SimpleName MethodInvocation MethodInvocation SimpleName protobuf util
table id SimpleName MethodInvocation MethodInvocation SimpleName to value
table id SimpleName MethodInvocation MethodInvocation SimpleName stat
bw SimpleName MethodInvocation SimpleName add mutation
bw SimpleName MethodInvocation SimpleName m
add mutation SimpleName MethodInvocation SimpleName m
replication section SimpleName MethodInvocation SimpleName get row prefix
replication section SimpleName MethodInvocation InfixExpression SimpleName file
get row prefix SimpleName MethodInvocation InfixExpression SimpleName file
mutation SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName file
m SimpleName Assignment ClassInstanceCreation SimpleType SimpleName mutation
m SimpleName Assignment ClassInstanceCreation InfixExpression SimpleName file
protobuf util SimpleName MethodInvocation SimpleName to value
protobuf util SimpleName MethodInvocation SimpleName stat
to value SimpleName MethodInvocation SimpleName stat
m SimpleName MethodInvocation SimpleName put
m SimpleName MethodInvocation QualifiedName replication sectioncolf
m SimpleName MethodInvocation SimpleName table id
m SimpleName MethodInvocation MethodInvocation SimpleName protobuf util
m SimpleName MethodInvocation MethodInvocation SimpleName to value
m SimpleName MethodInvocation MethodInvocation SimpleName stat
put SimpleName MethodInvocation QualifiedName replication sectioncolf
put SimpleName MethodInvocation SimpleName table id
put SimpleName MethodInvocation MethodInvocation SimpleName protobuf util
put SimpleName MethodInvocation MethodInvocation SimpleName to value
put SimpleName MethodInvocation MethodInvocation SimpleName stat
replication sectioncolf QualifiedName MethodInvocation SimpleName table id
replication sectioncolf QualifiedName MethodInvocation MethodInvocation SimpleName protobuf util
replication sectioncolf QualifiedName MethodInvocation MethodInvocation SimpleName to value
replication sectioncolf QualifiedName MethodInvocation MethodInvocation SimpleName stat
table id SimpleName MethodInvocation MethodInvocation SimpleName protobuf util
table id SimpleName MethodInvocation MethodInvocation SimpleName to value
table id SimpleName MethodInvocation MethodInvocation SimpleName stat
bw SimpleName MethodInvocation SimpleName close
atomic boolean SimpleName SimpleType ClassInstanceCreation BooleanLiteral false
done SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName atomic boolean
done SimpleName VariableDeclarationFragment ClassInstanceCreation BooleanLiteral false
final Modifier VariableDeclarationStatement SimpleType SimpleName atomic boolean
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName done
final Modifier VariableDeclarationStatement VariableDeclarationFragment ClassInstanceCreation BooleanLiteral false
atomic boolean SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName done
atomic boolean SimpleName SimpleType ClassInstanceCreation BooleanLiteral false
exception SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName atomic boolean
exception SimpleName VariableDeclarationFragment ClassInstanceCreation BooleanLiteral false
final Modifier VariableDeclarationStatement SimpleType SimpleName atomic boolean
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName exception
final Modifier VariableDeclarationStatement VariableDeclarationFragment ClassInstanceCreation BooleanLiteral false
atomic boolean SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName exception
password token SimpleName SimpleType ClassInstanceCreation StringLiteral empty
credentials SimpleName SimpleType ClassInstanceCreation StringLiteral root
credentials SimpleName SimpleType ClassInstanceCreation ClassInstanceCreation StringLiteral empty
root StringLiteral ClassInstanceCreation ClassInstanceCreation SimpleType SimpleName password token
root StringLiteral ClassInstanceCreation ClassInstanceCreation StringLiteral empty
replication operations impl SimpleName SimpleType ClassInstanceCreation SimpleName inst
replication operations impl SimpleName SimpleType ClassInstanceCreation ClassInstanceCreation StringLiteral root
inst SimpleName ClassInstanceCreation ClassInstanceCreation SimpleType SimpleName credentials
inst SimpleName ClassInstanceCreation ClassInstanceCreation StringLiteral root
inst SimpleName ClassInstanceCreation ClassInstanceCreation ClassInstanceCreation StringLiteral empty
roi SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName replication operations impl
roi SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName inst
roi SimpleName VariableDeclarationFragment ClassInstanceCreation ClassInstanceCreation StringLiteral root
final Modifier VariableDeclarationStatement SimpleType SimpleName replication operations impl
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName roi
final Modifier VariableDeclarationStatement VariableDeclarationFragment ClassInstanceCreation SimpleName inst
replication operations impl SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName roi
roi SimpleName MethodInvocation SimpleName drain
roi SimpleName MethodInvocation StringLiteral foo
drain SimpleName MethodInvocation StringLiteral foo
exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
log SimpleName MethodInvocation SimpleName error
log SimpleName MethodInvocation StringLiteral got error
log SimpleName MethodInvocation SimpleName e
error SimpleName MethodInvocation StringLiteral got error
error SimpleName MethodInvocation SimpleName e
got error StringLiteral MethodInvocation SimpleName e
exception SimpleName MethodInvocation SimpleName set
exception SimpleName MethodInvocation BooleanLiteral true
set SimpleName MethodInvocation BooleanLiteral true
done SimpleName MethodInvocation SimpleName set
done SimpleName MethodInvocation BooleanLiteral true
set SimpleName MethodInvocation BooleanLiteral true
override SimpleName MarkerAnnotation MethodDeclaration Modifier public
override SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
override SimpleName MarkerAnnotation MethodDeclaration SimpleName run
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName run
void PrimitiveType MethodDeclaration SimpleName run
t SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName thread
thread SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName t
t SimpleName MethodInvocation SimpleName start
done SimpleName MethodInvocation SimpleName get
assert SimpleName MethodInvocation SimpleName assert false
assert SimpleName MethodInvocation MethodInvocation SimpleName done
assert SimpleName MethodInvocation MethodInvocation SimpleName get
assert false SimpleName MethodInvocation MethodInvocation SimpleName done
assert false SimpleName MethodInvocation MethodInvocation SimpleName get
conn SimpleName MethodInvocation SimpleName create batch writer
conn SimpleName MethodInvocation QualifiedName metadata tablename
conn SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName batch writer config
create batch writer SimpleName MethodInvocation QualifiedName metadata tablename
create batch writer SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName batch writer config
metadata tablename QualifiedName MethodInvocation ClassInstanceCreation SimpleType SimpleName batch writer config
bw SimpleName Assignment MethodInvocation SimpleName conn
bw SimpleName Assignment MethodInvocation SimpleName create batch writer
bw SimpleName Assignment MethodInvocation QualifiedName metadata tablename
replication section SimpleName MethodInvocation SimpleName get row prefix
replication section SimpleName MethodInvocation InfixExpression SimpleName file
get row prefix SimpleName MethodInvocation InfixExpression SimpleName file
mutation SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName file
m SimpleName Assignment ClassInstanceCreation SimpleType SimpleName mutation
m SimpleName Assignment ClassInstanceCreation InfixExpression SimpleName file
m SimpleName MethodInvocation SimpleName put delete
m SimpleName MethodInvocation QualifiedName replication sectioncolf
m SimpleName MethodInvocation SimpleName table id
put delete SimpleName MethodInvocation QualifiedName replication sectioncolf
put delete SimpleName MethodInvocation SimpleName table id
replication sectioncolf QualifiedName MethodInvocation SimpleName table id
bw SimpleName MethodInvocation SimpleName add mutation
bw SimpleName MethodInvocation SimpleName m
add mutation SimpleName MethodInvocation SimpleName m
bw SimpleName MethodInvocation SimpleName flush
done SimpleName MethodInvocation SimpleName get
assert SimpleName MethodInvocation SimpleName assert false
assert SimpleName MethodInvocation MethodInvocation SimpleName done
assert SimpleName MethodInvocation MethodInvocation SimpleName get
assert false SimpleName MethodInvocation MethodInvocation SimpleName done
assert false SimpleName MethodInvocation MethodInvocation SimpleName get
replication section SimpleName MethodInvocation SimpleName get row prefix
replication section SimpleName MethodInvocation InfixExpression SimpleName file
get row prefix SimpleName MethodInvocation InfixExpression SimpleName file
mutation SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName file
m SimpleName Assignment ClassInstanceCreation SimpleType SimpleName mutation
m SimpleName Assignment ClassInstanceCreation InfixExpression SimpleName file
m SimpleName MethodInvocation SimpleName put delete
m SimpleName MethodInvocation QualifiedName replication sectioncolf
m SimpleName MethodInvocation SimpleName table id
put delete SimpleName MethodInvocation QualifiedName replication sectioncolf
put delete SimpleName MethodInvocation SimpleName table id
replication sectioncolf QualifiedName MethodInvocation SimpleName table id
bw SimpleName MethodInvocation SimpleName add mutation
bw SimpleName MethodInvocation SimpleName m
add mutation SimpleName MethodInvocation SimpleName m
bw SimpleName MethodInvocation SimpleName flush
bw SimpleName MethodInvocation SimpleName close
done SimpleName MethodInvocation SimpleName get
assert SimpleName MethodInvocation SimpleName assert false
assert SimpleName MethodInvocation MethodInvocation SimpleName done
assert SimpleName MethodInvocation MethodInvocation SimpleName get
assert false SimpleName MethodInvocation MethodInvocation SimpleName done
assert false SimpleName MethodInvocation MethodInvocation SimpleName get
conn SimpleName MethodInvocation SimpleName create batch writer
conn SimpleName MethodInvocation QualifiedName replication tablename
conn SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName batch writer config
create batch writer SimpleName MethodInvocation QualifiedName replication tablename
create batch writer SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName batch writer config
replication tablename QualifiedName MethodInvocation ClassInstanceCreation SimpleType SimpleName batch writer config
bw SimpleName Assignment MethodInvocation SimpleName conn
bw SimpleName Assignment MethodInvocation SimpleName create batch writer
bw SimpleName Assignment MethodInvocation QualifiedName replication tablename
mutation SimpleName SimpleType ClassInstanceCreation SimpleName file
m SimpleName Assignment ClassInstanceCreation SimpleType SimpleName mutation
m SimpleName Assignment ClassInstanceCreation SimpleName file
m SimpleName MethodInvocation SimpleName put delete
m SimpleName MethodInvocation QualifiedName status sectionname
m SimpleName MethodInvocation SimpleName table id
put delete SimpleName MethodInvocation QualifiedName status sectionname
put delete SimpleName MethodInvocation SimpleName table id
status sectionname QualifiedName MethodInvocation SimpleName table id
bw SimpleName MethodInvocation SimpleName add mutation
bw SimpleName MethodInvocation SimpleName m
add mutation SimpleName MethodInvocation SimpleName m
bw SimpleName MethodInvocation SimpleName flush
done SimpleName MethodInvocation SimpleName get
assert SimpleName MethodInvocation SimpleName assert false
assert SimpleName MethodInvocation MethodInvocation SimpleName done
assert SimpleName MethodInvocation MethodInvocation SimpleName get
assert false SimpleName MethodInvocation MethodInvocation SimpleName done
assert false SimpleName MethodInvocation MethodInvocation SimpleName get
mutation SimpleName SimpleType ClassInstanceCreation SimpleName file
m SimpleName Assignment ClassInstanceCreation SimpleType SimpleName mutation
m SimpleName Assignment ClassInstanceCreation SimpleName file
m SimpleName MethodInvocation SimpleName put delete
m SimpleName MethodInvocation QualifiedName status sectionname
m SimpleName MethodInvocation SimpleName table id
put delete SimpleName MethodInvocation QualifiedName status sectionname
put delete SimpleName MethodInvocation SimpleName table id
status sectionname QualifiedName MethodInvocation SimpleName table id
bw SimpleName MethodInvocation SimpleName add mutation
bw SimpleName MethodInvocation SimpleName m
add mutation SimpleName MethodInvocation SimpleName m
bw SimpleName MethodInvocation SimpleName flush
t SimpleName MethodInvocation SimpleName join
t SimpleName MethodInvocation NumberLiteral empty
join SimpleName MethodInvocation NumberLiteral empty
interrupted exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
assert SimpleName MethodInvocation SimpleName fail
assert SimpleName MethodInvocation StringLiteral replication operationsdrain did not complete
fail SimpleName MethodInvocation StringLiteral replication operationsdrain did not complete
done SimpleName MethodInvocation SimpleName get
assert SimpleName MethodInvocation SimpleName assert true
assert SimpleName MethodInvocation MethodInvocation SimpleName done
assert SimpleName MethodInvocation MethodInvocation SimpleName get
assert true SimpleName MethodInvocation MethodInvocation SimpleName done
assert true SimpleName MethodInvocation MethodInvocation SimpleName get
exception SimpleName MethodInvocation SimpleName get
assert SimpleName MethodInvocation SimpleName assert false
assert SimpleName MethodInvocation MethodInvocation SimpleName exception
assert SimpleName MethodInvocation MethodInvocation SimpleName get
assert false SimpleName MethodInvocation MethodInvocation SimpleName exception
assert false SimpleName MethodInvocation MethodInvocation SimpleName get
final Modifier VariableDeclarationStatement Block VariableDeclarationStatement Modifier final
final Modifier VariableDeclarationStatement Block VariableDeclarationStatement Modifier final
final Modifier VariableDeclarationStatement Block VariableDeclarationStatement Modifier final
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName waits until entries are replicated
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName waits until entries are replicated
public Modifier MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration Block VariableDeclarationStatement Modifier final
public Modifier MethodDeclaration Block VariableDeclarationStatement Modifier final
public Modifier MethodDeclaration Block VariableDeclarationStatement Modifier final
void PrimitiveType MethodDeclaration SimpleName waits until entries are replicated
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement Modifier final
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement Modifier final
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement Modifier final
waits until entries are replicated SimpleName MethodDeclaration SimpleType SimpleName exception
waits until entries are replicated SimpleName MethodDeclaration Block VariableDeclarationStatement Modifier final
waits until entries are replicated SimpleName MethodDeclaration Block VariableDeclarationStatement Modifier final
waits until entries are replicated SimpleName MethodDeclaration Block VariableDeclarationStatement Modifier final
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName waits until entries are replicated
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName waits until entries are replicated
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception