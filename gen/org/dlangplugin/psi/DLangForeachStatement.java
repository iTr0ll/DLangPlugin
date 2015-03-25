// This is a generated file. Not intended for manual editing.
package org.dlangplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DLangForeachStatement extends DLangCompositeElement {

  @Nullable
  DLangAsmStatement getAsmStatement();

  @Nullable
  DLangBlockStatement getBlockStatement();

  @Nullable
  DLangBreakStatement getBreakStatement();

  @Nullable
  DLangCaseRangeStatement getCaseRangeStatement();

  @Nullable
  DLangCaseStatement getCaseStatement();

  @Nullable
  DLangConditionalStatement getConditionalStatement();

  @Nullable
  DLangContinueStatement getContinueStatement();

  @Nullable
  DLangDeclaration getDeclaration();

  @Nullable
  DLangDefaultStatement getDefaultStatement();

  @Nullable
  DLangDoStatement getDoStatement();

  @NotNull
  List<DLangExpression> getExpressionList();

  @Nullable
  DLangForStatement getForStatement();

  @Nullable
  DLangForeachRangeStatement getForeachRangeStatement();

  @Nullable
  DLangForeachStatement getForeachStatement();

  @NotNull
  DLangForeachTypes getForeachTypes();

  @Nullable
  DLangGotoStatement getGotoStatement();

  @Nullable
  DLangIfStatement getIfStatement();

  @Nullable
  DLangImportDeclaration getImportDeclaration();

  @Nullable
  DLangMixinStatement getMixinStatement();

  @Nullable
  DLangPragmaStatement getPragmaStatement();

  @Nullable
  DLangReturnStatement getReturnStatement();

  @Nullable
  DLangScopeGuardStatement getScopeGuardStatement();

  @Nullable
  DLangStaticAssert getStaticAssert();

  @Nullable
  DLangSwitchStatement getSwitchStatement();

  @Nullable
  DLangSynchronizedStatement getSynchronizedStatement();

  @Nullable
  DLangTemplateMixin getTemplateMixin();

  @Nullable
  DLangThrowStatement getThrowStatement();

  @Nullable
  DLangTryStatement getTryStatement();

  @Nullable
  DLangWhileStatement getWhileStatement();

  @Nullable
  DLangWithStatement getWithStatement();

}
