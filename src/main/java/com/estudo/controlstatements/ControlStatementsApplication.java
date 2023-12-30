package com.estudo.controlstatements;

import com.estudo.controlstatements.switchstm.SwitchStm;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ControlStatementsApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ControlStatementsApplication.class, args);

		SwitchStm switchStm = context.getBean(SwitchStm.class);
		switchStm.execute();
	}

}
