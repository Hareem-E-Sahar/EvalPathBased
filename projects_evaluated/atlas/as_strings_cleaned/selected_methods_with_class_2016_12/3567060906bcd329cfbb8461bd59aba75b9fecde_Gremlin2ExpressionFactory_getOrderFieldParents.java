list SimpleName SimpleType ParameterizedType SimpleType SimpleName groovy expression
it expr SimpleName VariableDeclarationFragment MethodInvocation SimpleName get it variable
groovy expression SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName it expr
list SimpleName SimpleType ParameterizedType SimpleType SimpleName groovy expression
array list SimpleName SimpleType ParameterizedType ClassInstanceCreation NumberLiteral empty
result SimpleName VariableDeclarationFragment ClassInstanceCreation NumberLiteral empty
field expression SimpleName SimpleType ClassInstanceCreation SimpleName it expr
field expression SimpleName SimpleType ClassInstanceCreation StringLiteral a
it expr SimpleName ClassInstanceCreation StringLiteral a
result SimpleName MethodInvocation SimpleName add
result SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName field expression
result SimpleName MethodInvocation ClassInstanceCreation SimpleName it expr
result SimpleName MethodInvocation ClassInstanceCreation StringLiteral a
add SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName field expression
add SimpleName MethodInvocation ClassInstanceCreation SimpleName it expr
add SimpleName MethodInvocation ClassInstanceCreation StringLiteral a
field expression SimpleName SimpleType ClassInstanceCreation SimpleName it expr
field expression SimpleName SimpleType ClassInstanceCreation StringLiteral b
it expr SimpleName ClassInstanceCreation StringLiteral b
result SimpleName MethodInvocation SimpleName add
result SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName field expression
result SimpleName MethodInvocation ClassInstanceCreation SimpleName it expr
result SimpleName MethodInvocation ClassInstanceCreation StringLiteral b
add SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName field expression
add SimpleName MethodInvocation ClassInstanceCreation SimpleName it expr
add SimpleName MethodInvocation ClassInstanceCreation StringLiteral b
override SimpleName MarkerAnnotation MethodDeclaration Modifier public
override SimpleName MarkerAnnotation MethodDeclaration SimpleName get order field parents
public Modifier MethodDeclaration ParameterizedType SimpleType SimpleName list
public Modifier MethodDeclaration ParameterizedType SimpleType SimpleName groovy expression
public Modifier MethodDeclaration SimpleName get order field parents
public Modifier MethodDeclaration Block ReturnStatement SimpleName result
list SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName get order field parents
groovy expression SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName get order field parents
get order field parents SimpleName MethodDeclaration Block ReturnStatement SimpleName result
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName override
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration SimpleName get order field parents
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName override
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration SimpleName get order field parents
