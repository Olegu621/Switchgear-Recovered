            package p000;

            import android.text.TextUtils;
            import android.util.Log;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class uh3 extends hk3 {

                /* JADX INFO: renamed from: U */
                public final sh3 f17530U;

                /* JADX INFO: renamed from: V */
                public final sh3 f17531V;

                /* JADX INFO: renamed from: W */
                public final sh3 f17532W;

                /* JADX INFO: renamed from: X */
                public final sh3 f17533X;

                /* JADX INFO: renamed from: Y */
                public final sh3 f17534Y;

                /* JADX INFO: renamed from: c */
                public char f17535c;

                /* JADX INFO: renamed from: d */
                public long f17536d;

                /* JADX INFO: renamed from: e */
                public String f17537e;

                /* JADX INFO: renamed from: f */
                public final sh3 f17538f;

                /* JADX INFO: renamed from: i */
                public final sh3 f17539i;

                /* JADX INFO: renamed from: v */
                public final sh3 f17540v;

                /* JADX INFO: renamed from: w */
                public final sh3 f17541w;

                public uh3(ij3 ij3Var) {
/* 1 */             super(ij3Var);
/* 5 */             this.f17535c = (char) 0;
/* 9 */             this.f17536d = -1L;
/* 17 */            this.f17538f = new sh3(this, 6, false, false);
/* 25 */            this.f17539i = new sh3(this, 6, true, false);
/* 32 */            this.f17540v = new sh3(this, 6, false, true);
/* 40 */            this.f17541w = new sh3(this, 5, false, false);
/* 47 */            this.f17530U = new sh3(this, 5, true, false);
/* 54 */            this.f17531V = new sh3(this, 5, false, true);
/* 62 */            this.f17532W = new sh3(this, 4, false, false);
/* 70 */            this.f17533X = new sh3(this, 3, false, false);
/* 78 */            this.f17534Y = new sh3(this, 2, false, false);
                }

                /* JADX INFO: renamed from: H */
                public static th3 m9013H(String str) {
/* 1 */             if (str == null) {
/* 3 */                 return null;
                    }
/* 7 */             return new th3(str);
                }

                /* JADX INFO: renamed from: K */
                public static String m9014K(boolean z, String str, Object obj, Object obj2, Object obj3) {
/* 1 */             String strM9015L = m9015L(obj, z);
/* 5 */             String strM9015L2 = m9015L(obj2, z);
/* 9 */             String strM9015L3 = m9015L(obj3, z);
/* 15 */            StringBuilder sb = new StringBuilder();
/* 18 */            String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
/* 20 */            if (str == null) {
/* 22 */                str = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 27 */            if (!TextUtils.isEmpty(str)) {
/* 29 */                sb.append(str);
/* 32 */                str2 = ": ";
                    }
/* 38 */            String str3 = ", ";
/* 40 */            if (!TextUtils.isEmpty(strM9015L)) {
/* 42 */                sb.append(str2);
/* 45 */                sb.append(strM9015L);
/* 38 */                str2 = ", ";
                    }
/* 53 */            if (TextUtils.isEmpty(strM9015L2)) {
/* 62 */                str3 = str2;
                    } else {
/* 55 */                sb.append(str2);
/* 58 */                sb.append(strM9015L2);
                    }
/* 67 */            if (!TextUtils.isEmpty(strM9015L3)) {
/* 69 */                sb.append(str3);
/* 72 */                sb.append(strM9015L3);
                    }
/* 75 */            return sb.toString();
                }

                /* JADX INFO: renamed from: L */
                public static String m9015L(Object obj, boolean z) {
                    int iLastIndexOf;
                    String className;
                    int iLastIndexOf2;
/* 1 */             String str = HttpUrl.FRAGMENT_ENCODE_SET;
/* 3 */             if (obj == null) {
/* 1 */                 return HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 8 */             if (obj instanceof Integer) {
/* 17 */                obj = Long.valueOf(((Integer) obj).intValue());
                    }
/* 27 */            if (obj instanceof Long) {
/* 29 */                if (!z) {
/* 31 */                    return obj.toString();
                        }
/* 37 */                Long l = (Long) obj;
/* 51 */                if (Math.abs(l.longValue()) < 100) {
/* 53 */                    return obj.toString();
                        }
/* 62 */                char cCharAt = obj.toString().charAt(0);
/* 74 */                String strValueOf = String.valueOf(Math.abs(l.longValue()));
/* 90 */                long jRound = Math.round(Math.pow(10.0d, strValueOf.length() - 1));
/* 106 */               long jRound2 = Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
/* 114 */               int length = String.valueOf(jRound).length();
/* 120 */               if (cCharAt == '-') {
/* 24 */                    str = "-";
                        }
/* 146 */               StringBuilder sb = new StringBuilder(str.length() + str.length() + length + 3 + String.valueOf(jRound2).length());
/* 149 */               sb.append(str);
/* 152 */               sb.append(jRound);
/* 157 */               sb.append("...");
/* 160 */               sb.append(str);
/* 163 */               sb.append(jRound2);
/* 166 */               return sb.toString();
                    }
/* 173 */           if (obj instanceof Boolean) {
/* 175 */               return obj.toString();
                    }
/* 182 */           if (!(obj instanceof Throwable)) {
/* 300 */               if (obj instanceof th3) {
/* 304 */                   return ((th3) obj).f17111a;
                        }
                        return z ? "-" : obj.toString();
                    }
/* 184 */           Throwable th = (Throwable) obj;
/* 203 */           StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
/* 208 */           String canonicalName = ij3.class.getCanonicalName();
/* 229 */           String strSubstring = (TextUtils.isEmpty(canonicalName) || (iLastIndexOf = canonicalName.lastIndexOf(46)) == -1) ? HttpUrl.FRAGMENT_ENCODE_SET : canonicalName.substring(0, iLastIndexOf);
/* 239 */           for (StackTraceElement stackTraceElement : th.getStackTrace()) {
/* 247 */               if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null) {
/* 279 */                   if (((TextUtils.isEmpty(className) || (iLastIndexOf2 = className.lastIndexOf(46)) == -1) ? HttpUrl.FRAGMENT_ENCODE_SET : className.substring(0, iLastIndexOf2)).equals(strSubstring)) {
/* 283 */                       sb2.append(": ");
/* 286 */                       sb2.append(stackTraceElement);
                                break;
                            }
                        }
                    }
/* 293 */           return sb2.toString();
                }

                @Override // p000.hk3
                /* JADX INFO: renamed from: A */
                public final boolean mo1364A() {
/* 1 */             return false;
                }

                /* JADX INFO: renamed from: D */
                public final sh3 m9016D() {
/* 1 */             return this.f17538f;
                }

                /* JADX INFO: renamed from: E */
                public final sh3 m9017E() {
/* 1 */             return this.f17541w;
                }

                /* JADX INFO: renamed from: F */
                public final sh3 m9018F() {
/* 1 */             return this.f17533X;
                }

                /* JADX INFO: renamed from: G */
                public final sh3 m9019G() {
/* 1 */             return this.f17534Y;
                }

                /* JADX INFO: renamed from: I */
                public final void m9020I(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
/* 1 */             if (!z && Log.isLoggable(m9021J(), i)) {
/* 22 */                Log.println(i, m9021J(), m9014K(false, str, obj, obj2, obj3));
                    }
/* 25 */            if (z2 || i < 5) {
/* 86 */                return;
                    }
/* 30 */            kb1.m6061n(str);
/* 37 */            bj3 bj3Var = ((ij3) this.f16749a).f9659i;
/* 40 */            if (bj3Var == null) {
/* 48 */                Log.println(6, m9021J(), "Scheduler not set. Not logging error/warn");
                    } else {
/* 54 */                if (!bj3Var.f9127b) {
/* 62 */                    Log.println(6, m9021J(), "Scheduler not initialized. Not logging error/warn");
/* 65 */                    return;
                        }
/* 68 */                if (i >= 9) {
/* 70 */                    i = 8;
                        }
/* 83 */                bj3Var.m1370I(new qh3(this, i, str, obj, obj2, obj3));
                    }
                }

                /* JADX INFO: renamed from: J */
                public final String m9021J() {
                    String str;
                    synchronized (this) {
                        try {
/* 4 */                     if (this.f17537e == null) {
/* 16 */                        ((ij3) ((ij3) this.f16749a).f9651d.f16749a).getClass();
/* 21 */                        this.f17537e = "FA";
                            }
/* 28 */                    kb1.m6061n(this.f17537e);
/* 31 */                    str = this.f17537e;
                        } catch (Throwable th) {
/* 36 */                    throw th;
                        }
                    }
/* 34 */            return str;
                }
            }
