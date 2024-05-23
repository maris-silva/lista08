package extra;

public class StringComp {
    public static void main(String[] args) {
	        int n = 10000;
	        long startTime, endTime;
	        
	        // Usando a classe String
	        startTime = System.currentTimeMillis();
	        String str = "";
	        for (int i = 0; i < n; i++) {
	            str += "a";
	        }
	        endTime = System.currentTimeMillis();
	        System.out.println("Tempo usando String: " + (endTime - startTime) + " ms");
	        
	        // Usando a classe StringBuffer
	        startTime = System.currentTimeMillis();
	        StringBuffer sb = new StringBuffer();
	        for (int i = 0; i < n; i++) {
	            sb.append("a");
	        }
	        endTime = System.currentTimeMillis();
	        System.out.println("Tempo usando StringBuffer: " + (endTime - startTime) + " ms");
    }
}

// SAÍDA DE EXEMPLO DO PROGRAMA
// Tempo usando String: 41 ms
// Tempo usando StringBuffer: 1 ms


// vemos que a concatenação é muito mais rápida para o StringBuffer, porque diferente da classe "String" ela é alterável/mutável - daí o nome "buffer". A cada concatenação, 
// enquanto String gera uma nova instância de String para a concatenação, StringBuffer permite a atualização da instância atual, sendo útil para operações com muitas alterações
// nas Strings, como acima.