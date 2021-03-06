/*******************************************************************************
 * Copyright (c) 2008 Ketan Padegaonkar and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Ketan Padegaonkar - initial API and implementation
 *******************************************************************************/
package org.eclipse.swtbot.swt.finder.results;

import org.eclipse.swt.widgets.Widget;

/**
 * Usage:
 * 
 * <pre>
 * new WidgetResult&lt;Shell&gt;() {
 * 	public Shell run() {
 * 		return PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
 * 	}
 * }
 * </pre>
 * @author Ketan Padegaonkar &lt;KetanPadegaonkar [at] gmail [dot] com&gt;
 * @version $Id$
 * @since 2.0
 */
public interface WidgetResult<T extends Widget> extends Result<T> {
}
