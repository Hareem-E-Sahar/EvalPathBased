task config SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName set num cpus
task config SimpleName SimpleType ClassInstanceCreation MethodInvocation NumberLiteral .
set num cpus SimpleName MethodInvocation NumberLiteral .
set num cpus SimpleName MethodInvocation MethodInvocation SimpleName set ram mb
. NumberLiteral MethodInvocation MethodInvocation SimpleName set ram mb
set num cpus SimpleName MethodInvocation MethodInvocation NumberLiteral empty
. NumberLiteral MethodInvocation MethodInvocation NumberLiteral empty
set ram mb SimpleName MethodInvocation NumberLiteral empty
set num cpus SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName set disk mb
. NumberLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName set disk mb
set ram mb SimpleName MethodInvocation MethodInvocation SimpleName set disk mb
empty NumberLiteral MethodInvocation MethodInvocation SimpleName set disk mb
set num cpus SimpleName MethodInvocation MethodInvocation MethodInvocation NumberLiteral empty
. NumberLiteral MethodInvocation MethodInvocation MethodInvocation NumberLiteral empty
set ram mb SimpleName MethodInvocation MethodInvocation NumberLiteral empty
empty NumberLiteral MethodInvocation MethodInvocation NumberLiteral empty
set disk mb SimpleName MethodInvocation NumberLiteral empty
config SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName set ram mb
config SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation NumberLiteral empty
config SimpleName VariableDeclarationFragment MethodInvocation SimpleName set disk mb
config SimpleName VariableDeclarationFragment MethodInvocation NumberLiteral empty
task config SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName config
config SimpleName MethodInvocation SimpleName deep copy
num cpus SimpleName MethodInvocation NumberLiteral .
ram mb SimpleName MethodInvocation NumberLiteral empty
disk mb SimpleName MethodInvocation NumberLiteral empty
immutable set SimpleName MethodInvocation SimpleName of
immutable set SimpleName MethodInvocation MethodInvocation SimpleName num cpus
immutable set SimpleName MethodInvocation MethodInvocation NumberLiteral .
immutable set SimpleName MethodInvocation MethodInvocation SimpleName ram mb
immutable set SimpleName MethodInvocation MethodInvocation NumberLiteral empty
immutable set SimpleName MethodInvocation MethodInvocation SimpleName disk mb
immutable set SimpleName MethodInvocation MethodInvocation NumberLiteral empty
of SimpleName MethodInvocation MethodInvocation SimpleName num cpus
of SimpleName MethodInvocation MethodInvocation NumberLiteral .
of SimpleName MethodInvocation MethodInvocation SimpleName ram mb
of SimpleName MethodInvocation MethodInvocation NumberLiteral empty
of SimpleName MethodInvocation MethodInvocation SimpleName disk mb
of SimpleName MethodInvocation MethodInvocation NumberLiteral empty
num cpus SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName ram mb
num cpus SimpleName MethodInvocation MethodInvocation MethodInvocation NumberLiteral empty
. NumberLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName ram mb
. NumberLiteral MethodInvocation MethodInvocation MethodInvocation NumberLiteral empty
num cpus SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName disk mb
num cpus SimpleName MethodInvocation MethodInvocation MethodInvocation NumberLiteral empty
. NumberLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName disk mb
. NumberLiteral MethodInvocation MethodInvocation MethodInvocation NumberLiteral empty
ram mb SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName disk mb
ram mb SimpleName MethodInvocation MethodInvocation MethodInvocation NumberLiteral empty
empty NumberLiteral MethodInvocation MethodInvocation MethodInvocation SimpleName disk mb
empty NumberLiteral MethodInvocation MethodInvocation MethodInvocation NumberLiteral empty
config SimpleName MethodInvocation MethodInvocation SimpleName set resources
deep copy SimpleName MethodInvocation MethodInvocation SimpleName set resources
config SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName immutable set
config SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName of
deep copy SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName immutable set
deep copy SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName of
set resources SimpleName MethodInvocation MethodInvocation SimpleName immutable set
set resources SimpleName MethodInvocation MethodInvocation SimpleName of
set resources SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName num cpus
set resources SimpleName MethodInvocation MethodInvocation MethodInvocation NumberLiteral .
set resources SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName ram mb
set resources SimpleName MethodInvocation MethodInvocation MethodInvocation NumberLiteral empty
set resources SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName disk mb
set resources SimpleName MethodInvocation MethodInvocation MethodInvocation NumberLiteral empty
config with backfilled resources SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName config
config with backfilled resources SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName deep copy
config with backfilled resources SimpleName VariableDeclarationFragment MethodInvocation SimpleName set resources
config with backfilled resources SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName immutable set
config with backfilled resources SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName of
task config SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName config with backfilled resources
tier manager SimpleName MethodInvocation SimpleName get tiers
expect SimpleName MethodInvocation MethodInvocation SimpleName tier manager
expect SimpleName MethodInvocation MethodInvocation SimpleName get tiers
task test util SimpleName MethodInvocation SimpleName tier infos
expect SimpleName MethodInvocation MethodInvocation SimpleName and return
tier manager SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName and return
get tiers SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName and return
expect SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName task test util
expect SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName tier infos
and return SimpleName MethodInvocation MethodInvocation SimpleName task test util
and return SimpleName MethodInvocation MethodInvocation SimpleName tier infos
control SimpleName MethodInvocation SimpleName replay
config with backfilled resources SimpleName MethodInvocation SimpleName deep copy
config with backfilled resources SimpleName MethodInvocation MethodInvocation SimpleName set tier
deep copy SimpleName MethodInvocation MethodInvocation SimpleName set tier
config with backfilled resources SimpleName MethodInvocation MethodInvocation StringLiteral preemptible
deep copy SimpleName MethodInvocation MethodInvocation StringLiteral preemptible
set tier SimpleName MethodInvocation StringLiteral preemptible
expected SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName config with backfilled resources
expected SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName deep copy
expected SimpleName VariableDeclarationFragment MethodInvocation SimpleName set tier
expected SimpleName VariableDeclarationFragment MethodInvocation StringLiteral preemptible
task config SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName expected
thrift backfill SimpleName MethodInvocation SimpleName backfill task
thrift backfill SimpleName MethodInvocation SimpleName config
backfill task SimpleName MethodInvocation SimpleName config
assert equals SimpleName MethodInvocation SimpleName expected
assert equals SimpleName MethodInvocation MethodInvocation SimpleName thrift backfill
assert equals SimpleName MethodInvocation MethodInvocation SimpleName backfill task
assert equals SimpleName MethodInvocation MethodInvocation SimpleName config
expected SimpleName MethodInvocation MethodInvocation SimpleName thrift backfill
expected SimpleName MethodInvocation MethodInvocation SimpleName backfill task
expected SimpleName MethodInvocation MethodInvocation SimpleName config
test SimpleName MarkerAnnotation MethodDeclaration Modifier public
test SimpleName MarkerAnnotation MethodDeclaration PrimitiveType void
test SimpleName MarkerAnnotation MethodDeclaration SimpleName test backfill tier sets tier to preemptible
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName test backfill tier sets tier to preemptible
void PrimitiveType MethodDeclaration SimpleName test backfill tier sets tier to preemptible
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName test backfill tier sets tier to preemptible
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName test
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName test backfill tier sets tier to preemptible
