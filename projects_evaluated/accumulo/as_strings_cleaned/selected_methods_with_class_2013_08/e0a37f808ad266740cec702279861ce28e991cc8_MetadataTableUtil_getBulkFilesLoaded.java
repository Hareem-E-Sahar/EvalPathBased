map SimpleName SimpleType ParameterizedType SimpleType SimpleName file ref
map SimpleName SimpleType ParameterizedType SimpleType SimpleName long
file ref SimpleName SimpleType ParameterizedType SimpleType SimpleName long
credentials SimpleName SimpleType SingleVariableDeclaration SimpleName credentials
key extent SimpleName SimpleType SingleVariableDeclaration SimpleName extent
extent SimpleName MethodInvocation SimpleName get metadata entry
metadata row SimpleName VariableDeclarationFragment MethodInvocation SimpleName extent
metadata row SimpleName VariableDeclarationFragment MethodInvocation SimpleName get metadata entry
text SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName metadata row
map SimpleName SimpleType ParameterizedType SimpleType SimpleName file ref
map SimpleName SimpleType ParameterizedType SimpleType SimpleName long
file ref SimpleName SimpleType ParameterizedType SimpleType SimpleName long
hash map SimpleName SimpleType ParameterizedType SimpleType SimpleName file ref
hash map SimpleName SimpleType ParameterizedType SimpleType SimpleName long
file ref SimpleName SimpleType ParameterizedType SimpleType SimpleName long
volume manager impl SimpleName MethodInvocation SimpleName get
fs SimpleName VariableDeclarationFragment MethodInvocation SimpleName volume manager impl
fs SimpleName VariableDeclarationFragment MethodInvocation SimpleName get
volume manager SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName fs
hdfs zoo instance SimpleName MethodInvocation SimpleName get instance
extent SimpleName MethodInvocation SimpleName is meta
extent SimpleName MethodInvocation ConditionalExpression QualifiedName root tableid
is meta SimpleName MethodInvocation ConditionalExpression QualifiedName root tableid
extent SimpleName MethodInvocation ConditionalExpression QualifiedName metadata tableid
is meta SimpleName MethodInvocation ConditionalExpression QualifiedName metadata tableid
root tableid QualifiedName ConditionalExpression QualifiedName metadata tableid
scanner impl SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName hdfs zoo instance
scanner impl SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get instance
scanner impl SimpleName SimpleType ClassInstanceCreation SimpleName credentials
scanner impl SimpleName SimpleType ClassInstanceCreation ConditionalExpression QualifiedName root tableid
scanner impl SimpleName SimpleType ClassInstanceCreation ConditionalExpression QualifiedName metadata tableid
scanner impl SimpleName SimpleType ClassInstanceCreation QualifiedName authorizationsempty
hdfs zoo instance SimpleName MethodInvocation ClassInstanceCreation SimpleName credentials
get instance SimpleName MethodInvocation ClassInstanceCreation SimpleName credentials
hdfs zoo instance SimpleName MethodInvocation ClassInstanceCreation ConditionalExpression QualifiedName root tableid
hdfs zoo instance SimpleName MethodInvocation ClassInstanceCreation ConditionalExpression QualifiedName metadata tableid
get instance SimpleName MethodInvocation ClassInstanceCreation ConditionalExpression QualifiedName root tableid
get instance SimpleName MethodInvocation ClassInstanceCreation ConditionalExpression QualifiedName metadata tableid
hdfs zoo instance SimpleName MethodInvocation ClassInstanceCreation QualifiedName authorizationsempty
get instance SimpleName MethodInvocation ClassInstanceCreation QualifiedName authorizationsempty
credentials SimpleName ClassInstanceCreation ConditionalExpression MethodInvocation SimpleName extent
credentials SimpleName ClassInstanceCreation ConditionalExpression MethodInvocation SimpleName is meta
credentials SimpleName ClassInstanceCreation ConditionalExpression QualifiedName root tableid
credentials SimpleName ClassInstanceCreation ConditionalExpression QualifiedName metadata tableid
credentials SimpleName ClassInstanceCreation QualifiedName authorizationsempty
extent SimpleName MethodInvocation ConditionalExpression ClassInstanceCreation QualifiedName authorizationsempty
is meta SimpleName MethodInvocation ConditionalExpression ClassInstanceCreation QualifiedName authorizationsempty
root tableid QualifiedName ConditionalExpression ClassInstanceCreation QualifiedName authorizationsempty
metadata tableid QualifiedName ConditionalExpression ClassInstanceCreation QualifiedName authorizationsempty
scanner SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName scanner impl
scanner SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName hdfs zoo instance
scanner SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName get instance
scanner SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName credentials
scanner SimpleName VariableDeclarationFragment ClassInstanceCreation ConditionalExpression QualifiedName root tableid
scanner SimpleName VariableDeclarationFragment ClassInstanceCreation ConditionalExpression QualifiedName metadata tableid
scanner SimpleName VariableDeclarationFragment ClassInstanceCreation QualifiedName authorizationsempty
scanner SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName scanner
range SimpleName SimpleType ClassInstanceCreation SimpleName metadata row
scanner SimpleName MethodInvocation SimpleName set range
scanner SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName range
scanner SimpleName MethodInvocation ClassInstanceCreation SimpleName metadata row
set range SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName range
set range SimpleName MethodInvocation ClassInstanceCreation SimpleName metadata row
scanner SimpleName MethodInvocation SimpleName fetch column family
scanner SimpleName MethodInvocation QualifiedName tablets sectionbulk file column familyname
fetch column family SimpleName MethodInvocation QualifiedName tablets sectionbulk file column familyname
entry SimpleName SimpleType ParameterizedType SimpleType SimpleName key
entry SimpleName SimpleType ParameterizedType SimpleType SimpleName value
key SimpleName SimpleType ParameterizedType SimpleType SimpleName value
entry SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName entry
key SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName entry
value SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName entry
entry SimpleName MethodInvocation SimpleName get value
entry SimpleName MethodInvocation MethodInvocation SimpleName to string
get value SimpleName MethodInvocation MethodInvocation SimpleName to string
long SimpleName MethodInvocation SimpleName parse long
long SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName entry
long SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get value
long SimpleName MethodInvocation MethodInvocation SimpleName to string
parse long SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName entry
parse long SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get value
parse long SimpleName MethodInvocation MethodInvocation SimpleName to string
tid SimpleName VariableDeclarationFragment MethodInvocation SimpleName long
tid SimpleName VariableDeclarationFragment MethodInvocation SimpleName parse long
tid SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName to string
long SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName tid
entry SimpleName MethodInvocation SimpleName get key
file ref SimpleName SimpleType ClassInstanceCreation SimpleName fs
file ref SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName entry
file ref SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get key
fs SimpleName ClassInstanceCreation MethodInvocation SimpleName entry
fs SimpleName ClassInstanceCreation MethodInvocation SimpleName get key
ret SimpleName MethodInvocation SimpleName put
ret SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName file ref
ret SimpleName MethodInvocation ClassInstanceCreation SimpleName fs
ret SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName entry
ret SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get key
ret SimpleName MethodInvocation SimpleName tid
put SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName file ref
put SimpleName MethodInvocation ClassInstanceCreation SimpleName fs
put SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName entry
put SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get key
put SimpleName MethodInvocation SimpleName tid
file ref SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName tid
fs SimpleName ClassInstanceCreation MethodInvocation SimpleName tid
entry SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName tid
get key SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName tid
entry SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName scanner
scanner SimpleName EnhancedForStatement Block ReturnStatement SimpleName ret
public Modifier MethodDeclaration Modifier static
public Modifier MethodDeclaration ParameterizedType SimpleType SimpleName map
public Modifier MethodDeclaration ParameterizedType SimpleType SimpleName file ref
public Modifier MethodDeclaration ParameterizedType SimpleType SimpleName long
public Modifier MethodDeclaration SimpleName get bulk files loaded
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName credentials
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName credentials
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName key extent
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName extent
static Modifier MethodDeclaration ParameterizedType SimpleType SimpleName map
static Modifier MethodDeclaration ParameterizedType SimpleType SimpleName file ref
static Modifier MethodDeclaration ParameterizedType SimpleType SimpleName long
static Modifier MethodDeclaration SimpleName get bulk files loaded
static Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName credentials
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName credentials
static Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName key extent
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName extent
static Modifier MethodDeclaration SimpleType SimpleName io exception
map SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName get bulk files loaded
file ref SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName get bulk files loaded
long SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName get bulk files loaded
get bulk files loaded SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName credentials
get bulk files loaded SimpleName MethodDeclaration SingleVariableDeclaration SimpleName credentials
get bulk files loaded SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName key extent
get bulk files loaded SimpleName MethodDeclaration SingleVariableDeclaration SimpleName extent
get bulk files loaded SimpleName MethodDeclaration SimpleType SimpleName io exception
get bulk files loaded SimpleName MethodDeclaration Block EnhancedForStatement SimpleName scanner
get bulk files loaded SimpleName MethodDeclaration Block ReturnStatement SimpleName ret
credentials SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName extent
credentials SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
extent SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration Modifier static
public Modifier TypeDeclaration MethodDeclaration SimpleName get bulk files loaded
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName credentials
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName extent
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration Modifier static
test SimpleName TypeDeclaration MethodDeclaration SimpleName get bulk files loaded
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName credentials
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName extent
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
