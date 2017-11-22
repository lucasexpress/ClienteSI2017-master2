package br.usjt.ftce.arqdesis.clientesi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

public class ListaClientesActivity extends Activity {
    String busca;
    Cliente[] clientes;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_clientes);
        Intent intent = getIntent();
        busca = intent.getStringExtra(MainActivity.CHAVE);
        clientes = Data.buscaClientes(busca);
        ClienteAdapter adapter = new ClienteAdapter(this, clientes);
        listView = (ListView)findViewById(R.id.listview);
        listView.setAdapter(adapter);


    }

}
