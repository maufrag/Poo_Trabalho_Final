package metodosGerais;

import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class AnoTextField extends JTextField {

	private static final long serialVersionUID = -8840899571916751289L;

	public AnoTextField() {
		  setDocument(new PlainDocument() {
	          
			private static final long serialVersionUID = 4399334585755975432L;

				@Override
	            public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {

	                if (str == null || !Character.isDigit(str.charAt(0))) {
	                    return;
	                }

	                if ((getLength() + str.length()) <= 4) {

	                    super.insertString(offset, str, attr);
	                }
	            }
	        });
	}
}
