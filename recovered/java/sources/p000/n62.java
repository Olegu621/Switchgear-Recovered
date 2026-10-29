            package p000;

            import android.os.Binder;
            import android.os.Bundle;
            import android.os.IBinder;
            import android.os.Parcelable;
            import android.util.Size;
            import android.util.SizeF;
            import android.util.SparseArray;
            import java.io.Serializable;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.Map;
            import java.util.Set;
            import kotlin.Pair;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 42 */    public final class n62 {

                /* JADX INFO: renamed from: f */
                public static final Class[] f14144f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

                /* JADX INFO: renamed from: a */
                public final LinkedHashMap f14145a;

                /* JADX INFO: renamed from: b */
                public final LinkedHashMap f14146b;

                /* JADX INFO: renamed from: c */
                public final LinkedHashMap f14147c;

                /* JADX INFO: renamed from: d */
                public final LinkedHashMap f14148d;

                /* JADX INFO: renamed from: e */
                public final w62 f14149e;

                public n62(HashMap map) {
/* 6 */             LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 9 */             this.f14145a = linkedHashMap;
/* 16 */            this.f14146b = new LinkedHashMap();
/* 23 */            this.f14147c = new LinkedHashMap();
/* 30 */            this.f14148d = new LinkedHashMap();
/* 38 */            this.f14149e = new C2234tx(this, 2);
/* 40 */            linkedHashMap.putAll(map);
                }

                /* JADX INFO: renamed from: a */
                public static Bundle m6895a(n62 n62Var) {
/* 1 */             LinkedHashMap linkedHashMap = n62Var.f14146b;
/* 3 */             LinkedHashMap linkedHashMap2 = n62Var.f14145a;
/* 13 */            Iterator it = oc1.m7134h(linkedHashMap).entrySet().iterator();
                    while (true) {
/* 22 */                int i = 0;
/* 23 */                if (!it.hasNext()) {
/* 127 */                   Set<String> setKeySet = linkedHashMap2.keySet();
/* 137 */                   ArrayList arrayList = new ArrayList(setKeySet.size());
/* 146 */                   ArrayList arrayList2 = new ArrayList(arrayList.size());
/* 157 */                   for (String str : setKeySet) {
/* 165 */                       arrayList.add(str);
/* 172 */                       arrayList2.add(linkedHashMap2.get(str));
                            }
/* 190 */                   Pair[] pairArr = {new Pair("keys", arrayList), new Pair("values", arrayList2)};
/* 197 */                   Bundle bundle = new Bundle(2);
/* 200 */                   while (i < 2) {
/* 202 */                       Pair pair = pairArr[i];
/* 206 */                       String str2 = (String) pair.f12908a;
/* 208 */                       Object obj = pair.f12909b;
/* 210 */                       if (obj == null) {
/* 212 */                           bundle.putString(str2, null);
                                } else if (obj instanceof Boolean) {
/* 227 */                           bundle.putBoolean(str2, ((Boolean) obj).booleanValue());
                                } else if (obj instanceof Byte) {
/* 242 */                           bundle.putByte(str2, ((Number) obj).byteValue());
                                } else if (obj instanceof Character) {
/* 257 */                           bundle.putChar(str2, ((Character) obj).charValue());
                                } else if (obj instanceof Double) {
/* 272 */                           bundle.putDouble(str2, ((Number) obj).doubleValue());
                                } else if (obj instanceof Float) {
/* 287 */                           bundle.putFloat(str2, ((Number) obj).floatValue());
                                } else if (obj instanceof Integer) {
/* 302 */                           bundle.putInt(str2, ((Number) obj).intValue());
                                } else if (obj instanceof Long) {
/* 317 */                           bundle.putLong(str2, ((Number) obj).longValue());
                                } else if (obj instanceof Short) {
/* 332 */                           bundle.putShort(str2, ((Number) obj).shortValue());
                                } else if (obj instanceof Bundle) {
/* 343 */                           bundle.putBundle(str2, (Bundle) obj);
                                } else if (obj instanceof CharSequence) {
/* 354 */                           bundle.putCharSequence(str2, (CharSequence) obj);
                                } else if (obj instanceof Parcelable) {
/* 365 */                           bundle.putParcelable(str2, (Parcelable) obj);
                                } else if (obj instanceof boolean[]) {
/* 376 */                           bundle.putBooleanArray(str2, (boolean[]) obj);
                                } else if (obj instanceof byte[]) {
/* 387 */                           bundle.putByteArray(str2, (byte[]) obj);
                                } else if (obj instanceof char[]) {
/* 398 */                           bundle.putCharArray(str2, (char[]) obj);
                                } else if (obj instanceof double[]) {
/* 409 */                           bundle.putDoubleArray(str2, (double[]) obj);
                                } else if (obj instanceof float[]) {
/* 420 */                           bundle.putFloatArray(str2, (float[]) obj);
                                } else if (obj instanceof int[]) {
/* 431 */                           bundle.putIntArray(str2, (int[]) obj);
                                } else if (obj instanceof long[]) {
/* 442 */                           bundle.putLongArray(str2, (long[]) obj);
                                } else if (obj instanceof short[]) {
/* 453 */                           bundle.putShortArray(str2, (short[]) obj);
                                } else if (obj instanceof Object[]) {
/* 470 */                           Class<?> componentType = obj.getClass().getComponentType();
/* 474 */                           componentType.getClass();
/* 483 */                           if (Parcelable.class.isAssignableFrom(componentType)) {
/* 487 */                               bundle.putParcelableArray(str2, (Parcelable[]) obj);
                                    } else if (String.class.isAssignableFrom(componentType)) {
/* 501 */                               bundle.putStringArray(str2, (String[]) obj);
                                    } else if (CharSequence.class.isAssignableFrom(componentType)) {
/* 515 */                               bundle.putCharSequenceArray(str2, (CharSequence[]) obj);
                                    } else {
/* 525 */                               if (!Serializable.class.isAssignableFrom(componentType)) {
/* 539 */                                   s80.m8421b(34, "Illegal value array type ", componentType.getCanonicalName(), " for key \"", str2);
/* 21 */                                    return null;
                                        }
/* 529 */                               bundle.putSerializable(str2, (Serializable) obj);
                                    }
                                } else if (obj instanceof Serializable) {
/* 549 */                           bundle.putSerializable(str2, (Serializable) obj);
                                } else if (obj instanceof IBinder) {
/* 559 */                           bundle.putBinder(str2, (IBinder) obj);
                                } else if (obj instanceof Size) {
/* 569 */                           C0884el.m3486a(bundle, str2, (Size) obj);
                                } else {
/* 575 */                           if (!(obj instanceof SizeF)) {
/* 596 */                               s80.m8421b(34, "Illegal value type ", obj.getClass().getCanonicalName(), " for key \"", str2);
/* 21 */                                return null;
                                    }
/* 579 */                           C0884el.m3487b(bundle, str2, (SizeF) obj);
                                }
/* 582 */                       i++;
                            }
/* 600 */                   return bundle;
                        }
/* 29 */                Map.Entry entry = (Map.Entry) it.next();
/* 35 */                String str3 = (String) entry.getKey();
/* 43 */                Object objMo671a = ((w62) entry.getValue()).mo671a();
/* 47 */                str3.getClass();
/* 50 */                if (objMo671a != null) {
                            while (true) {
/* 55 */                        if (i >= 29) {
/* 123 */                           f42.m3662r(objMo671a.getClass(), "Can't put value with type ", " into saved state");
/* 21 */                            return null;
                                }
/* 59 */                        Class cls = f14144f[i];
/* 61 */                        cls.getClass();
/* 68 */                        if (cls.isInstance(objMo671a)) {
                                    break;
                                }
/* 112 */                       i++;
                            }
                        }
/* 72 */                Object obj2 = n62Var.f14147c.get(str3);
/* 83 */                rk1 rk1Var = obj2 instanceof rk1 ? (rk1) obj2 : null;
/* 84 */                if (rk1Var != null) {
/* 86 */                    rk1Var.mo124j(objMo671a);
                        } else {
/* 90 */                    linkedHashMap2.put(str3, objMo671a);
                        }
/* 99 */                rg2 rg2Var = (rg2) n62Var.f14148d.get(str3);
/* 101 */               if (rg2Var != null) {
/* 104 */                   if (objMo671a == null) {
/* 106 */                       objMo671a = jb1.f12171c;
                            }
/* 108 */                   rg2Var.m8158b(null, objMo671a);
                        }
                    }
                }

/* 43 */        public n62() {
/* 45 */            this.f14145a = new LinkedHashMap();
/* 46 */            this.f14146b = new LinkedHashMap();
/* 47 */            this.f14147c = new LinkedHashMap();
/* 48 */            this.f14148d = new LinkedHashMap();
/* 49 */            this.f14149e = new C2234tx(this, 2);
                }
            }
