            package p000;

            import com.google.android.gms.internal.drive.zzjr;
            import com.google.android.gms.internal.measurement.zzbk;
            import com.google.android.gms.internal.measurement.zzh;
            import com.google.android.gms.internal.measurement.zzll;
            import com.google.android.gms.internal.play_billing.zzgr;
            import com.google.android.recaptcha.internal.zzqv;
            import io.sentry.C1697u2;
            import java.util.ArrayList;
            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract /* synthetic */ class pm2 {
                /* JADX INFO: renamed from: a */
                public static final boolean m7478a(int i) {
/* 5 */             return !to2.m8821a();
                }

                /* JADX INFO: renamed from: b */
                public static final boolean m7479b(int i) {
                    Boolean bool;
/* 5 */             if (to2.m8821a()) {
                        try {
/* 24 */                    bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
                        } catch (Exception unused) {
/* 31 */                    to2.f17201a.info("Conscrypt is not available or does not support checking for FIPS build.");
/* 34 */                    bool = Boolean.FALSE;
                        }
/* 40 */                if (!bool.booleanValue()) {
/* 43 */                    return false;
                        }
                    }
/* 45 */            return true;
                }

                /* JADX INFO: renamed from: c */
                public static /* synthetic */ int m7480c(Object obj) {
/* 3 */             if (obj instanceof String) {
/* 5 */                 return 2;
                    }
/* 9 */             if (obj instanceof Boolean) {
/* 11 */                return 1;
                    }
/* 15 */            if (obj instanceof Long) {
/* 17 */                return 3;
                    }
/* 21 */            if (obj instanceof Double) {
/* 23 */                return 4;
                    }
/* 39 */            C1951n4.m6856g("invalid tag type: ".concat(String.valueOf(obj.getClass())));
/* 42 */            return 0;
                }

                /* JADX INFO: renamed from: d */
                public static /* synthetic */ char m7481d(int i) {
/* 4 */             if (i == 1) {
/* 2 */                 return '{';
                    }
/* 9 */             if (i == 2) {
/* 7 */                 return '[';
                    }
/* 12 */            if (i == 3) {
/* 2 */                 return '{';
                    }
/* 15 */            if (i == 4) {
/* 7 */                 return '[';
                    }
/* 19 */            throw null;
                }

                /* JADX INFO: renamed from: e */
                public static /* synthetic */ char m7482e(int i) {
/* 4 */             if (i == 1) {
/* 2 */                 return '}';
                    }
/* 9 */             if (i == 2) {
/* 7 */                 return ']';
                    }
/* 12 */            if (i == 3) {
/* 2 */                 return '}';
                    }
/* 15 */            if (i == 4) {
/* 7 */                 return ']';
                    }
/* 19 */            throw null;
                }

                /* JADX INFO: renamed from: f */
                public static int m7483f(int i, int i2, int i3) {
/* 1 */             int i4 = i / i2;
/* 3 */             return i4 + i4 + i3;
                }

                /* JADX INFO: renamed from: g */
                public static int m7484g(int i, int i2, int i3, int i4) {
/* 7 */             return zzjr.zzad(i) + i2 + i3 + i4;
                }

                /* JADX INFO: renamed from: h */
                public static int m7485h(int i, int i2, String str) {
/* 6 */             return (str.hashCode() + i) * i2;
                }

                /* JADX INFO: renamed from: i */
                public static ClassCastException m7486i(int i, ArrayList arrayList) {
/* 5 */             arrayList.get(i).getClass();
/* 10 */            return new ClassCastException();
                }

                /* JADX INFO: renamed from: j */
                public static Object m7487j(zzbk zzbkVar, int i, List list, int i2) {
/* 5 */             zzh.zza(zzbkVar.name(), i, list);
/* 8 */             return list.get(i2);
                }

                /* JADX INFO: renamed from: k */
                public static String m7488k(String str, long j) {
/* 9 */             return str + j;
                }

                /* JADX INFO: renamed from: l */
                public static String m7489l(String str, String str2, String str3, String str4) {
/* 18 */            return str + str2 + str3 + str4;
                }

                /* JADX INFO: renamed from: m */
                public static /* synthetic */ void m7490m(Object obj) {
/* 1 */             if (obj == null) {
/* 3 */                 return;
                    }
/* 4 */             C1697u2.m5431g();
                }

                /* JADX INFO: renamed from: n */
                public static int m7491n(int i, int i2, int i3) {
/* 6 */             return zzgr.zzz(i) + i2 + i3;
                }

                /* JADX INFO: renamed from: o */
                public static int m7492o(int i, int i2, int i3, int i4) {
/* 7 */             return kn3.m6154p(i) + i2 + i3 + i4;
                }

                /* JADX INFO: renamed from: p */
                public static int m7493p(int i, int i2, int i3) {
/* 6 */             return zzll.zzz(i) + i2 + i3;
                }

                /* JADX INFO: renamed from: q */
                public static int m7494q(int i, int i2, int i3) {
/* 6 */             return kn3.m6154p(i) + i2 + i3;
                }

                /* JADX INFO: renamed from: r */
                public static int m7495r(int i, int i2, int i3) {
/* 6 */             return (kn3.m6154p(i) * i2) + i3;
                }

                /* JADX INFO: renamed from: s */
                public static int m7496s(int i, int i2, int i3) {
/* 6 */             return zzqv.zzA(i) + i2 + i3;
                }
            }
