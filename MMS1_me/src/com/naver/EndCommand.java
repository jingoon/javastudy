package com.naver;

import java.util.Scanner;

import com.naver.Command;

public class EndCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		System.exit(0);
	}
	@Override
	public String toString() {
		return "Á¾·á";
	}

}
