affine transform SimpleName SimpleType SingleVariableDeclaration SimpleName txf
t SimpleName VariableDeclarationFragment SimpleName txf
affine transform SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName t
affine transform SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName txf
affine transform SimpleName SimpleType ClassInstanceCreation SimpleName txf
t SimpleName Assignment ClassInstanceCreation SimpleType SimpleName affine transform
t SimpleName Assignment ClassInstanceCreation SimpleName txf
t SimpleName MethodInvocation SimpleName concatenate
t SimpleName MethodInvocation SimpleName transform
concatenate SimpleName MethodInvocation SimpleName transform
t SimpleName MethodInvocation SimpleName get shear x
t SimpleName MethodInvocation InfixExpression NumberLiteral empty
get shear x SimpleName MethodInvocation InfixExpression NumberLiteral empty
t SimpleName MethodInvocation SimpleName get shear y
t SimpleName MethodInvocation InfixExpression NumberLiteral empty
get shear y SimpleName MethodInvocation InfixExpression NumberLiteral empty
get transformed b box SimpleName MethodInvocation MethodInvocation SimpleName get sensitive bounds
get transformed b box SimpleName MethodInvocation SimpleName t
get sensitive bounds SimpleName MethodInvocation MethodInvocation SimpleName t
rectangle d SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName sb
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression SimpleName count
sb SimpleName InfixExpression InfixExpression InfixExpression SimpleName i
sb SimpleName InfixExpression InfixExpression InfixExpression SimpleName count
children SimpleName ArrayAccess PostfixExpression SimpleName i
children SimpleName ArrayAccess MethodInvocation SimpleName get transformed sensitive bounds
i SimpleName PostfixExpression ArrayAccess MethodInvocation SimpleName get transformed sensitive bounds
children SimpleName ArrayAccess MethodInvocation SimpleName t
i SimpleName PostfixExpression ArrayAccess MethodInvocation SimpleName t
get transformed sensitive bounds SimpleName MethodInvocation SimpleName t
sb SimpleName Assignment MethodInvocation ArrayAccess SimpleName children
sb SimpleName Assignment MethodInvocation SimpleName get transformed sensitive bounds
sb SimpleName Assignment MethodInvocation SimpleName t
rectangle d SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName csb
i SimpleName InfixExpression SimpleName count
children SimpleName ArrayAccess PostfixExpression SimpleName i
children SimpleName ArrayAccess MethodInvocation SimpleName get transformed sensitive bounds
i SimpleName PostfixExpression ArrayAccess MethodInvocation SimpleName get transformed sensitive bounds
children SimpleName ArrayAccess MethodInvocation SimpleName t
i SimpleName PostfixExpression ArrayAccess MethodInvocation SimpleName t
get transformed sensitive bounds SimpleName MethodInvocation SimpleName t
csb SimpleName Assignment MethodInvocation ArrayAccess SimpleName children
csb SimpleName Assignment MethodInvocation SimpleName get transformed sensitive bounds
csb SimpleName Assignment MethodInvocation SimpleName t
sb SimpleName MethodInvocation SimpleName add
sb SimpleName MethodInvocation SimpleName csb
add SimpleName MethodInvocation SimpleName csb
int PrimitiveType VariableDeclarationStatement Block ReturnStatement SimpleName sb
public Modifier MethodDeclaration SimpleType SimpleName rectangle d
public Modifier MethodDeclaration SimpleName get transformed sensitive bounds
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName affine transform
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName txf
public Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
public Modifier MethodDeclaration Block ReturnStatement SimpleName sb
rectangle d SimpleName SimpleType MethodDeclaration SimpleName get transformed sensitive bounds
rectangle d SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName txf
get transformed sensitive bounds SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName affine transform
get transformed sensitive bounds SimpleName MethodDeclaration SingleVariableDeclaration SimpleName txf
get transformed sensitive bounds SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
get transformed sensitive bounds SimpleName MethodDeclaration Block ReturnStatement SimpleName sb
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName rectangle d
public Modifier TypeDeclaration MethodDeclaration SimpleName get transformed sensitive bounds
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName txf
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName rectangle d
test SimpleName TypeDeclaration MethodDeclaration SimpleName get transformed sensitive bounds
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName txf
