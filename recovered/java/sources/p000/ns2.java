            package p000;

            import android.content.Context;
            import android.content.res.AssetManager;
            import android.content.res.Resources;
            import android.graphics.Typeface;
            import android.graphics.fonts.FontVariationAxis;
            import android.net.Uri;
            import android.os.ParcelFileDescriptor;
            import io.sentry.android.core.AbstractC1245n0;
            import java.io.IOException;
            import java.lang.reflect.Array;
            import java.lang.reflect.Constructor;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            import java.nio.ByteBuffer;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ns2 extends ls2 {

                /* JADX INFO: renamed from: j */
                public final Class f14440j;

                /* JADX INFO: renamed from: k */
                public final Constructor f14441k;

                /* JADX INFO: renamed from: l */
                public final Method f14442l;

                /* JADX INFO: renamed from: m */
                public final Method f14443m;

                /* JADX INFO: renamed from: n */
                public final Method f14444n;

                /* JADX INFO: renamed from: o */
                public final Method f14445o;

                /* JADX INFO: renamed from: p */
                public final Method f14446p;

                public ns2() throws NoSuchMethodException {
                    Method methodMo7041S0;
                    Constructor<?> constructor;
                    Method methodM7037R0;
                    Method method;
                    Method method2;
                    Method method3;
/* 4 */             Class<?> cls = null;
                    try {
/* 7 */                 Class<?> cls2 = Class.forName("android.graphics.FontFamily");
/* 11 */                constructor = cls2.getConstructor(null);
/* 15 */                methodM7037R0 = m7037R0(cls2);
/* 23 */                Class cls3 = Integer.TYPE;
/* 31 */                method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
/* 37 */                method2 = cls2.getMethod("freeze", null);
/* 43 */                method3 = cls2.getMethod("abortCreation", null);
/* 47 */                methodMo7041S0 = mo7041S0(cls2);
/* 53 */                cls = cls2;
                    } catch (ClassNotFoundException | NoSuchMethodException e) {
/* 74 */                AbstractC1245n0.m4877e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
/* 77 */                methodMo7041S0 = null;
/* 78 */                constructor = null;
/* 79 */                methodM7037R0 = null;
/* 80 */                method = null;
/* 81 */                method2 = null;
/* 82 */                method3 = null;
                    }
/* 83 */            this.f14440j = cls;
/* 85 */            this.f14441k = constructor;
/* 87 */            this.f14442l = methodM7037R0;
/* 89 */            this.f14443m = method;
/* 91 */            this.f14444n = method2;
/* 93 */            this.f14445o = method3;
/* 95 */            this.f14446p = methodMo7041S0;
                }

                /* JADX INFO: renamed from: R0 */
                public static Method m7037R0(Class cls) {
/* 1 */             Class cls2 = Boolean.TYPE;
/* 9 */             Class cls3 = Integer.TYPE;
/* 20 */            return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
                }

                /* JADX INFO: renamed from: O0 */
                public final boolean m7038O0(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
                    try {
/* 39 */                return ((Boolean) this.f14442l.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
                    } catch (IllegalAccessException | InvocationTargetException unused) {
/* 1 */                 return false;
                    }
                }

                @Override // p000.ls2, p000.hu0
                /* JADX INFO: renamed from: P */
                public final Typeface mo4355P(Context context, sl0 sl0Var, Resources resources, int i) throws IllegalAccessException, InstantiationException, InvocationTargetException {
                    Object objNewInstance;
/* 1 */             Method method = this.f14442l;
/* 3 */             if (method == null) {
/* 9 */                 AbstractC1245n0.m4889q("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
                    }
/* 12 */            if (method == null) {
/* 84 */                return super.mo4355P(context, sl0Var, resources, i);
                    }
                    try {
/* 17 */                objNewInstance = this.f14441k.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
/* 23 */                objNewInstance = null;
                    }
/* 24 */            if (objNewInstance != null) {
/* 27 */                tl0[] tl0VarArr = sl0Var.f16672a;
/* 29 */                int length = tl0VarArr.length;
/* 31 */                int i2 = 0;
/* 32 */                while (i2 < length) {
/* 34 */                    tl0 tl0Var = tl0VarArr[i2];
/* 36 */                    String str = tl0Var.f17141a;
/* 38 */                    int i3 = tl0Var.f17145e;
/* 40 */                    int i4 = tl0Var.f17142b;
/* 42 */                    boolean z = tl0Var.f17143c;
/* 46 */                    FontVariationAxis[] fontVariationAxisArrFromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(tl0Var.f17144d);
/* 50 */                    ns2 ns2Var = this;
/* 51 */                    Context context2 = context;
/* 56 */                    if (ns2Var.m7038O0(context2, objNewInstance, str, i3, i4, z ? 1 : 0, fontVariationAxisArrFromFontVariationSettings)) {
/* 64 */                        i2++;
/* 66 */                        this = ns2Var;
/* 67 */                        context = context2;
                            } else {
                                try {
/* 60 */                            ns2Var.f14445o.invoke(objNewInstance, null);
                                } catch (IllegalAccessException | InvocationTargetException unused2) {
                                }
                            }
                        }
/* 69 */                ns2 ns2Var2 = this;
/* 74 */                if (ns2Var2.m7040Q0(objNewInstance)) {
/* 77 */                    return ns2Var2.mo7039P0(objNewInstance);
                        }
                    }
/* 14 */            return null;
                }

                /* JADX INFO: renamed from: P0 */
                public Typeface mo7039P0(Object obj) {
                    try {
/* 10 */                Object objNewInstance = Array.newInstance((Class<?>) this.f14440j, 1);
/* 15 */                Array.set(objNewInstance, 0, obj);
/* 28 */                return (Typeface) this.f14446p.invoke(null, objNewInstance, -1, -1);
                    } catch (IllegalAccessException | InvocationTargetException unused) {
/* 6 */                 return null;
                    }
                }

                @Override // p000.ls2, p000.hu0
                /* JADX INFO: renamed from: Q */
                public final Typeface mo4356Q(Context context, vl0[] vl0VarArr, int i) throws IOException {
                    Object objNewInstance;
                    Typeface typefaceMo7039P0;
                    boolean zBooleanValue;
/* 4 */             if (vl0VarArr.length >= 1) {
/* 8 */                 Method method = this.f14442l;
/* 10 */                if (method == null) {
/* 16 */                    AbstractC1245n0.m4889q("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
                        }
                        try {
/* 19 */                    if (method != null) {
/* 23 */                        HashMap map = new HashMap();
/* 29 */                        for (vl0 vl0Var : vl0VarArr) {
/* 35 */                            if (vl0Var.f18241e == 0) {
/* 38 */                                Uri uri = vl0Var.f18237a;
/* 44 */                                if (!map.containsKey(uri)) {
/* 51 */                                    map.put(uri, py0.m7611r0(context, uri));
                                        }
                                    }
                                }
/* 57 */                        Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                                try {
/* 63 */                            objNewInstance = this.f14441k.newInstance(null);
                                } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
/* 68 */                            objNewInstance = null;
                                }
/* 69 */                        if (objNewInstance != null) {
/* 73 */                            int length = vl0VarArr.length;
/* 74 */                            int i2 = 0;
/* 75 */                            boolean z = false;
                                    while (true) {
/* 76 */                                Method method2 = this.f14445o;
/* 78 */                                if (i2 >= length) {
/* 139 */                                   if (!z) {
/* 141 */                                       method2.invoke(objNewInstance, null);
                                                break;
                                            }
/* 149 */                                   if (!m7040Q0(objNewInstance) || (typefaceMo7039P0 = mo7039P0(objNewInstance)) == null) {
                                                break;
                                                break;
                                            }
/* 159 */                                   return Typeface.create(typefaceMo7039P0, i);
                                        }
/* 80 */                                vl0 vl0Var2 = vl0VarArr[i2];
/* 88 */                                ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(vl0Var2.f18237a);
/* 90 */                                if (byteBuffer != null) {
                                            try {
/* 123 */                                       zBooleanValue = ((Boolean) this.f14443m.invoke(objNewInstance, byteBuffer, Integer.valueOf(vl0Var2.f18238b), null, Integer.valueOf(vl0Var2.f18239c), Integer.valueOf(vl0Var2.f18240d ? 1 : 0))).booleanValue();
                                            } catch (IllegalAccessException | InvocationTargetException unused2) {
/* 128 */                                       zBooleanValue = false;
                                            }
/* 129 */                                   if (!zBooleanValue) {
/* 131 */                                       method2.invoke(objNewInstance, null);
                                                break;
                                            }
/* 135 */                                   z = true;
                                        }
/* 136 */                               i2++;
                                        z = z;
                                    }
                                }
                            } else {
/* 164 */                       vl0 vl0VarM4329X = hu0.m4329X(vl0VarArr, i);
/* 176 */                       ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(vl0VarM4329X.f18237a, "r", null);
/* 180 */                       if (parcelFileDescriptorOpenFileDescriptor != null) {
                                    try {
/* 209 */                               Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(vl0VarM4329X.f18239c).setItalic(vl0VarM4329X.f18240d).build();
/* 213 */                               parcelFileDescriptorOpenFileDescriptor.close();
/* 216 */                               return typefaceBuild;
                                    } catch (Throwable th) {
                                        try {
/* 218 */                                   parcelFileDescriptorOpenFileDescriptor.close();
                                        } catch (Throwable th2) {
/* 223 */                                   th.addSuppressed(th2);
                                        }
/* 226 */                               throw th;
                                    }
                                }
/* 182 */                       if (parcelFileDescriptorOpenFileDescriptor != null) {
/* 184 */                           parcelFileDescriptorOpenFileDescriptor.close();
/* 2 */                             return null;
                                }
                            }
                        } catch (IOException | IllegalAccessException | InvocationTargetException unused3) {
                        }
                    }
/* 2 */             return null;
                }

                /* JADX INFO: renamed from: Q0 */
                public final boolean m7040Q0(Object obj) {
                    try {
/* 10 */                return ((Boolean) this.f14444n.invoke(obj, null)).booleanValue();
                    } catch (IllegalAccessException | InvocationTargetException unused) {
/* 15 */                return false;
                    }
                }

                @Override // p000.hu0
                /* JADX INFO: renamed from: R */
                public final Typeface mo4357R(Context context, Resources resources, int i, String str, int i2) throws IllegalAccessException, InstantiationException, InvocationTargetException {
                    Object objNewInstance;
/* 1 */             Method method = this.f14442l;
/* 3 */             if (method == null) {
/* 9 */                 AbstractC1245n0.m4889q("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
                    }
/* 12 */            if (method == null) {
/* 64 */                return super.mo4357R(context, resources, i, str, i2);
                    }
                    try {
/* 17 */                objNewInstance = this.f14441k.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
/* 23 */                objNewInstance = null;
                    }
/* 24 */            if (objNewInstance != null) {
/* 38 */                if (!m7038O0(context, objNewInstance, str, 0, -1, -1, null)) {
                            try {
/* 42 */                        this.f14445o.invoke(objNewInstance, null);
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        } else if (m7040Q0(objNewInstance)) {
/* 53 */                    return mo7039P0(objNewInstance);
                        }
                    }
/* 14 */            return null;
                }

                /* JADX INFO: renamed from: S0 */
                public Method mo7041S0(Class cls) throws NoSuchMethodException {
/* 6 */             Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
/* 10 */            Class cls3 = Integer.TYPE;
/* 20 */            Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
/* 24 */            declaredMethod.setAccessible(true);
/* 27 */            return declaredMethod;
                }
            }
