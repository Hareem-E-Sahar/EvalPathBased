buffer SimpleName SimpleType SingleVariableDeclaration SimpleName req
buffer SimpleName SimpleType SingleVariableDeclaration SimpleName rep
req SimpleName MethodInvocation SimpleName get byte
cmd SimpleName VariableDeclarationFragment MethodInvocation SimpleName req
cmd SimpleName VariableDeclarationFragment MethodInvocation SimpleName get byte
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName cmd
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName req
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get byte
ssh agentpair QualifiedName SimpleType ParameterizedType SimpleType SimpleName public key
ssh agentpair QualifiedName SimpleType ParameterizedType SimpleType SimpleName string
public key SimpleName SimpleType ParameterizedType SimpleType SimpleName string
agent SimpleName MethodInvocation SimpleName get identities
keys SimpleName VariableDeclarationFragment MethodInvocation SimpleName agent
keys SimpleName VariableDeclarationFragment MethodInvocation SimpleName get identities
rep SimpleName MethodInvocation SimpleName put byte
rep SimpleName MethodInvocation SimpleName ssh agent identities answer
put byte SimpleName MethodInvocation SimpleName ssh agent identities answer
keys SimpleName MethodInvocation SimpleName size
rep SimpleName MethodInvocation SimpleName put int
rep SimpleName MethodInvocation MethodInvocation SimpleName keys
rep SimpleName MethodInvocation MethodInvocation SimpleName size
put int SimpleName MethodInvocation MethodInvocation SimpleName keys
put int SimpleName MethodInvocation MethodInvocation SimpleName size
ssh agentpair QualifiedName SimpleType ParameterizedType SimpleType SimpleName public key
ssh agentpair QualifiedName SimpleType ParameterizedType SimpleType SimpleName string
public key SimpleName SimpleType ParameterizedType SimpleType SimpleName string
ssh agentpair QualifiedName SimpleType ParameterizedType SingleVariableDeclaration SimpleName key
public key SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName key
string SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName key
key SimpleName MethodInvocation SimpleName get first
rep SimpleName MethodInvocation SimpleName put public key
rep SimpleName MethodInvocation MethodInvocation SimpleName key
rep SimpleName MethodInvocation MethodInvocation SimpleName get first
put public key SimpleName MethodInvocation MethodInvocation SimpleName key
put public key SimpleName MethodInvocation MethodInvocation SimpleName get first
key SimpleName MethodInvocation SimpleName get second
rep SimpleName MethodInvocation SimpleName put string
rep SimpleName MethodInvocation MethodInvocation SimpleName key
rep SimpleName MethodInvocation MethodInvocation SimpleName get second
put string SimpleName MethodInvocation MethodInvocation SimpleName key
put string SimpleName MethodInvocation MethodInvocation SimpleName get second
key SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName keys
req SimpleName MethodInvocation SimpleName get public key
key SimpleName VariableDeclarationFragment MethodInvocation SimpleName req
key SimpleName VariableDeclarationFragment MethodInvocation SimpleName get public key
public key SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName key
req SimpleName MethodInvocation SimpleName get bytes
data SimpleName VariableDeclarationFragment MethodInvocation SimpleName req
data SimpleName VariableDeclarationFragment MethodInvocation SimpleName get bytes
byte PrimitiveType ArrayType VariableDeclarationStatement VariableDeclarationFragment SimpleName data
req SimpleName MethodInvocation SimpleName get int
flags SimpleName VariableDeclarationFragment MethodInvocation SimpleName req
flags SimpleName VariableDeclarationFragment MethodInvocation SimpleName get int
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName flags
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName req
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get int
sig SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName byte array buffer
buffer SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName sig
key utils SimpleName MethodInvocation SimpleName get key type
key utils SimpleName MethodInvocation SimpleName key
get key type SimpleName MethodInvocation SimpleName key
sig SimpleName MethodInvocation SimpleName put string
sig SimpleName MethodInvocation MethodInvocation SimpleName key utils
sig SimpleName MethodInvocation MethodInvocation SimpleName get key type
sig SimpleName MethodInvocation MethodInvocation SimpleName key
put string SimpleName MethodInvocation MethodInvocation SimpleName key utils
put string SimpleName MethodInvocation MethodInvocation SimpleName get key type
put string SimpleName MethodInvocation MethodInvocation SimpleName key
agent SimpleName MethodInvocation SimpleName sign
agent SimpleName MethodInvocation SimpleName key
agent SimpleName MethodInvocation SimpleName data
sign SimpleName MethodInvocation SimpleName key
sign SimpleName MethodInvocation SimpleName data
key SimpleName MethodInvocation SimpleName data
sig SimpleName MethodInvocation SimpleName put bytes
sig SimpleName MethodInvocation MethodInvocation SimpleName agent
sig SimpleName MethodInvocation MethodInvocation SimpleName sign
sig SimpleName MethodInvocation MethodInvocation SimpleName key
sig SimpleName MethodInvocation MethodInvocation SimpleName data
put bytes SimpleName MethodInvocation MethodInvocation SimpleName agent
put bytes SimpleName MethodInvocation MethodInvocation SimpleName sign
put bytes SimpleName MethodInvocation MethodInvocation SimpleName key
put bytes SimpleName MethodInvocation MethodInvocation SimpleName data
rep SimpleName MethodInvocation SimpleName put byte
rep SimpleName MethodInvocation SimpleName ssh agent sign response
put byte SimpleName MethodInvocation SimpleName ssh agent sign response
sig SimpleName MethodInvocation SimpleName array
sig SimpleName MethodInvocation SimpleName rpos
sig SimpleName MethodInvocation SimpleName available
rep SimpleName MethodInvocation SimpleName put bytes
rep SimpleName MethodInvocation MethodInvocation SimpleName sig
rep SimpleName MethodInvocation MethodInvocation SimpleName array
rep SimpleName MethodInvocation MethodInvocation SimpleName sig
rep SimpleName MethodInvocation MethodInvocation SimpleName rpos
rep SimpleName MethodInvocation MethodInvocation SimpleName sig
rep SimpleName MethodInvocation MethodInvocation SimpleName available
put bytes SimpleName MethodInvocation MethodInvocation SimpleName sig
put bytes SimpleName MethodInvocation MethodInvocation SimpleName array
put bytes SimpleName MethodInvocation MethodInvocation SimpleName sig
put bytes SimpleName MethodInvocation MethodInvocation SimpleName rpos
put bytes SimpleName MethodInvocation MethodInvocation SimpleName sig
put bytes SimpleName MethodInvocation MethodInvocation SimpleName available
sig SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName sig
sig SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName rpos
array SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName sig
array SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName rpos
sig SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName sig
sig SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName available
array SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName sig
array SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName available
sig SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName sig
sig SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName available
rpos SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName sig
rpos SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName available
req SimpleName MethodInvocation SimpleName get key pair
req SimpleName MethodInvocation SimpleName get string
agent SimpleName MethodInvocation SimpleName add identity
agent SimpleName MethodInvocation MethodInvocation SimpleName req
agent SimpleName MethodInvocation MethodInvocation SimpleName get key pair
agent SimpleName MethodInvocation MethodInvocation SimpleName req
agent SimpleName MethodInvocation MethodInvocation SimpleName get string
add identity SimpleName MethodInvocation MethodInvocation SimpleName req
add identity SimpleName MethodInvocation MethodInvocation SimpleName get key pair
add identity SimpleName MethodInvocation MethodInvocation SimpleName req
add identity SimpleName MethodInvocation MethodInvocation SimpleName get string
req SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName req
req SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get string
get key pair SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName req
get key pair SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get string
rep SimpleName MethodInvocation SimpleName put byte
rep SimpleName MethodInvocation SimpleName ssh agent success
put byte SimpleName MethodInvocation SimpleName ssh agent success
req SimpleName MethodInvocation SimpleName get public key
key SimpleName VariableDeclarationFragment MethodInvocation SimpleName req
key SimpleName VariableDeclarationFragment MethodInvocation SimpleName get public key
public key SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName key
agent SimpleName MethodInvocation SimpleName remove identity
agent SimpleName MethodInvocation SimpleName key
remove identity SimpleName MethodInvocation SimpleName key
rep SimpleName MethodInvocation SimpleName put byte
rep SimpleName MethodInvocation SimpleName ssh agent success
put byte SimpleName MethodInvocation SimpleName ssh agent success
agent SimpleName MethodInvocation SimpleName remove all identities
rep SimpleName MethodInvocation SimpleName put byte
rep SimpleName MethodInvocation SimpleName ssh agent success
put byte SimpleName MethodInvocation SimpleName ssh agent success
rep SimpleName MethodInvocation SimpleName put byte
rep SimpleName MethodInvocation SimpleName ssh agent failure
put byte SimpleName MethodInvocation SimpleName ssh agent failure
cmd SimpleName SwitchStatement SwitchCase SimpleName ssh agentc request identities
cmd SimpleName SwitchStatement Block EnhancedForStatement SimpleName keys
cmd SimpleName SwitchStatement SwitchCase SimpleName ssh agentc sign request
cmd SimpleName SwitchStatement Block VariableDeclarationStatement PrimitiveType int
cmd SimpleName SwitchStatement SwitchCase SimpleName ssh agentc add identity
ssh agentc request identities SimpleName SwitchCase SwitchStatement SwitchCase SimpleName ssh agentc sign request
ssh agentc request identities SimpleName SwitchCase SwitchStatement SwitchCase SimpleName ssh agentc add identity
ssh agentc sign request SimpleName SwitchCase SwitchStatement SwitchCase SimpleName ssh agentc add identity
ssh agentc sign request SimpleName SwitchCase SwitchStatement SwitchCase SimpleName ssh agentc remove identity
ssh agentc add identity SimpleName SwitchCase SwitchStatement SwitchCase SimpleName ssh agentc remove identity
ssh agentc add identity SimpleName SwitchCase SwitchStatement SwitchCase SimpleName ssh agentc remove all identities
ssh agentc remove identity SimpleName SwitchCase SwitchStatement SwitchCase SimpleName ssh agentc remove all identities
int PrimitiveType VariableDeclarationStatement Block SwitchStatement SimpleName cmd
protected Modifier MethodDeclaration PrimitiveType void
protected Modifier MethodDeclaration SimpleName process
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName buffer
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleName req
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName buffer
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleName rep
protected Modifier MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration SimpleName process
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName buffer
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName req
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName buffer
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName rep
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
void PrimitiveType MethodDeclaration Block SwitchStatement SimpleName cmd
process SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName buffer
process SimpleName MethodDeclaration SingleVariableDeclaration SimpleName req
process SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName buffer
process SimpleName MethodDeclaration SingleVariableDeclaration SimpleName rep
process SimpleName MethodDeclaration SimpleType SimpleName exception
process SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
process SimpleName MethodDeclaration Block SwitchStatement SimpleName cmd
req SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName rep
req SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
rep SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier protected
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName process
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName req
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName rep
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration Modifier protected
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName process
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName req
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName rep
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
