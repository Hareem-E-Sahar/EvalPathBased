i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression SimpleName num gc
system SimpleName MethodInvocation SimpleName gc
passed SimpleName VariableDeclarationFragment BooleanLiteral true
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName passed
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment BooleanLiteral true
objs SimpleName MethodInvocation SimpleName values
objs SimpleName MethodInvocation MethodInvocation SimpleName iterator
values SimpleName MethodInvocation MethodInvocation SimpleName iterator
iter SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName objs
iter SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName values
iter SimpleName VariableDeclarationFragment MethodInvocation SimpleName iterator
iterator SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName iter
iter SimpleName MethodInvocation SimpleName has next
iter SimpleName MethodInvocation SimpleName next
weak ref SimpleName SimpleType CastExpression MethodInvocation SimpleName iter
weak ref SimpleName SimpleType CastExpression MethodInvocation SimpleName next
wr SimpleName VariableDeclarationFragment CastExpression SimpleType SimpleName weak ref
wr SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName iter
wr SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName next
weak ref SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName wr
wr SimpleName MethodInvocation SimpleName get
o SimpleName VariableDeclarationFragment MethodInvocation SimpleName wr
o SimpleName VariableDeclarationFragment MethodInvocation SimpleName get
object SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName o
passed SimpleName Assignment BooleanLiteral false
passed SimpleName IfStatement ReturnStatement BooleanLiteral true
boolean PrimitiveType VariableDeclarationStatement Block IfStatement SimpleName passed
objs SimpleName SynchronizedStatement Block VariableDeclarationStatement PrimitiveType boolean
objs SimpleName SynchronizedStatement Block IfStatement SimpleName passed
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName num gc
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
num gc SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
sb SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName string buffer
string buffer SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName sb
passed SimpleName VariableDeclarationFragment BooleanLiteral true
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName passed
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment BooleanLiteral true
objs SimpleName MethodInvocation SimpleName values
objs SimpleName MethodInvocation MethodInvocation SimpleName iterator
values SimpleName MethodInvocation MethodInvocation SimpleName iterator
iter SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName objs
iter SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName values
iter SimpleName VariableDeclarationFragment MethodInvocation SimpleName iterator
iterator SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName iter
iter SimpleName MethodInvocation SimpleName has next
iter SimpleName MethodInvocation SimpleName next
weak ref SimpleName SimpleType CastExpression MethodInvocation SimpleName iter
weak ref SimpleName SimpleType CastExpression MethodInvocation SimpleName next
wr SimpleName VariableDeclarationFragment CastExpression SimpleType SimpleName weak ref
wr SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName iter
wr SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName next
weak ref SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName wr
wr SimpleName MethodInvocation SimpleName get
o SimpleName VariableDeclarationFragment MethodInvocation SimpleName wr
o SimpleName VariableDeclarationFragment MethodInvocation SimpleName get
object SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName o
sb SimpleName MethodInvocation SimpleName append
sb SimpleName MethodInvocation StringLiteral empty
append SimpleName MethodInvocation StringLiteral empty
passed SimpleName Assignment BooleanLiteral false
wr SimpleName MethodInvocation SimpleName get desc
sb SimpleName MethodInvocation SimpleName append
sb SimpleName MethodInvocation MethodInvocation SimpleName wr
sb SimpleName MethodInvocation MethodInvocation SimpleName get desc
append SimpleName MethodInvocation MethodInvocation SimpleName wr
append SimpleName MethodInvocation MethodInvocation SimpleName get desc
passed SimpleName IfStatement ReturnStatement BooleanLiteral true
boolean PrimitiveType VariableDeclarationStatement Block IfStatement SimpleName passed
objs SimpleName SynchronizedStatement Block VariableDeclarationStatement PrimitiveType boolean
objs SimpleName SynchronizedStatement Block IfStatement SimpleName passed
sb SimpleName MethodInvocation SimpleName to string
obj str SimpleName VariableDeclarationFragment MethodInvocation SimpleName sb
obj str SimpleName VariableDeclarationFragment MethodInvocation SimpleName to string
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName obj str
fmt SimpleName MethodInvocation SimpleName error description
fmt SimpleName MethodInvocation SimpleName error objs not cleared
fmt SimpleName MethodInvocation ArrayCreation ArrayInitializer SimpleName obj str
error objs not cleared SimpleName MethodInvocation ArrayCreation ArrayInitializer SimpleName obj str
test reportentry QualifiedName SimpleType ClassInstanceCreation MethodInvocation SimpleName fmt
test reportentry QualifiedName SimpleType ClassInstanceCreation MethodInvocation SimpleName error description
test reportentry QualifiedName SimpleType ClassInstanceCreation MethodInvocation SimpleName fmt
test reportentry QualifiedName SimpleType ClassInstanceCreation MethodInvocation SimpleName error objs not cleared
fmt SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName fmt
fmt SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName error objs not cleared
error description SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName fmt
error description SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName error objs not cleared
entry SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType QualifiedName test reportentry
entry SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName fmt
entry SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName error description
entry SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName fmt
entry SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName error objs not cleared
test reportentry QualifiedName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName entry
entries SimpleName MethodInvocation SimpleName add
entries SimpleName MethodInvocation SimpleName entry
add SimpleName MethodInvocation SimpleName entry
obj str SimpleName MethodInvocation SimpleName length
obj str SimpleName MethodInvocation InfixExpression NumberLiteral empty
length SimpleName MethodInvocation InfixExpression NumberLiteral empty
obj str SimpleName MethodInvocation SimpleName substring
obj str SimpleName MethodInvocation NumberLiteral empty
obj str SimpleName MethodInvocation NumberLiteral empty
substring SimpleName MethodInvocation NumberLiteral empty
substring SimpleName MethodInvocation NumberLiteral empty
empty NumberLiteral MethodInvocation NumberLiteral empty
obj str SimpleName MethodInvocation InfixExpression StringLiteral ...
substring SimpleName MethodInvocation InfixExpression StringLiteral ...
empty NumberLiteral MethodInvocation InfixExpression StringLiteral ...
empty NumberLiteral MethodInvocation InfixExpression StringLiteral ...
obj str SimpleName Assignment InfixExpression MethodInvocation SimpleName obj str
obj str SimpleName Assignment InfixExpression MethodInvocation SimpleName substring
obj str SimpleName Assignment InfixExpression MethodInvocation NumberLiteral empty
obj str SimpleName Assignment InfixExpression MethodInvocation NumberLiteral empty
obj str SimpleName Assignment InfixExpression StringLiteral ...
>>>>> objects not cleared StringLiteral InfixExpression SimpleName obj str
>>>>> objects not cleared StringLiteral InfixExpression StringLiteral empty
obj str SimpleName InfixExpression StringLiteral empty
systemerr QualifiedName MethodInvocation SimpleName print
systemerr QualifiedName MethodInvocation InfixExpression StringLiteral >>>>> objects not cleared
systemerr QualifiedName MethodInvocation InfixExpression SimpleName obj str
systemerr QualifiedName MethodInvocation InfixExpression StringLiteral empty
print SimpleName MethodInvocation InfixExpression StringLiteral >>>>> objects not cleared
print SimpleName MethodInvocation InfixExpression SimpleName obj str
print SimpleName MethodInvocation InfixExpression StringLiteral empty
public Modifier MethodDeclaration PrimitiveType boolean
public Modifier MethodDeclaration SimpleName check all objects
public Modifier MethodDeclaration Block SynchronizedStatement SimpleName objs
public Modifier MethodDeclaration Block ReturnStatement BooleanLiteral false
boolean PrimitiveType MethodDeclaration SimpleName check all objects
boolean PrimitiveType MethodDeclaration Block SynchronizedStatement SimpleName objs
boolean PrimitiveType MethodDeclaration Block ReturnStatement BooleanLiteral false
check all objects SimpleName MethodDeclaration Block SynchronizedStatement SimpleName objs
check all objects SimpleName MethodDeclaration Block ReturnStatement BooleanLiteral false
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType boolean
public Modifier TypeDeclaration MethodDeclaration SimpleName check all objects
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType boolean
test SimpleName TypeDeclaration MethodDeclaration SimpleName check all objects
