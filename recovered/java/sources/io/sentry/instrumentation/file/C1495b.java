            package io.sentry.instrumentation.file;

            import io.sentry.C1529k5;
            import io.sentry.C1554m6;
            import io.sentry.C1666s6;
            import io.sentry.EnumC1451f7;
            import io.sentry.InterfaceC1525k1;
            import io.sentry.protocol.C1590a0;
            import io.sentry.util.AbstractC1716o;
            import java.io.Closeable;
            import java.io.File;
            import java.io.IOException;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.List;
            import p000.fm0;
            
            /* JADX INFO: renamed from: io.sentry.instrumentation.file.b */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1495b {

                /* JADX INFO: renamed from: a */
                public final InterfaceC1525k1 f11015a;

                /* JADX INFO: renamed from: b */
                public final File f11016b;

                /* JADX INFO: renamed from: c */
                public final C1554m6 f11017c;

                /* JADX INFO: renamed from: d */
                public EnumC1451f7 f11018d = EnumC1451f7.OK;

                /* JADX INFO: renamed from: e */
                public long f11019e;

                /* JADX INFO: renamed from: f */
                public final C1666s6 f11020f;

                public C1495b(InterfaceC1525k1 interfaceC1525k1, File file, C1554m6 c1554m6) {
/* 8 */             this.f11015a = interfaceC1525k1;
/* 10 */            this.f11016b = file;
/* 12 */            this.f11017c = c1554m6;
/* 20 */            this.f11020f = new C1666s6(c1554m6, 0);
/* 28 */            C1529k5.m5336d().m5337a("FileIO");
                }

                /* JADX INFO: renamed from: a */
                public final void m5280a(Closeable closeable) {
                    try {
                        try {
/* 1 */                     closeable.close();
/* 4 */                     m5281b();
                        } catch (IOException e) {
/* 13 */                    this.f11018d = EnumC1451f7.INTERNAL_ERROR;
/* 15 */                    InterfaceC1525k1 interfaceC1525k1 = this.f11015a;
/* 17 */                    if (interfaceC1525k1 != null) {
/* 19 */                        interfaceC1525k1.mo4730h(e);
                            }
/* 22 */                    throw e;
                        }
                    } catch (Throwable th) {
/* 23 */                m5281b();
/* 26 */                throw th;
                    }
                }

                /* JADX INFO: renamed from: b */
                public final void m5281b() {
                    List list;
                    String strM3784j;
/* 1 */             InterfaceC1525k1 interfaceC1525k1 = this.f11015a;
/* 3 */             if (interfaceC1525k1 != null) {
/* 7 */                 String strM5483a = AbstractC1716o.m5483a(this.f11019e);
/* 11 */                File file = this.f11016b;
/* 13 */                C1554m6 c1554m6 = this.f11017c;
/* 15 */                if (file != null) {
/* 19 */                    String strM5483a2 = AbstractC1716o.m5483a(this.f11019e);
/* 31 */                    if (c1554m6.isSendDefaultPii()) {
/* 54 */                        strM3784j = file.getName() + " (" + strM5483a2 + ")";
                            } else {
/* 65 */                        int iLastIndexOf = file.getName().lastIndexOf(46);
/* 100 */                       strM3784j = (iLastIndexOf <= 0 || iLastIndexOf >= file.getName().length() + (-1)) ? fm0.m3784j("*** (", strM5483a2, ")") : fm0.m3785k("***", file.getName().substring(iLastIndexOf), " (", strM5483a2, ")");
                            }
/* 104 */                   interfaceC1525k1.mo4734o(strM3784j);
/* 111 */                   if (c1554m6.isSendDefaultPii()) {
/* 119 */                       interfaceC1525k1.mo4732j(file.getAbsolutePath(), "file.path");
                            }
                        } else {
/* 123 */                   interfaceC1525k1.mo4734o(strM5483a);
                        }
/* 134 */               interfaceC1525k1.mo4732j(Long.valueOf(this.f11019e), "file.size");
/* 141 */               boolean zMo4842c = c1554m6.getThreadChecker().mo4842c();
/* 151 */               interfaceC1525k1.mo4732j(Boolean.valueOf(zMo4842c), "blocked_main_thread");
/* 154 */               if (zMo4842c) {
/* 156 */                   C1666s6 c1666s6 = this.f11020f;
/* 158 */                   c1666s6.getClass();
/* 171 */                   ArrayList arrayListM5409m = c1666s6.m5409m(new Exception().getStackTrace(), false);
/* 175 */                   if (arrayListM5409m == null) {
/* 177 */                       list = Collections.EMPTY_LIST;
                            } else {
/* 187 */                       ArrayList arrayList = new ArrayList(arrayListM5409m.size());
/* 198 */                       for (Object obj : arrayListM5409m) {
/* 215 */                           if (Boolean.TRUE.equals(((C1590a0) obj).f11252V)) {
/* 217 */                               arrayList.add(obj);
                                    }
                                }
/* 225 */                       if (arrayList.isEmpty()) {
/* 235 */                           arrayList = new ArrayList(arrayListM5409m.size());
/* 246 */                           for (Object obj2 : arrayListM5409m) {
/* 255 */                               String str = ((C1590a0) obj2).f11267f;
/* 257 */                               if (str == null || (!str.startsWith("sun.") && !str.startsWith("java.") && !str.startsWith("android.") && !str.startsWith("com.android."))) {
/* 292 */                                   arrayList.add(obj2);
                                        }
                                    }
                                }
/* 227 */                       list = arrayList;
                            }
/* 298 */                   interfaceC1525k1.mo4732j(list, "call_stack");
                        }
/* 303 */               interfaceC1525k1.mo4729f(this.f11018d);
                    }
                }

                /* JADX INFO: renamed from: c */
                public final Object m5282c(InterfaceC1494a interfaceC1494a) throws IOException {
                    try {
/* 1 */                 Object objCall = interfaceC1494a.call();
/* 7 */                 if (objCall instanceof Integer) {
/* 12 */                    int iIntValue = ((Integer) objCall).intValue();
/* 17 */                    if (iIntValue != -1) {
/* 23 */                        this.f11019e += (long) iIntValue;
/* 25 */                        return objCall;
                            }
                        } else if (objCall instanceof Long) {
/* 35 */                    long jLongValue = ((Long) objCall).longValue();
/* 43 */                    if (jLongValue != -1) {
/* 48 */                        this.f11019e += jLongValue;
                            }
                        }
/* 50 */                return objCall;
                    } catch (IOException e) {
/* 53 */                this.f11018d = EnumC1451f7.INTERNAL_ERROR;
/* 55 */                InterfaceC1525k1 interfaceC1525k1 = this.f11015a;
/* 57 */                if (interfaceC1525k1 != null) {
/* 59 */                    interfaceC1525k1.mo4730h(e);
                        }
/* 62 */                throw e;
                    }
                }
            }
