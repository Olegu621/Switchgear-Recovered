            package p000;

            import java.nio.ByteBuffer;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class qs2 {

                /* JADX INFO: renamed from: d */
                public static final ThreadLocal f15731d = new ThreadLocal();

                /* JADX INFO: renamed from: a */
                public final int f15732a;

                /* JADX INFO: renamed from: b */
                public final ra2 f15733b;

                /* JADX INFO: renamed from: c */
                public volatile int f15734c = 0;

                public qs2(ra2 ra2Var, int i) {
/* 7 */             this.f15733b = ra2Var;
/* 9 */             this.f15732a = i;
                }

                /* JADX INFO: renamed from: a */
                public final int m8009a(int i) {
/* 1 */             mi1 mi1VarM8010b = m8010b();
/* 7 */             int iM8126a = mi1VarM8010b.m8126a(16);
/* 11 */            if (iM8126a == 0) {
/* 35 */                return 0;
                    }
/* 15 */            ByteBuffer byteBuffer = (ByteBuffer) mi1VarM8010b.f15965d;
/* 19 */            int i2 = iM8126a + mi1VarM8010b.f15962a;
/* 30 */            return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
                }

                /* JADX INFO: renamed from: b */
                public final mi1 m8010b() {
/* 1 */             ThreadLocal threadLocal = f15731d;
/* 7 */             mi1 mi1Var = (mi1) threadLocal.get();
/* 9 */             if (mi1Var == null) {
/* 13 */                mi1Var = new mi1();
/* 16 */                threadLocal.set(mi1Var);
                    }
/* 23 */            ni1 ni1Var = (ni1) this.f15733b.f15955a;
/* 26 */            int iM8126a = ni1Var.m8126a(6);
/* 30 */            if (iM8126a != 0) {
/* 34 */                int i = iM8126a + ni1Var.f15962a;
/* 50 */                int i2 = (this.f15732a * 4) + ((ByteBuffer) ni1Var.f15965d).getInt(i) + i + 4;
/* 59 */                int i3 = ((ByteBuffer) ni1Var.f15965d).getInt(i2) + i2;
/* 62 */                ByteBuffer byteBuffer = (ByteBuffer) ni1Var.f15965d;
/* 64 */                mi1Var.f15965d = byteBuffer;
/* 66 */                if (byteBuffer != null) {
/* 68 */                    mi1Var.f15962a = i3;
/* 74 */                    int i4 = i3 - byteBuffer.getInt(i3);
/* 75 */                    mi1Var.f15963b = i4;
/* 85 */                    mi1Var.f15964c = ((ByteBuffer) mi1Var.f15965d).getShort(i4);
/* 87 */                    return mi1Var;
                        }
/* 89 */                mi1Var.f15962a = 0;
/* 91 */                mi1Var.f15963b = 0;
/* 93 */                mi1Var.f15964c = 0;
                    }
/* 95 */            return mi1Var;
                }

                public final String toString() {
                    int i;
/* 3 */             StringBuilder sb = new StringBuilder();
/* 10 */            sb.append(super.toString());
/* 15 */            sb.append(", id:");
/* 18 */            mi1 mi1VarM8010b = m8010b();
/* 23 */            int iM8126a = mi1VarM8010b.m8126a(4);
/* 47 */            sb.append(Integer.toHexString(iM8126a != 0 ? ((ByteBuffer) mi1VarM8010b.f15965d).getInt(iM8126a + mi1VarM8010b.f15962a) : 0));
/* 52 */            sb.append(", codepoints:");
/* 55 */            mi1 mi1VarM8010b2 = m8010b();
/* 61 */            int iM8126a2 = mi1VarM8010b2.m8126a(16);
/* 65 */            if (iM8126a2 != 0) {
/* 69 */                int i2 = iM8126a2 + mi1VarM8010b2.f15962a;
/* 83 */                i = ((ByteBuffer) mi1VarM8010b2.f15965d).getInt(((ByteBuffer) mi1VarM8010b2.f15965d).getInt(i2) + i2);
                    } else {
/* 88 */                i = 0;
                    }
/* 89 */            for (int i3 = 0; i3 < i; i3++) {
/* 99 */                sb.append(Integer.toHexString(m8009a(i3)));
/* 104 */               sb.append(" ");
                    }
/* 110 */           return sb.toString();
                }
            }
