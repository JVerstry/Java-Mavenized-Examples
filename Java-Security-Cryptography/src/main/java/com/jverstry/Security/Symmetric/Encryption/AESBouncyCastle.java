
package com.jverstry.Security.Symmetric.Encryption;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.paddings.BlockCipherPadding;
import org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;

public class AESBouncyCastle {

	private final BlockCipher AESCipher = new AESEngine();
	
	private PaddedBufferedBlockCipher pbbc;
	private KeyParameter key;

	public void setPadding(BlockCipherPadding bcp) {
		this.pbbc = new PaddedBufferedBlockCipher(AESCipher, bcp);
	}
	
	public void setKey(byte[] key) {
		this.key = new KeyParameter(key);
	}
	
	public byte[] encrypt(byte[] input)
			throws DataLengthException, InvalidCipherTextException {
		return processing(input, true);
	}

	public byte[] decrypt(byte[] input)
			throws DataLengthException, InvalidCipherTextException {
		return processing(input, false);
	}

	private byte[] processing(byte[] input, boolean encrypt)
			throws DataLengthException, InvalidCipherTextException {
		
		pbbc.init(encrypt, key);

		byte[] output = new byte[pbbc.getOutputSize(input.length)];
		
		int bytesWrittenOut = pbbc.processBytes(
			input, 0, input.length, output, 0);
		
		pbbc.doFinal(output, bytesWrittenOut);

		return output;
		
	}	
	
}
