buffer SimpleName SimpleType SingleVariableDeclaration SimpleName buffer
buffer SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName message
receive buffer SimpleName MethodInvocation SimpleName put buffer
receive buffer SimpleName MethodInvocation SimpleName buffer
put buffer SimpleName MethodInvocation SimpleName buffer
receive buffer SimpleName MethodInvocation SimpleName available
receive buffer SimpleName MethodInvocation InfixExpression NumberLiteral empty
available SimpleName MethodInvocation InfixExpression NumberLiteral empty
receive buffer SimpleName MethodInvocation SimpleName rpos
rpos SimpleName VariableDeclarationFragment MethodInvocation SimpleName receive buffer
rpos SimpleName VariableDeclarationFragment MethodInvocation SimpleName rpos
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName rpos
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName receive buffer
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName rpos
receive buffer SimpleName MethodInvocation SimpleName get int
len SimpleName VariableDeclarationFragment MethodInvocation SimpleName receive buffer
len SimpleName VariableDeclarationFragment MethodInvocation SimpleName get int
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName len
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName receive buffer
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get int
receive buffer SimpleName MethodInvocation SimpleName rpos
receive buffer SimpleName MethodInvocation SimpleName rpos
rpos SimpleName MethodInvocation SimpleName rpos
receive buffer SimpleName MethodInvocation SimpleName available
empty NumberLiteral InfixExpression SimpleName len
receive buffer SimpleName MethodInvocation InfixExpression InfixExpression NumberLiteral empty
receive buffer SimpleName MethodInvocation InfixExpression InfixExpression SimpleName len
available SimpleName MethodInvocation InfixExpression InfixExpression NumberLiteral empty
available SimpleName MethodInvocation InfixExpression InfixExpression SimpleName len
receive buffer SimpleName MethodInvocation SimpleName get bytes
buffer SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName receive buffer
buffer SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get bytes
message SimpleName Assignment ClassInstanceCreation SimpleType SimpleName buffer
message SimpleName Assignment ClassInstanceCreation MethodInvocation SimpleName receive buffer
message SimpleName Assignment ClassInstanceCreation MethodInvocation SimpleName get bytes
receive buffer SimpleName MethodInvocation SimpleName compact
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
messages SimpleName MethodInvocation SimpleName offer
messages SimpleName MethodInvocation SimpleName message
offer SimpleName MethodInvocation SimpleName message
messages SimpleName MethodInvocation SimpleName notify all
protected Modifier MethodDeclaration PrimitiveType void
protected Modifier MethodDeclaration SimpleName message received
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName buffer
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleName buffer
protected Modifier MethodDeclaration SimpleType SimpleName exception
protected Modifier MethodDeclaration Block SynchronizedStatement SimpleName receive buffer
void PrimitiveType MethodDeclaration SimpleName message received
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName buffer
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName buffer
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration Block SynchronizedStatement SimpleName receive buffer
message received SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName buffer
message received SimpleName MethodDeclaration SingleVariableDeclaration SimpleName buffer
message received SimpleName MethodDeclaration SimpleType SimpleName exception
message received SimpleName MethodDeclaration Block SynchronizedStatement SimpleName receive buffer
buffer SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier protected
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName message received
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName buffer
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration Modifier protected
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName message received
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName buffer
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
