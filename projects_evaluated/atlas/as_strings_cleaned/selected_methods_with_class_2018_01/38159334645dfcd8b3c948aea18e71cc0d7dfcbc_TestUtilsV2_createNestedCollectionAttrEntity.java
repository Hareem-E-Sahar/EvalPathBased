atlas entity SimpleName SimpleType ClassInstanceCreation SimpleName entity type with nested collection attr
entity SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName atlas entity
entity SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleName entity type with nested collection attr
atlas entity SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName entity
one StringLiteral ArrayInitializer StringLiteral two
one StringLiteral ArrayInitializer StringLiteral three
two StringLiteral ArrayInitializer StringLiteral three
array of strings SimpleName VariableDeclarationFragment ArrayCreation ArrayInitializer StringLiteral one
array of strings SimpleName VariableDeclarationFragment ArrayCreation ArrayInitializer StringLiteral two
array of strings SimpleName VariableDeclarationFragment ArrayCreation ArrayInitializer StringLiteral three
false BooleanLiteral ArrayInitializer BooleanLiteral true
boolean PrimitiveType ArrayType ArrayCreation ArrayInitializer BooleanLiteral false
boolean PrimitiveType ArrayType ArrayCreation ArrayInitializer BooleanLiteral true
array of booleans SimpleName VariableDeclarationFragment ArrayCreation ArrayType PrimitiveType boolean
array of booleans SimpleName VariableDeclarationFragment ArrayCreation ArrayInitializer BooleanLiteral false
array of booleans SimpleName VariableDeclarationFragment ArrayCreation ArrayInitializer BooleanLiteral true
boolean PrimitiveType ArrayType VariableDeclarationStatement VariableDeclarationFragment SimpleName array of booleans
empty NumberLiteral ArrayInitializer NumberLiteral empty
empty NumberLiteral ArrayInitializer NumberLiteral empty
empty NumberLiteral ArrayInitializer NumberLiteral empty
int PrimitiveType ArrayType ArrayCreation ArrayInitializer NumberLiteral empty
int PrimitiveType ArrayType ArrayCreation ArrayInitializer NumberLiteral empty
int PrimitiveType ArrayType ArrayCreation ArrayInitializer NumberLiteral empty
array of ints SimpleName VariableDeclarationFragment ArrayCreation ArrayType PrimitiveType int
array of ints SimpleName VariableDeclarationFragment ArrayCreation ArrayInitializer NumberLiteral empty
array of ints SimpleName VariableDeclarationFragment ArrayCreation ArrayInitializer NumberLiteral empty
array of ints SimpleName VariableDeclarationFragment ArrayCreation ArrayInitializer NumberLiteral empty
int PrimitiveType ArrayType VariableDeclarationStatement VariableDeclarationFragment SimpleName array of ints
. f NumberLiteral ArrayInitializer NumberLiteral . f
. f NumberLiteral ArrayInitializer NumberLiteral . f
. f NumberLiteral ArrayInitializer NumberLiteral . f
float PrimitiveType ArrayType ArrayCreation ArrayInitializer NumberLiteral . f
float PrimitiveType ArrayType ArrayCreation ArrayInitializer NumberLiteral . f
float PrimitiveType ArrayType ArrayCreation ArrayInitializer NumberLiteral . f
array of floats SimpleName VariableDeclarationFragment ArrayCreation ArrayType PrimitiveType float
array of floats SimpleName VariableDeclarationFragment ArrayCreation ArrayInitializer NumberLiteral . f
array of floats SimpleName VariableDeclarationFragment ArrayCreation ArrayInitializer NumberLiteral . f
array of floats SimpleName VariableDeclarationFragment ArrayCreation ArrayInitializer NumberLiteral . f
float PrimitiveType ArrayType VariableDeclarationStatement VariableDeclarationFragment SimpleName array of floats
map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
string SimpleName SimpleType ParameterizedType SimpleType SimpleName string
collections SimpleName MethodInvocation SimpleName singleton map
collections SimpleName MethodInvocation StringLiteral one
collections SimpleName MethodInvocation StringLiteral one
singleton map SimpleName MethodInvocation StringLiteral one
singleton map SimpleName MethodInvocation StringLiteral one
one StringLiteral MethodInvocation StringLiteral one
map of strings SimpleName VariableDeclarationFragment MethodInvocation SimpleName collections
map of strings SimpleName VariableDeclarationFragment MethodInvocation SimpleName singleton map
map of strings SimpleName VariableDeclarationFragment MethodInvocation StringLiteral one
map of strings SimpleName VariableDeclarationFragment MethodInvocation StringLiteral one
map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
map SimpleName SimpleType ParameterizedType SimpleType SimpleName boolean
string SimpleName SimpleType ParameterizedType SimpleType SimpleName boolean
collections SimpleName MethodInvocation SimpleName singleton map
collections SimpleName MethodInvocation StringLiteral one
collections SimpleName MethodInvocation BooleanLiteral true
singleton map SimpleName MethodInvocation StringLiteral one
singleton map SimpleName MethodInvocation BooleanLiteral true
one StringLiteral MethodInvocation BooleanLiteral true
map of booleans SimpleName VariableDeclarationFragment MethodInvocation SimpleName collections
map of booleans SimpleName VariableDeclarationFragment MethodInvocation SimpleName singleton map
map of booleans SimpleName VariableDeclarationFragment MethodInvocation StringLiteral one
map of booleans SimpleName VariableDeclarationFragment MethodInvocation BooleanLiteral true
map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
map SimpleName SimpleType ParameterizedType SimpleType SimpleName integer
string SimpleName SimpleType ParameterizedType SimpleType SimpleName integer
collections SimpleName MethodInvocation SimpleName singleton map
collections SimpleName MethodInvocation StringLiteral one
collections SimpleName MethodInvocation NumberLiteral empty
singleton map SimpleName MethodInvocation StringLiteral one
singleton map SimpleName MethodInvocation NumberLiteral empty
one StringLiteral MethodInvocation NumberLiteral empty
map of ints SimpleName VariableDeclarationFragment MethodInvocation SimpleName collections
map of ints SimpleName VariableDeclarationFragment MethodInvocation SimpleName singleton map
map of ints SimpleName VariableDeclarationFragment MethodInvocation StringLiteral one
map of ints SimpleName VariableDeclarationFragment MethodInvocation NumberLiteral empty
map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
map SimpleName SimpleType ParameterizedType SimpleType SimpleName float
string SimpleName SimpleType ParameterizedType SimpleType SimpleName float
collections SimpleName MethodInvocation SimpleName singleton map
collections SimpleName MethodInvocation StringLiteral one
collections SimpleName MethodInvocation NumberLiteral . f
singleton map SimpleName MethodInvocation StringLiteral one
singleton map SimpleName MethodInvocation NumberLiteral . f
one StringLiteral MethodInvocation NumberLiteral . f
map of floats SimpleName VariableDeclarationFragment MethodInvocation SimpleName collections
map of floats SimpleName VariableDeclarationFragment MethodInvocation SimpleName singleton map
map of floats SimpleName VariableDeclarationFragment MethodInvocation StringLiteral one
map of floats SimpleName VariableDeclarationFragment MethodInvocation NumberLiteral . f
map SimpleName SimpleType ParameterizedType SimpleType SimpleName string
map SimpleName SimpleType ParameterizedType SimpleType SimpleName date
string SimpleName SimpleType ParameterizedType SimpleType SimpleName date
collections SimpleName MethodInvocation SimpleName singleton map
collections SimpleName MethodInvocation StringLiteral now
collections SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName date
singleton map SimpleName MethodInvocation StringLiteral now
singleton map SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName date
now StringLiteral MethodInvocation ClassInstanceCreation SimpleType SimpleName date
map of dates SimpleName VariableDeclarationFragment MethodInvocation SimpleName collections
map of dates SimpleName VariableDeclarationFragment MethodInvocation SimpleName singleton map
map of dates SimpleName VariableDeclarationFragment MethodInvocation StringLiteral now
system SimpleName MethodInvocation SimpleName current time millis
random string SimpleName MethodInvocation InfixExpression StringLiteral empty
random string SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName system
random string SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName current time millis
empty StringLiteral InfixExpression MethodInvocation SimpleName system
empty StringLiteral InfixExpression MethodInvocation SimpleName current time millis
entity SimpleName MethodInvocation SimpleName set attribute
entity SimpleName MethodInvocation StringLiteral name
entity SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName random string
entity SimpleName MethodInvocation InfixExpression StringLiteral empty
entity SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName system
entity SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName current time millis
set attribute SimpleName MethodInvocation StringLiteral name
set attribute SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName random string
set attribute SimpleName MethodInvocation InfixExpression StringLiteral empty
set attribute SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName system
set attribute SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName current time millis
name StringLiteral MethodInvocation InfixExpression MethodInvocation SimpleName random string
name StringLiteral MethodInvocation InfixExpression StringLiteral empty
name StringLiteral MethodInvocation InfixExpression MethodInvocation SimpleName system
name StringLiteral MethodInvocation InfixExpression MethodInvocation SimpleName current time millis
collections SimpleName MethodInvocation SimpleName singleton map
collections SimpleName MethodInvocation StringLiteral one
collections SimpleName MethodInvocation SimpleName array of strings
singleton map SimpleName MethodInvocation StringLiteral one
singleton map SimpleName MethodInvocation SimpleName array of strings
one StringLiteral MethodInvocation SimpleName array of strings
entity SimpleName MethodInvocation SimpleName set attribute
entity SimpleName MethodInvocation StringLiteral map of array of strings
entity SimpleName MethodInvocation MethodInvocation SimpleName collections
entity SimpleName MethodInvocation MethodInvocation SimpleName singleton map
entity SimpleName MethodInvocation MethodInvocation StringLiteral one
entity SimpleName MethodInvocation MethodInvocation SimpleName array of strings
set attribute SimpleName MethodInvocation StringLiteral map of array of strings
set attribute SimpleName MethodInvocation MethodInvocation SimpleName collections
set attribute SimpleName MethodInvocation MethodInvocation SimpleName singleton map
set attribute SimpleName MethodInvocation MethodInvocation StringLiteral one
set attribute SimpleName MethodInvocation MethodInvocation SimpleName array of strings
map of array of strings StringLiteral MethodInvocation MethodInvocation SimpleName collections
map of array of strings StringLiteral MethodInvocation MethodInvocation SimpleName singleton map
map of array of strings StringLiteral MethodInvocation MethodInvocation StringLiteral one
map of array of strings StringLiteral MethodInvocation MethodInvocation SimpleName array of strings
collections SimpleName MethodInvocation SimpleName singleton map
collections SimpleName MethodInvocation StringLiteral one
collections SimpleName MethodInvocation SimpleName array of booleans
singleton map SimpleName MethodInvocation StringLiteral one
singleton map SimpleName MethodInvocation SimpleName array of booleans
one StringLiteral MethodInvocation SimpleName array of booleans
entity SimpleName MethodInvocation SimpleName set attribute
entity SimpleName MethodInvocation StringLiteral map of array of booleans
entity SimpleName MethodInvocation MethodInvocation SimpleName collections
entity SimpleName MethodInvocation MethodInvocation SimpleName singleton map
entity SimpleName MethodInvocation MethodInvocation StringLiteral one
entity SimpleName MethodInvocation MethodInvocation SimpleName array of booleans
set attribute SimpleName MethodInvocation StringLiteral map of array of booleans
set attribute SimpleName MethodInvocation MethodInvocation SimpleName collections
set attribute SimpleName MethodInvocation MethodInvocation SimpleName singleton map
set attribute SimpleName MethodInvocation MethodInvocation StringLiteral one
set attribute SimpleName MethodInvocation MethodInvocation SimpleName array of booleans
map of array of booleans StringLiteral MethodInvocation MethodInvocation SimpleName collections
map of array of booleans StringLiteral MethodInvocation MethodInvocation SimpleName singleton map
map of array of booleans StringLiteral MethodInvocation MethodInvocation StringLiteral one
map of array of booleans StringLiteral MethodInvocation MethodInvocation SimpleName array of booleans
collections SimpleName MethodInvocation SimpleName singleton map
collections SimpleName MethodInvocation StringLiteral one
collections SimpleName MethodInvocation SimpleName array of ints
singleton map SimpleName MethodInvocation StringLiteral one
singleton map SimpleName MethodInvocation SimpleName array of ints
one StringLiteral MethodInvocation SimpleName array of ints
entity SimpleName MethodInvocation SimpleName set attribute
entity SimpleName MethodInvocation StringLiteral map of array of ints
entity SimpleName MethodInvocation MethodInvocation SimpleName collections
entity SimpleName MethodInvocation MethodInvocation SimpleName singleton map
entity SimpleName MethodInvocation MethodInvocation StringLiteral one
entity SimpleName MethodInvocation MethodInvocation SimpleName array of ints
set attribute SimpleName MethodInvocation StringLiteral map of array of ints
set attribute SimpleName MethodInvocation MethodInvocation SimpleName collections
set attribute SimpleName MethodInvocation MethodInvocation SimpleName singleton map
set attribute SimpleName MethodInvocation MethodInvocation StringLiteral one
set attribute SimpleName MethodInvocation MethodInvocation SimpleName array of ints
map of array of ints StringLiteral MethodInvocation MethodInvocation SimpleName collections
map of array of ints StringLiteral MethodInvocation MethodInvocation SimpleName singleton map
map of array of ints StringLiteral MethodInvocation MethodInvocation StringLiteral one
map of array of ints StringLiteral MethodInvocation MethodInvocation SimpleName array of ints
collections SimpleName MethodInvocation SimpleName singleton map
collections SimpleName MethodInvocation StringLiteral one
collections SimpleName MethodInvocation SimpleName array of floats
singleton map SimpleName MethodInvocation StringLiteral one
singleton map SimpleName MethodInvocation SimpleName array of floats
one StringLiteral MethodInvocation SimpleName array of floats
entity SimpleName MethodInvocation SimpleName set attribute
entity SimpleName MethodInvocation StringLiteral map of array of floats
entity SimpleName MethodInvocation MethodInvocation SimpleName collections
entity SimpleName MethodInvocation MethodInvocation SimpleName singleton map
entity SimpleName MethodInvocation MethodInvocation StringLiteral one
entity SimpleName MethodInvocation MethodInvocation SimpleName array of floats
set attribute SimpleName MethodInvocation StringLiteral map of array of floats
set attribute SimpleName MethodInvocation MethodInvocation SimpleName collections
set attribute SimpleName MethodInvocation MethodInvocation SimpleName singleton map
set attribute SimpleName MethodInvocation MethodInvocation StringLiteral one
set attribute SimpleName MethodInvocation MethodInvocation SimpleName array of floats
map of array of floats StringLiteral MethodInvocation MethodInvocation SimpleName collections
map of array of floats StringLiteral MethodInvocation MethodInvocation SimpleName singleton map
map of array of floats StringLiteral MethodInvocation MethodInvocation StringLiteral one
map of array of floats StringLiteral MethodInvocation MethodInvocation SimpleName array of floats
collections SimpleName MethodInvocation SimpleName singleton map
collections SimpleName MethodInvocation StringLiteral one
collections SimpleName MethodInvocation SimpleName array of dates
singleton map SimpleName MethodInvocation StringLiteral one
singleton map SimpleName MethodInvocation SimpleName array of dates
one StringLiteral MethodInvocation SimpleName array of dates
entity SimpleName MethodInvocation SimpleName set attribute
entity SimpleName MethodInvocation StringLiteral map of array of dates
entity SimpleName MethodInvocation MethodInvocation SimpleName collections
entity SimpleName MethodInvocation MethodInvocation SimpleName singleton map
entity SimpleName MethodInvocation MethodInvocation StringLiteral one
entity SimpleName MethodInvocation MethodInvocation SimpleName array of dates
set attribute SimpleName MethodInvocation StringLiteral map of array of dates
set attribute SimpleName MethodInvocation MethodInvocation SimpleName collections
set attribute SimpleName MethodInvocation MethodInvocation SimpleName singleton map
set attribute SimpleName MethodInvocation MethodInvocation StringLiteral one
set attribute SimpleName MethodInvocation MethodInvocation SimpleName array of dates
map of array of dates StringLiteral MethodInvocation MethodInvocation SimpleName collections
map of array of dates StringLiteral MethodInvocation MethodInvocation SimpleName singleton map
map of array of dates StringLiteral MethodInvocation MethodInvocation StringLiteral one
map of array of dates StringLiteral MethodInvocation MethodInvocation SimpleName array of dates
collections SimpleName MethodInvocation SimpleName singleton map
collections SimpleName MethodInvocation StringLiteral one
collections SimpleName MethodInvocation SimpleName map of strings
singleton map SimpleName MethodInvocation StringLiteral one
singleton map SimpleName MethodInvocation SimpleName map of strings
one StringLiteral MethodInvocation SimpleName map of strings
entity SimpleName MethodInvocation SimpleName set attribute
entity SimpleName MethodInvocation StringLiteral map of map of strings
entity SimpleName MethodInvocation MethodInvocation SimpleName collections
entity SimpleName MethodInvocation MethodInvocation SimpleName singleton map
entity SimpleName MethodInvocation MethodInvocation StringLiteral one
entity SimpleName MethodInvocation MethodInvocation SimpleName map of strings
set attribute SimpleName MethodInvocation StringLiteral map of map of strings
set attribute SimpleName MethodInvocation MethodInvocation SimpleName collections
set attribute SimpleName MethodInvocation MethodInvocation SimpleName singleton map
set attribute SimpleName MethodInvocation MethodInvocation StringLiteral one
set attribute SimpleName MethodInvocation MethodInvocation SimpleName map of strings
map of map of strings StringLiteral MethodInvocation MethodInvocation SimpleName collections
map of map of strings StringLiteral MethodInvocation MethodInvocation SimpleName singleton map
map of map of strings StringLiteral MethodInvocation MethodInvocation StringLiteral one
map of map of strings StringLiteral MethodInvocation MethodInvocation SimpleName map of strings
collections SimpleName MethodInvocation SimpleName singleton map
collections SimpleName MethodInvocation StringLiteral one
collections SimpleName MethodInvocation SimpleName map of booleans
singleton map SimpleName MethodInvocation StringLiteral one
singleton map SimpleName MethodInvocation SimpleName map of booleans
one StringLiteral MethodInvocation SimpleName map of booleans
entity SimpleName MethodInvocation SimpleName set attribute
entity SimpleName MethodInvocation StringLiteral map of map of booleans
entity SimpleName MethodInvocation MethodInvocation SimpleName collections
entity SimpleName MethodInvocation MethodInvocation SimpleName singleton map
entity SimpleName MethodInvocation MethodInvocation StringLiteral one
entity SimpleName MethodInvocation MethodInvocation SimpleName map of booleans
set attribute SimpleName MethodInvocation StringLiteral map of map of booleans
set attribute SimpleName MethodInvocation MethodInvocation SimpleName collections
set attribute SimpleName MethodInvocation MethodInvocation SimpleName singleton map
set attribute SimpleName MethodInvocation MethodInvocation StringLiteral one
set attribute SimpleName MethodInvocation MethodInvocation SimpleName map of booleans
map of map of booleans StringLiteral MethodInvocation MethodInvocation SimpleName collections
map of map of booleans StringLiteral MethodInvocation MethodInvocation SimpleName singleton map
map of map of booleans StringLiteral MethodInvocation MethodInvocation StringLiteral one
map of map of booleans StringLiteral MethodInvocation MethodInvocation SimpleName map of booleans
collections SimpleName MethodInvocation SimpleName singleton map
collections SimpleName MethodInvocation StringLiteral one
collections SimpleName MethodInvocation SimpleName map of ints
singleton map SimpleName MethodInvocation StringLiteral one
singleton map SimpleName MethodInvocation SimpleName map of ints
one StringLiteral MethodInvocation SimpleName map of ints
entity SimpleName MethodInvocation SimpleName set attribute
entity SimpleName MethodInvocation StringLiteral map of map of ints
entity SimpleName MethodInvocation MethodInvocation SimpleName collections
entity SimpleName MethodInvocation MethodInvocation SimpleName singleton map
entity SimpleName MethodInvocation MethodInvocation StringLiteral one
entity SimpleName MethodInvocation MethodInvocation SimpleName map of ints
set attribute SimpleName MethodInvocation StringLiteral map of map of ints
set attribute SimpleName MethodInvocation MethodInvocation SimpleName collections
set attribute SimpleName MethodInvocation MethodInvocation SimpleName singleton map
set attribute SimpleName MethodInvocation MethodInvocation StringLiteral one
set attribute SimpleName MethodInvocation MethodInvocation SimpleName map of ints
map of map of ints StringLiteral MethodInvocation MethodInvocation SimpleName collections
map of map of ints StringLiteral MethodInvocation MethodInvocation SimpleName singleton map
map of map of ints StringLiteral MethodInvocation MethodInvocation StringLiteral one
map of map of ints StringLiteral MethodInvocation MethodInvocation SimpleName map of ints
collections SimpleName MethodInvocation SimpleName singleton map
collections SimpleName MethodInvocation StringLiteral one
collections SimpleName MethodInvocation SimpleName map of floats
singleton map SimpleName MethodInvocation StringLiteral one
singleton map SimpleName MethodInvocation SimpleName map of floats
one StringLiteral MethodInvocation SimpleName map of floats
entity SimpleName MethodInvocation SimpleName set attribute
entity SimpleName MethodInvocation StringLiteral map of map of floats
entity SimpleName MethodInvocation MethodInvocation SimpleName collections
entity SimpleName MethodInvocation MethodInvocation SimpleName singleton map
entity SimpleName MethodInvocation MethodInvocation StringLiteral one
entity SimpleName MethodInvocation MethodInvocation SimpleName map of floats
set attribute SimpleName MethodInvocation StringLiteral map of map of floats
set attribute SimpleName MethodInvocation MethodInvocation SimpleName collections
set attribute SimpleName MethodInvocation MethodInvocation SimpleName singleton map
set attribute SimpleName MethodInvocation MethodInvocation StringLiteral one
set attribute SimpleName MethodInvocation MethodInvocation SimpleName map of floats
map of map of floats StringLiteral MethodInvocation MethodInvocation SimpleName collections
map of map of floats StringLiteral MethodInvocation MethodInvocation SimpleName singleton map
map of map of floats StringLiteral MethodInvocation MethodInvocation StringLiteral one
map of map of floats StringLiteral MethodInvocation MethodInvocation SimpleName map of floats
collections SimpleName MethodInvocation SimpleName singleton map
collections SimpleName MethodInvocation StringLiteral one
collections SimpleName MethodInvocation SimpleName map of dates
singleton map SimpleName MethodInvocation StringLiteral one
singleton map SimpleName MethodInvocation SimpleName map of dates
one StringLiteral MethodInvocation SimpleName map of dates
entity SimpleName MethodInvocation SimpleName set attribute
entity SimpleName MethodInvocation StringLiteral map of map of dates
entity SimpleName MethodInvocation MethodInvocation SimpleName collections
entity SimpleName MethodInvocation MethodInvocation SimpleName singleton map
entity SimpleName MethodInvocation MethodInvocation StringLiteral one
entity SimpleName MethodInvocation MethodInvocation SimpleName map of dates
set attribute SimpleName MethodInvocation StringLiteral map of map of dates
set attribute SimpleName MethodInvocation MethodInvocation SimpleName collections
set attribute SimpleName MethodInvocation MethodInvocation SimpleName singleton map
set attribute SimpleName MethodInvocation MethodInvocation StringLiteral one
set attribute SimpleName MethodInvocation MethodInvocation SimpleName map of dates
map of map of dates StringLiteral MethodInvocation MethodInvocation SimpleName collections
map of map of dates StringLiteral MethodInvocation MethodInvocation SimpleName singleton map
map of map of dates StringLiteral MethodInvocation MethodInvocation StringLiteral one
map of map of dates StringLiteral MethodInvocation MethodInvocation SimpleName map of dates
collections SimpleName MethodInvocation SimpleName singleton list
collections SimpleName MethodInvocation SimpleName array of strings
singleton list SimpleName MethodInvocation SimpleName array of strings
entity SimpleName MethodInvocation SimpleName set attribute
entity SimpleName MethodInvocation StringLiteral array of array of strings
entity SimpleName MethodInvocation MethodInvocation SimpleName collections
entity SimpleName MethodInvocation MethodInvocation SimpleName singleton list
entity SimpleName MethodInvocation MethodInvocation SimpleName array of strings
set attribute SimpleName MethodInvocation StringLiteral array of array of strings
set attribute SimpleName MethodInvocation MethodInvocation SimpleName collections
set attribute SimpleName MethodInvocation MethodInvocation SimpleName singleton list
set attribute SimpleName MethodInvocation MethodInvocation SimpleName array of strings
array of array of strings StringLiteral MethodInvocation MethodInvocation SimpleName collections
array of array of strings StringLiteral MethodInvocation MethodInvocation SimpleName singleton list
array of array of strings StringLiteral MethodInvocation MethodInvocation SimpleName array of strings
collections SimpleName MethodInvocation SimpleName singleton list
collections SimpleName MethodInvocation SimpleName array of booleans
singleton list SimpleName MethodInvocation SimpleName array of booleans
entity SimpleName MethodInvocation SimpleName set attribute
entity SimpleName MethodInvocation StringLiteral array of array of booleans
entity SimpleName MethodInvocation MethodInvocation SimpleName collections
entity SimpleName MethodInvocation MethodInvocation SimpleName singleton list
entity SimpleName MethodInvocation MethodInvocation SimpleName array of booleans
set attribute SimpleName MethodInvocation StringLiteral array of array of booleans
set attribute SimpleName MethodInvocation MethodInvocation SimpleName collections
set attribute SimpleName MethodInvocation MethodInvocation SimpleName singleton list
set attribute SimpleName MethodInvocation MethodInvocation SimpleName array of booleans
array of array of booleans StringLiteral MethodInvocation MethodInvocation SimpleName collections
array of array of booleans StringLiteral MethodInvocation MethodInvocation SimpleName singleton list
array of array of booleans StringLiteral MethodInvocation MethodInvocation SimpleName array of booleans
collections SimpleName MethodInvocation SimpleName singleton list
collections SimpleName MethodInvocation SimpleName array of ints
singleton list SimpleName MethodInvocation SimpleName array of ints
entity SimpleName MethodInvocation SimpleName set attribute
entity SimpleName MethodInvocation StringLiteral array of array of ints
entity SimpleName MethodInvocation MethodInvocation SimpleName collections
entity SimpleName MethodInvocation MethodInvocation SimpleName singleton list
entity SimpleName MethodInvocation MethodInvocation SimpleName array of ints
set attribute SimpleName MethodInvocation StringLiteral array of array of ints
set attribute SimpleName MethodInvocation MethodInvocation SimpleName collections
set attribute SimpleName MethodInvocation MethodInvocation SimpleName singleton list
set attribute SimpleName MethodInvocation MethodInvocation SimpleName array of ints
array of array of ints StringLiteral MethodInvocation MethodInvocation SimpleName collections
array of array of ints StringLiteral MethodInvocation MethodInvocation SimpleName singleton list
array of array of ints StringLiteral MethodInvocation MethodInvocation SimpleName array of ints
collections SimpleName MethodInvocation SimpleName singleton list
collections SimpleName MethodInvocation SimpleName array of floats
singleton list SimpleName MethodInvocation SimpleName array of floats
entity SimpleName MethodInvocation SimpleName set attribute
entity SimpleName MethodInvocation StringLiteral array of array of floats
entity SimpleName MethodInvocation MethodInvocation SimpleName collections
entity SimpleName MethodInvocation MethodInvocation SimpleName singleton list
entity SimpleName MethodInvocation MethodInvocation SimpleName array of floats
set attribute SimpleName MethodInvocation StringLiteral array of array of floats
set attribute SimpleName MethodInvocation MethodInvocation SimpleName collections
set attribute SimpleName MethodInvocation MethodInvocation SimpleName singleton list
set attribute SimpleName MethodInvocation MethodInvocation SimpleName array of floats
array of array of floats StringLiteral MethodInvocation MethodInvocation SimpleName collections
array of array of floats StringLiteral MethodInvocation MethodInvocation SimpleName singleton list
array of array of floats StringLiteral MethodInvocation MethodInvocation SimpleName array of floats
collections SimpleName MethodInvocation SimpleName singleton list
collections SimpleName MethodInvocation SimpleName array of dates
singleton list SimpleName MethodInvocation SimpleName array of dates
entity SimpleName MethodInvocation SimpleName set attribute
entity SimpleName MethodInvocation StringLiteral array of array of dates
entity SimpleName MethodInvocation MethodInvocation SimpleName collections
entity SimpleName MethodInvocation MethodInvocation SimpleName singleton list
entity SimpleName MethodInvocation MethodInvocation SimpleName array of dates
set attribute SimpleName MethodInvocation StringLiteral array of array of dates
set attribute SimpleName MethodInvocation MethodInvocation SimpleName collections
set attribute SimpleName MethodInvocation MethodInvocation SimpleName singleton list
set attribute SimpleName MethodInvocation MethodInvocation SimpleName array of dates
array of array of dates StringLiteral MethodInvocation MethodInvocation SimpleName collections
array of array of dates StringLiteral MethodInvocation MethodInvocation SimpleName singleton list
array of array of dates StringLiteral MethodInvocation MethodInvocation SimpleName array of dates
collections SimpleName MethodInvocation SimpleName singleton list
collections SimpleName MethodInvocation SimpleName map of strings
singleton list SimpleName MethodInvocation SimpleName map of strings
entity SimpleName MethodInvocation SimpleName set attribute
entity SimpleName MethodInvocation StringLiteral array of map of strings
entity SimpleName MethodInvocation MethodInvocation SimpleName collections
entity SimpleName MethodInvocation MethodInvocation SimpleName singleton list
entity SimpleName MethodInvocation MethodInvocation SimpleName map of strings
set attribute SimpleName MethodInvocation StringLiteral array of map of strings
set attribute SimpleName MethodInvocation MethodInvocation SimpleName collections
set attribute SimpleName MethodInvocation MethodInvocation SimpleName singleton list
set attribute SimpleName MethodInvocation MethodInvocation SimpleName map of strings
array of map of strings StringLiteral MethodInvocation MethodInvocation SimpleName collections
array of map of strings StringLiteral MethodInvocation MethodInvocation SimpleName singleton list
array of map of strings StringLiteral MethodInvocation MethodInvocation SimpleName map of strings
collections SimpleName MethodInvocation SimpleName singleton list
collections SimpleName MethodInvocation SimpleName map of booleans
singleton list SimpleName MethodInvocation SimpleName map of booleans
entity SimpleName MethodInvocation SimpleName set attribute
entity SimpleName MethodInvocation StringLiteral array of map of booleans
entity SimpleName MethodInvocation MethodInvocation SimpleName collections
entity SimpleName MethodInvocation MethodInvocation SimpleName singleton list
entity SimpleName MethodInvocation MethodInvocation SimpleName map of booleans
set attribute SimpleName MethodInvocation StringLiteral array of map of booleans
set attribute SimpleName MethodInvocation MethodInvocation SimpleName collections
set attribute SimpleName MethodInvocation MethodInvocation SimpleName singleton list
set attribute SimpleName MethodInvocation MethodInvocation SimpleName map of booleans
array of map of booleans StringLiteral MethodInvocation MethodInvocation SimpleName collections
array of map of booleans StringLiteral MethodInvocation MethodInvocation SimpleName singleton list
array of map of booleans StringLiteral MethodInvocation MethodInvocation SimpleName map of booleans
collections SimpleName MethodInvocation SimpleName singleton list
collections SimpleName MethodInvocation SimpleName map of ints
singleton list SimpleName MethodInvocation SimpleName map of ints
entity SimpleName MethodInvocation SimpleName set attribute
entity SimpleName MethodInvocation StringLiteral array of map of ints
entity SimpleName MethodInvocation MethodInvocation SimpleName collections
entity SimpleName MethodInvocation MethodInvocation SimpleName singleton list
entity SimpleName MethodInvocation MethodInvocation SimpleName map of ints
set attribute SimpleName MethodInvocation StringLiteral array of map of ints
set attribute SimpleName MethodInvocation MethodInvocation SimpleName collections
set attribute SimpleName MethodInvocation MethodInvocation SimpleName singleton list
set attribute SimpleName MethodInvocation MethodInvocation SimpleName map of ints
array of map of ints StringLiteral MethodInvocation MethodInvocation SimpleName collections
array of map of ints StringLiteral MethodInvocation MethodInvocation SimpleName singleton list
array of map of ints StringLiteral MethodInvocation MethodInvocation SimpleName map of ints
collections SimpleName MethodInvocation SimpleName singleton list
collections SimpleName MethodInvocation SimpleName map of floats
singleton list SimpleName MethodInvocation SimpleName map of floats
entity SimpleName MethodInvocation SimpleName set attribute
entity SimpleName MethodInvocation StringLiteral array of map of floats
entity SimpleName MethodInvocation MethodInvocation SimpleName collections
entity SimpleName MethodInvocation MethodInvocation SimpleName singleton list
entity SimpleName MethodInvocation MethodInvocation SimpleName map of floats
set attribute SimpleName MethodInvocation StringLiteral array of map of floats
set attribute SimpleName MethodInvocation MethodInvocation SimpleName collections
set attribute SimpleName MethodInvocation MethodInvocation SimpleName singleton list
set attribute SimpleName MethodInvocation MethodInvocation SimpleName map of floats
array of map of floats StringLiteral MethodInvocation MethodInvocation SimpleName collections
array of map of floats StringLiteral MethodInvocation MethodInvocation SimpleName singleton list
array of map of floats StringLiteral MethodInvocation MethodInvocation SimpleName map of floats
collections SimpleName MethodInvocation SimpleName singleton list
collections SimpleName MethodInvocation SimpleName map of dates
singleton list SimpleName MethodInvocation SimpleName map of dates
entity SimpleName MethodInvocation SimpleName set attribute
entity SimpleName MethodInvocation StringLiteral array of map of dates
entity SimpleName MethodInvocation MethodInvocation SimpleName collections
entity SimpleName MethodInvocation MethodInvocation SimpleName singleton list
entity SimpleName MethodInvocation MethodInvocation SimpleName map of dates
set attribute SimpleName MethodInvocation StringLiteral array of map of dates
set attribute SimpleName MethodInvocation MethodInvocation SimpleName collections
set attribute SimpleName MethodInvocation MethodInvocation SimpleName singleton list
set attribute SimpleName MethodInvocation MethodInvocation SimpleName map of dates
array of map of dates StringLiteral MethodInvocation MethodInvocation SimpleName collections
array of map of dates StringLiteral MethodInvocation MethodInvocation SimpleName singleton list
array of map of dates StringLiteral MethodInvocation MethodInvocation SimpleName map of dates
atlas entity with ext info SimpleName SimpleType ClassInstanceCreation SimpleName entity
public Modifier MethodDeclaration Modifier static
public Modifier MethodDeclaration SimpleType SimpleName atlas entity with ext info
public Modifier MethodDeclaration SimpleName create nested collection attr entity
static Modifier MethodDeclaration SimpleType SimpleName atlas entity with ext info
static Modifier MethodDeclaration SimpleName create nested collection attr entity
atlas entity with ext info SimpleName SimpleType MethodDeclaration SimpleName create nested collection attr entity
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier public
public Modifier TypeDeclaration MethodDeclaration Modifier static
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName atlas entity with ext info
public Modifier TypeDeclaration MethodDeclaration SimpleName create nested collection attr entity
test SimpleName TypeDeclaration MethodDeclaration Modifier public
test SimpleName TypeDeclaration MethodDeclaration Modifier static
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName atlas entity with ext info
test SimpleName TypeDeclaration MethodDeclaration SimpleName create nested collection attr entity
