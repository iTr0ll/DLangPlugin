package org.dlangplugin.psi;

import com.intellij.psi.tree.TokenSet;

public class DTokenTypeSets implements DTokenTypes {
    public static final TokenSet COMMENTS = TokenSet.create(
            LINE_COMMENT,
            BLOCK_COMMENT,
            NESTING_BLOCK_COMMENT
    );

    public static final TokenSet NUMBERS = TokenSet.create(
            FLOAT_LITERAL,
            INTEGER_LITERAL
    );

    public static final TokenSet STRINGS = TokenSet.create(
            WYSIWYG_STRING,
            ALTERNATE_WYSIWYG_STRING,
            DOUBLE_QUOTED_STRING,
            HEX_STRING,
            DELIMITED_STRING
    );

    public static final TokenSet KEYWORDS = TokenSet.create(
            KEYWORD, KW_MODULE, KW_IMPORT, KW_STATIC, KW_BOOL, KW_BYTE,
            KW_UBYTE, KW_SHORT, KW_USHORT, KW_INT, KW_UINT, KW_LONG,
            KW_ULONG, KW_CHAR, KW_WCHAR, KW_DCHAR, KW_FLOAT, KW_DOUBLE,
            KW_REAL, KW_IFLOAT, KW_IDOUBLE, KW_IREAL, KW_CFLOAT, KW_CDOUBLE,
            KW_CREAL, KW_VOID, KW_TYPEOF, KW_CONST, KW_IMMUTABLE, KW_SHARED,
            KW_INOUT, KW_DELEGATE, KW_FUNCTION, KW_NOTHROW, KW_PURE, KW_THIS,
            KW___FILE__, KW___MODULE__, KW___LINE__, KW___FUNCTION__,
            KW___PRETTY_FUNCTION__, KW_ABSTRACT, KW_ALIAS, KW_AUTO, KW_DEPRECATED,
            KW_ENUM, KW_EXTERN, KW_FINAL, KW_OVERRIDE, KW___GSHARED, KW_SCOPE,
            KW_SYNCHRONIZED, KW_RETURN, KW_SUPER, KW_ALIGN, KW_PRAGMA, KW_PACKAGE,
            KW_PRIVATE, KW_PROTECTED, KW_PUBLIC, KW_EXPORT, KW_PROPERTY, KW_SAFE,
            KW_TRUSTED, KW_SYSTEM, KW_DISABLE, KW_DELETE, KW_NULL, KW_TRUE,
            KW_FALSE, KW_NEW, KW_TYPEID, KW_IS, KW_STRUCT, KW_UNION, KW_CLASS,
            KW_INTERFACE, KW___PARAMETERS, KW_IN, KW_ASM, KW_ASSERT, KW_CASE,
            KW_CAST, KW_REF, KW_BREAK, KW_CONTINUE, KW_DO, KW_ELSE, KW_FOR,
            KW_FOREACH, KW_FOREACH_REVERSE, KW_GOTO, KW_IF, KW_CATCH, KW_FINALLY,
            KW_SWITCH, KW_THROW, KW_TRY, KW_DEFAULT, KW_WHILE, KW_WITH, KW_VERSION,
            KW_DEBUG, KW_MIXIN, KW_INVARIANT, KW_BODY, KW_TEMPLATE, KW_LAZY, KW_OUT, KW_NOGC,
            KW___TRAITS, KW_UNITTEST
    );

    public static final TokenSet OPERATORS = TokenSet.create(
            OP_SCOLON, OP_DOT, OP_COLON, OP_EQ, OP_COMMA, OP_PAR_LEFT, OP_PAR_RIGHT,
            OP_BRACKET_LEFT, OP_BRACKET_RIGHT, OP_ASTERISK, OP_DDOT, OP_TRIPLEDOT, OP_AT,
            OP_PLUS_EQ, OP_MINUS_EQ, OP_MUL_EQ, OP_DIV_EQ, OP_MOD_EQ, OP_AND_EQ, OP_OR_EQ, OP_XOR_EQ,
            OP_TILDA_EQ, OP_SH_LEFT_EQ, OP_SH_RIGHT_EQ, OP_USH_RIGHT_EQ, OP_POW_EQ, OP_QUEST, OP_BOOL_OR,
            OP_BOOL_AND, OP_OR, OP_XOR, OP_SH_LEFT, OP_SH_RIGHT, OP_USH_RIGHT, OP_PLUS, OP_MINUS, OP_TILDA,
            OP_DIV, OP_MOD, OP_AND, OP_PLUS_PLUS, OP_MINUS_MINUS, OP_NOT, OP_POW, OP_DOLLAR,
            OP_EQ_EQ, OP_NOT_EQ, OP_LESS, OP_LESS_EQ, OP_GT, OP_GT_EQ, OP_UNORD, OP_UNORD_EQ, OP_LESS_GR,
            OP_LESS_GR_EQ, OP_NOT_GR, OP_NOT_GR_EQ, OP_NOT_LESS,OP_NOT_LESS_EQ
            );
}
