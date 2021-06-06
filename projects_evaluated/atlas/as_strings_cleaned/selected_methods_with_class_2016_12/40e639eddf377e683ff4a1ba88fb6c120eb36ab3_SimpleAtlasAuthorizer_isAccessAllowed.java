atlas access request SimpleName SimpleType SingleVariableDeclaration SimpleName request
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral ==> simple atlas authorizer is access allowed
debug SimpleName MethodInvocation StringLiteral ==> simple atlas authorizer is access allowed
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral is access allowd
log SimpleName MethodInvocation SimpleName request
debug SimpleName MethodInvocation StringLiteral is access allowd
debug SimpleName MethodInvocation SimpleName request
is access allowd StringLiteral MethodInvocation SimpleName request
request SimpleName MethodInvocation SimpleName get user
user SimpleName VariableDeclarationFragment MethodInvocation SimpleName request
user SimpleName VariableDeclarationFragment MethodInvocation SimpleName get user
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName user
set SimpleName SimpleType ParameterizedType SimpleType SimpleName string
request SimpleName MethodInvocation SimpleName get user groups
groups SimpleName VariableDeclarationFragment MethodInvocation SimpleName request
groups SimpleName VariableDeclarationFragment MethodInvocation SimpleName get user groups
request SimpleName MethodInvocation SimpleName get action
action SimpleName VariableDeclarationFragment MethodInvocation SimpleName request
action SimpleName VariableDeclarationFragment MethodInvocation SimpleName get action
atlas action types SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName action
request SimpleName MethodInvocation SimpleName get resource
resource SimpleName VariableDeclarationFragment MethodInvocation SimpleName request
resource SimpleName VariableDeclarationFragment MethodInvocation SimpleName get resource
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName resource
set SimpleName SimpleType ParameterizedType SimpleType SimpleName atlas resource types
request SimpleName MethodInvocation SimpleName get resource types
resource types SimpleName VariableDeclarationFragment MethodInvocation SimpleName request
resource types SimpleName VariableDeclarationFragment MethodInvocation SimpleName get resource types
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral checking for :: user :: {} groups :: {} action :: {} resource :: {}
log SimpleName MethodInvocation SimpleName user
log SimpleName MethodInvocation SimpleName groups
log SimpleName MethodInvocation SimpleName action
debug SimpleName MethodInvocation StringLiteral checking for :: user :: {} groups :: {} action :: {} resource :: {}
debug SimpleName MethodInvocation SimpleName user
debug SimpleName MethodInvocation SimpleName groups
debug SimpleName MethodInvocation SimpleName action
debug SimpleName MethodInvocation SimpleName resource
checking for :: user :: {} groups :: {} action :: {} resource :: {} StringLiteral MethodInvocation SimpleName user
checking for :: user :: {} groups :: {} action :: {} resource :: {} StringLiteral MethodInvocation SimpleName groups
checking for :: user :: {} groups :: {} action :: {} resource :: {} StringLiteral MethodInvocation SimpleName action
checking for :: user :: {} groups :: {} action :: {} resource :: {} StringLiteral MethodInvocation SimpleName resource
user SimpleName MethodInvocation SimpleName groups
user SimpleName MethodInvocation SimpleName action
user SimpleName MethodInvocation SimpleName resource
groups SimpleName MethodInvocation SimpleName action
groups SimpleName MethodInvocation SimpleName resource
action SimpleName MethodInvocation SimpleName resource
is debug enabled SimpleName IfStatement ExpressionStatement MethodInvocation SimpleName log
is debug enabled SimpleName IfStatement ExpressionStatement MethodInvocation SimpleName debug
is debug enabled SimpleName IfStatement ExpressionStatement MethodInvocation StringLiteral checking for :: user :: {} groups :: {} action :: {} resource :: {}
is debug enabled SimpleName IfStatement ExpressionStatement MethodInvocation SimpleName user
is debug enabled SimpleName IfStatement ExpressionStatement MethodInvocation SimpleName groups
is debug enabled SimpleName IfStatement ExpressionStatement MethodInvocation SimpleName action
is debug enabled SimpleName IfStatement ExpressionStatement MethodInvocation SimpleName resource
is access allowed SimpleName VariableDeclarationFragment BooleanLiteral false
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName is access allowed
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment BooleanLiteral false
is user SimpleName VariableDeclarationFragment InfixExpression SimpleName user
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName is user
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment InfixExpression SimpleName user
is group SimpleName VariableDeclarationFragment InfixExpression SimpleName groups
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName is group
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment InfixExpression SimpleName groups
is user SimpleName PrefixExpression InfixExpression PrefixExpression SimpleName is group
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral please check the formation atlas access request
debug SimpleName MethodInvocation StringLiteral please check the formation atlas access request
is debug enabled SimpleName IfStatement Block ReturnStatement SimpleName is access allowed
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral check access for operation :: {} on resource {}:{}
log SimpleName MethodInvocation SimpleName action
log SimpleName MethodInvocation SimpleName resource types
log SimpleName MethodInvocation SimpleName resource
debug SimpleName MethodInvocation StringLiteral check access for operation :: {} on resource {}:{}
debug SimpleName MethodInvocation SimpleName action
debug SimpleName MethodInvocation SimpleName resource types
debug SimpleName MethodInvocation SimpleName resource
check access for operation :: {} on resource {}:{} StringLiteral MethodInvocation SimpleName action
check access for operation :: {} on resource {}:{} StringLiteral MethodInvocation SimpleName resource types
check access for operation :: {} on resource {}:{} StringLiteral MethodInvocation SimpleName resource
action SimpleName MethodInvocation SimpleName resource types
action SimpleName MethodInvocation SimpleName resource
resource types SimpleName MethodInvocation SimpleName resource
check access SimpleName MethodInvocation SimpleName user
check access SimpleName MethodInvocation SimpleName resource types
check access SimpleName MethodInvocation SimpleName resource
check access SimpleName MethodInvocation SimpleName user read map
user SimpleName MethodInvocation SimpleName resource types
user SimpleName MethodInvocation SimpleName resource
user SimpleName MethodInvocation SimpleName user read map
resource types SimpleName MethodInvocation SimpleName resource
resource types SimpleName MethodInvocation SimpleName user read map
resource SimpleName MethodInvocation SimpleName user read map
is access allowed SimpleName Assignment MethodInvocation SimpleName check access
is access allowed SimpleName Assignment MethodInvocation SimpleName user
is access allowed SimpleName Assignment MethodInvocation SimpleName resource types
is access allowed SimpleName Assignment MethodInvocation SimpleName resource
is access allowed SimpleName Assignment MethodInvocation SimpleName user read map
check access for groups SimpleName MethodInvocation SimpleName groups
check access for groups SimpleName MethodInvocation SimpleName resource types
check access for groups SimpleName MethodInvocation SimpleName resource
check access for groups SimpleName MethodInvocation SimpleName group read map
groups SimpleName MethodInvocation SimpleName resource types
groups SimpleName MethodInvocation SimpleName resource
groups SimpleName MethodInvocation SimpleName group read map
resource types SimpleName MethodInvocation SimpleName resource
resource types SimpleName MethodInvocation SimpleName group read map
resource SimpleName MethodInvocation SimpleName group read map
is access allowed SimpleName InfixExpression MethodInvocation SimpleName check access for groups
is access allowed SimpleName InfixExpression MethodInvocation SimpleName groups
is access allowed SimpleName InfixExpression MethodInvocation SimpleName resource types
is access allowed SimpleName InfixExpression MethodInvocation SimpleName resource
is access allowed SimpleName InfixExpression MethodInvocation SimpleName group read map
is access allowed SimpleName Assignment InfixExpression SimpleName is access allowed
is access allowed SimpleName Assignment InfixExpression MethodInvocation SimpleName check access for groups
is access allowed SimpleName Assignment InfixExpression MethodInvocation SimpleName groups
is access allowed SimpleName Assignment InfixExpression MethodInvocation SimpleName resource types
is access allowed SimpleName Assignment InfixExpression MethodInvocation SimpleName resource
is access allowed SimpleName Assignment InfixExpression MethodInvocation SimpleName group read map
check access SimpleName MethodInvocation SimpleName user
check access SimpleName MethodInvocation SimpleName resource types
check access SimpleName MethodInvocation SimpleName resource
check access SimpleName MethodInvocation SimpleName user write map
user SimpleName MethodInvocation SimpleName resource types
user SimpleName MethodInvocation SimpleName resource
user SimpleName MethodInvocation SimpleName user write map
resource types SimpleName MethodInvocation SimpleName resource
resource types SimpleName MethodInvocation SimpleName user write map
resource SimpleName MethodInvocation SimpleName user write map
is access allowed SimpleName Assignment MethodInvocation SimpleName check access
is access allowed SimpleName Assignment MethodInvocation SimpleName user
is access allowed SimpleName Assignment MethodInvocation SimpleName resource types
is access allowed SimpleName Assignment MethodInvocation SimpleName resource
is access allowed SimpleName Assignment MethodInvocation SimpleName user write map
check access for groups SimpleName MethodInvocation SimpleName groups
check access for groups SimpleName MethodInvocation SimpleName resource types
check access for groups SimpleName MethodInvocation SimpleName resource
check access for groups SimpleName MethodInvocation SimpleName group write map
groups SimpleName MethodInvocation SimpleName resource types
groups SimpleName MethodInvocation SimpleName resource
groups SimpleName MethodInvocation SimpleName group write map
resource types SimpleName MethodInvocation SimpleName resource
resource types SimpleName MethodInvocation SimpleName group write map
resource SimpleName MethodInvocation SimpleName group write map
is access allowed SimpleName InfixExpression MethodInvocation SimpleName check access for groups
is access allowed SimpleName InfixExpression MethodInvocation SimpleName groups
is access allowed SimpleName InfixExpression MethodInvocation SimpleName resource types
is access allowed SimpleName InfixExpression MethodInvocation SimpleName resource
is access allowed SimpleName InfixExpression MethodInvocation SimpleName group write map
is access allowed SimpleName Assignment InfixExpression SimpleName is access allowed
is access allowed SimpleName Assignment InfixExpression MethodInvocation SimpleName check access for groups
is access allowed SimpleName Assignment InfixExpression MethodInvocation SimpleName groups
is access allowed SimpleName Assignment InfixExpression MethodInvocation SimpleName resource types
is access allowed SimpleName Assignment InfixExpression MethodInvocation SimpleName resource
is access allowed SimpleName Assignment InfixExpression MethodInvocation SimpleName group write map
check access SimpleName MethodInvocation SimpleName user
check access SimpleName MethodInvocation SimpleName resource types
check access SimpleName MethodInvocation SimpleName resource
check access SimpleName MethodInvocation SimpleName user update map
user SimpleName MethodInvocation SimpleName resource types
user SimpleName MethodInvocation SimpleName resource
user SimpleName MethodInvocation SimpleName user update map
resource types SimpleName MethodInvocation SimpleName resource
resource types SimpleName MethodInvocation SimpleName user update map
resource SimpleName MethodInvocation SimpleName user update map
is access allowed SimpleName Assignment MethodInvocation SimpleName check access
is access allowed SimpleName Assignment MethodInvocation SimpleName user
is access allowed SimpleName Assignment MethodInvocation SimpleName resource types
is access allowed SimpleName Assignment MethodInvocation SimpleName resource
is access allowed SimpleName Assignment MethodInvocation SimpleName user update map
check access for groups SimpleName MethodInvocation SimpleName groups
check access for groups SimpleName MethodInvocation SimpleName resource types
check access for groups SimpleName MethodInvocation SimpleName resource
check access for groups SimpleName MethodInvocation SimpleName group update map
groups SimpleName MethodInvocation SimpleName resource types
groups SimpleName MethodInvocation SimpleName resource
groups SimpleName MethodInvocation SimpleName group update map
resource types SimpleName MethodInvocation SimpleName resource
resource types SimpleName MethodInvocation SimpleName group update map
resource SimpleName MethodInvocation SimpleName group update map
is access allowed SimpleName InfixExpression MethodInvocation SimpleName check access for groups
is access allowed SimpleName InfixExpression MethodInvocation SimpleName groups
is access allowed SimpleName InfixExpression MethodInvocation SimpleName resource types
is access allowed SimpleName InfixExpression MethodInvocation SimpleName resource
is access allowed SimpleName InfixExpression MethodInvocation SimpleName group update map
is access allowed SimpleName Assignment InfixExpression SimpleName is access allowed
is access allowed SimpleName Assignment InfixExpression MethodInvocation SimpleName check access for groups
is access allowed SimpleName Assignment InfixExpression MethodInvocation SimpleName groups
is access allowed SimpleName Assignment InfixExpression MethodInvocation SimpleName resource types
is access allowed SimpleName Assignment InfixExpression MethodInvocation SimpleName resource
is access allowed SimpleName Assignment InfixExpression MethodInvocation SimpleName group update map
check access SimpleName MethodInvocation SimpleName user
check access SimpleName MethodInvocation SimpleName resource types
check access SimpleName MethodInvocation SimpleName resource
check access SimpleName MethodInvocation SimpleName user delete map
user SimpleName MethodInvocation SimpleName resource types
user SimpleName MethodInvocation SimpleName resource
user SimpleName MethodInvocation SimpleName user delete map
resource types SimpleName MethodInvocation SimpleName resource
resource types SimpleName MethodInvocation SimpleName user delete map
resource SimpleName MethodInvocation SimpleName user delete map
is access allowed SimpleName Assignment MethodInvocation SimpleName check access
is access allowed SimpleName Assignment MethodInvocation SimpleName user
is access allowed SimpleName Assignment MethodInvocation SimpleName resource types
is access allowed SimpleName Assignment MethodInvocation SimpleName resource
is access allowed SimpleName Assignment MethodInvocation SimpleName user delete map
check access for groups SimpleName MethodInvocation SimpleName groups
check access for groups SimpleName MethodInvocation SimpleName resource types
check access for groups SimpleName MethodInvocation SimpleName resource
check access for groups SimpleName MethodInvocation SimpleName group delete map
groups SimpleName MethodInvocation SimpleName resource types
groups SimpleName MethodInvocation SimpleName resource
groups SimpleName MethodInvocation SimpleName group delete map
resource types SimpleName MethodInvocation SimpleName resource
resource types SimpleName MethodInvocation SimpleName group delete map
resource SimpleName MethodInvocation SimpleName group delete map
is access allowed SimpleName InfixExpression MethodInvocation SimpleName check access for groups
is access allowed SimpleName InfixExpression MethodInvocation SimpleName groups
is access allowed SimpleName InfixExpression MethodInvocation SimpleName resource types
is access allowed SimpleName InfixExpression MethodInvocation SimpleName resource
is access allowed SimpleName InfixExpression MethodInvocation SimpleName group delete map
is access allowed SimpleName Assignment InfixExpression SimpleName is access allowed
is access allowed SimpleName Assignment InfixExpression MethodInvocation SimpleName check access for groups
is access allowed SimpleName Assignment InfixExpression MethodInvocation SimpleName groups
is access allowed SimpleName Assignment InfixExpression MethodInvocation SimpleName resource types
is access allowed SimpleName Assignment InfixExpression MethodInvocation SimpleName resource
is access allowed SimpleName Assignment InfixExpression MethodInvocation SimpleName group delete map
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral invalid action {} raising atlas authorization exception
log SimpleName MethodInvocation SimpleName action
debug SimpleName MethodInvocation StringLiteral invalid action {} raising atlas authorization exception
debug SimpleName MethodInvocation SimpleName action
invalid action {} raising atlas authorization exception StringLiteral MethodInvocation SimpleName action
invalid action :: StringLiteral InfixExpression SimpleName action
atlas authorization exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral invalid action ::
atlas authorization exception SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName action
action SimpleName SwitchStatement SwitchCase SimpleName read
action SimpleName SwitchStatement ExpressionStatement Assignment SimpleName is access allowed
action SimpleName SwitchStatement ExpressionStatement Assignment SimpleName is access allowed
action SimpleName SwitchStatement SwitchCase SimpleName create
read SimpleName SwitchCase SwitchStatement SwitchCase SimpleName create
create SimpleName SwitchCase SwitchStatement SwitchCase SimpleName update
update SimpleName SwitchCase SwitchStatement SwitchCase SimpleName delete
delete SimpleName SwitchCase SwitchStatement IfStatement SimpleName is debug enabled
is debug enabled SimpleName IfStatement Block SwitchStatement SimpleName action
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral <== simple atlas authorizer is access allowed = {}
log SimpleName MethodInvocation SimpleName is access allowed
debug SimpleName MethodInvocation StringLiteral <== simple atlas authorizer is access allowed = {}
debug SimpleName MethodInvocation SimpleName is access allowed
<== simple atlas authorizer is access allowed = {} StringLiteral MethodInvocation SimpleName is access allowed
is debug enabled SimpleName IfStatement Block VariableDeclarationStatement PrimitiveType boolean
is debug enabled SimpleName IfStatement Block VariableDeclarationStatement PrimitiveType boolean
is debug enabled SimpleName IfStatement Block VariableDeclarationStatement PrimitiveType boolean
is debug enabled SimpleName IfStatement Block IfStatement SimpleName is debug enabled
boolean PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType boolean
boolean PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType boolean
boolean PrimitiveType VariableDeclarationStatement Block IfStatement SimpleName is debug enabled
boolean PrimitiveType VariableDeclarationStatement Block ReturnStatement SimpleName is access allowed
boolean PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType boolean
boolean PrimitiveType VariableDeclarationStatement Block IfStatement SimpleName is debug enabled
boolean PrimitiveType VariableDeclarationStatement Block ReturnStatement SimpleName is access allowed
boolean PrimitiveType VariableDeclarationStatement Block IfStatement SimpleName is debug enabled
boolean PrimitiveType VariableDeclarationStatement Block ReturnStatement SimpleName is access allowed
is debug enabled SimpleName IfStatement Block ReturnStatement SimpleName is access allowed
override SimpleName MarkerAnnotation MethodDeclaration Modifier public
override SimpleName MarkerAnnotation MethodDeclaration PrimitiveType boolean
override SimpleName MarkerAnnotation MethodDeclaration SimpleName is access allowed
override SimpleName MarkerAnnotation MethodDeclaration SingleVariableDeclaration SimpleName request
override SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName atlas authorization exception
public Modifier MethodDeclaration PrimitiveType boolean
public Modifier MethodDeclaration SimpleName is access allowed
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName atlas access request
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName request
public Modifier MethodDeclaration SimpleType SimpleName atlas authorization exception
public Modifier MethodDeclaration Block IfStatement SimpleName is debug enabled
public Modifier MethodDeclaration Block IfStatement SimpleName is debug enabled
public Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType boolean
public Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType boolean
public Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType boolean
public Modifier MethodDeclaration Block IfStatement SimpleName is debug enabled
public Modifier MethodDeclaration Block ReturnStatement SimpleName is access allowed
boolean PrimitiveType MethodDeclaration SimpleName is access allowed
boolean PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName atlas access request
boolean PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName request
boolean PrimitiveType MethodDeclaration SimpleType SimpleName atlas authorization exception
boolean PrimitiveType MethodDeclaration Block IfStatement SimpleName is debug enabled
boolean PrimitiveType MethodDeclaration Block IfStatement SimpleName is debug enabled
boolean PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType boolean
boolean PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType boolean
boolean PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType boolean
boolean PrimitiveType MethodDeclaration Block IfStatement SimpleName is debug enabled
boolean PrimitiveType MethodDeclaration Block ReturnStatement SimpleName is access allowed
is access allowed SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName atlas access request
is access allowed SimpleName MethodDeclaration SingleVariableDeclaration SimpleName request
is access allowed SimpleName MethodDeclaration SimpleType SimpleName atlas authorization exception
is access allowed SimpleName MethodDeclaration Block IfStatement SimpleName is debug enabled
is access allowed SimpleName MethodDeclaration Block IfStatement SimpleName is debug enabled
is access allowed SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType boolean
is access allowed SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType boolean
is access allowed SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType boolean
is access allowed SimpleName MethodDeclaration Block IfStatement SimpleName is debug enabled
is access allowed SimpleName MethodDeclaration Block ReturnStatement SimpleName is access allowed
request SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName atlas authorization exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName override
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType boolean
public Modifier TypeDeclaration MethodDeclaration SimpleName is access allowed
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName request
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName atlas authorization exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName override
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType boolean
test SimpleName TypeDeclaration MethodDeclaration SimpleName is access allowed
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName request
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName atlas authorization exception
