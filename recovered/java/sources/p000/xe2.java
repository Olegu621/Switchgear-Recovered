            package p000;

            import android.content.Context;
            import android.content.SharedPreferences;
            import android.content.res.TypedArray;
            import android.graphics.Color;
            import android.hardware.camera2.CameraCharacteristics;
            import android.icu.text.DateFormat;
            import android.icu.util.TimeZone;
            import android.media.MediaDrm;
            import android.media.MediaMetadataRetriever;
            import android.net.Uri;
            import android.os.Build;
            import android.util.TypedValue;
            import android.view.View;
            import android.view.ViewGroup;
            import android.webkit.WebResourceRequest;
            import android.webkit.WebResourceResponse;
            import androidx.camera.camera2.internal.compat.quirk.FlashAvailabilityBufferUnderflowQuirk;
            import com.google.android.gms.common.Feature;
            import com.google.android.gms.drive.metadata.internal.MetadataBundle;
            import com.usercentrics.sdk.p008ui.R$dimen;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import io.sentry.config.AbstractC1417a;
            import java.io.BufferedInputStream;
            import java.io.File;
            import java.io.FileInputStream;
            import java.nio.BufferUnderflowException;
            import java.util.Calendar;
            import java.util.Collections;
            import java.util.Date;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Locale;
            import java.util.Map;
            import java.util.Set;
            import java.util.WeakHashMap;
            import java.util.concurrent.CancellationException;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.ForkJoinPool;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.atomic.AtomicReference;
            import kotlin.coroutines.CoroutineContext;
            import kotlin.jvm.functions.Function2;
            import kotlin.text.C1852e;
            import kotlinx.serialization.descriptors.SerialDescriptor;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class xe2 implements ze2 {

                /* JADX INFO: renamed from: b */
                public static final C2131r4 f19059b;

                /* JADX INFO: renamed from: c */
                public static final C2131r4 f19060c;

                /* JADX INFO: renamed from: d */
                public static final SerialDescriptor[] f19061d = new SerialDescriptor[0];

                /* JADX INFO: renamed from: e */
                public static final Feature f19062e = new Feature("is_user_verifying_platform_authenticator_available_for_credential", 1);

                /* JADX INFO: renamed from: f */
                public static final Feature f19063f = new Feature("is_user_verifying_platform_authenticator_available", 1);

                /* JADX INFO: renamed from: g */
                public static final Feature f19064g = new Feature("privileged_api_list_credentials", 2);

                /* JADX INFO: renamed from: h */
                public static zr3 f19065h;

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f19066a;

                static {
/* 5 */             int i = 8;
/* 10 */            f19059b = new C2131r4("UNDEFINED", i);
/* 19 */            f19060c = new C2131r4("REUSABLE_CLAIMED", i);
                }

                /* JADX INFO: renamed from: A */
                public static int m9757A(int i, float f, int i2) {
/* 15 */            return AbstractC0196bx.m1452d(AbstractC0196bx.m1454f(i2, Math.round(Color.alpha(i2) * f)), i);
                }

                /* JADX INFO: renamed from: B */
                public static final Integer m9758B(String str) {
/* 1 */             str.getClass();
                    try {
/* 26 */                return Integer.valueOf(C1852e.m6263m(str, "#", false) ? Color.parseColor(str) : Color.parseColor("#".concat(str)));
                    } catch (Throwable th) {
/* 53 */                qu1.f15755a.mo2907b("Error when parsing color with HEX<" + str + ">", th);
/* 56 */                return null;
                    }
                }

                /* JADX INFO: renamed from: C */
                public static final void m9759C(c10 c10Var, Object obj) {
/* 3 */             if (!(c10Var instanceof p80)) {
/* 178 */               c10Var.resumeWith(obj);
/* 181 */               return;
                    }
/* 5 */             p80 p80Var = (p80) c10Var;
/* 7 */             s10 s10Var = p80Var.f15019d;
/* 9 */             d10 d10Var = p80Var.f15020e;
/* 11 */            Throwable thM7099a = o42.m7099a(obj);
/* 22 */            Object c1980nx = thM7099a == null ? obj : new C1980nx(false, thM7099a);
/* 25 */            d10Var.getContext();
/* 33 */            if (s10Var.mo6281i()) {
/* 35 */                p80Var.f15021f = c1980nx;
/* 37 */                p80Var.f15912c = 1;
/* 43 */                s10Var.mo1539g(d10Var.getContext(), p80Var);
/* 46 */                return;
                    }
/* 47 */            ze0 ze0VarM3167a = do2.m3167a();
/* 60 */            if (ze0VarM3167a.f20122c >= 4294967296L) {
/* 62 */                p80Var.f15021f = c1980nx;
/* 64 */                p80Var.f15912c = 1;
/* 66 */                ze0VarM3167a.m10346m(p80Var);
/* 172 */               return;
                    }
/* 70 */            ze0VarM3167a.m10347n(true);
                    try {
/* 84 */                h01 h01Var = (h01) d10Var.getContext().get(xt0.f19368w);
/* 86 */                if (h01Var == null || h01Var.isActive()) {
/* 111 */                   Object obj2 = p80Var.f15022i;
/* 113 */                   CoroutineContext context = d10Var.getContext();
/* 117 */                   Object objM1741c = co2.m1741c(context, obj2);
/* 130 */                   kx2 kx2VarM5638C = objM1741c != co2.f3022a ? j13.m5638C(d10Var, context, objM1741c) : null;
                            try {
/* 131 */                       d10Var.resumeWith(obj);
/* 134 */                       if (kx2VarM5638C == null || kx2VarM5638C.m6305X()) {
/* 142 */                           co2.m1739a(context, objM1741c);
                                }
                            } catch (Throwable th) {
/* 156 */                       if (kx2VarM5638C == null || kx2VarM5638C.m6305X()) {
/* 164 */                           co2.m1739a(context, objM1741c);
                                }
/* 167 */                       throw th;
                            }
                        } else {
/* 94 */                    CancellationException cancellationException = h01Var.getCancellationException();
/* 98 */                    p80Var.mo3556c(c1980nx, cancellationException);
/* 105 */                   p80Var.resumeWith(pg3.m7426e(cancellationException));
                        }
/* 149 */               while (ze0VarM3167a.m10348p()) {
                        }
                    } catch (Throwable th2) {
                        try {
/* 168 */                   p80Var.m8080i(th2, null);
                        } finally {
/* 174 */                   ze0VarM3167a.m10345l(true);
                        }
                    }
                }

                /* JADX INFO: renamed from: E */
                public static final void m9761E(o21 o21Var) {
/* 31 */            throw new ea2("Serializer for class '" + ((C0857dv) o21Var).m3242b() + "' is not found.\nMark the class as @Serializable or provide the serializer explicitly.");
                }

                /* JADX INFO: renamed from: F */
                public static final Object m9762F(p72 p72Var, p72 p72Var2, Function2 function2) throws Throwable {
                    Object c1980nx;
                    Object objM10239E;
                    try {
/* 2 */                 gs2.m4011b(2, function2);
/* 5 */                 c1980nx = function2.invoke(p72Var2, p72Var);
                    } catch (Throwable th) {
/* 14 */                c1980nx = new C1980nx(false, th);
                    }
/* 18 */            z10 z10Var = z10.f19902a;
/* 20 */            if (c1980nx == z10Var || (objM10239E = p72Var.m10239E(c1980nx)) == j13.f11997g) {
/* 40 */                return z10Var;
                    }
/* 34 */            if (objM10239E instanceof C1980nx) {
/* 45 */                throw ((C1980nx) objM10239E).f14555a;
                    }
/* 36 */            return j13.m5637B(objM10239E);
                }

                /* JADX INFO: renamed from: G */
                public static int m9763G(int i) {
/* 1 */             if (i == 0) {
/* 32 */                return 0;
                    }
/* 4 */             if (i == 1) {
/* 29 */                return 90;
                    }
/* 7 */             if (i == 2) {
/* 26 */                return 180;
                    }
/* 10 */            if (i == 3) {
/* 12 */                return 270;
                    }
/* 21 */            C1951n4.m6859j(fm0.m3781g(i, "Unsupported surface rotation: "));
/* 24 */            return 0;
                }

                /* JADX INFO: renamed from: H */
                public static ii1 m9764H(MetadataBundle metadataBundle) {
/* 1 */             metadataBundle.getClass();
/* 6 */             HashSet hashSet = new HashSet();
/* 15 */            Iterator<String> it = metadataBundle.f3683a.keySet().iterator();
/* 23 */            while (it.hasNext()) {
/* 39 */                hashSet.add((ii1) hg3.f9074a.get(it.next()));
                    }
/* 48 */            if (hashSet.size() == 1) {
/* 58 */                return (ii1) hashSet.iterator().next();
                    }
/* 63 */            C1951n4.m6859j("bundle should have exactly 1 populated field");
/* 66 */            return null;
                }

                /* JADX INFO: renamed from: c */
                public static final void m9765c(View view) {
/* 1 */             view.getClass();
/* 10 */            view.post(new RunnableC1012i1(view, 0));
                }

                /* JADX INFO: renamed from: d */
                public static final Set m9766d(SerialDescriptor serialDescriptor) {
/* 1 */             serialDescriptor.getClass();
/* 6 */             if (serialDescriptor instanceof InterfaceC1895lm) {
/* 10 */                return ((InterfaceC1895lm) serialDescriptor).mo131b();
                    }
/* 21 */            HashSet hashSet = new HashSet(serialDescriptor.mo135f());
/* 24 */            int iMo135f = serialDescriptor.mo135f();
/* 29 */            for (int i = 0; i < iMo135f; i++) {
/* 35 */                hashSet.add(serialDescriptor.mo136g(i));
                    }
/* 41 */            return hashSet;
                }

                /* JADX INFO: renamed from: e */
                public static final void m9767e(o21 o21Var, Object obj) {
                    boolean zIsInstance;
                    String strM2891a;
/* 1 */             o21Var.getClass();
/* 6 */             C0821cv c0821cv = C0857dv.f7417b;
/* 8 */             Class cls = ((C0857dv) o21Var).f7419a;
/* 10 */            c0821cv.getClass();
/* 13 */            cls.getClass();
/* 16 */            Map map = C0857dv.f7418c;
/* 18 */            map.getClass();
/* 25 */            Integer num = (Integer) map.get(cls);
/* 27 */            if (num != null) {
/* 33 */                zIsInstance = gs2.m4012c(num.intValue(), obj);
                    } else {
/* 54 */                zIsInstance = (cls.isPrimitive() ? yy1.m10225t(j22.m5667a(cls)) : cls).isInstance(obj);
                    }
/* 58 */            if (zIsInstance) {
/* 147 */               obj.getClass();
/* 150 */               return;
                    }
/* 66 */            StringBuilder sb = new StringBuilder("Value cannot be cast to ");
/* 69 */            cls.getClass();
/* 76 */            String strM2891a2 = null;
/* 77 */            if (!cls.isAnonymousClass() && !cls.isLocalClass()) {
/* 89 */                if (cls.isArray()) {
/* 91 */                    Class<?> componentType = cls.getComponentType();
/* 99 */                    if (componentType.isPrimitive() && (strM2891a = C0821cv.m2891a(componentType.getName())) != null) {
/* 113 */                       strM2891a2 = strM2891a.concat("Array");
                            }
/* 117 */                   if (strM2891a2 == null) {
/* 119 */                       strM2891a2 = "kotlin.Array";
                            }
                        } else {
/* 126 */                   strM2891a2 = C0821cv.m2891a(cls.getName());
/* 130 */                   if (strM2891a2 == null) {
/* 132 */                       strM2891a2 = cls.getCanonicalName();
                            }
                        }
                    }
/* 136 */           sb.append(strM2891a2);
/* 146 */           throw new ClassCastException(sb.toString());
                }

                /* JADX INFO: renamed from: f */
                public static void m9768f(int i, Object[] objArr) {
/* 2 */             for (int i2 = 0; i2 < i; i2++) {
/* 6 */                 if (objArr[i2] == null) {
/* 17 */                    StringBuilder sb = new StringBuilder(20);
/* 22 */                    sb.append("at index ");
/* 25 */                    sb.append(i2);
/* 35 */                    throw new NullPointerException(sb.toString());
                        }
                    }
                }

                /* JADX INFO: renamed from: g */
                public static void m9769g(Object obj, String str) {
/* 1 */             if (obj != null) {
/* 3 */                 return;
                    }
/* 4 */             C1951n4.m6868s(str);
                }

                /* JADX INFO: renamed from: h */
                public static final void m9770h(AutoCloseable autoCloseable, Throwable th) throws Exception {
                    boolean zIsTerminated;
/* 1 */             if (autoCloseable != null) {
/* 3 */                 if (th != null) {
                            try {
/* 98 */                        AbstractC0886en.m3517u(autoCloseable);
/* 101 */                       return;
                            } catch (Throwable th2) {
/* 103 */                       jf0.m5798a(th, th2);
/* 106 */                       return;
                            }
                        }
/* 7 */                 if (autoCloseable instanceof AutoCloseable) {
/* 9 */                     autoCloseable.close();
/* 106 */                   return;
                        }
/* 15 */                if (!(autoCloseable instanceof ExecutorService)) {
/* 66 */                    if (autoCloseable instanceof TypedArray) {
/* 70 */                        ((TypedArray) autoCloseable).recycle();
/* 106 */                       return;
                            }
/* 76 */                    if (autoCloseable instanceof MediaMetadataRetriever) {
/* 80 */                        ((MediaMetadataRetriever) autoCloseable).release();
/* 106 */                       return;
                            } else if (autoCloseable instanceof MediaDrm) {
/* 90 */                        ((MediaDrm) autoCloseable).release();
/* 106 */                       return;
                            } else {
/* 94 */                        f42.m3649e();
/* 97 */                        return;
                            }
                        }
/* 17 */                ExecutorService executorService = (ExecutorService) autoCloseable;
/* 23 */                if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
/* 106 */                   return;
                        }
/* 32 */                executorService.shutdown();
/* 35 */                boolean z = false;
/* 36 */                while (!zIsTerminated) {
                            try {
/* 42 */                        zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                            } catch (InterruptedException unused) {
/* 47 */                        if (!z) {
/* 49 */                            executorService.shutdownNow();
/* 52 */                            z = true;
                                }
                            }
                        }
/* 54 */                if (z) {
/* 60 */                    Thread.currentThread().interrupt();
                        }
                    }
                }

                /* JADX INFO: renamed from: i */
                public static final SerialDescriptor[] m9771i(List list) {
/* 1 */             if (list == null || list.isEmpty()) {
/* 9 */                 list = null;
                    }
/* 10 */            if (list == null) {
/* 25 */                return f19061d;
                    }
/* 15 */            Object[] array = list.toArray(new SerialDescriptor[0]);
/* 19 */            array.getClass();
/* 22 */            return (SerialDescriptor[]) array;
                }

                /* JADX INFO: renamed from: j */
                public static int m9772j(int i, int i2) {
/* 8 */             return AbstractC0196bx.m1454f(i, (Color.alpha(i) * i2) / 255);
                }

                /* JADX INFO: renamed from: k */
                public static final void m9773k(View view) {
/* 11 */            view.setMinimumWidth(view.getResources().getDimensionPixelOffset(R$dimen.ucFirstLayerLegalLinksOrButtonsMinimumWidth));
/* 24 */            view.setMinimumHeight(view.getResources().getDimensionPixelOffset(R$dimen.ucFirstLayerLegalLinksOrButtonsMinimumHeight));
/* 28 */            view.setFocusable(true);
                }

                /* JADX INFO: renamed from: l */
                public static void m9774l(String str) {
/* 4 */             m9775m("HttpTransprt", str, null);
                }

                /* JADX INFO: renamed from: m */
                public static void m9775m(String str, String str2, Exception exc) {
/* 1 */             zr3 zr3Var = f19065h;
/* 3 */             if (zr3Var == null) {
/* 5 */                 return;
                    }
/* 7 */             zr3Var.m10434j(1, str, str2, exc);
                }

                /* JADX INFO: renamed from: n */
                public static void m9776n(String str) {
/* 4 */             m9777o("HttpTransprt", str, null);
                }

                /* JADX INFO: renamed from: o */
                public static void m9777o(String str, String str2, Throwable th) {
/* 1 */             zr3 zr3Var = f19065h;
/* 3 */             if (zr3Var == null) {
/* 5 */                 return;
                    }
/* 7 */             zr3Var.m10434j(3, str, str2, th);
                }

                /* JADX INFO: renamed from: p */
                public static String m9778p(C2259ul c2259ul) {
/* 7 */             StringBuilder sb = new StringBuilder(c2259ul.size());
/* 15 */            for (int i = 0; i < c2259ul.size(); i++) {
/* 17 */                byte bMo8549a = c2259ul.mo8549a(i);
/* 23 */                if (bMo8549a == 34) {
/* 137 */                   sb.append("\\\"");
                        } else if (bMo8549a == 39) {
/* 131 */                   sb.append("\\'");
                        } else if (bMo8549a != 92) {
                            switch (bMo8549a) {
                                case 7:
/* 119 */                           sb.append("\\a");
                                    break;
                                case 8:
/* 113 */                           sb.append("\\b");
                                    break;
                                case 9:
/* 107 */                           sb.append("\\t");
                                    break;
                                case 10:
/* 101 */                           sb.append("\\n");
                                    break;
                                case 11:
/* 95 */                            sb.append("\\v");
                                    break;
                                case 12:
/* 89 */                            sb.append("\\f");
                                    break;
                                case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 83 */                            sb.append("\\r");
                                    break;
                                default:
/* 38 */                            if (bMo8549a < 32 || bMo8549a > 126) {
/* 49 */                                sb.append('\\');
/* 59 */                                sb.append((char) (((bMo8549a >>> 6) & 3) + 48));
/* 69 */                                sb.append((char) (((bMo8549a >>> 3) & 7) + 48));
/* 77 */                                sb.append((char) ((bMo8549a & 7) + 48));
                                    } else {
/* 45 */                                sb.append((char) bMo8549a);
                                    }
                                    break;
                            }
                        } else {
/* 125 */                   sb.append("\\\\");
                        }
                    }
/* 144 */           return sb.toString();
                }

                /* JADX INFO: renamed from: q */
                public static int m9779q(int i, View view) {
/* 13 */            return yy1.m10198D(view.getContext(), view.getClass().getCanonicalName(), i);
                }

                /* JADX INFO: renamed from: r */
                public static int m9780r(Context context, int i, int i2) {
/* 1 */             TypedValue typedValueM10197C = yy1.m10197C(context, i);
                    return typedValueM10197C != null ? typedValueM10197C.data : i2;
                }

                /* JADX INFO: renamed from: s */
                public static String m9781s(long j) {
/* 1 */             Calendar calendarM4085e = h13.m4085e();
/* 6 */             Calendar calendarM4086f = h13.m4086f(null);
/* 10 */            calendarM4086f.setTimeInMillis(j);
                    return calendarM4085e.get(1) == calendarM4086f.get(1) ? m9782t(j, Locale.getDefault()) : m9785w(j, Locale.getDefault());
                }

                /* JADX INFO: renamed from: t */
                public static String m9782t(long j, Locale locale) {
/* 1 */             AtomicReference atomicReference = h13.f8867a;
/* 5 */             DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("MMMd", locale);
/* 15 */            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
/* 23 */            return instanceForSkeleton.format(new Date(j));
                }

                /* JADX INFO: renamed from: u */
                public static int m9783u(int i, int i2, boolean z) {
/* 10 */            int i3 = z ? ((i2 - i) + 360) % 360 : (i2 + i) % 360;
/* 23 */            if (hu0.m4346q0(2, hu0.m4312F0("CameraOrientationUtil"))) {
/* 25 */                hu0.m4312F0("CameraOrientationUtil");
                    }
/* 28 */            return i3;
                }

                /* JADX WARN: Code duplicated, block: B:29:0x00d2 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:30:0x00d4 A[Catch: Exception -> 0x00cc, TryCatch #0 {Exception -> 0x00cc, blocks: (B:18:0x00a9, B:20:0x00af, B:22:0x00b9, B:30:0x00d4, B:32:0x00e0), top: B:93:0x00a9 }] */
                /* JADX WARN: Code duplicated, block: B:31:0x00de  */
                /* JADX WARN: Code duplicated, block: B:34:0x00fc  */
                /* JADX WARN: Code duplicated, block: B:39:0x0108  */
                /* JADX WARN: Code duplicated, block: B:43:0x011a A[Catch: Exception -> 0x0106, TryCatch #2 {Exception -> 0x0106, blocks: (B:36:0x0102, B:40:0x010a, B:43:0x011a, B:45:0x012d), top: B:97:0x0102 }] */
                /* JADX WARN: Code duplicated, block: B:45:0x012d A[Catch: Exception -> 0x0106, TRY_LEAVE, TryCatch #2 {Exception -> 0x0106, blocks: (B:36:0x0102, B:40:0x010a, B:43:0x011a, B:45:0x012d), top: B:97:0x0102 }] */
                /* JADX WARN: Code duplicated, block: B:49:0x0146 A[Catch: Exception -> 0x01ba, TryCatch #1 {Exception -> 0x01ba, blocks: (B:84:0x01f4, B:47:0x0131, B:49:0x0146, B:50:0x0149, B:54:0x0153, B:57:0x015d, B:61:0x0176, B:63:0x017c, B:65:0x018d, B:66:0x0190, B:68:0x01b6, B:71:0x01bc, B:73:0x01cb, B:76:0x01cf, B:78:0x01d8, B:80:0x01e4, B:82:0x01ee, B:83:0x01f1), top: B:95:0x0131 }] */
                /* JADX WARN: Code duplicated, block: B:56:0x015c  */
                /* JADX WARN: Code duplicated, block: B:57:0x015d A[Catch: Exception -> 0x01ba, TryCatch #1 {Exception -> 0x01ba, blocks: (B:84:0x01f4, B:47:0x0131, B:49:0x0146, B:50:0x0149, B:54:0x0153, B:57:0x015d, B:61:0x0176, B:63:0x017c, B:65:0x018d, B:66:0x0190, B:68:0x01b6, B:71:0x01bc, B:73:0x01cb, B:76:0x01cf, B:78:0x01d8, B:80:0x01e4, B:82:0x01ee, B:83:0x01f1), top: B:95:0x0131 }] */
                /* JADX WARN: Code duplicated, block: B:59:0x0174  */
                /* JADX WARN: Code duplicated, block: B:60:0x0175  */
                /* JADX WARN: Code duplicated, block: B:63:0x017c A[Catch: Exception -> 0x01ba, TryCatch #1 {Exception -> 0x01ba, blocks: (B:84:0x01f4, B:47:0x0131, B:49:0x0146, B:50:0x0149, B:54:0x0153, B:57:0x015d, B:61:0x0176, B:63:0x017c, B:65:0x018d, B:66:0x0190, B:68:0x01b6, B:71:0x01bc, B:73:0x01cb, B:76:0x01cf, B:78:0x01d8, B:80:0x01e4, B:82:0x01ee, B:83:0x01f1), top: B:95:0x0131 }] */
                /* JADX WARN: Code duplicated, block: B:65:0x018d A[Catch: Exception -> 0x01ba, TryCatch #1 {Exception -> 0x01ba, blocks: (B:84:0x01f4, B:47:0x0131, B:49:0x0146, B:50:0x0149, B:54:0x0153, B:57:0x015d, B:61:0x0176, B:63:0x017c, B:65:0x018d, B:66:0x0190, B:68:0x01b6, B:71:0x01bc, B:73:0x01cb, B:76:0x01cf, B:78:0x01d8, B:80:0x01e4, B:82:0x01ee, B:83:0x01f1), top: B:95:0x0131 }] */
                /* JADX WARN: Code duplicated, block: B:68:0x01b6 A[Catch: Exception -> 0x01ba, TryCatch #1 {Exception -> 0x01ba, blocks: (B:84:0x01f4, B:47:0x0131, B:49:0x0146, B:50:0x0149, B:54:0x0153, B:57:0x015d, B:61:0x0176, B:63:0x017c, B:65:0x018d, B:66:0x0190, B:68:0x01b6, B:71:0x01bc, B:73:0x01cb, B:76:0x01cf, B:78:0x01d8, B:80:0x01e4, B:82:0x01ee, B:83:0x01f1), top: B:95:0x0131 }] */
                /* JADX WARN: Code duplicated, block: B:78:0x01d8 A[Catch: Exception -> 0x01ba, TryCatch #1 {Exception -> 0x01ba, blocks: (B:84:0x01f4, B:47:0x0131, B:49:0x0146, B:50:0x0149, B:54:0x0153, B:57:0x015d, B:61:0x0176, B:63:0x017c, B:65:0x018d, B:66:0x0190, B:68:0x01b6, B:71:0x01bc, B:73:0x01cb, B:76:0x01cf, B:78:0x01d8, B:80:0x01e4, B:82:0x01ee, B:83:0x01f1), top: B:95:0x0131 }] */
                /* JADX WARN: Code duplicated, block: B:89:0x021e  */
                /* JADX WARN: Code duplicated, block: B:91:0x0245  */
                /* JADX WARN: Instruction removed from duplicated block: B:57:0x015d, please report this as an issue */
                /* JADX WARN: Instruction removed from duplicated block: B:89:0x021e, please report this as an issue */
                /* JADX WARN: Instruction removed from duplicated block: B:91:0x0245, please report this as an issue */
                /* JADX INFO: renamed from: v */
                public static WebResourceResponse m9784v(C1969nm c1969nm, WebResourceRequest webResourceRequest) {
                    long j;
                    Uri uri;
                    String str;
                    BufferedInputStream bufferedInputStream;
                    String str2;
                    File file;
                    ss0 ss0VarM10324d;
                    SharedPreferences.Editor editorEdit;
                    SharedPreferences.Editor editorEdit2;
                    int i;
                    String name;
                    File[] fileArrListFiles;
                    int i2;
                    String name2;
                    String str3;
                    String str4;
                    SharedPreferences.Editor editorEdit3;
                    SharedPreferences.Editor editorEdit4;
/* 3 */             Uri url = webResourceRequest.getUrl();
/* 7 */             String path = url.getPath();
/* 11 */            String query = url.getQuery();
/* 19 */            String string = webResourceRequest.getUrl().toString();
/* 23 */            Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
/* 27 */            String str5 = "text/html";
/* 29 */            c1969nm.getClass();
/* 32 */            String strM6998c = C1969nm.m6998c(path, query);
/* 38 */            String strM3783i = fm0.m3783i(strM6998c, "_last_success_time");
/* 44 */            er0 er0Var = (er0) c1969nm.f14378f;
/* 46 */            long jM3587p = er0Var.m3587p(strM3783i);
/* 52 */            String strM3783i2 = fm0.m3783i(strM6998c, "_etag");
/* 56 */            String strM3589r = er0Var.m3589r(strM3783i2);
/* 64 */            long jLongValue = 0;
/* 66 */            if (b40.m1232p(path)) {
/* 68 */                j = jM3587p;
                    } else {
/* 71 */                Long l = 0L;
/* 83 */                Iterator it = ((HashMap) c1969nm.f14380h).keySet().iterator();
                        while (true) {
/* 91 */                    if (!it.hasNext()) {
/* 124 */                       j = jM3587p;
                                break;
                            }
/* 97 */                    j = jM3587p;
/* 101 */                   String str6 = (String) it.next();
/* 107 */                   if (path.startsWith(str6)) {
/* 118 */                       l = (Long) ((HashMap) c1969nm.f14380h).get(str6);
                                break;
                            }
/* 121 */                   jM3587p = j;
                        }
/* 131 */               jLongValue = l == null ? 0L : l.longValue();
                    }
/* 135 */           String strM7005h = c1969nm.m7005h();
/* 145 */           String strM3789o = fm0.m3789o(AbstractC0886en.m3512p(strM7005h), File.separator, strM6998c);
/* 151 */           File file2 = new File(strM3789o);
/* 154 */           boolean zExists = file2.exists();
/* 162 */           long j2 = jLongValue;
/* 168 */           if (zExists) {
                        try {
/* 174 */                   if (b40.m1232p(strM3589r) || j < System.currentTimeMillis() - j2 || j < System.currentTimeMillis() - 604800000) {
/* 211 */                       if (zExists) {
/* 223 */                           str2 = strM3589r;
                                } else {
/* 217 */                           file2.getParentFile().mkdirs();
/* 220 */                           str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                                }
/* 244 */                       file = new File(strM3789o + "_temp");
/* 251 */                       if (b40.m1234r(str2)) {
/* 255 */                           uri = url;
                                    try {
/* 259 */                               requestHeaders.put("If-None-Match", str2);
                                    } catch (Exception e) {
/* 263 */                               e = e;
/* 208 */                               str = string;
/* 534 */                               m9777o("resCacheMngr", "Error while fetching resource file: " + str, e);
                                    }
                                } else {
/* 265 */                           uri = url;
                                }
/* 271 */                       ss0VarM10324d = ((zb0) c1969nm.f14374b).m10324d(string, requestHeaders, file);
/* 277 */                       if (ss0VarM10324d.f16756e) {
/* 283 */                           String str7 = ss0VarM10324d.f16754c;
/* 289 */                           editorEdit = ((SharedPreferences) er0Var.f7853b).edit();
/* 293 */                           editorEdit.putString(strM3783i2, str7);
/* 300 */                           if (!editorEdit.commit()) {
/* 302 */                               editorEdit.commit();
                                    }
/* 305 */                           str = string;
                                    try {
/* 306 */                               long jCurrentTimeMillis = System.currentTimeMillis();
/* 314 */                               editorEdit2 = ((SharedPreferences) er0Var.f7853b).edit();
/* 318 */                               editorEdit2.putLong(strM3783i, jCurrentTimeMillis);
/* 325 */                               if (!editorEdit2.commit()) {
/* 327 */                                   editorEdit2.commit();
                                        }
/* 330 */                               i = ss0VarM10324d.f16752a;
/* 334 */                               if (i >= 200 && i <= 300) {
/* 340 */                                   file2.delete();
/* 347 */                                   if (!file.renameTo(file2)) {
/* 361 */                                       str3 = strM6998c + "_mimetype";
/* 365 */                                       str4 = ss0VarM10324d.f16755d;
/* 371 */                                       if (str4.contains("text/html")) {
/* 374 */                                           str5 = str4;
                                                }
/* 379 */                                       if (b40.m1234r(str5)) {
/* 385 */                                           editorEdit4 = ((SharedPreferences) er0Var.f7853b).edit();
/* 389 */                                           editorEdit4.putString(str3, str5);
/* 396 */                                           if (!editorEdit4.commit()) {
/* 398 */                                               editorEdit4.commit();
                                                    }
                                                }
/* 418 */                                       String string2 = ss0VarM10324d.f16753b.toString();
/* 426 */                                       editorEdit3 = ((SharedPreferences) er0Var.f7853b).edit();
/* 430 */                                       editorEdit3.putString(strM6998c + "_headers", string2);
/* 437 */                                       if (!editorEdit3.commit()) {
/* 439 */                                           editorEdit3.commit();
                                                }
                                            }
                                        }
/* 445 */                               name = file2.getName();
/* 454 */                               fileArrListFiles = new File(strM7005h).listFiles();
/* 458 */                               if (fileArrListFiles != null && fileArrListFiles.length != 0) {
/* 465 */                                   String strM6998c2 = C1969nm.m6998c(path, null);
/* 471 */                                   for (File file3 : fileArrListFiles) {
/* 475 */                                       name2 = file3.getName();
/* 483 */                                       if (name2.equals(name) && ((v32) c1969nm.f14379g).mo3405d(name2, strM6998c2)) {
/* 495 */                                           file3.delete();
                                                }
                                            }
                                        }
                                    } catch (Exception e2) {
/* 443 */                               e = e2;
/* 534 */                               m9777o("resCacheMngr", "Error while fetching resource file: " + str, e);
                                    }
                                }
                            } else {
/* 200 */                       uri = url;
/* 202 */                       str = string;
                            }
/* 512 */                   bufferedInputStream = new BufferedInputStream(AbstractC1417a.m5164b(file2, new FileInputStream(file2)));
                        } catch (Exception e3) {
/* 205 */                   e = e3;
/* 206 */                   uri = url;
/* 208 */                   str = string;
/* 534 */                   m9777o("resCacheMngr", "Error while fetching resource file: " + str, e);
/* 279 */                   bufferedInputStream = null;
/* 541 */                   if (bufferedInputStream == null) {
/* 578 */                       m9777o("ResCacheUtil", "Error in receiving response for intercepted request to be cached- " + uri + " \n Path: " + path + "\n Query: " + query, null);
/* 577 */                       return null;
                            }
/* 605 */                   String strM3589r2 = er0Var.m3589r(C1969nm.m6998c(path, query) + "_mimetype");
/* 632 */                   HashMap mapM1239w = b40.m1239w(er0Var.m3589r(C1969nm.m6998c(path, query) + "_headers"));
/* 663 */                   m9775m("ResCacheUtil", "Response received for intercepted request to be cached- " + uri.toString() + " MimeType:" + strM3589r2, null);
/* 676 */                   return new WebResourceResponse(strM3589r2, "utf-8", 200, "OK", mapM1239w, bufferedInputStream);
                        }
/* 541 */               if (bufferedInputStream == null) {
/* 578 */                   m9777o("ResCacheUtil", "Error in receiving response for intercepted request to be cached- " + uri + " \n Path: " + path + "\n Query: " + query, null);
/* 577 */                   return null;
                        }
/* 605 */               String strM3589r3 = er0Var.m3589r(C1969nm.m6998c(path, query) + "_mimetype");
/* 632 */               HashMap mapM1239w2 = b40.m1239w(er0Var.m3589r(C1969nm.m6998c(path, query) + "_headers"));
/* 663 */               m9775m("ResCacheUtil", "Response received for intercepted request to be cached- " + uri.toString() + " MimeType:" + strM3589r3, null);
/* 676 */               return new WebResourceResponse(strM3589r3, "utf-8", 200, "OK", mapM1239w2, bufferedInputStream);
                    }
/* 211 */           if (zExists) {
/* 217 */               file2.getParentFile().mkdirs();
/* 220 */               str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                    } else {
/* 223 */               str2 = strM3589r;
                    }
/* 244 */           file = new File(strM3789o + "_temp");
/* 251 */           if (b40.m1234r(str2)) {
/* 255 */               uri = url;
/* 259 */               requestHeaders.put("If-None-Match", str2);
                    } else {
/* 265 */               uri = url;
                    }
/* 271 */           ss0VarM10324d = ((zb0) c1969nm.f14374b).m10324d(string, requestHeaders, file);
/* 277 */           if (ss0VarM10324d.f16756e) {
/* 283 */               String str8 = ss0VarM10324d.f16754c;
/* 289 */               editorEdit = ((SharedPreferences) er0Var.f7853b).edit();
/* 293 */               editorEdit.putString(strM3783i2, str8);
/* 300 */               if (!editorEdit.commit()) {
/* 302 */                   editorEdit.commit();
                        }
/* 305 */               str = string;
/* 306 */               long jCurrentTimeMillis2 = System.currentTimeMillis();
/* 314 */               editorEdit2 = ((SharedPreferences) er0Var.f7853b).edit();
/* 318 */               editorEdit2.putLong(strM3783i, jCurrentTimeMillis2);
/* 325 */               if (!editorEdit2.commit()) {
/* 327 */                   editorEdit2.commit();
                        }
/* 330 */               i = ss0VarM10324d.f16752a;
/* 334 */               if (i >= 200) {
/* 340 */                   file2.delete();
/* 347 */                   if (!file.renameTo(file2)) {
/* 361 */                       str3 = strM6998c + "_mimetype";
/* 365 */                       str4 = ss0VarM10324d.f16755d;
/* 371 */                       if (str4.contains("text/html")) {
/* 374 */                           str5 = str4;
                                }
/* 379 */                       if (b40.m1234r(str5)) {
/* 385 */                           editorEdit4 = ((SharedPreferences) er0Var.f7853b).edit();
/* 389 */                           editorEdit4.putString(str3, str5);
/* 396 */                           if (!editorEdit4.commit()) {
/* 398 */                               editorEdit4.commit();
                                    }
                                }
/* 418 */                       String string3 = ss0VarM10324d.f16753b.toString();
/* 426 */                       editorEdit3 = ((SharedPreferences) er0Var.f7853b).edit();
/* 430 */                       editorEdit3.putString(strM6998c + "_headers", string3);
/* 437 */                       if (!editorEdit3.commit()) {
/* 439 */                           editorEdit3.commit();
                                }
                            }
                        }
/* 445 */               name = file2.getName();
/* 454 */               fileArrListFiles = new File(strM7005h).listFiles();
/* 458 */               if (fileArrListFiles != null) {
/* 465 */                   String strM6998c3 = C1969nm.m6998c(path, null);
/* 471 */                   while (i2 < r4) {
/* 475 */                       name2 = file3.getName();
/* 483 */                       if (name2.equals(name)) {
                                }
                            }
                        }
/* 512 */               bufferedInputStream = new BufferedInputStream(AbstractC1417a.m5164b(file2, new FileInputStream(file2)));
/* 541 */               if (bufferedInputStream == null) {
/* 578 */                   m9777o("ResCacheUtil", "Error in receiving response for intercepted request to be cached- " + uri + " \n Path: " + path + "\n Query: " + query, null);
/* 577 */                   return null;
                        }
/* 605 */               String strM3589r4 = er0Var.m3589r(C1969nm.m6998c(path, query) + "_mimetype");
/* 632 */               HashMap mapM1239w3 = b40.m1239w(er0Var.m3589r(C1969nm.m6998c(path, query) + "_headers"));
/* 663 */               m9775m("ResCacheUtil", "Response received for intercepted request to be cached- " + uri.toString() + " MimeType:" + strM3589r4, null);
/* 676 */               return new WebResourceResponse(strM3589r4, "utf-8", 200, "OK", mapM1239w3, bufferedInputStream);
                    }
/* 279 */           bufferedInputStream = null;
/* 541 */           if (bufferedInputStream == null) {
/* 578 */               m9777o("ResCacheUtil", "Error in receiving response for intercepted request to be cached- " + uri + " \n Path: " + path + "\n Query: " + query, null);
/* 577 */               return null;
                    }
/* 605 */           String strM3589r5 = er0Var.m3589r(C1969nm.m6998c(path, query) + "_mimetype");
/* 632 */           HashMap mapM1239w4 = b40.m1239w(er0Var.m3589r(C1969nm.m6998c(path, query) + "_headers"));
/* 663 */           m9775m("ResCacheUtil", "Response received for intercepted request to be cached- " + uri.toString() + " MimeType:" + strM3589r5, null);
/* 676 */           return new WebResourceResponse(strM3589r5, "utf-8", 200, "OK", mapM1239w4, bufferedInputStream);
                }

                /* JADX INFO: renamed from: w */
                public static String m9785w(long j, Locale locale) {
/* 1 */             AtomicReference atomicReference = h13.f8867a;
/* 5 */             DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMd", locale);
/* 15 */            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
/* 23 */            return instanceForSkeleton.format(new Date(j));
                }

                /* JADX INFO: renamed from: x */
                public static boolean m9786x(String str) {
/* 1 */             C1823k9 c1823k9 = b73.f2300a;
/* 5 */             Set<AbstractC1882l9> setUnmodifiableSet = Collections.unmodifiableSet(AbstractC1882l9.f13153c);
/* 11 */            HashSet<AbstractC1882l9> hashSet = new HashSet();
/* 22 */            for (AbstractC1882l9 abstractC1882l9 : setUnmodifiableSet) {
/* 36 */                if (abstractC1882l9.f13154a.equals(str)) {
/* 38 */                    hashSet.add(abstractC1882l9);
                        }
                    }
/* 47 */            if (hashSet.isEmpty()) {
/* 86 */                f42.m3663s(AbstractC0886en.m3507k("Unknown feature ", str));
/* 46 */                return false;
                    }
/* 57 */            for (AbstractC1882l9 abstractC1882l10 : hashSet) {
/* 69 */                if (abstractC1882l10.mo6026a() || abstractC1882l10.mo97b()) {
/* 77 */                    return true;
                        }
                    }
/* 46 */            return false;
                }

                /* JADX INFO: renamed from: y */
                public static boolean m9787y(C2357x6 c2357x6) {
                    Boolean bool;
                    try {
/* 3 */                 CameraCharacteristics.Key key = CameraCharacteristics.FLASH_INFO_AVAILABLE;
/* 15 */                bool = (Boolean) ((C0962gp) c2357x6.f18961b).m3981a(CameraCharacteristics.FLASH_INFO_AVAILABLE);
                    } catch (BufferUnderflowException e) {
/* 27 */                if (f80.f8038a.m3582h(FlashAvailabilityBufferUnderflowQuirk.class) != null) {
/* 45 */                    String.format("Device is known to throw an exception while checking flash availability. Flash is not available. [Manufacturer: %s, Model: %s, API Level: %d].", Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT));
/* 48 */                    hu0.m4312F0("FlashAvailability");
                        } else {
/* 72 */                    hu0.m4326U("FlashAvailability", String.format("Exception thrown while checking for flash availability on device not known to throw exceptions during this check. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: %s, Model: %s, API Level: %d].\nFlash is not available.", Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT)), e);
                        }
