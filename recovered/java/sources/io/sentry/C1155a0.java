            package io.sentry;

            import io.sentry.internal.debugmeta.C1505c;
            import java.io.BufferedInputStream;
            import java.io.ByteArrayOutputStream;
            import java.io.IOException;
            import java.io.StringReader;
            import java.nio.charset.Charset;
            import java.util.ArrayList;
            import java.util.Arrays;
            import okio.Segment;
            
            /* JADX INFO: renamed from: io.sentry.a0 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1155a0 implements InterfaceC1668t0 {

                /* JADX INFO: renamed from: b */
                public static final Charset f9794b = Charset.forName("UTF-8");

                /* JADX INFO: renamed from: a */
                public final InterfaceC1487i1 f9795a;

                public C1155a0(InterfaceC1487i1 interfaceC1487i1) {
/* 4 */             this.f9795a = interfaceC1487i1;
                }

                @Override // io.sentry.InterfaceC1668t0
                /* JADX INFO: renamed from: a */
                public final C1505c mo4676a(BufferedInputStream bufferedInputStream) throws IOException {
/* 1 */             InterfaceC1487i1 interfaceC1487i1 = this.f9795a;
/* 3 */             Charset charset = f9794b;
/* 7 */             byte[] bArr = new byte[Segment.SHARE_MINIMUM];
/* 11 */            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
/* 16 */            int i = 0;
/* 17 */            int i2 = -1;
                    while (true) {
                        try {
/* 18 */                    int i3 = bufferedInputStream.read(bArr);
/* 24 */                    if (i3 <= 0) {
                                break;
                            }
/* 27 */                    for (int i4 = 0; i2 == -1 && i4 < i3; i4++) {
/* 33 */                        if (bArr[i4] == 10) {
/* 35 */                            i2 = i + i4;
                                    break;
                                }
                            }
/* 44 */                    byteArrayOutputStream.write(bArr, 0, i3);
/* 47 */                    i += i3;
                        } catch (Throwable th) {
                            try {
/* 345 */                       byteArrayOutputStream.close();
                            } catch (Throwable th2) {
/* 350 */                       th.addSuppressed(th2);
                            }
/* 353 */                   throw th;
                        }
                    }
/* 49 */            byte[] byteArray = byteArrayOutputStream.toByteArray();
/* 54 */            if (byteArray.length == 0) {
/* 344 */               throw new IllegalArgumentException("Empty stream.");
                    }
/* 56 */            if (i2 == -1) {
/* 336 */               throw new IllegalArgumentException("Envelope contains no header.");
                    }
/* 65 */            StringReader stringReader = new StringReader(new String(byteArray, 0, i2, charset));
                    try {
/* 74 */                C1726v4 c1726v4 = (C1726v4) interfaceC1487i1.mo5064b(stringReader, C1726v4.class);
/* 76 */                stringReader.close();
/* 79 */                if (c1726v4 == null) {
/* 318 */                   throw new IllegalArgumentException("Envelope header is null.");
                        }
/* 81 */                int i5 = i2 + 1;
/* 85 */                ArrayList arrayList = new ArrayList();
                        while (true) {
/* 88 */                    int i6 = i5;
                            while (true) {
/* 90 */                        if (i6 >= byteArray.length) {
/* 100 */                           i6 = -1;
                                    break;
                                }
/* 94 */                        if (byteArray[i6] == 10) {
                                    break;
                                }
/* 97 */                        i6++;
                            }
/* 101 */                   if (i6 == -1) {
/* 310 */                       throw new IllegalArgumentException("Invalid envelope. Item at index '" + arrayList.size() + "'. has no header delimiter.");
                            }
/* 112 */                   StringReader stringReader2 = new StringReader(new String(byteArray, i5, i6 - i5, charset));
                            try {
/* 121 */                       C1381b5 c1381b5 = (C1381b5) interfaceC1487i1.mo5064b(stringReader2, C1381b5.class);
/* 123 */                       stringReader2.close();
/* 126 */                       if (c1381b5 == null || c1381b5.m5069a() <= 0) {
/* 268 */                           throw new IllegalArgumentException("Item header at index '" + arrayList.size() + "' is null or empty.");
                                }
/* 138 */                       int iM5069a = c1381b5.m5069a() + i6;
/* 139 */                       int i7 = iM5069a + 1;
/* 142 */                       if (i7 > byteArray.length) {
/* 236 */                           throw new IllegalArgumentException("Invalid length for item at index '" + arrayList.size() + "'. Item is '" + i7 + "' bytes. There are '" + byteArray.length + "' in the buffer.");
                                }
/* 155 */                       arrayList.add(new C1160a5(c1381b5, Arrays.copyOfRange(byteArray, i6 + 1, i7)));
/* 159 */                       if (i7 == byteArray.length) {
                                    break;
                                }
/* 162 */                       i5 = iM5069a + 2;
/* 165 */                       if (i5 == byteArray.length) {
/* 169 */                           if (byteArray[i7] == 10) {
                                        break;
                                    }
/* 187 */                           throw new IllegalArgumentException("Envelope has invalid data following an item.");
                                }
                            } catch (Throwable th3) {
                                try {
/* 270 */                           stringReader2.close();
                                } catch (Throwable th4) {
/* 275 */                           th3.addSuppressed(th4);
                                }
/* 278 */                       throw th3;
                            }
                        }
/* 173 */               C1505c c1505c = new C1505c(c1726v4, arrayList);
/* 176 */               byteArrayOutputStream.close();
/* 179 */               return c1505c;
                    } catch (Throwable th5) {
                        try {
/* 320 */                   stringReader.close();
                        } catch (Throwable th6) {
/* 325 */                   th5.addSuppressed(th6);
                        }
/* 328 */               throw th5;
                    }
                }
            }
