string SimpleName SimpleType SingleVariableDeclaration SimpleName table
int PrimitiveType SingleVariableDeclaration SimpleName depth
long PrimitiveType SingleVariableDeclaration SimpleName start
long PrimitiveType SingleVariableDeclaration SimpleName end
int PrimitiveType SingleVariableDeclaration SimpleName num
int PrimitiveType SingleVariableDeclaration SimpleName step
random SimpleName SimpleType ClassInstanceCreation NumberLiteral empty
r SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName random
r SimpleName VariableDeclarationFragment ClassInstanceCreation NumberLiteral empty
random SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName r
hash set SimpleName SimpleType ParameterizedType SimpleType SimpleName long
hash set SimpleName SimpleType ParameterizedType SimpleType SimpleName long
list SimpleName SimpleType ParameterizedType SimpleType SimpleName range
array list SimpleName SimpleType ParameterizedType SimpleType SimpleName range
array list SimpleName SimpleType ParameterizedType ClassInstanceCreation SimpleName num
range SimpleName SimpleType ParameterizedType ClassInstanceCreation SimpleName num
ranges SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName num
key SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName text
text SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName key
text SimpleName SimpleType ClassInstanceCreation StringLiteral row
row SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName text
row SimpleName VariableDeclarationFragment ClassInstanceCreation StringLiteral row
text SimpleName SimpleType ClassInstanceCreation StringLiteral cq
cq SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName text
cq SimpleName VariableDeclarationFragment ClassInstanceCreation StringLiteral cq
text SimpleName SimpleType ClassInstanceCreation StringLiteral cf
cf SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName text
cf SimpleName VariableDeclarationFragment ClassInstanceCreation StringLiteral cf
text SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName row
text SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName cq
text SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName cf
row SimpleName VariableDeclarationFragment VariableDeclarationStatement VariableDeclarationFragment SimpleName cq
row SimpleName VariableDeclarationFragment VariableDeclarationStatement VariableDeclarationFragment SimpleName cf
cq SimpleName VariableDeclarationFragment VariableDeclarationStatement VariableDeclarationFragment SimpleName cf
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression SimpleName num
r SimpleName MethodInvocation SimpleName next long
r SimpleName MethodInvocation InfixExpression NumberLiteral x fffffffffffffffl
next long SimpleName MethodInvocation InfixExpression NumberLiteral x fffffffffffffffl
end SimpleName InfixExpression SimpleName start
k SimpleName VariableDeclarationFragment InfixExpression SimpleName start
long SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName k
string SimpleName MethodInvocation SimpleName format
string SimpleName MethodInvocation StringLiteral k % d
string SimpleName MethodInvocation SimpleName k
format SimpleName MethodInvocation StringLiteral k % d
format SimpleName MethodInvocation SimpleName k
k % d StringLiteral MethodInvocation SimpleName k
key SimpleName MethodInvocation SimpleName set
key SimpleName MethodInvocation MethodInvocation SimpleName string
key SimpleName MethodInvocation MethodInvocation SimpleName format
key SimpleName MethodInvocation MethodInvocation StringLiteral k % d
key SimpleName MethodInvocation MethodInvocation SimpleName k
set SimpleName MethodInvocation MethodInvocation SimpleName string
set SimpleName MethodInvocation MethodInvocation SimpleName format
set SimpleName MethodInvocation MethodInvocation StringLiteral k % d
set SimpleName MethodInvocation MethodInvocation SimpleName k
range SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName range
key SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName acu key
start SimpleName InfixExpression SimpleName step
k SimpleName InfixExpression ParenthesizedExpression InfixExpression SimpleName start
k SimpleName InfixExpression ParenthesizedExpression InfixExpression SimpleName step
k SimpleName InfixExpression InfixExpression NumberLiteral empty
expected SimpleName MethodInvocation SimpleName add
expected SimpleName MethodInvocation SimpleName k
add SimpleName MethodInvocation SimpleName k
text SimpleName SimpleType ClassInstanceCreation SimpleName key
range SimpleName SimpleType ClassInstanceCreation ClassInstanceCreation SimpleName key
range SimpleName Assignment ClassInstanceCreation SimpleType SimpleName range
range SimpleName Assignment ClassInstanceCreation ClassInstanceCreation SimpleName key
key SimpleName SimpleType ClassInstanceCreation SimpleName row
key SimpleName SimpleType ClassInstanceCreation SimpleName key
key SimpleName SimpleType ClassInstanceCreation SimpleName cq
row SimpleName ClassInstanceCreation SimpleName key
row SimpleName ClassInstanceCreation SimpleName cq
key SimpleName ClassInstanceCreation SimpleName cq
acu key SimpleName Assignment ClassInstanceCreation SimpleType SimpleName key
acu key SimpleName Assignment ClassInstanceCreation SimpleName row
acu key SimpleName Assignment ClassInstanceCreation SimpleName key
acu key SimpleName Assignment ClassInstanceCreation SimpleName cq
acu key SimpleName MethodInvocation SimpleName following key
acu key SimpleName MethodInvocation QualifiedName partial keyrow colfam
following key SimpleName MethodInvocation QualifiedName partial keyrow colfam
range SimpleName SimpleType ClassInstanceCreation SimpleName acu key
range SimpleName SimpleType ClassInstanceCreation BooleanLiteral true
range SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName acu key
range SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName following key
range SimpleName SimpleType ClassInstanceCreation MethodInvocation QualifiedName partial keyrow colfam
range SimpleName SimpleType ClassInstanceCreation BooleanLiteral false
acu key SimpleName ClassInstanceCreation BooleanLiteral true
acu key SimpleName ClassInstanceCreation MethodInvocation SimpleName acu key
acu key SimpleName ClassInstanceCreation MethodInvocation SimpleName following key
acu key SimpleName ClassInstanceCreation MethodInvocation QualifiedName partial keyrow colfam
acu key SimpleName ClassInstanceCreation BooleanLiteral false
true BooleanLiteral ClassInstanceCreation MethodInvocation SimpleName acu key
true BooleanLiteral ClassInstanceCreation MethodInvocation SimpleName following key
true BooleanLiteral ClassInstanceCreation MethodInvocation QualifiedName partial keyrow colfam
true BooleanLiteral ClassInstanceCreation BooleanLiteral false
acu key SimpleName MethodInvocation ClassInstanceCreation BooleanLiteral false
following key SimpleName MethodInvocation ClassInstanceCreation BooleanLiteral false
partial keyrow colfam QualifiedName MethodInvocation ClassInstanceCreation BooleanLiteral false
range SimpleName Assignment ClassInstanceCreation SimpleType SimpleName range
range SimpleName Assignment ClassInstanceCreation SimpleName acu key
range SimpleName Assignment ClassInstanceCreation BooleanLiteral true
range SimpleName Assignment ClassInstanceCreation MethodInvocation SimpleName acu key
range SimpleName Assignment ClassInstanceCreation MethodInvocation SimpleName following key
range SimpleName Assignment ClassInstanceCreation MethodInvocation QualifiedName partial keyrow colfam
range SimpleName Assignment ClassInstanceCreation BooleanLiteral false
key SimpleName SimpleType ClassInstanceCreation SimpleName row
key SimpleName SimpleType ClassInstanceCreation SimpleName cf
key SimpleName SimpleType ClassInstanceCreation SimpleName key
row SimpleName ClassInstanceCreation SimpleName cf
row SimpleName ClassInstanceCreation SimpleName key
cf SimpleName ClassInstanceCreation SimpleName key
acu key SimpleName Assignment ClassInstanceCreation SimpleType SimpleName key
acu key SimpleName Assignment ClassInstanceCreation SimpleName row
acu key SimpleName Assignment ClassInstanceCreation SimpleName cf
acu key SimpleName Assignment ClassInstanceCreation SimpleName key
acu key SimpleName MethodInvocation SimpleName following key
acu key SimpleName MethodInvocation QualifiedName partial keyrow colfam colqual
following key SimpleName MethodInvocation QualifiedName partial keyrow colfam colqual
range SimpleName SimpleType ClassInstanceCreation SimpleName acu key
range SimpleName SimpleType ClassInstanceCreation BooleanLiteral true
range SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName acu key
range SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName following key
range SimpleName SimpleType ClassInstanceCreation MethodInvocation QualifiedName partial keyrow colfam colqual
range SimpleName SimpleType ClassInstanceCreation BooleanLiteral false
acu key SimpleName ClassInstanceCreation BooleanLiteral true
acu key SimpleName ClassInstanceCreation MethodInvocation SimpleName acu key
acu key SimpleName ClassInstanceCreation MethodInvocation SimpleName following key
acu key SimpleName ClassInstanceCreation MethodInvocation QualifiedName partial keyrow colfam colqual
acu key SimpleName ClassInstanceCreation BooleanLiteral false
true BooleanLiteral ClassInstanceCreation MethodInvocation SimpleName acu key
true BooleanLiteral ClassInstanceCreation MethodInvocation SimpleName following key
true BooleanLiteral ClassInstanceCreation MethodInvocation QualifiedName partial keyrow colfam colqual
true BooleanLiteral ClassInstanceCreation BooleanLiteral false
acu key SimpleName MethodInvocation ClassInstanceCreation BooleanLiteral false
following key SimpleName MethodInvocation ClassInstanceCreation BooleanLiteral false
partial keyrow colfam colqual QualifiedName MethodInvocation ClassInstanceCreation BooleanLiteral false
range SimpleName Assignment ClassInstanceCreation SimpleType SimpleName range
range SimpleName Assignment ClassInstanceCreation SimpleName acu key
range SimpleName Assignment ClassInstanceCreation BooleanLiteral true
range SimpleName Assignment ClassInstanceCreation MethodInvocation SimpleName acu key
range SimpleName Assignment ClassInstanceCreation MethodInvocation SimpleName following key
range SimpleName Assignment ClassInstanceCreation MethodInvocation QualifiedName partial keyrow colfam colqual
range SimpleName Assignment ClassInstanceCreation BooleanLiteral false
depth SimpleName SwitchStatement SwitchCase NumberLiteral empty
depth SimpleName SwitchStatement ExpressionStatement Assignment SimpleName range
depth SimpleName SwitchStatement SwitchCase NumberLiteral empty
depth SimpleName SwitchStatement ExpressionStatement Assignment SimpleName acu key
empty NumberLiteral SwitchCase SwitchStatement SwitchCase NumberLiteral empty
empty NumberLiteral SwitchCase SwitchStatement SwitchCase NumberLiteral empty
ranges SimpleName MethodInvocation SimpleName add
ranges SimpleName MethodInvocation SimpleName range
add SimpleName MethodInvocation SimpleName range
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName num
int PrimitiveType VariableDeclarationExpression ForStatement PrefixExpression SimpleName i
i SimpleName InfixExpression ForStatement PrefixExpression SimpleName i
num SimpleName InfixExpression ForStatement PrefixExpression SimpleName i
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
system SimpleName MethodInvocation SimpleName current time millis
t SimpleName VariableDeclarationFragment MethodInvocation SimpleName system
t SimpleName VariableDeclarationFragment MethodInvocation SimpleName current time millis
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName t
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName system
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName current time millis
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
v SimpleName VariableDeclarationFragment MethodInvocation SimpleName long
v SimpleName VariableDeclarationFragment MethodInvocation SimpleName parse long
v SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName to string
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName v
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName long
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName parse long
expected SimpleName MethodInvocation SimpleName remove
expected SimpleName MethodInvocation SimpleName v
remove SimpleName MethodInvocation SimpleName v
entry SimpleName MethodInvocation SimpleName get key
entry SimpleName MethodInvocation SimpleName get value
got unexpected return StringLiteral InfixExpression MethodInvocation SimpleName entry
got unexpected return StringLiteral InfixExpression MethodInvocation SimpleName get key
got unexpected return StringLiteral InfixExpression StringLiteral empty
got unexpected return StringLiteral InfixExpression MethodInvocation SimpleName entry
got unexpected return StringLiteral InfixExpression MethodInvocation SimpleName get value
entry SimpleName MethodInvocation InfixExpression StringLiteral empty
get key SimpleName MethodInvocation InfixExpression StringLiteral empty
entry SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName entry
entry SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get value
get key SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName entry
get key SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get value
empty StringLiteral InfixExpression MethodInvocation SimpleName entry
empty StringLiteral InfixExpression MethodInvocation SimpleName get value
exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral got unexpected return
exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral empty
entry SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName bs
bs SimpleName EnhancedForStatement Block VariableDeclarationStatement PrimitiveType long
system SimpleName MethodInvocation SimpleName current time millis
t SimpleName VariableDeclarationFragment MethodInvocation SimpleName system
t SimpleName VariableDeclarationFragment MethodInvocation SimpleName current time millis
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName t
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName system
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName current time millis
expected SimpleName MethodInvocation SimpleName size
expected SimpleName MethodInvocation InfixExpression NumberLiteral empty
size SimpleName MethodInvocation InfixExpression NumberLiteral empty
expected SimpleName MethodInvocation SimpleName size
did not get all expected values StringLiteral InfixExpression MethodInvocation SimpleName expected
did not get all expected values StringLiteral InfixExpression MethodInvocation SimpleName size
exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral did not get all expected values
bs SimpleName MethodInvocation SimpleName close
t SimpleName InfixExpression SimpleName t
long PrimitiveType VariableDeclarationStatement Block EnhancedForStatement SimpleName bs
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType long
bs SimpleName EnhancedForStatement Block VariableDeclarationStatement PrimitiveType long
private Modifier MethodDeclaration PrimitiveType long
private Modifier MethodDeclaration SimpleName query
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName table
private Modifier MethodDeclaration SingleVariableDeclaration PrimitiveType int
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName depth
private Modifier MethodDeclaration SingleVariableDeclaration PrimitiveType long
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName start
long PrimitiveType MethodDeclaration SimpleName query
long PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
long PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName table
long PrimitiveType MethodDeclaration SingleVariableDeclaration PrimitiveType int
long PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName depth
long PrimitiveType MethodDeclaration SingleVariableDeclaration PrimitiveType long
long PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName start
long PrimitiveType MethodDeclaration SingleVariableDeclaration PrimitiveType long
long PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName end
query SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
query SimpleName MethodDeclaration SingleVariableDeclaration SimpleName table
query SimpleName MethodDeclaration SingleVariableDeclaration PrimitiveType int
query SimpleName MethodDeclaration SingleVariableDeclaration SimpleName depth
query SimpleName MethodDeclaration SingleVariableDeclaration PrimitiveType long
query SimpleName MethodDeclaration SingleVariableDeclaration SimpleName start
query SimpleName MethodDeclaration SingleVariableDeclaration PrimitiveType long
query SimpleName MethodDeclaration SingleVariableDeclaration SimpleName end
query SimpleName MethodDeclaration SingleVariableDeclaration PrimitiveType int
query SimpleName MethodDeclaration SingleVariableDeclaration SimpleName num
table SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
table SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName depth
table SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType long
table SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName start
table SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType long
table SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName end
table SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
table SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName num
table SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
table SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName step
int PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType long
int PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName start
depth SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType long
depth SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName start
int PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType long
int PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName end
depth SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType long
depth SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName end
int PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
int PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName num
depth SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
depth SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName num
int PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
int PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName step
depth SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
depth SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName step
int PrimitiveType SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
depth SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
long PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType long
long PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName end
start SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType long
start SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName end
long PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
long PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName num
start SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
start SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName num
long PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
long PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName step
start SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
start SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName step
long PrimitiveType SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
start SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
long PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
long PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName num
end SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
end SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName num
long PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
long PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName step
end SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
end SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName step
long PrimitiveType SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
end SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
int PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
int PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName step
num SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
num SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName step
int PrimitiveType SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
num SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
int PrimitiveType SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
step SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration PrimitiveType long
public Modifier TypeDeclaration MethodDeclaration SimpleName query
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName table
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName depth
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType long
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName start
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType long
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName end
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName num
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName step
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType long
test SimpleName TypeDeclaration MethodDeclaration SimpleName query
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName table
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName depth
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType long
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName start
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType long
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName end
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName num
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName step
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception