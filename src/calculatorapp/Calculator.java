package calculatorapp;

public class Calculator
{
    private enum Operator { NONE, ADD, SUBTRACT, MULTIPLY, DIVIDE };
    private double value1;
    private double value2;
    private double CurrentValue;
    private Operator op;
    
    public Calculator() //Initializes the default values.
    {
        CurrentValue = 0;
        value1 = 0;
        value2 = 0;
        op = Operator.NONE;
    }
    
    public double getCurrentValue() //Gets the current value.
        {
            return CurrentValue;
        }

        public void setCurrentValue(double displayValue)
        {
            CurrentValue = displayValue;
        }

        public void setValue1(double displayValue)
        {
            value1 = displayValue;
        }

        public void add(double displayValue) //Addition method.
        {
            value1 = displayValue;
            CurrentValue = displayValue;
            op = Operator.ADD;
        }

        public void subtract(double displayValue) //Subtraction method.
        {
            value1 = displayValue;
            CurrentValue = displayValue;
            op = Operator.SUBTRACT;
        }

        public void multiply(double displayValue) //Multiplication method.
        {
            value1 = displayValue;
            CurrentValue = displayValue;
            op = Operator.MULTIPLY;
        }

        public void divide(double displayValue) //Division method.
        {
            value1 = displayValue;
            CurrentValue = displayValue;
            op = Operator.DIVIDE;
        }

        public void none() //So we can reset the operator
        {
            op = Operator.NONE;
        }

        public void equals() //First overloaded equals method, repeats value2 value.
        {
            switch(op)
            {
                case ADD:
                    value1 += value2;
                    CurrentValue = value1;
                    break;
                case SUBTRACT:
                    value1 -= value2;
                    CurrentValue = value1;
                    break;
                case MULTIPLY:
                    value1 *= value2;
                    CurrentValue = value1;
                    break;
                case DIVIDE:
                    value1 /= value2;
                    CurrentValue = value1;
                    break;
                case NONE:
                    break;
                default:
                    break;
            }
        }

        public void equals(double displayValue) //Second overloaded Equals method,
        {                                        //that takes new value2.
            value2 = displayValue;
            switch (op)
            {
                case ADD:
                    value1 += value2;
                    CurrentValue = value1;
                    break;
                case SUBTRACT:
                    value1 -= value2;
                    CurrentValue = value1;
                    break;
                case MULTIPLY:
                    value1 *= value2;
                    CurrentValue = value1;
                    break;
                case DIVIDE:
                    value1 /= value2;
                    CurrentValue = value1;
                    break;
                case NONE:
                    break;
                default:
                    break;
            }
        }

        public void clear() //Resets variables to default values.
        {
            CurrentValue = 0;
            value1 = 0;
            value2 = 0;
            op = Operator.NONE;
        }
}
