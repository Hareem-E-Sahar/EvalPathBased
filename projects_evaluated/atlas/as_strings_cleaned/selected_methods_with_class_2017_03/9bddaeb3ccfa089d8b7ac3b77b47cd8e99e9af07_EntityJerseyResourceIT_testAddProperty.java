depends on methods SimpleName MemberValuePair StringLiteral test submit entity
test SimpleName NormalAnnotation MemberValuePair SimpleName depends on methods
test SimpleName NormalAnnotation MemberValuePair StringLiteral test submit entity
table id SimpleName MethodInvocation SimpleName get id
guid SimpleName VariableDeclarationFragment MethodInvocation SimpleName table id
guid SimpleName VariableDeclarationFragment MethodInvocation SimpleName get id
final Modifier VariableDeclarationStatement SimpleType SimpleName string
final Modifier VariableDeclarationStatement VariableDeclarationFragment SimpleName guid
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName table id
final Modifier VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get id
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName guid
description SimpleName VariableDeclarationFragment StringLiteral bar table - new desc
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName description
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment StringLiteral bar table - new desc
add property SimpleName MethodInvocation SimpleName guid
add property SimpleName MethodInvocation StringLiteral description
add property SimpleName MethodInvocation SimpleName description
guid SimpleName MethodInvocation StringLiteral description
guid SimpleName MethodInvocation SimpleName description
description StringLiteral MethodInvocation SimpleName description
atlas client v SimpleName MethodInvocation SimpleName call api with body and params
atlas client v SimpleName MethodInvocation QualifiedName atlas clientapiget entity
atlas client v SimpleName MethodInvocation SimpleName guid
call api with body and params SimpleName MethodInvocation QualifiedName atlas clientapiget entity
call api with body and params SimpleName MethodInvocation SimpleName guid
atlas clientapiget entity QualifiedName MethodInvocation SimpleName guid
response SimpleName VariableDeclarationFragment MethodInvocation SimpleName atlas client v
response SimpleName VariableDeclarationFragment MethodInvocation SimpleName call api with body and params
response SimpleName VariableDeclarationFragment MethodInvocation QualifiedName atlas clientapiget entity
response SimpleName VariableDeclarationFragment MethodInvocation SimpleName guid
json object SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName response
assert SimpleName MethodInvocation SimpleName assert not null
assert SimpleName MethodInvocation SimpleName response
assert not null SimpleName MethodInvocation SimpleName response
table instance SimpleName MethodInvocation SimpleName set
table instance SimpleName MethodInvocation StringLiteral description
table instance SimpleName MethodInvocation SimpleName description
set SimpleName MethodInvocation StringLiteral description
set SimpleName MethodInvocation SimpleName description
description StringLiteral MethodInvocation SimpleName description
add property SimpleName MethodInvocation SimpleName guid
add property SimpleName MethodInvocation StringLiteral invalid property
add property SimpleName MethodInvocation StringLiteral bar table
guid SimpleName MethodInvocation StringLiteral invalid property
guid SimpleName MethodInvocation StringLiteral bar table
invalid property StringLiteral MethodInvocation StringLiteral bar table
assert SimpleName MethodInvocation SimpleName fail
assert SimpleName MethodInvocation StringLiteral expected atlas service exception
fail SimpleName MethodInvocation StringLiteral expected atlas service exception
atlas service exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
e SimpleName MethodInvocation SimpleName get status
e SimpleName MethodInvocation MethodInvocation SimpleName get status code
get status SimpleName MethodInvocation MethodInvocation SimpleName get status code
responsestatusbad request QualifiedName MethodInvocation SimpleName get status code
assert SimpleName MethodInvocation SimpleName assert equals
assert SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName e
assert SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get status
assert SimpleName MethodInvocation MethodInvocation SimpleName get status code
assert SimpleName MethodInvocation MethodInvocation QualifiedName responsestatusbad request
assert SimpleName MethodInvocation MethodInvocation SimpleName get status code
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName e
assert equals SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get status
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get status code
assert equals SimpleName MethodInvocation MethodInvocation QualifiedName responsestatusbad request
assert equals SimpleName MethodInvocation MethodInvocation SimpleName get status code
get status code SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName responsestatusbad request
get status code SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get status code
string SimpleName MethodInvocation SimpleName value of
string SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName date time
value of SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName date time
current time SimpleName VariableDeclarationFragment MethodInvocation SimpleName string
current time SimpleName VariableDeclarationFragment MethodInvocation SimpleName value of
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName current time
atlas client v SimpleName MethodInvocation SimpleName call api with body and params
atlas client v SimpleName MethodInvocation QualifiedName atlas clientapiget entity
atlas client v SimpleName MethodInvocation SimpleName guid
call api with body and params SimpleName MethodInvocation QualifiedName atlas clientapiget entity
call api with body and params SimpleName MethodInvocation SimpleName guid
atlas clientapiget entity QualifiedName MethodInvocation SimpleName guid
response SimpleName Assignment MethodInvocation SimpleName atlas client v
response SimpleName Assignment MethodInvocation SimpleName call api with body and params
response SimpleName Assignment MethodInvocation QualifiedName atlas clientapiget entity
response SimpleName Assignment MethodInvocation SimpleName guid
assert SimpleName MethodInvocation SimpleName assert not null
assert SimpleName MethodInvocation SimpleName response
assert not null SimpleName MethodInvocation SimpleName response
table instance SimpleName MethodInvocation SimpleName set
table instance SimpleName MethodInvocation StringLiteral create time
table instance SimpleName MethodInvocation SimpleName current time
set SimpleName MethodInvocation StringLiteral create time
set SimpleName MethodInvocation SimpleName current time
create time StringLiteral MethodInvocation SimpleName current time
test SimpleName NormalAnnotation MethodDeclaration Modifier public
depends on methods SimpleName MemberValuePair NormalAnnotation MethodDeclaration Modifier public
test submit entity StringLiteral MemberValuePair NormalAnnotation MethodDeclaration Modifier public
test SimpleName NormalAnnotation MethodDeclaration PrimitiveType void
depends on methods SimpleName MemberValuePair NormalAnnotation MethodDeclaration PrimitiveType void
test submit entity StringLiteral MemberValuePair NormalAnnotation MethodDeclaration PrimitiveType void
test SimpleName NormalAnnotation MethodDeclaration SimpleName test add property
depends on methods SimpleName MemberValuePair NormalAnnotation MethodDeclaration SimpleName test add property
test submit entity StringLiteral MemberValuePair NormalAnnotation MethodDeclaration SimpleName test add property
test SimpleName NormalAnnotation MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test add property
public Modifier MethodDeclaration SimpleType SimpleName exception
public Modifier MethodDeclaration Block VariableDeclarationStatement Modifier final
void PrimitiveType MethodDeclaration SimpleName test add property
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement Modifier final
test add property SimpleName MethodDeclaration SimpleType SimpleName exception
test add property SimpleName MethodDeclaration Block VariableDeclarationStatement Modifier final
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration NormalAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test add property
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration NormalAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test add property
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception
