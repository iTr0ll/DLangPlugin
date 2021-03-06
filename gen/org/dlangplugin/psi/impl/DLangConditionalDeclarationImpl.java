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

public class DLangConditionalDeclarationImpl extends DLangCompositeElementImpl implements DLangConditionalDeclaration {

  public DLangConditionalDeclarationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DLangVisitor) ((DLangVisitor)visitor).visitConditionalDeclaration(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public DLangCondition getCondition() {
    return findNotNullChildByClass(DLangCondition.class);
  }

  @Override
  @NotNull
  public List<DLangDeclDef> getDeclDefList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DLangDeclDef.class);
  }

  @Override
  @Nullable
  public DLangDeclarationBlock getDeclarationBlock() {
    return findChildByClass(DLangDeclarationBlock.class);
  }

}
