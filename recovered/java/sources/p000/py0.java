            package p000;

            import android.animation.Animator;
            import android.animation.AnimatorSet;
            import android.animation.ObjectAnimator;
            import android.content.ComponentName;
            import android.content.Context;
            import android.content.Intent;
            import android.content.SharedPreferences;
            import android.content.pm.ActivityInfo;
            import android.content.pm.PackageManager;
            import android.content.res.Resources;
            import android.net.Uri;
            import android.os.Build;
            import android.os.Bundle;
            import android.os.ParcelFileDescriptor;
            import android.os.Process;
            import android.os.StrictMode;
            import android.text.InputFilter;
            import android.text.method.TransformationMethod;
            import android.util.Log;
            import android.view.View;
            import android.view.ViewAnimationUtils;
            import android.view.ViewGroup;
            import androidx.appcompat.app.AppCompatActivity;
            import io.sentry.android.core.AbstractC1245n0;
            import io.sentry.config.AbstractC1417a;
            import java.io.File;
            import java.io.FileDescriptor;
            import java.io.FileInputStream;
            import java.io.FileOutputStream;
            import java.io.IOException;
            import java.io.InputStream;
            import java.lang.annotation.Annotation;
            import java.lang.reflect.Method;
            import java.nio.MappedByteBuffer;
            import java.nio.channels.FileChannel;
            import java.util.Locale;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            import kotlinx.serialization.KSerializer;
            import kotlinx.serialization.descriptors.SerialDescriptor;
            import kotlinx.serialization.encoding.Encoder;
            import kotlinx.serialization.json.AbstractC1858b;
            import kotlinx.serialization.json.AbstractC1860d;
            import kotlinx.serialization.json.C1857a;
            import kotlinx.serialization.json.C1859c;
            import kotlinx.serialization.json.JsonNull;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            import okio.Segment;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class py0 implements Encoder, InterfaceC1907ly {

                /* JADX INFO: renamed from: b */
                public static Context f15328b = null;

                /* JADX INFO: renamed from: c */
                public static Boolean f15329c = null;

                /* JADX INFO: renamed from: d */
                public static final int[] f15330d = new int[0];

                /* JADX INFO: renamed from: e */
                public static final Object[] f15331e = new Object[0];

                /* JADX INFO: renamed from: f */
                public static final C2131r4 f15332f = new C2131r4("NO_OWNER", 8);

                /* JADX INFO: renamed from: g */
                public static final Object f15333g = new Object();

                /* JADX INFO: renamed from: h */
                public static boolean f15334h = true;

                /* JADX INFO: renamed from: i */
                public static Method f15335i;

                /* JADX INFO: renamed from: j */
                public static boolean f15336j;

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f15337a;

                public /* synthetic */ py0(int i) {
/* 1 */             this.f15337a = i;
                }

                /* JADX INFO: renamed from: G */
                public static final AbstractC1860d m7584G(Number number) {
/* 4 */             return new s11(number, false);
                }

                /* JADX INFO: renamed from: H */
                public static final AbstractC1860d m7585H(String str) {
                    return str == null ? JsonNull.f12961a : new s11(str, true);
                }

                /* JADX INFO: renamed from: I */
                public static int m7586I(int i, int i2, int[] iArr) {
/* 1 */             int i3 = i - 1;
/* 3 */             int i4 = 0;
/* 4 */             while (i4 <= i3) {
/* 8 */                 int i5 = (i4 + i3) >>> 1;
/* 10 */                int i6 = iArr[i5];
/* 12 */                if (i6 < i2) {
/* 14 */                    i4 = i5 + 1;
                        } else {
/* 18 */                    if (i6 <= i2) {
/* 24 */                        return i5;
                            }
/* 20 */                    i3 = i5 - 1;
                        }
                    }
/* 25 */            return ~i4;
                }

                /* JADX INFO: renamed from: J */
                public static int m7587J(long[] jArr, int i, long j) {
/* 1 */             int i2 = i - 1;
/* 3 */             int i3 = 0;
/* 4 */             while (i3 <= i2) {
/* 8 */                 int i4 = (i3 + i2) >>> 1;
/* 10 */                long j2 = jArr[i4];
/* 14 */                if (j2 < j) {
/* 16 */                    i3 = i4 + 1;
                        } else {
/* 20 */                    if (j2 <= j) {
/* 26 */                        return i4;
                            }
/* 22 */                    i2 = i4 - 1;
                        }
                    }
/* 27 */            return ~i3;
                }

                /* JADX INFO: renamed from: K */
                public static final void m7588K(py0 py0Var) {
/* 1 */             py0Var.getClass();
/* 6 */             if (py0Var instanceof ca2) {
/* 31 */                f42.m3656l("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
                    } else if (py0Var instanceof gx1) {
/* 25 */                f42.m3656l("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
                    } else if (py0Var instanceof lt1) {
/* 19 */                f42.m3656l("Actual serializer for polymorphic cannot be polymorphic itself");
                    }
                }

                /* JADX INFO: renamed from: L */
                public static final String m7589L(b11 b11Var, SerialDescriptor serialDescriptor) {
/* 1 */             serialDescriptor.getClass();
/* 4 */             b11Var.getClass();
/* 19 */            for (Annotation annotation : serialDescriptor.getAnnotations()) {
/* 29 */                if (annotation instanceof e11) {
/* 33 */                    return ((e11) annotation).discriminator();
                        }
                    }
/* 38 */            return "type";
                }

                /* JADX INFO: renamed from: M */
                public static boolean m7590M(File file, Resources resources, int i) throws Throwable {
                    InputStream inputStreamOpenRawResource;
                    try {
/* 1 */                 inputStreamOpenRawResource = resources.openRawResource(i);
                        try {
/* 5 */                     boolean zM7591N = m7591N(file, inputStreamOpenRawResource);
/* 9 */                     if (inputStreamOpenRawResource != null) {
                                try {
/* 11 */                            inputStreamOpenRawResource.close();
                                } catch (IOException unused) {
                                }
                            }
/* 14 */                    return zM7591N;
                        } catch (Throwable th) {
/* 15 */                    th = th;
/* 19 */                    if (inputStreamOpenRawResource != null) {
                                try {
/* 21 */                            inputStreamOpenRawResource.close();
                                } catch (IOException unused2) {
                                }
                            }
/* 24 */                    throw th;
                        }
                    } catch (Throwable th2) {
/* 17 */                th = th2;
/* 18 */                inputStreamOpenRawResource = null;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:31:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX INFO: renamed from: N */
                public static boolean m7591N(File file, InputStream inputStream) {
/* 1 */             StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
/* 6 */             FileOutputStream fileOutputStreamM5166d = null;
                    try {
                        try {
/* 12 */                    fileOutputStreamM5166d = AbstractC1417a.m5166d(file, new FileOutputStream(file, false), false);
/* 18 */                    byte[] bArr = new byte[Segment.SHARE_MINIMUM];
                            while (true) {
/* 20 */                        int i = inputStream.read(bArr);
/* 25 */                        if (i != -1) {
/* 27 */                            fileOutputStreamM5166d.write(bArr, 0, i);
                                } else {
                                    try {
                                        break;
                                    } catch (IOException unused) {
                                    }
                                }
/* 78 */                        if (fileOutputStreamM5166d != null) {
                                    try {
/* 80 */                                fileOutputStreamM5166d.close();
                                    } catch (IOException unused2) {
                                    }
                                }
/* 83 */                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
/* 86 */                        throw th;
                            }
/* 35 */                    fileOutputStreamM5166d.close();
/* 38 */                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
/* 41 */                    return true;
                        } catch (IOException e) {
/* 66 */                    AbstractC1245n0.m4876d("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
/* 69 */                    if (fileOutputStreamM5166d != null) {
                                try {
/* 71 */                            fileOutputStreamM5166d.close();
                                } catch (IOException unused3) {
                                }
                            }
/* 74 */                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
/* 5 */                     return false;
                        }
                    } catch (Throwable th) {
/* 78 */                if (fileOutputStreamM5166d != null) {
/* 80 */                    fileOutputStreamM5166d.close();
                        }
/* 83 */                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
/* 86 */                throw th;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX INFO: renamed from: O */
                public static AnimatorSet m7592O(InterfaceC0157av interfaceC0157av, float f, float f2, float f3) {
/* 14 */            ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(interfaceC0157av, C2474xu.f19378a, C2344wu.f18815b, new C2564zu(f, f2, f3));
/* 18 */            C2564zu revealInfo = interfaceC0157av.getRevealInfo();
/* 22 */            if (revealInfo == null) {
/* 54 */                f42.m3656l("Caller must set a non-null RevealInfo before calling this.");
/* 57 */                return null;
                    }
/* 30 */            Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal((View) interfaceC0157av, (int) f, (int) f2, revealInfo.f20329c, f3);
/* 36 */            AnimatorSet animatorSet = new AnimatorSet();
/* 48 */            animatorSet.playTogether(objectAnimatorOfObject, animatorCreateCircularReveal);
/* 51 */            return animatorSet;
                }

                /* JADX INFO: renamed from: P */
                public static void m7593P(String str, String str2, Object obj) {
/* 10 */            if (Log.isLoggable(m7607l0(str), 3)) {
/* 16 */                String.format(str2, obj);
                    }
                }

                /* JADX INFO: renamed from: Q */
                public static final Object m7594Q(j11 j11Var, KSerializer kSerializer) {
                    String str;
/* 1 */             kSerializer.getClass();
/* 6 */             if (!(kSerializer instanceof mt1)) {
/* 186 */               return kSerializer.deserialize(j11Var);
                    }
/* 12 */            wl0 wl0Var = j11Var.mo5634d().f2162a;
/* 15 */            mt1 mt1Var = (mt1) kSerializer;
/* 25 */            String strM7589L = m7589L(j11Var.mo5634d(), mt1Var.getDescriptor());
/* 29 */            AbstractC1858b abstractC1858bMo5635m = j11Var.mo5635m();
/* 33 */            SerialDescriptor descriptor = mt1Var.getDescriptor();
/* 40 */            if (!(abstractC1858bMo5635m instanceof C1859c)) {
/* 185 */               throw kb1.m6050c(-1, "Expected " + j22.m5667a(C1859c.class) + " as the serialized body of " + descriptor.mo130a() + ", but had " + j22.m5667a(abstractC1858bMo5635m.getClass()));
                    }
/* 42 */            C1859c c1859c = (C1859c) abstractC1858bMo5635m;
/* 48 */            AbstractC1858b abstractC1858b = (AbstractC1858b) c1859c.get(strM7589L);
/* 61 */            String strMo6271a = abstractC1858b != null ? m7602b0(abstractC1858b).mo6271a() : null;
/* 64 */            KSerializer kSerializerM6800a = ((mt1) kSerializer).m6800a(j11Var, strMo6271a);
/* 68 */            if (kSerializerM6800a != null) {
/* 109 */               b11 b11VarMo5634d = j11Var.mo5634d();
/* 113 */               b11VarMo5634d.getClass();
/* 116 */               strM7589L.getClass();
/* 128 */               return m7594Q(new e21(b11VarMo5634d, c1859c, strM7589L, kSerializerM6800a.getDescriptor()), kSerializerM6800a);
                    }
/* 70 */            if (strMo6271a == null) {
/* 72 */                str = "missing class discriminator ('null')";
                    } else {
/* 90 */                str = "class discriminator '" + strMo6271a + '\'';
                    }
/* 108 */           throw kb1.m6051d("Polymorphic serializer was not found for ".concat(str), c1859c.toString(), -1);
                }

                /* JADX INFO: renamed from: R */
                public static void m7595R(String str, String str2, Exception exc) {
/* 1 */             String strM7607l0 = m7607l0(str);
/* 10 */            if (Log.isLoggable(strM7607l0, 6)) {
/* 12 */                AbstractC1245n0.m4877e(strM7607l0, str2, exc);
                    }
                }

                /* JADX INFO: renamed from: U */
                public static final void m7596U(String str, AbstractC1858b abstractC1858b) {
/* 36 */            throw new IllegalArgumentException("Element " + j22.m5667a(abstractC1858b.getClass()) + " is not a " + str);
                }

                /* JADX INFO: renamed from: V */
                public static py0 m7597V(int i, double[] dArr, double[][] dArr2) {
/* 4 */             if (dArr.length == 1) {
/* 6 */                 i = 2;
                    }
/* 7 */             if (i == 0) {
/* 73 */                return new vj1(dArr, dArr2);
                    }
/* 9 */             int i2 = 8;
/* 12 */            if (i == 2) {
/* 59 */                double d = dArr[0];
/* 61 */                double[] dArr3 = dArr2[0];
/* 63 */                u20 u20Var = new u20(i2);
/* 66 */                u20Var.f17333k = d;
/* 68 */                u20Var.f17334l = dArr3;
/* 70 */                return u20Var;
                    }
/* 16 */            n71 n71Var = new n71(i2);
/* 21 */            int length = dArr2[0].length;
/* 24 */            n71Var.f14155m = new double[length];
/* 26 */            n71Var.f14153k = dArr;
/* 28 */            n71Var.f14154l = dArr2;
/* 30 */            if (length > 2) {
/* 32 */                double d2 = 0.0d;
/* 34 */                int i3 = 0;
                        while (true) {
/* 35 */                    double d3 = d2;
/* 37 */                    if (i3 >= dArr.length) {
                                break;
                            }
/* 41 */                    double d4 = dArr2[i3][0];
/* 43 */                    if (i3 > 0) {
/* 49 */                        Math.hypot(d4 - d2, d4 - d3);
                            }
/* 52 */                    i3++;
/* 54 */                    d2 = d4;
                        }
                    }
/* 56 */            return n71Var;
                }

                /* JADX INFO: renamed from: W */
                public static final boolean m7598W(AbstractC1860d abstractC1860d) {
/* 5 */             Boolean boolM8508b = sh2.m8508b(abstractC1860d.mo6271a());
/* 9 */             if (boolM8508b != null) {
/* 11 */                return boolM8508b.booleanValue();
                    }
/* 38 */            throw new IllegalStateException(abstractC1860d + " does not represent a Boolean");
                }

                /* JADX INFO: renamed from: Y */
                public static C2466xm m7599Y(InterfaceC2299vm interfaceC2299vm) {
/* 3 */             C2260um c2260um = new C2260um();
/* 11 */            c2260um.f17592c = new u32();
/* 15 */            C2466xm c2466xm = new C2466xm(c2260um);
/* 18 */            c2260um.f17591b = c2466xm;
/* 24 */            c2260um.f17590a = interfaceC2299vm.getClass();
                    try {
/* 26 */                Object objMo1148w = interfaceC2299vm.mo1148w(c2260um);
/* 30 */                if (objMo1148w == null) {
/* 37 */                    return c2466xm;
                        }
/* 32 */                c2260um.f17590a = objMo1148w;
/* 34 */                return c2466xm;
                    } catch (Exception e) {
/* 38 */                c2466xm.m9977b(e);
/* 41 */                return c2466xm;
                    }
                }

                /* JADX INFO: renamed from: Z */
                public static final C1857a m7600Z(AbstractC1858b abstractC1858b) {
/* 10 */            C1857a c1857a = abstractC1858b instanceof C1857a ? (C1857a) abstractC1858b : null;
/* 11 */            if (c1857a != null) {
/* 13 */                return c1857a;
                    }
/* 16 */            m7596U("JsonArray", abstractC1858b);
/* 19 */            throw null;
                }

                /* JADX INFO: renamed from: a0 */
                public static final C1859c m7601a0(AbstractC1858b abstractC1858b) {
/* 1 */             abstractC1858b.getClass();
/* 13 */            C1859c c1859c = abstractC1858b instanceof C1859c ? (C1859c) abstractC1858b : null;
/* 14 */            if (c1859c != null) {
/* 16 */                return c1859c;
                    }
/* 19 */            m7596U("JsonObject", abstractC1858b);
/* 22 */            throw null;
                }

                /* JADX INFO: renamed from: b0 */
                public static final AbstractC1860d m7602b0(AbstractC1858b abstractC1858b) {
/* 10 */            AbstractC1860d abstractC1860d = abstractC1858b instanceof AbstractC1860d ? (AbstractC1860d) abstractC1858b : null;
/* 11 */            if (abstractC1860d != null) {
/* 13 */                return abstractC1860d;
                    }
/* 16 */            m7596U("JsonPrimitive", abstractC1858b);
/* 19 */            throw null;
                }

                /* JADX INFO: renamed from: c0 */
                public static Intent m7603c0(AppCompatActivity appCompatActivity) {
/* 1 */             Intent parentActivityIntent = appCompatActivity.getParentActivityIntent();
/* 5 */             if (parentActivityIntent != null) {
/* 7 */                 return parentActivityIntent;
                    }
                    try {
/* 13 */                String strM7605e0 = m7605e0(appCompatActivity, appCompatActivity.getComponentName());
/* 17 */                if (strM7605e0 == null) {
/* 8 */                     return null;
                        }
/* 22 */                ComponentName componentName = new ComponentName(appCompatActivity, strM7605e0);
                        try {
                            return m7605e0(appCompatActivity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
                        } catch (PackageManager.NameNotFoundException unused) {
/* 67 */                    AbstractC1245n0.m4876d("NavUtils", "getParentActivityIntent: bad parentActivityName '" + strM7605e0 + "' in manifest");
/* 8 */                     return null;
                        }
                    } catch (PackageManager.NameNotFoundException e) {
/* 72 */                C1951n4.m6863n(e);
/* 8 */                 return null;
                    }
                }

                /* JADX INFO: renamed from: d0 */
                public static Intent m7604d0(AppCompatActivity appCompatActivity, ComponentName componentName) throws PackageManager.NameNotFoundException {
/* 1 */             String strM7605e0 = m7605e0(appCompatActivity, componentName);
/* 5 */             if (strM7605e0 == null) {
/* 7 */                 return null;
                    }
/* 15 */            ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strM7605e0);
                    return m7605e0(appCompatActivity, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
                }

                /* JADX INFO: renamed from: e0 */
                public static String m7605e0(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
                    String string;
/* 18 */            ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
/* 22 */            String str = activityInfo.parentActivityName;
/* 24 */            if (str != null) {
/* 26 */                return str;
                    }
/* 27 */            Bundle bundle = activityInfo.metaData;
/* 30 */            if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
/* 29 */                return null;
                    }
/* 49 */            if (string.charAt(0) != '.') {
/* 71 */                return string;
                    }
/* 66 */            return context.getPackageName() + string;
                }

                /* JADX INFO: renamed from: i0 */
                public static SharedPreferences m7606i0(Context context) {
/* 1 */             Context applicationContext = context.getApplicationContext();
/* 5 */             if (applicationContext != null) {
/* 8 */                 context = applicationContext;
                    }
/* 12 */            return context.getSharedPreferences("com.google.firebase.messaging", 0);
                }

                /* JADX INFO: renamed from: l0 */
                public static String m7607l0(String str) {
/* 7 */             if (Build.VERSION.SDK_INT >= 26) {
/* 27 */                return "TRuntime.".concat(str);
                    }
/* 9 */             String strConcat = "TRuntime.".concat(str);
                    return strConcat.length() > 23 ? strConcat.substring(0, 23) : strConcat;
                }

                /* JADX INFO: renamed from: m0 */
                public static File m7608m0(Context context) {
/* 1 */             File cacheDir = context.getCacheDir();
/* 6 */             if (cacheDir == null) {
/* 5 */                 return null;
                    }
/* 38 */            String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
/* 45 */            for (int i = 0; i < 100; i++) {
/* 64 */                File file = new File(cacheDir, str + i);
                        try {
/* 71 */                    if (file.createNewFile()) {
/* 73 */                        return file;
                            }
                        } catch (IOException unused) {
                        }
                    }
/* 5 */             return null;
                }

                /* JADX INFO: renamed from: p0 */
                public static synchronized boolean m7609p0(Context context) {
                    Boolean bool;
/* 4 */             Context applicationContext = context.getApplicationContext();
/* 8 */             Context context2 = f15328b;
/* 10 */            if (context2 != null && (bool = f15329c) != null && context2 == applicationContext) {
/* 19 */                return bool.booleanValue();
                    }
/* 28 */            f15329c = null;
/* 34 */            if (j13.m5650l()) {
/* 48 */                f15329c = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
                    } else {
                        try {
/* 57 */                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
/* 62 */                    f15329c = Boolean.TRUE;
                        } catch (ClassNotFoundException unused) {
/* 67 */                    f15329c = Boolean.FALSE;
                        }
                    }
/* 69 */            f15328b = applicationContext;
/* 73 */            return f15329c.booleanValue();
                }

                /* JADX INFO: renamed from: q0 */
                public static final C2126r m7610q0(Object[] objArr) {
/* 1 */             objArr.getClass();
/* 6 */             return new C2126r(objArr);
                }

                /* JADX INFO: renamed from: r0 */
                public static MappedByteBuffer m7611r0(Context context, Uri uri) {
                    try {
/* 8 */                 ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
/* 12 */                if (parcelFileDescriptorOpenFileDescriptor == null) {
/* 14 */                    if (parcelFileDescriptorOpenFileDescriptor != null) {
/* 16 */                        parcelFileDescriptorOpenFileDescriptor.close();
/* 5 */                         return null;
                            }
/* 5 */                     return null;
                        }
                        try {
/* 22 */                    FileDescriptor fileDescriptor = parcelFileDescriptorOpenFileDescriptor.getFileDescriptor();
/* 29 */                    FileInputStream fileInputStreamM5165c = AbstractC1417a.m5165c(new FileInputStream(fileDescriptor), fileDescriptor);
                            try {
/* 33 */                        FileChannel channel = fileInputStreamM5165c.getChannel();
/* 45 */                        MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
/* 49 */                        fileInputStreamM5165c.close();
/* 52 */                        parcelFileDescriptorOpenFileDescriptor.close();
/* 55 */                        return map;
                            } catch (Throwable th) {
                                try {
/* 61 */                            fileInputStreamM5165c.close();
/* 70 */                            throw th;
                                } catch (Throwable th2) {
/* 67 */                            th.addSuppressed(th2);
/* 70 */                            throw th;
                                }
                            }
                        } catch (Throwable th3) {
                            try {
/* 71 */                        parcelFileDescriptorOpenFileDescriptor.close();
/* 80 */                        throw th3;
                            } catch (Throwable th4) {
/* 77 */                        th3.addSuppressed(th4);
/* 80 */                        throw th3;
                            }
                        }
                    } catch (IOException unused) {
                    }
                }

                /* JADX INFO: renamed from: u0 */
                public static void m7612u0(ViewGroup viewGroup, boolean z) {
/* 5 */             if (Build.VERSION.SDK_INT >= 29) {
/* 1 */                 viewGroup.suppressLayout(z);
                    } else if (f15334h) {
                        try {
/* 1 */                     viewGroup.suppressLayout(z);
                        } catch (NoSuchMethodError unused) {
/* 20 */                    f15334h = false;
                        }
                    }
                }

                /* JADX INFO: renamed from: w0 */
                public static String m7613w0(String str, Object... objArr) {
                    int length;
                    int length2;
                    int iIndexOf;
                    String string;
/* 1 */             int i = 0;
/* 2 */             int i2 = 0;
                    while (true) {
/* 3 */                 length = objArr.length;
/* 4 */                 if (i2 >= length) {
                            break;
                        }
/* 6 */                 Object obj = objArr[i2];
/* 8 */                 if (obj == null) {
/* 10 */                    string = "null";
                        } else {
                            try {
/* 13 */                        string = obj.toString();
                            } catch (Exception e) {
/* 24 */                        String name = obj.getClass().getName();
/* 32 */                        String hexString = Integer.toHexString(System.identityHashCode(obj));
/* 58 */                        String strM3790p = fm0.m3790p(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
/* 80 */                        Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strM3790p), (Throwable) e);
/* 83 */                        int length3 = strM3790p.length();
/* 91 */                        String name2 = e.getClass().getName();
/* 106 */                       StringBuilder sb = new StringBuilder(length3 + 8 + name2.length() + 1);
/* 113 */                       fm0.m3796v(sb, "<", strM3790p, " threw ", name2);
/* 118 */                       sb.append(">");
/* 121 */                       string = sb.toString();
                            }
                        }
/* 125 */               objArr[i2] = string;
/* 127 */               i2++;
                    }
/* 139 */           StringBuilder sb2 = new StringBuilder(str.length() + (length * 16));
/* 142 */           int i3 = 0;
                    while (true) {
/* 143 */               length2 = objArr.length;
/* 144 */               if (i >= length2 || (iIndexOf = str.indexOf("%s", i3)) == -1) {
                            break;
                        }
/* 156 */               sb2.append((CharSequence) str, i3, iIndexOf);
/* 163 */               sb2.append(objArr[i]);
/* 159 */               i++;
/* 166 */               i3 = iIndexOf + 2;
                    }
/* 176 */           sb2.append((CharSequence) str, i3, str.length());
/* 179 */           if (i < length2) {
/* 183 */               sb2.append(" [");
/* 190 */               sb2.append(objArr[i]);
/* 194 */               for (int i4 = i + 1; i4 < objArr.length; i4++) {
/* 198 */                   sb2.append(", ");
/* 205 */                   sb2.append(objArr[i4]);
                        }
/* 212 */               sb2.append(']');
                    }
/* 215 */           return sb2.toString();
                }

                /* JADX INFO: renamed from: x0 */
                public static String m7614x0(int i) {
/* 1 */             if (i == 0) {
/* 294 */               return "STATUS_OK";
                    }
/* 4 */             if (i == 1) {
/* 291 */               return "STATUS_INTERNAL_ERROR";
                    }
/* 7 */             if (i == 2) {
/* 288 */               return "STATUS_CLIENT_RECONNECT_REQUIRED";
                    }
/* 10 */            if (i == 3) {
/* 285 */               return "STATUS_NETWORK_ERROR_STALE_DATA";
                    }
/* 13 */            if (i == 4) {
/* 282 */               return "STATUS_NETWORK_ERROR_NO_DATA";
                    }
/* 16 */            if (i == 5) {
/* 279 */               return "STATUS_NETWORK_ERROR_OPERATION_DEFERRED";
                    }
/* 19 */            if (i == 6) {
/* 276 */               return "STATUS_NETWORK_ERROR_OPERATION_FAILED";
                    }
/* 22 */            if (i == 7) {
/* 273 */               return "STATUS_LICENSE_CHECK_FAILED";
                    }
/* 26 */            if (i == 14) {
/* 270 */               return "STATUS_INTERRUPTED";
                    }
/* 30 */            if (i == 15) {
/* 267 */               return "STATUS_TIMEOUT";
                    }
/* 34 */            if (i == 6500) {
/* 264 */               return "STATUS_MATCH_ERROR_INVALID_PARTICIPANT_STATE";
                    }
/* 38 */            if (i == 6501) {
/* 261 */               return "STATUS_MATCH_ERROR_INACTIVE_MATCH";
                    }
                    switch (i) {
                        case 7:
/* 273 */                   return "STATUS_LICENSE_CHECK_FAILED";
                        case 8:
/* 258 */                   return "STATUS_APP_MISCONFIGURED";
                        case 9:
/* 255 */                   return "STATUS_GAME_NOT_FOUND";
                        case 500:
/* 252 */                   return "STATUS_RESOLVE_STALE_OR_NO_DATA";
                        case 1500:
/* 249 */                   return "STATUS_PLAYER_OOB_REQUIRED";
                        case 4006:
/* 246 */                   return "STATUS_SNAPSHOT_CONFLICT_MISSING";
                        case 8000:
/* 243 */                   return "STATUS_MILESTONE_CLAIMED_PREVIOUSLY";
                        case 8001:
/* 240 */                   return "STATUS_MILESTONE_CLAIM_FAILED";
                        case 8002:
/* 237 */                   return "STATUS_QUEST_NO_LONGER_AVAILABLE";
                        case 8003:
/* 234 */                   return "STATUS_QUEST_NOT_STARTED";
                        case 9000:
/* 231 */                   return "STATUS_VIDEO_NOT_ACTIVE";
                        case 9001:
/* 228 */                   return "STATUS_VIDEO_UNSUPPORTED";
                        case 9002:
/* 225 */                   return "STATUS_VIDEO_PERMISSION_ERROR";
                        case 9003:
/* 222 */                   return "STATUS_VIDEO_STORAGE_ERROR";
                        case 9004:
/* 219 */                   return "STATUS_VIDEO_UNEXPECTED_CAPTURE_ERROR";
                        case 9006:
/* 216 */                   return "STATUS_VIDEO_ALREADY_CAPTURING";
                        case 9009:
/* 213 */                   return "STATUS_VIDEO_OUT_OF_DISK_SPACE";
                        case 9010:
/* 210 */                   return "STATUS_VIDEO_NO_MIC";
                        case 9011:
/* 207 */                   return "STATUS_VIDEO_NO_CAMERA";
                        case 9012:
/* 204 */                   return "STATUS_VIDEO_SCREEN_OFF";
                        case 9016:
/* 201 */                   return "STATUS_VIDEO_RELEASE_TIMEOUT";
                        case 9017:
/* 198 */                   return "STATUS_VIDEO_CAPTURE_VIDEO_PERMISSION_REQUIRED";
                        case 9200:
/* 195 */                   return "STATUS_VIDEO_MISSING_OVERLAY_PERMISSION";
                        case 10000:
/* 192 */                   return "STATUS_CLIENT_LOADING";
                        case 10001:
/* 189 */                   return "STATUS_CLIENT_EMPTY";
                        case 10002:
/* 186 */                   return "STATUS_CLIENT_HIDDEN";
                        case 10003:
/* 183 */                   return "STATUS_CONSENT_REQUIRED";
                        default:
                            switch (i) {
                                case 1000:
/* 180 */                           return "STATUS_AUTH_ERROR_HARD";
                                case WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY /* 1001 */:
/* 177 */                           return "STATUS_AUTH_ERROR_USER_RECOVERABLE";
                                case 1002:
/* 174 */                           return "STATUS_AUTH_ERROR_UNREGISTERED_CLIENT_ID";
                                case 1003:
/* 171 */                           return "STATUS_AUTH_ERROR_API_ACCESS_DENIED";
                                case 1004:
/* 168 */                           return "STATUS_AUTH_ERROR_ACCOUNT_NOT_USABLE";
                                case WebSocketProtocol.CLOSE_NO_STATUS_CODE /* 1005 */:
/* 165 */                           return "STATUS_AUTH_ERROR_ACCOUNT_UNICORN";
                                case 1006:
/* 162 */                           return "STATUS_AUTH_ERROR_SERVICE_CACHE_MISTAKE";
                                default:
                                    switch (i) {
                                        case 2000:
/* 159 */                                   return "STATUS_REQUEST_UPDATE_PARTIAL_SUCCESS";
                                        case 2001:
/* 156 */                                   return "STATUS_REQUEST_UPDATE_TOTAL_FAILURE";
                                        case 2002:
/* 153 */                                   return "STATUS_REQUEST_TOO_MANY_RECIPIENTS";
                                        default:
                                            switch (i) {
                                                case 3000:
/* 150 */                                           return "STATUS_ACHIEVEMENT_UNLOCK_FAILURE";
                                                case 3001:
/* 147 */                                           return "STATUS_ACHIEVEMENT_UNKNOWN";
                                                case 3002:
/* 144 */                                           return "STATUS_ACHIEVEMENT_NOT_INCREMENTAL";
                                                case 3003:
/* 141 */                                           return "STATUS_ACHIEVEMENT_UNLOCKED";
                                                default:
                                                    switch (i) {
                                                        case 4000:
/* 138 */                                                   return "STATUS_SNAPSHOT_NOT_FOUND";
                                                        case 4001:
/* 135 */                                                   return "STATUS_SNAPSHOT_CREATION_FAILED";
                                                        case 4002:
/* 132 */                                                   return "STATUS_SNAPSHOT_CONTENTS_UNAVAILABLE";
                                                        case 4003:
/* 129 */                                                   return "STATUS_SNAPSHOT_COMMIT_FAILED";
                                                        case 4004:
/* 126 */                                                   return "STATUS_SNAPSHOT_CONFLICT";
                                                        default:
                                                            switch (i) {
                                                                case 6000:
/* 123 */                                                           return "STATUS_MULTIPLAYER_ERROR_CREATION_NOT_ALLOWED";
                                                                case 6001:
/* 120 */                                                           return "STATUS_MULTIPLAYER_ERROR_NOT_TRUSTED_TESTER";
                                                                case 6002:
/* 117 */                                                           return "STATUS_MULTIPLAYER_ERROR_INVALID_MULTIPLAYER_TYPE";
                                                                case 6003:
/* 114 */                                                           return "STATUS_MULTIPLAYER_DISABLED";
                                                                default:
                                                                    switch (i) {
                                                                        case 6503:
/* 111 */                                                                   return "STATUS_MATCH_ERROR_OUT_OF_DATE_VERSION";
                                                                        case 6504:
/* 108 */                                                                   return "STATUS_MATCH_ERROR_INVALID_MATCH_RESULTS";
                                                                        case 6505:
/* 105 */                                                                   return "STATUS_MATCH_ERROR_ALREADY_REMATCHED";
                                                                        case 6506:
/* 102 */                                                                   return "STATUS_MATCH_NOT_FOUND";
                                                                        case 6507:
/* 99 */                                                                    return "STATUS_MATCH_ERROR_LOCALLY_MODIFIED";
                                                                        default:
                                                                            switch (i) {
                                                                                case 7000:
/* 96 */                                                                            return "STATUS_REAL_TIME_CONNECTION_FAILED";
                                                                                case 7001:
/* 93 */                                                                            return "STATUS_REAL_TIME_MESSAGE_SEND_FAILED";
                                                                                case 7002:
/* 90 */                                                                            return "STATUS_INVALID_REAL_TIME_ROOM_ID";
                                                                                case 7003:
/* 87 */                                                                            return "STATUS_PARTICIPANT_NOT_CONNECTED";
                                                                                case 7004:
/* 84 */                                                                            return "STATUS_REAL_TIME_ROOM_NOT_JOINED";
                                                                                case 7005:
/* 81 */                                                                            return "STATUS_REAL_TIME_INACTIVE_ROOM";
                                                                                case 7006:
/* 78 */                                                                            return "STATUS_REAL_TIME_SERVICE_NOT_CONNECTED";
                                                                                case 7007:
/* 75 */                                                                            return "STATUS_OPERATION_IN_FLIGHT";
                                                                                default:
/* 64 */                                                                            Locale locale = Locale.US;
/* 70 */                                                                            return AbstractC0886en.m3505i(i, "Status code (", ") not found!");
                                                                            }
                                                                    }
                                                            }
                                                    }
                                            }
                                    }
                            }
                    }
                }

                @Override // kotlinx.serialization.encoding.Encoder
                /* JADX INFO: renamed from: A */
                public void mo1484A(KSerializer kSerializer, Object obj) {
/* 1 */             kSerializer.getClass();
/* 4 */             kSerializer.serialize(this, obj);
                }

                @Override // kotlinx.serialization.encoding.Encoder
                /* JADX INFO: renamed from: B */
                public abstract void mo1485B(long j);

                @Override // p000.InterfaceC1907ly
                /* JADX INFO: renamed from: C */
                public Encoder mo1486C(cx1 cx1Var, int i) {
/* 1 */             cx1Var.getClass();
/* 4 */             mo7451S(cx1Var, i);
/* 11 */            return mo1522z(cx1Var.mo138i(i));
                }

                @Override // p000.InterfaceC1907ly
                /* JADX INFO: renamed from: D */
                public void mo1487D(SerialDescriptor serialDescriptor, int i, long j) {
/* 1 */             serialDescriptor.getClass();
/* 4 */             mo7451S(serialDescriptor, i);
/* 7 */             mo1485B(j);
                }

                /* JADX INFO: renamed from: E */
                public boolean mo1488E(SerialDescriptor serialDescriptor) {
/* 1 */             serialDescriptor.getClass();
/* 4 */             return true;
                }

                @Override // kotlinx.serialization.encoding.Encoder
                /* JADX INFO: renamed from: F */
                public void mo1489F(String str) {
/* 1 */             str.getClass();
/* 4 */             m7615T(str);
                }

                /* JADX INFO: renamed from: S */
                public void mo7451S(SerialDescriptor serialDescriptor, int i) {
/* 1 */             serialDescriptor.getClass();
                }

                /* JADX INFO: renamed from: T */
                public void m7615T(Object obj) {
/* 1 */             obj.getClass();
/* 52 */            throw new ea2("Non-serializable " + j22.m5667a(obj.getClass()) + " is not supported by " + j22.m5667a(getClass()) + " encoder");
                }

                /* JADX INFO: renamed from: X */
                public abstract InputFilter[] mo3724X(InputFilter[] inputFilterArr);

                /* JADX INFO: renamed from: b */
                public void mo1498b(SerialDescriptor serialDescriptor) {
/* 1 */             serialDescriptor.getClass();
                }

                @Override // kotlinx.serialization.encoding.Encoder
                /* JADX INFO: renamed from: c */
                public InterfaceC1907ly mo1499c(SerialDescriptor serialDescriptor) {
/* 1 */             serialDescriptor.getClass();
/* 4 */             return this;
                }

                @Override // p000.InterfaceC1907ly
                /* JADX INFO: renamed from: e */
                public void mo1501e(cx1 cx1Var, int i, double d) {
/* 1 */             cx1Var.getClass();
/* 4 */             mo7451S(cx1Var, i);
/* 7 */             mo1503g(d);
                }

                @Override // kotlinx.serialization.encoding.Encoder
                /* JADX INFO: renamed from: f */
                public void mo1502f() {
/* 8 */             throw new ea2("'null' is not supported by default");
                }

                /* JADX INFO: renamed from: f0 */
                public abstract double mo6911f0(double d);

                @Override // kotlinx.serialization.encoding.Encoder
                /* JADX INFO: renamed from: g */
                public void mo1503g(double d) {
/* 5 */             m7615T(Double.valueOf(d));
                }

                /* JADX INFO: renamed from: g0 */
                public abstract void mo6912g0(double d, double[] dArr);

                @Override // kotlinx.serialization.encoding.Encoder
                /* JADX INFO: renamed from: h */
                public abstract void mo1504h(short s);

                /* JADX INFO: renamed from: h0 */
                public abstract void mo6913h0(double d, float[] fArr);

                public int hashCode() {
                    switch (this.f15337a) {
                        case 16:
/* 15 */                    return toString().hashCode();
                        default:
/* 6 */                     return super.hashCode();
                    }
                }

                @Override // p000.InterfaceC1907ly
                /* JADX INFO: renamed from: i */
                public void mo1505i(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj) {
/* 1 */             serialDescriptor.getClass();
/* 4 */             kSerializer.getClass();
/* 7 */             mo7451S(serialDescriptor, i);
/* 10 */            mo1484A(kSerializer, obj);
                }

                @Override // kotlinx.serialization.encoding.Encoder
                /* JADX INFO: renamed from: j */
                public abstract void mo1506j(byte b);

                /* JADX INFO: renamed from: j0 */
                public abstract double mo6914j0(double d);

                @Override // kotlinx.serialization.encoding.Encoder
                /* JADX INFO: renamed from: k */
                public void mo1507k(boolean z) {
/* 5 */             m7615T(Boolean.valueOf(z));
                }

                /* JADX INFO: renamed from: k0 */
                public abstract void mo6915k0(double d, double[] dArr);

                @Override // p000.InterfaceC1907ly
                /* JADX INFO: renamed from: l */
                public void mo1508l(int i, int i2, SerialDescriptor serialDescriptor) {
/* 1 */             serialDescriptor.getClass();
/* 4 */             mo7451S(serialDescriptor, i);
/* 7 */             mo1521y(i2);
                }

                @Override // kotlinx.serialization.encoding.Encoder
                /* JADX INFO: renamed from: m */
                public void mo1509m(float f) {
/* 5 */             m7615T(Float.valueOf(f));
                }

                @Override // p000.InterfaceC1907ly
                /* JADX INFO: renamed from: n */
                public void mo1510n(cx1 cx1Var, int i, byte b) {
/* 1 */             cx1Var.getClass();
/* 4 */             mo7451S(cx1Var, i);
/* 7 */             mo1506j(b);
                }

                /* JADX INFO: renamed from: n0 */
                public abstract double[] mo6916n0();

                @Override // kotlinx.serialization.encoding.Encoder
                /* JADX INFO: renamed from: o */
                public void mo1511o(char c) {
/* 5 */             m7615T(Character.valueOf(c));
                }

                /* JADX INFO: renamed from: o0 */
                public abstract boolean mo3725o0();

                @Override // p000.InterfaceC1907ly
                /* JADX INFO: renamed from: p */
                public void mo1512p(cx1 cx1Var, int i, float f) {
/* 1 */             cx1Var.getClass();
/* 4 */             mo7451S(cx1Var, i);
/* 7 */             mo1509m(f);
                }

                @Override // p000.InterfaceC1907ly
                /* JADX INFO: renamed from: q */
                public void mo1513q(SerialDescriptor serialDescriptor, int i, boolean z) {
/* 1 */             serialDescriptor.getClass();
/* 4 */             mo7451S(serialDescriptor, i);
/* 7 */             mo1507k(z);
                }

                @Override // p000.InterfaceC1907ly
                /* JADX INFO: renamed from: r */
                public void mo1514r(SerialDescriptor serialDescriptor, int i, String str) {
/* 1 */             serialDescriptor.getClass();
/* 4 */             str.getClass();
/* 7 */             mo7451S(serialDescriptor, i);
/* 10 */            mo1489F(str);
                }

                /* JADX INFO: renamed from: s */
                public void mo1515s(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj) {
/* 1 */             serialDescriptor.getClass();
/* 4 */             kSerializer.getClass();
/* 7 */             mo7451S(serialDescriptor, i);
/* 18 */            if (kSerializer.getDescriptor().mo132c()) {
/* 20 */                mo1484A(kSerializer, obj);
                    } else if (obj == null) {
/* 26 */                mo1502f();
                    } else {
/* 30 */                mo1484A(kSerializer, obj);
                    }
                }

                /* JADX INFO: renamed from: s0 */
                public abstract void mo3726s0(boolean z);

                @Override // p000.InterfaceC1907ly
                /* JADX INFO: renamed from: t */
                public void mo1516t(cx1 cx1Var, int i, short s) {
/* 1 */             cx1Var.getClass();
/* 4 */             mo7451S(cx1Var, i);
/* 7 */             mo1504h(s);
                }

                /* JADX INFO: renamed from: t0 */
                public abstract void mo3727t0(boolean z);

                public String toString() {
                    switch (this.f15337a) {
                        case 16:
/* 19 */                    String strM3242b = j22.m5667a(getClass()).m3242b();
/* 23 */                    strM3242b.getClass();
/* 26 */                    return strM3242b;
                        default:
/* 6 */                     return super.toString();
                    }
                }

                @Override // kotlinx.serialization.encoding.Encoder
                /* JADX INFO: renamed from: u */
                public InterfaceC1907ly mo1517u(SerialDescriptor serialDescriptor, int i) {
/* 1 */             serialDescriptor.getClass();
/* 4 */             return mo1499c(serialDescriptor);
                }

                @Override // kotlinx.serialization.encoding.Encoder
                /* JADX INFO: renamed from: v */
                public void mo1518v(SerialDescriptor serialDescriptor, int i) {
/* 1 */             serialDescriptor.getClass();
/* 8 */             m7615T(Integer.valueOf(i));
                }

                /* JADX INFO: renamed from: v0 */
                public abstract TransformationMethod mo3728v0(TransformationMethod transformationMethod);

                @Override // p000.InterfaceC1907ly
                /* JADX INFO: renamed from: x */
                public void mo1520x(cx1 cx1Var, int i, char c) {
/* 1 */             cx1Var.getClass();
/* 4 */             mo7451S(cx1Var, i);
/* 7 */             mo1511o(c);
                }

                @Override // kotlinx.serialization.encoding.Encoder
                /* JADX INFO: renamed from: y */
                public abstract void mo1521y(int i);

                @Override // kotlinx.serialization.encoding.Encoder
                /* JADX INFO: renamed from: z */
                public Encoder mo1522z(SerialDescriptor serialDescriptor) {
/* 1 */             serialDescriptor.getClass();
/* 4 */             return this;
                }
            }
