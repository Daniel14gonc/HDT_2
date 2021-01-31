/**
 * @author Daniel Gonzalez
 * Carné: 20293
 * Modificacion: 01/31/2021
 * Clase: StackVector
 *
 * Descripcion:
 *  Clase que permite implementar las acciones de una calculadora
 *  para expresiones matematicas.
 */

public class Calculadora implements  CalculadoraGeneral{

    private Stack<Double> stack;
    private String nums;
    private String ops;

    public Calculadora(){
        //Post: Crear un vector que almacene los resultados de las operaciones.
        //Crear un string con los digitos decimales.

        stack = new StackVector<Double>();
        nums = "0123456789";
        ops = "+-*/";
    }

    @Override
    public String Calculo(String texto) throws ArithmeticException {
        //Pre: Validar que se haya ingresado un numero.
        //Post: Determinar si se debe almacenar el numero en el vector o se debe hacer una operacion.

        try {
            for(int i = 0; i<texto.length(); i++){
                char op = texto.charAt(i);
                if(nums.contains(Character.toString(op))){
                    stack.push((double) Character.getNumericValue(op));
                }
                else if(ops.contains(Character.toString(op))){
                    postFixEvalution(op);
                }
                else if(op != ' '){
                    return "Error: No se pudo realizar la operacion por invalidez de simbolos";
                }
            }

            //Al finalizar, se debe validar que el stack tenga un solo dato dentro, el cual sera
            //probablemente el resultado de la operacion.

            if(stack.empty() || stack.size() > 1){
                return "Error: Expresion invalida";
            }
            else{
                return stack.pop().toString();
            }
        }
        catch (ArithmeticException e){

            throw new ArithmeticException(e.getMessage());
        }


    }

    private boolean postFixEvalution(char operator) throws ArithmeticException{
        //Pre: Validar que el stack no este vacio y que los operandos sean numeros.
        //Post: Realizar la operacion indicada
        try{
            if(!stack.empty()){
                Double op1 = stack.pop();
                Double op2 = stack.pop();
                if(op1 != null && op2 != null){
                    switch (operator){
                        case '+':
                            stack.push(op2 + op1);
                            break;
                        case '-':
                            stack.push(op2 - op1);
                            break;
                        case '*':
                            stack.push(op2 * op1);
                            break;
                        case '/':
                            stack.push(op2 / op1);
                            break;
                    }

                    return true;
                }
                else
                    return false;
            }
            else{
                return false;
            }
        }
        catch (ArithmeticException e){
            String ex = "Error: Division por 0";
            throw new ArithmeticException(ex);
        }


    }

}