            package p000;

            import android.content.Context;
            import android.os.Build;
            import android.os.Handler;
            import android.os.Message;
            import android.os.SystemClock;
            import android.os.Trace;
            import java.util.LinkedHashSet;
            import java.util.concurrent.Executor;
            
            /* JADX INFO: renamed from: uq */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 18 */    public final /* synthetic */ class RunnableC2264uq implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f17631a = 0;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C2303vq f17632b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Executor f17633c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ long f17634d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ int f17635e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ Context f17636f;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ C2260um f17637i;

                public /* synthetic */ RunnableC2264uq(C2303vq c2303vq, Context context, Executor executor, int i, C2260um c2260um, long j) {
/* 7 */             this.f17632b = c2303vq;
/* 9 */             this.f17636f = context;
/* 11 */            this.f17633c = executor;
/* 13 */            this.f17635e = i;
/* 15 */            this.f17637i = c2260um;
/* 17 */            this.f17634d = j;
                }

                /* JADX WARN: Code duplicated, block: B:52:0x0110 A[Catch: all -> 0x01b7, TryCatch #7 {all -> 0x01b7, blocks: (B:7:0x003e, B:9:0x0046, B:11:0x0066, B:13:0x0070, B:15:0x0089, B:17:0x0094, B:24:0x00a3, B:26:0x00b1, B:28:0x00b7, B:29:0x00bd, B:30:0x00bf, B:33:0x00c3, B:37:0x00cd, B:38:0x00ce, B:39:0x00da, B:40:0x00db, B:41:0x00e7, B:50:0x00ff, B:52:0x0110, B:53:0x0117, B:57:0x0120, B:59:0x014e, B:60:0x0153, B:61:0x015e, B:62:0x0160, B:66:0x0165, B:68:0x0169, B:69:0x016b, B:72:0x016f, B:76:0x0176, B:77:0x0177, B:79:0x017b, B:80:0x01a0, B:82:0x01a4, B:83:0x01a9, B:88:0x01b6, B:48:0x00f0, B:49:0x00fe, B:70:0x016c, B:71:0x016e, B:64:0x0162, B:65:0x0164), top: B:96:0x003e, inners: #3, #4 }] */
                /* JADX WARN: Code duplicated, block: B:55:0x011b  */
                /* JADX WARN: Code duplicated, block: B:61:0x015e A[Catch: all -> 0x01b7, TryCatch #7 {all -> 0x01b7, blocks: (B:7:0x003e, B:9:0x0046, B:11:0x0066, B:13:0x0070, B:15:0x0089, B:17:0x0094, B:24:0x00a3, B:26:0x00b1, B:28:0x00b7, B:29:0x00bd, B:30:0x00bf, B:33:0x00c3, B:37:0x00cd, B:38:0x00ce, B:39:0x00da, B:40:0x00db, B:41:0x00e7, B:50:0x00ff, B:52:0x0110, B:53:0x0117, B:57:0x0120, B:59:0x014e, B:60:0x0153, B:61:0x015e, B:62:0x0160, B:66:0x0165, B:68:0x0169, B:69:0x016b, B:72:0x016f, B:76:0x0176, B:77:0x0177, B:79:0x017b, B:80:0x01a0, B:82:0x01a4, B:83:0x01a9, B:88:0x01b6, B:48:0x00f0, B:49:0x00fe, B:70:0x016c, B:71:0x016e, B:64:0x0162, B:65:0x0164), top: B:96:0x003e, inners: #3, #4 }] */
                /* JADX WARN: Code duplicated, block: B:63:0x0161  */
                /* JADX WARN: Code duplicated, block: B:68:0x0169 A[Catch: all -> 0x01b7, TryCatch #7 {all -> 0x01b7, blocks: (B:7:0x003e, B:9:0x0046, B:11:0x0066, B:13:0x0070, B:15:0x0089, B:17:0x0094, B:24:0x00a3, B:26:0x00b1, B:28:0x00b7, B:29:0x00bd, B:30:0x00bf, B:33:0x00c3, B:37:0x00cd, B:38:0x00ce, B:39:0x00da, B:40:0x00db, B:41:0x00e7, B:50:0x00ff, B:52:0x0110, B:53:0x0117, B:57:0x0120, B:59:0x014e, B:60:0x0153, B:61:0x015e, B:62:0x0160, B:66:0x0165, B:68:0x0169, B:69:0x016b, B:72:0x016f, B:76:0x0176, B:77:0x0177, B:79:0x017b, B:80:0x01a0, B:82:0x01a4, B:83:0x01a9, B:88:0x01b6, B:48:0x00f0, B:49:0x00fe, B:70:0x016c, B:71:0x016e, B:64:0x0162, B:65:0x0164), top: B:96:0x003e, inners: #3, #4 }] */
                /* JADX WARN: Code duplicated, block: B:77:0x0177 A[Catch: all -> 0x01b7, TryCatch #7 {all -> 0x01b7, blocks: (B:7:0x003e, B:9:0x0046, B:11:0x0066, B:13:0x0070, B:15:0x0089, B:17:0x0094, B:24:0x00a3, B:26:0x00b1, B:28:0x00b7, B:29:0x00bd, B:30:0x00bf, B:33:0x00c3, B:37:0x00cd, B:38:0x00ce, B:39:0x00da, B:40:0x00db, B:41:0x00e7, B:50:0x00ff, B:52:0x0110, B:53:0x0117, B:57:0x0120, B:59:0x014e, B:60:0x0153, B:61:0x015e, B:62:0x0160, B:66:0x0165, B:68:0x0169, B:69:0x016b, B:72:0x016f, B:76:0x0176, B:77:0x0177, B:79:0x017b, B:80:0x01a0, B:82:0x01a4, B:83:0x01a9, B:88:0x01b6, B:48:0x00f0, B:49:0x00fe, B:70:0x016c, B:71:0x016e, B:64:0x0162, B:65:0x0164), top: B:96:0x003e, inners: #3, #4 }] */
                /* JADX WARN: Code duplicated, block: B:79:0x017b A[Catch: all -> 0x01b7, TryCatch #7 {all -> 0x01b7, blocks: (B:7:0x003e, B:9:0x0046, B:11:0x0066, B:13:0x0070, B:15:0x0089, B:17:0x0094, B:24:0x00a3, B:26:0x00b1, B:28:0x00b7, B:29:0x00bd, B:30:0x00bf, B:33:0x00c3, B:37:0x00cd, B:38:0x00ce, B:39:0x00da, B:40:0x00db, B:41:0x00e7, B:50:0x00ff, B:52:0x0110, B:53:0x0117, B:57:0x0120, B:59:0x014e, B:60:0x0153, B:61:0x015e, B:62:0x0160, B:66:0x0165, B:68:0x0169, B:69:0x016b, B:72:0x016f, B:76:0x0176, B:77:0x0177, B:79:0x017b, B:80:0x01a0, B:82:0x01a4, B:83:0x01a9, B:88:0x01b6, B:48:0x00f0, B:49:0x00fe, B:70:0x016c, B:71:0x016e, B:64:0x0162, B:65:0x0164), top: B:96:0x003e, inners: #3, #4 }] */
                /* JADX WARN: Code duplicated, block: B:80:0x01a0 A[Catch: all -> 0x01b7, TryCatch #7 {all -> 0x01b7, blocks: (B:7:0x003e, B:9:0x0046, B:11:0x0066, B:13:0x0070, B:15:0x0089, B:17:0x0094, B:24:0x00a3, B:26:0x00b1, B:28:0x00b7, B:29:0x00bd, B:30:0x00bf, B:33:0x00c3, B:37:0x00cd, B:38:0x00ce, B:39:0x00da, B:40:0x00db, B:41:0x00e7, B:50:0x00ff, B:52:0x0110, B:53:0x0117, B:57:0x0120, B:59:0x014e, B:60:0x0153, B:61:0x015e, B:62:0x0160, B:66:0x0165, B:68:0x0169, B:69:0x016b, B:72:0x016f, B:76:0x0176, B:77:0x0177, B:79:0x017b, B:80:0x01a0, B:82:0x01a4, B:83:0x01a9, B:88:0x01b6, B:48:0x00f0, B:49:0x00fe, B:70:0x016c, B:71:0x016e, B:64:0x0162, B:65:0x0164), top: B:96:0x003e, inners: #3, #4 }] */
                /* JADX WARN: Code duplicated, block: B:82:0x01a4 A[Catch: all -> 0x01b7, TryCatch #7 {all -> 0x01b7, blocks: (B:7:0x003e, B:9:0x0046, B:11:0x0066, B:13:0x0070, B:15:0x0089, B:17:0x0094, B:24:0x00a3, B:26:0x00b1, B:28:0x00b7, B:29:0x00bd, B:30:0x00bf, B:33:0x00c3, B:37:0x00cd, B:38:0x00ce, B:39:0x00da, B:40:0x00db, B:41:0x00e7, B:50:0x00ff, B:52:0x0110, B:53:0x0117, B:57:0x0120, B:59:0x014e, B:60:0x0153, B:61:0x015e, B:62:0x0160, B:66:0x0165, B:68:0x0169, B:69:0x016b, B:72:0x016f, B:76:0x0176, B:77:0x0177, B:79:0x017b, B:80:0x01a0, B:82:0x01a4, B:83:0x01a9, B:88:0x01b6, B:48:0x00f0, B:49:0x00fe, B:70:0x016c, B:71:0x016e, B:64:0x0162, B:65:0x0164), top: B:96:0x003e, inners: #3, #4 }] */
                /* JADX WARN: Code duplicated, block: B:83:0x01a9 A[Catch: all -> 0x01b7, TRY_LEAVE, TryCatch #7 {all -> 0x01b7, blocks: (B:7:0x003e, B:9:0x0046, B:11:0x0066, B:13:0x0070, B:15:0x0089, B:17:0x0094, B:24:0x00a3, B:26:0x00b1, B:28:0x00b7, B:29:0x00bd, B:30:0x00bf, B:33:0x00c3, B:37:0x00cd, B:38:0x00ce, B:39:0x00da, B:40:0x00db, B:41:0x00e7, B:50:0x00ff, B:52:0x0110, B:53:0x0117, B:57:0x0120, B:59:0x014e, B:60:0x0153, B:61:0x015e, B:62:0x0160, B:66:0x0165, B:68:0x0169, B:69:0x016b, B:72:0x016f, B:76:0x0176, B:77:0x0177, B:79:0x017b, B:80:0x01a0, B:82:0x01a4, B:83:0x01a9, B:88:0x01b6, B:48:0x00f0, B:49:0x00fe, B:70:0x016c, B:71:0x016e, B:64:0x0162, B:65:0x0164), top: B:96:0x003e, inners: #3, #4 }] */
                /* JADX WARN: Code duplicated, block: B:92:0x016c A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Instruction removed from duplicated block: B:79:0x017b, please report this as an issue */
                @Override // java.lang.Runnable
                public final void run() {
                    C0176bd c0176bd;
                    x42 x42VarMo4261b;
                    switch (this.f17631a) {
                        case 0:
/* 32 */                    C2303vq c2303vq = this.f17632b;
/* 34 */                    Context context = this.f17636f;
/* 36 */                    Executor executor = this.f17633c;
/* 38 */                    int i = this.f17635e;
/* 40 */                    C2260um c2260um = this.f17637i;
/* 42 */                    long j = this.f17634d;
/* 54 */                    Trace.beginSection(j13.m5636A("CX:initAndRetryRecursively"));
/* 57 */                    Context contextM7433l = pg3.m7433l(context);
                            try {
                                try {
                                    try {
/* 69 */                                if (c2303vq.f18290c.m10015j() == null) {
/* 255 */                                   throw new ux0(new IllegalArgumentException("Invalid app configuration provided. Missing CameraFactory."));
                                        }
/* 77 */                                C0952gf c0952gf = new C0952gf(c2303vq.f18291d, c2303vq.f18292e);
/* 82 */                                C1802jq c1802jqM10014d = c2303vq.f18290c.m10014d();
/* 103 */                               c2303vq.f18293f = new C1896ln(contextM7433l, c0952gf, c1802jqM10014d, c2303vq.f18290c.m10016m());
/* 111 */                               if (c2303vq.f18290c.m10017o() == null) {
/* 232 */                                   throw new ux0(new IllegalArgumentException("Invalid app configuration provided. Missing CameraDeviceSurfaceManager."));
                                        }
/* 113 */                               C1896ln c1896ln = c2303vq.f18293f;
/* 128 */                               c2303vq.f18294g = C0924fo.m3800a(contextM7433l, c1896ln.f13425e, new LinkedHashSet(c1896ln.f13426f));
/* 136 */                               if (c2303vq.f18290c.m10018p() == null) {
/* 219 */                                   throw new ux0(new IllegalArgumentException("Invalid app configuration provided. Missing UseCaseConfigFactory."));
                                        }
/* 143 */                               c2303vq.f18295h = new C1800jo(contextM7433l);
/* 147 */                               if (executor instanceof ExecutorC2339wp) {
/* 154 */                                   ((ExecutorC2339wp) executor).m9595a(c2303vq.f18293f);
                                        }
/* 168 */                               c2303vq.f18288a.m1602z(c2303vq.f18293f);
/* 173 */                               AbstractC2227tq.m8851a(contextM7433l, c2303vq.f18288a, c1802jqM10014d);
/* 176 */                               if (i > 1 && j13.m5651m()) {
/* 187 */                                   j13.m5660v(-1, "CX:CameraProvider-RetryStatus");
                                        }
                                        synchronized (c2303vq.f18289b) {
/* 193 */                                   c2303vq.f18298k = 4;
                                            break;
                                        }
/* 196 */                               c2260um.m9040a(null);
/* 199 */                               Trace.endSection();
/* 436 */                               return;
                                    } catch (RuntimeException e) {
/* 158 */                               e = e;
/* 258 */                               c0176bd = new C0176bd(j, e);
/* 263 */                               x42VarMo4261b = c2303vq.f18296i.mo4261b(c0176bd);
/* 271 */                               if (j13.m5651m()) {
/* 277 */                                   j13.m5660v(c0176bd.f2370a, "CX:CameraProvider-RetryStatus");
                                        }
/* 282 */                               if (x42VarMo4261b.f18949b) {
                                            synchronized (c2303vq.f18289b) {
/* 355 */                                       c2303vq.f18298k = 3;
/* 360 */                                       if (x42VarMo4261b.f18950c) {
                                                    synchronized (c2303vq.f18289b) {
/* 365 */                                               c2303vq.f18298k = 4;
/* 368 */                                               c2260um.m9040a(null);
                                                    }
                                                } else if (e instanceof C2190sq) {
/* 393 */                                           String str = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((C2190sq) e).f16746a;
/* 399 */                                           hu0.m4326U("CameraX", str, e);
/* 412 */                                           c2260um.m9041b(new ux0(new C1936mq(str)));
                                                } else if (e instanceof ux0) {
/* 421 */                                           c2260um.m9041b(e);
                                                } else {
/* 431 */                                           c2260um.m9041b(new ux0(e));
                                                }
                                            }
                                        } else {
                                            synchronized (c2303vq.f18289b) {
/* 355 */                                       c2303vq.f18298k = 3;
/* 360 */                                       if (x42VarMo4261b.f18950c) {
                                                    synchronized (c2303vq.f18289b) {
/* 365 */                                               c2303vq.f18298k = 4;
/* 368 */                                               c2260um.m9040a(null);
                                                    }
                                                } else if (e instanceof C2190sq) {
/* 393 */                                           String str2 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((C2190sq) e).f16746a;
/* 399 */                                           hu0.m4326U("CameraX", str2, e);
/* 412 */                                           c2260um.m9041b(new ux0(new C1936mq(str2)));
                                                } else if (e instanceof ux0) {
/* 421 */                                           c2260um.m9041b(e);
                                                } else {
/* 431 */                                           c2260um.m9041b(new ux0(e));
                                                }
                                            }
                                        }
                                    } catch (C2190sq e2) {
/* 162 */                               e = e2;
/* 258 */                               c0176bd = new C0176bd(j, e);
/* 263 */                               x42VarMo4261b = c2303vq.f18296i.mo4261b(c0176bd);
/* 271 */                               if (j13.m5651m()) {
/* 277 */                                   j13.m5660v(c0176bd.f2370a, "CX:CameraProvider-RetryStatus");
                                        }
/* 282 */                               if (x42VarMo4261b.f18949b) {
                                            synchronized (c2303vq.f18289b) {
/* 355 */                                       c2303vq.f18298k = 3;
/* 360 */                                       if (x42VarMo4261b.f18950c) {
                                                    synchronized (c2303vq.f18289b) {
/* 365 */                                               c2303vq.f18298k = 4;
/* 368 */                                               c2260um.m9040a(null);
                                                    }
                                                } else if (e instanceof C2190sq) {
/* 393 */                                           String str3 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((C2190sq) e).f16746a;
/* 399 */                                           hu0.m4326U("CameraX", str3, e);
/* 412 */                                           c2260um.m9041b(new ux0(new C1936mq(str3)));
                                                } else if (e instanceof ux0) {
/* 421 */                                           c2260um.m9041b(e);
                                                } else {
/* 431 */                                           c2260um.m9041b(new ux0(e));
                                                }
                                            }
                                        } else {
                                            synchronized (c2303vq.f18289b) {
/* 355 */                                       c2303vq.f18298k = 3;
/* 360 */                                       if (x42VarMo4261b.f18950c) {
                                                    synchronized (c2303vq.f18289b) {
/* 365 */                                               c2303vq.f18298k = 4;
/* 368 */                                               c2260um.m9040a(null);
                                                    }
                                                } else if (e instanceof C2190sq) {
/* 393 */                                           String str4 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((C2190sq) e).f16746a;
/* 399 */                                           hu0.m4326U("CameraX", str4, e);
/* 412 */                                           c2260um.m9041b(new ux0(new C1936mq(str4)));
                                                } else if (e instanceof ux0) {
/* 421 */                                           c2260um.m9041b(e);
                                                } else {
/* 431 */                                           c2260um.m9041b(new ux0(e));
                                                }
                                            }
                                        }
                                    } catch (ux0 e3) {
/* 160 */                               e = e3;
/* 258 */                               c0176bd = new C0176bd(j, e);
/* 263 */                               x42VarMo4261b = c2303vq.f18296i.mo4261b(c0176bd);
/* 271 */                               if (j13.m5651m()) {
/* 277 */                                   j13.m5660v(c0176bd.f2370a, "CX:CameraProvider-RetryStatus");
                                        }
/* 282 */                               if (x42VarMo4261b.f18949b) {
                                            synchronized (c2303vq.f18289b) {
/* 355 */                                       c2303vq.f18298k = 3;
/* 360 */                                       if (x42VarMo4261b.f18950c) {
                                                    synchronized (c2303vq.f18289b) {
/* 365 */                                               c2303vq.f18298k = 4;
/* 368 */                                               c2260um.m9040a(null);
                                                    }
                                                } else if (e instanceof C2190sq) {
/* 393 */                                           String str5 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((C2190sq) e).f16746a;
/* 399 */                                           hu0.m4326U("CameraX", str5, e);
/* 412 */                                           c2260um.m9041b(new ux0(new C1936mq(str5)));
                                                } else if (e instanceof ux0) {
/* 421 */                                           c2260um.m9041b(e);
                                                } else {
/* 431 */                                           c2260um.m9041b(new ux0(e));
                                                }
                                            }
                                        } else {
                                            synchronized (c2303vq.f18289b) {
/* 355 */                                       c2303vq.f18298k = 3;
/* 360 */                                       if (x42VarMo4261b.f18950c) {
                                                    synchronized (c2303vq.f18289b) {
/* 365 */                                               c2303vq.f18298k = 4;
/* 368 */                                               c2260um.m9040a(null);
                                                    }
                                                } else if (e instanceof C2190sq) {
/* 393 */                                           String str6 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((C2190sq) e).f16746a;
/* 399 */                                           hu0.m4326U("CameraX", str6, e);
/* 412 */                                           c2260um.m9041b(new ux0(new C1936mq(str6)));
                                                } else if (e instanceof ux0) {
/* 421 */                                           c2260um.m9041b(e);
                                                } else {
/* 431 */                                           c2260um.m9041b(new ux0(e));
                                                }
                                            }
                                        }
                                    }
                                } catch (Throwable th) {
/* 441 */                           Trace.endSection();
/* 444 */                           throw th;
                                }
                            } catch (RuntimeException e4) {
/* 233 */                       e = e4;
                            } catch (C2190sq e5) {
/* 239 */                       e = e5;
                            } catch (ux0 e6) {
/* 237 */                       e = e6;
                            }
/* 258 */                   c0176bd = new C0176bd(j, e);
/* 263 */                   x42VarMo4261b = c2303vq.f18296i.mo4261b(c0176bd);
/* 271 */                   if (j13.m5651m()) {
/* 277 */                       j13.m5660v(c0176bd.f2370a, "CX:CameraProvider-RetryStatus");
                            }
/* 282 */                   if (x42VarMo4261b.f18949b || i >= Integer.MAX_VALUE) {
                                synchronized (c2303vq.f18289b) {
/* 355 */                           c2303vq.f18298k = 3;
                                    break;
                                }
/* 360 */                       if (x42VarMo4261b.f18950c) {
                                    synchronized (c2303vq.f18289b) {
/* 365 */                               c2303vq.f18298k = 4;
                                        break;
                                    }
/* 368 */                           c2260um.m9040a(null);
                                } else if (e instanceof C2190sq) {
/* 393 */                           String str7 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((C2190sq) e).f16746a;
/* 399 */                           hu0.m4326U("CameraX", str7, e);
/* 412 */                           c2260um.m9041b(new ux0(new C1936mq(str7)));
                                } else if (e instanceof ux0) {
/* 421 */                           c2260um.m9041b(e);
                                } else {
/* 431 */                           c2260um.m9041b(new ux0(e));
                                }
                            } else {
/* 315 */                       hu0.m4317I0("CameraX", "Retry init. Start time " + j + " current time " + SystemClock.elapsedRealtime(), e);
/* 318 */                       Handler handler = c2303vq.f18292e;
/* 322 */                       RunnableC2264uq runnableC2264uq = new RunnableC2264uq(c2303vq, executor, j, i, contextM7433l, c2260um);
/* 327 */                       long j2 = x42VarMo4261b.f18948a;
/* 333 */                       if (Build.VERSION.SDK_INT >= 28) {
/* 335 */                           y60.m10109c(handler, runnableC2264uq, j2);
                                } else {
/* 340 */                           Message messageObtain = Message.obtain(handler, runnableC2264uq);
/* 344 */                           messageObtain.obj = "retry_token";
/* 346 */                           handler.sendMessageDelayed(messageObtain, j2);
                                }
                            }
/* 199 */                   Trace.endSection();
/* 436 */                   return;
                        default:
/* 9 */                     C2303vq c2303vq2 = this.f17632b;
/* 11 */                    Executor executor2 = this.f17633c;
/* 28 */                    executor2.execute(new RunnableC2264uq(c2303vq2, this.f17636f, executor2, this.f17635e + 1, this.f17637i, this.f17634d));
/* 31 */                    return;
                    }
                }

/* 19 */        public /* synthetic */ RunnableC2264uq(C2303vq c2303vq, Executor executor, long j, int i, Context context, C2260um c2260um) {
                    this.f17632b = c2303vq;
                    this.f17633c = executor;
                    this.f17634d = j;
                    this.f17635e = i;
                    this.f17636f = context;
                    this.f17637i = c2260um;
                }
            }
