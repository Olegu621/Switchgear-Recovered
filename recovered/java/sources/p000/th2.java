            package p000;

            import kotlin.collections.C1839a;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.KSerializer;
            import kotlinx.serialization.descriptors.SerialDescriptor;
            import kotlinx.serialization.encoding.Decoder;
            import kotlinx.serialization.encoding.Encoder;
            import kotlinx.serialization.json.AbstractC1858b;
            import kotlinx.serialization.json.C1857a;
            import kotlinx.serialization.json.C1859c;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class th2 implements KSerializer {

                /* JADX INFO: renamed from: b */
                public static final th2 f17109b = new th2();

                /* JADX INFO: renamed from: a */
                public final C0950gd f17110a;

                public th2() {
/* 3 */             j13.m5659u(rh2.f16075a);
/* 17 */            this.f17110a = new C0950gd(vh2.f18183a, 0);
                }

                @Override // kotlinx.serialization.KSerializer
                public final Object deserialize(Decoder decoder) {
/* 1 */             j11 j11VarM5746f = jb1.m5746f(decoder);
/* 5 */             AbstractC1858b abstractC1858bMo5635m = j11VarM5746f.mo5635m();
/* 9 */             b11 b11VarMo5634d = j11VarM5746f.mo5634d();
/* 13 */            abstractC1858bMo5635m.getClass();
/* 18 */            if (!(abstractC1858bMo5635m instanceof C1857a)) {
/* 26 */                abstractC1858bMo5635m = new C1857a(C1839a.m6210b(abstractC1858bMo5635m));
                    }
/* 30 */            b11VarMo5634d.getClass();
/* 33 */            C0950gd c0950gd = this.f17110a;
/* 35 */            c0950gd.getClass();
/* 58 */            return (abstractC1858bMo5635m instanceof C1859c ? new e21(b11VarMo5634d, (C1859c) abstractC1858bMo5635m, null, null) : new f21(b11VarMo5634d, (C1857a) abstractC1858bMo5635m)).mo4375u(c0950gd);
                }

                @Override // kotlinx.serialization.KSerializer
                public final SerialDescriptor getDescriptor() {
/* 3 */             return this.f17110a.getDescriptor();
                }

                @Override // kotlinx.serialization.KSerializer
                public final void serialize(Encoder encoder, Object obj) {
/* 1 */             obj.getClass();
/* 4 */             p11 p11VarM5747g = jb1.m5747g(encoder);
/* 8 */             b11 b11VarMo1500d = p11VarM5747g.mo1500d();
/* 12 */            b11VarMo1500d.getClass();
/* 15 */            C0950gd c0950gd = this.f17110a;
/* 17 */            c0950gd.getClass();
/* 22 */            h22 h22Var = new h22();
/* 38 */            new c21(b11VarMo1500d, new C1983o(h22Var, 19), 1).mo1484A(c0950gd, obj);
/* 41 */            Object obj2 = h22Var.f8873a;
/* 43 */            if (obj2 != null) {
/* 47 */                p11VarM5747g.mo1519w((AbstractC1858b) obj2);
                    } else {
/* 53 */                Intrinsics.m6220e("result");
/* 57 */                throw null;
                    }
                }
            }
