            package io.sentry;

            import io.sentry.protocol.C1626w;
            import io.sentry.protocol.EnumC1606i0;
            import io.sentry.util.AbstractC1704c;
            import io.sentry.util.AbstractC1716o;
            import io.sentry.util.C1702a;
            import java.net.URLDecoder;
            import java.text.DecimalFormat;
            import java.util.ArrayList;
            import java.util.Map;
            import java.util.concurrent.ConcurrentHashMap;
            import okhttp3.HttpUrl;
            import p000.C0942g5;
            
            /* JADX INFO: renamed from: io.sentry.c */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 25 */    public final class C1387c {

                /* JADX INFO: renamed from: i */
                public static final C0942g5 f10770i = new C0942g5(7);

                /* JADX INFO: renamed from: a */
                public final ConcurrentHashMap f10771a;

                /* JADX INFO: renamed from: b */
                public final C1702a f10772b;

                /* JADX INFO: renamed from: c */
                public Double f10773c;

                /* JADX INFO: renamed from: d */
                public Double f10774d;

                /* JADX INFO: renamed from: e */
                public final String f10775e;

                /* JADX INFO: renamed from: f */
                public boolean f10776f;

                /* JADX INFO: renamed from: g */
                public final boolean f10777g;

                /* JADX INFO: renamed from: h */
                public final ILogger f10778h;

                public C1387c(ConcurrentHashMap concurrentHashMap, Double d, Double d2, String str, boolean z, ILogger iLogger) {
/* 9 */             this.f10772b = new C1702a();
/* 11 */            this.f10771a = concurrentHashMap;
/* 13 */            this.f10773c = d;
/* 15 */            this.f10774d = d2;
/* 17 */            this.f10778h = iLogger;
/* 19 */            this.f10775e = str;
/* 22 */            this.f10776f = true;
/* 24 */            this.f10777g = z;
                }

                /* JADX WARN: Code duplicated, block: B:20:0x0072  */
                /* JADX WARN: Code duplicated, block: B:56:0x00dd  */
                /* JADX WARN: Code duplicated, block: B:57:0x00df  */
                /* JADX INFO: renamed from: a */
                public static C1387c m5073a(ILogger iLogger, String str, boolean z) {
                    Double d;
                    Double dValueOf;
                    String strM5485c;
                    Double dValueOf2;
/* 11 */            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
/* 16 */            ArrayList arrayList = new ArrayList();
/* 19 */            boolean z2 = false;
/* 19 */            int i = 0;
/* 19 */            z2 = false;
/* 20 */            if (str != null) {
                        try {
/* 29 */                    boolean z3 = false;
/* 30 */                    dValueOf2 = null;
/* 31 */                    dValueOf = null;
/* 32 */                    for (String str2 : str.split(",", -1)) {
                                try {
/* 46 */                            if (str2.trim().startsWith("sentry-")) {
                                        try {
/* 50 */                                    int iIndexOf = str2.indexOf("=");
/* 58 */                                    String strTrim = str2.substring(i, iIndexOf).trim();
/* 62 */                                    String strDecode = URLDecoder.decode(strTrim, "UTF-8");
/* 76 */                                    String strDecode2 = URLDecoder.decode(str2.substring(iIndexOf + 1).trim(), "UTF-8");
                                            try {
/* 88 */                                        if ("sentry-sample_rate".equals(strDecode)) {
/* 90 */                                            if (strDecode2 != null) {
                                                        try {
/* 92 */                                                    double d2 = Double.parseDouble(strDecode2);
/* 105 */                                                   if (AbstractC1704c.m5457l(Double.valueOf(d2), false)) {
/* 107 */                                                       dValueOf2 = Double.valueOf(d2);
                                                            } else {
/* 115 */                                                       dValueOf2 = null;
                                                            }
                                                        } catch (NumberFormatException unused) {
                                                        }
                                                    } else {
/* 115 */                                               dValueOf2 = null;
                                                    }
/* 116 */                                           i = 0;
                                                } else if (!"sentry-sample_rand".equals(strDecode)) {
/* 150 */                                           i = 0;
/* 151 */                                           concurrentHashMap.put(strDecode, strDecode2);
                                                } else if (strDecode2 != null) {
                                                    try {
/* 126 */                                               double d3 = Double.parseDouble(strDecode2);
/* 134 */                                               i = 0;
/* 134 */                                               i = 0;
/* 134 */                                               i = 0;
                                                        try {
/* 148 */                                                   dValueOf = AbstractC1704c.m5457l(Double.valueOf(d3), false) ? Double.valueOf(d3) : null;
                                                        } catch (NumberFormatException unused2) {
                                                        }
                                                    } catch (NumberFormatException unused3) {
/* 147 */                                               i = 0;
                                                    }
                                                } else {
/* 147 */                                           i = 0;
                                                }
/* 158 */                                       if (!"sentry-sample_rand".equalsIgnoreCase(strTrim)) {
/* 160 */                                           z3 = true;
                                                }
                                            } catch (Throwable th) {
/* 164 */                                       th = th;
/* 113 */                                       i = 0;
/* 174 */                                       iLogger.mo4670b(EnumC1553m5.ERROR, th, "Unable to decode baggage key value pair %s", str2);
                                            }
                                        } catch (Throwable th2) {
/* 162 */                                   th = th2;
                                        }
                                    } else if (z) {
/* 187 */                               arrayList.add(str2.trim());
                                    }
                                } catch (Throwable th3) {
/* 178 */                           th = th3;
/* 179 */                           z2 = z3;
/* 210 */                           iLogger.mo4670b(EnumC1553m5.ERROR, th, "Unable to decode baggage header %s", str);
/* 197 */                           d = dValueOf2;
/* 220 */                           if (arrayList.isEmpty()) {
/* 222 */                               strM5485c = null;
                                    } else {
/* 224 */                               strM5485c = AbstractC1716o.m5485c(arrayList);
                                    }
/* 233 */                           return new C1387c(concurrentHashMap, d, dValueOf, strM5485c, z2, iLogger);
                                }
                            }
/* 196 */                   z2 = z3;
                        } catch (Throwable th4) {
/* 199 */                   th = th4;
/* 200 */                   dValueOf2 = null;
/* 201 */                   dValueOf = null;
                        }
/* 197 */               d = dValueOf2;
                    } else {
/* 214 */               d = null;
/* 215 */               dValueOf = null;
                    }
/* 220 */           if (arrayList.isEmpty()) {
/* 222 */               strM5485c = null;
                    } else {
/* 224 */               strM5485c = AbstractC1716o.m5485c(arrayList);
                    }
/* 233 */           return new C1387c(concurrentHashMap, d, dValueOf, strM5485c, z2, iLogger);
                }

                /* JADX INFO: renamed from: c */
                public static String m5074c(Double d) {
/* 6 */             if (AbstractC1704c.m5457l(d, false)) {
/* 18 */                return ((DecimalFormat) f10770i.get()).format(d);
                    }
/* 8 */             return null;
                }

                /* JADX INFO: renamed from: b */
                public final String m5075b(String str) {
/* 7 */             return (String) this.f10771a.get(str);
                }

                /* JADX INFO: renamed from: d */
                public final void m5076d(String str, String str2) {
/* 3 */             if (this.f10776f) {
/* 5 */                 ConcurrentHashMap concurrentHashMap = this.f10771a;
/* 7 */                 if (str2 == null) {
/* 9 */                     concurrentHashMap.remove(str);
                        } else {
/* 13 */                    concurrentHashMap.put(str, str2);
                        }
                    }
                }

                /* JADX INFO: renamed from: e */
                public final void m5077e(C1626w c1626w, C1626w c1626w2, C1554m6 c1554m6, C1671t3 c1671t3, String str, EnumC1606i0 enumC1606i0) {
/* 7 */             m5076d("sentry-trace_id", c1626w.m5380a());
/* 18 */            m5076d("sentry-public_key", c1554m6.retrieveParsedDsn().f11845b);
/* 27 */            m5076d("sentry-release", c1554m6.getRelease());
/* 36 */            m5076d("sentry-environment", c1554m6.getEnvironment());
/* 40 */            if (enumC1606i0 == null || EnumC1606i0.URL.equals(enumC1606i0)) {
/* 51 */                str = null;
                    }
/* 54 */            m5076d("sentry-transaction", str);
/* 57 */            if (c1626w2 != null && !C1626w.f11478b.equals(c1626w2)) {
/* 73 */                m5076d("sentry-replay_id", c1626w2.m5380a());
                    }
/* 82 */            m5076d("sentry-org_id", c1554m6.getEffectiveOrgId());
/* 91 */            Double d = c1671t3 == null ? null : (Double) c1671t3.f11668b;
/* 95 */            if (this.f10776f) {
/* 97 */                this.f10773c = d;
                    }
/* 105 */           Boolean bool = c1671t3 == null ? null : (Boolean) c1671t3.f11667a;
/* 117 */           m5076d("sentry-sampled", bool == null ? null : bool.toString());
/* 125 */           Double d2 = c1671t3 != null ? (Double) c1671t3.f11669c : null;
/* 129 */           if (this.f10776f) {
/* 131 */               this.f10774d = d2;
                    }
                }

                /* JADX INFO: renamed from: f */
                public final C1472h7 m5078f() {
/* 3 */             String strM5075b = m5075b("sentry-trace_id");
/* 9 */             String strM5075b2 = m5075b("sentry-replay_id");
/* 15 */            String strM5075b3 = m5075b("sentry-public_key");
/* 20 */            if (strM5075b == null || strM5075b3 == null) {
/* 19 */                return null;
                    }
/* 83 */            C1472h7 c1472h7 = new C1472h7(new C1626w(strM5075b), strM5075b3, m5075b("sentry-release"), m5075b("sentry-environment"), m5075b("sentry-user_id"), m5075b("sentry-transaction"), m5074c(this.f10773c), m5075b("sentry-sampled"), strM5075b2 != null ? new C1626w(strM5075b2) : null, m5074c(this.f10774d));
/* 88 */            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
/* 91 */            C1702a c1702a = this.f10772b;
/* 93 */            c1702a.m5443c();
                    try {
/* 110 */               for (Map.Entry entry : this.f10771a.entrySet()) {
/* 122 */                   String str = (String) entry.getKey();
/* 128 */                   String str2 = (String) entry.getValue();
/* 136 */                   if (!AbstractC1375b.f10711a.contains(str) && str2 != null) {
/* 148 */                       concurrentHashMap.put(str.replaceFirst("sentry-", HttpUrl.FRAGMENT_ENCODE_SET), str2);
                            }
                        }
/* 155 */               c1702a.close();
/* 158 */               c1472h7.f10986V = concurrentHashMap;
/* 160 */               return c1472h7;
                    } catch (Throwable th) {
                        try {
/* 161 */                   c1702a.close();
/* 169 */                   throw th;
                        } catch (Throwable th2) {
/* 166 */                   th.addSuppressed(th2);
/* 169 */                   throw th;
                        }
                    }
                }

/* 26 */        public C1387c(ILogger iLogger) {
/* 27 */            this(new ConcurrentHashMap(), null, null, null, false, iLogger);
                }
            }
