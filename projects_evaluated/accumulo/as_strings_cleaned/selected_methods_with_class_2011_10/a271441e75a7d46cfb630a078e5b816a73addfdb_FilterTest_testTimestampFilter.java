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
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
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
key SimpleName SimpleType ClassInstanceCreation SimpleName colf
key SimpleName SimpleType ClassInstanceCreation SimpleName colq
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
k SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName key
k SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName colf
k SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName colq
key SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName k
k SimpleName MethodInvocation SimpleName set timestamp
k SimpleName MethodInvocation SimpleName i
set timestamp SimpleName MethodInvocation SimpleName i
tm SimpleName MethodInvocation SimpleName put
tm SimpleName MethodInvocation SimpleName k
tm SimpleName MethodInvocation SimpleName dv
put SimpleName MethodInvocation SimpleName k
put SimpleName MethodInvocation SimpleName dv
k SimpleName MethodInvocation SimpleName dv
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression NumberLiteral empty
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
empty NumberLiteral InfixExpression ForStatement PostfixExpression SimpleName i
tm SimpleName MethodInvocation SimpleName size
tm SimpleName MethodInvocation InfixExpression NumberLiteral empty
size SimpleName MethodInvocation InfixExpression NumberLiteral empty
assert true SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName tm
assert true SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName size
assert true SimpleName MethodInvocation InfixExpression NumberLiteral empty
sorted map iterator SimpleName SimpleType ClassInstanceCreation SimpleName tm
timestamp filter SimpleName SimpleType ClassInstanceCreation ClassInstanceCreation SimpleName tm
timestamp filter SimpleName SimpleType ClassInstanceCreation NumberLiteral empty
timestamp filter SimpleName SimpleType ClassInstanceCreation BooleanLiteral true
timestamp filter SimpleName SimpleType ClassInstanceCreation NumberLiteral empty
timestamp filter SimpleName SimpleType ClassInstanceCreation BooleanLiteral false
sorted map iterator SimpleName SimpleType ClassInstanceCreation ClassInstanceCreation NumberLiteral empty
tm SimpleName ClassInstanceCreation ClassInstanceCreation NumberLiteral empty
sorted map iterator SimpleName SimpleType ClassInstanceCreation ClassInstanceCreation BooleanLiteral true
tm SimpleName ClassInstanceCreation ClassInstanceCreation BooleanLiteral true
sorted map iterator SimpleName SimpleType ClassInstanceCreation ClassInstanceCreation NumberLiteral empty
tm SimpleName ClassInstanceCreation ClassInstanceCreation NumberLiteral empty
sorted map iterator SimpleName SimpleType ClassInstanceCreation ClassInstanceCreation BooleanLiteral false
tm SimpleName ClassInstanceCreation ClassInstanceCreation BooleanLiteral false
empty NumberLiteral ClassInstanceCreation BooleanLiteral true
empty NumberLiteral ClassInstanceCreation NumberLiteral empty
empty NumberLiteral ClassInstanceCreation BooleanLiteral false
true BooleanLiteral ClassInstanceCreation NumberLiteral empty
true BooleanLiteral ClassInstanceCreation BooleanLiteral false
empty NumberLiteral ClassInstanceCreation BooleanLiteral false
a SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName timestamp filter
a SimpleName VariableDeclarationFragment ClassInstanceCreation ClassInstanceCreation SimpleName tm
a SimpleName VariableDeclarationFragment ClassInstanceCreation NumberLiteral empty
a SimpleName VariableDeclarationFragment ClassInstanceCreation BooleanLiteral true
a SimpleName VariableDeclarationFragment ClassInstanceCreation NumberLiteral empty
a SimpleName VariableDeclarationFragment ClassInstanceCreation BooleanLiteral false
timestamp filter SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName a
a SimpleName MethodInvocation SimpleName seek
a SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName range
a SimpleName MethodInvocation SimpleName empty col fams
a SimpleName MethodInvocation BooleanLiteral false
seek SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName range
seek SimpleName MethodInvocation SimpleName empty col fams
seek SimpleName MethodInvocation BooleanLiteral false
range SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName empty col fams
range SimpleName SimpleType ClassInstanceCreation MethodInvocation BooleanLiteral false
empty col fams SimpleName MethodInvocation BooleanLiteral false
size SimpleName MethodInvocation SimpleName a
assert equals SimpleName MethodInvocation MethodInvocation SimpleName size
assert equals SimpleName MethodInvocation MethodInvocation SimpleName a
assert equals SimpleName MethodInvocation NumberLiteral empty
size SimpleName MethodInvocation MethodInvocation NumberLiteral empty
a SimpleName MethodInvocation MethodInvocation NumberLiteral empty
sorted map iterator SimpleName SimpleType ClassInstanceCreation SimpleName tm
timestamp filter SimpleName SimpleType ClassInstanceCreation ClassInstanceCreation SimpleName tm
timestamp filter SimpleName SimpleType ClassInstanceCreation NumberLiteral empty
timestamp filter SimpleName SimpleType ClassInstanceCreation BooleanLiteral true
timestamp filter SimpleName SimpleType ClassInstanceCreation NumberLiteral empty
timestamp filter SimpleName SimpleType ClassInstanceCreation BooleanLiteral true
sorted map iterator SimpleName SimpleType ClassInstanceCreation ClassInstanceCreation NumberLiteral empty
tm SimpleName ClassInstanceCreation ClassInstanceCreation NumberLiteral empty
sorted map iterator SimpleName SimpleType ClassInstanceCreation ClassInstanceCreation BooleanLiteral true
tm SimpleName ClassInstanceCreation ClassInstanceCreation BooleanLiteral true
sorted map iterator SimpleName SimpleType ClassInstanceCreation ClassInstanceCreation NumberLiteral empty
tm SimpleName ClassInstanceCreation ClassInstanceCreation NumberLiteral empty
sorted map iterator SimpleName SimpleType ClassInstanceCreation ClassInstanceCreation BooleanLiteral true
tm SimpleName ClassInstanceCreation ClassInstanceCreation BooleanLiteral true
empty NumberLiteral ClassInstanceCreation BooleanLiteral true
empty NumberLiteral ClassInstanceCreation NumberLiteral empty
empty NumberLiteral ClassInstanceCreation BooleanLiteral true
true BooleanLiteral ClassInstanceCreation NumberLiteral empty
true BooleanLiteral ClassInstanceCreation BooleanLiteral true
empty NumberLiteral ClassInstanceCreation BooleanLiteral true
a SimpleName Assignment ClassInstanceCreation SimpleType SimpleName timestamp filter
a SimpleName Assignment ClassInstanceCreation ClassInstanceCreation SimpleName tm
a SimpleName Assignment ClassInstanceCreation NumberLiteral empty
a SimpleName Assignment ClassInstanceCreation BooleanLiteral true
a SimpleName Assignment ClassInstanceCreation NumberLiteral empty
a SimpleName Assignment ClassInstanceCreation BooleanLiteral true
a SimpleName MethodInvocation SimpleName seek
a SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName range
a SimpleName MethodInvocation SimpleName empty col fams
a SimpleName MethodInvocation BooleanLiteral false
seek SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName range
seek SimpleName MethodInvocation SimpleName empty col fams
seek SimpleName MethodInvocation BooleanLiteral false
range SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName empty col fams
range SimpleName SimpleType ClassInstanceCreation MethodInvocation BooleanLiteral false
empty col fams SimpleName MethodInvocation BooleanLiteral false
size SimpleName MethodInvocation SimpleName a
assert equals SimpleName MethodInvocation MethodInvocation SimpleName size
assert equals SimpleName MethodInvocation MethodInvocation SimpleName a
assert equals SimpleName MethodInvocation NumberLiteral empty
size SimpleName MethodInvocation MethodInvocation NumberLiteral empty
a SimpleName MethodInvocation MethodInvocation NumberLiteral empty
sorted map iterator SimpleName SimpleType ClassInstanceCreation SimpleName tm
timestamp filter SimpleName SimpleType ClassInstanceCreation ClassInstanceCreation SimpleName tm
timestamp filter SimpleName SimpleType ClassInstanceCreation NumberLiteral empty
timestamp filter SimpleName SimpleType ClassInstanceCreation BooleanLiteral false
timestamp filter SimpleName SimpleType ClassInstanceCreation NumberLiteral empty
timestamp filter SimpleName SimpleType ClassInstanceCreation BooleanLiteral false
sorted map iterator SimpleName SimpleType ClassInstanceCreation ClassInstanceCreation NumberLiteral empty
tm SimpleName ClassInstanceCreation ClassInstanceCreation NumberLiteral empty
sorted map iterator SimpleName SimpleType ClassInstanceCreation ClassInstanceCreation BooleanLiteral false
tm SimpleName ClassInstanceCreation ClassInstanceCreation BooleanLiteral false
sorted map iterator SimpleName SimpleType ClassInstanceCreation ClassInstanceCreation NumberLiteral empty
tm SimpleName ClassInstanceCreation ClassInstanceCreation NumberLiteral empty
sorted map iterator SimpleName SimpleType ClassInstanceCreation ClassInstanceCreation BooleanLiteral false
tm SimpleName ClassInstanceCreation ClassInstanceCreation BooleanLiteral false
empty NumberLiteral ClassInstanceCreation BooleanLiteral false
empty NumberLiteral ClassInstanceCreation NumberLiteral empty
empty NumberLiteral ClassInstanceCreation BooleanLiteral false
false BooleanLiteral ClassInstanceCreation NumberLiteral empty
false BooleanLiteral ClassInstanceCreation BooleanLiteral false
empty NumberLiteral ClassInstanceCreation BooleanLiteral false
a SimpleName Assignment ClassInstanceCreation SimpleType SimpleName timestamp filter
a SimpleName Assignment ClassInstanceCreation ClassInstanceCreation SimpleName tm
a SimpleName Assignment ClassInstanceCreation NumberLiteral empty
a SimpleName Assignment ClassInstanceCreation BooleanLiteral false
a SimpleName Assignment ClassInstanceCreation NumberLiteral empty
a SimpleName Assignment ClassInstanceCreation BooleanLiteral false
a SimpleName MethodInvocation SimpleName seek
a SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName range
a SimpleName MethodInvocation SimpleName empty col fams
a SimpleName MethodInvocation BooleanLiteral false
seek SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName range
seek SimpleName MethodInvocation SimpleName empty col fams
seek SimpleName MethodInvocation BooleanLiteral false
range SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName empty col fams
range SimpleName SimpleType ClassInstanceCreation MethodInvocation BooleanLiteral false
empty col fams SimpleName MethodInvocation BooleanLiteral false
size SimpleName MethodInvocation SimpleName a
assert equals SimpleName MethodInvocation MethodInvocation SimpleName size
assert equals SimpleName MethodInvocation MethodInvocation SimpleName a
assert equals SimpleName MethodInvocation NumberLiteral empty
size SimpleName MethodInvocation MethodInvocation NumberLiteral empty
a SimpleName MethodInvocation MethodInvocation NumberLiteral empty
sorted map iterator SimpleName SimpleType ClassInstanceCreation SimpleName tm
timestamp filter SimpleName SimpleType ClassInstanceCreation ClassInstanceCreation SimpleName tm
timestamp filter SimpleName SimpleType ClassInstanceCreation NumberLiteral empty
timestamp filter SimpleName SimpleType ClassInstanceCreation BooleanLiteral false
timestamp filter SimpleName SimpleType ClassInstanceCreation NumberLiteral empty
timestamp filter SimpleName SimpleType ClassInstanceCreation BooleanLiteral true
sorted map iterator SimpleName SimpleType ClassInstanceCreation ClassInstanceCreation NumberLiteral empty
tm SimpleName ClassInstanceCreation ClassInstanceCreation NumberLiteral empty
sorted map iterator SimpleName SimpleType ClassInstanceCreation ClassInstanceCreation BooleanLiteral false
tm SimpleName ClassInstanceCreation ClassInstanceCreation BooleanLiteral false
sorted map iterator SimpleName SimpleType ClassInstanceCreation ClassInstanceCreation NumberLiteral empty
tm SimpleName ClassInstanceCreation ClassInstanceCreation NumberLiteral empty
sorted map iterator SimpleName SimpleType ClassInstanceCreation ClassInstanceCreation BooleanLiteral true
tm SimpleName ClassInstanceCreation ClassInstanceCreation BooleanLiteral true
empty NumberLiteral ClassInstanceCreation BooleanLiteral false
empty NumberLiteral ClassInstanceCreation NumberLiteral empty
empty NumberLiteral ClassInstanceCreation BooleanLiteral true
false BooleanLiteral ClassInstanceCreation NumberLiteral empty
false BooleanLiteral ClassInstanceCreation BooleanLiteral true
empty NumberLiteral ClassInstanceCreation BooleanLiteral true
a SimpleName Assignment ClassInstanceCreation SimpleType SimpleName timestamp filter
a SimpleName Assignment ClassInstanceCreation ClassInstanceCreation SimpleName tm
a SimpleName Assignment ClassInstanceCreation NumberLiteral empty
a SimpleName Assignment ClassInstanceCreation BooleanLiteral false
a SimpleName Assignment ClassInstanceCreation NumberLiteral empty
a SimpleName Assignment ClassInstanceCreation BooleanLiteral true
a SimpleName MethodInvocation SimpleName seek
a SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName range
a SimpleName MethodInvocation SimpleName empty col fams
a SimpleName MethodInvocation BooleanLiteral false
seek SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName range
seek SimpleName MethodInvocation SimpleName empty col fams
seek SimpleName MethodInvocation BooleanLiteral false
range SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName empty col fams
range SimpleName SimpleType ClassInstanceCreation MethodInvocation BooleanLiteral false
empty col fams SimpleName MethodInvocation BooleanLiteral false
size SimpleName MethodInvocation SimpleName a
assert equals SimpleName MethodInvocation MethodInvocation SimpleName size
assert equals SimpleName MethodInvocation MethodInvocation SimpleName a
assert equals SimpleName MethodInvocation NumberLiteral empty
size SimpleName MethodInvocation MethodInvocation NumberLiteral empty
a SimpleName MethodInvocation MethodInvocation NumberLiteral empty
simple date format SimpleName SimpleType ClassInstanceCreation StringLiteral yyyy m mdd h hmmssz
date parser SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName simple date format
date parser SimpleName VariableDeclarationFragment ClassInstanceCreation StringLiteral yyyy m mdd h hmmssz
simple date format SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName date parser
date parser SimpleName MethodInvocation SimpleName parse
date parser SimpleName MethodInvocation StringLiteral gmt
parse SimpleName MethodInvocation StringLiteral gmt
date parser SimpleName MethodInvocation MethodInvocation SimpleName get time
parse SimpleName MethodInvocation MethodInvocation SimpleName get time
gmt StringLiteral MethodInvocation MethodInvocation SimpleName get time
base time SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName date parser
base time SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName parse
base time SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation StringLiteral gmt
base time SimpleName VariableDeclarationFragment MethodInvocation SimpleName get time
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName base time
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get time
tm SimpleName MethodInvocation SimpleName clear
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
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
key SimpleName SimpleType ClassInstanceCreation SimpleName colf
key SimpleName SimpleType ClassInstanceCreation SimpleName colq
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
k SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName key
k SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName colf
k SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName colq
key SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName k
i SimpleName InfixExpression NumberLiteral empty
base time SimpleName InfixExpression ParenthesizedExpression InfixExpression SimpleName i
base time SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
k SimpleName MethodInvocation SimpleName set timestamp
k SimpleName MethodInvocation InfixExpression SimpleName base time
set timestamp SimpleName MethodInvocation InfixExpression SimpleName base time
tm SimpleName MethodInvocation SimpleName put
tm SimpleName MethodInvocation SimpleName k
tm SimpleName MethodInvocation SimpleName dv
put SimpleName MethodInvocation SimpleName k
put SimpleName MethodInvocation SimpleName dv
k SimpleName MethodInvocation SimpleName dv
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression NumberLiteral empty
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
empty NumberLiteral InfixExpression ForStatement PostfixExpression SimpleName i
tm SimpleName MethodInvocation SimpleName size
tm SimpleName MethodInvocation InfixExpression NumberLiteral empty
size SimpleName MethodInvocation InfixExpression NumberLiteral empty
assert true SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName tm
assert true SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName size
assert true SimpleName MethodInvocation InfixExpression NumberLiteral empty
a SimpleName Assignment ClassInstanceCreation SimpleType SimpleName timestamp filter
tree map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
tree map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
string SimpleName SimpleType ParameterizedType SimpleType SimpleName string
tree map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
tree map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
string SimpleName SimpleType ParameterizedType SimpleType SimpleName string
opts SimpleName MethodInvocation SimpleName put
opts SimpleName MethodInvocation QualifiedName timestamp filterstart
opts SimpleName MethodInvocation StringLiteral gmt
put SimpleName MethodInvocation QualifiedName timestamp filterstart
put SimpleName MethodInvocation StringLiteral gmt
timestamp filterstart QualifiedName MethodInvocation StringLiteral gmt
opts SimpleName MethodInvocation SimpleName put
opts SimpleName MethodInvocation QualifiedName timestamp filterend
opts SimpleName MethodInvocation StringLiteral gmt
put SimpleName MethodInvocation QualifiedName timestamp filterend
put SimpleName MethodInvocation StringLiteral gmt
timestamp filterend QualifiedName MethodInvocation StringLiteral gmt
sorted map iterator SimpleName SimpleType ClassInstanceCreation SimpleName tm
a SimpleName MethodInvocation SimpleName init
a SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName sorted map iterator
a SimpleName MethodInvocation ClassInstanceCreation SimpleName tm
a SimpleName MethodInvocation SimpleName opts
init SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName sorted map iterator
init SimpleName MethodInvocation ClassInstanceCreation SimpleName tm
init SimpleName MethodInvocation SimpleName opts
sorted map iterator SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName opts
tm SimpleName ClassInstanceCreation MethodInvocation SimpleName opts
a SimpleName MethodInvocation SimpleName seek
a SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName range
a SimpleName MethodInvocation SimpleName empty col fams
a SimpleName MethodInvocation BooleanLiteral false
seek SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName range
seek SimpleName MethodInvocation SimpleName empty col fams
seek SimpleName MethodInvocation BooleanLiteral false
range SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName empty col fams
range SimpleName SimpleType ClassInstanceCreation MethodInvocation BooleanLiteral false
empty col fams SimpleName MethodInvocation BooleanLiteral false
size SimpleName MethodInvocation SimpleName a
assert equals SimpleName MethodInvocation MethodInvocation SimpleName size
assert equals SimpleName MethodInvocation MethodInvocation SimpleName a
assert equals SimpleName MethodInvocation NumberLiteral empty
size SimpleName MethodInvocation MethodInvocation NumberLiteral empty
a SimpleName MethodInvocation MethodInvocation NumberLiteral empty
opts SimpleName MethodInvocation SimpleName put
opts SimpleName MethodInvocation QualifiedName timestamp filterend incl
opts SimpleName MethodInvocation StringLiteral false
put SimpleName MethodInvocation QualifiedName timestamp filterend incl
put SimpleName MethodInvocation StringLiteral false
timestamp filterend incl QualifiedName MethodInvocation StringLiteral false
sorted map iterator SimpleName SimpleType ClassInstanceCreation SimpleName tm
a SimpleName MethodInvocation SimpleName init
a SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName sorted map iterator
a SimpleName MethodInvocation ClassInstanceCreation SimpleName tm
a SimpleName MethodInvocation SimpleName opts
init SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName sorted map iterator
init SimpleName MethodInvocation ClassInstanceCreation SimpleName tm
init SimpleName MethodInvocation SimpleName opts
sorted map iterator SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName opts
tm SimpleName ClassInstanceCreation MethodInvocation SimpleName opts
a SimpleName MethodInvocation SimpleName seek
a SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName range
a SimpleName MethodInvocation SimpleName empty col fams
a SimpleName MethodInvocation BooleanLiteral false
seek SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName range
seek SimpleName MethodInvocation SimpleName empty col fams
seek SimpleName MethodInvocation BooleanLiteral false
range SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName empty col fams
range SimpleName SimpleType ClassInstanceCreation MethodInvocation BooleanLiteral false
empty col fams SimpleName MethodInvocation BooleanLiteral false
size SimpleName MethodInvocation SimpleName a
assert equals SimpleName MethodInvocation MethodInvocation SimpleName size
assert equals SimpleName MethodInvocation MethodInvocation SimpleName a
assert equals SimpleName MethodInvocation NumberLiteral empty
size SimpleName MethodInvocation MethodInvocation NumberLiteral empty
a SimpleName MethodInvocation MethodInvocation NumberLiteral empty
opts SimpleName MethodInvocation SimpleName put
opts SimpleName MethodInvocation QualifiedName timestamp filterstart incl
opts SimpleName MethodInvocation StringLiteral false
put SimpleName MethodInvocation QualifiedName timestamp filterstart incl
put SimpleName MethodInvocation StringLiteral false
timestamp filterstart incl QualifiedName MethodInvocation StringLiteral false
sorted map iterator SimpleName SimpleType ClassInstanceCreation SimpleName tm
a SimpleName MethodInvocation SimpleName init
a SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName sorted map iterator
a SimpleName MethodInvocation ClassInstanceCreation SimpleName tm
a SimpleName MethodInvocation SimpleName opts
init SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName sorted map iterator
init SimpleName MethodInvocation ClassInstanceCreation SimpleName tm
init SimpleName MethodInvocation SimpleName opts
sorted map iterator SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName opts
tm SimpleName ClassInstanceCreation MethodInvocation SimpleName opts
a SimpleName MethodInvocation SimpleName seek
a SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName range
a SimpleName MethodInvocation SimpleName empty col fams
a SimpleName MethodInvocation BooleanLiteral false
seek SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName range
seek SimpleName MethodInvocation SimpleName empty col fams
seek SimpleName MethodInvocation BooleanLiteral false
range SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName empty col fams
range SimpleName SimpleType ClassInstanceCreation MethodInvocation BooleanLiteral false
empty col fams SimpleName MethodInvocation BooleanLiteral false
size SimpleName MethodInvocation SimpleName a
assert equals SimpleName MethodInvocation MethodInvocation SimpleName size
assert equals SimpleName MethodInvocation MethodInvocation SimpleName a
assert equals SimpleName MethodInvocation NumberLiteral empty
size SimpleName MethodInvocation MethodInvocation NumberLiteral empty
a SimpleName MethodInvocation MethodInvocation NumberLiteral empty
opts SimpleName MethodInvocation SimpleName put
opts SimpleName MethodInvocation QualifiedName timestamp filterend incl
opts SimpleName MethodInvocation StringLiteral true
put SimpleName MethodInvocation QualifiedName timestamp filterend incl
put SimpleName MethodInvocation StringLiteral true
timestamp filterend incl QualifiedName MethodInvocation StringLiteral true
sorted map iterator SimpleName SimpleType ClassInstanceCreation SimpleName tm
a SimpleName MethodInvocation SimpleName init
a SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName sorted map iterator
a SimpleName MethodInvocation ClassInstanceCreation SimpleName tm
a SimpleName MethodInvocation SimpleName opts
init SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName sorted map iterator
init SimpleName MethodInvocation ClassInstanceCreation SimpleName tm
init SimpleName MethodInvocation SimpleName opts
sorted map iterator SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName opts
tm SimpleName ClassInstanceCreation MethodInvocation SimpleName opts
a SimpleName MethodInvocation SimpleName seek
a SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName range
a SimpleName MethodInvocation SimpleName empty col fams
a SimpleName MethodInvocation BooleanLiteral false
seek SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName range
seek SimpleName MethodInvocation SimpleName empty col fams
seek SimpleName MethodInvocation BooleanLiteral false
range SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName empty col fams
range SimpleName SimpleType ClassInstanceCreation MethodInvocation BooleanLiteral false
empty col fams SimpleName MethodInvocation BooleanLiteral false
size SimpleName MethodInvocation SimpleName a
assert equals SimpleName MethodInvocation MethodInvocation SimpleName size
assert equals SimpleName MethodInvocation MethodInvocation SimpleName a
assert equals SimpleName MethodInvocation NumberLiteral empty
size SimpleName MethodInvocation MethodInvocation NumberLiteral empty
a SimpleName MethodInvocation MethodInvocation NumberLiteral empty
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test timestamp filter
public Modifier MethodDeclaration SimpleType SimpleName io exception
public Modifier MethodDeclaration SimpleType SimpleName parse exception
public Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType long
void PrimitiveType MethodDeclaration SimpleName test timestamp filter
void PrimitiveType MethodDeclaration SimpleType SimpleName io exception
void PrimitiveType MethodDeclaration SimpleType SimpleName parse exception
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType long
test timestamp filter SimpleName MethodDeclaration SimpleType SimpleName io exception
test timestamp filter SimpleName MethodDeclaration SimpleType SimpleName parse exception
test timestamp filter SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType long
io exception SimpleName SimpleType MethodDeclaration SimpleType SimpleName parse exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test timestamp filter
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName parse exception
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test timestamp filter
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName parse exception
