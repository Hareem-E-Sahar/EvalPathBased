multi reader SimpleName SimpleType ClassInstanceCreation SimpleName fs
multi reader SimpleName SimpleType ClassInstanceCreation SimpleName conf
multi reader SimpleName SimpleType ClassInstanceCreation StringLiteral many maps
fs SimpleName ClassInstanceCreation SimpleName conf
fs SimpleName ClassInstanceCreation StringLiteral many maps
conf SimpleName ClassInstanceCreation StringLiteral many maps
reader SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName multi reader
reader SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName fs
reader SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName conf
reader SimpleName VariableDeclarationFragment ClassInstanceCreation StringLiteral many maps
multi reader SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName reader
key SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName int writable
int writable SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName key
value SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName bytes writable
bytes writable SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName value
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression NumberLiteral empty
i SimpleName InfixExpression NumberLiteral empty
reader SimpleName MethodInvocation SimpleName next
reader SimpleName MethodInvocation SimpleName key
reader SimpleName MethodInvocation SimpleName value
next SimpleName MethodInvocation SimpleName key
next SimpleName MethodInvocation SimpleName value
key SimpleName MethodInvocation SimpleName value
assert true SimpleName MethodInvocation MethodInvocation SimpleName reader
assert true SimpleName MethodInvocation MethodInvocation SimpleName next
assert true SimpleName MethodInvocation MethodInvocation SimpleName key
assert true SimpleName MethodInvocation MethodInvocation SimpleName value
key SimpleName MethodInvocation SimpleName get
assert equals SimpleName MethodInvocation SimpleName i
assert equals SimpleName MethodInvocation MethodInvocation SimpleName key
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get
i SimpleName MethodInvocation MethodInvocation SimpleName key
i SimpleName MethodInvocation MethodInvocation SimpleName get
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression NumberLiteral empty
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
empty NumberLiteral InfixExpression ForStatement PostfixExpression SimpleName i
some value StringLiteral MethodInvocation SimpleName get bytes
bytes writable SimpleName SimpleType ClassInstanceCreation MethodInvocation StringLiteral some value
bytes writable SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get bytes
value SimpleName MethodInvocation SimpleName compare to
value SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName bytes writable
value SimpleName MethodInvocation ClassInstanceCreation MethodInvocation StringLiteral some value
value SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get bytes
compare to SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName bytes writable
compare to SimpleName MethodInvocation ClassInstanceCreation MethodInvocation StringLiteral some value
compare to SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get bytes
assert equals SimpleName MethodInvocation MethodInvocation SimpleName value
assert equals SimpleName MethodInvocation MethodInvocation SimpleName compare to
assert equals SimpleName MethodInvocation NumberLiteral empty
value SimpleName MethodInvocation MethodInvocation NumberLiteral empty
compare to SimpleName MethodInvocation MethodInvocation NumberLiteral empty
reader SimpleName MethodInvocation SimpleName next
reader SimpleName MethodInvocation SimpleName key
reader SimpleName MethodInvocation SimpleName value
next SimpleName MethodInvocation SimpleName key
next SimpleName MethodInvocation SimpleName value
key SimpleName MethodInvocation SimpleName value
assert false SimpleName MethodInvocation MethodInvocation SimpleName reader
assert false SimpleName MethodInvocation MethodInvocation SimpleName next
assert false SimpleName MethodInvocation MethodInvocation SimpleName key
assert false SimpleName MethodInvocation MethodInvocation SimpleName value
key SimpleName MethodInvocation SimpleName set
key SimpleName MethodInvocation NumberLiteral empty
set SimpleName MethodInvocation NumberLiteral empty
reader SimpleName MethodInvocation SimpleName seek
reader SimpleName MethodInvocation SimpleName key
seek SimpleName MethodInvocation SimpleName key
assert true SimpleName MethodInvocation MethodInvocation SimpleName reader
assert true SimpleName MethodInvocation MethodInvocation SimpleName seek
assert true SimpleName MethodInvocation MethodInvocation SimpleName key
scan SimpleName MethodInvocation SimpleName reader
scan SimpleName MethodInvocation NumberLiteral empty
reader SimpleName MethodInvocation NumberLiteral empty
key SimpleName MethodInvocation SimpleName set
key SimpleName MethodInvocation NumberLiteral empty
set SimpleName MethodInvocation NumberLiteral empty
reader SimpleName MethodInvocation SimpleName seek
reader SimpleName MethodInvocation SimpleName key
seek SimpleName MethodInvocation SimpleName key
assert false SimpleName MethodInvocation MethodInvocation SimpleName reader
assert false SimpleName MethodInvocation MethodInvocation SimpleName seek
assert false SimpleName MethodInvocation MethodInvocation SimpleName key
scan SimpleName MethodInvocation SimpleName reader
scan SimpleName MethodInvocation NumberLiteral empty
reader SimpleName MethodInvocation NumberLiteral empty
key SimpleName MethodInvocation SimpleName set
key SimpleName MethodInvocation NumberLiteral empty
set SimpleName MethodInvocation NumberLiteral empty
reader SimpleName MethodInvocation SimpleName seek
reader SimpleName MethodInvocation SimpleName key
seek SimpleName MethodInvocation SimpleName key
assert false SimpleName MethodInvocation MethodInvocation SimpleName reader
assert false SimpleName MethodInvocation MethodInvocation SimpleName seek
assert false SimpleName MethodInvocation MethodInvocation SimpleName key
reader SimpleName MethodInvocation SimpleName next
reader SimpleName MethodInvocation SimpleName key
reader SimpleName MethodInvocation SimpleName value
next SimpleName MethodInvocation SimpleName key
next SimpleName MethodInvocation SimpleName value
key SimpleName MethodInvocation SimpleName value
assert false SimpleName MethodInvocation MethodInvocation SimpleName reader
assert false SimpleName MethodInvocation MethodInvocation SimpleName next
assert false SimpleName MethodInvocation MethodInvocation SimpleName key
assert false SimpleName MethodInvocation MethodInvocation SimpleName value
key SimpleName MethodInvocation SimpleName set
key SimpleName MethodInvocation PrefixExpression NumberLiteral empty
set SimpleName MethodInvocation PrefixExpression NumberLiteral empty
reader SimpleName MethodInvocation SimpleName seek
reader SimpleName MethodInvocation SimpleName key
seek SimpleName MethodInvocation SimpleName key
assert false SimpleName MethodInvocation MethodInvocation SimpleName reader
assert false SimpleName MethodInvocation MethodInvocation SimpleName seek
assert false SimpleName MethodInvocation MethodInvocation SimpleName key
key SimpleName MethodInvocation SimpleName set
key SimpleName MethodInvocation NumberLiteral empty
set SimpleName MethodInvocation NumberLiteral empty
reader SimpleName MethodInvocation SimpleName next
reader SimpleName MethodInvocation SimpleName key
reader SimpleName MethodInvocation SimpleName value
next SimpleName MethodInvocation SimpleName key
next SimpleName MethodInvocation SimpleName value
key SimpleName MethodInvocation SimpleName value
assert true SimpleName MethodInvocation MethodInvocation SimpleName reader
assert true SimpleName MethodInvocation MethodInvocation SimpleName next
assert true SimpleName MethodInvocation MethodInvocation SimpleName key
assert true SimpleName MethodInvocation MethodInvocation SimpleName value
key SimpleName MethodInvocation SimpleName get
assert equals SimpleName MethodInvocation NumberLiteral empty
assert equals SimpleName MethodInvocation MethodInvocation SimpleName key
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get
empty NumberLiteral MethodInvocation MethodInvocation SimpleName key
empty NumberLiteral MethodInvocation MethodInvocation SimpleName get
reader SimpleName MethodInvocation SimpleName close
path SimpleName SimpleType ClassInstanceCreation StringLiteral many mapseven
fs SimpleName MethodInvocation SimpleName delete
fs SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName path
fs SimpleName MethodInvocation ClassInstanceCreation StringLiteral many mapseven
fs SimpleName MethodInvocation BooleanLiteral true
delete SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName path
delete SimpleName MethodInvocation ClassInstanceCreation StringLiteral many mapseven
delete SimpleName MethodInvocation BooleanLiteral true
path SimpleName SimpleType ClassInstanceCreation MethodInvocation BooleanLiteral true
many mapseven StringLiteral ClassInstanceCreation MethodInvocation BooleanLiteral true
multi reader SimpleName SimpleType ClassInstanceCreation SimpleName fs
multi reader SimpleName SimpleType ClassInstanceCreation SimpleName conf
multi reader SimpleName SimpleType ClassInstanceCreation StringLiteral many maps
fs SimpleName ClassInstanceCreation SimpleName conf
fs SimpleName ClassInstanceCreation StringLiteral many maps
conf SimpleName ClassInstanceCreation StringLiteral many maps
reader SimpleName Assignment ClassInstanceCreation SimpleType SimpleName multi reader
reader SimpleName Assignment ClassInstanceCreation SimpleName fs
reader SimpleName Assignment ClassInstanceCreation SimpleName conf
reader SimpleName Assignment ClassInstanceCreation StringLiteral many maps
key SimpleName MethodInvocation SimpleName set
key SimpleName MethodInvocation NumberLiteral empty
set SimpleName MethodInvocation NumberLiteral empty
reader SimpleName MethodInvocation SimpleName seek
reader SimpleName MethodInvocation SimpleName key
seek SimpleName MethodInvocation SimpleName key
assert true SimpleName MethodInvocation MethodInvocation SimpleName reader
assert true SimpleName MethodInvocation MethodInvocation SimpleName seek
assert true SimpleName MethodInvocation MethodInvocation SimpleName key
scan odd SimpleName MethodInvocation SimpleName reader
scan odd SimpleName MethodInvocation NumberLiteral empty
reader SimpleName MethodInvocation NumberLiteral empty
key SimpleName MethodInvocation SimpleName set
key SimpleName MethodInvocation NumberLiteral empty
set SimpleName MethodInvocation NumberLiteral empty
reader SimpleName MethodInvocation SimpleName seek
reader SimpleName MethodInvocation SimpleName key
seek SimpleName MethodInvocation SimpleName key
assert false SimpleName MethodInvocation MethodInvocation SimpleName reader
assert false SimpleName MethodInvocation MethodInvocation SimpleName seek
assert false SimpleName MethodInvocation MethodInvocation SimpleName key
reader SimpleName MethodInvocation SimpleName next
reader SimpleName MethodInvocation SimpleName key
reader SimpleName MethodInvocation SimpleName value
next SimpleName MethodInvocation SimpleName key
next SimpleName MethodInvocation SimpleName value
key SimpleName MethodInvocation SimpleName value
assert false SimpleName MethodInvocation MethodInvocation SimpleName reader
assert false SimpleName MethodInvocation MethodInvocation SimpleName next
assert false SimpleName MethodInvocation MethodInvocation SimpleName key
assert false SimpleName MethodInvocation MethodInvocation SimpleName value
key SimpleName MethodInvocation SimpleName set
key SimpleName MethodInvocation PrefixExpression NumberLiteral empty
set SimpleName MethodInvocation PrefixExpression NumberLiteral empty
reader SimpleName MethodInvocation SimpleName seek
reader SimpleName MethodInvocation SimpleName key
seek SimpleName MethodInvocation SimpleName key
assert false SimpleName MethodInvocation MethodInvocation SimpleName reader
assert false SimpleName MethodInvocation MethodInvocation SimpleName seek
assert false SimpleName MethodInvocation MethodInvocation SimpleName key
key SimpleName MethodInvocation SimpleName set
key SimpleName MethodInvocation NumberLiteral empty
set SimpleName MethodInvocation NumberLiteral empty
reader SimpleName MethodInvocation SimpleName next
reader SimpleName MethodInvocation SimpleName key
reader SimpleName MethodInvocation SimpleName value
next SimpleName MethodInvocation SimpleName key
next SimpleName MethodInvocation SimpleName value
key SimpleName MethodInvocation SimpleName value
assert true SimpleName MethodInvocation MethodInvocation SimpleName reader
assert true SimpleName MethodInvocation MethodInvocation SimpleName next
assert true SimpleName MethodInvocation MethodInvocation SimpleName key
assert true SimpleName MethodInvocation MethodInvocation SimpleName value
key SimpleName MethodInvocation SimpleName get
assert equals SimpleName MethodInvocation NumberLiteral empty
assert equals SimpleName MethodInvocation MethodInvocation SimpleName key
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get
empty NumberLiteral MethodInvocation MethodInvocation SimpleName key
empty NumberLiteral MethodInvocation MethodInvocation SimpleName get
reader SimpleName MethodInvocation SimpleName close
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test multi reader
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName io exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test multi reader
public Modifier MethodDeclaration SimpleType SimpleName io exception
void PrimitiveType MethodDeclaration SimpleName test multi reader
void PrimitiveType MethodDeclaration SimpleType SimpleName io exception
test multi reader SimpleName MethodDeclaration SimpleType SimpleName io exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test multi reader
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test multi reader
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
