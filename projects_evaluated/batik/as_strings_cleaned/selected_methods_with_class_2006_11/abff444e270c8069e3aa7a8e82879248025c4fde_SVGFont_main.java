string SimpleName SimpleType ArrayType SingleVariableDeclaration SimpleName args
parse args SimpleName MethodInvocation SimpleName args
path SimpleName VariableDeclarationFragment MethodInvocation SimpleName parse args
path SimpleName VariableDeclarationFragment MethodInvocation SimpleName args
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName path
parse args SimpleName MethodInvocation SimpleName args
parse args SimpleName MethodInvocation SimpleName arg key char range low
args SimpleName MethodInvocation SimpleName arg key char range low
low SimpleName VariableDeclarationFragment MethodInvocation SimpleName parse args
low SimpleName VariableDeclarationFragment MethodInvocation SimpleName args
low SimpleName VariableDeclarationFragment MethodInvocation SimpleName arg key char range low
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName low
parse args SimpleName MethodInvocation SimpleName args
parse args SimpleName MethodInvocation SimpleName arg key char range high
args SimpleName MethodInvocation SimpleName arg key char range high
high SimpleName VariableDeclarationFragment MethodInvocation SimpleName parse args
high SimpleName VariableDeclarationFragment MethodInvocation SimpleName args
high SimpleName VariableDeclarationFragment MethodInvocation SimpleName arg key char range high
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName high
parse args SimpleName MethodInvocation SimpleName args
parse args SimpleName MethodInvocation SimpleName arg key id
args SimpleName MethodInvocation SimpleName arg key id
id SimpleName VariableDeclarationFragment MethodInvocation SimpleName parse args
id SimpleName VariableDeclarationFragment MethodInvocation SimpleName args
id SimpleName VariableDeclarationFragment MethodInvocation SimpleName arg key id
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName id
parse args SimpleName MethodInvocation SimpleName args
parse args SimpleName MethodInvocation SimpleName arg key ascii
args SimpleName MethodInvocation SimpleName arg key ascii
ascii SimpleName VariableDeclarationFragment MethodInvocation SimpleName parse args
ascii SimpleName VariableDeclarationFragment MethodInvocation SimpleName args
ascii SimpleName VariableDeclarationFragment MethodInvocation SimpleName arg key ascii
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName ascii
parse args SimpleName MethodInvocation SimpleName args
parse args SimpleName MethodInvocation SimpleName arg key testcard
args SimpleName MethodInvocation SimpleName arg key testcard
test card SimpleName VariableDeclarationFragment MethodInvocation SimpleName parse args
test card SimpleName VariableDeclarationFragment MethodInvocation SimpleName args
test card SimpleName VariableDeclarationFragment MethodInvocation SimpleName arg key testcard
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName test card
parse args SimpleName MethodInvocation SimpleName args
parse args SimpleName MethodInvocation SimpleName arg key output path
args SimpleName MethodInvocation SimpleName arg key output path
out path SimpleName VariableDeclarationFragment MethodInvocation SimpleName parse args
out path SimpleName VariableDeclarationFragment MethodInvocation SimpleName args
out path SimpleName VariableDeclarationFragment MethodInvocation SimpleName arg key output path
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName out path
parse args SimpleName MethodInvocation SimpleName args
parse args SimpleName MethodInvocation SimpleName arg key auto range
args SimpleName MethodInvocation SimpleName arg key auto range
auto range SimpleName VariableDeclarationFragment MethodInvocation SimpleName parse args
auto range SimpleName VariableDeclarationFragment MethodInvocation SimpleName args
auto range SimpleName VariableDeclarationFragment MethodInvocation SimpleName arg key auto range
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName auto range
print stream SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName ps
file output stream SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName fos
file output stream SimpleName SimpleType ClassInstanceCreation SimpleName out path
fos SimpleName Assignment ClassInstanceCreation SimpleType SimpleName file output stream
fos SimpleName Assignment ClassInstanceCreation SimpleName out path
print stream SimpleName SimpleType ClassInstanceCreation SimpleName fos
ps SimpleName Assignment ClassInstanceCreation SimpleType SimpleName print stream
ps SimpleName Assignment ClassInstanceCreation SimpleName fos
ps SimpleName Assignment QualifiedName systemout
font SimpleName MethodInvocation SimpleName create
font SimpleName MethodInvocation SimpleName path
create SimpleName MethodInvocation SimpleName path
font SimpleName VariableDeclarationFragment MethodInvocation SimpleName font
font SimpleName VariableDeclarationFragment MethodInvocation SimpleName create
font SimpleName VariableDeclarationFragment MethodInvocation SimpleName path
font SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName font
write svg begin SimpleName MethodInvocation SimpleName ps
write svg defs begin SimpleName MethodInvocation SimpleName ps
integer SimpleName MethodInvocation SimpleName parse int
integer SimpleName MethodInvocation SimpleName low
parse int SimpleName MethodInvocation SimpleName low
low SimpleName InfixExpression ConditionalExpression MethodInvocation SimpleName integer
low SimpleName InfixExpression ConditionalExpression MethodInvocation SimpleName parse int
low SimpleName InfixExpression ConditionalExpression MethodInvocation SimpleName low
low SimpleName InfixExpression ConditionalExpression PrefixExpression NumberLiteral empty
integer SimpleName MethodInvocation ConditionalExpression PrefixExpression NumberLiteral empty
parse int SimpleName MethodInvocation ConditionalExpression PrefixExpression NumberLiteral empty
low SimpleName MethodInvocation ConditionalExpression PrefixExpression NumberLiteral empty
integer SimpleName MethodInvocation SimpleName parse int
integer SimpleName MethodInvocation SimpleName high
parse int SimpleName MethodInvocation SimpleName high
high SimpleName InfixExpression ConditionalExpression MethodInvocation SimpleName integer
high SimpleName InfixExpression ConditionalExpression MethodInvocation SimpleName parse int
high SimpleName InfixExpression ConditionalExpression MethodInvocation SimpleName high
high SimpleName InfixExpression ConditionalExpression PrefixExpression NumberLiteral empty
integer SimpleName MethodInvocation ConditionalExpression PrefixExpression NumberLiteral empty
parse int SimpleName MethodInvocation ConditionalExpression PrefixExpression NumberLiteral empty
high SimpleName MethodInvocation ConditionalExpression PrefixExpression NumberLiteral empty
write font as svg fragment SimpleName MethodInvocation SimpleName ps
write font as svg fragment SimpleName MethodInvocation SimpleName font
write font as svg fragment SimpleName MethodInvocation SimpleName id
ps SimpleName MethodInvocation SimpleName font
ps SimpleName MethodInvocation SimpleName id
ps SimpleName MethodInvocation ParenthesizedExpression InfixExpression SimpleName auto range
font SimpleName MethodInvocation SimpleName id
font SimpleName MethodInvocation ParenthesizedExpression InfixExpression SimpleName auto range
font SimpleName MethodInvocation ParenthesizedExpression InfixExpression SimpleName ascii
id SimpleName MethodInvocation ParenthesizedExpression InfixExpression SimpleName auto range
id SimpleName MethodInvocation ParenthesizedExpression InfixExpression SimpleName ascii
write svg defs end SimpleName MethodInvocation SimpleName ps
font SimpleName MethodInvocation SimpleName get name table
font SimpleName MethodInvocation MethodInvocation SimpleName get record
get name table SimpleName MethodInvocation MethodInvocation SimpleName get record
font SimpleName MethodInvocation MethodInvocation QualifiedName tablename font family name
get name table SimpleName MethodInvocation MethodInvocation QualifiedName tablename font family name
get record SimpleName MethodInvocation QualifiedName tablename font family name
font family SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName font
font family SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get name table
font family SimpleName VariableDeclarationFragment MethodInvocation SimpleName get record
font family SimpleName VariableDeclarationFragment MethodInvocation QualifiedName tablename font family name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName font family
write svg test card SimpleName MethodInvocation SimpleName ps
write svg test card SimpleName MethodInvocation SimpleName font family
ps SimpleName MethodInvocation SimpleName font family
write svg end SimpleName MethodInvocation SimpleName ps
fos SimpleName MethodInvocation SimpleName close
exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
e SimpleName MethodInvocation SimpleName print stack trace
e SimpleName MethodInvocation SimpleName get message
systemerr QualifiedName MethodInvocation SimpleName println
systemerr QualifiedName MethodInvocation MethodInvocation SimpleName e
systemerr QualifiedName MethodInvocation MethodInvocation SimpleName get message
println SimpleName MethodInvocation MethodInvocation SimpleName e
println SimpleName MethodInvocation MethodInvocation SimpleName get message
public Modifier MethodDeclaration Modifier static
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName main
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName args
static Modifier MethodDeclaration PrimitiveType void
static Modifier MethodDeclaration SimpleName main
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName args
void PrimitiveType MethodDeclaration SimpleName main
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName args
main SimpleName MethodDeclaration SingleVariableDeclaration SimpleName args
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration Modifier static
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName main
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName args
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration Modifier static
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName main
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName args