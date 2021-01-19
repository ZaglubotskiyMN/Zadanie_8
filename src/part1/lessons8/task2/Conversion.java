package part1.lessons8.task2;

public class Conversion{

    public static void main(String[] args) {
	Dogovor d1=new Dogovor("3","05/01/2021");
	System.out.println("Договор номер: " + d1.nomer + " от: " + d1.date);
	Akt a1 = Convert.ConvertDogToAkt (d1);
	System.out.println("Сконвертирован в акт номер: " + a1.nomer + " от " + a1.date);
    }

    static class Dogovor {
        String nomer;
        String date;
        public Dogovor(String nomer, String date){
	        this.nomer=nomer;
        	this.date=date;
        }
    }

     static class Akt {
        String nomer;
        String date;
        public Akt(String nomer, String date){
            this.nomer=nomer;
            this.date=date;
        }
    }

    static class Convert{
        public static Akt ConvertDogToAkt(Dogovor dogovor){
		return new Akt ( dogovor.nomer, dogovor.date);

        }

    }


}