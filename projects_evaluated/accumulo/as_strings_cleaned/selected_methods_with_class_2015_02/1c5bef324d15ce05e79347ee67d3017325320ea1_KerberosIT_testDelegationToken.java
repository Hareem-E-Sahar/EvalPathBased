get unique names SimpleName MethodInvocation NumberLiteral empty
get unique names SimpleName MethodInvocation ArrayAccess NumberLiteral empty
empty NumberLiteral MethodInvocation ArrayAccess NumberLiteral empty
table name SimpleName VariableDeclarationFragment ArrayAccess MethodInvocation SimpleName get unique names
table name SimpleName VariableDeclarationFragment ArrayAccess MethodInvocation NumberLiteral empty
table name SimpleName VariableDeclarationFragment ArrayAccess NumberLiteral empty
final Modifier VariableDeclarationStatement SimpleType SimpleName string
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName table name
final Modifier VariableDeclarationStatement VariableDeclarationFragment ArrayAccess NumberLiteral empty
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table name
root user SimpleName MethodInvocation SimpleName get principal
root user SimpleName MethodInvocation SimpleName get keytab
root user SimpleName MethodInvocation MethodInvocation SimpleName get absolute path
get keytab SimpleName MethodInvocation MethodInvocation SimpleName get absolute path
user group information SimpleName MethodInvocation SimpleName login user from keytab and return ugi
user group information SimpleName MethodInvocation MethodInvocation SimpleName root user
user group information SimpleName MethodInvocation MethodInvocation SimpleName get principal
user group information SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName root user
user group information SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get keytab
user group information SimpleName MethodInvocation MethodInvocation SimpleName get absolute path
login user from keytab and return ugi SimpleName MethodInvocation MethodInvocation SimpleName root user
login user from keytab and return ugi SimpleName MethodInvocation MethodInvocation SimpleName get principal
login user from keytab and return ugi SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName root user
login user from keytab and return ugi SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get keytab
login user from keytab and return ugi SimpleName MethodInvocation MethodInvocation SimpleName get absolute path
root user SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get absolute path
get principal SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get absolute path
root SimpleName VariableDeclarationFragment MethodInvocation SimpleName user group information
root SimpleName VariableDeclarationFragment MethodInvocation SimpleName login user from keytab and return ugi
root SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName root user
root SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get principal
root SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get absolute path
user group information SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName root
root user SimpleName MethodInvocation SimpleName get principal
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation StringLiteral logged in as {}
log SimpleName MethodInvocation MethodInvocation SimpleName root user
log SimpleName MethodInvocation MethodInvocation SimpleName get principal
info SimpleName MethodInvocation StringLiteral logged in as {}
info SimpleName MethodInvocation MethodInvocation SimpleName root user
info SimpleName MethodInvocation MethodInvocation SimpleName get principal
logged in as {} StringLiteral MethodInvocation MethodInvocation SimpleName root user
logged in as {} StringLiteral MethodInvocation MethodInvocation SimpleName get principal
num rows SimpleName VariableDeclarationFragment NumberLiteral empty
num columns SimpleName VariableDeclarationFragment NumberLiteral empty
final Modifier VariableDeclarationStatement PrimitiveType int
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName num rows
final Modifier VariableDeclarationStatement VariableDeclarationFragment NumberLiteral empty
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName num columns
final Modifier VariableDeclarationStatement VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName num rows
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName num columns
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment NumberLiteral empty
num rows SimpleName VariableDeclarationFragment VariableDeclarationStatement VariableDeclarationFragment SimpleName num columns
num rows SimpleName VariableDeclarationFragment VariableDeclarationStatement VariableDeclarationFragment NumberLiteral empty
empty NumberLiteral VariableDeclarationFragment VariableDeclarationStatement VariableDeclarationFragment SimpleName num columns
empty NumberLiteral VariableDeclarationFragment VariableDeclarationStatement VariableDeclarationFragment NumberLiteral empty
privileged exception action SimpleName SimpleType ParameterizedType SimpleType SimpleName delegation token
root user SimpleName MethodInvocation SimpleName get principal
mac SimpleName MethodInvocation SimpleName get connector
mac SimpleName MethodInvocation MethodInvocation SimpleName root user
mac SimpleName MethodInvocation MethodInvocation SimpleName get principal
mac SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName kerberos token
get connector SimpleName MethodInvocation MethodInvocation SimpleName root user
get connector SimpleName MethodInvocation MethodInvocation SimpleName get principal
get connector SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName kerberos token
conn SimpleName VariableDeclarationFragment MethodInvocation SimpleName mac
conn SimpleName VariableDeclarationFragment MethodInvocation SimpleName get connector
conn SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName root user
conn SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get principal
connector SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName conn
root user SimpleName MethodInvocation SimpleName get principal
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation StringLiteral created connector as {}
log SimpleName MethodInvocation MethodInvocation SimpleName root user
log SimpleName MethodInvocation MethodInvocation SimpleName get principal
info SimpleName MethodInvocation StringLiteral created connector as {}
info SimpleName MethodInvocation MethodInvocation SimpleName root user
info SimpleName MethodInvocation MethodInvocation SimpleName get principal
created connector as {} StringLiteral MethodInvocation MethodInvocation SimpleName root user
created connector as {} StringLiteral MethodInvocation MethodInvocation SimpleName get principal
root user SimpleName MethodInvocation SimpleName get principal
conn SimpleName MethodInvocation SimpleName whoami
assert equals SimpleName MethodInvocation MethodInvocation SimpleName root user
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get principal
assert equals SimpleName MethodInvocation MethodInvocation SimpleName conn
assert equals SimpleName MethodInvocation MethodInvocation SimpleName whoami
root user SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName conn
root user SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName whoami
get principal SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName conn
get principal SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName whoami
conn SimpleName MethodInvocation SimpleName table operations
conn SimpleName MethodInvocation MethodInvocation SimpleName create
table operations SimpleName MethodInvocation MethodInvocation SimpleName create
conn SimpleName MethodInvocation MethodInvocation SimpleName table name
table operations SimpleName MethodInvocation MethodInvocation SimpleName table name
create SimpleName MethodInvocation SimpleName table name
conn SimpleName MethodInvocation SimpleName create batch writer
conn SimpleName MethodInvocation SimpleName table name
conn SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName batch writer config
create batch writer SimpleName MethodInvocation SimpleName table name
create batch writer SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName batch writer config
table name SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName batch writer config
bw SimpleName VariableDeclarationFragment MethodInvocation SimpleName conn
bw SimpleName VariableDeclarationFragment MethodInvocation SimpleName create batch writer
bw SimpleName VariableDeclarationFragment MethodInvocation SimpleName table name
batch writer SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName bw
r SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName r
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
r SimpleName InfixExpression SimpleName num rows
integer SimpleName MethodInvocation SimpleName to string
integer SimpleName MethodInvocation SimpleName r
to string SimpleName MethodInvocation SimpleName r
mutation SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName integer
mutation SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName to string
mutation SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName r
m SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName mutation
m SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName integer
m SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName to string
m SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName r
mutation SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName m
c SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName c
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
c SimpleName InfixExpression SimpleName num columns
integer SimpleName MethodInvocation SimpleName to string
integer SimpleName MethodInvocation SimpleName c
to string SimpleName MethodInvocation SimpleName c
col SimpleName VariableDeclarationFragment MethodInvocation SimpleName integer
col SimpleName VariableDeclarationFragment MethodInvocation SimpleName to string
col SimpleName VariableDeclarationFragment MethodInvocation SimpleName c
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName col
m SimpleName MethodInvocation SimpleName put
m SimpleName MethodInvocation SimpleName col
m SimpleName MethodInvocation SimpleName col
m SimpleName MethodInvocation SimpleName col
put SimpleName MethodInvocation SimpleName col
put SimpleName MethodInvocation SimpleName col
put SimpleName MethodInvocation SimpleName col
col SimpleName MethodInvocation SimpleName col
col SimpleName MethodInvocation SimpleName col
col SimpleName MethodInvocation SimpleName col
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName c
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName num columns
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName c
c SimpleName InfixExpression ForStatement PostfixExpression SimpleName c
num columns SimpleName InfixExpression ForStatement PostfixExpression SimpleName c
bw SimpleName MethodInvocation SimpleName add mutation
bw SimpleName MethodInvocation SimpleName m
add mutation SimpleName MethodInvocation SimpleName m
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName r
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName num rows
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName r
r SimpleName InfixExpression ForStatement PostfixExpression SimpleName r
num rows SimpleName InfixExpression ForStatement PostfixExpression SimpleName r
bw SimpleName MethodInvocation SimpleName close
conn SimpleName MethodInvocation SimpleName security operations
conn SimpleName MethodInvocation MethodInvocation SimpleName get delegation token
security operations SimpleName MethodInvocation MethodInvocation SimpleName get delegation token
get delegation token SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName delegation token config
override SimpleName MarkerAnnotation MethodDeclaration Modifier public
override SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName delegation token
override SimpleName MarkerAnnotation MethodDeclaration SimpleName run
override SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration SimpleType SimpleName delegation token
public Modifier MethodDeclaration SimpleName run
public Modifier MethodDeclaration SimpleType SimpleName exception
delegation token SimpleName SimpleType MethodDeclaration SimpleName run
delegation token SimpleName SimpleType MethodDeclaration SimpleType SimpleName exception
run SimpleName MethodDeclaration SimpleType SimpleName exception
root SimpleName MethodInvocation SimpleName do as
delegation token SimpleName VariableDeclarationFragment MethodInvocation SimpleName root
delegation token SimpleName VariableDeclarationFragment MethodInvocation SimpleName do as
final Modifier VariableDeclarationStatement SimpleType SimpleName delegation token
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName delegation token
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName root
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName do as
delegation token SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName delegation token
string SimpleName SimpleType ArrayType ArrayCreation NumberLiteral empty
user group information SimpleName MethodInvocation SimpleName create user for testing
user group information SimpleName MethodInvocation StringLiteral fake user
user group information SimpleName MethodInvocation ArrayCreation NumberLiteral empty
create user for testing SimpleName MethodInvocation StringLiteral fake user
create user for testing SimpleName MethodInvocation ArrayCreation NumberLiteral empty
fake user StringLiteral MethodInvocation ArrayCreation NumberLiteral empty
user without privs SimpleName VariableDeclarationFragment MethodInvocation SimpleName user group information
user without privs SimpleName VariableDeclarationFragment MethodInvocation SimpleName create user for testing
user without privs SimpleName VariableDeclarationFragment MethodInvocation StringLiteral fake user
user without privs SimpleName VariableDeclarationFragment MethodInvocation ArrayCreation NumberLiteral empty
user group information SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName user without privs
privileged exception action SimpleName SimpleType ParameterizedType SimpleType SimpleName integer
root user SimpleName MethodInvocation SimpleName get principal
mac SimpleName MethodInvocation SimpleName get connector
mac SimpleName MethodInvocation MethodInvocation SimpleName root user
mac SimpleName MethodInvocation MethodInvocation SimpleName get principal
mac SimpleName MethodInvocation SimpleName delegation token
get connector SimpleName MethodInvocation MethodInvocation SimpleName root user
get connector SimpleName MethodInvocation MethodInvocation SimpleName get principal
get connector SimpleName MethodInvocation SimpleName delegation token
root user SimpleName MethodInvocation MethodInvocation SimpleName delegation token
get principal SimpleName MethodInvocation MethodInvocation SimpleName delegation token
conn SimpleName VariableDeclarationFragment MethodInvocation SimpleName mac
conn SimpleName VariableDeclarationFragment MethodInvocation SimpleName get connector
conn SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName root user
conn SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get principal
conn SimpleName VariableDeclarationFragment MethodInvocation SimpleName delegation token
connector SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName conn
conn SimpleName MethodInvocation SimpleName create batch scanner
conn SimpleName MethodInvocation SimpleName table name
conn SimpleName MethodInvocation QualifiedName authorizationsempty
conn SimpleName MethodInvocation NumberLiteral empty
create batch scanner SimpleName MethodInvocation SimpleName table name
create batch scanner SimpleName MethodInvocation QualifiedName authorizationsempty
create batch scanner SimpleName MethodInvocation NumberLiteral empty
table name SimpleName MethodInvocation QualifiedName authorizationsempty
table name SimpleName MethodInvocation NumberLiteral empty
authorizationsempty QualifiedName MethodInvocation NumberLiteral empty
bs SimpleName VariableDeclarationFragment MethodInvocation SimpleName conn
bs SimpleName VariableDeclarationFragment MethodInvocation SimpleName create batch scanner
bs SimpleName VariableDeclarationFragment MethodInvocation SimpleName table name
bs SimpleName VariableDeclarationFragment MethodInvocation QualifiedName authorizationsempty
bs SimpleName VariableDeclarationFragment MethodInvocation NumberLiteral empty
batch scanner SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName bs
collections SimpleName MethodInvocation SimpleName singleton
collections SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName range
singleton SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName range
bs SimpleName MethodInvocation SimpleName set ranges
bs SimpleName MethodInvocation MethodInvocation SimpleName collections
bs SimpleName MethodInvocation MethodInvocation SimpleName singleton
set ranges SimpleName MethodInvocation MethodInvocation SimpleName collections
set ranges SimpleName MethodInvocation MethodInvocation SimpleName singleton
iterables SimpleName MethodInvocation SimpleName size
iterables SimpleName MethodInvocation SimpleName bs
size SimpleName MethodInvocation SimpleName bs
records seen SimpleName VariableDeclarationFragment MethodInvocation SimpleName iterables
records seen SimpleName VariableDeclarationFragment MethodInvocation SimpleName size
records seen SimpleName VariableDeclarationFragment MethodInvocation SimpleName bs
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName records seen
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName iterables
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName size
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName bs
bs SimpleName MethodInvocation SimpleName close
int PrimitiveType VariableDeclarationStatement Block ReturnStatement SimpleName records seen
override SimpleName MarkerAnnotation MethodDeclaration Modifier public
override SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName integer
override SimpleName MarkerAnnotation MethodDeclaration SimpleName run
override SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration SimpleType SimpleName integer
public Modifier MethodDeclaration SimpleName run
public Modifier MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
public Modifier MethodDeclaration Block ReturnStatement SimpleName records seen
integer SimpleName SimpleType MethodDeclaration SimpleName run
integer SimpleName SimpleType MethodDeclaration SimpleType SimpleName exception
run SimpleName MethodDeclaration SimpleType SimpleName exception
run SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
run SimpleName MethodDeclaration Block ReturnStatement SimpleName records seen
user without privs SimpleName MethodInvocation SimpleName do as
records seen SimpleName VariableDeclarationFragment MethodInvocation SimpleName user without privs
records seen SimpleName VariableDeclarationFragment MethodInvocation SimpleName do as
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName records seen
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName user without privs
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName do as
num rows SimpleName InfixExpression SimpleName num columns
assert equals SimpleName MethodInvocation InfixExpression SimpleName num rows
assert equals SimpleName MethodInvocation InfixExpression SimpleName num columns
assert equals SimpleName MethodInvocation SimpleName records seen
num rows SimpleName InfixExpression MethodInvocation SimpleName records seen
num columns SimpleName InfixExpression MethodInvocation SimpleName records seen
final Modifier VariableDeclarationStatement Block VariableDeclarationStatement Modifier final
final Modifier VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
final Modifier VariableDeclarationStatement Block VariableDeclarationStatement Modifier final
final Modifier VariableDeclarationStatement Block VariableDeclarationStatement Modifier final
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement Modifier final
final Modifier VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
final Modifier VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test delegation token
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test delegation token
public Modifier MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration Block VariableDeclarationStatement Modifier final
public Modifier MethodDeclaration Block VariableDeclarationStatement Modifier final
public Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
public Modifier MethodDeclaration Block VariableDeclarationStatement Modifier final
public Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
void PrimitiveType MethodDeclaration SimpleName test delegation token
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement Modifier final
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement Modifier final
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement Modifier final
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
test delegation token SimpleName MethodDeclaration SimpleType SimpleName exception
test delegation token SimpleName MethodDeclaration Block VariableDeclarationStatement Modifier final
test delegation token SimpleName MethodDeclaration Block VariableDeclarationStatement Modifier final
test delegation token SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
test delegation token SimpleName MethodDeclaration Block VariableDeclarationStatement Modifier final
test delegation token SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test delegation token
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test delegation token
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
