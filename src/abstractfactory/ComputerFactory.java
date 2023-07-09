/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;


public interface ComputerFactory {
 
	public abstract Computer createComputer();

    public Computer createComputer(String _gb, String _gb0, String _gHz);
}