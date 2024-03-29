package com.example.calculadora

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.calculadora.databinding.ActivityMainBinding
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var tela = binding.tvPrincipal.text.toString()

            binding.btn0.setOnClickListener {
                tela = tela + 0
                binding.tvPrincipal.text = tela
            }

            binding.btn1.setOnClickListener {
                tela = tela + 1
                binding.tvPrincipal.text = tela
            }

            binding.btn2.setOnClickListener {
                tela = (tela + 2)
                binding.tvPrincipal.text = tela
            }

            binding.btn3.setOnClickListener {
                tela = (tela + 3)
                binding.tvPrincipal.text = tela
            }

            binding.btn4.setOnClickListener {
                tela = (tela + 4)
                binding.tvPrincipal.text = tela
            }

            binding.btn5.setOnClickListener {
                tela = (tela + 5)
                binding.tvPrincipal.text = tela
            }

            binding.btn6.setOnClickListener {
                tela = (tela + 6)
                binding.tvPrincipal.text = tela
            }

            binding.btn7.setOnClickListener {
                tela = (tela + 7)
                binding.tvPrincipal.text = tela
            }

            binding.btn8.setOnClickListener {
                tela = (tela + 8)
                binding.tvPrincipal.text = tela
            }

            binding.btn9.setOnClickListener {
                tela = (tela + 9)
                binding.tvPrincipal.text = tela
            }

            binding.btnVirgula.setOnClickListener {
                tela = (tela + ".")
                binding.tvPrincipal.text = tela
            }

        fun operation() {
            when (binding.tvOperador.text) {
                "+" -> {
                    binding.tvOperador.text = "+"
                    if (binding.tvSecundaria.text == "" || binding.tvPrincipal.text == "") {
                        tela = ""
                        binding.tvSecundaria.text = binding.tvPrincipal.text
                        binding.tvPrincipal.text = ""
                    }
                    else {
                        tela = ""
                        var calculo = binding.tvSecundaria.text.toString().toDouble() + binding.tvPrincipal.text.toString().toDouble()
                        binding.tvSecundaria.text = "%.2f".format(calculo)
                        binding.tvPrincipal.text = ""
                    }
                }

                "-" -> {
                    binding.tvOperador.text = "-"
                    if (binding.tvSecundaria.text == "" || binding.tvPrincipal.text == "") {
                        tela = ""
                        binding.tvSecundaria.text = binding.tvPrincipal.text
                        binding.tvPrincipal.text = ""
                    }
                    else {
                        tela = ""
                        var calculo = binding.tvSecundaria.text.toString().toDouble() - binding.tvPrincipal.text.toString().toDouble()
                        binding.tvSecundaria.text = "%.2f".format(calculo)
                        binding.tvPrincipal.text = ""
                    }
                }
                "*" -> {
                    binding.tvOperador.text = "*"
                    if (binding.tvSecundaria.text == "" || binding.tvPrincipal.text == "") {
                        tela = ""
                        binding.tvSecundaria.text = binding.tvPrincipal.text
                        binding.tvPrincipal.text = ""
                    }
                    else {
                        tela = ""
                        var calculo = binding.tvSecundaria.text.toString().toDouble() * binding.tvPrincipal.text.toString().toDouble()
                        binding.tvSecundaria.text = "%.2f".format(calculo)
                        binding.tvPrincipal.text = ""
                    }
                }
                "/" -> {
                    binding.tvOperador.text = "/"
                    if (binding.tvSecundaria.text == "" || binding.tvPrincipal.text == "") {
                        tela = ""
                        binding.tvSecundaria.text = binding.tvPrincipal.text
                        binding.tvPrincipal.text = ""
                    }
                    else {
                        tela = ""
                        var calculo = binding.tvSecundaria.text.toString().toDouble() / binding.tvPrincipal.text.toString().toDouble()
                        binding.tvSecundaria.text = "%.2f".format(calculo)
                        binding.tvPrincipal.text = ""
                    }
                }
            }

        }

            binding.btnSomar.setOnClickListener {
                if(binding.tvOperador.text == "") {
                    binding.tvOperador.text = "+"
                    operation()
                } else {
                    operation()
                    binding.tvOperador.text = "+"
                }
            }

            binding.btnDividir.setOnClickListener {
                if(binding.tvOperador.text == "") {
                    binding.tvOperador.text = "/"
                    operation()
                } else {
                    operation()
                    binding.tvOperador.text = "/"
                }
            }

            binding.btnMultiplicar.setOnClickListener {

                //QUANDO A PESSOA CLICAR NO MULTIPLICAR,
                //SE O TV PRINCIPAL ESTIVER VAZIO, IGNORAR ISSO..
                //SE NÃO, O TV SECUNDÁRIO VAI PARA O TV TERCIÁRIO
                //O TV PRINCIPAL VAI PARA O TV SECUNDÁRIO
                //E AÍ OCORRE A MULTIPLICAÇÃO DO
                //SECUNDÁRIO COM O PRINCIPAL E USA O
                //OPERADOR PARA FAZER O CALCULO COM O TERCIARIO


                    if(binding.tvOperador.text == "") {
                        binding.tvOperador.text = "*"
                        operation()
                    } else {
                        operation()
                        binding.tvOperador.text = "*"
                    }
            }


            binding.btnSubtrair.setOnClickListener {
                if(binding.tvOperador.text == "") {
                    binding.tvOperador.text = "-"
                    operation()
                } else {
                    operation()
                    binding.tvOperador.text = "-"
                }
            }



            binding.btnLimpar.setOnClickListener {
                binding.tvPrincipal.text = ""
                binding.tvSecundaria.text = ""
                tela = ""
                binding.tvOperador.text = ""
            }

            binding.btnIgual.setOnClickListener {
                operation()
                binding.tvPrincipal.text = binding.tvSecundaria.text
                binding.tvSecundaria.text = ""
            }

        }


}
