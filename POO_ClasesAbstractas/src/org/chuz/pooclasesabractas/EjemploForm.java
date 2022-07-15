package org.chuz.pooclasesabractas;

import org.chuz.pooclasesabractas.forms.ElementoForm;
import org.chuz.pooclasesabractas.forms.ImputForm;
import org.chuz.pooclasesabractas.forms.SelectForm;
import org.chuz.pooclasesabractas.forms.TextAreaForm;
import org.chuz.pooclasesabractas.forms.elementos.Opcion;
import org.chuz.pooclasesabractas.validador.LargoValidador;
import org.chuz.pooclasesabractas.validador.NoNuloValidador;
import org.chuz.pooclasesabractas.validador.NumeroValidador;
import org.chuz.pooclasesabractas.validador.RequeridoValidador;
import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class EjemploForm {
    public static void main(String[] args) {


        //No se puede  issnatcia de una clase Abstracta
        //LO que si se puede hacer es crera una clase Anonima
        //una clase anonima se crea al vuelo solo se pude utilizar donde se acrea

        ImputForm username = new ImputForm("username");
        username.addValidador(new RequeridoValidador());

        ImputForm password = new ImputForm("clave, password");
        password.addValidador(new RequeridoValidador());
        password.addValidador(new LargoValidador(6,12));

        ImputForm email = new ImputForm("email", "email");
        email.addValidador(new RequeridoValidador());

        ImputForm edad = new ImputForm("ead" , "number");
        edad.addValidador(new NumeroValidador());


        TextAreaForm experiencia = new TextAreaForm("exp", 5,9);

        SelectForm lenguaje = new SelectForm("lenguaje");
        lenguaje.addValidador(new NoNuloValidador());

        Opcion java = new Opcion("1", "Java");
        lenguaje.addOpcion(java)
                .addOpcion(new Opcion("2", "Pyhton"))
                .addOpcion(new Opcion("3", "JavaScript").isSelected(true))
                .addOpcion(new Opcion("4", "Elixir"))
                .addOpcion(new Opcion("5", "PHP"));


        ElementoForm saludar = new ElementoForm("saludo") {
            @Override
            public String dibujarHTml() {
                return "<input disabled name='"+this.nombre +"' value ='"+this.valor+"'>";
            }
        };

        saludar.setValor("Hola que tal este campo esta desabilitado");


        username.setValor("Jhon Doe");
        password.setValor("a1");
        email.setValor("john.db@correo.com");
        edad.setValor("28");
        java.setSelected(true);
        experiencia.setValor(".......mas de 10 años de experiencia ....");


        //ArrayList implenta List que e suna interafz

        List<ElementoForm> elementos = new ArrayList<>();
        //por detras regersa un arraylist
        // List<ElementoForm> elementos = Arrays.asList(usernmae,);
        elementos.add(username);
        elementos.add(password);
        elementos.add(email);
        elementos.add(edad);
        elementos.add(experiencia);
        elementos.add(lenguaje);
        elementos.add(saludar);


       /*
        for (ElementoForm elemento : elementos){
            System.out.println(elemento.dibujarHTml());
        }
        *
        */

        //otra forma de reccorrer es con forEach
        elementos.forEach(e -> {
            System.out.println(e.dibujarHTml());
        });

        elementos.forEach(e->{
            if(!e.esValido()){
                //metdo de referencia :: significa el metodo es decir le pasmo el valor por referca
                e.getErrores().forEach(err -> System.out.println(e.getNombre() +" :"+err));
            }
        });

    }
}
