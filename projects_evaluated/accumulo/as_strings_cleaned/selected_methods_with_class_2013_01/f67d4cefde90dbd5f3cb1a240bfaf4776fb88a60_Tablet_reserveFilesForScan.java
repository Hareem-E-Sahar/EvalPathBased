map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
map SimpleName SimpleType ParameterizedType SimpleType SimpleName data file value
string SimpleName SimpleType ParameterizedType SimpleType SimpleName data file value
pair SimpleName SimpleType ParameterizedType SimpleType SimpleName long
tablet SimpleName ThisExpression MethodInvocation SimpleName wait
tablet SimpleName ThisExpression MethodInvocation NumberLiteral empty
wait SimpleName MethodInvocation NumberLiteral empty
interrupted exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
log SimpleName MethodInvocation SimpleName warn
log SimpleName MethodInvocation SimpleName e
log SimpleName MethodInvocation SimpleName e
warn SimpleName MethodInvocation SimpleName e
warn SimpleName MethodInvocation SimpleName e
e SimpleName MethodInvocation SimpleName e
set SimpleName SimpleType ParameterizedType SimpleType SimpleName path
hash set SimpleName SimpleType ParameterizedType SimpleType SimpleName path
datafile sizes SimpleName MethodInvocation SimpleName key set
abs file paths SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName datafile sizes
abs file paths SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName key set
rid SimpleName VariableDeclarationFragment PostfixExpression SimpleName next scan reservation id
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName rid
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment PostfixExpression SimpleName next scan reservation id
scan file reservations SimpleName MethodInvocation SimpleName put
scan file reservations SimpleName MethodInvocation SimpleName rid
scan file reservations SimpleName MethodInvocation SimpleName abs file paths
put SimpleName MethodInvocation SimpleName rid
put SimpleName MethodInvocation SimpleName abs file paths
rid SimpleName MethodInvocation SimpleName abs file paths
map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
map SimpleName SimpleType ParameterizedType SimpleType SimpleName data file value
string SimpleName SimpleType ParameterizedType SimpleType SimpleName data file value
hash map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
hash map SimpleName SimpleType ParameterizedType SimpleType QualifiedName metadata tabledata file value
string SimpleName SimpleType ParameterizedType SimpleType QualifiedName metadata tabledata file value
path SimpleName SimpleType SingleVariableDeclaration SimpleName path
file scan reference counts SimpleName MethodInvocation SimpleName increment
file scan reference counts SimpleName MethodInvocation SimpleName path
file scan reference counts SimpleName MethodInvocation NumberLiteral empty
increment SimpleName MethodInvocation SimpleName path
increment SimpleName MethodInvocation NumberLiteral empty
path SimpleName MethodInvocation NumberLiteral empty
path SimpleName MethodInvocation SimpleName to string
datafile sizes SimpleName MethodInvocation SimpleName get
datafile sizes SimpleName MethodInvocation SimpleName path
get SimpleName MethodInvocation SimpleName path
ret SimpleName MethodInvocation SimpleName put
ret SimpleName MethodInvocation MethodInvocation SimpleName path
ret SimpleName MethodInvocation MethodInvocation SimpleName to string
ret SimpleName MethodInvocation MethodInvocation SimpleName datafile sizes
ret SimpleName MethodInvocation MethodInvocation SimpleName get
ret SimpleName MethodInvocation MethodInvocation SimpleName path
put SimpleName MethodInvocation MethodInvocation SimpleName path
put SimpleName MethodInvocation MethodInvocation SimpleName to string
put SimpleName MethodInvocation MethodInvocation SimpleName datafile sizes
put SimpleName MethodInvocation MethodInvocation SimpleName get
put SimpleName MethodInvocation MethodInvocation SimpleName path
path SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName datafile sizes
path SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get
path SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName path
to string SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName datafile sizes
to string SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get
to string SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName path
path SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName abs file paths
path SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName abs file paths
map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
map SimpleName SimpleType ParameterizedType SimpleType SimpleName data file value
string SimpleName SimpleType ParameterizedType SimpleType SimpleName data file value
pair SimpleName SimpleType ParameterizedType SimpleType SimpleName long
pair SimpleName SimpleType ParameterizedType ClassInstanceCreation SimpleName rid
long SimpleName SimpleType ParameterizedType ClassInstanceCreation SimpleName rid
pair SimpleName SimpleType ParameterizedType ClassInstanceCreation SimpleName ret
long SimpleName SimpleType ParameterizedType ClassInstanceCreation SimpleName ret
rid SimpleName ClassInstanceCreation SimpleName ret
reservations blocked SimpleName WhileStatement Block VariableDeclarationStatement PrimitiveType long
reservations blocked SimpleName WhileStatement Block EnhancedForStatement SimpleName abs file paths
long PrimitiveType VariableDeclarationStatement Block EnhancedForStatement SimpleName abs file paths
pair SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName reserve files for scan
long SimpleName SimpleType ParameterizedType MethodDeclaration SimpleName reserve files for scan
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration SimpleName reserve files for scan
test SimpleName TypeDeclaration MethodDeclaration SimpleName reserve files for scan