conn SimpleName VariableDeclarationFragment MethodInvocation SimpleName get connector
connector SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName conn
get unique names SimpleName MethodInvocation NumberLiteral empty
get unique names SimpleName MethodInvocation ArrayAccess NumberLiteral empty
empty NumberLiteral MethodInvocation ArrayAccess NumberLiteral empty
table name SimpleName VariableDeclarationFragment ArrayAccess MethodInvocation SimpleName get unique names
table name SimpleName VariableDeclarationFragment ArrayAccess MethodInvocation NumberLiteral empty
table name SimpleName VariableDeclarationFragment ArrayAccess NumberLiteral empty
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table name
conn SimpleName MethodInvocation SimpleName table operations
conn SimpleName MethodInvocation MethodInvocation SimpleName create
table operations SimpleName MethodInvocation MethodInvocation SimpleName create
conn SimpleName MethodInvocation MethodInvocation SimpleName table name
table operations SimpleName MethodInvocation MethodInvocation SimpleName table name
create SimpleName MethodInvocation SimpleName table name
conn SimpleName MethodInvocation SimpleName table operations
alpha num key constraint SimpleName SimpleType TypeLiteral MethodInvocation SimpleName get name
conn SimpleName MethodInvocation MethodInvocation SimpleName add constraint
table operations SimpleName MethodInvocation MethodInvocation SimpleName add constraint
conn SimpleName MethodInvocation MethodInvocation SimpleName table name
table operations SimpleName MethodInvocation MethodInvocation SimpleName table name
conn SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get name
table operations SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get name
add constraint SimpleName MethodInvocation SimpleName table name
add constraint SimpleName MethodInvocation MethodInvocation SimpleName get name
table name SimpleName MethodInvocation MethodInvocation SimpleName get name
conn SimpleName MethodInvocation SimpleName table operations
table name SimpleName InfixExpression StringLiteral clone
hash map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
hash map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
string SimpleName SimpleType ParameterizedType SimpleType SimpleName string
hash set SimpleName SimpleType ParameterizedType SimpleType SimpleName string
conn SimpleName MethodInvocation MethodInvocation SimpleName clone
table operations SimpleName MethodInvocation MethodInvocation SimpleName clone
conn SimpleName MethodInvocation MethodInvocation SimpleName table name
table operations SimpleName MethodInvocation MethodInvocation SimpleName table name
conn SimpleName MethodInvocation MethodInvocation InfixExpression SimpleName table name
conn SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral clone
table operations SimpleName MethodInvocation MethodInvocation InfixExpression SimpleName table name
table operations SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral clone
conn SimpleName MethodInvocation MethodInvocation BooleanLiteral true
table operations SimpleName MethodInvocation MethodInvocation BooleanLiteral true
clone SimpleName MethodInvocation SimpleName table name
clone SimpleName MethodInvocation InfixExpression SimpleName table name
clone SimpleName MethodInvocation InfixExpression StringLiteral clone
clone SimpleName MethodInvocation BooleanLiteral true
table name SimpleName MethodInvocation InfixExpression SimpleName table name
table name SimpleName MethodInvocation InfixExpression StringLiteral clone
table name SimpleName MethodInvocation BooleanLiteral true
table name SimpleName InfixExpression MethodInvocation BooleanLiteral true
clone StringLiteral InfixExpression MethodInvocation BooleanLiteral true
table name SimpleName InfixExpression StringLiteral clone
conn SimpleName MethodInvocation SimpleName create scanner
conn SimpleName MethodInvocation InfixExpression SimpleName table name
conn SimpleName MethodInvocation InfixExpression StringLiteral clone
conn SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName authorizations
create scanner SimpleName MethodInvocation InfixExpression SimpleName table name
create scanner SimpleName MethodInvocation InfixExpression StringLiteral clone
create scanner SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName authorizations
scanner SimpleName VariableDeclarationFragment MethodInvocation SimpleName conn
scanner SimpleName VariableDeclarationFragment MethodInvocation SimpleName create scanner
scanner SimpleName VariableDeclarationFragment MethodInvocation InfixExpression SimpleName table name
scanner SimpleName VariableDeclarationFragment MethodInvocation InfixExpression StringLiteral clone
scanner SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName scanner
table name SimpleName InfixExpression StringLiteral clone
conn SimpleName MethodInvocation SimpleName create conditional writer
conn SimpleName MethodInvocation InfixExpression SimpleName table name
conn SimpleName MethodInvocation InfixExpression StringLiteral clone
conn SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName conditional writer config
create conditional writer SimpleName MethodInvocation InfixExpression SimpleName table name
create conditional writer SimpleName MethodInvocation InfixExpression StringLiteral clone
create conditional writer SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName conditional writer config
cw SimpleName VariableDeclarationFragment MethodInvocation SimpleName conn
cw SimpleName VariableDeclarationFragment MethodInvocation SimpleName create conditional writer
cw SimpleName VariableDeclarationFragment MethodInvocation InfixExpression SimpleName table name
cw SimpleName VariableDeclarationFragment MethodInvocation InfixExpression StringLiteral clone
conditional writer SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName cw
condition SimpleName SimpleType ClassInstanceCreation StringLiteral tx
condition SimpleName SimpleType ClassInstanceCreation StringLiteral seq
tx StringLiteral ClassInstanceCreation StringLiteral seq
conditional mutation SimpleName SimpleType ClassInstanceCreation StringLiteral +
conditional mutation SimpleName SimpleType ClassInstanceCreation ClassInstanceCreation StringLiteral tx
conditional mutation SimpleName SimpleType ClassInstanceCreation ClassInstanceCreation StringLiteral seq
+ StringLiteral ClassInstanceCreation ClassInstanceCreation SimpleType SimpleName condition
+ StringLiteral ClassInstanceCreation ClassInstanceCreation StringLiteral tx
+ StringLiteral ClassInstanceCreation ClassInstanceCreation StringLiteral seq
cm SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName conditional mutation
cm SimpleName VariableDeclarationFragment ClassInstanceCreation StringLiteral +
cm SimpleName VariableDeclarationFragment ClassInstanceCreation ClassInstanceCreation StringLiteral tx
cm SimpleName VariableDeclarationFragment ClassInstanceCreation ClassInstanceCreation StringLiteral seq
conditional mutation SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName cm
cm SimpleName MethodInvocation SimpleName put
cm SimpleName MethodInvocation StringLiteral tx
cm SimpleName MethodInvocation StringLiteral seq
cm SimpleName MethodInvocation StringLiteral empty
put SimpleName MethodInvocation StringLiteral tx
put SimpleName MethodInvocation StringLiteral seq
put SimpleName MethodInvocation StringLiteral empty
tx StringLiteral MethodInvocation StringLiteral seq
tx StringLiteral MethodInvocation StringLiteral empty
seq StringLiteral MethodInvocation StringLiteral empty
cw SimpleName MethodInvocation SimpleName write
cw SimpleName MethodInvocation SimpleName cm
write SimpleName MethodInvocation SimpleName cm
cw SimpleName MethodInvocation MethodInvocation SimpleName get status
write SimpleName MethodInvocation MethodInvocation SimpleName get status
cm SimpleName MethodInvocation MethodInvocation SimpleName get status
assert SimpleName MethodInvocation SimpleName assert equals
assert SimpleName MethodInvocation QualifiedName statusviolated
assert SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName cw
assert SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName write
assert SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName cm
assert SimpleName MethodInvocation MethodInvocation SimpleName get status
assert equals SimpleName MethodInvocation QualifiedName statusviolated
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName cw
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName write
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName cm
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get status
statusviolated QualifiedName MethodInvocation MethodInvocation MethodInvocation SimpleName cw
statusviolated QualifiedName MethodInvocation MethodInvocation MethodInvocation SimpleName write
statusviolated QualifiedName MethodInvocation MethodInvocation MethodInvocation SimpleName cm
statusviolated QualifiedName MethodInvocation MethodInvocation SimpleName get status
scanner SimpleName MethodInvocation SimpleName iterator
scanner SimpleName MethodInvocation MethodInvocation SimpleName has next
iterator SimpleName MethodInvocation MethodInvocation SimpleName has next
assert SimpleName MethodInvocation SimpleName assert false
assert SimpleName MethodInvocation StringLiteral should find no results in the table is mutation result was violated
assert SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName scanner
assert SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName iterator
assert SimpleName MethodInvocation MethodInvocation SimpleName has next
assert false SimpleName MethodInvocation StringLiteral should find no results in the table is mutation result was violated
assert false SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName scanner
assert false SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName iterator
assert false SimpleName MethodInvocation MethodInvocation SimpleName has next
should find no results in the table is mutation result was violated StringLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName scanner
should find no results in the table is mutation result was violated StringLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName iterator
should find no results in the table is mutation result was violated StringLiteral MethodInvocation MethodInvocation SimpleName has next
condition SimpleName SimpleType ClassInstanceCreation StringLiteral tx
condition SimpleName SimpleType ClassInstanceCreation StringLiteral seq
tx StringLiteral ClassInstanceCreation StringLiteral seq
conditional mutation SimpleName SimpleType ClassInstanceCreation StringLiteral empty
conditional mutation SimpleName SimpleType ClassInstanceCreation ClassInstanceCreation StringLiteral tx
conditional mutation SimpleName SimpleType ClassInstanceCreation ClassInstanceCreation StringLiteral seq
empty StringLiteral ClassInstanceCreation ClassInstanceCreation SimpleType SimpleName condition
empty StringLiteral ClassInstanceCreation ClassInstanceCreation StringLiteral tx
empty StringLiteral ClassInstanceCreation ClassInstanceCreation StringLiteral seq
cm SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName conditional mutation
cm SimpleName VariableDeclarationFragment ClassInstanceCreation StringLiteral empty
cm SimpleName VariableDeclarationFragment ClassInstanceCreation ClassInstanceCreation StringLiteral tx
cm SimpleName VariableDeclarationFragment ClassInstanceCreation ClassInstanceCreation StringLiteral seq
conditional mutation SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName cm
cm SimpleName MethodInvocation SimpleName put
cm SimpleName MethodInvocation StringLiteral tx
cm SimpleName MethodInvocation StringLiteral seq
cm SimpleName MethodInvocation StringLiteral empty
put SimpleName MethodInvocation StringLiteral tx
put SimpleName MethodInvocation StringLiteral seq
put SimpleName MethodInvocation StringLiteral empty
tx StringLiteral MethodInvocation StringLiteral seq
tx StringLiteral MethodInvocation StringLiteral empty
seq StringLiteral MethodInvocation StringLiteral empty
cw SimpleName MethodInvocation SimpleName write
cw SimpleName MethodInvocation SimpleName cm
write SimpleName MethodInvocation SimpleName cm
cw SimpleName MethodInvocation MethodInvocation SimpleName get status
write SimpleName MethodInvocation MethodInvocation SimpleName get status
cm SimpleName MethodInvocation MethodInvocation SimpleName get status
assert SimpleName MethodInvocation SimpleName assert equals
assert SimpleName MethodInvocation QualifiedName statusaccepted
assert SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName cw
assert SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName write
assert SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName cm
assert SimpleName MethodInvocation MethodInvocation SimpleName get status
assert equals SimpleName MethodInvocation QualifiedName statusaccepted
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName cw
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName write
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName cm
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get status
statusaccepted QualifiedName MethodInvocation MethodInvocation MethodInvocation SimpleName cw
statusaccepted QualifiedName MethodInvocation MethodInvocation MethodInvocation SimpleName write
statusaccepted QualifiedName MethodInvocation MethodInvocation MethodInvocation SimpleName cm
statusaccepted QualifiedName MethodInvocation MethodInvocation SimpleName get status
scanner SimpleName MethodInvocation SimpleName iterator
scanner SimpleName MethodInvocation MethodInvocation SimpleName has next
iterator SimpleName MethodInvocation MethodInvocation SimpleName has next
assert SimpleName MethodInvocation SimpleName assert true
assert SimpleName MethodInvocation StringLiteral accepted result should be returned when reading table
assert SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName scanner
assert SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName iterator
assert SimpleName MethodInvocation MethodInvocation SimpleName has next
assert true SimpleName MethodInvocation StringLiteral accepted result should be returned when reading table
assert true SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName scanner
assert true SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName iterator
assert true SimpleName MethodInvocation MethodInvocation SimpleName has next
accepted result should be returned when reading table StringLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName scanner
accepted result should be returned when reading table StringLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName iterator
accepted result should be returned when reading table StringLiteral MethodInvocation MethodInvocation SimpleName has next
cw SimpleName MethodInvocation SimpleName close
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test constraints
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test constraints
public Modifier MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration SimpleName test constraints
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
test constraints SimpleName MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test constraints
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test constraints
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception