err StringLiteral InfixExpression SimpleName table name
text SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral err
text SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName table name
m SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName mutation
mutation SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName m
problem type SimpleName MethodInvocation SimpleName name
text SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName problem type
text SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName name
text SimpleName SimpleType ClassInstanceCreation SimpleName resource
m SimpleName MethodInvocation SimpleName put delete
m SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName text
m SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName problem type
m SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName name
m SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName text
m SimpleName MethodInvocation ClassInstanceCreation SimpleName resource
put delete SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName text
put delete SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName problem type
put delete SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName name
put delete SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName text
put delete SimpleName MethodInvocation ClassInstanceCreation SimpleName resource
system credentials SimpleName MethodInvocation SimpleName get
system credentials SimpleName MethodInvocation MethodInvocation SimpleName get as thrift
get SimpleName MethodInvocation MethodInvocation SimpleName get as thrift
metadata table util SimpleName MethodInvocation SimpleName get metadata table
metadata table util SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName system credentials
metadata table util SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get
metadata table util SimpleName MethodInvocation MethodInvocation SimpleName get as thrift
get metadata table SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName system credentials
get metadata table SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get
get metadata table SimpleName MethodInvocation MethodInvocation SimpleName get as thrift
metadata table util SimpleName MethodInvocation MethodInvocation SimpleName update
get metadata table SimpleName MethodInvocation MethodInvocation SimpleName update
get as thrift SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName update
metadata table util SimpleName MethodInvocation MethodInvocation SimpleName m
get metadata table SimpleName MethodInvocation MethodInvocation SimpleName m
get as thrift SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName m
update SimpleName MethodInvocation SimpleName m
void PrimitiveType MethodDeclaration SimpleName remove from metadata table
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
remove from metadata table SimpleName MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName remove from metadata table
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName remove from metadata table
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
