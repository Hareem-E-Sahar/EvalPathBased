string SimpleName SimpleType SingleVariableDeclaration SimpleName text
document SimpleName SimpleType SingleVariableDeclaration SimpleName doc
xml resource descriptor SimpleName MethodInvocation SimpleName get xml parser class name
saxsvg document factory SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName xml resource descriptor
saxsvg document factory SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get xml parser class name
df SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName saxsvg document factory
df SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName xml resource descriptor
df SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName get xml parser class name
saxsvg document factory SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName df
url SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName url obj
doc SimpleName InstanceofExpression SimpleType SimpleName svgom document
svgom document SimpleName SimpleType CastExpression SimpleName doc
doc SimpleName CastExpression ParenthesizedExpression MethodInvocation SimpleName get url object
url obj SimpleName Assignment MethodInvocation SimpleName get url object
bridge context SimpleName MethodInvocation SimpleName get document
svgom document SimpleName SimpleType CastExpression MethodInvocation SimpleName bridge context
svgom document SimpleName SimpleType CastExpression MethodInvocation SimpleName get document
url obj SimpleName Assignment MethodInvocation SimpleName get url object
url obj SimpleName MethodInvocation SimpleName to string
url obj SimpleName InfixExpression ParenthesizedExpression ConditionalExpression StringLiteral empty
empty StringLiteral ConditionalExpression MethodInvocation SimpleName url obj
empty StringLiteral ConditionalExpression MethodInvocation SimpleName to string
uri SimpleName VariableDeclarationFragment ConditionalExpression StringLiteral empty
uri SimpleName VariableDeclarationFragment ConditionalExpression MethodInvocation SimpleName url obj
uri SimpleName VariableDeclarationFragment ConditionalExpression MethodInvocation SimpleName to string
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName uri
string reader SimpleName SimpleType ClassInstanceCreation SimpleName text
df SimpleName MethodInvocation SimpleName create document
df SimpleName MethodInvocation SimpleName uri
df SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName string reader
df SimpleName MethodInvocation ClassInstanceCreation SimpleName text
create document SimpleName MethodInvocation SimpleName uri
create document SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName string reader
create document SimpleName MethodInvocation ClassInstanceCreation SimpleName text
uri SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName string reader
uri SimpleName MethodInvocation ClassInstanceCreation SimpleName text
d SimpleName VariableDeclarationFragment MethodInvocation SimpleName df
d SimpleName VariableDeclarationFragment MethodInvocation SimpleName create document
d SimpleName VariableDeclarationFragment MethodInvocation SimpleName uri
d SimpleName VariableDeclarationFragment MethodInvocation ClassInstanceCreation SimpleName text
document SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName d
doc SimpleName InfixExpression IfStatement ReturnStatement SimpleName d
doc SimpleName MethodInvocation SimpleName create document fragment
result SimpleName VariableDeclarationFragment MethodInvocation SimpleName doc
result SimpleName VariableDeclarationFragment MethodInvocation SimpleName create document fragment
node SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName result
d SimpleName MethodInvocation SimpleName get document element
doc SimpleName MethodInvocation SimpleName import node
doc SimpleName MethodInvocation MethodInvocation SimpleName d
doc SimpleName MethodInvocation MethodInvocation SimpleName get document element
doc SimpleName MethodInvocation BooleanLiteral true
import node SimpleName MethodInvocation MethodInvocation SimpleName d
import node SimpleName MethodInvocation MethodInvocation SimpleName get document element
import node SimpleName MethodInvocation BooleanLiteral true
d SimpleName MethodInvocation MethodInvocation BooleanLiteral true
get document element SimpleName MethodInvocation MethodInvocation BooleanLiteral true
result SimpleName MethodInvocation SimpleName append child
result SimpleName MethodInvocation MethodInvocation SimpleName doc
result SimpleName MethodInvocation MethodInvocation SimpleName import node
result SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName d
result SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get document element
result SimpleName MethodInvocation MethodInvocation BooleanLiteral true
append child SimpleName MethodInvocation MethodInvocation SimpleName doc
append child SimpleName MethodInvocation MethodInvocation SimpleName import node
append child SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName d
append child SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get document element
append child SimpleName MethodInvocation MethodInvocation BooleanLiteral true
exception SimpleName SimpleType SingleVariableDeclaration SimpleName ex
doc SimpleName InstanceofExpression SimpleType SimpleName svgom document
fragment prefix SimpleName MethodInvocation SimpleName length
text SimpleName MethodInvocation SimpleName length
fragment suffix SimpleName MethodInvocation SimpleName length
fragment prefix SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName text
fragment prefix SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName length
length SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName text
length SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName length
fragment prefix SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName fragment suffix
fragment prefix SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName length
length SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName fragment suffix
length SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName length
text SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName fragment suffix
text SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName length
length SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName fragment suffix
length SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName length
sb SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName string buffer
string buffer SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName sb
sb SimpleName MethodInvocation SimpleName append
sb SimpleName MethodInvocation SimpleName fragment prefix
append SimpleName MethodInvocation SimpleName fragment prefix
sb SimpleName MethodInvocation SimpleName append
sb SimpleName MethodInvocation SimpleName text
append SimpleName MethodInvocation SimpleName text
sb SimpleName MethodInvocation SimpleName append
sb SimpleName MethodInvocation SimpleName fragment suffix
append SimpleName MethodInvocation SimpleName fragment suffix
sb SimpleName MethodInvocation SimpleName to string
new text SimpleName VariableDeclarationFragment MethodInvocation SimpleName sb
new text SimpleName VariableDeclarationFragment MethodInvocation SimpleName to string
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName new text
string reader SimpleName SimpleType ClassInstanceCreation SimpleName new text
df SimpleName MethodInvocation SimpleName create document
df SimpleName MethodInvocation SimpleName uri
df SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName string reader
df SimpleName MethodInvocation ClassInstanceCreation SimpleName new text
create document SimpleName MethodInvocation SimpleName uri
create document SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName string reader
create document SimpleName MethodInvocation ClassInstanceCreation SimpleName new text
uri SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName string reader
uri SimpleName MethodInvocation ClassInstanceCreation SimpleName new text
d SimpleName VariableDeclarationFragment MethodInvocation SimpleName df
d SimpleName VariableDeclarationFragment MethodInvocation SimpleName create document
d SimpleName VariableDeclarationFragment MethodInvocation SimpleName uri
d SimpleName VariableDeclarationFragment MethodInvocation ClassInstanceCreation SimpleName new text
document SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName d
doc SimpleName Assignment SimpleName d
d SimpleName MethodInvocation SimpleName get document element
d SimpleName MethodInvocation MethodInvocation SimpleName get first child
get document element SimpleName MethodInvocation MethodInvocation SimpleName get first child
n SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName d
n SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get document element
n SimpleName VariableDeclarationFragment MethodInvocation SimpleName get first child
node SimpleName SimpleType VariableDeclarationExpression VariableDeclarationFragment SimpleName n
n SimpleName MethodInvocation SimpleName get next sibling
n SimpleName Assignment MethodInvocation SimpleName n
n SimpleName Assignment MethodInvocation SimpleName get next sibling
n SimpleName MethodInvocation SimpleName get node type
n SimpleName MethodInvocation InfixExpression QualifiedName nodeelement node
get node type SimpleName MethodInvocation InfixExpression QualifiedName nodeelement node
doc SimpleName MethodInvocation SimpleName import node
doc SimpleName MethodInvocation SimpleName n
doc SimpleName MethodInvocation BooleanLiteral true
import node SimpleName MethodInvocation SimpleName n
import node SimpleName MethodInvocation BooleanLiteral true
n SimpleName MethodInvocation BooleanLiteral true
n SimpleName Assignment MethodInvocation SimpleName doc
n SimpleName Assignment MethodInvocation SimpleName import node
n SimpleName Assignment MethodInvocation SimpleName n
n SimpleName Assignment MethodInvocation BooleanLiteral true
doc SimpleName MethodInvocation SimpleName create document fragment
result SimpleName VariableDeclarationFragment MethodInvocation SimpleName doc
result SimpleName VariableDeclarationFragment MethodInvocation SimpleName create document fragment
node SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName result
result SimpleName MethodInvocation SimpleName append child
result SimpleName MethodInvocation SimpleName n
append child SimpleName MethodInvocation SimpleName n
n SimpleName InfixExpression ForStatement Assignment SimpleName n
exception SimpleName SimpleType SingleVariableDeclaration SimpleName exc
sax document factory SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName sdf
doc SimpleName MethodInvocation SimpleName get implementation
xml resource descriptor SimpleName MethodInvocation SimpleName get xml parser class name
sax document factory SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName doc
sax document factory SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get implementation
sax document factory SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName xml resource descriptor
sax document factory SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get xml parser class name
doc SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName xml resource descriptor
doc SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get xml parser class name
get implementation SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName xml resource descriptor
get implementation SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get xml parser class name
sdf SimpleName Assignment ClassInstanceCreation SimpleType SimpleName sax document factory
sdf SimpleName Assignment ClassInstanceCreation MethodInvocation SimpleName doc
sdf SimpleName Assignment ClassInstanceCreation MethodInvocation SimpleName get implementation
sdf SimpleName Assignment ClassInstanceCreation MethodInvocation SimpleName xml resource descriptor
sdf SimpleName Assignment ClassInstanceCreation MethodInvocation SimpleName get xml parser class name
xml resource descriptor SimpleName MethodInvocation SimpleName get xml parser class name
sax document factory SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName xml resource descriptor
sax document factory SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get xml parser class name
sdf SimpleName Assignment ClassInstanceCreation SimpleType SimpleName sax document factory
sdf SimpleName Assignment ClassInstanceCreation MethodInvocation SimpleName xml resource descriptor
sdf SimpleName Assignment ClassInstanceCreation MethodInvocation SimpleName get xml parser class name
string reader SimpleName SimpleType ClassInstanceCreation SimpleName text
sdf SimpleName MethodInvocation SimpleName create document
sdf SimpleName MethodInvocation SimpleName uri
sdf SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName string reader
sdf SimpleName MethodInvocation ClassInstanceCreation SimpleName text
create document SimpleName MethodInvocation SimpleName uri
create document SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName string reader
create document SimpleName MethodInvocation ClassInstanceCreation SimpleName text
uri SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName string reader
uri SimpleName MethodInvocation ClassInstanceCreation SimpleName text
d SimpleName VariableDeclarationFragment MethodInvocation SimpleName sdf
d SimpleName VariableDeclarationFragment MethodInvocation SimpleName create document
d SimpleName VariableDeclarationFragment MethodInvocation SimpleName uri
d SimpleName VariableDeclarationFragment MethodInvocation ClassInstanceCreation SimpleName text
document SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName d
doc SimpleName InfixExpression IfStatement ReturnStatement SimpleName d
doc SimpleName MethodInvocation SimpleName create document fragment
result SimpleName VariableDeclarationFragment MethodInvocation SimpleName doc
result SimpleName VariableDeclarationFragment MethodInvocation SimpleName create document fragment
node SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName result
d SimpleName MethodInvocation SimpleName get document element
doc SimpleName MethodInvocation SimpleName import node
doc SimpleName MethodInvocation MethodInvocation SimpleName d
doc SimpleName MethodInvocation MethodInvocation SimpleName get document element
doc SimpleName MethodInvocation BooleanLiteral true
import node SimpleName MethodInvocation MethodInvocation SimpleName d
import node SimpleName MethodInvocation MethodInvocation SimpleName get document element
import node SimpleName MethodInvocation BooleanLiteral true
d SimpleName MethodInvocation MethodInvocation BooleanLiteral true
get document element SimpleName MethodInvocation MethodInvocation BooleanLiteral true
result SimpleName MethodInvocation SimpleName append child
result SimpleName MethodInvocation MethodInvocation SimpleName doc
result SimpleName MethodInvocation MethodInvocation SimpleName import node
result SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName d
result SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get document element
result SimpleName MethodInvocation MethodInvocation BooleanLiteral true
append child SimpleName MethodInvocation MethodInvocation SimpleName doc
append child SimpleName MethodInvocation MethodInvocation SimpleName import node
append child SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName d
append child SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get document element
append child SimpleName MethodInvocation MethodInvocation BooleanLiteral true
exception SimpleName SimpleType SingleVariableDeclaration SimpleName ext
user agent SimpleName MethodInvocation SimpleName display error
user agent SimpleName MethodInvocation SimpleName ext
display error SimpleName MethodInvocation SimpleName ext
public Modifier MethodDeclaration SimpleType SimpleName node
public Modifier MethodDeclaration SimpleName parse xml
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName text
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName document
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName doc
node SimpleName SimpleType MethodDeclaration SimpleName parse xml
node SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName text
node SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName doc
parse xml SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
parse xml SimpleName MethodDeclaration SingleVariableDeclaration SimpleName text
parse xml SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName document
parse xml SimpleName MethodDeclaration SingleVariableDeclaration SimpleName doc
text SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName doc
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName node
public Modifier TypeDeclaration MethodDeclaration SimpleName parse xml
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName text
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName doc
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName node
test SimpleName TypeDeclaration MethodDeclaration SimpleName parse xml
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName text
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName doc
