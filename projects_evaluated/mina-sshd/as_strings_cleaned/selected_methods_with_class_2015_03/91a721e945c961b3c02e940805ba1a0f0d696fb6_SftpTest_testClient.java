ssh client SimpleName MethodInvocation SimpleName set up default client
client SimpleName VariableDeclarationFragment MethodInvocation SimpleName ssh client
client SimpleName VariableDeclarationFragment MethodInvocation SimpleName set up default client
ssh client SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName client
client SimpleName MethodInvocation SimpleName start
client SimpleName MethodInvocation SimpleName connect
client SimpleName MethodInvocation StringLiteral x
client SimpleName MethodInvocation StringLiteral localhost
client SimpleName MethodInvocation SimpleName port
connect SimpleName MethodInvocation StringLiteral x
connect SimpleName MethodInvocation StringLiteral localhost
connect SimpleName MethodInvocation SimpleName port
x StringLiteral MethodInvocation StringLiteral localhost
x StringLiteral MethodInvocation SimpleName port
localhost StringLiteral MethodInvocation SimpleName port
client SimpleName MethodInvocation MethodInvocation SimpleName await
connect SimpleName MethodInvocation MethodInvocation SimpleName await
x StringLiteral MethodInvocation MethodInvocation SimpleName await
localhost StringLiteral MethodInvocation MethodInvocation SimpleName await
port SimpleName MethodInvocation MethodInvocation SimpleName await
client SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get session
connect SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get session
x StringLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName get session
localhost StringLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName get session
port SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get session
await SimpleName MethodInvocation MethodInvocation SimpleName get session
session SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName await
session SimpleName VariableDeclarationFragment MethodInvocation SimpleName get session
client session SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName session
session SimpleName MethodInvocation SimpleName add password identity
session SimpleName MethodInvocation StringLiteral x
add password identity SimpleName MethodInvocation StringLiteral x
session SimpleName MethodInvocation SimpleName auth
session SimpleName MethodInvocation MethodInvocation SimpleName verify
auth SimpleName MethodInvocation MethodInvocation SimpleName verify
file SimpleName SimpleType ClassInstanceCreation StringLiteral targetsftp
utils SimpleName MethodInvocation SimpleName delete recursive
utils SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName file
utils SimpleName MethodInvocation ClassInstanceCreation StringLiteral targetsftp
delete recursive SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName file
delete recursive SimpleName MethodInvocation ClassInstanceCreation StringLiteral targetsftp
file SimpleName SimpleType ClassInstanceCreation StringLiteral targetsftp
file SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName mkdirs
targetsftp StringLiteral ClassInstanceCreation MethodInvocation SimpleName mkdirs
file SimpleName SimpleType ClassInstanceCreation StringLiteral targetsftpclienttesttxt
file SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName delete
targetsftpclienttesttxt StringLiteral ClassInstanceCreation MethodInvocation SimpleName delete
file SimpleName SimpleType ClassInstanceCreation StringLiteral targetsftpclient
file SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName delete
targetsftpclient StringLiteral ClassInstanceCreation MethodInvocation SimpleName delete
session SimpleName MethodInvocation SimpleName create sftp client
sftp SimpleName VariableDeclarationFragment MethodInvocation SimpleName session
sftp SimpleName VariableDeclarationFragment MethodInvocation SimpleName create sftp client
sftp client SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName sftp
sftp SimpleName MethodInvocation SimpleName mkdir
sftp SimpleName MethodInvocation StringLiteral targetsftpclient
mkdir SimpleName MethodInvocation StringLiteral targetsftpclient
enum set SimpleName MethodInvocation SimpleName of
enum set SimpleName MethodInvocation QualifiedName sftp clientopen modewrite
enum set SimpleName MethodInvocation QualifiedName sftp clientopen modecreate
of SimpleName MethodInvocation QualifiedName sftp clientopen modewrite
of SimpleName MethodInvocation QualifiedName sftp clientopen modecreate
sftp clientopen modewrite QualifiedName MethodInvocation QualifiedName sftp clientopen modecreate
sftp SimpleName MethodInvocation SimpleName open
sftp SimpleName MethodInvocation StringLiteral targetsftpclienttesttxt
sftp SimpleName MethodInvocation MethodInvocation SimpleName enum set
sftp SimpleName MethodInvocation MethodInvocation SimpleName of
sftp SimpleName MethodInvocation MethodInvocation QualifiedName sftp clientopen modewrite
sftp SimpleName MethodInvocation MethodInvocation QualifiedName sftp clientopen modecreate
open SimpleName MethodInvocation StringLiteral targetsftpclienttesttxt
open SimpleName MethodInvocation MethodInvocation SimpleName enum set
open SimpleName MethodInvocation MethodInvocation SimpleName of
open SimpleName MethodInvocation MethodInvocation QualifiedName sftp clientopen modewrite
open SimpleName MethodInvocation MethodInvocation QualifiedName sftp clientopen modecreate
targetsftpclienttesttxt StringLiteral MethodInvocation MethodInvocation SimpleName enum set
targetsftpclienttesttxt StringLiteral MethodInvocation MethodInvocation SimpleName of
targetsftpclienttesttxt StringLiteral MethodInvocation MethodInvocation QualifiedName sftp clientopen modewrite
targetsftpclienttesttxt StringLiteral MethodInvocation MethodInvocation QualifiedName sftp clientopen modecreate
h SimpleName VariableDeclarationFragment MethodInvocation SimpleName sftp
h SimpleName VariableDeclarationFragment MethodInvocation SimpleName open
h SimpleName VariableDeclarationFragment MethodInvocation StringLiteral targetsftpclienttesttxt
h SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName enum set
h SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName of
h SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation QualifiedName sftp clientopen modewrite
h SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation QualifiedName sftp clientopen modecreate
sftp clienthandle QualifiedName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName h
empty StringLiteral MethodInvocation SimpleName get bytes
d SimpleName VariableDeclarationFragment MethodInvocation StringLiteral empty
d SimpleName VariableDeclarationFragment MethodInvocation SimpleName get bytes
byte PrimitiveType ArrayType VariableDeclarationStatement VariableDeclarationFragment SimpleName d
sftp SimpleName MethodInvocation SimpleName write
sftp SimpleName MethodInvocation SimpleName h
sftp SimpleName MethodInvocation NumberLiteral empty
sftp SimpleName MethodInvocation SimpleName d
sftp SimpleName MethodInvocation NumberLiteral empty
write SimpleName MethodInvocation SimpleName h
write SimpleName MethodInvocation NumberLiteral empty
write SimpleName MethodInvocation SimpleName d
write SimpleName MethodInvocation NumberLiteral empty
write SimpleName MethodInvocation QualifiedName dlength
h SimpleName MethodInvocation NumberLiteral empty
h SimpleName MethodInvocation SimpleName d
h SimpleName MethodInvocation NumberLiteral empty
h SimpleName MethodInvocation QualifiedName dlength
empty NumberLiteral MethodInvocation SimpleName d
empty NumberLiteral MethodInvocation NumberLiteral empty
empty NumberLiteral MethodInvocation QualifiedName dlength
d SimpleName MethodInvocation NumberLiteral empty
d SimpleName MethodInvocation QualifiedName dlength
empty NumberLiteral MethodInvocation QualifiedName dlength
sftp SimpleName MethodInvocation SimpleName write
sftp SimpleName MethodInvocation SimpleName h
sftp SimpleName MethodInvocation QualifiedName dlength
sftp SimpleName MethodInvocation SimpleName d
sftp SimpleName MethodInvocation NumberLiteral empty
write SimpleName MethodInvocation SimpleName h
write SimpleName MethodInvocation QualifiedName dlength
write SimpleName MethodInvocation SimpleName d
write SimpleName MethodInvocation NumberLiteral empty
write SimpleName MethodInvocation QualifiedName dlength
h SimpleName MethodInvocation QualifiedName dlength
h SimpleName MethodInvocation SimpleName d
h SimpleName MethodInvocation NumberLiteral empty
h SimpleName MethodInvocation QualifiedName dlength
dlength QualifiedName MethodInvocation SimpleName d
dlength QualifiedName MethodInvocation NumberLiteral empty
dlength QualifiedName MethodInvocation QualifiedName dlength
d SimpleName MethodInvocation NumberLiteral empty
d SimpleName MethodInvocation QualifiedName dlength
empty NumberLiteral MethodInvocation QualifiedName dlength
sftp SimpleName MethodInvocation SimpleName stat
sftp SimpleName MethodInvocation SimpleName h
stat SimpleName MethodInvocation SimpleName h
attrs SimpleName VariableDeclarationFragment MethodInvocation SimpleName sftp
attrs SimpleName VariableDeclarationFragment MethodInvocation SimpleName stat
attrs SimpleName VariableDeclarationFragment MethodInvocation SimpleName h
sftp clientattributes QualifiedName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName attrs
assert not null SimpleName MethodInvocation StringLiteral no handle attributes
assert not null SimpleName MethodInvocation SimpleName attrs
no handle attributes StringLiteral MethodInvocation SimpleName attrs
sftp SimpleName MethodInvocation SimpleName close
sftp SimpleName MethodInvocation SimpleName h
close SimpleName MethodInvocation SimpleName h
sftp SimpleName MethodInvocation SimpleName open dir
sftp SimpleName MethodInvocation StringLiteral targetsftpclient
open dir SimpleName MethodInvocation StringLiteral targetsftpclient
h SimpleName Assignment MethodInvocation SimpleName sftp
h SimpleName Assignment MethodInvocation SimpleName open dir
h SimpleName Assignment MethodInvocation StringLiteral targetsftpclient
sftp SimpleName MethodInvocation SimpleName read dir
sftp SimpleName MethodInvocation SimpleName h
read dir SimpleName MethodInvocation SimpleName h
dir SimpleName VariableDeclarationFragment MethodInvocation SimpleName sftp
dir SimpleName VariableDeclarationFragment MethodInvocation SimpleName read dir
dir SimpleName VariableDeclarationFragment MethodInvocation SimpleName h
assert not null SimpleName MethodInvocation StringLiteral no dir entries
assert not null SimpleName MethodInvocation SimpleName dir
no dir entries StringLiteral MethodInvocation SimpleName dir
assert equals SimpleName MethodInvocation StringLiteral mismatced number of dir entries
assert equals SimpleName MethodInvocation NumberLiteral empty
assert equals SimpleName MethodInvocation QualifiedName dirlength
mismatced number of dir entries StringLiteral MethodInvocation NumberLiteral empty
mismatced number of dir entries StringLiteral MethodInvocation QualifiedName dirlength
empty NumberLiteral MethodInvocation QualifiedName dirlength
sftp SimpleName MethodInvocation SimpleName read dir
sftp SimpleName MethodInvocation SimpleName h
read dir SimpleName MethodInvocation SimpleName h
assert null SimpleName MethodInvocation StringLiteral unexpected entry read
assert null SimpleName MethodInvocation MethodInvocation SimpleName sftp
assert null SimpleName MethodInvocation MethodInvocation SimpleName read dir
assert null SimpleName MethodInvocation MethodInvocation SimpleName h
unexpected entry read StringLiteral MethodInvocation MethodInvocation SimpleName sftp
unexpected entry read StringLiteral MethodInvocation MethodInvocation SimpleName read dir
unexpected entry read StringLiteral MethodInvocation MethodInvocation SimpleName h
sftp SimpleName MethodInvocation SimpleName close
sftp SimpleName MethodInvocation SimpleName h
close SimpleName MethodInvocation SimpleName h
sftp SimpleName MethodInvocation SimpleName remove
sftp SimpleName MethodInvocation StringLiteral targetsftpclienttesttxt
remove SimpleName MethodInvocation StringLiteral targetsftpclienttesttxt
empty NumberLiteral InfixExpression NumberLiteral empty
byte PrimitiveType ArrayType ArrayCreation InfixExpression NumberLiteral empty
byte PrimitiveType ArrayType ArrayCreation InfixExpression NumberLiteral empty
work buf SimpleName VariableDeclarationFragment ArrayCreation ArrayType PrimitiveType byte
work buf SimpleName VariableDeclarationFragment ArrayCreation InfixExpression NumberLiteral empty
work buf SimpleName VariableDeclarationFragment ArrayCreation InfixExpression NumberLiteral empty
byte PrimitiveType ArrayType VariableDeclarationStatement VariableDeclarationFragment SimpleName work buf
sftp SimpleName MethodInvocation SimpleName write
sftp SimpleName MethodInvocation StringLiteral targetsftpclienttesttxt
write SimpleName MethodInvocation StringLiteral targetsftpclienttesttxt
os SimpleName VariableDeclarationFragment MethodInvocation SimpleName sftp
os SimpleName VariableDeclarationFragment MethodInvocation SimpleName write
os SimpleName VariableDeclarationFragment MethodInvocation StringLiteral targetsftpclienttesttxt
output stream SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName os
os SimpleName MethodInvocation SimpleName write
os SimpleName MethodInvocation SimpleName work buf
write SimpleName MethodInvocation SimpleName work buf
sftp SimpleName MethodInvocation SimpleName read
sftp SimpleName MethodInvocation StringLiteral targetsftpclienttesttxt
read SimpleName MethodInvocation StringLiteral targetsftpclienttesttxt
is SimpleName VariableDeclarationFragment MethodInvocation SimpleName sftp
is SimpleName VariableDeclarationFragment MethodInvocation SimpleName read
is SimpleName VariableDeclarationFragment MethodInvocation StringLiteral targetsftpclienttesttxt
input stream SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName is
is SimpleName MethodInvocation SimpleName read
is SimpleName MethodInvocation SimpleName work buf
read SimpleName MethodInvocation SimpleName work buf
read len SimpleName VariableDeclarationFragment MethodInvocation SimpleName is
read len SimpleName VariableDeclarationFragment MethodInvocation SimpleName read
read len SimpleName VariableDeclarationFragment MethodInvocation SimpleName work buf
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName read len
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName is
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName read
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName work buf
assert equals SimpleName MethodInvocation StringLiteral mismatched read data length
assert equals SimpleName MethodInvocation QualifiedName work buflength
assert equals SimpleName MethodInvocation SimpleName read len
mismatched read data length StringLiteral MethodInvocation QualifiedName work buflength
mismatched read data length StringLiteral MethodInvocation SimpleName read len
work buflength QualifiedName MethodInvocation SimpleName read len
is SimpleName MethodInvocation SimpleName read
i SimpleName VariableDeclarationFragment MethodInvocation SimpleName is
i SimpleName VariableDeclarationFragment MethodInvocation SimpleName read
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName is
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName read
assert equals SimpleName MethodInvocation StringLiteral unexpected read past eof
assert equals SimpleName MethodInvocation PrefixExpression NumberLiteral empty
assert equals SimpleName MethodInvocation SimpleName i
unexpected read past eof StringLiteral MethodInvocation PrefixExpression NumberLiteral empty
unexpected read past eof StringLiteral MethodInvocation SimpleName i
empty NumberLiteral PrefixExpression MethodInvocation SimpleName i
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
sftp SimpleName MethodInvocation SimpleName stat
sftp SimpleName MethodInvocation StringLiteral targetsftpclienttesttxt
stat SimpleName MethodInvocation StringLiteral targetsftpclienttesttxt
attributes SimpleName VariableDeclarationFragment MethodInvocation SimpleName sftp
attributes SimpleName VariableDeclarationFragment MethodInvocation SimpleName stat
attributes SimpleName VariableDeclarationFragment MethodInvocation StringLiteral targetsftpclienttesttxt
sftp clientattributes QualifiedName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName attributes
attributes SimpleName MethodInvocation SimpleName is regular file
assert true SimpleName MethodInvocation StringLiteral test file not detected as regular
assert true SimpleName MethodInvocation MethodInvocation SimpleName attributes
assert true SimpleName MethodInvocation MethodInvocation SimpleName is regular file
test file not detected as regular StringLiteral MethodInvocation MethodInvocation SimpleName attributes
test file not detected as regular StringLiteral MethodInvocation MethodInvocation SimpleName is regular file
sftp SimpleName MethodInvocation SimpleName stat
sftp SimpleName MethodInvocation StringLiteral targetsftpclient
stat SimpleName MethodInvocation StringLiteral targetsftpclient
attributes SimpleName Assignment MethodInvocation SimpleName sftp
attributes SimpleName Assignment MethodInvocation SimpleName stat
attributes SimpleName Assignment MethodInvocation StringLiteral targetsftpclient
attributes SimpleName MethodInvocation SimpleName is directory
assert true SimpleName MethodInvocation StringLiteral test directory not reported as such
assert true SimpleName MethodInvocation MethodInvocation SimpleName attributes
assert true SimpleName MethodInvocation MethodInvocation SimpleName is directory
test directory not reported as such StringLiteral MethodInvocation MethodInvocation SimpleName attributes
test directory not reported as such StringLiteral MethodInvocation MethodInvocation SimpleName is directory
nb SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName nb
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment NumberLiteral empty
sftp clientdir entry QualifiedName SimpleType SingleVariableDeclaration SimpleName entry
sftp SimpleName MethodInvocation SimpleName read dir
sftp SimpleName MethodInvocation StringLiteral targetsftpclient
read dir SimpleName MethodInvocation StringLiteral targetsftpclient
assert not null SimpleName MethodInvocation StringLiteral unexpected null entry
assert not null SimpleName MethodInvocation SimpleName entry
unexpected null entry StringLiteral MethodInvocation SimpleName entry
entry SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName sftp
entry SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName read dir
entry SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation StringLiteral targetsftpclient
assert equals SimpleName MethodInvocation StringLiteral mismatched read dir entries
assert equals SimpleName MethodInvocation NumberLiteral empty
assert equals SimpleName MethodInvocation SimpleName nb
mismatched read dir entries StringLiteral MethodInvocation NumberLiteral empty
mismatched read dir entries StringLiteral MethodInvocation SimpleName nb
empty NumberLiteral MethodInvocation SimpleName nb
sftp SimpleName MethodInvocation SimpleName remove
sftp SimpleName MethodInvocation StringLiteral targetsftpclienttesttxt
remove SimpleName MethodInvocation StringLiteral targetsftpclienttesttxt
sftp SimpleName MethodInvocation SimpleName rmdir
sftp SimpleName MethodInvocation StringLiteral targetsftpclient
rmdir SimpleName MethodInvocation StringLiteral targetsftpclient
client SimpleName MethodInvocation SimpleName stop
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test client
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test client
public Modifier MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration SimpleName test client
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
test client SimpleName MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test client
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test client
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
