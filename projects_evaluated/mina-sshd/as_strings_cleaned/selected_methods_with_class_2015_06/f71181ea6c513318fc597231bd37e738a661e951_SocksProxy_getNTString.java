buffer SimpleName SimpleType SingleVariableDeclaration SimpleName buffer
sb SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName string builder
string builder SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName sb
char PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName c
get u byte SimpleName MethodInvocation SimpleName buffer
char PrimitiveType CastExpression MethodInvocation SimpleName get u byte
char PrimitiveType CastExpression MethodInvocation SimpleName buffer
c SimpleName Assignment CastExpression PrimitiveType char
c SimpleName Assignment CastExpression MethodInvocation SimpleName get u byte
c SimpleName Assignment CastExpression MethodInvocation SimpleName buffer
c SimpleName Assignment ParenthesizedExpression InfixExpression NumberLiteral empty
sb SimpleName MethodInvocation SimpleName append
sb SimpleName MethodInvocation SimpleName c
append SimpleName MethodInvocation SimpleName c
sb SimpleName MethodInvocation SimpleName to string
private Modifier MethodDeclaration SimpleType SimpleName string
private Modifier MethodDeclaration SimpleName get nt string
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName buffer
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName buffer
private Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType char
string SimpleName SimpleType MethodDeclaration SimpleName get nt string
string SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName buffer
get nt string SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName buffer
get nt string SimpleName MethodDeclaration SingleVariableDeclaration SimpleName buffer
get nt string SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType char
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName string
public Modifier TypeDeclaration MethodDeclaration SimpleName get nt string
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName buffer
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName string
test SimpleName TypeDeclaration MethodDeclaration SimpleName get nt string
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName buffer