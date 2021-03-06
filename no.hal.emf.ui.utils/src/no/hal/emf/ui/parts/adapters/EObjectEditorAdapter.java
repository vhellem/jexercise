package no.hal.emf.ui.parts.adapters;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.widgets.Control;

public interface EObjectEditorAdapter<E extends EObject, V extends Control> extends EObjectUIAdapter<E, V> {
	
	EObject getEditable();
}
