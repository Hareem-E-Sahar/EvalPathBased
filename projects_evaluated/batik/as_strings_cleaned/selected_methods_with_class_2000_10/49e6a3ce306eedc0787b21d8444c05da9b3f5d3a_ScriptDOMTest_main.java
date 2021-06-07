string SimpleName SimpleType ArrayType SingleVariableDeclaration SimpleName arg
systemout QualifiedName MethodInvocation SimpleName println
systemout QualifiedName MethodInvocation StringLiteral --- scripting the dom test ---
println SimpleName MethodInvocation StringLiteral --- scripting the dom test ---
systemout QualifiedName MethodInvocation SimpleName println
systemout QualifiedName MethodInvocation StringLiteral +++ creating an interpreter pool instance +++
println SimpleName MethodInvocation StringLiteral +++ creating an interpreter pool instance +++
interpreter pool SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName pool
class SimpleName MethodInvocation SimpleName for name
class SimpleName MethodInvocation SimpleName pool class
for name SimpleName MethodInvocation SimpleName pool class
class SimpleName MethodInvocation MethodInvocation SimpleName new instance
for name SimpleName MethodInvocation MethodInvocation SimpleName new instance
pool class SimpleName MethodInvocation MethodInvocation SimpleName new instance
interpreter pool SimpleName SimpleType CastExpression MethodInvocation SimpleName new instance
pool SimpleName Assignment CastExpression SimpleType SimpleName interpreter pool
pool SimpleName Assignment CastExpression MethodInvocation SimpleName new instance
throwable SimpleName SimpleType SingleVariableDeclaration SimpleName t
t SimpleName MethodInvocation SimpleName get message
systemerr QualifiedName MethodInvocation SimpleName println
systemerr QualifiedName MethodInvocation MethodInvocation SimpleName t
systemerr QualifiedName MethodInvocation MethodInvocation SimpleName get message
println SimpleName MethodInvocation MethodInvocation SimpleName t
println SimpleName MethodInvocation MethodInvocation SimpleName get message
system SimpleName MethodInvocation SimpleName exit
system SimpleName MethodInvocation NumberLiteral empty
exit SimpleName MethodInvocation NumberLiteral empty
systemout QualifiedName MethodInvocation SimpleName println
systemout QualifiedName MethodInvocation StringLiteral --- creating an textecmascript interpreter ---
println SimpleName MethodInvocation StringLiteral --- creating an textecmascript interpreter ---
pool SimpleName MethodInvocation SimpleName get interpreter
pool SimpleName MethodInvocation StringLiteral textecmascript
get interpreter SimpleName MethodInvocation StringLiteral textecmascript
interpreter SimpleName VariableDeclarationFragment MethodInvocation SimpleName pool
interpreter SimpleName VariableDeclarationFragment MethodInvocation SimpleName get interpreter
interpreter SimpleName VariableDeclarationFragment MethodInvocation StringLiteral textecmascript
final Modifier VariableDeclarationStatement SimpleType SimpleName interpreter
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName interpreter
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName pool
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get interpreter
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation StringLiteral textecmascript
interpreter SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName interpreter
systemerr QualifiedName MethodInvocation SimpleName println
systemerr QualifiedName MethodInvocation StringLiteral *** cant find a textecmascript interpret ***
println SimpleName MethodInvocation StringLiteral *** cant find a textecmascript interpret ***
systemout QualifiedName MethodInvocation SimpleName println
systemout QualifiedName MethodInvocation StringLiteral +++ testing the textecmascript interpreter dom access +++
println SimpleName MethodInvocation StringLiteral +++ testing the textecmascript interpreter dom access +++
doc SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName svgom document
svgom document SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName doc
svgomsvg element SimpleName SimpleType ClassInstanceCreation StringLiteral svg
svgomsvg element SimpleName SimpleType ClassInstanceCreation SimpleName doc
svg StringLiteral ClassInstanceCreation SimpleName doc
svgelmt SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName svgomsvg element
svgelmt SimpleName VariableDeclarationFragment ClassInstanceCreation StringLiteral svg
svgelmt SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName doc
element SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName svgelmt
doc SimpleName MethodInvocation SimpleName append child
doc SimpleName MethodInvocation SimpleName svgelmt
append child SimpleName MethodInvocation SimpleName svgelmt
svgomg element SimpleName SimpleType ClassInstanceCreation StringLiteral svg
svgomg element SimpleName SimpleType ClassInstanceCreation SimpleName doc
svg StringLiteral ClassInstanceCreation SimpleName doc
elmt SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName svgomg element
elmt SimpleName VariableDeclarationFragment ClassInstanceCreation StringLiteral svg
elmt SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName doc
svg element SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName elmt
event target SimpleName SimpleType CastExpression SimpleName elmt
event SimpleName SimpleType SingleVariableDeclaration SimpleName evt
interpreter SimpleName MethodInvocation SimpleName bind object
interpreter SimpleName MethodInvocation StringLiteral event
interpreter SimpleName MethodInvocation SimpleName evt
bind object SimpleName MethodInvocation StringLiteral event
bind object SimpleName MethodInvocation SimpleName evt
event StringLiteral MethodInvocation SimpleName evt
string reader SimpleName SimpleType ClassInstanceCreation StringLiteral testevent
interpreter SimpleName MethodInvocation SimpleName evaluate
interpreter SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName string reader
interpreter SimpleName MethodInvocation ClassInstanceCreation StringLiteral testevent
evaluate SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName string reader
evaluate SimpleName MethodInvocation ClassInstanceCreation StringLiteral testevent
interpreter exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
e SimpleName MethodInvocation SimpleName get message
*** StringLiteral InfixExpression MethodInvocation SimpleName e
*** StringLiteral InfixExpression MethodInvocation SimpleName get message
*** StringLiteral InfixExpression StringLiteral ***
e SimpleName MethodInvocation InfixExpression StringLiteral ***
get message SimpleName MethodInvocation InfixExpression StringLiteral ***
systemerr QualifiedName MethodInvocation SimpleName println
systemerr QualifiedName MethodInvocation InfixExpression StringLiteral ***
systemerr QualifiedName MethodInvocation InfixExpression MethodInvocation SimpleName e
systemerr QualifiedName MethodInvocation InfixExpression MethodInvocation SimpleName get message
systemerr QualifiedName MethodInvocation InfixExpression StringLiteral ***
println SimpleName MethodInvocation InfixExpression StringLiteral ***
println SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName e
println SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get message
println SimpleName MethodInvocation InfixExpression StringLiteral ***
system SimpleName MethodInvocation SimpleName exit
system SimpleName MethodInvocation NumberLiteral empty
exit SimpleName MethodInvocation NumberLiteral empty
io exception SimpleName SimpleType SingleVariableDeclaration SimpleName io
io SimpleName MethodInvocation SimpleName get message
*** StringLiteral InfixExpression MethodInvocation SimpleName io
*** StringLiteral InfixExpression MethodInvocation SimpleName get message
*** StringLiteral InfixExpression StringLiteral ***
io SimpleName MethodInvocation InfixExpression StringLiteral ***
get message SimpleName MethodInvocation InfixExpression StringLiteral ***
systemerr QualifiedName MethodInvocation SimpleName println
systemerr QualifiedName MethodInvocation InfixExpression StringLiteral ***
systemerr QualifiedName MethodInvocation InfixExpression MethodInvocation SimpleName io
systemerr QualifiedName MethodInvocation InfixExpression MethodInvocation SimpleName get message
systemerr QualifiedName MethodInvocation InfixExpression StringLiteral ***
println SimpleName MethodInvocation InfixExpression StringLiteral ***
println SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName io
println SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get message
println SimpleName MethodInvocation InfixExpression StringLiteral ***
system SimpleName MethodInvocation SimpleName exit
system SimpleName MethodInvocation NumberLiteral empty
exit SimpleName MethodInvocation NumberLiteral empty
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName handle event
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName event
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName evt
void PrimitiveType MethodDeclaration SimpleName handle event
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName event
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName evt
handle event SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName event
handle event SimpleName MethodDeclaration SingleVariableDeclaration SimpleName evt
elmt SimpleName CastExpression ParenthesizedExpression MethodInvocation SimpleName add event listener
elmt SimpleName CastExpression ParenthesizedExpression MethodInvocation StringLiteral dom node inserted
elmt SimpleName CastExpression ParenthesizedExpression MethodInvocation BooleanLiteral true
add event listener SimpleName MethodInvocation StringLiteral dom node inserted
add event listener SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName event listener
add event listener SimpleName MethodInvocation BooleanLiteral true
dom node inserted StringLiteral MethodInvocation ClassInstanceCreation SimpleType SimpleName event listener
dom node inserted StringLiteral MethodInvocation BooleanLiteral true
event listener SimpleName SimpleType ClassInstanceCreation MethodInvocation BooleanLiteral true
svgelmt SimpleName MethodInvocation SimpleName append child
svgelmt SimpleName MethodInvocation SimpleName elmt
append child SimpleName MethodInvocation SimpleName elmt
script loc SimpleName InfixExpression StringLiteral testjs
file reader SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName script loc
file reader SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral testjs
interpreter SimpleName MethodInvocation SimpleName evaluate
interpreter SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName buffered reader
evaluate SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName buffered reader
value SimpleName VariableDeclarationFragment MethodInvocation SimpleName interpreter
value SimpleName VariableDeclarationFragment MethodInvocation SimpleName evaluate
object SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName value
interpreter exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
e SimpleName MethodInvocation SimpleName get message
*** cant load file StringLiteral InfixExpression MethodInvocation SimpleName e
*** cant load file StringLiteral InfixExpression MethodInvocation SimpleName get message
*** cant load file StringLiteral InfixExpression StringLiteral ***
e SimpleName MethodInvocation InfixExpression StringLiteral ***
get message SimpleName MethodInvocation InfixExpression StringLiteral ***
systemerr QualifiedName MethodInvocation SimpleName println
systemerr QualifiedName MethodInvocation InfixExpression StringLiteral *** cant load file
systemerr QualifiedName MethodInvocation InfixExpression MethodInvocation SimpleName e
systemerr QualifiedName MethodInvocation InfixExpression MethodInvocation SimpleName get message
systemerr QualifiedName MethodInvocation InfixExpression StringLiteral ***
println SimpleName MethodInvocation InfixExpression StringLiteral *** cant load file
println SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName e
println SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get message
println SimpleName MethodInvocation InfixExpression StringLiteral ***
system SimpleName MethodInvocation SimpleName exit
system SimpleName MethodInvocation NumberLiteral empty
exit SimpleName MethodInvocation NumberLiteral empty
io exception SimpleName SimpleType SingleVariableDeclaration SimpleName io
io SimpleName MethodInvocation SimpleName get message
*** cant load file StringLiteral InfixExpression MethodInvocation SimpleName io
*** cant load file StringLiteral InfixExpression MethodInvocation SimpleName get message
*** cant load file StringLiteral InfixExpression StringLiteral ***
io SimpleName MethodInvocation InfixExpression StringLiteral ***
get message SimpleName MethodInvocation InfixExpression StringLiteral ***
systemerr QualifiedName MethodInvocation SimpleName println
systemerr QualifiedName MethodInvocation InfixExpression StringLiteral *** cant load file
systemerr QualifiedName MethodInvocation InfixExpression MethodInvocation SimpleName io
systemerr QualifiedName MethodInvocation InfixExpression MethodInvocation SimpleName get message
systemerr QualifiedName MethodInvocation InfixExpression StringLiteral ***
println SimpleName MethodInvocation InfixExpression StringLiteral *** cant load file
println SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName io
println SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get message
println SimpleName MethodInvocation InfixExpression StringLiteral ***
system SimpleName MethodInvocation SimpleName exit
system SimpleName MethodInvocation NumberLiteral empty
exit SimpleName MethodInvocation NumberLiteral empty
svgom rect element SimpleName SimpleType ClassInstanceCreation StringLiteral svg
svgom rect element SimpleName SimpleType ClassInstanceCreation SimpleName doc
svg StringLiteral ClassInstanceCreation SimpleName doc
elmt SimpleName Assignment ClassInstanceCreation SimpleType SimpleName svgom rect element
elmt SimpleName Assignment ClassInstanceCreation StringLiteral svg
elmt SimpleName Assignment ClassInstanceCreation SimpleName doc
elmt SimpleName MethodInvocation SimpleName append child
elmt SimpleName MethodInvocation Assignment SimpleName elmt
elmt SimpleName MethodInvocation Assignment ClassInstanceCreation StringLiteral svg
elmt SimpleName MethodInvocation Assignment ClassInstanceCreation SimpleName doc
append child SimpleName MethodInvocation Assignment SimpleName elmt
append child SimpleName MethodInvocation Assignment ClassInstanceCreation StringLiteral svg
append child SimpleName MethodInvocation Assignment ClassInstanceCreation SimpleName doc
elmt SimpleName MethodInvocation SimpleName get attribute
elmt SimpleName MethodInvocation StringLiteral x
get attribute SimpleName MethodInvocation StringLiteral x
elmt SimpleName MethodInvocation MethodInvocation SimpleName equals
get attribute SimpleName MethodInvocation MethodInvocation SimpleName equals
x StringLiteral MethodInvocation MethodInvocation SimpleName equals
elmt SimpleName MethodInvocation MethodInvocation StringLiteral empty
get attribute SimpleName MethodInvocation MethodInvocation StringLiteral empty
x StringLiteral MethodInvocation MethodInvocation StringLiteral empty
equals SimpleName MethodInvocation StringLiteral empty
systemerr QualifiedName MethodInvocation SimpleName println
systemerr QualifiedName MethodInvocation StringLiteral *** script incorrectly update the dom
println SimpleName MethodInvocation StringLiteral *** script incorrectly update the dom
system SimpleName MethodInvocation SimpleName exit
system SimpleName MethodInvocation NumberLiteral empty
exit SimpleName MethodInvocation NumberLiteral empty
elmt SimpleName MethodInvocation SimpleName set attribute
elmt SimpleName MethodInvocation StringLiteral x
elmt SimpleName MethodInvocation StringLiteral empty
set attribute SimpleName MethodInvocation StringLiteral x
set attribute SimpleName MethodInvocation StringLiteral empty
x StringLiteral MethodInvocation StringLiteral empty
systemout QualifiedName MethodInvocation SimpleName println
systemout QualifiedName MethodInvocation StringLiteral --- creating an textpython interpreter ---
println SimpleName MethodInvocation StringLiteral --- creating an textpython interpreter ---
pool SimpleName MethodInvocation SimpleName get interpreter
pool SimpleName MethodInvocation StringLiteral textpython
get interpreter SimpleName MethodInvocation StringLiteral textpython
interpreter SimpleName VariableDeclarationFragment MethodInvocation SimpleName pool
interpreter SimpleName VariableDeclarationFragment MethodInvocation SimpleName get interpreter
interpreter SimpleName VariableDeclarationFragment MethodInvocation StringLiteral textpython
final Modifier VariableDeclarationStatement SimpleType SimpleName interpreter
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName interpreter
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName pool
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get interpreter
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation StringLiteral textpython
interpreter SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName interpreter
systemerr QualifiedName MethodInvocation SimpleName println
systemerr QualifiedName MethodInvocation StringLiteral *** cant find a textpython interpret ***
println SimpleName MethodInvocation StringLiteral *** cant find a textpython interpret ***
systemout QualifiedName MethodInvocation SimpleName println
systemout QualifiedName MethodInvocation StringLiteral +++ testing the textpython interpreter dom access +++
println SimpleName MethodInvocation StringLiteral +++ testing the textpython interpreter dom access +++
doc SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName svgom document
svgom document SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName doc
svgomsvg element SimpleName SimpleType ClassInstanceCreation StringLiteral svg
svgomsvg element SimpleName SimpleType ClassInstanceCreation SimpleName doc
svg StringLiteral ClassInstanceCreation SimpleName doc
svgelmt SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName svgomsvg element
svgelmt SimpleName VariableDeclarationFragment ClassInstanceCreation StringLiteral svg
svgelmt SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName doc
element SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName svgelmt
doc SimpleName MethodInvocation SimpleName append child
doc SimpleName MethodInvocation SimpleName svgelmt
append child SimpleName MethodInvocation SimpleName svgelmt
svgomg element SimpleName SimpleType ClassInstanceCreation StringLiteral svg
svgomg element SimpleName SimpleType ClassInstanceCreation SimpleName doc
svg StringLiteral ClassInstanceCreation SimpleName doc
elmt SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName svgomg element
elmt SimpleName VariableDeclarationFragment ClassInstanceCreation StringLiteral svg
elmt SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName doc
svg element SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName elmt
event target SimpleName SimpleType CastExpression SimpleName elmt
event SimpleName SimpleType SingleVariableDeclaration SimpleName evt
interpreter SimpleName MethodInvocation SimpleName bind object
interpreter SimpleName MethodInvocation StringLiteral event
interpreter SimpleName MethodInvocation SimpleName evt
bind object SimpleName MethodInvocation StringLiteral event
bind object SimpleName MethodInvocation SimpleName evt
event StringLiteral MethodInvocation SimpleName evt
string reader SimpleName SimpleType ClassInstanceCreation StringLiteral testevent
interpreter SimpleName MethodInvocation SimpleName evaluate
interpreter SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName string reader
interpreter SimpleName MethodInvocation ClassInstanceCreation StringLiteral testevent
evaluate SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName string reader
evaluate SimpleName MethodInvocation ClassInstanceCreation StringLiteral testevent
interpreter exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
e SimpleName MethodInvocation SimpleName get message
*** StringLiteral InfixExpression MethodInvocation SimpleName e
*** StringLiteral InfixExpression MethodInvocation SimpleName get message
*** StringLiteral InfixExpression StringLiteral ***
e SimpleName MethodInvocation InfixExpression StringLiteral ***
get message SimpleName MethodInvocation InfixExpression StringLiteral ***
systemerr QualifiedName MethodInvocation SimpleName println
systemerr QualifiedName MethodInvocation InfixExpression StringLiteral ***
systemerr QualifiedName MethodInvocation InfixExpression MethodInvocation SimpleName e
systemerr QualifiedName MethodInvocation InfixExpression MethodInvocation SimpleName get message
systemerr QualifiedName MethodInvocation InfixExpression StringLiteral ***
println SimpleName MethodInvocation InfixExpression StringLiteral ***
println SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName e
println SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get message
println SimpleName MethodInvocation InfixExpression StringLiteral ***
system SimpleName MethodInvocation SimpleName exit
system SimpleName MethodInvocation NumberLiteral empty
exit SimpleName MethodInvocation NumberLiteral empty
io exception SimpleName SimpleType SingleVariableDeclaration SimpleName io
io SimpleName MethodInvocation SimpleName get message
*** StringLiteral InfixExpression MethodInvocation SimpleName io
*** StringLiteral InfixExpression MethodInvocation SimpleName get message
*** StringLiteral InfixExpression StringLiteral ***
io SimpleName MethodInvocation InfixExpression StringLiteral ***
get message SimpleName MethodInvocation InfixExpression StringLiteral ***
systemerr QualifiedName MethodInvocation SimpleName println
systemerr QualifiedName MethodInvocation InfixExpression StringLiteral ***
systemerr QualifiedName MethodInvocation InfixExpression MethodInvocation SimpleName io
systemerr QualifiedName MethodInvocation InfixExpression MethodInvocation SimpleName get message
systemerr QualifiedName MethodInvocation InfixExpression StringLiteral ***
println SimpleName MethodInvocation InfixExpression StringLiteral ***
println SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName io
println SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get message
println SimpleName MethodInvocation InfixExpression StringLiteral ***
system SimpleName MethodInvocation SimpleName exit
system SimpleName MethodInvocation NumberLiteral empty
exit SimpleName MethodInvocation NumberLiteral empty
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName handle event
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName event
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName evt
void PrimitiveType MethodDeclaration SimpleName handle event
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName event
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName evt
handle event SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName event
handle event SimpleName MethodDeclaration SingleVariableDeclaration SimpleName evt
elmt SimpleName CastExpression ParenthesizedExpression MethodInvocation SimpleName add event listener
elmt SimpleName CastExpression ParenthesizedExpression MethodInvocation StringLiteral dom node inserted
elmt SimpleName CastExpression ParenthesizedExpression MethodInvocation BooleanLiteral true
add event listener SimpleName MethodInvocation StringLiteral dom node inserted
add event listener SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName event listener
add event listener SimpleName MethodInvocation BooleanLiteral true
dom node inserted StringLiteral MethodInvocation ClassInstanceCreation SimpleType SimpleName event listener
dom node inserted StringLiteral MethodInvocation BooleanLiteral true
event listener SimpleName SimpleType ClassInstanceCreation MethodInvocation BooleanLiteral true
svgelmt SimpleName MethodInvocation SimpleName append child
svgelmt SimpleName MethodInvocation SimpleName elmt
append child SimpleName MethodInvocation SimpleName elmt
script loc SimpleName InfixExpression StringLiteral testpy
file reader SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName script loc
file reader SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral testpy
interpreter SimpleName MethodInvocation SimpleName evaluate
interpreter SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName buffered reader
evaluate SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName buffered reader
value SimpleName VariableDeclarationFragment MethodInvocation SimpleName interpreter
value SimpleName VariableDeclarationFragment MethodInvocation SimpleName evaluate
object SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName value
interpreter exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
e SimpleName MethodInvocation SimpleName get message
*** StringLiteral InfixExpression MethodInvocation SimpleName e
*** StringLiteral InfixExpression MethodInvocation SimpleName get message
*** StringLiteral InfixExpression StringLiteral ***
e SimpleName MethodInvocation InfixExpression StringLiteral ***
get message SimpleName MethodInvocation InfixExpression StringLiteral ***
systemerr QualifiedName MethodInvocation SimpleName println
systemerr QualifiedName MethodInvocation InfixExpression StringLiteral ***
systemerr QualifiedName MethodInvocation InfixExpression MethodInvocation SimpleName e
systemerr QualifiedName MethodInvocation InfixExpression MethodInvocation SimpleName get message
systemerr QualifiedName MethodInvocation InfixExpression StringLiteral ***
println SimpleName MethodInvocation InfixExpression StringLiteral ***
println SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName e
println SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get message
println SimpleName MethodInvocation InfixExpression StringLiteral ***
system SimpleName MethodInvocation SimpleName exit
system SimpleName MethodInvocation NumberLiteral empty
exit SimpleName MethodInvocation NumberLiteral empty
io exception SimpleName SimpleType SingleVariableDeclaration SimpleName io
io SimpleName MethodInvocation SimpleName get message
*** StringLiteral InfixExpression MethodInvocation SimpleName io
*** StringLiteral InfixExpression MethodInvocation SimpleName get message
*** StringLiteral InfixExpression StringLiteral ***
io SimpleName MethodInvocation InfixExpression StringLiteral ***
get message SimpleName MethodInvocation InfixExpression StringLiteral ***
systemerr QualifiedName MethodInvocation SimpleName println
systemerr QualifiedName MethodInvocation InfixExpression StringLiteral ***
systemerr QualifiedName MethodInvocation InfixExpression MethodInvocation SimpleName io
systemerr QualifiedName MethodInvocation InfixExpression MethodInvocation SimpleName get message
systemerr QualifiedName MethodInvocation InfixExpression StringLiteral ***
println SimpleName MethodInvocation InfixExpression StringLiteral ***
println SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName io
println SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get message
println SimpleName MethodInvocation InfixExpression StringLiteral ***
system SimpleName MethodInvocation SimpleName exit
system SimpleName MethodInvocation NumberLiteral empty
exit SimpleName MethodInvocation NumberLiteral empty
svgom rect element SimpleName SimpleType ClassInstanceCreation StringLiteral svg
svgom rect element SimpleName SimpleType ClassInstanceCreation SimpleName doc
svg StringLiteral ClassInstanceCreation SimpleName doc
elmt SimpleName Assignment ClassInstanceCreation SimpleType SimpleName svgom rect element
elmt SimpleName Assignment ClassInstanceCreation StringLiteral svg
elmt SimpleName Assignment ClassInstanceCreation SimpleName doc
elmt SimpleName MethodInvocation SimpleName append child
elmt SimpleName MethodInvocation Assignment SimpleName elmt
elmt SimpleName MethodInvocation Assignment ClassInstanceCreation StringLiteral svg
elmt SimpleName MethodInvocation Assignment ClassInstanceCreation SimpleName doc
append child SimpleName MethodInvocation Assignment SimpleName elmt
append child SimpleName MethodInvocation Assignment ClassInstanceCreation StringLiteral svg
append child SimpleName MethodInvocation Assignment ClassInstanceCreation SimpleName doc
elmt SimpleName MethodInvocation SimpleName get attribute
elmt SimpleName MethodInvocation StringLiteral x
get attribute SimpleName MethodInvocation StringLiteral x
elmt SimpleName MethodInvocation MethodInvocation SimpleName equals
get attribute SimpleName MethodInvocation MethodInvocation SimpleName equals
x StringLiteral MethodInvocation MethodInvocation SimpleName equals
elmt SimpleName MethodInvocation MethodInvocation StringLiteral empty
get attribute SimpleName MethodInvocation MethodInvocation StringLiteral empty
x StringLiteral MethodInvocation MethodInvocation StringLiteral empty
equals SimpleName MethodInvocation StringLiteral empty
systemerr QualifiedName MethodInvocation SimpleName println
systemerr QualifiedName MethodInvocation StringLiteral *** script incorrectly update the dom
println SimpleName MethodInvocation StringLiteral *** script incorrectly update the dom
system SimpleName MethodInvocation SimpleName exit
system SimpleName MethodInvocation NumberLiteral empty
exit SimpleName MethodInvocation NumberLiteral empty
elmt SimpleName MethodInvocation SimpleName set attribute
elmt SimpleName MethodInvocation StringLiteral x
elmt SimpleName MethodInvocation StringLiteral empty
set attribute SimpleName MethodInvocation StringLiteral x
set attribute SimpleName MethodInvocation StringLiteral empty
x StringLiteral MethodInvocation StringLiteral empty
systemout QualifiedName MethodInvocation SimpleName println
systemout QualifiedName MethodInvocation StringLiteral --- creating an texttcl interpreter ---
println SimpleName MethodInvocation StringLiteral --- creating an texttcl interpreter ---
pool SimpleName MethodInvocation SimpleName get interpreter
pool SimpleName MethodInvocation StringLiteral texttcl
get interpreter SimpleName MethodInvocation StringLiteral texttcl
interpreter SimpleName VariableDeclarationFragment MethodInvocation SimpleName pool
interpreter SimpleName VariableDeclarationFragment MethodInvocation SimpleName get interpreter
interpreter SimpleName VariableDeclarationFragment MethodInvocation StringLiteral texttcl
final Modifier VariableDeclarationStatement SimpleType SimpleName interpreter
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName interpreter
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName pool
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get interpreter
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation StringLiteral texttcl
interpreter SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName interpreter
systemerr QualifiedName MethodInvocation SimpleName println
systemerr QualifiedName MethodInvocation StringLiteral *** cant find a texttcl interpret ***
println SimpleName MethodInvocation StringLiteral *** cant find a texttcl interpret ***
systemout QualifiedName MethodInvocation SimpleName println
systemout QualifiedName MethodInvocation StringLiteral +++ testing the texttcl interpreter dom access +++
println SimpleName MethodInvocation StringLiteral +++ testing the texttcl interpreter dom access +++
doc SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName svgom document
svgom document SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName doc
svgomsvg element SimpleName SimpleType ClassInstanceCreation StringLiteral svg
svgomsvg element SimpleName SimpleType ClassInstanceCreation SimpleName doc
svg StringLiteral ClassInstanceCreation SimpleName doc
svgelmt SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName svgomsvg element
svgelmt SimpleName VariableDeclarationFragment ClassInstanceCreation StringLiteral svg
svgelmt SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName doc
element SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName svgelmt
doc SimpleName MethodInvocation SimpleName append child
doc SimpleName MethodInvocation SimpleName svgelmt
append child SimpleName MethodInvocation SimpleName svgelmt
svgomg element SimpleName SimpleType ClassInstanceCreation StringLiteral svg
svgomg element SimpleName SimpleType ClassInstanceCreation SimpleName doc
svg StringLiteral ClassInstanceCreation SimpleName doc
elmt SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName svgomg element
elmt SimpleName VariableDeclarationFragment ClassInstanceCreation StringLiteral svg
elmt SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName doc
svg element SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName elmt
event target SimpleName SimpleType CastExpression SimpleName elmt
event SimpleName SimpleType SingleVariableDeclaration SimpleName evt
interpreter SimpleName MethodInvocation SimpleName bind object
interpreter SimpleName MethodInvocation StringLiteral event
interpreter SimpleName MethodInvocation SimpleName evt
bind object SimpleName MethodInvocation StringLiteral event
bind object SimpleName MethodInvocation SimpleName evt
event StringLiteral MethodInvocation SimpleName evt
string reader SimpleName SimpleType ClassInstanceCreation StringLiteral test event
interpreter SimpleName MethodInvocation SimpleName evaluate
interpreter SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName string reader
interpreter SimpleName MethodInvocation ClassInstanceCreation StringLiteral test event
evaluate SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName string reader
evaluate SimpleName MethodInvocation ClassInstanceCreation StringLiteral test event
interpreter exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
e SimpleName MethodInvocation SimpleName get message
*** StringLiteral InfixExpression MethodInvocation SimpleName e
*** StringLiteral InfixExpression MethodInvocation SimpleName get message
*** StringLiteral InfixExpression StringLiteral ***
e SimpleName MethodInvocation InfixExpression StringLiteral ***
get message SimpleName MethodInvocation InfixExpression StringLiteral ***
systemerr QualifiedName MethodInvocation SimpleName println
systemerr QualifiedName MethodInvocation InfixExpression StringLiteral ***
systemerr QualifiedName MethodInvocation InfixExpression MethodInvocation SimpleName e
systemerr QualifiedName MethodInvocation InfixExpression MethodInvocation SimpleName get message
systemerr QualifiedName MethodInvocation InfixExpression StringLiteral ***
println SimpleName MethodInvocation InfixExpression StringLiteral ***
println SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName e
println SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get message
println SimpleName MethodInvocation InfixExpression StringLiteral ***
system SimpleName MethodInvocation SimpleName exit
system SimpleName MethodInvocation NumberLiteral empty
exit SimpleName MethodInvocation NumberLiteral empty
io exception SimpleName SimpleType SingleVariableDeclaration SimpleName io
io SimpleName MethodInvocation SimpleName get message
*** StringLiteral InfixExpression MethodInvocation SimpleName io
*** StringLiteral InfixExpression MethodInvocation SimpleName get message
*** StringLiteral InfixExpression StringLiteral ***
io SimpleName MethodInvocation InfixExpression StringLiteral ***
get message SimpleName MethodInvocation InfixExpression StringLiteral ***
systemerr QualifiedName MethodInvocation SimpleName println
systemerr QualifiedName MethodInvocation InfixExpression StringLiteral ***
systemerr QualifiedName MethodInvocation InfixExpression MethodInvocation SimpleName io
