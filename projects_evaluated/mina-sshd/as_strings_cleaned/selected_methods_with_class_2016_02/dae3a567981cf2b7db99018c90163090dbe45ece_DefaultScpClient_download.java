string SimpleName SimpleType SingleVariableDeclaration SimpleName remote
file system SimpleName SimpleType SingleVariableDeclaration SimpleName fs
path SimpleName SimpleType SingleVariableDeclaration SimpleName local
collection SimpleName SimpleType ParameterizedType SimpleType SimpleName option
collection SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName options
option SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName options
create receive command SimpleName MethodInvocation SimpleName remote
create receive command SimpleName MethodInvocation SimpleName options
remote SimpleName MethodInvocation SimpleName options
cmd SimpleName VariableDeclarationFragment MethodInvocation SimpleName create receive command
cmd SimpleName VariableDeclarationFragment MethodInvocation SimpleName remote
cmd SimpleName VariableDeclarationFragment MethodInvocation SimpleName options
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName cmd
session SimpleName VariableDeclarationFragment MethodInvocation SimpleName get client session
client session SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName session
open command channel SimpleName MethodInvocation SimpleName session
open command channel SimpleName MethodInvocation SimpleName cmd
session SimpleName MethodInvocation SimpleName cmd
channel SimpleName VariableDeclarationFragment MethodInvocation SimpleName open command channel
channel SimpleName VariableDeclarationFragment MethodInvocation SimpleName session
channel SimpleName VariableDeclarationFragment MethodInvocation SimpleName cmd
channel exec SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName channel
channel SimpleName MethodInvocation SimpleName get inverted out
inv out SimpleName VariableDeclarationFragment MethodInvocation SimpleName channel
inv out SimpleName VariableDeclarationFragment MethodInvocation SimpleName get inverted out
input stream SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName inv out
channel SimpleName MethodInvocation SimpleName get inverted in
inv in SimpleName VariableDeclarationFragment MethodInvocation SimpleName channel
inv in SimpleName VariableDeclarationFragment MethodInvocation SimpleName get inverted in
output stream SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName inv in
scp helper SimpleName SimpleType ClassInstanceCreation SimpleName session
scp helper SimpleName SimpleType ClassInstanceCreation SimpleName inv out
scp helper SimpleName SimpleType ClassInstanceCreation SimpleName inv in
scp helper SimpleName SimpleType ClassInstanceCreation SimpleName fs
scp helper SimpleName SimpleType ClassInstanceCreation SimpleName listener
session SimpleName ClassInstanceCreation SimpleName inv out
session SimpleName ClassInstanceCreation SimpleName inv in
session SimpleName ClassInstanceCreation SimpleName fs
session SimpleName ClassInstanceCreation SimpleName listener
inv out SimpleName ClassInstanceCreation SimpleName inv in
inv out SimpleName ClassInstanceCreation SimpleName fs
inv out SimpleName ClassInstanceCreation SimpleName listener
inv in SimpleName ClassInstanceCreation SimpleName fs
inv in SimpleName ClassInstanceCreation SimpleName listener
fs SimpleName ClassInstanceCreation SimpleName listener
helper SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName scp helper
helper SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName session
helper SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName inv out
helper SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName inv in
helper SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName fs
helper SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName listener
scp helper SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName helper
options SimpleName MethodInvocation SimpleName contains
options SimpleName MethodInvocation QualifiedName optionrecursive
contains SimpleName MethodInvocation QualifiedName optionrecursive
options SimpleName MethodInvocation SimpleName contains
options SimpleName MethodInvocation QualifiedName optiontarget is directory
contains SimpleName MethodInvocation QualifiedName optiontarget is directory
options SimpleName MethodInvocation SimpleName contains
options SimpleName MethodInvocation QualifiedName optionpreserve attributes
contains SimpleName MethodInvocation QualifiedName optionpreserve attributes
helper SimpleName MethodInvocation SimpleName receive
helper SimpleName MethodInvocation SimpleName local
helper SimpleName MethodInvocation MethodInvocation SimpleName options
helper SimpleName MethodInvocation MethodInvocation SimpleName contains
helper SimpleName MethodInvocation MethodInvocation QualifiedName optionrecursive
helper SimpleName MethodInvocation MethodInvocation SimpleName options
helper SimpleName MethodInvocation MethodInvocation SimpleName contains
helper SimpleName MethodInvocation MethodInvocation QualifiedName optiontarget is directory
helper SimpleName MethodInvocation MethodInvocation SimpleName options
helper SimpleName MethodInvocation MethodInvocation SimpleName contains
helper SimpleName MethodInvocation MethodInvocation QualifiedName optionpreserve attributes
receive SimpleName MethodInvocation SimpleName local
receive SimpleName MethodInvocation MethodInvocation SimpleName options
receive SimpleName MethodInvocation MethodInvocation SimpleName contains
receive SimpleName MethodInvocation MethodInvocation QualifiedName optionrecursive
receive SimpleName MethodInvocation MethodInvocation SimpleName options
receive SimpleName MethodInvocation MethodInvocation SimpleName contains
receive SimpleName MethodInvocation MethodInvocation QualifiedName optiontarget is directory
receive SimpleName MethodInvocation MethodInvocation SimpleName options
receive SimpleName MethodInvocation MethodInvocation SimpleName contains
receive SimpleName MethodInvocation MethodInvocation QualifiedName optionpreserve attributes
receive SimpleName MethodInvocation QualifiedName scp helperdefault receive buffer size
local SimpleName MethodInvocation MethodInvocation SimpleName options
local SimpleName MethodInvocation MethodInvocation SimpleName contains
local SimpleName MethodInvocation MethodInvocation QualifiedName optionrecursive
local SimpleName MethodInvocation MethodInvocation SimpleName options
local SimpleName MethodInvocation MethodInvocation SimpleName contains
local SimpleName MethodInvocation MethodInvocation QualifiedName optiontarget is directory
local SimpleName MethodInvocation MethodInvocation SimpleName options
local SimpleName MethodInvocation MethodInvocation SimpleName contains
local SimpleName MethodInvocation MethodInvocation QualifiedName optionpreserve attributes
local SimpleName MethodInvocation QualifiedName scp helperdefault receive buffer size
options SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName options
options SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName contains
options SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName optiontarget is directory
contains SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName options
contains SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName contains
contains SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName optiontarget is directory
optionrecursive QualifiedName MethodInvocation MethodInvocation MethodInvocation SimpleName options
optionrecursive QualifiedName MethodInvocation MethodInvocation MethodInvocation SimpleName contains
optionrecursive QualifiedName MethodInvocation MethodInvocation MethodInvocation QualifiedName optiontarget is directory
options SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName options
options SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName contains
options SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName optionpreserve attributes
contains SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName options
contains SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName contains
contains SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName optionpreserve attributes
optionrecursive QualifiedName MethodInvocation MethodInvocation MethodInvocation SimpleName options
optionrecursive QualifiedName MethodInvocation MethodInvocation MethodInvocation SimpleName contains
optionrecursive QualifiedName MethodInvocation MethodInvocation MethodInvocation QualifiedName optionpreserve attributes
options SimpleName MethodInvocation MethodInvocation QualifiedName scp helperdefault receive buffer size
contains SimpleName MethodInvocation MethodInvocation QualifiedName scp helperdefault receive buffer size
optionrecursive QualifiedName MethodInvocation MethodInvocation QualifiedName scp helperdefault receive buffer size
options SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName options
options SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName contains
options SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName optionpreserve attributes
contains SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName options
contains SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName contains
contains SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName optionpreserve attributes
optiontarget is directory QualifiedName MethodInvocation MethodInvocation MethodInvocation SimpleName options
optiontarget is directory QualifiedName MethodInvocation MethodInvocation MethodInvocation SimpleName contains
optiontarget is directory QualifiedName MethodInvocation MethodInvocation MethodInvocation QualifiedName optionpreserve attributes
options SimpleName MethodInvocation MethodInvocation QualifiedName scp helperdefault receive buffer size
contains SimpleName MethodInvocation MethodInvocation QualifiedName scp helperdefault receive buffer size
optiontarget is directory QualifiedName MethodInvocation MethodInvocation QualifiedName scp helperdefault receive buffer size
options SimpleName MethodInvocation MethodInvocation QualifiedName scp helperdefault receive buffer size
contains SimpleName MethodInvocation MethodInvocation QualifiedName scp helperdefault receive buffer size
optionpreserve attributes QualifiedName MethodInvocation MethodInvocation QualifiedName scp helperdefault receive buffer size
handle command exit status SimpleName MethodInvocation SimpleName cmd
handle command exit status SimpleName MethodInvocation SimpleName channel
cmd SimpleName MethodInvocation SimpleName channel
channel SimpleName MethodInvocation SimpleName close
channel SimpleName MethodInvocation BooleanLiteral false
close SimpleName MethodInvocation BooleanLiteral false
override SimpleName MarkerAnnotation MethodDeclaration Modifier protected
override SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
override SimpleName MarkerAnnotation MethodDeclaration SimpleName download
override SimpleName MarkerAnnotation MethodDeclaration SingleVariableDeclaration SimpleName remote
override SimpleName MarkerAnnotation MethodDeclaration SingleVariableDeclaration SimpleName fs
protected Modifier MethodDeclaration PrimitiveType void
protected Modifier MethodDeclaration SimpleName download
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleName remote
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName file system
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleName fs
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName path
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleName local
void PrimitiveType MethodDeclaration SimpleName download
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName remote
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName file system
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName fs
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName path
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName local
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName options
download SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
download SimpleName MethodDeclaration SingleVariableDeclaration SimpleName remote
download SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName file system
download SimpleName MethodDeclaration SingleVariableDeclaration SimpleName fs
download SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName path
download SimpleName MethodDeclaration SingleVariableDeclaration SimpleName local
download SimpleName MethodDeclaration SingleVariableDeclaration SimpleName options
download SimpleName MethodDeclaration SimpleType SimpleName io exception
remote SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName fs
remote SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName local
remote SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName options
remote SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
fs SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName local
fs SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName options
fs SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
local SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName options
local SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
options SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName override
public Modifier TypeDeclaration MethodDeclaration Modifier protected
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName download
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName remote
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName fs
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName local
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName options
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName override
test SimpleName TypeDeclaration MethodDeclaration Modifier protected
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName download
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName remote
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName fs
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName local
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName options
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
