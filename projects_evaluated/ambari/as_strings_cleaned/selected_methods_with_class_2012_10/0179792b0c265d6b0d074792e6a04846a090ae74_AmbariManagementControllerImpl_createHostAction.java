stage SimpleName SimpleType SingleVariableDeclaration SimpleName stage
service component host SimpleName SimpleType SingleVariableDeclaration SimpleName sc host
map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
map SimpleName SimpleType ParameterizedType SimpleType SimpleName config
string SimpleName SimpleType ParameterizedType SimpleType SimpleName config
map SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName configs
string SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName configs
config SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName configs
service component host event SimpleName SimpleType SingleVariableDeclaration SimpleName event
long PrimitiveType SingleVariableDeclaration SimpleName now timestamp
sc host SimpleName MethodInvocation SimpleName get host name
host action SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName sc host
host action SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get host name
ha SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName host action
ha SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName sc host
ha SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName get host name
host action SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName ha
sc host SimpleName MethodInvocation SimpleName get service name
sc host SimpleName MethodInvocation SimpleName get service component name
role SimpleName MethodInvocation SimpleName value of
role SimpleName MethodInvocation MethodInvocation SimpleName sc host
role SimpleName MethodInvocation MethodInvocation SimpleName get service component name
value of SimpleName MethodInvocation MethodInvocation SimpleName sc host
value of SimpleName MethodInvocation MethodInvocation SimpleName get service component name
sc host SimpleName MethodInvocation SimpleName get service component name
sc host SimpleName MethodInvocation SimpleName get host name
service component host install event SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName sc host
service component host install event SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get service component name
service component host install event SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName sc host
service component host install event SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get host name
service component host install event SimpleName SimpleType ClassInstanceCreation SimpleName now timestamp
sc host SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName sc host
sc host SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get host name
get service component name SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName sc host
get service component name SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get host name
sc host SimpleName MethodInvocation ClassInstanceCreation SimpleName now timestamp
get service component name SimpleName MethodInvocation ClassInstanceCreation SimpleName now timestamp
sc host SimpleName MethodInvocation ClassInstanceCreation SimpleName now timestamp
get host name SimpleName MethodInvocation ClassInstanceCreation SimpleName now timestamp
host role command SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName sc host
host role command SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get service name
host role command SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName role
host role command SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName value of
host role command SimpleName SimpleType ClassInstanceCreation ClassInstanceCreation SimpleName now timestamp
sc host SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName role
sc host SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName value of
get service name SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName role
get service name SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName value of
sc host SimpleName MethodInvocation ClassInstanceCreation ClassInstanceCreation SimpleName now timestamp
get service name SimpleName MethodInvocation ClassInstanceCreation ClassInstanceCreation SimpleName now timestamp
role SimpleName MethodInvocation ClassInstanceCreation ClassInstanceCreation SimpleName now timestamp
value of SimpleName MethodInvocation ClassInstanceCreation ClassInstanceCreation SimpleName now timestamp
cmd SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName host role command
cmd SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName sc host
cmd SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName get service name
cmd SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName role
cmd SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName value of
cmd SimpleName VariableDeclarationFragment ClassInstanceCreation ClassInstanceCreation SimpleName now timestamp
host role command SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName cmd
ha SimpleName MethodInvocation SimpleName add host role command
ha SimpleName MethodInvocation SimpleName cmd
add host role command SimpleName MethodInvocation SimpleName cmd
ha SimpleName MethodInvocation SimpleName get command to host
exec cmd SimpleName VariableDeclarationFragment MethodInvocation SimpleName ha
exec cmd SimpleName VariableDeclarationFragment MethodInvocation SimpleName get command to host
execution command SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName exec cmd
stage SimpleName MethodInvocation SimpleName get action id
exec cmd SimpleName MethodInvocation SimpleName set command id
exec cmd SimpleName MethodInvocation MethodInvocation SimpleName stage
exec cmd SimpleName MethodInvocation MethodInvocation SimpleName get action id
set command id SimpleName MethodInvocation MethodInvocation SimpleName stage
set command id SimpleName MethodInvocation MethodInvocation SimpleName get action id
sc host SimpleName MethodInvocation SimpleName get cluster name
exec cmd SimpleName MethodInvocation SimpleName set cluster name
exec cmd SimpleName MethodInvocation MethodInvocation SimpleName sc host
exec cmd SimpleName MethodInvocation MethodInvocation SimpleName get cluster name
set cluster name SimpleName MethodInvocation MethodInvocation SimpleName sc host
set cluster name SimpleName MethodInvocation MethodInvocation SimpleName get cluster name
list SimpleName SimpleType ParameterizedType SimpleType SimpleName string
map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
list SimpleName SimpleType ParameterizedType SimpleType SimpleName string
tree map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
list SimpleName SimpleType ParameterizedType SimpleType SimpleName string
array list SimpleName SimpleType ParameterizedType SimpleType SimpleName string
slave host list SimpleName MethodInvocation SimpleName add
slave host list SimpleName MethodInvocation StringLiteral localhost
add SimpleName MethodInvocation StringLiteral localhost
cluster host info SimpleName MethodInvocation SimpleName put
cluster host info SimpleName MethodInvocation StringLiteral slave hosts
cluster host info SimpleName MethodInvocation SimpleName slave host list
put SimpleName MethodInvocation StringLiteral slave hosts
put SimpleName MethodInvocation SimpleName slave host list
slave hosts StringLiteral MethodInvocation SimpleName slave host list
exec cmd SimpleName MethodInvocation SimpleName set cluster host info
exec cmd SimpleName MethodInvocation SimpleName cluster host info
set cluster host info SimpleName MethodInvocation SimpleName cluster host info
map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
string SimpleName SimpleType ParameterizedType SimpleType SimpleName string
tree map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
tree map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
string SimpleName SimpleType ParameterizedType SimpleType SimpleName string
hdfs site SimpleName MethodInvocation SimpleName put
hdfs site SimpleName MethodInvocation StringLiteral dfsblocksize
hdfs site SimpleName MethodInvocation StringLiteral empty
put SimpleName MethodInvocation StringLiteral dfsblocksize
put SimpleName MethodInvocation StringLiteral empty
dfsblocksize StringLiteral MethodInvocation StringLiteral empty
hdfs site SimpleName MethodInvocation SimpleName put
hdfs site SimpleName MethodInvocation StringLiteral magic config string
hdfs site SimpleName MethodInvocation StringLiteral magic blah
put SimpleName MethodInvocation StringLiteral magic config string
put SimpleName MethodInvocation StringLiteral magic blah
magic config string StringLiteral MethodInvocation StringLiteral magic blah
map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
string SimpleName SimpleType ParameterizedType SimpleType SimpleName string
map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
string SimpleName SimpleType ParameterizedType SimpleType SimpleName string
tree map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
configurations SimpleName MethodInvocation SimpleName put
configurations SimpleName MethodInvocation StringLiteral hdfssite
configurations SimpleName MethodInvocation SimpleName hdfs site
put SimpleName MethodInvocation StringLiteral hdfssite
put SimpleName MethodInvocation SimpleName hdfs site
hdfssite StringLiteral MethodInvocation SimpleName hdfs site
exec cmd SimpleName MethodInvocation SimpleName set configurations
exec cmd SimpleName MethodInvocation SimpleName configurations
set configurations SimpleName MethodInvocation SimpleName configurations
map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
string SimpleName SimpleType ParameterizedType SimpleType SimpleName string
tree map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
tree map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
string SimpleName SimpleType ParameterizedType SimpleType SimpleName string
params SimpleName MethodInvocation SimpleName put
params SimpleName MethodInvocation StringLiteral magic param
params SimpleName MethodInvocation StringLiteral xyz
put SimpleName MethodInvocation StringLiteral magic param
put SimpleName MethodInvocation StringLiteral xyz
magic param StringLiteral MethodInvocation StringLiteral xyz
exec cmd SimpleName MethodInvocation SimpleName set params
exec cmd SimpleName MethodInvocation SimpleName params
set params SimpleName MethodInvocation SimpleName params
map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
string SimpleName SimpleType ParameterizedType SimpleType SimpleName string
tree map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
tree map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
string SimpleName SimpleType ParameterizedType SimpleType SimpleName string
role params SimpleName MethodInvocation SimpleName put
role params SimpleName MethodInvocation StringLiteral magic role param
role params SimpleName MethodInvocation StringLiteral false
put SimpleName MethodInvocation StringLiteral magic role param
put SimpleName MethodInvocation StringLiteral false
magic role param StringLiteral MethodInvocation StringLiteral false
sc host SimpleName MethodInvocation SimpleName get service component name
event SimpleName MethodInvocation SimpleName get type
event SimpleName MethodInvocation MethodInvocation SimpleName to string
get type SimpleName MethodInvocation MethodInvocation SimpleName to string
exec cmd SimpleName MethodInvocation SimpleName add role command
exec cmd SimpleName MethodInvocation MethodInvocation SimpleName sc host
exec cmd SimpleName MethodInvocation MethodInvocation SimpleName get service component name
exec cmd SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName event
exec cmd SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get type
exec cmd SimpleName MethodInvocation MethodInvocation SimpleName to string
exec cmd SimpleName MethodInvocation SimpleName role params
add role command SimpleName MethodInvocation MethodInvocation SimpleName sc host
add role command SimpleName MethodInvocation MethodInvocation SimpleName get service component name
add role command SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName event
add role command SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get type
add role command SimpleName MethodInvocation MethodInvocation SimpleName to string
add role command SimpleName MethodInvocation SimpleName role params
sc host SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to string
get service component name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to string
sc host SimpleName MethodInvocation MethodInvocation SimpleName role params
get service component name SimpleName MethodInvocation MethodInvocation SimpleName role params
event SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName role params
get type SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName role params
to string SimpleName MethodInvocation MethodInvocation SimpleName role params
private Modifier MethodDeclaration SimpleType SimpleName host action
private Modifier MethodDeclaration SimpleName create host action
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName stage
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName stage
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName service component host
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName sc host
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName configs
host action SimpleName SimpleType MethodDeclaration SimpleName create host action
host action SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName stage
host action SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName sc host
host action SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName configs
host action SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName event
create host action SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName stage
create host action SimpleName MethodDeclaration SingleVariableDeclaration SimpleName stage
create host action SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName service component host
create host action SimpleName MethodDeclaration SingleVariableDeclaration SimpleName sc host
create host action SimpleName MethodDeclaration SingleVariableDeclaration SimpleName configs
create host action SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName service component host event
create host action SimpleName MethodDeclaration SingleVariableDeclaration SimpleName event
create host action SimpleName MethodDeclaration SingleVariableDeclaration PrimitiveType long
create host action SimpleName MethodDeclaration SingleVariableDeclaration SimpleName now timestamp
stage SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName sc host
stage SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName configs
stage SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName event
stage SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType long
stage SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName now timestamp
sc host SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName configs
sc host SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName event
sc host SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType long
sc host SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName now timestamp
configs SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName event
configs SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType long
configs SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName now timestamp
event SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType long
event SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName now timestamp
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName host action
public Modifier TypeDeclaration MethodDeclaration SimpleName create host action
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName stage
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName sc host
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName configs
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName event
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType long
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName now timestamp
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName host action
test SimpleName TypeDeclaration MethodDeclaration SimpleName create host action
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName stage
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName sc host
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName configs
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName event
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType long
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName now timestamp
