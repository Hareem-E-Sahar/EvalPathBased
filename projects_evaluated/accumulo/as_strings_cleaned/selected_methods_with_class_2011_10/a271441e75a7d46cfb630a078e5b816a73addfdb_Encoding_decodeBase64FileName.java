string SimpleName SimpleType SingleVariableDeclaration SimpleName node
node SimpleName MethodInvocation SimpleName length
node SimpleName MethodInvocation InfixExpression NumberLiteral empty
length SimpleName MethodInvocation InfixExpression NumberLiteral empty
node SimpleName MethodInvocation InfixExpression InfixExpression NumberLiteral empty
length SimpleName MethodInvocation InfixExpression InfixExpression NumberLiteral empty
empty NumberLiteral InfixExpression InfixExpression NumberLiteral empty
node SimpleName Assignment StringLiteral =
node SimpleName MethodInvocation SimpleName replace
node SimpleName MethodInvocation CharacterLiteral empty
node SimpleName MethodInvocation CharacterLiteral /
replace SimpleName MethodInvocation CharacterLiteral empty
replace SimpleName MethodInvocation CharacterLiteral /
empty CharacterLiteral MethodInvocation CharacterLiteral /
node SimpleName MethodInvocation MethodInvocation SimpleName replace
replace SimpleName MethodInvocation MethodInvocation SimpleName replace
empty CharacterLiteral MethodInvocation MethodInvocation SimpleName replace
/ CharacterLiteral MethodInvocation MethodInvocation SimpleName replace
node SimpleName MethodInvocation MethodInvocation CharacterLiteral -
replace SimpleName MethodInvocation MethodInvocation CharacterLiteral -
empty CharacterLiteral MethodInvocation MethodInvocation CharacterLiteral -
/ CharacterLiteral MethodInvocation MethodInvocation CharacterLiteral -
node SimpleName MethodInvocation MethodInvocation CharacterLiteral +
replace SimpleName MethodInvocation MethodInvocation CharacterLiteral +
empty CharacterLiteral MethodInvocation MethodInvocation CharacterLiteral +
/ CharacterLiteral MethodInvocation MethodInvocation CharacterLiteral +
replace SimpleName MethodInvocation CharacterLiteral -
replace SimpleName MethodInvocation CharacterLiteral +
- CharacterLiteral MethodInvocation CharacterLiteral +
node SimpleName Assignment MethodInvocation MethodInvocation SimpleName node
node SimpleName Assignment MethodInvocation MethodInvocation SimpleName replace
node SimpleName Assignment MethodInvocation MethodInvocation CharacterLiteral empty
node SimpleName Assignment MethodInvocation MethodInvocation CharacterLiteral /
node SimpleName Assignment MethodInvocation SimpleName replace
node SimpleName Assignment MethodInvocation CharacterLiteral -
node SimpleName Assignment MethodInvocation CharacterLiteral +
node SimpleName MethodInvocation SimpleName get bytes
base SimpleName MethodInvocation SimpleName decode base
base SimpleName MethodInvocation MethodInvocation SimpleName node
base SimpleName MethodInvocation MethodInvocation SimpleName get bytes
decode base SimpleName MethodInvocation MethodInvocation SimpleName node
decode base SimpleName MethodInvocation MethodInvocation SimpleName get bytes
public Modifier MethodDeclaration Modifier static
public Modifier MethodDeclaration ArrayType PrimitiveType byte
public Modifier MethodDeclaration SimpleName decode base file name
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName node
static Modifier MethodDeclaration ArrayType PrimitiveType byte
static Modifier MethodDeclaration SimpleName decode base file name
static Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName node
byte PrimitiveType ArrayType MethodDeclaration SimpleName decode base file name
byte PrimitiveType ArrayType MethodDeclaration SingleVariableDeclaration SimpleName node
decode base file name SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
decode base file name SimpleName MethodDeclaration SingleVariableDeclaration SimpleName node
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration Modifier static
public Modifier TypeDeclaration MethodDeclaration ArrayType PrimitiveType byte
public Modifier TypeDeclaration MethodDeclaration SimpleName decode base file name
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName node
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration Modifier static
test SimpleName TypeDeclaration MethodDeclaration ArrayType PrimitiveType byte
test SimpleName TypeDeclaration MethodDeclaration SimpleName decode base file name
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName node