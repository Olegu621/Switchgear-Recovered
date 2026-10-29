            package com.appsflyer.internal;

            import android.graphics.Color;
            import android.graphics.ImageFormat;
            import android.os.Process;
            import android.text.TextUtils;
            import android.view.View;
            import android.view.ViewConfiguration;
            import android.widget.ExpandableListView;
            import java.lang.reflect.Constructor;
            import java.lang.reflect.Method;
            import java.util.Collection;
            import java.util.LinkedHashMap;
            import java.util.Map;
            import okhttp3.HttpUrl;
            import org.json.JSONArray;
            import org.json.JSONObject;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 133 */   public final class AFg1gSDK {
                private final LinkedHashMap<String, Object> AFAdRevenueData;
                public static final Object getRevenue = new Object() { // from class: com.appsflyer.internal.AFg1gSDK.4
                    public final boolean equals(Object obj) {
                        return obj == this || obj == null;
                    }

                    public final int hashCode() {
/* 1 */                 return 0;
                    }

                    public final String toString() {
/* 1 */                 return "null";
                    }
                };
                private static final Double getCurrencyIso4217Code = Double.valueOf(-0.0d);

                private AFg1gSDK(Object obj) throws Throwable {
                    try {
/* 18 */                Map map = AFa1hSDK.f3072d;
/* 20 */                Object declaredMethod = map.get(1233250772);
/* 26 */                if (declaredMethod == null) {
/* 60 */                    declaredMethod = ((Class) AFa1hSDK.getRevenue((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 359, (char) (17849 - (ViewConfiguration.getScrollBarSize() >> 8)), Color.argb(0, 0, 0, 0) + 36)).getDeclaredMethod("AFAdRevenueData", null);
/* 64 */                    map.put(1233250772, declaredMethod);
                        }
/* 69 */                Object objInvoke = ((Method) declaredMethod).invoke(obj, null);
/* 75 */                if (objInvoke instanceof AFg1gSDK) {
/* 81 */                    this.AFAdRevenueData = ((AFg1gSDK) objInvoke).AFAdRevenueData;
/* 83 */                    return;
                        }
/* 87 */                Object[] objArr = {objInvoke, "AFJsonObject"};
/* 94 */                Object declaredMethod2 = map.get(-508700964);
/* 98 */                if (declaredMethod2 == null) {
/* 144 */                   declaredMethod2 = ((Class) AFa1hSDK.getRevenue((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 287, (char) ((-1) - TextUtils.lastIndexOf(HttpUrl.FRAGMENT_ENCODE_SET, '0', 0)), 36 - ExpandableListView.getPackedPositionType(0L))).getDeclaredMethod("getMonetizationNetwork", Object.class, String.class);
/* 148 */                   map.put(-508700964, declaredMethod2);
                        }
/* 159 */               throw ((Throwable) ((Method) declaredMethod2).invoke(null, objArr));
                    } catch (Throwable th) {
/* 161 */               Throwable cause = th.getCause();
/* 165 */               if (cause == null) {
/* 168 */                   throw th;
                        }
/* 167 */               throw cause;
                    }
                }

                public static String getCurrencyIso4217Code(Number number) throws Throwable {
/* 10 */            if (number == null) {
/* 134 */               throw new AFg1mSDK("Number must be non-null");
                    }
/* 12 */            double dDoubleValue = number.doubleValue();
                    try {
/* 20 */                Object[] objArr = {Double.valueOf(dDoubleValue)};
/* 24 */                Map map = AFa1hSDK.f3072d;
/* 26 */                Object declaredMethod = map.get(-1740817925);
/* 30 */                if (declaredMethod == null) {
/* 69 */                    declaredMethod = ((Class) AFa1hSDK.getRevenue(287 - TextUtils.indexOf(HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, 0), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 36 - (Process.myPid() >> 22))).getDeclaredMethod("AFAdRevenueData", Double.TYPE);
/* 73 */                    map.put(-1740817925, declaredMethod);
                        }
/* 85 */                ((Double) ((Method) declaredMethod).invoke(null, objArr)).getClass();
/* 94 */                if (number.equals(getCurrencyIso4217Code)) {
/* 96 */                    return "-0";
                        }
/* 99 */                long jLongValue = number.longValue();
                        return dDoubleValue == ((double) jLongValue) ? Long.toString(jLongValue) : number.toString();
                    } catch (Throwable th) {
/* 119 */               Throwable cause = th.getCause();
/* 123 */               if (cause != null) {
/* 125 */                   throw cause;
                        }
/* 126 */               throw th;
                    }
                }

                public static Object getMediationNetwork(Object obj) throws Throwable {
/* 22 */            if (obj == null) {
/* 24 */                return getRevenue;
                    }
/* 63 */            if (((Class) AFa1hSDK.getRevenue(View.combineMeasuredStates(0, 0) + 323, (char) (31688 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 36 - TextUtils.indexOf(HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, 0))).isInstance(obj) || (obj instanceof AFg1gSDK)) {
/* 69 */                return obj;
                    }
                    try {
/* 72 */                if (obj instanceof JSONArray) {
                            try {
/* 78 */                        Object[] objArr = {obj.toString()};
/* 82 */                        Map map = AFa1hSDK.f3072d;
/* 84 */                        Object declaredConstructor = map.get(1701394550);
/* 88 */                        if (declaredConstructor == null) {
/* 124 */                           declaredConstructor = ((Class) AFa1hSDK.getRevenue(322 - ExpandableListView.getPackedPositionChild(0L), (char) (31686 - ExpandableListView.getPackedPositionChild(0L)), 35 - TextUtils.indexOf((CharSequence) HttpUrl.FRAGMENT_ENCODE_SET, '0', 0))).getDeclaredConstructor(String.class);
/* 128 */                           map.put(1701394550, declaredConstructor);
                                }
/* 133 */                       obj = ((Constructor) declaredConstructor).newInstance(objArr);
/* 137 */                       return obj;
                            } catch (Throwable th) {
/* 139 */                       Throwable cause = th.getCause();
/* 143 */                       if (cause != null) {
/* 145 */                           throw cause;
                                }
/* 146 */                       throw th;
                            }
                        }
/* 149 */               if (obj instanceof JSONObject) {
/* 157 */                   return new AFg1gSDK(obj.toString());
                        }
                    } catch (AFg1mSDK unused) {
                    }
/* 167 */           if (obj.equals(getRevenue)) {
/* 406 */               return obj;
                    }
                    try {
/* 173 */               if (obj instanceof Collection) {
                            try {
/* 177 */                       Object[] objArr2 = {(Collection) obj};
/* 181 */                       Map map2 = AFa1hSDK.f3072d;
/* 183 */                       Object declaredConstructor2 = map2.get(1736765615);
/* 187 */                       if (declaredConstructor2 == null) {
/* 225 */                           declaredConstructor2 = ((Class) AFa1hSDK.getRevenue(323 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (31686 - ImageFormat.getBitsPerPixel(0)), 35 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))).getDeclaredConstructor(Collection.class);
/* 229 */                           map2.put(1736765615, declaredConstructor2);
                                }
/* 234 */                       return ((Constructor) declaredConstructor2).newInstance(objArr2);
                            } catch (Throwable th2) {
/* 240 */                       Throwable cause2 = th2.getCause();
/* 244 */                       if (cause2 != null) {
/* 246 */                           throw cause2;
                                }
/* 247 */                       throw th2;
                            }
                        }
/* 256 */               if (obj.getClass().isArray()) {
                            try {
/* 258 */                       Object[] objArr3 = {obj};
/* 262 */                       Map map3 = AFa1hSDK.f3072d;
/* 264 */                       Object declaredConstructor3 = map3.get(-3119068);
/* 268 */                       if (declaredConstructor3 == null) {
/* 308 */                           declaredConstructor3 = ((Class) AFa1hSDK.getRevenue((ViewConfiguration.getJumpTapTimeout() >> 16) + 323, (char) ((-16745529) - Color.rgb(0, 0, 0)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 36)).getDeclaredConstructor(Object.class);
/* 312 */                           map3.put(-3119068, declaredConstructor3);
                                }
/* 317 */                       return ((Constructor) declaredConstructor3).newInstance(objArr3);
                            } catch (Throwable th3) {
/* 323 */                       Throwable cause3 = th3.getCause();
/* 327 */                       if (cause3 != null) {
/* 329 */                           throw cause3;
                                }
/* 330 */                       throw th3;
                            }
                        }
/* 333 */               if (obj instanceof Map) {
/* 339 */                   return new AFg1gSDK((Map) obj);
                        }
/* 345 */               if ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) {
/* 406 */                   return obj;
                        }
/* 398 */               if (obj.getClass().getPackage().getName().startsWith("java.")) {
/* 400 */                   return obj.toString();
                        }
/* 405 */               return null;
                    } catch (Exception unused2) {
                    }
/* 405 */           return null;
                }

                public final AFg1gSDK getMonetizationNetwork(String str, Object obj) throws Throwable {
/* 8 */             if (obj == null) {
/* 12 */                this.AFAdRevenueData.remove(str);
/* 15 */                return this;
                    }
/* 18 */            if (obj instanceof Number) {
                        try {
/* 31 */                    Object[] objArr = {Double.valueOf(((Number) obj).doubleValue())};
/* 35 */                    Map map = AFa1hSDK.f3072d;
/* 37 */                    Object method = map.get(-1740817925);
/* 41 */                    if (method == null) {
/* 80 */                        method = ((Class) AFa1hSDK.getRevenue((ViewConfiguration.getScrollDefaultDelay() >> 16) + 287, (char) View.MeasureSpec.getMode(0), ExpandableListView.getPackedPositionGroup(0L) + 36)).getMethod("AFAdRevenueData", Double.TYPE);
/* 84 */                        map.put(-1740817925, method);
                            }
/* 96 */                    ((Double) ((Method) method).invoke(null, objArr)).getClass();
                        } catch (Throwable th) {
/* 101 */                   Throwable cause = th.getCause();
/* 105 */                   if (cause != null) {
/* 107 */                       throw cause;
                            }
/* 108 */                   throw th;
                        }
                    }
/* 109 */           LinkedHashMap<String, Object> linkedHashMap = this.AFAdRevenueData;
/* 111 */           if (str == null) {
/* 124 */               throw new AFg1mSDK("Names must be non-null");
                    }
/* 113 */           linkedHashMap.put(str, obj);
/* 116 */           return this;
                }

                public final String toString() {
                    try {
/* 3 */                 AFg1dSDK aFg1dSDK = new AFg1dSDK();
/* 6 */                 getCurrencyIso4217Code(aFg1dSDK);
/* 9 */                 return aFg1dSDK.toString();
                    } catch (AFg1mSDK unused) {
/* 14 */                return null;
                    }
                }

/* 134 */       public final void getCurrencyIso4217Code(AFg1dSDK aFg1dSDK) throws AFg1mSDK {
/* 135 */           aFg1dSDK.getMediationNetwork(AFg1dSDK.AFa1zSDK.EMPTY_OBJECT, "{");
                    for (Map.Entry<String, Object> entry : this.AFAdRevenueData.entrySet()) {
/* 137 */               String key = entry.getKey();
                        if (key != null) {
/* 138 */                   aFg1dSDK.getMonetizationNetwork();
/* 139 */                   aFg1dSDK.AFAdRevenueData(key);
/* 140 */                   aFg1dSDK.getCurrencyIso4217Code(entry.getValue());
                        } else {
/* 141 */                   throw new AFg1mSDK("Names must be non-null");
                        }
                    }
/* 142 */           aFg1dSDK.getMonetizationNetwork(AFg1dSDK.AFa1zSDK.EMPTY_OBJECT, AFg1dSDK.AFa1zSDK.NONEMPTY_OBJECT, "}");
                }

/* 168 */       public AFg1gSDK(Map map) {
/* 169 */           this();
                    for (Map.Entry entry : map.entrySet()) {
/* 171 */               String str = (String) entry.getKey();
                        if (str != null) {
/* 172 */                   this.AFAdRevenueData.put(str, getMediationNetwork(entry.getValue()));
                        } else {
/* 173 */                   C1951n4.m6868s("key == null");
                            throw null;
                        }
                    }
                }

/* 173 */       public AFg1gSDK() {
/* 175 */           this.AFAdRevenueData = new LinkedHashMap<>();
                }

                /* JADX WARN: Illegal instructions before constructor call */
/* 175 */       private AFg1gSDK(String str) throws Throwable {
                    try {
                        Object[] objArr = {str};
                        Map map = AFa1hSDK.f3072d;
/* 176 */               Object declaredConstructor = map.get(-1433104906);
                        if (declaredConstructor == null) {
                            declaredConstructor = ((Class) AFa1hSDK.getRevenue(359 - View.resolveSizeAndState(0, 0, 0), (char) (17849 - Color.green(0)), 36 - (ViewConfiguration.getWindowTouchSlop() >> 8))).getDeclaredConstructor(String.class);
/* 176 */                   map.put(-1433104906, declaredConstructor);
                        }
                        this(((Constructor) declaredConstructor).newInstance(objArr));
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
            }
