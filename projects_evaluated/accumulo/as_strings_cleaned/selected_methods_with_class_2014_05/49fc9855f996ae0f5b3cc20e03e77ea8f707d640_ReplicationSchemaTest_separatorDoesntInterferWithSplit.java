buff SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName text
text SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName buff
i SimpleName VariableDeclarationFragment NumberLiteral empty
long PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
long PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression NumberLiteral empty
order section SimpleName MethodInvocation SimpleName create mutation
order section SimpleName MethodInvocation StringLiteral accumulofile
order section SimpleName MethodInvocation SimpleName i
create mutation SimpleName MethodInvocation StringLiteral accumulofile
create mutation SimpleName MethodInvocation SimpleName i
accumulofile StringLiteral MethodInvocation SimpleName i
m SimpleName VariableDeclarationFragment MethodInvocation SimpleName order section
m SimpleName VariableDeclarationFragment MethodInvocation SimpleName create mutation
m SimpleName VariableDeclarationFragment MethodInvocation StringLiteral accumulofile
m SimpleName VariableDeclarationFragment MethodInvocation SimpleName i
mutation SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName m
m SimpleName MethodInvocation SimpleName get row
text SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName m
text SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get row
k SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName key
key SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName k
order section SimpleName MethodInvocation SimpleName get file
order section SimpleName MethodInvocation SimpleName k
order section SimpleName MethodInvocation SimpleName buff
get file SimpleName MethodInvocation SimpleName k
get file SimpleName MethodInvocation SimpleName buff
k SimpleName MethodInvocation SimpleName buff
assert SimpleName MethodInvocation SimpleName assert equals
assert SimpleName MethodInvocation StringLiteral accumulofile
assert SimpleName MethodInvocation MethodInvocation SimpleName order section
assert SimpleName MethodInvocation MethodInvocation SimpleName get file
assert SimpleName MethodInvocation MethodInvocation SimpleName k
assert SimpleName MethodInvocation MethodInvocation SimpleName buff
assert equals SimpleName MethodInvocation StringLiteral accumulofile
assert equals SimpleName MethodInvocation MethodInvocation SimpleName order section
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get file
assert equals SimpleName MethodInvocation MethodInvocation SimpleName k
assert equals SimpleName MethodInvocation MethodInvocation SimpleName buff
accumulofile StringLiteral MethodInvocation MethodInvocation SimpleName order section
accumulofile StringLiteral MethodInvocation MethodInvocation SimpleName get file
accumulofile StringLiteral MethodInvocation MethodInvocation SimpleName k
accumulofile StringLiteral MethodInvocation MethodInvocation SimpleName buff
order section SimpleName MethodInvocation SimpleName get time closed
order section SimpleName MethodInvocation SimpleName k
order section SimpleName MethodInvocation SimpleName buff
get time closed SimpleName MethodInvocation SimpleName k
get time closed SimpleName MethodInvocation SimpleName buff
k SimpleName MethodInvocation SimpleName buff
assert SimpleName MethodInvocation SimpleName assert equals
assert SimpleName MethodInvocation SimpleName i
assert SimpleName MethodInvocation MethodInvocation SimpleName order section
assert SimpleName MethodInvocation MethodInvocation SimpleName get time closed
assert SimpleName MethodInvocation MethodInvocation SimpleName k
assert SimpleName MethodInvocation MethodInvocation SimpleName buff
assert equals SimpleName MethodInvocation SimpleName i
assert equals SimpleName MethodInvocation MethodInvocation SimpleName order section
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get time closed
assert equals SimpleName MethodInvocation MethodInvocation SimpleName k
assert equals SimpleName MethodInvocation MethodInvocation SimpleName buff
i SimpleName MethodInvocation MethodInvocation SimpleName order section
i SimpleName MethodInvocation MethodInvocation SimpleName get time closed
i SimpleName MethodInvocation MethodInvocation SimpleName k
i SimpleName MethodInvocation MethodInvocation SimpleName buff
long PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
long PrimitiveType VariableDeclarationExpression ForStatement InfixExpression NumberLiteral empty
long PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
empty NumberLiteral InfixExpression ForStatement PostfixExpression SimpleName i
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName separator doesnt interfer with split
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName separator doesnt interfer with split
void PrimitiveType MethodDeclaration SimpleName separator doesnt interfer with split
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName separator doesnt interfer with split
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName separator doesnt interfer with split
