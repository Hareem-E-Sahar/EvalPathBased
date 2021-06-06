log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation StringLiteral ==> simple atlas authorizer init
debug SimpleName MethodInvocation StringLiteral ==> simple atlas authorizer init
util SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName policy util
policy util SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName util
parser SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName policy parser
policy parser SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName parser
properties util SimpleName MethodInvocation SimpleName get property
properties util SimpleName MethodInvocation StringLiteral opt ignore case
properties util SimpleName MethodInvocation StringLiteral false
get property SimpleName MethodInvocation StringLiteral opt ignore case
get property SimpleName MethodInvocation StringLiteral false
opt ignore case StringLiteral MethodInvocation StringLiteral false
boolean SimpleName MethodInvocation SimpleName value of
boolean SimpleName MethodInvocation MethodInvocation SimpleName properties util
boolean SimpleName MethodInvocation MethodInvocation SimpleName get property
boolean SimpleName MethodInvocation MethodInvocation StringLiteral opt ignore case
boolean SimpleName MethodInvocation MethodInvocation StringLiteral false
value of SimpleName MethodInvocation MethodInvocation SimpleName properties util
value of SimpleName MethodInvocation MethodInvocation SimpleName get property
value of SimpleName MethodInvocation MethodInvocation StringLiteral opt ignore case
value of SimpleName MethodInvocation MethodInvocation StringLiteral false
opt ignore case SimpleName Assignment MethodInvocation SimpleName boolean
opt ignore case SimpleName Assignment MethodInvocation SimpleName value of
opt ignore case SimpleName Assignment MethodInvocation MethodInvocation SimpleName properties util
opt ignore case SimpleName Assignment MethodInvocation MethodInvocation SimpleName get property
opt ignore case SimpleName Assignment MethodInvocation MethodInvocation StringLiteral opt ignore case
opt ignore case SimpleName Assignment MethodInvocation MethodInvocation StringLiteral false
read from properties util --> opt ignore case :: StringLiteral InfixExpression SimpleName opt ignore case
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation InfixExpression StringLiteral read from properties util --> opt ignore case ::
log SimpleName MethodInvocation InfixExpression SimpleName opt ignore case
debug SimpleName MethodInvocation InfixExpression StringLiteral read from properties util --> opt ignore case ::
debug SimpleName MethodInvocation InfixExpression SimpleName opt ignore case
application properties SimpleName MethodInvocation SimpleName get
configuration SimpleName VariableDeclarationFragment MethodInvocation SimpleName application properties
configuration SimpleName VariableDeclarationFragment MethodInvocation SimpleName get
configuration SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName configuration
system SimpleName MethodInvocation SimpleName get property
system SimpleName MethodInvocation StringLiteral atlasconf
get property SimpleName MethodInvocation StringLiteral atlasconf
system SimpleName MethodInvocation InfixExpression StringLiteral policystoretxt
get property SimpleName MethodInvocation InfixExpression StringLiteral policystoretxt
atlasconf StringLiteral MethodInvocation InfixExpression StringLiteral policystoretxt
configuration SimpleName MethodInvocation SimpleName get string
configuration SimpleName MethodInvocation StringLiteral atlasauthpolicyfile
configuration SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName system
configuration SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get property
configuration SimpleName MethodInvocation InfixExpression MethodInvocation StringLiteral atlasconf
configuration SimpleName MethodInvocation InfixExpression StringLiteral policystoretxt
get string SimpleName MethodInvocation StringLiteral atlasauthpolicyfile
get string SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName system
get string SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get property
get string SimpleName MethodInvocation InfixExpression MethodInvocation StringLiteral atlasconf
get string SimpleName MethodInvocation InfixExpression StringLiteral policystoretxt
atlasauthpolicyfile StringLiteral MethodInvocation InfixExpression MethodInvocation SimpleName system
atlasauthpolicyfile StringLiteral MethodInvocation InfixExpression MethodInvocation SimpleName get property
atlasauthpolicyfile StringLiteral MethodInvocation InfixExpression MethodInvocation StringLiteral atlasconf
atlasauthpolicyfile StringLiteral MethodInvocation InfixExpression StringLiteral policystoretxt
policy store path SimpleName VariableDeclarationFragment MethodInvocation SimpleName configuration
policy store path SimpleName VariableDeclarationFragment MethodInvocation SimpleName get string
policy store path SimpleName VariableDeclarationFragment MethodInvocation StringLiteral atlasauthpolicyfile
policy store path SimpleName VariableDeclarationFragment MethodInvocation InfixExpression StringLiteral policystoretxt
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName policy store path
loading apache atlas policies from : StringLiteral InfixExpression SimpleName policy store path
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation InfixExpression StringLiteral loading apache atlas policies from :
log SimpleName MethodInvocation InfixExpression SimpleName policy store path
debug SimpleName MethodInvocation InfixExpression StringLiteral loading apache atlas policies from :
debug SimpleName MethodInvocation InfixExpression SimpleName policy store path
list SimpleName SimpleType ParameterizedType SimpleType SimpleName string
file reader util SimpleName MethodInvocation SimpleName read file
file reader util SimpleName MethodInvocation SimpleName policy store path
read file SimpleName MethodInvocation SimpleName policy store path
policies SimpleName VariableDeclarationFragment MethodInvocation SimpleName file reader util
policies SimpleName VariableDeclarationFragment MethodInvocation SimpleName read file
policies SimpleName VariableDeclarationFragment MethodInvocation SimpleName policy store path
list SimpleName SimpleType ParameterizedType SimpleType SimpleName policy def
parser SimpleName MethodInvocation SimpleName parse policies
parser SimpleName MethodInvocation SimpleName policies
parse policies SimpleName MethodInvocation SimpleName policies
policy def SimpleName VariableDeclarationFragment MethodInvocation SimpleName parser
policy def SimpleName VariableDeclarationFragment MethodInvocation SimpleName parse policies
policy def SimpleName VariableDeclarationFragment MethodInvocation SimpleName policies
util SimpleName MethodInvocation SimpleName create permission map
util SimpleName MethodInvocation SimpleName policy def
util SimpleName MethodInvocation QualifiedName atlas action typesread
util SimpleName MethodInvocation QualifiedName atlas accessor typesuser
create permission map SimpleName MethodInvocation SimpleName policy def
create permission map SimpleName MethodInvocation QualifiedName atlas action typesread
create permission map SimpleName MethodInvocation QualifiedName atlas accessor typesuser
policy def SimpleName MethodInvocation QualifiedName atlas action typesread
policy def SimpleName MethodInvocation QualifiedName atlas accessor typesuser
atlas action typesread QualifiedName MethodInvocation QualifiedName atlas accessor typesuser
user read map SimpleName Assignment MethodInvocation SimpleName util
user read map SimpleName Assignment MethodInvocation SimpleName create permission map
user read map SimpleName Assignment MethodInvocation SimpleName policy def
user read map SimpleName Assignment MethodInvocation QualifiedName atlas action typesread
user read map SimpleName Assignment MethodInvocation QualifiedName atlas accessor typesuser
util SimpleName MethodInvocation SimpleName create permission map
util SimpleName MethodInvocation SimpleName policy def
util SimpleName MethodInvocation QualifiedName atlas action typescreate
util SimpleName MethodInvocation QualifiedName atlas accessor typesuser
create permission map SimpleName MethodInvocation SimpleName policy def
create permission map SimpleName MethodInvocation QualifiedName atlas action typescreate
create permission map SimpleName MethodInvocation QualifiedName atlas accessor typesuser
policy def SimpleName MethodInvocation QualifiedName atlas action typescreate
policy def SimpleName MethodInvocation QualifiedName atlas accessor typesuser
atlas action typescreate QualifiedName MethodInvocation QualifiedName atlas accessor typesuser
user write map SimpleName Assignment MethodInvocation SimpleName util
user write map SimpleName Assignment MethodInvocation SimpleName create permission map
user write map SimpleName Assignment MethodInvocation SimpleName policy def
user write map SimpleName Assignment MethodInvocation QualifiedName atlas action typescreate
user write map SimpleName Assignment MethodInvocation QualifiedName atlas accessor typesuser
util SimpleName MethodInvocation SimpleName create permission map
util SimpleName MethodInvocation SimpleName policy def
util SimpleName MethodInvocation QualifiedName atlas action typesupdate
util SimpleName MethodInvocation QualifiedName atlas accessor typesuser
create permission map SimpleName MethodInvocation SimpleName policy def
create permission map SimpleName MethodInvocation QualifiedName atlas action typesupdate
create permission map SimpleName MethodInvocation QualifiedName atlas accessor typesuser
policy def SimpleName MethodInvocation QualifiedName atlas action typesupdate
policy def SimpleName MethodInvocation QualifiedName atlas accessor typesuser
atlas action typesupdate QualifiedName MethodInvocation QualifiedName atlas accessor typesuser
user update map SimpleName Assignment MethodInvocation SimpleName util
user update map SimpleName Assignment MethodInvocation SimpleName create permission map
user update map SimpleName Assignment MethodInvocation SimpleName policy def
user update map SimpleName Assignment MethodInvocation QualifiedName atlas action typesupdate
user update map SimpleName Assignment MethodInvocation QualifiedName atlas accessor typesuser
util SimpleName MethodInvocation SimpleName create permission map
util SimpleName MethodInvocation SimpleName policy def
util SimpleName MethodInvocation QualifiedName atlas action typesdelete
util SimpleName MethodInvocation QualifiedName atlas accessor typesuser
create permission map SimpleName MethodInvocation SimpleName policy def
create permission map SimpleName MethodInvocation QualifiedName atlas action typesdelete
create permission map SimpleName MethodInvocation QualifiedName atlas accessor typesuser
policy def SimpleName MethodInvocation QualifiedName atlas action typesdelete
policy def SimpleName MethodInvocation QualifiedName atlas accessor typesuser
atlas action typesdelete QualifiedName MethodInvocation QualifiedName atlas accessor typesuser
user delete map SimpleName Assignment MethodInvocation SimpleName util
user delete map SimpleName Assignment MethodInvocation SimpleName create permission map
user delete map SimpleName Assignment MethodInvocation SimpleName policy def
user delete map SimpleName Assignment MethodInvocation QualifiedName atlas action typesdelete
user delete map SimpleName Assignment MethodInvocation QualifiedName atlas accessor typesuser
util SimpleName MethodInvocation SimpleName create permission map
util SimpleName MethodInvocation SimpleName policy def
util SimpleName MethodInvocation QualifiedName atlas action typesread
util SimpleName MethodInvocation QualifiedName atlas accessor typesgroup
create permission map SimpleName MethodInvocation SimpleName policy def
create permission map SimpleName MethodInvocation QualifiedName atlas action typesread
create permission map SimpleName MethodInvocation QualifiedName atlas accessor typesgroup
policy def SimpleName MethodInvocation QualifiedName atlas action typesread
policy def SimpleName MethodInvocation QualifiedName atlas accessor typesgroup
atlas action typesread QualifiedName MethodInvocation QualifiedName atlas accessor typesgroup
group read map SimpleName Assignment MethodInvocation SimpleName util
group read map SimpleName Assignment MethodInvocation SimpleName create permission map
group read map SimpleName Assignment MethodInvocation SimpleName policy def
group read map SimpleName Assignment MethodInvocation QualifiedName atlas action typesread
group read map SimpleName Assignment MethodInvocation QualifiedName atlas accessor typesgroup
util SimpleName MethodInvocation SimpleName create permission map
util SimpleName MethodInvocation SimpleName policy def
util SimpleName MethodInvocation QualifiedName atlas action typescreate
util SimpleName MethodInvocation QualifiedName atlas accessor typesgroup
create permission map SimpleName MethodInvocation SimpleName policy def
create permission map SimpleName MethodInvocation QualifiedName atlas action typescreate
create permission map SimpleName MethodInvocation QualifiedName atlas accessor typesgroup
policy def SimpleName MethodInvocation QualifiedName atlas action typescreate
policy def SimpleName MethodInvocation QualifiedName atlas accessor typesgroup
atlas action typescreate QualifiedName MethodInvocation QualifiedName atlas accessor typesgroup
group write map SimpleName Assignment MethodInvocation SimpleName util
group write map SimpleName Assignment MethodInvocation SimpleName create permission map
group write map SimpleName Assignment MethodInvocation SimpleName policy def
group write map SimpleName Assignment MethodInvocation QualifiedName atlas action typescreate
group write map SimpleName Assignment MethodInvocation QualifiedName atlas accessor typesgroup
util SimpleName MethodInvocation SimpleName create permission map
util SimpleName MethodInvocation SimpleName policy def
util SimpleName MethodInvocation QualifiedName atlas action typesupdate
util SimpleName MethodInvocation QualifiedName atlas accessor typesgroup
create permission map SimpleName MethodInvocation SimpleName policy def
create permission map SimpleName MethodInvocation QualifiedName atlas action typesupdate
create permission map SimpleName MethodInvocation QualifiedName atlas accessor typesgroup
policy def SimpleName MethodInvocation QualifiedName atlas action typesupdate
policy def SimpleName MethodInvocation QualifiedName atlas accessor typesgroup
atlas action typesupdate QualifiedName MethodInvocation QualifiedName atlas accessor typesgroup
group update map SimpleName Assignment MethodInvocation SimpleName util
group update map SimpleName Assignment MethodInvocation SimpleName create permission map
group update map SimpleName Assignment MethodInvocation SimpleName policy def
group update map SimpleName Assignment MethodInvocation QualifiedName atlas action typesupdate
group update map SimpleName Assignment MethodInvocation QualifiedName atlas accessor typesgroup
util SimpleName MethodInvocation SimpleName create permission map
util SimpleName MethodInvocation SimpleName policy def
util SimpleName MethodInvocation QualifiedName atlas action typesdelete
util SimpleName MethodInvocation QualifiedName atlas accessor typesgroup
create permission map SimpleName MethodInvocation SimpleName policy def
create permission map SimpleName MethodInvocation QualifiedName atlas action typesdelete
create permission map SimpleName MethodInvocation QualifiedName atlas accessor typesgroup
policy def SimpleName MethodInvocation QualifiedName atlas action typesdelete
policy def SimpleName MethodInvocation QualifiedName atlas accessor typesgroup
atlas action typesdelete QualifiedName MethodInvocation QualifiedName atlas accessor typesgroup
group delete map SimpleName Assignment MethodInvocation SimpleName util
group delete map SimpleName Assignment MethodInvocation SimpleName create permission map
group delete map SimpleName Assignment MethodInvocation SimpleName policy def
group delete map SimpleName Assignment MethodInvocation QualifiedName atlas action typesdelete
group delete map SimpleName Assignment MethodInvocation QualifiedName atlas accessor typesgroup
user read map :: StringLiteral InfixExpression SimpleName user read map
user read map :: StringLiteral InfixExpression StringLiteral group read map ::
user read map :: StringLiteral InfixExpression SimpleName group read map
user read map SimpleName InfixExpression StringLiteral group read map ::
user read map SimpleName InfixExpression SimpleName group read map
group read map :: StringLiteral InfixExpression SimpleName group read map
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation InfixExpression StringLiteral user read map ::
log SimpleName MethodInvocation InfixExpression SimpleName user read map
log SimpleName MethodInvocation InfixExpression StringLiteral group read map ::
log SimpleName MethodInvocation InfixExpression SimpleName group read map
debug SimpleName MethodInvocation InfixExpression StringLiteral user read map ::
debug SimpleName MethodInvocation InfixExpression SimpleName user read map
debug SimpleName MethodInvocation InfixExpression StringLiteral group read map ::
debug SimpleName MethodInvocation InfixExpression SimpleName group read map
user write map :: StringLiteral InfixExpression SimpleName user write map
user write map :: StringLiteral InfixExpression StringLiteral group write map ::
user write map :: StringLiteral InfixExpression SimpleName group write map
user write map SimpleName InfixExpression StringLiteral group write map ::
user write map SimpleName InfixExpression SimpleName group write map
group write map :: StringLiteral InfixExpression SimpleName group write map
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation InfixExpression StringLiteral user write map ::
log SimpleName MethodInvocation InfixExpression SimpleName user write map
log SimpleName MethodInvocation InfixExpression StringLiteral group write map ::
log SimpleName MethodInvocation InfixExpression SimpleName group write map
debug SimpleName MethodInvocation InfixExpression StringLiteral user write map ::
debug SimpleName MethodInvocation InfixExpression SimpleName user write map
debug SimpleName MethodInvocation InfixExpression StringLiteral group write map ::
debug SimpleName MethodInvocation InfixExpression SimpleName group write map
user update map :: StringLiteral InfixExpression SimpleName user update map
user update map :: StringLiteral InfixExpression StringLiteral group update map ::
user update map :: StringLiteral InfixExpression SimpleName group update map
user update map SimpleName InfixExpression StringLiteral group update map ::
user update map SimpleName InfixExpression SimpleName group update map
group update map :: StringLiteral InfixExpression SimpleName group update map
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation InfixExpression StringLiteral user update map ::
log SimpleName MethodInvocation InfixExpression SimpleName user update map
log SimpleName MethodInvocation InfixExpression StringLiteral group update map ::
log SimpleName MethodInvocation InfixExpression SimpleName group update map
debug SimpleName MethodInvocation InfixExpression StringLiteral user update map ::
debug SimpleName MethodInvocation InfixExpression SimpleName user update map
debug SimpleName MethodInvocation InfixExpression StringLiteral group update map ::
debug SimpleName MethodInvocation InfixExpression SimpleName group update map
user delete map :: StringLiteral InfixExpression SimpleName user delete map
user delete map :: StringLiteral InfixExpression StringLiteral group delete map ::
user delete map :: StringLiteral InfixExpression SimpleName group delete map
user delete map SimpleName InfixExpression StringLiteral group delete map ::
user delete map SimpleName InfixExpression SimpleName group delete map
group delete map :: StringLiteral InfixExpression SimpleName group delete map
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation InfixExpression StringLiteral user delete map ::
log SimpleName MethodInvocation InfixExpression SimpleName user delete map
log SimpleName MethodInvocation InfixExpression StringLiteral group delete map ::
log SimpleName MethodInvocation InfixExpression SimpleName group delete map
debug SimpleName MethodInvocation InfixExpression StringLiteral user delete map ::
debug SimpleName MethodInvocation InfixExpression SimpleName user delete map
debug SimpleName MethodInvocation InfixExpression StringLiteral group delete map ::
debug SimpleName MethodInvocation InfixExpression SimpleName group delete map
is debug enabled SimpleName IfStatement Block IfStatement SimpleName is debug enabled
io exception SimpleName SimpleType UnionType SimpleType SimpleName atlas exception
io exception SimpleName SimpleType UnionType SingleVariableDeclaration SimpleName e
atlas exception SimpleName SimpleType UnionType SingleVariableDeclaration SimpleName e
log SimpleName MethodInvocation SimpleName is error enabled
log SimpleName MethodInvocation SimpleName error
log SimpleName MethodInvocation StringLiteral simple atlas authorizer could not be initialized properly due to :
log SimpleName MethodInvocation SimpleName e
error SimpleName MethodInvocation StringLiteral simple atlas authorizer could not be initialized properly due to :
error SimpleName MethodInvocation SimpleName e
simple atlas authorizer could not be initialized properly due to : StringLiteral MethodInvocation SimpleName e
override SimpleName MarkerAnnotation MethodDeclaration Modifier public
override SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
override SimpleName MarkerAnnotation MethodDeclaration SimpleName init
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName init
public Modifier MethodDeclaration Block IfStatement SimpleName is debug enabled
void PrimitiveType MethodDeclaration SimpleName init
void PrimitiveType MethodDeclaration Block IfStatement SimpleName is debug enabled
init SimpleName MethodDeclaration Block IfStatement SimpleName is debug enabled
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName override
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName init
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName override
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName init
