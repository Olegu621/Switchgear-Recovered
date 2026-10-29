            package p000;

            import java.util.Collections;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.Set;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class a70 {

                /* JADX INFO: renamed from: a */
                public final String f106a;

                /* JADX INFO: renamed from: b */
                public final gr0 f107b;

                public a70(Set set, gr0 gr0Var) {
/* 8 */             this.f106a = m92b(set);
/* 10 */            this.f107b = gr0Var;
                }

                /* JADX INFO: renamed from: b */
                public static String m92b(Set set) {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 6 */             Iterator it = set.iterator();
/* 14 */            while (it.hasNext()) {
/* 20 */                C2549zf c2549zf = (C2549zf) it.next();
/* 24 */                sb.append(c2549zf.f20129a);
/* 29 */                sb.append('/');
/* 34 */                sb.append(c2549zf.f20130b);
/* 41 */                if (it.hasNext()) {
/* 45 */                    sb.append(' ');
                        }
                    }
/* 49 */            return sb.toString();
                }

                /* JADX INFO: renamed from: a */
                public final String m93a() {
                    Set setUnmodifiableSet;
                    Set setUnmodifiableSet2;
/* 1 */             gr0 gr0Var = this.f107b;
                    synchronized (((HashSet) gr0Var.f8789a)) {
/* 12 */                setUnmodifiableSet = Collections.unmodifiableSet((HashSet) gr0Var.f8789a);
                    }
/* 17 */            boolean zIsEmpty = setUnmodifiableSet.isEmpty();
/* 21 */            String str = this.f106a;
/* 23 */            if (zIsEmpty) {
/* 25 */                return str;
                    }
/* 28 */            StringBuilder sb = new StringBuilder();
/* 31 */            sb.append(str);
/* 36 */            sb.append(' ');
                    synchronized (((HashSet) gr0Var.f8789a)) {
/* 48 */                setUnmodifiableSet2 = Collections.unmodifiableSet((HashSet) gr0Var.f8789a);
                    }
/* 57 */            sb.append(m92b(setUnmodifiableSet2));
/* 60 */            return sb.toString();
                }
            }
