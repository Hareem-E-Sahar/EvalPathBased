atlas lineage info SimpleName SimpleType SingleVariableDeclaration SimpleName lineage info
atlas type registry SimpleName SimpleType SingleVariableDeclaration SimpleName registry
ret SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName struct
struct SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName ret
counter SimpleName MethodInvocation SimpleName get and increment
constantstemp struct name prefix QualifiedName InfixExpression MethodInvocation SimpleName counter
constantstemp struct name prefix QualifiedName InfixExpression MethodInvocation SimpleName get and increment
ret SimpleName MethodInvocation SimpleName set type name
ret SimpleName MethodInvocation InfixExpression QualifiedName constantstemp struct name prefix
ret SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName counter
ret SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get and increment
set type name SimpleName MethodInvocation InfixExpression QualifiedName constantstemp struct name prefix
set type name SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName counter
set type name SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName get and increment
map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
map SimpleName SimpleType ParameterizedType SimpleType SimpleName atlas entity header
string SimpleName SimpleType ParameterizedType SimpleType SimpleName atlas entity header
lineage info SimpleName MethodInvocation SimpleName get guid entity map
entities SimpleName VariableDeclarationFragment MethodInvocation SimpleName lineage info
entities SimpleName VariableDeclarationFragment MethodInvocation SimpleName get guid entity map
set SimpleName SimpleType ParameterizedType SimpleType QualifiedName atlas lineage infolineage relation
lineage info SimpleName MethodInvocation SimpleName get relations
relations SimpleName VariableDeclarationFragment MethodInvocation SimpleName lineage info
relations SimpleName VariableDeclarationFragment MethodInvocation SimpleName get relations
lineage info SimpleName MethodInvocation SimpleName get lineage direction
direction SimpleName VariableDeclarationFragment MethodInvocation SimpleName lineage info
direction SimpleName VariableDeclarationFragment MethodInvocation SimpleName get lineage direction
atlas lineage infolineage direction QualifiedName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName direction
map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
map SimpleName SimpleType ParameterizedType SimpleType SimpleName struct
string SimpleName SimpleType ParameterizedType SimpleType SimpleName struct
string SimpleName SimpleType SingleVariableDeclaration SimpleName guid
entities SimpleName MethodInvocation SimpleName key set
entities SimpleName MethodInvocation SimpleName get
entities SimpleName MethodInvocation SimpleName guid
get SimpleName MethodInvocation SimpleName guid
entity header SimpleName VariableDeclarationFragment MethodInvocation SimpleName entities
entity header SimpleName VariableDeclarationFragment MethodInvocation SimpleName get
entity header SimpleName VariableDeclarationFragment MethodInvocation SimpleName guid
atlas entity header SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName entity header
entity header SimpleName MethodInvocation SimpleName get type name
is data set SimpleName MethodInvocation MethodInvocation SimpleName entity header
is data set SimpleName MethodInvocation MethodInvocation SimpleName get type name
is data set SimpleName MethodInvocation SimpleName registry
entity header SimpleName MethodInvocation MethodInvocation SimpleName registry
get type name SimpleName MethodInvocation MethodInvocation SimpleName registry
map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
map SimpleName SimpleType ParameterizedType SimpleType SimpleName object
string SimpleName SimpleType ParameterizedType SimpleType SimpleName object
vertex id map SimpleName MethodInvocation SimpleName put
vertex id map SimpleName MethodInvocation QualifiedName constantsattribute name guid
vertex id map SimpleName MethodInvocation SimpleName guid
put SimpleName MethodInvocation QualifiedName constantsattribute name guid
put SimpleName MethodInvocation SimpleName guid
constantsattribute name guid QualifiedName MethodInvocation SimpleName guid
entity header SimpleName MethodInvocation SimpleName get status
entity header SimpleName MethodInvocation InfixExpression QualifiedName atlas entitystatusactive
get status SimpleName MethodInvocation InfixExpression QualifiedName atlas entitystatusactive
atlas entitystatusactive QualifiedName InfixExpression ParenthesizedExpression ConditionalExpression StringLiteral active
atlas entitystatusactive QualifiedName InfixExpression ParenthesizedExpression ConditionalExpression StringLiteral deleted
active StringLiteral ConditionalExpression StringLiteral deleted
vertex id map SimpleName MethodInvocation SimpleName put
vertex id map SimpleName MethodInvocation QualifiedName constantsattribute name state
vertex id map SimpleName MethodInvocation ConditionalExpression StringLiteral active
vertex id map SimpleName MethodInvocation ConditionalExpression StringLiteral deleted
put SimpleName MethodInvocation QualifiedName constantsattribute name state
put SimpleName MethodInvocation ConditionalExpression StringLiteral active
put SimpleName MethodInvocation ConditionalExpression StringLiteral deleted
constantsattribute name state QualifiedName MethodInvocation ConditionalExpression StringLiteral active
constantsattribute name state QualifiedName MethodInvocation ConditionalExpression StringLiteral deleted
entity header SimpleName MethodInvocation SimpleName get type name
vertex id map SimpleName MethodInvocation SimpleName put
vertex id map SimpleName MethodInvocation QualifiedName constantsattribute name typename
vertex id map SimpleName MethodInvocation MethodInvocation SimpleName entity header
vertex id map SimpleName MethodInvocation MethodInvocation SimpleName get type name
put SimpleName MethodInvocation QualifiedName constantsattribute name typename
put SimpleName MethodInvocation MethodInvocation SimpleName entity header
put SimpleName MethodInvocation MethodInvocation SimpleName get type name
constantsattribute name typename QualifiedName MethodInvocation MethodInvocation SimpleName entity header
constantsattribute name typename QualifiedName MethodInvocation MethodInvocation SimpleName get type name
entity header SimpleName MethodInvocation SimpleName get attribute
entity header SimpleName MethodInvocation QualifiedName atlas clientreferenceable attribute name
get attribute SimpleName MethodInvocation QualifiedName atlas clientreferenceable attribute name
qualified name SimpleName VariableDeclarationFragment MethodInvocation SimpleName entity header
qualified name SimpleName VariableDeclarationFragment MethodInvocation SimpleName get attribute
qualified name SimpleName VariableDeclarationFragment MethodInvocation QualifiedName atlas clientreferenceable attribute name
object SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName qualified name
entity header SimpleName MethodInvocation SimpleName get display text
qualified name SimpleName Assignment MethodInvocation SimpleName entity header
qualified name SimpleName Assignment MethodInvocation SimpleName get display text
map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
map SimpleName SimpleType ParameterizedType SimpleType SimpleName object
string SimpleName SimpleType ParameterizedType SimpleType SimpleName object
values SimpleName MethodInvocation SimpleName put
values SimpleName MethodInvocation QualifiedName atlas clientreferenceable attribute name
values SimpleName MethodInvocation SimpleName qualified name
put SimpleName MethodInvocation QualifiedName atlas clientreferenceable attribute name
put SimpleName MethodInvocation SimpleName qualified name
atlas clientreferenceable attribute name QualifiedName MethodInvocation SimpleName qualified name
construct result struct SimpleName MethodInvocation SimpleName vertex id map
construct result struct SimpleName MethodInvocation BooleanLiteral true
vertex id map SimpleName MethodInvocation BooleanLiteral true
values SimpleName MethodInvocation SimpleName put
values SimpleName MethodInvocation SimpleName vertex id attr name
values SimpleName MethodInvocation MethodInvocation SimpleName construct result struct
values SimpleName MethodInvocation MethodInvocation SimpleName vertex id map
values SimpleName MethodInvocation MethodInvocation BooleanLiteral true
put SimpleName MethodInvocation SimpleName vertex id attr name
put SimpleName MethodInvocation MethodInvocation SimpleName construct result struct
put SimpleName MethodInvocation MethodInvocation SimpleName vertex id map
put SimpleName MethodInvocation MethodInvocation BooleanLiteral true
vertex id attr name SimpleName MethodInvocation MethodInvocation SimpleName construct result struct
vertex id attr name SimpleName MethodInvocation MethodInvocation SimpleName vertex id map
vertex id attr name SimpleName MethodInvocation MethodInvocation BooleanLiteral true
entity header SimpleName MethodInvocation SimpleName get display text
values SimpleName MethodInvocation SimpleName put
values SimpleName MethodInvocation QualifiedName atlas clientname
values SimpleName MethodInvocation MethodInvocation SimpleName entity header
values SimpleName MethodInvocation MethodInvocation SimpleName get display text
put SimpleName MethodInvocation QualifiedName atlas clientname
put SimpleName MethodInvocation MethodInvocation SimpleName entity header
put SimpleName MethodInvocation MethodInvocation SimpleName get display text
atlas clientname QualifiedName MethodInvocation MethodInvocation SimpleName entity header
atlas clientname QualifiedName MethodInvocation MethodInvocation SimpleName get display text
construct result struct SimpleName MethodInvocation SimpleName values
construct result struct SimpleName MethodInvocation BooleanLiteral false
values SimpleName MethodInvocation BooleanLiteral false
vertices map SimpleName MethodInvocation SimpleName put
vertices map SimpleName MethodInvocation SimpleName guid
vertices map SimpleName MethodInvocation MethodInvocation SimpleName construct result struct
vertices map SimpleName MethodInvocation MethodInvocation SimpleName values
vertices map SimpleName MethodInvocation MethodInvocation BooleanLiteral false
put SimpleName MethodInvocation SimpleName guid
put SimpleName MethodInvocation MethodInvocation SimpleName construct result struct
put SimpleName MethodInvocation MethodInvocation SimpleName values
put SimpleName MethodInvocation MethodInvocation BooleanLiteral false
guid SimpleName MethodInvocation MethodInvocation SimpleName construct result struct
guid SimpleName MethodInvocation MethodInvocation SimpleName values
guid SimpleName MethodInvocation MethodInvocation BooleanLiteral false
guid SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName entities
guid SimpleName SingleVariableDeclaration EnhancedForStatement MethodInvocation SimpleName key set
list SimpleName SimpleType ParameterizedType SimpleType SimpleName string
map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
atlas lineage infolineage relation QualifiedName SimpleType SingleVariableDeclaration SimpleName relation
relation SimpleName MethodInvocation SimpleName get from entity id
from entity id SimpleName VariableDeclarationFragment MethodInvocation SimpleName relation
from entity id SimpleName VariableDeclarationFragment MethodInvocation SimpleName get from entity id
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName from entity id
relation SimpleName MethodInvocation SimpleName get to entity id
to entity id SimpleName VariableDeclarationFragment MethodInvocation SimpleName relation
to entity id SimpleName VariableDeclarationFragment MethodInvocation SimpleName get to entity id
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName to entity id
direction SimpleName InfixExpression QualifiedName atlas lineage infolineage directioninput
edges map SimpleName MethodInvocation SimpleName contains key
edges map SimpleName MethodInvocation SimpleName to entity id
contains key SimpleName MethodInvocation SimpleName to entity id
array list SimpleName SimpleType ParameterizedType SimpleType SimpleName string
edges map SimpleName MethodInvocation SimpleName put
edges map SimpleName MethodInvocation SimpleName to entity id
put SimpleName MethodInvocation SimpleName to entity id
edges map SimpleName MethodInvocation SimpleName get
edges map SimpleName MethodInvocation SimpleName to entity id
get SimpleName MethodInvocation SimpleName to entity id
edges map SimpleName MethodInvocation MethodInvocation SimpleName add
get SimpleName MethodInvocation MethodInvocation SimpleName add
to entity id SimpleName MethodInvocation MethodInvocation SimpleName add
edges map SimpleName MethodInvocation MethodInvocation SimpleName from entity id
get SimpleName MethodInvocation MethodInvocation SimpleName from entity id
to entity id SimpleName MethodInvocation MethodInvocation SimpleName from entity id
add SimpleName MethodInvocation SimpleName from entity id
direction SimpleName InfixExpression QualifiedName atlas lineage infolineage directionoutput
edges map SimpleName MethodInvocation SimpleName contains key
edges map SimpleName MethodInvocation SimpleName from entity id
contains key SimpleName MethodInvocation SimpleName from entity id
array list SimpleName SimpleType ParameterizedType SimpleType SimpleName string
edges map SimpleName MethodInvocation SimpleName put
edges map SimpleName MethodInvocation SimpleName from entity id
put SimpleName MethodInvocation SimpleName from entity id
edges map SimpleName MethodInvocation SimpleName get
edges map SimpleName MethodInvocation SimpleName from entity id
get SimpleName MethodInvocation SimpleName from entity id
edges map SimpleName MethodInvocation MethodInvocation SimpleName add
get SimpleName MethodInvocation MethodInvocation SimpleName add
from entity id SimpleName MethodInvocation MethodInvocation SimpleName add
edges map SimpleName MethodInvocation MethodInvocation SimpleName to entity id
get SimpleName MethodInvocation MethodInvocation SimpleName to entity id
from entity id SimpleName MethodInvocation MethodInvocation SimpleName to entity id
add SimpleName MethodInvocation SimpleName to entity id
atlas lineage infolineage relation QualifiedName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName relations
relation SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName relations
ret SimpleName MethodInvocation SimpleName set
ret SimpleName MethodInvocation StringLiteral vertices
ret SimpleName MethodInvocation SimpleName vertices map
set SimpleName MethodInvocation StringLiteral vertices
set SimpleName MethodInvocation SimpleName vertices map
vertices StringLiteral MethodInvocation SimpleName vertices map
ret SimpleName MethodInvocation SimpleName set
ret SimpleName MethodInvocation StringLiteral edges
ret SimpleName MethodInvocation SimpleName edges map
set SimpleName MethodInvocation StringLiteral edges
set SimpleName MethodInvocation SimpleName edges map
edges StringLiteral MethodInvocation SimpleName edges map
public Modifier MethodDeclaration Modifier static
public Modifier MethodDeclaration SimpleType SimpleName struct
public Modifier MethodDeclaration SimpleName to lineage struct
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName atlas lineage info
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName lineage info
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName atlas type registry
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName registry
static Modifier MethodDeclaration SimpleType SimpleName struct
static Modifier MethodDeclaration SimpleName to lineage struct
static Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName atlas lineage info
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName lineage info
static Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName atlas type registry
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName registry
static Modifier MethodDeclaration SimpleType SimpleName atlas base exception
struct SimpleName SimpleType MethodDeclaration SimpleName to lineage struct
struct SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName lineage info
struct SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName registry
struct SimpleName SimpleType MethodDeclaration SimpleType SimpleName atlas base exception
to lineage struct SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName atlas lineage info
to lineage struct SimpleName MethodDeclaration SingleVariableDeclaration SimpleName lineage info
to lineage struct SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName atlas type registry
to lineage struct SimpleName MethodDeclaration SingleVariableDeclaration SimpleName registry
to lineage struct SimpleName MethodDeclaration SimpleType SimpleName atlas base exception
to lineage struct SimpleName MethodDeclaration Block ReturnStatement SimpleName ret
lineage info SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName registry
lineage info SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName atlas base exception
registry SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName atlas base exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration Modifier static
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName struct
public Modifier TypeDeclaration MethodDeclaration SimpleName to lineage struct
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName lineage info
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName registry
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName atlas base exception
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration Modifier static
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName struct
test SimpleName TypeDeclaration MethodDeclaration SimpleName to lineage struct
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName lineage info
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName registry
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName atlas base exception