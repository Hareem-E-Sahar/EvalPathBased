empty NumberLiteral InfixExpression NumberLiteral empty
timeout SimpleName MemberValuePair InfixExpression NumberLiteral empty
timeout SimpleName MemberValuePair InfixExpression NumberLiteral empty
test SimpleName NormalAnnotation MemberValuePair SimpleName timeout
test SimpleName NormalAnnotation MemberValuePair InfixExpression NumberLiteral empty
test SimpleName NormalAnnotation MemberValuePair InfixExpression NumberLiteral empty
input SimpleName MethodInvocation SimpleName set
input SimpleName MethodInvocation StringLiteral secretsecret
set SimpleName MethodInvocation StringLiteral secretsecret
exec SimpleName MethodInvocation StringLiteral createuser xyzzy
exec SimpleName MethodInvocation BooleanLiteral true
createuser xyzzy StringLiteral MethodInvocation BooleanLiteral true
exec SimpleName MethodInvocation StringLiteral users
exec SimpleName MethodInvocation BooleanLiteral true
exec SimpleName MethodInvocation StringLiteral xyzzy
exec SimpleName MethodInvocation BooleanLiteral true
users StringLiteral MethodInvocation BooleanLiteral true
users StringLiteral MethodInvocation StringLiteral xyzzy
users StringLiteral MethodInvocation BooleanLiteral true
true BooleanLiteral MethodInvocation StringLiteral xyzzy
true BooleanLiteral MethodInvocation BooleanLiteral true
xyzzy StringLiteral MethodInvocation BooleanLiteral true
exec SimpleName MethodInvocation StringLiteral userpermissions u xyzzy
exec SimpleName MethodInvocation BooleanLiteral true
userpermissions u xyzzy StringLiteral MethodInvocation BooleanLiteral true
perms SimpleName VariableDeclarationFragment MethodInvocation SimpleName exec
perms SimpleName VariableDeclarationFragment MethodInvocation StringLiteral userpermissions u xyzzy
perms SimpleName VariableDeclarationFragment MethodInvocation BooleanLiteral true
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName perms
table permissions ( StringLiteral InfixExpression QualifiedName metadata tablename
table permissions ( StringLiteral InfixExpression StringLiteral ): tableread
metadata tablename QualifiedName InfixExpression StringLiteral ): tableread
perms SimpleName MethodInvocation SimpleName contains
perms SimpleName MethodInvocation InfixExpression StringLiteral table permissions (
perms SimpleName MethodInvocation InfixExpression QualifiedName metadata tablename
perms SimpleName MethodInvocation InfixExpression StringLiteral ): tableread
contains SimpleName MethodInvocation InfixExpression StringLiteral table permissions (
contains SimpleName MethodInvocation InfixExpression QualifiedName metadata tablename
contains SimpleName MethodInvocation InfixExpression StringLiteral ): tableread
assert true SimpleName MethodInvocation MethodInvocation SimpleName perms
assert true SimpleName MethodInvocation MethodInvocation SimpleName contains
assert true SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral table permissions (
assert true SimpleName MethodInvocation MethodInvocation InfixExpression QualifiedName metadata tablename
assert true SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral ): tableread
exec SimpleName MethodInvocation StringLiteral grant u xyzzy s systemcreate table
exec SimpleName MethodInvocation BooleanLiteral true
grant u xyzzy s systemcreate table StringLiteral MethodInvocation BooleanLiteral true
exec SimpleName MethodInvocation StringLiteral userpermissions u xyzzy
exec SimpleName MethodInvocation BooleanLiteral true
userpermissions u xyzzy StringLiteral MethodInvocation BooleanLiteral true
perms SimpleName Assignment MethodInvocation SimpleName exec
perms SimpleName Assignment MethodInvocation StringLiteral userpermissions u xyzzy
perms SimpleName Assignment MethodInvocation BooleanLiteral true
perms SimpleName MethodInvocation SimpleName contains
perms SimpleName MethodInvocation StringLiteral empty
contains SimpleName MethodInvocation StringLiteral empty
assert true SimpleName MethodInvocation MethodInvocation SimpleName perms
assert true SimpleName MethodInvocation MethodInvocation SimpleName contains
assert true SimpleName MethodInvocation MethodInvocation StringLiteral empty
grant u root t StringLiteral InfixExpression QualifiedName metadata tablename
grant u root t StringLiteral InfixExpression StringLiteral tablewrite
metadata tablename QualifiedName InfixExpression StringLiteral tablewrite
exec SimpleName MethodInvocation InfixExpression StringLiteral grant u root t
exec SimpleName MethodInvocation InfixExpression QualifiedName metadata tablename
exec SimpleName MethodInvocation InfixExpression StringLiteral tablewrite
exec SimpleName MethodInvocation BooleanLiteral true
grant u root t StringLiteral InfixExpression MethodInvocation BooleanLiteral true
metadata tablename QualifiedName InfixExpression MethodInvocation BooleanLiteral true
tablewrite StringLiteral InfixExpression MethodInvocation BooleanLiteral true
grant u root t StringLiteral InfixExpression QualifiedName metadata tablename
grant u root t StringLiteral InfixExpression StringLiteral tablegoofy
metadata tablename QualifiedName InfixExpression StringLiteral tablegoofy
exec SimpleName MethodInvocation InfixExpression StringLiteral grant u root t
exec SimpleName MethodInvocation InfixExpression QualifiedName metadata tablename
exec SimpleName MethodInvocation InfixExpression StringLiteral tablegoofy
exec SimpleName MethodInvocation BooleanLiteral false
grant u root t StringLiteral InfixExpression MethodInvocation BooleanLiteral false
metadata tablename QualifiedName InfixExpression MethodInvocation BooleanLiteral false
tablegoofy StringLiteral InfixExpression MethodInvocation BooleanLiteral false
exec SimpleName MethodInvocation StringLiteral grant u root s foo
exec SimpleName MethodInvocation BooleanLiteral false
grant u root s foo StringLiteral MethodInvocation BooleanLiteral false
grant u xyzzy t StringLiteral InfixExpression QualifiedName metadata tablename
grant u xyzzy t StringLiteral InfixExpression StringLiteral foo
metadata tablename QualifiedName InfixExpression StringLiteral foo
exec SimpleName MethodInvocation InfixExpression StringLiteral grant u xyzzy t
exec SimpleName MethodInvocation InfixExpression QualifiedName metadata tablename
exec SimpleName MethodInvocation InfixExpression StringLiteral foo
exec SimpleName MethodInvocation BooleanLiteral false
grant u xyzzy t StringLiteral InfixExpression MethodInvocation BooleanLiteral false
metadata tablename QualifiedName InfixExpression MethodInvocation BooleanLiteral false
foo StringLiteral InfixExpression MethodInvocation BooleanLiteral false
input SimpleName MethodInvocation SimpleName set
input SimpleName MethodInvocation StringLiteral secretsecret
set SimpleName MethodInvocation StringLiteral secretsecret
exec SimpleName MethodInvocation StringLiteral user xyzzy
exec SimpleName MethodInvocation BooleanLiteral true
user xyzzy StringLiteral MethodInvocation BooleanLiteral true
exec SimpleName MethodInvocation StringLiteral createtable t
exec SimpleName MethodInvocation BooleanLiteral true
exec SimpleName MethodInvocation StringLiteral xyzzy
exec SimpleName MethodInvocation BooleanLiteral true
createtable t StringLiteral MethodInvocation BooleanLiteral true
createtable t StringLiteral MethodInvocation StringLiteral xyzzy
createtable t StringLiteral MethodInvocation BooleanLiteral true
true BooleanLiteral MethodInvocation StringLiteral xyzzy
true BooleanLiteral MethodInvocation BooleanLiteral true
xyzzy StringLiteral MethodInvocation BooleanLiteral true
exec SimpleName MethodInvocation StringLiteral insert row cf cq
exec SimpleName MethodInvocation BooleanLiteral true
insert row cf cq StringLiteral MethodInvocation BooleanLiteral true
exec SimpleName MethodInvocation StringLiteral scan
exec SimpleName MethodInvocation BooleanLiteral true
exec SimpleName MethodInvocation StringLiteral row
exec SimpleName MethodInvocation BooleanLiteral true
scan StringLiteral MethodInvocation BooleanLiteral true
scan StringLiteral MethodInvocation StringLiteral row
scan StringLiteral MethodInvocation BooleanLiteral true
true BooleanLiteral MethodInvocation StringLiteral row
true BooleanLiteral MethodInvocation BooleanLiteral true
row StringLiteral MethodInvocation BooleanLiteral true
exec SimpleName MethodInvocation StringLiteral droptable f t
exec SimpleName MethodInvocation BooleanLiteral true
droptable f t StringLiteral MethodInvocation BooleanLiteral true
exec SimpleName MethodInvocation StringLiteral deleteuser xyzzy
exec SimpleName MethodInvocation BooleanLiteral false
exec SimpleName MethodInvocation StringLiteral delete yourself
exec SimpleName MethodInvocation BooleanLiteral true
deleteuser xyzzy StringLiteral MethodInvocation BooleanLiteral false
deleteuser xyzzy StringLiteral MethodInvocation StringLiteral delete yourself
deleteuser xyzzy StringLiteral MethodInvocation BooleanLiteral true
false BooleanLiteral MethodInvocation StringLiteral delete yourself
false BooleanLiteral MethodInvocation BooleanLiteral true
delete yourself StringLiteral MethodInvocation BooleanLiteral true
root password SimpleName InfixExpression StringLiteral empty
root password SimpleName InfixExpression SimpleName root password
root password SimpleName InfixExpression StringLiteral empty
empty StringLiteral InfixExpression SimpleName root password
empty StringLiteral InfixExpression StringLiteral empty
root password SimpleName InfixExpression StringLiteral empty
input SimpleName MethodInvocation SimpleName set
input SimpleName MethodInvocation InfixExpression SimpleName root password
input SimpleName MethodInvocation InfixExpression StringLiteral empty
input SimpleName MethodInvocation InfixExpression SimpleName root password
input SimpleName MethodInvocation InfixExpression StringLiteral empty
set SimpleName MethodInvocation InfixExpression SimpleName root password
set SimpleName MethodInvocation InfixExpression StringLiteral empty
set SimpleName MethodInvocation InfixExpression SimpleName root password
set SimpleName MethodInvocation InfixExpression StringLiteral empty
exec SimpleName MethodInvocation StringLiteral user root
exec SimpleName MethodInvocation BooleanLiteral true
user root StringLiteral MethodInvocation BooleanLiteral true
exec SimpleName MethodInvocation StringLiteral revoke u xyzzy s systemcreate table
exec SimpleName MethodInvocation BooleanLiteral true
revoke u xyzzy s systemcreate table StringLiteral MethodInvocation BooleanLiteral true
exec SimpleName MethodInvocation StringLiteral revoke u xyzzy s systemgoofy
exec SimpleName MethodInvocation BooleanLiteral false
revoke u xyzzy s systemgoofy StringLiteral MethodInvocation BooleanLiteral false
exec SimpleName MethodInvocation StringLiteral revoke u xyzzy s foo
exec SimpleName MethodInvocation BooleanLiteral false
revoke u xyzzy s foo StringLiteral MethodInvocation BooleanLiteral false
revoke u xyzzy t StringLiteral InfixExpression QualifiedName metadata tablename
revoke u xyzzy t StringLiteral InfixExpression StringLiteral tablewrite
metadata tablename QualifiedName InfixExpression StringLiteral tablewrite
exec SimpleName MethodInvocation InfixExpression StringLiteral revoke u xyzzy t
exec SimpleName MethodInvocation InfixExpression QualifiedName metadata tablename
exec SimpleName MethodInvocation InfixExpression StringLiteral tablewrite
exec SimpleName MethodInvocation BooleanLiteral true
revoke u xyzzy t StringLiteral InfixExpression MethodInvocation BooleanLiteral true
metadata tablename QualifiedName InfixExpression MethodInvocation BooleanLiteral true
tablewrite StringLiteral InfixExpression MethodInvocation BooleanLiteral true
revoke u xyzzy t StringLiteral InfixExpression QualifiedName metadata tablename
revoke u xyzzy t StringLiteral InfixExpression StringLiteral tablegoofy
metadata tablename QualifiedName InfixExpression StringLiteral tablegoofy
exec SimpleName MethodInvocation InfixExpression StringLiteral revoke u xyzzy t
exec SimpleName MethodInvocation InfixExpression QualifiedName metadata tablename
exec SimpleName MethodInvocation InfixExpression StringLiteral tablegoofy
exec SimpleName MethodInvocation BooleanLiteral false
revoke u xyzzy t StringLiteral InfixExpression MethodInvocation BooleanLiteral false
metadata tablename QualifiedName InfixExpression MethodInvocation BooleanLiteral false
tablegoofy StringLiteral InfixExpression MethodInvocation BooleanLiteral false
revoke u xyzzy t StringLiteral InfixExpression QualifiedName metadata tablename
revoke u xyzzy t StringLiteral InfixExpression StringLiteral foo
metadata tablename QualifiedName InfixExpression StringLiteral foo
exec SimpleName MethodInvocation InfixExpression StringLiteral revoke u xyzzy t
exec SimpleName MethodInvocation InfixExpression QualifiedName metadata tablename
exec SimpleName MethodInvocation InfixExpression StringLiteral foo
exec SimpleName MethodInvocation BooleanLiteral false
revoke u xyzzy t StringLiteral InfixExpression MethodInvocation BooleanLiteral false
metadata tablename QualifiedName InfixExpression MethodInvocation BooleanLiteral false
foo StringLiteral InfixExpression MethodInvocation BooleanLiteral false
exec SimpleName MethodInvocation StringLiteral deleteuser xyzzy
exec SimpleName MethodInvocation BooleanLiteral true
deleteuser xyzzy StringLiteral MethodInvocation BooleanLiteral true
exec SimpleName MethodInvocation StringLiteral users
exec SimpleName MethodInvocation BooleanLiteral true
exec SimpleName MethodInvocation StringLiteral xyzzy
exec SimpleName MethodInvocation BooleanLiteral false
users StringLiteral MethodInvocation BooleanLiteral true
users StringLiteral MethodInvocation StringLiteral xyzzy
users StringLiteral MethodInvocation BooleanLiteral false
true BooleanLiteral MethodInvocation StringLiteral xyzzy
true BooleanLiteral MethodInvocation BooleanLiteral false
xyzzy StringLiteral MethodInvocation BooleanLiteral false
test SimpleName NormalAnnotation MethodDeclaration Modifier public
timeout SimpleName MemberValuePair NormalAnnotation MethodDeclaration Modifier public
test SimpleName NormalAnnotation MethodDeclaration PrimitiveType void
timeout SimpleName MemberValuePair NormalAnnotation MethodDeclaration PrimitiveType void
test SimpleName NormalAnnotation MethodDeclaration SimpleName user
timeout SimpleName MemberValuePair NormalAnnotation MethodDeclaration SimpleName user
test SimpleName NormalAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName user
public Modifier MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration SimpleName user
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
user SimpleName MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration NormalAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName user
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration NormalAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName user
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception