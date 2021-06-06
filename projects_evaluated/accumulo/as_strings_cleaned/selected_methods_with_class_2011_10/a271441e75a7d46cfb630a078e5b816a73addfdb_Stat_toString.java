string SimpleName MethodInvocation SimpleName format
string SimpleName MethodInvocation StringLiteral d d %. f d
string SimpleName MethodInvocation MethodInvocation SimpleName get min
string SimpleName MethodInvocation MethodInvocation SimpleName get max
string SimpleName MethodInvocation MethodInvocation SimpleName get average
format SimpleName MethodInvocation StringLiteral d d %. f d
format SimpleName MethodInvocation MethodInvocation SimpleName get min
format SimpleName MethodInvocation MethodInvocation SimpleName get max
format SimpleName MethodInvocation MethodInvocation SimpleName get average
format SimpleName MethodInvocation SimpleName count
d d %. f d StringLiteral MethodInvocation MethodInvocation SimpleName get min
d d %. f d StringLiteral MethodInvocation MethodInvocation SimpleName get max
d d %. f d StringLiteral MethodInvocation MethodInvocation SimpleName get average
d d %. f d StringLiteral MethodInvocation SimpleName count
get min SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get max
get min SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get average
get min SimpleName MethodInvocation MethodInvocation SimpleName count
get max SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get average
get max SimpleName MethodInvocation MethodInvocation SimpleName count
get average SimpleName MethodInvocation MethodInvocation SimpleName count
public Modifier MethodDeclaration SimpleType SimpleName string
public Modifier MethodDeclaration SimpleName to string
string SimpleName SimpleType MethodDeclaration SimpleName to string
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName string
public Modifier TypeDeclaration MethodDeclaration SimpleName to string
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName string
test SimpleName TypeDeclaration MethodDeclaration SimpleName to string
