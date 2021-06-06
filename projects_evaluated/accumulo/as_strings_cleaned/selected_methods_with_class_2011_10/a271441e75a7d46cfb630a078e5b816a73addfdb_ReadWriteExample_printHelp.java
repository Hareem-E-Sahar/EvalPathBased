hf SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName help formatter
help formatter SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName hf
instance opt SimpleName MethodInvocation SimpleName set arg name
instance opt SimpleName MethodInvocation StringLiteral name
set arg name SimpleName MethodInvocation StringLiteral name
zoo keepers opt SimpleName MethodInvocation SimpleName set arg name
zoo keepers opt SimpleName MethodInvocation StringLiteral hosts
set arg name SimpleName MethodInvocation StringLiteral hosts
username opt SimpleName MethodInvocation SimpleName set arg name
username opt SimpleName MethodInvocation StringLiteral user
set arg name SimpleName MethodInvocation StringLiteral user
password opt SimpleName MethodInvocation SimpleName set arg name
password opt SimpleName MethodInvocation StringLiteral pass
set arg name SimpleName MethodInvocation StringLiteral pass
scan auths opt SimpleName MethodInvocation SimpleName set arg name
scan auths opt SimpleName MethodInvocation StringLiteral scanauths
set arg name SimpleName MethodInvocation StringLiteral scanauths
table name opt SimpleName MethodInvocation SimpleName set arg name
table name opt SimpleName MethodInvocation StringLiteral name
set arg name SimpleName MethodInvocation StringLiteral name
hf SimpleName MethodInvocation SimpleName print help
hf SimpleName MethodInvocation StringLiteral accumulo accumuloexamplesclientread write example
hf SimpleName MethodInvocation SimpleName opts
hf SimpleName MethodInvocation BooleanLiteral true
print help SimpleName MethodInvocation StringLiteral accumulo accumuloexamplesclientread write example
print help SimpleName MethodInvocation SimpleName opts
print help SimpleName MethodInvocation BooleanLiteral true
accumulo accumuloexamplesclientread write example StringLiteral MethodInvocation SimpleName opts
accumulo accumuloexamplesclientread write example StringLiteral MethodInvocation BooleanLiteral true
opts SimpleName MethodInvocation BooleanLiteral true
private Modifier MethodDeclaration PrimitiveType void
private Modifier MethodDeclaration SimpleName print help
void PrimitiveType MethodDeclaration SimpleName print help
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName print help
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName print help
