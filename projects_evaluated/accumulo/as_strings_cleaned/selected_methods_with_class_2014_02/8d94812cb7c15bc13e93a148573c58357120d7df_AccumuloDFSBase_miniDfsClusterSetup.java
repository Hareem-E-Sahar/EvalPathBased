system SimpleName MethodInvocation SimpleName set property
system SimpleName MethodInvocation StringLiteral testbuilddata
system SimpleName MethodInvocation StringLiteral targetbuildtestdata
set property SimpleName MethodInvocation StringLiteral testbuilddata
set property SimpleName MethodInvocation StringLiteral targetbuildtestdata
testbuilddata StringLiteral MethodInvocation StringLiteral targetbuildtestdata
conf SimpleName Assignment ClassInstanceCreation SimpleType SimpleName configuration
conf SimpleName MethodInvocation SimpleName set
conf SimpleName MethodInvocation StringLiteral hadoopsecuritytokenserviceuse ip
conf SimpleName MethodInvocation StringLiteral true
set SimpleName MethodInvocation StringLiteral hadoopsecuritytokenserviceuse ip
set SimpleName MethodInvocation StringLiteral true
hadoopsecuritytokenserviceuse ip StringLiteral MethodInvocation StringLiteral true
runtime SimpleName MethodInvocation SimpleName get runtime
runtime SimpleName MethodInvocation MethodInvocation SimpleName exec
get runtime SimpleName MethodInvocation MethodInvocation SimpleName exec
runtime SimpleName MethodInvocation MethodInvocation StringLiteral binsh c umask
get runtime SimpleName MethodInvocation MethodInvocation StringLiteral binsh c umask
exec SimpleName MethodInvocation StringLiteral binsh c umask
p SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName runtime
p SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get runtime
p SimpleName VariableDeclarationFragment MethodInvocation SimpleName exec
p SimpleName VariableDeclarationFragment MethodInvocation StringLiteral binsh c umask
process SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName p
p SimpleName MethodInvocation SimpleName get input stream
input stream reader SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName p
input stream reader SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get input stream
bri SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName buffered reader
buffered reader SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName bri
bri SimpleName MethodInvocation SimpleName read line
line SimpleName VariableDeclarationFragment MethodInvocation SimpleName bri
line SimpleName VariableDeclarationFragment MethodInvocation SimpleName read line
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName line
p SimpleName MethodInvocation SimpleName wait for
line SimpleName MethodInvocation SimpleName trim
short SimpleName MethodInvocation SimpleName parse short
short SimpleName MethodInvocation MethodInvocation SimpleName line
short SimpleName MethodInvocation MethodInvocation SimpleName trim
short SimpleName MethodInvocation NumberLiteral empty
parse short SimpleName MethodInvocation MethodInvocation SimpleName line
parse short SimpleName MethodInvocation MethodInvocation SimpleName trim
parse short SimpleName MethodInvocation NumberLiteral empty
line SimpleName MethodInvocation MethodInvocation NumberLiteral empty
trim SimpleName MethodInvocation MethodInvocation NumberLiteral empty
umask SimpleName VariableDeclarationFragment MethodInvocation SimpleName short
umask SimpleName VariableDeclarationFragment MethodInvocation SimpleName parse short
umask SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName line
umask SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName trim
umask SimpleName VariableDeclarationFragment MethodInvocation NumberLiteral empty
short SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName umask
empty NumberLiteral InfixExpression SimpleName umask
new permission SimpleName VariableDeclarationFragment InfixExpression NumberLiteral empty
new permission SimpleName VariableDeclarationFragment InfixExpression SimpleName umask
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName new permission
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment InfixExpression NumberLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment InfixExpression SimpleName umask
string SimpleName MethodInvocation SimpleName format
string SimpleName MethodInvocation StringLiteral % o
string SimpleName MethodInvocation SimpleName new permission
format SimpleName MethodInvocation StringLiteral % o
format SimpleName MethodInvocation SimpleName new permission
% o StringLiteral MethodInvocation SimpleName new permission
conf SimpleName MethodInvocation SimpleName set
conf SimpleName MethodInvocation StringLiteral dfsdatanodedatadirperm
conf SimpleName MethodInvocation MethodInvocation SimpleName string
conf SimpleName MethodInvocation MethodInvocation SimpleName format
conf SimpleName MethodInvocation MethodInvocation StringLiteral % o
conf SimpleName MethodInvocation MethodInvocation SimpleName new permission
set SimpleName MethodInvocation StringLiteral dfsdatanodedatadirperm
set SimpleName MethodInvocation MethodInvocation SimpleName string
set SimpleName MethodInvocation MethodInvocation SimpleName format
set SimpleName MethodInvocation MethodInvocation StringLiteral % o
set SimpleName MethodInvocation MethodInvocation SimpleName new permission
dfsdatanodedatadirperm StringLiteral MethodInvocation MethodInvocation SimpleName string
dfsdatanodedatadirperm StringLiteral MethodInvocation MethodInvocation SimpleName format
dfsdatanodedatadirperm StringLiteral MethodInvocation MethodInvocation StringLiteral % o
dfsdatanodedatadirperm StringLiteral MethodInvocation MethodInvocation SimpleName new permission
exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
runtime exception SimpleName SimpleType ClassInstanceCreation StringLiteral error getting umask from os
runtime exception SimpleName SimpleType ClassInstanceCreation SimpleName e
error getting umask from os StringLiteral ClassInstanceCreation SimpleName e
empty NumberLiteral InfixExpression NumberLiteral empty
conf SimpleName MethodInvocation SimpleName set long
conf SimpleName MethodInvocation QualifiedName dfs config keysdfs block size key
conf SimpleName MethodInvocation InfixExpression NumberLiteral empty
conf SimpleName MethodInvocation InfixExpression NumberLiteral empty
set long SimpleName MethodInvocation QualifiedName dfs config keysdfs block size key
set long SimpleName MethodInvocation InfixExpression NumberLiteral empty
set long SimpleName MethodInvocation InfixExpression NumberLiteral empty
dfs config keysdfs block size key QualifiedName MethodInvocation InfixExpression NumberLiteral empty
dfs config keysdfs block size key QualifiedName MethodInvocation InfixExpression NumberLiteral empty
mini dfs cluster SimpleName SimpleType ClassInstanceCreation SimpleName conf
mini dfs cluster SimpleName SimpleType ClassInstanceCreation NumberLiteral empty
mini dfs cluster SimpleName SimpleType ClassInstanceCreation BooleanLiteral true
conf SimpleName ClassInstanceCreation NumberLiteral empty
conf SimpleName ClassInstanceCreation BooleanLiteral true
empty NumberLiteral ClassInstanceCreation BooleanLiteral true
cluster SimpleName Assignment ClassInstanceCreation SimpleType SimpleName mini dfs cluster
cluster SimpleName Assignment ClassInstanceCreation SimpleName conf
cluster SimpleName Assignment ClassInstanceCreation NumberLiteral empty
cluster SimpleName Assignment ClassInstanceCreation BooleanLiteral true
cluster SimpleName MethodInvocation SimpleName wait active
cluster SimpleName MethodInvocation SimpleName get file system
cluster SimpleName MethodInvocation MethodInvocation SimpleName get uri
get file system SimpleName MethodInvocation MethodInvocation SimpleName get uri
hdfs uri SimpleName Assignment MethodInvocation MethodInvocation SimpleName cluster
hdfs uri SimpleName Assignment MethodInvocation MethodInvocation SimpleName get file system
hdfs uri SimpleName Assignment MethodInvocation SimpleName get uri
io exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
runtime exception SimpleName SimpleType ClassInstanceCreation StringLiteral error setting up mini cluster
runtime exception SimpleName SimpleType ClassInstanceCreation SimpleName e
error setting up mini cluster StringLiteral ClassInstanceCreation SimpleName e
vfs SimpleName Assignment ClassInstanceCreation SimpleType SimpleName default file system manager
vfs SimpleName MethodInvocation SimpleName set files cache
vfs SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName default files cache
set files cache SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName default files cache
vfs SimpleName MethodInvocation SimpleName add provider
vfs SimpleName MethodInvocation StringLiteral res
vfs SimpleName MethodInvocation ClassInstanceCreation SimpleType QualifiedName orgapachecommonsvfs providerresresource file provider
add provider SimpleName MethodInvocation StringLiteral res
add provider SimpleName MethodInvocation ClassInstanceCreation SimpleType QualifiedName orgapachecommonsvfs providerresresource file provider
res StringLiteral MethodInvocation ClassInstanceCreation SimpleType QualifiedName orgapachecommonsvfs providerresresource file provider
vfs SimpleName MethodInvocation SimpleName add provider
vfs SimpleName MethodInvocation StringLiteral zip
vfs SimpleName MethodInvocation ClassInstanceCreation SimpleType QualifiedName orgapachecommonsvfs providerzipzip file provider
add provider SimpleName MethodInvocation StringLiteral zip
add provider SimpleName MethodInvocation ClassInstanceCreation SimpleType QualifiedName orgapachecommonsvfs providerzipzip file provider
zip StringLiteral MethodInvocation ClassInstanceCreation SimpleType QualifiedName orgapachecommonsvfs providerzipzip file provider
vfs SimpleName MethodInvocation SimpleName add provider
vfs SimpleName MethodInvocation StringLiteral gz
vfs SimpleName MethodInvocation ClassInstanceCreation SimpleType QualifiedName orgapachecommonsvfs providergzipgzip file provider
add provider SimpleName MethodInvocation StringLiteral gz
add provider SimpleName MethodInvocation ClassInstanceCreation SimpleType QualifiedName orgapachecommonsvfs providergzipgzip file provider
gz StringLiteral MethodInvocation ClassInstanceCreation SimpleType QualifiedName orgapachecommonsvfs providergzipgzip file provider
vfs SimpleName MethodInvocation SimpleName add provider
vfs SimpleName MethodInvocation StringLiteral ram
vfs SimpleName MethodInvocation ClassInstanceCreation SimpleType QualifiedName orgapachecommonsvfs providerramram file provider
add provider SimpleName MethodInvocation StringLiteral ram
add provider SimpleName MethodInvocation ClassInstanceCreation SimpleType QualifiedName orgapachecommonsvfs providerramram file provider
ram StringLiteral MethodInvocation ClassInstanceCreation SimpleType QualifiedName orgapachecommonsvfs providerramram file provider
vfs SimpleName MethodInvocation SimpleName add provider
vfs SimpleName MethodInvocation StringLiteral file
vfs SimpleName MethodInvocation ClassInstanceCreation SimpleType QualifiedName orgapachecommonsvfs providerlocaldefault local file provider
add provider SimpleName MethodInvocation StringLiteral file
add provider SimpleName MethodInvocation ClassInstanceCreation SimpleType QualifiedName orgapachecommonsvfs providerlocaldefault local file provider
file StringLiteral MethodInvocation ClassInstanceCreation SimpleType QualifiedName orgapachecommonsvfs providerlocaldefault local file provider
vfs SimpleName MethodInvocation SimpleName add provider
vfs SimpleName MethodInvocation StringLiteral jar
vfs SimpleName MethodInvocation ClassInstanceCreation SimpleType QualifiedName orgapachecommonsvfs providerjarjar file provider
add provider SimpleName MethodInvocation StringLiteral jar
add provider SimpleName MethodInvocation ClassInstanceCreation SimpleType QualifiedName orgapachecommonsvfs providerjarjar file provider
jar StringLiteral MethodInvocation ClassInstanceCreation SimpleType QualifiedName orgapachecommonsvfs providerjarjar file provider
vfs SimpleName MethodInvocation SimpleName add provider
vfs SimpleName MethodInvocation StringLiteral http
vfs SimpleName MethodInvocation ClassInstanceCreation SimpleType QualifiedName orgapachecommonsvfs providerhttphttp file provider
add provider SimpleName MethodInvocation StringLiteral http
add provider SimpleName MethodInvocation ClassInstanceCreation SimpleType QualifiedName orgapachecommonsvfs providerhttphttp file provider
http StringLiteral MethodInvocation ClassInstanceCreation SimpleType QualifiedName orgapachecommonsvfs providerhttphttp file provider
vfs SimpleName MethodInvocation SimpleName add provider
vfs SimpleName MethodInvocation StringLiteral https
vfs SimpleName MethodInvocation ClassInstanceCreation SimpleType QualifiedName orgapachecommonsvfs providerhttpshttps file provider
add provider SimpleName MethodInvocation StringLiteral https
add provider SimpleName MethodInvocation ClassInstanceCreation SimpleType QualifiedName orgapachecommonsvfs providerhttpshttps file provider
https StringLiteral MethodInvocation ClassInstanceCreation SimpleType QualifiedName orgapachecommonsvfs providerhttpshttps file provider
vfs SimpleName MethodInvocation SimpleName add provider
vfs SimpleName MethodInvocation StringLiteral ftp
vfs SimpleName MethodInvocation ClassInstanceCreation SimpleType QualifiedName orgapachecommonsvfs providerftpftp file provider
add provider SimpleName MethodInvocation StringLiteral ftp
add provider SimpleName MethodInvocation ClassInstanceCreation SimpleType QualifiedName orgapachecommonsvfs providerftpftp file provider
ftp StringLiteral MethodInvocation ClassInstanceCreation SimpleType QualifiedName orgapachecommonsvfs providerftpftp file provider
vfs SimpleName MethodInvocation SimpleName add provider
vfs SimpleName MethodInvocation StringLiteral ftps
vfs SimpleName MethodInvocation ClassInstanceCreation SimpleType QualifiedName orgapachecommonsvfs providerftpsftps file provider
add provider SimpleName MethodInvocation StringLiteral ftps
add provider SimpleName MethodInvocation ClassInstanceCreation SimpleType QualifiedName orgapachecommonsvfs providerftpsftps file provider
ftps StringLiteral MethodInvocation ClassInstanceCreation SimpleType QualifiedName orgapachecommonsvfs providerftpsftps file provider
vfs SimpleName MethodInvocation SimpleName add provider
vfs SimpleName MethodInvocation StringLiteral war
vfs SimpleName MethodInvocation ClassInstanceCreation SimpleType QualifiedName orgapachecommonsvfs providerjarjar file provider
add provider SimpleName MethodInvocation StringLiteral war
add provider SimpleName MethodInvocation ClassInstanceCreation SimpleType QualifiedName orgapachecommonsvfs providerjarjar file provider
war StringLiteral MethodInvocation ClassInstanceCreation SimpleType QualifiedName orgapachecommonsvfs providerjarjar file provider
vfs SimpleName MethodInvocation SimpleName add provider
vfs SimpleName MethodInvocation StringLiteral par
vfs SimpleName MethodInvocation ClassInstanceCreation SimpleType QualifiedName orgapachecommonsvfs providerjarjar file provider
add provider SimpleName MethodInvocation StringLiteral par
add provider SimpleName MethodInvocation ClassInstanceCreation SimpleType QualifiedName orgapachecommonsvfs providerjarjar file provider
par StringLiteral MethodInvocation ClassInstanceCreation SimpleType QualifiedName orgapachecommonsvfs providerjarjar file provider
vfs SimpleName MethodInvocation SimpleName add provider
vfs SimpleName MethodInvocation StringLiteral ear
vfs SimpleName MethodInvocation ClassInstanceCreation SimpleType QualifiedName orgapachecommonsvfs providerjarjar file provider
add provider SimpleName MethodInvocation StringLiteral ear
add provider SimpleName MethodInvocation ClassInstanceCreation SimpleType QualifiedName orgapachecommonsvfs providerjarjar file provider
ear StringLiteral MethodInvocation ClassInstanceCreation SimpleType QualifiedName orgapachecommonsvfs providerjarjar file provider
vfs SimpleName MethodInvocation SimpleName add provider
vfs SimpleName MethodInvocation StringLiteral sar
vfs SimpleName MethodInvocation ClassInstanceCreation SimpleType QualifiedName orgapachecommonsvfs providerjarjar file provider
add provider SimpleName MethodInvocation StringLiteral sar
add provider SimpleName MethodInvocation ClassInstanceCreation SimpleType QualifiedName orgapachecommonsvfs providerjarjar file provider
sar StringLiteral MethodInvocation ClassInstanceCreation SimpleType QualifiedName orgapachecommonsvfs providerjarjar file provider
vfs SimpleName MethodInvocation SimpleName add provider
vfs SimpleName MethodInvocation StringLiteral ejb
vfs SimpleName MethodInvocation ClassInstanceCreation SimpleType QualifiedName orgapachecommonsvfs providerjarjar file provider
add provider SimpleName MethodInvocation StringLiteral ejb
add provider SimpleName MethodInvocation ClassInstanceCreation SimpleType QualifiedName orgapachecommonsvfs providerjarjar file provider
ejb StringLiteral MethodInvocation ClassInstanceCreation SimpleType QualifiedName orgapachecommonsvfs providerjarjar file provider
vfs SimpleName MethodInvocation SimpleName add provider
vfs SimpleName MethodInvocation StringLiteral tmp
vfs SimpleName MethodInvocation ClassInstanceCreation SimpleType QualifiedName orgapachecommonsvfs providertemptemporary file provider
add provider SimpleName MethodInvocation StringLiteral tmp
add provider SimpleName MethodInvocation ClassInstanceCreation SimpleType QualifiedName orgapachecommonsvfs providertemptemporary file provider
tmp StringLiteral MethodInvocation ClassInstanceCreation SimpleType QualifiedName orgapachecommonsvfs providertemptemporary file provider
vfs SimpleName MethodInvocation SimpleName add provider
vfs SimpleName MethodInvocation StringLiteral tar
vfs SimpleName MethodInvocation ClassInstanceCreation SimpleType QualifiedName orgapachecommonsvfs providertartar file provider
add provider SimpleName MethodInvocation StringLiteral tar
add provider SimpleName MethodInvocation ClassInstanceCreation SimpleType QualifiedName orgapachecommonsvfs providertartar file provider
tar StringLiteral MethodInvocation ClassInstanceCreation SimpleType QualifiedName orgapachecommonsvfs providertartar file provider
vfs SimpleName MethodInvocation SimpleName add provider
vfs SimpleName MethodInvocation StringLiteral tbz
vfs SimpleName MethodInvocation ClassInstanceCreation SimpleType QualifiedName orgapachecommonsvfs providertartar file provider
add provider SimpleName MethodInvocation StringLiteral tbz
add provider SimpleName MethodInvocation ClassInstanceCreation SimpleType QualifiedName orgapachecommonsvfs providertartar file provider
tbz StringLiteral MethodInvocation ClassInstanceCreation SimpleType QualifiedName orgapachecommonsvfs providertartar file provider
vfs SimpleName MethodInvocation SimpleName add provider
vfs SimpleName MethodInvocation StringLiteral tgz
vfs SimpleName MethodInvocation ClassInstanceCreation SimpleType QualifiedName orgapachecommonsvfs providertartar file provider
add provider SimpleName MethodInvocation StringLiteral tgz
add provider SimpleName MethodInvocation ClassInstanceCreation SimpleType QualifiedName orgapachecommonsvfs providertartar file provider
tgz StringLiteral MethodInvocation ClassInstanceCreation SimpleType QualifiedName orgapachecommonsvfs providertartar file provider
vfs SimpleName MethodInvocation SimpleName add provider
vfs SimpleName MethodInvocation StringLiteral bz
vfs SimpleName MethodInvocation ClassInstanceCreation SimpleType QualifiedName orgapachecommonsvfs providerbzip bzip file provider
add provider SimpleName MethodInvocation StringLiteral bz
add provider SimpleName MethodInvocation ClassInstanceCreation SimpleType QualifiedName orgapachecommonsvfs providerbzip bzip file provider
bz StringLiteral MethodInvocation ClassInstanceCreation SimpleType QualifiedName orgapachecommonsvfs providerbzip bzip file provider
vfs SimpleName MethodInvocation SimpleName add provider
vfs SimpleName MethodInvocation StringLiteral hdfs
vfs SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName hdfs file provider
add provider SimpleName MethodInvocation StringLiteral hdfs
add provider SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName hdfs file provider
hdfs StringLiteral MethodInvocation ClassInstanceCreation SimpleType SimpleName hdfs file provider
vfs SimpleName MethodInvocation SimpleName add extension map
vfs SimpleName MethodInvocation StringLiteral jar
vfs SimpleName MethodInvocation StringLiteral jar
add extension map SimpleName MethodInvocation StringLiteral jar
add extension map SimpleName MethodInvocation StringLiteral jar
jar StringLiteral MethodInvocation StringLiteral jar
vfs SimpleName MethodInvocation SimpleName add extension map
vfs SimpleName MethodInvocation StringLiteral zip
vfs SimpleName MethodInvocation StringLiteral zip
add extension map SimpleName MethodInvocation StringLiteral zip
add extension map SimpleName MethodInvocation StringLiteral zip
zip StringLiteral MethodInvocation StringLiteral zip
vfs SimpleName MethodInvocation SimpleName add extension map
vfs SimpleName MethodInvocation StringLiteral gz
vfs SimpleName MethodInvocation StringLiteral gz
add extension map SimpleName MethodInvocation StringLiteral gz
add extension map SimpleName MethodInvocation StringLiteral gz
gz StringLiteral MethodInvocation StringLiteral gz
vfs SimpleName MethodInvocation SimpleName add extension map
vfs SimpleName MethodInvocation StringLiteral tar
vfs SimpleName MethodInvocation StringLiteral tar
add extension map SimpleName MethodInvocation StringLiteral tar
add extension map SimpleName MethodInvocation StringLiteral tar
tar StringLiteral MethodInvocation StringLiteral tar
vfs SimpleName MethodInvocation SimpleName add extension map
vfs SimpleName MethodInvocation StringLiteral tbz
vfs SimpleName MethodInvocation StringLiteral tar
add extension map SimpleName MethodInvocation StringLiteral tbz
add extension map SimpleName MethodInvocation StringLiteral tar
tbz StringLiteral MethodInvocation StringLiteral tar
vfs SimpleName MethodInvocation SimpleName add extension map
vfs SimpleName MethodInvocation StringLiteral tgz
vfs SimpleName MethodInvocation StringLiteral tar
add extension map SimpleName MethodInvocation StringLiteral tgz
add extension map SimpleName MethodInvocation StringLiteral tar
tgz StringLiteral MethodInvocation StringLiteral tar
vfs SimpleName MethodInvocation SimpleName add extension map
vfs SimpleName MethodInvocation StringLiteral bz
vfs SimpleName MethodInvocation StringLiteral bz
add extension map SimpleName MethodInvocation StringLiteral bz
add extension map SimpleName MethodInvocation StringLiteral bz
bz StringLiteral MethodInvocation StringLiteral bz
vfs SimpleName MethodInvocation SimpleName add mime type map
vfs SimpleName MethodInvocation StringLiteral applicationxtar
vfs SimpleName MethodInvocation StringLiteral tar
add mime type map SimpleName MethodInvocation StringLiteral applicationxtar
add mime type map SimpleName MethodInvocation StringLiteral tar
applicationxtar StringLiteral MethodInvocation StringLiteral tar
vfs SimpleName MethodInvocation SimpleName add mime type map
vfs SimpleName MethodInvocation StringLiteral applicationxgzip
vfs SimpleName MethodInvocation StringLiteral gz
add mime type map SimpleName MethodInvocation StringLiteral applicationxgzip
add mime type map SimpleName MethodInvocation StringLiteral gz
applicationxgzip StringLiteral MethodInvocation StringLiteral gz
vfs SimpleName MethodInvocation SimpleName add mime type map
vfs SimpleName MethodInvocation StringLiteral applicationzip
vfs SimpleName MethodInvocation StringLiteral zip
add mime type map SimpleName MethodInvocation StringLiteral applicationzip
add mime type map SimpleName MethodInvocation StringLiteral zip
applicationzip StringLiteral MethodInvocation StringLiteral zip
vfs SimpleName MethodInvocation SimpleName set file content info factory
vfs SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName file content info filename factory
set file content info factory SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName file content info filename factory
vfs SimpleName MethodInvocation SimpleName set files cache
vfs SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName soft ref files cache
set files cache SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName soft ref files cache
system SimpleName MethodInvocation SimpleName get property
system SimpleName MethodInvocation StringLiteral javaiotmpdir
get property SimpleName MethodInvocation StringLiteral javaiotmpdir
system SimpleName MethodInvocation SimpleName get property
system SimpleName MethodInvocation StringLiteral username
system SimpleName MethodInvocation StringLiteral nouser
get property SimpleName MethodInvocation StringLiteral username
get property SimpleName MethodInvocation StringLiteral nouser
username StringLiteral MethodInvocation StringLiteral nouser
accumulovfscache StringLiteral InfixExpression MethodInvocation SimpleName system
accumulovfscache StringLiteral InfixExpression MethodInvocation SimpleName get property
accumulovfscache StringLiteral InfixExpression MethodInvocation StringLiteral username
accumulovfscache StringLiteral InfixExpression MethodInvocation StringLiteral nouser
file SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName system
file SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get property
file SimpleName SimpleType ClassInstanceCreation MethodInvocation StringLiteral javaiotmpdir
file SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral accumulovfscache
system SimpleName MethodInvocation ClassInstanceCreation InfixExpression StringLiteral accumulovfscache
get property SimpleName MethodInvocation ClassInstanceCreation InfixExpression StringLiteral accumulovfscache
javaiotmpdir StringLiteral MethodInvocation ClassInstanceCreation InfixExpression StringLiteral accumulovfscache
vfs SimpleName MethodInvocation SimpleName set replicator
vfs SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName default file replicator
set replicator SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName default file replicator
vfs SimpleName MethodInvocation SimpleName set cache strategy
vfs SimpleName MethodInvocation QualifiedName cache strategyon resolve
set cache strategy SimpleName MethodInvocation QualifiedName cache strategyon resolve
vfs SimpleName MethodInvocation SimpleName init
file system exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
runtime exception SimpleName SimpleType ClassInstanceCreation StringLiteral error setting up vfs
runtime exception SimpleName SimpleType ClassInstanceCreation SimpleName e
error setting up vfs StringLiteral ClassInstanceCreation SimpleName e
before class SimpleName MarkerAnnotation MethodDeclaration Modifier public
before class SimpleName MarkerAnnotation MethodDeclaration Modifier static
before class SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
before class SimpleName MarkerAnnotation MethodDeclaration SimpleName mini dfs cluster setup
public Modifier MethodDeclaration Modifier static
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName mini dfs cluster setup
static Modifier MethodDeclaration PrimitiveType void
static Modifier MethodDeclaration SimpleName mini dfs cluster setup
void PrimitiveType MethodDeclaration SimpleName mini dfs cluster setup
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName before class
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration Modifier static
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName mini dfs cluster setup
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName before class
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration Modifier static
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName mini dfs cluster setup