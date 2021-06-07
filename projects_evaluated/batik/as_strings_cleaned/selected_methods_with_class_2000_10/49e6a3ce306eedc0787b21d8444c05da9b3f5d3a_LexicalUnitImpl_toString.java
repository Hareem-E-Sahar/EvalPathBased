string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName text
text SimpleName Assignment StringLiteral empty
text SimpleName Assignment StringLiteral +
text SimpleName Assignment StringLiteral -
text SimpleName Assignment StringLiteral *
text SimpleName Assignment StringLiteral /
text SimpleName Assignment StringLiteral %
text SimpleName Assignment StringLiteral ^
text SimpleName Assignment StringLiteral <
text SimpleName Assignment StringLiteral >
text SimpleName Assignment StringLiteral <=
text SimpleName Assignment StringLiteral =>
text SimpleName Assignment StringLiteral ~
text SimpleName Assignment StringLiteral inherit
integer SimpleName MethodInvocation SimpleName to string
integer SimpleName MethodInvocation SimpleName i
integer SimpleName MethodInvocation NumberLiteral empty
to string SimpleName MethodInvocation SimpleName i
to string SimpleName MethodInvocation NumberLiteral empty
i SimpleName MethodInvocation NumberLiteral empty
text SimpleName Assignment MethodInvocation SimpleName integer
text SimpleName Assignment MethodInvocation SimpleName to string
text SimpleName Assignment MethodInvocation SimpleName i
text SimpleName Assignment MethodInvocation NumberLiteral empty
f SimpleName InfixExpression StringLiteral empty
text SimpleName Assignment InfixExpression SimpleName f
text SimpleName Assignment InfixExpression StringLiteral empty
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName fs
int PrimitiveType CastExpression SimpleName f
i SimpleName VariableDeclarationFragment CastExpression PrimitiveType int
i SimpleName VariableDeclarationFragment CastExpression SimpleName f
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment CastExpression PrimitiveType int
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment CastExpression SimpleName f
float PrimitiveType CastExpression SimpleName i
float PrimitiveType CastExpression ParenthesizedExpression InfixExpression SimpleName f
i SimpleName CastExpression ParenthesizedExpression InfixExpression SimpleName f
i SimpleName InfixExpression MethodInvocation SimpleName get dimension unit text
text SimpleName Assignment InfixExpression SimpleName i
text SimpleName Assignment InfixExpression MethodInvocation SimpleName get dimension unit text
f SimpleName InfixExpression MethodInvocation SimpleName get dimension unit text
text SimpleName Assignment InfixExpression SimpleName f
text SimpleName Assignment InfixExpression MethodInvocation SimpleName get dimension unit text
uri StringLiteral InfixExpression SimpleName s
uri StringLiteral InfixExpression StringLiteral )
s SimpleName InfixExpression StringLiteral )
text SimpleName Assignment InfixExpression StringLiteral uri
text SimpleName Assignment InfixExpression SimpleName s
text SimpleName Assignment InfixExpression StringLiteral )
get function name SimpleName MethodInvocation InfixExpression StringLiteral (
get function name SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get parameters
get function name SimpleName MethodInvocation InfixExpression StringLiteral )
( StringLiteral InfixExpression MethodInvocation SimpleName get parameters
( StringLiteral InfixExpression StringLiteral )
get parameters SimpleName MethodInvocation InfixExpression StringLiteral )
text SimpleName Assignment InfixExpression MethodInvocation SimpleName get function name
text SimpleName Assignment InfixExpression StringLiteral (
text SimpleName Assignment InfixExpression MethodInvocation SimpleName get parameters
text SimpleName Assignment InfixExpression StringLiteral )
text SimpleName Assignment MethodInvocation SimpleName get string value
text SimpleName Assignment StringLiteral todo
get sub values SimpleName MethodInvocation MethodInvocation SimpleName to string
text SimpleName Assignment MethodInvocation MethodInvocation SimpleName get sub values
text SimpleName Assignment MethodInvocation SimpleName to string
text SimpleName Assignment StringLiteral unknown
type SimpleName SwitchStatement SwitchCase SimpleName sac operator comma
type SimpleName SwitchStatement ExpressionStatement Assignment SimpleName text
type SimpleName SwitchStatement ExpressionStatement Assignment StringLiteral empty
type SimpleName SwitchStatement SwitchCase SimpleName sac operator plus
type SimpleName SwitchStatement ExpressionStatement Assignment SimpleName text
type SimpleName SwitchStatement ExpressionStatement Assignment StringLiteral +
sac operator comma SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac operator plus
sac operator plus SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac operator minus
sac operator minus SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac operator multiply
sac operator multiply SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac operator slash
sac operator slash SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac operator mod
sac operator mod SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac operator exp
sac operator exp SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac operator lt
sac operator lt SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac operator gt
sac operator gt SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac operator le
sac operator le SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac operator ge
sac operator ge SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac operator tilde
sac operator tilde SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac inherit
sac inherit SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac integer
sac integer SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac real
sac real SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac em
sac real SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac ex
sac real SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac pixel
sac em SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac ex
sac em SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac pixel
sac em SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac inch
sac em SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac centimeter
sac em SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac millimeter
sac ex SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac pixel
sac ex SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac inch
sac ex SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac centimeter
sac ex SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac millimeter
sac ex SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac point
sac pixel SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac inch
sac pixel SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac centimeter
sac pixel SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac millimeter
sac pixel SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac point
sac pixel SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac pica
sac inch SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac centimeter
sac inch SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac millimeter
sac inch SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac point
sac inch SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac pica
sac inch SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac percentage
sac centimeter SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac millimeter
sac centimeter SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac point
sac centimeter SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac pica
sac centimeter SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac percentage
sac centimeter SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac degree
sac millimeter SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac point
sac millimeter SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac pica
sac millimeter SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac percentage
sac millimeter SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac degree
sac millimeter SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac gradian
sac point SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac pica
sac point SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac percentage
sac point SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac degree
sac point SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac gradian
sac point SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac radian
sac pica SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac percentage
sac pica SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac degree
sac pica SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac gradian
sac pica SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac radian
sac pica SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac millisecond
sac percentage SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac degree
sac percentage SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac gradian
sac percentage SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac radian
sac percentage SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac millisecond
sac percentage SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac second
sac degree SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac gradian
sac degree SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac radian
sac degree SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac millisecond
sac degree SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac second
sac degree SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac hertz
sac gradian SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac radian
sac gradian SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac millisecond
sac gradian SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac second
sac gradian SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac hertz
sac gradian SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac kilohertz
sac radian SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac millisecond
sac radian SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac second
sac radian SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac hertz
sac radian SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac kilohertz
sac radian SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac dimension
sac millisecond SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac second
sac millisecond SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac hertz
sac millisecond SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac kilohertz
sac millisecond SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac dimension
sac second SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac hertz
sac second SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac kilohertz
sac second SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac dimension
sac second SimpleName SwitchCase SwitchStatement VariableDeclarationStatement PrimitiveType int
sac hertz SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac kilohertz
sac hertz SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac dimension
sac hertz SimpleName SwitchCase SwitchStatement VariableDeclarationStatement PrimitiveType int
sac kilohertz SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac dimension
sac kilohertz SimpleName SwitchCase SwitchStatement VariableDeclarationStatement PrimitiveType int
sac dimension SimpleName SwitchCase SwitchStatement VariableDeclarationStatement PrimitiveType int
sac dimension SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac uri
int PrimitiveType VariableDeclarationStatement SwitchStatement SwitchCase SimpleName sac uri
sac uri SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac counter function
sac uri SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac counters function
sac uri SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac rgbcolor
sac counter function SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac counters function
sac counter function SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac rgbcolor
sac counter function SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac rect function
sac counter function SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac function
sac counters function SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac rgbcolor
sac counters function SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac rect function
sac counters function SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac function
sac rgbcolor SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac rect function
sac rgbcolor SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac function
sac rgbcolor SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac ident
sac rect function SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac function
sac rect function SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac ident
sac rect function SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac string value
sac function SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac ident
sac function SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac string value
sac function SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac attr
sac ident SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac string value
sac ident SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac attr
sac ident SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac unicoderange
sac string value SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac attr
sac string value SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac unicoderange
sac attr SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac unicoderange
sac unicoderange SimpleName SwitchCase SwitchStatement SwitchCase SimpleName sac sub expression
text SimpleName InfixExpression SimpleName next
public Modifier MethodDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SimpleName to string
public Modifier MethodDeclaration Block SwitchStatement SimpleName type
string SimpleName SimpleType MethodDeclaration SimpleName to string
to string SimpleName MethodDeclaration Block SwitchStatement SimpleName type
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName string
public Modifier TypeDeclaration MethodDeclaration SimpleName to string
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName string
test SimpleName TypeDeclaration MethodDeclaration SimpleName to string
