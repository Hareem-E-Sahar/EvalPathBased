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
get transformed b box SimpleName MethodInvocation MethodInvocation SimpleName get geometry bounds
get transformed b box SimpleName MethodInvocation SimpleName t
get geometry bounds SimpleName MethodInvocation MethodInvocation SimpleName t
rectangle d SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName gb
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression SimpleName count
gb SimpleName InfixExpression InfixExpression InfixExpression SimpleName i
gb SimpleName InfixExpression InfixExpression InfixExpression SimpleName count
children SimpleName ArrayAccess PostfixExpression SimpleName i
children SimpleName ArrayAccess MethodInvocation SimpleName get transformed geometry bounds
i SimpleName PostfixExpression ArrayAccess MethodInvocation SimpleName get transformed geometry bounds
children SimpleName ArrayAccess MethodInvocation SimpleName t
i SimpleName PostfixExpression ArrayAccess MethodInvocation SimpleName t
get transformed geometry bounds SimpleName MethodInvocation SimpleName t
gb SimpleName Assignment MethodInvocation ArrayAccess SimpleName children
gb SimpleName Assignment MethodInvocation SimpleName get transformed geometry bounds
gb SimpleName Assignment MethodInvocation SimpleName t
rectangle d SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName cgb
i SimpleName InfixExpression SimpleName count
children SimpleName ArrayAccess PostfixExpression SimpleName i
children SimpleName ArrayAccess MethodInvocation SimpleName get transformed geometry bounds
i SimpleName PostfixExpression ArrayAccess MethodInvocation SimpleName get transformed geometry bounds
children SimpleName ArrayAccess MethodInvocation SimpleName t
i SimpleName PostfixExpression ArrayAccess MethodInvocation SimpleName t
get transformed geometry bounds SimpleName MethodInvocation SimpleName t
cgb SimpleName Assignment MethodInvocation ArrayAccess SimpleName children
cgb SimpleName Assignment MethodInvocation SimpleName get transformed geometry bounds
cgb SimpleName Assignment MethodInvocation SimpleName t
gb SimpleName MethodInvocation SimpleName add
gb SimpleName MethodInvocation SimpleName cgb
add SimpleName MethodInvocation SimpleName cgb
int PrimitiveType VariableDeclarationStatement Block ReturnStatement SimpleName gb
public Modifier MethodDeclaration SimpleType SimpleName rectangle d
public Modifier MethodDeclaration SimpleName get transformed geometry bounds
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName affine transform
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName txf
public Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
public Modifier MethodDeclaration Block ReturnStatement SimpleName gb
rectangle d SimpleName SimpleType MethodDeclaration SimpleName get transformed geometry bounds
rectangle d SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName txf
get transformed geometry bounds SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName affine transform
get transformed geometry bounds SimpleName MethodDeclaration SingleVariableDeclaration SimpleName txf
get transformed geometry bounds SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
get transformed geometry bounds SimpleName MethodDeclaration Block ReturnStatement SimpleName gb
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName rectangle d
public Modifier TypeDeclaration MethodDeclaration SimpleName get transformed geometry bounds
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName txf
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName rectangle d
test SimpleName TypeDeclaration MethodDeclaration SimpleName get transformed geometry bounds
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName txf
