tree map SimpleName SimpleType ParameterizedType SimpleType SimpleName key
tree map SimpleName SimpleType ParameterizedType SimpleType SimpleName value
key SimpleName SimpleType ParameterizedType SimpleType SimpleName value
float PrimitiveType SingleVariableDeclaration SimpleName hit ratio
int PrimitiveType SingleVariableDeclaration SimpleName num rows
int PrimitiveType SingleVariableDeclaration SimpleName num docs per row
text SimpleName SimpleType ArrayType SingleVariableDeclaration SimpleName column families
text SimpleName SimpleType ArrayType SingleVariableDeclaration SimpleName other column families
hash set SimpleName SimpleType ParameterizedType SimpleType SimpleName text
hash set SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName docs
text SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName docs
text SimpleName SimpleType ArrayType SingleVariableDeclaration SimpleName negated columns
r SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName random
random SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName r
byte PrimitiveType ArrayType ArrayCreation NumberLiteral empty
value SimpleName SimpleType ClassInstanceCreation ArrayCreation NumberLiteral empty
v SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName value
v SimpleName VariableDeclarationFragment ClassInstanceCreation ArrayCreation NumberLiteral empty
value SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName v
tree map SimpleName SimpleType ParameterizedType SimpleType SimpleName key
tree map SimpleName SimpleType ParameterizedType SimpleType SimpleName value
key SimpleName SimpleType ParameterizedType SimpleType SimpleName value
tree map SimpleName SimpleType ParameterizedType SimpleType SimpleName key
tree map SimpleName SimpleType ParameterizedType SimpleType SimpleName value
key SimpleName SimpleType ParameterizedType SimpleType SimpleName value
boolean PrimitiveType ArrayType ArrayCreation QualifiedName column familieslength
negate mask SimpleName VariableDeclarationFragment ArrayCreation ArrayType PrimitiveType boolean
negate mask SimpleName VariableDeclarationFragment ArrayCreation QualifiedName column familieslength
boolean PrimitiveType ArrayType VariableDeclarationStatement VariableDeclarationFragment SimpleName negate mask
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression QualifiedName column familieslength
negate mask SimpleName ArrayAccess SimpleName i
negate mask SimpleName ArrayAccess Assignment BooleanLiteral false
i SimpleName ArrayAccess Assignment BooleanLiteral false
negated columnslength QualifiedName InfixExpression NumberLiteral empty
text SimpleName SimpleType SingleVariableDeclaration SimpleName ng
column families SimpleName ArrayAccess SimpleName i
column families SimpleName ArrayAccess MethodInvocation SimpleName equals
i SimpleName ArrayAccess MethodInvocation SimpleName equals
column families SimpleName ArrayAccess MethodInvocation SimpleName ng
i SimpleName ArrayAccess MethodInvocation SimpleName ng
equals SimpleName MethodInvocation SimpleName ng
negate mask SimpleName ArrayAccess SimpleName i
negate mask SimpleName ArrayAccess Assignment BooleanLiteral true
i SimpleName ArrayAccess Assignment BooleanLiteral true
text SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName negated columns
ng SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName negated columns
negated columns SimpleName EnhancedForStatement IfStatement MethodInvocation SimpleName equals
negated columns SimpleName EnhancedForStatement IfStatement MethodInvocation SimpleName ng
negated columnslength QualifiedName InfixExpression IfStatement EnhancedForStatement SimpleName negated columns
empty NumberLiteral InfixExpression IfStatement EnhancedForStatement SimpleName negated columns
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression QualifiedName column familieslength
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
column familieslength QualifiedName InfixExpression ForStatement PostfixExpression SimpleName i
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression SimpleName num rows
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
row SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName text
row SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName string
row SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName format
row SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation StringLiteral % d
row SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName i
text SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName row
start doc id SimpleName VariableDeclarationFragment SimpleName docid
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName start doc id
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName docid
docid SimpleName InfixExpression SimpleName start doc id
docid SimpleName InfixExpression InfixExpression SimpleName num docs per row
start doc id SimpleName InfixExpression InfixExpression SimpleName num docs per row
doc hits SimpleName VariableDeclarationFragment BooleanLiteral true
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName doc hits
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment BooleanLiteral true
string SimpleName MethodInvocation SimpleName format
string SimpleName MethodInvocation StringLiteral % d
string SimpleName MethodInvocation SimpleName docid
format SimpleName MethodInvocation StringLiteral % d
format SimpleName MethodInvocation SimpleName docid
% d StringLiteral MethodInvocation SimpleName docid
text SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName string
text SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName format
text SimpleName SimpleType ClassInstanceCreation MethodInvocation StringLiteral % d
text SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName docid
doc SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName text
doc SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName string
doc SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName format
doc SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation StringLiteral % d
doc SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName docid
text SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName doc
j SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName j
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
j SimpleName InfixExpression QualifiedName column familieslength
r SimpleName MethodInvocation SimpleName next float
r SimpleName MethodInvocation InfixExpression SimpleName hit ratio
next float SimpleName MethodInvocation InfixExpression SimpleName hit ratio
column families SimpleName ArrayAccess SimpleName j
key SimpleName SimpleType ClassInstanceCreation SimpleName row
key SimpleName SimpleType ClassInstanceCreation ArrayAccess SimpleName column families
key SimpleName SimpleType ClassInstanceCreation ArrayAccess SimpleName j
key SimpleName SimpleType ClassInstanceCreation SimpleName doc
row SimpleName ClassInstanceCreation ArrayAccess SimpleName column families
row SimpleName ClassInstanceCreation ArrayAccess SimpleName j
row SimpleName ClassInstanceCreation SimpleName doc
column families SimpleName ArrayAccess ClassInstanceCreation SimpleName doc
j SimpleName ArrayAccess ClassInstanceCreation SimpleName doc
k SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName key
k SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName row
k SimpleName VariableDeclarationFragment ClassInstanceCreation ArrayAccess SimpleName column families
k SimpleName VariableDeclarationFragment ClassInstanceCreation ArrayAccess SimpleName j
k SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName doc
key SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName k
map SimpleName MethodInvocation SimpleName put
map SimpleName MethodInvocation SimpleName k
map SimpleName MethodInvocation SimpleName v
put SimpleName MethodInvocation SimpleName k
put SimpleName MethodInvocation SimpleName v
k SimpleName MethodInvocation SimpleName v
negate mask SimpleName ArrayAccess SimpleName j
doc hits SimpleName Assignment BooleanLiteral false
negate mask SimpleName ArrayAccess SimpleName j
doc hits SimpleName Assignment BooleanLiteral false
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName j
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression QualifiedName column familieslength
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName j
j SimpleName InfixExpression ForStatement PostfixExpression SimpleName j
column familieslength QualifiedName InfixExpression ForStatement PostfixExpression SimpleName j
docs SimpleName MethodInvocation SimpleName add
docs SimpleName MethodInvocation SimpleName doc
add SimpleName MethodInvocation SimpleName doc
text SimpleName SimpleType SingleVariableDeclaration SimpleName cf
r SimpleName MethodInvocation SimpleName next float
r SimpleName MethodInvocation InfixExpression SimpleName hit ratio
next float SimpleName MethodInvocation InfixExpression SimpleName hit ratio
key SimpleName SimpleType ClassInstanceCreation SimpleName row
key SimpleName SimpleType ClassInstanceCreation SimpleName cf
key SimpleName SimpleType ClassInstanceCreation SimpleName doc
row SimpleName ClassInstanceCreation SimpleName cf
row SimpleName ClassInstanceCreation SimpleName doc
cf SimpleName ClassInstanceCreation SimpleName doc
k SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName key
k SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName row
k SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName cf
k SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName doc
key SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName k
map SimpleName MethodInvocation SimpleName put
map SimpleName MethodInvocation SimpleName k
map SimpleName MethodInvocation SimpleName v
put SimpleName MethodInvocation SimpleName k
put SimpleName MethodInvocation SimpleName v
k SimpleName MethodInvocation SimpleName v
text SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName other column families
cf SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName other column families
boolean PrimitiveType VariableDeclarationStatement Block IfStatement SimpleName doc hits
boolean PrimitiveType VariableDeclarationStatement Block EnhancedForStatement SimpleName other column families
doc hits SimpleName IfStatement Block EnhancedForStatement SimpleName other column families
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName num docs per row
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName docid
num docs per row SimpleName InfixExpression ForStatement PostfixExpression SimpleName docid
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName num rows
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
num rows SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
private Modifier MethodDeclaration ParameterizedType SimpleType SimpleName tree map
private Modifier MethodDeclaration ParameterizedType SimpleType SimpleName key
private Modifier MethodDeclaration ParameterizedType SimpleType SimpleName value
private Modifier MethodDeclaration SimpleName create sorted map
private Modifier MethodDeclaration SingleVariableDeclaration PrimitiveType float
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName hit ratio
private Modifier MethodDeclaration SingleVariableDeclaration PrimitiveType int
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName num rows
private Modifier MethodDeclaration SingleVariableDeclaration PrimitiveType int
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName num docs per row
tree map SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName create sorted map
key SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName create sorted map
value SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName create sorted map
create sorted map SimpleName MethodDeclaration SingleVariableDeclaration PrimitiveType float
create sorted map SimpleName MethodDeclaration SingleVariableDeclaration SimpleName hit ratio
create sorted map SimpleName MethodDeclaration SingleVariableDeclaration PrimitiveType int
create sorted map SimpleName MethodDeclaration SingleVariableDeclaration SimpleName num rows
create sorted map SimpleName MethodDeclaration SingleVariableDeclaration PrimitiveType int
create sorted map SimpleName MethodDeclaration SingleVariableDeclaration SimpleName num docs per row
create sorted map SimpleName MethodDeclaration SingleVariableDeclaration SimpleName column families
create sorted map SimpleName MethodDeclaration SingleVariableDeclaration SimpleName other column families
float PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
float PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName num rows
hit ratio SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
hit ratio SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName num rows
float PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
float PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName num docs per row
hit ratio SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
hit ratio SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName num docs per row
float PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName column families
hit ratio SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName column families
float PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName other column families
hit ratio SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName other column families
float PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName docs
hit ratio SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName docs
int PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
int PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName num docs per row
num rows SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
num rows SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName num docs per row
int PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName column families
num rows SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName column families
int PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName other column families
num rows SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName other column families
int PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName docs
num rows SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName docs
int PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName negated columns
num rows SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName negated columns
int PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName column families
num docs per row SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName column families
int PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName other column families
num docs per row SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName other column families
int PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName docs
num docs per row SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName docs
int PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName negated columns
num docs per row SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName negated columns
column families SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName other column families
column families SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName docs
column families SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName negated columns
other column families SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName docs
other column families SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName negated columns
docs SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName negated columns
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration SimpleName create sorted map
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType float
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName hit ratio
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName num rows
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName num docs per row
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName column families
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName other column families
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName docs
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName negated columns
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration SimpleName create sorted map
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType float
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName hit ratio
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName num rows
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName num docs per row
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName column families
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName other column families
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName docs
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName negated columns