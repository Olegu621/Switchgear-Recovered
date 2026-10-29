            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class tg2 {

                /* JADX INFO: renamed from: a */
                public AbstractC1812k f17089a;

                /* JADX INFO: renamed from: b */
                public tg2 f17090b;

                /* JADX INFO: renamed from: c */
                public q50 f17091c;

                /* JADX INFO: renamed from: d */
                public ng2 f17092d;

                /* JADX INFO: renamed from: a */
                public final synchronized ng2 m8788a() {
                    ng2 ng2VarM7724j;
                    try {
/* 4 */                 if (this.f17092d == null && this.f17091c != null) {
/* 10 */                    tg2 tg2Var = this.f17090b;
/* 22 */                    ng2 ng2VarM8788a = tg2Var != null ? tg2Var.m8788a() : null;
/* 23 */                    AbstractC1812k abstractC1812k = this.f17089a;
/* 25 */                    if (abstractC1812k != null) {
/* 27 */                        q50 q50Var = this.f17091c;
/* 29 */                        q50Var.getClass();
/* 32 */                        ng2VarM7724j = q50Var.m7724j(abstractC1812k, ng2VarM8788a);
                            } else {
/* 37 */                        ng2VarM7724j = null;
                            }
/* 38 */                    this.f17092d = ng2VarM7724j;
/* 40 */                    this.f17089a = null;
/* 42 */                    this.f17090b = null;
/* 44 */                    this.f17091c = null;
                        }
                    } catch (Throwable th) {
/* 51 */                throw th;
                    }
/* 46 */            return this.f17092d;
                }
            }
