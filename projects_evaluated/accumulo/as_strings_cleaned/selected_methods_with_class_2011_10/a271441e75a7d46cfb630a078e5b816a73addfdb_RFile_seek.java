range SimpleName SimpleType SingleVariableDeclaration SimpleName range
collection SimpleName SimpleType ParameterizedType SimpleType SimpleName byte sequence
collection SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName column families
byte sequence SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName column families
boolean PrimitiveType SingleVariableDeclaration SimpleName inclusive
num lg seeked SimpleName Assignment NumberLiteral empty
set SimpleName SimpleType ParameterizedType SimpleType SimpleName byte sequence
column families SimpleName MethodInvocation SimpleName size
column families SimpleName MethodInvocation InfixExpression NumberLiteral empty
size SimpleName MethodInvocation InfixExpression NumberLiteral empty
set SimpleName SimpleType ParameterizedType WildcardType ?
column families SimpleName InstanceofExpression ParameterizedType SimpleType SimpleName set
column families SimpleName InstanceofExpression ParameterizedType WildcardType ?
set SimpleName SimpleType ParameterizedType SimpleType SimpleName byte sequence
set SimpleName SimpleType ParameterizedType CastExpression SimpleName column families
byte sequence SimpleName SimpleType ParameterizedType CastExpression SimpleName column families
cf set SimpleName Assignment CastExpression SimpleName column families
hash set SimpleName SimpleType ParameterizedType SimpleType SimpleName byte sequence
cf set SimpleName MethodInvocation SimpleName add all
cf set SimpleName MethodInvocation SimpleName column families
add all SimpleName MethodInvocation SimpleName column families
collections SimpleName MethodInvocation SimpleName empty set
cf set SimpleName Assignment MethodInvocation SimpleName collections
cf set SimpleName Assignment MethodInvocation SimpleName empty set
locality group reader SimpleName SimpleType SingleVariableDeclaration SimpleName lgr
exclude SimpleName VariableDeclarationFragment BooleanLiteral false
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName exclude
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment BooleanLiteral false
include SimpleName VariableDeclarationFragment BooleanLiteral false
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName include
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment BooleanLiteral false
cf set SimpleName MethodInvocation SimpleName size
cf set SimpleName MethodInvocation InfixExpression NumberLiteral empty
size SimpleName MethodInvocation InfixExpression NumberLiteral empty
include SimpleName Assignment PrefixExpression SimpleName inclusive
exclude SimpleName Assignment BooleanLiteral false
lgris default locality group QualifiedName InfixExpression InfixExpression QualifiedName lgrcolumn families
non default column families SimpleName MethodInvocation SimpleName contains all
non default column families SimpleName MethodInvocation SimpleName cf set
contains all SimpleName MethodInvocation SimpleName cf set
exclude SimpleName Assignment BooleanLiteral true
include SimpleName Assignment BooleanLiteral true
include SimpleName Assignment BooleanLiteral true
non default column families SimpleName MethodInvocation SimpleName contains all
non default column families SimpleName MethodInvocation SimpleName cf set
contains all SimpleName MethodInvocation SimpleName cf set
exclude SimpleName Assignment PrefixExpression MethodInvocation SimpleName non default column families
exclude SimpleName Assignment PrefixExpression MethodInvocation SimpleName contains all
exclude SimpleName Assignment PrefixExpression MethodInvocation SimpleName cf set
entry SimpleName SimpleType ParameterizedType SimpleType SimpleName byte sequence
entry SimpleName SimpleType ParameterizedType SimpleType SimpleName count
byte sequence SimpleName SimpleType ParameterizedType SimpleType SimpleName count
entry SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName entry
byte sequence SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName entry
count SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName entry
lgrcolumn families QualifiedName MethodInvocation SimpleName entry set
entry SimpleName MethodInvocation SimpleName get value
entry SimpleName MethodInvocation FieldAccess SimpleName count
get value SimpleName MethodInvocation FieldAccess SimpleName count
entry SimpleName MethodInvocation FieldAccess InfixExpression NumberLiteral empty
get value SimpleName MethodInvocation FieldAccess InfixExpression NumberLiteral empty
count SimpleName FieldAccess InfixExpression NumberLiteral empty
entry SimpleName MethodInvocation SimpleName get key
cf set SimpleName MethodInvocation SimpleName contains
cf set SimpleName MethodInvocation MethodInvocation SimpleName entry
cf set SimpleName MethodInvocation MethodInvocation SimpleName get key
contains SimpleName MethodInvocation MethodInvocation SimpleName entry
contains SimpleName MethodInvocation MethodInvocation SimpleName get key
include SimpleName Assignment BooleanLiteral true
exclude SimpleName Assignment BooleanLiteral true
inclusive SimpleName IfStatement ExpressionStatement Assignment SimpleName include
inclusive SimpleName IfStatement ExpressionStatement Assignment BooleanLiteral true
inclusive SimpleName IfStatement ExpressionStatement Assignment SimpleName exclude
inclusive SimpleName IfStatement ExpressionStatement Assignment BooleanLiteral true
exclude SimpleName Assignment BooleanLiteral true
include SimpleName Assignment BooleanLiteral true
inclusive SimpleName IfStatement ExpressionStatement Assignment SimpleName exclude
inclusive SimpleName IfStatement ExpressionStatement Assignment BooleanLiteral true
inclusive SimpleName IfStatement ExpressionStatement Assignment SimpleName include
inclusive SimpleName IfStatement ExpressionStatement Assignment BooleanLiteral true
cf set SimpleName MethodInvocation IfStatement IfStatement SimpleName inclusive
contains SimpleName MethodInvocation IfStatement IfStatement SimpleName inclusive
cf set SimpleName MethodInvocation IfStatement IfStatement SimpleName inclusive
contains SimpleName MethodInvocation IfStatement IfStatement SimpleName inclusive
inclusive SimpleName IfStatement IfStatement IfStatement SimpleName inclusive
entry SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation QualifiedName lgrcolumn families
entry SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName entry set
file cf skipping iterator SimpleName SimpleType ClassInstanceCreation SimpleName lgr
cfe SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName file cf skipping iterator
cfe SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName lgr
file cf skipping iterator SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName cfe
cfe SimpleName MethodInvocation SimpleName seek
cfe SimpleName MethodInvocation SimpleName range
cfe SimpleName MethodInvocation SimpleName cf set
cfe SimpleName MethodInvocation SimpleName inclusive
seek SimpleName MethodInvocation SimpleName range
seek SimpleName MethodInvocation SimpleName cf set
seek SimpleName MethodInvocation SimpleName inclusive
range SimpleName MethodInvocation SimpleName cf set
range SimpleName MethodInvocation SimpleName inclusive
cf set SimpleName MethodInvocation SimpleName inclusive
add source SimpleName MethodInvocation SimpleName cfe
lgr SimpleName MethodInvocation SimpleName seek
lgr SimpleName MethodInvocation SimpleName range
lgr SimpleName MethodInvocation SimpleName empty cf set
lgr SimpleName MethodInvocation BooleanLiteral false
seek SimpleName MethodInvocation SimpleName range
seek SimpleName MethodInvocation SimpleName empty cf set
seek SimpleName MethodInvocation BooleanLiteral false
range SimpleName MethodInvocation SimpleName empty cf set
range SimpleName MethodInvocation BooleanLiteral false
empty cf set SimpleName MethodInvocation BooleanLiteral false
add source SimpleName MethodInvocation SimpleName lgr
include SimpleName IfStatement Block IfStatement SimpleName exclude
boolean PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType boolean
boolean PrimitiveType VariableDeclarationStatement Block IfStatement SimpleName include
boolean PrimitiveType VariableDeclarationStatement Block IfStatement SimpleName include
locality group reader SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName lg readers
lgr SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName lg readers
lg readers SimpleName EnhancedForStatement Block VariableDeclarationStatement PrimitiveType boolean
lg readers SimpleName EnhancedForStatement Block VariableDeclarationStatement PrimitiveType boolean
lg readers SimpleName EnhancedForStatement Block IfStatement SimpleName include
override SimpleName MarkerAnnotation MethodDeclaration Modifier public
override SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
override SimpleName MarkerAnnotation MethodDeclaration SimpleName seek
override SimpleName MarkerAnnotation MethodDeclaration SingleVariableDeclaration SimpleName range
override SimpleName MarkerAnnotation MethodDeclaration SingleVariableDeclaration SimpleName column families
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName seek
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName range
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName range
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName column families
public Modifier MethodDeclaration SingleVariableDeclaration PrimitiveType boolean
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName inclusive
void PrimitiveType MethodDeclaration SimpleName seek
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName range
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName range
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName column families
void PrimitiveType MethodDeclaration SingleVariableDeclaration PrimitiveType boolean
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName inclusive
void PrimitiveType MethodDeclaration SimpleType SimpleName io exception
seek SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName range
seek SimpleName MethodDeclaration SingleVariableDeclaration SimpleName range
seek SimpleName MethodDeclaration SingleVariableDeclaration SimpleName column families
seek SimpleName MethodDeclaration SingleVariableDeclaration PrimitiveType boolean
seek SimpleName MethodDeclaration SingleVariableDeclaration SimpleName inclusive
seek SimpleName MethodDeclaration SimpleType SimpleName io exception
seek SimpleName MethodDeclaration Block EnhancedForStatement SimpleName lg readers
range SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName column families
range SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType boolean
range SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName inclusive
range SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
column families SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType boolean
column families SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName inclusive
column families SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
boolean PrimitiveType SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
inclusive SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName override
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName seek
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName range
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName column families
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType boolean
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName inclusive
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName override
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName seek
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName range
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName column families
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType boolean
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName inclusive
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName io exception