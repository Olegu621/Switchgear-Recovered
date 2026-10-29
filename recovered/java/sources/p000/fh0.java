            package p000;

            import io.flutter.plugin.editing.FlutterTextUtils;
            import io.sentry.C1697u2;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.Map;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 15 */    public final class fh0 {

                /* JADX INFO: renamed from: c */
                public static final /* synthetic */ int f8213c = 0;

                /* JADX INFO: renamed from: a */
                public final df2 f8214a = df2.m3047f();

                /* JADX INFO: renamed from: b */
                public boolean f8215b;

                static {
/* 4 */             new fh0(0);
                }

                public fh0(int i) {
/* 10 */            m3763a();
/* 13 */            m3763a();
                }

                /* JADX INFO: renamed from: b */
                public static void m3762b(C1905lw c1905lw, y83 y83Var, int i, Object obj) {
/* 3 */             if (y83Var == y83.f19522d) {
/* 8 */                 c1905lw.m6545B(i, 3);
/* 11 */                ((AbstractC2350x) obj).mo8857b(c1905lw);
/* 15 */                c1905lw.m6545B(i, 4);
                    }
/* 21 */            c1905lw.m6545B(i, y83Var.f19526b);
                    switch (y83Var.ordinal()) {
                        case 0:
/* 249 */                   c1905lw.m6565u(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                            break;
                        case 1:
/* 235 */                   c1905lw.m6563s(Float.floatToRawIntBits(((Float) obj).floatValue()));
                            break;
                        case 2:
/* 221 */                   c1905lw.m6549F(((Long) obj).longValue());
                            break;
                        case 3:
/* 211 */                   c1905lw.m6549F(((Long) obj).longValue());
                            break;
                        case 4:
/* 201 */                   c1905lw.m6567w(((Integer) obj).intValue());
                            break;
                        case 5:
/* 191 */                   c1905lw.m6565u(((Long) obj).longValue());
                            break;
                        case 6:
/* 181 */                   c1905lw.m6563s(((Integer) obj).intValue());
                            break;
                        case 7:
/* 171 */                   c1905lw.m6557m(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                            break;
                        case 8:
/* 150 */                   if (!(obj instanceof C2259ul)) {
/* 160 */                       c1905lw.m6544A((String) obj);
                            } else {
/* 154 */                       c1905lw.m6561q((C2259ul) obj);
                            }
                            break;
                        case 9:
/* 144 */                   ((AbstractC2350x) obj).mo8857b(c1905lw);
                            break;
                        case 10:
/* 125 */                   AbstractC2350x abstractC2350x = (AbstractC2350x) obj;
/* 135 */                   c1905lw.m6547D(((tq0) abstractC2350x).mo8856a(null));
/* 138 */                   abstractC2350x.mo8857b(c1905lw);
                            break;
                        case 11:
/* 106 */                   if (!(obj instanceof C2259ul)) {
/* 114 */                       byte[] bArr = (byte[]) obj;
/* 116 */                       int length = bArr.length;
/* 117 */                       c1905lw.m6547D(length);
/* 121 */                       c1905lw.m6558n(bArr, 0, length);
                            } else {
/* 110 */                       c1905lw.m6561q((C2259ul) obj);
                            }
                            break;
                        case 12:
/* 100 */                   c1905lw.m6547D(((Integer) obj).intValue());
                            break;
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 90 */                    c1905lw.m6567w(((Integer) obj).intValue());
                            break;
                        case 14:
/* 80 */                    c1905lw.m6563s(((Integer) obj).intValue());
                            break;
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 70 */                    c1905lw.m6565u(((Long) obj).longValue());
                            break;
                        case 16:
/* 51 */                    int iIntValue = ((Integer) obj).intValue();
/* 60 */                    c1905lw.m6547D((iIntValue >> 31) ^ (iIntValue << 1));
                            break;
                        case 17:
/* 34 */                    long jLongValue = ((Long) obj).longValue();
/* 45 */                    c1905lw.m6549F((jLongValue >> 63) ^ (jLongValue << 1));
                            break;
                    }
                }

                /* JADX INFO: renamed from: a */
                public final void m3763a() {
/* 3 */             if (this.f8215b) {
/* 5 */                 return;
                    }
/* 6 */             df2 df2Var = this.f8214a;
/* 10 */            int size = df2Var.f7161a.size();
/* 16 */            for (int i = 0; i < size; i++) {
/* 18 */                Map.Entry entryM3050c = df2Var.m3050c(i);
/* 28 */                if (entryM3050c.getValue() instanceof tq0) {
/* 34 */                    tq0 tq0Var = (tq0) entryM3050c.getValue();
/* 36 */                    tq0Var.getClass();
/* 39 */                    cz1 cz1Var = cz1.f6940c;
/* 41 */                    cz1Var.getClass();
/* 52 */                    cz1Var.m2900a(tq0Var.getClass()).mo4492b(tq0Var);
/* 55 */                    tq0Var.m8859h();
                        }
                    }
/* 63 */            if (!df2Var.f7163c) {
/* 71 */                if (df2Var.f7161a.size() > 0) {
/* 113 */                   df2Var.m3050c(0).getKey().getClass();
/* 116 */                   C1697u2.m5431g();
/* 119 */                   return;
                        } else {
/* 77 */                    Iterator it = df2Var.m3051d().iterator();
/* 85 */                    if (it.hasNext()) {
/* 98 */                        ((Map.Entry) it.next()).getKey().getClass();
/* 101 */                       C1697u2.m5431g();
/* 104 */                       return;
                            }
                        }
                    }
/* 123 */           if (!df2Var.f7163c) {
/* 142 */               df2Var.f7162b = df2Var.f7162b.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(df2Var.f7162b);
/* 161 */               df2Var.f7165e = df2Var.f7165e.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(df2Var.f7165e);
/* 163 */               df2Var.f7163c = true;
                    }
/* 165 */           this.f8215b = true;
                }

                public final Object clone() {
/* 3 */             fh0 fh0Var = new fh0();
/* 6 */             df2 df2Var = this.f8214a;
/* 15 */            if (df2Var.f7161a.size() > 0) {
/* 53 */                Map.Entry entryM3050c = df2Var.m3050c(0);
/* 61 */                if (entryM3050c.getKey() != null) {
/* 63 */                    C1697u2.m5431g();
/* 14 */                    return null;
                        }
/* 67 */                entryM3050c.getValue();
/* 70 */                throw null;
                    }
/* 21 */            Iterator it = df2Var.m3051d().iterator();
/* 29 */            if (!it.hasNext()) {
/* 31 */                return fh0Var;
                    }
/* 36 */            Map.Entry entry = (Map.Entry) it.next();
/* 42 */            if (entry.getKey() != null) {
/* 44 */                C1697u2.m5431g();
/* 14 */                return null;
                    }
/* 48 */            entry.getValue();
/* 51 */            throw null;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof fh0) {
/* 17 */                return this.f8214a.equals(((fh0) obj).f8214a);
                    }
/* 9 */             return false;
                }

                public final int hashCode() {
/* 3 */             return this.f8214a.hashCode();
                }

/* 16 */        public fh0() {
                }
            }
