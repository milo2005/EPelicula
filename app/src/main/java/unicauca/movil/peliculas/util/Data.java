package unicauca.movil.peliculas.util;

import java.util.ArrayList;
import java.util.List;

import unicauca.movil.peliculas.models.Pelicula;

public class Data {

    private static List<Pelicula> peliculas;
    public static List<Pelicula> getPeliculas(){
        if(peliculas ==  null){
            peliculas =  new ArrayList<>();

            Pelicula p1 = new Pelicula();
            p1.setNombre("Wonder Woman");
            p1.setDuracion("210 min");
            p1.setEstreno("30 de Mayo");
            p1.setImagen("http://static.dnaindia.com/sites/default/files/2017/03/11/555566-wonder-woman-poster.jpg");
            p1.setSinopsis("Diana, una princesa guerrera perteneciente al pueblo de las amazonas, fue criada en una isla protegida y entrenada para ser una luchadora invencible. Después de que un piloto estadounidense, Steve Trevor, se estrellase en dicha isla, es salvado por la princesa, a quien le relata sobre el desarrollo de una guerra mundial que está sucediendo. Entonces, Diana sale de su hogar para tratar de detener la guerra.");

            Pelicula p2 = new Pelicula();
            p2.setNombre("Alien Covenan");
            p2.setDuracion("220 min");
            p2.setEstreno("18 de Mayo");
            p2.setImagen("http://cde.cinescape.com.pe/ima/0/0/1/8/2/182162.jpg");
            p2.setSinopsis("En 2104, la nave colonial Covenant, con 2000 colonos y 1400 embriones a bordo, se dirige al remoto planeta Origae-6, vigilados por el androide Walter. Una onda de radiación neutrónica daña la nave, matando al capitán y despertando a la tripulación. Mientras reparan los daños, la tripulación detecta una señal de radio de origen humano procedente de un planeta cercano que aparentemente no tiene vida. En contra del criterio de Daniels, la experta en terraformación, el capitán Oram, oficial ejecutivo de la nave, decide investigar.");

            Pelicula p3 = new Pelicula();
            p3.setNombre("Justice League");
            p3.setDuracion("240 min");
            p3.setEstreno("16 de Noviembre");
            p3.setImagen("http://www.cheatsheet.com/wp-content/uploads/2016/07/Justice-League-first-image.jpg");
            p3.setSinopsis("Alimentado por su restaurada fe en la humanidad e inspirado por el acto desinteresado de Superman, Bruce Wayne recluta la ayuda de su recién encontrada aliada, Diana Prince, para enfrentarse a un enemigo aún mayor. Juntos, Batman y Wonder Woman trabajan deprisa para encontrar y reclutar un equipo de metahumanos para plantar cara a esta nueva amenaza creciente. Pero pese a la formación de esta liga de héroes sin precedentes – Batman, Wonder Woman, Aquaman, Cyborg y Flash, quizás sea demasiado tarde para salvar el planeta de un asalto de proporciones catastróficas.");

            Pelicula p4 = new Pelicula();
            p4.setNombre("La Momia");
            p4.setDuracion("190 min");
            p4.setEstreno("08 de Junio");
            p4.setImagen("http://www.carlost.net/wp-content/uploads/2016/12/La-Momia-2017-Trailer-Subtitulado-Carlost.jpg");
            p4.setSinopsis("Tras encontrar y desenterrar a una momia perteneciente a una antigua princesa egipcia (Sofia Boutella) cuyo destino le fue arrebatado injustamente, un grupo de comandos militares trasladan la momia a Londres. Sin embargo, la momia despierta en mitad del vuelo, desencadenando el caos y comenzando su venganza.");

            Pelicula p5 = new Pelicula();
            p5.setNombre("Spiderman");
            p5.setDuracion("190 min");
            p5.setEstreno("13 de Julio");
            p5.setImagen("http://sm.ign.com/ign_latam/screenshot/default/spidermanhomecomingposter_u8zq.jpg");
            p5.setSinopsis("Después de los acontecimientos de Capitán América: Civil War, Peter Parker, con la ayuda de su mentor Tony Stark, trata de equilibrar su vida como un estudiante de secundaria ordinaria en Queens, Nueva York con su lucha contra el crimen como su superhéroe alter ego Spider-Man mientras una nueva amenaza, el Buitre, aparece.");

        }
        return  peliculas;
    }

}
