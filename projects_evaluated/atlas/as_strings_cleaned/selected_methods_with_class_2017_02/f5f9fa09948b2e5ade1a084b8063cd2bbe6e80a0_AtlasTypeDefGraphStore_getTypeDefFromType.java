atlas type SimpleName SimpleType SingleVariableDeclaration SimpleName type
atlas base type def SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName ret
type SimpleName MethodInvocation SimpleName get type category
atlas enum type SimpleName SimpleType CastExpression SimpleName type
type SimpleName CastExpression ParenthesizedExpression MethodInvocation SimpleName get enum def
ret SimpleName Assignment MethodInvocation SimpleName get enum def
atlas struct type SimpleName SimpleType CastExpression SimpleName type
type SimpleName CastExpression ParenthesizedExpression MethodInvocation SimpleName get struct def
ret SimpleName Assignment MethodInvocation SimpleName get struct def
atlas classification type SimpleName SimpleType CastExpression SimpleName type
type SimpleName CastExpression ParenthesizedExpression MethodInvocation SimpleName get classification def
ret SimpleName Assignment MethodInvocation SimpleName get classification def
atlas entity type SimpleName SimpleType CastExpression SimpleName type
type SimpleName CastExpression ParenthesizedExpression MethodInvocation SimpleName get entity def
ret SimpleName Assignment MethodInvocation SimpleName get entity def
type SimpleName MethodInvocation SimpleName get type category
type SimpleName MethodInvocation MethodInvocation SimpleName name
get type category SimpleName MethodInvocation MethodInvocation SimpleName name
atlas base exception SimpleName SimpleType ClassInstanceCreation QualifiedName atlas error codesystem type
atlas base exception SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName name
atlas error codesystem type QualifiedName ClassInstanceCreation MethodInvocation MethodInvocation SimpleName type
atlas error codesystem type QualifiedName ClassInstanceCreation MethodInvocation MethodInvocation SimpleName get type category
atlas error codesystem type QualifiedName ClassInstanceCreation MethodInvocation SimpleName name
type SimpleName MethodInvocation SwitchStatement SwitchCase SimpleName enum
get type category SimpleName MethodInvocation SwitchStatement SwitchCase SimpleName enum
type SimpleName MethodInvocation SwitchStatement SwitchCase SimpleName struct
get type category SimpleName MethodInvocation SwitchStatement SwitchCase SimpleName struct
enum SimpleName SwitchCase SwitchStatement SwitchCase SimpleName struct
struct SimpleName SwitchCase SwitchStatement SwitchCase SimpleName classification
classification SimpleName SwitchCase SwitchStatement SwitchCase SimpleName entity
entity SimpleName SwitchCase SwitchStatement SwitchCase SimpleName primitive
entity SimpleName SwitchCase SwitchStatement SwitchCase SimpleName object id type
entity SimpleName SwitchCase SwitchStatement SwitchCase SimpleName array
primitive SimpleName SwitchCase SwitchStatement SwitchCase SimpleName object id type
primitive SimpleName SwitchCase SwitchStatement SwitchCase SimpleName array
primitive SimpleName SwitchCase SwitchStatement SwitchCase SimpleName map
object id type SimpleName SwitchCase SwitchStatement SwitchCase SimpleName array
object id type SimpleName SwitchCase SwitchStatement SwitchCase SimpleName map
array SimpleName SwitchCase SwitchStatement SwitchCase SimpleName map
private Modifier MethodDeclaration SimpleType SimpleName atlas base type def
private Modifier MethodDeclaration SimpleName get type def from type
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName atlas type
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName type
private Modifier MethodDeclaration SimpleType SimpleName atlas base exception
private Modifier MethodDeclaration Block ReturnStatement SimpleName ret
atlas base type def SimpleName SimpleType MethodDeclaration SimpleName get type def from type
atlas base type def SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName type
atlas base type def SimpleName SimpleType MethodDeclaration SimpleType SimpleName atlas base exception
get type def from type SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName atlas type
get type def from type SimpleName MethodDeclaration SingleVariableDeclaration SimpleName type
get type def from type SimpleName MethodDeclaration SimpleType SimpleName atlas base exception
get type def from type SimpleName MethodDeclaration Block ReturnStatement SimpleName ret
type SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName atlas base exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName atlas base type def
public Modifier TypeDeclaration MethodDeclaration SimpleName get type def from type
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName type
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName atlas base exception
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName atlas base type def
test SimpleName TypeDeclaration MethodDeclaration SimpleName get type def from type
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName type
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName atlas base exception
