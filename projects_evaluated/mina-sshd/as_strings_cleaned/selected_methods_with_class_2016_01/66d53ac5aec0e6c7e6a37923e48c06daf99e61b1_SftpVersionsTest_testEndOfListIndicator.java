client SimpleName VariableDeclarationFragment MethodInvocation SimpleName setup test client
ssh client SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName client
client SimpleName MethodInvocation SimpleName start
client SimpleName MethodInvocation SimpleName connect
client SimpleName MethodInvocation MethodInvocation SimpleName get current test name
client SimpleName MethodInvocation SimpleName test localhost
client SimpleName MethodInvocation SimpleName port
connect SimpleName MethodInvocation MethodInvocation SimpleName get current test name
connect SimpleName MethodInvocation SimpleName test localhost
connect SimpleName MethodInvocation SimpleName port
get current test name SimpleName MethodInvocation MethodInvocation SimpleName test localhost
get current test name SimpleName MethodInvocation MethodInvocation SimpleName port
test localhost SimpleName MethodInvocation SimpleName port
client SimpleName MethodInvocation MethodInvocation SimpleName verify
connect SimpleName MethodInvocation MethodInvocation SimpleName verify
get current test name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName verify
test localhost SimpleName MethodInvocation MethodInvocation SimpleName verify
port SimpleName MethodInvocation MethodInvocation SimpleName verify
client SimpleName MethodInvocation MethodInvocation NumberLiteral l
connect SimpleName MethodInvocation MethodInvocation NumberLiteral l
get current test name SimpleName MethodInvocation MethodInvocation MethodInvocation NumberLiteral l
test localhost SimpleName MethodInvocation MethodInvocation NumberLiteral l
port SimpleName MethodInvocation MethodInvocation NumberLiteral l
client SimpleName MethodInvocation MethodInvocation QualifiedName time unitseconds
connect SimpleName MethodInvocation MethodInvocation QualifiedName time unitseconds
get current test name SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName time unitseconds
test localhost SimpleName MethodInvocation MethodInvocation QualifiedName time unitseconds
port SimpleName MethodInvocation MethodInvocation QualifiedName time unitseconds
verify SimpleName MethodInvocation NumberLiteral l
verify SimpleName MethodInvocation QualifiedName time unitseconds
l NumberLiteral MethodInvocation QualifiedName time unitseconds
client SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get session
connect SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get session
test localhost SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get session
port SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get session
verify SimpleName MethodInvocation MethodInvocation SimpleName get session
l NumberLiteral MethodInvocation MethodInvocation SimpleName get session
time unitseconds QualifiedName MethodInvocation MethodInvocation SimpleName get session
session SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName verify
session SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation NumberLiteral l
session SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation QualifiedName time unitseconds
session SimpleName VariableDeclarationFragment MethodInvocation SimpleName get session
client session SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName session
session SimpleName MethodInvocation SimpleName add password identity
session SimpleName MethodInvocation MethodInvocation SimpleName get current test name
add password identity SimpleName MethodInvocation MethodInvocation SimpleName get current test name
session SimpleName MethodInvocation SimpleName auth
session SimpleName MethodInvocation MethodInvocation SimpleName verify
auth SimpleName MethodInvocation MethodInvocation SimpleName verify
session SimpleName MethodInvocation MethodInvocation NumberLiteral l
auth SimpleName MethodInvocation MethodInvocation NumberLiteral l
session SimpleName MethodInvocation MethodInvocation QualifiedName time unitseconds
auth SimpleName MethodInvocation MethodInvocation QualifiedName time unitseconds
verify SimpleName MethodInvocation NumberLiteral l
verify SimpleName MethodInvocation QualifiedName time unitseconds
l NumberLiteral MethodInvocation QualifiedName time unitseconds
session SimpleName MethodInvocation SimpleName create sftp client
session SimpleName MethodInvocation MethodInvocation SimpleName get tested version
create sftp client SimpleName MethodInvocation MethodInvocation SimpleName get tested version
sftp SimpleName VariableDeclarationFragment MethodInvocation SimpleName session
sftp SimpleName VariableDeclarationFragment MethodInvocation SimpleName create sftp client
sftp SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get tested version
sftp client SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName sftp
atomic reference SimpleName SimpleType ParameterizedType SimpleType SimpleName boolean
sftp SimpleName MethodInvocation SimpleName get version
version SimpleName VariableDeclarationFragment MethodInvocation SimpleName sftp
version SimpleName VariableDeclarationFragment MethodInvocation SimpleName get version
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName version
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName sftp
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get version
target path SimpleName VariableDeclarationFragment MethodInvocation SimpleName detect target folder
path SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName target path
target path SimpleName MethodInvocation SimpleName get parent
parent path SimpleName VariableDeclarationFragment MethodInvocation SimpleName target path
parent path SimpleName VariableDeclarationFragment MethodInvocation SimpleName get parent
path SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName parent path
utils SimpleName MethodInvocation SimpleName resolve relative remote path
utils SimpleName MethodInvocation SimpleName parent path
utils SimpleName MethodInvocation SimpleName target path
resolve relative remote path SimpleName MethodInvocation SimpleName parent path
resolve relative remote path SimpleName MethodInvocation SimpleName target path
parent path SimpleName MethodInvocation SimpleName target path
remote path SimpleName VariableDeclarationFragment MethodInvocation SimpleName utils
remote path SimpleName VariableDeclarationFragment MethodInvocation SimpleName resolve relative remote path
remote path SimpleName VariableDeclarationFragment MethodInvocation SimpleName parent path
remote path SimpleName VariableDeclarationFragment MethodInvocation SimpleName target path
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName remote path
sftp SimpleName MethodInvocation SimpleName open dir
sftp SimpleName MethodInvocation SimpleName remote path
open dir SimpleName MethodInvocation SimpleName remote path
handle SimpleName VariableDeclarationFragment MethodInvocation SimpleName sftp
handle SimpleName VariableDeclarationFragment MethodInvocation SimpleName open dir
handle SimpleName VariableDeclarationFragment MethodInvocation SimpleName remote path
closeable handle SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName handle
list SimpleName SimpleType ParameterizedType SimpleType SimpleName dir entry
sftp SimpleName MethodInvocation SimpleName read dir
sftp SimpleName MethodInvocation SimpleName handle
sftp SimpleName MethodInvocation SimpleName eol indicator
read dir SimpleName MethodInvocation SimpleName handle
read dir SimpleName MethodInvocation SimpleName eol indicator
handle SimpleName MethodInvocation SimpleName eol indicator
entries SimpleName VariableDeclarationFragment MethodInvocation SimpleName sftp
entries SimpleName VariableDeclarationFragment MethodInvocation SimpleName read dir
entries SimpleName VariableDeclarationFragment MethodInvocation SimpleName handle
entries SimpleName VariableDeclarationFragment MethodInvocation SimpleName eol indicator
index SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName index
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
sftp SimpleName MethodInvocation SimpleName read dir
sftp SimpleName MethodInvocation SimpleName handle
sftp SimpleName MethodInvocation SimpleName eol indicator
read dir SimpleName MethodInvocation SimpleName handle
read dir SimpleName MethodInvocation SimpleName eol indicator
handle SimpleName MethodInvocation SimpleName eol indicator
entries SimpleName Assignment MethodInvocation SimpleName sftp
entries SimpleName Assignment MethodInvocation SimpleName read dir
entries SimpleName Assignment MethodInvocation SimpleName handle
entries SimpleName Assignment MethodInvocation SimpleName eol indicator
eol indicator SimpleName MethodInvocation SimpleName get
value SimpleName VariableDeclarationFragment MethodInvocation SimpleName eol indicator
value SimpleName VariableDeclarationFragment MethodInvocation SimpleName get
boolean SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName value
version SimpleName InfixExpression QualifiedName sftp constantssftp v
unexpected indicator value at iteration # StringLiteral InfixExpression SimpleName index
assert null SimpleName MethodInvocation InfixExpression StringLiteral unexpected indicator value at iteration #
assert null SimpleName MethodInvocation InfixExpression SimpleName index
assert null SimpleName MethodInvocation SimpleName value
unexpected indicator value at iteration # StringLiteral InfixExpression MethodInvocation SimpleName value
index SimpleName InfixExpression MethodInvocation SimpleName value
no indicator returned at iteration # StringLiteral InfixExpression SimpleName index
assert not null SimpleName MethodInvocation InfixExpression StringLiteral no indicator returned at iteration #
assert not null SimpleName MethodInvocation InfixExpression SimpleName index
assert not null SimpleName MethodInvocation SimpleName value
no indicator returned at iteration # StringLiteral InfixExpression MethodInvocation SimpleName value
index SimpleName InfixExpression MethodInvocation SimpleName value
value SimpleName MethodInvocation SimpleName boolean value
eol indicator SimpleName MethodInvocation SimpleName set
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName entries
int PrimitiveType VariableDeclarationExpression ForStatement Assignment SimpleName entries
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName index
entries SimpleName InfixExpression ForStatement Assignment SimpleName entries
entries SimpleName InfixExpression ForStatement PostfixExpression SimpleName index
entries SimpleName Assignment ForStatement PostfixExpression SimpleName index
eol indicator SimpleName MethodInvocation SimpleName get
value SimpleName VariableDeclarationFragment MethodInvocation SimpleName eol indicator
value SimpleName VariableDeclarationFragment MethodInvocation SimpleName get
boolean SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName value
version SimpleName InfixExpression QualifiedName sftp constantssftp v
assert null SimpleName MethodInvocation StringLiteral unexpected endoflist indication received at end of entries
assert null SimpleName MethodInvocation SimpleName value
unexpected endoflist indication received at end of entries StringLiteral MethodInvocation SimpleName value
assert null SimpleName MethodInvocation StringLiteral unexpected no last entries indication
assert null SimpleName MethodInvocation SimpleName entries
unexpected no last entries indication StringLiteral MethodInvocation SimpleName entries
assert not null SimpleName MethodInvocation StringLiteral no endoflist indication received at end of entries
assert not null SimpleName MethodInvocation SimpleName value
no endoflist indication received at end of entries StringLiteral MethodInvocation SimpleName value
assert not null SimpleName MethodInvocation StringLiteral no last received entries
assert not null SimpleName MethodInvocation SimpleName entries
no last received entries StringLiteral MethodInvocation SimpleName entries
value SimpleName MethodInvocation SimpleName boolean value
assert true SimpleName MethodInvocation StringLiteral bad endoflist value
assert true SimpleName MethodInvocation MethodInvocation SimpleName value
assert true SimpleName MethodInvocation MethodInvocation SimpleName boolean value
bad endoflist value StringLiteral MethodInvocation MethodInvocation SimpleName value
bad endoflist value StringLiteral MethodInvocation MethodInvocation SimpleName boolean value
client SimpleName MethodInvocation SimpleName stop
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test end of list indicator
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test end of list indicator
public Modifier MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration SimpleName test end of list indicator
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
test end of list indicator SimpleName MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test end of list indicator
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test end of list indicator
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
