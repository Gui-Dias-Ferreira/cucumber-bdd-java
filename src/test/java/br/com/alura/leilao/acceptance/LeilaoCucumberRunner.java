package br.com.alura.leilao.acceptance;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

// Aqui nessa classe é feita a integração do Cucumber com JUnit.
// essa 'tags' significa que só rodar esse cenário de leilão, é parecido com o 'only' do cypress.
@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", tags = "@leilao")
public class LeilaoCucumberRunner {

}
