state SimpleName SimpleType SingleVariableDeclaration SimpleName state
properties SimpleName SimpleType SingleVariableDeclaration SimpleName props
rand SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName random
random SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName rand
state SimpleName MethodInvocation SimpleName get integer
state SimpleName MethodInvocation StringLiteral num writes
get integer SimpleName MethodInvocation StringLiteral num writes
num writes SimpleName VariableDeclarationFragment MethodInvocation SimpleName state
num writes SimpleName VariableDeclarationFragment MethodInvocation SimpleName get integer
num writes SimpleName VariableDeclarationFragment MethodInvocation StringLiteral num writes
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName num writes
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName state
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get integer
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation StringLiteral num writes
props SimpleName MethodInvocation SimpleName get property
props SimpleName MethodInvocation StringLiteral max verify
props SimpleName MethodInvocation StringLiteral empty
get property SimpleName MethodInvocation StringLiteral max verify
get property SimpleName MethodInvocation StringLiteral empty
max verify StringLiteral MethodInvocation StringLiteral empty
integer SimpleName MethodInvocation SimpleName parse int
integer SimpleName MethodInvocation MethodInvocation SimpleName props
integer SimpleName MethodInvocation MethodInvocation SimpleName get property
integer SimpleName MethodInvocation MethodInvocation StringLiteral max verify
integer SimpleName MethodInvocation MethodInvocation StringLiteral empty
parse int SimpleName MethodInvocation MethodInvocation SimpleName props
parse int SimpleName MethodInvocation MethodInvocation SimpleName get property
parse int SimpleName MethodInvocation MethodInvocation StringLiteral max verify
parse int SimpleName MethodInvocation MethodInvocation StringLiteral empty
max verify SimpleName VariableDeclarationFragment MethodInvocation SimpleName integer
max verify SimpleName VariableDeclarationFragment MethodInvocation SimpleName parse int
max verify SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName props
max verify SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get property
max verify SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation StringLiteral max verify
max verify SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation StringLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName max verify
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName integer
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName parse int
max verify SimpleName InfixExpression NumberLiteral empty
rand SimpleName MethodInvocation SimpleName next int
rand SimpleName MethodInvocation InfixExpression SimpleName max verify
rand SimpleName MethodInvocation InfixExpression NumberLiteral empty
next int SimpleName MethodInvocation InfixExpression SimpleName max verify
next int SimpleName MethodInvocation InfixExpression NumberLiteral empty
rand SimpleName MethodInvocation InfixExpression NumberLiteral empty
next int SimpleName MethodInvocation InfixExpression NumberLiteral empty
max verify SimpleName InfixExpression MethodInvocation InfixExpression NumberLiteral empty
empty NumberLiteral InfixExpression MethodInvocation InfixExpression NumberLiteral empty
num verify SimpleName VariableDeclarationFragment InfixExpression MethodInvocation SimpleName rand
num verify SimpleName VariableDeclarationFragment InfixExpression MethodInvocation SimpleName next int
num verify SimpleName VariableDeclarationFragment InfixExpression NumberLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName num verify
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment InfixExpression NumberLiteral empty
num writes SimpleName InfixExpression NumberLiteral empty
num verify SimpleName InfixExpression ParenthesizedExpression InfixExpression SimpleName num writes
num verify SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
num writes SimpleName InfixExpression NumberLiteral empty
num verify SimpleName Assignment InfixExpression SimpleName num writes
num verify SimpleName Assignment InfixExpression NumberLiteral empty
state SimpleName MethodInvocation SimpleName get connector
conn SimpleName VariableDeclarationFragment MethodInvocation SimpleName state
conn SimpleName VariableDeclarationFragment MethodInvocation SimpleName get connector
connector SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName conn
state SimpleName MethodInvocation SimpleName get string
state SimpleName MethodInvocation StringLiteral seq table name
get string SimpleName MethodInvocation StringLiteral seq table name
conn SimpleName MethodInvocation SimpleName create batch scanner
conn SimpleName MethodInvocation MethodInvocation SimpleName state
conn SimpleName MethodInvocation MethodInvocation SimpleName get string
conn SimpleName MethodInvocation MethodInvocation StringLiteral seq table name
conn SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName authorizations
conn SimpleName MethodInvocation NumberLiteral empty
create batch scanner SimpleName MethodInvocation MethodInvocation SimpleName state
create batch scanner SimpleName MethodInvocation MethodInvocation SimpleName get string
create batch scanner SimpleName MethodInvocation MethodInvocation StringLiteral seq table name
create batch scanner SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName authorizations
create batch scanner SimpleName MethodInvocation NumberLiteral empty
state SimpleName MethodInvocation MethodInvocation NumberLiteral empty
get string SimpleName MethodInvocation MethodInvocation NumberLiteral empty
seq table name StringLiteral MethodInvocation MethodInvocation NumberLiteral empty
authorizations SimpleName SimpleType ClassInstanceCreation MethodInvocation NumberLiteral empty
scanner SimpleName VariableDeclarationFragment MethodInvocation SimpleName conn
scanner SimpleName VariableDeclarationFragment MethodInvocation SimpleName create batch scanner
scanner SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName state
scanner SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get string
scanner SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation StringLiteral seq table name
scanner SimpleName VariableDeclarationFragment MethodInvocation NumberLiteral empty
batch scanner SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName scanner
count SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName count
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment NumberLiteral empty
list SimpleName SimpleType ParameterizedType SimpleType SimpleName range
array list SimpleName SimpleType ParameterizedType SimpleType SimpleName range
count SimpleName InfixExpression SimpleName num verify
rand SimpleName MethodInvocation SimpleName next int
rand SimpleName MethodInvocation SimpleName num writes
next int SimpleName MethodInvocation SimpleName num writes
range start SimpleName VariableDeclarationFragment MethodInvocation SimpleName rand
range start SimpleName VariableDeclarationFragment MethodInvocation SimpleName next int
range start SimpleName VariableDeclarationFragment MethodInvocation SimpleName num writes
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName range start
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName rand
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName next int
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName num writes
range start SimpleName InfixExpression NumberLiteral empty
range end SimpleName VariableDeclarationFragment InfixExpression SimpleName range start
range end SimpleName VariableDeclarationFragment InfixExpression NumberLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName range end
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment InfixExpression SimpleName range start
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment InfixExpression NumberLiteral empty
num writes SimpleName InfixExpression NumberLiteral empty
range end SimpleName InfixExpression ParenthesizedExpression InfixExpression SimpleName num writes
range end SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
num writes SimpleName InfixExpression NumberLiteral empty
range end SimpleName Assignment InfixExpression SimpleName num writes
range end SimpleName Assignment InfixExpression NumberLiteral empty
range end SimpleName InfixExpression SimpleName range start
range end SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
range start SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
count SimpleName Assignment InfixExpression NumberLiteral empty
string SimpleName MethodInvocation SimpleName format
string SimpleName MethodInvocation StringLiteral % d
string SimpleName MethodInvocation SimpleName range start
format SimpleName MethodInvocation StringLiteral % d
format SimpleName MethodInvocation SimpleName range start
% d StringLiteral MethodInvocation SimpleName range start
text SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName string
text SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName format
text SimpleName SimpleType ClassInstanceCreation MethodInvocation StringLiteral % d
text SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName range start
string SimpleName MethodInvocation SimpleName format
string SimpleName MethodInvocation StringLiteral % d
string SimpleName MethodInvocation SimpleName range end
format SimpleName MethodInvocation StringLiteral % d
format SimpleName MethodInvocation SimpleName range end
% d StringLiteral MethodInvocation SimpleName range end
text SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName string
text SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName format
text SimpleName SimpleType ClassInstanceCreation MethodInvocation StringLiteral % d
text SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName range end
ranges SimpleName MethodInvocation SimpleName add
ranges SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName range
add SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName range
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
range SimpleName MethodInvocation SimpleName merge overlapping
range SimpleName MethodInvocation SimpleName ranges
merge overlapping SimpleName MethodInvocation SimpleName ranges
ranges SimpleName Assignment MethodInvocation SimpleName range
ranges SimpleName Assignment MethodInvocation SimpleName merge overlapping
ranges SimpleName Assignment MethodInvocation SimpleName ranges
collections SimpleName MethodInvocation SimpleName sort
collections SimpleName MethodInvocation SimpleName ranges
sort SimpleName MethodInvocation SimpleName ranges
count SimpleName InfixExpression NumberLiteral empty
ranges SimpleName MethodInvocation SimpleName size
ranges SimpleName MethodInvocation InfixExpression NumberLiteral empty
size SimpleName MethodInvocation InfixExpression NumberLiteral empty
count SimpleName InfixExpression InfixExpression InfixExpression NumberLiteral empty
empty NumberLiteral InfixExpression InfixExpression InfixExpression NumberLiteral empty
ranges SimpleName MethodInvocation SimpleName size
string SimpleName MethodInvocation SimpleName format
string SimpleName MethodInvocation StringLiteral scanning d rows in the following d ranges
string SimpleName MethodInvocation SimpleName count
string SimpleName MethodInvocation MethodInvocation SimpleName ranges
string SimpleName MethodInvocation MethodInvocation SimpleName size
format SimpleName MethodInvocation StringLiteral scanning d rows in the following d ranges
format SimpleName MethodInvocation SimpleName count
format SimpleName MethodInvocation MethodInvocation SimpleName ranges
format SimpleName MethodInvocation MethodInvocation SimpleName size
scanning d rows in the following d ranges StringLiteral MethodInvocation SimpleName count
scanning d rows in the following d ranges StringLiteral MethodInvocation MethodInvocation SimpleName ranges
scanning d rows in the following d ranges StringLiteral MethodInvocation MethodInvocation SimpleName size
count SimpleName MethodInvocation MethodInvocation SimpleName ranges
count SimpleName MethodInvocation MethodInvocation SimpleName size
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation MethodInvocation SimpleName string
log SimpleName MethodInvocation MethodInvocation SimpleName format
log SimpleName MethodInvocation MethodInvocation StringLiteral scanning d rows in the following d ranges
log SimpleName MethodInvocation MethodInvocation SimpleName count
log SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName ranges
log SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName size
debug SimpleName MethodInvocation MethodInvocation SimpleName string
debug SimpleName MethodInvocation MethodInvocation SimpleName format
debug SimpleName MethodInvocation MethodInvocation StringLiteral scanning d rows in the following d ranges
debug SimpleName MethodInvocation MethodInvocation SimpleName count
debug SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName ranges
debug SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName size
range SimpleName SimpleType SingleVariableDeclaration SimpleName r
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation SimpleName r
debug SimpleName MethodInvocation SimpleName r
range SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName ranges
r SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName ranges
scanner SimpleName MethodInvocation SimpleName set ranges
scanner SimpleName MethodInvocation SimpleName ranges
set ranges SimpleName MethodInvocation SimpleName ranges
list SimpleName SimpleType ParameterizedType SimpleType SimpleName key
array list SimpleName SimpleType ParameterizedType SimpleType SimpleName key
entry SimpleName SimpleType ParameterizedType SimpleType SimpleName key
entry SimpleName SimpleType ParameterizedType SimpleType SimpleName value
key SimpleName SimpleType ParameterizedType SimpleType SimpleName value
entry SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName entry
key SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName entry
value SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName entry
entry SimpleName MethodInvocation SimpleName get key
keys SimpleName MethodInvocation SimpleName add
keys SimpleName MethodInvocation MethodInvocation SimpleName entry
keys SimpleName MethodInvocation MethodInvocation SimpleName get key
add SimpleName MethodInvocation MethodInvocation SimpleName entry
add SimpleName MethodInvocation MethodInvocation SimpleName get key
entry SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName scanner
keys SimpleName MethodInvocation SimpleName size
scan returned StringLiteral InfixExpression MethodInvocation SimpleName keys
scan returned StringLiteral InfixExpression MethodInvocation SimpleName size
scan returned StringLiteral InfixExpression StringLiteral rows now verifying
keys SimpleName MethodInvocation InfixExpression StringLiteral rows now verifying
size SimpleName MethodInvocation InfixExpression StringLiteral rows now verifying
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation InfixExpression StringLiteral scan returned
log SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName keys
log SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName size
log SimpleName MethodInvocation InfixExpression StringLiteral rows now verifying
debug SimpleName MethodInvocation InfixExpression StringLiteral scan returned
debug SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName keys
debug SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName size
debug SimpleName MethodInvocation InfixExpression StringLiteral rows now verifying
collections SimpleName MethodInvocation SimpleName sort
collections SimpleName MethodInvocation SimpleName keys
sort SimpleName MethodInvocation SimpleName keys
iterator SimpleName SimpleType ParameterizedType SimpleType SimpleName key
keys SimpleName MethodInvocation SimpleName iterator
iterator SimpleName VariableDeclarationFragment MethodInvocation SimpleName keys
iterator SimpleName VariableDeclarationFragment MethodInvocation SimpleName iterator
iterator SimpleName MethodInvocation SimpleName next
iterator SimpleName MethodInvocation MethodInvocation SimpleName get row
next SimpleName MethodInvocation MethodInvocation SimpleName get row
iterator SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to string
next SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to string
get row SimpleName MethodInvocation MethodInvocation SimpleName to string
integer SimpleName MethodInvocation SimpleName parse int
integer SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get row
integer SimpleName MethodInvocation MethodInvocation SimpleName to string
parse int SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get row
parse int SimpleName MethodInvocation MethodInvocation SimpleName to string
cur key SimpleName VariableDeclarationFragment MethodInvocation SimpleName integer
cur key SimpleName VariableDeclarationFragment MethodInvocation SimpleName parse int
cur key SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName to string
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName cur key
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName integer
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName parse int
done SimpleName VariableDeclarationFragment BooleanLiteral false
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName done
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment BooleanLiteral false
range SimpleName SimpleType SingleVariableDeclaration SimpleName r
r SimpleName MethodInvocation SimpleName get start key
r SimpleName MethodInvocation MethodInvocation SimpleName get row
get start key SimpleName MethodInvocation MethodInvocation SimpleName get row
r SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to string
get start key SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to string
get row SimpleName MethodInvocation MethodInvocation SimpleName to string
integer SimpleName MethodInvocation SimpleName parse int
integer SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get row
integer SimpleName MethodInvocation MethodInvocation SimpleName to string
parse int SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get row
parse int SimpleName MethodInvocation MethodInvocation SimpleName to string
start SimpleName VariableDeclarationFragment MethodInvocation SimpleName integer
start SimpleName VariableDeclarationFragment MethodInvocation SimpleName parse int
start SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName to string
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName start
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName integer
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName parse int
r SimpleName MethodInvocation SimpleName get end key
r SimpleName MethodInvocation MethodInvocation SimpleName get row
get end key SimpleName MethodInvocation MethodInvocation SimpleName get row
r SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to string
get end key SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to string
get row SimpleName MethodInvocation MethodInvocation SimpleName to string
get row SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to char array
to string SimpleName MethodInvocation MethodInvocation SimpleName to char array
string SimpleName MethodInvocation SimpleName copy value of
string SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to string
string SimpleName MethodInvocation MethodInvocation SimpleName to char array
string SimpleName MethodInvocation NumberLiteral empty
string SimpleName MethodInvocation NumberLiteral empty
copy value of SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to string
copy value of SimpleName MethodInvocation MethodInvocation SimpleName to char array
copy value of SimpleName MethodInvocation NumberLiteral empty
copy value of SimpleName MethodInvocation NumberLiteral empty
to string SimpleName MethodInvocation MethodInvocation MethodInvocation NumberLiteral empty
to char array SimpleName MethodInvocation MethodInvocation NumberLiteral empty
to string SimpleName MethodInvocation MethodInvocation MethodInvocation NumberLiteral empty
to char array SimpleName MethodInvocation MethodInvocation NumberLiteral empty
empty NumberLiteral MethodInvocation NumberLiteral empty
integer SimpleName MethodInvocation SimpleName parse int
integer SimpleName MethodInvocation MethodInvocation SimpleName string
integer SimpleName MethodInvocation MethodInvocation SimpleName copy value of
integer SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to char array
integer SimpleName MethodInvocation MethodInvocation NumberLiteral empty
integer SimpleName MethodInvocation MethodInvocation NumberLiteral empty
parse int SimpleName MethodInvocation MethodInvocation SimpleName string
parse int SimpleName MethodInvocation MethodInvocation SimpleName copy value of
parse int SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to char array
parse int SimpleName MethodInvocation MethodInvocation NumberLiteral empty
parse int SimpleName MethodInvocation MethodInvocation NumberLiteral empty
end SimpleName VariableDeclarationFragment MethodInvocation SimpleName integer
end SimpleName VariableDeclarationFragment MethodInvocation SimpleName parse int
end SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName string
end SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName copy value of
end SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation NumberLiteral empty
end SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation NumberLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName end
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName integer
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName parse int
i SimpleName VariableDeclarationFragment SimpleName start
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName start
i SimpleName InfixExpression SimpleName end
missing key StringLiteral InfixExpression SimpleName i
log SimpleName MethodInvocation SimpleName error
log SimpleName MethodInvocation InfixExpression StringLiteral missing key
log SimpleName MethodInvocation InfixExpression SimpleName i
error SimpleName MethodInvocation InfixExpression StringLiteral missing key
error SimpleName MethodInvocation InfixExpression SimpleName i
cur key SimpleName InfixExpression SimpleName i
extra key StringLiteral InfixExpression SimpleName cur key
log SimpleName MethodInvocation SimpleName error
log SimpleName MethodInvocation InfixExpression StringLiteral extra key
log SimpleName MethodInvocation InfixExpression SimpleName cur key
error SimpleName MethodInvocation InfixExpression StringLiteral extra key
error SimpleName MethodInvocation InfixExpression SimpleName cur key
iterator SimpleName MethodInvocation SimpleName has next
iterator SimpleName MethodInvocation InfixExpression BooleanLiteral false
has next SimpleName MethodInvocation InfixExpression BooleanLiteral false
done SimpleName Assignment BooleanLiteral true
iterator SimpleName MethodInvocation SimpleName next
iterator SimpleName MethodInvocation MethodInvocation SimpleName get row
next SimpleName MethodInvocation MethodInvocation SimpleName get row
iterator SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to string
next SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to string
get row SimpleName MethodInvocation MethodInvocation SimpleName to string
integer SimpleName MethodInvocation SimpleName parse int
integer SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get row
integer SimpleName MethodInvocation MethodInvocation SimpleName to string
parse int SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get row
parse int SimpleName MethodInvocation MethodInvocation SimpleName to string
cur key SimpleName Assignment MethodInvocation SimpleName integer
cur key SimpleName Assignment MethodInvocation SimpleName parse int
cur key SimpleName Assignment MethodInvocation MethodInvocation SimpleName to string
cur key SimpleName InfixExpression SimpleName i
missing key StringLiteral InfixExpression SimpleName i
log SimpleName MethodInvocation SimpleName error
log SimpleName MethodInvocation InfixExpression StringLiteral missing key
log SimpleName MethodInvocation InfixExpression SimpleName i
error SimpleName MethodInvocation InfixExpression StringLiteral missing key
error SimpleName MethodInvocation InfixExpression SimpleName i
iterator SimpleName MethodInvocation SimpleName has next
iterator SimpleName MethodInvocation SimpleName next
iterator SimpleName MethodInvocation MethodInvocation SimpleName get row
next SimpleName MethodInvocation MethodInvocation SimpleName get row
iterator SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to string
next SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to string
get row SimpleName MethodInvocation MethodInvocation SimpleName to string
integer SimpleName MethodInvocation SimpleName parse int
integer SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get row
integer SimpleName MethodInvocation MethodInvocation SimpleName to string
parse int SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get row
parse int SimpleName MethodInvocation MethodInvocation SimpleName to string
cur key SimpleName Assignment MethodInvocation SimpleName integer
cur key SimpleName Assignment MethodInvocation SimpleName parse int
cur key SimpleName Assignment MethodInvocation MethodInvocation SimpleName to string
done SimpleName Assignment BooleanLiteral true
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName end
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
end SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
range SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName ranges
r SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName ranges
ranges SimpleName EnhancedForStatement Block VariableDeclarationStatement PrimitiveType int
ranges SimpleName EnhancedForStatement Block VariableDeclarationStatement PrimitiveType int
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral verify is now complete
debug SimpleName MethodInvocation StringLiteral verify is now complete
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
ranges SimpleName EnhancedForStatement Block EnhancedForStatement SimpleName scanner
scanner SimpleName EnhancedForStatement Block VariableDeclarationStatement PrimitiveType int
scanner SimpleName EnhancedForStatement Block VariableDeclarationStatement PrimitiveType boolean
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType boolean
int PrimitiveType VariableDeclarationStatement Block EnhancedForStatement SimpleName ranges
boolean PrimitiveType VariableDeclarationStatement Block EnhancedForStatement SimpleName ranges
override SimpleName MarkerAnnotation MethodDeclaration Modifier public
override SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
override SimpleName MarkerAnnotation MethodDeclaration SimpleName visit
override SimpleName MarkerAnnotation MethodDeclaration SingleVariableDeclaration SimpleName state
override SimpleName MarkerAnnotation MethodDeclaration SingleVariableDeclaration SimpleName props
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName visit
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName state
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName state
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName properties
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName props
public Modifier MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration SimpleName visit
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName state
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName state
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName properties
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName props
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
void PrimitiveType MethodDeclaration Block EnhancedForStatement SimpleName ranges
void PrimitiveType MethodDeclaration Block EnhancedForStatement SimpleName scanner
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType boolean
void PrimitiveType MethodDeclaration Block EnhancedForStatement SimpleName ranges
visit SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName state
visit SimpleName MethodDeclaration SingleVariableDeclaration SimpleName state
visit SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName properties
visit SimpleName MethodDeclaration SingleVariableDeclaration SimpleName props
visit SimpleName MethodDeclaration SimpleType SimpleName exception
visit SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
visit SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
visit SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
visit SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
visit SimpleName MethodDeclaration Block EnhancedForStatement SimpleName ranges
visit SimpleName MethodDeclaration Block EnhancedForStatement SimpleName scanner
visit SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
visit SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType boolean
visit SimpleName MethodDeclaration Block EnhancedForStatement SimpleName ranges
state SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName props
state SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
props SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName override
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName visit
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName state
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName props
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName override
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName visit
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName state
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName props
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
