string SimpleName SimpleType ArrayType SingleVariableDeclaration SimpleName expected
string SimpleName SimpleType SingleVariableDeclaration SimpleName table
client SimpleName MethodInvocation SimpleName create scanner
client SimpleName MethodInvocation SimpleName creds
client SimpleName MethodInvocation SimpleName table test
client SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName scan options
create scanner SimpleName MethodInvocation SimpleName creds
create scanner SimpleName MethodInvocation SimpleName table test
create scanner SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName scan options
creds SimpleName MethodInvocation SimpleName table test
creds SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName scan options
table test SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName scan options
scid SimpleName VariableDeclarationFragment MethodInvocation SimpleName client
scid SimpleName VariableDeclarationFragment MethodInvocation SimpleName create scanner
scid SimpleName VariableDeclarationFragment MethodInvocation SimpleName creds
scid SimpleName VariableDeclarationFragment MethodInvocation SimpleName table test
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName scid
expectedlength QualifiedName InfixExpression NumberLiteral empty
client SimpleName MethodInvocation SimpleName next k
client SimpleName MethodInvocation SimpleName scid
client SimpleName MethodInvocation InfixExpression QualifiedName expectedlength
client SimpleName MethodInvocation InfixExpression NumberLiteral empty
next k SimpleName MethodInvocation SimpleName scid
next k SimpleName MethodInvocation InfixExpression QualifiedName expectedlength
next k SimpleName MethodInvocation InfixExpression NumberLiteral empty
scid SimpleName MethodInvocation InfixExpression QualifiedName expectedlength
scid SimpleName MethodInvocation InfixExpression NumberLiteral empty
key values SimpleName VariableDeclarationFragment MethodInvocation SimpleName client
key values SimpleName VariableDeclarationFragment MethodInvocation SimpleName next k
key values SimpleName VariableDeclarationFragment MethodInvocation SimpleName scid
key values SimpleName VariableDeclarationFragment MethodInvocation InfixExpression QualifiedName expectedlength
key values SimpleName VariableDeclarationFragment MethodInvocation InfixExpression NumberLiteral empty
scan result SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName key values
key valuesresults QualifiedName MethodInvocation SimpleName size
assert equals SimpleName MethodInvocation QualifiedName expectedlength
assert equals SimpleName MethodInvocation MethodInvocation QualifiedName key valuesresults
assert equals SimpleName MethodInvocation MethodInvocation SimpleName size
expectedlength QualifiedName MethodInvocation MethodInvocation QualifiedName key valuesresults
expectedlength QualifiedName MethodInvocation MethodInvocation SimpleName size
assert false SimpleName MethodInvocation QualifiedName key valuesmore
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
key valuesresults QualifiedName MethodInvocation SimpleName size
i SimpleName InfixExpression MethodInvocation QualifiedName key valuesresults
i SimpleName InfixExpression MethodInvocation SimpleName size
expected SimpleName ArrayAccess SimpleName i
expected SimpleName ArrayAccess ArrayAccess NumberLiteral empty
i SimpleName ArrayAccess ArrayAccess NumberLiteral empty
expected SimpleName ArrayAccess SimpleName i
expected SimpleName ArrayAccess ArrayAccess NumberLiteral empty
i SimpleName ArrayAccess ArrayAccess NumberLiteral empty
expected SimpleName ArrayAccess SimpleName i
expected SimpleName ArrayAccess ArrayAccess NumberLiteral empty
i SimpleName ArrayAccess ArrayAccess NumberLiteral empty
expected SimpleName ArrayAccess SimpleName i
expected SimpleName ArrayAccess ArrayAccess NumberLiteral empty
i SimpleName ArrayAccess ArrayAccess NumberLiteral empty
key valuesresults QualifiedName MethodInvocation SimpleName get
key valuesresults QualifiedName MethodInvocation SimpleName i
get SimpleName MethodInvocation SimpleName i
check key SimpleName MethodInvocation ArrayAccess ArrayAccess SimpleName expected
check key SimpleName MethodInvocation ArrayAccess ArrayAccess SimpleName i
check key SimpleName MethodInvocation ArrayAccess NumberLiteral empty
check key SimpleName MethodInvocation ArrayAccess ArrayAccess SimpleName expected
check key SimpleName MethodInvocation ArrayAccess ArrayAccess SimpleName i
check key SimpleName MethodInvocation ArrayAccess NumberLiteral empty
check key SimpleName MethodInvocation ArrayAccess ArrayAccess SimpleName expected
check key SimpleName MethodInvocation ArrayAccess ArrayAccess SimpleName i
check key SimpleName MethodInvocation ArrayAccess NumberLiteral empty
check key SimpleName MethodInvocation ArrayAccess ArrayAccess SimpleName expected
check key SimpleName MethodInvocation ArrayAccess ArrayAccess SimpleName i
check key SimpleName MethodInvocation ArrayAccess NumberLiteral empty
check key SimpleName MethodInvocation MethodInvocation QualifiedName key valuesresults
check key SimpleName MethodInvocation MethodInvocation SimpleName get
check key SimpleName MethodInvocation MethodInvocation SimpleName i
empty NumberLiteral ArrayAccess MethodInvocation ArrayAccess NumberLiteral empty
empty NumberLiteral ArrayAccess MethodInvocation ArrayAccess NumberLiteral empty
empty NumberLiteral ArrayAccess MethodInvocation ArrayAccess NumberLiteral empty
empty NumberLiteral ArrayAccess MethodInvocation MethodInvocation QualifiedName key valuesresults
empty NumberLiteral ArrayAccess MethodInvocation MethodInvocation SimpleName get
empty NumberLiteral ArrayAccess MethodInvocation MethodInvocation SimpleName i
empty NumberLiteral ArrayAccess MethodInvocation ArrayAccess NumberLiteral empty
empty NumberLiteral ArrayAccess MethodInvocation ArrayAccess NumberLiteral empty
empty NumberLiteral ArrayAccess MethodInvocation MethodInvocation QualifiedName key valuesresults
empty NumberLiteral ArrayAccess MethodInvocation MethodInvocation SimpleName get
empty NumberLiteral ArrayAccess MethodInvocation MethodInvocation SimpleName i
empty NumberLiteral ArrayAccess MethodInvocation ArrayAccess NumberLiteral empty
empty NumberLiteral ArrayAccess MethodInvocation MethodInvocation QualifiedName key valuesresults
empty NumberLiteral ArrayAccess MethodInvocation MethodInvocation SimpleName get
empty NumberLiteral ArrayAccess MethodInvocation MethodInvocation SimpleName i
empty NumberLiteral ArrayAccess MethodInvocation MethodInvocation QualifiedName key valuesresults
empty NumberLiteral ArrayAccess MethodInvocation MethodInvocation SimpleName get
empty NumberLiteral ArrayAccess MethodInvocation MethodInvocation SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
client SimpleName MethodInvocation SimpleName close scanner
client SimpleName MethodInvocation SimpleName scid
close scanner SimpleName MethodInvocation SimpleName scid
private Modifier MethodDeclaration PrimitiveType void
private Modifier MethodDeclaration SimpleName assert scan
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName expected
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName table
private Modifier MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration SimpleName assert scan
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName expected
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName table
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
assert scan SimpleName MethodDeclaration SingleVariableDeclaration SimpleName expected
assert scan SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
assert scan SimpleName MethodDeclaration SingleVariableDeclaration SimpleName table
assert scan SimpleName MethodDeclaration SimpleType SimpleName exception
expected SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName table
expected SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
table SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName assert scan
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName expected
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName table
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName assert scan
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName expected
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName table
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
