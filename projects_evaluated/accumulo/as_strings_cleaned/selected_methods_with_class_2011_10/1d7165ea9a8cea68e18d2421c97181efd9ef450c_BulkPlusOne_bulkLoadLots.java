logger SimpleName SimpleType SingleVariableDeclaration SimpleName log
state SimpleName SimpleType SingleVariableDeclaration SimpleName state
value SimpleName SimpleType SingleVariableDeclaration SimpleName value
uuid SimpleName MethodInvocation SimpleName random uuid
uuid SimpleName MethodInvocation MethodInvocation SimpleName to string
random uuid SimpleName MethodInvocation MethodInvocation SimpleName to string
bulk StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName uuid
bulk StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName random uuid
bulk StringLiteral InfixExpression MethodInvocation SimpleName to string
path SimpleName SimpleType ClassInstanceCreation StringLiteral tmp
path SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral bulk
tmp StringLiteral ClassInstanceCreation InfixExpression StringLiteral bulk
tmp StringLiteral ClassInstanceCreation InfixExpression MethodInvocation SimpleName to string
dir SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName path
dir SimpleName VariableDeclarationFragment ClassInstanceCreation StringLiteral tmp
dir SimpleName VariableDeclarationFragment ClassInstanceCreation InfixExpression StringLiteral bulk
path SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName dir
dir SimpleName MethodInvocation SimpleName to string
dir SimpleName MethodInvocation InfixExpression StringLiteral fail
to string SimpleName MethodInvocation InfixExpression StringLiteral fail
path SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral fail
fail SimpleName VariableDeclarationFragment ClassInstanceCreation SimpleType SimpleName path
fail SimpleName VariableDeclarationFragment ClassInstanceCreation InfixExpression StringLiteral fail
path SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName fail
state SimpleName MethodInvocation SimpleName get
state SimpleName MethodInvocation StringLiteral rand
get SimpleName MethodInvocation StringLiteral rand
random SimpleName SimpleType CastExpression MethodInvocation SimpleName state
random SimpleName SimpleType CastExpression MethodInvocation SimpleName get
random SimpleName SimpleType CastExpression MethodInvocation StringLiteral rand
rand SimpleName VariableDeclarationFragment CastExpression SimpleType SimpleName random
rand SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName state
rand SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName get
rand SimpleName VariableDeclarationFragment CastExpression MethodInvocation StringLiteral rand
random SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName rand
state SimpleName MethodInvocation SimpleName get
state SimpleName MethodInvocation StringLiteral fs
get SimpleName MethodInvocation StringLiteral fs
file system SimpleName SimpleType CastExpression MethodInvocation SimpleName state
file system SimpleName SimpleType CastExpression MethodInvocation SimpleName get
file system SimpleName SimpleType CastExpression MethodInvocation StringLiteral fs
fs SimpleName VariableDeclarationFragment CastExpression SimpleType SimpleName file system
fs SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName state
fs SimpleName VariableDeclarationFragment CastExpression MethodInvocation SimpleName get
fs SimpleName VariableDeclarationFragment CastExpression MethodInvocation StringLiteral fs
file system SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName fs
fs SimpleName MethodInvocation SimpleName mkdirs
fs SimpleName MethodInvocation SimpleName fail
mkdirs SimpleName MethodInvocation SimpleName fail
rand SimpleName MethodInvocation SimpleName next int
rand SimpleName MethodInvocation NumberLiteral empty
next int SimpleName MethodInvocation NumberLiteral empty
rand SimpleName MethodInvocation InfixExpression NumberLiteral empty
next int SimpleName MethodInvocation InfixExpression NumberLiteral empty
empty NumberLiteral MethodInvocation InfixExpression NumberLiteral empty
parts SimpleName VariableDeclarationFragment InfixExpression MethodInvocation SimpleName rand
parts SimpleName VariableDeclarationFragment InfixExpression MethodInvocation SimpleName next int
parts SimpleName VariableDeclarationFragment InfixExpression MethodInvocation NumberLiteral empty
parts SimpleName VariableDeclarationFragment InfixExpression NumberLiteral empty
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName parts
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment InfixExpression NumberLiteral empty
ctr SimpleName VariableDeclarationFragment NumberLiteral empty
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName ctr
long PrimitiveType VariableDeclarationStatement VariableDeclarationFragment NumberLiteral empty
preparing bulk file with StringLiteral InfixExpression SimpleName parts
preparing bulk file with StringLiteral InfixExpression StringLiteral parts
parts SimpleName InfixExpression StringLiteral parts
log SimpleName MethodInvocation SimpleName debug
log SimpleName MethodInvocation InfixExpression StringLiteral preparing bulk file with
log SimpleName MethodInvocation InfixExpression SimpleName parts
log SimpleName MethodInvocation InfixExpression StringLiteral parts
debug SimpleName MethodInvocation InfixExpression StringLiteral preparing bulk file with
debug SimpleName MethodInvocation InfixExpression SimpleName parts
debug SimpleName MethodInvocation InfixExpression StringLiteral parts
string SimpleName SimpleType ArrayType ArrayCreation SimpleName cols
cols SimpleName VariableDeclarationFragment ArrayCreation SimpleName cols
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression QualifiedName colslength
cols SimpleName ArrayAccess SimpleName i
string SimpleName MethodInvocation SimpleName format
string SimpleName MethodInvocation StringLiteral % d
string SimpleName MethodInvocation SimpleName i
format SimpleName MethodInvocation StringLiteral % d
format SimpleName MethodInvocation SimpleName i
% d StringLiteral MethodInvocation SimpleName i
cols SimpleName ArrayAccess Assignment MethodInvocation SimpleName string
cols SimpleName ArrayAccess Assignment MethodInvocation SimpleName format
cols SimpleName ArrayAccess Assignment MethodInvocation StringLiteral % d
cols SimpleName ArrayAccess Assignment MethodInvocation SimpleName i
i SimpleName ArrayAccess Assignment MethodInvocation SimpleName string
i SimpleName ArrayAccess Assignment MethodInvocation SimpleName format
i SimpleName ArrayAccess Assignment MethodInvocation StringLiteral % d
i SimpleName ArrayAccess Assignment MethodInvocation SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression QualifiedName colslength
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
colslength QualifiedName InfixExpression ForStatement PostfixExpression SimpleName i
i SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName i
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
i SimpleName InfixExpression SimpleName parts
file operations SimpleName MethodInvocation SimpleName get instance
string SimpleName MethodInvocation SimpleName format
string SimpleName MethodInvocation StringLiteral part d
string SimpleName MethodInvocation SimpleName i
format SimpleName MethodInvocation StringLiteral part d
format SimpleName MethodInvocation SimpleName i
part d StringLiteral MethodInvocation SimpleName i
dir SimpleName InfixExpression StringLiteral /
dir SimpleName InfixExpression MethodInvocation SimpleName string
dir SimpleName InfixExpression MethodInvocation SimpleName format
dir SimpleName InfixExpression MethodInvocation StringLiteral part d
dir SimpleName InfixExpression MethodInvocation SimpleName i
dir SimpleName InfixExpression QualifiedName r fileextension
/ StringLiteral InfixExpression MethodInvocation SimpleName string
/ StringLiteral InfixExpression MethodInvocation SimpleName format
/ StringLiteral InfixExpression MethodInvocation StringLiteral part d
/ StringLiteral InfixExpression MethodInvocation SimpleName i
/ StringLiteral InfixExpression QualifiedName r fileextension
string SimpleName MethodInvocation InfixExpression QualifiedName r fileextension
format SimpleName MethodInvocation InfixExpression QualifiedName r fileextension
part d StringLiteral MethodInvocation InfixExpression QualifiedName r fileextension
i SimpleName MethodInvocation InfixExpression QualifiedName r fileextension
fs SimpleName MethodInvocation SimpleName get conf
accumulo configuration SimpleName MethodInvocation SimpleName get default configuration
file operations SimpleName MethodInvocation MethodInvocation SimpleName open writer
get instance SimpleName MethodInvocation MethodInvocation SimpleName open writer
file operations SimpleName MethodInvocation MethodInvocation InfixExpression SimpleName dir
file operations SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral /
file operations SimpleName MethodInvocation MethodInvocation InfixExpression QualifiedName r fileextension
get instance SimpleName MethodInvocation MethodInvocation InfixExpression SimpleName dir
get instance SimpleName MethodInvocation MethodInvocation InfixExpression StringLiteral /
get instance SimpleName MethodInvocation MethodInvocation InfixExpression QualifiedName r fileextension
file operations SimpleName MethodInvocation MethodInvocation SimpleName fs
get instance SimpleName MethodInvocation MethodInvocation SimpleName fs
file operations SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName fs
file operations SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get conf
get instance SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName fs
get instance SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get conf
file operations SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName accumulo configuration
file operations SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get default configuration
get instance SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName accumulo configuration
get instance SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get default configuration
open writer SimpleName MethodInvocation InfixExpression SimpleName dir
open writer SimpleName MethodInvocation InfixExpression StringLiteral /
open writer SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName string
open writer SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName format
open writer SimpleName MethodInvocation InfixExpression MethodInvocation StringLiteral part d
open writer SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName i
open writer SimpleName MethodInvocation InfixExpression QualifiedName r fileextension
open writer SimpleName MethodInvocation SimpleName fs
open writer SimpleName MethodInvocation MethodInvocation SimpleName fs
open writer SimpleName MethodInvocation MethodInvocation SimpleName get conf
open writer SimpleName MethodInvocation MethodInvocation SimpleName accumulo configuration
open writer SimpleName MethodInvocation MethodInvocation SimpleName get default configuration
dir SimpleName InfixExpression MethodInvocation SimpleName fs
/ StringLiteral InfixExpression MethodInvocation SimpleName fs
string SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName fs
format SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName fs
part d StringLiteral MethodInvocation InfixExpression MethodInvocation SimpleName fs
i SimpleName MethodInvocation InfixExpression MethodInvocation SimpleName fs
r fileextension QualifiedName InfixExpression MethodInvocation SimpleName fs
dir SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName fs
dir SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName get conf
/ StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName fs
/ StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName get conf
r fileextension QualifiedName InfixExpression MethodInvocation MethodInvocation SimpleName fs
r fileextension QualifiedName InfixExpression MethodInvocation MethodInvocation SimpleName get conf
dir SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName accumulo configuration
dir SimpleName InfixExpression MethodInvocation MethodInvocation SimpleName get default configuration
/ StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName accumulo configuration
/ StringLiteral InfixExpression MethodInvocation MethodInvocation SimpleName get default configuration
r fileextension QualifiedName InfixExpression MethodInvocation MethodInvocation SimpleName accumulo configuration
r fileextension QualifiedName InfixExpression MethodInvocation MethodInvocation SimpleName get default configuration
fs SimpleName MethodInvocation MethodInvocation SimpleName fs
fs SimpleName MethodInvocation MethodInvocation SimpleName get conf
fs SimpleName MethodInvocation MethodInvocation SimpleName accumulo configuration
fs SimpleName MethodInvocation MethodInvocation SimpleName get default configuration
fs SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName accumulo configuration
fs SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get default configuration
get conf SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName accumulo configuration
get conf SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get default configuration
f SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName file operations
f SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get instance
f SimpleName VariableDeclarationFragment MethodInvocation SimpleName open writer
f SimpleName VariableDeclarationFragment MethodInvocation InfixExpression SimpleName dir
f SimpleName VariableDeclarationFragment MethodInvocation InfixExpression StringLiteral /
f SimpleName VariableDeclarationFragment MethodInvocation InfixExpression QualifiedName r fileextension
f SimpleName VariableDeclarationFragment MethodInvocation SimpleName fs
f SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName fs
f SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get conf
f SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName accumulo configuration
f SimpleName VariableDeclarationFragment MethodInvocation MethodInvocation SimpleName get default configuration
file skv writer SimpleName SimpleType VariableDeclarationStatement VariableDeclarationFragment SimpleName f
f SimpleName MethodInvocation SimpleName start default locality group
int PrimitiveType CastExpression SimpleName lots
int PrimitiveType CastExpression InfixExpression SimpleName parts
lots SimpleName CastExpression InfixExpression SimpleName parts
end SimpleName VariableDeclarationFragment InfixExpression CastExpression PrimitiveType int
end SimpleName VariableDeclarationFragment InfixExpression CastExpression SimpleName lots
end SimpleName VariableDeclarationFragment InfixExpression SimpleName parts
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment SimpleName end
int PrimitiveType VariableDeclarationStatement VariableDeclarationFragment InfixExpression SimpleName parts
parts SimpleName InfixExpression NumberLiteral empty
i SimpleName InfixExpression InfixExpression SimpleName parts
i SimpleName InfixExpression InfixExpression NumberLiteral empty
lots SimpleName InfixExpression SimpleName ctr
int PrimitiveType CastExpression ParenthesizedExpression InfixExpression SimpleName lots
int PrimitiveType CastExpression ParenthesizedExpression InfixExpression SimpleName ctr
end SimpleName Assignment CastExpression PrimitiveType int
j SimpleName VariableDeclarationFragment NumberLiteral empty
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment SimpleName j
int PrimitiveType VariableDeclarationExpression VariableDeclarationFragment NumberLiteral empty
j SimpleName InfixExpression SimpleName end
string SimpleName SimpleType SingleVariableDeclaration SimpleName col
string SimpleName MethodInvocation SimpleName format
string SimpleName MethodInvocation SimpleName fmt
string SimpleName MethodInvocation SimpleName ctr
format SimpleName MethodInvocation SimpleName fmt
format SimpleName MethodInvocation SimpleName ctr
fmt SimpleName MethodInvocation SimpleName ctr
key SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName string
key SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName format
key SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName fmt
key SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName ctr
key SimpleName SimpleType ClassInstanceCreation StringLiteral cf
key SimpleName SimpleType ClassInstanceCreation SimpleName col
string SimpleName MethodInvocation ClassInstanceCreation StringLiteral cf
format SimpleName MethodInvocation ClassInstanceCreation StringLiteral cf
fmt SimpleName MethodInvocation ClassInstanceCreation StringLiteral cf
ctr SimpleName MethodInvocation ClassInstanceCreation StringLiteral cf
string SimpleName MethodInvocation ClassInstanceCreation SimpleName col
format SimpleName MethodInvocation ClassInstanceCreation SimpleName col
fmt SimpleName MethodInvocation ClassInstanceCreation SimpleName col
ctr SimpleName MethodInvocation ClassInstanceCreation SimpleName col
cf StringLiteral ClassInstanceCreation SimpleName col
f SimpleName MethodInvocation SimpleName append
f SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName key
f SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName string
f SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName format
f SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName fmt
f SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName ctr
f SimpleName MethodInvocation ClassInstanceCreation StringLiteral cf
f SimpleName MethodInvocation ClassInstanceCreation SimpleName col
f SimpleName MethodInvocation SimpleName value
append SimpleName MethodInvocation ClassInstanceCreation SimpleType SimpleName key
append SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName string
append SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName format
append SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName fmt
append SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName ctr
append SimpleName MethodInvocation ClassInstanceCreation StringLiteral cf
append SimpleName MethodInvocation ClassInstanceCreation SimpleName col
append SimpleName MethodInvocation SimpleName value
key SimpleName SimpleType ClassInstanceCreation MethodInvocation SimpleName value
string SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName value
format SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName value
fmt SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName value
ctr SimpleName MethodInvocation ClassInstanceCreation MethodInvocation SimpleName value
cf StringLiteral ClassInstanceCreation MethodInvocation SimpleName value
col SimpleName ClassInstanceCreation MethodInvocation SimpleName value
string SimpleName SimpleType SingleVariableDeclaration EnhancedForStatement SimpleName cols
col SimpleName SingleVariableDeclaration EnhancedForStatement SimpleName cols
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName j
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName end
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName j
j SimpleName InfixExpression ForStatement PostfixExpression SimpleName j
end SimpleName InfixExpression ForStatement PostfixExpression SimpleName j
f SimpleName MethodInvocation SimpleName close
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName i
int PrimitiveType VariableDeclarationExpression ForStatement InfixExpression SimpleName parts
int PrimitiveType VariableDeclarationExpression ForStatement PostfixExpression SimpleName i
i SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
parts SimpleName InfixExpression ForStatement PostfixExpression SimpleName i
state SimpleName MethodInvocation SimpleName get connector
state SimpleName MethodInvocation MethodInvocation SimpleName table operations
get connector SimpleName MethodInvocation MethodInvocation SimpleName table operations
setup SimpleName MethodInvocation SimpleName get table name
dir SimpleName MethodInvocation SimpleName to string
fail SimpleName MethodInvocation SimpleName to string
state SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName import directory
get connector SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName import directory
table operations SimpleName MethodInvocation MethodInvocation SimpleName import directory
table operations SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName setup
table operations SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName get table name
table operations SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName dir
table operations SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to string
table operations SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName fail
table operations SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to string
state SimpleName MethodInvocation MethodInvocation MethodInvocation BooleanLiteral true
get connector SimpleName MethodInvocation MethodInvocation MethodInvocation BooleanLiteral true
table operations SimpleName MethodInvocation MethodInvocation BooleanLiteral true
import directory SimpleName MethodInvocation MethodInvocation SimpleName setup
import directory SimpleName MethodInvocation MethodInvocation SimpleName get table name
import directory SimpleName MethodInvocation MethodInvocation SimpleName dir
import directory SimpleName MethodInvocation MethodInvocation SimpleName to string
import directory SimpleName MethodInvocation MethodInvocation SimpleName fail
import directory SimpleName MethodInvocation MethodInvocation SimpleName to string
import directory SimpleName MethodInvocation BooleanLiteral true
setup SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName dir
setup SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to string
get table name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName dir
get table name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to string
setup SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName fail
setup SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to string
get table name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName fail
get table name SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to string
setup SimpleName MethodInvocation MethodInvocation BooleanLiteral true
get table name SimpleName MethodInvocation MethodInvocation BooleanLiteral true
dir SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName fail
dir SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to string
to string SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName fail
to string SimpleName MethodInvocation MethodInvocation MethodInvocation SimpleName to string
dir SimpleName MethodInvocation MethodInvocation BooleanLiteral true
to string SimpleName MethodInvocation MethodInvocation BooleanLiteral true
fail SimpleName MethodInvocation MethodInvocation BooleanLiteral true
to string SimpleName MethodInvocation MethodInvocation BooleanLiteral true
fs SimpleName MethodInvocation SimpleName delete
fs SimpleName MethodInvocation SimpleName dir
fs SimpleName MethodInvocation BooleanLiteral true
delete SimpleName MethodInvocation SimpleName dir
delete SimpleName MethodInvocation BooleanLiteral true
dir SimpleName MethodInvocation BooleanLiteral true
fs SimpleName MethodInvocation SimpleName delete
fs SimpleName MethodInvocation SimpleName fail
fs SimpleName MethodInvocation BooleanLiteral true
delete SimpleName MethodInvocation SimpleName fail
delete SimpleName MethodInvocation BooleanLiteral true
fail SimpleName MethodInvocation BooleanLiteral true
fs SimpleName MethodInvocation SimpleName list status
fs SimpleName MethodInvocation SimpleName fail
list status SimpleName MethodInvocation SimpleName fail
failures SimpleName VariableDeclarationFragment MethodInvocation SimpleName fs
failures SimpleName VariableDeclarationFragment MethodInvocation SimpleName list status
failures SimpleName VariableDeclarationFragment MethodInvocation SimpleName fail
failureslength QualifiedName InfixExpression NumberLiteral empty
failures SimpleName InfixExpression InfixExpression InfixExpression QualifiedName failureslength
failures SimpleName InfixExpression InfixExpression InfixExpression NumberLiteral empty
arrays SimpleName MethodInvocation SimpleName as list
arrays SimpleName MethodInvocation SimpleName failures
as list SimpleName MethodInvocation SimpleName failures
failures StringLiteral InfixExpression MethodInvocation SimpleName arrays
failures StringLiteral InfixExpression MethodInvocation SimpleName as list
failures StringLiteral InfixExpression MethodInvocation SimpleName failures
failures StringLiteral InfixExpression StringLiteral found importing files from
failures StringLiteral InfixExpression SimpleName dir
arrays SimpleName MethodInvocation InfixExpression StringLiteral found importing files from
as list SimpleName MethodInvocation InfixExpression StringLiteral found importing files from
failures SimpleName MethodInvocation InfixExpression StringLiteral found importing files from
arrays SimpleName MethodInvocation InfixExpression SimpleName dir
as list SimpleName MethodInvocation InfixExpression SimpleName dir
failures SimpleName MethodInvocation InfixExpression SimpleName dir
found importing files from StringLiteral InfixExpression SimpleName dir
exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral failures
exception SimpleName SimpleType ClassInstanceCreation InfixExpression StringLiteral found importing files from
exception SimpleName SimpleType ClassInstanceCreation InfixExpression SimpleName dir
int PrimitiveType VariableDeclarationStatement Block VariableDeclarationStatement PrimitiveType long
static Modifier MethodDeclaration PrimitiveType void
static Modifier MethodDeclaration SimpleName bulk load lots
static Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName logger
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName log
static Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName state
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName state
static Modifier MethodDeclaration SingleVariableDeclaration SimpleType SimpleName value
static Modifier MethodDeclaration SingleVariableDeclaration SimpleName value
void PrimitiveType MethodDeclaration SimpleName bulk load lots
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName logger
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName log
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName state
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName state
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleType SimpleName value
void PrimitiveType MethodDeclaration SingleVariableDeclaration SimpleName value
void PrimitiveType MethodDeclaration SimpleType SimpleName exception
bulk load lots SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName logger
bulk load lots SimpleName MethodDeclaration SingleVariableDeclaration SimpleName log
bulk load lots SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName state
bulk load lots SimpleName MethodDeclaration SingleVariableDeclaration SimpleName state
bulk load lots SimpleName MethodDeclaration SingleVariableDeclaration SimpleType SimpleName value
bulk load lots SimpleName MethodDeclaration SingleVariableDeclaration SimpleName value
bulk load lots SimpleName MethodDeclaration SimpleType SimpleName exception
bulk load lots SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType int
bulk load lots SimpleName MethodDeclaration Block VariableDeclarationStatement PrimitiveType long
log SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName state
log SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName value
log SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
state SimpleName SingleVariableDeclaration MethodDeclaration SingleVariableDeclaration SimpleName value
state SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
value SimpleName SingleVariableDeclaration MethodDeclaration SimpleType SimpleName exception
public Modifier TypeDeclaration SimpleName test
public Modifier TypeDeclaration MethodDeclaration Modifier static
public Modifier TypeDeclaration MethodDeclaration PrimitiveType void
public Modifier TypeDeclaration MethodDeclaration SimpleName bulk load lots
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName log
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName state
public Modifier TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName value
public Modifier TypeDeclaration MethodDeclaration SimpleType SimpleName exception
test SimpleName TypeDeclaration MethodDeclaration Modifier static
test SimpleName TypeDeclaration MethodDeclaration PrimitiveType void
test SimpleName TypeDeclaration MethodDeclaration SimpleName bulk load lots
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName log
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName state
test SimpleName TypeDeclaration MethodDeclaration SingleVariableDeclaration SimpleName value
test SimpleName TypeDeclaration MethodDeclaration SimpleType SimpleName exception