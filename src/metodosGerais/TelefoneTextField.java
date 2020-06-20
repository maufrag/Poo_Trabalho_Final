package metodosGerais;

import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class TelefoneTextField extends JTextField {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6056809552954523481L;

	public TelefoneTextField() {

		setDocument(new PlainDocument() {

			/**
			 * 
			 */
			private static final long serialVersionUID = -3942835010186090502L;

			@Override
			public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {

				if (str == null || !Character.isDigit(str.charAt(0))) {
					return;
				}

				if ((getLength() + str.length()) <= 14) {

					if (offset == 0) {
						str = "(" + str;

					} else if (offset == 3) {
						str = ")" + str;
					}
					else if(offset == 9) {
						str = "-" + str;
					}
					super.insertString(offset, str, attr);
				}
			}
		});
	}
}
