package org.dlangplugin.module;

import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleConfigurationEditor;
import com.intellij.openapi.module.ModuleType;
import com.intellij.openapi.roots.ui.configuration.CommonContentEntriesEditor;
import com.intellij.openapi.roots.ui.configuration.DefaultModuleConfigurationEditorFactory;
import com.intellij.openapi.roots.ui.configuration.ModuleConfigurationEditorProvider;
import com.intellij.openapi.roots.ui.configuration.ModuleConfigurationState;

import java.util.ArrayList;
import java.util.List;


/* DLang Module settings editor. It contains of multiple tabs: Common, Output, Libraries. */
public class DLangModuleEditorsProvider implements ModuleConfigurationEditorProvider {
    public ModuleConfigurationEditor[] createEditors(ModuleConfigurationState state) {
        final Module module = state.getRootModel().getModule();
        if (ModuleType.get(module) != DLangModuleType.getInstance()) {
            return ModuleConfigurationEditor.EMPTY;
        }

        final DefaultModuleConfigurationEditorFactory editorFactory = DefaultModuleConfigurationEditorFactory.getInstance();
        List<ModuleConfigurationEditor> editors = new ArrayList<ModuleConfigurationEditor>();
        editors.add(new CommonContentEntriesEditor(module.getName(), state));
        editors.add(new OutputElementsEditor(state));
        editors.add(editorFactory.createClasspathEditor(state));
        //editors.add(new DLangModuleBuildConfEditor(state)); //TODO: implement DLangModuleBuildConfEditor
        return editors.toArray(new ModuleConfigurationEditor[editors.size()]);
    }
}
