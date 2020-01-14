/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.ignite.ml.xgboost.parser;

import java.util.List;
import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.VocabularyImpl;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * XGBoost model parser generated by ANTLR.
 */
@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XGBoostModelParser extends Parser {
    /** ANTLR version checker. */
    static {
        RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION);
    }

    /** DFA. */
    protected static final DFA[] _decisionToDFA;

    /** Shared context cache. */
    protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();

    /** */
    public static final int
        YES = 1, NO = 2, MISSING = 3, EQ = 4, COMMA = 5, PLUS = 6, MINUS = 7, DOT = 8, EXP = 9,
        BOOSTER = 10, LBRACK = 11, RBRACK = 12, COLON = 13, LEAF = 14, INT = 15, DOUBLE = 16,
        STRING = 17, NEWLINE = 18, LT = 19, WS = 20;

    /** */
    public static final int
        RULE_xgValue = 0, RULE_xgHeader = 1, RULE_xgNode = 2, RULE_xgLeaf = 3,
        RULE_xgTree = 4, RULE_xgModel = 5;

    /** Rule names. */
    public static final String[] ruleNames = {
        "xgValue", "xgHeader", "xgNode", "xgLeaf", "xgTree", "xgModel"
    };

    /** Literal names. */
    private static final String[] _LITERAL_NAMES = {
        null, "'yes'", "'no'", "'missing'", "'='", "','", "'+'", "'-'", "'.'",
        null, "'booster'", "'['", "']'", "':'", "'leaf'", null, null, null, null,
        "'<'"
    };

    /** Symbolic names. */
    private static final String[] _SYMBOLIC_NAMES = {
        null, "YES", "NO", "MISSING", "EQ", "COMMA", "PLUS", "MINUS", "DOT", "EXP",
        "BOOSTER", "LBRACK", "RBRACK", "COLON", "LEAF", "INT", "DOUBLE", "STRING",
        "NEWLINE", "LT", "WS"
    };

    /** Vocabulary. */
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

    /**
     * Token names.
     *
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;

    /** */
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

    /** {@inheritDoc} */
    @Deprecated
    @Override public String[] getTokenNames() {
        return tokenNames;
    }

    /** {@inheritDoc} */
    @Override public Vocabulary getVocabulary() {
        return VOCABULARY;
    }

    /** {@inheritDoc} */
    @Override public String getGrammarFileName() {
        return "XGBoostModel.g4";
    }

    /** {@inheritDoc} */
    @Override public String[] getRuleNames() {
        return ruleNames;
    }

    /** {@inheritDoc} */
    @Override public String getSerializedATN() {
        return _serializedATN;
    }

    /** {@inheritDoc} */
    @Override public ATN getATN() {
        return _ATN;
    }

    /**
     * Constructs a new instance of XGBoost model parser.
     *
     * @param input Token stream.
     */
    public XGBoostModelParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    /**
     * XG value context.
     */
    public static class XgValueContext extends ParserRuleContext {
        /** */
        public TerminalNode DOUBLE() {
            return getToken(XGBoostModelParser.DOUBLE, 0);
        }

        /** */
        public TerminalNode INT() {
            return getToken(XGBoostModelParser.INT, 0);
        }

        /**
         * Constructs a new instance of XG value context.
         *
         * @param parent Parent.
         * @param invokingState Invoking state.
         */
        public XgValueContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        /** {@inheritDoc} */
        @Override public int getRuleIndex() {
            return RULE_xgValue;
        }

        /** {@inheritDoc} */
        @Override public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XGBoostModelListener)
                ((XGBoostModelListener)listener).enterXgValue(this);
        }

        /** {@inheritDoc} */
        @Override public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XGBoostModelListener)
                ((XGBoostModelListener)listener).exitXgValue(this);
        }

        /** {@inheritDoc} */
        @Override public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof XGBoostModelVisitor)
                return ((XGBoostModelVisitor<? extends T>)visitor).visitXgValue(this);
            else
                return visitor.visitChildren(this);
        }
    }

    /**
     * Returns XG value.
     *
     * @return XG value.
     * @throws RecognitionException In case of exception.
     */
    public final XgValueContext xgValue() throws RecognitionException {
        XgValueContext _localctx = new XgValueContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_xgValue);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(12);
                _la = _input.LA(1);
                if (!(_la == INT || _la == DOUBLE)) {
                    _errHandler.recoverInline(this);
                }
                else {
                    if (_input.LA(1) == Token.EOF)
                        matchedEOF = true;
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

    /**
     * XG header context.
     */
    public static class XgHeaderContext extends ParserRuleContext {
        /** */
        public TerminalNode BOOSTER() {
            return getToken(XGBoostModelParser.BOOSTER, 0);
        }

        /** */
        public TerminalNode LBRACK() {
            return getToken(XGBoostModelParser.LBRACK, 0);
        }

        /** */
        public TerminalNode INT() {
            return getToken(XGBoostModelParser.INT, 0);
        }

        /** */
        public TerminalNode RBRACK() {
            return getToken(XGBoostModelParser.RBRACK, 0);
        }

        /** */
        public TerminalNode COLON() {
            return getToken(XGBoostModelParser.COLON, 0);
        }

        /**
         * Constructs a new instance of XG header context.
         *
         * @param parent Parent.
         * @param invokingState Invoking state.
         */
        public XgHeaderContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        /** {@inheritDoc} */
        @Override public int getRuleIndex() {
            return RULE_xgHeader;
        }

        /** {@inheritDoc} */
        @Override public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XGBoostModelListener)
                ((XGBoostModelListener)listener).enterXgHeader(this);
        }

        /** {@inheritDoc} */
        @Override public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XGBoostModelListener)
                ((XGBoostModelListener)listener).exitXgHeader(this);
        }

        /** {@inheritDoc} */
        @Override public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof XGBoostModelVisitor)
                return ((XGBoostModelVisitor<? extends T>)visitor).visitXgHeader(this);
            else
                return visitor.visitChildren(this);
        }
    }

    /**
     * Returns XG header.
     *
     * @return XG header.
     * @throws RecognitionException In case of exception.
     */
    public final XgHeaderContext xgHeader() throws RecognitionException {
        XgHeaderContext _localctx = new XgHeaderContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_xgHeader);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(14);
                match(BOOSTER);
                setState(15);
                match(LBRACK);
                setState(16);
                match(INT);
                setState(17);
                match(RBRACK);
                setState(19);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == COLON) {
                    {
                        setState(18);
                        match(COLON);
                    }
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

    /**
     * XG node conext.
     */
    public static class XgNodeContext extends ParserRuleContext {
        /** */
        public List<TerminalNode> INT() {
            return getTokens(XGBoostModelParser.INT);
        }

        /** */
        public TerminalNode INT(int i) {
            return getToken(XGBoostModelParser.INT, i);
        }

        /** */
        public TerminalNode COLON() {
            return getToken(XGBoostModelParser.COLON, 0);
        }

        /** */
        public TerminalNode LBRACK() {
            return getToken(XGBoostModelParser.LBRACK, 0);
        }

        /** */
        public TerminalNode STRING() {
            return getToken(XGBoostModelParser.STRING, 0);
        }

        /** */
        public TerminalNode LT() {
            return getToken(XGBoostModelParser.LT, 0);
        }

        /** */
        public XgValueContext xgValue() {
            return getRuleContext(XgValueContext.class, 0);
        }

        /** */
        public TerminalNode RBRACK() {
            return getToken(XGBoostModelParser.RBRACK, 0);
        }

        /** */
        public TerminalNode YES() {
            return getToken(XGBoostModelParser.YES, 0);
        }

        /** */
        public List<TerminalNode> EQ() {
            return getTokens(XGBoostModelParser.EQ);
        }

        /** */
        public TerminalNode EQ(int i) {
            return getToken(XGBoostModelParser.EQ, i);
        }

        /** */
        public List<TerminalNode> COMMA() {
            return getTokens(XGBoostModelParser.COMMA);
        }

        /** */
        public TerminalNode COMMA(int i) {
            return getToken(XGBoostModelParser.COMMA, i);
        }

        /** */
        public TerminalNode NO() {
            return getToken(XGBoostModelParser.NO, 0);
        }

        /** */
        public TerminalNode MISSING() {
            return getToken(XGBoostModelParser.MISSING, 0);
        }

        /**
         * Constructs a new instance of XG node context.
         *
         * @param parent Parent.
         * @param invokingState Invoking state.
         */
        public XgNodeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        /** {@inheritDoc} */
        @Override public int getRuleIndex() {
            return RULE_xgNode;
        }

        /** {@inheritDoc} */
        @Override public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XGBoostModelListener)
                ((XGBoostModelListener)listener).enterXgNode(this);
        }

        /** {@inheritDoc} */
        @Override public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XGBoostModelListener)
                ((XGBoostModelListener)listener).exitXgNode(this);
        }

        /** {@inheritDoc} */
        @Override public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof XGBoostModelVisitor)
                return ((XGBoostModelVisitor<? extends T>)visitor).visitXgNode(this);
            else
                return visitor.visitChildren(this);
        }
    }

    /**
     * Returns XG node.
     *
     * @return XG node.
     * @throws RecognitionException In case of exception.
     */
    public final XgNodeContext xgNode() throws RecognitionException {
        XgNodeContext _localctx = new XgNodeContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_xgNode);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(21);
                match(INT);
                setState(22);
                match(COLON);
                setState(23);
                match(LBRACK);
                setState(24);
                match(STRING);
                setState(25);
                match(LT);
                setState(26);
                xgValue();
                setState(27);
                match(RBRACK);
                setState(28);
                match(YES);
                setState(29);
                match(EQ);
                setState(30);
                match(INT);
                setState(31);
                match(COMMA);
                setState(32);
                match(NO);
                setState(33);
                match(EQ);
                setState(34);
                match(INT);
                setState(35);
                match(COMMA);
                setState(36);
                match(MISSING);
                setState(37);
                match(EQ);
                setState(38);
                match(INT);
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

    /**
     * XG leaf context.
     */
    public static class XgLeafContext extends ParserRuleContext {
        /** */
        public TerminalNode INT() {
            return getToken(XGBoostModelParser.INT, 0);
        }

        /** */
        public TerminalNode COLON() {
            return getToken(XGBoostModelParser.COLON, 0);
        }

        /** */
        public TerminalNode LEAF() {
            return getToken(XGBoostModelParser.LEAF, 0);
        }

        /** */
        public TerminalNode EQ() {
            return getToken(XGBoostModelParser.EQ, 0);
        }

        /** */
        public XgValueContext xgValue() {
            return getRuleContext(XgValueContext.class, 0);
        }

        /**
         * Constructs a new instance of XG leaf conext.
         *
         * @param parent Parent.
         * @param invokingState Invoking state.
         */
        public XgLeafContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        /** {@inheritDoc} */
        @Override public int getRuleIndex() {
            return RULE_xgLeaf;
        }

        /** {@inheritDoc} */
        @Override public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XGBoostModelListener)
                ((XGBoostModelListener)listener).enterXgLeaf(this);
        }

        /** {@inheritDoc} */
        @Override public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XGBoostModelListener)
                ((XGBoostModelListener)listener).exitXgLeaf(this);
        }

        /** {@inheritDoc} */
        @Override public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof XGBoostModelVisitor)
                return ((XGBoostModelVisitor<? extends T>)visitor).visitXgLeaf(this);
            else
                return visitor.visitChildren(this);
        }
    }

    /**
     * Returns XG leaf.
     *
     * @return XG leaf.
     * @throws RecognitionException In case of exception.
     */
    public final XgLeafContext xgLeaf() throws RecognitionException {
        XgLeafContext _localctx = new XgLeafContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_xgLeaf);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(40);
                match(INT);
                setState(41);
                match(COLON);
                setState(42);
                match(LEAF);
                setState(43);
                match(EQ);
                setState(44);
                xgValue();
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

    /**
     * XG tree context.
     */
    public static class XgTreeContext extends ParserRuleContext {
        /** */
        public XgHeaderContext xgHeader() {
            return getRuleContext(XgHeaderContext.class, 0);
        }

        /** */
        public List<TerminalNode> NEWLINE() {
            return getTokens(XGBoostModelParser.NEWLINE);
        }

        /** */
        public TerminalNode NEWLINE(int i) {
            return getToken(XGBoostModelParser.NEWLINE, i);
        }

        /** */
        public TerminalNode EOF() {
            return getToken(XGBoostModelParser.EOF, 0);
        }

        /** */
        public List<XgLeafContext> xgLeaf() {
            return getRuleContexts(XgLeafContext.class);
        }

        /** */
        public XgLeafContext xgLeaf(int i) {
            return getRuleContext(XgLeafContext.class, i);
        }

        /** */
        public List<XgNodeContext> xgNode() {
            return getRuleContexts(XgNodeContext.class);
        }

        /** */
        public XgNodeContext xgNode(int i) {
            return getRuleContext(XgNodeContext.class, i);
        }

        /**
         * Constructs a new instance of XG tree context.
         *
         * @param parent Parent.
         * @param invokingState Invoking state.
         */
        public XgTreeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        /** {@inheritDoc} */
        @Override public int getRuleIndex() {
            return RULE_xgTree;
        }

        /** {@inheritDoc} */
        @Override public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XGBoostModelListener)
                ((XGBoostModelListener)listener).enterXgTree(this);
        }

        /** {@inheritDoc} */
        @Override public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XGBoostModelListener)
                ((XGBoostModelListener)listener).exitXgTree(this);
        }

        /** {@inheritDoc} */
        @Override public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof XGBoostModelVisitor)
                return ((XGBoostModelVisitor<? extends T>)visitor).visitXgTree(this);
            else
                return visitor.visitChildren(this);
        }
    }

    /** */
    public final XgTreeContext xgTree() throws RecognitionException {
        XgTreeContext _localctx = new XgTreeContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_xgTree);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(46);
                xgHeader();
                setState(47);
                match(NEWLINE);
                setState(83);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 8, _ctx)) {
                    case 1: {
                        setState(54);
                        _errHandler.sync(this);
                        _alt = 1;
                        do {
                            switch (_alt) {
                                case 1: {
                                    {
                                        setState(50);
                                        _errHandler.sync(this);
                                        switch (getInterpreter().adaptivePredict(_input, 1, _ctx)) {
                                            case 1: {
                                                setState(48);
                                                xgLeaf();
                                            }
                                            break;
                                            case 2: {
                                                setState(49);
                                                xgNode();
                                            }
                                            break;
                                        }
                                        setState(52);
                                        match(NEWLINE);
                                    }
                                }
                                break;
                                default:
                                    throw new NoViableAltException(this);
                            }
                            setState(56);
                            _errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input, 2, _ctx);
                        }
                        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
                        setState(64);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == INT) {
                            {
                                setState(60);
                                _errHandler.sync(this);
                                switch (getInterpreter().adaptivePredict(_input, 3, _ctx)) {
                                    case 1: {
                                        setState(58);
                                        xgLeaf();
                                    }
                                    break;
                                    case 2: {
                                        setState(59);
                                        xgNode();
                                    }
                                    break;
                                }
                                setState(62);
                                match(EOF);
                            }
                        }

                    }
                    break;
                    case 2: {
                        setState(74);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 6, _ctx);
                        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                            if (_alt == 1) {
                                {
                                    {
                                        setState(68);
                                        _errHandler.sync(this);
                                        switch (getInterpreter().adaptivePredict(_input, 5, _ctx)) {
                                            case 1: {
                                                setState(66);
                                                xgLeaf();
                                            }
                                            break;
                                            case 2: {
                                                setState(67);
                                                xgNode();
                                            }
                                            break;
                                        }
                                        setState(70);
                                        match(NEWLINE);
                                    }
                                }
                            }
                            setState(76);
                            _errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input, 6, _ctx);
                        }
                        setState(79);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 7, _ctx)) {
                            case 1: {
                                setState(77);
                                xgLeaf();
                            }
                            break;
                            case 2: {
                                setState(78);
                                xgNode();
                            }
                            break;
                        }
                        setState(81);
                        match(EOF);
                    }
                    break;
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

    /**
     * XG model context.
     */
    public static class XgModelContext extends ParserRuleContext {
        /** */
        public List<XgTreeContext> xgTree() {
            return getRuleContexts(XgTreeContext.class);
        }

        /** */
        public XgTreeContext xgTree(int i) {
            return getRuleContext(XgTreeContext.class, i);
        }

        /**
         * Constructs a new instance of XG model context.
         *
         * @param parent Parent.
         * @param invokingState Invoking state.
         */
        public XgModelContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        /** {@inheritDoc} */
        @Override public int getRuleIndex() {
            return RULE_xgModel;
        }

        /** {@inheritDoc} */
        @Override public void enterRule(ParseTreeListener listener) {
            if (listener instanceof XGBoostModelListener)
                ((XGBoostModelListener)listener).enterXgModel(this);
        }

        /** {@inheritDoc} */
        @Override public void exitRule(ParseTreeListener listener) {
            if (listener instanceof XGBoostModelListener)
                ((XGBoostModelListener)listener).exitXgModel(this);
        }

        /** {@inheritDoc} */
        @Override public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof XGBoostModelVisitor)
                return ((XGBoostModelVisitor<? extends T>)visitor).visitXgModel(this);
            else
                return visitor.visitChildren(this);
        }
    }

    /** */
    public final XgModelContext xgModel() throws RecognitionException {
        XgModelContext _localctx = new XgModelContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_xgModel);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(86);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(85);
                            xgTree();
                        }
                    }
                    setState(88);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                while (_la == BOOSTER);
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

    /** Serialized ATN. */
    public static final String _serializedATN =
        "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26]\4\2\t\2\4\3\t" +
            "\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3\26" +
            "\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3" +
            "\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6\65\n\6\3\6\3\6" +
            "\6\69\n\6\r\6\16\6:\3\6\3\6\5\6?\n\6\3\6\3\6\5\6C\n\6\3\6\3\6\5\6G\n\6" +
            "\3\6\3\6\7\6K\n\6\f\6\16\6N\13\6\3\6\3\6\5\6R\n\6\3\6\3\6\5\6V\n\6\3\7" +
            "\6\7Y\n\7\r\7\16\7Z\3\7\2\2\b\2\4\6\b\n\f\2\3\3\2\21\22\2`\2\16\3\2\2" +
            "\2\4\20\3\2\2\2\6\27\3\2\2\2\b*\3\2\2\2\n\60\3\2\2\2\fX\3\2\2\2\16\17" +
            "\t\2\2\2\17\3\3\2\2\2\20\21\7\f\2\2\21\22\7\r\2\2\22\23\7\21\2\2\23\25" +
            "\7\16\2\2\24\26\7\17\2\2\25\24\3\2\2\2\25\26\3\2\2\2\26\5\3\2\2\2\27\30" +
            "\7\21\2\2\30\31\7\17\2\2\31\32\7\r\2\2\32\33\7\23\2\2\33\34\7\25\2\2\34" +
            "\35\5\2\2\2\35\36\7\16\2\2\36\37\7\3\2\2\37 \7\6\2\2 !\7\21\2\2!\"\7\7" +
            "\2\2\"#\7\4\2\2#$\7\6\2\2$%\7\21\2\2%&\7\7\2\2&\'\7\5\2\2\'(\7\6\2\2(" +
            ")\7\21\2\2)\7\3\2\2\2*+\7\21\2\2+,\7\17\2\2,-\7\20\2\2-.\7\6\2\2./\5\2" +
            "\2\2/\t\3\2\2\2\60\61\5\4\3\2\61U\7\24\2\2\62\65\5\b\5\2\63\65\5\6\4\2" +
            "\64\62\3\2\2\2\64\63\3\2\2\2\65\66\3\2\2\2\66\67\7\24\2\2\679\3\2\2\2" +
            "8\64\3\2\2\29:\3\2\2\2:8\3\2\2\2:;\3\2\2\2;B\3\2\2\2<?\5\b\5\2=?\5\6\4" +
            "\2><\3\2\2\2>=\3\2\2\2?@\3\2\2\2@A\7\2\2\3AC\3\2\2\2B>\3\2\2\2BC\3\2\2" +
            "\2CV\3\2\2\2DG\5\b\5\2EG\5\6\4\2FD\3\2\2\2FE\3\2\2\2GH\3\2\2\2HI\7\24" +
            "\2\2IK\3\2\2\2JF\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MQ\3\2\2\2NL\3\2" +
            "\2\2OR\5\b\5\2PR\5\6\4\2QO\3\2\2\2QP\3\2\2\2RS\3\2\2\2ST\7\2\2\3TV\3\2" +
            "\2\2U8\3\2\2\2UL\3\2\2\2V\13\3\2\2\2WY\5\n\6\2XW\3\2\2\2YZ\3\2\2\2ZX\3" +
            "\2\2\2Z[\3\2\2\2[\r\3\2\2\2\f\25\64:>BFLQUZ";

    /** ATN. */
    public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    /** */
    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}
