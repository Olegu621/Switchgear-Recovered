            package p000;

            import android.content.Context;
            import android.content.IntentFilter;
            import android.view.MenuItem;
            import java.io.BufferedInputStream;
            import java.io.BufferedWriter;
            import java.io.IOException;
            import java.io.InputStream;
            import java.io.OutputStream;
            import java.io.OutputStreamWriter;
            import java.net.SocketException;
            import java.net.URL;
            import java.net.UnknownHostException;
            import java.nio.ByteBuffer;
            import java.nio.ByteOrder;
            import java.security.GeneralSecurityException;
            import java.security.MessageDigest;
            import java.util.HashMap;
            import java.util.Map;
            import java.util.concurrent.CopyOnWriteArraySet;
            import java.util.zip.GZIPInputStream;
            import javax.crypto.AEADBadTagException;
            import javax.net.ssl.HttpsURLConnection;
            import javax.net.ssl.SSLHandshakeException;
            import javax.net.ssl.SSLPeerUnverifiedException;
            
            /* JADX INFO: renamed from: ta */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 17 */    public abstract class AbstractC2211ta {

                /* JADX INFO: renamed from: a */
                public Object f17000a;

                /* JADX INFO: renamed from: b */
                public Object f17001b;

                public AbstractC2211ta() {
/* 9 */             this.f17000a = new CopyOnWriteArraySet();
/* 16 */            this.f17001b = new CopyOnWriteArraySet();
                }

                /* JADX INFO: renamed from: k */
                public static byte[] m8744k(byte[] bArr, ByteBuffer byteBuffer) {
/* 14 */            int length = bArr.length % 16 == 0 ? bArr.length : (bArr.length + 16) - (bArr.length % 16);
/* 15 */            int iRemaining = byteBuffer.remaining();
/* 19 */            int i = iRemaining % 16;
/* 28 */            int i2 = (i == 0 ? iRemaining : (iRemaining + 16) - i) + length;
/* 37 */            ByteBuffer byteBufferOrder = ByteBuffer.allocate(i2 + 16).order(ByteOrder.LITTLE_ENDIAN);
/* 41 */            byteBufferOrder.put(bArr);
/* 44 */            byteBufferOrder.position(length);
/* 47 */            byteBufferOrder.put(byteBuffer);
/* 50 */            byteBufferOrder.position(i2);
/* 55 */            byteBufferOrder.putLong(bArr.length);
/* 59 */            byteBufferOrder.putLong(iRemaining);
/* 62 */            return byteBufferOrder.array();
                }

                /* JADX INFO: renamed from: c */
                public void m8745c(String str) {
/* 5 */             ((CopyOnWriteArraySet) this.f17000a).add(str);
/* 12 */            ((CopyOnWriteArraySet) this.f17001b).remove(str);
                }

                /* JADX INFO: renamed from: d */
                public void m8746d() {
/* 3 */             C2174sa c2174sa = (C2174sa) this.f17000a;
/* 5 */             if (c2174sa != null) {
                        try {
/* 13 */                    ((LayoutInflaterFactory2C2324wa) this.f17001b).f18510V.unregisterReceiver(c2174sa);
                        } catch (IllegalArgumentException unused) {
                        }
/* 17 */                this.f17000a = null;
                    }
                }

                /* JADX INFO: renamed from: e */
                public abstract IntentFilter mo8095e();

                /* JADX INFO: renamed from: f */
                public byte[] m8747f(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
/* 7 */             if (byteBuffer.remaining() < 16) {
/* 118 */               ds0.m3203t("ciphertext too short");
/* 121 */               return null;
                    }
/* 9 */             int iPosition = byteBuffer.position();
/* 13 */            byte[] bArr3 = new byte[16];
/* 20 */            byteBuffer.position(byteBuffer.limit() - 16);
/* 23 */            byteBuffer.get(bArr3);
/* 26 */            byteBuffer.position(iPosition);
/* 34 */            byteBuffer.limit(byteBuffer.limit() - 16);
/* 38 */            if (bArr2 == null) {
/* 40 */                bArr2 = new byte[0];
                    }
                    try {
/* 52 */                byte[] bArr4 = new byte[32];
/* 54 */                ((AbstractC1006hw) this.f17001b).m4388a(bArr, 0).get(bArr4);
/* 69 */                if (!MessageDigest.isEqual(hu0.m4324O(bArr4, m8744k(bArr2, byteBuffer)), bArr3)) {
/* 104 */                   throw new GeneralSecurityException("invalid MAC");
                        }
/* 71 */                byteBuffer.position(iPosition);
/* 76 */                AbstractC1006hw abstractC1006hw = (AbstractC1006hw) this.f17000a;
/* 78 */                abstractC1006hw.getClass();
/* 85 */                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
/* 89 */                abstractC1006hw.m4391k(bArr, byteBufferAllocate, byteBuffer);
/* 92 */                return byteBufferAllocate.array();
                    } catch (GeneralSecurityException e) {
/* 115 */               throw new AEADBadTagException(e.toString());
                    }
                }

                /* JADX INFO: renamed from: g */
                public void m8748g(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) {
/* 10 */            if (byteBuffer.remaining() < bArr2.length + 16) {
/* 94 */                C1951n4.m6859j("Given ByteBuffer output is too small");
/* 97 */                return;
                    }
/* 12 */            int iPosition = byteBuffer.position();
/* 18 */            AbstractC1006hw abstractC1006hw = (AbstractC1006hw) this.f17000a;
/* 20 */            abstractC1006hw.getClass();
/* 28 */            if (byteBuffer.remaining() < bArr2.length) {
/* 90 */                C1951n4.m6859j("Given ByteBuffer output is too small");
/* 93 */                return;
                    }
/* 34 */            abstractC1006hw.m4391k(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
/* 37 */            byteBuffer.position(iPosition);
/* 46 */            byteBuffer.limit(byteBuffer.limit() - 16);
/* 50 */            if (bArr3 == null) {
/* 52 */                bArr3 = new byte[0];
                    }
/* 58 */            ByteBuffer byteBufferM4388a = ((AbstractC1006hw) this.f17001b).m4388a(bArr, 0);
/* 64 */            byte[] bArr4 = new byte[32];
/* 66 */            byteBufferM4388a.get(bArr4);
/* 73 */            byte[] bArrM4324O = hu0.m4324O(bArr4, m8744k(bArr3, byteBuffer));
/* 83 */            byteBuffer.limit(byteBuffer.limit() + 16);
/* 86 */            byteBuffer.put(bArrM4324O);
                }

                /* JADX INFO: renamed from: h */
                public abstract int mo8096h();

                /* JADX INFO: renamed from: i */
                public MenuItem m8749i(MenuItem menuItem) {
/* 3 */             if (!(menuItem instanceof zi2)) {
/* 50 */                return menuItem;
                    }
/* 5 */             zi2 zi2Var = (zi2) menuItem;
/* 11 */            if (((le2) this.f17001b) == null) {
/* 18 */                this.f17001b = new le2();
                    }
/* 29 */            MenuItem menuItem2 = (MenuItem) ((le2) this.f17001b).getOrDefault(zi2Var, null);
/* 31 */            if (menuItem2 != null) {
/* 49 */                return menuItem2;
                    }
/* 39 */            wg1 wg1Var = new wg1((Context) this.f17000a, zi2Var);
/* 46 */            ((le2) this.f17001b).put(zi2Var, wg1Var);
/* 49 */            return wg1Var;
                }

                /* JADX INFO: renamed from: j */
                public abstract ur3 mo6516j(wc0 wc0Var);

                /* JADX WARN: Code duplicated, block: B:162:0x0291 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:177:? A[SYNTHETIC] */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Not initialized variable reg: 14, insn: 0x021a: MOVE (r6 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]) (LINE:539), block:B:142:0x0216 */
                /* JADX WARN: Not initialized variable reg: 6, insn: 0x0219: MOVE (r7 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:538), block:B:142:0x0216 */
                /* JADX WARN: Type inference failed for: r0v11 */
                /* JADX WARN: Type inference failed for: r0v23, types: [java.io.Closeable] */
                /* JADX WARN: Type inference failed for: r0v64 */
                /* JADX WARN: Type inference failed for: r0v90 */
                /* JADX WARN: Type inference failed for: r0v91 */
                /* JADX INFO: renamed from: l */
                public C1795jj m8750l(wc0 wc0Var) throws Throwable {
                    Throwable th;
                    boolean z;
                    InputStream inputStream;
                    HttpsURLConnection httpsURLConnection;
                    ?? r0;
                    HttpsURLConnection httpsURLConnection2;
                    InputStream inputStream2;
                    OutputStream outputStream;
                    InputStream inputStream3;
/* 1 */             ur3 ur3VarMo6516j = mo6516j(wc0Var);
/* 7 */             String str = (String) ur3VarMo6516j.f17704b;
/* 9 */             int i = ur3VarMo6516j.f17703a;
/* 17 */            ((ec0) this.f17001b).getClass();
                    try {
                        try {
/* 35 */                    httpsURLConnection = (HttpsURLConnection) new URL(str).openConnection();
                            try {
/* 41 */                        httpsURLConnection.setRequestMethod(fm0.m3798x(i));
/* 46 */                        httpsURLConnection.setConnectTimeout(5000);
/* 65 */                        for (Map.Entry entry : ((HashMap) ur3VarMo6516j.f17705c).entrySet()) {
/* 85 */                            httpsURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                                }
/* 134 */                       if (i == 1) {
/* 136 */                           httpsURLConnection.setDoOutput(true);
/* 139 */                           outputStream = httpsURLConnection.getOutputStream();
                                    try {
/* 152 */                               BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
/* 159 */                               bufferedWriter.write((String) ur3VarMo6516j.f17706d);
/* 162 */                               bufferedWriter.flush();
/* 165 */                               bufferedWriter.close();
/* 168 */                               outputStream.flush();
                                    } catch (SecurityException e) {
/* 190 */                               e = e;
/* 618 */                               throw gt0.m4014a(e, ym1.f19691b, "Network error : " + e.getMessage());
                                    } catch (SocketException e2) {
/* 194 */                               e = e2;
/* 618 */                               throw gt0.m4014a(e, ym1.f19691b, "Network error : " + e.getMessage());
                                    } catch (UnknownHostException e3) {
/* 196 */                               e = e3;
/* 646 */                               throw gt0.m4014a(e, ym1.f19692c, "Network error: " + e.getMessage());
                                    } catch (SSLHandshakeException e4) {
/* 182 */                               e = e4;
/* 566 */                               throw gt0.m4014a(e, ym1.f19694e, "Network error : " + e.getMessage());
                                    } catch (SSLPeerUnverifiedException e5) {
/* 186 */                               e = e5;
/* 592 */                               throw gt0.m4014a(e, ym1.f19693d, "Network error : " + e.getMessage());
                                    } catch (IOException e6) {
/* 178 */                               e = e6;
/* 533 */                               throw gt0.m4014a(e, ym1.f19690a, "Network error : " + e.getMessage());
                                    } catch (Throwable th2) {
/* 173 */                               th = th2;
/* 174 */                               inputStream3 = null;
/* 175 */                               inputStream = null;
                                        r0 = inputStream3;
/* 647 */                               b40.m1221e(inputStream);
/* 650 */                               b40.m1221e(r0);
/* 653 */                               b40.m1221e(outputStream);
/* 656 */                               if (httpsURLConnection != null) {
/* 666 */                                   throw th;
                                        }
                                        try {
/* 658 */                                   httpsURLConnection.disconnect();
/* 666 */                                   throw th;
                                        } catch (Exception e7) {
/* 663 */                                   xe2.m9777o("Network", "Error in finally closing resources", e7);
/* 666 */                                   throw th;
                                        }
                                    }
                                } else {
/* 200 */                           outputStream = null;
                                }
/* 201 */                       int responseCode = httpsURLConnection.getResponseCode();
/* 205 */                       httpsURLConnection.getHeaderFields();
/* 208 */                       String contentEncoding = httpsURLConnection.getContentEncoding();
/* 220 */                       if (responseCode < 200 || responseCode >= 300) {
/* 414 */                           xe2.m9776n("Response Error for network request - Url:" + str + " \n method:" + fm0.m3799y(i) + " status:" + responseCode + " encoding:" + contentEncoding);
/* 417 */                           InputStream errorStream = httpsURLConnection.getErrorStream();
                                    try {
/* 427 */                               C1795jj c1795jj = new C1795jj(responseCode, ec0.m3401h(errorStream));
/* 430 */                               b40.m1221e(errorStream);
/* 433 */                               b40.m1221e(outputStream);
                                        try {
/* 436 */                                   httpsURLConnection.disconnect();
/* 439 */                                   return c1795jj;
                                        } catch (Exception e8) {
/* 441 */                                   xe2.m9777o("Network", "Error in finally closing resources", e8);
/* 444 */                                   return c1795jj;
                                        }
                                    } catch (SecurityException e9) {
/* 464 */                               e = e9;
/* 618 */                               throw gt0.m4014a(e, ym1.f19691b, "Network error : " + e.getMessage());
                                    } catch (SocketException e10) {
/* 468 */                               e = e10;
/* 618 */                               throw gt0.m4014a(e, ym1.f19691b, "Network error : " + e.getMessage());
                                    } catch (UnknownHostException e11) {
/* 470 */                               e = e11;
/* 646 */                               throw gt0.m4014a(e, ym1.f19692c, "Network error: " + e.getMessage());
                                    } catch (SSLHandshakeException e12) {
/* 456 */                               e = e12;
/* 566 */                               throw gt0.m4014a(e, ym1.f19694e, "Network error : " + e.getMessage());
                                    } catch (SSLPeerUnverifiedException e13) {
/* 460 */                               e = e13;
/* 592 */                               throw gt0.m4014a(e, ym1.f19693d, "Network error : " + e.getMessage());
                                    } catch (IOException e14) {
/* 452 */                               e = e14;
/* 533 */                               throw gt0.m4014a(e, ym1.f19690a, "Network error : " + e.getMessage());
                                    } catch (Throwable th3) {
/* 448 */                               th = th3;
/* 449 */                               inputStream3 = errorStream;
/* 175 */                               inputStream = null;
                                        r0 = inputStream3;
/* 647 */                               b40.m1221e(inputStream);
/* 650 */                               b40.m1221e(r0);
/* 653 */                               b40.m1221e(outputStream);
/* 656 */                               if (httpsURLConnection != null) {
/* 666 */                                   throw th;
                                        }
/* 658 */                               httpsURLConnection.disconnect();
/* 666 */                               throw th;
                                    }
                                }
/* 226 */                       InputStream inputStream4 = httpsURLConnection.getInputStream();
                                try {
/* 236 */                           if ("gzip".equalsIgnoreCase(contentEncoding)) {
/* 240 */                               inputStream4 = new GZIPInputStream(inputStream4);
                                    }
/* 285 */                           BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream4);
                                    try {
/* 288 */                               String strM3401h = ec0.m3401h(bufferedInputStream);
/* 331 */                               xe2.m9774l("Response Success for network request - Url:" + str + " \n method:" + fm0.m3799y(i) + " status:" + responseCode + " encoding:" + contentEncoding);
/* 336 */                               C1795jj c1795jj2 = new C1795jj(responseCode, strM3401h);
/* 339 */                               b40.m1221e(bufferedInputStream);
/* 342 */                               b40.m1221e(outputStream);
                                        try {
/* 345 */                                   httpsURLConnection.disconnect();
/* 348 */                                   return c1795jj2;
                                        } catch (Exception e15) {
/* 350 */                                   xe2.m9777o("Network", "Error in finally closing resources", e15);
/* 445 */                                   return c1795jj2;
                                        }
                                    } catch (SecurityException e16) {
/* 367 */                               e = e16;
/* 618 */                               throw gt0.m4014a(e, ym1.f19691b, "Network error : " + e.getMessage());
                                    } catch (SocketException e17) {
/* 370 */                               e = e17;
/* 618 */                               throw gt0.m4014a(e, ym1.f19691b, "Network error : " + e.getMessage());
                                    } catch (UnknownHostException e18) {
/* 372 */                               e = e18;
/* 646 */                               throw gt0.m4014a(e, ym1.f19692c, "Network error: " + e.getMessage());
                                    } catch (SSLHandshakeException e19) {
/* 361 */                               e = e19;
/* 566 */                               throw gt0.m4014a(e, ym1.f19694e, "Network error : " + e.getMessage());
                                    } catch (SSLPeerUnverifiedException e20) {
/* 364 */                               e = e20;
/* 592 */                               throw gt0.m4014a(e, ym1.f19693d, "Network error : " + e.getMessage());
                                    } catch (IOException e21) {
/* 358 */                               e = e21;
/* 533 */                               throw gt0.m4014a(e, ym1.f19690a, "Network error : " + e.getMessage());
                                    } catch (Throwable th4) {
/* 355 */                               th = th4;
/* 356 */                               inputStream = bufferedInputStream;
/* 248 */                               r0 = 0;
/* 647 */                               b40.m1221e(inputStream);
/* 650 */                               b40.m1221e(r0);
/* 653 */                               b40.m1221e(outputStream);
/* 656 */                               if (httpsURLConnection != null) {
/* 666 */                                   throw th;
                                        }
/* 658 */                               httpsURLConnection.disconnect();
/* 666 */                               throw th;
                                    }
                                } catch (SecurityException e22) {
/* 269 */                           e = e22;
/* 618 */                           throw gt0.m4014a(e, ym1.f19691b, "Network error : " + e.getMessage());
                                } catch (SocketException e23) {
/* 275 */                           e = e23;
/* 618 */                           throw gt0.m4014a(e, ym1.f19691b, "Network error : " + e.getMessage());
                                } catch (UnknownHostException e24) {
/* 277 */                           e = e24;
                                } catch (SSLHandshakeException e25) {
/* 257 */                           e = e25;
                                } catch (SSLPeerUnverifiedException e26) {
/* 263 */                           e = e26;
                                } catch (IOException e27) {
/* 251 */                           e = e27;
                                } catch (Throwable th5) {
/* 246 */                           th = th5;
/* 247 */                           inputStream = inputStream4;
                                }
                            } catch (IOException e28) {
/* 96 */                        e = e28;
/* 533 */                       throw gt0.m4014a(e, ym1.f19690a, "Network error : " + e.getMessage());
                            } catch (SecurityException e29) {
/* 117 */                       e = e29;
/* 618 */                       throw gt0.m4014a(e, ym1.f19691b, "Network error : " + e.getMessage());
                            } catch (SocketException e30) {
/* 124 */                       e = e30;
/* 618 */                       throw gt0.m4014a(e, ym1.f19691b, "Network error : " + e.getMessage());
                            } catch (UnknownHostException e31) {
/* 126 */                       e = e31;
/* 646 */                       throw gt0.m4014a(e, ym1.f19692c, "Network error: " + e.getMessage());
                            } catch (SSLHandshakeException e32) {
/* 103 */                       e = e32;
/* 566 */                       throw gt0.m4014a(e, ym1.f19694e, "Network error : " + e.getMessage());
                            } catch (SSLPeerUnverifiedException e33) {
/* 110 */                       e = e33;
/* 592 */                       throw gt0.m4014a(e, ym1.f19693d, "Network error : " + e.getMessage());
                            } catch (Throwable th6) {
/* 90 */                        th = th6;
/* 91 */                        z = false;
/* 92 */                        inputStream = null;
/* 93 */                        outputStream = null;
                                r0 = z;
/* 647 */                       b40.m1221e(inputStream);
/* 650 */                       b40.m1221e(r0);
/* 653 */                       b40.m1221e(outputStream);
/* 656 */                       if (httpsURLConnection != null) {
/* 666 */                           throw th;
                                }
/* 658 */                       httpsURLConnection.disconnect();
/* 666 */                       throw th;
                            }
                        } catch (Throwable th7) {
/* 536 */                   th = th7;
/* 537 */                   r0 = str;
/* 538 */                   httpsURLConnection = httpsURLConnection2;
/* 539 */                   inputStream = inputStream2;
                        }
                    } catch (SecurityException e34) {
/* 496 */               e = e34;
/* 618 */               throw gt0.m4014a(e, ym1.f19691b, "Network error : " + e.getMessage());
                    } catch (SocketException e35) {
/* 501 */               e = e35;
/* 618 */               throw gt0.m4014a(e, ym1.f19691b, "Network error : " + e.getMessage());
                    } catch (UnknownHostException e36) {
/* 503 */               e = e36;
                    } catch (SSLHandshakeException e37) {
/* 486 */               e = e37;
                    } catch (SSLPeerUnverifiedException e38) {
/* 491 */               e = e38;
                    } catch (IOException e39) {
/* 481 */               e = e39;
                    } catch (Throwable th8) {
/* 475 */               th = th8;
/* 476 */               z = false;
/* 477 */               inputStream = null;
/* 478 */               httpsURLConnection = null;
                    }
                }

                /* JADX INFO: renamed from: m */
                public abstract AbstractC1006hw mo5626m(byte[] bArr, int i);

                /* JADX INFO: renamed from: n */
                public abstract void mo8097n();

                /* JADX INFO: renamed from: o */
                public void mo4869o(boolean z) {
/* 3 */             CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.f17001b;
/* 7 */             CopyOnWriteArraySet copyOnWriteArraySet2 = (CopyOnWriteArraySet) this.f17000a;
/* 11 */            if (z) {
/* 13 */                copyOnWriteArraySet2.add("android.widget.ImageView");
/* 16 */                copyOnWriteArraySet.remove("android.widget.ImageView");
                    } else {
/* 20 */                copyOnWriteArraySet.add("android.widget.ImageView");
/* 23 */                copyOnWriteArraySet2.remove("android.widget.ImageView");
                    }
                }

                /* JADX INFO: renamed from: p */
                public void mo5393p(boolean z) {
/* 3 */             CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.f17001b;
/* 7 */             CopyOnWriteArraySet copyOnWriteArraySet2 = (CopyOnWriteArraySet) this.f17000a;
/* 11 */            if (z) {
/* 13 */                copyOnWriteArraySet2.add("android.widget.TextView");
/* 16 */                copyOnWriteArraySet.remove("android.widget.TextView");
                    } else {
/* 20 */                copyOnWriteArraySet.add("android.widget.TextView");
/* 23 */                copyOnWriteArraySet2.remove("android.widget.TextView");
                    }
                }

                /* JADX INFO: renamed from: q */
                public void m8751q() {
/* 1 */             m8746d();
/* 4 */             IntentFilter intentFilterMo8095e = mo8095e();
/* 12 */            if (intentFilterMo8095e.countActions() == 0) {
/* 14 */                return;
                    }
/* 19 */            if (((C2174sa) this.f17000a) == null) {
/* 27 */                this.f17000a = new C2174sa(this, 0);
                    }
/* 39 */            ((LayoutInflaterFactory2C2324wa) this.f17001b).f18510V.registerReceiver((C2174sa) this.f17000a, intentFilterMo8095e);
                }

                /* JADX INFO: renamed from: r */
                public abstract void mo4870r();

/* 18 */        public AbstractC2211ta(Context context) {
/* 20 */            this.f17000a = context;
                }

/* 20 */        public AbstractC2211ta(LayoutInflaterFactory2C2324wa layoutInflaterFactory2C2324wa) {
                    this.f17001b = layoutInflaterFactory2C2324wa;
                }
            }
