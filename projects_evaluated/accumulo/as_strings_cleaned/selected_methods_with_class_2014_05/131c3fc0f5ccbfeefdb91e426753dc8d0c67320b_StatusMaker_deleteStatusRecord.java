key SimpleName SimpleType SingleVariableDeclaration SimpleName k
k SimpleName MethodInvocation SimpleName to string no truncate
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral deleting {} from metadata table as its no longer needed
log SimpleName MethodInvocation MethodInvocation SimpleName k
log SimpleName MethodInvocation MethodInvocation SimpleName to string no truncate
debug SimpleName MethodInvocation StringLiteral deleting {} from metadata table as its no longer needed
debug SimpleName MethodInvocation MethodInvocation SimpleName k
debug SimpleName MethodInvocation MethodInvocation SimpleName to string no truncate
deleting {} from metadata table as its no longer needed StringLiteral MethodInvocation MethodInvocation SimpleName k
deleting {} from metadata table as its no longer needed StringLiteral MethodInvocation MethodInvocation SimpleName to string no truncate
conn SimpleName MethodInvocation SimpleName create batch writer
conn SimpleName MethodInvocation SimpleName source table name
conn SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName batch writer config
create batch writer SimpleName MethodInvocation SimpleName source table name
create batch writer SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName batch writer config
source table name SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName batch writer config
metadata writer SimpleName Assignment MethodInvocation SimpleName conn
metadata writer SimpleName Assignment MethodInvocation SimpleName create batch writer
metadata writer SimpleName Assignment MethodInvocation SimpleName source table name
table not found exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
runtime exception SimpleName SimpleType ClassInstanceCreation StringLiteral metadata table doesnt exist
k SimpleName MethodInvocation SimpleName get row
mutation SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName k
mutation SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get row
m SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName mutation
m SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName k
m SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName get row
mutation SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName m
k SimpleName MethodInvocation SimpleName get column family
k SimpleName MethodInvocation SimpleName get column qualifier
m SimpleName MethodInvocation SimpleName put delete
m SimpleName MethodInvocation MethodInvocation SimpleName k
m SimpleName MethodInvocation MethodInvocation SimpleName get column family
m SimpleName MethodInvocation MethodInvocation SimpleName k
m SimpleName MethodInvocation MethodInvocation SimpleName get column qualifier
put delete SimpleName MethodInvocation MethodInvocation SimpleName k
put delete SimpleName MethodInvocation MethodInvocation SimpleName get column family
put delete SimpleName MethodInvocation MethodInvocation SimpleName k
put delete SimpleName MethodInvocation MethodInvocation SimpleName get column qualifier
k SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName k
k SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get column qualifier
get column family SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName k
get column family SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get column qualifier
metadata writer SimpleName MethodInvocation SimpleName add mutation
metadata writer SimpleName MethodInvocation SimpleName m
add mutation SimpleName MethodInvocation SimpleName m
metadata writer SimpleName MethodInvocation SimpleName flush
mutations rejected exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
log SimpleName MethodInvocation SimpleName warn
log SimpleName MethodInvocation StringLiteral failed to delete status mutations for metadata table will retry
log SimpleName MethodInvocation SimpleName e
warn SimpleName MethodInvocation StringLiteral failed to delete status mutations for metadata table will retry
warn SimpleName MethodInvocation SimpleName e
failed to delete status mutations for metadata table will retry StringLiteral MethodInvocation SimpleName e
protected Modifier MethodDeclaration PrimitiveType void
protected Modifier MethodDeclaration SimpleName delete status record
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName key
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleName k
void PrimitiveType MethodDeclaration SimpleName delete status record
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName key
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName k
delete status record SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName key
delete status record SimpleName MethodDeclaration SingleVariableDeclaration SimpleName k
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier protected
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName delete status record
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName k
test SimpleName TypeDeclaration MethodDeclaration Modifier protected
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName delete status record
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName k
