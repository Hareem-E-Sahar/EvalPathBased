object SimpleName SimpleType ArrayType ArrayCreation SimpleName count
values SimpleName VariableDeclarationFragment ArrayCreation SimpleName count
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment NumberLiteral empty
index SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName index
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
index SimpleName InfixExpression QualifiedName tablelength
table SimpleName ArrayAccess SimpleName index
e SimpleName VariableDeclarationFragment ArrayAccess SimpleName table
e SimpleName VariableDeclarationFragment ArrayAccess SimpleName index
entry SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName e
e SimpleName Assignment QualifiedName enext
values SimpleName ArrayAccess PostfixExpression SimpleName i
values SimpleName ArrayAccess Assignment QualifiedName evalue
i SimpleName PostfixExpression ArrayAccess Assignment QualifiedName evalue
e SimpleName InfixExpression ForStatement Assignment SimpleName e
e SimpleName InfixExpression ForStatement Assignment QualifiedName enext
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName index
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression QualifiedName tablelength
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName index
index SimpleName InfixExpression ForStatement PostfixExpression SimpleName index
tablelength QualifiedName InfixExpression ForStatement PostfixExpression SimpleName index
int PrimitiveType VariableDeclarationStatement Block ReturnStatement SimpleName values
public Modifier MethodDeclaration ArrayType SimpleType SimpleName object
public Modifier MethodDeclaration SimpleName get values array
public Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
public Modifier MethodDeclaration Block ReturnStatement SimpleName values
object SimpleName SimpleType ArrayType MethodDeclaration SimpleName get values array
get values array SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
get values array SimpleName MethodDeclaration Block ReturnStatement SimpleName values
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration SimpleName get values array
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration SimpleName get values array
