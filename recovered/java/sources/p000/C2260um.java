            package p000;
            
            /* JADX INFO: renamed from: um */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2260um {

                /* JADX INFO: renamed from: a */
                public Object f17590a;

                /* JADX INFO: renamed from: b */
                public C2466xm f17591b;

                /* JADX INFO: renamed from: c */
                public u32 f17592c;

                /* JADX INFO: renamed from: d */
                public boolean f17593d;

                /* JADX INFO: renamed from: a */
                public final boolean m9040a(Object obj) {
/* 2 */             this.f17593d = true;
/* 4 */             C2466xm c2466xm = this.f17591b;
/* 6 */             boolean z = c2466xm != null && c2466xm.f19248b.m6327j(obj);
/* 18 */            if (z) {
/* 21 */                this.f17590a = null;
/* 23 */                this.f17591b = null;
/* 25 */                this.f17592c = null;
                    }
/* 27 */            return z;
                }

                /* JADX INFO: renamed from: b */
                public final boolean m9041b(Throwable th) {
/* 2 */             this.f17593d = true;
/* 4 */             C2466xm c2466xm = this.f17591b;
/* 6 */             boolean z = c2466xm != null && c2466xm.f19248b.mo6328k(th);
/* 18 */            if (z) {
/* 21 */                this.f17590a = null;
/* 23 */                this.f17591b = null;
/* 25 */                this.f17592c = null;
                    }
/* 27 */            return z;
                }

                public final void finalize() {
                    u32 u32Var;
/* 1 */             C2466xm c2466xm = this.f17591b;
/* 3 */             if (c2466xm != null && !c2466xm.f19248b.isDone()) {
/* 35 */                c2466xm.m9977b(new C0900f0("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f17590a, 1));
                    }
/* 40 */            if (this.f17593d || (u32Var = this.f17592c) == null) {
/* 50 */                return;
                    }
/* 47 */            u32Var.m6327j(null);
                }
            }
