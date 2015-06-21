package util;

import java.sql.Time;
import java.util.Date;

import model.Agenda;

public class testes {

	public static void main(String[] args) 
	{
		Agenda agenda = new Agenda();
		agenda.setDataAgenda(new Date());
		agenda.setHora(new Time(1235));
	}

}
