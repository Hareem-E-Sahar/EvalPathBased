string SimpleName SimpleType ArrayType SingleVariableDeclaration SimpleName args
args SimpleName ArrayAccess NumberLiteral empty
dir SimpleName VariableDeclarationFragment ArrayAccess SimpleName args
dir SimpleName VariableDeclarationFragment ArrayAccess NumberLiteral empty
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName dir
args SimpleName ArrayAccess NumberLiteral empty
integer SimpleName MethodInvocation SimpleName parse int
integer SimpleName MethodInvocation ArrayAccess SimpleName args
integer SimpleName MethodInvocation ArrayAccess NumberLiteral empty
parse int SimpleName MethodInvocation ArrayAccess SimpleName args
parse int SimpleName MethodInvocation ArrayAccess NumberLiteral empty
num threads SimpleName VariableDeclarationFragment MethodInvocation SimpleName integer
num threads SimpleName VariableDeclarationFragment MethodInvocation SimpleName parse int
num threads SimpleName VariableDeclarationFragment MethodInvocation ArrayAccess SimpleName args
num threads SimpleName VariableDeclarationFragment MethodInvocation ArrayAccess NumberLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName num threads
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName integer
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName parse int
args SimpleName ArrayAccess NumberLiteral empty
long SimpleName MethodInvocation SimpleName parse long
long SimpleName MethodInvocation ArrayAccess SimpleName args
long SimpleName MethodInvocation ArrayAccess NumberLiteral empty
parse long SimpleName MethodInvocation ArrayAccess SimpleName args
parse long SimpleName MethodInvocation ArrayAccess NumberLiteral empty
start SimpleName VariableDeclarationFragment MethodInvocation SimpleName long
start SimpleName VariableDeclarationFragment MethodInvocation SimpleName parse long
start SimpleName VariableDeclarationFragment MethodInvocation ArrayAccess SimpleName args
start SimpleName VariableDeclarationFragment MethodInvocation ArrayAccess NumberLiteral empty
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName start
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName long
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName parse long
args SimpleName ArrayAccess NumberLiteral empty
long SimpleName MethodInvocation SimpleName parse long
long SimpleName MethodInvocation ArrayAccess SimpleName args
long SimpleName MethodInvocation ArrayAccess NumberLiteral empty
parse long SimpleName MethodInvocation ArrayAccess SimpleName args
parse long SimpleName MethodInvocation ArrayAccess NumberLiteral empty
end SimpleName VariableDeclarationFragment MethodInvocation SimpleName long
end SimpleName VariableDeclarationFragment MethodInvocation SimpleName parse long
end SimpleName VariableDeclarationFragment MethodInvocation ArrayAccess SimpleName args
end SimpleName VariableDeclarationFragment MethodInvocation ArrayAccess NumberLiteral empty
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName end
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName long
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName parse long
args SimpleName ArrayAccess NumberLiteral empty
long SimpleName MethodInvocation SimpleName parse long
long SimpleName MethodInvocation ArrayAccess SimpleName args
long SimpleName MethodInvocation ArrayAccess NumberLiteral empty
parse long SimpleName MethodInvocation ArrayAccess SimpleName args
parse long SimpleName MethodInvocation ArrayAccess NumberLiteral empty
numsplits SimpleName VariableDeclarationFragment MethodInvocation SimpleName long
numsplits SimpleName VariableDeclarationFragment MethodInvocation SimpleName parse long
numsplits SimpleName VariableDeclarationFragment MethodInvocation ArrayAccess SimpleName args
numsplits SimpleName VariableDeclarationFragment MethodInvocation ArrayAccess NumberLiteral empty
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName numsplits
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName long
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName parse long
end SimpleName InfixExpression SimpleName start
double PrimitiveType CastExpression SimpleName numsplits
math SimpleName MethodInvocation SimpleName round
math SimpleName MethodInvocation InfixExpression CastExpression PrimitiveType double
math SimpleName MethodInvocation InfixExpression CastExpression SimpleName numsplits
round SimpleName MethodInvocation InfixExpression CastExpression PrimitiveType double
round SimpleName MethodInvocation InfixExpression CastExpression SimpleName numsplits
split size SimpleName VariableDeclarationFragment MethodInvocation SimpleName math
split size SimpleName VariableDeclarationFragment MethodInvocation SimpleName round
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName split size
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName math
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName round
curr start SimpleName VariableDeclarationFragment SimpleName start
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName curr start
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName start
start SimpleName InfixExpression SimpleName split size
curr end SimpleName VariableDeclarationFragment InfixExpression SimpleName start
curr end SimpleName VariableDeclarationFragment InfixExpression SimpleName split size
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName curr end
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment InfixExpression SimpleName start
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment InfixExpression SimpleName split size
executors SimpleName MethodInvocation SimpleName new fixed thread pool
executors SimpleName MethodInvocation SimpleName num threads
new fixed thread pool SimpleName MethodInvocation SimpleName num threads
thread pool SimpleName VariableDeclarationFragment MethodInvocation SimpleName executors
thread pool SimpleName VariableDeclarationFragment MethodInvocation SimpleName new fixed thread pool
thread pool SimpleName VariableDeclarationFragment MethodInvocation SimpleName num threads
executor service SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName thread pool
count SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName count
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment NumberLiteral empty
curr end SimpleName InfixExpression SimpleName end
curr start SimpleName InfixExpression SimpleName curr end
curr end SimpleName InfixExpression InfixExpression InfixExpression SimpleName curr start
curr end SimpleName InfixExpression InfixExpression InfixExpression SimpleName curr end
end SimpleName InfixExpression InfixExpression InfixExpression SimpleName curr start
end SimpleName InfixExpression InfixExpression InfixExpression SimpleName curr end
curr end SimpleName InfixExpression SimpleName curr start
string SimpleName MethodInvocation SimpleName format
string SimpleName MethodInvocation StringLiteral map file smf d timestamp size random d d
string SimpleName MethodInvocation SimpleName dir
string SimpleName MethodInvocation SimpleName count
string SimpleName MethodInvocation InfixExpression SimpleName curr end
string SimpleName MethodInvocation InfixExpression SimpleName curr start
format SimpleName MethodInvocation StringLiteral map file smf d timestamp size random d d
format SimpleName MethodInvocation SimpleName dir
format SimpleName MethodInvocation SimpleName count
format SimpleName MethodInvocation InfixExpression SimpleName curr end
format SimpleName MethodInvocation InfixExpression SimpleName curr start
format SimpleName MethodInvocation SimpleName curr start
map file smf d timestamp size random d d StringLiteral MethodInvocation SimpleName dir
map file smf d timestamp size random d d StringLiteral MethodInvocation SimpleName count
map file smf d timestamp size random d d StringLiteral MethodInvocation InfixExpression SimpleName curr end
map file smf d timestamp size random d d StringLiteral MethodInvocation InfixExpression SimpleName curr start
map file smf d timestamp size random d d StringLiteral MethodInvocation SimpleName curr start
dir SimpleName MethodInvocation SimpleName count
dir SimpleName MethodInvocation InfixExpression SimpleName curr end
dir SimpleName MethodInvocation InfixExpression SimpleName curr start
dir SimpleName MethodInvocation SimpleName curr start
count SimpleName MethodInvocation InfixExpression SimpleName curr end
count SimpleName MethodInvocation InfixExpression SimpleName curr start
count SimpleName MethodInvocation SimpleName curr start
curr end SimpleName InfixExpression MethodInvocation SimpleName curr start
curr start SimpleName InfixExpression MethodInvocation SimpleName curr start
tia SimpleName VariableDeclarationFragment MethodInvocation SimpleName string
tia SimpleName VariableDeclarationFragment MethodInvocation SimpleName format
tia SimpleName VariableDeclarationFragment MethodInvocation StringLiteral map file smf d timestamp size random d d
tia SimpleName VariableDeclarationFragment MethodInvocation SimpleName dir
tia SimpleName VariableDeclarationFragment MethodInvocation SimpleName count
tia SimpleName VariableDeclarationFragment MethodInvocation InfixExpression SimpleName curr end
tia SimpleName VariableDeclarationFragment MethodInvocation InfixExpression SimpleName curr start
tia SimpleName VariableDeclarationFragment MethodInvocation SimpleName curr start
final Modifier VariableDeclarationStatement SimpleType SimpleName string
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName tia
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName string
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName format
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation StringLiteral map file smf d timestamp size random d d
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName dir
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName count
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName curr start
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName tia
tia SimpleName MethodInvocation SimpleName split
tia SimpleName MethodInvocation StringLiteral empty
split SimpleName MethodInvocation StringLiteral empty
test ingest SimpleName MethodInvocation SimpleName main
test ingest SimpleName MethodInvocation MethodInvocation SimpleName tia
test ingest SimpleName MethodInvocation MethodInvocation SimpleName split
test ingest SimpleName MethodInvocation MethodInvocation StringLiteral empty
main SimpleName MethodInvocation MethodInvocation SimpleName tia
main SimpleName MethodInvocation MethodInvocation SimpleName split
main SimpleName MethodInvocation MethodInvocation StringLiteral empty
exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
e SimpleName MethodInvocation SimpleName print stack trace
override SimpleName MarkerAnnotation MethodDeclaration Modifier public
override SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
override SimpleName MarkerAnnotation MethodDeclaration SimpleName run
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName run
void PrimitiveType MethodDeclaration SimpleName run
r SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName runnable
runnable SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName r
thread pool SimpleName MethodInvocation SimpleName execute
thread pool SimpleName MethodInvocation SimpleName r
execute SimpleName MethodInvocation SimpleName r
curr start SimpleName Assignment SimpleName curr end
curr start SimpleName InfixExpression SimpleName split size
math SimpleName MethodInvocation SimpleName min
math SimpleName MethodInvocation SimpleName end
math SimpleName MethodInvocation InfixExpression SimpleName curr start
math SimpleName MethodInvocation InfixExpression SimpleName split size
min SimpleName MethodInvocation SimpleName end
min SimpleName MethodInvocation InfixExpression SimpleName curr start
min SimpleName MethodInvocation InfixExpression SimpleName split size
end SimpleName MethodInvocation InfixExpression SimpleName curr start
end SimpleName MethodInvocation InfixExpression SimpleName split size
curr end SimpleName Assignment MethodInvocation SimpleName math
curr end SimpleName Assignment MethodInvocation SimpleName min
curr end SimpleName Assignment MethodInvocation SimpleName end
curr end SimpleName Assignment MethodInvocation InfixExpression SimpleName curr start
curr end SimpleName Assignment MethodInvocation InfixExpression SimpleName split size
thread pool SimpleName MethodInvocation SimpleName shutdown
thread pool SimpleName MethodInvocation SimpleName is terminated
thread pool SimpleName MethodInvocation SimpleName await termination
thread pool SimpleName MethodInvocation NumberLiteral empty
thread pool SimpleName MethodInvocation QualifiedName time unithours
await termination SimpleName MethodInvocation NumberLiteral empty
await termination SimpleName MethodInvocation QualifiedName time unithours
empty NumberLiteral MethodInvocation QualifiedName time unithours
interrupted exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
runtime exception SimpleName SimpleType ClassInstanceCreation SimpleName e
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType long
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType long
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType long
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType long
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType long
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType long
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType long
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType long
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType long
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType long
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType long
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType long
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType long
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType long
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType long
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType long
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType long
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType long
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType long
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType long
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
public Modifier MethodDeclaration Modifier static
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName main
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName args
public Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
public Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType long
public Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType long
public Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType long
public Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType long
public Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType long
public Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType long
public Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
static Modifier MethodDeclaration PrimitiveType void
static Modifier MethodDeclaration SimpleName main
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName args
static Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
static Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType long
static Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType long
static Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType long
static Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType long
static Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType long
static Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType long
static Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
void PrimitiveType MethodDeclaration SimpleName main
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName args
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType long
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType long
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType long
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType long
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType long
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType long
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
main SimpleName MethodDeclaration SingleVariableDeclaration SimpleName args
main SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
main SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType long
main SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType long
main SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType long
main SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType long
main SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType long
main SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType long
main SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration Modifier static
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName main
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName args
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration Modifier static
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName main
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName args
