package com.example.hwreciclerviewaph;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> implements View.OnClickListener {

    //variables
    private List<ListElement> mData; //lista que contendra todos los datos de tipo listElement
    private LayoutInflater mInflater;//layout inflater para describir el tipo de layout
    private Context context;//contexto, clase de la que se llama el adaptador
    //escuchador
    private View.OnClickListener listener;


    /**
     * Constructor
     * @param itemList
     * @param context
     */
    public ListAdapter(List<ListElement> itemList, Context context){
        this.mInflater = LayoutInflater.from(context);
        this.context = context;
        this.mData = itemList;
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
    //creando una vista               //referencia de como se mostrara en el recycler
        View view = mInflater.from(parent.getContext()).inflate(R.layout.list_element, parent, false);

        //agregando el listener
        view.setOnClickListener((View.OnClickListener) this);

        //se le asigna la vista al adapter
        return  new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        holder.cv.setAnimation(AnimationUtils.loadAnimation(context, R.anim.transicion));
        holder.bindData(mData.get(position));
    }

    /**
     * método que crea un listado nuevo
     * se definen los item de la lista
     * @param items
     */
    public void setItems(List<ListElement> items){
        mData = items;
    }

    /**
     *método que escuchara el evento del clic
     *
     */
    public void setOnClickListener(View.OnClickListener listener){
        this.listener = listener;
    }
    /**
     * asignando el onclick si el listener no es nulo
     * @param view
     */
    public void onClick(View view) {
        if(listener!=null){
            listener.onClick(view);
        }
    }

    /**
     *
     * declaramos cada elemento del listElemet
     *
     */
    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView iconImage, datailImageView;
        TextView titulo, kcal;
        CardView cv;


        ViewHolder(View itemView){
            super(itemView);
            //uniendo la parte lógica con la grafica con find..
            iconImage = itemView.findViewById(R.id.iconImageView);
            titulo = itemView.findViewById(R.id.tituloTextView);
            kcal = itemView.findViewById(R.id.kcalTextView);
            cv = itemView.findViewById(R.id.cv);
            //detail = itemView.findViewById(R.id.datailImageView);
            //itemView.setOnClickListener(this);
        }

        void bindData(final ListElement item){
            //cambios de cada etiqueta
            iconImage.setImageResource(item.getImagen());
            titulo.setText(item.getTitulo());
            kcal.setText(item.getKcal());
        }

    }



}
