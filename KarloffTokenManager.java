/* Generated By:JavaCC: Do not edit this line. KarloffTokenManager.java */
import java.io.*;
import java.util.ArrayList;
import ast.*;

/** Token Manager. */
public class KarloffTokenManager implements KarloffConstants
{

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x400ff6860L) != 0L)
         {
            jjmatchedKind = 42;
            return 13;
         }
         return -1;
      case 1:
         if ((active0 & 0x400fe6860L) != 0L)
         {
            jjmatchedKind = 42;
            jjmatchedPos = 1;
            return 14;
         }
         if ((active0 & 0x10000L) != 0L)
            return 14;
         return -1;
      case 2:
         if ((active0 & 0x400000000L) != 0L)
            return 14;
         if ((active0 & 0xfe6860L) != 0L)
         {
            jjmatchedKind = 42;
            jjmatchedPos = 2;
            return 14;
         }
         return -1;
      case 3:
         if ((active0 & 0x420060L) != 0L)
            return 14;
         if ((active0 & 0xbc6800L) != 0L)
         {
            jjmatchedKind = 42;
            jjmatchedPos = 3;
            return 14;
         }
         return -1;
      case 4:
         if ((active0 & 0x842000L) != 0L)
            return 14;
         if ((active0 & 0x384800L) != 0L)
         {
            jjmatchedKind = 42;
            jjmatchedPos = 4;
            return 14;
         }
         return -1;
      case 5:
         if ((active0 & 0x100800L) != 0L)
            return 14;
         if ((active0 & 0x284000L) != 0L)
         {
            jjmatchedKind = 42;
            jjmatchedPos = 5;
            return 14;
         }
         return -1;
      case 6:
         if ((active0 & 0x280000L) != 0L)
         {
            jjmatchedKind = 42;
            jjmatchedPos = 6;
            return 14;
         }
         if ((active0 & 0x4000L) != 0L)
            return 14;
         return -1;
      case 7:
         if ((active0 & 0x200000L) != 0L)
            return 14;
         if ((active0 & 0x80000L) != 0L)
         {
            jjmatchedKind = 42;
            jjmatchedPos = 7;
            return 14;
         }
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 38:
         return jjStopAtPos(0, 28);
      case 40:
         return jjStopAtPos(0, 7);
      case 41:
         return jjStopAtPos(0, 8);
      case 42:
         return jjStopAtPos(0, 26);
      case 43:
         return jjStopAtPos(0, 24);
      case 44:
         return jjStopAtPos(0, 33);
      case 45:
         return jjStopAtPos(0, 25);
      case 47:
         return jjStopAtPos(0, 27);
      case 59:
         return jjStopAtPos(0, 12);
      case 60:
         return jjStopAtPos(0, 30);
      case 61:
         jjmatchedKind = 15;
         return jjMoveStringLiteralDfa1_0(0x100000000L);
      case 62:
         return jjStopAtPos(0, 31);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x4000L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x400802000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x10000L);
      case 109:
         return jjMoveStringLiteralDfa1_0(0x40L);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x800L);
      case 112:
         return jjMoveStringLiteralDfa1_0(0x200000L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x180000L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x420000L);
      case 118:
         return jjMoveStringLiteralDfa1_0(0x20L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x40000L);
      case 123:
         return jjStopAtPos(0, 9);
      case 124:
         return jjStopAtPos(0, 29);
      case 125:
         return jjStopAtPos(0, 10);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 61:
         if ((active0 & 0x100000000L) != 0L)
            return jjStopAtPos(1, 32);
         break;
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x800040L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x180800L);
      case 102:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(1, 16, 14);
         break;
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x60000L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x4020L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x600000L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x400000000L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x80000L);
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x20000L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x240060L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x800000L);
      case 110:
         if ((active0 & 0x400000000L) != 0L)
            return jjStartNfaWithStates_0(2, 34, 14);
         break;
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x6000L);
      case 116:
         return jjMoveStringLiteralDfa3_0(active0, 0x100000L);
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x400000L);
      case 119:
         return jjMoveStringLiteralDfa3_0(active0, 0x800L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 86:
         return jjMoveStringLiteralDfa4_0(active0, 0x800L);
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x2000L);
      case 100:
         if ((active0 & 0x20L) != 0L)
            return jjStartNfaWithStates_0(3, 5, 14);
         return jjMoveStringLiteralDfa4_0(active0, 0x80000L);
      case 101:
         if ((active0 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(3, 22, 14);
         break;
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x44000L);
      case 110:
         if ((active0 & 0x40L) != 0L)
            return jjStartNfaWithStates_0(3, 6, 14);
         else if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(3, 17, 14);
         return jjMoveStringLiteralDfa4_0(active0, 0x200000L);
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x800000L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x100000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 73:
         return jjMoveStringLiteralDfa5_0(active0, 0x80000L);
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x800L);
      case 101:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(4, 18, 14);
         else if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(4, 23, 14);
         return jjMoveStringLiteralDfa5_0(active0, 0x4000L);
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x100000L);
      case 116:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(4, 13, 14);
         return jjMoveStringLiteralDfa5_0(active0, 0x200000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 79:
         return jjMoveStringLiteralDfa6_0(active0, 0x200000L);
      case 97:
         return jjMoveStringLiteralDfa6_0(active0, 0x4000L);
      case 110:
         if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(5, 20, 14);
         return jjMoveStringLiteralDfa6_0(active0, 0x80000L);
      case 114:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(5, 11, 14);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 110:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(6, 14, 14);
         break;
      case 112:
         return jjMoveStringLiteralDfa7_0(active0, 0x80000L);
      case 117:
         return jjMoveStringLiteralDfa7_0(active0, 0x200000L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
static private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 116:
         if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(7, 21, 14);
         break;
      case 117:
         return jjMoveStringLiteralDfa8_0(active0, 0x80000L);
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
static private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 116:
         if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(8, 19, 14);
         break;
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 13;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 13:
               case 1:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 42)
                     kind = 42;
                  jjCheckNAddStates(0, 2);
                  break;
               case 0:
               case 7:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 43)
                     kind = 43;
                  jjCheckNAddStates(3, 5);
                  break;
               case 14:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 42)
                     kind = 42;
                  jjCheckNAddStates(0, 2);
                  break;
               case 5:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 42)
                     kind = 42;
                  jjCheckNAddStates(6, 8);
                  break;
               case 8:
                  if (curChar == 46)
                     jjCheckNAdd(9);
                  break;
               case 9:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 43)
                     kind = 43;
                  jjCheckNAddTwoStates(9, 10);
                  break;
               case 11:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(12);
                  break;
               case 12:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 43)
                     kind = 43;
                  jjCheckNAdd(12);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 13:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 42)
                        kind = 42;
                     jjCheckNAddStates(9, 12);
                  }
                  else if (curChar == 95)
                     jjCheckNAddTwoStates(4, 5);
                  break;
               case 0:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 42)
                     kind = 42;
                  jjCheckNAddStates(13, 15);
                  break;
               case 14:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 42)
                        kind = 42;
                     jjCheckNAddStates(9, 12);
                  }
                  else if (curChar == 95)
                     jjCheckNAddTwoStates(4, 5);
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 42)
                        kind = 42;
                     jjCheckNAddStates(0, 2);
                  }
                  break;
               case 2:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 42)
                     kind = 42;
                  jjCheckNAddStates(0, 2);
                  break;
               case 3:
                  if (curChar == 95)
                     jjCheckNAddTwoStates(4, 5);
                  break;
               case 4:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 42)
                     kind = 42;
                  jjCheckNAddStates(6, 8);
                  break;
               case 6:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 42)
                     kind = 42;
                  jjCheckNAddStates(9, 12);
                  break;
               case 10:
                  if (curChar == 69)
                     jjAddStates(16, 17);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 13 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   2, 1, 3, 7, 8, 10, 3, 4, 5, 2, 1, 3, 6, 1, 3, 6, 
   11, 12, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, "\166\157\151\144", "\155\141\151\156", "\50", 
"\51", "\173", "\175", "\156\145\167\126\141\162", "\73", "\146\154\157\141\164", 
"\142\157\157\154\145\141\156", "\75", "\151\146", "\164\150\145\156", "\167\150\151\154\145", 
"\162\145\141\144\111\156\160\165\164", "\162\145\164\165\162\156", "\160\162\151\156\164\117\165\164", 
"\164\162\165\145", "\146\141\154\163\145", "\53", "\55", "\52", "\57", "\46", "\174", "\74", 
"\76", "\75\75", "\54", "\146\165\156", null, null, null, null, null, null, null, 
null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0xc07ffffffe1L, 
};
static final long[] jjtoSkip = {
   0x1eL, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[13];
static private final int[] jjstateSet = new int[26];
static protected char curChar;
/** Constructor. */
public KarloffTokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public KarloffTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 13; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
static public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

static private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
