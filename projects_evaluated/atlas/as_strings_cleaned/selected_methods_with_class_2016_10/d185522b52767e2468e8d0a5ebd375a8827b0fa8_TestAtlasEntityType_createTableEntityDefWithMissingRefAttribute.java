atlas entity def SimpleName SimpleType ClassInstanceCreation StringLiteral my table
table SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName atlas entity def
table SimpleName VariableDeclarationFragment ClassInstanceCreation StringLiteral my table
atlas entity def SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName table
atlas base type def SimpleName MethodInvocation SimpleName get array type name
atlas base type def SimpleName MethodInvocation StringLiteral my column
get array type name SimpleName MethodInvocation StringLiteral my column
atlas attribute def SimpleName SimpleType ClassInstanceCreation StringLiteral columns
atlas attribute def SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName atlas base type def
atlas attribute def SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName get array type name
atlas attribute def SimpleName SimpleType ClassInstanceCreation MethodInvocation StringLiteral my column
columns StringLiteral ClassInstanceCreation MethodInvocation SimpleName atlas base type def
columns StringLiteral ClassInstanceCreation MethodInvocation SimpleName get array type name
columns StringLiteral ClassInstanceCreation MethodInvocation StringLiteral my column
attr columns SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName atlas attribute def
attr columns SimpleName VariableDeclarationFragment ClassInstanceCreation StringLiteral columns
attr columns SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName atlas base type def
attr columns SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation SimpleName get array type name
attr columns SimpleName VariableDeclarationFragment ClassInstanceCreation MethodInvocation StringLiteral my column
atlas attribute def SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName attr columns
atlas constraint def SimpleName SimpleType ClassInstanceCreation QualifiedName atlas constraint defconstraint type mapped from ref
attr columns SimpleName MethodInvocation SimpleName add constraint
attr columns SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName atlas constraint def
attr columns SimpleName MethodInvocation ClassInstanceCreation QualifiedName atlas constraint defconstraint type mapped from ref
add constraint SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName atlas constraint def
add constraint SimpleName MethodInvocation ClassInstanceCreation QualifiedName atlas constraint defconstraint type mapped from ref
table SimpleName MethodInvocation SimpleName add attribute
table SimpleName MethodInvocation SimpleName attr columns
add attribute SimpleName MethodInvocation SimpleName attr columns
private Modifier MethodDeclaration SimpleType SimpleName atlas entity def
private Modifier MethodDeclaration SimpleName create table entity def with missing ref attribute
private Modifier MethodDeclaration Block ReturnStatement SimpleName table
atlas entity def SimpleName SimpleType MethodDeclaration SimpleName create table entity def with missing ref attribute
create table entity def with missing ref attribute SimpleName MethodDeclaration Block ReturnStatement SimpleName table
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier private
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName atlas entity def
public Modifier TypeDeclaration MethodDeclaration SimpleName create table entity def with missing ref attribute
test SimpleName TypeDeclaration MethodDeclaration Modifier private
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName atlas entity def
test SimpleName TypeDeclaration MethodDeclaration SimpleName create table entity def with missing ref attribute
