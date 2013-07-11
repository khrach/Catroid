/**
 *  Catroid: An on-device visual programming system for Android devices
 *  Copyright (C) 2010-2013 The Catrobat Team
 *  (<http://developer.catrobat.org/credits>)
 *  
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Affero General Public License as
 *  published by the Free Software Foundation, either version 3 of the
 *  License, or (at your option) any later version.
 *  
 *  An additional term exception under section 7 of the GNU Affero
 *  General Public License, version 3, is available at
 *  http://developer.catrobat.org/license_additional_term
 *  
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  GNU Affero General Public License for more details.
 *  
 *  You should have received a copy of the GNU Affero General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.catrobat.catroid.formulaeditor;

import org.catrobat.catroid.multiplayer.Multiplayer;

import android.util.Log;

public class UserVariableShared extends UserVariable {
	private static final long serialVersionUID = 1L;

	public UserVariableShared(String name) {
		super(name);
	}

	@Override
	public Double getValue() {
		return super.getValue();
	}

	@Override
	public void setValue(double value) {
		super.setValue(value);
		// TODO
		// send Value over Bluetooth to other device
		Log.d("SHARED", "Value changed!");
		Multiplayer.sendBtMessage(super.getName(), value);
	}

	@Override
	public String getName() {
		return super.getName();
	}

}
