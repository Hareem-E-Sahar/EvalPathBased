conn SimpleName VariableDeclarationFragment MethodInvocation SimpleName get connector
connector SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName conn
list SimpleName SimpleType ParameterizedType SimpleType SimpleName string
conn SimpleName MethodInvocation SimpleName table operations
conn SimpleName MethodInvocation MethodInvocation SimpleName exists
table operations SimpleName MethodInvocation MethodInvocation SimpleName exists
conn SimpleName MethodInvocation MethodInvocation QualifiedName replication tablename
table operations SimpleName MethodInvocation MethodInvocation QualifiedName replication tablename
exists SimpleName MethodInvocation QualifiedName replication tablename
assert SimpleName MethodInvocation SimpleName assert false
assert SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName conn
assert SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName table operations
assert SimpleName MethodInvocation MethodInvocation SimpleName exists
assert SimpleName MethodInvocation MethodInvocation QualifiedName replication tablename
assert false SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName conn
assert false SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName table operations
assert false SimpleName MethodInvocation MethodInvocation SimpleName exists
assert false SimpleName MethodInvocation MethodInvocation QualifiedName replication tablename
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression NumberLiteral empty
table StringLiteral InfixExpression SimpleName i
name SimpleName VariableDeclarationFragment InfixExpression StringLiteral table
name SimpleName VariableDeclarationFragment InfixExpression SimpleName i
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName name
tables SimpleName MethodInvocation SimpleName add
tables SimpleName MethodInvocation SimpleName name
add SimpleName MethodInvocation SimpleName name
conn SimpleName MethodInvocation SimpleName table operations
conn SimpleName MethodInvocation MethodInvocation SimpleName create
table operations SimpleName MethodInvocation MethodInvocation SimpleName create
conn SimpleName MethodInvocation MethodInvocation SimpleName name
table operations SimpleName MethodInvocation MethodInvocation SimpleName name
create SimpleName MethodInvocation SimpleName name
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression NumberLiteral empty
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
empty NumberLiteral InfixExpression ForStatement PostfixExpression SimpleName i
conn SimpleName MethodInvocation SimpleName table operations
conn SimpleName MethodInvocation MethodInvocation SimpleName exists
table operations SimpleName MethodInvocation MethodInvocation SimpleName exists
conn SimpleName MethodInvocation MethodInvocation QualifiedName replication tablename
table operations SimpleName MethodInvocation MethodInvocation QualifiedName replication tablename
exists SimpleName MethodInvocation QualifiedName replication tablename
assert SimpleName MethodInvocation SimpleName assert false
assert SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName conn
assert SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName table operations
assert SimpleName MethodInvocation MethodInvocation SimpleName exists
assert SimpleName MethodInvocation MethodInvocation QualifiedName replication tablename
assert false SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName conn
assert false SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName table operations
assert false SimpleName MethodInvocation MethodInvocation SimpleName exists
assert false SimpleName MethodInvocation MethodInvocation QualifiedName replication tablename
string SimpleName SimpleType SingleVariableDeclaration SimpleName table
conn SimpleName MethodInvocation SimpleName create batch writer
conn SimpleName MethodInvocation SimpleName table
conn SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName batch writer config
create batch writer SimpleName MethodInvocation SimpleName table
create batch writer SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName batch writer config
table SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName batch writer config
bw SimpleName VariableDeclarationFragment MethodInvocation SimpleName conn
bw SimpleName VariableDeclarationFragment MethodInvocation SimpleName create batch writer
bw SimpleName VariableDeclarationFragment MethodInvocation SimpleName table
batch writer SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName bw
j SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName j
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
j SimpleName InfixExpression NumberLiteral empty
integer SimpleName MethodInvocation SimpleName to string
integer SimpleName MethodInvocation SimpleName j
to string SimpleName MethodInvocation SimpleName j
mutation SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName integer
mutation SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName to string
mutation SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName j
m SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName mutation
m SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName integer
m SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName to string
m SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName j
mutation SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName m
k SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName k
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
k SimpleName InfixExpression NumberLiteral empty
integer SimpleName MethodInvocation SimpleName to string
integer SimpleName MethodInvocation SimpleName k
to string SimpleName MethodInvocation SimpleName k
value SimpleName VariableDeclarationFragment MethodInvocation SimpleName integer
value SimpleName VariableDeclarationFragment MethodInvocation SimpleName to string
value SimpleName VariableDeclarationFragment MethodInvocation SimpleName k
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName value
m SimpleName MethodInvocation SimpleName put
m SimpleName MethodInvocation SimpleName value
m SimpleName MethodInvocation StringLiteral empty
m SimpleName MethodInvocation SimpleName value
put SimpleName MethodInvocation SimpleName value
put SimpleName MethodInvocation StringLiteral empty
put SimpleName MethodInvocation SimpleName value
value SimpleName MethodInvocation StringLiteral empty
value SimpleName MethodInvocation SimpleName value
empty StringLiteral MethodInvocation SimpleName value
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName k
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression NumberLiteral empty
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName k
k SimpleName InfixExpression ForStatement PostfixExpression SimpleName k
empty NumberLiteral InfixExpression ForStatement PostfixExpression SimpleName k
bw SimpleName MethodInvocation SimpleName add mutation
bw SimpleName MethodInvocation SimpleName m
add mutation SimpleName MethodInvocation SimpleName m
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName j
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression NumberLiteral empty
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName j
j SimpleName InfixExpression ForStatement PostfixExpression SimpleName j
empty NumberLiteral InfixExpression ForStatement PostfixExpression SimpleName j
bw SimpleName MethodInvocation SimpleName close
string SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName tables
table SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName tables
conn SimpleName MethodInvocation SimpleName table operations
conn SimpleName MethodInvocation MethodInvocation SimpleName exists
table operations SimpleName MethodInvocation MethodInvocation SimpleName exists
conn SimpleName MethodInvocation MethodInvocation QualifiedName replication tablename
table operations SimpleName MethodInvocation MethodInvocation QualifiedName replication tablename
exists SimpleName MethodInvocation QualifiedName replication tablename
assert SimpleName MethodInvocation SimpleName assert false
assert SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName conn
assert SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName table operations
assert SimpleName MethodInvocation MethodInvocation SimpleName exists
assert SimpleName MethodInvocation MethodInvocation QualifiedName replication tablename
assert false SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName conn
assert false SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName table operations
assert false SimpleName MethodInvocation MethodInvocation SimpleName exists
assert false SimpleName MethodInvocation MethodInvocation QualifiedName replication tablename
string SimpleName SimpleType SingleVariableDeclaration SimpleName table
conn SimpleName MethodInvocation SimpleName table operations
conn SimpleName MethodInvocation MethodInvocation SimpleName compact
table operations SimpleName MethodInvocation MethodInvocation SimpleName compact
conn SimpleName MethodInvocation MethodInvocation SimpleName table
table operations SimpleName MethodInvocation MethodInvocation SimpleName table
conn SimpleName MethodInvocation MethodInvocation BooleanLiteral true
table operations SimpleName MethodInvocation MethodInvocation BooleanLiteral true
compact SimpleName MethodInvocation SimpleName table
compact SimpleName MethodInvocation BooleanLiteral true
compact SimpleName MethodInvocation BooleanLiteral true
table SimpleName MethodInvocation BooleanLiteral true
table SimpleName MethodInvocation BooleanLiteral true
true BooleanLiteral MethodInvocation BooleanLiteral true
string SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName tables
table SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName tables
conn SimpleName MethodInvocation SimpleName table operations
conn SimpleName MethodInvocation MethodInvocation SimpleName exists
table operations SimpleName MethodInvocation MethodInvocation SimpleName exists
conn SimpleName MethodInvocation MethodInvocation QualifiedName replication tablename
table operations SimpleName MethodInvocation MethodInvocation QualifiedName replication tablename
exists SimpleName MethodInvocation QualifiedName replication tablename
assert SimpleName MethodInvocation SimpleName assert false
assert SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName conn
assert SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName table operations
assert SimpleName MethodInvocation MethodInvocation SimpleName exists
assert SimpleName MethodInvocation MethodInvocation QualifiedName replication tablename
assert false SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName conn
assert false SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName table operations
assert false SimpleName MethodInvocation MethodInvocation SimpleName exists
assert false SimpleName MethodInvocation MethodInvocation QualifiedName replication tablename
string SimpleName SimpleType SingleVariableDeclaration SimpleName table
conn SimpleName MethodInvocation SimpleName table operations
conn SimpleName MethodInvocation MethodInvocation SimpleName delete
table operations SimpleName MethodInvocation MethodInvocation SimpleName delete
conn SimpleName MethodInvocation MethodInvocation SimpleName table
table operations SimpleName MethodInvocation MethodInvocation SimpleName table
delete SimpleName MethodInvocation SimpleName table
string SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName tables
table SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName tables
conn SimpleName MethodInvocation SimpleName table operations
conn SimpleName MethodInvocation MethodInvocation SimpleName exists
table operations SimpleName MethodInvocation MethodInvocation SimpleName exists
conn SimpleName MethodInvocation MethodInvocation QualifiedName replication tablename
table operations SimpleName MethodInvocation MethodInvocation QualifiedName replication tablename
exists SimpleName MethodInvocation QualifiedName replication tablename
assert SimpleName MethodInvocation SimpleName assert false
assert SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName conn
assert SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName table operations
assert SimpleName MethodInvocation MethodInvocation SimpleName exists
assert SimpleName MethodInvocation MethodInvocation QualifiedName replication tablename
assert false SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName conn
assert false SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName table operations
assert false SimpleName MethodInvocation MethodInvocation SimpleName exists
assert false SimpleName MethodInvocation MethodInvocation QualifiedName replication tablename
tables SimpleName EnhancedForStatement Block EnhancedForStatement SimpleName tables
tables SimpleName EnhancedForStatement Block EnhancedForStatement SimpleName tables
tables SimpleName EnhancedForStatement Block EnhancedForStatement SimpleName tables
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName no records without replication
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName no records without replication
public Modifier MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration Block EnhancedForStatement SimpleName tables
public Modifier MethodDeclaration Block EnhancedForStatement SimpleName tables
public Modifier MethodDeclaration Block EnhancedForStatement SimpleName tables
void PrimitiveType MethodDeclaration SimpleName no records without replication
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration Block EnhancedForStatement SimpleName tables
void PrimitiveType MethodDeclaration Block EnhancedForStatement SimpleName tables
void PrimitiveType MethodDeclaration Block EnhancedForStatement SimpleName tables
no records without replication SimpleName MethodDeclaration SimpleType SimpleName exception
no records without replication SimpleName MethodDeclaration Block EnhancedForStatement SimpleName tables
no records without replication SimpleName MethodDeclaration Block EnhancedForStatement SimpleName tables
no records without replication SimpleName MethodDeclaration Block EnhancedForStatement SimpleName tables
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName no records without replication
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName no records without replication
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
