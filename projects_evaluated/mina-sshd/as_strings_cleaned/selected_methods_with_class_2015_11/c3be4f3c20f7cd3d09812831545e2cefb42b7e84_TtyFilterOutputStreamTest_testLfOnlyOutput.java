list SimpleName SimpleType ParameterizedType SimpleType SimpleName string
expected SimpleName VariableDeclarationFragment MethodInvocation SimpleName create test lines
generic utils SimpleName MethodInvocation SimpleName join
generic utils SimpleName MethodInvocation SimpleName expected
generic utils SimpleName MethodInvocation StringLiteral r
join SimpleName MethodInvocation SimpleName expected
join SimpleName MethodInvocation StringLiteral r
expected SimpleName MethodInvocation StringLiteral r
generic utils SimpleName MethodInvocation MethodInvocation SimpleName get bytes
join SimpleName MethodInvocation MethodInvocation SimpleName get bytes
expected SimpleName MethodInvocation MethodInvocation SimpleName get bytes
r StringLiteral MethodInvocation MethodInvocation SimpleName get bytes
generic utils SimpleName MethodInvocation MethodInvocation QualifiedName standard charsetsutf
join SimpleName MethodInvocation MethodInvocation QualifiedName standard charsetsutf
expected SimpleName MethodInvocation MethodInvocation QualifiedName standard charsetsutf
r StringLiteral MethodInvocation MethodInvocation QualifiedName standard charsetsutf
get bytes SimpleName MethodInvocation QualifiedName standard charsetsutf
data SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName generic utils
data SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName join
data SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName expected
data SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation StringLiteral r
data SimpleName VariableDeclarationFragment MethodInvocation SimpleName get bytes
data SimpleName VariableDeclarationFragment MethodInvocation QualifiedName standard charsetsutf
byte PrimitiveType ArrayType VariableDeclarationStatement VariableDeclarationFragment SimpleName data
byte array output stream SimpleName SimpleType ClassInstanceCreation QualifiedName datalength
baos SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName byte array output stream
baos SimpleName VariableDeclarationFragment ClassInstanceCreation QualifiedName datalength
byte array output stream SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName baos
enum set SimpleName MethodInvocation SimpleName of
enum set SimpleName MethodInvocation QualifiedName tty optionslf only output
of SimpleName MethodInvocation QualifiedName tty optionslf only output
private Modifier FieldDeclaration PrimitiveType long
private Modifier FieldDeclaration VariableDeclarationFragment SimpleName offset
long PrimitiveType FieldDeclaration VariableDeclarationFragment SimpleName offset
int PrimitiveType SingleVariableDeclaration SimpleName c
c SimpleName InfixExpression CharacterLiteral empty
unexpected cr at offset StringLiteral InfixExpression SimpleName offset
assert not equals SimpleName MethodInvocation InfixExpression StringLiteral unexpected cr at offset
assert not equals SimpleName MethodInvocation InfixExpression SimpleName offset
assert not equals SimpleName MethodInvocation CharacterLiteral r
assert not equals SimpleName MethodInvocation SimpleName c
unexpected cr at offset StringLiteral InfixExpression MethodInvocation CharacterLiteral r
offset SimpleName InfixExpression MethodInvocation CharacterLiteral r
unexpected cr at offset StringLiteral InfixExpression MethodInvocation SimpleName c
offset SimpleName InfixExpression MethodInvocation SimpleName c
r CharacterLiteral MethodInvocation SimpleName c
write raw output SimpleName SuperMethodInvocation SimpleName c
override SimpleName MarkerAnnotation MethodDeclaration Modifier protected
override SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
override SimpleName MarkerAnnotation MethodDeclaration SimpleName write raw output
override SimpleName MarkerAnnotation MethodDeclaration SingleVariableDeclaration PrimitiveType int
override SimpleName MarkerAnnotation MethodDeclaration SingleVariableDeclaration SimpleName c
override SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName io exception
protected Modifier MethodDeclaration PrimitiveType void
protected Modifier MethodDeclaration SimpleName write raw output
protected Modifier MethodDeclaration SingleVariableDeclaration PrimitiveType int
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleName c
protected Modifier MethodDeclaration SimpleType SimpleName io exception
void PrimitiveType MethodDeclaration SimpleName write raw output
void PrimitiveType MethodDeclaration SingleVariableDeclaration PrimitiveType int
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName c
void PrimitiveType MethodDeclaration SimpleType SimpleName io exception
write raw output SimpleName MethodDeclaration SingleVariableDeclaration PrimitiveType int
write raw output SimpleName MethodDeclaration SingleVariableDeclaration SimpleName c
write raw output SimpleName MethodDeclaration SimpleType SimpleName io exception
int PrimitiveType SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
c SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
private Modifier FieldDeclaration AnonymousClassDeclaration MethodDeclaration Modifier protected
private Modifier FieldDeclaration AnonymousClassDeclaration MethodDeclaration PrimitiveType void
private Modifier FieldDeclaration AnonymousClassDeclaration MethodDeclaration SimpleName write raw output
long PrimitiveType FieldDeclaration AnonymousClassDeclaration MethodDeclaration Modifier protected
long PrimitiveType FieldDeclaration AnonymousClassDeclaration MethodDeclaration PrimitiveType void
long PrimitiveType FieldDeclaration AnonymousClassDeclaration MethodDeclaration SimpleName write raw output
tty filter output stream SimpleName SimpleType ClassInstanceCreation SimpleName baos
tty filter output stream SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName enum set
tty filter output stream SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName of
tty filter output stream SimpleName SimpleType ClassInstanceCreation MethodInvocation QualifiedName tty optionslf only output
baos SimpleName ClassInstanceCreation MethodInvocation SimpleName enum set
baos SimpleName ClassInstanceCreation MethodInvocation SimpleName of
baos SimpleName ClassInstanceCreation MethodInvocation QualifiedName tty optionslf only output
baos SimpleName ClassInstanceCreation AnonymousClassDeclaration FieldDeclaration Modifier private
baos SimpleName ClassInstanceCreation AnonymousClassDeclaration FieldDeclaration PrimitiveType long
baos SimpleName ClassInstanceCreation AnonymousClassDeclaration MethodDeclaration Modifier protected
baos SimpleName ClassInstanceCreation AnonymousClassDeclaration MethodDeclaration PrimitiveType void
baos SimpleName ClassInstanceCreation AnonymousClassDeclaration MethodDeclaration SimpleName write raw output
tty out SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName tty filter output stream
tty out SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName baos
tty out SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName enum set
tty out SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName of
tty out SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation QualifiedName tty optionslf only output
tty filter output stream SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName tty out
tty out SimpleName MethodInvocation SimpleName write
tty out SimpleName MethodInvocation SimpleName data
write SimpleName MethodInvocation SimpleName data
list SimpleName SimpleType ParameterizedType SimpleType SimpleName string
expected SimpleName MethodInvocation SimpleName size
actual SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName expected
actual SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName size
baos SimpleName MethodInvocation SimpleName to byte array
byte array input stream SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName baos
byte array input stream SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName to byte array
input stream reader SimpleName SimpleType ClassInstanceCreation QualifiedName standard charsetsutf
byte array input stream SimpleName SimpleType ClassInstanceCreation ClassInstanceCreation QualifiedName standard charsetsutf
baos SimpleName MethodInvocation ClassInstanceCreation ClassInstanceCreation QualifiedName standard charsetsutf
to byte array SimpleName MethodInvocation ClassInstanceCreation ClassInstanceCreation QualifiedName standard charsetsutf
buffered reader SimpleName SimpleType ClassInstanceCreation ClassInstanceCreation QualifiedName standard charsetsutf
rdr SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName buffered reader
rdr SimpleName VariableDeclarationFragment ClassInstanceCreation ClassInstanceCreation QualifiedName standard charsetsutf
buffered reader SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName rdr
rdr SimpleName MethodInvocation SimpleName read line
line SimpleName VariableDeclarationFragment MethodInvocation SimpleName rdr
line SimpleName VariableDeclarationFragment MethodInvocation SimpleName read line
string SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName line
rdr SimpleName MethodInvocation SimpleName read line
line SimpleName Assignment MethodInvocation SimpleName rdr
line SimpleName Assignment MethodInvocation SimpleName read line
actual SimpleName MethodInvocation SimpleName add
actual SimpleName MethodInvocation SimpleName line
add SimpleName MethodInvocation SimpleName line
line SimpleName InfixExpression ForStatement Assignment SimpleName line
assert list equals SimpleName MethodInvocation StringLiteral mismatched read lines
assert list equals SimpleName MethodInvocation SimpleName expected
assert list equals SimpleName MethodInvocation SimpleName actual
mismatched read lines StringLiteral MethodInvocation SimpleName expected
mismatched read lines StringLiteral MethodInvocation SimpleName actual
expected SimpleName MethodInvocation SimpleName actual
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test lf only output
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName io exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test lf only output
public Modifier MethodDeclaration SimpleType SimpleName io exception
void PrimitiveType MethodDeclaration SimpleName test lf only output
void PrimitiveType MethodDeclaration SimpleType SimpleName io exception
test lf only output SimpleName MethodDeclaration SimpleType SimpleName io exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test lf only output
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test lf only output
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
