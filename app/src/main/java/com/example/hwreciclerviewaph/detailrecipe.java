package com.example.hwreciclerviewaph;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class detailrecipe extends AppCompatActivity {
    private ImageView Rec_imagen;
    private TextView Rec_porcion, Rec_ingredientes, Rec_proceso, Rec_consejos;

   /* @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.fade,R.anim.fade);
    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailrecipe);

       // ListElement receta = (ListElement) getIntent().getSerializableExtra("item");

        Rec_imagen = (ImageView) this.findViewById(R.id.RecetaImageView);
        Rec_porcion = (TextView) findViewById(R.id.etRecetaPorciones);
        Rec_ingredientes = (TextView) findViewById(R.id.etRecetaIngredientes);
        Rec_proceso = (TextView) findViewById(R.id.etRecetaProceso);
        Rec_consejos = (TextView) findViewById(R.id.etRecetaConsejos);

       /* Rec_imagen.setImageResource(receta.getImagen());
        Rec_porcion.setText(receta.getPorciones());
        //Rec_ingredientes.setText(receta.getIngredientes().toString();
        Rec_proceso.setText(receta.getProceso());
        Rec_consejos.setText(receta.getConsejos());*/

        Bundle objentoEnviado = getIntent().getExtras();
        ListElement receta=null;

        if(objentoEnviado!=null){
            receta= (ListElement) objentoEnviado.getSerializable("llave");
            Rec_imagen.setImageResource(receta.getImagen());
            Rec_porcion.setText(receta.getPorciones());
            String ingredientes_concat = concatenar(receta.getIngredientes());
            Rec_ingredientes.setText(ingredientes_concat);
            Rec_proceso.setText(receta.getProceso());
            Rec_consejos.setText(receta.getConsejos());

        }
    }

    public String concatenar(String[] ingredientes){
        String ingredientes_concatenados="", resp="";
            for(int i=0; i<ingredientes.length; i++){
                ingredientes_concatenados = resp + ingredientes[i];
                resp = ingredientes_concatenados;
            }
            return ingredientes_concatenados;
    }



}