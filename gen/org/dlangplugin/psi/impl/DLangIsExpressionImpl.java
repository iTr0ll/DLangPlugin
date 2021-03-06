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

public class DLangIsExpressionImpl extends DLangCompositeElementImpl implements DLangIsExpression {

  public DLangIsExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DLangVisitor) ((DLangVisitor)visitor).visitIsExpression(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DLangTemplateParameterList getTemplateParameterList() {
    return findChildByClass(DLangTemplateParameterList.class);
  }

  @Override
  @NotNull
  public DLangType getType() {
    return findNotNullChildByClass(DLangType.class);
  }

  @Override
  @Nullable
  public DLangTypeSpecialization getTypeSpecialization() {
    return findChildByClass(DLangTypeSpecialization.class);
  }

}
