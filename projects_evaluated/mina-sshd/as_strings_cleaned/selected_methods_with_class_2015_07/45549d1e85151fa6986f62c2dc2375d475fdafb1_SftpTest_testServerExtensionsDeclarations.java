ssh client SimpleName MethodInvocation SimpleName set up default client
client SimpleName VariableDeclarationFragment MethodInvocation SimpleName ssh client
client SimpleName VariableDeclarationFragment MethodInvocation SimpleName set up default client
ssh client SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName client
client SimpleName MethodInvocation SimpleName start
client SimpleName MethodInvocation SimpleName connect
client SimpleName MethodInvocation MethodInvocation SimpleName get current test name
client SimpleName MethodInvocation StringLiteral localhost
client SimpleName MethodInvocation SimpleName port
connect SimpleName MethodInvocation MethodInvocation SimpleName get current test name
connect SimpleName MethodInvocation StringLiteral localhost
connect SimpleName MethodInvocation SimpleName port
get current test name SimpleName MethodInvocation MethodInvocation StringLiteral localhost
get current test name SimpleName MethodInvocation MethodInvocation SimpleName port
localhost StringLiteral MethodInvocation SimpleName port
client SimpleName MethodInvocation MethodInvocation SimpleName verify
connect SimpleName MethodInvocation MethodInvocation SimpleName verify
get current test name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName verify
localhost StringLiteral MethodInvocation MethodInvocation SimpleName verify
port SimpleName MethodInvocation MethodInvocation SimpleName verify
client SimpleName MethodInvocation MethodInvocation NumberLiteral l
connect SimpleName MethodInvocation MethodInvocation NumberLiteral l
get current test name SimpleName MethodInvocation MethodInvocation MethodInvocation NumberLiteral l
localhost StringLiteral MethodInvocation MethodInvocation NumberLiteral l
port SimpleName MethodInvocation MethodInvocation NumberLiteral l
client SimpleName MethodInvocation MethodInvocation QualifiedName time unitseconds
connect SimpleName MethodInvocation MethodInvocation QualifiedName time unitseconds
get current test name SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName time unitseconds
localhost StringLiteral MethodInvocation MethodInvocation QualifiedName time unitseconds
port SimpleName MethodInvocation MethodInvocation QualifiedName time unitseconds
verify SimpleName MethodInvocation NumberLiteral l
verify SimpleName MethodInvocation QualifiedName time unitseconds
l NumberLiteral MethodInvocation QualifiedName time unitseconds
client SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get session
connect SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get session
localhost StringLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName get session
port SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get session
verify SimpleName MethodInvocation MethodInvocation SimpleName get session
l NumberLiteral MethodInvocation MethodInvocation SimpleName get session
time unitseconds QualifiedName MethodInvocation MethodInvocation SimpleName get session
session SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName verify
session SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation NumberLiteral l
session SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation QualifiedName time unitseconds
session SimpleName VariableDeclarationFragment MethodInvocation SimpleName get session
client session SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName session
session SimpleName MethodInvocation SimpleName add password identity
session SimpleName MethodInvocation MethodInvocation SimpleName get current test name
add password identity SimpleName MethodInvocation MethodInvocation SimpleName get current test name
session SimpleName MethodInvocation SimpleName auth
session SimpleName MethodInvocation MethodInvocation SimpleName verify
auth SimpleName MethodInvocation MethodInvocation SimpleName verify
session SimpleName MethodInvocation MethodInvocation NumberLiteral l
auth SimpleName MethodInvocation MethodInvocation NumberLiteral l
session SimpleName MethodInvocation MethodInvocation QualifiedName time unitseconds
auth SimpleName MethodInvocation MethodInvocation QualifiedName time unitseconds
verify SimpleName MethodInvocation NumberLiteral l
verify SimpleName MethodInvocation QualifiedName time unitseconds
l NumberLiteral MethodInvocation QualifiedName time unitseconds
session SimpleName MethodInvocation SimpleName create sftp client
sftp SimpleName VariableDeclarationFragment MethodInvocation SimpleName session
sftp SimpleName VariableDeclarationFragment MethodInvocation SimpleName create sftp client
sftp client SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName sftp
map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
map SimpleName SimpleType ParameterizedType ArrayType PrimitiveType byte
string SimpleName SimpleType ParameterizedType ArrayType PrimitiveType byte
sftp SimpleName MethodInvocation SimpleName get server extensions
extensions SimpleName VariableDeclarationFragment MethodInvocation SimpleName sftp
extensions SimpleName VariableDeclarationFragment MethodInvocation SimpleName get server extensions
string SimpleName SimpleType SingleVariableDeclaration SimpleName name
sftp constantsext newline QualifiedName ArrayInitializer QualifiedName sftp constantsext versions
sftp constantsext newline QualifiedName ArrayInitializer QualifiedName sftp constantsext vendorid
sftp constantsext newline QualifiedName ArrayInitializer QualifiedName sftp constantsext supported
sftp constantsext newline QualifiedName ArrayInitializer QualifiedName sftp constantsext supported
sftp constantsext versions QualifiedName ArrayInitializer QualifiedName sftp constantsext vendorid
sftp constantsext versions QualifiedName ArrayInitializer QualifiedName sftp constantsext supported
sftp constantsext versions QualifiedName ArrayInitializer QualifiedName sftp constantsext supported
sftp constantsext vendorid QualifiedName ArrayInitializer QualifiedName sftp constantsext supported
sftp constantsext vendorid QualifiedName ArrayInitializer QualifiedName sftp constantsext supported
sftp constantsext supported QualifiedName ArrayInitializer QualifiedName sftp constantsext supported
missing extension StringLiteral InfixExpression SimpleName name
extensions SimpleName MethodInvocation SimpleName contains key
extensions SimpleName MethodInvocation SimpleName name
contains key SimpleName MethodInvocation SimpleName name
assert true SimpleName MethodInvocation InfixExpression StringLiteral missing extension
assert true SimpleName MethodInvocation InfixExpression SimpleName name
assert true SimpleName MethodInvocation MethodInvocation SimpleName extensions
assert true SimpleName MethodInvocation MethodInvocation SimpleName contains key
assert true SimpleName MethodInvocation MethodInvocation SimpleName name
missing extension StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName extensions
missing extension StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName contains key
missing extension StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName name
name SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName extensions
name SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName contains key
name SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName name
map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
map SimpleName SimpleType ParameterizedType WildcardType ?
string SimpleName SimpleType ParameterizedType WildcardType ?
parser utils SimpleName MethodInvocation SimpleName parse
parser utils SimpleName MethodInvocation SimpleName extensions
parse SimpleName MethodInvocation SimpleName extensions
data SimpleName VariableDeclarationFragment MethodInvocation SimpleName parser utils
data SimpleName VariableDeclarationFragment MethodInvocation SimpleName parse
data SimpleName VariableDeclarationFragment MethodInvocation SimpleName extensions
? WildcardType ParameterizedType VariableDeclarationStatement VariableDeclarationFragment SimpleName data
mapentry QualifiedName SimpleType ParameterizedType SimpleType SimpleName string
mapentry QualifiedName SimpleType ParameterizedType WildcardType ?
string SimpleName SimpleType ParameterizedType WildcardType ?
mapentry QualifiedName SimpleType ParameterizedType SingleVariableDeclaration SimpleName de
string SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName de
? WildcardType ParameterizedType SingleVariableDeclaration SimpleName de
data SimpleName MethodInvocation SimpleName entry set
de SimpleName MethodInvocation SimpleName get key
ext name SimpleName VariableDeclarationFragment MethodInvocation SimpleName de
ext name SimpleName VariableDeclarationFragment MethodInvocation SimpleName get key
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName ext name
de SimpleName MethodInvocation SimpleName get value
ext value SimpleName VariableDeclarationFragment MethodInvocation SimpleName de
ext value SimpleName VariableDeclarationFragment MethodInvocation SimpleName get value
object SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName ext value
systemout QualifiedName MethodInvocation SimpleName append
systemout QualifiedName MethodInvocation CharacterLiteral t
append SimpleName MethodInvocation CharacterLiteral t
systemout QualifiedName MethodInvocation MethodInvocation SimpleName append
append SimpleName MethodInvocation MethodInvocation SimpleName append
t CharacterLiteral MethodInvocation MethodInvocation SimpleName append
systemout QualifiedName MethodInvocation MethodInvocation SimpleName ext name
append SimpleName MethodInvocation MethodInvocation SimpleName ext name
t CharacterLiteral MethodInvocation MethodInvocation SimpleName ext name
append SimpleName MethodInvocation SimpleName ext name
systemout QualifiedName MethodInvocation MethodInvocation MethodInvocation SimpleName append
append SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName append
t CharacterLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName append
append SimpleName MethodInvocation MethodInvocation SimpleName append
ext name SimpleName MethodInvocation MethodInvocation SimpleName append
systemout QualifiedName MethodInvocation MethodInvocation MethodInvocation StringLiteral :
append SimpleName MethodInvocation MethodInvocation MethodInvocation StringLiteral :
t CharacterLiteral MethodInvocation MethodInvocation MethodInvocation StringLiteral :
append SimpleName MethodInvocation MethodInvocation StringLiteral :
ext name SimpleName MethodInvocation MethodInvocation StringLiteral :
append SimpleName MethodInvocation StringLiteral :
append SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName println
ext name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName println
append SimpleName MethodInvocation MethodInvocation SimpleName println
: StringLiteral MethodInvocation MethodInvocation SimpleName println
append SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName ext value
ext name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName ext value
append SimpleName MethodInvocation MethodInvocation SimpleName ext value
: StringLiteral MethodInvocation MethodInvocation SimpleName ext value
println SimpleName MethodInvocation SimpleName ext value
sftp constantsext supported QualifiedName MethodInvocation SimpleName equals ignore case
sftp constantsext supported QualifiedName MethodInvocation SimpleName ext name
equals ignore case SimpleName MethodInvocation SimpleName ext name
supported SimpleName SimpleType CastExpression SimpleName ext value
ext value SimpleName CastExpression ParenthesizedExpression FieldAccess SimpleName extension names
assert supported extensions SimpleName MethodInvocation SimpleName ext name
assert supported extensions SimpleName MethodInvocation FieldAccess SimpleName extension names
ext name SimpleName MethodInvocation FieldAccess SimpleName extension names
sftp constantsext supported QualifiedName MethodInvocation SimpleName equals ignore case
sftp constantsext supported QualifiedName MethodInvocation SimpleName ext name
equals ignore case SimpleName MethodInvocation SimpleName ext name
supported SimpleName SimpleType CastExpression SimpleName ext value
ext value SimpleName CastExpression ParenthesizedExpression FieldAccess SimpleName extension names
assert supported extensions SimpleName MethodInvocation SimpleName ext name
assert supported extensions SimpleName MethodInvocation FieldAccess SimpleName extension names
ext name SimpleName MethodInvocation FieldAccess SimpleName extension names
de SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName data
de SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName entry set
open ssh extension SimpleName SimpleType SingleVariableDeclaration SimpleName expected
expected SimpleName MethodInvocation SimpleName get name
name SimpleName VariableDeclarationFragment MethodInvocation SimpleName expected
name SimpleName VariableDeclarationFragment MethodInvocation SimpleName get name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName name
data SimpleName MethodInvocation SimpleName get
data SimpleName MethodInvocation SimpleName name
get SimpleName MethodInvocation SimpleName name
value SimpleName VariableDeclarationFragment MethodInvocation SimpleName data
value SimpleName VariableDeclarationFragment MethodInvocation SimpleName get
value SimpleName VariableDeclarationFragment MethodInvocation SimpleName name
object SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName value
open ssh extension not declared StringLiteral InfixExpression SimpleName name
assert not null SimpleName MethodInvocation InfixExpression StringLiteral open ssh extension not declared
assert not null SimpleName MethodInvocation InfixExpression SimpleName name
assert not null SimpleName MethodInvocation SimpleName value
open ssh extension not declared StringLiteral InfixExpression MethodInvocation SimpleName value
name SimpleName InfixExpression MethodInvocation SimpleName value
open ssh extension SimpleName SimpleType CastExpression SimpleName value
actual SimpleName VariableDeclarationFragment CastExpression SimpleType SimpleName open ssh extension
actual SimpleName VariableDeclarationFragment CastExpression SimpleName value
open ssh extension SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName actual
mismatched version for open ssh extension StringLiteral InfixExpression SimpleName name
expected SimpleName MethodInvocation SimpleName get version
actual SimpleName MethodInvocation SimpleName get version
assert equals SimpleName MethodInvocation InfixExpression StringLiteral mismatched version for open ssh extension
assert equals SimpleName MethodInvocation InfixExpression SimpleName name
assert equals SimpleName MethodInvocation MethodInvocation SimpleName expected
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get version
assert equals SimpleName MethodInvocation MethodInvocation SimpleName actual
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get version
mismatched version for open ssh extension StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName expected
mismatched version for open ssh extension StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName get version
name SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName expected
name SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName get version
mismatched version for open ssh extension StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName actual
mismatched version for open ssh extension StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName get version
name SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName actual
name SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName get version
expected SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName actual
expected SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get version
get version SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName actual
get version SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get version
open ssh extension SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement QualifiedName sftp subsystemdefault open ssh extensions
expected SimpleName SingleVariableDeclaration EnhancedForStatement QualifiedName sftp subsystemdefault open ssh extensions
builtin sftp client extensions SimpleName SimpleType SingleVariableDeclaration SimpleName type
type SimpleName MethodInvocation SimpleName get name
extension name SimpleName VariableDeclarationFragment MethodInvocation SimpleName type
extension name SimpleName VariableDeclarationFragment MethodInvocation SimpleName get name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName extension name
sftp SimpleName MethodInvocation SimpleName get extension
sftp SimpleName MethodInvocation SimpleName extension name
get extension SimpleName MethodInvocation SimpleName extension name
instance SimpleName VariableDeclarationFragment MethodInvocation SimpleName sftp
instance SimpleName VariableDeclarationFragment MethodInvocation SimpleName get extension
instance SimpleName VariableDeclarationFragment MethodInvocation SimpleName extension name
sftp client extension SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName instance
extension not implemented StringLiteral InfixExpression SimpleName extension name
assert not null SimpleName MethodInvocation InfixExpression StringLiteral extension not implemented
assert not null SimpleName MethodInvocation InfixExpression SimpleName extension name
assert not null SimpleName MethodInvocation SimpleName instance
extension not implemented StringLiteral InfixExpression MethodInvocation SimpleName instance
extension name SimpleName InfixExpression MethodInvocation SimpleName instance
instance SimpleName MethodInvocation SimpleName get name
assert equals SimpleName MethodInvocation StringLiteral mismatched instance name
assert equals SimpleName MethodInvocation SimpleName extension name
assert equals SimpleName MethodInvocation MethodInvocation SimpleName instance
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get name
mismatched instance name StringLiteral MethodInvocation SimpleName extension name
mismatched instance name StringLiteral MethodInvocation MethodInvocation SimpleName instance
mismatched instance name StringLiteral MethodInvocation MethodInvocation SimpleName get name
extension name SimpleName MethodInvocation MethodInvocation SimpleName instance
extension name SimpleName MethodInvocation MethodInvocation SimpleName get name
extension not supported StringLiteral InfixExpression SimpleName extension name
instance SimpleName MethodInvocation SimpleName is supported
assert true SimpleName MethodInvocation InfixExpression StringLiteral extension not supported
assert true SimpleName MethodInvocation InfixExpression SimpleName extension name
assert true SimpleName MethodInvocation MethodInvocation SimpleName instance
assert true SimpleName MethodInvocation MethodInvocation SimpleName is supported
extension not supported StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName instance
extension not supported StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName is supported
extension name SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName instance
extension name SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName is supported
builtin sftp client extensions SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement QualifiedName builtin sftp client extensionsvalues
type SimpleName SingleVariableDeclaration EnhancedForStatement QualifiedName builtin sftp client extensionsvalues
sftp subsystemdefault open ssh extensions QualifiedName EnhancedForStatement Block EnhancedForStatement QualifiedName builtin sftp client extensionsvalues
client SimpleName MethodInvocation SimpleName stop
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test server extensions declarations
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test server extensions declarations
public Modifier MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration SimpleName test server extensions declarations
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
test server extensions declarations SimpleName MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test server extensions declarations
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test server extensions declarations
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
