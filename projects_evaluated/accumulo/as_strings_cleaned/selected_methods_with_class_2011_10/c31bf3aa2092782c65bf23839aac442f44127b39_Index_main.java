string SimpleName SimpleType ArrayType SingleVariableDeclaration SimpleName args
argslength QualifiedName InfixExpression NumberLiteral empty
index SimpleName SimpleType TypeLiteral MethodInvocation SimpleName get name
usage : StringLiteral InfixExpression MethodInvocation SimpleName get name
usage : StringLiteral InfixExpression StringLiteral instance zoo keepers table user pass num partitions file file
get name SimpleName MethodInvocation InfixExpression StringLiteral instance zoo keepers table user pass num partitions file file
systemerr QualifiedName MethodInvocation SimpleName println
systemerr QualifiedName MethodInvocation InfixExpression StringLiteral usage :
systemerr QualifiedName MethodInvocation InfixExpression MethodInvocation SimpleName get name
systemerr QualifiedName MethodInvocation InfixExpression StringLiteral instance zoo keepers table user pass num partitions file file
println SimpleName MethodInvocation InfixExpression StringLiteral usage :
println SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get name
println SimpleName MethodInvocation InfixExpression StringLiteral instance zoo keepers table user pass num partitions file file
system SimpleName MethodInvocation SimpleName exit
system SimpleName MethodInvocation PrefixExpression NumberLiteral empty
exit SimpleName MethodInvocation PrefixExpression NumberLiteral empty
args SimpleName ArrayAccess NumberLiteral empty
instance SimpleName VariableDeclarationFragment ArrayAccess SimpleName args
instance SimpleName VariableDeclarationFragment ArrayAccess NumberLiteral empty
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName instance
args SimpleName ArrayAccess NumberLiteral empty
zoo keepers SimpleName VariableDeclarationFragment ArrayAccess SimpleName args
zoo keepers SimpleName VariableDeclarationFragment ArrayAccess NumberLiteral empty
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName zoo keepers
args SimpleName ArrayAccess NumberLiteral empty
table SimpleName VariableDeclarationFragment ArrayAccess SimpleName args
table SimpleName VariableDeclarationFragment ArrayAccess NumberLiteral empty
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table
args SimpleName ArrayAccess NumberLiteral empty
user SimpleName VariableDeclarationFragment ArrayAccess SimpleName args
user SimpleName VariableDeclarationFragment ArrayAccess NumberLiteral empty
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName user
args SimpleName ArrayAccess NumberLiteral empty
pass SimpleName VariableDeclarationFragment ArrayAccess SimpleName args
pass SimpleName VariableDeclarationFragment ArrayAccess NumberLiteral empty
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName pass
args SimpleName ArrayAccess NumberLiteral empty
integer SimpleName MethodInvocation SimpleName parse int
integer SimpleName MethodInvocation ArrayAccess SimpleName args
integer SimpleName MethodInvocation ArrayAccess NumberLiteral empty
parse int SimpleName MethodInvocation ArrayAccess SimpleName args
parse int SimpleName MethodInvocation ArrayAccess NumberLiteral empty
num partitions SimpleName VariableDeclarationFragment MethodInvocation SimpleName integer
num partitions SimpleName VariableDeclarationFragment MethodInvocation SimpleName parse int
num partitions SimpleName VariableDeclarationFragment MethodInvocation ArrayAccess SimpleName args
num partitions SimpleName VariableDeclarationFragment MethodInvocation ArrayAccess NumberLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName num partitions
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName integer
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName parse int
split regex SimpleName VariableDeclarationFragment StringLiteral w
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName split regex
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment StringLiteral w
setup batch writer SimpleName MethodInvocation SimpleName instance
setup batch writer SimpleName MethodInvocation SimpleName zoo keepers
setup batch writer SimpleName MethodInvocation SimpleName table
setup batch writer SimpleName MethodInvocation SimpleName user
setup batch writer SimpleName MethodInvocation SimpleName pass
instance SimpleName MethodInvocation SimpleName zoo keepers
instance SimpleName MethodInvocation SimpleName table
instance SimpleName MethodInvocation SimpleName user
instance SimpleName MethodInvocation SimpleName pass
zoo keepers SimpleName MethodInvocation SimpleName table
zoo keepers SimpleName MethodInvocation SimpleName user
zoo keepers SimpleName MethodInvocation SimpleName pass
table SimpleName MethodInvocation SimpleName user
table SimpleName MethodInvocation SimpleName pass
user SimpleName MethodInvocation SimpleName pass
bw SimpleName VariableDeclarationFragment MethodInvocation SimpleName setup batch writer
bw SimpleName VariableDeclarationFragment MethodInvocation SimpleName instance
bw SimpleName VariableDeclarationFragment MethodInvocation SimpleName zoo keepers
bw SimpleName VariableDeclarationFragment MethodInvocation SimpleName table
bw SimpleName VariableDeclarationFragment MethodInvocation SimpleName user
bw SimpleName VariableDeclarationFragment MethodInvocation SimpleName pass
batch writer SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName bw
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression QualifiedName argslength
args SimpleName ArrayAccess SimpleName i
file SimpleName SimpleType ClassInstanceCreation ArrayAccess SimpleName args
file SimpleName SimpleType ClassInstanceCreation ArrayAccess SimpleName i
index SimpleName MethodInvocation SimpleName num partitions
index SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName file
index SimpleName MethodInvocation ClassInstanceCreation ArrayAccess SimpleName args
index SimpleName MethodInvocation ClassInstanceCreation ArrayAccess SimpleName i
index SimpleName MethodInvocation SimpleName split regex
index SimpleName MethodInvocation SimpleName bw
num partitions SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName file
num partitions SimpleName MethodInvocation ClassInstanceCreation ArrayAccess SimpleName args
num partitions SimpleName MethodInvocation ClassInstanceCreation ArrayAccess SimpleName i
num partitions SimpleName MethodInvocation SimpleName split regex
num partitions SimpleName MethodInvocation SimpleName bw
file SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName split regex
args SimpleName ArrayAccess ClassInstanceCreation MethodInvocation SimpleName split regex
i SimpleName ArrayAccess ClassInstanceCreation MethodInvocation SimpleName split regex
file SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName bw
args SimpleName ArrayAccess ClassInstanceCreation MethodInvocation SimpleName bw
i SimpleName ArrayAccess ClassInstanceCreation MethodInvocation SimpleName bw
split regex SimpleName MethodInvocation SimpleName bw
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression QualifiedName argslength
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
argslength QualifiedName InfixExpression ForStatement PostfixExpression SimpleName i
bw SimpleName MethodInvocation SimpleName close
public Modifier MethodDeclaration Modifier static
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName main
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName args
public Modifier MethodDeclaration SimpleType SimpleName exception
static Modifier MethodDeclaration PrimitiveType void
static Modifier MethodDeclaration SimpleName main
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName args
static Modifier MethodDeclaration SimpleType SimpleName exception
static Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
void PrimitiveType MethodDeclaration SimpleName main
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName args
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
main SimpleName MethodDeclaration SingleVariableDeclaration SimpleName args
main SimpleName MethodDeclaration SimpleType SimpleName exception
main SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
args SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration Modifier static
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName main
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName args
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration Modifier static
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName main
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName args
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
