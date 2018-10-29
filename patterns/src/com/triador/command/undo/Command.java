package com.triador.command.undo;

public interface Command {
	public void execute();
	public void undo();
}
