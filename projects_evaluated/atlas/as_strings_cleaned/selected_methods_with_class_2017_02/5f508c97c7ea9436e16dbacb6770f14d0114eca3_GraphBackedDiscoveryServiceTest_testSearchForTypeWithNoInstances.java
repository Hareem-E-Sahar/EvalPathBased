create required attr def SimpleName MethodInvocation StringLiteral a
create required attr def SimpleName MethodInvocation QualifiedName data typesint type
a StringLiteral MethodInvocation QualifiedName data typesint type
create class type def SimpleName MethodInvocation StringLiteral empty type
create class type def SimpleName MethodInvocation MethodInvocation SimpleName create required attr def
create class type def SimpleName MethodInvocation MethodInvocation StringLiteral a
create class type def SimpleName MethodInvocation MethodInvocation QualifiedName data typesint type
empty type StringLiteral MethodInvocation MethodInvocation SimpleName create required attr def
empty type StringLiteral MethodInvocation MethodInvocation StringLiteral a
empty type StringLiteral MethodInvocation MethodInvocation QualifiedName data typesint type
empty SimpleName VariableDeclarationFragment MethodInvocation SimpleName create class type def
empty SimpleName VariableDeclarationFragment MethodInvocation StringLiteral empty type
empty SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName create required attr def
empty SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation StringLiteral a
empty SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation QualifiedName data typesint type
hierarchical type definition SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName empty
type system SimpleName MethodInvocation SimpleName get instance
type system SimpleName MethodInvocation MethodInvocation SimpleName define class types
get instance SimpleName MethodInvocation MethodInvocation SimpleName define class types
type system SimpleName MethodInvocation MethodInvocation SimpleName empty
get instance SimpleName MethodInvocation MethodInvocation SimpleName empty
define class types SimpleName MethodInvocation SimpleName empty
dsl query SimpleName VariableDeclarationFragment StringLiteral empty type
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName dsl query
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment StringLiteral empty type
search by dsl SimpleName MethodInvocation SimpleName dsl query
json results SimpleName VariableDeclarationFragment MethodInvocation SimpleName search by dsl
json results SimpleName VariableDeclarationFragment MethodInvocation SimpleName dsl query
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName json results
assert not null SimpleName MethodInvocation SimpleName json results
json object SimpleName SimpleType ClassInstanceCreation SimpleName json results
results SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName json object
results SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName json results
json object SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName results
results SimpleName MethodInvocation SimpleName length
assert equals SimpleName MethodInvocation MethodInvocation SimpleName results
assert equals SimpleName MethodInvocation MethodInvocation SimpleName length
assert equals SimpleName MethodInvocation NumberLiteral empty
results SimpleName MethodInvocation MethodInvocation NumberLiteral empty
length SimpleName MethodInvocation MethodInvocation NumberLiteral empty
results SimpleName MethodInvocation SimpleName get json array
results SimpleName MethodInvocation StringLiteral rows
get json array SimpleName MethodInvocation StringLiteral rows
rows SimpleName VariableDeclarationFragment MethodInvocation SimpleName results
rows SimpleName VariableDeclarationFragment MethodInvocation SimpleName get json array
rows SimpleName VariableDeclarationFragment MethodInvocation StringLiteral rows
json array SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName rows
assert not null SimpleName MethodInvocation SimpleName rows
rows SimpleName MethodInvocation SimpleName length
assert equals SimpleName MethodInvocation MethodInvocation SimpleName rows
assert equals SimpleName MethodInvocation MethodInvocation SimpleName length
assert equals SimpleName MethodInvocation NumberLiteral empty
rows SimpleName MethodInvocation MethodInvocation NumberLiteral empty
length SimpleName MethodInvocation MethodInvocation NumberLiteral empty
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test search for type with no instances
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test search for type with no instances
public Modifier MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration SimpleName test search for type with no instances
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
test search for type with no instances SimpleName MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test search for type with no instances
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test search for type with no instances
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