/* 75 */                bool = Boolean.FALSE;
                    }
/* 77 */            if (bool == null) {
/* 81 */                hu0.m4315H0("FlashAvailability", "Characteristics did not contain key FLASH_INFO_AVAILABLE. Flash is not available.");
                    }
/* 84 */            if (bool != null) {
/* 86 */                return bool.booleanValue();
                    }
/* 91 */            return false;
                }

                /* JADX INFO: renamed from: z */
                public static boolean m9788z(Context context, String str) {
/* 1 */             C1823k9 c1823k9 = b73.f2300a;
/* 5 */             Set<mg2> setUnmodifiableSet = Collections.unmodifiableSet(mg2.f13762d);
/* 11 */            HashSet hashSet = new HashSet();
/* 22 */            for (mg2 mg2Var : setUnmodifiableSet) {
/* 36 */                if (mg2Var.f13763a.equals(str)) {
/* 38 */                    hashSet.add(mg2Var);
                        }
                    }
/* 47 */            if (hashSet.isEmpty()) {
/* 80 */                f42.m3663s(AbstractC0886en.m3507k("Unknown feature ", str));
/* 46 */                return false;
                    }
/* 49 */            Iterator it = hashSet.iterator();
/* 57 */            while (it.hasNext()) {
/* 69 */                if (((mg2) it.next()).m6647a(context)) {
/* 71 */                    return true;
                        }
                    }
/* 46 */            return false;
                }

                @Override // p000.ze2
                /* JADX INFO: renamed from: a */
                public float mo9789a(ViewGroup viewGroup, View view) {
/* 1 */             return view.getTranslationY();
                }

                @Override // p000.ze2
                /* JADX INFO: renamed from: b */
                public final float mo3045b(ViewGroup viewGroup, View view) {
                    switch (this.f19066a) {
                        case 0:
/* 87 */                    return view.getTranslationX() - viewGroup.getWidth();
                        case 1:
/* 48 */                    WeakHashMap weakHashMap = e33.f7494a;
                            return viewGroup.getLayoutDirection() == 1 ? view.getTranslationX() + viewGroup.getWidth() : view.getTranslationX() - viewGroup.getWidth();
                        case 2:
/* 46 */                    return view.getTranslationX() + viewGroup.getWidth();
                        default:
/* 7 */                     WeakHashMap weakHashMap2 = e33.f7494a;
                            return viewGroup.getLayoutDirection() == 1 ? view.getTranslationX() - viewGroup.getWidth() : view.getTranslationX() + viewGroup.getWidth();
                    }
                }
            }
