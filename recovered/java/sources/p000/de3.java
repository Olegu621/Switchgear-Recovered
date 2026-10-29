            package p000;

            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.content.res.TypedArray;
            import android.graphics.Typeface;
            import android.graphics.drawable.Drawable;
            import android.hardware.camera2.CameraCharacteristics;
            import android.net.Uri;
            import android.os.Build;
            import android.os.Bundle;
            import android.os.Handler;
            import android.os.Looper;
            import android.text.SpannableStringBuilder;
            import android.util.TypedValue;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.inputmethod.EditorInfo;
            import android.webkit.WebView;
            import androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk;
            import androidx.camera.camera2.internal.compat.quirk.AfRegionFlipHorizontallyQuirk;
            import androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk;
            import androidx.camera.camera2.internal.compat.quirk.CamcorderProfileResolutionQuirk;
            import androidx.camera.camera2.internal.compat.quirk.CameraNoResponseWhenEnablingFlashQuirk;
            import androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk;
            import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk;
            import androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
            import androidx.camera.camera2.internal.compat.quirk.FlashTooSlowQuirk;
            import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;
            import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
            import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
            import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFlashNotFireQuirk;
            import androidx.camera.camera2.internal.compat.quirk.ImageCaptureWashedOutImageQuirk;
            import androidx.camera.camera2.internal.compat.quirk.ImageCaptureWithFlashUnderexposureQuirk;
            import androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk;
            import androidx.camera.camera2.internal.compat.quirk.JpegCaptureDownsizingQuirk;
            import androidx.camera.camera2.internal.compat.quirk.JpegHalCorruptImageQuirk;
            import androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk;
            import androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk;
            import androidx.camera.camera2.internal.compat.quirk.PreviewDelayWhenVideoCaptureIsBoundQuirk;
            import androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk;
            import androidx.camera.camera2.internal.compat.quirk.PreviewStretchWhenVideoCaptureIsBoundQuirk;
            import androidx.camera.camera2.internal.compat.quirk.TemporalNoiseQuirk;
            import androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;
            import androidx.camera.camera2.internal.compat.quirk.YuvImageOnePixelShiftQuirk;
            import io.sentry.android.core.AbstractC1245n0;
            import java.io.IOException;
            import java.io.InputStreamReader;
            import java.io.StringWriter;
            import java.lang.reflect.InvocationHandler;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            import java.util.ArrayList;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Locale;
            import java.util.concurrent.ExecutionException;
            import java.util.logging.Level;
            import kotlin.Unit;
            import kotlinx.serialization.KSerializer;
            import okhttp3.HttpUrl;
            import okio.Segment;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class de3 implements ze2 {

                /* JADX INFO: renamed from: a */
                public static ClassLoader f7141a;

                /* JADX INFO: renamed from: b */
                public static Thread f7142b;

                /* JADX INFO: renamed from: c */
                public static final String[] f7143c = new String[0];

                /* JADX INFO: renamed from: d */
                public static final KSerializer[] f7144d = new KSerializer[0];

                /* JADX INFO: renamed from: e */
                public static final Object f7145e = new Object();

                /* JADX INFO: renamed from: f */
                public static boolean f7146f;

                /* JADX INFO: renamed from: g */
                public static int f7147g;

                /* JADX INFO: renamed from: C */
                public static final String m3015C(InputStreamReader inputStreamReader) throws IOException {
/* 3 */             StringWriter stringWriter = new StringWriter();
/* 8 */             char[] cArr = new char[Segment.SIZE];
/* 10 */            int i = inputStreamReader.read(cArr);
/* 14 */            while (i >= 0) {
/* 17 */                stringWriter.write(cArr, 0, i);
/* 20 */                i = inputStreamReader.read(cArr);
                    }
/* 25 */            String string = stringWriter.toString();
/* 29 */            string.getClass();
/* 32 */            return string;
                }

                /* JADX INFO: renamed from: D */
                public static final Object m3016D(Object obj) {
/* 3 */             if (obj instanceof C1980nx) {
/* 5 */                 m42 m42Var = o42.f14612b;
/* 11 */                return pg3.m7426e(((C1980nx) obj).f14555a);
                    }
/* 16 */            m42 m42Var2 = o42.f14612b;
/* 18 */            return obj;
                }

                /* JADX INFO: renamed from: E */
                public static void m3017E(EditorInfo editorInfo, String[] strArr) {
/* 5 */             if (Build.VERSION.SDK_INT >= 25) {
/* 1 */                 editorInfo.contentMimeTypes = strArr;
/* 10 */                return;
                    }
/* 13 */            if (editorInfo.extras == null) {
/* 20 */                editorInfo.extras = new Bundle();
                    }
/* 26 */            editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
/* 33 */            editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
                }

                /* JADX INFO: renamed from: F */
                public static void m3018F(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
/* 3 */             if (editorInfo.extras == null) {
/* 10 */                editorInfo.extras = new Bundle();
                    }
/* 25 */            editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
/* 32 */            editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
/* 39 */            editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
                }

                /* JADX WARN: Code duplicated, block: B:53:0x00b7 A[Catch: all -> 0x00b3, PHI: r2
  0x00b7: PHI (r2v1 java.lang.Thread) = (r2v0 java.lang.Thread), (r2v11 java.lang.Thread) binds: [B:7:0x000c, B:47:0x00b0] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #3 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000e, B:46:0x00ae, B:61:0x00e5, B:12:0x0023, B:52:0x00b6, B:53:0x00b7, B:64:0x00e9, B:65:0x00ea, B:13:0x0024, B:15:0x0031, B:25:0x004b, B:26:0x0052, B:28:0x005d, B:34:0x0072, B:35:0x0079, B:43:0x008a, B:44:0x00ac, B:18:0x0040, B:54:0x00b8, B:60:0x00e4, B:59:0x00c2), top: B:76:0x0003, inners: #2, #6 }] */
                /* JADX WARN: Code duplicated, block: B:70:0x00b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX INFO: renamed from: G */
                public static synchronized ClassLoader m3019G() {
                    SecurityException e;
                    Thread thread;
                    ThreadGroup threadGroup;
/* 6 */             if (f7141a == null) {
/* 10 */                Thread thread2 = f7142b;
/* 12 */                ClassLoader contextClassLoader = null;
/* 13 */                if (thread2 != null) {
                            synchronized (thread2) {
                                try {
/* 187 */                           contextClassLoader = f7142b.getContextClassLoader();
                                } catch (SecurityException e2) {
/* 197 */                           String message = e2.getMessage();
/* 213 */                           StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 41);
/* 216 */                           sb.append("Failed to get thread context classloader ");
/* 219 */                           sb.append(message);
/* 226 */                           AbstractC1245n0.m4889q("DynamiteLoaderV2CL", sb.toString());
                                }
                            }
/* 230 */                   f7141a = contextClassLoader;
                        } else {
/* 23 */                    ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
/* 29 */                    if (threadGroup2 == null) {
/* 31 */                        thread2 = null;
                            } else {
                                synchronized (Void.class) {
                                    try {
                                        try {
/* 37 */                                    int iActiveGroupCount = threadGroup2.activeGroupCount();
/* 41 */                                    ThreadGroup[] threadGroupArr = new ThreadGroup[iActiveGroupCount];
/* 43 */                                    threadGroup2.enumerate(threadGroupArr);
/* 46 */                                    int i = 0;
/* 47 */                                    int i2 = 0;
                                            while (true) {
/* 48 */                                        if (i2 >= iActiveGroupCount) {
/* 73 */                                            threadGroup = null;
                                                    break;
                                                }
/* 50 */                                        threadGroup = threadGroupArr[i2];
/* 62 */                                        if ("dynamiteLoader".equals(threadGroup.getName())) {
                                                    break;
                                                }
/* 65 */                                        i2++;
                                            }
/* 74 */                                    if (threadGroup == null) {
/* 80 */                                        threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                                            }
/* 83 */                                    int iActiveCount = threadGroup.activeCount();
/* 87 */                                    Thread[] threadArr = new Thread[iActiveCount];
/* 89 */                                    threadGroup.enumerate(threadArr);
                                            while (true) {
/* 92 */                                        if (i >= iActiveCount) {
/* 112 */                                           thread = null;
                                                    break;
                                                }
/* 94 */                                        thread = threadArr[i];
/* 106 */                                       if ("GmsDynamite".equals(thread.getName())) {
                                                    break;
                                                }
/* 109 */                                       i++;
                                            }
/* 113 */                                   if (thread == null) {
                                                try {
/* 119 */                                           C2102qc c2102qc = new C2102qc(threadGroup, "GmsDynamite");
                                                    try {
/* 122 */                                               c2102qc.setContextClassLoader(null);
/* 125 */                                               c2102qc.start();
/* 128 */                                               thread = c2102qc;
                                                    } catch (SecurityException e3) {
/* 130 */                                               e = e3;
/* 131 */                                               thread = c2102qc;
/* 141 */                                               String message2 = e.getMessage();
/* 157 */                                               StringBuilder sb2 = new StringBuilder(String.valueOf(message2).length() + 39);
/* 160 */                                               sb2.append("Failed to enumerate thread/threadgroup ");
/* 163 */                                               sb2.append(message2);
/* 170 */                                               AbstractC1245n0.m4889q("DynamiteLoaderV2CL", sb2.toString());
                                                    }
                                                } catch (SecurityException e4) {
/* 133 */                                           e = e4;
                                                }
                                            }
                                        } catch (Throwable th) {
/* 183 */                                   throw th;
                                        }
                                    } catch (SecurityException e5) {
/* 137 */                               e = e5;
/* 138 */                               thread = null;
                                    }
                                }
/* 174 */                       thread2 = thread;
                            }
/* 175 */                   f7142b = thread2;
/* 177 */                   if (thread2 != null) {
                                synchronized (thread2) {
/* 187 */                           contextClassLoader = f7142b.getContextClassLoader();
                                }
                            }
/* 230 */                   f7141a = contextClassLoader;
                        }
                    }
/* 235 */           return f7141a;
                }

                /* JADX INFO: renamed from: H */
                public static String m3020H(String str) {
/* 7 */             if (str.length() > 23) {
/* 13 */                int i = -1;
/* 15 */                for (int length = str.length() - 1; length >= 0; length--) {
/* 17 */                    char cCharAt = str.charAt(length);
/* 23 */                    if (cCharAt == '.' || cCharAt == '$') {
/* 33 */                        i = length;
                                break;
                            }
                        }
/* 36 */                str = str.substring(i + 1);
                    }
/* 42 */            String strConcat = HttpUrl.FRAGMENT_ENCODE_SET.concat(str);
/* 55 */            return strConcat.substring(0, Math.min(strConcat.length(), 23));
                }

                /* JADX INFO: renamed from: I */
                public static int m3021I(Level level) {
/* 1 */             int iIntValue = level.intValue();
/* 11 */            if (iIntValue >= Level.SEVERE.intValue()) {
/* 13 */                return 6;
                    }
/* 21 */            if (iIntValue >= Level.WARNING.intValue()) {
/* 23 */                return 5;
                    }
/* 31 */            if (iIntValue >= Level.INFO.intValue()) {
/* 33 */                return 4;
                    }
                    return iIntValue >= Level.FINE.intValue() ? 3 : 2;
                }

                /* JADX INFO: renamed from: c */
                public static final Object m3022c(e70[] e70VarArr, tj2 tj2Var) {
/* 2 */             if (e70VarArr.length == 0) {
/* 4 */                 return nd0.f14189a;
                    }
/* 9 */             C0216ch c0216ch = new C0216ch(e70VarArr);
/* 19 */            C0890er c0890er = new C0890er(1, mz0.m6834b(tj2Var));
/* 22 */            c0890er.m3571u();
/* 25 */            int length = e70VarArr.length;
/* 26 */            C0019ah[] c0019ahArr = new C0019ah[length];
/* 30 */            for (int i = 0; i < length; i++) {
/* 32 */                e70 e70Var = e70VarArr[i];
/* 34 */                e70Var.start();
/* 39 */                C0019ah c0019ah = new C0019ah(c0216ch, c0890er);
/* 47 */                c0019ah.f255w = hu0.m4343n0(e70Var, false, c0019ah, 3);
/* 49 */                c0019ahArr[i] = c0019ah;
                    }
/* 56 */            C0180bh c0180bh = new C0180bh(c0019ahArr);
/* 59 */            for (int i2 = 0; i2 < length; i2++) {
/* 63 */                c0019ahArr[i2].m279q(c0180bh);
                    }
/* 75 */            if (c0890er.m3570t() instanceof tn1) {
/* 81 */                c0890er.m3574x(c0180bh);
                    } else {
/* 77 */                c0180bh.m1355b();
                    }
/* 84 */            Object objM3569s = c0890er.m3569s();
/* 88 */            z10 z10Var = z10.f19902a;
/* 90 */            return objM3569s;
                }

                /* JADX INFO: renamed from: e */
                public static void m3023e(String str, boolean z) {
/* 1 */             if (z) {
/* 3 */                 return;
                    }
/* 4 */             C1951n4.m6859j(str);
                }

                /* JADX INFO: renamed from: f */
                public static void m3024f(boolean z) {
/* 1 */             if (z) {
/* 3 */                 return;
                    }
/* 4 */             f42.m3649e();
                }

                /* JADX INFO: renamed from: g */
                public static void m3025g(String str, int i, int i2, int i3) {
/* 5 */             if (i < i2) {
/* 49 */                Locale locale = Locale.US;
/* 83 */                throw new IllegalArgumentException(str + " is out of range of [" + i2 + ", " + i3 + "] (too low)");
                    }
/* 7 */             if (i <= i3) {
/* 9 */                 return;
                    }
/* 12 */            Locale locale2 = Locale.US;
/* 46 */            throw new IllegalArgumentException(str + " is out of range of [" + i2 + ", " + i3 + "] (too high)");
                }

                /* JADX INFO: renamed from: h */
                public static void m3026h(int i) {
/* 1 */             if (i >= 0) {
/* 3 */                 return;
                    }
/* 4 */             f42.m3649e();
                }

                /* JADX INFO: renamed from: i */
                public static void m3027i(Object obj, String str) {
/* 1 */             if (obj != null) {
/* 3 */                 return;
                    }
/* 4 */             C1951n4.m6868s(str);
                }

                /* JADX INFO: renamed from: j */
                public static void m3028j(String str, boolean z) {
/* 1 */             if (z) {
/* 3 */                 return;
                    }
/* 4 */             f42.m3656l(str);
                }

                /* JADX INFO: renamed from: k */
                public static boolean m3029k(Object obj, Object obj2) {
/* 2 */             if (obj != obj2) {
                        return obj != null && obj.equals(obj2);
                    }
/* 1 */             return true;
                }

                /* JADX INFO: renamed from: l */
                public static InvocationHandler m3030l() {
                    ClassLoader classLoader;
/* 6 */             if (Build.VERSION.SDK_INT >= 28) {
/* 8 */                 classLoader = AbstractC2210t9.m8732b();
                    } else {
                        try {
/* 17 */                    Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", null);
/* 22 */                    declaredMethod.setAccessible(true);
/* 33 */                    classLoader = declaredMethod.invoke(null, null).getClass().getClassLoader();
                        } catch (IllegalAccessException e) {
/* 63 */                    ds0.m3199p(e);
/* 5 */                     return null;
                        } catch (NoSuchMethodException e2) {
/* 71 */                    ds0.m3199p(e2);
/* 5 */                     return null;
                        } catch (InvocationTargetException e3) {
/* 67 */                    ds0.m3199p(e3);
/* 5 */                     return null;
                        }
                    }
/* 54 */            return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, classLoader).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
                }

                /* JADX WARN: Code duplicated, block: B:302:0x050e  */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX INFO: renamed from: m */
                public static er0 m3031m(C0962gp c0962gp) {
                    boolean z;
                    boolean z2;
                    boolean z3;
                    Integer num;
/* 1 */             j02 j02Var = j02.f11986c;
/* 3 */             j02Var.getClass();
                    try {
                        try {
/* 10 */                    Object obj = j02Var.f11987a.f2517b.get();
/* 16 */                    boolean z4 = true;
/* 16 */                    z4 = true;
/* 16 */                    z4 = true;
/* 16 */                    z4 = true;
/* 16 */                    z4 = true;
/* 34 */                    i02 i02Var = (i02) (obj instanceof AbstractC2000og ? new tw0(null, z4 ? 1 : 0) : w11.m9450t(obj)).get();
/* 38 */                    ArrayList arrayList = new ArrayList();
/* 41 */                    CameraCharacteristics.Key key = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
/* 47 */                    Integer num2 = (Integer) c0962gp.m3981a(key);
/* 68 */                    if (i02Var.m4414a(AeFpsRangeLegacyQuirk.class, num2 != null && num2.intValue() == 2)) {
/* 75 */                        arrayList.add(new AeFpsRangeLegacyQuirk(c0962gp));
                            }
/* 90 */                    if (i02Var.m4414a(AspectRatioLegacyApi21Quirk.class, false)) {
/* 97 */                        arrayList.add(new AspectRatioLegacyApi21Quirk());
                            }
/* 100 */                   HashSet hashSet = JpegHalCorruptImageQuirk.f800a;
/* 102 */                   String str = Build.DEVICE;
/* 104 */                   Locale locale = Locale.US;
/* 120 */                   if (i02Var.m4414a(JpegHalCorruptImageQuirk.class, hashSet.contains(str.toLowerCase(locale)))) {
/* 127 */                       arrayList.add(new JpegHalCorruptImageQuirk());
                            }
/* 130 */                   HashSet hashSet2 = JpegCaptureDownsizingQuirk.f799a;
/* 132 */                   String str2 = Build.MODEL;
/* 167 */                   if (i02Var.m4414a(JpegCaptureDownsizingQuirk.class, hashSet2.contains(str2.toLowerCase(locale)) && ((Integer) c0962gp.m3981a(CameraCharacteristics.LENS_FACING)).intValue() == 0)) {
/* 174 */                       arrayList.add(new JpegCaptureDownsizingQuirk());
                            }
/* 181 */                   Integer num3 = (Integer) c0962gp.m3981a(key);
/* 200 */                   if (i02Var.m4414a(CamcorderProfileResolutionQuirk.class, num3 != null && num3.intValue() == 2)) {
/* 204 */                       CamcorderProfileResolutionQuirk camcorderProfileResolutionQuirk = new CamcorderProfileResolutionQuirk();
/* 207 */                       c0962gp.m3982b();
/* 210 */                       arrayList.add(camcorderProfileResolutionQuirk);
                            }
/* 213 */                   String str3 = Build.HARDWARE;
/* 254 */                   if (i02Var.m4414a(CaptureNoResponseQuirk.class, ("samsungexynos7420".equalsIgnoreCase(str3) || "universal7420".equalsIgnoreCase(str3)) && ((Integer) c0962gp.m3981a(CameraCharacteristics.LENS_FACING)).intValue() == 1)) {
/* 261 */                       arrayList.add(new CaptureNoResponseQuirk());
                            }
/* 268 */                   Integer num4 = (Integer) c0962gp.m3981a(key);
/* 287 */                   if (i02Var.m4414a(LegacyCameraOutputConfigNullPointerQuirk.class, num4 != null && num4.intValue() == 2)) {
/* 294 */                       arrayList.add(new LegacyCameraOutputConfigNullPointerQuirk());
                            }
/* 326 */                   if (i02Var.m4414a(LegacyCameraSurfaceCleanupQuirk.class, Build.VERSION.SDK_INT < 29 && (num = (Integer) c0962gp.m3981a(key)) != null && num.intValue() == 2)) {
/* 333 */                       arrayList.add(new LegacyCameraSurfaceCleanupQuirk());
                            }
/* 371 */                   if (i02Var.m4414a(ImageCaptureWashedOutImageQuirk.class, ImageCaptureWashedOutImageQuirk.f794a.contains(str2.toUpperCase(locale)) && ((Integer) c0962gp.m3981a(CameraCharacteristics.LENS_FACING)).intValue() == 1)) {
/* 378 */                       arrayList.add(new ImageCaptureWashedOutImageQuirk());
                            }
/* 416 */                   if (i02Var.m4414a(CameraNoResponseWhenEnablingFlashQuirk.class, CameraNoResponseWhenEnablingFlashQuirk.f780a.contains(str2.toUpperCase(locale)) && ((Integer) c0962gp.m3981a(CameraCharacteristics.LENS_FACING)).intValue() == 1)) {
/* 423 */                       arrayList.add(new CameraNoResponseWhenEnablingFlashQuirk());
                            }
/* 426 */                   String str4 = Build.BRAND;
/* 532 */                   if (i02Var.m4414a(YuvImageOnePixelShiftQuirk.class, ("motorola".equalsIgnoreCase(str4) && "MotoG3".equalsIgnoreCase(str2)) || ("samsung".equalsIgnoreCase(str4) && "SM-G532F".equalsIgnoreCase(str2)) || (("samsung".equalsIgnoreCase(str4) && "SM-J700F".equalsIgnoreCase(str2)) || (("samsung".equalsIgnoreCase(str4) && "SM-A920F".equalsIgnoreCase(str2)) || (("samsung".equalsIgnoreCase(str4) && "SM-J415F".equalsIgnoreCase(str2)) || ("xiaomi".equalsIgnoreCase(str4) && "Mi A1".equalsIgnoreCase(str2))))))) {
/* 539 */                       arrayList.add(new YuvImageOnePixelShiftQuirk());
                            }
/* 544 */                   Iterator it = FlashTooSlowQuirk.f788a.iterator();
                            while (true) {
/* 552 */                       if (it.hasNext()) {
/* 572 */                           if (Build.MODEL.toUpperCase(Locale.US).startsWith((String) it.next())) {
/* 586 */                               if (((Integer) c0962gp.m3981a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
/* 588 */                                   z = true;
                                            break;
                                        }
                                    }
                                }
/* 590 */                       z = false;
                                break;
                            }
/* 597 */                   if (i02Var.m4414a(FlashTooSlowQuirk.class, z)) {
/* 604 */                       arrayList.add(new FlashTooSlowQuirk());
                            }
/* 646 */                   if (i02Var.m4414a(AfRegionFlipHorizontallyQuirk.class, Build.BRAND.equalsIgnoreCase("SAMSUNG") && Build.VERSION.SDK_INT < 33 && ((Integer) c0962gp.m3981a(CameraCharacteristics.LENS_FACING)).intValue() == 0)) {
/* 653 */                       arrayList.add(new AfRegionFlipHorizontallyQuirk());
                            }
/* 656 */                   CameraCharacteristics.Key key2 = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
/* 662 */                   Integer num5 = (Integer) c0962gp.m3981a(key2);
/* 681 */                   if (i02Var.m4414a(ConfigureSurfaceToSecondarySessionFailQuirk.class, num5 != null && num5.intValue() == 2)) {
/* 688 */                       arrayList.add(new ConfigureSurfaceToSecondarySessionFailQuirk());
                            }
/* 695 */                   Integer num6 = (Integer) c0962gp.m3981a(key2);
/* 714 */                   if (i02Var.m4414a(PreviewOrientationIncorrectQuirk.class, num6 != null && num6.intValue() == 2)) {
/* 721 */                       arrayList.add(new PreviewOrientationIncorrectQuirk());
                            }
/* 728 */                   Integer num7 = (Integer) c0962gp.m3981a(key2);
/* 747 */                   if (i02Var.m4414a(CaptureSessionStuckQuirk.class, num7 != null && num7.intValue() == 2)) {
/* 754 */                       arrayList.add(new CaptureSessionStuckQuirk());
                            }
/* 757 */                   List list = ImageCaptureFlashNotFireQuirk.f792b;
/* 759 */                   String str5 = Build.MODEL;
/* 761 */                   Locale locale2 = Locale.US;
/* 814 */                   if (i02Var.m4414a(ImageCaptureFlashNotFireQuirk.class, (list.contains(str5.toLowerCase(locale2)) && ((Integer) c0962gp.m3981a(CameraCharacteristics.LENS_FACING)).intValue() == 0) == true || ImageCaptureFlashNotFireQuirk.f791a.contains(str5.toLowerCase(locale2)))) {
/* 821 */                       arrayList.add(new ImageCaptureFlashNotFireQuirk());
                            }
/* 859 */                   if (i02Var.m4414a(ImageCaptureWithFlashUnderexposureQuirk.class, ImageCaptureWithFlashUnderexposureQuirk.f795a.contains(str5.toLowerCase(locale2)) && ((Integer) c0962gp.m3981a(CameraCharacteristics.LENS_FACING)).intValue() == 1)) {
/* 866 */                       arrayList.add(new ImageCaptureWithFlashUnderexposureQuirk());
                            }
/* 904 */                   if (i02Var.m4414a(ImageCaptureFailWithAutoFlashQuirk.class, ImageCaptureFailWithAutoFlashQuirk.f789a.contains(str5.toLowerCase(locale2)) && ((Integer) c0962gp.m3981a(CameraCharacteristics.LENS_FACING)).intValue() == 0)) {
/* 911 */                       arrayList.add(new ImageCaptureFailWithAutoFlashQuirk());
                            }
/* 918 */                   Integer num8 = (Integer) c0962gp.m3981a(key2);
/* 937 */                   if (i02Var.m4414a(IncorrectCaptureStateQuirk.class, num8 != null && num8.intValue() == 2)) {
/* 944 */                       arrayList.add(new IncorrectCaptureStateQuirk());
                            }
/* 949 */                   Iterator it2 = TorchFlashRequiredFor3aUpdateQuirk.f804a.iterator();
                            while (true) {
/* 957 */                       if (it2.hasNext()) {
/* 977 */                           if (Build.MODEL.toUpperCase(Locale.US).equals((String) it2.next())) {
/* 991 */                               if (((Integer) c0962gp.m3981a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
/* 993 */                                   z2 = true;
                                            break;
                                        }
                                    }
                                }
/* 995 */                       z2 = false;
                                break;
                            }
/* 1002 */                  if (i02Var.m4414a(TorchFlashRequiredFor3aUpdateQuirk.class, z2)) {
/* 1009 */                      arrayList.add(new TorchFlashRequiredFor3aUpdateQuirk());
                            }
/* 1012 */                  String str6 = Build.MANUFACTURER;
/* 1130 */                  if (i02Var.m4414a(PreviewStretchWhenVideoCaptureIsBoundQuirk.class, ("HUAWEI".equalsIgnoreCase(str6) && "HUAWEI ALE-L04".equalsIgnoreCase(Build.MODEL)) || ("Samsung".equalsIgnoreCase(str6) && "sm-j320f".equalsIgnoreCase(Build.MODEL)) || (("Samsung".equalsIgnoreCase(str6) && "sm-j700f".equalsIgnoreCase(Build.MODEL)) || (("Samsung".equalsIgnoreCase(str6) && "sm-j111f".equalsIgnoreCase(Build.MODEL)) || (("OPPO".equalsIgnoreCase(str6) && "A37F".equalsIgnoreCase(Build.MODEL)) || ("Samsung".equalsIgnoreCase(str6) && "sm-j510fn".equalsIgnoreCase(Build.MODEL))))))) {
/* 1137 */                      arrayList.add(new PreviewStretchWhenVideoCaptureIsBoundQuirk());
                            }
/* 1152 */                  if (i02Var.m4414a(PreviewDelayWhenVideoCaptureIsBoundQuirk.class, "Huawei".equalsIgnoreCase(str6))) {
/* 1159 */                      arrayList.add(new PreviewDelayWhenVideoCaptureIsBoundQuirk());
                            }
/* 1162 */                  String str7 = Build.BRAND;
/* 1172 */                  if (("blu".equalsIgnoreCase(str7) && "studio x10".equalsIgnoreCase(Build.MODEL)) || (("itel".equalsIgnoreCase(str7) && "itel w6004".equalsIgnoreCase(Build.MODEL)) || (("vivo".equalsIgnoreCase(str7) && "vivo 1805".equalsIgnoreCase(Build.MODEL)) || ("positivo".equalsIgnoreCase(str7) && "twist 2 pro".equalsIgnoreCase(Build.MODEL))))) {
/* 1295 */                      z3 = true;
                            } else {
/* 1241 */                      String str8 = Build.MODEL;
/* 1249 */                      if (("pixel 4 xl".equalsIgnoreCase(str8) && Build.VERSION.SDK_INT == 29) || ("motorola".equalsIgnoreCase(str7) && "moto e13".equalsIgnoreCase(str8))) {
/* 1295 */                          z3 = true;
                                } else {
/* 1275 */                          if ("samsung".equalsIgnoreCase(str7)) {
/* 1277 */                              String str9 = Build.DEVICE;
/* 1285 */                              if ("gta8".equalsIgnoreCase(str9) || "gta8wifi".equalsIgnoreCase(str9)) {
/* 1295 */                                  z3 = true;
                                        }
                                    }
/* 1297 */                          z3 = false;
                                }
                            }
/* 1304 */                  if (i02Var.m4414a(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.class, z3)) {
/* 1311 */                      arrayList.add(new ImageCaptureFailedWhenVideoCaptureIsBoundQuirk());
                            }
/* 1314 */                  String str10 = Build.MODEL;
/* 1347 */                  if (i02Var.m4414a(TemporalNoiseQuirk.class, "Pixel 8".equalsIgnoreCase(str10) && ((Integer) c0962gp.m3981a(CameraCharacteristics.LENS_FACING)).intValue() == 0)) {
/* 1354 */                      arrayList.add(new TemporalNoiseQuirk());
                            }
/* 1357 */                  HashSet hashSet3 = ImageCaptureFailedForVideoSnapshotQuirk.f790a;
/* 1359 */                  Locale locale3 = Locale.US;
/* 1369 */                  if (!hashSet3.contains(str10.toLowerCase(locale3)) && (Build.VERSION.SDK_INT < 31 || !"Spreadtrum".equalsIgnoreCase(Build.SOC_MANUFACTURER))) {
/* 1389 */                      String str11 = Build.HARDWARE;
/* 1401 */                      if (!str11.toLowerCase(locale3).startsWith("ums") && ((!"itel".equalsIgnoreCase(str7) || !str11.toLowerCase(locale3).startsWith("sp")) && (!"HUAWEI".equalsIgnoreCase(str7) || !"FIG-LX1".equalsIgnoreCase(str10)))) {
/* 1437 */                          z4 = false;
                                }
                            }
/* 1444 */                  if (i02Var.m4414a(ImageCaptureFailedForVideoSnapshotQuirk.class, z4)) {
/* 1451 */                      arrayList.add(new ImageCaptureFailedForVideoSnapshotQuirk());
                            }
/* 1456 */                  er0 er0Var = new er0(arrayList);
/* 1459 */                  er0.m3576B(er0Var);
/* 1464 */                  hu0.m4312F0("CameraQuirks");
/* 1467 */                  return er0Var;
                        } catch (InterruptedException e) {
/* 1468 */                  e = e;
/* 1478 */                  throw new AssertionError("Unexpected error in QuirkSettings StateObservable", e);
                        }
                    } catch (InterruptedException | ExecutionException e2) {
/* 1470 */              e = e2;
                    }
                }

                /* JADX INFO: renamed from: n */
                public static ColorStateList m3032n(Context context, ac1 ac1Var, int i) {
                    int resourceId;
                    ColorStateList colorStateList;
/* 3 */             TypedArray typedArray = (TypedArray) ac1Var.f178c;
                    return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateList = v00.getColorStateList(context, resourceId)) == null) ? ac1Var.m183m(i) : colorStateList;
                }

                /* JADX INFO: renamed from: o */
                public static ColorStateList m3033o(Context context, TypedArray typedArray, int i) {
                    int resourceId;
                    ColorStateList colorStateList;
                    return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateList = v00.getColorStateList(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateList;
                }

                /* JADX INFO: renamed from: p */
                public static int m3034p(Context context, TypedArray typedArray, int i, int i2) {
/* 3 */             TypedValue typedValue = new TypedValue();
/* 10 */            if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
/* 41 */                return typedArray.getDimensionPixelSize(i, i2);
                    }
/* 28 */            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
/* 33 */            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i2);
/* 37 */            typedArrayObtainStyledAttributes.recycle();
/* 40 */            return dimensionPixelSize;
                }

                /* JADX INFO: renamed from: q */
                public static Drawable m3035q(Context context, TypedArray typedArray, int i) {
                    int resourceId;
                    Drawable drawableM6700p;
                    return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (drawableM6700p = mn0.m6700p(context, resourceId)) == null) ? typedArray.getDrawable(i) : drawableM6700p;
                }

                /* JADX INFO: renamed from: r */
                public static final u03 m3036r() throws Throwable {
                    c03 a03Var;
/* 1 */             e03 e03Var = e03.f7466a;
/* 3 */             zz2 zz2Var = c03.Companion;
/* 5 */             a13 a13Var = e03.f7470e;
/* 11 */            o42 o42Var = (o42) e03.f7467b.f2074b;
/* 13 */            zz2Var.getClass();
/* 26 */            Throwable thM7099a = o42Var != null ? o42.m7099a(o42Var.f14613a) : null;
/* 27 */            if (thM7099a != null) {
/* 31 */                a03Var = new a03(thM7099a);
                    } else if (a13Var == null) {
/* 44 */                a03Var = new a03(new C1836km(null, null));
                    } else {
/* 74 */                a03Var = (o42Var == null || !((o42Var.f14613a instanceof n42) ^ true)) ? new a03(new C1836km("Usercentrics is not ready, please ensure to invoke the shared instance inside 'Usercentrics.isReady'")) : new b03(a13Var);
                    }
/* 79 */            if (a03Var instanceof a03) {
/* 98 */                throw ((a03) a03Var).f24a;
                    }
/* 83 */            if (a03Var instanceof b03) {
/* 87 */                return ((b03) a03Var).f2155a;
                    }
/* 90 */            ds0.m3187b();
/* 16 */            return null;
                }

                /* JADX INFO: renamed from: s */
                public static String m3037s() {
/* 11 */            StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
/* 56 */            return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName() + "()";
                }

                /* JADX INFO: renamed from: t */
                public static String m3038t() {
/* 11 */            StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
/* 44 */            return ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")";
                }

                /* JADX INFO: renamed from: u */
                public static String m3039u(Context context, int i) {
/* 2 */             if (i == -1) {
/* 13 */                return "UNKNOWN";
                    }
                    try {
/* 8 */                 return context.getResources().getResourceEntryName(i);
                    } catch (Exception unused) {
/* 18 */                return fm0.m3781g(i, "?");
                    }
                }

                /* JADX INFO: renamed from: v */
                public static String m3040v(View view) {
                    try {
/* 13 */                return view.getContext().getResources().getResourceEntryName(view.getId());
                    } catch (Exception unused) {
/* 18 */                return "UNKNOWN";
                    }
                }

                /* JADX INFO: renamed from: w */
                public static Uri m3041w(Context context, int i) {
/* 1 */             if (i == 0) {
/* 34 */                return null;
                    }
/* 29 */            return Uri.parse("android.resource://" + context.getPackageName() + "/" + i);
                }

                /* JADX INFO: renamed from: x */
                public static boolean m3042x(Context context) {
                    return context.getResources().getConfiguration().fontScale >= 1.3f;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX INFO: renamed from: y */
                public static final Object m3043y(List list, d10 d10Var) {
                    C0880eh c0880eh;
                    Iterator it;
/* 3 */             if (d10Var instanceof C0880eh) {
/* 6 */                 c0880eh = (C0880eh) d10Var;
/* 8 */                 int i = c0880eh.f7686c;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    c0880eh.f7686c = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    c0880eh = new C0880eh(d10Var);
                        }
                    } else {
/* 22 */                c0880eh = new C0880eh(d10Var);
                    }
/* 25 */            Object obj = c0880eh.f7685b;
/* 27 */            z10 z10Var = z10.f19902a;
/* 29 */            int i2 = c0880eh.f7686c;
/* 32 */            if (i2 == 0) {
/* 49 */                pg3.m7417A(obj);
/* 52 */                it = list.iterator();
                    } else {
/* 34 */                if (i2 != 1) {
/* 44 */                    f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 47 */                    return null;
                        }
/* 36 */                it = c0880eh.f7684a;
/* 38 */                pg3.m7417A(obj);
                    }
/* 60 */            while (it.hasNext()) {
/* 66 */                h01 h01Var = (h01) it.next();
/* 68 */                c0880eh.f7684a = it;
/* 70 */                c0880eh.f7686c = 1;
/* 76 */                if (h01Var.join(c0880eh) == z10Var) {
/* 78 */                    return z10Var;
                        }
                    }
/* 79 */            return Unit.f12910a;
                }

                /* JADX WARN: Code duplicated, block: B:16:0x0041  */
                /* JADX WARN: Code duplicated, block: B:18:0x0051 A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004f -> B:19:0x0052). Please report as a decompilation issue!!! */
                /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
                    java.lang.StackOverflowError
                    	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
                    	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
                    */
                /* JADX INFO: renamed from: z */
                public static final java.lang.Object m3044z(p000.h01[] r6, p000.d10 r7) {
                    /*
                        boolean r0 = r7 instanceof p000.C0844dh
                        if (r0 == 0) goto L13
                        r0 = r7
                        dh r0 = (p000.C0844dh) r0
                        int r1 = r0.f7194e
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f7194e = r1
                        goto L18
                    L13:
                        dh r0 = new dh
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.f7193d
                        z10 r1 = p000.z10.f19902a
                        int r2 = r0.f7194e
                        r3 = 1
                        if (r2 == 0) goto L37
                        if (r2 != r3) goto L30
                        int r6 = r0.f7192c
                        int r2 = r0.f7191b
                        java.lang.Object[] r4 = r0.f7190a
                        h01[] r4 = (p000.h01[]) r4
                        p000.pg3.m7417A(r7)
                        r7 = r4
                        goto L52
                    L30:
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        p000.f42.m3656l(r6)
                        r6 = 0
                        return r6
                    L37:
                        p000.pg3.m7417A(r7)
                        int r7 = r6.length
                        r2 = 0
                        r5 = r7
                        r7 = r6
                        r6 = r5
                    L3f:
                        if (r2 >= r6) goto L54
                        r4 = r7[r2]
                        r0.f7190a = r7
                        r0.f7191b = r2
                        r0.f7192c = r6
                        r0.f7194e = r3
                        java.lang.Object r4 = r4.join(r0)
                        if (r4 != r1) goto L52
                        return r1
                    L52:
                        int r2 = r2 + r3
                        goto L3f
                    L54:
                        kotlin.Unit r6 = kotlin.Unit.f12910a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p000.de3.m3044z(h01[], d10):java.lang.Object");
                }

                /* JADX INFO: renamed from: A */
                public abstract void mo1400A(int i);

                /* JADX INFO: renamed from: B */
                public abstract void mo1401B(Typeface typeface);

                @Override // p000.ze2
                /* JADX INFO: renamed from: b */
                public float mo3045b(ViewGroup viewGroup, View view) {
/* 1 */             return view.getTranslationX();
                }

                /* JADX INFO: renamed from: d */
                public void m3046d(int i) {
/* 16 */            new Handler(Looper.getMainLooper()).post(new RunnableC0923fn(this, i, 2));
                }
            }
