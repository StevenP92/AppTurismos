package com.appturisticas.especializacion.valleturistica.Adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.appturisticas.especializacion.valleturistica.Entidades.Sitios;
import com.appturisticas.especializacion.valleturistica.R;
import com.google.android.gms.vision.text.Text;

import java.util.ArrayList;

/**
 * Created by KEVIN on 08/06/2017.
 */

public class SitiosAdapter extends BaseAdapter {

    private ArrayList<Sitios> listData = new ArrayList<Sitios>();
    private LayoutInflater layoutInflater;

    public SitiosAdapter(Context aContext, ArrayList<Sitios> listData){
        this.listData = listData;
        layoutInflater = LayoutInflater.from(aContext);
    }

    @Override
    public int getCount() {
        return listData.size();
    }

    @Override
    public Object getItem(int position) {
        return listData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null){
            convertView = layoutInflater.inflate(R.layout.content_lst_sitios, null);
            holder = new ViewHolder();
            holder.txtId = (TextView) convertView.findViewById(R.id.txtMosIdSitio);
            holder.txtNombre = (TextView) convertView.findViewById(R.id.txtMosNomSitio);
            holder.txtDireccion = (TextView) convertView.findViewById(R.id.txtMosDirecSitio);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }

        holder.txtId.setTag(""+listData.get(position).getDireccion());
        holder.txtNombre.setTag(""+listData.get(position).getDireccion());
        holder.txtDireccion.setTag(""+listData.get(position).getDireccion());
        return null;
    }
}

class ViewHolder{
    TextView txtId;
    TextView txtNombre;
    TextView txtDireccion;
}
