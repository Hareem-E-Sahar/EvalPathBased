collection SimpleName SimpleType ParameterizedType SimpleType SimpleName object
array list SimpleName SimpleType ParameterizedType SimpleType SimpleName object
element type SimpleName MethodInvocation SimpleName create default value
ret SimpleName MethodInvocation SimpleName add
ret SimpleName MethodInvocation MethodInvocation SimpleName element type
ret SimpleName MethodInvocation MethodInvocation SimpleName create default value
add SimpleName MethodInvocation MethodInvocation SimpleName element type
add SimpleName MethodInvocation MethodInvocation SimpleName create default value
min count SimpleName InfixExpression SimpleName count not set
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression SimpleName min count
element type SimpleName MethodInvocation SimpleName create default value
ret SimpleName MethodInvocation SimpleName add
ret SimpleName MethodInvocation MethodInvocation SimpleName element type
ret SimpleName MethodInvocation MethodInvocation SimpleName create default value
add SimpleName MethodInvocation MethodInvocation SimpleName element type
add SimpleName MethodInvocation MethodInvocation SimpleName create default value
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName min count
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
min count SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
override SimpleName MarkerAnnotation MethodDeclaration Modifier public
override SimpleName MarkerAnnotation MethodDeclaration SimpleName create default value
public Modifier MethodDeclaration ParameterizedType SimpleType SimpleName collection
public Modifier MethodDeclaration SimpleName create default value
public Modifier MethodDeclaration Block ReturnStatement SimpleName ret
collection SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName create default value
create default value SimpleName MethodDeclaration Block ReturnStatement SimpleName ret
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName override
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration SimpleName create default value
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName override
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration SimpleName create default value
