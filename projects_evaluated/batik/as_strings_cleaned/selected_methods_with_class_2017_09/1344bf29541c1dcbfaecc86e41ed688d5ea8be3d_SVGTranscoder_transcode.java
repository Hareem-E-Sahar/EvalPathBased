transcoder input SimpleName SimpleType SingleVariableDeclaration SimpleName input
transcoder output SimpleName SimpleType SingleVariableDeclaration SimpleName output
input SimpleName MethodInvocation SimpleName get reader
r SimpleName VariableDeclarationFragment MethodInvocation SimpleName input
r SimpleName VariableDeclarationFragment MethodInvocation SimpleName get reader
reader SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName r
output SimpleName MethodInvocation SimpleName get writer
w SimpleName VariableDeclarationFragment MethodInvocation SimpleName output
w SimpleName VariableDeclarationFragment MethodInvocation SimpleName get writer
writer SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName w
input SimpleName MethodInvocation SimpleName get document
d SimpleName VariableDeclarationFragment MethodInvocation SimpleName input
d SimpleName VariableDeclarationFragment MethodInvocation SimpleName get document
document SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName d
runtime exception SimpleName SimpleType ClassInstanceCreation StringLiteral reader or document expected
string writer SimpleName SimpleType ClassInstanceCreation NumberLiteral empty
sw SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName string writer
sw SimpleName VariableDeclarationFragment ClassInstanceCreation NumberLiteral empty
string writer SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName sw
dom utilities SimpleName MethodInvocation SimpleName write document
dom utilities SimpleName MethodInvocation SimpleName d
dom utilities SimpleName MethodInvocation SimpleName sw
write document SimpleName MethodInvocation SimpleName d
write document SimpleName MethodInvocation SimpleName sw
d SimpleName MethodInvocation SimpleName sw
io exception SimpleName SimpleType SingleVariableDeclaration SimpleName io ex
io ex SimpleName MethodInvocation SimpleName get message
io StringLiteral InfixExpression MethodInvocation SimpleName io ex
io StringLiteral InfixExpression MethodInvocation SimpleName get message
runtime exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral io
sw SimpleName MethodInvocation SimpleName to string
string reader SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName sw
string reader SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName to string
r SimpleName Assignment ClassInstanceCreation SimpleType SimpleName string reader
r SimpleName Assignment ClassInstanceCreation MethodInvocation SimpleName sw
r SimpleName Assignment ClassInstanceCreation MethodInvocation SimpleName to string
runtime exception SimpleName SimpleType ClassInstanceCreation StringLiteral writer expected
pretty print SimpleName MethodInvocation SimpleName r
pretty print SimpleName MethodInvocation SimpleName w
r SimpleName MethodInvocation SimpleName w
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName transcode
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName transcoder input
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName input
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName transcoder output
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName output
public Modifier MethodDeclaration SimpleType SimpleName transcoder exception
void PrimitiveType MethodDeclaration SimpleName transcode
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName transcoder input
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName input
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName transcoder output
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName output
void PrimitiveType MethodDeclaration SimpleType SimpleName transcoder exception
transcode SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName transcoder input
transcode SimpleName MethodDeclaration SingleVariableDeclaration SimpleName input
transcode SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName transcoder output
transcode SimpleName MethodDeclaration SingleVariableDeclaration SimpleName output
transcode SimpleName MethodDeclaration SimpleType SimpleName transcoder exception
input SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName output
input SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName transcoder exception
output SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName transcoder exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName transcode
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName input
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName output
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName transcoder exception
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName transcode
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName input
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName output
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName transcoder exception
