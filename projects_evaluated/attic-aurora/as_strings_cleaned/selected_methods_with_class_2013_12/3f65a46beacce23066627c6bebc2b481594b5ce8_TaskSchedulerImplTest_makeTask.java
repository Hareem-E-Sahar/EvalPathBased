string SimpleName SimpleType SingleVariableDeclaration SimpleName task id
assigned task SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName set instance id
assigned task SimpleName SimpleType ClassInstanceCreation MethodInvocation NumberLiteral empty
set instance id SimpleName MethodInvocation NumberLiteral empty
set instance id SimpleName MethodInvocation MethodInvocation SimpleName set task id
empty NumberLiteral MethodInvocation MethodInvocation SimpleName set task id
set instance id SimpleName MethodInvocation MethodInvocation SimpleName task id
empty NumberLiteral MethodInvocation MethodInvocation SimpleName task id
set task id SimpleName MethodInvocation SimpleName task id
job StringLiteral InfixExpression SimpleName task id
task config SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName set job name
set job name SimpleName MethodInvocation InfixExpression StringLiteral job
set job name SimpleName MethodInvocation InfixExpression SimpleName task id
role StringLiteral InfixExpression SimpleName task id
identity SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName set role
set role SimpleName MethodInvocation InfixExpression StringLiteral role
set role SimpleName MethodInvocation InfixExpression SimpleName task id
user StringLiteral InfixExpression SimpleName task id
set role SimpleName MethodInvocation MethodInvocation SimpleName set user
role StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName set user
task id SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName set user
set role SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral user
set role SimpleName MethodInvocation MethodInvocation InfixExpression SimpleName task id
set user SimpleName MethodInvocation InfixExpression StringLiteral user
set user SimpleName MethodInvocation InfixExpression SimpleName task id
set job name SimpleName MethodInvocation MethodInvocation SimpleName set owner
job StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName set owner
task id SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName set owner
set job name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName set user
set owner SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName set role
set owner SimpleName MethodInvocation MethodInvocation SimpleName set user
set owner SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral user
set owner SimpleName MethodInvocation MethodInvocation InfixExpression SimpleName task id
env StringLiteral InfixExpression SimpleName task id
set job name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName set environment
set owner SimpleName MethodInvocation MethodInvocation SimpleName set environment
set user SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName set environment
set owner SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral env
set owner SimpleName MethodInvocation MethodInvocation InfixExpression SimpleName task id
set environment SimpleName MethodInvocation InfixExpression StringLiteral env
set environment SimpleName MethodInvocation InfixExpression SimpleName task id
set instance id SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName set task
empty NumberLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName set task
set task id SimpleName MethodInvocation MethodInvocation SimpleName set task
task id SimpleName MethodInvocation MethodInvocation SimpleName set task
set task id SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName set environment
task id SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName set environment
set task SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName set owner
set task SimpleName MethodInvocation MethodInvocation SimpleName set environment
set task SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral env
set task SimpleName MethodInvocation MethodInvocation InfixExpression SimpleName task id
scheduled task SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName set assigned task
set assigned task SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName set task id
set assigned task SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName task id
set assigned task SimpleName MethodInvocation MethodInvocation SimpleName set task
set assigned task SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName set environment
i scheduled task SimpleName MethodInvocation SimpleName build
i scheduled task SimpleName MethodInvocation MethodInvocation SimpleName set assigned task
i scheduled task SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName set task
build SimpleName MethodInvocation MethodInvocation SimpleName set assigned task
build SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName set task
private Modifier MethodDeclaration SimpleType SimpleName i scheduled task
private Modifier MethodDeclaration SimpleName make task
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName task id
i scheduled task SimpleName SimpleType MethodDeclaration SimpleName make task
i scheduled task SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName task id
make task SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName string
make task SimpleName MethodDeclaration SingleVariableDeclaration SimpleName task id
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName i scheduled task
public Modifier TypeDeclaration MethodDeclaration SimpleName make task
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName task id
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName i scheduled task
test SimpleName TypeDeclaration MethodDeclaration SimpleName make task
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName task id
