map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
map SimpleName SimpleType ParameterizedType SimpleType SimpleName object
string SimpleName SimpleType ParameterizedType SimpleType SimpleName object
int PrimitiveType SingleVariableDeclaration SimpleName version
buffer SimpleName SimpleType SingleVariableDeclaration SimpleName buffer
map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
map SimpleName SimpleType ParameterizedType SimpleType SimpleName object
string SimpleName SimpleType ParameterizedType SimpleType SimpleName object
buffer SimpleName MethodInvocation SimpleName get int
flags SimpleName VariableDeclarationFragment MethodInvocation SimpleName buffer
flags SimpleName VariableDeclarationFragment MethodInvocation SimpleName get int
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName flags
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName buffer
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get int
version SimpleName InfixExpression SimpleName sftp v
buffer SimpleName MethodInvocation SimpleName get u byte
type SimpleName VariableDeclarationFragment MethodInvocation SimpleName buffer
type SimpleName VariableDeclarationFragment MethodInvocation SimpleName get u byte
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName type
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName buffer
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get u byte
attrs SimpleName MethodInvocation SimpleName put
attrs SimpleName MethodInvocation StringLiteral is regular
attrs SimpleName MethodInvocation QualifiedName booleantrue
put SimpleName MethodInvocation StringLiteral is regular
put SimpleName MethodInvocation QualifiedName booleantrue
is regular StringLiteral MethodInvocation QualifiedName booleantrue
attrs SimpleName MethodInvocation SimpleName put
attrs SimpleName MethodInvocation StringLiteral is directory
attrs SimpleName MethodInvocation QualifiedName booleantrue
put SimpleName MethodInvocation StringLiteral is directory
put SimpleName MethodInvocation QualifiedName booleantrue
is directory StringLiteral MethodInvocation QualifiedName booleantrue
attrs SimpleName MethodInvocation SimpleName put
attrs SimpleName MethodInvocation StringLiteral is symbolic link
attrs SimpleName MethodInvocation QualifiedName booleantrue
put SimpleName MethodInvocation StringLiteral is symbolic link
put SimpleName MethodInvocation QualifiedName booleantrue
is symbolic link StringLiteral MethodInvocation QualifiedName booleantrue
attrs SimpleName MethodInvocation SimpleName put
attrs SimpleName MethodInvocation StringLiteral is other
attrs SimpleName MethodInvocation QualifiedName booleantrue
put SimpleName MethodInvocation StringLiteral is other
put SimpleName MethodInvocation QualifiedName booleantrue
is other StringLiteral MethodInvocation QualifiedName booleantrue
type SimpleName SwitchStatement SwitchCase SimpleName ssh filexfer type regular
type SimpleName SwitchStatement ExpressionStatement MethodInvocation SimpleName attrs
type SimpleName SwitchStatement ExpressionStatement MethodInvocation SimpleName put
type SimpleName SwitchStatement ExpressionStatement MethodInvocation StringLiteral is regular
type SimpleName SwitchStatement ExpressionStatement MethodInvocation QualifiedName booleantrue
type SimpleName SwitchStatement SwitchCase SimpleName ssh filexfer type directory
type SimpleName SwitchStatement ExpressionStatement MethodInvocation SimpleName attrs
type SimpleName SwitchStatement ExpressionStatement MethodInvocation SimpleName put
type SimpleName SwitchStatement ExpressionStatement MethodInvocation StringLiteral is directory
type SimpleName SwitchStatement ExpressionStatement MethodInvocation QualifiedName booleantrue
ssh filexfer type regular SimpleName SwitchCase SwitchStatement SwitchCase SimpleName ssh filexfer type directory
ssh filexfer type directory SimpleName SwitchCase SwitchStatement SwitchCase SimpleName ssh filexfer type symlink
ssh filexfer type symlink SimpleName SwitchCase SwitchStatement SwitchCase SimpleName ssh filexfer type unknown
int PrimitiveType VariableDeclarationStatement Block SwitchStatement SimpleName type
flags SimpleName InfixExpression SimpleName ssh filexfer attr size
flags SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
ssh filexfer attr size SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
buffer SimpleName MethodInvocation SimpleName get long
attrs SimpleName MethodInvocation SimpleName put
attrs SimpleName MethodInvocation StringLiteral size
attrs SimpleName MethodInvocation MethodInvocation SimpleName buffer
attrs SimpleName MethodInvocation MethodInvocation SimpleName get long
put SimpleName MethodInvocation StringLiteral size
put SimpleName MethodInvocation MethodInvocation SimpleName buffer
put SimpleName MethodInvocation MethodInvocation SimpleName get long
size StringLiteral MethodInvocation MethodInvocation SimpleName buffer
size StringLiteral MethodInvocation MethodInvocation SimpleName get long
flags SimpleName InfixExpression SimpleName ssh filexfer attr allocation size
flags SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
ssh filexfer attr allocation size SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
buffer SimpleName MethodInvocation SimpleName get long
attrs SimpleName MethodInvocation SimpleName put
attrs SimpleName MethodInvocation StringLiteral allocation size
attrs SimpleName MethodInvocation MethodInvocation SimpleName buffer
attrs SimpleName MethodInvocation MethodInvocation SimpleName get long
put SimpleName MethodInvocation StringLiteral allocation size
put SimpleName MethodInvocation MethodInvocation SimpleName buffer
put SimpleName MethodInvocation MethodInvocation SimpleName get long
allocation size StringLiteral MethodInvocation MethodInvocation SimpleName buffer
allocation size StringLiteral MethodInvocation MethodInvocation SimpleName get long
flags SimpleName InfixExpression SimpleName ssh filexfer attr uidgid
flags SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
ssh filexfer attr uidgid SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
buffer SimpleName MethodInvocation SimpleName get int
attrs SimpleName MethodInvocation SimpleName put
attrs SimpleName MethodInvocation StringLiteral uid
attrs SimpleName MethodInvocation MethodInvocation SimpleName buffer
attrs SimpleName MethodInvocation MethodInvocation SimpleName get int
put SimpleName MethodInvocation StringLiteral uid
put SimpleName MethodInvocation MethodInvocation SimpleName buffer
put SimpleName MethodInvocation MethodInvocation SimpleName get int
uid StringLiteral MethodInvocation MethodInvocation SimpleName buffer
uid StringLiteral MethodInvocation MethodInvocation SimpleName get int
buffer SimpleName MethodInvocation SimpleName get int
attrs SimpleName MethodInvocation SimpleName put
attrs SimpleName MethodInvocation StringLiteral gid
attrs SimpleName MethodInvocation MethodInvocation SimpleName buffer
attrs SimpleName MethodInvocation MethodInvocation SimpleName get int
put SimpleName MethodInvocation StringLiteral gid
put SimpleName MethodInvocation MethodInvocation SimpleName buffer
put SimpleName MethodInvocation MethodInvocation SimpleName get int
gid StringLiteral MethodInvocation MethodInvocation SimpleName buffer
gid StringLiteral MethodInvocation MethodInvocation SimpleName get int
flags SimpleName InfixExpression SimpleName ssh filexfer attr ownergroup
flags SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
ssh filexfer attr ownergroup SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
buffer SimpleName MethodInvocation SimpleName get string
default group principal SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName buffer
default group principal SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get string
attrs SimpleName MethodInvocation SimpleName put
attrs SimpleName MethodInvocation StringLiteral owner
attrs SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName default group principal
attrs SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName buffer
attrs SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get string
put SimpleName MethodInvocation StringLiteral owner
put SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName default group principal
put SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName buffer
put SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get string
owner StringLiteral MethodInvocation ClassInstanceCreation SimpleType SimpleName default group principal
owner StringLiteral MethodInvocation ClassInstanceCreation MethodInvocation SimpleName buffer
owner StringLiteral MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get string
buffer SimpleName MethodInvocation SimpleName get string
default group principal SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName buffer
default group principal SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get string
attrs SimpleName MethodInvocation SimpleName put
attrs SimpleName MethodInvocation StringLiteral group
attrs SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName default group principal
attrs SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName buffer
attrs SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get string
put SimpleName MethodInvocation StringLiteral group
put SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName default group principal
put SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName buffer
put SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get string
group StringLiteral MethodInvocation ClassInstanceCreation SimpleType SimpleName default group principal
group StringLiteral MethodInvocation ClassInstanceCreation MethodInvocation SimpleName buffer
group StringLiteral MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get string
flags SimpleName InfixExpression SimpleName ssh filexfer attr permissions
flags SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
ssh filexfer attr permissions SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
buffer SimpleName MethodInvocation SimpleName get int
permissions to attributes SimpleName MethodInvocation MethodInvocation SimpleName buffer
permissions to attributes SimpleName MethodInvocation MethodInvocation SimpleName get int
attrs SimpleName MethodInvocation SimpleName put
attrs SimpleName MethodInvocation StringLiteral permissions
attrs SimpleName MethodInvocation MethodInvocation SimpleName permissions to attributes
attrs SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName buffer
attrs SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get int
put SimpleName MethodInvocation StringLiteral permissions
put SimpleName MethodInvocation MethodInvocation SimpleName permissions to attributes
put SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName buffer
put SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get int
permissions StringLiteral MethodInvocation MethodInvocation SimpleName permissions to attributes
permissions StringLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName buffer
permissions StringLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName get int
version SimpleName InfixExpression SimpleName sftp v
flags SimpleName InfixExpression SimpleName ssh filexfer attr acmodtime
flags SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
ssh filexfer attr acmodtime SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
read time SimpleName MethodInvocation SimpleName buffer
read time SimpleName MethodInvocation SimpleName flags
buffer SimpleName MethodInvocation SimpleName flags
attrs SimpleName MethodInvocation SimpleName put
attrs SimpleName MethodInvocation StringLiteral last access time
attrs SimpleName MethodInvocation MethodInvocation SimpleName read time
attrs SimpleName MethodInvocation MethodInvocation SimpleName buffer
attrs SimpleName MethodInvocation MethodInvocation SimpleName flags
put SimpleName MethodInvocation StringLiteral last access time
put SimpleName MethodInvocation MethodInvocation SimpleName read time
put SimpleName MethodInvocation MethodInvocation SimpleName buffer
put SimpleName MethodInvocation MethodInvocation SimpleName flags
last access time StringLiteral MethodInvocation MethodInvocation SimpleName read time
last access time StringLiteral MethodInvocation MethodInvocation SimpleName buffer
last access time StringLiteral MethodInvocation MethodInvocation SimpleName flags
read time SimpleName MethodInvocation SimpleName buffer
read time SimpleName MethodInvocation SimpleName flags
buffer SimpleName MethodInvocation SimpleName flags
attrs SimpleName MethodInvocation SimpleName put
attrs SimpleName MethodInvocation StringLiteral last modified time
attrs SimpleName MethodInvocation MethodInvocation SimpleName read time
attrs SimpleName MethodInvocation MethodInvocation SimpleName buffer
attrs SimpleName MethodInvocation MethodInvocation SimpleName flags
put SimpleName MethodInvocation StringLiteral last modified time
put SimpleName MethodInvocation MethodInvocation SimpleName read time
put SimpleName MethodInvocation MethodInvocation SimpleName buffer
put SimpleName MethodInvocation MethodInvocation SimpleName flags
last modified time StringLiteral MethodInvocation MethodInvocation SimpleName read time
last modified time StringLiteral MethodInvocation MethodInvocation SimpleName buffer
last modified time StringLiteral MethodInvocation MethodInvocation SimpleName flags
version SimpleName InfixExpression SimpleName sftp v
flags SimpleName InfixExpression SimpleName ssh filexfer attr accesstime
flags SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
ssh filexfer attr accesstime SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
read time SimpleName MethodInvocation SimpleName buffer
read time SimpleName MethodInvocation SimpleName flags
buffer SimpleName MethodInvocation SimpleName flags
attrs SimpleName MethodInvocation SimpleName put
attrs SimpleName MethodInvocation StringLiteral last access time
attrs SimpleName MethodInvocation MethodInvocation SimpleName read time
attrs SimpleName MethodInvocation MethodInvocation SimpleName buffer
attrs SimpleName MethodInvocation MethodInvocation SimpleName flags
put SimpleName MethodInvocation StringLiteral last access time
put SimpleName MethodInvocation MethodInvocation SimpleName read time
put SimpleName MethodInvocation MethodInvocation SimpleName buffer
put SimpleName MethodInvocation MethodInvocation SimpleName flags
last access time StringLiteral MethodInvocation MethodInvocation SimpleName read time
last access time StringLiteral MethodInvocation MethodInvocation SimpleName buffer
last access time StringLiteral MethodInvocation MethodInvocation SimpleName flags
flags SimpleName InfixExpression SimpleName ssh filexfer attr createtime
flags SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
ssh filexfer attr createtime SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
read time SimpleName MethodInvocation SimpleName buffer
read time SimpleName MethodInvocation SimpleName flags
buffer SimpleName MethodInvocation SimpleName flags
attrs SimpleName MethodInvocation SimpleName put
attrs SimpleName MethodInvocation StringLiteral creation time
attrs SimpleName MethodInvocation MethodInvocation SimpleName read time
attrs SimpleName MethodInvocation MethodInvocation SimpleName buffer
attrs SimpleName MethodInvocation MethodInvocation SimpleName flags
put SimpleName MethodInvocation StringLiteral creation time
put SimpleName MethodInvocation MethodInvocation SimpleName read time
put SimpleName MethodInvocation MethodInvocation SimpleName buffer
put SimpleName MethodInvocation MethodInvocation SimpleName flags
creation time StringLiteral MethodInvocation MethodInvocation SimpleName read time
creation time StringLiteral MethodInvocation MethodInvocation SimpleName buffer
creation time StringLiteral MethodInvocation MethodInvocation SimpleName flags
flags SimpleName InfixExpression SimpleName ssh filexfer attr modifytime
flags SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
ssh filexfer attr modifytime SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
read time SimpleName MethodInvocation SimpleName buffer
read time SimpleName MethodInvocation SimpleName flags
buffer SimpleName MethodInvocation SimpleName flags
attrs SimpleName MethodInvocation SimpleName put
attrs SimpleName MethodInvocation StringLiteral last modified time
attrs SimpleName MethodInvocation MethodInvocation SimpleName read time
attrs SimpleName MethodInvocation MethodInvocation SimpleName buffer
attrs SimpleName MethodInvocation MethodInvocation SimpleName flags
put SimpleName MethodInvocation StringLiteral last modified time
put SimpleName MethodInvocation MethodInvocation SimpleName read time
put SimpleName MethodInvocation MethodInvocation SimpleName buffer
put SimpleName MethodInvocation MethodInvocation SimpleName flags
last modified time StringLiteral MethodInvocation MethodInvocation SimpleName read time
last modified time StringLiteral MethodInvocation MethodInvocation SimpleName buffer
last modified time StringLiteral MethodInvocation MethodInvocation SimpleName flags
flags SimpleName InfixExpression SimpleName ssh filexfer attr ctime
flags SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
ssh filexfer attr ctime SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
read time SimpleName MethodInvocation SimpleName buffer
read time SimpleName MethodInvocation SimpleName flags
buffer SimpleName MethodInvocation SimpleName flags
attrs SimpleName MethodInvocation SimpleName put
attrs SimpleName MethodInvocation StringLiteral ctime
attrs SimpleName MethodInvocation MethodInvocation SimpleName read time
attrs SimpleName MethodInvocation MethodInvocation SimpleName buffer
attrs SimpleName MethodInvocation MethodInvocation SimpleName flags
put SimpleName MethodInvocation StringLiteral ctime
put SimpleName MethodInvocation MethodInvocation SimpleName read time
put SimpleName MethodInvocation MethodInvocation SimpleName buffer
put SimpleName MethodInvocation MethodInvocation SimpleName flags
ctime StringLiteral MethodInvocation MethodInvocation SimpleName read time
ctime StringLiteral MethodInvocation MethodInvocation SimpleName buffer
ctime StringLiteral MethodInvocation MethodInvocation SimpleName flags
flags SimpleName InfixExpression SimpleName ssh filexfer attr acl
flags SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
ssh filexfer attr acl SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
buffer SimpleName MethodInvocation SimpleName get int
count SimpleName VariableDeclarationFragment MethodInvocation SimpleName buffer
count SimpleName VariableDeclarationFragment MethodInvocation SimpleName get int
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName count
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName buffer
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get int
list SimpleName SimpleType ParameterizedType SimpleType SimpleName acl entry
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression SimpleName count
buffer SimpleName MethodInvocation SimpleName get int
acl type SimpleName VariableDeclarationFragment MethodInvocation SimpleName buffer
acl type SimpleName VariableDeclarationFragment MethodInvocation SimpleName get int
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName acl type
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName buffer
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get int
buffer SimpleName MethodInvocation SimpleName get int
acl flag SimpleName VariableDeclarationFragment MethodInvocation SimpleName buffer
acl flag SimpleName VariableDeclarationFragment MethodInvocation SimpleName get int
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName acl flag
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName buffer
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get int
buffer SimpleName MethodInvocation SimpleName get int
acl mask SimpleName VariableDeclarationFragment MethodInvocation SimpleName buffer
acl mask SimpleName VariableDeclarationFragment MethodInvocation SimpleName get int
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName acl mask
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName buffer
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get int
buffer SimpleName MethodInvocation SimpleName get string
acl who SimpleName VariableDeclarationFragment MethodInvocation SimpleName buffer
acl who SimpleName VariableDeclarationFragment MethodInvocation SimpleName get string
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName acl who
build acl entry SimpleName MethodInvocation SimpleName acl type
build acl entry SimpleName MethodInvocation SimpleName acl flag
build acl entry SimpleName MethodInvocation SimpleName acl mask
build acl entry SimpleName MethodInvocation SimpleName acl who
acl type SimpleName MethodInvocation SimpleName acl flag
acl type SimpleName MethodInvocation SimpleName acl mask
acl type SimpleName MethodInvocation SimpleName acl who
acl flag SimpleName MethodInvocation SimpleName acl mask
acl flag SimpleName MethodInvocation SimpleName acl who
acl mask SimpleName MethodInvocation SimpleName acl who
acls SimpleName MethodInvocation SimpleName add
acls SimpleName MethodInvocation MethodInvocation SimpleName build acl entry
acls SimpleName MethodInvocation MethodInvocation SimpleName acl type
acls SimpleName MethodInvocation MethodInvocation SimpleName acl flag
acls SimpleName MethodInvocation MethodInvocation SimpleName acl mask
acls SimpleName MethodInvocation MethodInvocation SimpleName acl who
add SimpleName MethodInvocation MethodInvocation SimpleName build acl entry
add SimpleName MethodInvocation MethodInvocation SimpleName acl type
add SimpleName MethodInvocation MethodInvocation SimpleName acl flag
add SimpleName MethodInvocation MethodInvocation SimpleName acl mask
add SimpleName MethodInvocation MethodInvocation SimpleName acl who
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName count
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
count SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
attrs SimpleName MethodInvocation SimpleName put
attrs SimpleName MethodInvocation StringLiteral acl
attrs SimpleName MethodInvocation SimpleName acls
put SimpleName MethodInvocation StringLiteral acl
put SimpleName MethodInvocation SimpleName acls
acl StringLiteral MethodInvocation SimpleName acls
flags SimpleName InfixExpression SimpleName ssh filexfer attr bits
flags SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
ssh filexfer attr bits SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
buffer SimpleName MethodInvocation SimpleName get int
bits SimpleName VariableDeclarationFragment MethodInvocation SimpleName buffer
bits SimpleName VariableDeclarationFragment MethodInvocation SimpleName get int
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName bits
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName buffer
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get int
valid SimpleName VariableDeclarationFragment NumberLiteral xffffffff
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName valid
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment NumberLiteral xffffffff
version SimpleName InfixExpression SimpleName sftp v
buffer SimpleName MethodInvocation SimpleName get int
valid SimpleName Assignment MethodInvocation SimpleName buffer
valid SimpleName Assignment MethodInvocation SimpleName get int
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
flags SimpleName InfixExpression SimpleName ssh filexfer attr text hint
flags SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
ssh filexfer attr text hint SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
buffer SimpleName MethodInvocation SimpleName get boolean
text SimpleName VariableDeclarationFragment MethodInvocation SimpleName buffer
text SimpleName VariableDeclarationFragment MethodInvocation SimpleName get boolean
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName text
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName buffer
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get boolean
flags SimpleName InfixExpression SimpleName ssh filexfer attr mime type
flags SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
ssh filexfer attr mime type SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
buffer SimpleName MethodInvocation SimpleName get string
mime type SimpleName VariableDeclarationFragment MethodInvocation SimpleName buffer
mime type SimpleName VariableDeclarationFragment MethodInvocation SimpleName get string
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName mime type
flags SimpleName InfixExpression SimpleName ssh filexfer attr link count
flags SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
ssh filexfer attr link count SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
buffer SimpleName MethodInvocation SimpleName get int
nlink SimpleName VariableDeclarationFragment MethodInvocation SimpleName buffer
nlink SimpleName VariableDeclarationFragment MethodInvocation SimpleName get int
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName nlink
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName buffer
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get int
flags SimpleName InfixExpression SimpleName ssh filexfer attr untranslated name
flags SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
ssh filexfer attr untranslated name SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
buffer SimpleName MethodInvocation SimpleName get string
untranslated SimpleName VariableDeclarationFragment MethodInvocation SimpleName buffer
untranslated SimpleName VariableDeclarationFragment MethodInvocation SimpleName get string
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName untranslated
flags SimpleName InfixExpression SimpleName ssh filexfer attr extended
flags SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
ssh filexfer attr extended SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
buffer SimpleName MethodInvocation SimpleName get int
count SimpleName VariableDeclarationFragment MethodInvocation SimpleName buffer
count SimpleName VariableDeclarationFragment MethodInvocation SimpleName get int
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName count
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName buffer
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get int
map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
string SimpleName SimpleType ParameterizedType SimpleType SimpleName string
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression SimpleName count
buffer SimpleName MethodInvocation SimpleName get string
key SimpleName VariableDeclarationFragment MethodInvocation SimpleName buffer
key SimpleName VariableDeclarationFragment MethodInvocation SimpleName get string
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName key
buffer SimpleName MethodInvocation SimpleName get string
val SimpleName VariableDeclarationFragment MethodInvocation SimpleName buffer
val SimpleName VariableDeclarationFragment MethodInvocation SimpleName get string
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName val
extended SimpleName MethodInvocation SimpleName put
extended SimpleName MethodInvocation SimpleName key
extended SimpleName MethodInvocation SimpleName val
put SimpleName MethodInvocation SimpleName key
put SimpleName MethodInvocation SimpleName val
key SimpleName MethodInvocation SimpleName val
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName count
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
count SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
attrs SimpleName MethodInvocation SimpleName put
attrs SimpleName MethodInvocation StringLiteral extended
attrs SimpleName MethodInvocation SimpleName extended
put SimpleName MethodInvocation StringLiteral extended
put SimpleName MethodInvocation SimpleName extended
extended StringLiteral MethodInvocation SimpleName extended
protected Modifier MethodDeclaration Modifier static
protected Modifier MethodDeclaration ParameterizedType SimpleType SimpleName map
protected Modifier MethodDeclaration ParameterizedType SimpleType SimpleName string
protected Modifier MethodDeclaration ParameterizedType SimpleType SimpleName object
protected Modifier MethodDeclaration SimpleName read attrs
protected Modifier MethodDeclaration SingleVariableDeclaration PrimitiveType int
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleName version
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName buffer
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleName buffer
static Modifier MethodDeclaration ParameterizedType SimpleType SimpleName map
static Modifier MethodDeclaration ParameterizedType SimpleType SimpleName string
static Modifier MethodDeclaration ParameterizedType SimpleType SimpleName object
static Modifier MethodDeclaration SimpleName read attrs
static Modifier MethodDeclaration SingleVariableDeclaration PrimitiveType int
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName version
static Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName buffer
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName buffer
static Modifier MethodDeclaration SimpleType SimpleName io exception
map SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName read attrs
string SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName read attrs
object SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName read attrs
read attrs SimpleName MethodDeclaration SingleVariableDeclaration PrimitiveType int
read attrs SimpleName MethodDeclaration SingleVariableDeclaration SimpleName version
read attrs SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName buffer
read attrs SimpleName MethodDeclaration SingleVariableDeclaration SimpleName buffer
read attrs SimpleName MethodDeclaration SimpleType SimpleName io exception
read attrs SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
read attrs SimpleName MethodDeclaration Block ReturnStatement SimpleName attrs
int PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName buffer
version SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName buffer
int PrimitiveType SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
version SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
buffer SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier protected
public Modifier TypeDeclaration MethodDeclaration Modifier static
public Modifier TypeDeclaration MethodDeclaration SimpleName read attrs
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName version
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName buffer
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
test SimpleName TypeDeclaration MethodDeclaration Modifier protected
test SimpleName TypeDeclaration MethodDeclaration Modifier static
test SimpleName TypeDeclaration MethodDeclaration SimpleName read attrs
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName version
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName buffer
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName io exception