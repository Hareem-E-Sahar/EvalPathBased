gremlin clause SimpleName SimpleType SingleVariableDeclaration SimpleName clause
query clauses SimpleName MethodInvocation SimpleName has clause
query clauses SimpleName MethodInvocation SimpleName clause
has clause SimpleName MethodInvocation SimpleName clause
index SimpleName VariableDeclarationFragment MethodInvocation SimpleName query clauses
index SimpleName VariableDeclarationFragment MethodInvocation SimpleName has clause
index SimpleName VariableDeclarationFragment MethodInvocation SimpleName clause
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName index
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName query clauses
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName has clause
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName clause
empty NumberLiteral PrefixExpression InfixExpression SimpleName index
query clauses SimpleName MethodInvocation SimpleName remove
query clauses SimpleName MethodInvocation SimpleName index
remove SimpleName MethodInvocation SimpleName index
gcv SimpleName VariableDeclarationFragment MethodInvocation SimpleName query clauses
gcv SimpleName VariableDeclarationFragment MethodInvocation SimpleName remove
gcv SimpleName VariableDeclarationFragment MethodInvocation SimpleName index
gremlin clause value SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName gcv
query clauses SimpleName MethodInvocation SimpleName add
query clauses SimpleName MethodInvocation SimpleName gcv
add SimpleName MethodInvocation SimpleName gcv
private Modifier MethodDeclaration PrimitiveType void
private Modifier MethodDeclaration SimpleName move to last
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName gremlin clause
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName clause
private Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
void PrimitiveType MethodDeclaration SimpleName move to last
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName gremlin clause
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName clause
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
move to last SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName gremlin clause
move to last SimpleName MethodDeclaration SingleVariableDeclaration SimpleName clause
move to last SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName move to last
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName clause
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName move to last
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName clause
