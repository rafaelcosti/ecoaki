package br.com.ecoaki

import android.os.Bundle
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import br.com.ecoaki.databinding.ActivityFormDetailBinding

class FormDetails : AppCompatActivity() {

 /*   private lateinit var binding: ActivityFormDetailBinding */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_detail)
     /*
        binding = ActivityFormDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.back.setOnClickListener{
            val voltar = Intent(this, MainActivity::class.java)
            startActivity(voltar)
        }
*/
        val button_euQuero = findViewById<Button>(R.id.button_euQuero)

        button_euQuero.setOnClickListener {
            Toast.makeText(this, "Adicionado no carrinho!!!", Toast.LENGTH_SHORT).show()
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