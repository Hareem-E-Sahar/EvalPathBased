int PrimitiveType SingleVariableDeclaration SimpleName num rows
int PrimitiveType SingleVariableDeclaration SimpleName num cols
int PrimitiveType SingleVariableDeclaration SimpleName num lookups
string SimpleName SimpleType SingleVariableDeclaration SimpleName map type
sorted map SimpleName SimpleType ParameterizedType SimpleType SimpleName key
sorted map SimpleName SimpleType ParameterizedType SimpleType SimpleName value
key SimpleName SimpleType ParameterizedType SimpleType SimpleName value
native map SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName nm
map type SimpleName MethodInvocation SimpleName equals
map type SimpleName MethodInvocation StringLiteral skip list
equals SimpleName MethodInvocation StringLiteral skip list
concurrent skip list map SimpleName SimpleType ParameterizedType SimpleType SimpleName key
concurrent skip list map SimpleName SimpleType ParameterizedType SimpleType SimpleName value
key SimpleName SimpleType ParameterizedType SimpleType SimpleName value
map type SimpleName MethodInvocation SimpleName equals
map type SimpleName MethodInvocation StringLiteral tree map
equals SimpleName MethodInvocation StringLiteral tree map
tree map SimpleName SimpleType ParameterizedType SimpleType SimpleName key
tree map SimpleName SimpleType ParameterizedType SimpleType SimpleName value
key SimpleName SimpleType ParameterizedType SimpleType SimpleName value
collections SimpleName MethodInvocation SimpleName synchronized sorted map
tm SimpleName Assignment MethodInvocation SimpleName collections
tm SimpleName Assignment MethodInvocation SimpleName synchronized sorted map
map type SimpleName MethodInvocation SimpleName equals
map type SimpleName MethodInvocation StringLiteral native map
equals SimpleName MethodInvocation StringLiteral native map
nm SimpleName Assignment ClassInstanceCreation SimpleType SimpleName native map
illegal argument exception SimpleName SimpleType ClassInstanceCreation StringLiteral map type must be skip list tree map or native map
random SimpleName SimpleType ClassInstanceCreation NumberLiteral empty
rand SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName random
rand SimpleName VariableDeclarationFragment ClassInstanceCreation NumberLiteral empty
random SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName rand
system SimpleName MethodInvocation SimpleName current time millis
tps SimpleName VariableDeclarationFragment MethodInvocation SimpleName system
tps SimpleName VariableDeclarationFragment MethodInvocation SimpleName current time millis
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName tps
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName system
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName current time millis
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression SimpleName num rows
rand SimpleName MethodInvocation SimpleName next int
rand SimpleName MethodInvocation NumberLiteral empty
next int SimpleName MethodInvocation NumberLiteral empty
row SimpleName VariableDeclarationFragment MethodInvocation SimpleName rand
row SimpleName VariableDeclarationFragment MethodInvocation SimpleName next int
row SimpleName VariableDeclarationFragment MethodInvocation NumberLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName row
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName rand
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName next int
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation NumberLiteral empty
nm SimpleName MethodInvocation SimpleName row
m SimpleName VariableDeclarationFragment MethodInvocation SimpleName nm
m SimpleName VariableDeclarationFragment MethodInvocation SimpleName row
mutation SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName m
j SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName j
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
j SimpleName InfixExpression SimpleName num cols
rand SimpleName MethodInvocation SimpleName next int
rand SimpleName MethodInvocation NumberLiteral empty
next int SimpleName MethodInvocation NumberLiteral empty
col SimpleName VariableDeclarationFragment MethodInvocation SimpleName rand
col SimpleName VariableDeclarationFragment MethodInvocation SimpleName next int
col SimpleName VariableDeclarationFragment MethodInvocation NumberLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName col
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName rand
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName next int
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation NumberLiteral empty
test StringLiteral MethodInvocation SimpleName get bytes
value SimpleName SimpleType ClassInstanceCreation MethodInvocation StringLiteral test
value SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get bytes
val SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName value
val SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation StringLiteral test
val SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName get bytes
value SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName val
pc SimpleName MethodInvocation SimpleName m
pc SimpleName MethodInvocation SimpleName col
pc SimpleName MethodInvocation SimpleName val
m SimpleName MethodInvocation SimpleName col
m SimpleName MethodInvocation SimpleName val
col SimpleName MethodInvocation SimpleName val
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName j
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName num cols
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName j
j SimpleName InfixExpression ForStatement PostfixExpression SimpleName j
num cols SimpleName InfixExpression ForStatement PostfixExpression SimpleName j
nm SimpleName MethodInvocation SimpleName mutate
nm SimpleName MethodInvocation SimpleName m
nm SimpleName MethodInvocation SimpleName i
mutate SimpleName MethodInvocation SimpleName m
mutate SimpleName MethodInvocation SimpleName i
m SimpleName MethodInvocation SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName num rows
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
num rows SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression SimpleName num rows
rand SimpleName MethodInvocation SimpleName next int
rand SimpleName MethodInvocation NumberLiteral empty
next int SimpleName MethodInvocation NumberLiteral empty
row SimpleName VariableDeclarationFragment MethodInvocation SimpleName rand
row SimpleName VariableDeclarationFragment MethodInvocation SimpleName next int
row SimpleName VariableDeclarationFragment MethodInvocation NumberLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName row
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName rand
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName next int
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation NumberLiteral empty
j SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName j
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
j SimpleName InfixExpression SimpleName num cols
rand SimpleName MethodInvocation SimpleName next int
rand SimpleName MethodInvocation NumberLiteral empty
next int SimpleName MethodInvocation NumberLiteral empty
col SimpleName VariableDeclarationFragment MethodInvocation SimpleName rand
col SimpleName VariableDeclarationFragment MethodInvocation SimpleName next int
col SimpleName VariableDeclarationFragment MethodInvocation NumberLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName col
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName rand
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName next int
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation NumberLiteral empty
nk SimpleName MethodInvocation SimpleName row
nk SimpleName MethodInvocation SimpleName col
row SimpleName MethodInvocation SimpleName col
key SimpleName VariableDeclarationFragment MethodInvocation SimpleName nk
key SimpleName VariableDeclarationFragment MethodInvocation SimpleName row
key SimpleName VariableDeclarationFragment MethodInvocation SimpleName col
key SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName key
test StringLiteral MethodInvocation SimpleName get bytes
value SimpleName SimpleType ClassInstanceCreation MethodInvocation StringLiteral test
value SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get bytes
val SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName value
val SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation StringLiteral test
val SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName get bytes
value SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName val
tm SimpleName MethodInvocation SimpleName put
tm SimpleName MethodInvocation SimpleName key
tm SimpleName MethodInvocation SimpleName val
put SimpleName MethodInvocation SimpleName key
put SimpleName MethodInvocation SimpleName val
key SimpleName MethodInvocation SimpleName val
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName j
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName num cols
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName j
j SimpleName InfixExpression ForStatement PostfixExpression SimpleName j
num cols SimpleName InfixExpression ForStatement PostfixExpression SimpleName j
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName num rows
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
num rows SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
system SimpleName MethodInvocation SimpleName current time millis
tpe SimpleName VariableDeclarationFragment MethodInvocation SimpleName system
tpe SimpleName VariableDeclarationFragment MethodInvocation SimpleName current time millis
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName tpe
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName system
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName current time millis
entry SimpleName SimpleType ParameterizedType SimpleType SimpleName key
entry SimpleName SimpleType ParameterizedType SimpleType SimpleName value
key SimpleName SimpleType ParameterizedType SimpleType SimpleName value
nm SimpleName MethodInvocation SimpleName iterator
iter SimpleName Assignment MethodInvocation SimpleName nm
iter SimpleName Assignment MethodInvocation SimpleName iterator
tm SimpleName MethodInvocation SimpleName entry set
tm SimpleName MethodInvocation MethodInvocation SimpleName iterator
entry set SimpleName MethodInvocation MethodInvocation SimpleName iterator
iter SimpleName Assignment MethodInvocation MethodInvocation SimpleName tm
iter SimpleName Assignment MethodInvocation MethodInvocation SimpleName entry set
iter SimpleName Assignment MethodInvocation SimpleName iterator
system SimpleName MethodInvocation SimpleName current time millis
tis SimpleName VariableDeclarationFragment MethodInvocation SimpleName system
tis SimpleName VariableDeclarationFragment MethodInvocation SimpleName current time millis
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName tis
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName system
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName current time millis
iter SimpleName MethodInvocation SimpleName has next
iter SimpleName MethodInvocation SimpleName next
system SimpleName MethodInvocation SimpleName current time millis
tie SimpleName VariableDeclarationFragment MethodInvocation SimpleName system
tie SimpleName VariableDeclarationFragment MethodInvocation SimpleName current time millis
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName tie
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName system
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName current time millis
random SimpleName SimpleType ClassInstanceCreation NumberLiteral empty
rand SimpleName Assignment ClassInstanceCreation SimpleType SimpleName random
rand SimpleName Assignment ClassInstanceCreation NumberLiteral empty
int PrimitiveType ArrayType ArrayCreation SimpleName num lookups
rows to lookup SimpleName VariableDeclarationFragment ArrayCreation ArrayType PrimitiveType int
rows to lookup SimpleName VariableDeclarationFragment ArrayCreation SimpleName num lookups
int PrimitiveType ArrayType VariableDeclarationStatement VariableDeclarationFragment SimpleName rows to lookup
int PrimitiveType ArrayType ArrayCreation SimpleName num lookups
cols to lookup SimpleName VariableDeclarationFragment ArrayCreation ArrayType PrimitiveType int
cols to lookup SimpleName VariableDeclarationFragment ArrayCreation SimpleName num lookups
int PrimitiveType ArrayType VariableDeclarationStatement VariableDeclarationFragment SimpleName cols to lookup
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
math SimpleName MethodInvocation SimpleName min
math SimpleName MethodInvocation SimpleName num lookups
math SimpleName MethodInvocation SimpleName num rows
min SimpleName MethodInvocation SimpleName num lookups
min SimpleName MethodInvocation SimpleName num rows
num lookups SimpleName MethodInvocation SimpleName num rows
i SimpleName InfixExpression MethodInvocation SimpleName math
i SimpleName InfixExpression MethodInvocation SimpleName min
i SimpleName InfixExpression MethodInvocation SimpleName num lookups
i SimpleName InfixExpression MethodInvocation SimpleName num rows
rand SimpleName MethodInvocation SimpleName next int
rand SimpleName MethodInvocation NumberLiteral empty
next int SimpleName MethodInvocation NumberLiteral empty
row SimpleName VariableDeclarationFragment MethodInvocation SimpleName rand
row SimpleName VariableDeclarationFragment MethodInvocation SimpleName next int
row SimpleName VariableDeclarationFragment MethodInvocation NumberLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName row
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName rand
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName next int
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation NumberLiteral empty
col SimpleName VariableDeclarationFragment PrefixExpression NumberLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName col
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment PrefixExpression NumberLiteral empty
j SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName j
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
j SimpleName InfixExpression SimpleName num cols
rand SimpleName MethodInvocation SimpleName next int
rand SimpleName MethodInvocation NumberLiteral empty
next int SimpleName MethodInvocation NumberLiteral empty
col SimpleName Assignment MethodInvocation SimpleName rand
col SimpleName Assignment MethodInvocation SimpleName next int
col SimpleName Assignment MethodInvocation NumberLiteral empty
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName j
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName num cols
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName j
j SimpleName InfixExpression ForStatement PostfixExpression SimpleName j
num cols SimpleName InfixExpression ForStatement PostfixExpression SimpleName j
rows to lookup SimpleName ArrayAccess SimpleName i
rows to lookup SimpleName ArrayAccess Assignment SimpleName row
i SimpleName ArrayAccess Assignment SimpleName row
cols to lookup SimpleName ArrayAccess SimpleName i
cols to lookup SimpleName ArrayAccess Assignment SimpleName col
i SimpleName ArrayAccess Assignment SimpleName col
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
system SimpleName MethodInvocation SimpleName current time millis
tgs SimpleName VariableDeclarationFragment MethodInvocation SimpleName system
tgs SimpleName VariableDeclarationFragment MethodInvocation SimpleName current time millis
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName tgs
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName system
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName current time millis
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression SimpleName num lookups
rows to lookup SimpleName ArrayAccess SimpleName i
cols to lookup SimpleName ArrayAccess SimpleName i
nk SimpleName MethodInvocation ArrayAccess SimpleName rows to lookup
nk SimpleName MethodInvocation ArrayAccess SimpleName i
nk SimpleName MethodInvocation ArrayAccess SimpleName cols to lookup
nk SimpleName MethodInvocation ArrayAccess SimpleName i
rows to lookup SimpleName ArrayAccess MethodInvocation ArrayAccess SimpleName cols to lookup
rows to lookup SimpleName ArrayAccess MethodInvocation ArrayAccess SimpleName i
i SimpleName ArrayAccess MethodInvocation ArrayAccess SimpleName cols to lookup
i SimpleName ArrayAccess MethodInvocation ArrayAccess SimpleName i
key SimpleName VariableDeclarationFragment MethodInvocation SimpleName nk
key SimpleName VariableDeclarationFragment MethodInvocation ArrayAccess SimpleName rows to lookup
key SimpleName VariableDeclarationFragment MethodInvocation ArrayAccess SimpleName i
key SimpleName VariableDeclarationFragment MethodInvocation ArrayAccess SimpleName cols to lookup
key SimpleName VariableDeclarationFragment MethodInvocation ArrayAccess SimpleName i
key SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName key
nm SimpleName MethodInvocation SimpleName get
nm SimpleName MethodInvocation SimpleName key
get SimpleName MethodInvocation SimpleName key
rows to lookup SimpleName ArrayAccess SimpleName i
cols to lookup SimpleName ArrayAccess SimpleName i
did not find StringLiteral InfixExpression ArrayAccess SimpleName rows to lookup
did not find StringLiteral InfixExpression ArrayAccess SimpleName i
did not find StringLiteral InfixExpression StringLiteral empty
did not find StringLiteral InfixExpression ArrayAccess SimpleName cols to lookup
did not find StringLiteral InfixExpression ArrayAccess SimpleName i
did not find StringLiteral InfixExpression StringLiteral empty
did not find StringLiteral InfixExpression SimpleName i
rows to lookup SimpleName ArrayAccess InfixExpression StringLiteral empty
i SimpleName ArrayAccess InfixExpression StringLiteral empty
rows to lookup SimpleName ArrayAccess InfixExpression ArrayAccess SimpleName cols to lookup
rows to lookup SimpleName ArrayAccess InfixExpression ArrayAccess SimpleName i
i SimpleName ArrayAccess InfixExpression ArrayAccess SimpleName cols to lookup
i SimpleName ArrayAccess InfixExpression ArrayAccess SimpleName i
rows to lookup SimpleName ArrayAccess InfixExpression StringLiteral empty
i SimpleName ArrayAccess InfixExpression StringLiteral empty
rows to lookup SimpleName ArrayAccess InfixExpression SimpleName i
i SimpleName ArrayAccess InfixExpression SimpleName i
empty StringLiteral InfixExpression ArrayAccess SimpleName cols to lookup
empty StringLiteral InfixExpression ArrayAccess SimpleName i
empty StringLiteral InfixExpression StringLiteral empty
empty StringLiteral InfixExpression SimpleName i
cols to lookup SimpleName ArrayAccess InfixExpression StringLiteral empty
i SimpleName ArrayAccess InfixExpression StringLiteral empty
cols to lookup SimpleName ArrayAccess InfixExpression SimpleName i
i SimpleName ArrayAccess InfixExpression SimpleName i
empty StringLiteral InfixExpression SimpleName i
runtime exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral did not find
runtime exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral empty
runtime exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral empty
runtime exception SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName num lookups
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
num lookups SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression SimpleName num lookups
rows to lookup SimpleName ArrayAccess SimpleName i
cols to lookup SimpleName ArrayAccess SimpleName i
nk SimpleName MethodInvocation ArrayAccess SimpleName rows to lookup
nk SimpleName MethodInvocation ArrayAccess SimpleName i
nk SimpleName MethodInvocation ArrayAccess SimpleName cols to lookup
nk SimpleName MethodInvocation ArrayAccess SimpleName i
rows to lookup SimpleName ArrayAccess MethodInvocation ArrayAccess SimpleName cols to lookup
rows to lookup SimpleName ArrayAccess MethodInvocation ArrayAccess SimpleName i
i SimpleName ArrayAccess MethodInvocation ArrayAccess SimpleName cols to lookup
i SimpleName ArrayAccess MethodInvocation ArrayAccess SimpleName i
key SimpleName VariableDeclarationFragment MethodInvocation SimpleName nk
key SimpleName VariableDeclarationFragment MethodInvocation ArrayAccess SimpleName rows to lookup
key SimpleName VariableDeclarationFragment MethodInvocation ArrayAccess SimpleName i
key SimpleName VariableDeclarationFragment MethodInvocation ArrayAccess SimpleName cols to lookup
key SimpleName VariableDeclarationFragment MethodInvocation ArrayAccess SimpleName i
key SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName key
tm SimpleName MethodInvocation SimpleName get
tm SimpleName MethodInvocation SimpleName key
get SimpleName MethodInvocation SimpleName key
rows to lookup SimpleName ArrayAccess SimpleName i
cols to lookup SimpleName ArrayAccess SimpleName i
did not find StringLiteral InfixExpression ArrayAccess SimpleName rows to lookup
did not find StringLiteral InfixExpression ArrayAccess SimpleName i
did not find StringLiteral InfixExpression StringLiteral empty
did not find StringLiteral InfixExpression ArrayAccess SimpleName cols to lookup
did not find StringLiteral InfixExpression ArrayAccess SimpleName i
did not find StringLiteral InfixExpression StringLiteral empty
did not find StringLiteral InfixExpression SimpleName i
rows to lookup SimpleName ArrayAccess InfixExpression StringLiteral empty
i SimpleName ArrayAccess InfixExpression StringLiteral empty
rows to lookup SimpleName ArrayAccess InfixExpression ArrayAccess SimpleName cols to lookup
rows to lookup SimpleName ArrayAccess InfixExpression ArrayAccess SimpleName i
i SimpleName ArrayAccess InfixExpression ArrayAccess SimpleName cols to lookup
i SimpleName ArrayAccess InfixExpression ArrayAccess SimpleName i
rows to lookup SimpleName ArrayAccess InfixExpression StringLiteral empty
i SimpleName ArrayAccess InfixExpression StringLiteral empty
rows to lookup SimpleName ArrayAccess InfixExpression SimpleName i
i SimpleName ArrayAccess InfixExpression SimpleName i
empty StringLiteral InfixExpression ArrayAccess SimpleName cols to lookup
empty StringLiteral InfixExpression ArrayAccess SimpleName i
empty StringLiteral InfixExpression StringLiteral empty
empty StringLiteral InfixExpression SimpleName i
cols to lookup SimpleName ArrayAccess InfixExpression StringLiteral empty
i SimpleName ArrayAccess InfixExpression StringLiteral empty
cols to lookup SimpleName ArrayAccess InfixExpression SimpleName i
i SimpleName ArrayAccess InfixExpression SimpleName i
empty StringLiteral InfixExpression SimpleName i
runtime exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral did not find
runtime exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral empty
runtime exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral empty
runtime exception SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName num lookups
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
num lookups SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
system SimpleName MethodInvocation SimpleName current time millis
tge SimpleName VariableDeclarationFragment MethodInvocation SimpleName system
tge SimpleName VariableDeclarationFragment MethodInvocation SimpleName current time millis
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName tge
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName system
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName current time millis
mem used SimpleName VariableDeclarationFragment NumberLiteral empty
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName mem used
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment NumberLiteral empty
nm SimpleName MethodInvocation SimpleName get memory used
mem used SimpleName Assignment MethodInvocation SimpleName nm
mem used SimpleName Assignment MethodInvocation SimpleName get memory used
tm SimpleName MethodInvocation SimpleName size
nm SimpleName MethodInvocation SimpleName size
nm SimpleName InfixExpression ConditionalExpression MethodInvocation SimpleName tm
nm SimpleName InfixExpression ConditionalExpression MethodInvocation SimpleName size
nm SimpleName InfixExpression ConditionalExpression MethodInvocation SimpleName nm
nm SimpleName InfixExpression ConditionalExpression MethodInvocation SimpleName size
tm SimpleName MethodInvocation ConditionalExpression MethodInvocation SimpleName nm
tm SimpleName MethodInvocation ConditionalExpression MethodInvocation SimpleName size
size SimpleName MethodInvocation ConditionalExpression MethodInvocation SimpleName nm
size SimpleName MethodInvocation ConditionalExpression MethodInvocation SimpleName size
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName size
system SimpleName MethodInvocation SimpleName current time millis
tds SimpleName VariableDeclarationFragment MethodInvocation SimpleName system
tds SimpleName VariableDeclarationFragment MethodInvocation SimpleName current time millis
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName tds
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName system
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName current time millis
nm SimpleName MethodInvocation SimpleName delete
system SimpleName MethodInvocation SimpleName current time millis
tde SimpleName VariableDeclarationFragment MethodInvocation SimpleName system
tde SimpleName VariableDeclarationFragment MethodInvocation SimpleName current time millis
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName tde
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName system
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName current time millis
tm SimpleName MethodInvocation SimpleName clear
system SimpleName MethodInvocation SimpleName gc
system SimpleName MethodInvocation SimpleName gc
system SimpleName MethodInvocation SimpleName gc
system SimpleName MethodInvocation SimpleName gc
util wait thread SimpleName MethodInvocation SimpleName sleep
util wait thread SimpleName MethodInvocation NumberLiteral empty
sleep SimpleName MethodInvocation NumberLiteral empty
empty StringLiteral InfixExpression SimpleName map type
num rows SimpleName InfixExpression SimpleName num cols
tpe SimpleName InfixExpression SimpleName tps
tpe SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral .
tps SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral .
tie SimpleName InfixExpression SimpleName tis
tie SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral .
tis SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral .
tge SimpleName InfixExpression SimpleName tgs
tge SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral .
tgs SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral .
num lookups SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral .
tde SimpleName InfixExpression SimpleName tds
tde SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral .
tds SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral .
systemout QualifiedName MethodInvocation SimpleName printf
systemout QualifiedName MethodInvocation StringLiteral map type s put rate . f scan rate . f get rate . f delete time : % . f mem : d
systemout QualifiedName MethodInvocation InfixExpression StringLiteral empty
systemout QualifiedName MethodInvocation InfixExpression SimpleName map type
systemout QualifiedName MethodInvocation InfixExpression ParenthesizedExpression SimpleName size
printf SimpleName MethodInvocation StringLiteral map type s put rate . f scan rate . f get rate . f delete time : % . f mem : d
printf SimpleName MethodInvocation InfixExpression StringLiteral empty
printf SimpleName MethodInvocation InfixExpression SimpleName map type
printf SimpleName MethodInvocation InfixExpression ParenthesizedExpression SimpleName size
printf SimpleName MethodInvocation InfixExpression SimpleName num lookups
map type s put rate . f scan rate . f get rate . f delete time : % . f mem : d StringLiteral MethodInvocation InfixExpression StringLiteral empty
map type s put rate . f scan rate . f get rate . f delete time : % . f mem : d StringLiteral MethodInvocation InfixExpression SimpleName map type
map type s put rate . f scan rate . f get rate . f delete time : % . f mem : d StringLiteral MethodInvocation InfixExpression ParenthesizedExpression SimpleName size
map type s put rate . f scan rate . f get rate . f delete time : % . f mem : d StringLiteral MethodInvocation InfixExpression SimpleName num lookups
map type s put rate . f scan rate . f get rate . f delete time : % . f mem : d StringLiteral MethodInvocation InfixExpression NumberLiteral .
empty StringLiteral InfixExpression MethodInvocation InfixExpression SimpleName num lookups
map type SimpleName InfixExpression MethodInvocation InfixExpression SimpleName num lookups
empty StringLiteral InfixExpression MethodInvocation InfixExpression NumberLiteral .
map type SimpleName InfixExpression MethodInvocation InfixExpression NumberLiteral .
empty StringLiteral InfixExpression MethodInvocation SimpleName mem used
map type SimpleName InfixExpression MethodInvocation SimpleName mem used
size SimpleName ParenthesizedExpression InfixExpression MethodInvocation SimpleName mem used
num lookups SimpleName InfixExpression MethodInvocation InfixExpression NumberLiteral .
num lookups SimpleName InfixExpression MethodInvocation SimpleName mem used
. NumberLiteral InfixExpression MethodInvocation SimpleName mem used
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType long
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType long
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType long
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType long
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType long
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType long
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType long
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType long
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType long
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType long
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType long
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType long
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType long
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType long
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType long
static Modifier MethodDeclaration PrimitiveType void
static Modifier MethodDeclaration SimpleName run performance test
static Modifier MethodDeclaration SingleVariableDeclaration PrimitiveType int
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName num rows
static Modifier MethodDeclaration SingleVariableDeclaration PrimitiveType int
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName num cols
static Modifier MethodDeclaration SingleVariableDeclaration PrimitiveType int
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName num lookups
void PrimitiveType MethodDeclaration SimpleName run performance test
void PrimitiveType MethodDeclaration SingleVariableDeclaration PrimitiveType int
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName num rows
void PrimitiveType MethodDeclaration SingleVariableDeclaration PrimitiveType int
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName num cols
void PrimitiveType MethodDeclaration SingleVariableDeclaration PrimitiveType int
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName num lookups
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName map type
run performance test SimpleName MethodDeclaration SingleVariableDeclaration PrimitiveType int
run performance test SimpleName MethodDeclaration SingleVariableDeclaration SimpleName num rows
run performance test SimpleName MethodDeclaration SingleVariableDeclaration PrimitiveType int
run performance test SimpleName MethodDeclaration SingleVariableDeclaration SimpleName num cols
