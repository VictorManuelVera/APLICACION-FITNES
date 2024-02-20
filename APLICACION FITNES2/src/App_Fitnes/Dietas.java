
package App_Fitnes;


public class Dietas extends Registro implements Descripcion{

 @Override
 public void setNombre(String nombre) {
        this.nombre = nombre;
    }

 @Override
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

 @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }

 @Override
    public void setPeso(int peso) {
        this.peso = peso;
    }

 @Override
    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
    
 
    
    public void Dietas_Bajar_PesoM(){
     
        if (edad==12 && estatura<=1.40 && peso>=52) {
            
            System.out.println("\nsu peso normal, segun su edad y estatura debe ser de 41-44 Kg, "
                    + "por lo tanto le recomendamos la siguiente dieta para adelgazar:\n");
            
            System.out.println("Men� 1\n" +
"Desayuno: Es esencial introducir versiones enteras de los l�cteos, y acompa�arlos con tostadas integrales con aceite de oliva y un jugo de frutas natural.\n" +
"Almuerzo: Una ensalada verde con semillas y alguna verdura aportar� energ�a y prote�nas. Tambi�n puede ser pasta con verduras o pescado a la plancha. En el postre ser� importante reducir el consumo de az�car y darles fruta o yogur desnatado.\n" +
"Merienda: No debe ser demasiado contundente. Por ejemplo, un plato basado en fruta o un taz�n de cereales integrales con leche entera.\n" +
"Cena: Puede incluir m�s verduras, pur� de patatas o un plato de pollo con verduras. De postre, un pl�tano o un melocot�n para completar el consumo diario de fruta.\n");   
       
            System.out.println("\nMen� 2\n" +
                    
"Muchas comidas se pueden presentar de manera divertida para que los ni�os se motiven a elegirlas.\n" +
"A continuaci�n, sugerimos otra alternativa para ampliar las posibilidades de la dieta:\n" +
"\n" +
"Desayuno: puede ser un batido de frutas con leche entera, unos cereales integrales o unas tostadas con mermelada light. Tambi�n podr�a ser un yogur entero o unas tostadas con aguacate, aceite de oliva y sal. De esta forma, se adicionan a la dieta de los ni�os una buena cantidad de grasas naturales saludables.\n" +
"Comida: un plato de arroz integral con verduras o setas, unos guisantes con patata o una crema de calabac�n puede aportar a los ni�os una buena cantidad de las verduras diarias requeridas.\n" +
"Merienda: a media tarde es bueno dar a los ni�os un aperitivo basado en fruta o en l�cteos enteros. Para incentivarlos a seguir la dieta, otra opci�n es darles pan con chocolate negro o queso light con miel. As� podr�n tomar algo dulce pero sin un consumo excesivo de az�car.\n" +
"Cena: para terminar su dieta diaria con una ingesta suave, podemos preparar una ensalada de frutas, esp�rragos gratinados o unas brochetas de queso y mozzarella.\n");
            
        }
        if (edad==13 && estatura<=1.50 && estatura<=1.60 && peso>=60) {
            
            System.out.println("\nsu peso normal, segun su edad y estatura debe ser de 46-50 Kg, "
                    + "por lo tanto le recomendamos la siguiente dieta para adelgazar:\n");
            
                        System.out.println("Men� 1\n" +
"Desayuno: Es esencial introducir versiones enteras de los l�cteos, y acompa�arlos con tostadas integrales con aceite de oliva y un jugo de frutas natural.\n" +
"Almuerzo: Una ensalada verde con semillas y alguna verdura aportar� energ�a y prote�nas. Tambi�n puede ser pasta con verduras o pescado a la plancha. En el postre ser� importante reducir el consumo de az�car y darles fruta o yogur desnatado.\n" +
"Merienda: No debe ser demasiado contundente. Por ejemplo, un plato basado en fruta o un taz�n de cereales integrales con leche entera.\n" +
"Cena: Puede incluir m�s verduras, pur� de patatas o un plato de pollo con verduras. De postre, un pl�tano o un melocot�n para completar el consumo diario de fruta.\n");   
       
            System.out.println("Men� 2\n" +
                    
"Muchas comidas se pueden presentar de manera divertida para que los ni�os se motiven a elegirlas.\n" +
"A continuaci�n, sugerimos otra alternativa para ampliar las posibilidades de la dieta:\n" +
"\n" +
"Desayuno: puede ser un batido de frutas con leche entera, unos cereales integrales o unas tostadas con mermelada light. Tambi�n podr�a ser un yogur entero o unas tostadas con aguacate, aceite de oliva y sal. De esta forma, se adicionan a la dieta de los ni�os una buena cantidad de grasas naturales saludables.\n" +
"Comida: un plato de arroz integral con verduras o setas, unos guisantes con patata o una crema de calabac�n puede aportar a los ni�os una buena cantidad de las verduras diarias requeridas.\n" +
"Merienda: a media tarde es bueno dar a los ni�os un aperitivo basado en fruta o en l�cteos enteros. Para incentivarlos a seguir la dieta, otra opci�n es darles pan con chocolate negro o queso light con miel. As� podr�n tomar algo dulce pero sin un consumo excesivo de az�car.\n" +
"Cena: para terminar su dieta diaria con una ingesta suave, podemos preparar una ensalada de frutas, esp�rragos gratinados o unas brochetas de queso y mozzarella.\n"); 
        }
        
        if (edad==14 && estatura<=1.60 && peso>=68 &&estatura<=1.72 ) {
            
            System.out.println("\nsu peso normal, segun su edad y estatura debe ser de 52-57 Kg, "
                    + "por lo tanto le recomendamos la siguiente dieta para adelgazar:\n");
            
            System.out.println("- Reduce tu ingesta cal�rica consumiendo porciones m�s peque�as y evitando alimentos procesados y ricos en grasas saturadas y az�cares.\n" +
"- Aumenta la ingesta de verduras, frutas, prote�nas magras y granos enteros.\n" +
"- Bebe suficiente agua y evita las bebidas azucaradas.\n");
            
        }
        
        if (edad==15 && estatura<1.80 && peso>=73) {
            
            System.out.println("\nsu peso normal, segun su edad y estatura debe ser de 58-64 Kg, "
                    + "por lo tanto le recomendamos la siguiente dieta para adelgazar:\n");
            
            System.out.println("-  - Desayuno: Tortilla de claras de huevo con espinacas y tomate.\n" +
"   - Media ma�ana: Manzana con mantequilla de almendras.\n" +
"   - Almuerzo: Ensalada verde con pechuga de pollo a la plancha.\n" +
"   - Merienda: Batido de prote�nas con agua y una porci�n de fruta.\n" +
"   - Cena: Salm�n a la parrilla con esp�rragos y quinoa.\n" +
"   - Antes de dormir: Infusi�n sin az�car.\n" +
"");
            
        }
        
        if (edad==16 && estatura<=1.82 && peso>=76) {
            
            System.out.println("\nsu peso normal, segun su edad y estatura debe ser de 62-68 Kg, "
                    + "por lo tanto le recomendamos la siguiente dieta para adelgazar:\n");
            
            System.out.println(" - Desayuno: Tortilla de claras de huevo con espinacas y tomate.\n" +
"   - Media ma�ana: Manzana con mantequilla de almendras.\n" +
"   - Almuerzo: Ensalada verde con pechuga de pollo a la plancha.\n" +
"   - Merienda: Batido de prote�nas con agua y una porci�n de fruta.\n" +
"   - Cena: Salm�n a la parrilla con esp�rragos y quinoa.\n" +
"   - Antes de dormir: Infusi�n sin az�car.\n" +
"");
            
        }
        
        if (edad==17 && estatura<=1.82 && peso>=80) {
            
            System.out.println("\nsu peso normal, segun su edad y estatura debe ser de 66-71 Kg, "
                    + "por lo tanto le recomendamos la siguiente dieta para adelgazar:\n");
            
            System.out.println(" - Desayuno: Tortilla de claras de huevo con espinacas y tomate.\n" +
"   - Media ma�ana: Manzana con mantequilla de almendras.\n" +
"   - Almuerzo: Ensalada verde con pechuga de pollo a la plancha.\n" +
"   - Merienda: Batido de prote�nas con agua y una porci�n de fruta.\n" +
"   - Cena: Salm�n a la parrilla con esp�rragos y quinoa.\n" +
"   - Antes de dormir: Infusi�n sin az�car.\n" +
"");
        }
        
        if (edad>=18 && estatura<=1.88 && peso>=82) {
            
            System.out.println("\nsu peso normal, segun su edad y estatura debe ser de 68-76 Kg, "
                    + "por lo tanto le recomendamos la siguiente dieta para adelgazar:\n");
            
            System.out.println(" - Desayuno: Tortilla de claras de huevo con espinacas y tomate.\n" +
"   - Media ma�ana: Manzana con mantequilla de almendras.\n" +
"   - Almuerzo: Ensalada verde con pechuga de pollo a la plancha.\n" +
"   - Merienda: Batido de prote�nas con agua y una porci�n de fruta.\n" +
"   - Cena: Salm�n a la parrilla con esp�rragos y quinoa.\n" +
"   - Antes de dormir: Infusi�n sin az�car.\n" +
"");
            
        }
        else{
            System.out.println("\nQuerido usuario, usted no cuenta con los requisitos de edad, estatura y peso para adelgazar\n");
        }
        
      
     }
    
    
    public void Dietas_Ganar_PesoM(){
        if(edad==12 && estatura<=1.46 && peso<=40){
          
            System.out.println("\nsu peso normal, segun su edad y estatura debe ser de 41-44 Kg, "
                    + "por lo tanto le recomendamos la siguiente dieta para ganar peso:\n");

            System.out.println("- Desayuno: Batido de prote�nas con pl�tano y avena, tostadas con aguacate.\n" +
"   - Media ma�ana: Yogur griego con frutos secos.\n" +
"   - Almuerzo: Pollo a la plancha con arroz integral y verduras al vapor.\n" +
"   - Merienda: Batido de prote�nas con frutas y nueces.\n" +
"   - Cena: Pescado al horno con patatas y ensalada.\n" +
"   - Antes de dormir: Batido de case�na con leche.\n");
                    
        }
        
        if (edad==13 && estatura<=1.56 || estatura>=1.56 && peso<46) {
            
            System.out.println("\nsu peso normal, segun su edad y estatura debe ser de 46-50 Kg, "
                    + "por lo tanto le recomendamos la siguiente dieta para ganar peso:\n");
            
            System.out.println("- Desayuno: Batido de prote�nas con pl�tano y avena, tostadas con aguacate.\n" +
"   - Media ma�ana: Yogur griego con frutos secos.\n" +
"   - Almuerzo: Pollo a la plancha con arroz integral y verduras al vapor.\n" +
"   - Merienda: Batido de prote�nas con frutas y nueces.\n" +
"   - Cena: Pescado al horno con patatas y ensalada.\n" +
"   - Antes de dormir: Batido de case�na con leche.\n");
        }
        
        if (edad==14 && estatura<=1.60 || estatura>1.60 && peso<52) {
            
            System.out.println("\nsu peso normal, segun su edad y estatura debe ser de 52-57 Kg, "
                    + "por lo tanto le recomendamos la siguiente dieta para ganar peso:\n");
            
            System.out.println("- Desayuno: Batido de prote�nas con pl�tano y avena, tostadas con aguacate.\n" +
"   - Media ma�ana: Yogur griego con frutos secos.\n" +
"   - Almuerzo: Pollo a la plancha con arroz integral y verduras al vapor.\n" +
"   - Merienda: Batido de prote�nas con frutas y nueces.\n" +
"   - Cena: Pescado al horno con patatas y ensalada.\n" +
"   - Antes de dormir: Batido de case�na con leche.\n");
            
        }
        
        if (edad==15 && estatura<1.80 || estatura>1.80 && peso<58) {
            
            System.out.println("\nsu peso normal, segun su edad y estatura debe ser de 58-64 Kg, "
                    + "por lo tanto le recomendamos la siguiente dieta para ganar peso:\n");
            
            System.out.println("- Desayuno: Batido de prote�nas con pl�tano y avena, tostadas con aguacate.\n" +
"   - Media ma�ana: Yogur griego con frutos secos.\n" +
"   - Almuerzo: Pollo a la plancha con arroz integral y verduras al vapor.\n" +
"   - Merienda: Batido de prote�nas con frutas y nueces.\n" +
"   - Cena: Pescado al horno con patatas y ensalada.\n" +
"   - Antes de dormir: Batido de case�na con leche.\n");
            
        }
        
        if (edad==16 && estatura<=1.82 || estatura>1.82 && peso<62) {
            
            System.out.println("\nsu peso normal, segun su edad y estatura debe ser de 62-68 Kg, "
                    + "por lo tanto le recomendamos la siguiente dieta para ganar peso:\n");
            
            System.out.println("- Desayuno: Batido de prote�nas con pl�tano y avena, tostadas con aguacate.\n" +
"   - Media ma�ana: Yogur griego con frutos secos.\n" +
"   - Almuerzo: Pollo a la plancha con arroz integral y verduras al vapor.\n" +
"   - Merienda: Batido de prote�nas con frutas y nueces.\n" +
"   - Cena: Pescado al horno con patatas y ensalada.\n" +
"   - Antes de dormir: Batido de case�na con leche.\n");
            
        }
        
        if (edad==17 && estatura<=1.82 || estatura>1.82 && peso<66) {
            
            System.out.println("\nsu peso normal, segun su edad y estatura debe ser de 66-71 Kg, "
                    + "por lo tanto le recomendamos la siguiente dieta para ganar peso:\n");
            
            System.out.println("- Desayuno: Batido de prote�nas con pl�tano y avena, tostadas con aguacate.\n" +
"   - Media ma�ana: Yogur griego con frutos secos.\n" +
"   - Almuerzo: Pollo a la plancha con arroz integral y verduras al vapor.\n" +
"   - Merienda: Batido de prote�nas con frutas y nueces.\n" +
"   - Cena: Pescado al horno con patatas y ensalada.\n" +
"   - Antes de dormir: Batido de case�na con leche.\n");
        }
        
        if (edad>=18 && estatura<=1.88 || estatura>1.88 && peso<68) {
            
            System.out.println("\nsu peso normal, segun su edad y estatura debe ser de 68-76 Kg, "
                    + "por lo tanto le recomendamos la siguiente dieta para ganar peso:\n");
            
            System.out.println("- Desayuno: Batido de prote�nas con pl�tano y avena, tostadas con aguacate.\n" +
"   - Media ma�ana: Yogur griego con frutos secos.\n" +
"   - Almuerzo: Pollo a la plancha con arroz integral y verduras al vapor.\n" +
"   - Merienda: Batido de prote�nas con frutas y nueces.\n" +
"   - Cena: Pescado al horno con patatas y ensalada.\n" +
"   - Antes de dormir: Batido de case�na con leche.\n");
            
        } 
        else{
            System.out.println("\nQuerido usuario, usted no cuenta con los requisitos de edad, estatura y peso para ganar peso\n");
        }
        
    }
    
    public void Dietas_Ganar_Masa_MuscularM(){
        System.out.println("\nPara ganar masa muscular primero debes ganar peso, por lo tanto en estas dietas"
                + "te daremos unos alimentos con una gran cantidad de proteinas, bueno, empezemos:\n");
        
        System.out.println(" Desayuno: Tortitas de avena y claras de huevo con pl�tano.\n" +
"   - Media ma�ana: Batido de prote�nas con leche y frutos secos.\n" +
"   - Almuerzo: Carne magra (ternera, pollo, pavo) con arroz integral y verduras al vapor.\n" +
"   - Merienda pre-entrenamiento: Batido de prote�nas con frutas y avena.\n" +
"   - Merienda post-entrenamiento: Batido de prote�nas con leche y pl�tano.\n" +
"   - Cena: Pescado al horno con patatas y ensalada.\n" +
"   - Antes de dormir: Batido de case�na�con�leche.\n");
        
    }
    public void Dietas_Mantener_Masa_MuscularM(){
        
        System.out.println("\nSi desea mantener tu musculatura deberas deberas seguir la siguiente dieta:\n");
    
        System.out.println("- Consume suficiente prote�na a trav�s de fuentes como pollo, pavo, pescado, huevos, productos l�cteos bajos en grasa, legumbres y tofu.\n" +
"- Incluye carbohidratos complejos como arroz integral, quinoa y patatas.\n" +
"- Aseg�rate de obtener grasas saludables de fuentes como aguacate, aceite de oliva�y�frutos�secos.\n");
    }
    
    @Override
    public void descripcion() {
        System.out.println("\nAntes de realizar una dieta es recomendable que sepas lo que significa realizar una:\n");
        System.out.println("\nUna dieta es un conjunto de alimentos ");
        System.out.println("y platillos que se consumen cada d�a, y constituye la unidad de la alimentaci�n.");
        System.out.println("En este caso, las dietas que te daremos serviran para que disminuyas");
        System.out.println("tu peso, lo aumentes o lo mantengas igual.\n");
    }
  
}
