package metodosGerais;

import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class DataTextField extends JTextField {

	public DataTextField() {

		setDocument(new PlainDocument() {

			@Override
			public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {

				if (str == null || !Character.isDigit(str.charAt(0))) {
					return;
				}

				if ((getLength() + str.length()) <= 10) {

					if (offset == 2 || offset == 5) {
						str = "/" + str;
					}

					super.insertString(offset, str, attr);
				}
			}
		});
	}
}
