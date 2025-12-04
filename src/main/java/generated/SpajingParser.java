// Generated from C:/Users/stive/IdeaProjects/lenguaje/src/main/antlr4/Spajing.g4 by ANTLR 4.13.2

package generated;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SpajingParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, CLASE=17, 
		FUNCION=18, RETORNAR=19, PREGUNTA=20, SINO=21, MIENTRAS=22, MOSTRAR=23, 
		FIN=24, FIN_CONDICIONAL=25, ENTERO_TIPO=26, REAL_TIPO=27, LOGICO_TIPO=28, 
		TEXTO_TIPO=29, AND=30, OR=31, NOT=32, ASIGNACION=33, BOOLEANO=34, ENTERO=35, 
		REAL=36, CADENA=37, ID=38, WS=39, COMENTARIO=40;
	public static final int
		RULE_programa = 0, RULE_funcion = 1, RULE_parametros = 2, RULE_parametro = 3, 
		RULE_bloque = 4, RULE_sentencia = 5, RULE_declaracion = 6, RULE_tipo = 7, 
		RULE_asignacion = 8, RULE_condicional = 9, RULE_bucle = 10, RULE_mostrar = 11, 
		RULE_llamadaFuncion = 12, RULE_argumentos = 13, RULE_retorno = 14, RULE_expresion = 15, 
		RULE_literal = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "funcion", "parametros", "parametro", "bloque", "sentencia", 
			"declaracion", "tipo", "asignacion", "condicional", "bucle", "mostrar", 
			"llamadaFuncion", "argumentos", "retorno", "expresion", "literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'('", "')'", "','", "';'", "'*'", "'/'", "'%'", "'+'", 
			"'-'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'Clase'", "'funcion'", 
			"'retornar'", "'pregunta'", "'sino'", "'mientras'", "'mostrar'", "'Fin'", 
			"'fin'", "'entero'", "'real'", "'logico'", "'texto'", "'y'", "'o'", "'no'", 
			"'--:'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "CLASE", "FUNCION", "RETORNAR", "PREGUNTA", 
			"SINO", "MIENTRAS", "MOSTRAR", "FIN", "FIN_CONDICIONAL", "ENTERO_TIPO", 
			"REAL_TIPO", "LOGICO_TIPO", "TEXTO_TIPO", "AND", "OR", "NOT", "ASIGNACION", 
			"BOOLEANO", "ENTERO", "REAL", "CADENA", "ID", "WS", "COMENTARIO"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Spajing.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SpajingParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode CLASE() { return getToken(SpajingParser.CLASE, 0); }
		public TerminalNode ID() { return getToken(SpajingParser.ID, 0); }
		public TerminalNode FIN() { return getToken(SpajingParser.FIN, 0); }
		public TerminalNode EOF() { return getToken(SpajingParser.EOF, 0); }
		public List<FuncionContext> funcion() {
			return getRuleContexts(FuncionContext.class);
		}
		public FuncionContext funcion(int i) {
			return getRuleContext(FuncionContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpajingListener ) ((SpajingListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpajingListener ) ((SpajingListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpajingVisitor ) return ((SpajingVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(CLASE);
			setState(35);
			match(ID);
			setState(36);
			match(T__0);
			setState(38); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(37);
				funcion();
				}
				}
				setState(40); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==FUNCION );
			setState(42);
			match(FIN);
			setState(43);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncionContext extends ParserRuleContext {
		public TerminalNode FUNCION() { return getToken(SpajingParser.FUNCION, 0); }
		public TerminalNode ID() { return getToken(SpajingParser.ID, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode FIN_CONDICIONAL() { return getToken(SpajingParser.FIN_CONDICIONAL, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpajingListener ) ((SpajingListener)listener).enterFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpajingListener ) ((SpajingListener)listener).exitFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpajingVisitor ) return ((SpajingVisitor<? extends T>)visitor).visitFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(FUNCION);
			setState(46);
			match(ID);
			setState(47);
			match(T__1);
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1006632960L) != 0)) {
				{
				setState(48);
				parametros();
				}
			}

			setState(51);
			match(T__2);
			setState(52);
			match(T__0);
			setState(53);
			bloque();
			setState(54);
			match(FIN_CONDICIONAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametrosContext extends ParserRuleContext {
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpajingListener ) ((SpajingListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpajingListener ) ((SpajingListener)listener).exitParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpajingVisitor ) return ((SpajingVisitor<? extends T>)visitor).visitParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			parametro();
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(57);
				match(T__3);
				setState(58);
				parametro();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametroContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(SpajingParser.ID, 0); }
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpajingListener ) ((SpajingListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpajingListener ) ((SpajingListener)listener).exitParametro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpajingVisitor ) return ((SpajingVisitor<? extends T>)visitor).visitParametro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			tipo();
			setState(65);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BloqueContext extends ParserRuleContext {
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpajingListener ) ((SpajingListener)listener).enterBloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpajingListener ) ((SpajingListener)listener).exitBloque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpajingVisitor ) return ((SpajingVisitor<? extends T>)visitor).visitBloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_bloque);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 275898695680L) != 0)) {
				{
				{
				setState(67);
				sentencia();
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaContext extends ParserRuleContext {
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public BucleContext bucle() {
			return getRuleContext(BucleContext.class,0);
		}
		public MostrarContext mostrar() {
			return getRuleContext(MostrarContext.class,0);
		}
		public LlamadaFuncionContext llamadaFuncion() {
			return getRuleContext(LlamadaFuncionContext.class,0);
		}
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpajingListener ) ((SpajingListener)listener).enterSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpajingListener ) ((SpajingListener)listener).exitSentencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpajingVisitor ) return ((SpajingVisitor<? extends T>)visitor).visitSentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sentencia);
		try {
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				declaracion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				asignacion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(75);
				condicional();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(76);
				bucle();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(77);
				mostrar();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(78);
				llamadaFuncion();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(79);
				retorno();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(SpajingParser.ID, 0); }
		public TerminalNode ASIGNACION() { return getToken(SpajingParser.ASIGNACION, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpajingListener ) ((SpajingListener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpajingListener ) ((SpajingListener)listener).exitDeclaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpajingVisitor ) return ((SpajingVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			tipo();
			setState(83);
			match(ID);
			setState(84);
			match(ASIGNACION);
			setState(85);
			expresion(0);
			setState(86);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public TerminalNode ENTERO_TIPO() { return getToken(SpajingParser.ENTERO_TIPO, 0); }
		public TerminalNode REAL_TIPO() { return getToken(SpajingParser.REAL_TIPO, 0); }
		public TerminalNode LOGICO_TIPO() { return getToken(SpajingParser.LOGICO_TIPO, 0); }
		public TerminalNode TEXTO_TIPO() { return getToken(SpajingParser.TEXTO_TIPO, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpajingListener ) ((SpajingListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpajingListener ) ((SpajingListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpajingVisitor ) return ((SpajingVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1006632960L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SpajingParser.ID, 0); }
		public TerminalNode ASIGNACION() { return getToken(SpajingParser.ASIGNACION, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpajingListener ) ((SpajingListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpajingListener ) ((SpajingListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpajingVisitor ) return ((SpajingVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(ID);
			setState(91);
			match(ASIGNACION);
			setState(92);
			expresion(0);
			setState(93);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionalContext extends ParserRuleContext {
		public TerminalNode PREGUNTA() { return getToken(SpajingParser.PREGUNTA, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public List<BloqueContext> bloque() {
			return getRuleContexts(BloqueContext.class);
		}
		public BloqueContext bloque(int i) {
			return getRuleContext(BloqueContext.class,i);
		}
		public TerminalNode FIN_CONDICIONAL() { return getToken(SpajingParser.FIN_CONDICIONAL, 0); }
		public TerminalNode SINO() { return getToken(SpajingParser.SINO, 0); }
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpajingListener ) ((SpajingListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpajingListener ) ((SpajingListener)listener).exitCondicional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpajingVisitor ) return ((SpajingVisitor<? extends T>)visitor).visitCondicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(PREGUNTA);
			setState(96);
			expresion(0);
			setState(97);
			match(T__0);
			setState(98);
			bloque();
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SINO) {
				{
				setState(99);
				match(SINO);
				setState(100);
				match(T__0);
				setState(101);
				bloque();
				}
			}

			setState(104);
			match(FIN_CONDICIONAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BucleContext extends ParserRuleContext {
		public TerminalNode MIENTRAS() { return getToken(SpajingParser.MIENTRAS, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode FIN_CONDICIONAL() { return getToken(SpajingParser.FIN_CONDICIONAL, 0); }
		public BucleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpajingListener ) ((SpajingListener)listener).enterBucle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpajingListener ) ((SpajingListener)listener).exitBucle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpajingVisitor ) return ((SpajingVisitor<? extends T>)visitor).visitBucle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BucleContext bucle() throws RecognitionException {
		BucleContext _localctx = new BucleContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_bucle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(MIENTRAS);
			setState(107);
			expresion(0);
			setState(108);
			match(T__0);
			setState(109);
			bloque();
			setState(110);
			match(FIN_CONDICIONAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MostrarContext extends ParserRuleContext {
		public TerminalNode MOSTRAR() { return getToken(SpajingParser.MOSTRAR, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public MostrarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mostrar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpajingListener ) ((SpajingListener)listener).enterMostrar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpajingListener ) ((SpajingListener)listener).exitMostrar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpajingVisitor ) return ((SpajingVisitor<? extends T>)visitor).visitMostrar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MostrarContext mostrar() throws RecognitionException {
		MostrarContext _localctx = new MostrarContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_mostrar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(MOSTRAR);
			setState(113);
			match(T__1);
			setState(114);
			expresion(0);
			setState(115);
			match(T__2);
			setState(116);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LlamadaFuncionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SpajingParser.ID, 0); }
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public LlamadaFuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamadaFuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpajingListener ) ((SpajingListener)listener).enterLlamadaFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpajingListener ) ((SpajingListener)listener).exitLlamadaFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpajingVisitor ) return ((SpajingVisitor<? extends T>)visitor).visitLlamadaFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LlamadaFuncionContext llamadaFuncion() throws RecognitionException {
		LlamadaFuncionContext _localctx = new LlamadaFuncionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_llamadaFuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(ID);
			setState(119);
			match(T__1);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 536870912004L) != 0)) {
				{
				setState(120);
				argumentos();
				}
			}

			setState(123);
			match(T__2);
			setState(124);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentosContext extends ParserRuleContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public ArgumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpajingListener ) ((SpajingListener)listener).enterArgumentos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpajingListener ) ((SpajingListener)listener).exitArgumentos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpajingVisitor ) return ((SpajingVisitor<? extends T>)visitor).visitArgumentos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentosContext argumentos() throws RecognitionException {
		ArgumentosContext _localctx = new ArgumentosContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_argumentos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			expresion(0);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(127);
				match(T__3);
				setState(128);
				expresion(0);
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RetornoContext extends ParserRuleContext {
		public TerminalNode RETORNAR() { return getToken(SpajingParser.RETORNAR, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpajingListener ) ((SpajingListener)listener).enterRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpajingListener ) ((SpajingListener)listener).exitRetorno(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpajingVisitor ) return ((SpajingVisitor<? extends T>)visitor).visitRetorno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_retorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(RETORNAR);
			setState(135);
			expresion(0);
			setState(136);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionContext extends ParserRuleContext {
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
	 
		public ExpresionContext() { }
		public void copyFrom(ExpresionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndExprContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode AND() { return getToken(SpajingParser.AND, 0); }
		public AndExprContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpajingListener ) ((SpajingListener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpajingListener ) ((SpajingListener)listener).exitAndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpajingVisitor ) return ((SpajingVisitor<? extends T>)visitor).visitAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparacionContext extends ExpresionContext {
		public Token op;
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public ComparacionContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpajingListener ) ((SpajingListener)listener).enterComparacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpajingListener ) ((SpajingListener)listener).exitComparacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpajingVisitor ) return ((SpajingVisitor<? extends T>)visitor).visitComparacion(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdExprContext extends ExpresionContext {
		public TerminalNode ID() { return getToken(SpajingParser.ID, 0); }
		public IdExprContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpajingListener ) ((SpajingListener)listener).enterIdExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpajingListener ) ((SpajingListener)listener).exitIdExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpajingVisitor ) return ((SpajingVisitor<? extends T>)visitor).visitIdExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AdicionContext extends ExpresionContext {
		public Token op;
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public AdicionContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpajingListener ) ((SpajingListener)listener).enterAdicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpajingListener ) ((SpajingListener)listener).exitAdicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpajingVisitor ) return ((SpajingVisitor<? extends T>)visitor).visitAdicion(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParentesisContext extends ExpresionContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ParentesisContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpajingListener ) ((SpajingListener)listener).enterParentesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpajingListener ) ((SpajingListener)listener).exitParentesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpajingVisitor ) return ((SpajingVisitor<? extends T>)visitor).visitParentesis(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralExprContext extends ExpresionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExprContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpajingListener ) ((SpajingListener)listener).enterLiteralExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpajingListener ) ((SpajingListener)listener).exitLiteralExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpajingVisitor ) return ((SpajingVisitor<? extends T>)visitor).visitLiteralExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotExprContext extends ExpresionContext {
		public TerminalNode NOT() { return getToken(SpajingParser.NOT, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public NotExprContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpajingListener ) ((SpajingListener)listener).enterNotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpajingListener ) ((SpajingListener)listener).exitNotExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpajingVisitor ) return ((SpajingVisitor<? extends T>)visitor).visitNotExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicacionContext extends ExpresionContext {
		public Token op;
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public MultiplicacionContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpajingListener ) ((SpajingListener)listener).enterMultiplicacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpajingListener ) ((SpajingListener)listener).exitMultiplicacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpajingVisitor ) return ((SpajingVisitor<? extends T>)visitor).visitMultiplicacion(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrExprContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode OR() { return getToken(SpajingParser.OR, 0); }
		public OrExprContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpajingListener ) ((SpajingListener)listener).enterOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpajingListener ) ((SpajingListener)listener).exitOrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpajingVisitor ) return ((SpajingVisitor<? extends T>)visitor).visitOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LlamadaExprContext extends ExpresionContext {
		public TerminalNode ID() { return getToken(SpajingParser.ID, 0); }
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public LlamadaExprContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpajingListener ) ((SpajingListener)listener).enterLlamadaExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpajingListener ) ((SpajingListener)listener).exitLlamadaExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpajingVisitor ) return ((SpajingVisitor<? extends T>)visitor).visitLlamadaExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		return expresion(0);
	}

	private ExpresionContext expresion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpresionContext _localctx = new ExpresionContext(_ctx, _parentState);
		ExpresionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expresion, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(139);
				match(NOT);
				setState(140);
				expresion(5);
				}
				break;
			case 2:
				{
				_localctx = new ParentesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(141);
				match(T__1);
				setState(142);
				expresion(0);
				setState(143);
				match(T__2);
				}
				break;
			case 3:
				{
				_localctx = new LlamadaExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(145);
				match(ID);
				setState(146);
				match(T__1);
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 536870912004L) != 0)) {
					{
					setState(147);
					argumentos();
					}
				}

				setState(150);
				match(T__2);
				}
				break;
			case 4:
				{
				_localctx = new LiteralExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(151);
				literal();
				}
				break;
			case 5:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(152);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(172);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(170);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicacionContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(155);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(156);
						((MultiplicacionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 448L) != 0)) ) {
							((MultiplicacionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(157);
						expresion(11);
						}
						break;
					case 2:
						{
						_localctx = new AdicionContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(158);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(159);
						((AdicionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__8 || _la==T__9) ) {
							((AdicionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(160);
						expresion(10);
						}
						break;
					case 3:
						{
						_localctx = new ComparacionContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(161);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(162);
						((ComparacionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 129024L) != 0)) ) {
							((ComparacionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(163);
						expresion(9);
						}
						break;
					case 4:
						{
						_localctx = new AndExprContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(164);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(165);
						match(AND);
						setState(166);
						expresion(8);
						}
						break;
					case 5:
						{
						_localctx = new OrExprContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(167);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(168);
						match(OR);
						setState(169);
						expresion(7);
						}
						break;
					}
					} 
				}
				setState(174);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode ENTERO() { return getToken(SpajingParser.ENTERO, 0); }
		public TerminalNode REAL() { return getToken(SpajingParser.REAL, 0); }
		public TerminalNode CADENA() { return getToken(SpajingParser.CADENA, 0); }
		public TerminalNode BOOLEANO() { return getToken(SpajingParser.BOOLEANO, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SpajingListener ) ((SpajingListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SpajingListener ) ((SpajingListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SpajingVisitor ) return ((SpajingVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 257698037760L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 15:
			return expresion_sempred((ExpresionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expresion_sempred(ExpresionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001(\u00b2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0004\u0000\'\b\u0000\u000b\u0000\f\u0000(\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00012\b"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0005\u0002<\b\u0002\n\u0002\f\u0002?\t"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0005\u0004E\b"+
		"\u0004\n\u0004\f\u0004H\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005Q\b\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\tg\b\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0003\fz\b\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0005"+
		"\r\u0082\b\r\n\r\f\r\u0085\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0095"+
		"\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u009a\b\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00ab\b\u000f\n\u000f"+
		"\f\u000f\u00ae\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0000\u0001"+
		"\u001e\u0011\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \u0000\u0005\u0001\u0000\u001a\u001d\u0001\u0000"+
		"\u0006\b\u0001\u0000\t\n\u0001\u0000\u000b\u0010\u0001\u0000\"%\u00b7"+
		"\u0000\"\u0001\u0000\u0000\u0000\u0002-\u0001\u0000\u0000\u0000\u0004"+
		"8\u0001\u0000\u0000\u0000\u0006@\u0001\u0000\u0000\u0000\bF\u0001\u0000"+
		"\u0000\u0000\nP\u0001\u0000\u0000\u0000\fR\u0001\u0000\u0000\u0000\u000e"+
		"X\u0001\u0000\u0000\u0000\u0010Z\u0001\u0000\u0000\u0000\u0012_\u0001"+
		"\u0000\u0000\u0000\u0014j\u0001\u0000\u0000\u0000\u0016p\u0001\u0000\u0000"+
		"\u0000\u0018v\u0001\u0000\u0000\u0000\u001a~\u0001\u0000\u0000\u0000\u001c"+
		"\u0086\u0001\u0000\u0000\u0000\u001e\u0099\u0001\u0000\u0000\u0000 \u00af"+
		"\u0001\u0000\u0000\u0000\"#\u0005\u0011\u0000\u0000#$\u0005&\u0000\u0000"+
		"$&\u0005\u0001\u0000\u0000%\'\u0003\u0002\u0001\u0000&%\u0001\u0000\u0000"+
		"\u0000\'(\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000()\u0001\u0000"+
		"\u0000\u0000)*\u0001\u0000\u0000\u0000*+\u0005\u0018\u0000\u0000+,\u0005"+
		"\u0000\u0000\u0001,\u0001\u0001\u0000\u0000\u0000-.\u0005\u0012\u0000"+
		"\u0000./\u0005&\u0000\u0000/1\u0005\u0002\u0000\u000002\u0003\u0004\u0002"+
		"\u000010\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u000023\u0001\u0000"+
		"\u0000\u000034\u0005\u0003\u0000\u000045\u0005\u0001\u0000\u000056\u0003"+
		"\b\u0004\u000067\u0005\u0019\u0000\u00007\u0003\u0001\u0000\u0000\u0000"+
		"8=\u0003\u0006\u0003\u00009:\u0005\u0004\u0000\u0000:<\u0003\u0006\u0003"+
		"\u0000;9\u0001\u0000\u0000\u0000<?\u0001\u0000\u0000\u0000=;\u0001\u0000"+
		"\u0000\u0000=>\u0001\u0000\u0000\u0000>\u0005\u0001\u0000\u0000\u0000"+
		"?=\u0001\u0000\u0000\u0000@A\u0003\u000e\u0007\u0000AB\u0005&\u0000\u0000"+
		"B\u0007\u0001\u0000\u0000\u0000CE\u0003\n\u0005\u0000DC\u0001\u0000\u0000"+
		"\u0000EH\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000"+
		"\u0000\u0000G\t\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000IQ\u0003"+
		"\f\u0006\u0000JQ\u0003\u0010\b\u0000KQ\u0003\u0012\t\u0000LQ\u0003\u0014"+
		"\n\u0000MQ\u0003\u0016\u000b\u0000NQ\u0003\u0018\f\u0000OQ\u0003\u001c"+
		"\u000e\u0000PI\u0001\u0000\u0000\u0000PJ\u0001\u0000\u0000\u0000PK\u0001"+
		"\u0000\u0000\u0000PL\u0001\u0000\u0000\u0000PM\u0001\u0000\u0000\u0000"+
		"PN\u0001\u0000\u0000\u0000PO\u0001\u0000\u0000\u0000Q\u000b\u0001\u0000"+
		"\u0000\u0000RS\u0003\u000e\u0007\u0000ST\u0005&\u0000\u0000TU\u0005!\u0000"+
		"\u0000UV\u0003\u001e\u000f\u0000VW\u0005\u0005\u0000\u0000W\r\u0001\u0000"+
		"\u0000\u0000XY\u0007\u0000\u0000\u0000Y\u000f\u0001\u0000\u0000\u0000"+
		"Z[\u0005&\u0000\u0000[\\\u0005!\u0000\u0000\\]\u0003\u001e\u000f\u0000"+
		"]^\u0005\u0005\u0000\u0000^\u0011\u0001\u0000\u0000\u0000_`\u0005\u0014"+
		"\u0000\u0000`a\u0003\u001e\u000f\u0000ab\u0005\u0001\u0000\u0000bf\u0003"+
		"\b\u0004\u0000cd\u0005\u0015\u0000\u0000de\u0005\u0001\u0000\u0000eg\u0003"+
		"\b\u0004\u0000fc\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gh\u0001"+
		"\u0000\u0000\u0000hi\u0005\u0019\u0000\u0000i\u0013\u0001\u0000\u0000"+
		"\u0000jk\u0005\u0016\u0000\u0000kl\u0003\u001e\u000f\u0000lm\u0005\u0001"+
		"\u0000\u0000mn\u0003\b\u0004\u0000no\u0005\u0019\u0000\u0000o\u0015\u0001"+
		"\u0000\u0000\u0000pq\u0005\u0017\u0000\u0000qr\u0005\u0002\u0000\u0000"+
		"rs\u0003\u001e\u000f\u0000st\u0005\u0003\u0000\u0000tu\u0005\u0005\u0000"+
		"\u0000u\u0017\u0001\u0000\u0000\u0000vw\u0005&\u0000\u0000wy\u0005\u0002"+
		"\u0000\u0000xz\u0003\u001a\r\u0000yx\u0001\u0000\u0000\u0000yz\u0001\u0000"+
		"\u0000\u0000z{\u0001\u0000\u0000\u0000{|\u0005\u0003\u0000\u0000|}\u0005"+
		"\u0005\u0000\u0000}\u0019\u0001\u0000\u0000\u0000~\u0083\u0003\u001e\u000f"+
		"\u0000\u007f\u0080\u0005\u0004\u0000\u0000\u0080\u0082\u0003\u001e\u000f"+
		"\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0082\u0085\u0001\u0000\u0000"+
		"\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000"+
		"\u0000\u0084\u001b\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0005\u0013\u0000\u0000\u0087\u0088\u0003\u001e\u000f"+
		"\u0000\u0088\u0089\u0005\u0005\u0000\u0000\u0089\u001d\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0006\u000f\uffff\uffff\u0000\u008b\u008c\u0005 \u0000"+
		"\u0000\u008c\u009a\u0003\u001e\u000f\u0005\u008d\u008e\u0005\u0002\u0000"+
		"\u0000\u008e\u008f\u0003\u001e\u000f\u0000\u008f\u0090\u0005\u0003\u0000"+
		"\u0000\u0090\u009a\u0001\u0000\u0000\u0000\u0091\u0092\u0005&\u0000\u0000"+
		"\u0092\u0094\u0005\u0002\u0000\u0000\u0093\u0095\u0003\u001a\r\u0000\u0094"+
		"\u0093\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095"+
		"\u0096\u0001\u0000\u0000\u0000\u0096\u009a\u0005\u0003\u0000\u0000\u0097"+
		"\u009a\u0003 \u0010\u0000\u0098\u009a\u0005&\u0000\u0000\u0099\u008a\u0001"+
		"\u0000\u0000\u0000\u0099\u008d\u0001\u0000\u0000\u0000\u0099\u0091\u0001"+
		"\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099\u0098\u0001"+
		"\u0000\u0000\u0000\u009a\u00ac\u0001\u0000\u0000\u0000\u009b\u009c\n\n"+
		"\u0000\u0000\u009c\u009d\u0007\u0001\u0000\u0000\u009d\u00ab\u0003\u001e"+
		"\u000f\u000b\u009e\u009f\n\t\u0000\u0000\u009f\u00a0\u0007\u0002\u0000"+
		"\u0000\u00a0\u00ab\u0003\u001e\u000f\n\u00a1\u00a2\n\b\u0000\u0000\u00a2"+
		"\u00a3\u0007\u0003\u0000\u0000\u00a3\u00ab\u0003\u001e\u000f\t\u00a4\u00a5"+
		"\n\u0007\u0000\u0000\u00a5\u00a6\u0005\u001e\u0000\u0000\u00a6\u00ab\u0003"+
		"\u001e\u000f\b\u00a7\u00a8\n\u0006\u0000\u0000\u00a8\u00a9\u0005\u001f"+
		"\u0000\u0000\u00a9\u00ab\u0003\u001e\u000f\u0007\u00aa\u009b\u0001\u0000"+
		"\u0000\u0000\u00aa\u009e\u0001\u0000\u0000\u0000\u00aa\u00a1\u0001\u0000"+
		"\u0000\u0000\u00aa\u00a4\u0001\u0000\u0000\u0000\u00aa\u00a7\u0001\u0000"+
		"\u0000\u0000\u00ab\u00ae\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000"+
		"\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u001f\u0001\u0000"+
		"\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00af\u00b0\u0007\u0004"+
		"\u0000\u0000\u00b0!\u0001\u0000\u0000\u0000\f(1=FPfy\u0083\u0094\u0099"+
		"\u00aa\u00ac";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}