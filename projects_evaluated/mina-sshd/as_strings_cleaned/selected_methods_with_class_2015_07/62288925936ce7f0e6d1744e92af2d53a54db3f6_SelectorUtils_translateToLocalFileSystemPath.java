string SimpleName SimpleType SingleVariableDeclaration SimpleName path
char PrimitiveType SingleVariableDeclaration SimpleName path separator
string SimpleName SimpleType SingleVariableDeclaration SimpleName fs separator
apply slashify rules SimpleName MethodInvocation SimpleName path
apply slashify rules SimpleName MethodInvocation SimpleName path separator
path SimpleName MethodInvocation SimpleName path separator
slashified SimpleName VariableDeclarationFragment MethodInvocation SimpleName apply slashify rules
slashified SimpleName VariableDeclarationFragment MethodInvocation SimpleName path
slashified SimpleName VariableDeclarationFragment MethodInvocation SimpleName path separator
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName slashified
translate to local path SimpleName MethodInvocation SimpleName slashified
local path SimpleName VariableDeclarationFragment MethodInvocation SimpleName translate to local path
local path SimpleName VariableDeclarationFragment MethodInvocation SimpleName slashified
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName local path
translate to file system path SimpleName MethodInvocation SimpleName local path
translate to file system path SimpleName MethodInvocation QualifiedName fileseparator
translate to file system path SimpleName MethodInvocation SimpleName fs separator
local path SimpleName MethodInvocation QualifiedName fileseparator
local path SimpleName MethodInvocation SimpleName fs separator
fileseparator QualifiedName MethodInvocation SimpleName fs separator
public Modifier MethodDeclaration Modifier static
public Modifier MethodDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SimpleName translate to local file system path
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName path
public Modifier MethodDeclaration SingleVariableDeclaration PrimitiveType char
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName path separator
static Modifier MethodDeclaration SimpleType SimpleName string
static Modifier MethodDeclaration SimpleName translate to local file system path
static Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName path
static Modifier MethodDeclaration SingleVariableDeclaration PrimitiveType char
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName path separator
static Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName fs separator
string SimpleName SimpleType MethodDeclaration SimpleName translate to local file system path
string SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName path
string SimpleName SimpleType MethodDeclaration SingleVariableDeclaration PrimitiveType char
string SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName path separator
string SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName fs separator
translate to local file system path SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
translate to local file system path SimpleName MethodDeclaration SingleVariableDeclaration SimpleName path
translate to local file system path SimpleName MethodDeclaration SingleVariableDeclaration PrimitiveType char
translate to local file system path SimpleName MethodDeclaration SingleVariableDeclaration SimpleName path separator
translate to local file system path SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
translate to local file system path SimpleName MethodDeclaration SingleVariableDeclaration SimpleName fs separator
path SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType char
path SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName path separator
path SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName fs separator
char PrimitiveType SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName fs separator
path separator SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName fs separator
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration Modifier static
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName string
public Modifier TypeDeclaration MethodDeclaration SimpleName translate to local file system path
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName path
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType char
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName path separator
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName fs separator
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration Modifier static
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName string
test SimpleName TypeDeclaration MethodDeclaration SimpleName translate to local file system path
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName path
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration PrimitiveType char
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName path separator
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName fs separator
