/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempconvert;

/**
 *
 * @author Matthew
 */
public class CelToFarhStrategy implements TempCalc{

    @Override
    public double convertTemp(double temp) {
        return (temp * 1.8) + 32;
    }
    
}
