source SimpleName MethodInvocation SimpleName has next
pos SimpleName Assignment NumberLiteral empty
count SimpleName Assignment Assignment SimpleName pos
count SimpleName Assignment Assignment NumberLiteral empty
io exception SimpleName SimpleType ClassInstanceCreation StringLiteral no end chunk marker but source has no data
got end marker SimpleName IfStatement ReturnStatement Assignment SimpleName count
got end marker SimpleName IfStatement ThrowStatement ClassInstanceCreation StringLiteral no end chunk marker but source has no data
entry SimpleName SimpleType ParameterizedType SimpleType SimpleName key
entry SimpleName SimpleType ParameterizedType SimpleType SimpleName value
key SimpleName SimpleType ParameterizedType SimpleType SimpleName value
source SimpleName MethodInvocation SimpleName peek
entry SimpleName VariableDeclarationFragment MethodInvocation SimpleName source
entry SimpleName VariableDeclarationFragment MethodInvocation SimpleName peek
entry SimpleName MethodInvocation SimpleName get key
this key SimpleName VariableDeclarationFragment MethodInvocation SimpleName entry
this key SimpleName VariableDeclarationFragment MethodInvocation SimpleName get key
key SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName this key
this key SimpleName MethodInvocation SimpleName to string
evaluating key StringLiteral InfixExpression MethodInvocation SimpleName this key
evaluating key StringLiteral InfixExpression MethodInvocation SimpleName to string
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation InfixExpression StringLiteral evaluating key
log SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName this key
log SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName to string
debug SimpleName MethodInvocation InfixExpression StringLiteral evaluating key
debug SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName this key
debug SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName to string
this key SimpleName MethodInvocation SimpleName equals
this key SimpleName MethodInvocation SimpleName current key
this key SimpleName MethodInvocation QualifiedName partial keyrow
equals SimpleName MethodInvocation SimpleName current key
equals SimpleName MethodInvocation QualifiedName partial keyrow
current key SimpleName MethodInvocation QualifiedName partial keyrow
current key SimpleName MethodInvocation SimpleName get row
current key SimpleName MethodInvocation MethodInvocation SimpleName to string
get row SimpleName MethodInvocation MethodInvocation SimpleName to string
current row SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName current key
current row SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get row
current row SimpleName VariableDeclarationFragment MethodInvocation SimpleName to string
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName current row
got to the end of the row without end chunk marker StringLiteral InfixExpression SimpleName current row
io exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral got to the end of the row without end chunk marker
io exception SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName current row
got end marker SimpleName IfStatement ReturnStatement PrefixExpression NumberLiteral empty
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral matches current key
debug SimpleName MethodInvocation StringLiteral matches current key
source SimpleName MethodInvocation SimpleName next
this key SimpleName MethodInvocation SimpleName get column family
this key SimpleName MethodInvocation MethodInvocation SimpleName equals
get column family SimpleName MethodInvocation MethodInvocation SimpleName equals
this key SimpleName MethodInvocation MethodInvocation QualifiedName file data ingestchunk cf
get column family SimpleName MethodInvocation MethodInvocation QualifiedName file data ingestchunk cf
equals SimpleName MethodInvocation QualifiedName file data ingestchunk cf
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral skipping nonchunk key
debug SimpleName MethodInvocation StringLiteral skipping nonchunk key
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral is a chunk
debug SimpleName MethodInvocation StringLiteral is a chunk
this key SimpleName MethodInvocation SimpleName get column qualifier
this key SimpleName MethodInvocation MethodInvocation SimpleName get bytes
get column qualifier SimpleName MethodInvocation MethodInvocation SimpleName get bytes
file data ingest SimpleName MethodInvocation SimpleName bytes to int
file data ingest SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName this key
file data ingest SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get column qualifier
file data ingest SimpleName MethodInvocation MethodInvocation SimpleName get bytes
file data ingest SimpleName MethodInvocation NumberLiteral empty
bytes to int SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName this key
bytes to int SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get column qualifier
bytes to int SimpleName MethodInvocation MethodInvocation SimpleName get bytes
bytes to int SimpleName MethodInvocation NumberLiteral empty
this key SimpleName MethodInvocation MethodInvocation MethodInvocation NumberLiteral empty
get column qualifier SimpleName MethodInvocation MethodInvocation MethodInvocation NumberLiteral empty
get bytes SimpleName MethodInvocation MethodInvocation NumberLiteral empty
current chunk size SimpleName InfixExpression MethodInvocation SimpleName file data ingest
current chunk size SimpleName InfixExpression MethodInvocation SimpleName bytes to int
current chunk size SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName get bytes
current chunk size SimpleName InfixExpression MethodInvocation NumberLiteral empty
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral skipping chunk of different size
debug SimpleName MethodInvocation StringLiteral skipping chunk of different size
this key SimpleName MethodInvocation SimpleName get column visibility
current vis SimpleName MethodInvocation SimpleName contains
current vis SimpleName MethodInvocation MethodInvocation SimpleName this key
current vis SimpleName MethodInvocation MethodInvocation SimpleName get column visibility
contains SimpleName MethodInvocation MethodInvocation SimpleName this key
contains SimpleName MethodInvocation MethodInvocation SimpleName get column visibility
this key SimpleName MethodInvocation SimpleName get column visibility
current vis SimpleName MethodInvocation SimpleName add
current vis SimpleName MethodInvocation MethodInvocation SimpleName this key
current vis SimpleName MethodInvocation MethodInvocation SimpleName get column visibility
add SimpleName MethodInvocation MethodInvocation SimpleName this key
add SimpleName MethodInvocation MethodInvocation SimpleName get column visibility
this key SimpleName MethodInvocation SimpleName get column qualifier
current key SimpleName MethodInvocation SimpleName get column qualifier
this key SimpleName MethodInvocation MethodInvocation SimpleName equals
get column qualifier SimpleName MethodInvocation MethodInvocation SimpleName equals
this key SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName current key
this key SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get column qualifier
get column qualifier SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName current key
get column qualifier SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get column qualifier
equals SimpleName MethodInvocation MethodInvocation SimpleName current key
equals SimpleName MethodInvocation MethodInvocation SimpleName get column qualifier
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral skipping identical chunk with different visibility
debug SimpleName MethodInvocation StringLiteral skipping identical chunk with different visibility
current key SimpleName MethodInvocation SimpleName to string
this key SimpleName MethodInvocation SimpleName to string
got another chunk after end marker StringLiteral InfixExpression MethodInvocation SimpleName current key
got another chunk after end marker StringLiteral InfixExpression MethodInvocation SimpleName to string
got another chunk after end marker StringLiteral InfixExpression StringLiteral empty
got another chunk after end marker StringLiteral InfixExpression MethodInvocation SimpleName this key
got another chunk after end marker StringLiteral InfixExpression MethodInvocation SimpleName to string
current key SimpleName MethodInvocation InfixExpression StringLiteral empty
to string SimpleName MethodInvocation InfixExpression StringLiteral empty
current key SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName this key
current key SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName to string
to string SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName this key
to string SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName to string
empty StringLiteral InfixExpression MethodInvocation SimpleName this key
empty StringLiteral InfixExpression MethodInvocation SimpleName to string
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation InfixExpression StringLiteral got another chunk after end marker
log SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName current key
log SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName to string
log SimpleName MethodInvocation InfixExpression StringLiteral empty
log SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName this key
log SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName to string
debug SimpleName MethodInvocation InfixExpression StringLiteral got another chunk after end marker
debug SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName current key
debug SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName to string
debug SimpleName MethodInvocation InfixExpression StringLiteral empty
debug SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName this key
debug SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName to string
io exception SimpleName SimpleType ClassInstanceCreation StringLiteral found extra chunk after end marker
this key SimpleName MethodInvocation SimpleName get column qualifier
this key SimpleName MethodInvocation MethodInvocation SimpleName get bytes
get column qualifier SimpleName MethodInvocation MethodInvocation SimpleName get bytes
file data ingest SimpleName MethodInvocation SimpleName bytes to int
file data ingest SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName this key
file data ingest SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get column qualifier
file data ingest SimpleName MethodInvocation MethodInvocation SimpleName get bytes
file data ingest SimpleName MethodInvocation NumberLiteral empty
bytes to int SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName this key
bytes to int SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get column qualifier
bytes to int SimpleName MethodInvocation MethodInvocation SimpleName get bytes
bytes to int SimpleName MethodInvocation NumberLiteral empty
this key SimpleName MethodInvocation MethodInvocation MethodInvocation NumberLiteral empty
get column qualifier SimpleName MethodInvocation MethodInvocation MethodInvocation NumberLiteral empty
get bytes SimpleName MethodInvocation MethodInvocation NumberLiteral empty
this chunk SimpleName VariableDeclarationFragment MethodInvocation SimpleName file data ingest
this chunk SimpleName VariableDeclarationFragment MethodInvocation SimpleName bytes to int
this chunk SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get bytes
this chunk SimpleName VariableDeclarationFragment MethodInvocation NumberLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName this chunk
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName file data ingest
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName bytes to int
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation NumberLiteral empty
current chunk SimpleName InfixExpression NumberLiteral empty
this chunk SimpleName InfixExpression InfixExpression SimpleName current chunk
this chunk SimpleName InfixExpression InfixExpression NumberLiteral empty
current key SimpleName MethodInvocation SimpleName to string
this key SimpleName MethodInvocation SimpleName to string
new chunk same file unexpected chunk id StringLiteral InfixExpression MethodInvocation SimpleName current key
new chunk same file unexpected chunk id StringLiteral InfixExpression MethodInvocation SimpleName to string
new chunk same file unexpected chunk id StringLiteral InfixExpression StringLiteral empty
new chunk same file unexpected chunk id StringLiteral InfixExpression MethodInvocation SimpleName this key
new chunk same file unexpected chunk id StringLiteral InfixExpression MethodInvocation SimpleName to string
current key SimpleName MethodInvocation InfixExpression StringLiteral empty
to string SimpleName MethodInvocation InfixExpression StringLiteral empty
current key SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName this key
current key SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName to string
to string SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName this key
to string SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName to string
empty StringLiteral InfixExpression MethodInvocation SimpleName this key
empty StringLiteral InfixExpression MethodInvocation SimpleName to string
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation InfixExpression StringLiteral new chunk same file unexpected chunk id
log SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName current key
log SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName to string
log SimpleName MethodInvocation InfixExpression StringLiteral empty
log SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName this key
log SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName to string
debug SimpleName MethodInvocation InfixExpression StringLiteral new chunk same file unexpected chunk id
debug SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName current key
debug SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName to string
debug SimpleName MethodInvocation InfixExpression StringLiteral empty
debug SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName this key
debug SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName to string
missing chunks between StringLiteral InfixExpression SimpleName current chunk
missing chunks between StringLiteral InfixExpression StringLiteral and
missing chunks between StringLiteral InfixExpression SimpleName this chunk
current chunk SimpleName InfixExpression StringLiteral and
current chunk SimpleName InfixExpression SimpleName this chunk
and StringLiteral InfixExpression SimpleName this chunk
io exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral missing chunks between
io exception SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName current chunk
io exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral and
io exception SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName this chunk
current key SimpleName Assignment SimpleName this key
current chunk SimpleName Assignment SimpleName this chunk
entry SimpleName MethodInvocation SimpleName get value
entry SimpleName MethodInvocation MethodInvocation SimpleName get
get value SimpleName MethodInvocation MethodInvocation SimpleName get
buf SimpleName Assignment MethodInvocation MethodInvocation SimpleName entry
buf SimpleName Assignment MethodInvocation MethodInvocation SimpleName get value
buf SimpleName Assignment MethodInvocation SimpleName get
pos SimpleName Assignment NumberLiteral empty
buflength QualifiedName InfixExpression NumberLiteral empty
got end marker SimpleName Assignment BooleanLiteral true
count SimpleName Assignment QualifiedName buflength
got end marker SimpleName IfStatement Block VariableDeclarationStatement PrimitiveType int
private Modifier MethodDeclaration PrimitiveType int
private Modifier MethodDeclaration SimpleName fill
private Modifier MethodDeclaration SimpleType SimpleName io exception
private Modifier MethodDeclaration Block IfStatement SimpleName got end marker
private Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
int PrimitiveType MethodDeclaration SimpleName fill
int PrimitiveType MethodDeclaration SimpleType SimpleName io exception
int PrimitiveType MethodDeclaration Block IfStatement SimpleName got end marker
int PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
fill SimpleName MethodDeclaration SimpleType SimpleName io exception
fill SimpleName MethodDeclaration Block IfStatement SimpleName got end marker
fill SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration PrimitiveType int
public Modifier TypeDeclaration MethodDeclaration SimpleName fill
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType int
test SimpleName TypeDeclaration MethodDeclaration SimpleName fill
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
