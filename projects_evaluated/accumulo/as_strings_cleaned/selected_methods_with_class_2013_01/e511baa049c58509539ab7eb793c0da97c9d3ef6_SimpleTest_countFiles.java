string SimpleName SimpleType SingleVariableDeclaration SimpleName table
map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
string SimpleName SimpleType ParameterizedType SimpleType SimpleName string
client SimpleName MethodInvocation SimpleName table id map
client SimpleName MethodInvocation SimpleName creds
table id map SimpleName MethodInvocation SimpleName creds
table id map SimpleName VariableDeclarationFragment MethodInvocation SimpleName client
table id map SimpleName VariableDeclarationFragment MethodInvocation SimpleName table id map
table id map SimpleName VariableDeclarationFragment MethodInvocation SimpleName creds
table id map SimpleName MethodInvocation SimpleName get
table id map SimpleName MethodInvocation SimpleName table
get SimpleName MethodInvocation SimpleName table
table id SimpleName VariableDeclarationFragment MethodInvocation SimpleName table id map
table id SimpleName VariableDeclarationFragment MethodInvocation SimpleName get
table id SimpleName VariableDeclarationFragment MethodInvocation SimpleName table
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table id
start SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName key
key SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName start
table id SimpleName InfixExpression StringLiteral 
s bb SimpleName MethodInvocation InfixExpression SimpleName table id
s bb SimpleName MethodInvocation InfixExpression StringLiteral 
startrow QualifiedName Assignment MethodInvocation SimpleName s bb
startrow QualifiedName Assignment MethodInvocation InfixExpression SimpleName table id
startrow QualifiedName Assignment MethodInvocation InfixExpression StringLiteral 
end SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName key
key SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName end
table id SimpleName InfixExpression StringLiteral <
s bb SimpleName MethodInvocation InfixExpression SimpleName table id
s bb SimpleName MethodInvocation InfixExpression StringLiteral <
endrow QualifiedName Assignment MethodInvocation SimpleName s bb
endrow QualifiedName Assignment MethodInvocation InfixExpression SimpleName table id
endrow QualifiedName Assignment MethodInvocation InfixExpression StringLiteral <
client SimpleName MethodInvocation SimpleName get following
client SimpleName MethodInvocation SimpleName end
client SimpleName MethodInvocation QualifiedName partial keyrow
get following SimpleName MethodInvocation SimpleName end
get following SimpleName MethodInvocation QualifiedName partial keyrow
end SimpleName MethodInvocation QualifiedName partial keyrow
end SimpleName Assignment MethodInvocation SimpleName client
end SimpleName Assignment MethodInvocation SimpleName get following
end SimpleName Assignment MethodInvocation SimpleName end
end SimpleName Assignment MethodInvocation QualifiedName partial keyrow
opt SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName scan options
scan options SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName opt
range SimpleName SimpleType ClassInstanceCreation SimpleName start
range SimpleName SimpleType ClassInstanceCreation BooleanLiteral true
range SimpleName SimpleType ClassInstanceCreation SimpleName end
range SimpleName SimpleType ClassInstanceCreation BooleanLiteral false
start SimpleName ClassInstanceCreation BooleanLiteral true
start SimpleName ClassInstanceCreation SimpleName end
start SimpleName ClassInstanceCreation BooleanLiteral false
true BooleanLiteral ClassInstanceCreation SimpleName end
true BooleanLiteral ClassInstanceCreation BooleanLiteral false
end SimpleName ClassInstanceCreation BooleanLiteral false
optrange QualifiedName Assignment ClassInstanceCreation SimpleType SimpleName range
optrange QualifiedName Assignment ClassInstanceCreation SimpleName start
optrange QualifiedName Assignment ClassInstanceCreation BooleanLiteral true
optrange QualifiedName Assignment ClassInstanceCreation SimpleName end
optrange QualifiedName Assignment ClassInstanceCreation BooleanLiteral false
s bb SimpleName MethodInvocation StringLiteral file
scan column SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName s bb
scan column SimpleName SimpleType ClassInstanceCreation MethodInvocation StringLiteral file
collections SimpleName MethodInvocation SimpleName singleton list
collections SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName scan column
collections SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName s bb
collections SimpleName MethodInvocation ClassInstanceCreation MethodInvocation StringLiteral file
singleton list SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName scan column
singleton list SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName s bb
singleton list SimpleName MethodInvocation ClassInstanceCreation MethodInvocation StringLiteral file
optcolumns QualifiedName Assignment MethodInvocation SimpleName collections
optcolumns QualifiedName Assignment MethodInvocation SimpleName singleton list
client SimpleName MethodInvocation SimpleName create scanner
client SimpleName MethodInvocation SimpleName creds
client SimpleName MethodInvocation QualifiedName constantsmetadata table name
client SimpleName MethodInvocation SimpleName opt
create scanner SimpleName MethodInvocation SimpleName creds
create scanner SimpleName MethodInvocation QualifiedName constantsmetadata table name
create scanner SimpleName MethodInvocation SimpleName opt
creds SimpleName MethodInvocation QualifiedName constantsmetadata table name
creds SimpleName MethodInvocation SimpleName opt
constantsmetadata table name QualifiedName MethodInvocation SimpleName opt
scanner SimpleName VariableDeclarationFragment MethodInvocation SimpleName client
scanner SimpleName VariableDeclarationFragment MethodInvocation SimpleName create scanner
scanner SimpleName VariableDeclarationFragment MethodInvocation SimpleName creds
scanner SimpleName VariableDeclarationFragment MethodInvocation QualifiedName constantsmetadata table name
scanner SimpleName VariableDeclarationFragment MethodInvocation SimpleName opt
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName scanner
result SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName result
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment NumberLiteral empty
client SimpleName MethodInvocation SimpleName next k
client SimpleName MethodInvocation SimpleName scanner
client SimpleName MethodInvocation NumberLiteral empty
next k SimpleName MethodInvocation SimpleName scanner
next k SimpleName MethodInvocation NumberLiteral empty
scanner SimpleName MethodInvocation NumberLiteral empty
more SimpleName VariableDeclarationFragment MethodInvocation SimpleName client
more SimpleName VariableDeclarationFragment MethodInvocation SimpleName next k
more SimpleName VariableDeclarationFragment MethodInvocation SimpleName scanner
more SimpleName VariableDeclarationFragment MethodInvocation NumberLiteral empty
scan result SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName more
more SimpleName MethodInvocation SimpleName get results
more SimpleName MethodInvocation MethodInvocation SimpleName size
get results SimpleName MethodInvocation MethodInvocation SimpleName size
result SimpleName Assignment MethodInvocation MethodInvocation SimpleName more
result SimpleName Assignment MethodInvocation MethodInvocation SimpleName get results
result SimpleName Assignment MethodInvocation SimpleName size
int PrimitiveType VariableDeclarationStatement Block WhileStatement BooleanLiteral true
int PrimitiveType VariableDeclarationStatement Block ReturnStatement SimpleName result
true BooleanLiteral WhileStatement Block ReturnStatement SimpleName result
private Modifier MethodDeclaration PrimitiveType int
private Modifier MethodDeclaration SimpleName count files
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName table
private Modifier MethodDeclaration SimpleType SimpleName exception
private Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
private Modifier MethodDeclaration Block WhileStatement BooleanLiteral true
private Modifier MethodDeclaration Block ReturnStatement SimpleName result
int PrimitiveType MethodDeclaration SimpleName count files
int PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
int PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName table
int PrimitiveType MethodDeclaration SimpleType SimpleName exception
int PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
int PrimitiveType MethodDeclaration Block WhileStatement BooleanLiteral true
int PrimitiveType MethodDeclaration Block ReturnStatement SimpleName result
count files SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
count files SimpleName MethodDeclaration SingleVariableDeclaration SimpleName table
count files SimpleName MethodDeclaration SimpleType SimpleName exception
count files SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
count files SimpleName MethodDeclaration Block WhileStatement BooleanLiteral true
count files SimpleName MethodDeclaration Block ReturnStatement SimpleName result
table SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration PrimitiveType int
public Modifier TypeDeclaration MethodDeclaration SimpleName count files
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName table
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType int
test SimpleName TypeDeclaration MethodDeclaration SimpleName count files
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName table
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception