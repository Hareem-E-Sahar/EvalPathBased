log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral check for timeouts session closing
debug SimpleName MethodInvocation StringLiteral check for timeouts session closing
system SimpleName MethodInvocation SimpleName current time millis
now SimpleName VariableDeclarationFragment MethodInvocation SimpleName system
now SimpleName VariableDeclarationFragment MethodInvocation SimpleName current time millis
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName now
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName system
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName current time millis
pair SimpleName SimpleType ParameterizedType SimpleType SimpleName timeout status
pair SimpleName SimpleType ParameterizedType SimpleType SimpleName string
timeout status SimpleName SimpleType ParameterizedType SimpleType SimpleName string
check authentication timeout SimpleName MethodInvocation SimpleName now
check authentication timeout SimpleName MethodInvocation MethodInvocation SimpleName get auth timeout
now SimpleName MethodInvocation MethodInvocation SimpleName get auth timeout
result SimpleName VariableDeclarationFragment MethodInvocation SimpleName check authentication timeout
result SimpleName VariableDeclarationFragment MethodInvocation SimpleName now
result SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get auth timeout
check idle timeout SimpleName MethodInvocation SimpleName now
check idle timeout SimpleName MethodInvocation MethodInvocation SimpleName get idle timeout
now SimpleName MethodInvocation MethodInvocation SimpleName get idle timeout
result SimpleName Assignment MethodInvocation SimpleName check idle timeout
result SimpleName Assignment MethodInvocation SimpleName now
result SimpleName Assignment MethodInvocation MethodInvocation SimpleName get idle timeout
result SimpleName MethodInvocation SimpleName get first
result SimpleName InfixExpression ParenthesizedExpression ConditionalExpression QualifiedName timeout statusno timeout
timeout statusno timeout QualifiedName ConditionalExpression MethodInvocation SimpleName result
timeout statusno timeout QualifiedName ConditionalExpression MethodInvocation SimpleName get first
status SimpleName VariableDeclarationFragment ConditionalExpression QualifiedName timeout statusno timeout
status SimpleName VariableDeclarationFragment ConditionalExpression MethodInvocation SimpleName result
status SimpleName VariableDeclarationFragment ConditionalExpression MethodInvocation SimpleName get first
timeout status SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName status
timeout statusno timeout QualifiedName MethodInvocation SimpleName equals
timeout statusno timeout QualifiedName MethodInvocation SimpleName status
equals SimpleName MethodInvocation SimpleName status
log SimpleName MethodInvocation SimpleName is debug enabled
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral check for timeouts disconnect - reason
log SimpleName MethodInvocation SimpleName status
debug SimpleName MethodInvocation StringLiteral check for timeouts disconnect - reason
debug SimpleName MethodInvocation SimpleName status
check for timeouts disconnect - reason StringLiteral MethodInvocation SimpleName status
timeout status SimpleName MethodInvocation SimpleName set
timeout status SimpleName MethodInvocation SimpleName status
set SimpleName MethodInvocation SimpleName status
result SimpleName MethodInvocation SimpleName get second
disconnect SimpleName MethodInvocation QualifiedName ssh constantsssh disconnect protocol error
disconnect SimpleName MethodInvocation MethodInvocation SimpleName result
disconnect SimpleName MethodInvocation MethodInvocation SimpleName get second
ssh constantsssh disconnect protocol error QualifiedName MethodInvocation MethodInvocation SimpleName result
ssh constantsssh disconnect protocol error QualifiedName MethodInvocation MethodInvocation SimpleName get second
protected Modifier MethodDeclaration PrimitiveType void
protected Modifier MethodDeclaration SimpleName check for timeouts
protected Modifier MethodDeclaration SimpleType SimpleName io exception
protected Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType long
void PrimitiveType MethodDeclaration SimpleName check for timeouts
void PrimitiveType MethodDeclaration SimpleType SimpleName io exception
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType long
check for timeouts SimpleName MethodDeclaration SimpleType SimpleName io exception
check for timeouts SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType long
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier protected
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName check for timeouts
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
test SimpleName TypeDeclaration MethodDeclaration Modifier protected
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName check for timeouts
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName io exception