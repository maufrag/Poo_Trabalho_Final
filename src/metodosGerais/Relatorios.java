package metodosGerais;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.List;

import dao.ContratoLocacaoRepository;
import model.RelatorioContratosModel;

public class Relatorios {
	public static void gerarRelatorioContratos() {
		List<RelatorioContratosModel> modelList = ContratoLocacaoRepository.obterView();
		try {
			String home = System.getProperty("user.home");
			String fileName = "relatorio contratos";
			File file = new File(home + "/Downloads/" + fileName + ".txt");

			FileOutputStream is = new FileOutputStream(file);
			OutputStreamWriter osw = new OutputStreamWriter(is);
			Writer w = new BufferedWriter(osw);

			for (RelatorioContratosModel model : modelList) {
				w.write("\"" + model.getNomeCompleto() + "\"; ");
				w.write("\"" + model.getFabricante() + "\"; ");
				w.write("\"" + model.getModelo() + "\"; ");
				w.write("\"" + model.getNomeStatus() + "\"; ");
				w.write("\"" + model.getSubTotal() + "\"; ");
				w.write("\n");
			}

			w.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
