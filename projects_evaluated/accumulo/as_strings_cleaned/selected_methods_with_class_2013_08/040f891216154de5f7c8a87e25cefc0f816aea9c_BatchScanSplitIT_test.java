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
c SimpleName VariableDeclarationFragment MethodInvocation SimpleName get connector
connector SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName c
table name SimpleName VariableDeclarationFragment MethodInvocation SimpleName make table name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table name
c SimpleName MethodInvocation SimpleName table operations
c SimpleName MethodInvocation MethodInvocation SimpleName create
table operations SimpleName MethodInvocation MethodInvocation SimpleName create
c SimpleName MethodInvocation MethodInvocation SimpleName table name
table operations SimpleName MethodInvocation MethodInvocation SimpleName table name
create SimpleName MethodInvocation SimpleName table name
empty NumberLiteral InfixExpression NumberLiteral empty
num rows SimpleName VariableDeclarationFragment InfixExpression NumberLiteral empty
num rows SimpleName VariableDeclarationFragment InfixExpression NumberLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName num rows
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment InfixExpression NumberLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment InfixExpression NumberLiteral empty
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
i SimpleName InfixExpression SimpleName num rows
string SimpleName MethodInvocation SimpleName format
string SimpleName MethodInvocation StringLiteral % x
string SimpleName MethodInvocation SimpleName i
format SimpleName MethodInvocation StringLiteral % x
format SimpleName MethodInvocation SimpleName i
% x StringLiteral MethodInvocation SimpleName i
text SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName string
text SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName format
text SimpleName SimpleType ClassInstanceCreation MethodInvocation StringLiteral % x
text SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName i
m SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName mutation
mutation SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName m
text SimpleName SimpleType ClassInstanceCreation StringLiteral cf
text SimpleName SimpleType ClassInstanceCreation StringLiteral cq
num rows SimpleName InfixExpression SimpleName i
string SimpleName MethodInvocation SimpleName format
string SimpleName MethodInvocation StringLiteral % x
string SimpleName MethodInvocation InfixExpression SimpleName num rows
string SimpleName MethodInvocation InfixExpression SimpleName i
format SimpleName MethodInvocation StringLiteral % x
format SimpleName MethodInvocation InfixExpression SimpleName num rows
format SimpleName MethodInvocation InfixExpression SimpleName i
% x StringLiteral MethodInvocation InfixExpression SimpleName num rows
% x StringLiteral MethodInvocation InfixExpression SimpleName i
string SimpleName MethodInvocation MethodInvocation SimpleName get bytes
format SimpleName MethodInvocation MethodInvocation SimpleName get bytes
% x StringLiteral MethodInvocation MethodInvocation SimpleName get bytes
num rows SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName get bytes
i SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName get bytes
value SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get bytes
m SimpleName MethodInvocation SimpleName put
m SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName text
m SimpleName MethodInvocation ClassInstanceCreation StringLiteral cf
m SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName text
m SimpleName MethodInvocation ClassInstanceCreation StringLiteral cq
m SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName value
m SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get bytes
put SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName text
put SimpleName MethodInvocation ClassInstanceCreation StringLiteral cf
put SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName text
put SimpleName MethodInvocation ClassInstanceCreation StringLiteral cq
put SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName value
put SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get bytes
cf StringLiteral ClassInstanceCreation MethodInvocation ClassInstanceCreation StringLiteral cq
bw SimpleName MethodInvocation SimpleName add mutation
bw SimpleName MethodInvocation SimpleName m
add mutation SimpleName MethodInvocation SimpleName m
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName num rows
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
num rows SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
bw SimpleName MethodInvocation SimpleName close
get connector SimpleName MethodInvocation MethodInvocation SimpleName table operations
get connector SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName flush
table operations SimpleName MethodInvocation MethodInvocation SimpleName flush
get connector SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName table name
table operations SimpleName MethodInvocation MethodInvocation SimpleName table name
get connector SimpleName MethodInvocation MethodInvocation MethodInvocation BooleanLiteral true
table operations SimpleName MethodInvocation MethodInvocation BooleanLiteral true
flush SimpleName MethodInvocation SimpleName table name
flush SimpleName MethodInvocation BooleanLiteral true
table name SimpleName MethodInvocation BooleanLiteral true
get connector SimpleName MethodInvocation MethodInvocation SimpleName table operations
propertytable split threshold QualifiedName MethodInvocation SimpleName get key
get connector SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName set property
table operations SimpleName MethodInvocation MethodInvocation SimpleName set property
get connector SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName table name
table operations SimpleName MethodInvocation MethodInvocation SimpleName table name
table operations SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName propertytable split threshold
table operations SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get key
get connector SimpleName MethodInvocation MethodInvocation MethodInvocation StringLiteral k
table operations SimpleName MethodInvocation MethodInvocation StringLiteral k
set property SimpleName MethodInvocation SimpleName table name
set property SimpleName MethodInvocation MethodInvocation QualifiedName propertytable split threshold
set property SimpleName MethodInvocation MethodInvocation SimpleName get key
set property SimpleName MethodInvocation StringLiteral k
table name SimpleName MethodInvocation MethodInvocation QualifiedName propertytable split threshold
table name SimpleName MethodInvocation MethodInvocation SimpleName get key
table name SimpleName MethodInvocation StringLiteral k
propertytable split threshold QualifiedName MethodInvocation MethodInvocation StringLiteral k
get key SimpleName MethodInvocation MethodInvocation StringLiteral k
collection SimpleName SimpleType ParameterizedType SimpleType SimpleName text
get connector SimpleName MethodInvocation MethodInvocation SimpleName table operations
get connector SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName list splits
table operations SimpleName MethodInvocation MethodInvocation SimpleName list splits
get connector SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName table name
table operations SimpleName MethodInvocation MethodInvocation SimpleName table name
list splits SimpleName MethodInvocation SimpleName table name
splits SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName table operations
splits SimpleName VariableDeclarationFragment MethodInvocation SimpleName list splits
splits SimpleName VariableDeclarationFragment MethodInvocation SimpleName table name
splits SimpleName MethodInvocation SimpleName size
splits SimpleName MethodInvocation InfixExpression NumberLiteral empty
size SimpleName MethodInvocation InfixExpression NumberLiteral empty
util wait thread SimpleName MethodInvocation SimpleName sleep
util wait thread SimpleName MethodInvocation NumberLiteral empty
sleep SimpleName MethodInvocation NumberLiteral empty
get connector SimpleName MethodInvocation MethodInvocation SimpleName table operations
get connector SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName list splits
table operations SimpleName MethodInvocation MethodInvocation SimpleName list splits
get connector SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName table name
table operations SimpleName MethodInvocation MethodInvocation SimpleName table name
list splits SimpleName MethodInvocation SimpleName table name
splits SimpleName Assignment MethodInvocation MethodInvocation SimpleName table operations
splits SimpleName Assignment MethodInvocation SimpleName list splits
splits SimpleName Assignment MethodInvocation SimpleName table name
splits : StringLiteral InfixExpression SimpleName splits
systemout QualifiedName MethodInvocation SimpleName println
systemout QualifiedName MethodInvocation InfixExpression StringLiteral splits :
systemout QualifiedName MethodInvocation InfixExpression SimpleName splits
println SimpleName MethodInvocation InfixExpression StringLiteral splits :
println SimpleName MethodInvocation InfixExpression SimpleName splits
random SimpleName SimpleType ClassInstanceCreation NumberLiteral empty
random SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName random
random SimpleName VariableDeclarationFragment ClassInstanceCreation NumberLiteral empty
random SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName random
hash map SimpleName SimpleType ParameterizedType SimpleType SimpleName text
hash map SimpleName SimpleType ParameterizedType SimpleType SimpleName value
text SimpleName SimpleType ParameterizedType SimpleType SimpleName value
hash map SimpleName SimpleType ParameterizedType SimpleType SimpleName text
hash map SimpleName SimpleType ParameterizedType SimpleType SimpleName value
text SimpleName SimpleType ParameterizedType SimpleType SimpleName value
array list SimpleName SimpleType ParameterizedType SimpleType SimpleName range
array list SimpleName SimpleType ParameterizedType SimpleType SimpleName range
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression NumberLiteral empty
random SimpleName MethodInvocation SimpleName next int
random SimpleName MethodInvocation SimpleName num rows
next int SimpleName MethodInvocation SimpleName num rows
r SimpleName VariableDeclarationFragment MethodInvocation SimpleName random
r SimpleName VariableDeclarationFragment MethodInvocation SimpleName next int
r SimpleName VariableDeclarationFragment MethodInvocation SimpleName num rows
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName r
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName random
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName next int
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName num rows
string SimpleName MethodInvocation SimpleName format
string SimpleName MethodInvocation StringLiteral % x
string SimpleName MethodInvocation SimpleName r
format SimpleName MethodInvocation StringLiteral % x
format SimpleName MethodInvocation SimpleName r
% x StringLiteral MethodInvocation SimpleName r
text SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName string
text SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName format
text SimpleName SimpleType ClassInstanceCreation MethodInvocation StringLiteral % x
text SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName r
row SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName text
row SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName string
row SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName format
row SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation StringLiteral % x
row SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName r
text SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName row
num rows SimpleName InfixExpression SimpleName r
string SimpleName MethodInvocation SimpleName format
string SimpleName MethodInvocation StringLiteral % x
string SimpleName MethodInvocation InfixExpression SimpleName num rows
string SimpleName MethodInvocation InfixExpression SimpleName r
format SimpleName MethodInvocation StringLiteral % x
format SimpleName MethodInvocation InfixExpression SimpleName num rows
format SimpleName MethodInvocation InfixExpression SimpleName r
% x StringLiteral MethodInvocation InfixExpression SimpleName num rows
% x StringLiteral MethodInvocation InfixExpression SimpleName r
string SimpleName MethodInvocation MethodInvocation SimpleName get bytes
format SimpleName MethodInvocation MethodInvocation SimpleName get bytes
% x StringLiteral MethodInvocation MethodInvocation SimpleName get bytes
num rows SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName get bytes
r SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName get bytes
value SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get bytes
expected SimpleName MethodInvocation SimpleName put
expected SimpleName MethodInvocation SimpleName row
expected SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName value
expected SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get bytes
put SimpleName MethodInvocation SimpleName row
put SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName value
put SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get bytes
row SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName value
row SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get bytes
range SimpleName SimpleType ClassInstanceCreation SimpleName row
ranges SimpleName MethodInvocation SimpleName add
ranges SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName range
ranges SimpleName MethodInvocation ClassInstanceCreation SimpleName row
add SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName range
add SimpleName MethodInvocation ClassInstanceCreation SimpleName row
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression NumberLiteral empty
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
empty NumberLiteral InfixExpression ForStatement PostfixExpression SimpleName i
hash map SimpleName SimpleType ParameterizedType SimpleType SimpleName text
hash map SimpleName SimpleType ParameterizedType SimpleType SimpleName value
text SimpleName SimpleType ParameterizedType SimpleType SimpleName value
hash map SimpleName SimpleType ParameterizedType SimpleType SimpleName text
hash map SimpleName SimpleType ParameterizedType SimpleType SimpleName value
text SimpleName SimpleType ParameterizedType SimpleType SimpleName value
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression NumberLiteral empty
get connector SimpleName MethodInvocation MethodInvocation SimpleName create batch scanner
get connector SimpleName MethodInvocation MethodInvocation SimpleName table name
get connector SimpleName MethodInvocation MethodInvocation QualifiedName authorizationsempty
get connector SimpleName MethodInvocation MethodInvocation NumberLiteral empty
create batch scanner SimpleName MethodInvocation SimpleName table name
create batch scanner SimpleName MethodInvocation QualifiedName authorizationsempty
create batch scanner SimpleName MethodInvocation NumberLiteral empty
table name SimpleName MethodInvocation QualifiedName authorizationsempty
table name SimpleName MethodInvocation NumberLiteral empty
authorizationsempty QualifiedName MethodInvocation NumberLiteral empty
bs SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get connector
bs SimpleName VariableDeclarationFragment MethodInvocation SimpleName create batch scanner
bs SimpleName VariableDeclarationFragment MethodInvocation SimpleName table name
bs SimpleName VariableDeclarationFragment MethodInvocation QualifiedName authorizationsempty
bs SimpleName VariableDeclarationFragment MethodInvocation NumberLiteral empty
batch scanner SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName bs
found SimpleName MethodInvocation SimpleName clear
system SimpleName MethodInvocation SimpleName current time millis
t SimpleName VariableDeclarationFragment MethodInvocation SimpleName system
t SimpleName VariableDeclarationFragment MethodInvocation SimpleName current time millis
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName t
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName system
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName current time millis
bs SimpleName MethodInvocation SimpleName set ranges
bs SimpleName MethodInvocation SimpleName ranges
set ranges SimpleName MethodInvocation SimpleName ranges
entry SimpleName SimpleType ParameterizedType SimpleType SimpleName key
entry SimpleName SimpleType ParameterizedType SimpleType SimpleName value
key SimpleName SimpleType ParameterizedType SimpleType SimpleName value
entry SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName entry
key SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName entry
value SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName entry
entry SimpleName MethodInvocation SimpleName get key
entry SimpleName MethodInvocation MethodInvocation SimpleName get row
get key SimpleName MethodInvocation MethodInvocation SimpleName get row
entry SimpleName MethodInvocation SimpleName get value
found SimpleName MethodInvocation SimpleName put
found SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName entry
found SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get key
found SimpleName MethodInvocation MethodInvocation SimpleName get row
found SimpleName MethodInvocation MethodInvocation SimpleName entry
found SimpleName MethodInvocation MethodInvocation SimpleName get value
put SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName entry
put SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get key
put SimpleName MethodInvocation MethodInvocation SimpleName get row
put SimpleName MethodInvocation MethodInvocation SimpleName entry
put SimpleName MethodInvocation MethodInvocation SimpleName get value
get row SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName entry
get row SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get value
entry SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName bs
bs SimpleName MethodInvocation SimpleName close
system SimpleName MethodInvocation SimpleName current time millis
t SimpleName VariableDeclarationFragment MethodInvocation SimpleName system
t SimpleName VariableDeclarationFragment MethodInvocation SimpleName current time millis
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName t
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName system
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName current time millis
ranges SimpleName MethodInvocation SimpleName size
t SimpleName InfixExpression SimpleName t
t SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral .
t SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral .
string SimpleName MethodInvocation SimpleName format
string SimpleName MethodInvocation StringLiteral rate : % . fn
string SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName ranges
string SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName size
format SimpleName MethodInvocation StringLiteral rate : % . fn
format SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName ranges
format SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName size
rate : % . fn StringLiteral MethodInvocation InfixExpression MethodInvocation SimpleName ranges
rate : % . fn StringLiteral MethodInvocation InfixExpression MethodInvocation SimpleName size
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation MethodInvocation SimpleName string
log SimpleName MethodInvocation MethodInvocation SimpleName format
log SimpleName MethodInvocation MethodInvocation StringLiteral rate : % . fn
info SimpleName MethodInvocation MethodInvocation SimpleName string
info SimpleName MethodInvocation MethodInvocation SimpleName format
info SimpleName MethodInvocation MethodInvocation StringLiteral rate : % . fn
found SimpleName MethodInvocation SimpleName equals
found SimpleName MethodInvocation SimpleName expected
equals SimpleName MethodInvocation SimpleName expected
found and expected differ StringLiteral InfixExpression SimpleName found
found and expected differ StringLiteral InfixExpression StringLiteral empty
found and expected differ StringLiteral InfixExpression SimpleName expected
found SimpleName InfixExpression StringLiteral empty
found SimpleName InfixExpression SimpleName expected
empty StringLiteral InfixExpression SimpleName expected
exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral found and expected differ
exception SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName found
exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral empty
exception SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName expected
long PrimitiveType VariableDeclarationStatement Block EnhancedForStatement SimpleName bs
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType long
bs SimpleName EnhancedForStatement Block VariableDeclarationStatement PrimitiveType long
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression NumberLiteral empty
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
empty NumberLiteral InfixExpression ForStatement PostfixExpression SimpleName i
get connector SimpleName MethodInvocation MethodInvocation SimpleName table operations
get connector SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName list splits
table operations SimpleName MethodInvocation MethodInvocation SimpleName list splits
get connector SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName table name
table operations SimpleName MethodInvocation MethodInvocation SimpleName table name
list splits SimpleName MethodInvocation SimpleName table name
splits SimpleName Assignment MethodInvocation MethodInvocation SimpleName table operations
splits SimpleName Assignment MethodInvocation SimpleName list splits
splits SimpleName Assignment MethodInvocation SimpleName table name
splits : StringLiteral InfixExpression SimpleName splits
log SimpleName MethodInvocation SimpleName info
log SimpleName MethodInvocation InfixExpression StringLiteral splits :
log SimpleName MethodInvocation InfixExpression SimpleName splits
info SimpleName MethodInvocation InfixExpression StringLiteral splits :
info SimpleName MethodInvocation InfixExpression SimpleName splits
test SimpleName NormalAnnotation MethodDeclaration Modifier public
timeout SimpleName MemberValuePair NormalAnnotation MethodDeclaration Modifier public
test SimpleName NormalAnnotation MethodDeclaration PrimitiveType void
timeout SimpleName MemberValuePair NormalAnnotation MethodDeclaration PrimitiveType void
test SimpleName NormalAnnotation MethodDeclaration SimpleName test
timeout SimpleName MemberValuePair NormalAnnotation MethodDeclaration SimpleName test
test SimpleName NormalAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test
public Modifier MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
void PrimitiveType MethodDeclaration SimpleName test
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
test SimpleName MethodDeclaration SimpleType SimpleName exception
test SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration NormalAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration NormalAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception