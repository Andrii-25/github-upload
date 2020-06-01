
public class Deck {
	Suit[] s = Suit.values;
	Rank[] r = Rank.values;
	int n = s.length * r.length;
	String[] deck = new String[n];
	//������� ������ � ����������� ������� 
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
    /* * ������������� ������ �� ������� �� ���������� 
    * ������� ����������: 
    * �������� �� ����� � ����� HEARTS, ���� DIAMONDS, CLUBS, SPADES 
    * ��� ����� ���� ������� ���������: Ace,King,Queen,Jack,10,9,8,7,6 
    * ��������� 
    * HEARTS Ace 
    * HEARTS King 
    * HEARTS Queen 
    * HEARTS Jack 
    * HEARTS 10 
    * HEARTS 9 
    * HEARTS 8 
    * HEARTS 7 
    * HEARTS 6 
    * � ��� ��� ��� DIAMONDS, CLUBS, SPADES */
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
    
    //������� true � ������� ���� � ����� �� ������� �����
 public boolean hasNext() {
		if(deck != null) {
			System.out.println("True");
			return true;
		} else {
			return false;
		}
 }
  
    
    //"�����" ���� ����� � ������, ���� ���� ������ �� 36 ���� ������� null
    //����� ���������� � "�������" ������. ��������� ������ ������ ������� SPADES 6 ����
    //SPADES 7, ..., CLUBS 6, ..., CLUBS Ace � ��� ��� �� HEARTS Ace
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

