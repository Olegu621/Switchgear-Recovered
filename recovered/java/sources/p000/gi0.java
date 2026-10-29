            package p000;

            import io.sentry.config.AbstractC1417a;
            import java.io.File;
            import java.io.FileInputStream;
            import java.io.FileOutputStream;
            import java.io.IOException;
            import java.io.InputStreamReader;
            import java.nio.ByteBuffer;
            import java.nio.CharBuffer;
            import java.nio.charset.Charset;
            import java.nio.charset.CharsetEncoder;
            import java.nio.charset.CodingErrorAction;
            import kotlin.text.Charsets;
            import okio.Segment;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class gi0 extends fi0 {
                /* JADX INFO: renamed from: b */
                public static String m3945b(File file) throws IOException {
/* 1 */             Charset charset = Charsets.UTF_8;
/* 3 */             file.getClass();
/* 6 */             charset.getClass();
/* 20 */            InputStreamReader inputStreamReader = new InputStreamReader(AbstractC1417a.m5164b(file, new FileInputStream(file)), charset);
                    try {
/* 23 */                String strM3015C = de3.m3015C(inputStreamReader);
/* 27 */                inputStreamReader.close();
/* 30 */                return strM3015C;
                    } catch (Throwable th) {
                        try {
/* 32 */                    throw th;
                        } catch (Throwable th2) {
/* 34 */                    jb1.m5754n(inputStreamReader, th);
/* 37 */                    throw th2;
                        }
                    }
                }

                /* JADX INFO: renamed from: c */
                public static void m3946c(File file, String str) throws IOException {
/* 1 */             Charset charset = Charsets.UTF_8;
/* 3 */             str.getClass();
/* 6 */             charset.getClass();
/* 14 */            FileOutputStream fileOutputStreamM5167e = AbstractC1417a.m5167e(new FileOutputStream(file), file);
                    try {
/* 18 */                m3947d(fileOutputStreamM5167e, str, charset);
/* 21 */                fileOutputStreamM5167e.close();
                    } catch (Throwable th) {
                        try {
/* 26 */                    throw th;
                        } catch (Throwable th2) {
/* 28 */                    jb1.m5754n(fileOutputStreamM5167e, th);
/* 31 */                    throw th2;
                        }
                    }
                }

                /* JADX INFO: renamed from: d */
                public static final void m3947d(FileOutputStream fileOutputStream, String str, Charset charset) throws IOException {
/* 1 */             fileOutputStream.getClass();
/* 4 */             str.getClass();
/* 13 */            if (str.length() < 16384) {
/* 15 */                byte[] bytes = str.getBytes(charset);
/* 19 */                bytes.getClass();
/* 22 */                fileOutputStream.write(bytes);
/* 25 */                return;
                    }
/* 26 */            CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
/* 30 */            CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
/* 36 */            CharsetEncoder charsetEncoderOnUnmappableCharacter = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
/* 42 */            CharBuffer charBufferAllocate = CharBuffer.allocate(Segment.SIZE);
/* 46 */            charsetEncoderOnUnmappableCharacter.getClass();
/* 61 */            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(Segment.SIZE * ((int) Math.ceil(charsetEncoderOnUnmappableCharacter.maxBytesPerChar())));
/* 65 */            byteBufferAllocate.getClass();
/* 69 */            int i = 0;
/* 70 */            int i2 = 0;
/* 75 */            while (i < str.length()) {
/* 84 */                int iMin = Math.min(8192 - i2, str.length() - i);
/* 88 */                int i3 = i + iMin;
/* 90 */                char[] cArrArray = charBufferAllocate.array();
/* 94 */                cArrArray.getClass();
/* 97 */                str.getChars(i, i3, cArrArray, i2);
/* 101 */               charBufferAllocate.limit(iMin + i2);
/* 108 */               i2 = 1;
/* 122 */               if (!charsetEncoderOnUnmappableCharacter.encode(charBufferAllocate, byteBufferAllocate, i3 == str.length()).isUnderflow()) {
/* 164 */                   f42.m3656l("Check failed.");
/* 167 */                   return;
                        }
/* 132 */               fileOutputStream.write(byteBufferAllocate.array(), 0, byteBufferAllocate.position());
/* 143 */               if (charBufferAllocate.position() != charBufferAllocate.limit()) {
/* 149 */                   charBufferAllocate.put(0, charBufferAllocate.get());
                        } else {
/* 153 */                   i2 = 0;
                        }
/* 154 */               charBufferAllocate.clear();
/* 157 */               byteBufferAllocate.clear();
/* 160 */               i = i3;
                    }
                }
            }
