            package com.appsflyer.internal;

            import android.graphics.drawable.Drawable;
            import android.os.SystemClock;
            import android.text.TextUtils;
            import android.view.ViewConfiguration;
            import java.lang.reflect.Method;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.Map;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 41 */    public final class AFg1dSDK {
                private StringBuilder getRevenue = new StringBuilder();
                private final List<AFa1zSDK> getCurrencyIso4217Code = new ArrayList();
                private final String getMonetizationNetwork = null;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public enum AFa1zSDK {
                    EMPTY_ARRAY,
                    NONEMPTY_ARRAY,
                    EMPTY_OBJECT,
                    DANGLING_KEY,
                    NONEMPTY_OBJECT,
                    NULL
                }

                private void getMediationNetwork() throws AFg1mSDK {
/* 7 */             if (this.getCurrencyIso4217Code.isEmpty()) {
/* 73 */                return;
                    }
/* 10 */            AFa1zSDK currencyIso4217Code = getCurrencyIso4217Code();
/* 16 */            if (currencyIso4217Code == AFa1zSDK.EMPTY_ARRAY) {
/* 18 */                AFa1zSDK aFa1zSDK = AFa1zSDK.NONEMPTY_ARRAY;
/* 20 */                List<AFa1zSDK> list = this.getCurrencyIso4217Code;
/* 28 */                list.set(list.size() - 1, aFa1zSDK);
                    } else {
/* 34 */                if (currencyIso4217Code == AFa1zSDK.NONEMPTY_ARRAY) {
/* 40 */                    this.getRevenue.append(',');
/* 43 */                    return;
                        }
/* 46 */                if (currencyIso4217Code != AFa1zSDK.DANGLING_KEY) {
/* 71 */                    if (currencyIso4217Code != AFa1zSDK.NULL) {
/* 81 */                        throw new AFg1mSDK("Nesting problem");
                            }
                        } else {
/* 52 */                    this.getRevenue.append(":");
/* 55 */                    AFa1zSDK aFa1zSDK2 = AFa1zSDK.NONEMPTY_OBJECT;
/* 57 */                    List<AFa1zSDK> list2 = this.getCurrencyIso4217Code;
/* 65 */                    list2.set(list2.size() - 1, aFa1zSDK2);
                        }
                    }
                }

                public final void AFAdRevenueData(String str) {
/* 5 */             this.getRevenue.append("\"");
/* 8 */             int length = str.length();
/* 13 */            for (int i = 0; i < length; i++) {
/* 15 */                char cCharAt = str.charAt(i);
/* 21 */                if (cCharAt == '\f') {
/* 115 */                   this.getRevenue.append("\\f");
                        } else if (cCharAt == '\r') {
/* 107 */                   this.getRevenue.append("\\r");
                        } else if (cCharAt != '\"' && cCharAt != '/' && cCharAt != '\\') {
                            switch (cCharAt) {
                                case '\b':
/* 90 */                            this.getRevenue.append("\\b");
                                    break;
                                case '\t':
/* 82 */                            this.getRevenue.append("\\t");
                                    break;
                                case '\n':
/* 74 */                            this.getRevenue.append("\\n");
                                    break;
                                default:
/* 42 */                            StringBuilder sb = this.getRevenue;
/* 46 */                            if (cCharAt <= 31) {
/* 62 */                                sb.append(String.format("\\u%04x", Integer.valueOf(cCharAt)));
                                    } else {
/* 66 */                                sb.append(cCharAt);
                                    }
                                    break;
                            }
                        } else {
/* 94 */                    StringBuilder sb2 = this.getRevenue;
/* 96 */                    sb2.append('\\');
/* 99 */                    sb2.append(cCharAt);
                        }
                    }
/* 123 */           this.getRevenue.append("\"");
                }

                public final AFg1dSDK getCurrencyIso4217Code(Object obj) throws Throwable {
/* 14 */            if (this.getCurrencyIso4217Code.isEmpty()) {
/* 192 */               throw new AFg1mSDK("Nesting problem");
                    }
/* 52 */            if (((Class) AFa1hSDK.getRevenue(TextUtils.indexOf((CharSequence) HttpUrl.FRAGMENT_ENCODE_SET, '0', 0) + 324, (char) (Drawable.resolveOpacity(0, 0) + 31687), (ViewConfiguration.getTouchSlop() >> 8) + 36)).isInstance(obj)) {
                        try {
/* 54 */                    Object[] objArr = {this};
/* 58 */                    Map map = AFa1hSDK.f3072d;
/* 60 */                    Object declaredMethod = map.get(-811011778);
/* 64 */                    if (declaredMethod == null) {
/* 109 */                       declaredMethod = ((Class) AFa1hSDK.getRevenue((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 322, (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 31686), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 35)).getDeclaredMethod("getCurrencyIso4217Code", AFg1dSDK.class);
/* 113 */                       map.put(-811011778, declaredMethod);
                            }
/* 118 */                   ((Method) declaredMethod).invoke(obj, objArr);
/* 121 */                   return this;
                        } catch (Throwable th) {
/* 123 */                   Throwable cause = th.getCause();
/* 127 */                   if (cause != null) {
/* 129 */                       throw cause;
                            }
/* 130 */                   throw th;
                        }
                    }
/* 133 */           if (obj instanceof AFg1gSDK) {
/* 137 */               ((AFg1gSDK) obj).getCurrencyIso4217Code(this);
/* 140 */               return this;
                    }
/* 141 */           getMediationNetwork();
/* 144 */           if (obj == null || (obj instanceof Boolean) || obj == AFg1gSDK.getRevenue) {
/* 181 */               this.getRevenue.append(obj);
/* 184 */               return this;
                    }
/* 157 */           if (obj instanceof Number) {
/* 167 */               this.getRevenue.append(AFg1gSDK.getCurrencyIso4217Code((Number) obj));
/* 170 */               return this;
                    }
/* 175 */           AFAdRevenueData(obj.toString());
/* 178 */           return this;
                }

                public final void getMonetizationNetwork() throws AFg1mSDK {
/* 1 */             AFa1zSDK currencyIso4217Code = getCurrencyIso4217Code();
/* 7 */             if (currencyIso4217Code == AFa1zSDK.NONEMPTY_OBJECT) {
/* 13 */                this.getRevenue.append(',');
                    } else if (currencyIso4217Code != AFa1zSDK.EMPTY_OBJECT) {
/* 42 */                throw new AFg1mSDK("Nesting problem");
                    }
/* 21 */            AFa1zSDK aFa1zSDK = AFa1zSDK.DANGLING_KEY;
/* 23 */            List<AFa1zSDK> list = this.getCurrencyIso4217Code;
/* 31 */            list.set(list.size() - 1, aFa1zSDK);
                }

                public final String toString() {
/* 7 */             if (this.getRevenue.length() == 0) {
/* 9 */                 return null;
                    }
/* 13 */            return this.getRevenue.toString();
                }

/* 42 */        public final AFg1dSDK getMonetizationNetwork(AFa1zSDK aFa1zSDK, AFa1zSDK aFa1zSDK2, String str) throws AFg1mSDK {
/* 43 */            AFa1zSDK currencyIso4217Code = getCurrencyIso4217Code();
                    if (currencyIso4217Code != aFa1zSDK2 && currencyIso4217Code != aFa1zSDK) {
/* 44 */                throw new AFg1mSDK("Nesting problem");
                    }
/* 45 */            List<AFa1zSDK> list = this.getCurrencyIso4217Code;
                    list.remove(list.size() - 1);
/* 46 */            this.getRevenue.append(str);
                    return this;
                }

/* 81 */        public final AFg1dSDK getMediationNetwork(AFa1zSDK aFa1zSDK, String str) throws AFg1mSDK {
/* 82 */            if (this.getCurrencyIso4217Code.isEmpty() && this.getRevenue.length() > 0) {
/* 83 */                throw new AFg1mSDK("Nesting problem: multiple top-level roots");
                    }
/* 84 */            getMediationNetwork();
/* 85 */            this.getCurrencyIso4217Code.add(aFa1zSDK);
/* 86 */            this.getRevenue.append(str);
                    return this;
                }

/* 192 */       private AFa1zSDK getCurrencyIso4217Code() throws AFg1mSDK {
/* 193 */           if (!this.getCurrencyIso4217Code.isEmpty()) {
/* 194 */               List<AFa1zSDK> list = this.getCurrencyIso4217Code;
                        return list.get(list.size() - 1);
                    }
/* 195 */           throw new AFg1mSDK("Nesting problem");
                }
            }
