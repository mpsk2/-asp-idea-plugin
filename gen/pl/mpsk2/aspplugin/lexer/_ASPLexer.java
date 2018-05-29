/* The following code was generated by JFlex 1.7.0 tweaked for IntelliJ platform */

package pl.mpsk2.aspplugin.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static pl.mpsk2.aspplugin.psi.ASPTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>_ASPLexer.flex</tt>
 */
public class _ASPLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [7, 7, 7]
   * Total runtime size is 1928 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[ZZ_CMAP_Z[ch>>14]|((ch>>7)&0x7f)]<<7)|(ch&0x7f)];
  }

  /* The ZZ_CMAP_Z table has 68 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\103\200");

  /* The ZZ_CMAP_Y table has 256 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\53\2\1\3\22\2\1\4\37\2\1\3\237\2");

  /* The ZZ_CMAP_A table has 640 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\2\4\1\22\0\1\2\1\42\1\13\1\20\1\35\1\0\1\15\1\10\1\60\1\65\1\37\1"+
    "\14\1\27\1\36\1\51\1\3\1\4\11\5\1\26\1\66\1\40\1\16\1\41\1\62\1\17\32\11\1"+
    "\57\1\12\1\64\1\73\1\6\1\0\1\22\1\21\1\30\1\47\1\24\1\54\1\55\1\67\1\45\1"+
    "\50\1\7\1\44\1\43\1\32\1\31\1\71\1\7\1\53\1\23\1\33\1\34\1\46\1\70\1\52\1"+
    "\74\1\61\1\56\1\72\1\63\1\25\6\0\1\1\32\0\1\2\337\0\1\2\177\0\13\2\35\0\2"+
    "\1\5\0\1\2\57\0\1\2\40\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\2\4\1\5\1\6\1\1"+
    "\1\7\2\1\1\10\1\11\1\12\1\13\1\1\2\6"+
    "\1\14\1\15\1\16\2\6\1\17\1\20\1\21\1\22"+
    "\1\23\1\1\2\6\1\24\1\6\1\25\1\26\1\27"+
    "\1\30\1\31\1\32\1\33\1\34\1\6\1\35\1\36"+
    "\1\37\2\0\1\40\1\0\1\41\16\0\3\6\1\42"+
    "\1\43\2\6\1\44\1\45\1\46\1\47\1\50\1\51"+
    "\1\0\1\52\1\53\2\0\1\54\1\55\2\6\1\56"+
    "\2\6\22\0\2\6\1\57\1\60\1\6\1\61\1\62"+
    "\1\63\2\0\4\6\1\0\1\64\1\65\10\0\1\66"+
    "\1\67\1\0\1\70\6\0\1\71\2\6\2\0\1\72"+
    "\2\6\1\73\1\74\1\75\1\76\1\77\4\0\1\100"+
    "\13\0\1\6\1\101\2\0\1\6\1\102\2\0\1\103"+
    "\1\104\7\0\1\105\4\0\1\106\2\0\1\6\3\0"+
    "\1\107\5\0\1\110\5\0\1\6\1\111\4\0\1\112"+
    "\3\0\1\113\1\114\1\115\1\0\1\6\1\116\1\0"+
    "\1\117\1\120\1\121\1\122\1\0\1\123\1\124\1\0"+
    "\1\125\1\126";

  private static int [] zzUnpackAction() {
    int [] result = new int[240];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\75\0\172\0\267\0\75\0\364\0\u0131\0\u016e"+
    "\0\u01ab\0\u01e8\0\u0225\0\u0262\0\75\0\75\0\75\0\75"+
    "\0\u029f\0\u02dc\0\u0319\0\75\0\u0356\0\75\0\u0393\0\u03d0"+
    "\0\u040d\0\75\0\u044a\0\u0487\0\u04c4\0\u0501\0\u053e\0\u057b"+
    "\0\u05b8\0\u05f5\0\75\0\75\0\75\0\75\0\75\0\75"+
    "\0\75\0\75\0\u0632\0\75\0\75\0\u066f\0\u0131\0\u01ab"+
    "\0\75\0\u06ac\0\75\0\u0262\0\u06e9\0\u0726\0\u0763\0\u07a0"+
    "\0\u07dd\0\u081a\0\u0857\0\u0894\0\u08d1\0\u090e\0\u094b\0\u0988"+
    "\0\u09c5\0\u0a02\0\u0a3f\0\u0a7c\0\75\0\75\0\u0ab9\0\u0af6"+
    "\0\75\0\75\0\75\0\75\0\u0b33\0\u0b70\0\u0bad\0\75"+
    "\0\75\0\u0bea\0\u0c27\0\75\0\75\0\u0c64\0\u0ca1\0\75"+
    "\0\u0cde\0\u0d1b\0\u0d58\0\u0d95\0\u0dd2\0\u0e0f\0\u0e4c\0\u0e89"+
    "\0\u0ec6\0\u0f03\0\u0f40\0\u0f7d\0\u0fba\0\u0ff7\0\u1034\0\u1071"+
    "\0\u10ae\0\u10eb\0\u1128\0\u1165\0\u11a2\0\u11df\0\u016e\0\u016e"+
    "\0\u121c\0\75\0\75\0\75\0\u1259\0\u1296\0\u12d3\0\u1310"+
    "\0\u134d\0\u138a\0\u13c7\0\u1404\0\75\0\u1441\0\u147e\0\u14bb"+
    "\0\u14f8\0\u1535\0\u1572\0\u15af\0\u15ec\0\u1629\0\u1666\0\u16a3"+
    "\0\75\0\u16e0\0\u171d\0\u175a\0\u1797\0\u17d4\0\u1811\0\u016e"+
    "\0\u184e\0\u188b\0\u18c8\0\u1905\0\u016e\0\u1942\0\u197f\0\u016e"+
    "\0\75\0\75\0\u19bc\0\75\0\u19f9\0\u1a36\0\u1a73\0\u1ab0"+
    "\0\75\0\u1aed\0\u1b2a\0\u1b67\0\u1ba4\0\u1be1\0\u1c1e\0\u1c5b"+
    "\0\u1c98\0\u1cd5\0\u1d12\0\u1d4f\0\u1d8c\0\u016e\0\u1dc9\0\u1e06"+
    "\0\u1e43\0\u016e\0\u1e80\0\u1ebd\0\75\0\75\0\u1efa\0\u1f37"+
    "\0\u1f74\0\u1fb1\0\u1fee\0\u202b\0\u2068\0\75\0\u20a5\0\u20e2"+
    "\0\u211f\0\u215c\0\u016e\0\u2199\0\u21d6\0\u2213\0\u2250\0\u228d"+
    "\0\u22ca\0\75\0\u2307\0\u2344\0\u2381\0\u23be\0\u23fb\0\75"+
    "\0\u2438\0\u2475\0\u24b2\0\u24ef\0\u252c\0\u2569\0\75\0\u25a6"+
    "\0\u25e3\0\u2620\0\u265d\0\75\0\u269a\0\u26d7\0\u2714\0\75"+
    "\0\75\0\75\0\u2751\0\u278e\0\75\0\u27cb\0\75\0\75"+
    "\0\75\0\75\0\u2808\0\75\0\u016e\0\u2845\0\75\0\75";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[240];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
    "\1\22\1\23\2\10\1\24\1\25\1\26\2\10\1\27"+
    "\1\10\1\30\1\31\1\32\1\33\1\34\1\35\1\36"+
    "\1\10\1\37\2\10\1\40\1\10\1\41\1\10\1\42"+
    "\2\10\1\43\1\44\1\45\1\10\1\46\1\47\1\50"+
    "\1\51\1\52\1\53\2\10\1\54\1\55\1\10\76\0"+
    "\2\3\75\0\1\56\75\0\2\6\75\0\1\57\1\10"+
    "\1\0\1\12\7\0\4\10\3\0\5\10\6\0\6\10"+
    "\1\0\4\10\3\0\1\10\5\0\3\10\2\0\1\10"+
    "\4\0\6\10\7\0\4\10\3\0\5\10\6\0\6\10"+
    "\1\0\4\10\3\0\1\10\5\0\3\10\2\0\1\10"+
    "\10\60\1\61\1\60\1\62\62\60\4\0\6\12\7\0"+
    "\4\12\3\0\5\12\6\0\6\12\1\0\4\12\3\0"+
    "\1\12\5\0\3\12\2\0\1\12\12\0\1\63\62\0"+
    "\12\64\1\65\1\61\61\64\21\0\1\66\1\0\1\67"+
    "\1\70\3\0\1\71\2\0\1\72\7\0\1\73\1\0"+
    "\1\74\1\75\1\76\4\0\1\77\12\0\1\100\1\0"+
    "\1\101\7\0\6\10\7\0\4\10\3\0\1\10\1\102"+
    "\3\10\6\0\2\10\1\103\3\10\1\0\4\10\3\0"+
    "\1\10\5\0\3\10\2\0\1\10\4\0\6\10\7\0"+
    "\4\10\3\0\2\10\1\104\2\10\6\0\6\10\1\0"+
    "\4\10\3\0\1\10\5\0\3\10\2\0\1\10\25\0"+
    "\1\105\10\0\1\106\42\0\6\10\7\0\4\10\3\0"+
    "\1\10\1\107\3\10\6\0\6\10\1\0\4\10\3\0"+
    "\1\10\5\0\3\10\2\0\1\10\4\0\6\10\7\0"+
    "\4\10\3\0\2\10\1\110\2\10\6\0\6\10\1\0"+
    "\4\10\3\0\1\10\5\0\3\10\2\0\1\10\14\0"+
    "\1\111\1\0\1\112\17\0\1\113\1\114\1\115\1\116"+
    "\1\117\71\0\1\120\53\0\1\121\30\0\1\122\21\0"+
    "\1\123\21\0\1\124\74\0\1\125\62\0\6\10\7\0"+
    "\3\10\1\126\3\0\5\10\6\0\6\10\1\0\4\10"+
    "\3\0\1\10\5\0\3\10\2\0\1\10\4\0\6\10"+
    "\7\0\4\10\3\0\5\10\6\0\2\10\1\127\3\10"+
    "\1\0\4\10\3\0\1\10\5\0\3\10\2\0\1\10"+
    "\51\0\1\130\27\0\6\10\7\0\4\10\3\0\5\10"+
    "\6\0\2\10\1\131\3\10\1\0\4\10\3\0\1\10"+
    "\5\0\3\10\2\0\1\10\4\0\6\10\7\0\3\10"+
    "\1\132\3\0\5\10\6\0\6\10\1\0\4\10\3\0"+
    "\1\10\5\0\3\10\2\0\1\10\1\56\1\0\73\56"+
    "\1\60\1\0\73\60\1\64\1\0\73\64\22\0\1\133"+
    "\106\0\1\134\32\0\1\135\54\0\1\136\2\0\1\137"+
    "\53\0\1\140\2\0\1\141\113\0\1\142\13\0\1\143"+
    "\27\0\1\144\22\0\1\145\61\0\1\146\73\0\1\147"+
    "\110\0\1\150\51\0\1\151\6\0\1\152\67\0\1\153"+
    "\123\0\1\154\25\0\6\10\7\0\4\10\3\0\5\10"+
    "\6\0\4\10\1\155\1\10\1\0\4\10\3\0\1\10"+
    "\5\0\3\10\2\0\1\10\4\0\6\10\7\0\4\10"+
    "\3\0\2\10\1\156\2\10\6\0\6\10\1\0\4\10"+
    "\3\0\1\10\5\0\3\10\2\0\1\10\4\0\6\10"+
    "\7\0\4\10\3\0\5\10\6\0\6\10\1\0\4\10"+
    "\3\0\1\10\5\0\3\10\2\0\1\157\4\0\6\10"+
    "\7\0\4\10\3\0\3\10\1\160\1\10\6\0\6\10"+
    "\1\0\4\10\3\0\1\10\5\0\3\10\2\0\1\10"+
    "\4\0\6\10\7\0\1\10\1\161\2\10\3\0\5\10"+
    "\6\0\6\10\1\0\4\10\3\0\1\10\5\0\3\10"+
    "\2\0\1\10\16\0\1\162\74\0\1\163\74\0\1\164"+
    "\102\0\1\165\123\0\1\166\25\0\6\10\7\0\4\10"+
    "\3\0\5\10\6\0\6\10\1\0\2\10\1\167\1\10"+
    "\3\0\1\10\5\0\3\10\2\0\1\10\4\0\6\10"+
    "\7\0\4\10\3\0\5\10\6\0\6\10\1\0\1\10"+
    "\1\170\2\10\3\0\1\10\5\0\3\10\2\0\1\10"+
    "\4\0\6\10\7\0\4\10\3\0\5\10\6\0\6\10"+
    "\1\0\3\10\1\171\3\0\1\10\5\0\3\10\2\0"+
    "\1\10\4\0\6\10\7\0\1\10\1\172\2\10\3\0"+
    "\5\10\6\0\6\10\1\0\4\10\3\0\1\10\5\0"+
    "\3\10\2\0\1\10\23\0\1\173\114\0\1\174\25\0"+
    "\1\175\34\0\1\176\120\0\1\177\52\0\1\200\73\0"+
    "\1\201\1\0\1\202\103\0\1\203\65\0\1\204\64\0"+
    "\1\205\122\0\1\206\54\0\1\207\72\0\1\210\23\0"+
    "\1\211\64\0\1\212\53\0\1\213\115\0\1\214\103\0"+
    "\1\215\55\0\1\216\71\0\1\217\47\0\6\10\7\0"+
    "\4\10\3\0\5\10\6\0\6\10\1\0\4\10\3\0"+
    "\1\10\5\0\3\10\2\0\1\220\4\0\6\10\7\0"+
    "\1\10\1\221\2\10\3\0\5\10\6\0\6\10\1\0"+
    "\4\10\3\0\1\10\5\0\3\10\2\0\1\10\4\0"+
    "\6\10\7\0\4\10\3\0\5\10\6\0\6\10\1\0"+
    "\1\10\1\222\2\10\3\0\1\10\5\0\3\10\2\0"+
    "\1\10\54\0\1\223\51\0\1\224\47\0\6\10\7\0"+
    "\4\10\3\0\3\10\1\225\1\10\6\0\6\10\1\0"+
    "\4\10\3\0\1\10\5\0\3\10\2\0\1\10\4\0"+
    "\6\10\7\0\3\10\1\226\3\0\5\10\6\0\6\10"+
    "\1\0\4\10\3\0\1\10\5\0\3\10\2\0\1\10"+
    "\4\0\6\10\7\0\4\10\3\0\5\10\6\0\6\10"+
    "\1\0\4\10\3\0\1\10\5\0\1\227\2\10\2\0"+
    "\1\10\4\0\6\10\7\0\4\10\3\0\5\10\6\0"+
    "\4\10\1\230\1\10\1\0\4\10\3\0\1\10\5\0"+
    "\3\10\2\0\1\10\24\0\1\231\64\0\1\232\150\0"+
    "\1\233\30\0\1\234\74\0\1\235\73\0\1\236\103\0"+
    "\1\237\76\0\1\240\64\0\1\241\101\0\1\242\110\0"+
    "\1\243\74\0\1\244\73\0\1\245\52\0\1\246\122\0"+
    "\1\247\47\0\1\250\126\0\1\251\72\0\1\252\71\0"+
    "\1\253\4\0\1\254\23\0\6\10\7\0\4\10\3\0"+
    "\5\10\6\0\6\10\1\0\1\10\1\255\2\10\3\0"+
    "\1\10\5\0\3\10\2\0\1\10\4\0\6\10\7\0"+
    "\4\10\3\0\5\10\6\0\6\10\1\0\4\10\3\0"+
    "\1\10\5\0\3\10\2\0\1\256\45\0\1\257\104\0"+
    "\1\260\23\0\6\10\7\0\4\10\3\0\1\261\4\10"+
    "\6\0\6\10\1\0\4\10\3\0\1\10\5\0\3\10"+
    "\2\0\1\10\4\0\6\10\7\0\4\10\3\0\3\10"+
    "\1\262\1\10\6\0\6\10\1\0\4\10\3\0\1\10"+
    "\5\0\3\10\2\0\1\10\23\0\1\263\124\0\1\264"+
    "\54\0\1\265\74\0\1\266\105\0\1\267\103\0\1\270"+
    "\64\0\1\271\74\0\1\272\65\0\1\273\73\0\1\274"+
    "\72\0\1\275\67\0\1\276\74\0\1\277\115\0\1\300"+
    "\53\0\1\301\123\0\1\302\25\0\6\10\7\0\4\10"+
    "\3\0\5\10\6\0\6\10\1\0\4\10\3\0\1\10"+
    "\5\0\3\10\2\0\1\303\32\0\1\304\115\0\1\305"+
    "\25\0\6\10\7\0\4\10\3\0\3\10\1\306\1\10"+
    "\6\0\6\10\1\0\4\10\3\0\1\10\5\0\3\10"+
    "\2\0\1\10\45\0\1\307\61\0\1\310\64\0\1\311"+
    "\146\0\1\312\45\0\1\313\74\0\1\314\76\0\1\315"+
    "\72\0\1\316\74\0\1\317\62\0\1\320\64\0\1\321"+
    "\101\0\1\322\66\0\1\323\76\0\1\324\72\0\1\325"+
    "\56\0\6\10\7\0\4\10\3\0\5\10\6\0\2\10"+
    "\1\326\3\10\1\0\4\10\3\0\1\10\5\0\3\10"+
    "\2\0\1\10\55\0\1\327\41\0\1\330\105\0\1\331"+
    "\122\0\1\332\74\0\1\333\37\0\1\334\114\0\1\335"+
    "\62\0\1\336\75\0\1\337\74\0\1\340\104\0\1\341"+
    "\72\0\1\342\76\0\1\343\35\0\6\10\7\0\4\10"+
    "\3\0\5\10\6\0\3\10\1\344\2\10\1\0\4\10"+
    "\3\0\1\10\5\0\3\10\2\0\1\10\44\0\1\345"+
    "\75\0\1\346\53\0\1\347\74\0\1\350\74\0\1\351"+
    "\103\0\1\352\106\0\1\353\70\0\1\354\37\0\6\10"+
    "\7\0\3\10\1\355\3\0\5\10\6\0\6\10\1\0"+
    "\4\10\3\0\1\10\5\0\3\10\2\0\1\10\46\0"+
    "\1\356\56\0\1\357\70\0\1\360\50\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[10370];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\2\1\1\11\7\1\4\11\3\1\1\11"+
    "\1\1\1\11\3\1\1\11\10\1\10\11\1\1\2\11"+
    "\1\1\2\0\1\11\1\0\1\11\16\0\3\1\2\11"+
    "\2\1\4\11\2\1\1\0\2\11\2\0\2\11\2\1"+
    "\1\11\2\1\22\0\5\1\3\11\2\0\4\1\1\0"+
    "\1\1\1\11\10\0\2\1\1\0\1\11\6\0\3\1"+
    "\2\0\4\1\2\11\1\1\1\11\4\0\1\11\13\0"+
    "\2\1\2\0\2\1\2\0\2\11\7\0\1\11\4\0"+
    "\1\1\2\0\1\1\3\0\1\11\5\0\1\11\5\0"+
    "\1\1\1\11\4\0\1\11\3\0\3\11\1\0\1\1"+
    "\1\11\1\0\4\11\1\0\1\11\1\1\1\0\2\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[240];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  public _ASPLexer() {
    this((java.io.Reader)null);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _ASPLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return BAD_CHARACTER;
            } 
            // fall through
          case 87: break;
          case 2: 
            { return WHITE_SPACE;
            } 
            // fall through
          case 88: break;
          case 3: 
            { return SLASH;
            } 
            // fall through
          case 89: break;
          case 4: 
            { return NUMBER;
            } 
            // fall through
          case 90: break;
          case 5: 
            { return ANONYMOUS;
            } 
            // fall through
          case 91: break;
          case 6: 
            { return ID;
            } 
            // fall through
          case 92: break;
          case 7: 
            { return VARIABLE;
            } 
            // fall through
          case 93: break;
          case 8: 
            { return ADD;
            } 
            // fall through
          case 94: break;
          case 9: 
            { return AND;
            } 
            // fall through
          case 95: break;
          case 10: 
            { return EQ;
            } 
            // fall through
          case 96: break;
          case 11: 
            { return AT;
            } 
            // fall through
          case 97: break;
          case 12: 
            { return BNOT;
            } 
            // fall through
          case 98: break;
          case 13: 
            { return COLON;
            } 
            // fall through
          case 99: break;
          case 14: 
            { return COMMA;
            } 
            // fall through
          case 100: break;
          case 15: 
            { return CSP;
            } 
            // fall through
          case 101: break;
          case 16: 
            { return SUB;
            } 
            // fall through
          case 102: break;
          case 17: 
            { return MUL;
            } 
            // fall through
          case 103: break;
          case 18: 
            { return LT;
            } 
            // fall through
          case 104: break;
          case 19: 
            { return GT;
            } 
            // fall through
          case 105: break;
          case 20: 
            { return DOT;
            } 
            // fall through
          case 106: break;
          case 21: 
            { return LBRACE;
            } 
            // fall through
          case 107: break;
          case 22: 
            { return LBRACK;
            } 
            // fall through
          case 108: break;
          case 23: 
            { return LPAREN;
            } 
            // fall through
          case 109: break;
          case 24: 
            { return QUESTION;
            } 
            // fall through
          case 110: break;
          case 25: 
            { return RBRACE;
            } 
            // fall through
          case 111: break;
          case 26: 
            { return RBRACK;
            } 
            // fall through
          case 112: break;
          case 27: 
            { return RPAREN;
            } 
            // fall through
          case 113: break;
          case 28: 
            { return SEM;
            } 
            // fall through
          case 114: break;
          case 29: 
            { return VBAR;
            } 
            // fall through
          case 115: break;
          case 30: 
            { return XOR;
            } 
            // fall through
          case 116: break;
          case 31: 
            { return COMMENT;
            } 
            // fall through
          case 117: break;
          case 32: 
            { return STRING;
            } 
            // fall through
          case 118: break;
          case 33: 
            { return MOD;
            } 
            // fall through
          case 119: break;
          case 34: 
            { return WIF;
            } 
            // fall through
          case 120: break;
          case 35: 
            { return IF;
            } 
            // fall through
          case 121: break;
          case 36: 
            { return CSP_ADD;
            } 
            // fall through
          case 122: break;
          case 37: 
            { return CSP_EQ;
            } 
            // fall through
          case 123: break;
          case 38: 
            { return CSP_SUB;
            } 
            // fall through
          case 124: break;
          case 39: 
            { return CSP_MUL;
            } 
            // fall through
          case 125: break;
          case 40: 
            { return CSP_LT;
            } 
            // fall through
          case 126: break;
          case 41: 
            { return CSP_GT;
            } 
            // fall through
          case 127: break;
          case 42: 
            { return POW;
            } 
            // fall through
          case 128: break;
          case 43: 
            { return LEQ;
            } 
            // fall through
          case 129: break;
          case 44: 
            { return GEQ;
            } 
            // fall through
          case 130: break;
          case 45: 
            { return NEQ;
            } 
            // fall through
          case 131: break;
          case 46: 
            { return DOTS;
            } 
            // fall through
          case 132: break;
          case 47: 
            { return ANY;
            } 
            // fall through
          case 133: break;
          case 48: 
            { return NOT;
            } 
            // fall through
          case 134: break;
          case 49: 
            { return CSP_LEQ;
            } 
            // fall through
          case 135: break;
          case 50: 
            { return CSP_GEQ;
            } 
            // fall through
          case 136: break;
          case 51: 
            { return CSP_NEQ;
            } 
            // fall through
          case 137: break;
          case 52: 
            { return SUM;
            } 
            // fall through
          case 138: break;
          case 53: 
            { return SUPREMUM;
            } 
            // fall through
          case 139: break;
          case 54: 
            { return MAX;
            } 
            // fall through
          case 140: break;
          case 55: 
            { return MIN;
            } 
            // fall through
          case 141: break;
          case 56: 
            { return INFIMUM;
            } 
            // fall through
          case 142: break;
          case 57: 
            { return BODY;
            } 
            // fall through
          case 143: break;
          case 58: 
            { return LEFT;
            } 
            // fall through
          case 144: break;
          case 59: 
            { return HEAD;
            } 
            // fall through
          case 145: break;
          case 60: 
            { return BASE;
            } 
            // fall through
          case 146: break;
          case 61: 
            { return SUMP;
            } 
            // fall through
          case 147: break;
          case 62: 
            { return SHOW;
            } 
            // fall through
          case 148: break;
          case 63: 
            { return EDGE;
            } 
            // fall through
          case 149: break;
          case 64: 
            { return TRUE;
            } 
            // fall through
          case 150: break;
          case 65: 
            { return UNARY;
            } 
            // fall through
          case 151: break;
          case 66: 
            { return RIGHT;
            } 
            // fall through
          case 152: break;
          case 67: 
            { return CONST;
            } 
            // fall through
          case 153: break;
          case 68: 
            { return COUNT;
            } 
            // fall through
          case 154: break;
          case 69: 
            { return FALSE;
            } 
            // fall through
          case 155: break;
          case 70: 
            { return BINARY;
            } 
            // fall through
          case 156: break;
          case 71: 
            { return THEORY;
            } 
            // fall through
          case 157: break;
          case 72: 
            { return FORGET;
            } 
            // fall through
          case 158: break;
          case 73: 
            { return SHOWSIG;
            } 
            // fall through
          case 159: break;
          case 74: 
            { return INCLUDE;
            } 
            // fall through
          case 160: break;
          case 75: 
            { return PROJECT_;
            } 
            // fall through
          case 161: break;
          case 76: 
            { return BLOCK;
            } 
            // fall through
          case 162: break;
          case 77: 
            { return PARSE_DEF;
            } 
            // fall through
          case 163: break;
          case 78: 
            { return EXTERNAL;
            } 
            // fall through
          case 164: break;
          case 79: 
            { return MAXIMIZE;
            } 
            // fall through
          case 165: break;
          case 80: 
            { return MINIMIZE;
            } 
            // fall through
          case 166: break;
          case 81: 
            { return VOLATILE;
            } 
            // fall through
          case 167: break;
          case 82: 
            { return DISJOINT;
            } 
            // fall through
          case 168: break;
          case 83: 
            { return PARSE_LP;
            } 
            // fall through
          case 169: break;
          case 84: 
            { return DIRECTIVE;
            } 
            // fall through
          case 170: break;
          case 85: 
            { return HEURISTIC;
            } 
            // fall through
          case 171: break;
          case 86: 
            { return CUMULATIVE;
            } 
            // fall through
          case 172: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
