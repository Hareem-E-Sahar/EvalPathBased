object SimpleName SimpleType SingleVariableDeclaration SimpleName new item
check item type SimpleName MethodInvocation SimpleName new item
array list SimpleName SimpleType ClassInstanceCreation NumberLiteral empty
item list SimpleName Assignment ClassInstanceCreation SimpleType SimpleName array list
item list SimpleName Assignment ClassInstanceCreation NumberLiteral empty
clear SimpleName MethodInvocation SimpleName item list
remove if needed SimpleName MethodInvocation SimpleName new item
item SimpleName VariableDeclarationFragment MethodInvocation SimpleName remove if needed
item SimpleName VariableDeclarationFragment MethodInvocation SimpleName new item
svg item SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName item
item list SimpleName MethodInvocation SimpleName add
item list SimpleName MethodInvocation SimpleName item
add SimpleName MethodInvocation SimpleName item
item SimpleName MethodInvocation SimpleName set parent
protected Modifier MethodDeclaration SimpleType SimpleName svg item
protected Modifier MethodDeclaration SimpleName initialize impl
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName object
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleName new item
protected Modifier MethodDeclaration SimpleType SimpleName dom exception
protected Modifier MethodDeclaration SimpleType SimpleName svg exception
svg item SimpleName SimpleType MethodDeclaration SimpleName initialize impl
svg item SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName new item
svg item SimpleName SimpleType MethodDeclaration SimpleType SimpleName dom exception
svg item SimpleName SimpleType MethodDeclaration SimpleType SimpleName svg exception
initialize impl SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName object
initialize impl SimpleName MethodDeclaration SingleVariableDeclaration SimpleName new item
initialize impl SimpleName MethodDeclaration SimpleType SimpleName dom exception
initialize impl SimpleName MethodDeclaration SimpleType SimpleName svg exception
initialize impl SimpleName MethodDeclaration Block ReturnStatement SimpleName item
new item SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName dom exception
new item SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName svg exception
dom exception SimpleName SimpleType MethodDeclaration SimpleType SimpleName svg exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier protected
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName svg item
public Modifier TypeDeclaration MethodDeclaration SimpleName initialize impl
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName new item
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName dom exception
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName svg exception
test SimpleName TypeDeclaration MethodDeclaration Modifier protected
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName svg item
test SimpleName TypeDeclaration MethodDeclaration SimpleName initialize impl
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName new item
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName dom exception
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName svg exception