package metodosGerais;

import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class CnhTextField extends JTextField{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6813197004466442486L;

	public CnhTextField() {
    setDocument(new PlainDocument() {

        /**
		 * 
		 */
		private static final long serialVersionUID = 4704768169776855105L;

		@Override
        public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {

            if (str == null || !Character.isDigit(str.charAt(0))) {
                return;
            }

            if ((getLength() + str.length()) <= 11) {
                super.insertString(offset, str, attr);
            }
        }
    });
}
}
