            package p000;

            import android.content.Context;
            import android.content.res.Resources;
            import android.graphics.Typeface;
            import android.os.ParcelFileDescriptor;
            import android.system.ErrnoException;
            import android.system.Os;
            import android.system.OsConstants;
            import io.sentry.android.core.AbstractC1245n0;
            import io.sentry.config.AbstractC1417a;
            import java.io.File;
            import java.io.FileDescriptor;
            import java.io.FileInputStream;
            import java.io.IOException;
            import java.lang.reflect.Array;
            import java.lang.reflect.Constructor;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ls2 extends hu0 {

                /* JADX INFO: renamed from: e */
                public static Class f13487e;

                /* JADX INFO: renamed from: f */
                public static Constructor f13488f;

                /* JADX INFO: renamed from: g */
                public static Method f13489g;

                /* JADX INFO: renamed from: h */
                public static Method f13490h;

                /* JADX INFO: renamed from: i */
                public static boolean f13491i;

                /* JADX INFO: renamed from: M0 */
                public static boolean m6534M0(Object obj, String str, int i, boolean z) throws NoSuchMethodException {
/* 1 */             m6535N0();
                    try {
/* 24 */                return ((Boolean) f13489g.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
                    } catch (IllegalAccessException | InvocationTargetException e) {
/* 30 */                ds0.m3199p(e);
/* 33 */                return false;
                    }
                }

                /* JADX INFO: renamed from: N0 */
                public static void m6535N0() throws NoSuchMethodException {
                    Method method;
                    Class<?> cls;
                    Method method2;
/* 3 */             if (f13491i) {
/* 5 */                 return;
                    }
/* 7 */             f13491i = true;
/* 9 */             Constructor<?> constructor = null;
                    try {
/* 12 */                cls = Class.forName("android.graphics.FontFamily");
/* 16 */                Constructor<?> constructor2 = cls.getConstructor(null);
/* 32 */                method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
/* 52 */                method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
/* 57 */                constructor = constructor2;
                    } catch (ClassNotFoundException | NoSuchMethodException e) {
/* 72 */                AbstractC1245n0.m4877e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
/* 75 */                method = null;
/* 76 */                cls = null;
/* 77 */                method2 = null;
                    }
/* 78 */            f13488f = constructor;
/* 80 */            f13487e = cls;
/* 82 */            f13489g = method2;
/* 84 */            f13490h = method;
                }

                @Override // p000.hu0
                /* JADX INFO: renamed from: P */
                public Typeface mo4355P(Context context, sl0 sl0Var, Resources resources, int i) throws NoSuchMethodException {
/* 1 */             m6535N0();
                    try {
/* 7 */                 Object objNewInstance = f13488f.newInstance(null);
/* 16 */                for (tl0 tl0Var : sl0Var.f16672a) {
/* 20 */                    File fileM7608m0 = py0.m7608m0(context);
/* 24 */                    if (fileM7608m0 == null) {
/* 4 */                         return null;
                            }
                            try {
/* 33 */                        if (!py0.m7590M(fileM7608m0, resources, tl0Var.f17146f)) {
/* 4 */                             return null;
                                }
/* 51 */                        if (!m6534M0(objNewInstance, fileM7608m0.getPath(), tl0Var.f17142b, tl0Var.f17143c)) {
/* 4 */                             return null;
                                }
/* 57 */                        fileM7608m0.delete();
                            } catch (RuntimeException unused) {
/* 4 */                         return null;
                            } finally {
/* 64 */                        fileM7608m0.delete();
                            }
                        }
/* 72 */                m6535N0();
                        try {
/* 78 */                    Object objNewInstance2 = Array.newInstance((Class<?>) f13487e, 1);
/* 82 */                    Array.set(objNewInstance2, 0, objNewInstance);
/* 95 */                    return (Typeface) f13490h.invoke(null, objNewInstance2);
                        } catch (IllegalAccessException | InvocationTargetException e) {
/* 101 */                   ds0.m3199p(e);
/* 4 */                     return null;
                        }
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
/* 110 */               ds0.m3199p(e2);
/* 4 */                 return null;
                    }
                }

                @Override // p000.hu0
                /* JADX INFO: renamed from: Q */
                public Typeface mo4356Q(Context context, vl0[] vl0VarArr, int i) {
                    File file;
                    Typeface typefaceCreateFromFile;
/* 4 */             if (vl0VarArr.length >= 1) {
                        try {
/* 20 */                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(hu0.m4329X(vl0VarArr, i).f18237a, "r", null);
/* 24 */                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                                try {
                                    try {
/* 50 */                                String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptorOpenFileDescriptor.getFd());
/* 72 */                                file = OsConstants.S_ISREG(Os.stat(str).st_mode) ? new File(str) : null;
                                    } catch (Throwable th) {
                                        try {
/* 157 */                                   parcelFileDescriptorOpenFileDescriptor.close();
                                        } catch (Throwable th2) {
/* 162 */                                   th.addSuppressed(th2);
                                        }
/* 165 */                               throw th;
                                    }
                                } catch (ErrnoException unused) {
                                }
/* 73 */                        if (file != null && file.canRead()) {
/* 82 */                            Typeface typefaceCreateFromFile2 = Typeface.createFromFile(file);
/* 86 */                            parcelFileDescriptorOpenFileDescriptor.close();
/* 89 */                            return typefaceCreateFromFile2;
                                }
/* 94 */                        FileDescriptor fileDescriptor = parcelFileDescriptorOpenFileDescriptor.getFileDescriptor();
/* 101 */                       FileInputStream fileInputStreamM5165c = AbstractC1417a.m5165c(new FileInputStream(fileDescriptor), fileDescriptor);
                                try {
/* 105 */                           File fileM7608m0 = py0.m7608m0(context);
/* 109 */                           if (fileM7608m0 == null) {
/* 111 */                               typefaceCreateFromFile = null;
                                    } else {
                                        try {
/* 117 */                                   if (py0.m7591N(fileM7608m0, fileInputStreamM5165c)) {
/* 127 */                                       typefaceCreateFromFile = Typeface.createFromFile(fileM7608m0.getPath());
/* 131 */                                       fileM7608m0.delete();
                                            } else {
/* 119 */                                       fileM7608m0.delete();
/* 111 */                                       typefaceCreateFromFile = null;
                                            }
                                        } catch (RuntimeException unused2) {
                                        } catch (Throwable th3) {
/* 136 */                                   fileM7608m0.delete();
/* 139 */                                   throw th3;
                                        }
                                    }
/* 140 */                           fileInputStreamM5165c.close();
/* 143 */                           parcelFileDescriptorOpenFileDescriptor.close();
/* 146 */                           return typefaceCreateFromFile;
                                } catch (Throwable th4) {
                                    try {
/* 148 */                               fileInputStreamM5165c.close();
                                    } catch (Throwable th5) {
/* 153 */                               th4.addSuppressed(th5);
                                    }
/* 156 */                           throw th4;
                                }
                            }
/* 26 */                    if (parcelFileDescriptorOpenFileDescriptor != null) {
/* 28 */                        parcelFileDescriptorOpenFileDescriptor.close();
/* 3 */                         return null;
                            }
                        } catch (IOException unused3) {
                        }
                    }
/* 3 */             return null;
                }
            }
