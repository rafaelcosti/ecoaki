package br.com.ecoaki

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast

class FormProduct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_product)

        val button_cadastrarProduto = findViewById<Button>(R.id.button_cadastrarProduto)

        button_cadastrarProduto.setOnClickListener {
            Toast.makeText(this, "Produto Cadastrado com Sucesso!!!", Toast.LENGTH_SHORT).show()
        }
    }

    public override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.bottom_nav_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when (item.itemId){

            R.id.navigation_inicial ->
                irParaHome()
            R.id.navigation_search ->
                irParaPesquisa()
            R.id.navigation_like ->
                irParaProduto()
            R.id.navigation_product ->
                irParaCarrinho()
            R.id.navigation_user ->
                irParaPerfil()
        }
        return super.onOptionsItemSelected(item)
    }

    private fun irParaPesquisa(){
        val telaPesquisa = Intent(this, FormPesquisar::class.java)
        startActivity(telaPesquisa)
    }

    private fun irParaProduto(){
        val telaProduto = Intent(this, FormProduct::class.java)
        startActivity(telaProduto)
    }

    private fun irParaCarrinho(){
        val telaCarrinho = Intent(this, FormDetails::class.java)
        startActivity(telaCarrinho)
    }

    private fun irParaPerfil(){
        val telaPerfil = Intent(this, FormAtualizarCadastro::class.java)
        startActivity(telaPerfil)
    }

    private fun irParaHome(){
        val telaHome = Intent(this, MainActivity::class.java)
        startActivity(telaHome)
    }
}