string SimpleName SimpleType SingleVariableDeclaration SimpleName location
tablet client serviceiface QualifiedName SimpleType SingleVariableDeclaration SimpleName client
t info SimpleName SimpleType SingleVariableDeclaration SimpleName tinfo
cached session i ds SimpleName MethodInvocation SimpleName get
cached session i ds SimpleName MethodInvocation SimpleName location
get SimpleName MethodInvocation SimpleName location
sid SimpleName VariableDeclarationFragment MethodInvocation SimpleName cached session i ds
sid SimpleName VariableDeclarationFragment MethodInvocation SimpleName get
sid SimpleName VariableDeclarationFragment MethodInvocation SimpleName location
session id SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName sid
sid SimpleName MethodInvocation SimpleName is active
cached session i ds SimpleName MethodInvocation SimpleName remove
cached session i ds SimpleName MethodInvocation SimpleName location
remove SimpleName MethodInvocation SimpleName location
sidreserved QualifiedName Assignment BooleanLiteral true
credentials SimpleName MethodInvocation SimpleName to thrift
credentials SimpleName MethodInvocation SimpleName instance
to thrift SimpleName MethodInvocation SimpleName instance
auths SimpleName MethodInvocation SimpleName get authorizations
byte buffer util SimpleName MethodInvocation SimpleName to byte buffers
byte buffer util SimpleName MethodInvocation MethodInvocation SimpleName auths
byte buffer util SimpleName MethodInvocation MethodInvocation SimpleName get authorizations
to byte buffers SimpleName MethodInvocation MethodInvocation SimpleName auths
to byte buffers SimpleName MethodInvocation MethodInvocation SimpleName get authorizations
client SimpleName MethodInvocation SimpleName start conditional update
client SimpleName MethodInvocation SimpleName tinfo
client SimpleName MethodInvocation MethodInvocation SimpleName credentials
client SimpleName MethodInvocation MethodInvocation SimpleName to thrift
client SimpleName MethodInvocation MethodInvocation SimpleName instance
client SimpleName MethodInvocation MethodInvocation SimpleName byte buffer util
client SimpleName MethodInvocation MethodInvocation SimpleName to byte buffers
client SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName auths
client SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get authorizations
client SimpleName MethodInvocation SimpleName table id
start conditional update SimpleName MethodInvocation SimpleName tinfo
start conditional update SimpleName MethodInvocation MethodInvocation SimpleName credentials
start conditional update SimpleName MethodInvocation MethodInvocation SimpleName to thrift
start conditional update SimpleName MethodInvocation MethodInvocation SimpleName instance
start conditional update SimpleName MethodInvocation MethodInvocation SimpleName byte buffer util
start conditional update SimpleName MethodInvocation MethodInvocation SimpleName to byte buffers
start conditional update SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName auths
start conditional update SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get authorizations
start conditional update SimpleName MethodInvocation SimpleName table id
tinfo SimpleName MethodInvocation MethodInvocation SimpleName credentials
tinfo SimpleName MethodInvocation MethodInvocation SimpleName to thrift
tinfo SimpleName MethodInvocation MethodInvocation SimpleName instance
tinfo SimpleName MethodInvocation MethodInvocation SimpleName byte buffer util
tinfo SimpleName MethodInvocation MethodInvocation SimpleName to byte buffers
tinfo SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName auths
tinfo SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get authorizations
tinfo SimpleName MethodInvocation SimpleName table id
credentials SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName byte buffer util
credentials SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to byte buffers
to thrift SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName byte buffer util
to thrift SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to byte buffers
instance SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName byte buffer util
instance SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to byte buffers
credentials SimpleName MethodInvocation MethodInvocation SimpleName table id
to thrift SimpleName MethodInvocation MethodInvocation SimpleName table id
instance SimpleName MethodInvocation MethodInvocation SimpleName table id
byte buffer util SimpleName MethodInvocation MethodInvocation SimpleName table id
to byte buffers SimpleName MethodInvocation MethodInvocation SimpleName table id
auths SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName table id
get authorizations SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName table id
tcs SimpleName VariableDeclarationFragment MethodInvocation SimpleName client
tcs SimpleName VariableDeclarationFragment MethodInvocation SimpleName start conditional update
tcs SimpleName VariableDeclarationFragment MethodInvocation SimpleName tinfo
tcs SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName credentials
tcs SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName to thrift
tcs SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName instance
tcs SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName byte buffer util
tcs SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName to byte buffers
tcs SimpleName VariableDeclarationFragment MethodInvocation SimpleName table id
t conditional session SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName tcs
sid SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName session id
session id SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName sid
sidreserved QualifiedName Assignment BooleanLiteral true
sidsession id QualifiedName Assignment QualifiedName tcssession id
sidlock id QualifiedName Assignment QualifiedName tcstserver lock
sidttl QualifiedName Assignment QualifiedName tcsttl
sidlocation QualifiedName Assignment SimpleName location
cached session i ds SimpleName MethodInvocation SimpleName put
cached session i ds SimpleName MethodInvocation SimpleName location
cached session i ds SimpleName MethodInvocation SimpleName sid
put SimpleName MethodInvocation SimpleName location
put SimpleName MethodInvocation SimpleName sid
location SimpleName MethodInvocation SimpleName sid
cached session i ds SimpleName SynchronizedStatement Block ReturnStatement SimpleName sid
cached session i ds SimpleName SynchronizedStatement Block SynchronizedStatement SimpleName cached session i ds
private Modifier MethodDeclaration SimpleType SimpleName session id
private Modifier MethodDeclaration SimpleName reserve session id
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName location
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType QualifiedName tablet client serviceiface
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName client
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName t info
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName tinfo
session id SimpleName SimpleType MethodDeclaration SimpleName reserve session id
session id SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName location
session id SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName client
session id SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName tinfo
session id SimpleName SimpleType MethodDeclaration SimpleType SimpleName thrift security exception
reserve session id SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
reserve session id SimpleName MethodDeclaration SingleVariableDeclaration SimpleName location
reserve session id SimpleName MethodDeclaration SingleVariableDeclaration SimpleType QualifiedName tablet client serviceiface
reserve session id SimpleName MethodDeclaration SingleVariableDeclaration SimpleName client
reserve session id SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName t info
reserve session id SimpleName MethodDeclaration SingleVariableDeclaration SimpleName tinfo
reserve session id SimpleName MethodDeclaration SimpleType SimpleName thrift security exception
reserve session id SimpleName MethodDeclaration SimpleType SimpleName t exception
location SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName client
location SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName tinfo
location SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName thrift security exception
location SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName t exception
client SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName tinfo
client SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName thrift security exception
client SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName t exception
tinfo SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName thrift security exception
tinfo SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName t exception
thrift security exception SimpleName SimpleType MethodDeclaration SimpleType SimpleName t exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName session id
public Modifier TypeDeclaration MethodDeclaration SimpleName reserve session id
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName location
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName client
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName tinfo
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName thrift security exception
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName t exception
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName session id
test SimpleName TypeDeclaration MethodDeclaration SimpleName reserve session id
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName location
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName client
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName tinfo
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName thrift security exception
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName t exception
