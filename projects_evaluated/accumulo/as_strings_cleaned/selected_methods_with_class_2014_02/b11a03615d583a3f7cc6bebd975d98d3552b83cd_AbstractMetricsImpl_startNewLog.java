log writer SimpleName MethodInvocation SimpleName flush
log writer SimpleName MethodInvocation SimpleName close
formatter SimpleName MethodInvocation SimpleName format
formatter SimpleName MethodInvocation SimpleName today
format SimpleName MethodInvocation SimpleName today
metrics prefix SimpleName InfixExpression StringLiteral -
metrics prefix SimpleName InfixExpression MethodInvocation SimpleName formatter
metrics prefix SimpleName InfixExpression MethodInvocation SimpleName format
metrics prefix SimpleName InfixExpression MethodInvocation SimpleName today
metrics prefix SimpleName InfixExpression StringLiteral log
- StringLiteral InfixExpression MethodInvocation SimpleName formatter
- StringLiteral InfixExpression MethodInvocation SimpleName format
- StringLiteral InfixExpression MethodInvocation SimpleName today
- StringLiteral InfixExpression StringLiteral log
formatter SimpleName MethodInvocation InfixExpression StringLiteral log
format SimpleName MethodInvocation InfixExpression StringLiteral log
today SimpleName MethodInvocation InfixExpression StringLiteral log
file SimpleName SimpleType ClassInstanceCreation SimpleName log dir
file SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName metrics prefix
file SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral -
file SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral log
log dir SimpleName ClassInstanceCreation InfixExpression SimpleName metrics prefix
log dir SimpleName ClassInstanceCreation InfixExpression StringLiteral -
log dir SimpleName ClassInstanceCreation InfixExpression MethodInvocation SimpleName formatter
log dir SimpleName ClassInstanceCreation InfixExpression MethodInvocation SimpleName format
log dir SimpleName ClassInstanceCreation InfixExpression MethodInvocation SimpleName today
log dir SimpleName ClassInstanceCreation InfixExpression StringLiteral log
log file SimpleName Assignment ClassInstanceCreation SimpleType SimpleName file
log file SimpleName Assignment ClassInstanceCreation SimpleName log dir
log file SimpleName Assignment ClassInstanceCreation InfixExpression SimpleName metrics prefix
log file SimpleName Assignment ClassInstanceCreation InfixExpression StringLiteral -
log file SimpleName Assignment ClassInstanceCreation InfixExpression StringLiteral log
log file SimpleName MethodInvocation SimpleName exists
log file SimpleName MethodInvocation SimpleName create new file
log SimpleName MethodInvocation SimpleName error
log SimpleName MethodInvocation StringLiteral unable to create new log file
error SimpleName MethodInvocation StringLiteral unable to create new log file
currently logging SimpleName Assignment BooleanLiteral false
file output stream SimpleName SimpleType ClassInstanceCreation SimpleName log file
file output stream SimpleName SimpleType ClassInstanceCreation BooleanLiteral true
log file SimpleName ClassInstanceCreation BooleanLiteral true
output stream writer SimpleName SimpleType ClassInstanceCreation ClassInstanceCreation SimpleName log file
output stream writer SimpleName SimpleType ClassInstanceCreation ClassInstanceCreation BooleanLiteral true
output stream writer SimpleName SimpleType ClassInstanceCreation QualifiedName constantsutf
file output stream SimpleName SimpleType ClassInstanceCreation ClassInstanceCreation QualifiedName constantsutf
log file SimpleName ClassInstanceCreation ClassInstanceCreation QualifiedName constantsutf
true BooleanLiteral ClassInstanceCreation ClassInstanceCreation QualifiedName constantsutf
log writer SimpleName Assignment ClassInstanceCreation SimpleType SimpleName output stream writer
log writer SimpleName Assignment ClassInstanceCreation ClassInstanceCreation SimpleName log file
log writer SimpleName Assignment ClassInstanceCreation ClassInstanceCreation BooleanLiteral true
log writer SimpleName Assignment ClassInstanceCreation QualifiedName constantsutf
private Modifier MethodDeclaration PrimitiveType void
private Modifier MethodDeclaration SimpleName start new log
private Modifier MethodDeclaration SimpleType SimpleName io exception
void PrimitiveType MethodDeclaration SimpleName start new log
void PrimitiveType MethodDeclaration SimpleType SimpleName io exception
start new log SimpleName MethodDeclaration SimpleType SimpleName io exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName start new log
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName start new log
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
