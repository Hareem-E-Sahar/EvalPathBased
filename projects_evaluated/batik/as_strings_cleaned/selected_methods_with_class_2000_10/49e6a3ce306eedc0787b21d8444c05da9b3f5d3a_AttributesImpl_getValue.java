string SimpleName SimpleType SingleVariableDeclaration SimpleName q name
length SimpleName InfixExpression NumberLiteral empty
max SimpleName VariableDeclarationFragment InfixExpression SimpleName length
max SimpleName VariableDeclarationFragment InfixExpression NumberLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName max
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment InfixExpression SimpleName length
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment InfixExpression NumberLiteral empty
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression SimpleName max
i SimpleName Assignment NumberLiteral empty
i SimpleName InfixExpression NumberLiteral empty
data SimpleName ArrayAccess InfixExpression SimpleName i
data SimpleName ArrayAccess InfixExpression NumberLiteral empty
data SimpleName ArrayAccess MethodInvocation SimpleName equals
i SimpleName InfixExpression ArrayAccess MethodInvocation SimpleName equals
empty NumberLiteral InfixExpression ArrayAccess MethodInvocation SimpleName equals
data SimpleName ArrayAccess MethodInvocation SimpleName q name
i SimpleName InfixExpression ArrayAccess MethodInvocation SimpleName q name
empty NumberLiteral InfixExpression ArrayAccess MethodInvocation SimpleName q name
equals SimpleName MethodInvocation SimpleName q name
i SimpleName InfixExpression NumberLiteral empty
data SimpleName ArrayAccess InfixExpression SimpleName i
data SimpleName ArrayAccess InfixExpression NumberLiteral empty
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName max
int PrimitiveType VariableDeclarationExpression ForStatement Assignment SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement Assignment NumberLiteral empty
i SimpleName InfixExpression ForStatement Assignment SimpleName i
i SimpleName InfixExpression ForStatement Assignment NumberLiteral empty
max SimpleName InfixExpression ForStatement Assignment SimpleName i
max SimpleName InfixExpression ForStatement Assignment NumberLiteral empty
public Modifier MethodDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SimpleName get value
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName q name
public Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
string SimpleName SimpleType MethodDeclaration SimpleName get value
string SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName q name
get value SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
get value SimpleName MethodDeclaration SingleVariableDeclaration SimpleName q name
get value SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName string
public Modifier TypeDeclaration MethodDeclaration SimpleName get value
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName q name
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName string
test SimpleName TypeDeclaration MethodDeclaration SimpleName get value
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName q name
