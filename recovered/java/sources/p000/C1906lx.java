            package p000;

            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: renamed from: lx */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
/* 22 */    public final class C1906lx {

                /* JADX INFO: renamed from: a */
                public final Object f13511a;

                /* JADX INFO: renamed from: b */
                public final InterfaceC2560zq f13512b;

                /* JADX INFO: renamed from: c */
                public final Function1 f13513c;

                /* JADX INFO: renamed from: d */
                public final Object f13514d;

                /* JADX INFO: renamed from: e */
                public final Throwable f13515e;

                public /* synthetic */ C1906lx(Object obj, InterfaceC2560zq interfaceC2560zq, Function1 function1, Throwable th, int i) {
/* 20 */            this(obj, (i & 2) != 0 ? null : interfaceC2560zq, (i & 4) != 0 ? null : function1, (Object) null, (i & 16) != 0 ? null : th);
                }

                /* JADX INFO: renamed from: a */
                public static C1906lx m6571a(C1906lx c1906lx, InterfaceC2560zq interfaceC2560zq, Throwable th, int i) {
/* 1 */             Object obj = c1906lx.f13511a;
/* 5 */             if ((i & 2) != 0) {
/* 7 */                 interfaceC2560zq = c1906lx.f13512b;
                    }
/* 9 */             InterfaceC2560zq interfaceC2560zq2 = interfaceC2560zq;
/* 10 */            Function1 function1 = c1906lx.f13513c;
/* 12 */            Object obj2 = c1906lx.f13514d;
/* 16 */            if ((i & 16) != 0) {
/* 18 */                th = c1906lx.f13515e;
                    }
/* 23 */            return new C1906lx(obj, interfaceC2560zq2, function1, obj2, th);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof C1906lx)) {
/* 7 */                 return false;
                    }
/* 11 */            C1906lx c1906lx = (C1906lx) obj;
                    return Intrinsics.m6216a(this.f13511a, c1906lx.f13511a) && Intrinsics.m6216a(this.f13512b, c1906lx.f13512b) && Intrinsics.m6216a(this.f13513c, c1906lx.f13513c) && Intrinsics.m6216a(this.f13514d, c1906lx.f13514d) && Intrinsics.m6216a(this.f13515e, c1906lx.f13515e);
                }

                public final int hashCode() {
/* 2 */             Object obj = this.f13511a;
/* 12 */            int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
/* 14 */            InterfaceC2560zq interfaceC2560zq = this.f13512b;
/* 25 */            int iHashCode2 = (iHashCode + (interfaceC2560zq == null ? 0 : interfaceC2560zq.hashCode())) * 31;
/* 27 */            Function1 function1 = this.f13513c;
/* 38 */            int iHashCode3 = (iHashCode2 + (function1 == null ? 0 : function1.hashCode())) * 31;
/* 40 */            Object obj2 = this.f13514d;
/* 51 */            int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
/* 53 */            Throwable th = this.f13515e;
/* 62 */            return iHashCode4 + (th != null ? th.hashCode() : 0);
                }

                public final String toString() {
/* 58 */            return "CompletedContinuation(result=" + this.f13511a + ", cancelHandler=" + this.f13512b + ", onCancellation=" + this.f13513c + ", idempotentResume=" + this.f13514d + ", cancelCause=" + this.f13515e + ')';
                }

/* 23 */        public C1906lx(Object obj, InterfaceC2560zq interfaceC2560zq, Function1 function1, Object obj2, Throwable th) {
/* 25 */            this.f13511a = obj;
/* 26 */            this.f13512b = interfaceC2560zq;
/* 27 */            this.f13513c = function1;
/* 28 */            this.f13514d = obj2;
/* 29 */            this.f13515e = th;
                }
            }
