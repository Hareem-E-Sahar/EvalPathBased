map SimpleName SimpleType ParameterizedType SimpleType QualifiedName ssh fileattribute
map SimpleName SimpleType ParameterizedType SimpleType SimpleName object
ssh fileattribute QualifiedName SimpleType ParameterizedType SimpleType SimpleName object
map SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName attributes
ssh fileattribute QualifiedName SimpleType ParameterizedType SingleVariableDeclaration SimpleName attributes
object SimpleName SimpleType ParameterizedType SingleVariableDeclaration SimpleName attributes
attributes SimpleName MethodInvocation SimpleName get
attributes SimpleName MethodInvocation QualifiedName ssh fileattributeis regular file
get SimpleName MethodInvocation QualifiedName ssh fileattributeis regular file
boolean SimpleName SimpleType CastExpression MethodInvocation SimpleName attributes
boolean SimpleName SimpleType CastExpression MethodInvocation SimpleName get
boolean SimpleName SimpleType CastExpression MethodInvocation QualifiedName ssh fileattributeis regular file
is reg SimpleName VariableDeclarationFragment CastExpression SimpleType SimpleName boolean
is reg SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName attributes
is reg SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName get
is reg SimpleName VariableDeclarationFragment CastExpression MethodInvocation QualifiedName ssh fileattributeis regular file
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName is reg
attributes SimpleName MethodInvocation SimpleName get
attributes SimpleName MethodInvocation QualifiedName ssh fileattributeis directory
get SimpleName MethodInvocation QualifiedName ssh fileattributeis directory
boolean SimpleName SimpleType CastExpression MethodInvocation SimpleName attributes
boolean SimpleName SimpleType CastExpression MethodInvocation SimpleName get
boolean SimpleName SimpleType CastExpression MethodInvocation QualifiedName ssh fileattributeis directory
is dir SimpleName VariableDeclarationFragment CastExpression SimpleType SimpleName boolean
is dir SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName attributes
is dir SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName get
is dir SimpleName VariableDeclarationFragment CastExpression MethodInvocation QualifiedName ssh fileattributeis directory
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName is dir
attributes SimpleName MethodInvocation SimpleName get
attributes SimpleName MethodInvocation QualifiedName ssh fileattributeis symbolic link
get SimpleName MethodInvocation QualifiedName ssh fileattributeis symbolic link
boolean SimpleName SimpleType CastExpression MethodInvocation SimpleName attributes
boolean SimpleName SimpleType CastExpression MethodInvocation SimpleName get
boolean SimpleName SimpleType CastExpression MethodInvocation QualifiedName ssh fileattributeis symbolic link
is lnk SimpleName VariableDeclarationFragment CastExpression SimpleType SimpleName boolean
is lnk SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName attributes
is lnk SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName get
is lnk SimpleName VariableDeclarationFragment CastExpression MethodInvocation QualifiedName ssh fileattributeis symbolic link
boolean PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName is lnk
pf SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName pf
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment NumberLiteral empty
enum set SimpleName SimpleType ParameterizedType SimpleType QualifiedName ssh filepermission
enum set SimpleName SimpleType ParameterizedType SimpleType QualifiedName ssh filepermission
attributes SimpleName MethodInvocation SimpleName get
attributes SimpleName MethodInvocation QualifiedName ssh fileattributepermissions
get SimpleName MethodInvocation QualifiedName ssh fileattributepermissions
perms SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName attributes
perms SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName get
perms SimpleName VariableDeclarationFragment CastExpression MethodInvocation QualifiedName ssh fileattributepermissions
ssh filepermission QualifiedName SimpleType SingleVariableDeclaration SimpleName p
pf SimpleName Assignment SimpleName s irusr
pf SimpleName Assignment SimpleName s iwusr
pf SimpleName Assignment SimpleName s ixusr
pf SimpleName Assignment SimpleName s irgrp
pf SimpleName Assignment SimpleName s iwgrp
pf SimpleName Assignment SimpleName s ixgrp
pf SimpleName Assignment SimpleName s iroth
pf SimpleName Assignment SimpleName s iwoth
pf SimpleName Assignment SimpleName s ixoth
p SimpleName SwitchStatement SwitchCase SimpleName user read
p SimpleName SwitchStatement ExpressionStatement Assignment SimpleName pf
p SimpleName SwitchStatement ExpressionStatement Assignment SimpleName s irusr
p SimpleName SwitchStatement SwitchCase SimpleName user write
p SimpleName SwitchStatement ExpressionStatement Assignment SimpleName pf
p SimpleName SwitchStatement ExpressionStatement Assignment SimpleName s iwusr
user read SimpleName SwitchCase SwitchStatement SwitchCase SimpleName user write
user write SimpleName SwitchCase SwitchStatement SwitchCase SimpleName user execute
user execute SimpleName SwitchCase SwitchStatement SwitchCase SimpleName group read
group read SimpleName SwitchCase SwitchStatement SwitchCase SimpleName group write
group write SimpleName SwitchCase SwitchStatement SwitchCase SimpleName group execute
group execute SimpleName SwitchCase SwitchStatement SwitchCase SimpleName others read
others read SimpleName SwitchCase SwitchStatement SwitchCase SimpleName others write
others write SimpleName SwitchCase SwitchStatement SwitchCase SimpleName others execute
ssh filepermission QualifiedName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName perms
p SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName perms
perms SimpleName EnhancedForStatement Block SwitchStatement SimpleName p
is reg SimpleName ConditionalExpression SimpleName s ifreg
is reg SimpleName ConditionalExpression NumberLiteral empty
s ifreg SimpleName ConditionalExpression NumberLiteral empty
pf SimpleName Assignment ConditionalExpression SimpleName is reg
pf SimpleName Assignment ConditionalExpression SimpleName s ifreg
pf SimpleName Assignment ConditionalExpression NumberLiteral empty
is dir SimpleName ConditionalExpression SimpleName s ifdir
is dir SimpleName ConditionalExpression NumberLiteral empty
s ifdir SimpleName ConditionalExpression NumberLiteral empty
pf SimpleName Assignment ConditionalExpression SimpleName is dir
pf SimpleName Assignment ConditionalExpression SimpleName s ifdir
pf SimpleName Assignment ConditionalExpression NumberLiteral empty
is lnk SimpleName ConditionalExpression SimpleName s iflnk
is lnk SimpleName ConditionalExpression NumberLiteral empty
s iflnk SimpleName ConditionalExpression NumberLiteral empty
pf SimpleName Assignment ConditionalExpression SimpleName is lnk
pf SimpleName Assignment ConditionalExpression SimpleName s iflnk
pf SimpleName Assignment ConditionalExpression NumberLiteral empty
boolean PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType boolean
boolean PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType boolean
boolean PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
boolean PrimitiveType VariableDeclarationStatement Block EnhancedForStatement SimpleName perms
boolean PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType boolean
boolean PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
boolean PrimitiveType VariableDeclarationStatement Block EnhancedForStatement SimpleName perms
boolean PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
boolean PrimitiveType VariableDeclarationStatement Block EnhancedForStatement SimpleName perms
int PrimitiveType VariableDeclarationStatement Block EnhancedForStatement SimpleName perms
perms SimpleName EnhancedForStatement Block ReturnStatement SimpleName pf
protected Modifier MethodDeclaration PrimitiveType int
protected Modifier MethodDeclaration SimpleName get permissions
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleName attributes
protected Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType boolean
protected Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType boolean
protected Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType boolean
protected Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
protected Modifier MethodDeclaration Block EnhancedForStatement SimpleName perms
protected Modifier MethodDeclaration Block ReturnStatement SimpleName pf
int PrimitiveType MethodDeclaration SimpleName get permissions
int PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName attributes
int PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType boolean
int PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType boolean
int PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType boolean
int PrimitiveType MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
int PrimitiveType MethodDeclaration Block EnhancedForStatement SimpleName perms
int PrimitiveType MethodDeclaration Block ReturnStatement SimpleName pf
get permissions SimpleName MethodDeclaration SingleVariableDeclaration SimpleName attributes
get permissions SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType boolean
get permissions SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType boolean
get permissions SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType boolean
get permissions SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
get permissions SimpleName MethodDeclaration Block EnhancedForStatement SimpleName perms
get permissions SimpleName MethodDeclaration Block ReturnStatement SimpleName pf
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier protected
public Modifier TypeDeclaration MethodDeclaration PrimitiveType int
public Modifier TypeDeclaration MethodDeclaration SimpleName get permissions
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName attributes
test SimpleName TypeDeclaration MethodDeclaration Modifier protected
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType int
test SimpleName TypeDeclaration MethodDeclaration SimpleName get permissions
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName attributes
