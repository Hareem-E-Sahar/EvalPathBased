k SimpleName SimpleType SingleVariableDeclaration SimpleName timer
total time SimpleName MethodInvocation SimpleName key set
timer SimpleName MethodInvocation SimpleName to string
get SimpleName MethodInvocation SimpleName timer
get SimpleName MethodInvocation InfixExpression NumberLiteral .
timer SimpleName MethodInvocation InfixExpression NumberLiteral .
systemout QualifiedName MethodInvocation SimpleName printf
systemout QualifiedName MethodInvocation StringLiteral % s : % . f secs
systemout QualifiedName MethodInvocation MethodInvocation SimpleName timer
systemout QualifiedName MethodInvocation MethodInvocation SimpleName to string
systemout QualifiedName MethodInvocation InfixExpression MethodInvocation SimpleName get
systemout QualifiedName MethodInvocation InfixExpression MethodInvocation SimpleName timer
systemout QualifiedName MethodInvocation InfixExpression NumberLiteral .
printf SimpleName MethodInvocation StringLiteral % s : % . f secs
printf SimpleName MethodInvocation MethodInvocation SimpleName timer
printf SimpleName MethodInvocation MethodInvocation SimpleName to string
printf SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get
printf SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName timer
printf SimpleName MethodInvocation InfixExpression NumberLiteral .
% s : % . f secs StringLiteral MethodInvocation MethodInvocation SimpleName timer
% s : % . f secs StringLiteral MethodInvocation MethodInvocation SimpleName to string
% s : % . f secs StringLiteral MethodInvocation InfixExpression MethodInvocation SimpleName get
% s : % . f secs StringLiteral MethodInvocation InfixExpression MethodInvocation SimpleName timer
% s : % . f secs StringLiteral MethodInvocation InfixExpression NumberLiteral .
timer SimpleName MethodInvocation MethodInvocation InfixExpression NumberLiteral .
to string SimpleName MethodInvocation MethodInvocation InfixExpression NumberLiteral .
timer SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName total time
timer SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName key set
public Modifier MethodDeclaration Modifier synchronized
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName print
synchronized Modifier MethodDeclaration PrimitiveType void
synchronized Modifier MethodDeclaration SimpleName print
void PrimitiveType MethodDeclaration SimpleName print
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration Modifier synchronized
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName print
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration Modifier synchronized
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName print
