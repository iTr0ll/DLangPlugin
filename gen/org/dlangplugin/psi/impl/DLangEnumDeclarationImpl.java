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

public class DLangEnumDeclarationImpl extends DLangCompositeElementImpl implements DLangEnumDeclaration {

  public DLangEnumDeclarationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DLangVisitor) ((DLangVisitor)visitor).visitEnumDeclaration(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public DLangEnumBody getEnumBody() {
    return findNotNullChildByClass(DLangEnumBody.class);
  }

  @Override
  @Nullable
  public DLangType getType() {
    return findChildByClass(DLangType.class);
  }

}
