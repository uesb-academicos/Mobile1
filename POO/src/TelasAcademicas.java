import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/** Três telas visuais de cadastro para um sistema acadêmico fictício. */
public class TelasAcademicas {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(TelasAcademicas::criarJanela);
    }

    private static void criarJanela() {
        JFrame janela = new JFrame("Sistema acadêmico — POO 2026.2");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(new BorderLayout(12, 12));
        janela.add(new JLabel("  Cadastros acadêmicos", JLabel.CENTER), BorderLayout.NORTH);

        JTabbedPane abas = new JTabbedPane();
        abas.addTab("Estudante", telaEstudante());
        abas.addTab("Disciplina", telaDisciplina());
        abas.addTab("Atividade", telaAtividade());
        janela.add(abas, BorderLayout.CENTER);

        janela.setSize(new Dimension(560, 360));
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
    }

    private static JPanel painelFormulario() {
        JPanel painel = new JPanel(new GridBagLayout());
        painel.setBorder(BorderFactory.createEmptyBorder(18, 24, 18, 24));
        return painel;
    }

    private static void adicionarLinha(JPanel painel, int linha, String rotulo, JTextField campo) {
        GridBagConstraints etiqueta = new GridBagConstraints();
        etiqueta.gridx = 0; etiqueta.gridy = linha; etiqueta.anchor = GridBagConstraints.LINE_END;
        etiqueta.insets = new Insets(6, 6, 6, 10);
        painel.add(new JLabel(rotulo), etiqueta);

        GridBagConstraints entrada = new GridBagConstraints();
        entrada.gridx = 1; entrada.gridy = linha; entrada.weightx = 1;
        entrada.fill = GridBagConstraints.HORIZONTAL; entrada.insets = new Insets(6, 0, 6, 6);
        painel.add(campo, entrada);
    }

    private static JButton botao(String texto) {
        return new JButton(texto); // componente visual; eventos serão tratados em etapa posterior.
    }

    private static JPanel telaEstudante() {
        JPanel painel = painelFormulario();
        adicionarLinha(painel, 0, "Nome:", new JTextField());
        adicionarLinha(painel, 1, "Matrícula:", new JTextField());
        adicionarLinha(painel, 2, "Curso:", new JTextField());
        JPanel acoes = new JPanel();
        acoes.add(botao("Cadastrar")); acoes.add(botao("Limpar"));
        GridBagConstraints c = new GridBagConstraints(); c.gridx = 1; c.gridy = 3;
        painel.add(acoes, c);
        return painel;
    }

    private static JPanel telaDisciplina() {
        JPanel painel = painelFormulario();
        adicionarLinha(painel, 0, "Código:", new JTextField());
        adicionarLinha(painel, 1, "Nome:", new JTextField());
        adicionarLinha(painel, 2, "Professor:", new JTextField());
        adicionarLinha(painel, 3, "Carga horária:", new JTextField());
        JPanel acoes = new JPanel();
        acoes.add(botao("Cadastrar")); acoes.add(botao("Cancelar"));
        GridBagConstraints c = new GridBagConstraints(); c.gridx = 1; c.gridy = 4;
        painel.add(acoes, c);
        return painel;
    }

    private static JPanel telaAtividade() {
        JPanel painel = painelFormulario();
        adicionarLinha(painel, 0, "Título:", new JTextField());
        adicionarLinha(painel, 1, "Disciplina:", new JTextField());
        adicionarLinha(painel, 2, "Prazo:", new JTextField());
        adicionarLinha(painel, 3, "Situação:", new JTextField("Em aberto"));
        JPanel acoes = new JPanel();
        acoes.add(botao("Cadastrar")); acoes.add(botao("Concluir"));
        GridBagConstraints c = new GridBagConstraints(); c.gridx = 1; c.gridy = 4;
        painel.add(acoes, c);
        return painel;
    }
}
