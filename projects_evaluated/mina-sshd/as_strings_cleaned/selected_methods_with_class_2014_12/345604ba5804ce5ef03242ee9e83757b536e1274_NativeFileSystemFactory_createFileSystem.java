session SimpleName SimpleType SingleVariableDeclaration SimpleName session
session SimpleName MethodInvocation SimpleName get username
user name SimpleName VariableDeclarationFragment MethodInvocation SimpleName session
user name SimpleName VariableDeclarationFragment MethodInvocation SimpleName get username
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName user name
home StringLiteral InfixExpression SimpleName user name
home dir str SimpleName VariableDeclarationFragment InfixExpression StringLiteral home
home dir str SimpleName VariableDeclarationFragment InfixExpression SimpleName user name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName home dir str
file SimpleName SimpleType ClassInstanceCreation SimpleName home dir str
home dir SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName file
home dir SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName home dir str
file SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName home dir
home dir SimpleName MethodInvocation SimpleName is file
not a directory :: StringLiteral InfixExpression SimpleName home dir str
log SimpleName MethodInvocation SimpleName warn
log SimpleName MethodInvocation InfixExpression StringLiteral not a directory ::
log SimpleName MethodInvocation InfixExpression SimpleName home dir str
warn SimpleName MethodInvocation InfixExpression StringLiteral not a directory ::
warn SimpleName MethodInvocation InfixExpression SimpleName home dir str
home dir SimpleName MethodInvocation SimpleName exists
home dir SimpleName MethodInvocation SimpleName mkdirs
cannot create user home :: StringLiteral InfixExpression SimpleName home dir str
log SimpleName MethodInvocation SimpleName warn
log SimpleName MethodInvocation InfixExpression StringLiteral cannot create user home ::
log SimpleName MethodInvocation InfixExpression SimpleName home dir str
warn SimpleName MethodInvocation InfixExpression StringLiteral cannot create user home ::
warn SimpleName MethodInvocation InfixExpression SimpleName home dir str
file systems SimpleName MethodInvocation SimpleName get default
public Modifier MethodDeclaration SimpleType SimpleName file system
public Modifier MethodDeclaration SimpleName create file system
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName session
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName session
public Modifier MethodDeclaration Block IfStatement SimpleName create home
file system SimpleName SimpleType MethodDeclaration SimpleName create file system
file system SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName session
create file system SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName session
create file system SimpleName MethodDeclaration SingleVariableDeclaration SimpleName session
create file system SimpleName MethodDeclaration Block IfStatement SimpleName create home
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName file system
public Modifier TypeDeclaration MethodDeclaration SimpleName create file system
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName session
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName file system
test SimpleName TypeDeclaration MethodDeclaration SimpleName create file system
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName session