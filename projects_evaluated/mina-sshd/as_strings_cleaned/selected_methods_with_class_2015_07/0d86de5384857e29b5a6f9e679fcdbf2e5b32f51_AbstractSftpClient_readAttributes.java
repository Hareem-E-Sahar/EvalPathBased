buffer SimpleName SimpleType SingleVariableDeclaration SimpleName buffer
attrs SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName attributes
attributes SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName attrs
buffer SimpleName MethodInvocation SimpleName get int
flags SimpleName VariableDeclarationFragment MethodInvocation SimpleName buffer
flags SimpleName VariableDeclarationFragment MethodInvocation SimpleName get int
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName flags
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName buffer
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get int
version SimpleName VariableDeclarationFragment MethodInvocation SimpleName get version
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName version
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment MethodInvocation SimpleName get version
version SimpleName InfixExpression SimpleName sftp v
flags SimpleName InfixExpression SimpleName ssh filexfer attr size
flags SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
ssh filexfer attr size SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
attrsflags QualifiedName MethodInvocation SimpleName add
attrsflags QualifiedName MethodInvocation QualifiedName attributesize
add SimpleName MethodInvocation QualifiedName attributesize
buffer SimpleName MethodInvocation SimpleName get long
attrssize QualifiedName Assignment MethodInvocation SimpleName buffer
attrssize QualifiedName Assignment MethodInvocation SimpleName get long
flags SimpleName InfixExpression SimpleName ssh filexfer attr uidgid
flags SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
ssh filexfer attr uidgid SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
attrsflags QualifiedName MethodInvocation SimpleName add
attrsflags QualifiedName MethodInvocation QualifiedName attributeuid gid
add SimpleName MethodInvocation QualifiedName attributeuid gid
buffer SimpleName MethodInvocation SimpleName get int
attrsuid QualifiedName Assignment MethodInvocation SimpleName buffer
attrsuid QualifiedName Assignment MethodInvocation SimpleName get int
buffer SimpleName MethodInvocation SimpleName get int
attrsgid QualifiedName Assignment MethodInvocation SimpleName buffer
attrsgid QualifiedName Assignment MethodInvocation SimpleName get int
flags SimpleName InfixExpression SimpleName ssh filexfer attr permissions
flags SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
ssh filexfer attr permissions SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
attrsflags QualifiedName MethodInvocation SimpleName add
attrsflags QualifiedName MethodInvocation QualifiedName attributeperms
add SimpleName MethodInvocation QualifiedName attributeperms
buffer SimpleName MethodInvocation SimpleName get int
attrsperms QualifiedName Assignment MethodInvocation SimpleName buffer
attrsperms QualifiedName Assignment MethodInvocation SimpleName get int
flags SimpleName InfixExpression SimpleName ssh filexfer attr acmodtime
flags SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
ssh filexfer attr acmodtime SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
attrsflags QualifiedName MethodInvocation SimpleName add
attrsflags QualifiedName MethodInvocation QualifiedName attributeac mod time
add SimpleName MethodInvocation QualifiedName attributeac mod time
buffer SimpleName MethodInvocation SimpleName get int
attrsatime QualifiedName Assignment MethodInvocation SimpleName buffer
attrsatime QualifiedName Assignment MethodInvocation SimpleName get int
buffer SimpleName MethodInvocation SimpleName get int
attrsmtime QualifiedName Assignment MethodInvocation SimpleName buffer
attrsmtime QualifiedName Assignment MethodInvocation SimpleName get int
version SimpleName InfixExpression SimpleName sftp v
buffer SimpleName MethodInvocation SimpleName get u byte
attrstype QualifiedName Assignment MethodInvocation SimpleName buffer
attrstype QualifiedName Assignment MethodInvocation SimpleName get u byte
flags SimpleName InfixExpression SimpleName ssh filexfer attr size
flags SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
ssh filexfer attr size SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
attrsflags QualifiedName MethodInvocation SimpleName add
attrsflags QualifiedName MethodInvocation QualifiedName attributesize
add SimpleName MethodInvocation QualifiedName attributesize
buffer SimpleName MethodInvocation SimpleName get long
attrssize QualifiedName Assignment MethodInvocation SimpleName buffer
attrssize QualifiedName Assignment MethodInvocation SimpleName get long
flags SimpleName InfixExpression SimpleName ssh filexfer attr ownergroup
flags SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
ssh filexfer attr ownergroup SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
attrsflags QualifiedName MethodInvocation SimpleName add
attrsflags QualifiedName MethodInvocation QualifiedName attributeowner group
add SimpleName MethodInvocation QualifiedName attributeowner group
buffer SimpleName MethodInvocation SimpleName get string
attrsowner QualifiedName Assignment MethodInvocation SimpleName buffer
attrsowner QualifiedName Assignment MethodInvocation SimpleName get string
buffer SimpleName MethodInvocation SimpleName get string
attrsgroup QualifiedName Assignment MethodInvocation SimpleName buffer
attrsgroup QualifiedName Assignment MethodInvocation SimpleName get string
flags SimpleName InfixExpression SimpleName ssh filexfer attr permissions
flags SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
ssh filexfer attr permissions SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
attrsflags QualifiedName MethodInvocation SimpleName add
attrsflags QualifiedName MethodInvocation QualifiedName attributeperms
add SimpleName MethodInvocation QualifiedName attributeperms
buffer SimpleName MethodInvocation SimpleName get int
attrsperms QualifiedName Assignment MethodInvocation SimpleName buffer
attrsperms QualifiedName Assignment MethodInvocation SimpleName get int
attrsperms QualifiedName Assignment SimpleName s ifreg
attrsperms QualifiedName Assignment SimpleName s ifdir
attrsperms QualifiedName Assignment SimpleName s iflnk
attrstype QualifiedName SwitchStatement SwitchCase SimpleName ssh filexfer type regular
attrstype QualifiedName SwitchStatement ExpressionStatement Assignment QualifiedName attrsperms
attrstype QualifiedName SwitchStatement ExpressionStatement Assignment SimpleName s ifreg
attrstype QualifiedName SwitchStatement SwitchCase SimpleName ssh filexfer type directory
attrstype QualifiedName SwitchStatement ExpressionStatement Assignment QualifiedName attrsperms
attrstype QualifiedName SwitchStatement ExpressionStatement Assignment SimpleName s ifdir
ssh filexfer type regular SimpleName SwitchCase SwitchStatement SwitchCase SimpleName ssh filexfer type directory
ssh filexfer type directory SimpleName SwitchCase SwitchStatement SwitchCase SimpleName ssh filexfer type symlink
flags SimpleName InfixExpression SimpleName ssh filexfer attr accesstime
flags SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
ssh filexfer attr accesstime SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
attrsflags QualifiedName MethodInvocation SimpleName add
attrsflags QualifiedName MethodInvocation QualifiedName attributeaccess time
add SimpleName MethodInvocation QualifiedName attributeaccess time
read time SimpleName MethodInvocation SimpleName buffer
read time SimpleName MethodInvocation SimpleName flags
buffer SimpleName MethodInvocation SimpleName flags
attrsaccess time QualifiedName Assignment MethodInvocation SimpleName read time
attrsaccess time QualifiedName Assignment MethodInvocation SimpleName buffer
attrsaccess time QualifiedName Assignment MethodInvocation SimpleName flags
attrsaccess time QualifiedName MethodInvocation SimpleName to
attrsaccess time QualifiedName MethodInvocation QualifiedName time unitseconds
to SimpleName MethodInvocation QualifiedName time unitseconds
int PrimitiveType CastExpression MethodInvocation QualifiedName attrsaccess time
int PrimitiveType CastExpression MethodInvocation SimpleName to
int PrimitiveType CastExpression MethodInvocation QualifiedName time unitseconds
attrsatime QualifiedName Assignment CastExpression PrimitiveType int
attrsatime QualifiedName Assignment CastExpression MethodInvocation QualifiedName attrsaccess time
attrsatime QualifiedName Assignment CastExpression MethodInvocation SimpleName to
attrsatime QualifiedName Assignment CastExpression MethodInvocation QualifiedName time unitseconds
flags SimpleName InfixExpression SimpleName ssh filexfer attr createtime
flags SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
ssh filexfer attr createtime SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
attrsflags QualifiedName MethodInvocation SimpleName add
attrsflags QualifiedName MethodInvocation QualifiedName attributecreate time
add SimpleName MethodInvocation QualifiedName attributecreate time
read time SimpleName MethodInvocation SimpleName buffer
read time SimpleName MethodInvocation SimpleName flags
buffer SimpleName MethodInvocation SimpleName flags
attrscreate time QualifiedName Assignment MethodInvocation SimpleName read time
attrscreate time QualifiedName Assignment MethodInvocation SimpleName buffer
attrscreate time QualifiedName Assignment MethodInvocation SimpleName flags
attrscreate time QualifiedName MethodInvocation SimpleName to
attrscreate time QualifiedName MethodInvocation QualifiedName time unitseconds
to SimpleName MethodInvocation QualifiedName time unitseconds
int PrimitiveType CastExpression MethodInvocation QualifiedName attrscreate time
int PrimitiveType CastExpression MethodInvocation SimpleName to
int PrimitiveType CastExpression MethodInvocation QualifiedName time unitseconds
attrsctime QualifiedName Assignment CastExpression PrimitiveType int
attrsctime QualifiedName Assignment CastExpression MethodInvocation QualifiedName attrscreate time
attrsctime QualifiedName Assignment CastExpression MethodInvocation SimpleName to
attrsctime QualifiedName Assignment CastExpression MethodInvocation QualifiedName time unitseconds
flags SimpleName InfixExpression SimpleName ssh filexfer attr modifytime
flags SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
ssh filexfer attr modifytime SimpleName InfixExpression ParenthesizedExpression InfixExpression NumberLiteral empty
attrsflags QualifiedName MethodInvocation SimpleName add
attrsflags QualifiedName MethodInvocation QualifiedName attributemodify time
add SimpleName MethodInvocation QualifiedName attributemodify time
read time SimpleName MethodInvocation SimpleName buffer
read time SimpleName MethodInvocation SimpleName flags
buffer SimpleName MethodInvocation SimpleName flags
attrsmodify time QualifiedName Assignment MethodInvocation SimpleName read time
attrsmodify time QualifiedName Assignment MethodInvocation SimpleName buffer
attrsmodify time QualifiedName Assignment MethodInvocation SimpleName flags
attrsmodify time QualifiedName MethodInvocation SimpleName to
attrsmodify time QualifiedName MethodInvocation QualifiedName time unitseconds
to SimpleName MethodInvocation QualifiedName time unitseconds
int PrimitiveType CastExpression MethodInvocation QualifiedName attrsmodify time
int PrimitiveType CastExpression MethodInvocation SimpleName to
int PrimitiveType CastExpression MethodInvocation QualifiedName time unitseconds
attrsmtime QualifiedName Assignment CastExpression PrimitiveType int
attrsmtime QualifiedName Assignment CastExpression MethodInvocation QualifiedName attrsmodify time
attrsmtime QualifiedName Assignment CastExpression MethodInvocation SimpleName to
attrsmtime QualifiedName Assignment CastExpression MethodInvocation QualifiedName time unitseconds
read attributes - unsupported version StringLiteral InfixExpression SimpleName version
illegal state exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral read attributes - unsupported version
illegal state exception SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName version
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType int
int PrimitiveType VariableDeclarationStatement Block ReturnStatement SimpleName attrs
int PrimitiveType VariableDeclarationStatement Block ReturnStatement SimpleName attrs
protected Modifier MethodDeclaration SimpleType SimpleName attributes
protected Modifier MethodDeclaration SimpleName read attributes
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName buffer
protected Modifier MethodDeclaration SingleVariableDeclaration SimpleName buffer
protected Modifier MethodDeclaration SimpleType SimpleName io exception
protected Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
protected Modifier MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
protected Modifier MethodDeclaration Block ReturnStatement SimpleName attrs
attributes SimpleName SimpleType MethodDeclaration SimpleName read attributes
attributes SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName buffer
attributes SimpleName SimpleType MethodDeclaration SimpleType SimpleName io exception
read attributes SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName buffer
read attributes SimpleName MethodDeclaration SingleVariableDeclaration SimpleName buffer
read attributes SimpleName MethodDeclaration SimpleType SimpleName io exception
read attributes SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
read attributes SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
read attributes SimpleName MethodDeclaration Block ReturnStatement SimpleName attrs
buffer SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName io exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier protected
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName attributes
public Modifier TypeDeclaration MethodDeclaration SimpleName read attributes
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName buffer
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
test SimpleName TypeDeclaration MethodDeclaration Modifier protected
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName attributes
test SimpleName TypeDeclaration MethodDeclaration SimpleName read attributes
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName buffer
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName io exception
