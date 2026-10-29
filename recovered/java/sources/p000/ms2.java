            package p000;

            import android.content.Context;
            import android.content.res.Resources;
            import android.graphics.Typeface;
            import android.net.Uri;
            import io.sentry.android.core.AbstractC1245n0;
            import io.sentry.config.AbstractC1417a;
            import java.io.File;
            import java.io.FileInputStream;
            import java.io.IOException;
            import java.lang.reflect.Array;
            import java.lang.reflect.Constructor;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            import java.nio.ByteBuffer;
            import java.nio.MappedByteBuffer;
            import java.nio.channels.FileChannel;
            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ms2 extends hu0 {

                /* JADX INFO: renamed from: e */
                public static final Class f14011e;

                /* JADX INFO: renamed from: f */
                public static final Constructor f14012f;

                /* JADX INFO: renamed from: g */
                public static final Method f14013g;

                /* JADX INFO: renamed from: h */
                public static final Method f14014h;

                static {
                    Class<?> cls;
                    Method method;
                    Method method2;
/* 1 */             Constructor<?> constructor = null;
                    try {
/* 4 */                 cls = Class.forName("android.graphics.FontFamily");
/* 8 */                 Constructor<?> constructor2 = cls.getConstructor(null);
/* 16 */                Class cls2 = Integer.TYPE;
/* 26 */                method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
/* 47 */                method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
/* 53 */                constructor = constructor2;
                    } catch (ClassNotFoundException | NoSuchMethodException e) {
/* 68 */                AbstractC1245n0.m4877e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
/* 71 */                cls = null;
/* 72 */                method = null;
/* 73 */                method2 = null;
                    }
/* 74 */            f14012f = constructor;
/* 76 */            f14011e = cls;
/* 78 */            f14013g = method2;
/* 80 */            f14014h = method;
                }

                /* JADX INFO: renamed from: M0 */
                public static boolean m6797M0(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
                    try {
/* 26 */                return ((Boolean) f14013g.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
                    } catch (IllegalAccessException | InvocationTargetException unused) {
/* 31 */                return false;
                    }
                }

                /* JADX INFO: renamed from: N0 */
                public static Typeface m6798N0(Object obj) {
                    try {
/* 5 */                 Object objNewInstance = Array.newInstance((Class<?>) f14011e, 1);
/* 10 */                Array.set(objNewInstance, 0, obj);
/* 23 */                return (Typeface) f14014h.invoke(null, objNewInstance);
                    } catch (IllegalAccessException | InvocationTargetException unused) {
/* 1 */                 return null;
                    }
                }

                @Override // p000.hu0
                /* JADX INFO: renamed from: P */
                public final Typeface mo4355P(Context context, sl0 sl0Var, Resources resources, int i) throws IllegalAccessException, InstantiationException, InvocationTargetException {
                    Object objNewInstance;
                    MappedByteBuffer map;
                    try {
/* 4 */                 objNewInstance = f14012f.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
/* 10 */                objNewInstance = null;
                    }
/* 11 */            if (objNewInstance != null) {
/* 21 */                for (tl0 tl0Var : sl0Var.f16672a) {
/* 25 */                    int i2 = tl0Var.f17146f;
/* 27 */                    File fileM7608m0 = py0.m7608m0(context);
/* 31 */                    if (fileM7608m0 != null) {
                                try {
/* 43 */                            if (py0.m7590M(fileM7608m0, resources, i2)) {
                                        try {
/* 54 */                                    FileInputStream fileInputStreamM5164b = AbstractC1417a.m5164b(fileM7608m0, new FileInputStream(fileM7608m0));
                                            try {
/* 58 */                                        FileChannel channel = fileInputStreamM5164b.getChannel();
/* 70 */                                        map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
/* 74 */                                        fileInputStreamM5164b.close();
/* 90 */                                        fileM7608m0.delete();
                                            } catch (Throwable th) {
                                                try {
/* 80 */                                            fileInputStreamM5164b.close();
                                                } catch (Throwable th2) {
/* 85 */                                            th.addSuppressed(th2);
                                                }
/* 88 */                                        throw th;
                                            }
                                        } catch (IOException unused2) {
/* 89 */                                    map = null;
                                        }
                                    } else {
/* 45 */                                fileM7608m0.delete();
                                    }
/* 93 */                            if (map != null && m6797M0(objNewInstance, map, tl0Var.f17145e, tl0Var.f17142b, tl0Var.f17143c)) {
                                    }
                                } catch (Throwable th3) {
/* 113 */                           fileM7608m0.delete();
/* 116 */                           throw th3;
                                }
                            }
/* 35 */                    map = null;
/* 93 */                    if (map != null) {
                            }
                        }
/* 117 */               return m6798N0(objNewInstance);
                    }
/* 1 */             return null;
                }

                @Override // p000.hu0
                /* JADX INFO: renamed from: Q */
                public final Typeface mo4356Q(Context context, vl0[] vl0VarArr, int i) {
                    Object objNewInstance;
                    try {
/* 4 */                 objNewInstance = f14012f.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
/* 9 */                 objNewInstance = null;
                    }
/* 10 */            if (objNewInstance != null) {
/* 15 */                le2 le2Var = new le2();
/* 20 */                for (vl0 vl0Var : vl0VarArr) {
/* 24 */                    Uri uri = vl0Var.f18237a;
/* 30 */                    ByteBuffer byteBufferM7611r0 = (ByteBuffer) le2Var.getOrDefault(uri, null);
/* 32 */                    if (byteBufferM7611r0 == null) {
/* 34 */                        byteBufferM7611r0 = py0.m7611r0(context, uri);
/* 38 */                        le2Var.put(uri, byteBufferM7611r0);
                            }
/* 41 */                    if (byteBufferM7611r0 != null && m6797M0(objNewInstance, byteBufferM7611r0, vl0Var.f18238b, vl0Var.f18239c, vl0Var.f18240d)) {
                            }
                        }
/* 60 */                Typeface typefaceM6798N0 = m6798N0(objNewInstance);
/* 64 */                if (typefaceM6798N0 != null) {
/* 67 */                    return Typeface.create(typefaceM6798N0, i);
                        }
                    }
/* 1 */             return null;
                }
            }
