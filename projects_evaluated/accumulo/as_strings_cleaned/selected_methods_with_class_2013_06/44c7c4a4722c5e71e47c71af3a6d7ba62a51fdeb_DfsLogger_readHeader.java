file system SimpleName SimpleType SingleVariableDeclaration SimpleName fs
path SimpleName SimpleType SingleVariableDeclaration SimpleName path
map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
string SimpleName SimpleType ParameterizedType SimpleType SimpleName string
map SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName opts
string SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName opts
string SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName opts
fs SimpleName MethodInvocation SimpleName open
fs SimpleName MethodInvocation SimpleName path
open SimpleName MethodInvocation SimpleName path
file SimpleName VariableDeclarationFragment MethodInvocation SimpleName fs
file SimpleName VariableDeclarationFragment MethodInvocation SimpleName open
file SimpleName VariableDeclarationFragment MethodInvocation SimpleName path
fs data input stream SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName file
log file header v SimpleName MethodInvocation SimpleName get bytes
magic SimpleName VariableDeclarationFragment MethodInvocation SimpleName log file header v
magic SimpleName VariableDeclarationFragment MethodInvocation SimpleName get bytes
byte PrimitiveType ArrayType VariableDeclarationStatement VariableDeclarationFragment SimpleName magic
byte PrimitiveType ArrayType ArrayCreation QualifiedName magiclength
buffer SimpleName VariableDeclarationFragment ArrayCreation ArrayType PrimitiveType byte
buffer SimpleName VariableDeclarationFragment ArrayCreation QualifiedName magiclength
byte PrimitiveType ArrayType VariableDeclarationStatement VariableDeclarationFragment SimpleName buffer
file SimpleName MethodInvocation SimpleName read fully
file SimpleName MethodInvocation SimpleName buffer
read fully SimpleName MethodInvocation SimpleName buffer
arrays SimpleName MethodInvocation SimpleName equals
arrays SimpleName MethodInvocation SimpleName buffer
arrays SimpleName MethodInvocation SimpleName magic
equals SimpleName MethodInvocation SimpleName buffer
equals SimpleName MethodInvocation SimpleName magic
buffer SimpleName MethodInvocation SimpleName magic
file SimpleName MethodInvocation SimpleName read int
count SimpleName VariableDeclarationFragment MethodInvocation SimpleName file
count SimpleName VariableDeclarationFragment MethodInvocation SimpleName read int
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName count
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName file
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName read int
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression SimpleName count
file SimpleName MethodInvocation SimpleName read utf
key SimpleName VariableDeclarationFragment MethodInvocation SimpleName file
key SimpleName VariableDeclarationFragment MethodInvocation SimpleName read utf
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName key
file SimpleName MethodInvocation SimpleName read utf
value SimpleName VariableDeclarationFragment MethodInvocation SimpleName file
value SimpleName VariableDeclarationFragment MethodInvocation SimpleName read utf
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName value
opts SimpleName MethodInvocation SimpleName put
opts SimpleName MethodInvocation SimpleName key
opts SimpleName MethodInvocation SimpleName value
put SimpleName MethodInvocation SimpleName key
put SimpleName MethodInvocation SimpleName value
key SimpleName MethodInvocation SimpleName value
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName count
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
count SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
file SimpleName MethodInvocation SimpleName seek
file SimpleName MethodInvocation NumberLiteral empty
seek SimpleName MethodInvocation NumberLiteral empty
io exception SimpleName SimpleType SingleVariableDeclaration SimpleName ex
file SimpleName MethodInvocation SimpleName seek
file SimpleName MethodInvocation NumberLiteral empty
seek SimpleName MethodInvocation NumberLiteral empty
public Modifier MethodDeclaration Modifier static
public Modifier MethodDeclaration SimpleType SimpleName fs data input stream
public Modifier MethodDeclaration SimpleName read header
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName file system
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName fs
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName path
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName path
static Modifier MethodDeclaration SimpleType SimpleName fs data input stream
static Modifier MethodDeclaration SimpleName read header
static Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName file system
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName fs
static Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName path
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName path
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName opts
fs data input stream SimpleName SimpleType MethodDeclaration SimpleName read header
fs data input stream SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName fs
fs data input stream SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName path
fs data input stream SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName opts
fs data input stream SimpleName SimpleType MethodDeclaration SimpleType SimpleName io exception
read header SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName file system
read header SimpleName MethodDeclaration SingleVariableDeclaration SimpleName fs
read header SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName path
read header SimpleName MethodDeclaration SingleVariableDeclaration SimpleName path
read header SimpleName MethodDeclaration SingleVariableDeclaration SimpleName opts
read header SimpleName MethodDeclaration SimpleType SimpleName io exception
fs SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName path
fs SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName opts
fs SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
path SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName opts
path SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
opts SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration Modifier static
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName fs data input stream
public Modifier TypeDeclaration MethodDeclaration SimpleName read header
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName fs
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName path
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName opts
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration Modifier static
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName fs data input stream
test SimpleName TypeDeclaration MethodDeclaration SimpleName read header
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName fs
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName path
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName opts
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName io exception