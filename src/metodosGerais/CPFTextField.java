package metodosGerais;

import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class CpfTextField extends JTextField {

    /**
	 * 
	 */
	private static final long serialVersionUID = -8320548872032139016L;

	public CpfTextField() {

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

                if ((getLength() + str.length()) <= 14) {

                    if (offset > 0 && offset < 9 && (offset + 1) % 4 == 0) {
                        str = "." + str;
                    } else if (offset > 0 && (offset + 1) % 12 == 0) {
                        str = "-" + str;
                    }
                    super.insertString(offset, str, attr);
                }
            }
        });
    }
}
