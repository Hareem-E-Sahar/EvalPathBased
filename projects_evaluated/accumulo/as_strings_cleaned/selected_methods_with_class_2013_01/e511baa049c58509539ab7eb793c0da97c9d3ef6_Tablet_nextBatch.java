sorted key value iterator SimpleName SimpleType ParameterizedType SimpleType SimpleName key
sorted key value iterator SimpleName SimpleType ParameterizedType SimpleType SimpleName value
key SimpleName SimpleType ParameterizedType SimpleType SimpleName value
sorted key value iterator SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName iter
key SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName iter
value SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName iter
range SimpleName SimpleType SingleVariableDeclaration SimpleName range
int PrimitiveType SingleVariableDeclaration SimpleName num
hash set SimpleName SimpleType ParameterizedType SimpleType SimpleName column
hash set SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName columns
column SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName columns
list SimpleName SimpleType ParameterizedType SimpleType SimpleName kv entry
array list SimpleName SimpleType ParameterizedType SimpleType SimpleName kv entry
key SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName key
value SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName value
result size SimpleName VariableDeclarationFragment NumberLiteral l
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName result size
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment NumberLiteral l
result bytes SimpleName VariableDeclarationFragment NumberLiteral l
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName result bytes
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment NumberLiteral l
acu table conf SimpleName MethodInvocation SimpleName get memory in bytes
acu table conf SimpleName MethodInvocation QualifiedName propertytable scan maxmem
get memory in bytes SimpleName MethodInvocation QualifiedName propertytable scan maxmem
max results size SimpleName VariableDeclarationFragment MethodInvocation SimpleName acu table conf
max results size SimpleName VariableDeclarationFragment MethodInvocation SimpleName get memory in bytes
max results size SimpleName VariableDeclarationFragment MethodInvocation QualifiedName propertytable scan maxmem
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName max results size
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName acu table conf
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get memory in bytes
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation QualifiedName propertytable scan maxmem
columns SimpleName MethodInvocation SimpleName size
columns SimpleName MethodInvocation InfixExpression NumberLiteral empty
size SimpleName MethodInvocation InfixExpression NumberLiteral empty
iter SimpleName MethodInvocation SimpleName seek
iter SimpleName MethodInvocation SimpleName range
iter SimpleName MethodInvocation QualifiedName locality group utilempty cf set
iter SimpleName MethodInvocation BooleanLiteral false
seek SimpleName MethodInvocation SimpleName range
seek SimpleName MethodInvocation QualifiedName locality group utilempty cf set
seek SimpleName MethodInvocation BooleanLiteral false
range SimpleName MethodInvocation QualifiedName locality group utilempty cf set
range SimpleName MethodInvocation BooleanLiteral false
locality group utilempty cf set QualifiedName MethodInvocation BooleanLiteral false
locality group util SimpleName MethodInvocation SimpleName families
locality group util SimpleName MethodInvocation SimpleName columns
families SimpleName MethodInvocation SimpleName columns
iter SimpleName MethodInvocation SimpleName seek
iter SimpleName MethodInvocation SimpleName range
iter SimpleName MethodInvocation MethodInvocation SimpleName locality group util
iter SimpleName MethodInvocation MethodInvocation SimpleName families
iter SimpleName MethodInvocation MethodInvocation SimpleName columns
iter SimpleName MethodInvocation BooleanLiteral true
seek SimpleName MethodInvocation SimpleName range
seek SimpleName MethodInvocation MethodInvocation SimpleName locality group util
seek SimpleName MethodInvocation MethodInvocation SimpleName families
seek SimpleName MethodInvocation MethodInvocation SimpleName columns
seek SimpleName MethodInvocation BooleanLiteral true
range SimpleName MethodInvocation MethodInvocation SimpleName locality group util
range SimpleName MethodInvocation MethodInvocation SimpleName families
range SimpleName MethodInvocation MethodInvocation SimpleName columns
range SimpleName MethodInvocation BooleanLiteral true
locality group util SimpleName MethodInvocation MethodInvocation BooleanLiteral true
families SimpleName MethodInvocation MethodInvocation BooleanLiteral true
columns SimpleName MethodInvocation MethodInvocation BooleanLiteral true
key SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName continue key
skip continue key SimpleName VariableDeclarationFragment BooleanLiteral false
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName skip continue key
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment BooleanLiteral false
end of tablet reached SimpleName VariableDeclarationFragment BooleanLiteral false
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName end of tablet reached
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment BooleanLiteral false
iter SimpleName MethodInvocation SimpleName has top
iter SimpleName MethodInvocation SimpleName get top value
value SimpleName SimpleType CastExpression MethodInvocation SimpleName iter
value SimpleName SimpleType CastExpression MethodInvocation SimpleName get top value
value SimpleName Assignment CastExpression SimpleType SimpleName value
value SimpleName Assignment CastExpression MethodInvocation SimpleName iter
value SimpleName Assignment CastExpression MethodInvocation SimpleName get top value
iter SimpleName MethodInvocation SimpleName get top key
key SimpleName Assignment MethodInvocation SimpleName iter
key SimpleName Assignment MethodInvocation SimpleName get top key
kv entry SimpleName SimpleType ClassInstanceCreation SimpleName key
kv entry SimpleName SimpleType ClassInstanceCreation SimpleName value
key SimpleName ClassInstanceCreation SimpleName value
kv entry SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName kv entry
kv entry SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName key
kv entry SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName value
kv entry SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName kv entry
results SimpleName MethodInvocation SimpleName add
results SimpleName MethodInvocation SimpleName kv entry
add SimpleName MethodInvocation SimpleName kv entry
kv entry SimpleName MethodInvocation SimpleName estimate memory used
result size SimpleName Assignment MethodInvocation SimpleName kv entry
result size SimpleName Assignment MethodInvocation SimpleName estimate memory used
kv entry SimpleName MethodInvocation SimpleName num bytes
result bytes SimpleName Assignment MethodInvocation SimpleName kv entry
result bytes SimpleName Assignment MethodInvocation SimpleName num bytes
result size SimpleName InfixExpression SimpleName max results size
results SimpleName MethodInvocation SimpleName size
results SimpleName MethodInvocation InfixExpression SimpleName num
size SimpleName MethodInvocation InfixExpression SimpleName num
result size SimpleName InfixExpression InfixExpression InfixExpression SimpleName num
max results size SimpleName InfixExpression InfixExpression InfixExpression SimpleName num
key SimpleName SimpleType ClassInstanceCreation SimpleName key
continue key SimpleName Assignment ClassInstanceCreation SimpleType SimpleName key
continue key SimpleName Assignment ClassInstanceCreation SimpleName key
skip continue key SimpleName Assignment BooleanLiteral true
iter SimpleName MethodInvocation SimpleName next
iter SimpleName MethodInvocation SimpleName has top
iter SimpleName MethodInvocation InfixExpression BooleanLiteral false
has top SimpleName MethodInvocation InfixExpression BooleanLiteral false
end of tablet reached SimpleName Assignment BooleanLiteral true
ret batch SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName batch
batch SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName ret batch
ret batchnum bytes QualifiedName Assignment SimpleName result bytes
ret batchcontinue key QualifiedName Assignment SimpleName continue key
ret batchskip continue key QualifiedName Assignment SimpleName skip continue key
results SimpleName MethodInvocation SimpleName size
results SimpleName MethodInvocation InfixExpression NumberLiteral empty
size SimpleName MethodInvocation InfixExpression NumberLiteral empty
end of tablet reached SimpleName InfixExpression InfixExpression MethodInvocation SimpleName results
end of tablet reached SimpleName InfixExpression InfixExpression MethodInvocation SimpleName size
end of tablet reached SimpleName InfixExpression InfixExpression NumberLiteral empty
ret batchresults QualifiedName Assignment SimpleName results
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType long
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType long
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType boolean
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType long
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType boolean
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType boolean
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType boolean
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType boolean
boolean PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType boolean
private Modifier MethodDeclaration SimpleType SimpleName batch
private Modifier MethodDeclaration SimpleName next batch
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName iter
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName range
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName range
private Modifier MethodDeclaration SingleVariableDeclaration PrimitiveType int
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName num
batch SimpleName SimpleType MethodDeclaration SimpleName next batch
batch SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName iter
batch SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName range
batch SimpleName SimpleType MethodDeclaration SingleVariableDeclaration PrimitiveType int
batch SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName num
batch SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName columns
next batch SimpleName MethodDeclaration SingleVariableDeclaration SimpleName iter
next batch SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName range
next batch SimpleName MethodDeclaration SingleVariableDeclaration SimpleName range
next batch SimpleName MethodDeclaration SingleVariableDeclaration PrimitiveType int
next batch SimpleName MethodDeclaration SingleVariableDeclaration SimpleName num
next batch SimpleName MethodDeclaration SingleVariableDeclaration SimpleName columns
next batch SimpleName MethodDeclaration SimpleType SimpleName io exception
iter SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName range
iter SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
iter SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName num
iter SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName columns
iter SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
range SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
range SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName num
range SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName columns
range SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
int PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName columns
num SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName columns
int PrimitiveType SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
num SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
columns SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName batch
public Modifier TypeDeclaration MethodDeclaration SimpleName next batch
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName iter
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName range
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName num
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName columns
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName batch
test SimpleName TypeDeclaration MethodDeclaration SimpleName next batch
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName iter
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName range
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName num
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName columns
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
