connector SimpleName SimpleType SingleVariableDeclaration SimpleName conn
string SimpleName SimpleType SingleVariableDeclaration SimpleName table
authorizations SimpleName SimpleType SingleVariableDeclaration SimpleName auths
int PrimitiveType SingleVariableDeclaration SimpleName batch size
text SimpleName SimpleType SingleVariableDeclaration SimpleName prev end row
text SimpleName SimpleType SingleVariableDeclaration SimpleName end row
string SimpleName SimpleType ArrayType SingleVariableDeclaration SimpleName columns
conn SimpleName MethodInvocation SimpleName create scanner
conn SimpleName MethodInvocation SimpleName table
conn SimpleName MethodInvocation SimpleName auths
create scanner SimpleName MethodInvocation SimpleName table
create scanner SimpleName MethodInvocation SimpleName auths
table SimpleName MethodInvocation SimpleName auths
scanner SimpleName VariableDeclarationFragment MethodInvocation SimpleName conn
scanner SimpleName VariableDeclarationFragment MethodInvocation SimpleName create scanner
scanner SimpleName VariableDeclarationFragment MethodInvocation SimpleName table
scanner SimpleName VariableDeclarationFragment MethodInvocation SimpleName auths
scanner SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName scanner
scanner SimpleName MethodInvocation SimpleName set batch size
scanner SimpleName MethodInvocation SimpleName batch size
set batch size SimpleName MethodInvocation SimpleName batch size
range SimpleName SimpleType ClassInstanceCreation SimpleName prev end row
range SimpleName SimpleType ClassInstanceCreation BooleanLiteral false
range SimpleName SimpleType ClassInstanceCreation SimpleName end row
range SimpleName SimpleType ClassInstanceCreation BooleanLiteral true
prev end row SimpleName ClassInstanceCreation BooleanLiteral false
prev end row SimpleName ClassInstanceCreation SimpleName end row
prev end row SimpleName ClassInstanceCreation BooleanLiteral true
false BooleanLiteral ClassInstanceCreation SimpleName end row
false BooleanLiteral ClassInstanceCreation BooleanLiteral true
end row SimpleName ClassInstanceCreation BooleanLiteral true
scanner SimpleName MethodInvocation SimpleName set range
scanner SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName range
scanner SimpleName MethodInvocation ClassInstanceCreation SimpleName prev end row
scanner SimpleName MethodInvocation ClassInstanceCreation BooleanLiteral false
scanner SimpleName MethodInvocation ClassInstanceCreation SimpleName end row
scanner SimpleName MethodInvocation ClassInstanceCreation BooleanLiteral true
set range SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName range
set range SimpleName MethodInvocation ClassInstanceCreation SimpleName prev end row
set range SimpleName MethodInvocation ClassInstanceCreation BooleanLiteral false
set range SimpleName MethodInvocation ClassInstanceCreation SimpleName end row
set range SimpleName MethodInvocation ClassInstanceCreation BooleanLiteral true
string SimpleName SimpleType SingleVariableDeclaration SimpleName c
text SimpleName SimpleType ClassInstanceCreation SimpleName c
scanner SimpleName MethodInvocation SimpleName fetch column family
scanner SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName text
scanner SimpleName MethodInvocation ClassInstanceCreation SimpleName c
fetch column family SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName text
fetch column family SimpleName MethodInvocation ClassInstanceCreation SimpleName c
string SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName columns
c SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName columns
count SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName count
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment NumberLiteral empty
entry SimpleName SimpleType ParameterizedType SimpleType SimpleName key
entry SimpleName SimpleType ParameterizedType SimpleType SimpleName value
key SimpleName SimpleType ParameterizedType SimpleType SimpleName value
entry SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName entry
key SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName entry
value SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName entry
entry SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName scanner
columns SimpleName EnhancedForStatement Block VariableDeclarationStatement PrimitiveType int
columns SimpleName EnhancedForStatement Block EnhancedForStatement SimpleName scanner
columns SimpleName EnhancedForStatement Block ReturnStatement SimpleName count
int PrimitiveType VariableDeclarationStatement Block EnhancedForStatement SimpleName scanner
int PrimitiveType VariableDeclarationStatement Block ReturnStatement SimpleName count
scanner SimpleName EnhancedForStatement Block ReturnStatement SimpleName count
private Modifier MethodDeclaration Modifier static
private Modifier MethodDeclaration PrimitiveType int
private Modifier MethodDeclaration SimpleName scan tablet
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName connector
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName conn
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName table
static Modifier MethodDeclaration PrimitiveType int
static Modifier MethodDeclaration SimpleName scan tablet
static Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName connector
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName conn
static Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName table
static Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName authorizations
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName auths
int PrimitiveType MethodDeclaration SimpleName scan tablet
int PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName connector
int PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName conn
int PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
int PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName table
int PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName authorizations
int PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName auths
int PrimitiveType MethodDeclaration SingleVariableDeclaration PrimitiveType int
int PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName batch size
scan tablet SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName connector
scan tablet SimpleName MethodDeclaration SingleVariableDeclaration SimpleName conn
scan tablet SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
scan tablet SimpleName MethodDeclaration SingleVariableDeclaration SimpleName table
scan tablet SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName authorizations
scan tablet SimpleName MethodDeclaration SingleVariableDeclaration SimpleName auths
scan tablet SimpleName MethodDeclaration SingleVariableDeclaration PrimitiveType int
scan tablet SimpleName MethodDeclaration SingleVariableDeclaration SimpleName batch size
scan tablet SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName text
scan tablet SimpleName MethodDeclaration SingleVariableDeclaration SimpleName prev end row
conn SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName table
conn SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName auths
conn SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
conn SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName batch size
conn SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName prev end row
conn SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName end row
table SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName auths
table SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
table SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName batch size
table SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName prev end row
table SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName end row
table SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName columns
auths SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
auths SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName batch size
auths SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName prev end row
auths SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName end row
auths SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName columns
auths SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
int PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName prev end row
batch size SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName prev end row
int PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName end row
batch size SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName end row
int PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName columns
batch size SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName columns
int PrimitiveType SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
batch size SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
prev end row SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName end row
prev end row SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName columns
prev end row SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
end row SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName columns
end row SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
columns SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration Modifier static
public Modifier TypeDeclaration MethodDeclaration PrimitiveType int
public Modifier TypeDeclaration MethodDeclaration SimpleName scan tablet
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName conn
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName table
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName auths
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName batch size
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName prev end row
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName end row
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName columns
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration Modifier static
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType int
test SimpleName TypeDeclaration MethodDeclaration SimpleName scan tablet
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName conn
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName table
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName auths
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType int
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName batch size
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName prev end row
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName end row
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName columns
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
