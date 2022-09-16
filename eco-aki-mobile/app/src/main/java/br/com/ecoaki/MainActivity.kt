package br.com.ecoaki

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Switch
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import br.com.ecoaki.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
   /*
    private val navController by lazy{
        supportFragmentManager.findFragmentById(R.id.nav_host_fragment_activity_main)!!.findNavController()
    }
*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        binding.buttonCadeira.setOnClickListener{
            val navegarCadeira = Intent(this, FormDetails::class.java)
            startActivity(navegarCadeira)
        }

        binding.buttonCamiseta.setOnClickListener{
            val navegarCamiseta = Intent(this, FormDetails::class.java)
            startActivity(navegarCamiseta)
        }

        binding.buttonMoletom.setOnClickListener {
            val navegarMoletom = Intent(this, FormDetails::class.java)
            startActivity(navegarMoletom)
        }

        binding.buttonPhone.setOnClickListener {
            val navegarPhone = Intent(this, FormDetails::class.java)
            startActivity(navegarPhone)
        }
        /* val navView: BottomNavigationView = binding.navView
        navView.setOnClickListener{
            val SearchNav = Intent(this, FormPesquisar::class.java)
            startActivity(SearchNav)
        }

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications,
                R.id.navigation_search_main,R.id.navigation_like, R.id.navigation_product, R.id.navigation_user
            )

        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

        setupButtomNavigation()
    }
    private fun setupButtomNavigation(){
        with(binding.navView){ setupWithNavController(navController)
        }
*/
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