suppress warnings SimpleName SingleMemberAnnotation StringLiteral unchecked
end SimpleName Assignment NumberLiteral empty
index SimpleName Assignment NumberLiteral empty
source SimpleName MethodInvocation SimpleName has next
source SimpleName MethodInvocation SimpleName do next pre check
amount read SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName amount read
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment NumberLiteral empty
next entrieslength QualifiedName InfixExpression SimpleName max read ahead entries
next entrieslength QualifiedName InfixExpression NumberLiteral empty
math SimpleName MethodInvocation SimpleName min
math SimpleName MethodInvocation InfixExpression QualifiedName next entrieslength
math SimpleName MethodInvocation InfixExpression NumberLiteral empty
math SimpleName MethodInvocation SimpleName max read ahead entries
min SimpleName MethodInvocation InfixExpression QualifiedName next entrieslength
min SimpleName MethodInvocation InfixExpression NumberLiteral empty
min SimpleName MethodInvocation SimpleName max read ahead entries
next entrieslength QualifiedName InfixExpression MethodInvocation SimpleName max read ahead entries
empty NumberLiteral InfixExpression MethodInvocation SimpleName max read ahead entries
next entries SimpleName Assignment ArrayCreation MethodInvocation SimpleName math
next entries SimpleName Assignment ArrayCreation MethodInvocation SimpleName min
next entries SimpleName Assignment ArrayCreation MethodInvocation SimpleName max read ahead entries
source SimpleName MethodInvocation SimpleName has next
end SimpleName InfixExpression QualifiedName next entrieslength
source SimpleName MethodInvocation InfixExpression InfixExpression SimpleName end
source SimpleName MethodInvocation InfixExpression InfixExpression QualifiedName next entrieslength
has next SimpleName MethodInvocation InfixExpression InfixExpression SimpleName end
has next SimpleName MethodInvocation InfixExpression InfixExpression QualifiedName next entrieslength
entry SimpleName SimpleType ParameterizedType SimpleType SimpleName key
entry SimpleName SimpleType ParameterizedType SimpleType SimpleName value
key SimpleName SimpleType ParameterizedType SimpleType SimpleName value
source SimpleName MethodInvocation SimpleName next
ne SimpleName VariableDeclarationFragment MethodInvocation SimpleName source
ne SimpleName VariableDeclarationFragment MethodInvocation SimpleName next
next entries SimpleName ArrayAccess PostfixExpression SimpleName end
next entries SimpleName ArrayAccess Assignment SimpleName ne
end SimpleName PostfixExpression ArrayAccess Assignment SimpleName ne
ne SimpleName MethodInvocation SimpleName get key
ne SimpleName MethodInvocation MethodInvocation SimpleName get size
get key SimpleName MethodInvocation MethodInvocation SimpleName get size
ne SimpleName MethodInvocation SimpleName get value
ne SimpleName MethodInvocation MethodInvocation SimpleName get size
get value SimpleName MethodInvocation MethodInvocation SimpleName get size
get size SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get size
amount read SimpleName Assignment InfixExpression MethodInvocation SimpleName get size
amount read SimpleName Assignment InfixExpression MethodInvocation SimpleName get size
amount read SimpleName InfixExpression SimpleName read ahead bytes
suppress warnings SimpleName SingleMemberAnnotation MethodDeclaration Modifier private
unchecked StringLiteral SingleMemberAnnotation MethodDeclaration Modifier private
suppress warnings SimpleName SingleMemberAnnotation MethodDeclaration PrimitiveType void
unchecked StringLiteral SingleMemberAnnotation MethodDeclaration PrimitiveType void
suppress warnings SimpleName SingleMemberAnnotation MethodDeclaration SimpleName fill
unchecked StringLiteral SingleMemberAnnotation MethodDeclaration SimpleName fill
private Modifier MethodDeclaration PrimitiveType void
private Modifier MethodDeclaration SimpleName fill
private Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
void PrimitiveType MethodDeclaration SimpleName fill
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
fill SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration SingleMemberAnnotation SimpleName suppress warnings
public Modifier TypeDeclaration MethodDeclaration SingleMemberAnnotation StringLiteral unchecked
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName fill
test SimpleName TypeDeclaration MethodDeclaration SingleMemberAnnotation SimpleName suppress warnings
test SimpleName TypeDeclaration MethodDeclaration SingleMemberAnnotation StringLiteral unchecked
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName fill
