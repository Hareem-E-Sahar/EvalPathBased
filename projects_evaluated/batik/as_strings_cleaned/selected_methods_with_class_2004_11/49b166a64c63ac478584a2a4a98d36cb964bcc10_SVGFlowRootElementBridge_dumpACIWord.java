attributed string SimpleName SimpleType SingleVariableDeclaration SimpleName as
chars SimpleName VariableDeclarationFragment StringLiteral empty
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName chars
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment StringLiteral empty
brk str SimpleName VariableDeclarationFragment StringLiteral empty
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName brk str
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment StringLiteral empty
as SimpleName MethodInvocation SimpleName get iterator
aci SimpleName VariableDeclarationFragment MethodInvocation SimpleName as
aci SimpleName VariableDeclarationFragment MethodInvocation SimpleName get iterator
attributed character iterator SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName aci
word limit SimpleName VariableDeclarationFragment QualifiedName text line breaksword limit
attributed character iteratorattribute QualifiedName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName word limit
attributed character iteratorattribute QualifiedName SimpleType VariableDeclarationStatement VariableDeclarationFragment QualifiedName text line breaksword limit
aci SimpleName MethodInvocation SimpleName current
ch SimpleName VariableDeclarationFragment MethodInvocation SimpleName aci
ch SimpleName VariableDeclarationFragment MethodInvocation SimpleName current
char PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName ch
char PrimitiveType VariableDeclarationExpression VariableDeclarationFragment MethodInvocation SimpleName aci
char PrimitiveType VariableDeclarationExpression VariableDeclarationFragment MethodInvocation SimpleName current
ch SimpleName InfixExpression QualifiedName attributed character iteratordone
aci SimpleName MethodInvocation SimpleName next
ch SimpleName Assignment MethodInvocation SimpleName aci
ch SimpleName Assignment MethodInvocation SimpleName next
ch SimpleName InfixExpression StringLiteral empty
chars SimpleName Assignment InfixExpression SimpleName ch
chars SimpleName Assignment InfixExpression StringLiteral empty
aci SimpleName MethodInvocation SimpleName get attribute
aci SimpleName MethodInvocation SimpleName word limit
get attribute SimpleName MethodInvocation SimpleName word limit
integer SimpleName SimpleType CastExpression MethodInvocation SimpleName aci
integer SimpleName SimpleType CastExpression MethodInvocation SimpleName get attribute
integer SimpleName SimpleType CastExpression MethodInvocation SimpleName word limit
w SimpleName VariableDeclarationFragment MethodInvocation SimpleName int value
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName w
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName int value
w SimpleName InfixExpression NumberLiteral empty
empty StringLiteral InfixExpression SimpleName w
empty StringLiteral InfixExpression StringLiteral empty
w SimpleName InfixExpression StringLiteral empty
brk str SimpleName Assignment InfixExpression StringLiteral empty
brk str SimpleName Assignment InfixExpression SimpleName w
brk str SimpleName Assignment InfixExpression StringLiteral empty
empty StringLiteral InfixExpression SimpleName w
empty StringLiteral InfixExpression StringLiteral empty
w SimpleName InfixExpression StringLiteral empty
brk str SimpleName Assignment InfixExpression StringLiteral empty
brk str SimpleName Assignment InfixExpression SimpleName w
brk str SimpleName Assignment InfixExpression StringLiteral empty
char PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName ch
char PrimitiveType VariableDeclarationExpression ForStatement InfixExpression QualifiedName attributed character iteratordone
char PrimitiveType VariableDeclarationExpression ForStatement Assignment SimpleName ch
ch SimpleName InfixExpression ForStatement Assignment SimpleName ch
attributed character iteratordone QualifiedName InfixExpression ForStatement Assignment SimpleName ch
systemout QualifiedName MethodInvocation SimpleName println
systemout QualifiedName MethodInvocation SimpleName chars
println SimpleName MethodInvocation SimpleName chars
systemout QualifiedName MethodInvocation SimpleName println
systemout QualifiedName MethodInvocation SimpleName brk str
println SimpleName MethodInvocation SimpleName brk str
protected Modifier MethodDeclaration PrimitiveType void
protected Modifier MethodDeclaration SimpleName dump aci word
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName attributed string
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleName as
void PrimitiveType MethodDeclaration SimpleName dump aci word
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName attributed string
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName as
dump aci word SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName attributed string
dump aci word SimpleName MethodDeclaration SingleVariableDeclaration SimpleName as
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier protected
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName dump aci word
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName as
test SimpleName TypeDeclaration MethodDeclaration Modifier protected
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName dump aci word
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName as
