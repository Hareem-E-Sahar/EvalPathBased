session SimpleName SimpleType SingleVariableDeclaration SimpleName session
boolean PrimitiveType SingleVariableDeclaration SimpleName reserve
random SimpleName MethodInvocation SimpleName next long
sid SimpleName VariableDeclarationFragment MethodInvocation SimpleName random
sid SimpleName VariableDeclarationFragment MethodInvocation SimpleName next long
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName sid
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName random
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName next long
sessions SimpleName MethodInvocation SimpleName contains key
sessions SimpleName MethodInvocation SimpleName sid
contains key SimpleName MethodInvocation SimpleName sid
random SimpleName MethodInvocation SimpleName next long
sid SimpleName Assignment MethodInvocation SimpleName random
sid SimpleName Assignment MethodInvocation SimpleName next long
sessions SimpleName MethodInvocation SimpleName put
sessions SimpleName MethodInvocation SimpleName sid
sessions SimpleName MethodInvocation SimpleName session
put SimpleName MethodInvocation SimpleName sid
put SimpleName MethodInvocation SimpleName session
sid SimpleName MethodInvocation SimpleName session
sessionreserved QualifiedName Assignment SimpleName reserve
system SimpleName MethodInvocation SimpleName current time millis
sessionlast access time QualifiedName Assignment MethodInvocation SimpleName system
sessionlast access time QualifiedName Assignment MethodInvocation SimpleName current time millis
sessionstart time QualifiedName Assignment Assignment QualifiedName sessionlast access time
sessionstart time QualifiedName Assignment Assignment MethodInvocation SimpleName system
sessionstart time QualifiedName Assignment Assignment MethodInvocation SimpleName current time millis
long PrimitiveType VariableDeclarationStatement Block ReturnStatement SimpleName sid
synchronized Modifier MethodDeclaration PrimitiveType long
synchronized Modifier MethodDeclaration SimpleName create session
synchronized Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName session
synchronized Modifier MethodDeclaration SingleVariableDeclaration SimpleName session
synchronized Modifier MethodDeclaration SingleVariableDeclaration PrimitiveType boolean
synchronized Modifier MethodDeclaration SingleVariableDeclaration SimpleName reserve
synchronized Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType long
synchronized Modifier MethodDeclaration Block ReturnStatement SimpleName sid
long PrimitiveType MethodDeclaration SimpleName create session
long PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName session
long PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName session
long PrimitiveType MethodDeclaration SingleVariableDeclaration PrimitiveType boolean
long PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName reserve
long PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType long
long PrimitiveType MethodDeclaration Block ReturnStatement SimpleName sid
create session SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName session
create session SimpleName MethodDeclaration SingleVariableDeclaration SimpleName session
create session SimpleName MethodDeclaration SingleVariableDeclaration PrimitiveType boolean
create session SimpleName MethodDeclaration SingleVariableDeclaration SimpleName reserve
create session SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType long
create session SimpleName MethodDeclaration Block ReturnStatement SimpleName sid
session SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType boolean
session SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName reserve
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier synchronized
public Modifier TypeDeclaration MethodDeclaration PrimitiveType long
public Modifier TypeDeclaration MethodDeclaration SimpleName create session
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName session
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType boolean
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName reserve
test SimpleName TypeDeclaration MethodDeclaration Modifier synchronized
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType long
test SimpleName TypeDeclaration MethodDeclaration SimpleName create session
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName session
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType boolean
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName reserve