entry SimpleName SimpleType SingleVariableDeclaration SimpleName e
hash SimpleName VariableDeclarationFragment QualifiedName ehash
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName hash
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment QualifiedName ehash
hash SimpleName InfixExpression QualifiedName tablelength
index SimpleName VariableDeclarationFragment InfixExpression SimpleName hash
index SimpleName VariableDeclarationFragment InfixExpression QualifiedName tablelength
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName index
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment InfixExpression SimpleName hash
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment InfixExpression QualifiedName tablelength
table SimpleName ArrayAccess SimpleName index
curr SimpleName VariableDeclarationFragment ArrayAccess SimpleName table
curr SimpleName VariableDeclarationFragment ArrayAccess SimpleName index
entry SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName curr
entry SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName prev
curr SimpleName InfixExpression SimpleName e
prev SimpleName Assignment SimpleName curr
curr SimpleName Assignment QualifiedName currnext
table SimpleName ArrayAccess SimpleName index
table SimpleName ArrayAccess Assignment QualifiedName currnext
index SimpleName ArrayAccess Assignment QualifiedName currnext
prevnext QualifiedName Assignment QualifiedName currnext
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
protected Modifier MethodDeclaration PrimitiveType void
protected Modifier MethodDeclaration SimpleName remove entry
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName entry
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleName e
void PrimitiveType MethodDeclaration SimpleName remove entry
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName entry
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName e
remove entry SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName entry
remove entry SimpleName MethodDeclaration SingleVariableDeclaration SimpleName e
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier protected
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName remove entry
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName e
test SimpleName TypeDeclaration MethodDeclaration Modifier protected
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName remove entry
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName e
