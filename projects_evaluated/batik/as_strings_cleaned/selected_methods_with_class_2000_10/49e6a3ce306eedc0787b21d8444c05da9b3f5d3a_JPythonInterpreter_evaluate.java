reader SimpleName SimpleType SingleVariableDeclaration SimpleName scriptreader
sbuffer SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName string buffer
string buffer SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName sbuffer
char PrimitiveType ArrayType ArrayCreation NumberLiteral empty
buffer SimpleName VariableDeclarationFragment ArrayCreation ArrayType PrimitiveType char
buffer SimpleName VariableDeclarationFragment ArrayCreation NumberLiteral empty
char PrimitiveType ArrayType VariableDeclarationStatement VariableDeclarationFragment SimpleName buffer
val SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName val
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment NumberLiteral empty
scriptreader SimpleName MethodInvocation SimpleName read
scriptreader SimpleName MethodInvocation SimpleName buffer
read SimpleName MethodInvocation SimpleName buffer
val SimpleName Assignment MethodInvocation SimpleName scriptreader
val SimpleName Assignment MethodInvocation SimpleName read
val SimpleName Assignment MethodInvocation SimpleName buffer
sbuffer SimpleName MethodInvocation SimpleName append
sbuffer SimpleName MethodInvocation SimpleName buffer
sbuffer SimpleName MethodInvocation NumberLiteral empty
sbuffer SimpleName MethodInvocation SimpleName val
append SimpleName MethodInvocation SimpleName buffer
append SimpleName MethodInvocation NumberLiteral empty
append SimpleName MethodInvocation SimpleName val
buffer SimpleName MethodInvocation NumberLiteral empty
buffer SimpleName MethodInvocation SimpleName val
empty NumberLiteral MethodInvocation SimpleName val
sbuffer SimpleName MethodInvocation SimpleName to string
str SimpleName VariableDeclarationFragment MethodInvocation SimpleName sbuffer
str SimpleName VariableDeclarationFragment MethodInvocation SimpleName to string
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName str
interpreter SimpleName MethodInvocation SimpleName exec
interpreter SimpleName MethodInvocation SimpleName str
exec SimpleName MethodInvocation SimpleName str
orgpythoncorepy exception QualifiedName SimpleType SingleVariableDeclaration SimpleName e
e SimpleName MethodInvocation SimpleName print stack trace
e SimpleName MethodInvocation SimpleName get message
interpreter exception SimpleName SimpleType ClassInstanceCreation SimpleName e
interpreter exception SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName e
interpreter exception SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get message
interpreter exception SimpleName SimpleType ClassInstanceCreation PrefixExpression NumberLiteral empty
interpreter exception SimpleName SimpleType ClassInstanceCreation PrefixExpression NumberLiteral empty
e SimpleName ClassInstanceCreation MethodInvocation SimpleName e
e SimpleName ClassInstanceCreation MethodInvocation SimpleName get message
e SimpleName ClassInstanceCreation PrefixExpression NumberLiteral empty
e SimpleName ClassInstanceCreation PrefixExpression NumberLiteral empty
e SimpleName MethodInvocation ClassInstanceCreation PrefixExpression NumberLiteral empty
get message SimpleName MethodInvocation ClassInstanceCreation PrefixExpression NumberLiteral empty
e SimpleName MethodInvocation ClassInstanceCreation PrefixExpression NumberLiteral empty
get message SimpleName MethodInvocation ClassInstanceCreation PrefixExpression NumberLiteral empty
empty NumberLiteral PrefixExpression ClassInstanceCreation PrefixExpression NumberLiteral empty
runtime exception SimpleName SimpleType SingleVariableDeclaration SimpleName re
re SimpleName MethodInvocation SimpleName get message
interpreter exception SimpleName SimpleType ClassInstanceCreation SimpleName re
interpreter exception SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName re
interpreter exception SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get message
interpreter exception SimpleName SimpleType ClassInstanceCreation PrefixExpression NumberLiteral empty
interpreter exception SimpleName SimpleType ClassInstanceCreation PrefixExpression NumberLiteral empty
re SimpleName ClassInstanceCreation MethodInvocation SimpleName re
re SimpleName ClassInstanceCreation MethodInvocation SimpleName get message
re SimpleName ClassInstanceCreation PrefixExpression NumberLiteral empty
re SimpleName ClassInstanceCreation PrefixExpression NumberLiteral empty
re SimpleName MethodInvocation ClassInstanceCreation PrefixExpression NumberLiteral empty
get message SimpleName MethodInvocation ClassInstanceCreation PrefixExpression NumberLiteral empty
re SimpleName MethodInvocation ClassInstanceCreation PrefixExpression NumberLiteral empty
get message SimpleName MethodInvocation ClassInstanceCreation PrefixExpression NumberLiteral empty
empty NumberLiteral PrefixExpression ClassInstanceCreation PrefixExpression NumberLiteral empty
public Modifier MethodDeclaration SimpleType SimpleName object
public Modifier MethodDeclaration SimpleName evaluate
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName reader
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName scriptreader
public Modifier MethodDeclaration SimpleType SimpleName interpreter exception
public Modifier MethodDeclaration SimpleType SimpleName io exception
object SimpleName SimpleType MethodDeclaration SimpleName evaluate
object SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName scriptreader
object SimpleName SimpleType MethodDeclaration SimpleType SimpleName interpreter exception
object SimpleName SimpleType MethodDeclaration SimpleType SimpleName io exception
evaluate SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName reader
evaluate SimpleName MethodDeclaration SingleVariableDeclaration SimpleName scriptreader
evaluate SimpleName MethodDeclaration SimpleType SimpleName interpreter exception
evaluate SimpleName MethodDeclaration SimpleType SimpleName io exception
scriptreader SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName interpreter exception
scriptreader SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
interpreter exception SimpleName SimpleType MethodDeclaration SimpleType SimpleName io exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName object
public Modifier TypeDeclaration MethodDeclaration SimpleName evaluate
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName scriptreader
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName interpreter exception
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName object
test SimpleName TypeDeclaration MethodDeclaration SimpleName evaluate
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName scriptreader
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName interpreter exception
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
