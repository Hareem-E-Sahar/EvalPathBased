conn SimpleName VariableDeclarationFragment MethodInvocation SimpleName get connector
connector SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName conn
get unique names SimpleName MethodInvocation NumberLiteral empty
get unique names SimpleName MethodInvocation ArrayAccess NumberLiteral empty
empty NumberLiteral MethodInvocation ArrayAccess NumberLiteral empty
table name SimpleName VariableDeclarationFragment ArrayAccess MethodInvocation SimpleName get unique names
table name SimpleName VariableDeclarationFragment ArrayAccess MethodInvocation NumberLiteral empty
table name SimpleName VariableDeclarationFragment ArrayAccess NumberLiteral empty
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table name
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName user
cluster SimpleName MethodInvocation SimpleName get client config
client conf SimpleName VariableDeclarationFragment MethodInvocation SimpleName cluster
client conf SimpleName VariableDeclarationFragment MethodInvocation SimpleName get client config
client configuration SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName client conf
client propertyinstance rpc sasl enabled QualifiedName MethodInvocation SimpleName get key
client conf SimpleName MethodInvocation SimpleName get boolean
client conf SimpleName MethodInvocation MethodInvocation QualifiedName client propertyinstance rpc sasl enabled
client conf SimpleName MethodInvocation MethodInvocation SimpleName get key
client conf SimpleName MethodInvocation BooleanLiteral false
get boolean SimpleName MethodInvocation MethodInvocation QualifiedName client propertyinstance rpc sasl enabled
get boolean SimpleName MethodInvocation MethodInvocation SimpleName get key
get boolean SimpleName MethodInvocation BooleanLiteral false
client propertyinstance rpc sasl enabled QualifiedName MethodInvocation MethodInvocation BooleanLiteral false
get key SimpleName MethodInvocation MethodInvocation BooleanLiteral false
sasl enabled SimpleName VariableDeclarationFragment MethodInvocation SimpleName client conf
sasl enabled SimpleName VariableDeclarationFragment MethodInvocation SimpleName get boolean
sasl enabled SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation QualifiedName client propertyinstance rpc sasl enabled
sasl enabled SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get key
sasl enabled SimpleName VariableDeclarationFragment MethodInvocation BooleanLiteral false
final Modifier VariableDeclarationStatement PrimitiveType boolean
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName sasl enabled
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName client conf
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get boolean
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation BooleanLiteral false
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName sasl enabled
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName client conf
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get boolean
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation BooleanLiteral false
get user SimpleName MethodInvocation NumberLiteral empty
user SimpleName VariableDeclarationFragment MethodInvocation SimpleName get user
user SimpleName VariableDeclarationFragment MethodInvocation NumberLiteral empty
cluster user SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName user
user SimpleName MethodInvocation SimpleName get principal
user SimpleName Assignment MethodInvocation SimpleName user
user SimpleName Assignment MethodInvocation SimpleName get principal
conn SimpleName MethodInvocation SimpleName security operations
conn SimpleName MethodInvocation MethodInvocation SimpleName create local user
security operations SimpleName MethodInvocation MethodInvocation SimpleName create local user
conn SimpleName MethodInvocation MethodInvocation SimpleName user
security operations SimpleName MethodInvocation MethodInvocation SimpleName user
create local user SimpleName MethodInvocation SimpleName user
conn SimpleName MethodInvocation SimpleName security operations
user SimpleName MethodInvocation SimpleName get password
password token SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName user
password token SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get password
conn SimpleName MethodInvocation MethodInvocation SimpleName create local user
security operations SimpleName MethodInvocation MethodInvocation SimpleName create local user
conn SimpleName MethodInvocation MethodInvocation SimpleName user
security operations SimpleName MethodInvocation MethodInvocation SimpleName user
create local user SimpleName MethodInvocation SimpleName user
create local user SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName password token
create local user SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName user
create local user SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get password
user SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName password token
user SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName user
user SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName get password
authorizations SimpleName SimpleType ClassInstanceCreation StringLiteral a
authorizations SimpleName SimpleType ClassInstanceCreation StringLiteral b
a StringLiteral ClassInstanceCreation StringLiteral b
auths SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName authorizations
auths SimpleName VariableDeclarationFragment ClassInstanceCreation StringLiteral a
auths SimpleName VariableDeclarationFragment ClassInstanceCreation StringLiteral b
authorizations SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName auths
conn SimpleName MethodInvocation SimpleName security operations
conn SimpleName MethodInvocation MethodInvocation SimpleName change user authorizations
security operations SimpleName MethodInvocation MethodInvocation SimpleName change user authorizations
conn SimpleName MethodInvocation MethodInvocation SimpleName user
security operations SimpleName MethodInvocation MethodInvocation SimpleName user
conn SimpleName MethodInvocation MethodInvocation SimpleName auths
security operations SimpleName MethodInvocation MethodInvocation SimpleName auths
change user authorizations SimpleName MethodInvocation SimpleName user
change user authorizations SimpleName MethodInvocation SimpleName auths
user SimpleName MethodInvocation SimpleName auths
conn SimpleName MethodInvocation SimpleName security operations
conn SimpleName MethodInvocation MethodInvocation SimpleName grant system permission
security operations SimpleName MethodInvocation MethodInvocation SimpleName grant system permission
conn SimpleName MethodInvocation MethodInvocation SimpleName user
security operations SimpleName MethodInvocation MethodInvocation SimpleName user
conn SimpleName MethodInvocation MethodInvocation QualifiedName system permissioncreate table
security operations SimpleName MethodInvocation MethodInvocation QualifiedName system permissioncreate table
grant system permission SimpleName MethodInvocation SimpleName user
grant system permission SimpleName MethodInvocation QualifiedName system permissioncreate table
user SimpleName MethodInvocation QualifiedName system permissioncreate table
conn SimpleName MethodInvocation SimpleName get instance
user SimpleName MethodInvocation SimpleName get token
conn SimpleName MethodInvocation MethodInvocation SimpleName get connector
get instance SimpleName MethodInvocation MethodInvocation SimpleName get connector
conn SimpleName MethodInvocation MethodInvocation SimpleName user
get instance SimpleName MethodInvocation MethodInvocation SimpleName user
conn SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName user
conn SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get token
get instance SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName user
get instance SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get token
get connector SimpleName MethodInvocation SimpleName user
get connector SimpleName MethodInvocation MethodInvocation SimpleName user
get connector SimpleName MethodInvocation MethodInvocation SimpleName get token
user SimpleName MethodInvocation MethodInvocation SimpleName user
user SimpleName MethodInvocation MethodInvocation SimpleName get token
conn SimpleName Assignment MethodInvocation MethodInvocation SimpleName conn
conn SimpleName Assignment MethodInvocation MethodInvocation SimpleName get instance
conn SimpleName Assignment MethodInvocation SimpleName get connector
conn SimpleName Assignment MethodInvocation SimpleName user
conn SimpleName Assignment MethodInvocation MethodInvocation SimpleName user
conn SimpleName Assignment MethodInvocation MethodInvocation SimpleName get token
conn SimpleName MethodInvocation SimpleName table operations
conn SimpleName MethodInvocation MethodInvocation SimpleName create
table operations SimpleName MethodInvocation MethodInvocation SimpleName create
conn SimpleName MethodInvocation MethodInvocation SimpleName table name
table operations SimpleName MethodInvocation MethodInvocation SimpleName table name
create SimpleName MethodInvocation SimpleName table name
conditional writer config SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName set authorizations
conditional writer config SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName auths
set authorizations SimpleName MethodInvocation SimpleName auths
conn SimpleName MethodInvocation SimpleName create conditional writer
conn SimpleName MethodInvocation SimpleName table name
conn SimpleName MethodInvocation MethodInvocation SimpleName set authorizations
conn SimpleName MethodInvocation MethodInvocation SimpleName auths
create conditional writer SimpleName MethodInvocation SimpleName table name
create conditional writer SimpleName MethodInvocation MethodInvocation SimpleName set authorizations
create conditional writer SimpleName MethodInvocation MethodInvocation SimpleName auths
table name SimpleName MethodInvocation MethodInvocation SimpleName set authorizations
table name SimpleName MethodInvocation MethodInvocation SimpleName auths
cw SimpleName VariableDeclarationFragment MethodInvocation SimpleName conn
cw SimpleName VariableDeclarationFragment MethodInvocation SimpleName create conditional writer
cw SimpleName VariableDeclarationFragment MethodInvocation SimpleName table name
cw SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName set authorizations
cw SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName auths
conditional writer SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName cw
column visibility SimpleName SimpleType ClassInstanceCreation StringLiteral a
cva SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName column visibility
cva SimpleName VariableDeclarationFragment ClassInstanceCreation StringLiteral a
column visibility SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName cva
column visibility SimpleName SimpleType ClassInstanceCreation StringLiteral b
cvb SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName column visibility
cvb SimpleName VariableDeclarationFragment ClassInstanceCreation StringLiteral b
column visibility SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName cvb
condition SimpleName SimpleType ClassInstanceCreation StringLiteral tx
condition SimpleName SimpleType ClassInstanceCreation StringLiteral seq
tx StringLiteral ClassInstanceCreation StringLiteral seq
condition SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName set visibility
tx StringLiteral ClassInstanceCreation MethodInvocation SimpleName set visibility
seq StringLiteral ClassInstanceCreation MethodInvocation SimpleName set visibility
condition SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName cva
tx StringLiteral ClassInstanceCreation MethodInvocation SimpleName cva
seq StringLiteral ClassInstanceCreation MethodInvocation SimpleName cva
set visibility SimpleName MethodInvocation SimpleName cva
conditional mutation SimpleName SimpleType ClassInstanceCreation StringLiteral empty
conditional mutation SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName set visibility
conditional mutation SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName cva
empty StringLiteral ClassInstanceCreation MethodInvocation ClassInstanceCreation StringLiteral tx
empty StringLiteral ClassInstanceCreation MethodInvocation ClassInstanceCreation StringLiteral seq
empty StringLiteral ClassInstanceCreation MethodInvocation SimpleName set visibility
empty StringLiteral ClassInstanceCreation MethodInvocation SimpleName cva
cm SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName conditional mutation
cm SimpleName VariableDeclarationFragment ClassInstanceCreation StringLiteral empty
cm SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName set visibility
cm SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName cva
conditional mutation SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName cm
cm SimpleName MethodInvocation SimpleName put
cm SimpleName MethodInvocation StringLiteral name
cm SimpleName MethodInvocation StringLiteral last
cm SimpleName MethodInvocation SimpleName cva
cm SimpleName MethodInvocation StringLiteral doe
put SimpleName MethodInvocation StringLiteral name
put SimpleName MethodInvocation StringLiteral last
put SimpleName MethodInvocation SimpleName cva
put SimpleName MethodInvocation StringLiteral doe
name StringLiteral MethodInvocation StringLiteral last
name StringLiteral MethodInvocation SimpleName cva
name StringLiteral MethodInvocation StringLiteral doe
last StringLiteral MethodInvocation SimpleName cva
last StringLiteral MethodInvocation StringLiteral doe
cva SimpleName MethodInvocation StringLiteral doe
cm SimpleName MethodInvocation SimpleName put
cm SimpleName MethodInvocation StringLiteral name
cm SimpleName MethodInvocation StringLiteral first
cm SimpleName MethodInvocation SimpleName cva
cm SimpleName MethodInvocation StringLiteral john
put SimpleName MethodInvocation StringLiteral name
put SimpleName MethodInvocation StringLiteral first
put SimpleName MethodInvocation SimpleName cva
put SimpleName MethodInvocation StringLiteral john
name StringLiteral MethodInvocation StringLiteral first
name StringLiteral MethodInvocation SimpleName cva
name StringLiteral MethodInvocation StringLiteral john
first StringLiteral MethodInvocation SimpleName cva
first StringLiteral MethodInvocation StringLiteral john
cva SimpleName MethodInvocation StringLiteral john
cm SimpleName MethodInvocation SimpleName put
cm SimpleName MethodInvocation StringLiteral tx
cm SimpleName MethodInvocation StringLiteral seq
cm SimpleName MethodInvocation SimpleName cva
cm SimpleName MethodInvocation StringLiteral empty
put SimpleName MethodInvocation StringLiteral tx
put SimpleName MethodInvocation StringLiteral seq
put SimpleName MethodInvocation SimpleName cva
put SimpleName MethodInvocation StringLiteral empty
tx StringLiteral MethodInvocation StringLiteral seq
tx StringLiteral MethodInvocation SimpleName cva
tx StringLiteral MethodInvocation StringLiteral empty
seq StringLiteral MethodInvocation SimpleName cva
seq StringLiteral MethodInvocation StringLiteral empty
cva SimpleName MethodInvocation StringLiteral empty
cw SimpleName MethodInvocation SimpleName write
cw SimpleName MethodInvocation SimpleName cm
write SimpleName MethodInvocation SimpleName cm
cw SimpleName MethodInvocation MethodInvocation SimpleName get status
write SimpleName MethodInvocation MethodInvocation SimpleName get status
cm SimpleName MethodInvocation MethodInvocation SimpleName get status
assert SimpleName MethodInvocation SimpleName assert equals
assert SimpleName MethodInvocation QualifiedName statusaccepted
assert SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName cw
assert SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName write
assert SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName cm
assert SimpleName MethodInvocation MethodInvocation SimpleName get status
assert equals SimpleName MethodInvocation QualifiedName statusaccepted
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName cw
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName write
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName cm
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get status
statusaccepted QualifiedName MethodInvocation MethodInvocation MethodInvocation SimpleName cw
statusaccepted QualifiedName MethodInvocation MethodInvocation MethodInvocation SimpleName write
statusaccepted QualifiedName MethodInvocation MethodInvocation MethodInvocation SimpleName cm
statusaccepted QualifiedName MethodInvocation MethodInvocation SimpleName get status
conn SimpleName MethodInvocation SimpleName create scanner
conn SimpleName MethodInvocation SimpleName table name
conn SimpleName MethodInvocation SimpleName auths
create scanner SimpleName MethodInvocation SimpleName table name
create scanner SimpleName MethodInvocation SimpleName auths
table name SimpleName MethodInvocation SimpleName auths
scanner SimpleName VariableDeclarationFragment MethodInvocation SimpleName conn
scanner SimpleName VariableDeclarationFragment MethodInvocation SimpleName create scanner
scanner SimpleName VariableDeclarationFragment MethodInvocation SimpleName table name
scanner SimpleName VariableDeclarationFragment MethodInvocation SimpleName auths
scanner SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName scanner
range SimpleName SimpleType ClassInstanceCreation StringLiteral empty
scanner SimpleName MethodInvocation SimpleName set range
scanner SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName range
scanner SimpleName MethodInvocation ClassInstanceCreation StringLiteral empty
set range SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName range
set range SimpleName MethodInvocation ClassInstanceCreation StringLiteral empty
text SimpleName SimpleType ClassInstanceCreation StringLiteral tx
text SimpleName SimpleType ClassInstanceCreation StringLiteral seq
scanner SimpleName MethodInvocation SimpleName fetch column
scanner SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName text
scanner SimpleName MethodInvocation ClassInstanceCreation StringLiteral tx
scanner SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName text
scanner SimpleName MethodInvocation ClassInstanceCreation StringLiteral seq
fetch column SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName text
fetch column SimpleName MethodInvocation ClassInstanceCreation StringLiteral tx
fetch column SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName text
fetch column SimpleName MethodInvocation ClassInstanceCreation StringLiteral seq
tx StringLiteral ClassInstanceCreation MethodInvocation ClassInstanceCreation StringLiteral seq
entry SimpleName SimpleType ParameterizedType SimpleType SimpleName key
entry SimpleName SimpleType ParameterizedType SimpleType SimpleName value
key SimpleName SimpleType ParameterizedType SimpleType SimpleName value
iterables SimpleName MethodInvocation SimpleName get only element
iterables SimpleName MethodInvocation SimpleName scanner
get only element SimpleName MethodInvocation SimpleName scanner
entry SimpleName VariableDeclarationFragment MethodInvocation SimpleName iterables
entry SimpleName VariableDeclarationFragment MethodInvocation SimpleName get only element
entry SimpleName VariableDeclarationFragment MethodInvocation SimpleName scanner
entry SimpleName MethodInvocation SimpleName get value
entry SimpleName MethodInvocation MethodInvocation SimpleName to string
get value SimpleName MethodInvocation MethodInvocation SimpleName to string
assert SimpleName MethodInvocation SimpleName assert equals
assert SimpleName MethodInvocation StringLiteral empty
assert SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName entry
assert SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get value
assert SimpleName MethodInvocation MethodInvocation SimpleName to string
assert equals SimpleName MethodInvocation StringLiteral empty
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName entry
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get value
assert equals SimpleName MethodInvocation MethodInvocation SimpleName to string
empty StringLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName entry
empty StringLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName get value
empty StringLiteral MethodInvocation MethodInvocation SimpleName to string
entry SimpleName MethodInvocation SimpleName get key
entry SimpleName MethodInvocation MethodInvocation SimpleName get timestamp
get key SimpleName MethodInvocation MethodInvocation SimpleName get timestamp
ts SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName entry
ts SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get key
ts SimpleName VariableDeclarationFragment MethodInvocation SimpleName get timestamp
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName ts
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get timestamp
condition SimpleName SimpleType ClassInstanceCreation StringLiteral tx a
condition SimpleName SimpleType ClassInstanceCreation StringLiteral seq
tx a StringLiteral ClassInstanceCreation StringLiteral seq
condition SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName set visibility
tx a StringLiteral ClassInstanceCreation MethodInvocation SimpleName set visibility
seq StringLiteral ClassInstanceCreation MethodInvocation SimpleName set visibility
condition SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName cva
tx a StringLiteral ClassInstanceCreation MethodInvocation SimpleName cva
seq StringLiteral ClassInstanceCreation MethodInvocation SimpleName cva
set visibility SimpleName MethodInvocation SimpleName cva
tx a StringLiteral ClassInstanceCreation MethodInvocation MethodInvocation SimpleName set value
seq StringLiteral ClassInstanceCreation MethodInvocation MethodInvocation SimpleName set value
set visibility SimpleName MethodInvocation MethodInvocation SimpleName set value
cva SimpleName MethodInvocation MethodInvocation SimpleName set value
tx a StringLiteral ClassInstanceCreation MethodInvocation MethodInvocation StringLiteral empty
seq StringLiteral ClassInstanceCreation MethodInvocation MethodInvocation StringLiteral empty
set visibility SimpleName MethodInvocation MethodInvocation StringLiteral empty
cva SimpleName MethodInvocation MethodInvocation StringLiteral empty
set value SimpleName MethodInvocation StringLiteral empty
conditional mutation SimpleName SimpleType ClassInstanceCreation StringLiteral empty
conditional mutation SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName set value
conditional mutation SimpleName SimpleType ClassInstanceCreation MethodInvocation StringLiteral empty
empty StringLiteral ClassInstanceCreation MethodInvocation MethodInvocation SimpleName set visibility
empty StringLiteral ClassInstanceCreation MethodInvocation MethodInvocation SimpleName cva
empty StringLiteral ClassInstanceCreation MethodInvocation SimpleName set value
empty StringLiteral ClassInstanceCreation MethodInvocation StringLiteral empty
cm SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName conditional mutation
cm SimpleName VariableDeclarationFragment ClassInstanceCreation StringLiteral empty
cm SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName set value
cm SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation StringLiteral empty
conditional mutation SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName cm
cm SimpleName MethodInvocation SimpleName put
cm SimpleName MethodInvocation StringLiteral name
cm SimpleName MethodInvocation StringLiteral last
cm SimpleName MethodInvocation SimpleName cva
cm SimpleName MethodInvocation StringLiteral doe
put SimpleName MethodInvocation StringLiteral name
put SimpleName MethodInvocation StringLiteral last
put SimpleName MethodInvocation SimpleName cva
put SimpleName MethodInvocation StringLiteral doe
name StringLiteral MethodInvocation StringLiteral last
name StringLiteral MethodInvocation SimpleName cva
name StringLiteral MethodInvocation StringLiteral doe
last StringLiteral MethodInvocation SimpleName cva
last StringLiteral MethodInvocation StringLiteral doe
cva SimpleName MethodInvocation StringLiteral doe
cm SimpleName MethodInvocation SimpleName put
cm SimpleName MethodInvocation StringLiteral name
cm SimpleName MethodInvocation StringLiteral first
cm SimpleName MethodInvocation SimpleName cva
cm SimpleName MethodInvocation StringLiteral john
put SimpleName MethodInvocation StringLiteral name
put SimpleName MethodInvocation StringLiteral first
put SimpleName MethodInvocation SimpleName cva
put SimpleName MethodInvocation StringLiteral john
name StringLiteral MethodInvocation StringLiteral first
name StringLiteral MethodInvocation SimpleName cva
name StringLiteral MethodInvocation StringLiteral john
first StringLiteral MethodInvocation SimpleName cva
first StringLiteral MethodInvocation StringLiteral john
cva SimpleName MethodInvocation StringLiteral john
cm SimpleName MethodInvocation SimpleName put
cm SimpleName MethodInvocation StringLiteral tx
cm SimpleName MethodInvocation StringLiteral seq
cm SimpleName MethodInvocation SimpleName cva
cm SimpleName MethodInvocation StringLiteral empty
put SimpleName MethodInvocation StringLiteral tx
put SimpleName MethodInvocation StringLiteral seq
put SimpleName MethodInvocation SimpleName cva
put SimpleName MethodInvocation StringLiteral empty
tx StringLiteral MethodInvocation StringLiteral seq
tx StringLiteral MethodInvocation SimpleName cva
tx StringLiteral MethodInvocation StringLiteral empty
seq StringLiteral MethodInvocation SimpleName cva
seq StringLiteral MethodInvocation StringLiteral empty
cva SimpleName MethodInvocation StringLiteral empty
cw SimpleName MethodInvocation SimpleName write
cw SimpleName MethodInvocation SimpleName cm
write SimpleName MethodInvocation SimpleName cm
cw SimpleName MethodInvocation MethodInvocation SimpleName get status
write SimpleName MethodInvocation MethodInvocation SimpleName get status
cm SimpleName MethodInvocation MethodInvocation SimpleName get status
assert SimpleName MethodInvocation SimpleName assert equals
assert SimpleName MethodInvocation QualifiedName statusrejected
assert SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName cw
assert SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName write
assert SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName cm
assert SimpleName MethodInvocation MethodInvocation SimpleName get status
assert equals SimpleName MethodInvocation QualifiedName statusrejected
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName cw
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName write
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName cm
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get status
statusrejected QualifiedName MethodInvocation MethodInvocation MethodInvocation SimpleName cw
statusrejected QualifiedName MethodInvocation MethodInvocation MethodInvocation SimpleName write
statusrejected QualifiedName MethodInvocation MethodInvocation MethodInvocation SimpleName cm
statusrejected QualifiedName MethodInvocation MethodInvocation SimpleName get status
condition SimpleName SimpleType ClassInstanceCreation StringLiteral tx
condition SimpleName SimpleType ClassInstanceCreation StringLiteral seq a
tx StringLiteral ClassInstanceCreation StringLiteral seq a
condition SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName set visibility
tx StringLiteral ClassInstanceCreation MethodInvocation SimpleName set visibility
seq a StringLiteral ClassInstanceCreation MethodInvocation SimpleName set visibility
condition SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName cva
tx StringLiteral ClassInstanceCreation MethodInvocation SimpleName cva
seq a StringLiteral ClassInstanceCreation MethodInvocation SimpleName cva
set visibility SimpleName MethodInvocation SimpleName cva
tx StringLiteral ClassInstanceCreation MethodInvocation MethodInvocation SimpleName set value
seq a StringLiteral ClassInstanceCreation MethodInvocation MethodInvocation SimpleName set value
set visibility SimpleName MethodInvocation MethodInvocation SimpleName set value
cva SimpleName MethodInvocation MethodInvocation SimpleName set value
tx StringLiteral ClassInstanceCreation MethodInvocation MethodInvocation StringLiteral empty
seq a StringLiteral ClassInstanceCreation MethodInvocation MethodInvocation StringLiteral empty
set visibility SimpleName MethodInvocation MethodInvocation StringLiteral empty
cva SimpleName MethodInvocation MethodInvocation StringLiteral empty
set value SimpleName MethodInvocation StringLiteral empty
conditional mutation SimpleName SimpleType ClassInstanceCreation StringLiteral empty
conditional mutation SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName set value
conditional mutation SimpleName SimpleType ClassInstanceCreation MethodInvocation StringLiteral empty
empty StringLiteral ClassInstanceCreation MethodInvocation MethodInvocation SimpleName set visibility
empty StringLiteral ClassInstanceCreation MethodInvocation MethodInvocation SimpleName cva
empty StringLiteral ClassInstanceCreation MethodInvocation SimpleName set value
empty StringLiteral ClassInstanceCreation MethodInvocation StringLiteral empty
cm SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName conditional mutation
cm SimpleName VariableDeclarationFragment ClassInstanceCreation StringLiteral empty
cm SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName set value
cm SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation StringLiteral empty
conditional mutation SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName cm
cm SimpleName MethodInvocation SimpleName put
cm SimpleName MethodInvocation StringLiteral name
cm SimpleName MethodInvocation StringLiteral last
cm SimpleName MethodInvocation SimpleName cva
cm SimpleName MethodInvocation StringLiteral doe
put SimpleName MethodInvocation StringLiteral name
put SimpleName MethodInvocation StringLiteral last
put SimpleName MethodInvocation SimpleName cva
put SimpleName MethodInvocation StringLiteral doe
name StringLiteral MethodInvocation StringLiteral last
name StringLiteral MethodInvocation SimpleName cva
name StringLiteral MethodInvocation StringLiteral doe
last StringLiteral MethodInvocation SimpleName cva
last StringLiteral MethodInvocation StringLiteral doe
cva SimpleName MethodInvocation StringLiteral doe
cm SimpleName MethodInvocation SimpleName put
cm SimpleName MethodInvocation StringLiteral name
cm SimpleName MethodInvocation StringLiteral first
cm SimpleName MethodInvocation SimpleName cva
cm SimpleName MethodInvocation StringLiteral john
put SimpleName MethodInvocation StringLiteral name
put SimpleName MethodInvocation StringLiteral first
put SimpleName MethodInvocation SimpleName cva
put SimpleName MethodInvocation StringLiteral john
name StringLiteral MethodInvocation StringLiteral first
name StringLiteral MethodInvocation SimpleName cva
name StringLiteral MethodInvocation StringLiteral john
first StringLiteral MethodInvocation SimpleName cva
first StringLiteral MethodInvocation StringLiteral john
cva SimpleName MethodInvocation StringLiteral john
cm SimpleName MethodInvocation SimpleName put
cm SimpleName MethodInvocation StringLiteral tx
cm SimpleName MethodInvocation StringLiteral seq
cm SimpleName MethodInvocation SimpleName cva
cm SimpleName MethodInvocation StringLiteral empty
put SimpleName MethodInvocation StringLiteral tx
put SimpleName MethodInvocation StringLiteral seq
put SimpleName MethodInvocation SimpleName cva
put SimpleName MethodInvocation StringLiteral empty
tx StringLiteral MethodInvocation StringLiteral seq
tx StringLiteral MethodInvocation SimpleName cva
tx StringLiteral MethodInvocation StringLiteral empty
seq StringLiteral MethodInvocation SimpleName cva
seq StringLiteral MethodInvocation StringLiteral empty
cva SimpleName MethodInvocation StringLiteral empty
cw SimpleName MethodInvocation SimpleName write
cw SimpleName MethodInvocation SimpleName cm
write SimpleName MethodInvocation SimpleName cm
cw SimpleName MethodInvocation MethodInvocation SimpleName get status
write SimpleName MethodInvocation MethodInvocation SimpleName get status
cm SimpleName MethodInvocation MethodInvocation SimpleName get status
assert SimpleName MethodInvocation SimpleName assert equals
assert SimpleName MethodInvocation QualifiedName statusrejected
assert SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName cw
assert SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName write
assert SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName cm
assert SimpleName MethodInvocation MethodInvocation SimpleName get status
assert equals SimpleName MethodInvocation QualifiedName statusrejected
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName cw
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName write
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName cm
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get status
statusrejected QualifiedName MethodInvocation MethodInvocation MethodInvocation SimpleName cw
statusrejected QualifiedName MethodInvocation MethodInvocation MethodInvocation SimpleName write
statusrejected QualifiedName MethodInvocation MethodInvocation MethodInvocation SimpleName cm
statusrejected QualifiedName MethodInvocation MethodInvocation SimpleName get status
condition SimpleName SimpleType ClassInstanceCreation StringLiteral tx
condition SimpleName SimpleType ClassInstanceCreation StringLiteral seq
tx StringLiteral ClassInstanceCreation StringLiteral seq
condition SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName set visibility
tx StringLiteral ClassInstanceCreation MethodInvocation SimpleName set visibility
seq StringLiteral ClassInstanceCreation MethodInvocation SimpleName set visibility
condition SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName cvb
tx StringLiteral ClassInstanceCreation MethodInvocation SimpleName cvb
seq StringLiteral ClassInstanceCreation MethodInvocation SimpleName cvb
set visibility SimpleName MethodInvocation SimpleName cvb
tx StringLiteral ClassInstanceCreation MethodInvocation MethodInvocation SimpleName set value
