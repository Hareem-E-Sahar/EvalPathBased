atlas vertex SimpleName SimpleType SingleVariableDeclaration SimpleName vertex
atlas base type def SimpleName SimpleType SingleVariableDeclaration SimpleName type def
vertex SimpleName MethodInvocation SimpleName get property
vertex SimpleName MethodInvocation QualifiedName constantstypename property key
vertex SimpleName MethodInvocation TypeLiteral SimpleType SimpleName string
get property SimpleName MethodInvocation QualifiedName constantstypename property key
get property SimpleName MethodInvocation TypeLiteral SimpleType SimpleName string
constantstypename property key QualifiedName MethodInvocation TypeLiteral SimpleType SimpleName string
name SimpleName VariableDeclarationFragment MethodInvocation SimpleName vertex
name SimpleName VariableDeclarationFragment MethodInvocation SimpleName get property
name SimpleName VariableDeclarationFragment MethodInvocation QualifiedName constantstypename property key
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName name
vertex SimpleName MethodInvocation SimpleName get property
vertex SimpleName MethodInvocation QualifiedName constantstypedescription property key
vertex SimpleName MethodInvocation TypeLiteral SimpleType SimpleName string
get property SimpleName MethodInvocation QualifiedName constantstypedescription property key
get property SimpleName MethodInvocation TypeLiteral SimpleType SimpleName string
constantstypedescription property key QualifiedName MethodInvocation TypeLiteral SimpleType SimpleName string
description SimpleName VariableDeclarationFragment MethodInvocation SimpleName vertex
description SimpleName VariableDeclarationFragment MethodInvocation SimpleName get property
description SimpleName VariableDeclarationFragment MethodInvocation QualifiedName constantstypedescription property key
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName description
vertex SimpleName MethodInvocation SimpleName get property
vertex SimpleName MethodInvocation QualifiedName constantstypeversion property key
vertex SimpleName MethodInvocation TypeLiteral SimpleType SimpleName string
get property SimpleName MethodInvocation QualifiedName constantstypeversion property key
get property SimpleName MethodInvocation TypeLiteral SimpleType SimpleName string
constantstypeversion property key QualifiedName MethodInvocation TypeLiteral SimpleType SimpleName string
type version SimpleName VariableDeclarationFragment MethodInvocation SimpleName vertex
type version SimpleName VariableDeclarationFragment MethodInvocation SimpleName get property
type version SimpleName VariableDeclarationFragment MethodInvocation QualifiedName constantstypeversion property key
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName type version
vertex SimpleName MethodInvocation SimpleName get property
vertex SimpleName MethodInvocation QualifiedName constantsguid property key
vertex SimpleName MethodInvocation TypeLiteral SimpleType SimpleName string
get property SimpleName MethodInvocation QualifiedName constantsguid property key
get property SimpleName MethodInvocation TypeLiteral SimpleType SimpleName string
constantsguid property key QualifiedName MethodInvocation TypeLiteral SimpleType SimpleName string
guid SimpleName VariableDeclarationFragment MethodInvocation SimpleName vertex
guid SimpleName VariableDeclarationFragment MethodInvocation SimpleName get property
guid SimpleName VariableDeclarationFragment MethodInvocation QualifiedName constantsguid property key
string SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName guid
vertex SimpleName MethodInvocation SimpleName get property
vertex SimpleName MethodInvocation QualifiedName constantstimestamp property key
vertex SimpleName MethodInvocation TypeLiteral SimpleType SimpleName long
get property SimpleName MethodInvocation QualifiedName constantstimestamp property key
get property SimpleName MethodInvocation TypeLiteral SimpleType SimpleName long
constantstimestamp property key QualifiedName MethodInvocation TypeLiteral SimpleType SimpleName long
create time SimpleName VariableDeclarationFragment MethodInvocation SimpleName vertex
create time SimpleName VariableDeclarationFragment MethodInvocation SimpleName get property
create time SimpleName VariableDeclarationFragment MethodInvocation QualifiedName constantstimestamp property key
long SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName create time
vertex SimpleName MethodInvocation SimpleName get property
vertex SimpleName MethodInvocation QualifiedName constantsmodification timestamp property key
vertex SimpleName MethodInvocation TypeLiteral SimpleType SimpleName long
get property SimpleName MethodInvocation QualifiedName constantsmodification timestamp property key
get property SimpleName MethodInvocation TypeLiteral SimpleType SimpleName long
constantsmodification timestamp property key QualifiedName MethodInvocation TypeLiteral SimpleType SimpleName long
update time SimpleName VariableDeclarationFragment MethodInvocation SimpleName vertex
update time SimpleName VariableDeclarationFragment MethodInvocation SimpleName get property
update time SimpleName VariableDeclarationFragment MethodInvocation QualifiedName constantsmodification timestamp property key
long SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName update time
vertex SimpleName MethodInvocation SimpleName get property
vertex SimpleName MethodInvocation QualifiedName constantsversion property key
vertex SimpleName MethodInvocation TypeLiteral SimpleType SimpleName long
get property SimpleName MethodInvocation QualifiedName constantsversion property key
get property SimpleName MethodInvocation TypeLiteral SimpleType SimpleName long
constantsversion property key QualifiedName MethodInvocation TypeLiteral SimpleType SimpleName long
version SimpleName VariableDeclarationFragment MethodInvocation SimpleName vertex
version SimpleName VariableDeclarationFragment MethodInvocation SimpleName get property
version SimpleName VariableDeclarationFragment MethodInvocation QualifiedName constantsversion property key
long SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName version
type def SimpleName MethodInvocation SimpleName set name
type def SimpleName MethodInvocation SimpleName name
set name SimpleName MethodInvocation SimpleName name
type def SimpleName MethodInvocation SimpleName set description
type def SimpleName MethodInvocation SimpleName description
set description SimpleName MethodInvocation SimpleName description
type def SimpleName MethodInvocation SimpleName set type version
type def SimpleName MethodInvocation SimpleName type version
set type version SimpleName MethodInvocation SimpleName type version
type def SimpleName MethodInvocation SimpleName set guid
type def SimpleName MethodInvocation SimpleName guid
set guid SimpleName MethodInvocation SimpleName guid
date SimpleName SimpleType ClassInstanceCreation SimpleName create time
type def SimpleName MethodInvocation SimpleName set create time
type def SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName date
type def SimpleName MethodInvocation ClassInstanceCreation SimpleName create time
set create time SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName date
set create time SimpleName MethodInvocation ClassInstanceCreation SimpleName create time
date SimpleName SimpleType ClassInstanceCreation SimpleName update time
type def SimpleName MethodInvocation SimpleName set update time
type def SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName date
type def SimpleName MethodInvocation ClassInstanceCreation SimpleName update time
set update time SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName date
set update time SimpleName MethodInvocation ClassInstanceCreation SimpleName update time
type def SimpleName MethodInvocation SimpleName set version
type def SimpleName MethodInvocation SimpleName version
set version SimpleName MethodInvocation SimpleName version
public Modifier MethodDeclaration PrimitiveType void
public Modifier MethodDeclaration SimpleName vertex to type def
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName atlas vertex
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName vertex
public Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName atlas base type def
public Modifier MethodDeclaration SingleVariableDeclaration SimpleName type def
void PrimitiveType MethodDeclaration SimpleName vertex to type def
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName atlas vertex
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName vertex
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName atlas base type def
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName type def
vertex to type def SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName atlas vertex
vertex to type def SimpleName MethodDeclaration SingleVariableDeclaration SimpleName vertex
vertex to type def SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName atlas base type def
vertex to type def SimpleName MethodDeclaration SingleVariableDeclaration SimpleName type def
vertex SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName type def
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName vertex to type def
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName vertex
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName type def
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName vertex to type def
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName vertex
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName type def
