            package p000;

            import java.io.Serializable;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ri2 implements qi2, Serializable {

                /* JADX INFO: renamed from: a */
                public final qi2 f16082a;

                /* JADX INFO: renamed from: b */
                public volatile transient boolean f16083b;

                /* JADX INFO: renamed from: c */
                public transient Object f16084c;

                public ri2(qi2 qi2Var) {
/* 4 */             this.f16082a = qi2Var;
                }

                @Override // p000.qi2
                public final Object get() {
/* 3 */             if (!this.f16083b) {
                        synchronized (this) {
                            try {
/* 8 */                         if (!this.f16083b) {
/* 12 */                            Object obj = this.f16082a.get();
/* 16 */                            this.f16084c = obj;
/* 19 */                            this.f16083b = true;
/* 22 */                            return obj;
                                }
                            } catch (Throwable th) {
/* 28 */                        throw th;
                            }
                        }
                    }
/* 29 */            return this.f16084c;
                }

                public final String toString() {
                    Object string;
/* 3 */             if (this.f16083b) {
/* 7 */                 String strValueOf = String.valueOf(this.f16084c);
/* 19 */                StringBuilder sb = new StringBuilder(strValueOf.length() + 25);
/* 24 */                sb.append("<supplier that returned ");
/* 27 */                sb.append(strValueOf);
/* 32 */                sb.append(">");
/* 35 */                string = sb.toString();
                    } else {
/* 40 */                string = this.f16082a;
                    }
/* 42 */            String strValueOf2 = String.valueOf(string);
/* 54 */            StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 19);
/* 59 */            sb2.append("Suppliers.memoize(");
/* 62 */            sb2.append(strValueOf2);
/* 67 */            sb2.append(")");
/* 70 */            return sb2.toString();
                }
            }
