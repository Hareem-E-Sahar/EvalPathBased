slice query SimpleName SimpleType SingleVariableDeclaration SimpleName query
query SimpleName MethodInvocation SimpleName get slice end
query SimpleName MethodInvocation MethodInvocation SimpleName length
get slice end SimpleName MethodInvocation MethodInvocation SimpleName length
query SimpleName MethodInvocation MethodInvocation InfixExpression NumberLiteral empty
get slice end SimpleName MethodInvocation MethodInvocation InfixExpression NumberLiteral empty
length SimpleName MethodInvocation InfixExpression NumberLiteral empty
query SimpleName MethodInvocation SimpleName get slice start
query SimpleName MethodInvocation MethodInvocation SimpleName as
get slice start SimpleName MethodInvocation MethodInvocation SimpleName as
query SimpleName MethodInvocation MethodInvocation QualifiedName static bufferarray factory
get slice start SimpleName MethodInvocation MethodInvocation QualifiedName static bufferarray factory
as SimpleName MethodInvocation QualifiedName static bufferarray factory
empty NumberLiteral InfixExpression ConditionalExpression MethodInvocation SimpleName as
empty NumberLiteral InfixExpression ConditionalExpression MethodInvocation QualifiedName static bufferarray factory
col start bytes SimpleName VariableDeclarationFragment ConditionalExpression InfixExpression NumberLiteral empty
col start bytes SimpleName VariableDeclarationFragment ConditionalExpression MethodInvocation SimpleName as
col start bytes SimpleName VariableDeclarationFragment ConditionalExpression MethodInvocation QualifiedName static bufferarray factory
byte PrimitiveType ArrayType VariableDeclarationStatement VariableDeclarationFragment SimpleName col start bytes
query SimpleName MethodInvocation SimpleName get slice end
query SimpleName MethodInvocation MethodInvocation SimpleName length
get slice end SimpleName MethodInvocation MethodInvocation SimpleName length
query SimpleName MethodInvocation MethodInvocation InfixExpression NumberLiteral empty
get slice end SimpleName MethodInvocation MethodInvocation InfixExpression NumberLiteral empty
length SimpleName MethodInvocation InfixExpression NumberLiteral empty
query SimpleName MethodInvocation SimpleName get slice end
query SimpleName MethodInvocation MethodInvocation SimpleName as
get slice end SimpleName MethodInvocation MethodInvocation SimpleName as
query SimpleName MethodInvocation MethodInvocation QualifiedName static bufferarray factory
get slice end SimpleName MethodInvocation MethodInvocation QualifiedName static bufferarray factory
as SimpleName MethodInvocation QualifiedName static bufferarray factory
empty NumberLiteral InfixExpression ConditionalExpression MethodInvocation SimpleName as
empty NumberLiteral InfixExpression ConditionalExpression MethodInvocation QualifiedName static bufferarray factory
col end bytes SimpleName VariableDeclarationFragment ConditionalExpression InfixExpression NumberLiteral empty
col end bytes SimpleName VariableDeclarationFragment ConditionalExpression MethodInvocation SimpleName as
col end bytes SimpleName VariableDeclarationFragment ConditionalExpression MethodInvocation QualifiedName static bufferarray factory
byte PrimitiveType ArrayType VariableDeclarationStatement VariableDeclarationFragment SimpleName col end bytes
column range filter SimpleName SimpleType ClassInstanceCreation SimpleName col start bytes
column range filter SimpleName SimpleType ClassInstanceCreation BooleanLiteral true
column range filter SimpleName SimpleType ClassInstanceCreation SimpleName col end bytes
column range filter SimpleName SimpleType ClassInstanceCreation BooleanLiteral false
col start bytes SimpleName ClassInstanceCreation BooleanLiteral true
col start bytes SimpleName ClassInstanceCreation SimpleName col end bytes
col start bytes SimpleName ClassInstanceCreation BooleanLiteral false
true BooleanLiteral ClassInstanceCreation SimpleName col end bytes
true BooleanLiteral ClassInstanceCreation BooleanLiteral false
col end bytes SimpleName ClassInstanceCreation BooleanLiteral false
filter SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName column range filter
filter SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName col start bytes
filter SimpleName VariableDeclarationFragment ClassInstanceCreation BooleanLiteral true
filter SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName col end bytes
filter SimpleName VariableDeclarationFragment ClassInstanceCreation BooleanLiteral false
filter SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName filter
query SimpleName MethodInvocation SimpleName has limit
query SimpleName MethodInvocation SimpleName get limit
column pagination filter SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName query
column pagination filter SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get limit
column pagination filter SimpleName SimpleType ClassInstanceCreation NumberLiteral empty
query SimpleName MethodInvocation ClassInstanceCreation NumberLiteral empty
get limit SimpleName MethodInvocation ClassInstanceCreation NumberLiteral empty
filter list SimpleName SimpleType ClassInstanceCreation QualifiedName filter listoperatormust pass all
filter list SimpleName SimpleType ClassInstanceCreation SimpleName filter
filter list SimpleName SimpleType ClassInstanceCreation ClassInstanceCreation NumberLiteral empty
filter listoperatormust pass all QualifiedName ClassInstanceCreation SimpleName filter
filter listoperatormust pass all QualifiedName ClassInstanceCreation ClassInstanceCreation SimpleType SimpleName column pagination filter
filter listoperatormust pass all QualifiedName ClassInstanceCreation ClassInstanceCreation MethodInvocation SimpleName query
filter listoperatormust pass all QualifiedName ClassInstanceCreation ClassInstanceCreation MethodInvocation SimpleName get limit
filter listoperatormust pass all QualifiedName ClassInstanceCreation ClassInstanceCreation NumberLiteral empty
filter SimpleName ClassInstanceCreation ClassInstanceCreation SimpleType SimpleName column pagination filter
filter SimpleName ClassInstanceCreation ClassInstanceCreation MethodInvocation SimpleName query
filter SimpleName ClassInstanceCreation ClassInstanceCreation MethodInvocation SimpleName get limit
filter SimpleName ClassInstanceCreation ClassInstanceCreation NumberLiteral empty
filter SimpleName Assignment ClassInstanceCreation SimpleType SimpleName filter list
filter SimpleName Assignment ClassInstanceCreation QualifiedName filter listoperatormust pass all
filter SimpleName Assignment ClassInstanceCreation SimpleName filter
filter SimpleName Assignment ClassInstanceCreation ClassInstanceCreation NumberLiteral empty
logger SimpleName MethodInvocation SimpleName debug
logger SimpleName MethodInvocation StringLiteral generated h base filter {}
logger SimpleName MethodInvocation SimpleName filter
debug SimpleName MethodInvocation StringLiteral generated h base filter {}
debug SimpleName MethodInvocation SimpleName filter
generated h base filter {} StringLiteral MethodInvocation SimpleName filter
public Modifier MethodDeclaration Modifier static
public Modifier MethodDeclaration SimpleType SimpleName filter
public Modifier MethodDeclaration SimpleName get filter
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName slice query
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName query
public Modifier MethodDeclaration Block ReturnStatement SimpleName filter
static Modifier MethodDeclaration SimpleType SimpleName filter
static Modifier MethodDeclaration SimpleName get filter
static Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName slice query
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName query
static Modifier MethodDeclaration Block ReturnStatement SimpleName filter
filter SimpleName SimpleType MethodDeclaration SimpleName get filter
filter SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName query
get filter SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName slice query
get filter SimpleName MethodDeclaration SingleVariableDeclaration SimpleName query
get filter SimpleName MethodDeclaration Block ReturnStatement SimpleName filter
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration Modifier static
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName filter
public Modifier TypeDeclaration MethodDeclaration SimpleName get filter
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName query
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration Modifier static
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName filter
test SimpleName TypeDeclaration MethodDeclaration SimpleName get filter
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName query