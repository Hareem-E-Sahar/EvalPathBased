command SimpleName VariableDeclarationFragment MethodInvocation SimpleName get command
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName command
list SimpleName SimpleType ParameterizedType SimpleType SimpleName string
parse delimited string SimpleName MethodInvocation SimpleName command
parse delimited string SimpleName MethodInvocation StringLiteral empty
parse delimited string SimpleName MethodInvocation BooleanLiteral true
command SimpleName MethodInvocation StringLiteral empty
command SimpleName MethodInvocation BooleanLiteral true
empty StringLiteral MethodInvocation BooleanLiteral true
strs SimpleName VariableDeclarationFragment MethodInvocation SimpleName parse delimited string
strs SimpleName VariableDeclarationFragment MethodInvocation SimpleName command
strs SimpleName VariableDeclarationFragment MethodInvocation StringLiteral empty
strs SimpleName VariableDeclarationFragment MethodInvocation BooleanLiteral true
strs SimpleName MethodInvocation SimpleName size
strs SimpleName MethodInvocation SimpleName to array
strs SimpleName MethodInvocation ArrayCreation MethodInvocation SimpleName strs
strs SimpleName MethodInvocation ArrayCreation MethodInvocation SimpleName size
to array SimpleName MethodInvocation ArrayCreation MethodInvocation SimpleName strs
to array SimpleName MethodInvocation ArrayCreation MethodInvocation SimpleName size
args SimpleName VariableDeclarationFragment MethodInvocation SimpleName strs
args SimpleName VariableDeclarationFragment MethodInvocation SimpleName to array
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression QualifiedName argslength
args SimpleName ArrayAccess SimpleName i
arg val SimpleName VariableDeclarationFragment ArrayAccess SimpleName args
arg val SimpleName VariableDeclarationFragment ArrayAccess SimpleName i
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName arg val
arg val SimpleName MethodInvocation SimpleName starts with
arg val SimpleName MethodInvocation StringLiteral empty
starts with SimpleName MethodInvocation StringLiteral empty
arg val SimpleName MethodInvocation SimpleName ends with
arg val SimpleName MethodInvocation StringLiteral empty
ends with SimpleName MethodInvocation StringLiteral empty
arg val SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName arg val
arg val SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName ends with
arg val SimpleName MethodInvocation InfixExpression MethodInvocation StringLiteral empty
starts with SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName arg val
starts with SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName ends with
starts with SimpleName MethodInvocation InfixExpression MethodInvocation StringLiteral empty
empty StringLiteral MethodInvocation InfixExpression MethodInvocation SimpleName arg val
empty StringLiteral MethodInvocation InfixExpression MethodInvocation SimpleName ends with
empty StringLiteral MethodInvocation InfixExpression MethodInvocation StringLiteral empty
args SimpleName ArrayAccess SimpleName i
arg val SimpleName MethodInvocation SimpleName length
arg val SimpleName MethodInvocation InfixExpression NumberLiteral empty
length SimpleName MethodInvocation InfixExpression NumberLiteral empty
arg val SimpleName MethodInvocation SimpleName substring
arg val SimpleName MethodInvocation NumberLiteral empty
arg val SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName arg val
arg val SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName length
arg val SimpleName MethodInvocation InfixExpression NumberLiteral empty
substring SimpleName MethodInvocation NumberLiteral empty
substring SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName arg val
substring SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName length
substring SimpleName MethodInvocation InfixExpression NumberLiteral empty
empty NumberLiteral MethodInvocation InfixExpression MethodInvocation SimpleName arg val
empty NumberLiteral MethodInvocation InfixExpression MethodInvocation SimpleName length
empty NumberLiteral MethodInvocation InfixExpression NumberLiteral empty
args SimpleName ArrayAccess Assignment MethodInvocation SimpleName arg val
args SimpleName ArrayAccess Assignment MethodInvocation SimpleName substring
args SimpleName ArrayAccess Assignment MethodInvocation NumberLiteral empty
i SimpleName ArrayAccess Assignment MethodInvocation SimpleName arg val
i SimpleName ArrayAccess Assignment MethodInvocation SimpleName substring
i SimpleName ArrayAccess Assignment MethodInvocation NumberLiteral empty
args SimpleName ArrayAccess SimpleName i
arg val SimpleName Assignment ArrayAccess SimpleName args
arg val SimpleName Assignment ArrayAccess SimpleName i
arg val SimpleName MethodInvocation SimpleName starts with
arg val SimpleName MethodInvocation StringLiteral \
starts with SimpleName MethodInvocation StringLiteral \
arg val SimpleName MethodInvocation SimpleName ends with
arg val SimpleName MethodInvocation StringLiteral \
ends with SimpleName MethodInvocation StringLiteral \
arg val SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName arg val
arg val SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName ends with
arg val SimpleName MethodInvocation InfixExpression MethodInvocation StringLiteral \
starts with SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName arg val
starts with SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName ends with
starts with SimpleName MethodInvocation InfixExpression MethodInvocation StringLiteral \
\ StringLiteral MethodInvocation InfixExpression MethodInvocation SimpleName arg val
\ StringLiteral MethodInvocation InfixExpression MethodInvocation SimpleName ends with
\ StringLiteral MethodInvocation InfixExpression MethodInvocation StringLiteral \
args SimpleName ArrayAccess SimpleName i
arg val SimpleName MethodInvocation SimpleName length
arg val SimpleName MethodInvocation InfixExpression NumberLiteral empty
length SimpleName MethodInvocation InfixExpression NumberLiteral empty
arg val SimpleName MethodInvocation SimpleName substring
arg val SimpleName MethodInvocation NumberLiteral empty
arg val SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName arg val
arg val SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName length
arg val SimpleName MethodInvocation InfixExpression NumberLiteral empty
substring SimpleName MethodInvocation NumberLiteral empty
substring SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName arg val
substring SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName length
substring SimpleName MethodInvocation InfixExpression NumberLiteral empty
empty NumberLiteral MethodInvocation InfixExpression MethodInvocation SimpleName arg val
empty NumberLiteral MethodInvocation InfixExpression MethodInvocation SimpleName length
empty NumberLiteral MethodInvocation InfixExpression NumberLiteral empty
args SimpleName ArrayAccess Assignment MethodInvocation SimpleName arg val
args SimpleName ArrayAccess Assignment MethodInvocation SimpleName substring
args SimpleName ArrayAccess Assignment MethodInvocation NumberLiteral empty
i SimpleName ArrayAccess Assignment MethodInvocation SimpleName arg val
i SimpleName ArrayAccess Assignment MethodInvocation SimpleName substring
i SimpleName ArrayAccess Assignment MethodInvocation NumberLiteral empty
args SimpleName ArrayAccess SimpleName i
arg val SimpleName Assignment ArrayAccess SimpleName args
arg val SimpleName Assignment ArrayAccess SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression QualifiedName argslength
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
argslength QualifiedName InfixExpression ForStatement PostfixExpression SimpleName i
argslength QualifiedName InfixExpression NumberLiteral empty
invalid git command line StringLiteral InfixExpression SimpleName command
illegal argument exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral invalid git command line
illegal argument exception SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName command
args SimpleName ArrayAccess NumberLiteral empty
sub command SimpleName VariableDeclarationFragment ArrayAccess SimpleName args
sub command SimpleName VariableDeclarationFragment ArrayAccess NumberLiteral empty
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName sub command
args SimpleName ArrayAccess NumberLiteral empty
resolve root directory SimpleName MethodInvocation SimpleName command
resolve root directory SimpleName MethodInvocation SimpleName sub command
resolve root directory SimpleName MethodInvocation ArrayAccess SimpleName args
resolve root directory SimpleName MethodInvocation ArrayAccess NumberLiteral empty
command SimpleName MethodInvocation SimpleName sub command
command SimpleName MethodInvocation ArrayAccess SimpleName args
command SimpleName MethodInvocation ArrayAccess NumberLiteral empty
sub command SimpleName MethodInvocation ArrayAccess SimpleName args
sub command SimpleName MethodInvocation ArrayAccess NumberLiteral empty
root dir SimpleName VariableDeclarationFragment MethodInvocation SimpleName resolve root directory
root dir SimpleName VariableDeclarationFragment MethodInvocation SimpleName command
root dir SimpleName VariableDeclarationFragment MethodInvocation SimpleName sub command
root dir SimpleName VariableDeclarationFragment MethodInvocation ArrayAccess SimpleName args
root dir SimpleName VariableDeclarationFragment MethodInvocation ArrayAccess NumberLiteral empty
path SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName root dir
root dir SimpleName MethodInvocation SimpleName to file
repository cachefile key QualifiedName MethodInvocation SimpleName lenient
repository cachefile key QualifiedName MethodInvocation MethodInvocation SimpleName root dir
repository cachefile key QualifiedName MethodInvocation MethodInvocation SimpleName to file
repository cachefile key QualifiedName MethodInvocation QualifiedName fsdetected
lenient SimpleName MethodInvocation MethodInvocation SimpleName root dir
lenient SimpleName MethodInvocation MethodInvocation SimpleName to file
lenient SimpleName MethodInvocation QualifiedName fsdetected
root dir SimpleName MethodInvocation MethodInvocation QualifiedName fsdetected
to file SimpleName MethodInvocation MethodInvocation QualifiedName fsdetected
key SimpleName VariableDeclarationFragment MethodInvocation QualifiedName repository cachefile key
key SimpleName VariableDeclarationFragment MethodInvocation SimpleName lenient
key SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName root dir
key SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName to file
key SimpleName VariableDeclarationFragment MethodInvocation QualifiedName fsdetected
repository cachefile key QualifiedName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName key
key SimpleName MethodInvocation SimpleName open
key SimpleName MethodInvocation BooleanLiteral true
open SimpleName MethodInvocation BooleanLiteral true
db SimpleName VariableDeclarationFragment MethodInvocation SimpleName key
db SimpleName VariableDeclarationFragment MethodInvocation SimpleName open
db SimpleName VariableDeclarationFragment MethodInvocation BooleanLiteral true
repository SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName db
remote configdefault upload pack QualifiedName MethodInvocation SimpleName equals
remote configdefault upload pack QualifiedName MethodInvocation SimpleName sub command
equals SimpleName MethodInvocation SimpleName sub command
upload pack SimpleName SimpleType ClassInstanceCreation SimpleName db
upload pack SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName upload
db SimpleName ClassInstanceCreation MethodInvocation SimpleName upload
db SimpleName ClassInstanceCreation MethodInvocation MethodInvocation SimpleName get input stream
db SimpleName ClassInstanceCreation MethodInvocation MethodInvocation SimpleName get output stream
db SimpleName ClassInstanceCreation MethodInvocation MethodInvocation SimpleName get error stream
upload SimpleName MethodInvocation MethodInvocation SimpleName get input stream
upload SimpleName MethodInvocation MethodInvocation SimpleName get output stream
upload SimpleName MethodInvocation MethodInvocation SimpleName get error stream
get input stream SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get output stream
get input stream SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get error stream
get output stream SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get error stream
remote configdefault receive pack QualifiedName MethodInvocation SimpleName equals
remote configdefault receive pack QualifiedName MethodInvocation SimpleName sub command
equals SimpleName MethodInvocation SimpleName sub command
receive pack SimpleName SimpleType ClassInstanceCreation SimpleName db
receive pack SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName receive
db SimpleName ClassInstanceCreation MethodInvocation SimpleName receive
db SimpleName ClassInstanceCreation MethodInvocation MethodInvocation SimpleName get input stream
db SimpleName ClassInstanceCreation MethodInvocation MethodInvocation SimpleName get output stream
db SimpleName ClassInstanceCreation MethodInvocation MethodInvocation SimpleName get error stream
receive SimpleName MethodInvocation MethodInvocation SimpleName get input stream
receive SimpleName MethodInvocation MethodInvocation SimpleName get output stream
receive SimpleName MethodInvocation MethodInvocation SimpleName get error stream
get input stream SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get output stream
get input stream SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get error stream
get output stream SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get error stream
unknown git command StringLiteral InfixExpression SimpleName command
illegal argument exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral unknown git command
illegal argument exception SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName command
on exit SimpleName MethodInvocation NumberLiteral empty
throwable SimpleName SimpleType SingleVariableDeclaration SimpleName t
t SimpleName MethodInvocation SimpleName get class
t SimpleName MethodInvocation MethodInvocation SimpleName get simple name
get class SimpleName MethodInvocation MethodInvocation SimpleName get simple name
on exit SimpleName MethodInvocation PrefixExpression NumberLiteral empty
on exit SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName t
on exit SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get class
on exit SimpleName MethodInvocation MethodInvocation SimpleName get simple name
empty NumberLiteral PrefixExpression MethodInvocation MethodInvocation SimpleName get simple name
override SimpleName MarkerAnnotation MethodDeclaration Modifier public
override SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
override SimpleName MarkerAnnotation MethodDeclaration SimpleName run
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName run
void PrimitiveType MethodDeclaration SimpleName run
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName override
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName run
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName override
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName run