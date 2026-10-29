            package com.appsflyer.internal;

            import java.util.Map;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 119 */   public class AFi1fSDK {
                private static final byte[] $$a = null;
                private static final int $$b = 0;
                private static int $10 = 0;
                private static int $11 = 1;
                private static int $12 = 0;
                private static int $13 = 1;
                private static long afDebugLog;
                private static int afErrorLog;
                private static long afInfoLog;
                private static byte[] afLogForce;
                private static int afRDLog;
                private static int afVerboseLog;

                /* JADX INFO: renamed from: d */
                private static Object f3091d;

                /* JADX INFO: renamed from: e */
                private static Object f3092e;
                private static long force;

                /* JADX INFO: renamed from: i */
                private static byte[] f3093i;
                public static final Map registerClient;
                private static byte[] unregisterClient;

                /* JADX INFO: renamed from: v */
                private static int f3094v;

                /* JADX INFO: renamed from: w */
                public static final Map f3095w;

                private static String $$c(int i, int i2, short s) {
                    int i3;
                    int i4;
                    int i5;
                    byte[] bArr;
                    byte[] bArr2;
/* 3 */             int i6 = $12 + 35;
/* 7 */             $13 = i6 % 128;
/* 11 */            int i7 = -1;
/* 12 */            if (i6 % 2 == 0) {
/* 14 */                int i8 = i * 87;
/* 16 */                bArr2 = $$a;
/* 18 */                i3 = i2 + 6;
/* 20 */                i4 = s + 61;
/* 22 */                bArr = new byte[i8];
/* 24 */                i5 = i8 + 41;
/* 26 */                if (bArr2 == null) {
/* 96 */                    i3 = i5 + (-i4);
/* 99 */                    i5 = i5;
/* 100 */                   i4 = i4;
/* 101 */                   bArr2 = bArr2;
/* 102 */                   i7 = -1;
/* 103 */                   bArr = bArr;
                        }
                    } else {
/* 31 */                byte[] bArr3 = $$a;
/* 33 */                i3 = i2 + 33;
/* 35 */                i4 = s + 4;
/* 37 */                byte[] bArr4 = new byte[49 - i];
/* 39 */                i5 = 48 - i;
/* 42 */                if (bArr3 == null) {
/* 44 */                    bArr = bArr4;
/* 45 */                    bArr2 = bArr3;
/* 96 */                    i3 = i5 + (-i4);
/* 99 */                    i5 = i5;
/* 100 */                   i4 = i4;
/* 101 */                   bArr2 = bArr2;
/* 102 */                   i7 = -1;
/* 103 */                   bArr = bArr;
                        } else {
/* 52 */                    bArr = bArr4;
/* 53 */                    bArr2 = bArr3;
                        }
                    }
                    while (true) {
/* 54 */                int i9 = i7 + 1;
/* 57 */                bArr[i9] = (byte) i3;
/* 59 */                if (i9 == i5) {
                            break;
                        }
/* 82 */                int i10 = i4 + 1;
/* 86 */                int i11 = i3;
/* 87 */                int i12 = i5;
/* 89 */                byte[] bArr5 = bArr2;
/* 92 */                byte[] bArr6 = bArr;
/* 96 */                i3 = i11 + (-bArr2[i10]);
/* 99 */                i5 = i12;
/* 100 */               i4 = i10;
/* 101 */               bArr2 = bArr5;
/* 102 */               i7 = i9;
/* 103 */               bArr = bArr6;
                    }
/* 64 */            String str = new String(bArr, 0);
/* 69 */            int i13 = $13 + 115;
/* 73 */            $12 = i13 % 128;
/* 77 */            if (i13 % 2 == 0) {
/* 79 */                return str;
                    }
/* 81 */            throw null;
                }

                /*  JADX ERROR: Type inference failed
                    jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 76881. Try increasing type updates limit count.
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
                    */
                static {
                    /*
                        Method dump skipped, instruction units count: 7688
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFi1fSDK.<clinit>():void");
                }

                private AFi1fSDK() {
                }

                public static int getCurrencyIso4217Code(int i) throws Throwable {
                    Object obj;
/* 1 */             int i2 = $11;
/* 3 */             int i3 = i2 + 97;
/* 7 */             $10 = i3 % 128;
/* 11 */            if (i3 % 2 != 0) {
/* 13 */                obj = f3091d;
/* 17 */                int i4 = 11 / 0;
                    } else {
/* 20 */                obj = f3091d;
                    }
/* 31 */            $10 = ((i2 ^ 85) + ((i2 & 85) << 1)) % 128;
                    try {
/* 37 */                Object[] objArr = {Integer.valueOf(i)};
/* 41 */                byte[] bArr = $$a;
/* 99 */                int iIntValue = ((Integer) Class.forName($$c(bArr[27], bArr[82], (short) 563), true, (ClassLoader) f3092e).getMethod($$c(bArr[718], bArr[427], (short) 1167), Integer.TYPE).invoke(obj, objArr)).intValue();
/* 109 */               $10 = ($11 + 41) % 128;
/* 111 */               return iIntValue;
                    } catch (Throwable th) {
/* 113 */               Throwable cause = th.getCause();
/* 117 */               if (cause != null) {
/* 119 */                   throw cause;
                        }
/* 120 */               throw th;
                    }
                }

                public static Object getMediationNetwork(char c, int i, int i2) throws Throwable {
/* 1 */             int i3 = $10;
/* 3 */             Object obj = f3091d;
/* 10 */            int i4 = ((i3 & 105) + (i3 | 105)) % 128;
/* 12 */            $11 = i4;
/* 21 */            $10 = ((i4 & 79) + (i4 | 79)) % 128;
                    try {
/* 24 */                Object[] objArr = {Character.valueOf(c), Integer.valueOf(i), Integer.valueOf(i2)};
/* 47 */                byte[] bArr = $$a;
/* 69 */                Class<?> cls = Class.forName($$c(bArr[27], bArr[82], (short) 563), true, (ClassLoader) f3092e);
/* 85 */                String str$$c = $$c(bArr[506], bArr[427], (short) 1128);
/* 89 */                Class cls2 = Character.TYPE;
/* 91 */                Class cls3 = Integer.TYPE;
/* 101 */               return cls.getMethod(str$$c, cls2, cls3, cls3).invoke(obj, objArr);
                    } catch (Throwable th) {
/* 107 */               Throwable cause = th.getCause();
/* 111 */               if (cause != null) {
/* 113 */                   throw cause;
                        }
/* 114 */               throw th;
                    }
                }

                private static void getRevenue(int i, int i2) {
/* 3 */             int i3 = $10 + 49;
/* 7 */             $11 = i3 % 128;
/* 11 */            if (i3 % 2 == 0) {
/* 15 */                throw null;
                    }
                }

                public static void init$0() {
                    int i;
/* 1 */             int i2 = $11;
/* 7 */             int i3 = (i2 & 11) + (i2 | 11);
/* 10 */            $10 = i3 % 128;
/* 21 */            if (i3 % 2 != 0) {
/* 23 */                byte[] bArr = new byte[1181];
/* 29 */                System.arraycopy(")\u009f5»ó\nò\u0003\u0006\u00056Çõ\u0011ñ\bÿ\u0006ðEëÔ\u0003ýýö÷\u0010ô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=îûÝ8Ï\u000f\u000fùø\u0000ô\u0002?Íñ\u0000ý\rúó\u0014óó\nò\u0003\u0006\u00056Íñ\u0000BíÞï\u000bó\rõû%ìö\r\u0004ýî\u0003\u0000\r÷ú3Ñ\u0000\u0004\u0003\u0006\u0002í\u000bú\u0001ó\nò\u0003\u0006\u00056Íñ\u0000BíÑ\u0000)Ûý\r\u0001õù\u0002ñ+Û\u0005õ\u000b\bõ+Ñ\u0000\u0004\u0003\u0006\u0002í\u000bú\u0001\u0002ñ.Ýý\u0007ò/Û÷\u0002ñ1Ô\u000bÿ\"âþû\u0003!Û÷\u0002ñ1âþû\u0003!Û÷Ë\u0003í\u00132Ë\u0003í\u00132\të\u00153ÅúAèÝý\u0007\të\u00153ÅúAº\u0007ý\fû÷\të\u00153Â\u000bó\u00079ÛÚ\u0006ÿ\u000fø\u0002ñ$Þ\u0003ÿ\u000bóþûô\u000bÿ\u0006ü\u0002þû\u0003ó\nò\u0003\u0006\u00056¿üEìÍ\fý\b@Î\u0011óÿ\nú\u0001\u000fùì\u0016ûú\u0002ó\u0017å\tõ\u000f\u0015ú\u0016ø\të\u00153ÅúAåú\nÍ\u0015þõü\u000bú\u0001î\u0003\u0000\r÷ú ëü\b\u0018äý\u0000\u0003ö\të\u00153ÅúAèÝý\u0007\u0016Ú\u0001\u0004û\u0001!ß\u0002\r\u0004ô÷ýü\u000e\u0015ý\u0013øÎî\u0000\u000eñ\u0001DÌô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=ýú\u0004\u0000ÿ\u0003\u0002ùÖ+Ð1Ôû-\u0002Ô6\u0002ñ\"íò\u0004ú\u0003\u000fþ\të\u00153À\tñFÙ\u0003\u0006\u0002ñ$ïí\f\të\u00153ÅúAìÍ\u000f\u0000\u0001ó\r\u0001\u001bÛþû\u0001!ß\u0002\r\u0004ô\të\u00153ÅúAåÛþû\u0001!ß\u0002\r\u0004ô\të\u00153ÅúAêãí\u0013\u0018Ûþû\u0001!ß\u0002\r\u0004ô\r\u0004ý\u001eÑ\t\u0000ó\të\u00153ÅúAìÉ\u0005\u000f$Ï\u0000\u0011è0Ûþû\u0001!ß\u0002\r\u0004ôô\u0002?Íñ\u0000ý\rúó\u0014óDÅûú\u000fó\u0004\rõ>íûÛ:¿\u001f\u000fùô\u0002?Íñ\u0000ý\rúó\u0014óDÅûú\u000fó\u0004\rõ>íûÝ8Ï\u000f\u000fùø\u0000û\u0005Ý\u0012íï\u0011÷ù\u0010!ãí\u0013\b\u0002ù\r\u0004ý\u000eñ\"í\u0004ý\u0015á\u0002ó\u0015ü\u0014ø\u0005\tõ\u000f\u0002ñ.\u0002\të\u00153ÅúAèÝý\u0007!ßò\u0010ñ\tùü\u0005ýú\u000b\u000b\u0003õö\rþ=»ú\u0006ÿ\u000fø?êßí2Ýý\u0007ý\u000eý ßí\u0002ñ3ßï\u0004\u0003÷\u0001\u000f\u0015ïí\fÿù\u0007ñ\u000f\u0002ñ1×\u000bî\u0000'Ý\u000eýÿó\të\u00153¹\u0001\u000bý>´\u0011ùBÔñù'Ûþû\u0001!ß\u0002\r\u0004ô\u0002ñ&éí\u0004/×ú\u0002ù\të\u00153¹\u0001\u000bý>´\u0011ùBÔñù+×ú\u0002ù\u0002ñ!êï\u0015\të\u00153ÅúAìÉ\u0005\u000f$Ï\u0000\u0011è*Ú\u0001\u0004û\u0001!ß\u0002\r\u0004ô\u0005-É\u0005\u000f$Ï\u0000\u0011è\të\u00153ÅúAë×ýü\u000e\u0004ÿö\u0007\u0003õö\rþ=»ú\u0006ÿ\u000fø?åÛ!èøþýù5ßí5×\u000bî\u0000'Ý\u000eýÿó\të\u00153À\u0005úAìÉ\u0005\u000f#Í\u000f\u0000\u0001ó\të\u00153Â\u000bó\u00079ë×\u000bî\u0000'Ý\u000eýÿó\u0005\u0011ñ\u0003õö\rþ=»ú\u0006ÿ\u000fø?ìáî\u000e!ßí5×\u000bî\u0000'Ý\u000eýÿó\u000fí\f\u001cãöÿ\rí\u000bó\u0011\u0019ã\u0007ð\u0011ïù5Û÷\r\u0002ï\u0005ý\t\u0004ò\rí\u000bó\u0011\u0019ã\u0007ð\u0011ïù)ïí\f#Ù\u0007ø\b÷ú\u0001\u0002ñ1Ô\u0002ý\u0001\u0001\t÷ú Û\t\u000b\u0015ø\u0018øý\u000eý!×\u000bî\u0000ô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=îûÝ8Ë\u0013\u000fù'\u00adÎî\u0000\u000eñ\u0001DÌô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=Ë3Ï\u0000/ú\u0005Ò\u0001)ÿ\bþûÒ4Î7\u0015ù\u0017øºÿOº\u0005õ\u0000\n\u0001þøøS´\u0007ÿòK\u0002ñ'è\u0001û\bí\u000bú\u0001 éñý\bý\u0007\u0002ñ1Î\u0003\u0000\r÷\u000bê0Ö\u0004;\u0002\u0001úôÔ\u000bÿ\u0002ñ\"íï\u0011÷ù\u0010".getBytes("ISO-8859-1"), 0, bArr, 0, 1181);
/* 32 */                $$a = bArr;
/* 34 */                i = 69;
                    } else {
/* 39 */                byte[] bArr2 = new byte[1181];
/* 45 */                System.arraycopy(")\u009f5»ó\nò\u0003\u0006\u00056Çõ\u0011ñ\bÿ\u0006ðEëÔ\u0003ýýö÷\u0010ô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=îûÝ8Ï\u000f\u000fùø\u0000ô\u0002?Íñ\u0000ý\rúó\u0014óó\nò\u0003\u0006\u00056Íñ\u0000BíÞï\u000bó\rõû%ìö\r\u0004ýî\u0003\u0000\r÷ú3Ñ\u0000\u0004\u0003\u0006\u0002í\u000bú\u0001ó\nò\u0003\u0006\u00056Íñ\u0000BíÑ\u0000)Ûý\r\u0001õù\u0002ñ+Û\u0005õ\u000b\bõ+Ñ\u0000\u0004\u0003\u0006\u0002í\u000bú\u0001\u0002ñ.Ýý\u0007ò/Û÷\u0002ñ1Ô\u000bÿ\"âþû\u0003!Û÷\u0002ñ1âþû\u0003!Û÷Ë\u0003í\u00132Ë\u0003í\u00132\të\u00153ÅúAèÝý\u0007\të\u00153ÅúAº\u0007ý\fû÷\të\u00153Â\u000bó\u00079ÛÚ\u0006ÿ\u000fø\u0002ñ$Þ\u0003ÿ\u000bóþûô\u000bÿ\u0006ü\u0002þû\u0003ó\nò\u0003\u0006\u00056¿üEìÍ\fý\b@Î\u0011óÿ\nú\u0001\u000fùì\u0016ûú\u0002ó\u0017å\tõ\u000f\u0015ú\u0016ø\të\u00153ÅúAåú\nÍ\u0015þõü\u000bú\u0001î\u0003\u0000\r÷ú ëü\b\u0018äý\u0000\u0003ö\të\u00153ÅúAèÝý\u0007\u0016Ú\u0001\u0004û\u0001!ß\u0002\r\u0004ô÷ýü\u000e\u0015ý\u0013øÎî\u0000\u000eñ\u0001DÌô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=ýú\u0004\u0000ÿ\u0003\u0002ùÖ+Ð1Ôû-\u0002Ô6\u0002ñ\"íò\u0004ú\u0003\u000fþ\të\u00153À\tñFÙ\u0003\u0006\u0002ñ$ïí\f\të\u00153ÅúAìÍ\u000f\u0000\u0001ó\r\u0001\u001bÛþû\u0001!ß\u0002\r\u0004ô\të\u00153ÅúAåÛþû\u0001!ß\u0002\r\u0004ô\të\u00153ÅúAêãí\u0013\u0018Ûþû\u0001!ß\u0002\r\u0004ô\r\u0004ý\u001eÑ\t\u0000ó\të\u00153ÅúAìÉ\u0005\u000f$Ï\u0000\u0011è0Ûþû\u0001!ß\u0002\r\u0004ôô\u0002?Íñ\u0000ý\rúó\u0014óDÅûú\u000fó\u0004\rõ>íûÛ:¿\u001f\u000fùô\u0002?Íñ\u0000ý\rúó\u0014óDÅûú\u000fó\u0004\rõ>íûÝ8Ï\u000f\u000fùø\u0000û\u0005Ý\u0012íï\u0011÷ù\u0010!ãí\u0013\b\u0002ù\r\u0004ý\u000eñ\"í\u0004ý\u0015á\u0002ó\u0015ü\u0014ø\u0005\tõ\u000f\u0002ñ.\u0002\të\u00153ÅúAèÝý\u0007!ßò\u0010ñ\tùü\u0005ýú\u000b\u000b\u0003õö\rþ=»ú\u0006ÿ\u000fø?êßí2Ýý\u0007ý\u000eý ßí\u0002ñ3ßï\u0004\u0003÷\u0001\u000f\u0015ïí\fÿù\u0007ñ\u000f\u0002ñ1×\u000bî\u0000'Ý\u000eýÿó\të\u00153¹\u0001\u000bý>´\u0011ùBÔñù'Ûþû\u0001!ß\u0002\r\u0004ô\u0002ñ&éí\u0004/×ú\u0002ù\të\u00153¹\u0001\u000bý>´\u0011ùBÔñù+×ú\u0002ù\u0002ñ!êï\u0015\të\u00153ÅúAìÉ\u0005\u000f$Ï\u0000\u0011è*Ú\u0001\u0004û\u0001!ß\u0002\r\u0004ô\u0005-É\u0005\u000f$Ï\u0000\u0011è\të\u00153ÅúAë×ýü\u000e\u0004ÿö\u0007\u0003õö\rþ=»ú\u0006ÿ\u000fø?åÛ!èøþýù5ßí5×\u000bî\u0000'Ý\u000eýÿó\të\u00153À\u0005úAìÉ\u0005\u000f#Í\u000f\u0000\u0001ó\të\u00153Â\u000bó\u00079ë×\u000bî\u0000'Ý\u000eýÿó\u0005\u0011ñ\u0003õö\rþ=»ú\u0006ÿ\u000fø?ìáî\u000e!ßí5×\u000bî\u0000'Ý\u000eýÿó\u000fí\f\u001cãöÿ\rí\u000bó\u0011\u0019ã\u0007ð\u0011ïù5Û÷\r\u0002ï\u0005ý\t\u0004ò\rí\u000bó\u0011\u0019ã\u0007ð\u0011ïù)ïí\f#Ù\u0007ø\b÷ú\u0001\u0002ñ1Ô\u0002ý\u0001\u0001\t÷ú Û\t\u000b\u0015ø\u0018øý\u000eý!×\u000bî\u0000ô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=îûÝ8Ë\u0013\u000fù'\u00adÎî\u0000\u000eñ\u0001DÌô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=Ë3Ï\u0000/ú\u0005Ò\u0001)ÿ\bþûÒ4Î7\u0015ù\u0017øºÿOº\u0005õ\u0000\n\u0001þøøS´\u0007ÿòK\u0002ñ'è\u0001û\bí\u000bú\u0001 éñý\bý\u0007\u0002ñ1Î\u0003\u0000\r÷\u000bê0Ö\u0004;\u0002\u0001úôÔ\u000bÿ\u0002ñ\"íï\u0011÷ù\u0010".getBytes("ISO-8859-1"), 0, bArr2, 0, 1181);
/* 48 */                $$a = bArr2;
/* 50 */                i = 112;
                    }
/* 36 */            $$b = i;
                }

/* 120 */       public static int getCurrencyIso4217Code(Object obj) throws Throwable {
                    Object obj2;
/* 121 */           int i = $11;
                    int i2 = (i & 63) + (i | 63);
                    int i3 = i2 % 128;
                    $10 = i3;
                    if (i2 % 2 != 0) {
                        obj2 = f3091d;
                        int i4 = 46 / 0;
                    } else {
                        obj2 = f3091d;
                    }
                    $11 = (i3 + 51) % 128;
                    try {
                        byte[] bArr = $$a;
                        int iIntValue = ((Integer) Class.forName($$c(bArr[27], bArr[82], (short) 563), true, (ClassLoader) f3092e).getMethod($$c(bArr[452], bArr[427], (short) ($$b | 1034)), Object.class).invoke(obj2, obj)).intValue();
                        $10 = ($11 + 9) % 128;
                        return iIntValue;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
            }
