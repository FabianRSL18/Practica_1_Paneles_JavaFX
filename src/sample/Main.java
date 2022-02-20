package sample;

import javafx.application.Application;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.TilePane;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.geometry.Pos;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.layout.AnchorPane;

public class Main extends Application {

    private VBox cajaVertical;//Declaramos un objeto de tipo VBox del ejemplo 1 y 2
    private BorderPane raiz;//Declaramos un objeto de tipo BorderPane del ejemplo 3
    private FlowPane flow;//Declaramos un objeto de tipo FlowPane del ejemplo 4,5 y 6
    private GridPane grid;//Declaramos un objeto de tipo GridPane del ejemplo 7,8 y 9
    private StackPane sp;//Declaramos un objeto de tipo StackPane del ejemplo 10,11,12 y 13
    private TilePane tile;//Declaramos un objeto de tipo TilePane del ejemplo 14,15
    private AnchorPane anchor;//Declaramos un objeto de tipo AnchorPane del ultimo ejemplo

    public void start(Stage stage) {
        //Primer ejemplo Layout Vbox
        /*
        cajaVertical = new VBox();//Inicializamos el objeto

        cajaVertical.getChildren().add(new Button("Boton 1"));//agregamos un nodo hijo de tipo Button
        cajaVertical.getChildren().add(new Button("Boton 2"));//agregamos un nodo hijo de tipo Button
        cajaVertical.getChildren().add(new Button("Boton 3"));//agregamos un nodo hijo de tipo Button

        Scene s = new Scene(cajaVertical);//Creamos la escena y le pasamos como parámetro nuestro layout
        stage.setScene(s);//Seteamos en la ventana el layout
        stage.show();//y mostramos la ventana
        */

        //Segundo ejemplo Layout VBox (Primera pero mejor distribuida)
        /*
        cajaVertical = new VBox(10);//Asignamos 10 pixeles de separacion entre los nodos
        cajaVertical.setPadding(new Insets(15)); //Agregamos un relleno de 15 pixeles para separarlo del borde de la ventana
        cajaVertical.getChildren().addAll(new Button("Boton 1"), new Button("Boton 2"), new Button("Boton 3"));//llamando al metodo addAll podemos agregar nodos en una sola linea

        Scene s = new Scene(cajaVertical);
        stage.setScene(s);
        stage.show();
        */

        //Tercer ejemplo Layout BorderPane
        /*
        raiz = new BorderPane();

        raiz.setTop(new Button("TOP"));
        raiz.setBottom(new Button("BOTTOM"));
        raiz.setLeft(new Button("LEFT"));
        raiz.setRight(new Button("RIGHT"));
        raiz.setCenter(new Button("CENTER"));

        Scene scene = new Scene(raiz);

        stage.setScene(scene);
        stage.show();
        */

        //Cuarto ejemplo Layout FlowPane (Constructor vacio)
        /*
        flow = new FlowPane();
        flow.getChildren().addAll(new Button("Boton 1"), new Button("Boton 2"), new Button("Boton 3"));

        Scene s = new Scene(flow);
        stage.setScene(s);
        stage.show();
        */

        //Quinto ejemplo Layout FlowPane horientazion vertical
        /*
        flow = new FlowPane(Orientation.VERTICAL);//Establecemos la orientación
        flow.getChildren().addAll(new Button("Boton 1"), new Button("Boton 2"), new Button("Boton 3"));

        Scene s = new Scene(flow);
        stage.setScene(s);
        stage.show();
        */

        //Sexto ejemplo Layout FlowPane Espaciado entre nodos (implementacion del ejemplo 2 y 5)
        /*
        flow = new FlowPane(Orientation.VERTICAL);
        flow.setVgap(10);//Seteamos la separación vertical entre los nodos.
        flow.getChildren().addAll(new Button("Boton 1"), new Button("Boton 2"), new Button("Boton 3"));

        Scene s = new Scene(flow);
        stage.setScene(s);
        stage.show();
        */

        //Septimo ejmmplo Layout GridPane
        /*
        grid = new GridPane();

        grid.add(new Button("Posicion 0, 0"), 0, 0);
        grid.add(new Button("Posicion 0, 1"), 0, 1);
        grid.add(new Button("Posicion 0, 2"), 0, 2);

        Scene s = new Scene(grid);
        stage.setScene(s);
        stage.show();
        */

        //Octavo ejemplo Layout GridPane (Espaciado enrtre nodos)
        /*
        grid = new GridPane();
        grid.setVgap(10);
        grid.add(new Button("Posicion 0, 0"), 0, 0);
        grid.add(new Button("Posicion 0, 1"), 0, 1);
        grid.add(new Button("Posicion 0, 2"), 0, 2);

        Scene s = new Scene(grid);
        stage.setScene(s);
        stage.show();
        */

        //Noveno ejemplo Layout GridPane estilizado matriz
        /*
        grid = new GridPane();
        grid.setVgap(10);
        grid.setHgap(10);
        grid.add(new Button("Posicion 0, 0"), 0, 0);
        grid.add(new Button("Posicion 1, 0"), 1, 0 );
        grid.add(new Button("Posicion 0, 1"), 0, 1);
        grid.add(new Button("Posicion 1, 1"), 1, 1);
        grid.add(new Button("Posicion 0, 2"), 0, 2);
        grid.add(new Button("Posicion 1, 2"), 1, 2);

        Scene s = new Scene(grid);
        stage.setScene(s);
        stage.show();
        */

        //Decimo ejemplo Layout StackPane
        /*
        sp = new StackPane();
        sp.getChildren().addAll(new Button("Boton 1"), new Button("Botont 2"), new Button("Boton 3"));

        Scene s = new Scene(sp);
        stage.setScene(s);
        stage.show();
        */

        //Onceavo ejemplo Layout StackPane (objetos encimados)
        /*
        sp = new StackPane();
        sp.setPadding(new Insets(15));
        sp.getChildren().addAll(new Rectangle(150, 150, Color.DARKBLUE),new Button("Boton 1"));

        Scene s = new Scene(sp);
        stage.setScene(s);
        stage.show();
        */

        //Doceavo ejemplo Layout StackPane (Asignacion de lugar de los objetos)
        /*
        sp = new StackPane();
        sp.setPadding(new Insets(15));
        sp.setAlignment(Pos.BOTTOM_RIGHT);//Simplemente asignamos la alineacion al objeto
        sp.getChildren().addAll(new Rectangle(150, 150, Color.DARKBLUE),new Button("Boton 1"));

        Scene s = new Scene(sp);
        stage.setScene(s);
        stage.show();
        */

        //Treceavo ejemplo Layout StackPane (Asignacion de lugar de los nodos)
        /*
        sp = new StackPane();
        Button b1, b2, b3;
        b1 = new Button("Boton 1");
        b2 = new Button("Boton 2");
        b3 = new Button("Boton 3");

        StackPane.setAlignment(b1, Pos.CENTER);
        StackPane.setAlignment(b2, Pos.BOTTOM_CENTER);
        StackPane.setAlignment(b3, Pos.TOP_RIGHT);
        sp.getChildren().addAll(b1, b2, b3);

        Scene s = new Scene(sp);
        stage.setScene(s);
        stage.show();
        */

        //Catorceavo ejemplo TilePane
        /*
        tile = new TilePane();//Por defecto la posicion horizontal
        tile.setPrefColumns(6);//Declaramos 6 columnas
        tile.setPrefRows(4);//Y 4 filas
        for(int i = 0; i < 20; i++) {
            tile.getChildren().add(new Button("Boton "+ i));
        }
        Scene s = new Scene(tile);
        stage.setScene(s);
        stage.show();
        */

        //Quinceavo ejemplo TilePane (Orientacion en vertical)
        /*
        tile = new TilePane(Orientation.VERTICAL);
        tile.setPrefColumns(6);
        tile.setPrefRows(4);
        for(int i = 0; i < 20; i++) {
            tile.getChildren().add(new Button("Boton "+ i));
        }
        Scene s = new Scene(tile);
        stage.setScene(s);
        stage.show();
        */

        //Ultimo ejemplo AnchorPane

        anchor  = new AnchorPane();

        Button b2  = new Button("Boton 2");
        Button b3 = new Button("Boton 3");
        AnchorPane.setTopAnchor(b2, 10.0);
        AnchorPane.setRightAnchor(b2, 10.0);

        AnchorPane.setBottomAnchor(b3, 20.0);
        AnchorPane.setLeftAnchor(b3, 20.0);

        anchor.getChildren().addAll(new Button("Boton 1"), b2, b3);

        Scene s = new Scene(anchor);
        stage.setScene(s);
        stage.show();
        

    }




}
