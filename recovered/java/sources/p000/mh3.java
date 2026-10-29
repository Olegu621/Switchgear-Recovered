            package p000;

            import android.os.Bundle;
            import com.google.android.gms.measurement.internal.zzbe;
            import com.google.android.gms.measurement.internal.zzbg;
            import java.util.ArrayList;
            import java.util.Objects;
            import java.util.concurrent.atomic.AtomicReference;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class mh3 {

                /* JADX INFO: renamed from: b */
                public static final AtomicReference f13784b = new AtomicReference();

                /* JADX INFO: renamed from: c */
                public static final AtomicReference f13785c = new AtomicReference();

                /* JADX INFO: renamed from: d */
                public static final AtomicReference f13786d = new AtomicReference();

                /* JADX INFO: renamed from: a */
                public final oi3 f13787a;

                public mh3(oi3 oi3Var) {
/* 4 */             this.f13787a = oi3Var;
                }

                /* JADX INFO: renamed from: g */
                public static final String m6655g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
                    String str2;
/* 1 */             kb1.m6061n(atomicReference);
/* 12 */            kb1.m6054g(strArr.length == strArr2.length);
/* 16 */            for (int i = 0; i < strArr.length; i++) {
/* 24 */                if (Objects.equals(str, strArr[i])) {
                            synchronized (atomicReference) {
                                try {
/* 31 */                            String[] strArr3 = (String[]) atomicReference.get();
/* 33 */                            if (strArr3 == null) {
/* 36 */                                strArr3 = new String[strArr2.length];
/* 38 */                                atomicReference.set(strArr3);
                                    }
/* 44 */                            str2 = strArr3[i];
/* 46 */                            if (str2 == null) {
/* 73 */                                str2 = strArr2[i] + "(" + strArr[i] + ")";
/* 77 */                                strArr3[i] = str2;
                                    }
                                } catch (Throwable th) {
/* 82 */                            throw th;
                                }
                            }
/* 80 */                    return str2;
                        }
                    }
/* 86 */            return str;
                }

                /* JADX INFO: renamed from: a */
                public final String m6656a(String str) {
/* 1 */             if (str == null) {
/* 3 */                 return null;
                    }
                    return !this.f13787a.m7175a() ? str : m6655g(str, i13.f9405h, i13.f9403f, f13784b);
                }

                /* JADX INFO: renamed from: b */
                public final String m6657b(String str) {
/* 1 */             if (str == null) {
/* 3 */                 return null;
                    }
                    return !this.f13787a.m7175a() ? str : m6655g(str, j13.f12007q, j13.f12006p, f13785c);
                }

                /* JADX INFO: renamed from: c */
                public final String m6658c(String str) {
/* 1 */             if (str == null) {
/* 3 */                 return null;
                    }
/* 11 */            if (this.f13787a.m7175a()) {
                        return str.startsWith("_exp_") ? fm0.m3784j("experiment_id(", str, ")") : m6655g(str, mn0.f13874i, mn0.f13873h, f13786d);
                    }
/* 13 */            return str;
                }

                /* JADX INFO: renamed from: d */
                public final String m6659d(zzbg zzbgVar) {
                    String string;
/* 1 */             oi3 oi3Var = this.f13787a;
/* 7 */             if (!oi3Var.m7175a()) {
/* 9 */                 return zzbgVar.toString();
                    }
/* 18 */            StringBuilder sb = new StringBuilder("origin=");
/* 23 */            sb.append(zzbgVar.f4210c);
/* 28 */            sb.append(",name=");
/* 37 */            sb.append(m6656a(zzbgVar.f4208a));
/* 42 */            sb.append(",params=");
/* 45 */            zzbe zzbeVar = zzbgVar.f4209b;
/* 47 */            if (zzbeVar == null) {
/* 49 */                string = null;
                    } else {
/* 68 */                string = !oi3Var.m7175a() ? zzbeVar.f4207a.toString() : m6660e(zzbeVar.m2167G1());
                    }
/* 72 */            sb.append(string);
/* 75 */            return sb.toString();
                }

                /* JADX INFO: renamed from: e */
                public final String m6660e(Bundle bundle) {
                    String strM6661f;
/* 1 */             if (bundle == null) {
/* 3 */                 return null;
                    }
/* 11 */            if (!this.f13787a.m7175a()) {
/* 13 */                return bundle.toString();
                    }
/* 20 */            StringBuilder sbM3512p = AbstractC0886en.m3512p("Bundle[{");
/* 36 */            for (String str : bundle.keySet()) {
/* 50 */                if (sbM3512p.length() != 8) {
/* 54 */                    sbM3512p.append(", ");
                        }
/* 61 */                sbM3512p.append(m6657b(str));
/* 66 */                sbM3512p.append("=");
/* 69 */                Object obj = bundle.get(str);
/* 75 */                if (obj instanceof Bundle) {
/* 81 */                    strM6661f = m6661f(new Object[]{obj});
                        } else if (obj instanceof Object[]) {
/* 92 */                    strM6661f = m6661f((Object[]) obj);
                        } else {
/* 112 */                   strM6661f = obj instanceof ArrayList ? m6661f(((ArrayList) obj).toArray()) : String.valueOf(obj);
                        }
/* 116 */               sbM3512p.append(strM6661f);
                    }
/* 122 */           sbM3512p.append("}]");
/* 125 */           return sbM3512p.toString();
                }

                /* JADX INFO: renamed from: f */
                public final String m6661f(Object[] objArr) {
/* 1 */             if (objArr == null) {
/* 3 */                 return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
                    }
/* 8 */             StringBuilder sbM3512p = AbstractC0886en.m3512p("[");
/* 14 */            for (Object obj : objArr) {
/* 29 */                String strM6660e = obj instanceof Bundle ? m6660e((Bundle) obj) : String.valueOf(obj);
/* 33 */                if (strM6660e != null) {
/* 40 */                    if (sbM3512p.length() != 1) {
/* 44 */                        sbM3512p.append(", ");
                            }
/* 47 */                    sbM3512p.append(strM6660e);
                        }
                    }
/* 55 */            sbM3512p.append("]");
/* 58 */            return sbM3512p.toString();
                }
            }
