timeout SimpleName MemberValuePair NumberLiteral empty
test SimpleName NormalAnnotation MemberValuePair SimpleName timeout
test SimpleName NormalAnnotation MemberValuePair NumberLiteral empty
accumulo SimpleName MethodInvocation SimpleName get instance name
accumulo SimpleName MethodInvocation SimpleName get zoo keepers
zoo keeper instance SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName accumulo
zoo keeper instance SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get instance name
zoo keeper instance SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName accumulo
zoo keeper instance SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get zoo keepers
accumulo SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName accumulo
accumulo SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get zoo keepers
get instance name SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName accumulo
get instance name SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get zoo keepers
zoo keeper instance SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get connector
accumulo SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get connector
get instance name SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get connector
accumulo SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get connector
get zoo keepers SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get connector
zoo keeper instance SimpleName SimpleType ClassInstanceCreation MethodInvocation StringLiteral root
accumulo SimpleName MethodInvocation ClassInstanceCreation MethodInvocation StringLiteral root
get instance name SimpleName MethodInvocation ClassInstanceCreation MethodInvocation StringLiteral root
accumulo SimpleName MethodInvocation ClassInstanceCreation MethodInvocation StringLiteral root
get zoo keepers SimpleName MethodInvocation ClassInstanceCreation MethodInvocation StringLiteral root
zoo keeper instance SimpleName SimpleType ClassInstanceCreation MethodInvocation StringLiteral super secret
accumulo SimpleName MethodInvocation ClassInstanceCreation MethodInvocation StringLiteral super secret
get instance name SimpleName MethodInvocation ClassInstanceCreation MethodInvocation StringLiteral super secret
accumulo SimpleName MethodInvocation ClassInstanceCreation MethodInvocation StringLiteral super secret
get zoo keepers SimpleName MethodInvocation ClassInstanceCreation MethodInvocation StringLiteral super secret
get connector SimpleName MethodInvocation StringLiteral root
get connector SimpleName MethodInvocation StringLiteral super secret
root StringLiteral MethodInvocation StringLiteral super secret
conn SimpleName VariableDeclarationFragment MethodInvocation SimpleName get connector
conn SimpleName VariableDeclarationFragment MethodInvocation StringLiteral root
conn SimpleName VariableDeclarationFragment MethodInvocation StringLiteral super secret
connector SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName conn
conn SimpleName MethodInvocation SimpleName table operations
conn SimpleName MethodInvocation MethodInvocation SimpleName create
table operations SimpleName MethodInvocation MethodInvocation SimpleName create
conn SimpleName MethodInvocation MethodInvocation StringLiteral table
table operations SimpleName MethodInvocation MethodInvocation StringLiteral table
create SimpleName MethodInvocation StringLiteral table
file SimpleName MethodInvocation SimpleName create temp file
file SimpleName MethodInvocation StringLiteral iterator
file SimpleName MethodInvocation StringLiteral jar
create temp file SimpleName MethodInvocation StringLiteral iterator
create temp file SimpleName MethodInvocation StringLiteral jar
iterator StringLiteral MethodInvocation StringLiteral jar
jar file SimpleName VariableDeclarationFragment MethodInvocation SimpleName file
jar file SimpleName VariableDeclarationFragment MethodInvocation SimpleName create temp file
jar file SimpleName VariableDeclarationFragment MethodInvocation StringLiteral iterator
jar file SimpleName VariableDeclarationFragment MethodInvocation StringLiteral jar
file SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName jar file
get class SimpleName MethodInvocation MethodInvocation SimpleName get resource
get class SimpleName MethodInvocation MethodInvocation StringLiteral foo filterjar
get resource SimpleName MethodInvocation StringLiteral foo filterjar
file utils SimpleName MethodInvocation SimpleName copy url to file
file utils SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get class
file utils SimpleName MethodInvocation MethodInvocation SimpleName get resource
file utils SimpleName MethodInvocation MethodInvocation StringLiteral foo filterjar
file utils SimpleName MethodInvocation SimpleName jar file
copy url to file SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get class
copy url to file SimpleName MethodInvocation MethodInvocation SimpleName get resource
copy url to file SimpleName MethodInvocation MethodInvocation StringLiteral foo filterjar
copy url to file SimpleName MethodInvocation SimpleName jar file
get class SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName jar file
get resource SimpleName MethodInvocation MethodInvocation SimpleName jar file
foo filterjar StringLiteral MethodInvocation MethodInvocation SimpleName jar file
jar file SimpleName MethodInvocation SimpleName delete on exit
conn SimpleName MethodInvocation SimpleName instance operations
propertyvfs context classpath property QualifiedName MethodInvocation SimpleName get key
propertyvfs context classpath property QualifiedName MethodInvocation InfixExpression StringLiteral cx
get key SimpleName MethodInvocation InfixExpression StringLiteral cx
jar file SimpleName MethodInvocation SimpleName to uri
jar file SimpleName MethodInvocation MethodInvocation SimpleName to string
to uri SimpleName MethodInvocation MethodInvocation SimpleName to string
conn SimpleName MethodInvocation MethodInvocation SimpleName set property
instance operations SimpleName MethodInvocation MethodInvocation SimpleName set property
conn SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral cx
instance operations SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral cx
conn SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to string
instance operations SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to string
set property SimpleName MethodInvocation InfixExpression MethodInvocation QualifiedName propertyvfs context classpath property
set property SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get key
set property SimpleName MethodInvocation InfixExpression StringLiteral cx
set property SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName jar file
set property SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to uri
set property SimpleName MethodInvocation MethodInvocation SimpleName to string
cx StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName to string
conn SimpleName MethodInvocation SimpleName table operations
propertytable classpath QualifiedName MethodInvocation SimpleName get key
conn SimpleName MethodInvocation MethodInvocation SimpleName set property
table operations SimpleName MethodInvocation MethodInvocation SimpleName set property
conn SimpleName MethodInvocation MethodInvocation StringLiteral table
table operations SimpleName MethodInvocation MethodInvocation StringLiteral table
conn SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName propertytable classpath
conn SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get key
table operations SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName propertytable classpath
table operations SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get key
conn SimpleName MethodInvocation MethodInvocation StringLiteral cx
table operations SimpleName MethodInvocation MethodInvocation StringLiteral cx
set property SimpleName MethodInvocation StringLiteral table
set property SimpleName MethodInvocation MethodInvocation QualifiedName propertytable classpath
set property SimpleName MethodInvocation MethodInvocation SimpleName get key
set property SimpleName MethodInvocation StringLiteral cx
table StringLiteral MethodInvocation MethodInvocation QualifiedName propertytable classpath
table StringLiteral MethodInvocation MethodInvocation SimpleName get key
table StringLiteral MethodInvocation StringLiteral cx
propertytable classpath QualifiedName MethodInvocation MethodInvocation StringLiteral cx
get key SimpleName MethodInvocation MethodInvocation StringLiteral cx
conn SimpleName MethodInvocation SimpleName table operations
iterator setting SimpleName SimpleType ClassInstanceCreation NumberLiteral empty
iterator setting SimpleName SimpleType ClassInstanceCreation StringLiteral foocensor
iterator setting SimpleName SimpleType ClassInstanceCreation StringLiteral orgapacheaccumulotestfoo filter
empty NumberLiteral ClassInstanceCreation StringLiteral foocensor
empty NumberLiteral ClassInstanceCreation StringLiteral orgapacheaccumulotestfoo filter
foocensor StringLiteral ClassInstanceCreation StringLiteral orgapacheaccumulotestfoo filter
conn SimpleName MethodInvocation MethodInvocation SimpleName attach iterator
table operations SimpleName MethodInvocation MethodInvocation SimpleName attach iterator
conn SimpleName MethodInvocation MethodInvocation StringLiteral table
table operations SimpleName MethodInvocation MethodInvocation StringLiteral table
conn SimpleName MethodInvocation MethodInvocation ClassInstanceCreation NumberLiteral empty
conn SimpleName MethodInvocation MethodInvocation ClassInstanceCreation StringLiteral foocensor
conn SimpleName MethodInvocation MethodInvocation ClassInstanceCreation StringLiteral orgapacheaccumulotestfoo filter
table operations SimpleName MethodInvocation MethodInvocation ClassInstanceCreation NumberLiteral empty
table operations SimpleName MethodInvocation MethodInvocation ClassInstanceCreation StringLiteral foocensor
table operations SimpleName MethodInvocation MethodInvocation ClassInstanceCreation StringLiteral orgapacheaccumulotestfoo filter
attach iterator SimpleName MethodInvocation StringLiteral table
attach iterator SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName iterator setting
attach iterator SimpleName MethodInvocation ClassInstanceCreation NumberLiteral empty
attach iterator SimpleName MethodInvocation ClassInstanceCreation StringLiteral foocensor
attach iterator SimpleName MethodInvocation ClassInstanceCreation StringLiteral orgapacheaccumulotestfoo filter
table StringLiteral MethodInvocation ClassInstanceCreation SimpleType SimpleName iterator setting
table StringLiteral MethodInvocation ClassInstanceCreation NumberLiteral empty
table StringLiteral MethodInvocation ClassInstanceCreation StringLiteral foocensor
table StringLiteral MethodInvocation ClassInstanceCreation StringLiteral orgapacheaccumulotestfoo filter
conn SimpleName MethodInvocation SimpleName create batch writer
conn SimpleName MethodInvocation StringLiteral table
conn SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName batch writer config
create batch writer SimpleName MethodInvocation StringLiteral table
create batch writer SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName batch writer config
table StringLiteral MethodInvocation ClassInstanceCreation SimpleType SimpleName batch writer config
bw SimpleName VariableDeclarationFragment MethodInvocation SimpleName conn
bw SimpleName VariableDeclarationFragment MethodInvocation SimpleName create batch writer
bw SimpleName VariableDeclarationFragment MethodInvocation StringLiteral table
batch writer SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName bw
mutation SimpleName SimpleType ClassInstanceCreation StringLiteral foo
m SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName mutation
m SimpleName VariableDeclarationFragment ClassInstanceCreation StringLiteral foo
mutation SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName m
m SimpleName MethodInvocation SimpleName put
m SimpleName MethodInvocation StringLiteral cf
m SimpleName MethodInvocation StringLiteral cq
m SimpleName MethodInvocation StringLiteral v
put SimpleName MethodInvocation StringLiteral cf
put SimpleName MethodInvocation StringLiteral cq
put SimpleName MethodInvocation StringLiteral v
cf StringLiteral MethodInvocation StringLiteral cq
cf StringLiteral MethodInvocation StringLiteral v
cq StringLiteral MethodInvocation StringLiteral v
m SimpleName MethodInvocation SimpleName put
m SimpleName MethodInvocation StringLiteral cf
m SimpleName MethodInvocation StringLiteral cq
m SimpleName MethodInvocation StringLiteral v
put SimpleName MethodInvocation StringLiteral cf
put SimpleName MethodInvocation StringLiteral cq
put SimpleName MethodInvocation StringLiteral v
cf StringLiteral MethodInvocation StringLiteral cq
cf StringLiteral MethodInvocation StringLiteral v
cq StringLiteral MethodInvocation StringLiteral v
bw SimpleName MethodInvocation SimpleName add mutation
bw SimpleName MethodInvocation SimpleName m
add mutation SimpleName MethodInvocation SimpleName m
mutation SimpleName SimpleType ClassInstanceCreation StringLiteral bar
m SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName mutation
m SimpleName VariableDeclarationFragment ClassInstanceCreation StringLiteral bar
mutation SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName m
m SimpleName MethodInvocation SimpleName put
m SimpleName MethodInvocation StringLiteral cf
m SimpleName MethodInvocation StringLiteral cq
m SimpleName MethodInvocation StringLiteral v
put SimpleName MethodInvocation StringLiteral cf
put SimpleName MethodInvocation StringLiteral cq
put SimpleName MethodInvocation StringLiteral v
cf StringLiteral MethodInvocation StringLiteral cq
cf StringLiteral MethodInvocation StringLiteral v
cq StringLiteral MethodInvocation StringLiteral v
m SimpleName MethodInvocation SimpleName put
m SimpleName MethodInvocation StringLiteral cf
m SimpleName MethodInvocation StringLiteral cq
m SimpleName MethodInvocation StringLiteral v
put SimpleName MethodInvocation StringLiteral cf
put SimpleName MethodInvocation StringLiteral cq
put SimpleName MethodInvocation StringLiteral v
cf StringLiteral MethodInvocation StringLiteral cq
cf StringLiteral MethodInvocation StringLiteral v
cq StringLiteral MethodInvocation StringLiteral v
bw SimpleName MethodInvocation SimpleName add mutation
bw SimpleName MethodInvocation SimpleName m
add mutation SimpleName MethodInvocation SimpleName m
bw SimpleName MethodInvocation SimpleName close
conn SimpleName MethodInvocation SimpleName create scanner
conn SimpleName MethodInvocation StringLiteral table
conn SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName authorizations
create scanner SimpleName MethodInvocation StringLiteral table
create scanner SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName authorizations
table StringLiteral MethodInvocation ClassInstanceCreation SimpleType SimpleName authorizations
scanner SimpleName VariableDeclarationFragment MethodInvocation SimpleName conn
scanner SimpleName VariableDeclarationFragment MethodInvocation SimpleName create scanner
scanner SimpleName VariableDeclarationFragment MethodInvocation StringLiteral table
scanner SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName scanner
count SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName count
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment NumberLiteral empty
entry SimpleName SimpleType ParameterizedType SimpleType SimpleName key
entry SimpleName SimpleType ParameterizedType SimpleType SimpleName value
key SimpleName SimpleType ParameterizedType SimpleType SimpleName value
entry SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName entry
key SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName entry
value SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName entry
entry SimpleName MethodInvocation SimpleName get key
entry SimpleName MethodInvocation MethodInvocation SimpleName get row data
get key SimpleName MethodInvocation MethodInvocation SimpleName get row data
entry SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to string
get key SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to string
get row data SimpleName MethodInvocation MethodInvocation SimpleName to string
get row data SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to lower case
to string SimpleName MethodInvocation MethodInvocation SimpleName to lower case
to string SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName contains
to lower case SimpleName MethodInvocation MethodInvocation SimpleName contains
to string SimpleName MethodInvocation MethodInvocation MethodInvocation StringLiteral foo
to lower case SimpleName MethodInvocation MethodInvocation StringLiteral foo
contains SimpleName MethodInvocation StringLiteral foo
assert SimpleName MethodInvocation SimpleName assert false
assert SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to lower case
assert SimpleName MethodInvocation MethodInvocation SimpleName contains
assert SimpleName MethodInvocation MethodInvocation StringLiteral foo
assert false SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to lower case
assert false SimpleName MethodInvocation MethodInvocation SimpleName contains
assert false SimpleName MethodInvocation MethodInvocation StringLiteral foo
entry SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName scanner
assert SimpleName MethodInvocation SimpleName assert equals
assert SimpleName MethodInvocation NumberLiteral empty
assert SimpleName MethodInvocation SimpleName count
assert equals SimpleName MethodInvocation NumberLiteral empty
assert equals SimpleName MethodInvocation SimpleName count
empty NumberLiteral MethodInvocation SimpleName count
conn SimpleName MethodInvocation SimpleName instance operations
propertyvfs context classpath property QualifiedName MethodInvocation SimpleName get key
propertyvfs context classpath property QualifiedName MethodInvocation InfixExpression StringLiteral cx
get key SimpleName MethodInvocation InfixExpression StringLiteral cx
conn SimpleName MethodInvocation MethodInvocation SimpleName remove property
instance operations SimpleName MethodInvocation MethodInvocation SimpleName remove property
conn SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral cx
instance operations SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral cx
remove property SimpleName MethodInvocation InfixExpression MethodInvocation QualifiedName propertyvfs context classpath property
remove property SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get key
remove property SimpleName MethodInvocation InfixExpression StringLiteral cx
conn SimpleName MethodInvocation SimpleName table operations
conn SimpleName MethodInvocation MethodInvocation SimpleName delete
table operations SimpleName MethodInvocation MethodInvocation SimpleName delete
conn SimpleName MethodInvocation MethodInvocation StringLiteral table
table operations SimpleName MethodInvocation MethodInvocation StringLiteral table
delete SimpleName MethodInvocation StringLiteral table
int PrimitiveType VariableDeclarationStatement Block EnhancedForStatement SimpleName scanner
test SimpleName NormalAnnotation MethodDeclaration Modifier public
timeout SimpleName MemberValuePair NormalAnnotation MethodDeclaration Modifier public
empty NumberLiteral MemberValuePair NormalAnnotation MethodDeclaration Modifier public
test SimpleName NormalAnnotation MethodDeclaration PrimitiveType void
timeout SimpleName MemberValuePair NormalAnnotation MethodDeclaration PrimitiveType void
empty NumberLiteral MemberValuePair NormalAnnotation MethodDeclaration PrimitiveType void
test SimpleName NormalAnnotation MethodDeclaration SimpleName test per table classpath
timeout SimpleName MemberValuePair NormalAnnotation MethodDeclaration SimpleName test per table classpath
empty NumberLiteral MemberValuePair NormalAnnotation MethodDeclaration SimpleName test per table classpath
test SimpleName NormalAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test per table classpath
public Modifier MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
public Modifier MethodDeclaration Block EnhancedForStatement SimpleName scanner
void PrimitiveType MethodDeclaration SimpleName test per table classpath
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
void PrimitiveType MethodDeclaration Block EnhancedForStatement SimpleName scanner
test per table classpath SimpleName MethodDeclaration SimpleType SimpleName exception
test per table classpath SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
test per table classpath SimpleName MethodDeclaration Block EnhancedForStatement SimpleName scanner
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration NormalAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test per table classpath
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration NormalAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test per table classpath
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception