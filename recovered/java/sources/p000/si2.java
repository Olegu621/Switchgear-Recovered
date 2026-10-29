            package p000;

            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class si2 implements qi2 {

                /* JADX INFO: renamed from: a */
                public volatile qi2 f16647a;

                /* JADX INFO: renamed from: b */
                public volatile boolean f16648b;

                /* JADX INFO: renamed from: c */
                public Object f16649c;

                @Override // p000.qi2
                public final Object get() {
/* 3 */             if (!this.f16648b) {
                        synchronized (this) {
                            try {
/* 8 */                         if (!this.f16648b) {
/* 10 */                            qi2 qi2Var = this.f16647a;
/* 12 */                            Objects.requireNonNull(qi2Var);
/* 15 */                            Object obj = qi2Var.get();
/* 19 */                            this.f16649c = obj;
/* 22 */                            this.f16648b = true;
/* 25 */                            this.f16647a = null;
/* 28 */                            return obj;
                                }
                            } catch (Throwable th) {
/* 34 */                        throw th;
                            }
                        }
                    }
/* 35 */            return this.f16649c;
                }

                public final String toString() {
/* 1 */             Object string = this.f16647a;
/* 3 */             if (string == null) {
/* 7 */                 String strValueOf = String.valueOf(this.f16649c);
/* 19 */                StringBuilder sb = new StringBuilder(strValueOf.length() + 25);
/* 24 */                sb.append("<supplier that returned ");
/* 27 */                sb.append(strValueOf);
/* 32 */                sb.append(">");
/* 35 */                string = sb.toString();
                    }
/* 39 */            String strValueOf2 = String.valueOf(string);
/* 51 */            StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 19);
/* 56 */            sb2.append("Suppliers.memoize(");
/* 59 */            sb2.append(strValueOf2);
/* 64 */            sb2.append(")");
/* 67 */            return sb2.toString();
                }
            }
