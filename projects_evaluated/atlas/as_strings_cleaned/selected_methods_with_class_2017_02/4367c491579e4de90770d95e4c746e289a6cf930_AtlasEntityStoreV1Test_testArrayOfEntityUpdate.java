depends on methods SimpleName MemberValuePair StringLiteral test create
test SimpleName NormalAnnotation MemberValuePair SimpleName depends on methods
test SimpleName NormalAnnotation MemberValuePair StringLiteral test create
atlas entity SimpleName SimpleType ClassInstanceCreation SimpleName dept entity
entity clone SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName atlas entity
entity clone SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName dept entity
atlas entity SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName entity clone
list SimpleName SimpleType ParameterizedType SimpleType SimpleName atlas entity
list SimpleName SimpleType ParameterizedType SimpleType SimpleName atlas entity
entity clone SimpleName MethodInvocation SimpleName get attribute
entity clone SimpleName MethodInvocation StringLiteral employees
get attribute SimpleName MethodInvocation StringLiteral employees
employees SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName entity clone
employees SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName get attribute
employees SimpleName VariableDeclarationFragment CastExpression MethodInvocation StringLiteral employees
clear sub ordinates SimpleName MethodInvocation SimpleName employees
clear sub ordinates SimpleName MethodInvocation NumberLiteral empty
employees SimpleName MethodInvocation NumberLiteral empty
entity removed SimpleName VariableDeclarationFragment MethodInvocation SimpleName clear sub ordinates
entity removed SimpleName VariableDeclarationFragment MethodInvocation SimpleName employees
entity removed SimpleName VariableDeclarationFragment MethodInvocation NumberLiteral empty
atlas entity SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName entity removed
entity clone SimpleName MethodInvocation SimpleName set attribute
entity clone SimpleName MethodInvocation StringLiteral employees
entity clone SimpleName MethodInvocation SimpleName employees
set attribute SimpleName MethodInvocation StringLiteral employees
set attribute SimpleName MethodInvocation SimpleName employees
employees StringLiteral MethodInvocation SimpleName employees
entity store SimpleName MethodInvocation SimpleName create or update
entity store SimpleName MethodInvocation SimpleName entity clone
create or update SimpleName MethodInvocation SimpleName entity clone
response SimpleName VariableDeclarationFragment MethodInvocation SimpleName entity store
response SimpleName VariableDeclarationFragment MethodInvocation SimpleName create or update
response SimpleName VariableDeclarationFragment MethodInvocation SimpleName entity clone
entity mutation response SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName response
validate mutation response SimpleName MethodInvocation SimpleName response
validate mutation response SimpleName MethodInvocation QualifiedName entity mutationsentity operationupdate
validate mutation response SimpleName MethodInvocation NumberLiteral empty
response SimpleName MethodInvocation QualifiedName entity mutationsentity operationupdate
response SimpleName MethodInvocation NumberLiteral empty
entity mutationsentity operationupdate QualifiedName MethodInvocation NumberLiteral empty
response SimpleName MethodInvocation SimpleName get first entity updated
dept entity SimpleName VariableDeclarationFragment MethodInvocation SimpleName response
dept entity SimpleName VariableDeclarationFragment MethodInvocation SimpleName get first entity updated
atlas entity header SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName dept entity
list SimpleName SimpleType ParameterizedType SimpleType SimpleName atlas entity
list SimpleName SimpleType ParameterizedType SimpleType SimpleName atlas entity
dept entity SimpleName MethodInvocation SimpleName get attribute
dept entity SimpleName MethodInvocation StringLiteral employees
get attribute SimpleName MethodInvocation StringLiteral employees
get SimpleName MethodInvocation NumberLiteral empty
get SimpleName MethodInvocation MethodInvocation SimpleName get attribute
empty NumberLiteral MethodInvocation MethodInvocation SimpleName get attribute
get SimpleName MethodInvocation MethodInvocation StringLiteral subordinates
empty NumberLiteral MethodInvocation MethodInvocation StringLiteral subordinates
get attribute SimpleName MethodInvocation StringLiteral subordinates
assert SimpleName MethodInvocation SimpleName assert equals
assert SimpleName MethodInvocation MethodInvocation SimpleName size
assert SimpleName MethodInvocation NumberLiteral empty
assert equals SimpleName MethodInvocation MethodInvocation SimpleName size
assert equals SimpleName MethodInvocation NumberLiteral empty
size SimpleName MethodInvocation MethodInvocation NumberLiteral empty
employees SimpleName MethodInvocation SimpleName get
employees SimpleName MethodInvocation NumberLiteral empty
get SimpleName MethodInvocation NumberLiteral empty
add subordinate SimpleName MethodInvocation MethodInvocation SimpleName employees
add subordinate SimpleName MethodInvocation MethodInvocation SimpleName get
add subordinate SimpleName MethodInvocation MethodInvocation NumberLiteral empty
add subordinate SimpleName MethodInvocation SimpleName entity removed
employees SimpleName MethodInvocation MethodInvocation SimpleName entity removed
get SimpleName MethodInvocation MethodInvocation SimpleName entity removed
empty NumberLiteral MethodInvocation MethodInvocation SimpleName entity removed
entity store SimpleName MethodInvocation SimpleName create or update
entity store SimpleName MethodInvocation SimpleName entity clone
create or update SimpleName MethodInvocation SimpleName entity clone
response SimpleName Assignment MethodInvocation SimpleName entity store
response SimpleName Assignment MethodInvocation SimpleName create or update
response SimpleName Assignment MethodInvocation SimpleName entity clone
validate mutation response SimpleName MethodInvocation SimpleName response
validate mutation response SimpleName MethodInvocation QualifiedName entity mutationsentity operationupdate
validate mutation response SimpleName MethodInvocation NumberLiteral empty
response SimpleName MethodInvocation QualifiedName entity mutationsentity operationupdate
response SimpleName MethodInvocation NumberLiteral empty
entity mutationsentity operationupdate QualifiedName MethodInvocation NumberLiteral empty
response SimpleName MethodInvocation SimpleName get first entity updated
dept entity SimpleName Assignment MethodInvocation SimpleName response
dept entity SimpleName Assignment MethodInvocation SimpleName get first entity updated
validate attributes SimpleName MethodInvocation SimpleName dept entity
list SimpleName SimpleType ParameterizedType SimpleType SimpleName atlas entity
final Modifier VariableDeclarationStatement ParameterizedType SimpleType SimpleName list
final Modifier VariableDeclarationStatement ParameterizedType SimpleType SimpleName atlas entity
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName columns
table entity SimpleName MethodInvocation SimpleName get guid
test utils v SimpleName MethodInvocation SimpleName create column entity
test utils v SimpleName MethodInvocation MethodInvocation SimpleName table entity
test utils v SimpleName MethodInvocation MethodInvocation SimpleName get guid
create column entity SimpleName MethodInvocation MethodInvocation SimpleName table entity
create column entity SimpleName MethodInvocation MethodInvocation SimpleName get guid
col SimpleName VariableDeclarationFragment MethodInvocation SimpleName test utils v
col SimpleName VariableDeclarationFragment MethodInvocation SimpleName create column entity
col SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName table entity
col SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get guid
atlas entity SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName col
col SimpleName MethodInvocation SimpleName set attribute
col SimpleName MethodInvocation QualifiedName test utils v name
col SimpleName MethodInvocation StringLiteral col
set attribute SimpleName MethodInvocation QualifiedName test utils v name
set attribute SimpleName MethodInvocation StringLiteral col
test utils v name QualifiedName MethodInvocation StringLiteral col
columns SimpleName MethodInvocation SimpleName add
columns SimpleName MethodInvocation SimpleName col
add SimpleName MethodInvocation SimpleName col
atlas entity SimpleName SimpleType ClassInstanceCreation SimpleName table entity
table updated SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName atlas entity
table updated SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName table entity
atlas entity SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table updated
table updated SimpleName MethodInvocation SimpleName set attribute
table updated SimpleName MethodInvocation QualifiedName test utils v columns attr name
table updated SimpleName MethodInvocation SimpleName columns
set attribute SimpleName MethodInvocation QualifiedName test utils v columns attr name
set attribute SimpleName MethodInvocation SimpleName columns
test utils v columns attr name QualifiedName MethodInvocation SimpleName columns
entity store SimpleName MethodInvocation SimpleName create or update
entity store SimpleName MethodInvocation SimpleName table updated
create or update SimpleName MethodInvocation SimpleName table updated
response SimpleName Assignment MethodInvocation SimpleName entity store
response SimpleName Assignment MethodInvocation SimpleName create or update
response SimpleName Assignment MethodInvocation SimpleName table updated
response SimpleName MethodInvocation SimpleName get first entity updated
updated table SimpleName VariableDeclarationFragment MethodInvocation SimpleName response
updated table SimpleName VariableDeclarationFragment MethodInvocation SimpleName get first entity updated
atlas entity header SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName updated table
validate attributes SimpleName MethodInvocation SimpleName updated table
table entity SimpleName MethodInvocation SimpleName get guid
test utils v SimpleName MethodInvocation SimpleName create column entity
test utils v SimpleName MethodInvocation MethodInvocation SimpleName table entity
test utils v SimpleName MethodInvocation MethodInvocation SimpleName get guid
create column entity SimpleName MethodInvocation MethodInvocation SimpleName table entity
create column entity SimpleName MethodInvocation MethodInvocation SimpleName get guid
col SimpleName VariableDeclarationFragment MethodInvocation SimpleName test utils v
col SimpleName VariableDeclarationFragment MethodInvocation SimpleName create column entity
col SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName table entity
col SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get guid
atlas entity SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName col
col SimpleName MethodInvocation SimpleName set attribute
col SimpleName MethodInvocation QualifiedName test utils v name
col SimpleName MethodInvocation StringLiteral col
set attribute SimpleName MethodInvocation QualifiedName test utils v name
set attribute SimpleName MethodInvocation StringLiteral col
test utils v name QualifiedName MethodInvocation StringLiteral col
columns SimpleName MethodInvocation SimpleName add
columns SimpleName MethodInvocation SimpleName col
add SimpleName MethodInvocation SimpleName col
table entity SimpleName MethodInvocation SimpleName get guid
test utils v SimpleName MethodInvocation SimpleName create column entity
test utils v SimpleName MethodInvocation MethodInvocation SimpleName table entity
test utils v SimpleName MethodInvocation MethodInvocation SimpleName get guid
create column entity SimpleName MethodInvocation MethodInvocation SimpleName table entity
create column entity SimpleName MethodInvocation MethodInvocation SimpleName get guid
col SimpleName VariableDeclarationFragment MethodInvocation SimpleName test utils v
col SimpleName VariableDeclarationFragment MethodInvocation SimpleName create column entity
col SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName table entity
col SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get guid
atlas entity SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName col
col SimpleName MethodInvocation SimpleName set attribute
col SimpleName MethodInvocation QualifiedName test utils v name
col SimpleName MethodInvocation StringLiteral col
set attribute SimpleName MethodInvocation QualifiedName test utils v name
set attribute SimpleName MethodInvocation StringLiteral col
test utils v name QualifiedName MethodInvocation StringLiteral col
columns SimpleName MethodInvocation SimpleName add
columns SimpleName MethodInvocation SimpleName col
add SimpleName MethodInvocation SimpleName col
table updated SimpleName MethodInvocation SimpleName set attribute
table updated SimpleName MethodInvocation SimpleName columns attr name
table updated SimpleName MethodInvocation SimpleName columns
set attribute SimpleName MethodInvocation SimpleName columns attr name
set attribute SimpleName MethodInvocation SimpleName columns
columns attr name SimpleName MethodInvocation SimpleName columns
entity store SimpleName MethodInvocation SimpleName create or update
entity store SimpleName MethodInvocation SimpleName table updated
create or update SimpleName MethodInvocation SimpleName table updated
response SimpleName Assignment MethodInvocation SimpleName entity store
response SimpleName Assignment MethodInvocation SimpleName create or update
response SimpleName Assignment MethodInvocation SimpleName table updated
response SimpleName MethodInvocation SimpleName get first entity updated
updated table SimpleName Assignment MethodInvocation SimpleName response
updated table SimpleName Assignment MethodInvocation SimpleName get first entity updated
validate attributes SimpleName MethodInvocation SimpleName updated table
columns SimpleName MethodInvocation SimpleName clear
columns SimpleName MethodInvocation SimpleName add
columns SimpleName MethodInvocation SimpleName col
add SimpleName MethodInvocation SimpleName col
columns SimpleName MethodInvocation SimpleName add
columns SimpleName MethodInvocation SimpleName col
add SimpleName MethodInvocation SimpleName col
table updated SimpleName MethodInvocation SimpleName set attribute
table updated SimpleName MethodInvocation SimpleName columns attr name
table updated SimpleName MethodInvocation SimpleName columns
set attribute SimpleName MethodInvocation SimpleName columns attr name
set attribute SimpleName MethodInvocation SimpleName columns
columns attr name SimpleName MethodInvocation SimpleName columns
entity store SimpleName MethodInvocation SimpleName create or update
entity store SimpleName MethodInvocation SimpleName table updated
create or update SimpleName MethodInvocation SimpleName table updated
response SimpleName Assignment MethodInvocation SimpleName entity store
response SimpleName Assignment MethodInvocation SimpleName create or update
response SimpleName Assignment MethodInvocation SimpleName table updated
response SimpleName MethodInvocation SimpleName get first entity updated
updated table SimpleName Assignment MethodInvocation SimpleName response
updated table SimpleName Assignment MethodInvocation SimpleName get first entity updated
list SimpleName SimpleType ParameterizedType SimpleType SimpleName atlas entity
updated table SimpleName MethodInvocation SimpleName get attribute
updated table SimpleName MethodInvocation SimpleName columns attr name
get attribute SimpleName MethodInvocation SimpleName columns attr name
assert SimpleName MethodInvocation SimpleName assert equals
assert SimpleName MethodInvocation MethodInvocation SimpleName size
assert SimpleName MethodInvocation NumberLiteral empty
assert equals SimpleName MethodInvocation MethodInvocation SimpleName size
assert equals SimpleName MethodInvocation NumberLiteral empty
size SimpleName MethodInvocation MethodInvocation NumberLiteral empty
response SimpleName MethodInvocation SimpleName get entities by operation
response SimpleName MethodInvocation QualifiedName entity mutationsentity operationdelete
get entities by operation SimpleName MethodInvocation QualifiedName entity mutationsentity operationdelete
response SimpleName MethodInvocation MethodInvocation SimpleName size
get entities by operation SimpleName MethodInvocation MethodInvocation SimpleName size
entity mutationsentity operationdelete QualifiedName MethodInvocation MethodInvocation SimpleName size
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName response
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get entities by operation
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName entity mutationsentity operationdelete
assert equals SimpleName MethodInvocation MethodInvocation SimpleName size
assert equals SimpleName MethodInvocation NumberLiteral empty
response SimpleName MethodInvocation MethodInvocation MethodInvocation NumberLiteral empty
get entities by operation SimpleName MethodInvocation MethodInvocation MethodInvocation NumberLiteral empty
entity mutationsentity operationdelete QualifiedName MethodInvocation MethodInvocation MethodInvocation NumberLiteral empty
size SimpleName MethodInvocation MethodInvocation NumberLiteral empty
table updated SimpleName MethodInvocation SimpleName set attribute
table updated SimpleName MethodInvocation SimpleName columns attr name
set attribute SimpleName MethodInvocation SimpleName columns attr name
entity store SimpleName MethodInvocation SimpleName create or update
entity store SimpleName MethodInvocation SimpleName table updated
create or update SimpleName MethodInvocation SimpleName table updated
response SimpleName Assignment MethodInvocation SimpleName entity store
response SimpleName Assignment MethodInvocation SimpleName create or update
response SimpleName Assignment MethodInvocation SimpleName table updated
response SimpleName MethodInvocation SimpleName get first entity updated
updated table SimpleName Assignment MethodInvocation SimpleName response
updated table SimpleName Assignment MethodInvocation SimpleName get first entity updated
validate attributes SimpleName MethodInvocation SimpleName updated table
response SimpleName MethodInvocation SimpleName get entities by operation
response SimpleName MethodInvocation QualifiedName entity mutationsentity operationdelete
get entities by operation SimpleName MethodInvocation QualifiedName entity mutationsentity operationdelete
response SimpleName MethodInvocation MethodInvocation SimpleName size
get entities by operation SimpleName MethodInvocation MethodInvocation SimpleName size
entity mutationsentity operationdelete QualifiedName MethodInvocation MethodInvocation SimpleName size
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName response
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get entities by operation
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName entity mutationsentity operationdelete
assert equals SimpleName MethodInvocation MethodInvocation SimpleName size
assert equals SimpleName MethodInvocation NumberLiteral empty
response SimpleName MethodInvocation MethodInvocation MethodInvocation NumberLiteral empty
get entities by operation SimpleName MethodInvocation MethodInvocation MethodInvocation NumberLiteral empty
entity mutationsentity operationdelete QualifiedName MethodInvocation MethodInvocation MethodInvocation NumberLiteral empty
size SimpleName MethodInvocation MethodInvocation NumberLiteral empty
test SimpleName NormalAnnotation MethodDeclaration Modifier public
depends on methods SimpleName MemberValuePair NormalAnnotation MethodDeclaration Modifier public
test create StringLiteral MemberValuePair NormalAnnotation MethodDeclaration Modifier public
test SimpleName NormalAnnotation MethodDeclaration PrimitiveType void
depends on methods SimpleName MemberValuePair NormalAnnotation MethodDeclaration PrimitiveType void
test create StringLiteral MemberValuePair NormalAnnotation MethodDeclaration PrimitiveType void
test SimpleName NormalAnnotation MethodDeclaration SimpleName test array of entity update
depends on methods SimpleName MemberValuePair NormalAnnotation MethodDeclaration SimpleName test array of entity update
test create StringLiteral MemberValuePair NormalAnnotation MethodDeclaration SimpleName test array of entity update
test SimpleName NormalAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test array of entity update
public Modifier MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration Block VariableDeclarationStatement Modifier final
void PrimitiveType MethodDeclaration SimpleName test array of entity update
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement Modifier final
test array of entity update SimpleName MethodDeclaration SimpleType SimpleName exception
test array of entity update SimpleName MethodDeclaration Block VariableDeclarationStatement Modifier final
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration NormalAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test array of entity update
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration NormalAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test array of entity update
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
