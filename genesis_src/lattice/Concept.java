package lattice;

import java.util.Set;

public abstract interface Concept<T>
{
  public abstract boolean contains(T paramT);
  
  public abstract void learnPositive(T paramT);
  
  public abstract void learnNegative(T paramT);
  
  public abstract Set<T> maximalElements();
}


/* Location:           C:\Yuya\Development\Genesis\genesis.jar
 * Qualified Name:     lattice.Concept
 * JD-Core Version:    0.7.0.1
 */