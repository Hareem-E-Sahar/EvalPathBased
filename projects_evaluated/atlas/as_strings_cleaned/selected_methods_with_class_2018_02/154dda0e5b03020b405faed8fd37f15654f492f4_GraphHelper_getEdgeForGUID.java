string SimpleName SimpleType SingleVariableDeclaration SimpleName guid
atlas edge SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName ret
find edge SimpleName MethodInvocation QualifiedName constantsrelationship guid property key
find edge SimpleName MethodInvocation SimpleName guid
constantsrelationship guid property key QualifiedName MethodInvocation SimpleName guid
ret SimpleName Assignment MethodInvocation SimpleName find edge
ret SimpleName Assignment MethodInvocation QualifiedName constantsrelationship guid property key
ret SimpleName Assignment MethodInvocation SimpleName guid
entity not found exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
atlas base exception SimpleName SimpleType ClassInstanceCreation QualifiedName atlas error coderelationship guid not found
atlas base exception SimpleName SimpleType ClassInstanceCreation SimpleName guid
atlas error coderelationship guid not found QualifiedName ClassInstanceCreation SimpleName guid
public Modifier MethodDeclaration SimpleType SimpleName atlas edge
public Modifier MethodDeclaration SimpleName get edge for guid
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName guid
public Modifier MethodDeclaration SimpleType SimpleName atlas base exception
public Modifier MethodDeclaration Block ReturnStatement SimpleName ret
atlas edge SimpleName SimpleType MethodDeclaration SimpleName get edge for guid
atlas edge SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName guid
atlas edge SimpleName SimpleType MethodDeclaration SimpleType SimpleName atlas base exception
get edge for guid SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
get edge for guid SimpleName MethodDeclaration SingleVariableDeclaration SimpleName guid
get edge for guid SimpleName MethodDeclaration SimpleType SimpleName atlas base exception
get edge for guid SimpleName MethodDeclaration Block ReturnStatement SimpleName ret
guid SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName atlas base exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName atlas edge
public Modifier TypeDeclaration MethodDeclaration SimpleName get edge for guid
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName guid
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName atlas base exception
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName atlas edge
test SimpleName TypeDeclaration MethodDeclaration SimpleName get edge for guid
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName guid
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName atlas base exception
