atlas object id SimpleName SimpleType SingleVariableDeclaration SimpleName db id
table SimpleName SimpleType SingleVariableDeclaration SimpleName table
atlas entity ext info SimpleName SimpleType SingleVariableDeclaration SimpleName entity ext info
get qualified name SimpleName MethodInvocation SimpleName table
tbl qualified name SimpleName VariableDeclarationFragment MethodInvocation SimpleName get qualified name
tbl qualified name SimpleName VariableDeclarationFragment MethodInvocation SimpleName table
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName tbl qualified name
context SimpleName MethodInvocation SimpleName is known table
context SimpleName MethodInvocation SimpleName tbl qualified name
is known table SimpleName MethodInvocation SimpleName tbl qualified name
is known table SimpleName VariableDeclarationFragment MethodInvocation SimpleName context
is known table SimpleName VariableDeclarationFragment MethodInvocation SimpleName is known table
is known table SimpleName VariableDeclarationFragment MethodInvocation SimpleName tbl qualified name
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName is known table
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName context
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName is known table
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName tbl qualified name
context SimpleName MethodInvocation SimpleName get entity
context SimpleName MethodInvocation SimpleName tbl qualified name
get entity SimpleName MethodInvocation SimpleName tbl qualified name
ret SimpleName VariableDeclarationFragment MethodInvocation SimpleName context
ret SimpleName VariableDeclarationFragment MethodInvocation SimpleName get entity
ret SimpleName VariableDeclarationFragment MethodInvocation SimpleName tbl qualified name
atlas entity SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName ret
atlas entity SimpleName SimpleType ClassInstanceCreation SimpleName hive type table
ret SimpleName Assignment ClassInstanceCreation SimpleType SimpleName atlas entity
ret SimpleName Assignment ClassInstanceCreation SimpleName hive type table
is known table SimpleName InfixExpression PrefixExpression MethodInvocation SimpleName is alter table operation
ret SimpleName MethodInvocation SimpleName set guid
get table create time SimpleName MethodInvocation SimpleName table
create time SimpleName VariableDeclarationFragment MethodInvocation SimpleName get table create time
create time SimpleName VariableDeclarationFragment MethodInvocation SimpleName table
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName create time
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get table create time
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName table
table SimpleName MethodInvocation SimpleName get last access time
table SimpleName MethodInvocation InfixExpression NumberLiteral empty
get last access time SimpleName MethodInvocation InfixExpression NumberLiteral empty
table SimpleName MethodInvocation SimpleName get last access time
table SimpleName MethodInvocation InfixExpression SimpleName millis convert factor
get last access time SimpleName MethodInvocation InfixExpression SimpleName millis convert factor
table SimpleName MethodInvocation InfixExpression ConditionalExpression SimpleName create time
get last access time SimpleName MethodInvocation InfixExpression ConditionalExpression SimpleName create time
empty NumberLiteral InfixExpression ConditionalExpression SimpleName create time
millis convert factor SimpleName InfixExpression ParenthesizedExpression ConditionalExpression SimpleName create time
last access time SimpleName VariableDeclarationFragment ConditionalExpression InfixExpression NumberLiteral empty
last access time SimpleName VariableDeclarationFragment ConditionalExpression SimpleName create time
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName last access time
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment ConditionalExpression SimpleName create time
ret SimpleName MethodInvocation SimpleName set attribute
ret SimpleName MethodInvocation SimpleName attribute db
ret SimpleName MethodInvocation SimpleName db id
set attribute SimpleName MethodInvocation SimpleName attribute db
set attribute SimpleName MethodInvocation SimpleName db id
attribute db SimpleName MethodInvocation SimpleName db id
ret SimpleName MethodInvocation SimpleName set attribute
ret SimpleName MethodInvocation SimpleName attribute qualified name
ret SimpleName MethodInvocation SimpleName tbl qualified name
set attribute SimpleName MethodInvocation SimpleName attribute qualified name
set attribute SimpleName MethodInvocation SimpleName tbl qualified name
attribute qualified name SimpleName MethodInvocation SimpleName tbl qualified name
table SimpleName MethodInvocation SimpleName get table name
table SimpleName MethodInvocation MethodInvocation SimpleName to lower case
get table name SimpleName MethodInvocation MethodInvocation SimpleName to lower case
ret SimpleName MethodInvocation SimpleName set attribute
ret SimpleName MethodInvocation SimpleName attribute name
ret SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName table
ret SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get table name
ret SimpleName MethodInvocation MethodInvocation SimpleName to lower case
set attribute SimpleName MethodInvocation SimpleName attribute name
set attribute SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName table
set attribute SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get table name
set attribute SimpleName MethodInvocation MethodInvocation SimpleName to lower case
attribute name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName table
attribute name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get table name
attribute name SimpleName MethodInvocation MethodInvocation SimpleName to lower case
table SimpleName MethodInvocation SimpleName get owner
ret SimpleName MethodInvocation SimpleName set attribute
ret SimpleName MethodInvocation SimpleName attribute owner
ret SimpleName MethodInvocation MethodInvocation SimpleName table
ret SimpleName MethodInvocation MethodInvocation SimpleName get owner
set attribute SimpleName MethodInvocation SimpleName attribute owner
set attribute SimpleName MethodInvocation MethodInvocation SimpleName table
set attribute SimpleName MethodInvocation MethodInvocation SimpleName get owner
attribute owner SimpleName MethodInvocation MethodInvocation SimpleName table
attribute owner SimpleName MethodInvocation MethodInvocation SimpleName get owner
ret SimpleName MethodInvocation SimpleName set attribute
ret SimpleName MethodInvocation SimpleName attribute create time
ret SimpleName MethodInvocation SimpleName create time
set attribute SimpleName MethodInvocation SimpleName attribute create time
set attribute SimpleName MethodInvocation SimpleName create time
attribute create time SimpleName MethodInvocation SimpleName create time
ret SimpleName MethodInvocation SimpleName set attribute
ret SimpleName MethodInvocation SimpleName attribute last access time
ret SimpleName MethodInvocation SimpleName last access time
set attribute SimpleName MethodInvocation SimpleName attribute last access time
set attribute SimpleName MethodInvocation SimpleName last access time
attribute last access time SimpleName MethodInvocation SimpleName last access time
table SimpleName MethodInvocation SimpleName get retention
ret SimpleName MethodInvocation SimpleName set attribute
ret SimpleName MethodInvocation SimpleName attribute retention
ret SimpleName MethodInvocation MethodInvocation SimpleName table
ret SimpleName MethodInvocation MethodInvocation SimpleName get retention
set attribute SimpleName MethodInvocation SimpleName attribute retention
set attribute SimpleName MethodInvocation MethodInvocation SimpleName table
set attribute SimpleName MethodInvocation MethodInvocation SimpleName get retention
attribute retention SimpleName MethodInvocation MethodInvocation SimpleName table
attribute retention SimpleName MethodInvocation MethodInvocation SimpleName get retention
table SimpleName MethodInvocation SimpleName get parameters
ret SimpleName MethodInvocation SimpleName set attribute
ret SimpleName MethodInvocation SimpleName attribute parameters
ret SimpleName MethodInvocation MethodInvocation SimpleName table
ret SimpleName MethodInvocation MethodInvocation SimpleName get parameters
set attribute SimpleName MethodInvocation SimpleName attribute parameters
set attribute SimpleName MethodInvocation MethodInvocation SimpleName table
set attribute SimpleName MethodInvocation MethodInvocation SimpleName get parameters
attribute parameters SimpleName MethodInvocation MethodInvocation SimpleName table
attribute parameters SimpleName MethodInvocation MethodInvocation SimpleName get parameters
table SimpleName MethodInvocation SimpleName get parameters
table SimpleName MethodInvocation MethodInvocation SimpleName get
get parameters SimpleName MethodInvocation MethodInvocation SimpleName get
table SimpleName MethodInvocation MethodInvocation SimpleName attribute comment
get parameters SimpleName MethodInvocation MethodInvocation SimpleName attribute comment
get SimpleName MethodInvocation SimpleName attribute comment
ret SimpleName MethodInvocation SimpleName set attribute
ret SimpleName MethodInvocation SimpleName attribute comment
ret SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName table
ret SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get parameters
ret SimpleName MethodInvocation MethodInvocation SimpleName get
ret SimpleName MethodInvocation MethodInvocation SimpleName attribute comment
set attribute SimpleName MethodInvocation SimpleName attribute comment
set attribute SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName table
set attribute SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get parameters
set attribute SimpleName MethodInvocation MethodInvocation SimpleName get
set attribute SimpleName MethodInvocation MethodInvocation SimpleName attribute comment
attribute comment SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName table
attribute comment SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get parameters
attribute comment SimpleName MethodInvocation MethodInvocation SimpleName get
attribute comment SimpleName MethodInvocation MethodInvocation SimpleName attribute comment
table SimpleName MethodInvocation SimpleName get table type
table SimpleName MethodInvocation MethodInvocation SimpleName name
get table type SimpleName MethodInvocation MethodInvocation SimpleName name
ret SimpleName MethodInvocation SimpleName set attribute
ret SimpleName MethodInvocation SimpleName attribute table type
ret SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName table
ret SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get table type
ret SimpleName MethodInvocation MethodInvocation SimpleName name
set attribute SimpleName MethodInvocation SimpleName attribute table type
set attribute SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName table
set attribute SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get table type
set attribute SimpleName MethodInvocation MethodInvocation SimpleName name
attribute table type SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName table
attribute table type SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get table type
attribute table type SimpleName MethodInvocation MethodInvocation SimpleName name
table SimpleName MethodInvocation SimpleName is temporary
ret SimpleName MethodInvocation SimpleName set attribute
ret SimpleName MethodInvocation SimpleName attribute temporary
ret SimpleName MethodInvocation MethodInvocation SimpleName table
ret SimpleName MethodInvocation MethodInvocation SimpleName is temporary
set attribute SimpleName MethodInvocation SimpleName attribute temporary
set attribute SimpleName MethodInvocation MethodInvocation SimpleName table
set attribute SimpleName MethodInvocation MethodInvocation SimpleName is temporary
attribute temporary SimpleName MethodInvocation MethodInvocation SimpleName table
attribute temporary SimpleName MethodInvocation MethodInvocation SimpleName is temporary
table SimpleName MethodInvocation SimpleName get view original text
table SimpleName MethodInvocation SimpleName get view original text
ret SimpleName MethodInvocation SimpleName set attribute
ret SimpleName MethodInvocation SimpleName attribute view original text
ret SimpleName MethodInvocation MethodInvocation SimpleName table
ret SimpleName MethodInvocation MethodInvocation SimpleName get view original text
set attribute SimpleName MethodInvocation SimpleName attribute view original text
set attribute SimpleName MethodInvocation MethodInvocation SimpleName table
set attribute SimpleName MethodInvocation MethodInvocation SimpleName get view original text
attribute view original text SimpleName MethodInvocation MethodInvocation SimpleName table
attribute view original text SimpleName MethodInvocation MethodInvocation SimpleName get view original text
table SimpleName MethodInvocation SimpleName get view expanded text
table SimpleName MethodInvocation SimpleName get view expanded text
ret SimpleName MethodInvocation SimpleName set attribute
ret SimpleName MethodInvocation SimpleName attribute view expanded text
ret SimpleName MethodInvocation MethodInvocation SimpleName table
ret SimpleName MethodInvocation MethodInvocation SimpleName get view expanded text
set attribute SimpleName MethodInvocation SimpleName attribute view expanded text
set attribute SimpleName MethodInvocation MethodInvocation SimpleName table
set attribute SimpleName MethodInvocation MethodInvocation SimpleName get view expanded text
attribute view expanded text SimpleName MethodInvocation MethodInvocation SimpleName table
attribute view expanded text SimpleName MethodInvocation MethodInvocation SimpleName get view expanded text
get object id SimpleName MethodInvocation SimpleName ret
table id SimpleName VariableDeclarationFragment MethodInvocation SimpleName get object id
table id SimpleName VariableDeclarationFragment MethodInvocation SimpleName ret
atlas object id SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table id
get storage desc entity SimpleName MethodInvocation SimpleName table id
get storage desc entity SimpleName MethodInvocation SimpleName table
table id SimpleName MethodInvocation SimpleName table
sd SimpleName VariableDeclarationFragment MethodInvocation SimpleName get storage desc entity
sd SimpleName VariableDeclarationFragment MethodInvocation SimpleName table id
sd SimpleName VariableDeclarationFragment MethodInvocation SimpleName table
atlas entity SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName sd
list SimpleName SimpleType ParameterizedType SimpleType SimpleName atlas entity
table SimpleName MethodInvocation SimpleName get partition keys
get column entities SimpleName MethodInvocation SimpleName table id
get column entities SimpleName MethodInvocation SimpleName table
get column entities SimpleName MethodInvocation MethodInvocation SimpleName table
get column entities SimpleName MethodInvocation MethodInvocation SimpleName get partition keys
table id SimpleName MethodInvocation SimpleName table
table id SimpleName MethodInvocation MethodInvocation SimpleName table
table id SimpleName MethodInvocation MethodInvocation SimpleName get partition keys
table SimpleName MethodInvocation MethodInvocation SimpleName table
table SimpleName MethodInvocation MethodInvocation SimpleName get partition keys
partition keys SimpleName VariableDeclarationFragment MethodInvocation SimpleName get column entities
partition keys SimpleName VariableDeclarationFragment MethodInvocation SimpleName table id
partition keys SimpleName VariableDeclarationFragment MethodInvocation SimpleName table
partition keys SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName table
partition keys SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get partition keys
list SimpleName SimpleType ParameterizedType SimpleType SimpleName atlas entity
table SimpleName MethodInvocation SimpleName get cols
get column entities SimpleName MethodInvocation SimpleName table id
get column entities SimpleName MethodInvocation SimpleName table
get column entities SimpleName MethodInvocation MethodInvocation SimpleName table
get column entities SimpleName MethodInvocation MethodInvocation SimpleName get cols
table id SimpleName MethodInvocation SimpleName table
table id SimpleName MethodInvocation MethodInvocation SimpleName table
table id SimpleName MethodInvocation MethodInvocation SimpleName get cols
table SimpleName MethodInvocation MethodInvocation SimpleName table
table SimpleName MethodInvocation MethodInvocation SimpleName get cols
columns SimpleName VariableDeclarationFragment MethodInvocation SimpleName get column entities
columns SimpleName VariableDeclarationFragment MethodInvocation SimpleName table id
columns SimpleName VariableDeclarationFragment MethodInvocation SimpleName table
columns SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName table
columns SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get cols
entity ext info SimpleName MethodInvocation SimpleName add referred entity
entity ext info SimpleName MethodInvocation SimpleName sd
add referred entity SimpleName MethodInvocation SimpleName sd
atlas entity SimpleName SimpleType SingleVariableDeclaration SimpleName partition key
entity ext info SimpleName MethodInvocation SimpleName add referred entity
entity ext info SimpleName MethodInvocation SimpleName partition key
add referred entity SimpleName MethodInvocation SimpleName partition key
atlas entity SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName partition keys
partition key SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName partition keys
atlas entity SimpleName SimpleType SingleVariableDeclaration SimpleName column
entity ext info SimpleName MethodInvocation SimpleName add referred entity
entity ext info SimpleName MethodInvocation SimpleName column
add referred entity SimpleName MethodInvocation SimpleName column
atlas entity SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName columns
column SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName columns
get object id SimpleName MethodInvocation SimpleName sd
ret SimpleName MethodInvocation SimpleName set attribute
ret SimpleName MethodInvocation SimpleName attribute storagedesc
ret SimpleName MethodInvocation MethodInvocation SimpleName get object id
ret SimpleName MethodInvocation MethodInvocation SimpleName sd
set attribute SimpleName MethodInvocation SimpleName attribute storagedesc
set attribute SimpleName MethodInvocation MethodInvocation SimpleName get object id
set attribute SimpleName MethodInvocation MethodInvocation SimpleName sd
attribute storagedesc SimpleName MethodInvocation MethodInvocation SimpleName get object id
attribute storagedesc SimpleName MethodInvocation MethodInvocation SimpleName sd
get object ids SimpleName MethodInvocation SimpleName partition keys
ret SimpleName MethodInvocation SimpleName set attribute
ret SimpleName MethodInvocation SimpleName attribute partition keys
ret SimpleName MethodInvocation MethodInvocation SimpleName get object ids
ret SimpleName MethodInvocation MethodInvocation SimpleName partition keys
set attribute SimpleName MethodInvocation SimpleName attribute partition keys
set attribute SimpleName MethodInvocation MethodInvocation SimpleName get object ids
set attribute SimpleName MethodInvocation MethodInvocation SimpleName partition keys
attribute partition keys SimpleName MethodInvocation MethodInvocation SimpleName get object ids
attribute partition keys SimpleName MethodInvocation MethodInvocation SimpleName partition keys
get object ids SimpleName MethodInvocation SimpleName columns
ret SimpleName MethodInvocation SimpleName set attribute
ret SimpleName MethodInvocation SimpleName attribute columns
ret SimpleName MethodInvocation MethodInvocation SimpleName get object ids
ret SimpleName MethodInvocation MethodInvocation SimpleName columns
set attribute SimpleName MethodInvocation SimpleName attribute columns
set attribute SimpleName MethodInvocation MethodInvocation SimpleName get object ids
set attribute SimpleName MethodInvocation MethodInvocation SimpleName columns
attribute columns SimpleName MethodInvocation MethodInvocation SimpleName get object ids
attribute columns SimpleName MethodInvocation MethodInvocation SimpleName columns
context SimpleName MethodInvocation SimpleName put entity
context SimpleName MethodInvocation SimpleName tbl qualified name
context SimpleName MethodInvocation SimpleName ret
put entity SimpleName MethodInvocation SimpleName tbl qualified name
put entity SimpleName MethodInvocation SimpleName ret
tbl qualified name SimpleName MethodInvocation SimpleName ret
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType long
boolean PrimitiveType VariableDeclarationStatement Block ReturnStatement SimpleName ret
protected Modifier MethodDeclaration SimpleType SimpleName atlas entity
protected Modifier MethodDeclaration SimpleName to table entity
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName atlas object id
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleName db id
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName table
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleName table
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName atlas entity ext info
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleName entity ext info
atlas entity SimpleName SimpleType MethodDeclaration SimpleName to table entity
atlas entity SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName db id
atlas entity SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName table
atlas entity SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName entity ext info
atlas entity SimpleName SimpleType MethodDeclaration SimpleType SimpleName exception
to table entity SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName atlas object id
to table entity SimpleName MethodDeclaration SingleVariableDeclaration SimpleName db id
to table entity SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName table
to table entity SimpleName MethodDeclaration SingleVariableDeclaration SimpleName table
to table entity SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName atlas entity ext info
to table entity SimpleName MethodDeclaration SingleVariableDeclaration SimpleName entity ext info
to table entity SimpleName MethodDeclaration SimpleType SimpleName exception
to table entity SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType boolean
to table entity SimpleName MethodDeclaration Block ReturnStatement SimpleName ret
db id SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName table
db id SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName entity ext info
db id SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
table SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName entity ext info
table SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
entity ext info SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier protected
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName atlas entity
public Modifier TypeDeclaration MethodDeclaration SimpleName to table entity
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName db id
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName table
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName entity ext info
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration Modifier protected
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName atlas entity
test SimpleName TypeDeclaration MethodDeclaration SimpleName to table entity
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName db id
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName table
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName entity ext info
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception