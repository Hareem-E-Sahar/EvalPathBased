id SimpleName SimpleType SingleVariableDeclaration SimpleName db id
referenceable SimpleName SimpleType ClassInstanceCreation QualifiedName test utilstable type
entity SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName referenceable
entity SimpleName VariableDeclarationFragment ClassInstanceCreation QualifiedName test utilstable type
referenceable SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName entity
random string utils SimpleName MethodInvocation SimpleName random alphanumeric
random string utils SimpleName MethodInvocation NumberLiteral empty
random alphanumeric SimpleName MethodInvocation NumberLiteral empty
table name SimpleName VariableDeclarationFragment MethodInvocation SimpleName random string utils
table name SimpleName VariableDeclarationFragment MethodInvocation SimpleName random alphanumeric
table name SimpleName VariableDeclarationFragment MethodInvocation NumberLiteral empty
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table name
entity SimpleName MethodInvocation SimpleName set
entity SimpleName MethodInvocation StringLiteral name
entity SimpleName MethodInvocation SimpleName table name
set SimpleName MethodInvocation StringLiteral name
set SimpleName MethodInvocation SimpleName table name
name StringLiteral MethodInvocation SimpleName table name
entity SimpleName MethodInvocation SimpleName set
entity SimpleName MethodInvocation StringLiteral description
entity SimpleName MethodInvocation StringLiteral random table
set SimpleName MethodInvocation StringLiteral description
set SimpleName MethodInvocation StringLiteral random table
description StringLiteral MethodInvocation StringLiteral random table
entity SimpleName MethodInvocation SimpleName set
entity SimpleName MethodInvocation StringLiteral type
entity SimpleName MethodInvocation StringLiteral type
set SimpleName MethodInvocation StringLiteral type
set SimpleName MethodInvocation StringLiteral type
type StringLiteral MethodInvocation StringLiteral type
entity SimpleName MethodInvocation SimpleName set
entity SimpleName MethodInvocation StringLiteral table type
entity SimpleName MethodInvocation StringLiteral managed
set SimpleName MethodInvocation StringLiteral table type
set SimpleName MethodInvocation StringLiteral managed
table type StringLiteral MethodInvocation StringLiteral managed
entity SimpleName MethodInvocation SimpleName set
entity SimpleName MethodInvocation StringLiteral database
entity SimpleName MethodInvocation SimpleName db id
set SimpleName MethodInvocation StringLiteral database
set SimpleName MethodInvocation SimpleName db id
database StringLiteral MethodInvocation SimpleName db id
entity SimpleName MethodInvocation SimpleName set
entity SimpleName MethodInvocation StringLiteral created
entity SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName date
set SimpleName MethodInvocation StringLiteral created
set SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName date
created StringLiteral MethodInvocation ClassInstanceCreation SimpleType SimpleName date
private Modifier MethodDeclaration SimpleType SimpleName referenceable
private Modifier MethodDeclaration SimpleName create table entity
private Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName id
private Modifier MethodDeclaration SingleVariableDeclaration SimpleName db id
private Modifier MethodDeclaration Block ReturnStatement SimpleName entity
referenceable SimpleName SimpleType MethodDeclaration SimpleName create table entity
referenceable SimpleName SimpleType MethodDeclaration SingleVariableDeclaration SimpleName db id
create table entity SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName id
create table entity SimpleName MethodDeclaration SingleVariableDeclaration SimpleName db id
create table entity SimpleName MethodDeclaration Block ReturnStatement SimpleName entity
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName referenceable
public Modifier TypeDeclaration MethodDeclaration SimpleName create table entity
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName db id
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName referenceable
test SimpleName TypeDeclaration MethodDeclaration SimpleName create table entity
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName db id
