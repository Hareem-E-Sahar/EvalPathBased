list SimpleName SimpleType ParameterizedType SimpleType QualifiedName entity audit repositoryentity audit event
string SimpleName SimpleType SingleVariableDeclaration SimpleName entity id
long SimpleName SimpleType SingleVariableDeclaration SimpleName ts
short PrimitiveType SingleVariableDeclaration SimpleName n
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation StringLiteral listing events for entity id {} starting timestamp {} records {}
log SimpleName MethodInvocation SimpleName entity id
log SimpleName MethodInvocation SimpleName ts
log SimpleName MethodInvocation SimpleName n
info SimpleName MethodInvocation StringLiteral listing events for entity id {} starting timestamp {} records {}
info SimpleName MethodInvocation SimpleName entity id
info SimpleName MethodInvocation SimpleName ts
info SimpleName MethodInvocation SimpleName n
listing events for entity id {} starting timestamp {} records {} StringLiteral MethodInvocation SimpleName entity id
listing events for entity id {} starting timestamp {} records {} StringLiteral MethodInvocation SimpleName ts
listing events for entity id {} starting timestamp {} records {} StringLiteral MethodInvocation SimpleName n
entity id SimpleName MethodInvocation SimpleName ts
entity id SimpleName MethodInvocation SimpleName n
ts SimpleName MethodInvocation SimpleName n
table SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table
result scanner SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName scanner
connection SimpleName MethodInvocation SimpleName get table
connection SimpleName MethodInvocation SimpleName table name
get table SimpleName MethodInvocation SimpleName table name
table SimpleName Assignment MethodInvocation SimpleName connection
table SimpleName Assignment MethodInvocation SimpleName get table
table SimpleName Assignment MethodInvocation SimpleName table name
scan SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName set reversed
scan SimpleName SimpleType ClassInstanceCreation MethodInvocation BooleanLiteral true
set reversed SimpleName MethodInvocation BooleanLiteral true
page filter SimpleName SimpleType ClassInstanceCreation SimpleName n
set reversed SimpleName MethodInvocation MethodInvocation SimpleName set filter
true BooleanLiteral MethodInvocation MethodInvocation SimpleName set filter
set reversed SimpleName MethodInvocation MethodInvocation ClassInstanceCreation SimpleName n
true BooleanLiteral MethodInvocation MethodInvocation ClassInstanceCreation SimpleName n
set filter SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName page filter
set filter SimpleName MethodInvocation ClassInstanceCreation SimpleName n
get key SimpleName MethodInvocation SimpleName entity id
get key SimpleName MethodInvocation SimpleName ts
entity id SimpleName MethodInvocation SimpleName ts
set reversed SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName set start row
true BooleanLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName set start row
set filter SimpleName MethodInvocation MethodInvocation SimpleName set start row
n SimpleName ClassInstanceCreation MethodInvocation MethodInvocation SimpleName set start row
set filter SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get key
set filter SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName entity id
set filter SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName ts
set start row SimpleName MethodInvocation MethodInvocation SimpleName get key
set start row SimpleName MethodInvocation MethodInvocation SimpleName entity id
set start row SimpleName MethodInvocation MethodInvocation SimpleName ts
bytes SimpleName MethodInvocation SimpleName to bytes
bytes SimpleName MethodInvocation SimpleName entity id
to bytes SimpleName MethodInvocation SimpleName entity id
set filter SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName set stop row
set start row SimpleName MethodInvocation MethodInvocation SimpleName set stop row
get key SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName set stop row
entity id SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName set stop row
ts SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName set stop row
set start row SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName bytes
set start row SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to bytes
set start row SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName entity id
set stop row SimpleName MethodInvocation MethodInvocation SimpleName bytes
set stop row SimpleName MethodInvocation MethodInvocation SimpleName to bytes
set stop row SimpleName MethodInvocation MethodInvocation SimpleName entity id
set start row SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName set caching
set stop row SimpleName MethodInvocation MethodInvocation SimpleName set caching
bytes SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName set caching
to bytes SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName set caching
entity id SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName set caching
set start row SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName n
set stop row SimpleName MethodInvocation MethodInvocation SimpleName n
bytes SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName n
to bytes SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName n
entity id SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName n
set caching SimpleName MethodInvocation SimpleName n
set stop row SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName set small
set caching SimpleName MethodInvocation MethodInvocation SimpleName set small
n SimpleName MethodInvocation MethodInvocation SimpleName set small
set stop row SimpleName MethodInvocation MethodInvocation MethodInvocation BooleanLiteral true
set caching SimpleName MethodInvocation MethodInvocation BooleanLiteral true
n SimpleName MethodInvocation MethodInvocation BooleanLiteral true
set small SimpleName MethodInvocation BooleanLiteral true
scan SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName set caching
scan SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName n
scan SimpleName VariableDeclarationFragment MethodInvocation SimpleName set small
scan SimpleName VariableDeclarationFragment MethodInvocation BooleanLiteral true
scan SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName scan
table SimpleName MethodInvocation SimpleName get scanner
table SimpleName MethodInvocation SimpleName scan
get scanner SimpleName MethodInvocation SimpleName scan
scanner SimpleName Assignment MethodInvocation SimpleName table
scanner SimpleName Assignment MethodInvocation SimpleName get scanner
scanner SimpleName Assignment MethodInvocation SimpleName scan
result SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName result
list SimpleName SimpleType ParameterizedType SimpleType QualifiedName entity audit repositoryentity audit event
scanner SimpleName MethodInvocation SimpleName next
result SimpleName Assignment MethodInvocation SimpleName scanner
result SimpleName Assignment MethodInvocation SimpleName next
events SimpleName MethodInvocation SimpleName size
events SimpleName MethodInvocation InfixExpression SimpleName n
size SimpleName MethodInvocation InfixExpression SimpleName n
result SimpleName MethodInvocation SimpleName get row
bytes SimpleName MethodInvocation SimpleName to string
bytes SimpleName MethodInvocation MethodInvocation SimpleName result
bytes SimpleName MethodInvocation MethodInvocation SimpleName get row
to string SimpleName MethodInvocation MethodInvocation SimpleName result
to string SimpleName MethodInvocation MethodInvocation SimpleName get row
key SimpleName VariableDeclarationFragment MethodInvocation SimpleName bytes
key SimpleName VariableDeclarationFragment MethodInvocation SimpleName to string
key SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName result
key SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get row
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName key
from key SimpleName MethodInvocation SimpleName key
event SimpleName VariableDeclarationFragment MethodInvocation SimpleName from key
event SimpleName VariableDeclarationFragment MethodInvocation SimpleName key
entity audit repositoryentity audit event QualifiedName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName event
get result string SimpleName MethodInvocation SimpleName result
get result string SimpleName MethodInvocation SimpleName column user
result SimpleName MethodInvocation SimpleName column user
eventuser QualifiedName Assignment MethodInvocation SimpleName get result string
eventuser QualifiedName Assignment MethodInvocation SimpleName result
eventuser QualifiedName Assignment MethodInvocation SimpleName column user
entity audit action SimpleName MethodInvocation SimpleName values
result SimpleName MethodInvocation SimpleName get value
result SimpleName MethodInvocation SimpleName column family
result SimpleName MethodInvocation SimpleName column action
get value SimpleName MethodInvocation SimpleName column family
get value SimpleName MethodInvocation SimpleName column action
column family SimpleName MethodInvocation SimpleName column action
bytes SimpleName MethodInvocation SimpleName to short
bytes SimpleName MethodInvocation MethodInvocation SimpleName result
bytes SimpleName MethodInvocation MethodInvocation SimpleName get value
bytes SimpleName MethodInvocation MethodInvocation SimpleName column family
bytes SimpleName MethodInvocation MethodInvocation SimpleName column action
to short SimpleName MethodInvocation MethodInvocation SimpleName result
to short SimpleName MethodInvocation MethodInvocation SimpleName get value
to short SimpleName MethodInvocation MethodInvocation SimpleName column family
to short SimpleName MethodInvocation MethodInvocation SimpleName column action
eventaction QualifiedName Assignment ArrayAccess MethodInvocation SimpleName entity audit action
eventaction QualifiedName Assignment ArrayAccess MethodInvocation SimpleName values
get result string SimpleName MethodInvocation SimpleName result
get result string SimpleName MethodInvocation SimpleName column detail
result SimpleName MethodInvocation SimpleName column detail
eventdetails QualifiedName Assignment MethodInvocation SimpleName get result string
eventdetails QualifiedName Assignment MethodInvocation SimpleName result
eventdetails QualifiedName Assignment MethodInvocation SimpleName column detail
events SimpleName MethodInvocation SimpleName add
events SimpleName MethodInvocation SimpleName event
add SimpleName MethodInvocation SimpleName event
events SimpleName MethodInvocation SimpleName size
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation StringLiteral got events for entity id {} starting timestamp {} records {}
log SimpleName MethodInvocation SimpleName entity id
log SimpleName MethodInvocation SimpleName ts
log SimpleName MethodInvocation MethodInvocation SimpleName events
log SimpleName MethodInvocation MethodInvocation SimpleName size
info SimpleName MethodInvocation StringLiteral got events for entity id {} starting timestamp {} records {}
info SimpleName MethodInvocation SimpleName entity id
info SimpleName MethodInvocation SimpleName ts
info SimpleName MethodInvocation MethodInvocation SimpleName events
info SimpleName MethodInvocation MethodInvocation SimpleName size
got events for entity id {} starting timestamp {} records {} StringLiteral MethodInvocation SimpleName entity id
got events for entity id {} starting timestamp {} records {} StringLiteral MethodInvocation SimpleName ts
got events for entity id {} starting timestamp {} records {} StringLiteral MethodInvocation MethodInvocation SimpleName events
got events for entity id {} starting timestamp {} records {} StringLiteral MethodInvocation MethodInvocation SimpleName size
entity id SimpleName MethodInvocation SimpleName ts
entity id SimpleName MethodInvocation MethodInvocation SimpleName events
entity id SimpleName MethodInvocation MethodInvocation SimpleName size
ts SimpleName MethodInvocation MethodInvocation SimpleName events
ts SimpleName MethodInvocation MethodInvocation SimpleName size
io exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
atlas exception SimpleName SimpleType ClassInstanceCreation SimpleName e
close SimpleName MethodInvocation SimpleName scanner
close SimpleName MethodInvocation SimpleName table
public Modifier MethodDeclaration ParameterizedType SimpleType SimpleName list
public Modifier MethodDeclaration ParameterizedType SimpleType QualifiedName entity audit repositoryentity audit event
public Modifier MethodDeclaration SimpleName list events
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName entity id
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName long
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName ts
public Modifier MethodDeclaration SingleVariableDeclaration PrimitiveType short
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName n
list SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName list events
entity audit repositoryentity audit event QualifiedName SimpleType ParameterizedType MethodDeclaration SimpleName list events
list events SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
list events SimpleName MethodDeclaration SingleVariableDeclaration SimpleName entity id
list events SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName long
list events SimpleName MethodDeclaration SingleVariableDeclaration SimpleName ts
list events SimpleName MethodDeclaration SingleVariableDeclaration PrimitiveType short
list events SimpleName MethodDeclaration SingleVariableDeclaration SimpleName n
list events SimpleName MethodDeclaration SimpleType SimpleName atlas exception
entity id SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName ts
entity id SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType short
entity id SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName n
entity id SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName atlas exception
ts SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType short
ts SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName n
ts SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName atlas exception
short PrimitiveType SingleVariableDeclaration MethodDeclaration SimpleType SimpleName atlas exception
n SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName atlas exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration SimpleName list events
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName entity id
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName ts
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType short
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName n
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName atlas exception
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration SimpleName list events
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName entity id
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName ts
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType short
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName n
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName atlas exception
