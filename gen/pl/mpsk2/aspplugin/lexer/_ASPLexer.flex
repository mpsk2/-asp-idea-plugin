package pl.mpsk2.aspplugin.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static pl.mpsk2.aspplugin.psi.ASPTypes.*;

%%

%{
  public _ASPLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _ASPLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

SPACE=[ \t\n\x0B\f\r]+
COMMENT="//".*
NUMBER=0|([1-9][0-9]*)
ID=_*[a-z][a-zA-Z0-9_']*
VARIABLE=_*[A-Z][a-zA-Z0-9_']*
STRING=('([^'\\]|\\.)*'|\"([^\"\\]|\\.)*\")

%%
<YYINITIAL> {
  {WHITE_SPACE}      { return WHITE_SPACE; }

  "+"                { return ADD; }
  "&"                { return AND; }
  "="                { return EQ; }
  "@"                { return AT; }
  "#base"            { return BASE; }
  "~"                { return BNOT; }
  ":"                { return COLON; }
  ","                { return COMMA; }
  "#const"           { return CONST; }
  "#count"           { return COUNT; }
  "$"                { return CSP; }
  "$+"               { return CSP_ADD; }
  "$-"               { return CSP_SUB; }
  "$*"               { return CSP_MUL; }
  "$<="              { return CSP_LEQ; }
  "$<"               { return CSP_LT; }
  "$>"               { return CSP_GT; }
  "$>="              { return CSP_GEQ; }
  "$="               { return CSP_EQ; }
  "$!="              { return CSP_NEQ; }
  "#cumulative"      { return CUMULATIVE; }
  "#disjoint"        { return DISJOINT; }
  "."                { return DOT; }
  ".."               { return DOTS; }
  "#external"        { return EXTERNAL; }
  "#false"           { return FALSE; }
  "#forget"          { return FORGET; }
  ">="               { return GEQ; }
  ">"                { return GT; }
  ":-"               { return IF; }
  "#include"         { return INCLUDE; }
  "#inf"             { return INFIMUM; }
  "{"                { return LBRACE; }
  "["                { return LBRACK; }
  "<="               { return LEQ; }
  "("                { return LPAREN; }
  "<"                { return LT; }
  "#max"             { return MAX; }
  "#maximize"        { return MAXIMIZE; }
  "#min"             { return MIN; }
  "#minimize"        { return MINIMIZE; }
  "\\\\"             { return MOD; }
  "*"                { return MUL; }
  "!="               { return NEQ; }
  "**"               { return POW; }
  "?"                { return QUESTION; }
  "}"                { return RBRACE; }
  "]"                { return RBRACK; }
  ")"                { return RPAREN; }
  ";"                { return SEM; }
  "#show"            { return SHOW; }
  "#edge"            { return EDGE; }
  "#project"         { return PROJECT_; }
  "#heuristic"       { return HEURISTIC; }
  "#showsig"         { return SHOWSIG; }
  "/"                { return SLASH; }
  "-"                { return SUB; }
  "#sum"             { return SUM; }
  "#sum+"            { return SUMP; }
  "#sup"             { return SUPREMUM; }
  "#true"            { return TRUE; }
  "#program"         { return BLOCK; }
  "|"                { return VBAR; }
  "#volatile"        { return VOLATILE; }
  ":~"               { return WIF; }
  "^"                { return XOR; }
  "<program>"        { return PARSE_LP; }
  "<define>"         { return PARSE_DEF; }
  "any"              { return ANY; }
  "unary"            { return UNARY; }
  "binary"           { return BINARY; }
  "left"             { return LEFT; }
  "right"            { return RIGHT; }
  "head"             { return HEAD; }
  "body"             { return BODY; }
  "directive"        { return DIRECTIVE; }
  "#theory"          { return THEORY; }
  "not"              { return NOT; }
  "_"                { return ANONYMOUS; }

  {SPACE}            { return SPACE; }
  {COMMENT}          { return COMMENT; }
  {NUMBER}           { return NUMBER; }
  {ID}               { return ID; }
  {VARIABLE}         { return VARIABLE; }
  {STRING}           { return STRING; }

}

[^] { return BAD_CHARACTER; }
