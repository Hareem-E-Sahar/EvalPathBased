start SimpleName Assignment SimpleName position
reader SimpleName MethodInvocation SimpleName get line
reader SimpleName MethodInvocation SimpleName get column
parse exception SimpleName SimpleType ClassInstanceCreation StringLiteral eof
parse exception SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName reader
parse exception SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get line
parse exception SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName reader
parse exception SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get column
eof StringLiteral ClassInstanceCreation MethodInvocation SimpleName reader
eof StringLiteral ClassInstanceCreation MethodInvocation SimpleName get line
eof StringLiteral ClassInstanceCreation MethodInvocation SimpleName reader
eof StringLiteral ClassInstanceCreation MethodInvocation SimpleName get column
reader SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName reader
reader SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get column
get line SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName reader
get line SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get column
next char SimpleName MethodInvocation SwitchStatement SwitchCase CharacterLiteral empty
next char SimpleName MethodInvocation SwitchStatement BreakStatement SimpleName loop
empty CharacterLiteral SwitchCase SwitchStatement BreakStatement SimpleName loop
loop SimpleName LabeledStatement Block ReturnStatement SimpleName string
protected Modifier MethodDeclaration PrimitiveType int
protected Modifier MethodDeclaration SimpleName string
protected Modifier MethodDeclaration SimpleType SimpleName io exception
protected Modifier MethodDeclaration Block LabeledStatement SimpleName loop
protected Modifier MethodDeclaration Block ReturnStatement SimpleName string
int PrimitiveType MethodDeclaration SimpleName string
int PrimitiveType MethodDeclaration SimpleType SimpleName io exception
int PrimitiveType MethodDeclaration Block LabeledStatement SimpleName loop
int PrimitiveType MethodDeclaration Block ReturnStatement SimpleName string
string SimpleName MethodDeclaration SimpleType SimpleName io exception
string SimpleName MethodDeclaration Block LabeledStatement SimpleName loop
string SimpleName MethodDeclaration Block ReturnStatement SimpleName string
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier protected
public Modifier TypeDeclaration MethodDeclaration PrimitiveType int
public Modifier TypeDeclaration MethodDeclaration SimpleName string
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
test SimpleName TypeDeclaration MethodDeclaration Modifier protected
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType int
test SimpleName TypeDeclaration MethodDeclaration SimpleName string
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
