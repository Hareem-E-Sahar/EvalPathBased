node SimpleName SimpleType SingleVariableDeclaration SimpleName requestor
string SimpleName SimpleType SingleVariableDeclaration SimpleName id
id SimpleName MethodInvocation SimpleName length
id SimpleName MethodInvocation InfixExpression NumberLiteral empty
length SimpleName MethodInvocation InfixExpression NumberLiteral empty
get root SimpleName MethodInvocation SimpleName requestor
root SimpleName VariableDeclarationFragment MethodInvocation SimpleName get root
root SimpleName VariableDeclarationFragment MethodInvocation SimpleName requestor
node SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName root
elements by id SimpleName MethodInvocation SimpleName get
elements by id SimpleName MethodInvocation SimpleName id
get SimpleName MethodInvocation SimpleName id
o SimpleName VariableDeclarationFragment MethodInvocation SimpleName elements by id
o SimpleName VariableDeclarationFragment MethodInvocation SimpleName get
o SimpleName VariableDeclarationFragment MethodInvocation SimpleName id
object SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName o
o SimpleName InstanceofExpression SimpleType SimpleName id soft ref
id soft ref SimpleName SimpleType CastExpression SimpleName o
o SimpleName CastExpression ParenthesizedExpression MethodInvocation SimpleName get
o SimpleName Assignment MethodInvocation SimpleName get
elements by id SimpleName MethodInvocation SimpleName remove
elements by id SimpleName MethodInvocation SimpleName id
remove SimpleName MethodInvocation SimpleName id
element SimpleName SimpleType CastExpression SimpleName o
e SimpleName VariableDeclarationFragment CastExpression SimpleType SimpleName element
e SimpleName VariableDeclarationFragment CastExpression SimpleName o
element SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName e
get root SimpleName MethodInvocation SimpleName e
get root SimpleName MethodInvocation InfixExpression SimpleName root
e SimpleName MethodInvocation InfixExpression SimpleName root
root SimpleName InfixExpression IfStatement ReturnStatement SimpleName e
list SimpleName SimpleType CastExpression SimpleName o
l SimpleName VariableDeclarationFragment CastExpression SimpleType SimpleName list
l SimpleName VariableDeclarationFragment CastExpression SimpleName o
list SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName l
l SimpleName MethodInvocation SimpleName iterator
li SimpleName VariableDeclarationFragment MethodInvocation SimpleName l
li SimpleName VariableDeclarationFragment MethodInvocation SimpleName iterator
iterator SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName li
li SimpleName MethodInvocation SimpleName has next
li SimpleName MethodInvocation SimpleName next
id soft ref SimpleName SimpleType CastExpression MethodInvocation SimpleName li
id soft ref SimpleName SimpleType CastExpression MethodInvocation SimpleName next
sr SimpleName VariableDeclarationFragment CastExpression SimpleType SimpleName id soft ref
sr SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName li
sr SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName next
id soft ref SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName sr
sr SimpleName MethodInvocation SimpleName get
o SimpleName Assignment MethodInvocation SimpleName sr
o SimpleName Assignment MethodInvocation SimpleName get
li SimpleName MethodInvocation SimpleName remove
element SimpleName SimpleType CastExpression SimpleName o
e SimpleName VariableDeclarationFragment CastExpression SimpleType SimpleName element
e SimpleName VariableDeclarationFragment CastExpression SimpleName o
element SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName e
get root SimpleName MethodInvocation SimpleName e
get root SimpleName MethodInvocation InfixExpression SimpleName root
e SimpleName MethodInvocation InfixExpression SimpleName root
root SimpleName InfixExpression IfStatement ReturnStatement SimpleName e
public Modifier MethodDeclaration SimpleType SimpleName element
public Modifier MethodDeclaration SimpleName get child element by id
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName node
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName requestor
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName id
element SimpleName SimpleType MethodDeclaration SimpleName get child element by id
element SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName requestor
element SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName id
get child element by id SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName node
get child element by id SimpleName MethodDeclaration SingleVariableDeclaration SimpleName requestor
get child element by id SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
get child element by id SimpleName MethodDeclaration SingleVariableDeclaration SimpleName id
requestor SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName id
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName element
public Modifier TypeDeclaration MethodDeclaration SimpleName get child element by id
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName requestor
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName id
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName element
test SimpleName TypeDeclaration MethodDeclaration SimpleName get child element by id
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName requestor
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName id