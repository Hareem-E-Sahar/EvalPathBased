wrappers SimpleName MethodInvocation SimpleName get
wrapper SimpleName VariableDeclarationFragment MethodInvocation SimpleName wrappers
wrapper SimpleName VariableDeclarationFragment MethodInvocation SimpleName get
wrapper SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName wrapper
pool SimpleName MethodInvocation SimpleName poll
client SimpleName VariableDeclarationFragment MethodInvocation SimpleName pool
client SimpleName VariableDeclarationFragment MethodInvocation SimpleName poll
sftp client SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName client
session SimpleName MethodInvocation SimpleName create sftp client
client SimpleName Assignment MethodInvocation SimpleName session
client SimpleName Assignment MethodInvocation SimpleName create sftp client
client SimpleName MethodInvocation SimpleName is closing
wrapper SimpleName SimpleType ClassInstanceCreation SimpleName client
wrapper SimpleName Assignment ClassInstanceCreation SimpleType SimpleName wrapper
wrapper SimpleName Assignment ClassInstanceCreation SimpleName client
wrappers SimpleName MethodInvocation SimpleName set
wrappers SimpleName MethodInvocation SimpleName wrapper
set SimpleName MethodInvocation SimpleName wrapper
wrapper SimpleName MethodInvocation SimpleName increment
public Modifier MethodDeclaration SimpleType SimpleName sftp client
public Modifier MethodDeclaration SimpleName get client
public Modifier MethodDeclaration SimpleType SimpleName io exception
public Modifier MethodDeclaration Block ReturnStatement SimpleName wrapper
sftp client SimpleName SimpleType MethodDeclaration SimpleName get client
sftp client SimpleName SimpleType MethodDeclaration SimpleType SimpleName io exception
get client SimpleName MethodDeclaration SimpleType SimpleName io exception
get client SimpleName MethodDeclaration Block ReturnStatement SimpleName wrapper
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName sftp client
public Modifier TypeDeclaration MethodDeclaration SimpleName get client
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName sftp client
test SimpleName TypeDeclaration MethodDeclaration SimpleName get client
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
