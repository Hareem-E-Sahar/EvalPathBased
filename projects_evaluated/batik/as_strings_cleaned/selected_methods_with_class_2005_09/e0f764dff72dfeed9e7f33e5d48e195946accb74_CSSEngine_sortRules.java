list SimpleName SimpleType SingleVariableDeclaration SimpleName rules
element SimpleName SimpleType SingleVariableDeclaration SimpleName elt
string SimpleName SimpleType SingleVariableDeclaration SimpleName pseudo
rules SimpleName MethodInvocation SimpleName size
len SimpleName VariableDeclarationFragment MethodInvocation SimpleName rules
len SimpleName VariableDeclarationFragment MethodInvocation SimpleName size
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName len
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName rules
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName size
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
len SimpleName InfixExpression NumberLiteral empty
i SimpleName InfixExpression InfixExpression SimpleName len
i SimpleName InfixExpression InfixExpression NumberLiteral empty
idx SimpleName VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName idx
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName i
min SimpleName VariableDeclarationFragment QualifiedName integermax value
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName min
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment QualifiedName integermax value
j SimpleName VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName j
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
j SimpleName InfixExpression SimpleName len
rules SimpleName MethodInvocation SimpleName get
rules SimpleName MethodInvocation SimpleName j
get SimpleName MethodInvocation SimpleName j
style rule SimpleName SimpleType CastExpression MethodInvocation SimpleName rules
style rule SimpleName SimpleType CastExpression MethodInvocation SimpleName get
style rule SimpleName SimpleType CastExpression MethodInvocation SimpleName j
r SimpleName VariableDeclarationFragment CastExpression SimpleType SimpleName style rule
r SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName rules
r SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName get
r SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName j
style rule SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName r
r SimpleName MethodInvocation SimpleName get selector list
sl SimpleName VariableDeclarationFragment MethodInvocation SimpleName r
sl SimpleName VariableDeclarationFragment MethodInvocation SimpleName get selector list
selector list SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName sl
spec SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName spec
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment NumberLiteral empty
sl SimpleName MethodInvocation SimpleName get length
slen SimpleName VariableDeclarationFragment MethodInvocation SimpleName sl
slen SimpleName VariableDeclarationFragment MethodInvocation SimpleName get length
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName slen
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName sl
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get length
k SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName k
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
k SimpleName InfixExpression SimpleName slen
sl SimpleName MethodInvocation SimpleName item
sl SimpleName MethodInvocation SimpleName k
item SimpleName MethodInvocation SimpleName k
extended selector SimpleName SimpleType CastExpression MethodInvocation SimpleName sl
extended selector SimpleName SimpleType CastExpression MethodInvocation SimpleName item
extended selector SimpleName SimpleType CastExpression MethodInvocation SimpleName k
s SimpleName VariableDeclarationFragment CastExpression SimpleType SimpleName extended selector
s SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName sl
s SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName item
s SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName k
extended selector SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName s
s SimpleName MethodInvocation SimpleName match
s SimpleName MethodInvocation SimpleName elt
s SimpleName MethodInvocation SimpleName pseudo
match SimpleName MethodInvocation SimpleName elt
match SimpleName MethodInvocation SimpleName pseudo
elt SimpleName MethodInvocation SimpleName pseudo
s SimpleName MethodInvocation SimpleName get specificity
sp SimpleName VariableDeclarationFragment MethodInvocation SimpleName s
sp SimpleName VariableDeclarationFragment MethodInvocation SimpleName get specificity
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName sp
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName s
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get specificity
sp SimpleName InfixExpression SimpleName spec
spec SimpleName Assignment SimpleName sp
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName k
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName slen
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName k
k SimpleName InfixExpression ForStatement PostfixExpression SimpleName k
slen SimpleName InfixExpression ForStatement PostfixExpression SimpleName k
spec SimpleName InfixExpression SimpleName min
min SimpleName Assignment SimpleName spec
idx SimpleName Assignment SimpleName j
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName j
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName len
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName j
j SimpleName InfixExpression ForStatement PostfixExpression SimpleName j
len SimpleName InfixExpression ForStatement PostfixExpression SimpleName j
i SimpleName InfixExpression SimpleName idx
rules SimpleName MethodInvocation SimpleName get
rules SimpleName MethodInvocation SimpleName i
get SimpleName MethodInvocation SimpleName i
tmp SimpleName VariableDeclarationFragment MethodInvocation SimpleName rules
tmp SimpleName VariableDeclarationFragment MethodInvocation SimpleName get
tmp SimpleName VariableDeclarationFragment MethodInvocation SimpleName i
object SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName tmp
rules SimpleName MethodInvocation SimpleName get
rules SimpleName MethodInvocation SimpleName idx
get SimpleName MethodInvocation SimpleName idx
rules SimpleName MethodInvocation SimpleName set
rules SimpleName MethodInvocation SimpleName i
rules SimpleName MethodInvocation MethodInvocation SimpleName rules
rules SimpleName MethodInvocation MethodInvocation SimpleName get
rules SimpleName MethodInvocation MethodInvocation SimpleName idx
set SimpleName MethodInvocation SimpleName i
set SimpleName MethodInvocation MethodInvocation SimpleName rules
set SimpleName MethodInvocation MethodInvocation SimpleName get
set SimpleName MethodInvocation MethodInvocation SimpleName idx
i SimpleName MethodInvocation MethodInvocation SimpleName rules
i SimpleName MethodInvocation MethodInvocation SimpleName get
i SimpleName MethodInvocation MethodInvocation SimpleName idx
rules SimpleName MethodInvocation SimpleName set
rules SimpleName MethodInvocation SimpleName idx
rules SimpleName MethodInvocation SimpleName tmp
set SimpleName MethodInvocation SimpleName idx
set SimpleName MethodInvocation SimpleName tmp
idx SimpleName MethodInvocation SimpleName tmp
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
protected Modifier MethodDeclaration PrimitiveType void
protected Modifier MethodDeclaration SimpleName sort rules
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName list
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleName rules
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName element
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleName elt
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleName pseudo
void PrimitiveType MethodDeclaration SimpleName sort rules
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName list
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName rules
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName element
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName elt
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName pseudo
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
sort rules SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName list
sort rules SimpleName MethodDeclaration SingleVariableDeclaration SimpleName rules
sort rules SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName element
sort rules SimpleName MethodDeclaration SingleVariableDeclaration SimpleName elt
sort rules SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
sort rules SimpleName MethodDeclaration SingleVariableDeclaration SimpleName pseudo
sort rules SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
rules SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName elt
rules SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName pseudo
elt SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName pseudo
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier protected
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName sort rules
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName rules
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName elt
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName pseudo
test SimpleName TypeDeclaration MethodDeclaration Modifier protected
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName sort rules
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName rules
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName elt
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName pseudo
