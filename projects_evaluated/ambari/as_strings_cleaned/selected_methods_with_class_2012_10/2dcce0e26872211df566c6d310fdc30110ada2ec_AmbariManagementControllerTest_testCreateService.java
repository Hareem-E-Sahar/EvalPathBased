cluster name SimpleName VariableDeclarationFragment StringLiteral foo
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName cluster name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment StringLiteral foo
create cluster SimpleName MethodInvocation SimpleName cluster name
service name SimpleName VariableDeclarationFragment StringLiteral hdfs
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName service name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment StringLiteral hdfs
create service SimpleName MethodInvocation SimpleName cluster name
create service SimpleName MethodInvocation SimpleName service name
create service SimpleName MethodInvocation QualifiedName stateinstalling
cluster name SimpleName MethodInvocation SimpleName service name
cluster name SimpleName MethodInvocation QualifiedName stateinstalling
service name SimpleName MethodInvocation QualifiedName stateinstalling
fail SimpleName MethodInvocation StringLiteral service creation should fail for invalid state
exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
clusters SimpleName MethodInvocation SimpleName get cluster
clusters SimpleName MethodInvocation SimpleName cluster name
get cluster SimpleName MethodInvocation SimpleName cluster name
clusters SimpleName MethodInvocation MethodInvocation SimpleName get service
get cluster SimpleName MethodInvocation MethodInvocation SimpleName get service
cluster name SimpleName MethodInvocation MethodInvocation SimpleName get service
clusters SimpleName MethodInvocation MethodInvocation SimpleName service name
get cluster SimpleName MethodInvocation MethodInvocation SimpleName service name
cluster name SimpleName MethodInvocation MethodInvocation SimpleName service name
get service SimpleName MethodInvocation SimpleName service name
fail SimpleName MethodInvocation StringLiteral service creation should have failed
exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
create service SimpleName MethodInvocation SimpleName cluster name
create service SimpleName MethodInvocation SimpleName service name
create service SimpleName MethodInvocation QualifiedName stateinstalled
cluster name SimpleName MethodInvocation SimpleName service name
cluster name SimpleName MethodInvocation QualifiedName stateinstalled
service name SimpleName MethodInvocation QualifiedName stateinstalled
fail SimpleName MethodInvocation StringLiteral service creation should fail for invalid initial state
exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
create service SimpleName MethodInvocation SimpleName cluster name
create service SimpleName MethodInvocation SimpleName service name
cluster name SimpleName MethodInvocation SimpleName service name
service name SimpleName VariableDeclarationFragment StringLiteral mapreduce
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName service name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment StringLiteral mapreduce
create service SimpleName MethodInvocation SimpleName cluster name
create service SimpleName MethodInvocation SimpleName service name
create service SimpleName MethodInvocation QualifiedName stateinit
cluster name SimpleName MethodInvocation SimpleName service name
cluster name SimpleName MethodInvocation QualifiedName stateinit
service name SimpleName MethodInvocation QualifiedName stateinit
service request SimpleName SimpleType ClassInstanceCreation SimpleName cluster name
r SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName service request
r SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName cluster name
service request SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName r
set SimpleName SimpleType ParameterizedType SimpleType SimpleName service response
controller SimpleName MethodInvocation SimpleName get services
controller SimpleName MethodInvocation SimpleName r
get services SimpleName MethodInvocation SimpleName r
response SimpleName VariableDeclarationFragment MethodInvocation SimpleName controller
response SimpleName VariableDeclarationFragment MethodInvocation SimpleName get services
response SimpleName VariableDeclarationFragment MethodInvocation SimpleName r
response SimpleName MethodInvocation SimpleName size
assert SimpleName MethodInvocation SimpleName assert equals
assert SimpleName MethodInvocation NumberLiteral empty
assert SimpleName MethodInvocation MethodInvocation SimpleName response
assert SimpleName MethodInvocation MethodInvocation SimpleName size
assert equals SimpleName MethodInvocation NumberLiteral empty
assert equals SimpleName MethodInvocation MethodInvocation SimpleName response
assert equals SimpleName MethodInvocation MethodInvocation SimpleName size
empty NumberLiteral MethodInvocation MethodInvocation SimpleName response
empty NumberLiteral MethodInvocation MethodInvocation SimpleName size
service response SimpleName SimpleType SingleVariableDeclaration SimpleName svc
svc SimpleName MethodInvocation SimpleName get service name
svc SimpleName MethodInvocation MethodInvocation SimpleName equals
get service name SimpleName MethodInvocation MethodInvocation SimpleName equals
svc SimpleName MethodInvocation MethodInvocation SimpleName service name
get service name SimpleName MethodInvocation MethodInvocation SimpleName service name
equals SimpleName MethodInvocation SimpleName service name
svc SimpleName MethodInvocation SimpleName get service name
svc SimpleName MethodInvocation MethodInvocation SimpleName equals
get service name SimpleName MethodInvocation MethodInvocation SimpleName equals
svc SimpleName MethodInvocation MethodInvocation SimpleName service name
get service name SimpleName MethodInvocation MethodInvocation SimpleName service name
equals SimpleName MethodInvocation SimpleName service name
equals SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName equals
equals SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName service name
service name SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName equals
service name SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName service name
assert SimpleName MethodInvocation SimpleName assert true
assert SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName equals
assert SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName service name
assert SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName equals
assert SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName service name
assert true SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName equals
assert true SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName service name
assert true SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName equals
assert true SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName service name
svc SimpleName MethodInvocation SimpleName get desired stack version
assert SimpleName MethodInvocation SimpleName assert equals
assert SimpleName MethodInvocation StringLiteral . .
assert SimpleName MethodInvocation MethodInvocation SimpleName svc
assert SimpleName MethodInvocation MethodInvocation SimpleName get desired stack version
assert equals SimpleName MethodInvocation StringLiteral . .
assert equals SimpleName MethodInvocation MethodInvocation SimpleName svc
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get desired stack version
. . StringLiteral MethodInvocation MethodInvocation SimpleName svc
. . StringLiteral MethodInvocation MethodInvocation SimpleName get desired stack version
stateinit QualifiedName MethodInvocation SimpleName to string
svc SimpleName MethodInvocation SimpleName get desired state
assert SimpleName MethodInvocation SimpleName assert equals
assert SimpleName MethodInvocation MethodInvocation QualifiedName stateinit
assert SimpleName MethodInvocation MethodInvocation SimpleName to string
assert SimpleName MethodInvocation MethodInvocation SimpleName svc
assert SimpleName MethodInvocation MethodInvocation SimpleName get desired state
assert equals SimpleName MethodInvocation MethodInvocation QualifiedName stateinit
assert equals SimpleName MethodInvocation MethodInvocation SimpleName to string
assert equals SimpleName MethodInvocation MethodInvocation SimpleName svc
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get desired state
stateinit QualifiedName MethodInvocation MethodInvocation MethodInvocation SimpleName svc
stateinit QualifiedName MethodInvocation MethodInvocation MethodInvocation SimpleName get desired state
to string SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName svc
to string SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get desired state
service response SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName response
svc SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName response
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test create service
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName ambari exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test create service
public Modifier MethodDeclaration SimpleType SimpleName ambari exception
public Modifier MethodDeclaration Block EnhancedForStatement SimpleName response
void PrimitiveType MethodDeclaration SimpleName test create service
void PrimitiveType MethodDeclaration SimpleType SimpleName ambari exception
void PrimitiveType MethodDeclaration Block EnhancedForStatement SimpleName response
test create service SimpleName MethodDeclaration SimpleType SimpleName ambari exception
test create service SimpleName MethodDeclaration Block EnhancedForStatement SimpleName response
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test create service
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName ambari exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test create service
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName ambari exception
