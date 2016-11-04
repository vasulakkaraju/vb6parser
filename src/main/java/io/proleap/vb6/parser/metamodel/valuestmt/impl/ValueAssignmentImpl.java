/*
 * Copyright (C) 2016, Ulrich Wolffgang <u.wol@wwu.de>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD 3-clause license. See the LICENSE file for details.
 */

package io.proleap.vb6.parser.metamodel.valuestmt.impl;

import io.proleap.vb6.VisualBasic6Parser.VsAssignContext;
import io.proleap.vb6.parser.metamodel.Arg;
import io.proleap.vb6.parser.metamodel.Constant;
import io.proleap.vb6.parser.metamodel.Module;
import io.proleap.vb6.parser.metamodel.PropertyLet;
import io.proleap.vb6.parser.metamodel.PropertySet;
import io.proleap.vb6.parser.metamodel.Variable;
import io.proleap.vb6.parser.metamodel.call.Call;
import io.proleap.vb6.parser.metamodel.oop.Scope;
import io.proleap.vb6.parser.metamodel.oop.Type;
import io.proleap.vb6.parser.metamodel.valuestmt.ValueAssignment;
import io.proleap.vb6.parser.metamodel.valuestmt.ValueStmt;

public class ValueAssignmentImpl extends ValueStmtImpl implements ValueAssignment {

	protected Arg arg;

	protected Call assignedVariableCall;

	protected Constant constant;

	protected final VsAssignContext ctx;

	protected PropertyLet propertyLet;

	protected PropertySet propertySet;

	protected ValueStmt rightHandValueStmt;

	protected Variable variable;

	public ValueAssignmentImpl(final Module module, final Scope superScope, final VsAssignContext ctx) {
		super(module, superScope, ctx);

		this.ctx = ctx;
	}

	@Override
	public Arg getArg() {
		return arg;
	}

	@Override
	public Call getAssignedVariableCall() {
		return assignedVariableCall;
	}

	@Override
	public Constant getConstant() {
		return constant;
	}

	@Override
	public VsAssignContext getCtx() {
		return ctx;
	}

	@Override
	public PropertyLet getPropertyLet() {
		return propertyLet;
	}

	@Override
	public PropertySet getPropertySet() {
		return propertySet;
	}

	@Override
	public ValueStmt getRightHandValueStmt() {
		return rightHandValueStmt;
	}

	@Override
	public Type getType() {
		return null;
	}

	@Override
	public Variable getVariable() {
		return variable;
	}

	@Override
	public void setArg(final Arg arg) {
		this.arg = arg;
	}

	@Override
	public void setAssignedVariableCall(final Call assignedVariableCall) {
		this.assignedVariableCall = assignedVariableCall;
	}

	@Override
	public void setConstant(final Constant constant) {
		this.constant = constant;
	}

	@Override
	public void setPropertyLet(final PropertyLet propertyLet) {
		this.propertyLet = propertyLet;
	}

	@Override
	public void setPropertySet(final PropertySet propertySet) {
		this.propertySet = propertySet;
	}

	@Override
	public void setRightHandValueStmt(final ValueStmt rightHandValueStmt) {
		this.rightHandValueStmt = rightHandValueStmt;
	}

	@Override
	public void setVariable(final Variable variable) {
		this.variable = variable;
	}

}