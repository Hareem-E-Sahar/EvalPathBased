compaction stats SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName maj c stats
tablet server SimpleName MethodInvocation SimpleName is major compaction disabled
major compaction queued SimpleName Assignment BooleanLiteral false
timer SimpleName MethodInvocation SimpleName increment status major
system SimpleName MethodInvocation SimpleName current time millis
start SimpleName Assignment MethodInvocation SimpleName system
start SimpleName Assignment MethodInvocation SimpleName current time millis
major compact SimpleName MethodInvocation SimpleName reason
maj c stats SimpleName Assignment MethodInvocation SimpleName major compact
maj c stats SimpleName Assignment MethodInvocation SimpleName reason
reason SimpleName InfixExpression QualifiedName major compaction reasonnormal
needs major compaction SimpleName MethodInvocation SimpleName reason
reason SimpleName InfixExpression InfixExpression MethodInvocation SimpleName needs major compaction
reason SimpleName InfixExpression InfixExpression MethodInvocation SimpleName reason
major compaction reasonnormal QualifiedName InfixExpression InfixExpression MethodInvocation SimpleName needs major compaction
major compaction reasonnormal QualifiedName InfixExpression InfixExpression MethodInvocation SimpleName reason
initiate major compaction SimpleName MethodInvocation SimpleName reason
runtime exception SimpleName SimpleType SingleVariableDeclaration SimpleName e
failed SimpleName Assignment BooleanLiteral true
count SimpleName VariableDeclarationFragment NumberLiteral empty
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName count
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment NumberLiteral empty
maj c stats SimpleName MethodInvocation SimpleName get entries read
count SimpleName Assignment MethodInvocation SimpleName maj c stats
count SimpleName Assignment MethodInvocation SimpleName get entries read
timer SimpleName MethodInvocation SimpleName update time
timer SimpleName MethodInvocation QualifiedName operationmajor
timer SimpleName MethodInvocation SimpleName queued
timer SimpleName MethodInvocation SimpleName start
timer SimpleName MethodInvocation SimpleName count
update time SimpleName MethodInvocation QualifiedName operationmajor
update time SimpleName MethodInvocation SimpleName queued
update time SimpleName MethodInvocation SimpleName start
update time SimpleName MethodInvocation SimpleName count
update time SimpleName MethodInvocation SimpleName failed
operationmajor QualifiedName MethodInvocation SimpleName queued
operationmajor QualifiedName MethodInvocation SimpleName start
operationmajor QualifiedName MethodInvocation SimpleName count
operationmajor QualifiedName MethodInvocation SimpleName failed
queued SimpleName MethodInvocation SimpleName start
queued SimpleName MethodInvocation SimpleName count
queued SimpleName MethodInvocation SimpleName failed
start SimpleName MethodInvocation SimpleName count
start SimpleName MethodInvocation SimpleName failed
count SimpleName MethodInvocation SimpleName failed
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName run
void PrimitiveType MethodDeclaration SimpleName run
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName run
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName run
