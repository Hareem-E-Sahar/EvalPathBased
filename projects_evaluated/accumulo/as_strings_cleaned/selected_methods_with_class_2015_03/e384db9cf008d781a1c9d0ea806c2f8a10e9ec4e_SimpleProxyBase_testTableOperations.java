get unique names SimpleName MethodInvocation NumberLiteral empty
names SimpleName VariableDeclarationFragment MethodInvocation SimpleName get unique names
names SimpleName VariableDeclarationFragment MethodInvocation NumberLiteral empty
names SimpleName ArrayAccess NumberLiteral empty
table test SimpleName VariableDeclarationFragment ArrayAccess SimpleName names
table test SimpleName VariableDeclarationFragment ArrayAccess NumberLiteral empty
final Modifier VariableDeclarationStatement SimpleType SimpleName string
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName table test
final Modifier VariableDeclarationStatement VariableDeclarationFragment ArrayAccess SimpleName names
final Modifier VariableDeclarationStatement VariableDeclarationFragment ArrayAccess NumberLiteral empty
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table test
names SimpleName ArrayAccess NumberLiteral empty
table test SimpleName VariableDeclarationFragment ArrayAccess SimpleName names
table test SimpleName VariableDeclarationFragment ArrayAccess NumberLiteral empty
final Modifier VariableDeclarationStatement SimpleType SimpleName string
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName table test
final Modifier VariableDeclarationStatement VariableDeclarationFragment ArrayAccess SimpleName names
final Modifier VariableDeclarationStatement VariableDeclarationFragment ArrayAccess NumberLiteral empty
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table test
client SimpleName MethodInvocation SimpleName create table
client SimpleName MethodInvocation SimpleName creds
client SimpleName MethodInvocation SimpleName table test
client SimpleName MethodInvocation BooleanLiteral true
client SimpleName MethodInvocation QualifiedName time typemillis
create table SimpleName MethodInvocation SimpleName creds
create table SimpleName MethodInvocation SimpleName table test
create table SimpleName MethodInvocation BooleanLiteral true
create table SimpleName MethodInvocation QualifiedName time typemillis
creds SimpleName MethodInvocation SimpleName table test
creds SimpleName MethodInvocation BooleanLiteral true
creds SimpleName MethodInvocation QualifiedName time typemillis
table test SimpleName MethodInvocation BooleanLiteral true
table test SimpleName MethodInvocation QualifiedName time typemillis
true BooleanLiteral MethodInvocation QualifiedName time typemillis
numeric value constraint SimpleName SimpleType TypeLiteral MethodInvocation SimpleName get name
client SimpleName MethodInvocation SimpleName add constraint
client SimpleName MethodInvocation SimpleName creds
client SimpleName MethodInvocation SimpleName table test
client SimpleName MethodInvocation MethodInvocation SimpleName get name
add constraint SimpleName MethodInvocation SimpleName creds
add constraint SimpleName MethodInvocation SimpleName table test
add constraint SimpleName MethodInvocation MethodInvocation SimpleName get name
creds SimpleName MethodInvocation SimpleName table test
creds SimpleName MethodInvocation MethodInvocation SimpleName get name
table test SimpleName MethodInvocation MethodInvocation SimpleName get name
client SimpleName MethodInvocation SimpleName list constraints
client SimpleName MethodInvocation SimpleName creds
client SimpleName MethodInvocation SimpleName table test
list constraints SimpleName MethodInvocation SimpleName creds
list constraints SimpleName MethodInvocation SimpleName table test
creds SimpleName MethodInvocation SimpleName table test
client SimpleName MethodInvocation MethodInvocation SimpleName size
list constraints SimpleName MethodInvocation MethodInvocation SimpleName size
creds SimpleName MethodInvocation MethodInvocation SimpleName size
table test SimpleName MethodInvocation MethodInvocation SimpleName size
assert equals SimpleName MethodInvocation NumberLiteral empty
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName client
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName list constraints
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName creds
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName table test
assert equals SimpleName MethodInvocation MethodInvocation SimpleName size
empty NumberLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName client
empty NumberLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName list constraints
empty NumberLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName creds
empty NumberLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName table test
empty NumberLiteral MethodInvocation MethodInvocation SimpleName size
empty NumberLiteral InfixExpression NumberLiteral empty
util wait thread SimpleName MethodInvocation SimpleName sleep
util wait thread SimpleName MethodInvocation InfixExpression NumberLiteral empty
util wait thread SimpleName MethodInvocation InfixExpression NumberLiteral empty
sleep SimpleName MethodInvocation InfixExpression NumberLiteral empty
sleep SimpleName MethodInvocation InfixExpression NumberLiteral empty
mutation SimpleName MethodInvocation StringLiteral row
mutation SimpleName MethodInvocation StringLiteral cf
mutation SimpleName MethodInvocation StringLiteral cq
mutation SimpleName MethodInvocation StringLiteral empty
row StringLiteral MethodInvocation StringLiteral cf
row StringLiteral MethodInvocation StringLiteral cq
row StringLiteral MethodInvocation StringLiteral empty
cf StringLiteral MethodInvocation StringLiteral cq
cf StringLiteral MethodInvocation StringLiteral empty
cq StringLiteral MethodInvocation StringLiteral empty
client SimpleName MethodInvocation SimpleName update and flush
client SimpleName MethodInvocation SimpleName creds
client SimpleName MethodInvocation SimpleName table test
client SimpleName MethodInvocation MethodInvocation SimpleName mutation
client SimpleName MethodInvocation MethodInvocation StringLiteral row
client SimpleName MethodInvocation MethodInvocation StringLiteral cf
client SimpleName MethodInvocation MethodInvocation StringLiteral cq
client SimpleName MethodInvocation MethodInvocation StringLiteral empty
update and flush SimpleName MethodInvocation SimpleName creds
update and flush SimpleName MethodInvocation SimpleName table test
update and flush SimpleName MethodInvocation MethodInvocation SimpleName mutation
update and flush SimpleName MethodInvocation MethodInvocation StringLiteral row
update and flush SimpleName MethodInvocation MethodInvocation StringLiteral cf
update and flush SimpleName MethodInvocation MethodInvocation StringLiteral cq
update and flush SimpleName MethodInvocation MethodInvocation StringLiteral empty
creds SimpleName MethodInvocation SimpleName table test
creds SimpleName MethodInvocation MethodInvocation SimpleName mutation
creds SimpleName MethodInvocation MethodInvocation StringLiteral row
creds SimpleName MethodInvocation MethodInvocation StringLiteral cf
creds SimpleName MethodInvocation MethodInvocation StringLiteral cq
creds SimpleName MethodInvocation MethodInvocation StringLiteral empty
table test SimpleName MethodInvocation MethodInvocation SimpleName mutation
table test SimpleName MethodInvocation MethodInvocation StringLiteral row
table test SimpleName MethodInvocation MethodInvocation StringLiteral cf
table test SimpleName MethodInvocation MethodInvocation StringLiteral cq
table test SimpleName MethodInvocation MethodInvocation StringLiteral empty
mutation SimpleName MethodInvocation StringLiteral row
mutation SimpleName MethodInvocation StringLiteral cf
mutation SimpleName MethodInvocation StringLiteral cq
mutation SimpleName MethodInvocation StringLiteral x
row StringLiteral MethodInvocation StringLiteral cf
row StringLiteral MethodInvocation StringLiteral cq
row StringLiteral MethodInvocation StringLiteral x
cf StringLiteral MethodInvocation StringLiteral cq
cf StringLiteral MethodInvocation StringLiteral x
cq StringLiteral MethodInvocation StringLiteral x
client SimpleName MethodInvocation SimpleName update and flush
client SimpleName MethodInvocation SimpleName creds
client SimpleName MethodInvocation SimpleName table test
client SimpleName MethodInvocation MethodInvocation SimpleName mutation
client SimpleName MethodInvocation MethodInvocation StringLiteral row
client SimpleName MethodInvocation MethodInvocation StringLiteral cf
client SimpleName MethodInvocation MethodInvocation StringLiteral cq
client SimpleName MethodInvocation MethodInvocation StringLiteral x
update and flush SimpleName MethodInvocation SimpleName creds
update and flush SimpleName MethodInvocation SimpleName table test
update and flush SimpleName MethodInvocation MethodInvocation SimpleName mutation
update and flush SimpleName MethodInvocation MethodInvocation StringLiteral row
update and flush SimpleName MethodInvocation MethodInvocation StringLiteral cf
update and flush SimpleName MethodInvocation MethodInvocation StringLiteral cq
update and flush SimpleName MethodInvocation MethodInvocation StringLiteral x
creds SimpleName MethodInvocation SimpleName table test
creds SimpleName MethodInvocation MethodInvocation SimpleName mutation
creds SimpleName MethodInvocation MethodInvocation StringLiteral row
creds SimpleName MethodInvocation MethodInvocation StringLiteral cf
creds SimpleName MethodInvocation MethodInvocation StringLiteral cq
creds SimpleName MethodInvocation MethodInvocation StringLiteral x
table test SimpleName MethodInvocation MethodInvocation SimpleName mutation
table test SimpleName MethodInvocation MethodInvocation StringLiteral row
table test SimpleName MethodInvocation MethodInvocation StringLiteral cf
table test SimpleName MethodInvocation MethodInvocation StringLiteral cq
table test SimpleName MethodInvocation MethodInvocation StringLiteral x
fail SimpleName MethodInvocation StringLiteral constraint did not fire
mutations rejected exception SimpleName SimpleType SingleVariableDeclaration SimpleName ex
client SimpleName MethodInvocation SimpleName remove constraint
client SimpleName MethodInvocation SimpleName creds
client SimpleName MethodInvocation SimpleName table test
client SimpleName MethodInvocation NumberLiteral empty
remove constraint SimpleName MethodInvocation SimpleName creds
remove constraint SimpleName MethodInvocation SimpleName table test
remove constraint SimpleName MethodInvocation NumberLiteral empty
creds SimpleName MethodInvocation SimpleName table test
creds SimpleName MethodInvocation NumberLiteral empty
table test SimpleName MethodInvocation NumberLiteral empty
util wait thread SimpleName MethodInvocation SimpleName sleep
util wait thread SimpleName MethodInvocation NumberLiteral empty
sleep SimpleName MethodInvocation NumberLiteral empty
client SimpleName MethodInvocation SimpleName list constraints
client SimpleName MethodInvocation SimpleName creds
client SimpleName MethodInvocation SimpleName table test
list constraints SimpleName MethodInvocation SimpleName creds
list constraints SimpleName MethodInvocation SimpleName table test
creds SimpleName MethodInvocation SimpleName table test
client SimpleName MethodInvocation MethodInvocation SimpleName size
list constraints SimpleName MethodInvocation MethodInvocation SimpleName size
creds SimpleName MethodInvocation MethodInvocation SimpleName size
table test SimpleName MethodInvocation MethodInvocation SimpleName size
assert equals SimpleName MethodInvocation NumberLiteral empty
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName client
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName list constraints
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName creds
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName table test
assert equals SimpleName MethodInvocation MethodInvocation SimpleName size
empty NumberLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName client
empty NumberLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName list constraints
empty NumberLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName creds
empty NumberLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName table test
empty NumberLiteral MethodInvocation MethodInvocation SimpleName size
mutation SimpleName MethodInvocation StringLiteral row
mutation SimpleName MethodInvocation StringLiteral cf
mutation SimpleName MethodInvocation StringLiteral cq
mutation SimpleName MethodInvocation StringLiteral x
row StringLiteral MethodInvocation StringLiteral cf
row StringLiteral MethodInvocation StringLiteral cq
row StringLiteral MethodInvocation StringLiteral x
cf StringLiteral MethodInvocation StringLiteral cq
cf StringLiteral MethodInvocation StringLiteral x
cq StringLiteral MethodInvocation StringLiteral x
client SimpleName MethodInvocation SimpleName update and flush
client SimpleName MethodInvocation SimpleName creds
client SimpleName MethodInvocation SimpleName table test
client SimpleName MethodInvocation MethodInvocation SimpleName mutation
client SimpleName MethodInvocation MethodInvocation StringLiteral row
client SimpleName MethodInvocation MethodInvocation StringLiteral cf
client SimpleName MethodInvocation MethodInvocation StringLiteral cq
client SimpleName MethodInvocation MethodInvocation StringLiteral x
update and flush SimpleName MethodInvocation SimpleName creds
update and flush SimpleName MethodInvocation SimpleName table test
update and flush SimpleName MethodInvocation MethodInvocation SimpleName mutation
update and flush SimpleName MethodInvocation MethodInvocation StringLiteral row
update and flush SimpleName MethodInvocation MethodInvocation StringLiteral cf
update and flush SimpleName MethodInvocation MethodInvocation StringLiteral cq
update and flush SimpleName MethodInvocation MethodInvocation StringLiteral x
creds SimpleName MethodInvocation SimpleName table test
creds SimpleName MethodInvocation MethodInvocation SimpleName mutation
creds SimpleName MethodInvocation MethodInvocation StringLiteral row
creds SimpleName MethodInvocation MethodInvocation StringLiteral cf
creds SimpleName MethodInvocation MethodInvocation StringLiteral cq
creds SimpleName MethodInvocation MethodInvocation StringLiteral x
table test SimpleName MethodInvocation MethodInvocation SimpleName mutation
table test SimpleName MethodInvocation MethodInvocation StringLiteral row
table test SimpleName MethodInvocation MethodInvocation StringLiteral cf
table test SimpleName MethodInvocation MethodInvocation StringLiteral cq
table test SimpleName MethodInvocation MethodInvocation StringLiteral x
row StringLiteral ArrayInitializer StringLiteral cf
row StringLiteral ArrayInitializer StringLiteral cq
row StringLiteral ArrayInitializer StringLiteral x
cf StringLiteral ArrayInitializer StringLiteral cq
cf StringLiteral ArrayInitializer StringLiteral x
cq StringLiteral ArrayInitializer StringLiteral x
assert scan SimpleName MethodInvocation SimpleName table test
hash set SimpleName SimpleType ParameterizedType SimpleType SimpleName byte buffer
s bb SimpleName MethodInvocation StringLiteral a
s bb SimpleName MethodInvocation StringLiteral m
s bb SimpleName MethodInvocation StringLiteral z
arrays SimpleName MethodInvocation SimpleName as list
arrays SimpleName MethodInvocation MethodInvocation SimpleName s bb
arrays SimpleName MethodInvocation MethodInvocation StringLiteral a
arrays SimpleName MethodInvocation MethodInvocation SimpleName s bb
arrays SimpleName MethodInvocation MethodInvocation StringLiteral m
arrays SimpleName MethodInvocation MethodInvocation SimpleName s bb
arrays SimpleName MethodInvocation MethodInvocation StringLiteral z
as list SimpleName MethodInvocation MethodInvocation SimpleName s bb
as list SimpleName MethodInvocation MethodInvocation StringLiteral a
as list SimpleName MethodInvocation MethodInvocation SimpleName s bb
as list SimpleName MethodInvocation MethodInvocation StringLiteral m
as list SimpleName MethodInvocation MethodInvocation SimpleName s bb
as list SimpleName MethodInvocation MethodInvocation StringLiteral z
s bb SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName s bb
s bb SimpleName MethodInvocation MethodInvocation MethodInvocation StringLiteral m
a StringLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName s bb
a StringLiteral MethodInvocation MethodInvocation MethodInvocation StringLiteral m
s bb SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName s bb
s bb SimpleName MethodInvocation MethodInvocation MethodInvocation StringLiteral z
a StringLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName s bb
a StringLiteral MethodInvocation MethodInvocation MethodInvocation StringLiteral z
s bb SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName s bb
s bb SimpleName MethodInvocation MethodInvocation MethodInvocation StringLiteral z
m StringLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName s bb
m StringLiteral MethodInvocation MethodInvocation MethodInvocation StringLiteral z
client SimpleName MethodInvocation SimpleName add splits
client SimpleName MethodInvocation SimpleName creds
client SimpleName MethodInvocation SimpleName table test
client SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName arrays
client SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName as list
add splits SimpleName MethodInvocation SimpleName creds
add splits SimpleName MethodInvocation SimpleName table test
add splits SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName arrays
add splits SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName as list
creds SimpleName MethodInvocation SimpleName table test
creds SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName arrays
creds SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName as list
table test SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName arrays
table test SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName as list
list SimpleName SimpleType ParameterizedType SimpleType SimpleName byte buffer
client SimpleName MethodInvocation SimpleName list splits
client SimpleName MethodInvocation SimpleName creds
client SimpleName MethodInvocation SimpleName table test
client SimpleName MethodInvocation NumberLiteral empty
list splits SimpleName MethodInvocation SimpleName creds
list splits SimpleName MethodInvocation SimpleName table test
list splits SimpleName MethodInvocation NumberLiteral empty
creds SimpleName MethodInvocation SimpleName table test
creds SimpleName MethodInvocation NumberLiteral empty
table test SimpleName MethodInvocation NumberLiteral empty
splits SimpleName VariableDeclarationFragment MethodInvocation SimpleName client
splits SimpleName VariableDeclarationFragment MethodInvocation SimpleName list splits
splits SimpleName VariableDeclarationFragment MethodInvocation SimpleName creds
splits SimpleName VariableDeclarationFragment MethodInvocation SimpleName table test
splits SimpleName VariableDeclarationFragment MethodInvocation NumberLiteral empty
s bb SimpleName MethodInvocation StringLiteral m
arrays SimpleName MethodInvocation SimpleName as list
arrays SimpleName MethodInvocation MethodInvocation SimpleName s bb
arrays SimpleName MethodInvocation MethodInvocation StringLiteral m
as list SimpleName MethodInvocation MethodInvocation SimpleName s bb
as list SimpleName MethodInvocation MethodInvocation StringLiteral m
assert equals SimpleName MethodInvocation MethodInvocation SimpleName arrays
assert equals SimpleName MethodInvocation MethodInvocation SimpleName as list
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName s bb
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation StringLiteral m
assert equals SimpleName MethodInvocation SimpleName splits
arrays SimpleName MethodInvocation MethodInvocation SimpleName splits
as list SimpleName MethodInvocation MethodInvocation SimpleName splits
s bb SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName splits
m StringLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName splits
s bb SimpleName MethodInvocation StringLiteral m
client SimpleName MethodInvocation SimpleName merge tablets
client SimpleName MethodInvocation SimpleName creds
client SimpleName MethodInvocation SimpleName table test
client SimpleName MethodInvocation MethodInvocation SimpleName s bb
client SimpleName MethodInvocation MethodInvocation StringLiteral m
merge tablets SimpleName MethodInvocation SimpleName creds
merge tablets SimpleName MethodInvocation SimpleName table test
merge tablets SimpleName MethodInvocation MethodInvocation SimpleName s bb
merge tablets SimpleName MethodInvocation MethodInvocation StringLiteral m
creds SimpleName MethodInvocation SimpleName table test
creds SimpleName MethodInvocation MethodInvocation SimpleName s bb
creds SimpleName MethodInvocation MethodInvocation StringLiteral m
table test SimpleName MethodInvocation MethodInvocation SimpleName s bb
table test SimpleName MethodInvocation MethodInvocation StringLiteral m
client SimpleName MethodInvocation SimpleName list splits
client SimpleName MethodInvocation SimpleName creds
client SimpleName MethodInvocation SimpleName table test
client SimpleName MethodInvocation NumberLiteral empty
list splits SimpleName MethodInvocation SimpleName creds
list splits SimpleName MethodInvocation SimpleName table test
list splits SimpleName MethodInvocation NumberLiteral empty
creds SimpleName MethodInvocation SimpleName table test
creds SimpleName MethodInvocation NumberLiteral empty
table test SimpleName MethodInvocation NumberLiteral empty
splits SimpleName Assignment MethodInvocation SimpleName client
splits SimpleName Assignment MethodInvocation SimpleName list splits
splits SimpleName Assignment MethodInvocation SimpleName creds
splits SimpleName Assignment MethodInvocation SimpleName table test
splits SimpleName Assignment MethodInvocation NumberLiteral empty
s bb SimpleName MethodInvocation StringLiteral m
s bb SimpleName MethodInvocation StringLiteral z
arrays SimpleName MethodInvocation SimpleName as list
arrays SimpleName MethodInvocation MethodInvocation SimpleName s bb
arrays SimpleName MethodInvocation MethodInvocation StringLiteral m
arrays SimpleName MethodInvocation MethodInvocation SimpleName s bb
arrays SimpleName MethodInvocation MethodInvocation StringLiteral z
as list SimpleName MethodInvocation MethodInvocation SimpleName s bb
as list SimpleName MethodInvocation MethodInvocation StringLiteral m
as list SimpleName MethodInvocation MethodInvocation SimpleName s bb
as list SimpleName MethodInvocation MethodInvocation StringLiteral z
s bb SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName s bb
s bb SimpleName MethodInvocation MethodInvocation MethodInvocation StringLiteral z
m StringLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName s bb
m StringLiteral MethodInvocation MethodInvocation MethodInvocation StringLiteral z
assert equals SimpleName MethodInvocation MethodInvocation SimpleName arrays
assert equals SimpleName MethodInvocation MethodInvocation SimpleName as list
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName s bb
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation StringLiteral m
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName s bb
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation StringLiteral z
assert equals SimpleName MethodInvocation SimpleName splits
arrays SimpleName MethodInvocation MethodInvocation SimpleName splits
as list SimpleName MethodInvocation MethodInvocation SimpleName splits
s bb SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName splits
m StringLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName splits
s bb SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName splits
z StringLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName splits
client SimpleName MethodInvocation SimpleName merge tablets
client SimpleName MethodInvocation SimpleName creds
client SimpleName MethodInvocation SimpleName table test
merge tablets SimpleName MethodInvocation SimpleName creds
merge tablets SimpleName MethodInvocation SimpleName table test
creds SimpleName MethodInvocation SimpleName table test
client SimpleName MethodInvocation SimpleName list splits
client SimpleName MethodInvocation SimpleName creds
client SimpleName MethodInvocation SimpleName table test
client SimpleName MethodInvocation NumberLiteral empty
list splits SimpleName MethodInvocation SimpleName creds
list splits SimpleName MethodInvocation SimpleName table test
list splits SimpleName MethodInvocation NumberLiteral empty
creds SimpleName MethodInvocation SimpleName table test
creds SimpleName MethodInvocation NumberLiteral empty
table test SimpleName MethodInvocation NumberLiteral empty
splits SimpleName Assignment MethodInvocation SimpleName client
splits SimpleName Assignment MethodInvocation SimpleName list splits
splits SimpleName Assignment MethodInvocation SimpleName creds
splits SimpleName Assignment MethodInvocation SimpleName table test
splits SimpleName Assignment MethodInvocation NumberLiteral empty
list SimpleName SimpleType ParameterizedType SimpleType SimpleName byte buffer
collections SimpleName MethodInvocation SimpleName empty list
empty SimpleName VariableDeclarationFragment MethodInvocation SimpleName collections
empty SimpleName VariableDeclarationFragment MethodInvocation SimpleName empty list
assert equals SimpleName MethodInvocation SimpleName empty
assert equals SimpleName MethodInvocation SimpleName splits
empty SimpleName MethodInvocation SimpleName splits
client SimpleName MethodInvocation SimpleName delete table
client SimpleName MethodInvocation SimpleName creds
client SimpleName MethodInvocation SimpleName table test
delete table SimpleName MethodInvocation SimpleName creds
delete table SimpleName MethodInvocation SimpleName table test
creds SimpleName MethodInvocation SimpleName table test
client SimpleName MethodInvocation SimpleName create table
client SimpleName MethodInvocation SimpleName creds
client SimpleName MethodInvocation SimpleName table test
client SimpleName MethodInvocation BooleanLiteral true
client SimpleName MethodInvocation QualifiedName time typemillis
create table SimpleName MethodInvocation SimpleName creds
create table SimpleName MethodInvocation SimpleName table test
create table SimpleName MethodInvocation BooleanLiteral true
create table SimpleName MethodInvocation QualifiedName time typemillis
creds SimpleName MethodInvocation SimpleName table test
creds SimpleName MethodInvocation BooleanLiteral true
creds SimpleName MethodInvocation QualifiedName time typemillis
table test SimpleName MethodInvocation BooleanLiteral true
table test SimpleName MethodInvocation QualifiedName time typemillis
true BooleanLiteral MethodInvocation QualifiedName time typemillis
hash map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
hash map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
string SimpleName SimpleType ParameterizedType SimpleType SimpleName string
hash map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
hash map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
string SimpleName SimpleType ParameterizedType SimpleType SimpleName string
options SimpleName MethodInvocation SimpleName put
options SimpleName MethodInvocation StringLiteral type
options SimpleName MethodInvocation StringLiteral string
put SimpleName MethodInvocation StringLiteral type
put SimpleName MethodInvocation StringLiteral string
type StringLiteral MethodInvocation StringLiteral string
options SimpleName MethodInvocation SimpleName put
options SimpleName MethodInvocation StringLiteral columns
options SimpleName MethodInvocation StringLiteral cf
put SimpleName MethodInvocation StringLiteral columns
put SimpleName MethodInvocation StringLiteral cf
columns StringLiteral MethodInvocation StringLiteral cf
summing combiner SimpleName SimpleType TypeLiteral MethodInvocation SimpleName get name
iterator setting SimpleName SimpleType ClassInstanceCreation NumberLiteral empty
iterator setting SimpleName SimpleType ClassInstanceCreation SimpleName table test
iterator setting SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get name
iterator setting SimpleName SimpleType ClassInstanceCreation SimpleName options
empty NumberLiteral ClassInstanceCreation SimpleName table test
empty NumberLiteral ClassInstanceCreation MethodInvocation SimpleName get name
empty NumberLiteral ClassInstanceCreation SimpleName options
table test SimpleName ClassInstanceCreation MethodInvocation SimpleName get name
table test SimpleName ClassInstanceCreation SimpleName options
get name SimpleName MethodInvocation ClassInstanceCreation SimpleName options
setting SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName iterator setting
setting SimpleName VariableDeclarationFragment ClassInstanceCreation NumberLiteral empty
setting SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName table test
setting SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName get name
setting SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName options
iterator setting SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName setting
enum set SimpleName MethodInvocation SimpleName all of
enum set SimpleName MethodInvocation TypeLiteral SimpleType SimpleName iterator scope
all of SimpleName MethodInvocation TypeLiteral SimpleType SimpleName iterator scope
client SimpleName MethodInvocation SimpleName attach iterator
client SimpleName MethodInvocation SimpleName creds
client SimpleName MethodInvocation SimpleName table test
client SimpleName MethodInvocation SimpleName setting
client SimpleName MethodInvocation MethodInvocation SimpleName enum set
client SimpleName MethodInvocation MethodInvocation SimpleName all of
attach iterator SimpleName MethodInvocation SimpleName creds
attach iterator SimpleName MethodInvocation SimpleName table test
attach iterator SimpleName MethodInvocation SimpleName setting
attach iterator SimpleName MethodInvocation MethodInvocation SimpleName enum set
attach iterator SimpleName MethodInvocation MethodInvocation SimpleName all of
creds SimpleName MethodInvocation SimpleName table test
creds SimpleName MethodInvocation SimpleName setting
creds SimpleName MethodInvocation MethodInvocation SimpleName enum set
creds SimpleName MethodInvocation MethodInvocation SimpleName all of
table test SimpleName MethodInvocation SimpleName setting
table test SimpleName MethodInvocation MethodInvocation SimpleName enum set
table test SimpleName MethodInvocation MethodInvocation SimpleName all of
setting SimpleName MethodInvocation MethodInvocation SimpleName enum set
setting SimpleName MethodInvocation MethodInvocation SimpleName all of
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression NumberLiteral empty
mutation SimpleName MethodInvocation StringLiteral row
mutation SimpleName MethodInvocation StringLiteral cf
mutation SimpleName MethodInvocation StringLiteral cq
mutation SimpleName MethodInvocation StringLiteral empty
row StringLiteral MethodInvocation StringLiteral cf
row StringLiteral MethodInvocation StringLiteral cq
row StringLiteral MethodInvocation StringLiteral empty
cf StringLiteral MethodInvocation StringLiteral cq
cf StringLiteral MethodInvocation StringLiteral empty
cq StringLiteral MethodInvocation StringLiteral empty
client SimpleName MethodInvocation SimpleName update and flush
client SimpleName MethodInvocation SimpleName creds
client SimpleName MethodInvocation SimpleName table test
client SimpleName MethodInvocation MethodInvocation SimpleName mutation
client SimpleName MethodInvocation MethodInvocation StringLiteral row
client SimpleName MethodInvocation MethodInvocation StringLiteral cf
client SimpleName MethodInvocation MethodInvocation StringLiteral cq
client SimpleName MethodInvocation MethodInvocation StringLiteral empty
update and flush SimpleName MethodInvocation SimpleName creds
update and flush SimpleName MethodInvocation SimpleName table test
update and flush SimpleName MethodInvocation MethodInvocation SimpleName mutation
update and flush SimpleName MethodInvocation MethodInvocation StringLiteral row
update and flush SimpleName MethodInvocation MethodInvocation StringLiteral cf
update and flush SimpleName MethodInvocation MethodInvocation StringLiteral cq
update and flush SimpleName MethodInvocation MethodInvocation StringLiteral empty
creds SimpleName MethodInvocation SimpleName table test
creds SimpleName MethodInvocation MethodInvocation SimpleName mutation
creds SimpleName MethodInvocation MethodInvocation StringLiteral row
creds SimpleName MethodInvocation MethodInvocation StringLiteral cf
creds SimpleName MethodInvocation MethodInvocation StringLiteral cq
creds SimpleName MethodInvocation MethodInvocation StringLiteral empty
table test SimpleName MethodInvocation MethodInvocation SimpleName mutation
table test SimpleName MethodInvocation MethodInvocation StringLiteral row
table test SimpleName MethodInvocation MethodInvocation StringLiteral cf