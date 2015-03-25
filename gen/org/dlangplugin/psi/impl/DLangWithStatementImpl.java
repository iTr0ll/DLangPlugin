// This is a generated file. Not intended for manual editing.
package org.dlangplugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.dlangplugin.psi.DTokenTypes.*;
import org.dlangplugin.psi.*;

public class DLangWithStatementImpl extends DLangCompositeElementImpl implements DLangWithStatement {

  public DLangWithStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DLangVisitor) ((DLangVisitor)visitor).visitWithStatement(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DLangExpression getExpression() {
    return findChildByClass(DLangExpression.class);
  }

  @Override
  @NotNull
  public DLangScopeStatement getScopeStatement() {
    return findNotNullChildByClass(DLangScopeStatement.class);
  }

  @Override
  @Nullable
  public DLangSymbol getSymbol() {
    return findChildByClass(DLangSymbol.class);
  }

  @Override
  @Nullable
  public DLangTemplateInstance getTemplateInstance() {
    return findChildByClass(DLangTemplateInstance.class);
  }

}
