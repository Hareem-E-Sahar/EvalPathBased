connector SimpleName SimpleType SingleVariableDeclaration SimpleName conn
conn SimpleName MethodInvocation SimpleName security operations
conn SimpleName MethodInvocation SimpleName whoami
conn SimpleName MethodInvocation MethodInvocation SimpleName grant table permission
security operations SimpleName MethodInvocation MethodInvocation SimpleName grant table permission
conn SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName conn
conn SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName whoami
security operations SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName conn
security operations SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName whoami
conn SimpleName MethodInvocation MethodInvocation QualifiedName constantsmetadata table name
security operations SimpleName MethodInvocation MethodInvocation QualifiedName constantsmetadata table name
conn SimpleName MethodInvocation MethodInvocation QualifiedName table permissionwrite
security operations SimpleName MethodInvocation MethodInvocation QualifiedName table permissionwrite
grant table permission SimpleName MethodInvocation MethodInvocation SimpleName conn
grant table permission SimpleName MethodInvocation MethodInvocation SimpleName whoami
grant table permission SimpleName MethodInvocation QualifiedName constantsmetadata table name
grant table permission SimpleName MethodInvocation QualifiedName table permissionwrite
conn SimpleName MethodInvocation MethodInvocation QualifiedName constantsmetadata table name
whoami SimpleName MethodInvocation MethodInvocation QualifiedName constantsmetadata table name
conn SimpleName MethodInvocation MethodInvocation QualifiedName table permissionwrite
whoami SimpleName MethodInvocation MethodInvocation QualifiedName table permissionwrite
constantsmetadata table name QualifiedName MethodInvocation QualifiedName table permissionwrite
l NumberLiteral InfixExpression NumberLiteral empty
conn SimpleName MethodInvocation SimpleName create batch writer
conn SimpleName MethodInvocation QualifiedName constantsmetadata table name
conn SimpleName MethodInvocation InfixExpression NumberLiteral l
conn SimpleName MethodInvocation InfixExpression NumberLiteral empty
conn SimpleName MethodInvocation NumberLiteral l
conn SimpleName MethodInvocation NumberLiteral empty
create batch writer SimpleName MethodInvocation QualifiedName constantsmetadata table name
create batch writer SimpleName MethodInvocation InfixExpression NumberLiteral l
create batch writer SimpleName MethodInvocation InfixExpression NumberLiteral empty
create batch writer SimpleName MethodInvocation NumberLiteral l
create batch writer SimpleName MethodInvocation NumberLiteral empty
constantsmetadata table name QualifiedName MethodInvocation InfixExpression NumberLiteral l
constantsmetadata table name QualifiedName MethodInvocation InfixExpression NumberLiteral empty
constantsmetadata table name QualifiedName MethodInvocation NumberLiteral l
constantsmetadata table name QualifiedName MethodInvocation NumberLiteral empty
l NumberLiteral InfixExpression MethodInvocation NumberLiteral l
empty NumberLiteral InfixExpression MethodInvocation NumberLiteral l
l NumberLiteral InfixExpression MethodInvocation NumberLiteral empty
empty NumberLiteral InfixExpression MethodInvocation NumberLiteral empty
l NumberLiteral MethodInvocation NumberLiteral empty
bw SimpleName VariableDeclarationFragment MethodInvocation SimpleName conn
bw SimpleName VariableDeclarationFragment MethodInvocation SimpleName create batch writer
bw SimpleName VariableDeclarationFragment MethodInvocation QualifiedName constantsmetadata table name
bw SimpleName VariableDeclarationFragment MethodInvocation InfixExpression NumberLiteral l
bw SimpleName VariableDeclarationFragment MethodInvocation InfixExpression NumberLiteral empty
bw SimpleName VariableDeclarationFragment MethodInvocation NumberLiteral l
bw SimpleName VariableDeclarationFragment MethodInvocation NumberLiteral empty
batch writer SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName bw
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression NumberLiteral empty
text SimpleName SimpleType ClassInstanceCreation StringLiteral empty
empty text SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName text
empty text SimpleName VariableDeclarationFragment ClassInstanceCreation StringLiteral empty
final Modifier VariableDeclarationStatement SimpleType SimpleName text
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName empty text
final Modifier VariableDeclarationStatement VariableDeclarationFragment ClassInstanceCreation StringLiteral empty
text SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName empty text
string SimpleName MethodInvocation SimpleName format
string SimpleName MethodInvocation StringLiteral ss ds
string SimpleName MethodInvocation QualifiedName constantsmetadata delete flag prefix
string SimpleName MethodInvocation StringLiteral /
string SimpleName MethodInvocation SimpleName i
format SimpleName MethodInvocation StringLiteral ss ds
format SimpleName MethodInvocation QualifiedName constantsmetadata delete flag prefix
format SimpleName MethodInvocation StringLiteral /
format SimpleName MethodInvocation SimpleName i
format SimpleName MethodInvocation StringLiteral aaaaaaaaaabbbbbbbbbbccccccccccddddddddddeeeeeeeeeeffffffffffgggggggggghhhhhhhhhhiiiiiiiiiijjjjjjjjjj
ss ds StringLiteral MethodInvocation QualifiedName constantsmetadata delete flag prefix
ss ds StringLiteral MethodInvocation StringLiteral /
ss ds StringLiteral MethodInvocation SimpleName i
ss ds StringLiteral MethodInvocation StringLiteral aaaaaaaaaabbbbbbbbbbccccccccccddddddddddeeeeeeeeeeffffffffffgggggggggghhhhhhhhhhiiiiiiiiiijjjjjjjjjj
constantsmetadata delete flag prefix QualifiedName MethodInvocation StringLiteral /
constantsmetadata delete flag prefix QualifiedName MethodInvocation SimpleName i
constantsmetadata delete flag prefix QualifiedName MethodInvocation StringLiteral aaaaaaaaaabbbbbbbbbbccccccccccddddddddddeeeeeeeeeeffffffffffgggggggggghhhhhhhhhhiiiiiiiiiijjjjjjjjjj
/ StringLiteral MethodInvocation SimpleName i
/ StringLiteral MethodInvocation StringLiteral aaaaaaaaaabbbbbbbbbbccccccccccddddddddddeeeeeeeeeeffffffffffgggggggggghhhhhhhhhhiiiiiiiiiijjjjjjjjjj
i SimpleName MethodInvocation StringLiteral aaaaaaaaaabbbbbbbbbbccccccccccddddddddddeeeeeeeeeeffffffffffgggggggggghhhhhhhhhhiiiiiiiiiijjjjjjjjjj
text SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName string
text SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName format
text SimpleName SimpleType ClassInstanceCreation MethodInvocation StringLiteral ss ds
text SimpleName SimpleType ClassInstanceCreation MethodInvocation QualifiedName constantsmetadata delete flag prefix
text SimpleName SimpleType ClassInstanceCreation MethodInvocation StringLiteral /
text SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName i
text SimpleName SimpleType ClassInstanceCreation MethodInvocation StringLiteral aaaaaaaaaabbbbbbbbbbccccccccccddddddddddeeeeeeeeeeffffffffffgggggggggghhhhhhhhhhiiiiiiiiiijjjjjjjjjj
row SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName text
row SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName string
row SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName format
row SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation StringLiteral ss ds
row SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation QualifiedName constantsmetadata delete flag prefix
row SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation StringLiteral /
row SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName i
row SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation StringLiteral aaaaaaaaaabbbbbbbbbbccccccccccddddddddddeeeeeeeeeeffffffffffgggggggggghhhhhhhhhhiiiiiiiiiijjjjjjjjjj
text SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName row
mutation SimpleName SimpleType ClassInstanceCreation SimpleName row
del flag SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName mutation
del flag SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName row
mutation SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName del flag
del flag SimpleName MethodInvocation SimpleName put
del flag SimpleName MethodInvocation SimpleName empty text
del flag SimpleName MethodInvocation SimpleName empty text
del flag SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName value
put SimpleName MethodInvocation SimpleName empty text
put SimpleName MethodInvocation SimpleName empty text
put SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName value
empty text SimpleName MethodInvocation SimpleName empty text
empty text SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName value
empty text SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName value
bw SimpleName MethodInvocation SimpleName add mutation
bw SimpleName MethodInvocation SimpleName del flag
add mutation SimpleName MethodInvocation SimpleName del flag
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression NumberLiteral empty
int PrimitiveType VariableDeclarationExpression ForStatement PrefixExpression SimpleName i
i SimpleName InfixExpression ForStatement PrefixExpression SimpleName i
empty NumberLiteral InfixExpression ForStatement PrefixExpression SimpleName i
bw SimpleName MethodInvocation SimpleName close
private Modifier MethodDeclaration Modifier static
private Modifier MethodDeclaration PrimitiveType void
private Modifier MethodDeclaration SimpleName generate candidates
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName connector
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName conn
private Modifier MethodDeclaration SimpleType SimpleName accumulo exception
static Modifier MethodDeclaration PrimitiveType void
static Modifier MethodDeclaration SimpleName generate candidates
static Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName connector
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName conn
static Modifier MethodDeclaration SimpleType SimpleName accumulo exception
static Modifier MethodDeclaration SimpleType SimpleName accumulo security exception
void PrimitiveType MethodDeclaration SimpleName generate candidates
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName connector
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName conn
void PrimitiveType MethodDeclaration SimpleType SimpleName accumulo exception
void PrimitiveType MethodDeclaration SimpleType SimpleName accumulo security exception
void PrimitiveType MethodDeclaration SimpleType SimpleName table not found exception
generate candidates SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName connector
generate candidates SimpleName MethodDeclaration SingleVariableDeclaration SimpleName conn
generate candidates SimpleName MethodDeclaration SimpleType SimpleName accumulo exception
generate candidates SimpleName MethodDeclaration SimpleType SimpleName accumulo security exception
generate candidates SimpleName MethodDeclaration SimpleType SimpleName table not found exception
generate candidates SimpleName MethodDeclaration SimpleType SimpleName mutations rejected exception
conn SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName accumulo exception
conn SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName accumulo security exception
conn SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName table not found exception
conn SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName mutations rejected exception
accumulo exception SimpleName SimpleType MethodDeclaration SimpleType SimpleName accumulo security exception
accumulo exception SimpleName SimpleType MethodDeclaration SimpleType SimpleName table not found exception
accumulo exception SimpleName SimpleType MethodDeclaration SimpleType SimpleName mutations rejected exception
accumulo security exception SimpleName SimpleType MethodDeclaration SimpleType SimpleName table not found exception
accumulo security exception SimpleName SimpleType MethodDeclaration SimpleType SimpleName mutations rejected exception
table not found exception SimpleName SimpleType MethodDeclaration SimpleType SimpleName mutations rejected exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration Modifier static
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName generate candidates
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName conn
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName accumulo exception
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName accumulo security exception
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName table not found exception
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName mutations rejected exception
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration Modifier static
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName generate candidates
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName conn
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName accumulo exception
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName accumulo security exception
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName table not found exception
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName mutations rejected exception
