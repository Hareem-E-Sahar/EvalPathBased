empty NumberLiteral InfixExpression NumberLiteral empty
empty NumberLiteral InfixExpression NumberLiteral empty
empty NumberLiteral InfixExpression NumberLiteral empty
timeout SimpleName MemberValuePair InfixExpression NumberLiteral empty
timeout SimpleName MemberValuePair InfixExpression NumberLiteral empty
timeout SimpleName MemberValuePair InfixExpression NumberLiteral empty
test SimpleName NormalAnnotation MemberValuePair SimpleName timeout
test SimpleName NormalAnnotation MemberValuePair InfixExpression NumberLiteral empty
test SimpleName NormalAnnotation MemberValuePair InfixExpression NumberLiteral empty
test SimpleName NormalAnnotation MemberValuePair InfixExpression NumberLiteral empty
sorted set SimpleName SimpleType ParameterizedType SimpleType SimpleName text
tree set SimpleName SimpleType ParameterizedType SimpleType SimpleName text
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression NumberLiteral empty
i SimpleName InfixExpression NumberLiteral empty
string SimpleName MethodInvocation SimpleName format
string SimpleName MethodInvocation StringLiteral % x
string SimpleName MethodInvocation InfixExpression SimpleName i
string SimpleName MethodInvocation InfixExpression NumberLiteral empty
format SimpleName MethodInvocation StringLiteral % x
format SimpleName MethodInvocation InfixExpression SimpleName i
format SimpleName MethodInvocation InfixExpression NumberLiteral empty
% x StringLiteral MethodInvocation InfixExpression SimpleName i
% x StringLiteral MethodInvocation InfixExpression NumberLiteral empty
text SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName string
text SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName format
text SimpleName SimpleType ClassInstanceCreation MethodInvocation StringLiteral % x
splits SimpleName MethodInvocation SimpleName add
splits SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName text
splits SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName string
splits SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName format
splits SimpleName MethodInvocation ClassInstanceCreation MethodInvocation StringLiteral % x
add SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName text
add SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName string
add SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName format
add SimpleName MethodInvocation ClassInstanceCreation MethodInvocation StringLiteral % x
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression NumberLiteral empty
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
empty NumberLiteral InfixExpression ForStatement PostfixExpression SimpleName i
text SimpleName SimpleType ClassInstanceCreation StringLiteral cf
cf SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName text
cf SimpleName VariableDeclarationFragment ClassInstanceCreation StringLiteral cf
text SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName cf
text SimpleName SimpleType ClassInstanceCreation StringLiteral cq
cq SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName text
cq SimpleName VariableDeclarationFragment ClassInstanceCreation StringLiteral cq
text SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName cq
get table names SimpleName MethodInvocation NumberLiteral empty
table names SimpleName VariableDeclarationFragment MethodInvocation SimpleName get table names
table names SimpleName VariableDeclarationFragment MethodInvocation NumberLiteral empty
table names SimpleName ArrayAccess NumberLiteral empty
table name SimpleName VariableDeclarationFragment ArrayAccess SimpleName table names
table name SimpleName VariableDeclarationFragment ArrayAccess NumberLiteral empty
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table name
get connector SimpleName MethodInvocation MethodInvocation SimpleName table operations
get connector SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName create
table operations SimpleName MethodInvocation MethodInvocation SimpleName create
get connector SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName table name
table operations SimpleName MethodInvocation MethodInvocation SimpleName table name
create SimpleName MethodInvocation SimpleName table name
get connector SimpleName MethodInvocation MethodInvocation SimpleName table operations
get connector SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName add splits
table operations SimpleName MethodInvocation MethodInvocation SimpleName add splits
get connector SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName table name
table operations SimpleName MethodInvocation MethodInvocation SimpleName table name
get connector SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName splits
table operations SimpleName MethodInvocation MethodInvocation SimpleName splits
add splits SimpleName MethodInvocation SimpleName table name
add splits SimpleName MethodInvocation SimpleName splits
table name SimpleName MethodInvocation SimpleName splits
get connector SimpleName MethodInvocation MethodInvocation SimpleName create batch writer
get connector SimpleName MethodInvocation MethodInvocation SimpleName table name
create batch writer SimpleName MethodInvocation SimpleName table name
create batch writer SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName batch writer config
table name SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName batch writer config
bw SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get connector
bw SimpleName VariableDeclarationFragment MethodInvocation SimpleName create batch writer
bw SimpleName VariableDeclarationFragment MethodInvocation SimpleName table name
batch writer SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName bw
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression NumberLiteral empty
i SimpleName InfixExpression NumberLiteral empty
i SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
empty NumberLiteral InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
string SimpleName MethodInvocation SimpleName format
string SimpleName MethodInvocation StringLiteral % x
string SimpleName MethodInvocation InfixExpression NumberLiteral empty
format SimpleName MethodInvocation StringLiteral % x
format SimpleName MethodInvocation InfixExpression NumberLiteral empty
% x StringLiteral MethodInvocation InfixExpression NumberLiteral empty
text SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName string
text SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName format
text SimpleName SimpleType ClassInstanceCreation MethodInvocation StringLiteral % x
m SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName mutation
mutation SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName m
empty StringLiteral InfixExpression SimpleName i
empty StringLiteral InfixExpression ParenthesizedExpression MethodInvocation SimpleName get bytes
i SimpleName InfixExpression ParenthesizedExpression MethodInvocation SimpleName get bytes
value SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get bytes
m SimpleName MethodInvocation SimpleName put
m SimpleName MethodInvocation SimpleName cf
m SimpleName MethodInvocation SimpleName cq
m SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName value
m SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get bytes
put SimpleName MethodInvocation SimpleName cf
put SimpleName MethodInvocation SimpleName cq
put SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName value
put SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get bytes
cf SimpleName MethodInvocation SimpleName cq
cf SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName value
cf SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get bytes
cq SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName value
cq SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get bytes
bw SimpleName MethodInvocation SimpleName add mutation
bw SimpleName MethodInvocation SimpleName m
add mutation SimpleName MethodInvocation SimpleName m
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression NumberLiteral empty
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
empty NumberLiteral InfixExpression ForStatement PostfixExpression SimpleName i
bw SimpleName MethodInvocation SimpleName close
get connector SimpleName MethodInvocation MethodInvocation SimpleName create scanner
get connector SimpleName MethodInvocation MethodInvocation SimpleName table name
get connector SimpleName MethodInvocation MethodInvocation QualifiedName authorizationsempty
create scanner SimpleName MethodInvocation SimpleName table name
create scanner SimpleName MethodInvocation QualifiedName authorizationsempty
table name SimpleName MethodInvocation QualifiedName authorizationsempty
scanner SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get connector
scanner SimpleName VariableDeclarationFragment MethodInvocation SimpleName create scanner
scanner SimpleName VariableDeclarationFragment MethodInvocation SimpleName table name
scanner SimpleName VariableDeclarationFragment MethodInvocation QualifiedName authorizationsempty
scanner SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName scanner
ei SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName ei
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment NumberLiteral empty
entry SimpleName SimpleType ParameterizedType SimpleType SimpleName key
entry SimpleName SimpleType ParameterizedType SimpleType SimpleName value
key SimpleName SimpleType ParameterizedType SimpleType SimpleName value
entry SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName entry
key SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName entry
value SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName entry
entry SimpleName MethodInvocation SimpleName get key
entry SimpleName MethodInvocation MethodInvocation SimpleName get row
get key SimpleName MethodInvocation MethodInvocation SimpleName get row
entry SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to string
get key SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to string
get row SimpleName MethodInvocation MethodInvocation SimpleName to string
ei SimpleName InfixExpression NumberLiteral empty
ei SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
empty NumberLiteral InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
string SimpleName MethodInvocation SimpleName format
string SimpleName MethodInvocation StringLiteral % x
string SimpleName MethodInvocation InfixExpression NumberLiteral empty
format SimpleName MethodInvocation StringLiteral % x
format SimpleName MethodInvocation InfixExpression NumberLiteral empty
% x StringLiteral MethodInvocation InfixExpression NumberLiteral empty
get row SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName equals
to string SimpleName MethodInvocation MethodInvocation SimpleName equals
to string SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName string
to string SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName format
to string SimpleName MethodInvocation MethodInvocation MethodInvocation StringLiteral % x
equals SimpleName MethodInvocation MethodInvocation SimpleName string
equals SimpleName MethodInvocation MethodInvocation SimpleName format
equals SimpleName MethodInvocation MethodInvocation StringLiteral % x
equals SimpleName MethodInvocation MethodInvocation InfixExpression NumberLiteral empty
ei SimpleName InfixExpression NumberLiteral empty
ei SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
empty NumberLiteral InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
string SimpleName MethodInvocation SimpleName format
string SimpleName MethodInvocation StringLiteral % x
string SimpleName MethodInvocation InfixExpression NumberLiteral empty
format SimpleName MethodInvocation StringLiteral % x
format SimpleName MethodInvocation InfixExpression NumberLiteral empty
% x StringLiteral MethodInvocation InfixExpression NumberLiteral empty
entry SimpleName MethodInvocation SimpleName get key
entry SimpleName MethodInvocation MethodInvocation SimpleName get row
get key SimpleName MethodInvocation MethodInvocation SimpleName get row
expected row StringLiteral InfixExpression MethodInvocation SimpleName string
expected row StringLiteral InfixExpression MethodInvocation SimpleName format
expected row StringLiteral InfixExpression MethodInvocation StringLiteral % x
expected row StringLiteral InfixExpression MethodInvocation InfixExpression NumberLiteral empty
expected row StringLiteral InfixExpression StringLiteral saw
expected row StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName entry
expected row StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName get key
expected row StringLiteral InfixExpression MethodInvocation SimpleName get row
string SimpleName MethodInvocation InfixExpression StringLiteral saw
format SimpleName MethodInvocation InfixExpression StringLiteral saw
% x StringLiteral MethodInvocation InfixExpression StringLiteral saw
empty NumberLiteral InfixExpression MethodInvocation InfixExpression StringLiteral saw
string SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get row
format SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get row
% x StringLiteral MethodInvocation InfixExpression MethodInvocation SimpleName get row
saw StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName entry
saw StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName get key
saw StringLiteral InfixExpression MethodInvocation SimpleName get row
exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral expected row
exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral saw
entry SimpleName MethodInvocation SimpleName get value
entry SimpleName MethodInvocation MethodInvocation SimpleName to string
get value SimpleName MethodInvocation MethodInvocation SimpleName to string
empty StringLiteral InfixExpression SimpleName ei
entry SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName equals
get value SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName equals
to string SimpleName MethodInvocation MethodInvocation SimpleName equals
to string SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral empty
to string SimpleName MethodInvocation MethodInvocation InfixExpression SimpleName ei
equals SimpleName MethodInvocation InfixExpression StringLiteral empty
equals SimpleName MethodInvocation InfixExpression SimpleName ei
entry SimpleName MethodInvocation SimpleName get value
expected value StringLiteral InfixExpression SimpleName ei
expected value StringLiteral InfixExpression StringLiteral saw
expected value StringLiteral InfixExpression MethodInvocation SimpleName entry
expected value StringLiteral InfixExpression MethodInvocation SimpleName get value
ei SimpleName InfixExpression StringLiteral saw
ei SimpleName InfixExpression MethodInvocation SimpleName entry
ei SimpleName InfixExpression MethodInvocation SimpleName get value
saw StringLiteral InfixExpression MethodInvocation SimpleName entry
saw StringLiteral InfixExpression MethodInvocation SimpleName get value
exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral expected value
exception SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName ei
exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral saw
entry SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName scanner
ei SimpleName InfixExpression NumberLiteral empty
did not see expected number of rows ei = StringLiteral InfixExpression SimpleName ei
exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral did not see expected number of rows ei =
exception SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName ei
table names SimpleName ArrayAccess NumberLiteral empty
table SimpleName VariableDeclarationFragment ArrayAccess SimpleName table names
table SimpleName VariableDeclarationFragment ArrayAccess NumberLiteral empty
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table
get connector SimpleName MethodInvocation MethodInvocation SimpleName table operations
get connector SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName create
table operations SimpleName MethodInvocation MethodInvocation SimpleName create
get connector SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName table
table operations SimpleName MethodInvocation MethodInvocation SimpleName table
create SimpleName MethodInvocation SimpleName table
get connector SimpleName MethodInvocation MethodInvocation SimpleName table operations
get connector SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName add splits
table operations SimpleName MethodInvocation MethodInvocation SimpleName add splits
get connector SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName table
table operations SimpleName MethodInvocation MethodInvocation SimpleName table
get connector SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName splits
table operations SimpleName MethodInvocation MethodInvocation SimpleName splits
add splits SimpleName MethodInvocation SimpleName table
add splits SimpleName MethodInvocation SimpleName splits
table SimpleName MethodInvocation SimpleName splits
get connector SimpleName MethodInvocation MethodInvocation SimpleName create scanner
get connector SimpleName MethodInvocation MethodInvocation SimpleName table
get connector SimpleName MethodInvocation MethodInvocation QualifiedName authorizationsempty
create scanner SimpleName MethodInvocation SimpleName table
create scanner SimpleName MethodInvocation QualifiedName authorizationsempty
table SimpleName MethodInvocation QualifiedName authorizationsempty
scanner SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get connector
scanner SimpleName VariableDeclarationFragment MethodInvocation SimpleName create scanner
scanner SimpleName VariableDeclarationFragment MethodInvocation SimpleName table
scanner SimpleName VariableDeclarationFragment MethodInvocation QualifiedName authorizationsempty
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
entry SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName scanner
count SimpleName InfixExpression NumberLiteral empty
did not see expected number of entries count = StringLiteral InfixExpression SimpleName count
exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral did not see expected number of entries count =
exception SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName count
array list SimpleName SimpleType ParameterizedType SimpleType SimpleName range
array list SimpleName SimpleType ParameterizedType SimpleType SimpleName range
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression NumberLiteral empty
i SimpleName InfixExpression NumberLiteral empty
i SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
empty NumberLiteral InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
string SimpleName MethodInvocation SimpleName format
string SimpleName MethodInvocation StringLiteral % x
string SimpleName MethodInvocation InfixExpression NumberLiteral empty
format SimpleName MethodInvocation StringLiteral % x
format SimpleName MethodInvocation InfixExpression NumberLiteral empty
% x StringLiteral MethodInvocation InfixExpression NumberLiteral empty
text SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName string
text SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName format
text SimpleName SimpleType ClassInstanceCreation MethodInvocation StringLiteral % x
ranges SimpleName MethodInvocation SimpleName add
ranges SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName range
add SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName range
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression NumberLiteral empty
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
empty NumberLiteral InfixExpression ForStatement PostfixExpression SimpleName i
table names SimpleName ArrayAccess NumberLiteral empty
table SimpleName VariableDeclarationFragment ArrayAccess SimpleName table names
table SimpleName VariableDeclarationFragment ArrayAccess NumberLiteral empty
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table
get connector SimpleName MethodInvocation MethodInvocation SimpleName table operations
get connector SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName create
table operations SimpleName MethodInvocation MethodInvocation SimpleName create
get connector SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName table
table operations SimpleName MethodInvocation MethodInvocation SimpleName table
create SimpleName MethodInvocation SimpleName table
get connector SimpleName MethodInvocation MethodInvocation SimpleName table operations
get connector SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName add splits
table operations SimpleName MethodInvocation MethodInvocation SimpleName add splits
get connector SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName table
table operations SimpleName MethodInvocation MethodInvocation SimpleName table
get connector SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName splits
table operations SimpleName MethodInvocation MethodInvocation SimpleName splits
add splits SimpleName MethodInvocation SimpleName table
add splits SimpleName MethodInvocation SimpleName splits
table SimpleName MethodInvocation SimpleName splits
get connector SimpleName MethodInvocation MethodInvocation SimpleName create batch scanner
get connector SimpleName MethodInvocation MethodInvocation SimpleName table
get connector SimpleName MethodInvocation MethodInvocation QualifiedName authorizationsempty
get connector SimpleName MethodInvocation MethodInvocation NumberLiteral empty
create batch scanner SimpleName MethodInvocation SimpleName table
create batch scanner SimpleName MethodInvocation QualifiedName authorizationsempty
create batch scanner SimpleName MethodInvocation NumberLiteral empty
table SimpleName MethodInvocation QualifiedName authorizationsempty
table SimpleName MethodInvocation NumberLiteral empty
authorizationsempty QualifiedName MethodInvocation NumberLiteral empty
bs SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get connector
bs SimpleName VariableDeclarationFragment MethodInvocation SimpleName create batch scanner
bs SimpleName VariableDeclarationFragment MethodInvocation SimpleName table
bs SimpleName VariableDeclarationFragment MethodInvocation QualifiedName authorizationsempty
bs SimpleName VariableDeclarationFragment MethodInvocation NumberLiteral empty
batch scanner SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName bs
bs SimpleName MethodInvocation SimpleName set ranges
bs SimpleName MethodInvocation SimpleName ranges
set ranges SimpleName MethodInvocation SimpleName ranges
count SimpleName Assignment NumberLiteral empty
entry SimpleName SimpleType ParameterizedType SimpleType SimpleName key
entry SimpleName SimpleType ParameterizedType SimpleType SimpleName value
key SimpleName SimpleType ParameterizedType SimpleType SimpleName value
entry SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName entry
key SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName entry
value SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName entry
entry SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName bs
count SimpleName InfixExpression NumberLiteral empty
did not see expected number of entries count = StringLiteral InfixExpression SimpleName count
exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral did not see expected number of entries count =
exception SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName count
bs SimpleName MethodInvocation SimpleName close
int PrimitiveType VariableDeclarationStatement Block EnhancedForStatement SimpleName scanner
int PrimitiveType VariableDeclarationStatement Block EnhancedForStatement SimpleName scanner
test SimpleName NormalAnnotation MethodDeclaration Modifier public
timeout SimpleName MemberValuePair NormalAnnotation MethodDeclaration Modifier public
test SimpleName NormalAnnotation MethodDeclaration PrimitiveType void
timeout SimpleName MemberValuePair NormalAnnotation MethodDeclaration PrimitiveType void
test SimpleName NormalAnnotation MethodDeclaration SimpleName run
timeout SimpleName MemberValuePair NormalAnnotation MethodDeclaration SimpleName run
test SimpleName NormalAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName run
public Modifier MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
public Modifier MethodDeclaration Block EnhancedForStatement SimpleName scanner
public Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
public Modifier MethodDeclaration Block EnhancedForStatement SimpleName scanner
public Modifier MethodDeclaration Block EnhancedForStatement SimpleName bs
void PrimitiveType MethodDeclaration SimpleName run
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
void PrimitiveType MethodDeclaration Block EnhancedForStatement SimpleName scanner
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
void PrimitiveType MethodDeclaration Block EnhancedForStatement SimpleName scanner
void PrimitiveType MethodDeclaration Block EnhancedForStatement SimpleName bs
run SimpleName MethodDeclaration SimpleType SimpleName exception
run SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
run SimpleName MethodDeclaration Block EnhancedForStatement SimpleName scanner
run SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
run SimpleName MethodDeclaration Block EnhancedForStatement SimpleName scanner
run SimpleName MethodDeclaration Block EnhancedForStatement SimpleName bs
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration NormalAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName run
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration NormalAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName run
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
