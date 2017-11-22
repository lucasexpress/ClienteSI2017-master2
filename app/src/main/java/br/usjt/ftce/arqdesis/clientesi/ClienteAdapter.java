package br.usjt.ftce.arqdesis.clientesi;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by asbonato on 11/10/17.
 */

public class ClienteAdapter extends BaseAdapter{
    Activity contexto;
    Cliente[] clientes;

    public ClienteAdapter(Activity contexto, Cliente[] clientes) {
        this.contexto = contexto;
        this.clientes = clientes;
    }

    @Override
    public int getCount() {
        return clientes.length;
    }

    @Override
    public Object getItem(int position) {
        if (position >=0 && position < clientes.length)
            return clientes[position];
        else
            return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = null;
        LayoutInflater inflater = (LayoutInflater)
                contexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(R.layout.linha_cliente, parent, false);
        ImageView foto = (ImageView)view.findViewById(R.id.foto_cliente);
        TextView nome = (TextView)view.findViewById(R.id.nome_cliente);
        TextView detalhe = (TextView)view.findViewById(R.id.detalhe_cliente);

        nome.setText(clientes[position].getNome());
        detalhe.setText(String.format("%s - %s", clientes[position].getFone(),
                clientes[position].getEmail()));
        Drawable drawable = Util.getDrawable(contexto, clientes[position].getFoto());
        System.out.println(clientes[position].getFoto());
        foto.setImageDrawable(drawable);

        return view;
    }
}
