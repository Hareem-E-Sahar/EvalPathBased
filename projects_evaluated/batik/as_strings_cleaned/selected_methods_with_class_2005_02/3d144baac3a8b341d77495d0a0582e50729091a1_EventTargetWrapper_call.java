context SimpleName SimpleType SingleVariableDeclaration SimpleName ctx
scriptable SimpleName SimpleType SingleVariableDeclaration SimpleName scope
scriptable SimpleName SimpleType SingleVariableDeclaration SimpleName this obj
object SimpleName SimpleType ArrayType SingleVariableDeclaration SimpleName args
native java object SimpleName SimpleType CastExpression SimpleName this obj
njo SimpleName VariableDeclarationFragment CastExpression SimpleType SimpleName native java object
njo SimpleName VariableDeclarationFragment CastExpression SimpleName this obj
native java object SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName njo
args SimpleName ArrayAccess NumberLiteral empty
args SimpleName ArrayAccess InstanceofExpression SimpleType SimpleName function
empty NumberLiteral ArrayAccess InstanceofExpression SimpleType SimpleName function
args SimpleName ArrayAccess NumberLiteral empty
listener map SimpleName MethodInvocation SimpleName get
listener map SimpleName MethodInvocation ArrayAccess SimpleName args
listener map SimpleName MethodInvocation ArrayAccess NumberLiteral empty
get SimpleName MethodInvocation ArrayAccess SimpleName args
get SimpleName MethodInvocation ArrayAccess NumberLiteral empty
soft reference SimpleName SimpleType CastExpression MethodInvocation SimpleName listener map
soft reference SimpleName SimpleType CastExpression MethodInvocation SimpleName get
sr SimpleName VariableDeclarationFragment CastExpression SimpleType SimpleName soft reference
sr SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName listener map
sr SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName get
soft reference SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName sr
sr SimpleName InfixExpression IfStatement ReturnStatement QualifiedName undefinedinstance
sr SimpleName MethodInvocation SimpleName get
event listener SimpleName SimpleType CastExpression MethodInvocation SimpleName sr
event listener SimpleName SimpleType CastExpression MethodInvocation SimpleName get
el SimpleName VariableDeclarationFragment CastExpression SimpleType SimpleName event listener
el SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName sr
el SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName get
event listener SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName el
el SimpleName InfixExpression IfStatement ReturnStatement QualifiedName undefinedinstance
string SimpleName SimpleType TypeLiteral ArrayInitializer QualifiedName booleantype
string SimpleName SimpleType TypeLiteral ArrayInitializer QualifiedName booleantype
function SimpleName SimpleType TypeLiteral ArrayInitializer QualifiedName booleantype
param types SimpleName VariableDeclarationFragment ArrayInitializer QualifiedName booleantype
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression QualifiedName argslength
args SimpleName ArrayAccess SimpleName i
args SimpleName ArrayAccess SimpleName i
param types SimpleName ArrayAccess SimpleName i
context SimpleName MethodInvocation SimpleName to type
context SimpleName MethodInvocation ArrayAccess SimpleName args
context SimpleName MethodInvocation ArrayAccess SimpleName i
context SimpleName MethodInvocation ArrayAccess SimpleName param types
context SimpleName MethodInvocation ArrayAccess SimpleName i
to type SimpleName MethodInvocation ArrayAccess SimpleName args
to type SimpleName MethodInvocation ArrayAccess SimpleName i
to type SimpleName MethodInvocation ArrayAccess SimpleName param types
to type SimpleName MethodInvocation ArrayAccess SimpleName i
args SimpleName ArrayAccess MethodInvocation ArrayAccess SimpleName param types
args SimpleName ArrayAccess MethodInvocation ArrayAccess SimpleName i
i SimpleName ArrayAccess MethodInvocation ArrayAccess SimpleName param types
i SimpleName ArrayAccess MethodInvocation ArrayAccess SimpleName i
args SimpleName ArrayAccess Assignment MethodInvocation SimpleName context
args SimpleName ArrayAccess Assignment MethodInvocation SimpleName to type
i SimpleName ArrayAccess Assignment MethodInvocation SimpleName context
i SimpleName ArrayAccess Assignment MethodInvocation SimpleName to type
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression QualifiedName argslength
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
argslength QualifiedName InfixExpression ForStatement PostfixExpression SimpleName i
njo SimpleName MethodInvocation SimpleName unwrap
abstract node SimpleName SimpleType CastExpression MethodInvocation SimpleName njo
abstract node SimpleName SimpleType CastExpression MethodInvocation SimpleName unwrap
target SimpleName VariableDeclarationFragment CastExpression SimpleType SimpleName abstract node
target SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName njo
target SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName unwrap
abstract node SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName target
args SimpleName ArrayAccess NumberLiteral empty
string SimpleName SimpleType CastExpression ArrayAccess SimpleName args
string SimpleName SimpleType CastExpression ArrayAccess NumberLiteral empty
args SimpleName ArrayAccess NumberLiteral empty
string SimpleName SimpleType CastExpression ArrayAccess SimpleName args
string SimpleName SimpleType CastExpression ArrayAccess NumberLiteral empty
args SimpleName ArrayAccess NumberLiteral empty
boolean SimpleName SimpleType CastExpression ArrayAccess SimpleName args
boolean SimpleName SimpleType CastExpression ArrayAccess NumberLiteral empty
target SimpleName MethodInvocation SimpleName remove event listener ns
target SimpleName MethodInvocation CastExpression SimpleType SimpleName string
target SimpleName MethodInvocation CastExpression ArrayAccess SimpleName args
target SimpleName MethodInvocation CastExpression ArrayAccess NumberLiteral empty
target SimpleName MethodInvocation CastExpression SimpleType SimpleName string
target SimpleName MethodInvocation CastExpression ArrayAccess SimpleName args
target SimpleName MethodInvocation CastExpression ArrayAccess NumberLiteral empty
target SimpleName MethodInvocation SimpleName el
target SimpleName MethodInvocation MethodInvocation SimpleName boolean value
remove event listener ns SimpleName MethodInvocation CastExpression SimpleType SimpleName string
remove event listener ns SimpleName MethodInvocation CastExpression ArrayAccess SimpleName args
remove event listener ns SimpleName MethodInvocation CastExpression ArrayAccess NumberLiteral empty
remove event listener ns SimpleName MethodInvocation CastExpression SimpleType SimpleName string
remove event listener ns SimpleName MethodInvocation CastExpression ArrayAccess SimpleName args
remove event listener ns SimpleName MethodInvocation CastExpression ArrayAccess NumberLiteral empty
remove event listener ns SimpleName MethodInvocation SimpleName el
remove event listener ns SimpleName MethodInvocation MethodInvocation SimpleName boolean value
string SimpleName SimpleType CastExpression MethodInvocation SimpleName el
args SimpleName ArrayAccess CastExpression MethodInvocation SimpleName el
empty NumberLiteral ArrayAccess CastExpression MethodInvocation SimpleName el
string SimpleName SimpleType CastExpression MethodInvocation SimpleName el
args SimpleName ArrayAccess CastExpression MethodInvocation SimpleName el
empty NumberLiteral ArrayAccess CastExpression MethodInvocation SimpleName el
el SimpleName MethodInvocation MethodInvocation SimpleName boolean value
args SimpleName ArrayAccess NumberLiteral empty
args SimpleName ArrayAccess InstanceofExpression SimpleType SimpleName native object
empty NumberLiteral ArrayAccess InstanceofExpression SimpleType SimpleName native object
args SimpleName ArrayAccess NumberLiteral empty
listener map SimpleName MethodInvocation SimpleName get
listener map SimpleName MethodInvocation ArrayAccess SimpleName args
listener map SimpleName MethodInvocation ArrayAccess NumberLiteral empty
get SimpleName MethodInvocation ArrayAccess SimpleName args
get SimpleName MethodInvocation ArrayAccess NumberLiteral empty
soft reference SimpleName SimpleType CastExpression MethodInvocation SimpleName listener map
soft reference SimpleName SimpleType CastExpression MethodInvocation SimpleName get
sr SimpleName VariableDeclarationFragment CastExpression SimpleType SimpleName soft reference
sr SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName listener map
sr SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName get
soft reference SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName sr
sr SimpleName InfixExpression IfStatement ReturnStatement QualifiedName undefinedinstance
sr SimpleName MethodInvocation SimpleName get
event listener SimpleName SimpleType CastExpression MethodInvocation SimpleName sr
event listener SimpleName SimpleType CastExpression MethodInvocation SimpleName get
el SimpleName VariableDeclarationFragment CastExpression SimpleType SimpleName event listener
el SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName sr
el SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName get
event listener SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName el
el SimpleName InfixExpression IfStatement ReturnStatement QualifiedName undefinedinstance
string SimpleName SimpleType TypeLiteral ArrayInitializer QualifiedName booleantype
string SimpleName SimpleType TypeLiteral ArrayInitializer QualifiedName booleantype
scriptable SimpleName SimpleType TypeLiteral ArrayInitializer QualifiedName booleantype
param types SimpleName VariableDeclarationFragment ArrayInitializer QualifiedName booleantype
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression QualifiedName argslength
args SimpleName ArrayAccess SimpleName i
args SimpleName ArrayAccess SimpleName i
param types SimpleName ArrayAccess SimpleName i
context SimpleName MethodInvocation SimpleName to type
context SimpleName MethodInvocation ArrayAccess SimpleName args
context SimpleName MethodInvocation ArrayAccess SimpleName i
context SimpleName MethodInvocation ArrayAccess SimpleName param types
context SimpleName MethodInvocation ArrayAccess SimpleName i
to type SimpleName MethodInvocation ArrayAccess SimpleName args
to type SimpleName MethodInvocation ArrayAccess SimpleName i
to type SimpleName MethodInvocation ArrayAccess SimpleName param types
to type SimpleName MethodInvocation ArrayAccess SimpleName i
args SimpleName ArrayAccess MethodInvocation ArrayAccess SimpleName param types
args SimpleName ArrayAccess MethodInvocation ArrayAccess SimpleName i
i SimpleName ArrayAccess MethodInvocation ArrayAccess SimpleName param types
i SimpleName ArrayAccess MethodInvocation ArrayAccess SimpleName i
args SimpleName ArrayAccess Assignment MethodInvocation SimpleName context
args SimpleName ArrayAccess Assignment MethodInvocation SimpleName to type
i SimpleName ArrayAccess Assignment MethodInvocation SimpleName context
i SimpleName ArrayAccess Assignment MethodInvocation SimpleName to type
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression QualifiedName argslength
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
argslength QualifiedName InfixExpression ForStatement PostfixExpression SimpleName i
njo SimpleName MethodInvocation SimpleName unwrap
abstract node SimpleName SimpleType CastExpression MethodInvocation SimpleName njo
abstract node SimpleName SimpleType CastExpression MethodInvocation SimpleName unwrap
target SimpleName VariableDeclarationFragment CastExpression SimpleType SimpleName abstract node
target SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName njo
target SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName unwrap
abstract node SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName target
args SimpleName ArrayAccess NumberLiteral empty
string SimpleName SimpleType CastExpression ArrayAccess SimpleName args
string SimpleName SimpleType CastExpression ArrayAccess NumberLiteral empty
args SimpleName ArrayAccess NumberLiteral empty
string SimpleName SimpleType CastExpression ArrayAccess SimpleName args
string SimpleName SimpleType CastExpression ArrayAccess NumberLiteral empty
args SimpleName ArrayAccess NumberLiteral empty
boolean SimpleName SimpleType CastExpression ArrayAccess SimpleName args
boolean SimpleName SimpleType CastExpression ArrayAccess NumberLiteral empty
target SimpleName MethodInvocation SimpleName remove event listener ns
target SimpleName MethodInvocation CastExpression SimpleType SimpleName string
target SimpleName MethodInvocation CastExpression ArrayAccess SimpleName args
target SimpleName MethodInvocation CastExpression ArrayAccess NumberLiteral empty
target SimpleName MethodInvocation CastExpression SimpleType SimpleName string
target SimpleName MethodInvocation CastExpression ArrayAccess SimpleName args
target SimpleName MethodInvocation CastExpression ArrayAccess NumberLiteral empty
target SimpleName MethodInvocation SimpleName el
target SimpleName MethodInvocation MethodInvocation SimpleName boolean value
remove event listener ns SimpleName MethodInvocation CastExpression SimpleType SimpleName string
remove event listener ns SimpleName MethodInvocation CastExpression ArrayAccess SimpleName args
remove event listener ns SimpleName MethodInvocation CastExpression ArrayAccess NumberLiteral empty
remove event listener ns SimpleName MethodInvocation CastExpression SimpleType SimpleName string
remove event listener ns SimpleName MethodInvocation CastExpression ArrayAccess SimpleName args
remove event listener ns SimpleName MethodInvocation CastExpression ArrayAccess NumberLiteral empty
remove event listener ns SimpleName MethodInvocation SimpleName el
remove event listener ns SimpleName MethodInvocation MethodInvocation SimpleName boolean value
string SimpleName SimpleType CastExpression MethodInvocation SimpleName el
args SimpleName ArrayAccess CastExpression MethodInvocation SimpleName el
empty NumberLiteral ArrayAccess CastExpression MethodInvocation SimpleName el
string SimpleName SimpleType CastExpression MethodInvocation SimpleName el
args SimpleName ArrayAccess CastExpression MethodInvocation SimpleName el
empty NumberLiteral ArrayAccess CastExpression MethodInvocation SimpleName el
el SimpleName MethodInvocation MethodInvocation SimpleName boolean value
delegate SimpleName MethodInvocation SimpleName call
delegate SimpleName MethodInvocation SimpleName ctx
delegate SimpleName MethodInvocation SimpleName scope
delegate SimpleName MethodInvocation SimpleName this obj
delegate SimpleName MethodInvocation SimpleName args
call SimpleName MethodInvocation SimpleName ctx
call SimpleName MethodInvocation SimpleName scope
call SimpleName MethodInvocation SimpleName this obj
call SimpleName MethodInvocation SimpleName args
ctx SimpleName MethodInvocation SimpleName scope
ctx SimpleName MethodInvocation SimpleName this obj
ctx SimpleName MethodInvocation SimpleName args
scope SimpleName MethodInvocation SimpleName this obj
scope SimpleName MethodInvocation SimpleName args
this obj SimpleName MethodInvocation SimpleName args
public Modifier MethodDeclaration SimpleType SimpleName object
public Modifier MethodDeclaration SimpleName call
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName context
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName ctx
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName scriptable
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName scope
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName scriptable
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName this obj
object SimpleName SimpleType MethodDeclaration SimpleName call
object SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName ctx
object SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName scope
object SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName this obj
object SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName args
call SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName context
call SimpleName MethodDeclaration SingleVariableDeclaration SimpleName ctx
call SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName scriptable
call SimpleName MethodDeclaration SingleVariableDeclaration SimpleName scope
call SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName scriptable
call SimpleName MethodDeclaration SingleVariableDeclaration SimpleName this obj
call SimpleName MethodDeclaration SingleVariableDeclaration SimpleName args
call SimpleName MethodDeclaration SimpleType SimpleName java script exception
ctx SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName scope
ctx SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName this obj
ctx SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName args
ctx SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName java script exception
scope SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName this obj
scope SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName args
scope SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName java script exception
this obj SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName args
this obj SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName java script exception
args SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName java script exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName object
public Modifier TypeDeclaration MethodDeclaration SimpleName call
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName ctx
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName scope
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName this obj
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName args
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName java script exception
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName object
test SimpleName TypeDeclaration MethodDeclaration SimpleName call
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName ctx
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName scope
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName this obj
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName args
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName java script exception