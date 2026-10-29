            package com.quago.mobile.sdk;

            import android.os.Handler;
            import android.os.Looper;
            import android.os.Message;
            import android.os.SystemClock;
            import java.io.DataInputStream;
            import java.io.DataOutputStream;
            import java.net.URL;
            import java.nio.charset.Charset;
            import java.nio.charset.StandardCharsets;
            import java.util.ArrayDeque;
            import java.util.HashMap;
            import java.util.Locale;
            import java.util.Map;
            import java.util.Queue;
            import javax.net.ssl.HttpsURLConnection;
            import okhttp3.HttpUrl;
            import okio.Segment;
            import org.json.JSONObject;
            import p000.AbstractC0886en;
            
            /* JADX INFO: renamed from: com.quago.mobile.sdk.r0 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 477 */   public final class HandlerC0757r0 extends Handler {

                /* JADX INFO: renamed from: a */
                public final Queue f5616a;

                /* JADX INFO: renamed from: b */
                public boolean f5617b;

                /* JADX INFO: renamed from: c */
                public final C0769x0 f5618c;

                /* JADX INFO: renamed from: d */
                public int f5619d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ C0759s0 f5620e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public HandlerC0757r0(C0759s0 c0759s0, Looper looper, C0769x0 c0769x0) {
/* 3 */             super(looper);
/* 1 */             this.f5620e = c0759s0;
/* 11 */            this.f5616a = new ArrayDeque();
/* 14 */            this.f5617b = false;
/* 16 */            this.f5619d = 0;
/* 18 */            this.f5618c = c0769x0;
                }

                /* JADX WARN: Code duplicated, block: B:104:0x01aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:116:0x01bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:124:0x01a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:127:0x01c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:94:0x01da  */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX INFO: renamed from: a */
                public final int m2655a(AbstractC0761t0 abstractC0761t0) throws Throwable {
                    Object obj;
                    String str;
                    Throwable th;
                    Exception e;
                    DataOutputStream dataOutputStream;
                    DataOutputStream dataOutputStream2;
                    String str2;
                    Exception e2;
/* 2 */             String str3 = null;
/* 2 */             DataInputStream dataInputStream = null;
/* 2 */             strOptString = null;
/* 2 */             str3 = null;
/* 2 */             DataInputStream dataInputStream2 = null;
/* 2 */             str3 = null;
/* 2 */             String strOptString = null;
/* 2 */             str3 = null;
/* 2 */             str3 = null;
/* 2 */             DataOutputStream dataOutputStream3 = null;
                    try {
/* 3 */                 HashMap map = abstractC0761t0.f5631a;
/* 5 */                 String strMo2659a = abstractC0761t0.mo2659a();
/* 9 */                 QuagoSettings.LogLevel logLevel = QuagoSettings.LogLevel.DEBUG;
/* 11 */                Locale locale = AbstractC0743k0.f5509a;
/* 21 */                if (AbstractC0743k0.m2621a(logLevel.priority)) {
/* 35 */                    this.f5620e.f5625a.m2611a("execute", "Url = %s", abstractC0761t0.f5632b);
/* 46 */                    this.f5620e.f5625a.m2611a("execute", "Headers = ", new Object[0]);
/* 61 */                    for (Map.Entry entry : map.entrySet()) {
/* 87 */                        this.f5620e.f5625a.m2611a("execute", "\t[%s, %s]", entry.getKey(), entry.getValue());
                            }
/* 104 */                   this.f5620e.f5625a.m2611a("execute", "Payload = %s", strMo2659a);
                        }
                        try {
/* 118 */                   HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(abstractC0761t0.f5632b).openConnection();
                            try {
/* 122 */                       httpsURLConnection.setRequestMethod(abstractC0761t0.f5638h);
/* 129 */                       httpsURLConnection.setRequestProperty("Content-Type", "application/json");
/* 144 */                       for (Map.Entry entry2 : map.entrySet()) {
/* 164 */                           httpsURLConnection.setRequestProperty((String) entry2.getKey(), (String) entry2.getValue());
                                }
/* 182 */                       httpsURLConnection.setConnectTimeout(10000);
/* 187 */                       httpsURLConnection.setReadTimeout(12000);
/* 192 */                       httpsURLConnection.setUseCaches(abstractC0761t0.f5639i);
/* 197 */                       httpsURLConnection.setDoInput(abstractC0761t0.f5640j);
/* 202 */                       httpsURLConnection.setDoOutput(abstractC0761t0.f5641k);
/* 207 */                       if (abstractC0761t0.f5641k) {
/* 215 */                           dataOutputStream = new DataOutputStream(httpsURLConnection.getOutputStream());
                                    try {
/* 218 */                               dataOutputStream.writeBytes(strMo2659a);
                                    } catch (Exception e3) {
/* 229 */                               e = e3;
/* 230 */                               dataInputStream = null;
/* 231 */                               dataOutputStream3 = dataOutputStream;
/* 232 */                               str2 = null;
                                        try {
/* 417 */                                   this.f5620e.f5625a.m2612a("executeRequest-1", e);
/* 420 */                                   if (dataOutputStream3 != null) {
                                                try {
/* 422 */                                           dataOutputStream3.close();
                                                } catch (Exception unused) {
                                                }
                                            }
/* 425 */                                   if (dataInputStream != null) {
                                                try {
/* 427 */                                           dataInputStream.close();
                                                } catch (Exception unused2) {
                                                }
                                            }
/* 430 */                                   httpsURLConnection.disconnect();
                                            str = str2;
/* 473 */                                   if (this.f5620e.f5626b.f5683i != null) {
/* 475 */                                       m2657a(abstractC0761t0, str, 0);
                                            }
/* 1 */                                     return 0;
                                        } catch (Throwable th2) {
/* 439 */                                   th = th2;
/* 440 */                                   DataInputStream dataInputStream3 = dataInputStream;
/* 441 */                                   dataOutputStream2 = dataOutputStream3;
/* 442 */                                   dataInputStream2 = dataInputStream3;
/* 443 */                                   if (dataOutputStream2 != null) {
                                                try {
/* 445 */                                           dataOutputStream2.close();
                                                } catch (Exception unused3) {
                                                }
                                            }
/* 448 */                                   if (dataInputStream2 != null) {
                                                try {
/* 450 */                                           dataInputStream2.close();
                                                } catch (Exception unused4) {
                                                }
                                            }
/* 453 */                                   httpsURLConnection.disconnect();
/* 456 */                                   throw th;
                                        }
                                    } catch (Throwable th3) {
/* 223 */                               th = th3;
/* 224 */                               dataOutputStream2 = dataOutputStream;
/* 443 */                               if (dataOutputStream2 != null) {
/* 445 */                                   dataOutputStream2.close();
                                        }
/* 448 */                               if (dataInputStream2 != null) {
/* 450 */                                   dataInputStream2.close();
                                        }
/* 453 */                               httpsURLConnection.disconnect();
/* 456 */                               throw th;
                                    }
                                } else {
/* 235 */                           dataOutputStream = null;
                                }
                                try {
                                    try {
/* 238 */                               if (abstractC0761t0.f5640j) {
                                            try {
/* 246 */                                       dataInputStream = new DataInputStream(httpsURLConnection.getInputStream());
                                                try {
                                                    try {
/* 251 */                                               StringBuilder sb = new StringBuilder();
/* 256 */                                               byte[] bArr = new byte[Segment.SHARE_MINIMUM];
/* 258 */                                               Charset charset = StandardCharsets.UTF_8;
                                                        while (true) {
/* 260 */                                                   int i = dataInputStream.read(bArr);
/* 265 */                                                   if (i == -1) {
                                                                break;
                                                            }
/* 272 */                                                   sb.append(new String(bArr, 0, i, charset));
                                                        }
/* 283 */                                               String string = sb.toString();
/* 297 */                                               this.f5620e.f5625a.m2611a("execute", "Response = %s", string);
/* 304 */                                               if (!string.isEmpty()) {
/* 315 */                                                   strOptString = new JSONObject(string).optString("t", HttpUrl.FRAGMENT_ENCODE_SET);
                                                        }
                                                    } catch (Exception e4) {
/* 281 */                                               e2 = e4;
                                                        try {
/* 338 */                                                   this.f5620e.f5625a.m2612a("executeRequest-input", e2);
                                                        } catch (Exception e5) {
/* 346 */                                                   e = e5;
/* 355 */                                                   DataOutputStream dataOutputStream4 = dataOutputStream;
/* 356 */                                                   str2 = str3;
/* 357 */                                                   dataOutputStream3 = dataOutputStream4;
/* 417 */                                                   this.f5620e.f5625a.m2612a("executeRequest-1", e);
/* 420 */                                                   if (dataOutputStream3 != null) {
/* 422 */                                                       dataOutputStream3.close();
                                                            }
/* 425 */                                                   if (dataInputStream != null) {
/* 427 */                                                       dataInputStream.close();
                                                            }
/* 430 */                                                   httpsURLConnection.disconnect();
                                                            str = str2;
/* 473 */                                                   if (this.f5620e.f5626b.f5683i != null) {
/* 475 */                                                       m2657a(abstractC0761t0, str, 0);
                                                            }
/* 1 */                                                     return 0;
                                                        }
                                                    }
                                                } catch (Throwable th4) {
/* 350 */                                           dataInputStream2 = dataInputStream;
/* 351 */                                           th = th4;
/* 352 */                                           dataOutputStream2 = dataOutputStream;
/* 443 */                                           if (dataOutputStream2 != null) {
/* 445 */                                               dataOutputStream2.close();
                                                    }
/* 448 */                                           if (dataInputStream2 != null) {
/* 450 */                                               dataInputStream2.close();
                                                    }
/* 453 */                                           httpsURLConnection.disconnect();
/* 456 */                                           throw th;
                                                }
                                            } catch (Exception e6) {
/* 330 */                                       e2 = e6;
/* 331 */                                       dataInputStream = null;
                                            }
/* 343 */                                   dataInputStream = dataInputStream;
/* 344 */                                   str3 = strOptString;
                                        } else {
/* 359 */                                   dataInputStream = null;
                                        }
                                        try {
/* 370 */                                   this.f5619d = Math.max(0, httpsURLConnection.getHeaderFieldInt("x-qsd", 0));
/* 372 */                                   int responseCode = httpsURLConnection.getResponseCode();
/* 382 */                                   if (this.f5620e.f5626b.f5683i != null) {
/* 384 */                                       m2657a(abstractC0761t0, str3, responseCode);
                                            }
/* 393 */                                   if (dataOutputStream != null) {
                                                try {
/* 395 */                                           dataOutputStream.close();
                                                } catch (Exception unused5) {
                                                }
                                            }
/* 398 */                                   if (dataInputStream != null) {
                                                try {
/* 400 */                                           dataInputStream.close();
                                                } catch (Exception unused6) {
                                                }
                                            }
/* 403 */                                   httpsURLConnection.disconnect();
/* 406 */                                   return responseCode;
                                        } catch (Throwable th5) {
/* 388 */                                   th = th5;
/* 391 */                                   dataOutputStream3 = dataOutputStream;
/* 440 */                                   DataInputStream dataInputStream4 = dataInputStream;
/* 441 */                                   dataOutputStream2 = dataOutputStream3;
/* 442 */                                   dataInputStream2 = dataInputStream4;
/* 443 */                                   if (dataOutputStream2 != null) {
/* 445 */                                       dataOutputStream2.close();
                                            }
/* 448 */                                   if (dataInputStream2 != null) {
/* 450 */                                       dataInputStream2.close();
                                            }
/* 453 */                                   httpsURLConnection.disconnect();
/* 456 */                                   throw th;
                                        }
                                    } catch (Throwable th6) {
/* 324 */                               th = th6;
/* 326 */                               dataOutputStream3 = dataOutputStream;
/* 440 */                               DataInputStream dataInputStream5 = dataInputStream;
/* 441 */                               dataOutputStream2 = dataOutputStream3;
/* 442 */                               dataInputStream2 = dataInputStream5;
/* 443 */                               if (dataOutputStream2 != null) {
/* 445 */                                   dataOutputStream2.close();
                                        }
/* 448 */                               if (dataInputStream2 != null) {
/* 450 */                                   dataInputStream2.close();
                                        }
/* 453 */                               httpsURLConnection.disconnect();
/* 456 */                               throw th;
                                    }
                                } catch (Exception e7) {
/* 408 */                           e = e7;
/* 409 */                           dataInputStream = null;
                                }
                            } catch (Exception e8) {
/* 175 */                       dataInputStream = null;
/* 176 */                       e = e8;
/* 177 */                       dataOutputStream = null;
                            } catch (Throwable th7) {
/* 170 */                       th = th7;
                            }
                        } catch (Exception e9) {
/* 436 */                   e = e9;
/* 437 */                   obj = map;
/* 463 */                   this.f5620e.f5625a.m2612a("executeRequest-2", e);
/* 466 */                   str = obj;
/* 473 */                   if (this.f5620e.f5626b.f5683i != null) {
/* 475 */                       m2657a(abstractC0761t0, str, 0);
                            }
/* 1 */                     return 0;
                        }
                    } catch (Exception e10) {
/* 91 */                e = e10;
                        obj = str3;
                    }
                }

                @Override // android.os.Handler
                public final void handleMessage(Message message) {
                    int i;
                    try {
/* 3 */                 int i2 = message.what;
/* 10 */                if (i2 == 1) {
/* 151 */                   this.f5620e.f5625a.m2611a("handleMessage", "ADD", new Object[0]);
/* 156 */                   AbstractC0761t0 abstractC0761t0 = (AbstractC0761t0) message.obj;
/* 170 */                   if (((ArrayDeque) this.f5616a).size() >= this.f5618c.f5682h) {
/* 180 */                       this.f5620e.f5625a.m2616e("handleMessage", "Limit Reached - Package won't be added to queue.", new Object[0]);
/* 183 */                       return;
                            }
/* 188 */                   ((ArrayDeque) this.f5616a).add(abstractC0761t0);
/* 193 */                   if (this.f5617b) {
/* 208 */                       return;
                            }
/* 195 */                   this.f5617b = true;
/* 199 */                   HandlerC0757r0 handlerC0757r0 = this.f5620e.f5627c;
/* 205 */                   handlerC0757r0.sendMessageDelayed(Message.obtain(handlerC0757r0, 2), 0L);
/* 208 */                   return;
                        }
/* 12 */                if (i2 != 2) {
/* 28 */                    this.f5620e.f5625a.m2613b("handleMessage", "Unknown msg.what = %d", Integer.valueOf(i2));
/* 31 */                    return;
                        }
/* 43 */                AbstractC0761t0 abstractC0761t1 = (AbstractC0761t0) ((ArrayDeque) this.f5616a).peek();
/* 45 */                if (abstractC0761t1 == null) {
/* 208 */                   return;
                        }
/* 51 */                if (abstractC0761t1.f5642l || (i = this.f5619d) <= 0) {
/* 100 */                   long j = abstractC0761t1.f5637g;
/* 104 */                   if (j == 0) {
/* 110 */                       abstractC0761t1.f5634d = SystemClock.elapsedRealtime();
                            } else {
/* 121 */                       abstractC0761t1.f5631a.put("X-Retry-Num", String.valueOf(j));
                            }
/* 132 */                   this.f5620e.f5625a.m2611a("handleMessage", "SEND", new Object[0]);
/* 139 */                   m2656a(m2655a(abstractC0761t1), abstractC0761t1);
/* 142 */                   return;
                        }
/* 71 */                this.f5620e.f5625a.m2611a("handleMessage", "SEND SD = %s", Integer.valueOf(i));
/* 77 */                this.f5619d--;
/* 79 */                this.f5617b = false;
/* 85 */                ((ArrayDeque) this.f5616a).poll();
/* 90 */                HandlerC0757r0 handlerC0757r1 = this.f5620e.f5627c;
/* 96 */                handlerC0757r1.sendMessageDelayed(Message.obtain(handlerC0757r1, 2), 0L);
                    } catch (Exception e) {
/* 213 */               this.f5620e.f5625a.m2612a("handleMessage", e);
                    }
                }

                /* JADX INFO: renamed from: a */
/* 478 */       public final void m2656a(int i, AbstractC0761t0 abstractC0761t0) {
                    try {
/* 479 */               this.f5620e.f5625a.m2611a("handleRespond", "Response Code = %d", Integer.valueOf(i));
                        if (i != 0) {
                            switch (i) {
                                case 502:
                                case 503:
                                case 504:
                                    break;
                                default:
/* 480 */                           this.f5617b = false;
/* 481 */                           ((ArrayDeque) this.f5616a).poll();
/* 483 */                           HandlerC0757r0 handlerC0757r0 = this.f5620e.f5627c;
/* 485 */                           handlerC0757r0.sendMessageDelayed(Message.obtain(handlerC0757r0, 2), 0L);
                                    break;
                            }
                            return;
                        }
/* 487 */               long jElapsedRealtime = SystemClock.elapsedRealtime() - abstractC0761t0.f5634d;
                        C0769x0 c0769x0 = abstractC0761t0.f5633c;
                        if (jElapsedRealtime >= c0769x0.f5678d) {
/* 488 */                   this.f5617b = false;
/* 489 */                   ((ArrayDeque) this.f5616a).poll();
/* 491 */                   HandlerC0757r0 handlerC0757r1 = this.f5620e.f5627c;
/* 493 */                   handlerC0757r1.sendMessageDelayed(Message.obtain(handlerC0757r1, 2), 0L);
/* 494 */                   this.f5620e.f5625a.m2611a("handleRespond", "Message reached deadline!", new Object[0]);
                            return;
                        }
/* 496 */               float fM3503g = AbstractC0886en.m3503g(c0769x0.f5681g, c0769x0.f5680f, (float) Math.random(), c0769x0.f5680f);
/* 497 */               float f = abstractC0761t0.f5636f;
                        abstractC0761t0.f5635e = (long) (fM3503g * f);
/* 498 */               abstractC0761t0.f5637g++;
/* 499 */               C0769x0 c0769x1 = abstractC0761t0.f5633c;
                        abstractC0761t0.f5636f = Math.min(c0769x1.f5677c, (long) (f * c0769x1.f5679e));
/* 500 */               C0759s0 c0759s0 = this.f5620e;
/* 501 */               long j = abstractC0761t0.f5635e;
/* 502 */               HandlerC0757r0 handlerC0757r2 = c0759s0.f5627c;
/* 504 */               handlerC0757r2.sendMessageDelayed(Message.obtain(handlerC0757r2, 2), j);
                    } catch (Exception e) {
/* 505 */               this.f5620e.f5625a.m2612a("handleRespond", e);
/* 506 */               this.f5617b = false;
/* 507 */               ((ArrayDeque) this.f5616a).poll();
/* 509 */               HandlerC0757r0 handlerC0757r3 = this.f5620e.f5627c;
/* 511 */               handlerC0757r3.sendMessageDelayed(Message.obtain(handlerC0757r3, 2), 0L);
                    }
                }

                /* JADX INFO: renamed from: a */
/* 511 */       public final void m2657a(AbstractC0761t0 abstractC0761t0, String str, int i) {
                    try {
/* 512 */               if (abstractC0761t0 instanceof C0765v0) {
/* 513 */                   C0765v0 c0765v0 = (C0765v0) abstractC0761t0;
/* 514 */                   this.f5620e.f5626b.f5683i.onToken(c0765v0.f5652n, c0765v0.f5653o, c0765v0.f5654p, str, i);
                        }
                    } catch (Exception e) {
/* 515 */               this.f5620e.f5625a.m2612a("notify", e);
                    }
                }
            }
