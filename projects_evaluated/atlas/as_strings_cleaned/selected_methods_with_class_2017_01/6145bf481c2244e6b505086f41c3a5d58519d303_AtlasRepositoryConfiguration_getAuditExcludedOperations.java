list SimpleName SimpleType ParameterizedType SimpleType SimpleName string
configuration SimpleName SimpleType SingleVariableDeclaration SimpleName config
application properties SimpleName MethodInvocation SimpleName get
config SimpleName Assignment MethodInvocation SimpleName application properties
config SimpleName Assignment MethodInvocation SimpleName get
atlas exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
log SimpleName MethodInvocation SimpleName error
log SimpleName MethodInvocation StringLiteral error reading operations for auditing
log SimpleName MethodInvocation SimpleName e
error SimpleName MethodInvocation StringLiteral error reading operations for auditing
error SimpleName MethodInvocation SimpleName e
error reading operations for auditing StringLiteral MethodInvocation SimpleName e
array list SimpleName SimpleType ParameterizedType SimpleType SimpleName string
config SimpleName MethodInvocation SimpleName get string array
config SimpleName MethodInvocation SimpleName audit excluded operations
get string array SimpleName MethodInvocation SimpleName audit excluded operations
skip audit for operations SimpleName VariableDeclarationFragment MethodInvocation SimpleName config
skip audit for operations SimpleName VariableDeclarationFragment MethodInvocation SimpleName get string array
skip audit for operations SimpleName VariableDeclarationFragment MethodInvocation SimpleName audit excluded operations
skip audit for operationslength QualifiedName InfixExpression NumberLiteral empty
skip audit for operations SimpleName InfixExpression InfixExpression InfixExpression QualifiedName skip audit for operationslength
skip audit for operations SimpleName InfixExpression InfixExpression InfixExpression NumberLiteral empty
string SimpleName SimpleType SingleVariableDeclaration SimpleName skipped operation
skipped operation SimpleName MethodInvocation SimpleName trim
skipped operation SimpleName MethodInvocation MethodInvocation SimpleName to lower case
trim SimpleName MethodInvocation MethodInvocation SimpleName to lower case
skipped operation SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName split
trim SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName split
to lower case SimpleName MethodInvocation MethodInvocation SimpleName split
skipped operation SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName separator
trim SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName separator
to lower case SimpleName MethodInvocation MethodInvocation SimpleName separator
split SimpleName MethodInvocation SimpleName separator
excluded operations SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName to lower case
excluded operations SimpleName VariableDeclarationFragment MethodInvocation SimpleName split
excluded operations SimpleName VariableDeclarationFragment MethodInvocation SimpleName separator
excluded operationslength QualifiedName InfixExpression NumberLiteral empty
excluded operations SimpleName InfixExpression InfixExpression InfixExpression QualifiedName excluded operationslength
excluded operations SimpleName InfixExpression InfixExpression InfixExpression NumberLiteral empty
skipped operation SimpleName MethodInvocation SimpleName to lower case
skipped operations SimpleName MethodInvocation SimpleName add
skipped operations SimpleName MethodInvocation MethodInvocation SimpleName skipped operation
skipped operations SimpleName MethodInvocation MethodInvocation SimpleName to lower case
add SimpleName MethodInvocation MethodInvocation SimpleName skipped operation
add SimpleName MethodInvocation MethodInvocation SimpleName to lower case
log SimpleName MethodInvocation SimpleName error
log SimpleName MethodInvocation StringLiteral invalid format for skipped operation {}. valid format is http methodurl eg getversion
log SimpleName MethodInvocation SimpleName skipped operation
error SimpleName MethodInvocation StringLiteral invalid format for skipped operation {}. valid format is http methodurl eg getversion
error SimpleName MethodInvocation SimpleName skipped operation
invalid format for skipped operation {}. valid format is http methodurl eg getversion StringLiteral MethodInvocation SimpleName skipped operation
string SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName skip audit for operations
skipped operation SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName skip audit for operations
public Modifier MethodDeclaration Modifier static
public Modifier MethodDeclaration ParameterizedType SimpleType SimpleName list
public Modifier MethodDeclaration ParameterizedType SimpleType SimpleName string
public Modifier MethodDeclaration SimpleName get audit excluded operations
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName configuration
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName config
public Modifier MethodDeclaration Block ReturnStatement SimpleName skipped operations
static Modifier MethodDeclaration ParameterizedType SimpleType SimpleName list
static Modifier MethodDeclaration ParameterizedType SimpleType SimpleName string
static Modifier MethodDeclaration SimpleName get audit excluded operations
static Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName configuration
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName config
static Modifier MethodDeclaration Block ReturnStatement SimpleName skipped operations
list SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName get audit excluded operations
string SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName get audit excluded operations
get audit excluded operations SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName configuration
get audit excluded operations SimpleName MethodDeclaration SingleVariableDeclaration SimpleName config
get audit excluded operations SimpleName MethodDeclaration Block ReturnStatement SimpleName skipped operations
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration Modifier static
public Modifier TypeDeclaration MethodDeclaration SimpleName get audit excluded operations
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName config
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration Modifier static
test SimpleName TypeDeclaration MethodDeclaration SimpleName get audit excluded operations
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName config
