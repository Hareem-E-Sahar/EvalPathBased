pol SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName polygon d
polygon d SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName pol
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression SimpleName npoints
xpoints SimpleName ArrayAccess SimpleName i
ypoints SimpleName ArrayAccess SimpleName i
pol SimpleName MethodInvocation SimpleName add point
pol SimpleName MethodInvocation ArrayAccess SimpleName xpoints
pol SimpleName MethodInvocation ArrayAccess SimpleName i
pol SimpleName MethodInvocation ArrayAccess SimpleName ypoints
pol SimpleName MethodInvocation ArrayAccess SimpleName i
add point SimpleName MethodInvocation ArrayAccess SimpleName xpoints
add point SimpleName MethodInvocation ArrayAccess SimpleName i
add point SimpleName MethodInvocation ArrayAccess SimpleName ypoints
add point SimpleName MethodInvocation ArrayAccess SimpleName i
xpoints SimpleName ArrayAccess MethodInvocation ArrayAccess SimpleName ypoints
xpoints SimpleName ArrayAccess MethodInvocation ArrayAccess SimpleName i
i SimpleName ArrayAccess MethodInvocation ArrayAccess SimpleName ypoints
i SimpleName ArrayAccess MethodInvocation ArrayAccess SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName npoints
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
npoints SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
public Modifier MethodDeclaration SimpleType SimpleName object
public Modifier MethodDeclaration SimpleName clone
public Modifier MethodDeclaration Block ReturnStatement SimpleName pol
object SimpleName SimpleType MethodDeclaration SimpleName clone
clone SimpleName MethodDeclaration Block ReturnStatement SimpleName pol
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName object
public Modifier TypeDeclaration MethodDeclaration SimpleName clone
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName object
test SimpleName TypeDeclaration MethodDeclaration SimpleName clone