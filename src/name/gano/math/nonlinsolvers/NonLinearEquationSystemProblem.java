/*
 * Class meant to be extended for a Nonlinear root finding problem definition
 * =====================================================================
 *   This file is part of JSatTrak.
 *
 *   Copyright 2007-2013 Shawn E. Gano
 *   
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *   
 *       http://www.apache.org/licenses/LICENSE-2.0
 *   
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 * =====================================================================
 */

package name.gano.math.nonlinsolvers;

/**
 *
 * @author sgano
 */
public interface  NonLinearEquationSystemProblem 
{
       
    // function to be over written
    // returns vector of functions evaluated at x
    public abstract double[] evaluateSystemOfEquations(double[] x);
    
}