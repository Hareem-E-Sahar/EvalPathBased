buffer SimpleName SimpleType SingleVariableDeclaration SimpleName buffer
map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
map SimpleName SimpleType ParameterizedType SimpleType SimpleName object
string SimpleName SimpleType ParameterizedType SimpleType SimpleName object
map SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName attributes
string SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName attributes
object SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName attributes
attributes SimpleName MethodInvocation SimpleName get
attributes SimpleName MethodInvocation StringLiteral is regular file
get SimpleName MethodInvocation StringLiteral is regular file
boolean SimpleName SimpleType CastExpression MethodInvocation SimpleName attributes
boolean SimpleName SimpleType CastExpression MethodInvocation SimpleName get
boolean SimpleName SimpleType CastExpression MethodInvocation StringLiteral is regular file
get bool SimpleName MethodInvocation CastExpression SimpleType SimpleName boolean
get bool SimpleName MethodInvocation CastExpression MethodInvocation SimpleName attributes
get bool SimpleName MethodInvocation CastExpression MethodInvocation SimpleName get
get bool SimpleName MethodInvocation CastExpression MethodInvocation StringLiteral is regular file
is reg SimpleName VariableDeclarationFragment MethodInvocation SimpleName get bool
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName is reg
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get bool
attributes SimpleName MethodInvocation SimpleName get
attributes SimpleName MethodInvocation StringLiteral is directory
get SimpleName MethodInvocation StringLiteral is directory
boolean SimpleName SimpleType CastExpression MethodInvocation SimpleName attributes
boolean SimpleName SimpleType CastExpression MethodInvocation SimpleName get
boolean SimpleName SimpleType CastExpression MethodInvocation StringLiteral is directory
get bool SimpleName MethodInvocation CastExpression SimpleType SimpleName boolean
get bool SimpleName MethodInvocation CastExpression MethodInvocation SimpleName attributes
get bool SimpleName MethodInvocation CastExpression MethodInvocation SimpleName get
get bool SimpleName MethodInvocation CastExpression MethodInvocation StringLiteral is directory
is dir SimpleName VariableDeclarationFragment MethodInvocation SimpleName get bool
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName is dir
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get bool
attributes SimpleName MethodInvocation SimpleName get
attributes SimpleName MethodInvocation StringLiteral is symbolic link
get SimpleName MethodInvocation StringLiteral is symbolic link
boolean SimpleName SimpleType CastExpression MethodInvocation SimpleName attributes
boolean SimpleName SimpleType CastExpression MethodInvocation SimpleName get
boolean SimpleName SimpleType CastExpression MethodInvocation StringLiteral is symbolic link
get bool SimpleName MethodInvocation CastExpression SimpleType SimpleName boolean
get bool SimpleName MethodInvocation CastExpression MethodInvocation SimpleName attributes
get bool SimpleName MethodInvocation CastExpression MethodInvocation SimpleName get
get bool SimpleName MethodInvocation CastExpression MethodInvocation StringLiteral is symbolic link
is lnk SimpleName VariableDeclarationFragment MethodInvocation SimpleName get bool
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName is lnk
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get bool
suppress warnings SimpleName SingleMemberAnnotation StringLiteral unchecked
collection SimpleName SimpleType ParameterizedType SimpleType SimpleName posix file permission
collection SimpleName SimpleType ParameterizedType SimpleType SimpleName posix file permission
attributes SimpleName MethodInvocation SimpleName get
attributes SimpleName MethodInvocation StringLiteral permissions
get SimpleName MethodInvocation StringLiteral permissions
perms SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName attributes
perms SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName get
perms SimpleName VariableDeclarationFragment CastExpression MethodInvocation StringLiteral permissions
suppress warnings SimpleName SingleMemberAnnotation VariableDeclarationStatement VariableDeclarationFragment SimpleName perms
unchecked StringLiteral SingleMemberAnnotation VariableDeclarationStatement VariableDeclarationFragment SimpleName perms
attributes SimpleName MethodInvocation SimpleName get
attributes SimpleName MethodInvocation StringLiteral size
get SimpleName MethodInvocation StringLiteral size
number SimpleName SimpleType CastExpression MethodInvocation SimpleName attributes
number SimpleName SimpleType CastExpression MethodInvocation SimpleName get
number SimpleName SimpleType CastExpression MethodInvocation StringLiteral size
size SimpleName VariableDeclarationFragment CastExpression SimpleType SimpleName number
size SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName attributes
size SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName get
size SimpleName VariableDeclarationFragment CastExpression MethodInvocation StringLiteral size
number SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName size
attributes SimpleName MethodInvocation SimpleName get
attributes SimpleName MethodInvocation StringLiteral last modified time
get SimpleName MethodInvocation StringLiteral last modified time
file time SimpleName SimpleType CastExpression MethodInvocation SimpleName attributes
file time SimpleName SimpleType CastExpression MethodInvocation SimpleName get
file time SimpleName SimpleType CastExpression MethodInvocation StringLiteral last modified time
last modified time SimpleName VariableDeclarationFragment CastExpression SimpleType SimpleName file time
last modified time SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName attributes
last modified time SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName get
last modified time SimpleName VariableDeclarationFragment CastExpression MethodInvocation StringLiteral last modified time
file time SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName last modified time
attributes SimpleName MethodInvocation SimpleName get
attributes SimpleName MethodInvocation StringLiteral last access time
get SimpleName MethodInvocation StringLiteral last access time
file time SimpleName SimpleType CastExpression MethodInvocation SimpleName attributes
file time SimpleName SimpleType CastExpression MethodInvocation SimpleName get
file time SimpleName SimpleType CastExpression MethodInvocation StringLiteral last access time
last access time SimpleName VariableDeclarationFragment CastExpression SimpleType SimpleName file time
last access time SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName attributes
last access time SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName get
last access time SimpleName VariableDeclarationFragment CastExpression MethodInvocation StringLiteral last access time
file time SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName last access time
version SimpleName InfixExpression SimpleName sftp v
is reg SimpleName InfixExpression SimpleName is lnk
ssh filexfer attr size SimpleName ConditionalExpression NumberLiteral empty
attributes SimpleName MethodInvocation SimpleName contains key
attributes SimpleName MethodInvocation StringLiteral uid
contains key SimpleName MethodInvocation StringLiteral uid
attributes SimpleName MethodInvocation SimpleName contains key
attributes SimpleName MethodInvocation StringLiteral gid
contains key SimpleName MethodInvocation StringLiteral gid
attributes SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName attributes
attributes SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName contains key
attributes SimpleName MethodInvocation InfixExpression MethodInvocation StringLiteral gid
contains key SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName attributes
contains key SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName contains key
contains key SimpleName MethodInvocation InfixExpression MethodInvocation StringLiteral gid
uid StringLiteral MethodInvocation InfixExpression MethodInvocation SimpleName attributes
uid StringLiteral MethodInvocation InfixExpression MethodInvocation SimpleName contains key
uid StringLiteral MethodInvocation InfixExpression MethodInvocation StringLiteral gid
attributes SimpleName MethodInvocation InfixExpression ConditionalExpression SimpleName ssh filexfer attr uidgid
contains key SimpleName MethodInvocation InfixExpression ConditionalExpression SimpleName ssh filexfer attr uidgid
uid StringLiteral MethodInvocation InfixExpression ConditionalExpression SimpleName ssh filexfer attr uidgid
attributes SimpleName MethodInvocation InfixExpression ConditionalExpression SimpleName ssh filexfer attr uidgid
contains key SimpleName MethodInvocation InfixExpression ConditionalExpression SimpleName ssh filexfer attr uidgid
gid StringLiteral MethodInvocation InfixExpression ConditionalExpression SimpleName ssh filexfer attr uidgid
attributes SimpleName MethodInvocation InfixExpression ConditionalExpression NumberLiteral empty
contains key SimpleName MethodInvocation InfixExpression ConditionalExpression NumberLiteral empty
uid StringLiteral MethodInvocation InfixExpression ConditionalExpression NumberLiteral empty
attributes SimpleName MethodInvocation InfixExpression ConditionalExpression NumberLiteral empty
contains key SimpleName MethodInvocation InfixExpression ConditionalExpression NumberLiteral empty
gid StringLiteral MethodInvocation InfixExpression ConditionalExpression NumberLiteral empty
ssh filexfer attr uidgid SimpleName ConditionalExpression NumberLiteral empty
perms SimpleName InfixExpression ParenthesizedExpression ConditionalExpression SimpleName ssh filexfer attr permissions
perms SimpleName InfixExpression ParenthesizedExpression ConditionalExpression NumberLiteral empty
ssh filexfer attr permissions SimpleName ConditionalExpression NumberLiteral empty
ssh filexfer attr acmodtime SimpleName ConditionalExpression NumberLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName flags
buffer SimpleName MethodInvocation SimpleName put int
buffer SimpleName MethodInvocation SimpleName flags
put int SimpleName MethodInvocation SimpleName flags
flags SimpleName InfixExpression SimpleName ssh filexfer attr size
flags SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
ssh filexfer attr size SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
size SimpleName MethodInvocation SimpleName long value
buffer SimpleName MethodInvocation SimpleName put long
buffer SimpleName MethodInvocation MethodInvocation SimpleName size
buffer SimpleName MethodInvocation MethodInvocation SimpleName long value
put long SimpleName MethodInvocation MethodInvocation SimpleName size
put long SimpleName MethodInvocation MethodInvocation SimpleName long value
flags SimpleName InfixExpression SimpleName ssh filexfer attr uidgid
flags SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
ssh filexfer attr uidgid SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
attributes SimpleName MethodInvocation SimpleName get
attributes SimpleName MethodInvocation StringLiteral uid
get SimpleName MethodInvocation StringLiteral uid
number SimpleName SimpleType CastExpression MethodInvocation SimpleName attributes
number SimpleName SimpleType CastExpression MethodInvocation SimpleName get
number SimpleName SimpleType CastExpression MethodInvocation StringLiteral uid
buffer SimpleName MethodInvocation SimpleName put int
buffer SimpleName MethodInvocation MethodInvocation SimpleName int value
put int SimpleName MethodInvocation MethodInvocation SimpleName int value
attributes SimpleName MethodInvocation SimpleName get
attributes SimpleName MethodInvocation StringLiteral gid
get SimpleName MethodInvocation StringLiteral gid
number SimpleName SimpleType CastExpression MethodInvocation SimpleName attributes
number SimpleName SimpleType CastExpression MethodInvocation SimpleName get
number SimpleName SimpleType CastExpression MethodInvocation StringLiteral gid
buffer SimpleName MethodInvocation SimpleName put int
buffer SimpleName MethodInvocation MethodInvocation SimpleName int value
put int SimpleName MethodInvocation MethodInvocation SimpleName int value
flags SimpleName InfixExpression SimpleName ssh filexfer attr permissions
flags SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
ssh filexfer attr permissions SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
attributes to permissions SimpleName MethodInvocation SimpleName is reg
attributes to permissions SimpleName MethodInvocation SimpleName is dir
attributes to permissions SimpleName MethodInvocation SimpleName is lnk
attributes to permissions SimpleName MethodInvocation SimpleName perms
is reg SimpleName MethodInvocation SimpleName is dir
is reg SimpleName MethodInvocation SimpleName is lnk
is reg SimpleName MethodInvocation SimpleName perms
is dir SimpleName MethodInvocation SimpleName is lnk
is dir SimpleName MethodInvocation SimpleName perms
is lnk SimpleName MethodInvocation SimpleName perms
buffer SimpleName MethodInvocation SimpleName put int
buffer SimpleName MethodInvocation MethodInvocation SimpleName attributes to permissions
buffer SimpleName MethodInvocation MethodInvocation SimpleName is reg
buffer SimpleName MethodInvocation MethodInvocation SimpleName is dir
buffer SimpleName MethodInvocation MethodInvocation SimpleName is lnk
buffer SimpleName MethodInvocation MethodInvocation SimpleName perms
put int SimpleName MethodInvocation MethodInvocation SimpleName attributes to permissions
put int SimpleName MethodInvocation MethodInvocation SimpleName is reg
put int SimpleName MethodInvocation MethodInvocation SimpleName is dir
put int SimpleName MethodInvocation MethodInvocation SimpleName is lnk
put int SimpleName MethodInvocation MethodInvocation SimpleName perms
flags SimpleName InfixExpression SimpleName ssh filexfer attr acmodtime
flags SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
ssh filexfer attr acmodtime SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
last access time SimpleName MethodInvocation SimpleName to
last access time SimpleName MethodInvocation QualifiedName time unitseconds
to SimpleName MethodInvocation QualifiedName time unitseconds
buffer SimpleName MethodInvocation SimpleName put int
buffer SimpleName MethodInvocation MethodInvocation SimpleName last access time
buffer SimpleName MethodInvocation MethodInvocation SimpleName to
buffer SimpleName MethodInvocation MethodInvocation QualifiedName time unitseconds
put int SimpleName MethodInvocation MethodInvocation SimpleName last access time
put int SimpleName MethodInvocation MethodInvocation SimpleName to
put int SimpleName MethodInvocation MethodInvocation QualifiedName time unitseconds
last modified time SimpleName MethodInvocation SimpleName to
last modified time SimpleName MethodInvocation QualifiedName time unitseconds
to SimpleName MethodInvocation QualifiedName time unitseconds
buffer SimpleName MethodInvocation SimpleName put int
buffer SimpleName MethodInvocation MethodInvocation SimpleName last modified time
buffer SimpleName MethodInvocation MethodInvocation SimpleName to
buffer SimpleName MethodInvocation MethodInvocation QualifiedName time unitseconds
put int SimpleName MethodInvocation MethodInvocation SimpleName last modified time
put int SimpleName MethodInvocation MethodInvocation SimpleName to
put int SimpleName MethodInvocation MethodInvocation QualifiedName time unitseconds
version SimpleName InfixExpression SimpleName sftp v
attributes SimpleName MethodInvocation SimpleName get
attributes SimpleName MethodInvocation StringLiteral creation time
get SimpleName MethodInvocation StringLiteral creation time
file time SimpleName SimpleType CastExpression MethodInvocation SimpleName attributes
file time SimpleName SimpleType CastExpression MethodInvocation SimpleName get
file time SimpleName SimpleType CastExpression MethodInvocation StringLiteral creation time
creation time SimpleName VariableDeclarationFragment CastExpression SimpleType SimpleName file time
creation time SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName attributes
creation time SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName get
creation time SimpleName VariableDeclarationFragment CastExpression MethodInvocation StringLiteral creation time
file time SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName creation time
is reg SimpleName InfixExpression SimpleName is lnk
ssh filexfer attr size SimpleName ConditionalExpression NumberLiteral empty
attributes SimpleName MethodInvocation SimpleName contains key
attributes SimpleName MethodInvocation StringLiteral owner
contains key SimpleName MethodInvocation StringLiteral owner
attributes SimpleName MethodInvocation SimpleName contains key
attributes SimpleName MethodInvocation StringLiteral group
contains key SimpleName MethodInvocation StringLiteral group
attributes SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName attributes
attributes SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName contains key
attributes SimpleName MethodInvocation InfixExpression MethodInvocation StringLiteral group
contains key SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName attributes
contains key SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName contains key
contains key SimpleName MethodInvocation InfixExpression MethodInvocation StringLiteral group
owner StringLiteral MethodInvocation InfixExpression MethodInvocation SimpleName attributes
owner StringLiteral MethodInvocation InfixExpression MethodInvocation SimpleName contains key
owner StringLiteral MethodInvocation InfixExpression MethodInvocation StringLiteral group
ssh filexfer attr ownergroup SimpleName ConditionalExpression NumberLiteral empty
perms SimpleName InfixExpression ParenthesizedExpression ConditionalExpression SimpleName ssh filexfer attr permissions
perms SimpleName InfixExpression ParenthesizedExpression ConditionalExpression NumberLiteral empty
ssh filexfer attr permissions SimpleName ConditionalExpression NumberLiteral empty
last modified time SimpleName InfixExpression ParenthesizedExpression ConditionalExpression SimpleName ssh filexfer attr modifytime
last modified time SimpleName InfixExpression ParenthesizedExpression ConditionalExpression NumberLiteral empty
ssh filexfer attr modifytime SimpleName ConditionalExpression NumberLiteral empty
creation time SimpleName InfixExpression ParenthesizedExpression ConditionalExpression SimpleName ssh filexfer attr createtime
creation time SimpleName InfixExpression ParenthesizedExpression ConditionalExpression NumberLiteral empty
ssh filexfer attr createtime SimpleName ConditionalExpression NumberLiteral empty
last access time SimpleName InfixExpression ParenthesizedExpression ConditionalExpression SimpleName ssh filexfer attr accesstime
last access time SimpleName InfixExpression ParenthesizedExpression ConditionalExpression NumberLiteral empty
ssh filexfer attr accesstime SimpleName ConditionalExpression NumberLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName flags
buffer SimpleName MethodInvocation SimpleName put int
buffer SimpleName MethodInvocation SimpleName flags
put int SimpleName MethodInvocation SimpleName flags
is lnk SimpleName ConditionalExpression SimpleName ssh filexfer type symlink
is lnk SimpleName ConditionalExpression SimpleName ssh filexfer type unknown
ssh filexfer type symlink SimpleName ConditionalExpression SimpleName ssh filexfer type unknown
is dir SimpleName ConditionalExpression SimpleName ssh filexfer type directory
is dir SimpleName ConditionalExpression ConditionalExpression SimpleName is lnk
is dir SimpleName ConditionalExpression ConditionalExpression SimpleName ssh filexfer type symlink
is dir SimpleName ConditionalExpression ConditionalExpression SimpleName ssh filexfer type unknown
ssh filexfer type directory SimpleName ConditionalExpression ConditionalExpression SimpleName is lnk
ssh filexfer type directory SimpleName ConditionalExpression ConditionalExpression SimpleName ssh filexfer type symlink
ssh filexfer type directory SimpleName ConditionalExpression ConditionalExpression SimpleName ssh filexfer type unknown
is reg SimpleName ConditionalExpression SimpleName ssh filexfer type regular
is reg SimpleName ConditionalExpression ConditionalExpression SimpleName is dir
is reg SimpleName ConditionalExpression ConditionalExpression SimpleName ssh filexfer type directory
is reg SimpleName ConditionalExpression ConditionalExpression ConditionalExpression SimpleName is lnk
is reg SimpleName ConditionalExpression ConditionalExpression ConditionalExpression SimpleName ssh filexfer type symlink
is reg SimpleName ConditionalExpression ConditionalExpression ConditionalExpression SimpleName ssh filexfer type unknown
ssh filexfer type regular SimpleName ConditionalExpression ConditionalExpression SimpleName is dir
ssh filexfer type regular SimpleName ConditionalExpression ConditionalExpression SimpleName ssh filexfer type directory
ssh filexfer type regular SimpleName ConditionalExpression ConditionalExpression ConditionalExpression SimpleName is lnk
ssh filexfer type regular SimpleName ConditionalExpression ConditionalExpression ConditionalExpression SimpleName ssh filexfer type symlink
ssh filexfer type regular SimpleName ConditionalExpression ConditionalExpression ConditionalExpression SimpleName ssh filexfer type unknown
byte PrimitiveType CastExpression ParenthesizedExpression ConditionalExpression SimpleName is reg
byte PrimitiveType CastExpression ParenthesizedExpression ConditionalExpression SimpleName ssh filexfer type regular
buffer SimpleName MethodInvocation SimpleName put byte
buffer SimpleName MethodInvocation CastExpression PrimitiveType byte
put byte SimpleName MethodInvocation CastExpression PrimitiveType byte
flags SimpleName InfixExpression SimpleName ssh filexfer attr size
flags SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
ssh filexfer attr size SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
size SimpleName MethodInvocation SimpleName long value
buffer SimpleName MethodInvocation SimpleName put long
buffer SimpleName MethodInvocation MethodInvocation SimpleName size
buffer SimpleName MethodInvocation MethodInvocation SimpleName long value
put long SimpleName MethodInvocation MethodInvocation SimpleName size
put long SimpleName MethodInvocation MethodInvocation SimpleName long value
flags SimpleName InfixExpression SimpleName ssh filexfer attr ownergroup
flags SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
ssh filexfer attr ownergroup SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
attributes SimpleName MethodInvocation SimpleName get
attributes SimpleName MethodInvocation StringLiteral owner
get SimpleName MethodInvocation StringLiteral owner
attributes SimpleName MethodInvocation MethodInvocation SimpleName to string
get SimpleName MethodInvocation MethodInvocation SimpleName to string
owner StringLiteral MethodInvocation MethodInvocation SimpleName to string
buffer SimpleName MethodInvocation SimpleName put string
buffer SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName attributes
buffer SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get
buffer SimpleName MethodInvocation MethodInvocation MethodInvocation StringLiteral owner
buffer SimpleName MethodInvocation MethodInvocation SimpleName to string
buffer SimpleName MethodInvocation QualifiedName standard charsetsutf
put string SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName attributes
put string SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get
put string SimpleName MethodInvocation MethodInvocation MethodInvocation StringLiteral owner
put string SimpleName MethodInvocation MethodInvocation SimpleName to string
put string SimpleName MethodInvocation QualifiedName standard charsetsutf
attributes SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName standard charsetsutf
get SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName standard charsetsutf
owner StringLiteral MethodInvocation MethodInvocation MethodInvocation QualifiedName standard charsetsutf
to string SimpleName MethodInvocation MethodInvocation QualifiedName standard charsetsutf
attributes SimpleName MethodInvocation SimpleName get
attributes SimpleName MethodInvocation StringLiteral group
get SimpleName MethodInvocation StringLiteral group
attributes SimpleName MethodInvocation MethodInvocation SimpleName to string
get SimpleName MethodInvocation MethodInvocation SimpleName to string
group StringLiteral MethodInvocation MethodInvocation SimpleName to string
buffer SimpleName MethodInvocation SimpleName put string
buffer SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName attributes
buffer SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get
buffer SimpleName MethodInvocation MethodInvocation MethodInvocation StringLiteral group
buffer SimpleName MethodInvocation MethodInvocation SimpleName to string
buffer SimpleName MethodInvocation QualifiedName standard charsetsutf
put string SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName attributes
put string SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get
put string SimpleName MethodInvocation MethodInvocation MethodInvocation StringLiteral group
put string SimpleName MethodInvocation MethodInvocation SimpleName to string
put string SimpleName MethodInvocation QualifiedName standard charsetsutf
attributes SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName standard charsetsutf
get SimpleName MethodInvocation MethodInvocation MethodInvocation QualifiedName standard charsetsutf
group StringLiteral MethodInvocation MethodInvocation MethodInvocation QualifiedName standard charsetsutf
to string SimpleName MethodInvocation MethodInvocation QualifiedName standard charsetsutf
flags SimpleName InfixExpression SimpleName ssh filexfer attr permissions
flags SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
ssh filexfer attr permissions SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
attributes to permissions SimpleName MethodInvocation SimpleName is reg
attributes to permissions SimpleName MethodInvocation SimpleName is dir
attributes to permissions SimpleName MethodInvocation SimpleName is lnk
attributes to permissions SimpleName MethodInvocation SimpleName perms
is reg SimpleName MethodInvocation SimpleName is dir
is reg SimpleName MethodInvocation SimpleName is lnk
is reg SimpleName MethodInvocation SimpleName perms
is dir SimpleName MethodInvocation SimpleName is lnk
is dir SimpleName MethodInvocation SimpleName perms
is lnk SimpleName MethodInvocation SimpleName perms
buffer SimpleName MethodInvocation SimpleName put int
buffer SimpleName MethodInvocation MethodInvocation SimpleName attributes to permissions
buffer SimpleName MethodInvocation MethodInvocation SimpleName is reg
buffer SimpleName MethodInvocation MethodInvocation SimpleName is dir
buffer SimpleName MethodInvocation MethodInvocation SimpleName is lnk
buffer SimpleName MethodInvocation MethodInvocation SimpleName perms
put int SimpleName MethodInvocation MethodInvocation SimpleName attributes to permissions
put int SimpleName MethodInvocation MethodInvocation SimpleName is reg
put int SimpleName MethodInvocation MethodInvocation SimpleName is dir
put int SimpleName MethodInvocation MethodInvocation SimpleName is lnk
put int SimpleName MethodInvocation MethodInvocation SimpleName perms
flags SimpleName InfixExpression SimpleName ssh filexfer attr accesstime
flags SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
ssh filexfer attr accesstime SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
put file time SimpleName MethodInvocation SimpleName buffer
put file time SimpleName MethodInvocation SimpleName flags
put file time SimpleName MethodInvocation SimpleName last access time
buffer SimpleName MethodInvocation SimpleName flags
buffer SimpleName MethodInvocation SimpleName last access time
flags SimpleName MethodInvocation SimpleName last access time
flags SimpleName InfixExpression SimpleName ssh filexfer attr createtime
flags SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
ssh filexfer attr createtime SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
put file time SimpleName MethodInvocation SimpleName buffer
put file time SimpleName MethodInvocation SimpleName flags
put file time SimpleName MethodInvocation SimpleName last access time
buffer SimpleName MethodInvocation SimpleName flags
buffer SimpleName MethodInvocation SimpleName last access time
flags SimpleName MethodInvocation SimpleName last access time
flags SimpleName InfixExpression SimpleName ssh filexfer attr modifytime
flags SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
ssh filexfer attr modifytime SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
put file time SimpleName MethodInvocation SimpleName buffer
put file time SimpleName MethodInvocation SimpleName flags
put file time SimpleName MethodInvocation SimpleName last modified time
buffer SimpleName MethodInvocation SimpleName flags
buffer SimpleName MethodInvocation SimpleName last modified time
flags SimpleName MethodInvocation SimpleName last modified time
boolean PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType boolean
boolean PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType boolean
boolean PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType boolean
protected Modifier MethodDeclaration PrimitiveType void
protected Modifier MethodDeclaration SimpleName write attrs
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName buffer
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleName buffer
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleName attributes
protected Modifier MethodDeclaration SimpleType SimpleName io exception
void PrimitiveType MethodDeclaration SimpleName write attrs
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName buffer
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName buffer
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName attributes
void PrimitiveType MethodDeclaration SimpleType SimpleName io exception
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType boolean
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType boolean
void PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType boolean
write attrs SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName buffer
write attrs SimpleName MethodDeclaration SingleVariableDeclaration SimpleName buffer
write attrs SimpleName MethodDeclaration SingleVariableDeclaration SimpleName attributes
write attrs SimpleName MethodDeclaration SimpleType SimpleName io exception
write attrs SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType boolean
write attrs SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType boolean
write attrs SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType boolean
buffer SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName attributes
buffer SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
attributes SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier protected
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName write attrs
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName buffer
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName attributes
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
test SimpleName TypeDeclaration MethodDeclaration Modifier protected
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName write attrs
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName buffer
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName attributes
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
