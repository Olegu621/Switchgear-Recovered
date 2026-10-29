            package p000;

            import java.io.File;
            import java.util.ArrayDeque;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class zh0 extends AbstractC1909m {

                /* JADX INFO: renamed from: c */
                public final ArrayDeque f20147c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ bi0 f20148d;

                public zh0(bi0 bi0Var) {
/* 4 */             this.f20148d = bi0Var;
/* 8 */             ArrayDeque arrayDeque = new ArrayDeque();
/* 11 */            this.f20147c = arrayDeque;
/* 13 */            File file = bi0Var.f2433a;
/* 19 */            if (file.isDirectory()) {
/* 25 */                arrayDeque.push(m10354b(file));
                    } else if (!file.isFile()) {
/* 48 */                this.f13539a = 2;
                    } else {
/* 37 */                file.getClass();
/* 43 */                arrayDeque.push(new xh0(file));
                    }
                }

                @Override // p000.AbstractC1909m
                /* JADX INFO: renamed from: a */
                public final void mo66a() {
                    File file;
                    while (true) {
/* 1 */                 ArrayDeque arrayDeque = this.f20147c;
/* 7 */                 ai0 ai0Var = (ai0) arrayDeque.peek();
/* 9 */                 if (ai0Var == null) {
/* 11 */                    file = null;
                            break;
                        }
/* 13 */                File fileMo290a = ai0Var.mo290a();
/* 17 */                if (fileMo290a == null) {
/* 19 */                    arrayDeque.pop();
                        } else {
/* 29 */                    if (fileMo290a.equals(ai0Var.f289a) || !fileMo290a.isDirectory() || arrayDeque.size() >= this.f20148d.f2438f) {
/* 56 */                        file = fileMo290a;
                                break;
                            }
/* 52 */                    arrayDeque.push(m10354b(fileMo290a));
                        }
                    }
/* 57 */            if (file == null) {
/* 66 */                this.f13539a = 2;
                    } else {
/* 59 */                this.f13540b = file;
/* 62 */                this.f13539a = 1;
                    }
                }

                /* JADX INFO: renamed from: b */
                public final vh0 m10354b(File file) {
/* 5 */             int iOrdinal = this.f20148d.f2434b.ordinal();
/* 9 */             if (iOrdinal == 0) {
/* 27 */                return new yh0(this, file);
                    }
/* 12 */            if (iOrdinal == 1) {
/* 16 */                return new wh0(this, file);
                    }
/* 20 */            ds0.m3187b();
/* 23 */            return null;
                }
            }
