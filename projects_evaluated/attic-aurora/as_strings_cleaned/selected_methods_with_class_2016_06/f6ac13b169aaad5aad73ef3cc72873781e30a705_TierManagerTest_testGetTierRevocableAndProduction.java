task config SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName set tier
task config SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName revocable tier name
set tier SimpleName MethodInvocation SimpleName revocable tier name
set tier SimpleName MethodInvocation MethodInvocation SimpleName set production
revocable tier name SimpleName MethodInvocation MethodInvocation SimpleName set production
set tier SimpleName MethodInvocation MethodInvocation BooleanLiteral true
revocable tier name SimpleName MethodInvocation MethodInvocation BooleanLiteral true
set production SimpleName MethodInvocation BooleanLiteral true
i task config SimpleName MethodInvocation SimpleName build
i task config SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName set tier
i task config SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName revocable tier name
i task config SimpleName MethodInvocation MethodInvocation SimpleName set production
i task config SimpleName MethodInvocation MethodInvocation BooleanLiteral true
build SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName set tier
build SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName revocable tier name
build SimpleName MethodInvocation MethodInvocation SimpleName set production
build SimpleName MethodInvocation MethodInvocation BooleanLiteral true
tier manager SimpleName MethodInvocation SimpleName get tier
tier manager SimpleName MethodInvocation MethodInvocation SimpleName i task config
tier manager SimpleName MethodInvocation MethodInvocation SimpleName build
tier manager SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName set production
tier manager SimpleName MethodInvocation MethodInvocation MethodInvocation BooleanLiteral true
get tier SimpleName MethodInvocation MethodInvocation SimpleName i task config
get tier SimpleName MethodInvocation MethodInvocation SimpleName build
get tier SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName set production
get tier SimpleName MethodInvocation MethodInvocation MethodInvocation BooleanLiteral true
assert equals SimpleName MethodInvocation SimpleName revocable tier
assert equals SimpleName MethodInvocation MethodInvocation SimpleName tier manager
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get tier
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName i task config
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName build
revocable tier SimpleName MethodInvocation MethodInvocation SimpleName tier manager
revocable tier SimpleName MethodInvocation MethodInvocation SimpleName get tier
revocable tier SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName i task config
revocable tier SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName build
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test get tier revocable and production
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test get tier revocable and production
void PrimitiveType MethodDeclaration SimpleName test get tier revocable and production
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test get tier revocable and production
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test get tier revocable and production
