text SimpleName SimpleType ClassInstanceCreation StringLiteral a
colf SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName text
colf SimpleName VariableDeclarationFragment ClassInstanceCreation StringLiteral a
text SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName colf
text SimpleName SimpleType ClassInstanceCreation StringLiteral b
colq SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName text
colq SimpleName VariableDeclarationFragment ClassInstanceCreation StringLiteral b
text SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName colq
dv SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName value
value SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName dv
tree map SimpleName SimpleType ParameterizedType SimpleType SimpleName key
tree map SimpleName SimpleType ParameterizedType SimpleType SimpleName value
key SimpleName SimpleType ParameterizedType SimpleType SimpleName value
tree map SimpleName SimpleType ParameterizedType SimpleType SimpleName key
tree map SimpleName SimpleType ParameterizedType SimpleType SimpleName value
key SimpleName SimpleType ParameterizedType SimpleType SimpleName value
array list SimpleName SimpleType ParameterizedType SimpleType SimpleName filter
array list SimpleName SimpleType ParameterizedType SimpleType SimpleName filter
a SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName column age off filter
column age off filter SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName a
hash map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
hash map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
string SimpleName SimpleType ParameterizedType SimpleType SimpleName string
hash map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
hash map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
string SimpleName SimpleType ParameterizedType SimpleType SimpleName string
options SimpleName MethodInvocation SimpleName put
options SimpleName MethodInvocation StringLiteral a
options SimpleName MethodInvocation StringLiteral empty
put SimpleName MethodInvocation StringLiteral a
put SimpleName MethodInvocation StringLiteral empty
a StringLiteral MethodInvocation StringLiteral empty
system SimpleName MethodInvocation SimpleName current time millis
ts SimpleName VariableDeclarationFragment MethodInvocation SimpleName system
ts SimpleName VariableDeclarationFragment MethodInvocation SimpleName current time millis
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName ts
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName system
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName current time millis
a SimpleName MethodInvocation SimpleName init
a SimpleName MethodInvocation SimpleName options
init SimpleName MethodInvocation SimpleName options
a SimpleName MethodInvocation SimpleName override current time
a SimpleName MethodInvocation SimpleName ts
override current time SimpleName MethodInvocation SimpleName ts
f SimpleName MethodInvocation SimpleName add
f SimpleName MethodInvocation SimpleName a
add SimpleName MethodInvocation SimpleName a
i SimpleName VariableDeclarationFragment NumberLiteral empty
long PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
long PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression NumberLiteral empty
string SimpleName MethodInvocation SimpleName format
string SimpleName MethodInvocation StringLiteral % d
string SimpleName MethodInvocation SimpleName i
format SimpleName MethodInvocation StringLiteral % d
format SimpleName MethodInvocation SimpleName i
% d StringLiteral MethodInvocation SimpleName i
text SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName string
text SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName format
text SimpleName SimpleType ClassInstanceCreation MethodInvocation StringLiteral % d
text SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName i
ts SimpleName InfixExpression SimpleName i
key SimpleName SimpleType ClassInstanceCreation SimpleName colf
key SimpleName SimpleType ClassInstanceCreation SimpleName colq
key SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName ts
key SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName i
text SimpleName SimpleType ClassInstanceCreation ClassInstanceCreation SimpleName colf
string SimpleName MethodInvocation ClassInstanceCreation ClassInstanceCreation SimpleName colf
format SimpleName MethodInvocation ClassInstanceCreation ClassInstanceCreation SimpleName colf
% d StringLiteral MethodInvocation ClassInstanceCreation ClassInstanceCreation SimpleName colf
i SimpleName MethodInvocation ClassInstanceCreation ClassInstanceCreation SimpleName colf
text SimpleName SimpleType ClassInstanceCreation ClassInstanceCreation SimpleName colq
string SimpleName MethodInvocation ClassInstanceCreation ClassInstanceCreation SimpleName colq
format SimpleName MethodInvocation ClassInstanceCreation ClassInstanceCreation SimpleName colq
% d StringLiteral MethodInvocation ClassInstanceCreation ClassInstanceCreation SimpleName colq
i SimpleName MethodInvocation ClassInstanceCreation ClassInstanceCreation SimpleName colq
colf SimpleName ClassInstanceCreation SimpleName colq
colf SimpleName ClassInstanceCreation InfixExpression SimpleName ts
colf SimpleName ClassInstanceCreation InfixExpression SimpleName i
colq SimpleName ClassInstanceCreation InfixExpression SimpleName ts
colq SimpleName ClassInstanceCreation InfixExpression SimpleName i
k SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName key
k SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName colf
k SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName colq
k SimpleName VariableDeclarationFragment ClassInstanceCreation InfixExpression SimpleName ts
k SimpleName VariableDeclarationFragment ClassInstanceCreation InfixExpression SimpleName i
key SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName k
tm SimpleName MethodInvocation SimpleName put
tm SimpleName MethodInvocation SimpleName k
tm SimpleName MethodInvocation SimpleName dv
put SimpleName MethodInvocation SimpleName k
put SimpleName MethodInvocation SimpleName dv
k SimpleName MethodInvocation SimpleName dv
long PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
long PrimitiveType VariableDeclarationExpression ForStatement InfixExpression NumberLiteral empty
long PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
empty NumberLiteral InfixExpression ForStatement PostfixExpression SimpleName i
tm SimpleName MethodInvocation SimpleName size
tm SimpleName MethodInvocation InfixExpression NumberLiteral empty
size SimpleName MethodInvocation InfixExpression NumberLiteral empty
assert true SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName tm
assert true SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName size
assert true SimpleName MethodInvocation InfixExpression NumberLiteral empty
filter SimpleName MethodInvocation SimpleName tm
filter SimpleName MethodInvocation SimpleName f
tm SimpleName MethodInvocation SimpleName f
size SimpleName VariableDeclarationFragment MethodInvocation SimpleName filter
size SimpleName VariableDeclarationFragment MethodInvocation SimpleName tm
size SimpleName VariableDeclarationFragment MethodInvocation SimpleName f
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName size
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName filter
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName tm
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName f
size SimpleName InfixExpression NumberLiteral empty
assert true SimpleName MethodInvocation InfixExpression SimpleName size
assert true SimpleName MethodInvocation InfixExpression NumberLiteral empty
options SimpleName MethodInvocation SimpleName put
options SimpleName MethodInvocation StringLiteral ab
options SimpleName MethodInvocation StringLiteral empty
put SimpleName MethodInvocation StringLiteral ab
put SimpleName MethodInvocation StringLiteral empty
ab StringLiteral MethodInvocation StringLiteral empty
a SimpleName MethodInvocation SimpleName init
a SimpleName MethodInvocation SimpleName options
init SimpleName MethodInvocation SimpleName options
a SimpleName MethodInvocation SimpleName override current time
a SimpleName MethodInvocation SimpleName ts
override current time SimpleName MethodInvocation SimpleName ts
f SimpleName MethodInvocation SimpleName clear
f SimpleName MethodInvocation SimpleName add
f SimpleName MethodInvocation SimpleName a
add SimpleName MethodInvocation SimpleName a
filter SimpleName MethodInvocation SimpleName tm
filter SimpleName MethodInvocation SimpleName f
tm SimpleName MethodInvocation SimpleName f
size SimpleName Assignment MethodInvocation SimpleName filter
size SimpleName Assignment MethodInvocation SimpleName tm
size SimpleName Assignment MethodInvocation SimpleName f
size SimpleName InfixExpression NumberLiteral empty
assert true SimpleName MethodInvocation InfixExpression SimpleName size
assert true SimpleName MethodInvocation InfixExpression NumberLiteral empty
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test a
public Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType long
public Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
void PrimitiveType MethodDeclaration SimpleName test a
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType long
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
test a SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType long
test a SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test a
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test a
