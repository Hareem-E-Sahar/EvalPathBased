string SimpleName SimpleType ArrayType ArrayCreation QualifiedName ssh constantsproposal max
guess SimpleName VariableDeclarationFragment ArrayCreation QualifiedName ssh constantsproposal max
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression QualifiedName ssh constantsproposal max
client proposal SimpleName ArrayAccess SimpleName i
client proposal SimpleName ArrayAccess MethodInvocation SimpleName split
i SimpleName ArrayAccess MethodInvocation SimpleName split
client proposal SimpleName ArrayAccess MethodInvocation StringLiteral empty
i SimpleName ArrayAccess MethodInvocation StringLiteral empty
split SimpleName MethodInvocation StringLiteral empty
c SimpleName VariableDeclarationFragment MethodInvocation ArrayAccess SimpleName client proposal
c SimpleName VariableDeclarationFragment MethodInvocation ArrayAccess SimpleName i
c SimpleName VariableDeclarationFragment MethodInvocation SimpleName split
c SimpleName VariableDeclarationFragment MethodInvocation StringLiteral empty
server proposal SimpleName ArrayAccess SimpleName i
server proposal SimpleName ArrayAccess MethodInvocation SimpleName split
i SimpleName ArrayAccess MethodInvocation SimpleName split
server proposal SimpleName ArrayAccess MethodInvocation StringLiteral empty
i SimpleName ArrayAccess MethodInvocation StringLiteral empty
split SimpleName MethodInvocation StringLiteral empty
s SimpleName VariableDeclarationFragment MethodInvocation ArrayAccess SimpleName server proposal
s SimpleName VariableDeclarationFragment MethodInvocation ArrayAccess SimpleName i
s SimpleName VariableDeclarationFragment MethodInvocation SimpleName split
s SimpleName VariableDeclarationFragment MethodInvocation StringLiteral empty
string SimpleName SimpleType SingleVariableDeclaration SimpleName ci
string SimpleName SimpleType SingleVariableDeclaration SimpleName si
ci SimpleName MethodInvocation SimpleName equals
ci SimpleName MethodInvocation SimpleName si
equals SimpleName MethodInvocation SimpleName si
guess SimpleName ArrayAccess SimpleName i
guess SimpleName ArrayAccess Assignment SimpleName ci
i SimpleName ArrayAccess Assignment SimpleName ci
string SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName s
si SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName s
guess SimpleName ArrayAccess SimpleName i
string SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName c
ci SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName c
c SimpleName EnhancedForStatement Block EnhancedForStatement SimpleName s
guess SimpleName ArrayAccess SimpleName i
i SimpleName InfixExpression QualifiedName ssh constantsproposal lang ctos
i SimpleName InfixExpression QualifiedName ssh constantsproposal lang stoc
kex algorithms StringLiteral ArrayInitializer StringLiteral server host key algorithms
kex algorithms StringLiteral ArrayInitializer StringLiteral encryption algorithms client to server
kex algorithms StringLiteral ArrayInitializer StringLiteral encryption algorithms server to client
kex algorithms StringLiteral ArrayInitializer StringLiteral mac algorithms client to server
kex algorithms StringLiteral ArrayInitializer StringLiteral mac algorithms server to client
server host key algorithms StringLiteral ArrayInitializer StringLiteral encryption algorithms client to server
server host key algorithms StringLiteral ArrayInitializer StringLiteral encryption algorithms server to client
server host key algorithms StringLiteral ArrayInitializer StringLiteral mac algorithms client to server
server host key algorithms StringLiteral ArrayInitializer StringLiteral mac algorithms server to client
server host key algorithms StringLiteral ArrayInitializer StringLiteral compression algorithms client to server
encryption algorithms client to server StringLiteral ArrayInitializer StringLiteral encryption algorithms server to client
encryption algorithms client to server StringLiteral ArrayInitializer StringLiteral mac algorithms client to server
encryption algorithms client to server StringLiteral ArrayInitializer StringLiteral mac algorithms server to client
encryption algorithms client to server StringLiteral ArrayInitializer StringLiteral compression algorithms client to server
encryption algorithms client to server StringLiteral ArrayInitializer StringLiteral compression algorithms server to client
encryption algorithms server to client StringLiteral ArrayInitializer StringLiteral mac algorithms client to server
encryption algorithms server to client StringLiteral ArrayInitializer StringLiteral mac algorithms server to client
encryption algorithms server to client StringLiteral ArrayInitializer StringLiteral compression algorithms client to server
encryption algorithms server to client StringLiteral ArrayInitializer StringLiteral compression algorithms server to client
mac algorithms client to server StringLiteral ArrayInitializer StringLiteral mac algorithms server to client
mac algorithms client to server StringLiteral ArrayInitializer StringLiteral compression algorithms client to server
mac algorithms client to server StringLiteral ArrayInitializer StringLiteral compression algorithms server to client
mac algorithms server to client StringLiteral ArrayInitializer StringLiteral compression algorithms client to server
mac algorithms server to client StringLiteral ArrayInitializer StringLiteral compression algorithms server to client
compression algorithms client to server StringLiteral ArrayInitializer StringLiteral compression algorithms server to client
items SimpleName VariableDeclarationFragment ArrayCreation ArrayInitializer StringLiteral kex algorithms
items SimpleName VariableDeclarationFragment ArrayCreation ArrayInitializer StringLiteral server host key algorithms
items SimpleName VariableDeclarationFragment ArrayCreation ArrayInitializer StringLiteral encryption algorithms client to server
items SimpleName VariableDeclarationFragment ArrayCreation ArrayInitializer StringLiteral encryption algorithms server to client
items SimpleName VariableDeclarationFragment ArrayCreation ArrayInitializer StringLiteral mac algorithms client to server
items SimpleName VariableDeclarationFragment ArrayCreation ArrayInitializer StringLiteral mac algorithms server to client
items SimpleName VariableDeclarationFragment ArrayCreation ArrayInitializer StringLiteral compression algorithms client to server
items SimpleName VariableDeclarationFragment ArrayCreation ArrayInitializer StringLiteral compression algorithms server to client
final Modifier VariableDeclarationStatement ArrayType SimpleType SimpleName string
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName items
items SimpleName ArrayAccess SimpleName i
client proposal SimpleName ArrayAccess SimpleName i
server proposal SimpleName ArrayAccess SimpleName i
unable to negociate key exchange for StringLiteral InfixExpression ArrayAccess SimpleName items
unable to negociate key exchange for StringLiteral InfixExpression ArrayAccess SimpleName i
unable to negociate key exchange for StringLiteral InfixExpression StringLiteral client
unable to negociate key exchange for StringLiteral InfixExpression ArrayAccess SimpleName client proposal
unable to negociate key exchange for StringLiteral InfixExpression ArrayAccess SimpleName i
unable to negociate key exchange for StringLiteral InfixExpression StringLiteral / server
unable to negociate key exchange for StringLiteral InfixExpression ArrayAccess SimpleName server proposal
unable to negociate key exchange for StringLiteral InfixExpression ArrayAccess SimpleName i
items SimpleName ArrayAccess InfixExpression StringLiteral client
i SimpleName ArrayAccess InfixExpression StringLiteral client
items SimpleName ArrayAccess InfixExpression ArrayAccess SimpleName client proposal
items SimpleName ArrayAccess InfixExpression ArrayAccess SimpleName i
i SimpleName ArrayAccess InfixExpression ArrayAccess SimpleName client proposal
i SimpleName ArrayAccess InfixExpression ArrayAccess SimpleName i
items SimpleName ArrayAccess InfixExpression StringLiteral / server
i SimpleName ArrayAccess InfixExpression StringLiteral / server
items SimpleName ArrayAccess InfixExpression ArrayAccess SimpleName server proposal
items SimpleName ArrayAccess InfixExpression ArrayAccess SimpleName i
i SimpleName ArrayAccess InfixExpression ArrayAccess SimpleName server proposal
i SimpleName ArrayAccess InfixExpression ArrayAccess SimpleName i
items SimpleName ArrayAccess InfixExpression StringLiteral )
i SimpleName ArrayAccess InfixExpression StringLiteral )
client StringLiteral InfixExpression ArrayAccess SimpleName client proposal
client StringLiteral InfixExpression ArrayAccess SimpleName i
client StringLiteral InfixExpression StringLiteral / server
client StringLiteral InfixExpression ArrayAccess SimpleName server proposal
client StringLiteral InfixExpression ArrayAccess SimpleName i
client StringLiteral InfixExpression StringLiteral )
client proposal SimpleName ArrayAccess InfixExpression StringLiteral / server
i SimpleName ArrayAccess InfixExpression StringLiteral / server
client proposal SimpleName ArrayAccess InfixExpression ArrayAccess SimpleName server proposal
client proposal SimpleName ArrayAccess InfixExpression ArrayAccess SimpleName i
i SimpleName ArrayAccess InfixExpression ArrayAccess SimpleName server proposal
i SimpleName ArrayAccess InfixExpression ArrayAccess SimpleName i
client proposal SimpleName ArrayAccess InfixExpression StringLiteral )
i SimpleName ArrayAccess InfixExpression StringLiteral )
/ server StringLiteral InfixExpression ArrayAccess SimpleName server proposal
/ server StringLiteral InfixExpression ArrayAccess SimpleName i
/ server StringLiteral InfixExpression StringLiteral )
server proposal SimpleName ArrayAccess InfixExpression StringLiteral )
i SimpleName ArrayAccess InfixExpression StringLiteral )
illegal state exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral unable to negociate key exchange for
illegal state exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral client
illegal state exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral / server
illegal state exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral )
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression QualifiedName ssh constantsproposal max
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
ssh constantsproposal max QualifiedName InfixExpression ForStatement PostfixExpression SimpleName i
negociated SimpleName Assignment SimpleName guess
protected Modifier MethodDeclaration PrimitiveType void
protected Modifier MethodDeclaration SimpleName negociate
void PrimitiveType MethodDeclaration SimpleName negociate
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier protected
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName negociate
test SimpleName TypeDeclaration MethodDeclaration Modifier protected
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName negociate
