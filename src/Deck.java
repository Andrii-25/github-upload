
public class Deck {
	Suit[] s = Suit.values;
	Rank[] r = Rank.values;
	int n = s.length * r.length;
	String[] deck = new String[n];
	//Перемішує колоду у випадковому порядку 
    public void shuffle() {
    	for(int i = 0; i<s.length; i++) {
      		for(int j = 0; j<r.length; j++) {
      			deck[r.length*i+j] =s[i] +" "+ r[j];
      		}
      	}
      	for(int i = 0; i<n; i++) {
      		int rd = i + (int) Math.random() * (n-1);
      		String temp = deck[rd];
      		deck[rd] = deck[i];
      		deck[i] = temp;
      		}
    	
    	for(int i = 0; i<n; i++) {
    		System.out.println(deck[i]);
    	}
    }
    /* * Впорядкування колоди за мастями та значеннями 
    * Порядок сотрування: 
    * Спочатку всі карти з мастю HEARTS, потім DIAMONDS, CLUBS, SPADES 
    * для кожної масті порядок наступний: Ace,King,Queen,Jack,10,9,8,7,6 
    * Наприклад 
    * HEARTS Ace 
    * HEARTS King 
    * HEARTS Queen 
    * HEARTS Jack 
    * HEARTS 10 
    * HEARTS 9 
    * HEARTS 8 
    * HEARTS 7 
    * HEARTS 6 
    * І так далі для DIAMONDS, CLUBS, SPADES */
public void order() {
	for(int i = 0; i<s.length; i++) {
  		for(int j = 0; j<r.length; j++) {
  			deck[r.length*i+j] =s[i] +" "+ r[j];
  		}
  	}
  	for(int i = 0; i<n; i++) {
		System.out.println(deck[i]);
  }
  	}
    
    //Повертає true у випадку коли в колоді ще доступні карти
 public boolean hasNext() {
		if(deck != null) {
			System.out.println("True");
			return true;
		} else {
			return false;
		}
 }
  
    
    //"Виймає" одну карту з колоди, коли буде видано всі 36 карт повертає null
    //Карти виймаються з "вершини" колоди. Наприклад перший виклик видасть SPADES 6 потім
    //SPADES 7, ..., CLUBS 6, ..., CLUBS Ace і так далі до HEARTS Ace
  public void drawOne() {
	  for(int i = 0; i<s.length; i++) {
  		for(int j = 0; j<r.length; j++) {
  			deck[r.length*i+j] =s[i] +" "+ r[j];
  		}
  	}
  	for(int i = 0; i<n; i++) {
  		int rd = i + (int) (Math.random() * (n-i));
  		String temp = deck[rd];
  		deck[rd] = deck[i];
  		deck[i] = temp;
  	}
  	for(int i = 0; i < 1; i++) {
  		System.out.println(deck[i]);
  	}
	}

}

