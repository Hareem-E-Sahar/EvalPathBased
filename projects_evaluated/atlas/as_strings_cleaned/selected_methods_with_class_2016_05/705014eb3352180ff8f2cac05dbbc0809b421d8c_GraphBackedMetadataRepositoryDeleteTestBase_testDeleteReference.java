db SimpleName VariableDeclarationFragment MethodInvocation SimpleName create db entity
referenceable SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName db
create instance SimpleName MethodInvocation SimpleName db
db id SimpleName VariableDeclarationFragment MethodInvocation SimpleName create instance
db id SimpleName VariableDeclarationFragment MethodInvocation SimpleName db
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName db id
column SimpleName VariableDeclarationFragment MethodInvocation SimpleName create column entity
referenceable SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName column
create instance SimpleName MethodInvocation SimpleName column
col id SimpleName VariableDeclarationFragment MethodInvocation SimpleName create instance
col id SimpleName VariableDeclarationFragment MethodInvocation SimpleName column
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName col id
create table entity SimpleName MethodInvocation SimpleName db id
table SimpleName VariableDeclarationFragment MethodInvocation SimpleName create table entity
table SimpleName VariableDeclarationFragment MethodInvocation SimpleName db id
referenceable SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table
id SimpleName SimpleType ClassInstanceCreation SimpleName col id
id SimpleName SimpleType ClassInstanceCreation NumberLiteral empty
id SimpleName SimpleType ClassInstanceCreation SimpleName column type
col id SimpleName ClassInstanceCreation NumberLiteral empty
col id SimpleName ClassInstanceCreation SimpleName column type
empty NumberLiteral ClassInstanceCreation SimpleName column type
arrays SimpleName MethodInvocation SimpleName as list
arrays SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName id
arrays SimpleName MethodInvocation ClassInstanceCreation SimpleName col id
arrays SimpleName MethodInvocation ClassInstanceCreation NumberLiteral empty
arrays SimpleName MethodInvocation ClassInstanceCreation SimpleName column type
as list SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName id
as list SimpleName MethodInvocation ClassInstanceCreation SimpleName col id
as list SimpleName MethodInvocation ClassInstanceCreation NumberLiteral empty
as list SimpleName MethodInvocation ClassInstanceCreation SimpleName column type
table SimpleName MethodInvocation SimpleName set
table SimpleName MethodInvocation SimpleName columns attr name
table SimpleName MethodInvocation MethodInvocation SimpleName arrays
table SimpleName MethodInvocation MethodInvocation SimpleName as list
table SimpleName MethodInvocation MethodInvocation ClassInstanceCreation SimpleName col id
table SimpleName MethodInvocation MethodInvocation ClassInstanceCreation NumberLiteral empty
table SimpleName MethodInvocation MethodInvocation ClassInstanceCreation SimpleName column type
set SimpleName MethodInvocation SimpleName columns attr name
set SimpleName MethodInvocation MethodInvocation SimpleName arrays
set SimpleName MethodInvocation MethodInvocation SimpleName as list
set SimpleName MethodInvocation MethodInvocation ClassInstanceCreation SimpleName col id
set SimpleName MethodInvocation MethodInvocation ClassInstanceCreation NumberLiteral empty
set SimpleName MethodInvocation MethodInvocation ClassInstanceCreation SimpleName column type
columns attr name SimpleName MethodInvocation MethodInvocation SimpleName arrays
columns attr name SimpleName MethodInvocation MethodInvocation SimpleName as list
columns attr name SimpleName MethodInvocation MethodInvocation ClassInstanceCreation SimpleName col id
columns attr name SimpleName MethodInvocation MethodInvocation ClassInstanceCreation NumberLiteral empty
columns attr name SimpleName MethodInvocation MethodInvocation ClassInstanceCreation SimpleName column type
create instance SimpleName MethodInvocation SimpleName table
table id SimpleName VariableDeclarationFragment MethodInvocation SimpleName create instance
table id SimpleName VariableDeclarationFragment MethodInvocation SimpleName table
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table id
delete entities SimpleName MethodInvocation SimpleName col id
entity result SimpleName VariableDeclarationFragment MethodInvocation SimpleName delete entities
entity result SimpleName VariableDeclarationFragment MethodInvocation SimpleName col id
atlas cliententity result QualifiedName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName entity result
entity result SimpleName MethodInvocation SimpleName get deleted entities
entity result SimpleName MethodInvocation MethodInvocation SimpleName size
get deleted entities SimpleName MethodInvocation MethodInvocation SimpleName size
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName entity result
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get deleted entities
assert equals SimpleName MethodInvocation MethodInvocation SimpleName size
assert equals SimpleName MethodInvocation NumberLiteral empty
entity result SimpleName MethodInvocation MethodInvocation MethodInvocation NumberLiteral empty
get deleted entities SimpleName MethodInvocation MethodInvocation MethodInvocation NumberLiteral empty
size SimpleName MethodInvocation MethodInvocation NumberLiteral empty
entity result SimpleName MethodInvocation SimpleName get deleted entities
entity result SimpleName MethodInvocation MethodInvocation SimpleName get
get deleted entities SimpleName MethodInvocation MethodInvocation SimpleName get
entity result SimpleName MethodInvocation MethodInvocation NumberLiteral empty
get deleted entities SimpleName MethodInvocation MethodInvocation NumberLiteral empty
get SimpleName MethodInvocation NumberLiteral empty
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName entity result
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get deleted entities
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get
assert equals SimpleName MethodInvocation MethodInvocation NumberLiteral empty
assert equals SimpleName MethodInvocation SimpleName col id
entity result SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName col id
get deleted entities SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName col id
get SimpleName MethodInvocation MethodInvocation SimpleName col id
empty NumberLiteral MethodInvocation MethodInvocation SimpleName col id
entity result SimpleName MethodInvocation SimpleName get update entities
entity result SimpleName MethodInvocation MethodInvocation SimpleName size
get update entities SimpleName MethodInvocation MethodInvocation SimpleName size
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName entity result
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get update entities
assert equals SimpleName MethodInvocation MethodInvocation SimpleName size
assert equals SimpleName MethodInvocation NumberLiteral empty
entity result SimpleName MethodInvocation MethodInvocation MethodInvocation NumberLiteral empty
get update entities SimpleName MethodInvocation MethodInvocation MethodInvocation NumberLiteral empty
size SimpleName MethodInvocation MethodInvocation NumberLiteral empty
entity result SimpleName MethodInvocation SimpleName get update entities
entity result SimpleName MethodInvocation MethodInvocation SimpleName get
get update entities SimpleName MethodInvocation MethodInvocation SimpleName get
entity result SimpleName MethodInvocation MethodInvocation NumberLiteral empty
get update entities SimpleName MethodInvocation MethodInvocation NumberLiteral empty
get SimpleName MethodInvocation NumberLiteral empty
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName entity result
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get update entities
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get
assert equals SimpleName MethodInvocation MethodInvocation NumberLiteral empty
assert equals SimpleName MethodInvocation SimpleName table id
entity result SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName table id
get update entities SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName table id
get SimpleName MethodInvocation MethodInvocation SimpleName table id
empty NumberLiteral MethodInvocation MethodInvocation SimpleName table id
assert entity deleted SimpleName MethodInvocation SimpleName col id
repository service SimpleName MethodInvocation SimpleName get entity definition
repository service SimpleName MethodInvocation SimpleName table id
get entity definition SimpleName MethodInvocation SimpleName table id
table instance SimpleName VariableDeclarationFragment MethodInvocation SimpleName repository service
table instance SimpleName VariableDeclarationFragment MethodInvocation SimpleName get entity definition
table instance SimpleName VariableDeclarationFragment MethodInvocation SimpleName table id
i typed referenceable instance SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table instance
assert column for test delete reference SimpleName MethodInvocation SimpleName table instance
referenceable SimpleName SimpleType ClassInstanceCreation SimpleName process type
process SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName referenceable
process SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName process type
referenceable SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName process
id SimpleName SimpleType ClassInstanceCreation SimpleName table id
id SimpleName SimpleType ClassInstanceCreation NumberLiteral empty
id SimpleName SimpleType ClassInstanceCreation SimpleName table type
table id SimpleName ClassInstanceCreation NumberLiteral empty
table id SimpleName ClassInstanceCreation SimpleName table type
empty NumberLiteral ClassInstanceCreation SimpleName table type
arrays SimpleName MethodInvocation SimpleName as list
arrays SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName id
arrays SimpleName MethodInvocation ClassInstanceCreation SimpleName table id
arrays SimpleName MethodInvocation ClassInstanceCreation NumberLiteral empty
arrays SimpleName MethodInvocation ClassInstanceCreation SimpleName table type
as list SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName id
as list SimpleName MethodInvocation ClassInstanceCreation SimpleName table id
as list SimpleName MethodInvocation ClassInstanceCreation NumberLiteral empty
as list SimpleName MethodInvocation ClassInstanceCreation SimpleName table type
process SimpleName MethodInvocation SimpleName set
process SimpleName MethodInvocation QualifiedName atlas clientprocess attribute outputs
process SimpleName MethodInvocation MethodInvocation SimpleName arrays
process SimpleName MethodInvocation MethodInvocation SimpleName as list
process SimpleName MethodInvocation MethodInvocation ClassInstanceCreation SimpleName table id
process SimpleName MethodInvocation MethodInvocation ClassInstanceCreation NumberLiteral empty
process SimpleName MethodInvocation MethodInvocation ClassInstanceCreation SimpleName table type
set SimpleName MethodInvocation QualifiedName atlas clientprocess attribute outputs
set SimpleName MethodInvocation MethodInvocation SimpleName arrays
set SimpleName MethodInvocation MethodInvocation SimpleName as list
set SimpleName MethodInvocation MethodInvocation ClassInstanceCreation SimpleName table id
set SimpleName MethodInvocation MethodInvocation ClassInstanceCreation NumberLiteral empty
set SimpleName MethodInvocation MethodInvocation ClassInstanceCreation SimpleName table type
atlas clientprocess attribute outputs QualifiedName MethodInvocation MethodInvocation SimpleName arrays
atlas clientprocess attribute outputs QualifiedName MethodInvocation MethodInvocation SimpleName as list
atlas clientprocess attribute outputs QualifiedName MethodInvocation MethodInvocation ClassInstanceCreation SimpleName table id
atlas clientprocess attribute outputs QualifiedName MethodInvocation MethodInvocation ClassInstanceCreation NumberLiteral empty
atlas clientprocess attribute outputs QualifiedName MethodInvocation MethodInvocation ClassInstanceCreation SimpleName table type
create instance SimpleName MethodInvocation SimpleName process
process id SimpleName VariableDeclarationFragment MethodInvocation SimpleName create instance
process id SimpleName VariableDeclarationFragment MethodInvocation SimpleName process
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName process id
repository service SimpleName MethodInvocation SimpleName get entity definition
repository service SimpleName MethodInvocation SimpleName process id
get entity definition SimpleName MethodInvocation SimpleName process id
process instance SimpleName VariableDeclarationFragment MethodInvocation SimpleName repository service
process instance SimpleName VariableDeclarationFragment MethodInvocation SimpleName get entity definition
process instance SimpleName VariableDeclarationFragment MethodInvocation SimpleName process id
i typed referenceable instance SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName process instance
delete entities SimpleName MethodInvocation SimpleName table id
assert entity deleted SimpleName MethodInvocation SimpleName table id
assert table for test delete reference SimpleName MethodInvocation SimpleName table id
assert process for test delete reference SimpleName MethodInvocation SimpleName process instance
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test delete reference
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test delete reference
public Modifier MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration SimpleName test delete reference
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
test delete reference SimpleName MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test delete reference
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test delete reference
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
