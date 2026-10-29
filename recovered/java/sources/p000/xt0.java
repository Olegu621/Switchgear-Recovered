            package p000;

            import android.content.pm.PackageManager;
            import android.content.pm.Signature;
            import android.hardware.camera2.CameraCharacteristics;
            import android.os.Bundle;
            import android.util.Log;
            import android.view.View;
            import com.google.android.gms.tasks.Continuation;
            import com.google.android.gms.tasks.SuccessContinuation;
            import com.google.android.gms.tasks.Task;
            import com.google.android.gms.tasks.Tasks;
            import java.io.FileInputStream;
            import java.io.IOException;
            import java.util.Arrays;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Locale;
            import java.util.Map;
            import java.util.Set;
            import java.util.WeakHashMap;
            import java.util.concurrent.Executor;
            import java.util.logging.Logger;
            import kotlin.Unit;
            import kotlin.collections.CollectionsKt;
            import kotlin.coroutines.InterfaceC1845f;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 35 */    public class xt0 implements InterfaceC2475xv, InterfaceC0934fy, InterfaceC1845f, Continuation, SuccessContinuation, yg2, InterfaceC2277v1, j53, v32 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f19369a;

                /* JADX INFO: renamed from: b */
                public static final xt0 f19361b = new xt0(1);

                /* JADX INFO: renamed from: c */
                public static final xt0 f19362c = new xt0(2);

                /* JADX INFO: renamed from: d */
                public static final xt0 f19363d = new xt0(3);

                /* JADX INFO: renamed from: e */
                public static final xt0 f19364e = new xt0(4);

                /* JADX INFO: renamed from: f */
                public static final xt0 f19365f = new xt0(5);

                /* JADX INFO: renamed from: i */
                public static final xt0 f19366i = new xt0(6);

                /* JADX INFO: renamed from: v */
                public static final xt0 f19367v = new xt0(7);

                /* JADX INFO: renamed from: w */
                public static final /* synthetic */ xt0 f19368w = new xt0(8);

                /* JADX INFO: renamed from: U */
                public static final xt0 f19356U = new xt0(9);

                /* JADX INFO: renamed from: V */
                public static final xt0 f19357V = new xt0(11);

                /* JADX INFO: renamed from: W */
                public static final xt0 f19358W = new xt0(12);

                /* JADX INFO: renamed from: X */
                public static final /* synthetic */ xt0 f19359X = new xt0(13);

                /* JADX INFO: renamed from: Y */
                public static final /* synthetic */ xt0 f19360Y = new xt0(14);

                public xt0(C1799jn c1799jn, C0962gp c0962gp, er0 er0Var, y92 y92Var, nt0 nt0Var) {
/* 3 */             this.f19369a = 23;
/* 14 */            Integer num = (Integer) c0962gp.m3981a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
/* 16 */            int i = 2;
/* 17 */            if (num != null) {
/* 19 */                num.intValue();
                    }
/* 25 */            new q62(er0Var);
/* 33 */            xe2.m9787y(new C2357x6(c0962gp, i));
                }

                /* JADX INFO: renamed from: a */
                public static Locale m10026a(String str) {
/* 3 */             List listM6224c = zs1.f20320a.m6224c(str);
/* 14 */            String str2 = (String) CollectionsKt.m6201v(0, listM6224c);
/* 16 */            String str3 = HttpUrl.FRAGMENT_ENCODE_SET;
/* 18 */            if (str2 == null) {
/* 20 */                str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 26 */            String str4 = (String) CollectionsKt.m6201v(1, listM6224c);
/* 28 */            if (str4 != null) {
/* 31 */                str3 = str4;
                    }
/* 32 */            return new Locale(str2, str3);
                }

                /* JADX INFO: renamed from: c */
                public static vk1 m10027c(FileInputStream fileInputStream) throws d20 {
                    byte[] bArr;
/* 1 */             fileInputStream.getClass();
                    try {
/* 4 */                 nw1 nw1VarM7065o = nw1.m7065o(fileInputStream);
/* 13 */                vk1 vk1Var = new vk1(false);
/* 20 */                jw1[] jw1VarArr = (jw1[]) Arrays.copyOf(new jw1[0], 0);
/* 22 */                vk1Var.m9299b();
/* 27 */                if (jw1VarArr.length > 0) {
/* 291 */                   jw1 jw1Var = jw1VarArr[0];
/* 293 */                   throw null;
                        }
/* 29 */                Map mapM7067m = nw1VarM7065o.m7067m();
/* 33 */                mapM7067m.getClass();
/* 48 */                for (Map.Entry entry : mapM7067m.entrySet()) {
/* 60 */                    String str = (String) entry.getKey();
/* 66 */                    rw1 rw1Var = (rw1) entry.getValue();
/* 68 */                    str.getClass();
/* 71 */                    rw1Var.getClass();
/* 74 */                    int iM8307C = rw1Var.m8307C();
                            switch (iM8307C == 0 ? -1 : kw1.f13029a[AbstractC0886en.m3520y(iM8307C)]) {
                                case -1:
/* 274 */                           throw new d20("Value case is null.", null);
                                case 0:
                                default:
/* 93 */                            ds0.m3187b();
/* 26 */                            return null;
                                case 1:
/* 262 */                           vk1Var.m9301d(new iw1(str), Boolean.valueOf(rw1Var.m8308t()));
                                    break;
                                case 2:
/* 244 */                           vk1Var.m9301d(new iw1(str), Float.valueOf(rw1Var.m8311x()));
                                    break;
                                case 3:
/* 226 */                           vk1Var.m9301d(new iw1(str), Double.valueOf(rw1Var.m8310w()));
                                    break;
                                case 4:
/* 208 */                           vk1Var.m9301d(new iw1(str), Integer.valueOf(rw1Var.m8312y()));
                                    break;
                                case 5:
/* 190 */                           vk1Var.m9301d(new iw1(str), Long.valueOf(rw1Var.m8313z()));
                                    break;
                                case 6:
/* 162 */                           iw1 iw1Var = new iw1(str);
/* 165 */                           String strM8305A = rw1Var.m8305A();
/* 169 */                           strM8305A.getClass();
/* 172 */                           vk1Var.m9301d(iw1Var, strM8305A);
                                    break;
                                case 7:
/* 138 */                           iw1 iw1Var2 = new iw1(str);
/* 145 */                           dz0 dz0VarM7572n = rw1Var.m8306B().m7572n();
/* 149 */                           dz0VarM7572n.getClass();
/* 156 */                           vk1Var.m9301d(iw1Var2, CollectionsKt.m6195N(dz0VarM7572n));
                                    break;
                                case 8:
/* 107 */                           iw1 iw1Var3 = new iw1(str);
/* 110 */                           C2259ul c2259ulM8309u = rw1Var.m8309u();
/* 114 */                           int size = c2259ulM8309u.size();
/* 118 */                           if (size == 0) {
/* 120 */                               bArr = fz0.f8402b;
                                    } else {
/* 123 */                               byte[] bArr2 = new byte[size];
/* 125 */                               c2259ulM8309u.mo8550d(bArr2, size);
/* 128 */                               bArr = bArr2;
                                    }
/* 129 */                           bArr.getClass();
/* 132 */                           vk1Var.m9301d(iw1Var3, bArr);
                                    break;
                                case 9:
/* 104 */                           throw new d20("Value not set.", null);
                            }
                        }
/* 287 */               return new vk1(new LinkedHashMap(vk1Var.m9298a()), true);
                    } catch (qz0 e) {
/* 302 */               throw new d20("Unable to parse preferences proto.", e);
                    }
                }

                /* JADX INFO: renamed from: e */
                public static Unit m10028e(Object obj, ix2 ix2Var) {
                    tq0 tq0VarM7536a;
/* 3 */             Map mapM9298a = ((vk1) obj).m9298a();
/* 7 */             lw1 lw1VarM7064n = nw1.m7064n();
/* 24 */            for (Map.Entry entry : mapM9298a.entrySet()) {
/* 36 */                iw1 iw1Var = (iw1) entry.getKey();
/* 38 */                Object value = entry.getValue();
/* 42 */                String str = iw1Var.f11950a;
/* 46 */                if (value instanceof Boolean) {
/* 48 */                    qw1 qw1VarM8295D = rw1.m8295D();
/* 54 */                    boolean zBooleanValue = ((Boolean) value).booleanValue();
/* 58 */                    qw1VarM8295D.m7538c();
/* 65 */                    rw1.m8301q((rw1) qw1VarM8295D.f15246b, zBooleanValue);
/* 68 */                    tq0VarM7536a = qw1VarM8295D.m7536a();
                        } else if (value instanceof Float) {
/* 80 */                    qw1 qw1VarM8295D2 = rw1.m8295D();
/* 86 */                    float fFloatValue = ((Number) value).floatValue();
/* 90 */                    qw1VarM8295D2.m7538c();
/* 97 */                    rw1.m8302r((rw1) qw1VarM8295D2.f15246b, fFloatValue);
/* 100 */                   tq0VarM7536a = qw1VarM8295D2.m7536a();
                        } else if (value instanceof Double) {
/* 112 */                   qw1 qw1VarM8295D3 = rw1.m8295D();
/* 118 */                   double dDoubleValue = ((Number) value).doubleValue();
/* 122 */                   qw1VarM8295D3.m7538c();
/* 129 */                   rw1.m8299o((rw1) qw1VarM8295D3.f15246b, dDoubleValue);
/* 132 */                   tq0VarM7536a = qw1VarM8295D3.m7536a();
                        } else if (value instanceof Integer) {
/* 144 */                   qw1 qw1VarM8295D4 = rw1.m8295D();
/* 150 */                   int iIntValue = ((Number) value).intValue();
/* 154 */                   qw1VarM8295D4.m7538c();
/* 161 */                   rw1.m8303s((rw1) qw1VarM8295D4.f15246b, iIntValue);
/* 164 */                   tq0VarM7536a = qw1VarM8295D4.m7536a();
                        } else if (value instanceof Long) {
/* 176 */                   qw1 qw1VarM8295D5 = rw1.m8295D();
/* 182 */                   long jLongValue = ((Number) value).longValue();
/* 186 */                   qw1VarM8295D5.m7538c();
/* 193 */                   rw1.m8296l((rw1) qw1VarM8295D5.f15246b, jLongValue);
/* 196 */                   tq0VarM7536a = qw1VarM8295D5.m7536a();
                        } else if (value instanceof String) {
/* 207 */                   qw1 qw1VarM8295D6 = rw1.m8295D();
/* 213 */                   qw1VarM8295D6.m7538c();
/* 220 */                   rw1.m8297m((rw1) qw1VarM8295D6.f15246b, (String) value);
/* 223 */                   tq0VarM7536a = qw1VarM8295D6.m7536a();
                        } else if (value instanceof Set) {
/* 234 */                   qw1 qw1VarM8295D7 = rw1.m8295D();
/* 238 */                   ow1 ow1VarM7571o = pw1.m7571o();
/* 244 */                   ow1VarM7571o.m7538c();
/* 251 */                   pw1.m7569l((pw1) ow1VarM7571o.f15246b, (Set) value);
/* 254 */                   qw1VarM8295D7.m7538c();
/* 267 */                   rw1.m8298n((rw1) qw1VarM8295D7.f15246b, (pw1) ow1VarM7571o.m7536a());
/* 270 */                   tq0VarM7536a = qw1VarM8295D7.m7536a();
                        } else {
/* 279 */                   if (!(value instanceof byte[])) {
/* 345 */                       f42.m3656l("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
/* 23 */                        return null;
                            }
/* 281 */                   qw1 qw1VarM8295D8 = rw1.m8295D();
/* 285 */                   byte[] bArr = (byte[]) value;
/* 289 */                   C2259ul c2259ulM9039c = C2259ul.m9039c(bArr, 0, bArr.length);
/* 293 */                   qw1VarM8295D8.m7538c();
/* 300 */                   rw1.m8300p((rw1) qw1VarM8295D8.f15246b, c2259ulM9039c);
/* 303 */                   tq0VarM7536a = qw1VarM8295D8.m7536a();
                        }
/* 309 */               lw1VarM7064n.getClass();
/* 312 */               str.getClass();
/* 315 */               lw1VarM7064n.m7538c();
/* 326 */               nw1.m7063l((nw1) lw1VarM7064n.f15246b).put(str, (rw1) tq0VarM7536a);
                    }
/* 353 */           nw1 nw1Var = (nw1) lw1VarM7064n.m7536a();
/* 355 */           int iMo8856a = nw1Var.mo8856a(null);
/* 359 */           Logger logger = C1905lw.f13504f;
/* 363 */           if (iMo8856a > 4096) {
/* 365 */               iMo8856a = 4096;
                    }
/* 368 */           C1905lw c1905lw = new C1905lw(ix2Var, iMo8856a);
/* 371 */           nw1Var.mo8857b(c1905lw);
/* 376 */           if (c1905lw.f13509d > 0) {
/* 378 */               c1905lw.m6555k();
                    }
/* 381 */           return Unit.f12910a;
                }

                /* JADX INFO: renamed from: b */
                public Signature[] mo9224b(PackageManager packageManager, String str) {
/* 7 */             return packageManager.getPackageInfo(str, 64).signatures;
                }

                @Override // p000.InterfaceC0934fy
                public Object create(InterfaceC0824cy interfaceC0824cy) {
                    switch (this.f19369a) {
                        case 4:
/* 89 */                    Object objMo1261e = ((C0168b5) interfaceC0824cy).mo1261e(new f02(InterfaceC1027ih.class, Executor.class));
/* 93 */                    objMo1261e.getClass();
/* 100 */                   return new of0((Executor) objMo1261e);
                        case 5:
/* 65 */                    Object objMo1261e2 = ((C0168b5) interfaceC0824cy).mo1261e(new f02(l71.class, Executor.class));
/* 69 */                    objMo1261e2.getClass();
/* 76 */                    return new of0((Executor) objMo1261e2);
                        case 6:
/* 41 */                    Object objMo1261e3 = ((C0168b5) interfaceC0824cy).mo1261e(new f02(InterfaceC2296vj.class, Executor.class));
/* 45 */                    objMo1261e3.getClass();
/* 52 */                    return new of0((Executor) objMo1261e3);
                        default:
/* 17 */                    Object objMo1261e4 = ((C0168b5) interfaceC0824cy).mo1261e(new f02(gx2.class, Executor.class));
/* 21 */                    objMo1261e4.getClass();
/* 28 */                    return new of0((Executor) objMo1261e4);
                    }
                }

                @Override // p000.v32
                /* JADX INFO: renamed from: d */
                public boolean mo3405d(String str, String str2) {
/* 1 */             return str.startsWith(str2);
                }

                @Override // p000.j53
                /* JADX INFO: renamed from: p */
                public m83 mo3876p(View view, m83 m83Var, k53 k53Var) {
/* 8 */             k53Var.f12608d = m83Var.m6621a() + k53Var.f12608d;
/* 10 */            WeakHashMap weakHashMap = e33.f7494a;
/* 17 */            boolean z = view.getLayoutDirection() == 1;
/* 21 */            int iM6622b = m83Var.m6622b();
/* 25 */            int iM6623c = m83Var.m6623c();
/* 36 */            int i = k53Var.f12605a + (z ? iM6623c : iM6622b);
/* 37 */            k53Var.f12605a = i;
/* 39 */            int i2 = k53Var.f12607c;
/* 41 */            if (!z) {
/* 44 */                iM6622b = iM6623c;
                    }
/* 45 */            int i3 = i2 + iM6622b;
/* 46 */            k53Var.f12607c = i3;
/* 52 */            view.setPaddingRelative(i, k53Var.f12606b, i3, k53Var.f12608d);
/* 55 */            return m83Var;
                }

                @Override // com.google.android.gms.tasks.Continuation
                public Object then(Task task) throws IOException {
/* 5 */             if (task.isSuccessful()) {
/* 11 */                return (Bundle) task.getResult();
                    }
/* 21 */            if (Log.isLoggable("Rpc", 3)) {
/* 34 */                "Error making request: ".concat(String.valueOf(task.getException()));
                    }
/* 48 */            throw new IOException("SERVICE_NOT_AVAILABLE", task.getException());
                }

/* 36 */        public /* synthetic */ xt0(int i) {
/* 37 */            this.f19369a = i;
                }

                @Override // com.google.android.gms.tasks.SuccessContinuation
/* 48 */        public Task then(Object obj) {
                    Bundle bundle = (Bundle) obj;
/* 49 */            int i = h52.f8902h;
/* 50 */            if (bundle != null && bundle.containsKey("google.messenger")) {
/* 51 */                return Tasks.forResult(null);
                    }
/* 52 */            return Tasks.forResult(bundle);
                }
            }
