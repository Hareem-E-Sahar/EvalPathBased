list SimpleName SimpleType ParameterizedType SimpleType SimpleName string
array list SimpleName SimpleType ParameterizedType SimpleType SimpleName string
array list SimpleName SimpleType ParameterizedType SimpleType SimpleName string
array list SimpleName SimpleType ParameterizedType ClassInstanceCreation NumberLiteral empty
string SimpleName SimpleType ParameterizedType ClassInstanceCreation NumberLiteral empty
names SimpleName VariableDeclarationFragment ClassInstanceCreation NumberLiteral empty
system SimpleName MethodInvocation SimpleName map library name
system SimpleName MethodInvocation StringLiteral accumulo
map library name SimpleName MethodInvocation StringLiteral accumulo
libname SimpleName VariableDeclarationFragment MethodInvocation SimpleName system
libname SimpleName VariableDeclarationFragment MethodInvocation SimpleName map library name
libname SimpleName VariableDeclarationFragment MethodInvocation StringLiteral accumulo
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName libname
names SimpleName MethodInvocation SimpleName add
names SimpleName MethodInvocation SimpleName libname
add SimpleName MethodInvocation SimpleName libname
libname SimpleName MethodInvocation SimpleName last index of
libname SimpleName MethodInvocation StringLiteral .
last index of SimpleName MethodInvocation StringLiteral .
dot SimpleName VariableDeclarationFragment MethodInvocation SimpleName libname
dot SimpleName VariableDeclarationFragment MethodInvocation SimpleName last index of
dot SimpleName VariableDeclarationFragment MethodInvocation StringLiteral .
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName dot
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName libname
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName last index of
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation StringLiteral .
dot SimpleName InfixExpression NumberLiteral empty
libname SimpleName MethodInvocation SimpleName substring
libname SimpleName MethodInvocation NumberLiteral empty
libname SimpleName MethodInvocation SimpleName dot
substring SimpleName MethodInvocation NumberLiteral empty
substring SimpleName MethodInvocation SimpleName dot
empty NumberLiteral MethodInvocation SimpleName dot
dot SimpleName InfixExpression ConditionalExpression SimpleName libname
empty NumberLiteral InfixExpression ConditionalExpression SimpleName libname
dot SimpleName InfixExpression ConditionalExpression MethodInvocation SimpleName libname
dot SimpleName InfixExpression ConditionalExpression MethodInvocation SimpleName substring
dot SimpleName InfixExpression ConditionalExpression MethodInvocation NumberLiteral empty
dot SimpleName InfixExpression ConditionalExpression MethodInvocation SimpleName dot
empty NumberLiteral InfixExpression ConditionalExpression MethodInvocation SimpleName libname
empty NumberLiteral InfixExpression ConditionalExpression MethodInvocation SimpleName substring
empty NumberLiteral InfixExpression ConditionalExpression MethodInvocation NumberLiteral empty
empty NumberLiteral InfixExpression ConditionalExpression MethodInvocation SimpleName dot
libname SimpleName ConditionalExpression MethodInvocation SimpleName libname
libname SimpleName ConditionalExpression MethodInvocation SimpleName substring
libname SimpleName ConditionalExpression MethodInvocation NumberLiteral empty
libname SimpleName ConditionalExpression MethodInvocation SimpleName dot
prefix SimpleName VariableDeclarationFragment ConditionalExpression InfixExpression SimpleName dot
prefix SimpleName VariableDeclarationFragment ConditionalExpression InfixExpression NumberLiteral empty
prefix SimpleName VariableDeclarationFragment ConditionalExpression SimpleName libname
prefix SimpleName VariableDeclarationFragment ConditionalExpression MethodInvocation SimpleName libname
prefix SimpleName VariableDeclarationFragment ConditionalExpression MethodInvocation SimpleName substring
prefix SimpleName VariableDeclarationFragment ConditionalExpression MethodInvocation NumberLiteral empty
prefix SimpleName VariableDeclarationFragment ConditionalExpression MethodInvocation SimpleName dot
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName prefix
system SimpleName MethodInvocation SimpleName get property
system SimpleName MethodInvocation StringLiteral osname
get property SimpleName MethodInvocation StringLiteral osname
mac os x StringLiteral MethodInvocation SimpleName equals
mac os x StringLiteral MethodInvocation MethodInvocation SimpleName system
mac os x StringLiteral MethodInvocation MethodInvocation SimpleName get property
mac os x StringLiteral MethodInvocation MethodInvocation StringLiteral osname
equals SimpleName MethodInvocation MethodInvocation SimpleName system
equals SimpleName MethodInvocation MethodInvocation SimpleName get property
equals SimpleName MethodInvocation MethodInvocation StringLiteral osname
string SimpleName SimpleType SingleVariableDeclaration SimpleName ext
dylib StringLiteral ArrayInitializer StringLiteral jnilib
libname SimpleName MethodInvocation SimpleName ends with
libname SimpleName MethodInvocation SimpleName ext
ends with SimpleName MethodInvocation SimpleName ext
prefix SimpleName InfixExpression SimpleName ext
names SimpleName MethodInvocation SimpleName add
names SimpleName MethodInvocation InfixExpression SimpleName prefix
names SimpleName MethodInvocation InfixExpression SimpleName ext
add SimpleName MethodInvocation InfixExpression SimpleName prefix
add SimpleName MethodInvocation InfixExpression SimpleName ext
int PrimitiveType VariableDeclarationStatement Block ReturnStatement SimpleName names
private Modifier MethodDeclaration Modifier static
private Modifier MethodDeclaration ParameterizedType SimpleType SimpleName list
private Modifier MethodDeclaration ParameterizedType SimpleType SimpleName string
private Modifier MethodDeclaration SimpleName get valid library names
private Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
private Modifier MethodDeclaration Block ReturnStatement SimpleName names
static Modifier MethodDeclaration ParameterizedType SimpleType SimpleName list
static Modifier MethodDeclaration ParameterizedType SimpleType SimpleName string
static Modifier MethodDeclaration SimpleName get valid library names
static Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
static Modifier MethodDeclaration Block ReturnStatement SimpleName names
list SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName get valid library names
string SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName get valid library names
get valid library names SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
get valid library names SimpleName MethodDeclaration Block ReturnStatement SimpleName names
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration Modifier static
public Modifier TypeDeclaration MethodDeclaration SimpleName get valid library names
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration Modifier static
test SimpleName TypeDeclaration MethodDeclaration SimpleName get valid library names
