iter SimpleName MethodInvocation SimpleName has next
iter SimpleName MethodInvocation SimpleName next
entry SimpleName Assignment MethodInvocation SimpleName iter
entry SimpleName Assignment MethodInvocation SimpleName next
column families SimpleName MethodInvocation SimpleName size
column families SimpleName MethodInvocation InfixExpression NumberLiteral empty
size SimpleName MethodInvocation InfixExpression NumberLiteral empty
entry SimpleName MethodInvocation SimpleName get key
entry SimpleName MethodInvocation MethodInvocation SimpleName get column family data
get key SimpleName MethodInvocation MethodInvocation SimpleName get column family data
column families SimpleName MethodInvocation SimpleName contains
column families SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName entry
column families SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get key
column families SimpleName MethodInvocation MethodInvocation SimpleName get column family data
contains SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName entry
contains SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get key
contains SimpleName MethodInvocation MethodInvocation SimpleName get column family data
entry SimpleName MethodInvocation SimpleName get key
key SimpleName SimpleType CastExpression MethodInvocation SimpleName entry
key SimpleName SimpleType CastExpression MethodInvocation SimpleName get key
range SimpleName MethodInvocation SimpleName after end key
range SimpleName MethodInvocation CastExpression SimpleType SimpleName key
range SimpleName MethodInvocation CastExpression MethodInvocation SimpleName entry
range SimpleName MethodInvocation CastExpression MethodInvocation SimpleName get key
after end key SimpleName MethodInvocation CastExpression SimpleType SimpleName key
after end key SimpleName MethodInvocation CastExpression MethodInvocation SimpleName entry
after end key SimpleName MethodInvocation CastExpression MethodInvocation SimpleName get key
override SimpleName MarkerAnnotation MethodDeclaration Modifier public
override SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
override SimpleName MarkerAnnotation MethodDeclaration SimpleName next
override SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName io exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName next
public Modifier MethodDeclaration SimpleType SimpleName io exception
void PrimitiveType MethodDeclaration SimpleName next
void PrimitiveType MethodDeclaration SimpleType SimpleName io exception
next SimpleName MethodDeclaration SimpleType SimpleName io exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName override
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName next
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName override
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName next
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName io exception