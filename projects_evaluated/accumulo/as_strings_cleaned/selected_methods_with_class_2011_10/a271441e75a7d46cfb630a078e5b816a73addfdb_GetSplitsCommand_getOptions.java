opts SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName options
options SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName opts
option SimpleName SimpleType ClassInstanceCreation StringLiteral o
option SimpleName SimpleType ClassInstanceCreation StringLiteral output
option SimpleName SimpleType ClassInstanceCreation BooleanLiteral true
option SimpleName SimpleType ClassInstanceCreation StringLiteral specifies a local file to write the splits to
o StringLiteral ClassInstanceCreation StringLiteral output
o StringLiteral ClassInstanceCreation BooleanLiteral true
o StringLiteral ClassInstanceCreation StringLiteral specifies a local file to write the splits to
output StringLiteral ClassInstanceCreation BooleanLiteral true
output StringLiteral ClassInstanceCreation StringLiteral specifies a local file to write the splits to
true BooleanLiteral ClassInstanceCreation StringLiteral specifies a local file to write the splits to
output file opt SimpleName Assignment ClassInstanceCreation SimpleType SimpleName option
output file opt SimpleName Assignment ClassInstanceCreation StringLiteral o
output file opt SimpleName Assignment ClassInstanceCreation StringLiteral output
output file opt SimpleName Assignment ClassInstanceCreation BooleanLiteral true
output file opt SimpleName Assignment ClassInstanceCreation StringLiteral specifies a local file to write the splits to
output file opt SimpleName MethodInvocation SimpleName set arg name
output file opt SimpleName MethodInvocation StringLiteral file
set arg name SimpleName MethodInvocation StringLiteral file
option SimpleName SimpleType ClassInstanceCreation StringLiteral m
option SimpleName SimpleType ClassInstanceCreation StringLiteral max
option SimpleName SimpleType ClassInstanceCreation BooleanLiteral true
option SimpleName SimpleType ClassInstanceCreation StringLiteral specifies the maximum number of splits to create
m StringLiteral ClassInstanceCreation StringLiteral max
m StringLiteral ClassInstanceCreation BooleanLiteral true
m StringLiteral ClassInstanceCreation StringLiteral specifies the maximum number of splits to create
max StringLiteral ClassInstanceCreation BooleanLiteral true
max StringLiteral ClassInstanceCreation StringLiteral specifies the maximum number of splits to create
true BooleanLiteral ClassInstanceCreation StringLiteral specifies the maximum number of splits to create
max splits opt SimpleName Assignment ClassInstanceCreation SimpleType SimpleName option
max splits opt SimpleName Assignment ClassInstanceCreation StringLiteral m
max splits opt SimpleName Assignment ClassInstanceCreation StringLiteral max
max splits opt SimpleName Assignment ClassInstanceCreation BooleanLiteral true
max splits opt SimpleName Assignment ClassInstanceCreation StringLiteral specifies the maximum number of splits to create
max splits opt SimpleName MethodInvocation SimpleName set arg name
max splits opt SimpleName MethodInvocation StringLiteral num
set arg name SimpleName MethodInvocation StringLiteral num
option SimpleName SimpleType ClassInstanceCreation StringLiteral b
option SimpleName SimpleType ClassInstanceCreation StringLiteral base encoded
option SimpleName SimpleType ClassInstanceCreation BooleanLiteral false
option SimpleName SimpleType ClassInstanceCreation StringLiteral encode the split points
b StringLiteral ClassInstanceCreation StringLiteral base encoded
b StringLiteral ClassInstanceCreation BooleanLiteral false
b StringLiteral ClassInstanceCreation StringLiteral encode the split points
base encoded StringLiteral ClassInstanceCreation BooleanLiteral false
base encoded StringLiteral ClassInstanceCreation StringLiteral encode the split points
false BooleanLiteral ClassInstanceCreation StringLiteral encode the split points
base opt SimpleName Assignment ClassInstanceCreation SimpleType SimpleName option
base opt SimpleName Assignment ClassInstanceCreation StringLiteral b
base opt SimpleName Assignment ClassInstanceCreation StringLiteral base encoded
base opt SimpleName Assignment ClassInstanceCreation BooleanLiteral false
base opt SimpleName Assignment ClassInstanceCreation StringLiteral encode the split points
option SimpleName SimpleType ClassInstanceCreation StringLiteral v
option SimpleName SimpleType ClassInstanceCreation StringLiteral verbose
option SimpleName SimpleType ClassInstanceCreation BooleanLiteral false
option SimpleName SimpleType ClassInstanceCreation StringLiteral print out the tablet information with startend rows
v StringLiteral ClassInstanceCreation StringLiteral verbose
v StringLiteral ClassInstanceCreation BooleanLiteral false
v StringLiteral ClassInstanceCreation StringLiteral print out the tablet information with startend rows
verbose StringLiteral ClassInstanceCreation BooleanLiteral false
verbose StringLiteral ClassInstanceCreation StringLiteral print out the tablet information with startend rows
false BooleanLiteral ClassInstanceCreation StringLiteral print out the tablet information with startend rows
verbose opt SimpleName Assignment ClassInstanceCreation SimpleType SimpleName option
verbose opt SimpleName Assignment ClassInstanceCreation StringLiteral v
verbose opt SimpleName Assignment ClassInstanceCreation StringLiteral verbose
verbose opt SimpleName Assignment ClassInstanceCreation BooleanLiteral false
verbose opt SimpleName Assignment ClassInstanceCreation StringLiteral print out the tablet information with startend rows
option SimpleName SimpleType ClassInstanceCreation QualifiedName shelltable option
option SimpleName SimpleType ClassInstanceCreation StringLiteral table name
option SimpleName SimpleType ClassInstanceCreation BooleanLiteral true
option SimpleName SimpleType ClassInstanceCreation StringLiteral table to get splits on
shelltable option QualifiedName ClassInstanceCreation StringLiteral table name
shelltable option QualifiedName ClassInstanceCreation BooleanLiteral true
shelltable option QualifiedName ClassInstanceCreation StringLiteral table to get splits on
table name StringLiteral ClassInstanceCreation BooleanLiteral true
table name StringLiteral ClassInstanceCreation StringLiteral table to get splits on
true BooleanLiteral ClassInstanceCreation StringLiteral table to get splits on
table opt SimpleName Assignment ClassInstanceCreation SimpleType SimpleName option
table opt SimpleName Assignment ClassInstanceCreation QualifiedName shelltable option
table opt SimpleName Assignment ClassInstanceCreation StringLiteral table name
table opt SimpleName Assignment ClassInstanceCreation BooleanLiteral true
table opt SimpleName Assignment ClassInstanceCreation StringLiteral table to get splits on
table opt SimpleName MethodInvocation SimpleName set arg name
table opt SimpleName MethodInvocation StringLiteral table
set arg name SimpleName MethodInvocation StringLiteral table
table opt SimpleName MethodInvocation SimpleName set required
table opt SimpleName MethodInvocation BooleanLiteral false
set required SimpleName MethodInvocation BooleanLiteral false
opts SimpleName MethodInvocation SimpleName add option
opts SimpleName MethodInvocation SimpleName output file opt
add option SimpleName MethodInvocation SimpleName output file opt
opts SimpleName MethodInvocation SimpleName add option
opts SimpleName MethodInvocation SimpleName max splits opt
add option SimpleName MethodInvocation SimpleName max splits opt
opts SimpleName MethodInvocation SimpleName add option
opts SimpleName MethodInvocation SimpleName base opt
add option SimpleName MethodInvocation SimpleName base opt
opts SimpleName MethodInvocation SimpleName add option
opts SimpleName MethodInvocation SimpleName verbose opt
add option SimpleName MethodInvocation SimpleName verbose opt
opts SimpleName MethodInvocation SimpleName add option
opts SimpleName MethodInvocation SimpleName table opt
add option SimpleName MethodInvocation SimpleName table opt
override SimpleName MarkerAnnotation MethodDeclaration Modifier public
override SimpleName MarkerAnnotation MethodDeclaration SimpleType SimpleName options
override SimpleName MarkerAnnotation MethodDeclaration SimpleName get options
public Modifier MethodDeclaration SimpleType SimpleName options
public Modifier MethodDeclaration SimpleName get options
public Modifier MethodDeclaration Block ReturnStatement SimpleName opts
options SimpleName SimpleType MethodDeclaration SimpleName get options
get options SimpleName MethodDeclaration Block ReturnStatement SimpleName opts
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName override
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName options
public Modifier TypeDeclaration MethodDeclaration SimpleName get options
test SimpleName TypeDeclaration MethodDeclaration MarkerAnnotation SimpleName override
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName options
test SimpleName TypeDeclaration MethodDeclaration SimpleName get options
