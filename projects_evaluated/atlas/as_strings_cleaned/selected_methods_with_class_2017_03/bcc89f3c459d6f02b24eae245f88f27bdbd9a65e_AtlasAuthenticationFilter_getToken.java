http servlet request SimpleName SimpleType SingleVariableDeclaration SimpleName request
authentication token SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName token
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName token str
request SimpleName MethodInvocation SimpleName get cookies
cookies SimpleName VariableDeclarationFragment MethodInvocation SimpleName request
cookies SimpleName VariableDeclarationFragment MethodInvocation SimpleName get cookies
cookie SimpleName SimpleType SingleVariableDeclaration SimpleName cookie
cookie SimpleName MethodInvocation SimpleName get name
cookie SimpleName MethodInvocation MethodInvocation SimpleName equals
get name SimpleName MethodInvocation MethodInvocation SimpleName equals
cookie SimpleName MethodInvocation MethodInvocation QualifiedName authenticated urlauth cookie
get name SimpleName MethodInvocation MethodInvocation QualifiedName authenticated urlauth cookie
equals SimpleName MethodInvocation QualifiedName authenticated urlauth cookie
cookie SimpleName MethodInvocation SimpleName get value
token str SimpleName Assignment MethodInvocation SimpleName cookie
token str SimpleName Assignment MethodInvocation SimpleName get value
signer SimpleName FieldAccess MethodInvocation SimpleName verify and extract
signer SimpleName FieldAccess MethodInvocation SimpleName token str
verify and extract SimpleName MethodInvocation SimpleName token str
token str SimpleName Assignment MethodInvocation FieldAccess SimpleName signer
token str SimpleName Assignment MethodInvocation SimpleName verify and extract
token str SimpleName Assignment MethodInvocation SimpleName token str
signer exception SimpleName SimpleType SingleVariableDeclaration SimpleName ex
authentication exception SimpleName SimpleType ClassInstanceCreation SimpleName ex
cookie SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName cookies
cookie SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName cookies
authentication token SimpleName MethodInvocation SimpleName parse
authentication token SimpleName MethodInvocation SimpleName token str
parse SimpleName MethodInvocation SimpleName token str
token SimpleName Assignment MethodInvocation SimpleName authentication token
token SimpleName Assignment MethodInvocation SimpleName parse
token SimpleName Assignment MethodInvocation SimpleName token str
auth handler SimpleName VariableDeclarationFragment MethodInvocation SimpleName get authentication handler
authentication handler SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName auth handler
token SimpleName MethodInvocation SimpleName get type
auth handler SimpleName MethodInvocation SimpleName get type
token SimpleName MethodInvocation MethodInvocation SimpleName equals
get type SimpleName MethodInvocation MethodInvocation SimpleName equals
token SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName auth handler
token SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get type
get type SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName auth handler
get type SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get type
equals SimpleName MethodInvocation MethodInvocation SimpleName auth handler
equals SimpleName MethodInvocation MethodInvocation SimpleName get type
authentication exception SimpleName SimpleType ClassInstanceCreation StringLiteral invalid authentication token type
token SimpleName MethodInvocation SimpleName is expired
authentication exception SimpleName SimpleType ClassInstanceCreation StringLiteral authentication token expired
override SimpleName MarkerAnnotation MethodDeclaration Modifier protected
override SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName authentication token
override SimpleName MarkerAnnotation MethodDeclaration SimpleName get token
override SimpleName MarkerAnnotation MethodDeclaration SingleVariableDeclaration SimpleName request
override SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName io exception
protected Modifier MethodDeclaration SimpleType SimpleName authentication token
protected Modifier MethodDeclaration SimpleName get token
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName http servlet request
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleName request
protected Modifier MethodDeclaration SimpleType SimpleName io exception
protected Modifier MethodDeclaration SimpleType SimpleName authentication exception
authentication token SimpleName SimpleType MethodDeclaration SimpleName get token
authentication token SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName request
authentication token SimpleName SimpleType MethodDeclaration SimpleType SimpleName io exception
authentication token SimpleName SimpleType MethodDeclaration SimpleType SimpleName authentication exception
get token SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName http servlet request
get token SimpleName MethodDeclaration SingleVariableDeclaration SimpleName request
get token SimpleName MethodDeclaration SimpleType SimpleName io exception
get token SimpleName MethodDeclaration SimpleType SimpleName authentication exception
get token SimpleName MethodDeclaration Block ReturnStatement SimpleName token
request SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
request SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName authentication exception
io exception SimpleName SimpleType MethodDeclaration SimpleType SimpleName authentication exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName override
public Modifier TypeDeclaration MethodDeclaration Modifier protected
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName authentication token
public Modifier TypeDeclaration MethodDeclaration SimpleName get token
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName request
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName authentication exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName override
test SimpleName TypeDeclaration MethodDeclaration Modifier protected
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName authentication token
test SimpleName TypeDeclaration MethodDeclaration SimpleName get token
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName request
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName authentication exception