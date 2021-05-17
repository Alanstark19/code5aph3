package com.example.hwreciclerviewaph;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static android.widget.Toast.LENGTH_SHORT;

public class MainActivity extends AppCompatActivity {
    //lista de todos los elementos
    List<ListElement> elemets;
    //int gridColumnCount =
    //        getResources().getInteger(R.integer.grid_column_count);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

    }

    public void init(){
        elemets = new ArrayList<>();
        String[] ingredientes = {"1 taza de leche evaporada",
                "1 taza de leche condensada",
                "6 huevos enteros",
                "1 cucharadita de extracto de vainilla",
                "6 cucharadas de azúcar",
                "1 pizca de canela en polvo, opcional",
                "1 lata de media crema, (opcional)",
                "1 queso crema, 190 g (opcional)"};
        int [] fotos_proceso = {R.drawable.flan};
        elemets.add(new ListElement(R.drawable.flan, "Flan con miel", "800 kcal por porción",
                ingredientes,
                "\n" +
                        "Precalienta el horno a 175 ° C.\n" +
                        "En una ollita, coloca el azúcar y calienta a fuego medio hasta que se forme un caramelo; viértelo antes de que se enfríe sobre el molde de flan y reserva.\n" +
                        "Licúa todos los ingredientes hasta que se incorporen muy bien, añade al molde donde ya estará el caramelo frío y duro.\n" +
                        "Mételo al horno en baño María (dentro de otro molde con un poco de agua), cuida que no le entre agua al flan. Si no quieres que se dore, tápalo con papel aluminio.\n" +
                        "Déjalo en el horno por 45 minutos aproximadamente a 170°, y retira hasta que le piques con un cuchillo y este salga limpio. " +
                        "Si en ese momento lo quieres dorar, quita el papel aluminio y deja dorar por 10 minutos. Sácalo y deja enfriar. Refrigéralo y desmóldalo; " +
                        "disfrútalo frío.","Si quieres hacer una versión más deliciosa sigue todos los pasos igual, pero añade 1 lata de media crema y un queso crema philadelphia, harás una versión sensacional. Que lo disfruten.",
                "8 Porciones",
                "una cuchara xd, horno, estufa, papel alumnio, molde, sarten ",
                fotos_proceso));


        String[] ingredientes2 = {"1 taza de leche evaporada",
                "2 tazas de coliflor",
                "2 huevos",
                "1 1/2 tazas de harina de almendra",
                "1/2 tazas de queso parmesano, rallado",
                "1 cucharadita de orégano",
                "1 cucharadita de tomillo",
                "1 cucharadita de sal",
                "1 sartén",
                "suficiente de aceite en aerosol",
                "1 taza de salsa de tomate, para pizza",
                "1 taza de queso asadero, rallado",
                "1 taza de jitomate bola, en rodajas",
                "1/2 cucharaditas de orégano"};
        int [] fotos_proceso2 = {R.drawable.pizza};
        elemets.add(new ListElement(R.drawable.pizza, "Pizza", "2000 kcal por porción",
                ingredientes2,
                        "Ralla la coliflor finamente sobre una tabla.\n" +
                                "Coloca la coliflor en un bowl con un trapo, tapa con plástico adherente y calienta en el microondas por 5 minutos. Exprime para quitar el exceso de agua, recuerda que debe de estar lo menos húmeda posible.\n" +
                                "Agrega el huevo, la harina de almendra, el queso parmesano, el orégano, el tomillo, la sal y mezcla hasta tener una masa homogénea.\n" +
                                "Sobre una superficie enharinada, extiende la masa con ayuda de un rodillo. Coloca la masa extendida sobre el sartén FlavorStone® y dale la forma de pizza.\n" +
                                "Vierte la salsa, el queso asadero, el jitomate y el orégano. Tapa y cocina a fuego muy bajo por aproximadamente 30 minutos o hasta que la masa esté bien cocida.\n" +
                                "Sirve caliente y disfruta.",
                "Puedes sustituir la harina de almendra por avena molida.",
                "6 Porciones",
                "rallador, sarten, un bowl, plastico aderente, microondas",
                fotos_proceso2));

        String[] ingredientes3 = {
                "400 gramos de carne molida, de res",
                "50 gramos de tocino",
                "1 paquete de bollo de hamburguesa",
                "10 rebanadas de queso cheddar",
                "2 cucharadas de mostaza",
                "1 huevo",
                "1 cucharada de sal",
                "1 cucharada de pimienta",
                "100 gramos de queso parmesano",
                "1 bolsa de bombón"
                };
        int [] fotos_proceso3 = {R.drawable.hamburgueza};
        elemets.add(new ListElement(R.drawable.hamburgueza, "Hamburguesa", "3,144 kcal por porción",
                ingredientes3,
                "En un recipiente se pone la carne molida y se le agrega el huevo, la sal y la pimienta.\n" +
                        "A esta mezcla se le agrega dos cucharadas de mostaza y el queso parmesano.\n" +
                        "Una vez teniendo toda la mezcla preparada se hacen las bolitas de carne y se utiliza un molde en forma de estrella y se ponen en la plancha.\n" +
                        "Se prepara la hamburgesa y para adornarla se usan bombones para que sean los ojos de las hamburgesas esos los puedes detener con unos palillos, de la misma forma puedes cortar el jitomate como se muestra en la foto.",
                "Se puede acompañar con unas papas a la francesa o un tipo de ensalada como rusa para que tus hijos se alimenten de la mejor forma.",
                "4 Porciones",
                "estufa, espatula ",
                fotos_proceso3));

        String[] ingredientes4 = {"1 taza de leche evaporada",
                "1 taza de leche condensada",
                "6 huevos enteros",
                "1 cucharadita de extracto de vainilla",
                "6 cucharadas de azúcar",
                "1 pizca de canela en polvo, opcional",
                "1 lata de media crema, (opcional)",
                "1 queso crema, 190 g (opcional)"};
        int [] fotos_proceso4 = {R.drawable.hot_dog};
        elemets.add(new ListElement(R.drawable.hot_dog, "Flan con miel", "800 kcal por porción",
                ingredientes4,
                "\n" +
                        "Precalienta el horno a 175 ° C.\n" +
                        "En una ollita, coloca el azúcar y calienta a fuego medio hasta que se forme un caramelo; viértelo antes de que se enfríe sobre el molde de flan y reserva.\n" +
                        "Licúa todos los ingredientes hasta que se incorporen muy bien, añade al molde donde ya estará el caramelo frío y duro.\n" +
                        "Mételo al horno en baño María (dentro de otro molde con un poco de agua), cuida que no le entre agua al flan. Si no quieres que se dore, tápalo con papel aluminio.\n" +
                        "Déjalo en el horno por 45 minutos aproximadamente a 170°, y retira hasta que le piques con un cuchillo y este salga limpio. " +
                        "Si en ese momento lo quieres dorar, quita el papel aluminio y deja dorar por 10 minutos. Sácalo y deja enfriar. Refrigéralo y desmóldalo; " +
                        "disfrútalo frío.","Si quieres hacer una versión más deliciosa sigue todos los pasos igual, pero añade 1 lata de media crema y un queso crema philadelphia, harás una versión sensacional. Que lo disfruten.",
                "8 Porciones",
                "una cuchara xd, horno, estufa, papel alumnio, molde, sarten ",
                fotos_proceso4));

        String[] ingredientes5 = {"1 taza de leche evaporada",
                "1 taza de leche condensada",
                "6 huevos enteros",
                "1 cucharadita de extracto de vainilla",
                "6 cucharadas de azúcar",
                "1 pizca de canela en polvo, opcional",
                "1 lata de media crema, (opcional)",
                "1 queso crema, 190 g (opcional)"};
        int [] fotos_proceso5 = {R.drawable.pay_de_limon};
        elemets.add(new ListElement(R.drawable.pay_de_limon, "Flan con miel", "800 kcal por porción",
                ingredientes5,
                "\n" +
                        "Precalienta el horno a 175 ° C.\n" +
                        "En una ollita, coloca el azúcar y calienta a fuego medio hasta que se forme un caramelo; viértelo antes de que se enfríe sobre el molde de flan y reserva.\n" +
                        "Licúa todos los ingredientes hasta que se incorporen muy bien, añade al molde donde ya estará el caramelo frío y duro.\n" +
                        "Mételo al horno en baño María (dentro de otro molde con un poco de agua), cuida que no le entre agua al flan. Si no quieres que se dore, tápalo con papel aluminio.\n" +
                        "Déjalo en el horno por 45 minutos aproximadamente a 170°, y retira hasta que le piques con un cuchillo y este salga limpio. " +
                        "Si en ese momento lo quieres dorar, quita el papel aluminio y deja dorar por 10 minutos. Sácalo y deja enfriar. Refrigéralo y desmóldalo; " +
                        "disfrútalo frío.","Si quieres hacer una versión más deliciosa sigue todos los pasos igual, pero añade 1 lata de media crema y un queso crema philadelphia, harás una versión sensacional. Que lo disfruten.",
                "8 Porciones",
                "una cuchara xd, horno, estufa, papel alumnio, molde, sarten ",
                fotos_proceso5));

        String[] ingredientes6 = {"1 taza de leche evaporada",
                "1 taza de leche condensada",
                "6 huevos enteros",
                "1 cucharadita de extracto de vainilla",
                "6 cucharadas de azúcar",
                "1 pizca de canela en polvo, opcional",
                "1 lata de media crema, (opcional)",
                "1 queso crema, 190 g (opcional)"};
        int [] fotos_proceso6 = {R.drawable.paletas_de_sandia};
        elemets.add(new ListElement(R.drawable.paletas_de_sandia, "Flan con miel", "800 kcal por porción",
                ingredientes6,
                "\n" +
                        "Precalienta el horno a 175 ° C.\n" +
                        "En una ollita, coloca el azúcar y calienta a fuego medio hasta que se forme un caramelo; viértelo antes de que se enfríe sobre el molde de flan y reserva.\n" +
                        "Licúa todos los ingredientes hasta que se incorporen muy bien, añade al molde donde ya estará el caramelo frío y duro.\n" +
                        "Mételo al horno en baño María (dentro de otro molde con un poco de agua), cuida que no le entre agua al flan. Si no quieres que se dore, tápalo con papel aluminio.\n" +
                        "Déjalo en el horno por 45 minutos aproximadamente a 170°, y retira hasta que le piques con un cuchillo y este salga limpio. " +
                        "Si en ese momento lo quieres dorar, quita el papel aluminio y deja dorar por 10 minutos. Sácalo y deja enfriar. Refrigéralo y desmóldalo; " +
                        "disfrútalo frío.","Si quieres hacer una versión más deliciosa sigue todos los pasos igual, pero añade 1 lata de media crema y un queso crema philadelphia, harás una versión sensacional. Que lo disfruten.",
                "8 Porciones",
                "una cuchara xd, horno, estufa, papel alumnio, molde, sarten ",
                fotos_proceso6));

        elemets.add(new ListElement(R.drawable.flan, "Flan con miel", "800 kcal por porción",
                ingredientes,
                "\n" +
                        "Precalienta el horno a 175 ° C.\n" +
                        "En una ollita, coloca el azúcar y calienta a fuego medio hasta que se forme un caramelo; viértelo antes de que se enfríe sobre el molde de flan y reserva.\n" +
                        "Licúa todos los ingredientes hasta que se incorporen muy bien, añade al molde donde ya estará el caramelo frío y duro.\n" +
                        "Mételo al horno en baño María (dentro de otro molde con un poco de agua), cuida que no le entre agua al flan. Si no quieres que se dore, tápalo con papel aluminio.\n" +
                        "Déjalo en el horno por 45 minutos aproximadamente a 170°, y retira hasta que le piques con un cuchillo y este salga limpio. " +
                        "Si en ese momento lo quieres dorar, quita el papel aluminio y deja dorar por 10 minutos. Sácalo y deja enfriar. Refrigéralo y desmóldalo; " +
                        "disfrútalo frío.","Si quieres hacer una versión más deliciosa sigue todos los pasos igual, pero añade 1 lata de media crema y un queso crema philadelphia, harás una versión sensacional. Que lo disfruten.",
                "8 Porciones",
                "una cuchara xd, horno, estufa, papel alumnio, molde, sarten ",
                fotos_proceso));



        elemets.add(new ListElement(R.drawable.pizza, "Pizza", "2000 kcal por porción",
                ingredientes2,
                "Ralla la coliflor finamente sobre una tabla.\n" +
                        "Coloca la coliflor en un bowl con un trapo, tapa con plástico adherente y calienta en el microondas por 5 minutos. Exprime para quitar el exceso de agua, recuerda que debe de estar lo menos húmeda posible.\n" +
                        "Agrega el huevo, la harina de almendra, el queso parmesano, el orégano, el tomillo, la sal y mezcla hasta tener una masa homogénea.\n" +
                        "Sobre una superficie enharinada, extiende la masa con ayuda de un rodillo. Coloca la masa extendida sobre el sartén FlavorStone® y dale la forma de pizza.\n" +
                        "Vierte la salsa, el queso asadero, el jitomate y el orégano. Tapa y cocina a fuego muy bajo por aproximadamente 30 minutos o hasta que la masa esté bien cocida.\n" +
                        "Sirve caliente y disfruta.",
                "Puedes sustituir la harina de almendra por avena molida.",
                "6 Porciones",
                "rallador, sarten, un bowl, plastico aderente, microondas",
                fotos_proceso2));


        elemets.add(new ListElement(R.drawable.hamburgueza, "Hamburguesa", "3,144 kcal por porción",
                ingredientes3,
                "En un recipiente se pone la carne molida y se le agrega el huevo, la sal y la pimienta.\n" +
                        "A esta mezcla se le agrega dos cucharadas de mostaza y el queso parmesano.\n" +
                        "Una vez teniendo toda la mezcla preparada se hacen las bolitas de carne y se utiliza un molde en forma de estrella y se ponen en la plancha.\n" +
                        "Se prepara la hamburgesa y para adornarla se usan bombones para que sean los ojos de las hamburgesas esos los puedes detener con unos palillos, de la misma forma puedes cortar el jitomate como se muestra en la foto.",
                "Se puede acompañar con unas papas a la francesa o un tipo de ensalada como rusa para que tus hijos se alimenten de la mejor forma.",
                "4 Porciones",
                "estufa, espatula ",
                fotos_proceso3));


        elemets.add(new ListElement(R.drawable.hot_dog, "Flan con miel", "800 kcal por porción",
                ingredientes4,
                "\n" +
                        "Precalienta el horno a 175 ° C.\n" +
                        "En una ollita, coloca el azúcar y calienta a fuego medio hasta que se forme un caramelo; viértelo antes de que se enfríe sobre el molde de flan y reserva.\n" +
                        "Licúa todos los ingredientes hasta que se incorporen muy bien, añade al molde donde ya estará el caramelo frío y duro.\n" +
                        "Mételo al horno en baño María (dentro de otro molde con un poco de agua), cuida que no le entre agua al flan. Si no quieres que se dore, tápalo con papel aluminio.\n" +
                        "Déjalo en el horno por 45 minutos aproximadamente a 170°, y retira hasta que le piques con un cuchillo y este salga limpio. " +
                        "Si en ese momento lo quieres dorar, quita el papel aluminio y deja dorar por 10 minutos. Sácalo y deja enfriar. Refrigéralo y desmóldalo; " +
                        "disfrútalo frío.","Si quieres hacer una versión más deliciosa sigue todos los pasos igual, pero añade 1 lata de media crema y un queso crema philadelphia, harás una versión sensacional. Que lo disfruten.",
                "8 Porciones",
                "una cuchara xd, horno, estufa, papel alumnio, molde, sarten ",
                fotos_proceso4));


        elemets.add(new ListElement(R.drawable.pay_de_limon, "Flan con miel", "800 kcal por porción",
                ingredientes5,
                "\n" +
                        "Precalienta el horno a 175 ° C.\n" +
                        "En una ollita, coloca el azúcar y calienta a fuego medio hasta que se forme un caramelo; viértelo antes de que se enfríe sobre el molde de flan y reserva.\n" +
                        "Licúa todos los ingredientes hasta que se incorporen muy bien, añade al molde donde ya estará el caramelo frío y duro.\n" +
                        "Mételo al horno en baño María (dentro de otro molde con un poco de agua), cuida que no le entre agua al flan. Si no quieres que se dore, tápalo con papel aluminio.\n" +
                        "Déjalo en el horno por 45 minutos aproximadamente a 170°, y retira hasta que le piques con un cuchillo y este salga limpio. " +
                        "Si en ese momento lo quieres dorar, quita el papel aluminio y deja dorar por 10 minutos. Sácalo y deja enfriar. Refrigéralo y desmóldalo; " +
                        "disfrútalo frío.","Si quieres hacer una versión más deliciosa sigue todos los pasos igual, pero añade 1 lata de media crema y un queso crema philadelphia, harás una versión sensacional. Que lo disfruten.",
                "8 Porciones",
                "una cuchara xd, horno, estufa, papel alumnio, molde, sarten ",
                fotos_proceso5));


        elemets.add(new ListElement(R.drawable.paletas_de_sandia, "Flan con miel", "800 kcal por porción",
                ingredientes6,
                "\n" +
                        "Precalienta el horno a 175 ° C.\n" +
                        "En una ollita, coloca el azúcar y calienta a fuego medio hasta que se forme un caramelo; viértelo antes de que se enfríe sobre el molde de flan y reserva.\n" +
                        "Licúa todos los ingredientes hasta que se incorporen muy bien, añade al molde donde ya estará el caramelo frío y duro.\n" +
                        "Mételo al horno en baño María (dentro de otro molde con un poco de agua), cuida que no le entre agua al flan. Si no quieres que se dore, tápalo con papel aluminio.\n" +
                        "Déjalo en el horno por 45 minutos aproximadamente a 170°, y retira hasta que le piques con un cuchillo y este salga limpio. " +
                        "Si en ese momento lo quieres dorar, quita el papel aluminio y deja dorar por 10 minutos. Sácalo y deja enfriar. Refrigéralo y desmóldalo; " +
                        "disfrútalo frío.","Si quieres hacer una versión más deliciosa sigue todos los pasos igual, pero añade 1 lata de media crema y un queso crema philadelphia, harás una versión sensacional. Que lo disfruten.",
                "8 Porciones",
                "una cuchara xd, horno, estufa, papel alumnio, molde, sarten ",
                fotos_proceso6));



        ListAdapter listAdapter = new ListAdapter(elemets, this);
        RecyclerView recyclerView = findViewById(R.id.listRecyclerView);
        recyclerView.setHasFixedSize(true);
       // recyclerView.setLayoutManager(new LinearLayoutManager(this));//manager lineal

        // Get the appropriate column count.
        int gridColumnCount = getResources().getInteger(R.integer.grid_column_count);

        // Set the Layout Manager.
        recyclerView.setLayoutManager(new GridLayoutManager(
                this, gridColumnCount));
       // recyclerView.setLayoutManager(new
         //       GridLayoutManager(this, gridColumnCount));

        // If there is more than one column, disable swipe to dismiss
        int swipeDirs;
        if(gridColumnCount > 1){
            swipeDirs = 0;
        } else {
            swipeDirs = ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT;
        }

        // Helper class for creating swipe to dismiss and drag and drop
        // functionality
        ItemTouchHelper helper = new ItemTouchHelper(new ItemTouchHelper
                .SimpleCallback(
                ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT |
                        ItemTouchHelper.DOWN | ItemTouchHelper.UP,
                swipeDirs) {
            /**
             * Defines the drag and drop functionality.
             *
             * @param recyclerView The RecyclerView that contains the list items.
             * @param viewHolder The SportsViewHolder that is being moved.
             * @param target The SportsViewHolder that you are switching the
             *               original one with.
             * @return returns true if the item was moved, false otherwise
             */
            @Override
            public boolean onMove(RecyclerView recyclerView,
                                  RecyclerView.ViewHolder viewHolder,
                                  RecyclerView.ViewHolder target) {
                // Get the from and to positions.
                int from = viewHolder.getAdapterPosition();
                int to = target.getAdapterPosition();

                // Swap the items and notify the adapter.
                Collections.swap(elemets, from, to);
                listAdapter.notifyItemMoved(from, to);
                return true;
            }

            /**
             * Defines the swipe to dismiss functionality.
             *
             * @param viewHolder The viewholder being swiped.
             * @param direction The direction it is swiped in.
             */
            @Override
            public void onSwiped(RecyclerView.ViewHolder viewHolder,
                                 int direction) {
                // Remove the item from the dataset.
                elemets.remove(viewHolder.getAdapterPosition());
                // Notify the adapter.
                listAdapter.notifyItemRemoved(viewHolder.getAdapterPosition());
            }
        });

        // Attach the helper to the RecyclerView.
        helper.attachToRecyclerView(recyclerView);


       //agregando el onclicllistener para ir a la otra activity
        listAdapter.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
               int position = recyclerView.getChildAdapterPosition(v);
                /*Toast.makeText(MainActivity.this, "Selecion: "
                        + elemets.get(position).getTitulo().toString(), LENGTH_SHORT).show();*/

               // int position = elemets.getLayoutPosition();
              /*  ListElement select_receta;// = elemets.get(position);
                select_receta.setTitulo(elemets.get(position).getTitulo());
                select_receta.setKcal(elemets.get(position).getKcal());
                select_receta.setConsejos(elemets.get(position).getConsejos());
                select_receta.setImagen(elemets.get(position).getImagen());
                select_receta.setInstrumentos(elemets.get(position).getInstrumentos());
                select_receta.setPorciones(elemets.get(position).getPorciones());
                select_receta.setFotografias(elemets.get(position).getFotografias());
                select_receta.setIngredientes(elemets.get(position).getIngredientes());*/


               ListElement select_receta = elemets.get(position);

                Intent intent = new Intent(getApplicationContext(), detailrecipe.class);
                Bundle bundle = new Bundle();
                //mandando el objeto
                bundle.putSerializable("llave", select_receta);
                intent.putExtras(bundle);
                startActivity(intent);
                overridePendingTransition(R.anim.fade,R.anim.fade);



                /** int position = getLayoutPosition();
                 ListElement element = mRecipeList.get(position);
                 Intent intent = new Intent(context, RecipeActivity.class);
                 Bundle bundle = new Bundle();
                 bundle.putSerializable("item", element);
                 intent.putExtras(bundle);
                 context.startActivity(intent);*/
            }
        });

        recyclerView.setAdapter(listAdapter);//le pasamos el adaptador

    }


    public void resetRecetas(View view) {
        init();
    }
}