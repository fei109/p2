/*******************************************************************************
 * Copyright (c) 2007, 2008 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.equinox.internal.p2.engine;

import org.eclipse.equinox.p2.engine.IEngine;
import org.eclipse.equinox.p2.engine.IProfile;


/**
 * @since 2.0
 */
public class BeginOperationEvent extends TransactionEvent {

	private static final long serialVersionUID = 6389318375739324865L;

	public BeginOperationEvent(IProfile profile, PhaseSet phaseSet, Operand[] operands, IEngine engine) {
		super(profile, phaseSet, operands, engine);
	}
}
