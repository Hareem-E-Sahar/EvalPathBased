string SimpleName SimpleType SingleVariableDeclaration SimpleName destination
string SimpleName SimpleType SingleVariableDeclaration SimpleName name
string SimpleName SimpleType SingleVariableDeclaration SimpleName instruction
string SimpleName SimpleType ArrayType SingleVariableDeclaration SimpleName prompt
boolean PrimitiveType ArrayType SingleVariableDeclaration SimpleName echo
string SimpleName SimpleType ArrayType ArrayCreation QualifiedName promptlength
answers SimpleName VariableDeclarationFragment ArrayCreation QualifiedName promptlength
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression QualifiedName promptlength
input stream reader SimpleName SimpleType ClassInstanceCreation QualifiedName systemin
buffered reader SimpleName SimpleType ClassInstanceCreation ClassInstanceCreation QualifiedName systemin
r SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName buffered reader
r SimpleName VariableDeclarationFragment ClassInstanceCreation ClassInstanceCreation QualifiedName systemin
buffered reader SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName r
prompt SimpleName ArrayAccess SimpleName i
prompt SimpleName ArrayAccess InfixExpression StringLiteral empty
i SimpleName ArrayAccess InfixExpression StringLiteral empty
systemout QualifiedName MethodInvocation SimpleName print
systemout QualifiedName MethodInvocation InfixExpression ArrayAccess SimpleName prompt
systemout QualifiedName MethodInvocation InfixExpression ArrayAccess SimpleName i
systemout QualifiedName MethodInvocation InfixExpression StringLiteral empty
print SimpleName MethodInvocation InfixExpression ArrayAccess SimpleName prompt
print SimpleName MethodInvocation InfixExpression ArrayAccess SimpleName i
print SimpleName MethodInvocation InfixExpression StringLiteral empty
answers SimpleName ArrayAccess SimpleName i
r SimpleName MethodInvocation SimpleName read line
answers SimpleName ArrayAccess Assignment MethodInvocation SimpleName r
answers SimpleName ArrayAccess Assignment MethodInvocation SimpleName read line
i SimpleName ArrayAccess Assignment MethodInvocation SimpleName r
i SimpleName ArrayAccess Assignment MethodInvocation SimpleName read line
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression QualifiedName promptlength
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
promptlength QualifiedName InfixExpression ForStatement PostfixExpression SimpleName i
io exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
override SimpleName MarkerAnnotation MethodDeclaration Modifier public
override SimpleName MarkerAnnotation MethodDeclaration SimpleName interactive
override SimpleName MarkerAnnotation MethodDeclaration SingleVariableDeclaration SimpleName destination
override SimpleName MarkerAnnotation MethodDeclaration SingleVariableDeclaration SimpleName name
public Modifier MethodDeclaration ArrayType SimpleType SimpleName string
public Modifier MethodDeclaration SimpleName interactive
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName destination
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName name
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName instruction
string SimpleName SimpleType ArrayType MethodDeclaration SimpleName interactive
interactive SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
interactive SimpleName MethodDeclaration SingleVariableDeclaration SimpleName destination
interactive SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
interactive SimpleName MethodDeclaration SingleVariableDeclaration SimpleName name
interactive SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
interactive SimpleName MethodDeclaration SingleVariableDeclaration SimpleName instruction
interactive SimpleName MethodDeclaration SingleVariableDeclaration SimpleName prompt
interactive SimpleName MethodDeclaration SingleVariableDeclaration ArrayType PrimitiveType boolean
interactive SimpleName MethodDeclaration SingleVariableDeclaration SimpleName echo
destination SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName name
destination SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName instruction
destination SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName prompt
destination SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName echo
name SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName instruction
name SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName prompt
name SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName echo
instruction SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName prompt
instruction SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName echo
prompt SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName echo
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName override
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration SimpleName interactive
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName destination
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName name
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName instruction
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName prompt
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName echo
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName override
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration SimpleName interactive
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName destination
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName name
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName instruction
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName prompt
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName echo