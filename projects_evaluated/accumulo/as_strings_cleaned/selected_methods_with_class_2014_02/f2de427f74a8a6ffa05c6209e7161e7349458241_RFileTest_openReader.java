file length SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName file length
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment NumberLiteral empty
byte PrimitiveType ArrayType VariableDeclarationStatement VariableDeclarationFragment SimpleName data
baos SimpleName MethodInvocation SimpleName to byte array
data SimpleName Assignment MethodInvocation SimpleName baos
data SimpleName Assignment MethodInvocation SimpleName to byte array
seekable byte array input stream SimpleName SimpleType ClassInstanceCreation SimpleName data
bais SimpleName Assignment ClassInstanceCreation SimpleType SimpleName seekable byte array input stream
bais SimpleName Assignment ClassInstanceCreation SimpleName data
fs data input stream SimpleName SimpleType ClassInstanceCreation SimpleName bais
in SimpleName Assignment ClassInstanceCreation SimpleType SimpleName fs data input stream
in SimpleName Assignment ClassInstanceCreation SimpleName bais
file length SimpleName Assignment QualifiedName datalength
lru block cache SimpleName SimpleType ClassInstanceCreation NumberLiteral empty
lru block cache SimpleName SimpleType ClassInstanceCreation NumberLiteral empty
empty NumberLiteral ClassInstanceCreation NumberLiteral empty
index cache SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName lru block cache
index cache SimpleName VariableDeclarationFragment ClassInstanceCreation NumberLiteral empty
index cache SimpleName VariableDeclarationFragment ClassInstanceCreation NumberLiteral empty
lru block cache SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName index cache
lru block cache SimpleName SimpleType ClassInstanceCreation NumberLiteral empty
lru block cache SimpleName SimpleType ClassInstanceCreation NumberLiteral empty
empty NumberLiteral ClassInstanceCreation NumberLiteral empty
data cache SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName lru block cache
data cache SimpleName VariableDeclarationFragment ClassInstanceCreation NumberLiteral empty
data cache SimpleName VariableDeclarationFragment ClassInstanceCreation NumberLiteral empty
lru block cache SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName data cache
accumulo configuration SimpleName MethodInvocation SimpleName get default configuration
cachable block filereader QualifiedName SimpleType ClassInstanceCreation SimpleName in
cachable block filereader QualifiedName SimpleType ClassInstanceCreation SimpleName file length
cachable block filereader QualifiedName SimpleType ClassInstanceCreation SimpleName conf
cachable block filereader QualifiedName SimpleType ClassInstanceCreation SimpleName data cache
cachable block filereader QualifiedName SimpleType ClassInstanceCreation SimpleName index cache
in SimpleName ClassInstanceCreation SimpleName file length
in SimpleName ClassInstanceCreation SimpleName conf
in SimpleName ClassInstanceCreation SimpleName data cache
in SimpleName ClassInstanceCreation SimpleName index cache
in SimpleName ClassInstanceCreation MethodInvocation SimpleName accumulo configuration
in SimpleName ClassInstanceCreation MethodInvocation SimpleName get default configuration
file length SimpleName ClassInstanceCreation SimpleName conf
file length SimpleName ClassInstanceCreation SimpleName data cache
file length SimpleName ClassInstanceCreation SimpleName index cache
file length SimpleName ClassInstanceCreation MethodInvocation SimpleName accumulo configuration
file length SimpleName ClassInstanceCreation MethodInvocation SimpleName get default configuration
conf SimpleName ClassInstanceCreation SimpleName data cache
conf SimpleName ClassInstanceCreation SimpleName index cache
conf SimpleName ClassInstanceCreation MethodInvocation SimpleName accumulo configuration
conf SimpleName ClassInstanceCreation MethodInvocation SimpleName get default configuration
data cache SimpleName ClassInstanceCreation SimpleName index cache
data cache SimpleName ClassInstanceCreation MethodInvocation SimpleName accumulo configuration
data cache SimpleName ClassInstanceCreation MethodInvocation SimpleName get default configuration
index cache SimpleName ClassInstanceCreation MethodInvocation SimpleName accumulo configuration
index cache SimpleName ClassInstanceCreation MethodInvocation SimpleName get default configuration
cbr SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType QualifiedName cachable block filereader
cbr SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName in
cbr SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName file length
cbr SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName conf
cbr SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName data cache
cbr SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName index cache
cbr SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName accumulo configuration
cbr SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName get default configuration
cachable block filereader QualifiedName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName cbr
r filereader QualifiedName SimpleType ClassInstanceCreation SimpleName cbr
reader SimpleName Assignment ClassInstanceCreation SimpleType QualifiedName r filereader
reader SimpleName Assignment ClassInstanceCreation SimpleName cbr
column family skipping iterator SimpleName SimpleType ClassInstanceCreation SimpleName reader
iter SimpleName Assignment ClassInstanceCreation SimpleType SimpleName column family skipping iterator
iter SimpleName Assignment ClassInstanceCreation SimpleName reader
check index SimpleName MethodInvocation SimpleName reader
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName open reader
public Modifier MethodDeclaration SimpleType SimpleName io exception
public Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
void PrimitiveType MethodDeclaration SimpleName open reader
void PrimitiveType MethodDeclaration SimpleType SimpleName io exception
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
open reader SimpleName MethodDeclaration SimpleType SimpleName io exception
open reader SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName open reader
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName open reader
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName io exception