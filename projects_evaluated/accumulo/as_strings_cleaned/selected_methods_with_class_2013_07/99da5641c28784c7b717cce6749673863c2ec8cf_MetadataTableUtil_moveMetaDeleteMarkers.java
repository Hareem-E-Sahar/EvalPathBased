instance SimpleName SimpleType SingleVariableDeclaration SimpleName instance
credentials SimpleName SimpleType SingleVariableDeclaration SimpleName creds
byte PrimitiveType ArrayType ArrayCreation NumberLiteral empty
empty bytes SimpleName VariableDeclarationFragment ArrayCreation ArrayType PrimitiveType byte
empty bytes SimpleName VariableDeclarationFragment ArrayCreation NumberLiteral empty
byte PrimitiveType ArrayType VariableDeclarationStatement VariableDeclarationFragment SimpleName empty bytes
scanner impl SimpleName SimpleType ClassInstanceCreation SimpleName instance
scanner impl SimpleName SimpleType ClassInstanceCreation SimpleName creds
scanner impl SimpleName SimpleType ClassInstanceCreation QualifiedName root tableid
scanner impl SimpleName SimpleType ClassInstanceCreation QualifiedName authorizationsempty
instance SimpleName ClassInstanceCreation SimpleName creds
instance SimpleName ClassInstanceCreation QualifiedName root tableid
instance SimpleName ClassInstanceCreation QualifiedName authorizationsempty
creds SimpleName ClassInstanceCreation QualifiedName root tableid
creds SimpleName ClassInstanceCreation QualifiedName authorizationsempty
root tableid QualifiedName ClassInstanceCreation QualifiedName authorizationsempty
scanner SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName scanner impl
scanner SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName instance
scanner SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName creds
scanner SimpleName VariableDeclarationFragment ClassInstanceCreation QualifiedName root tableid
scanner SimpleName VariableDeclarationFragment ClassInstanceCreation QualifiedName authorizationsempty
scanner SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName scanner
old deletes prefix SimpleName VariableDeclarationFragment StringLiteral del
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName old deletes prefix
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment StringLiteral del
range SimpleName SimpleType ClassInstanceCreation SimpleName old deletes prefix
range SimpleName SimpleType ClassInstanceCreation BooleanLiteral true
range SimpleName SimpleType ClassInstanceCreation StringLiteral dem
range SimpleName SimpleType ClassInstanceCreation BooleanLiteral false
old deletes prefix SimpleName ClassInstanceCreation BooleanLiteral true
old deletes prefix SimpleName ClassInstanceCreation StringLiteral dem
old deletes prefix SimpleName ClassInstanceCreation BooleanLiteral false
true BooleanLiteral ClassInstanceCreation StringLiteral dem
true BooleanLiteral ClassInstanceCreation BooleanLiteral false
dem StringLiteral ClassInstanceCreation BooleanLiteral false
old deletes range SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName range
old deletes range SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName old deletes prefix
old deletes range SimpleName VariableDeclarationFragment ClassInstanceCreation BooleanLiteral true
old deletes range SimpleName VariableDeclarationFragment ClassInstanceCreation StringLiteral dem
old deletes range SimpleName VariableDeclarationFragment ClassInstanceCreation BooleanLiteral false
range SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName old deletes range
scanner SimpleName MethodInvocation SimpleName set range
scanner SimpleName MethodInvocation SimpleName old deletes range
set range SimpleName MethodInvocation SimpleName old deletes range
entry SimpleName SimpleType ParameterizedType SimpleType SimpleName key
entry SimpleName SimpleType ParameterizedType SimpleType SimpleName value
key SimpleName SimpleType ParameterizedType SimpleType SimpleName value
entry SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName entry
key SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName entry
value SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName entry
entry SimpleName MethodInvocation SimpleName get key
entry SimpleName MethodInvocation MethodInvocation SimpleName get row
get key SimpleName MethodInvocation MethodInvocation SimpleName get row
entry SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to string
get key SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to string
get row SimpleName MethodInvocation MethodInvocation SimpleName to string
row SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get row
row SimpleName VariableDeclarationFragment MethodInvocation SimpleName to string
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName row
row SimpleName MethodInvocation SimpleName starts with
row SimpleName MethodInvocation SimpleName old deletes prefix
starts with SimpleName MethodInvocation SimpleName old deletes prefix
old deletes prefix SimpleName MethodInvocation SimpleName length
row SimpleName MethodInvocation SimpleName substring
row SimpleName MethodInvocation MethodInvocation SimpleName old deletes prefix
row SimpleName MethodInvocation MethodInvocation SimpleName length
substring SimpleName MethodInvocation MethodInvocation SimpleName old deletes prefix
substring SimpleName MethodInvocation MethodInvocation SimpleName length
filename SimpleName VariableDeclarationFragment MethodInvocation SimpleName row
filename SimpleName VariableDeclarationFragment MethodInvocation SimpleName substring
filename SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName old deletes prefix
filename SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName length
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName filename
moving StringLiteral InfixExpression SimpleName filename
moving StringLiteral InfixExpression StringLiteral marker in
moving StringLiteral InfixExpression QualifiedName root tablename
filename SimpleName InfixExpression StringLiteral marker in
filename SimpleName InfixExpression QualifiedName root tablename
marker in StringLiteral InfixExpression QualifiedName root tablename
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation InfixExpression StringLiteral moving
log SimpleName MethodInvocation InfixExpression SimpleName filename
log SimpleName MethodInvocation InfixExpression StringLiteral marker in
log SimpleName MethodInvocation InfixExpression QualifiedName root tablename
info SimpleName MethodInvocation InfixExpression StringLiteral moving
info SimpleName MethodInvocation InfixExpression SimpleName filename
info SimpleName MethodInvocation InfixExpression StringLiteral marker in
info SimpleName MethodInvocation InfixExpression QualifiedName root tablename
metadata schemadeletes section QualifiedName MethodInvocation SimpleName get row prefix
metadata schemadeletes section QualifiedName MethodInvocation InfixExpression SimpleName filename
get row prefix SimpleName MethodInvocation InfixExpression SimpleName filename
mutation SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName filename
m SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName mutation
m SimpleName VariableDeclarationFragment ClassInstanceCreation InfixExpression SimpleName filename
mutation SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName m
m SimpleName MethodInvocation SimpleName put
m SimpleName MethodInvocation SimpleName empty bytes
m SimpleName MethodInvocation SimpleName empty bytes
m SimpleName MethodInvocation SimpleName empty bytes
put SimpleName MethodInvocation SimpleName empty bytes
put SimpleName MethodInvocation SimpleName empty bytes
put SimpleName MethodInvocation SimpleName empty bytes
empty bytes SimpleName MethodInvocation SimpleName empty bytes
empty bytes SimpleName MethodInvocation SimpleName empty bytes
empty bytes SimpleName MethodInvocation SimpleName empty bytes
update SimpleName MethodInvocation SimpleName creds
update SimpleName MethodInvocation SimpleName m
creds SimpleName MethodInvocation SimpleName m
entry SimpleName MethodInvocation SimpleName get key
entry SimpleName MethodInvocation MethodInvocation SimpleName get row
get key SimpleName MethodInvocation MethodInvocation SimpleName get row
mutation SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get row
m SimpleName Assignment ClassInstanceCreation SimpleType SimpleName mutation
m SimpleName Assignment ClassInstanceCreation MethodInvocation SimpleName get row
m SimpleName MethodInvocation SimpleName put delete
m SimpleName MethodInvocation SimpleName empty bytes
m SimpleName MethodInvocation SimpleName empty bytes
put delete SimpleName MethodInvocation SimpleName empty bytes
put delete SimpleName MethodInvocation SimpleName empty bytes
empty bytes SimpleName MethodInvocation SimpleName empty bytes
update SimpleName MethodInvocation SimpleName creds
update SimpleName MethodInvocation SimpleName m
creds SimpleName MethodInvocation SimpleName m
entry SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName scanner
public Modifier MethodDeclaration Modifier static
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName move meta delete markers
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName instance
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName instance
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName credentials
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName creds
static Modifier MethodDeclaration PrimitiveType void
static Modifier MethodDeclaration SimpleName move meta delete markers
static Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName instance
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName instance
static Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName credentials
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName creds
static Modifier MethodDeclaration Block EnhancedForStatement SimpleName scanner
void PrimitiveType MethodDeclaration SimpleName move meta delete markers
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName instance
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName instance
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName credentials
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName creds
void PrimitiveType MethodDeclaration Block EnhancedForStatement SimpleName scanner
move meta delete markers SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName instance
move meta delete markers SimpleName MethodDeclaration SingleVariableDeclaration SimpleName instance
move meta delete markers SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName credentials
move meta delete markers SimpleName MethodDeclaration SingleVariableDeclaration SimpleName creds
move meta delete markers SimpleName MethodDeclaration Block EnhancedForStatement SimpleName scanner
instance SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName creds
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration Modifier static
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName move meta delete markers
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName instance
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName creds
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration Modifier static
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName move meta delete markers
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName instance
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName creds