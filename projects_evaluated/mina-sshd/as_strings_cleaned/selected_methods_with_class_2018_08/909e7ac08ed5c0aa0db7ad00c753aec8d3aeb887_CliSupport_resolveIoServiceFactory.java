print stream SimpleName SimpleType SingleVariableDeclaration SimpleName stderr
string SimpleName SimpleType SingleVariableDeclaration SimpleName args
generic utils SimpleName MethodInvocation SimpleName length
generic utils SimpleName MethodInvocation SimpleName args
length SimpleName MethodInvocation SimpleName args
num args SimpleName VariableDeclarationFragment MethodInvocation SimpleName generic utils
num args SimpleName VariableDeclarationFragment MethodInvocation SimpleName length
num args SimpleName VariableDeclarationFragment MethodInvocation SimpleName args
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName num args
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName generic utils
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName length
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName args
builtin io service factory factories SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName factory
index SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName index
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
index SimpleName InfixExpression SimpleName num args
args SimpleName ArrayAccess SimpleName index
arg name SimpleName VariableDeclarationFragment ArrayAccess SimpleName args
arg name SimpleName VariableDeclarationFragment ArrayAccess SimpleName index
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName arg name
io StringLiteral MethodInvocation SimpleName equals
io StringLiteral MethodInvocation SimpleName arg name
equals SimpleName MethodInvocation SimpleName arg name
io factory respecified - already set as StringLiteral InfixExpression SimpleName factory
stderr SimpleName MethodInvocation SimpleName println
stderr SimpleName MethodInvocation InfixExpression StringLiteral io factory respecified - already set as
stderr SimpleName MethodInvocation InfixExpression SimpleName factory
println SimpleName MethodInvocation InfixExpression StringLiteral io factory respecified - already set as
println SimpleName MethodInvocation InfixExpression SimpleName factory
index SimpleName InfixExpression SimpleName num args
option requires an argument StringLiteral InfixExpression SimpleName arg name
stderr SimpleName MethodInvocation SimpleName println
stderr SimpleName MethodInvocation InfixExpression StringLiteral option requires an argument
stderr SimpleName MethodInvocation InfixExpression SimpleName arg name
println SimpleName MethodInvocation InfixExpression StringLiteral option requires an argument
println SimpleName MethodInvocation InfixExpression SimpleName arg name
args SimpleName ArrayAccess SimpleName index
provider SimpleName VariableDeclarationFragment ArrayAccess SimpleName args
provider SimpleName VariableDeclarationFragment ArrayAccess SimpleName index
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName provider
builtin io service factory factories SimpleName MethodInvocation SimpleName from factory name
builtin io service factory factories SimpleName MethodInvocation SimpleName provider
from factory name SimpleName MethodInvocation SimpleName provider
factory SimpleName Assignment MethodInvocation SimpleName builtin io service factory factories
factory SimpleName Assignment MethodInvocation SimpleName from factory name
factory SimpleName Assignment MethodInvocation SimpleName provider
provider ( StringLiteral InfixExpression SimpleName arg name
provider ( StringLiteral InfixExpression StringLiteral ) should be one of
provider ( StringLiteral InfixExpression QualifiedName builtin io service factory factoriesvalues
arg name SimpleName InfixExpression StringLiteral ) should be one of
arg name SimpleName InfixExpression QualifiedName builtin io service factory factoriesvalues
) should be one of StringLiteral InfixExpression QualifiedName builtin io service factory factoriesvalues
systemerr QualifiedName MethodInvocation SimpleName println
systemerr QualifiedName MethodInvocation InfixExpression StringLiteral provider (
systemerr QualifiedName MethodInvocation InfixExpression SimpleName arg name
systemerr QualifiedName MethodInvocation InfixExpression StringLiteral ) should be one of
systemerr QualifiedName MethodInvocation InfixExpression QualifiedName builtin io service factory factoriesvalues
println SimpleName MethodInvocation InfixExpression StringLiteral provider (
println SimpleName MethodInvocation InfixExpression SimpleName arg name
println SimpleName MethodInvocation InfixExpression StringLiteral ) should be one of
println SimpleName MethodInvocation InfixExpression QualifiedName builtin io service factory factoriesvalues
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName index
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName num args
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName index
index SimpleName InfixExpression ForStatement PostfixExpression SimpleName index
num args SimpleName InfixExpression ForStatement PostfixExpression SimpleName index
factory SimpleName Assignment SimpleName default io service factory
io service factory factory SimpleName SimpleType TypeLiteral MethodInvocation SimpleName get name
factory SimpleName MethodInvocation SimpleName get factory class name
system SimpleName MethodInvocation SimpleName set property
system SimpleName MethodInvocation MethodInvocation SimpleName get name
system SimpleName MethodInvocation MethodInvocation SimpleName factory
system SimpleName MethodInvocation MethodInvocation SimpleName get factory class name
set property SimpleName MethodInvocation MethodInvocation SimpleName get name
set property SimpleName MethodInvocation MethodInvocation SimpleName factory
set property SimpleName MethodInvocation MethodInvocation SimpleName get factory class name
get name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName factory
get name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get factory class name
int PrimitiveType VariableDeclarationStatement Block ReturnStatement SimpleName factory
public Modifier MethodDeclaration Modifier static
public Modifier MethodDeclaration SimpleType SimpleName builtin io service factory factories
public Modifier MethodDeclaration SimpleName resolve io service factory
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName print stream
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName stderr
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName args
static Modifier MethodDeclaration SimpleType SimpleName builtin io service factory factories
static Modifier MethodDeclaration SimpleName resolve io service factory
static Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName print stream
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName stderr
static Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName args
static Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
static Modifier MethodDeclaration Block ReturnStatement SimpleName factory
builtin io service factory factories SimpleName SimpleType MethodDeclaration SimpleName resolve io service factory
builtin io service factory factories SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName stderr
builtin io service factory factories SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName args
resolve io service factory SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName print stream
resolve io service factory SimpleName MethodDeclaration SingleVariableDeclaration SimpleName stderr
resolve io service factory SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
resolve io service factory SimpleName MethodDeclaration SingleVariableDeclaration SimpleName args
resolve io service factory SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
resolve io service factory SimpleName MethodDeclaration Block ReturnStatement SimpleName factory
stderr SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName args
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration Modifier static
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName builtin io service factory factories
public Modifier TypeDeclaration MethodDeclaration SimpleName resolve io service factory
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName stderr
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName args
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration Modifier static
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName builtin io service factory factories
test SimpleName TypeDeclaration MethodDeclaration SimpleName resolve io service factory
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName stderr
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName args