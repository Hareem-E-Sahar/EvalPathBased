action event SimpleName SimpleType SingleVariableDeclaration SimpleName evt
rat SimpleName VariableDeclarationFragment MethodInvocation SimpleName get rendering transform
affine transform SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName rat
dim SimpleName VariableDeclarationFragment MethodInvocation SimpleName get size
dimension SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName dim
dimwidth QualifiedName InfixExpression NumberLiteral empty
x SimpleName VariableDeclarationFragment InfixExpression QualifiedName dimwidth
x SimpleName VariableDeclarationFragment InfixExpression NumberLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName x
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment InfixExpression QualifiedName dimwidth
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment InfixExpression NumberLiteral empty
dimheight QualifiedName InfixExpression NumberLiteral empty
y SimpleName VariableDeclarationFragment InfixExpression QualifiedName dimheight
y SimpleName VariableDeclarationFragment InfixExpression NumberLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName y
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment InfixExpression QualifiedName dimheight
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment InfixExpression NumberLiteral empty
affine transform SimpleName MethodInvocation SimpleName get translate instance
affine transform SimpleName MethodInvocation SimpleName x
affine transform SimpleName MethodInvocation SimpleName y
get translate instance SimpleName MethodInvocation SimpleName x
get translate instance SimpleName MethodInvocation SimpleName y
x SimpleName MethodInvocation SimpleName y
t SimpleName VariableDeclarationFragment MethodInvocation SimpleName affine transform
t SimpleName VariableDeclarationFragment MethodInvocation SimpleName get translate instance
t SimpleName VariableDeclarationFragment MethodInvocation SimpleName x
t SimpleName VariableDeclarationFragment MethodInvocation SimpleName y
affine transform SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName t
t SimpleName MethodInvocation SimpleName concatenate
t SimpleName MethodInvocation SimpleName at
concatenate SimpleName MethodInvocation SimpleName at
t SimpleName MethodInvocation SimpleName translate
t SimpleName MethodInvocation PrefixExpression SimpleName x
t SimpleName MethodInvocation PrefixExpression SimpleName y
translate SimpleName MethodInvocation PrefixExpression SimpleName x
translate SimpleName MethodInvocation PrefixExpression SimpleName y
x SimpleName PrefixExpression MethodInvocation PrefixExpression SimpleName y
t SimpleName MethodInvocation SimpleName concatenate
t SimpleName MethodInvocation SimpleName rat
concatenate SimpleName MethodInvocation SimpleName rat
set rendering transform SimpleName MethodInvocation SimpleName t
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName action performed
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName action event
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName evt
void PrimitiveType MethodDeclaration SimpleName action performed
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName action event
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName evt
action performed SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName action event
action performed SimpleName MethodDeclaration SingleVariableDeclaration SimpleName evt
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName action performed
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName evt
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName action performed
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName evt