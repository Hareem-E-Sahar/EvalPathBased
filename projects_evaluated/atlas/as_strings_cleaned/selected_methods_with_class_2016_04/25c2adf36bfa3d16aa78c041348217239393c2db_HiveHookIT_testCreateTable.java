table name SimpleName VariableDeclarationFragment MethodInvocation SimpleName table name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table name
db name SimpleName VariableDeclarationFragment MethodInvocation SimpleName create database
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName db name
col name SimpleName VariableDeclarationFragment MethodInvocation SimpleName column name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName col name
create table StringLiteral InfixExpression SimpleName db name
create table StringLiteral InfixExpression StringLiteral .
create table StringLiteral InfixExpression SimpleName table name
create table StringLiteral InfixExpression StringLiteral (
create table StringLiteral InfixExpression SimpleName col name
db name SimpleName InfixExpression StringLiteral .
db name SimpleName InfixExpression SimpleName table name
db name SimpleName InfixExpression StringLiteral (
db name SimpleName InfixExpression SimpleName col name
db name SimpleName InfixExpression StringLiteral int name string
. StringLiteral InfixExpression SimpleName table name
. StringLiteral InfixExpression StringLiteral (
. StringLiteral InfixExpression SimpleName col name
. StringLiteral InfixExpression StringLiteral int name string
table name SimpleName InfixExpression StringLiteral (
table name SimpleName InfixExpression SimpleName col name
table name SimpleName InfixExpression StringLiteral int name string
( StringLiteral InfixExpression SimpleName col name
( StringLiteral InfixExpression StringLiteral int name string
col name SimpleName InfixExpression StringLiteral int name string
run command SimpleName MethodInvocation InfixExpression StringLiteral create table
run command SimpleName MethodInvocation InfixExpression SimpleName db name
run command SimpleName MethodInvocation InfixExpression StringLiteral .
run command SimpleName MethodInvocation InfixExpression SimpleName table name
run command SimpleName MethodInvocation InfixExpression StringLiteral (
run command SimpleName MethodInvocation InfixExpression SimpleName col name
run command SimpleName MethodInvocation InfixExpression StringLiteral int name string
assert table is registered SimpleName MethodInvocation SimpleName db name
assert table is registered SimpleName MethodInvocation SimpleName table name
db name SimpleName MethodInvocation SimpleName table name
table id SimpleName VariableDeclarationFragment MethodInvocation SimpleName assert table is registered
table id SimpleName VariableDeclarationFragment MethodInvocation SimpleName db name
table id SimpleName VariableDeclarationFragment MethodInvocation SimpleName table name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table id
hive meta store bridge SimpleName MethodInvocation SimpleName get table qualified name
hive meta store bridge SimpleName MethodInvocation SimpleName cluster name
hive meta store bridge SimpleName MethodInvocation SimpleName db name
hive meta store bridge SimpleName MethodInvocation SimpleName table name
get table qualified name SimpleName MethodInvocation SimpleName cluster name
get table qualified name SimpleName MethodInvocation SimpleName db name
get table qualified name SimpleName MethodInvocation SimpleName table name
cluster name SimpleName MethodInvocation SimpleName db name
cluster name SimpleName MethodInvocation SimpleName table name
db name SimpleName MethodInvocation SimpleName table name
hive meta store bridge SimpleName MethodInvocation SimpleName get column qualified name
hive meta store bridge SimpleName MethodInvocation MethodInvocation SimpleName hive meta store bridge
hive meta store bridge SimpleName MethodInvocation MethodInvocation SimpleName get table qualified name
hive meta store bridge SimpleName MethodInvocation MethodInvocation SimpleName cluster name
hive meta store bridge SimpleName MethodInvocation MethodInvocation SimpleName db name
hive meta store bridge SimpleName MethodInvocation MethodInvocation SimpleName table name
hive meta store bridge SimpleName MethodInvocation SimpleName col name
get column qualified name SimpleName MethodInvocation MethodInvocation SimpleName hive meta store bridge
get column qualified name SimpleName MethodInvocation MethodInvocation SimpleName get table qualified name
get column qualified name SimpleName MethodInvocation MethodInvocation SimpleName cluster name
get column qualified name SimpleName MethodInvocation MethodInvocation SimpleName db name
get column qualified name SimpleName MethodInvocation MethodInvocation SimpleName table name
get column qualified name SimpleName MethodInvocation SimpleName col name
hive meta store bridge SimpleName MethodInvocation MethodInvocation SimpleName col name
get table qualified name SimpleName MethodInvocation MethodInvocation SimpleName col name
cluster name SimpleName MethodInvocation MethodInvocation SimpleName col name
db name SimpleName MethodInvocation MethodInvocation SimpleName col name
table name SimpleName MethodInvocation MethodInvocation SimpleName col name
assert column is registered SimpleName MethodInvocation MethodInvocation SimpleName hive meta store bridge
assert column is registered SimpleName MethodInvocation MethodInvocation SimpleName get column qualified name
assert column is registered SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName hive meta store bridge
assert column is registered SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get table qualified name
assert column is registered SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName cluster name
assert column is registered SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName db name
assert column is registered SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName table name
assert column is registered SimpleName MethodInvocation MethodInvocation SimpleName col name
col id SimpleName VariableDeclarationFragment MethodInvocation SimpleName assert column is registered
col id SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName hive meta store bridge
col id SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get column qualified name
col id SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName col name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName col id
atlas client SimpleName MethodInvocation SimpleName get entity
atlas client SimpleName MethodInvocation SimpleName col id
get entity SimpleName MethodInvocation SimpleName col id
col entity SimpleName VariableDeclarationFragment MethodInvocation SimpleName atlas client
col entity SimpleName VariableDeclarationFragment MethodInvocation SimpleName get entity
col entity SimpleName VariableDeclarationFragment MethodInvocation SimpleName col id
referenceable SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName col entity
col entity SimpleName MethodInvocation SimpleName get
col entity SimpleName MethodInvocation QualifiedName atlas clientreferenceable attribute name
get SimpleName MethodInvocation QualifiedName atlas clientreferenceable attribute name
db name SimpleName MethodInvocation SimpleName to lower case
table name SimpleName MethodInvocation SimpleName to lower case
col name SimpleName MethodInvocation SimpleName to lower case
string SimpleName MethodInvocation SimpleName format
string SimpleName MethodInvocation StringLiteral ssss
string SimpleName MethodInvocation MethodInvocation SimpleName db name
string SimpleName MethodInvocation MethodInvocation SimpleName to lower case
string SimpleName MethodInvocation MethodInvocation SimpleName table name
string SimpleName MethodInvocation MethodInvocation SimpleName to lower case
string SimpleName MethodInvocation MethodInvocation SimpleName col name
string SimpleName MethodInvocation MethodInvocation SimpleName to lower case
format SimpleName MethodInvocation StringLiteral ssss
format SimpleName MethodInvocation MethodInvocation SimpleName db name
format SimpleName MethodInvocation MethodInvocation SimpleName to lower case
format SimpleName MethodInvocation MethodInvocation SimpleName table name
format SimpleName MethodInvocation MethodInvocation SimpleName to lower case
format SimpleName MethodInvocation MethodInvocation SimpleName col name
format SimpleName MethodInvocation MethodInvocation SimpleName to lower case
format SimpleName MethodInvocation SimpleName cluster name
ssss StringLiteral MethodInvocation MethodInvocation SimpleName db name
ssss StringLiteral MethodInvocation MethodInvocation SimpleName to lower case
ssss StringLiteral MethodInvocation MethodInvocation SimpleName table name
ssss StringLiteral MethodInvocation MethodInvocation SimpleName to lower case
ssss StringLiteral MethodInvocation MethodInvocation SimpleName col name
ssss StringLiteral MethodInvocation MethodInvocation SimpleName to lower case
ssss StringLiteral MethodInvocation SimpleName cluster name
db name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName table name
db name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to lower case
to lower case SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName table name
to lower case SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to lower case
db name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName col name
db name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to lower case
to lower case SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName col name
to lower case SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to lower case
db name SimpleName MethodInvocation MethodInvocation SimpleName cluster name
to lower case SimpleName MethodInvocation MethodInvocation SimpleName cluster name
table name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName col name
table name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to lower case
to lower case SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName col name
to lower case SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to lower case
table name SimpleName MethodInvocation MethodInvocation SimpleName cluster name
to lower case SimpleName MethodInvocation MethodInvocation SimpleName cluster name
col name SimpleName MethodInvocation MethodInvocation SimpleName cluster name
to lower case SimpleName MethodInvocation MethodInvocation SimpleName cluster name
assert SimpleName MethodInvocation SimpleName assert equals
assert SimpleName MethodInvocation MethodInvocation SimpleName col entity
assert SimpleName MethodInvocation MethodInvocation SimpleName get
assert SimpleName MethodInvocation MethodInvocation QualifiedName atlas clientreferenceable attribute name
assert SimpleName MethodInvocation MethodInvocation SimpleName string
assert SimpleName MethodInvocation MethodInvocation SimpleName format
assert SimpleName MethodInvocation MethodInvocation StringLiteral ssss
assert SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName db name
assert SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to lower case
assert SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName table name
assert SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to lower case
assert SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName col name
assert SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to lower case
assert SimpleName MethodInvocation MethodInvocation SimpleName cluster name
assert equals SimpleName MethodInvocation MethodInvocation SimpleName col entity
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get
assert equals SimpleName MethodInvocation MethodInvocation QualifiedName atlas clientreferenceable attribute name
assert equals SimpleName MethodInvocation MethodInvocation SimpleName string
assert equals SimpleName MethodInvocation MethodInvocation SimpleName format
assert equals SimpleName MethodInvocation MethodInvocation StringLiteral ssss
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName db name
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to lower case
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName table name
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to lower case
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName col name
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to lower case
assert equals SimpleName MethodInvocation MethodInvocation SimpleName cluster name
col entity SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName string
col entity SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName format
col entity SimpleName MethodInvocation MethodInvocation MethodInvocation StringLiteral ssss
col entity SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName cluster name
get SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName string
get SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName format
get SimpleName MethodInvocation MethodInvocation MethodInvocation StringLiteral ssss
get SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName cluster name
atlas clientreferenceable attribute name QualifiedName MethodInvocation MethodInvocation MethodInvocation SimpleName string
atlas clientreferenceable attribute name QualifiedName MethodInvocation MethodInvocation MethodInvocation SimpleName format
atlas clientreferenceable attribute name QualifiedName MethodInvocation MethodInvocation MethodInvocation StringLiteral ssss
atlas clientreferenceable attribute name QualifiedName MethodInvocation MethodInvocation MethodInvocation SimpleName cluster name
col entity SimpleName MethodInvocation SimpleName get
col entity SimpleName MethodInvocation QualifiedName hive data model generatortable
get SimpleName MethodInvocation QualifiedName hive data model generatortable
assert SimpleName MethodInvocation SimpleName assert not null
assert SimpleName MethodInvocation MethodInvocation SimpleName col entity
assert SimpleName MethodInvocation MethodInvocation SimpleName get
assert SimpleName MethodInvocation MethodInvocation QualifiedName hive data model generatortable
assert not null SimpleName MethodInvocation MethodInvocation SimpleName col entity
assert not null SimpleName MethodInvocation MethodInvocation SimpleName get
assert not null SimpleName MethodInvocation MethodInvocation QualifiedName hive data model generatortable
col entity SimpleName MethodInvocation SimpleName get
col entity SimpleName MethodInvocation QualifiedName hive data model generatortable
get SimpleName MethodInvocation QualifiedName hive data model generatortable
id SimpleName SimpleType CastExpression MethodInvocation SimpleName col entity
id SimpleName SimpleType CastExpression MethodInvocation SimpleName get
id SimpleName SimpleType CastExpression MethodInvocation QualifiedName hive data model generatortable
assert SimpleName MethodInvocation SimpleName assert equals
assert SimpleName MethodInvocation MethodInvocation SimpleName get id
assert SimpleName MethodInvocation SimpleName table id
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get id
assert equals SimpleName MethodInvocation SimpleName table id
get id SimpleName MethodInvocation MethodInvocation SimpleName table id
table name SimpleName Assignment MethodInvocation SimpleName create table
assert table is registered SimpleName MethodInvocation SimpleName default db
assert table is registered SimpleName MethodInvocation SimpleName table name
default db SimpleName MethodInvocation SimpleName table name
table id SimpleName Assignment MethodInvocation SimpleName assert table is registered
table id SimpleName Assignment MethodInvocation SimpleName default db
table id SimpleName Assignment MethodInvocation SimpleName table name
atlas client SimpleName MethodInvocation SimpleName get entity
atlas client SimpleName MethodInvocation SimpleName table id
get entity SimpleName MethodInvocation SimpleName table id
table ref SimpleName VariableDeclarationFragment MethodInvocation SimpleName atlas client
table ref SimpleName VariableDeclarationFragment MethodInvocation SimpleName get entity
table ref SimpleName VariableDeclarationFragment MethodInvocation SimpleName table id
referenceable SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table ref
table ref SimpleName MethodInvocation SimpleName get
table ref SimpleName MethodInvocation QualifiedName hive data model generatortable type attr
get SimpleName MethodInvocation QualifiedName hive data model generatortable type attr
table typemanaged table QualifiedName MethodInvocation SimpleName name
assert SimpleName MethodInvocation SimpleName assert equals
assert SimpleName MethodInvocation MethodInvocation SimpleName table ref
assert SimpleName MethodInvocation MethodInvocation SimpleName get
assert SimpleName MethodInvocation MethodInvocation QualifiedName hive data model generatortable type attr
assert SimpleName MethodInvocation MethodInvocation QualifiedName table typemanaged table
assert SimpleName MethodInvocation MethodInvocation SimpleName name
assert equals SimpleName MethodInvocation MethodInvocation SimpleName table ref
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get
assert equals SimpleName MethodInvocation MethodInvocation QualifiedName hive data model generatortable type attr
assert equals SimpleName MethodInvocation MethodInvocation QualifiedName table typemanaged table
assert equals SimpleName MethodInvocation MethodInvocation SimpleName name
table ref SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName table typemanaged table
table ref SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName name
get SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName table typemanaged table
get SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName name
hive data model generatortable type attr QualifiedName MethodInvocation MethodInvocation MethodInvocation QualifiedName table typemanaged table
hive data model generatortable type attr QualifiedName MethodInvocation MethodInvocation MethodInvocation SimpleName name
table ref SimpleName MethodInvocation SimpleName get
table ref SimpleName MethodInvocation QualifiedName hive data model generatorcomment
get SimpleName MethodInvocation QualifiedName hive data model generatorcomment
assert SimpleName MethodInvocation SimpleName assert equals
assert SimpleName MethodInvocation MethodInvocation SimpleName table ref
assert SimpleName MethodInvocation MethodInvocation SimpleName get
assert SimpleName MethodInvocation MethodInvocation QualifiedName hive data model generatorcomment
assert SimpleName MethodInvocation StringLiteral table comment
assert equals SimpleName MethodInvocation MethodInvocation SimpleName table ref
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get
assert equals SimpleName MethodInvocation MethodInvocation QualifiedName hive data model generatorcomment
assert equals SimpleName MethodInvocation StringLiteral table comment
table ref SimpleName MethodInvocation MethodInvocation StringLiteral table comment
get SimpleName MethodInvocation MethodInvocation StringLiteral table comment
hive data model generatorcomment QualifiedName MethodInvocation MethodInvocation StringLiteral table comment
hive meta store bridge SimpleName MethodInvocation SimpleName get table qualified name
hive meta store bridge SimpleName MethodInvocation SimpleName cluster name
hive meta store bridge SimpleName MethodInvocation SimpleName default db
hive meta store bridge SimpleName MethodInvocation SimpleName table name
get table qualified name SimpleName MethodInvocation SimpleName cluster name
get table qualified name SimpleName MethodInvocation SimpleName default db
get table qualified name SimpleName MethodInvocation SimpleName table name
cluster name SimpleName MethodInvocation SimpleName default db
cluster name SimpleName MethodInvocation SimpleName table name
default db SimpleName MethodInvocation SimpleName table name
entity name SimpleName VariableDeclarationFragment MethodInvocation SimpleName hive meta store bridge
entity name SimpleName VariableDeclarationFragment MethodInvocation SimpleName get table qualified name
entity name SimpleName VariableDeclarationFragment MethodInvocation SimpleName cluster name
entity name SimpleName VariableDeclarationFragment MethodInvocation SimpleName default db
entity name SimpleName VariableDeclarationFragment MethodInvocation SimpleName table name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName entity name
table ref SimpleName MethodInvocation SimpleName get
table ref SimpleName MethodInvocation QualifiedName hive data model generatorname
get SimpleName MethodInvocation QualifiedName hive data model generatorname
assert SimpleName MethodInvocation SimpleName assert equals
assert SimpleName MethodInvocation MethodInvocation SimpleName table ref
assert SimpleName MethodInvocation MethodInvocation SimpleName get
assert SimpleName MethodInvocation MethodInvocation QualifiedName hive data model generatorname
assert SimpleName MethodInvocation SimpleName entity name
assert equals SimpleName MethodInvocation MethodInvocation SimpleName table ref
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get
assert equals SimpleName MethodInvocation MethodInvocation QualifiedName hive data model generatorname
assert equals SimpleName MethodInvocation SimpleName entity name
table ref SimpleName MethodInvocation MethodInvocation SimpleName entity name
get SimpleName MethodInvocation MethodInvocation SimpleName entity name
hive data model generatorname QualifiedName MethodInvocation MethodInvocation SimpleName entity name
table ref SimpleName MethodInvocation SimpleName get
table ref SimpleName MethodInvocation QualifiedName hive data model generatorname
get SimpleName MethodInvocation QualifiedName hive data model generatorname
table name SimpleName MethodInvocation SimpleName to lower case
default StringLiteral InfixExpression MethodInvocation SimpleName table name
default StringLiteral InfixExpression MethodInvocation SimpleName to lower case
default StringLiteral InfixExpression StringLiteral @
default StringLiteral InfixExpression SimpleName cluster name
table name SimpleName MethodInvocation InfixExpression StringLiteral @
to lower case SimpleName MethodInvocation InfixExpression StringLiteral @
table name SimpleName MethodInvocation InfixExpression SimpleName cluster name
to lower case SimpleName MethodInvocation InfixExpression SimpleName cluster name
@ StringLiteral InfixExpression SimpleName cluster name
assert SimpleName MethodInvocation SimpleName assert equals
assert SimpleName MethodInvocation MethodInvocation SimpleName table ref
assert SimpleName MethodInvocation MethodInvocation SimpleName get
assert SimpleName MethodInvocation MethodInvocation QualifiedName hive data model generatorname
assert SimpleName MethodInvocation InfixExpression StringLiteral default
assert SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName table name
assert SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName to lower case
assert SimpleName MethodInvocation InfixExpression StringLiteral @
assert SimpleName MethodInvocation InfixExpression SimpleName cluster name
assert equals SimpleName MethodInvocation MethodInvocation SimpleName table ref
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get
assert equals SimpleName MethodInvocation MethodInvocation QualifiedName hive data model generatorname
assert equals SimpleName MethodInvocation InfixExpression StringLiteral default
assert equals SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName table name
assert equals SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName to lower case
assert equals SimpleName MethodInvocation InfixExpression StringLiteral @
assert equals SimpleName MethodInvocation InfixExpression SimpleName cluster name
table ref SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral default
table ref SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral @
table ref SimpleName MethodInvocation MethodInvocation InfixExpression SimpleName cluster name
get SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral default
get SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral @
get SimpleName MethodInvocation MethodInvocation InfixExpression SimpleName cluster name
hive data model generatorname QualifiedName MethodInvocation MethodInvocation InfixExpression StringLiteral default
hive data model generatorname QualifiedName MethodInvocation MethodInvocation InfixExpression StringLiteral @
hive data model generatorname QualifiedName MethodInvocation MethodInvocation InfixExpression SimpleName cluster name
hive meta store bridgehive client QualifiedName MethodInvocation SimpleName get table
hive meta store bridgehive client QualifiedName MethodInvocation SimpleName default db
hive meta store bridgehive client QualifiedName MethodInvocation SimpleName table name
get table SimpleName MethodInvocation SimpleName default db
get table SimpleName MethodInvocation SimpleName table name
default db SimpleName MethodInvocation SimpleName table name
t SimpleName VariableDeclarationFragment MethodInvocation QualifiedName hive meta store bridgehive client
t SimpleName VariableDeclarationFragment MethodInvocation SimpleName get table
t SimpleName VariableDeclarationFragment MethodInvocation SimpleName default db
t SimpleName VariableDeclarationFragment MethodInvocation SimpleName table name
table SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName t
t SimpleName MethodInvocation SimpleName get metadata
t SimpleName MethodInvocation MethodInvocation SimpleName get property
get metadata SimpleName MethodInvocation MethodInvocation SimpleName get property
t SimpleName MethodInvocation MethodInvocation QualifiedName hive metastore constantsddl time
get metadata SimpleName MethodInvocation MethodInvocation QualifiedName hive metastore constantsddl time
get property SimpleName MethodInvocation QualifiedName hive metastore constantsddl time
long SimpleName MethodInvocation SimpleName parse long
long SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName t
long SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get metadata
long SimpleName MethodInvocation MethodInvocation SimpleName get property
long SimpleName MethodInvocation MethodInvocation QualifiedName hive metastore constantsddl time
parse long SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName t
parse long SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get metadata
parse long SimpleName MethodInvocation MethodInvocation SimpleName get property
parse long SimpleName MethodInvocation MethodInvocation QualifiedName hive metastore constantsddl time
long SimpleName MethodInvocation InfixExpression QualifiedName hive meta store bridgemillis convert factor
parse long SimpleName MethodInvocation InfixExpression QualifiedName hive meta store bridgemillis convert factor
get property SimpleName MethodInvocation MethodInvocation InfixExpression QualifiedName hive meta store bridgemillis convert factor
hive metastore constantsddl time QualifiedName MethodInvocation MethodInvocation InfixExpression QualifiedName hive meta store bridgemillis convert factor
create time SimpleName VariableDeclarationFragment InfixExpression MethodInvocation SimpleName long
create time SimpleName VariableDeclarationFragment InfixExpression MethodInvocation SimpleName parse long
create time SimpleName VariableDeclarationFragment InfixExpression QualifiedName hive meta store bridgemillis convert factor
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName create time
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment InfixExpression QualifiedName hive meta store bridgemillis convert factor
verify timestamps SimpleName MethodInvocation SimpleName table ref
verify timestamps SimpleName MethodInvocation QualifiedName hive data model generatorcreate time
verify timestamps SimpleName MethodInvocation SimpleName create time
table ref SimpleName MethodInvocation QualifiedName hive data model generatorcreate time
table ref SimpleName MethodInvocation SimpleName create time
hive data model generatorcreate time QualifiedName MethodInvocation SimpleName create time
verify timestamps SimpleName MethodInvocation SimpleName table ref
verify timestamps SimpleName MethodInvocation QualifiedName hive data model generatorlast access time
verify timestamps SimpleName MethodInvocation SimpleName create time
table ref SimpleName MethodInvocation QualifiedName hive data model generatorlast access time
table ref SimpleName MethodInvocation SimpleName create time
hive data model generatorlast access time QualifiedName MethodInvocation SimpleName create time
table ref SimpleName MethodInvocation SimpleName get
table ref SimpleName MethodInvocation QualifiedName hive data model generatorstorage desc
get SimpleName MethodInvocation QualifiedName hive data model generatorstorage desc
referenceable SimpleName SimpleType CastExpression MethodInvocation SimpleName table ref
referenceable SimpleName SimpleType CastExpression MethodInvocation SimpleName get
referenceable SimpleName SimpleType CastExpression MethodInvocation QualifiedName hive data model generatorstorage desc
sd ref SimpleName VariableDeclarationFragment CastExpression SimpleType SimpleName referenceable
sd ref SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName table ref
sd ref SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName get
sd ref SimpleName VariableDeclarationFragment CastExpression MethodInvocation QualifiedName hive data model generatorstorage desc
final Modifier VariableDeclarationStatement SimpleType SimpleName referenceable
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName sd ref
referenceable SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName sd ref
sd ref SimpleName MethodInvocation SimpleName get
sd ref SimpleName MethodInvocation QualifiedName hive data model generatorstorage is stored as sub dirs
get SimpleName MethodInvocation QualifiedName hive data model generatorstorage is stored as sub dirs
assert SimpleName MethodInvocation SimpleName assert equals
assert SimpleName MethodInvocation MethodInvocation SimpleName sd ref
assert SimpleName MethodInvocation MethodInvocation SimpleName get
assert SimpleName MethodInvocation MethodInvocation QualifiedName hive data model generatorstorage is stored as sub dirs
assert SimpleName MethodInvocation BooleanLiteral false
assert equals SimpleName MethodInvocation MethodInvocation SimpleName sd ref
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get
assert equals SimpleName MethodInvocation MethodInvocation QualifiedName hive data model generatorstorage is stored as sub dirs
assert equals SimpleName MethodInvocation BooleanLiteral false
sd ref SimpleName MethodInvocation MethodInvocation BooleanLiteral false
get SimpleName MethodInvocation MethodInvocation BooleanLiteral false
hive data model generatorstorage is stored as sub dirs QualifiedName MethodInvocation MethodInvocation BooleanLiteral false
sd ref SimpleName MethodInvocation SimpleName get
sd ref SimpleName MethodInvocation QualifiedName hive data model generatortable
get SimpleName MethodInvocation QualifiedName hive data model generatortable
assert SimpleName MethodInvocation SimpleName assert not null
assert SimpleName MethodInvocation MethodInvocation SimpleName sd ref
assert SimpleName MethodInvocation MethodInvocation SimpleName get
assert SimpleName MethodInvocation MethodInvocation QualifiedName hive data model generatortable
assert not null SimpleName MethodInvocation MethodInvocation SimpleName sd ref
assert not null SimpleName MethodInvocation MethodInvocation SimpleName get
assert not null SimpleName MethodInvocation MethodInvocation QualifiedName hive data model generatortable
sd ref SimpleName MethodInvocation SimpleName get
sd ref SimpleName MethodInvocation QualifiedName hive data model generatortable
get SimpleName MethodInvocation QualifiedName hive data model generatortable
id SimpleName SimpleType CastExpression MethodInvocation SimpleName sd ref
id SimpleName SimpleType CastExpression MethodInvocation SimpleName get
id SimpleName SimpleType CastExpression MethodInvocation QualifiedName hive data model generatortable
assert SimpleName MethodInvocation SimpleName assert equals
assert SimpleName MethodInvocation MethodInvocation SimpleName get id
assert SimpleName MethodInvocation SimpleName table id
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get id
assert equals SimpleName MethodInvocation SimpleName table id
get id SimpleName MethodInvocation MethodInvocation SimpleName table id
assert database is registered SimpleName MethodInvocation SimpleName default db
long PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement Modifier final
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test create table
test SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test create table
public Modifier MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType long
public Modifier MethodDeclaration Block VariableDeclarationStatement Modifier final
void PrimitiveType MethodDeclaration SimpleName test create table
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType long
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement Modifier final
test create table SimpleName MethodDeclaration SimpleType SimpleName exception
test create table SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType long
test create table SimpleName MethodDeclaration Block VariableDeclarationStatement Modifier final
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test create table
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test create table
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
