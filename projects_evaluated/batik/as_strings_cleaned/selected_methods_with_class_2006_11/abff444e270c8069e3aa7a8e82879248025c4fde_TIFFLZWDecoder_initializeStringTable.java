byte PrimitiveType ArrayType ArrayCreation NumberLiteral empty
string table SimpleName Assignment ArrayCreation ArrayType PrimitiveType byte
string table SimpleName Assignment ArrayCreation NumberLiteral empty
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression NumberLiteral empty
string table SimpleName ArrayAccess SimpleName i
byte PrimitiveType ArrayType ArrayCreation NumberLiteral empty
string table SimpleName ArrayAccess Assignment ArrayCreation NumberLiteral empty
i SimpleName ArrayAccess Assignment ArrayCreation NumberLiteral empty
string table SimpleName ArrayAccess SimpleName i
string table SimpleName ArrayAccess ArrayAccess NumberLiteral empty
i SimpleName ArrayAccess ArrayAccess NumberLiteral empty
byte PrimitiveType CastExpression SimpleName i
empty NumberLiteral ArrayAccess Assignment CastExpression PrimitiveType byte
empty NumberLiteral ArrayAccess Assignment CastExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression NumberLiteral empty
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
empty NumberLiteral InfixExpression ForStatement PostfixExpression SimpleName i
table index SimpleName Assignment NumberLiteral empty
bits to get SimpleName Assignment NumberLiteral empty
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName initialize string table
void PrimitiveType MethodDeclaration SimpleName initialize string table
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName initialize string table
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName initialize string table
